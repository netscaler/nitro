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

package com.citrix.netscaler.nitro.resource.config.spillover;

import com.citrix.netscaler.nitro.resource.config.spillover.spilloverpolicy_gslbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.spillover.spilloverpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.spillover.spilloverpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class spilloverpolicy_binding_response extends base_response
{
	public spilloverpolicy_binding[] spilloverpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to spilloverpolicy_binding. 
	*/

public class spilloverpolicy_binding extends base_resource
{
	private String name;
	private spilloverpolicy_gslbvserver_binding	spilloverpolicy_gslbvserver_binding[] = null;
	private spilloverpolicy_csvserver_binding	spilloverpolicy_csvserver_binding[] = null;
	private spilloverpolicy_lbvserver_binding	spilloverpolicy_lbvserver_binding[] = null;

	/**
	* <pre>
	* Name of the spillover policy.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the spillover policy.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* csvserver that can be bound to spilloverpolicy.
	* </pre>
	*/
	public spilloverpolicy_csvserver_binding[] get_spilloverpolicy_csvserver_bindings() throws Exception {
		return this.spilloverpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to spilloverpolicy.
	* </pre>
	*/
	public spilloverpolicy_lbvserver_binding[] get_spilloverpolicy_lbvserver_bindings() throws Exception {
		return this.spilloverpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* gslbvserver that can be bound to spilloverpolicy.
	* </pre>
	*/
	public spilloverpolicy_gslbvserver_binding[] get_spilloverpolicy_gslbvserver_bindings() throws Exception {
		return this.spilloverpolicy_gslbvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		spilloverpolicy_binding_response result = (spilloverpolicy_binding_response) service.get_payload_formatter().string_to_resource(spilloverpolicy_binding_response.class, response);
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
		return result.spilloverpolicy_binding;
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
	* Use this API to fetch spilloverpolicy_binding resource of given name .
	*/
	public static spilloverpolicy_binding get(nitro_service service, String name) throws Exception{
		spilloverpolicy_binding obj = new spilloverpolicy_binding();
		obj.set_name(name);
		spilloverpolicy_binding response = (spilloverpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch spilloverpolicy_binding resources of given names .
	*/
	public static spilloverpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			spilloverpolicy_binding response[] = new spilloverpolicy_binding[name.length];
			spilloverpolicy_binding obj[] = new spilloverpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new spilloverpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (spilloverpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}