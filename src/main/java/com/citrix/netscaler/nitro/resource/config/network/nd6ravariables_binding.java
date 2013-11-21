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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.config.network.nd6ravariables_onlinkipv6prefix_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nd6ravariables_binding_response extends base_response
{
	public nd6ravariables_binding[] nd6ravariables_binding;
}
/**
	* Binding class showing the resources that can be bound to nd6ravariables_binding. 
	*/

public class nd6ravariables_binding extends base_resource
{
	private Long vlan;
	private nd6ravariables_onlinkipv6prefix_binding	nd6ravariables_onlinkipv6prefix_binding[] = null;

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* onlinkipv6prefix that can be bound to nd6ravariables.
	* </pre>
	*/
	public nd6ravariables_onlinkipv6prefix_binding[] get_nd6ravariables_onlinkipv6prefix_bindings() throws Exception {
		return this.nd6ravariables_onlinkipv6prefix_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nd6ravariables_binding_response result = (nd6ravariables_binding_response) service.get_payload_formatter().string_to_resource(nd6ravariables_binding_response.class, response);
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
		return result.nd6ravariables_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.vlan != null) {
			return this.vlan.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch nd6ravariables_binding resource of given name .
	*/
	public static nd6ravariables_binding get(nitro_service service, Long vlan) throws Exception{
		nd6ravariables_binding obj = new nd6ravariables_binding();
		obj.set_vlan(vlan);
		nd6ravariables_binding response = (nd6ravariables_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nd6ravariables_binding resources of given names .
	*/
	public static nd6ravariables_binding[] get(nitro_service service, Long vlan[]) throws Exception{
		if (vlan !=null && vlan.length>0) {
			nd6ravariables_binding response[] = new nd6ravariables_binding[vlan.length];
			nd6ravariables_binding obj[] = new nd6ravariables_binding[vlan.length];
			for (int i=0;i<vlan.length;i++) {
				obj[i] = new nd6ravariables_binding();
				obj[i].set_vlan(vlan[i]);
				response[i] = (nd6ravariables_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}