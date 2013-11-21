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

import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicylabel_sslpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslpolicylabel_binding_response extends base_response
{
	public sslpolicylabel_binding[] sslpolicylabel_binding;
}
/**
	* Binding class showing the resources that can be bound to sslpolicylabel_binding. 
	*/

public class sslpolicylabel_binding extends base_resource
{
	private String labelname;
	private sslpolicylabel_sslpolicy_binding	sslpolicylabel_sslpolicy_binding[] = null;

	/**
	* <pre>
	* Name of the SSL policy label for which to show detailed information.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the SSL policy label for which to show detailed information.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* sslpolicy that can be bound to sslpolicylabel.
	* </pre>
	*/
	public sslpolicylabel_sslpolicy_binding[] get_sslpolicylabel_sslpolicy_bindings() throws Exception {
		return this.sslpolicylabel_sslpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslpolicylabel_binding_response result = (sslpolicylabel_binding_response) service.get_payload_formatter().string_to_resource(sslpolicylabel_binding_response.class, response);
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
		return result.sslpolicylabel_binding;
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
	* Use this API to fetch sslpolicylabel_binding resource of given name .
	*/
	public static sslpolicylabel_binding get(nitro_service service, String labelname) throws Exception{
		sslpolicylabel_binding obj = new sslpolicylabel_binding();
		obj.set_labelname(labelname);
		sslpolicylabel_binding response = (sslpolicylabel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslpolicylabel_binding resources of given names .
	*/
	public static sslpolicylabel_binding[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			sslpolicylabel_binding response[] = new sslpolicylabel_binding[labelname.length];
			sslpolicylabel_binding obj[] = new sslpolicylabel_binding[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new sslpolicylabel_binding();
				obj[i].set_labelname(labelname[i]);
				response[i] = (sslpolicylabel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}