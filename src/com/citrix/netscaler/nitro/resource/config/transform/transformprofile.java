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

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformprofile_response extends base_response
{
	public transformprofile[] transformprofile;
}
/**
* Configuration for URL Transformation profile resource.
*/

public class transformprofile extends base_resource
{
	private String name;
	private String type;
	private String onlytransformabsurlinbody;
	private String comment;

	//------- Read only Parameter ---------;

	private String regexforfindingurlinjavascript;
	private String regexforfindingurlincss;
	private String regexforfindingurlinxcomponent;
	private String regexforfindingurlinxml;
	private String additionalreqheaderslist;
	private String additionalrespheaderslist;
	private Long __count;

	/**
	* <pre>
	* URL Transformation profile name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* URL Transformation profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Type of transformation.<br> Possible values = URL
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of transformation.<br> Possible values = URL
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Flag to only perform transformations of absolute URLs in HTTP body.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_onlytransformabsurlinbody(String onlytransformabsurlinbody) throws Exception{
		this.onlytransformabsurlinbody = onlytransformabsurlinbody;
	}

	/**
	* <pre>
	* Flag to only perform transformations of absolute URLs in HTTP body.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_onlytransformabsurlinbody() throws Exception {
		return this.onlytransformabsurlinbody;
	}

	/**
	* <pre>
	* Comments.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Patclass having regexes to find the URLs in JavaScript.
	* </pre>
	*/
	public String get_regexforfindingurlinjavascript() throws Exception {
		return this.regexforfindingurlinjavascript;
	}

	/**
	* <pre>
	* Patclass having regexes to find the URLs in CSS.
	* </pre>
	*/
	public String get_regexforfindingurlincss() throws Exception {
		return this.regexforfindingurlincss;
	}

	/**
	* <pre>
	* Patclass having regexes to find the URLs in X-Component.
	* </pre>
	*/
	public String get_regexforfindingurlinxcomponent() throws Exception {
		return this.regexforfindingurlinxcomponent;
	}

	/**
	* <pre>
	* Patclass having regexes to find the URLs in XML.
	* </pre>
	*/
	public String get_regexforfindingurlinxml() throws Exception {
		return this.regexforfindingurlinxml;
	}

	/**
	* <pre>
	* Patclass having a list of additional request header names that should transformed.
	* </pre>
	*/
	public String get_additionalreqheaderslist() throws Exception {
		return this.additionalreqheaderslist;
	}

	/**
	* <pre>
	* Patclass having a list of additional response header names that should transformed.
	* </pre>
	*/
	public String get_additionalrespheaderslist() throws Exception {
		return this.additionalrespheaderslist;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformprofile_response result = (transformprofile_response) service.get_payload_formatter().string_to_resource(transformprofile_response.class, response);
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
		return result.transformprofile;
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
	* Use this API to add transformprofile.
	*/
	public static base_response add(nitro_service client, transformprofile resource) throws Exception {
		transformprofile addresource = new transformprofile();
		addresource.name = resource.name;
		addresource.type = resource.type;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add transformprofile resources.
	*/
	public static base_responses add(nitro_service client, transformprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformprofile addresources[] = new transformprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new transformprofile();
				addresources[i].name = resources[i].name;
				addresources[i].type = resources[i].type;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete transformprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		transformprofile deleteresource = new transformprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete transformprofile.
	*/
	public static base_response delete(nitro_service client, transformprofile resource) throws Exception {
		transformprofile deleteresource = new transformprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete transformprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			transformprofile deleteresources[] = new transformprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new transformprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete transformprofile resources.
	*/
	public static base_responses delete(nitro_service client, transformprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformprofile deleteresources[] = new transformprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new transformprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update transformprofile.
	*/
	public static base_response update(nitro_service client, transformprofile resource) throws Exception {
		transformprofile updateresource = new transformprofile();
		updateresource.name = resource.name;
		updateresource.type = resource.type;
		updateresource.onlytransformabsurlinbody = resource.onlytransformabsurlinbody;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update transformprofile resources.
	*/
	public static base_responses update(nitro_service client, transformprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformprofile updateresources[] = new transformprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new transformprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].type = resources[i].type;
				updateresources[i].onlytransformabsurlinbody = resources[i].onlytransformabsurlinbody;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of transformprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		transformprofile unsetresource = new transformprofile();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of transformprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, transformprofile resource, String[] args) throws Exception{
		transformprofile unsetresource = new transformprofile();
		unsetresource.name = resource.name;
		unsetresource.type = resource.type;
		unsetresource.onlytransformabsurlinbody = resource.onlytransformabsurlinbody;
		unsetresource.comment = resource.comment;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of transformprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			transformprofile unsetresources[] = new transformprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new transformprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of transformprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, transformprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformprofile unsetresources[] = new transformprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new transformprofile();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].type = resources[i].type;
				unsetresources[i].onlytransformabsurlinbody = resources[i].onlytransformabsurlinbody;
				unsetresources[i].comment = resources[i].comment;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the transformprofile resources that are configured on netscaler.
	*/
	public static transformprofile[] get(nitro_service service) throws Exception{
		transformprofile obj = new transformprofile();
		transformprofile[] response = (transformprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the transformprofile resources that are configured on netscaler.
	*/
	public static transformprofile[] get(nitro_service service, options option) throws Exception{
		transformprofile obj = new transformprofile();
		transformprofile[] response = (transformprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch transformprofile resource of given name .
	*/
	public static transformprofile get(nitro_service service, String name) throws Exception{
		transformprofile obj = new transformprofile();
		obj.set_name(name);
		transformprofile response = (transformprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch transformprofile resources of given names .
	*/
	public static transformprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			transformprofile response[] = new transformprofile[name.length];
			transformprofile obj[] = new transformprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new transformprofile();
				obj[i].set_name(name[i]);
				response[i] = (transformprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of transformprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static transformprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		transformprofile obj = new transformprofile();
		options option = new options();
		option.set_filter(filter);
		transformprofile[] response = (transformprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of transformprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static transformprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		transformprofile obj = new transformprofile();
		options option = new options();
		option.set_filter(filter);
		transformprofile[] response = (transformprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the transformprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		transformprofile obj = new transformprofile();
		options option = new options();
		option.set_count(true);
		transformprofile[] response = (transformprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of transformprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		transformprofile obj = new transformprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformprofile[] response = (transformprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of transformprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		transformprofile obj = new transformprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformprofile[] response = (transformprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class onlytransformabsurlinbodyEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class typeEnum {
		public static final String URL = "URL";
	}
}
