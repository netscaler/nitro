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

class appfwfieldtype_response extends base_response
{
	public appfwfieldtype[] appfwfieldtype;
}
/**
* Configuration for application firewall form field type resource.
*/

public class appfwfieldtype extends base_resource
{
	private String name;
	private String regex;
	private Long priority;
	private String comment;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the field type.
Must begin with a letter, number, or the underscore character \(_\), and must contain only letters, numbers, and the hyphen \(-\), period \(.\) pound \(\#\), space \( \), at \(\@\), equals \(=\), colon \(:\), and underscore characters. Cannot be changed after the field type is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my field type" or 'my field type'\).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the field type.
Must begin with a letter, number, or the underscore character \(_\), and must contain only letters, numbers, and the hyphen \(-\), period \(.\) pound \(\#\), space \( \), at \(\@\), equals \(=\), colon \(:\), and underscore characters. Cannot be changed after the field type is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my field type" or 'my field type'\).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* PCRE - format regular expression defining the characters and length allowed for this field type.<br> Minimum length =  1
	* </pre>
	*/
	public void set_regex(String regex) throws Exception{
		this.regex = regex;
	}

	/**
	* <pre>
	* PCRE - format regular expression defining the characters and length allowed for this field type.<br> Minimum length =  1
	* </pre>
	*/
	public String get_regex() throws Exception {
		return this.regex;
	}

	/**
	* <pre>
	* Positive integer specifying the priority of the field type. A lower number specified a higher priority. Field types are checked in the order of their priority numbers.<br> Minimum value =  0<br> Maximum value =  64000
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Positive integer specifying the priority of the field type. A lower number specified a higher priority. Field types are checked in the order of their priority numbers.<br> Minimum value =  0<br> Maximum value =  64000
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Positive integer specifying the priority of the field type. A lower number specified a higher priority. Field types are checked in the order of their priority numbers.<br> Minimum value =  0<br> Maximum value =  64000
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Comment describing the type of field that this field type is intended to match.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comment describing the type of field that this field type is intended to match.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Flag to determine if fieldtype is built-in or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		appfwfieldtype_response result = (appfwfieldtype_response) service.get_payload_formatter().string_to_resource(appfwfieldtype_response.class, response);
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
		return result.appfwfieldtype;
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
	* Use this API to add appfwfieldtype.
	*/
	public static base_response add(nitro_service client, appfwfieldtype resource) throws Exception {
		appfwfieldtype addresource = new appfwfieldtype();
		addresource.name = resource.name;
		addresource.regex = resource.regex;
		addresource.priority = resource.priority;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appfwfieldtype resources.
	*/
	public static base_responses add(nitro_service client, appfwfieldtype resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwfieldtype addresources[] = new appfwfieldtype[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appfwfieldtype();
				addresources[i].name = resources[i].name;
				addresources[i].regex = resources[i].regex;
				addresources[i].priority = resources[i].priority;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwfieldtype of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appfwfieldtype deleteresource = new appfwfieldtype();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwfieldtype.
	*/
	public static base_response delete(nitro_service client, appfwfieldtype resource) throws Exception {
		appfwfieldtype deleteresource = new appfwfieldtype();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwfieldtype resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appfwfieldtype deleteresources[] = new appfwfieldtype[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appfwfieldtype();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwfieldtype resources.
	*/
	public static base_responses delete(nitro_service client, appfwfieldtype resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwfieldtype deleteresources[] = new appfwfieldtype[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwfieldtype();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update appfwfieldtype.
	*/
	public static base_response update(nitro_service client, appfwfieldtype resource) throws Exception {
		appfwfieldtype updateresource = new appfwfieldtype();
		updateresource.name = resource.name;
		updateresource.regex = resource.regex;
		updateresource.priority = resource.priority;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appfwfieldtype resources.
	*/
	public static base_responses update(nitro_service client, appfwfieldtype resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwfieldtype updateresources[] = new appfwfieldtype[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwfieldtype();
				updateresources[i].name = resources[i].name;
				updateresources[i].regex = resources[i].regex;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the appfwfieldtype resources that are configured on netscaler.
	*/
	public static appfwfieldtype[] get(nitro_service service) throws Exception{
		appfwfieldtype obj = new appfwfieldtype();
		appfwfieldtype[] response = (appfwfieldtype[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwfieldtype resources that are configured on netscaler.
	*/
	public static appfwfieldtype[] get(nitro_service service, options option) throws Exception{
		appfwfieldtype obj = new appfwfieldtype();
		appfwfieldtype[] response = (appfwfieldtype[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appfwfieldtype resource of given name .
	*/
	public static appfwfieldtype get(nitro_service service, String name) throws Exception{
		appfwfieldtype obj = new appfwfieldtype();
		obj.set_name(name);
		appfwfieldtype response = (appfwfieldtype) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwfieldtype resources of given names .
	*/
	public static appfwfieldtype[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appfwfieldtype response[] = new appfwfieldtype[name.length];
			appfwfieldtype obj[] = new appfwfieldtype[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appfwfieldtype();
				obj[i].set_name(name[i]);
				response[i] = (appfwfieldtype) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appfwfieldtype resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwfieldtype[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwfieldtype obj = new appfwfieldtype();
		options option = new options();
		option.set_filter(filter);
		appfwfieldtype[] response = (appfwfieldtype[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwfieldtype resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwfieldtype[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwfieldtype obj = new appfwfieldtype();
		options option = new options();
		option.set_filter(filter);
		appfwfieldtype[] response = (appfwfieldtype[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwfieldtype resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwfieldtype obj = new appfwfieldtype();
		options option = new options();
		option.set_count(true);
		appfwfieldtype[] response = (appfwfieldtype[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwfieldtype resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwfieldtype obj = new appfwfieldtype();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwfieldtype[] response = (appfwfieldtype[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwfieldtype resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwfieldtype obj = new appfwfieldtype();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwfieldtype[] response = (appfwfieldtype[]) obj.getfiltered(service, option);
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
}
