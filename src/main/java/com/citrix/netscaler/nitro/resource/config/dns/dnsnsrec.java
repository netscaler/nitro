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

class dnsnsrec_response extends base_response
{
	public dnsnsrec[] dnsnsrec;
}
/**
* Configuration for name server record resource.
*/

public class dnsnsrec extends base_resource
{
	private String domain;
	private String nameserver;
	private Long ttl;
	private String type;

	//------- Read only Parameter ---------;

	private String authtype;
	private Long __count;

	/**
	* <pre>
	* The domain name for which a name server record is added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* The domain name for which a name server record is added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* The nameserver for the domain.<br> Minimum length =  1
	* </pre>
	*/
	public void set_nameserver(String nameserver) throws Exception{
		this.nameserver = nameserver;
	}

	/**
	* <pre>
	* The nameserver for the domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_nameserver() throws Exception {
		return this.nameserver;
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* The name server record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative name server records will be displayed.
PROXY - If this is specified, all of the proxy name server records will be displayed.
ALL  -  If this is specified, all of the name server records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The name server record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative name server records will be displayed.
PROXY - If this is specified, all of the proxy name server records will be displayed.
ALL  -  If this is specified, all of the name server records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Record type.<br> Possible values = ALL, ADNS, PROXY
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
		dnsnsrec_response result = (dnsnsrec_response) service.get_payload_formatter().string_to_resource(dnsnsrec_response.class, response);
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
		return result.dnsnsrec;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.domain;
	}

	/**
	* Use this API to add dnsnsrec.
	*/
	public static base_response add(nitro_service client, dnsnsrec resource) throws Exception {
		dnsnsrec addresource = new dnsnsrec();
		addresource.domain = resource.domain;
		addresource.nameserver = resource.nameserver;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsnsrec resources.
	*/
	public static base_responses add(nitro_service client, dnsnsrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsnsrec addresources[] = new dnsnsrec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsnsrec();
				addresources[i].domain = resources[i].domain;
				addresources[i].nameserver = resources[i].nameserver;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsnsrec of given name.
	*/
	public static base_response delete(nitro_service client, String domain) throws Exception {
		dnsnsrec deleteresource = new dnsnsrec();
		deleteresource.domain = domain;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsnsrec.
	*/
	public static base_response delete(nitro_service client, dnsnsrec resource) throws Exception {
		dnsnsrec deleteresource = new dnsnsrec();
		deleteresource.domain = resource.domain;
		deleteresource.nameserver = resource.nameserver;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsnsrec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String domain[]) throws Exception {
		base_responses result = null;
		if (domain != null && domain.length > 0) {
			dnsnsrec deleteresources[] = new dnsnsrec[domain.length];
			for (int i=0;i<domain.length;i++){
				deleteresources[i] = new dnsnsrec();
				deleteresources[i].domain = domain[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsnsrec resources.
	*/
	public static base_responses delete(nitro_service client, dnsnsrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsnsrec deleteresources[] = new dnsnsrec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsnsrec();
				deleteresources[i].domain = resources[i].domain;
				deleteresources[i].nameserver = resources[i].nameserver;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsnsrec resources that are configured on netscaler.
	*/
	public static dnsnsrec[] get(nitro_service service) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		dnsnsrec[] response = (dnsnsrec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsnsrec resources that are configured on netscaler.
	*/
	public static dnsnsrec[] get(nitro_service service, options option) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		dnsnsrec[] response = (dnsnsrec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnsnsrec resources that are configured on netscaler.
	* This uses dnsnsrec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnsnsrec[] get(nitro_service service, dnsnsrec_args args) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnsnsrec[] response = (dnsnsrec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnsnsrec resource of given name .
	*/
	public static dnsnsrec get(nitro_service service, String domain) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		obj.set_domain(domain);
		dnsnsrec response = (dnsnsrec) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsnsrec resources of given names .
	*/
	public static dnsnsrec[] get(nitro_service service, String domain[]) throws Exception{
		if (domain !=null && domain.length>0) {
			dnsnsrec response[] = new dnsnsrec[domain.length];
			dnsnsrec obj[] = new dnsnsrec[domain.length];
			for (int i=0;i<domain.length;i++) {
				obj[i] = new dnsnsrec();
				obj[i].set_domain(domain[i]);
				response[i] = (dnsnsrec) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsnsrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsnsrec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		options option = new options();
		option.set_filter(filter);
		dnsnsrec[] response = (dnsnsrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsnsrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsnsrec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		options option = new options();
		option.set_filter(filter);
		dnsnsrec[] response = (dnsnsrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsnsrec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		options option = new options();
		option.set_count(true);
		dnsnsrec[] response = (dnsnsrec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsnsrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsnsrec[] response = (dnsnsrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsnsrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsnsrec obj = new dnsnsrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsnsrec[] response = (dnsnsrec[]) obj.getfiltered(service, option);
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
