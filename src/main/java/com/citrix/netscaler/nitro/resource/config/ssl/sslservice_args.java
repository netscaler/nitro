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

package com.citrix.netscaler.nitro.resource.config.ssl;

/**
	* Provides additional arguments required for fetching the sslservice resource.
	*/

public class sslservice_args 
{
	private Boolean cipherdetails;

	/**
	* <pre>
	* Details of the individual ciphers bound to the SSL service. Select this flag value to display the details of the individual ciphers bound to the SSL service.
	* </pre>
	*/
	public void set_cipherdetails(boolean cipherdetails) throws Exception {
		this.cipherdetails = new Boolean(cipherdetails);
	}

	/**
	* <pre>
	* Details of the individual ciphers bound to the SSL service. Select this flag value to display the details of the individual ciphers bound to the SSL service.
	* </pre>
	*/
	public void set_cipherdetails(Boolean cipherdetails) throws Exception{
		this.cipherdetails = cipherdetails;
	}

	/**
	* <pre>
	* Details of the individual ciphers bound to the SSL service. Select this flag value to display the details of the individual ciphers bound to the SSL service.
	* </pre>
	*/
	public Boolean get_cipherdetails() throws Exception {
		return this.cipherdetails;
	}

}
