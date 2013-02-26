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

package com.citrix.netscaler.nitro.resource.config.policy;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class policydataset_response extends base_response
{
	public policydataset[] policydataset;
}
/**
* Configuration for TYPE set resource.
*/

public class policydataset extends base_resource
{
	private String name;
	private String type;

	//------- Read only Parameter ---------;

	private String description;
	private String indextype;
	private Long __count;

	/**
	* <pre>
	* The name of the set. The name must not exceed 127 characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the set. The name must not exceed 127 characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The type of set: ipv4, ipv6, number.<br> Possible values = ipv4, number, ipv6
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of set: ipv4, ipv6, number.<br> Possible values = ipv4, number, ipv6
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Description of the set.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* Index type.<br> Possible values = Auto-generated, User-defined
	* </pre>
	*/
	public String get_indextype() throws Exception {
		return this.indextype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		policydataset_response result = (policydataset_response) service.get_payload_formatter().string_to_resource(policydataset_response.class, response);
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
		return result.policydataset;
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
	* Use this API to add policydataset.
	*/
	public static base_response add(nitro_service client, policydataset resource) throws Exception {
		policydataset addresource = new policydataset();
		addresource.name = resource.name;
		addresource.type = resource.type;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add policydataset resources.
	*/
	public static base_responses add(nitro_service client, policydataset resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policydataset addresources[] = new policydataset[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new policydataset();
				addresources[i].name = resources[i].name;
				addresources[i].type = resources[i].type;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete policydataset of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		policydataset deleteresource = new policydataset();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policydataset.
	*/
	public static base_response delete(nitro_service client, policydataset resource) throws Exception {
		policydataset deleteresource = new policydataset();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policydataset resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			policydataset deleteresources[] = new policydataset[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new policydataset();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete policydataset resources.
	*/
	public static base_responses delete(nitro_service client, policydataset resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policydataset deleteresources[] = new policydataset[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new policydataset();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the policydataset resources that are configured on netscaler.
	*/
	public static policydataset[] get(nitro_service service) throws Exception{
		policydataset obj = new policydataset();
		policydataset[] response = (policydataset[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the policydataset resources that are configured on netscaler.
	*/
	public static policydataset[] get(nitro_service service, options option) throws Exception{
		policydataset obj = new policydataset();
		policydataset[] response = (policydataset[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch policydataset resource of given name .
	*/
	public static policydataset get(nitro_service service, String name) throws Exception{
		policydataset obj = new policydataset();
		obj.set_name(name);
		policydataset response = (policydataset) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch policydataset resources of given names .
	*/
	public static policydataset[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			policydataset response[] = new policydataset[name.length];
			policydataset obj[] = new policydataset[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new policydataset();
				obj[i].set_name(name[i]);
				response[i] = (policydataset) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of policydataset resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static policydataset[] get_filtered(nitro_service service, String filter) throws Exception{
		policydataset obj = new policydataset();
		options option = new options();
		option.set_filter(filter);
		policydataset[] response = (policydataset[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policydataset resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static policydataset[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policydataset obj = new policydataset();
		options option = new options();
		option.set_filter(filter);
		policydataset[] response = (policydataset[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the policydataset resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		policydataset obj = new policydataset();
		options option = new options();
		option.set_count(true);
		policydataset[] response = (policydataset[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of policydataset resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		policydataset obj = new policydataset();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policydataset[] response = (policydataset[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policydataset resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policydataset obj = new policydataset();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policydataset[] response = (policydataset[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String ipv4 = "ipv4";
		public static final String number = "number";
		public static final String ipv6 = "ipv6";
	}
	public static class indextypeEnum {
		public static final String Auto_generated = "Auto-generated";
		public static final String User_defined = "User-defined";
	}
}
