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

package com.citrix.netscaler.nitro.resource.config.cmp;

import com.citrix.netscaler.nitro.resource.config.cmp.cmppolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.cmp.cmppolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.cmp.cmppolicy_cmppolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.cmp.cmppolicy_cmpglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cmppolicy_binding_response extends base_response
{
	public cmppolicy_binding[] cmppolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to cmppolicy_binding. 
	*/

public class cmppolicy_binding extends base_resource
{
	private String name;
	private cmppolicy_csvserver_binding	cmppolicy_csvserver_binding[] = null;
	private cmppolicy_lbvserver_binding	cmppolicy_lbvserver_binding[] = null;
	private cmppolicy_cmppolicylabel_binding	cmppolicy_cmppolicylabel_binding[] = null;
	private cmppolicy_cmpglobal_binding	cmppolicy_cmpglobal_binding[] = null;

	/**
	* <pre>
	* The name of the HTTP compression policy whose details are to be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the HTTP compression policy whose details are to be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* csvserver that can be bound to cmppolicy.
	* </pre>
	*/
	public cmppolicy_csvserver_binding[] get_cmppolicy_csvserver_bindings() throws Exception {
		return this.cmppolicy_csvserver_binding;
	}

	/**
	* <pre>
	* cmpglobal that can be bound to cmppolicy.
	* </pre>
	*/
	public cmppolicy_cmpglobal_binding[] get_cmppolicy_cmpglobal_bindings() throws Exception {
		return this.cmppolicy_cmpglobal_binding;
	}

	/**
	* <pre>
	* cmppolicylabel that can be bound to cmppolicy.
	* </pre>
	*/
	public cmppolicy_cmppolicylabel_binding[] get_cmppolicy_cmppolicylabel_bindings() throws Exception {
		return this.cmppolicy_cmppolicylabel_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to cmppolicy.
	* </pre>
	*/
	public cmppolicy_lbvserver_binding[] get_cmppolicy_lbvserver_bindings() throws Exception {
		return this.cmppolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cmppolicy_binding_response result = (cmppolicy_binding_response) service.get_payload_formatter().string_to_resource(cmppolicy_binding_response.class, response);
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
		return result.cmppolicy_binding;
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
	* Use this API to fetch cmppolicy_binding resource of given name .
	*/
	public static cmppolicy_binding get(nitro_service service, String name) throws Exception{
		cmppolicy_binding obj = new cmppolicy_binding();
		obj.set_name(name);
		cmppolicy_binding response = (cmppolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cmppolicy_binding resources of given names .
	*/
	public static cmppolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			cmppolicy_binding response[] = new cmppolicy_binding[name.length];
			cmppolicy_binding obj[] = new cmppolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new cmppolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (cmppolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}