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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslpolicy_response extends base_response
{
	public sslpolicy[] sslpolicy;
}
/**
* Configuration for SSL policy resource.
*/

public class sslpolicy extends base_resource
{
	private String name;
	private String rule;
	private String reqaction;
	private String action;
	private String undefaction;
	private String comment;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private String description;
	private String policytype;
	private Long __count;

	/**
	* <pre>
	* Name for the new SSL policy. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.  Cannot be changed after the policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my policy" or 'my policy').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the new SSL policy. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.  Cannot be changed after the policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my policy" or 'my policy').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression, against which traffic is evaluated. Written in the classic or default syntax.
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
(Classic expressions are not supported in the cluster build.)

The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the  character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression, against which traffic is evaluated. Written in the classic or default syntax.
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
(Classic expressions are not supported in the cluster build.)

The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the  character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the action to be performed on the request. Refer to 'add ssl action' command to add a new action. Builtin actions like NOOP, RESET, DROP, CLIENTAUTH and NOCLIENTAUTH are also allowed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reqaction(String reqaction) throws Exception{
		this.reqaction = reqaction;
	}

	/**
	* <pre>
	* The name of the action to be performed on the request. Refer to 'add ssl action' command to add a new action. Builtin actions like NOOP, RESET, DROP, CLIENTAUTH and NOCLIENTAUTH are also allowed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_reqaction() throws Exception {
		return this.reqaction;
	}

	/**
	* <pre>
	* Name of the built-in or user-defined action to perform on the request. Available built-in actions are NOOP, RESET, DROP, CLIENTAUTH, and NOCLIENTAUTH.
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Name of the built-in or user-defined action to perform on the request. Available built-in actions are NOOP, RESET, DROP, CLIENTAUTH, and NOCLIENTAUTH.
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Name of the action to be performed when the result of rule evaluation is undefined. Possible values for control policies: CLIENTAUTH, NOCLIENTAUTH, NOOP, RESET, DROP. Possible values for data policies: NOOP, RESET or DROP.
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Name of the action to be performed when the result of rule evaluation is undefined. Possible values for control policies: CLIENTAUTH, NOCLIENTAUTH, NOOP, RESET, DROP. Possible values for data policies: NOOP, RESET or DROP.
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* Any comments associated with this policy.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments associated with this policy.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Number of hits for this policy.
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
	* .<br> Possible values = Classic Policy, Advanced Policy
	* </pre>
	*/
	public String get_policytype() throws Exception {
		return this.policytype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslpolicy_response result = (sslpolicy_response) service.get_payload_formatter().string_to_resource(sslpolicy_response.class, response);
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
		return result.sslpolicy;
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
	* Use this API to add sslpolicy.
	*/
	public static base_response add(nitro_service client, sslpolicy resource) throws Exception {
		sslpolicy addresource = new sslpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.reqaction = resource.reqaction;
		addresource.action = resource.action;
		addresource.undefaction = resource.undefaction;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add sslpolicy resources.
	*/
	public static base_responses add(nitro_service client, sslpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslpolicy addresources[] = new sslpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new sslpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].reqaction = resources[i].reqaction;
				addresources[i].action = resources[i].action;
				addresources[i].undefaction = resources[i].undefaction;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		sslpolicy deleteresource = new sslpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslpolicy.
	*/
	public static base_response delete(nitro_service client, sslpolicy resource) throws Exception {
		sslpolicy deleteresource = new sslpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			sslpolicy deleteresources[] = new sslpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new sslpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslpolicy resources.
	*/
	public static base_responses delete(nitro_service client, sslpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslpolicy deleteresources[] = new sslpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update sslpolicy.
	*/
	public static base_response update(nitro_service client, sslpolicy resource) throws Exception {
		sslpolicy updateresource = new sslpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		updateresource.undefaction = resource.undefaction;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update sslpolicy resources.
	*/
	public static base_responses update(nitro_service client, sslpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslpolicy updateresources[] = new sslpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
				updateresources[i].undefaction = resources[i].undefaction;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslpolicy resource, String[] args) throws Exception{
		sslpolicy unsetresource = new sslpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of sslpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			sslpolicy unsetresources[] = new sslpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new sslpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, sslpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslpolicy unsetresources[] = new sslpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new sslpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslpolicy resources that are configured on netscaler.
	*/
	public static sslpolicy[] get(nitro_service service) throws Exception{
		sslpolicy obj = new sslpolicy();
		sslpolicy[] response = (sslpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslpolicy resources that are configured on netscaler.
	*/
	public static sslpolicy[] get(nitro_service service, options option) throws Exception{
		sslpolicy obj = new sslpolicy();
		sslpolicy[] response = (sslpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslpolicy resource of given name .
	*/
	public static sslpolicy get(nitro_service service, String name) throws Exception{
		sslpolicy obj = new sslpolicy();
		obj.set_name(name);
		sslpolicy response = (sslpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslpolicy resources of given names .
	*/
	public static sslpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			sslpolicy response[] = new sslpolicy[name.length];
			sslpolicy obj[] = new sslpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new sslpolicy();
				obj[i].set_name(name[i]);
				response[i] = (sslpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		sslpolicy obj = new sslpolicy();
		options option = new options();
		option.set_filter(filter);
		sslpolicy[] response = (sslpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslpolicy obj = new sslpolicy();
		options option = new options();
		option.set_filter(filter);
		sslpolicy[] response = (sslpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslpolicy obj = new sslpolicy();
		options option = new options();
		option.set_count(true);
		sslpolicy[] response = (sslpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslpolicy obj = new sslpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslpolicy[] response = (sslpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslpolicy obj = new sslpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslpolicy[] response = (sslpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class policytypeEnum {
		public static final String Classic_Policy = "Classic Policy";
		public static final String Advanced_Policy = "Advanced Policy";
	}
}
