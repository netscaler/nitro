/*
* Copyright (c) 2008-2015 Citrix Systems, Inc.
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package com.citrix.netscaler.nitro.resource.config.ns;

/**
	* Provides additional arguments required for fetching the nsrollbackcmd resource.
	*/

public class nsrollbackcmd_args 
{
	private String filename;
	private String outtype;

	/**
	* <pre>
	* File that contains the commands for which the rollback commands must be generated. Specify the full path of the file name.
	* </pre>
	*/
	public void set_filename(String filename) throws Exception{
		this.filename = filename;
	}

	/**
	* <pre>
	* File that contains the commands for which the rollback commands must be generated. Specify the full path of the file name.
	* </pre>
	*/
	public String get_filename() throws Exception {
		return this.filename;
	}

	/**
	* <pre>
	* Format in which the rollback commands must be generated.<br> Possible values = cli, xml
	* </pre>
	*/
	public void set_outtype(String outtype) throws Exception{
		this.outtype = outtype;
	}

	/**
	* <pre>
	* Format in which the rollback commands must be generated.<br> Possible values = cli, xml
	* </pre>
	*/
	public String get_outtype() throws Exception {
		return this.outtype;
	}

	public static class outtypeEnum {
		public static final String cli = "cli";
		public static final String xml = "xml";
	}
}
