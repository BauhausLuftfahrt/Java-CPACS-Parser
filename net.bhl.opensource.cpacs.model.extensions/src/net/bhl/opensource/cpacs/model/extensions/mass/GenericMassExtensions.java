/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.mass;

import Cpacs.CpacsFactory;
import Cpacs.GenericMassType;
import net.bhl.opensource.cpacs.model.extensions.basetype.DoubleExtensions;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringUIDExtensions;

/**
 * @author Marc.Engelmann
 * @since 02.06.2020
 *
 */
public interface GenericMassExtensions {

	/**
	 * @param mass
	 * @return
	 */
	static GenericMassType init(double mass) {
		return init(mass, 0, 0, 0, null, 0, 0, 0);
	}

	/**
	 * @param mass
	 * @param location
	 * @return
	 */
	static GenericMassType init(double mass, double xLocation, double yLocation, double zLocation, String uID,
			String parentUID, double xTranslation, double yTranslation, double zTranslation) {

		GenericMassType genericMassType = CpacsFactory.eINSTANCE.createGenericMassType();
		genericMassType.setMass(DoubleExtensions.init(mass));

		genericMassType.setLocation(CpacsFactory.eINSTANCE.createPointType());
		genericMassType.getLocation().setX(DoubleExtensions.init(xLocation + xTranslation));
		genericMassType.getLocation().setY(DoubleExtensions.init(yLocation + yTranslation));
		genericMassType.getLocation().setZ(DoubleExtensions.init(zLocation + zTranslation));

		if (uID != null) {
			genericMassType.setUID(uID);
		}

		if (parentUID != null) {
			genericMassType.setParentUID(StringUIDExtensions.init(parentUID, false));
		}

//		genericMassType.setMassInertia(CpacsFactory.eINSTANCE.createMassInertiaType());
//		genericMassType.getMassInertia().setJxx(DoubleExtensions.init(0));
//		genericMassType.getMassInertia().setJyy(DoubleExtensions.init(0));
//		genericMassType.getMassInertia().setJzz(DoubleExtensions.init(0));
//		genericMassType.getMassInertia().setJxy(DoubleExtensions.init(0));
//		genericMassType.getMassInertia().setJxz(DoubleExtensions.init(0));
//		genericMassType.getMassInertia().setJyz(DoubleExtensions.init(0));

		return genericMassType;
	}

	/**
	 * @param mass
	 * @param location
	 * @return
	 */
	static GenericMassType init(double mass, double xLocation, double yLocation, double zLocation, String parentUID,
			double xTranslation, double yTranslation, double zTranslation) {
		return init(mass, xLocation, yLocation, zLocation, null, parentUID, xTranslation, yTranslation, zTranslation);

	}
}
