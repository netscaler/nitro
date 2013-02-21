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

class systemglobal_auditnslogpolicy_binding_response extends base_response
{
	public systemglobal_auditnslogpolicy_binding[] systemglobal_auditnslogpolicy_binding;
}
/**
	* Binding class showing the auditnslogpolicy that can be bound to systemglobal.
	*/

public class systemglobal_auditnslogpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The priority of the command policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the command policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the command policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public void set_builtin(String[] builtin) throws Exception{
		this.builtin = builtin;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* The name of the  command policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the  command policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemglobal_auditnslogpolicy_binding_response result = (systemglobal_auditnslogpolicy_binding_response) service.get_payload_formatter().string_to_resource(systemglobal_auditnslogpolicy_binding_response.class, response);
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
		return result.systemglobal_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, systemglobal_auditnslogpolicy_binding resource) throws Exception {
		systemglobal_auditnslogpolicy_binding updateresource = new systemglobal_auditnslogpolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, systemglobal_auditnslogpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemglobal_auditnslogpolicy_binding updateresources[] = new systemglobal_auditnslogpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new systemglobal_auditnslogpolicy_binding();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, systemglobal_auditnslogpolicy_binding resource) throws Exception {
		systemglobal_auditnslogpolicy_binding deleteresource = new systemglobal_auditnslogpolicy_binding();
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, systemglobal_auditnslogpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemglobal_auditnslogpolicy_binding deleteresources[] = new systemglobal_auditnslogpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new systemglobal_auditnslogpolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a systemglobal_auditnslogpolicy_binding resources.
	*/
	public static systemglobal_auditnslogpolicy_binding[] get(nitro_service service) throws Exception{
		systemglobal_auditnslogpolicy_binding obj = new systemglobal_auditnslogpolicy_binding();
		systemglobal_auditnslogpolicy_binding response[] = (systemglobal_auditnslogpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systemglobal_auditnslogpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static systemglobal_auditnslogpolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		systemglobal_auditnslogpolicy_binding obj = new systemglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		systemglobal_auditnslogpolicy_binding[] response = (systemglobal_auditnslogpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systemglobal_auditnslogpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static systemglobal_auditnslogpolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemglobal_auditnslogpolicy_binding obj = new systemglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		systemglobal_auditnslogpolicy_binding[] response = (systemglobal_auditnslogpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count systemglobal_auditnslogpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		systemglobal_auditnslogpolicy_binding obj = new systemglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_count(true);
		systemglobal_auditnslogpolicy_binding response[] = (systemglobal_auditnslogpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systemglobal_auditnslogpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		systemglobal_auditnslogpolicy_binding obj = new systemglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemglobal_auditnslogpolicy_binding[] response = (systemglobal_auditnslogpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systemglobal_auditnslogpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemglobal_auditnslogpolicy_binding obj = new systemglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemglobal_auditnslogpolicy_binding[] response = (systemglobal_auditnslogpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}

}