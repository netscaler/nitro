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

class vpnvserver_auditsyslogpolicy_binding_response extends base_response
{
	public vpnvserver_auditsyslogpolicy_binding[] vpnvserver_auditsyslogpolicy_binding;
}
/**
	* Binding class showing the auditsyslogpolicy that can be bound to vpnvserver.
	*/

public class vpnvserver_auditsyslogpolicy_binding extends base_resource
{
	private String policy;
	private Long priority;
	private Long acttype;
	private String name;
	private Boolean secondary;
	private String gotopriorityexpression;
	private String bindpoint;
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
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	o	If gotoPriorityExpression is not present or if it is equal to END then the policy bank evaluation ends here
	o	Else if the gotoPriorityExpression is equal to NEXT then the next policy in the priority order is evaluated.
	o	Else gotoPriorityExpression is evaluated. The result of gotoPriorityExpression (which has to be a number) is processed as follows:
		-	An UNDEF event is triggered if
			.	gotoPriorityExpression cannot be evaluated
			.	gotoPriorityExpression evaluates to number which is smaller than the maximum priority in the policy bank but is not same as any policy's priority
			.	gotoPriorityExpression evaluates to a priority that is smaller than the current policy's priority
		-	If the gotoPriorityExpression evaluates to the priority of the current policy then the next policy in the priority order is evaluated.
		-	If the gotoPriorityExpression evaluates to the priority of a policy further ahead in the list then that policy will be evaluated next.
		This field is applicable only to rewrite and responder policies.
	* </pre>
	*/
	public void set_gotopriorityexpression(String gotopriorityexpression) throws Exception{
		this.gotopriorityexpression = gotopriorityexpression;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	o	If gotoPriorityExpression is not present or if it is equal to END then the policy bank evaluation ends here
	o	Else if the gotoPriorityExpression is equal to NEXT then the next policy in the priority order is evaluated.
	o	Else gotoPriorityExpression is evaluated. The result of gotoPriorityExpression (which has to be a number) is processed as follows:
		-	An UNDEF event is triggered if
			.	gotoPriorityExpression cannot be evaluated
			.	gotoPriorityExpression evaluates to number which is smaller than the maximum priority in the policy bank but is not same as any policy's priority
			.	gotoPriorityExpression evaluates to a priority that is smaller than the current policy's priority
		-	If the gotoPriorityExpression evaluates to the priority of the current policy then the next policy in the priority order is evaluated.
		-	If the gotoPriorityExpression evaluates to the priority of a policy further ahead in the list then that policy will be evaluated next.
		This field is applicable only to rewrite and responder policies.
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
	* Bindpoint, specifying where to bind the policy. This field is applicable only to rewrite and cache policies.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public void set_bindpoint(String bindpoint) throws Exception{
		this.bindpoint = bindpoint;
	}

	/**
	* <pre>
	* Bindpoint, specifying where to bind the policy. This field is applicable only to rewrite and cache policies.<br> Possible values = REQUEST, RESPONSE
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
		vpnvserver_auditsyslogpolicy_binding_response result = (vpnvserver_auditsyslogpolicy_binding_response) service.get_payload_formatter().string_to_resource(vpnvserver_auditsyslogpolicy_binding_response.class, response);
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
		return result.vpnvserver_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, vpnvserver_auditsyslogpolicy_binding resource) throws Exception {
		vpnvserver_auditsyslogpolicy_binding updateresource = new vpnvserver_auditsyslogpolicy_binding();
		updateresource.name = resource.name;
		updateresource.policy = resource.policy;
		updateresource.priority = resource.priority;
		updateresource.secondary = resource.secondary;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.bindpoint = resource.bindpoint;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vpnvserver_auditsyslogpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver_auditsyslogpolicy_binding updateresources[] = new vpnvserver_auditsyslogpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnvserver_auditsyslogpolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policy = resources[i].policy;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].secondary = resources[i].secondary;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].bindpoint = resources[i].bindpoint;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vpnvserver_auditsyslogpolicy_binding resource) throws Exception {
		vpnvserver_auditsyslogpolicy_binding deleteresource = new vpnvserver_auditsyslogpolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policy = resource.policy;
		deleteresource.secondary = resource.secondary;
		deleteresource.bindpoint = resource.bindpoint;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vpnvserver_auditsyslogpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver_auditsyslogpolicy_binding deleteresources[] = new vpnvserver_auditsyslogpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnvserver_auditsyslogpolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policy = resources[i].policy;
				deleteresources[i].secondary = resources[i].secondary;
				deleteresources[i].bindpoint = resources[i].bindpoint;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch vpnvserver_auditsyslogpolicy_binding resources of given name .
	*/
	public static vpnvserver_auditsyslogpolicy_binding[] get(nitro_service service, String name) throws Exception{
		vpnvserver_auditsyslogpolicy_binding obj = new vpnvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		vpnvserver_auditsyslogpolicy_binding response[] = (vpnvserver_auditsyslogpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_auditsyslogpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnvserver_auditsyslogpolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_auditsyslogpolicy_binding obj = new vpnvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_auditsyslogpolicy_binding[] response = (vpnvserver_auditsyslogpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_auditsyslogpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnvserver_auditsyslogpolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_auditsyslogpolicy_binding obj = new vpnvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_auditsyslogpolicy_binding[] response = (vpnvserver_auditsyslogpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpnvserver_auditsyslogpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		vpnvserver_auditsyslogpolicy_binding obj = new vpnvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		vpnvserver_auditsyslogpolicy_binding response[] = (vpnvserver_auditsyslogpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_auditsyslogpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_auditsyslogpolicy_binding obj = new vpnvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_auditsyslogpolicy_binding[] response = (vpnvserver_auditsyslogpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_auditsyslogpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_auditsyslogpolicy_binding obj = new vpnvserver_auditsyslogpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_auditsyslogpolicy_binding[] response = (vpnvserver_auditsyslogpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}

}