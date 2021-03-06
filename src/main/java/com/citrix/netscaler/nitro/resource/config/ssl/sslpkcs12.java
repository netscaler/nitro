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

class sslpkcs12_response extends base_response
{
	public sslpkcs12 sslpkcs12;
}
/**
* Configuration for pkcs12 resource.
*/

public class sslpkcs12 extends base_resource
{
	private String outfile;
	private Boolean Import;
	private String pkcs12file;
	private Boolean des;
	private Boolean des3;
	private Boolean export;
	private String certfile;
	private String keyfile;
	private String password;
	private String pempassphrase;

	/**
	* <pre>
	* Name for and, optionally, path to, the output file that contains the certificate and the private key after converting from PKCS#12 to PEM format. /nsconfig/ssl/ is the default path.
If importing, the certificate-key pair is stored in PEM format. If exporting, the certificate-key pair is stored in PKCS#12 format.<br> Maximum length =  63
	* </pre>
	*/
	public void set_outfile(String outfile) throws Exception{
		this.outfile = outfile;
	}

	/**
	* <pre>
	* Name for and, optionally, path to, the output file that contains the certificate and the private key after converting from PKCS#12 to PEM format. /nsconfig/ssl/ is the default path.
If importing, the certificate-key pair is stored in PEM format. If exporting, the certificate-key pair is stored in PKCS#12 format.<br> Maximum length =  63
	* </pre>
	*/
	public String get_outfile() throws Exception {
		return this.outfile;
	}

	/**
	* <pre>
	* Convert the certificate and private-key from PKCS#12 format to PEM format.
	* </pre>
	*/
	public void set_Import(boolean Import) throws Exception {
		this.Import = new Boolean(Import);
	}

	/**
	* <pre>
	* Convert the certificate and private-key from PKCS#12 format to PEM format.
	* </pre>
	*/
	public void set_Import(Boolean Import) throws Exception{
		this.Import = Import;
	}

	/**
	* <pre>
	* Convert the certificate and private-key from PKCS#12 format to PEM format.
	* </pre>
	*/
	public Boolean get_Import() throws Exception {
		return this.Import;
	}

	/**
	* <pre>
	* Name for and, optionally, path to, the PKCS#12 file. If importing, specify the input file name that contains the certificate and the private key in PKCS#12 format. If exporting, specify the output file name that contains the certificate and the private key after converting from PEM to
PKCS#12 format. /nsconfig/ssl/ is the default path.
During the import operation, if the key is encrypted, you are prompted to enter the pass phrase used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public void set_pkcs12file(String pkcs12file) throws Exception{
		this.pkcs12file = pkcs12file;
	}

	/**
	* <pre>
	* Name for and, optionally, path to, the PKCS#12 file. If importing, specify the input file name that contains the certificate and the private key in PKCS#12 format. If exporting, specify the output file name that contains the certificate and the private key after converting from PEM to
PKCS#12 format. /nsconfig/ssl/ is the default path.
During the import operation, if the key is encrypted, you are prompted to enter the pass phrase used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public String get_pkcs12file() throws Exception {
		return this.pkcs12file;
	}

	/**
	* <pre>
	* Encrypt the private key by using the DES algorithm in CBC mode during the import operation. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public void set_des(boolean des) throws Exception {
		this.des = new Boolean(des);
	}

	/**
	* <pre>
	* Encrypt the private key by using the DES algorithm in CBC mode during the import operation. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public void set_des(Boolean des) throws Exception{
		this.des = des;
	}

	/**
	* <pre>
	* Encrypt the private key by using the DES algorithm in CBC mode during the import operation. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public Boolean get_des() throws Exception {
		return this.des;
	}

	/**
	* <pre>
	* Encrypt the private key by using the Triple-DES algorithm in EDE CBC mode (168-bit key) during the import operation. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public void set_des3(boolean des3) throws Exception {
		this.des3 = new Boolean(des3);
	}

	/**
	* <pre>
	* Encrypt the private key by using the Triple-DES algorithm in EDE CBC mode (168-bit key) during the import operation. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public void set_des3(Boolean des3) throws Exception{
		this.des3 = des3;
	}

	/**
	* <pre>
	* Encrypt the private key by using the Triple-DES algorithm in EDE CBC mode (168-bit key) during the import operation. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public Boolean get_des3() throws Exception {
		return this.des3;
	}

	/**
	* <pre>
	* Convert the certificate and private key from PEM format to PKCS#12 format. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public void set_export(boolean export) throws Exception {
		this.export = new Boolean(export);
	}

	/**
	* <pre>
	* Convert the certificate and private key from PEM format to PKCS#12 format. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public void set_export(Boolean export) throws Exception{
		this.export = export;
	}

	/**
	* <pre>
	* Convert the certificate and private key from PEM format to PKCS#12 format. On the command line, you are prompted to enter the pass phrase.
	* </pre>
	*/
	public Boolean get_export() throws Exception {
		return this.export;
	}

	/**
	* <pre>
	* Certificate file to be converted from PEM to PKCS#12 format.<br> Maximum length =  63
	* </pre>
	*/
	public void set_certfile(String certfile) throws Exception{
		this.certfile = certfile;
	}

	/**
	* <pre>
	* Certificate file to be converted from PEM to PKCS#12 format.<br> Maximum length =  63
	* </pre>
	*/
	public String get_certfile() throws Exception {
		return this.certfile;
	}

	/**
	* <pre>
	* Name of the private key file to be converted from PEM to PKCS#12 format. If the key file is encrypted, you are prompted to enter the pass phrase used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public void set_keyfile(String keyfile) throws Exception{
		this.keyfile = keyfile;
	}

	/**
	* <pre>
	* Name of the private key file to be converted from PEM to PKCS#12 format. If the key file is encrypted, you are prompted to enter the pass phrase used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public String get_keyfile() throws Exception {
		return this.keyfile;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_pempassphrase(String pempassphrase) throws Exception{
		this.pempassphrase = pempassphrase;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_pempassphrase() throws Exception {
		return this.pempassphrase;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslpkcs12[] resources = new sslpkcs12[1];
		sslpkcs12_response result = (sslpkcs12_response) service.get_payload_formatter().string_to_resource(sslpkcs12_response.class, response);
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
		resources[0] = result.sslpkcs12;
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
	* Use this API to convert sslpkcs12.
	*/
	public static base_response convert(nitro_service client, sslpkcs12 resource) throws Exception {
		sslpkcs12 convertresource = new sslpkcs12();
		convertresource.outfile = resource.outfile;
		convertresource.Import = resource.Import;
		convertresource.pkcs12file = resource.pkcs12file;
		convertresource.des = resource.des;
		convertresource.des3 = resource.des3;
		convertresource.export = resource.export;
		convertresource.certfile = resource.certfile;
		convertresource.keyfile = resource.keyfile;
		convertresource.password = resource.password;
		convertresource.pempassphrase = resource.pempassphrase;
		return convertresource.perform_operation(client,"convert");
	}

}
