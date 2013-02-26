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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaatacacsparams_response extends base_response
{
	public aaatacacsparams aaatacacsparams;
}
/**
* Configuration for tacacs parameters resource.
*/

public class aaatacacsparams extends base_resource
{
	private String serverip;
	private Integer serverport;
	private Long authtimeout;
	private String tacacssecret;
	private String authorization;
	private String accounting;
	private String auditfailedcmds;

	/**
	* <pre>
	* The IP address of the TACACS+ server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* The IP address of the TACACS+ server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* The port on which the TACACS+ server is running.<br> Default value: 49<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* The port on which the TACACS+ server is running.<br> Default value: 49<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* The port on which the TACACS+ server is running.<br> Default value: 49<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the TACACS+ server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(long authtimeout) throws Exception {
		this.authtimeout = new Long(authtimeout);
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the TACACS+ server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(Long authtimeout) throws Exception{
		this.authtimeout = authtimeout;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the TACACS+ server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public Long get_authtimeout() throws Exception {
		return this.authtimeout;
	}

	/**
	* <pre>
	* The key shared between the client and the server. This information is required for the system to
communicate with the TACACS+ server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_tacacssecret(String tacacssecret) throws Exception{
		this.tacacssecret = tacacssecret;
	}

	/**
	* <pre>
	* The key shared between the client and the server. This information is required for the system to
communicate with the TACACS+ server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_tacacssecret() throws Exception {
		return this.tacacssecret;
	}

	/**
	* <pre>
	* The option for streaming authorization for the TACACS+ server.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authorization(String authorization) throws Exception{
		this.authorization = authorization;
	}

	/**
	* <pre>
	* The option for streaming authorization for the TACACS+ server.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authorization() throws Exception {
		return this.authorization;
	}

	/**
	* <pre>
	* The option for sending accounting messages to the TACACS+ server.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_accounting(String accounting) throws Exception{
		this.accounting = accounting;
	}

	/**
	* <pre>
	* The option for sending accounting messages to the TACACS+ server.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_accounting() throws Exception {
		return this.accounting;
	}

	/**
	* <pre>
	* The option for sending accounting messages to the TACACS+ server.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_auditfailedcmds(String auditfailedcmds) throws Exception{
		this.auditfailedcmds = auditfailedcmds;
	}

	/**
	* <pre>
	* The option for sending accounting messages to the TACACS+ server.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_auditfailedcmds() throws Exception {
		return this.auditfailedcmds;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		aaatacacsparams[] resources = new aaatacacsparams[1];
		aaatacacsparams_response result = (aaatacacsparams_response) service.get_payload_formatter().string_to_resource(aaatacacsparams_response.class, response);
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
		resources[0] = result.aaatacacsparams;
		return resources;
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
	* Use this API to update aaatacacsparams.
	*/
	public static base_response update(nitro_service client, aaatacacsparams resource) throws Exception {
		aaatacacsparams updateresource = new aaatacacsparams();
		updateresource.serverip = resource.serverip;
		updateresource.serverport = resource.serverport;
		updateresource.authtimeout = resource.authtimeout;
		updateresource.tacacssecret = resource.tacacssecret;
		updateresource.authorization = resource.authorization;
		updateresource.accounting = resource.accounting;
		updateresource.auditfailedcmds = resource.auditfailedcmds;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaatacacsparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaatacacsparams resource, String[] args) throws Exception{
		aaatacacsparams unsetresource = new aaatacacsparams();
		unsetresource.serverip = resource.serverip;
		unsetresource.serverport = resource.serverport;
		unsetresource.authtimeout = resource.authtimeout;
		unsetresource.tacacssecret = resource.tacacssecret;
		unsetresource.authorization = resource.authorization;
		unsetresource.accounting = resource.accounting;
		unsetresource.auditfailedcmds = resource.auditfailedcmds;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the aaatacacsparams resources that are configured on netscaler.
	*/
	public static aaatacacsparams get(nitro_service service) throws Exception{
		aaatacacsparams obj = new aaatacacsparams();
		aaatacacsparams[] response = (aaatacacsparams[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the aaatacacsparams resources that are configured on netscaler.
	*/
	public static aaatacacsparams get(nitro_service service,  options option) throws Exception{
		aaatacacsparams obj = new aaatacacsparams();
		aaatacacsparams[] response = (aaatacacsparams[])obj.get_resources(service,option);
		return response[0];
	}

	public static class auditfailedcmdsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class authorizationEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class accountingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
