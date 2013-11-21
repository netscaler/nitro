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
	* Provides additional arguments required for fetching the nsaptlicense resource.
	*/

public class nsaptlicense_args 
{
	private String serialno;

	/**
	* <pre>
	* Hardware Serial Number/License Activation Code(LAC).
	* </pre>
	*/
	public void set_serialno(String serialno) throws Exception{
		this.serialno = serialno;
	}

	/**
	* <pre>
	* Hardware Serial Number/License Activation Code(LAC).
	* </pre>
	*/
	public String get_serialno() throws Exception {
		return this.serialno;
	}

}
