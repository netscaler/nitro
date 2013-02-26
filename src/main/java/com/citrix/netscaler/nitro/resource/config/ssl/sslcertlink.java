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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslcertlink_response extends base_response
{
	public sslcertlink[] sslcertlink;
}
/**
* Configuration for linked certificate resource.
*/

public class sslcertlink extends base_resource
{

	//------- Read only Parameter ---------;

	private String certkeyname;
	private String linkcertkeyname;
	private Long __count;

	/**
	* <pre>
	* Certificate key name.
	* </pre>
	*/
	public String get_certkeyname() throws Exception {
		return this.certkeyname;
	}

	/**
	* <pre>
	* Name of the Certificate-Authority.
	* </pre>
	*/
	public String get_linkcertkeyname() throws Exception {
		return this.linkcertkeyname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcertlink_response result = (sslcertlink_response) service.get_payload_formatter().string_to_resource(sslcertlink_response.class, response);
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
		return result.sslcertlink;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to fetch all the sslcertlink resources that are configured on netscaler.
	*/
	public static sslcertlink[] get(nitro_service service) throws Exception{
		sslcertlink obj = new sslcertlink();
		sslcertlink[] response = (sslcertlink[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslcertlink resources that are configured on netscaler.
	*/
	public static sslcertlink[] get(nitro_service service, options option) throws Exception{
		sslcertlink obj = new sslcertlink();
		sslcertlink[] response = (sslcertlink[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of sslcertlink resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslcertlink[] get_filtered(nitro_service service, String filter) throws Exception{
		sslcertlink obj = new sslcertlink();
		options option = new options();
		option.set_filter(filter);
		sslcertlink[] response = (sslcertlink[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcertlink resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslcertlink[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslcertlink obj = new sslcertlink();
		options option = new options();
		option.set_filter(filter);
		sslcertlink[] response = (sslcertlink[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslcertlink resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslcertlink obj = new sslcertlink();
		options option = new options();
		option.set_count(true);
		sslcertlink[] response = (sslcertlink[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslcertlink resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslcertlink obj = new sslcertlink();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcertlink[] response = (sslcertlink[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcertlink resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslcertlink obj = new sslcertlink();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcertlink[] response = (sslcertlink[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
