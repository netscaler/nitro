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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslwrapkey_response extends base_response
{
	public sslwrapkey[] sslwrapkey;
}
/**
* Configuration for WRAP key resource.
*/

public class sslwrapkey extends base_resource
{
	private String wrapkeyname;
	private String password;
	private String salt;
	private Long __count;

	/**
	* <pre>
	* Name for the wrap key. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the wrap key is created.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my key" or 'my key').<br> Minimum length =  1
	* </pre>
	*/
	public void set_wrapkeyname(String wrapkeyname) throws Exception{
		this.wrapkeyname = wrapkeyname;
	}

	/**
	* <pre>
	* Name for the wrap key. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the wrap key is created.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my key" or 'my key').<br> Minimum length =  1
	* </pre>
	*/
	public String get_wrapkeyname() throws Exception {
		return this.wrapkeyname;
	}

	/**
	* <pre>
	* Password string for the wrap key.<br> Minimum length =  1
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* Password string for the wrap key.<br> Minimum length =  1
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* Salt string for the wrap key.<br> Minimum length =  1
	* </pre>
	*/
	public void set_salt(String salt) throws Exception{
		this.salt = salt;
	}

	/**
	* <pre>
	* Salt string for the wrap key.<br> Minimum length =  1
	* </pre>
	*/
	public String get_salt() throws Exception {
		return this.salt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslwrapkey_response result = (sslwrapkey_response) service.get_payload_formatter().string_to_resource(sslwrapkey_response.class, response);
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
		return result.sslwrapkey;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.wrapkeyname;
	}

	/**
	* Use this API to create sslwrapkey.
	*/
	public static base_response create(nitro_service client, sslwrapkey resource) throws Exception {
		sslwrapkey createresource = new sslwrapkey();
		createresource.wrapkeyname = resource.wrapkeyname;
		createresource.password = resource.password;
		createresource.salt = resource.salt;
		return createresource.perform_operation(client,"create");
	}

	/**
	* Use this API to create sslwrapkey resources.
	*/
	public static base_responses create(nitro_service client, sslwrapkey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslwrapkey createresources[] = new sslwrapkey[resources.length];
			for (int i=0;i<resources.length;i++){
				createresources[i] = new sslwrapkey();
				createresources[i].wrapkeyname = resources[i].wrapkeyname;
				createresources[i].password = resources[i].password;
				createresources[i].salt = resources[i].salt;
			}
			result = perform_operation_bulk_request(client, createresources,"create");
		}
		return result;
	}

	/**
	* Use this API to delete sslwrapkey of given name.
	*/
	public static base_response delete(nitro_service client, String wrapkeyname) throws Exception {
		sslwrapkey deleteresource = new sslwrapkey();
		deleteresource.wrapkeyname = wrapkeyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslwrapkey.
	*/
	public static base_response delete(nitro_service client, sslwrapkey resource) throws Exception {
		sslwrapkey deleteresource = new sslwrapkey();
		deleteresource.wrapkeyname = resource.wrapkeyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslwrapkey resources of given names.
	*/
	public static base_responses delete(nitro_service client, String wrapkeyname[]) throws Exception {
		base_responses result = null;
		if (wrapkeyname != null && wrapkeyname.length > 0) {
			sslwrapkey deleteresources[] = new sslwrapkey[wrapkeyname.length];
			for (int i=0;i<wrapkeyname.length;i++){
				deleteresources[i] = new sslwrapkey();
				deleteresources[i].wrapkeyname = wrapkeyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslwrapkey resources.
	*/
	public static base_responses delete(nitro_service client, sslwrapkey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslwrapkey deleteresources[] = new sslwrapkey[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslwrapkey();
				deleteresources[i].wrapkeyname = resources[i].wrapkeyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslwrapkey resources that are configured on netscaler.
	*/
	public static sslwrapkey[] get(nitro_service service) throws Exception{
		sslwrapkey obj = new sslwrapkey();
		sslwrapkey[] response = (sslwrapkey[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslwrapkey resources that are configured on netscaler.
	*/
	public static sslwrapkey[] get(nitro_service service, options option) throws Exception{
		sslwrapkey obj = new sslwrapkey();
		sslwrapkey[] response = (sslwrapkey[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of sslwrapkey resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslwrapkey[] get_filtered(nitro_service service, String filter) throws Exception{
		sslwrapkey obj = new sslwrapkey();
		options option = new options();
		option.set_filter(filter);
		sslwrapkey[] response = (sslwrapkey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslwrapkey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslwrapkey[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslwrapkey obj = new sslwrapkey();
		options option = new options();
		option.set_filter(filter);
		sslwrapkey[] response = (sslwrapkey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslwrapkey resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslwrapkey obj = new sslwrapkey();
		options option = new options();
		option.set_count(true);
		sslwrapkey[] response = (sslwrapkey[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslwrapkey resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslwrapkey obj = new sslwrapkey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslwrapkey[] response = (sslwrapkey[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslwrapkey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslwrapkey obj = new sslwrapkey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslwrapkey[] response = (sslwrapkey[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
