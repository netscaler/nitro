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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.config.vpn.vpnsessionpolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnsessionpolicy_aaagroup_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnsessionpolicy_aaauser_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnsessionpolicy_vpnglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnsessionpolicy_binding_response extends base_response
{
	public vpnsessionpolicy_binding[] vpnsessionpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to vpnsessionpolicy_binding. 
	*/

public class vpnsessionpolicy_binding extends base_resource
{
	private String name;
	private vpnsessionpolicy_vpnvserver_binding	vpnsessionpolicy_vpnvserver_binding[] = null;
	private vpnsessionpolicy_aaagroup_binding	vpnsessionpolicy_aaagroup_binding[] = null;
	private vpnsessionpolicy_aaauser_binding	vpnsessionpolicy_aaauser_binding[] = null;
	private vpnsessionpolicy_vpnglobal_binding	vpnsessionpolicy_vpnglobal_binding[] = null;

	/**
	* <pre>
	* The name of the vpn session policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the vpn session policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* vpnglobal that can be bound to vpnsessionpolicy.
	* </pre>
	*/
	public vpnsessionpolicy_vpnglobal_binding[] get_vpnsessionpolicy_vpnglobal_bindings() throws Exception {
		return this.vpnsessionpolicy_vpnglobal_binding;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to vpnsessionpolicy.
	* </pre>
	*/
	public vpnsessionpolicy_vpnvserver_binding[] get_vpnsessionpolicy_vpnvserver_bindings() throws Exception {
		return this.vpnsessionpolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* aaauser that can be bound to vpnsessionpolicy.
	* </pre>
	*/
	public vpnsessionpolicy_aaauser_binding[] get_vpnsessionpolicy_aaauser_bindings() throws Exception {
		return this.vpnsessionpolicy_aaauser_binding;
	}

	/**
	* <pre>
	* aaagroup that can be bound to vpnsessionpolicy.
	* </pre>
	*/
	public vpnsessionpolicy_aaagroup_binding[] get_vpnsessionpolicy_aaagroup_bindings() throws Exception {
		return this.vpnsessionpolicy_aaagroup_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnsessionpolicy_binding_response result = (vpnsessionpolicy_binding_response) service.get_payload_formatter().string_to_resource(vpnsessionpolicy_binding_response.class, response);
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
		return result.vpnsessionpolicy_binding;
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
	* Use this API to fetch vpnsessionpolicy_binding resource of given name .
	*/
	public static vpnsessionpolicy_binding get(nitro_service service, String name) throws Exception{
		vpnsessionpolicy_binding obj = new vpnsessionpolicy_binding();
		obj.set_name(name);
		vpnsessionpolicy_binding response = (vpnsessionpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnsessionpolicy_binding resources of given names .
	*/
	public static vpnsessionpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpnsessionpolicy_binding response[] = new vpnsessionpolicy_binding[name.length];
			vpnsessionpolicy_binding obj[] = new vpnsessionpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpnsessionpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (vpnsessionpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}