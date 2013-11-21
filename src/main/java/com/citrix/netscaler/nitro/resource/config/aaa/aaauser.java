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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaauser_response extends base_response
{
	public aaauser[] aaauser;
}
/**
* Configuration for AAA user resource.
*/

public class aaauser extends base_resource
{
	private String username;
	private String password;
	private Boolean loggedin;
	private Long __count;

	/**
	* <pre>
	* Name for the user. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the user is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or
single quotation marks (for example, "my aaa user" or "my aaa user").<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* Name for the user. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the user is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or
single quotation marks (for example, "my aaa user" or "my aaa user").<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* Password with which the user logs on. Required for any user account that does not exist on an external authentication server. 
If you are not using an external authentication server, all user accounts must have a password. If you are using an external authentication server, you must provide a password for local user accounts that do not exist on the authentication server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* Password with which the user logs on. Required for any user account that does not exist on an external authentication server. 
If you are not using an external authentication server, all user accounts must have a password. If you are using an external authentication server, you must provide a password for local user accounts that do not exist on the authentication server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* Show whether the user is logged in or not.
	* </pre>
	*/
	public void set_loggedin(boolean loggedin) throws Exception {
		this.loggedin = new Boolean(loggedin);
	}

	/**
	* <pre>
	* Show whether the user is logged in or not.
	* </pre>
	*/
	public void set_loggedin(Boolean loggedin) throws Exception{
		this.loggedin = loggedin;
	}

	/**
	* <pre>
	* Show whether the user is logged in or not.
	* </pre>
	*/
	public Boolean get_loggedin() throws Exception {
		return this.loggedin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaauser_response result = (aaauser_response) service.get_payload_formatter().string_to_resource(aaauser_response.class, response);
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
		return result.aaauser;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.username;
	}

	/**
	* Use this API to add aaauser.
	*/
	public static base_response add(nitro_service client, aaauser resource) throws Exception {
		aaauser addresource = new aaauser();
		addresource.username = resource.username;
		addresource.password = resource.password;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add aaauser resources.
	*/
	public static base_responses add(nitro_service client, aaauser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser addresources[] = new aaauser[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new aaauser();
				addresources[i].username = resources[i].username;
				addresources[i].password = resources[i].password;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaauser of given name.
	*/
	public static base_response delete(nitro_service client, String username) throws Exception {
		aaauser deleteresource = new aaauser();
		deleteresource.username = username;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaauser.
	*/
	public static base_response delete(nitro_service client, aaauser resource) throws Exception {
		aaauser deleteresource = new aaauser();
		deleteresource.username = resource.username;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaauser resources of given names.
	*/
	public static base_responses delete(nitro_service client, String username[]) throws Exception {
		base_responses result = null;
		if (username != null && username.length > 0) {
			aaauser deleteresources[] = new aaauser[username.length];
			for (int i=0;i<username.length;i++){
				deleteresources[i] = new aaauser();
				deleteresources[i].username = username[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaauser resources.
	*/
	public static base_responses delete(nitro_service client, aaauser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser deleteresources[] = new aaauser[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaauser();
				deleteresources[i].username = resources[i].username;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update aaauser.
	*/
	public static base_response update(nitro_service client, aaauser resource) throws Exception {
		aaauser updateresource = new aaauser();
		updateresource.username = resource.username;
		updateresource.password = resource.password;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update aaauser resources.
	*/
	public static base_responses update(nitro_service client, aaauser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser updateresources[] = new aaauser[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaauser();
				updateresources[i].username = resources[i].username;
				updateresources[i].password = resources[i].password;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the aaauser resources that are configured on netscaler.
	*/
	public static aaauser[] get(nitro_service service) throws Exception{
		aaauser obj = new aaauser();
		aaauser[] response = (aaauser[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the aaauser resources that are configured on netscaler.
	*/
	public static aaauser[] get(nitro_service service, options option) throws Exception{
		aaauser obj = new aaauser();
		aaauser[] response = (aaauser[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the aaauser resources that are configured on netscaler.
	* This uses aaauser_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static aaauser[] get(nitro_service service, aaauser_args args) throws Exception{
		aaauser obj = new aaauser();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		aaauser[] response = (aaauser[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch aaauser resource of given name .
	*/
	public static aaauser get(nitro_service service, String username) throws Exception{
		aaauser obj = new aaauser();
		obj.set_username(username);
		aaauser response = (aaauser) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch aaauser resources of given names .
	*/
	public static aaauser[] get(nitro_service service, String username[]) throws Exception{
		if (username !=null && username.length>0) {
			aaauser response[] = new aaauser[username.length];
			aaauser obj[] = new aaauser[username.length];
			for (int i=0;i<username.length;i++) {
				obj[i] = new aaauser();
				obj[i].set_username(username[i]);
				response[i] = (aaauser) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of aaauser resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaauser[] get_filtered(nitro_service service, String filter) throws Exception{
		aaauser obj = new aaauser();
		options option = new options();
		option.set_filter(filter);
		aaauser[] response = (aaauser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaauser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaauser[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaauser obj = new aaauser();
		options option = new options();
		option.set_filter(filter);
		aaauser[] response = (aaauser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the aaauser resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		aaauser obj = new aaauser();
		options option = new options();
		option.set_count(true);
		aaauser[] response = (aaauser[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of aaauser resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		aaauser obj = new aaauser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaauser[] response = (aaauser[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaauser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaauser obj = new aaauser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaauser[] response = (aaauser[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
