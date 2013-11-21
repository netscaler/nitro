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

class servicegroup_servicegroupentitymonbindings_binding_response extends base_response
{
	public servicegroup_servicegroupentitymonbindings_binding[] servicegroup_servicegroupentitymonbindings_binding;
}
/**
	* Binding class showing the servicegroupentitymonbindings that can be bound to servicegroup.
	*/

public class servicegroup_servicegroupentitymonbindings_binding extends base_resource
{
	private String servicegroupentname2;
	private String monitor_name;
	private String servicegroupname;
	private Integer port;
	private Long weight;
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
	* .
	* </pre>
	*/
	public void set_servicegroupentname2(String servicegroupentname2) throws Exception{
		this.servicegroupentname2 = servicegroupentname2;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_servicegroupentname2() throws Exception {
		return this.servicegroupentname2;
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
	* .<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* .<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* .<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		servicegroup_servicegroupentitymonbindings_binding_response result = (servicegroup_servicegroupentitymonbindings_binding_response) service.get_payload_formatter().string_to_resource(servicegroup_servicegroupentitymonbindings_binding_response.class, response);
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
		return result.servicegroup_servicegroupentitymonbindings_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to fetch servicegroup_servicegroupentitymonbindings_binding resources of given name .
	*/
	public static servicegroup_servicegroupentitymonbindings_binding[] get(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_servicegroupentitymonbindings_binding obj = new servicegroup_servicegroupentitymonbindings_binding();
		obj.set_servicegroupname(servicegroupname);
		servicegroup_servicegroupentitymonbindings_binding response[] = (servicegroup_servicegroupentitymonbindings_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of servicegroup_servicegroupentitymonbindings_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static servicegroup_servicegroupentitymonbindings_binding[] get_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		servicegroup_servicegroupentitymonbindings_binding obj = new servicegroup_servicegroupentitymonbindings_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		servicegroup_servicegroupentitymonbindings_binding[] response = (servicegroup_servicegroupentitymonbindings_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of servicegroup_servicegroupentitymonbindings_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static servicegroup_servicegroupentitymonbindings_binding[] get_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		servicegroup_servicegroupentitymonbindings_binding obj = new servicegroup_servicegroupentitymonbindings_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		servicegroup_servicegroupentitymonbindings_binding[] response = (servicegroup_servicegroupentitymonbindings_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count servicegroup_servicegroupentitymonbindings_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_servicegroupentitymonbindings_binding obj = new servicegroup_servicegroupentitymonbindings_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		servicegroup_servicegroupentitymonbindings_binding response[] = (servicegroup_servicegroupentitymonbindings_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of servicegroup_servicegroupentitymonbindings_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		servicegroup_servicegroupentitymonbindings_binding obj = new servicegroup_servicegroupentitymonbindings_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		servicegroup_servicegroupentitymonbindings_binding[] response = (servicegroup_servicegroupentitymonbindings_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of servicegroup_servicegroupentitymonbindings_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		servicegroup_servicegroupentitymonbindings_binding obj = new servicegroup_servicegroupentitymonbindings_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		servicegroup_servicegroupentitymonbindings_binding[] response = (servicegroup_servicegroupentitymonbindings_binding[]) obj.getfiltered(service, option);
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