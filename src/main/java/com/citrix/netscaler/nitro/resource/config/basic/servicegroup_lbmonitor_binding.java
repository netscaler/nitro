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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class servicegroup_lbmonitor_binding_response extends base_response
{
	public servicegroup_lbmonitor_binding[] servicegroup_lbmonitor_binding;
}
/**
	* Binding class showing the lbmonitor that can be bound to servicegroup.
	*/

public class servicegroup_lbmonitor_binding extends base_resource
{
	private String monitor_name;
	private Long monweight;
	private String monstate;
	private Long weight;
	private Boolean passive;
	private String servicegroupname;
	private Integer port;
	private String customserverid;
	private Long serverid;
	private String state;
	private Long hashid;
	private Long __count;

	/**
	* <pre>
	* Name of the service group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* Name of the service group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* Port number of the service. Each service must have a unique port number.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Port number of the service. Each service must have a unique port number.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Port number of the service. Each service must have a unique port number.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Initial state of the service after binding.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Initial state of the service after binding.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Unique numerical identifier used by hash based load balancing methods to identify a service.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(long hashid) throws Exception {
		this.hashid = new Long(hashid);
	}

	/**
	* <pre>
	* Unique numerical identifier used by hash based load balancing methods to identify a service.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(Long hashid) throws Exception{
		this.hashid = hashid;
	}

	/**
	* <pre>
	* Unique numerical identifier used by hash based load balancing methods to identify a service.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_hashid() throws Exception {
		return this.hashid;
	}

	/**
	* <pre>
	* The  identifier for the service. This is used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public void set_serverid(long serverid) throws Exception {
		this.serverid = new Long(serverid);
	}

	/**
	* <pre>
	* The  identifier for the service. This is used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public void set_serverid(Long serverid) throws Exception{
		this.serverid = serverid;
	}

	/**
	* <pre>
	* The  identifier for the service. This is used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public Long get_serverid() throws Exception {
		return this.serverid;
	}

	/**
	* <pre>
	* Unique service identifier. Used when the persistency type for the virtual server is set to Custom Server ID.<br> Default value: "None"
	* </pre>
	*/
	public void set_customserverid(String customserverid) throws Exception{
		this.customserverid = customserverid;
	}

	/**
	* <pre>
	* Unique service identifier. Used when the persistency type for the virtual server is set to Custom Server ID.<br> Default value: "None"
	* </pre>
	*/
	public String get_customserverid() throws Exception {
		return this.customserverid;
	}

	/**
	* <pre>
	* Weight to assign to the servers in the service group. Specifies the capacity of the servers relative to the other servers in the load balancing configuration. The higher the weight, the higher the percentage of requests sent to the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Weight to assign to the servers in the service group. Specifies the capacity of the servers relative to the other servers in the load balancing configuration. The higher the weight, the higher the percentage of requests sent to the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Weight to assign to the servers in the service group. Specifies the capacity of the servers relative to the other servers in the load balancing configuration. The higher the weight, the higher the percentage of requests sent to the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* Monitor name.
	* </pre>
	*/
	public void set_monitor_name(String monitor_name) throws Exception{
		this.monitor_name = monitor_name;
	}

	/**
	* <pre>
	* Monitor name.
	* </pre>
	*/
	public String get_monitor_name() throws Exception {
		return this.monitor_name;
	}

	/**
	* <pre>
	* Indicates if load monitor is passive. A passive load monitor does not remove service from LB decision when threshold is breached.
	* </pre>
	*/
	public void set_passive(boolean passive) throws Exception {
		this.passive = new Boolean(passive);
	}

	/**
	* <pre>
	* Indicates if load monitor is passive. A passive load monitor does not remove service from LB decision when threshold is breached.
	* </pre>
	*/
	public void set_passive(Boolean passive) throws Exception{
		this.passive = passive;
	}

	/**
	* <pre>
	* Indicates if load monitor is passive. A passive load monitor does not remove service from LB decision when threshold is breached.
	* </pre>
	*/
	public Boolean get_passive() throws Exception {
		return this.passive;
	}

