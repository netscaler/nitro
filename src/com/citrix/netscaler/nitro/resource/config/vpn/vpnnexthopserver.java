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

class vpnnexthopserver_response extends base_response
{
	public vpnnexthopserver[] vpnnexthopserver;
}
/**
* Configuration for Next Hop Server resource.
*/

public class vpnnexthopserver extends base_resource
{
	private String name;
	private String nexthopip;
	private Integer nexthopport;
	private String secure;
	private Long __count;

	/**
	* <pre>
	* Configures new vpn next hop server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Configures new vpn next hop server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Configures next hop IP address.
	* </pre>
	*/
	public void set_nexthopip(String nexthopip) throws Exception{
		this.nexthopip = nexthopip;
	}

	/**
	* <pre>
	* Configures next hop IP address.
	* </pre>
	*/
	public String get_nexthopip() throws Exception {
		return this.nexthopip;
	}

	/**
	* <pre>
	* Configures next hop port number.
	* </pre>
	*/
	public void set_nexthopport(int nexthopport) throws Exception {
		this.nexthopport = new Integer(nexthopport);
	}

	/**
	* <pre>
	* Configures next hop port number.
	* </pre>
	*/
	public void set_nexthopport(Integer nexthopport) throws Exception{
		this.nexthopport = nexthopport;
	}

	/**
	* <pre>
	* Configures next hop port number.
	* </pre>
	*/
	public Integer get_nexthopport() throws Exception {
		return this.nexthopport;
	}

	/**
	* <pre>
	* Configures next hop over secure connection.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_secure(String secure) throws Exception{
		this.secure = secure;
	}

	/**
	* <pre>
	* Configures next hop over secure connection.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_secure() throws Exception {
		return this.secure;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnnexthopserver_response result = (vpnnexthopserver_response) service.get_payload_formatter().string_to_resource(vpnnexthopserver_response.class, response);
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
		return result.vpnnexthopserver;
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
	* Use this API to add vpnnexthopserver.
	*/
	public static base_response add(nitro_service client, vpnnexthopserver resource) throws Exception {
		vpnnexthopserver addresource = new vpnnexthopserver();
		addresource.name = resource.name;
		addresource.nexthopip = resource.nexthopip;
		addresource.nexthopport = resource.nexthopport;
		addresource.secure = resource.secure;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnnexthopserver resources.
	*/
	public static base_responses add(nitro_service client, vpnnexthopserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnnexthopserver addresources[] = new vpnnexthopserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnnexthopserver();
				addresources[i].name = resources[i].name;
				addresources[i].nexthopip = resources[i].nexthopip;
				addresources[i].nexthopport = resources[i].nexthopport;
				addresources[i].secure = resources[i].secure;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnnexthopserver of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpnnexthopserver deleteresource = new vpnnexthopserver();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnnexthopserver.
	*/
	public static base_response delete(nitro_service client, vpnnexthopserver resource) throws Exception {
		vpnnexthopserver deleteresource = new vpnnexthopserver();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnnexthopserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnnexthopserver deleteresources[] = new vpnnexthopserver[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpnnexthopserver();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnnexthopserver resources.
	*/
	public static base_responses delete(nitro_service client, vpnnexthopserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnnexthopserver deleteresources[] = new vpnnexthopserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnnexthopserver();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpnnexthopserver resources that are configured on netscaler.
	*/
	public static vpnnexthopserver[] get(nitro_service service) throws Exception{
		vpnnexthopserver obj = new vpnnexthopserver();
		vpnnexthopserver[] response = (vpnnexthopserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnnexthopserver resources that are configured on netscaler.
	*/
	public static vpnnexthopserver[] get(nitro_service service, options option) throws Exception{
		vpnnexthopserver obj = new vpnnexthopserver();
		vpnnexthopserver[] response = (vpnnexthopserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnnexthopserver resource of given name .
	*/
	public static vpnnexthopserver get(nitro_service service, String name) throws Exception{
		vpnnexthopserver obj = new vpnnexthopserver();
		obj.set_name(name);
		vpnnexthopserver response = (vpnnexthopserver) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnnexthopserver resources of given names .
	*/
	public static vpnnexthopserver[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpnnexthopserver response[] = new vpnnexthopserver[name.length];
			vpnnexthopserver obj[] = new vpnnexthopserver[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpnnexthopserver();
				obj[i].set_name(name[i]);
				response[i] = (vpnnexthopserver) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnnexthopserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnnexthopserver[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnnexthopserver obj = new vpnnexthopserver();
		options option = new options();
		option.set_filter(filter);
		vpnnexthopserver[] response = (vpnnexthopserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnnexthopserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnnexthopserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnnexthopserver obj = new vpnnexthopserver();
		options option = new options();
		option.set_filter(filter);
		vpnnexthopserver[] response = (vpnnexthopserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnnexthopserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnnexthopserver obj = new vpnnexthopserver();
		options option = new options();
		option.set_count(true);
		vpnnexthopserver[] response = (vpnnexthopserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnnexthopserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnnexthopserver obj = new vpnnexthopserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnnexthopserver[] response = (vpnnexthopserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnnexthopserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnnexthopserver obj = new vpnnexthopserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnnexthopserver[] response = (vpnnexthopserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class secureEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
