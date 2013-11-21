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

package com.citrix.netscaler.nitro.resource.config.filter;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class filterhtmlinjectionvariable_response extends base_response
{
	public filterhtmlinjectionvariable[] filterhtmlinjectionvariable;
}
/**
* Configuration for HTML injection variable resource.
*/

public class filterhtmlinjectionvariable extends base_resource
{
	private String variable;
	private String value;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private String type;
	private Long __count;

	/**
	* <pre>
	* Name for the HTML injection variable to be added.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_variable(String variable) throws Exception{
		this.variable = variable;
	}

	/**
	* <pre>
	* Name for the HTML injection variable to be added.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_variable() throws Exception {
		return this.variable;
	}

	/**
	* <pre>
	* Value to be assigned to the new variable.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_value(String value) throws Exception{
		this.value = value;
	}

	/**
	* <pre>
	* Value to be assigned to the new variable.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* Type of the HTML injection variable.<br> Possible values = System internal, User defined
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		filterhtmlinjectionvariable_response result = (filterhtmlinjectionvariable_response) service.get_payload_formatter().string_to_resource(filterhtmlinjectionvariable_response.class, response);
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
		return result.filterhtmlinjectionvariable;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.variable;
	}

	/**
	* Use this API to add filterhtmlinjectionvariable.
	*/
	public static base_response add(nitro_service client, filterhtmlinjectionvariable resource) throws Exception {
		filterhtmlinjectionvariable addresource = new filterhtmlinjectionvariable();
		addresource.variable = resource.variable;
		addresource.value = resource.value;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add filterhtmlinjectionvariable resources.
	*/
	public static base_responses add(nitro_service client, filterhtmlinjectionvariable resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterhtmlinjectionvariable addresources[] = new filterhtmlinjectionvariable[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new filterhtmlinjectionvariable();
				addresources[i].variable = resources[i].variable;
				addresources[i].value = resources[i].value;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete filterhtmlinjectionvariable of given name.
	*/
	public static base_response delete(nitro_service client, String variable) throws Exception {
		filterhtmlinjectionvariable deleteresource = new filterhtmlinjectionvariable();
		deleteresource.variable = variable;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete filterhtmlinjectionvariable.
	*/
	public static base_response delete(nitro_service client, filterhtmlinjectionvariable resource) throws Exception {
		filterhtmlinjectionvariable deleteresource = new filterhtmlinjectionvariable();
		deleteresource.variable = resource.variable;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete filterhtmlinjectionvariable resources of given names.
	*/
	public static base_responses delete(nitro_service client, String variable[]) throws Exception {
		base_responses result = null;
		if (variable != null && variable.length > 0) {
			filterhtmlinjectionvariable deleteresources[] = new filterhtmlinjectionvariable[variable.length];
			for (int i=0;i<variable.length;i++){
				deleteresources[i] = new filterhtmlinjectionvariable();
				deleteresources[i].variable = variable[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete filterhtmlinjectionvariable resources.
	*/
	public static base_responses delete(nitro_service client, filterhtmlinjectionvariable resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterhtmlinjectionvariable deleteresources[] = new filterhtmlinjectionvariable[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new filterhtmlinjectionvariable();
				deleteresources[i].variable = resources[i].variable;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update filterhtmlinjectionvariable.
	*/
	public static base_response update(nitro_service client, filterhtmlinjectionvariable resource) throws Exception {
		filterhtmlinjectionvariable updateresource = new filterhtmlinjectionvariable();
		updateresource.variable = resource.variable;
		updateresource.value = resource.value;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update filterhtmlinjectionvariable resources.
	*/
	public static base_responses update(nitro_service client, filterhtmlinjectionvariable resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterhtmlinjectionvariable updateresources[] = new filterhtmlinjectionvariable[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new filterhtmlinjectionvariable();
				updateresources[i].variable = resources[i].variable;
				updateresources[i].value = resources[i].value;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of filterhtmlinjectionvariable resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, filterhtmlinjectionvariable resource, String[] args) throws Exception{
		filterhtmlinjectionvariable unsetresource = new filterhtmlinjectionvariable();
		unsetresource.variable = resource.variable;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of filterhtmlinjectionvariable resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String variable[], String args[]) throws Exception {
		base_responses result = null;
		if (variable != null && variable.length > 0) {
			filterhtmlinjectionvariable unsetresources[] = new filterhtmlinjectionvariable[variable.length];
			for (int i=0;i<variable.length;i++){
				unsetresources[i] = new filterhtmlinjectionvariable();
				unsetresources[i].variable = variable[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of filterhtmlinjectionvariable resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, filterhtmlinjectionvariable resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterhtmlinjectionvariable unsetresources[] = new filterhtmlinjectionvariable[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new filterhtmlinjectionvariable();
				unsetresources[i].variable = resources[i].variable;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the filterhtmlinjectionvariable resources that are configured on netscaler.
	*/
	public static filterhtmlinjectionvariable[] get(nitro_service service) throws Exception{
		filterhtmlinjectionvariable obj = new filterhtmlinjectionvariable();
		filterhtmlinjectionvariable[] response = (filterhtmlinjectionvariable[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the filterhtmlinjectionvariable resources that are configured on netscaler.
	*/
	public static filterhtmlinjectionvariable[] get(nitro_service service, options option) throws Exception{
		filterhtmlinjectionvariable obj = new filterhtmlinjectionvariable();
		filterhtmlinjectionvariable[] response = (filterhtmlinjectionvariable[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filterhtmlinjectionvariable resource of given name .
	*/
	public static filterhtmlinjectionvariable get(nitro_service service, String variable) throws Exception{
		filterhtmlinjectionvariable obj = new filterhtmlinjectionvariable();
		obj.set_variable(variable);
		filterhtmlinjectionvariable response = (filterhtmlinjectionvariable) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch filterhtmlinjectionvariable resources of given names .
	*/
	public static filterhtmlinjectionvariable[] get(nitro_service service, String variable[]) throws Exception{
		if (variable !=null && variable.length>0) {
			filterhtmlinjectionvariable response[] = new filterhtmlinjectionvariable[variable.length];
			filterhtmlinjectionvariable obj[] = new filterhtmlinjectionvariable[variable.length];
			for (int i=0;i<variable.length;i++) {
				obj[i] = new filterhtmlinjectionvariable();
				obj[i].set_variable(variable[i]);
				response[i] = (filterhtmlinjectionvariable) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of filterhtmlinjectionvariable resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static filterhtmlinjectionvariable[] get_filtered(nitro_service service, String filter) throws Exception{
		filterhtmlinjectionvariable obj = new filterhtmlinjectionvariable();
		options option = new options();
		option.set_filter(filter);
		filterhtmlinjectionvariable[] response = (filterhtmlinjectionvariable[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of filterhtmlinjectionvariable resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static filterhtmlinjectionvariable[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		filterhtmlinjectionvariable obj = new filterhtmlinjectionvariable();
		options option = new options();
		option.set_filter(filter);
		filterhtmlinjectionvariable[] response = (filterhtmlinjectionvariable[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the filterhtmlinjectionvariable resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		filterhtmlinjectionvariable obj = new filterhtmlinjectionvariable();
		options option = new options();
		option.set_count(true);
		filterhtmlinjectionvariable[] response = (filterhtmlinjectionvariable[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of filterhtmlinjectionvariable resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		filterhtmlinjectionvariable obj = new filterhtmlinjectionvariable();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filterhtmlinjectionvariable[] response = (filterhtmlinjectionvariable[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of filterhtmlinjectionvariable resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		filterhtmlinjectionvariable obj = new filterhtmlinjectionvariable();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filterhtmlinjectionvariable[] response = (filterhtmlinjectionvariable[]) obj.getfiltered(service, option);
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
	public static class typeEnum {
		public static final String System_internal = "System internal";
		public static final String User_defined = "User defined";
	}
}
