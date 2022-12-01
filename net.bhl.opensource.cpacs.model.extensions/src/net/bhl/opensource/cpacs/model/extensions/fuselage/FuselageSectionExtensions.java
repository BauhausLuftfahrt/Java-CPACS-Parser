/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.fuselage;

import Cpacs.CpacsFactory;
import Cpacs.FuselageElementType;
import Cpacs.FuselageSectionType;
import Cpacs.ProfileGeometryType;
import net.bhl.opensource.cpacs.model.extensions.basetype.DoubleExtensions;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringExtensions;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringUIDExtensions;
import net.bhl.opensource.cpacs.model.extensions.common.TransformationExtensions;

/**
 * @author Marc.Engelmann
 * @since 23.04.2020
 *
 */
public interface FuselageSectionExtensions {

	/**
	 * @param fuselageWidth
	 * @param fuselageHeight
	 * @param profile
	 * @param z
	 * @param customID
	 * @return
	 */
	static FuselageSectionType init(String fuselageUID, double fuselageWidth, double fuselageHeight,
			ProfileGeometryType profile, double z, int index) {

		FuselageSectionType section = CpacsFactory.eINSTANCE.createFuselageSectionType();

		String sectionName = fuselageUID + "_section_" + index;
		String sectionElementSuffix = "_element_1";

		section.setUID(sectionName);
		section.setName(StringExtensions.init(sectionName));
		section.setDescription(StringExtensions.init(sectionName));
		section.setElements(CpacsFactory.eINSTANCE.createFuselageElementsType());
		section.setTransformation(TransformationExtensions.initGlobal(section.getUID()));

		FuselageElementType sectionElement = CpacsFactory.eINSTANCE.createFuselageElementType();
		section.getElements().getElement().add(sectionElement);
		sectionElement.setName(StringExtensions.init(sectionName + sectionElementSuffix));
		sectionElement.setDescription(StringExtensions.init(sectionName + sectionElementSuffix));
		sectionElement.setUID(sectionName + sectionElementSuffix);
		sectionElement.setProfileUID(StringUIDExtensions.init(profile.getUID(), true));
		sectionElement.setTransformation(TransformationExtensions.initGlobal(sectionElement.getUID()));

		sectionElement.getTransformation().getScaling().setY(DoubleExtensions.init(fuselageWidth / 2.0));
		sectionElement.getTransformation().getScaling().setZ(DoubleExtensions.init(fuselageHeight / 2.0));
		sectionElement.getTransformation().getTranslation().setZ(DoubleExtensions.init(z));

		return section;
	}
}
