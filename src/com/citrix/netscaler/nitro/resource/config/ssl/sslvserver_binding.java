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

import com.citrix.netscaler.nitro.resource.config.ssl.sslvserver_sslpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslvserver_sslcipher_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslvserver_sslcertkey_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslvserver_sslciphersuite_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslvserver_binding_response extends base_response
{
	public sslvserver_binding[] sslvserver_binding;
}
/**
	* Binding class showing the resources that can be bound to sslvserver_binding. 
	*/

public class sslvserver_binding extends base_resource
{
	private String vservername;
	private sslvserver_sslpolicy_binding	sslvserver_sslpolicy_binding[] = null;
	private sslvserver_sslcipher_binding	sslvserver_sslcipher_binding[] = null;
	private sslvserver_sslcertkey_binding	sslvserver_sslcertkey_binding[] = null;
	private sslvserver_sslciphersuite_binding	sslvserver_sslciphersuite_binding[] = null;

	/**
	* <pre>
	* The name of the SSL virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* The name of the SSL virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* sslpolicy that can be bound to sslvserver.
	* </pre>
	*/
	public sslvserver_sslpolicy_binding[] get_sslvserver_sslpolicy_bindings() throws Exception {
		return this.sslvserver_sslpolicy_binding;
	}

	/**
	* <pre>
	* sslcertkey that can be bound to sslvserver.
	* </pre>
	*/
	public sslvserver_sslcertkey_binding[] get_sslvserver_sslcertkey_bindings() throws Exception {
		return this.sslvserver_sslcertkey_binding;
	}

	/**
	* <pre>
	* sslciphersuite that can be bound to sslvserver.
	* </pre>
	*/
	public sslvserver_sslciphersuite_binding[] get_sslvserver_sslciphersuite_bindings() throws Exception {
		return this.sslvserver_sslciphersuite_binding;
	}

	/**
	* <pre>
	* sslcipher that can be bound to sslvserver.
	* </pre>
	*/
	public sslvserver_sslcipher_binding[] get_sslvserver_sslcipher_bindings() throws Exception {
		return this.sslvserver_sslcipher_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslvserver_binding_response result = (sslvserver_binding_response) service.get_payload_formatter().string_to_resource(sslvserver_binding_response.class, response);
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
		return result.sslvserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.vservername;
	}

	/**
	* Use this API to fetch sslvserver_binding resource of given name .
	*/
	public static sslvserver_binding get(nitro_service service, String vservername) throws Exception{
		sslvserver_binding obj = new sslvserver_binding();
		obj.set_vservername(vservername);
		sslvserver_binding response = (sslvserver_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslvserver_binding resources of given names .
	*/
	public static sslvserver_binding[] get(nitro_service service, String vservername[]) throws Exception{
		if (vservername !=null && vservername.length>0) {
			sslvserver_binding response[] = new sslvserver_binding[vservername.length];
			sslvserver_binding obj[] = new sslvserver_binding[vservername.length];
			for (int i=0;i<vservername.length;i++) {
				obj[i] = new sslvserver_binding();
				obj[i].set_vservername(vservername[i]);
				response[i] = (sslvserver_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}