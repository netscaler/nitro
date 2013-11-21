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

class nstrafficdomain_vlan_binding_response extends base_response
{
	public nstrafficdomain_vlan_binding[] nstrafficdomain_vlan_binding;
}
/**
	* Binding class showing the vlan that can be bound to nstrafficdomain.
	*/

public class nstrafficdomain_vlan_binding extends base_resource
{
	private Long vlan;
	private Long td;
	private Long __count;

	/**
	* <pre>
	* Names of all member vlans.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* Names of all member vlans.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* Names of all member vlans.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
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
		nstrafficdomain_vlan_binding_response result = (nstrafficdomain_vlan_binding_response) service.get_payload_formatter().string_to_resource(nstrafficdomain_vlan_binding_response.class, response);
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
		return result.nstrafficdomain_vlan_binding;
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

	public static base_response add(nitro_service client, nstrafficdomain_vlan_binding resource) throws Exception {
		nstrafficdomain_vlan_binding updateresource = new nstrafficdomain_vlan_binding();
		updateresource.td = resource.td;
		updateresource.vlan = resource.vlan;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, nstrafficdomain_vlan_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain_vlan_binding updateresources[] = new nstrafficdomain_vlan_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nstrafficdomain_vlan_binding();
				updateresources[i].td = resources[i].td;
				updateresources[i].vlan = resources[i].vlan;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, nstrafficdomain_vlan_binding resource) throws Exception {
		nstrafficdomain_vlan_binding deleteresource = new nstrafficdomain_vlan_binding();
		deleteresource.td = resource.td;
		deleteresource.vlan = resource.vlan;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, nstrafficdomain_vlan_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstrafficdomain_vlan_binding deleteresources[] = new nstrafficdomain_vlan_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nstrafficdomain_vlan_binding();
				deleteresources[i].td = resources[i].td;
				deleteresources[i].vlan = resources[i].vlan;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch nstrafficdomain_vlan_binding resources of given name .
	*/
	public static nstrafficdomain_vlan_binding[] get(nitro_service service, Long td) throws Exception{
		nstrafficdomain_vlan_binding obj = new nstrafficdomain_vlan_binding();
		obj.set_td(td);
		nstrafficdomain_vlan_binding response[] = (nstrafficdomain_vlan_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstrafficdomain_vlan_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nstrafficdomain_vlan_binding[] get_filtered(nitro_service service, Long td, String filter) throws Exception{
		nstrafficdomain_vlan_binding obj = new nstrafficdomain_vlan_binding();
		obj.set_td(td);
		options option = new options();
		option.set_filter(filter);
		nstrafficdomain_vlan_binding[] response = (nstrafficdomain_vlan_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstrafficdomain_vlan_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nstrafficdomain_vlan_binding[] get_filtered(nitro_service service, Long td, filtervalue[] filter) throws Exception{
		nstrafficdomain_vlan_binding obj = new nstrafficdomain_vlan_binding();
		obj.set_td(td);
		options option = new options();
		option.set_filter(filter);
		nstrafficdomain_vlan_binding[] response = (nstrafficdomain_vlan_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count nstrafficdomain_vlan_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long td) throws Exception{
		nstrafficdomain_vlan_binding obj = new nstrafficdomain_vlan_binding();
		obj.set_td(td);
		options option = new options();
		option.set_count(true);
		nstrafficdomain_vlan_binding response[] = (nstrafficdomain_vlan_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstrafficdomain_vlan_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long td, String filter) throws Exception{
		nstrafficdomain_vlan_binding obj = new nstrafficdomain_vlan_binding();
		obj.set_td(td);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstrafficdomain_vlan_binding[] response = (nstrafficdomain_vlan_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstrafficdomain_vlan_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long td, filtervalue[] filter) throws Exception{
		nstrafficdomain_vlan_binding obj = new nstrafficdomain_vlan_binding();
		obj.set_td(td);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstrafficdomain_vlan_binding[] response = (nstrafficdomain_vlan_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}