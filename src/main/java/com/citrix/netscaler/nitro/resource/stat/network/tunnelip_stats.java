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

package com.citrix.netscaler.nitro.resource.stat.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tunnelip_response extends base_response
{
	public tunnelip_stats[] tunnelip;
}
/**
* Statistics for TUNNEL Remote ipaddress resource.
*/

public class tunnelip_stats extends base_resource
{
	private String tunnelip;
	private String clearstats;
	private Long tnltotrxpkts;
	private Long tnlrxpktsrate;
	private Long tnltottxpkts;
	private Long tnltxpktsrate;
	private Long tnltotrxbytes;
	private Long tnlrxbytesrate;
	private Long tnltottxbytes;
	private Long tnltxbytesrate;

	/**
	* <pre>
	* remote IP address of the configured tunnel.
	* </pre>
	*/
	public void set_tunnelip(String tunnelip) throws Exception{
		this.tunnelip = tunnelip;
	}

	/**
	* <pre>
	* remote IP address of the configured tunnel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_tunnelip() throws Exception {
		return this.tunnelip;
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
	* Total number of bytes transmitted on the tunnel.
	* </pre>
	*/
	public Long get_tnltottxbytes() throws Exception {
		return this.tnltottxbytes;
	}

	/**
	* <pre>
	* Total number of packets transmitted on the tunnel.
	* </pre>
	*/
	public Long get_tnltottxpkts() throws Exception {
		return this.tnltottxpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for tnltottxpkts
	* </pre>
	*/
	public Long get_tnltxpktsrate() throws Exception {
		return this.tnltxpktsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tnltotrxbytes
	* </pre>
	*/
	public Long get_tnlrxbytesrate() throws Exception {
		return this.tnlrxbytesrate;
	}

	/**
	* <pre>
	* Total number of bytes received on the tunnel.
	* </pre>
	*/
	public Long get_tnltotrxbytes() throws Exception {
		return this.tnltotrxbytes;
	}

	/**
	* <pre>
	* Rate (/s) counter for tnltottxbytes
	* </pre>
	*/
	public Long get_tnltxbytesrate() throws Exception {
		return this.tnltxbytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tnltotrxpkts
	* </pre>
	*/
	public Long get_tnlrxpktsrate() throws Exception {
		return this.tnlrxpktsrate;
	}

	/**
	* <pre>
	* Total number of packets received on the tunnel.
	* </pre>
	*/
	public Long get_tnltotrxpkts() throws Exception {
		return this.tnltotrxpkts;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tunnelip_response result = (tunnelip_response) service.get_payload_formatter().string_to_resource(tunnelip_response.class, response);
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
		return result.tunnelip;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.tunnelip;
	}

	/**
	* Use this API to fetch the statistics of all tunnelip_stats resources that are configured on netscaler.
	*/
	public static tunnelip_stats[] get(nitro_service service) throws Exception{
		tunnelip_stats obj = new tunnelip_stats();
		tunnelip_stats[] response = (tunnelip_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all tunnelip_stats resources that are configured on netscaler.
	*/
	public static tunnelip_stats[] get(nitro_service service, options option) throws Exception{
		tunnelip_stats obj = new tunnelip_stats();
		tunnelip_stats[] response = (tunnelip_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of tunnelip_stats resource of given name .
	*/
	public static tunnelip_stats get(nitro_service service, String tunnelip) throws Exception{
		tunnelip_stats obj = new tunnelip_stats();
		obj.set_tunnelip(tunnelip);
		tunnelip_stats response = (tunnelip_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
