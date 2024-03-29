/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import java.math.BigInteger;

import Cpacs.IntegerBaseType;
import Cpacs.PosExcl0IntBaseType;
import Cpacs.CpacsFactory;

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

	static PosExcl0IntBaseType initPosExcl0(int content) {
		PosExcl0IntBaseType intType = CpacsFactory.eINSTANCE.createPosExcl0IntBaseType();
		intType.setValue(BigInteger.valueOf(content));
		return intType;
	}
}
