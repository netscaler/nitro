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

class rnat6_nsip6_binding_response extends base_response
{
	public rnat6_nsip6_binding[] rnat6_nsip6_binding;
}
/**
	* Binding class showing the nsip6 that can be bound to rnat6.
	*/

public class rnat6_nsip6_binding extends base_resource
{
	private String natip6;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Name of the RNAT6.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the RNAT6.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Nat IP Address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_natip6(String natip6) throws Exception{
		this.natip6 = natip6;
	}

	/**
	* <pre>
	* Nat IP Address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_natip6() throws Exception {
		return this.natip6;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rnat6_nsip6_binding_response result = (rnat6_nsip6_binding_response) service.get_payload_formatter().string_to_resource(rnat6_nsip6_binding_response.class, response);
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
		return result.rnat6_nsip6_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, rnat6_nsip6_binding resource) throws Exception {
		rnat6_nsip6_binding updateresource = new rnat6_nsip6_binding();
		updateresource.name = resource.name;
		updateresource.natip6 = resource.natip6;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, rnat6_nsip6_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat6_nsip6_binding updateresources[] = new rnat6_nsip6_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new rnat6_nsip6_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].natip6 = resources[i].natip6;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, rnat6_nsip6_binding resource) throws Exception {
		rnat6_nsip6_binding deleteresource = new rnat6_nsip6_binding();
		deleteresource.name = resource.name;
		deleteresource.natip6 = resource.natip6;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, rnat6_nsip6_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat6_nsip6_binding deleteresources[] = new rnat6_nsip6_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new rnat6_nsip6_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].natip6 = resources[i].natip6;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch rnat6_nsip6_binding resources of given name .
	*/
	public static rnat6_nsip6_binding[] get(nitro_service service, String name) throws Exception{
		rnat6_nsip6_binding obj = new rnat6_nsip6_binding();
		obj.set_name(name);
		rnat6_nsip6_binding response[] = (rnat6_nsip6_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rnat6_nsip6_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static rnat6_nsip6_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		rnat6_nsip6_binding obj = new rnat6_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		rnat6_nsip6_binding[] response = (rnat6_nsip6_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rnat6_nsip6_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static rnat6_nsip6_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		rnat6_nsip6_binding obj = new rnat6_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		rnat6_nsip6_binding[] response = (rnat6_nsip6_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count rnat6_nsip6_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		rnat6_nsip6_binding obj = new rnat6_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		rnat6_nsip6_binding response[] = (rnat6_nsip6_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rnat6_nsip6_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		rnat6_nsip6_binding obj = new rnat6_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rnat6_nsip6_binding[] response = (rnat6_nsip6_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rnat6_nsip6_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		rnat6_nsip6_binding obj = new rnat6_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rnat6_nsip6_binding[] response = (rnat6_nsip6_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}