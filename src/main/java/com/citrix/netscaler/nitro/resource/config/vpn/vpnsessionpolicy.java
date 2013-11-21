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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnsessionpolicy_response extends base_response
{
	public vpnsessionpolicy[] vpnsessionpolicy;
}
/**
* Configuration for VPN session policy resource.
*/

public class vpnsessionpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the new session policy that is applied after the user logs on to Access Gateway.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the new session policy that is applied after the user logs on to Access Gateway.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, specifying the traffic that matches the policy. Can be written in either default or classic syntax. 
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'

The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the \ character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, specifying the traffic that matches the policy. Can be written in either default or classic syntax. 
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'

The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the \ character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Action to be applied by the new session policy if the rule criteria are met.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Action to be applied by the new session policy if the rule criteria are met.<br> Minimum length =  1
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
		vpnsessionpolicy_response result = (vpnsessionpolicy_response) service.get_payload_formatter().string_to_resource(vpnsessionpolicy_response.class, response);
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
		return result.vpnsessionpolicy;
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
	* Use this API to add vpnsessionpolicy.
	*/
	public static base_response add(nitro_service client, vpnsessionpolicy resource) throws Exception {
		vpnsessionpolicy addresource = new vpnsessionpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnsessionpolicy resources.
	*/
	public static base_responses add(nitro_service client, vpnsessionpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnsessionpolicy addresources[] = new vpnsessionpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnsessionpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnsessionpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpnsessionpolicy deleteresource = new vpnsessionpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnsessionpolicy.
	*/
	public static base_response delete(nitro_service client, vpnsessionpolicy resource) throws Exception {
		vpnsessionpolicy deleteresource = new vpnsessionpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnsessionpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnsessionpolicy deleteresources[] = new vpnsessionpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpnsessionpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnsessionpolicy resources.
	*/
	public static base_responses delete(nitro_service client, vpnsessionpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnsessionpolicy deleteresources[] = new vpnsessionpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnsessionpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpnsessionpolicy.
	*/
	public static base_response update(nitro_service client, vpnsessionpolicy resource) throws Exception {
		vpnsessionpolicy updateresource = new vpnsessionpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpnsessionpolicy resources.
	*/
	public static base_responses update(nitro_service client, vpnsessionpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnsessionpolicy updateresources[] = new vpnsessionpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnsessionpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnsessionpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpnsessionpolicy resource, String[] args) throws Exception{
		vpnsessionpolicy unsetresource = new vpnsessionpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpnsessionpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnsessionpolicy unsetresources[] = new vpnsessionpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new vpnsessionpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnsessionpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpnsessionpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnsessionpolicy unsetresources[] = new vpnsessionpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpnsessionpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpnsessionpolicy resources that are configured on netscaler.
	*/
	public static vpnsessionpolicy[] get(nitro_service service) throws Exception{
		vpnsessionpolicy obj = new vpnsessionpolicy();
		vpnsessionpolicy[] response = (vpnsessionpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnsessionpolicy resources that are configured on netscaler.
	*/
	public static vpnsessionpolicy[] get(nitro_service service, options option) throws Exception{
		vpnsessionpolicy obj = new vpnsessionpolicy();
		vpnsessionpolicy[] response = (vpnsessionpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnsessionpolicy resource of given name .
	*/
	public static vpnsessionpolicy get(nitro_service service, String name) throws Exception{
		vpnsessionpolicy obj = new vpnsessionpolicy();
		obj.set_name(name);
		vpnsessionpolicy response = (vpnsessionpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnsessionpolicy resources of given names .
	*/
	public static vpnsessionpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpnsessionpolicy response[] = new vpnsessionpolicy[name.length];
			vpnsessionpolicy obj[] = new vpnsessionpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpnsessionpolicy();
				obj[i].set_name(name[i]);
				response[i] = (vpnsessionpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnsessionpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnsessionpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnsessionpolicy obj = new vpnsessionpolicy();
		options option = new options();
		option.set_filter(filter);
		vpnsessionpolicy[] response = (vpnsessionpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnsessionpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnsessionpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnsessionpolicy obj = new vpnsessionpolicy();
		options option = new options();
		option.set_filter(filter);
		vpnsessionpolicy[] response = (vpnsessionpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnsessionpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnsessionpolicy obj = new vpnsessionpolicy();
		options option = new options();
		option.set_count(true);
		vpnsessionpolicy[] response = (vpnsessionpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnsessionpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnsessionpolicy obj = new vpnsessionpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnsessionpolicy[] response = (vpnsessionpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnsessionpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnsessionpolicy obj = new vpnsessionpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnsessionpolicy[] response = (vpnsessionpolicy[]) obj.getfiltered(service, option);
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
