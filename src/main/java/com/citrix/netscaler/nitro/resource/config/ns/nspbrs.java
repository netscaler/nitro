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

class nspbrs_response extends base_response
{
	public nspbrs nspbrs;
}
/**
* Configuration for Policy based routing resource.
*/

public class nspbrs extends base_resource
{

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nspbrs[] resources = new nspbrs[1];
		nspbrs_response result = (nspbrs_response) service.get_payload_formatter().string_to_resource(nspbrs_response.class, response);
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
		resources[0] = result.nspbrs;
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
	* Use this API to renumber nspbrs.
	*/
	public static base_response renumber(nitro_service client) throws Exception {
		nspbrs renumberresource = new nspbrs();
		return renumberresource.perform_operation(client,"renumber");
	}

	/**
	* Use this API to clear nspbrs.
	*/
	public static base_response clear(nitro_service client) throws Exception {
		nspbrs clearresource = new nspbrs();
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to apply nspbrs.
	*/
	public static base_response apply(nitro_service client) throws Exception {
		nspbrs applyresource = new nspbrs();
		return applyresource.perform_operation(client,"apply");
	}

}
