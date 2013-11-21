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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_sslservice_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_sslvserver_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_sslpolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_sslglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslpolicy_binding_response extends base_response
{
	public sslpolicy_binding[] sslpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to sslpolicy_binding. 
	*/

public class sslpolicy_binding extends base_resource
{
	private String name;
	private sslpolicy_csvserver_binding	sslpolicy_csvserver_binding[] = null;
	private sslpolicy_sslservice_binding	sslpolicy_sslservice_binding[] = null;
	private sslpolicy_lbvserver_binding	sslpolicy_lbvserver_binding[] = null;
	private sslpolicy_sslvserver_binding	sslpolicy_sslvserver_binding[] = null;
	private sslpolicy_sslpolicylabel_binding	sslpolicy_sslpolicylabel_binding[] = null;
	private sslpolicy_sslglobal_binding	sslpolicy_sslglobal_binding[] = null;

	/**
	* <pre>
	* Name of the SSL policy for which to display detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the SSL policy for which to display detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* sslvserver that can be bound to sslpolicy.
	* </pre>
	*/
	public sslpolicy_sslvserver_binding[] get_sslpolicy_sslvserver_bindings() throws Exception {
		return this.sslpolicy_sslvserver_binding;
	}

	/**
	* <pre>
	* sslservice that can be bound to sslpolicy.
	* </pre>
	*/
	public sslpolicy_sslservice_binding[] get_sslpolicy_sslservice_bindings() throws Exception {
		return this.sslpolicy_sslservice_binding;
	}

	/**
	* <pre>
	* csvserver that can be bound to sslpolicy.
	* </pre>
	*/
	public sslpolicy_csvserver_binding[] get_sslpolicy_csvserver_bindings() throws Exception {
		return this.sslpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to sslpolicy.
	* </pre>
	*/
	public sslpolicy_lbvserver_binding[] get_sslpolicy_lbvserver_bindings() throws Exception {
		return this.sslpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* sslpolicylabel that can be bound to sslpolicy.
	* </pre>
	*/
	public sslpolicy_sslpolicylabel_binding[] get_sslpolicy_sslpolicylabel_bindings() throws Exception {
		return this.sslpolicy_sslpolicylabel_binding;
	}

	/**
	* <pre>
	* sslglobal that can be bound to sslpolicy.
	* </pre>
	*/
	public sslpolicy_sslglobal_binding[] get_sslpolicy_sslglobal_bindings() throws Exception {
		return this.sslpolicy_sslglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslpolicy_binding_response result = (sslpolicy_binding_response) service.get_payload_formatter().string_to_resource(sslpolicy_binding_response.class, response);
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
		return result.sslpolicy_binding;
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
	* Use this API to fetch sslpolicy_binding resource of given name .
	*/
	public static sslpolicy_binding get(nitro_service service, String name) throws Exception{
		sslpolicy_binding obj = new sslpolicy_binding();
		obj.set_name(name);
		sslpolicy_binding response = (sslpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslpolicy_binding resources of given names .
	*/
	public static sslpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			sslpolicy_binding response[] = new sslpolicy_binding[name.length];
			sslpolicy_binding obj[] = new sslpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new sslpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (sslpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}