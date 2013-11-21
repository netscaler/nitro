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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.config.dns.dnspolicy64_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnspolicy64_binding_response extends base_response
{
	public dnspolicy64_binding[] dnspolicy64_binding;
}
/**
	* Binding class showing the resources that can be bound to dnspolicy64_binding. 
	*/

public class dnspolicy64_binding extends base_resource
{
	private String name;
	private dnspolicy64_lbvserver_binding	dnspolicy64_lbvserver_binding[] = null;

	/**
	* <pre>
	* Name of the DNS64 policy.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the DNS64 policy.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* lbvserver that can be bound to dnspolicy64.
	* </pre>
	*/
	public dnspolicy64_lbvserver_binding[] get_dnspolicy64_lbvserver_bindings() throws Exception {
		return this.dnspolicy64_lbvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnspolicy64_binding_response result = (dnspolicy64_binding_response) service.get_payload_formatter().string_to_resource(dnspolicy64_binding_response.class, response);
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
		return result.dnspolicy64_binding;
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
	* Use this API to fetch dnspolicy64_binding resource of given name .
	*/
	public static dnspolicy64_binding get(nitro_service service, String name) throws Exception{
		dnspolicy64_binding obj = new dnspolicy64_binding();
		obj.set_name(name);
		dnspolicy64_binding response = (dnspolicy64_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnspolicy64_binding resources of given names .
	*/
	public static dnspolicy64_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			dnspolicy64_binding response[] = new dnspolicy64_binding[name.length];
			dnspolicy64_binding obj[] = new dnspolicy64_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new dnspolicy64_binding();
				obj[i].set_name(name[i]);
				response[i] = (dnspolicy64_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}