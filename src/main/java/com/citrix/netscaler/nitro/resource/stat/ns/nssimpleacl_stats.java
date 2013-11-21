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

class nssimpleacl_response extends base_response
{
	public nssimpleacl_stats nssimpleacl;
}
/**
* Statistics for simple ACL resource.
*/

public class nssimpleacl_stats extends base_resource
{
	private String clearstats;
	private Long sacltothits;
	private Long saclhitsrate;
	private Long sacltotmisses;
	private Long saclmissesrate;
	private Long saclscount;
	private Long sacltotpktsallowed;
	private Long saclpktsallowedrate;
	private Long sacltotpktsbridged;
	private Long saclpktsbridgedrate;
	private Long sacltotpktsdenied;
	private Long saclpktsdeniedrate;

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
	* Packets matching a SimpleACL.
	* </pre>
	*/
	public Long get_sacltothits() throws Exception {
		return this.sacltothits;
	}

	/**
	* <pre>
	* Number of SimpleACLs configured.
	* </pre>
	*/
	public Long get_saclscount() throws Exception {
		return this.saclscount;
	}

	/**
	* <pre>
	* Rate (/s) counter for sacltothits
	* </pre>
	*/
	public Long get_saclhitsrate() throws Exception {
		return this.saclhitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for sacltotpktsbridged
	* </pre>
	*/
	public Long get_saclpktsbridgedrate() throws Exception {
		return this.saclpktsbridgedrate;
	}

	/**
	* <pre>
	* Packets dropped because they match SimpleACL (Access Control List) with processing mode set to DENY.
	* </pre>
	*/
	public Long get_sacltotpktsdenied() throws Exception {
		return this.sacltotpktsdenied;
	}

	/**
	* <pre>
	* Packets not matching any SimpleACL.
	* </pre>
	*/
	public Long get_sacltotmisses() throws Exception {
		return this.sacltotmisses;
	}

	/**
	* <pre>
	* Rate (/s) counter for sacltotmisses
	* </pre>
	*/
	public Long get_saclmissesrate() throws Exception {
		return this.saclmissesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for sacltotpktsallowed
	* </pre>
	*/
	public Long get_saclpktsallowedrate() throws Exception {
		return this.saclpktsallowedrate;
	}

	/**
	* <pre>
	* Total packets that matched a SimpleACL with action BRIDGE and got bridged by NetScaler.
	* </pre>
	*/
	public Long get_sacltotpktsbridged() throws Exception {
		return this.sacltotpktsbridged;
	}

	/**
	* <pre>
	* Rate (/s) counter for sacltotpktsdenied
	* </pre>
	*/
	public Long get_saclpktsdeniedrate() throws Exception {
		return this.saclpktsdeniedrate;
	}

	/**
	* <pre>
	* Total packets that matched a SimpleACL with action ALLOW and got consumed by NetScaler.
	* </pre>
	*/
	public Long get_sacltotpktsallowed() throws Exception {
		return this.sacltotpktsallowed;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nssimpleacl_stats[] resources = new nssimpleacl_stats[1];
		nssimpleacl_response result = (nssimpleacl_response) service.get_payload_formatter().string_to_resource(nssimpleacl_response.class, response);
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
		resources[0] = result.nssimpleacl;
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
	* Use this API to fetch the statistics of all nssimpleacl_stats resources that are configured on netscaler.
	*/
	public static nssimpleacl_stats get(nitro_service service) throws Exception{
		nssimpleacl_stats obj = new nssimpleacl_stats();
		nssimpleacl_stats[] response = (nssimpleacl_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all nssimpleacl_stats resources that are configured on netscaler.
	*/
	public static nssimpleacl_stats get(nitro_service service,  options option) throws Exception{
		nssimpleacl_stats obj = new nssimpleacl_stats();
		nssimpleacl_stats[] response = (nssimpleacl_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
