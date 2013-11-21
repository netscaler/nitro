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

class vpntrafficpolicy_response extends base_response
{
	public vpntrafficpolicy[] vpntrafficpolicy;
}
/**
* Configuration for VPN traffic policy resource.
*/

public class vpntrafficpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;
	private Long __count;

	/**
	* <pre>
	* Name for the traffic policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my policy" or 'my policy').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the traffic policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my policy" or 'my policy').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic or default syntax.
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
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic or default syntax.
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
	* Action to apply to traffic that matches the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Action to apply to traffic that matches the policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpntrafficpolicy_response result = (vpntrafficpolicy_response) service.get_payload_formatter().string_to_resource(vpntrafficpolicy_response.class, response);
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
		return result.vpntrafficpolicy;
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
	* Use this API to add vpntrafficpolicy.
	*/
	public static base_response add(nitro_service client, vpntrafficpolicy resource) throws Exception {
		vpntrafficpolicy addresource = new vpntrafficpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpntrafficpolicy resources.
	*/
	public static base_responses add(nitro_service client, vpntrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficpolicy addresources[] = new vpntrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpntrafficpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpntrafficpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpntrafficpolicy deleteresource = new vpntrafficpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpntrafficpolicy.
	*/
	public static base_response delete(nitro_service client, vpntrafficpolicy resource) throws Exception {
		vpntrafficpolicy deleteresource = new vpntrafficpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpntrafficpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpntrafficpolicy deleteresources[] = new vpntrafficpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpntrafficpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpntrafficpolicy resources.
	*/
	public static base_responses delete(nitro_service client, vpntrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficpolicy deleteresources[] = new vpntrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpntrafficpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpntrafficpolicy.
	*/
	public static base_response update(nitro_service client, vpntrafficpolicy resource) throws Exception {
		vpntrafficpolicy updateresource = new vpntrafficpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpntrafficpolicy resources.
	*/
	public static base_responses update(nitro_service client, vpntrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficpolicy updateresources[] = new vpntrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpntrafficpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpntrafficpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpntrafficpolicy resource, String[] args) throws Exception{
		vpntrafficpolicy unsetresource = new vpntrafficpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpntrafficpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpntrafficpolicy unsetresources[] = new vpntrafficpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new vpntrafficpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpntrafficpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpntrafficpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficpolicy unsetresources[] = new vpntrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpntrafficpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpntrafficpolicy resources that are configured on netscaler.
	*/
	public static vpntrafficpolicy[] get(nitro_service service) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		vpntrafficpolicy[] response = (vpntrafficpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpntrafficpolicy resources that are configured on netscaler.
	*/
	public static vpntrafficpolicy[] get(nitro_service service, options option) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		vpntrafficpolicy[] response = (vpntrafficpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpntrafficpolicy resource of given name .
	*/
	public static vpntrafficpolicy get(nitro_service service, String name) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		obj.set_name(name);
		vpntrafficpolicy response = (vpntrafficpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpntrafficpolicy resources of given names .
	*/
	public static vpntrafficpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpntrafficpolicy response[] = new vpntrafficpolicy[name.length];
			vpntrafficpolicy obj[] = new vpntrafficpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpntrafficpolicy();
				obj[i].set_name(name[i]);
				response[i] = (vpntrafficpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpntrafficpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpntrafficpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_filter(filter);
		vpntrafficpolicy[] response = (vpntrafficpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpntrafficpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpntrafficpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_filter(filter);
		vpntrafficpolicy[] response = (vpntrafficpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpntrafficpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_count(true);
		vpntrafficpolicy[] response = (vpntrafficpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpntrafficpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpntrafficpolicy[] response = (vpntrafficpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpntrafficpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpntrafficpolicy[] response = (vpntrafficpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
