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

import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_authenticationradiuspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_vpnsessionpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_vpnclientlessaccesspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_intranetip_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_vpnnexthopserver_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_appflowpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_authenticationldappolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_responderpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_sharefileserver_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_vpntrafficpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_authenticationlocalpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_vpnintranetapplication_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_appcontroller_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_authenticationnegotiatepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_aaapreauthenticationpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_cachepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_rewritepolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_authenticationtacacspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_authenticationsamlpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_staserver_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_authenticationcertpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnvserver_vpnurl_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnvserver_binding_response extends base_response
{
	public vpnvserver_binding[] vpnvserver_binding;
}
/**
	* Binding class showing the resources that can be bound to vpnvserver_binding. 
	*/

public class vpnvserver_binding extends base_resource
{
	private String name;
	private vpnvserver_auditnslogpolicy_binding	vpnvserver_auditnslogpolicy_binding[] = null;
	private vpnvserver_authenticationradiuspolicy_binding	vpnvserver_authenticationradiuspolicy_binding[] = null;
	private vpnvserver_vpnsessionpolicy_binding	vpnvserver_vpnsessionpolicy_binding[] = null;
	private vpnvserver_vpnclientlessaccesspolicy_binding	vpnvserver_vpnclientlessaccesspolicy_binding[] = null;
	private vpnvserver_intranetip_binding	vpnvserver_intranetip_binding[] = null;
	private vpnvserver_vpnnexthopserver_binding	vpnvserver_vpnnexthopserver_binding[] = null;
	private vpnvserver_appflowpolicy_binding	vpnvserver_appflowpolicy_binding[] = null;
	private vpnvserver_authenticationldappolicy_binding	vpnvserver_authenticationldappolicy_binding[] = null;
	private vpnvserver_responderpolicy_binding	vpnvserver_responderpolicy_binding[] = null;
	private vpnvserver_sharefileserver_binding	vpnvserver_sharefileserver_binding[] = null;
	private vpnvserver_vpntrafficpolicy_binding	vpnvserver_vpntrafficpolicy_binding[] = null;
	private vpnvserver_authenticationlocalpolicy_binding	vpnvserver_authenticationlocalpolicy_binding[] = null;
	private vpnvserver_vpnintranetapplication_binding	vpnvserver_vpnintranetapplication_binding[] = null;
	private vpnvserver_appcontroller_binding	vpnvserver_appcontroller_binding[] = null;
	private vpnvserver_authenticationnegotiatepolicy_binding	vpnvserver_authenticationnegotiatepolicy_binding[] = null;
	private vpnvserver_aaapreauthenticationpolicy_binding	vpnvserver_aaapreauthenticationpolicy_binding[] = null;
	private vpnvserver_cachepolicy_binding	vpnvserver_cachepolicy_binding[] = null;
	private vpnvserver_rewritepolicy_binding	vpnvserver_rewritepolicy_binding[] = null;
	private vpnvserver_authenticationtacacspolicy_binding	vpnvserver_authenticationtacacspolicy_binding[] = null;
	private vpnvserver_authenticationsamlpolicy_binding	vpnvserver_authenticationsamlpolicy_binding[] = null;
	private vpnvserver_staserver_binding	vpnvserver_staserver_binding[] = null;
	private vpnvserver_auditsyslogpolicy_binding	vpnvserver_auditsyslogpolicy_binding[] = null;
	private vpnvserver_authenticationcertpolicy_binding	vpnvserver_authenticationcertpolicy_binding[] = null;
	private vpnvserver_vpnurl_binding	vpnvserver_vpnurl_binding[] = null;

