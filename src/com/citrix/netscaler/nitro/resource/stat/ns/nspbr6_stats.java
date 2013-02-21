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

class nspbr6_response extends base_response
{
	public nspbr6_stats[] nspbr6;
}
/**
* Statistics for PBR6 entry resource.
*/

public class nspbr6_stats extends base_resource
{
	private String name;
	private Long pbr6totpktsallowed;
	private Long pbr6pktsallowedrate;
	private Long pbr6totpktsdenied;
	private Long pbr6pktsdeniedrate;
	private Long pbr6tothits;
	private Long pbr6hitsrate;
	private Long pbr6totmisses;
	private Long pbr6missesrate;
	private Long pbr6perhits;
	private Long pbr6perhitsrate;

	/**
	* <pre>
	* PBR6 Name.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* PBR6 Name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Total packets that matched the PBR6 with action ALLOW 
	* </pre>
	*/
	public Long get_pbr6pktsallowedrate() throws Exception {
		return this.pbr6pktsallowedrate;
	}

	/**
	* <pre>
	* Total packets that matched PBR6 with action DENY 
	* </pre>
	*/
	public Long get_pbr6pktsdeniedrate() throws Exception {
		return this.pbr6pktsdeniedrate;
	}

	/**
	* <pre>
	* Number of times the pbr6 was hit
	* </pre>
	*/
	public Long get_pbr6perhits() throws Exception {
		return this.pbr6perhits;
	}

	/**
	* <pre>
	* Total packets that matched the PBR6 with action ALLOW 
	* </pre>
	*/
	public Long get_pbr6totpktsallowed() throws Exception {
		return this.pbr6totpktsallowed;
	}

	/**
	* <pre>
	* Total packets that did not match any PBR6
	* </pre>
	*/
	public Long get_pbr6missesrate() throws Exception {
		return this.pbr6missesrate;
	}

	/**
	* <pre>
	* Total packets that matched one of the configured PBR6
	* </pre>
	*/
	public Long get_pbr6tothits() throws Exception {
		return this.pbr6tothits;
	}

	/**
	* <pre>
	* Number of times the pbr6 was hit
	* </pre>
	*/
	public Long get_pbr6perhitsrate() throws Exception {
		return this.pbr6perhitsrate;
	}

	/**
	* <pre>
	* Total packets that matched PBR6 with action DENY 
	* </pre>
	*/
	public Long get_pbr6totpktsdenied() throws Exception {
		return this.pbr6totpktsdenied;
	}

	/**
	* <pre>
	* Total packets that matched one of the configured PBR6
	* </pre>
	*/
	public Long get_pbr6hitsrate() throws Exception {
		return this.pbr6hitsrate;
	}

	/**
	* <pre>
	* Total packets that did not match any PBR6
	* </pre>
	*/
	public Long get_pbr6totmisses() throws Exception {
		return this.pbr6totmisses;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nspbr6_response result = (nspbr6_response) service.get_payload_formatter().string_to_resource(nspbr6_response.class, response);
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
		return result.nspbr6;
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
	* Use this API to fetch the statistics of all nspbr6_stats resources that are configured on netscaler.
	*/
	public static nspbr6_stats[] get(nitro_service service) throws Exception{
		nspbr6_stats obj = new nspbr6_stats();
		nspbr6_stats[] response = (nspbr6_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all nspbr6_stats resources that are configured on netscaler.
	*/
	public static nspbr6_stats[] get(nitro_service service, options option) throws Exception{
		nspbr6_stats obj = new nspbr6_stats();
		nspbr6_stats[] response = (nspbr6_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of nspbr6_stats resource of given name .
	*/
	public static nspbr6_stats get(nitro_service service, String name) throws Exception{
		nspbr6_stats obj = new nspbr6_stats();
		obj.set_name(name);
		nspbr6_stats response = (nspbr6_stats) obj.stat_resource(service);
		return response;
	}

}
