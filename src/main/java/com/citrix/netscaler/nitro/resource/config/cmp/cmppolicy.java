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

package com.citrix.netscaler.nitro.resource.config.cmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cmppolicy_response extends base_response
{
	public cmppolicy[] cmppolicy;
}
/**
* Configuration for compression policy resource.
*/

public class cmppolicy extends base_resource
{
	private String name;
	private String rule;
	private String resaction;
	private String newname;

	//------- Read only Parameter ---------;

	private String expressiontype;
	private String reqaction;
	private Long hits;
	private Long txbytes;
	private Long rxbytes;
	private Long clientttlb;
	private Long clienttransactions;
	private Long serverttlb;
	private Long servertransactions;
	private String description;
	private String[] builtin;
	private Boolean isdefault;
	private Long __count;

	/**
	* <pre>
	* Name of the HTTP compression policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
Can be changed after the policy is created. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cmp policy" or 'my cmp policy').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the HTTP compression policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
Can be changed after the policy is created. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cmp policy" or 'my cmp policy').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression that determines which HTTP requests or responses match the compression policy. Can be a classic expression or a default-syntax expression.  
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
	* Expression that determines which HTTP requests or responses match the compression policy. Can be a classic expression or a default-syntax expression.  
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
	* The built-in or user-defined compression action to apply to the response when the policy matches a request or response.<br> Minimum length =  1
	* </pre>
	*/
	public void set_resaction(String resaction) throws Exception{
		this.resaction = resaction;
	}

	/**
	* <pre>
	* The built-in or user-defined compression action to apply to the response when the policy matches a request or response.<br> Minimum length =  1
	* </pre>
	*/
	public String get_resaction() throws Exception {
		return this.resaction;
	}

	/**
	* <pre>
	* New name for the compression policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
Choose a name that reflects the function that the policy performs. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cmp policy" or 'my cmp policy').<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the compression policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
Choose a name that reflects the function that the policy performs. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cmp policy" or 'my cmp policy').<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Type of policy (Classic/Advanced) .<br> Possible values = Classic Policy, Advanced Policy
	* </pre>
	*/
	public String get_expressiontype() throws Exception {
		return this.expressiontype;
	}

	/**
	* <pre>
	* The compression action to be performed on requests.
	* </pre>
	*/
	public String get_reqaction() throws Exception {
		return this.reqaction;
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
	* Number of bytes transferred.
	* </pre>
	*/
	public Long get_txbytes() throws Exception {
		return this.txbytes;
	}

	/**
	* <pre>
	* Number of bytes received.
	* </pre>
	*/
	public Long get_rxbytes() throws Exception {
		return this.rxbytes;
	}

	/**
	* <pre>
	* Total client TTLB value.
	* </pre>
	*/
	public Long get_clientttlb() throws Exception {
		return this.clientttlb;
	}

	/**
	* <pre>
	* Number of client transactions.
	* </pre>
	*/
	public Long get_clienttransactions() throws Exception {
		return this.clienttransactions;
	}

	/**
	* <pre>
	* Total server TTLB value.
	* </pre>
	*/
	public Long get_serverttlb() throws Exception {
		return this.serverttlb;
	}

	/**
	* <pre>
	* Number of server transactions.
	* </pre>
	*/
	public Long get_servertransactions() throws Exception {
		return this.servertransactions;
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
	* Flag to determine if compression policy is builtin or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default policy.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cmppolicy_response result = (cmppolicy_response) service.get_payload_formatter().string_to_resource(cmppolicy_response.class, response);
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
		return result.cmppolicy;
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
	* Use this API to add cmppolicy.
	*/
	public static base_response add(nitro_service client, cmppolicy resource) throws Exception {
		cmppolicy addresource = new cmppolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.resaction = resource.resaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cmppolicy resources.
	*/
	public static base_responses add(nitro_service client, cmppolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicy addresources[] = new cmppolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cmppolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].resaction = resources[i].resaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cmppolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		cmppolicy deleteresource = new cmppolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cmppolicy.
	*/
	public static base_response delete(nitro_service client, cmppolicy resource) throws Exception {
		cmppolicy deleteresource = new cmppolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cmppolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			cmppolicy deleteresources[] = new cmppolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new cmppolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cmppolicy resources.
	*/
	public static base_responses delete(nitro_service client, cmppolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicy deleteresources[] = new cmppolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cmppolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update cmppolicy.
	*/
	public static base_response update(nitro_service client, cmppolicy resource) throws Exception {
		cmppolicy updateresource = new cmppolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.resaction = resource.resaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update cmppolicy resources.
	*/
	public static base_responses update(nitro_service client, cmppolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicy updateresources[] = new cmppolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new cmppolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].resaction = resources[i].resaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to rename a cmppolicy resource.
	*/
	public static base_response rename(nitro_service client, cmppolicy resource, String new_name) throws Exception {
		cmppolicy renameresource = new cmppolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a cmppolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		cmppolicy renameresource = new cmppolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the cmppolicy resources that are configured on netscaler.
	*/
	public static cmppolicy[] get(nitro_service service) throws Exception{
		cmppolicy obj = new cmppolicy();
		cmppolicy[] response = (cmppolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cmppolicy resources that are configured on netscaler.
	*/
	public static cmppolicy[] get(nitro_service service, options option) throws Exception{
		cmppolicy obj = new cmppolicy();
		cmppolicy[] response = (cmppolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cmppolicy resource of given name .
	*/
	public static cmppolicy get(nitro_service service, String name) throws Exception{
		cmppolicy obj = new cmppolicy();
		obj.set_name(name);
		cmppolicy response = (cmppolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cmppolicy resources of given names .
	*/
	public static cmppolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			cmppolicy response[] = new cmppolicy[name.length];
			cmppolicy obj[] = new cmppolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new cmppolicy();
				obj[i].set_name(name[i]);
				response[i] = (cmppolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cmppolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cmppolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_filter(filter);
		cmppolicy[] response = (cmppolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cmppolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cmppolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_filter(filter);
		cmppolicy[] response = (cmppolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cmppolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_count(true);
		cmppolicy[] response = (cmppolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cmppolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmppolicy[] response = (cmppolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cmppolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmppolicy[] response = (cmppolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class expressiontypeEnum {
		public static final String Classic_Policy = "Classic Policy";
		public static final String Advanced_Policy = "Advanced Policy";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
}
