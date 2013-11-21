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

package com.citrix.netscaler.nitro.resource.stat.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nspbr_response extends base_response
{
	public nspbr_stats[] nspbr;
}
/**
* Statistics for Policy Based Routing(PBR) entry resource.
*/

public class nspbr_stats extends base_resource
{
	private String name;
	private String clearstats;
	private Long pbrtotpktsallowed;
	private Long pbrpktsallowedrate;
	private Long pbrtotpktsdenied;
	private Long pbrpktsdeniedrate;
	private Long pbrtothits;
	private Long pbrhitsrate;
	private Long pbrtotmisses;
	private Long pbrmissesrate;
	private Long pbrperhits;
	private Long pbrperhitsrate;

	/**
	* <pre>
	* Name of the PBR whose statistics you want the NetScaler appliance to display.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the PBR whose statistics you want the NetScaler appliance to display.<br> Minimum length =  1
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
	* Rate (/s) counter for pbrtotpktsdenied
	* </pre>
	*/
	public Long get_pbrpktsdeniedrate() throws Exception {
		return this.pbrpktsdeniedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for pbrtotmisses
	* </pre>
	*/
	public Long get_pbrmissesrate() throws Exception {
		return this.pbrmissesrate;
	}

	/**
	* <pre>
	* Total packets that matched one of the configured PBR
	* </pre>
	*/
	public Long get_pbrtothits() throws Exception {
		return this.pbrtothits;
	}

	/**
	* <pre>
	* Rate (/s) counter for pbrperhits
	* </pre>
	*/
	public Long get_pbrperhitsrate() throws Exception {
		return this.pbrperhitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for pbrtothits
	* </pre>
	*/
	public Long get_pbrhitsrate() throws Exception {
		return this.pbrhitsrate;
	}

	/**
	* <pre>
	* Number of times the pbr was hit
	* </pre>
	*/
	public Long get_pbrperhits() throws Exception {
		return this.pbrperhits;
	}

	/**
	* <pre>
	* Total packets that did not match any PBR
	* </pre>
	*/
	public Long get_pbrtotmisses() throws Exception {
		return this.pbrtotmisses;
	}

	/**
	* <pre>
	* Total packets that matched the PBR (Policy-Based Routes) with action ALLOW 
	* </pre>
	*/
	public Long get_pbrtotpktsallowed() throws Exception {
		return this.pbrtotpktsallowed;
	}

	/**
	* <pre>
	* Total packets that matched the PBR with action DENY 
	* </pre>
	*/
	public Long get_pbrtotpktsdenied() throws Exception {
		return this.pbrtotpktsdenied;
	}

	/**
	* <pre>
	* Rate (/s) counter for pbrtotpktsallowed
	* </pre>
	*/
	public Long get_pbrpktsallowedrate() throws Exception {
		return this.pbrpktsallowedrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nspbr_response result = (nspbr_response) service.get_payload_formatter().string_to_resource(nspbr_response.class, response);
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
		return result.nspbr;
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
	* Use this API to fetch the statistics of all nspbr_stats resources that are configured on netscaler.
	*/
	public static nspbr_stats[] get(nitro_service service) throws Exception{
		nspbr_stats obj = new nspbr_stats();
		nspbr_stats[] response = (nspbr_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all nspbr_stats resources that are configured on netscaler.
	*/
	public static nspbr_stats[] get(nitro_service service, options option) throws Exception{
		nspbr_stats obj = new nspbr_stats();
		nspbr_stats[] response = (nspbr_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of nspbr_stats resource of given name .
	*/
	public static nspbr_stats get(nitro_service service, String name) throws Exception{
		nspbr_stats obj = new nspbr_stats();
		obj.set_name(name);
		nspbr_stats response = (nspbr_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
