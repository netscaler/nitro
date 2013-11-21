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

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationsamlpolicy_response extends base_response
{
	public authenticationsamlpolicy[] authenticationsamlpolicy;
}
/**
* Configuration for AAA Saml policy resource.
*/

public class authenticationsamlpolicy extends base_resource
{
	private String name;
	private String rule;
	private String reqaction;
	private Long __count;

	/**
	* <pre>
	* Name for the SAML policy. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after SAML policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authentication policy” or ‘my authentication policy’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the SAML policy. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after SAML policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authentication policy” or ‘my authentication policy’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Name of the NetScaler named rule, or a default syntax expression, that the policy uses to determine whether to attempt to authenticate the user with the SAML server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Name of the NetScaler named rule, or a default syntax expression, that the policy uses to determine whether to attempt to authenticate the user with the SAML server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Name of the SAML authentication action to be performed if the policy matches.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reqaction(String reqaction) throws Exception{
		this.reqaction = reqaction;
	}

	/**
	* <pre>
	* Name of the SAML authentication action to be performed if the policy matches.<br> Minimum length =  1
	* </pre>
	*/
	public String get_reqaction() throws Exception {
		return this.reqaction;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationsamlpolicy_response result = (authenticationsamlpolicy_response) service.get_payload_formatter().string_to_resource(authenticationsamlpolicy_response.class, response);
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
		return result.authenticationsamlpolicy;
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
	* Use this API to add authenticationsamlpolicy.
	*/
	public static base_response add(nitro_service client, authenticationsamlpolicy resource) throws Exception {
		authenticationsamlpolicy addresource = new authenticationsamlpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.reqaction = resource.reqaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationsamlpolicy resources.
	*/
	public static base_responses add(nitro_service client, authenticationsamlpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationsamlpolicy addresources[] = new authenticationsamlpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationsamlpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].reqaction = resources[i].reqaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationsamlpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationsamlpolicy deleteresource = new authenticationsamlpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationsamlpolicy.
	*/
	public static base_response delete(nitro_service client, authenticationsamlpolicy resource) throws Exception {
		authenticationsamlpolicy deleteresource = new authenticationsamlpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationsamlpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationsamlpolicy deleteresources[] = new authenticationsamlpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationsamlpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationsamlpolicy resources.
	*/
	public static base_responses delete(nitro_service client, authenticationsamlpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationsamlpolicy deleteresources[] = new authenticationsamlpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationsamlpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationsamlpolicy.
	*/
	public static base_response update(nitro_service client, authenticationsamlpolicy resource) throws Exception {
		authenticationsamlpolicy updateresource = new authenticationsamlpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.reqaction = resource.reqaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationsamlpolicy resources.
	*/
	public static base_responses update(nitro_service client, authenticationsamlpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationsamlpolicy updateresources[] = new authenticationsamlpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationsamlpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].reqaction = resources[i].reqaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationsamlpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationsamlpolicy resource, String[] args) throws Exception{
		authenticationsamlpolicy unsetresource = new authenticationsamlpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationsamlpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationsamlpolicy unsetresources[] = new authenticationsamlpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationsamlpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationsamlpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationsamlpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationsamlpolicy unsetresources[] = new authenticationsamlpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationsamlpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationsamlpolicy resources that are configured on netscaler.
	*/
	public static authenticationsamlpolicy[] get(nitro_service service) throws Exception{
		authenticationsamlpolicy obj = new authenticationsamlpolicy();
		authenticationsamlpolicy[] response = (authenticationsamlpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationsamlpolicy resources that are configured on netscaler.
	*/
	public static authenticationsamlpolicy[] get(nitro_service service, options option) throws Exception{
		authenticationsamlpolicy obj = new authenticationsamlpolicy();
		authenticationsamlpolicy[] response = (authenticationsamlpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationsamlpolicy resource of given name .
	*/
	public static authenticationsamlpolicy get(nitro_service service, String name) throws Exception{
		authenticationsamlpolicy obj = new authenticationsamlpolicy();
		obj.set_name(name);
		authenticationsamlpolicy response = (authenticationsamlpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationsamlpolicy resources of given names .
	*/
	public static authenticationsamlpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationsamlpolicy response[] = new authenticationsamlpolicy[name.length];
			authenticationsamlpolicy obj[] = new authenticationsamlpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationsamlpolicy();
				obj[i].set_name(name[i]);
				response[i] = (authenticationsamlpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationsamlpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationsamlpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationsamlpolicy obj = new authenticationsamlpolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationsamlpolicy[] response = (authenticationsamlpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationsamlpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationsamlpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationsamlpolicy obj = new authenticationsamlpolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationsamlpolicy[] response = (authenticationsamlpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationsamlpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationsamlpolicy obj = new authenticationsamlpolicy();
		options option = new options();
		option.set_count(true);
		authenticationsamlpolicy[] response = (authenticationsamlpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationsamlpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationsamlpolicy obj = new authenticationsamlpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationsamlpolicy[] response = (authenticationsamlpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationsamlpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationsamlpolicy obj = new authenticationsamlpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationsamlpolicy[] response = (authenticationsamlpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
