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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cspolicy_response extends base_response
{
	public cspolicy[] cspolicy;
}
/**
* Configuration for content-switching policy resource.
*/

public class cspolicy extends base_resource
{
	private String policyname;
	private String url;
	private String rule;
	private String domain;
	private String action;
	private String logaction;
	private String newname;

	//------- Read only Parameter ---------;

	private Long vstype;
	private Long hits;
	private Long bindhits;
	private String labelname;
	private String labeltype;
	private Long priority;
	private Boolean activepolicy;
	private String cspolicytype;
	private Long __count;

	/**
	* <pre>
	* Name for the content switching policy. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Cannot be changed after a policy is created.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my policy” or ‘my policy’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name for the content switching policy. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Cannot be changed after a policy is created.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my policy” or ‘my policy’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* URL string that is matched with the URL of a request. Can contain a wildcard character. Specify the string value in the following format: [[prefix] [*]] [.suffix].<br> Minimum length =  1<br> Maximum length =  208
	* </pre>
	*/
	public void set_url(String url) throws Exception{
		this.url = url;
	}

	/**
	* <pre>
	* URL string that is matched with the URL of a request. Can contain a wildcard character. Specify the string value in the following format: [[prefix] [*]] [.suffix].<br> Minimum length =  1<br> Maximum length =  208
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic or default syntax. 
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
The following requirements apply only to the NetScaler CLI:
*  If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
*  If the expression itself includes double quotation marks, escape the quotations by using the  character. 
*  Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic or default syntax. 
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
The following requirements apply only to the NetScaler CLI:
*  If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
*  If the expression itself includes double quotation marks, escape the quotations by using the  character. 
*  Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The domain name. The string value can range to 63 characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* The domain name. The string value can range to 63 characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* Content switching action that names the target load balancing virtual server to which the traffic is switched.
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Content switching action that names the target load balancing virtual server to which the traffic is switched.
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* The log action associated with the content switching policy.
	* </pre>
	*/
	public void set_logaction(String logaction) throws Exception{
		this.logaction = logaction;
	}

	/**
	* <pre>
	* The log action associated with the content switching policy.
	* </pre>
	*/
	public String get_logaction() throws Exception {
		return this.logaction;
	}

	/**
	* <pre>
	* The new name of the content switching policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the content switching policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Virtual server type.
	* </pre>
	*/
	public Long get_vstype() throws Exception {
		return this.vstype;
	}

	/**
	* <pre>
	* Total number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Total number of hits.
	* </pre>
	*/
	public Long get_bindhits() throws Exception {
		return this.bindhits;
	}

	/**
	* <pre>
	* Name of the label invoked.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* The invocation type.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* priority of bound policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Indicates whether policy is bound or not.
	* </pre>
	*/
	public Boolean get_activepolicy() throws Exception {
		return this.activepolicy;
	}

