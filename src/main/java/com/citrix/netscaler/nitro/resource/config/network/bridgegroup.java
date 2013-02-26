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

class bridgegroup_response extends base_response
{
	public bridgegroup[] bridgegroup;
}
/**
* Configuration for bridge group resource.
*/

public class bridgegroup extends base_resource
{
	private Long id;
	private String ipv6dynamicrouting;

	//------- Read only Parameter ---------;

	private Boolean flags;
	private Long portbitmap;
	private Long tagbitmap;
	private String ifaces;
	private String tagifaces;
	private Boolean rnat;
	private Long __count;

	/**
	* <pre>
	* An integer that uniquely identifies the bridge group. Minimum value: 1. Maximum value: 1000.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* An integer that uniquely identifies the bridge group. Minimum value: 1. Maximum value: 1000.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* An integer that uniquely identifies the bridge group. Minimum value: 1. Maximum value: 1000.<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* Enable all IPv6 dynamic routing protocols on this VLAN. Possible values: ENABLED, DISABLED Default: DISABLED. Note: For the ENABLED setting to work, you must configure IPv6 dynamic routing protocols from the VTYSH command line. For more information about configuring IPv6 dynamic routing protocols on the NetScaler appliance, see the “Dynamic Routing” chapter of the Citrix NetScaler Networking Guide.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ipv6dynamicrouting(String ipv6dynamicrouting) throws Exception{
		this.ipv6dynamicrouting = ipv6dynamicrouting;
	}

	/**
	* <pre>
	* Enable all IPv6 dynamic routing protocols on this VLAN. Possible values: ENABLED, DISABLED Default: DISABLED. Note: For the ENABLED setting to work, you must configure IPv6 dynamic routing protocols from the VTYSH command line. For more information about configuring IPv6 dynamic routing protocols on the NetScaler appliance, see the “Dynamic Routing” chapter of the Citrix NetScaler Networking Guide.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ipv6dynamicrouting() throws Exception {
		return this.ipv6dynamicrouting;
	}

	/**
	* <pre>
	* Temporary flag used for internal purpose.
	* </pre>
	*/
	public Boolean get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Member interfaces of this  bridge group.
	* </pre>
	*/
	public Long get_portbitmap() throws Exception {
		return this.portbitmap;
	}

	/**
	* <pre>
	* Tagged members of this  bridge group.
	* </pre>
	*/
	public Long get_tagbitmap() throws Exception {
		return this.tagbitmap;
	}

	/**
	* <pre>
	* Names of all member interfaces of this bridge group.
	* </pre>
	*/
	public String get_ifaces() throws Exception {
		return this.ifaces;
	}

