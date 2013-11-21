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

class nstrafficdomain_bridgegroup_binding_response extends base_response
{
	public nstrafficdomain_bridgegroup_binding[] nstrafficdomain_bridgegroup_binding;
}
/**
	* Binding class showing the bridgegroup that can be bound to nstrafficdomain.
	*/

public class nstrafficdomain_bridgegroup_binding extends base_resource
{
	private Long bridgegroup;
	private Long td;
	private Long __count;

	/**
	* <pre>
	* bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_bridgegroup(long bridgegroup) throws Exception {
		this.bridgegroup = new Long(bridgegroup);
	}

	/**
	* <pre>
	* bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_bridgegroup(Long bridgegroup) throws Exception{
		this.bridgegroup = bridgegroup;
	}

	/**
	* <pre>
	* bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_bridgegroup() throws Exception {
		return this.bridgegroup;
	}

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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nstrafficdomain_bridgegroup_binding_response result = (nstrafficdomain_bridgegroup_binding_response) service.get_payload_formatter().string_to_resource(nstrafficdomain_bridgegroup_binding_response.class, response);
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
		return result.nstrafficdomain_bridgegroup_binding;
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

	public static base_response add(nitro_service client, nstrafficdomain_bridgegroup_binding resource) throws Exception {
		nstrafficdomain_bridgegroup_binding updateresource = new nstrafficdomain_bridgegroup_binding();
		updateresource.td = resource.td;
		updateresource.bridgegroup = resource.bridgegroup;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, nstrafficdomain_bridgegroup_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain_bridgegroup_binding updateresources[] = new nstrafficdomain_bridgegroup_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nstrafficdomain_bridgegroup_binding();
				updateresources[i].td = resources[i].td;
				updateresources[i].bridgegroup = resources[i].bridgegroup;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, nstrafficdomain_bridgegroup_binding resource) throws Exception {
		nstrafficdomain_bridgegroup_binding deleteresource = new nstrafficdomain_bridgegroup_binding();
		deleteresource.td = resource.td;
		deleteresource.bridgegroup = resource.bridgegroup;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, nstrafficdomain_bridgegroup_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain_bridgegroup_binding deleteresources[] = new nstrafficdomain_bridgegroup_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nstrafficdomain_bridgegroup_binding();
				deleteresources[i].td = resources[i].td;
				deleteresources[i].bridgegroup = resources[i].bridgegroup;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch nstrafficdomain_bridgegroup_binding resources of given name .
	*/
	public static nstrafficdomain_bridgegroup_binding[] get(nitro_service service, Long td) throws Exception{
		nstrafficdomain_bridgegroup_binding obj = new nstrafficdomain_bridgegroup_binding();
		obj.set_td(td);
		nstrafficdomain_bridgegroup_binding response[] = (nstrafficdomain_bridgegroup_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstrafficdomain_bridgegroup_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nstrafficdomain_bridgegroup_binding[] get_filtered(nitro_service service, Long td, String filter) throws Exception{
		nstrafficdomain_bridgegroup_binding obj = new nstrafficdomain_bridgegroup_binding();
		obj.set_td(td);
		options option = new options();
		option.set_filter(filter);
		nstrafficdomain_bridgegroup_binding[] response = (nstrafficdomain_bridgegroup_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstrafficdomain_bridgegroup_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nstrafficdomain_bridgegroup_binding[] get_filtered(nitro_service service, Long td, filtervalue[] filter) throws Exception{
		nstrafficdomain_bridgegroup_binding obj = new nstrafficdomain_bridgegroup_binding();
		obj.set_td(td);
		options option = new options();
		option.set_filter(filter);
		nstrafficdomain_bridgegroup_binding[] response = (nstrafficdomain_bridgegroup_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count nstrafficdomain_bridgegroup_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long td) throws Exception{
		nstrafficdomain_bridgegroup_binding obj = new nstrafficdomain_bridgegroup_binding();
		obj.set_td(td);
		options option = new options();
		option.set_count(true);
		nstrafficdomain_bridgegroup_binding response[] = (nstrafficdomain_bridgegroup_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstrafficdomain_bridgegroup_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long td, String filter) throws Exception{
		nstrafficdomain_bridgegroup_binding obj = new nstrafficdomain_bridgegroup_binding();
		obj.set_td(td);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstrafficdomain_bridgegroup_binding[] response = (nstrafficdomain_bridgegroup_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstrafficdomain_bridgegroup_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long td, filtervalue[] filter) throws Exception{
		nstrafficdomain_bridgegroup_binding obj = new nstrafficdomain_bridgegroup_binding();
		obj.set_td(td);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstrafficdomain_bridgegroup_binding[] response = (nstrafficdomain_bridgegroup_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}