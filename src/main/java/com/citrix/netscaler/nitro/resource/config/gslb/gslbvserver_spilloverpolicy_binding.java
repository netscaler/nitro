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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbvserver_spilloverpolicy_binding_response extends base_response
{
	public gslbvserver_spilloverpolicy_binding[] gslbvserver_spilloverpolicy_binding;
}
/**
	* Binding class showing the spilloverpolicy that can be bound to gslbvserver.
	*/

public class gslbvserver_spilloverpolicy_binding extends base_resource
{
	private String policyname;
	private String gotopriorityexpression;
	private String type;
	private Long priority;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Priority.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority.<br> Minimum value =  1<br> Maximum value =  2147483647
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
	* Name of the policy bound to the GSLB vserver.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name of the policy bound to the GSLB vserver.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Name of the virtual server on which to perform the binding operation.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the virtual server on which to perform the binding operation.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The bindpoint to which the policy is bound.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbvserver_spilloverpolicy_binding_response result = (gslbvserver_spilloverpolicy_binding_response) service.get_payload_formatter().string_to_resource(gslbvserver_spilloverpolicy_binding_response.class, response);
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
		return result.gslbvserver_spilloverpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, gslbvserver_spilloverpolicy_binding resource) throws Exception {
		gslbvserver_spilloverpolicy_binding updateresource = new gslbvserver_spilloverpolicy_binding();
		updateresource.name = resource.name;
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, gslbvserver_spilloverpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver_spilloverpolicy_binding updateresources[] = new gslbvserver_spilloverpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new gslbvserver_spilloverpolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, gslbvserver_spilloverpolicy_binding resource) throws Exception {
		gslbvserver_spilloverpolicy_binding deleteresource = new gslbvserver_spilloverpolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, gslbvserver_spilloverpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver_spilloverpolicy_binding deleteresources[] = new gslbvserver_spilloverpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new gslbvserver_spilloverpolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch gslbvserver_spilloverpolicy_binding resources of given name .
	*/
	public static gslbvserver_spilloverpolicy_binding[] get(nitro_service service, String name) throws Exception{
		gslbvserver_spilloverpolicy_binding obj = new gslbvserver_spilloverpolicy_binding();
		obj.set_name(name);
		gslbvserver_spilloverpolicy_binding response[] = (gslbvserver_spilloverpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbvserver_spilloverpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static gslbvserver_spilloverpolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		gslbvserver_spilloverpolicy_binding obj = new gslbvserver_spilloverpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		gslbvserver_spilloverpolicy_binding[] response = (gslbvserver_spilloverpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbvserver_spilloverpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static gslbvserver_spilloverpolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		gslbvserver_spilloverpolicy_binding obj = new gslbvserver_spilloverpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		gslbvserver_spilloverpolicy_binding[] response = (gslbvserver_spilloverpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count gslbvserver_spilloverpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		gslbvserver_spilloverpolicy_binding obj = new gslbvserver_spilloverpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		gslbvserver_spilloverpolicy_binding response[] = (gslbvserver_spilloverpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbvserver_spilloverpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		gslbvserver_spilloverpolicy_binding obj = new gslbvserver_spilloverpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbvserver_spilloverpolicy_binding[] response = (gslbvserver_spilloverpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbvserver_spilloverpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		gslbvserver_spilloverpolicy_binding obj = new gslbvserver_spilloverpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbvserver_spilloverpolicy_binding[] response = (gslbvserver_spilloverpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}

}