	/**
	* <pre>
	* Indicates whether policy is PI or not.(used only during display).<br> Possible values = Classic Policy, Advanced Policy
	* </pre>
	*/
	public String get_cspolicytype() throws Exception {
		return this.cspolicytype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cspolicy_response result = (cspolicy_response) service.get_payload_formatter().string_to_resource(cspolicy_response.class, response);
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
		return result.cspolicy;
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
	* Use this API to add cspolicy.
	*/
	public static base_response add(nitro_service client, cspolicy resource) throws Exception {
		cspolicy addresource = new cspolicy();
		addresource.policyname = resource.policyname;
		addresource.url = resource.url;
		addresource.rule = resource.rule;
		addresource.domain = resource.domain;
		addresource.action = resource.action;
		addresource.logaction = resource.logaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cspolicy resources.
	*/
	public static base_responses add(nitro_service client, cspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cspolicy addresources[] = new cspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cspolicy();
				addresources[i].policyname = resources[i].policyname;
				addresources[i].url = resources[i].url;
				addresources[i].rule = resources[i].rule;
				addresources[i].domain = resources[i].domain;
				addresources[i].action = resources[i].action;
				addresources[i].logaction = resources[i].logaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cspolicy of given name.
	*/
	public static base_response delete(nitro_service client, String policyname) throws Exception {
		cspolicy deleteresource = new cspolicy();
		deleteresource.policyname = policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cspolicy.
	*/
	public static base_response delete(nitro_service client, cspolicy resource) throws Exception {
		cspolicy deleteresource = new cspolicy();
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cspolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String policyname[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			cspolicy deleteresources[] = new cspolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				deleteresources[i] = new cspolicy();
				deleteresources[i].policyname = policyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cspolicy resources.
	*/
	public static base_responses delete(nitro_service client, cspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cspolicy deleteresources[] = new cspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cspolicy();
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update cspolicy.
	*/
	public static base_response update(nitro_service client, cspolicy resource) throws Exception {
		cspolicy updateresource = new cspolicy();
		updateresource.policyname = resource.policyname;
		updateresource.url = resource.url;
		updateresource.rule = resource.rule;
		updateresource.domain = resource.domain;
		updateresource.action = resource.action;
		updateresource.logaction = resource.logaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update cspolicy resources.
	*/
	public static base_responses update(nitro_service client, cspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cspolicy updateresources[] = new cspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new cspolicy();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].url = resources[i].url;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].domain = resources[i].domain;
				updateresources[i].action = resources[i].action;
				updateresources[i].logaction = resources[i].logaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of cspolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, cspolicy resource, String[] args) throws Exception{
		cspolicy unsetresource = new cspolicy();
		unsetresource.policyname = resource.policyname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of cspolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String policyname[], String args[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			cspolicy unsetresources[] = new cspolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				unsetresources[i] = new cspolicy();
				unsetresources[i].policyname = policyname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of cspolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, cspolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cspolicy unsetresources[] = new cspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new cspolicy();
				unsetresources[i].policyname = resources[i].policyname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a cspolicy resource.
	*/
	public static base_response rename(nitro_service client, cspolicy resource, String new_policyname) throws Exception {
		cspolicy renameresource = new cspolicy();
		renameresource.policyname = resource.policyname;
		return renameresource.rename_resource(client,new_policyname);
	}

	/**
	* Use this API to rename a cspolicy resource.
	*/
	public static base_response rename(nitro_service client, String policyname, String new_policyname) throws Exception {
		cspolicy renameresource = new cspolicy();
		renameresource.policyname = policyname;
		return renameresource.rename_resource(client,new_policyname);
	}

	/**
	* Use this API to fetch all the cspolicy resources that are configured on netscaler.
	*/
	public static cspolicy[] get(nitro_service service) throws Exception{
		cspolicy obj = new cspolicy();
		cspolicy[] response = (cspolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cspolicy resources that are configured on netscaler.
	*/
	public static cspolicy[] get(nitro_service service, options option) throws Exception{
		cspolicy obj = new cspolicy();
		cspolicy[] response = (cspolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cspolicy resource of given name .
	*/
	public static cspolicy get(nitro_service service, String policyname) throws Exception{
		cspolicy obj = new cspolicy();
		obj.set_policyname(policyname);
		cspolicy response = (cspolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cspolicy resources of given names .
	*/
	public static cspolicy[] get(nitro_service service, String policyname[]) throws Exception{
		if (policyname !=null && policyname.length>0) {
			cspolicy response[] = new cspolicy[policyname.length];
			cspolicy obj[] = new cspolicy[policyname.length];
			for (int i=0;i<policyname.length;i++) {
				obj[i] = new cspolicy();
				obj[i].set_policyname(policyname[i]);
				response[i] = (cspolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cspolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cspolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		cspolicy obj = new cspolicy();
		options option = new options();
		option.set_filter(filter);
		cspolicy[] response = (cspolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cspolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cspolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cspolicy obj = new cspolicy();
		options option = new options();
		option.set_filter(filter);
		cspolicy[] response = (cspolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cspolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cspolicy obj = new cspolicy();
		options option = new options();
		option.set_count(true);
		cspolicy[] response = (cspolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cspolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cspolicy obj = new cspolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cspolicy[] response = (cspolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cspolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cspolicy obj = new cspolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cspolicy[] response = (cspolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cspolicytypeEnum {
		public static final String Classic_Policy = "Classic Policy";
		public static final String Advanced_Policy = "Advanced Policy";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}
}
