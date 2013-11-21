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

class ip6tunnel_response extends base_response
{
	public ip6tunnel[] ip6tunnel;
}
/**
* Configuration for ip6 Tunnel resource.
*/

public class ip6tunnel extends base_resource
{
	private String name;
	private String remote;
	private String local;

	//------- Read only Parameter ---------;

	private String remoteip;
	private Long type;
	private String encapip;
	private Long __count;

	/**
	* <pre>
	* Name for the IPv6 Tunnel. Cannot be changed after the service group is created. Must begin with a number or letter, and can consist of letters, numbers, and the @ _ - . (period) : (colon) # and space ( ) characters.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the IPv6 Tunnel. Cannot be changed after the service group is created. Must begin with a number or letter, and can consist of letters, numbers, and the @ _ - . (period) : (colon) # and space ( ) characters.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* An IPv6 address of the remote NetScaler appliance used to set up the tunnel.<br> Minimum length =  1
	* </pre>
	*/
	public void set_remote(String remote) throws Exception{
		this.remote = remote;
	}

	/**
	* <pre>
	* An IPv6 address of the remote NetScaler appliance used to set up the tunnel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_remote() throws Exception {
		return this.remote;
	}

	/**
	* <pre>
	* An IPv6 address of the local NetScaler appliance used to set up the tunnel.
	* </pre>
	*/
	public void set_local(String local) throws Exception{
		this.local = local;
	}

	/**
	* <pre>
	* An IPv6 address of the local NetScaler appliance used to set up the tunnel.
	* </pre>
	*/
	public String get_local() throws Exception {
		return this.local;
	}

	/**
	* <pre>
	* The remote IP address or subnet of the tunnel.
	* </pre>
	*/
	public String get_remoteip() throws Exception {
		return this.remoteip;
	}

	/**
	* <pre>
	* The type of this tunnel.
	* </pre>
	*/
	public Long get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The effective local IP address of the tunnel. Used as the source of the encapsulated packets.
	* </pre>
	*/
	public String get_encapip() throws Exception {
		return this.encapip;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		ip6tunnel_response result = (ip6tunnel_response) service.get_payload_formatter().string_to_resource(ip6tunnel_response.class, response);
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
		return result.ip6tunnel;
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
	* Use this API to add ip6tunnel.
	*/
	public static base_response add(nitro_service client, ip6tunnel resource) throws Exception {
		ip6tunnel addresource = new ip6tunnel();
		addresource.name = resource.name;
		addresource.remote = resource.remote;
		addresource.local = resource.local;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add ip6tunnel resources.
	*/
	public static base_responses add(nitro_service client, ip6tunnel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ip6tunnel addresources[] = new ip6tunnel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new ip6tunnel();
				addresources[i].name = resources[i].name;
				addresources[i].remote = resources[i].remote;
				addresources[i].local = resources[i].local;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete ip6tunnel of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		ip6tunnel deleteresource = new ip6tunnel();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ip6tunnel.
	*/
	public static base_response delete(nitro_service client, ip6tunnel resource) throws Exception {
		ip6tunnel deleteresource = new ip6tunnel();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ip6tunnel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			ip6tunnel deleteresources[] = new ip6tunnel[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new ip6tunnel();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete ip6tunnel resources.
	*/
	public static base_responses delete(nitro_service client, ip6tunnel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ip6tunnel deleteresources[] = new ip6tunnel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new ip6tunnel();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the ip6tunnel resources that are configured on netscaler.
	*/
	public static ip6tunnel[] get(nitro_service service) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		ip6tunnel[] response = (ip6tunnel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the ip6tunnel resources that are configured on netscaler.
	*/
	public static ip6tunnel[] get(nitro_service service, options option) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		ip6tunnel[] response = (ip6tunnel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the ip6tunnel resources that are configured on netscaler.
	* This uses ip6tunnel_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static ip6tunnel[] get(nitro_service service, ip6tunnel_args args) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		ip6tunnel[] response = (ip6tunnel[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch ip6tunnel resource of given name .
	*/
	public static ip6tunnel get(nitro_service service, String name) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		obj.set_name(name);
		ip6tunnel response = (ip6tunnel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch ip6tunnel resources of given names .
	*/
	public static ip6tunnel[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			ip6tunnel response[] = new ip6tunnel[name.length];
			ip6tunnel obj[] = new ip6tunnel[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new ip6tunnel();
				obj[i].set_name(name[i]);
				response[i] = (ip6tunnel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of ip6tunnel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static ip6tunnel[] get_filtered(nitro_service service, String filter) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		options option = new options();
		option.set_filter(filter);
		ip6tunnel[] response = (ip6tunnel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ip6tunnel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ip6tunnel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		options option = new options();
		option.set_filter(filter);
		ip6tunnel[] response = (ip6tunnel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ip6tunnel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		options option = new options();
		option.set_count(true);
		ip6tunnel[] response = (ip6tunnel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of ip6tunnel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ip6tunnel[] response = (ip6tunnel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ip6tunnel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ip6tunnel obj = new ip6tunnel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ip6tunnel[] response = (ip6tunnel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
