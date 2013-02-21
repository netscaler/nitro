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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class route_response extends base_response
{
	public route[] route;
}
/**
* Configuration for route resource.
*/

public class route extends base_resource
{
	private String network;
	private String netmask;
	private String gateway;
	private Long cost;
	private Long distance;
	private Long cost1;
	private Long weight;
	private String advertise;
	private String[] protocol;
	private String msr;
	private String monitor;
	private String routetype;
	private Boolean detail;

	//------- Read only Parameter ---------;

	private String gatewayname;
	private Boolean type;
	private Boolean dynamic;
	private Boolean Static;
	private Boolean permanent;
	private Boolean direct;
	private Boolean nat;
	private Boolean lbroute;
	private Boolean adv;
	private Boolean tunnel;
	private Boolean data;
	private Boolean data0;
	private Boolean flags;
	private String[] routeowners;
	private Integer retain;
	private Boolean ospf;
	private Boolean isis;
	private Boolean rip;
	private Boolean bgp;
	private Boolean dhcp;
	private Boolean advospf;
	private Boolean advisis;
	private Boolean advrip;
	private Boolean advbgp;
	private Long state;
	private Long totalprobes;
	private Long totalfailedprobes;
	private Long failedprobes;
	private Integer monstatcode;
	private Integer monstatparam1;
	private Integer monstatparam2;
	private Integer monstatparam3;
	private Long __count;

	/**
	* <pre>
	* An IPv4 network address for which you want to add a route entry in the routing table of the NetScaler appliance.
	* </pre>
	*/
	public void set_network(String network) throws Exception{
		this.network = network;
	}

	/**
	* <pre>
	* An IPv4 network address for which you want to add a route entry in the routing table of the NetScaler appliance.
	* </pre>
	*/
	public String get_network() throws Exception {
		return this.network;
	}

	/**
	* <pre>
	* The subnet mask associated with the network address.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The subnet mask associated with the network address.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The IP address of the gateway for this route. Can be null to specify a null-interface route.<br> Minimum length =  1
	* </pre>
	*/
	public void set_gateway(String gateway) throws Exception{
		this.gateway = gateway;
	}

	/**
	* <pre>
	* The IP address of the gateway for this route. Can be null to specify a null-interface route.<br> Minimum length =  1
	* </pre>
	*/
	public String get_gateway() throws Exception {
		return this.gateway;
	}

	/**
	* <pre>
	* The cost of a route is used to compare routes of the same type. The route having the lowest cost is the most preferred route. Possible values: 0 through 65535. Default: 0.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_cost(long cost) throws Exception {
		this.cost = new Long(cost);
	}

	/**
	* <pre>
	* The cost of a route is used to compare routes of the same type. The route having the lowest cost is the most preferred route. Possible values: 0 through 65535. Default: 0.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_cost(Long cost) throws Exception{
		this.cost = cost;
	}

	/**
	* <pre>
	* The cost of a route is used to compare routes of the same type. The route having the lowest cost is the most preferred route. Possible values: 0 through 65535. Default: 0.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_cost() throws Exception {
		return this.cost;
	}

	/**
	* <pre>
	* Administrative distance of this route from the appliance.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_distance(long distance) throws Exception {
		this.distance = new Long(distance);
	}

	/**
	* <pre>
	* Administrative distance of this route from the appliance.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_distance(Long distance) throws Exception{
		this.distance = distance;
	}

	/**
	* <pre>
	* Administrative distance of this route from the appliance.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public Long get_distance() throws Exception {
		return this.distance;
	}

	/**
	* <pre>
	* The cost of a route is used to compare routes of the same type. The route having the lowest cost is the most preferred route. Possible values: 0 through 65535. Default: 0.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_cost1(long cost1) throws Exception {
		this.cost1 = new Long(cost1);
	}

	/**
	* <pre>
	* The cost of a route is used to compare routes of the same type. The route having the lowest cost is the most preferred route. Possible values: 0 through 65535. Default: 0.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_cost1(Long cost1) throws Exception{
		this.cost1 = cost1;
	}

	/**
	* <pre>
	* The cost of a route is used to compare routes of the same type. The route having the lowest cost is the most preferred route. Possible values: 0 through 65535. Default: 0.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_cost1() throws Exception {
		return this.cost1;
	}

	/**
	* <pre>
	* Value to facilitate balancing the load on ECMP routes. This value is compared with the hashed value of the packet, and a route is then chosen. Specific to ECMP routes.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Value to facilitate balancing the load on ECMP routes. This value is compared with the hashed value of the packet, and a route is then chosen. Specific to ECMP routes.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Value to facilitate balancing the load on ECMP routes. This value is compared with the hashed value of the packet, and a route is then chosen. Specific to ECMP routes.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* State of advertisement of this route by dynamic routing protocols.<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public void set_advertise(String advertise) throws Exception{
		this.advertise = advertise;
	}

	/**
	* <pre>
	* State of advertisement of this route by dynamic routing protocols.<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public String get_advertise() throws Exception {
		return this.advertise;
	}

	/**
	* <pre>
	* Routing protocols used for advertising routes if route advertisement is enabled.
             Note: For this setting to work, you must configure the dynamic routing protocol from the VTYSH command line. For more information about configuring dynamic routing protocols on the NetScaler appliance, see the “Dynamic Routing” chapter of the Citrix NetScaler Networking Guide. .<br> Possible values = OSPF, ISIS, RIP, BGP
	* </pre>
	*/
	public void set_protocol(String[] protocol) throws Exception{
		this.protocol = protocol;
	}

