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

package com.citrix.netscaler.nitro.resource.config.appflow;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appflowpolicy_response extends base_response
{
	public appflowpolicy[] appflowpolicy;
}
/**
* Configuration for AppFlow policy resource.
*/

public class appflowpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;
	private String comment;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private String description;
	private Long __count;

	/**
	* <pre>
	* Name for the policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at
(@), equals (=), and hyphen (-) characters. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my appflow policy" or 'my appflow policy').
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at
(@), equals (=), and hyphen (-) characters. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my appflow policy" or 'my appflow policy').
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression or other value against which the traffic is evaluated. Must be a Boolean, default syntax expression.  Note:
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
	* Expression or other value against which the traffic is evaluated. Must be a Boolean, default syntax expression.  Note:
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
	* Name of the action to be associated with this policy.
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Name of the action to be associated with this policy.
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Any comments about this policy.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments about this policy.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* New name for the policy. Must begin with an ASCII alphabetic or underscore (_)character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my appflow policy" or 'my appflow policy').<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the policy. Must begin with an ASCII alphabetic or underscore (_)character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my appflow policy" or 'my appflow policy').<br> Minimum length =  1
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
	* Description of the policy.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appflowpolicy_response result = (appflowpolicy_response) service.get_payload_formatter().string_to_resource(appflowpolicy_response.class, response);
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
		return result.appflowpolicy;
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
	* Use this API to add appflowpolicy.
	*/
	public static base_response add(nitro_service client, appflowpolicy resource) throws Exception {
		appflowpolicy addresource = new appflowpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appflowpolicy resources.
	*/
	public static base_responses add(nitro_service client, appflowpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowpolicy addresources[] = new appflowpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appflowpolicy();
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
	* Use this API to delete appflowpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appflowpolicy deleteresource = new appflowpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appflowpolicy.
	*/
	public static base_response delete(nitro_service client, appflowpolicy resource) throws Exception {
		appflowpolicy deleteresource = new appflowpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appflowpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appflowpolicy deleteresources[] = new appflowpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appflowpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appflowpolicy resources.
	*/
	public static base_responses delete(nitro_service client, appflowpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowpolicy deleteresources[] = new appflowpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appflowpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update appflowpolicy.
	*/
	public static base_response update(nitro_service client, appflowpolicy resource) throws Exception {
		appflowpolicy updateresource = new appflowpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appflowpolicy resources.
	*/
	public static base_responses update(nitro_service client, appflowpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowpolicy updateresources[] = new appflowpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appflowpolicy();
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
	* Use this API to unset the properties of appflowpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appflowpolicy resource, String[] args) throws Exception{
		appflowpolicy unsetresource = new appflowpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of appflowpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appflowpolicy unsetresources[] = new appflowpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new appflowpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appflowpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, appflowpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowpolicy unsetresources[] = new appflowpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new appflowpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a appflowpolicy resource.
	*/
	public static base_response rename(nitro_service client, appflowpolicy resource, String new_name) throws Exception {
		appflowpolicy renameresource = new appflowpolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a appflowpolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		appflowpolicy renameresource = new appflowpolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the appflowpolicy resources that are configured on netscaler.
	*/
	public static appflowpolicy[] get(nitro_service service) throws Exception{
		appflowpolicy obj = new appflowpolicy();
		appflowpolicy[] response = (appflowpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appflowpolicy resources that are configured on netscaler.
	*/
	public static appflowpolicy[] get(nitro_service service, options option) throws Exception{
		appflowpolicy obj = new appflowpolicy();
		appflowpolicy[] response = (appflowpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appflowpolicy resource of given name .
	*/
	public static appflowpolicy get(nitro_service service, String name) throws Exception{
		appflowpolicy obj = new appflowpolicy();
		obj.set_name(name);
		appflowpolicy response = (appflowpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appflowpolicy resources of given names .
	*/
	public static appflowpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appflowpolicy response[] = new appflowpolicy[name.length];
			appflowpolicy obj[] = new appflowpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appflowpolicy();
				obj[i].set_name(name[i]);
				response[i] = (appflowpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appflowpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appflowpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		appflowpolicy obj = new appflowpolicy();
		options option = new options();
		option.set_filter(filter);
		appflowpolicy[] response = (appflowpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appflowpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appflowpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appflowpolicy obj = new appflowpolicy();
		options option = new options();
		option.set_filter(filter);
		appflowpolicy[] response = (appflowpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appflowpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appflowpolicy obj = new appflowpolicy();
		options option = new options();
		option.set_count(true);
		appflowpolicy[] response = (appflowpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appflowpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appflowpolicy obj = new appflowpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appflowpolicy[] response = (appflowpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appflowpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appflowpolicy obj = new appflowpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appflowpolicy[] response = (appflowpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
