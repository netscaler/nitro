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

package com.citrix.netscaler.nitro.resource.config.appqoe;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appqoepolicy_response extends base_response
{
	public appqoepolicy[] appqoepolicy;
}
/**
* Configuration for AppQoS policy resource.
*/

public class appqoepolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long __count;

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression or name of a named expression, against which the request is evaluated. The policy is applied if the rule evaluates to true.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression or name of a named expression, against which the request is evaluated. The policy is applied if the rule evaluates to true.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Configured AppQoE action to trigger.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Configured AppQoE action to trigger.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
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
		appqoepolicy_response result = (appqoepolicy_response) service.get_payload_formatter().string_to_resource(appqoepolicy_response.class, response);
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
		return result.appqoepolicy;
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
	* Use this API to add appqoepolicy.
	*/
	public static base_response add(nitro_service client, appqoepolicy resource) throws Exception {
		appqoepolicy addresource = new appqoepolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appqoepolicy resources.
	*/
	public static base_responses add(nitro_service client, appqoepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoepolicy addresources[] = new appqoepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appqoepolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appqoepolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appqoepolicy deleteresource = new appqoepolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appqoepolicy.
	*/
	public static base_response delete(nitro_service client, appqoepolicy resource) throws Exception {
		appqoepolicy deleteresource = new appqoepolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appqoepolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appqoepolicy deleteresources[] = new appqoepolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appqoepolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appqoepolicy resources.
	*/
	public static base_responses delete(nitro_service client, appqoepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoepolicy deleteresources[] = new appqoepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appqoepolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update appqoepolicy.
	*/
	public static base_response update(nitro_service client, appqoepolicy resource) throws Exception {
		appqoepolicy updateresource = new appqoepolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appqoepolicy resources.
	*/
	public static base_responses update(nitro_service client, appqoepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoepolicy updateresources[] = new appqoepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appqoepolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the appqoepolicy resources that are configured on netscaler.
	*/
	public static appqoepolicy[] get(nitro_service service) throws Exception{
		appqoepolicy obj = new appqoepolicy();
		appqoepolicy[] response = (appqoepolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appqoepolicy resources that are configured on netscaler.
	*/
	public static appqoepolicy[] get(nitro_service service, options option) throws Exception{
		appqoepolicy obj = new appqoepolicy();
		appqoepolicy[] response = (appqoepolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appqoepolicy resource of given name .
	*/
	public static appqoepolicy get(nitro_service service, String name) throws Exception{
		appqoepolicy obj = new appqoepolicy();
		obj.set_name(name);
		appqoepolicy response = (appqoepolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appqoepolicy resources of given names .
	*/
	public static appqoepolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appqoepolicy response[] = new appqoepolicy[name.length];
			appqoepolicy obj[] = new appqoepolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appqoepolicy();
				obj[i].set_name(name[i]);
				response[i] = (appqoepolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appqoepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appqoepolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		appqoepolicy obj = new appqoepolicy();
		options option = new options();
		option.set_filter(filter);
		appqoepolicy[] response = (appqoepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appqoepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appqoepolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appqoepolicy obj = new appqoepolicy();
		options option = new options();
		option.set_filter(filter);
		appqoepolicy[] response = (appqoepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appqoepolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appqoepolicy obj = new appqoepolicy();
		options option = new options();
		option.set_count(true);
		appqoepolicy[] response = (appqoepolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appqoepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appqoepolicy obj = new appqoepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appqoepolicy[] response = (appqoepolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appqoepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appqoepolicy obj = new appqoepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appqoepolicy[] response = (appqoepolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
