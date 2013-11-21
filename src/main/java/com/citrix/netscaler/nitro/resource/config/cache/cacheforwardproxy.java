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

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cacheforwardproxy_response extends base_response
{
	public cacheforwardproxy[] cacheforwardproxy;
}
/**
* Configuration for forward proxy resource.
*/

public class cacheforwardproxy extends base_resource
{
	private String ipaddress;
	private Integer port;
	private Long __count;

	/**
	* <pre>
	* IP address of the NetScaler appliance or a cache server for which the cache acts as a proxy. Requests coming to the NetScaler with the configured IP address are forwarded to the particular address, without involving the Integrated Cache in any way.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* IP address of the NetScaler appliance or a cache server for which the cache acts as a proxy. Requests coming to the NetScaler with the configured IP address are forwarded to the particular address, without involving the Integrated Cache in any way.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Port on the NetScaler appliance or a server for which the cache acts as a proxy.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Port on the NetScaler appliance or a server for which the cache acts as a proxy.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Port on the NetScaler appliance or a server for which the cache acts as a proxy.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cacheforwardproxy_response result = (cacheforwardproxy_response) service.get_payload_formatter().string_to_resource(cacheforwardproxy_response.class, response);
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
		return result.cacheforwardproxy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipaddress;
	}

	/**
	* Use this API to add cacheforwardproxy.
	*/
	public static base_response add(nitro_service client, cacheforwardproxy resource) throws Exception {
		cacheforwardproxy addresource = new cacheforwardproxy();
		addresource.ipaddress = resource.ipaddress;
		addresource.port = resource.port;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cacheforwardproxy resources.
	*/
	public static base_responses add(nitro_service client, cacheforwardproxy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cacheforwardproxy addresources[] = new cacheforwardproxy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cacheforwardproxy();
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].port = resources[i].port;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cacheforwardproxy of given name.
	*/
	public static base_response delete(nitro_service client, String ipaddress) throws Exception {
		cacheforwardproxy deleteresource = new cacheforwardproxy();
		deleteresource.ipaddress = ipaddress;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cacheforwardproxy.
	*/
	public static base_response delete(nitro_service client, cacheforwardproxy resource) throws Exception {
		cacheforwardproxy deleteresource = new cacheforwardproxy();
		deleteresource.ipaddress = resource.ipaddress;
		deleteresource.port = resource.port;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cacheforwardproxy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ipaddress[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			cacheforwardproxy deleteresources[] = new cacheforwardproxy[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				deleteresources[i] = new cacheforwardproxy();
				deleteresources[i].ipaddress = ipaddress[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cacheforwardproxy resources.
	*/
	public static base_responses delete(nitro_service client, cacheforwardproxy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cacheforwardproxy deleteresources[] = new cacheforwardproxy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cacheforwardproxy();
				deleteresources[i].ipaddress = resources[i].ipaddress;
				deleteresources[i].port = resources[i].port;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the cacheforwardproxy resources that are configured on netscaler.
	*/
	public static cacheforwardproxy[] get(nitro_service service) throws Exception{
		cacheforwardproxy obj = new cacheforwardproxy();
		cacheforwardproxy[] response = (cacheforwardproxy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cacheforwardproxy resources that are configured on netscaler.
	*/
	public static cacheforwardproxy[] get(nitro_service service, options option) throws Exception{
		cacheforwardproxy obj = new cacheforwardproxy();
		cacheforwardproxy[] response = (cacheforwardproxy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of cacheforwardproxy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cacheforwardproxy[] get_filtered(nitro_service service, String filter) throws Exception{
		cacheforwardproxy obj = new cacheforwardproxy();
		options option = new options();
		option.set_filter(filter);
		cacheforwardproxy[] response = (cacheforwardproxy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cacheforwardproxy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cacheforwardproxy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cacheforwardproxy obj = new cacheforwardproxy();
		options option = new options();
		option.set_filter(filter);
		cacheforwardproxy[] response = (cacheforwardproxy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cacheforwardproxy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cacheforwardproxy obj = new cacheforwardproxy();
		options option = new options();
		option.set_count(true);
		cacheforwardproxy[] response = (cacheforwardproxy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cacheforwardproxy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cacheforwardproxy obj = new cacheforwardproxy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cacheforwardproxy[] response = (cacheforwardproxy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cacheforwardproxy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cacheforwardproxy obj = new cacheforwardproxy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cacheforwardproxy[] response = (cacheforwardproxy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
