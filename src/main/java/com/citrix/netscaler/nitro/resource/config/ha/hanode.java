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

package com.citrix.netscaler.nitro.resource.config.ha;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class hanode_response extends base_response
{
	public hanode[] hanode;
}
/**
* Configuration for node resource.
*/

public class hanode extends base_resource
{
	private Long id;
	private String ipaddress;
	private String inc;
	private String hastatus;
	private String hasync;
	private String haprop;
	private Long hellointerval;
	private Long deadinterval;
	private String failsafe;
	private Long maxflips;
	private Long maxfliptime;
	private Long syncvlan;

	//------- Read only Parameter ---------;

	private String name;
	private Long flags;
	private String state;
	private String enaifaces;
	private String disifaces;
	private String hamonifaces;
	private String pfifaces;
	private String ifaces;
	private String network;
	private String netmask;
	private String ssl2;
	private Long masterstatetime;
	private String routemonitor;
	private Long curflips;
	private Long completedfliptime;
	private Long __count;

	/**
	* <pre>
	* Number that uniquely identifies the peer node.<br> Minimum value =  1<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* Number that uniquely identifies the peer node.<br> Minimum value =  1<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* Number that uniquely identifies the peer node.<br> Minimum value =  1<br> Maximum value =  64
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The NSIP or NSIP6 address of the node to be added for an HA configuration. This setting is neither propagated nor synchronized.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The NSIP or NSIP6 address of the node to be added for an HA configuration. This setting is neither propagated nor synchronized.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* This option is required if the HA nodes reside on different networks. When this mode is enabled, the following independent network entities and configurations are neither propagated nor synced to the other node: MIPs, SNIPs, VLANs, routes (except LLB routes), route monitors, RNAT rules (except any RNAT rule with a VIP as the NAT IP), and dynamic routing configurations. They are maintained independently on each node.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_inc(String inc) throws Exception{
		this.inc = inc;
	}

	/**
	* <pre>
	* This option is required if the HA nodes reside on different networks. When this mode is enabled, the following independent network entities and configurations are neither propagated nor synced to the other node: MIPs, SNIPs, VLANs, routes (except LLB routes), route monitors, RNAT rules (except any RNAT rule with a VIP as the NAT IP), and dynamic routing configurations. They are maintained independently on each node.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_inc() throws Exception {
		return this.inc;
	}

	/**
	* <pre>
	* The HA status of the node. The HA status STAYSECONDARY is used to force the secondary device stay as secondary independent of the state of the Primary device. For example, in an existing HA setup, the Primary node has to be upgraded and this process would take few seconds. During the upgradation, it is possible that the Primary node may suffer from a downtime for a few seconds. However, the Secondary should not take over as the Primary node. Thus, the Secondary node should remain as Secondary even if there is a failure in the Primary node.
	 STAYPRIMARY configuration keeps the node in primary state in case if it is healthy, even if the peer node was the primary node initially. If the node with STAYPRIMARY setting (and no peer node) is added to a primary node (which has this node as the peer) then this node takes over as the new primary and the older node becomes secondary. ENABLED state means normal HA operation without any constraints/preferences. DISABLED state disables the normal HA operation of the node.<br> Possible values = ENABLED, STAYSECONDARY, DISABLED, STAYPRIMARY
	* </pre>
	*/
	public void set_hastatus(String hastatus) throws Exception{
		this.hastatus = hastatus;
	}

	/**
	* <pre>
	* The HA status of the node. The HA status STAYSECONDARY is used to force the secondary device stay as secondary independent of the state of the Primary device. For example, in an existing HA setup, the Primary node has to be upgraded and this process would take few seconds. During the upgradation, it is possible that the Primary node may suffer from a downtime for a few seconds. However, the Secondary should not take over as the Primary node. Thus, the Secondary node should remain as Secondary even if there is a failure in the Primary node.
	 STAYPRIMARY configuration keeps the node in primary state in case if it is healthy, even if the peer node was the primary node initially. If the node with STAYPRIMARY setting (and no peer node) is added to a primary node (which has this node as the peer) then this node takes over as the new primary and the older node becomes secondary. ENABLED state means normal HA operation without any constraints/preferences. DISABLED state disables the normal HA operation of the node.<br> Possible values = ENABLED, STAYSECONDARY, DISABLED, STAYPRIMARY
	* </pre>
	*/
	public String get_hastatus() throws Exception {
		return this.hastatus;
	}

