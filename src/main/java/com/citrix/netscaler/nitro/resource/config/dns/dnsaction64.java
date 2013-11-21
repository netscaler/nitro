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

class dnsaction64_response extends base_response
{
	public dnsaction64[] dnsaction64;
}
/**
* Configuration for dns64 action resource.
*/

public class dnsaction64 extends base_resource
{
	private String actionname;
	private String prefix;
	private String mappedrule;
	private String excluderule;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name of the dns64 action.
	* </pre>
	*/
	public void set_actionname(String actionname) throws Exception{
		this.actionname = actionname;
	}

	/**
	* <pre>
	* Name of the dns64 action.
	* </pre>
	*/
	public String get_actionname() throws Exception {
		return this.actionname;
	}

	/**
	* <pre>
	* The dns64 prefix to be used if the after evaluating the rules.
	* </pre>
	*/
	public void set_prefix(String prefix) throws Exception{
		this.prefix = prefix;
	}

	/**
	* <pre>
	* The dns64 prefix to be used if the after evaluating the rules.
	* </pre>
	*/
	public String get_prefix() throws Exception {
		return this.prefix;
	}

	/**
	* <pre>
	* The expression to select the criteria for ipv4 addresses to be used for synthesis.
                      Only if the mappedrule is evaluated to true the corresponding ipv4 address is used for synthesis using respective prefix, 
                      otherwise the A RR is discarded.
	* </pre>
	*/
	public void set_mappedrule(String mappedrule) throws Exception{
		this.mappedrule = mappedrule;
	}

	/**
	* <pre>
	* The expression to select the criteria for ipv4 addresses to be used for synthesis.
                      Only if the mappedrule is evaluated to true the corresponding ipv4 address is used for synthesis using respective prefix, 
                      otherwise the A RR is discarded.
	* </pre>
	*/
	public String get_mappedrule() throws Exception {
		return this.mappedrule;
	}

	/**
	* <pre>
	* The expression to select the criteria for eliminating the corresponding ipv6 addresses from the response.
	* </pre>
	*/
	public void set_excluderule(String excluderule) throws Exception{
		this.excluderule = excluderule;
	}

	/**
	* <pre>
	* The expression to select the criteria for eliminating the corresponding ipv6 addresses from the response.
	* </pre>
	*/
	public String get_excluderule() throws Exception {
		return this.excluderule;
	}

