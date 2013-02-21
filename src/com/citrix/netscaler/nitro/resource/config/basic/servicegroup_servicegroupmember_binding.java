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

class servicegroup_servicegroupmember_binding_response extends base_response
{
	public servicegroup_servicegroupmember_binding[] servicegroup_servicegroupmember_binding;
}
/**
	* Binding class showing the servicegroupmember that can be bound to servicegroup.
	*/

public class servicegroup_servicegroupmember_binding extends base_resource
{
	private String ip;
	private Integer port;
	private String svrstate;
	private Long weight;
	private String servername;
	private String customserverid;
	private Long serverid;
	private String state;
	private Long hashid;
	private String graceful;
	private Long delay;
	private String servicegroupname;
	private Long __count;

	/**
	* <pre>
	* The name of the service group to which the service will be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of the service group to which the service will be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* IP Address.
	* </pre>
	*/
	public void set_ip(String ip) throws Exception{
		this.ip = ip;
	}

	/**
	* <pre>
	* IP Address.
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* The port number of the member to be changed.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* The port number of the member to be changed.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* The port number of the member to be changed.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The state of the service group after it is added.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the service group after it is added.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(long hashid) throws Exception {
		this.hashid = new Long(hashid);
	}

	/**
	* <pre>
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(Long hashid) throws Exception{
		this.hashid = hashid;
	}

	/**
	* <pre>
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_hashid() throws Exception {
		return this.hashid;
	}

	/**
	* <pre>
	* A positive integer to identify the service. Used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public void set_serverid(long serverid) throws Exception {
		this.serverid = new Long(serverid);
	}

	/**
	* <pre>
	* A positive integer to identify the service. Used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public void set_serverid(Long serverid) throws Exception{
		this.serverid = serverid;
	}

	/**
	* <pre>
	* A positive integer to identify the service. Used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public Long get_serverid() throws Exception {
		return this.serverid;
	}

	/**
	* <pre>
	* The name of the server to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* The name of the server to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* A positive integer to identify the service. Used when the persistency type is set to Custom Server ID.<br> Default value: "None"
	* </pre>
	*/
	public void set_customserverid(String customserverid) throws Exception{
		this.customserverid = customserverid;
	}

	/**
	* <pre>
	* A positive integer to identify the service. Used when the persistency type is set to Custom Server ID.<br> Default value: "None"
	* </pre>
	*/
	public String get_customserverid() throws Exception {
		return this.customserverid;
	}

	/**
	* <pre>
	* when used along with monitor name, it specifies the weight of the monitor binding. When used along with servername & port pair, specifies the weight of this service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* when used along with monitor name, it specifies the weight of the monitor binding. When used along with servername & port pair, specifies the weight of this service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* when used along with monitor name, it specifies the weight of the monitor binding. When used along with servername & port pair, specifies the weight of this service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The state of the service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_svrstate() throws Exception {
		return this.svrstate;
	}

	/**
	* <pre>
	* The time allowed (in seconds) for a graceful shutdown. During this period, new connections or requests will continue to be sent to this service for clients who already have a persistent session on the system. Connections or requests from fresh or new clients who do not yet have a persistence sessions on the system will not be sent to the service. Instead, they will be load balanced among other available services. After the delay time expires, no new requests or connections will be sent to the service.
	* </pre>
	*/
	public Long get_delay() throws Exception {
		return this.delay;
	}

	/**
	* <pre>
	* Indicates graceful shutdown of the service. System will wait for all outstanding connections to this service to be closed before disabling the service.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_graceful() throws Exception {
		return this.graceful;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		servicegroup_servicegroupmember_binding_response result = (servicegroup_servicegroupmember_binding_response) service.get_payload_formatter().string_to_resource(servicegroup_servicegroupmember_binding_response.class, response);
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
		return result.servicegroup_servicegroupmember_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	public static base_response add(nitro_service client, servicegroup_servicegroupmember_binding resource) throws Exception {
		servicegroup_servicegroupmember_binding updateresource = new servicegroup_servicegroupmember_binding();
		updateresource.servicegroupname = resource.servicegroupname;
		updateresource.ip = resource.ip;
		updateresource.servername = resource.servername;
		updateresource.port = resource.port;
		updateresource.weight = resource.weight;
		updateresource.customserverid = resource.customserverid;
		updateresource.serverid = resource.serverid;
		updateresource.state = resource.state;
		updateresource.hashid = resource.hashid;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, servicegroup_servicegroupmember_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup_servicegroupmember_binding updateresources[] = new servicegroup_servicegroupmember_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new servicegroup_servicegroupmember_binding();
				updateresources[i].servicegroupname = resources[i].servicegroupname;
				updateresources[i].ip = resources[i].ip;
				updateresources[i].servername = resources[i].servername;
				updateresources[i].port = resources[i].port;
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

	public static base_response delete(nitro_service client, servicegroup_servicegroupmember_binding resource) throws Exception {
		servicegroup_servicegroupmember_binding deleteresource = new servicegroup_servicegroupmember_binding();
		deleteresource.servicegroupname = resource.servicegroupname;
		deleteresource.ip = resource.ip;
		deleteresource.servername = resource.servername;
		deleteresource.port = resource.port;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, servicegroup_servicegroupmember_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup_servicegroupmember_binding deleteresources[] = new servicegroup_servicegroupmember_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new servicegroup_servicegroupmember_binding();
				deleteresources[i].servicegroupname = resources[i].servicegroupname;
				deleteresources[i].ip = resources[i].ip;
				deleteresources[i].servername = resources[i].servername;
				deleteresources[i].port = resources[i].port;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch servicegroup_servicegroupmember_binding resources of given name .
	*/
	public static servicegroup_servicegroupmember_binding[] get(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_servicegroupmember_binding obj = new servicegroup_servicegroupmember_binding();
		obj.set_servicegroupname(servicegroupname);
		servicegroup_servicegroupmember_binding response[] = (servicegroup_servicegroupmember_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of servicegroup_servicegroupmember_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static servicegroup_servicegroupmember_binding[] get_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		servicegroup_servicegroupmember_binding obj = new servicegroup_servicegroupmember_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		servicegroup_servicegroupmember_binding[] response = (servicegroup_servicegroupmember_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of servicegroup_servicegroupmember_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static servicegroup_servicegroupmember_binding[] get_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		servicegroup_servicegroupmember_binding obj = new servicegroup_servicegroupmember_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		servicegroup_servicegroupmember_binding[] response = (servicegroup_servicegroupmember_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count servicegroup_servicegroupmember_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_servicegroupmember_binding obj = new servicegroup_servicegroupmember_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		servicegroup_servicegroupmember_binding response[] = (servicegroup_servicegroupmember_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of servicegroup_servicegroupmember_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		servicegroup_servicegroupmember_binding obj = new servicegroup_servicegroupmember_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		servicegroup_servicegroupmember_binding[] response = (servicegroup_servicegroupmember_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of servicegroup_servicegroupmember_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		servicegroup_servicegroupmember_binding obj = new servicegroup_servicegroupmember_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		servicegroup_servicegroupmember_binding[] response = (servicegroup_servicegroupmember_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class svrstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
	}
	public static class dup_stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class gracefulEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}