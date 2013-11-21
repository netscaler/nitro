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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbwlm_lbvserver_binding_response extends base_response
{
	public lbwlm_lbvserver_binding[] lbwlm_lbvserver_binding;
}
/**
	* Binding class showing the lbvserver that can be bound to lbwlm.
	*/

public class lbwlm_lbvserver_binding extends base_resource
{
	private String vservername;
	private String wlmname;
	private Long __count;

	/**
	* <pre>
	* The name of the Work Load Manager.<br> Minimum length =  1
	* </pre>
	*/
	public void set_wlmname(String wlmname) throws Exception{
		this.wlmname = wlmname;
	}

	/**
	* <pre>
	* The name of the Work Load Manager.<br> Minimum length =  1
	* </pre>
	*/
	public String get_wlmname() throws Exception {
		return this.wlmname;
	}

	/**
	* <pre>
	* Name of the virtual server which is to be bound to the WLM.
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* Name of the virtual server which is to be bound to the WLM.
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbwlm_lbvserver_binding_response result = (lbwlm_lbvserver_binding_response) service.get_payload_formatter().string_to_resource(lbwlm_lbvserver_binding_response.class, response);
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
		return result.lbwlm_lbvserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.wlmname;
	}

	public static base_response add(nitro_service client, lbwlm_lbvserver_binding resource) throws Exception {
		lbwlm_lbvserver_binding updateresource = new lbwlm_lbvserver_binding();
		updateresource.wlmname = resource.wlmname;
		updateresource.vservername = resource.vservername;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, lbwlm_lbvserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbwlm_lbvserver_binding updateresources[] = new lbwlm_lbvserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbwlm_lbvserver_binding();
				updateresources[i].wlmname = resources[i].wlmname;
				updateresources[i].vservername = resources[i].vservername;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, lbwlm_lbvserver_binding resource) throws Exception {
		lbwlm_lbvserver_binding deleteresource = new lbwlm_lbvserver_binding();
		deleteresource.wlmname = resource.wlmname;
		deleteresource.vservername = resource.vservername;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, lbwlm_lbvserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbwlm_lbvserver_binding deleteresources[] = new lbwlm_lbvserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbwlm_lbvserver_binding();
				deleteresources[i].wlmname = resources[i].wlmname;
				deleteresources[i].vservername = resources[i].vservername;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch lbwlm_lbvserver_binding resources of given name .
	*/
	public static lbwlm_lbvserver_binding[] get(nitro_service service, String wlmname) throws Exception{
		lbwlm_lbvserver_binding obj = new lbwlm_lbvserver_binding();
		obj.set_wlmname(wlmname);
		lbwlm_lbvserver_binding response[] = (lbwlm_lbvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbwlm_lbvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbwlm_lbvserver_binding[] get_filtered(nitro_service service, String wlmname, String filter) throws Exception{
		lbwlm_lbvserver_binding obj = new lbwlm_lbvserver_binding();
		obj.set_wlmname(wlmname);
		options option = new options();
		option.set_filter(filter);
		lbwlm_lbvserver_binding[] response = (lbwlm_lbvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbwlm_lbvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbwlm_lbvserver_binding[] get_filtered(nitro_service service, String wlmname, filtervalue[] filter) throws Exception{
		lbwlm_lbvserver_binding obj = new lbwlm_lbvserver_binding();
		obj.set_wlmname(wlmname);
		options option = new options();
		option.set_filter(filter);
		lbwlm_lbvserver_binding[] response = (lbwlm_lbvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbwlm_lbvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String wlmname) throws Exception{
		lbwlm_lbvserver_binding obj = new lbwlm_lbvserver_binding();
		obj.set_wlmname(wlmname);
		options option = new options();
		option.set_count(true);
		lbwlm_lbvserver_binding response[] = (lbwlm_lbvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbwlm_lbvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String wlmname, String filter) throws Exception{
		lbwlm_lbvserver_binding obj = new lbwlm_lbvserver_binding();
		obj.set_wlmname(wlmname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbwlm_lbvserver_binding[] response = (lbwlm_lbvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbwlm_lbvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String wlmname, filtervalue[] filter) throws Exception{
		lbwlm_lbvserver_binding obj = new lbwlm_lbvserver_binding();
		obj.set_wlmname(wlmname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbwlm_lbvserver_binding[] response = (lbwlm_lbvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}