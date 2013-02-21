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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class csvserver_filterpolicy_binding_response extends base_response
{
	public csvserver_filterpolicy_binding[] csvserver_filterpolicy_binding;
}
/**
	* Binding class showing the filterpolicy that can be bound to csvserver.
	*/

public class csvserver_filterpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String sc;
	private String name;
	private String targetlbvserver;
	private String gotopriorityexpression;
	private String bindpoint;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private Long __count;

	/**
	* <pre>
	* Priority for the policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority for the policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority for the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Bindpoint, specifying where to bind the policy. This field is applicable only to rewrite policies.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public void set_bindpoint(String bindpoint) throws Exception{
		this.bindpoint = bindpoint;
	}

	/**
	* <pre>
	* Bindpoint, specifying where to bind the policy. This field is applicable only to rewrite policies.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public String get_bindpoint() throws Exception {
		return this.bindpoint;
	}

	/**
	* <pre>
	* Policies bound to this vserver.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Policies bound to this vserver.
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
	* The virtual server name (created with the add cs vserver or add cr vserver command) for which the content switching policy will be set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The virtual server name (created with the add cs vserver or add cr vserver command) for which the content switching policy will be set.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy to be evaluated if the current policy rule evaluates to TRUE. This applies only to advanced content switching policy expressions and to application firewall, transform, cache, rewrite and responder policies.
	* </pre>
	*/
	public void set_gotopriorityexpression(String gotopriorityexpression) throws Exception{
		this.gotopriorityexpression = gotopriorityexpression;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy to be evaluated if the current policy rule evaluates to TRUE. This applies only to advanced content switching policy expressions and to application firewall, transform, cache, rewrite and responder policies.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* The virtual server name (created with the add lb vserver command) to which content will be switched.<br> Minimum length =  1
	* </pre>
	*/
	public void set_targetlbvserver(String targetlbvserver) throws Exception{
		this.targetlbvserver = targetlbvserver;
	}

	/**
	* <pre>
	* The virtual server name (created with the add lb vserver command) to which content will be switched.<br> Minimum length =  1
	* </pre>
	*/
	public String get_targetlbvserver() throws Exception {
		return this.targetlbvserver;
	}

	/**
	* <pre>
	* Invoke flag. This argument applies only to application firewall, transform, cache, rewrite and responder policies.
	* </pre>
	*/
	public void set_invoke(boolean invoke) throws Exception {
		this.invoke = new Boolean(invoke);
	}

	/**
	* <pre>
	* Invoke flag. This argument applies only to application firewall, transform, cache, rewrite and responder policies.
	* </pre>
	*/
	public void set_invoke(Boolean invoke) throws Exception{
		this.invoke = invoke;
	}

	/**
	* <pre>
	* Invoke flag. This argument applies only to application firewall, transform, cache, rewrite and responder policies.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* Type of policy label invocation. Applicable only to application firewall, transform, cache, rewrite and responder policy bindings.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of policy label invocation. Applicable only to application firewall, transform, cache, rewrite and responder policy bindings.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* The state of SureConnect the specified virtual server.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sc() throws Exception {
		return this.sc;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		csvserver_filterpolicy_binding_response result = (csvserver_filterpolicy_binding_response) service.get_payload_formatter().string_to_resource(csvserver_filterpolicy_binding_response.class, response);
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
		return result.csvserver_filterpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, csvserver_filterpolicy_binding resource) throws Exception {
		csvserver_filterpolicy_binding updateresource = new csvserver_filterpolicy_binding();
		updateresource.name = resource.name;
		updateresource.policyname = resource.policyname;
		updateresource.targetlbvserver = resource.targetlbvserver;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.bindpoint = resource.bindpoint;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.labelname = resource.labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, csvserver_filterpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver_filterpolicy_binding updateresources[] = new csvserver_filterpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new csvserver_filterpolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].targetlbvserver = resources[i].targetlbvserver;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].bindpoint = resources[i].bindpoint;
				updateresources[i].invoke = resources[i].invoke;
				updateresources[i].labeltype = resources[i].labeltype;
				updateresources[i].labelname = resources[i].labelname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, csvserver_filterpolicy_binding resource) throws Exception {
		csvserver_filterpolicy_binding deleteresource = new csvserver_filterpolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policyname = resource.policyname;
		deleteresource.bindpoint = resource.bindpoint;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, csvserver_filterpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver_filterpolicy_binding deleteresources[] = new csvserver_filterpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new csvserver_filterpolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].bindpoint = resources[i].bindpoint;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch csvserver_filterpolicy_binding resources of given name .
	*/
	public static csvserver_filterpolicy_binding[] get(nitro_service service, String name) throws Exception{
		csvserver_filterpolicy_binding obj = new csvserver_filterpolicy_binding();
		obj.set_name(name);
		csvserver_filterpolicy_binding response[] = (csvserver_filterpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of csvserver_filterpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static csvserver_filterpolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		csvserver_filterpolicy_binding obj = new csvserver_filterpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		csvserver_filterpolicy_binding[] response = (csvserver_filterpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of csvserver_filterpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static csvserver_filterpolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		csvserver_filterpolicy_binding obj = new csvserver_filterpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		csvserver_filterpolicy_binding[] response = (csvserver_filterpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count csvserver_filterpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		csvserver_filterpolicy_binding obj = new csvserver_filterpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		csvserver_filterpolicy_binding response[] = (csvserver_filterpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of csvserver_filterpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		csvserver_filterpolicy_binding obj = new csvserver_filterpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csvserver_filterpolicy_binding[] response = (csvserver_filterpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of csvserver_filterpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		csvserver_filterpolicy_binding obj = new csvserver_filterpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csvserver_filterpolicy_binding[] response = (csvserver_filterpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class scEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}

}