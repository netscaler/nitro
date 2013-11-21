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

class nstrafficdomain_response extends base_response
{
	public nstrafficdomain[] nstrafficdomain;
}
/**
* Configuration for Traffic Domain resource.
*/

public class nstrafficdomain extends base_resource
{
	private Long td;
	private String aliasname;
	private String state;
	private Long __count;

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* Name of traffic domain  being added.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_aliasname(String aliasname) throws Exception{
		this.aliasname = aliasname;
	}

	/**
	* <pre>
	* Name of traffic domain  being added.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_aliasname() throws Exception {
		return this.aliasname;
	}

	/**
	* <pre>
	* The state of TrafficDmain.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of TrafficDmain.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nstrafficdomain_response result = (nstrafficdomain_response) service.get_payload_formatter().string_to_resource(nstrafficdomain_response.class, response);
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
		return result.nstrafficdomain;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.td != null) {
			return this.td.toString();
		}
		return null;
	}

	/**
	* Use this API to add nstrafficdomain.
	*/
	public static base_response add(nitro_service client, nstrafficdomain resource) throws Exception {
		nstrafficdomain addresource = new nstrafficdomain();
		addresource.td = resource.td;
		addresource.aliasname = resource.aliasname;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nstrafficdomain resources.
	*/
	public static base_responses add(nitro_service client, nstrafficdomain resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain addresources[] = new nstrafficdomain[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nstrafficdomain();
				addresources[i].td = resources[i].td;
				addresources[i].aliasname = resources[i].aliasname;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nstrafficdomain of given name.
	*/
	public static base_response delete(nitro_service client, Long td) throws Exception {
		nstrafficdomain deleteresource = new nstrafficdomain();
		deleteresource.td = td;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nstrafficdomain.
	*/
	public static base_response delete(nitro_service client, nstrafficdomain resource) throws Exception {
		nstrafficdomain deleteresource = new nstrafficdomain();
		deleteresource.td = resource.td;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nstrafficdomain resources of given names.
	*/
	public static base_responses delete(nitro_service client, Long td[]) throws Exception {
		base_responses result = null;
		if (td != null && td.length > 0) {
			nstrafficdomain deleteresources[] = new nstrafficdomain[td.length];
			for (int i=0;i<td.length;i++){
				deleteresources[i] = new nstrafficdomain();
				deleteresources[i].td = td[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nstrafficdomain resources.
	*/
	public static base_responses delete(nitro_service client, nstrafficdomain resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain deleteresources[] = new nstrafficdomain[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nstrafficdomain();
				deleteresources[i].td = resources[i].td;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to clear nstrafficdomain.
	*/
	public static base_response clear(nitro_service client, nstrafficdomain resource) throws Exception {
		nstrafficdomain clearresource = new nstrafficdomain();
		clearresource.td = resource.td;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear nstrafficdomain resources.
	*/
	public static base_responses clear(nitro_service client, nstrafficdomain resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain clearresources[] = new nstrafficdomain[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new nstrafficdomain();
				clearresources[i].td = resources[i].td;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to enable nstrafficdomain of given name.
	*/
	public static base_response enable(nitro_service client, Long td) throws Exception {
		nstrafficdomain enableresource = new nstrafficdomain();
		enableresource.td = td;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nstrafficdomain.
	*/
	public static base_response enable(nitro_service client, nstrafficdomain resource) throws Exception {
		nstrafficdomain enableresource = new nstrafficdomain();
		enableresource.td = resource.td;
		enableresource.state = resource.state;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nstrafficdomain resources of given names.
	*/
	public static base_responses enable(nitro_service client, Long td[]) throws Exception {
		base_responses result = null;
		if (td != null && td.length > 0) {
			nstrafficdomain enableresources[] = new nstrafficdomain[td.length];
			for (int i=0;i<td.length;i++){
				enableresources[i] = new nstrafficdomain();
				enableresources[i].td = td[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable nstrafficdomain resources.
	*/
	public static base_responses enable(nitro_service client, nstrafficdomain resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain enableresources[] = new nstrafficdomain[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new nstrafficdomain();
				enableresources[i].td = resources[i].td;
				enableresources[i].state = resources[i].state;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable nstrafficdomain of given name.
	*/
	public static base_response disable(nitro_service client, Long td) throws Exception {
		nstrafficdomain disableresource = new nstrafficdomain();
		disableresource.td = td;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nstrafficdomain.
	*/
	public static base_response disable(nitro_service client, nstrafficdomain resource) throws Exception {
		nstrafficdomain disableresource = new nstrafficdomain();
		disableresource.td = resource.td;
		disableresource.state = resource.state;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nstrafficdomain resources of given names.
	*/
	public static base_responses disable(nitro_service client, Long td[]) throws Exception {
		base_responses result = null;
		if (td != null && td.length > 0) {
			nstrafficdomain disableresources[] = new nstrafficdomain[td.length];
			for (int i=0;i<td.length;i++){
				disableresources[i] = new nstrafficdomain();
				disableresources[i].td = td[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable nstrafficdomain resources.
	*/
	public static base_responses disable(nitro_service client, nstrafficdomain resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain disableresources[] = new nstrafficdomain[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new nstrafficdomain();
				disableresources[i].td = resources[i].td;
				disableresources[i].state = resources[i].state;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to fetch all the nstrafficdomain resources that are configured on netscaler.
	*/
	public static nstrafficdomain[] get(nitro_service service) throws Exception{
		nstrafficdomain obj = new nstrafficdomain();
		nstrafficdomain[] response = (nstrafficdomain[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nstrafficdomain resources that are configured on netscaler.
	*/
	public static nstrafficdomain[] get(nitro_service service, options option) throws Exception{
		nstrafficdomain obj = new nstrafficdomain();
		nstrafficdomain[] response = (nstrafficdomain[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nstrafficdomain resource of given name .
	*/
	public static nstrafficdomain get(nitro_service service, Long td) throws Exception{
		nstrafficdomain obj = new nstrafficdomain();
		obj.set_td(td);
		nstrafficdomain response = (nstrafficdomain) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nstrafficdomain resources of given names .
	*/
	public static nstrafficdomain[] get(nitro_service service, Long td[]) throws Exception{
		if (td !=null && td.length>0) {
			nstrafficdomain response[] = new nstrafficdomain[td.length];
			nstrafficdomain obj[] = new nstrafficdomain[td.length];
			for (int i=0;i<td.length;i++) {
				obj[i] = new nstrafficdomain();
				obj[i].set_td(td[i]);
				response[i] = (nstrafficdomain) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nstrafficdomain resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nstrafficdomain[] get_filtered(nitro_service service, String filter) throws Exception{
		nstrafficdomain obj = new nstrafficdomain();
		options option = new options();
		option.set_filter(filter);
		nstrafficdomain[] response = (nstrafficdomain[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstrafficdomain resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nstrafficdomain[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nstrafficdomain obj = new nstrafficdomain();
		options option = new options();
		option.set_filter(filter);
		nstrafficdomain[] response = (nstrafficdomain[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nstrafficdomain resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nstrafficdomain obj = new nstrafficdomain();
		options option = new options();
		option.set_count(true);
		nstrafficdomain[] response = (nstrafficdomain[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nstrafficdomain resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nstrafficdomain obj = new nstrafficdomain();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstrafficdomain[] response = (nstrafficdomain[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstrafficdomain resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nstrafficdomain obj = new nstrafficdomain();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstrafficdomain[] response = (nstrafficdomain[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
