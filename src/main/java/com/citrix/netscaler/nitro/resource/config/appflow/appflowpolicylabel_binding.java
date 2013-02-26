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

package com.citrix.netscaler.nitro.resource.config.appflow;

import com.citrix.netscaler.nitro.resource.config.appflow.appflowpolicylabel_appflowpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appflowpolicylabel_binding_response extends base_response
{
	public appflowpolicylabel_binding[] appflowpolicylabel_binding;
}
/**
	* Binding class showing the resources that can be bound to appflowpolicylabel_binding. 
	*/

public class appflowpolicylabel_binding extends base_resource
{
	private String labelname;
	private appflowpolicylabel_appflowpolicy_binding	appflowpolicylabel_appflowpolicy_binding[] = null;

	/**
	* <pre>
	* The name of the AppFlow policy label.<br> Minimum length =  1
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* The name of the AppFlow policy label.<br> Minimum length =  1
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* appflowpolicy that can be bound to appflowpolicylabel.
	* </pre>
	*/
	public appflowpolicylabel_appflowpolicy_binding[] get_appflowpolicylabel_appflowpolicy_bindings() throws Exception {
		return this.appflowpolicylabel_appflowpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appflowpolicylabel_binding_response result = (appflowpolicylabel_binding_response) service.get_payload_formatter().string_to_resource(appflowpolicylabel_binding_response.class, response);
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
		return result.appflowpolicylabel_binding;
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
	* Use this API to fetch appflowpolicylabel_binding resource of given name .
	*/
	public static appflowpolicylabel_binding get(nitro_service service, String labelname) throws Exception{
		appflowpolicylabel_binding obj = new appflowpolicylabel_binding();
		obj.set_labelname(labelname);
		appflowpolicylabel_binding response = (appflowpolicylabel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appflowpolicylabel_binding resources of given names .
	*/
	public static appflowpolicylabel_binding[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			appflowpolicylabel_binding response[] = new appflowpolicylabel_binding[labelname.length];
			appflowpolicylabel_binding obj[] = new appflowpolicylabel_binding[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new appflowpolicylabel_binding();
				obj[i].set_labelname(labelname[i]);
				response[i] = (appflowpolicylabel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}