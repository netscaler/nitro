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

class netbridge_response extends base_response
{
	public netbridge[] netbridge;
}
/**
* Configuration for network bridge resource.
*/

public class netbridge extends base_resource
{
	private String name;
	private Long __count;

	/**
	* <pre>
	* The name of the network bridge.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the network bridge.
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
		netbridge_response result = (netbridge_response) service.get_payload_formatter().string_to_resource(netbridge_response.class, response);
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
		return result.netbridge;
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
	* Use this API to add netbridge.
	*/
	public static base_response add(nitro_service client, netbridge resource) throws Exception {
		netbridge addresource = new netbridge();
		addresource.name = resource.name;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add netbridge resources.
	*/
	public static base_responses add(nitro_service client, netbridge resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			netbridge addresources[] = new netbridge[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new netbridge();
				addresources[i].name = resources[i].name;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete netbridge of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		netbridge deleteresource = new netbridge();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete netbridge.
	*/
	public static base_response delete(nitro_service client, netbridge resource) throws Exception {
		netbridge deleteresource = new netbridge();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete netbridge resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			netbridge deleteresources[] = new netbridge[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new netbridge();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete netbridge resources.
	*/
	public static base_responses delete(nitro_service client, netbridge resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			netbridge deleteresources[] = new netbridge[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new netbridge();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the netbridge resources that are configured on netscaler.
	*/
	public static netbridge[] get(nitro_service service) throws Exception{
		netbridge obj = new netbridge();
		netbridge[] response = (netbridge[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the netbridge resources that are configured on netscaler.
	*/
	public static netbridge[] get(nitro_service service, options option) throws Exception{
		netbridge obj = new netbridge();
		netbridge[] response = (netbridge[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch netbridge resource of given name .
	*/
	public static netbridge get(nitro_service service, String name) throws Exception{
		netbridge obj = new netbridge();
		obj.set_name(name);
		netbridge response = (netbridge) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch netbridge resources of given names .
	*/
	public static netbridge[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			netbridge response[] = new netbridge[name.length];
			netbridge obj[] = new netbridge[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new netbridge();
				obj[i].set_name(name[i]);
				response[i] = (netbridge) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of netbridge resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static netbridge[] get_filtered(nitro_service service, String filter) throws Exception{
		netbridge obj = new netbridge();
		options option = new options();
		option.set_filter(filter);
		netbridge[] response = (netbridge[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of netbridge resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static netbridge[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		netbridge obj = new netbridge();
		options option = new options();
		option.set_filter(filter);
		netbridge[] response = (netbridge[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the netbridge resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		netbridge obj = new netbridge();
		options option = new options();
		option.set_count(true);
		netbridge[] response = (netbridge[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of netbridge resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		netbridge obj = new netbridge();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		netbridge[] response = (netbridge[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of netbridge resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		netbridge obj = new netbridge();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		netbridge[] response = (netbridge[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