	/**
	* <pre>
	* Name of the Access Gateway virtual server for which to show detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the Access Gateway virtual server for which to show detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* vpnsessionpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_vpnsessionpolicy_binding[] get_vpnvserver_vpnsessionpolicy_bindings() throws Exception {
		return this.vpnvserver_vpnsessionpolicy_binding;
	}

	/**
	* <pre>
	* authenticationcertpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_authenticationcertpolicy_binding[] get_vpnvserver_authenticationcertpolicy_bindings() throws Exception {
		return this.vpnvserver_authenticationcertpolicy_binding;
	}

	/**
	* <pre>
	* staserver that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_staserver_binding[] get_vpnvserver_staserver_bindings() throws Exception {
		return this.vpnvserver_staserver_binding;
	}

	/**
	* <pre>
	* vpnnexthopserver that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_vpnnexthopserver_binding[] get_vpnvserver_vpnnexthopserver_bindings() throws Exception {
		return this.vpnvserver_vpnnexthopserver_binding;
	}

	/**
	* <pre>
	* authenticationsamlpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_authenticationsamlpolicy_binding[] get_vpnvserver_authenticationsamlpolicy_bindings() throws Exception {
		return this.vpnvserver_authenticationsamlpolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_auditnslogpolicy_binding[] get_vpnvserver_auditnslogpolicy_bindings() throws Exception {
		return this.vpnvserver_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_auditsyslogpolicy_binding[] get_vpnvserver_auditsyslogpolicy_bindings() throws Exception {
		return this.vpnvserver_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* sharefileserver that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_sharefileserver_binding[] get_vpnvserver_sharefileserver_bindings() throws Exception {
		return this.vpnvserver_sharefileserver_binding;
	}

	/**
	* <pre>
	* responderpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_responderpolicy_binding[] get_vpnvserver_responderpolicy_bindings() throws Exception {
		return this.vpnvserver_responderpolicy_binding;
	}

	/**
	* <pre>
	* appflowpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_appflowpolicy_binding[] get_vpnvserver_appflowpolicy_bindings() throws Exception {
		return this.vpnvserver_appflowpolicy_binding;
	}

	/**
	* <pre>
	* intranetip that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_intranetip_binding[] get_vpnvserver_intranetip_bindings() throws Exception {
		return this.vpnvserver_intranetip_binding;
	}

	/**
	* <pre>
	* vpntrafficpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_vpntrafficpolicy_binding[] get_vpnvserver_vpntrafficpolicy_bindings() throws Exception {
		return this.vpnvserver_vpntrafficpolicy_binding;
	}

	/**
	* <pre>
	* authenticationtacacspolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_authenticationtacacspolicy_binding[] get_vpnvserver_authenticationtacacspolicy_bindings() throws Exception {
		return this.vpnvserver_authenticationtacacspolicy_binding;
	}

	/**
	* <pre>
	* vpnintranetapplication that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_vpnintranetapplication_binding[] get_vpnvserver_vpnintranetapplication_bindings() throws Exception {
		return this.vpnvserver_vpnintranetapplication_binding;
	}

	/**
	* <pre>
	* vpnurl that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_vpnurl_binding[] get_vpnvserver_vpnurl_bindings() throws Exception {
		return this.vpnvserver_vpnurl_binding;
	}

	/**
	* <pre>
	* authenticationradiuspolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_authenticationradiuspolicy_binding[] get_vpnvserver_authenticationradiuspolicy_bindings() throws Exception {
		return this.vpnvserver_authenticationradiuspolicy_binding;
	}

	/**
	* <pre>
	* cachepolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_cachepolicy_binding[] get_vpnvserver_cachepolicy_bindings() throws Exception {
		return this.vpnvserver_cachepolicy_binding;
	}

	/**
	* <pre>
	* aaapreauthenticationpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_aaapreauthenticationpolicy_binding[] get_vpnvserver_aaapreauthenticationpolicy_bindings() throws Exception {
		return this.vpnvserver_aaapreauthenticationpolicy_binding;
	}

	/**
	* <pre>
	* rewritepolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_rewritepolicy_binding[] get_vpnvserver_rewritepolicy_bindings() throws Exception {
		return this.vpnvserver_rewritepolicy_binding;
	}

	/**
	* <pre>
	* authenticationldappolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_authenticationldappolicy_binding[] get_vpnvserver_authenticationldappolicy_bindings() throws Exception {
		return this.vpnvserver_authenticationldappolicy_binding;
	}

	/**
	* <pre>
	* authenticationnegotiatepolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_authenticationnegotiatepolicy_binding[] get_vpnvserver_authenticationnegotiatepolicy_bindings() throws Exception {
		return this.vpnvserver_authenticationnegotiatepolicy_binding;
	}

	/**
	* <pre>
	* authenticationlocalpolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_authenticationlocalpolicy_binding[] get_vpnvserver_authenticationlocalpolicy_bindings() throws Exception {
		return this.vpnvserver_authenticationlocalpolicy_binding;
	}

	/**
	* <pre>
	* appcontroller that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_appcontroller_binding[] get_vpnvserver_appcontroller_bindings() throws Exception {
		return this.vpnvserver_appcontroller_binding;
	}

	/**
	* <pre>
	* vpnclientlessaccesspolicy that can be bound to vpnvserver.
	* </pre>
	*/
	public vpnvserver_vpnclientlessaccesspolicy_binding[] get_vpnvserver_vpnclientlessaccesspolicy_bindings() throws Exception {
		return this.vpnvserver_vpnclientlessaccesspolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnvserver_binding_response result = (vpnvserver_binding_response) service.get_payload_formatter().string_to_resource(vpnvserver_binding_response.class, response);
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
		return result.vpnvserver_binding;
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
	* Use this API to fetch vpnvserver_binding resource of given name .
	*/
	public static vpnvserver_binding get(nitro_service service, String name) throws Exception{
		vpnvserver_binding obj = new vpnvserver_binding();
		obj.set_name(name);
		vpnvserver_binding response = (vpnvserver_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnvserver_binding resources of given names .
	*/
	public static vpnvserver_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpnvserver_binding response[] = new vpnvserver_binding[name.length];
			vpnvserver_binding obj[] = new vpnvserver_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpnvserver_binding();
				obj[i].set_name(name[i]);
				response[i] = (vpnvserver_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}