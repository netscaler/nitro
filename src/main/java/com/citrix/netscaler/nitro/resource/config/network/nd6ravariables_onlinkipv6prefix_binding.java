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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nd6ravariables_onlinkipv6prefix_binding_response extends base_response
{
	public nd6ravariables_onlinkipv6prefix_binding[] nd6ravariables_onlinkipv6prefix_binding;
}
/**
	* Binding class showing the onlinkipv6prefix that can be bound to nd6ravariables.
	*/

public class nd6ravariables_onlinkipv6prefix_binding extends base_resource
{
	private String ipv6prefix;
	private Long vlan;
	private Long __count;

	/**
	* <pre>
	* Onlink prefixes for RA messages.
	* </pre>
	*/
	public void set_ipv6prefix(String ipv6prefix) throws Exception{
		this.ipv6prefix = ipv6prefix;
	}

	/**
	* <pre>
	* Onlink prefixes for RA messages.
	* </pre>
	*/
	public String get_ipv6prefix() throws Exception {
		return this.ipv6prefix;
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* The VLAN number.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nd6ravariables_onlinkipv6prefix_binding_response result = (nd6ravariables_onlinkipv6prefix_binding_response) service.get_payload_formatter().string_to_resource(nd6ravariables_onlinkipv6prefix_binding_response.class, response);
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
		return result.nd6ravariables_onlinkipv6prefix_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.vlan != null) {
			return this.vlan.toString();
		}
		return null;
	}

	public static base_response add(nitro_service client, nd6ravariables_onlinkipv6prefix_binding resource) throws Exception {
		nd6ravariables_onlinkipv6prefix_binding updateresource = new nd6ravariables_onlinkipv6prefix_binding();
		updateresource.vlan = resource.vlan;
		updateresource.ipv6prefix = resource.ipv6prefix;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, nd6ravariables_onlinkipv6prefix_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nd6ravariables_onlinkipv6prefix_binding updateresources[] = new nd6ravariables_onlinkipv6prefix_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nd6ravariables_onlinkipv6prefix_binding();
				updateresources[i].vlan = resources[i].vlan;
				updateresources[i].ipv6prefix = resources[i].ipv6prefix;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, nd6ravariables_onlinkipv6prefix_binding resource) throws Exception {
		nd6ravariables_onlinkipv6prefix_binding deleteresource = new nd6ravariables_onlinkipv6prefix_binding();
		deleteresource.vlan = resource.vlan;
		deleteresource.ipv6prefix = resource.ipv6prefix;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, nd6ravariables_onlinkipv6prefix_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nd6ravariables_onlinkipv6prefix_binding deleteresources[] = new nd6ravariables_onlinkipv6prefix_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nd6ravariables_onlinkipv6prefix_binding();
				deleteresources[i].vlan = resources[i].vlan;
				deleteresources[i].ipv6prefix = resources[i].ipv6prefix;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch nd6ravariables_onlinkipv6prefix_binding resources of given name .
	*/
	public static nd6ravariables_onlinkipv6prefix_binding[] get(nitro_service service, Long vlan) throws Exception{
		nd6ravariables_onlinkipv6prefix_binding obj = new nd6ravariables_onlinkipv6prefix_binding();
		obj.set_vlan(vlan);
		nd6ravariables_onlinkipv6prefix_binding response[] = (nd6ravariables_onlinkipv6prefix_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nd6ravariables_onlinkipv6prefix_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nd6ravariables_onlinkipv6prefix_binding[] get_filtered(nitro_service service, Long vlan, String filter) throws Exception{
		nd6ravariables_onlinkipv6prefix_binding obj = new nd6ravariables_onlinkipv6prefix_binding();
		obj.set_vlan(vlan);
		options option = new options();
		option.set_filter(filter);
		nd6ravariables_onlinkipv6prefix_binding[] response = (nd6ravariables_onlinkipv6prefix_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nd6ravariables_onlinkipv6prefix_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nd6ravariables_onlinkipv6prefix_binding[] get_filtered(nitro_service service, Long vlan, filtervalue[] filter) throws Exception{
		nd6ravariables_onlinkipv6prefix_binding obj = new nd6ravariables_onlinkipv6prefix_binding();
		obj.set_vlan(vlan);
		options option = new options();
		option.set_filter(filter);
		nd6ravariables_onlinkipv6prefix_binding[] response = (nd6ravariables_onlinkipv6prefix_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count nd6ravariables_onlinkipv6prefix_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long vlan) throws Exception{
		nd6ravariables_onlinkipv6prefix_binding obj = new nd6ravariables_onlinkipv6prefix_binding();
		obj.set_vlan(vlan);
		options option = new options();
		option.set_count(true);
		nd6ravariables_onlinkipv6prefix_binding response[] = (nd6ravariables_onlinkipv6prefix_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nd6ravariables_onlinkipv6prefix_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long vlan, String filter) throws Exception{
		nd6ravariables_onlinkipv6prefix_binding obj = new nd6ravariables_onlinkipv6prefix_binding();
		obj.set_vlan(vlan);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nd6ravariables_onlinkipv6prefix_binding[] response = (nd6ravariables_onlinkipv6prefix_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nd6ravariables_onlinkipv6prefix_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long vlan, filtervalue[] filter) throws Exception{
		nd6ravariables_onlinkipv6prefix_binding obj = new nd6ravariables_onlinkipv6prefix_binding();
		obj.set_vlan(vlan);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nd6ravariables_onlinkipv6prefix_binding[] response = (nd6ravariables_onlinkipv6prefix_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}