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

package com.citrix.netscaler.nitro.resource.stat.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpn_response extends base_response
{
	public vpn_stats vpn;
}

public class vpn_stats extends base_resource
{
	private Long indexhtmlhit;
	private Long indexhtmlnoserved;
	private Long cfghtmlserved;
	private Long cfghtmlservedrate;
	private Long dnsreqhit;
	private Long dnsreqhitrate;
	private Long winsrequesthit;
	private Long winsrequesthitrate;
	private Long csrequesthit;
	private Long csrequesthitrate;
	private Long csnonhttpprobehit;
	private Long csnonhttpprobehitrate;
	private Long cshttpprobehit;
	private Long cshttpprobehitrate;
	private Long totalcsconnsucc;
	private Long csconnsuccrate;
	private Long totalfsrequest;
	private Long fsrequestrate;
	private Long iipdisabledmipused;
	private Long iipdisabledmipusedrate;
	private Long iipfailedmipused;
	private Long iipfailedmipusedrate;
	private Long iipspillovermipused;
	private Long iipspillovermipusedrate;
	private Long iipdisabledmipdisabled;
	private Long iipdisabledmipdisabledrate;
	private Long iipfailedmipdisabled;
	private Long iipfailedmipdisabledrate;
	private Long socksmethreqrcvd;
	private Long socksmethreqrcvdrate;
	private Long socksmethreqsent;
	private Long socksmethreqsentrate;
	private Long socksmethresprcvd;
	private Long socksmethresprcvdrate;
	private Long socksmethrespsent;
	private Long socksmethrespsentrate;
	private Long socksconnreqrcvd;
	private Long socksconnreqrcvdrate;
	private Long socksconnreqsent;
	private Long socksconnreqsentrate;
	private Long socksconnresprcvd;
	private Long socksconnresprcvdrate;
	private Long socksconnrespsent;
	private Long socksconnrespsentrate;
	private Long socksservererror;
	private Long socksservererrorrate;
	private Long socksclienterror;
	private Long socksclienterrorrate;
	private Long staconnsuccess;
	private Long staconnsuccessrate;
	private Long staconnfailure;
	private Long staconnfailurerate;
	private Long cpsconnsuccess;
	private Long cpsconnsuccessrate;
	private Long cpsconnfailure;
	private Long cpsconnfailurerate;
	private Long starequestsent;
	private Long starequestsentrate;
	private Long staresponserecvd;
	private Long staresponserecvdrate;
	private Long icalicensefailure;
	private Long icalicensefailurerate;

	/**
	* <pre>
	* Number of STA connection failure.
	* </pre>
	*/
	public Long get_staconnfailurerate() throws Exception {
		return this.staconnfailurerate;
	}

	/**
	* <pre>
	* Number of successful probes to all back-end servers.
	* </pre>
	*/
	public Long get_totalcsconnsucc() throws Exception {
		return this.totalcsconnsucc;
	}

	/**
	* <pre>
	* Number of probes from VPN to back-end non-HTTP servers that have been accessed by the VPN client.
	* </pre>
	*/
	public Long get_csnonhttpprobehitrate() throws Exception {
		return this.csnonhttpprobehitrate;
	}

	/**
	* <pre>
	* Number of received SOCKS method request.
	* </pre>
	*/
	public Long get_socksmethreqrcvd() throws Exception {
		return this.socksmethreqrcvd;
	}

	/**
	* <pre>
	* Number of times MIP is used on IIP Spillover.
	* </pre>
	*/
	public Long get_iipspillovermipusedrate() throws Exception {
		return this.iipspillovermipusedrate;
	}

	/**
	* <pre>
	* Number of times IIP assignment failed and MIP is disabled.
	* </pre>
	*/
	public Long get_iipfailedmipdisabled() throws Exception {
		return this.iipfailedmipdisabled;
	}

	/**
	* <pre>
	* Number of probes from VPN to back-end HTTP servers that have been accessed by the VPN client.
	* </pre>
	*/
	public Long get_cshttpprobehitrate() throws Exception {
		return this.cshttpprobehitrate;
	}

