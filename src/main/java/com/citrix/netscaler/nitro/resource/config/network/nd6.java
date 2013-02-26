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

class nd6_response extends base_response
{
	public nd6[] nd6;
}
/**
* Configuration for nd6 resource.
*/

public class nd6 extends base_resource
{
	private String neighbor;
	private String mac;
	private String ifnum;
	private Integer vlan;

	//------- Read only Parameter ---------;

	private String state;
	private Long timeout;
	private Long flags;
	private Long channel;
	private Long __count;

	/**
	* <pre>
	* IPv6 address of the adjacent network device that you want to add to the ND6 table.
	* </pre>
	*/
	public void set_neighbor(String neighbor) throws Exception{
		this.neighbor = neighbor;
	}

	/**
	* <pre>
	* IPv6 address of the adjacent network device that you want to add to the ND6 table.
	* </pre>
	*/
	public String get_neighbor() throws Exception {
		return this.neighbor;
	}

	/**
	* <pre>
	* MAC address of the adjacent network device.
	* </pre>
	*/
	public void set_mac(String mac) throws Exception{
		this.mac = mac;
	}

	/**
	* <pre>
	* MAC address of the adjacent network device.
	* </pre>
	*/
	public String get_mac() throws Exception {
		return this.mac;
	}

	/**
	* <pre>
	* The interface through which the adjacent network device is available, specified in slot/port notation, (for example, 1/3).
	* </pre>
	*/
	public void set_ifnum(String ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* The interface through which the adjacent network device is available, specified in slot/port notation, (for example, 1/3).
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* An integer value that uniquely identifies the VLAN on which the adjacent network device exists. Minimum value: 2. Maximum value: 4094.
	* </pre>
	*/
	public void set_vlan(int vlan) throws Exception {
		this.vlan = new Integer(vlan);
	}

	/**
	* <pre>
	* An integer value that uniquely identifies the VLAN on which the adjacent network device exists. Minimum value: 2. Maximum value: 4094.
	* </pre>
	*/
	public void set_vlan(Integer vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* An integer value that uniquely identifies the VLAN on which the adjacent network device exists. Minimum value: 2. Maximum value: 4094.
	* </pre>
	*/
	public Integer get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* ND6 state.<br> Default value: REACHABLE<br> Possible values = INCOMPLETE, REACHABLE, STALE, DELAY, PROBE
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Time elapsed.
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* flag for static/permanent entry.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* The tunnel that is bound to a netbridge.
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
		nd6_response result = (nd6_response) service.get_payload_formatter().string_to_resource(nd6_response.class, response);
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
		return result.nd6;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.neighbor;
	}

	/**
	* Use this API to add nd6.
	*/
	public static base_response add(nitro_service client, nd6 resource) throws Exception {
		nd6 addresource = new nd6();
		addresource.neighbor = resource.neighbor;
		addresource.mac = resource.mac;
		addresource.ifnum = resource.ifnum;
		addresource.vlan = resource.vlan;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nd6 resources.
	*/
	public static base_responses add(nitro_service client, nd6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nd6 addresources[] = new nd6[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nd6();
				addresources[i].neighbor = resources[i].neighbor;
				addresources[i].mac = resources[i].mac;
				addresources[i].ifnum = resources[i].ifnum;
				addresources[i].vlan = resources[i].vlan;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to clear nd6.
	*/
	public static base_response clear(nitro_service client) throws Exception {
		nd6 clearresource = new nd6();
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear nd6 resources.
	*/
	public static base_responses clear(nitro_service client, nd6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nd6 clearresources[] = new nd6[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new nd6();
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to delete nd6 of given name.
	*/
	public static base_response delete(nitro_service client, String neighbor) throws Exception {
		nd6 deleteresource = new nd6();
		deleteresource.neighbor = neighbor;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nd6.
	*/
	public static base_response delete(nitro_service client, nd6 resource) throws Exception {
		nd6 deleteresource = new nd6();
		deleteresource.neighbor = resource.neighbor;
		deleteresource.vlan = resource.vlan;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nd6 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String neighbor[]) throws Exception {
		base_responses result = null;
		if (neighbor != null && neighbor.length > 0) {
			nd6 deleteresources[] = new nd6[neighbor.length];
			for (int i=0;i<neighbor.length;i++){
				deleteresources[i] = new nd6();
				deleteresources[i].neighbor = neighbor[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nd6 resources.
	*/
	public static base_responses delete(nitro_service client, nd6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nd6 deleteresources[] = new nd6[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nd6();
				deleteresources[i].neighbor = resources[i].neighbor;
				deleteresources[i].vlan = resources[i].vlan;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nd6 resources that are configured on netscaler.
	*/
	public static nd6[] get(nitro_service service) throws Exception{
		nd6 obj = new nd6();
		nd6[] response = (nd6[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nd6 resources that are configured on netscaler.
	*/
	public static nd6[] get(nitro_service service, options option) throws Exception{
		nd6 obj = new nd6();
		nd6[] response = (nd6[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nd6 resource of given name .
	*/
	public static nd6 get(nitro_service service, String neighbor) throws Exception{
		nd6 obj = new nd6();
		obj.set_neighbor(neighbor);
		nd6 response = (nd6) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nd6 resources of given names .
	*/
	public static nd6[] get(nitro_service service, String neighbor[]) throws Exception{
		if (neighbor !=null && neighbor.length>0) {
			nd6 response[] = new nd6[neighbor.length];
			nd6 obj[] = new nd6[neighbor.length];
			for (int i=0;i<neighbor.length;i++) {
				obj[i] = new nd6();
				obj[i].set_neighbor(neighbor[i]);
				response[i] = (nd6) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nd6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nd6[] get_filtered(nitro_service service, String filter) throws Exception{
		nd6 obj = new nd6();
		options option = new options();
		option.set_filter(filter);
		nd6[] response = (nd6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nd6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nd6[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nd6 obj = new nd6();
		options option = new options();
		option.set_filter(filter);
		nd6[] response = (nd6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nd6 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nd6 obj = new nd6();
		options option = new options();
		option.set_count(true);
		nd6[] response = (nd6[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nd6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nd6 obj = new nd6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nd6[] response = (nd6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nd6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nd6 obj = new nd6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nd6[] response = (nd6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String INCOMPLETE = "INCOMPLETE";
		public static final String REACHABLE = "REACHABLE";
		public static final String STALE = "STALE";
		public static final String DELAY = "DELAY";
		public static final String PROBE = "PROBE";
	}
}
