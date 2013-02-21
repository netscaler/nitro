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

class authenticationcertpolicy_response extends base_response
{
	public authenticationcertpolicy[] authenticationcertpolicy;
}
/**
* Configuration for CERT policy resource.
*/

public class authenticationcertpolicy extends base_resource
{
	private String name;
	private String rule;
	private String reqaction;
	private Long __count;

	/**
	* <pre>
	* The name for the new policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new policy.<br> Minimum length =  1
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
	* The cert action to associate with the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reqaction(String reqaction) throws Exception{
		this.reqaction = reqaction;
	}

	/**
	* <pre>
	* The cert action to associate with the policy.<br> Minimum length =  1
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
		authenticationcertpolicy_response result = (authenticationcertpolicy_response) service.get_payload_formatter().string_to_resource(authenticationcertpolicy_response.class, response);
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
		return result.authenticationcertpolicy;
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
	* Use this API to add authenticationcertpolicy.
	*/
	public static base_response add(nitro_service client, authenticationcertpolicy resource) throws Exception {
		authenticationcertpolicy addresource = new authenticationcertpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.reqaction = resource.reqaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationcertpolicy resources.
	*/
	public static base_responses add(nitro_service client, authenticationcertpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationcertpolicy addresources[] = new authenticationcertpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationcertpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].reqaction = resources[i].reqaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationcertpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationcertpolicy deleteresource = new authenticationcertpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationcertpolicy.
	*/
	public static base_response delete(nitro_service client, authenticationcertpolicy resource) throws Exception {
		authenticationcertpolicy deleteresource = new authenticationcertpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationcertpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationcertpolicy deleteresources[] = new authenticationcertpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationcertpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationcertpolicy resources.
	*/
	public static base_responses delete(nitro_service client, authenticationcertpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationcertpolicy deleteresources[] = new authenticationcertpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationcertpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationcertpolicy.
	*/
	public static base_response update(nitro_service client, authenticationcertpolicy resource) throws Exception {
		authenticationcertpolicy updateresource = new authenticationcertpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.reqaction = resource.reqaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationcertpolicy resources.
	*/
	public static base_responses update(nitro_service client, authenticationcertpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationcertpolicy updateresources[] = new authenticationcertpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationcertpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].reqaction = resources[i].reqaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationcertpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationcertpolicy unsetresource = new authenticationcertpolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationcertpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationcertpolicy resource, String[] args) throws Exception{
		authenticationcertpolicy unsetresource = new authenticationcertpolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.reqaction = resource.reqaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationcertpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationcertpolicy unsetresources[] = new authenticationcertpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationcertpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationcertpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationcertpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationcertpolicy unsetresources[] = new authenticationcertpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationcertpolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].reqaction = resources[i].reqaction;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationcertpolicy resources that are configured on netscaler.
	*/
	public static authenticationcertpolicy[] get(nitro_service service) throws Exception{
		authenticationcertpolicy obj = new authenticationcertpolicy();
		authenticationcertpolicy[] response = (authenticationcertpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationcertpolicy resources that are configured on netscaler.
	*/
	public static authenticationcertpolicy[] get(nitro_service service, options option) throws Exception{
		authenticationcertpolicy obj = new authenticationcertpolicy();
		authenticationcertpolicy[] response = (authenticationcertpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationcertpolicy resource of given name .
	*/
	public static authenticationcertpolicy get(nitro_service service, String name) throws Exception{
		authenticationcertpolicy obj = new authenticationcertpolicy();
		obj.set_name(name);
		authenticationcertpolicy response = (authenticationcertpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationcertpolicy resources of given names .
	*/
	public static authenticationcertpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationcertpolicy response[] = new authenticationcertpolicy[name.length];
			authenticationcertpolicy obj[] = new authenticationcertpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationcertpolicy();
				obj[i].set_name(name[i]);
				response[i] = (authenticationcertpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationcertpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationcertpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationcertpolicy obj = new authenticationcertpolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationcertpolicy[] response = (authenticationcertpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationcertpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationcertpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationcertpolicy obj = new authenticationcertpolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationcertpolicy[] response = (authenticationcertpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationcertpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationcertpolicy obj = new authenticationcertpolicy();
		options option = new options();
		option.set_count(true);
		authenticationcertpolicy[] response = (authenticationcertpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationcertpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationcertpolicy obj = new authenticationcertpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationcertpolicy[] response = (authenticationcertpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationcertpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationcertpolicy obj = new authenticationcertpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationcertpolicy[] response = (authenticationcertpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
