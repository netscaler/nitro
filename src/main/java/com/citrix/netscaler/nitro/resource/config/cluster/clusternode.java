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

package com.citrix.netscaler.nitro.resource.config.cluster;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class clusternode_response extends base_response
{
	public clusternode[] clusternode;
}
/**
* Configuration for cluster node resource.
*/

public class clusternode extends base_resource
{
	private Long nodeid;
	private String ipaddress;
	private String state;
	private String backplane;

	//------- Read only Parameter ---------;

	private String clusterhealth;
	private String effectivestate;
	private String operationalsyncstate;
	private String masterstate;
	private String health;
	private Boolean isconfigurationcoordinator;
	private Boolean islocalnode;
	private Boolean nodersskeymismatch;
	private Boolean nodelicensemismatch;
	private Long __count;

	/**
	* <pre>
	* A unique number that identifies the cluster node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_nodeid(long nodeid) throws Exception {
		this.nodeid = new Long(nodeid);
	}

	/**
	* <pre>
	* A unique number that identifies the cluster node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_nodeid(Long nodeid) throws Exception{
		this.nodeid = nodeid;
	}

	/**
	* <pre>
	* A unique number that identifies the cluster node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_nodeid() throws Exception {
		return this.nodeid;
	}

	/**
	* <pre>
	* The NetScaler IP (NSIP) address of the appliance that you want to add to the cluster. Only IPv4 addresses are supported.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The NetScaler IP (NSIP) address of the appliance that you want to add to the cluster. Only IPv4 addresses are supported.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* The configured state of the cluster node.
	ACTIVE - The node serves traffic.
	SPARE - The node does not serve traffic till an ACTIVE node goes down.
	PASSIVE - The node does not serve traffic till explicitly made ACTIVE. This state is useful during temporary maintenance activities where it is desirable that the node takes part in the consensus protocol, but does not serve traffic.<br> Default value: NSACL_NODEST_PASSIVE<br> Possible values = ACTIVE, SPARE, PASSIVE
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The configured state of the cluster node.
	ACTIVE - The node serves traffic.
	SPARE - The node does not serve traffic till an ACTIVE node goes down.
	PASSIVE - The node does not serve traffic till explicitly made ACTIVE. This state is useful during temporary maintenance activities where it is desirable that the node takes part in the consensus protocol, but does not serve traffic.<br> Default value: NSACL_NODEST_PASSIVE<br> Possible values = ACTIVE, SPARE, PASSIVE
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The interface to be used to communicate with the other cluster nodes. The interface must be specified in the three-tuple form, n/c/u, where n represents the node ID.<br> Minimum length =  1
	* </pre>
	*/
	public void set_backplane(String backplane) throws Exception{
		this.backplane = backplane;
	}

	/**
	* <pre>
	* The interface to be used to communicate with the other cluster nodes. The interface must be specified in the three-tuple form, n/c/u, where n represents the node ID.<br> Minimum length =  1
	* </pre>
	*/
	public String get_backplane() throws Exception {
		return this.backplane;
	}

	/**
	* <pre>
	* Node clusterd state.<br> Possible values = UP, Configurations of the node are lagging behind the cluster by more than 256 commands, The config sync operation has exceeded the time limit of 60 seconds, The config sync operation (full sync) is in progress, The node is not in sync with the cluster configurations as sync is disabled on this node, The execution of a configuration command has failed on this node, UNKNOWN
	* </pre>
	*/
	public String get_clusterhealth() throws Exception {
		return this.clusterhealth;
	}

	/**
	* <pre>
	* Node effective health state.<br> Possible values = UP, NOT UP, UNKNOWN, INIT
	* </pre>
	*/
	public String get_effectivestate() throws Exception {
		return this.effectivestate;
	}

	/**
	* <pre>
	* Node Operational Reconciliation state.<br> Default value: ENABLED<br> Possible values = ENABLED, SUCCESS, IN PROGRESS, FAILED, INCREMENTAL SYNC DISABLED, DISABLED, UNKNOWN
	* </pre>
	*/
	public String get_operationalsyncstate() throws Exception {
		return this.operationalsyncstate;
	}

	/**
	* <pre>
	* Node Master state.<br> Possible values = INACTIVE, ACTIVE, UNKNOWN
	* </pre>
	*/
	public String get_masterstate() throws Exception {
		return this.masterstate;
	}

	/**
	* <pre>
	* Node Health state.<br> Possible values = UNKNOWN, INIT, DOWN, UP, Some enabled and HAMON interfaces of the node are down, All interfaces of the node are down or disabled, SSL card(s) of the node have failed, Route Monitor(s) of the node have failed, Service state is being synchronized with the cluster, The backplane interface is not set,  is down,  or is disabled, The CLAG member(s) of the node are down, Persistence sessions are being synchronized with the cluster, The Syn Cookie is being synchronized with the cluster, Unknown Health
	* </pre>
	*/
	public String get_health() throws Exception {
		return this.health;
	}

