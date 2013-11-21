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

class policydataset_value_binding_response extends base_response
{
	public policydataset_value_binding[] policydataset_value_binding;
}
/**
	* Binding class showing the value that can be bound to policydataset.
	*/

public class policydataset_value_binding extends base_resource
{
	private String value;
	private Long index;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Value of the specified type that is associated with the dataset.
	* </pre>
	*/
	public void set_value(String value) throws Exception{
		this.value = value;
	}

	/**
	* <pre>
	* Value of the specified type that is associated with the dataset.
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* Name of the dataset to which to bind the value.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the dataset to which to bind the value.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The index of the value (ipv4, ipv6, number) associated with the set.
	* </pre>
	*/
	public void set_index(long index) throws Exception {
		this.index = new Long(index);
	}

	/**
	* <pre>
	* The index of the value (ipv4, ipv6, number) associated with the set.
	* </pre>
	*/
	public void set_index(Long index) throws Exception{
		this.index = index;
	}

	/**
	* <pre>
	* The index of the value (ipv4, ipv6, number) associated with the set.
	* </pre>
	*/
	public Long get_index() throws Exception {
		return this.index;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		policydataset_value_binding_response result = (policydataset_value_binding_response) service.get_payload_formatter().string_to_resource(policydataset_value_binding_response.class, response);
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
		return result.policydataset_value_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, policydataset_value_binding resource) throws Exception {
		policydataset_value_binding updateresource = new policydataset_value_binding();
		updateresource.name = resource.name;
		updateresource.value = resource.value;
		updateresource.index = resource.index;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, policydataset_value_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policydataset_value_binding updateresources[] = new policydataset_value_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new policydataset_value_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].value = resources[i].value;
				updateresources[i].index = resources[i].index;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, policydataset_value_binding resource) throws Exception {
		policydataset_value_binding deleteresource = new policydataset_value_binding();
		deleteresource.name = resource.name;
		deleteresource.value = resource.value;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, policydataset_value_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policydataset_value_binding deleteresources[] = new policydataset_value_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new policydataset_value_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].value = resources[i].value;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch policydataset_value_binding resources of given name .
	*/
	public static policydataset_value_binding[] get(nitro_service service, String name) throws Exception{
		policydataset_value_binding obj = new policydataset_value_binding();
		obj.set_name(name);
		policydataset_value_binding response[] = (policydataset_value_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policydataset_value_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static policydataset_value_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		policydataset_value_binding obj = new policydataset_value_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		policydataset_value_binding[] response = (policydataset_value_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policydataset_value_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static policydataset_value_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		policydataset_value_binding obj = new policydataset_value_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		policydataset_value_binding[] response = (policydataset_value_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count policydataset_value_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		policydataset_value_binding obj = new policydataset_value_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		policydataset_value_binding response[] = (policydataset_value_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policydataset_value_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		policydataset_value_binding obj = new policydataset_value_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policydataset_value_binding[] response = (policydataset_value_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policydataset_value_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		policydataset_value_binding obj = new policydataset_value_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policydataset_value_binding[] response = (policydataset_value_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}