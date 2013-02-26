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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwwsdl_response extends base_response
{
	public appfwwsdl appfwwsdl;
}
/**
* Configuration for WSDL file resource.
*/

public class appfwwsdl extends base_resource
{
	private String name;

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* Indicates name of the importd wsdl to be displayed.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Indicates name of the importd wsdl to be displayed.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_response() throws Exception {
		return this.response;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		appfwwsdl[] resources = new appfwwsdl[1];
		appfwwsdl_response result = (appfwwsdl_response) service.get_payload_formatter().string_to_resource(appfwwsdl_response.class, response);
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
		resources[0] = result.appfwwsdl;
		return resources;
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
	* Use this API to fetch all the appfwwsdl resources that are configured on netscaler.
	*/
	public static appfwwsdl get(nitro_service service) throws Exception{
		appfwwsdl obj = new appfwwsdl();
		appfwwsdl[] response = (appfwwsdl[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the appfwwsdl resources that are configured on netscaler.
	*/
	public static appfwwsdl get(nitro_service service,  options option) throws Exception{
		appfwwsdl obj = new appfwwsdl();
		appfwwsdl[] response = (appfwwsdl[])obj.get_resources(service,option);
		return response[0];
	}

	/**
	* Use this API to fetch appfwwsdl resource of given name .
	*/
	public static appfwwsdl get(nitro_service service, String name) throws Exception{
		appfwwsdl obj = new appfwwsdl();
		obj.set_name(name);
		appfwwsdl response = (appfwwsdl) obj.get_resource(service);
		return response;
	}

}
