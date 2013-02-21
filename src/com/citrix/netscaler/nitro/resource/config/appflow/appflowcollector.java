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

package com.citrix.netscaler.nitro.resource.config.appflow;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appflowcollector_response extends base_response
{
	public appflowcollector[] appflowcollector;
}
/**
* Configuration for AppFlow collector resource.
*/

public class appflowcollector extends base_resource
{
	private String name;
	private String ipaddress;
	private Integer port;
	private String netprofile;
	private String newname;
	private Long __count;

	/**
	* <pre>
	* Name of the AppFlow collector.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the AppFlow collector.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The IPv4 address of the AppFlow collector.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The IPv4 address of the AppFlow collector.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* The UDP port on which the AppFlow collector is listening.<br> Default value: 4739
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* The UDP port on which the AppFlow collector is listening.<br> Default value: 4739
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* The UDP port on which the AppFlow collector is listening.<br> Default value: 4739
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The IP address associated with this netprofile will be used as source IP for appflow traffic to this collector.<br> Maximum length =  128
	* </pre>
	*/
	public void set_netprofile(String netprofile) throws Exception{
		this.netprofile = netprofile;
	}

	/**
	* <pre>
	* The IP address associated with this netprofile will be used as source IP for appflow traffic to this collector.<br> Maximum length =  128
	* </pre>
	*/
	public String get_netprofile() throws Exception {
		return this.netprofile;
	}

	/**
	* <pre>
	* The new name of the AppFlow collector.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the AppFlow collector.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appflowcollector_response result = (appflowcollector_response) service.get_payload_formatter().string_to_resource(appflowcollector_response.class, response);
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
		return result.appflowcollector;
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
	* Use this API to add appflowcollector.
	*/
	public static base_response add(nitro_service client, appflowcollector resource) throws Exception {
		appflowcollector addresource = new appflowcollector();
		addresource.name = resource.name;
		addresource.ipaddress = resource.ipaddress;
		addresource.port = resource.port;
		addresource.netprofile = resource.netprofile;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appflowcollector resources.
	*/
	public static base_responses add(nitro_service client, appflowcollector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowcollector addresources[] = new appflowcollector[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appflowcollector();
				addresources[i].name = resources[i].name;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].port = resources[i].port;
				addresources[i].netprofile = resources[i].netprofile;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appflowcollector of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appflowcollector deleteresource = new appflowcollector();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appflowcollector.
	*/
	public static base_response delete(nitro_service client, appflowcollector resource) throws Exception {
		appflowcollector deleteresource = new appflowcollector();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appflowcollector resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appflowcollector deleteresources[] = new appflowcollector[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appflowcollector();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appflowcollector resources.
	*/
	public static base_responses delete(nitro_service client, appflowcollector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowcollector deleteresources[] = new appflowcollector[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appflowcollector();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a appflowcollector resource.
	*/
	public static base_response rename(nitro_service client, appflowcollector resource, String new_name) throws Exception {
		appflowcollector renameresource = new appflowcollector();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a appflowcollector resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		appflowcollector renameresource = new appflowcollector();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the appflowcollector resources that are configured on netscaler.
	*/
	public static appflowcollector[] get(nitro_service service) throws Exception{
		appflowcollector obj = new appflowcollector();
		appflowcollector[] response = (appflowcollector[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appflowcollector resources that are configured on netscaler.
	*/
	public static appflowcollector[] get(nitro_service service, options option) throws Exception{
		appflowcollector obj = new appflowcollector();
		appflowcollector[] response = (appflowcollector[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appflowcollector resource of given name .
	*/
	public static appflowcollector get(nitro_service service, String name) throws Exception{
		appflowcollector obj = new appflowcollector();
		obj.set_name(name);
		appflowcollector response = (appflowcollector) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appflowcollector resources of given names .
	*/
	public static appflowcollector[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appflowcollector response[] = new appflowcollector[name.length];
			appflowcollector obj[] = new appflowcollector[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appflowcollector();
				obj[i].set_name(name[i]);
				response[i] = (appflowcollector) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appflowcollector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appflowcollector[] get_filtered(nitro_service service, String filter) throws Exception{
		appflowcollector obj = new appflowcollector();
		options option = new options();
		option.set_filter(filter);
		appflowcollector[] response = (appflowcollector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appflowcollector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appflowcollector[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appflowcollector obj = new appflowcollector();
		options option = new options();
		option.set_filter(filter);
		appflowcollector[] response = (appflowcollector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appflowcollector resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appflowcollector obj = new appflowcollector();
		options option = new options();
		option.set_count(true);
		appflowcollector[] response = (appflowcollector[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appflowcollector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appflowcollector obj = new appflowcollector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appflowcollector[] response = (appflowcollector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appflowcollector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appflowcollector obj = new appflowcollector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appflowcollector[] response = (appflowcollector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
