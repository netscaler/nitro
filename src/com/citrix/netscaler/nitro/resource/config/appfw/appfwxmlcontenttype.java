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

class appfwxmlcontenttype_response extends base_response
{
	public appfwxmlcontenttype[] appfwxmlcontenttype;
}
/**
* Configuration for XML Content type resource.
*/

public class appfwxmlcontenttype extends base_resource
{
	private String xmlcontenttypevalue;
	private String isregex;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Content type to be classified as XML.<br> Minimum length =  1
	* </pre>
	*/
	public void set_xmlcontenttypevalue(String xmlcontenttypevalue) throws Exception{
		this.xmlcontenttypevalue = xmlcontenttypevalue;
	}

	/**
	* <pre>
	* Content type to be classified as XML.<br> Minimum length =  1
	* </pre>
	*/
	public String get_xmlcontenttypevalue() throws Exception {
		return this.xmlcontenttypevalue;
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
	* Flag to determine if xmlcontenttype is built-in or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		appfwxmlcontenttype_response result = (appfwxmlcontenttype_response) service.get_payload_formatter().string_to_resource(appfwxmlcontenttype_response.class, response);
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
		return result.appfwxmlcontenttype;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.xmlcontenttypevalue;
	}

	/**
	* Use this API to add appfwxmlcontenttype.
	*/
	public static base_response add(nitro_service client, appfwxmlcontenttype resource) throws Exception {
		appfwxmlcontenttype addresource = new appfwxmlcontenttype();
		addresource.xmlcontenttypevalue = resource.xmlcontenttypevalue;
		addresource.isregex = resource.isregex;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appfwxmlcontenttype resources.
	*/
	public static base_responses add(nitro_service client, appfwxmlcontenttype resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwxmlcontenttype addresources[] = new appfwxmlcontenttype[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appfwxmlcontenttype();
				addresources[i].xmlcontenttypevalue = resources[i].xmlcontenttypevalue;
				addresources[i].isregex = resources[i].isregex;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwxmlcontenttype of given name.
	*/
	public static base_response delete(nitro_service client, String xmlcontenttypevalue) throws Exception {
		appfwxmlcontenttype deleteresource = new appfwxmlcontenttype();
		deleteresource.xmlcontenttypevalue = xmlcontenttypevalue;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwxmlcontenttype.
	*/
	public static base_response delete(nitro_service client, appfwxmlcontenttype resource) throws Exception {
		appfwxmlcontenttype deleteresource = new appfwxmlcontenttype();
		deleteresource.xmlcontenttypevalue = resource.xmlcontenttypevalue;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwxmlcontenttype resources of given names.
	*/
	public static base_responses delete(nitro_service client, String xmlcontenttypevalue[]) throws Exception {
		base_responses result = null;
		if (xmlcontenttypevalue != null && xmlcontenttypevalue.length > 0) {
			appfwxmlcontenttype deleteresources[] = new appfwxmlcontenttype[xmlcontenttypevalue.length];
			for (int i=0;i<xmlcontenttypevalue.length;i++){
				deleteresources[i] = new appfwxmlcontenttype();
				deleteresources[i].xmlcontenttypevalue = xmlcontenttypevalue[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwxmlcontenttype resources.
	*/
	public static base_responses delete(nitro_service client, appfwxmlcontenttype resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwxmlcontenttype deleteresources[] = new appfwxmlcontenttype[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwxmlcontenttype();
				deleteresources[i].xmlcontenttypevalue = resources[i].xmlcontenttypevalue;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the appfwxmlcontenttype resources that are configured on netscaler.
	*/
	public static appfwxmlcontenttype[] get(nitro_service service) throws Exception{
		appfwxmlcontenttype obj = new appfwxmlcontenttype();
		appfwxmlcontenttype[] response = (appfwxmlcontenttype[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwxmlcontenttype resources that are configured on netscaler.
	*/
	public static appfwxmlcontenttype[] get(nitro_service service, options option) throws Exception{
		appfwxmlcontenttype obj = new appfwxmlcontenttype();
		appfwxmlcontenttype[] response = (appfwxmlcontenttype[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appfwxmlcontenttype resource of given name .
	*/
	public static appfwxmlcontenttype get(nitro_service service, String xmlcontenttypevalue) throws Exception{
		appfwxmlcontenttype obj = new appfwxmlcontenttype();
		obj.set_xmlcontenttypevalue(xmlcontenttypevalue);
		appfwxmlcontenttype response = (appfwxmlcontenttype) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwxmlcontenttype resources of given names .
	*/
	public static appfwxmlcontenttype[] get(nitro_service service, String xmlcontenttypevalue[]) throws Exception{
		if (xmlcontenttypevalue !=null && xmlcontenttypevalue.length>0) {
			appfwxmlcontenttype response[] = new appfwxmlcontenttype[xmlcontenttypevalue.length];
			appfwxmlcontenttype obj[] = new appfwxmlcontenttype[xmlcontenttypevalue.length];
			for (int i=0;i<xmlcontenttypevalue.length;i++) {
				obj[i] = new appfwxmlcontenttype();
				obj[i].set_xmlcontenttypevalue(xmlcontenttypevalue[i]);
				response[i] = (appfwxmlcontenttype) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appfwxmlcontenttype resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwxmlcontenttype[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwxmlcontenttype obj = new appfwxmlcontenttype();
		options option = new options();
		option.set_filter(filter);
		appfwxmlcontenttype[] response = (appfwxmlcontenttype[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwxmlcontenttype resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwxmlcontenttype[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwxmlcontenttype obj = new appfwxmlcontenttype();
		options option = new options();
		option.set_filter(filter);
		appfwxmlcontenttype[] response = (appfwxmlcontenttype[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwxmlcontenttype resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwxmlcontenttype obj = new appfwxmlcontenttype();
		options option = new options();
		option.set_count(true);
		appfwxmlcontenttype[] response = (appfwxmlcontenttype[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwxmlcontenttype resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwxmlcontenttype obj = new appfwxmlcontenttype();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwxmlcontenttype[] response = (appfwxmlcontenttype[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwxmlcontenttype resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwxmlcontenttype obj = new appfwxmlcontenttype();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwxmlcontenttype[] response = (appfwxmlcontenttype[]) obj.getfiltered(service, option);
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
