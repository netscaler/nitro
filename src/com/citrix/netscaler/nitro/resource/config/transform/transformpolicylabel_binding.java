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

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.config.transform.transformpolicylabel_policybinding_binding;
import com.citrix.netscaler.nitro.resource.config.transform.transformpolicylabel_transformpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformpolicylabel_binding_response extends base_response
{
	public transformpolicylabel_binding[] transformpolicylabel_binding;
}
/**
	* Binding class showing the resources that can be bound to transformpolicylabel_binding. 
	*/

public class transformpolicylabel_binding extends base_resource
{
	private String labelname;
	private transformpolicylabel_policybinding_binding	transformpolicylabel_policybinding_binding[] = null;
	private transformpolicylabel_transformpolicy_binding	transformpolicylabel_transformpolicy_binding[] = null;

	/**
	* <pre>
	* Name of the transform policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the transform policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* policybinding that can be bound to transformpolicylabel.
	* </pre>
	*/
	public transformpolicylabel_policybinding_binding[] get_transformpolicylabel_policybinding_bindings() throws Exception {
		return this.transformpolicylabel_policybinding_binding;
	}

	/**
	* <pre>
	* transformpolicy that can be bound to transformpolicylabel.
	* </pre>
	*/
	public transformpolicylabel_transformpolicy_binding[] get_transformpolicylabel_transformpolicy_bindings() throws Exception {
		return this.transformpolicylabel_transformpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformpolicylabel_binding_response result = (transformpolicylabel_binding_response) service.get_payload_formatter().string_to_resource(transformpolicylabel_binding_response.class, response);
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
		return result.transformpolicylabel_binding;
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
	* Use this API to fetch transformpolicylabel_binding resource of given name .
	*/
	public static transformpolicylabel_binding get(nitro_service service, String labelname) throws Exception{
		transformpolicylabel_binding obj = new transformpolicylabel_binding();
		obj.set_labelname(labelname);
		transformpolicylabel_binding response = (transformpolicylabel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch transformpolicylabel_binding resources of given names .
	*/
	public static transformpolicylabel_binding[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			transformpolicylabel_binding response[] = new transformpolicylabel_binding[labelname.length];
			transformpolicylabel_binding obj[] = new transformpolicylabel_binding[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new transformpolicylabel_binding();
				obj[i].set_labelname(labelname[i]);
				response[i] = (transformpolicylabel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}