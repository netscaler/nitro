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

package com.citrix.netscaler.nitro.resource.config.autoscale;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class autoscalepolicy_response extends base_response
{
	public autoscalepolicy[] autoscalepolicy;
}
/**
* Configuration for Autoscale policy resource.
*/

public class autoscalepolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;
	private String comment;
	private String logaction;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private Long priority;
	private Integer activepolicy;
	private Long __count;

	/**
	* <pre>
	* The name of the autoscale policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the autoscale policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule associated with the policy.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule associated with the policy.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The autoscale profile associated with the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The autoscale profile associated with the policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Comments associated with this autoscale policy.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this autoscale policy.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The log action associated with the autoscale policy.
	* </pre>
	*/
	public void set_logaction(String logaction) throws Exception{
		this.logaction = logaction;
	}

	/**
	* <pre>
	* The log action associated with the autoscale policy.
	* </pre>
	*/
	public String get_logaction() throws Exception {
		return this.logaction;
	}

	/**
	* <pre>
	* The new name of the autoscale policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the autoscale policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Number of Undef hits.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
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
	* Indicates whether policy is bound or not.
	* </pre>
	*/
	public Integer get_activepolicy() throws Exception {
		return this.activepolicy;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		autoscalepolicy_response result = (autoscalepolicy_response) service.get_payload_formatter().string_to_resource(autoscalepolicy_response.class, response);
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
		return result.autoscalepolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add autoscalepolicy.
	*/
	public static base_response add(nitro_service client, autoscalepolicy resource) throws Exception {
		autoscalepolicy addresource = new autoscalepolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		addresource.comment = resource.comment;
		addresource.logaction = resource.logaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add autoscalepolicy resources.
	*/
	public static base_responses add(nitro_service client, autoscalepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscalepolicy addresources[] = new autoscalepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new autoscalepolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
				addresources[i].comment = resources[i].comment;
				addresources[i].logaction = resources[i].logaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete autoscalepolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		autoscalepolicy deleteresource = new autoscalepolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete autoscalepolicy.
	*/
	public static base_response delete(nitro_service client, autoscalepolicy resource) throws Exception {
		autoscalepolicy deleteresource = new autoscalepolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete autoscalepolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			autoscalepolicy deleteresources[] = new autoscalepolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new autoscalepolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete autoscalepolicy resources.
	*/
	public static base_responses delete(nitro_service client, autoscalepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscalepolicy deleteresources[] = new autoscalepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new autoscalepolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update autoscalepolicy.
	*/
	public static base_response update(nitro_service client, autoscalepolicy resource) throws Exception {
		autoscalepolicy updateresource = new autoscalepolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		updateresource.comment = resource.comment;
		updateresource.logaction = resource.logaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update autoscalepolicy resources.
	*/
	public static base_responses update(nitro_service client, autoscalepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscalepolicy updateresources[] = new autoscalepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new autoscalepolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].logaction = resources[i].logaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of autoscalepolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		autoscalepolicy unsetresource = new autoscalepolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of autoscalepolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, autoscalepolicy resource, String[] args) throws Exception{
		autoscalepolicy unsetresource = new autoscalepolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.action = resource.action;
		unsetresource.comment = resource.comment;
		unsetresource.logaction = resource.logaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of autoscalepolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			autoscalepolicy unsetresources[] = new autoscalepolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new autoscalepolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of autoscalepolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, autoscalepolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscalepolicy unsetresources[] = new autoscalepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new autoscalepolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].action = resources[i].action;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].logaction = resources[i].logaction;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a autoscalepolicy resource.
	*/
	public static base_response rename(nitro_service client, autoscalepolicy resource, String new_name) throws Exception {
		autoscalepolicy renameresource = new autoscalepolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a autoscalepolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		autoscalepolicy renameresource = new autoscalepolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the autoscalepolicy resources that are configured on netscaler.
	*/
	public static autoscalepolicy[] get(nitro_service service) throws Exception{
		autoscalepolicy obj = new autoscalepolicy();
		autoscalepolicy[] response = (autoscalepolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the autoscalepolicy resources that are configured on netscaler.
	*/
	public static autoscalepolicy[] get(nitro_service service, options option) throws Exception{
		autoscalepolicy obj = new autoscalepolicy();
		autoscalepolicy[] response = (autoscalepolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch autoscalepolicy resource of given name .
	*/
	public static autoscalepolicy get(nitro_service service, String name) throws Exception{
		autoscalepolicy obj = new autoscalepolicy();
		obj.set_name(name);
		autoscalepolicy response = (autoscalepolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch autoscalepolicy resources of given names .
	*/
	public static autoscalepolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			autoscalepolicy response[] = new autoscalepolicy[name.length];
			autoscalepolicy obj[] = new autoscalepolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new autoscalepolicy();
				obj[i].set_name(name[i]);
				response[i] = (autoscalepolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of autoscalepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static autoscalepolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		autoscalepolicy obj = new autoscalepolicy();
		options option = new options();
		option.set_filter(filter);
		autoscalepolicy[] response = (autoscalepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of autoscalepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static autoscalepolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		autoscalepolicy obj = new autoscalepolicy();
		options option = new options();
		option.set_filter(filter);
		autoscalepolicy[] response = (autoscalepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the autoscalepolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		autoscalepolicy obj = new autoscalepolicy();
		options option = new options();
		option.set_count(true);
		autoscalepolicy[] response = (autoscalepolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of autoscalepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		autoscalepolicy obj = new autoscalepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		autoscalepolicy[] response = (autoscalepolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of autoscalepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		autoscalepolicy obj = new autoscalepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		autoscalepolicy[] response = (autoscalepolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
