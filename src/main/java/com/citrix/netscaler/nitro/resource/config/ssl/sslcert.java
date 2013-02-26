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
	* The name of the generated certificate file. The default path of the certificate file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public void set_certfile(String certfile) throws Exception{
		this.certfile = certfile;
	}

	/**
	* <pre>
	* The name of the generated certificate file. The default path of the certificate file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public String get_certfile() throws Exception {
		return this.certfile;
	}

	/**
	* <pre>
	* The Certificate Signing Request (CSR) file that is used to generate the certificate.  This file is created using the "create ssl certreq" command or an existing CSR. The default input path for the CSR file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public void set_reqfile(String reqfile) throws Exception{
		this.reqfile = reqfile;
	}

	/**
	* <pre>
	* The Certificate Signing Request (CSR) file that is used to generate the certificate.  This file is created using the "create ssl certreq" command or an existing CSR. The default input path for the CSR file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public String get_reqfile() throws Exception {
		return this.reqfile;
	}

	/**
	* <pre>
	* The type of the certificate to be generated.

	ROOT_CERT : The certificate generated will be a self-signed Root-CA certificate. For this, you need to specify the -keyfile parameter. The generated Root-CA certificate can be used for signing end-user certificates (Client/Server) or to create Intermediate-CA certificates.

	INTM_CERT : The certificate generated will be an Intermediate-CA certificate. For this, you need to specify the following parameters: -CAcert , -CAkey, and -CAserial.

NOTE:	The three parameters are also mandatory for the CLNT_CERT or SRVR_CERT certificate types.

	CLNT_CERT : The certificate generated will be an end-user client certificate. This can be used in a Client-Authentication setup.

	SRVR_CERT : The certificate generated will be an end-user Server certificate. This can be used as an SSL server certificate on the backend SSL servers for an SSL backend-encryption setup with the system.

		NOTE:	Avoid using the Server certificate (generated above) for a front-end SSL virtual server (or SSL service) on a system or on any frontend SSL server if the certificate is signed by System. The same is true with System generated Intermediate-CA or Root-CA certificate. The reason being, the System generated CA certificates will not be present in browsers (such as IE, Netscape, and other browsers) by default. So during the SSL handshake the Server Certificate verification will fail. Browsers generally display a warning message and prompt the user to either continue with the SSL handshake or terminate it.

			If the System generated CA certificates are installed in the browsers as trusted CA certificates, the SSL handshake will proceed without any errors or warnings.<br> Possible values = ROOT_CERT, INTM_CERT, CLNT_CERT, SRVR_CERT
	* </pre>
	*/
	public void set_certtype(String certtype) throws Exception{
		this.certtype = certtype;
	}

	/**
	* <pre>
	* The type of the certificate to be generated.

	ROOT_CERT : The certificate generated will be a self-signed Root-CA certificate. For this, you need to specify the -keyfile parameter. The generated Root-CA certificate can be used for signing end-user certificates (Client/Server) or to create Intermediate-CA certificates.

	INTM_CERT : The certificate generated will be an Intermediate-CA certificate. For this, you need to specify the following parameters: -CAcert , -CAkey, and -CAserial.

NOTE:	The three parameters are also mandatory for the CLNT_CERT or SRVR_CERT certificate types.

	CLNT_CERT : The certificate generated will be an end-user client certificate. This can be used in a Client-Authentication setup.

	SRVR_CERT : The certificate generated will be an end-user Server certificate. This can be used as an SSL server certificate on the backend SSL servers for an SSL backend-encryption setup with the system.

		NOTE:	Avoid using the Server certificate (generated above) for a front-end SSL virtual server (or SSL service) on a system or on any frontend SSL server if the certificate is signed by System. The same is true with System generated Intermediate-CA or Root-CA certificate. The reason being, the System generated CA certificates will not be present in browsers (such as IE, Netscape, and other browsers) by default. So during the SSL handshake the Server Certificate verification will fail. Browsers generally display a warning message and prompt the user to either continue with the SSL handshake or terminate it.

			If the System generated CA certificates are installed in the browsers as trusted CA certificates, the SSL handshake will proceed without any errors or warnings.<br> Possible values = ROOT_CERT, INTM_CERT, CLNT_CERT, SRVR_CERT
	* </pre>
	*/
	public String get_certtype() throws Exception {
		return this.certtype;
	}

	/**
	* <pre>
	* The input keyFile to sign the certificate being generated. This keyFile is created using the "create ssl rsakey" or "create ssl dsakey" commands, or an existing RSA/DSA key. This file is required only when creating a self-signed Root-CA certificate. The default input path for the keyFile is /nsconfig/ssl/.
	Note: If the input key specified is an encrypted key, the user will be prompted to enter the PEM pass-phrase that was used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public void set_keyfile(String keyfile) throws Exception{
		this.keyfile = keyfile;
	}

	/**
	* <pre>
	* The input keyFile to sign the certificate being generated. This keyFile is created using the "create ssl rsakey" or "create ssl dsakey" commands, or an existing RSA/DSA key. This file is required only when creating a self-signed Root-CA certificate. The default input path for the keyFile is /nsconfig/ssl/.
	Note: If the input key specified is an encrypted key, the user will be prompted to enter the PEM pass-phrase that was used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public String get_keyfile() throws Exception {
		return this.keyfile;
	}

	/**
	* <pre>
	* The format for the input key file:
	PEM : Privacy Enhanced Mail
	DER : Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_keyform(String keyform) throws Exception{
		this.keyform = keyform;
	}

	/**
	* <pre>
	* The format for the input key file:
	PEM : Privacy Enhanced Mail
	DER : Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
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
	* The number of days for which the certificate will be valid. The certificate is valid from the time and day (system time) of the creation, to the number of days specified in the -days field.The maximum value allowed is 3650.<br> Default value: 365<br> Minimum value =  1<br> Maximum value =  3650
	* </pre>
	*/
	public void set_days(long days) throws Exception {
		this.days = new Long(days);
	}

	/**
	* <pre>
	* The number of days for which the certificate will be valid. The certificate is valid from the time and day (system time) of the creation, to the number of days specified in the -days field.The maximum value allowed is 3650.<br> Default value: 365<br> Minimum value =  1<br> Maximum value =  3650
	* </pre>
	*/
	public void set_days(Long days) throws Exception{
		this.days = days;
	}

	/**
	* <pre>
	* The number of days for which the certificate will be valid. The certificate is valid from the time and day (system time) of the creation, to the number of days specified in the -days field.The maximum value allowed is 3650.<br> Default value: 365<br> Minimum value =  1<br> Maximum value =  3650
	* </pre>
	*/
	public Long get_days() throws Exception {
		return this.days;
	}

	/**
	* <pre>
	* The output certificate format:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_certform(String certform) throws Exception{
		this.certform = certform;
	}

	/**
	* <pre>
	* The output certificate format:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_certform() throws Exception {
		return this.certform;
	}

	/**
	* <pre>
	* The CA certificate file that will issue and sign the Intermediate-CA certificate or the end-user certificates (Client/Server). The default input path for the CA certificate file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public void set_cacert(String cacert) throws Exception{
		this.cacert = cacert;
	}

	/**
	* <pre>
	* The CA certificate file that will issue and sign the Intermediate-CA certificate or the end-user certificates (Client/Server). The default input path for the CA certificate file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public String get_cacert() throws Exception {
		return this.cacert;
	}

	/**
	* <pre>
	* The format of the input CA certificate file:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_cacertform(String cacertform) throws Exception{
		this.cacertform = cacertform;
	}

	/**
	* <pre>
	* The format of the input CA certificate file:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_cacertform() throws Exception {
		return this.cacertform;
	}

	/**
	* <pre>
	* The CA key file that will be used to sign the Intermediate-CA certificate or the end-user certificates (Client/Server). The default input path for the CA key file is /nsconfig/ssl/.
	Note: If the CA key file is password protected, the user will be prompted to enter the pass-phrase used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public void set_cakey(String cakey) throws Exception{
		this.cakey = cakey;
	}

	/**
	* <pre>
	* The CA key file that will be used to sign the Intermediate-CA certificate or the end-user certificates (Client/Server). The default input path for the CA key file is /nsconfig/ssl/.
	Note: If the CA key file is password protected, the user will be prompted to enter the pass-phrase used for encrypting the key.<br> Maximum length =  63
	* </pre>
	*/
	public String get_cakey() throws Exception {
		return this.cakey;
	}

	/**
	* <pre>
	* The format of the input CA key file:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_cakeyform(String cakeyform) throws Exception{
		this.cakeyform = cakeyform;
	}

	/**
	* <pre>
	* The format of the input CA key file:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_cakeyform() throws Exception {
		return this.cakeyform;
	}

	/**
	* <pre>
	* The Serial number file maintained for the CA certificate. This will contain the serial number of the next certificate to be issued/signed by the CA (-CAcert). If the specified file does not exist, a new file will be created. The default input path for the CAserial file name is /nsconfig/ssl/.

	Note: Specify the proper path of the existing serial file; else a new serial file will be created. This may change the certificate serial numbers assigned by the CA certificate to each of the certificate it signs.<br> Maximum length =  63
	* </pre>
	*/
	public void set_caserial(String caserial) throws Exception{
		this.caserial = caserial;
	}

	/**
	* <pre>
	* The Serial number file maintained for the CA certificate. This will contain the serial number of the next certificate to be issued/signed by the CA (-CAcert). If the specified file does not exist, a new file will be created. The default input path for the CAserial file name is /nsconfig/ssl/.

	Note: Specify the proper path of the existing serial file; else a new serial file will be created. This may change the certificate serial numbers assigned by the CA certificate to each of the certificate it signs.<br> Maximum length =  63
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
