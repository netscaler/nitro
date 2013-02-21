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

package com.citrix.netscaler.nitro.resource.stat.sc;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sc_response extends base_response
{
	public sc_stats sc;
}

public class sc_stats extends base_resource
{
	private Long sctotcondtriggered;
	private Long sccondtriggeredrate;
	private Long scthresholdfail;
	private Long scpolicyurlhits;
	private Long scpolicyurlhitsrate;
	private Long scpopups;
	private Long scpopupsrate;
	private Long sctotreissuedrequests;
	private Long screissuedrequestsrate;
	private Long scsessionreqs;
	private Long scsessionreqsrate;
	private Long scaltconturls;
	private Long scaltconturlsrate;
	private Long scpostreqs;
	private Long scpostreqsrate;
	private Long scresetstats;
	private Long scresetstatsrate;
	private Long scunsupbrow;
	private Long scunsupbrowrate;
	private Long scfaultycookies;
	private Long scfaultycookiesrate;

	/**
	* <pre>
	* Total number of in-memory java script  served which throws the pop-up window.
	* </pre>
	*/
	public Long get_scpopups() throws Exception {
		return this.scpopups;
	}

	/**
	* <pre>
	* Total number of corrupted SureConnect cookies.
	* </pre>
	*/
	public Long get_scfaultycookiesrate() throws Exception {
		return this.scfaultycookiesrate;
	}

	/**
	* <pre>
	* Total number of times SureConnect was not triggered because the thresholds conditions failed.
	* </pre>
	*/
	public Long get_scthresholdfail() throws Exception {
		return this.scthresholdfail;
	}

	/**
	* <pre>
	* Total number of reissued SureConnect requests.
	* </pre>
	*/
	public Long get_screissuedrequestsrate() throws Exception {
		return this.screissuedrequestsrate;
	}

	/**
	* <pre>
	* Total number of   HTTP POST requests that triggered SureConnect feature.
	* </pre>
	*/
	public Long get_scpostreqs() throws Exception {
		return this.scpostreqs;
	}

	/**
	* <pre>
	* Total number of alternate content served which throws the pop-up window.
	* </pre>
	*/
	public Long get_scaltconturls() throws Exception {
		return this.scaltconturls;
	}

	/**
	* <pre>
	* Toal number of times that SureConnect statistics were reset.
	* </pre>
	*/
	public Long get_scresetstatsrate() throws Exception {
		return this.scresetstatsrate;
	}

	/**
	* <pre>
	* Total number of in-memory java script  served which throws the pop-up window.
	* </pre>
	*/
	public Long get_scpopupsrate() throws Exception {
		return this.scpopupsrate;
	}

	/**
	* <pre>
	* Total number of reissued SureConnect requests.
	* </pre>
	*/
	public Long get_sctotreissuedrequests() throws Exception {
		return this.sctotreissuedrequests;
	}

	/**
	* <pre>
	* Total number of incoming requests that matched configured sureconnect policies.
	* </pre>
	*/
	public Long get_scpolicyurlhitsrate() throws Exception {
		return this.scpolicyurlhitsrate;
	}

	/**
	* <pre>
	* Total number of requests that came from all unsupported browsers.
	* </pre>
	*/
	public Long get_scunsupbrow() throws Exception {
		return this.scunsupbrow;
	}

	/**
	* <pre>
	* Number of times that SureConnect conditions were triggered.
	* </pre>
	*/
	public Long get_sccondtriggeredrate() throws Exception {
		return this.sccondtriggeredrate;
	}

	/**
	* <pre>
	* Total number of incoming requests that matched configured sureconnect policies.
	* </pre>
	*/
	public Long get_scpolicyurlhits() throws Exception {
		return this.scpolicyurlhits;
	}

	/**
	* <pre>
	* Total number of requests that were  handled in a single SureConnect session.
	* </pre>
	*/
	public Long get_scsessionreqsrate() throws Exception {
		return this.scsessionreqsrate;
	}

	/**
	* <pre>
	* Toal number of times that SureConnect statistics were reset.
	* </pre>
	*/
	public Long get_scresetstats() throws Exception {
		return this.scresetstats;
	}

	/**
	* <pre>
	* Number of times that SureConnect conditions were triggered.
	* </pre>
	*/
	public Long get_sctotcondtriggered() throws Exception {
		return this.sctotcondtriggered;
	}

	/**
	* <pre>
	* Total number of corrupted SureConnect cookies.
	* </pre>
	*/
	public Long get_scfaultycookies() throws Exception {
		return this.scfaultycookies;
	}

	/**
	* <pre>
	* Total number of requests that were  handled in a single SureConnect session.
	* </pre>
	*/
	public Long get_scsessionreqs() throws Exception {
		return this.scsessionreqs;
	}

	/**
	* <pre>
	* Total number of alternate content served which throws the pop-up window.
	* </pre>
	*/
	public Long get_scaltconturlsrate() throws Exception {
		return this.scaltconturlsrate;
	}

	/**
	* <pre>
	* Total number of requests that came from all unsupported browsers.
	* </pre>
	*/
	public Long get_scunsupbrowrate() throws Exception {
		return this.scunsupbrowrate;
	}

	/**
	* <pre>
	* Total number of   HTTP POST requests that triggered SureConnect feature.
	* </pre>
	*/
	public Long get_scpostreqsrate() throws Exception {
		return this.scpostreqsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sc_stats[] resources = new sc_stats[1];
		sc_response result = (sc_response) service.get_payload_formatter().string_to_resource(sc_response.class, response);
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
		resources[0] = result.sc;
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
	* Use this API to fetch the statistics of all sc_stats resources that are configured on netscaler.
	*/
	public static sc_stats get(nitro_service service) throws Exception{
		sc_stats obj = new sc_stats();
		sc_stats[] response = (sc_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all sc_stats resources that are configured on netscaler.
	*/
	public static sc_stats get(nitro_service service,  options option) throws Exception{
		sc_stats obj = new sc_stats();
		sc_stats[] response = (sc_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
