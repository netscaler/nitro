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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbvserver_servicegroup_binding_response extends base_response
{
	public lbvserver_servicegroup_binding[] lbvserver_servicegroup_binding;
}
/**
	* Binding class showing the servicegroup that can be bound to lbvserver.
	*/

public class lbvserver_servicegroup_binding extends base_resource
{
	private String servicegroupname;
	private String servicename;
	private String name;
	private Long weight;
	private Long __count;

	/**
	* <pre>
	* Weight for this service. This weight is used when the system performs load balancing, giving greater priority to a specific service. It is useful when the services bound to a virtual server are of different capacity.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Weight for this service. This weight is used when the system performs load balancing, giving greater priority to a specific service. It is useful when the services bound to a virtual server are of different capacity.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Weight for this service. This weight is used when the system performs load balancing, giving greater priority to a specific service. It is useful when the services bound to a virtual server are of different capacity.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The virtual server name to which the service is bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The virtual server name to which the service is bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The service name bound to the selected load balancing virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The service name bound to the selected load balancing virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The service group name bound to the selected load balancing virtual server.
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The service group name bound to the selected load balancing virtual server.
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbvserver_servicegroup_binding_response result = (lbvserver_servicegroup_binding_response) service.get_payload_formatter().string_to_resource(lbvserver_servicegroup_binding_response.class, response);
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
		return result.lbvserver_servicegroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, lbvserver_servicegroup_binding resource) throws Exception {
		lbvserver_servicegroup_binding updateresource = new lbvserver_servicegroup_binding();
		updateresource.name = resource.name;
		updateresource.servicename = resource.servicename;
		updateresource.weight = resource.weight;
		updateresource.servicegroupname = resource.servicegroupname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, lbvserver_servicegroup_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver_servicegroup_binding updateresources[] = new lbvserver_servicegroup_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbvserver_servicegroup_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].servicegroupname = resources[i].servicegroupname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, lbvserver_servicegroup_binding resource) throws Exception {
		lbvserver_servicegroup_binding deleteresource = new lbvserver_servicegroup_binding();
		deleteresource.name = resource.name;
		deleteresource.servicename = resource.servicename;
		deleteresource.servicegroupname = resource.servicegroupname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, lbvserver_servicegroup_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver_servicegroup_binding deleteresources[] = new lbvserver_servicegroup_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbvserver_servicegroup_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].servicename = resources[i].servicename;
				deleteresources[i].servicegroupname = resources[i].servicegroupname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch lbvserver_servicegroup_binding resources of given name .
	*/
	public static lbvserver_servicegroup_binding[] get(nitro_service service, String name) throws Exception{
		lbvserver_servicegroup_binding obj = new lbvserver_servicegroup_binding();
		obj.set_name(name);
		lbvserver_servicegroup_binding response[] = (lbvserver_servicegroup_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver_servicegroup_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbvserver_servicegroup_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		lbvserver_servicegroup_binding obj = new lbvserver_servicegroup_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbvserver_servicegroup_binding[] response = (lbvserver_servicegroup_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver_servicegroup_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbvserver_servicegroup_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbvserver_servicegroup_binding obj = new lbvserver_servicegroup_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbvserver_servicegroup_binding[] response = (lbvserver_servicegroup_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbvserver_servicegroup_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		lbvserver_servicegroup_binding obj = new lbvserver_servicegroup_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		lbvserver_servicegroup_binding response[] = (lbvserver_servicegroup_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver_servicegroup_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		lbvserver_servicegroup_binding obj = new lbvserver_servicegroup_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver_servicegroup_binding[] response = (lbvserver_servicegroup_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver_servicegroup_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbvserver_servicegroup_binding obj = new lbvserver_servicegroup_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver_servicegroup_binding[] response = (lbvserver_servicegroup_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}

}