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

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationcertaction_response extends base_response
{
	public authenticationcertaction[] authenticationcertaction;
}
/**
* Configuration for CERT action resource.
*/

public class authenticationcertaction extends base_resource
{
	private String name;
	private String twofactor;
	private String usernamefield;
	private String groupnamefield;
	private Long __count;

	/**
	* <pre>
	* The name of the CERT action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the CERT action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The state of two factor authentication. Two factor authentication means client certificate authentication followed by password authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_twofactor(String twofactor) throws Exception{
		this.twofactor = twofactor;
	}

	/**
	* <pre>
	* The state of two factor authentication. Two factor authentication means client certificate authentication followed by password authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_twofactor() throws Exception {
		return this.twofactor;
	}

	/**
	* <pre>
	* The field in the client certificate from which the username will be extracted. Should be of the format <field:subfield>. Allowed values for the field are "Subject" and "Issuer".<br> Minimum length =  1
	* </pre>
	*/
	public void set_usernamefield(String usernamefield) throws Exception{
		this.usernamefield = usernamefield;
	}

	/**
	* <pre>
	* The field in the client certificate from which the username will be extracted. Should be of the format <field:subfield>. Allowed values for the field are "Subject" and "Issuer".<br> Minimum length =  1
	* </pre>
	*/
	public String get_usernamefield() throws Exception {
		return this.usernamefield;
	}

	/**
	* <pre>
	* The field in the certificate from which the group will be extracted. Should be of the format <field:subfield>. Allowed values for the field are "Subject" and "Issuer".<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupnamefield(String groupnamefield) throws Exception{
		this.groupnamefield = groupnamefield;
	}

	/**
	* <pre>
	* The field in the certificate from which the group will be extracted. Should be of the format <field:subfield>. Allowed values for the field are "Subject" and "Issuer".<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupnamefield() throws Exception {
		return this.groupnamefield;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationcertaction_response result = (authenticationcertaction_response) service.get_payload_formatter().string_to_resource(authenticationcertaction_response.class, response);
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
		return result.authenticationcertaction;
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
	* Use this API to add authenticationcertaction.
	*/
	public static base_response add(nitro_service client, authenticationcertaction resource) throws Exception {
		authenticationcertaction addresource = new authenticationcertaction();
		addresource.name = resource.name;
		addresource.twofactor = resource.twofactor;
		addresource.usernamefield = resource.usernamefield;
		addresource.groupnamefield = resource.groupnamefield;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationcertaction resources.
	*/
	public static base_responses add(nitro_service client, authenticationcertaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationcertaction addresources[] = new authenticationcertaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationcertaction();
				addresources[i].name = resources[i].name;
				addresources[i].twofactor = resources[i].twofactor;
				addresources[i].usernamefield = resources[i].usernamefield;
				addresources[i].groupnamefield = resources[i].groupnamefield;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationcertaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationcertaction deleteresource = new authenticationcertaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationcertaction.
	*/
	public static base_response delete(nitro_service client, authenticationcertaction resource) throws Exception {
		authenticationcertaction deleteresource = new authenticationcertaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationcertaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationcertaction deleteresources[] = new authenticationcertaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationcertaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationcertaction resources.
	*/
	public static base_responses delete(nitro_service client, authenticationcertaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationcertaction deleteresources[] = new authenticationcertaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationcertaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationcertaction.
	*/
	public static base_response update(nitro_service client, authenticationcertaction resource) throws Exception {
		authenticationcertaction updateresource = new authenticationcertaction();
		updateresource.name = resource.name;
		updateresource.twofactor = resource.twofactor;
		updateresource.usernamefield = resource.usernamefield;
		updateresource.groupnamefield = resource.groupnamefield;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationcertaction resources.
	*/
	public static base_responses update(nitro_service client, authenticationcertaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationcertaction updateresources[] = new authenticationcertaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationcertaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].twofactor = resources[i].twofactor;
				updateresources[i].usernamefield = resources[i].usernamefield;
				updateresources[i].groupnamefield = resources[i].groupnamefield;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationcertaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationcertaction unsetresource = new authenticationcertaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationcertaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationcertaction resource, String[] args) throws Exception{
		authenticationcertaction unsetresource = new authenticationcertaction();
		unsetresource.name = resource.name;
		unsetresource.twofactor = resource.twofactor;
		unsetresource.usernamefield = resource.usernamefield;
		unsetresource.groupnamefield = resource.groupnamefield;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationcertaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationcertaction unsetresources[] = new authenticationcertaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationcertaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationcertaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationcertaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationcertaction unsetresources[] = new authenticationcertaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationcertaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].twofactor = resources[i].twofactor;
				unsetresources[i].usernamefield = resources[i].usernamefield;
				unsetresources[i].groupnamefield = resources[i].groupnamefield;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationcertaction resources that are configured on netscaler.
	*/
	public static authenticationcertaction[] get(nitro_service service) throws Exception{
		authenticationcertaction obj = new authenticationcertaction();
		authenticationcertaction[] response = (authenticationcertaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationcertaction resources that are configured on netscaler.
	*/
	public static authenticationcertaction[] get(nitro_service service, options option) throws Exception{
		authenticationcertaction obj = new authenticationcertaction();
		authenticationcertaction[] response = (authenticationcertaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationcertaction resource of given name .
	*/
	public static authenticationcertaction get(nitro_service service, String name) throws Exception{
		authenticationcertaction obj = new authenticationcertaction();
		obj.set_name(name);
		authenticationcertaction response = (authenticationcertaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationcertaction resources of given names .
	*/
	public static authenticationcertaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationcertaction response[] = new authenticationcertaction[name.length];
			authenticationcertaction obj[] = new authenticationcertaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationcertaction();
				obj[i].set_name(name[i]);
				response[i] = (authenticationcertaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationcertaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationcertaction[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationcertaction obj = new authenticationcertaction();
		options option = new options();
		option.set_filter(filter);
		authenticationcertaction[] response = (authenticationcertaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationcertaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationcertaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationcertaction obj = new authenticationcertaction();
		options option = new options();
		option.set_filter(filter);
		authenticationcertaction[] response = (authenticationcertaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationcertaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationcertaction obj = new authenticationcertaction();
		options option = new options();
		option.set_count(true);
		authenticationcertaction[] response = (authenticationcertaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationcertaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationcertaction obj = new authenticationcertaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationcertaction[] response = (authenticationcertaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationcertaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationcertaction obj = new authenticationcertaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationcertaction[] response = (authenticationcertaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class twofactorEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
