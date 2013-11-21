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

class sslservice_response extends base_response
{
	public sslservice[] sslservice;
}
/**
* Configuration for SSL service resource.
*/

public class sslservice extends base_resource
{
	private String servicename;
	private String dh;
	private String dhfile;
	private Long dhcount;
	private String ersa;
	private Long ersacount;
	private String sessreuse;
	private Long sesstimeout;
	private String cipherredirect;
	private String cipherurl;
	private String sslv2redirect;
	private String sslv2url;
	private String clientauth;
	private String clientcert;
	private String sslredirect;
	private String redirectportrewrite;
	private String nonfipsciphers;
	private String ssl2;
	private String ssl3;
	private String tls1;
	private String tls11;
	private String tls12;
	private String snienable;
	private String serverauth;
	private String commonname;
	private String pushenctrigger;
	private String sendclosenotify;
	private String dtlsprofilename;
	private Boolean cipherdetails;

	//------- Read only Parameter ---------;

	private Long service;
	private Boolean skipcaname;
	private Boolean dtlsflag;
	private Long __count;

	/**
	* <pre>
	* Name of the SSL service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* Name of the SSL service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* State of Diffie-Hellman (DH) key exchange. This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dh(String dh) throws Exception{
		this.dh = dh;
	}

	/**
	* <pre>
	* State of Diffie-Hellman (DH) key exchange. This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dh() throws Exception {
		return this.dh;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the PEM-format DH parameter file to be installed. /nsconfig/ssl/ is the default path. This parameter is not applicable when configuring a backend service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_dhfile(String dhfile) throws Exception{
		this.dhfile = dhfile;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the PEM-format DH parameter file to be installed. /nsconfig/ssl/ is the default path. This parameter is not applicable when configuring a backend service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_dhfile() throws Exception {
		return this.dhfile;
	}

	/**
	* <pre>
	* Number of interactions, between the client and the NetScaler appliance, after which the DH private-public pair is regenerated. A value of zero (0) specifies infinite use (no refresh). This parameter is not applicable when configuring a backend service.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_dhcount(long dhcount) throws Exception {
		this.dhcount = new Long(dhcount);
	}

	/**
	* <pre>
	* Number of interactions, between the client and the NetScaler appliance, after which the DH private-public pair is regenerated. A value of zero (0) specifies infinite use (no refresh). This parameter is not applicable when configuring a backend service.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_dhcount(Long dhcount) throws Exception{
		this.dhcount = dhcount;
	}

	/**
	* <pre>
	* Number of interactions, between the client and the NetScaler appliance, after which the DH private-public pair is regenerated. A value of zero (0) specifies infinite use (no refresh). This parameter is not applicable when configuring a backend service.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_dhcount() throws Exception {
		return this.dhcount;
	}

	/**
	* <pre>
	* State of Ephemeral RSA (eRSA) key exchange. Ephemeral RSA allows clients that support only export ciphers to communicate with the secure server even if the server certificate does not support export clients. The ephemeral RSA key is automatically generated when you bind an export cipher to an SSL or TCP-based SSL virtual server or service. When you remove the export cipher, the eRSA key is not deleted. It is reused at a later date when another export cipher is bound to an SSL or TCP-based SSL virtual server or service. The eRSA key is deleted when the appliance restarts.
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ersa(String ersa) throws Exception{
		this.ersa = ersa;
	}

	/**
	* <pre>
	* State of Ephemeral RSA (eRSA) key exchange. Ephemeral RSA allows clients that support only export ciphers to communicate with the secure server even if the server certificate does not support export clients. The ephemeral RSA key is automatically generated when you bind an export cipher to an SSL or TCP-based SSL virtual server or service. When you remove the export cipher, the eRSA key is not deleted. It is reused at a later date when another export cipher is bound to an SSL or TCP-based SSL virtual server or service. The eRSA key is deleted when the appliance restarts.
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ersa() throws Exception {
		return this.ersa;
	}

	/**
	* <pre>
	* Refresh count for regeneration of RSA public-key and private-key pair. Zero (0) specifies infinite usage (no refresh). 
This parameter is not applicable when configuring a backend service.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_ersacount(long ersacount) throws Exception {
		this.ersacount = new Long(ersacount);
	}

	/**
	* <pre>
	* Refresh count for regeneration of RSA public-key and private-key pair. Zero (0) specifies infinite usage (no refresh). 
This parameter is not applicable when configuring a backend service.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_ersacount(Long ersacount) throws Exception{
		this.ersacount = ersacount;
	}

	/**
	* <pre>
	* Refresh count for regeneration of RSA public-key and private-key pair. Zero (0) specifies infinite usage (no refresh). 
This parameter is not applicable when configuring a backend service.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_ersacount() throws Exception {
		return this.ersacount;
	}

	/**
	* <pre>
	* State of session reuse. Establishing the initial handshake requires CPU-intensive public key encryption operations. With the ENABLED setting, session key exchange is avoided for session resumption requests received from the client.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sessreuse(String sessreuse) throws Exception{
		this.sessreuse = sessreuse;
	}

	/**
	* <pre>
	* State of session reuse. Establishing the initial handshake requires CPU-intensive public key encryption operations. With the ENABLED setting, session key exchange is avoided for session resumption requests received from the client.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sessreuse() throws Exception {
		return this.sessreuse;
	}

	/**
	* <pre>
	* Time, in seconds, for which to keep the session active. Any session resumption request received after the timeout period will require a fresh SSL handshake and establishment of a new SSL session.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sesstimeout(long sesstimeout) throws Exception {
		this.sesstimeout = new Long(sesstimeout);
	}

	/**
	* <pre>
	* Time, in seconds, for which to keep the session active. Any session resumption request received after the timeout period will require a fresh SSL handshake and establishment of a new SSL session.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sesstimeout(Long sesstimeout) throws Exception{
		this.sesstimeout = sesstimeout;
	}

	/**
	* <pre>
	* Time, in seconds, for which to keep the session active. Any session resumption request received after the timeout period will require a fresh SSL handshake and establishment of a new SSL session.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_sesstimeout() throws Exception {
		return this.sesstimeout;
	}

	/**
	* <pre>
	* State of Cipher Redirect. If this parameter is set to ENABLED, you can configure an SSL virtual server or service to display meaningful error messages if the SSL handshake fails because of a cipher mismatch between the virtual server or service and the client.
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cipherredirect(String cipherredirect) throws Exception{
		this.cipherredirect = cipherredirect;
	}

	/**
	* <pre>
	* State of Cipher Redirect. If this parameter is set to ENABLED, you can configure an SSL virtual server or service to display meaningful error messages if the SSL handshake fails because of a cipher mismatch between the virtual server or service and the client.
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cipherredirect() throws Exception {
		return this.cipherredirect;
	}

	/**
	* <pre>
	* URL of the page to which to redirect the client in case of a cipher mismatch. Typically, this page has a clear explanation of the error or an alternative location that the transaction can continue from.
This parameter is not applicable when configuring a backend service.
	* </pre>
	*/
	public void set_cipherurl(String cipherurl) throws Exception{
		this.cipherurl = cipherurl;
	}