	/**
	* <pre>
	* Number of sent SOCKS connect response.
	* </pre>
	*/
	public Long get_socksconnrespsentrate() throws Exception {
		return this.socksconnrespsentrate;
	}

	/**
	* <pre>
	* Number of STA request sent.
	* </pre>
	*/
	public Long get_starequestsent() throws Exception {
		return this.starequestsent;
	}

	/**
	* <pre>
	* Number of SOCKS server error.
	* </pre>
	*/
	public Long get_socksservererrorrate() throws Exception {
		return this.socksservererrorrate;
	}

	/**
	* <pre>
	* Number of WINS queries resolved by VPN server.
	* </pre>
	*/
	public Long get_winsrequesthitrate() throws Exception {
		return this.winsrequesthitrate;
	}

	/**
	* <pre>
	* Number of SOCKS server error.
	* </pre>
	*/
	public Long get_socksservererror() throws Exception {
		return this.socksservererror;
	}

	/**
	* <pre>
	* Number of received SOCKS method response.
	* </pre>
	*/
	public Long get_socksmethresprcvdrate() throws Exception {
		return this.socksmethresprcvdrate;
	}

	/**
	* <pre>
	* Number of received SOCKS connect request.
	* </pre>
	*/
	public Long get_socksconnreqrcvd() throws Exception {
		return this.socksconnreqrcvd;
	}

	/**
	* <pre>
	* Number of file system requests received by VPN server.
	* </pre>
	*/
	public Long get_totalfsrequest() throws Exception {
		return this.totalfsrequest;
	}

	/**
	* <pre>
	* Number of received SOCKS method request.
	* </pre>
	*/
	public Long get_socksmethreqrcvdrate() throws Exception {
		return this.socksmethreqrcvdrate;
	}

	/**
	* <pre>
	* Number of sent SOCKS method request.
	* </pre>
	*/
	public Long get_socksmethreqsentrate() throws Exception {
		return this.socksmethreqsentrate;
	}

	/**
	* <pre>
	* Number of CPS connection failure.
	* </pre>
	*/
	public Long get_cpsconnfailurerate() throws Exception {
		return this.cpsconnfailurerate;
	}

	/**
	* <pre>
	* Both IIP and MIP is disabled.
	* </pre>
	*/
	public Long get_iipdisabledmipdisabled() throws Exception {
		return this.iipdisabledmipdisabled;
	}

	/**
	* <pre>
	* Number of probes from VPN to back-end HTTP servers that have been accessed by the VPN client.
	* </pre>
	*/
	public Long get_cshttpprobehit() throws Exception {
		return this.cshttpprobehit;
	}

	/**
	* <pre>
	* Number of times MIP is used on IIP Spillover.
	* </pre>
	*/
	public Long get_iipspillovermipused() throws Exception {
		return this.iipspillovermipused;
	}

	/**
	* <pre>
	* Number of CPS connection success.
	* </pre>
	*/
	public Long get_cpsconnsuccess() throws Exception {
		return this.cpsconnsuccess;
	}

	/**
	* <pre>
	* Number of times MIP is used as IIP is disabled.
	* </pre>
	*/
	public Long get_iipdisabledmipusedrate() throws Exception {
		return this.iipdisabledmipusedrate;
	}

	/**
	* <pre>
	* Number of sent SOCKS method response.
	* </pre>
	*/
	public Long get_socksmethrespsentrate() throws Exception {
		return this.socksmethrespsentrate;
	}

	/**
	* <pre>
	* Number of sent SOCKS method request.
	* </pre>
	*/
	public Long get_socksmethreqsent() throws Exception {
		return this.socksmethreqsent;
	}

	/**
	* <pre>
	* Number of ICA license failure.
	* </pre>
	*/
	public Long get_icalicensefailurerate() throws Exception {
		return this.icalicensefailurerate;
	}

