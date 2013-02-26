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

import com.citrix.netscaler.nitro.resource.config.vpn.vpntrafficpolicy_aaauser_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpntrafficpolicy_vpnglobal_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpntrafficpolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpntrafficpolicy_aaagroup_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpntrafficpolicy_binding_response extends base_response
{
	public vpntrafficpolicy_binding[] vpntrafficpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to vpntrafficpolicy_binding. 
	*/

public class vpntrafficpolicy_binding extends base_resource
{
	private String name;
	private vpntrafficpolicy_aaauser_binding	vpntrafficpolicy_aaauser_binding[] = null;
	private vpntrafficpolicy_vpnglobal_binding	vpntrafficpolicy_vpnglobal_binding[] = null;
	private vpntrafficpolicy_vpnvserver_binding	vpntrafficpolicy_vpnvserver_binding[] = null;
	private vpntrafficpolicy_aaagroup_binding	vpntrafficpolicy_aaagroup_binding[] = null;

	/**
	* <pre>
	* The name of the vpn trafiic policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the vpn trafiic policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* aaagroup that can be bound to vpntrafficpolicy.
	* </pre>
	*/
	public vpntrafficpolicy_aaagroup_binding[] get_vpntrafficpolicy_aaagroup_bindings() throws Exception {
		return this.vpntrafficpolicy_aaagroup_binding;
	}

	/**
	* <pre>
	* aaauser that can be bound to vpntrafficpolicy.
	* </pre>
	*/
	public vpntrafficpolicy_aaauser_binding[] get_vpntrafficpolicy_aaauser_bindings() throws Exception {
		return this.vpntrafficpolicy_aaauser_binding;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to vpntrafficpolicy.
	* </pre>
	*/
	public vpntrafficpolicy_vpnvserver_binding[] get_vpntrafficpolicy_vpnvserver_bindings() throws Exception {
		return this.vpntrafficpolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* vpnglobal that can be bound to vpntrafficpolicy.
	* </pre>
	*/
	public vpntrafficpolicy_vpnglobal_binding[] get_vpntrafficpolicy_vpnglobal_bindings() throws Exception {
		return this.vpntrafficpolicy_vpnglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpntrafficpolicy_binding_response result = (vpntrafficpolicy_binding_response) service.get_payload_formatter().string_to_resource(vpntrafficpolicy_binding_response.class, response);
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
		return result.vpntrafficpolicy_binding;
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
	* Use this API to fetch vpntrafficpolicy_binding resource of given name .
	*/
	public static vpntrafficpolicy_binding get(nitro_service service, String name) throws Exception{
		vpntrafficpolicy_binding obj = new vpntrafficpolicy_binding();
		obj.set_name(name);
		vpntrafficpolicy_binding response = (vpntrafficpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpntrafficpolicy_binding resources of given names .
	*/
	public static vpntrafficpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpntrafficpolicy_binding response[] = new vpntrafficpolicy_binding[name.length];
			vpntrafficpolicy_binding obj[] = new vpntrafficpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpntrafficpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (vpntrafficpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}