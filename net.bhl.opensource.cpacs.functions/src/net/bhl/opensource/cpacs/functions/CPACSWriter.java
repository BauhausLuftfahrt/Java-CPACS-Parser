/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.functions;

import java.io.File;
import java.io.StringWriter;
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
	List<String> BLOCKED_ATTRIBUTES_LIST = Arrays.asList("uncertaintyFunctionName", "a", "mu", "b", "c", "delta", "v",
			"w");

	/**
	 * Loop through a CPACS object and save it as an XML file.
	 *
	 * @param filePath the file path where the XML file should be saved.
	 * @param cpacs    the CPACS object being saved
	 */
	static void run(String filePath, CpacsType cpacs) {
		runTransformation(new StreamResult(new File(filePath)), cpacs);
	}

	/**
	 * Execute the cpacs object transformation
	 *
	 * @param result The stream result target
	 * @param cpacs  The cpacs element
	 */
	static void runTransformation(StreamResult result, CpacsType cpacs) {

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
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

			transformer.transform(new DOMSource(doc), result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Loop through a CPACS object and save it as a string.
	 *
	 * @param cpacs the CPACS object being saved
	 */
	static String toString(CpacsType cpacs) {

		StringWriter writer = new StringWriter();
		runTransformation(new StreamResult(writer), cpacs);

		return writer.getBuffer().toString();

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

					subElement.setAttribute("xmlns", ((EObject) entry.getValue()).eClass().getEPackage().getName());

					// Depending on type of list elements, apply content
					if (entry.getValue() instanceof EObject) {
						writeContent(doc, (EObject) entry.getValue(), subElement);
					} else {
						subElement.setTextContent(entry.getValue().toString());
					}

					// Append element
					element.appendChild(subElement);
				}

				// Check if the feature is an EOBJECT itself
			} else if (eObj.eGet(feature) instanceof EObject) {

				// Create a sub element
				Element subElement = doc.createElement(feature.getName());

				// Initialize the object
				EObject eObject = (EObject) eObj.eGet(feature);

				// Try to initialize a base object value
				EStructuralFeature valueFeature = eObject.eClass().getEStructuralFeature("value");

				// Check if it is a base type
				if (valueFeature != null) {

					if (eObject.eGet(valueFeature) == null) {
						continue;
					}

					// If so, apply the value to the element
					if (eObject.eGet(valueFeature) instanceof Double) {

						subElement.setTextContent(round((Double) eObject.eGet(valueFeature), 8).toString());
					} else {
						subElement.setTextContent(eObject.eGet(valueFeature).toString());
					}

					// Then apply the attribute values to the element
					for (EStructuralFeature baseObjectFeature : eObject.eClass().getEStructuralFeatures()) {

						applyAsAttribute(baseObjectFeature, subElement, eObject);
					}

				} else {
					// If not, go one level deeper
					writeContent(doc, eObject, subElement);
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

				if (feature.getName().contentEquals("isLink")) {
					if (eObj.eGet(feature).toString().contentEquals("True")) {
						return true;
					}
				}

				if (feature.getName().contentEquals("mapType")) {
					if (eObj.eGet(feature).toString().contentEquals("vector")) {
						return true;
					}
				}

				if (feature.getName().contentEquals("refType")) {
					if (eObj.eGet(feature).toString().contentEquals("absLocal")) {
						return true;
					}
				}

				if (feature.getName().contentEquals("symmetry")) {
					if (eObj.eGet(feature).toString().contentEquals("full")) {
						return true;
					}
				}

				if (!BLOCKED_ATTRIBUTES_LIST.contains(feature.getName())) {
					element.setAttribute(feature.getName(), eObj.eGet(feature).toString());
				}

				return true;
			}
		}

		return false;
	}

	static Double round(Double value, int digits) {
		return Math.round(value * Math.pow(10.0, digits)) / Math.pow(10.0, digits);
	}
}
