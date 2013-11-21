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

class fis_response extends base_response
{
	public fis[] fis;
}
/**
* Configuration for "FIS" resource.
*/

public class fis extends base_resource
{
	private String name;

	//------- Read only Parameter ---------;

	private String ifaces;
	private Long __count;

	/**
	* <pre>
	* Name for the FIS to be created. Leading character must be a number or letter. Other characters allowed, after the first character, are @ _ - . (period) : (colon) # and space ( ).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the FIS to be created. Leading character must be a number or letter. Other characters allowed, after the first character, are @ _ - . (period) : (colon) # and space ( ).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Interfaces to be bound to the FIS, in slot/port notation (for example, 1/3).
	* </pre>
	*/
	public String get_ifaces() throws Exception {
		return this.ifaces;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		fis_response result = (fis_response) service.get_payload_formatter().string_to_resource(fis_response.class, response);
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
		return result.fis;
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
	* Use this API to add fis.
	*/
	public static base_response add(nitro_service client, fis resource) throws Exception {
		fis addresource = new fis();
		addresource.name = resource.name;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add fis resources.
	*/
	public static base_responses add(nitro_service client, fis resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			fis addresources[] = new fis[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new fis();
				addresources[i].name = resources[i].name;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete fis of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		fis deleteresource = new fis();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete fis.
	*/
	public static base_response delete(nitro_service client, fis resource) throws Exception {
		fis deleteresource = new fis();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete fis resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			fis deleteresources[] = new fis[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new fis();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete fis resources.
	*/
	public static base_responses delete(nitro_service client, fis resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			fis deleteresources[] = new fis[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new fis();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the fis resources that are configured on netscaler.
	*/
	public static fis[] get(nitro_service service) throws Exception{
		fis obj = new fis();
		fis[] response = (fis[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the fis resources that are configured on netscaler.
	*/
	public static fis[] get(nitro_service service, options option) throws Exception{
		fis obj = new fis();
		fis[] response = (fis[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch fis resource of given name .
	*/
	public static fis get(nitro_service service, String name) throws Exception{
		fis obj = new fis();
		obj.set_name(name);
		fis response = (fis) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch fis resources of given names .
	*/
	public static fis[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			fis response[] = new fis[name.length];
			fis obj[] = new fis[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new fis();
				obj[i].set_name(name[i]);
				response[i] = (fis) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of fis resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static fis[] get_filtered(nitro_service service, String filter) throws Exception{
		fis obj = new fis();
		options option = new options();
		option.set_filter(filter);
		fis[] response = (fis[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of fis resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static fis[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		fis obj = new fis();
		options option = new options();
		option.set_filter(filter);
		fis[] response = (fis[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the fis resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		fis obj = new fis();
		options option = new options();
		option.set_count(true);
		fis[] response = (fis[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of fis resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		fis obj = new fis();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		fis[] response = (fis[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of fis resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		fis obj = new fis();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		fis[] response = (fis[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
