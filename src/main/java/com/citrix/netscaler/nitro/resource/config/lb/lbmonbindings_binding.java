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

import com.citrix.netscaler.nitro.resource.config.lb.lbmonbindings_servicegroup_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbmonbindings_service_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbmonbindings_binding_response extends base_response
{
	public lbmonbindings_binding[] lbmonbindings_binding;
}
/**
	* Binding class showing the resources that can be bound to lbmonbindings_binding. 
	*/

public class lbmonbindings_binding extends base_resource
{
	private String monitorname;
	private lbmonbindings_servicegroup_binding	lbmonbindings_servicegroup_binding[] = null;
	private lbmonbindings_service_binding	lbmonbindings_service_binding[] = null;

	/**
	* <pre>
	* The name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitorname(String monitorname) throws Exception{
		this.monitorname = monitorname;
	}

	/**
	* <pre>
	* The name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitorname() throws Exception {
		return this.monitorname;
	}

	/**
	* <pre>
	* service that can be bound to lbmonbindings.
	* </pre>
	*/
	public lbmonbindings_service_binding[] get_lbmonbindings_service_bindings() throws Exception {
		return this.lbmonbindings_service_binding;
	}

	/**
	* <pre>
	* servicegroup that can be bound to lbmonbindings.
	* </pre>
	*/
	public lbmonbindings_servicegroup_binding[] get_lbmonbindings_servicegroup_bindings() throws Exception {
		return this.lbmonbindings_servicegroup_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonbindings_binding_response result = (lbmonbindings_binding_response) service.get_payload_formatter().string_to_resource(lbmonbindings_binding_response.class, response);
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
		return result.lbmonbindings_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.monitorname;
	}

	/**
	* Use this API to fetch lbmonbindings_binding resource of given name .
	*/
	public static lbmonbindings_binding get(nitro_service service, String monitorname) throws Exception{
		lbmonbindings_binding obj = new lbmonbindings_binding();
		obj.set_monitorname(monitorname);
		lbmonbindings_binding response = (lbmonbindings_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbmonbindings_binding resources of given names .
	*/
	public static lbmonbindings_binding[] get(nitro_service service, String monitorname[]) throws Exception{
		if (monitorname !=null && monitorname.length>0) {
			lbmonbindings_binding response[] = new lbmonbindings_binding[monitorname.length];
			lbmonbindings_binding obj[] = new lbmonbindings_binding[monitorname.length];
			for (int i=0;i<monitorname.length;i++) {
				obj[i] = new lbmonbindings_binding();
				obj[i].set_monitorname(monitorname[i]);
				response[i] = (lbmonbindings_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}