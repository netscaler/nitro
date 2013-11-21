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

class nslimitidentifier_nslimitsessions_binding_response extends base_response
{
	public nslimitidentifier_nslimitsessions_binding[] nslimitidentifier_nslimitsessions_binding;
}
/**
	* Binding class showing the nslimitsessions that can be bound to nslimitidentifier.
	*/

public class nslimitidentifier_nslimitsessions_binding extends base_resource
{
	private String limitidentifier;
	private Long __count;

	/**
	* <pre>
	* Name of the rate limit identifier about which to display information. If a name is not provided, information about all rate limit identifiers is shown.
	* </pre>
	*/
	public void set_limitidentifier(String limitidentifier) throws Exception{
		this.limitidentifier = limitidentifier;
	}

	/**
	* <pre>
	* Name of the rate limit identifier about which to display information. If a name is not provided, information about all rate limit identifiers is shown.
	* </pre>
	*/
	public String get_limitidentifier() throws Exception {
		return this.limitidentifier;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nslimitidentifier_nslimitsessions_binding_response result = (nslimitidentifier_nslimitsessions_binding_response) service.get_payload_formatter().string_to_resource(nslimitidentifier_nslimitsessions_binding_response.class, response);
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
		return result.nslimitidentifier_nslimitsessions_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.limitidentifier;
	}

	/**
	* Use this API to fetch nslimitidentifier_nslimitsessions_binding resources of given name .
	*/
	public static nslimitidentifier_nslimitsessions_binding[] get(nitro_service service, String limitidentifier) throws Exception{
		nslimitidentifier_nslimitsessions_binding obj = new nslimitidentifier_nslimitsessions_binding();
		obj.set_limitidentifier(limitidentifier);
		nslimitidentifier_nslimitsessions_binding response[] = (nslimitidentifier_nslimitsessions_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nslimitidentifier_nslimitsessions_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nslimitidentifier_nslimitsessions_binding[] get_filtered(nitro_service service, String limitidentifier, String filter) throws Exception{
		nslimitidentifier_nslimitsessions_binding obj = new nslimitidentifier_nslimitsessions_binding();
		obj.set_limitidentifier(limitidentifier);
		options option = new options();
		option.set_filter(filter);
		nslimitidentifier_nslimitsessions_binding[] response = (nslimitidentifier_nslimitsessions_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nslimitidentifier_nslimitsessions_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nslimitidentifier_nslimitsessions_binding[] get_filtered(nitro_service service, String limitidentifier, filtervalue[] filter) throws Exception{
		nslimitidentifier_nslimitsessions_binding obj = new nslimitidentifier_nslimitsessions_binding();
		obj.set_limitidentifier(limitidentifier);
		options option = new options();
		option.set_filter(filter);
		nslimitidentifier_nslimitsessions_binding[] response = (nslimitidentifier_nslimitsessions_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count nslimitidentifier_nslimitsessions_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String limitidentifier) throws Exception{
		nslimitidentifier_nslimitsessions_binding obj = new nslimitidentifier_nslimitsessions_binding();
		obj.set_limitidentifier(limitidentifier);
		options option = new options();
		option.set_count(true);
		nslimitidentifier_nslimitsessions_binding response[] = (nslimitidentifier_nslimitsessions_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nslimitidentifier_nslimitsessions_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String limitidentifier, String filter) throws Exception{
		nslimitidentifier_nslimitsessions_binding obj = new nslimitidentifier_nslimitsessions_binding();
		obj.set_limitidentifier(limitidentifier);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nslimitidentifier_nslimitsessions_binding[] response = (nslimitidentifier_nslimitsessions_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nslimitidentifier_nslimitsessions_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String limitidentifier, filtervalue[] filter) throws Exception{
		nslimitidentifier_nslimitsessions_binding obj = new nslimitidentifier_nslimitsessions_binding();
		obj.set_limitidentifier(limitidentifier);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nslimitidentifier_nslimitsessions_binding[] response = (nslimitidentifier_nslimitsessions_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}