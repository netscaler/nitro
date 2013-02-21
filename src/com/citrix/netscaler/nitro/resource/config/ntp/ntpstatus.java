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

package com.citrix.netscaler.nitro.resource.config.ntp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ntpstatus_response extends base_response
{
	public ntpstatus ntpstatus;
}
/**
* Configuration for ntp status resource.
*/

public class ntpstatus extends base_resource
{

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_response() throws Exception {
		return this.response;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ntpstatus[] resources = new ntpstatus[1];
		ntpstatus_response result = (ntpstatus_response) service.get_payload_formatter().string_to_resource(ntpstatus_response.class, response);
		if(result.errorcode != 0) {
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if (result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode);
			}
		}
		resources[0] = result.ntpstatus;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to fetch all the ntpstatus resources that are configured on netscaler.
	*/
	public static ntpstatus get(nitro_service service) throws Exception{
		ntpstatus obj = new ntpstatus();
		ntpstatus[] response = (ntpstatus[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the ntpstatus resources that are configured on netscaler.
	*/
	public static ntpstatus get(nitro_service service,  options option) throws Exception{
		ntpstatus obj = new ntpstatus();
		ntpstatus[] response = (ntpstatus[])obj.get_resources(service,option);
		return response[0];
	}

}
