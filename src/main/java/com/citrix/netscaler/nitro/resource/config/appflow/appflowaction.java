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

class appflowaction_response extends base_response
{
	public appflowaction[] appflowaction;
}
/**
* Configuration for AppFlow action resource.
*/

public class appflowaction extends base_resource
{
	private String name;
	private String[] collectors;
	private String comment;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long referencecount;
	private String description;
	private Long __count;

	/**
	* <pre>
	* Name of the AppFlow action to be added.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the AppFlow action to be added.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The names of AppFlow collectors associated with the AppFlow action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_collectors(String[] collectors) throws Exception{
		this.collectors = collectors;
	}

	/**
	* <pre>
	* The names of AppFlow collectors associated with the AppFlow action.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_collectors() throws Exception {
		return this.collectors;
	}

	/**
	* <pre>
	* Comments associated with this AppFlow action.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this AppFlow action.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The new name of the AppFlow action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the AppFlow action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The number of times the action has been taken.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of references to the action.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* Description of the action.
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
		appflowaction_response result = (appflowaction_response) service.get_payload_formatter().string_to_resource(appflowaction_response.class, response);
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
		return result.appflowaction;
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
	* Use this API to add appflowaction.
	*/
	public static base_response add(nitro_service client, appflowaction resource) throws Exception {
		appflowaction addresource = new appflowaction();
		addresource.name = resource.name;
		addresource.collectors = resource.collectors;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appflowaction resources.
	*/
	public static base_responses add(nitro_service client, appflowaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowaction addresources[] = new appflowaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appflowaction();
				addresources[i].name = resources[i].name;
				addresources[i].collectors = resources[i].collectors;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appflowaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appflowaction deleteresource = new appflowaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appflowaction.
	*/
	public static base_response delete(nitro_service client, appflowaction resource) throws Exception {
		appflowaction deleteresource = new appflowaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appflowaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appflowaction deleteresources[] = new appflowaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appflowaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appflowaction resources.
	*/
	public static base_responses delete(nitro_service client, appflowaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowaction deleteresources[] = new appflowaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appflowaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update appflowaction.
	*/
	public static base_response update(nitro_service client, appflowaction resource) throws Exception {
		appflowaction updateresource = new appflowaction();
		updateresource.name = resource.name;
		updateresource.collectors = resource.collectors;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appflowaction resources.
	*/
	public static base_responses update(nitro_service client, appflowaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowaction updateresources[] = new appflowaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appflowaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].collectors = resources[i].collectors;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appflowaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		appflowaction unsetresource = new appflowaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of appflowaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appflowaction resource, String[] args) throws Exception{
		appflowaction unsetresource = new appflowaction();
		unsetresource.name = resource.name;
		unsetresource.comment = resource.comment;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of appflowaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appflowaction unsetresources[] = new appflowaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new appflowaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appflowaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, appflowaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowaction unsetresources[] = new appflowaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new appflowaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].comment = resources[i].comment;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a appflowaction resource.
	*/
	public static base_response rename(nitro_service client, appflowaction resource, String new_name) throws Exception {
		appflowaction renameresource = new appflowaction();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a appflowaction resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		appflowaction renameresource = new appflowaction();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the appflowaction resources that are configured on netscaler.
	*/
	public static appflowaction[] get(nitro_service service) throws Exception{
		appflowaction obj = new appflowaction();
		appflowaction[] response = (appflowaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appflowaction resources that are configured on netscaler.
	*/
	public static appflowaction[] get(nitro_service service, options option) throws Exception{
		appflowaction obj = new appflowaction();
		appflowaction[] response = (appflowaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appflowaction resource of given name .
	*/
	public static appflowaction get(nitro_service service, String name) throws Exception{
		appflowaction obj = new appflowaction();
		obj.set_name(name);
		appflowaction response = (appflowaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appflowaction resources of given names .
	*/
	public static appflowaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appflowaction response[] = new appflowaction[name.length];
			appflowaction obj[] = new appflowaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appflowaction();
				obj[i].set_name(name[i]);
				response[i] = (appflowaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appflowaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appflowaction[] get_filtered(nitro_service service, String filter) throws Exception{
		appflowaction obj = new appflowaction();
		options option = new options();
		option.set_filter(filter);
		appflowaction[] response = (appflowaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appflowaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appflowaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appflowaction obj = new appflowaction();
		options option = new options();
		option.set_filter(filter);
		appflowaction[] response = (appflowaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appflowaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appflowaction obj = new appflowaction();
		options option = new options();
		option.set_count(true);
		appflowaction[] response = (appflowaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appflowaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appflowaction obj = new appflowaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appflowaction[] response = (appflowaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appflowaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appflowaction obj = new appflowaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appflowaction[] response = (appflowaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
