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

import com.citrix.netscaler.nitro.resource.config.authentication.authenticationsamlpolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationsamlpolicy_binding_response extends base_response
{
	public authenticationsamlpolicy_binding[] authenticationsamlpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to authenticationsamlpolicy_binding. 
	*/

public class authenticationsamlpolicy_binding extends base_resource
{
	private String name;
	private authenticationsamlpolicy_authenticationvserver_binding	authenticationsamlpolicy_authenticationvserver_binding[] = null;

	/**
	* <pre>
	* The name of the SAML policy. If no name is given, all the configured SAML policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the SAML policy. If no name is given, all the configured SAML policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to authenticationsamlpolicy.
	* </pre>
	*/
	public authenticationsamlpolicy_authenticationvserver_binding[] get_authenticationsamlpolicy_authenticationvserver_bindings() throws Exception {
		return this.authenticationsamlpolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationsamlpolicy_binding_response result = (authenticationsamlpolicy_binding_response) service.get_payload_formatter().string_to_resource(authenticationsamlpolicy_binding_response.class, response);
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
		return result.authenticationsamlpolicy_binding;
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
	* Use this API to fetch authenticationsamlpolicy_binding resource of given name .
	*/
	public static authenticationsamlpolicy_binding get(nitro_service service, String name) throws Exception{
		authenticationsamlpolicy_binding obj = new authenticationsamlpolicy_binding();
		obj.set_name(name);
		authenticationsamlpolicy_binding response = (authenticationsamlpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationsamlpolicy_binding resources of given names .
	*/
	public static authenticationsamlpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationsamlpolicy_binding response[] = new authenticationsamlpolicy_binding[name.length];
			authenticationsamlpolicy_binding obj[] = new authenticationsamlpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationsamlpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (authenticationsamlpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}