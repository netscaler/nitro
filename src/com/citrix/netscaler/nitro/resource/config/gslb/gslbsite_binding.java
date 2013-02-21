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

import com.citrix.netscaler.nitro.resource.config.gslb.gslbsite_gslbservice_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbsite_binding_response extends base_response
{
	public gslbsite_binding[] gslbsite_binding;
}
/**
	* Binding class showing the resources that can be bound to gslbsite_binding. 
	*/

public class gslbsite_binding extends base_resource
{
	private String sitename;
	private gslbsite_gslbservice_binding	gslbsite_gslbservice_binding[] = null;

	/**
	* <pre>
	* The name of the site. If sitename is specified, all the services created under that site will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sitename(String sitename) throws Exception{
		this.sitename = sitename;
	}

	/**
	* <pre>
	* The name of the site. If sitename is specified, all the services created under that site will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sitename() throws Exception {
		return this.sitename;
	}

	/**
	* <pre>
	* gslbservice that can be bound to gslbsite.
	* </pre>
	*/
	public gslbsite_gslbservice_binding[] get_gslbsite_gslbservice_bindings() throws Exception {
		return this.gslbsite_gslbservice_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbsite_binding_response result = (gslbsite_binding_response) service.get_payload_formatter().string_to_resource(gslbsite_binding_response.class, response);
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
		return result.gslbsite_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitename;
	}

	/**
	* Use this API to fetch gslbsite_binding resource of given name .
	*/
	public static gslbsite_binding get(nitro_service service, String sitename) throws Exception{
		gslbsite_binding obj = new gslbsite_binding();
		obj.set_sitename(sitename);
		gslbsite_binding response = (gslbsite_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch gslbsite_binding resources of given names .
	*/
	public static gslbsite_binding[] get(nitro_service service, String sitename[]) throws Exception{
		if (sitename !=null && sitename.length>0) {
			gslbsite_binding response[] = new gslbsite_binding[sitename.length];
			gslbsite_binding obj[] = new gslbsite_binding[sitename.length];
			for (int i=0;i<sitename.length;i++) {
				obj[i] = new gslbsite_binding();
				obj[i].set_sitename(sitename[i]);
				response[i] = (gslbsite_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}