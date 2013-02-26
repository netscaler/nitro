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

class rnatip_response extends base_response
{
	public rnatip_stats[] rnatip;
}
/**
* Statistics for RNAT ipaddress resource.
*/

public class rnatip_stats extends base_resource
{
	private String Rnatip;
	private Long iprnattotrxbytes;
	private Long iprnatrxbytesrate;
	private Long iprnattottxbytes;
	private Long iprnattxbytesrate;
	private Long iprnattotrxpkts;
	private Long iprnatrxpktsrate;
	private Long iprnattottxpkts;
	private Long iprnattxpktsrate;
	private Long iprnattottxsyn;
	private Long iprnattxsynrate;
	private Long iprnatcursessions;

	/**
	* <pre>
	* Specifies the NAT IP address of the configured RNAT entry for which you want to see the statistics. If you do not specify an IP address, this displays the statistics for all the configured RNAT entries.
	* </pre>
	*/
	public void set_Rnatip(String Rnatip) throws Exception{
		this.Rnatip = Rnatip;
	}

	/**
	* <pre>
	* Specifies the NAT IP address of the configured RNAT entry for which you want to see the statistics. If you do not specify an IP address, this displays the statistics for all the configured RNAT entries.<br> Minimum length =  1
	* </pre>
	*/
	public String get_Rnatip() throws Exception {
		return this.Rnatip;
	}

	/**
	* <pre>
	* Packets received on this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnatrxpktsrate() throws Exception {
		return this.iprnatrxpktsrate;
	}

	/**
	* <pre>
	* Packets sent from this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnattxpktsrate() throws Exception {
		return this.iprnattxpktsrate;
	}

	/**
	* <pre>
	* Packets sent from this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnattottxpkts() throws Exception {
		return this.iprnattottxpkts;
	}

	/**
	* <pre>
	* Bytes sent from this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnattottxbytes() throws Exception {
		return this.iprnattottxbytes;
	}

	/**
	* <pre>
	* Currently active RNAT sessions started from this IP address.
	* </pre>
	*/
	public Long get_iprnatcursessions() throws Exception {
		return this.iprnatcursessions;
	}

	/**
	* <pre>
	* Bytes received on this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnatrxbytesrate() throws Exception {
		return this.iprnatrxbytesrate;
	}

	/**
	* <pre>
	* Bytes received on this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnattotrxbytes() throws Exception {
		return this.iprnattotrxbytes;
	}

	/**
	* <pre>
	* Requests for connections sent from this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnattxsynrate() throws Exception {
		return this.iprnattxsynrate;
	}

	/**
	* <pre>
	* Bytes sent from this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnattxbytesrate() throws Exception {
		return this.iprnattxbytesrate;
	}

	/**
	* <pre>
	* Packets received on this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnattotrxpkts() throws Exception {
		return this.iprnattotrxpkts;
	}

	/**
	* <pre>
	* Requests for connections sent from this IP address during RNAT sessions.
	* </pre>
	*/
	public Long get_iprnattottxsyn() throws Exception {
		return this.iprnattottxsyn;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rnatip_response result = (rnatip_response) service.get_payload_formatter().string_to_resource(rnatip_response.class, response);
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
		return result.rnatip;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.Rnatip;
	}

	/**
	* Use this API to fetch the statistics of all rnatip_stats resources that are configured on netscaler.
	*/
	public static rnatip_stats[] get(nitro_service service) throws Exception{
		rnatip_stats obj = new rnatip_stats();
		rnatip_stats[] response = (rnatip_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all rnatip_stats resources that are configured on netscaler.
	*/
	public static rnatip_stats[] get(nitro_service service, options option) throws Exception{
		rnatip_stats obj = new rnatip_stats();
		rnatip_stats[] response = (rnatip_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of rnatip_stats resource of given name .
	*/
	public static rnatip_stats get(nitro_service service, String Rnatip) throws Exception{
		rnatip_stats obj = new rnatip_stats();
		obj.set_Rnatip(Rnatip);
		rnatip_stats response = (rnatip_stats) obj.stat_resource(service);
		return response;
	}

}
