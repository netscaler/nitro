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

class systemuser_response extends base_response
{
	public systemuser[] systemuser;
}
/**
* Configuration for system user resource.
*/

public class systemuser extends base_resource
{
	private String username;
	private String password;
	private String promptstring;
	private Long timeout;

	//------- Read only Parameter ---------;

	private Boolean encrypted;
	private String promptinheritedfrom;
	private String timeoutkind;
	private Long __count;

	/**
	* <pre>
	* The name for the system user.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The name for the system user.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* The system user's password.<br> Minimum length =  1
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* The system user's password.<br> Minimum length =  1
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* The system user's prompt.<br> Minimum length =  1
	* </pre>
	*/
	public void set_promptstring(String promptstring) throws Exception{
		this.promptstring = promptstring;
	}

	/**
	* <pre>
	* The system user's prompt.<br> Minimum length =  1
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
	* .
	* </pre>
	*/
	public Boolean get_encrypted() throws Exception {
		return this.encrypted;
	}

	/**
	* <pre>
	* From where the prompt has been inherited.<br> Possible values = User, Group, Global
	* </pre>
	*/
	public String get_promptinheritedfrom() throws Exception {
		return this.promptinheritedfrom;
	}

	/**
	* <pre>
	* From where the timeout has been inherited.<br> Possible values = User, Group, Global
	* </pre>
	*/
	public String get_timeoutkind() throws Exception {
		return this.timeoutkind;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemuser_response result = (systemuser_response) service.get_payload_formatter().string_to_resource(systemuser_response.class, response);
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
		return result.systemuser;
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
	* Use this API to add systemuser.
	*/
	public static base_response add(nitro_service client, systemuser resource) throws Exception {
		systemuser addresource = new systemuser();
		addresource.username = resource.username;
		addresource.password = resource.password;
		addresource.promptstring = resource.promptstring;
		addresource.timeout = resource.timeout;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add systemuser resources.
	*/
	public static base_responses add(nitro_service client, systemuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemuser addresources[] = new systemuser[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new systemuser();
				addresources[i].username = resources[i].username;
				addresources[i].password = resources[i].password;
				addresources[i].promptstring = resources[i].promptstring;
				addresources[i].timeout = resources[i].timeout;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete systemuser of given name.
	*/
	public static base_response delete(nitro_service client, String username) throws Exception {
		systemuser deleteresource = new systemuser();
		deleteresource.username = username;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete systemuser.
	*/
	public static base_response delete(nitro_service client, systemuser resource) throws Exception {
		systemuser deleteresource = new systemuser();
		deleteresource.username = resource.username;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete systemuser resources of given names.
	*/
	public static base_responses delete(nitro_service client, String username[]) throws Exception {
		base_responses result = null;
		if (username != null && username.length > 0) {
			systemuser deleteresources[] = new systemuser[username.length];
			for (int i=0;i<username.length;i++){
				deleteresources[i] = new systemuser();
				deleteresources[i].username = username[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete systemuser resources.
	*/
	public static base_responses delete(nitro_service client, systemuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemuser deleteresources[] = new systemuser[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new systemuser();
				deleteresources[i].username = resources[i].username;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update systemuser.
	*/
	public static base_response update(nitro_service client, systemuser resource) throws Exception {
		systemuser updateresource = new systemuser();
		updateresource.username = resource.username;
		updateresource.password = resource.password;
		updateresource.promptstring = resource.promptstring;
		updateresource.timeout = resource.timeout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update systemuser resources.
	*/
	public static base_responses update(nitro_service client, systemuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemuser updateresources[] = new systemuser[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new systemuser();
				updateresources[i].username = resources[i].username;
				updateresources[i].password = resources[i].password;
				updateresources[i].promptstring = resources[i].promptstring;
				updateresources[i].timeout = resources[i].timeout;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of systemuser resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String username, String args[]) throws Exception {
		systemuser unsetresource = new systemuser();
		unsetresource.username = username;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of systemuser resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, systemuser resource, String[] args) throws Exception{
		systemuser unsetresource = new systemuser();
		unsetresource.username = resource.username;
		unsetresource.promptstring = resource.promptstring;
		unsetresource.timeout = resource.timeout;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of systemuser resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String username[], String args[]) throws Exception {
		base_responses result = null;
		if (username != null && username.length > 0) {
			systemuser unsetresources[] = new systemuser[username.length];
			for (int i=0;i<username.length;i++){
				unsetresources[i] = new systemuser();
				unsetresources[i].username = username[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of systemuser resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, systemuser resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemuser unsetresources[] = new systemuser[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new systemuser();
				unsetresources[i].username = resources[i].username;
				unsetresources[i].promptstring = resources[i].promptstring;
				unsetresources[i].timeout = resources[i].timeout;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the systemuser resources that are configured on netscaler.
	*/
	public static systemuser[] get(nitro_service service) throws Exception{
		systemuser obj = new systemuser();
		systemuser[] response = (systemuser[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the systemuser resources that are configured on netscaler.
	*/
	public static systemuser[] get(nitro_service service, options option) throws Exception{
		systemuser obj = new systemuser();
		systemuser[] response = (systemuser[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch systemuser resource of given name .
	*/
	public static systemuser get(nitro_service service, String username) throws Exception{
		systemuser obj = new systemuser();
		obj.set_username(username);
		systemuser response = (systemuser) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch systemuser resources of given names .
	*/
	public static systemuser[] get(nitro_service service, String username[]) throws Exception{
		if (username !=null && username.length>0) {
			systemuser response[] = new systemuser[username.length];
			systemuser obj[] = new systemuser[username.length];
			for (int i=0;i<username.length;i++) {
				obj[i] = new systemuser();
				obj[i].set_username(username[i]);
				response[i] = (systemuser) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of systemuser resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static systemuser[] get_filtered(nitro_service service, String filter) throws Exception{
		systemuser obj = new systemuser();
		options option = new options();
		option.set_filter(filter);
		systemuser[] response = (systemuser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systemuser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static systemuser[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemuser obj = new systemuser();
		options option = new options();
		option.set_filter(filter);
		systemuser[] response = (systemuser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the systemuser resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		systemuser obj = new systemuser();
		options option = new options();
		option.set_count(true);
		systemuser[] response = (systemuser[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of systemuser resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		systemuser obj = new systemuser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemuser[] response = (systemuser[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systemuser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemuser obj = new systemuser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemuser[] response = (systemuser[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class timeoutkindEnum {
		public static final String User = "User";
		public static final String Group = "Group";
		public static final String Global = "Global";
	}
	public static class promptinheritedfromEnum {
		public static final String User = "User";
		public static final String Group = "Group";
		public static final String Global = "Global";
	}
}
