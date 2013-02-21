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

class lbvserver_csvserver_binding_response extends base_response
{
	public lbvserver_csvserver_binding[] lbvserver_csvserver_binding;
}
/**
	* Binding class showing the csvserver that can be bound to lbvserver.
	*/

public class lbvserver_csvserver_binding extends base_resource
{
	private String cachevserver;
	private String policyname;
	private String cachetype;
	private Long priority;
	private Long hits;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Priority.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Name of the policy bound to the LB vserver.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name of the policy bound to the LB vserver.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
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
	* Cache virtual server.
	* </pre>
	*/
	public void set_cachevserver(String cachevserver) throws Exception{
		this.cachevserver = cachevserver;
	}

	/**
	* <pre>
	* Cache virtual server.
	* </pre>
	*/
	public String get_cachevserver() throws Exception {
		return this.cachevserver;
	}

	/**
	* <pre>
	* Cache type.<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* Number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbvserver_csvserver_binding_response result = (lbvserver_csvserver_binding_response) service.get_payload_formatter().string_to_resource(lbvserver_csvserver_binding_response.class, response);
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
		return result.lbvserver_csvserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch lbvserver_csvserver_binding resources of given name .
	*/
	public static lbvserver_csvserver_binding[] get(nitro_service service, String name) throws Exception{
		lbvserver_csvserver_binding obj = new lbvserver_csvserver_binding();
		obj.set_name(name);
		lbvserver_csvserver_binding response[] = (lbvserver_csvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver_csvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbvserver_csvserver_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		lbvserver_csvserver_binding obj = new lbvserver_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbvserver_csvserver_binding[] response = (lbvserver_csvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver_csvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbvserver_csvserver_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbvserver_csvserver_binding obj = new lbvserver_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbvserver_csvserver_binding[] response = (lbvserver_csvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbvserver_csvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		lbvserver_csvserver_binding obj = new lbvserver_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		lbvserver_csvserver_binding response[] = (lbvserver_csvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver_csvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		lbvserver_csvserver_binding obj = new lbvserver_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver_csvserver_binding[] response = (lbvserver_csvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver_csvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbvserver_csvserver_binding obj = new lbvserver_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver_csvserver_binding[] response = (lbvserver_csvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cachetypeEnum {
		public static final String TRANSPARENT = "TRANSPARENT";
		public static final String REVERSE = "REVERSE";
		public static final String FORWARD = "FORWARD";
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