	/**
	* <pre>
	* Automatically maintain synchronization by duplicating the configuration of the primary node on the secondary node. This setting is not propagated. Automatic synchronization requires that this setting be enabled (the default) on the current secondary node. Synchronization uses TCP port 3010.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_hasync(String hasync) throws Exception{
		this.hasync = hasync;
	}

	/**
	* <pre>
	* Automatically maintain synchronization by duplicating the configuration of the primary node on the secondary node. This setting is not propagated. Automatic synchronization requires that this setting be enabled (the default) on the current secondary node. Synchronization uses TCP port 3010.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_hasync() throws Exception {
		return this.hasync;
	}

	/**
	* <pre>
	* Automatically propagate all commands from the primary to the secondary node, except the following:
* All HA configuration related commands. For example, add ha node, set ha node, and bind ha node. 
* All Interface related commands. For example, set interface and unset interface.
* All channels related commands. For example, add channel, set channel, and bind channel.
The propagated command is executed on the secondary node before it is executed on the primary. If command propagation fails, or if command execution fails on the secondary, the primary node executes the command and logs an error.  Command propagation uses port 3011.
Note: After enabling propagation, run force synchronization on either node.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_haprop(String haprop) throws Exception{
		this.haprop = haprop;
	}

	/**
	* <pre>
	* Automatically propagate all commands from the primary to the secondary node, except the following:
* All HA configuration related commands. For example, add ha node, set ha node, and bind ha node. 
* All Interface related commands. For example, set interface and unset interface.
* All channels related commands. For example, add channel, set channel, and bind channel.
The propagated command is executed on the secondary node before it is executed on the primary. If command propagation fails, or if command execution fails on the secondary, the primary node executes the command and logs an error.  Command propagation uses port 3011.
Note: After enabling propagation, run force synchronization on either node.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_haprop() throws Exception {
		return this.haprop;
	}

	/**
	* <pre>
	* Interval, in milliseconds, between heartbeat messages sent to the peer node. The heartbeat messages are UDP packets sent to port 3003 of the peer node.<br> Default value: 200<br> Minimum value =  200<br> Maximum value =  1000
	* </pre>
	*/
	public void set_hellointerval(long hellointerval) throws Exception {
		this.hellointerval = new Long(hellointerval);
	}

	/**
	* <pre>
	* Interval, in milliseconds, between heartbeat messages sent to the peer node. The heartbeat messages are UDP packets sent to port 3003 of the peer node.<br> Default value: 200<br> Minimum value =  200<br> Maximum value =  1000
	* </pre>
	*/
	public void set_hellointerval(Long hellointerval) throws Exception{
		this.hellointerval = hellointerval;
	}

	/**
	* <pre>
	* Interval, in milliseconds, between heartbeat messages sent to the peer node. The heartbeat messages are UDP packets sent to port 3003 of the peer node.<br> Default value: 200<br> Minimum value =  200<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_hellointerval() throws Exception {
		return this.hellointerval;
	}

	/**
	* <pre>
	* Number of seconds after which a peer node is marked DOWN if heartbeat messages are not received from the peer node.<br> Default value: 3<br> Minimum value =  3<br> Maximum value =  60
	* </pre>
	*/
	public void set_deadinterval(long deadinterval) throws Exception {
		this.deadinterval = new Long(deadinterval);
	}

	/**
	* <pre>
	* Number of seconds after which a peer node is marked DOWN if heartbeat messages are not received from the peer node.<br> Default value: 3<br> Minimum value =  3<br> Maximum value =  60
	* </pre>
	*/
	public void set_deadinterval(Long deadinterval) throws Exception{
		this.deadinterval = deadinterval;
	}

	/**
	* <pre>
	* Number of seconds after which a peer node is marked DOWN if heartbeat messages are not received from the peer node.<br> Default value: 3<br> Minimum value =  3<br> Maximum value =  60
	* </pre>
	*/
	public Long get_deadinterval() throws Exception {
		return this.deadinterval;
	}

	/**
	* <pre>
	* Keep one node primary if both nodes fail the health check, so that a partially available node can back up data and handle traffic. This mode is set independently on each node.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_failsafe(String failsafe) throws Exception{
		this.failsafe = failsafe;
	}

	/**
	* <pre>
	* Keep one node primary if both nodes fail the health check, so that a partially available node can back up data and handle traffic. This mode is set independently on each node.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_failsafe() throws Exception {
		return this.failsafe;
	}

	/**
	* <pre>
	* Max number of flips allowed before becoming sticky primary.
	* </pre>
	*/
	public void set_maxflips(long maxflips) throws Exception {
		this.maxflips = new Long(maxflips);
	}

	/**
	* <pre>
	* Max number of flips allowed before becoming sticky primary.
	* </pre>
	*/
	public void set_maxflips(Long maxflips) throws Exception{
		this.maxflips = maxflips;
	}

