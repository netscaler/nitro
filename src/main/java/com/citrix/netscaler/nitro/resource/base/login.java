/*
* Copyright (c) 2004-2015 Citrix Systems, Inc.
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package com.citrix.netscaler.nitro.resource.base;

import com.citrix.netscaler.nitro.resource.base.base_resource;
import com.citrix.netscaler.nitro.service.nitro_service;

/**
 * Nitro login resource class.
 */
public class login extends base_resource 
{
	private String username;
	private String password;
	private String ipaddress;
	private String sessionid;
	private Long timeout;
	
	/**
	 * login class constructor specifying username and password for 
	 * logging into Netscaler.
	 * @param username username 
	 * @param password password
	 */
	public login(String username, String password) 
	{
		this.username = username;
		this.password = password;
	}
	
	/**
	 * login class constructor specifying username,password and timeout for 
	 * logging into Netscaler.
	 * @param username username. 
	 * @param password password.
	 * @param timeout session timeout in seconds.default timeout is 1800secs.
	 */
	public login(String username, String password, Long timeout) 
	{
		this.username = username;
		this.password = password;
		if(timeout != null)
			this.timeout = timeout;
	}
	
	/**
	 * 
	 */
	protected String get_object_name() 
	{
		return null;
	}
	
	/**
	 * gets the Nitro responce.
	 */
	protected  base_resource[] get_nitro_response(nitro_service service, String response) 
	{
		return null;
	}
}
