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

package com.citrix.netscaler.nitro.resource.stat.cluster;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class clusternode_response extends base_response
{
	public clusternode_stats[] clusternode;
}
/**
* Statistics for cluster node resource.
*/

public class clusternode_stats extends base_resource
{
	private Long nodeid;
	private String clearstats;
	private String clsyncstate;
	private String clnodeeffectivehealth;
	private String clnodeip;
	private String clmasterstate;
	private Long cltothbtx;
	private Long cltothbrx;
	private Long nnmcurconn;
	private Long nnmtotconntx;
	private Long nnmtotconnrx;
	private String clptpstate;
	private Long clptptx;
	private Long clptprx;
	private Long nnmerrmsend;

	/**
	* <pre>
	* ID of the cluster node for which to display statistics. If an ID is not provided, statistics are shown for all nodes.
	* </pre>
	*/
	public void set_nodeid(long nodeid) throws Exception {
		this.nodeid = new Long(nodeid);
	}

	/**
	* <pre>
	* ID of the cluster node for which to display statistics. If an ID is not provided, statistics are shown for all nodes.
	* </pre>
	*/
	public void set_nodeid(Long nodeid) throws Exception{
		this.nodeid = nodeid;
	}

	/**
	* <pre>
	* ID of the cluster node for which to display statistics. If an ID is not provided, statistics are shown for all nodes.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_nodeid() throws Exception {
		return this.nodeid;
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
	* NSIP address of the cluster node.
	* </pre>
	*/
	public String get_clnodeip() throws Exception {
		return this.clnodeip;
	}

	/**
	* <pre>
	* Sync state of the cluster node.
	* </pre>
	*/
	public String get_clsyncstate() throws Exception {
		return this.clsyncstate;
	}

	/**
	* <pre>
	* Number of connections open for node-to-node communication.
	* </pre>
	*/
	public Long get_nnmcurconn() throws Exception {
		return this.nnmcurconn;
	}

	/**
	* <pre>
	* Number of errors in sending node-to-node multicast/broadcast messages. When executed from the NSIP address, shows the statistics for local node only. For remote node it shows a value of 0. When executed from the cluster IP address, shows all the statistics.
	* </pre>
	*/
	public Long get_nnmerrmsend() throws Exception {
		return this.nnmerrmsend;
	}

	/**
	* <pre>
	* Health of the cluster node.
	* </pre>
	*/
	public String get_clnodeeffectivehealth() throws Exception {
		return this.clnodeeffectivehealth;
	}

	/**
	* <pre>
	* Number of node-to-node messages received. When executed from the NSIP address, shows the statistics for local node only. For remote node it shows a value of 0. When executed from the cluster IP address, shows all the statistics.
	* </pre>
	*/
	public Long get_nnmtotconnrx() throws Exception {
		return this.nnmtotconnrx;
	}

	/**
	* <pre>
	* Number of heartbeats received. When executed from the NSIP address, shows the statistics for local node only. For remote node it shows a value of 0. When executed from the cluster IP address, shows all the statistics.
	* </pre>
	*/
	public Long get_cltothbrx() throws Exception {
		return this.cltothbrx;
	}

	/**
	* <pre>
	* Number of PTP packets received on the node. When executed from the NSIP address, shows the statistics for local node only. For remote node it shows a value of 0. When executed from the cluster IP address, shows all the statistics.
	* </pre>
	*/
	public Long get_clptprx() throws Exception {
		return this.clptprx;
	}

	/**
	* <pre>
	* Number of node-to-node messages sent. When executed from the NSIP address, shows the statistics for local node only. For remote node it shows a value of 0. When executed from the cluster IP address, shows all the statistics.
	* </pre>
	*/
	public Long get_nnmtotconntx() throws Exception {
		return this.nnmtotconntx;
	}

	/**
	* <pre>
	* Operational state of the cluster node.
	* </pre>
	*/
	public String get_clmasterstate() throws Exception {
		return this.clmasterstate;
	}

	/**
	* <pre>
	* Number of PTP packets transmitted by the node. When executed from the NSIP address, shows the statistics for local node only. For remote node it shows a value of 0. When executed from the cluster IP address, shows all the statistics.
	* </pre>
	*/
	public Long get_clptptx() throws Exception {
		return this.clptptx;
	}

	/**
	* <pre>
	* PTP state of the node. This state is Master for one node and Slave for the rest. When executed from the NSIP address, shows the statistics for local node only. For remote node it shows UNKNOWN. When executed from the cluster IP address, shows all the statistics.
	* </pre>
	*/
	public String get_clptpstate() throws Exception {
		return this.clptpstate;
	}

	/**
	* <pre>
	* Number of heartbeats sent. When executed from the NSIP address, shows the statistics for local node only. For remote node it shows a value of 0. When executed from the cluster IP address, shows all the statistics.
	* </pre>
	*/
	public Long get_cltothbtx() throws Exception {
		return this.cltothbtx;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusternode_response result = (clusternode_response) service.get_payload_formatter().string_to_resource(clusternode_response.class, response);
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
		return result.clusternode;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.nodeid != null) {
			return this.nodeid.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch the statistics of all clusternode_stats resources that are configured on netscaler.
	*/
	public static clusternode_stats[] get(nitro_service service) throws Exception{
		clusternode_stats obj = new clusternode_stats();
		clusternode_stats[] response = (clusternode_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all clusternode_stats resources that are configured on netscaler.
	*/
	public static clusternode_stats[] get(nitro_service service, options option) throws Exception{
		clusternode_stats obj = new clusternode_stats();
		clusternode_stats[] response = (clusternode_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of clusternode_stats resource of given name .
	*/
	public static clusternode_stats get(nitro_service service, Long nodeid) throws Exception{
		clusternode_stats obj = new clusternode_stats();
		obj.set_nodeid(nodeid);
		clusternode_stats response = (clusternode_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
