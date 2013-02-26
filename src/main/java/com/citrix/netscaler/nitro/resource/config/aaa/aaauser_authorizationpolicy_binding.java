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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaauser_authorizationpolicy_binding_response extends base_response
{
	public aaauser_authorizationpolicy_binding[] aaauser_authorizationpolicy_binding;
}
/**
	* Binding class showing the authorizationpolicy that can be bound to aaauser.
	*/

public class aaauser_authorizationpolicy_binding extends base_resource
{
	private String policy;
	private Long priority;
	private Long acttype;
	private String intranetapplication;
	private String urlname;
	private String username;
	private Long __count;

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The intranet url.
	* </pre>
	*/
	public void set_urlname(String urlname) throws Exception{
		this.urlname = urlname;
	}

	/**
	* <pre>
	* The intranet url.
	* </pre>
	*/
	public String get_urlname() throws Exception {
		return this.urlname;
	}

	/**
	* <pre>
	* The policy Name.
	* </pre>
	*/
	public void set_policy(String policy) throws Exception{
		this.policy = policy;
	}

	/**
	* <pre>
	* The policy Name.
	* </pre>
	*/
	public String get_policy() throws Exception {
		return this.policy;
	}

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* The intranet vpn application.
	* </pre>
	*/
	public void set_intranetapplication(String intranetapplication) throws Exception{
		this.intranetapplication = intranetapplication;
	}

	/**
	* <pre>
	* The intranet vpn application.
	* </pre>
	*/
	public String get_intranetapplication() throws Exception {
		return this.intranetapplication;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_acttype() throws Exception {
		return this.acttype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaauser_authorizationpolicy_binding_response result = (aaauser_authorizationpolicy_binding_response) service.get_payload_formatter().string_to_resource(aaauser_authorizationpolicy_binding_response.class, response);
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
		return result.aaauser_authorizationpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.username;
	}

	public static base_response add(nitro_service client, aaauser_authorizationpolicy_binding resource) throws Exception {
		aaauser_authorizationpolicy_binding updateresource = new aaauser_authorizationpolicy_binding();
		updateresource.username = resource.username;
		updateresource.policy = resource.policy;
		updateresource.priority = resource.priority;
		updateresource.intranetapplication = resource.intranetapplication;
		updateresource.urlname = resource.urlname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, aaauser_authorizationpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser_authorizationpolicy_binding updateresources[] = new aaauser_authorizationpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaauser_authorizationpolicy_binding();
				updateresources[i].username = resources[i].username;
				updateresources[i].policy = resources[i].policy;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].intranetapplication = resources[i].intranetapplication;
				updateresources[i].urlname = resources[i].urlname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, aaauser_authorizationpolicy_binding resource) throws Exception {
		aaauser_authorizationpolicy_binding deleteresource = new aaauser_authorizationpolicy_binding();
		deleteresource.username = resource.username;
		deleteresource.policy = resource.policy;
		deleteresource.intranetapplication = resource.intranetapplication;
		deleteresource.urlname = resource.urlname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, aaauser_authorizationpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser_authorizationpolicy_binding deleteresources[] = new aaauser_authorizationpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaauser_authorizationpolicy_binding();
				deleteresources[i].username = resources[i].username;
				deleteresources[i].policy = resources[i].policy;
				deleteresources[i].intranetapplication = resources[i].intranetapplication;
				deleteresources[i].urlname = resources[i].urlname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch aaauser_authorizationpolicy_binding resources of given name .
	*/
	public static aaauser_authorizationpolicy_binding[] get(nitro_service service, String username) throws Exception{
		aaauser_authorizationpolicy_binding obj = new aaauser_authorizationpolicy_binding();
		obj.set_username(username);
		aaauser_authorizationpolicy_binding response[] = (aaauser_authorizationpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaauser_authorizationpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaauser_authorizationpolicy_binding[] get_filtered(nitro_service service, String username, String filter) throws Exception{
		aaauser_authorizationpolicy_binding obj = new aaauser_authorizationpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_filter(filter);
		aaauser_authorizationpolicy_binding[] response = (aaauser_authorizationpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaauser_authorizationpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaauser_authorizationpolicy_binding[] get_filtered(nitro_service service, String username, filtervalue[] filter) throws Exception{
		aaauser_authorizationpolicy_binding obj = new aaauser_authorizationpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_filter(filter);
		aaauser_authorizationpolicy_binding[] response = (aaauser_authorizationpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count aaauser_authorizationpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String username) throws Exception{
		aaauser_authorizationpolicy_binding obj = new aaauser_authorizationpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		aaauser_authorizationpolicy_binding response[] = (aaauser_authorizationpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaauser_authorizationpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String username, String filter) throws Exception{
		aaauser_authorizationpolicy_binding obj = new aaauser_authorizationpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaauser_authorizationpolicy_binding[] response = (aaauser_authorizationpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaauser_authorizationpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String username, filtervalue[] filter) throws Exception{
		aaauser_authorizationpolicy_binding obj = new aaauser_authorizationpolicy_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaauser_authorizationpolicy_binding[] response = (aaauser_authorizationpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}