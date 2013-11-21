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

class vpnclientlessaccesspolicy_vpnvserver_binding_response extends base_response
{
	public vpnclientlessaccesspolicy_vpnvserver_binding[] vpnclientlessaccesspolicy_vpnvserver_binding;
}
/**
	* Binding class showing the vpnvserver that can be bound to vpnclientlessaccesspolicy.
	*/

public class vpnclientlessaccesspolicy_vpnvserver_binding extends base_resource
{
	private String boundto;
	private Long priority;
	private Integer activepolicy;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Location where policy is bound.
	* </pre>
	*/
	public void set_boundto(String boundto) throws Exception{
		this.boundto = boundto;
	}

	/**
	* <pre>
	* Location where policy is bound.
	* </pre>
	*/
	public String get_boundto() throws Exception {
		return this.boundto;
	}

	/**
	* <pre>
	* Name of the clientless access policy to display.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the clientless access policy to display.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Specifies the priority of the policy.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Indicates whether policy is bound or not.
	* </pre>
	*/
	public Integer get_activepolicy() throws Exception {
		return this.activepolicy;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnclientlessaccesspolicy_vpnvserver_binding_response result = (vpnclientlessaccesspolicy_vpnvserver_binding_response) service.get_payload_formatter().string_to_resource(vpnclientlessaccesspolicy_vpnvserver_binding_response.class, response);
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
		return result.vpnclientlessaccesspolicy_vpnvserver_binding;
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
	* Use this API to fetch vpnclientlessaccesspolicy_vpnvserver_binding resources of given name .
	*/
	public static vpnclientlessaccesspolicy_vpnvserver_binding[] get(nitro_service service, String name) throws Exception{
		vpnclientlessaccesspolicy_vpnvserver_binding obj = new vpnclientlessaccesspolicy_vpnvserver_binding();
		obj.set_name(name);
		vpnclientlessaccesspolicy_vpnvserver_binding response[] = (vpnclientlessaccesspolicy_vpnvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnclientlessaccesspolicy_vpnvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnclientlessaccesspolicy_vpnvserver_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnclientlessaccesspolicy_vpnvserver_binding obj = new vpnclientlessaccesspolicy_vpnvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnclientlessaccesspolicy_vpnvserver_binding[] response = (vpnclientlessaccesspolicy_vpnvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnclientlessaccesspolicy_vpnvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnclientlessaccesspolicy_vpnvserver_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnclientlessaccesspolicy_vpnvserver_binding obj = new vpnclientlessaccesspolicy_vpnvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnclientlessaccesspolicy_vpnvserver_binding[] response = (vpnclientlessaccesspolicy_vpnvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpnclientlessaccesspolicy_vpnvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		vpnclientlessaccesspolicy_vpnvserver_binding obj = new vpnclientlessaccesspolicy_vpnvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		vpnclientlessaccesspolicy_vpnvserver_binding response[] = (vpnclientlessaccesspolicy_vpnvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnclientlessaccesspolicy_vpnvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnclientlessaccesspolicy_vpnvserver_binding obj = new vpnclientlessaccesspolicy_vpnvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnclientlessaccesspolicy_vpnvserver_binding[] response = (vpnclientlessaccesspolicy_vpnvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnclientlessaccesspolicy_vpnvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnclientlessaccesspolicy_vpnvserver_binding obj = new vpnclientlessaccesspolicy_vpnvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnclientlessaccesspolicy_vpnvserver_binding[] response = (vpnclientlessaccesspolicy_vpnvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}