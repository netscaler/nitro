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

import com.citrix.netscaler.nitro.resource.config.ssl.sslservicegroup_sslcipher_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslservicegroup_sslcertkey_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslservicegroup_sslciphersuite_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslservicegroup_binding_response extends base_response
{
	public sslservicegroup_binding[] sslservicegroup_binding;
}
/**
	* Binding class showing the resources that can be bound to sslservicegroup_binding. 
	*/

public class sslservicegroup_binding extends base_resource
{
	private String servicegroupname;
	private sslservicegroup_sslcipher_binding	sslservicegroup_sslcipher_binding[] = null;
	private sslservicegroup_sslcertkey_binding	sslservicegroup_sslcertkey_binding[] = null;
	private sslservicegroup_sslciphersuite_binding	sslservicegroup_sslciphersuite_binding[] = null;

	/**
	* <pre>
	* Name of the SSL service group for which to show detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* Name of the SSL service group for which to show detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* sslciphersuite that can be bound to sslservicegroup.
	* </pre>
	*/
	public sslservicegroup_sslciphersuite_binding[] get_sslservicegroup_sslciphersuite_bindings() throws Exception {
		return this.sslservicegroup_sslciphersuite_binding;
	}

	/**
	* <pre>
	* sslcipher that can be bound to sslservicegroup.
	* </pre>
	*/
	public sslservicegroup_sslcipher_binding[] get_sslservicegroup_sslcipher_bindings() throws Exception {
		return this.sslservicegroup_sslcipher_binding;
	}

	/**
	* <pre>
	* sslcertkey that can be bound to sslservicegroup.
	* </pre>
	*/
	public sslservicegroup_sslcertkey_binding[] get_sslservicegroup_sslcertkey_bindings() throws Exception {
		return this.sslservicegroup_sslcertkey_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslservicegroup_binding_response result = (sslservicegroup_binding_response) service.get_payload_formatter().string_to_resource(sslservicegroup_binding_response.class, response);
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
		return result.sslservicegroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to fetch sslservicegroup_binding resource of given name .
	*/
	public static sslservicegroup_binding get(nitro_service service, String servicegroupname) throws Exception{
		sslservicegroup_binding obj = new sslservicegroup_binding();
		obj.set_servicegroupname(servicegroupname);
		sslservicegroup_binding response = (sslservicegroup_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslservicegroup_binding resources of given names .
	*/
	public static sslservicegroup_binding[] get(nitro_service service, String servicegroupname[]) throws Exception{
		if (servicegroupname !=null && servicegroupname.length>0) {
			sslservicegroup_binding response[] = new sslservicegroup_binding[servicegroupname.length];
			sslservicegroup_binding obj[] = new sslservicegroup_binding[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++) {
				obj[i] = new sslservicegroup_binding();
				obj[i].set_servicegroupname(servicegroupname[i]);
				response[i] = (sslservicegroup_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}