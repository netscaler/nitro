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

package com.citrix.netscaler.nitro.resource.config.appqoe;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appqoecustomresp_response extends base_response
{
	public appqoecustomresp[] appqoecustomresp;
}
/**
* Configuration for AppQoE custom response page resource.
*/

public class appqoecustomresp extends base_resource
{
	private String src;
	private String name;
	private Long __count;

	/**
	* <pre>
	* .<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public void set_src(String src) throws Exception{
		this.src = src;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public String get_src() throws Exception {
		return this.src;
	}

	/**
	* <pre>
	* Indicates name of the custom response HTML page to import/update.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Indicates name of the custom response HTML page to import/update.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appqoecustomresp_response result = (appqoecustomresp_response) service.get_payload_formatter().string_to_resource(appqoecustomresp_response.class, response);
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
		return result.appqoecustomresp;
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
	* Use this API to Import appqoecustomresp.
	*/
	public static base_response Import(nitro_service client, appqoecustomresp resource) throws Exception {
		appqoecustomresp Importresource = new appqoecustomresp();
		Importresource.src = resource.src;
		Importresource.name = resource.name;
		return Importresource.perform_operation(client,"Import");
	}

	/**
	* Use this API to Import appqoecustomresp resources.
	*/
	public static base_responses Import(nitro_service client, appqoecustomresp resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoecustomresp Importresources[] = new appqoecustomresp[resources.length];
			for (int i=0;i<resources.length;i++){
				Importresources[i] = new appqoecustomresp();
				Importresources[i].src = resources[i].src;
				Importresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, Importresources,"Import");
		}
		return result;
	}

	/**
	* Use this API to delete appqoecustomresp of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appqoecustomresp deleteresource = new appqoecustomresp();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appqoecustomresp.
	*/
	public static base_response delete(nitro_service client, appqoecustomresp resource) throws Exception {
		appqoecustomresp deleteresource = new appqoecustomresp();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appqoecustomresp resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appqoecustomresp deleteresources[] = new appqoecustomresp[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appqoecustomresp();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appqoecustomresp resources.
	*/
	public static base_responses delete(nitro_service client, appqoecustomresp resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoecustomresp deleteresources[] = new appqoecustomresp[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appqoecustomresp();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to change appqoecustomresp.
	*/
	public static base_response change(nitro_service client, appqoecustomresp resource) throws Exception {
		appqoecustomresp updateresource = new appqoecustomresp();
		updateresource.name = resource.name;
		return updateresource.perform_operation(client,"update");
	}

	/**
	* Use this API to change appqoecustomresp resources.
	*/
	public static base_responses change(nitro_service client, appqoecustomresp resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoecustomresp updateresources[] = new appqoecustomresp[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appqoecustomresp();
				updateresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, updateresources,"update");
		}
		return result;
	}

	/**
	* Use this API to fetch all the appqoecustomresp resources that are configured on netscaler.
	*/
	public static appqoecustomresp[] get(nitro_service service) throws Exception{
		appqoecustomresp obj = new appqoecustomresp();
		appqoecustomresp[] response = (appqoecustomresp[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appqoecustomresp resources that are configured on netscaler.
	*/
	public static appqoecustomresp[] get(nitro_service service, options option) throws Exception{
		appqoecustomresp obj = new appqoecustomresp();
		appqoecustomresp[] response = (appqoecustomresp[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of appqoecustomresp resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appqoecustomresp[] get_filtered(nitro_service service, String filter) throws Exception{
		appqoecustomresp obj = new appqoecustomresp();
		options option = new options();
		option.set_filter(filter);
		appqoecustomresp[] response = (appqoecustomresp[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appqoecustomresp resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appqoecustomresp[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appqoecustomresp obj = new appqoecustomresp();
		options option = new options();
		option.set_filter(filter);
		appqoecustomresp[] response = (appqoecustomresp[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appqoecustomresp resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appqoecustomresp obj = new appqoecustomresp();
		options option = new options();
		option.set_count(true);
		appqoecustomresp[] response = (appqoecustomresp[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appqoecustomresp resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appqoecustomresp obj = new appqoecustomresp();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appqoecustomresp[] response = (appqoecustomresp[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appqoecustomresp resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appqoecustomresp obj = new appqoecustomresp();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appqoecustomresp[] response = (appqoecustomresp[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
