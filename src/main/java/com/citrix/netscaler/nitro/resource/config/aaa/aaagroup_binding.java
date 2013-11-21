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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_vpnsessionpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_authorizationpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_intranetip_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_aaauser_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_vpnurl_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_vpntrafficpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_vpnintranetapplication_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaagroup_tmsessionpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaagroup_binding_response extends base_response
{
	public aaagroup_binding[] aaagroup_binding;
}
/**
	* Binding class showing the resources that can be bound to aaagroup_binding. 
	*/

public class aaagroup_binding extends base_resource
{
	private String groupname;
	private aaagroup_auditnslogpolicy_binding	aaagroup_auditnslogpolicy_binding[] = null;
	private aaagroup_vpnsessionpolicy_binding	aaagroup_vpnsessionpolicy_binding[] = null;
	private aaagroup_authorizationpolicy_binding	aaagroup_authorizationpolicy_binding[] = null;
	private aaagroup_intranetip_binding	aaagroup_intranetip_binding[] = null;
	private aaagroup_auditsyslogpolicy_binding	aaagroup_auditsyslogpolicy_binding[] = null;
	private aaagroup_aaauser_binding	aaagroup_aaauser_binding[] = null;
	private aaagroup_vpnurl_binding	aaagroup_vpnurl_binding[] = null;
	private aaagroup_vpntrafficpolicy_binding	aaagroup_vpntrafficpolicy_binding[] = null;
	private aaagroup_vpnintranetapplication_binding	aaagroup_vpnintranetapplication_binding[] = null;
	private aaagroup_tmsessionpolicy_binding	aaagroup_tmsessionpolicy_binding[] = null;

	/**
	* <pre>
	* Name of the group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* Name of the group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* vpntrafficpolicy that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_vpntrafficpolicy_binding[] get_aaagroup_vpntrafficpolicy_bindings() throws Exception {
		return this.aaagroup_vpntrafficpolicy_binding;
	}

	/**
	* <pre>
	* authorizationpolicy that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_authorizationpolicy_binding[] get_aaagroup_authorizationpolicy_bindings() throws Exception {
		return this.aaagroup_authorizationpolicy_binding;
	}

	/**
	* <pre>
	* intranetip that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_intranetip_binding[] get_aaagroup_intranetip_bindings() throws Exception {
		return this.aaagroup_intranetip_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_auditnslogpolicy_binding[] get_aaagroup_auditnslogpolicy_bindings() throws Exception {
		return this.aaagroup_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* vpnurl that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_vpnurl_binding[] get_aaagroup_vpnurl_bindings() throws Exception {
		return this.aaagroup_vpnurl_binding;
	}

	/**
	* <pre>
	* aaauser that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_aaauser_binding[] get_aaagroup_aaauser_bindings() throws Exception {
		return this.aaagroup_aaauser_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_auditsyslogpolicy_binding[] get_aaagroup_auditsyslogpolicy_bindings() throws Exception {
		return this.aaagroup_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* tmsessionpolicy that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_tmsessionpolicy_binding[] get_aaagroup_tmsessionpolicy_bindings() throws Exception {
		return this.aaagroup_tmsessionpolicy_binding;
	}

	/**
	* <pre>
	* vpnsessionpolicy that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_vpnsessionpolicy_binding[] get_aaagroup_vpnsessionpolicy_bindings() throws Exception {
		return this.aaagroup_vpnsessionpolicy_binding;
	}

	/**
	* <pre>
	* vpnintranetapplication that can be bound to aaagroup.
	* </pre>
	*/
	public aaagroup_vpnintranetapplication_binding[] get_aaagroup_vpnintranetapplication_bindings() throws Exception {
		return this.aaagroup_vpnintranetapplication_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaagroup_binding_response result = (aaagroup_binding_response) service.get_payload_formatter().string_to_resource(aaagroup_binding_response.class, response);
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
		return result.aaagroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.groupname;
	}

	/**
	* Use this API to fetch aaagroup_binding resource of given name .
	*/
	public static aaagroup_binding get(nitro_service service, String groupname) throws Exception{
		aaagroup_binding obj = new aaagroup_binding();
		obj.set_groupname(groupname);
		aaagroup_binding response = (aaagroup_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch aaagroup_binding resources of given names .
	*/
	public static aaagroup_binding[] get(nitro_service service, String groupname[]) throws Exception{
		if (groupname !=null && groupname.length>0) {
			aaagroup_binding response[] = new aaagroup_binding[groupname.length];
			aaagroup_binding obj[] = new aaagroup_binding[groupname.length];
			for (int i=0;i<groupname.length;i++) {
				obj[i] = new aaagroup_binding();
				obj[i].set_groupname(groupname[i]);
				response[i] = (aaagroup_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}