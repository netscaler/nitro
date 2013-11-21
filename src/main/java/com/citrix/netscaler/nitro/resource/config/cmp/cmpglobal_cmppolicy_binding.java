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

package com.citrix.netscaler.nitro.resource.config.cmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cmpglobal_cmppolicy_binding_response extends base_response
{
	public cmpglobal_cmppolicy_binding[] cmpglobal_cmppolicy_binding;
}
/**
	* Binding class showing the cmppolicy that can be bound to cmpglobal.
	*/

public class cmpglobal_cmppolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String state;
	private String type;
	private Long numpol;
	private String policytype;
	private Long __count;

	/**
	* <pre>
	* Positive integer specifying the priority of the policy. The lower the number, the higher the priority. By default, polices within a label are evaluated in the order of their priority numbers.
In the configuration utility, you can click the Priority field and edit the priority level or drag the entry to a new position in the list. If you drag the entry to a new position, the priority level is updated automatically.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Positive integer specifying the priority of the policy. The lower the number, the higher the priority. By default, polices within a label are evaluated in the order of their priority numbers.
In the configuration utility, you can click the Priority field and edit the priority level or drag the entry to a new position in the list. If you drag the entry to a new position, the priority level is updated automatically.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Positive integer specifying the priority of the policy. The lower the number, the higher the priority. By default, polices within a label are evaluated in the order of their priority numbers.
In the configuration utility, you can click the Priority field and edit the priority level or drag the entry to a new position in the list. If you drag the entry to a new position, the priority level is updated automatically.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The current state of the policy binding. This attribute is relevant only for CLASSIC policies.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The current state of the policy binding. This attribute is relevant only for CLASSIC policies.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The name of the globally bound HTTP compression policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the globally bound HTTP compression policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Bind point to which the policy is bound.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, RES_OVERRIDE, RES_DEFAULT
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Bind point to which the policy is bound.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, RES_OVERRIDE, RES_DEFAULT
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
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
	* Policy type (Classic/Advanced) to be bound.Used for display.<br> Possible values = Classic Policy, Advanced Policy
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
		cmpglobal_cmppolicy_binding_response result = (cmpglobal_cmppolicy_binding_response) service.get_payload_formatter().string_to_resource(cmpglobal_cmppolicy_binding_response.class, response);
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
		return result.cmpglobal_cmppolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, cmpglobal_cmppolicy_binding resource) throws Exception {
		cmpglobal_cmppolicy_binding updateresource = new cmpglobal_cmppolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.state = resource.state;
		updateresource.type = resource.type;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, cmpglobal_cmppolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmpglobal_cmppolicy_binding updateresources[] = new cmpglobal_cmppolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new cmpglobal_cmppolicy_binding();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].state = resources[i].state;
				updateresources[i].type = resources[i].type;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, cmpglobal_cmppolicy_binding resource) throws Exception {
		cmpglobal_cmppolicy_binding deleteresource = new cmpglobal_cmppolicy_binding();
		deleteresource.policyname = resource.policyname;
		deleteresource.type = resource.type;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, cmpglobal_cmppolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmpglobal_cmppolicy_binding deleteresources[] = new cmpglobal_cmppolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cmpglobal_cmppolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].type = resources[i].type;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a cmpglobal_cmppolicy_binding resources.
	*/
	public static cmpglobal_cmppolicy_binding[] get(nitro_service service) throws Exception{
		cmpglobal_cmppolicy_binding obj = new cmpglobal_cmppolicy_binding();
		cmpglobal_cmppolicy_binding response[] = (cmpglobal_cmppolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cmpglobal_cmppolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cmpglobal_cmppolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		cmpglobal_cmppolicy_binding obj = new cmpglobal_cmppolicy_binding();
		options option = new options();
		option.set_filter(filter);
		cmpglobal_cmppolicy_binding[] response = (cmpglobal_cmppolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cmpglobal_cmppolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cmpglobal_cmppolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmpglobal_cmppolicy_binding obj = new cmpglobal_cmppolicy_binding();
		options option = new options();
		option.set_filter(filter);
		cmpglobal_cmppolicy_binding[] response = (cmpglobal_cmppolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count cmpglobal_cmppolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cmpglobal_cmppolicy_binding obj = new cmpglobal_cmppolicy_binding();
		options option = new options();
		option.set_count(true);
		cmpglobal_cmppolicy_binding response[] = (cmpglobal_cmppolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cmpglobal_cmppolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cmpglobal_cmppolicy_binding obj = new cmpglobal_cmppolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmpglobal_cmppolicy_binding[] response = (cmpglobal_cmppolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cmpglobal_cmppolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmpglobal_cmppolicy_binding obj = new cmpglobal_cmppolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmpglobal_cmppolicy_binding[] response = (cmpglobal_cmppolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String REQ_OVERRIDE = "REQ_OVERRIDE";
		public static final String REQ_DEFAULT = "REQ_DEFAULT";
		public static final String RES_OVERRIDE = "RES_OVERRIDE";
		public static final String RES_DEFAULT = "RES_DEFAULT";
	}
	public static class policytypeEnum {
		public static final String Classic_Policy = "Classic Policy";
		public static final String Advanced_Policy = "Advanced Policy";
	}

}