	/**
	* <pre>
	* Routing protocols used for advertising routes if route advertisement is enabled.
             Note: For this setting to work, you must configure the dynamic routing protocol from the VTYSH command line. For more information about configuring dynamic routing protocols on the NetScaler appliance, see the “Dynamic Routing” chapter of the Citrix NetScaler Networking Guide. .<br> Possible values = OSPF, ISIS, RIP, BGP
	* </pre>
	*/
	public String[] get_protocol() throws Exception {
		return this.protocol;
	}

	/**
	* <pre>
	* Monitor this route to verify its reachability through the gateway.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_msr(String msr) throws Exception{
		this.msr = msr;
	}

	/**
	* <pre>
	* Monitor this route to verify its reachability through the gateway.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_msr() throws Exception {
		return this.msr;
	}

	/**
	* <pre>
	* A PING or ARP monitor to monitor the static route.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitor(String monitor) throws Exception{
		this.monitor = monitor;
	}

	/**
	* <pre>
	* A PING or ARP monitor to monitor the static route.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitor() throws Exception {
		return this.monitor;
	}

	/**
	* <pre>
	* The type of the route.<br> Possible values = CONNECTED, STATIC, DYNAMIC, OSPF, ISIS, RIP, BGP
	* </pre>
	*/
	public void set_routetype(String routetype) throws Exception{
		this.routetype = routetype;
	}

