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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.config.appfw.appfwpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwpolicy_appfwglobal_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwpolicy_appfwpolicylabel_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwpolicy_binding_response extends base_response
{
	public appfwpolicy_binding[] appfwpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to appfwpolicy_binding. 
	*/

public class appfwpolicy_binding extends base_resource
{
	private String name;
	private appfwpolicy_csvserver_binding	appfwpolicy_csvserver_binding[] = null;
	private appfwpolicy_appfwglobal_binding	appfwpolicy_appfwglobal_binding[] = null;
	private appfwpolicy_lbvserver_binding	appfwpolicy_lbvserver_binding[] = null;
	private appfwpolicy_appfwpolicylabel_binding	appfwpolicy_appfwpolicylabel_binding[] = null;

	/**
	* <pre>
	* Name of the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* appfwpolicylabel that can be bound to appfwpolicy.
	* </pre>
	*/
	public appfwpolicy_appfwpolicylabel_binding[] get_appfwpolicy_appfwpolicylabel_bindings() throws Exception {
		return this.appfwpolicy_appfwpolicylabel_binding;
	}

	/**
	* <pre>
	* appfwglobal that can be bound to appfwpolicy.
	* </pre>
	*/
	public appfwpolicy_appfwglobal_binding[] get_appfwpolicy_appfwglobal_bindings() throws Exception {
		return this.appfwpolicy_appfwglobal_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to appfwpolicy.
	* </pre>
	*/
	public appfwpolicy_lbvserver_binding[] get_appfwpolicy_lbvserver_bindings() throws Exception {
		return this.appfwpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to appfwpolicy.
	* </pre>
	*/
	public appfwpolicy_csvserver_binding[] get_appfwpolicy_csvserver_bindings() throws Exception {
		return this.appfwpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwpolicy_binding_response result = (appfwpolicy_binding_response) service.get_payload_formatter().string_to_resource(appfwpolicy_binding_response.class, response);
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
		return result.appfwpolicy_binding;
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
	* Use this API to fetch appfwpolicy_binding resource of given name .
	*/
	public static appfwpolicy_binding get(nitro_service service, String name) throws Exception{
		appfwpolicy_binding obj = new appfwpolicy_binding();
		obj.set_name(name);
		appfwpolicy_binding response = (appfwpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwpolicy_binding resources of given names .
	*/
	public static appfwpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appfwpolicy_binding response[] = new appfwpolicy_binding[name.length];
			appfwpolicy_binding obj[] = new appfwpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appfwpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (appfwpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}