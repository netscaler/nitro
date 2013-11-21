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

class bridgegroup_nsip_binding_response extends base_response
{
	public bridgegroup_nsip_binding[] bridgegroup_nsip_binding;
}
/**
	* Binding class showing the nsip that can be bound to bridgegroup.
	*/

public class bridgegroup_nsip_binding extends base_resource
{
	private String ipaddress;
	private Long td;
	private String netmask;
	private Boolean rnat;
	private Long id;
	private Long __count;

	/**
	* <pre>
	* The integer that uniquely identifies the bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* The integer that uniquely identifies the bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* The integer that uniquely identifies the bridge group.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* The network mask for the subnet defined for the bridge group.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The network mask for the subnet defined for the bridge group.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The IP address assigned to the  bridge group.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The IP address assigned to the  bridge group.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Temporary flag used for internal purpose.
	* </pre>
	*/
	public Boolean get_rnat() throws Exception {
		return this.rnat;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		bridgegroup_nsip_binding_response result = (bridgegroup_nsip_binding_response) service.get_payload_formatter().string_to_resource(bridgegroup_nsip_binding_response.class, response);
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
		return result.bridgegroup_nsip_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	public static base_response add(nitro_service client, bridgegroup_nsip_binding resource) throws Exception {
		bridgegroup_nsip_binding updateresource = new bridgegroup_nsip_binding();
		updateresource.id = resource.id;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.netmask = resource.netmask;
		updateresource.td = resource.td;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, bridgegroup_nsip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgegroup_nsip_binding updateresources[] = new bridgegroup_nsip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new bridgegroup_nsip_binding();
				updateresources[i].id = resources[i].id;
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].netmask = resources[i].netmask;
				updateresources[i].td = resources[i].td;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, bridgegroup_nsip_binding resource) throws Exception {
		bridgegroup_nsip_binding deleteresource = new bridgegroup_nsip_binding();
		deleteresource.id = resource.id;
		deleteresource.ipaddress = resource.ipaddress;
		deleteresource.netmask = resource.netmask;
		deleteresource.td = resource.td;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, bridgegroup_nsip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgegroup_nsip_binding deleteresources[] = new bridgegroup_nsip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new bridgegroup_nsip_binding();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].ipaddress = resources[i].ipaddress;
				deleteresources[i].netmask = resources[i].netmask;
				deleteresources[i].td = resources[i].td;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch bridgegroup_nsip_binding resources of given name .
	*/
	public static bridgegroup_nsip_binding[] get(nitro_service service, Long id) throws Exception{
		bridgegroup_nsip_binding obj = new bridgegroup_nsip_binding();
		obj.set_id(id);
		bridgegroup_nsip_binding response[] = (bridgegroup_nsip_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of bridgegroup_nsip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static bridgegroup_nsip_binding[] get_filtered(nitro_service service, Long id, String filter) throws Exception{
		bridgegroup_nsip_binding obj = new bridgegroup_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		bridgegroup_nsip_binding[] response = (bridgegroup_nsip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of bridgegroup_nsip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static bridgegroup_nsip_binding[] get_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		bridgegroup_nsip_binding obj = new bridgegroup_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		bridgegroup_nsip_binding[] response = (bridgegroup_nsip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count bridgegroup_nsip_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long id) throws Exception{
		bridgegroup_nsip_binding obj = new bridgegroup_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		bridgegroup_nsip_binding response[] = (bridgegroup_nsip_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of bridgegroup_nsip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long id, String filter) throws Exception{
		bridgegroup_nsip_binding obj = new bridgegroup_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		bridgegroup_nsip_binding[] response = (bridgegroup_nsip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of bridgegroup_nsip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		bridgegroup_nsip_binding obj = new bridgegroup_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		bridgegroup_nsip_binding[] response = (bridgegroup_nsip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}