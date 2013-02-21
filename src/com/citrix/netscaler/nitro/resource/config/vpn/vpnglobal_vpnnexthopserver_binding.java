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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnglobal_vpnnexthopserver_binding_response extends base_response
{
	public vpnglobal_vpnnexthopserver_binding[] vpnglobal_vpnnexthopserver_binding;
}
/**
	* Binding class showing the vpnnexthopserver that can be bound to vpnglobal.
	*/

public class vpnglobal_vpnnexthopserver_binding extends base_resource
{
	private String nexthopserver;
	private Long __count;

	/**
	* <pre>
	* The name of the next hop server bound to vpn global.
	* </pre>
	*/
	public void set_nexthopserver(String nexthopserver) throws Exception{
		this.nexthopserver = nexthopserver;
	}

	/**
	* <pre>
	* The name of the next hop server bound to vpn global.
	* </pre>
	*/
	public String get_nexthopserver() throws Exception {
		return this.nexthopserver;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnglobal_vpnnexthopserver_binding_response result = (vpnglobal_vpnnexthopserver_binding_response) service.get_payload_formatter().string_to_resource(vpnglobal_vpnnexthopserver_binding_response.class, response);
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
		return result.vpnglobal_vpnnexthopserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, vpnglobal_vpnnexthopserver_binding resource) throws Exception {
		vpnglobal_vpnnexthopserver_binding updateresource = new vpnglobal_vpnnexthopserver_binding();
		updateresource.nexthopserver = resource.nexthopserver;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vpnglobal_vpnnexthopserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnglobal_vpnnexthopserver_binding updateresources[] = new vpnglobal_vpnnexthopserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnglobal_vpnnexthopserver_binding();
				updateresources[i].nexthopserver = resources[i].nexthopserver;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vpnglobal_vpnnexthopserver_binding resource) throws Exception {
		vpnglobal_vpnnexthopserver_binding deleteresource = new vpnglobal_vpnnexthopserver_binding();
		deleteresource.nexthopserver = resource.nexthopserver;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vpnglobal_vpnnexthopserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnglobal_vpnnexthopserver_binding deleteresources[] = new vpnglobal_vpnnexthopserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnglobal_vpnnexthopserver_binding();
				deleteresources[i].nexthopserver = resources[i].nexthopserver;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a vpnglobal_vpnnexthopserver_binding resources.
	*/
	public static vpnglobal_vpnnexthopserver_binding[] get(nitro_service service) throws Exception{
		vpnglobal_vpnnexthopserver_binding obj = new vpnglobal_vpnnexthopserver_binding();
		vpnglobal_vpnnexthopserver_binding response[] = (vpnglobal_vpnnexthopserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnglobal_vpnnexthopserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnglobal_vpnnexthopserver_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnglobal_vpnnexthopserver_binding obj = new vpnglobal_vpnnexthopserver_binding();
		options option = new options();
		option.set_filter(filter);
		vpnglobal_vpnnexthopserver_binding[] response = (vpnglobal_vpnnexthopserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnglobal_vpnnexthopserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnglobal_vpnnexthopserver_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnglobal_vpnnexthopserver_binding obj = new vpnglobal_vpnnexthopserver_binding();
		options option = new options();
		option.set_filter(filter);
		vpnglobal_vpnnexthopserver_binding[] response = (vpnglobal_vpnnexthopserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpnglobal_vpnnexthopserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnglobal_vpnnexthopserver_binding obj = new vpnglobal_vpnnexthopserver_binding();
		options option = new options();
		option.set_count(true);
		vpnglobal_vpnnexthopserver_binding response[] = (vpnglobal_vpnnexthopserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnglobal_vpnnexthopserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnglobal_vpnnexthopserver_binding obj = new vpnglobal_vpnnexthopserver_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnglobal_vpnnexthopserver_binding[] response = (vpnglobal_vpnnexthopserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnglobal_vpnnexthopserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnglobal_vpnnexthopserver_binding obj = new vpnglobal_vpnnexthopserver_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnglobal_vpnnexthopserver_binding[] response = (vpnglobal_vpnnexthopserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}