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

class sslcipher_sslciphersuite_binding_response extends base_response
{
	public sslcipher_sslciphersuite_binding[] sslcipher_sslciphersuite_binding;
}
/**
	* Binding class showing the sslciphersuite that can be bound to sslcipher.
	*/

public class sslcipher_sslciphersuite_binding extends base_resource
{
	private String ciphername;
	private String description;
	private String ciphergroupname;
	private String cipheroperation;
	private String ciphgrpals;
	private Long __count;

	/**
	* <pre>
	* The name of the user-defined cipher group.
	If the cipher group does not exist on the system, a new group is created with the specified name. The ciphers are added to this group.
	If a group identified by cipherGroupName already exists on the system, the ciphers are added to it.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphergroupname(String ciphergroupname) throws Exception{
		this.ciphergroupname = ciphergroupname;
	}

	/**
	* <pre>
	* The name of the user-defined cipher group.
	If the cipher group does not exist on the system, a new group is created with the specified name. The ciphers are added to this group.
	If a group identified by cipherGroupName already exists on the system, the ciphers are added to it.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphergroupname() throws Exception {
		return this.ciphergroupname;
	}

	/**
	* <pre>
	* The cipher(s) to be removed from the cipher group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphername(String ciphername) throws Exception{
		this.ciphername = ciphername;
	}

	/**
	* <pre>
	* The cipher(s) to be removed from the cipher group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphername() throws Exception {
		return this.ciphername;
	}

	/**
	* <pre>
	* A cipher-suite can consist of an individual cipher name, the system predefined cipher-alias name, or user defined cipher-group name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphgrpals(String ciphgrpals) throws Exception{
		this.ciphgrpals = ciphgrpals;
	}

	/**
	* <pre>
	* A cipher-suite can consist of an individual cipher name, the system predefined cipher-alias name, or user defined cipher-group name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphgrpals() throws Exception {
		return this.ciphgrpals;
	}

	/**
	* <pre>
	* The operation that is performed when adding the cipher-suite.

Possible cipher operations are:
	ADD - Appends the given cipher-suite to the existing one configured for the virtual server.
	REM - Removes the given cipher-suite from the existing one configured for the virtual server.
	ORD - Overrides the current configured cipher-suite for the virtual server with the given cipher-suite.<br> Default value: 6<br> Possible values = ADD, REM, ORD
	* </pre>
	*/
	public void set_cipheroperation(String cipheroperation) throws Exception{
		this.cipheroperation = cipheroperation;
	}

	/**
	* <pre>
	* The operation that is performed when adding the cipher-suite.

Possible cipher operations are:
	ADD - Appends the given cipher-suite to the existing one configured for the virtual server.
	REM - Removes the given cipher-suite from the existing one configured for the virtual server.
	ORD - Overrides the current configured cipher-suite for the virtual server with the given cipher-suite.<br> Default value: 6<br> Possible values = ADD, REM, ORD
	* </pre>
	*/
	public String get_cipheroperation() throws Exception {
		return this.cipheroperation;
	}

	/**
	* <pre>
	* Cipher suite description.
	* </pre>
	*/
	public void set_description(String description) throws Exception{
		this.description = description;
	}

	/**
	* <pre>
	* Cipher suite description.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcipher_sslciphersuite_binding_response result = (sslcipher_sslciphersuite_binding_response) service.get_payload_formatter().string_to_resource(sslcipher_sslciphersuite_binding_response.class, response);
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
		return result.sslcipher_sslciphersuite_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ciphergroupname;
	}

	public static base_response add(nitro_service client, sslcipher_sslciphersuite_binding resource) throws Exception {
		sslcipher_sslciphersuite_binding updateresource = new sslcipher_sslciphersuite_binding();
		updateresource.ciphergroupname = resource.ciphergroupname;
		updateresource.cipheroperation = resource.cipheroperation;
		updateresource.ciphgrpals = resource.ciphgrpals;
		updateresource.ciphername = resource.ciphername;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, sslcipher_sslciphersuite_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcipher_sslciphersuite_binding updateresources[] = new sslcipher_sslciphersuite_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslcipher_sslciphersuite_binding();
				updateresources[i].ciphergroupname = resources[i].ciphergroupname;
				updateresources[i].cipheroperation = resources[i].cipheroperation;
				updateresources[i].ciphgrpals = resources[i].ciphgrpals;
				updateresources[i].ciphername = resources[i].ciphername;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, sslcipher_sslciphersuite_binding resource) throws Exception {
		sslcipher_sslciphersuite_binding deleteresource = new sslcipher_sslciphersuite_binding();
		deleteresource.ciphergroupname = resource.ciphergroupname;
		deleteresource.ciphername = resource.ciphername;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, sslcipher_sslciphersuite_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcipher_sslciphersuite_binding deleteresources[] = new sslcipher_sslciphersuite_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslcipher_sslciphersuite_binding();
				deleteresources[i].ciphergroupname = resources[i].ciphergroupname;
				deleteresources[i].ciphername = resources[i].ciphername;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch sslcipher_sslciphersuite_binding resources of given name .
	*/
	public static sslcipher_sslciphersuite_binding[] get(nitro_service service, String ciphergroupname) throws Exception{
		sslcipher_sslciphersuite_binding obj = new sslcipher_sslciphersuite_binding();
		obj.set_ciphergroupname(ciphergroupname);
		sslcipher_sslciphersuite_binding response[] = (sslcipher_sslciphersuite_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcipher_sslciphersuite_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslcipher_sslciphersuite_binding[] get_filtered(nitro_service service, String ciphergroupname, String filter) throws Exception{
		sslcipher_sslciphersuite_binding obj = new sslcipher_sslciphersuite_binding();
		obj.set_ciphergroupname(ciphergroupname);
		options option = new options();
		option.set_filter(filter);
		sslcipher_sslciphersuite_binding[] response = (sslcipher_sslciphersuite_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcipher_sslciphersuite_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslcipher_sslciphersuite_binding[] get_filtered(nitro_service service, String ciphergroupname, filtervalue[] filter) throws Exception{
		sslcipher_sslciphersuite_binding obj = new sslcipher_sslciphersuite_binding();
		obj.set_ciphergroupname(ciphergroupname);
		options option = new options();
		option.set_filter(filter);
		sslcipher_sslciphersuite_binding[] response = (sslcipher_sslciphersuite_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslcipher_sslciphersuite_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String ciphergroupname) throws Exception{
		sslcipher_sslciphersuite_binding obj = new sslcipher_sslciphersuite_binding();
		obj.set_ciphergroupname(ciphergroupname);
		options option = new options();
		option.set_count(true);
		sslcipher_sslciphersuite_binding response[] = (sslcipher_sslciphersuite_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcipher_sslciphersuite_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String ciphergroupname, String filter) throws Exception{
		sslcipher_sslciphersuite_binding obj = new sslcipher_sslciphersuite_binding();
		obj.set_ciphergroupname(ciphergroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcipher_sslciphersuite_binding[] response = (sslcipher_sslciphersuite_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcipher_sslciphersuite_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String ciphergroupname, filtervalue[] filter) throws Exception{
		sslcipher_sslciphersuite_binding obj = new sslcipher_sslciphersuite_binding();
		obj.set_ciphergroupname(ciphergroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcipher_sslciphersuite_binding[] response = (sslcipher_sslciphersuite_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cipheroperationEnum {
		public static final String ADD = "ADD";
		public static final String REM = "REM";
		public static final String ORD = "ORD";
	}

}