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

class authenticationlocalpolicy_response extends base_response
{
	public authenticationlocalpolicy[] authenticationlocalpolicy;
}
/**
* Configuration for LOCAL policy resource.
*/

public class authenticationlocalpolicy extends base_resource
{
	private String name;
	private String rule;

	//------- Read only Parameter ---------;

	private String reqaction;
	private Long __count;

	/**
	* <pre>
	* Name for the local authentication policy. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after local policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authentication policy” or ‘my authentication policy’).
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the local authentication policy. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after local policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authentication policy” or ‘my authentication policy’).
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
	* The name of the RADIUS action the policy uses.
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
		authenticationlocalpolicy_response result = (authenticationlocalpolicy_response) service.get_payload_formatter().string_to_resource(authenticationlocalpolicy_response.class, response);
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
		return result.authenticationlocalpolicy;
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
	* Use this API to add authenticationlocalpolicy.
	*/
	public static base_response add(nitro_service client, authenticationlocalpolicy resource) throws Exception {
		authenticationlocalpolicy addresource = new authenticationlocalpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationlocalpolicy resources.
	*/
	public static base_responses add(nitro_service client, authenticationlocalpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationlocalpolicy addresources[] = new authenticationlocalpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationlocalpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationlocalpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationlocalpolicy deleteresource = new authenticationlocalpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationlocalpolicy.
	*/
	public static base_response delete(nitro_service client, authenticationlocalpolicy resource) throws Exception {
		authenticationlocalpolicy deleteresource = new authenticationlocalpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationlocalpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationlocalpolicy deleteresources[] = new authenticationlocalpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationlocalpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationlocalpolicy resources.
	*/
	public static base_responses delete(nitro_service client, authenticationlocalpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationlocalpolicy deleteresources[] = new authenticationlocalpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationlocalpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationlocalpolicy.
	*/
	public static base_response update(nitro_service client, authenticationlocalpolicy resource) throws Exception {
		authenticationlocalpolicy updateresource = new authenticationlocalpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationlocalpolicy resources.
	*/
	public static base_responses update(nitro_service client, authenticationlocalpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationlocalpolicy updateresources[] = new authenticationlocalpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationlocalpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationlocalpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationlocalpolicy resource, String[] args) throws Exception{
		authenticationlocalpolicy unsetresource = new authenticationlocalpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationlocalpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationlocalpolicy unsetresources[] = new authenticationlocalpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationlocalpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationlocalpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationlocalpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationlocalpolicy unsetresources[] = new authenticationlocalpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationlocalpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationlocalpolicy resources that are configured on netscaler.
	*/
	public static authenticationlocalpolicy[] get(nitro_service service) throws Exception{
		authenticationlocalpolicy obj = new authenticationlocalpolicy();
		authenticationlocalpolicy[] response = (authenticationlocalpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationlocalpolicy resources that are configured on netscaler.
	*/
	public static authenticationlocalpolicy[] get(nitro_service service, options option) throws Exception{
		authenticationlocalpolicy obj = new authenticationlocalpolicy();
		authenticationlocalpolicy[] response = (authenticationlocalpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationlocalpolicy resource of given name .
	*/
	public static authenticationlocalpolicy get(nitro_service service, String name) throws Exception{
		authenticationlocalpolicy obj = new authenticationlocalpolicy();
		obj.set_name(name);
		authenticationlocalpolicy response = (authenticationlocalpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationlocalpolicy resources of given names .
	*/
	public static authenticationlocalpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationlocalpolicy response[] = new authenticationlocalpolicy[name.length];
			authenticationlocalpolicy obj[] = new authenticationlocalpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationlocalpolicy();
				obj[i].set_name(name[i]);
				response[i] = (authenticationlocalpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationlocalpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationlocalpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationlocalpolicy obj = new authenticationlocalpolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationlocalpolicy[] response = (authenticationlocalpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationlocalpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationlocalpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationlocalpolicy obj = new authenticationlocalpolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationlocalpolicy[] response = (authenticationlocalpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationlocalpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationlocalpolicy obj = new authenticationlocalpolicy();
		options option = new options();
		option.set_count(true);
		authenticationlocalpolicy[] response = (authenticationlocalpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationlocalpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationlocalpolicy obj = new authenticationlocalpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationlocalpolicy[] response = (authenticationlocalpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationlocalpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationlocalpolicy obj = new authenticationlocalpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationlocalpolicy[] response = (authenticationlocalpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
