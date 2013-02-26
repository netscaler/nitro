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

class nssimpleacl6_response extends base_response
{
	public nssimpleacl6_stats nssimpleacl6;
}
/**
* Statistics for simple ACL6 resource.
*/

public class nssimpleacl6_stats extends base_resource
{
	private Long sacl6totpktsallowed;
	private Long sacl6pktsallowedrate;
	private Long sacl6totpktsbridged;
	private Long sacl6pktsbridgedrate;
	private Long sacl6totpktsdenied;
	private Long sacl6pktsdeniedrate;
	private Long sacl6tothits;
	private Long sacl6hitsrate;
	private Long sacl6totmisses;
	private Long sacl6missesrate;
	private Long sacl6scount;

	/**
	* <pre>
	* Number of SimpleACL6s configured.
	* </pre>
	*/
	public Long get_sacl6scount() throws Exception {
		return this.sacl6scount;
	}

	/**
	* <pre>
	* Total packets that matched a SimpleACL6 with action BRIDGE and got bridged by NetScaler.
	* </pre>
	*/
	public Long get_sacl6pktsbridgedrate() throws Exception {
		return this.sacl6pktsbridgedrate;
	}

	/**
	* <pre>
	* Total packets that matched a SimpleACL6 with action ALLOW and got consumed by NetScaler.
	* </pre>
	*/
	public Long get_sacl6totpktsallowed() throws Exception {
		return this.sacl6totpktsallowed;
	}

	/**
	* <pre>
	* Packets not matching any SimpleACL6.
	* </pre>
	*/
	public Long get_sacl6totmisses() throws Exception {
		return this.sacl6totmisses;
	}

	/**
	* <pre>
	* Packets not matching any SimpleACL6.
	* </pre>
	*/
	public Long get_sacl6missesrate() throws Exception {
		return this.sacl6missesrate;
	}

	/**
	* <pre>
	* Packets matching a SimpleACL6.
	* </pre>
	*/
	public Long get_sacl6hitsrate() throws Exception {
		return this.sacl6hitsrate;
	}

	/**
	* <pre>
	* Packets matching a SimpleACL6.
	* </pre>
	*/
	public Long get_sacl6tothits() throws Exception {
		return this.sacl6tothits;
	}

	/**
	* <pre>
	* Packets dropped because they match SimpleACL6 with processing mode set to DENY.
	* </pre>
	*/
	public Long get_sacl6totpktsdenied() throws Exception {
		return this.sacl6totpktsdenied;
	}

	/**
	* <pre>
	* Total packets that matched a SimpleACL6 with action ALLOW and got consumed by NetScaler.
	* </pre>
	*/
	public Long get_sacl6pktsallowedrate() throws Exception {
		return this.sacl6pktsallowedrate;
	}

	/**
	* <pre>
	* Total packets that matched a SimpleACL6 with action BRIDGE and got bridged by NetScaler.
	* </pre>
	*/
	public Long get_sacl6totpktsbridged() throws Exception {
		return this.sacl6totpktsbridged;
	}

	/**
	* <pre>
	* Packets dropped because they match SimpleACL6 with processing mode set to DENY.
	* </pre>
	*/
	public Long get_sacl6pktsdeniedrate() throws Exception {
		return this.sacl6pktsdeniedrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nssimpleacl6_stats[] resources = new nssimpleacl6_stats[1];
		nssimpleacl6_response result = (nssimpleacl6_response) service.get_payload_formatter().string_to_resource(nssimpleacl6_response.class, response);
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
		resources[0] = result.nssimpleacl6;
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
	* Use this API to fetch the statistics of all nssimpleacl6_stats resources that are configured on netscaler.
	*/
	public static nssimpleacl6_stats get(nitro_service service) throws Exception{
		nssimpleacl6_stats obj = new nssimpleacl6_stats();
		nssimpleacl6_stats[] response = (nssimpleacl6_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all nssimpleacl6_stats resources that are configured on netscaler.
	*/
	public static nssimpleacl6_stats get(nitro_service service,  options option) throws Exception{
		nssimpleacl6_stats obj = new nssimpleacl6_stats();
		nssimpleacl6_stats[] response = (nssimpleacl6_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
