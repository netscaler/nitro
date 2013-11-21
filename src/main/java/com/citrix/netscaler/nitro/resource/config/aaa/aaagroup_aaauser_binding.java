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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaagroup_aaauser_binding_response extends base_response
{
	public aaagroup_aaauser_binding[] aaagroup_aaauser_binding;
}
/**
	* Binding class showing the aaauser that can be bound to aaagroup.
	*/

public class aaagroup_aaauser_binding extends base_resource
{
	private String username;
	private String groupname;
	private Long __count;

	/**
	* <pre>
	* The user name.
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The user name.
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* Name of the group that you are binding.<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* Name of the group that you are binding.<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaagroup_aaauser_binding_response result = (aaagroup_aaauser_binding_response) service.get_payload_formatter().string_to_resource(aaagroup_aaauser_binding_response.class, response);
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
		return result.aaagroup_aaauser_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.groupname;
	}

	public static base_response add(nitro_service client, aaagroup_aaauser_binding resource) throws Exception {
		aaagroup_aaauser_binding updateresource = new aaagroup_aaauser_binding();
		updateresource.groupname = resource.groupname;
		updateresource.username = resource.username;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, aaagroup_aaauser_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaagroup_aaauser_binding updateresources[] = new aaagroup_aaauser_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaagroup_aaauser_binding();
				updateresources[i].groupname = resources[i].groupname;
				updateresources[i].username = resources[i].username;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, aaagroup_aaauser_binding resource) throws Exception {
		aaagroup_aaauser_binding deleteresource = new aaagroup_aaauser_binding();
		deleteresource.groupname = resource.groupname;
		deleteresource.username = resource.username;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, aaagroup_aaauser_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaagroup_aaauser_binding deleteresources[] = new aaagroup_aaauser_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaagroup_aaauser_binding();
				deleteresources[i].groupname = resources[i].groupname;
				deleteresources[i].username = resources[i].username;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch aaagroup_aaauser_binding resources of given name .
	*/
	public static aaagroup_aaauser_binding[] get(nitro_service service, String groupname) throws Exception{
		aaagroup_aaauser_binding obj = new aaagroup_aaauser_binding();
		obj.set_groupname(groupname);
		aaagroup_aaauser_binding response[] = (aaagroup_aaauser_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaagroup_aaauser_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaagroup_aaauser_binding[] get_filtered(nitro_service service, String groupname, String filter) throws Exception{
		aaagroup_aaauser_binding obj = new aaagroup_aaauser_binding();
		obj.set_groupname(groupname);
		options option = new options();
		option.set_filter(filter);
		aaagroup_aaauser_binding[] response = (aaagroup_aaauser_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaagroup_aaauser_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaagroup_aaauser_binding[] get_filtered(nitro_service service, String groupname, filtervalue[] filter) throws Exception{
		aaagroup_aaauser_binding obj = new aaagroup_aaauser_binding();
		obj.set_groupname(groupname);
		options option = new options();
		option.set_filter(filter);
		aaagroup_aaauser_binding[] response = (aaagroup_aaauser_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count aaagroup_aaauser_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String groupname) throws Exception{
		aaagroup_aaauser_binding obj = new aaagroup_aaauser_binding();
		obj.set_groupname(groupname);
		options option = new options();
		option.set_count(true);
		aaagroup_aaauser_binding response[] = (aaagroup_aaauser_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaagroup_aaauser_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String groupname, String filter) throws Exception{
		aaagroup_aaauser_binding obj = new aaagroup_aaauser_binding();
		obj.set_groupname(groupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaagroup_aaauser_binding[] response = (aaagroup_aaauser_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaagroup_aaauser_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String groupname, filtervalue[] filter) throws Exception{
		aaagroup_aaauser_binding obj = new aaagroup_aaauser_binding();
		obj.set_groupname(groupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaagroup_aaauser_binding[] response = (aaagroup_aaauser_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}