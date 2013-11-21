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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslpkcs8_response extends base_response
{
	public sslpkcs8 sslpkcs8;
}
/**
* Configuration for pkcs8 resource.
*/

public class sslpkcs8 extends base_resource
{
	private String pkcs8file;
	private String keyfile;
	private String keyform;
	private String password;

	/**
	* <pre>
	* Name for and, optionally, path to, the output file where the PKCS#8 format key file is stored. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_pkcs8file(String pkcs8file) throws Exception{
		this.pkcs8file = pkcs8file;
	}

	/**
	* <pre>
	* Name for and, optionally, path to, the output file where the PKCS#8 format key file is stored. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_pkcs8file() throws Exception {
		return this.pkcs8file;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the input key file to be converted from PEM or DER format to PKCS#8 format. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_keyfile(String keyfile) throws Exception{
		this.keyfile = keyfile;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the input key file to be converted from PEM or DER format to PKCS#8 format. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_keyfile() throws Exception {
		return this.keyfile;
	}

	/**
	* <pre>
	* Format in which the key file is stored on the appliance.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_keyform(String keyform) throws Exception{
		this.keyform = keyform;
	}

	/**
	* <pre>
	* Format in which the key file is stored on the appliance.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_keyform() throws Exception {
		return this.keyform;
	}

	/**
	* <pre>
	* Password to assign to the file if the key is encrypted. Applies only for PEM format files.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* Password to assign to the file if the key is encrypted. Applies only for PEM format files.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslpkcs8[] resources = new sslpkcs8[1];
		sslpkcs8_response result = (sslpkcs8_response) service.get_payload_formatter().string_to_resource(sslpkcs8_response.class, response);
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
		resources[0] = result.sslpkcs8;
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
	* Use this API to convert sslpkcs8.
	*/
	public static base_response convert(nitro_service client, sslpkcs8 resource) throws Exception {
		sslpkcs8 convertresource = new sslpkcs8();
		convertresource.pkcs8file = resource.pkcs8file;
		convertresource.keyfile = resource.keyfile;
		convertresource.keyform = resource.keyform;
		convertresource.password = resource.password;
		return convertresource.perform_operation(client,"convert");
	}

	public static class keyformEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
}
