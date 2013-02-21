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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class service_dospolicy_binding_response extends base_response
{
	public service_dospolicy_binding[] service_dospolicy_binding;
}
/**
	* Binding class showing the dospolicy that can be bound to service.
	*/

public class service_dospolicy_binding extends base_resource
{
	private String policyname;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The name of the policyname for which this service is bound.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the policyname for which this service is bound.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The name of the service to which the policy will be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the service to which the policy will be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		service_dospolicy_binding_response result = (service_dospolicy_binding_response) service.get_payload_formatter().string_to_resource(service_dospolicy_binding_response.class, response);
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
		return result.service_dospolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, service_dospolicy_binding resource) throws Exception {
		service_dospolicy_binding updateresource = new service_dospolicy_binding();
		updateresource.name = resource.name;
		updateresource.policyname = resource.policyname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, service_dospolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service_dospolicy_binding updateresources[] = new service_dospolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new service_dospolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policyname = resources[i].policyname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, service_dospolicy_binding resource) throws Exception {
		service_dospolicy_binding deleteresource = new service_dospolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, service_dospolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service_dospolicy_binding deleteresources[] = new service_dospolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new service_dospolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch service_dospolicy_binding resources of given name .
	*/
	public static service_dospolicy_binding[] get(nitro_service service, String name) throws Exception{
		service_dospolicy_binding obj = new service_dospolicy_binding();
		obj.set_name(name);
		service_dospolicy_binding response[] = (service_dospolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of service_dospolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static service_dospolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		service_dospolicy_binding obj = new service_dospolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		service_dospolicy_binding[] response = (service_dospolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of service_dospolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static service_dospolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		service_dospolicy_binding obj = new service_dospolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		service_dospolicy_binding[] response = (service_dospolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count service_dospolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		service_dospolicy_binding obj = new service_dospolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		service_dospolicy_binding response[] = (service_dospolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of service_dospolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		service_dospolicy_binding obj = new service_dospolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		service_dospolicy_binding[] response = (service_dospolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of service_dospolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		service_dospolicy_binding obj = new service_dospolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		service_dospolicy_binding[] response = (service_dospolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class monstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}