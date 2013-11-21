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

package com.citrix.netscaler.nitro.resource.config.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderglobal_responderpolicy_binding_response extends base_response
{
	public responderglobal_responderpolicy_binding[] responderglobal_responderpolicy_binding;
}
/**
	* Binding class showing the responderpolicy that can be bound to responderglobal.
	*/

public class responderglobal_responderpolicy_binding extends base_resource
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
	* Name of the responder policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name of the responder policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Name of the policy label to invoke. If the current policy evaluates to TRUE, the invoke parameter is set, and Label Type is policylabel.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the policy label to invoke. If the current policy evaluates to TRUE, the invoke parameter is set, and Label Type is policylabel.
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
	* Specifies the bind point whose policies you want to display. Available settings function as follows:
* REQ_OVERRIDE - Request override. Binds the policy to the priority request queue.
* REQ_DEFAULT - Binds the policy to the default request queue.
* OTHERTCP_REQ_OVERRIDE - Binds the policy to the non-HTTP TCP priority request queue.
* OTHERTCP_REQ_DEFAULT - Binds the policy to the non-HTTP TCP default request queue..
* SIPUDP_REQ_OVERRIDE - Binds the policy to the SIP UDP priority response queue..
* SIPUDP_REQ_DEFAULT - Binds the policy to the SIP UDP default response queue.
* MSSQL_REQ_OVERRIDE - Binds the policy to the Microsoft SQL priority response queue..
* MSSQL_REQ_DEFAULT - Binds the policy to the Microsoft SQL default response queue.
* MYSQL_REQ_OVERRIDE - Binds the policy to the MySQL priority response queue.
* MYSQL_REQ_DEFAULT - Binds the policy to the MySQL default response queue.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, OVERRIDE, DEFAULT, OTHERTCP_REQ_OVERRIDE, OTHERTCP_REQ_DEFAULT, SIPUDP_REQ_OVERRIDE, SIPUDP_REQ_DEFAULT, MSSQL_REQ_OVERRIDE, MSSQL_REQ_DEFAULT, MYSQL_REQ_OVERRIDE, MYSQL_REQ_DEFAULT
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Specifies the bind point whose policies you want to display. Available settings function as follows:
* REQ_OVERRIDE - Request override. Binds the policy to the priority request queue.
* REQ_DEFAULT - Binds the policy to the default request queue.
* OTHERTCP_REQ_OVERRIDE - Binds the policy to the non-HTTP TCP priority request queue.
* OTHERTCP_REQ_DEFAULT - Binds the policy to the non-HTTP TCP default request queue..
* SIPUDP_REQ_OVERRIDE - Binds the policy to the SIP UDP priority response queue..
* SIPUDP_REQ_DEFAULT - Binds the policy to the SIP UDP default response queue.
* MSSQL_REQ_OVERRIDE - Binds the policy to the Microsoft SQL priority response queue..
* MSSQL_REQ_DEFAULT - Binds the policy to the Microsoft SQL default response queue.
* MYSQL_REQ_OVERRIDE - Binds the policy to the MySQL priority response queue.
* MYSQL_REQ_DEFAULT - Binds the policy to the MySQL default response queue.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, OVERRIDE, DEFAULT, OTHERTCP_REQ_OVERRIDE, OTHERTCP_REQ_DEFAULT, SIPUDP_REQ_OVERRIDE, SIPUDP_REQ_DEFAULT, MSSQL_REQ_OVERRIDE, MSSQL_REQ_DEFAULT, MYSQL_REQ_OVERRIDE, MYSQL_REQ_DEFAULT
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Type of invocation, Available settings function as follows:
* vserver - Forward the request to the specified virtual server.
* policylabel - Invoke the specified policy label.<br> Possible values = vserver, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of invocation, Available settings function as follows:
* vserver - Forward the request to the specified virtual server.
* policylabel - Invoke the specified policy label.<br> Possible values = vserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* flowtype of the bound responder policy.
	* </pre>
	*/
	public Long get_flowtype() throws Exception {
		return this.flowtype;
	}

	/**
	* <pre>
	* number of polices bound to label.
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
		responderglobal_responderpolicy_binding_response result = (responderglobal_responderpolicy_binding_response) service.get_payload_formatter().string_to_resource(responderglobal_responderpolicy_binding_response.class, response);
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
		return result.responderglobal_responderpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, responderglobal_responderpolicy_binding resource) throws Exception {
		responderglobal_responderpolicy_binding updateresource = new responderglobal_responderpolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.type = resource.type;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.labelname = resource.labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, responderglobal_responderpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderglobal_responderpolicy_binding updateresources[] = new responderglobal_responderpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new responderglobal_responderpolicy_binding();
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

	public static base_response delete(nitro_service client, responderglobal_responderpolicy_binding resource) throws Exception {
		responderglobal_responderpolicy_binding deleteresource = new responderglobal_responderpolicy_binding();
		deleteresource.policyname = resource.policyname;
		deleteresource.type = resource.type;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, responderglobal_responderpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderglobal_responderpolicy_binding deleteresources[] = new responderglobal_responderpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new responderglobal_responderpolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].type = resources[i].type;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a responderglobal_responderpolicy_binding resources.
	*/
	public static responderglobal_responderpolicy_binding[] get(nitro_service service) throws Exception{
		responderglobal_responderpolicy_binding obj = new responderglobal_responderpolicy_binding();
		responderglobal_responderpolicy_binding response[] = (responderglobal_responderpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of responderglobal_responderpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static responderglobal_responderpolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		responderglobal_responderpolicy_binding obj = new responderglobal_responderpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		responderglobal_responderpolicy_binding[] response = (responderglobal_responderpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of responderglobal_responderpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static responderglobal_responderpolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		responderglobal_responderpolicy_binding obj = new responderglobal_responderpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		responderglobal_responderpolicy_binding[] response = (responderglobal_responderpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count responderglobal_responderpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		responderglobal_responderpolicy_binding obj = new responderglobal_responderpolicy_binding();
		options option = new options();
		option.set_count(true);
		responderglobal_responderpolicy_binding response[] = (responderglobal_responderpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of responderglobal_responderpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		responderglobal_responderpolicy_binding obj = new responderglobal_responderpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		responderglobal_responderpolicy_binding[] response = (responderglobal_responderpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of responderglobal_responderpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		responderglobal_responderpolicy_binding obj = new responderglobal_responderpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		responderglobal_responderpolicy_binding[] response = (responderglobal_responderpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String REQ_OVERRIDE = "REQ_OVERRIDE";
		public static final String REQ_DEFAULT = "REQ_DEFAULT";
		public static final String OVERRIDE = "OVERRIDE";
		public static final String DEFAULT = "DEFAULT";
		public static final String OTHERTCP_REQ_OVERRIDE = "OTHERTCP_REQ_OVERRIDE";
		public static final String OTHERTCP_REQ_DEFAULT = "OTHERTCP_REQ_DEFAULT";
		public static final String SIPUDP_REQ_OVERRIDE = "SIPUDP_REQ_OVERRIDE";
		public static final String SIPUDP_REQ_DEFAULT = "SIPUDP_REQ_DEFAULT";
		public static final String MSSQL_REQ_OVERRIDE = "MSSQL_REQ_OVERRIDE";
		public static final String MSSQL_REQ_DEFAULT = "MSSQL_REQ_DEFAULT";
		public static final String MYSQL_REQ_OVERRIDE = "MYSQL_REQ_OVERRIDE";
		public static final String MYSQL_REQ_DEFAULT = "MYSQL_REQ_DEFAULT";
	}
	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String policylabel = "policylabel";
	}

}