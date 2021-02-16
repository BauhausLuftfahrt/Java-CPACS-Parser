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

2. Then, access the CPACS object with functions from the **model extensions plugin** doing the following: 

```java
// Set the string object at the desired location.
String cpacsFileTitle = "Demo CPACS created with Java CPACS parser by Bauhaus Luftfahrt";
double fileVersionNumber = 1.0;
cpacs.setHeader(HeaderExtensions.init(cpacsFileTitle, fileVersionNumber);
```

3. Lastly, save the CPACS object back to xml:

```java
String exportPath = "C:/cpacs_new.xml";
CPACSWriter.run(exportPath, cpacs);
```

4. The output will look like this:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<cpacs>
    <header>
        <name>Demo CPACS created with Java CPACS parser by Bauhaus Luftfahrt</name>
        <creator>Marc Engelmann</creator>
        <timestamp>2021-02-16T10:02:03.670</timestamp>
        <version>1.0</version>
        <cpacsVersion>3.2</cpacsVersion>
    </header>
</cpacs>
```

## About

Copyright (c) 2021 [Bauhaus Luftfahrt e.V.](http://www.bauhaus-luftfahrt.net/?set_language=en). All rights reserved. This program and the accompanying materials are made available under the terms of the Apache License v2.0 which accompanies this distribution,and is available at http://www.apache.org/licenses/LICENSE-2.0. All rights reserved. 

## About CPACS
Copyright (c) 2018 Deutsches Zentrum für Luft- und Raumfahrt e.V., Institute of System Architectures in Aeronautics, [www.cpacs.de](www.cpacs.de).
