/*******************************************************************************
 * <copyright>
 * This software  was developed at Bauhaus Luftfahrt e.V. by Marc Engelmann
 *
 * http://www.bauhaus-luftfahrt.net
 *
 * All rights reserved. Copyright (C) 2014-2021.
 *
 * Permission is hereby granted, free of charge, to use and/or copy this software
 * for non-commercial research and education purposes if the authors of this
 * software and their research papers are properly cited.
 *
 * Further rights are not granted. Contact us if you need another license or
 * specific rights.
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * </copyright>
 ***************************************************************************************/
package net.bhl.opensource.cpacs.functions;

import java.io.File;

import Cpacs.CpacsFactory;
import Cpacs.CpacsType;

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
		cpacs.setHeader(CpacsFactory.eINSTANCE.createHeaderType());

		// Create the creator object and set it
		cpacs.getHeader().setCreator(CpacsFactory.eINSTANCE.createStringBaseType());

		// Apply a value to the creator object
		cpacs.getHeader().getCreator().setValue(System.getProperty("user.name"));

		// Save the CPACS file to a path
		CPACSWriter.run(filePathSave, cpacs);
	}

}
