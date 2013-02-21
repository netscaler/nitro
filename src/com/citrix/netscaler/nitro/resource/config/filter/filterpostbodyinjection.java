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

package com.citrix.netscaler.nitro.resource.config.filter;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class filterpostbodyinjection_response extends base_response
{
	public filterpostbodyinjection filterpostbodyinjection;
}
/**
* Configuration for HTML Injection postbody resource.
*/

public class filterpostbodyinjection extends base_resource
{
	private String postbody;

	//------- Read only Parameter ---------;

	private String systemiid;

	/**
	* <pre>
	* The file name for postbody.<br> Minimum length =  1
	* </pre>
	*/
	public void set_postbody(String postbody) throws Exception{
		this.postbody = postbody;
	}

	/**
	* <pre>
	* The file name for postbody.<br> Minimum length =  1
	* </pre>
	*/
	public String get_postbody() throws Exception {
		return this.postbody;
	}

	/**
	* <pre>
	* The system IID of the current NetScaler system.
	* </pre>
	*/
	public String get_systemiid() throws Exception {
		return this.systemiid;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		filterpostbodyinjection[] resources = new filterpostbodyinjection[1];
		filterpostbodyinjection_response result = (filterpostbodyinjection_response) service.get_payload_formatter().string_to_resource(filterpostbodyinjection_response.class, response);
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
		resources[0] = result.filterpostbodyinjection;
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
	* Use this API to update filterpostbodyinjection.
	*/
	public static base_response update(nitro_service client, filterpostbodyinjection resource) throws Exception {
		filterpostbodyinjection updateresource = new filterpostbodyinjection();
		updateresource.postbody = resource.postbody;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of filterpostbodyinjection resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, filterpostbodyinjection resource, String[] args) throws Exception{
		filterpostbodyinjection unsetresource = new filterpostbodyinjection();
		unsetresource.postbody = resource.postbody;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the filterpostbodyinjection resources that are configured on netscaler.
	*/
	public static filterpostbodyinjection get(nitro_service service) throws Exception{
		filterpostbodyinjection obj = new filterpostbodyinjection();
		filterpostbodyinjection[] response = (filterpostbodyinjection[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the filterpostbodyinjection resources that are configured on netscaler.
	*/
	public static filterpostbodyinjection get(nitro_service service,  options option) throws Exception{
		filterpostbodyinjection obj = new filterpostbodyinjection();
		filterpostbodyinjection[] response = (filterpostbodyinjection[])obj.get_resources(service,option);
		return response[0];
	}

}
