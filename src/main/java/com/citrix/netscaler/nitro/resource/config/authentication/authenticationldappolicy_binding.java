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

import com.citrix.netscaler.nitro.resource.config.authentication.authenticationldappolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationldappolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationldappolicy_systemglobal_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationldappolicy_vpnglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationldappolicy_binding_response extends base_response
{
	public authenticationldappolicy_binding[] authenticationldappolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to authenticationldappolicy_binding. 
	*/

public class authenticationldappolicy_binding extends base_resource
{
	private String name;
	private authenticationldappolicy_vpnvserver_binding	authenticationldappolicy_vpnvserver_binding[] = null;
	private authenticationldappolicy_authenticationvserver_binding	authenticationldappolicy_authenticationvserver_binding[] = null;
	private authenticationldappolicy_systemglobal_binding	authenticationldappolicy_systemglobal_binding[] = null;
	private authenticationldappolicy_vpnglobal_binding	authenticationldappolicy_vpnglobal_binding[] = null;

	/**
	* <pre>
	* Name of the LDAP policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the LDAP policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to authenticationldappolicy.
	* </pre>
	*/
	public authenticationldappolicy_authenticationvserver_binding[] get_authenticationldappolicy_authenticationvserver_bindings() throws Exception {
		return this.authenticationldappolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* systemglobal that can be bound to authenticationldappolicy.
	* </pre>
	*/
	public authenticationldappolicy_systemglobal_binding[] get_authenticationldappolicy_systemglobal_bindings() throws Exception {
		return this.authenticationldappolicy_systemglobal_binding;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to authenticationldappolicy.
	* </pre>
	*/
	public authenticationldappolicy_vpnvserver_binding[] get_authenticationldappolicy_vpnvserver_bindings() throws Exception {
		return this.authenticationldappolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* vpnglobal that can be bound to authenticationldappolicy.
	* </pre>
	*/
	public authenticationldappolicy_vpnglobal_binding[] get_authenticationldappolicy_vpnglobal_bindings() throws Exception {
		return this.authenticationldappolicy_vpnglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationldappolicy_binding_response result = (authenticationldappolicy_binding_response) service.get_payload_formatter().string_to_resource(authenticationldappolicy_binding_response.class, response);
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
		return result.authenticationldappolicy_binding;
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
	* Use this API to fetch authenticationldappolicy_binding resource of given name .
	*/
	public static authenticationldappolicy_binding get(nitro_service service, String name) throws Exception{
		authenticationldappolicy_binding obj = new authenticationldappolicy_binding();
		obj.set_name(name);
		authenticationldappolicy_binding response = (authenticationldappolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationldappolicy_binding resources of given names .
	*/
	public static authenticationldappolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationldappolicy_binding response[] = new authenticationldappolicy_binding[name.length];
			authenticationldappolicy_binding obj[] = new authenticationldappolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationldappolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (authenticationldappolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}