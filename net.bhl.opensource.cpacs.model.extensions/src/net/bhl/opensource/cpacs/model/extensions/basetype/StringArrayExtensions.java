/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import java.util.ArrayList;
import java.util.List;

import Cpacs.CpacsFactory;
import Cpacs.StringArrayBaseType;

/**
 * @author Marc.Engelmann
 * @since 03.12.2019
 *
 */
public interface StringArrayExtensions {

	String STRING_ARRAY_DELIMITER = ";";

	/**
	 * @param vector
	 * @return
	 */
	static StringArrayBaseType init(List<Double> vector) {

		String content = new String();

		for (Double val : vector) {
			content += val + StringArrayExtensions.STRING_ARRAY_DELIMITER;
		}

		return StringArrayExtensions.init(content.substring(0, content.length() - 1));
	}

	/**
	 * @param content
	 * @return
	 */
	static StringArrayBaseType init(String content) {
		StringArrayBaseType stringArrayType = CpacsFactory.eINSTANCE.createStringArrayBaseType();
		stringArrayType.setValue(content);
		stringArrayType.setMapType("vector");
		return stringArrayType;
	}

	/**
	 * @param str
	 * @return
	 */
	static List<Double> toDoubleList(StringArrayBaseType baseType) {

		List<Double> values = new ArrayList<>();

		for (String element : baseType.getValue().split(StringArrayExtensions.STRING_ARRAY_DELIMITER)) {
			values.add(Double.parseDouble(element));
		}

		return values;
	}
}
