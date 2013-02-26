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

package com.citrix.netscaler.nitro.resource.stat.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class servicegroup_response extends base_response
{
	public servicegroup_stats[] servicegroup;
}
/**
* Statistics for service group resource.
*/

public class servicegroup_stats extends base_resource
{
	private String servicegroupname;
	private String state;
	private String servicetype;

	/**
	* <pre>
	* The name of a service group
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of a service group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* The service type of this service.
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* Current state of the server.
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		servicegroup_response result = (servicegroup_response) service.get_payload_formatter().string_to_resource(servicegroup_response.class, response);
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
		return result.servicegroup;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to fetch the statistics of all servicegroup_stats resources that are configured on netscaler.
	*/
	public static servicegroup_stats[] get(nitro_service service) throws Exception{
		servicegroup_stats obj = new servicegroup_stats();
		servicegroup_stats[] response = (servicegroup_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all servicegroup_stats resources that are configured on netscaler.
	*/
	public static servicegroup_stats[] get(nitro_service service, options option) throws Exception{
		servicegroup_stats obj = new servicegroup_stats();
		servicegroup_stats[] response = (servicegroup_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of servicegroup_stats resource of given name .
	*/
	public static servicegroup_stats get(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_stats obj = new servicegroup_stats();
		obj.set_servicegroupname(servicegroupname);
		servicegroup_stats response = (servicegroup_stats) obj.stat_resource(service);
		return response;
	}

}
