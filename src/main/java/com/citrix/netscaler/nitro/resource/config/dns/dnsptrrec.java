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

class dnsptrrec_response extends base_response
{
	public dnsptrrec[] dnsptrrec;
}
/**
* Configuration for PTR record resource.
*/

public class dnsptrrec extends base_resource
{
	private String reversedomain;
	private String domain;
	private Long ttl;
	private String type;

	//------- Read only Parameter ---------;

	private String authtype;
	private Long __count;

	/**
	* <pre>
	* Reversed domain name representation of the IPv4 or IPv6 address for which to create the PTR record. Use the "in-addr.arpa." suffix for IPv4 addresses and the "ip6.arpa." suffix for IPv6 addresses.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reversedomain(String reversedomain) throws Exception{
		this.reversedomain = reversedomain;
	}

	/**
	* <pre>
	* Reversed domain name representation of the IPv4 or IPv6 address for which to create the PTR record. Use the "in-addr.arpa." suffix for IPv4 addresses and the "ip6.arpa." suffix for IPv6 addresses.<br> Minimum length =  1
	* </pre>
	*/
	public String get_reversedomain() throws Exception {
		return this.reversedomain;
	}

	/**
	* <pre>
	* Domain name for which to configure reverse mapping.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* Domain name for which to configure reverse mapping.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
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
		dnsptrrec_response result = (dnsptrrec_response) service.get_payload_formatter().string_to_resource(dnsptrrec_response.class, response);
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
		return result.dnsptrrec;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.reversedomain;
	}

	/**
	* Use this API to add dnsptrrec.
	*/
	public static base_response add(nitro_service client, dnsptrrec resource) throws Exception {
		dnsptrrec addresource = new dnsptrrec();
		addresource.reversedomain = resource.reversedomain;
		addresource.domain = resource.domain;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsptrrec resources.
	*/
	public static base_responses add(nitro_service client, dnsptrrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsptrrec addresources[] = new dnsptrrec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsptrrec();
				addresources[i].reversedomain = resources[i].reversedomain;
				addresources[i].domain = resources[i].domain;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsptrrec of given name.
	*/
	public static base_response delete(nitro_service client, String reversedomain) throws Exception {
		dnsptrrec deleteresource = new dnsptrrec();
		deleteresource.reversedomain = reversedomain;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsptrrec.
	*/
	public static base_response delete(nitro_service client, dnsptrrec resource) throws Exception {
		dnsptrrec deleteresource = new dnsptrrec();
		deleteresource.reversedomain = resource.reversedomain;
		deleteresource.domain = resource.domain;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsptrrec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String reversedomain[]) throws Exception {
		base_responses result = null;
		if (reversedomain != null && reversedomain.length > 0) {
			dnsptrrec deleteresources[] = new dnsptrrec[reversedomain.length];
			for (int i=0;i<reversedomain.length;i++){
				deleteresources[i] = new dnsptrrec();
				deleteresources[i].reversedomain = reversedomain[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsptrrec resources.
	*/
	public static base_responses delete(nitro_service client, dnsptrrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsptrrec deleteresources[] = new dnsptrrec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsptrrec();
				deleteresources[i].reversedomain = resources[i].reversedomain;
				deleteresources[i].domain = resources[i].domain;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsptrrec resources that are configured on netscaler.
	*/
	public static dnsptrrec[] get(nitro_service service) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		dnsptrrec[] response = (dnsptrrec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsptrrec resources that are configured on netscaler.
	*/
	public static dnsptrrec[] get(nitro_service service, options option) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		dnsptrrec[] response = (dnsptrrec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnsptrrec resources that are configured on netscaler.
	* This uses dnsptrrec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnsptrrec[] get(nitro_service service, dnsptrrec_args args) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnsptrrec[] response = (dnsptrrec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnsptrrec resource of given name .
	*/
	public static dnsptrrec get(nitro_service service, String reversedomain) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		obj.set_reversedomain(reversedomain);
		dnsptrrec response = (dnsptrrec) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsptrrec resources of given names .
	*/
	public static dnsptrrec[] get(nitro_service service, String reversedomain[]) throws Exception{
		if (reversedomain !=null && reversedomain.length>0) {
			dnsptrrec response[] = new dnsptrrec[reversedomain.length];
			dnsptrrec obj[] = new dnsptrrec[reversedomain.length];
			for (int i=0;i<reversedomain.length;i++) {
				obj[i] = new dnsptrrec();
				obj[i].set_reversedomain(reversedomain[i]);
				response[i] = (dnsptrrec) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsptrrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsptrrec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		options option = new options();
		option.set_filter(filter);
		dnsptrrec[] response = (dnsptrrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsptrrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsptrrec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		options option = new options();
		option.set_filter(filter);
		dnsptrrec[] response = (dnsptrrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsptrrec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		options option = new options();
		option.set_count(true);
		dnsptrrec[] response = (dnsptrrec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsptrrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsptrrec[] response = (dnsptrrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsptrrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsptrrec obj = new dnsptrrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsptrrec[] response = (dnsptrrec[]) obj.getfiltered(service, option);
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
