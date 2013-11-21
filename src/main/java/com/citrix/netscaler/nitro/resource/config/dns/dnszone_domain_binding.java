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

class dnszone_domain_binding_response extends base_response
{
	public dnszone_domain_binding[] dnszone_domain_binding;
}
/**
	* Binding class showing the domain that can be bound to dnszone.
	*/

public class dnszone_domain_binding extends base_resource
{
	private String domain;
	private String[] nextrecs;
	private String zonename;
	private Long __count;

	/**
	* <pre>
	* Name of the zone. Mutually exclusive with the type parameter.<br> Minimum length =  1
	* </pre>
	*/
	public void set_zonename(String zonename) throws Exception{
		this.zonename = zonename;
	}

	/**
	* <pre>
	* Name of the zone. Mutually exclusive with the type parameter.<br> Minimum length =  1
	* </pre>
	*/
	public String get_zonename() throws Exception {
		return this.zonename;
	}

	/**
	* <pre>
	* Domain name that belongs to the given zone.
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* Domain name that belongs to the given zone.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
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
		dnszone_domain_binding_response result = (dnszone_domain_binding_response) service.get_payload_formatter().string_to_resource(dnszone_domain_binding_response.class, response);
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
		return result.dnszone_domain_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.zonename;
	}

	/**
	* Use this API to fetch dnszone_domain_binding resources of given name .
	*/
	public static dnszone_domain_binding[] get(nitro_service service, String zonename) throws Exception{
		dnszone_domain_binding obj = new dnszone_domain_binding();
		obj.set_zonename(zonename);
		dnszone_domain_binding response[] = (dnszone_domain_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnszone_domain_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnszone_domain_binding[] get_filtered(nitro_service service, String zonename, String filter) throws Exception{
		dnszone_domain_binding obj = new dnszone_domain_binding();
		obj.set_zonename(zonename);
		options option = new options();
		option.set_filter(filter);
		dnszone_domain_binding[] response = (dnszone_domain_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnszone_domain_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnszone_domain_binding[] get_filtered(nitro_service service, String zonename, filtervalue[] filter) throws Exception{
		dnszone_domain_binding obj = new dnszone_domain_binding();
		obj.set_zonename(zonename);
		options option = new options();
		option.set_filter(filter);
		dnszone_domain_binding[] response = (dnszone_domain_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count dnszone_domain_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String zonename) throws Exception{
		dnszone_domain_binding obj = new dnszone_domain_binding();
		obj.set_zonename(zonename);
		options option = new options();
		option.set_count(true);
		dnszone_domain_binding response[] = (dnszone_domain_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnszone_domain_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String zonename, String filter) throws Exception{
		dnszone_domain_binding obj = new dnszone_domain_binding();
		obj.set_zonename(zonename);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnszone_domain_binding[] response = (dnszone_domain_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnszone_domain_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String zonename, filtervalue[] filter) throws Exception{
		dnszone_domain_binding obj = new dnszone_domain_binding();
		obj.set_zonename(zonename);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnszone_domain_binding[] response = (dnszone_domain_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
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