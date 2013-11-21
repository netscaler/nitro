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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.config.cs.csvserver_copolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_spilloverpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_authorizationpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_filterpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_cachepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_rewritepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_cspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_cmppolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_appflowpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_tmtrafficpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_responderpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_transformpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cs.csvserver_appfwpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class csvserver_binding_response extends base_response
{
	public csvserver_binding[] csvserver_binding;
}
/**
	* Binding class showing the resources that can be bound to csvserver_binding. 
	*/

public class csvserver_binding extends base_resource
{
	private String name;
	private csvserver_copolicy_binding	csvserver_copolicy_binding[] = null;
	private csvserver_spilloverpolicy_binding	csvserver_spilloverpolicy_binding[] = null;
	private csvserver_auditnslogpolicy_binding	csvserver_auditnslogpolicy_binding[] = null;
	private csvserver_authorizationpolicy_binding	csvserver_authorizationpolicy_binding[] = null;
	private csvserver_filterpolicy_binding	csvserver_filterpolicy_binding[] = null;
	private csvserver_cachepolicy_binding	csvserver_cachepolicy_binding[] = null;
	private csvserver_rewritepolicy_binding	csvserver_rewritepolicy_binding[] = null;
	private csvserver_cspolicy_binding	csvserver_cspolicy_binding[] = null;
	private csvserver_cmppolicy_binding	csvserver_cmppolicy_binding[] = null;
	private csvserver_lbvserver_binding	csvserver_lbvserver_binding[] = null;
	private csvserver_appflowpolicy_binding	csvserver_appflowpolicy_binding[] = null;
	private csvserver_auditsyslogpolicy_binding	csvserver_auditsyslogpolicy_binding[] = null;
	private csvserver_tmtrafficpolicy_binding	csvserver_tmtrafficpolicy_binding[] = null;
	private csvserver_responderpolicy_binding	csvserver_responderpolicy_binding[] = null;
	private csvserver_transformpolicy_binding	csvserver_transformpolicy_binding[] = null;
	private csvserver_appfwpolicy_binding	csvserver_appfwpolicy_binding[] = null;

	/**
	* <pre>
	* Name of a content switching virtual server for which to display information, including the policies bound to the virtual server. To display a list of all configured Content Switching virtual servers, do not specify a value for this parameter.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of a content switching virtual server for which to display information, including the policies bound to the virtual server. To display a list of all configured Content Switching virtual servers, do not specify a value for this parameter.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* appflowpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_appflowpolicy_binding[] get_csvserver_appflowpolicy_bindings() throws Exception {
		return this.csvserver_appflowpolicy_binding;
	}

	/**
	* <pre>
	* appfwpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_appfwpolicy_binding[] get_csvserver_appfwpolicy_bindings() throws Exception {
		return this.csvserver_appfwpolicy_binding;
	}

	/**
	* <pre>
	* authorizationpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_authorizationpolicy_binding[] get_csvserver_authorizationpolicy_bindings() throws Exception {
		return this.csvserver_authorizationpolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_auditnslogpolicy_binding[] get_csvserver_auditnslogpolicy_bindings() throws Exception {
		return this.csvserver_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* tmtrafficpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_tmtrafficpolicy_binding[] get_csvserver_tmtrafficpolicy_bindings() throws Exception {
		return this.csvserver_tmtrafficpolicy_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_auditsyslogpolicy_binding[] get_csvserver_auditsyslogpolicy_bindings() throws Exception {
		return this.csvserver_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_lbvserver_binding[] get_csvserver_lbvserver_bindings() throws Exception {
		return this.csvserver_lbvserver_binding;
	}

	/**
	* <pre>
	* cmppolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_cmppolicy_binding[] get_csvserver_cmppolicy_bindings() throws Exception {
		return this.csvserver_cmppolicy_binding;
	}

	/**
	* <pre>
	* responderpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_responderpolicy_binding[] get_csvserver_responderpolicy_bindings() throws Exception {
		return this.csvserver_responderpolicy_binding;
	}

	/**
	* <pre>
	* rewritepolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_rewritepolicy_binding[] get_csvserver_rewritepolicy_bindings() throws Exception {
		return this.csvserver_rewritepolicy_binding;
	}

	/**
	* <pre>
	* spilloverpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_spilloverpolicy_binding[] get_csvserver_spilloverpolicy_bindings() throws Exception {
		return this.csvserver_spilloverpolicy_binding;
	}

	/**
	* <pre>
	* filterpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_filterpolicy_binding[] get_csvserver_filterpolicy_bindings() throws Exception {
		return this.csvserver_filterpolicy_binding;
	}

	/**
	* <pre>
	* cachepolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_cachepolicy_binding[] get_csvserver_cachepolicy_bindings() throws Exception {
		return this.csvserver_cachepolicy_binding;
	}

	/**
	* <pre>
	* cspolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_cspolicy_binding[] get_csvserver_cspolicy_bindings() throws Exception {
		return this.csvserver_cspolicy_binding;
	}

	/**
	* <pre>
	* copolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_copolicy_binding[] get_csvserver_copolicy_bindings() throws Exception {
		return this.csvserver_copolicy_binding;
	}

	/**
	* <pre>
	* transformpolicy that can be bound to csvserver.
	* </pre>
	*/
	public csvserver_transformpolicy_binding[] get_csvserver_transformpolicy_bindings() throws Exception {
		return this.csvserver_transformpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		csvserver_binding_response result = (csvserver_binding_response) service.get_payload_formatter().string_to_resource(csvserver_binding_response.class, response);
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
		return result.csvserver_binding;
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
	* Use this API to fetch csvserver_binding resource of given name .
	*/
	public static csvserver_binding get(nitro_service service, String name) throws Exception{
		csvserver_binding obj = new csvserver_binding();
		obj.set_name(name);
		csvserver_binding response = (csvserver_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch csvserver_binding resources of given names .
	*/
	public static csvserver_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			csvserver_binding response[] = new csvserver_binding[name.length];
			csvserver_binding obj[] = new csvserver_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new csvserver_binding();
				obj[i].set_name(name[i]);
				response[i] = (csvserver_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}