	/**
	* <pre>
	* Monitor state.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_monstate(String monstate) throws Exception{
		this.monstate = monstate;
	}

	/**
	* <pre>
	* Monitor state.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_monstate() throws Exception {
		return this.monstate;
	}

	/**
	* <pre>
	* weight of the monitor that is bound to servicegroup.
	* </pre>
	*/
	public Long get_monweight() throws Exception {
		return this.monweight;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		servicegroup_lbmonitor_binding_response result = (servicegroup_lbmonitor_binding_response) service.get_payload_formatter().string_to_resource(servicegroup_lbmonitor_binding_response.class, response);
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
		return result.servicegroup_lbmonitor_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	public static base_response add(nitro_service client, servicegroup_lbmonitor_binding resource) throws Exception {
		servicegroup_lbmonitor_binding updateresource = new servicegroup_lbmonitor_binding();
		updateresource.servicegroupname = resource.servicegroupname;
		updateresource.port = resource.port;
		updateresource.monitor_name = resource.monitor_name;
		updateresource.monstate = resource.monstate;
		updateresource.passive = resource.passive;
		updateresource.weight = resource.weight;
		updateresource.customserverid = resource.customserverid;
		updateresource.serverid = resource.serverid;
		updateresource.state = resource.state;
		updateresource.hashid = resource.hashid;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, servicegroup_lbmonitor_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup_lbmonitor_binding updateresources[] = new servicegroup_lbmonitor_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new servicegroup_lbmonitor_binding();
				updateresources[i].servicegroupname = resources[i].servicegroupname;
				updateresources[i].port = resources[i].port;
				updateresources[i].monitor_name = resources[i].monitor_name;
				updateresources[i].monstate = resources[i].monstate;
				updateresources[i].passive = resources[i].passive;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].customserverid = resources[i].customserverid;
				updateresources[i].serverid = resources[i].serverid;
				updateresources[i].state = resources[i].state;
				updateresources[i].hashid = resources[i].hashid;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, servicegroup_lbmonitor_binding resource) throws Exception {
		servicegroup_lbmonitor_binding deleteresource = new servicegroup_lbmonitor_binding();
		deleteresource.servicegroupname = resource.servicegroupname;
		deleteresource.port = resource.port;
		deleteresource.monitor_name = resource.monitor_name;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, servicegroup_lbmonitor_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup_lbmonitor_binding deleteresources[] = new servicegroup_lbmonitor_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new servicegroup_lbmonitor_binding();
				deleteresources[i].servicegroupname = resources[i].servicegroupname;
				deleteresources[i].port = resources[i].port;
				deleteresources[i].monitor_name = resources[i].monitor_name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch servicegroup_lbmonitor_binding resources of given name .
	*/
	public static servicegroup_lbmonitor_binding[] get(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_lbmonitor_binding obj = new servicegroup_lbmonitor_binding();
		obj.set_servicegroupname(servicegroupname);
		servicegroup_lbmonitor_binding response[] = (servicegroup_lbmonitor_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of servicegroup_lbmonitor_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static servicegroup_lbmonitor_binding[] get_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		servicegroup_lbmonitor_binding obj = new servicegroup_lbmonitor_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		servicegroup_lbmonitor_binding[] response = (servicegroup_lbmonitor_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of servicegroup_lbmonitor_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static servicegroup_lbmonitor_binding[] get_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		servicegroup_lbmonitor_binding obj = new servicegroup_lbmonitor_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		servicegroup_lbmonitor_binding[] response = (servicegroup_lbmonitor_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count servicegroup_lbmonitor_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_lbmonitor_binding obj = new servicegroup_lbmonitor_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		servicegroup_lbmonitor_binding response[] = (servicegroup_lbmonitor_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of servicegroup_lbmonitor_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		servicegroup_lbmonitor_binding obj = new servicegroup_lbmonitor_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		servicegroup_lbmonitor_binding[] response = (servicegroup_lbmonitor_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of servicegroup_lbmonitor_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		servicegroup_lbmonitor_binding obj = new servicegroup_lbmonitor_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		servicegroup_lbmonitor_binding[] response = (servicegroup_lbmonitor_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class monstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}