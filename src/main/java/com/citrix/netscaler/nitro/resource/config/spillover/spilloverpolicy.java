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

package com.citrix.netscaler.nitro.resource.config.spillover;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class spilloverpolicy_response extends base_response
{
	public spilloverpolicy[] spilloverpolicy;
}
/**
* Configuration for Spillover policy resource.
*/

public class spilloverpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;
	private String comment;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name of the spillover policy.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the spillover policy.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression to be used by the spillover policy.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression to be used by the spillover policy.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Action for the spillover policy. Action is created using add spillover action command.
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Action for the spillover policy. Action is created using add spillover action command.
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Any comments that you might want to associate with the spillover policy.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments that you might want to associate with the spillover policy.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* New name for the spillover policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
Choose a name that reflects the function that the policy performs. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my policy" or 'my policy').<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the spillover policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
Choose a name that reflects the function that the policy performs. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my policy" or 'my policy').<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The number of times the policy has been hit.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Number of policy UNDEF hits.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* Flag to determine if compression policy is builtin or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		spilloverpolicy_response result = (spilloverpolicy_response) service.get_payload_formatter().string_to_resource(spilloverpolicy_response.class, response);
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
		return result.spilloverpolicy;
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
	* Use this API to add spilloverpolicy.
	*/
	public static base_response add(nitro_service client, spilloverpolicy resource) throws Exception {
		spilloverpolicy addresource = new spilloverpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add spilloverpolicy resources.
	*/
	public static base_responses add(nitro_service client, spilloverpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			spilloverpolicy addresources[] = new spilloverpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new spilloverpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete spilloverpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		spilloverpolicy deleteresource = new spilloverpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete spilloverpolicy.
	*/
	public static base_response delete(nitro_service client, spilloverpolicy resource) throws Exception {
		spilloverpolicy deleteresource = new spilloverpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete spilloverpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			spilloverpolicy deleteresources[] = new spilloverpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new spilloverpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete spilloverpolicy resources.
	*/
	public static base_responses delete(nitro_service client, spilloverpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			spilloverpolicy deleteresources[] = new spilloverpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new spilloverpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update spilloverpolicy.
	*/
	public static base_response update(nitro_service client, spilloverpolicy resource) throws Exception {
		spilloverpolicy updateresource = new spilloverpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update spilloverpolicy resources.
	*/
	public static base_responses update(nitro_service client, spilloverpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			spilloverpolicy updateresources[] = new spilloverpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new spilloverpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of spilloverpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, spilloverpolicy resource, String[] args) throws Exception{
		spilloverpolicy unsetresource = new spilloverpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of spilloverpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			spilloverpolicy unsetresources[] = new spilloverpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new spilloverpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of spilloverpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, spilloverpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			spilloverpolicy unsetresources[] = new spilloverpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new spilloverpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a spilloverpolicy resource.
	*/
	public static base_response rename(nitro_service client, spilloverpolicy resource, String new_name) throws Exception {
		spilloverpolicy renameresource = new spilloverpolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a spilloverpolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		spilloverpolicy renameresource = new spilloverpolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the spilloverpolicy resources that are configured on netscaler.
	*/
	public static spilloverpolicy[] get(nitro_service service) throws Exception{
		spilloverpolicy obj = new spilloverpolicy();
		spilloverpolicy[] response = (spilloverpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the spilloverpolicy resources that are configured on netscaler.
	*/
	public static spilloverpolicy[] get(nitro_service service, options option) throws Exception{
		spilloverpolicy obj = new spilloverpolicy();
		spilloverpolicy[] response = (spilloverpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch spilloverpolicy resource of given name .
	*/
	public static spilloverpolicy get(nitro_service service, String name) throws Exception{
		spilloverpolicy obj = new spilloverpolicy();
		obj.set_name(name);
		spilloverpolicy response = (spilloverpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch spilloverpolicy resources of given names .
	*/
	public static spilloverpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			spilloverpolicy response[] = new spilloverpolicy[name.length];
			spilloverpolicy obj[] = new spilloverpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new spilloverpolicy();
				obj[i].set_name(name[i]);
				response[i] = (spilloverpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of spilloverpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static spilloverpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		spilloverpolicy obj = new spilloverpolicy();
		options option = new options();
		option.set_filter(filter);
		spilloverpolicy[] response = (spilloverpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of spilloverpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static spilloverpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		spilloverpolicy obj = new spilloverpolicy();
		options option = new options();
		option.set_filter(filter);
		spilloverpolicy[] response = (spilloverpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the spilloverpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		spilloverpolicy obj = new spilloverpolicy();
		options option = new options();
		option.set_count(true);
		spilloverpolicy[] response = (spilloverpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of spilloverpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		spilloverpolicy obj = new spilloverpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		spilloverpolicy[] response = (spilloverpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of spilloverpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		spilloverpolicy obj = new spilloverpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		spilloverpolicy[] response = (spilloverpolicy[]) obj.getfiltered(service, option);
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
