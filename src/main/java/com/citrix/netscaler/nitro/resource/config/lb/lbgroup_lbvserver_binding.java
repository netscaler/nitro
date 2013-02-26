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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbgroup_lbvserver_binding_response extends base_response
{
	public lbgroup_lbvserver_binding[] lbgroup_lbvserver_binding;
}
/**
	* Binding class showing the lbvserver that can be bound to lbgroup.
	*/

public class lbgroup_lbvserver_binding extends base_resource
{
	private String vservername;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The name of the group. A maximum of 127 characters can be used to specify a new name to a group of virtual servers that you are creating (or to specify an existing group name if you are adding the virtual server to an existing group of virtual servers.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the group. A maximum of 127 characters can be used to specify a new name to a group of virtual servers that you are creating (or to specify an existing group name if you are adding the virtual server to an existing group of virtual servers.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Virtual server name.
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* Virtual server name.
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbgroup_lbvserver_binding_response result = (lbgroup_lbvserver_binding_response) service.get_payload_formatter().string_to_resource(lbgroup_lbvserver_binding_response.class, response);
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
		return result.lbgroup_lbvserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, lbgroup_lbvserver_binding resource) throws Exception {
		lbgroup_lbvserver_binding updateresource = new lbgroup_lbvserver_binding();
		updateresource.name = resource.name;
		updateresource.vservername = resource.vservername;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, lbgroup_lbvserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbgroup_lbvserver_binding updateresources[] = new lbgroup_lbvserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbgroup_lbvserver_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].vservername = resources[i].vservername;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, lbgroup_lbvserver_binding resource) throws Exception {
		lbgroup_lbvserver_binding deleteresource = new lbgroup_lbvserver_binding();
		deleteresource.name = resource.name;
		deleteresource.vservername = resource.vservername;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, lbgroup_lbvserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbgroup_lbvserver_binding deleteresources[] = new lbgroup_lbvserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbgroup_lbvserver_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].vservername = resources[i].vservername;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch lbgroup_lbvserver_binding resources of given name .
	*/
	public static lbgroup_lbvserver_binding[] get(nitro_service service, String name) throws Exception{
		lbgroup_lbvserver_binding obj = new lbgroup_lbvserver_binding();
		obj.set_name(name);
		lbgroup_lbvserver_binding response[] = (lbgroup_lbvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbgroup_lbvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbgroup_lbvserver_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		lbgroup_lbvserver_binding obj = new lbgroup_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbgroup_lbvserver_binding[] response = (lbgroup_lbvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbgroup_lbvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbgroup_lbvserver_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbgroup_lbvserver_binding obj = new lbgroup_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbgroup_lbvserver_binding[] response = (lbgroup_lbvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbgroup_lbvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		lbgroup_lbvserver_binding obj = new lbgroup_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		lbgroup_lbvserver_binding response[] = (lbgroup_lbvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbgroup_lbvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		lbgroup_lbvserver_binding obj = new lbgroup_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbgroup_lbvserver_binding[] response = (lbgroup_lbvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbgroup_lbvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbgroup_lbvserver_binding obj = new lbgroup_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbgroup_lbvserver_binding[] response = (lbgroup_lbvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}