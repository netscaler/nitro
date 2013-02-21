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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nstimer_autoscalepolicy_binding_response extends base_response
{
	public nstimer_autoscalepolicy_binding[] nstimer_autoscalepolicy_binding;
}
/**
	* Binding class showing the autoscalepolicy that can be bound to nstimer.
	*/

public class nstimer_autoscalepolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private String vserver;
	private Long samplesize;
	private Long threshold;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Specifies the priority of the timer policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Specifies the priority of the timer policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Specifies the priority of the timer policy.
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
	* The timer policy associated with the timer.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The timer policy associated with the timer.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Timer name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Timer name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Denotes the threshold. If the rule of the policy in the binding relation evaluates 'threshold size' number of times in 'sample size' to true, then the corresponding action is taken. Its value needs to be less than or equal to the sample size value.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public void set_threshold(long threshold) throws Exception {
		this.threshold = new Long(threshold);
	}

	/**
	* <pre>
	* Denotes the threshold. If the rule of the policy in the binding relation evaluates 'threshold size' number of times in 'sample size' to true, then the corresponding action is taken. Its value needs to be less than or equal to the sample size value.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public void set_threshold(Long threshold) throws Exception{
		this.threshold = threshold;
	}

	/**
	* <pre>
	* Denotes the threshold. If the rule of the policy in the binding relation evaluates 'threshold size' number of times in 'sample size' to true, then the corresponding action is taken. Its value needs to be less than or equal to the sample size value.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public Long get_threshold() throws Exception {
		return this.threshold;
	}

	/**
	* <pre>
	* Denotes the sample size. Sample size value of 'x' means that previous '(x - 1)' policy's rule evaluation results and the current evaluation result are present with the binding. For example, sample size of 10 means that there is a state of previous 9 policy evaluation results and also the current policy evaluation result.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public void set_samplesize(long samplesize) throws Exception {
		this.samplesize = new Long(samplesize);
	}

	/**
	* <pre>
	* Denotes the sample size. Sample size value of 'x' means that previous '(x - 1)' policy's rule evaluation results and the current evaluation result are present with the binding. For example, sample size of 10 means that there is a state of previous 9 policy evaluation results and also the current policy evaluation result.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public void set_samplesize(Long samplesize) throws Exception{
		this.samplesize = samplesize;
	}

	/**
	* <pre>
	* Denotes the sample size. Sample size value of 'x' means that previous '(x - 1)' policy's rule evaluation results and the current evaluation result are present with the binding. For example, sample size of 10 means that there is a state of previous 9 policy evaluation results and also the current policy evaluation result.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public Long get_samplesize() throws Exception {
		return this.samplesize;
	}

	/**
	* <pre>
	* Name of the vserver which provides the context for the rule in timer policy. When not specified it is treated as a Global Default context.
	* </pre>
	*/
	public void set_vserver(String vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* Name of the vserver which provides the context for the rule in timer policy. When not specified it is treated as a Global Default context.
	* </pre>
	*/
	public String get_vserver() throws Exception {
		return this.vserver;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nstimer_autoscalepolicy_binding_response result = (nstimer_autoscalepolicy_binding_response) service.get_payload_formatter().string_to_resource(nstimer_autoscalepolicy_binding_response.class, response);
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
		return result.nstimer_autoscalepolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, nstimer_autoscalepolicy_binding resource) throws Exception {
		nstimer_autoscalepolicy_binding updateresource = new nstimer_autoscalepolicy_binding();
		updateresource.name = resource.name;
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.vserver = resource.vserver;
		updateresource.samplesize = resource.samplesize;
		updateresource.threshold = resource.threshold;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, nstimer_autoscalepolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstimer_autoscalepolicy_binding updateresources[] = new nstimer_autoscalepolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nstimer_autoscalepolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].vserver = resources[i].vserver;
				updateresources[i].samplesize = resources[i].samplesize;
				updateresources[i].threshold = resources[i].threshold;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, nstimer_autoscalepolicy_binding resource) throws Exception {
		nstimer_autoscalepolicy_binding deleteresource = new nstimer_autoscalepolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, nstimer_autoscalepolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstimer_autoscalepolicy_binding deleteresources[] = new nstimer_autoscalepolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nstimer_autoscalepolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch nstimer_autoscalepolicy_binding resources of given name .
	*/
	public static nstimer_autoscalepolicy_binding[] get(nitro_service service, String name) throws Exception{
		nstimer_autoscalepolicy_binding obj = new nstimer_autoscalepolicy_binding();
		obj.set_name(name);
		nstimer_autoscalepolicy_binding response[] = (nstimer_autoscalepolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstimer_autoscalepolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nstimer_autoscalepolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		nstimer_autoscalepolicy_binding obj = new nstimer_autoscalepolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		nstimer_autoscalepolicy_binding[] response = (nstimer_autoscalepolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstimer_autoscalepolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nstimer_autoscalepolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		nstimer_autoscalepolicy_binding obj = new nstimer_autoscalepolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		nstimer_autoscalepolicy_binding[] response = (nstimer_autoscalepolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count nstimer_autoscalepolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		nstimer_autoscalepolicy_binding obj = new nstimer_autoscalepolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		nstimer_autoscalepolicy_binding response[] = (nstimer_autoscalepolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstimer_autoscalepolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		nstimer_autoscalepolicy_binding obj = new nstimer_autoscalepolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstimer_autoscalepolicy_binding[] response = (nstimer_autoscalepolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstimer_autoscalepolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		nstimer_autoscalepolicy_binding obj = new nstimer_autoscalepolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstimer_autoscalepolicy_binding[] response = (nstimer_autoscalepolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}