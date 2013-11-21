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

class rnat6_response extends base_response
{
	public rnat6[] rnat6;
}
/**
* Configuration for IPv6 RNAT configured route resource.
*/

public class rnat6 extends base_resource
{
	private String name;
	private String network;
	private String acl6name;
	private Integer redirectport;
	private Long __count;

	/**
	* <pre>
	* Name for the RNAT6 rule. Must begin with a letter, number, or the underscore character (_), and can consist of letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore characters. Cannot be changed after the rule is created. Choose a name that helps identify the RNAT6 rule.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the RNAT6 rule. Must begin with a letter, number, or the underscore character (_), and can consist of letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore characters. Cannot be changed after the rule is created. Choose a name that helps identify the RNAT6 rule.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* IPv6 address of the network on whose traffic you want the NetScaler appliance to do RNAT processing.<br> Minimum length =  1
	* </pre>
	*/
	public void set_network(String network) throws Exception{
		this.network = network;
	}

	/**
	* <pre>
	* IPv6 address of the network on whose traffic you want the NetScaler appliance to do RNAT processing.<br> Minimum length =  1
	* </pre>
	*/
	public String get_network() throws Exception {
		return this.network;
	}

	/**
	* <pre>
	* Name of any configured ACL6 whose action is ALLOW. The rule of the ACL6 is used as an RNAT6 rule.<br> Minimum length =  1
	* </pre>
	*/
	public void set_acl6name(String acl6name) throws Exception{
		this.acl6name = acl6name;
	}

	/**
	* <pre>
	* Name of any configured ACL6 whose action is ALLOW. The rule of the ACL6 is used as an RNAT6 rule.<br> Minimum length =  1
	* </pre>
	*/
	public String get_acl6name() throws Exception {
		return this.acl6name;
	}

	/**
	* <pre>
	* Port number to which the IPv6 packets are redirected. Applicable to TCP and UDP protocols.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_redirectport(int redirectport) throws Exception {
		this.redirectport = new Integer(redirectport);
	}

	/**
	* <pre>
	* Port number to which the IPv6 packets are redirected. Applicable to TCP and UDP protocols.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_redirectport(Integer redirectport) throws Exception{
		this.redirectport = redirectport;
	}

	/**
	* <pre>
	* Port number to which the IPv6 packets are redirected. Applicable to TCP and UDP protocols.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Integer get_redirectport() throws Exception {
		return this.redirectport;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rnat6_response result = (rnat6_response) service.get_payload_formatter().string_to_resource(rnat6_response.class, response);
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
		return result.rnat6;
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
	* Use this API to add rnat6.
	*/
	public static base_response add(nitro_service client, rnat6 resource) throws Exception {
		rnat6 addresource = new rnat6();
		addresource.name = resource.name;
		addresource.network = resource.network;
		addresource.acl6name = resource.acl6name;
		addresource.redirectport = resource.redirectport;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add rnat6 resources.
	*/
	public static base_responses add(nitro_service client, rnat6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat6 addresources[] = new rnat6[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new rnat6();
				addresources[i].name = resources[i].name;
				addresources[i].network = resources[i].network;
				addresources[i].acl6name = resources[i].acl6name;
				addresources[i].redirectport = resources[i].redirectport;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update rnat6.
	*/
	public static base_response update(nitro_service client, rnat6 resource) throws Exception {
		rnat6 updateresource = new rnat6();
		updateresource.name = resource.name;
		updateresource.redirectport = resource.redirectport;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update rnat6 resources.
	*/
	public static base_responses update(nitro_service client, rnat6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat6 updateresources[] = new rnat6[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new rnat6();
				updateresources[i].name = resources[i].name;
				updateresources[i].redirectport = resources[i].redirectport;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of rnat6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		rnat6 unsetresource = new rnat6();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of rnat6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, rnat6 resource, String[] args) throws Exception{
		rnat6 unsetresource = new rnat6();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of rnat6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			rnat6 unsetresources[] = new rnat6[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new rnat6();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of rnat6 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, rnat6 resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat6 unsetresources[] = new rnat6[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new rnat6();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to clear rnat6.
	*/
	public static base_response clear(nitro_service client, rnat6 resource) throws Exception {
		rnat6 clearresource = new rnat6();
		clearresource.name = resource.name;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear rnat6 resources.
	*/
	public static base_responses clear(nitro_service client, rnat6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rnat6 clearresources[] = new rnat6[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new rnat6();
				clearresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to fetch all the rnat6 resources that are configured on netscaler.
	*/
	public static rnat6[] get(nitro_service service) throws Exception{
		rnat6 obj = new rnat6();
		rnat6[] response = (rnat6[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the rnat6 resources that are configured on netscaler.
	*/
	public static rnat6[] get(nitro_service service, options option) throws Exception{
		rnat6 obj = new rnat6();
		rnat6[] response = (rnat6[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch rnat6 resource of given name .
	*/
	public static rnat6 get(nitro_service service, String name) throws Exception{
		rnat6 obj = new rnat6();
		obj.set_name(name);
		rnat6 response = (rnat6) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch rnat6 resources of given names .
	*/
	public static rnat6[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			rnat6 response[] = new rnat6[name.length];
			rnat6 obj[] = new rnat6[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new rnat6();
				obj[i].set_name(name[i]);
				response[i] = (rnat6) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of rnat6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static rnat6[] get_filtered(nitro_service service, String filter) throws Exception{
		rnat6 obj = new rnat6();
		options option = new options();
		option.set_filter(filter);
		rnat6[] response = (rnat6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rnat6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static rnat6[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rnat6 obj = new rnat6();
		options option = new options();
		option.set_filter(filter);
		rnat6[] response = (rnat6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the rnat6 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		rnat6 obj = new rnat6();
		options option = new options();
		option.set_count(true);
		rnat6[] response = (rnat6[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of rnat6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		rnat6 obj = new rnat6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rnat6[] response = (rnat6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rnat6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rnat6 obj = new rnat6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rnat6[] response = (rnat6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
