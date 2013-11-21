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

import com.citrix.netscaler.nitro.resource.config.dns.dnszone_domain_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnszone_binding_response extends base_response
{
	public dnszone_binding[] dnszone_binding;
}
/**
	* Binding class showing the resources that can be bound to dnszone_binding. 
	*/

public class dnszone_binding extends base_resource
{
	private String zonename;
	private dnszone_domain_binding	dnszone_domain_binding[] = null;

	/**
	* <pre>
	* Name of the zone. Mutually exclusive with the type parameter.<br> Minimum length =  1
	* </pre>
	*/
	public void set_zonename(String zonename) throws Exception{
		this.zonename = zonename;
	}

	/**
	* <pre>
	* Name of the zone. Mutually exclusive with the type parameter.<br> Minimum length =  1
	* </pre>
	*/
	public String get_zonename() throws Exception {
		return this.zonename;
	}

	/**
	* <pre>
	* domain that can be bound to dnszone.
	* </pre>
	*/
	public dnszone_domain_binding[] get_dnszone_domain_bindings() throws Exception {
		return this.dnszone_domain_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnszone_binding_response result = (dnszone_binding_response) service.get_payload_formatter().string_to_resource(dnszone_binding_response.class, response);
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
		return result.dnszone_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.zonename;
	}

	/**
	* Use this API to fetch dnszone_binding resource of given name .
	*/
	public static dnszone_binding get(nitro_service service, String zonename) throws Exception{
		dnszone_binding obj = new dnszone_binding();
		obj.set_zonename(zonename);
		dnszone_binding response = (dnszone_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnszone_binding resources of given names .
	*/
	public static dnszone_binding[] get(nitro_service service, String zonename[]) throws Exception{
		if (zonename !=null && zonename.length>0) {
			dnszone_binding response[] = new dnszone_binding[zonename.length];
			dnszone_binding obj[] = new dnszone_binding[zonename.length];
			for (int i=0;i<zonename.length;i++) {
				obj[i] = new dnszone_binding();
				obj[i].set_zonename(zonename[i]);
				response[i] = (dnszone_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}