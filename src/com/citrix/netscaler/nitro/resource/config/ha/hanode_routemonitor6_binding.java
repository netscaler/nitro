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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class hanode_routemonitor6_binding_response extends base_response
{
	public hanode_routemonitor6_binding[] hanode_routemonitor6_binding;
}
/**
	* Binding class showing the routemonitor6 that can be bound to hanode.
	*/

public class hanode_routemonitor6_binding extends base_resource
{
	private String routemonitor;
	private String netmask;
	private Long flags;
	private Long id;
	private Long __count;

	/**
	* <pre>
	* The IP address (IPv4 or IPv6).
	* </pre>
	*/
	public void set_routemonitor(String routemonitor) throws Exception{
		this.routemonitor = routemonitor;
	}

	/**
	* <pre>
	* The IP address (IPv4 or IPv6).
	* </pre>
	*/
	public String get_routemonitor() throws Exception {
		return this.routemonitor;
	}

	/**
	* <pre>
	* A number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* A number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* A number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The netmask.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The netmask.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The flags for this entry.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		hanode_routemonitor6_binding_response result = (hanode_routemonitor6_binding_response) service.get_payload_formatter().string_to_resource(hanode_routemonitor6_binding_response.class, response);
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
		return result.hanode_routemonitor6_binding;
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

	public static base_response add(nitro_service client, hanode_routemonitor6_binding resource) throws Exception {
		hanode_routemonitor6_binding updateresource = new hanode_routemonitor6_binding();
		updateresource.id = resource.id;
		updateresource.routemonitor = resource.routemonitor;
		updateresource.netmask = resource.netmask;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, hanode_routemonitor6_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			hanode_routemonitor6_binding updateresources[] = new hanode_routemonitor6_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new hanode_routemonitor6_binding();
				updateresources[i].id = resources[i].id;
				updateresources[i].routemonitor = resources[i].routemonitor;
				updateresources[i].netmask = resources[i].netmask;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, hanode_routemonitor6_binding resource) throws Exception {
		hanode_routemonitor6_binding deleteresource = new hanode_routemonitor6_binding();
		deleteresource.id = resource.id;
		deleteresource.routemonitor = resource.routemonitor;
		deleteresource.netmask = resource.netmask;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, hanode_routemonitor6_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			hanode_routemonitor6_binding deleteresources[] = new hanode_routemonitor6_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new hanode_routemonitor6_binding();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].routemonitor = resources[i].routemonitor;
				deleteresources[i].netmask = resources[i].netmask;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch hanode_routemonitor6_binding resources of given name .
	*/
	public static hanode_routemonitor6_binding[] get(nitro_service service, Long id) throws Exception{
		hanode_routemonitor6_binding obj = new hanode_routemonitor6_binding();
		obj.set_id(id);
		hanode_routemonitor6_binding response[] = (hanode_routemonitor6_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of hanode_routemonitor6_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static hanode_routemonitor6_binding[] get_filtered(nitro_service service, Long id, String filter) throws Exception{
		hanode_routemonitor6_binding obj = new hanode_routemonitor6_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		hanode_routemonitor6_binding[] response = (hanode_routemonitor6_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of hanode_routemonitor6_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static hanode_routemonitor6_binding[] get_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		hanode_routemonitor6_binding obj = new hanode_routemonitor6_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		hanode_routemonitor6_binding[] response = (hanode_routemonitor6_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count hanode_routemonitor6_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long id) throws Exception{
		hanode_routemonitor6_binding obj = new hanode_routemonitor6_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		hanode_routemonitor6_binding response[] = (hanode_routemonitor6_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of hanode_routemonitor6_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long id, String filter) throws Exception{
		hanode_routemonitor6_binding obj = new hanode_routemonitor6_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hanode_routemonitor6_binding[] response = (hanode_routemonitor6_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of hanode_routemonitor6_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		hanode_routemonitor6_binding obj = new hanode_routemonitor6_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hanode_routemonitor6_binding[] response = (hanode_routemonitor6_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}