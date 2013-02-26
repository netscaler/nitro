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

import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_tmglobal_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_appfwglobal_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_aaauser_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_vpnglobal_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_systemglobal_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogpolicy_aaagroup_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class auditnslogpolicy_binding_response extends base_response
{
	public auditnslogpolicy_binding[] auditnslogpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to auditnslogpolicy_binding. 
	*/

public class auditnslogpolicy_binding extends base_resource
{
	private String name;
	private auditnslogpolicy_csvserver_binding	auditnslogpolicy_csvserver_binding[] = null;
	private auditnslogpolicy_tmglobal_binding	auditnslogpolicy_tmglobal_binding[] = null;
	private auditnslogpolicy_appfwglobal_binding	auditnslogpolicy_appfwglobal_binding[] = null;
	private auditnslogpolicy_lbvserver_binding	auditnslogpolicy_lbvserver_binding[] = null;
	private auditnslogpolicy_aaauser_binding	auditnslogpolicy_aaauser_binding[] = null;
	private auditnslogpolicy_vpnglobal_binding	auditnslogpolicy_vpnglobal_binding[] = null;
	private auditnslogpolicy_vpnvserver_binding	auditnslogpolicy_vpnvserver_binding[] = null;
	private auditnslogpolicy_systemglobal_binding	auditnslogpolicy_systemglobal_binding[] = null;
	private auditnslogpolicy_authenticationvserver_binding	auditnslogpolicy_authenticationvserver_binding[] = null;
	private auditnslogpolicy_aaagroup_binding	auditnslogpolicy_aaagroup_binding[] = null;

	/**
	* <pre>
	* The name of the nslog policy. If an nslog policy name is not provided, all of the configured nslog policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the nslog policy. If an nslog policy name is not provided, all of the configured nslog policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_authenticationvserver_binding[] get_auditnslogpolicy_authenticationvserver_bindings() throws Exception {
		return this.auditnslogpolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* systemglobal that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_systemglobal_binding[] get_auditnslogpolicy_systemglobal_bindings() throws Exception {
		return this.auditnslogpolicy_systemglobal_binding;
	}

	/**
	* <pre>
	* aaagroup that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_aaagroup_binding[] get_auditnslogpolicy_aaagroup_bindings() throws Exception {
		return this.auditnslogpolicy_aaagroup_binding;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_vpnvserver_binding[] get_auditnslogpolicy_vpnvserver_bindings() throws Exception {
		return this.auditnslogpolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_lbvserver_binding[] get_auditnslogpolicy_lbvserver_bindings() throws Exception {
		return this.auditnslogpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* appfwglobal that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_appfwglobal_binding[] get_auditnslogpolicy_appfwglobal_bindings() throws Exception {
		return this.auditnslogpolicy_appfwglobal_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_csvserver_binding[] get_auditnslogpolicy_csvserver_bindings() throws Exception {
		return this.auditnslogpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* vpnglobal that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_vpnglobal_binding[] get_auditnslogpolicy_vpnglobal_bindings() throws Exception {
		return this.auditnslogpolicy_vpnglobal_binding;
	}

	/**
	* <pre>
	* aaauser that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_aaauser_binding[] get_auditnslogpolicy_aaauser_bindings() throws Exception {
		return this.auditnslogpolicy_aaauser_binding;
	}

	/**
	* <pre>
	* tmglobal that can be bound to auditnslogpolicy.
	* </pre>
	*/
	public auditnslogpolicy_tmglobal_binding[] get_auditnslogpolicy_tmglobal_bindings() throws Exception {
		return this.auditnslogpolicy_tmglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		auditnslogpolicy_binding_response result = (auditnslogpolicy_binding_response) service.get_payload_formatter().string_to_resource(auditnslogpolicy_binding_response.class, response);
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
		return result.auditnslogpolicy_binding;
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
	* Use this API to fetch auditnslogpolicy_binding resource of given name .
	*/
	public static auditnslogpolicy_binding get(nitro_service service, String name) throws Exception{
		auditnslogpolicy_binding obj = new auditnslogpolicy_binding();
		obj.set_name(name);
		auditnslogpolicy_binding response = (auditnslogpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch auditnslogpolicy_binding resources of given names .
	*/
	public static auditnslogpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			auditnslogpolicy_binding response[] = new auditnslogpolicy_binding[name.length];
			auditnslogpolicy_binding obj[] = new auditnslogpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new auditnslogpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (auditnslogpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}