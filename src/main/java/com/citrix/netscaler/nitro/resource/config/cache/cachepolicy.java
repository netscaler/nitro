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

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cachepolicy_response extends base_response
{
	public cachepolicy[] cachepolicy;
}
/**
* Configuration for Integrated Cache policy resource.
*/

public class cachepolicy extends base_resource
{
	private String policyname;
	private String rule;
	private String action;
	private String storeingroup;
	private String[] invalgroups;
	private String[] invalobjects;
	private String undefaction;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private Long flags;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the policy is created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name for the policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the policy is created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Expression against which the traffic is evaluated.
Note:
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
	* Expression against which the traffic is evaluated.
Note:
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
	* Action to apply to content that matches the policy. 
* CACHE or MAY_CACHE action - positive cachability policy
* NOCACHE or MAY_NOCACHE action - negative cachability policy
* INVAL action - Dynamic Invalidation Policy.<br> Possible values = CACHE, NOCACHE, MAY_CACHE, MAY_NOCACHE, INVAL
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Action to apply to content that matches the policy. 
* CACHE or MAY_CACHE action - positive cachability policy
* NOCACHE or MAY_NOCACHE action - negative cachability policy
* INVAL action - Dynamic Invalidation Policy.<br> Possible values = CACHE, NOCACHE, MAY_CACHE, MAY_NOCACHE, INVAL
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Name of the content group in which to store the object when the final result of policy evaluation is CACHE. The content group must exist before being mentioned here. Use the "show cache contentgroup" command to view the list of existing content groups.<br> Minimum length =  1
	* </pre>
	*/
	public void set_storeingroup(String storeingroup) throws Exception{
		this.storeingroup = storeingroup;
	}

	/**
	* <pre>
	* Name of the content group in which to store the object when the final result of policy evaluation is CACHE. The content group must exist before being mentioned here. Use the "show cache contentgroup" command to view the list of existing content groups.<br> Minimum length =  1
	* </pre>
	*/
	public String get_storeingroup() throws Exception {
		return this.storeingroup;
	}

	/**
	* <pre>
	* Content group(s) to be invalidated when the INVAL action is applied. Maximum number of content groups that can be specified is 16.<br> Minimum length =  1
	* </pre>
	*/
	public void set_invalgroups(String[] invalgroups) throws Exception{
		this.invalgroups = invalgroups;
	}

