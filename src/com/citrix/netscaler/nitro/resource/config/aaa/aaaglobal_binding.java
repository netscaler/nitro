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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.config.aaa.aaaglobal_authenticationnegotiateaction_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaaglobal_aaapreauthenticationpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaaglobal_binding_response extends base_response
{
	public aaaglobal_binding[] aaaglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to aaaglobal_binding. 
	*/

public class aaaglobal_binding extends base_resource
{
	private aaaglobal_authenticationnegotiateaction_binding	aaaglobal_authenticationnegotiateaction_binding[] = null;
	private aaaglobal_aaapreauthenticationpolicy_binding	aaaglobal_aaapreauthenticationpolicy_binding[] = null;

	/**
	* <pre>
	* authenticationnegotiateaction that can be bound to aaaglobal.
	* </pre>
	*/
	public aaaglobal_authenticationnegotiateaction_binding[] get_aaaglobal_authenticationnegotiateaction_bindings() throws Exception {
		return this.aaaglobal_authenticationnegotiateaction_binding;
	}

	/**
	* <pre>
	* aaapreauthenticationpolicy that can be bound to aaaglobal.
	* </pre>
	*/
	public aaaglobal_aaapreauthenticationpolicy_binding[] get_aaaglobal_aaapreauthenticationpolicy_bindings() throws Exception {
		return this.aaaglobal_aaapreauthenticationpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaaglobal_binding_response result = (aaaglobal_binding_response) service.get_payload_formatter().string_to_resource(aaaglobal_binding_response.class, response);
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
		return result.aaaglobal_binding;
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
	* Use this API to fetch a aaaglobal_binding resource .
	*/
	public static aaaglobal_binding get(nitro_service service) throws Exception{
		aaaglobal_binding obj = new aaaglobal_binding();
		aaaglobal_binding response = (aaaglobal_binding) obj.get_resource(service);
		return response;
	}


}