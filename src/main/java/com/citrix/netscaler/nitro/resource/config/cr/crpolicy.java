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

package com.citrix.netscaler.nitro.resource.config.cr;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class crpolicy_response extends base_response
{
	public crpolicy[] crpolicy;
}
/**
* Configuration for cache redirection policy resource.
*/

public class crpolicy extends base_resource
{
	private String policyname;
	private String rule;

	//------- Read only Parameter ---------;

	private String domain;
	private Long vstype;
	private String cspolicytype;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the cache redirection policy. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Cannot be changed after the policy is created.
The following requirement applies only to the NetScaler CLI: 
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my policy” or ‘my policy’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name for the cache redirection policy. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Cannot be changed after the policy is created.
The following requirement applies only to the NetScaler CLI: 
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my policy” or ‘my policy’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic syntax.
Note:Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: "<string of 255 characters>" + "<string of 245 characters>"
The following requirements apply only to the NetScaler CLI:
*  If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
*  If the expression itself includes double quotation marks, escape the quotations by using the \ character. 
*  Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic syntax.
Note:Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: "<string of 255 characters>" + "<string of 245 characters>"
The following requirements apply only to the NetScaler CLI:
*  If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
*  If the expression itself includes double quotation marks, escape the quotations by using the \ character. 
*  Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Domain name.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
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
	* Indicates whether policy is PI or not.(used only during display).<br> Possible values = Classic Policy, Advanced Policy
	* </pre>
	*/
	public String get_cspolicytype() throws Exception {
		return this.cspolicytype;
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
		crpolicy_response result = (crpolicy_response) service.get_payload_formatter().string_to_resource(crpolicy_response.class, response);
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
		return result.crpolicy;
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
	* Use this API to add crpolicy.
	*/
	public static base_response add(nitro_service client, crpolicy resource) throws Exception {
		crpolicy addresource = new crpolicy();
		addresource.policyname = resource.policyname;
		addresource.rule = resource.rule;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add crpolicy resources.
	*/
	public static base_responses add(nitro_service client, crpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crpolicy addresources[] = new crpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new crpolicy();
				addresources[i].policyname = resources[i].policyname;
				addresources[i].rule = resources[i].rule;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete crpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String policyname) throws Exception {
		crpolicy deleteresource = new crpolicy();
		deleteresource.policyname = policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete crpolicy.
	*/
	public static base_response delete(nitro_service client, crpolicy resource) throws Exception {
		crpolicy deleteresource = new crpolicy();
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete crpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String policyname[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			crpolicy deleteresources[] = new crpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				deleteresources[i] = new crpolicy();
				deleteresources[i].policyname = policyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete crpolicy resources.
	*/
	public static base_responses delete(nitro_service client, crpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crpolicy deleteresources[] = new crpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new crpolicy();
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update crpolicy.
	*/
	public static base_response update(nitro_service client, crpolicy resource) throws Exception {
		crpolicy updateresource = new crpolicy();
		updateresource.policyname = resource.policyname;
		updateresource.rule = resource.rule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update crpolicy resources.
	*/
	public static base_responses update(nitro_service client, crpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crpolicy updateresources[] = new crpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new crpolicy();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].rule = resources[i].rule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the crpolicy resources that are configured on netscaler.
	*/
	public static crpolicy[] get(nitro_service service) throws Exception{
		crpolicy obj = new crpolicy();
		crpolicy[] response = (crpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the crpolicy resources that are configured on netscaler.
	*/
	public static crpolicy[] get(nitro_service service, options option) throws Exception{
		crpolicy obj = new crpolicy();
		crpolicy[] response = (crpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch crpolicy resource of given name .
	*/
	public static crpolicy get(nitro_service service, String policyname) throws Exception{
		crpolicy obj = new crpolicy();
		obj.set_policyname(policyname);
		crpolicy response = (crpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch crpolicy resources of given names .
	*/
	public static crpolicy[] get(nitro_service service, String policyname[]) throws Exception{
		if (policyname !=null && policyname.length>0) {
			crpolicy response[] = new crpolicy[policyname.length];
			crpolicy obj[] = new crpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++) {
				obj[i] = new crpolicy();
				obj[i].set_policyname(policyname[i]);
				response[i] = (crpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of crpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static crpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		crpolicy obj = new crpolicy();
		options option = new options();
		option.set_filter(filter);
		crpolicy[] response = (crpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of crpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static crpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		crpolicy obj = new crpolicy();
		options option = new options();
		option.set_filter(filter);
		crpolicy[] response = (crpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the crpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		crpolicy obj = new crpolicy();
		options option = new options();
		option.set_count(true);
		crpolicy[] response = (crpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of crpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		crpolicy obj = new crpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		crpolicy[] response = (crpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of crpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		crpolicy obj = new crpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		crpolicy[] response = (crpolicy[]) obj.getfiltered(service, option);
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
	public static class cspolicytypeEnum {
		public static final String Classic_Policy = "Classic Policy";
		public static final String Advanced_Policy = "Advanced Policy";
	}
}