	/**
	* <pre>
	* Max number of flips allowed before becoming sticky primary.
	* </pre>
	*/
	public Long get_maxflips() throws Exception {
		return this.maxflips;
	}

	/**
	* <pre>
	* Interval after which flipping of node states can again start.
	* </pre>
	*/
	public void set_maxfliptime(long maxfliptime) throws Exception {
		this.maxfliptime = new Long(maxfliptime);
	}

	/**
	* <pre>
	* Interval after which flipping of node states can again start.
	* </pre>
	*/
	public void set_maxfliptime(Long maxfliptime) throws Exception{
		this.maxfliptime = maxfliptime;
	}

	/**
	* <pre>
	* Interval after which flipping of node states can again start.
	* </pre>
	*/
	public Long get_maxfliptime() throws Exception {
		return this.maxfliptime;
	}

	/**
	* <pre>
	* Vlan on which HA related communication is sent. This include sync, propagation , connection mirroring , LB persistency config sync, persistent session sync and session state sync. However HA heartbeats can go all interfaces.<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public void set_syncvlan(long syncvlan) throws Exception {
		this.syncvlan = new Long(syncvlan);
	}

	/**
	* <pre>
	* Vlan on which HA related communication is sent. This include sync, propagation , connection mirroring , LB persistency config sync, persistent session sync and session state sync. However HA heartbeats can go all interfaces.<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public void set_syncvlan(Long syncvlan) throws Exception{
		this.syncvlan = syncvlan;
	}

	/**
	* <pre>
	* Vlan on which HA related communication is sent. This include sync, propagation , connection mirroring , LB persistency config sync, persistent session sync and session state sync. However HA heartbeats can go all interfaces.<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public Long get_syncvlan() throws Exception {
		return this.syncvlan;
	}

	/**
	* <pre>
	* Node Name.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The flags for this entry.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* HA Master State.<br> Possible values = Primary, Secondary, UNKNOWN
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Enabled interfaces.
	* </pre>
	*/
	public String get_enaifaces() throws Exception {
		return this.enaifaces;
	}

	/**
	* <pre>
	* Disabled interfaces.
	* </pre>
	*/
	public String get_disifaces() throws Exception {
		return this.disifaces;
	}

	/**
	* <pre>
	* HAMON ON interfaces.
	* </pre>
	*/
	public String get_hamonifaces() throws Exception {
		return this.hamonifaces;
	}

	/**
	* <pre>
	* Interfaces causing Partial Failure.
	* </pre>
	*/
	public String get_pfifaces() throws Exception {
		return this.pfifaces;
	}

	/**
	* <pre>
	* Interfaces on which non-multicast is not seen.
	* </pre>
	*/
	public String get_ifaces() throws Exception {
		return this.ifaces;
	}

	/**
	* <pre>
	* The network.
	* </pre>
	*/
	public String get_network() throws Exception {
		return this.network;
	}

	/**
	* <pre>
	* The netmask.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* SSL card status.<br> Possible values = DOWN, UP, NOT PRESENT, UNKNOWN
	* </pre>
	*/
	public String get_ssl2() throws Exception {
		return this.ssl2;
	}

	/**
	* <pre>
	* Time elapsed in current master state.
	* </pre>
	*/
	public Long get_masterstatetime() throws Exception {
		return this.masterstatetime;
	}

	/**
	* <pre>
	* The IP address (IPv4 or IPv6).
	* </pre>
	*/
	public String get_routemonitor() throws Exception {
		return this.routemonitor;
	}

	/**
	* <pre>
	* Keeps track of number of flips that have happened till now in current interval.
	* </pre>
	*/
	public Long get_curflips() throws Exception {
		return this.curflips;
	}

