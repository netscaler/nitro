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

class ipset_response extends base_response
{
	public ipset[] ipset;
}
/**
* Configuration for network ipset resource.
*/

public class ipset extends base_resource
{
	private String name;
	private Long __count;

	/**
	* <pre>
	* The name of the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the IP set.<br> Minimum length =  1
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
		ipset_response result = (ipset_response) service.get_payload_formatter().string_to_resource(ipset_response.class, response);
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
		return result.ipset;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add ipset.
	*/
	public static base_response add(nitro_service client, ipset resource) throws Exception {
		ipset addresource = new ipset();
		addresource.name = resource.name;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add ipset resources.
	*/
	public static base_responses add(nitro_service client, ipset resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ipset addresources[] = new ipset[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new ipset();
				addresources[i].name = resources[i].name;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete ipset of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		ipset deleteresource = new ipset();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ipset.
	*/
	public static base_response delete(nitro_service client, ipset resource) throws Exception {
		ipset deleteresource = new ipset();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ipset resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			ipset deleteresources[] = new ipset[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new ipset();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete ipset resources.
	*/
	public static base_responses delete(nitro_service client, ipset resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ipset deleteresources[] = new ipset[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new ipset();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the ipset resources that are configured on netscaler.
	*/
	public static ipset[] get(nitro_service service) throws Exception{
		ipset obj = new ipset();
		ipset[] response = (ipset[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the ipset resources that are configured on netscaler.
	*/
	public static ipset[] get(nitro_service service, options option) throws Exception{
		ipset obj = new ipset();
		ipset[] response = (ipset[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch ipset resource of given name .
	*/
	public static ipset get(nitro_service service, String name) throws Exception{
		ipset obj = new ipset();
		obj.set_name(name);
		ipset response = (ipset) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch ipset resources of given names .
	*/
	public static ipset[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			ipset response[] = new ipset[name.length];
			ipset obj[] = new ipset[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new ipset();
				obj[i].set_name(name[i]);
				response[i] = (ipset) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of ipset resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static ipset[] get_filtered(nitro_service service, String filter) throws Exception{
		ipset obj = new ipset();
		options option = new options();
		option.set_filter(filter);
		ipset[] response = (ipset[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ipset resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ipset[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ipset obj = new ipset();
		options option = new options();
		option.set_filter(filter);
		ipset[] response = (ipset[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ipset resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		ipset obj = new ipset();
		options option = new options();
		option.set_count(true);
		ipset[] response = (ipset[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of ipset resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		ipset obj = new ipset();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ipset[] response = (ipset[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ipset resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ipset obj = new ipset();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ipset[] response = (ipset[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
