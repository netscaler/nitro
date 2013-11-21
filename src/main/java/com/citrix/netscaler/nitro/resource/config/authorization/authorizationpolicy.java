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

package com.citrix.netscaler.nitro.resource.config.authorization;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authorizationpolicy_response extends base_response
{
	public authorizationpolicy[] authorizationpolicy;
}
/**
* Configuration for authorization policy resource.
*/

public class authorizationpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;
	private String newname;

	//------- Read only Parameter ---------;

	private Long activepolicy;
	private Long __count;

	/**
	* <pre>
	* Name for the new authorization policy. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the authorization policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authorization policy” or ‘my authorization policy’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the new authorization policy. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the authorization policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authorization policy” or ‘my authorization policy’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Name of the NetScaler named rule, or a default syntax expression, that the policy uses to perform the authentication.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Name of the NetScaler named rule, or a default syntax expression, that the policy uses to perform the authentication.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Action to perform if the policy matches: either allow or deny the request.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Action to perform if the policy matches: either allow or deny the request.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* The new name of the author policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the author policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_activepolicy() throws Exception {
		return this.activepolicy;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authorizationpolicy_response result = (authorizationpolicy_response) service.get_payload_formatter().string_to_resource(authorizationpolicy_response.class, response);
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
		return result.authorizationpolicy;
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
	* Use this API to add authorizationpolicy.
	*/
	public static base_response add(nitro_service client, authorizationpolicy resource) throws Exception {
		authorizationpolicy addresource = new authorizationpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authorizationpolicy resources.
	*/
	public static base_responses add(nitro_service client, authorizationpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authorizationpolicy addresources[] = new authorizationpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authorizationpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authorizationpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authorizationpolicy deleteresource = new authorizationpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authorizationpolicy.
	*/
	public static base_response delete(nitro_service client, authorizationpolicy resource) throws Exception {
		authorizationpolicy deleteresource = new authorizationpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authorizationpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authorizationpolicy deleteresources[] = new authorizationpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authorizationpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authorizationpolicy resources.
	*/
	public static base_responses delete(nitro_service client, authorizationpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authorizationpolicy deleteresources[] = new authorizationpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authorizationpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authorizationpolicy.
	*/
	public static base_response update(nitro_service client, authorizationpolicy resource) throws Exception {
		authorizationpolicy updateresource = new authorizationpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authorizationpolicy resources.
	*/
	public static base_responses update(nitro_service client, authorizationpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authorizationpolicy updateresources[] = new authorizationpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authorizationpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to rename a authorizationpolicy resource.
	*/
	public static base_response rename(nitro_service client, authorizationpolicy resource, String new_name) throws Exception {
		authorizationpolicy renameresource = new authorizationpolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a authorizationpolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		authorizationpolicy renameresource = new authorizationpolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the authorizationpolicy resources that are configured on netscaler.
	*/
	public static authorizationpolicy[] get(nitro_service service) throws Exception{
		authorizationpolicy obj = new authorizationpolicy();
		authorizationpolicy[] response = (authorizationpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authorizationpolicy resources that are configured on netscaler.
	*/
	public static authorizationpolicy[] get(nitro_service service, options option) throws Exception{
		authorizationpolicy obj = new authorizationpolicy();
		authorizationpolicy[] response = (authorizationpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authorizationpolicy resource of given name .
	*/
	public static authorizationpolicy get(nitro_service service, String name) throws Exception{
		authorizationpolicy obj = new authorizationpolicy();
		obj.set_name(name);
		authorizationpolicy response = (authorizationpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authorizationpolicy resources of given names .
	*/
	public static authorizationpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authorizationpolicy response[] = new authorizationpolicy[name.length];
			authorizationpolicy obj[] = new authorizationpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authorizationpolicy();
				obj[i].set_name(name[i]);
				response[i] = (authorizationpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authorizationpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authorizationpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		authorizationpolicy obj = new authorizationpolicy();
		options option = new options();
		option.set_filter(filter);
		authorizationpolicy[] response = (authorizationpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authorizationpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authorizationpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authorizationpolicy obj = new authorizationpolicy();
		options option = new options();
		option.set_filter(filter);
		authorizationpolicy[] response = (authorizationpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authorizationpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authorizationpolicy obj = new authorizationpolicy();
		options option = new options();
		option.set_count(true);
		authorizationpolicy[] response = (authorizationpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authorizationpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authorizationpolicy obj = new authorizationpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authorizationpolicy[] response = (authorizationpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authorizationpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authorizationpolicy obj = new authorizationpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authorizationpolicy[] response = (authorizationpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
