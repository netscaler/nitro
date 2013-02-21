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

package com.citrix.netscaler.nitro.resource.config.tm;

import com.citrix.netscaler.nitro.resource.config.tm.tmsessionpolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.config.tm.tmsessionpolicy_aaagroup_binding;
import com.citrix.netscaler.nitro.resource.config.tm.tmsessionpolicy_aaauser_binding;
import com.citrix.netscaler.nitro.resource.config.tm.tmsessionpolicy_tmglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tmsessionpolicy_binding_response extends base_response
{
	public tmsessionpolicy_binding[] tmsessionpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to tmsessionpolicy_binding. 
	*/

public class tmsessionpolicy_binding extends base_resource
{
	private String name;
	private tmsessionpolicy_authenticationvserver_binding	tmsessionpolicy_authenticationvserver_binding[] = null;
	private tmsessionpolicy_aaagroup_binding	tmsessionpolicy_aaagroup_binding[] = null;
	private tmsessionpolicy_aaauser_binding	tmsessionpolicy_aaauser_binding[] = null;
	private tmsessionpolicy_tmglobal_binding	tmsessionpolicy_tmglobal_binding[] = null;

	/**
	* <pre>
	* The name of the tm session policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the tm session policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* aaauser that can be bound to tmsessionpolicy.
	* </pre>
	*/
	public tmsessionpolicy_aaauser_binding[] get_tmsessionpolicy_aaauser_bindings() throws Exception {
		return this.tmsessionpolicy_aaauser_binding;
	}

	/**
	* <pre>
	* tmglobal that can be bound to tmsessionpolicy.
	* </pre>
	*/
	public tmsessionpolicy_tmglobal_binding[] get_tmsessionpolicy_tmglobal_bindings() throws Exception {
		return this.tmsessionpolicy_tmglobal_binding;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to tmsessionpolicy.
	* </pre>
	*/
	public tmsessionpolicy_authenticationvserver_binding[] get_tmsessionpolicy_authenticationvserver_bindings() throws Exception {
		return this.tmsessionpolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* aaagroup that can be bound to tmsessionpolicy.
	* </pre>
	*/
	public tmsessionpolicy_aaagroup_binding[] get_tmsessionpolicy_aaagroup_bindings() throws Exception {
		return this.tmsessionpolicy_aaagroup_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmsessionpolicy_binding_response result = (tmsessionpolicy_binding_response) service.get_payload_formatter().string_to_resource(tmsessionpolicy_binding_response.class, response);
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
		return result.tmsessionpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch tmsessionpolicy_binding resource of given name .
	*/
	public static tmsessionpolicy_binding get(nitro_service service, String name) throws Exception{
		tmsessionpolicy_binding obj = new tmsessionpolicy_binding();
		obj.set_name(name);
		tmsessionpolicy_binding response = (tmsessionpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmsessionpolicy_binding resources of given names .
	*/
	public static tmsessionpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmsessionpolicy_binding response[] = new tmsessionpolicy_binding[name.length];
			tmsessionpolicy_binding obj[] = new tmsessionpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmsessionpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (tmsessionpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}