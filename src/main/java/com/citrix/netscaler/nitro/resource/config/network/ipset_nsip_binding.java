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

class ipset_nsip_binding_response extends base_response
{
	public ipset_nsip_binding[] ipset_nsip_binding;
}
/**
	* Binding class showing the nsip that can be bound to ipset.
	*/

public class ipset_nsip_binding extends base_resource
{
	private String ipaddress;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Name of the IP set to which to bind IP addresses.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the IP set to which to bind IP addresses.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* One or more IP addresses bound to the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* One or more IP addresses bound to the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		ipset_nsip_binding_response result = (ipset_nsip_binding_response) service.get_payload_formatter().string_to_resource(ipset_nsip_binding_response.class, response);
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
		return result.ipset_nsip_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, ipset_nsip_binding resource) throws Exception {
		ipset_nsip_binding updateresource = new ipset_nsip_binding();
		updateresource.name = resource.name;
		updateresource.ipaddress = resource.ipaddress;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, ipset_nsip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ipset_nsip_binding updateresources[] = new ipset_nsip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new ipset_nsip_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipaddress = resources[i].ipaddress;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, ipset_nsip_binding resource) throws Exception {
		ipset_nsip_binding deleteresource = new ipset_nsip_binding();
		deleteresource.name = resource.name;
		deleteresource.ipaddress = resource.ipaddress;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, ipset_nsip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ipset_nsip_binding deleteresources[] = new ipset_nsip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new ipset_nsip_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].ipaddress = resources[i].ipaddress;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch ipset_nsip_binding resources of given name .
	*/
	public static ipset_nsip_binding[] get(nitro_service service, String name) throws Exception{
		ipset_nsip_binding obj = new ipset_nsip_binding();
		obj.set_name(name);
		ipset_nsip_binding response[] = (ipset_nsip_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ipset_nsip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static ipset_nsip_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		ipset_nsip_binding obj = new ipset_nsip_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		ipset_nsip_binding[] response = (ipset_nsip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ipset_nsip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ipset_nsip_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		ipset_nsip_binding obj = new ipset_nsip_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		ipset_nsip_binding[] response = (ipset_nsip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count ipset_nsip_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		ipset_nsip_binding obj = new ipset_nsip_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		ipset_nsip_binding response[] = (ipset_nsip_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ipset_nsip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		ipset_nsip_binding obj = new ipset_nsip_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ipset_nsip_binding[] response = (ipset_nsip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ipset_nsip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		ipset_nsip_binding obj = new ipset_nsip_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ipset_nsip_binding[] response = (ipset_nsip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}