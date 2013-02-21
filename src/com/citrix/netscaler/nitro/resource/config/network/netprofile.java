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

class netprofile_response extends base_response
{
	public netprofile[] netprofile;
}
/**
* Configuration for Network profile resource.
*/

public class netprofile extends base_resource
{
	private String name;
	private String srcip;
	private Long __count;

	/**
	* <pre>
	* The name of the network profile.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the network profile.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Source IP address or name of the IP set.
	* </pre>
	*/
	public void set_srcip(String srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* Source IP address or name of the IP set.
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		netprofile_response result = (netprofile_response) service.get_payload_formatter().string_to_resource(netprofile_response.class, response);
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
		return result.netprofile;
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
	* Use this API to add netprofile.
	*/
	public static base_response add(nitro_service client, netprofile resource) throws Exception {
		netprofile addresource = new netprofile();
		addresource.name = resource.name;
		addresource.srcip = resource.srcip;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add netprofile resources.
	*/
	public static base_responses add(nitro_service client, netprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			netprofile addresources[] = new netprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new netprofile();
				addresources[i].name = resources[i].name;
				addresources[i].srcip = resources[i].srcip;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete netprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		netprofile deleteresource = new netprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete netprofile.
	*/
	public static base_response delete(nitro_service client, netprofile resource) throws Exception {
		netprofile deleteresource = new netprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete netprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			netprofile deleteresources[] = new netprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new netprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete netprofile resources.
	*/
	public static base_responses delete(nitro_service client, netprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			netprofile deleteresources[] = new netprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new netprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update netprofile.
	*/
	public static base_response update(nitro_service client, netprofile resource) throws Exception {
		netprofile updateresource = new netprofile();
		updateresource.name = resource.name;
		updateresource.srcip = resource.srcip;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update netprofile resources.
	*/
	public static base_responses update(nitro_service client, netprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			netprofile updateresources[] = new netprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new netprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].srcip = resources[i].srcip;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of netprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		netprofile unsetresource = new netprofile();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of netprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, netprofile resource, String[] args) throws Exception{
		netprofile unsetresource = new netprofile();
		unsetresource.name = resource.name;
		unsetresource.srcip = resource.srcip;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of netprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			netprofile unsetresources[] = new netprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new netprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of netprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, netprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			netprofile unsetresources[] = new netprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new netprofile();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].srcip = resources[i].srcip;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the netprofile resources that are configured on netscaler.
	*/
	public static netprofile[] get(nitro_service service) throws Exception{
		netprofile obj = new netprofile();
		netprofile[] response = (netprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the netprofile resources that are configured on netscaler.
	*/
	public static netprofile[] get(nitro_service service, options option) throws Exception{
		netprofile obj = new netprofile();
		netprofile[] response = (netprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch netprofile resource of given name .
	*/
	public static netprofile get(nitro_service service, String name) throws Exception{
		netprofile obj = new netprofile();
		obj.set_name(name);
		netprofile response = (netprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch netprofile resources of given names .
	*/
	public static netprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			netprofile response[] = new netprofile[name.length];
			netprofile obj[] = new netprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new netprofile();
				obj[i].set_name(name[i]);
				response[i] = (netprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of netprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static netprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		netprofile obj = new netprofile();
		options option = new options();
		option.set_filter(filter);
		netprofile[] response = (netprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of netprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static netprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		netprofile obj = new netprofile();
		options option = new options();
		option.set_filter(filter);
		netprofile[] response = (netprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the netprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		netprofile obj = new netprofile();
		options option = new options();
		option.set_count(true);
		netprofile[] response = (netprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of netprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		netprofile obj = new netprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		netprofile[] response = (netprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of netprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		netprofile obj = new netprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		netprofile[] response = (netprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
