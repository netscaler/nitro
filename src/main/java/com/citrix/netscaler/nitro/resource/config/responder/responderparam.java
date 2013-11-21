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

package com.citrix.netscaler.nitro.resource.config.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderparam_response extends base_response
{
	public responderparam responderparam;
}
/**
* Configuration for responser parameter resource.
*/

public class responderparam extends base_resource
{
	private String undefaction;

	/**
	* <pre>
	* Action to perform when policy evaluation creates an UNDEF condition. Available settings function as follows:
* NOOP - Send the request to the protected server.
* RESET - Reset the request and notify the user's browser, so that the user can resend the request.
* DROP - Drop the request without sending a response to the user.<br> Default value: "NOOP"
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Action to perform when policy evaluation creates an UNDEF condition. Available settings function as follows:
* NOOP - Send the request to the protected server.
* RESET - Reset the request and notify the user's browser, so that the user can resend the request.
* DROP - Drop the request without sending a response to the user.<br> Default value: "NOOP"
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		responderparam[] resources = new responderparam[1];
		responderparam_response result = (responderparam_response) service.get_payload_formatter().string_to_resource(responderparam_response.class, response);
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
		resources[0] = result.responderparam;
		return resources;
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
	* Use this API to update responderparam.
	*/
	public static base_response update(nitro_service client, responderparam resource) throws Exception {
		responderparam updateresource = new responderparam();
		updateresource.undefaction = resource.undefaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of responderparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, responderparam resource, String[] args) throws Exception{
		responderparam unsetresource = new responderparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the responderparam resources that are configured on netscaler.
	*/
	public static responderparam get(nitro_service service) throws Exception{
		responderparam obj = new responderparam();
		responderparam[] response = (responderparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the responderparam resources that are configured on netscaler.
	*/
	public static responderparam get(nitro_service service,  options option) throws Exception{
		responderparam obj = new responderparam();
		responderparam[] response = (responderparam[])obj.get_resources(service,option);
		return response[0];
	}

}
