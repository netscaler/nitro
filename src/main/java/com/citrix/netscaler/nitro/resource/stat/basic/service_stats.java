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

package com.citrix.netscaler.nitro.resource.stat.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class service_response extends base_response
{
	public service_stats[] service;
}
/**
* Statistics for service resource.
*/

public class service_stats extends base_resource
{
	private String name;
	private String clearstats;
	private Long throughput;
	private Long throughputrate;
	private Long avgsvrttfb;
	private String primaryipaddress;
	private Integer primaryport;
	private String servicetype;
	private String state;
	private Long totalrequests;
	private Long requestsrate;
	private Long totalresponses;
	private Long responsesrate;
	private Long totalrequestbytes;
	private Long requestbytesrate;
	private Long totalresponsebytes;
	private Long responsebytesrate;
	private Long curclntconnections;
	private Long surgecount;
	private Long cursrvrconnections;
	private Long svrestablishedconn;
	private Long curreusepool;
	private Long maxclients;
	private Long curload;
	private Long curtflags;
	private Long vsvrservicehits;
	private Long vsvrservicehitsrate;
	private Long activetransactions;

	/**
	* <pre>
	* Name of the service.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the service.<br> Minimum length =  1
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
	* Number of server connections in ESTABLISHED state.
	* </pre>
	*/
	public Long get_svrestablishedconn() throws Exception {
		return this.svrestablishedconn;
	}

	/**
	* <pre>
	* Number of current client connections.
	* </pre>
	*/
	public Long get_curclntconnections() throws Exception {
		return this.curclntconnections;
	}

	/**
	* <pre>
	* The service type of this service.Possible values are ADNS, DNS, MYSQL, RTSP, SSL_DIAMETER, ADNS_TCP, DNS_TCP, NNTP, SIP_UDP, SSL_TCP, ANY, FTP, RADIUS, SNMP, TCP, DHCPRA, HTTP, RDP, SSL, TFTP, DIAMETER, MSSQL, RPCSVR, SSL_BRIDGE, UDP
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* Total number of requests received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_totalrequests() throws Exception {
		return this.totalrequests;
	}

	/**
	* <pre>
	* Number of requests in the surge queue.
	* </pre>
	*/
	public Long get_surgecount() throws Exception {
		return this.surgecount;
	}

	/**
	* <pre>
	* Rate (/s) counter for totalresponsebytes
	* </pre>
	*/
	public Long get_responsebytesrate() throws Exception {
		return this.responsebytesrate;
	}

	/**
	* <pre>
	* Number of responses received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_totalresponses() throws Exception {
		return this.totalresponses;
	}

	/**
	* <pre>
	* Rate (/s) counter for totalrequestbytes
	* </pre>
	*/
	public Long get_requestbytesrate() throws Exception {
		return this.requestbytesrate;
	}

	/**
	* <pre>
	* Number of bytes received or sent by this service (Mbps).
	* </pre>
	*/
	public Long get_throughput() throws Exception {
		return this.throughput;
	}

	/**
	* <pre>
	* Rate (/s) counter for throughput
	* </pre>
	*/
	public Long get_throughputrate() throws Exception {
		return this.throughputrate;
	}

	/**
	* <pre>
	* Current flags on the service for internal use in display handlers.
	* </pre>
	*/
	public Long get_curtflags() throws Exception {
		return this.curtflags;
	}

	/**
	* <pre>
	* Number of current connections to the actual servers behind the virtual server.
	* </pre>
	*/
	public Long get_cursrvrconnections() throws Exception {
		return this.cursrvrconnections;
	}

	/**
	* <pre>
	* The IP address on which the service is running.
	* </pre>
	*/
	public String get_primaryipaddress() throws Exception {
		return this.primaryipaddress;
	}

	/**
	* <pre>
	* Number of active transactions handled by this service. (Including those in the surge queue.)
    Active Transaction means number of transactions currently served by the server including those waiting in the SurgeQ
	* </pre>
	*/
	public Long get_activetransactions() throws Exception {
		return this.activetransactions;
	}

	/**
	* <pre>
	* Rate (/s) counter for totalresponses
	* </pre>
	*/
	public Long get_responsesrate() throws Exception {
		return this.responsesrate;
	}

	/**
	* <pre>
	* Maximum open connections allowed on this service.
	* </pre>
	*/
	public Long get_maxclients() throws Exception {
		return this.maxclients;
	}

	/**
	* <pre>
	* Average TTFB between the NetScaler appliance and the server.TTFB is the time interval between sending the request packet to a service and receiving the first response from the service
	* </pre>
	*/
	public Long get_avgsvrttfb() throws Exception {
		return this.avgsvrttfb;
	}

	/**
	* <pre>
	* Load on the service that is calculated from the bound load based monitor.
	* </pre>
	*/
	public Long get_curload() throws Exception {
		return this.curload;
	}

	/**
	* <pre>
	* Total number of request bytes received on this service or virtual server.
	* </pre>
	*/
	public Long get_totalrequestbytes() throws Exception {
		return this.totalrequestbytes;
	}

	/**
	* <pre>
	* Number of requests in the idle queue/reuse pool.
	* </pre>
	*/
	public Long get_curreusepool() throws Exception {
		return this.curreusepool;
	}

	/**
	* <pre>
	* Current state of the server. Possible values are UP, DOWN, UNKNOWN, OFS(Out of Service), TROFS(Transition Out of Service), TROFS_DOWN(Down When going Out of Service)
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Number of times that the service has been provided.
	* </pre>
	*/
	public Long get_vsvrservicehits() throws Exception {
		return this.vsvrservicehits;
	}

	/**
	* <pre>
	* Number of response bytes received by this service or virtual server.
	* </pre>
	*/
	public Long get_totalresponsebytes() throws Exception {
		return this.totalresponsebytes;
	}

	/**
	* <pre>
	* The port on which the service is running.
	* </pre>
	*/
	public Integer get_primaryport() throws Exception {
		return this.primaryport;
	}

	/**
	* <pre>
	* Rate (/s) counter for totalrequests
	* </pre>
	*/
	public Long get_requestsrate() throws Exception {
		return this.requestsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for vsvrservicehits
	* </pre>
	*/
	public Long get_vsvrservicehitsrate() throws Exception {
		return this.vsvrservicehitsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		service_response result = (service_response) service.get_payload_formatter().string_to_resource(service_response.class, response);
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
		return result.service;
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
	* Use this API to fetch the statistics of all service_stats resources that are configured on netscaler.
	*/
	public static service_stats[] get(nitro_service service) throws Exception{
		service_stats obj = new service_stats();
		service_stats[] response = (service_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all service_stats resources that are configured on netscaler.
	*/
	public static service_stats[] get(nitro_service service, options option) throws Exception{
		service_stats obj = new service_stats();
		service_stats[] response = (service_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of service_stats resource of given name .
	*/
	public static service_stats get(nitro_service service, String name) throws Exception{
		service_stats obj = new service_stats();
		obj.set_name(name);
		service_stats response = (service_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
