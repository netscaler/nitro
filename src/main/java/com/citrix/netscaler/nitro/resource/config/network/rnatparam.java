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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rnatparam_response extends base_response
{
	public rnatparam rnatparam;
}
/**
* Configuration for RNAT parameter resource.
*/

public class rnatparam extends base_resource
{
	private String tcpproxy;

	/**
	* <pre>
	* Enable TCP proxy, which enables the NetScaler appliance to optimize the RNAT TCP traffic by using Layer 4 features.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tcpproxy(String tcpproxy) throws Exception{
		this.tcpproxy = tcpproxy;
	}

	/**
	* <pre>
	* Enable TCP proxy, which enables the NetScaler appliance to optimize the RNAT TCP traffic by using Layer 4 features.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tcpproxy() throws Exception {
		return this.tcpproxy;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		rnatparam[] resources = new rnatparam[1];
		rnatparam_response result = (rnatparam_response) service.get_payload_formatter().string_to_resource(rnatparam_response.class, response);
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
		resources[0] = result.rnatparam;
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
	* Use this API to update rnatparam.
	*/
	public static base_response update(nitro_service client, rnatparam resource) throws Exception {
		rnatparam updateresource = new rnatparam();
		updateresource.tcpproxy = resource.tcpproxy;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of rnatparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, rnatparam resource, String[] args) throws Exception{
		rnatparam unsetresource = new rnatparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the rnatparam resources that are configured on netscaler.
	*/
	public static rnatparam get(nitro_service service) throws Exception{
		rnatparam obj = new rnatparam();
		rnatparam[] response = (rnatparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the rnatparam resources that are configured on netscaler.
	*/
	public static rnatparam get(nitro_service service,  options option) throws Exception{
		rnatparam obj = new rnatparam();
		rnatparam[] response = (rnatparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class tcpproxyEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
