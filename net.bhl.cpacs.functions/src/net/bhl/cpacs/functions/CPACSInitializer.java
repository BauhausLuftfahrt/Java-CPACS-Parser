/*******************************************************************************
 * <copyright>
 * This software  was developed at Bauhaus Luftfahrt e.V. by Marc Engelmann
 *
 * http://www.bauhaus-luftfahrt.net
 *
 * All rights reserved. Copyright (C) 2014-2021.
 *
 * Permission is hereby granted, free of charge, to use and/or copy this software
 * for non-commercial research and education purposes if the authors of this
 * software and their research papers are properly cited.
 *
 * Further rights are not granted. Contact us if you need another license or
 * specific rights.
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * </copyright>
 ***************************************************************************************/
package net.bhl.cpacs.functions;

import java.io.File;
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
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Cpacs.CpacsFactory;
import Cpacs.CpacsPackage;
import Cpacs.CpacsType;
import Cpacs.DateTimeBaseType;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

/**
 * This class loads a XML file and turns it into an EOBJECT.
 *
 * @author Marc.Engelmann
 * @since 19.11.2019
 *
 */
public interface CPACSInitializer {

	/**
	 * Run the main function
	 *
	 * @param file
	 * @return
	 */
	static CpacsType run(File file) {

		// Initialize the cpacs object
		CpacsType cpacs = CpacsFactory.eINSTANCE.createCpacsType();

		try {

			// Load the XML structure into a node
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
			XPathExpression expression = XPathFactory.newInstance().newXPath().compile("cpacs");
			NodeList nodeList = (NodeList) expression.evaluate(doc, XPathConstants.NODESET);

			// Loop through the node
			readNode(cpacs, nodeList.item(0));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cpacs;
	}

	/**
	 * Initialize all CPACS elements
	 *
	 * @param object
	 * @param superObject
	 */
	static void readNode(EObject object, Node superNode) {

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

					// If not, this means that there is a string in the XML file which is not
					// part of the CPACS schema.
					System.out.println(
							"Foreign element detected: " + superNode.getNodeName() + " -> " + node.getNodeName());
					continue;
				}

				// Check if the lowest (local!) level has been reached.
				if (getNumberOfElements(node) == 0) {

					// If so, apply the base type
					tryBaseType(object, node.getTextContent(), feature);

				} else {

					// Initialize an object corresponding to the class name
					EObject newValue = CpacsPackage.eINSTANCE.getEFactoryInstance()
							.create((EClass) CpacsPackage.eINSTANCE.getEClassifier(feature.getEType().getName()));

					// Initiate all child content
					readNode(newValue, node);

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
		if (EClass.class.isInstance(CpacsPackage.eINSTANCE.getEClassifier(eClass))) {

			// Create an EObject
			EObject baseTypeObject = CpacsPackage.eINSTANCE.getEFactoryInstance()
					.create((EClass) CpacsPackage.eINSTANCE.getEClassifier(eClass));

			// Apply value to base types
			if (baseTypeObject instanceof StringBaseType) {
				((StringBaseType) baseTypeObject).setValue(textContent);

			} else if (baseTypeObject instanceof IntegerBaseType) {
				((IntegerBaseType) baseTypeObject).setValue(BigInteger.valueOf((long) Double.parseDouble(textContent)));

			} else if (baseTypeObject instanceof DoubleBaseType) {
				((DoubleBaseType) baseTypeObject).setValue(Double.parseDouble(textContent));

			} else if (baseTypeObject instanceof DateTimeBaseType) {
				((DateTimeBaseType) baseTypeObject).setValue(getXMLGregorianCalendar(textContent));

			} else if (baseTypeObject instanceof StringUIDBaseType) {
				((StringUIDBaseType) baseTypeObject).setValue(textContent);

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
			System.err.println("CPACSInitializer: Unknown basetype at " + feature.getName() + " -> " + textContent);
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
