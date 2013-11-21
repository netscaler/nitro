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

class vpath_response extends base_response
{
	public vpath_stats vpath;
}
/**
* Statistics for Vpath resource.
*/

public class vpath_stats extends base_resource
{
	private String clearstats;
	private Long totl2datarx;
	private Long l2datarxrate;
	private Long totl3datarx;
	private Long l3datarxrate;
	private Long totl2cntrlpkts;
	private Long l2cntrlpktsrate;
	private Long totl3cntrlpkts;
	private Long l3cntrlpktsrate;
	private Long totfragpkts;
	private Long fragpktsrate;
	private Long totl2encappkts;
	private Long l2encappktsrate;
	private Long totl3encappkts;
	private Long l3encappktsrate;
	private Long totfragencappkts;
	private Long fragencappktsrate;

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
	* Rate (/s) counter for totl2encappkts
	* </pre>
	*/
	public Long get_l2encappktsrate() throws Exception {
		return this.l2encappktsrate;
	}

	/**
	* <pre>
	* Total number of L2 vpath encapsulated packets injected to VEM
	* </pre>
	*/
	public Long get_totl2encappkts() throws Exception {
		return this.totl2encappkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for totl3encappkts
	* </pre>
	*/
	public Long get_l3encappktsrate() throws Exception {
		return this.l3encappktsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totl2datarx
	* </pre>
	*/
	public Long get_l2datarxrate() throws Exception {
		return this.l2datarxrate;
	}

	/**
	* <pre>
	* Number of fragmented vpath packets transmitted
	* </pre>
	*/
	public Long get_totfragencappkts() throws Exception {
		return this.totfragencappkts;
	}

	/**
	* <pre>
	* Total number of vpath control packets received in L3 adjacency
	* </pre>
	*/
	public Long get_totl3cntrlpkts() throws Exception {
		return this.totl3cntrlpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for totl3datarx
	* </pre>
	*/
	public Long get_l3datarxrate() throws Exception {
		return this.l3datarxrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totl3cntrlpkts
	* </pre>
	*/
	public Long get_l3cntrlpktsrate() throws Exception {
		return this.l3cntrlpktsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totfragencappkts
	* </pre>
	*/
	public Long get_fragencappktsrate() throws Exception {
		return this.fragencappktsrate;
	}

	/**
	* <pre>
	* Total number of vpath control packets received in L2 adjacency
	* </pre>
	*/
	public Long get_totl2cntrlpkts() throws Exception {
		return this.totl2cntrlpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for totfragpkts
	* </pre>
	*/
	public Long get_fragpktsrate() throws Exception {
		return this.fragpktsrate;
	}

	/**
	* <pre>
	* Total number of non-fragmented vpath data packets decapsulated in L3 adjacency
	* </pre>
	*/
	public Long get_totl3datarx() throws Exception {
		return this.totl3datarx;
	}

	/**
	* <pre>
	* Total number of L3 vpath encapsulated packets injected to VEM
	* </pre>
	*/
	public Long get_totl3encappkts() throws Exception {
		return this.totl3encappkts;
	}

	/**
	* <pre>
	* Total number of Vpath fragments received
	* </pre>
	*/
	public Long get_totfragpkts() throws Exception {
		return this.totfragpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for totl2cntrlpkts
	* </pre>
	*/
	public Long get_l2cntrlpktsrate() throws Exception {
		return this.l2cntrlpktsrate;
	}

	/**
	* <pre>
	* Total number of non-fragmented vpath data packets decapsulated in L2 adjacency
	* </pre>
	*/
	public Long get_totl2datarx() throws Exception {
		return this.totl2datarx;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		vpath_stats[] resources = new vpath_stats[1];
		vpath_response result = (vpath_response) service.get_payload_formatter().string_to_resource(vpath_response.class, response);
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
		resources[0] = result.vpath;
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
	* Use this API to fetch the statistics of all vpath_stats resources that are configured on netscaler.
	*/
	public static vpath_stats get(nitro_service service) throws Exception{
		vpath_stats obj = new vpath_stats();
		vpath_stats[] response = (vpath_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all vpath_stats resources that are configured on netscaler.
	*/
	public static vpath_stats get(nitro_service service,  options option) throws Exception{
		vpath_stats obj = new vpath_stats();
		vpath_stats[] response = (vpath_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
