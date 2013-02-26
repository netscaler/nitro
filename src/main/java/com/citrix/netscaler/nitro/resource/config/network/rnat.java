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

class rnat_response extends base_response
{
	public rnat[] rnat;
}
/**
* Configuration for RNAT configured route resource.
*/

public class rnat extends base_resource
{
	private String network;
	private String netmask;
	private String aclname;
	private Boolean redirectport;
	private String natip;
	private String natip2;
	private Long __count;

	/**
	* <pre>
	* The network address defined for the RNAT entry.<br> Minimum length =  1
	* </pre>
	*/
	public void set_network(String network) throws Exception{
		this.network = network;
	}

	/**
	* <pre>
	* The network address defined for the RNAT entry.<br> Minimum length =  1
	* </pre>
	*/
	public String get_network() throws Exception {
		return this.network;
	}

	/**
	* <pre>
	* The subnet mask for the network address.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The subnet mask for the network address.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* An extended ACL defined for the RNAT entry.<br> Minimum length =  1
	* </pre>
	*/
	public void set_aclname(String aclname) throws Exception{
		this.aclname = aclname;
	}

	/**
	* <pre>
	* An extended ACL defined for the RNAT entry.<br> Minimum length =  1
	* </pre>
	*/
	public String get_aclname() throws Exception {
		return this.aclname;
	}

	/**
	* <pre>
	* Port number to which the packets are redirected. Applicable to TCP and UDP protocols.
	* </pre>
	*/
	public void set_redirectport(boolean redirectport) throws Exception {
		this.redirectport = new Boolean(redirectport);
	}

	/**
	* <pre>
	* Port number to which the packets are redirected. Applicable to TCP and UDP protocols.
	* </pre>
	*/
	public void set_redirectport(Boolean redirectport) throws Exception{
		this.redirectport = redirectport;
	}

	/**
	* <pre>
	* Port number to which the packets are redirected. Applicable to TCP and UDP protocols.
	* </pre>
	*/
	public Boolean get_redirectport() throws Exception {
		return this.redirectport;
	}

	/**
	* <pre>
	* The NAT IP address defined for the RNAT entry. .<br> Minimum length =  1
	* </pre>
	*/
	public void set_natip(String natip) throws Exception{
		this.natip = natip;
	}

	/**
	* <pre>
	* The NAT IP address defined for the RNAT entry. .<br> Minimum length =  1
	* </pre>
	*/
	public String get_natip() throws Exception {
		return this.natip;
	}

	/**
	* <pre>
	* The NAT IP(s) assigned to the RNAT.<br> Minimum length =  1
	* </pre>
	*/
	public void set_natip2(String natip2) throws Exception{
		this.natip2 = natip2;
	}

	/**
	* <pre>
	* The NAT IP(s) assigned to the RNAT.<br> Minimum length =  1
	* </pre>
	*/
	public String get_natip2() throws Exception {
		return this.natip2;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rnat_response result = (rnat_response) service.get_payload_formatter().string_to_resource(rnat_response.class, response);
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
		return result.rnat;
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
	* Use this API to clear rnat.
	*/
	public static base_response clear(nitro_service client, rnat resource) throws Exception {
		rnat clearresource = new rnat();
		clearresource.network = resource.network;
		clearresource.netmask = resource.netmask;
		clearresource.aclname = resource.aclname;
		clearresource.redirectport = resource.redirectport;
		clearresource.natip = resource.natip;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear rnat resources.
	*/
	public static base_responses clear(nitro_service client, rnat resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat clearresources[] = new rnat[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new rnat();
				clearresources[i].network = resources[i].network;
				clearresources[i].netmask = resources[i].netmask;
				clearresources[i].aclname = resources[i].aclname;
				clearresources[i].redirectport = resources[i].redirectport;
				clearresources[i].natip = resources[i].natip;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to update rnat.
	*/
	public static base_response update(nitro_service client, rnat resource) throws Exception {
		rnat updateresource = new rnat();
		updateresource.network = resource.network;
		updateresource.netmask = resource.netmask;
		updateresource.natip = resource.natip;
		updateresource.aclname = resource.aclname;
		updateresource.redirectport = resource.redirectport;
		updateresource.natip2 = resource.natip2;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update rnat resources.
	*/
	public static base_responses update(nitro_service client, rnat resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat updateresources[] = new rnat[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new rnat();
				updateresources[i].network = resources[i].network;
				updateresources[i].netmask = resources[i].netmask;
				updateresources[i].natip = resources[i].natip;
				updateresources[i].aclname = resources[i].aclname;
				updateresources[i].redirectport = resources[i].redirectport;
				updateresources[i].natip2 = resources[i].natip2;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of rnat resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, rnat resource, String[] args) throws Exception{
		rnat unsetresource = new rnat();
		unsetresource.network = resource.network;
		unsetresource.netmask = resource.netmask;
		unsetresource.aclname = resource.aclname;
		unsetresource.redirectport = resource.redirectport;
		unsetresource.natip = resource.natip;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of rnat resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, rnat resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat unsetresources[] = new rnat[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new rnat();
				unsetresources[i].network = resources[i].network;
				unsetresources[i].netmask = resources[i].netmask;
				unsetresources[i].aclname = resources[i].aclname;
				unsetresources[i].redirectport = resources[i].redirectport;
				unsetresources[i].natip = resources[i].natip;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the rnat resources that are configured on netscaler.
	*/
	public static rnat[] get(nitro_service service) throws Exception{
		rnat obj = new rnat();
		rnat[] response = (rnat[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the rnat resources that are configured on netscaler.
	*/
	public static rnat[] get(nitro_service service, options option) throws Exception{
		rnat obj = new rnat();
		rnat[] response = (rnat[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of rnat resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static rnat[] get_filtered(nitro_service service, String filter) throws Exception{
		rnat obj = new rnat();
		options option = new options();
		option.set_filter(filter);
		rnat[] response = (rnat[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rnat resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static rnat[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rnat obj = new rnat();
		options option = new options();
		option.set_filter(filter);
		rnat[] response = (rnat[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the rnat resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		rnat obj = new rnat();
		options option = new options();
		option.set_count(true);
		rnat[] response = (rnat[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of rnat resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		rnat obj = new rnat();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rnat[] response = (rnat[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rnat resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rnat obj = new rnat();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rnat[] response = (rnat[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
