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

package com.citrix.netscaler.nitro.resource.config.rewrite;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rewriteglobal_rewritepolicy_binding_response extends base_response
{
	public rewriteglobal_rewritepolicy_binding[] rewriteglobal_rewritepolicy_binding;
}
/**
	* Binding class showing the rewritepolicy that can be bound to rewriteglobal.
	*/

public class rewriteglobal_rewritepolicy_binding extends base_resource
{
	private String policyname;
	private String type;
	private Long priority;
	private String gotopriorityexpression;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private Long numpol;
	private Long flowtype;
	private Long __count;

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Name of the rewrite policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name of the rewrite policy.
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
	* Invoke flag.
	* </pre>
	*/
	public void set_invoke(boolean invoke) throws Exception {
		this.invoke = new Boolean(invoke);
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public void set_invoke(Boolean invoke) throws Exception{
		this.invoke = invoke;
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* The bindpoint to which to policy is bound.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, RES_OVERRIDE, RES_DEFAULT, OTHERTCP_REQ_OVERRIDE, OTHERTCP_REQ_DEFAULT, OTHERTCP_RES_OVERRIDE, OTHERTCP_RES_DEFAULT, SIPUDP_REQ_OVERRIDE, SIPUDP_REQ_DEFAULT, SIPUDP_RES_OVERRIDE, SIPUDP_RES_DEFAULT
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The bindpoint to which to policy is bound.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, RES_OVERRIDE, RES_DEFAULT, OTHERTCP_REQ_OVERRIDE, OTHERTCP_REQ_DEFAULT, OTHERTCP_RES_OVERRIDE, OTHERTCP_RES_DEFAULT, SIPUDP_REQ_OVERRIDE, SIPUDP_REQ_DEFAULT, SIPUDP_RES_OVERRIDE, SIPUDP_RES_DEFAULT
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* flowtype of the bound rewrite policy.
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rewriteglobal_rewritepolicy_binding_response result = (rewriteglobal_rewritepolicy_binding_response) service.get_payload_formatter().string_to_resource(rewriteglobal_rewritepolicy_binding_response.class, response);
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
		return result.rewriteglobal_rewritepolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, rewriteglobal_rewritepolicy_binding resource) throws Exception {
		rewriteglobal_rewritepolicy_binding updateresource = new rewriteglobal_rewritepolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.type = resource.type;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.labelname = resource.labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, rewriteglobal_rewritepolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewriteglobal_rewritepolicy_binding updateresources[] = new rewriteglobal_rewritepolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new rewriteglobal_rewritepolicy_binding();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
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

	public static base_response delete(nitro_service client, rewriteglobal_rewritepolicy_binding resource) throws Exception {
		rewriteglobal_rewritepolicy_binding deleteresource = new rewriteglobal_rewritepolicy_binding();
		deleteresource.policyname = resource.policyname;
		deleteresource.type = resource.type;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, rewriteglobal_rewritepolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewriteglobal_rewritepolicy_binding deleteresources[] = new rewriteglobal_rewritepolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new rewriteglobal_rewritepolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].type = resources[i].type;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a rewriteglobal_rewritepolicy_binding resources.
	*/
	public static rewriteglobal_rewritepolicy_binding[] get(nitro_service service) throws Exception{
		rewriteglobal_rewritepolicy_binding obj = new rewriteglobal_rewritepolicy_binding();
		rewriteglobal_rewritepolicy_binding response[] = (rewriteglobal_rewritepolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rewriteglobal_rewritepolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static rewriteglobal_rewritepolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		rewriteglobal_rewritepolicy_binding obj = new rewriteglobal_rewritepolicy_binding();
		options option = new options();
		option.set_filter(filter);
		rewriteglobal_rewritepolicy_binding[] response = (rewriteglobal_rewritepolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rewriteglobal_rewritepolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static rewriteglobal_rewritepolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rewriteglobal_rewritepolicy_binding obj = new rewriteglobal_rewritepolicy_binding();
		options option = new options();
		option.set_filter(filter);
		rewriteglobal_rewritepolicy_binding[] response = (rewriteglobal_rewritepolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count rewriteglobal_rewritepolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		rewriteglobal_rewritepolicy_binding obj = new rewriteglobal_rewritepolicy_binding();
		options option = new options();
		option.set_count(true);
		rewriteglobal_rewritepolicy_binding response[] = (rewriteglobal_rewritepolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rewriteglobal_rewritepolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		rewriteglobal_rewritepolicy_binding obj = new rewriteglobal_rewritepolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rewriteglobal_rewritepolicy_binding[] response = (rewriteglobal_rewritepolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rewriteglobal_rewritepolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rewriteglobal_rewritepolicy_binding obj = new rewriteglobal_rewritepolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rewriteglobal_rewritepolicy_binding[] response = (rewriteglobal_rewritepolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String REQ_OVERRIDE = "REQ_OVERRIDE";
		public static final String REQ_DEFAULT = "REQ_DEFAULT";
		public static final String RES_OVERRIDE = "RES_OVERRIDE";
		public static final String RES_DEFAULT = "RES_DEFAULT";
		public static final String OTHERTCP_REQ_OVERRIDE = "OTHERTCP_REQ_OVERRIDE";
		public static final String OTHERTCP_REQ_DEFAULT = "OTHERTCP_REQ_DEFAULT";
		public static final String OTHERTCP_RES_OVERRIDE = "OTHERTCP_RES_OVERRIDE";
		public static final String OTHERTCP_RES_DEFAULT = "OTHERTCP_RES_DEFAULT";
		public static final String SIPUDP_REQ_OVERRIDE = "SIPUDP_REQ_OVERRIDE";
		public static final String SIPUDP_REQ_DEFAULT = "SIPUDP_REQ_DEFAULT";
		public static final String SIPUDP_RES_OVERRIDE = "SIPUDP_RES_OVERRIDE";
		public static final String SIPUDP_RES_DEFAULT = "SIPUDP_RES_DEFAULT";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}

}