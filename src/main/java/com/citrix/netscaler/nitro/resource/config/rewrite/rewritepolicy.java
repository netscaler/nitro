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

package com.citrix.netscaler.nitro.resource.config.rewrite;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rewritepolicy_response extends base_response
{
	public rewritepolicy[] rewritepolicy;
}
/**
* Configuration for rewrite policy resource.
*/

public class rewritepolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;
	private String undefaction;
	private String comment;
	private String logaction;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private String description;
	private Boolean isdefault;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the rewrite policy. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the rewrite policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my rewrite policy" or �my rewrite policy�).
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the rewrite policy. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the rewrite policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my rewrite policy" or �my rewrite policy�).
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression against which traffic is evaluated. Written in default syntax.
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
(Classic expressions are not supported in the cluster build.)

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
	* Expression against which traffic is evaluated. Written in default syntax.
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
(Classic expressions are not supported in the cluster build.)

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
	* Name of the rewrite action to perform if the request or response matches this rewrite policy.
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Name of the rewrite action to perform if the request or response matches this rewrite policy.
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Action to perform if the result of policy evaluation is undefined (UNDEF). An UNDEF event indicates an internal error condition.
Available settings function as follows:
* NOREWRITE - Send the request to the protected server without rewriting.
* RESET - Reset the request and notify the user�s browser, so that the user can resend the request.
* DROP - Drop the request without sending a response to the user.
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Action to perform if the result of policy evaluation is undefined (UNDEF). An UNDEF event indicates an internal error condition.
Available settings function as follows:
* NOREWRITE - Send the request to the protected server without rewriting.
* RESET - Reset the request and notify the user�s browser, so that the user can resend the request.
* DROP - Drop the request without sending a response to the user.
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* Any comments to preserve information about this rewrite policy.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments to preserve information about this rewrite policy.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Name of messagelog action to use when a request matches this policy.
	* </pre>
	*/
	public void set_logaction(String logaction) throws Exception{
		this.logaction = logaction;
	}

	/**
	* <pre>
	* Name of messagelog action to use when a request matches this policy.
	* </pre>
	*/
	public String get_logaction() throws Exception {
		return this.logaction;
	}

	/**
	* <pre>
	* New name for the rewrite policy. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my rewrite policy" or �my rewrite policy�).<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the rewrite policy. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my rewrite policy" or �my rewrite policy�).<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
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
	* Number of Undef hits.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* Description of the policy.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default rewritepolicy.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
	}

	/**
	* <pre>
	* Flag to determine if rewrite policy is built-in or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		rewritepolicy_response result = (rewritepolicy_response) service.get_payload_formatter().string_to_resource(rewritepolicy_response.class, response);
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
		return result.rewritepolicy;
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
	* Use this API to add rewritepolicy.
	*/
	public static base_response add(nitro_service client, rewritepolicy resource) throws Exception {
		rewritepolicy addresource = new rewritepolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		addresource.undefaction = resource.undefaction;
		addresource.comment = resource.comment;
		addresource.logaction = resource.logaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add rewritepolicy resources.
	*/
	public static base_responses add(nitro_service client, rewritepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewritepolicy addresources[] = new rewritepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new rewritepolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
				addresources[i].undefaction = resources[i].undefaction;
				addresources[i].comment = resources[i].comment;
				addresources[i].logaction = resources[i].logaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete rewritepolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		rewritepolicy deleteresource = new rewritepolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete rewritepolicy.
	*/
	public static base_response delete(nitro_service client, rewritepolicy resource) throws Exception {
		rewritepolicy deleteresource = new rewritepolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete rewritepolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			rewritepolicy deleteresources[] = new rewritepolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new rewritepolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete rewritepolicy resources.
	*/
	public static base_responses delete(nitro_service client, rewritepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewritepolicy deleteresources[] = new rewritepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new rewritepolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update rewritepolicy.
	*/
	public static base_response update(nitro_service client, rewritepolicy resource) throws Exception {
		rewritepolicy updateresource = new rewritepolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		updateresource.undefaction = resource.undefaction;
		updateresource.comment = resource.comment;
		updateresource.logaction = resource.logaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update rewritepolicy resources.
	*/
	public static base_responses update(nitro_service client, rewritepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewritepolicy updateresources[] = new rewritepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new rewritepolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
				updateresources[i].undefaction = resources[i].undefaction;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].logaction = resources[i].logaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of rewritepolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, rewritepolicy resource, String[] args) throws Exception{
		rewritepolicy unsetresource = new rewritepolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of rewritepolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			rewritepolicy unsetresources[] = new rewritepolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new rewritepolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of rewritepolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, rewritepolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewritepolicy unsetresources[] = new rewritepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new rewritepolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a rewritepolicy resource.
	*/
	public static base_response rename(nitro_service client, rewritepolicy resource, String new_name) throws Exception {
		rewritepolicy renameresource = new rewritepolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a rewritepolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		rewritepolicy renameresource = new rewritepolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the rewritepolicy resources that are configured on netscaler.
	*/
	public static rewritepolicy[] get(nitro_service service) throws Exception{
		rewritepolicy obj = new rewritepolicy();
		rewritepolicy[] response = (rewritepolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the rewritepolicy resources that are configured on netscaler.
	*/
	public static rewritepolicy[] get(nitro_service service, options option) throws Exception{
		rewritepolicy obj = new rewritepolicy();
		rewritepolicy[] response = (rewritepolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch rewritepolicy resource of given name .
	*/
	public static rewritepolicy get(nitro_service service, String name) throws Exception{
		rewritepolicy obj = new rewritepolicy();
		obj.set_name(name);
		rewritepolicy response = (rewritepolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch rewritepolicy resources of given names .
	*/
	public static rewritepolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			rewritepolicy response[] = new rewritepolicy[name.length];
			rewritepolicy obj[] = new rewritepolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new rewritepolicy();
				obj[i].set_name(name[i]);
				response[i] = (rewritepolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of rewritepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static rewritepolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		rewritepolicy obj = new rewritepolicy();
		options option = new options();
		option.set_filter(filter);
		rewritepolicy[] response = (rewritepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rewritepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static rewritepolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rewritepolicy obj = new rewritepolicy();
		options option = new options();
		option.set_filter(filter);
		rewritepolicy[] response = (rewritepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the rewritepolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		rewritepolicy obj = new rewritepolicy();
		options option = new options();
		option.set_count(true);
		rewritepolicy[] response = (rewritepolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of rewritepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		rewritepolicy obj = new rewritepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rewritepolicy[] response = (rewritepolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rewritepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rewritepolicy obj = new rewritepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rewritepolicy[] response = (rewritepolicy[]) obj.getfiltered(service, option);
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
