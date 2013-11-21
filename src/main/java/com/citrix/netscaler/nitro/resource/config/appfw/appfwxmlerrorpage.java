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

class appfwxmlerrorpage_response extends base_response
{
	public appfwxmlerrorpage appfwxmlerrorpage;
}
/**
* Configuration for xml error page resource.
*/

public class appfwxmlerrorpage extends base_resource
{
	private String name;

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* Name of the XML error object.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the XML error object.<br> Minimum length =  1<br> Maximum length =  31
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
		appfwxmlerrorpage[] resources = new appfwxmlerrorpage[1];
		appfwxmlerrorpage_response result = (appfwxmlerrorpage_response) service.get_payload_formatter().string_to_resource(appfwxmlerrorpage_response.class, response);
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
		resources[0] = result.appfwxmlerrorpage;
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
	* Use this API to change appfwxmlerrorpage.
	*/
	public static base_response change(nitro_service client, appfwxmlerrorpage resource) throws Exception {
		appfwxmlerrorpage updateresource = new appfwxmlerrorpage();
		updateresource.name = resource.name;
		return updateresource.perform_operation(client,"update");
	}

	/**
	* Use this API to fetch all the appfwxmlerrorpage resources that are configured on netscaler.
	*/
	public static appfwxmlerrorpage get(nitro_service service) throws Exception{
		appfwxmlerrorpage obj = new appfwxmlerrorpage();
		appfwxmlerrorpage[] response = (appfwxmlerrorpage[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the appfwxmlerrorpage resources that are configured on netscaler.
	*/
	public static appfwxmlerrorpage get(nitro_service service,  options option) throws Exception{
		appfwxmlerrorpage obj = new appfwxmlerrorpage();
		appfwxmlerrorpage[] response = (appfwxmlerrorpage[])obj.get_resources(service,option);
		return response[0];
	}

	/**
	* Use this API to fetch appfwxmlerrorpage resource of given name .
	*/
	public static appfwxmlerrorpage get(nitro_service service, String name) throws Exception{
		appfwxmlerrorpage obj = new appfwxmlerrorpage();
		obj.set_name(name);
		appfwxmlerrorpage response = (appfwxmlerrorpage) obj.get_resource(service);
		return response;
	}

}
