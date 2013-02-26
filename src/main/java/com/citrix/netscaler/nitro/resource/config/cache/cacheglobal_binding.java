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

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.config.cache.cacheglobal_cachepolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cacheglobal_binding_response extends base_response
{
	public cacheglobal_binding[] cacheglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to cacheglobal_binding. 
	*/

public class cacheglobal_binding extends base_resource
{
	private cacheglobal_cachepolicy_binding	cacheglobal_cachepolicy_binding[] = null;

	/**
	* <pre>
	* cachepolicy that can be bound to cacheglobal.
	* </pre>
	*/
	public cacheglobal_cachepolicy_binding[] get_cacheglobal_cachepolicy_bindings() throws Exception {
		return this.cacheglobal_cachepolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cacheglobal_binding_response result = (cacheglobal_binding_response) service.get_payload_formatter().string_to_resource(cacheglobal_binding_response.class, response);
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
		return result.cacheglobal_binding;
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
	* Use this API to fetch a cacheglobal_binding resource .
	*/
	public static cacheglobal_binding get(nitro_service service) throws Exception{
		cacheglobal_binding obj = new cacheglobal_binding();
		cacheglobal_binding response = (cacheglobal_binding) obj.get_resource(service);
		return response;
	}


}