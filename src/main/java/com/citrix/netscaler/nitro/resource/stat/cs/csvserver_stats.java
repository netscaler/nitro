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

package com.citrix.netscaler.nitro.resource.stat.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class csvserver_response extends base_response
{
	public csvserver_stats[] csvserver;
}
/**
* Statistics for CS virtual server resource.
*/

public class csvserver_stats extends base_resource
{
	private String name;
	private Long establishedconn;
	private String primaryipaddress;
	private Integer primaryport;
	private String type;
	private String state;
	private Long tothits;
	private Long hitsrate;
	private Long totalrequests;
	private Long requestsrate;
	private Long totalresponses;
	private Long responsesrate;
	private Long totalrequestbytes;
	private Long requestbytesrate;
	private Long totalresponsebytes;
	private Long responsebytesrate;
	private Long totalpktsrecvd;
	private Long pktsrecvdrate;
	private Long totalpktssent;
	private Long pktssentrate;
	private Long curclntconnections;
	private Long cursrvrconnections;
	private Long sothreshold;
	private Long totspillovers;
	private Long labelledconn;
	private Long pushlabel;
	private Long deferredreq;
	private Long deferredreqrate;
	private Long invalidrequestresponse;
	private Long invalidrequestresponsedropped;
	private Long svrestablishedconn;

	/**
	* <pre>
	* The name of the vserver for which statistics will be displayed.  If not given statistics are shown for all cs vservers.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the vserver for which statistics will be displayed.  If not given statistics are shown for all cs vservers.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
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
	* Number of client connections in ESTABLISHED state.
	* </pre>
	*/
	public Long get_establishedconn() throws Exception {
		return this.establishedconn;
	}

	/**
	* <pre>
	* Total number of packets sent.
	* </pre>
	*/
	public Long get_totalpktssent() throws Exception {
		return this.totalpktssent;
	}

	/**
	* <pre>
	* Number of Labeled connection on this vserver
	* </pre>
	*/
	public Long get_labelledconn() throws Exception {
		return this.labelledconn;
	}

	/**
	* <pre>
	* Total vserver hits
	* </pre>
	*/
	public Long get_tothits() throws Exception {
		return this.tothits;
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
	* Spill Over Threshold set on the VServer.
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
	}

	/**
	* <pre>
	* Number of response bytes received by this service or virtual server.
	* </pre>
	*/
	public Long get_responsebytesrate() throws Exception {
		return this.responsebytesrate;
	}

	/**
	* <pre>
	* Number invalid requests/responses dropped on this vserver
	* </pre>
	*/
	public Long get_invalidrequestresponsedropped() throws Exception {
		return this.invalidrequestresponsedropped;
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
	* Total number of request bytes received on this service or virtual server.
	* </pre>
	*/
	public Long get_requestbytesrate() throws Exception {
		return this.requestbytesrate;
	}

	/**
	* <pre>
	* Protocol associated with the vserver
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Total vserver hits
	* </pre>
	*/
	public Long get_hitsrate() throws Exception {
		return this.hitsrate;
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
	* Total number of packets received by this service or virtual server.
	* </pre>
	*/
	public Long get_pktsrecvdrate() throws Exception {
		return this.pktsrecvdrate;
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
	* Number of labels for this push vserver.
	* </pre>
	*/
	public Long get_pushlabel() throws Exception {
		return this.pushlabel;
	}

	/**
	* <pre>
	* Number of responses received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_responsesrate() throws Exception {
		return this.responsesrate;
	}

	/**
	* <pre>
	* Number of deferred request on this vserver
	* </pre>
	*/
	public Long get_deferredreq() throws Exception {
		return this.deferredreq;
	}

	/**
	* <pre>
	* Number of times vserver experienced spill over.
	* </pre>
	*/
	public Long get_totspillovers() throws Exception {
		return this.totspillovers;
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
	* Number invalid requests/responses on this vserver
	* </pre>
	*/
	public Long get_invalidrequestresponse() throws Exception {
		return this.invalidrequestresponse;
	}

	/**
	* <pre>
	* Current state of the server.
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Number of deferred request on this vserver
	* </pre>
	*/
	public Long get_deferredreqrate() throws Exception {
		return this.deferredreqrate;
	}

	/**
	* <pre>
	* Total number of packets received by this service or virtual server.
	* </pre>
	*/
	public Long get_totalpktsrecvd() throws Exception {
		return this.totalpktsrecvd;
	}

	/**
	* <pre>
	* Total number of packets sent.
	* </pre>
	*/
	public Long get_pktssentrate() throws Exception {
		return this.pktssentrate;
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
	* Total number of requests received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_requestsrate() throws Exception {
		return this.requestsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		csvserver_response result = (csvserver_response) service.get_payload_formatter().string_to_resource(csvserver_response.class, response);
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
		return result.csvserver;
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
	* Use this API to fetch the statistics of all csvserver_stats resources that are configured on netscaler.
	*/
	public static csvserver_stats[] get(nitro_service service) throws Exception{
		csvserver_stats obj = new csvserver_stats();
		csvserver_stats[] response = (csvserver_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all csvserver_stats resources that are configured on netscaler.
	*/
	public static csvserver_stats[] get(nitro_service service, options option) throws Exception{
		csvserver_stats obj = new csvserver_stats();
		csvserver_stats[] response = (csvserver_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of csvserver_stats resource of given name .
	*/
	public static csvserver_stats get(nitro_service service, String name) throws Exception{
		csvserver_stats obj = new csvserver_stats();
		obj.set_name(name);
		csvserver_stats response = (csvserver_stats) obj.stat_resource(service);
		return response;
	}

}
