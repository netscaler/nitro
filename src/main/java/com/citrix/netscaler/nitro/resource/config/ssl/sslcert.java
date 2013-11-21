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

class sslcert_response extends base_response
{
	public sslcert sslcert;
}
/**
* Configuration for cerificate resource.
*/

public class sslcert extends base_resource
{
	private String certfile;
	private String reqfile;
	private String certtype;
	private String keyfile;
	private String keyform;
	private String pempassphrase;
	private Long days;
	private String certform;
	private String cacert;
	private String cacertform;
	private String cakey;
	private String cakeyform;
	private String caserial;

	/**
	* <pre>
	* Name for and, optionally, path to the generated certificate file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_certfile(String certfile) throws Exception{
		this.certfile = certfile;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the generated certificate file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_certfile() throws Exception {
		return this.certfile;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the certificate-signing request (CSR). /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_reqfile(String reqfile) throws Exception{
		this.reqfile = reqfile;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the certificate-signing request (CSR). /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_reqfile() throws Exception {
		return this.reqfile;
	}

	/**
	* <pre>
	* Type of certificate to generate. Specify one of the following:
* ROOT_CERT - Self-signed Root-CA certificate. You must specify the key file name. The generated Root-CA certificate can be used for signing end-user client or server certificates or to create Intermediate-CA certificates.
* INTM_CERT - Intermediate-CA certificate. 
* CLNT_CERT - End-user client certificate used for client authentication.
* SRVR_CERT - SSL server certificate used on SSL servers for end-to-end encryption.<br> Possible values = ROOT_CERT, INTM_CERT, CLNT_CERT, SRVR_CERT
	* </pre>
	*/
	public void set_certtype(String certtype) throws Exception{
		this.certtype = certtype;
	}