	/**
	* <pre>
	* Flag to determine whether dna64action is default or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		dnsaction64_response result = (dnsaction64_response) service.get_payload_formatter().string_to_resource(dnsaction64_response.class, response);
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
		return result.dnsaction64;
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
	* Use this API to add dnsaction64.
	*/
	public static base_response add(nitro_service client, dnsaction64 resource) throws Exception {
		dnsaction64 addresource = new dnsaction64();
		addresource.actionname = resource.actionname;
		addresource.prefix = resource.prefix;
		addresource.mappedrule = resource.mappedrule;
		addresource.excluderule = resource.excluderule;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsaction64 resources.
	*/
	public static base_responses add(nitro_service client, dnsaction64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaction64 addresources[] = new dnsaction64[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsaction64();
				addresources[i].actionname = resources[i].actionname;
				addresources[i].prefix = resources[i].prefix;
				addresources[i].mappedrule = resources[i].mappedrule;
				addresources[i].excluderule = resources[i].excluderule;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsaction64 of given name.
	*/
	public static base_response delete(nitro_service client, String actionname) throws Exception {
		dnsaction64 deleteresource = new dnsaction64();
		deleteresource.actionname = actionname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsaction64.
	*/
	public static base_response delete(nitro_service client, dnsaction64 resource) throws Exception {
		dnsaction64 deleteresource = new dnsaction64();
		deleteresource.actionname = resource.actionname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsaction64 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String actionname[]) throws Exception {
		base_responses result = null;
		if (actionname != null && actionname.length > 0) {
			dnsaction64 deleteresources[] = new dnsaction64[actionname.length];
			for (int i=0;i<actionname.length;i++){
				deleteresources[i] = new dnsaction64();
				deleteresources[i].actionname = actionname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsaction64 resources.
	*/
	public static base_responses delete(nitro_service client, dnsaction64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaction64 deleteresources[] = new dnsaction64[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsaction64();
				deleteresources[i].actionname = resources[i].actionname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dnsaction64.
	*/
	public static base_response update(nitro_service client, dnsaction64 resource) throws Exception {
		dnsaction64 updateresource = new dnsaction64();
		updateresource.actionname = resource.actionname;
		updateresource.prefix = resource.prefix;
		updateresource.mappedrule = resource.mappedrule;
		updateresource.excluderule = resource.excluderule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnsaction64 resources.
	*/
	public static base_responses update(nitro_service client, dnsaction64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaction64 updateresources[] = new dnsaction64[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnsaction64();
				updateresources[i].actionname = resources[i].actionname;
				updateresources[i].prefix = resources[i].prefix;
				updateresources[i].mappedrule = resources[i].mappedrule;
				updateresources[i].excluderule = resources[i].excluderule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnsaction64 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnsaction64 resource, String[] args) throws Exception{
		dnsaction64 unsetresource = new dnsaction64();
		unsetresource.actionname = resource.actionname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dnsaction64 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String actionname[], String args[]) throws Exception {
		base_responses result = null;
		if (actionname != null && actionname.length > 0) {
			dnsaction64 unsetresources[] = new dnsaction64[actionname.length];
			for (int i=0;i<actionname.length;i++){
				unsetresources[i] = new dnsaction64();
				unsetresources[i].actionname = actionname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnsaction64 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dnsaction64 resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsaction64 unsetresources[] = new dnsaction64[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dnsaction64();
				unsetresources[i].actionname = resources[i].actionname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsaction64 resources that are configured on netscaler.
	*/
	public static dnsaction64[] get(nitro_service service) throws Exception{
		dnsaction64 obj = new dnsaction64();
		dnsaction64[] response = (dnsaction64[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsaction64 resources that are configured on netscaler.
	*/
	public static dnsaction64[] get(nitro_service service, options option) throws Exception{
		dnsaction64 obj = new dnsaction64();
		dnsaction64[] response = (dnsaction64[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dnsaction64 resource of given name .
	*/
	public static dnsaction64 get(nitro_service service, String actionname) throws Exception{
		dnsaction64 obj = new dnsaction64();
		obj.set_actionname(actionname);
		dnsaction64 response = (dnsaction64) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsaction64 resources of given names .
	*/
	public static dnsaction64[] get(nitro_service service, String actionname[]) throws Exception{
		if (actionname !=null && actionname.length>0) {
			dnsaction64 response[] = new dnsaction64[actionname.length];
			dnsaction64 obj[] = new dnsaction64[actionname.length];
			for (int i=0;i<actionname.length;i++) {
				obj[i] = new dnsaction64();
				obj[i].set_actionname(actionname[i]);
				response[i] = (dnsaction64) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsaction64 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsaction64[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsaction64 obj = new dnsaction64();
		options option = new options();
		option.set_filter(filter);
		dnsaction64[] response = (dnsaction64[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsaction64 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsaction64[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsaction64 obj = new dnsaction64();
		options option = new options();
		option.set_filter(filter);
		dnsaction64[] response = (dnsaction64[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsaction64 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsaction64 obj = new dnsaction64();
		options option = new options();
		option.set_count(true);
		dnsaction64[] response = (dnsaction64[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsaction64 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsaction64 obj = new dnsaction64();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsaction64[] response = (dnsaction64[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsaction64 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsaction64 obj = new dnsaction64();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsaction64[] response = (dnsaction64[]) obj.getfiltered(service, option);
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
