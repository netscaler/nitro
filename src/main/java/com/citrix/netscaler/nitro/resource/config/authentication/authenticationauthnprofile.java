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

class authenticationauthnprofile_response extends base_response
{
	public authenticationauthnprofile[] authenticationauthnprofile;
}
/**
* Configuration for Authentication profile resource.
*/

public class authenticationauthnprofile extends base_resource
{
	private String name;
	private String authnvsname;
	private String authenticationhost;
	private String authenticationdomain;
	private Long authenticationlevel;
	private Long __count;

	/**
	* <pre>
	* Name for the authentication profile. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the RADIUS action is added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the authentication profile. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the RADIUS action is added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Name of the authentication vserver at which authentication should be done.<br> Minimum length =  1<br> Maximum length =  128
	* </pre>
	*/
	public void set_authnvsname(String authnvsname) throws Exception{
		this.authnvsname = authnvsname;
	}

	/**
	* <pre>
	* Name of the authentication vserver at which authentication should be done.<br> Minimum length =  1<br> Maximum length =  128
	* </pre>
	*/
	public String get_authnvsname() throws Exception {
		return this.authnvsname;
	}

	/**
	* <pre>
	* Hostname of the authentication vserver.<br> Minimum length =  1<br> Maximum length =  256
	* </pre>
	*/
	public void set_authenticationhost(String authenticationhost) throws Exception{
		this.authenticationhost = authenticationhost;
	}

	/**
	* <pre>
	* Hostname of the authentication vserver.<br> Minimum length =  1<br> Maximum length =  256
	* </pre>
	*/
	public String get_authenticationhost() throws Exception {
		return this.authenticationhost;
	}

	/**
	* <pre>
	* Domain for which TM cookie must to be set. If unspecified, cookie will be set for FQDN.<br> Minimum length =  1<br> Maximum length =  256
	* </pre>
	*/
	public void set_authenticationdomain(String authenticationdomain) throws Exception{
		this.authenticationdomain = authenticationdomain;
	}

	/**
	* <pre>
	* Domain for which TM cookie must to be set. If unspecified, cookie will be set for FQDN.<br> Minimum length =  1<br> Maximum length =  256
	* </pre>
	*/
	public String get_authenticationdomain() throws Exception {
		return this.authenticationdomain;
	}

	/**
	* <pre>
	* .<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_authenticationlevel(long authenticationlevel) throws Exception {
		this.authenticationlevel = new Long(authenticationlevel);
	}

	/**
	* <pre>
	* .<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_authenticationlevel(Long authenticationlevel) throws Exception{
		this.authenticationlevel = authenticationlevel;
	}

	/**
	* <pre>
	* .<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public Long get_authenticationlevel() throws Exception {
		return this.authenticationlevel;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationauthnprofile_response result = (authenticationauthnprofile_response) service.get_payload_formatter().string_to_resource(authenticationauthnprofile_response.class, response);
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
		return result.authenticationauthnprofile;
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
	* Use this API to add authenticationauthnprofile.
	*/
	public static base_response add(nitro_service client, authenticationauthnprofile resource) throws Exception {
		authenticationauthnprofile addresource = new authenticationauthnprofile();
		addresource.name = resource.name;
		addresource.authnvsname = resource.authnvsname;
		addresource.authenticationhost = resource.authenticationhost;
		addresource.authenticationdomain = resource.authenticationdomain;
		addresource.authenticationlevel = resource.authenticationlevel;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationauthnprofile resources.
	*/
	public static base_responses add(nitro_service client, authenticationauthnprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationauthnprofile addresources[] = new authenticationauthnprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationauthnprofile();
				addresources[i].name = resources[i].name;
				addresources[i].authnvsname = resources[i].authnvsname;
				addresources[i].authenticationhost = resources[i].authenticationhost;
				addresources[i].authenticationdomain = resources[i].authenticationdomain;
				addresources[i].authenticationlevel = resources[i].authenticationlevel;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationauthnprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationauthnprofile deleteresource = new authenticationauthnprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationauthnprofile.
	*/
	public static base_response delete(nitro_service client, authenticationauthnprofile resource) throws Exception {
		authenticationauthnprofile deleteresource = new authenticationauthnprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationauthnprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationauthnprofile deleteresources[] = new authenticationauthnprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationauthnprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationauthnprofile resources.
	*/
	public static base_responses delete(nitro_service client, authenticationauthnprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationauthnprofile deleteresources[] = new authenticationauthnprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationauthnprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationauthnprofile.
	*/
	public static base_response update(nitro_service client, authenticationauthnprofile resource) throws Exception {
		authenticationauthnprofile updateresource = new authenticationauthnprofile();
		updateresource.name = resource.name;
		updateresource.authnvsname = resource.authnvsname;
		updateresource.authenticationhost = resource.authenticationhost;
		updateresource.authenticationdomain = resource.authenticationdomain;
		updateresource.authenticationlevel = resource.authenticationlevel;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationauthnprofile resources.
	*/
	public static base_responses update(nitro_service client, authenticationauthnprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationauthnprofile updateresources[] = new authenticationauthnprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationauthnprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].authnvsname = resources[i].authnvsname;
				updateresources[i].authenticationhost = resources[i].authenticationhost;
				updateresources[i].authenticationdomain = resources[i].authenticationdomain;
				updateresources[i].authenticationlevel = resources[i].authenticationlevel;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationauthnprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationauthnprofile resource, String[] args) throws Exception{
		authenticationauthnprofile unsetresource = new authenticationauthnprofile();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationauthnprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationauthnprofile unsetresources[] = new authenticationauthnprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationauthnprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationauthnprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationauthnprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationauthnprofile unsetresources[] = new authenticationauthnprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationauthnprofile();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationauthnprofile resources that are configured on netscaler.
	*/
	public static authenticationauthnprofile[] get(nitro_service service) throws Exception{
		authenticationauthnprofile obj = new authenticationauthnprofile();
		authenticationauthnprofile[] response = (authenticationauthnprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationauthnprofile resources that are configured on netscaler.
	*/
	public static authenticationauthnprofile[] get(nitro_service service, options option) throws Exception{
		authenticationauthnprofile obj = new authenticationauthnprofile();
		authenticationauthnprofile[] response = (authenticationauthnprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationauthnprofile resource of given name .
	*/
	public static authenticationauthnprofile get(nitro_service service, String name) throws Exception{
		authenticationauthnprofile obj = new authenticationauthnprofile();
		obj.set_name(name);
		authenticationauthnprofile response = (authenticationauthnprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationauthnprofile resources of given names .
	*/
	public static authenticationauthnprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationauthnprofile response[] = new authenticationauthnprofile[name.length];
			authenticationauthnprofile obj[] = new authenticationauthnprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationauthnprofile();
				obj[i].set_name(name[i]);
				response[i] = (authenticationauthnprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationauthnprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationauthnprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationauthnprofile obj = new authenticationauthnprofile();
		options option = new options();
		option.set_filter(filter);
		authenticationauthnprofile[] response = (authenticationauthnprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationauthnprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationauthnprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationauthnprofile obj = new authenticationauthnprofile();
		options option = new options();
		option.set_filter(filter);
		authenticationauthnprofile[] response = (authenticationauthnprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationauthnprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationauthnprofile obj = new authenticationauthnprofile();
		options option = new options();
		option.set_count(true);
		authenticationauthnprofile[] response = (authenticationauthnprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationauthnprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationauthnprofile obj = new authenticationauthnprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationauthnprofile[] response = (authenticationauthnprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationauthnprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationauthnprofile obj = new authenticationauthnprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationauthnprofile[] response = (authenticationauthnprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
