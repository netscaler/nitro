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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class csvserver_lbvserver_binding_response extends base_response
{
	public csvserver_lbvserver_binding[] csvserver_lbvserver_binding;
}
/**
	* Binding class showing the lbvserver that can be bound to csvserver.
	*/

public class csvserver_lbvserver_binding extends base_resource
{
	private String lbvserver;
	private Long hits;
	private String name;
	private String targetvserver;
	private Long __count;

	/**
	* <pre>
	* Name of the content switching virtual server to which the content switching policy applies.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the content switching virtual server to which the content switching policy applies.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The virtual server name (created with the add lb vserver command) to which content will be switched.<br> Minimum length =  1
	* </pre>
	*/
	public void set_targetvserver(String targetvserver) throws Exception{
		this.targetvserver = targetvserver;
	}

	/**
	* <pre>
	* The virtual server name (created with the add lb vserver command) to which content will be switched.<br> Minimum length =  1
	* </pre>
	*/
	public String get_targetvserver() throws Exception {
		return this.targetvserver;
	}

	/**
	* <pre>
	* Name of the default lb vserver bound. Use this param for Default binding only. For Example: bind cs vserver cs1 -lbvserver lb1.<br> Minimum length =  1
	* </pre>
	*/
	public void set_lbvserver(String lbvserver) throws Exception{
		this.lbvserver = lbvserver;
	}

	/**
	* <pre>
	* Name of the default lb vserver bound. Use this param for Default binding only. For Example: bind cs vserver cs1 -lbvserver lb1.<br> Minimum length =  1
	* </pre>
	*/
	public String get_lbvserver() throws Exception {
		return this.lbvserver;
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
		csvserver_lbvserver_binding_response result = (csvserver_lbvserver_binding_response) service.get_payload_formatter().string_to_resource(csvserver_lbvserver_binding_response.class, response);
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
		return result.csvserver_lbvserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, csvserver_lbvserver_binding resource) throws Exception {
		csvserver_lbvserver_binding updateresource = new csvserver_lbvserver_binding();
		updateresource.name = resource.name;
		updateresource.lbvserver = resource.lbvserver;
		updateresource.targetvserver = resource.targetvserver;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, csvserver_lbvserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver_lbvserver_binding updateresources[] = new csvserver_lbvserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new csvserver_lbvserver_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].lbvserver = resources[i].lbvserver;
				updateresources[i].targetvserver = resources[i].targetvserver;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, csvserver_lbvserver_binding resource) throws Exception {
		csvserver_lbvserver_binding deleteresource = new csvserver_lbvserver_binding();
		deleteresource.name = resource.name;
		deleteresource.lbvserver = resource.lbvserver;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, csvserver_lbvserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver_lbvserver_binding deleteresources[] = new csvserver_lbvserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new csvserver_lbvserver_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].lbvserver = resources[i].lbvserver;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch csvserver_lbvserver_binding resources of given name .
	*/
	public static csvserver_lbvserver_binding[] get(nitro_service service, String name) throws Exception{
		csvserver_lbvserver_binding obj = new csvserver_lbvserver_binding();
		obj.set_name(name);
		csvserver_lbvserver_binding response[] = (csvserver_lbvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of csvserver_lbvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static csvserver_lbvserver_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		csvserver_lbvserver_binding obj = new csvserver_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		csvserver_lbvserver_binding[] response = (csvserver_lbvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of csvserver_lbvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static csvserver_lbvserver_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		csvserver_lbvserver_binding obj = new csvserver_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		csvserver_lbvserver_binding[] response = (csvserver_lbvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count csvserver_lbvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		csvserver_lbvserver_binding obj = new csvserver_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		csvserver_lbvserver_binding response[] = (csvserver_lbvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of csvserver_lbvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		csvserver_lbvserver_binding obj = new csvserver_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csvserver_lbvserver_binding[] response = (csvserver_lbvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of csvserver_lbvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		csvserver_lbvserver_binding obj = new csvserver_lbvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csvserver_lbvserver_binding[] response = (csvserver_lbvserver_binding[]) obj.getfiltered(service, option);
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