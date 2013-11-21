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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsstats_response extends base_response
{
	public nsstats nsstats;
}
/**
* Configuration for stats resource.
*/

public class nsstats extends base_resource
{
	private String cleanuplevel;

	/**
	* <pre>
	* The level of stats to be cleared. 'global' option will clear global counters only, 'all' option will clear all device counters also along with global counters. For both the cases only 'ever incrementing counters' i.e. total counters will be cleared.<br> Possible values = global, all
	* </pre>
	*/
	public void set_cleanuplevel(String cleanuplevel) throws Exception{
		this.cleanuplevel = cleanuplevel;
	}

	/**
	* <pre>
	* The level of stats to be cleared. 'global' option will clear global counters only, 'all' option will clear all device counters also along with global counters. For both the cases only 'ever incrementing counters' i.e. total counters will be cleared.<br> Possible values = global, all
	* </pre>
	*/
	public String get_cleanuplevel() throws Exception {
		return this.cleanuplevel;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsstats[] resources = new nsstats[1];
		nsstats_response result = (nsstats_response) service.get_payload_formatter().string_to_resource(nsstats_response.class, response);
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
		resources[0] = result.nsstats;
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
	* Use this API to clear nsstats.
	*/
	public static base_response clear(nitro_service client, nsstats resource) throws Exception {
		nsstats clearresource = new nsstats();
		clearresource.cleanuplevel = resource.cleanuplevel;
		return clearresource.perform_operation(client,"clear");
	}

	public static class cleanuplevelEnum {
		public static final String global = "global";
		public static final String all = "all";
	}
}
