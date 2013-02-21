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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.config.dns.dnsview_gslbservice_binding;
import com.citrix.netscaler.nitro.resource.config.dns.dnsview_dnspolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnsview_binding_response extends base_response
{
	public dnsview_binding[] dnsview_binding;
}
/**
	* Binding class showing the resources that can be bound to dnsview_binding. 
	*/

public class dnsview_binding extends base_resource
{
	private String viewname;
	private dnsview_gslbservice_binding	dnsview_gslbservice_binding[] = null;
	private dnsview_dnspolicy_binding	dnsview_dnspolicy_binding[] = null;

	/**
	* <pre>
	* The name of the view to be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_viewname(String viewname) throws Exception{
		this.viewname = viewname;
	}

	/**
	* <pre>
	* The name of the view to be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_viewname() throws Exception {
		return this.viewname;
	}

	/**
	* <pre>
	* dnspolicy that can be bound to dnsview.
	* </pre>
	*/
	public dnsview_dnspolicy_binding[] get_dnsview_dnspolicy_bindings() throws Exception {
		return this.dnsview_dnspolicy_binding;
	}

	/**
	* <pre>
	* gslbservice that can be bound to dnsview.
	* </pre>
	*/
	public dnsview_gslbservice_binding[] get_dnsview_gslbservice_bindings() throws Exception {
		return this.dnsview_gslbservice_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnsview_binding_response result = (dnsview_binding_response) service.get_payload_formatter().string_to_resource(dnsview_binding_response.class, response);
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
		return result.dnsview_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.viewname;
	}

	/**
	* Use this API to fetch dnsview_binding resource of given name .
	*/
	public static dnsview_binding get(nitro_service service, String viewname) throws Exception{
		dnsview_binding obj = new dnsview_binding();
		obj.set_viewname(viewname);
		dnsview_binding response = (dnsview_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsview_binding resources of given names .
	*/
	public static dnsview_binding[] get(nitro_service service, String viewname[]) throws Exception{
		if (viewname !=null && viewname.length>0) {
			dnsview_binding response[] = new dnsview_binding[viewname.length];
			dnsview_binding obj[] = new dnsview_binding[viewname.length];
			for (int i=0;i<viewname.length;i++) {
				obj[i] = new dnsview_binding();
				obj[i].set_viewname(viewname[i]);
				response[i] = (dnsview_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}