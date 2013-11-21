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

class appfwglobal_appfwpolicy_binding_response extends base_response
{
	public appfwglobal_appfwpolicy_binding[] appfwglobal_appfwpolicy_binding;
}
/**
	* Binding class showing the appfwpolicy that can be bound to appfwglobal.
	*/

public class appfwglobal_appfwpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private Boolean invoke;
	private String state;
	private String labeltype;
	private String labelname;
	private Long numpol;
	private Long flowtype;
	private String type;
	private String policytype;
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
	* Name of the policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name of the policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Name of the policy label to invoke if the current policy evaluates to TRUE, the invoke parameter is set, and Label Type is set to Policy Label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the policy label to invoke if the current policy evaluates to TRUE, the invoke parameter is set, and Label Type is set to Policy Label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public void set_gotopriorityexpression(String gotopriorityexpression) throws Exception{
		this.gotopriorityexpression = gotopriorityexpression;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Bind point to which to policy is bound.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, NONE
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Bind point to which to policy is bound.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, NONE
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* If the current policy evaluates to TRUE, terminate evaluation of policies bound to the current policy label, and then forward the request to the specified virtual server or evaluate the specified policy label.
	* </pre>
	*/
	public void set_invoke(boolean invoke) throws Exception {
		this.invoke = new Boolean(invoke);
	}

	/**
	* <pre>
	* If the current policy evaluates to TRUE, terminate evaluation of policies bound to the current policy label, and then forward the request to the specified virtual server or evaluate the specified policy label.
	* </pre>
	*/
	public void set_invoke(Boolean invoke) throws Exception{
		this.invoke = invoke;
	}

	/**
	* <pre>
	* If the current policy evaluates to TRUE, terminate evaluation of policies bound to the current policy label, and then forward the request to the specified virtual server or evaluate the specified policy label.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = reqvserver, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = reqvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Enable or disable the binding to activate or deactivate the policy.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enable or disable the binding to activate or deactivate the policy.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* flowtype of the bound application firewall policy.
	* </pre>
	*/
	public Long get_flowtype() throws Exception {
		return this.flowtype;
	}

	/**
	* <pre>
	* The number of policies bound to the bindpoint.
	* </pre>
	*/
	public Long get_numpol() throws Exception {
		return this.numpol;
	}

	/**
	* <pre>
	* .<br> Possible values = Classic Policy, Advanced Policy
	* </pre>
	*/
	public String get_policytype() throws Exception {
		return this.policytype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwglobal_appfwpolicy_binding_response result = (appfwglobal_appfwpolicy_binding_response) service.get_payload_formatter().string_to_resource(appfwglobal_appfwpolicy_binding_response.class, response);
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
		return result.appfwglobal_appfwpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, appfwglobal_appfwpolicy_binding resource) throws Exception {
		appfwglobal_appfwpolicy_binding updateresource = new appfwglobal_appfwpolicy_binding();
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

	public static base_responses add(nitro_service client, appfwglobal_appfwpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwglobal_appfwpolicy_binding updateresources[] = new appfwglobal_appfwpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwglobal_appfwpolicy_binding();
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

	public static base_response delete(nitro_service client, appfwglobal_appfwpolicy_binding resource) throws Exception {
		appfwglobal_appfwpolicy_binding deleteresource = new appfwglobal_appfwpolicy_binding();
		deleteresource.policyname = resource.policyname;
		deleteresource.type = resource.type;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, appfwglobal_appfwpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwglobal_appfwpolicy_binding deleteresources[] = new appfwglobal_appfwpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwglobal_appfwpolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].type = resources[i].type;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a appfwglobal_appfwpolicy_binding resources.
	*/
	public static appfwglobal_appfwpolicy_binding[] get(nitro_service service) throws Exception{
		appfwglobal_appfwpolicy_binding obj = new appfwglobal_appfwpolicy_binding();
		appfwglobal_appfwpolicy_binding response[] = (appfwglobal_appfwpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwglobal_appfwpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwglobal_appfwpolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwglobal_appfwpolicy_binding obj = new appfwglobal_appfwpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		appfwglobal_appfwpolicy_binding[] response = (appfwglobal_appfwpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwglobal_appfwpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwglobal_appfwpolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwglobal_appfwpolicy_binding obj = new appfwglobal_appfwpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		appfwglobal_appfwpolicy_binding[] response = (appfwglobal_appfwpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count appfwglobal_appfwpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwglobal_appfwpolicy_binding obj = new appfwglobal_appfwpolicy_binding();
		options option = new options();
		option.set_count(true);
		appfwglobal_appfwpolicy_binding response[] = (appfwglobal_appfwpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwglobal_appfwpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwglobal_appfwpolicy_binding obj = new appfwglobal_appfwpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwglobal_appfwpolicy_binding[] response = (appfwglobal_appfwpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwglobal_appfwpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwglobal_appfwpolicy_binding obj = new appfwglobal_appfwpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwglobal_appfwpolicy_binding[] response = (appfwglobal_appfwpolicy_binding[]) obj.getfiltered(service, option);
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
	public static class policytypeEnum {
		public static final String Classic_Policy = "Classic Policy";
		public static final String Advanced_Policy = "Advanced Policy";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}