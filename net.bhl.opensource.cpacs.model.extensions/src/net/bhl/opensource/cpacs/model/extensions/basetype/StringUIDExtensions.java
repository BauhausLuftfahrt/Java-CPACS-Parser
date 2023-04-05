/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import Cpacs.CpacsFactory;
import Cpacs.StringUIDBaseType;
import Cpacs.SymmetryType1;

/**
 * @author Marc.Engelmann
 * @since 23.04.2020
 *
 */
public interface StringUIDExtensions {

	static StringUIDBaseType init(String value, boolean isLink) {

		StringUIDBaseType stringUID = CpacsFactory.eINSTANCE.createStringUIDBaseType();
		stringUID.setValue(value);
		stringUID.setIsLink(isLink ? "True" : "False");
		stringUID.setSymmetry(SymmetryType1.FULL);
		return stringUID;
	}
}
