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

class vpnvserver_response extends base_response
{
	public vpnvserver_stats[] vpnvserver;
}
/**
* Statistics for VPN virtual server resource.
*/

public class vpnvserver_stats extends base_resource
{
	private String name;
	private String primaryipaddress;
	private Integer primaryport;
	private String type;
	private String state;
	private Long totalrequests;
	private Long requestsrate;
	private Long totalresponses;
	private Long responsesrate;
	private Long totalrequestbytes;
	private Long requestbytesrate;
	private Long totalresponsebytes;
	private Long responsebytesrate;

	/**
	* <pre>
	* The name of the vserver for which statistics will be displayed.  If not given statistics are shown for all vpn vservers.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the vserver for which statistics will be displayed.  If not given statistics are shown for all vpn vservers.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
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
	* Total number of request bytes received on this service or virtual server.
	* </pre>
	*/
	public Long get_requestbytesrate() throws Exception {
		return this.requestbytesrate;
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
	* Total number of requests received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_totalrequests() throws Exception {
		return this.totalrequests;
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
	* Number of responses received on this service or virtual server. (This applies to HTTP/SSL services and servers.)
	* </pre>
	*/
	public Long get_responsesrate() throws Exception {
		return this.responsesrate;
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
	public Long get_totalrequestbytes() throws Exception {
		return this.totalrequestbytes;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnvserver_response result = (vpnvserver_response) service.get_payload_formatter().string_to_resource(vpnvserver_response.class, response);
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
		return result.vpnvserver;
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
	* Use this API to fetch the statistics of all vpnvserver_stats resources that are configured on netscaler.
	*/
	public static vpnvserver_stats[] get(nitro_service service) throws Exception{
		vpnvserver_stats obj = new vpnvserver_stats();
		vpnvserver_stats[] response = (vpnvserver_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all vpnvserver_stats resources that are configured on netscaler.
	*/
	public static vpnvserver_stats[] get(nitro_service service, options option) throws Exception{
		vpnvserver_stats obj = new vpnvserver_stats();
		vpnvserver_stats[] response = (vpnvserver_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of vpnvserver_stats resource of given name .
	*/
	public static vpnvserver_stats get(nitro_service service, String name) throws Exception{
		vpnvserver_stats obj = new vpnvserver_stats();
		obj.set_name(name);
		vpnvserver_stats response = (vpnvserver_stats) obj.stat_resource(service);
		return response;
	}

}
