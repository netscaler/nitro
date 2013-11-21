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

import com.citrix.netscaler.nitro.resource.config.network.vrid6_nsip_binding;
import com.citrix.netscaler.nitro.resource.config.network.vrid6_interface_binding;
import com.citrix.netscaler.nitro.resource.config.network.vrid6_nsip6_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vrid6_binding_response extends base_response
{
	public vrid6_binding[] vrid6_binding;
}
/**
	* Binding class showing the resources that can be bound to vrid6_binding. 
	*/

public class vrid6_binding extends base_resource
{
	private Long id;
	private vrid6_nsip_binding	vrid6_nsip_binding[] = null;
	private vrid6_interface_binding	vrid6_interface_binding[] = null;
	private vrid6_nsip6_binding	vrid6_nsip6_binding[] = null;

	/**
	* <pre>
	* Integer value that uniquely identifies a VMAC6 address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* Integer value that uniquely identifies a VMAC6 address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* Integer value that uniquely identifies a VMAC6 address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* nsip6 that can be bound to vrid6.
	* </pre>
	*/
	public vrid6_nsip6_binding[] get_vrid6_nsip6_bindings() throws Exception {
		return this.vrid6_nsip6_binding;
	}

	/**
	* <pre>
	* interface that can be bound to vrid6.
	* </pre>
	*/
	public vrid6_interface_binding[] get_vrid6_interface_bindings() throws Exception {
		return this.vrid6_interface_binding;
	}

	/**
	* <pre>
	* nsip that can be bound to vrid6.
	* </pre>
	*/
	public vrid6_nsip_binding[] get_vrid6_nsip_bindings() throws Exception {
		return this.vrid6_nsip_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vrid6_binding_response result = (vrid6_binding_response) service.get_payload_formatter().string_to_resource(vrid6_binding_response.class, response);
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
		return result.vrid6_binding;
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
	* Use this API to fetch vrid6_binding resource of given name .
	*/
	public static vrid6_binding get(nitro_service service, Long id) throws Exception{
		vrid6_binding obj = new vrid6_binding();
		obj.set_id(id);
		vrid6_binding response = (vrid6_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vrid6_binding resources of given names .
	*/
	public static vrid6_binding[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			vrid6_binding response[] = new vrid6_binding[id.length];
			vrid6_binding obj[] = new vrid6_binding[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new vrid6_binding();
				obj[i].set_id(id[i]);
				response[i] = (vrid6_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}