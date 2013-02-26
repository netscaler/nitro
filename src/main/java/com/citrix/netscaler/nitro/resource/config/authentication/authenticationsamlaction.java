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

class authenticationsamlaction_response extends base_response
{
	public authenticationsamlaction[] authenticationsamlaction;
}
/**
* Configuration for AAA Saml action resource.
*/

public class authenticationsamlaction extends base_resource
{
	private String name;
	private String samlidpcertname;
	private String samlsigningcertname;
	private String samlredirecturl;
	private String samluserfield;
	private String samlrejectunsignedassertion;
	private String samlissuername;
	private Long __count;

	/**
	* <pre>
	* The name for the new SAML action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new SAML action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of the certificate to be used to decrypt messages from IdP.<br> Minimum length =  1
	* </pre>
	*/
	public void set_samlidpcertname(String samlidpcertname) throws Exception{
		this.samlidpcertname = samlidpcertname;
	}

	/**
	* <pre>
	* The name of the certificate to be used to decrypt messages from IdP.<br> Minimum length =  1
	* </pre>
	*/
	public String get_samlidpcertname() throws Exception {
		return this.samlidpcertname;
	}

	/**
	* <pre>
	* The name of the certificate to be used to sign messages to IdP.<br> Minimum length =  1
	* </pre>
	*/
	public void set_samlsigningcertname(String samlsigningcertname) throws Exception{
		this.samlsigningcertname = samlsigningcertname;
	}

	/**
	* <pre>
	* The name of the certificate to be used to sign messages to IdP.<br> Minimum length =  1
	* </pre>
	*/
	public String get_samlsigningcertname() throws Exception {
		return this.samlsigningcertname;
	}

	/**
	* <pre>
	* The URL at the IdP to which user must be redirected for authentication.<br> Minimum length =  1
	* </pre>
	*/
	public void set_samlredirecturl(String samlredirecturl) throws Exception{
		this.samlredirecturl = samlredirecturl;
	}

	/**
	* <pre>
	* The URL at the IdP to which user must be redirected for authentication.<br> Minimum length =  1
	* </pre>
	*/
	public String get_samlredirecturl() throws Exception {
		return this.samlredirecturl;
	}

	/**
	* <pre>
	* The field/tag from where username/id is to be	extracted.<br> Minimum length =  1
	* </pre>
	*/
	public void set_samluserfield(String samluserfield) throws Exception{
		this.samluserfield = samluserfield;
	}

	/**
	* <pre>
	* The field/tag from where username/id is to be	extracted.<br> Minimum length =  1
	* </pre>
	*/
	public String get_samluserfield() throws Exception {
		return this.samluserfield;
	}

	/**
	* <pre>
	* The option to reject Assertions which come without Signature.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_samlrejectunsignedassertion(String samlrejectunsignedassertion) throws Exception{
		this.samlrejectunsignedassertion = samlrejectunsignedassertion;
	}

	/**
	* <pre>
	* The option to reject Assertions which come without Signature.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_samlrejectunsignedassertion() throws Exception {
		return this.samlrejectunsignedassertion;
	}

	/**
	* <pre>
	* The name to be used in requests sent from	Netscaler to IdP to uniquely identify Netscaler.<br> Minimum length =  1
	* </pre>
	*/
	public void set_samlissuername(String samlissuername) throws Exception{
		this.samlissuername = samlissuername;
	}

