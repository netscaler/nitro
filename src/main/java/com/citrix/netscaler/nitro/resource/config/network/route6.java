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

class route6_response extends base_response
{
	public route6[] route6;
}
/**
* Configuration for route 6 resource.
*/

public class route6 extends base_resource
{
	private String network;
	private String gateway;
	private Long vlan;
	private Long weight;
	private Long distance;
	private Long cost;
	private String advertise;
	private String msr;
	private String monitor;
	private Long td;
	private String routetype;
	private Boolean detail;

	//------- Read only Parameter ---------;

	private String gatewayname;
	private Boolean type;
	private Boolean dynamic;
	private Boolean data;
	private Boolean flags;
	private Long state;
	private Long totalprobes;
	private Long totalfailedprobes;
	private Long failedprobes;
	private Integer monstatcode;
	private Integer monstatparam1;
	private Integer monstatparam2;
	private Integer monstatparam3;
	private String data1;
	private String[] routeowners;
	private Integer retain;
	private Boolean Static;
	private Boolean permanent;
	private Boolean connected;
	private Boolean ospfv3;
	private Boolean isis;
	private Boolean active;
	private Boolean bgp;
	private Boolean rip;
	private Boolean raroute;
	private Long __count;

	/**
	* <pre>
	* IPv6 network address for which to add a route entry to the routing table of the NetScaler appliance.
	* </pre>
	*/
	public void set_network(String network) throws Exception{
		this.network = network;
	}

	/**
	* <pre>
	* IPv6 network address for which to add a route entry to the routing table of the NetScaler appliance.
	* </pre>
	*/
	public String get_network() throws Exception {
		return this.network;
	}

	/**
	* <pre>
	* The gateway for this route. The value for this parameter is either an IPv6 address or null.
	* </pre>
	*/
	public void set_gateway(String gateway) throws Exception{
		this.gateway = gateway;
	}

	/**
	* <pre>
	* The gateway for this route. The value for this parameter is either an IPv6 address or null.
	* </pre>
	*/
	public String get_gateway() throws Exception {
		return this.gateway;
	}

	/**
	* <pre>
	* Integer value that uniquely identifies a VLAN through which the NetScaler appliance forwards the packets for this route.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* Integer value that uniquely identifies a VLAN through which the NetScaler appliance forwards the packets for this route.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* Integer value that uniquely identifies a VLAN through which the NetScaler appliance forwards the packets for this route.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* Positive integer used by the routing algorithms to determine preference for this route over others of equal cost. The lower the weight, the higher the preference.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Positive integer used by the routing algorithms to determine preference for this route over others of equal cost. The lower the weight, the higher the preference.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Positive integer used by the routing algorithms to determine preference for this route over others of equal cost. The lower the weight, the higher the preference.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* Administrative distance of this route from the appliance.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_distance(long distance) throws Exception {
		this.distance = new Long(distance);
	}

	/**
	* <pre>
	* Administrative distance of this route from the appliance.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_distance(Long distance) throws Exception{
		this.distance = distance;
	}

	/**
	* <pre>
	* Administrative distance of this route from the appliance.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public Long get_distance() throws Exception {
		return this.distance;
	}

	/**
	* <pre>
	* Positive integer used by the routing algorithms to determine preference for this route. The lower the cost, the higher the preference.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_cost(long cost) throws Exception {
		this.cost = new Long(cost);
	}

	/**
	* <pre>
	* Positive integer used by the routing algorithms to determine preference for this route. The lower the cost, the higher the preference.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_cost(Long cost) throws Exception{
		this.cost = cost;
	}

	/**
	* <pre>
	* Positive integer used by the routing algorithms to determine preference for this route. The lower the cost, the higher the preference.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_cost() throws Exception {
		return this.cost;
	}

	/**
	* <pre>
	* Advertise this route.<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public void set_advertise(String advertise) throws Exception{
		this.advertise = advertise;
	}

	/**
	* <pre>
	* Advertise this route.<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public String get_advertise() throws Exception {
		return this.advertise;
	}

	/**
	* <pre>
	* Monitor this route witha monitor of type ND6 or PING.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_msr(String msr) throws Exception{
		this.msr = msr;
	}

	/**
	* <pre>
	* Monitor this route witha monitor of type ND6 or PING.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_msr() throws Exception {
		return this.msr;
	}

	/**
	* <pre>
	* Name of the monitor, of type ND6 or PING, configured on the NetScaler appliance to monitor this route.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitor(String monitor) throws Exception{
		this.monitor = monitor;
	}

	/**
	* <pre>
	* Name of the monitor, of type ND6 or PING, configured on the NetScaler appliance to monitor this route.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitor() throws Exception {
		return this.monitor;
	}

	/**
	* <pre>
	* Traffic Domain Id for IPv6 network.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain Id for IPv6 network.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain Id for IPv6 network.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* Type of IPv6 routes to remove from the routing table of the NetScaler appliance.<br> Possible values = CONNECTED, STATIC, DYNAMIC, OSPF, ISIS, BGP, RIP, ND-RA-ROUTE, FIB6
	* </pre>
	*/
	public void set_routetype(String routetype) throws Exception{
		this.routetype = routetype;
	}

