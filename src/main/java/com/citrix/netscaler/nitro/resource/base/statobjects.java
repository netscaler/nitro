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

import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.base.base_resource;
import com.citrix.netscaler.nitro.service.nitro_service;

class statobjects_response extends base_response
{
	public statobjects statobjects;
}

public class statobjects extends base_resource 
{
	private String[] objects;
	
	public String[] get_objects() throws Exception {
		return this.objects;
	}
	
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		statobjects[] resources = new statobjects[1];
		statobjects_response result = (statobjects_response) service.get_payload_formatter().string_to_resource(statobjects_response.class, response);
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
		resources[0] = result.statobjects;
		return resources;
	}

	protected String get_object_name() {
		return null;
	}
	
	/**
	* Use this API to fetch all the statistic objects resources that are available on netscaler.
	*/
	public static statobjects get(nitro_service service) throws Exception{
		statobjects obj = new statobjects();
		statobjects[] response = (statobjects[])obj.get_resources(service);
		return response[0];
	}
}
