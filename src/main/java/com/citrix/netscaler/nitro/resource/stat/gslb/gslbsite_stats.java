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

package com.citrix.netscaler.nitro.resource.stat.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbsite_response extends base_response
{
	public gslbsite_stats[] gslbsite;
}
/**
* Statistics for GSLB site resource.
*/

public class gslbsite_stats extends base_resource
{
	private String sitename;
	private String clearstats;
	private String sitepublicip;
	private String siteip;
	private String sitemepstatus;
	private String persexchange;
	private String nwmetricexchange;
	private String sitemetricexchange;
	private String sitetype;
	private String siteipstr;
	private String sitepublicipstr;
	private String sitemetricmepstatus;
	private String nwmetricmepstatus;
	private Long sitetotalrequestbytes;
	private Long siterequestbytesrate;
	private Long sitetotalresponsebytes;
	private Long siteresponsebytesrate;
	private Long sitetotalrequests;
	private Long siterequestsrate;
	private Long sitetotalresponses;
	private Long siteresponsesrate;
	private Long sitecurclntconnections;
	private Long sitecursrvrconnections;

	/**
	* <pre>
	* Name of the GSLB site for which to display detailed statistics. If a name is not specified, basic information about all GSLB sites is displayed.
	* </pre>
	*/
	public void set_sitename(String sitename) throws Exception{
		this.sitename = sitename;
	}

	/**
	* <pre>
	* Name of the GSLB site for which to display detailed statistics. If a name is not specified, basic information about all GSLB sites is displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sitename() throws Exception {
		return this.sitename;
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
	* Rate (/s) counter for sitetotalresponses
	* </pre>
	*/
	public Long get_siteresponsesrate() throws Exception {
		return this.siteresponsesrate;
	}

	/**
	* <pre>
	* The private IP address of this GSLB site.
	* </pre>
	*/
	public String get_siteipstr() throws Exception {
		return this.siteipstr;
	}

	/**
	* <pre>
	* Total number of requests received by the virtual servers represented by all GSLB services associated with this GSLB site.
	* </pre>
	*/
	public Long get_sitetotalrequests() throws Exception {
		return this.sitetotalrequests;
	}

	/**
	* <pre>
	* Rate (/s) counter for sitetotalrequests
	* </pre>
	*/
	public Long get_siterequestsrate() throws Exception {
		return this.siterequestsrate;
	}

	/**
	* <pre>
	* Indicates the status of the network metric Metric Exchange connection at this GSLB site. 
	* </pre>
	*/
	public String get_nwmetricmepstatus() throws Exception {
		return this.nwmetricmepstatus;
	}

	/**
	* <pre>
	* Indicates whether metric exchange is enabled or disabled at this GSLB site.
	* </pre>
	*/
	public String get_sitemetricexchange() throws Exception {
		return this.sitemetricexchange;
	}

	/**
	* <pre>
	* The public IP address of this GSLB site.
	* </pre>
	*/
	public String get_sitepublicip() throws Exception {
		return this.sitepublicip;
	}

	/**
	* <pre>
	* Number of response bytes received by the virtual servers represented by all GSLB services associated with this GSLB site.
	* </pre>
	*/
	public Long get_sitetotalresponsebytes() throws Exception {
		return this.sitetotalresponsebytes;
	}

	/**
	* <pre>
	* Number of current connections to the real servers behind the virtual servers represented by all GSLB services associated with this GSLB site.
	* </pre>
	*/
	public Long get_sitecursrvrconnections() throws Exception {
		return this.sitecursrvrconnections;
	}

	/**
	* <pre>
	* The public IP address of this GSLB site.
	* </pre>
	*/
	public String get_sitepublicipstr() throws Exception {
		return this.sitepublicipstr;
	}

	/**
	* <pre>
	* Total number of request bytes received by the virtual servers represented by all GSLB services associated with this GSLB site.
	* </pre>
	*/
	public Long get_sitetotalrequestbytes() throws Exception {
		return this.sitetotalrequestbytes;
	}

	/**
	* <pre>
	* The private IP address of this GSLB site.
	* </pre>
	*/
	public String get_siteip() throws Exception {
		return this.siteip;
	}

	/**
	* <pre>
	* Indicates the status of the Metric Exchange Policy at this GSLB site. 
	* </pre>
	*/
	public String get_sitemepstatus() throws Exception {
		return this.sitemepstatus;
	}

	/**
	* <pre>
	* Number of current client connections to the virtual servers represented by all GSLB services associated with this GSLB site.
	* </pre>
	*/
	public Long get_sitecurclntconnections() throws Exception {
		return this.sitecurclntconnections;
	}

	/**
	* <pre>
	* Indicates whether this GSLB site is local or remote.
	* </pre>
	*/
	public String get_sitetype() throws Exception {
		return this.sitetype;
	}

	/**
	* <pre>
	* Indicates whether network metric exchange is enabled or disabled at this GSLB site.
	* </pre>
	*/
	public String get_nwmetricexchange() throws Exception {
		return this.nwmetricexchange;
	}

	/**
	* <pre>
	* Indicates whether Persistence entries exchange is enabled or disabled at this GSLB site.
	* </pre>
	*/
	public String get_persexchange() throws Exception {
		return this.persexchange;
	}

	/**
	* <pre>
	* Rate (/s) counter for sitetotalrequestbytes
	* </pre>
	*/
	public Long get_siterequestbytesrate() throws Exception {
		return this.siterequestbytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for sitetotalresponsebytes
	* </pre>
	*/
	public Long get_siteresponsebytesrate() throws Exception {
		return this.siteresponsebytesrate;
	}

	/**
	* <pre>
	* Number of responses received by the virtual servers represented by all GSLB services associated with this GSLB site.
	* </pre>
	*/
	public Long get_sitetotalresponses() throws Exception {
		return this.sitetotalresponses;
	}

	/**
	* <pre>
	* Indicates the status of the site metric Metric Exchange connection at this GSLB site. 
	* </pre>
	*/
	public String get_sitemetricmepstatus() throws Exception {
		return this.sitemetricmepstatus;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbsite_response result = (gslbsite_response) service.get_payload_formatter().string_to_resource(gslbsite_response.class, response);
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
		return result.gslbsite;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitename;
	}

	/**
	* Use this API to fetch the statistics of all gslbsite_stats resources that are configured on netscaler.
	*/
	public static gslbsite_stats[] get(nitro_service service) throws Exception{
		gslbsite_stats obj = new gslbsite_stats();
		gslbsite_stats[] response = (gslbsite_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all gslbsite_stats resources that are configured on netscaler.
	*/
	public static gslbsite_stats[] get(nitro_service service, options option) throws Exception{
		gslbsite_stats obj = new gslbsite_stats();
		gslbsite_stats[] response = (gslbsite_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of gslbsite_stats resource of given name .
	*/
	public static gslbsite_stats get(nitro_service service, String sitename) throws Exception{
		gslbsite_stats obj = new gslbsite_stats();
		obj.set_sitename(sitename);
		gslbsite_stats response = (gslbsite_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
