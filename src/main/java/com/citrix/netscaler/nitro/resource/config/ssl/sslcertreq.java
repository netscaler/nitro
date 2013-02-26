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

class sslcertreq_response extends base_response
{
	public sslcertreq sslcertreq;
}
/**
* Configuration for certificate request resource.
*/

public class sslcertreq extends base_resource
{
	private String reqfile;
	private String keyfile;
	private String fipskeyname;
	private String keyform;
	private String pempassphrase;
	private String countryname;
	private String statename;
	private String organizationname;
	private String organizationunitname;
	private String localityname;
	private String commonname;
	private String emailaddress;
	private String challengepassword;
	private String companyname;

	/**
	* <pre>
	* The file name where the generated Certificate Signing Requests are stored. The default output path for the CSR file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public void set_reqfile(String reqfile) throws Exception{
		this.reqfile = reqfile;
	}

	/**
	* <pre>
	* The file name where the generated Certificate Signing Requests are stored. The default output path for the CSR file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public String get_reqfile() throws Exception {
		return this.reqfile;
	}

	/**
	* <pre>
	* The key file name to be used. The key can be an RSA or a DSA key. The default input path for the key file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public void set_keyfile(String keyfile) throws Exception{
		this.keyfile = keyfile;
	}

	/**
	* <pre>
	* The key file name to be used. The key can be an RSA or a DSA key. The default input path for the key file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public String get_keyfile() throws Exception {
		return this.keyfile;
	}

	/**
	* <pre>
	* The FIPS key name to be used. FIPS keys are created inside the FIPS HSM (Hardware Security Module). This is applicable only to the SSL FIPS system.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_fipskeyname(String fipskeyname) throws Exception{
		this.fipskeyname = fipskeyname;
	}

	/**
	* <pre>
	* The FIPS key name to be used. FIPS keys are created inside the FIPS HSM (Hardware Security Module). This is applicable only to the SSL FIPS system.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_fipskeyname() throws Exception {
		return this.fipskeyname;
	}

	/**
	* <pre>
	* The format for the input key file specified in the keyFileName:
				PEM: Privacy Enhanced Mail
				DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_keyform(String keyform) throws Exception{
		this.keyform = keyform;
	}

	/**
	* <pre>
	* The format for the input key file specified in the keyFileName:
				PEM: Privacy Enhanced Mail
				DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
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
	* Country Name - Two letter ISO code for your country. For example, US for United States.<br> Minimum length =  2<br> Maximum length =  2
	* </pre>
	*/
	public void set_countryname(String countryname) throws Exception{
		this.countryname = countryname;
	}

	/**
	* <pre>
	* Country Name - Two letter ISO code for your country. For example, US for United States.<br> Minimum length =  2<br> Maximum length =  2
	* </pre>
	*/
	public String get_countryname() throws Exception {
		return this.countryname;
	}

	/**
	* <pre>
	* State or Province Name - Full name for the state or province where your organization is located. Maximum characters allowed are 63. Do not abbreviate.<br> Minimum length =  1
	* </pre>
	*/
	public void set_statename(String statename) throws Exception{
		this.statename = statename;
	}

	/**
	* <pre>
	* State or Province Name - Full name for the state or province where your organization is located. Maximum characters allowed are 63. Do not abbreviate.<br> Minimum length =  1
	* </pre>
	*/
	public String get_statename() throws Exception {
		return this.statename;
	}

	/**
	* <pre>
	* Organization Name - Name of the organization. The organization name (corporation, limited partnership, university, or government agency) must be registered with some authority at the national, state, or city level. Use the legal name under which the organization is registered. Maximum characters allowed are 63. Do not abbreviate the organization name and do not use the following characters in the name: < > ~ ! @ # 0 ^ * /  ( )?.<br> Minimum length =  1
	* </pre>
	*/
	public void set_organizationname(String organizationname) throws Exception{
		this.organizationname = organizationname;
	}

	/**
	* <pre>
	* Organization Name - Name of the organization. The organization name (corporation, limited partnership, university, or government agency) must be registered with some authority at the national, state, or city level. Use the legal name under which the organization is registered. Maximum characters allowed are 63. Do not abbreviate the organization name and do not use the following characters in the name: < > ~ ! @ # 0 ^ * /  ( )?.<br> Minimum length =  1
	* </pre>
	*/
	public String get_organizationname() throws Exception {
		return this.organizationname;
	}

	/**
	* <pre>
	* Organization Unit Name - Division or Section name in the organization that will use the certificate. Maximum characters allowed are 63.<br> Minimum length =  1
	* </pre>
	*/
	public void set_organizationunitname(String organizationunitname) throws Exception{
		this.organizationunitname = organizationunitname;
	}

