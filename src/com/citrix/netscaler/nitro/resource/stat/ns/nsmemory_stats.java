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

class nsmemory_response extends base_response
{
	public nsmemory_stats[] nsmemory;
}
/**
* Statistics for  resource.
*/

public class nsmemory_stats extends base_resource
{
	private String pool;
	private Double allocf;
	private Double memcurallocper;
	private Long memcurinkb;

	/**
	* <pre>
	* Feature name
	* </pre>
	*/
	public void set_pool(String pool) throws Exception{
		this.pool = pool;
	}

	/**
	* <pre>
	* Feature name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_pool() throws Exception {
		return this.pool;
	}

	/**
	* <pre>
	* Total current NetScaler memory available for use by the feature, in kilobytes.
	* </pre>
	*/
	public Long get_memcurinkb() throws Exception {
		return this.memcurinkb;
	}

	/**
	* <pre>
	* Memory allocation failure for particular feature.
	* </pre>
	*/
	public Double get_allocf() throws Exception {
		return this.allocf;
	}

	/**
	* <pre>
	* Percentage of NetScaler memory used by the feature.
	* </pre>
	*/
	public Double get_memcurallocper() throws Exception {
		return this.memcurallocper;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsmemory_response result = (nsmemory_response) service.get_payload_formatter().string_to_resource(nsmemory_response.class, response);
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
		return result.nsmemory;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.pool;
	}

	/**
	* Use this API to fetch the statistics of all nsmemory_stats resources that are configured on netscaler.
	*/
	public static nsmemory_stats[] get(nitro_service service) throws Exception{
		nsmemory_stats obj = new nsmemory_stats();
		nsmemory_stats[] response = (nsmemory_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all nsmemory_stats resources that are configured on netscaler.
	*/
	public static nsmemory_stats[] get(nitro_service service, options option) throws Exception{
		nsmemory_stats obj = new nsmemory_stats();
		nsmemory_stats[] response = (nsmemory_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of nsmemory_stats resource of given name .
	*/
	public static nsmemory_stats get(nitro_service service, String pool) throws Exception{
		nsmemory_stats obj = new nsmemory_stats();
		obj.set_pool(pool);
		nsmemory_stats response = (nsmemory_stats) obj.stat_resource(service);
		return response;
	}

}
