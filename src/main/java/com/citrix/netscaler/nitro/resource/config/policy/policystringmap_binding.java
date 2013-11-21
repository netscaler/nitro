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

package com.citrix.netscaler.nitro.resource.config.policy;

import com.citrix.netscaler.nitro.resource.config.policy.policystringmap_pattern_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class policystringmap_binding_response extends base_response
{
	public policystringmap_binding[] policystringmap_binding;
}
/**
	* Binding class showing the resources that can be bound to policystringmap_binding. 
	*/

public class policystringmap_binding extends base_resource
{
	private String name;
	private policystringmap_pattern_binding	policystringmap_pattern_binding[] = null;

	/**
	* <pre>
	* Name of the string map to display. If a name is not provided, a list of all the configured string maps is shown.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the string map to display. If a name is not provided, a list of all the configured string maps is shown.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* pattern that can be bound to policystringmap.
	* </pre>
	*/
	public policystringmap_pattern_binding[] get_policystringmap_pattern_bindings() throws Exception {
		return this.policystringmap_pattern_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		policystringmap_binding_response result = (policystringmap_binding_response) service.get_payload_formatter().string_to_resource(policystringmap_binding_response.class, response);
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
		return result.policystringmap_binding;
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
	* Use this API to fetch policystringmap_binding resource of given name .
	*/
	public static policystringmap_binding get(nitro_service service, String name) throws Exception{
		policystringmap_binding obj = new policystringmap_binding();
		obj.set_name(name);
		policystringmap_binding response = (policystringmap_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch policystringmap_binding resources of given names .
	*/
	public static policystringmap_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			policystringmap_binding response[] = new policystringmap_binding[name.length];
			policystringmap_binding obj[] = new policystringmap_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new policystringmap_binding();
				obj[i].set_name(name[i]);
				response[i] = (policystringmap_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}