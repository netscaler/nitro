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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.config.gslb.gslbvserver_gslbservice_binding;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbvserver_domain_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbvserver_binding_response extends base_response
{
	public gslbvserver_binding[] gslbvserver_binding;
}
/**
	* Binding class showing the resources that can be bound to gslbvserver_binding. 
	*/

public class gslbvserver_binding extends base_resource
{
	private String name;
	private gslbvserver_gslbservice_binding	gslbvserver_gslbservice_binding[] = null;
	private gslbvserver_domain_binding	gslbvserver_domain_binding[] = null;

	/**
	* <pre>
	* The name of the GSLB virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the GSLB virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* gslbservice that can be bound to gslbvserver.
	* </pre>
	*/
	public gslbvserver_gslbservice_binding[] get_gslbvserver_gslbservice_bindings() throws Exception {
		return this.gslbvserver_gslbservice_binding;
	}

	/**
	* <pre>
	* domain that can be bound to gslbvserver.
	* </pre>
	*/
	public gslbvserver_domain_binding[] get_gslbvserver_domain_bindings() throws Exception {
		return this.gslbvserver_domain_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbvserver_binding_response result = (gslbvserver_binding_response) service.get_payload_formatter().string_to_resource(gslbvserver_binding_response.class, response);
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
		return result.gslbvserver_binding;
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
	* Use this API to fetch gslbvserver_binding resource of given name .
	*/
	public static gslbvserver_binding get(nitro_service service, String name) throws Exception{
		gslbvserver_binding obj = new gslbvserver_binding();
		obj.set_name(name);
		gslbvserver_binding response = (gslbvserver_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch gslbvserver_binding resources of given names .
	*/
	public static gslbvserver_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			gslbvserver_binding response[] = new gslbvserver_binding[name.length];
			gslbvserver_binding obj[] = new gslbvserver_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new gslbvserver_binding();
				obj[i].set_name(name[i]);
				response[i] = (gslbvserver_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}