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

class arp_response extends base_response
{
	public arp[] arp;
}
/**
* Configuration for arp resource.
*/

public class arp extends base_resource
{
	private String ipaddress;
	private Long td;
	private String mac;
	private String ifnum;
	private Long ownernode;
	private Boolean all;

	//------- Read only Parameter ---------;

	private Long timeout;
	private Long state;
	private Long flags;
	private String type;
	private Long vlan;
	private Long channel;
	private Long __count;

	/**
	* <pre>
	* IP address of the network device that you want to add to the ARP table.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* IP address of the network device that you want to add to the ARP table.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
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
	* MAC address of the network device.
	* </pre>
	*/
	public void set_mac(String mac) throws Exception{
		this.mac = mac;
	}

	/**
	* <pre>
	* MAC address of the network device.
	* </pre>
	*/
	public String get_mac() throws Exception {
		return this.mac;
	}

	/**
	* <pre>
	* Interface through which the network device is accessible. Specify the interface in (slot/port) notation. For example, 1/3.
	* </pre>
	*/
	public void set_ifnum(String ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* Interface through which the network device is accessible. Specify the interface in (slot/port) notation. For example, 1/3.
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* The owner node for the Arp entry.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_ownernode(long ownernode) throws Exception {
		this.ownernode = new Long(ownernode);
	}

	/**
	* <pre>
	* The owner node for the Arp entry.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_ownernode(Long ownernode) throws Exception{
		this.ownernode = ownernode;
	}

	/**
	* <pre>
	* The owner node for the Arp entry.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_ownernode() throws Exception {
		return this.ownernode;
	}

	/**
	* <pre>
	* Remove all ARP entries from the ARP table of the NetScaler appliance.
	* </pre>
	*/
	public void set_all(boolean all) throws Exception {
		this.all = new Boolean(all);
	}

	/**
	* <pre>
	* Remove all ARP entries from the ARP table of the NetScaler appliance.
	* </pre>
	*/
	public void set_all(Boolean all) throws Exception{
		this.all = all;
	}

	/**
	* <pre>
	* Remove all ARP entries from the ARP table of the NetScaler appliance.
	* </pre>
	*/
	public Boolean get_all() throws Exception {
		return this.all;
	}

	/**
	* <pre>
	* The time, in seconds, after which the entry times out.
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* The state of the ARP entry.
	* </pre>
	*/
	public Long get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The flags for the entry.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Indicates whether this ARP entry was added manually or dynamically. When you manually add an ARP entry, the value for this parameter is STATIC. Otherwise, it is DYNAMIC. For the NSIP and loopback IP addresses, the value is PERMANENT.<br> Possible values = STATIC, PERMANENT, DYNAMIC
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The VLAN ID through which packets are to be sent after matching the ARP entry. This is a numeric value.
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* The tunnel, channel, or physical interface through which the ARP entry is identified.
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
		arp_response result = (arp_response) service.get_payload_formatter().string_to_resource(arp_response.class, response);
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
		return result.arp;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipaddress;
	}

	/**
	* Use this API to add arp.
	*/
	public static base_response add(nitro_service client, arp resource) throws Exception {
		arp addresource = new arp();
		addresource.ipaddress = resource.ipaddress;
		addresource.td = resource.td;
		addresource.mac = resource.mac;
		addresource.ifnum = resource.ifnum;
		addresource.ownernode = resource.ownernode;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add arp resources.
	*/
	public static base_responses add(nitro_service client, arp resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			arp addresources[] = new arp[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new arp();
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].td = resources[i].td;
				addresources[i].mac = resources[i].mac;
				addresources[i].ifnum = resources[i].ifnum;
				addresources[i].ownernode = resources[i].ownernode;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete arp of given name.
	*/
	public static base_response delete(nitro_service client, String ipaddress) throws Exception {
		arp deleteresource = new arp();
		deleteresource.ipaddress = ipaddress;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete arp.
	*/
	public static base_response delete(nitro_service client, arp resource) throws Exception {
		arp deleteresource = new arp();
		deleteresource.ipaddress = resource.ipaddress;
		deleteresource.td = resource.td;
		deleteresource.all = resource.all;
		deleteresource.ownernode = resource.ownernode;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete arp resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ipaddress[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			arp deleteresources[] = new arp[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				deleteresources[i] = new arp();
				deleteresources[i].ipaddress = ipaddress[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete arp resources.
	*/
	public static base_responses delete(nitro_service client, arp resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			arp deleteresources[] = new arp[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new arp();
				deleteresources[i].ipaddress = resources[i].ipaddress;
				deleteresources[i].td = resources[i].td;
				deleteresources[i].all = resources[i].all;
				deleteresources[i].ownernode = resources[i].ownernode;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to send arp.
	*/
	public static base_response send(nitro_service client, arp resource) throws Exception {
		arp sendresource = new arp();
		sendresource.ipaddress = resource.ipaddress;
		sendresource.td = resource.td;
		sendresource.all = resource.all;
		return sendresource.perform_operation(client,"send");
	}

	/**
	* Use this API to send arp resources.
	*/
	public static base_responses send(nitro_service client, arp resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			arp sendresources[] = new arp[resources.length];
			for (int i=0;i<resources.length;i++){
				sendresources[i] = new arp();
				sendresources[i].ipaddress = resources[i].ipaddress;
				sendresources[i].td = resources[i].td;
				sendresources[i].all = resources[i].all;
			}
			result = perform_operation_bulk_request(client, sendresources,"send");
		}
		return result;
	}

	/**
	* Use this API to fetch all the arp resources that are configured on netscaler.
	*/
	public static arp[] get(nitro_service service) throws Exception{
		arp obj = new arp();
		arp[] response = (arp[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the arp resources that are configured on netscaler.
	*/
	public static arp[] get(nitro_service service, options option) throws Exception{
		arp obj = new arp();
		arp[] response = (arp[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a arp resource.
	*/
	public static arp get(nitro_service service, arp obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		arp response = (arp) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a arp resources.
	*/
	public static arp[] get(nitro_service service, arp obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			arp response[] = new arp[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (arp) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of arp resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static arp[] get_filtered(nitro_service service, String filter) throws Exception{
		arp obj = new arp();
		options option = new options();
		option.set_filter(filter);
		arp[] response = (arp[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of arp resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static arp[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		arp obj = new arp();
		options option = new options();
		option.set_filter(filter);
		arp[] response = (arp[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the arp resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		arp obj = new arp();
		options option = new options();
		option.set_count(true);
		arp[] response = (arp[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of arp resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		arp obj = new arp();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		arp[] response = (arp[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of arp resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		arp obj = new arp();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		arp[] response = (arp[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String STATIC = "STATIC";
		public static final String PERMANENT = "PERMANENT";
		public static final String DYNAMIC = "DYNAMIC";
	}
}
