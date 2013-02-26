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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.config.appfw.appfwpolicylabel_policybinding_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwpolicylabel_appfwpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwpolicylabel_binding_response extends base_response
{
	public appfwpolicylabel_binding[] appfwpolicylabel_binding;
}
/**
	* Binding class showing the resources that can be bound to appfwpolicylabel_binding. 
	*/

public class appfwpolicylabel_binding extends base_resource
{
	private String labelname;
	private appfwpolicylabel_policybinding_binding	appfwpolicylabel_policybinding_binding[] = null;
	private appfwpolicylabel_appfwpolicy_binding	appfwpolicylabel_appfwpolicy_binding[] = null;

	/**
	* <pre>
	* Name of the application firewall policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the application firewall policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* appfwpolicy that can be bound to appfwpolicylabel.
	* </pre>
	*/
	public appfwpolicylabel_appfwpolicy_binding[] get_appfwpolicylabel_appfwpolicy_bindings() throws Exception {
		return this.appfwpolicylabel_appfwpolicy_binding;
	}

	/**
	* <pre>
	* policybinding that can be bound to appfwpolicylabel.
	* </pre>
	*/
	public appfwpolicylabel_policybinding_binding[] get_appfwpolicylabel_policybinding_bindings() throws Exception {
		return this.appfwpolicylabel_policybinding_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwpolicylabel_binding_response result = (appfwpolicylabel_binding_response) service.get_payload_formatter().string_to_resource(appfwpolicylabel_binding_response.class, response);
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
		return result.appfwpolicylabel_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to fetch appfwpolicylabel_binding resource of given name .
	*/
	public static appfwpolicylabel_binding get(nitro_service service, String labelname) throws Exception{
		appfwpolicylabel_binding obj = new appfwpolicylabel_binding();
		obj.set_labelname(labelname);
		appfwpolicylabel_binding response = (appfwpolicylabel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwpolicylabel_binding resources of given names .
	*/
	public static appfwpolicylabel_binding[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			appfwpolicylabel_binding response[] = new appfwpolicylabel_binding[labelname.length];
			appfwpolicylabel_binding obj[] = new appfwpolicylabel_binding[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new appfwpolicylabel_binding();
				obj[i].set_labelname(labelname[i]);
				response[i] = (appfwpolicylabel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}