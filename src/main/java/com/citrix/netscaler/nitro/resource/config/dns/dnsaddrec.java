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

class dnsaddrec_response extends base_response
{
	public dnsaddrec[] dnsaddrec;
}
/**
* Configuration for address type record resource.
*/

public class dnsaddrec extends base_resource
{
	private String hostname;
	private String ipaddress;
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
	* One or more IPv4 addresses to assign to the domain name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* One or more IPv4 addresses to assign to the domain name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
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
	* The address record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative address records will be displayed.
PROXY - If this is specified, all of the proxy address records will be displayed.
ALL  -  If this is specified, all of the address records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The address record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative address records will be displayed.
PROXY - If this is specified, all of the proxy address records will be displayed.
ALL  -  If this is specified, all of the address records will be displayed.<br> Possible values = ALL, ADNS, PROXY
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
		dnsaddrec_response result = (dnsaddrec_response) service.get_payload_formatter().string_to_resource(dnsaddrec_response.class, response);
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
		return result.dnsaddrec;
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
	* Use this API to add dnsaddrec.
	*/
	public static base_response add(nitro_service client, dnsaddrec resource) throws Exception {
		dnsaddrec addresource = new dnsaddrec();
		addresource.hostname = resource.hostname;
		addresource.ipaddress = resource.ipaddress;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsaddrec resources.
	*/
	public static base_responses add(nitro_service client, dnsaddrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaddrec addresources[] = new dnsaddrec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsaddrec();
				addresources[i].hostname = resources[i].hostname;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsaddrec of given name.
	*/
	public static base_response delete(nitro_service client, String hostname) throws Exception {
		dnsaddrec deleteresource = new dnsaddrec();
		deleteresource.hostname = hostname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsaddrec.
	*/
	public static base_response delete(nitro_service client, dnsaddrec resource) throws Exception {
		dnsaddrec deleteresource = new dnsaddrec();
		deleteresource.hostname = resource.hostname;
		deleteresource.ipaddress = resource.ipaddress;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsaddrec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String hostname[]) throws Exception {
		base_responses result = null;
		if (hostname != null && hostname.length > 0) {
			dnsaddrec deleteresources[] = new dnsaddrec[hostname.length];
			for (int i=0;i<hostname.length;i++){
				deleteresources[i] = new dnsaddrec();
				deleteresources[i].hostname = hostname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsaddrec resources.
	*/
	public static base_responses delete(nitro_service client, dnsaddrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaddrec deleteresources[] = new dnsaddrec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsaddrec();
				deleteresources[i].hostname = resources[i].hostname;
				deleteresources[i].ipaddress = resources[i].ipaddress;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsaddrec resources that are configured on netscaler.
	*/
	public static dnsaddrec[] get(nitro_service service) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		dnsaddrec[] response = (dnsaddrec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsaddrec resources that are configured on netscaler.
	*/
	public static dnsaddrec[] get(nitro_service service, options option) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		dnsaddrec[] response = (dnsaddrec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnsaddrec resources that are configured on netscaler.
	* This uses dnsaddrec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnsaddrec[] get(nitro_service service, dnsaddrec_args args) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnsaddrec[] response = (dnsaddrec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnsaddrec resource of given name .
	*/
	public static dnsaddrec get(nitro_service service, String hostname) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		obj.set_hostname(hostname);
		dnsaddrec response = (dnsaddrec) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsaddrec resources of given names .
	*/
	public static dnsaddrec[] get(nitro_service service, String hostname[]) throws Exception{
		if (hostname !=null && hostname.length>0) {
			dnsaddrec response[] = new dnsaddrec[hostname.length];
			dnsaddrec obj[] = new dnsaddrec[hostname.length];
			for (int i=0;i<hostname.length;i++) {
				obj[i] = new dnsaddrec();
				obj[i].set_hostname(hostname[i]);
				response[i] = (dnsaddrec) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsaddrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsaddrec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		options option = new options();
		option.set_filter(filter);
		dnsaddrec[] response = (dnsaddrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsaddrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsaddrec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		options option = new options();
		option.set_filter(filter);
		dnsaddrec[] response = (dnsaddrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsaddrec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		options option = new options();
		option.set_count(true);
		dnsaddrec[] response = (dnsaddrec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsaddrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsaddrec[] response = (dnsaddrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsaddrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsaddrec obj = new dnsaddrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsaddrec[] response = (dnsaddrec[]) obj.getfiltered(service, option);
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