	/**
	* <pre>
	* URL of the page to which to redirect the client in case of a cipher mismatch. Typically, this page has a clear explanation of the error or an alternative location that the transaction can continue from.
This parameter is not applicable when configuring a backend service.
	* </pre>
	*/
	public String get_cipherurl() throws Exception {
		return this.cipherurl;
	}

	/**
	* <pre>
	* State of SSLv2 Redirect. If this parameter is set to ENABLED, you can configure an SSL virtual server or service to display meaningful error messages if the SSL handshake fails because of a protocol version mismatch between the virtual server or service and the client.
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sslv2redirect(String sslv2redirect) throws Exception{
		this.sslv2redirect = sslv2redirect;
	}

	/**
	* <pre>
	* State of SSLv2 Redirect. If this parameter is set to ENABLED, you can configure an SSL virtual server or service to display meaningful error messages if the SSL handshake fails because of a protocol version mismatch between the virtual server or service and the client.
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sslv2redirect() throws Exception {
		return this.sslv2redirect;
	}

	/**
	* <pre>
	* URL of the page to which to redirect the client in case of a protocol version mismatch. Typically, this page has a clear explanation of the error or an alternative location that the transaction can continue from.
This parameter is not applicable when configuring a backend service.
	* </pre>
	*/
	public void set_sslv2url(String sslv2url) throws Exception{
		this.sslv2url = sslv2url;
	}

