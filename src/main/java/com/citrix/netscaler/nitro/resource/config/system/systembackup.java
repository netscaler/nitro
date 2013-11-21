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

class systembackup_response extends base_response
{
	public systembackup[] systembackup;
}
/**
* Configuration for Backup Data for ns backup and restore resource.
*/

public class systembackup extends base_resource
{
	private String filename;
	private String level;
	private String comment;

	//------- Read only Parameter ---------;

	private Long size;
	private String creationtime;
	private String version;
	private String createdby;
	private String ipaddress;
	private Long __count;

	/**
	* <pre>
	* Name of the backup file(*.tgz) to be restored.
	* </pre>
	*/
	public void set_filename(String filename) throws Exception{
		this.filename = filename;
	}

	/**
	* <pre>
	* Name of the backup file(*.tgz) to be restored.
	* </pre>
	*/
	public String get_filename() throws Exception {
		return this.filename;
	}

	/**
	* <pre>
	* Level of data to be backed up.<br> Default value: basic<br> Possible values = basic, full
	* </pre>
	*/
	public void set_level(String level) throws Exception{
		this.level = level;
	}

	/**
	* <pre>
	* Level of data to be backed up.<br> Default value: basic<br> Possible values = basic, full
	* </pre>
	*/
	public String get_level() throws Exception {
		return this.level;
	}

	/**
	* <pre>
	* Comment specified at the time of creation of the backup file(*.tgz).
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comment specified at the time of creation of the backup file(*.tgz).
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Size of the backup file(*.tgz) in KB.
	* </pre>
	*/
	public Long get_size() throws Exception {
		return this.size;
	}

	/**
	* <pre>
	* Creation time of the backup file(*.tgz).
	* </pre>
	*/
	public String get_creationtime() throws Exception {
		return this.creationtime;
	}

	/**
	* <pre>
	* Build version of the backup file(*.tgz).
	* </pre>
	*/
	public String get_version() throws Exception {
		return this.version;
	}

	/**
	* <pre>
	* Name of user who created the backup file(*.tgz).
	* </pre>
	*/
	public String get_createdby() throws Exception {
		return this.createdby;
	}

	/**
	* <pre>
	* Ip of Netscaler box where the backup file(*.tgz) was created.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systembackup_response result = (systembackup_response) service.get_payload_formatter().string_to_resource(systembackup_response.class, response);
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
		return result.systembackup;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.filename;
	}

	/**
	* Use this API to create systembackup.
	*/
	public static base_response create(nitro_service client, systembackup resource) throws Exception {
		systembackup createresource = new systembackup();
		createresource.filename = resource.filename;
		createresource.level = resource.level;
		createresource.comment = resource.comment;
		return createresource.perform_operation(client,"create");
	}

	/**
	* Use this API to create systembackup resources.
	*/
	public static base_responses create(nitro_service client, systembackup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systembackup createresources[] = new systembackup[resources.length];
			for (int i=0;i<resources.length;i++){
				createresources[i] = new systembackup();
				createresources[i].filename = resources[i].filename;
				createresources[i].level = resources[i].level;
				createresources[i].comment = resources[i].comment;
			}
			result = perform_operation_bulk_request(client, createresources,"create");
		}
		return result;
	}

	/**
	* Use this API to restore systembackup.
	*/
	public static base_response restore(nitro_service client, systembackup resource) throws Exception {
		systembackup restoreresource = new systembackup();
		restoreresource.filename = resource.filename;
		return restoreresource.perform_operation(client,"restore");
	}

	/**
	* Use this API to restore systembackup resources.
	*/
	public static base_responses restore(nitro_service client, systembackup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systembackup restoreresources[] = new systembackup[resources.length];
			for (int i=0;i<resources.length;i++){
				restoreresources[i] = new systembackup();
				restoreresources[i].filename = resources[i].filename;
			}
			result = perform_operation_bulk_request(client, restoreresources,"restore");
		}
		return result;
	}

	/**
	* Use this API to delete systembackup of given name.
	*/
	public static base_response delete(nitro_service client, String filename) throws Exception {
		systembackup deleteresource = new systembackup();
		deleteresource.filename = filename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete systembackup.
	*/
	public static base_response delete(nitro_service client, systembackup resource) throws Exception {
		systembackup deleteresource = new systembackup();
		deleteresource.filename = resource.filename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete systembackup resources of given names.
	*/
	public static base_responses delete(nitro_service client, String filename[]) throws Exception {
		base_responses result = null;
		if (filename != null && filename.length > 0) {
			systembackup deleteresources[] = new systembackup[filename.length];
			for (int i=0;i<filename.length;i++){
				deleteresources[i] = new systembackup();
				deleteresources[i].filename = filename[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete systembackup resources.
	*/
	public static base_responses delete(nitro_service client, systembackup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systembackup deleteresources[] = new systembackup[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new systembackup();
				deleteresources[i].filename = resources[i].filename;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the systembackup resources that are configured on netscaler.
	*/
	public static systembackup[] get(nitro_service service) throws Exception{
		systembackup obj = new systembackup();
		systembackup[] response = (systembackup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the systembackup resources that are configured on netscaler.
	*/
	public static systembackup[] get(nitro_service service, options option) throws Exception{
		systembackup obj = new systembackup();
		systembackup[] response = (systembackup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch systembackup resource of given name .
	*/
	public static systembackup get(nitro_service service, String filename) throws Exception{
		systembackup obj = new systembackup();
		obj.set_filename(filename);
		systembackup response = (systembackup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch systembackup resources of given names .
	*/
	public static systembackup[] get(nitro_service service, String filename[]) throws Exception{
		if (filename !=null && filename.length>0) {
			systembackup response[] = new systembackup[filename.length];
			systembackup obj[] = new systembackup[filename.length];
			for (int i=0;i<filename.length;i++) {
				obj[i] = new systembackup();
				obj[i].set_filename(filename[i]);
				response[i] = (systembackup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of systembackup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static systembackup[] get_filtered(nitro_service service, String filter) throws Exception{
		systembackup obj = new systembackup();
		options option = new options();
		option.set_filter(filter);
		systembackup[] response = (systembackup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systembackup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static systembackup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systembackup obj = new systembackup();
		options option = new options();
		option.set_filter(filter);
		systembackup[] response = (systembackup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the systembackup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		systembackup obj = new systembackup();
		options option = new options();
		option.set_count(true);
		systembackup[] response = (systembackup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of systembackup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		systembackup obj = new systembackup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systembackup[] response = (systembackup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systembackup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systembackup obj = new systembackup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systembackup[] response = (systembackup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class levelEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
