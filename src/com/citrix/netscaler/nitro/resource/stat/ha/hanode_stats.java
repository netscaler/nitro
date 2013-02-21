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

package com.citrix.netscaler.nitro.resource.stat.ha;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class hanode_response extends base_response
{
	public hanode_stats hanode;
}
/**
* Statistics for node resource.
*/

public class hanode_stats extends base_resource
{
	private String hacurstatus;
	private String hacurstate;
	private String hacurmasterstate;
	private String transtime;
	private Long hatotpktrx;
	private Long hapktrxrate;
	private Long hatotpkttx;
	private Long hapkttxrate;
	private Long haerrproptimeout;
	private Long haerrsyncfailure;

	/**
	* <pre>
	* Number of times the configuration of the primary and secondary nodes failed to synchronize since that last transition. A synchronization failure results in mismatched configuration. It can be caused by a mismatch in the Remote Procedural Call (RPC) password on the two nodes forming the high availability pair.
	* </pre>
	*/
	public Long get_haerrsyncfailure() throws Exception {
		return this.haerrsyncfailure;
	}

	/**
	* <pre>
	* Time when the last master state transition occurred. You can use this statistic for debugging.
	* </pre>
	*/
	public String get_transtime() throws Exception {
		return this.transtime;
	}

	/**
	* <pre>
	* Whether a NetScaler appliance is configured for high availability. Possible values are YES and NO. If the value is NO, the high availability statistics below are invalid.
	* </pre>
	*/
	public String get_hacurstatus() throws Exception {
		return this.hacurstatus;
	}

	/**
	* <pre>
	* Indicates the high availability state of the node. Possible values are: 
STAYSECONDARY – Indicates that the selected node remains the secondary node in a high availability setup. In this case a forced failover does not change the state but, instead, returns an appropriate error message. This is a configured value and not a statistic.
PRIMARY – Indicates that the selected node is the primary node in a high availability setup. 
SECONDARY – Indicates that the selected node is the secondary node in a high availability setup. 
CLAIMING – Indicates that the secondary node is in the process of taking over as the primary node. This is the intermediate state in the transition of the secondary node to primary status. 
FORCE CHANGE - Indicates that the secondary node is forcibly changing its status to primary due to a forced failover issued on the secondary node. 

	* </pre>
	*/
	public String get_hacurmasterstate() throws Exception {
		return this.hacurmasterstate;
	}

	/**
	* <pre>
	* Number of heartbeat packets sent to the peer node. Heartbeats are sent at regular intervals (default is 200 milliseconds) to determine the state of the peer node.
	* </pre>
	*/
	public Long get_hatotpkttx() throws Exception {
		return this.hatotpkttx;
	}

	/**
	* <pre>
	* Number of heartbeat packets received from the peer node. Heartbeats are sent at regular intervals (default is 200 milliseconds) to determine the state of the peer node.
	* </pre>
	*/
	public Long get_hapktrxrate() throws Exception {
		return this.hapktrxrate;
	}

	/**
	* <pre>
	* Number of times propagation timed out.
	* </pre>
	*/
	public Long get_haerrproptimeout() throws Exception {
		return this.haerrproptimeout;
	}

	/**
	* <pre>
	* Number of heartbeat packets sent to the peer node. Heartbeats are sent at regular intervals (default is 200 milliseconds) to determine the state of the peer node.
	* </pre>
	*/
	public Long get_hapkttxrate() throws Exception {
		return this.hapkttxrate;
	}

	/**
	* <pre>
	* State of the HA node, based on its health, in a high availability setup. Possible values are: 
UP – Indicates that the node is accessible and can function as either a primary or secondary node.
DISABLED – Indicates that the high availability status of the node has been manually disabled. Synchronization and propagation cannot take place between the peer nodes.
INIT – Indicates that the node is in the process of becoming part of the high availability configuration. 
PARTIALFAIL – Indicates that one of the high availability monitored interfaces has failed because of a card or link failure. This state triggers a failover.
COMPLETEFAIL – Indicates that all the interfaces of the node are unusable, because the interfaces on which high availability monitoring is enabled are not connected or are manually disabled. This state triggers a failover.
DUMB – Indicates that the node is in listening mode. It does not participate in high availability transitions or transfer configuration from the peer node. This is a configured value, not a statistic.
PARTIALFAILSSL – Indicates that the SSL card has failed. This state triggers a failover.
ROUTEMONITORFAIL – Indicates that the route monitor has failed. This state triggers a failover.

	* </pre>
	*/
	public String get_hacurstate() throws Exception {
		return this.hacurstate;
	}

	/**
	* <pre>
	* Number of heartbeat packets received from the peer node. Heartbeats are sent at regular intervals (default is 200 milliseconds) to determine the state of the peer node.
	* </pre>
	*/
	public Long get_hatotpktrx() throws Exception {
		return this.hatotpktrx;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		hanode_stats[] resources = new hanode_stats[1];
		hanode_response result = (hanode_response) service.get_payload_formatter().string_to_resource(hanode_response.class, response);
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
		resources[0] = result.hanode;
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
	* Use this API to fetch the statistics of all hanode_stats resources that are configured on netscaler.
	*/
	public static hanode_stats get(nitro_service service) throws Exception{
		hanode_stats obj = new hanode_stats();
		hanode_stats[] response = (hanode_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all hanode_stats resources that are configured on netscaler.
	*/
	public static hanode_stats get(nitro_service service,  options option) throws Exception{
		hanode_stats obj = new hanode_stats();
		hanode_stats[] response = (hanode_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
