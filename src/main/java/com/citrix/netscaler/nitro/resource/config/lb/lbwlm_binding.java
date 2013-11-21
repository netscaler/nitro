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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.config.lb.lbwlm_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbwlm_binding_response extends base_response
{
	public lbwlm_binding[] lbwlm_binding;
}
/**
	* Binding class showing the resources that can be bound to lbwlm_binding. 
	*/

public class lbwlm_binding extends base_resource
{
	private String wlmname;
	private lbwlm_lbvserver_binding	lbwlm_lbvserver_binding[] = null;

	/**
	* <pre>
	* The name of the work load manager.<br> Minimum length =  1
	* </pre>
	*/
	public void set_wlmname(String wlmname) throws Exception{
		this.wlmname = wlmname;
	}

	/**
	* <pre>
	* The name of the work load manager.<br> Minimum length =  1
	* </pre>
	*/
	public String get_wlmname() throws Exception {
		return this.wlmname;
	}

	/**
	* <pre>
	* lbvserver that can be bound to lbwlm.
	* </pre>
	*/
	public lbwlm_lbvserver_binding[] get_lbwlm_lbvserver_bindings() throws Exception {
		return this.lbwlm_lbvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbwlm_binding_response result = (lbwlm_binding_response) service.get_payload_formatter().string_to_resource(lbwlm_binding_response.class, response);
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
		return result.lbwlm_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.wlmname;
	}

	/**
	* Use this API to fetch lbwlm_binding resource of given name .
	*/
	public static lbwlm_binding get(nitro_service service, String wlmname) throws Exception{
		lbwlm_binding obj = new lbwlm_binding();
		obj.set_wlmname(wlmname);
		lbwlm_binding response = (lbwlm_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbwlm_binding resources of given names .
	*/
	public static lbwlm_binding[] get(nitro_service service, String wlmname[]) throws Exception{
		if (wlmname !=null && wlmname.length>0) {
			lbwlm_binding response[] = new lbwlm_binding[wlmname.length];
			lbwlm_binding obj[] = new lbwlm_binding[wlmname.length];
			for (int i=0;i<wlmname.length;i++) {
				obj[i] = new lbwlm_binding();
				obj[i].set_wlmname(wlmname[i]);
				response[i] = (lbwlm_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}