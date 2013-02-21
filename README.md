nitro
=====

The Citrix® NetScaler® NITRO client for Java allows you to configure and monitor the NetScaler appliance programmatically in Java based applications.

This readme briefly explains the directory structure of the SDK and the means to access the help.

Directory Structure
-------------------
  * lib - Contains JARs to be added to the applications classpath.
  * doc - Contains help for using the SDK. See the sections below.
  * sample - Contains code samples explaining the use of the NITRO APIs.
  * src - Contains the NITRO source code.

Accessing the API Reference in Eclipse
--------------------------------------
The API reference is provided by Javadocs as html files. You can access the API reference directly in Eclipse, by linking the Javadocs to the "nitro.jar". 
To access the API reference in Eclipse:
  1. In Eclipse, right-click the "nitro.jar" and select "Properties".
  2. Select the "Javadoc Location" tab.
  3. Specify the location of the Javadocs. Typically, it will be 
  <NITRO_SDK_HOME>/doc/api_reference.
Note: The steps would differ across versions of Eclipse.

Accessing the Developer Guide 
-----------------------------
The developer guide is provided as an Eclipse plugin so that you can access the help through the Eclipse IDE itself.
To access the developer guide:
  1. Copy the com.citrix.netscaler.nitro.dev_guide folder from <NITRO_SDK_HOME>/
  doc to the <ECLIPSE_HOME>/plugins folder.
  2. Restart Eclipse.
  3. Access the guide from the Help menu > Search > Contents > Citrix NetScaler 
  NITRO Developers Guide for Java.
Note: Do not change the name of the com.citrix.netscaler.nitro.dev_guide folder. 

License
-------
Netscaler nitro java sdk is free software.  You can redistribute and modify it under the
terms of the Apache License.  See LICENSE.txt for details.