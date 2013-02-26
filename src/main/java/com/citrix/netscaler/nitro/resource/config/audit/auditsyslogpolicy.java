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

package com.citrix.netscaler.nitro.resource.config.audit;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class auditsyslogpolicy_response extends base_response
{
	public auditsyslogpolicy[] auditsyslogpolicy;
}
/**
* Configuration for system log policy resource.
*/

public class auditsyslogpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of syslog policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of syslog policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of the rule or expression that the policy will use. Currently supports only the rule "ns_true".<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The name of the rule or expression that the policy will use. Currently supports only the rule "ns_true".<br> Minimum length =  1
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the syslog action to be bound to the the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The name of the syslog action to be bound to the the policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		auditsyslogpolicy_response result = (auditsyslogpolicy_response) service.get_payload_formatter().string_to_resource(auditsyslogpolicy_response.class, response);
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
		return result.auditsyslogpolicy;
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
	* Use this API to add auditsyslogpolicy.
	*/
	public static base_response add(nitro_service client, auditsyslogpolicy resource) throws Exception {
		auditsyslogpolicy addresource = new auditsyslogpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add auditsyslogpolicy resources.
	*/
	public static base_responses add(nitro_service client, auditsyslogpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditsyslogpolicy addresources[] = new auditsyslogpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new auditsyslogpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditsyslogpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		auditsyslogpolicy deleteresource = new auditsyslogpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditsyslogpolicy.
	*/
	public static base_response delete(nitro_service client, auditsyslogpolicy resource) throws Exception {
		auditsyslogpolicy deleteresource = new auditsyslogpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditsyslogpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			auditsyslogpolicy deleteresources[] = new auditsyslogpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new auditsyslogpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditsyslogpolicy resources.
	*/
	public static base_responses delete(nitro_service client, auditsyslogpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditsyslogpolicy deleteresources[] = new auditsyslogpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new auditsyslogpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update auditsyslogpolicy.
	*/
	public static base_response update(nitro_service client, auditsyslogpolicy resource) throws Exception {
		auditsyslogpolicy updateresource = new auditsyslogpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update auditsyslogpolicy resources.
	*/
	public static base_responses update(nitro_service client, auditsyslogpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditsyslogpolicy updateresources[] = new auditsyslogpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new auditsyslogpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the auditsyslogpolicy resources that are configured on netscaler.
	*/
	public static auditsyslogpolicy[] get(nitro_service service) throws Exception{
		auditsyslogpolicy obj = new auditsyslogpolicy();
		auditsyslogpolicy[] response = (auditsyslogpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the auditsyslogpolicy resources that are configured on netscaler.
	*/
	public static auditsyslogpolicy[] get(nitro_service service, options option) throws Exception{
		auditsyslogpolicy obj = new auditsyslogpolicy();
		auditsyslogpolicy[] response = (auditsyslogpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch auditsyslogpolicy resource of given name .
	*/
	public static auditsyslogpolicy get(nitro_service service, String name) throws Exception{
		auditsyslogpolicy obj = new auditsyslogpolicy();
		obj.set_name(name);
		auditsyslogpolicy response = (auditsyslogpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch auditsyslogpolicy resources of given names .
	*/
	public static auditsyslogpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			auditsyslogpolicy response[] = new auditsyslogpolicy[name.length];
			auditsyslogpolicy obj[] = new auditsyslogpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new auditsyslogpolicy();
				obj[i].set_name(name[i]);
				response[i] = (auditsyslogpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of auditsyslogpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static auditsyslogpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		auditsyslogpolicy obj = new auditsyslogpolicy();
		options option = new options();
		option.set_filter(filter);
		auditsyslogpolicy[] response = (auditsyslogpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of auditsyslogpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static auditsyslogpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditsyslogpolicy obj = new auditsyslogpolicy();
		options option = new options();
		option.set_filter(filter);
		auditsyslogpolicy[] response = (auditsyslogpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the auditsyslogpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		auditsyslogpolicy obj = new auditsyslogpolicy();
		options option = new options();
		option.set_count(true);
		auditsyslogpolicy[] response = (auditsyslogpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of auditsyslogpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		auditsyslogpolicy obj = new auditsyslogpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditsyslogpolicy[] response = (auditsyslogpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of auditsyslogpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditsyslogpolicy obj = new auditsyslogpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditsyslogpolicy[] response = (auditsyslogpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
}
