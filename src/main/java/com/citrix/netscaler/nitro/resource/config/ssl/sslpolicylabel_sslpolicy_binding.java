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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslpolicylabel_sslpolicy_binding_response extends base_response
{
	public sslpolicylabel_sslpolicy_binding[] sslpolicylabel_sslpolicy_binding;
}
/**
	* Binding class showing the sslpolicy that can be bound to sslpolicylabel.
	*/

public class sslpolicylabel_sslpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private String labelname;
	private Boolean invoke;
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
	* The SSL policy name.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The SSL policy name.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = vserver, service, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = vserver, service, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the SSL policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the SSL policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public void set_invoke_labelname(String invoke_labelname) throws Exception{
		this.invoke_labelname = invoke_labelname;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslpolicylabel_sslpolicy_binding_response result = (sslpolicylabel_sslpolicy_binding_response) service.get_payload_formatter().string_to_resource(sslpolicylabel_sslpolicy_binding_response.class, response);
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
		return result.sslpolicylabel_sslpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	public static base_response add(nitro_service client, sslpolicylabel_sslpolicy_binding resource) throws Exception {
		sslpolicylabel_sslpolicy_binding updateresource = new sslpolicylabel_sslpolicy_binding();
		updateresource.labelname = resource.labelname;
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.invoke_labelname = resource.invoke_labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, sslpolicylabel_sslpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslpolicylabel_sslpolicy_binding updateresources[] = new sslpolicylabel_sslpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslpolicylabel_sslpolicy_binding();
				updateresources[i].labelname = resources[i].labelname;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].invoke = resources[i].invoke;
				updateresources[i].labeltype = resources[i].labeltype;
				updateresources[i].invoke_labelname = resources[i].invoke_labelname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, sslpolicylabel_sslpolicy_binding resource) throws Exception {
		sslpolicylabel_sslpolicy_binding deleteresource = new sslpolicylabel_sslpolicy_binding();
		deleteresource.labelname = resource.labelname;
		deleteresource.policyname = resource.policyname;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, sslpolicylabel_sslpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslpolicylabel_sslpolicy_binding deleteresources[] = new sslpolicylabel_sslpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslpolicylabel_sslpolicy_binding();
				deleteresources[i].labelname = resources[i].labelname;
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch sslpolicylabel_sslpolicy_binding resources of given name .
	*/
	public static sslpolicylabel_sslpolicy_binding[] get(nitro_service service, String labelname) throws Exception{
		sslpolicylabel_sslpolicy_binding obj = new sslpolicylabel_sslpolicy_binding();
		obj.set_labelname(labelname);
		sslpolicylabel_sslpolicy_binding response[] = (sslpolicylabel_sslpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslpolicylabel_sslpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslpolicylabel_sslpolicy_binding[] get_filtered(nitro_service service, String labelname, String filter) throws Exception{
		sslpolicylabel_sslpolicy_binding obj = new sslpolicylabel_sslpolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_filter(filter);
		sslpolicylabel_sslpolicy_binding[] response = (sslpolicylabel_sslpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslpolicylabel_sslpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslpolicylabel_sslpolicy_binding[] get_filtered(nitro_service service, String labelname, filtervalue[] filter) throws Exception{
		sslpolicylabel_sslpolicy_binding obj = new sslpolicylabel_sslpolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_filter(filter);
		sslpolicylabel_sslpolicy_binding[] response = (sslpolicylabel_sslpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslpolicylabel_sslpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String labelname) throws Exception{
		sslpolicylabel_sslpolicy_binding obj = new sslpolicylabel_sslpolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		sslpolicylabel_sslpolicy_binding response[] = (sslpolicylabel_sslpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslpolicylabel_sslpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String labelname, String filter) throws Exception{
		sslpolicylabel_sslpolicy_binding obj = new sslpolicylabel_sslpolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslpolicylabel_sslpolicy_binding[] response = (sslpolicylabel_sslpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslpolicylabel_sslpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String labelname, filtervalue[] filter) throws Exception{
		sslpolicylabel_sslpolicy_binding obj = new sslpolicylabel_sslpolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslpolicylabel_sslpolicy_binding[] response = (sslpolicylabel_sslpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String service = "service";
		public static final String policylabel = "policylabel";
	}

}