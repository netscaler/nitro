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

class sslservice_sslpolicy_binding_response extends base_response
{
	public sslservice_sslpolicy_binding[] sslservice_sslpolicy_binding;
}
/**
	* Binding class showing the sslpolicy that can be bound to sslservice.
	*/

public class sslservice_sslpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private Long polinherit;
	private String servicename;
	private String gotopriorityexpression;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private Long __count;

	/**
	* <pre>
	* The priority of the policies bound to this SSL service.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the policies bound to this SSL service.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the policies bound to this SSL service.
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
		This field is applicable only to rewrite and responder policies.<br> Default value: "END"
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
		This field is applicable only to rewrite and responder policies.<br> Default value: "END"
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* The SSL policy binding.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The SSL policy binding.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The name of the SSL service to which the SSL policy needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the SSL service to which the SSL policy needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* Type of policy label invocation. Applicable only to rewrite and cache policies.<br> Possible values = vserver, service, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of policy label invocation. Applicable only to rewrite and cache policies.<br> Possible values = vserver, service, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
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
	* Whether the bound policy is a inherited policy or not.
	* </pre>
	*/
	public Long get_polinherit() throws Exception {
		return this.polinherit;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslservice_sslpolicy_binding_response result = (sslservice_sslpolicy_binding_response) service.get_payload_formatter().string_to_resource(sslservice_sslpolicy_binding_response.class, response);
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
		return result.sslservice_sslpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicename;
	}

	public static base_response add(nitro_service client, sslservice_sslpolicy_binding resource) throws Exception {
		sslservice_sslpolicy_binding updateresource = new sslservice_sslpolicy_binding();
		updateresource.servicename = resource.servicename;
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.labelname = resource.labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, sslservice_sslpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservice_sslpolicy_binding updateresources[] = new sslservice_sslpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslservice_sslpolicy_binding();
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].invoke = resources[i].invoke;
				updateresources[i].labeltype = resources[i].labeltype;
				updateresources[i].labelname = resources[i].labelname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, sslservice_sslpolicy_binding resource) throws Exception {
		sslservice_sslpolicy_binding deleteresource = new sslservice_sslpolicy_binding();
		deleteresource.servicename = resource.servicename;
		deleteresource.policyname = resource.policyname;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, sslservice_sslpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservice_sslpolicy_binding deleteresources[] = new sslservice_sslpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslservice_sslpolicy_binding();
				deleteresources[i].servicename = resources[i].servicename;
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch sslservice_sslpolicy_binding resources of given name .
	*/
	public static sslservice_sslpolicy_binding[] get(nitro_service service, String servicename) throws Exception{
		sslservice_sslpolicy_binding obj = new sslservice_sslpolicy_binding();
		obj.set_servicename(servicename);
		sslservice_sslpolicy_binding response[] = (sslservice_sslpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservice_sslpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslservice_sslpolicy_binding[] get_filtered(nitro_service service, String servicename, String filter) throws Exception{
		sslservice_sslpolicy_binding obj = new sslservice_sslpolicy_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_filter(filter);
		sslservice_sslpolicy_binding[] response = (sslservice_sslpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservice_sslpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslservice_sslpolicy_binding[] get_filtered(nitro_service service, String servicename, filtervalue[] filter) throws Exception{
		sslservice_sslpolicy_binding obj = new sslservice_sslpolicy_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_filter(filter);
		sslservice_sslpolicy_binding[] response = (sslservice_sslpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslservice_sslpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String servicename) throws Exception{
		sslservice_sslpolicy_binding obj = new sslservice_sslpolicy_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		sslservice_sslpolicy_binding response[] = (sslservice_sslpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservice_sslpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String servicename, String filter) throws Exception{
		sslservice_sslpolicy_binding obj = new sslservice_sslpolicy_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservice_sslpolicy_binding[] response = (sslservice_sslpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservice_sslpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String servicename, filtervalue[] filter) throws Exception{
		sslservice_sslpolicy_binding obj = new sslservice_sslpolicy_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservice_sslpolicy_binding[] response = (sslservice_sslpolicy_binding[]) obj.getfiltered(service, option);
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
	public static class crlcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class ocspcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}

}