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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.config.ns.nslimitidentifier_nslimitsessions_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nslimitidentifier_binding_response extends base_response
{
	public nslimitidentifier_binding[] nslimitidentifier_binding;
}
/**
	* Binding class showing the resources that can be bound to nslimitidentifier_binding. 
	*/

public class nslimitidentifier_binding extends base_resource
{
	private String limitidentifier;
	private nslimitidentifier_nslimitsessions_binding	nslimitidentifier_nslimitsessions_binding[] = null;

	/**
	* <pre>
	* Name of the rate limit identifier about which to display information. If a name is not provided, information about all rate limit identifiers is shown.
	* </pre>
	*/
	public void set_limitidentifier(String limitidentifier) throws Exception{
		this.limitidentifier = limitidentifier;
	}

	/**
	* <pre>
	* Name of the rate limit identifier about which to display information. If a name is not provided, information about all rate limit identifiers is shown.
	* </pre>
	*/
	public String get_limitidentifier() throws Exception {
		return this.limitidentifier;
	}

	/**
	* <pre>
	* nslimitsessions that can be bound to nslimitidentifier.
	* </pre>
	*/
	public nslimitidentifier_nslimitsessions_binding[] get_nslimitidentifier_nslimitsessions_bindings() throws Exception {
		return this.nslimitidentifier_nslimitsessions_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nslimitidentifier_binding_response result = (nslimitidentifier_binding_response) service.get_payload_formatter().string_to_resource(nslimitidentifier_binding_response.class, response);
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
		return result.nslimitidentifier_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.limitidentifier;
	}

	/**
	* Use this API to fetch nslimitidentifier_binding resource of given name .
	*/
	public static nslimitidentifier_binding get(nitro_service service, String limitidentifier) throws Exception{
		nslimitidentifier_binding obj = new nslimitidentifier_binding();
		obj.set_limitidentifier(limitidentifier);
		nslimitidentifier_binding response = (nslimitidentifier_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nslimitidentifier_binding resources of given names .
	*/
	public static nslimitidentifier_binding[] get(nitro_service service, String limitidentifier[]) throws Exception{
		if (limitidentifier !=null && limitidentifier.length>0) {
			nslimitidentifier_binding response[] = new nslimitidentifier_binding[limitidentifier.length];
			nslimitidentifier_binding obj[] = new nslimitidentifier_binding[limitidentifier.length];
			for (int i=0;i<limitidentifier.length;i++) {
				obj[i] = new nslimitidentifier_binding();
				obj[i].set_limitidentifier(limitidentifier[i]);
				response[i] = (nslimitidentifier_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}