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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnssuffix_response extends base_response
{
	public dnssuffix[] dnssuffix;
}
/**
* Configuration for DNS suffix resource.
*/

public class dnssuffix extends base_resource
{
	private String Dnssuffix;
	private Long __count;

	/**
	* <pre>
	* Suffix to be appended while resolving the domain name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_Dnssuffix(String Dnssuffix) throws Exception{
		this.Dnssuffix = Dnssuffix;
	}

	/**
	* <pre>
	* Suffix to be appended while resolving the domain name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_Dnssuffix() throws Exception {
		return this.Dnssuffix;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnssuffix_response result = (dnssuffix_response) service.get_payload_formatter().string_to_resource(dnssuffix_response.class, response);
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
		return result.dnssuffix;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.Dnssuffix;
	}

	/**
	* Use this API to add dnssuffix.
	*/
	public static base_response add(nitro_service client, dnssuffix resource) throws Exception {
		dnssuffix addresource = new dnssuffix();
		addresource.Dnssuffix = resource.Dnssuffix;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnssuffix resources.
	*/
	public static base_responses add(nitro_service client, dnssuffix resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssuffix addresources[] = new dnssuffix[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnssuffix();
				addresources[i].Dnssuffix = resources[i].Dnssuffix;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnssuffix of given name.
	*/
	public static base_response delete(nitro_service client, String Dnssuffix) throws Exception {
		dnssuffix deleteresource = new dnssuffix();
		deleteresource.Dnssuffix = Dnssuffix;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnssuffix.
	*/
	public static base_response delete(nitro_service client, dnssuffix resource) throws Exception {
		dnssuffix deleteresource = new dnssuffix();
		deleteresource.Dnssuffix = resource.Dnssuffix;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnssuffix resources of given names.
	*/
	public static base_responses delete(nitro_service client, String Dnssuffix[]) throws Exception {
		base_responses result = null;
		if (Dnssuffix != null && Dnssuffix.length > 0) {
			dnssuffix deleteresources[] = new dnssuffix[Dnssuffix.length];
			for (int i=0;i<Dnssuffix.length;i++){
				deleteresources[i] = new dnssuffix();
				deleteresources[i].Dnssuffix = Dnssuffix[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnssuffix resources.
	*/
	public static base_responses delete(nitro_service client, dnssuffix resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssuffix deleteresources[] = new dnssuffix[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnssuffix();
				deleteresources[i].Dnssuffix = resources[i].Dnssuffix;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnssuffix resources that are configured on netscaler.
	*/
	public static dnssuffix[] get(nitro_service service) throws Exception{
		dnssuffix obj = new dnssuffix();
		dnssuffix[] response = (dnssuffix[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnssuffix resources that are configured on netscaler.
	*/
	public static dnssuffix[] get(nitro_service service, options option) throws Exception{
		dnssuffix obj = new dnssuffix();
		dnssuffix[] response = (dnssuffix[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dnssuffix resource of given name .
	*/
	public static dnssuffix get(nitro_service service, String Dnssuffix) throws Exception{
		dnssuffix obj = new dnssuffix();
		obj.set_Dnssuffix(Dnssuffix);
		dnssuffix response = (dnssuffix) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnssuffix resources of given names .
	*/
	public static dnssuffix[] get(nitro_service service, String Dnssuffix[]) throws Exception{
		if (Dnssuffix !=null && Dnssuffix.length>0) {
			dnssuffix response[] = new dnssuffix[Dnssuffix.length];
			dnssuffix obj[] = new dnssuffix[Dnssuffix.length];
			for (int i=0;i<Dnssuffix.length;i++) {
				obj[i] = new dnssuffix();
				obj[i].set_Dnssuffix(Dnssuffix[i]);
				response[i] = (dnssuffix) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnssuffix resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnssuffix[] get_filtered(nitro_service service, String filter) throws Exception{
		dnssuffix obj = new dnssuffix();
		options option = new options();
		option.set_filter(filter);
		dnssuffix[] response = (dnssuffix[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnssuffix resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnssuffix[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnssuffix obj = new dnssuffix();
		options option = new options();
		option.set_filter(filter);
		dnssuffix[] response = (dnssuffix[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnssuffix resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnssuffix obj = new dnssuffix();
		options option = new options();
		option.set_count(true);
		dnssuffix[] response = (dnssuffix[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnssuffix resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnssuffix obj = new dnssuffix();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnssuffix[] response = (dnssuffix[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnssuffix resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnssuffix obj = new dnssuffix();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnssuffix[] response = (dnssuffix[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
