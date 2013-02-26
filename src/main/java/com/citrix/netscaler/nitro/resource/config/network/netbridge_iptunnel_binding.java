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

class netbridge_iptunnel_binding_response extends base_response
{
	public netbridge_iptunnel_binding[] netbridge_iptunnel_binding;
}
/**
	* Binding class showing the iptunnel that can be bound to netbridge.
	*/

public class netbridge_iptunnel_binding extends base_resource
{
	private String tunnel;
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
	* The name of the tunnel that is a part of this bridge.
	* </pre>
	*/
	public void set_tunnel(String tunnel) throws Exception{
		this.tunnel = tunnel;
	}

	/**
	* <pre>
	* The name of the tunnel that is a part of this bridge.
	* </pre>
	*/
	public String get_tunnel() throws Exception {
		return this.tunnel;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		netbridge_iptunnel_binding_response result = (netbridge_iptunnel_binding_response) service.get_payload_formatter().string_to_resource(netbridge_iptunnel_binding_response.class, response);
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
		return result.netbridge_iptunnel_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, netbridge_iptunnel_binding resource) throws Exception {
		netbridge_iptunnel_binding updateresource = new netbridge_iptunnel_binding();
		updateresource.name = resource.name;
		updateresource.tunnel = resource.tunnel;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, netbridge_iptunnel_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			netbridge_iptunnel_binding updateresources[] = new netbridge_iptunnel_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new netbridge_iptunnel_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].tunnel = resources[i].tunnel;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, netbridge_iptunnel_binding resource) throws Exception {
		netbridge_iptunnel_binding deleteresource = new netbridge_iptunnel_binding();
		deleteresource.name = resource.name;
		deleteresource.tunnel = resource.tunnel;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, netbridge_iptunnel_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			netbridge_iptunnel_binding deleteresources[] = new netbridge_iptunnel_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new netbridge_iptunnel_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].tunnel = resources[i].tunnel;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch netbridge_iptunnel_binding resources of given name .
	*/
	public static netbridge_iptunnel_binding[] get(nitro_service service, String name) throws Exception{
		netbridge_iptunnel_binding obj = new netbridge_iptunnel_binding();
		obj.set_name(name);
		netbridge_iptunnel_binding response[] = (netbridge_iptunnel_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of netbridge_iptunnel_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static netbridge_iptunnel_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		netbridge_iptunnel_binding obj = new netbridge_iptunnel_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		netbridge_iptunnel_binding[] response = (netbridge_iptunnel_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of netbridge_iptunnel_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static netbridge_iptunnel_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		netbridge_iptunnel_binding obj = new netbridge_iptunnel_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		netbridge_iptunnel_binding[] response = (netbridge_iptunnel_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count netbridge_iptunnel_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		netbridge_iptunnel_binding obj = new netbridge_iptunnel_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		netbridge_iptunnel_binding response[] = (netbridge_iptunnel_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of netbridge_iptunnel_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		netbridge_iptunnel_binding obj = new netbridge_iptunnel_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		netbridge_iptunnel_binding[] response = (netbridge_iptunnel_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of netbridge_iptunnel_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		netbridge_iptunnel_binding obj = new netbridge_iptunnel_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		netbridge_iptunnel_binding[] response = (netbridge_iptunnel_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}