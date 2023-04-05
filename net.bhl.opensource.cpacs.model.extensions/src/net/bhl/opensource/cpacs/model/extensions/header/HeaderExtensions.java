/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.header;

import Cpacs.HeaderType;
import Cpacs.CpacsFactory;
import Cpacs.VersionInfoType;
import net.bhl.opensource.cpacs.model.extensions.basetype.DateTimeExtensions;
import net.bhl.opensource.cpacs.model.extensions.basetype.StringExtensions;

/**
 * @author Marc.Engelmann
 * @since 10.12.2019
 *
 */
public interface HeaderExtensions {

	/**
	 * @param name
	 * @param version
	 * @return
	 */
	static HeaderType init(String name, String version) {

		HeaderType header = CpacsFactory.eINSTANCE.createHeaderType();
		header.setName(StringExtensions.init(name));

		header.setVersion(version);
		header.setVersionInfos(CpacsFactory.eINSTANCE.createVersionInfosType());

		VersionInfoType versionInfo = CpacsFactory.eINSTANCE.createVersionInfoType();
		header.getVersionInfos().getVersionInfo().add(versionInfo);

		versionInfo.setVersion(version);
		versionInfo.setCpacsVersion("3.4");
		versionInfo.setCreator(StringExtensions.init(System.getProperty("user.name").replace(".", " ")));
		versionInfo.setTimestamp(DateTimeExtensions.initNow());
		versionInfo.setDescription(StringExtensions.init(name));

		return header;
	}

//	/**
//	 * @param updateName
//	 * @return
//	 */
//	static void addVersionInfo(CpacsType cpacs, String updateName) {
//
//		if (cpacs.getHeader() == null) {
//			cpacs.setHeader(init("CPACS created with Java CPACS Parser by Bauhaus Luftfahrt e.V.", 1.0));
//		}
//
//		if (cpacs.getHeader().getUpdates() == null) {
//			cpacs.getHeader().setUpdates(CpacsFactory.eINSTANCE.createUpdatesType());
//		}
//
//		UpdateType update = CpacsFactory.eINSTANCE.createUpdateType();
//		update.setModification(StringExtensions.init(updateName));
//		update.setCreator(StringExtensions.init(System.getProperty("user.name").replace(".", " ")));
//		update.setTimestamp(DateTimeExtensions.initNow());
//		update.setVersion(StringExtensions.init(String.valueOf(1.0)));
//
//		cpacs.getHeader().getUpdates().getUpdate().add(update);
//	}
}
