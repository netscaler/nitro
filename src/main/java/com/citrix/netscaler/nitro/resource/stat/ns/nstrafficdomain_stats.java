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

class nstrafficdomain_response extends base_response
{
	public nstrafficdomain_stats[] nstrafficdomain;
}
/**
* Statistics for Traffic Domain resource.
*/

public class nstrafficdomain_stats extends base_resource
{
	private Long td;
	private String clearstats;
	private Long nstdtotrxpkts;
	private Long nstdrxpktsrate;
	private Long nstdtottxpkts;
	private Long nstdtxpktsrate;
	private Long nstdtotdroppedpkts;
	private Long nstddroppedpktsrate;

	/**
	* <pre>
	* An integer specifying the Traffic Domain ID. Possible values: 1 through 4094.
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* An integer specifying the Traffic Domain ID. Possible values: 1 through 4094.
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* An integer specifying the Traffic Domain ID. Possible values: 1 through 4094.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
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
	* Packets received on this TD.
	* </pre>
	*/
	public Long get_nstdtotrxpkts() throws Exception {
		return this.nstdtotrxpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for nstdtotdroppedpkts
	* </pre>
	*/
	public Long get_nstddroppedpktsrate() throws Exception {
		return this.nstddroppedpktsrate;
	}

	/**
	* <pre>
	* Inbound packets dropped on this TD by reception.
	* </pre>
	*/
	public Long get_nstdtotdroppedpkts() throws Exception {
		return this.nstdtotdroppedpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for nstdtotrxpkts
	* </pre>
	*/
	public Long get_nstdrxpktsrate() throws Exception {
		return this.nstdrxpktsrate;
	}

	/**
	* <pre>
	* Packets transmitted from this TD.
	* </pre>
	*/
	public Long get_nstdtottxpkts() throws Exception {
		return this.nstdtottxpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for nstdtottxpkts
	* </pre>
	*/
	public Long get_nstdtxpktsrate() throws Exception {
		return this.nstdtxpktsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nstrafficdomain_response result = (nstrafficdomain_response) service.get_payload_formatter().string_to_resource(nstrafficdomain_response.class, response);
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
		return result.nstrafficdomain;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.td != null) {
			return this.td.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch the statistics of all nstrafficdomain_stats resources that are configured on netscaler.
	*/
	public static nstrafficdomain_stats[] get(nitro_service service) throws Exception{
		nstrafficdomain_stats obj = new nstrafficdomain_stats();
		nstrafficdomain_stats[] response = (nstrafficdomain_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all nstrafficdomain_stats resources that are configured on netscaler.
	*/
	public static nstrafficdomain_stats[] get(nitro_service service, options option) throws Exception{
		nstrafficdomain_stats obj = new nstrafficdomain_stats();
		nstrafficdomain_stats[] response = (nstrafficdomain_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of nstrafficdomain_stats resource of given name .
	*/
	public static nstrafficdomain_stats get(nitro_service service, Long td) throws Exception{
		nstrafficdomain_stats obj = new nstrafficdomain_stats();
		obj.set_td(td);
		nstrafficdomain_stats response = (nstrafficdomain_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
