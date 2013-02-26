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

package com.citrix.netscaler.nitro.resource.config.autoscale;

import com.citrix.netscaler.nitro.resource.config.autoscale.autoscalepolicy_nstimer_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class autoscalepolicy_binding_response extends base_response
{
	public autoscalepolicy_binding[] autoscalepolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to autoscalepolicy_binding. 
	*/

public class autoscalepolicy_binding extends base_resource
{
	private String name;
	private autoscalepolicy_nstimer_binding	autoscalepolicy_nstimer_binding[] = null;

	/**
	* <pre>
	* The name of the autoscale policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the autoscale policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* nstimer that can be bound to autoscalepolicy.
	* </pre>
	*/
	public autoscalepolicy_nstimer_binding[] get_autoscalepolicy_nstimer_bindings() throws Exception {
		return this.autoscalepolicy_nstimer_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		autoscalepolicy_binding_response result = (autoscalepolicy_binding_response) service.get_payload_formatter().string_to_resource(autoscalepolicy_binding_response.class, response);
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
		return result.autoscalepolicy_binding;
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
	* Use this API to fetch autoscalepolicy_binding resource of given name .
	*/
	public static autoscalepolicy_binding get(nitro_service service, String name) throws Exception{
		autoscalepolicy_binding obj = new autoscalepolicy_binding();
		obj.set_name(name);
		autoscalepolicy_binding response = (autoscalepolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch autoscalepolicy_binding resources of given names .
	*/
	public static autoscalepolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			autoscalepolicy_binding response[] = new autoscalepolicy_binding[name.length];
			autoscalepolicy_binding obj[] = new autoscalepolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new autoscalepolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (autoscalepolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}