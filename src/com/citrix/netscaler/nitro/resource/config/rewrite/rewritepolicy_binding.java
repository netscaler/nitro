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

package com.citrix.netscaler.nitro.resource.config.rewrite;

import com.citrix.netscaler.nitro.resource.config.rewrite.rewritepolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.rewrite.rewritepolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.rewrite.rewritepolicy_rewriteglobal_binding;
import com.citrix.netscaler.nitro.resource.config.rewrite.rewritepolicy_rewritepolicylabel_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rewritepolicy_binding_response extends base_response
{
	public rewritepolicy_binding[] rewritepolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to rewritepolicy_binding. 
	*/

public class rewritepolicy_binding extends base_resource
{
	private String name;
	private rewritepolicy_csvserver_binding	rewritepolicy_csvserver_binding[] = null;
	private rewritepolicy_lbvserver_binding	rewritepolicy_lbvserver_binding[] = null;
	private rewritepolicy_rewriteglobal_binding	rewritepolicy_rewriteglobal_binding[] = null;
	private rewritepolicy_rewritepolicylabel_binding	rewritepolicy_rewritepolicylabel_binding[] = null;

	/**
	* <pre>
	* Name of the rewrite policy.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the rewrite policy.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* lbvserver that can be bound to rewritepolicy.
	* </pre>
	*/
	public rewritepolicy_lbvserver_binding[] get_rewritepolicy_lbvserver_bindings() throws Exception {
		return this.rewritepolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* rewritepolicylabel that can be bound to rewritepolicy.
	* </pre>
	*/
	public rewritepolicy_rewritepolicylabel_binding[] get_rewritepolicy_rewritepolicylabel_bindings() throws Exception {
		return this.rewritepolicy_rewritepolicylabel_binding;
	}

	/**
	* <pre>
	* rewriteglobal that can be bound to rewritepolicy.
	* </pre>
	*/
	public rewritepolicy_rewriteglobal_binding[] get_rewritepolicy_rewriteglobal_bindings() throws Exception {
		return this.rewritepolicy_rewriteglobal_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to rewritepolicy.
	* </pre>
	*/
	public rewritepolicy_csvserver_binding[] get_rewritepolicy_csvserver_bindings() throws Exception {
		return this.rewritepolicy_csvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rewritepolicy_binding_response result = (rewritepolicy_binding_response) service.get_payload_formatter().string_to_resource(rewritepolicy_binding_response.class, response);
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
		return result.rewritepolicy_binding;
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
	* Use this API to fetch rewritepolicy_binding resource of given name .
	*/
	public static rewritepolicy_binding get(nitro_service service, String name) throws Exception{
		rewritepolicy_binding obj = new rewritepolicy_binding();
		obj.set_name(name);
		rewritepolicy_binding response = (rewritepolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch rewritepolicy_binding resources of given names .
	*/
	public static rewritepolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			rewritepolicy_binding response[] = new rewritepolicy_binding[name.length];
			rewritepolicy_binding obj[] = new rewritepolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new rewritepolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (rewritepolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}