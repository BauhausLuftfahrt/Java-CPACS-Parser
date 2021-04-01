/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import java.math.BigInteger;

import Cpacs.CpacsFactory;
import Cpacs.IntegerBaseType;

/**
 * @author Marc.Engelmann
 * @since 25.11.2019
 *
 */
public interface IntegerExtensions {

	/**
	 * @param content
	 * @return
	 */
	static IntegerBaseType init(int content) {
		IntegerBaseType intType = CpacsFactory.eINSTANCE.createIntegerBaseType();
		intType.setValue(BigInteger.valueOf(content));
		return intType;
	}

}
