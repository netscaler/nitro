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

class gslbvserver_response extends base_response
{
	public gslbvserver_stats[] gslbvserver;
}
/**
* Statistics for Global Server Load Balancing Virtual Server resource.
*/

public class gslbvserver_stats extends base_resource
{
	private String name;
	private Long establishedconn;
	private Long vslbhealth;
	private String type;
	private String state;
	private Long tothits;
	private Long hitsrate;
	private Long totalrequestbytes;
	private Long requestbytesrate;
	private Long totalresponsebytes;
	private Long responsebytesrate;
	private Long sothreshold;
	private Long totspillovers;
	private Long totalrequests;
	private Long requestsrate;
	private Long totalresponses;
	private Long responsesrate;
	private Long curclntconnections;
	private Long cursrvrconnections;
	private Long svrestablishedconn;

	/**
	* <pre>
	* The name of the gslb vserver for which statistics will be displayed.  If not given statistics are shown for all gslb vservers.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the gslb vserver for which statistics will be displayed.  If not given statistics are shown for all gslb vservers.<br> Minimum length =  1
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
	* Number of responses received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_responsesrate() throws Exception {
		return this.responsesrate;
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
	* Current state of the server.
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Health of the vserver. This gives percentage of UP services bound to this vserver.
	* </pre>
	*/
	public Long get_vslbhealth() throws Exception {
		return this.vslbhealth;
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
		gslbvserver_response result = (gslbvserver_response) service.get_payload_formatter().string_to_resource(gslbvserver_response.class, response);
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
		return result.gslbvserver;
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
	* Use this API to fetch the statistics of all gslbvserver_stats resources that are configured on netscaler.
	*/
	public static gslbvserver_stats[] get(nitro_service service) throws Exception{
		gslbvserver_stats obj = new gslbvserver_stats();
		gslbvserver_stats[] response = (gslbvserver_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all gslbvserver_stats resources that are configured on netscaler.
	*/
	public static gslbvserver_stats[] get(nitro_service service, options option) throws Exception{
		gslbvserver_stats obj = new gslbvserver_stats();
		gslbvserver_stats[] response = (gslbvserver_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of gslbvserver_stats resource of given name .
	*/
	public static gslbvserver_stats get(nitro_service service, String name) throws Exception{
		gslbvserver_stats obj = new gslbvserver_stats();
		obj.set_name(name);
		gslbvserver_stats response = (gslbvserver_stats) obj.stat_resource(service);
		return response;
	}

}
