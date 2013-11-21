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

class systemmemory_response extends base_response
{
	public systemmemory_stats systemmemory;
}
/**
* Statistics for Global system memory stats resource.
*/

public class systemmemory_stats extends base_resource
{
	private String clearstats;
	private Double shmemallocpcnt;
	private Long shmemallocinmb;
	private Long shmemtotinmb;
	private Long memtotfree;
	private Double memusagepcnt;
	private Long memtotuseinmb;
	private Double memtotallocpcnt;
	private Long memtotallocmb;
	private Long memtotinmb;
	private Long memtotavail;

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
	* Total memory available (grabbed) for use by packet engine (PE), in megabytes.
	* </pre>
	*/
	public Long get_memtotinmb() throws Exception {
		return this.memtotinmb;
	}

	/**
	* <pre>
	* Currently allocated memory in percent.
	* </pre>
	*/
	public Double get_memtotallocpcnt() throws Exception {
		return this.memtotallocpcnt;
	}

	/**
	* <pre>
	* Total Free PE Memory in the System.
	* </pre>
	*/
	public Long get_memtotfree() throws Exception {
		return this.memtotfree;
	}

	/**
	* <pre>
	* Shared memory insue percent.
	* </pre>
	*/
	public Double get_shmemallocpcnt() throws Exception {
		return this.shmemallocpcnt;
	}

	/**
	* <pre>
	* Currently allocated memory, in megabytes.
	* </pre>
	*/
	public Long get_memtotallocmb() throws Exception {
		return this.memtotallocmb;
	}

	/**
	* <pre>
	* Shared memory insue, in megabytes.
	* </pre>
	*/
	public Long get_shmemallocinmb() throws Exception {
		return this.shmemallocinmb;
	}

	/**
	* <pre>
	* Total NetScaler Memory in use, in megabytes.
	* </pre>
	*/
	public Long get_memtotuseinmb() throws Exception {
		return this.memtotuseinmb;
	}

	/**
	* <pre>
	* Total system memory available for PE to grab from the system.
	* </pre>
	*/
	public Long get_memtotavail() throws Exception {
		return this.memtotavail;
	}

	/**
	* <pre>
	* Total shared memory allowed to allocate, in megabytes.
	* </pre>
	*/
	public Long get_shmemtotinmb() throws Exception {
		return this.shmemtotinmb;
	}

	/**
	* <pre>
	* Percentage of memory utilization on NetScaler.
	* </pre>
	*/
	public Double get_memusagepcnt() throws Exception {
		return this.memusagepcnt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		systemmemory_stats[] resources = new systemmemory_stats[1];
		systemmemory_response result = (systemmemory_response) service.get_payload_formatter().string_to_resource(systemmemory_response.class, response);
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
		resources[0] = result.systemmemory;
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
	* Use this API to fetch the statistics of all systemmemory_stats resources that are configured on netscaler.
	*/
	public static systemmemory_stats get(nitro_service service) throws Exception{
		systemmemory_stats obj = new systemmemory_stats();
		systemmemory_stats[] response = (systemmemory_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all systemmemory_stats resources that are configured on netscaler.
	*/
	public static systemmemory_stats get(nitro_service service,  options option) throws Exception{
		systemmemory_stats obj = new systemmemory_stats();
		systemmemory_stats[] response = (systemmemory_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
