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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnsaction_response extends base_response
{
	public dnsaction[] dnsaction;
}
/**
* Configuration for DNS action resource.
*/

public class dnsaction extends base_resource
{
	private String actionname;
	private String actiontype;
	private String[] ipaddress;
	private Long ttl;
	private String viewname;
	private String[] preferredloclist;

	//------- Read only Parameter ---------;

	private String drop;
	private String cachebypass;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name of the dns action.
	* </pre>
	*/
	public void set_actionname(String actionname) throws Exception{
		this.actionname = actionname;
	}

	/**
	* <pre>
	* Name of the dns action.
	* </pre>
	*/
	public String get_actionname() throws Exception {
		return this.actionname;
	}

	/**
	* <pre>
	* The type of DNS action that is being configured.<br> Possible values = ViewName, GslbPrefLoc, Drop, Cache_Bypass, Rewrite_Response
	* </pre>
	*/
	public void set_actiontype(String actiontype) throws Exception{
		this.actiontype = actiontype;
	}

	/**
	* <pre>
	* The type of DNS action that is being configured.<br> Possible values = ViewName, GslbPrefLoc, Drop, Cache_Bypass, Rewrite_Response
	* </pre>
	*/
	public String get_actiontype() throws Exception {
		return this.actiontype;
	}

