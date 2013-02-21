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

class clusterinstance_clusternode_binding_response extends base_response
{
	public clusterinstance_clusternode_binding[] clusterinstance_clusternode_binding;
}
/**
	* Binding class showing the clusternode that can be bound to clusterinstance.
	*/

public class clusterinstance_clusternode_binding extends base_resource
{
	private Long nodeid;
	private String ipaddress;
	private String health;
	private String clusterhealth;
	private String effectivestate;
	private String masterstate;
	private String state;
	private Boolean isconfigurationcoordinator;
	private Boolean islocalnode;
	private Boolean nodersskeymismatch;
	private Boolean nodelicensemismatch;
	private Long clid;
	private Long __count;

	/**
	* <pre>
	* The unique number that identiies a cluster.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_nodeid(long nodeid) throws Exception {
		this.nodeid = new Long(nodeid);
	}

	/**
	* <pre>
	* The unique number that identiies a cluster.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_nodeid(Long nodeid) throws Exception{
		this.nodeid = nodeid;
	}

	/**
	* <pre>
	* The unique number that identiies a cluster.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_nodeid() throws Exception {
		return this.nodeid;
	}

	/**
	* <pre>
	* A unique number that identifies the cluster.<br> Minimum value =  1<br> Maximum value =  16
	* </pre>
	*/
	public void set_clid(long clid) throws Exception {
		this.clid = new Long(clid);
	}

	/**
	* <pre>
	* A unique number that identifies the cluster.<br> Minimum value =  1<br> Maximum value =  16
	* </pre>
	*/
	public void set_clid(Long clid) throws Exception{
		this.clid = clid;
	}

	/**
	* <pre>
	* A unique number that identifies the cluster.<br> Minimum value =  1<br> Maximum value =  16
	* </pre>
	*/
	public Long get_clid() throws Exception {
		return this.clid;
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
	* Node Health state.<br> Possible values = UNKNOWN, INIT, DOWN, UP, Some enabled and HAMON interfaces of the node are down, All interfaces of the node are down or disabled, SSL card(s) of the node have failed, Route Monitor(s) of the node have failed, Service state is being synchronized with the cluster, The backplane interface is not set,  is down,  or is disabled, The CLAG member(s) of the node are down, Persistence sessions are being synchronized with the cluster, The Syn Cookie is being synchronized with the cluster, Unknown Health
	* </pre>
	*/
	public String get_health() throws Exception {
		return this.health;
	}

	/**
	* <pre>
	* Active, Spare or Passive. An active node serves traffic. A spare node serves as a backup for active nodes. A passive node does not serve traffic. This may be useful during temporary maintenance activity where it is desirable that the node takes part in the consensus protocol, but not serve traffic.<br> Default value: NSACL_NODEST_PASSIVE<br> Possible values = ACTIVE, SPARE, PASSIVE
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
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
	* Node clusterd state.<br> Possible values = UP, Configurations of the node are lagging behind the cluster by more than 256 commands, The config sync operation has exceeded the time limit of 60 seconds, The config sync operation (full sync) is in progress, The node is not in sync with the cluster configurations as sync is disabled on this node, The execution of a configuration command has failed on this node, UNKNOWN
	* </pre>
	*/
	public String get_clusterhealth() throws Exception {
		return this.clusterhealth;
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
	* Node effective health state.<br> Possible values = UP, NOT UP, UNKNOWN, INIT
	* </pre>
	*/
	public String get_effectivestate() throws Exception {
		return this.effectivestate;
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
	* Master state.<br> Possible values = INACTIVE, ACTIVE, UNKNOWN
	* </pre>
	*/
	public String get_masterstate() throws Exception {
		return this.masterstate;
	}

	/**
	* <pre>
	* The IP Address of the node.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusterinstance_clusternode_binding_response result = (clusterinstance_clusternode_binding_response) service.get_payload_formatter().string_to_resource(clusterinstance_clusternode_binding_response.class, response);
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
		return result.clusterinstance_clusternode_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.clid != null) {
			return this.clid.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch clusterinstance_clusternode_binding resources of given name .
	*/
	public static clusterinstance_clusternode_binding[] get(nitro_service service, Long clid) throws Exception{
		clusterinstance_clusternode_binding obj = new clusterinstance_clusternode_binding();
		obj.set_clid(clid);
		clusterinstance_clusternode_binding response[] = (clusterinstance_clusternode_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of clusterinstance_clusternode_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static clusterinstance_clusternode_binding[] get_filtered(nitro_service service, Long clid, String filter) throws Exception{
		clusterinstance_clusternode_binding obj = new clusterinstance_clusternode_binding();
		obj.set_clid(clid);
		options option = new options();
		option.set_filter(filter);
		clusterinstance_clusternode_binding[] response = (clusterinstance_clusternode_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of clusterinstance_clusternode_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static clusterinstance_clusternode_binding[] get_filtered(nitro_service service, Long clid, filtervalue[] filter) throws Exception{
		clusterinstance_clusternode_binding obj = new clusterinstance_clusternode_binding();
		obj.set_clid(clid);
		options option = new options();
		option.set_filter(filter);
		clusterinstance_clusternode_binding[] response = (clusterinstance_clusternode_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count clusterinstance_clusternode_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long clid) throws Exception{
		clusterinstance_clusternode_binding obj = new clusterinstance_clusternode_binding();
		obj.set_clid(clid);
		options option = new options();
		option.set_count(true);
		clusterinstance_clusternode_binding response[] = (clusterinstance_clusternode_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of clusterinstance_clusternode_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long clid, String filter) throws Exception{
		clusterinstance_clusternode_binding obj = new clusterinstance_clusternode_binding();
		obj.set_clid(clid);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		clusterinstance_clusternode_binding[] response = (clusterinstance_clusternode_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of clusterinstance_clusternode_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long clid, filtervalue[] filter) throws Exception{
		clusterinstance_clusternode_binding obj = new clusterinstance_clusternode_binding();
		obj.set_clid(clid);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		clusterinstance_clusternode_binding[] response = (clusterinstance_clusternode_binding[]) obj.getfiltered(service, option);
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