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

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemgroup_response extends base_response
{
	public systemgroup[] systemgroup;
}
/**
* Configuration for system group resource.
*/

public class systemgroup extends base_resource
{
	private String groupname;
	private String promptstring;
	private Long timeout;
	private Long __count;

	/**
	* <pre>
	* Name for the group. Must begin with a letter, number, or the underscore (_) character, and must contain only alphanumeric, hyphen (-), period (.), hash (#), space ( ), at (@), equal (=), colon (:), and underscore characters. Cannot be changed after the group is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my group" or 'my group').<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* Name for the group. Must begin with a letter, number, or the underscore (_) character, and must contain only alphanumeric, hyphen (-), period (.), hash (#), space ( ), at (@), equal (=), colon (:), and underscore characters. Cannot be changed after the group is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my group" or 'my group').<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* String to display at the command-line prompt. Can consist of letters, numbers, hyphen (-), period (.), hash (#), space ( ), at (@), equal (=), colon (:), underscore (_), and the following variables: 
* %u - Will be replaced by the user name.
* %h - Will be replaced by the hostname of the NetScaler appliance.
* %t - Will be replaced by the current time in 12-hour format.
* %T - Will be replaced by the current time in 24-hour format.
* %d - Will be replaced by the current date.
* %s - Will be replaced by the state of the NetScaler appliance.

Note: The 63-character limit for the length of the string does not apply to the characters that replace the variables.<br> Minimum length =  1
	* </pre>
	*/
	public void set_promptstring(String promptstring) throws Exception{
		this.promptstring = promptstring;
	}

	/**
	* <pre>
	* String to display at the command-line prompt. Can consist of letters, numbers, hyphen (-), period (.), hash (#), space ( ), at (@), equal (=), colon (:), underscore (_), and the following variables: 
* %u - Will be replaced by the user name.
* %h - Will be replaced by the hostname of the NetScaler appliance.
* %t - Will be replaced by the current time in 12-hour format.
* %T - Will be replaced by the current time in 24-hour format.
* %d - Will be replaced by the current date.
* %s - Will be replaced by the state of the NetScaler appliance.

Note: The 63-character limit for the length of the string does not apply to the characters that replace the variables.<br> Minimum length =  1
	* </pre>
	*/
	public String get_promptstring() throws Exception {
		return this.promptstring;
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemgroup_response result = (systemgroup_response) service.get_payload_formatter().string_to_resource(systemgroup_response.class, response);
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
		return result.systemgroup;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.groupname;
	}

	/**
	* Use this API to add systemgroup.
	*/
	public static base_response add(nitro_service client, systemgroup resource) throws Exception {
		systemgroup addresource = new systemgroup();
		addresource.groupname = resource.groupname;
		addresource.promptstring = resource.promptstring;
		addresource.timeout = resource.timeout;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add systemgroup resources.
	*/
	public static base_responses add(nitro_service client, systemgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemgroup addresources[] = new systemgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new systemgroup();
				addresources[i].groupname = resources[i].groupname;
				addresources[i].promptstring = resources[i].promptstring;
				addresources[i].timeout = resources[i].timeout;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete systemgroup of given name.
	*/
	public static base_response delete(nitro_service client, String groupname) throws Exception {
		systemgroup deleteresource = new systemgroup();
		deleteresource.groupname = groupname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete systemgroup.
	*/
	public static base_response delete(nitro_service client, systemgroup resource) throws Exception {
		systemgroup deleteresource = new systemgroup();
		deleteresource.groupname = resource.groupname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete systemgroup resources of given names.
	*/
	public static base_responses delete(nitro_service client, String groupname[]) throws Exception {
		base_responses result = null;
		if (groupname != null && groupname.length > 0) {
			systemgroup deleteresources[] = new systemgroup[groupname.length];
			for (int i=0;i<groupname.length;i++){
				deleteresources[i] = new systemgroup();
				deleteresources[i].groupname = groupname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete systemgroup resources.
	*/
	public static base_responses delete(nitro_service client, systemgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemgroup deleteresources[] = new systemgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new systemgroup();
				deleteresources[i].groupname = resources[i].groupname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update systemgroup.
	*/
	public static base_response update(nitro_service client, systemgroup resource) throws Exception {
		systemgroup updateresource = new systemgroup();
		updateresource.groupname = resource.groupname;
		updateresource.promptstring = resource.promptstring;
		updateresource.timeout = resource.timeout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update systemgroup resources.
	*/
	public static base_responses update(nitro_service client, systemgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemgroup updateresources[] = new systemgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new systemgroup();
				updateresources[i].groupname = resources[i].groupname;
				updateresources[i].promptstring = resources[i].promptstring;
				updateresources[i].timeout = resources[i].timeout;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of systemgroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, systemgroup resource, String[] args) throws Exception{
		systemgroup unsetresource = new systemgroup();
		unsetresource.groupname = resource.groupname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of systemgroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String groupname[], String args[]) throws Exception {
		base_responses result = null;
		if (groupname != null && groupname.length > 0) {
			systemgroup unsetresources[] = new systemgroup[groupname.length];
			for (int i=0;i<groupname.length;i++){
				unsetresources[i] = new systemgroup();
				unsetresources[i].groupname = groupname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of systemgroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, systemgroup resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemgroup unsetresources[] = new systemgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new systemgroup();
				unsetresources[i].groupname = resources[i].groupname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the systemgroup resources that are configured on netscaler.
	*/
	public static systemgroup[] get(nitro_service service) throws Exception{
		systemgroup obj = new systemgroup();
		systemgroup[] response = (systemgroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the systemgroup resources that are configured on netscaler.
	*/
	public static systemgroup[] get(nitro_service service, options option) throws Exception{
		systemgroup obj = new systemgroup();
		systemgroup[] response = (systemgroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch systemgroup resource of given name .
	*/
	public static systemgroup get(nitro_service service, String groupname) throws Exception{
		systemgroup obj = new systemgroup();
		obj.set_groupname(groupname);
		systemgroup response = (systemgroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch systemgroup resources of given names .
	*/
	public static systemgroup[] get(nitro_service service, String groupname[]) throws Exception{
		if (groupname !=null && groupname.length>0) {
			systemgroup response[] = new systemgroup[groupname.length];
			systemgroup obj[] = new systemgroup[groupname.length];
			for (int i=0;i<groupname.length;i++) {
				obj[i] = new systemgroup();
				obj[i].set_groupname(groupname[i]);
				response[i] = (systemgroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of systemgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static systemgroup[] get_filtered(nitro_service service, String filter) throws Exception{
		systemgroup obj = new systemgroup();
		options option = new options();
		option.set_filter(filter);
		systemgroup[] response = (systemgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systemgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static systemgroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemgroup obj = new systemgroup();
		options option = new options();
		option.set_filter(filter);
		systemgroup[] response = (systemgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the systemgroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		systemgroup obj = new systemgroup();
		options option = new options();
		option.set_count(true);
		systemgroup[] response = (systemgroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of systemgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		systemgroup obj = new systemgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemgroup[] response = (systemgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systemgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemgroup obj = new systemgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemgroup[] response = (systemgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
