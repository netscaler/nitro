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

class authenticationvserver_authenticationlocalpolicy_binding_response extends base_response
{
	public authenticationvserver_authenticationlocalpolicy_binding[] authenticationvserver_authenticationlocalpolicy_binding;
}
/**
	* Binding class showing the authenticationlocalpolicy that can be bound to authenticationvserver.
	*/

public class authenticationvserver_authenticationlocalpolicy_binding extends base_resource
{
	private String policy;
	private Long priority;
	private Long acttype;
	private Boolean secondary;
	private String name;
	private Boolean groupextraction;
	private Long __count;

	/**
	* <pre>
	* The priority, if any, of the vpn vserver policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority, if any, of the vpn vserver policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority, if any, of the vpn vserver policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Name of the authentication virtual server to which to bind the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the authentication virtual server to which to bind the policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Bind the authentication policy to the secondary chain.
Provides for multifactor authentication in which a user must authenticate via both a primary authentication method and, afterward, via a secondary authentication method.
Because user groups are aggregated across authentication systems, usernames must be the same on all authentication servers. Passwords can be different.
	* </pre>
	*/
	public void set_secondary(boolean secondary) throws Exception {
		this.secondary = new Boolean(secondary);
	}

	/**
	* <pre>
	* Bind the authentication policy to the secondary chain.
Provides for multifactor authentication in which a user must authenticate via both a primary authentication method and, afterward, via a secondary authentication method.
Because user groups are aggregated across authentication systems, usernames must be the same on all authentication servers. Passwords can be different.
	* </pre>
	*/
	public void set_secondary(Boolean secondary) throws Exception{
		this.secondary = secondary;
	}

	/**
	* <pre>
	* Bind the authentication policy to the secondary chain.
Provides for multifactor authentication in which a user must authenticate via both a primary authentication method and, afterward, via a secondary authentication method.
Because user groups are aggregated across authentication systems, usernames must be the same on all authentication servers. Passwords can be different.
	* </pre>
	*/
	public Boolean get_secondary() throws Exception {
		return this.secondary;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the authentication vserver.
	* </pre>
	*/
	public void set_policy(String policy) throws Exception{
		this.policy = policy;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the authentication vserver.
	* </pre>
	*/
	public String get_policy() throws Exception {
		return this.policy;
	}

	/**
	* <pre>
	* Bind the Authentication policy to a tertiary chain which will be used only for group extraction.  The user will not authenticate against this server, and this will only be called if primary and/or secondary authentication has succeeded.
	* </pre>
	*/
	public void set_groupextraction(boolean groupextraction) throws Exception {
		this.groupextraction = new Boolean(groupextraction);
	}

	/**
	* <pre>
	* Bind the Authentication policy to a tertiary chain which will be used only for group extraction.  The user will not authenticate against this server, and this will only be called if primary and/or secondary authentication has succeeded.
	* </pre>
	*/
	public void set_groupextraction(Boolean groupextraction) throws Exception{
		this.groupextraction = groupextraction;
	}

	/**
	* <pre>
	* Bind the Authentication policy to a tertiary chain which will be used only for group extraction.  The user will not authenticate against this server, and this will only be called if primary and/or secondary authentication has succeeded.
	* </pre>
	*/
	public Boolean get_groupextraction() throws Exception {
		return this.groupextraction;
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
		authenticationvserver_authenticationlocalpolicy_binding_response result = (authenticationvserver_authenticationlocalpolicy_binding_response) service.get_payload_formatter().string_to_resource(authenticationvserver_authenticationlocalpolicy_binding_response.class, response);
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
		return result.authenticationvserver_authenticationlocalpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, authenticationvserver_authenticationlocalpolicy_binding resource) throws Exception {
		authenticationvserver_authenticationlocalpolicy_binding updateresource = new authenticationvserver_authenticationlocalpolicy_binding();
		updateresource.name = resource.name;
		updateresource.policy = resource.policy;
		updateresource.priority = resource.priority;
		updateresource.secondary = resource.secondary;
		updateresource.groupextraction = resource.groupextraction;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, authenticationvserver_authenticationlocalpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver_authenticationlocalpolicy_binding updateresources[] = new authenticationvserver_authenticationlocalpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationvserver_authenticationlocalpolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policy = resources[i].policy;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].secondary = resources[i].secondary;
				updateresources[i].groupextraction = resources[i].groupextraction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, authenticationvserver_authenticationlocalpolicy_binding resource) throws Exception {
		authenticationvserver_authenticationlocalpolicy_binding deleteresource = new authenticationvserver_authenticationlocalpolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policy = resource.policy;
		deleteresource.secondary = resource.secondary;
		deleteresource.groupextraction = resource.groupextraction;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, authenticationvserver_authenticationlocalpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver_authenticationlocalpolicy_binding deleteresources[] = new authenticationvserver_authenticationlocalpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationvserver_authenticationlocalpolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policy = resources[i].policy;
				deleteresources[i].secondary = resources[i].secondary;
				deleteresources[i].groupextraction = resources[i].groupextraction;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch authenticationvserver_authenticationlocalpolicy_binding resources of given name .
	*/
	public static authenticationvserver_authenticationlocalpolicy_binding[] get(nitro_service service, String name) throws Exception{
		authenticationvserver_authenticationlocalpolicy_binding obj = new authenticationvserver_authenticationlocalpolicy_binding();
		obj.set_name(name);
		authenticationvserver_authenticationlocalpolicy_binding response[] = (authenticationvserver_authenticationlocalpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationvserver_authenticationlocalpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationvserver_authenticationlocalpolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		authenticationvserver_authenticationlocalpolicy_binding obj = new authenticationvserver_authenticationlocalpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		authenticationvserver_authenticationlocalpolicy_binding[] response = (authenticationvserver_authenticationlocalpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationvserver_authenticationlocalpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationvserver_authenticationlocalpolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		authenticationvserver_authenticationlocalpolicy_binding obj = new authenticationvserver_authenticationlocalpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		authenticationvserver_authenticationlocalpolicy_binding[] response = (authenticationvserver_authenticationlocalpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count authenticationvserver_authenticationlocalpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		authenticationvserver_authenticationlocalpolicy_binding obj = new authenticationvserver_authenticationlocalpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		authenticationvserver_authenticationlocalpolicy_binding response[] = (authenticationvserver_authenticationlocalpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationvserver_authenticationlocalpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		authenticationvserver_authenticationlocalpolicy_binding obj = new authenticationvserver_authenticationlocalpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationvserver_authenticationlocalpolicy_binding[] response = (authenticationvserver_authenticationlocalpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationvserver_authenticationlocalpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		authenticationvserver_authenticationlocalpolicy_binding obj = new authenticationvserver_authenticationlocalpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationvserver_authenticationlocalpolicy_binding[] response = (authenticationvserver_authenticationlocalpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}