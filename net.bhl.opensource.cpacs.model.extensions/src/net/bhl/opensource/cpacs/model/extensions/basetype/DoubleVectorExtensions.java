/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import java.util.ArrayList;
import java.util.List;

import Cpacs.DoubleVectorBaseType;
import Cpacs.CpacsFactory;

/**
 * @author Marc.Engelmann
 * @since 03.12.2019
 *
 */
public interface DoubleVectorExtensions {

	String STRING_VECTOR_DELIMITER = ";";
	String STRING_VECTOR_DELIMITER_ALT = " ";

	/**
	 * @param vector
	 * @return
	 */
	static DoubleVectorBaseType init(List<Double> vector) {

		String content = new String();

		for (Double val : vector) {
			content += val + STRING_VECTOR_DELIMITER;
		}

		return init(content.substring(0, content.length() - 1));
	}

	/**
	 * @param content
	 * @return
	 */
	static DoubleVectorBaseType init(String content) {
		DoubleVectorBaseType stringVectorType = CpacsFactory.eINSTANCE.createDoubleVectorBaseType();
		stringVectorType.setValue(content);
		stringVectorType.setMapType("vector");
		return stringVectorType;
	}

	/**
	 * @param str
	 * @return
	 */
	static List<Double> toDoubleList(DoubleVectorBaseType baseType) {

		List<Double> values = new ArrayList<>();

		// Split the string by semicolon or space, depending on existence of a semicolon
		// in the string itself.

		for (String element : baseType.getValue()
				.split(baseType.getValue().contains(";") ? STRING_VECTOR_DELIMITER : STRING_VECTOR_DELIMITER_ALT)) {
			values.add(Double.parseDouble(element));
		}

		return values;
	}
}
