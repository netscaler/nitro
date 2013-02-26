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

package com.citrix.netscaler.nitro.resource.config.authorization;

import com.citrix.netscaler.nitro.resource.config.authorization.authorizationpolicylabel_authorizationpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authorizationpolicylabel_binding_response extends base_response
{
	public authorizationpolicylabel_binding[] authorizationpolicylabel_binding;
}
/**
	* Binding class showing the resources that can be bound to authorizationpolicylabel_binding. 
	*/

public class authorizationpolicylabel_binding extends base_resource
{
	private String labelname;
	private authorizationpolicylabel_authorizationpolicy_binding	authorizationpolicylabel_authorizationpolicy_binding[] = null;

	/**
	* <pre>
	* Name of the authorization policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the authorization policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* authorizationpolicy that can be bound to authorizationpolicylabel.
	* </pre>
	*/
	public authorizationpolicylabel_authorizationpolicy_binding[] get_authorizationpolicylabel_authorizationpolicy_bindings() throws Exception {
		return this.authorizationpolicylabel_authorizationpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authorizationpolicylabel_binding_response result = (authorizationpolicylabel_binding_response) service.get_payload_formatter().string_to_resource(authorizationpolicylabel_binding_response.class, response);
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
		return result.authorizationpolicylabel_binding;
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
	* Use this API to fetch authorizationpolicylabel_binding resource of given name .
	*/
	public static authorizationpolicylabel_binding get(nitro_service service, String labelname) throws Exception{
		authorizationpolicylabel_binding obj = new authorizationpolicylabel_binding();
		obj.set_labelname(labelname);
		authorizationpolicylabel_binding response = (authorizationpolicylabel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authorizationpolicylabel_binding resources of given names .
	*/
	public static authorizationpolicylabel_binding[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			authorizationpolicylabel_binding response[] = new authorizationpolicylabel_binding[labelname.length];
			authorizationpolicylabel_binding obj[] = new authorizationpolicylabel_binding[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new authorizationpolicylabel_binding();
				obj[i].set_labelname(labelname[i]);
				response[i] = (authorizationpolicylabel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}