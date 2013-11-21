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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnvserver_vpnclientlessaccesspolicy_binding_response extends base_response
{
	public vpnvserver_vpnclientlessaccesspolicy_binding[] vpnvserver_vpnclientlessaccesspolicy_binding;
}
/**
	* Binding class showing the vpnclientlessaccesspolicy that can be bound to vpnvserver.
	*/

public class vpnvserver_vpnclientlessaccesspolicy_binding extends base_resource
{
	private String policy;
	private Long priority;
	private String bindpoint;
	private String gotopriorityexpression;
	private Long acttype;
	private String name;
	private Boolean secondary;
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
	* Next priority expression.
	* </pre>
	*/
	public void set_gotopriorityexpression(String gotopriorityexpression) throws Exception{
		this.gotopriorityexpression = gotopriorityexpression;
	}

	/**
	* <pre>
	* Next priority expression.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the vpn vserver.
	* </pre>
	*/
	public void set_policy(String policy) throws Exception{
		this.policy = policy;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the vpn vserver.
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
	* Name of the virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Bind the authentication policy as the secondary policy to use in a two-factor configuration. A user must then authenticate not only via a primary authentication method but also via a secondary authentication method. User groups are aggregated across both. The user name must be exactly the same for both authentication methods, but they can require different passwords.
	* </pre>
	*/
	public void set_secondary(boolean secondary) throws Exception {
		this.secondary = new Boolean(secondary);
	}

	/**
	* <pre>
	* Bind the authentication policy as the secondary policy to use in a two-factor configuration. A user must then authenticate not only via a primary authentication method but also via a secondary authentication method. User groups are aggregated across both. The user name must be exactly the same for both authentication methods, but they can require different passwords.
	* </pre>
	*/
	public void set_secondary(Boolean secondary) throws Exception{
		this.secondary = secondary;
	}

	/**
	* <pre>
	* Bind the authentication policy as the secondary policy to use in a two-factor configuration. A user must then authenticate not only via a primary authentication method but also via a secondary authentication method. User groups are aggregated across both. The user name must be exactly the same for both authentication methods, but they can require different passwords.
	* </pre>
	*/
	public Boolean get_secondary() throws Exception {
		return this.secondary;
	}

	/**
	* <pre>
	* Bindpoint to which the policy is bound.<br> Possible values = REQUEST, RESPONSE, ICA_REQUEST, OTHERTCP_REQUEST
	* </pre>
	*/
	public void set_bindpoint(String bindpoint) throws Exception{
		this.bindpoint = bindpoint;
	}

	/**
	* <pre>
	* Bindpoint to which the policy is bound.<br> Possible values = REQUEST, RESPONSE, ICA_REQUEST, OTHERTCP_REQUEST
	* </pre>
	*/
	public String get_bindpoint() throws Exception {
		return this.bindpoint;
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
		vpnvserver_vpnclientlessaccesspolicy_binding_response result = (vpnvserver_vpnclientlessaccesspolicy_binding_response) service.get_payload_formatter().string_to_resource(vpnvserver_vpnclientlessaccesspolicy_binding_response.class, response);
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
		return result.vpnvserver_vpnclientlessaccesspolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, vpnvserver_vpnclientlessaccesspolicy_binding resource) throws Exception {
		vpnvserver_vpnclientlessaccesspolicy_binding updateresource = new vpnvserver_vpnclientlessaccesspolicy_binding();
		updateresource.name = resource.name;
		updateresource.policy = resource.policy;
		updateresource.priority = resource.priority;
		updateresource.secondary = resource.secondary;
		updateresource.groupextraction = resource.groupextraction;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.bindpoint = resource.bindpoint;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vpnvserver_vpnclientlessaccesspolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver_vpnclientlessaccesspolicy_binding updateresources[] = new vpnvserver_vpnclientlessaccesspolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnvserver_vpnclientlessaccesspolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policy = resources[i].policy;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].secondary = resources[i].secondary;
				updateresources[i].groupextraction = resources[i].groupextraction;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].bindpoint = resources[i].bindpoint;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vpnvserver_vpnclientlessaccesspolicy_binding resource) throws Exception {
		vpnvserver_vpnclientlessaccesspolicy_binding deleteresource = new vpnvserver_vpnclientlessaccesspolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policy = resource.policy;
		deleteresource.secondary = resource.secondary;
		deleteresource.groupextraction = resource.groupextraction;
		deleteresource.bindpoint = resource.bindpoint;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vpnvserver_vpnclientlessaccesspolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver_vpnclientlessaccesspolicy_binding deleteresources[] = new vpnvserver_vpnclientlessaccesspolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnvserver_vpnclientlessaccesspolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policy = resources[i].policy;
				deleteresources[i].secondary = resources[i].secondary;
				deleteresources[i].groupextraction = resources[i].groupextraction;
				deleteresources[i].bindpoint = resources[i].bindpoint;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch vpnvserver_vpnclientlessaccesspolicy_binding resources of given name .
	*/
	public static vpnvserver_vpnclientlessaccesspolicy_binding[] get(nitro_service service, String name) throws Exception{
		vpnvserver_vpnclientlessaccesspolicy_binding obj = new vpnvserver_vpnclientlessaccesspolicy_binding();
		obj.set_name(name);
		vpnvserver_vpnclientlessaccesspolicy_binding response[] = (vpnvserver_vpnclientlessaccesspolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_vpnclientlessaccesspolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnvserver_vpnclientlessaccesspolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_vpnclientlessaccesspolicy_binding obj = new vpnvserver_vpnclientlessaccesspolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_vpnclientlessaccesspolicy_binding[] response = (vpnvserver_vpnclientlessaccesspolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_vpnclientlessaccesspolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnvserver_vpnclientlessaccesspolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_vpnclientlessaccesspolicy_binding obj = new vpnvserver_vpnclientlessaccesspolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_vpnclientlessaccesspolicy_binding[] response = (vpnvserver_vpnclientlessaccesspolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpnvserver_vpnclientlessaccesspolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		vpnvserver_vpnclientlessaccesspolicy_binding obj = new vpnvserver_vpnclientlessaccesspolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		vpnvserver_vpnclientlessaccesspolicy_binding response[] = (vpnvserver_vpnclientlessaccesspolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_vpnclientlessaccesspolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_vpnclientlessaccesspolicy_binding obj = new vpnvserver_vpnclientlessaccesspolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_vpnclientlessaccesspolicy_binding[] response = (vpnvserver_vpnclientlessaccesspolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_vpnclientlessaccesspolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_vpnclientlessaccesspolicy_binding obj = new vpnvserver_vpnclientlessaccesspolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_vpnclientlessaccesspolicy_binding[] response = (vpnvserver_vpnclientlessaccesspolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
		public static final String ICA_REQUEST = "ICA_REQUEST";
		public static final String OTHERTCP_REQUEST = "OTHERTCP_REQUEST";
	}

}