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

package com.citrix.netscaler.nitro.resource.config.authorization;

import com.citrix.netscaler.nitro.resource.config.authorization.authorizationpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authorization.authorizationpolicy_authorizationpolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.authorization.authorizationpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authorization.authorizationpolicy_aaagroup_binding;
import com.citrix.netscaler.nitro.resource.config.authorization.authorizationpolicy_aaauser_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authorizationpolicy_binding_response extends base_response
{
	public authorizationpolicy_binding[] authorizationpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to authorizationpolicy_binding. 
	*/

public class authorizationpolicy_binding extends base_resource
{
	private String name;
	private authorizationpolicy_csvserver_binding	authorizationpolicy_csvserver_binding[] = null;
	private authorizationpolicy_authorizationpolicylabel_binding	authorizationpolicy_authorizationpolicylabel_binding[] = null;
	private authorizationpolicy_lbvserver_binding	authorizationpolicy_lbvserver_binding[] = null;
	private authorizationpolicy_aaagroup_binding	authorizationpolicy_aaagroup_binding[] = null;
	private authorizationpolicy_aaauser_binding	authorizationpolicy_aaauser_binding[] = null;

	/**
	* <pre>
	* Name of the authorization policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the authorization policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* csvserver that can be bound to authorizationpolicy.
	* </pre>
	*/
	public authorizationpolicy_csvserver_binding[] get_authorizationpolicy_csvserver_bindings() throws Exception {
		return this.authorizationpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* authorizationpolicylabel that can be bound to authorizationpolicy.
	* </pre>
	*/
	public authorizationpolicy_authorizationpolicylabel_binding[] get_authorizationpolicy_authorizationpolicylabel_bindings() throws Exception {
		return this.authorizationpolicy_authorizationpolicylabel_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to authorizationpolicy.
	* </pre>
	*/
	public authorizationpolicy_lbvserver_binding[] get_authorizationpolicy_lbvserver_bindings() throws Exception {
		return this.authorizationpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* aaauser that can be bound to authorizationpolicy.
	* </pre>
	*/
	public authorizationpolicy_aaauser_binding[] get_authorizationpolicy_aaauser_bindings() throws Exception {
		return this.authorizationpolicy_aaauser_binding;
	}

	/**
	* <pre>
	* aaagroup that can be bound to authorizationpolicy.
	* </pre>
	*/
	public authorizationpolicy_aaagroup_binding[] get_authorizationpolicy_aaagroup_bindings() throws Exception {
		return this.authorizationpolicy_aaagroup_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authorizationpolicy_binding_response result = (authorizationpolicy_binding_response) service.get_payload_formatter().string_to_resource(authorizationpolicy_binding_response.class, response);
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
		return result.authorizationpolicy_binding;
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
	* Use this API to fetch authorizationpolicy_binding resource of given name .
	*/
	public static authorizationpolicy_binding get(nitro_service service, String name) throws Exception{
		authorizationpolicy_binding obj = new authorizationpolicy_binding();
		obj.set_name(name);
		authorizationpolicy_binding response = (authorizationpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authorizationpolicy_binding resources of given names .
	*/
	public static authorizationpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authorizationpolicy_binding response[] = new authorizationpolicy_binding[name.length];
			authorizationpolicy_binding obj[] = new authorizationpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authorizationpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (authorizationpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}