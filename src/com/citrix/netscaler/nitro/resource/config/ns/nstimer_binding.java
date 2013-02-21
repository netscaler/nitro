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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.config.ns.nstimer_autoscalepolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nstimer_binding_response extends base_response
{
	public nstimer_binding[] nstimer_binding;
}
/**
	* Binding class showing the resources that can be bound to nstimer_binding. 
	*/

public class nstimer_binding extends base_resource
{
	private String name;
	private nstimer_autoscalepolicy_binding	nstimer_autoscalepolicy_binding[] = null;

	/**
	* <pre>
	* Timer name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Timer name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* autoscalepolicy that can be bound to nstimer.
	* </pre>
	*/
	public nstimer_autoscalepolicy_binding[] get_nstimer_autoscalepolicy_bindings() throws Exception {
		return this.nstimer_autoscalepolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nstimer_binding_response result = (nstimer_binding_response) service.get_payload_formatter().string_to_resource(nstimer_binding_response.class, response);
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
		return result.nstimer_binding;
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
	* Use this API to fetch nstimer_binding resource of given name .
	*/
	public static nstimer_binding get(nitro_service service, String name) throws Exception{
		nstimer_binding obj = new nstimer_binding();
		obj.set_name(name);
		nstimer_binding response = (nstimer_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nstimer_binding resources of given names .
	*/
	public static nstimer_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nstimer_binding response[] = new nstimer_binding[name.length];
			nstimer_binding obj[] = new nstimer_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nstimer_binding();
				obj[i].set_name(name[i]);
				response[i] = (nstimer_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}