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

import com.citrix.netscaler.nitro.resource.config.appfw.appfwglobal_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwglobal_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwglobal_appfwpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwglobal_binding_response extends base_response
{
	public appfwglobal_binding[] appfwglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to appfwglobal_binding. 
	*/

public class appfwglobal_binding extends base_resource
{
	private appfwglobal_auditsyslogpolicy_binding	appfwglobal_auditsyslogpolicy_binding[] = null;
	private appfwglobal_auditnslogpolicy_binding	appfwglobal_auditnslogpolicy_binding[] = null;
	private appfwglobal_appfwpolicy_binding	appfwglobal_appfwpolicy_binding[] = null;

	/**
	* <pre>
	* appfwpolicy that can be bound to appfwglobal.
	* </pre>
	*/
	public appfwglobal_appfwpolicy_binding[] get_appfwglobal_appfwpolicy_bindings() throws Exception {
		return this.appfwglobal_appfwpolicy_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to appfwglobal.
	* </pre>
	*/
	public appfwglobal_auditsyslogpolicy_binding[] get_appfwglobal_auditsyslogpolicy_bindings() throws Exception {
		return this.appfwglobal_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to appfwglobal.
	* </pre>
	*/
	public appfwglobal_auditnslogpolicy_binding[] get_appfwglobal_auditnslogpolicy_bindings() throws Exception {
		return this.appfwglobal_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwglobal_binding_response result = (appfwglobal_binding_response) service.get_payload_formatter().string_to_resource(appfwglobal_binding_response.class, response);
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
		return result.appfwglobal_binding;
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
	* Use this API to fetch a appfwglobal_binding resource .
	*/
	public static appfwglobal_binding get(nitro_service service) throws Exception{
		appfwglobal_binding obj = new appfwglobal_binding();
		appfwglobal_binding response = (appfwglobal_binding) obj.get_resource(service);
		return response;
	}


}