	/**
	* <pre>
	* List of IP address to be returned in case of rewrite_response actiontype. They can be of IPV4 or IPV6 type.
	    In case of set command We will remove all the IP address previously present in the action and will add new once given in set dns action command.
	* </pre>
	*/
	public void set_ipaddress(String[] ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* List of IP address to be returned in case of rewrite_response actiontype. They can be of IPV4 or IPV6 type.
	    In case of set command We will remove all the IP address previously present in the action and will add new once given in set dns action command.
	* </pre>
	*/
	public String[] get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* The view name that must be used for the given action.
	* </pre>
	*/
	public void set_viewname(String viewname) throws Exception{
		this.viewname = viewname;
	}

	/**
	* <pre>
	* The view name that must be used for the given action.
	* </pre>
	*/
	public String get_viewname() throws Exception {
		return this.viewname;
	}

	/**
	* <pre>
	* The location list in priority order used for the given action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_preferredloclist(String[] preferredloclist) throws Exception{
		this.preferredloclist = preferredloclist;
	}

	/**
	* <pre>
	* The location list in priority order used for the given action.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_preferredloclist() throws Exception {
		return this.preferredloclist;
	}

	/**
	* <pre>
	* The dns packet must be dropped.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_drop() throws Exception {
		return this.drop;
	}

	/**
	* <pre>
	* By pass dns cache for this.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachebypass() throws Exception {
		return this.cachebypass;
	}

	/**
	* <pre>
	* Flag to determine whether DNS action is default or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		dnsaction_response result = (dnsaction_response) service.get_payload_formatter().string_to_resource(dnsaction_response.class, response);
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
		return result.dnsaction;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.actionname;
	}

	/**
	* Use this API to add dnsaction.
	*/
	public static base_response add(nitro_service client, dnsaction resource) throws Exception {
		dnsaction addresource = new dnsaction();
		addresource.actionname = resource.actionname;
		addresource.actiontype = resource.actiontype;
		addresource.ipaddress = resource.ipaddress;
		addresource.ttl = resource.ttl;
		addresource.viewname = resource.viewname;
		addresource.preferredloclist = resource.preferredloclist;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsaction resources.
	*/
	public static base_responses add(nitro_service client, dnsaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaction addresources[] = new dnsaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsaction();
				addresources[i].actionname = resources[i].actionname;
				addresources[i].actiontype = resources[i].actiontype;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].ttl = resources[i].ttl;
				addresources[i].viewname = resources[i].viewname;
				addresources[i].preferredloclist = resources[i].preferredloclist;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsaction of given name.
	*/
	public static base_response delete(nitro_service client, String actionname) throws Exception {
		dnsaction deleteresource = new dnsaction();
		deleteresource.actionname = actionname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsaction.
	*/
	public static base_response delete(nitro_service client, dnsaction resource) throws Exception {
		dnsaction deleteresource = new dnsaction();
		deleteresource.actionname = resource.actionname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String actionname[]) throws Exception {
		base_responses result = null;
		if (actionname != null && actionname.length > 0) {
			dnsaction deleteresources[] = new dnsaction[actionname.length];
			for (int i=0;i<actionname.length;i++){
				deleteresources[i] = new dnsaction();
				deleteresources[i].actionname = actionname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsaction resources.
	*/
	public static base_responses delete(nitro_service client, dnsaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaction deleteresources[] = new dnsaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsaction();
				deleteresources[i].actionname = resources[i].actionname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dnsaction.
	*/
	public static base_response update(nitro_service client, dnsaction resource) throws Exception {
		dnsaction updateresource = new dnsaction();
		updateresource.actionname = resource.actionname;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.ttl = resource.ttl;
		updateresource.viewname = resource.viewname;
		updateresource.preferredloclist = resource.preferredloclist;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnsaction resources.
	*/
	public static base_responses update(nitro_service client, dnsaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaction updateresources[] = new dnsaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnsaction();
				updateresources[i].actionname = resources[i].actionname;
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].ttl = resources[i].ttl;
				updateresources[i].viewname = resources[i].viewname;
				updateresources[i].preferredloclist = resources[i].preferredloclist;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnsaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String actionname, String args[]) throws Exception {
		dnsaction unsetresource = new dnsaction();
		unsetresource.actionname = actionname;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of dnsaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnsaction resource, String[] args) throws Exception{
		dnsaction unsetresource = new dnsaction();
		unsetresource.actionname = resource.actionname;
		unsetresource.ttl = resource.ttl;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dnsaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String actionname[], String args[]) throws Exception {
		base_responses result = null;
		if (actionname != null && actionname.length > 0) {
			dnsaction unsetresources[] = new dnsaction[actionname.length];
			for (int i=0;i<actionname.length;i++){
				unsetresources[i] = new dnsaction();
				unsetresources[i].actionname = actionname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnsaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dnsaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaction unsetresources[] = new dnsaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dnsaction();
				unsetresources[i].actionname = resources[i].actionname;
				unsetresources[i].ttl = resources[i].ttl;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsaction resources that are configured on netscaler.
	*/
	public static dnsaction[] get(nitro_service service) throws Exception{
		dnsaction obj = new dnsaction();
		dnsaction[] response = (dnsaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsaction resources that are configured on netscaler.
	*/
	public static dnsaction[] get(nitro_service service, options option) throws Exception{
		dnsaction obj = new dnsaction();
		dnsaction[] response = (dnsaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dnsaction resource of given name .
	*/
	public static dnsaction get(nitro_service service, String actionname) throws Exception{
		dnsaction obj = new dnsaction();
		obj.set_actionname(actionname);
		dnsaction response = (dnsaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsaction resources of given names .
	*/
	public static dnsaction[] get(nitro_service service, String actionname[]) throws Exception{
		if (actionname !=null && actionname.length>0) {
			dnsaction response[] = new dnsaction[actionname.length];
			dnsaction obj[] = new dnsaction[actionname.length];
			for (int i=0;i<actionname.length;i++) {
				obj[i] = new dnsaction();
				obj[i].set_actionname(actionname[i]);
				response[i] = (dnsaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsaction[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsaction obj = new dnsaction();
		options option = new options();
		option.set_filter(filter);
		dnsaction[] response = (dnsaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsaction obj = new dnsaction();
		options option = new options();
		option.set_filter(filter);
		dnsaction[] response = (dnsaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsaction obj = new dnsaction();
		options option = new options();
		option.set_count(true);
		dnsaction[] response = (dnsaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsaction obj = new dnsaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsaction[] response = (dnsaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsaction obj = new dnsaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsaction[] response = (dnsaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cachebypassEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class dropEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class actiontypeEnum {
		public static final String ViewName = "ViewName";
		public static final String GslbPrefLoc = "GslbPrefLoc";
		public static final String Drop = "Drop";
		public static final String Cache_Bypass = "Cache_Bypass";
		public static final String Rewrite_Response = "Rewrite_Response";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
}
