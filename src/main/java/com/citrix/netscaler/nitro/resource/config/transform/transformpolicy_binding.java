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

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.config.transform.transformpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.transform.transformpolicy_transformpolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.transform.transformpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.transform.transformpolicy_transformglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformpolicy_binding_response extends base_response
{
	public transformpolicy_binding[] transformpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to transformpolicy_binding. 
	*/

public class transformpolicy_binding extends base_resource
{
	private String name;
	private transformpolicy_csvserver_binding	transformpolicy_csvserver_binding[] = null;
	private transformpolicy_transformpolicylabel_binding	transformpolicy_transformpolicylabel_binding[] = null;
	private transformpolicy_lbvserver_binding	transformpolicy_lbvserver_binding[] = null;
	private transformpolicy_transformglobal_binding	transformpolicy_transformglobal_binding[] = null;

	/**
	* <pre>
	* URL Transformation policy name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* URL Transformation policy name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* csvserver that can be bound to transformpolicy.
	* </pre>
	*/
	public transformpolicy_csvserver_binding[] get_transformpolicy_csvserver_bindings() throws Exception {
		return this.transformpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* transformglobal that can be bound to transformpolicy.
	* </pre>
	*/
	public transformpolicy_transformglobal_binding[] get_transformpolicy_transformglobal_bindings() throws Exception {
		return this.transformpolicy_transformglobal_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to transformpolicy.
	* </pre>
	*/
	public transformpolicy_lbvserver_binding[] get_transformpolicy_lbvserver_bindings() throws Exception {
		return this.transformpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* transformpolicylabel that can be bound to transformpolicy.
	* </pre>
	*/
	public transformpolicy_transformpolicylabel_binding[] get_transformpolicy_transformpolicylabel_bindings() throws Exception {
		return this.transformpolicy_transformpolicylabel_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformpolicy_binding_response result = (transformpolicy_binding_response) service.get_payload_formatter().string_to_resource(transformpolicy_binding_response.class, response);
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
		return result.transformpolicy_binding;
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
	* Use this API to fetch transformpolicy_binding resource of given name .
	*/
	public static transformpolicy_binding get(nitro_service service, String name) throws Exception{
		transformpolicy_binding obj = new transformpolicy_binding();
		obj.set_name(name);
		transformpolicy_binding response = (transformpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch transformpolicy_binding resources of given names .
	*/
	public static transformpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			transformpolicy_binding response[] = new transformpolicy_binding[name.length];
			transformpolicy_binding obj[] = new transformpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new transformpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (transformpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}