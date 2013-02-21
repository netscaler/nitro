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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslglobal_sslpolicy_binding_response extends base_response
{
	public sslglobal_sslpolicy_binding[] sslglobal_sslpolicy_binding;
}
/**
	* Binding class showing the sslpolicy that can be bound to sslglobal.
	*/

public class sslglobal_sslpolicy_binding extends base_resource
{
	private String policyname;
	private String type;
	private Long priority;
	private Long __count;

	/**
	* <pre>
	* The priority of the policy binding.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the policy binding.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the policy binding.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The name for the SSL policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name for the SSL policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The bindpoint to which policy is bound.<br> Possible values = CONTROL_OVERRIDE, CONTROL_DEFAULT, DATA_OVERRIDE, DATA_DEFAULT
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The bindpoint to which policy is bound.<br> Possible values = CONTROL_OVERRIDE, CONTROL_DEFAULT, DATA_OVERRIDE, DATA_DEFAULT
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslglobal_sslpolicy_binding_response result = (sslglobal_sslpolicy_binding_response) service.get_payload_formatter().string_to_resource(sslglobal_sslpolicy_binding_response.class, response);
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
		return result.sslglobal_sslpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, sslglobal_sslpolicy_binding resource) throws Exception {
		sslglobal_sslpolicy_binding updateresource = new sslglobal_sslpolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.type = resource.type;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, sslglobal_sslpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslglobal_sslpolicy_binding updateresources[] = new sslglobal_sslpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslglobal_sslpolicy_binding();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].type = resources[i].type;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, sslglobal_sslpolicy_binding resource) throws Exception {
		sslglobal_sslpolicy_binding deleteresource = new sslglobal_sslpolicy_binding();
		deleteresource.policyname = resource.policyname;
		deleteresource.type = resource.type;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, sslglobal_sslpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslglobal_sslpolicy_binding deleteresources[] = new sslglobal_sslpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslglobal_sslpolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].type = resources[i].type;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a sslglobal_sslpolicy_binding resources.
	*/
	public static sslglobal_sslpolicy_binding[] get(nitro_service service) throws Exception{
		sslglobal_sslpolicy_binding obj = new sslglobal_sslpolicy_binding();
		sslglobal_sslpolicy_binding response[] = (sslglobal_sslpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslglobal_sslpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslglobal_sslpolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		sslglobal_sslpolicy_binding obj = new sslglobal_sslpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		sslglobal_sslpolicy_binding[] response = (sslglobal_sslpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslglobal_sslpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslglobal_sslpolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslglobal_sslpolicy_binding obj = new sslglobal_sslpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		sslglobal_sslpolicy_binding[] response = (sslglobal_sslpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslglobal_sslpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslglobal_sslpolicy_binding obj = new sslglobal_sslpolicy_binding();
		options option = new options();
		option.set_count(true);
		sslglobal_sslpolicy_binding response[] = (sslglobal_sslpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslglobal_sslpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslglobal_sslpolicy_binding obj = new sslglobal_sslpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslglobal_sslpolicy_binding[] response = (sslglobal_sslpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslglobal_sslpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslglobal_sslpolicy_binding obj = new sslglobal_sslpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslglobal_sslpolicy_binding[] response = (sslglobal_sslpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String CONTROL_OVERRIDE = "CONTROL_OVERRIDE";
		public static final String CONTROL_DEFAULT = "CONTROL_DEFAULT";
		public static final String DATA_OVERRIDE = "DATA_OVERRIDE";
		public static final String DATA_DEFAULT = "DATA_DEFAULT";
	}

}