	/**
	* <pre>
	* URL of the page to which to redirect the client in case of a protocol version mismatch. Typically, this page has a clear explanation of the error or an alternative location that the transaction can continue from.
This parameter is not applicable when configuring a backend service.
	* </pre>
	*/
	public String get_sslv2url() throws Exception {
		return this.sslv2url;
	}

	/**
	* <pre>
	* State of client authentication. In service-based SSL offload, the service terminates the SSL handshake if the SSL client does not provide a valid certificate. 
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientauth(String clientauth) throws Exception{
		this.clientauth = clientauth;
	}

	/**
	* <pre>
	* State of client authentication. In service-based SSL offload, the service terminates the SSL handshake if the SSL client does not provide a valid certificate. 
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientauth() throws Exception {
		return this.clientauth;
	}

	/**
	* <pre>
	* Type of client authentication. If this parameter is set to MANDATORY, the appliance terminates the SSL handshake if the SSL client does not provide a valid certificate. With the OPTIONAL setting, the appliance requests a certificate from the SSL clients but proceeds with the SSL transaction even if the client presents an invalid certificate.
This parameter is not applicable when configuring a backend SSL service.
Caution: Define proper access control policies before changing this setting to Optional.<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public void set_clientcert(String clientcert) throws Exception{
		this.clientcert = clientcert;
	}

	/**
	* <pre>
	* Type of client authentication. If this parameter is set to MANDATORY, the appliance terminates the SSL handshake if the SSL client does not provide a valid certificate. With the OPTIONAL setting, the appliance requests a certificate from the SSL clients but proceeds with the SSL transaction even if the client presents an invalid certificate.
This parameter is not applicable when configuring a backend SSL service.
Caution: Define proper access control policies before changing this setting to Optional.<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_clientcert() throws Exception {
		return this.clientcert;
	}

	/**
	* <pre>
	* State of HTTPS redirects for the SSL service. 

For an SSL session, if the client browser receives a redirect message, the browser tries to connect to the new location. However, the secure SSL session breaks if the object has moved from a secure site (https://) to an unsecure site (http://). Typically, a warning message appears on the screen, prompting the user to continue or disconnect.
If SSL Redirect is ENABLED, the redirect message is automatically converted from http:// to https:// and the SSL session does not break.

This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sslredirect(String sslredirect) throws Exception{
		this.sslredirect = sslredirect;
	}

	/**
	* <pre>
	* State of HTTPS redirects for the SSL service. 

For an SSL session, if the client browser receives a redirect message, the browser tries to connect to the new location. However, the secure SSL session breaks if the object has moved from a secure site (https://) to an unsecure site (http://). Typically, a warning message appears on the screen, prompting the user to continue or disconnect.
If SSL Redirect is ENABLED, the redirect message is automatically converted from http:// to https:// and the SSL session does not break.

This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sslredirect() throws Exception {
		return this.sslredirect;
	}

	/**
	* <pre>
	* State of the port rewrite while performing HTTPS redirect. If this parameter is set to ENABLED, and the URL from the server does not contain the standard port, the port is rewritten to the standard.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_redirectportrewrite(String redirectportrewrite) throws Exception{
		this.redirectportrewrite = redirectportrewrite;
	}

	/**
	* <pre>
	* State of the port rewrite while performing HTTPS redirect. If this parameter is set to ENABLED, and the URL from the server does not contain the standard port, the port is rewritten to the standard.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_redirectportrewrite() throws Exception {
		return this.redirectportrewrite;
	}

	/**
	* <pre>
	* State of usage of ciphers that are not FIPS approved. Valid only for an SSL service bound with a FIPS key and certificate.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nonfipsciphers(String nonfipsciphers) throws Exception{
		this.nonfipsciphers = nonfipsciphers;
	}

	/**
	* <pre>
	* State of usage of ciphers that are not FIPS approved. Valid only for an SSL service bound with a FIPS key and certificate.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nonfipsciphers() throws Exception {
		return this.nonfipsciphers;
	}

	/**
	* <pre>
	* State of SSLv2 protocol support for the SSL service.
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ssl2(String ssl2) throws Exception{
		this.ssl2 = ssl2;
	}

	/**
	* <pre>
	* State of SSLv2 protocol support for the SSL service.
This parameter is not applicable when configuring a backend service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ssl2() throws Exception {
		return this.ssl2;
	}

	/**
	* <pre>
	* State of SSLv3 protocol support for the SSL service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ssl3(String ssl3) throws Exception{
		this.ssl3 = ssl3;
	}

	/**
	* <pre>
	* State of SSLv3 protocol support for the SSL service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ssl3() throws Exception {
		return this.ssl3;
	}

	/**
	* <pre>
	* State of TLSv1.0 protocol support for the SSL service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tls1(String tls1) throws Exception{
		this.tls1 = tls1;
	}

	/**
	* <pre>
	* State of TLSv1.0 protocol support for the SSL service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tls1() throws Exception {
		return this.tls1;
	}

	/**
	* <pre>
	* State of TLSv1.1 protocol support for the SSL service.Enabled for Front-end service on MPX-CVM platform only.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tls11(String tls11) throws Exception{
		this.tls11 = tls11;
	}

	/**
	* <pre>
	* State of TLSv1.1 protocol support for the SSL service.Enabled for Front-end service on MPX-CVM platform only.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tls11() throws Exception {
		return this.tls11;
	}

	/**
	* <pre>
	* State of TLSv1.2 protocol support for the SSL service.Enabled for Front-end service on MPX-CVM platform only.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tls12(String tls12) throws Exception{
		this.tls12 = tls12;
	}

	/**
	* <pre>
	* State of TLSv1.2 protocol support for the SSL service.Enabled for Front-end service on MPX-CVM platform only.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tls12() throws Exception {
		return this.tls12;
	}

	/**
	* <pre>
	* State of the Server Name Indication (SNI) feature on the virtual server and service-based offload. SNI helps to enable SSL encryption on multiple domains on a single virtual server or service if the domains are controlled by the same organization and share the same second-level domain name. For example, *.sports.net can be used to secure domains such as login.sports.net and help.sports.net.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_snienable(String snienable) throws Exception{
		this.snienable = snienable;
	}

	/**
	* <pre>
	* State of the Server Name Indication (SNI) feature on the virtual server and service-based offload. SNI helps to enable SSL encryption on multiple domains on a single virtual server or service if the domains are controlled by the same organization and share the same second-level domain name. For example, *.sports.net can be used to secure domains such as login.sports.net and help.sports.net.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_snienable() throws Exception {
		return this.snienable;
	}

	/**
	* <pre>
	* State of server authentication support for the SSL service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_serverauth(String serverauth) throws Exception{
		this.serverauth = serverauth;
	}

	/**
	* <pre>
	* State of server authentication support for the SSL service.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_serverauth() throws Exception {
		return this.serverauth;
	}

	/**
	* <pre>
	* Name to be checked against the CommonName (CN) field in the server certificate bound to the SSL server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_commonname(String commonname) throws Exception{
		this.commonname = commonname;
	}

	/**
	* <pre>
	* Name to be checked against the CommonName (CN) field in the server certificate bound to the SSL server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_commonname() throws Exception {
		return this.commonname;
	}

	/**
	* <pre>
	* Trigger encryption on the basis of the PUSH flag value. Available settings function as follows:
* ALWAYS - Any PUSH packet triggers encryption.
* IGNORE - Ignore PUSH packet for triggering encryption.
* MERGE - For a consecutive sequence of PUSH packets, the last PUSH packet triggers encryption.
* TIMER - PUSH packet triggering encryption is delayed by the time defined in the set ssl parameter command or in the Change Advanced SSL Settings dialog box.<br> Possible values = Always, Merge, Ignore, Timer
	* </pre>
	*/
	public void set_pushenctrigger(String pushenctrigger) throws Exception{
		this.pushenctrigger = pushenctrigger;
	}

