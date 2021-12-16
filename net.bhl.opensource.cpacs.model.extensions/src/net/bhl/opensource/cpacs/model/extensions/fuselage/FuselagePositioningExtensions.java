/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.fuselage;

import java.util.Optional;

import Cpacs.CpacsFactory;
import Cpacs.FuselageSectionType;
import Cpacs.PositioningType;
import net.bhl.opensource.cpacs.model.extensions.basetype.DoubleExtensions;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringExtensions;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringUIDExtensions;

/**
 * @author Marc.Engelmann
 * @since 23.04.2020
 *
 */
public interface FuselagePositioningExtensions {

	/**
	 * @param length
	 * @param fromSection
	 * @param toSection
	 * @return
	 */
	static PositioningType init(String fuselageUID, double length, Optional<FuselageSectionType> fromSection,
			FuselageSectionType toSection) {

		String name = fuselageUID + "_positioning_from_"
				+ (fromSection.isPresent() ? fromSection.get().getUID() : "origin") + "_to_" + toSection.getUID();

		PositioningType positioning = CpacsFactory.eINSTANCE.createPositioningType();
		positioning.setUID(name);
		positioning.setName(StringExtensions.init(name));
		positioning.setLength(DoubleExtensions.init(length));
		positioning.setSweepAngle(DoubleExtensions.init(90));
		positioning.setDihedralAngle(DoubleExtensions.init(0));

		fromSection.ifPresent(from -> positioning.setFromSectionUID(StringUIDExtensions.init(from.getUID(), true)));

		positioning.setToSectionUID(StringUIDExtensions.init(toSection.getUID(), true));

		return positioning;
	}
}
