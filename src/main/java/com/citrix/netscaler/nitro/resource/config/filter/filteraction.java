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

class filteraction_response extends base_response
{
	public filteraction[] filteraction;
}
/**
* Configuration for filter action resource.
*/

public class filteraction extends base_resource
{
	private String name;
	private String qual;
	private String servicename;
	private String value;
	private Long respcode;
	private String page;

	//------- Read only Parameter ---------;

	private Boolean isdefault;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the filtering action. Must begin with a letter, number, or the underscore character (_). Other characters allowed, after the first character, are the hyphen (-), period (.) hash (#), space ( ), at sign (@), equals (=), and colon (:) characters. Choose a name that helps identify the type of action. The name of a filter action cannot be changed after it is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the filtering action. Must begin with a letter, number, or the underscore character (_). Other characters allowed, after the first character, are the hyphen (-), period (.) hash (#), space ( ), at sign (@), equals (=), and colon (:) characters. Choose a name that helps identify the type of action. The name of a filter action cannot be changed after it is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Qualifier, which is the action to be performed. The qualifier cannot be changed after it is set. The available options function as follows:
ADD - Adds the specified HTTP header.
RESET - Terminates the connection, sending the appropriate termination notice to the user's browser.
FORWARD - Redirects the request to the designated service. You must specify either a service name or a page, but not both.
DROP - Silently deletes the request, without sending a response to the user's browser. 
CORRUPT - Modifies the designated HTTP header to prevent it from performing the function it was intended to perform, then sends the request/response to the server/browser.
ERRORCODE. Returns the designated HTTP error code to the user's browser (for example, 404, the standard HTTP code for a non-existent Web page).<br> Possible values = reset, add, corrupt, forward, errorcode, drop
	* </pre>
	*/
	public void set_qual(String qual) throws Exception{
		this.qual = qual;
	}

	/**
	* <pre>
	* Qualifier, which is the action to be performed. The qualifier cannot be changed after it is set. The available options function as follows:
ADD - Adds the specified HTTP header.
RESET - Terminates the connection, sending the appropriate termination notice to the user's browser.
FORWARD - Redirects the request to the designated service. You must specify either a service name or a page, but not both.
DROP - Silently deletes the request, without sending a response to the user's browser. 
CORRUPT - Modifies the designated HTTP header to prevent it from performing the function it was intended to perform, then sends the request/response to the server/browser.
ERRORCODE. Returns the designated HTTP error code to the user's browser (for example, 404, the standard HTTP code for a non-existent Web page).<br> Possible values = reset, add, corrupt, forward, errorcode, drop
	* </pre>
	*/
	public String get_qual() throws Exception {
		return this.qual;
	}

	/**
	* <pre>
	* Service to which to forward HTTP requests. Required if the qualifier is FORWARD.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* Service to which to forward HTTP requests. Required if the qualifier is FORWARD.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* String containing the header_name and header_value. If the qualifier is ADD, specify <header_name>:<header_value>. If the qualifier is CORRUPT, specify only the header_name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_value(String value) throws Exception{
		this.value = value;
	}

	/**
	* <pre>
	* String containing the header_name and header_value. If the qualifier is ADD, specify <header_name>:<header_value>. If the qualifier is CORRUPT, specify only the header_name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* Response code to be returned for HTTP requests (for use with the ERRORCODE qualifier).<br> Minimum value =  1
	* </pre>
	*/
	public void set_respcode(long respcode) throws Exception {
		this.respcode = new Long(respcode);
	}

	/**
	* <pre>
	* Response code to be returned for HTTP requests (for use with the ERRORCODE qualifier).<br> Minimum value =  1
	* </pre>
	*/
	public void set_respcode(Long respcode) throws Exception{
		this.respcode = respcode;
	}

	/**
	* <pre>
	* Response code to be returned for HTTP requests (for use with the ERRORCODE qualifier).<br> Minimum value =  1
	* </pre>
	*/
	public Long get_respcode() throws Exception {
		return this.respcode;
	}

	/**
	* <pre>
	* HTML page to return for HTTP requests (For use with the ERRORCODE qualifier).<br> Minimum length =  1
	* </pre>
	*/
	public void set_page(String page) throws Exception{
		this.page = page;
	}

	/**
	* <pre>
	* HTML page to return for HTTP requests (For use with the ERRORCODE qualifier).<br> Minimum length =  1
	* </pre>
	*/
	public String get_page() throws Exception {
		return this.page;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default filteraction.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
	}

	/**
	* <pre>
	* .<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		filteraction_response result = (filteraction_response) service.get_payload_formatter().string_to_resource(filteraction_response.class, response);
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
		return result.filteraction;
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
	* Use this API to add filteraction.
	*/
	public static base_response add(nitro_service client, filteraction resource) throws Exception {
		filteraction addresource = new filteraction();
		addresource.name = resource.name;
		addresource.qual = resource.qual;
		addresource.servicename = resource.servicename;
		addresource.value = resource.value;
		addresource.respcode = resource.respcode;
		addresource.page = resource.page;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add filteraction resources.
	*/
	public static base_responses add(nitro_service client, filteraction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filteraction addresources[] = new filteraction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new filteraction();
				addresources[i].name = resources[i].name;
				addresources[i].qual = resources[i].qual;
				addresources[i].servicename = resources[i].servicename;
				addresources[i].value = resources[i].value;
				addresources[i].respcode = resources[i].respcode;
				addresources[i].page = resources[i].page;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete filteraction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		filteraction deleteresource = new filteraction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete filteraction.
	*/
	public static base_response delete(nitro_service client, filteraction resource) throws Exception {
		filteraction deleteresource = new filteraction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete filteraction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			filteraction deleteresources[] = new filteraction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new filteraction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete filteraction resources.
	*/
	public static base_responses delete(nitro_service client, filteraction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filteraction deleteresources[] = new filteraction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new filteraction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update filteraction.
	*/
	public static base_response update(nitro_service client, filteraction resource) throws Exception {
		filteraction updateresource = new filteraction();
		updateresource.name = resource.name;
		updateresource.servicename = resource.servicename;
		updateresource.value = resource.value;
		updateresource.respcode = resource.respcode;
		updateresource.page = resource.page;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update filteraction resources.
	*/
	public static base_responses update(nitro_service client, filteraction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filteraction updateresources[] = new filteraction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new filteraction();
				updateresources[i].name = resources[i].name;
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].value = resources[i].value;
				updateresources[i].respcode = resources[i].respcode;
				updateresources[i].page = resources[i].page;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of filteraction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, filteraction resource, String[] args) throws Exception{
		filteraction unsetresource = new filteraction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of filteraction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			filteraction unsetresources[] = new filteraction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new filteraction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of filteraction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, filteraction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filteraction unsetresources[] = new filteraction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new filteraction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the filteraction resources that are configured on netscaler.
	*/
	public static filteraction[] get(nitro_service service) throws Exception{
		filteraction obj = new filteraction();
		filteraction[] response = (filteraction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the filteraction resources that are configured on netscaler.
	*/
	public static filteraction[] get(nitro_service service, options option) throws Exception{
		filteraction obj = new filteraction();
		filteraction[] response = (filteraction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filteraction resource of given name .
	*/
	public static filteraction get(nitro_service service, String name) throws Exception{
		filteraction obj = new filteraction();
		obj.set_name(name);
		filteraction response = (filteraction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch filteraction resources of given names .
	*/
	public static filteraction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			filteraction response[] = new filteraction[name.length];
			filteraction obj[] = new filteraction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new filteraction();
				obj[i].set_name(name[i]);
				response[i] = (filteraction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of filteraction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static filteraction[] get_filtered(nitro_service service, String filter) throws Exception{
		filteraction obj = new filteraction();
		options option = new options();
		option.set_filter(filter);
		filteraction[] response = (filteraction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of filteraction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static filteraction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		filteraction obj = new filteraction();
		options option = new options();
		option.set_filter(filter);
		filteraction[] response = (filteraction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the filteraction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		filteraction obj = new filteraction();
		options option = new options();
		option.set_count(true);
		filteraction[] response = (filteraction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of filteraction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		filteraction obj = new filteraction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filteraction[] response = (filteraction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of filteraction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		filteraction obj = new filteraction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filteraction[] response = (filteraction[]) obj.getfiltered(service, option);
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
	public static class qualEnum {
		public static final String reset = "reset";
		public static final String add = "add";
		public static final String corrupt = "corrupt";
		public static final String forward = "forward";
		public static final String errorcode = "errorcode";
		public static final String drop = "drop";
	}
}
