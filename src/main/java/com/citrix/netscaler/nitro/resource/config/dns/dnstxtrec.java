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

class dnstxtrec_response extends base_response
{
	public dnstxtrec[] dnstxtrec;
}
/**
* Configuration for TXT record resource.
*/

public class dnstxtrec extends base_resource
{
	private String domain;
	private String[] String;
	private Long ttl;
	private Long recordid;
	private String type;

	//------- Read only Parameter ---------;

	private String authtype;
	private Long __count;

	/**
	* <pre>
	* The owner domain name of the TXT record.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* The owner domain name of the TXT record.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* The text of the txt record. Maximum of 6 strings are allowed.<br> Maximum length =  255
	* </pre>
	*/
	public void set_String(String[] String) throws Exception{
		this.String = String;
	}

	/**
	* <pre>
	* The text of the txt record. Maximum of 6 strings are allowed.<br> Maximum length =  255
	* </pre>
	*/
	public String[] get_String() throws Exception {
		return this.String;
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
	* The record identifier of the record to be removed.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_recordid(long recordid) throws Exception {
		this.recordid = new Long(recordid);
	}

	/**
	* <pre>
	* The record identifier of the record to be removed.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_recordid(Long recordid) throws Exception{
		this.recordid = recordid;
	}

	/**
	* <pre>
	* The record identifier of the record to be removed.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_recordid() throws Exception {
		return this.recordid;
	}

	/**
	* <pre>
	* The TXT record type. The type can take 3 values:
	ADNS -  If this is specified, all of the authoritative TXT records will be displayed.
	PROXY - If this is specified, all of the proxy TXT records will be displayed.
	ALL  -  If this is specified, all of the TXT records will be displayed.<br> Default value: NSDNS_AUTH_HOST<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The TXT record type. The type can take 3 values:
	ADNS -  If this is specified, all of the authoritative TXT records will be displayed.
	PROXY - If this is specified, all of the proxy TXT records will be displayed.
	ALL  -  If this is specified, all of the TXT records will be displayed.<br> Default value: NSDNS_AUTH_HOST<br> Possible values = ALL, ADNS, PROXY
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
		dnstxtrec_response result = (dnstxtrec_response) service.get_payload_formatter().string_to_resource(dnstxtrec_response.class, response);
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
		return result.dnstxtrec;
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
	* Use this API to add dnstxtrec.
	*/
	public static base_response add(nitro_service client, dnstxtrec resource) throws Exception {
		dnstxtrec addresource = new dnstxtrec();
		addresource.domain = resource.domain;
		addresource.String = resource.String;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnstxtrec resources.
	*/
	public static base_responses add(nitro_service client, dnstxtrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnstxtrec addresources[] = new dnstxtrec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnstxtrec();
				addresources[i].domain = resources[i].domain;
				addresources[i].String = resources[i].String;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnstxtrec of given name.
	*/
	public static base_response delete(nitro_service client, String domain) throws Exception {
		dnstxtrec deleteresource = new dnstxtrec();
		deleteresource.domain = domain;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnstxtrec.
	*/
	public static base_response delete(nitro_service client, dnstxtrec resource) throws Exception {
		dnstxtrec deleteresource = new dnstxtrec();
		deleteresource.domain = resource.domain;
		deleteresource.String = resource.String;
		deleteresource.recordid = resource.recordid;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnstxtrec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String domain[]) throws Exception {
		base_responses result = null;
		if (domain != null && domain.length > 0) {
			dnstxtrec deleteresources[] = new dnstxtrec[domain.length];
			for (int i=0;i<domain.length;i++){
				deleteresources[i] = new dnstxtrec();
				deleteresources[i].domain = domain[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnstxtrec resources.
	*/
	public static base_responses delete(nitro_service client, dnstxtrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnstxtrec deleteresources[] = new dnstxtrec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnstxtrec();
				deleteresources[i].domain = resources[i].domain;
				deleteresources[i].String = resources[i].String;
				deleteresources[i].recordid = resources[i].recordid;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnstxtrec resources that are configured on netscaler.
	*/
	public static dnstxtrec[] get(nitro_service service) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		dnstxtrec[] response = (dnstxtrec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnstxtrec resources that are configured on netscaler.
	*/
	public static dnstxtrec[] get(nitro_service service, options option) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		dnstxtrec[] response = (dnstxtrec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnstxtrec resources that are configured on netscaler.
	* This uses dnstxtrec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnstxtrec[] get(nitro_service service, dnstxtrec_args args) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnstxtrec[] response = (dnstxtrec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnstxtrec resource of given name .
	*/
	public static dnstxtrec get(nitro_service service, String domain) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		obj.set_domain(domain);
		dnstxtrec response = (dnstxtrec) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnstxtrec resources of given names .
	*/
	public static dnstxtrec[] get(nitro_service service, String domain[]) throws Exception{
		if (domain !=null && domain.length>0) {
			dnstxtrec response[] = new dnstxtrec[domain.length];
			dnstxtrec obj[] = new dnstxtrec[domain.length];
			for (int i=0;i<domain.length;i++) {
				obj[i] = new dnstxtrec();
				obj[i].set_domain(domain[i]);
				response[i] = (dnstxtrec) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnstxtrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnstxtrec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		options option = new options();
		option.set_filter(filter);
		dnstxtrec[] response = (dnstxtrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnstxtrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnstxtrec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		options option = new options();
		option.set_filter(filter);
		dnstxtrec[] response = (dnstxtrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnstxtrec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		options option = new options();
		option.set_count(true);
		dnstxtrec[] response = (dnstxtrec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnstxtrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnstxtrec[] response = (dnstxtrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnstxtrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnstxtrec obj = new dnstxtrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnstxtrec[] response = (dnstxtrec[]) obj.getfiltered(service, option);
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
