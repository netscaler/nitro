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

import com.citrix.netscaler.nitro.resource.config.cache.cachepolicylabel_cachepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cache.cachepolicylabel_policybinding_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cachepolicylabel_binding_response extends base_response
{
	public cachepolicylabel_binding[] cachepolicylabel_binding;
}
/**
	* Binding class showing the resources that can be bound to cachepolicylabel_binding. 
	*/

public class cachepolicylabel_binding extends base_resource
{
	private String labelname;
	private cachepolicylabel_cachepolicy_binding	cachepolicylabel_cachepolicy_binding[] = null;
	private cachepolicylabel_policybinding_binding	cachepolicylabel_policybinding_binding[] = null;

	/**
	* <pre>
	* Name of the cache-policy label about which to display information.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the cache-policy label about which to display information.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* policybinding that can be bound to cachepolicylabel.
	* </pre>
	*/
	public cachepolicylabel_policybinding_binding[] get_cachepolicylabel_policybinding_bindings() throws Exception {
		return this.cachepolicylabel_policybinding_binding;
	}

	/**
	* <pre>
	* cachepolicy that can be bound to cachepolicylabel.
	* </pre>
	*/
	public cachepolicylabel_cachepolicy_binding[] get_cachepolicylabel_cachepolicy_bindings() throws Exception {
		return this.cachepolicylabel_cachepolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cachepolicylabel_binding_response result = (cachepolicylabel_binding_response) service.get_payload_formatter().string_to_resource(cachepolicylabel_binding_response.class, response);
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
		return result.cachepolicylabel_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to fetch cachepolicylabel_binding resource of given name .
	*/
	public static cachepolicylabel_binding get(nitro_service service, String labelname) throws Exception{
		cachepolicylabel_binding obj = new cachepolicylabel_binding();
		obj.set_labelname(labelname);
		cachepolicylabel_binding response = (cachepolicylabel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cachepolicylabel_binding resources of given names .
	*/
	public static cachepolicylabel_binding[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			cachepolicylabel_binding response[] = new cachepolicylabel_binding[labelname.length];
			cachepolicylabel_binding obj[] = new cachepolicylabel_binding[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new cachepolicylabel_binding();
				obj[i].set_labelname(labelname[i]);
				response[i] = (cachepolicylabel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}