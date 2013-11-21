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

package com.citrix.netscaler.nitro.resource.config.appflow;

import com.citrix.netscaler.nitro.resource.config.appflow.appflowpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.appflow.appflowpolicy_appflowpolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.appflow.appflowpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.appflow.appflowpolicy_appflowglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appflowpolicy_binding_response extends base_response
{
	public appflowpolicy_binding[] appflowpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to appflowpolicy_binding. 
	*/

public class appflowpolicy_binding extends base_resource
{
	private String name;
	private appflowpolicy_csvserver_binding	appflowpolicy_csvserver_binding[] = null;
	private appflowpolicy_appflowpolicylabel_binding	appflowpolicy_appflowpolicylabel_binding[] = null;
	private appflowpolicy_lbvserver_binding	appflowpolicy_lbvserver_binding[] = null;
	private appflowpolicy_appflowglobal_binding	appflowpolicy_appflowglobal_binding[] = null;

	/**
	* <pre>
	* Name of the policy about which to display detailed information.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the policy about which to display detailed information.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* appflowpolicylabel that can be bound to appflowpolicy.
	* </pre>
	*/
	public appflowpolicy_appflowpolicylabel_binding[] get_appflowpolicy_appflowpolicylabel_bindings() throws Exception {
		return this.appflowpolicy_appflowpolicylabel_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to appflowpolicy.
	* </pre>
	*/
	public appflowpolicy_csvserver_binding[] get_appflowpolicy_csvserver_bindings() throws Exception {
		return this.appflowpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to appflowpolicy.
	* </pre>
	*/
	public appflowpolicy_lbvserver_binding[] get_appflowpolicy_lbvserver_bindings() throws Exception {
		return this.appflowpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* appflowglobal that can be bound to appflowpolicy.
	* </pre>
	*/
	public appflowpolicy_appflowglobal_binding[] get_appflowpolicy_appflowglobal_bindings() throws Exception {
		return this.appflowpolicy_appflowglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appflowpolicy_binding_response result = (appflowpolicy_binding_response) service.get_payload_formatter().string_to_resource(appflowpolicy_binding_response.class, response);
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
		return result.appflowpolicy_binding;
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
	* Use this API to fetch appflowpolicy_binding resource of given name .
	*/
	public static appflowpolicy_binding get(nitro_service service, String name) throws Exception{
		appflowpolicy_binding obj = new appflowpolicy_binding();
		obj.set_name(name);
		appflowpolicy_binding response = (appflowpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appflowpolicy_binding resources of given names .
	*/
	public static appflowpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appflowpolicy_binding response[] = new appflowpolicy_binding[name.length];
			appflowpolicy_binding obj[] = new appflowpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appflowpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (appflowpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}