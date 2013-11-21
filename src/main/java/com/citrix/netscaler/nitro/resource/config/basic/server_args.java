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

package com.citrix.netscaler.nitro.resource.config.basic;

/**
	* Provides additional arguments required for fetching the server resource.
	*/

public class server_args 
{
	private Boolean Internal;

	/**
	* <pre>
	* Display names of the servers that have been created for internal use.
	* </pre>
	*/
	public void set_Internal(boolean Internal) throws Exception {
		this.Internal = new Boolean(Internal);
	}

	/**
	* <pre>
	* Display names of the servers that have been created for internal use.
	* </pre>
	*/
	public void set_Internal(Boolean Internal) throws Exception{
		this.Internal = Internal;
	}

	/**
	* <pre>
	* Display names of the servers that have been created for internal use.
	* </pre>
	*/
	public Boolean get_Internal() throws Exception {
		return this.Internal;
	}

}
