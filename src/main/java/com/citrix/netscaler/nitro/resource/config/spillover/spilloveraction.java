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

package com.citrix.netscaler.nitro.resource.config.spillover;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class spilloveraction_response extends base_response
{
	public spilloveraction[] spilloveraction;
}
/**
* Configuration for Spillover action resource.
*/

public class spilloveraction extends base_resource
{
	private String name;
	private String action;
	private String newname;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name of the spillover action.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the spillover action.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Spillover action. Currently only type SPILLOVER is supported.<br> Possible values = SPILLOVER
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Spillover action. Currently only type SPILLOVER is supported.<br> Possible values = SPILLOVER
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* New name for the spillover action. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at
(@), equals (=), and hyphen (-) characters. 
Choose a name that can be correlated with the function that the action performs. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the spillover action. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at
(@), equals (=), and hyphen (-) characters. 
Choose a name that can be correlated with the function that the action performs. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Flag to determine whether compression is default or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		spilloveraction_response result = (spilloveraction_response) service.get_payload_formatter().string_to_resource(spilloveraction_response.class, response);
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
		return result.spilloveraction;
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
	* Use this API to add spilloveraction.
	*/
	public static base_response add(nitro_service client, spilloveraction resource) throws Exception {
		spilloveraction addresource = new spilloveraction();
		addresource.name = resource.name;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add spilloveraction resources.
	*/
	public static base_responses add(nitro_service client, spilloveraction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			spilloveraction addresources[] = new spilloveraction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new spilloveraction();
				addresources[i].name = resources[i].name;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete spilloveraction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		spilloveraction deleteresource = new spilloveraction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete spilloveraction.
	*/
	public static base_response delete(nitro_service client, spilloveraction resource) throws Exception {
		spilloveraction deleteresource = new spilloveraction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete spilloveraction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			spilloveraction deleteresources[] = new spilloveraction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new spilloveraction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete spilloveraction resources.
	*/
	public static base_responses delete(nitro_service client, spilloveraction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			spilloveraction deleteresources[] = new spilloveraction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new spilloveraction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a spilloveraction resource.
	*/
	public static base_response rename(nitro_service client, spilloveraction resource, String new_name) throws Exception {
		spilloveraction renameresource = new spilloveraction();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a spilloveraction resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		spilloveraction renameresource = new spilloveraction();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the spilloveraction resources that are configured on netscaler.
	*/
	public static spilloveraction[] get(nitro_service service) throws Exception{
		spilloveraction obj = new spilloveraction();
		spilloveraction[] response = (spilloveraction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the spilloveraction resources that are configured on netscaler.
	*/
	public static spilloveraction[] get(nitro_service service, options option) throws Exception{
		spilloveraction obj = new spilloveraction();
		spilloveraction[] response = (spilloveraction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch spilloveraction resource of given name .
	*/
	public static spilloveraction get(nitro_service service, String name) throws Exception{
		spilloveraction obj = new spilloveraction();
		obj.set_name(name);
		spilloveraction response = (spilloveraction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch spilloveraction resources of given names .
	*/
	public static spilloveraction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			spilloveraction response[] = new spilloveraction[name.length];
			spilloveraction obj[] = new spilloveraction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new spilloveraction();
				obj[i].set_name(name[i]);
				response[i] = (spilloveraction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of spilloveraction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static spilloveraction[] get_filtered(nitro_service service, String filter) throws Exception{
		spilloveraction obj = new spilloveraction();
		options option = new options();
		option.set_filter(filter);
		spilloveraction[] response = (spilloveraction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of spilloveraction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static spilloveraction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		spilloveraction obj = new spilloveraction();
		options option = new options();
		option.set_filter(filter);
		spilloveraction[] response = (spilloveraction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the spilloveraction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		spilloveraction obj = new spilloveraction();
		options option = new options();
		option.set_count(true);
		spilloveraction[] response = (spilloveraction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of spilloveraction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		spilloveraction obj = new spilloveraction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		spilloveraction[] response = (spilloveraction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of spilloveraction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		spilloveraction obj = new spilloveraction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		spilloveraction[] response = (spilloveraction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class actionEnum {
		public static final String SPILLOVER = "SPILLOVER";
	}
}
