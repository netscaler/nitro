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

class scpolicy_response extends base_response
{
	public scpolicy_stats[] scpolicy;
}
/**
* Statistics for SureConnect policy resource.
*/

public class scpolicy_stats extends base_resource
{
	private String name;
	private Long sctotalserverttlb;
	private Long avgservertransactiontime;
	private Long avgservertransactiontimerate;
	private Long scaverageclientttlb;
	private Long scaverageclientttlbrate;
	private String scphysicalserviceip;
	private Integer scphysicalserviceport;
	private Long sccurrentclientconnections;
	private Long sccurrentclientconnectionsrate;
	private Long sccurrentwaitingclients;
	private Long sccurrentwaitingclientsrate;
	private Long totopenconn;
	private Long openconnrate;
	private Long sccurrentwaitingtime;
	private Long sccurrentwaitingtimerate;
	private Long sctotalclientconnections;
	private Long scclientconnectionsrate;
	private Long sctotalserverconnections;
	private Long scserverconnectionsrate;
	private Long totclienttransaction;
	private Long clienttransactionrate;
	private Long sctotalservertransactions;
	private Long sctotalrequestsreceived;
	private Long screquestsreceivedrate;
	private Long sctotalrequestbytes;
	private Long screquestbytesrate;
	private Long sctotalresponsesreceived;
	private Long scresponsesreceivedrate;
	private Long sctotalresponsebytes;
	private Long scresponsebytesrate;

	/**
	* <pre>
	* The name of the SC policy for which statistics will be displayed. If not given stati        stics are shown for all SC policies.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the SC policy for which statistics will be displayed. If not given stati        stics are shown for all SC policies.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Average value of the client Time-To-Last-Byte in seconds for this SureConnect policy.
	* </pre>
	*/
	public Long get_scaverageclientttlb() throws Exception {
		return this.scaverageclientttlb;
	}

	/**
	* <pre>
	* Total number of server responses received by this SureConnect policy.
	* </pre>
	*/
	public Long get_sctotalresponsesreceived() throws Exception {
		return this.sctotalresponsesreceived;
	}

	/**
	* <pre>
	* Average server transaction time in seconds for this SureConnect Policy.
	* </pre>
	*/
	public Long get_avgservertransactiontime() throws Exception {
		return this.avgservertransactiontime;
	}

	/**
	* <pre>
	* IP address of the service in dotted notation for which these statistics are maintained.
	* </pre>
	*/
	public String get_scphysicalserviceip() throws Exception {
		return this.scphysicalserviceip;
	}

	/**
	* <pre>
	* Value of the currently estimated waiting time in seconds for the configured URL.
	* </pre>
	*/
	public Long get_sccurrentwaitingtime() throws Exception {
		return this.sccurrentwaitingtime;
	}

	/**
	* <pre>
	* Number of clients currently  allowed a server connection by this SureConnect policy.
	* </pre>
	*/
	public Long get_sccurrentclientconnectionsrate() throws Exception {
		return this.sccurrentclientconnectionsrate;
	}

	/**
	* <pre>
	* Number of clients currently  allowed a server connection by this SureConnect policy.
	* </pre>
	*/
	public Long get_sccurrentclientconnections() throws Exception {
		return this.sccurrentclientconnections;
	}

	/**
	* <pre>
	* Current number of open connections to the servers matching this policy.
	* </pre>
	*/
	public Long get_openconnrate() throws Exception {
		return this.openconnrate;
	}

	/**
	* <pre>
	* Total number of client transactions processed by this SureConnect policy.
	* </pre>
	*/
	public Long get_clienttransactionrate() throws Exception {
		return this.clienttransactionrate;
	}

	/**
	* <pre>
	* Value of the currently estimated waiting time in seconds for the configured URL.
	* </pre>
	*/
	public Long get_sccurrentwaitingtimerate() throws Exception {
		return this.sccurrentwaitingtimerate;
	}

	/**
	* <pre>
	* Current number of SureConnect priority clients that are waiting for a server connection.
	* </pre>
	*/
	public Long get_sccurrentwaitingclients() throws Exception {
		return this.sccurrentwaitingclients;
	}

	/**
	* <pre>
	* Total number of clients that were allowed a server connection by this SureConnect policy.
	* </pre>
	*/
	public Long get_scclientconnectionsrate() throws Exception {
		return this.scclientconnectionsrate;
	}

	/**
	* <pre>
	* Average value of the client Time-To-Last-Byte in seconds for this SureConnect policy.
	* </pre>
	*/
	public Long get_scaverageclientttlbrate() throws Exception {
		return this.scaverageclientttlbrate;
	}