	/**
	* <pre>
	* Number of STA connection failure.
	* </pre>
	*/
	public Long get_staconnfailure() throws Exception {
		return this.staconnfailure;
	}

	/**
	* <pre>
	* Number of received SOCKS connect request.
	* </pre>
	*/
	public Long get_socksconnreqrcvdrate() throws Exception {
		return this.socksconnreqrcvdrate;
	}

	/**
	* <pre>
	* Number of SOCKS client error.
	* </pre>
	*/
	public Long get_socksclienterrorrate() throws Exception {
		return this.socksclienterrorrate;
	}

	/**
	* <pre>
	* Number of SSL VPN tunnels formed between VPN server and client.
	* </pre>
	*/
	public Long get_csrequesthit() throws Exception {
		return this.csrequesthit;
	}

	/**
	* <pre>
	* Number of WINS queries resolved by VPN server.
	* </pre>
	*/
	public Long get_winsrequesthit() throws Exception {
		return this.winsrequesthit;
	}

	/**
	* <pre>
	* Number of DNS queries resolved by VPN server.
	* </pre>
	*/
	public Long get_dnsreqhitrate() throws Exception {
		return this.dnsreqhitrate;
	}

	/**
	* <pre>
	* Number of received SOCKS connect response.
	* </pre>
	*/
	public Long get_socksconnresprcvd() throws Exception {
		return this.socksconnresprcvd;
	}

	/**
	* <pre>
	* Number of sent SOCKS method response.
	* </pre>
	*/
	public Long get_socksmethrespsent() throws Exception {
		return this.socksmethrespsent;
	}

	/**
	* <pre>
	* Number of successful probes to all back-end servers.
	* </pre>
	*/
	public Long get_csconnsuccrate() throws Exception {
		return this.csconnsuccrate;
	}

	/**
	* <pre>
	* Number of sent SOCKS connect request.
	* </pre>
	*/
	public Long get_socksconnreqsent() throws Exception {
		return this.socksconnreqsent;
	}

	/**
	* <pre>
	* Number of DNS queries resolved by VPN server.
	* </pre>
	*/
	public Long get_dnsreqhit() throws Exception {
		return this.dnsreqhit;
	}

	/**
	* <pre>
	* Number of STA connection success.
	* </pre>
	*/
	public Long get_staconnsuccessrate() throws Exception {
		return this.staconnsuccessrate;
	}

	/**
	* <pre>
	* Number of times MIP is used as IIP assignment failed.
	* </pre>
	*/
	public Long get_iipfailedmipusedrate() throws Exception {
		return this.iipfailedmipusedrate;
	}

	/**
	* <pre>
	* Number of STA connection success.
	* </pre>
	*/
	public Long get_staconnsuccess() throws Exception {
		return this.staconnsuccess;
	}

	/**
	* <pre>
	* Number of client configuration requests received by VPN server.
	* </pre>
	*/
	public Long get_cfghtmlservedrate() throws Exception {
		return this.cfghtmlservedrate;
	}

	/**
	* <pre>
	* Number of STA response received.
	* </pre>
	*/
	public Long get_staresponserecvdrate() throws Exception {
		return this.staresponserecvdrate;
	}

	/**
	* <pre>
	* Number of CPS connection failure.
	* </pre>
	*/
	public Long get_cpsconnfailure() throws Exception {
		return this.cpsconnfailure;
	}

	/**
	* <pre>
	* Number of SSL VPN tunnels formed between VPN server and client.
	* </pre>
	*/
	public Long get_csrequesthitrate() throws Exception {
		return this.csrequesthitrate;
	}

	/**
	* <pre>
	* Number of probes from VPN to back-end non-HTTP servers that have been accessed by the VPN client.
	* </pre>
	*/
	public Long get_csnonhttpprobehit() throws Exception {
		return this.csnonhttpprobehit;
	}

	/**
	* <pre>
	* Number of times IIP assignment failed and MIP is disabled.
	* </pre>
	*/
	public Long get_iipfailedmipdisabledrate() throws Exception {
		return this.iipfailedmipdisabledrate;
	}