	/**
	* <pre>
	* The type of the route.<br> Possible values = CONNECTED, STATIC, DYNAMIC, OSPF, ISIS, RIP, BGP
	* </pre>
	*/
	public String get_routetype() throws Exception {
		return this.routetype;
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public void set_detail(boolean detail) throws Exception {
		this.detail = new Boolean(detail);
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public void set_detail(Boolean detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public Boolean get_detail() throws Exception {
		return this.detail;
	}

	/**
	* <pre>
	* The name of the gateway for this route. For a route other than a link load balancing (LLB) route, this value is null.
	* </pre>
	*/
	public String get_gatewayname() throws Exception {
		return this.gatewayname;
	}

	/**
	* <pre>
	* State of the RNAT.
	* </pre>
	*/
	public Boolean get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* State of the route.
	* </pre>
	*/
	public Boolean get_dynamic() throws Exception {
		return this.dynamic;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_Static() throws Exception {
		return this.Static;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_permanent() throws Exception {
		return this.permanent;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_direct() throws Exception {
		return this.direct;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_nat() throws Exception {
		return this.nat;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_lbroute() throws Exception {
		return this.lbroute;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_adv() throws Exception {
		return this.adv;
	}

	/**
	* <pre>
	* Show whether it is a tunnel route or not.
	* </pre>
	*/
	public Boolean get_tunnel() throws Exception {
		return this.tunnel;
	}

	/**
	* <pre>
	* Internal data of this route.
	* </pre>
	*/
	public Boolean get_data() throws Exception {
		return this.data;
	}

	/**
	* <pre>
	* Internal route type is stored, used for get.
	* </pre>
	*/
	public Boolean get_data0() throws Exception {
		return this.data0;
	}

	/**
	* <pre>
	* If this route is dynamic, the name of the routing protocol from which it was learned.
	* </pre>
	*/
	public Boolean get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Use this option with -dynamic and in a cluster only to specify the set of nodes from which this dynamic route has been learnt.<br> Possible values = 
	* </pre>
	*/
	public String[] get_routeowners() throws Exception {
		return this.routeowners;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Integer get_retain() throws Exception {
		return this.retain;
	}

	/**
	* <pre>
	* OSPF protocol.
	* </pre>
	*/
	public Boolean get_ospf() throws Exception {
		return this.ospf;
	}

	/**
	* <pre>
	* ISIS protocol.
	* </pre>
	*/
	public Boolean get_isis() throws Exception {
		return this.isis;
	}

	/**
	* <pre>
	* RIP protocol.
	* </pre>
	*/
	public Boolean get_rip() throws Exception {
		return this.rip;
	}

	/**
	* <pre>
	* BGP protocol.
	* </pre>
	*/
	public Boolean get_bgp() throws Exception {
		return this.bgp;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_dhcp() throws Exception {
		return this.dhcp;
	}

	/**
	* <pre>
	* Advertised through OSPF protocol.
	* </pre>
	*/
	public Boolean get_advospf() throws Exception {
		return this.advospf;
	}

	/**
	* <pre>
	* Advertised through ISIS protocol.
	* </pre>
	*/
	public Boolean get_advisis() throws Exception {
		return this.advisis;
	}

	/**
	* <pre>
	* Advertised through RIP protocol.
	* </pre>
	*/
	public Boolean get_advrip() throws Exception {
		return this.advrip;
	}

	/**
	* <pre>
	* Advertised through BGP protocol.
	* </pre>
	*/
	public Boolean get_advbgp() throws Exception {
		return this.advbgp;
	}

	/**
	* <pre>
	* The state of the static route. Possible values: UP, DOWN.
	* </pre>
	*/
	public Long get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The total number of probes sent.
	* </pre>
	*/
	public Long get_totalprobes() throws Exception {
		return this.totalprobes;
	}

	/**
	* <pre>
	* The total number of failed probes.
	* </pre>
	*/
	public Long get_totalfailedprobes() throws Exception {
		return this.totalfailedprobes;
	}

	/**
	* <pre>
	* Number of the current failed monitoring probes.
	* </pre>
	*/
	public Long get_failedprobes() throws Exception {
		return this.failedprobes;
	}

	/**
	* <pre>
	* The code indicating the monitor response.
	* </pre>
	*/
	public Integer get_monstatcode() throws Exception {
		return this.monstatcode;
	}

	/**
	* <pre>
	* First parameter used with the message code.
	* </pre>
	*/
	public Integer get_monstatparam1() throws Exception {
		return this.monstatparam1;
	}

	/**
	* <pre>
	* Second parameter used with the message code.
	* </pre>
	*/
	public Integer get_monstatparam2() throws Exception {
		return this.monstatparam2;
	}

	/**
	* <pre>
	* Third parameter used with the message code.
	* </pre>
	*/
	public Integer get_monstatparam3() throws Exception {
		return this.monstatparam3;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		route_response result = (route_response) service.get_payload_formatter().string_to_resource(route_response.class, response);
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
		return result.route;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.network;
	}

	/**
	* Use this API to add route.
	*/
	public static base_response add(nitro_service client, route resource) throws Exception {
		route addresource = new route();
		addresource.network = resource.network;
		addresource.netmask = resource.netmask;
		addresource.gateway = resource.gateway;
		addresource.cost = resource.cost;
		addresource.distance = resource.distance;
		addresource.cost1 = resource.cost1;
		addresource.weight = resource.weight;
		addresource.advertise = resource.advertise;
		addresource.protocol = resource.protocol;
		addresource.msr = resource.msr;
		addresource.monitor = resource.monitor;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add route resources.
	*/
	public static base_responses add(nitro_service client, route resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route addresources[] = new route[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new route();
				addresources[i].network = resources[i].network;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].gateway = resources[i].gateway;
				addresources[i].cost = resources[i].cost;
				addresources[i].distance = resources[i].distance;
				addresources[i].cost1 = resources[i].cost1;
				addresources[i].weight = resources[i].weight;
				addresources[i].advertise = resources[i].advertise;
				addresources[i].protocol = resources[i].protocol;
				addresources[i].msr = resources[i].msr;
				addresources[i].monitor = resources[i].monitor;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to clear route.
	*/
	public static base_response clear(nitro_service client, route resource) throws Exception {
		route clearresource = new route();
		clearresource.routetype = resource.routetype;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear route resources.
	*/
	public static base_responses clear(nitro_service client, route resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route clearresources[] = new route[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new route();
				clearresources[i].routetype = resources[i].routetype;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to delete route of given name.
	*/
	public static base_response delete(nitro_service client, String network) throws Exception {
		route deleteresource = new route();
		deleteresource.network = network;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete route.
	*/
	public static base_response delete(nitro_service client, route resource) throws Exception {
		route deleteresource = new route();
		deleteresource.network = resource.network;
		deleteresource.netmask = resource.netmask;
		deleteresource.gateway = resource.gateway;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete route resources of given names.
	*/
	public static base_responses delete(nitro_service client, String network[]) throws Exception {
		base_responses result = null;
		if (network != null && network.length > 0) {
			route deleteresources[] = new route[network.length];
			for (int i=0;i<network.length;i++){
				deleteresources[i] = new route();
				deleteresources[i].network = network[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete route resources.
	*/
	public static base_responses delete(nitro_service client, route resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route deleteresources[] = new route[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new route();
				deleteresources[i].network = resources[i].network;
				deleteresources[i].netmask = resources[i].netmask;
				deleteresources[i].gateway = resources[i].gateway;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update route.
	*/
	public static base_response update(nitro_service client, route resource) throws Exception {
		route updateresource = new route();
		updateresource.network = resource.network;
		updateresource.netmask = resource.netmask;
		updateresource.gateway = resource.gateway;
		updateresource.distance = resource.distance;
		updateresource.cost1 = resource.cost1;
		updateresource.weight = resource.weight;
		updateresource.advertise = resource.advertise;
		updateresource.protocol = resource.protocol;
		updateresource.msr = resource.msr;
		updateresource.monitor = resource.monitor;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update route resources.
	*/
	public static base_responses update(nitro_service client, route resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route updateresources[] = new route[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new route();
				updateresources[i].network = resources[i].network;
				updateresources[i].netmask = resources[i].netmask;
				updateresources[i].gateway = resources[i].gateway;
				updateresources[i].distance = resources[i].distance;
				updateresources[i].cost1 = resources[i].cost1;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].advertise = resources[i].advertise;
				updateresources[i].protocol = resources[i].protocol;
				updateresources[i].msr = resources[i].msr;
				updateresources[i].monitor = resources[i].monitor;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of route resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String network, String args[]) throws Exception {
		route unsetresource = new route();
		unsetresource.network = network;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of route resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, route resource, String[] args) throws Exception{
		route unsetresource = new route();
		unsetresource.network = resource.network;
		unsetresource.netmask = resource.netmask;
		unsetresource.gateway = resource.gateway;
		unsetresource.advertise = resource.advertise;
		unsetresource.protocol = resource.protocol;
		unsetresource.distance = resource.distance;
		unsetresource.cost1 = resource.cost1;
		unsetresource.weight = resource.weight;
		unsetresource.msr = resource.msr;
		unsetresource.monitor = resource.monitor;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of route resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String network[], String args[]) throws Exception {
		base_responses result = null;
		if (network != null && network.length > 0) {
			route unsetresources[] = new route[network.length];
			for (int i=0;i<network.length;i++){
				unsetresources[i] = new route();
				unsetresources[i].network = network[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of route resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, route resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route unsetresources[] = new route[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new route();
				unsetresources[i].network = resources[i].network;
				unsetresources[i].netmask = resources[i].netmask;
				unsetresources[i].gateway = resources[i].gateway;
				unsetresources[i].advertise = resources[i].advertise;
				unsetresources[i].protocol = resources[i].protocol;
				unsetresources[i].distance = resources[i].distance;
				unsetresources[i].cost1 = resources[i].cost1;
				unsetresources[i].weight = resources[i].weight;
				unsetresources[i].msr = resources[i].msr;
				unsetresources[i].monitor = resources[i].monitor;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the route resources that are configured on netscaler.
	*/
	public static route[] get(nitro_service service) throws Exception{
		route obj = new route();
		route[] response = (route[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the route resources that are configured on netscaler.
	*/
	public static route[] get(nitro_service service, options option) throws Exception{
		route obj = new route();
		route[] response = (route[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a route resource.
	*/
	public static route get(nitro_service service, route obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		route response = (route) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a route resources.
	*/
	public static route[] get(nitro_service service, route obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			route response[] = new route[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (route) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the route resources that are configured on netscaler.
	* This uses route_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static route[] get(nitro_service service, route_args args) throws Exception{
		route obj = new route();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		route[] response = (route[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of route resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static route[] get_filtered(nitro_service service, String filter) throws Exception{
		route obj = new route();
		options option = new options();
		option.set_filter(filter);
		route[] response = (route[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of route resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static route[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		route obj = new route();
		options option = new options();
		option.set_filter(filter);
		route[] response = (route[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the route resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		route obj = new route();
		options option = new options();
		option.set_count(true);
		route[] response = (route[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of route resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		route obj = new route();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		route[] response = (route[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of route resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		route obj = new route();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		route[] response = (route[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class protocolEnum {
		public static final String OSPF = "OSPF";
		public static final String ISIS = "ISIS";
		public static final String RIP = "RIP";
		public static final String BGP = "BGP";
	}
	public static class advertiseEnum {
		public static final String DISABLED = "DISABLED";
		public static final String ENABLED = "ENABLED";
	}
	public static class routetypeEnum {
		public static final String CONNECTED = "CONNECTED";
		public static final String STATIC = "STATIC";
		public static final String DYNAMIC = "DYNAMIC";
		public static final String OSPF = "OSPF";
		public static final String ISIS = "ISIS";
		public static final String RIP = "RIP";
		public static final String BGP = "BGP";
	}
	public static class msrEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