	/**
	* <pre>
	* Trigger encryption on the basis of the PUSH flag value. Available settings function as follows:
* ALWAYS - Any PUSH packet triggers encryption.
* IGNORE - Ignore PUSH packet for triggering encryption.
* MERGE - For a consecutive sequence of PUSH packets, the last PUSH packet triggers encryption.
* TIMER - PUSH packet triggering encryption is delayed by the time defined in the set ssl parameter command or in the Change Advanced SSL Settings dialog box.<br> Possible values = Always, Merge, Ignore, Timer
	* </pre>
	*/
	public String get_pushenctrigger() throws Exception {
		return this.pushenctrigger;
	}

	/**
	* <pre>
	* Enable sending SSL Close-Notify at the end of a transaction.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_sendclosenotify(String sendclosenotify) throws Exception{
		this.sendclosenotify = sendclosenotify;
	}

	/**
	* <pre>
	* Enable sending SSL Close-Notify at the end of a transaction.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_sendclosenotify() throws Exception {
		return this.sendclosenotify;
	}

	/**
	* <pre>
	* Name of the DTLS profile whose settings are to be applied to the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_dtlsprofilename(String dtlsprofilename) throws Exception{
		this.dtlsprofilename = dtlsprofilename;
	}

	/**
	* <pre>
	* Name of the DTLS profile whose settings are to be applied to the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_dtlsprofilename() throws Exception {
		return this.dtlsprofilename;
	}

	/**
	* <pre>
	* Display details of the individual ciphers bound to the SSL service.
	* </pre>
	*/
	public void set_cipherdetails(boolean cipherdetails) throws Exception {
		this.cipherdetails = new Boolean(cipherdetails);
	}

