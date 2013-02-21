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

import com.citrix.netscaler.nitro.resource.config.network.linkset_channel_binding;
import com.citrix.netscaler.nitro.resource.config.network.linkset_interface_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class linkset_binding_response extends base_response
{
	public linkset_binding[] linkset_binding;
}
/**
	* Binding class showing the resources that can be bound to linkset_binding. 
	*/

public class linkset_binding extends base_resource
{
	private String id;
	private linkset_channel_binding	linkset_channel_binding[] = null;
	private linkset_interface_binding	linkset_interface_binding[] = null;

	/**
	* <pre>
	* The ID of the linkset whose details must be displayed. If an ID is not provided, details of all linksets available in the cluster are displayed.
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* The ID of the linkset whose details must be displayed. If an ID is not provided, details of all linksets available in the cluster are displayed.
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* interface that can be bound to linkset.
	* </pre>
	*/
	public linkset_interface_binding[] get_linkset_interface_bindings() throws Exception {
		return this.linkset_interface_binding;
	}

	/**
	* <pre>
	* channel that can be bound to linkset.
	* </pre>
	*/
	public linkset_channel_binding[] get_linkset_channel_bindings() throws Exception {
		return this.linkset_channel_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		linkset_binding_response result = (linkset_binding_response) service.get_payload_formatter().string_to_resource(linkset_binding_response.class, response);
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
		return result.linkset_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.id;
	}

	/**
	* Use this API to fetch linkset_binding resource of given name .
	*/
	public static linkset_binding get(nitro_service service, String id) throws Exception{
		linkset_binding obj = new linkset_binding();
		obj.set_id(id);
		linkset_binding response = (linkset_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch linkset_binding resources of given names .
	*/
	public static linkset_binding[] get(nitro_service service, String id[]) throws Exception{
		if (id !=null && id.length>0) {
			linkset_binding response[] = new linkset_binding[id.length];
			linkset_binding obj[] = new linkset_binding[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new linkset_binding();
				obj[i].set_id(id[i]);
				response[i] = (linkset_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}