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

import com.citrix.netscaler.nitro.resource.config.rewrite.rewritepolicylabel_rewritepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.rewrite.rewritepolicylabel_policybinding_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rewritepolicylabel_binding_response extends base_response
{
	public rewritepolicylabel_binding[] rewritepolicylabel_binding;
}
/**
	* Binding class showing the resources that can be bound to rewritepolicylabel_binding. 
	*/

public class rewritepolicylabel_binding extends base_resource
{
	private String labelname;
	private rewritepolicylabel_rewritepolicy_binding	rewritepolicylabel_rewritepolicy_binding[] = null;
	private rewritepolicylabel_policybinding_binding	rewritepolicylabel_policybinding_binding[] = null;

	/**
	* <pre>
	* Name of the rewrite policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the rewrite policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* policybinding that can be bound to rewritepolicylabel.
	* </pre>
	*/
	public rewritepolicylabel_policybinding_binding[] get_rewritepolicylabel_policybinding_bindings() throws Exception {
		return this.rewritepolicylabel_policybinding_binding;
	}

	/**
	* <pre>
	* rewritepolicy that can be bound to rewritepolicylabel.
	* </pre>
	*/
	public rewritepolicylabel_rewritepolicy_binding[] get_rewritepolicylabel_rewritepolicy_bindings() throws Exception {
		return this.rewritepolicylabel_rewritepolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rewritepolicylabel_binding_response result = (rewritepolicylabel_binding_response) service.get_payload_formatter().string_to_resource(rewritepolicylabel_binding_response.class, response);
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
		return result.rewritepolicylabel_binding;
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
	* Use this API to fetch rewritepolicylabel_binding resource of given name .
	*/
	public static rewritepolicylabel_binding get(nitro_service service, String labelname) throws Exception{
		rewritepolicylabel_binding obj = new rewritepolicylabel_binding();
		obj.set_labelname(labelname);
		rewritepolicylabel_binding response = (rewritepolicylabel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch rewritepolicylabel_binding resources of given names .
	*/
	public static rewritepolicylabel_binding[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			rewritepolicylabel_binding response[] = new rewritepolicylabel_binding[labelname.length];
			rewritepolicylabel_binding obj[] = new rewritepolicylabel_binding[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new rewritepolicylabel_binding();
				obj[i].set_labelname(labelname[i]);
				response[i] = (rewritepolicylabel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}