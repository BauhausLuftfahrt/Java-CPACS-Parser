# JAVA CPACS Parser
Read and write CPACS files. Create an object structure out of CPACS and develop faster. Created by Bauhaus Luftfahrt.

## What is CPACS?
Common Parametric Aircraft Configuration Schema (CPACS) is an open-source data exchange format for aircraft design. It supports all aspects of an aircraft and enables a swift and easy interdisciplinary file transfer. CPACS is developed by DLR. For more information, see [CPACS on GitHub](https://github.com/DLR-SL/CPACS) or the official website [www.cpacs.de](www.cpacs.de). 

## Description
This tool enables the CPACS file format to be used natively within Java. The CPACS structure has been transformed into an EMF ecore model which can be used to build with CPACS natively. It supports auto-completion without the need to use specific strings to access CPACS paths within the xml structure. Additionally, use the built-in functions to read CPACS files and turn them into JAVA objects and save CPACS objects back to an xml file. Currently, CPACS **version 3.2** is implemented here.

## Usage
* Download the latest Eclipse Modelling Tools version from www.eclipse.org and install it.
* Make sure to have at least Java 1.8 installed.
* Checkout this repository, import the projects and you are ready to go.
* You can find a demo use case below and under the functions plugin at the **Demo.java** file.

## Example
1. You can use the following code to import a CPACS file: 

```java
// Import 
File inputFile = new File("C:/cpacs.xml");

// Load the CPACS file
CpacsType cpacs = CPACSInitializer.run(inputFile);
```

2. Then, access the CPACS object doing the following: 

```java
// Create a CPACS string object
StringBaseType name = CpacsFactory.eINSTANCE.createStringBaseType();

// Apply a value 
name.setValue("Marc Engelmann");

// Set the string object at the desired location.
cpacs.getHeader().setCreator(name);
```

3. Lastly, save the CPACS object back to xml:

```java
String exportPath = "C:/cpacs_new.xml";
CPACSWriter.run(exportPath, cpacs);
```

## About

Copyright (c) 2021 [Bauhaus Luftfahrt e.V.](http://www.bauhaus-luftfahrt.net/?set_language=en). All rights reserved. This program and the accompanying materials are made available under the terms of the Apache License v2.0 which accompanies this distribution,and is available at http://www.apache.org/licenses/LICENSE-2.0. All rights reserved. 

CPACS: (c) Deutsches Zentrum für Luft- und Raumfahrt e.V., Institute of System Architectures in Aeronautics, [www.cpacs.de](www.cpacs.de).
