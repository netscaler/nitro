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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnsaaaarec_response extends base_response
{
	public dnsaaaarec[] dnsaaaarec;
}
/**
* Configuration for IPv6 address type record resource.
*/

public class dnsaaaarec extends base_resource
{
	private String hostname;
	private String ipv6address;
	private Long ttl;
	private String type;

	//------- Read only Parameter ---------;

	private String vservername;
	private String authtype;
	private Long __count;

	/**
	* <pre>
	* Domain name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_hostname(String hostname) throws Exception{
		this.hostname = hostname;
	}

	/**
	* <pre>
	* Domain name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_hostname() throws Exception {
		return this.hostname;
	}

	/**
	* <pre>
	* One or more IPv6 addresses to assign to the domain name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipv6address(String ipv6address) throws Exception{
		this.ipv6address = ipv6address;
	}

	/**
	* <pre>
	* One or more IPv6 addresses to assign to the domain name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipv6address() throws Exception {
		return this.ipv6address;
	}

	/**
	* <pre>
	* Time to Live (TTL), in seconds, for the record. TTL is the time for which the record must be cached by DNS proxies. The specified TTL is applied to all the resource records that are of the same record type and belong to the specified domain name. For example, if you add an address record, with a TTL of 36000, to the domain name example.com, the TTLs of all the address records of example.com are changed to 36000. If the TTL is not specified, the NetScaler appliance uses either the DNS zone's minimum TTL or, if the SOA record is not available on the appliance, the default value of 3600.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Time to Live (TTL), in seconds, for the record. TTL is the time for which the record must be cached by DNS proxies. The specified TTL is applied to all the resource records that are of the same record type and belong to the specified domain name. For example, if you add an address record, with a TTL of 36000, to the domain name example.com, the TTLs of all the address records of example.com are changed to 36000. If the TTL is not specified, the NetScaler appliance uses either the DNS zone's minimum TTL or, if the SOA record is not available on the appliance, the default value of 3600.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Time to Live (TTL), in seconds, for the record. TTL is the time for which the record must be cached by DNS proxies. The specified TTL is applied to all the resource records that are of the same record type and belong to the specified domain name. For example, if you add an address record, with a TTL of 36000, to the domain name example.com, the TTLs of all the address records of example.com are changed to 36000. If the TTL is not specified, the NetScaler appliance uses either the DNS zone's minimum TTL or, if the SOA record is not available on the appliance, the default value of 3600.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* Type of records to display. Available settings function as follows:
* ADNS - Display all authoritative address records.
* PROXY - Display all proxy address records.
* ALL - Display all address records.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of records to display. Available settings function as follows:
* ADNS - Display all authoritative address records.
* PROXY - Display all proxy address records.
* ALL - Display all address records.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Vitual server name.
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* Authentication type.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_authtype() throws Exception {
		return this.authtype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnsaaaarec_response result = (dnsaaaarec_response) service.get_payload_formatter().string_to_resource(dnsaaaarec_response.class, response);
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
		return result.dnsaaaarec;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.hostname;
	}

	/**
	* Use this API to add dnsaaaarec.
	*/
	public static base_response add(nitro_service client, dnsaaaarec resource) throws Exception {
		dnsaaaarec addresource = new dnsaaaarec();
		addresource.hostname = resource.hostname;
		addresource.ipv6address = resource.ipv6address;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsaaaarec resources.
	*/
	public static base_responses add(nitro_service client, dnsaaaarec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaaaarec addresources[] = new dnsaaaarec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsaaaarec();
				addresources[i].hostname = resources[i].hostname;
				addresources[i].ipv6address = resources[i].ipv6address;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsaaaarec of given name.
	*/
	public static base_response delete(nitro_service client, String hostname) throws Exception {
		dnsaaaarec deleteresource = new dnsaaaarec();
		deleteresource.hostname = hostname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsaaaarec.
	*/
	public static base_response delete(nitro_service client, dnsaaaarec resource) throws Exception {
		dnsaaaarec deleteresource = new dnsaaaarec();
		deleteresource.hostname = resource.hostname;
		deleteresource.ipv6address = resource.ipv6address;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsaaaarec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String hostname[]) throws Exception {
		base_responses result = null;
		if (hostname != null && hostname.length > 0) {
			dnsaaaarec deleteresources[] = new dnsaaaarec[hostname.length];
			for (int i=0;i<hostname.length;i++){
				deleteresources[i] = new dnsaaaarec();
				deleteresources[i].hostname = hostname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsaaaarec resources.
	*/
	public static base_responses delete(nitro_service client, dnsaaaarec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaaaarec deleteresources[] = new dnsaaaarec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsaaaarec();
				deleteresources[i].hostname = resources[i].hostname;
				deleteresources[i].ipv6address = resources[i].ipv6address;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsaaaarec resources that are configured on netscaler.
	*/
	public static dnsaaaarec[] get(nitro_service service) throws Exception{
		dnsaaaarec obj = new dnsaaaarec();
		dnsaaaarec[] response = (dnsaaaarec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsaaaarec resources that are configured on netscaler.
	*/
	public static dnsaaaarec[] get(nitro_service service, options option) throws Exception{
		dnsaaaarec obj = new dnsaaaarec();
		dnsaaaarec[] response = (dnsaaaarec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a dnsaaaarec resource.
	*/
	public static dnsaaaarec get(nitro_service service, dnsaaaarec obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		dnsaaaarec response = (dnsaaaarec) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a dnsaaaarec resources.
	*/
	public static dnsaaaarec[] get(nitro_service service, dnsaaaarec obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			dnsaaaarec response[] = new dnsaaaarec[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (dnsaaaarec) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the dnsaaaarec resources that are configured on netscaler.
	* This uses dnsaaaarec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnsaaaarec[] get(nitro_service service, dnsaaaarec_args args) throws Exception{
		dnsaaaarec obj = new dnsaaaarec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnsaaaarec[] response = (dnsaaaarec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsaaaarec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsaaaarec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsaaaarec obj = new dnsaaaarec();
		options option = new options();
		option.set_filter(filter);
		dnsaaaarec[] response = (dnsaaaarec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsaaaarec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsaaaarec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsaaaarec obj = new dnsaaaarec();
		options option = new options();
		option.set_filter(filter);
		dnsaaaarec[] response = (dnsaaaarec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsaaaarec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsaaaarec obj = new dnsaaaarec();
		options option = new options();
		option.set_count(true);
		dnsaaaarec[] response = (dnsaaaarec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsaaaarec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsaaaarec obj = new dnsaaaarec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsaaaarec[] response = (dnsaaaarec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsaaaarec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsaaaarec obj = new dnsaaaarec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsaaaarec[] response = (dnsaaaarec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class authtypeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
	public static class typeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
}
