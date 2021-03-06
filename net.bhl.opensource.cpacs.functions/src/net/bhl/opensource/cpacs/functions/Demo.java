/*******************************************************************************
 * <copyright> Copyright (c) 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Apache License v2.0 which accompanies this distribution,
 * and is available at http://www.apache.org/licenses/LICENSE-2.0 </copyright>
 *******************************************************************************/
package net.bhl.opensource.cpacs.functions;

import java.io.File;

import Cpacs.CpacsFactory;
import Cpacs.CpacsType;
import net.bhl.opensource.cpacs.model.extensions.header.HeaderExtensions;

/**
 * Java CPACS parser demo import, editing and export.
 *
 * @author Marc.Engelmann
 * @since 12.02.2021
 *
 */
public class Demo {

	/**
	 * Run a simple demo of the tool.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// Define the CPACS .xml file paths
		String filePathLoad = System.getProperty("user.home") + "\\Desktop\\example_input.xml";
		String filePathSave = System.getProperty("user.home") + "\\Desktop\\example_output.xml";

		// Define the CPACS input file
		File file = new File(filePathLoad);

		// Define the CPACS object
		CpacsType cpacs;

		if (file.exists()) {

			// Initialize CPACS from file
			cpacs = CPACSInitializer.run(file);

		} else {

			// Initialize blank CPACS
			cpacs = CpacsFactory.eINSTANCE.createCpacsType();
		}

		// Create a header object and set it
		cpacs.setHeader(HeaderExtensions.init("Demo CPACS created with Java CPACS parser by Bauhaus Luftfahrt", 1.0));

		// Save the CPACS file to a path
		CPACSWriter.run(filePathSave, cpacs);

		System.out.println("CPACS output completed.");

	}
}
