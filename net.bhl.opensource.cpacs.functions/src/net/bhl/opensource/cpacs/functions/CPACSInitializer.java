/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.functions;

import java.io.File;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.Collection;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import Cpacs.CpacsFactory;
import Cpacs.CpacsType;

/**
 * This class loads a XML file and turns it into an EOBJECT.
 *
 * @author Marc.Engelmann
 * @since 19.11.2019
 *
 */
public interface CPACSInitializer {

	/**
	 * Run the main function with toolspecific node included
	 *
	 * @param file
	 * @return
	 */
	static CpacsType runWithToolspecific(File file, EObject toolspecific) {

		// Initialize the CPACS object
		CpacsType cpacs = CpacsFactory.eINSTANCE.createCpacsType();

		try {

			// Load the XML structure into a node
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
			XPathExpression expression = XPathFactory.newInstance().newXPath().compile("cpacs");
			NodeList nodeList = (NodeList) expression.evaluate(doc, XPathConstants.NODESET);

			// Loop through the node
			readNode(cpacs, nodeList.item(0), toolspecific);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cpacs;
	}

	static EObject initFromString(EObject parentObject, String parentName, String content) {

		try {

			// Load the XML structure into a node

			InputSource inputSource = new InputSource(new StringReader(content));
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);
			XPathExpression expression = XPathFactory.newInstance().newXPath().compile(parentName);
			NodeList nodeList = (NodeList) expression.evaluate(doc, XPathConstants.NODESET);

			// Loop through the node
			readNode(parentObject, nodeList.item(0), null);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return parentObject;

	}

	/**
	 * Run the main function
	 *
	 * @param file
	 * @return
	 */
	static CpacsType run(File file) {
		return runWithToolspecific(file, null);
	}

	/**
	 * Initialize all CPACS elements
	 *
	 * @param object
	 * @param superObject
	 */
	static void readNode(EObject object, Node superNode, EObject toolspecific) {

		// Loop through all attributes of top level node
		for (int i = 0; i < superNode.getAttributes().getLength(); i++) {

			// Load the attribute
			Attr attribute = (Attr) superNode.getAttributes().item(i);

			// Check if it is not empty
			if (!attribute.getNodeValue().isEmpty()) {

				// Load the object feature corresponding to the node.
				EStructuralFeature feature = object.eClass().getEStructuralFeature(attribute.getNodeName());

				// Check if the feature exists.
				if (feature == null) {

					// If not, this means that there is a string in the XML file which is not
					// part of the CPACS schema.
					System.out.println("Foreign attribute detected: " + superNode.getNodeName() + " -> "
							+ attribute.getNodeName());
					continue;
				}

				// Try to apply the value for the
				tryBaseType(object, attribute.getNodeValue(), feature);
			}
		}

		// Loop through all child nodes
		for (int i = 0; i < superNode.getChildNodes().getLength(); i++) {

			// Check if the child node is an element
			if (superNode.getChildNodes().item(i) instanceof Element) {

				// Get the child node
				Node node = superNode.getChildNodes().item(i);

				// Load the object feature corresponding to the node.
				EStructuralFeature feature = object.eClass().getEStructuralFeature(node.getNodeName());

				// Check if the feature exists
				if (feature == null) {

					// Check if a search for tool specific node should be made
					if (toolspecific != null) {

						// Get the any feature from the tool specific node
						EStructuralFeature anyFeature = object.eClass().getEStructuralFeature("any");

						// Get the top level feature of the tool specific object which matches the name
						EStructuralFeature toolspecificFeature = toolspecific.eClass()
								.getEStructuralFeature(node.getNodeName());

						if (toolspecificFeature != null) {

							// Initialize the value of the tool specific feature
							EObject newToolValue = toolspecific.eClass().getEPackage().getEFactoryInstance()
									.create((EClass) toolspecific.eClass().getEPackage()
											.getEClassifier(toolspecificFeature.getEType().getName()));

							// Add it to the feature map of the "any" node of the original object
							((FeatureMap) object.eGet(anyFeature)).add(toolspecificFeature, newToolValue);

							// Recursively parse the whole data structure of the tool specific
							readNode(newToolValue, node, toolspecificFeature);

							// If not, this means that there is a string in the XML file which is not
							// part of the CPACS schema.
							System.out.println("Tool specific match detected: " + superNode.getNodeName() + " -> "
									+ node.getNodeName());

						} else {

							// If not, this means that there is a string in the XML file which is not
							// part of the CPACS schema.
							System.out.println("Unknown tool specific element detected: " + superNode.getNodeName()
									+ " -> " + node.getNodeName());
						}

					} else {

						// If not, this means that there is a string in the XML file which is not
						// part of the CPACS schema.
						System.out.println(
								"Foreign element detected: " + superNode.getNodeName() + " -> " + node.getNodeName());
					}

					continue;
				}

				// Check if the lowest (local!) level has been reached.
				if (getNumberOfElements(node) == 0) {

					// If so, apply the base type
					tryBaseType(object, node.getTextContent(), feature);

				} else {

					// Initialize an object corresponding to the class name
					EObject newValue = object.eClass().getEPackage().getEFactoryInstance().create(
							(EClass) object.eClass().getEPackage().getEClassifier(feature.getEType().getName()));

					// Initiate all child content
					readNode(newValue, node, toolspecific);

					// Apply object to super object, depending on type of relation
					if (object.eGet(feature) instanceof Collection<?>) {
						((Collection<EObject>) object.eGet(feature)).add(newValue);

					} else {
						object.eSet(feature, newValue);
					}
				}
			}
		}
	}

	/**
	 * Try to apply a base type to a feature and load its content.
	 *
	 * @param parentObject
	 * @param textContent
	 * @param feature
	 */
	static void tryBaseType(EObject parentObject, String textContent, EStructuralFeature feature) {

		// Get the class name
		String eClass = feature.getEType().getName();

		// if it is a basic string object, just apply it.
		if (eClass.contentEquals("String") || eClass.contentEquals("ID")) {
			parentObject.eSet(feature, textContent);
			return;

		}

		// Try to apply one of the base types
		if (EClass.class.isInstance(parentObject.eClass().getEPackage().getEClassifier(eClass))) {

			// Create an EObject
			EObject baseTypeObject = parentObject.eClass().getEPackage().getEFactoryInstance()
					.create((EClass) parentObject.eClass().getEPackage().getEClassifier(eClass));

			// Get the value feature of the object
			EStructuralFeature valueFeature = baseTypeObject.eClass().getEStructuralFeature("value");

			if (valueFeature == null) {
				System.err.println("CPACSInitializer: Could not get value for " + baseTypeObject.eClass().getName()
						+ " in " + feature.getName());
				return;
			}

			// Get the class type of the value feature, hence determine the base type class
			Class<?> clazz = valueFeature.getEType().getInstanceClass();

			// Apply feature value depending on class type
			if (clazz.equals(double.class)) {
				baseTypeObject.eSet(valueFeature, Double.valueOf(textContent));

			} else if (clazz.equals(String.class)) {
				baseTypeObject.eSet(valueFeature, textContent);

			} else if (clazz.equals(BigInteger.class)) {
				baseTypeObject.eSet(valueFeature, BigInteger.valueOf((long) Double.parseDouble(textContent)));

			} else if (clazz.equals(XMLGregorianCalendar.class)) {
				baseTypeObject.eSet(valueFeature, getXMLGregorianCalendar(textContent));

			} else if (clazz.equals(boolean.class)) {

				baseTypeObject.eSet(valueFeature, Boolean.valueOf(textContent));
			} else {
				System.err.println("CPACSInitializer: Missing class in implementation: " + baseTypeObject.getClass());
			}

			// Then apply the EObject to the feature
			try {
				parentObject.eSet(feature, baseTypeObject);
			} catch (ClassCastException e) {
				System.err.println("CPACSInitializer: Could not cast to class for " + feature.getName());
			}

		} else if (feature.getEType() instanceof EEnum) {

			EEnum eenum = (EEnum) feature.getEType();
			EEnumLiteral eEnumLiteral = eenum.getEEnumLiteralByLiteral(textContent);

			if (eEnumLiteral == null) {
				System.err.println("CPACSInitializer: Could not initialize enum " + feature.getName());
			} else {
				parentObject.eSet(feature, eEnumLiteral.getInstance());
			}

		} else {

			if (feature.getEType().getInstanceClass().equals(double.class)) {

				parentObject.eSet(feature, Double.valueOf(textContent));

			} else if (feature.getEType().getInstanceClass().equals(int.class)) {

				parentObject.eSet(feature, Integer.valueOf(textContent));

			} else if (feature.getEType().getInstanceClass().equals(String.class)) {

				parentObject.eSet(feature, textContent);

			} else {
				System.err.println("CPACSInitializer: Unknown basetype at " + feature.getName() + " -> " + textContent);
			}
		}
	}

	/**
	 * Get the number of child nodes which are elements.
	 *
	 * @param node
	 * @return
	 */
	static int getNumberOfElements(Node node) {

		int counter = 0;

		for (int i = 0; i < node.getChildNodes().getLength(); i++) {
			if (node.getChildNodes().item(i) instanceof Element) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * Turn a string into a XMLGregorianCalendar calendar item
	 *
	 * @param dateString
	 * @return
	 */
	static XMLGregorianCalendar getXMLGregorianCalendar(String dateString) {

		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(dateString);

		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			return null;
		}
	}
}
