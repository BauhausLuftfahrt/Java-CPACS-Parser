/**
 *
 */
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
	static PositioningType init(double length, Optional<FuselageSectionType> fromSection,
			FuselageSectionType toSection) {

		String name = "fuselage_positioning_from_" + (fromSection.isPresent() ? fromSection.get().getUID() : "origin")
				+ "_to_" + toSection.getUID();

		if (name.contains("_nose_") && name.contains("_aft_")) {
			name = "fuselage_positioning_constant_section";
		}

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
