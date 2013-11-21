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

import com.citrix.netscaler.nitro.resource.config.authentication.authenticationnegotiatepolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationnegotiatepolicy_binding_response extends base_response
{
	public authenticationnegotiatepolicy_binding[] authenticationnegotiatepolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to authenticationnegotiatepolicy_binding. 
	*/

public class authenticationnegotiatepolicy_binding extends base_resource
{
	private String name;
	private authenticationnegotiatepolicy_authenticationvserver_binding	authenticationnegotiatepolicy_authenticationvserver_binding[] = null;

	/**
	* <pre>
	* Name of the negotiate policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the negotiate policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to authenticationnegotiatepolicy.
	* </pre>
	*/
	public authenticationnegotiatepolicy_authenticationvserver_binding[] get_authenticationnegotiatepolicy_authenticationvserver_bindings() throws Exception {
		return this.authenticationnegotiatepolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationnegotiatepolicy_binding_response result = (authenticationnegotiatepolicy_binding_response) service.get_payload_formatter().string_to_resource(authenticationnegotiatepolicy_binding_response.class, response);
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
		return result.authenticationnegotiatepolicy_binding;
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
	* Use this API to fetch authenticationnegotiatepolicy_binding resource of given name .
	*/
	public static authenticationnegotiatepolicy_binding get(nitro_service service, String name) throws Exception{
		authenticationnegotiatepolicy_binding obj = new authenticationnegotiatepolicy_binding();
		obj.set_name(name);
		authenticationnegotiatepolicy_binding response = (authenticationnegotiatepolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationnegotiatepolicy_binding resources of given names .
	*/
	public static authenticationnegotiatepolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationnegotiatepolicy_binding response[] = new authenticationnegotiatepolicy_binding[name.length];
			authenticationnegotiatepolicy_binding obj[] = new authenticationnegotiatepolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationnegotiatepolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (authenticationnegotiatepolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}