	/**
	* <pre>
	* Total number of client transactions processed by this SureConnect policy.
	* </pre>
	*/
	public Long get_totclienttransaction() throws Exception {
		return this.totclienttransaction;
	}

	/**
	* <pre>
	* Total number of requests received by this SureConnect policy.
	* </pre>
	*/
	public Long get_sctotalrequestsreceived() throws Exception {
		return this.sctotalrequestsreceived;
	}

	/**
	* <pre>
	* Total number of clients that were allowed a server connection by this SureConnect policy.
	* </pre>
	*/
	public Long get_sctotalclientconnections() throws Exception {
		return this.sctotalclientconnections;
	}

	/**
	* <pre>
	* Total number of requests received by this SureConnect policy.
	* </pre>
	*/
	public Long get_screquestsreceivedrate() throws Exception {
		return this.screquestsreceivedrate;
	}

	/**
	* <pre>
	* Total number of response bytes received by this SureConnect policy.
	* </pre>
	*/
	public Long get_scresponsebytesrate() throws Exception {
		return this.scresponsebytesrate;
	}

	/**
	* <pre>
	* Port of the service for which these statistics are maintained.
	* </pre>
	*/
	public Integer get_scphysicalserviceport() throws Exception {
		return this.scphysicalserviceport;
	}

	/**
	* <pre>
	* Server Time-To-Last-Byte in seconds calculated for this SureConnect policy.
	* </pre>
	*/
	public Long get_sctotalserverttlb() throws Exception {
		return this.sctotalserverttlb;
	}

	/**
	* <pre>
	* Total number of request bytes received by this SureConnect policy.
	* </pre>
	*/
	public Long get_screquestbytesrate() throws Exception {
		return this.screquestbytesrate;
	}

	/**
	* <pre>
	* Total number of response bytes received by this SureConnect policy.
	* </pre>
	*/
	public Long get_sctotalresponsebytes() throws Exception {
		return this.sctotalresponsebytes;
	}

	/**
	* <pre>
	* Current number of open connections to the servers matching this policy.
	* </pre>
	*/
	public Long get_totopenconn() throws Exception {
		return this.totopenconn;
	}

	/**
	* <pre>
	* Average server transaction time in seconds for this SureConnect Policy.
	* </pre>
	*/
	public Long get_avgservertransactiontimerate() throws Exception {
		return this.avgservertransactiontimerate;
	}

	/**
	* <pre>
	* Total number of server responses received by this SureConnect policy.
	* </pre>
	*/
	public Long get_scresponsesreceivedrate() throws Exception {
		return this.scresponsesreceivedrate;
	}

	/**
	* <pre>
	* Total number of request bytes received by this SureConnect policy.
	* </pre>
	*/
	public Long get_sctotalrequestbytes() throws Exception {
		return this.sctotalrequestbytes;
	}

	/**
	* <pre>
	* Total number of server connections that were established through this SureConnect policy.
	* </pre>
	*/
	public Long get_scserverconnectionsrate() throws Exception {
		return this.scserverconnectionsrate;
	}

	/**
	* <pre>
	* Total number of server connections that were established through this SureConnect policy.
	* </pre>
	*/
	public Long get_sctotalserverconnections() throws Exception {
		return this.sctotalserverconnections;
	}

	/**
	* <pre>
	* Number of 200 OK responses received from the web server by this SureConnect policy.
	* </pre>
	*/
	public Long get_sctotalservertransactions() throws Exception {
		return this.sctotalservertransactions;
	}

	/**
	* <pre>
	* Current number of SureConnect priority clients that are waiting for a server connection.
	* </pre>
	*/
	public Long get_sccurrentwaitingclientsrate() throws Exception {
		return this.sccurrentwaitingclientsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		scpolicy_response result = (scpolicy_response) service.get_payload_formatter().string_to_resource(scpolicy_response.class, response);
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
		return result.scpolicy;
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
	* Use this API to fetch the statistics of all scpolicy_stats resources that are configured on netscaler.
	*/
	public static scpolicy_stats[] get(nitro_service service) throws Exception{
		scpolicy_stats obj = new scpolicy_stats();
		scpolicy_stats[] response = (scpolicy_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all scpolicy_stats resources that are configured on netscaler.
	*/
	public static scpolicy_stats[] get(nitro_service service, options option) throws Exception{
		scpolicy_stats obj = new scpolicy_stats();
		scpolicy_stats[] response = (scpolicy_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of scpolicy_stats resource of given name .
	*/
	public static scpolicy_stats get(nitro_service service, String name) throws Exception{
		scpolicy_stats obj = new scpolicy_stats();
		obj.set_name(name);
		scpolicy_stats response = (scpolicy_stats) obj.stat_resource(service);
		return response;
	}

}
