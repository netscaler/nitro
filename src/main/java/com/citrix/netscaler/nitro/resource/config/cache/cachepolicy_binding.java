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

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.config.cache.cachepolicy_cacheglobal_binding;
import com.citrix.netscaler.nitro.resource.config.cache.cachepolicy_cachepolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.cache.cachepolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.cache.cachepolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cachepolicy_binding_response extends base_response
{
	public cachepolicy_binding[] cachepolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to cachepolicy_binding. 
	*/

public class cachepolicy_binding extends base_resource
{
	private String policyname;
	private cachepolicy_cacheglobal_binding	cachepolicy_cacheglobal_binding[] = null;
	private cachepolicy_cachepolicylabel_binding	cachepolicy_cachepolicylabel_binding[] = null;
	private cachepolicy_csvserver_binding	cachepolicy_csvserver_binding[] = null;
	private cachepolicy_lbvserver_binding	cachepolicy_lbvserver_binding[] = null;

	/**
	* <pre>
	* Name of the cache policy about which to display details.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name of the cache policy about which to display details.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* cachepolicylabel that can be bound to cachepolicy.
	* </pre>
	*/
	public cachepolicy_cachepolicylabel_binding[] get_cachepolicy_cachepolicylabel_bindings() throws Exception {
		return this.cachepolicy_cachepolicylabel_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to cachepolicy.
	* </pre>
	*/
	public cachepolicy_lbvserver_binding[] get_cachepolicy_lbvserver_bindings() throws Exception {
		return this.cachepolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* cacheglobal that can be bound to cachepolicy.
	* </pre>
	*/
	public cachepolicy_cacheglobal_binding[] get_cachepolicy_cacheglobal_bindings() throws Exception {
		return this.cachepolicy_cacheglobal_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to cachepolicy.
	* </pre>
	*/
	public cachepolicy_csvserver_binding[] get_cachepolicy_csvserver_bindings() throws Exception {
		return this.cachepolicy_csvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cachepolicy_binding_response result = (cachepolicy_binding_response) service.get_payload_formatter().string_to_resource(cachepolicy_binding_response.class, response);
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
		return result.cachepolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.policyname;
	}

	/**
	* Use this API to fetch cachepolicy_binding resource of given name .
	*/
	public static cachepolicy_binding get(nitro_service service, String policyname) throws Exception{
		cachepolicy_binding obj = new cachepolicy_binding();
		obj.set_policyname(policyname);
		cachepolicy_binding response = (cachepolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cachepolicy_binding resources of given names .
	*/
	public static cachepolicy_binding[] get(nitro_service service, String policyname[]) throws Exception{
		if (policyname !=null && policyname.length>0) {
			cachepolicy_binding response[] = new cachepolicy_binding[policyname.length];
			cachepolicy_binding obj[] = new cachepolicy_binding[policyname.length];
			for (int i=0;i<policyname.length;i++) {
				obj[i] = new cachepolicy_binding();
				obj[i].set_policyname(policyname[i]);
				response[i] = (cachepolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}