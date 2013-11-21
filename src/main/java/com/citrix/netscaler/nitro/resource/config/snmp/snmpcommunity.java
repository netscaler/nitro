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

package com.citrix.netscaler.nitro.resource.config.snmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class snmpcommunity_response extends base_response
{
	public snmpcommunity[] snmpcommunity;
}
/**
* Configuration for community resource.
*/

public class snmpcommunity extends base_resource
{
	private String communityname;
	private String permissions;
	private Long __count;

	/**
	* <pre>
	* The SNMP community string. Can consist of 1 to 31 characters that include uppercase and lowercase letters, numbers, and special characters.

The following requirement applies only to the NetScaler CLI:
If the string includes one or more spaces, enclose the name in double or single quotation marks (for example, "my string" or 'my string').<br> Minimum length =  1
	* </pre>
	*/
	public void set_communityname(String communityname) throws Exception{
		this.communityname = communityname;
	}

	/**
	* <pre>
	* The SNMP community string. Can consist of 1 to 31 characters that include uppercase and lowercase letters, numbers, and special characters.

The following requirement applies only to the NetScaler CLI:
If the string includes one or more spaces, enclose the name in double or single quotation marks (for example, "my string" or 'my string').<br> Minimum length =  1
	* </pre>
	*/
	public String get_communityname() throws Exception {
		return this.communityname;
	}

	/**
	* <pre>
	* The SNMP V1 or V2 query-type privilege that you want to associate with this SNMP community.<br> Possible values = GET, GET_NEXT, GET_BULK, SET, ALL
	* </pre>
	*/
	public void set_permissions(String permissions) throws Exception{
		this.permissions = permissions;
	}

	/**
	* <pre>
	* The SNMP V1 or V2 query-type privilege that you want to associate with this SNMP community.<br> Possible values = GET, GET_NEXT, GET_BULK, SET, ALL
	* </pre>
	*/
	public String get_permissions() throws Exception {
		return this.permissions;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmpcommunity_response result = (snmpcommunity_response) service.get_payload_formatter().string_to_resource(snmpcommunity_response.class, response);
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
		return result.snmpcommunity;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.communityname;
	}

	/**
	* Use this API to add snmpcommunity.
	*/
	public static base_response add(nitro_service client, snmpcommunity resource) throws Exception {
		snmpcommunity addresource = new snmpcommunity();
		addresource.communityname = resource.communityname;
		addresource.permissions = resource.permissions;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add snmpcommunity resources.
	*/
	public static base_responses add(nitro_service client, snmpcommunity resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpcommunity addresources[] = new snmpcommunity[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new snmpcommunity();
				addresources[i].communityname = resources[i].communityname;
				addresources[i].permissions = resources[i].permissions;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpcommunity of given name.
	*/
	public static base_response delete(nitro_service client, String communityname) throws Exception {
		snmpcommunity deleteresource = new snmpcommunity();
		deleteresource.communityname = communityname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpcommunity.
	*/
	public static base_response delete(nitro_service client, snmpcommunity resource) throws Exception {
		snmpcommunity deleteresource = new snmpcommunity();
		deleteresource.communityname = resource.communityname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpcommunity resources of given names.
	*/
	public static base_responses delete(nitro_service client, String communityname[]) throws Exception {
		base_responses result = null;
		if (communityname != null && communityname.length > 0) {
			snmpcommunity deleteresources[] = new snmpcommunity[communityname.length];
			for (int i=0;i<communityname.length;i++){
				deleteresources[i] = new snmpcommunity();
				deleteresources[i].communityname = communityname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpcommunity resources.
	*/
	public static base_responses delete(nitro_service client, snmpcommunity resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpcommunity deleteresources[] = new snmpcommunity[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new snmpcommunity();
				deleteresources[i].communityname = resources[i].communityname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmpcommunity resources that are configured on netscaler.
	*/
	public static snmpcommunity[] get(nitro_service service) throws Exception{
		snmpcommunity obj = new snmpcommunity();
		snmpcommunity[] response = (snmpcommunity[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmpcommunity resources that are configured on netscaler.
	*/
	public static snmpcommunity[] get(nitro_service service, options option) throws Exception{
		snmpcommunity obj = new snmpcommunity();
		snmpcommunity[] response = (snmpcommunity[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch snmpcommunity resource of given name .
	*/
	public static snmpcommunity get(nitro_service service, String communityname) throws Exception{
		snmpcommunity obj = new snmpcommunity();
		obj.set_communityname(communityname);
		snmpcommunity response = (snmpcommunity) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch snmpcommunity resources of given names .
	*/
	public static snmpcommunity[] get(nitro_service service, String communityname[]) throws Exception{
		if (communityname !=null && communityname.length>0) {
			snmpcommunity response[] = new snmpcommunity[communityname.length];
			snmpcommunity obj[] = new snmpcommunity[communityname.length];
			for (int i=0;i<communityname.length;i++) {
				obj[i] = new snmpcommunity();
				obj[i].set_communityname(communityname[i]);
				response[i] = (snmpcommunity) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmpcommunity resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpcommunity[] get_filtered(nitro_service service, String filter) throws Exception{
		snmpcommunity obj = new snmpcommunity();
		options option = new options();
		option.set_filter(filter);
		snmpcommunity[] response = (snmpcommunity[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpcommunity resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpcommunity[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpcommunity obj = new snmpcommunity();
		options option = new options();
		option.set_filter(filter);
		snmpcommunity[] response = (snmpcommunity[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpcommunity resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmpcommunity obj = new snmpcommunity();
		options option = new options();
		option.set_count(true);
		snmpcommunity[] response = (snmpcommunity[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpcommunity resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmpcommunity obj = new snmpcommunity();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpcommunity[] response = (snmpcommunity[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpcommunity resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpcommunity obj = new snmpcommunity();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpcommunity[] response = (snmpcommunity[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class permissionsEnum {
		public static final String GET = "GET";
		public static final String GET_NEXT = "GET_NEXT";
		public static final String GET_BULK = "GET_BULK";
		public static final String SET = "SET";
		public static final String ALL = "ALL";
	}
}
