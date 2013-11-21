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

import com.citrix.netscaler.nitro.resource.config.ssl.sslcertkey_sslvserver_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcertkey_sslocspresponder_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcertkey_service_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcertkey_crldistribution_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslcertkey_binding_response extends base_response
{
	public sslcertkey_binding[] sslcertkey_binding;
}
/**
	* Binding class showing the resources that can be bound to sslcertkey_binding. 
	*/

public class sslcertkey_binding extends base_resource
{
	private String certkey;
	private sslcertkey_sslvserver_binding	sslcertkey_sslvserver_binding[] = null;
	private sslcertkey_sslocspresponder_binding	sslcertkey_sslocspresponder_binding[] = null;
	private sslcertkey_service_binding	sslcertkey_service_binding[] = null;
	private sslcertkey_crldistribution_binding	sslcertkey_crldistribution_binding[] = null;

	/**
	* <pre>
	* Name of the certificate-key pair for which to show detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public void set_certkey(String certkey) throws Exception{
		this.certkey = certkey;
	}

	/**
	* <pre>
	* Name of the certificate-key pair for which to show detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public String get_certkey() throws Exception {
		return this.certkey;
	}

	/**
	* <pre>
	* crldistribution that can be bound to sslcertkey.
	* </pre>
	*/
	public sslcertkey_crldistribution_binding[] get_sslcertkey_crldistribution_bindings() throws Exception {
		return this.sslcertkey_crldistribution_binding;
	}

	/**
	* <pre>
	* sslvserver that can be bound to sslcertkey.
	* </pre>
	*/
	public sslcertkey_sslvserver_binding[] get_sslcertkey_sslvserver_bindings() throws Exception {
		return this.sslcertkey_sslvserver_binding;
	}

	/**
	* <pre>
	* sslocspresponder that can be bound to sslcertkey.
	* </pre>
	*/
	public sslcertkey_sslocspresponder_binding[] get_sslcertkey_sslocspresponder_bindings() throws Exception {
		return this.sslcertkey_sslocspresponder_binding;
	}

	/**
	* <pre>
	* service that can be bound to sslcertkey.
	* </pre>
	*/
	public sslcertkey_service_binding[] get_sslcertkey_service_bindings() throws Exception {
		return this.sslcertkey_service_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcertkey_binding_response result = (sslcertkey_binding_response) service.get_payload_formatter().string_to_resource(sslcertkey_binding_response.class, response);
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
		return result.sslcertkey_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.certkey;
	}

	/**
	* Use this API to fetch sslcertkey_binding resource of given name .
	*/
	public static sslcertkey_binding get(nitro_service service, String certkey) throws Exception{
		sslcertkey_binding obj = new sslcertkey_binding();
		obj.set_certkey(certkey);
		sslcertkey_binding response = (sslcertkey_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslcertkey_binding resources of given names .
	*/
	public static sslcertkey_binding[] get(nitro_service service, String certkey[]) throws Exception{
		if (certkey !=null && certkey.length>0) {
			sslcertkey_binding response[] = new sslcertkey_binding[certkey.length];
			sslcertkey_binding obj[] = new sslcertkey_binding[certkey.length];
			for (int i=0;i<certkey.length;i++) {
				obj[i] = new sslcertkey_binding();
				obj[i].set_certkey(certkey[i]);
				response[i] = (sslcertkey_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}