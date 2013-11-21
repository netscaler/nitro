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

package com.citrix.netscaler.nitro.resource.config.responder;

import com.citrix.netscaler.nitro.resource.config.responder.responderpolicy_responderpolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.responder.responderpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.responder.responderpolicy_responderglobal_binding;
import com.citrix.netscaler.nitro.resource.config.responder.responderpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderpolicy_binding_response extends base_response
{
	public responderpolicy_binding[] responderpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to responderpolicy_binding. 
	*/

public class responderpolicy_binding extends base_resource
{
	private String name;
	private responderpolicy_responderpolicylabel_binding	responderpolicy_responderpolicylabel_binding[] = null;
	private responderpolicy_csvserver_binding	responderpolicy_csvserver_binding[] = null;
	private responderpolicy_responderglobal_binding	responderpolicy_responderglobal_binding[] = null;
	private responderpolicy_lbvserver_binding	responderpolicy_lbvserver_binding[] = null;

	/**
	* <pre>
	* Name of the responder policy for which to display settings.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the responder policy for which to display settings.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* lbvserver that can be bound to responderpolicy.
	* </pre>
	*/
	public responderpolicy_lbvserver_binding[] get_responderpolicy_lbvserver_bindings() throws Exception {
		return this.responderpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* responderpolicylabel that can be bound to responderpolicy.
	* </pre>
	*/
	public responderpolicy_responderpolicylabel_binding[] get_responderpolicy_responderpolicylabel_bindings() throws Exception {
		return this.responderpolicy_responderpolicylabel_binding;
	}

	/**
	* <pre>
	* responderglobal that can be bound to responderpolicy.
	* </pre>
	*/
	public responderpolicy_responderglobal_binding[] get_responderpolicy_responderglobal_bindings() throws Exception {
		return this.responderpolicy_responderglobal_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to responderpolicy.
	* </pre>
	*/
	public responderpolicy_csvserver_binding[] get_responderpolicy_csvserver_bindings() throws Exception {
		return this.responderpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		responderpolicy_binding_response result = (responderpolicy_binding_response) service.get_payload_formatter().string_to_resource(responderpolicy_binding_response.class, response);
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
		return result.responderpolicy_binding;
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
	* Use this API to fetch responderpolicy_binding resource of given name .
	*/
	public static responderpolicy_binding get(nitro_service service, String name) throws Exception{
		responderpolicy_binding obj = new responderpolicy_binding();
		obj.set_name(name);
		responderpolicy_binding response = (responderpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch responderpolicy_binding resources of given names .
	*/
	public static responderpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			responderpolicy_binding response[] = new responderpolicy_binding[name.length];
			responderpolicy_binding obj[] = new responderpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new responderpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (responderpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}