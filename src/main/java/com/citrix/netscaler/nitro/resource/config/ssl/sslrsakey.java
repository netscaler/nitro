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

class sslrsakey_response extends base_response
{
	public sslrsakey sslrsakey;
}
/**
* Configuration for RSA key resource.
*/

public class sslrsakey extends base_resource
{
	private String keyfile;
	private Long bits;
	private String exponent;
	private String keyform;
	private Boolean des;
	private Boolean des3;
	private String password;

	/**
	* <pre>
	* Name for and, optionally, path to the RSA key file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_keyfile(String keyfile) throws Exception{
		this.keyfile = keyfile;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the RSA key file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_keyfile() throws Exception {
		return this.keyfile;
	}

	/**
	* <pre>
	* Size, in bits, of the RSA key.<br> Minimum value =  512<br> Maximum value =  4096
	* </pre>
	*/
	public void set_bits(long bits) throws Exception {
		this.bits = new Long(bits);
	}

	/**
	* <pre>
	* Size, in bits, of the RSA key.<br> Minimum value =  512<br> Maximum value =  4096
	* </pre>
	*/
	public void set_bits(Long bits) throws Exception{
		this.bits = bits;
	}

	/**
	* <pre>
	* Size, in bits, of the RSA key.<br> Minimum value =  512<br> Maximum value =  4096
	* </pre>
	*/
	public Long get_bits() throws Exception {
		return this.bits;
	}

	/**
	* <pre>
	* Public exponent for the RSA key. The exponent is part of the cipher algorithm and is required for creating the RSA key.<br> Default value: F4<br> Possible values = 3, F4
	* </pre>
	*/
	public void set_exponent(String exponent) throws Exception{
		this.exponent = exponent;
	}

	/**
	* <pre>
	* Public exponent for the RSA key. The exponent is part of the cipher algorithm and is required for creating the RSA key.<br> Default value: F4<br> Possible values = 3, F4
	* </pre>
	*/
	public String get_exponent() throws Exception {
		return this.exponent;
	}

	/**
	* <pre>
	* Format in which the RSA key file is stored on the appliance.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_keyform(String keyform) throws Exception{
		this.keyform = keyform;
	}

	/**
	* <pre>
	* Format in which the RSA key file is stored on the appliance.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_keyform() throws Exception {
		return this.keyform;
	}

	/**
	* <pre>
	* Encrypt the generated RSA key by using the DES algorithm. On the command line, you are prompted to enter the pass phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public void set_des(boolean des) throws Exception {
		this.des = new Boolean(des);
	}

	/**
	* <pre>
	* Encrypt the generated RSA key by using the DES algorithm. On the command line, you are prompted to enter the pass phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public void set_des(Boolean des) throws Exception{
		this.des = des;
	}

	/**
	* <pre>
	* Encrypt the generated RSA key by using the DES algorithm. On the command line, you are prompted to enter the pass phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public Boolean get_des() throws Exception {
		return this.des;
	}

	/**
	* <pre>
	* Encrypt the generated RSA key by using the Triple-DES algorithm. On the command line, you are prompted to enter the pass phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public void set_des3(boolean des3) throws Exception {
		this.des3 = new Boolean(des3);
	}

	/**
	* <pre>
	* Encrypt the generated RSA key by using the Triple-DES algorithm. On the command line, you are prompted to enter the pass phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public void set_des3(Boolean des3) throws Exception{
		this.des3 = des3;
	}

	/**
	* <pre>
	* Encrypt the generated RSA key by using the Triple-DES algorithm. On the command line, you are prompted to enter the pass phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public Boolean get_des3() throws Exception {
		return this.des3;
	}

	/**
	* <pre>
	* Pass phrase to use for encryption if DES or DES3 option is selected.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* Pass phrase to use for encryption if DES or DES3 option is selected.<br> Minimum length =  1<br> Maximum length =  31
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
		sslrsakey[] resources = new sslrsakey[1];
		sslrsakey_response result = (sslrsakey_response) service.get_payload_formatter().string_to_resource(sslrsakey_response.class, response);
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
		resources[0] = result.sslrsakey;
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
	* Use this API to create sslrsakey.
	*/
	public static base_response create(nitro_service client, sslrsakey resource) throws Exception {
		sslrsakey createresource = new sslrsakey();
		createresource.keyfile = resource.keyfile;
		createresource.bits = resource.bits;
		createresource.exponent = resource.exponent;
		createresource.keyform = resource.keyform;
		createresource.des = resource.des;
		createresource.des3 = resource.des3;
		createresource.password = resource.password;
		return createresource.perform_operation(client,"create");
	}

	public static class keyformEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
	public static class exponentEnum {
		public static final String _3 = "3";
		public static final String F4 = "F4";
	}
}