	/**
	* <pre>
	* Type of certificate to generate. Specify one of the following:
* ROOT_CERT - Self-signed Root-CA certificate. You must specify the key file name. The generated Root-CA certificate can be used for signing end-user client or server certificates or to create Intermediate-CA certificates.
* INTM_CERT - Intermediate-CA certificate. 
* CLNT_CERT - End-user client certificate used for client authentication.
* SRVR_CERT - SSL server certificate used on SSL servers for end-to-end encryption.<br> Possible values = ROOT_CERT, INTM_CERT, CLNT_CERT, SRVR_CERT
	* </pre>
	*/
	public String get_certtype() throws Exception {
		return this.certtype;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the private key. You can either use an existing RSA or DSA key that you own or create a new private key on the NetScaler appliance. This file is required only when creating a self-signed Root-CA certificate. The key file is stored in the /nsconfig/ssl directory by default.                    
If the input key specified is an encrypted key, you are prompted to enter the PEM pass phrase that was used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public void set_keyfile(String keyfile) throws Exception{
		this.keyfile = keyfile;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the private key. You can either use an existing RSA or DSA key that you own or create a new private key on the NetScaler appliance. This file is required only when creating a self-signed Root-CA certificate. The key file is stored in the /nsconfig/ssl directory by default.                    
If the input key specified is an encrypted key, you are prompted to enter the PEM pass phrase that was used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public String get_keyfile() throws Exception {
		return this.keyfile;
	}

	/**
	* <pre>
	* Format in which the key is stored on the appliance.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_keyform(String keyform) throws Exception{
		this.keyform = keyform;
	}

	/**
	* <pre>
	* Format in which the key is stored on the appliance.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_keyform() throws Exception {
		return this.keyform;
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
	* Number of days for which the certificate will be valid, beginning with the time and day (system time) of creation.<br> Default value: 365<br> Minimum value =  1<br> Maximum value =  3650
	* </pre>
	*/
	public void set_days(long days) throws Exception {
		this.days = new Long(days);
	}

	/**
	* <pre>
	* Number of days for which the certificate will be valid, beginning with the time and day (system time) of creation.<br> Default value: 365<br> Minimum value =  1<br> Maximum value =  3650
	* </pre>
	*/
	public void set_days(Long days) throws Exception{
		this.days = days;
	}

	/**
	* <pre>
	* Number of days for which the certificate will be valid, beginning with the time and day (system time) of creation.<br> Default value: 365<br> Minimum value =  1<br> Maximum value =  3650
	* </pre>
	*/
	public Long get_days() throws Exception {
		return this.days;
	}

	/**
	* <pre>
	* Format in which the certificate is stored on the appliance.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_certform(String certform) throws Exception{
		this.certform = certform;
	}

	/**
	* <pre>
	* Format in which the certificate is stored on the appliance.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_certform() throws Exception {
		return this.certform;
	}

	/**
	* <pre>
	* Name of the CA certificate file that issues and signs the Intermediate-CA certificate or the end-user client and server certificates.<br> Maximum length =  63
	* </pre>
	*/
	public void set_cacert(String cacert) throws Exception{
		this.cacert = cacert;
	}

	/**
	* <pre>
	* Name of the CA certificate file that issues and signs the Intermediate-CA certificate or the end-user client and server certificates.<br> Maximum length =  63
	* </pre>
	*/
	public String get_cacert() throws Exception {
		return this.cacert;
	}

	/**
	* <pre>
	* Format of the CA certificate.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_cacertform(String cacertform) throws Exception{
		this.cacertform = cacertform;
	}

	/**
	* <pre>
	* Format of the CA certificate.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_cacertform() throws Exception {
		return this.cacertform;
	}

	/**
	* <pre>
	* Private key, associated with the CA certificate that is used to sign the Intermediate-CA certificate or the end-user client and server certificate. If the CA key file is password protected, the user is prompted to enter the pass phrase that was used to encrypt the key.<br> Maximum length =  63
	* </pre>
	*/
	public void set_cakey(String cakey) throws Exception{
		this.cakey = cakey;
	}

	/**
	* <pre>
	* Private key, associated with the CA certificate that is used to sign the Intermediate-CA certificate or the end-user client and server certificate. If the CA key file is password protected, the user is prompted to enter the pass phrase that was used to encrypt the key.<br> Maximum length =  63
	* </pre>
	*/
	public String get_cakey() throws Exception {
		return this.cakey;
	}

	/**
	* <pre>
	* Format for the CA certificate.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_cakeyform(String cakeyform) throws Exception{
		this.cakeyform = cakeyform;
	}

	/**
	* <pre>
	* Format for the CA certificate.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_cakeyform() throws Exception {
		return this.cakeyform;
	}

	/**
	* <pre>
	* Serial number file maintained for the CA certificate. This file contains the serial number of the next certificate to be issued or signed by the CA. If the specified file does not exist, a new file is created, with /nsconfig/ssl/ as the default path. If you do not specify a proper path for the existing serial file, a new serial file is created. This might change the certificate serial numbers assigned by the CA certificate to each of the certificates it signs.<br> Maximum length =  63
	* </pre>
	*/
	public void set_caserial(String caserial) throws Exception{
		this.caserial = caserial;
	}

	/**
	* <pre>
	* Serial number file maintained for the CA certificate. This file contains the serial number of the next certificate to be issued or signed by the CA. If the specified file does not exist, a new file is created, with /nsconfig/ssl/ as the default path. If you do not specify a proper path for the existing serial file, a new serial file is created. This might change the certificate serial numbers assigned by the CA certificate to each of the certificates it signs.<br> Maximum length =  63
	* </pre>
	*/
	public String get_caserial() throws Exception {
		return this.caserial;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslcert[] resources = new sslcert[1];
		sslcert_response result = (sslcert_response) service.get_payload_formatter().string_to_resource(sslcert_response.class, response);
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
		resources[0] = result.sslcert;
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
	* Use this API to create sslcert.
	*/
	public static base_response create(nitro_service client, sslcert resource) throws Exception {
		sslcert createresource = new sslcert();
		createresource.certfile = resource.certfile;
		createresource.reqfile = resource.reqfile;
		createresource.certtype = resource.certtype;
		createresource.keyfile = resource.keyfile;
		createresource.keyform = resource.keyform;
		createresource.pempassphrase = resource.pempassphrase;
		createresource.days = resource.days;
		createresource.certform = resource.certform;
		createresource.cacert = resource.cacert;
		createresource.cacertform = resource.cacertform;
		createresource.cakey = resource.cakey;
		createresource.cakeyform = resource.cakeyform;
		createresource.caserial = resource.caserial;
		return createresource.perform_operation(client,"create");
	}

	public static class keyformEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
	public static class cacertformEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
	public static class certtypeEnum {
		public static final String ROOT_CERT = "ROOT_CERT";
		public static final String INTM_CERT = "INTM_CERT";
		public static final String CLNT_CERT = "CLNT_CERT";
		public static final String SRVR_CERT = "SRVR_CERT";
	}
	public static class certformEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
	public static class cakeyformEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
}
