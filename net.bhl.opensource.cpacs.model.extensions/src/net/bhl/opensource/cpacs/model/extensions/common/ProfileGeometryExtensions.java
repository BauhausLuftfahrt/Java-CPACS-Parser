/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.common;

import Cpacs.CpacsFactory;
import Cpacs.ProfileGeometryType;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringExtensions;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringVectorExtensions;

/**
 * @author Marc.Engelmann
 * @since 23.04.2020
 *
 */
public interface ProfileGeometryExtensions {

	int CIRCULAR_DATA_POINT_SIZE = 80;
	char SPLITTER_LITERAL = ';';
	int DIGITS = 10;

	/**
	 * @return
	 */
	static ProfileGeometryType getCircularProfile() {

		ProfileGeometryType circularProfile = CpacsFactory.eINSTANCE.createProfileGeometryType();

		circularProfile.setName(StringExtensions.init("Circle Profile"));
		circularProfile.setUID("circle");
		circularProfile.setDescription(StringExtensions.init("Profile created with CAFE"));
		circularProfile.setPointList(CpacsFactory.eINSTANCE.createCurvePointListXYZType());

		String xValues = "";
		String yValues = "";
		String zValues = "";

		for (int i = 0; i <= CIRCULAR_DATA_POINT_SIZE; i++) {

			xValues += " 0.0";
			yValues += " " + String
					.valueOf(Math.round(Math.cos(2.0 * Math.PI * i / CIRCULAR_DATA_POINT_SIZE) * Math.pow(10.0, DIGITS))
							/ Math.pow(10.0, DIGITS));
			zValues += " " + String
					.valueOf(Math.round(Math.sin(2.0 * Math.PI * i / CIRCULAR_DATA_POINT_SIZE) * Math.pow(10.0, DIGITS))
							/ Math.pow(10.0, DIGITS));

			if (i != CIRCULAR_DATA_POINT_SIZE) {
				xValues += SPLITTER_LITERAL;
				yValues += SPLITTER_LITERAL;
				zValues += SPLITTER_LITERAL;
			}
		}

		circularProfile.getPointList().setX(StringVectorExtensions.init(xValues));
		circularProfile.getPointList().setY(StringVectorExtensions.init(yValues));
		circularProfile.getPointList().setZ(StringVectorExtensions.init(zValues));

		return circularProfile;
	}
}
