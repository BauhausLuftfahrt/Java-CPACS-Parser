/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.common;

import Cpacs.CpacsFactory;
import Cpacs.RefTypeType;
import Cpacs.TransformationType;
import net.bhl.opensource.cpacs.model.extensions.basetype.DoubleExtensions;

/**
 * @author Marc.Engelmann
 * @since 23.04.2020
 *
 */
public interface TransformationExtensions {

	/**
	 * @param referenceType
	 * @param parentUID
	 * @return
	 */
	static TransformationType init(RefTypeType referenceType, String parentUID) {

		TransformationType transformer = CpacsFactory.eINSTANCE.createTransformationType();

		String transformationUID = parentUID + "_transformation";

		transformer.setUID(transformationUID);

		transformer.setScaling(CpacsFactory.eINSTANCE.createPointType());
		transformer.getScaling().setUID(transformationUID + "_scaling");
		transformer.getScaling().setX(DoubleExtensions.init(1));
		transformer.getScaling().setY(DoubleExtensions.init(1));
		transformer.getScaling().setZ(DoubleExtensions.init(1));

		transformer.setRotation(CpacsFactory.eINSTANCE.createPointType());
		transformer.getRotation().setUID(transformationUID + "_rotation");
		transformer.getRotation().setX(DoubleExtensions.init(0));
		transformer.getRotation().setY(DoubleExtensions.init(0));
		transformer.getRotation().setZ(DoubleExtensions.init(0));

		transformer.setTranslation(CpacsFactory.eINSTANCE.createPointAbsRelType());
		transformer.getTranslation().setRefType(referenceType);
		transformer.getTranslation().setUID(transformationUID + "_translation");
		transformer.getTranslation().setX(DoubleExtensions.init(0));
		transformer.getTranslation().setY(DoubleExtensions.init(0));
		transformer.getTranslation().setZ(DoubleExtensions.init(0));

		return transformer;

	}

	/**
	 * @return
	 */
	static TransformationType initGlobal(String parentUID) {
		return init(RefTypeType.ABS_GLOBAL, parentUID);
	}
}
