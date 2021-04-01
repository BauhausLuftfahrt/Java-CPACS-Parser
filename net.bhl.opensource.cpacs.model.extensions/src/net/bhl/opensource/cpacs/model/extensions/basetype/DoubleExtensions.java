/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import Cpacs.CpacsFactory;
import Cpacs.DoubleBaseType;

/**
 * @author Marc.Engelmann
 * @since 25.11.2019
 *
 */
public interface DoubleExtensions {

	/**
	 * @param content
	 * @return
	 */
	static DoubleBaseType init(double content) {
		DoubleBaseType doubleType = CpacsFactory.eINSTANCE.createDoubleBaseType();
		doubleType.setValue(content);
		return doubleType;
	}
}
