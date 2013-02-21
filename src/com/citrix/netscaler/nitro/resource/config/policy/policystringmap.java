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

package com.citrix.netscaler.nitro.resource.config.policy;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class policystringmap_response extends base_response
{
	public policystringmap[] policystringmap;
}
/**
* Configuration for string map resource.
*/

public class policystringmap extends base_resource
{
	private String name;
	private String comment;
	private Long __count;

	/**
	* <pre>
	* The name of the string map that will be created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the string map that will be created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Comments associated with this string map.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this string map.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		policystringmap_response result = (policystringmap_response) service.get_payload_formatter().string_to_resource(policystringmap_response.class, response);
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
		return result.policystringmap;
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
	* Use this API to add policystringmap.
	*/
	public static base_response add(nitro_service client, policystringmap resource) throws Exception {
		policystringmap addresource = new policystringmap();
		addresource.name = resource.name;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add policystringmap resources.
	*/
	public static base_responses add(nitro_service client, policystringmap resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policystringmap addresources[] = new policystringmap[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new policystringmap();
				addresources[i].name = resources[i].name;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete policystringmap of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		policystringmap deleteresource = new policystringmap();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policystringmap.
	*/
	public static base_response delete(nitro_service client, policystringmap resource) throws Exception {
		policystringmap deleteresource = new policystringmap();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policystringmap resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			policystringmap deleteresources[] = new policystringmap[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new policystringmap();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete policystringmap resources.
	*/
	public static base_responses delete(nitro_service client, policystringmap resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policystringmap deleteresources[] = new policystringmap[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new policystringmap();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update policystringmap.
	*/
	public static base_response update(nitro_service client, policystringmap resource) throws Exception {
		policystringmap updateresource = new policystringmap();
		updateresource.name = resource.name;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update policystringmap resources.
	*/
	public static base_responses update(nitro_service client, policystringmap resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policystringmap updateresources[] = new policystringmap[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new policystringmap();
				updateresources[i].name = resources[i].name;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of policystringmap resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		policystringmap unsetresource = new policystringmap();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of policystringmap resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, policystringmap resource, String[] args) throws Exception{
		policystringmap unsetresource = new policystringmap();
		unsetresource.name = resource.name;
		unsetresource.comment = resource.comment;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of policystringmap resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			policystringmap unsetresources[] = new policystringmap[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new policystringmap();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of policystringmap resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, policystringmap resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policystringmap unsetresources[] = new policystringmap[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new policystringmap();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].comment = resources[i].comment;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the policystringmap resources that are configured on netscaler.
	*/
	public static policystringmap[] get(nitro_service service) throws Exception{
		policystringmap obj = new policystringmap();
		policystringmap[] response = (policystringmap[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the policystringmap resources that are configured on netscaler.
	*/
	public static policystringmap[] get(nitro_service service, options option) throws Exception{
		policystringmap obj = new policystringmap();
		policystringmap[] response = (policystringmap[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch policystringmap resource of given name .
	*/
	public static policystringmap get(nitro_service service, String name) throws Exception{
		policystringmap obj = new policystringmap();
		obj.set_name(name);
		policystringmap response = (policystringmap) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch policystringmap resources of given names .
	*/
	public static policystringmap[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			policystringmap response[] = new policystringmap[name.length];
			policystringmap obj[] = new policystringmap[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new policystringmap();
				obj[i].set_name(name[i]);
				response[i] = (policystringmap) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of policystringmap resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static policystringmap[] get_filtered(nitro_service service, String filter) throws Exception{
		policystringmap obj = new policystringmap();
		options option = new options();
		option.set_filter(filter);
		policystringmap[] response = (policystringmap[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policystringmap resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static policystringmap[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policystringmap obj = new policystringmap();
		options option = new options();
		option.set_filter(filter);
		policystringmap[] response = (policystringmap[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the policystringmap resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		policystringmap obj = new policystringmap();
		options option = new options();
		option.set_count(true);
		policystringmap[] response = (policystringmap[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of policystringmap resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		policystringmap obj = new policystringmap();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policystringmap[] response = (policystringmap[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policystringmap resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policystringmap obj = new policystringmap();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policystringmap[] response = (policystringmap[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
