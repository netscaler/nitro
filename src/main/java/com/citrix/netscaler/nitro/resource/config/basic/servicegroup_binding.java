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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.config.basic.servicegroup_servicegroupmember_binding;
import com.citrix.netscaler.nitro.resource.config.basic.servicegroup_servicegroupentitymonbindings_binding;
import com.citrix.netscaler.nitro.resource.config.basic.servicegroup_lbmonitor_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class servicegroup_binding_response extends base_response
{
	public servicegroup_binding[] servicegroup_binding;
}
/**
	* Binding class showing the resources that can be bound to servicegroup_binding. 
	*/

public class servicegroup_binding extends base_resource
{
	private String servicegroupname;
	private servicegroup_servicegroupmember_binding	servicegroup_servicegroupmember_binding[] = null;
	private servicegroup_servicegroupentitymonbindings_binding	servicegroup_servicegroupentitymonbindings_binding[] = null;
	private servicegroup_lbmonitor_binding	servicegroup_lbmonitor_binding[] = null;

	/**
	* <pre>
	* Name of the service group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* Name of the service group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* lbmonitor that can be bound to servicegroup.
	* </pre>
	*/
	public servicegroup_lbmonitor_binding[] get_servicegroup_lbmonitor_bindings() throws Exception {
		return this.servicegroup_lbmonitor_binding;
	}

	/**
	* <pre>
	* servicegroupmember that can be bound to servicegroup.
	* </pre>
	*/
	public servicegroup_servicegroupmember_binding[] get_servicegroup_servicegroupmember_bindings() throws Exception {
		return this.servicegroup_servicegroupmember_binding;
	}

	/**
	* <pre>
	* servicegroupentitymonbindings that can be bound to servicegroup.
	* </pre>
	*/
	public servicegroup_servicegroupentitymonbindings_binding[] get_servicegroup_servicegroupentitymonbindings_bindings() throws Exception {
		return this.servicegroup_servicegroupentitymonbindings_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		servicegroup_binding_response result = (servicegroup_binding_response) service.get_payload_formatter().string_to_resource(servicegroup_binding_response.class, response);
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
		return result.servicegroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to fetch servicegroup_binding resource of given name .
	*/
	public static servicegroup_binding get(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_binding obj = new servicegroup_binding();
		obj.set_servicegroupname(servicegroupname);
		servicegroup_binding response = (servicegroup_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch servicegroup_binding resources of given names .
	*/
	public static servicegroup_binding[] get(nitro_service service, String servicegroupname[]) throws Exception{
		if (servicegroupname !=null && servicegroupname.length>0) {
			servicegroup_binding response[] = new servicegroup_binding[servicegroupname.length];
			servicegroup_binding obj[] = new servicegroup_binding[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++) {
				obj[i] = new servicegroup_binding();
				obj[i].set_servicegroupname(servicegroupname[i]);
				response[i] = (servicegroup_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}