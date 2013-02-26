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

package com.citrix.netscaler.nitro.resource.stat.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbdomain_response extends base_response
{
	public gslbdomain_stats[] gslbdomain;
}
/**
* Statistics for GSLB domain resource.
*/

public class gslbdomain_stats extends base_resource
{
	private String name;
	private Long dnstotalqueries;
	private Long dnsqueriesrate;

	/**
	* <pre>
	* The name of the gslb domain for which statistics will be displayed.  If not given statistics are shown for all gslb domain.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the gslb domain for which statistics will be displayed.  If not given statistics are shown for all gslb domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Total number of DNS queries received.
	* </pre>
	*/
	public Long get_dnsqueriesrate() throws Exception {
		return this.dnsqueriesrate;
	}

	/**
	* <pre>
	* Total number of DNS queries received.
	* </pre>
	*/
	public Long get_dnstotalqueries() throws Exception {
		return this.dnstotalqueries;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbdomain_response result = (gslbdomain_response) service.get_payload_formatter().string_to_resource(gslbdomain_response.class, response);
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
		return result.gslbdomain;
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
	* Use this API to fetch the statistics of all gslbdomain_stats resources that are configured on netscaler.
	*/
	public static gslbdomain_stats[] get(nitro_service service) throws Exception{
		gslbdomain_stats obj = new gslbdomain_stats();
		gslbdomain_stats[] response = (gslbdomain_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all gslbdomain_stats resources that are configured on netscaler.
	*/
	public static gslbdomain_stats[] get(nitro_service service, options option) throws Exception{
		gslbdomain_stats obj = new gslbdomain_stats();
		gslbdomain_stats[] response = (gslbdomain_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of gslbdomain_stats resource of given name .
	*/
	public static gslbdomain_stats get(nitro_service service, String name) throws Exception{
		gslbdomain_stats obj = new gslbdomain_stats();
		obj.set_name(name);
		gslbdomain_stats response = (gslbdomain_stats) obj.stat_resource(service);
		return response;
	}

}
