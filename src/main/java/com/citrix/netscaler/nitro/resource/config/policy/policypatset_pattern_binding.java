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

class policypatset_pattern_binding_response extends base_response
{
	public policypatset_pattern_binding[] policypatset_pattern_binding;
}
/**
	* Binding class showing the pattern that can be bound to policypatset.
	*/

public class policypatset_pattern_binding extends base_resource
{
	private String String;
	private Long index;
	private String charset;
	private String[] builtin;
	private String name;
	private Long __count;

	/**
	* <pre>
	* String of characters that constitutes a pattern. For more information about the characters that can be used, refer to the character set parameter.
Note: Minimum length for pattern sets used in rewrite actions of type REPLACE_ALL, DELETE_ALL, INSERT_AFTER_ALL, and INSERT_BEFORE_ALL, is three characters.
	* </pre>
	*/
	public void set_String(String String) throws Exception{
		this.String = String;
	}

	/**
	* <pre>
	* String of characters that constitutes a pattern. For more information about the characters that can be used, refer to the character set parameter.
Note: Minimum length for pattern sets used in rewrite actions of type REPLACE_ALL, DELETE_ALL, INSERT_AFTER_ALL, and INSERT_BEFORE_ALL, is three characters.
	* </pre>
	*/
	public String get_String() throws Exception {
		return this.String;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public void set_builtin(String[] builtin) throws Exception{
		this.builtin = builtin;
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
	* Name of the pattern set to which to bind the string.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the pattern set to which to bind the string.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Character set associated with the characters in the string.
Note: UTF-8 characters can be entered directly (if the UI supports it) or can be encoded as a sequence of hexadecimal bytes '\xNN'. For example, the UTF-8 character 'ü' can be encoded as '\xC3\xBC'.<br> Possible values = ASCII, UTF_8
	* </pre>
	*/
	public void set_charset(String charset) throws Exception{
		this.charset = charset;
	}

	/**
	* <pre>
	* Character set associated with the characters in the string.
Note: UTF-8 characters can be entered directly (if the UI supports it) or can be encoded as a sequence of hexadecimal bytes '\xNN'. For example, the UTF-8 character 'ü' can be encoded as '\xC3\xBC'.<br> Possible values = ASCII, UTF_8
	* </pre>
	*/
	public String get_charset() throws Exception {
		return this.charset;
	}

	/**
	* <pre>
	* The index of the string associated with the patset.
	* </pre>
	*/
	public void set_index(long index) throws Exception {
		this.index = new Long(index);
	}

	/**
	* <pre>
	* The index of the string associated with the patset.
	* </pre>
	*/
	public void set_index(Long index) throws Exception{
		this.index = index;
	}

	/**
	* <pre>
	* The index of the string associated with the patset.
	* </pre>
	*/
	public Long get_index() throws Exception {
		return this.index;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		policypatset_pattern_binding_response result = (policypatset_pattern_binding_response) service.get_payload_formatter().string_to_resource(policypatset_pattern_binding_response.class, response);
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
		return result.policypatset_pattern_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, policypatset_pattern_binding resource) throws Exception {
		policypatset_pattern_binding updateresource = new policypatset_pattern_binding();
		updateresource.name = resource.name;
		updateresource.String = resource.String;
		updateresource.index = resource.index;
		updateresource.charset = resource.charset;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, policypatset_pattern_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policypatset_pattern_binding updateresources[] = new policypatset_pattern_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new policypatset_pattern_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].String = resources[i].String;
				updateresources[i].index = resources[i].index;
				updateresources[i].charset = resources[i].charset;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, policypatset_pattern_binding resource) throws Exception {
		policypatset_pattern_binding deleteresource = new policypatset_pattern_binding();
		deleteresource.name = resource.name;
		deleteresource.String = resource.String;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, policypatset_pattern_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policypatset_pattern_binding deleteresources[] = new policypatset_pattern_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new policypatset_pattern_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].String = resources[i].String;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch policypatset_pattern_binding resources of given name .
	*/
	public static policypatset_pattern_binding[] get(nitro_service service, String name) throws Exception{
		policypatset_pattern_binding obj = new policypatset_pattern_binding();
		obj.set_name(name);
		policypatset_pattern_binding response[] = (policypatset_pattern_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policypatset_pattern_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static policypatset_pattern_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		policypatset_pattern_binding obj = new policypatset_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		policypatset_pattern_binding[] response = (policypatset_pattern_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policypatset_pattern_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static policypatset_pattern_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		policypatset_pattern_binding obj = new policypatset_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		policypatset_pattern_binding[] response = (policypatset_pattern_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count policypatset_pattern_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		policypatset_pattern_binding obj = new policypatset_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		policypatset_pattern_binding response[] = (policypatset_pattern_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policypatset_pattern_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		policypatset_pattern_binding obj = new policypatset_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policypatset_pattern_binding[] response = (policypatset_pattern_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policypatset_pattern_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		policypatset_pattern_binding obj = new policypatset_pattern_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policypatset_pattern_binding[] response = (policypatset_pattern_binding[]) obj.getfiltered(service, option);
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
	public static class charsetEnum {
		public static final String ASCII = "ASCII";
		public static final String UTF_8 = "UTF_8";
	}

}