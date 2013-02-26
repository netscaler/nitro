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

class arpparam_response extends base_response
{
	public arpparam arpparam;
}
/**
* Configuration for Global arp parameters resource.
*/

public class arpparam extends base_resource
{
	private Long timeout;
	private String spoofvalidation;

	/**
	* <pre>
	* The ARP table entry aging time, in seconds. Dynamic ARP entries are automatically removed after the specified amount of time.<br> Default value: 1200<br> Minimum value =  5<br> Maximum value =  1200
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* The ARP table entry aging time, in seconds. Dynamic ARP entries are automatically removed after the specified amount of time.<br> Default value: 1200<br> Minimum value =  5<br> Maximum value =  1200
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* The ARP table entry aging time, in seconds. Dynamic ARP entries are automatically removed after the specified amount of time.<br> Default value: 1200<br> Minimum value =  5<br> Maximum value =  1200
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* enable/disable arp spoofing validation.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_spoofvalidation(String spoofvalidation) throws Exception{
		this.spoofvalidation = spoofvalidation;
	}

	/**
	* <pre>
	* enable/disable arp spoofing validation.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_spoofvalidation() throws Exception {
		return this.spoofvalidation;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		arpparam[] resources = new arpparam[1];
		arpparam_response result = (arpparam_response) service.get_payload_formatter().string_to_resource(arpparam_response.class, response);
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
		resources[0] = result.arpparam;
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
	* Use this API to update arpparam.
	*/
	public static base_response update(nitro_service client, arpparam resource) throws Exception {
		arpparam updateresource = new arpparam();
		updateresource.timeout = resource.timeout;
		updateresource.spoofvalidation = resource.spoofvalidation;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of arpparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, arpparam resource, String[] args) throws Exception{
		arpparam unsetresource = new arpparam();
		unsetresource.timeout = resource.timeout;
		unsetresource.spoofvalidation = resource.spoofvalidation;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the arpparam resources that are configured on netscaler.
	*/
	public static arpparam get(nitro_service service) throws Exception{
		arpparam obj = new arpparam();
		arpparam[] response = (arpparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the arpparam resources that are configured on netscaler.
	*/
	public static arpparam get(nitro_service service,  options option) throws Exception{
		arpparam obj = new arpparam();
		arpparam[] response = (arpparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class spoofvalidationEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
