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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nslimitsessions_response extends base_response
{
	public nslimitsessions[] nslimitsessions;
}
/**
* Configuration for limit sessions resource.
*/

public class nslimitsessions extends base_resource
{
	private String limitidentifier;
	private Boolean detail;

	//------- Read only Parameter ---------;

	private Long timeout;
	private Long hits;
	private Long drop;
	private Long[] number;
	private String name;
	private Long unit;
	private Long flags;
	private Long referencecount;
	private Long maxbandwidth;
	private String selectoripv61;
	private String selectoripv62;
	private Long flag;
	private Long __count;

	/**
	* <pre>
	* Name of the rate limit identifier for which to display the sessions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_limitidentifier(String limitidentifier) throws Exception{
		this.limitidentifier = limitidentifier;
	}

	/**
	* <pre>
	* Name of the rate limit identifier for which to display the sessions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_limitidentifier() throws Exception {
		return this.limitidentifier;
	}

	/**
	* <pre>
	* Show the individual hash values.
	* </pre>
	*/
	public void set_detail(boolean detail) throws Exception {
		this.detail = new Boolean(detail);
	}

	/**
	* <pre>
	* Show the individual hash values.
	* </pre>
	*/
	public void set_detail(Boolean detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* Show the individual hash values.
	* </pre>
	*/
	public Boolean get_detail() throws Exception {
		return this.detail;
	}

	/**
	* <pre>
	* The time remaining on the session before a flush can be attempted. If active transactions are present the session will not be flushed.
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* The number of times this entry was hit.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of times action was taken.
	* </pre>
	*/
	public Long get_drop() throws Exception {
		return this.drop;
	}

	/**
	* <pre>
	* The hash of the matched selectlets.
	* </pre>
	*/
	public Long[] get_number() throws Exception {
		return this.number;
	}

	/**
	* <pre>
	* The string formed by gathering selectlet values.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Total computed hash of the matched selectlets.
	* </pre>
	*/
	public Long get_unit() throws Exception {
		return this.unit;
	}

	/**
	* <pre>
	* Used internally to identify ip addresses.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Total number of transactions pointing to this entry. Its the sum total of the connection and bandwidth references.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* The current bandwidth.
	* </pre>
	*/
	public Long get_maxbandwidth() throws Exception {
		return this.maxbandwidth;
	}

	/**
	* <pre>
	* First IPV6 address gathered.
	* </pre>
	*/
	public String get_selectoripv61() throws Exception {
		return this.selectoripv61;
	}

	/**
	* <pre>
	* Second IPV6 address gathered.
	* </pre>
	*/
	public String get_selectoripv62() throws Exception {
		return this.selectoripv62;
	}

	/**
	* <pre>
	* Used internally to identify ipv6 addresses.
	* </pre>
	*/
	public Long get_flag() throws Exception {
		return this.flag;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nslimitsessions_response result = (nslimitsessions_response) service.get_payload_formatter().string_to_resource(nslimitsessions_response.class, response);
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
		return result.nslimitsessions;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to clear nslimitsessions.
	*/
	public static base_response clear(nitro_service client, nslimitsessions resource) throws Exception {
		nslimitsessions clearresource = new nslimitsessions();
		clearresource.limitidentifier = resource.limitidentifier;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear nslimitsessions resources.
	*/
	public static base_responses clear(nitro_service client, nslimitsessions resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitsessions clearresources[] = new nslimitsessions[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new nslimitsessions();
				clearresources[i].limitidentifier = resources[i].limitidentifier;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to fetch a nslimitsessions resource.
	*/
	public static nslimitsessions get(nitro_service service, nslimitsessions obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nslimitsessions response = (nslimitsessions) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a nslimitsessions resources.
	*/
	public static nslimitsessions[] get(nitro_service service, nslimitsessions obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			nslimitsessions response[] = new nslimitsessions[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (nslimitsessions) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the nslimitsessions resources that are configured on netscaler.
	* This uses nslimitsessions_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static nslimitsessions[] get(nitro_service service, nslimitsessions_args args) throws Exception{
		nslimitsessions obj = new nslimitsessions();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		nslimitsessions[] response = (nslimitsessions[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nslimitsessions resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nslimitsessions[] get_filtered(nitro_service service, nslimitsessions obj, String filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nslimitsessions[] response = (nslimitsessions[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nslimitsessions resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nslimitsessions[] get_filtered(nitro_service service, nslimitsessions obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nslimitsessions[] response = (nslimitsessions[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nslimitsessions resources configured on NetScaler.
	*/
	public static long count(nitro_service service, nslimitsessions obj) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nslimitsessions[] response = (nslimitsessions[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nslimitsessions resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, nslimitsessions obj, String filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nslimitsessions[] response = (nslimitsessions[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nslimitsessions resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, nslimitsessions obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		nslimitsessions[] response = (nslimitsessions[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
