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

package com.citrix.netscaler.nitro.resource.config.authorization;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authorizationaction_response extends base_response
{
	public authorizationaction[] authorizationaction;
}
/**
* Configuration for authorization action resource.
*/

public class authorizationaction extends base_resource
{
	private String name;
	private Long __count;

	/**
	* <pre>
	* Name of authorization action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of authorization action.<br> Minimum length =  1
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
		authorizationaction_response result = (authorizationaction_response) service.get_payload_formatter().string_to_resource(authorizationaction_response.class, response);
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
		return result.authorizationaction;
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
	* Use this API to fetch all the authorizationaction resources that are configured on netscaler.
	*/
	public static authorizationaction[] get(nitro_service service) throws Exception{
		authorizationaction obj = new authorizationaction();
		authorizationaction[] response = (authorizationaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authorizationaction resources that are configured on netscaler.
	*/
	public static authorizationaction[] get(nitro_service service, options option) throws Exception{
		authorizationaction obj = new authorizationaction();
		authorizationaction[] response = (authorizationaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authorizationaction resource of given name .
	*/
	public static authorizationaction get(nitro_service service, String name) throws Exception{
		authorizationaction obj = new authorizationaction();
		obj.set_name(name);
		authorizationaction response = (authorizationaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authorizationaction resources of given names .
	*/
	public static authorizationaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authorizationaction response[] = new authorizationaction[name.length];
			authorizationaction obj[] = new authorizationaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authorizationaction();
				obj[i].set_name(name[i]);
				response[i] = (authorizationaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authorizationaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authorizationaction[] get_filtered(nitro_service service, String filter) throws Exception{
		authorizationaction obj = new authorizationaction();
		options option = new options();
		option.set_filter(filter);
		authorizationaction[] response = (authorizationaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authorizationaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authorizationaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authorizationaction obj = new authorizationaction();
		options option = new options();
		option.set_filter(filter);
		authorizationaction[] response = (authorizationaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authorizationaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authorizationaction obj = new authorizationaction();
		options option = new options();
		option.set_count(true);
		authorizationaction[] response = (authorizationaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authorizationaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authorizationaction obj = new authorizationaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authorizationaction[] response = (authorizationaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authorizationaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authorizationaction obj = new authorizationaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authorizationaction[] response = (authorizationaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
