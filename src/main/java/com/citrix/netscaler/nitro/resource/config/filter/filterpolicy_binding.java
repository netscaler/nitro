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

package com.citrix.netscaler.nitro.resource.config.filter;

import com.citrix.netscaler.nitro.resource.config.filter.filterpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.filter.filterpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.filter.filterpolicy_crvserver_binding;
import com.citrix.netscaler.nitro.resource.config.filter.filterpolicy_filterglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class filterpolicy_binding_response extends base_response
{
	public filterpolicy_binding[] filterpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to filterpolicy_binding. 
	*/

public class filterpolicy_binding extends base_resource
{
	private String name;
	private filterpolicy_csvserver_binding	filterpolicy_csvserver_binding[] = null;
	private filterpolicy_lbvserver_binding	filterpolicy_lbvserver_binding[] = null;
	private filterpolicy_crvserver_binding	filterpolicy_crvserver_binding[] = null;
	private filterpolicy_filterglobal_binding	filterpolicy_filterglobal_binding[] = null;

	/**
	* <pre>
	* Name of the filter policy to be displayed. If a name is not provided, information about all the filter policies is shown.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the filter policy to be displayed. If a name is not provided, information about all the filter policies is shown.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* crvserver that can be bound to filterpolicy.
	* </pre>
	*/
	public filterpolicy_crvserver_binding[] get_filterpolicy_crvserver_bindings() throws Exception {
		return this.filterpolicy_crvserver_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to filterpolicy.
	* </pre>
	*/
	public filterpolicy_lbvserver_binding[] get_filterpolicy_lbvserver_bindings() throws Exception {
		return this.filterpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to filterpolicy.
	* </pre>
	*/
	public filterpolicy_csvserver_binding[] get_filterpolicy_csvserver_bindings() throws Exception {
		return this.filterpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* filterglobal that can be bound to filterpolicy.
	* </pre>
	*/
	public filterpolicy_filterglobal_binding[] get_filterpolicy_filterglobal_bindings() throws Exception {
		return this.filterpolicy_filterglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		filterpolicy_binding_response result = (filterpolicy_binding_response) service.get_payload_formatter().string_to_resource(filterpolicy_binding_response.class, response);
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
		return result.filterpolicy_binding;
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
	* Use this API to fetch filterpolicy_binding resource of given name .
	*/
	public static filterpolicy_binding get(nitro_service service, String name) throws Exception{
		filterpolicy_binding obj = new filterpolicy_binding();
		obj.set_name(name);
		filterpolicy_binding response = (filterpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch filterpolicy_binding resources of given names .
	*/
	public static filterpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			filterpolicy_binding response[] = new filterpolicy_binding[name.length];
			filterpolicy_binding obj[] = new filterpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new filterpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (filterpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}