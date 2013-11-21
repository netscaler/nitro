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

package com.citrix.netscaler.nitro.resource.config.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderpolicy_response extends base_response
{
	public responderpolicy[] responderpolicy;
}
/**
* Configuration for responder policy resource.
*/

public class responderpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;
	private String undefaction;
	private String comment;
	private String logaction;
	private String appflowaction;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the responder policy.
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the responder policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder policy" or 'my responder policy').

	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the responder policy.
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the responder policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder policy" or 'my responder policy').

	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Default syntax expression that the policy uses to determine whether to respond to the specified request.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Default syntax expression that the policy uses to determine whether to respond to the specified request.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Name of the responder action to perform if the request matches this responder policy.
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Name of the responder action to perform if the request matches this responder policy.
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Action to perform if the result of policy evaluation is undefined (UNDEF). An UNDEF event indicates an internal error condition.
Available settings function as follows:
* NOOP - Send the request to the protected server instead of responding to it.
* RESET - Reset the request and notify the user's browser, so that the user can resend the request.
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
* NOOP - Send the request to the protected server instead of responding to it.
* RESET - Reset the request and notify the user's browser, so that the user can resend the request.
* DROP - Drop the request without sending a response to the user.
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* Any type of information about this responder policy.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any type of information about this responder policy.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Name of the messagelog action to use for requests that match this policy.
	* </pre>
	*/
	public void set_logaction(String logaction) throws Exception{
		this.logaction = logaction;
	}

	/**
	* <pre>
	* Name of the messagelog action to use for requests that match this policy.
	* </pre>
	*/
	public String get_logaction() throws Exception {
		return this.logaction;
	}

	/**
	* <pre>
	* AppFlow action to invoke for requests that match this policy.
	* </pre>
	*/
	public void set_appflowaction(String appflowaction) throws Exception{
		this.appflowaction = appflowaction;
	}

	/**
	* <pre>
	* AppFlow action to invoke for requests that match this policy.
	* </pre>
	*/
	public String get_appflowaction() throws Exception {
		return this.appflowaction;
	}

	/**
	* <pre>
	* New name for the responder policy. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder policy" or 'my responder policy').<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the responder policy. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder policy" or 'my responder policy').<br> Minimum length =  1
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
	* Number of policy UNDEF hits.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* Flag to determine if responder policy is built-in or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		responderpolicy_response result = (responderpolicy_response) service.get_payload_formatter().string_to_resource(responderpolicy_response.class, response);
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
		return result.responderpolicy;
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
	* Use this API to add responderpolicy.
	*/
	public static base_response add(nitro_service client, responderpolicy resource) throws Exception {
		responderpolicy addresource = new responderpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		addresource.undefaction = resource.undefaction;
		addresource.comment = resource.comment;
		addresource.logaction = resource.logaction;
		addresource.appflowaction = resource.appflowaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add responderpolicy resources.
	*/
	public static base_responses add(nitro_service client, responderpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderpolicy addresources[] = new responderpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new responderpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
				addresources[i].undefaction = resources[i].undefaction;
				addresources[i].comment = resources[i].comment;
				addresources[i].logaction = resources[i].logaction;
				addresources[i].appflowaction = resources[i].appflowaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete responderpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		responderpolicy deleteresource = new responderpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete responderpolicy.
	*/
	public static base_response delete(nitro_service client, responderpolicy resource) throws Exception {
		responderpolicy deleteresource = new responderpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete responderpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			responderpolicy deleteresources[] = new responderpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new responderpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete responderpolicy resources.
	*/
	public static base_responses delete(nitro_service client, responderpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderpolicy deleteresources[] = new responderpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new responderpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update responderpolicy.
	*/
	public static base_response update(nitro_service client, responderpolicy resource) throws Exception {
		responderpolicy updateresource = new responderpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		updateresource.undefaction = resource.undefaction;
		updateresource.comment = resource.comment;
		updateresource.logaction = resource.logaction;
		updateresource.appflowaction = resource.appflowaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update responderpolicy resources.
	*/
	public static base_responses update(nitro_service client, responderpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderpolicy updateresources[] = new responderpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new responderpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
				updateresources[i].undefaction = resources[i].undefaction;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].logaction = resources[i].logaction;
				updateresources[i].appflowaction = resources[i].appflowaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of responderpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, responderpolicy resource, String[] args) throws Exception{
		responderpolicy unsetresource = new responderpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of responderpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			responderpolicy unsetresources[] = new responderpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new responderpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of responderpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, responderpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderpolicy unsetresources[] = new responderpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new responderpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a responderpolicy resource.
	*/
	public static base_response rename(nitro_service client, responderpolicy resource, String new_name) throws Exception {
		responderpolicy renameresource = new responderpolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a responderpolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		responderpolicy renameresource = new responderpolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the responderpolicy resources that are configured on netscaler.
	*/
	public static responderpolicy[] get(nitro_service service) throws Exception{
		responderpolicy obj = new responderpolicy();
		responderpolicy[] response = (responderpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the responderpolicy resources that are configured on netscaler.
	*/
	public static responderpolicy[] get(nitro_service service, options option) throws Exception{
		responderpolicy obj = new responderpolicy();
		responderpolicy[] response = (responderpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch responderpolicy resource of given name .
	*/
	public static responderpolicy get(nitro_service service, String name) throws Exception{
		responderpolicy obj = new responderpolicy();
		obj.set_name(name);
		responderpolicy response = (responderpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch responderpolicy resources of given names .
	*/
	public static responderpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			responderpolicy response[] = new responderpolicy[name.length];
			responderpolicy obj[] = new responderpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new responderpolicy();
				obj[i].set_name(name[i]);
				response[i] = (responderpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of responderpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static responderpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		responderpolicy obj = new responderpolicy();
		options option = new options();
		option.set_filter(filter);
		responderpolicy[] response = (responderpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of responderpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static responderpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		responderpolicy obj = new responderpolicy();
		options option = new options();
		option.set_filter(filter);
		responderpolicy[] response = (responderpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the responderpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		responderpolicy obj = new responderpolicy();
		options option = new options();
		option.set_count(true);
		responderpolicy[] response = (responderpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of responderpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		responderpolicy obj = new responderpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		responderpolicy[] response = (responderpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of responderpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		responderpolicy obj = new responderpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		responderpolicy[] response = (responderpolicy[]) obj.getfiltered(service, option);
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