	/**
	* <pre>
	* Names of all tagged member interfaces of this bridge group.
	* </pre>
	*/
	public String get_tagifaces() throws Exception {
		return this.tagifaces;
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
		bridgegroup_response result = (bridgegroup_response) service.get_payload_formatter().string_to_resource(bridgegroup_response.class, response);
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
		return result.bridgegroup;
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

	/**
	* Use this API to add bridgegroup.
	*/
	public static base_response add(nitro_service client, bridgegroup resource) throws Exception {
		bridgegroup addresource = new bridgegroup();
		addresource.id = resource.id;
		addresource.ipv6dynamicrouting = resource.ipv6dynamicrouting;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add bridgegroup resources.
	*/
	public static base_responses add(nitro_service client, bridgegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgegroup addresources[] = new bridgegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new bridgegroup();
				addresources[i].id = resources[i].id;
				addresources[i].ipv6dynamicrouting = resources[i].ipv6dynamicrouting;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete bridgegroup of given name.
	*/
	public static base_response delete(nitro_service client, Long id) throws Exception {
		bridgegroup deleteresource = new bridgegroup();
		deleteresource.id = id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete bridgegroup.
	*/
	public static base_response delete(nitro_service client, bridgegroup resource) throws Exception {
		bridgegroup deleteresource = new bridgegroup();
		deleteresource.id = resource.id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete bridgegroup resources of given names.
	*/
	public static base_responses delete(nitro_service client, Long id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			bridgegroup deleteresources[] = new bridgegroup[id.length];
			for (int i=0;i<id.length;i++){
				deleteresources[i] = new bridgegroup();
				deleteresources[i].id = id[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete bridgegroup resources.
	*/
	public static base_responses delete(nitro_service client, bridgegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgegroup deleteresources[] = new bridgegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new bridgegroup();
				deleteresources[i].id = resources[i].id;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update bridgegroup.
	*/
	public static base_response update(nitro_service client, bridgegroup resource) throws Exception {
		bridgegroup updateresource = new bridgegroup();
		updateresource.id = resource.id;
		updateresource.ipv6dynamicrouting = resource.ipv6dynamicrouting;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update bridgegroup resources.
	*/
	public static base_responses update(nitro_service client, bridgegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgegroup updateresources[] = new bridgegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new bridgegroup();
				updateresources[i].id = resources[i].id;
				updateresources[i].ipv6dynamicrouting = resources[i].ipv6dynamicrouting;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of bridgegroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, Long id, String args[]) throws Exception {
		bridgegroup unsetresource = new bridgegroup();
		unsetresource.id = id;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of bridgegroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, bridgegroup resource, String[] args) throws Exception{
		bridgegroup unsetresource = new bridgegroup();
		unsetresource.id = resource.id;
		unsetresource.ipv6dynamicrouting = resource.ipv6dynamicrouting;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of bridgegroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Long id[], String args[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			bridgegroup unsetresources[] = new bridgegroup[id.length];
			for (int i=0;i<id.length;i++){
				unsetresources[i] = new bridgegroup();
				unsetresources[i].id = id[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of bridgegroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, bridgegroup resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			bridgegroup unsetresources[] = new bridgegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new bridgegroup();
				unsetresources[i].id = resources[i].id;
				unsetresources[i].ipv6dynamicrouting = resources[i].ipv6dynamicrouting;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the bridgegroup resources that are configured on netscaler.
	*/
	public static bridgegroup[] get(nitro_service service) throws Exception{
		bridgegroup obj = new bridgegroup();
		bridgegroup[] response = (bridgegroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the bridgegroup resources that are configured on netscaler.
	*/
	public static bridgegroup[] get(nitro_service service, options option) throws Exception{
		bridgegroup obj = new bridgegroup();
		bridgegroup[] response = (bridgegroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch bridgegroup resource of given name .
	*/
	public static bridgegroup get(nitro_service service, Long id) throws Exception{
		bridgegroup obj = new bridgegroup();
		obj.set_id(id);
		bridgegroup response = (bridgegroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch bridgegroup resources of given names .
	*/
	public static bridgegroup[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			bridgegroup response[] = new bridgegroup[id.length];
			bridgegroup obj[] = new bridgegroup[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new bridgegroup();
				obj[i].set_id(id[i]);
				response[i] = (bridgegroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of bridgegroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static bridgegroup[] get_filtered(nitro_service service, String filter) throws Exception{
		bridgegroup obj = new bridgegroup();
		options option = new options();
		option.set_filter(filter);
		bridgegroup[] response = (bridgegroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of bridgegroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static bridgegroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		bridgegroup obj = new bridgegroup();
		options option = new options();
		option.set_filter(filter);
		bridgegroup[] response = (bridgegroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the bridgegroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		bridgegroup obj = new bridgegroup();
		options option = new options();
		option.set_count(true);
		bridgegroup[] response = (bridgegroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of bridgegroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		bridgegroup obj = new bridgegroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		bridgegroup[] response = (bridgegroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of bridgegroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		bridgegroup obj = new bridgegroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		bridgegroup[] response = (bridgegroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class ipv6dynamicroutingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
