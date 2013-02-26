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

import com.citrix.netscaler.nitro.resource.config.network.vlan_channel_binding;
import com.citrix.netscaler.nitro.resource.config.network.vlan_nsip_binding;
import com.citrix.netscaler.nitro.resource.config.network.vlan_interface_binding;
import com.citrix.netscaler.nitro.resource.config.network.vlan_linkset_binding;
import com.citrix.netscaler.nitro.resource.config.network.vlan_nsip6_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vlan_binding_response extends base_response
{
	public vlan_binding[] vlan_binding;
}
/**
	* Binding class showing the resources that can be bound to vlan_binding. 
	*/

public class vlan_binding extends base_resource
{
	private Long id;
	private vlan_channel_binding	vlan_channel_binding[] = null;
	private vlan_nsip_binding	vlan_nsip_binding[] = null;
	private vlan_interface_binding	vlan_interface_binding[] = null;
	private vlan_linkset_binding	vlan_linkset_binding[] = null;
	private vlan_nsip6_binding	vlan_nsip6_binding[] = null;

	/**
	* <pre>
	* An integer that uniquely identifies the VLAN for which the details are to be displayed.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* An integer that uniquely identifies the VLAN for which the details are to be displayed.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* An integer that uniquely identifies the VLAN for which the details are to be displayed.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* interface that can be bound to vlan.
	* </pre>
	*/
	public vlan_interface_binding[] get_vlan_interface_bindings() throws Exception {
		return this.vlan_interface_binding;
	}

	/**
	* <pre>
	* nsip6 that can be bound to vlan.
	* </pre>
	*/
	public vlan_nsip6_binding[] get_vlan_nsip6_bindings() throws Exception {
		return this.vlan_nsip6_binding;
	}

	/**
	* <pre>
	* nsip that can be bound to vlan.
	* </pre>
	*/
	public vlan_nsip_binding[] get_vlan_nsip_bindings() throws Exception {
		return this.vlan_nsip_binding;
	}

	/**
	* <pre>
	* linkset that can be bound to vlan.
	* </pre>
	*/
	public vlan_linkset_binding[] get_vlan_linkset_bindings() throws Exception {
		return this.vlan_linkset_binding;
	}

	/**
	* <pre>
	* channel that can be bound to vlan.
	* </pre>
	*/
	public vlan_channel_binding[] get_vlan_channel_bindings() throws Exception {
		return this.vlan_channel_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vlan_binding_response result = (vlan_binding_response) service.get_payload_formatter().string_to_resource(vlan_binding_response.class, response);
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
		return result.vlan_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch vlan_binding resource of given name .
	*/
	public static vlan_binding get(nitro_service service, Long id) throws Exception{
		vlan_binding obj = new vlan_binding();
		obj.set_id(id);
		vlan_binding response = (vlan_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vlan_binding resources of given names .
	*/
	public static vlan_binding[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			vlan_binding response[] = new vlan_binding[id.length];
			vlan_binding obj[] = new vlan_binding[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new vlan_binding();
				obj[i].set_id(id[i]);
				response[i] = (vlan_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}