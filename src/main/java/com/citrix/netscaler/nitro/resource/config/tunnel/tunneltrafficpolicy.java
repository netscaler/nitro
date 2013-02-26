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

package com.citrix.netscaler.nitro.resource.config.tunnel;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tunneltrafficpolicy_response extends base_response
{
	public tunneltrafficpolicy[] tunneltrafficpolicy;
}
/**
* Configuration for tunnel policy resource.
*/

public class tunneltrafficpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long txbytes;
	private Long rxbytes;
	private Long clientttlb;
	private Long clienttransactions;
	private Long serverttlb;
	private Long servertransactions;
	private Boolean isdefault;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the new tunnel trafficpolicy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the new tunnel trafficpolicy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The expression specifying the condition under which this policy is applied.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The expression specifying the condition under which this policy is applied.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the action to be performed. The string value may be one of the following built-in compression actions:
	COMPRESS:   Enables default compression (DEFLATE).
	NOCOMPRESS: Disables compression.
	GZIP:       Enables GZIP compression.
	DEFLATE:    Enables DEFLATE compression.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The name of the action to be performed. The string value may be one of the following built-in compression actions:
	COMPRESS:   Enables default compression (DEFLATE).
	NOCOMPRESS: Disables compression.
	GZIP:       Enables GZIP compression.
	DEFLATE:    Enables DEFLATE compression.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* No of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Number of bytes transmitted.
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
	* A value of true is returned if it is a default tunnelpolicy.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		tunneltrafficpolicy_response result = (tunneltrafficpolicy_response) service.get_payload_formatter().string_to_resource(tunneltrafficpolicy_response.class, response);
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
		return result.tunneltrafficpolicy;
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
	* Use this API to add tunneltrafficpolicy.
	*/
	public static base_response add(nitro_service client, tunneltrafficpolicy resource) throws Exception {
		tunneltrafficpolicy addresource = new tunneltrafficpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add tunneltrafficpolicy resources.
	*/
	public static base_responses add(nitro_service client, tunneltrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tunneltrafficpolicy addresources[] = new tunneltrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new tunneltrafficpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete tunneltrafficpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		tunneltrafficpolicy deleteresource = new tunneltrafficpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tunneltrafficpolicy.
	*/
	public static base_response delete(nitro_service client, tunneltrafficpolicy resource) throws Exception {
		tunneltrafficpolicy deleteresource = new tunneltrafficpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tunneltrafficpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tunneltrafficpolicy deleteresources[] = new tunneltrafficpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new tunneltrafficpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete tunneltrafficpolicy resources.
	*/
	public static base_responses delete(nitro_service client, tunneltrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tunneltrafficpolicy deleteresources[] = new tunneltrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new tunneltrafficpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update tunneltrafficpolicy.
	*/
	public static base_response update(nitro_service client, tunneltrafficpolicy resource) throws Exception {
		tunneltrafficpolicy updateresource = new tunneltrafficpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update tunneltrafficpolicy resources.
	*/
	public static base_responses update(nitro_service client, tunneltrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tunneltrafficpolicy updateresources[] = new tunneltrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new tunneltrafficpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tunneltrafficpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		tunneltrafficpolicy unsetresource = new tunneltrafficpolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of tunneltrafficpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tunneltrafficpolicy resource, String[] args) throws Exception{
		tunneltrafficpolicy unsetresource = new tunneltrafficpolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.action = resource.action;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of tunneltrafficpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tunneltrafficpolicy unsetresources[] = new tunneltrafficpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new tunneltrafficpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tunneltrafficpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, tunneltrafficpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tunneltrafficpolicy unsetresources[] = new tunneltrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new tunneltrafficpolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].action = resources[i].action;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the tunneltrafficpolicy resources that are configured on netscaler.
	*/
	public static tunneltrafficpolicy[] get(nitro_service service) throws Exception{
		tunneltrafficpolicy obj = new tunneltrafficpolicy();
		tunneltrafficpolicy[] response = (tunneltrafficpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the tunneltrafficpolicy resources that are configured on netscaler.
	*/
	public static tunneltrafficpolicy[] get(nitro_service service, options option) throws Exception{
		tunneltrafficpolicy obj = new tunneltrafficpolicy();
		tunneltrafficpolicy[] response = (tunneltrafficpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch tunneltrafficpolicy resource of given name .
	*/
	public static tunneltrafficpolicy get(nitro_service service, String name) throws Exception{
		tunneltrafficpolicy obj = new tunneltrafficpolicy();
		obj.set_name(name);
		tunneltrafficpolicy response = (tunneltrafficpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tunneltrafficpolicy resources of given names .
	*/
	public static tunneltrafficpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tunneltrafficpolicy response[] = new tunneltrafficpolicy[name.length];
			tunneltrafficpolicy obj[] = new tunneltrafficpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tunneltrafficpolicy();
				obj[i].set_name(name[i]);
				response[i] = (tunneltrafficpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of tunneltrafficpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static tunneltrafficpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		tunneltrafficpolicy obj = new tunneltrafficpolicy();
		options option = new options();
		option.set_filter(filter);
		tunneltrafficpolicy[] response = (tunneltrafficpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of tunneltrafficpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static tunneltrafficpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tunneltrafficpolicy obj = new tunneltrafficpolicy();
		options option = new options();
		option.set_filter(filter);
		tunneltrafficpolicy[] response = (tunneltrafficpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the tunneltrafficpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		tunneltrafficpolicy obj = new tunneltrafficpolicy();
		options option = new options();
		option.set_count(true);
		tunneltrafficpolicy[] response = (tunneltrafficpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of tunneltrafficpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		tunneltrafficpolicy obj = new tunneltrafficpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tunneltrafficpolicy[] response = (tunneltrafficpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of tunneltrafficpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tunneltrafficpolicy obj = new tunneltrafficpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tunneltrafficpolicy[] response = (tunneltrafficpolicy[]) obj.getfiltered(service, option);
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
}
