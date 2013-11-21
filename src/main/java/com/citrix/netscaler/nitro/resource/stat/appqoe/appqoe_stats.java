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

package com.citrix.netscaler.nitro.resource.stat.appqoe;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appqoe_response extends base_response
{
	public appqoe_stats appqoe;
}

public class appqoe_stats extends base_resource
{
	private String clearstats;
	private Long totinmemrsp;
	private Long inmemrsprate;
	private Long totfaultycookies;
	private Long faultycookiesrate;
	private Long totvalidcookies;
	private Long validcookiesrate;
	private Long tothighprireq;
	private Long highprireqrate;
	private Long totmediumprireq;
	private Long mediumprireqrate;
	private Long totlowprireq;
	private Long lowprireqrate;
	private Long totlowestprireq;
	private Long lowestprireqrate;
	private Long totaltsvrsubfailed;
	private Long tsvrsubfailedrate;
	private Long totdostrig;
	private Long dostrigrate;
	private Long totdosqvalidcookies;
	private Long dosqvalidcookiesrate;
	private Long totdoshvalidcookies;
	private Long doshvalidcookiesrate;
	private Long totsidvalidcookies;
	private Long sidvalidcookiesrate;
	private Long totonhvalidcookies;
	private Long onhvalidcookiesrate;
	private Long totpriqvalidcookies;
	private Long priqvalidcookiesrate;
	private Long totdosqfaultycookies;
	private Long dosqfaultycookiesrate;
	private Long totdoshfaultycookies;
	private Long doshfaultycookiesrate;
	private Long totsidfaultycookies;
	private Long sidfaultycookiesrate;
	private Long totonhfaultycookies;
	private Long onhfaultycookiesrate;
	private Long totpriqfaultycookies;
	private Long priqfaultycookiesrate;
	private Long totpriembedlinks;
	private Long priembedlinksrate;
	private Long totsessreq;
	private Long sessreqrate;
	private Long totaltcntreq;
	private Long tcntreqrate;
	private Long totgetinmemrsp;
	private Long getinmemrsprate;
	private Long totpostinmemrsp;
	private Long postinmemrsprate;
	private Long totpostinmemrspbytes;
	private Long postinmemrspbytesrate;

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
	* Total PRIQ valid cookies received
	* </pre>
	*/
	public Long get_totpriqvalidcookies() throws Exception {
		return this.totpriqvalidcookies;
	}

	/**
	* <pre>
	* Total ONH valid cookies received
	* </pre>
	*/
	public Long get_totonhvalidcookies() throws Exception {
		return this.totonhvalidcookies;
	}

