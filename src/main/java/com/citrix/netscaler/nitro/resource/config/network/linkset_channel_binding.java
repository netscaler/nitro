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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class linkset_channel_binding_response extends base_response
{
	public linkset_channel_binding[] linkset_channel_binding;
}
/**
	* Binding class showing the channel that can be bound to linkset.
	*/

public class linkset_channel_binding extends base_resource
{
	private String ifnum;
	private String id;
	private Long __count;

	/**
	* <pre>
	* The ID of the linkset to which you want to bind the interfaces.
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* The ID of the linkset to which you want to bind the interfaces.
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The interfaces to be bound to the linkset.
	* </pre>
	*/
	public void set_ifnum(String ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* The interfaces to be bound to the linkset.
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		linkset_channel_binding_response result = (linkset_channel_binding_response) service.get_payload_formatter().string_to_resource(linkset_channel_binding_response.class, response);
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
		return result.linkset_channel_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.id;
	}

	public static base_response add(nitro_service client, linkset_channel_binding resource) throws Exception {
		linkset_channel_binding updateresource = new linkset_channel_binding();
		updateresource.id = resource.id;
		updateresource.ifnum = resource.ifnum;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, linkset_channel_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			linkset_channel_binding updateresources[] = new linkset_channel_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new linkset_channel_binding();
				updateresources[i].id = resources[i].id;
				updateresources[i].ifnum = resources[i].ifnum;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, linkset_channel_binding resource) throws Exception {
		linkset_channel_binding deleteresource = new linkset_channel_binding();
		deleteresource.id = resource.id;
		deleteresource.ifnum = resource.ifnum;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, linkset_channel_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			linkset_channel_binding deleteresources[] = new linkset_channel_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new linkset_channel_binding();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].ifnum = resources[i].ifnum;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch linkset_channel_binding resources of given name .
	*/
	public static linkset_channel_binding[] get(nitro_service service, String id) throws Exception{
		linkset_channel_binding obj = new linkset_channel_binding();
		obj.set_id(id);
		linkset_channel_binding response[] = (linkset_channel_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of linkset_channel_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static linkset_channel_binding[] get_filtered(nitro_service service, String id, String filter) throws Exception{
		linkset_channel_binding obj = new linkset_channel_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		linkset_channel_binding[] response = (linkset_channel_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of linkset_channel_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static linkset_channel_binding[] get_filtered(nitro_service service, String id, filtervalue[] filter) throws Exception{
		linkset_channel_binding obj = new linkset_channel_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		linkset_channel_binding[] response = (linkset_channel_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count linkset_channel_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String id) throws Exception{
		linkset_channel_binding obj = new linkset_channel_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		linkset_channel_binding response[] = (linkset_channel_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of linkset_channel_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String id, String filter) throws Exception{
		linkset_channel_binding obj = new linkset_channel_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		linkset_channel_binding[] response = (linkset_channel_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of linkset_channel_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String id, filtervalue[] filter) throws Exception{
		linkset_channel_binding obj = new linkset_channel_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		linkset_channel_binding[] response = (linkset_channel_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}