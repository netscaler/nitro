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

import com.citrix.netscaler.nitro.resource.config.authentication.authenticationcertpolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationcertpolicy_systemglobal_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationcertpolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationcertpolicy_vpnglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationcertpolicy_binding_response extends base_response
{
	public authenticationcertpolicy_binding[] authenticationcertpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to authenticationcertpolicy_binding. 
	*/

public class authenticationcertpolicy_binding extends base_resource
{
	private String name;
	private authenticationcertpolicy_vpnvserver_binding	authenticationcertpolicy_vpnvserver_binding[] = null;
	private authenticationcertpolicy_systemglobal_binding	authenticationcertpolicy_systemglobal_binding[] = null;
	private authenticationcertpolicy_authenticationvserver_binding	authenticationcertpolicy_authenticationvserver_binding[] = null;
	private authenticationcertpolicy_vpnglobal_binding	authenticationcertpolicy_vpnglobal_binding[] = null;

	/**
	* <pre>
	* Name of the client cert authentication policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the client cert authentication policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to authenticationcertpolicy.
	* </pre>
	*/
	public authenticationcertpolicy_authenticationvserver_binding[] get_authenticationcertpolicy_authenticationvserver_bindings() throws Exception {
		return this.authenticationcertpolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to authenticationcertpolicy.
	* </pre>
	*/
	public authenticationcertpolicy_vpnvserver_binding[] get_authenticationcertpolicy_vpnvserver_bindings() throws Exception {
		return this.authenticationcertpolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* vpnglobal that can be bound to authenticationcertpolicy.
	* </pre>
	*/
	public authenticationcertpolicy_vpnglobal_binding[] get_authenticationcertpolicy_vpnglobal_bindings() throws Exception {
		return this.authenticationcertpolicy_vpnglobal_binding;
	}

	/**
	* <pre>
	* systemglobal that can be bound to authenticationcertpolicy.
	* </pre>
	*/
	public authenticationcertpolicy_systemglobal_binding[] get_authenticationcertpolicy_systemglobal_bindings() throws Exception {
		return this.authenticationcertpolicy_systemglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationcertpolicy_binding_response result = (authenticationcertpolicy_binding_response) service.get_payload_formatter().string_to_resource(authenticationcertpolicy_binding_response.class, response);
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
		return result.authenticationcertpolicy_binding;
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
	* Use this API to fetch authenticationcertpolicy_binding resource of given name .
	*/
	public static authenticationcertpolicy_binding get(nitro_service service, String name) throws Exception{
		authenticationcertpolicy_binding obj = new authenticationcertpolicy_binding();
		obj.set_name(name);
		authenticationcertpolicy_binding response = (authenticationcertpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationcertpolicy_binding resources of given names .
	*/
	public static authenticationcertpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationcertpolicy_binding response[] = new authenticationcertpolicy_binding[name.length];
			authenticationcertpolicy_binding obj[] = new authenticationcertpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationcertpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (authenticationcertpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}