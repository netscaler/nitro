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

class linkset_response extends base_response
{
	public linkset[] linkset;
}
/**
* Configuration for link set resource.
*/

public class linkset extends base_resource
{
	private String id;

	//------- Read only Parameter ---------;

	private String ifnum;
	private Long __count;

	/**
	* <pre>
	* A unique identifier of the linkset. It must be of the form LS/x, where x can be an integer from 1 to 32.
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* A unique identifier of the linkset. It must be of the form LS/x, where x can be an integer from 1 to 32.
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The interfaces to be bound to the linkset.
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		linkset_response result = (linkset_response) service.get_payload_formatter().string_to_resource(linkset_response.class, response);
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
		return result.linkset;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.id;
	}

	/**
	* Use this API to add linkset.
	*/
	public static base_response add(nitro_service client, linkset resource) throws Exception {
		linkset addresource = new linkset();
		addresource.id = resource.id;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add linkset resources.
	*/
	public static base_responses add(nitro_service client, linkset resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			linkset addresources[] = new linkset[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new linkset();
				addresources[i].id = resources[i].id;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete linkset of given name.
	*/
	public static base_response delete(nitro_service client, String id) throws Exception {
		linkset deleteresource = new linkset();
		deleteresource.id = id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete linkset.
	*/
	public static base_response delete(nitro_service client, linkset resource) throws Exception {
		linkset deleteresource = new linkset();
		deleteresource.id = resource.id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete linkset resources of given names.
	*/
	public static base_responses delete(nitro_service client, String id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			linkset deleteresources[] = new linkset[id.length];
			for (int i=0;i<id.length;i++){
				deleteresources[i] = new linkset();
				deleteresources[i].id = id[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete linkset resources.
	*/
	public static base_responses delete(nitro_service client, linkset resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			linkset deleteresources[] = new linkset[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new linkset();
				deleteresources[i].id = resources[i].id;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the linkset resources that are configured on netscaler.
	*/
	public static linkset[] get(nitro_service service) throws Exception{
		linkset obj = new linkset();
		linkset[] response = (linkset[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the linkset resources that are configured on netscaler.
	*/
	public static linkset[] get(nitro_service service, options option) throws Exception{
		linkset obj = new linkset();
		linkset[] response = (linkset[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch linkset resource of given name .
	*/
	public static linkset get(nitro_service service, String id) throws Exception{
		linkset obj = new linkset();
		obj.set_id(id);
		linkset response = (linkset) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch linkset resources of given names .
	*/
	public static linkset[] get(nitro_service service, String id[]) throws Exception{
		if (id !=null && id.length>0) {
			linkset response[] = new linkset[id.length];
			linkset obj[] = new linkset[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new linkset();
				obj[i].set_id(id[i]);
				response[i] = (linkset) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of linkset resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static linkset[] get_filtered(nitro_service service, String filter) throws Exception{
		linkset obj = new linkset();
		options option = new options();
		option.set_filter(filter);
		linkset[] response = (linkset[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of linkset resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static linkset[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		linkset obj = new linkset();
		options option = new options();
		option.set_filter(filter);
		linkset[] response = (linkset[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the linkset resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		linkset obj = new linkset();
		options option = new options();
		option.set_count(true);
		linkset[] response = (linkset[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of linkset resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		linkset obj = new linkset();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		linkset[] response = (linkset[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of linkset resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		linkset obj = new linkset();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		linkset[] response = (linkset[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