	/**
	* <pre>
	* To inform user whether flip time is elapsed or not.
	* </pre>
	*/
	public Long get_completedfliptime() throws Exception {
		return this.completedfliptime;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
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
		return result.hanode;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	/**
	* Use this API to add hanode.
	*/
	public static base_response add(nitro_service client, hanode resource) throws Exception {
		hanode addresource = new hanode();
		addresource.id = resource.id;
		addresource.ipaddress = resource.ipaddress;
		addresource.inc = resource.inc;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add hanode resources.
	*/
	public static base_responses add(nitro_service client, hanode resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			hanode addresources[] = new hanode[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new hanode();
				addresources[i].id = resources[i].id;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].inc = resources[i].inc;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete hanode of given name.
	*/
	public static base_response delete(nitro_service client, Long id) throws Exception {
		hanode deleteresource = new hanode();
		deleteresource.id = id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete hanode.
	*/
	public static base_response delete(nitro_service client, hanode resource) throws Exception {
		hanode deleteresource = new hanode();
		deleteresource.id = resource.id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete hanode resources of given names.
	*/
	public static base_responses delete(nitro_service client, Long id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			hanode deleteresources[] = new hanode[id.length];
			for (int i=0;i<id.length;i++){
				deleteresources[i] = new hanode();
				deleteresources[i].id = id[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete hanode resources.
	*/
	public static base_responses delete(nitro_service client, hanode resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			hanode deleteresources[] = new hanode[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new hanode();
				deleteresources[i].id = resources[i].id;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update hanode.
	*/
	public static base_response update(nitro_service client, hanode resource) throws Exception {
		hanode updateresource = new hanode();
		updateresource.id = resource.id;
		updateresource.hastatus = resource.hastatus;
		updateresource.hasync = resource.hasync;
		updateresource.haprop = resource.haprop;
		updateresource.hellointerval = resource.hellointerval;
		updateresource.deadinterval = resource.deadinterval;
		updateresource.failsafe = resource.failsafe;
		updateresource.maxflips = resource.maxflips;
		updateresource.maxfliptime = resource.maxfliptime;
		updateresource.syncvlan = resource.syncvlan;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update hanode resources.
	*/
	public static base_responses update(nitro_service client, hanode resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			hanode updateresources[] = new hanode[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new hanode();
				updateresources[i].id = resources[i].id;
				updateresources[i].hastatus = resources[i].hastatus;
				updateresources[i].hasync = resources[i].hasync;
				updateresources[i].haprop = resources[i].haprop;
				updateresources[i].hellointerval = resources[i].hellointerval;
				updateresources[i].deadinterval = resources[i].deadinterval;
				updateresources[i].failsafe = resources[i].failsafe;
				updateresources[i].maxflips = resources[i].maxflips;
				updateresources[i].maxfliptime = resources[i].maxfliptime;
				updateresources[i].syncvlan = resources[i].syncvlan;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of hanode resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, hanode resource, String[] args) throws Exception{
		hanode unsetresource = new hanode();
		unsetresource.id = resource.id;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of hanode resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Long id[], String args[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			hanode unsetresources[] = new hanode[id.length];
			for (int i=0;i<id.length;i++){
				unsetresources[i] = new hanode();
				unsetresources[i].id = id[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of hanode resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, hanode resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			hanode unsetresources[] = new hanode[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new hanode();
				unsetresources[i].id = resources[i].id;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the hanode resources that are configured on netscaler.
	*/
	public static hanode[] get(nitro_service service) throws Exception{
		hanode obj = new hanode();
		hanode[] response = (hanode[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the hanode resources that are configured on netscaler.
	*/
	public static hanode[] get(nitro_service service, options option) throws Exception{
		hanode obj = new hanode();
		hanode[] response = (hanode[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch hanode resource of given name .
	*/
	public static hanode get(nitro_service service, Long id) throws Exception{
		hanode obj = new hanode();
		obj.set_id(id);
		hanode response = (hanode) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch hanode resources of given names .
	*/
	public static hanode[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			hanode response[] = new hanode[id.length];
			hanode obj[] = new hanode[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new hanode();
				obj[i].set_id(id[i]);
				response[i] = (hanode) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of hanode resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static hanode[] get_filtered(nitro_service service, String filter) throws Exception{
		hanode obj = new hanode();
		options option = new options();
		option.set_filter(filter);
		hanode[] response = (hanode[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of hanode resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static hanode[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		hanode obj = new hanode();
		options option = new options();
		option.set_filter(filter);
		hanode[] response = (hanode[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the hanode resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		hanode obj = new hanode();
		options option = new options();
		option.set_count(true);
		hanode[] response = (hanode[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of hanode resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		hanode obj = new hanode();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hanode[] response = (hanode[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of hanode resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		hanode obj = new hanode();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hanode[] response = (hanode[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class hapropEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class incEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String Primary = "Primary";
		public static final String Secondary = "Secondary";
		public static final String UNKNOWN = "UNKNOWN";
	}
	public static class hasyncEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class failsafeEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class hastatusEnum {
		public static final String ENABLED = "ENABLED";
		public static final String STAYSECONDARY = "STAYSECONDARY";
		public static final String DISABLED = "DISABLED";
		public static final String STAYPRIMARY = "STAYPRIMARY";
	}
	public static class ssl2Enum {
		public static final String DOWN = "DOWN";
		public static final String UP = "UP";
		public static final String NOT_PRESENT = "NOT PRESENT";
		public static final String UNKNOWN = "UNKNOWN";
	}
}
