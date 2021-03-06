/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Apache License v2.0 which accompanies this distribution,
 * and is available at http://www.apache.org/licenses/LICENSE-2.0 </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.model.extensions.basetype;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import Cpacs.CpacsFactory;
import Cpacs.DateTimeBaseType;

/**
 * @author Marc.Engelmann
 * @since 27.11.2019
 *
 */
public interface DateTimeExtensions {

	/**
	 * Turn a string into a XMLGregorianCalendar calendar item
	 *
	 * @param dateString
	 * @return
	 */
	static XMLGregorianCalendar getXMLGregorianCalendarNow() {

		try {

			XMLGregorianCalendar xmlCalender = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(new GregorianCalendar());

			// This is a fix for TIGL Viewer crashing if there is a time zone within the
			// time stamp
			xmlCalender.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			return xmlCalender;

		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @return
	 */
	static DateTimeBaseType initNow() {

		DateTimeBaseType date = CpacsFactory.eINSTANCE.createDateTimeBaseType();
		date.setValue(DateTimeExtensions.getXMLGregorianCalendarNow());

		return date;
	}
}
