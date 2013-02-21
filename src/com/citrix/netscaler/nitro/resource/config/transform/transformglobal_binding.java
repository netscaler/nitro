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

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.config.transform.transformglobal_transformpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformglobal_binding_response extends base_response
{
	public transformglobal_binding[] transformglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to transformglobal_binding. 
	*/

public class transformglobal_binding extends base_resource
{
	private transformglobal_transformpolicy_binding	transformglobal_transformpolicy_binding[] = null;

	/**
	* <pre>
	* transformpolicy that can be bound to transformglobal.
	* </pre>
	*/
	public transformglobal_transformpolicy_binding[] get_transformglobal_transformpolicy_bindings() throws Exception {
		return this.transformglobal_transformpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformglobal_binding_response result = (transformglobal_binding_response) service.get_payload_formatter().string_to_resource(transformglobal_binding_response.class, response);
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
		return result.transformglobal_binding;
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
	* Use this API to fetch a transformglobal_binding resource .
	*/
	public static transformglobal_binding get(nitro_service service) throws Exception{
		transformglobal_binding obj = new transformglobal_binding();
		transformglobal_binding response = (transformglobal_binding) obj.get_resource(service);
		return response;
	}


}