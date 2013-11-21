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

package com.citrix.netscaler.nitro.resource.stat.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemcpu_response extends base_response
{
	public systemcpu_stats[] systemcpu;
}
/**
* Statistics for cpu resource.
*/

public class systemcpu_stats extends base_resource
{
	private Long id;
	private String clearstats;
	private Long percpuuse;

	/**
	* <pre>
	* ID of the CPU for which to display statistics.
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* ID of the CPU for which to display statistics.
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* ID of the CPU for which to display statistics.<br> Default value: 65535<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
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
	* CPU utilization percentage.
	* </pre>
	*/
	public Long get_percpuuse() throws Exception {
		return this.percpuuse;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemcpu_response result = (systemcpu_response) service.get_payload_formatter().string_to_resource(systemcpu_response.class, response);
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
		return result.systemcpu;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch the statistics of all systemcpu_stats resources that are configured on netscaler.
	*/
	public static systemcpu_stats[] get(nitro_service service) throws Exception{
		systemcpu_stats obj = new systemcpu_stats();
		systemcpu_stats[] response = (systemcpu_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all systemcpu_stats resources that are configured on netscaler.
	*/
	public static systemcpu_stats[] get(nitro_service service, options option) throws Exception{
		systemcpu_stats obj = new systemcpu_stats();
		systemcpu_stats[] response = (systemcpu_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of systemcpu_stats resource of given name .
	*/
	public static systemcpu_stats get(nitro_service service, Long id) throws Exception{
		systemcpu_stats obj = new systemcpu_stats();
		obj.set_id(id);
		systemcpu_stats response = (systemcpu_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
