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

class forwardingsession_response extends base_response
{
	public forwardingsession[] forwardingsession;
}
/**
* Configuration for session forward resource.
*/

public class forwardingsession extends base_resource
{
	private String name;
	private String network;
	private String netmask;
	private String aclname;
	private String connfailover;
	private Long __count;

	/**
	* <pre>
	* Name of forwarding session. .<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of forwarding session. .<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The network or subnet from/to which the traffic is flowing.<br> Minimum length =  1
	* </pre>
	*/
	public void set_network(String network) throws Exception{
		this.network = network;
	}

	/**
	* <pre>
	* The network or subnet from/to which the traffic is flowing.<br> Minimum length =  1
	* </pre>
	*/
	public String get_network() throws Exception {
		return this.network;
	}

	/**
	* <pre>
	* The subnet mask for the network.<br> Minimum length =  1
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The subnet mask for the network.<br> Minimum length =  1
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The ACL name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_aclname(String aclname) throws Exception{
		this.aclname = aclname;
	}

	/**
	* <pre>
	* The ACL name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_aclname() throws Exception {
		return this.aclname;
	}

	/**
	* <pre>
	* Specifies the connection failover mode of the forwarding session.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_connfailover(String connfailover) throws Exception{
		this.connfailover = connfailover;
	}

	/**
	* <pre>
	* Specifies the connection failover mode of the forwarding session.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_connfailover() throws Exception {
		return this.connfailover;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		forwardingsession_response result = (forwardingsession_response) service.get_payload_formatter().string_to_resource(forwardingsession_response.class, response);
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
		return result.forwardingsession;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add forwardingsession.
	*/
	public static base_response add(nitro_service client, forwardingsession resource) throws Exception {
		forwardingsession addresource = new forwardingsession();
		addresource.name = resource.name;
		addresource.network = resource.network;
		addresource.netmask = resource.netmask;
		addresource.aclname = resource.aclname;
		addresource.connfailover = resource.connfailover;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add forwardingsession resources.
	*/
	public static base_responses add(nitro_service client, forwardingsession resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			forwardingsession addresources[] = new forwardingsession[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new forwardingsession();
				addresources[i].name = resources[i].name;
				addresources[i].network = resources[i].network;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].aclname = resources[i].aclname;
				addresources[i].connfailover = resources[i].connfailover;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update forwardingsession.
	*/
	public static base_response update(nitro_service client, forwardingsession resource) throws Exception {
		forwardingsession updateresource = new forwardingsession();
		updateresource.name = resource.name;
		updateresource.connfailover = resource.connfailover;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update forwardingsession resources.
	*/
	public static base_responses update(nitro_service client, forwardingsession resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			forwardingsession updateresources[] = new forwardingsession[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new forwardingsession();
				updateresources[i].name = resources[i].name;
				updateresources[i].connfailover = resources[i].connfailover;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to delete forwardingsession of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		forwardingsession deleteresource = new forwardingsession();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete forwardingsession.
	*/
	public static base_response delete(nitro_service client, forwardingsession resource) throws Exception {
		forwardingsession deleteresource = new forwardingsession();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete forwardingsession resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			forwardingsession deleteresources[] = new forwardingsession[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new forwardingsession();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete forwardingsession resources.
	*/
	public static base_responses delete(nitro_service client, forwardingsession resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			forwardingsession deleteresources[] = new forwardingsession[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new forwardingsession();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the forwardingsession resources that are configured on netscaler.
	*/
	public static forwardingsession[] get(nitro_service service) throws Exception{
		forwardingsession obj = new forwardingsession();
		forwardingsession[] response = (forwardingsession[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the forwardingsession resources that are configured on netscaler.
	*/
	public static forwardingsession[] get(nitro_service service, options option) throws Exception{
		forwardingsession obj = new forwardingsession();
		forwardingsession[] response = (forwardingsession[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch forwardingsession resource of given name .
	*/
	public static forwardingsession get(nitro_service service, String name) throws Exception{
		forwardingsession obj = new forwardingsession();
		obj.set_name(name);
		forwardingsession response = (forwardingsession) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch forwardingsession resources of given names .
	*/
	public static forwardingsession[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			forwardingsession response[] = new forwardingsession[name.length];
			forwardingsession obj[] = new forwardingsession[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new forwardingsession();
				obj[i].set_name(name[i]);
				response[i] = (forwardingsession) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of forwardingsession resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static forwardingsession[] get_filtered(nitro_service service, String filter) throws Exception{
		forwardingsession obj = new forwardingsession();
		options option = new options();
		option.set_filter(filter);
		forwardingsession[] response = (forwardingsession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of forwardingsession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static forwardingsession[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		forwardingsession obj = new forwardingsession();
		options option = new options();
		option.set_filter(filter);
		forwardingsession[] response = (forwardingsession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the forwardingsession resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		forwardingsession obj = new forwardingsession();
		options option = new options();
		option.set_count(true);
		forwardingsession[] response = (forwardingsession[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of forwardingsession resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		forwardingsession obj = new forwardingsession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		forwardingsession[] response = (forwardingsession[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of forwardingsession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		forwardingsession obj = new forwardingsession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		forwardingsession[] response = (forwardingsession[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class connfailoverEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