	/**
	* <pre>
	* Type of IPv6 routes to remove from the routing table of the NetScaler appliance.<br> Possible values = CONNECTED, STATIC, DYNAMIC, OSPF, ISIS, BGP, RIP, ND-RA-ROUTE, FIB6
	* </pre>
	*/
	public String get_routetype() throws Exception {
		return this.routetype;
	}

	/**
	* <pre>
	* To get a detailed view.
	* </pre>
	*/
	public void set_detail(boolean detail) throws Exception {
		this.detail = new Boolean(detail);
	}

	/**
	* <pre>
	* To get a detailed view.
	* </pre>
	*/
	public void set_detail(Boolean detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* To get a detailed view.
	* </pre>
	*/
	public Boolean get_detail() throws Exception {
		return this.detail;
	}

	/**
	* <pre>
	* The name of the gateway for this route.
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
	* Whether this route is dynamically learned or not.
	* </pre>
	*/
	public Boolean get_dynamic() throws Exception {
		return this.dynamic;
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
	* For a dynamic route, the routing protocol from which the route was learned.
	* </pre>
	*/
	public Boolean get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Whether this route is UP or DOWN.
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
	* Current number of failed monitoring probes.
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
	* First parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam1() throws Exception {
		return this.monstatparam1;
	}

	/**
	* <pre>
	* Second parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam2() throws Exception {
		return this.monstatparam2;
	}

	/**
	* <pre>
	* Third parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam3() throws Exception {
		return this.monstatparam3;
	}

	/**
	* <pre>
	* Internal data of this route.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_data1() throws Exception {
		return this.data1;
	}

	/**
	* <pre>
	* Use this option with -dynamic and in a cluster only to specify the set of nodes from which this dynamic route has been learnt.<br> Possible values = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31
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
	* Static route.
	* </pre>
	*/
	public Boolean get_Static() throws Exception {
		return this.Static;
	}

	/**
	* <pre>
	* Permanent Route.
	* </pre>
	*/
	public Boolean get_permanent() throws Exception {
		return this.permanent;
	}

	/**
	* <pre>
	* Connected Route.
	* </pre>
	*/
	public Boolean get_connected() throws Exception {
		return this.connected;
	}

	/**
	* <pre>
	* For a dynamic route, the routing protocol from which the route was learned.
	* </pre>
	*/
	public Boolean get_ospfv3() throws Exception {
		return this.ospfv3;
	}

	/**
	* <pre>
	* If this route is dynamic then which routing protocol was it learnt from.
	* </pre>
	*/
	public Boolean get_isis() throws Exception {
		return this.isis;
	}

	/**
	* <pre>
	* For a dynamic route, the routing protocol from which the route was learned.
	* </pre>
	*/
	public Boolean get_active() throws Exception {
		return this.active;
	}

	/**
	* <pre>
	* For a dynamic route, the routing protocol from which the route was learned.
	* </pre>
	*/
	public Boolean get_bgp() throws Exception {
		return this.bgp;
	}

	/**
	* <pre>
	*  For a dynamic route, the routing protocol from which the route was learned.
	* </pre>
	*/
	public Boolean get_rip() throws Exception {
		return this.rip;
	}

	/**
	* <pre>
	*  For a dynamic route, the routing protocol from which the route was learned.
	* </pre>
	*/
	public Boolean get_raroute() throws Exception {
		return this.raroute;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		route6_response result = (route6_response) service.get_payload_formatter().string_to_resource(route6_response.class, response);
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
		return result.route6;
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
	* Use this API to add route6.
	*/
	public static base_response add(nitro_service client, route6 resource) throws Exception {
		route6 addresource = new route6();
		addresource.network = resource.network;
		addresource.gateway = resource.gateway;
		addresource.vlan = resource.vlan;
		addresource.weight = resource.weight;
		addresource.distance = resource.distance;
		addresource.cost = resource.cost;
		addresource.advertise = resource.advertise;
		addresource.msr = resource.msr;
		addresource.monitor = resource.monitor;
		addresource.td = resource.td;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add route6 resources.
	*/
	public static base_responses add(nitro_service client, route6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route6 addresources[] = new route6[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new route6();
				addresources[i].network = resources[i].network;
				addresources[i].gateway = resources[i].gateway;
				addresources[i].vlan = resources[i].vlan;
				addresources[i].weight = resources[i].weight;
				addresources[i].distance = resources[i].distance;
				addresources[i].cost = resources[i].cost;
				addresources[i].advertise = resources[i].advertise;
				addresources[i].msr = resources[i].msr;
				addresources[i].monitor = resources[i].monitor;
				addresources[i].td = resources[i].td;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to clear route6.
	*/
	public static base_response clear(nitro_service client, route6 resource) throws Exception {
		route6 clearresource = new route6();
		clearresource.routetype = resource.routetype;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear route6 resources.
	*/
	public static base_responses clear(nitro_service client, route6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route6 clearresources[] = new route6[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new route6();
				clearresources[i].routetype = resources[i].routetype;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to delete route6 of given name.
	*/
	public static base_response delete(nitro_service client, String network) throws Exception {
		route6 deleteresource = new route6();
		deleteresource.network = network;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete route6.
	*/
	public static base_response delete(nitro_service client, route6 resource) throws Exception {
		route6 deleteresource = new route6();
		deleteresource.network = resource.network;
		deleteresource.gateway = resource.gateway;
		deleteresource.vlan = resource.vlan;
		deleteresource.td = resource.td;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete route6 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String network[]) throws Exception {
		base_responses result = null;
		if (network != null && network.length > 0) {
			route6 deleteresources[] = new route6[network.length];
			for (int i=0;i<network.length;i++){
				deleteresources[i] = new route6();
				deleteresources[i].network = network[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete route6 resources.
	*/
	public static base_responses delete(nitro_service client, route6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route6 deleteresources[] = new route6[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new route6();
				deleteresources[i].network = resources[i].network;
				deleteresources[i].gateway = resources[i].gateway;
				deleteresources[i].vlan = resources[i].vlan;
				deleteresources[i].td = resources[i].td;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update route6.
	*/
	public static base_response update(nitro_service client, route6 resource) throws Exception {
		route6 updateresource = new route6();
		updateresource.network = resource.network;
		updateresource.gateway = resource.gateway;
		updateresource.vlan = resource.vlan;
		updateresource.weight = resource.weight;
		updateresource.distance = resource.distance;
		updateresource.cost = resource.cost;
		updateresource.advertise = resource.advertise;
		updateresource.msr = resource.msr;
		updateresource.monitor = resource.monitor;
		updateresource.td = resource.td;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update route6 resources.
	*/
	public static base_responses update(nitro_service client, route6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route6 updateresources[] = new route6[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new route6();
				updateresources[i].network = resources[i].network;
				updateresources[i].gateway = resources[i].gateway;
				updateresources[i].vlan = resources[i].vlan;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].distance = resources[i].distance;
				updateresources[i].cost = resources[i].cost;
				updateresources[i].advertise = resources[i].advertise;
				updateresources[i].msr = resources[i].msr;
				updateresources[i].monitor = resources[i].monitor;
				updateresources[i].td = resources[i].td;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of route6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String network, String args[]) throws Exception {
		route6 unsetresource = new route6();
		unsetresource.network = network;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of route6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, route6 resource, String[] args) throws Exception{
		route6 unsetresource = new route6();
		unsetresource.network = resource.network;
		unsetresource.gateway = resource.gateway;
		unsetresource.vlan = resource.vlan;
		unsetresource.td = resource.td;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of route6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String network[], String args[]) throws Exception {
		base_responses result = null;
		if (network != null && network.length > 0) {
			route6 unsetresources[] = new route6[network.length];
			for (int i=0;i<network.length;i++){
				unsetresources[i] = new route6();
				unsetresources[i].network = network[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of route6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, route6 resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			route6 unsetresources[] = new route6[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new route6();
				unsetresources[i].network = resources[i].network;
				unsetresources[i].gateway = resources[i].gateway;
				unsetresources[i].vlan = resources[i].vlan;
				unsetresources[i].td = resources[i].td;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the route6 resources that are configured on netscaler.
	*/
	public static route6[] get(nitro_service service) throws Exception{
		route6 obj = new route6();
		route6[] response = (route6[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the route6 resources that are configured on netscaler.
	*/
	public static route6[] get(nitro_service service, options option) throws Exception{
		route6 obj = new route6();
		route6[] response = (route6[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a route6 resource.
	*/
	public static route6 get(nitro_service service, route6 obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		route6 response = (route6) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a route6 resources.
	*/
	public static route6[] get(nitro_service service, route6 obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			route6 response[] = new route6[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (route6) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the route6 resources that are configured on netscaler.
	* This uses route6_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static route6[] get(nitro_service service, route6_args args) throws Exception{
		route6 obj = new route6();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		route6[] response = (route6[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of route6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static route6[] get_filtered(nitro_service service, String filter) throws Exception{
		route6 obj = new route6();
		options option = new options();
		option.set_filter(filter);
		route6[] response = (route6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of route6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static route6[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		route6 obj = new route6();
		options option = new options();
		option.set_filter(filter);
		route6[] response = (route6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the route6 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		route6 obj = new route6();
		options option = new options();
		option.set_count(true);
		route6[] response = (route6[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of route6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		route6 obj = new route6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		route6[] response = (route6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of route6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		route6 obj = new route6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		route6[] response = (route6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class routeownersEnum {
		public static final String _0 = "0";
		public static final String _1 = "1";
		public static final String _2 = "2";
		public static final String _3 = "3";
		public static final String _4 = "4";
		public static final String _5 = "5";
		public static final String _6 = "6";
		public static final String _7 = "7";
		public static final String _8 = "8";
		public static final String _9 = "9";
		public static final String _10 = "10";
		public static final String _11 = "11";
		public static final String _12 = "12";
		public static final String _13 = "13";
		public static final String _14 = "14";
		public static final String _15 = "15";
		public static final String _16 = "16";
		public static final String _17 = "17";
		public static final String _18 = "18";
		public static final String _19 = "19";
		public static final String _20 = "20";
		public static final String _21 = "21";
		public static final String _22 = "22";
		public static final String _23 = "23";
		public static final String _24 = "24";
		public static final String _25 = "25";
		public static final String _26 = "26";
		public static final String _27 = "27";
		public static final String _28 = "28";
		public static final String _29 = "29";
		public static final String _30 = "30";
		public static final String _31 = "31";
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
		public static final String BGP = "BGP";
		public static final String RIP = "RIP";
		public static final String ND_RA_ROUTE = "ND-RA-ROUTE";
		public static final String FIB6 = "FIB6";
	}
	public static class msrEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class data1Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
