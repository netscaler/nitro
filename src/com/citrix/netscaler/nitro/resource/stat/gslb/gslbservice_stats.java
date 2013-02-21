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

class gslbservice_response extends base_response
{
	public gslbservice_stats[] gslbservice;
}
/**
* Statistics for GSLB service resource.
*/

public class gslbservice_stats extends base_resource
{
	private String servicename;
	private Long establishedconn;
	private String primaryipaddress;
	private Integer primaryport;
	private String servicetype;
	private String state;
	private Long totalrequestbytes;
	private Long requestbytesrate;
	private Long totalresponsebytes;
	private Long responsebytesrate;
	private Long curload;
	private Long totalrequests;
	private Long requestsrate;
	private Long totalresponses;
	private Long responsesrate;
	private Long curclntconnections;
	private Long cursrvrconnections;
	private Long vsvrservicehits;
	private Long vsvrservicehitsrate;
	private Long svrestablishedconn;

	/**
	* <pre>
	* The name of the service.
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
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
	* The service type of this service.
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
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
	* Total number of requests received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_totalrequests() throws Exception {
		return this.totalrequests;
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
	* Number of responses received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_responsesrate() throws Exception {
		return this.responsesrate;
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
	* Current state of the server.
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
	* Total number of requests received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_requestsrate() throws Exception {
		return this.requestsrate;
	}

	/**
	* <pre>
	* Number of times that the service has been provided.
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
		gslbservice_response result = (gslbservice_response) service.get_payload_formatter().string_to_resource(gslbservice_response.class, response);
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
		return result.gslbservice;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicename;
	}

	/**
	* Use this API to fetch the statistics of all gslbservice_stats resources that are configured on netscaler.
	*/
	public static gslbservice_stats[] get(nitro_service service) throws Exception{
		gslbservice_stats obj = new gslbservice_stats();
		gslbservice_stats[] response = (gslbservice_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all gslbservice_stats resources that are configured on netscaler.
	*/
	public static gslbservice_stats[] get(nitro_service service, options option) throws Exception{
		gslbservice_stats obj = new gslbservice_stats();
		gslbservice_stats[] response = (gslbservice_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of gslbservice_stats resource of given name .
	*/
	public static gslbservice_stats get(nitro_service service, String servicename) throws Exception{
		gslbservice_stats obj = new gslbservice_stats();
		obj.set_servicename(servicename);
		gslbservice_stats response = (gslbservice_stats) obj.stat_resource(service);
		return response;
	}

}