	/**
	* <pre>
	* Organization Unit Name - Division or Section name in the organization that will use the certificate. Maximum characters allowed are 63.<br> Minimum length =  1
	* </pre>
	*/
	public String get_organizationunitname() throws Exception {
		return this.organizationunitname;
	}

	/**
	* <pre>
	* Locality Name - Name of the city or town in which your organization's head office is located.Maximum characters allowed are 127.<br> Minimum length =  1
	* </pre>
	*/
	public void set_localityname(String localityname) throws Exception{
		this.localityname = localityname;
	}

	/**
	* <pre>
	* Locality Name - Name of the city or town in which your organization's head office is located.Maximum characters allowed are 127.<br> Minimum length =  1
	* </pre>
	*/
	public String get_localityname() throws Exception {
		return this.localityname;
	}

	/**
	* <pre>
	* Common Name - Fully qualified domain name for the company/Web site. The common name is the fully qualified domain name (FQDN) for the company/Web site. The common name must match the name used by DNS servers to do a DNS lookup of your server (for example, www.mywebsite.com <http://www.mywebsite.com>). Most browsers use this information for authenticating the server's certificate during the SSL handshake. If the server name does not match the common name as given in the server certificate, the browsers will terminate the SSL handshake or prompt the user with a warning message. The maximum characters allowed are 63.

				CAUTION: Do not use wildcard characters such as * or ? and do not use an IP address as the common name. The common name should be without the protocol specifier <http://> or <https://>.<br> Minimum length =  1
	* </pre>
	*/
	public void set_commonname(String commonname) throws Exception{
		this.commonname = commonname;
	}

	/**
	* <pre>
	* Common Name - Fully qualified domain name for the company/Web site. The common name is the fully qualified domain name (FQDN) for the company/Web site. The common name must match the name used by DNS servers to do a DNS lookup of your server (for example, www.mywebsite.com <http://www.mywebsite.com>). Most browsers use this information for authenticating the server's certificate during the SSL handshake. If the server name does not match the common name as given in the server certificate, the browsers will terminate the SSL handshake or prompt the user with a warning message. The maximum characters allowed are 63.

				CAUTION: Do not use wildcard characters such as * or ? and do not use an IP address as the common name. The common name should be without the protocol specifier <http://> or <https://>.<br> Minimum length =  1
	* </pre>
	*/
	public String get_commonname() throws Exception {
		return this.commonname;
	}

	/**
	* <pre>
	* Challenge Password - The contact person's E-mail address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_emailaddress(String emailaddress) throws Exception{
		this.emailaddress = emailaddress;
	}

	/**
	* <pre>
	* Challenge Password - The contact person's E-mail address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_emailaddress() throws Exception {
		return this.emailaddress;
	}

	/**
	* <pre>
	* Challenge Password - Challenge password for this certificate.<br> Minimum length =  4
	* </pre>
	*/
	public void set_challengepassword(String challengepassword) throws Exception{
		this.challengepassword = challengepassword;
	}

	/**
	* <pre>
	* Challenge Password - Challenge password for this certificate.<br> Minimum length =  4
	* </pre>
	*/
	public String get_challengepassword() throws Exception {
		return this.challengepassword;
	}

	/**
	* <pre>
	* Optional Company Name - Additional name of the company/web-site.<br> Minimum length =  1
	* </pre>
	*/
	public void set_companyname(String companyname) throws Exception{
		this.companyname = companyname;
	}

	/**
	* <pre>
	* Optional Company Name - Additional name of the company/web-site.<br> Minimum length =  1
	* </pre>
	*/
	public String get_companyname() throws Exception {
		return this.companyname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslcertreq[] resources = new sslcertreq[1];
		sslcertreq_response result = (sslcertreq_response) service.get_payload_formatter().string_to_resource(sslcertreq_response.class, response);
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
		resources[0] = result.sslcertreq;
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
	* Use this API to create sslcertreq.
	*/
	public static base_response create(nitro_service client, sslcertreq resource) throws Exception {
		sslcertreq createresource = new sslcertreq();
		createresource.reqfile = resource.reqfile;
		createresource.keyfile = resource.keyfile;
		createresource.fipskeyname = resource.fipskeyname;
		createresource.keyform = resource.keyform;
		createresource.pempassphrase = resource.pempassphrase;
		createresource.countryname = resource.countryname;
		createresource.statename = resource.statename;
		createresource.organizationname = resource.organizationname;
		createresource.organizationunitname = resource.organizationunitname;
		createresource.localityname = resource.localityname;
		createresource.commonname = resource.commonname;
		createresource.emailaddress = resource.emailaddress;
		createresource.challengepassword = resource.challengepassword;
		createresource.companyname = resource.companyname;
		return createresource.perform_operation(client,"create");
	}

	public static class keyformEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
}
