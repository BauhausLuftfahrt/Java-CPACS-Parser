/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import java.util.ArrayList;
import java.util.List;

import Cpacs.CpacsFactory;
import Cpacs.StringVectorBaseType;

/**
 * @author Marc.Engelmann
 * @since 03.12.2019
 *
 */
public interface StringVectorExtensions {

	String STRING_VECTOR_DELIMITER = ";";
	String STRING_VECTOR_DELIMITER_ALT = " ";

	/**
	 * @param vector
	 * @return
	 */
	static StringVectorBaseType init(List<Double> vector) {

		String content = new String();

		for (Double val : vector) {
			content += val + StringVectorExtensions.STRING_VECTOR_DELIMITER;
		}

		return StringVectorExtensions.init(content.substring(0, content.length() - 1));
	}

	/**
	 * @param content
	 * @return
	 */
	static StringVectorBaseType init(String content) {
		StringVectorBaseType stringVectorType = CpacsFactory.eINSTANCE.createStringVectorBaseType();
		stringVectorType.setValue(content);
		stringVectorType.setMapType("vector");
		return stringVectorType;
	}

	/**
	 * @param str
	 * @return
	 */
	static List<Double> toDoubleList(StringVectorBaseType baseType) {

		List<Double> values = new ArrayList<>();

		// Split the string by semicolon or space, depending on existence of a semicolon
		// in the string itself.

		for (String element : baseType.getValue()
				.split(baseType.getValue().contains(";") ? StringVectorExtensions.STRING_VECTOR_DELIMITER
						: StringVectorExtensions.STRING_VECTOR_DELIMITER_ALT)) {
			values.add(Double.parseDouble(element));
		}

		return values;
	}
}
