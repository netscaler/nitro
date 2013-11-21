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

package com.citrix.netscaler.nitro.resource.config.wi;

import com.citrix.netscaler.nitro.resource.config.wi.wisite_translationinternalip_binding;
import com.citrix.netscaler.nitro.resource.config.wi.wisite_accessmethod_binding;
import com.citrix.netscaler.nitro.resource.config.wi.wisite_farmname_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class wisite_binding_response extends base_response
{
	public wisite_binding[] wisite_binding;
}
/**
	* Binding class showing the resources that can be bound to wisite_binding. 
	*/

public class wisite_binding extends base_resource
{
	private String sitepath;
	private wisite_translationinternalip_binding	wisite_translationinternalip_binding[] = null;
	private wisite_accessmethod_binding	wisite_accessmethod_binding[] = null;
	private wisite_farmname_binding	wisite_farmname_binding[] = null;

	/**
	* <pre>
	* Path of a Web Interface site whose details you want the NetScaler appliance to display.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public void set_sitepath(String sitepath) throws Exception{
		this.sitepath = sitepath;
	}

	/**
	* <pre>
	* Path of a Web Interface site whose details you want the NetScaler appliance to display.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public String get_sitepath() throws Exception {
		return this.sitepath;
	}

	/**
	* <pre>
	* translationinternalip that can be bound to wisite.
	* </pre>
	*/
	public wisite_translationinternalip_binding[] get_wisite_translationinternalip_bindings() throws Exception {
		return this.wisite_translationinternalip_binding;
	}

	/**
	* <pre>
	* accessmethod that can be bound to wisite.
	* </pre>
	*/
	public wisite_accessmethod_binding[] get_wisite_accessmethod_bindings() throws Exception {
		return this.wisite_accessmethod_binding;
	}

	/**
	* <pre>
	* farmname that can be bound to wisite.
	* </pre>
	*/
	public wisite_farmname_binding[] get_wisite_farmname_bindings() throws Exception {
		return this.wisite_farmname_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		wisite_binding_response result = (wisite_binding_response) service.get_payload_formatter().string_to_resource(wisite_binding_response.class, response);
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
		return result.wisite_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitepath;
	}

	/**
	* Use this API to fetch wisite_binding resource of given name .
	*/
	public static wisite_binding get(nitro_service service, String sitepath) throws Exception{
		wisite_binding obj = new wisite_binding();
		obj.set_sitepath(sitepath);
		wisite_binding response = (wisite_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch wisite_binding resources of given names .
	*/
	public static wisite_binding[] get(nitro_service service, String sitepath[]) throws Exception{
		if (sitepath !=null && sitepath.length>0) {
			wisite_binding response[] = new wisite_binding[sitepath.length];
			wisite_binding obj[] = new wisite_binding[sitepath.length];
			for (int i=0;i<sitepath.length;i++) {
				obj[i] = new wisite_binding();
				obj[i].set_sitepath(sitepath[i]);
				response[i] = (wisite_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}