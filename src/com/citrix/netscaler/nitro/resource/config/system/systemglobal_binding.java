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

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.config.system.systemglobal_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemglobal_authenticationradiuspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemglobal_authenticationldappolicy_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemglobal_authenticationlocalpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemglobal_authenticationtacacspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemglobal_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemglobal_binding_response extends base_response
{
	public systemglobal_binding[] systemglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to systemglobal_binding. 
	*/

public class systemglobal_binding extends base_resource
{
	private systemglobal_auditnslogpolicy_binding	systemglobal_auditnslogpolicy_binding[] = null;
	private systemglobal_authenticationradiuspolicy_binding	systemglobal_authenticationradiuspolicy_binding[] = null;
	private systemglobal_authenticationldappolicy_binding	systemglobal_authenticationldappolicy_binding[] = null;
	private systemglobal_authenticationlocalpolicy_binding	systemglobal_authenticationlocalpolicy_binding[] = null;
	private systemglobal_authenticationtacacspolicy_binding	systemglobal_authenticationtacacspolicy_binding[] = null;
	private systemglobal_auditsyslogpolicy_binding	systemglobal_auditsyslogpolicy_binding[] = null;

	/**
	* <pre>
	* authenticationtacacspolicy that can be bound to systemglobal.
	* </pre>
	*/
	public systemglobal_authenticationtacacspolicy_binding[] get_systemglobal_authenticationtacacspolicy_bindings() throws Exception {
		return this.systemglobal_authenticationtacacspolicy_binding;
	}

	/**
	* <pre>
	* authenticationldappolicy that can be bound to systemglobal.
	* </pre>
	*/
	public systemglobal_authenticationldappolicy_binding[] get_systemglobal_authenticationldappolicy_bindings() throws Exception {
		return this.systemglobal_authenticationldappolicy_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to systemglobal.
	* </pre>
	*/
	public systemglobal_auditsyslogpolicy_binding[] get_systemglobal_auditsyslogpolicy_bindings() throws Exception {
		return this.systemglobal_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* authenticationlocalpolicy that can be bound to systemglobal.
	* </pre>
	*/
	public systemglobal_authenticationlocalpolicy_binding[] get_systemglobal_authenticationlocalpolicy_bindings() throws Exception {
		return this.systemglobal_authenticationlocalpolicy_binding;
	}

	/**
	* <pre>
	* authenticationradiuspolicy that can be bound to systemglobal.
	* </pre>
	*/
	public systemglobal_authenticationradiuspolicy_binding[] get_systemglobal_authenticationradiuspolicy_bindings() throws Exception {
		return this.systemglobal_authenticationradiuspolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to systemglobal.
	* </pre>
	*/
	public systemglobal_auditnslogpolicy_binding[] get_systemglobal_auditnslogpolicy_bindings() throws Exception {
		return this.systemglobal_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemglobal_binding_response result = (systemglobal_binding_response) service.get_payload_formatter().string_to_resource(systemglobal_binding_response.class, response);
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
		return result.systemglobal_binding;
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
	* Use this API to fetch a systemglobal_binding resource .
	*/
	public static systemglobal_binding get(nitro_service service) throws Exception{
		systemglobal_binding obj = new systemglobal_binding();
		systemglobal_binding response = (systemglobal_binding) obj.get_resource(service);
		return response;
	}


}