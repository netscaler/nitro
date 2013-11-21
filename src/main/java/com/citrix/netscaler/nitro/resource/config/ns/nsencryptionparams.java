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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsencryptionparams_response extends base_response
{
	public nsencryptionparams nsencryptionparams;
}

public class nsencryptionparams extends base_resource
{
	private String method;
	private String keyvalue;

	/**
	* <pre>
	* Cipher method (and key length) to be used to encrypt and decrypt content. The default value is AES256.<br> Possible values = NONE, RC4, DES3, AES128, AES192, AES256
	* </pre>
	*/
	public void set_method(String method) throws Exception{
		this.method = method;
	}

	/**
	* <pre>
	* Cipher method (and key length) to be used to encrypt and decrypt content. The default value is AES256.<br> Possible values = NONE, RC4, DES3, AES128, AES192, AES256
	* </pre>
	*/
	public String get_method() throws Exception {
		return this.method;
	}

	/**
	* <pre>
	* The base64-encoded key generation number, method, and key value. 
Note:
* Do not include this argument if you are changing the encryption method.
* To generate a new key value for the current encryption method, specify an empty string \(""\) as the value of this parameter. The parameter is passed implicitly, with its automatically generated value, to the NetScaler packet engines even when it is not included in the command. Passing the parameter to the packet engines enables the appliance to save the key value to the configuration file and to propagate the key value to the secondary appliance in a high availability setup.
	* </pre>
	*/
	public void set_keyvalue(String keyvalue) throws Exception{
		this.keyvalue = keyvalue;
	}

	/**
	* <pre>
	* The base64-encoded key generation number, method, and key value. 
Note:
* Do not include this argument if you are changing the encryption method.
* To generate a new key value for the current encryption method, specify an empty string \(""\) as the value of this parameter. The parameter is passed implicitly, with its automatically generated value, to the NetScaler packet engines even when it is not included in the command. Passing the parameter to the packet engines enables the appliance to save the key value to the configuration file and to propagate the key value to the secondary appliance in a high availability setup.
	* </pre>
	*/
	public String get_keyvalue() throws Exception {
		return this.keyvalue;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsencryptionparams[] resources = new nsencryptionparams[1];
		nsencryptionparams_response result = (nsencryptionparams_response) service.get_payload_formatter().string_to_resource(nsencryptionparams_response.class, response);
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
		resources[0] = result.nsencryptionparams;
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
	* Use this API to update nsencryptionparams.
	*/
	public static base_response update(nitro_service client, nsencryptionparams resource) throws Exception {
		nsencryptionparams updateresource = new nsencryptionparams();
		updateresource.method = resource.method;
		updateresource.keyvalue = resource.keyvalue;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to fetch all the nsencryptionparams resources that are configured on netscaler.
	*/
	public static nsencryptionparams get(nitro_service service) throws Exception{
		nsencryptionparams obj = new nsencryptionparams();
		nsencryptionparams[] response = (nsencryptionparams[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsencryptionparams resources that are configured on netscaler.
	*/
	public static nsencryptionparams get(nitro_service service,  options option) throws Exception{
		nsencryptionparams obj = new nsencryptionparams();
		nsencryptionparams[] response = (nsencryptionparams[])obj.get_resources(service,option);
		return response[0];
	}

	public static class methodEnum {
		public static final String NONE = "NONE";
		public static final String RC4 = "RC4";
		public static final String DES3 = "DES3";
		public static final String AES128 = "AES128";
		public static final String AES192 = "AES192";
		public static final String AES256 = "AES256";
	}
}
