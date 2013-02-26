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

class vridparam_response extends base_response
{
	public vridparam vridparam;
}
/**
* Configuration for VR ID parameter resource.
*/

public class vridparam extends base_resource
{
	private String sendtomaster;

	/**
	* <pre>
	* Forward packets to the master node, in an active-active mode configuration, if the virtual server is in the backup state and sharing is disabled. Possible values: ENABLED, DISABLED. Default: DISABLED.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sendtomaster(String sendtomaster) throws Exception{
		this.sendtomaster = sendtomaster;
	}

	/**
	* <pre>
	* Forward packets to the master node, in an active-active mode configuration, if the virtual server is in the backup state and sharing is disabled. Possible values: ENABLED, DISABLED. Default: DISABLED.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sendtomaster() throws Exception {
		return this.sendtomaster;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		vridparam[] resources = new vridparam[1];
		vridparam_response result = (vridparam_response) service.get_payload_formatter().string_to_resource(vridparam_response.class, response);
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
		resources[0] = result.vridparam;
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
	* Use this API to update vridparam.
	*/
	public static base_response update(nitro_service client, vridparam resource) throws Exception {
		vridparam updateresource = new vridparam();
		updateresource.sendtomaster = resource.sendtomaster;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of vridparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vridparam resource, String[] args) throws Exception{
		vridparam unsetresource = new vridparam();
		unsetresource.sendtomaster = resource.sendtomaster;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the vridparam resources that are configured on netscaler.
	*/
	public static vridparam get(nitro_service service) throws Exception{
		vridparam obj = new vridparam();
		vridparam[] response = (vridparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the vridparam resources that are configured on netscaler.
	*/
	public static vridparam get(nitro_service service,  options option) throws Exception{
		vridparam obj = new vridparam();
		vridparam[] response = (vridparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class sendtomasterEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
