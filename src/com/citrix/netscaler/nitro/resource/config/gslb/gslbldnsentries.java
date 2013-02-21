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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbldnsentries_response extends base_response
{
	public gslbldnsentries[] gslbldnsentries;
}
/**
* Configuration for LDAP entries resource.
*/

public class gslbldnsentries extends base_resource
{

	//------- Read only Parameter ---------;

	private String sitename;
	private Long numsites;
	private String ipaddress;
	private Long ttl;
	private String name;
	private Long[] rtt;
	private Long __count;

	/**
	* <pre>
	* The GSLB site name.
	* </pre>
	*/
	public String get_sitename() throws Exception {
		return this.sitename;
	}

	/**
	* <pre>
	* Specifies the number of gslb sites.
	* </pre>
	*/
	public Long get_numsites() throws Exception {
		return this.numsites;
	}

	/**
	* <pre>
	* IP address of the LDNS server.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* TTL value of the LDNS entry.
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* Monitor that is currently being used to monitor the LDNS ip..
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* RTT value of the LDNS entry for all gslb sites.
	* </pre>
	*/
	public Long[] get_rtt() throws Exception {
		return this.rtt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbldnsentries_response result = (gslbldnsentries_response) service.get_payload_formatter().string_to_resource(gslbldnsentries_response.class, response);
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
		return result.gslbldnsentries;
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
	* Use this API to clear gslbldnsentries.
	*/
	public static base_response clear(nitro_service client) throws Exception {
		gslbldnsentries clearresource = new gslbldnsentries();
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear gslbldnsentries resources.
	*/
	public static base_responses clear(nitro_service client, gslbldnsentries resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbldnsentries clearresources[] = new gslbldnsentries[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new gslbldnsentries();
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to fetch all the gslbldnsentries resources that are configured on netscaler.
	*/
	public static gslbldnsentries[] get(nitro_service service) throws Exception{
		gslbldnsentries obj = new gslbldnsentries();
		gslbldnsentries[] response = (gslbldnsentries[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the gslbldnsentries resources that are configured on netscaler.
	*/
	public static gslbldnsentries[] get(nitro_service service, options option) throws Exception{
		gslbldnsentries obj = new gslbldnsentries();
		gslbldnsentries[] response = (gslbldnsentries[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of gslbldnsentries resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static gslbldnsentries[] get_filtered(nitro_service service, String filter) throws Exception{
		gslbldnsentries obj = new gslbldnsentries();
		options option = new options();
		option.set_filter(filter);
		gslbldnsentries[] response = (gslbldnsentries[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbldnsentries resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static gslbldnsentries[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		gslbldnsentries obj = new gslbldnsentries();
		options option = new options();
		option.set_filter(filter);
		gslbldnsentries[] response = (gslbldnsentries[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the gslbldnsentries resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		gslbldnsentries obj = new gslbldnsentries();
		options option = new options();
		option.set_count(true);
		gslbldnsentries[] response = (gslbldnsentries[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of gslbldnsentries resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		gslbldnsentries obj = new gslbldnsentries();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbldnsentries[] response = (gslbldnsentries[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbldnsentries resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		gslbldnsentries obj = new gslbldnsentries();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbldnsentries[] response = (gslbldnsentries[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
