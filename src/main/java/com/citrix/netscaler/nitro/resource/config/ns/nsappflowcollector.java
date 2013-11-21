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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsappflowcollector_response extends base_response
{
	public nsappflowcollector[] nsappflowcollector;
}
/**
* Configuration for appflowCollector resource.
*/

public class nsappflowcollector extends base_resource
{
	private String name;
	private String ipaddress;
	private Integer port;
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsappflowcollector_response result = (nsappflowcollector_response) service.get_payload_formatter().string_to_resource(nsappflowcollector_response.class, response);
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
		return result.nsappflowcollector;
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
	* Use this API to add nsappflowcollector.
	*/
	public static base_response add(nitro_service client, nsappflowcollector resource) throws Exception {
		nsappflowcollector addresource = new nsappflowcollector();
		addresource.name = resource.name;
		addresource.ipaddress = resource.ipaddress;
		addresource.port = resource.port;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nsappflowcollector resources.
	*/
	public static base_responses add(nitro_service client, nsappflowcollector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsappflowcollector addresources[] = new nsappflowcollector[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nsappflowcollector();
				addresources[i].name = resources[i].name;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].port = resources[i].port;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsappflowcollector of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		nsappflowcollector deleteresource = new nsappflowcollector();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsappflowcollector.
	*/
	public static base_response delete(nitro_service client, nsappflowcollector resource) throws Exception {
		nsappflowcollector deleteresource = new nsappflowcollector();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsappflowcollector resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nsappflowcollector deleteresources[] = new nsappflowcollector[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new nsappflowcollector();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsappflowcollector resources.
	*/
	public static base_responses delete(nitro_service client, nsappflowcollector resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsappflowcollector deleteresources[] = new nsappflowcollector[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nsappflowcollector();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nsappflowcollector resources that are configured on netscaler.
	*/
	public static nsappflowcollector[] get(nitro_service service) throws Exception{
		nsappflowcollector obj = new nsappflowcollector();
		nsappflowcollector[] response = (nsappflowcollector[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsappflowcollector resources that are configured on netscaler.
	*/
	public static nsappflowcollector[] get(nitro_service service, options option) throws Exception{
		nsappflowcollector obj = new nsappflowcollector();
		nsappflowcollector[] response = (nsappflowcollector[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nsappflowcollector resource of given name .
	*/
	public static nsappflowcollector get(nitro_service service, String name) throws Exception{
		nsappflowcollector obj = new nsappflowcollector();
		obj.set_name(name);
		nsappflowcollector response = (nsappflowcollector) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nsappflowcollector resources of given names .
	*/
	public static nsappflowcollector[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nsappflowcollector response[] = new nsappflowcollector[name.length];
			nsappflowcollector obj[] = new nsappflowcollector[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nsappflowcollector();
				obj[i].set_name(name[i]);
				response[i] = (nsappflowcollector) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nsappflowcollector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsappflowcollector[] get_filtered(nitro_service service, String filter) throws Exception{
		nsappflowcollector obj = new nsappflowcollector();
		options option = new options();
		option.set_filter(filter);
		nsappflowcollector[] response = (nsappflowcollector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsappflowcollector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsappflowcollector[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsappflowcollector obj = new nsappflowcollector();
		options option = new options();
		option.set_filter(filter);
		nsappflowcollector[] response = (nsappflowcollector[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsappflowcollector resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsappflowcollector obj = new nsappflowcollector();
		options option = new options();
		option.set_count(true);
		nsappflowcollector[] response = (nsappflowcollector[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsappflowcollector resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsappflowcollector obj = new nsappflowcollector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsappflowcollector[] response = (nsappflowcollector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsappflowcollector resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsappflowcollector obj = new nsappflowcollector();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsappflowcollector[] response = (nsappflowcollector[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
