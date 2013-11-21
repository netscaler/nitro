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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbroute_response extends base_response
{
	public lbroute[] lbroute;
}
/**
* Configuration for LB route resource.
*/

public class lbroute extends base_resource
{
	private String network;
	private String netmask;
	private String gatewayname;

	//------- Read only Parameter ---------;

	private String flags;
	private Long __count;

	/**
	* <pre>
	* The IP address of the network to which the route belongs.
	* </pre>
	*/
	public void set_network(String network) throws Exception{
		this.network = network;
	}

	/**
	* <pre>
	* The IP address of the network to which the route belongs.
	* </pre>
	*/
	public String get_network() throws Exception {
		return this.network;
	}

	/**
	* <pre>
	* The netmask to which the route belongs.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The netmask to which the route belongs.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The name of the route.<br> Minimum length =  1
	* </pre>
	*/
	public void set_gatewayname(String gatewayname) throws Exception{
		this.gatewayname = gatewayname;
	}

	/**
	* <pre>
	* The name of the route.<br> Minimum length =  1
	* </pre>
	*/
	public String get_gatewayname() throws Exception {
		return this.gatewayname;
	}

	/**
	* <pre>
	* State of the configured gateway.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbroute_response result = (lbroute_response) service.get_payload_formatter().string_to_resource(lbroute_response.class, response);
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
		return result.lbroute;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.network;
	}

	/**
	* Use this API to add lbroute.
	*/
	public static base_response add(nitro_service client, lbroute resource) throws Exception {
		lbroute addresource = new lbroute();
		addresource.network = resource.network;
		addresource.netmask = resource.netmask;
		addresource.gatewayname = resource.gatewayname;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add lbroute resources.
	*/
	public static base_responses add(nitro_service client, lbroute resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbroute addresources[] = new lbroute[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new lbroute();
				addresources[i].network = resources[i].network;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].gatewayname = resources[i].gatewayname;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbroute of given name.
	*/
	public static base_response delete(nitro_service client, String network) throws Exception {
		lbroute deleteresource = new lbroute();
		deleteresource.network = network;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbroute.
	*/
	public static base_response delete(nitro_service client, lbroute resource) throws Exception {
		lbroute deleteresource = new lbroute();
		deleteresource.network = resource.network;
		deleteresource.netmask = resource.netmask;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbroute resources of given names.
	*/
	public static base_responses delete(nitro_service client, String network[]) throws Exception {
		base_responses result = null;
		if (network != null && network.length > 0) {
			lbroute deleteresources[] = new lbroute[network.length];
			for (int i=0;i<network.length;i++){
				deleteresources[i] = new lbroute();
				deleteresources[i].network = network[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbroute resources.
	*/
	public static base_responses delete(nitro_service client, lbroute resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbroute deleteresources[] = new lbroute[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbroute();
				deleteresources[i].network = resources[i].network;
				deleteresources[i].netmask = resources[i].netmask;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the lbroute resources that are configured on netscaler.
	*/
	public static lbroute[] get(nitro_service service) throws Exception{
		lbroute obj = new lbroute();
		lbroute[] response = (lbroute[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lbroute resources that are configured on netscaler.
	*/
	public static lbroute[] get(nitro_service service, options option) throws Exception{
		lbroute obj = new lbroute();
		lbroute[] response = (lbroute[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a lbroute resource.
	*/
	public static lbroute get(nitro_service service, lbroute obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		lbroute response = (lbroute) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a lbroute resources.
	*/
	public static lbroute[] get(nitro_service service, lbroute obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			lbroute response[] = new lbroute[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (lbroute) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of lbroute resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbroute[] get_filtered(nitro_service service, String filter) throws Exception{
		lbroute obj = new lbroute();
		options option = new options();
		option.set_filter(filter);
		lbroute[] response = (lbroute[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbroute resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbroute[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbroute obj = new lbroute();
		options option = new options();
		option.set_filter(filter);
		lbroute[] response = (lbroute[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbroute resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lbroute obj = new lbroute();
		options option = new options();
		option.set_count(true);
		lbroute[] response = (lbroute[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbroute resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lbroute obj = new lbroute();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbroute[] response = (lbroute[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbroute resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbroute obj = new lbroute();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbroute[] response = (lbroute[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class flagsEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String Unknown = "Unknown";
		public static final String DISABLED = "DISABLED";
	}
}
