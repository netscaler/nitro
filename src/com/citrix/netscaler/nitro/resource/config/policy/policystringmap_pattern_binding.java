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

package com.citrix.netscaler.nitro.resource.config.policy;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class policystringmap_pattern_binding_response extends base_response
{
	public policystringmap_pattern_binding[] policystringmap_pattern_binding;
}
/**
	* Binding class showing the pattern that can be bound to policystringmap.
	*/

public class policystringmap_pattern_binding extends base_resource
{
	private String key;
	private String value;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The key in the string map.<br> Minimum length =  1
	* </pre>
	*/
	public void set_key(String key) throws Exception{
		this.key = key;
	}

	/**
	* <pre>
	* The key in the string map.<br> Minimum length =  1
	* </pre>
	*/
	public String get_key() throws Exception {
		return this.key;
	}

	/**
	* <pre>
	* The value associated with the key in the string map.<br> Minimum length =  1
	* </pre>
	*/
	public void set_value(String value) throws Exception{
		this.value = value;
	}

	/**
	* <pre>
	* The value associated with the key in the string map.<br> Minimum length =  1
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* The name of the string map.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the string map.<br> Minimum length =  1
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
		policystringmap_pattern_binding_response result = (policystringmap_pattern_binding_response) service.get_payload_formatter().string_to_resource(policystringmap_pattern_binding_response.class, response);
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
		return result.policystringmap_pattern_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, policystringmap_pattern_binding resource) throws Exception {
		policystringmap_pattern_binding updateresource = new policystringmap_pattern_binding();
		updateresource.name = resource.name;
		updateresource.key = resource.key;
		updateresource.value = resource.value;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, policystringmap_pattern_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policystringmap_pattern_binding updateresources[] = new policystringmap_pattern_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new policystringmap_pattern_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].key = resources[i].key;
				updateresources[i].value = resources[i].value;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, policystringmap_pattern_binding resource) throws Exception {
		policystringmap_pattern_binding deleteresource = new policystringmap_pattern_binding();
		deleteresource.name = resource.name;
		deleteresource.key = resource.key;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, policystringmap_pattern_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policystringmap_pattern_binding deleteresources[] = new policystringmap_pattern_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new policystringmap_pattern_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].key = resources[i].key;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch policystringmap_pattern_binding resources of given name .
	*/
	public static policystringmap_pattern_binding[] get(nitro_service service, String name) throws Exception{
		policystringmap_pattern_binding obj = new policystringmap_pattern_binding();
		obj.set_name(name);
		policystringmap_pattern_binding response[] = (policystringmap_pattern_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policystringmap_pattern_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static policystringmap_pattern_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		policystringmap_pattern_binding obj = new policystringmap_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		policystringmap_pattern_binding[] response = (policystringmap_pattern_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policystringmap_pattern_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static policystringmap_pattern_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		policystringmap_pattern_binding obj = new policystringmap_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		policystringmap_pattern_binding[] response = (policystringmap_pattern_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count policystringmap_pattern_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		policystringmap_pattern_binding obj = new policystringmap_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		policystringmap_pattern_binding response[] = (policystringmap_pattern_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policystringmap_pattern_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		policystringmap_pattern_binding obj = new policystringmap_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policystringmap_pattern_binding[] response = (policystringmap_pattern_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policystringmap_pattern_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		policystringmap_pattern_binding obj = new policystringmap_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policystringmap_pattern_binding[] response = (policystringmap_pattern_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}