/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Apache License v1.0 which accompanies this distribution,
 * and is available at http://www.apache.org/licenses/LICENSE-2.0 </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.functions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Cpacs.CpacsType;
import Cpacs.DateTimeBaseType;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

/**
 * Loop through an ECORE model of the CPACS file schema and write it to an XML
 * file.
 *
 * @author Marc.Engelmann
 * @since 15.11.2019
 *
 */
public interface CPACSWriter {

	boolean SHOW_DOUBLE_ATTRIBUTES = false;
	int MAXIMUM_DOUBLE_VALUE_DIGITS = 6;

	List<String> BLOCKED_ATTRIBUTES_LIST = Arrays.asList("uncertaintyFunctionName", "a", "mu", "b", "c", "delta", "v",
			"w");

	/**
	 * Loop through a CPACS object and save it as an XML file.
	 *
	 * @param filePath the file path where the XML file should be saved.
	 * @param cpacs    the CPACS object being saved
	 */
	static void run(String filePath, CpacsType cpacs) {

		try {

			// Create a new document
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			doc.setXmlStandalone(true);

			// Create root cpacs element
			Element rootElement = doc.createElement("cpacs");
			doc.appendChild(rootElement);

			// Write all sub content of the element
			writeContent(doc, cpacs, rootElement);

			// Transform it to XML
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

			transformer.transform(new DOMSource(doc), new StreamResult(new File(filePath)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Loop through a given eObject, loop through all children and write the
	 * contents to the XML file.
	 *
	 * @param doc
	 * @param eObj
	 * @param element
	 */
	static void writeContent(Document doc, EObject eObj, Element element) {

		List<EStructuralFeature> featureList = new ArrayList<>();
		featureList.addAll(eObj.eClass().getEStructuralFeatures());

		if (eObj.eClass().getEAllSuperTypes().size() > 0) {
			for (EClass superClass : eObj.eClass().getEAllSuperTypes()) {
				featureList.addAll(superClass.getEStructuralFeatures());
			}
		}

		// Loop through all features of the object
		featureloop: for (EStructuralFeature feature : featureList) {

			// if the feature is not set, ignore it
			if (eObj.eGet(feature) == null || !eObj.eIsSet(feature)) {
				continue;
			}

			// If the feature is an attribute in the CPACS schema, apply it as such.
			if (applyAsAttribute(feature, element, eObj)) {
				continue featureloop;
			}

			// Check if it is a feature map
			if (eObj.eGet(feature) instanceof FeatureMap) {

				// If so,loop through all objects
				for (Entry entry : (FeatureMap) eObj.eGet(feature)) {

					// Create sub element
					Element subElement = doc.createElement(entry.getEStructuralFeature().getName());

					// Depending on type of list elements, apply content
					if (entry.getValue() instanceof EObject) {
						writeContent(doc, (EObject) entry.getValue(), subElement);
					} else {
						subElement.setTextContent(entry.getValue().toString());
					}

					// Append element
					element.appendChild(subElement);
				}

			} else if (eObj.eGet(feature) instanceof EObject) {
				// Check if the feature is an EOBJECT itself

				// Create a sub element
				Element subElement = doc.createElement(feature.getName());

				// Check if it is a base type
				if (((EObject) eObj.eGet(feature)).eClass().getEStructuralFeature("value") != null) {

					// If so, apply the value to the element
					setTextContent(subElement, eObj.eGet(feature));

					// Then apply the attribute values to the element
					for (EStructuralFeature baseObjectFeature : ((EObject) eObj.eGet(feature)).eClass()
							.getEStructuralFeatures()) {

						applyAsAttribute(baseObjectFeature, subElement, (EObject) eObj.eGet(feature));
					}

				} else {
					// If not, go one level deeper
					writeContent(doc, (EObject) eObj.eGet(feature), subElement);
				}

				// Append the sub element
				element.appendChild(subElement);

				// check if the feature is a list of objects
			} else if (eObj.eGet(feature) instanceof List<?>) {

				// If so,loop through all objects
				for (Object obj : (List<?>) eObj.eGet(feature)) {

					// Create sub element
					Element subElement = doc.createElement(feature.getName());

					// Depending on type of list elements, apply content
					if (obj instanceof EObject) {
						writeContent(doc, (EObject) obj, subElement);
					} else {
						subElement.setTextContent(obj.toString());
					}

					// Append element
					element.appendChild(subElement);
				}

			} else {

				// If no specific action is required, apply the text content directly.
				Element subElement = doc.createElement(feature.getName());
				subElement.setTextContent(eObj.eGet(feature).toString());

				// Append element
				element.appendChild(subElement);
			}
		}
	}

	/**
	 * @param feature
	 * @param element
	 * @param eObj
	 * @return
	 */
	static boolean applyAsAttribute(EStructuralFeature feature, Element element, EObject eObj) {

		if (eObj == null || feature == null || element == null) {
			return false;
		}

		if (eObj.eGet(feature) == null) {
			return false;
		}

		for (EAnnotation annotation : feature.getEAnnotations()) {

			if (annotation.getDetails().get("kind").contentEquals("attribute")) {

				if (!BLOCKED_ATTRIBUTES_LIST.contains(feature.getName())) {
					element.setAttribute(feature.getName(), eObj.eGet(feature).toString());
				}

				return true;
			}
		}

		return false;
	}

	/**
	 * Turn the four base types into a string object
	 *
	 * @param obj
	 */
	static void setTextContent(Element element, Object obj) {

		if (obj instanceof StringBaseType) {
			element.setTextContent(((StringBaseType) obj).getValue());

		} else if (obj instanceof DateTimeBaseType) {
			element.setTextContent(((DateTimeBaseType) obj).getValue().toXMLFormat());

		} else if (obj instanceof DoubleBaseType) {
			element.setTextContent(
					String.valueOf(round(((DoubleBaseType) obj).getValue(), MAXIMUM_DOUBLE_VALUE_DIGITS)));

		} else if (obj instanceof IntegerBaseType) {
			element.setTextContent(String.valueOf(((IntegerBaseType) obj).getValue()));

		} else if (obj instanceof StringUIDBaseType) {
			element.setTextContent(String.valueOf(((StringUIDBaseType) obj).getValue()));

		} else if (obj instanceof StringVectorBaseType) {
			element.setTextContent(String.valueOf(((StringVectorBaseType) obj).getValue()));

		} else {
			element.setTextContent(obj.toString());
		}
	}

	/**
	 * @param value
	 * @param digits
	 * @return
	 */
	static double round(double value, int digits) {
		return Math.round(value * Math.pow(10.0, digits)) / Math.pow(10.0, digits);
	}
}
