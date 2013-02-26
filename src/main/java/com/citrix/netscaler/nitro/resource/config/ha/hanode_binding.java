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

package com.citrix.netscaler.nitro.resource.config.ha;

import com.citrix.netscaler.nitro.resource.config.ha.hanode_partialfailureinterfaces_binding;
import com.citrix.netscaler.nitro.resource.config.ha.hanode_routemonitor6_binding;
import com.citrix.netscaler.nitro.resource.config.ha.hanode_fis_binding;
import com.citrix.netscaler.nitro.resource.config.ha.hanode_ci_binding;
import com.citrix.netscaler.nitro.resource.config.ha.hanode_routemonitor_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class hanode_binding_response extends base_response
{
	public hanode_binding[] hanode_binding;
}
/**
	* Binding class showing the resources that can be bound to hanode_binding. 
	*/

public class hanode_binding extends base_resource
{
	private Long id;
	private hanode_partialfailureinterfaces_binding	hanode_partialfailureinterfaces_binding[] = null;
	private hanode_routemonitor6_binding	hanode_routemonitor6_binding[] = null;
	private hanode_fis_binding	hanode_fis_binding[] = null;
	private hanode_ci_binding	hanode_ci_binding[] = null;
	private hanode_routemonitor_binding	hanode_routemonitor_binding[] = null;

	/**
	* <pre>
	* The ID of the node whose HA settings you want to display. (The ID of the local node is always 0.).<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* The ID of the node whose HA settings you want to display. (The ID of the local node is always 0.).<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* The ID of the node whose HA settings you want to display. (The ID of the local node is always 0.).<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* routemonitor that can be bound to hanode.
	* </pre>
	*/
	public hanode_routemonitor_binding[] get_hanode_routemonitor_bindings() throws Exception {
		return this.hanode_routemonitor_binding;
	}

	/**
	* <pre>
	* partialfailureinterfaces that can be bound to hanode.
	* </pre>
	*/
	public hanode_partialfailureinterfaces_binding[] get_hanode_partialfailureinterfaces_bindings() throws Exception {
		return this.hanode_partialfailureinterfaces_binding;
	}

	/**
	* <pre>
	* fis that can be bound to hanode.
	* </pre>
	*/
	public hanode_fis_binding[] get_hanode_fis_bindings() throws Exception {
		return this.hanode_fis_binding;
	}

	/**
	* <pre>
	* routemonitor6 that can be bound to hanode.
	* </pre>
	*/
	public hanode_routemonitor6_binding[] get_hanode_routemonitor6_bindings() throws Exception {
		return this.hanode_routemonitor6_binding;
	}

	/**
	* <pre>
	* ci that can be bound to hanode.
	* </pre>
	*/
	public hanode_ci_binding[] get_hanode_ci_bindings() throws Exception {
		return this.hanode_ci_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		hanode_binding_response result = (hanode_binding_response) service.get_payload_formatter().string_to_resource(hanode_binding_response.class, response);
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
		return result.hanode_binding;
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
	* Use this API to fetch hanode_binding resource of given name .
	*/
	public static hanode_binding get(nitro_service service, Long id) throws Exception{
		hanode_binding obj = new hanode_binding();
		obj.set_id(id);
		hanode_binding response = (hanode_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch hanode_binding resources of given names .
	*/
	public static hanode_binding[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			hanode_binding response[] = new hanode_binding[id.length];
			hanode_binding obj[] = new hanode_binding[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new hanode_binding();
				obj[i].set_id(id[i]);
				response[i] = (hanode_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}