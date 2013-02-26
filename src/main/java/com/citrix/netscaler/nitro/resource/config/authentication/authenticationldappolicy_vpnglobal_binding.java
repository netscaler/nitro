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

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationldappolicy_vpnglobal_binding_response extends base_response
{
	public authenticationldappolicy_vpnglobal_binding[] authenticationldappolicy_vpnglobal_binding;
}
/**
	* Binding class showing the vpnglobal that can be bound to authenticationldappolicy.
	*/

public class authenticationldappolicy_vpnglobal_binding extends base_resource
{
	private String boundto;
	private Long priority;
	private Long activepolicy;
	private String name;
	private Long __count;

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
	* The name of the policy. If a name is not provided, all of the configured policies are displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the policy. If a name is not provided, all of the configured policies are displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
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
		authenticationldappolicy_vpnglobal_binding_response result = (authenticationldappolicy_vpnglobal_binding_response) service.get_payload_formatter().string_to_resource(authenticationldappolicy_vpnglobal_binding_response.class, response);
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
		return result.authenticationldappolicy_vpnglobal_binding;
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
	* Use this API to fetch authenticationldappolicy_vpnglobal_binding resources of given name .
	*/
	public static authenticationldappolicy_vpnglobal_binding[] get(nitro_service service, String name) throws Exception{
		authenticationldappolicy_vpnglobal_binding obj = new authenticationldappolicy_vpnglobal_binding();
		obj.set_name(name);
		authenticationldappolicy_vpnglobal_binding response[] = (authenticationldappolicy_vpnglobal_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationldappolicy_vpnglobal_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationldappolicy_vpnglobal_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		authenticationldappolicy_vpnglobal_binding obj = new authenticationldappolicy_vpnglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		authenticationldappolicy_vpnglobal_binding[] response = (authenticationldappolicy_vpnglobal_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationldappolicy_vpnglobal_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationldappolicy_vpnglobal_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		authenticationldappolicy_vpnglobal_binding obj = new authenticationldappolicy_vpnglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		authenticationldappolicy_vpnglobal_binding[] response = (authenticationldappolicy_vpnglobal_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count authenticationldappolicy_vpnglobal_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		authenticationldappolicy_vpnglobal_binding obj = new authenticationldappolicy_vpnglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		authenticationldappolicy_vpnglobal_binding response[] = (authenticationldappolicy_vpnglobal_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationldappolicy_vpnglobal_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		authenticationldappolicy_vpnglobal_binding obj = new authenticationldappolicy_vpnglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationldappolicy_vpnglobal_binding[] response = (authenticationldappolicy_vpnglobal_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationldappolicy_vpnglobal_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		authenticationldappolicy_vpnglobal_binding obj = new authenticationldappolicy_vpnglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationldappolicy_vpnglobal_binding[] response = (authenticationldappolicy_vpnglobal_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}