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

import com.citrix.netscaler.nitro.resource.config.dns.dnspolicy_dnspolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.dns.dnspolicy_dnsglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnspolicy_binding_response extends base_response
{
	public dnspolicy_binding[] dnspolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to dnspolicy_binding. 
	*/

public class dnspolicy_binding extends base_resource
{
	private String name;
	private dnspolicy_dnspolicylabel_binding	dnspolicy_dnspolicylabel_binding[] = null;
	private dnspolicy_dnsglobal_binding	dnspolicy_dnsglobal_binding[] = null;

	/**
	* <pre>
	* Name of the dns policy.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the dns policy.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* dnsglobal that can be bound to dnspolicy.
	* </pre>
	*/
	public dnspolicy_dnsglobal_binding[] get_dnspolicy_dnsglobal_bindings() throws Exception {
		return this.dnspolicy_dnsglobal_binding;
	}

	/**
	* <pre>
	* dnspolicylabel that can be bound to dnspolicy.
	* </pre>
	*/
	public dnspolicy_dnspolicylabel_binding[] get_dnspolicy_dnspolicylabel_bindings() throws Exception {
		return this.dnspolicy_dnspolicylabel_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnspolicy_binding_response result = (dnspolicy_binding_response) service.get_payload_formatter().string_to_resource(dnspolicy_binding_response.class, response);
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
		return result.dnspolicy_binding;
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
	* Use this API to fetch dnspolicy_binding resource of given name .
	*/
	public static dnspolicy_binding get(nitro_service service, String name) throws Exception{
		dnspolicy_binding obj = new dnspolicy_binding();
		obj.set_name(name);
		dnspolicy_binding response = (dnspolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnspolicy_binding resources of given names .
	*/
	public static dnspolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			dnspolicy_binding response[] = new dnspolicy_binding[name.length];
			dnspolicy_binding obj[] = new dnspolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new dnspolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (dnspolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}