	/**
	* <pre>
	* The name to be used in requests sent from	Netscaler to IdP to uniquely identify Netscaler.<br> Minimum length =  1
	* </pre>
	*/
	public String get_samlissuername() throws Exception {
		return this.samlissuername;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationsamlaction_response result = (authenticationsamlaction_response) service.get_payload_formatter().string_to_resource(authenticationsamlaction_response.class, response);
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
		return result.authenticationsamlaction;
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
	* Use this API to add authenticationsamlaction.
	*/
	public static base_response add(nitro_service client, authenticationsamlaction resource) throws Exception {
		authenticationsamlaction addresource = new authenticationsamlaction();
		addresource.name = resource.name;
		addresource.samlidpcertname = resource.samlidpcertname;
		addresource.samlsigningcertname = resource.samlsigningcertname;
		addresource.samlredirecturl = resource.samlredirecturl;
		addresource.samluserfield = resource.samluserfield;
		addresource.samlrejectunsignedassertion = resource.samlrejectunsignedassertion;
		addresource.samlissuername = resource.samlissuername;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationsamlaction resources.
	*/
	public static base_responses add(nitro_service client, authenticationsamlaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationsamlaction addresources[] = new authenticationsamlaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationsamlaction();
				addresources[i].name = resources[i].name;
				addresources[i].samlidpcertname = resources[i].samlidpcertname;
				addresources[i].samlsigningcertname = resources[i].samlsigningcertname;
				addresources[i].samlredirecturl = resources[i].samlredirecturl;
				addresources[i].samluserfield = resources[i].samluserfield;
				addresources[i].samlrejectunsignedassertion = resources[i].samlrejectunsignedassertion;
				addresources[i].samlissuername = resources[i].samlissuername;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationsamlaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationsamlaction deleteresource = new authenticationsamlaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationsamlaction.
	*/
	public static base_response delete(nitro_service client, authenticationsamlaction resource) throws Exception {
		authenticationsamlaction deleteresource = new authenticationsamlaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationsamlaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationsamlaction deleteresources[] = new authenticationsamlaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationsamlaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationsamlaction resources.
	*/
	public static base_responses delete(nitro_service client, authenticationsamlaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationsamlaction deleteresources[] = new authenticationsamlaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationsamlaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationsamlaction.
	*/
	public static base_response update(nitro_service client, authenticationsamlaction resource) throws Exception {
		authenticationsamlaction updateresource = new authenticationsamlaction();
		updateresource.name = resource.name;
		updateresource.samlidpcertname = resource.samlidpcertname;
		updateresource.samlsigningcertname = resource.samlsigningcertname;
		updateresource.samlredirecturl = resource.samlredirecturl;
		updateresource.samluserfield = resource.samluserfield;
		updateresource.samlrejectunsignedassertion = resource.samlrejectunsignedassertion;
		updateresource.samlissuername = resource.samlissuername;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationsamlaction resources.
	*/
	public static base_responses update(nitro_service client, authenticationsamlaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationsamlaction updateresources[] = new authenticationsamlaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationsamlaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].samlidpcertname = resources[i].samlidpcertname;
				updateresources[i].samlsigningcertname = resources[i].samlsigningcertname;
				updateresources[i].samlredirecturl = resources[i].samlredirecturl;
				updateresources[i].samluserfield = resources[i].samluserfield;
				updateresources[i].samlrejectunsignedassertion = resources[i].samlrejectunsignedassertion;
				updateresources[i].samlissuername = resources[i].samlissuername;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationsamlaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationsamlaction unsetresource = new authenticationsamlaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationsamlaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationsamlaction resource, String[] args) throws Exception{
		authenticationsamlaction unsetresource = new authenticationsamlaction();
		unsetresource.name = resource.name;
		unsetresource.samlidpcertname = resource.samlidpcertname;
		unsetresource.samlsigningcertname = resource.samlsigningcertname;
		unsetresource.samlredirecturl = resource.samlredirecturl;
		unsetresource.samluserfield = resource.samluserfield;
		unsetresource.samlrejectunsignedassertion = resource.samlrejectunsignedassertion;
		unsetresource.samlissuername = resource.samlissuername;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationsamlaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationsamlaction unsetresources[] = new authenticationsamlaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationsamlaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationsamlaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationsamlaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationsamlaction unsetresources[] = new authenticationsamlaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationsamlaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].samlidpcertname = resources[i].samlidpcertname;
				unsetresources[i].samlsigningcertname = resources[i].samlsigningcertname;
				unsetresources[i].samlredirecturl = resources[i].samlredirecturl;
				unsetresources[i].samluserfield = resources[i].samluserfield;
				unsetresources[i].samlrejectunsignedassertion = resources[i].samlrejectunsignedassertion;
				unsetresources[i].samlissuername = resources[i].samlissuername;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationsamlaction resources that are configured on netscaler.
	*/
	public static authenticationsamlaction[] get(nitro_service service) throws Exception{
		authenticationsamlaction obj = new authenticationsamlaction();
		authenticationsamlaction[] response = (authenticationsamlaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationsamlaction resources that are configured on netscaler.
	*/
	public static authenticationsamlaction[] get(nitro_service service, options option) throws Exception{
		authenticationsamlaction obj = new authenticationsamlaction();
		authenticationsamlaction[] response = (authenticationsamlaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationsamlaction resource of given name .
	*/
	public static authenticationsamlaction get(nitro_service service, String name) throws Exception{
		authenticationsamlaction obj = new authenticationsamlaction();
		obj.set_name(name);
		authenticationsamlaction response = (authenticationsamlaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationsamlaction resources of given names .
	*/
	public static authenticationsamlaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationsamlaction response[] = new authenticationsamlaction[name.length];
			authenticationsamlaction obj[] = new authenticationsamlaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationsamlaction();
				obj[i].set_name(name[i]);
				response[i] = (authenticationsamlaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationsamlaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationsamlaction[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationsamlaction obj = new authenticationsamlaction();
		options option = new options();
		option.set_filter(filter);
		authenticationsamlaction[] response = (authenticationsamlaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationsamlaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationsamlaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationsamlaction obj = new authenticationsamlaction();
		options option = new options();
		option.set_filter(filter);
		authenticationsamlaction[] response = (authenticationsamlaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationsamlaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationsamlaction obj = new authenticationsamlaction();
		options option = new options();
		option.set_count(true);
		authenticationsamlaction[] response = (authenticationsamlaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationsamlaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationsamlaction obj = new authenticationsamlaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationsamlaction[] response = (authenticationsamlaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationsamlaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationsamlaction obj = new authenticationsamlaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationsamlaction[] response = (authenticationsamlaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class samlrejectunsignedassertionEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
