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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwglobal_auditnslogpolicy_binding_response extends base_response
{
	public appfwglobal_auditnslogpolicy_binding[] appfwglobal_auditnslogpolicy_binding;
}
/**
	* Binding class showing the auditnslogpolicy that can be bound to appfwglobal.
	*/

public class appfwglobal_auditnslogpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String state;
	private String type;
	private String gotopriorityexpression;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
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
	* Application Firewall policy name.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Application Firewall policy name.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* This can be used only when binding advanced application firewall policy.
Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	o	If gotoPriorityExpression is not present or if it is equal to END then the policy bank evaluation ends here
	o	Else if the gotoPriorityExpression is equal to NEXT then the next policy in the priority order is evaluated.
	o	Else gotoPriorityExpression is evaluated. The result of gotoPriorityExpression (which has to be a number) is processed as follows:
		-	An UNDEF event is triggered if
			.	gotoPriorityExpression cannot be evaluated
			.	gotoPriorityExpression evaluates to number which is smaller than the maximum priority in the policy bank but is not same as any policy's priority
			.	gotoPriorityExpression evaluates to a priority that is smaller than the current policy's priority
		-	If the gotoPriorityExpression evaluates to the priority of the current policy then the next policy in the priority order is evaluated.
		-	If the gotoPriorityExpression evaluates to the priority of a policy further ahead in the list then that policy will be evaluated next.
		.
	* </pre>
	*/
	public void set_gotopriorityexpression(String gotopriorityexpression) throws Exception{
		this.gotopriorityexpression = gotopriorityexpression;
	}

	/**
	* <pre>
	* This can be used only when binding advanced application firewall policy.
Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	o	If gotoPriorityExpression is not present or if it is equal to END then the policy bank evaluation ends here
	o	Else if the gotoPriorityExpression is equal to NEXT then the next policy in the priority order is evaluated.
	o	Else gotoPriorityExpression is evaluated. The result of gotoPriorityExpression (which has to be a number) is processed as follows:
		-	An UNDEF event is triggered if
			.	gotoPriorityExpression cannot be evaluated
			.	gotoPriorityExpression evaluates to number which is smaller than the maximum priority in the policy bank but is not same as any policy's priority
			.	gotoPriorityExpression evaluates to a priority that is smaller than the current policy's priority
		-	If the gotoPriorityExpression evaluates to the priority of the current policy then the next policy in the priority order is evaluated.
		-	If the gotoPriorityExpression evaluates to the priority of a policy further ahead in the list then that policy will be evaluated next.
		.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Invoke flag. This can be used only when binding advanced application firewall policy.
	* </pre>
	*/
	public void set_invoke(boolean invoke) throws Exception {
		this.invoke = new Boolean(invoke);
	}

	/**
	* <pre>
	* Invoke flag. This can be used only when binding advanced application firewall policy.
	* </pre>
	*/
	public void set_invoke(Boolean invoke) throws Exception{
		this.invoke = invoke;
	}

	/**
	* <pre>
	* Invoke flag. This can be used only when binding advanced application firewall policy.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* The bindpoint to which to policy is bound. This can be used with advance application firewall policy only.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, NONE
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The bindpoint to which to policy is bound. This can be used with advance application firewall policy only.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, NONE
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* This can be used only when binding advanced application firewall policy.<br> Possible values = reqvserver, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* This can be used only when binding advanced application firewall policy.<br> Possible values = reqvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* The current state of the binding.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The current state of the binding.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwglobal_auditnslogpolicy_binding_response result = (appfwglobal_auditnslogpolicy_binding_response) service.get_payload_formatter().string_to_resource(appfwglobal_auditnslogpolicy_binding_response.class, response);
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
		return result.appfwglobal_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, appfwglobal_auditnslogpolicy_binding resource) throws Exception {
		appfwglobal_auditnslogpolicy_binding updateresource = new appfwglobal_auditnslogpolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.state = resource.state;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.type = resource.type;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.labelname = resource.labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, appfwglobal_auditnslogpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwglobal_auditnslogpolicy_binding updateresources[] = new appfwglobal_auditnslogpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwglobal_auditnslogpolicy_binding();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].state = resources[i].state;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].type = resources[i].type;
				updateresources[i].invoke = resources[i].invoke;
				updateresources[i].labeltype = resources[i].labeltype;
				updateresources[i].labelname = resources[i].labelname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, appfwglobal_auditnslogpolicy_binding resource) throws Exception {
		appfwglobal_auditnslogpolicy_binding deleteresource = new appfwglobal_auditnslogpolicy_binding();
		deleteresource.policyname = resource.policyname;
		deleteresource.type = resource.type;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, appfwglobal_auditnslogpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwglobal_auditnslogpolicy_binding deleteresources[] = new appfwglobal_auditnslogpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwglobal_auditnslogpolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].type = resources[i].type;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a appfwglobal_auditnslogpolicy_binding resources.
	*/
	public static appfwglobal_auditnslogpolicy_binding[] get(nitro_service service) throws Exception{
		appfwglobal_auditnslogpolicy_binding obj = new appfwglobal_auditnslogpolicy_binding();
		appfwglobal_auditnslogpolicy_binding response[] = (appfwglobal_auditnslogpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwglobal_auditnslogpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwglobal_auditnslogpolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwglobal_auditnslogpolicy_binding obj = new appfwglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		appfwglobal_auditnslogpolicy_binding[] response = (appfwglobal_auditnslogpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwglobal_auditnslogpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwglobal_auditnslogpolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwglobal_auditnslogpolicy_binding obj = new appfwglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		appfwglobal_auditnslogpolicy_binding[] response = (appfwglobal_auditnslogpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count appfwglobal_auditnslogpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwglobal_auditnslogpolicy_binding obj = new appfwglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_count(true);
		appfwglobal_auditnslogpolicy_binding response[] = (appfwglobal_auditnslogpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwglobal_auditnslogpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwglobal_auditnslogpolicy_binding obj = new appfwglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwglobal_auditnslogpolicy_binding[] response = (appfwglobal_auditnslogpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwglobal_auditnslogpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwglobal_auditnslogpolicy_binding obj = new appfwglobal_auditnslogpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwglobal_auditnslogpolicy_binding[] response = (appfwglobal_auditnslogpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String REQ_OVERRIDE = "REQ_OVERRIDE";
		public static final String REQ_DEFAULT = "REQ_DEFAULT";
		public static final String NONE = "NONE";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String policylabel = "policylabel";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}