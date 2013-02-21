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

package com.citrix.netscaler.nitro.resource.config.dns;

/**
	* Provides additional arguments required for fetching the dnsnsecrec resource.
	*/

public class dnsnsecrec_args 
{
	private String type;

	/**
	* <pre>
	* NSEC record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative NSEC records will be displayed.
PROXY - If this is specified, all of the proxy NSEC records will be displayed.
ALL  -  If this is specified, all of the NSEC records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* NSEC record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative NSEC records will be displayed.
PROXY - If this is specified, all of the proxy NSEC records will be displayed.
ALL  -  If this is specified, all of the NSEC records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	public static class typeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
}
