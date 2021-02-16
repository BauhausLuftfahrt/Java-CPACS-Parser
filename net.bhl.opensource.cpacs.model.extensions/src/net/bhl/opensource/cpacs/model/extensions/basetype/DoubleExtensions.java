/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Apache License v2.0 which accompanies this distribution,
 * and is available at http://www.apache.org/licenses/LICENSE-2.0 </copyright>
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
