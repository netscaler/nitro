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

class tmtrafficpolicy_response extends base_response
{
	public tmtrafficpolicy[] tmtrafficpolicy;
}
/**
* Configuration for TM traffic policy resource.
*/

public class tmtrafficpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long __count;

	/**
	* <pre>
	* The name for the new vpn traffic policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new vpn traffic policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule to be used by the vpn traffic policy. Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule to be used by the vpn traffic policy. Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The action to be applied by the policy if its rule is matched.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The action to be applied by the policy if its rule is matched.<br> Minimum length =  1
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
		tmtrafficpolicy_response result = (tmtrafficpolicy_response) service.get_payload_formatter().string_to_resource(tmtrafficpolicy_response.class, response);
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
		return result.tmtrafficpolicy;
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
	* Use this API to add tmtrafficpolicy.
	*/
	public static base_response add(nitro_service client, tmtrafficpolicy resource) throws Exception {
		tmtrafficpolicy addresource = new tmtrafficpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add tmtrafficpolicy resources.
	*/
	public static base_responses add(nitro_service client, tmtrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficpolicy addresources[] = new tmtrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new tmtrafficpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmtrafficpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		tmtrafficpolicy deleteresource = new tmtrafficpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmtrafficpolicy.
	*/
	public static base_response delete(nitro_service client, tmtrafficpolicy resource) throws Exception {
		tmtrafficpolicy deleteresource = new tmtrafficpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmtrafficpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmtrafficpolicy deleteresources[] = new tmtrafficpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new tmtrafficpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmtrafficpolicy resources.
	*/
	public static base_responses delete(nitro_service client, tmtrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficpolicy deleteresources[] = new tmtrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new tmtrafficpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update tmtrafficpolicy.
	*/
	public static base_response update(nitro_service client, tmtrafficpolicy resource) throws Exception {
		tmtrafficpolicy updateresource = new tmtrafficpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update tmtrafficpolicy resources.
	*/
	public static base_responses update(nitro_service client, tmtrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficpolicy updateresources[] = new tmtrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new tmtrafficpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmtrafficpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		tmtrafficpolicy unsetresource = new tmtrafficpolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of tmtrafficpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tmtrafficpolicy resource, String[] args) throws Exception{
		tmtrafficpolicy unsetresource = new tmtrafficpolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.action = resource.action;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of tmtrafficpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmtrafficpolicy unsetresources[] = new tmtrafficpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new tmtrafficpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmtrafficpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, tmtrafficpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficpolicy unsetresources[] = new tmtrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new tmtrafficpolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].action = resources[i].action;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the tmtrafficpolicy resources that are configured on netscaler.
	*/
	public static tmtrafficpolicy[] get(nitro_service service) throws Exception{
		tmtrafficpolicy obj = new tmtrafficpolicy();
		tmtrafficpolicy[] response = (tmtrafficpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the tmtrafficpolicy resources that are configured on netscaler.
	*/
	public static tmtrafficpolicy[] get(nitro_service service, options option) throws Exception{
		tmtrafficpolicy obj = new tmtrafficpolicy();
		tmtrafficpolicy[] response = (tmtrafficpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch tmtrafficpolicy resource of given name .
	*/
	public static tmtrafficpolicy get(nitro_service service, String name) throws Exception{
		tmtrafficpolicy obj = new tmtrafficpolicy();
		obj.set_name(name);
		tmtrafficpolicy response = (tmtrafficpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmtrafficpolicy resources of given names .
	*/
	public static tmtrafficpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmtrafficpolicy response[] = new tmtrafficpolicy[name.length];
			tmtrafficpolicy obj[] = new tmtrafficpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmtrafficpolicy();
				obj[i].set_name(name[i]);
				response[i] = (tmtrafficpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of tmtrafficpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static tmtrafficpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		tmtrafficpolicy obj = new tmtrafficpolicy();
		options option = new options();
		option.set_filter(filter);
		tmtrafficpolicy[] response = (tmtrafficpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of tmtrafficpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static tmtrafficpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmtrafficpolicy obj = new tmtrafficpolicy();
		options option = new options();
		option.set_filter(filter);
		tmtrafficpolicy[] response = (tmtrafficpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the tmtrafficpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		tmtrafficpolicy obj = new tmtrafficpolicy();
		options option = new options();
		option.set_count(true);
		tmtrafficpolicy[] response = (tmtrafficpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of tmtrafficpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		tmtrafficpolicy obj = new tmtrafficpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmtrafficpolicy[] response = (tmtrafficpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of tmtrafficpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmtrafficpolicy obj = new tmtrafficpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmtrafficpolicy[] response = (tmtrafficpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
