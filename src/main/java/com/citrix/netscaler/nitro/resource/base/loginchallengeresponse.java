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

package com.citrix.netscaler.nitro.resource.base;

import com.citrix.netscaler.nitro.service.nitro_service;


/**
 * Nitro loginchallengeresponse resource class.
 */
public class loginchallengeresponse extends base_resource{
	private String response;
	
	
	/**
	 * loginchallengeresponse class constructor specifying challenge response.
	 * @param response response for the security question.
	 */
	public loginchallengeresponse(String response) 
	{
		this.response = response;
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
