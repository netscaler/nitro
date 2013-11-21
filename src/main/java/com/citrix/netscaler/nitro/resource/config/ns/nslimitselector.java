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

class nslimitselector_response extends base_response
{
	public nslimitselector[] nslimitselector;
}
/**
* Configuration for limit selector resource.
*/

public class nslimitselector extends base_resource
{
	private String selectorname;
	private String[] rule;
	private Long __count;

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_selectorname(String selectorname) throws Exception{
		this.selectorname = selectorname;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_selectorname() throws Exception {
		return this.selectorname;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String[] rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nslimitselector_response result = (nslimitselector_response) service.get_payload_formatter().string_to_resource(nslimitselector_response.class, response);
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
		return result.nslimitselector;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.selectorname;
	}

	/**
	* Use this API to add nslimitselector.
	*/
	public static base_response add(nitro_service client, nslimitselector resource) throws Exception {
		nslimitselector addresource = new nslimitselector();
		addresource.selectorname = resource.selectorname;
		addresource.rule = resource.rule;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nslimitselector resources.
	*/
	public static base_responses add(nitro_service client, nslimitselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitselector addresources[] = new nslimitselector[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nslimitselector();
				addresources[i].selectorname = resources[i].selectorname;
				addresources[i].rule = resources[i].rule;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nslimitselector of given name.
	*/
	public static base_response delete(nitro_service client, String selectorname) throws Exception {
		nslimitselector deleteresource = new nslimitselector();
		deleteresource.selectorname = selectorname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nslimitselector.
	*/
	public static base_response delete(nitro_service client, nslimitselector resource) throws Exception {
		nslimitselector deleteresource = new nslimitselector();
		deleteresource.selectorname = resource.selectorname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nslimitselector resources of given names.
	*/
	public static base_responses delete(nitro_service client, String selectorname[]) throws Exception {
		base_responses result = null;
		if (selectorname != null && selectorname.length > 0) {
			nslimitselector deleteresources[] = new nslimitselector[selectorname.length];
			for (int i=0;i<selectorname.length;i++){
				deleteresources[i] = new nslimitselector();
				deleteresources[i].selectorname = selectorname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nslimitselector resources.
	*/
	public static base_responses delete(nitro_service client, nslimitselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitselector deleteresources[] = new nslimitselector[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nslimitselector();
				deleteresources[i].selectorname = resources[i].selectorname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nslimitselector.
	*/
	public static base_response update(nitro_service client, nslimitselector resource) throws Exception {
		nslimitselector updateresource = new nslimitselector();
		updateresource.selectorname = resource.selectorname;
		updateresource.rule = resource.rule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nslimitselector resources.
	*/
	public static base_responses update(nitro_service client, nslimitselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitselector updateresources[] = new nslimitselector[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nslimitselector();
				updateresources[i].selectorname = resources[i].selectorname;
				updateresources[i].rule = resources[i].rule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nslimitselector resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nslimitselector resource, String[] args) throws Exception{
		nslimitselector unsetresource = new nslimitselector();
		unsetresource.selectorname = resource.selectorname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nslimitselector resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String selectorname[], String args[]) throws Exception {
		base_responses result = null;
		if (selectorname != null && selectorname.length > 0) {
			nslimitselector unsetresources[] = new nslimitselector[selectorname.length];
			for (int i=0;i<selectorname.length;i++){
				unsetresources[i] = new nslimitselector();
				unsetresources[i].selectorname = selectorname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nslimitselector resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nslimitselector resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nslimitselector unsetresources[] = new nslimitselector[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nslimitselector();
				unsetresources[i].selectorname = resources[i].selectorname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nslimitselector resources that are configured on netscaler.
	*/
	public static nslimitselector[] get(nitro_service service) throws Exception{
		nslimitselector obj = new nslimitselector();
		nslimitselector[] response = (nslimitselector[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nslimitselector resources that are configured on netscaler.
	*/
	public static nslimitselector[] get(nitro_service service, options option) throws Exception{
		nslimitselector obj = new nslimitselector();
		nslimitselector[] response = (nslimitselector[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nslimitselector resource of given name .
	*/
	public static nslimitselector get(nitro_service service, String selectorname) throws Exception{
		nslimitselector obj = new nslimitselector();
		obj.set_selectorname(selectorname);
		nslimitselector response = (nslimitselector) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nslimitselector resources of given names .
	*/
	public static nslimitselector[] get(nitro_service service, String selectorname[]) throws Exception{
		if (selectorname !=null && selectorname.length>0) {
			nslimitselector response[] = new nslimitselector[selectorname.length];
			nslimitselector obj[] = new nslimitselector[selectorname.length];
			for (int i=0;i<selectorname.length;i++) {
				obj[i] = new nslimitselector();
				obj[i].set_selectorname(selectorname[i]);
				response[i] = (nslimitselector) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nslimitselector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nslimitselector[] get_filtered(nitro_service service, String filter) throws Exception{
		nslimitselector obj = new nslimitselector();
		options option = new options();
		option.set_filter(filter);
		nslimitselector[] response = (nslimitselector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nslimitselector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nslimitselector[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nslimitselector obj = new nslimitselector();
		options option = new options();
		option.set_filter(filter);
		nslimitselector[] response = (nslimitselector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nslimitselector resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nslimitselector obj = new nslimitselector();
		options option = new options();
		option.set_count(true);
		nslimitselector[] response = (nslimitselector[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nslimitselector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nslimitselector obj = new nslimitselector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nslimitselector[] response = (nslimitselector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nslimitselector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nslimitselector obj = new nslimitselector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nslimitselector[] response = (nslimitselector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
