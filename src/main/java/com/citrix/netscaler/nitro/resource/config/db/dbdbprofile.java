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

class dbdbprofile_response extends base_response
{
	public dbdbprofile[] dbdbprofile;
}
/**
* Configuration for DB profile resource.
*/

public class dbdbprofile extends base_resource
{
	private String name;
	private String interpretquery;
	private String stickiness;
	private String kcdaccount;
	private String conmultiplex;

	//------- Read only Parameter ---------;

	private Long refcnt;
	private Long __count;

	/**
	* <pre>
	* Name of the DB profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the DB profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Enables/Disables Interpret Query.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_interpretquery(String interpretquery) throws Exception{
		this.interpretquery = interpretquery;
	}

	/**
	* <pre>
	* Enables/Disables Interpret Query.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_interpretquery() throws Exception {
		return this.interpretquery;
	}

	/**
	* <pre>
	* Enables/Disables Stickyness of Query.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_stickiness(String stickiness) throws Exception{
		this.stickiness = stickiness;
	}

	/**
	* <pre>
	* Enables/Disables Stickyness of Query.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_stickiness() throws Exception {
		return this.stickiness;
	}

	/**
	* <pre>
	* Enables/Disables  KCD account.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_kcdaccount(String kcdaccount) throws Exception{
		this.kcdaccount = kcdaccount;
	}

	/**
	* <pre>
	* Enables/Disables  KCD account.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_kcdaccount() throws Exception {
		return this.kcdaccount;
	}

	/**
	* <pre>
	* Reuse server connections for requests from more than one client connections.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_conmultiplex(String conmultiplex) throws Exception{
		this.conmultiplex = conmultiplex;
	}

	/**
	* <pre>
	* Reuse server connections for requests from more than one client connections.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_conmultiplex() throws Exception {
		return this.conmultiplex;
	}

	/**
	* <pre>
	* Profile Reference Count.
	* </pre>
	*/
	public Long get_refcnt() throws Exception {
		return this.refcnt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dbdbprofile_response result = (dbdbprofile_response) service.get_payload_formatter().string_to_resource(dbdbprofile_response.class, response);
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
		return result.dbdbprofile;
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
	* Use this API to add dbdbprofile.
	*/
	public static base_response add(nitro_service client, dbdbprofile resource) throws Exception {
		dbdbprofile addresource = new dbdbprofile();
		addresource.name = resource.name;
		addresource.interpretquery = resource.interpretquery;
		addresource.stickiness = resource.stickiness;
		addresource.kcdaccount = resource.kcdaccount;
		addresource.conmultiplex = resource.conmultiplex;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dbdbprofile resources.
	*/
	public static base_responses add(nitro_service client, dbdbprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dbdbprofile addresources[] = new dbdbprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dbdbprofile();
				addresources[i].name = resources[i].name;
				addresources[i].interpretquery = resources[i].interpretquery;
				addresources[i].stickiness = resources[i].stickiness;
				addresources[i].kcdaccount = resources[i].kcdaccount;
				addresources[i].conmultiplex = resources[i].conmultiplex;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dbdbprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		dbdbprofile deleteresource = new dbdbprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dbdbprofile.
	*/
	public static base_response delete(nitro_service client, dbdbprofile resource) throws Exception {
		dbdbprofile deleteresource = new dbdbprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dbdbprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			dbdbprofile deleteresources[] = new dbdbprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new dbdbprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dbdbprofile resources.
	*/
	public static base_responses delete(nitro_service client, dbdbprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dbdbprofile deleteresources[] = new dbdbprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dbdbprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dbdbprofile.
	*/
	public static base_response update(nitro_service client, dbdbprofile resource) throws Exception {
		dbdbprofile updateresource = new dbdbprofile();
		updateresource.name = resource.name;
		updateresource.interpretquery = resource.interpretquery;
		updateresource.stickiness = resource.stickiness;
		updateresource.kcdaccount = resource.kcdaccount;
		updateresource.conmultiplex = resource.conmultiplex;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dbdbprofile resources.
	*/
	public static base_responses update(nitro_service client, dbdbprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dbdbprofile updateresources[] = new dbdbprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dbdbprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].interpretquery = resources[i].interpretquery;
				updateresources[i].stickiness = resources[i].stickiness;
				updateresources[i].kcdaccount = resources[i].kcdaccount;
				updateresources[i].conmultiplex = resources[i].conmultiplex;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dbdbprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dbdbprofile resource, String[] args) throws Exception{
		dbdbprofile unsetresource = new dbdbprofile();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dbdbprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			dbdbprofile unsetresources[] = new dbdbprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new dbdbprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dbdbprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dbdbprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dbdbprofile unsetresources[] = new dbdbprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dbdbprofile();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dbdbprofile resources that are configured on netscaler.
	*/
	public static dbdbprofile[] get(nitro_service service) throws Exception{
		dbdbprofile obj = new dbdbprofile();
		dbdbprofile[] response = (dbdbprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dbdbprofile resources that are configured on netscaler.
	*/
	public static dbdbprofile[] get(nitro_service service, options option) throws Exception{
		dbdbprofile obj = new dbdbprofile();
		dbdbprofile[] response = (dbdbprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dbdbprofile resource of given name .
	*/
	public static dbdbprofile get(nitro_service service, String name) throws Exception{
		dbdbprofile obj = new dbdbprofile();
		obj.set_name(name);
		dbdbprofile response = (dbdbprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dbdbprofile resources of given names .
	*/
	public static dbdbprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			dbdbprofile response[] = new dbdbprofile[name.length];
			dbdbprofile obj[] = new dbdbprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new dbdbprofile();
				obj[i].set_name(name[i]);
				response[i] = (dbdbprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dbdbprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dbdbprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		dbdbprofile obj = new dbdbprofile();
		options option = new options();
		option.set_filter(filter);
		dbdbprofile[] response = (dbdbprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dbdbprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dbdbprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dbdbprofile obj = new dbdbprofile();
		options option = new options();
		option.set_filter(filter);
		dbdbprofile[] response = (dbdbprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dbdbprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dbdbprofile obj = new dbdbprofile();
		options option = new options();
		option.set_count(true);
		dbdbprofile[] response = (dbdbprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dbdbprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dbdbprofile obj = new dbdbprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dbdbprofile[] response = (dbdbprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dbdbprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dbdbprofile obj = new dbdbprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dbdbprofile[] response = (dbdbprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class conmultiplexEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stickinessEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class interpretqueryEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
