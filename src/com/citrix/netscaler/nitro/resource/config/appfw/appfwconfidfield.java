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

class appfwconfidfield_response extends base_response
{
	public appfwconfidfield[] appfwconfidfield;
}
/**
* Configuration for configured confidential form fields resource.
*/

public class appfwconfidfield extends base_resource
{
	private String fieldname;
	private String url;
	private String isregex;
	private String comment;
	private String state;
	private Long __count;

	/**
	* <pre>
	* Form field name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_fieldname(String fieldname) throws Exception{
		this.fieldname = fieldname;
	}

	/**
	* <pre>
	* Form field name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_fieldname() throws Exception {
		return this.fieldname;
	}

	/**
	* <pre>
	* Form action URL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_url(String url) throws Exception{
		this.url = url;
	}

	/**
	* <pre>
	* Form action URL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* Is field name a regular expression?.<br> Default value: NS_NOTREGEX<br> Possible values = REGEX, NOTREGEX
	* </pre>
	*/
	public void set_isregex(String isregex) throws Exception{
		this.isregex = isregex;
	}

	/**
	* <pre>
	* Is field name a regular expression?.<br> Default value: NS_NOTREGEX<br> Possible values = REGEX, NOTREGEX
	* </pre>
	*/
	public String get_isregex() throws Exception {
		return this.isregex;
	}

	/**
	* <pre>
	* Comments associated with this confidential form field.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this confidential form field.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Enabled.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enabled.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwconfidfield_response result = (appfwconfidfield_response) service.get_payload_formatter().string_to_resource(appfwconfidfield_response.class, response);
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
		return result.appfwconfidfield;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.fieldname;
	}

	/**
	* Use this API to add appfwconfidfield.
	*/
	public static base_response add(nitro_service client, appfwconfidfield resource) throws Exception {
		appfwconfidfield addresource = new appfwconfidfield();
		addresource.fieldname = resource.fieldname;
		addresource.url = resource.url;
		addresource.isregex = resource.isregex;
		addresource.comment = resource.comment;
		addresource.state = resource.state;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appfwconfidfield resources.
	*/
	public static base_responses add(nitro_service client, appfwconfidfield resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwconfidfield addresources[] = new appfwconfidfield[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appfwconfidfield();
				addresources[i].fieldname = resources[i].fieldname;
				addresources[i].url = resources[i].url;
				addresources[i].isregex = resources[i].isregex;
				addresources[i].comment = resources[i].comment;
				addresources[i].state = resources[i].state;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwconfidfield of given name.
	*/
	public static base_response delete(nitro_service client, String fieldname) throws Exception {
		appfwconfidfield deleteresource = new appfwconfidfield();
		deleteresource.fieldname = fieldname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwconfidfield.
	*/
	public static base_response delete(nitro_service client, appfwconfidfield resource) throws Exception {
		appfwconfidfield deleteresource = new appfwconfidfield();
		deleteresource.fieldname = resource.fieldname;
		deleteresource.url = resource.url;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwconfidfield resources of given names.
	*/
	public static base_responses delete(nitro_service client, String fieldname[]) throws Exception {
		base_responses result = null;
		if (fieldname != null && fieldname.length > 0) {
			appfwconfidfield deleteresources[] = new appfwconfidfield[fieldname.length];
			for (int i=0;i<fieldname.length;i++){
				deleteresources[i] = new appfwconfidfield();
				deleteresources[i].fieldname = fieldname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwconfidfield resources.
	*/
	public static base_responses delete(nitro_service client, appfwconfidfield resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwconfidfield deleteresources[] = new appfwconfidfield[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwconfidfield();
				deleteresources[i].fieldname = resources[i].fieldname;
				deleteresources[i].url = resources[i].url;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update appfwconfidfield.
	*/
	public static base_response update(nitro_service client, appfwconfidfield resource) throws Exception {
		appfwconfidfield updateresource = new appfwconfidfield();
		updateresource.fieldname = resource.fieldname;
		updateresource.url = resource.url;
		updateresource.comment = resource.comment;
		updateresource.state = resource.state;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appfwconfidfield resources.
	*/
	public static base_responses update(nitro_service client, appfwconfidfield resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwconfidfield updateresources[] = new appfwconfidfield[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwconfidfield();
				updateresources[i].fieldname = resources[i].fieldname;
				updateresources[i].url = resources[i].url;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].state = resources[i].state;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appfwconfidfield resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String fieldname, String args[]) throws Exception {
		appfwconfidfield unsetresource = new appfwconfidfield();
		unsetresource.fieldname = fieldname;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of appfwconfidfield resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appfwconfidfield resource, String[] args) throws Exception{
		appfwconfidfield unsetresource = new appfwconfidfield();
		unsetresource.fieldname = resource.fieldname;
		unsetresource.url = resource.url;
		unsetresource.comment = resource.comment;
		unsetresource.state = resource.state;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of appfwconfidfield resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String fieldname[], String args[]) throws Exception {
		base_responses result = null;
		if (fieldname != null && fieldname.length > 0) {
			appfwconfidfield unsetresources[] = new appfwconfidfield[fieldname.length];
			for (int i=0;i<fieldname.length;i++){
				unsetresources[i] = new appfwconfidfield();
				unsetresources[i].fieldname = fieldname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appfwconfidfield resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, appfwconfidfield resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwconfidfield unsetresources[] = new appfwconfidfield[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new appfwconfidfield();
				unsetresources[i].fieldname = resources[i].fieldname;
				unsetresources[i].url = resources[i].url;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].state = resources[i].state;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the appfwconfidfield resources that are configured on netscaler.
	*/
	public static appfwconfidfield[] get(nitro_service service) throws Exception{
		appfwconfidfield obj = new appfwconfidfield();
		appfwconfidfield[] response = (appfwconfidfield[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwconfidfield resources that are configured on netscaler.
	*/
	public static appfwconfidfield[] get(nitro_service service, options option) throws Exception{
		appfwconfidfield obj = new appfwconfidfield();
		appfwconfidfield[] response = (appfwconfidfield[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a appfwconfidfield resource.
	*/
	public static appfwconfidfield get(nitro_service service, appfwconfidfield obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		appfwconfidfield response = (appfwconfidfield) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a appfwconfidfield resources.
	*/
	public static appfwconfidfield[] get(nitro_service service, appfwconfidfield obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			appfwconfidfield response[] = new appfwconfidfield[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (appfwconfidfield) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appfwconfidfield resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwconfidfield[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwconfidfield obj = new appfwconfidfield();
		options option = new options();
		option.set_filter(filter);
		appfwconfidfield[] response = (appfwconfidfield[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwconfidfield resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwconfidfield[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwconfidfield obj = new appfwconfidfield();
		options option = new options();
		option.set_filter(filter);
		appfwconfidfield[] response = (appfwconfidfield[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwconfidfield resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwconfidfield obj = new appfwconfidfield();
		options option = new options();
		option.set_count(true);
		appfwconfidfield[] response = (appfwconfidfield[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwconfidfield resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwconfidfield obj = new appfwconfidfield();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwconfidfield[] response = (appfwconfidfield[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwconfidfield resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwconfidfield obj = new appfwconfidfield();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwconfidfield[] response = (appfwconfidfield[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class isregexEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
}