	/**
	* <pre>
	* This argument is used to determine whether the node is configuration coordinator (CCO).
	* </pre>
	*/
	public Boolean get_isconfigurationcoordinator() throws Exception {
		return this.isconfigurationcoordinator;
	}

	/**
	* <pre>
	* This argument is used to determine whether it is local node.
	* </pre>
	*/
	public Boolean get_islocalnode() throws Exception {
		return this.islocalnode;
	}

	/**
	* <pre>
	* This argument is used to determine if there is a RSS key mismatch at cluster node level.
	* </pre>
	*/
	public Boolean get_nodersskeymismatch() throws Exception {
		return this.nodersskeymismatch;
	}

	/**
	* <pre>
	* This argument is used to determine if there is a License mismatch at cluster node level.
	* </pre>
	*/
	public Boolean get_nodelicensemismatch() throws Exception {
		return this.nodelicensemismatch;
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
	* Use this API to add clusternode.
	*/
	public static base_response add(nitro_service client, clusternode resource) throws Exception {
		clusternode addresource = new clusternode();
		addresource.nodeid = resource.nodeid;
		addresource.ipaddress = resource.ipaddress;
		addresource.state = resource.state;
		addresource.backplane = resource.backplane;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add clusternode resources.
	*/
	public static base_responses add(nitro_service client, clusternode resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternode addresources[] = new clusternode[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new clusternode();
				addresources[i].nodeid = resources[i].nodeid;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].state = resources[i].state;
				addresources[i].backplane = resources[i].backplane;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update clusternode.
	*/
	public static base_response update(nitro_service client, clusternode resource) throws Exception {
		clusternode updateresource = new clusternode();
		updateresource.nodeid = resource.nodeid;
		updateresource.state = resource.state;
		updateresource.backplane = resource.backplane;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update clusternode resources.
	*/
	public static base_responses update(nitro_service client, clusternode resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternode updateresources[] = new clusternode[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new clusternode();
				updateresources[i].nodeid = resources[i].nodeid;
				updateresources[i].state = resources[i].state;
				updateresources[i].backplane = resources[i].backplane;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of clusternode resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, Long nodeid, String args[]) throws Exception {
		clusternode unsetresource = new clusternode();
		unsetresource.nodeid = nodeid;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of clusternode resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, clusternode resource, String[] args) throws Exception{
		clusternode unsetresource = new clusternode();
		unsetresource.nodeid = resource.nodeid;
		unsetresource.state = resource.state;
		unsetresource.backplane = resource.backplane;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of clusternode resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Long nodeid[], String args[]) throws Exception {
		base_responses result = null;
		if (nodeid != null && nodeid.length > 0) {
			clusternode unsetresources[] = new clusternode[nodeid.length];
			for (int i=0;i<nodeid.length;i++){
				unsetresources[i] = new clusternode();
				unsetresources[i].nodeid = nodeid[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of clusternode resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, clusternode resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternode unsetresources[] = new clusternode[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new clusternode();
				unsetresources[i].nodeid = resources[i].nodeid;
				unsetresources[i].state = resources[i].state;
				unsetresources[i].backplane = resources[i].backplane;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to delete clusternode of given name.
	*/
	public static base_response delete(nitro_service client, Long nodeid) throws Exception {
		clusternode deleteresource = new clusternode();
		deleteresource.nodeid = nodeid;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete clusternode.
	*/
	public static base_response delete(nitro_service client, clusternode resource) throws Exception {
		clusternode deleteresource = new clusternode();
		deleteresource.nodeid = resource.nodeid;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete clusternode resources of given names.
	*/
	public static base_responses delete(nitro_service client, Long nodeid[]) throws Exception {
		base_responses result = null;
		if (nodeid != null && nodeid.length > 0) {
			clusternode deleteresources[] = new clusternode[nodeid.length];
			for (int i=0;i<nodeid.length;i++){
				deleteresources[i] = new clusternode();
				deleteresources[i].nodeid = nodeid[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete clusternode resources.
	*/
	public static base_responses delete(nitro_service client, clusternode resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternode deleteresources[] = new clusternode[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new clusternode();
				deleteresources[i].nodeid = resources[i].nodeid;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the clusternode resources that are configured on netscaler.
	*/
	public static clusternode[] get(nitro_service service) throws Exception{
		clusternode obj = new clusternode();
		clusternode[] response = (clusternode[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the clusternode resources that are configured on netscaler.
	*/
	public static clusternode[] get(nitro_service service, options option) throws Exception{
		clusternode obj = new clusternode();
		clusternode[] response = (clusternode[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch clusternode resource of given name .
	*/
	public static clusternode get(nitro_service service, Long nodeid) throws Exception{
		clusternode obj = new clusternode();
		obj.set_nodeid(nodeid);
		clusternode response = (clusternode) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch clusternode resources of given names .
	*/
	public static clusternode[] get(nitro_service service, Long nodeid[]) throws Exception{
		if (nodeid !=null && nodeid.length>0) {
			clusternode response[] = new clusternode[nodeid.length];
			clusternode obj[] = new clusternode[nodeid.length];
			for (int i=0;i<nodeid.length;i++) {
				obj[i] = new clusternode();
				obj[i].set_nodeid(nodeid[i]);
				response[i] = (clusternode) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of clusternode resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static clusternode[] get_filtered(nitro_service service, String filter) throws Exception{
		clusternode obj = new clusternode();
		options option = new options();
		option.set_filter(filter);
		clusternode[] response = (clusternode[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of clusternode resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static clusternode[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		clusternode obj = new clusternode();
		options option = new options();
		option.set_filter(filter);
		clusternode[] response = (clusternode[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the clusternode resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		clusternode obj = new clusternode();
		options option = new options();
		option.set_count(true);
		clusternode[] response = (clusternode[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of clusternode resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		clusternode obj = new clusternode();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		clusternode[] response = (clusternode[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of clusternode resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		clusternode obj = new clusternode();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		clusternode[] response = (clusternode[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ACTIVE = "ACTIVE";
		public static final String SPARE = "SPARE";
		public static final String PASSIVE = "PASSIVE";
	}
	public static class operationalsyncstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String SUCCESS = "SUCCESS";
		public static final String IN_PROGRESS = "IN PROGRESS";
		public static final String FAILED = "FAILED";
		public static final String INCREMENTAL_SYNC_DISABLED = "INCREMENTAL SYNC DISABLED";
		public static final String DISABLED = "DISABLED";
		public static final String UNKNOWN = "UNKNOWN";
	}
	public static class effectivestateEnum {
		public static final String UP = "UP";
		public static final String NOT_UP = "NOT UP";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String INIT = "INIT";
	}
	public static class healthEnum {
		public static final String UNKNOWN = "UNKNOWN";
		public static final String INIT = "INIT";
		public static final String DOWN = "DOWN";
		public static final String UP = "UP";
		public static final String Some_enabled_and_HAMON_interfaces_of_the_node_are_down = "Some enabled and HAMON interfaces of the node are down";
		public static final String All_interfaces_of_the_node_are_down_or_disabled = "All interfaces of the node are down or disabled";
		public static final String SSL_card_s__of_the_node_have_failed = "SSL card(s) of the node have failed";
		public static final String Route_Monitor_s__of_the_node_have_failed = "Route Monitor(s) of the node have failed";
		public static final String Service_state_is_being_synchronized_with_the_cluster = "Service state is being synchronized with the cluster";
		public static final String The_backplane_interface_is_not_set = "The backplane interface is not set";
		public static final String _is_down = " is down";
		public static final String _or_is_disabled = " or is disabled";
		public static final String The_CLAG_member_s__of_the_node_are_down = "The CLAG member(s) of the node are down";
		public static final String Persistence_sessions_are_being_synchronized_with_the_cluster = "Persistence sessions are being synchronized with the cluster";
		public static final String The_Syn_Cookie_is_being_synchronized_with_the_cluster = "The Syn Cookie is being synchronized with the cluster";
		public static final String Unknown_Health = "Unknown Health";
	}
	public static class clusterhealthEnum {
		public static final String UP = "UP";
		public static final String Configurations_of_the_node_are_lagging_behind_the_cluster_by_more_than_256_commands = "Configurations of the node are lagging behind the cluster by more than 256 commands";
		public static final String The_config_sync_operation_has_exceeded_the_time_limit_of_60_seconds = "The config sync operation has exceeded the time limit of 60 seconds";
		public static final String The_config_sync_operation__full_sync__is_in_progress = "The config sync operation (full sync) is in progress";
		public static final String The_node_is_not_in_sync_with_the_cluster_configurations_as_sync_is_disabled_on_this_node = "The node is not in sync with the cluster configurations as sync is disabled on this node";
		public static final String The_execution_of_a_configuration_command_has_failed_on_this_node = "The execution of a configuration command has failed on this node";
		public static final String UNKNOWN = "UNKNOWN";
	}
	public static class masterstateEnum {
		public static final String INACTIVE = "INACTIVE";
		public static final String ACTIVE = "ACTIVE";
		public static final String UNKNOWN = "UNKNOWN";
	}
}
