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

package com.citrix.netscaler.nitro.resource.stat.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnsrecords_response extends base_response
{
	public dnsrecords_stats[] dnsrecords;
}

public class dnsrecords_stats extends base_resource
{
	private String dnsrecordtype;
	private String clearstats;
	private Long dnstotentries;
	private Long dnstotupdates;
	private Long dnstotresponses;
	private Long dnstotrequests;
	private Long dnscurentries;
	private Long dnstoterrlimits;
	private Long dnstoterrrespform;
	private Long dnstoterraliasex;
	private Long dnstoterrnodomains;
	private Long dnscurrecords;

	/**
	* <pre>
	* Display statistics for the specified DNS record or query type or, if a record or query type is not specified, statistics for all record types supported on the NetScaler appliance.
	* </pre>
	*/
	public void set_dnsrecordtype(String dnsrecordtype) throws Exception{
		this.dnsrecordtype = dnsrecordtype;
	}

	/**
	* <pre>
	* Display statistics for the specified DNS record or query type or, if a record or query type is not specified, statistics for all record types supported on the NetScaler appliance.
	* </pre>
	*/
	public String get_dnsrecordtype() throws Exception {
		return this.dnsrecordtype;
	}

	/**
	* <pre>
	* Clear the statsistics / counters
	* </pre>
	*/
	public void set_clearstats(String clearstats) throws Exception{
		this.clearstats = clearstats;
	}

	/**
	* <pre>
	* Clear the statsistics / counters.<br> Possible values = basic, full
	* </pre>
	*/
	public String get_clearstats() throws Exception {
		return this.clearstats;
	}

	/**
	* <pre>
	* Current number of DNS entries
	* </pre>
	*/
	public Long get_dnscurentries() throws Exception {
		return this.dnscurentries;
	}

	/**
	* <pre>
	* Total number of DNS proactive updates
	* </pre>
	*/
	public Long get_dnstotupdates() throws Exception {
		return this.dnstotupdates;
	}

	/**
	* <pre>
	* Total number of DNS queries recieved
	* </pre>
	*/
	public Long get_dnstotrequests() throws Exception {
		return this.dnstotrequests;
	}

	/**
	* <pre>
	* Total number of times we have recieved non-cname record for a domain for which an alias exists
	* </pre>
	*/
	public Long get_dnstoterraliasex() throws Exception {
		return this.dnstoterraliasex;
	}

	/**
	* <pre>
	* Total number of times we have recieved malformed responses from the backend
	* </pre>
	*/
	public Long get_dnstoterrrespform() throws Exception {
		return this.dnstoterrrespform;
	}

	/**
	* <pre>
	* Total number of DNS record entries
	* </pre>
	*/
	public Long get_dnstotentries() throws Exception {
		return this.dnstotentries;
	}

	/**
	* <pre>
	* Current number of DNS Records
	* </pre>
	*/
	public Long get_dnscurrecords() throws Exception {
		return this.dnscurrecords;
	}

	/**
	* <pre>
	* Total number of cache misses
	* </pre>
	*/
	public Long get_dnstoterrnodomains() throws Exception {
		return this.dnstoterrnodomains;
	}

	/**
	* <pre>
	* Total number of times we have recieved dns record with more entries than we support
	* </pre>
	*/
	public Long get_dnstoterrlimits() throws Exception {
		return this.dnstoterrlimits;
	}

	/**
	* <pre>
	* Total number of DNS server responses
	* </pre>
	*/
	public Long get_dnstotresponses() throws Exception {
		return this.dnstotresponses;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnsrecords_response result = (dnsrecords_response) service.get_payload_formatter().string_to_resource(dnsrecords_response.class, response);
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
		return result.dnsrecords;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.dnsrecordtype;
	}

	/**
	* Use this API to fetch the statistics of all dnsrecords_stats resources that are configured on netscaler.
	*/
	public static dnsrecords_stats[] get(nitro_service service) throws Exception{
		dnsrecords_stats obj = new dnsrecords_stats();
		dnsrecords_stats[] response = (dnsrecords_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all dnsrecords_stats resources that are configured on netscaler.
	*/
	public static dnsrecords_stats[] get(nitro_service service, options option) throws Exception{
		dnsrecords_stats obj = new dnsrecords_stats();
		dnsrecords_stats[] response = (dnsrecords_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of dnsrecords_stats resource of given name .
	*/
	public static dnsrecords_stats get(nitro_service service, String dnsrecordtype) throws Exception{
		dnsrecords_stats obj = new dnsrecords_stats();
		obj.set_dnsrecordtype(dnsrecordtype);
		dnsrecords_stats response = (dnsrecords_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
