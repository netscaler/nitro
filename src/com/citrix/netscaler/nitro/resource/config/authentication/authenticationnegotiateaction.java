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

class authenticationnegotiateaction_response extends base_response
{
	public authenticationnegotiateaction[] authenticationnegotiateaction;
}
/**
* Configuration for Negotiate action resource.
*/

public class authenticationnegotiateaction extends base_resource
{
	private String name;
	private String domain;
	private String domainuser;
	private String domainuserpasswd;
	private String ou;
	private Long __count;

	/**
	* <pre>
	* The name for the new Negotiate action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new Negotiate action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public void set_domainuser(String domainuser) throws Exception{
		this.domainuser = domainuser;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public String get_domainuser() throws Exception {
		return this.domainuser;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public void set_domainuserpasswd(String domainuserpasswd) throws Exception{
		this.domainuserpasswd = domainuserpasswd;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public String get_domainuserpasswd() throws Exception {
		return this.domainuserpasswd;
	}

	/**
	* <pre>
	* organizational unit.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ou(String ou) throws Exception{
		this.ou = ou;
	}

	/**
	* <pre>
	* organizational unit.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ou() throws Exception {
		return this.ou;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationnegotiateaction_response result = (authenticationnegotiateaction_response) service.get_payload_formatter().string_to_resource(authenticationnegotiateaction_response.class, response);
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
		return result.authenticationnegotiateaction;
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
	* Use this API to add authenticationnegotiateaction.
	*/
	public static base_response add(nitro_service client, authenticationnegotiateaction resource) throws Exception {
		authenticationnegotiateaction addresource = new authenticationnegotiateaction();
		addresource.name = resource.name;
		addresource.domain = resource.domain;
		addresource.domainuser = resource.domainuser;
		addresource.domainuserpasswd = resource.domainuserpasswd;
		addresource.ou = resource.ou;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationnegotiateaction resources.
	*/
	public static base_responses add(nitro_service client, authenticationnegotiateaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationnegotiateaction addresources[] = new authenticationnegotiateaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationnegotiateaction();
				addresources[i].name = resources[i].name;
				addresources[i].domain = resources[i].domain;
				addresources[i].domainuser = resources[i].domainuser;
				addresources[i].domainuserpasswd = resources[i].domainuserpasswd;
				addresources[i].ou = resources[i].ou;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationnegotiateaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationnegotiateaction deleteresource = new authenticationnegotiateaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationnegotiateaction.
	*/
	public static base_response delete(nitro_service client, authenticationnegotiateaction resource) throws Exception {
		authenticationnegotiateaction deleteresource = new authenticationnegotiateaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationnegotiateaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationnegotiateaction deleteresources[] = new authenticationnegotiateaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationnegotiateaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationnegotiateaction resources.
	*/
	public static base_responses delete(nitro_service client, authenticationnegotiateaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationnegotiateaction deleteresources[] = new authenticationnegotiateaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationnegotiateaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationnegotiateaction.
	*/
	public static base_response update(nitro_service client, authenticationnegotiateaction resource) throws Exception {
		authenticationnegotiateaction updateresource = new authenticationnegotiateaction();
		updateresource.name = resource.name;
		updateresource.domain = resource.domain;
		updateresource.domainuser = resource.domainuser;
		updateresource.domainuserpasswd = resource.domainuserpasswd;
		updateresource.ou = resource.ou;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationnegotiateaction resources.
	*/
	public static base_responses update(nitro_service client, authenticationnegotiateaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationnegotiateaction updateresources[] = new authenticationnegotiateaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationnegotiateaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].domain = resources[i].domain;
				updateresources[i].domainuser = resources[i].domainuser;
				updateresources[i].domainuserpasswd = resources[i].domainuserpasswd;
				updateresources[i].ou = resources[i].ou;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationnegotiateaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationnegotiateaction unsetresource = new authenticationnegotiateaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationnegotiateaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationnegotiateaction resource, String[] args) throws Exception{
		authenticationnegotiateaction unsetresource = new authenticationnegotiateaction();
		unsetresource.name = resource.name;
		unsetresource.domain = resource.domain;
		unsetresource.domainuser = resource.domainuser;
		unsetresource.domainuserpasswd = resource.domainuserpasswd;
		unsetresource.ou = resource.ou;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationnegotiateaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationnegotiateaction unsetresources[] = new authenticationnegotiateaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationnegotiateaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationnegotiateaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationnegotiateaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationnegotiateaction unsetresources[] = new authenticationnegotiateaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationnegotiateaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].domain = resources[i].domain;
				unsetresources[i].domainuser = resources[i].domainuser;
				unsetresources[i].domainuserpasswd = resources[i].domainuserpasswd;
				unsetresources[i].ou = resources[i].ou;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationnegotiateaction resources that are configured on netscaler.
	*/
	public static authenticationnegotiateaction[] get(nitro_service service) throws Exception{
		authenticationnegotiateaction obj = new authenticationnegotiateaction();
		authenticationnegotiateaction[] response = (authenticationnegotiateaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationnegotiateaction resources that are configured on netscaler.
	*/
	public static authenticationnegotiateaction[] get(nitro_service service, options option) throws Exception{
		authenticationnegotiateaction obj = new authenticationnegotiateaction();
		authenticationnegotiateaction[] response = (authenticationnegotiateaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationnegotiateaction resource of given name .
	*/
	public static authenticationnegotiateaction get(nitro_service service, String name) throws Exception{
		authenticationnegotiateaction obj = new authenticationnegotiateaction();
		obj.set_name(name);
		authenticationnegotiateaction response = (authenticationnegotiateaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationnegotiateaction resources of given names .
	*/
	public static authenticationnegotiateaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationnegotiateaction response[] = new authenticationnegotiateaction[name.length];
			authenticationnegotiateaction obj[] = new authenticationnegotiateaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationnegotiateaction();
				obj[i].set_name(name[i]);
				response[i] = (authenticationnegotiateaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationnegotiateaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationnegotiateaction[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationnegotiateaction obj = new authenticationnegotiateaction();
		options option = new options();
		option.set_filter(filter);
		authenticationnegotiateaction[] response = (authenticationnegotiateaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationnegotiateaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationnegotiateaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationnegotiateaction obj = new authenticationnegotiateaction();
		options option = new options();
		option.set_filter(filter);
		authenticationnegotiateaction[] response = (authenticationnegotiateaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationnegotiateaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationnegotiateaction obj = new authenticationnegotiateaction();
		options option = new options();
		option.set_count(true);
		authenticationnegotiateaction[] response = (authenticationnegotiateaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationnegotiateaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationnegotiateaction obj = new authenticationnegotiateaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationnegotiateaction[] response = (authenticationnegotiateaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationnegotiateaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationnegotiateaction obj = new authenticationnegotiateaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationnegotiateaction[] response = (authenticationnegotiateaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
