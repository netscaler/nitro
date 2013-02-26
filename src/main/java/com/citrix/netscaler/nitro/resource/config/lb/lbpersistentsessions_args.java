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

package com.citrix.netscaler.nitro.resource.config.lb;

/**
	* Provides additional arguments required for fetching the lbpersistentsessions resource.
	*/

public class lbpersistentsessions_args 
{
	private String vserver;

	/**
	* <pre>
	* The name of the virtual server.
	* </pre>
	*/
	public void set_vserver(String vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* The name of the virtual server.
	* </pre>
	*/
	public String get_vserver() throws Exception {
		return this.vserver;
	}

}
