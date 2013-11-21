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

package com.citrix.netscaler.nitro.resource.config.policy;

import com.citrix.netscaler.nitro.resource.config.policy.policypatset_pattern_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class policypatset_binding_response extends base_response
{
	public policypatset_binding[] policypatset_binding;
}
/**
	* Binding class showing the resources that can be bound to policypatset_binding. 
	*/

public class policypatset_binding extends base_resource
{
	private String name;
	private policypatset_pattern_binding	policypatset_pattern_binding[] = null;

	/**
	* <pre>
	* Name of the pattern set for which to display the detailed information. If a name is not provided, a list of all pattern sets configured on the appliance is shown.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the pattern set for which to display the detailed information. If a name is not provided, a list of all pattern sets configured on the appliance is shown.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* pattern that can be bound to policypatset.
	* </pre>
	*/
	public policypatset_pattern_binding[] get_policypatset_pattern_bindings() throws Exception {
		return this.policypatset_pattern_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		policypatset_binding_response result = (policypatset_binding_response) service.get_payload_formatter().string_to_resource(policypatset_binding_response.class, response);
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
		return result.policypatset_binding;
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
	* Use this API to fetch policypatset_binding resource of given name .
	*/
	public static policypatset_binding get(nitro_service service, String name) throws Exception{
		policypatset_binding obj = new policypatset_binding();
		obj.set_name(name);
		policypatset_binding response = (policypatset_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch policypatset_binding resources of given names .
	*/
	public static policypatset_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			policypatset_binding response[] = new policypatset_binding[name.length];
			policypatset_binding obj[] = new policypatset_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new policypatset_binding();
				obj[i].set_name(name[i]);
				response[i] = (policypatset_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}