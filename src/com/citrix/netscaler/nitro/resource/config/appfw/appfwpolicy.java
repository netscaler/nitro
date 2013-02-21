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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwpolicy_response extends base_response
{
	public appfwpolicy[] appfwpolicy;
}
/**
* Configuration for application firewall policy resource.
*/

public class appfwpolicy extends base_resource
{
	private String name;
	private String rule;
	private String profilename;
	private String comment;
	private String logaction;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private Long __count;

	/**
	* <pre>
	* Application Firewall policy name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Application Firewall policy name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule associated with the policy.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule associated with the policy.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Application Firewall profile name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* Application Firewall profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Comments associated with this application firewall policy.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this application firewall policy.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The log action associated with the application firewall policy.
	* </pre>
	*/
	public void set_logaction(String logaction) throws Exception{
		this.logaction = logaction;
	}

	/**
	* <pre>
	* The log action associated with the application firewall policy.
	* </pre>
	*/
	public String get_logaction() throws Exception {
		return this.logaction;
	}

	/**
	* <pre>
	* The new name of the application firewall policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the application firewall policy.<br> Minimum length =  1
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
	* Number of Undef hits.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwpolicy_response result = (appfwpolicy_response) service.get_payload_formatter().string_to_resource(appfwpolicy_response.class, response);
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
		return result.appfwpolicy;
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
	* Use this API to add appfwpolicy.
	*/
	public static base_response add(nitro_service client, appfwpolicy resource) throws Exception {
		appfwpolicy addresource = new appfwpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.profilename = resource.profilename;
		addresource.comment = resource.comment;
		addresource.logaction = resource.logaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appfwpolicy resources.
	*/
	public static base_responses add(nitro_service client, appfwpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwpolicy addresources[] = new appfwpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appfwpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].profilename = resources[i].profilename;
				addresources[i].comment = resources[i].comment;
				addresources[i].logaction = resources[i].logaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appfwpolicy deleteresource = new appfwpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwpolicy.
	*/
	public static base_response delete(nitro_service client, appfwpolicy resource) throws Exception {
		appfwpolicy deleteresource = new appfwpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appfwpolicy deleteresources[] = new appfwpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appfwpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwpolicy resources.
	*/
	public static base_responses delete(nitro_service client, appfwpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwpolicy deleteresources[] = new appfwpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update appfwpolicy.
	*/
	public static base_response update(nitro_service client, appfwpolicy resource) throws Exception {
		appfwpolicy updateresource = new appfwpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.profilename = resource.profilename;
		updateresource.comment = resource.comment;
		updateresource.logaction = resource.logaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appfwpolicy resources.
	*/
	public static base_responses update(nitro_service client, appfwpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwpolicy updateresources[] = new appfwpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].profilename = resources[i].profilename;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].logaction = resources[i].logaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appfwpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		appfwpolicy unsetresource = new appfwpolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of appfwpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appfwpolicy resource, String[] args) throws Exception{
		appfwpolicy unsetresource = new appfwpolicy();
		unsetresource.name = resource.name;
		unsetresource.comment = resource.comment;
		unsetresource.logaction = resource.logaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of appfwpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appfwpolicy unsetresources[] = new appfwpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new appfwpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appfwpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, appfwpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwpolicy unsetresources[] = new appfwpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new appfwpolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].logaction = resources[i].logaction;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a appfwpolicy resource.
	*/
	public static base_response rename(nitro_service client, appfwpolicy resource, String new_name) throws Exception {
		appfwpolicy renameresource = new appfwpolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a appfwpolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		appfwpolicy renameresource = new appfwpolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the appfwpolicy resources that are configured on netscaler.
	*/
	public static appfwpolicy[] get(nitro_service service) throws Exception{
		appfwpolicy obj = new appfwpolicy();
		appfwpolicy[] response = (appfwpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwpolicy resources that are configured on netscaler.
	*/
	public static appfwpolicy[] get(nitro_service service, options option) throws Exception{
		appfwpolicy obj = new appfwpolicy();
		appfwpolicy[] response = (appfwpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appfwpolicy resource of given name .
	*/
	public static appfwpolicy get(nitro_service service, String name) throws Exception{
		appfwpolicy obj = new appfwpolicy();
		obj.set_name(name);
		appfwpolicy response = (appfwpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwpolicy resources of given names .
	*/
	public static appfwpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appfwpolicy response[] = new appfwpolicy[name.length];
			appfwpolicy obj[] = new appfwpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appfwpolicy();
				obj[i].set_name(name[i]);
				response[i] = (appfwpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appfwpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwpolicy obj = new appfwpolicy();
		options option = new options();
		option.set_filter(filter);
		appfwpolicy[] response = (appfwpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwpolicy obj = new appfwpolicy();
		options option = new options();
		option.set_filter(filter);
		appfwpolicy[] response = (appfwpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwpolicy obj = new appfwpolicy();
		options option = new options();
		option.set_count(true);
		appfwpolicy[] response = (appfwpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwpolicy obj = new appfwpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwpolicy[] response = (appfwpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwpolicy obj = new appfwpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwpolicy[] response = (appfwpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
