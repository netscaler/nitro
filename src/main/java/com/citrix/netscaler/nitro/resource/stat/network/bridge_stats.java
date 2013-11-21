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

class bridge_response extends base_response
{
	public bridge_stats bridge;
}
/**
* Statistics for bridge resource.
*/

public class bridge_stats extends base_resource
{
	private String clearstats;
	private Long tcptotbdgmacmoved;
	private Long tcpbdgmacmovedrate;
	private Long tcptotbdgcollisions;
	private Long tcpbdgcollisionsrate;
	private Long tcperrbdgmuted;
	private Long tcperrbdgmutedrate;
	private Long totbdgpkts;
	private Long bdgpktsrate;
	private Long totbdgmbits;
	private Long bdgmbitsrate;

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
	* Rate (/s) counter for tcptotbdgcollisions
	* </pre>
	*/
	public Long get_tcpbdgcollisionsrate() throws Exception {
		return this.tcpbdgcollisionsrate;
	}

	/**
	* <pre>
	* The number of bridging table collisions
	* </pre>
	*/
	public Long get_tcptotbdgcollisions() throws Exception {
		return this.tcptotbdgcollisions;
	}

	/**
	* <pre>
	* Rate (/s) counter for totbdgpkts
	* </pre>
	*/
	public Long get_bdgpktsrate() throws Exception {
		return this.bdgpktsrate;
	}

	/**
	* <pre>
	* The total number of bridged Mbits
	* </pre>
	*/
	public Long get_totbdgmbits() throws Exception {
		return this.totbdgmbits;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrbdgmuted
	* </pre>
	*/
	public Long get_tcperrbdgmutedrate() throws Exception {
		return this.tcperrbdgmutedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotbdgmacmoved
	* </pre>
	*/
	public Long get_tcpbdgmacmovedrate() throws Exception {
		return this.tcpbdgmacmovedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totbdgmbits
	* </pre>
	*/
	public Long get_bdgmbitsrate() throws Exception {
		return this.bdgmbitsrate;
	}

	/**
	* <pre>
	* The total number of bridged packets
	* </pre>
	*/
	public Long get_totbdgpkts() throws Exception {
		return this.totbdgpkts;
	}

	/**
	* <pre>
	* The number of bridging related interface mutes
	* </pre>
	*/
	public Long get_tcperrbdgmuted() throws Exception {
		return this.tcperrbdgmuted;
	}

	/**
	* <pre>
	* The number of times bridging registered MAC moved
	* </pre>
	*/
	public Long get_tcptotbdgmacmoved() throws Exception {
		return this.tcptotbdgmacmoved;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		bridge_stats[] resources = new bridge_stats[1];
		bridge_response result = (bridge_response) service.get_payload_formatter().string_to_resource(bridge_response.class, response);
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
		resources[0] = result.bridge;
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
	* Use this API to fetch the statistics of all bridge_stats resources that are configured on netscaler.
	*/
	public static bridge_stats get(nitro_service service) throws Exception{
		bridge_stats obj = new bridge_stats();
		bridge_stats[] response = (bridge_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all bridge_stats resources that are configured on netscaler.
	*/
	public static bridge_stats get(nitro_service service,  options option) throws Exception{
		bridge_stats obj = new bridge_stats();
		bridge_stats[] response = (bridge_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
