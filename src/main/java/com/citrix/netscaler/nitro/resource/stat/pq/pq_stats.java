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

package com.citrix.netscaler.nitro.resource.stat.pq;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class pq_response extends base_response
{
	public pq_stats pq;
}

public class pq_stats extends base_resource
{
	private Long pqtotalpolicymatches;
	private Long pqpolicymatchesrate;
	private Long pqtotalthresholdfailed;
	private Long pqthresholdfailedrate;
	private Long pqpriority1requests;
	private Long pqpriority1requestsrate;
	private Long pqpriority2requests;
	private Long pqpriority2requestsrate;
	private Long pqpriority3requests;
	private Long pqpriority3requestsrate;

	/**
	* <pre>
	* Number of priority 2 requests that the Netscaler appliance received.
	* </pre>
	*/
	public Long get_pqpriority2requestsrate() throws Exception {
		return this.pqpriority2requestsrate;
	}

	/**
	* <pre>
	* Number of times the Netscaler appliance matched an incoming request using any priority queuing policy.
	* </pre>
	*/
	public Long get_pqpolicymatchesrate() throws Exception {
		return this.pqpolicymatchesrate;
	}

	/**
	* <pre>
	* Number of priority 1 requests that the Netscaler appliance received.
	* </pre>
	*/
	public Long get_pqpriority1requestsrate() throws Exception {
		return this.pqpriority1requestsrate;
	}

	/**
	* <pre>
	* Number of times the Netscaler appliance failed to match an incoming request to any of priority queing policy.
	* </pre>
	*/
	public Long get_pqthresholdfailedrate() throws Exception {
		return this.pqthresholdfailedrate;
	}

	/**
	* <pre>
	* Number of times the Netscaler appliance matched an incoming request using any priority queuing policy.
	* </pre>
	*/
	public Long get_pqtotalpolicymatches() throws Exception {
		return this.pqtotalpolicymatches;
	}

	/**
	* <pre>
	* Number of priority 1 requests that the Netscaler appliance received.
	* </pre>
	*/
	public Long get_pqpriority1requests() throws Exception {
		return this.pqpriority1requests;
	}

	/**
	* <pre>
	* Number of priority 3 requests that the Netscaler appliance received.
	* </pre>
	*/
	public Long get_pqpriority3requestsrate() throws Exception {
		return this.pqpriority3requestsrate;
	}

	/**
	* <pre>
	* Number of priority 3 requests that the Netscaler appliance received.
	* </pre>
	*/
	public Long get_pqpriority3requests() throws Exception {
		return this.pqpriority3requests;
	}

	/**
	* <pre>
	* Number of priority 2 requests that the Netscaler appliance received.
	* </pre>
	*/
	public Long get_pqpriority2requests() throws Exception {
		return this.pqpriority2requests;
	}

	/**
	* <pre>
	* Number of times the Netscaler appliance failed to match an incoming request to any of priority queing policy.
	* </pre>
	*/
	public Long get_pqtotalthresholdfailed() throws Exception {
		return this.pqtotalthresholdfailed;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		pq_stats[] resources = new pq_stats[1];
		pq_response result = (pq_response) service.get_payload_formatter().string_to_resource(pq_response.class, response);
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
		resources[0] = result.pq;
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
	* Use this API to fetch the statistics of all pq_stats resources that are configured on netscaler.
	*/
	public static pq_stats get(nitro_service service) throws Exception{
		pq_stats obj = new pq_stats();
		pq_stats[] response = (pq_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all pq_stats resources that are configured on netscaler.
	*/
	public static pq_stats get(nitro_service service,  options option) throws Exception{
		pq_stats obj = new pq_stats();
		pq_stats[] response = (pq_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
