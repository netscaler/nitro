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

class pqpolicy_response extends base_response
{
	public pqpolicy_stats[] pqpolicy;
}
/**
* Statistics for PQ policy resource.
*/

public class pqpolicy_stats extends base_resource
{
	private String policyname;
	private Long pqtotqueuewaittime;
	private Long pqtotavgqueuewaittime;
	private Long pqavgqueuewaittimerate;
	private Long pqavgclienttransactiontimems;
	private Long pqavgclienttransactiontimemsrate;
	private String pqvserverip;
	private Integer pqvserverport;
	private Long pqqdepth;
	private Long pqqdepthrate;
	private Long pqcurrentclientconnections;
	private Long pqcurrentclientconnectionsrate;
	private Long pqtotclientconnections;
	private Long pqdropped;
	private Long pqdroppedrate;
	private Long totclienttransactions;
	private Long clienttransactionsrate;
	private Long pqtotqueuedepth;
	private Long pqqueuedepthrate;
	private Long pqavgclienttransactiontime;
	private Long pqavgclienttransactiontimerate;

	/**
	* <pre>
	* The name of the priority queuing policy whose statistics must be displayed. If a name is not provided, details of all priority queuing policies available on the appliance are displayed.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the priority queuing policy whose statistics must be displayed. If a name is not provided, details of all priority queuing policies available on the appliance are displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* IP address of the virtual server to which this priority queuing policy is bound.
	* </pre>
	*/
	public String get_pqvserverip() throws Exception {
		return this.pqvserverip;
	}

	/**
	* <pre>
	* Total number of waiting clients for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqqueuedepthrate() throws Exception {
		return this.pqqueuedepthrate;
	}

	/**
	* <pre>
	* Total number of dropped transactions for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqdroppedrate() throws Exception {
		return this.pqdroppedrate;
	}

	/**
	* <pre>
	* Total number of waiting clients for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqtotqueuedepth() throws Exception {
		return this.pqtotqueuedepth;
	}

	/**
	* <pre>
	* Port number of the virtual server to which this priority queuing policy is bound.
	* </pre>
	*/
	public Integer get_pqvserverport() throws Exception {
		return this.pqvserverport;
	}

	/**
	* <pre>
	* Amount of time spent by priority queuing clients waiting in the priority queue.
	* </pre>
	*/
	public Long get_pqtotqueuewaittime() throws Exception {
		return this.pqtotqueuewaittime;
	}

	/**
	* <pre>
	* Total number of client transactions for this priority queuing policy.
	* </pre>
	*/
	public Long get_totclienttransactions() throws Exception {
		return this.totclienttransactions;
	}

	/**
	* <pre>
	* Total number of client transactions for this priority queuing policy.
	* </pre>
	*/
	public Long get_clienttransactionsrate() throws Exception {
		return this.clienttransactionsrate;
	}

	/**
	* <pre>
	* Current number of server connections established for serving clients for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqcurrentclientconnectionsrate() throws Exception {
		return this.pqcurrentclientconnectionsrate;
	}

	/**
	* <pre>
	* Average time taken by a priority queuing client to complete its transaction for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqavgclienttransactiontimerate() throws Exception {
		return this.pqavgclienttransactiontimerate;
	}

	/**
	* <pre>
	* Number of clients waiting currently for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqqdepthrate() throws Exception {
		return this.pqqdepthrate;
	}

	/**
	* <pre>
	* Number of clients waiting currently for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqqdepth() throws Exception {
		return this.pqqdepth;
	}

	/**
	* <pre>
	* Average time taken by a priority queuing client to complete its transaction for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqavgclienttransactiontime() throws Exception {
		return this.pqavgclienttransactiontime;
	}

	/**
	* <pre>
	* Average time taken by a priority queuing client to complete its transaction for this  priority queuing policy.
	* </pre>
	*/
	public Long get_pqavgclienttransactiontimems() throws Exception {
		return this.pqavgclienttransactiontimems;
	}

	/**
	* <pre>
	* Average time taken by a priority queuing client to complete its transaction for this  priority queuing policy.
	* </pre>
	*/
	public Long get_pqavgclienttransactiontimemsrate() throws Exception {
		return this.pqavgclienttransactiontimemsrate;
	}

	/**
	* <pre>
	* Average wait time for clients for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqtotavgqueuewaittime() throws Exception {
		return this.pqtotavgqueuewaittime;
	}

	/**
	* <pre>
	* Total number of dropped transactions for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqdropped() throws Exception {
		return this.pqdropped;
	}

	/**
	* <pre>
	* Total number of server connections established for serving clients for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqtotclientconnections() throws Exception {
		return this.pqtotclientconnections;
	}

	/**
	* <pre>
	* Average wait time for clients for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqavgqueuewaittimerate() throws Exception {
		return this.pqavgqueuewaittimerate;
	}

	/**
	* <pre>
	* Current number of server connections established for serving clients for this priority queuing policy.
	* </pre>
	*/
	public Long get_pqcurrentclientconnections() throws Exception {
		return this.pqcurrentclientconnections;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		pqpolicy_response result = (pqpolicy_response) service.get_payload_formatter().string_to_resource(pqpolicy_response.class, response);
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
		return result.pqpolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.policyname;
	}

	/**
	* Use this API to fetch the statistics of all pqpolicy_stats resources that are configured on netscaler.
	*/
	public static pqpolicy_stats[] get(nitro_service service) throws Exception{
		pqpolicy_stats obj = new pqpolicy_stats();
		pqpolicy_stats[] response = (pqpolicy_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all pqpolicy_stats resources that are configured on netscaler.
	*/
	public static pqpolicy_stats[] get(nitro_service service, options option) throws Exception{
		pqpolicy_stats obj = new pqpolicy_stats();
		pqpolicy_stats[] response = (pqpolicy_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of pqpolicy_stats resource of given name .
	*/
	public static pqpolicy_stats get(nitro_service service, String policyname) throws Exception{
		pqpolicy_stats obj = new pqpolicy_stats();
		obj.set_policyname(policyname);
		pqpolicy_stats response = (pqpolicy_stats) obj.stat_resource(service);
		return response;
	}

}
