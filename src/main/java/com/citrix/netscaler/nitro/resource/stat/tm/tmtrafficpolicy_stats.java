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

package com.citrix.netscaler.nitro.resource.stat.tm;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tmtrafficpolicy_response extends base_response
{
	public tmtrafficpolicy_stats[] tmtrafficpolicy;
}
/**
* Statistics for TM traffic policy resource.
*/

public class tmtrafficpolicy_stats extends base_resource
{
	private String name;
	private String clearstats;
	private Long pipolicyhits;
	private Long pipolicyhitsrate;

	/**
	* <pre>
	* The name of the TM traffic policy for which statistics will be displayed.  If not given statistics are shown for all policies.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the TM traffic policy for which statistics will be displayed.  If not given statistics are shown for all policies.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
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
	* Rate (/s) counter for pipolicyhits
	* </pre>
	*/
	public Long get_pipolicyhitsrate() throws Exception {
		return this.pipolicyhitsrate;
	}

	/**
	* <pre>
	* Number of hits on the policy
	* </pre>
	*/
	public Long get_pipolicyhits() throws Exception {
		return this.pipolicyhits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmtrafficpolicy_response result = (tmtrafficpolicy_response) service.get_payload_formatter().string_to_resource(tmtrafficpolicy_response.class, response);
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
		return result.tmtrafficpolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch the statistics of all tmtrafficpolicy_stats resources that are configured on netscaler.
	*/
	public static tmtrafficpolicy_stats[] get(nitro_service service) throws Exception{
		tmtrafficpolicy_stats obj = new tmtrafficpolicy_stats();
		tmtrafficpolicy_stats[] response = (tmtrafficpolicy_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all tmtrafficpolicy_stats resources that are configured on netscaler.
	*/
	public static tmtrafficpolicy_stats[] get(nitro_service service, options option) throws Exception{
		tmtrafficpolicy_stats obj = new tmtrafficpolicy_stats();
		tmtrafficpolicy_stats[] response = (tmtrafficpolicy_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of tmtrafficpolicy_stats resource of given name .
	*/
	public static tmtrafficpolicy_stats get(nitro_service service, String name) throws Exception{
		tmtrafficpolicy_stats obj = new tmtrafficpolicy_stats();
		obj.set_name(name);
		tmtrafficpolicy_stats response = (tmtrafficpolicy_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
