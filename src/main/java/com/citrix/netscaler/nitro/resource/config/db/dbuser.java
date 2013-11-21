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

package com.citrix.netscaler.nitro.resource.config.db;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dbuser_response extends base_response
{
	public dbuser[] dbuser;
}
/**
* Configuration for DB user resource.
*/

public class dbuser extends base_resource
{
	private String username;
	private String password;
	private Boolean loggedin;
	private Long __count;

	/**
	* <pre>
	* Name of the database user. Must be the same as the user name specified in the database.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* Name of the database user. Must be the same as the user name specified in the database.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* Password for logging on to the database. Must be the same as the password specified in the database.<br> Minimum length =  1
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* Password for logging on to the database. Must be the same as the password specified in the database.<br> Minimum length =  1
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* Display the names of all database users currently logged on to the NetScaler appliance.
	* </pre>
	*/
	public void set_loggedin(boolean loggedin) throws Exception {
		this.loggedin = new Boolean(loggedin);
	}

	/**
	* <pre>
	* Display the names of all database users currently logged on to the NetScaler appliance.
	* </pre>
	*/
	public void set_loggedin(Boolean loggedin) throws Exception{
		this.loggedin = loggedin;
	}

	/**
	* <pre>
	* Display the names of all database users currently logged on to the NetScaler appliance.
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
		dbuser_response result = (dbuser_response) service.get_payload_formatter().string_to_resource(dbuser_response.class, response);
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
		return result.dbuser;
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
	* Use this API to add dbuser.
	*/
	public static base_response add(nitro_service client, dbuser resource) throws Exception {
		dbuser addresource = new dbuser();
		addresource.username = resource.username;
		addresource.password = resource.password;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dbuser resources.
	*/
	public static base_responses add(nitro_service client, dbuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dbuser addresources[] = new dbuser[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dbuser();
				addresources[i].username = resources[i].username;
				addresources[i].password = resources[i].password;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dbuser of given name.
	*/
	public static base_response delete(nitro_service client, String username) throws Exception {
		dbuser deleteresource = new dbuser();
		deleteresource.username = username;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dbuser.
	*/
	public static base_response delete(nitro_service client, dbuser resource) throws Exception {
		dbuser deleteresource = new dbuser();
		deleteresource.username = resource.username;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dbuser resources of given names.
	*/
	public static base_responses delete(nitro_service client, String username[]) throws Exception {
		base_responses result = null;
		if (username != null && username.length > 0) {
			dbuser deleteresources[] = new dbuser[username.length];
			for (int i=0;i<username.length;i++){
				deleteresources[i] = new dbuser();
				deleteresources[i].username = username[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dbuser resources.
	*/
	public static base_responses delete(nitro_service client, dbuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dbuser deleteresources[] = new dbuser[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dbuser();
				deleteresources[i].username = resources[i].username;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dbuser.
	*/
	public static base_response update(nitro_service client, dbuser resource) throws Exception {
		dbuser updateresource = new dbuser();
		updateresource.username = resource.username;
		updateresource.password = resource.password;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dbuser resources.
	*/
	public static base_responses update(nitro_service client, dbuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dbuser updateresources[] = new dbuser[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dbuser();
				updateresources[i].username = resources[i].username;
				updateresources[i].password = resources[i].password;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dbuser resources that are configured on netscaler.
	*/
	public static dbuser[] get(nitro_service service) throws Exception{
		dbuser obj = new dbuser();
		dbuser[] response = (dbuser[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dbuser resources that are configured on netscaler.
	*/
	public static dbuser[] get(nitro_service service, options option) throws Exception{
		dbuser obj = new dbuser();
		dbuser[] response = (dbuser[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dbuser resources that are configured on netscaler.
	* This uses dbuser_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dbuser[] get(nitro_service service, dbuser_args args) throws Exception{
		dbuser obj = new dbuser();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dbuser[] response = (dbuser[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dbuser resource of given name .
	*/
	public static dbuser get(nitro_service service, String username) throws Exception{
		dbuser obj = new dbuser();
		obj.set_username(username);
		dbuser response = (dbuser) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dbuser resources of given names .
	*/
	public static dbuser[] get(nitro_service service, String username[]) throws Exception{
		if (username !=null && username.length>0) {
			dbuser response[] = new dbuser[username.length];
			dbuser obj[] = new dbuser[username.length];
			for (int i=0;i<username.length;i++) {
				obj[i] = new dbuser();
				obj[i].set_username(username[i]);
				response[i] = (dbuser) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dbuser resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dbuser[] get_filtered(nitro_service service, String filter) throws Exception{
		dbuser obj = new dbuser();
		options option = new options();
		option.set_filter(filter);
		dbuser[] response = (dbuser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dbuser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dbuser[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dbuser obj = new dbuser();
		options option = new options();
		option.set_filter(filter);
		dbuser[] response = (dbuser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dbuser resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dbuser obj = new dbuser();
		options option = new options();
		option.set_count(true);
		dbuser[] response = (dbuser[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dbuser resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dbuser obj = new dbuser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dbuser[] response = (dbuser[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dbuser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dbuser obj = new dbuser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dbuser[] response = (dbuser[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
