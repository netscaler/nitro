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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_spilloverpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_filterpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_cmppolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_appflowpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_responderpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_transformpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_dospolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_copolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_servicegroupmember_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_authorizationpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_dnspolicy64_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_cachepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_rewritepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_pqpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_scpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_servicegroup_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_service_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_tmtrafficpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_appqoepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_appfwpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbvserver_binding_response extends base_response
{
	public lbvserver_binding[] lbvserver_binding;
}
/**
	* Binding class showing the resources that can be bound to lbvserver_binding. 
	*/

public class lbvserver_binding extends base_resource
{
	private String name;
	private lbvserver_spilloverpolicy_binding	lbvserver_spilloverpolicy_binding[] = null;
	private lbvserver_csvserver_binding	lbvserver_csvserver_binding[] = null;
	private lbvserver_auditnslogpolicy_binding	lbvserver_auditnslogpolicy_binding[] = null;
	private lbvserver_filterpolicy_binding	lbvserver_filterpolicy_binding[] = null;
	private lbvserver_cmppolicy_binding	lbvserver_cmppolicy_binding[] = null;
	private lbvserver_appflowpolicy_binding	lbvserver_appflowpolicy_binding[] = null;
	private lbvserver_responderpolicy_binding	lbvserver_responderpolicy_binding[] = null;
	private lbvserver_transformpolicy_binding	lbvserver_transformpolicy_binding[] = null;
	private lbvserver_dospolicy_binding	lbvserver_dospolicy_binding[] = null;
	private lbvserver_copolicy_binding	lbvserver_copolicy_binding[] = null;
	private lbvserver_servicegroupmember_binding	lbvserver_servicegroupmember_binding[] = null;
	private lbvserver_authorizationpolicy_binding	lbvserver_authorizationpolicy_binding[] = null;
	private lbvserver_dnspolicy64_binding	lbvserver_dnspolicy64_binding[] = null;
	private lbvserver_cachepolicy_binding	lbvserver_cachepolicy_binding[] = null;
	private lbvserver_rewritepolicy_binding	lbvserver_rewritepolicy_binding[] = null;
	private lbvserver_pqpolicy_binding	lbvserver_pqpolicy_binding[] = null;
	private lbvserver_scpolicy_binding	lbvserver_scpolicy_binding[] = null;
	private lbvserver_servicegroup_binding	lbvserver_servicegroup_binding[] = null;
	private lbvserver_service_binding	lbvserver_service_binding[] = null;
	private lbvserver_tmtrafficpolicy_binding	lbvserver_tmtrafficpolicy_binding[] = null;
	private lbvserver_appqoepolicy_binding	lbvserver_appqoepolicy_binding[] = null;
	private lbvserver_auditsyslogpolicy_binding	lbvserver_auditsyslogpolicy_binding[] = null;
	private lbvserver_appfwpolicy_binding	lbvserver_appfwpolicy_binding[] = null;

