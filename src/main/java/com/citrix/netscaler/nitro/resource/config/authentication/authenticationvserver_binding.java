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

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_authenticationradiuspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_authenticationtacacspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_authenticationsamlpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_authenticationldappolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_authenticationcertpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_authenticationlocalpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_tmsessionpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationvserver_authenticationnegotiatepolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationvserver_binding_response extends base_response
{
	public authenticationvserver_binding[] authenticationvserver_binding;
}
/**
	* Binding class showing the resources that can be bound to authenticationvserver_binding. 
	*/

public class authenticationvserver_binding extends base_resource
{
	private String name;
	private authenticationvserver_auditnslogpolicy_binding	authenticationvserver_auditnslogpolicy_binding[] = null;
	private authenticationvserver_authenticationradiuspolicy_binding	authenticationvserver_authenticationradiuspolicy_binding[] = null;
	private authenticationvserver_authenticationtacacspolicy_binding	authenticationvserver_authenticationtacacspolicy_binding[] = null;
	private authenticationvserver_authenticationsamlpolicy_binding	authenticationvserver_authenticationsamlpolicy_binding[] = null;
	private authenticationvserver_authenticationldappolicy_binding	authenticationvserver_authenticationldappolicy_binding[] = null;
	private authenticationvserver_auditsyslogpolicy_binding	authenticationvserver_auditsyslogpolicy_binding[] = null;
	private authenticationvserver_authenticationcertpolicy_binding	authenticationvserver_authenticationcertpolicy_binding[] = null;
	private authenticationvserver_authenticationlocalpolicy_binding	authenticationvserver_authenticationlocalpolicy_binding[] = null;
	private authenticationvserver_tmsessionpolicy_binding	authenticationvserver_tmsessionpolicy_binding[] = null;
	private authenticationvserver_authenticationnegotiatepolicy_binding	authenticationvserver_authenticationnegotiatepolicy_binding[] = null;

	/**
	* <pre>
	* Name of the authentication virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the authentication virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* authenticationlocalpolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_authenticationlocalpolicy_binding[] get_authenticationvserver_authenticationlocalpolicy_bindings() throws Exception {
		return this.authenticationvserver_authenticationlocalpolicy_binding;
	}

	/**
	* <pre>
	* tmsessionpolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_tmsessionpolicy_binding[] get_authenticationvserver_tmsessionpolicy_bindings() throws Exception {
		return this.authenticationvserver_tmsessionpolicy_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_auditsyslogpolicy_binding[] get_authenticationvserver_auditsyslogpolicy_bindings() throws Exception {
		return this.authenticationvserver_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_auditnslogpolicy_binding[] get_authenticationvserver_auditnslogpolicy_bindings() throws Exception {
		return this.authenticationvserver_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* authenticationldappolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_authenticationldappolicy_binding[] get_authenticationvserver_authenticationldappolicy_bindings() throws Exception {
		return this.authenticationvserver_authenticationldappolicy_binding;
	}

	/**
	* <pre>
	* authenticationcertpolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_authenticationcertpolicy_binding[] get_authenticationvserver_authenticationcertpolicy_bindings() throws Exception {
		return this.authenticationvserver_authenticationcertpolicy_binding;
	}

	/**
	* <pre>
	* authenticationradiuspolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_authenticationradiuspolicy_binding[] get_authenticationvserver_authenticationradiuspolicy_bindings() throws Exception {
		return this.authenticationvserver_authenticationradiuspolicy_binding;
	}

	/**
	* <pre>
	* authenticationsamlpolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_authenticationsamlpolicy_binding[] get_authenticationvserver_authenticationsamlpolicy_bindings() throws Exception {
		return this.authenticationvserver_authenticationsamlpolicy_binding;
	}

	/**
	* <pre>
	* authenticationtacacspolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_authenticationtacacspolicy_binding[] get_authenticationvserver_authenticationtacacspolicy_bindings() throws Exception {
		return this.authenticationvserver_authenticationtacacspolicy_binding;
	}

	/**
	* <pre>
	* authenticationnegotiatepolicy that can be bound to authenticationvserver.
	* </pre>
	*/
	public authenticationvserver_authenticationnegotiatepolicy_binding[] get_authenticationvserver_authenticationnegotiatepolicy_bindings() throws Exception {
		return this.authenticationvserver_authenticationnegotiatepolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationvserver_binding_response result = (authenticationvserver_binding_response) service.get_payload_formatter().string_to_resource(authenticationvserver_binding_response.class, response);
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
		return result.authenticationvserver_binding;
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
	* Use this API to fetch authenticationvserver_binding resource of given name .
	*/
	public static authenticationvserver_binding get(nitro_service service, String name) throws Exception{
		authenticationvserver_binding obj = new authenticationvserver_binding();
		obj.set_name(name);
		authenticationvserver_binding response = (authenticationvserver_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationvserver_binding resources of given names .
	*/
	public static authenticationvserver_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationvserver_binding response[] = new authenticationvserver_binding[name.length];
			authenticationvserver_binding obj[] = new authenticationvserver_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationvserver_binding();
				obj[i].set_name(name[i]);
				response[i] = (authenticationvserver_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}