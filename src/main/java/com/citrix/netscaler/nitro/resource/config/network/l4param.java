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

class l4param_response extends base_response
{
	public l4param l4param;
}
/**
* Configuration for Layer 4 related parameter resource.
*/

public class l4param extends base_resource
{
	private String l2connmethod;
	private String l4switch;

	/**
	* <pre>
	* .<br> Default value: MacVlanChannel<br> Possible values = Channel, Vlan, VlanChannel, Mac, MacChannel, MacVlan, MacVlanChannel
	* </pre>
	*/
	public void set_l2connmethod(String l2connmethod) throws Exception{
		this.l2connmethod = l2connmethod;
	}

	/**
	* <pre>
	* .<br> Default value: MacVlanChannel<br> Possible values = Channel, Vlan, VlanChannel, Mac, MacChannel, MacVlan, MacVlanChannel
	* </pre>
	*/
	public String get_l2connmethod() throws Exception {
		return this.l2connmethod;
	}

	/**
	* <pre>
	* .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_l4switch(String l4switch) throws Exception{
		this.l4switch = l4switch;
	}

	/**
	* <pre>
	* .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_l4switch() throws Exception {
		return this.l4switch;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		l4param[] resources = new l4param[1];
		l4param_response result = (l4param_response) service.get_payload_formatter().string_to_resource(l4param_response.class, response);
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
		resources[0] = result.l4param;
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
	* Use this API to update l4param.
	*/
	public static base_response update(nitro_service client, l4param resource) throws Exception {
		l4param updateresource = new l4param();
		updateresource.l2connmethod = resource.l2connmethod;
		updateresource.l4switch = resource.l4switch;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of l4param resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, l4param resource, String[] args) throws Exception{
		l4param unsetresource = new l4param();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the l4param resources that are configured on netscaler.
	*/
	public static l4param get(nitro_service service) throws Exception{
		l4param obj = new l4param();
		l4param[] response = (l4param[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the l4param resources that are configured on netscaler.
	*/
	public static l4param get(nitro_service service,  options option) throws Exception{
		l4param obj = new l4param();
		l4param[] response = (l4param[])obj.get_resources(service,option);
		return response[0];
	}

	public static class l4switchEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class l2connmethodEnum {
		public static final String Channel = "Channel";
		public static final String Vlan = "Vlan";
		public static final String VlanChannel = "VlanChannel";
		public static final String Mac = "Mac";
		public static final String MacChannel = "MacChannel";
		public static final String MacVlan = "MacVlan";
		public static final String MacVlanChannel = "MacVlanChannel";
	}
}
