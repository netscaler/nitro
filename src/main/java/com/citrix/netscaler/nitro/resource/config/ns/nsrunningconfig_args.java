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
	* Provides additional arguments required for fetching the nsrunningconfig resource.
	*/

public class nsrunningconfig_args 
{
	private Boolean withdefaults;

	/**
	* <pre>
	* Include default values of parameters that have not been explicitly configured. If this argument is disabled, such parameters are not included.
	* </pre>
	*/
	public void set_withdefaults(boolean withdefaults) throws Exception {
		this.withdefaults = new Boolean(withdefaults);
	}

	/**
	* <pre>
	* Include default values of parameters that have not been explicitly configured. If this argument is disabled, such parameters are not included.
	* </pre>
	*/
	public void set_withdefaults(Boolean withdefaults) throws Exception{
		this.withdefaults = withdefaults;
	}

	/**
	* <pre>
	* Include default values of parameters that have not been explicitly configured. If this argument is disabled, such parameters are not included.
	* </pre>
	*/
	public Boolean get_withdefaults() throws Exception {
		return this.withdefaults;
	}

}