	/**
	* <pre>
	* Display details of the individual ciphers bound to the SSL service.
	* </pre>
	*/
	public void set_cipherdetails(Boolean cipherdetails) throws Exception{
		this.cipherdetails = cipherdetails;
	}

	/**
	* <pre>
	* Display details of the individual ciphers bound to the SSL service.
	* </pre>
	*/
	public Boolean get_cipherdetails() throws Exception {
		return this.cipherdetails;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_service() throws Exception {
		return this.service;
	}

	/**
	* <pre>
	* The flag is used to indicate whether this particular CA certificate's CA_Name needs to be sent to the SSL client while requesting      for client certificate in a SSL handshake.
	* </pre>
	*/
	public Boolean get_skipcaname() throws Exception {
		return this.skipcaname;
	}

	/**
	* <pre>
	* The flag is used to indicate whether DTLS is set or not.
	* </pre>
	*/
	public Boolean get_dtlsflag() throws Exception {
		return this.dtlsflag;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslservice_response result = (sslservice_response) service.get_payload_formatter().string_to_resource(sslservice_response.class, response);
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
		return result.sslservice;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicename;
	}

	/**
	* Use this API to update sslservice.
	*/
	public static base_response update(nitro_service client, sslservice resource) throws Exception {
		sslservice updateresource = new sslservice();
		updateresource.servicename = resource.servicename;
		updateresource.dh = resource.dh;
		updateresource.dhfile = resource.dhfile;
		updateresource.dhcount = resource.dhcount;
		updateresource.ersa = resource.ersa;
		updateresource.ersacount = resource.ersacount;
		updateresource.sessreuse = resource.sessreuse;
		updateresource.sesstimeout = resource.sesstimeout;
		updateresource.cipherredirect = resource.cipherredirect;
		updateresource.cipherurl = resource.cipherurl;
		updateresource.sslv2redirect = resource.sslv2redirect;
		updateresource.sslv2url = resource.sslv2url;
		updateresource.clientauth = resource.clientauth;
		updateresource.clientcert = resource.clientcert;
		updateresource.sslredirect = resource.sslredirect;
		updateresource.redirectportrewrite = resource.redirectportrewrite;
		updateresource.nonfipsciphers = resource.nonfipsciphers;
		updateresource.ssl2 = resource.ssl2;
		updateresource.ssl3 = resource.ssl3;
		updateresource.tls1 = resource.tls1;
		updateresource.tls11 = resource.tls11;
		updateresource.tls12 = resource.tls12;
		updateresource.snienable = resource.snienable;
		updateresource.serverauth = resource.serverauth;
		updateresource.commonname = resource.commonname;
		updateresource.pushenctrigger = resource.pushenctrigger;
		updateresource.sendclosenotify = resource.sendclosenotify;
		updateresource.dtlsprofilename = resource.dtlsprofilename;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update sslservice resources.
	*/
	public static base_responses update(nitro_service client, sslservice resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservice updateresources[] = new sslservice[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslservice();
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].dh = resources[i].dh;
				updateresources[i].dhfile = resources[i].dhfile;
				updateresources[i].dhcount = resources[i].dhcount;
				updateresources[i].ersa = resources[i].ersa;
				updateresources[i].ersacount = resources[i].ersacount;
				updateresources[i].sessreuse = resources[i].sessreuse;
				updateresources[i].sesstimeout = resources[i].sesstimeout;
				updateresources[i].cipherredirect = resources[i].cipherredirect;
				updateresources[i].cipherurl = resources[i].cipherurl;
				updateresources[i].sslv2redirect = resources[i].sslv2redirect;
				updateresources[i].sslv2url = resources[i].sslv2url;
				updateresources[i].clientauth = resources[i].clientauth;
				updateresources[i].clientcert = resources[i].clientcert;
				updateresources[i].sslredirect = resources[i].sslredirect;
				updateresources[i].redirectportrewrite = resources[i].redirectportrewrite;
				updateresources[i].nonfipsciphers = resources[i].nonfipsciphers;
				updateresources[i].ssl2 = resources[i].ssl2;
				updateresources[i].ssl3 = resources[i].ssl3;
				updateresources[i].tls1 = resources[i].tls1;
				updateresources[i].tls11 = resources[i].tls11;
				updateresources[i].tls12 = resources[i].tls12;
				updateresources[i].snienable = resources[i].snienable;
				updateresources[i].serverauth = resources[i].serverauth;
				updateresources[i].commonname = resources[i].commonname;
				updateresources[i].pushenctrigger = resources[i].pushenctrigger;
				updateresources[i].sendclosenotify = resources[i].sendclosenotify;
				updateresources[i].dtlsprofilename = resources[i].dtlsprofilename;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslservice resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslservice resource, String[] args) throws Exception{
		sslservice unsetresource = new sslservice();
		unsetresource.servicename = resource.servicename;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of sslservice resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String servicename[], String args[]) throws Exception {
		base_responses result = null;
		if (servicename != null && servicename.length > 0) {
			sslservice unsetresources[] = new sslservice[servicename.length];
			for (int i=0;i<servicename.length;i++){
				unsetresources[i] = new sslservice();
				unsetresources[i].servicename = servicename[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslservice resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, sslservice resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservice unsetresources[] = new sslservice[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new sslservice();
				unsetresources[i].servicename = resources[i].servicename;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslservice resources that are configured on netscaler.
	*/
	public static sslservice[] get(nitro_service service) throws Exception{
		sslservice obj = new sslservice();
		sslservice[] response = (sslservice[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslservice resources that are configured on netscaler.
	*/
	public static sslservice[] get(nitro_service service, options option) throws Exception{
		sslservice obj = new sslservice();
		sslservice[] response = (sslservice[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the sslservice resources that are configured on netscaler.
	* This uses sslservice_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static sslservice[] get(nitro_service service, sslservice_args args) throws Exception{
		sslservice obj = new sslservice();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		sslservice[] response = (sslservice[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch sslservice resource of given name .
	*/
	public static sslservice get(nitro_service service, String servicename) throws Exception{
		sslservice obj = new sslservice();
		obj.set_servicename(servicename);
		sslservice response = (sslservice) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslservice resources of given names .
	*/
	public static sslservice[] get(nitro_service service, String servicename[]) throws Exception{
		if (servicename !=null && servicename.length>0) {
			sslservice response[] = new sslservice[servicename.length];
			sslservice obj[] = new sslservice[servicename.length];
			for (int i=0;i<servicename.length;i++) {
				obj[i] = new sslservice();
				obj[i].set_servicename(servicename[i]);
				response[i] = (sslservice) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslservice resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslservice[] get_filtered(nitro_service service, String filter) throws Exception{
		sslservice obj = new sslservice();
		options option = new options();
		option.set_filter(filter);
		sslservice[] response = (sslservice[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservice resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslservice[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslservice obj = new sslservice();
		options option = new options();
		option.set_filter(filter);
		sslservice[] response = (sslservice[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslservice resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslservice obj = new sslservice();
		options option = new options();
		option.set_count(true);
		sslservice[] response = (sslservice[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslservice resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslservice obj = new sslservice();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservice[] response = (sslservice[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservice resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslservice obj = new sslservice();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservice[] response = (sslservice[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class sslredirectEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ersaEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class redirectportrewriteEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sessreuseEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ssl3Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class tls1Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sslv2redirectEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sendclosenotifyEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class tls11Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dhEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class tls12Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class serverauthEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class nonfipsciphersEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class snienableEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cipherredirectEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientcertEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class pushenctriggerEnum {
		public static final String Always = "Always";
		public static final String Merge = "Merge";
		public static final String Ignore = "Ignore";
		public static final String Timer = "Timer";
	}
	public static class clientauthEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ssl2Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
