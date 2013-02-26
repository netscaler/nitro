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

import com.citrix.netscaler.nitro.resource.config.ssl.sslservice_sslcipher_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslservice_sslpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslservice_sslcertkey_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslservice_sslciphersuite_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslservice_binding_response extends base_response
{
	public sslservice_binding[] sslservice_binding;
}
/**
	* Binding class showing the resources that can be bound to sslservice_binding. 
	*/

public class sslservice_binding extends base_resource
{
	private String servicename;
	private sslservice_sslcipher_binding	sslservice_sslcipher_binding[] = null;
	private sslservice_sslpolicy_binding	sslservice_sslpolicy_binding[] = null;
	private sslservice_sslcertkey_binding	sslservice_sslcertkey_binding[] = null;
	private sslservice_sslciphersuite_binding	sslservice_sslciphersuite_binding[] = null;

	/**
	* <pre>
	* The name of the SSL service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the SSL service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* sslciphersuite that can be bound to sslservice.
	* </pre>
	*/
	public sslservice_sslciphersuite_binding[] get_sslservice_sslciphersuite_bindings() throws Exception {
		return this.sslservice_sslciphersuite_binding;
	}

	/**
	* <pre>
	* sslcertkey that can be bound to sslservice.
	* </pre>
	*/
	public sslservice_sslcertkey_binding[] get_sslservice_sslcertkey_bindings() throws Exception {
		return this.sslservice_sslcertkey_binding;
	}

	/**
	* <pre>
	* sslcipher that can be bound to sslservice.
	* </pre>
	*/
	public sslservice_sslcipher_binding[] get_sslservice_sslcipher_bindings() throws Exception {
		return this.sslservice_sslcipher_binding;
	}

	/**
	* <pre>
	* sslpolicy that can be bound to sslservice.
	* </pre>
	*/
	public sslservice_sslpolicy_binding[] get_sslservice_sslpolicy_bindings() throws Exception {
		return this.sslservice_sslpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslservice_binding_response result = (sslservice_binding_response) service.get_payload_formatter().string_to_resource(sslservice_binding_response.class, response);
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
		return result.sslservice_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicename;
	}

	/**
	* Use this API to fetch sslservice_binding resource of given name .
	*/
	public static sslservice_binding get(nitro_service service, String servicename) throws Exception{
		sslservice_binding obj = new sslservice_binding();
		obj.set_servicename(servicename);
		sslservice_binding response = (sslservice_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslservice_binding resources of given names .
	*/
	public static sslservice_binding[] get(nitro_service service, String servicename[]) throws Exception{
		if (servicename !=null && servicename.length>0) {
			sslservice_binding response[] = new sslservice_binding[servicename.length];
			sslservice_binding obj[] = new sslservice_binding[servicename.length];
			for (int i=0;i<servicename.length;i++) {
				obj[i] = new sslservice_binding();
				obj[i].set_servicename(servicename[i]);
				response[i] = (sslservice_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}