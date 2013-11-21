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

package com.citrix.netscaler.nitro.resource.stat.dos;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dospolicy_response extends base_response
{
	public dospolicy_stats[] dospolicy;
}
/**
* Statistics for DoS policy resource.
*/

public class dospolicy_stats extends base_resource
{
	private String name;
	private String clearstats;
	private Double doscurrentcltdetectrate;
	private String dosphysicalserviceip;
	private Integer dosphysicalserviceport;
	private Long doscurrentqueuesize;
	private Long doscurrentqueuesizerate;
	private Long dostotjssent;
	private Long dosjssentrate;
	private Long dostotjsrefused;
	private Long dosjsrefusedrate;
	private Long dostotvalidclients;
	private Long dosvalidclientsrate;
	private Long dostotjsbytessent;
	private Long dosjsbytessentrate;
	private Long dostotnongetpostrequests;
	private Long dosnongetpostrequestsrate;

	/**
	* <pre>
	* The name of the DoS protection policy whose statistics must be displayed. If a name is not provided, statistics of all the DoS protection policies are displayed.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the DoS protection policy whose statistics must be displayed. If a name is not provided, statistics of all the DoS protection policies are displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
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
	* Rate (/s) counter for dostotjsrefused
	* </pre>
	*/
	public Long get_dosjsrefusedrate() throws Exception {
		return this.dosjsrefusedrate;
	}

	/**
	* <pre>
	* IP address of the service to which this policy is bound.
	* </pre>
	*/
	public String get_dosphysicalserviceip() throws Exception {
		return this.dosphysicalserviceip;
	}

	/**
	* <pre>
	* Rate (/s) counter for dostotnongetpostrequests
	* </pre>
	*/
	public Long get_dosnongetpostrequestsrate() throws Exception {
		return this.dosnongetpostrequestsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for dostotjssent
	* </pre>
	*/
	public Long get_dosjssentrate() throws Exception {
		return this.dosjssentrate;
	}

	/**
	* <pre>
	* Port address of the service to which this policy is bound.
	* </pre>
	*/
	public Integer get_dosphysicalserviceport() throws Exception {
		return this.dosphysicalserviceport;
	}

	/**
	* <pre>
	* Rate (/s) counter for dostotjsbytessent
	* </pre>
	*/
	public Long get_dosjsbytessentrate() throws Exception {
		return this.dosjsbytessentrate;
	}

	/**
	* <pre>
	* Current ratio of JavaScript send rate to the server response rate (Client detect rate)
	* </pre>
	*/
	public Double get_doscurrentcltdetectrate() throws Exception {
		return this.doscurrentcltdetectrate;
	}

	/**
	* <pre>
	* Number of non-GET and non-POST requests for which DOS JavaScript was sent.
	* </pre>
	*/
	public Long get_dostotnongetpostrequests() throws Exception {
		return this.dostotnongetpostrequests;
	}

	/**
	* <pre>
	* Total number of valid DoS cookies received for this policy.
	* </pre>
	*/
	public Long get_dostotvalidclients() throws Exception {
		return this.dostotvalidclients;
	}

	/**
	* <pre>
	* Rate (/s) counter for dostotvalidclients
	* </pre>
	*/
	public Long get_dosvalidclientsrate() throws Exception {
		return this.dosvalidclientsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for doscurrentqueuesize
	* </pre>
	*/
	public Long get_doscurrentqueuesizerate() throws Exception {
		return this.doscurrentqueuesizerate;
	}

	/**
	* <pre>
	* Total number of DoS JavaScript bytes sent for this policy.
	* </pre>
	*/
	public Long get_dostotjsbytessent() throws Exception {
		return this.dostotjsbytessent;
	}

	/**
	* <pre>
	* Total number of DoS JavaScript transactions performed for this policy.
	* </pre>
	*/
	public Long get_dostotjssent() throws Exception {
		return this.dostotjssent;
	}

	/**
	* <pre>
	* Number of times the DoS JavaScript was not sent because the set JavaScript rate was not met for this policy.
	* </pre>
	*/
	public Long get_dostotjsrefused() throws Exception {
		return this.dostotjsrefused;
	}

	/**
	* <pre>
	* Current queue size of the server to which this policy is bound.
	* </pre>
	*/
	public Long get_doscurrentqueuesize() throws Exception {
		return this.doscurrentqueuesize;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dospolicy_response result = (dospolicy_response) service.get_payload_formatter().string_to_resource(dospolicy_response.class, response);
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
		return result.dospolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch the statistics of all dospolicy_stats resources that are configured on netscaler.
	*/
	public static dospolicy_stats[] get(nitro_service service) throws Exception{
		dospolicy_stats obj = new dospolicy_stats();
		dospolicy_stats[] response = (dospolicy_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all dospolicy_stats resources that are configured on netscaler.
	*/
	public static dospolicy_stats[] get(nitro_service service, options option) throws Exception{
		dospolicy_stats obj = new dospolicy_stats();
		dospolicy_stats[] response = (dospolicy_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of dospolicy_stats resource of given name .
	*/
	public static dospolicy_stats get(nitro_service service, String name) throws Exception{
		dospolicy_stats obj = new dospolicy_stats();
		obj.set_name(name);
		dospolicy_stats response = (dospolicy_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