	/**
	* <pre>
	* Name of the virtual server. If no name is provided, statistical data of all configured virtual servers is displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the virtual server. If no name is provided, statistical data of all configured virtual servers is displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_auditsyslogpolicy_binding[] get_lbvserver_auditsyslogpolicy_bindings() throws Exception {
		return this.lbvserver_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* pqpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_pqpolicy_binding[] get_lbvserver_pqpolicy_bindings() throws Exception {
		return this.lbvserver_pqpolicy_binding;
	}

	/**
	* <pre>
	* dnspolicy64 that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_dnspolicy64_binding[] get_lbvserver_dnspolicy64_bindings() throws Exception {
		return this.lbvserver_dnspolicy64_binding;
	}

	/**
	* <pre>
	* appfwpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_appfwpolicy_binding[] get_lbvserver_appfwpolicy_bindings() throws Exception {
		return this.lbvserver_appfwpolicy_binding;
	}

	/**
	* <pre>
	* rewritepolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_rewritepolicy_binding[] get_lbvserver_rewritepolicy_bindings() throws Exception {
		return this.lbvserver_rewritepolicy_binding;
	}

	/**
	* <pre>
	* spilloverpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_spilloverpolicy_binding[] get_lbvserver_spilloverpolicy_bindings() throws Exception {
		return this.lbvserver_spilloverpolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_auditnslogpolicy_binding[] get_lbvserver_auditnslogpolicy_bindings() throws Exception {
		return this.lbvserver_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* appqoepolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_appqoepolicy_binding[] get_lbvserver_appqoepolicy_bindings() throws Exception {
		return this.lbvserver_appqoepolicy_binding;
	}

	/**
	* <pre>
	* transformpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_transformpolicy_binding[] get_lbvserver_transformpolicy_bindings() throws Exception {
		return this.lbvserver_transformpolicy_binding;
	}

	/**
	* <pre>
	* filterpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_filterpolicy_binding[] get_lbvserver_filterpolicy_bindings() throws Exception {
		return this.lbvserver_filterpolicy_binding;
	}

	/**
	* <pre>
	* scpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_scpolicy_binding[] get_lbvserver_scpolicy_bindings() throws Exception {
		return this.lbvserver_scpolicy_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_csvserver_binding[] get_lbvserver_csvserver_bindings() throws Exception {
		return this.lbvserver_csvserver_binding;
	}

	/**
	* <pre>
	* copolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_copolicy_binding[] get_lbvserver_copolicy_bindings() throws Exception {
		return this.lbvserver_copolicy_binding;
	}

	/**
	* <pre>
	* appflowpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_appflowpolicy_binding[] get_lbvserver_appflowpolicy_bindings() throws Exception {
		return this.lbvserver_appflowpolicy_binding;
	}

	/**
	* <pre>
	* authorizationpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_authorizationpolicy_binding[] get_lbvserver_authorizationpolicy_bindings() throws Exception {
		return this.lbvserver_authorizationpolicy_binding;
	}

	/**
	* <pre>
	* servicegroup that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_servicegroup_binding[] get_lbvserver_servicegroup_bindings() throws Exception {
		return this.lbvserver_servicegroup_binding;
	}

	/**
	* <pre>
	* cachepolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_cachepolicy_binding[] get_lbvserver_cachepolicy_bindings() throws Exception {
		return this.lbvserver_cachepolicy_binding;
	}

	/**
	* <pre>
	* service that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_service_binding[] get_lbvserver_service_bindings() throws Exception {
		return this.lbvserver_service_binding;
	}

	/**
	* <pre>
	* servicegroupmember that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_servicegroupmember_binding[] get_lbvserver_servicegroupmember_bindings() throws Exception {
		return this.lbvserver_servicegroupmember_binding;
	}

	/**
	* <pre>
	* responderpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_responderpolicy_binding[] get_lbvserver_responderpolicy_bindings() throws Exception {
		return this.lbvserver_responderpolicy_binding;
	}

	/**
	* <pre>
	* dospolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_dospolicy_binding[] get_lbvserver_dospolicy_bindings() throws Exception {
		return this.lbvserver_dospolicy_binding;
	}

	/**
	* <pre>
	* tmtrafficpolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_tmtrafficpolicy_binding[] get_lbvserver_tmtrafficpolicy_bindings() throws Exception {
		return this.lbvserver_tmtrafficpolicy_binding;
	}

	/**
	* <pre>
	* cmppolicy that can be bound to lbvserver.
	* </pre>
	*/
	public lbvserver_cmppolicy_binding[] get_lbvserver_cmppolicy_bindings() throws Exception {
		return this.lbvserver_cmppolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbvserver_binding_response result = (lbvserver_binding_response) service.get_payload_formatter().string_to_resource(lbvserver_binding_response.class, response);
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
		return result.lbvserver_binding;
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
	* Use this API to fetch lbvserver_binding resource of given name .
	*/
	public static lbvserver_binding get(nitro_service service, String name) throws Exception{
		lbvserver_binding obj = new lbvserver_binding();
		obj.set_name(name);
		lbvserver_binding response = (lbvserver_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbvserver_binding resources of given names .
	*/
	public static lbvserver_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			lbvserver_binding response[] = new lbvserver_binding[name.length];
			lbvserver_binding obj[] = new lbvserver_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new lbvserver_binding();
				obj[i].set_name(name[i]);
				response[i] = (lbvserver_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}