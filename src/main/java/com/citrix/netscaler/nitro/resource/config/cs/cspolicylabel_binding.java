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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.config.cs.cspolicylabel_cspolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cspolicylabel_binding_response extends base_response
{
	public cspolicylabel_binding[] cspolicylabel_binding;
}
/**
	* Binding class showing the resources that can be bound to cspolicylabel_binding. 
	*/

public class cspolicylabel_binding extends base_resource
{
	private String labelname;
	private cspolicylabel_cspolicy_binding	cspolicylabel_cspolicy_binding[] = null;

	/**
	* <pre>
	* Name of the content switching policy label to display.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the content switching policy label to display.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* cspolicy that can be bound to cspolicylabel.
	* </pre>
	*/
	public cspolicylabel_cspolicy_binding[] get_cspolicylabel_cspolicy_bindings() throws Exception {
		return this.cspolicylabel_cspolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cspolicylabel_binding_response result = (cspolicylabel_binding_response) service.get_payload_formatter().string_to_resource(cspolicylabel_binding_response.class, response);
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
		return result.cspolicylabel_binding;
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
	* Use this API to fetch cspolicylabel_binding resource of given name .
	*/
	public static cspolicylabel_binding get(nitro_service service, String labelname) throws Exception{
		cspolicylabel_binding obj = new cspolicylabel_binding();
		obj.set_labelname(labelname);
		cspolicylabel_binding response = (cspolicylabel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cspolicylabel_binding resources of given names .
	*/
	public static cspolicylabel_binding[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			cspolicylabel_binding response[] = new cspolicylabel_binding[labelname.length];
			cspolicylabel_binding obj[] = new cspolicylabel_binding[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new cspolicylabel_binding();
				obj[i].set_labelname(labelname[i]);
				response[i] = (cspolicylabel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}