	/**
	* <pre>
	* Rate (/s) counter for totdosqvalidcookies
	* </pre>
	*/
	public Long get_dosqvalidcookiesrate() throws Exception {
		return this.dosqvalidcookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totsidvalidcookies
	* </pre>
	*/
	public Long get_sidvalidcookiesrate() throws Exception {
		return this.sidvalidcookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totonhvalidcookies
	* </pre>
	*/
	public Long get_onhvalidcookiesrate() throws Exception {
		return this.onhvalidcookiesrate;
	}

	/**
	* <pre>
	* Total DOSQ valid cookies received
	* </pre>
	*/
	public Long get_totdosqvalidcookies() throws Exception {
		return this.totdosqvalidcookies;
	}

	/**
	* <pre>
	* Rate (/s) counter for totdostrig
	* </pre>
	*/
	public Long get_dostrigrate() throws Exception {
		return this.dostrigrate;
	}

	/**
	* <pre>
	* Total in-memory GET responses sent from NS
	* </pre>
	*/
	public Long get_totgetinmemrsp() throws Exception {
		return this.totgetinmemrsp;
	}

	/**
	* <pre>
	* Total Requests served from low priority queue
	* </pre>
	*/
	public Long get_totlowprireq() throws Exception {
		return this.totlowprireq;
	}

	/**
	* <pre>
	* Total DOSH faulty cookies received
	* </pre>
	*/
	public Long get_totdoshfaultycookies() throws Exception {
		return this.totdoshfaultycookies;
	}

	/**
	* <pre>
	* Rate (/s) counter for totdoshfaultycookies
	* </pre>
	*/
	public Long get_doshfaultycookiesrate() throws Exception {
		return this.doshfaultycookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totsessreq
	* </pre>
	*/
	public Long get_sessreqrate() throws Exception {
		return this.sessreqrate;
	}

	/**
	* <pre>
	* Total in-memory response bytes sent from NS
	* </pre>
	*/
	public Long get_totpostinmemrspbytes() throws Exception {
		return this.totpostinmemrspbytes;
	}

	/**
	* <pre>
	* Total PRIQ faulty cookies received
	* </pre>
	*/
	public Long get_totpriqfaultycookies() throws Exception {
		return this.totpriqfaultycookies;
	}

	/**
	* <pre>
	* Total in-memory POST responses sent from NS
	* </pre>
	*/
	public Long get_totpostinmemrsp() throws Exception {
		return this.totpostinmemrsp;
	}

	/**
	* <pre>
	* Rate (/s) counter for totpriembedlinks
	* </pre>
	*/
	public Long get_priembedlinksrate() throws Exception {
		return this.priembedlinksrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totmediumprireq
	* </pre>
	*/
	public Long get_mediumprireqrate() throws Exception {
		return this.mediumprireqrate;
	}

	/**
	* <pre>
	* Total number of times HDOS condition triggered
	* </pre>
	*/
	public Long get_totdostrig() throws Exception {
		return this.totdostrig;
	}

	/**
	* <pre>
	* Total valid cookies received
	* </pre>
	*/
	public Long get_totvalidcookies() throws Exception {
		return this.totvalidcookies;
	}

	/**
	* <pre>
	* Total in-memory responses sent from NS
	* </pre>
	*/
	public Long get_totinmemrsp() throws Exception {
		return this.totinmemrsp;
	}

	/**
	* <pre>
	* Total SID faulty cookies received
	* </pre>
	*/
	public Long get_totsidfaultycookies() throws Exception {
		return this.totsidfaultycookies;
	}

	/**
	* <pre>
	* Total SID valid cookies received
	* </pre>
	*/
	public Long get_totsidvalidcookies() throws Exception {
		return this.totsidvalidcookies;
	}

	/**
	* <pre>
	* Total DOSQ faulty cookies received
	* </pre>
	*/
	public Long get_totdosqfaultycookies() throws Exception {
		return this.totdosqfaultycookies;
	}

	/**
	* <pre>
	* Rate (/s) counter for totaltsvrsubfailed
	* </pre>
	*/
	public Long get_tsvrsubfailedrate() throws Exception {
		return this.tsvrsubfailedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totpostinmemrsp
	* </pre>
	*/
	public Long get_postinmemrsprate() throws Exception {
		return this.postinmemrsprate;
	}

	/**
	* <pre>
	* Total requests for valid embedded links
	* </pre>
	*/
	public Long get_totpriembedlinks() throws Exception {
		return this.totpriembedlinks;
	}

	/**
	* <pre>
	* Total Requests served from medium priority queue
	* </pre>
	*/
	public Long get_totmediumprireq() throws Exception {
		return this.totmediumprireq;
	}

	/**
	* <pre>
	* Rate (/s) counter for totpriqvalidcookies
	* </pre>
	*/
	public Long get_priqvalidcookiesrate() throws Exception {
		return this.priqvalidcookiesrate;
	}

	/**
	* <pre>
	* Total faulty cookies received
	* </pre>
	*/
	public Long get_totfaultycookies() throws Exception {
		return this.totfaultycookies;
	}

	/**
	* <pre>
	* Rate (/s) counter for totdoshvalidcookies
	* </pre>
	*/
	public Long get_doshvalidcookiesrate() throws Exception {
		return this.doshvalidcookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totsidfaultycookies
	* </pre>
	*/
	public Long get_sidfaultycookiesrate() throws Exception {
		return this.sidfaultycookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tothighprireq
	* </pre>
	*/
	public Long get_highprireqrate() throws Exception {
		return this.highprireqrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totdosqfaultycookies
	* </pre>
	*/
	public Long get_dosqfaultycookiesrate() throws Exception {
		return this.dosqfaultycookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totinmemrsp
	* </pre>
	*/
	public Long get_inmemrsprate() throws Exception {
		return this.inmemrsprate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totgetinmemrsp
	* </pre>
	*/
	public Long get_getinmemrsprate() throws Exception {
		return this.getinmemrsprate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totonhfaultycookies
	* </pre>
	*/
	public Long get_onhfaultycookiesrate() throws Exception {
		return this.onhfaultycookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totvalidcookies
	* </pre>
	*/
	public Long get_validcookiesrate() throws Exception {
		return this.validcookiesrate;
	}

	/**
	* <pre>
	* Total requests for alternate contents
	* </pre>
	*/
	public Long get_totaltcntreq() throws Exception {
		return this.totaltcntreq;
	}

	/**
	* <pre>
	* Total valid SIDQ requests within session
	* </pre>
	*/
	public Long get_totsessreq() throws Exception {
		return this.totsessreq;
	}

	/**
	* <pre>
	* Rate (/s) counter for totpriqfaultycookies
	* </pre>
	*/
	public Long get_priqfaultycookiesrate() throws Exception {
		return this.priqfaultycookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totaltcntreq
	* </pre>
	*/
	public Long get_tcntreqrate() throws Exception {
		return this.tcntreqrate;
	}

	/**
	* <pre>
	* Total DOSH valid cookies received
	* </pre>
	*/
	public Long get_totdoshvalidcookies() throws Exception {
		return this.totdoshvalidcookies;
	}

	/**
	* <pre>
	* Rate (/s) counter for totlowprireq
	* </pre>
	*/
	public Long get_lowprireqrate() throws Exception {
		return this.lowprireqrate;
	}

	/**
	* <pre>
	* Total Requests served from higher priority queue
	* </pre>
	*/
	public Long get_tothighprireq() throws Exception {
		return this.tothighprireq;
	}

	/**
	* <pre>
	* Total number of times alternate server substitution failed
	* </pre>
	*/
	public Long get_totaltsvrsubfailed() throws Exception {
		return this.totaltsvrsubfailed;
	}

	/**
	* <pre>
	* Total Requests served from surge priority queue
	* </pre>
	*/
	public Long get_totlowestprireq() throws Exception {
		return this.totlowestprireq;
	}

	/**
	* <pre>
	* Rate (/s) counter for totlowestprireq
	* </pre>
	*/
	public Long get_lowestprireqrate() throws Exception {
		return this.lowestprireqrate;
	}

	/**
	* <pre>
	* Total ONH faulty cookies received
	* </pre>
	*/
	public Long get_totonhfaultycookies() throws Exception {
		return this.totonhfaultycookies;
	}

	/**
	* <pre>
	* Rate (/s) counter for totfaultycookies
	* </pre>
	*/
	public Long get_faultycookiesrate() throws Exception {
		return this.faultycookiesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totpostinmemrspbytes
	* </pre>
	*/
	public Long get_postinmemrspbytesrate() throws Exception {
		return this.postinmemrspbytesrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		appqoe_stats[] resources = new appqoe_stats[1];
		appqoe_response result = (appqoe_response) service.get_payload_formatter().string_to_resource(appqoe_response.class, response);
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
		resources[0] = result.appqoe;
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
	* Use this API to fetch the statistics of all appqoe_stats resources that are configured on netscaler.
	*/
	public static appqoe_stats get(nitro_service service) throws Exception{
		appqoe_stats obj = new appqoe_stats();
		appqoe_stats[] response = (appqoe_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all appqoe_stats resources that are configured on netscaler.
	*/
	public static appqoe_stats get(nitro_service service,  options option) throws Exception{
		appqoe_stats obj = new appqoe_stats();
		appqoe_stats[] response = (appqoe_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
