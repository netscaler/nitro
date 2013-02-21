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

class bridgetable_response extends base_response
{
	public bridgetable[] bridgetable;
}
/**
* Configuration for bridge table entry resource.
*/

public class bridgetable extends base_resource
{
	private Long bridgeage;
	private Long vlan;
	private String ifnum;

	//------- Read only Parameter ---------;

	private String mac;
	private Long channel;
	private Long __count;

	/**
	* <pre>
	* The time-out value for the bridge table entries, in seconds. The new value applies only to the entries that are dynamically learned after the new value is set. Previously existing bridge table entries expire after the previously configured time-out value. Minimum value: 60. Maximum value: 300. Default: 300.<br> Default value: 300<br> Minimum value =  60<br> Maximum value =  300
	* </pre>
	*/
	public void set_bridgeage(long bridgeage) throws Exception {
		this.bridgeage = new Long(bridgeage);
	}

	/**
	* <pre>
	* The time-out value for the bridge table entries, in seconds. The new value applies only to the entries that are dynamically learned after the new value is set. Previously existing bridge table entries expire after the previously configured time-out value. Minimum value: 60. Maximum value: 300. Default: 300.<br> Default value: 300<br> Minimum value =  60<br> Maximum value =  300
	* </pre>
	*/
	public void set_bridgeage(Long bridgeage) throws Exception{
		this.bridgeage = bridgeage;
	}

	/**
	* <pre>
	* The time-out value for the bridge table entries, in seconds. The new value applies only to the entries that are dynamically learned after the new value is set. Previously existing bridge table entries expire after the previously configured time-out value. Minimum value: 60. Maximum value: 300. Default: 300.<br> Default value: 300<br> Minimum value =  60<br> Maximum value =  300
	* </pre>
	*/
	public Long get_bridgeage() throws Exception {
		return this.bridgeage;
	}

	/**
	* <pre>
	* VLAN  whose entries are to be removed.
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* VLAN  whose entries are to be removed.
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* VLAN  whose entries are to be removed.
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* INTERFACE  whose entries are to be removed.
	* </pre>
	*/
	public void set_ifnum(String ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* INTERFACE  whose entries are to be removed.
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* The MAC address of the target.
	* </pre>
	*/
	public String get_mac() throws Exception {
		return this.mac;
	}

	/**
	* <pre>
	* The Tunnel through which bridge entry is learned.
	* </pre>
	*/
	public Long get_channel() throws Exception {
		return this.channel;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		bridgetable_response result = (bridgetable_response) service.get_payload_formatter().string_to_resource(bridgetable_response.class, response);
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
		return result.bridgetable;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update bridgetable.
	*/
	public static base_response update(nitro_service client, bridgetable resource) throws Exception {
		bridgetable updateresource = new bridgetable();
		updateresource.bridgeage = resource.bridgeage;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update bridgetable resources.
	*/
	public static base_responses update(nitro_service client, bridgetable resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgetable updateresources[] = new bridgetable[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new bridgetable();
				updateresources[i].bridgeage = resources[i].bridgeage;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of bridgetable resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, bridgetable resource, String[] args) throws Exception{
		bridgetable unsetresource = new bridgetable();
		unsetresource.bridgeage = resource.bridgeage;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of bridgetable resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, bridgetable resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgetable unsetresources[] = new bridgetable[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new bridgetable();
				unsetresources[i].bridgeage = resources[i].bridgeage;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to clear bridgetable.
	*/
	public static base_response clear(nitro_service client, bridgetable resource) throws Exception {
		bridgetable clearresource = new bridgetable();
		clearresource.vlan = resource.vlan;
		clearresource.ifnum = resource.ifnum;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear bridgetable resources.
	*/
	public static base_responses clear(nitro_service client, bridgetable resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgetable clearresources[] = new bridgetable[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new bridgetable();
				clearresources[i].vlan = resources[i].vlan;
				clearresources[i].ifnum = resources[i].ifnum;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to fetch all the bridgetable resources that are configured on netscaler.
	*/
	public static bridgetable[] get(nitro_service service) throws Exception{
		bridgetable obj = new bridgetable();
		bridgetable[] response = (bridgetable[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the bridgetable resources that are configured on netscaler.
	*/
	public static bridgetable[] get(nitro_service service, options option) throws Exception{
		bridgetable obj = new bridgetable();
		bridgetable[] response = (bridgetable[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of bridgetable resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static bridgetable[] get_filtered(nitro_service service, String filter) throws Exception{
		bridgetable obj = new bridgetable();
		options option = new options();
		option.set_filter(filter);
		bridgetable[] response = (bridgetable[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of bridgetable resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static bridgetable[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		bridgetable obj = new bridgetable();
		options option = new options();
		option.set_filter(filter);
		bridgetable[] response = (bridgetable[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the bridgetable resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		bridgetable obj = new bridgetable();
		options option = new options();
		option.set_count(true);
		bridgetable[] response = (bridgetable[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of bridgetable resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		bridgetable obj = new bridgetable();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		bridgetable[] response = (bridgetable[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of bridgetable resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		bridgetable obj = new bridgetable();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		bridgetable[] response = (bridgetable[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
