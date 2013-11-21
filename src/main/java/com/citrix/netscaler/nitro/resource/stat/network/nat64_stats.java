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

package com.citrix.netscaler.nitro.resource.stat.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nat64_response extends base_response
{
	public nat64_stats nat64;
}
/**
* Statistics for nat64 config resource.
*/

public class nat64_stats extends base_resource
{
	private String clearstats;
	private Long nat64tottcpsessions;
	private Long nat64tcpsessionsrate;
	private Long nat64totudpsessions;
	private Long nat64udpsessionsrate;
	private Long nat64toticmpsessions;
	private Long nat64icmpsessionsrate;
	private Long nat64totsessions;
	private Long nat64sessionsrate;

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
	* Rate (/s) counter for nat64toticmpsessions
	* </pre>
	*/
	public Long get_nat64icmpsessionsrate() throws Exception {
		return this.nat64icmpsessionsrate;
	}

	/**
	* <pre>
	* Total number of ICMP sessions created by NAT64.
	* </pre>
	*/
	public Long get_nat64toticmpsessions() throws Exception {
		return this.nat64toticmpsessions;
	}

	/**
	* <pre>
	* Rate (/s) counter for nat64totsessions
	* </pre>
	*/
	public Long get_nat64sessionsrate() throws Exception {
		return this.nat64sessionsrate;
	}

	/**
	* <pre>
	* Total number of UDP sessions created by NAT64.
	* </pre>
	*/
	public Long get_nat64totudpsessions() throws Exception {
		return this.nat64totudpsessions;
	}

	/**
	* <pre>
	* Rate (/s) counter for nat64totudpsessions
	* </pre>
	*/
	public Long get_nat64udpsessionsrate() throws Exception {
		return this.nat64udpsessionsrate;
	}

	/**
	* <pre>
	* Total number of TCP sessions created by NAT64.
	* </pre>
	*/
	public Long get_nat64tottcpsessions() throws Exception {
		return this.nat64tottcpsessions;
	}

	/**
	* <pre>
	* Total number of sessions created by NAT64.
	* </pre>
	*/
	public Long get_nat64totsessions() throws Exception {
		return this.nat64totsessions;
	}

	/**
	* <pre>
	* Rate (/s) counter for nat64tottcpsessions
	* </pre>
	*/
	public Long get_nat64tcpsessionsrate() throws Exception {
		return this.nat64tcpsessionsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nat64_stats[] resources = new nat64_stats[1];
		nat64_response result = (nat64_response) service.get_payload_formatter().string_to_resource(nat64_response.class, response);
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
		resources[0] = result.nat64;
		return resources;
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
	* Use this API to fetch the statistics of all nat64_stats resources that are configured on netscaler.
	*/
	public static nat64_stats get(nitro_service service) throws Exception{
		nat64_stats obj = new nat64_stats();
		nat64_stats[] response = (nat64_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all nat64_stats resources that are configured on netscaler.
	*/
	public static nat64_stats get(nitro_service service,  options option) throws Exception{
		nat64_stats obj = new nat64_stats();
		nat64_stats[] response = (nat64_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
