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

class authenticationtacacspolicy_response extends base_response
{
	public authenticationtacacspolicy[] authenticationtacacspolicy;
}
/**
* Configuration for TACACS policy resource.
*/

public class authenticationtacacspolicy extends base_resource
{
	private String name;
	private String rule;
	private String reqaction;
	private Long __count;

	/**
	* <pre>
	* The name of the new TACACS+ policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the new TACACS+ policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of the rule or expression the policy will use.<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The name of the rule or expression the policy will use.<br> Minimum length =  1
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the TACACS+ action to be associated with the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reqaction(String reqaction) throws Exception{
		this.reqaction = reqaction;
	}

	/**
	* <pre>
	* The name of the TACACS+ action to be associated with the policy.<br> Minimum length =  1
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
		authenticationtacacspolicy_response result = (authenticationtacacspolicy_response) service.get_payload_formatter().string_to_resource(authenticationtacacspolicy_response.class, response);
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
		return result.authenticationtacacspolicy;
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
	* Use this API to add authenticationtacacspolicy.
	*/
	public static base_response add(nitro_service client, authenticationtacacspolicy resource) throws Exception {
		authenticationtacacspolicy addresource = new authenticationtacacspolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.reqaction = resource.reqaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationtacacspolicy resources.
	*/
	public static base_responses add(nitro_service client, authenticationtacacspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationtacacspolicy addresources[] = new authenticationtacacspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationtacacspolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].reqaction = resources[i].reqaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationtacacspolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationtacacspolicy deleteresource = new authenticationtacacspolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationtacacspolicy.
	*/
	public static base_response delete(nitro_service client, authenticationtacacspolicy resource) throws Exception {
		authenticationtacacspolicy deleteresource = new authenticationtacacspolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationtacacspolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationtacacspolicy deleteresources[] = new authenticationtacacspolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationtacacspolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationtacacspolicy resources.
	*/
	public static base_responses delete(nitro_service client, authenticationtacacspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationtacacspolicy deleteresources[] = new authenticationtacacspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationtacacspolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationtacacspolicy.
	*/
	public static base_response update(nitro_service client, authenticationtacacspolicy resource) throws Exception {
		authenticationtacacspolicy updateresource = new authenticationtacacspolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.reqaction = resource.reqaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationtacacspolicy resources.
	*/
	public static base_responses update(nitro_service client, authenticationtacacspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationtacacspolicy updateresources[] = new authenticationtacacspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationtacacspolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].reqaction = resources[i].reqaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationtacacspolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationtacacspolicy unsetresource = new authenticationtacacspolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationtacacspolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationtacacspolicy resource, String[] args) throws Exception{
		authenticationtacacspolicy unsetresource = new authenticationtacacspolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.reqaction = resource.reqaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationtacacspolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationtacacspolicy unsetresources[] = new authenticationtacacspolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationtacacspolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationtacacspolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationtacacspolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationtacacspolicy unsetresources[] = new authenticationtacacspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationtacacspolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].reqaction = resources[i].reqaction;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationtacacspolicy resources that are configured on netscaler.
	*/
	public static authenticationtacacspolicy[] get(nitro_service service) throws Exception{
		authenticationtacacspolicy obj = new authenticationtacacspolicy();
		authenticationtacacspolicy[] response = (authenticationtacacspolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationtacacspolicy resources that are configured on netscaler.
	*/
	public static authenticationtacacspolicy[] get(nitro_service service, options option) throws Exception{
		authenticationtacacspolicy obj = new authenticationtacacspolicy();
		authenticationtacacspolicy[] response = (authenticationtacacspolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationtacacspolicy resource of given name .
	*/
	public static authenticationtacacspolicy get(nitro_service service, String name) throws Exception{
		authenticationtacacspolicy obj = new authenticationtacacspolicy();
		obj.set_name(name);
		authenticationtacacspolicy response = (authenticationtacacspolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationtacacspolicy resources of given names .
	*/
	public static authenticationtacacspolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationtacacspolicy response[] = new authenticationtacacspolicy[name.length];
			authenticationtacacspolicy obj[] = new authenticationtacacspolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationtacacspolicy();
				obj[i].set_name(name[i]);
				response[i] = (authenticationtacacspolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationtacacspolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationtacacspolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationtacacspolicy obj = new authenticationtacacspolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationtacacspolicy[] response = (authenticationtacacspolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationtacacspolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationtacacspolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationtacacspolicy obj = new authenticationtacacspolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationtacacspolicy[] response = (authenticationtacacspolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationtacacspolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationtacacspolicy obj = new authenticationtacacspolicy();
		options option = new options();
		option.set_count(true);
		authenticationtacacspolicy[] response = (authenticationtacacspolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationtacacspolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationtacacspolicy obj = new authenticationtacacspolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationtacacspolicy[] response = (authenticationtacacspolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationtacacspolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationtacacspolicy obj = new authenticationtacacspolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationtacacspolicy[] response = (authenticationtacacspolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
