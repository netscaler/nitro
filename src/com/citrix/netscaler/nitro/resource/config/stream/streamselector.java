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

package com.citrix.netscaler.nitro.resource.config.stream;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class streamselector_response extends base_response
{
	public streamselector[] streamselector;
}
/**
* Configuration for selector resource.
*/

public class streamselector extends base_resource
{
	private String name;
	private String[] rule;

	//------- Read only Parameter ---------;

	private Long flags;
	private Long __count;

	/**
	* <pre>
	* The name of stream selector.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of stream selector.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The set of PIXL expressions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String[] rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The set of PIXL expressions.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		streamselector_response result = (streamselector_response) service.get_payload_formatter().string_to_resource(streamselector_response.class, response);
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
		return result.streamselector;
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
	* Use this API to add streamselector.
	*/
	public static base_response add(nitro_service client, streamselector resource) throws Exception {
		streamselector addresource = new streamselector();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add streamselector resources.
	*/
	public static base_responses add(nitro_service client, streamselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			streamselector addresources[] = new streamselector[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new streamselector();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update streamselector.
	*/
	public static base_response update(nitro_service client, streamselector resource) throws Exception {
		streamselector updateresource = new streamselector();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update streamselector resources.
	*/
	public static base_responses update(nitro_service client, streamselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			streamselector updateresources[] = new streamselector[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new streamselector();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to delete streamselector of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		streamselector deleteresource = new streamselector();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete streamselector.
	*/
	public static base_response delete(nitro_service client, streamselector resource) throws Exception {
		streamselector deleteresource = new streamselector();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete streamselector resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			streamselector deleteresources[] = new streamselector[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new streamselector();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete streamselector resources.
	*/
	public static base_responses delete(nitro_service client, streamselector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			streamselector deleteresources[] = new streamselector[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new streamselector();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the streamselector resources that are configured on netscaler.
	*/
	public static streamselector[] get(nitro_service service) throws Exception{
		streamselector obj = new streamselector();
		streamselector[] response = (streamselector[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the streamselector resources that are configured on netscaler.
	*/
	public static streamselector[] get(nitro_service service, options option) throws Exception{
		streamselector obj = new streamselector();
		streamselector[] response = (streamselector[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch streamselector resource of given name .
	*/
	public static streamselector get(nitro_service service, String name) throws Exception{
		streamselector obj = new streamselector();
		obj.set_name(name);
		streamselector response = (streamselector) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch streamselector resources of given names .
	*/
	public static streamselector[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			streamselector response[] = new streamselector[name.length];
			streamselector obj[] = new streamselector[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new streamselector();
				obj[i].set_name(name[i]);
				response[i] = (streamselector) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of streamselector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static streamselector[] get_filtered(nitro_service service, String filter) throws Exception{
		streamselector obj = new streamselector();
		options option = new options();
		option.set_filter(filter);
		streamselector[] response = (streamselector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of streamselector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static streamselector[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		streamselector obj = new streamselector();
		options option = new options();
		option.set_filter(filter);
		streamselector[] response = (streamselector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the streamselector resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		streamselector obj = new streamselector();
		options option = new options();
		option.set_count(true);
		streamselector[] response = (streamselector[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of streamselector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		streamselector obj = new streamselector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		streamselector[] response = (streamselector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of streamselector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		streamselector obj = new streamselector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		streamselector[] response = (streamselector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
