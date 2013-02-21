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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.config.gslb.gslbservice_lbmonitor_binding;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbservice_dnsview_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbservice_binding_response extends base_response
{
	public gslbservice_binding[] gslbservice_binding;
}
/**
	* Binding class showing the resources that can be bound to gslbservice_binding. 
	*/

public class gslbservice_binding extends base_resource
{
	private String servicename;
	private gslbservice_lbmonitor_binding	gslbservice_lbmonitor_binding[] = null;
	private gslbservice_dnsview_binding	gslbservice_dnsview_binding[] = null;

	/**
	* <pre>
	* The name of the gslb service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the gslb service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* lbmonitor that can be bound to gslbservice.
	* </pre>
	*/
	public gslbservice_lbmonitor_binding[] get_gslbservice_lbmonitor_bindings() throws Exception {
		return this.gslbservice_lbmonitor_binding;
	}

	/**
	* <pre>
	* dnsview that can be bound to gslbservice.
	* </pre>
	*/
	public gslbservice_dnsview_binding[] get_gslbservice_dnsview_bindings() throws Exception {
		return this.gslbservice_dnsview_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbservice_binding_response result = (gslbservice_binding_response) service.get_payload_formatter().string_to_resource(gslbservice_binding_response.class, response);
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
		return result.gslbservice_binding;
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
	* Use this API to fetch gslbservice_binding resource of given name .
	*/
	public static gslbservice_binding get(nitro_service service, String servicename) throws Exception{
		gslbservice_binding obj = new gslbservice_binding();
		obj.set_servicename(servicename);
		gslbservice_binding response = (gslbservice_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch gslbservice_binding resources of given names .
	*/
	public static gslbservice_binding[] get(nitro_service service, String servicename[]) throws Exception{
		if (servicename !=null && servicename.length>0) {
			gslbservice_binding response[] = new gslbservice_binding[servicename.length];
			gslbservice_binding obj[] = new gslbservice_binding[servicename.length];
			for (int i=0;i<servicename.length;i++) {
				obj[i] = new gslbservice_binding();
				obj[i].set_servicename(servicename[i]);
				response[i] = (gslbservice_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}