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

package com.citrix.netscaler.nitro.resource.config.ntp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ntpparam_response extends base_response
{
	public ntpparam ntpparam;
}
/**
* Configuration for NTP parameter resource.
*/

public class ntpparam extends base_resource
{
	private String authentication;
	private Long[] trustedkey;
	private Long autokeylogsec;
	private Long revokelogsec;

	/**
	* <pre>
	* Specifies if NTP AUTH is enabled or not. Default is YES.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* Specifies if NTP AUTH is enabled or not. Default is YES.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* Specifies the trusted keys entered.<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_trustedkey(Long[] trustedkey) throws Exception{
		this.trustedkey = trustedkey;
	}

	/**
	* <pre>
	* Specifies the trusted keys entered.<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public Long[] get_trustedkey() throws Exception {
		return this.trustedkey;
	}

	/**
	* <pre>
	* Specifies the interval between regenerations of the session key list used with the Autokey protocol, as a power of 2 in seconds.<br> Default value: 12<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_autokeylogsec(long autokeylogsec) throws Exception {
		this.autokeylogsec = new Long(autokeylogsec);
	}

	/**
	* <pre>
	* Specifies the interval between regenerations of the session key list used with the Autokey protocol, as a power of 2 in seconds.<br> Default value: 12<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_autokeylogsec(Long autokeylogsec) throws Exception{
		this.autokeylogsec = autokeylogsec;
	}

	/**
	* <pre>
	* Specifies the interval between regenerations of the session key list used with the Autokey protocol, as a power of 2 in seconds.<br> Default value: 12<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public Long get_autokeylogsec() throws Exception {
		return this.autokeylogsec;
	}

	/**
	* <pre>
	* Specifies the interval between re-randomization of certain cryptographic values used by the Autokey scheme, as a power of 2 in seconds.<br> Default value: 16<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_revokelogsec(long revokelogsec) throws Exception {
		this.revokelogsec = new Long(revokelogsec);
	}

	/**
	* <pre>
	* Specifies the interval between re-randomization of certain cryptographic values used by the Autokey scheme, as a power of 2 in seconds.<br> Default value: 16<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_revokelogsec(Long revokelogsec) throws Exception{
		this.revokelogsec = revokelogsec;
	}

	/**
	* <pre>
	* Specifies the interval between re-randomization of certain cryptographic values used by the Autokey scheme, as a power of 2 in seconds.<br> Default value: 16<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public Long get_revokelogsec() throws Exception {
		return this.revokelogsec;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ntpparam[] resources = new ntpparam[1];
		ntpparam_response result = (ntpparam_response) service.get_payload_formatter().string_to_resource(ntpparam_response.class, response);
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
		resources[0] = result.ntpparam;
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
	* Use this API to update ntpparam.
	*/
	public static base_response update(nitro_service client, ntpparam resource) throws Exception {
		ntpparam updateresource = new ntpparam();
		updateresource.authentication = resource.authentication;
		updateresource.trustedkey = resource.trustedkey;
		updateresource.autokeylogsec = resource.autokeylogsec;
		updateresource.revokelogsec = resource.revokelogsec;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of ntpparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, ntpparam resource, String[] args) throws Exception{
		ntpparam unsetresource = new ntpparam();
		unsetresource.authentication = resource.authentication;
		unsetresource.trustedkey = resource.trustedkey;
		unsetresource.autokeylogsec = resource.autokeylogsec;
		unsetresource.revokelogsec = resource.revokelogsec;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the ntpparam resources that are configured on netscaler.
	*/
	public static ntpparam get(nitro_service service) throws Exception{
		ntpparam obj = new ntpparam();
		ntpparam[] response = (ntpparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the ntpparam resources that are configured on netscaler.
	*/
	public static ntpparam get(nitro_service service,  options option) throws Exception{
		ntpparam obj = new ntpparam();
		ntpparam[] response = (ntpparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class authenticationEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
