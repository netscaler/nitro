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

package com.citrix.netscaler.nitro.resource.stat.protocol;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class protocoludp_response extends base_response
{
	public protocoludp_stats protocoludp;
}
/**
* Statistics for UDP Protocol resource.
*/

public class protocoludp_stats extends base_resource
{
	private String clearstats;
	private Long udptotrxpkts;
	private Long udprxpktsrate;
	private Long udptotrxbytes;
	private Long udprxbytesrate;
	private Long udptottxpkts;
	private Long udptxpktsrate;
	private Long udptottxbytes;
	private Long udptxbytesrate;
	private Long udpcurratethreshold;
	private Long udptotunknownsvcpkts;
	private Long udpbadchecksum;
	private Long udpcurratethresholdexceeds;

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
	* Rate (/s) counter for udptottxpkts
	* </pre>
	*/
	public Long get_udptxpktsrate() throws Exception {
		return this.udptxpktsrate;
	}

	/**
	* <pre>
	* Limit for UDP packets handled every 10 milliseconds. Default value, 0, applies no limit.
This is a configurable value using the set rateControl command.
 
	* </pre>
	*/
	public Long get_udpcurratethreshold() throws Exception {
		return this.udpcurratethreshold;
	}

	/**
	* <pre>
	* Total number of UDP packets received.
	* </pre>
	*/
	public Long get_udptotrxpkts() throws Exception {
		return this.udptotrxpkts;
	}

	/**
	* <pre>
	* Total number of UDP packets transmitted.
	* </pre>
	*/
	public Long get_udptottxpkts() throws Exception {
		return this.udptottxpkts;
	}

	/**
	* <pre>
	* Total number of UDP data received in bytes.
	* </pre>
	*/
	public Long get_udptotrxbytes() throws Exception {
		return this.udptotrxbytes;
	}

	/**
	* <pre>
	* Rate (/s) counter for udptottxbytes
	* </pre>
	*/
	public Long get_udptxbytesrate() throws Exception {
		return this.udptxbytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for udptotrxpkts
	* </pre>
	*/
	public Long get_udprxpktsrate() throws Exception {
		return this.udprxpktsrate;
	}

	/**
	* <pre>
	* Packets received with a UDP checksum error.
	* </pre>
	*/
	public Long get_udpbadchecksum() throws Exception {
		return this.udpbadchecksum;
	}

	/**
	* <pre>
	* Total number of UDP data transmitted in bytes.
	* </pre>
	*/
	public Long get_udptottxbytes() throws Exception {
		return this.udptottxbytes;
	}

	/**
	* <pre>
	* Stray UDP packets dropped due to no configured listening  service.
	* </pre>
	*/
	public Long get_udptotunknownsvcpkts() throws Exception {
		return this.udptotunknownsvcpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for udptotrxbytes
	* </pre>
	*/
	public Long get_udprxbytesrate() throws Exception {
		return this.udprxbytesrate;
	}

	/**
	* <pre>
	* Number of times the UDP rate threshold is exceeded. If this counter continuously increases, first make sure the UDP packets received are genuine. 
	If they are, increase the current rate threshold. This is a configurable value using the set rateControl command.
	
	* </pre>
	*/
	public Long get_udpcurratethresholdexceeds() throws Exception {
		return this.udpcurratethresholdexceeds;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		protocoludp_stats[] resources = new protocoludp_stats[1];
		protocoludp_response result = (protocoludp_response) service.get_payload_formatter().string_to_resource(protocoludp_response.class, response);
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
		resources[0] = result.protocoludp;
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
	* Use this API to fetch the statistics of all protocoludp_stats resources that are configured on netscaler.
	*/
	public static protocoludp_stats get(nitro_service service) throws Exception{
		protocoludp_stats obj = new protocoludp_stats();
		protocoludp_stats[] response = (protocoludp_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all protocoludp_stats resources that are configured on netscaler.
	*/
	public static protocoludp_stats get(nitro_service service,  options option) throws Exception{
		protocoludp_stats obj = new protocoludp_stats();
		protocoludp_stats[] response = (protocoludp_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
