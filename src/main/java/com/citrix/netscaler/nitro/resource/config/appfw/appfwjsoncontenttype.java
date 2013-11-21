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

class appfwjsoncontenttype_response extends base_response
{
	public appfwjsoncontenttype[] appfwjsoncontenttype;
}
/**
* Configuration for JSON content type resource.
*/

public class appfwjsoncontenttype extends base_resource
{
	private String jsoncontenttypevalue;
	private String isregex;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Content type to be classified as JSON.<br> Minimum length =  1
	* </pre>
	*/
	public void set_jsoncontenttypevalue(String jsoncontenttypevalue) throws Exception{
		this.jsoncontenttypevalue = jsoncontenttypevalue;
	}

	/**
	* <pre>
	* Content type to be classified as JSON.<br> Minimum length =  1
	* </pre>
	*/
	public String get_jsoncontenttypevalue() throws Exception {
		return this.jsoncontenttypevalue;
	}

	/**
	* <pre>
	* Is json content type a regular expression?.<br> Default value: NOTREGEX<br> Possible values = REGEX, NOTREGEX
	* </pre>
	*/
	public void set_isregex(String isregex) throws Exception{
		this.isregex = isregex;
	}

	/**
	* <pre>
	* Is json content type a regular expression?.<br> Default value: NOTREGEX<br> Possible values = REGEX, NOTREGEX
	* </pre>
	*/
	public String get_isregex() throws Exception {
		return this.isregex;
	}

	/**
	* <pre>
	* Flag to determine if jsoncontenttype is built-in or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		appfwjsoncontenttype_response result = (appfwjsoncontenttype_response) service.get_payload_formatter().string_to_resource(appfwjsoncontenttype_response.class, response);
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
		return result.appfwjsoncontenttype;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.jsoncontenttypevalue;
	}

	/**
	* Use this API to add appfwjsoncontenttype.
	*/
	public static base_response add(nitro_service client, appfwjsoncontenttype resource) throws Exception {
		appfwjsoncontenttype addresource = new appfwjsoncontenttype();
		addresource.jsoncontenttypevalue = resource.jsoncontenttypevalue;
		addresource.isregex = resource.isregex;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appfwjsoncontenttype resources.
	*/
	public static base_responses add(nitro_service client, appfwjsoncontenttype resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwjsoncontenttype addresources[] = new appfwjsoncontenttype[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appfwjsoncontenttype();
				addresources[i].jsoncontenttypevalue = resources[i].jsoncontenttypevalue;
				addresources[i].isregex = resources[i].isregex;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwjsoncontenttype of given name.
	*/
	public static base_response delete(nitro_service client, String jsoncontenttypevalue) throws Exception {
		appfwjsoncontenttype deleteresource = new appfwjsoncontenttype();
		deleteresource.jsoncontenttypevalue = jsoncontenttypevalue;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwjsoncontenttype.
	*/
	public static base_response delete(nitro_service client, appfwjsoncontenttype resource) throws Exception {
		appfwjsoncontenttype deleteresource = new appfwjsoncontenttype();
		deleteresource.jsoncontenttypevalue = resource.jsoncontenttypevalue;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwjsoncontenttype resources of given names.
	*/
	public static base_responses delete(nitro_service client, String jsoncontenttypevalue[]) throws Exception {
		base_responses result = null;
		if (jsoncontenttypevalue != null && jsoncontenttypevalue.length > 0) {
			appfwjsoncontenttype deleteresources[] = new appfwjsoncontenttype[jsoncontenttypevalue.length];
			for (int i=0;i<jsoncontenttypevalue.length;i++){
				deleteresources[i] = new appfwjsoncontenttype();
				deleteresources[i].jsoncontenttypevalue = jsoncontenttypevalue[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwjsoncontenttype resources.
	*/
	public static base_responses delete(nitro_service client, appfwjsoncontenttype resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwjsoncontenttype deleteresources[] = new appfwjsoncontenttype[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwjsoncontenttype();
				deleteresources[i].jsoncontenttypevalue = resources[i].jsoncontenttypevalue;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the appfwjsoncontenttype resources that are configured on netscaler.
	*/
	public static appfwjsoncontenttype[] get(nitro_service service) throws Exception{
		appfwjsoncontenttype obj = new appfwjsoncontenttype();
		appfwjsoncontenttype[] response = (appfwjsoncontenttype[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwjsoncontenttype resources that are configured on netscaler.
	*/
	public static appfwjsoncontenttype[] get(nitro_service service, options option) throws Exception{
		appfwjsoncontenttype obj = new appfwjsoncontenttype();
		appfwjsoncontenttype[] response = (appfwjsoncontenttype[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appfwjsoncontenttype resource of given name .
	*/
	public static appfwjsoncontenttype get(nitro_service service, String jsoncontenttypevalue) throws Exception{
		appfwjsoncontenttype obj = new appfwjsoncontenttype();
		obj.set_jsoncontenttypevalue(jsoncontenttypevalue);
		appfwjsoncontenttype response = (appfwjsoncontenttype) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwjsoncontenttype resources of given names .
	*/
	public static appfwjsoncontenttype[] get(nitro_service service, String jsoncontenttypevalue[]) throws Exception{
		if (jsoncontenttypevalue !=null && jsoncontenttypevalue.length>0) {
			appfwjsoncontenttype response[] = new appfwjsoncontenttype[jsoncontenttypevalue.length];
			appfwjsoncontenttype obj[] = new appfwjsoncontenttype[jsoncontenttypevalue.length];
			for (int i=0;i<jsoncontenttypevalue.length;i++) {
				obj[i] = new appfwjsoncontenttype();
				obj[i].set_jsoncontenttypevalue(jsoncontenttypevalue[i]);
				response[i] = (appfwjsoncontenttype) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appfwjsoncontenttype resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwjsoncontenttype[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwjsoncontenttype obj = new appfwjsoncontenttype();
		options option = new options();
		option.set_filter(filter);
		appfwjsoncontenttype[] response = (appfwjsoncontenttype[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwjsoncontenttype resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwjsoncontenttype[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwjsoncontenttype obj = new appfwjsoncontenttype();
		options option = new options();
		option.set_filter(filter);
		appfwjsoncontenttype[] response = (appfwjsoncontenttype[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwjsoncontenttype resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwjsoncontenttype obj = new appfwjsoncontenttype();
		options option = new options();
		option.set_count(true);
		appfwjsoncontenttype[] response = (appfwjsoncontenttype[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwjsoncontenttype resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwjsoncontenttype obj = new appfwjsoncontenttype();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwjsoncontenttype[] response = (appfwjsoncontenttype[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwjsoncontenttype resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwjsoncontenttype obj = new appfwjsoncontenttype();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwjsoncontenttype[] response = (appfwjsoncontenttype[]) obj.getfiltered(service, option);
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
	public static class isregexEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
}
