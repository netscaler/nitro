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

import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_authenticationradiuspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_vpnsessionpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_vpnclientlessaccesspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_authenticationtacacspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_intranetip_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_authenticationsamlpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_vpnnexthopserver_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_staserver_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_authenticationldappolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_domain_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_authenticationcertpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_sharefileserver_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_vpntrafficpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_authenticationlocalpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_vpnurl_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_vpnintranetapplication_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_appcontroller_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_authenticationnegotiatepolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnglobal_binding_response extends base_response
{
	public vpnglobal_binding[] vpnglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to vpnglobal_binding. 
	*/

public class vpnglobal_binding extends base_resource
{
	private vpnglobal_auditnslogpolicy_binding	vpnglobal_auditnslogpolicy_binding[] = null;
	private vpnglobal_authenticationradiuspolicy_binding	vpnglobal_authenticationradiuspolicy_binding[] = null;
	private vpnglobal_vpnsessionpolicy_binding	vpnglobal_vpnsessionpolicy_binding[] = null;
	private vpnglobal_vpnclientlessaccesspolicy_binding	vpnglobal_vpnclientlessaccesspolicy_binding[] = null;
	private vpnglobal_authenticationtacacspolicy_binding	vpnglobal_authenticationtacacspolicy_binding[] = null;
	private vpnglobal_intranetip_binding	vpnglobal_intranetip_binding[] = null;
	private vpnglobal_authenticationsamlpolicy_binding	vpnglobal_authenticationsamlpolicy_binding[] = null;
	private vpnglobal_vpnnexthopserver_binding	vpnglobal_vpnnexthopserver_binding[] = null;
	private vpnglobal_staserver_binding	vpnglobal_staserver_binding[] = null;
	private vpnglobal_authenticationldappolicy_binding	vpnglobal_authenticationldappolicy_binding[] = null;
	private vpnglobal_auditsyslogpolicy_binding	vpnglobal_auditsyslogpolicy_binding[] = null;
	private vpnglobal_domain_binding	vpnglobal_domain_binding[] = null;
	private vpnglobal_authenticationcertpolicy_binding	vpnglobal_authenticationcertpolicy_binding[] = null;
	private vpnglobal_sharefileserver_binding	vpnglobal_sharefileserver_binding[] = null;
	private vpnglobal_vpntrafficpolicy_binding	vpnglobal_vpntrafficpolicy_binding[] = null;
	private vpnglobal_authenticationlocalpolicy_binding	vpnglobal_authenticationlocalpolicy_binding[] = null;
	private vpnglobal_vpnurl_binding	vpnglobal_vpnurl_binding[] = null;
	private vpnglobal_vpnintranetapplication_binding	vpnglobal_vpnintranetapplication_binding[] = null;
	private vpnglobal_appcontroller_binding	vpnglobal_appcontroller_binding[] = null;
	private vpnglobal_authenticationnegotiatepolicy_binding	vpnglobal_authenticationnegotiatepolicy_binding[] = null;

	/**
	* <pre>
	* vpnintranetapplication that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_vpnintranetapplication_binding[] get_vpnglobal_vpnintranetapplication_bindings() throws Exception {
		return this.vpnglobal_vpnintranetapplication_binding;
	}

	/**
	* <pre>
	* authenticationsamlpolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_authenticationsamlpolicy_binding[] get_vpnglobal_authenticationsamlpolicy_bindings() throws Exception {
		return this.vpnglobal_authenticationsamlpolicy_binding;
	}

	/**
	* <pre>
	* intranetip that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_intranetip_binding[] get_vpnglobal_intranetip_bindings() throws Exception {
		return this.vpnglobal_intranetip_binding;
	}

	/**
	* <pre>
	* authenticationradiuspolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_authenticationradiuspolicy_binding[] get_vpnglobal_authenticationradiuspolicy_bindings() throws Exception {
		return this.vpnglobal_authenticationradiuspolicy_binding;
	}

	/**
	* <pre>
	* staserver that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_staserver_binding[] get_vpnglobal_staserver_bindings() throws Exception {
		return this.vpnglobal_staserver_binding;
	}

	/**
	* <pre>
	* sharefileserver that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_sharefileserver_binding[] get_vpnglobal_sharefileserver_bindings() throws Exception {
		return this.vpnglobal_sharefileserver_binding;
	}

	/**
	* <pre>
	* appcontroller that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_appcontroller_binding[] get_vpnglobal_appcontroller_bindings() throws Exception {
		return this.vpnglobal_appcontroller_binding;
	}

	/**
	* <pre>
	* authenticationtacacspolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_authenticationtacacspolicy_binding[] get_vpnglobal_authenticationtacacspolicy_bindings() throws Exception {
		return this.vpnglobal_authenticationtacacspolicy_binding;
	}

	/**
	* <pre>
	* vpntrafficpolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_vpntrafficpolicy_binding[] get_vpnglobal_vpntrafficpolicy_bindings() throws Exception {
		return this.vpnglobal_vpntrafficpolicy_binding;
	}

	/**
	* <pre>
	* domain that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_domain_binding[] get_vpnglobal_domain_bindings() throws Exception {
		return this.vpnglobal_domain_binding;
	}

	/**
	* <pre>
	* vpnnexthopserver that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_vpnnexthopserver_binding[] get_vpnglobal_vpnnexthopserver_bindings() throws Exception {
		return this.vpnglobal_vpnnexthopserver_binding;
	}

	/**
	* <pre>
	* authenticationldappolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_authenticationldappolicy_binding[] get_vpnglobal_authenticationldappolicy_bindings() throws Exception {
		return this.vpnglobal_authenticationldappolicy_binding;
	}

	/**
	* <pre>
	* vpnsessionpolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_vpnsessionpolicy_binding[] get_vpnglobal_vpnsessionpolicy_bindings() throws Exception {
		return this.vpnglobal_vpnsessionpolicy_binding;
	}

	/**
	* <pre>
	* authenticationnegotiatepolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_authenticationnegotiatepolicy_binding[] get_vpnglobal_authenticationnegotiatepolicy_bindings() throws Exception {
		return this.vpnglobal_authenticationnegotiatepolicy_binding;
	}

	/**
	* <pre>
	* authenticationcertpolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_authenticationcertpolicy_binding[] get_vpnglobal_authenticationcertpolicy_bindings() throws Exception {
		return this.vpnglobal_authenticationcertpolicy_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_auditsyslogpolicy_binding[] get_vpnglobal_auditsyslogpolicy_bindings() throws Exception {
		return this.vpnglobal_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* vpnurl that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_vpnurl_binding[] get_vpnglobal_vpnurl_bindings() throws Exception {
		return this.vpnglobal_vpnurl_binding;
	}

	/**
	* <pre>
	* vpnclientlessaccesspolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_vpnclientlessaccesspolicy_binding[] get_vpnglobal_vpnclientlessaccesspolicy_bindings() throws Exception {
		return this.vpnglobal_vpnclientlessaccesspolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_auditnslogpolicy_binding[] get_vpnglobal_auditnslogpolicy_bindings() throws Exception {
		return this.vpnglobal_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* authenticationlocalpolicy that can be bound to vpnglobal.
	* </pre>
	*/
	public vpnglobal_authenticationlocalpolicy_binding[] get_vpnglobal_authenticationlocalpolicy_bindings() throws Exception {
		return this.vpnglobal_authenticationlocalpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnglobal_binding_response result = (vpnglobal_binding_response) service.get_payload_formatter().string_to_resource(vpnglobal_binding_response.class, response);
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
		return result.vpnglobal_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to fetch a vpnglobal_binding resource .
	*/
	public static vpnglobal_binding get(nitro_service service) throws Exception{
		vpnglobal_binding obj = new vpnglobal_binding();
		vpnglobal_binding response = (vpnglobal_binding) obj.get_resource(service);
		return response;
	}


}