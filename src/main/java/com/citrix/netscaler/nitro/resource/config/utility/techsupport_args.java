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

package com.citrix.netscaler.nitro.resource.config.utility;

/**
	* Provides additional arguments required for fetching the techsupport resource.
	*/

public class techsupport_args 
{
	private String scope;

	/**
	* <pre>
	*  Use this option to run showtechsupport on present node or all cluster nodes.<br> Default value: NS_TECH_NODE<br> Possible values = NODE, CLUSTER
	* </pre>
	*/
	public void set_scope(String scope) throws Exception{
		this.scope = scope;
	}

	/**
	* <pre>
	*  Use this option to run showtechsupport on present node or all cluster nodes.<br> Default value: NS_TECH_NODE<br> Possible values = NODE, CLUSTER
	* </pre>
	*/
	public String get_scope() throws Exception {
		return this.scope;
	}

	public static class scopeEnum {
		public static final String NODE = "NODE";
		public static final String CLUSTER = "CLUSTER";
	}
}