	/**
	* <pre>
	* Number of CPS connection success.
	* </pre>
	*/
	public Long get_cpsconnsuccessrate() throws Exception {
		return this.cpsconnsuccessrate;
	}

	/**
	* <pre>
	* Number of received SOCKS connect response.
	* </pre>
	*/
	public Long get_socksconnresprcvdrate() throws Exception {
		return this.socksconnresprcvdrate;
	}

	/**
	* <pre>
	* Number of failures to display VPN login page.
	* </pre>
	*/
	public Long get_indexhtmlnoserved() throws Exception {
		return this.indexhtmlnoserved;
	}

	/**
	* <pre>
	* Number of file system requests received by VPN server.
	* </pre>
	*/
	public Long get_fsrequestrate() throws Exception {
		return this.fsrequestrate;
	}

	/**
	* <pre>
	* Number of requests for VPN login page.
	* </pre>
	*/
	public Long get_indexhtmlhit() throws Exception {
		return this.indexhtmlhit;
	}

	/**
	* <pre>
	* Number of client configuration requests received by VPN server.
	* </pre>
	*/
	public Long get_cfghtmlserved() throws Exception {
		return this.cfghtmlserved;
	}

	/**
	* <pre>
	* Number of ICA license failure.
	* </pre>
	*/
	public Long get_icalicensefailure() throws Exception {
		return this.icalicensefailure;
	}

	/**
	* <pre>
	* Number of STA response received.
	* </pre>
	*/
	public Long get_staresponserecvd() throws Exception {
		return this.staresponserecvd;
	}

	/**
	* <pre>
	* Number of SOCKS client error.
	* </pre>
	*/
	public Long get_socksclienterror() throws Exception {
		return this.socksclienterror;
	}

	/**
	* <pre>
	* Both IIP and MIP is disabled.
	* </pre>
	*/
	public Long get_iipdisabledmipdisabledrate() throws Exception {
		return this.iipdisabledmipdisabledrate;
	}

	/**
	* <pre>
	* Number of sent SOCKS connect response.
	* </pre>
	*/
	public Long get_socksconnrespsent() throws Exception {
		return this.socksconnrespsent;
	}

	/**
	* <pre>
	* Number of received SOCKS method response.
	* </pre>
	*/
	public Long get_socksmethresprcvd() throws Exception {
		return this.socksmethresprcvd;
	}

	/**
	* <pre>
	* Number of times MIP is used as IIP is disabled.
	* </pre>
	*/
	public Long get_iipdisabledmipused() throws Exception {
		return this.iipdisabledmipused;
	}

	/**
	* <pre>
	* Number of times MIP is used as IIP assignment failed.
	* </pre>
	*/
	public Long get_iipfailedmipused() throws Exception {
		return this.iipfailedmipused;
	}

	/**
	* <pre>
	* Number of sent SOCKS connect request.
	* </pre>
	*/
	public Long get_socksconnreqsentrate() throws Exception {
		return this.socksconnreqsentrate;
	}

	/**
	* <pre>
	* Number of STA request sent.
	* </pre>
	*/
	public Long get_starequestsentrate() throws Exception {
		return this.starequestsentrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		vpn_stats[] resources = new vpn_stats[1];
		vpn_response result = (vpn_response) service.get_payload_formatter().string_to_resource(vpn_response.class, response);
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
		resources[0] = result.vpn;
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
	* Use this API to fetch the statistics of all vpn_stats resources that are configured on netscaler.
	*/
	public static vpn_stats get(nitro_service service) throws Exception{
		vpn_stats obj = new vpn_stats();
		vpn_stats[] response = (vpn_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all vpn_stats resources that are configured on netscaler.
	*/
	public static vpn_stats get(nitro_service service,  options option) throws Exception{
		vpn_stats obj = new vpn_stats();
		vpn_stats[] response = (vpn_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
