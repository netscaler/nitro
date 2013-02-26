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

package com.citrix.netscaler.nitro.resource.config.tm;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tmsessionpolicy_response extends base_response
{
	public tmsessionpolicy[] tmsessionpolicy;
}
/**
* Configuration for TM session policy resource.
*/

public class tmsessionpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name for the new tm session policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new tm session policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule to be evaluated in the policy. Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule to be evaluated in the policy. Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The action to be performed when the rule is matched.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The action to be performed when the rule is matched.<br> Minimum length =  1
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
		tmsessionpolicy_response result = (tmsessionpolicy_response) service.get_payload_formatter().string_to_resource(tmsessionpolicy_response.class, response);
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
		return result.tmsessionpolicy;
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
	* Use this API to add tmsessionpolicy.
	*/
	public static base_response add(nitro_service client, tmsessionpolicy resource) throws Exception {
		tmsessionpolicy addresource = new tmsessionpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add tmsessionpolicy resources.
	*/
	public static base_responses add(nitro_service client, tmsessionpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsessionpolicy addresources[] = new tmsessionpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new tmsessionpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmsessionpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		tmsessionpolicy deleteresource = new tmsessionpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmsessionpolicy.
	*/
	public static base_response delete(nitro_service client, tmsessionpolicy resource) throws Exception {
		tmsessionpolicy deleteresource = new tmsessionpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmsessionpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmsessionpolicy deleteresources[] = new tmsessionpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new tmsessionpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmsessionpolicy resources.
	*/
	public static base_responses delete(nitro_service client, tmsessionpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsessionpolicy deleteresources[] = new tmsessionpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new tmsessionpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update tmsessionpolicy.
	*/
	public static base_response update(nitro_service client, tmsessionpolicy resource) throws Exception {
		tmsessionpolicy updateresource = new tmsessionpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update tmsessionpolicy resources.
	*/
	public static base_responses update(nitro_service client, tmsessionpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsessionpolicy updateresources[] = new tmsessionpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new tmsessionpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmsessionpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		tmsessionpolicy unsetresource = new tmsessionpolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of tmsessionpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tmsessionpolicy resource, String[] args) throws Exception{
		tmsessionpolicy unsetresource = new tmsessionpolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.action = resource.action;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of tmsessionpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmsessionpolicy unsetresources[] = new tmsessionpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new tmsessionpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmsessionpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, tmsessionpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsessionpolicy unsetresources[] = new tmsessionpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new tmsessionpolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].action = resources[i].action;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the tmsessionpolicy resources that are configured on netscaler.
	*/
	public static tmsessionpolicy[] get(nitro_service service) throws Exception{
		tmsessionpolicy obj = new tmsessionpolicy();
		tmsessionpolicy[] response = (tmsessionpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the tmsessionpolicy resources that are configured on netscaler.
	*/
	public static tmsessionpolicy[] get(nitro_service service, options option) throws Exception{
		tmsessionpolicy obj = new tmsessionpolicy();
		tmsessionpolicy[] response = (tmsessionpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch tmsessionpolicy resource of given name .
	*/
	public static tmsessionpolicy get(nitro_service service, String name) throws Exception{
		tmsessionpolicy obj = new tmsessionpolicy();
		obj.set_name(name);
		tmsessionpolicy response = (tmsessionpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmsessionpolicy resources of given names .
	*/
	public static tmsessionpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmsessionpolicy response[] = new tmsessionpolicy[name.length];
			tmsessionpolicy obj[] = new tmsessionpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmsessionpolicy();
				obj[i].set_name(name[i]);
				response[i] = (tmsessionpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of tmsessionpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static tmsessionpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		tmsessionpolicy obj = new tmsessionpolicy();
		options option = new options();
		option.set_filter(filter);
		tmsessionpolicy[] response = (tmsessionpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of tmsessionpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static tmsessionpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmsessionpolicy obj = new tmsessionpolicy();
		options option = new options();
		option.set_filter(filter);
		tmsessionpolicy[] response = (tmsessionpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the tmsessionpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		tmsessionpolicy obj = new tmsessionpolicy();
		options option = new options();
		option.set_count(true);
		tmsessionpolicy[] response = (tmsessionpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of tmsessionpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		tmsessionpolicy obj = new tmsessionpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmsessionpolicy[] response = (tmsessionpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of tmsessionpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmsessionpolicy obj = new tmsessionpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmsessionpolicy[] response = (tmsessionpolicy[]) obj.getfiltered(service, option);
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
