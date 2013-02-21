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

package com.citrix.netscaler.nitro.resource.config.cr;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class crvserver_cmppolicy_binding_response extends base_response
{
	public crvserver_cmppolicy_binding[] crvserver_cmppolicy_binding;
}
/**
	* Binding class showing the cmppolicy that can be bound to crvserver.
	*/

public class crvserver_cmppolicy_binding extends base_resource
{
	private String policyname;
	private String name;
	private String targetvserver;
	private Long priority;
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
	* Policies bound to this vserver.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Policies bound to this vserver.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The name of the cache redirection virtual server to which the cache redirection policy will be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the cache redirection virtual server to which the cache redirection policy will be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* An address-based virtual server. The server can only be specified
					    -for a map policy created using the add policy map command.
					    -when the cache redirection virtual server is of the type REVERSE.<br> Minimum length =  1
	* </pre>
	*/
	public void set_targetvserver(String targetvserver) throws Exception{
		this.targetvserver = targetvserver;
	}

	/**
	* <pre>
	* An address-based virtual server. The server can only be specified
					    -for a map policy created using the add policy map command.
					    -when the cache redirection virtual server is of the type REVERSE.<br> Minimum length =  1
	* </pre>
	*/
	public String get_targetvserver() throws Exception {
		return this.targetvserver;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		crvserver_cmppolicy_binding_response result = (crvserver_cmppolicy_binding_response) service.get_payload_formatter().string_to_resource(crvserver_cmppolicy_binding_response.class, response);
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
		return result.crvserver_cmppolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, crvserver_cmppolicy_binding resource) throws Exception {
		crvserver_cmppolicy_binding updateresource = new crvserver_cmppolicy_binding();
		updateresource.name = resource.name;
		updateresource.policyname = resource.policyname;
		updateresource.targetvserver = resource.targetvserver;
		updateresource.priority = resource.priority;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, crvserver_cmppolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crvserver_cmppolicy_binding updateresources[] = new crvserver_cmppolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new crvserver_cmppolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].targetvserver = resources[i].targetvserver;
				updateresources[i].priority = resources[i].priority;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, crvserver_cmppolicy_binding resource) throws Exception {
		crvserver_cmppolicy_binding deleteresource = new crvserver_cmppolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, crvserver_cmppolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crvserver_cmppolicy_binding deleteresources[] = new crvserver_cmppolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new crvserver_cmppolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch crvserver_cmppolicy_binding resources of given name .
	*/
	public static crvserver_cmppolicy_binding[] get(nitro_service service, String name) throws Exception{
		crvserver_cmppolicy_binding obj = new crvserver_cmppolicy_binding();
		obj.set_name(name);
		crvserver_cmppolicy_binding response[] = (crvserver_cmppolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of crvserver_cmppolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static crvserver_cmppolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		crvserver_cmppolicy_binding obj = new crvserver_cmppolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		crvserver_cmppolicy_binding[] response = (crvserver_cmppolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of crvserver_cmppolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static crvserver_cmppolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		crvserver_cmppolicy_binding obj = new crvserver_cmppolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		crvserver_cmppolicy_binding[] response = (crvserver_cmppolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count crvserver_cmppolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		crvserver_cmppolicy_binding obj = new crvserver_cmppolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		crvserver_cmppolicy_binding response[] = (crvserver_cmppolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of crvserver_cmppolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		crvserver_cmppolicy_binding obj = new crvserver_cmppolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		crvserver_cmppolicy_binding[] response = (crvserver_cmppolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of crvserver_cmppolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		crvserver_cmppolicy_binding obj = new crvserver_cmppolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		crvserver_cmppolicy_binding[] response = (crvserver_cmppolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}