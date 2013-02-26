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

import com.citrix.netscaler.nitro.resource.config.network.bridgegroup_nsip_binding;
import com.citrix.netscaler.nitro.resource.config.network.bridgegroup_vlan_binding;
import com.citrix.netscaler.nitro.resource.config.network.bridgegroup_nsip6_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class bridgegroup_binding_response extends base_response
{
	public bridgegroup_binding[] bridgegroup_binding;
}
/**
	* Binding class showing the resources that can be bound to bridgegroup_binding. 
	*/

public class bridgegroup_binding extends base_resource
{
	private Long id;
	private bridgegroup_nsip_binding	bridgegroup_nsip_binding[] = null;
	private bridgegroup_vlan_binding	bridgegroup_vlan_binding[] = null;
	private bridgegroup_nsip6_binding	bridgegroup_nsip6_binding[] = null;

	/**
	* <pre>
	* The name of the bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* The name of the bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* The name of the bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* vlan that can be bound to bridgegroup.
	* </pre>
	*/
	public bridgegroup_vlan_binding[] get_bridgegroup_vlan_bindings() throws Exception {
		return this.bridgegroup_vlan_binding;
	}

	/**
	* <pre>
	* nsip that can be bound to bridgegroup.
	* </pre>
	*/
	public bridgegroup_nsip_binding[] get_bridgegroup_nsip_bindings() throws Exception {
		return this.bridgegroup_nsip_binding;
	}

	/**
	* <pre>
	* nsip6 that can be bound to bridgegroup.
	* </pre>
	*/
	public bridgegroup_nsip6_binding[] get_bridgegroup_nsip6_bindings() throws Exception {
		return this.bridgegroup_nsip6_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		bridgegroup_binding_response result = (bridgegroup_binding_response) service.get_payload_formatter().string_to_resource(bridgegroup_binding_response.class, response);
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
		return result.bridgegroup_binding;
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
	* Use this API to fetch bridgegroup_binding resource of given name .
	*/
	public static bridgegroup_binding get(nitro_service service, Long id) throws Exception{
		bridgegroup_binding obj = new bridgegroup_binding();
		obj.set_id(id);
		bridgegroup_binding response = (bridgegroup_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch bridgegroup_binding resources of given names .
	*/
	public static bridgegroup_binding[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			bridgegroup_binding response[] = new bridgegroup_binding[id.length];
			bridgegroup_binding obj[] = new bridgegroup_binding[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new bridgegroup_binding();
				obj[i].set_id(id[i]);
				response[i] = (bridgegroup_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}