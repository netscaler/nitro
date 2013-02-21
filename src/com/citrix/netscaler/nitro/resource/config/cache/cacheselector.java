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

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cacheselector_response extends base_response
{
	public cacheselector[] cacheselector;
}
/**
* Configuration for cache selector resource.
*/

public class cacheselector extends base_resource
{
	private String selectorname;
	private String[] rule;

	//------- Read only Parameter ---------;

	private Long flags;
	private Long __count;

	/**
	* <pre>
	* The name of the Integrated Cache selector.
	* </pre>
	*/
	public void set_selectorname(String selectorname) throws Exception{
		this.selectorname = selectorname;
	}

	/**
	* <pre>
	* The name of the Integrated Cache selector.
	* </pre>
	*/
	public String get_selectorname() throws Exception {
		return this.selectorname;
	}

	/**
	* <pre>
	* The set of PIXL expressions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String[] rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The set of PIXL expressions.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Flags.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cacheselector_response result = (cacheselector_response) service.get_payload_formatter().string_to_resource(cacheselector_response.class, response);
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
		return result.cacheselector;
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
	* Use this API to add cacheselector.
	*/
	public static base_response add(nitro_service client, cacheselector resource) throws Exception {
		cacheselector addresource = new cacheselector();
		addresource.selectorname = resource.selectorname;
		addresource.rule = resource.rule;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cacheselector resources.
	*/
	public static base_responses add(nitro_service client, cacheselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cacheselector addresources[] = new cacheselector[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cacheselector();
				addresources[i].selectorname = resources[i].selectorname;
				addresources[i].rule = resources[i].rule;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cacheselector of given name.
	*/
	public static base_response delete(nitro_service client, String selectorname) throws Exception {
		cacheselector deleteresource = new cacheselector();
		deleteresource.selectorname = selectorname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cacheselector.
	*/
	public static base_response delete(nitro_service client, cacheselector resource) throws Exception {
		cacheselector deleteresource = new cacheselector();
		deleteresource.selectorname = resource.selectorname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cacheselector resources of given names.
	*/
	public static base_responses delete(nitro_service client, String selectorname[]) throws Exception {
		base_responses result = null;
		if (selectorname != null && selectorname.length > 0) {
			cacheselector deleteresources[] = new cacheselector[selectorname.length];
			for (int i=0;i<selectorname.length;i++){
				deleteresources[i] = new cacheselector();
				deleteresources[i].selectorname = selectorname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cacheselector resources.
	*/
	public static base_responses delete(nitro_service client, cacheselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cacheselector deleteresources[] = new cacheselector[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cacheselector();
				deleteresources[i].selectorname = resources[i].selectorname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update cacheselector.
	*/
	public static base_response update(nitro_service client, cacheselector resource) throws Exception {
		cacheselector updateresource = new cacheselector();
		updateresource.selectorname = resource.selectorname;
		updateresource.rule = resource.rule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update cacheselector resources.
	*/
	public static base_responses update(nitro_service client, cacheselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cacheselector updateresources[] = new cacheselector[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new cacheselector();
				updateresources[i].selectorname = resources[i].selectorname;
				updateresources[i].rule = resources[i].rule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the cacheselector resources that are configured on netscaler.
	*/
	public static cacheselector[] get(nitro_service service) throws Exception{
		cacheselector obj = new cacheselector();
		cacheselector[] response = (cacheselector[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cacheselector resources that are configured on netscaler.
	*/
	public static cacheselector[] get(nitro_service service, options option) throws Exception{
		cacheselector obj = new cacheselector();
		cacheselector[] response = (cacheselector[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cacheselector resource of given name .
	*/
	public static cacheselector get(nitro_service service, String selectorname) throws Exception{
		cacheselector obj = new cacheselector();
		obj.set_selectorname(selectorname);
		cacheselector response = (cacheselector) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cacheselector resources of given names .
	*/
	public static cacheselector[] get(nitro_service service, String selectorname[]) throws Exception{
		if (selectorname !=null && selectorname.length>0) {
			cacheselector response[] = new cacheselector[selectorname.length];
			cacheselector obj[] = new cacheselector[selectorname.length];
			for (int i=0;i<selectorname.length;i++) {
				obj[i] = new cacheselector();
				obj[i].set_selectorname(selectorname[i]);
				response[i] = (cacheselector) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cacheselector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cacheselector[] get_filtered(nitro_service service, String filter) throws Exception{
		cacheselector obj = new cacheselector();
		options option = new options();
		option.set_filter(filter);
		cacheselector[] response = (cacheselector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cacheselector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cacheselector[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cacheselector obj = new cacheselector();
		options option = new options();
		option.set_filter(filter);
		cacheselector[] response = (cacheselector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cacheselector resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cacheselector obj = new cacheselector();
		options option = new options();
		option.set_count(true);
		cacheselector[] response = (cacheselector[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cacheselector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cacheselector obj = new cacheselector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cacheselector[] response = (cacheselector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cacheselector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cacheselector obj = new cacheselector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cacheselector[] response = (cacheselector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
