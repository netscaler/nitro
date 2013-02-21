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

class cmppolicy_response extends base_response
{
	public cmppolicy[] cmppolicy;
}
/**
* Configuration for compression policy resource.
*/

public class cmppolicy extends base_resource
{
	private String name;
	private String rule;
	private String resaction;
	private String newname;

	//------- Read only Parameter ---------;

	private String expressiontype;
	private String reqaction;
	private Long hits;
	private Long txbytes;
	private Long rxbytes;
	private Long clientttlb;
	private Long clienttransactions;
	private Long serverttlb;
	private Long servertransactions;
	private String description;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the HTTP compression policy to be created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the HTTP compression policy to be created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule associated with the HTTP compression policy.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule associated with the HTTP compression policy.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The compression action that needs to be performed when the rule matches. The string value can be either be a created compression action (user-defined) or one of the following built-in compression actions:
	NOCOMPRESS action - can be used to define a policy that disables compression for the matching policy.COMPRESS action - can be used to enable compression for a specific policy.  This action will do GZIP or DEFLATE, based on the browser.
GZIP action - can be used to enable GZIP compression for a specific policy.  With this action, GZIP compression will be performed if the browser supports GZIP, other wise compression is disabled.
DEFLATE action - can be used to enable DEFLATE compression for a specific policy. With this action, DEFLATE compression will be performed if the browser supports DEFLATE, otherwise compression is disabled.<br> Minimum length =  1
	* </pre>
	*/
	public void set_resaction(String resaction) throws Exception{
		this.resaction = resaction;
	}

	/**
	* <pre>
	* The compression action that needs to be performed when the rule matches. The string value can be either be a created compression action (user-defined) or one of the following built-in compression actions:
	NOCOMPRESS action - can be used to define a policy that disables compression for the matching policy.COMPRESS action - can be used to enable compression for a specific policy.  This action will do GZIP or DEFLATE, based on the browser.
GZIP action - can be used to enable GZIP compression for a specific policy.  With this action, GZIP compression will be performed if the browser supports GZIP, other wise compression is disabled.
DEFLATE action - can be used to enable DEFLATE compression for a specific policy. With this action, DEFLATE compression will be performed if the browser supports DEFLATE, otherwise compression is disabled.<br> Minimum length =  1
	* </pre>
	*/
	public String get_resaction() throws Exception {
		return this.resaction;
	}

	/**
	* <pre>
	* The new name of the cmp policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the cmp policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Type of policy (Classic/Advanced) .<br> Possible values = Classic Policy, Advanced Policy
	* </pre>
	*/
	public String get_expressiontype() throws Exception {
		return this.expressiontype;
	}

	/**
	* <pre>
	* The compression action to be performed on requests.
	* </pre>
	*/
	public String get_reqaction() throws Exception {
		return this.reqaction;
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
	* Number of bytes transferred.
	* </pre>
	*/
	public Long get_txbytes() throws Exception {
		return this.txbytes;
	}

	/**
	* <pre>
	* Number of bytes received.
	* </pre>
	*/
	public Long get_rxbytes() throws Exception {
		return this.rxbytes;
	}

	/**
	* <pre>
	* Total client TTLB value.
	* </pre>
	*/
	public Long get_clientttlb() throws Exception {
		return this.clientttlb;
	}

	/**
	* <pre>
	* Number of client transactions.
	* </pre>
	*/
	public Long get_clienttransactions() throws Exception {
		return this.clienttransactions;
	}

	/**
	* <pre>
	* Total server TTLB value.
	* </pre>
	*/
	public Long get_serverttlb() throws Exception {
		return this.serverttlb;
	}

	/**
	* <pre>
	* Number of server transactions.
	* </pre>
	*/
	public Long get_servertransactions() throws Exception {
		return this.servertransactions;
	}

	/**
	* <pre>
	* Description of the policy.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* Flag to determine if compression policy is builtin or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		cmppolicy_response result = (cmppolicy_response) service.get_payload_formatter().string_to_resource(cmppolicy_response.class, response);
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
		return result.cmppolicy;
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
	* Use this API to add cmppolicy.
	*/
	public static base_response add(nitro_service client, cmppolicy resource) throws Exception {
		cmppolicy addresource = new cmppolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.resaction = resource.resaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cmppolicy resources.
	*/
	public static base_responses add(nitro_service client, cmppolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicy addresources[] = new cmppolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cmppolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].resaction = resources[i].resaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cmppolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		cmppolicy deleteresource = new cmppolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cmppolicy.
	*/
	public static base_response delete(nitro_service client, cmppolicy resource) throws Exception {
		cmppolicy deleteresource = new cmppolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cmppolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			cmppolicy deleteresources[] = new cmppolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new cmppolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cmppolicy resources.
	*/
	public static base_responses delete(nitro_service client, cmppolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicy deleteresources[] = new cmppolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cmppolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update cmppolicy.
	*/
	public static base_response update(nitro_service client, cmppolicy resource) throws Exception {
		cmppolicy updateresource = new cmppolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.resaction = resource.resaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update cmppolicy resources.
	*/
	public static base_responses update(nitro_service client, cmppolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicy updateresources[] = new cmppolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new cmppolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].resaction = resources[i].resaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of cmppolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		cmppolicy unsetresource = new cmppolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of cmppolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, cmppolicy resource, String[] args) throws Exception{
		cmppolicy unsetresource = new cmppolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.resaction = resource.resaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of cmppolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			cmppolicy unsetresources[] = new cmppolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new cmppolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of cmppolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, cmppolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicy unsetresources[] = new cmppolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new cmppolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].resaction = resources[i].resaction;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a cmppolicy resource.
	*/
	public static base_response rename(nitro_service client, cmppolicy resource, String new_name) throws Exception {
		cmppolicy renameresource = new cmppolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a cmppolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		cmppolicy renameresource = new cmppolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the cmppolicy resources that are configured on netscaler.
	*/
	public static cmppolicy[] get(nitro_service service) throws Exception{
		cmppolicy obj = new cmppolicy();
		cmppolicy[] response = (cmppolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cmppolicy resources that are configured on netscaler.
	*/
	public static cmppolicy[] get(nitro_service service, options option) throws Exception{
		cmppolicy obj = new cmppolicy();
		cmppolicy[] response = (cmppolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cmppolicy resource of given name .
	*/
	public static cmppolicy get(nitro_service service, String name) throws Exception{
		cmppolicy obj = new cmppolicy();
		obj.set_name(name);
		cmppolicy response = (cmppolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cmppolicy resources of given names .
	*/
	public static cmppolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			cmppolicy response[] = new cmppolicy[name.length];
			cmppolicy obj[] = new cmppolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new cmppolicy();
				obj[i].set_name(name[i]);
				response[i] = (cmppolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cmppolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cmppolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_filter(filter);
		cmppolicy[] response = (cmppolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cmppolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cmppolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_filter(filter);
		cmppolicy[] response = (cmppolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cmppolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_count(true);
		cmppolicy[] response = (cmppolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cmppolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmppolicy[] response = (cmppolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cmppolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmppolicy obj = new cmppolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmppolicy[] response = (cmppolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class expressiontypeEnum {
		public static final String Classic_Policy = "Classic Policy";
		public static final String Advanced_Policy = "Advanced Policy";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
}
