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

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemuser_systemcmdpolicy_binding_response extends base_response
{
	public systemuser_systemcmdpolicy_binding[] systemuser_systemcmdpolicy_binding;
}
/**
	* Binding class showing the systemcmdpolicy that can be bound to systemuser.
	*/

public class systemuser_systemcmdpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String username;
	private Long __count;

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The name of command policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of command policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The name of the system user.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The name of the system user.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemuser_systemcmdpolicy_binding_response result = (systemuser_systemcmdpolicy_binding_response) service.get_payload_formatter().string_to_resource(systemuser_systemcmdpolicy_binding_response.class, response);
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
		return result.systemuser_systemcmdpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.username;
	}

	public static base_response add(nitro_service client, systemuser_systemcmdpolicy_binding resource) throws Exception {
		systemuser_systemcmdpolicy_binding updateresource = new systemuser_systemcmdpolicy_binding();
		updateresource.username = resource.username;
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, systemuser_systemcmdpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemuser_systemcmdpolicy_binding updateresources[] = new systemuser_systemcmdpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new systemuser_systemcmdpolicy_binding();
				updateresources[i].username = resources[i].username;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, systemuser_systemcmdpolicy_binding resource) throws Exception {
		systemuser_systemcmdpolicy_binding deleteresource = new systemuser_systemcmdpolicy_binding();
		deleteresource.username = resource.username;
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, systemuser_systemcmdpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemuser_systemcmdpolicy_binding deleteresources[] = new systemuser_systemcmdpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new systemuser_systemcmdpolicy_binding();
				deleteresources[i].username = resources[i].username;
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch systemuser_systemcmdpolicy_binding resources of given name .
	*/
	public static systemuser_systemcmdpolicy_binding[] get(nitro_service service, String username) throws Exception{
		systemuser_systemcmdpolicy_binding obj = new systemuser_systemcmdpolicy_binding();
		obj.set_username(username);
		systemuser_systemcmdpolicy_binding response[] = (systemuser_systemcmdpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systemuser_systemcmdpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static systemuser_systemcmdpolicy_binding[] get_filtered(nitro_service service, String username, String filter) throws Exception{
		systemuser_systemcmdpolicy_binding obj = new systemuser_systemcmdpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_filter(filter);
		systemuser_systemcmdpolicy_binding[] response = (systemuser_systemcmdpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systemuser_systemcmdpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static systemuser_systemcmdpolicy_binding[] get_filtered(nitro_service service, String username, filtervalue[] filter) throws Exception{
		systemuser_systemcmdpolicy_binding obj = new systemuser_systemcmdpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_filter(filter);
		systemuser_systemcmdpolicy_binding[] response = (systemuser_systemcmdpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count systemuser_systemcmdpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String username) throws Exception{
		systemuser_systemcmdpolicy_binding obj = new systemuser_systemcmdpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		systemuser_systemcmdpolicy_binding response[] = (systemuser_systemcmdpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systemuser_systemcmdpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String username, String filter) throws Exception{
		systemuser_systemcmdpolicy_binding obj = new systemuser_systemcmdpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemuser_systemcmdpolicy_binding[] response = (systemuser_systemcmdpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systemuser_systemcmdpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String username, filtervalue[] filter) throws Exception{
		systemuser_systemcmdpolicy_binding obj = new systemuser_systemcmdpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemuser_systemcmdpolicy_binding[] response = (systemuser_systemcmdpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}