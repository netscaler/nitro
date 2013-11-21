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

class aaacertparams_response extends base_response
{
	public aaacertparams aaacertparams;
}
/**
* Configuration for certificate parameter resource.
*/

public class aaacertparams extends base_resource
{
	private String usernamefield;
	private String groupnamefield;
	private String defaultauthenticationgroup;

	//------- Read only Parameter ---------;

	private String twofactor;

	/**
	* <pre>
	* Client certificate field that contains the username, in the format <field>:<subfield>. .
	* </pre>
	*/
	public void set_usernamefield(String usernamefield) throws Exception{
		this.usernamefield = usernamefield;
	}

	/**
	* <pre>
	* Client certificate field that contains the username, in the format <field>:<subfield>. .
	* </pre>
	*/
	public String get_usernamefield() throws Exception {
		return this.usernamefield;
	}

	/**
	* <pre>
	* Client certificate field that specifies the group, in the format <field>:<subfield>.
	* </pre>
	*/
	public void set_groupnamefield(String groupnamefield) throws Exception{
		this.groupnamefield = groupnamefield;
	}

	/**
	* <pre>
	* Client certificate field that specifies the group, in the format <field>:<subfield>.
	* </pre>
	*/
	public String get_groupnamefield() throws Exception {
		return this.groupnamefield;
	}

	/**
	* <pre>
	* This is the default group that is chosen when the authentication succeeds in addition to extracted groups.<br> Maximum length =  64
	* </pre>
	*/
	public void set_defaultauthenticationgroup(String defaultauthenticationgroup) throws Exception{
		this.defaultauthenticationgroup = defaultauthenticationgroup;
	}

	/**
	* <pre>
	* This is the default group that is chosen when the authentication succeeds in addition to extracted groups.<br> Maximum length =  64
	* </pre>
	*/
	public String get_defaultauthenticationgroup() throws Exception {
		return this.defaultauthenticationgroup;
	}

	/**
	* <pre>
	* The state of the two-factor authentication.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_twofactor() throws Exception {
		return this.twofactor;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		aaacertparams[] resources = new aaacertparams[1];
		aaacertparams_response result = (aaacertparams_response) service.get_payload_formatter().string_to_resource(aaacertparams_response.class, response);
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
		resources[0] = result.aaacertparams;
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
	* Use this API to update aaacertparams.
	*/
	public static base_response update(nitro_service client, aaacertparams resource) throws Exception {
		aaacertparams updateresource = new aaacertparams();
		updateresource.usernamefield = resource.usernamefield;
		updateresource.groupnamefield = resource.groupnamefield;
		updateresource.defaultauthenticationgroup = resource.defaultauthenticationgroup;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaacertparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaacertparams resource, String[] args) throws Exception{
		aaacertparams unsetresource = new aaacertparams();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the aaacertparams resources that are configured on netscaler.
	*/
	public static aaacertparams get(nitro_service service) throws Exception{
		aaacertparams obj = new aaacertparams();
		aaacertparams[] response = (aaacertparams[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the aaacertparams resources that are configured on netscaler.
	*/
	public static aaacertparams get(nitro_service service,  options option) throws Exception{
		aaacertparams obj = new aaacertparams();
		aaacertparams[] response = (aaacertparams[])obj.get_resources(service,option);
		return response[0];
	}

	public static class twofactorEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
