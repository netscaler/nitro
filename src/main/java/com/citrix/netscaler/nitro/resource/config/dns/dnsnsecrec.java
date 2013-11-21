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

class dnsnsecrec_response extends base_response
{
	public dnsnsecrec[] dnsnsecrec;
}

public class dnsnsecrec extends base_resource
{
	private String hostname;
	private String type;

	//------- Read only Parameter ---------;

	private String nextnsec;
	private String[] nextrecs;
	private Long __count;

	/**
	* <pre>
	* Name of the domain.<br> Minimum length =  1
	* </pre>
	*/
	public void set_hostname(String hostname) throws Exception{
		this.hostname = hostname;
	}

	/**
	* <pre>
	* Name of the domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_hostname() throws Exception {
		return this.hostname;
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
	* Next nsec record in the chain.
	* </pre>
	*/
	public String get_nextnsec() throws Exception {
		return this.nextnsec;
	}

	/**
	* <pre>
	* An array of record types associated with the nsec record.<br> Possible values = A, NS, CNAME, SOA, MX, AAAA, SRV, RRSIG, NSEC, DNSKEY, PTR, TXT
	* </pre>
	*/
	public String[] get_nextrecs() throws Exception {
		return this.nextrecs;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnsnsecrec_response result = (dnsnsecrec_response) service.get_payload_formatter().string_to_resource(dnsnsecrec_response.class, response);
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
		return result.dnsnsecrec;
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
	* Use this API to fetch all the dnsnsecrec resources that are configured on netscaler.
	*/
	public static dnsnsecrec[] get(nitro_service service) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		dnsnsecrec[] response = (dnsnsecrec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsnsecrec resources that are configured on netscaler.
	*/
	public static dnsnsecrec[] get(nitro_service service, options option) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		dnsnsecrec[] response = (dnsnsecrec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnsnsecrec resources that are configured on netscaler.
	* This uses dnsnsecrec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnsnsecrec[] get(nitro_service service, dnsnsecrec_args args) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnsnsecrec[] response = (dnsnsecrec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnsnsecrec resource of given name .
	*/
	public static dnsnsecrec get(nitro_service service, String hostname) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		obj.set_hostname(hostname);
		dnsnsecrec response = (dnsnsecrec) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsnsecrec resources of given names .
	*/
	public static dnsnsecrec[] get(nitro_service service, String hostname[]) throws Exception{
		if (hostname !=null && hostname.length>0) {
			dnsnsecrec response[] = new dnsnsecrec[hostname.length];
			dnsnsecrec obj[] = new dnsnsecrec[hostname.length];
			for (int i=0;i<hostname.length;i++) {
				obj[i] = new dnsnsecrec();
				obj[i].set_hostname(hostname[i]);
				response[i] = (dnsnsecrec) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsnsecrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsnsecrec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		options option = new options();
		option.set_filter(filter);
		dnsnsecrec[] response = (dnsnsecrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsnsecrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsnsecrec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		options option = new options();
		option.set_filter(filter);
		dnsnsecrec[] response = (dnsnsecrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsnsecrec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		options option = new options();
		option.set_count(true);
		dnsnsecrec[] response = (dnsnsecrec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsnsecrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsnsecrec[] response = (dnsnsecrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsnsecrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsnsecrec obj = new dnsnsecrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsnsecrec[] response = (dnsnsecrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
	public static class nextrecsEnum {
		public static final String A = "A";
		public static final String NS = "NS";
		public static final String CNAME = "CNAME";
		public static final String SOA = "SOA";
		public static final String MX = "MX";
		public static final String AAAA = "AAAA";
		public static final String SRV = "SRV";
		public static final String RRSIG = "RRSIG";
		public static final String NSEC = "NSEC";
		public static final String DNSKEY = "DNSKEY";
		public static final String PTR = "PTR";
		public static final String TXT = "TXT";
	}
}
