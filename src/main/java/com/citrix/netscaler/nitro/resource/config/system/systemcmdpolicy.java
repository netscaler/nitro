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

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemcmdpolicy_response extends base_response
{
	public systemcmdpolicy[] systemcmdpolicy;
}
/**
* Configuration for command policy resource.
*/

public class systemcmdpolicy extends base_resource
{
	private String policyname;
	private String action;
	private String cmdspec;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name for the command policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name for the command policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The action the policy need to apply when the cmdSpec pattern matches.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The action the policy need to apply when the cmdSpec pattern matches.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* The matching rule that the policy will utilize. This rule is a regular expression which the policy uses to pattern match.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cmdspec(String cmdspec) throws Exception{
		this.cmdspec = cmdspec;
	}

	/**
	* <pre>
	* The matching rule that the policy will utilize. This rule is a regular expression which the policy uses to pattern match.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cmdspec() throws Exception {
		return this.cmdspec;
	}

	/**
	* <pre>
	* .<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemcmdpolicy_response result = (systemcmdpolicy_response) service.get_payload_formatter().string_to_resource(systemcmdpolicy_response.class, response);
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
		return result.systemcmdpolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.policyname;
	}

	/**
	* Use this API to add systemcmdpolicy.
	*/
	public static base_response add(nitro_service client, systemcmdpolicy resource) throws Exception {
		systemcmdpolicy addresource = new systemcmdpolicy();
		addresource.policyname = resource.policyname;
		addresource.action = resource.action;
		addresource.cmdspec = resource.cmdspec;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add systemcmdpolicy resources.
	*/
	public static base_responses add(nitro_service client, systemcmdpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemcmdpolicy addresources[] = new systemcmdpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new systemcmdpolicy();
				addresources[i].policyname = resources[i].policyname;
				addresources[i].action = resources[i].action;
				addresources[i].cmdspec = resources[i].cmdspec;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete systemcmdpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String policyname) throws Exception {
		systemcmdpolicy deleteresource = new systemcmdpolicy();
		deleteresource.policyname = policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete systemcmdpolicy.
	*/
	public static base_response delete(nitro_service client, systemcmdpolicy resource) throws Exception {
		systemcmdpolicy deleteresource = new systemcmdpolicy();
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete systemcmdpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String policyname[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			systemcmdpolicy deleteresources[] = new systemcmdpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				deleteresources[i] = new systemcmdpolicy();
				deleteresources[i].policyname = policyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete systemcmdpolicy resources.
	*/
	public static base_responses delete(nitro_service client, systemcmdpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemcmdpolicy deleteresources[] = new systemcmdpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new systemcmdpolicy();
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update systemcmdpolicy.
	*/
	public static base_response update(nitro_service client, systemcmdpolicy resource) throws Exception {
		systemcmdpolicy updateresource = new systemcmdpolicy();
		updateresource.policyname = resource.policyname;
		updateresource.action = resource.action;
		updateresource.cmdspec = resource.cmdspec;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update systemcmdpolicy resources.
	*/
	public static base_responses update(nitro_service client, systemcmdpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemcmdpolicy updateresources[] = new systemcmdpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new systemcmdpolicy();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].action = resources[i].action;
				updateresources[i].cmdspec = resources[i].cmdspec;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the systemcmdpolicy resources that are configured on netscaler.
	*/
	public static systemcmdpolicy[] get(nitro_service service) throws Exception{
		systemcmdpolicy obj = new systemcmdpolicy();
		systemcmdpolicy[] response = (systemcmdpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the systemcmdpolicy resources that are configured on netscaler.
	*/
	public static systemcmdpolicy[] get(nitro_service service, options option) throws Exception{
		systemcmdpolicy obj = new systemcmdpolicy();
		systemcmdpolicy[] response = (systemcmdpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch systemcmdpolicy resource of given name .
	*/
	public static systemcmdpolicy get(nitro_service service, String policyname) throws Exception{
		systemcmdpolicy obj = new systemcmdpolicy();
		obj.set_policyname(policyname);
		systemcmdpolicy response = (systemcmdpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch systemcmdpolicy resources of given names .
	*/
	public static systemcmdpolicy[] get(nitro_service service, String policyname[]) throws Exception{
		if (policyname !=null && policyname.length>0) {
			systemcmdpolicy response[] = new systemcmdpolicy[policyname.length];
			systemcmdpolicy obj[] = new systemcmdpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++) {
				obj[i] = new systemcmdpolicy();
				obj[i].set_policyname(policyname[i]);
				response[i] = (systemcmdpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of systemcmdpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static systemcmdpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		systemcmdpolicy obj = new systemcmdpolicy();
		options option = new options();
		option.set_filter(filter);
		systemcmdpolicy[] response = (systemcmdpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systemcmdpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static systemcmdpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemcmdpolicy obj = new systemcmdpolicy();
		options option = new options();
		option.set_filter(filter);
		systemcmdpolicy[] response = (systemcmdpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the systemcmdpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		systemcmdpolicy obj = new systemcmdpolicy();
		options option = new options();
		option.set_count(true);
		systemcmdpolicy[] response = (systemcmdpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of systemcmdpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		systemcmdpolicy obj = new systemcmdpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemcmdpolicy[] response = (systemcmdpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systemcmdpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemcmdpolicy obj = new systemcmdpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemcmdpolicy[] response = (systemcmdpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class actionEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
	}
}
