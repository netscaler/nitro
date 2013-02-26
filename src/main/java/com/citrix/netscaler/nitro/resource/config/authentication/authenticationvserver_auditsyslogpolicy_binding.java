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

class authenticationvserver_auditsyslogpolicy_binding_response extends base_response
{
	public authenticationvserver_auditsyslogpolicy_binding[] authenticationvserver_auditsyslogpolicy_binding;
}
/**
	* Binding class showing the auditsyslogpolicy that can be bound to authenticationvserver.
	*/

public class authenticationvserver_auditsyslogpolicy_binding extends base_resource
{
	private String policy;
	private Long priority;
	private String name;
	private Boolean secondary;
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
	* The vserver to which this command shall bind parameters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The vserver to which this command shall bind parameters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Bind the Authentication policy to the secondary chain. This provides for multifactor authentication in which a user must not only authenticate to a primary authentication server but also a server in the secondary chain.  User groups are aggregated across both authentication systems and while user may use different passwords in each system their username must be exactly the same.
	* </pre>
	*/
	public void set_secondary(boolean secondary) throws Exception {
		this.secondary = new Boolean(secondary);
	}

	/**
	* <pre>
	* Bind the Authentication policy to the secondary chain. This provides for multifactor authentication in which a user must not only authenticate to a primary authentication server but also a server in the secondary chain.  User groups are aggregated across both authentication systems and while user may use different passwords in each system their username must be exactly the same.
	* </pre>
	*/
	public void set_secondary(Boolean secondary) throws Exception{
		this.secondary = secondary;
	}

	/**
	* <pre>
	* Bind the Authentication policy to the secondary chain. This provides for multifactor authentication in which a user must not only authenticate to a primary authentication server but also a server in the secondary chain.  User groups are aggregated across both authentication systems and while user may use different passwords in each system their username must be exactly the same.
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationvserver_auditsyslogpolicy_binding_response result = (authenticationvserver_auditsyslogpolicy_binding_response) service.get_payload_formatter().string_to_resource(authenticationvserver_auditsyslogpolicy_binding_response.class, response);
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
		return result.authenticationvserver_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, authenticationvserver_auditsyslogpolicy_binding resource) throws Exception {
		authenticationvserver_auditsyslogpolicy_binding updateresource = new authenticationvserver_auditsyslogpolicy_binding();
		updateresource.name = resource.name;
		updateresource.policy = resource.policy;
		updateresource.priority = resource.priority;
		updateresource.secondary = resource.secondary;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, authenticationvserver_auditsyslogpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver_auditsyslogpolicy_binding updateresources[] = new authenticationvserver_auditsyslogpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationvserver_auditsyslogpolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policy = resources[i].policy;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].secondary = resources[i].secondary;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, authenticationvserver_auditsyslogpolicy_binding resource) throws Exception {
		authenticationvserver_auditsyslogpolicy_binding deleteresource = new authenticationvserver_auditsyslogpolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policy = resource.policy;
		deleteresource.secondary = resource.secondary;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, authenticationvserver_auditsyslogpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver_auditsyslogpolicy_binding deleteresources[] = new authenticationvserver_auditsyslogpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationvserver_auditsyslogpolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policy = resources[i].policy;
				deleteresources[i].secondary = resources[i].secondary;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch authenticationvserver_auditsyslogpolicy_binding resources of given name .
	*/
	public static authenticationvserver_auditsyslogpolicy_binding[] get(nitro_service service, String name) throws Exception{
		authenticationvserver_auditsyslogpolicy_binding obj = new authenticationvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		authenticationvserver_auditsyslogpolicy_binding response[] = (authenticationvserver_auditsyslogpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationvserver_auditsyslogpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationvserver_auditsyslogpolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		authenticationvserver_auditsyslogpolicy_binding obj = new authenticationvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		authenticationvserver_auditsyslogpolicy_binding[] response = (authenticationvserver_auditsyslogpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationvserver_auditsyslogpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationvserver_auditsyslogpolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		authenticationvserver_auditsyslogpolicy_binding obj = new authenticationvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		authenticationvserver_auditsyslogpolicy_binding[] response = (authenticationvserver_auditsyslogpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count authenticationvserver_auditsyslogpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		authenticationvserver_auditsyslogpolicy_binding obj = new authenticationvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		authenticationvserver_auditsyslogpolicy_binding response[] = (authenticationvserver_auditsyslogpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationvserver_auditsyslogpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		authenticationvserver_auditsyslogpolicy_binding obj = new authenticationvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationvserver_auditsyslogpolicy_binding[] response = (authenticationvserver_auditsyslogpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationvserver_auditsyslogpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		authenticationvserver_auditsyslogpolicy_binding obj = new authenticationvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationvserver_auditsyslogpolicy_binding[] response = (authenticationvserver_auditsyslogpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}