/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Apache License v2.0 which accompanies this distribution,
 * and is available at http://www.apache.org/licenses/LICENSE-2.0 </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import Cpacs.CpacsFactory;
import Cpacs.StringUIDBaseType;

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
		return stringUID;
	}
}
