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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpntrafficpolicy_aaauser_binding_response extends base_response
{
	public vpntrafficpolicy_aaauser_binding[] vpntrafficpolicy_aaauser_binding;
}
/**
	* Binding class showing the aaauser that can be bound to vpntrafficpolicy.
	*/

public class vpntrafficpolicy_aaauser_binding extends base_resource
{
	private String boundto;
	private Long priority;
	private Long activepolicy;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The name of the vpn trafiic policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the vpn trafiic policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The entity name to which policy is bound.
	* </pre>
	*/
	public void set_boundto(String boundto) throws Exception{
		this.boundto = boundto;
	}

	/**
	* <pre>
	* The entity name to which policy is bound.
	* </pre>
	*/
	public String get_boundto() throws Exception {
		return this.boundto;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_activepolicy() throws Exception {
		return this.activepolicy;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpntrafficpolicy_aaauser_binding_response result = (vpntrafficpolicy_aaauser_binding_response) service.get_payload_formatter().string_to_resource(vpntrafficpolicy_aaauser_binding_response.class, response);
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
		return result.vpntrafficpolicy_aaauser_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch vpntrafficpolicy_aaauser_binding resources of given name .
	*/
	public static vpntrafficpolicy_aaauser_binding[] get(nitro_service service, String name) throws Exception{
		vpntrafficpolicy_aaauser_binding obj = new vpntrafficpolicy_aaauser_binding();
		obj.set_name(name);
		vpntrafficpolicy_aaauser_binding response[] = (vpntrafficpolicy_aaauser_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpntrafficpolicy_aaauser_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpntrafficpolicy_aaauser_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		vpntrafficpolicy_aaauser_binding obj = new vpntrafficpolicy_aaauser_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpntrafficpolicy_aaauser_binding[] response = (vpntrafficpolicy_aaauser_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpntrafficpolicy_aaauser_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpntrafficpolicy_aaauser_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpntrafficpolicy_aaauser_binding obj = new vpntrafficpolicy_aaauser_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpntrafficpolicy_aaauser_binding[] response = (vpntrafficpolicy_aaauser_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpntrafficpolicy_aaauser_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		vpntrafficpolicy_aaauser_binding obj = new vpntrafficpolicy_aaauser_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		vpntrafficpolicy_aaauser_binding response[] = (vpntrafficpolicy_aaauser_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpntrafficpolicy_aaauser_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		vpntrafficpolicy_aaauser_binding obj = new vpntrafficpolicy_aaauser_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpntrafficpolicy_aaauser_binding[] response = (vpntrafficpolicy_aaauser_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpntrafficpolicy_aaauser_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpntrafficpolicy_aaauser_binding obj = new vpntrafficpolicy_aaauser_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpntrafficpolicy_aaauser_binding[] response = (vpntrafficpolicy_aaauser_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}