/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.fuselage;

import Cpacs.CpacsFactory;
import Cpacs.FuselageElementType;
import Cpacs.FuselageSegmentType;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringExtensions;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringUIDExtensions;

/**
 * @author Marc.Engelmann
 * @since 23.04.2020
 *
 */
public interface FuselageSegmentExtensions {

	/**
	 * @param fromElement
	 * @param toElement
	 * @return
	 */
	static FuselageSegmentType init(String fuselageUID, FuselageElementType fromElement,
			FuselageElementType toElement) {

		String name = fuselageUID + "_segment_from_" + fromElement.getUID() + "_to_" + toElement.getUID();

		FuselageSegmentType segment = CpacsFactory.eINSTANCE.createFuselageSegmentType();
		segment.setUID(name);
		segment.setName(StringExtensions.init(name));
		segment.setDescription(StringExtensions.init(name));
		segment.setFromElementUID(StringUIDExtensions.init(fromElement.getUID(), true));
		segment.setToElementUID(StringUIDExtensions.init(toElement.getUID(), true));

		return segment;
	}
}
