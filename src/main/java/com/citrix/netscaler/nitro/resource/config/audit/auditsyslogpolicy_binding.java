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

package com.citrix.netscaler.nitro.resource.config.audit;

import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_tmglobal_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_aaauser_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_vpnglobal_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_systemglobal_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogpolicy_aaagroup_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class auditsyslogpolicy_binding_response extends base_response
{
	public auditsyslogpolicy_binding[] auditsyslogpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to auditsyslogpolicy_binding. 
	*/

public class auditsyslogpolicy_binding extends base_resource
{
	private String name;
	private auditsyslogpolicy_csvserver_binding	auditsyslogpolicy_csvserver_binding[] = null;
	private auditsyslogpolicy_tmglobal_binding	auditsyslogpolicy_tmglobal_binding[] = null;
	private auditsyslogpolicy_lbvserver_binding	auditsyslogpolicy_lbvserver_binding[] = null;
	private auditsyslogpolicy_aaauser_binding	auditsyslogpolicy_aaauser_binding[] = null;
	private auditsyslogpolicy_vpnglobal_binding	auditsyslogpolicy_vpnglobal_binding[] = null;
	private auditsyslogpolicy_vpnvserver_binding	auditsyslogpolicy_vpnvserver_binding[] = null;
	private auditsyslogpolicy_systemglobal_binding	auditsyslogpolicy_systemglobal_binding[] = null;
	private auditsyslogpolicy_authenticationvserver_binding	auditsyslogpolicy_authenticationvserver_binding[] = null;
	private auditsyslogpolicy_aaagroup_binding	auditsyslogpolicy_aaagroup_binding[] = null;

	/**
	* <pre>
	* The name of the policy to be displayed. If the policy name is not provided, all the configured syslog policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the policy to be displayed. If the policy name is not provided, all the configured syslog policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* aaagroup that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_aaagroup_binding[] get_auditsyslogpolicy_aaagroup_bindings() throws Exception {
		return this.auditsyslogpolicy_aaagroup_binding;
	}

	/**
	* <pre>
	* tmglobal that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_tmglobal_binding[] get_auditsyslogpolicy_tmglobal_bindings() throws Exception {
		return this.auditsyslogpolicy_tmglobal_binding;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_vpnvserver_binding[] get_auditsyslogpolicy_vpnvserver_bindings() throws Exception {
		return this.auditsyslogpolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* aaauser that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_aaauser_binding[] get_auditsyslogpolicy_aaauser_bindings() throws Exception {
		return this.auditsyslogpolicy_aaauser_binding;
	}

	/**
	* <pre>
	* vpnglobal that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_vpnglobal_binding[] get_auditsyslogpolicy_vpnglobal_bindings() throws Exception {
		return this.auditsyslogpolicy_vpnglobal_binding;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_authenticationvserver_binding[] get_auditsyslogpolicy_authenticationvserver_bindings() throws Exception {
		return this.auditsyslogpolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_lbvserver_binding[] get_auditsyslogpolicy_lbvserver_bindings() throws Exception {
		return this.auditsyslogpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_csvserver_binding[] get_auditsyslogpolicy_csvserver_bindings() throws Exception {
		return this.auditsyslogpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* systemglobal that can be bound to auditsyslogpolicy.
	* </pre>
	*/
	public auditsyslogpolicy_systemglobal_binding[] get_auditsyslogpolicy_systemglobal_bindings() throws Exception {
		return this.auditsyslogpolicy_systemglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		auditsyslogpolicy_binding_response result = (auditsyslogpolicy_binding_response) service.get_payload_formatter().string_to_resource(auditsyslogpolicy_binding_response.class, response);
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
		return result.auditsyslogpolicy_binding;
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
	* Use this API to fetch auditsyslogpolicy_binding resource of given name .
	*/
	public static auditsyslogpolicy_binding get(nitro_service service, String name) throws Exception{
		auditsyslogpolicy_binding obj = new auditsyslogpolicy_binding();
		obj.set_name(name);
		auditsyslogpolicy_binding response = (auditsyslogpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch auditsyslogpolicy_binding resources of given names .
	*/
	public static auditsyslogpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			auditsyslogpolicy_binding response[] = new auditsyslogpolicy_binding[name.length];
			auditsyslogpolicy_binding obj[] = new auditsyslogpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new auditsyslogpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (auditsyslogpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}