	/**
	* <pre>
	* Content group(s) to be invalidated when the INVAL action is applied. Maximum number of content groups that can be specified is 16.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_invalgroups() throws Exception {
		return this.invalgroups;
	}

	/**
	* <pre>
	* Content groups(s) in which the objects will be invalidated if the action is INVAL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_invalobjects(String[] invalobjects) throws Exception{
		this.invalobjects = invalobjects;
	}

	/**
	* <pre>
	* Content groups(s) in which the objects will be invalidated if the action is INVAL.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_invalobjects() throws Exception {
		return this.invalobjects;
	}

	/**
	* <pre>
	* Action to be performed when the result of rule evaluation is undefined.<br> Possible values = NOCACHE, RESET
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Action to be performed when the result of rule evaluation is undefined.<br> Possible values = NOCACHE, RESET
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* New name for the cache policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the cache policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Number of Undef hits.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* Flag.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* .<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		cachepolicy_response result = (cachepolicy_response) service.get_payload_formatter().string_to_resource(cachepolicy_response.class, response);
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
		return result.cachepolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.policyname;
	}

	/**
	* Use this API to add cachepolicy.
	*/
	public static base_response add(nitro_service client, cachepolicy resource) throws Exception {
		cachepolicy addresource = new cachepolicy();
		addresource.policyname = resource.policyname;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		addresource.storeingroup = resource.storeingroup;
		addresource.invalgroups = resource.invalgroups;
		addresource.invalobjects = resource.invalobjects;
		addresource.undefaction = resource.undefaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cachepolicy resources.
	*/
	public static base_responses add(nitro_service client, cachepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachepolicy addresources[] = new cachepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cachepolicy();
				addresources[i].policyname = resources[i].policyname;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
				addresources[i].storeingroup = resources[i].storeingroup;
				addresources[i].invalgroups = resources[i].invalgroups;
				addresources[i].invalobjects = resources[i].invalobjects;
				addresources[i].undefaction = resources[i].undefaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cachepolicy of given name.
	*/
	public static base_response delete(nitro_service client, String policyname) throws Exception {
		cachepolicy deleteresource = new cachepolicy();
		deleteresource.policyname = policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cachepolicy.
	*/
	public static base_response delete(nitro_service client, cachepolicy resource) throws Exception {
		cachepolicy deleteresource = new cachepolicy();
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cachepolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String policyname[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			cachepolicy deleteresources[] = new cachepolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				deleteresources[i] = new cachepolicy();
				deleteresources[i].policyname = policyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cachepolicy resources.
	*/
	public static base_responses delete(nitro_service client, cachepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachepolicy deleteresources[] = new cachepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cachepolicy();
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update cachepolicy.
	*/
	public static base_response update(nitro_service client, cachepolicy resource) throws Exception {
		cachepolicy updateresource = new cachepolicy();
		updateresource.policyname = resource.policyname;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		updateresource.storeingroup = resource.storeingroup;
		updateresource.invalgroups = resource.invalgroups;
		updateresource.invalobjects = resource.invalobjects;
		updateresource.undefaction = resource.undefaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update cachepolicy resources.
	*/
	public static base_responses update(nitro_service client, cachepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachepolicy updateresources[] = new cachepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new cachepolicy();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
				updateresources[i].storeingroup = resources[i].storeingroup;
				updateresources[i].invalgroups = resources[i].invalgroups;
				updateresources[i].invalobjects = resources[i].invalobjects;
				updateresources[i].undefaction = resources[i].undefaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of cachepolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, cachepolicy resource, String[] args) throws Exception{
		cachepolicy unsetresource = new cachepolicy();
		unsetresource.policyname = resource.policyname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of cachepolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String policyname[], String args[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			cachepolicy unsetresources[] = new cachepolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				unsetresources[i] = new cachepolicy();
				unsetresources[i].policyname = policyname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of cachepolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, cachepolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachepolicy unsetresources[] = new cachepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new cachepolicy();
				unsetresources[i].policyname = resources[i].policyname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a cachepolicy resource.
	*/
	public static base_response rename(nitro_service client, cachepolicy resource, String new_policyname) throws Exception {
		cachepolicy renameresource = new cachepolicy();
		renameresource.policyname = resource.policyname;
		return renameresource.rename_resource(client,new_policyname);
	}

	/**
	* Use this API to rename a cachepolicy resource.
	*/
	public static base_response rename(nitro_service client, String policyname, String new_policyname) throws Exception {
		cachepolicy renameresource = new cachepolicy();
		renameresource.policyname = policyname;
		return renameresource.rename_resource(client,new_policyname);
	}

	/**
	* Use this API to fetch all the cachepolicy resources that are configured on netscaler.
	*/
	public static cachepolicy[] get(nitro_service service) throws Exception{
		cachepolicy obj = new cachepolicy();
		cachepolicy[] response = (cachepolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cachepolicy resources that are configured on netscaler.
	*/
	public static cachepolicy[] get(nitro_service service, options option) throws Exception{
		cachepolicy obj = new cachepolicy();
		cachepolicy[] response = (cachepolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cachepolicy resource of given name .
	*/
	public static cachepolicy get(nitro_service service, String policyname) throws Exception{
		cachepolicy obj = new cachepolicy();
		obj.set_policyname(policyname);
		cachepolicy response = (cachepolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cachepolicy resources of given names .
	*/
	public static cachepolicy[] get(nitro_service service, String policyname[]) throws Exception{
		if (policyname !=null && policyname.length>0) {
			cachepolicy response[] = new cachepolicy[policyname.length];
			cachepolicy obj[] = new cachepolicy[policyname.length];
			for (int i=0;i<policyname.length;i++) {
				obj[i] = new cachepolicy();
				obj[i].set_policyname(policyname[i]);
				response[i] = (cachepolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cachepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cachepolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		cachepolicy obj = new cachepolicy();
		options option = new options();
		option.set_filter(filter);
		cachepolicy[] response = (cachepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cachepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cachepolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cachepolicy obj = new cachepolicy();
		options option = new options();
		option.set_filter(filter);
		cachepolicy[] response = (cachepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cachepolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cachepolicy obj = new cachepolicy();
		options option = new options();
		option.set_count(true);
		cachepolicy[] response = (cachepolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cachepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cachepolicy obj = new cachepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cachepolicy[] response = (cachepolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cachepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cachepolicy obj = new cachepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cachepolicy[] response = (cachepolicy[]) obj.getfiltered(service, option);
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
	public static class undefactionEnum {
		public static final String NOCACHE = "NOCACHE";
		public static final String RESET = "RESET";
	}
	public static class actionEnum {
		public static final String CACHE = "CACHE";
		public static final String NOCACHE = "NOCACHE";
		public static final String MAY_CACHE = "MAY_CACHE";
		public static final String MAY_NOCACHE = "MAY_NOCACHE";
		public static final String INVAL = "INVAL";
	}
}
