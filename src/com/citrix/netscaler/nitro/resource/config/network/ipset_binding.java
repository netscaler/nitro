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

import com.citrix.netscaler.nitro.resource.config.network.ipset_nsip_binding;
import com.citrix.netscaler.nitro.resource.config.network.ipset_nsip6_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ipset_binding_response extends base_response
{
	public ipset_binding[] ipset_binding;
}
/**
	* Binding class showing the resources that can be bound to ipset_binding. 
	*/

public class ipset_binding extends base_resource
{
	private String name;
	private ipset_nsip_binding	ipset_nsip_binding[] = null;
	private ipset_nsip6_binding	ipset_nsip6_binding[] = null;

	/**
	* <pre>
	* The name of the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* nsip that can be bound to ipset.
	* </pre>
	*/
	public ipset_nsip_binding[] get_ipset_nsip_bindings() throws Exception {
		return this.ipset_nsip_binding;
	}

	/**
	* <pre>
	* nsip6 that can be bound to ipset.
	* </pre>
	*/
	public ipset_nsip6_binding[] get_ipset_nsip6_bindings() throws Exception {
		return this.ipset_nsip6_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		ipset_binding_response result = (ipset_binding_response) service.get_payload_formatter().string_to_resource(ipset_binding_response.class, response);
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
		return result.ipset_binding;
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
	* Use this API to fetch ipset_binding resource of given name .
	*/
	public static ipset_binding get(nitro_service service, String name) throws Exception{
		ipset_binding obj = new ipset_binding();
		obj.set_name(name);
		ipset_binding response = (ipset_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch ipset_binding resources of given names .
	*/
	public static ipset_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			ipset_binding response[] = new ipset_binding[name.length];
			ipset_binding obj[] = new ipset_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new ipset_binding();
				obj[i].set_name(name[i]);
				response[i] = (ipset_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}