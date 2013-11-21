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

class nat64_response extends base_response
{
	public nat64[] nat64;
}
/**
* Configuration for nat64 config resource.
*/

public class nat64 extends base_resource
{
	private String name;
	private String acl6name;
	private String netprofile;
	private Long __count;

	/**
	* <pre>
	* Name of NAT64 rule.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of NAT64 rule.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The ACL6 name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_acl6name(String acl6name) throws Exception{
		this.acl6name = acl6name;
	}

	/**
	* <pre>
	* The ACL6 name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_acl6name() throws Exception {
		return this.acl6name;
	}

	/**
	* <pre>
	* The name of the network profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_netprofile(String netprofile) throws Exception{
		this.netprofile = netprofile;
	}

	/**
	* <pre>
	* The name of the network profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_netprofile() throws Exception {
		return this.netprofile;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nat64_response result = (nat64_response) service.get_payload_formatter().string_to_resource(nat64_response.class, response);
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
		return result.nat64;
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
	* Use this API to add nat64.
	*/
	public static base_response add(nitro_service client, nat64 resource) throws Exception {
		nat64 addresource = new nat64();
		addresource.name = resource.name;
		addresource.acl6name = resource.acl6name;
		addresource.netprofile = resource.netprofile;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nat64 resources.
	*/
	public static base_responses add(nitro_service client, nat64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nat64 addresources[] = new nat64[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nat64();
				addresources[i].name = resources[i].name;
				addresources[i].acl6name = resources[i].acl6name;
				addresources[i].netprofile = resources[i].netprofile;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update nat64.
	*/
	public static base_response update(nitro_service client, nat64 resource) throws Exception {
		nat64 updateresource = new nat64();
		updateresource.name = resource.name;
		updateresource.acl6name = resource.acl6name;
		updateresource.netprofile = resource.netprofile;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nat64 resources.
	*/
	public static base_responses update(nitro_service client, nat64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nat64 updateresources[] = new nat64[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nat64();
				updateresources[i].name = resources[i].name;
				updateresources[i].acl6name = resources[i].acl6name;
				updateresources[i].netprofile = resources[i].netprofile;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nat64 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nat64 resource, String[] args) throws Exception{
		nat64 unsetresource = new nat64();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nat64 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nat64 unsetresources[] = new nat64[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new nat64();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nat64 resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nat64 resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nat64 unsetresources[] = new nat64[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nat64();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to delete nat64 of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		nat64 deleteresource = new nat64();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nat64.
	*/
	public static base_response delete(nitro_service client, nat64 resource) throws Exception {
		nat64 deleteresource = new nat64();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nat64 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nat64 deleteresources[] = new nat64[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new nat64();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nat64 resources.
	*/
	public static base_responses delete(nitro_service client, nat64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nat64 deleteresources[] = new nat64[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nat64();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nat64 resources that are configured on netscaler.
	*/
	public static nat64[] get(nitro_service service) throws Exception{
		nat64 obj = new nat64();
		nat64[] response = (nat64[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nat64 resources that are configured on netscaler.
	*/
	public static nat64[] get(nitro_service service, options option) throws Exception{
		nat64 obj = new nat64();
		nat64[] response = (nat64[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nat64 resource of given name .
	*/
	public static nat64 get(nitro_service service, String name) throws Exception{
		nat64 obj = new nat64();
		obj.set_name(name);
		nat64 response = (nat64) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nat64 resources of given names .
	*/
	public static nat64[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nat64 response[] = new nat64[name.length];
			nat64 obj[] = new nat64[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nat64();
				obj[i].set_name(name[i]);
				response[i] = (nat64) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nat64 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nat64[] get_filtered(nitro_service service, String filter) throws Exception{
		nat64 obj = new nat64();
		options option = new options();
		option.set_filter(filter);
		nat64[] response = (nat64[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nat64 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nat64[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nat64 obj = new nat64();
		options option = new options();
		option.set_filter(filter);
		nat64[] response = (nat64[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nat64 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nat64 obj = new nat64();
		options option = new options();
		option.set_count(true);
		nat64[] response = (nat64[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nat64 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nat64 obj = new nat64();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nat64[] response = (nat64[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nat64 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nat64 obj = new nat64();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nat64[] response = (nat64[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
