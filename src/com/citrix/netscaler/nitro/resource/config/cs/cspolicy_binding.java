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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.config.cs.cspolicy_cspolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.cs.cspolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.cs.cspolicy_crvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cspolicy_binding_response extends base_response
{
	public cspolicy_binding[] cspolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to cspolicy_binding. 
	*/

public class cspolicy_binding extends base_resource
{
	private String policyname;
	private cspolicy_cspolicylabel_binding	cspolicy_cspolicylabel_binding[] = null;
	private cspolicy_csvserver_binding	cspolicy_csvserver_binding[] = null;
	private cspolicy_crvserver_binding	cspolicy_crvserver_binding[] = null;

	/**
	* <pre>
	* The name of the policy to be displayed. if no name is given then all policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the policy to be displayed. if no name is given then all policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* cspolicylabel that can be bound to cspolicy.
	* </pre>
	*/
	public cspolicy_cspolicylabel_binding[] get_cspolicy_cspolicylabel_bindings() throws Exception {
		return this.cspolicy_cspolicylabel_binding;
	}

	/**
	* <pre>
	* crvserver that can be bound to cspolicy.
	* </pre>
	*/
	public cspolicy_crvserver_binding[] get_cspolicy_crvserver_bindings() throws Exception {
		return this.cspolicy_crvserver_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to cspolicy.
	* </pre>
	*/
	public cspolicy_csvserver_binding[] get_cspolicy_csvserver_bindings() throws Exception {
		return this.cspolicy_csvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cspolicy_binding_response result = (cspolicy_binding_response) service.get_payload_formatter().string_to_resource(cspolicy_binding_response.class, response);
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
		return result.cspolicy_binding;
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
	* Use this API to fetch cspolicy_binding resource of given name .
	*/
	public static cspolicy_binding get(nitro_service service, String policyname) throws Exception{
		cspolicy_binding obj = new cspolicy_binding();
		obj.set_policyname(policyname);
		cspolicy_binding response = (cspolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cspolicy_binding resources of given names .
	*/
	public static cspolicy_binding[] get(nitro_service service, String policyname[]) throws Exception{
		if (policyname !=null && policyname.length>0) {
			cspolicy_binding response[] = new cspolicy_binding[policyname.length];
			cspolicy_binding obj[] = new cspolicy_binding[policyname.length];
			for (int i=0;i<policyname.length;i++) {
				obj[i] = new cspolicy_binding();
				obj[i].set_policyname(policyname[i]);
				response[i] = (cspolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}