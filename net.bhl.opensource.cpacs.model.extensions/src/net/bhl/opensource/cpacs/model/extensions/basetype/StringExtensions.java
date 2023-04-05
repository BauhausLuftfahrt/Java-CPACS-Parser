/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import Cpacs.CpacsFactory;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.SymmetryType1;

/**
 * @author Marc.Engelmann
 * @since 25.11.2019
 *
 */
public interface StringExtensions {

	/**
	 * @param content
	 * @return
	 */
	static StringBaseType init(String content) {
		StringBaseType stringType = CpacsFactory.eINSTANCE.createStringBaseType();
		stringType.setValue(content);
		return stringType;
	}

	/**
	 * @param content
	 * @return
	 */
	static StringUIDBaseType initUID(String content) {
		StringUIDBaseType stringType = CpacsFactory.eINSTANCE.createStringUIDBaseType();
		stringType.setValue(content);
		stringType.setSymmetry(SymmetryType1.FULL);
		return stringType;
	}
}
