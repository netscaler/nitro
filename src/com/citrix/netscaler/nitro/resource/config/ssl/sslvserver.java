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

class sslvserver_response extends base_response
{
	public sslvserver[] sslvserver;
}
/**
* Configuration for SSL virtual server resource.
*/

public class sslvserver extends base_resource
{
	private String vservername;
	private Integer cleartextport;
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
	private String snienable;
	private String pushenctrigger;
	private String sendclosenotify;
	private Boolean cipherdetails;

	//------- Read only Parameter ---------;

	private String crlcheck;
	private Long service;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private String servicename;
	private String ocspcheck;
	private String gotopriorityexpression;
	private Boolean ca;
	private Boolean snicert;
	private Long __count;

	/**
	* <pre>
	* The name of the SSL virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* The name of the SSL virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* The port on the back-end web-servers where the clear-text data is sent by system. Use this setting for the wildcard IP based SSL Acceleration configuration (*:443).
	* </pre>
	*/
	public void set_cleartextport(int cleartextport) throws Exception {
		this.cleartextport = new Integer(cleartextport);
	}

	/**
	* <pre>
	* The port on the back-end web-servers where the clear-text data is sent by system. Use this setting for the wildcard IP based SSL Acceleration configuration (*:443).
	* </pre>
	*/
	public void set_cleartextport(Integer cleartextport) throws Exception{
		this.cleartextport = cleartextport;
	}

	/**
	* <pre>
	* The port on the back-end web-servers where the clear-text data is sent by system. Use this setting for the wildcard IP based SSL Acceleration configuration (*:443).
	* </pre>
	*/
	public Integer get_cleartextport() throws Exception {
		return this.cleartextport;
	}

	/**
	* <pre>
	* The state of DH key exchange support for the specified SSL virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dh(String dh) throws Exception{
		this.dh = dh;
	}

	/**
	* <pre>
	* The state of DH key exchange support for the specified SSL virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dh() throws Exception {
		return this.dh;
	}

	/**
	* <pre>
	* The file name and path for the DH parameter. The file format is PEM.
					Note: The '-dh' argument must be enabled if this argument is specified.<br> Minimum length =  1
	* </pre>
	*/
	public void set_dhfile(String dhfile) throws Exception{
		this.dhfile = dhfile;
	}

	/**
	* <pre>
	* The file name and path for the DH parameter. The file format is PEM.
					Note: The '-dh' argument must be enabled if this argument is specified.<br> Minimum length =  1
	* </pre>
	*/
	public String get_dhfile() throws Exception {
		return this.dhfile;
	}

	/**
	* <pre>
	* The refresh count for the re-generation of DH public-key and private-key from the DH parameter. Zero means infinite usage (no refresh).

	Note: The '-dh' argument must be enabled if this argument is specified.
<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_dhcount(long dhcount) throws Exception {
		this.dhcount = new Long(dhcount);
	}

	/**
	* <pre>
	* The refresh count for the re-generation of DH public-key and private-key from the DH parameter. Zero means infinite usage (no refresh).

	Note: The '-dh' argument must be enabled if this argument is specified.
<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_dhcount(Long dhcount) throws Exception{
		this.dhcount = dhcount;
	}

	/**
	* <pre>
	* The refresh count for the re-generation of DH public-key and private-key from the DH parameter. Zero means infinite usage (no refresh).

	Note: The '-dh' argument must be enabled if this argument is specified.
<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_dhcount() throws Exception {
		return this.dhcount;
	}

	/**
	* <pre>
	* The state of Ephemeral RSA key exchange support for the SSL virtual server. Ephemeral RSA is used for export ciphers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ersa(String ersa) throws Exception{
		this.ersa = ersa;
	}

	/**
	* <pre>
	* The state of Ephemeral RSA key exchange support for the SSL virtual server. Ephemeral RSA is used for export ciphers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ersa() throws Exception {
		return this.ersa;
	}

	/**
	* <pre>
	* The refresh count for the re-generation of RSA public-key and private-key pair. Zero means infinite usage (no refresh)
								Note: The '-eRSA' argument must be enabled if this argument is specified.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_ersacount(long ersacount) throws Exception {
		this.ersacount = new Long(ersacount);
	}

	/**
	* <pre>
	* The refresh count for the re-generation of RSA public-key and private-key pair. Zero means infinite usage (no refresh)
								Note: The '-eRSA' argument must be enabled if this argument is specified.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_ersacount(Long ersacount) throws Exception{
		this.ersacount = ersacount;
	}

	/**
	* <pre>
	* The refresh count for the re-generation of RSA public-key and private-key pair. Zero means infinite usage (no refresh)
								Note: The '-eRSA' argument must be enabled if this argument is specified.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_ersacount() throws Exception {
		return this.ersacount;
	}

	/**
	* <pre>
	* The state of session re-use support for the SSL virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sessreuse(String sessreuse) throws Exception{
		this.sessreuse = sessreuse;
	}

	/**
	* <pre>
	* The state of session re-use support for the SSL virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sessreuse() throws Exception {
		return this.sessreuse;
	}

	/**
	* <pre>
	* The Session timeout value in seconds. The value has to be a positive integer. The '-sessReuse' argument must be enabled if this argument is specified.<br> Default value: 120<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sesstimeout(long sesstimeout) throws Exception {
		this.sesstimeout = new Long(sesstimeout);
	}

	/**
	* <pre>
	* The Session timeout value in seconds. The value has to be a positive integer. The '-sessReuse' argument must be enabled if this argument is specified.<br> Default value: 120<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sesstimeout(Long sesstimeout) throws Exception{
		this.sesstimeout = sesstimeout;
	}

	/**
	* <pre>
	* The Session timeout value in seconds. The value has to be a positive integer. The '-sessReuse' argument must be enabled if this argument is specified.<br> Default value: 120<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_sesstimeout() throws Exception {
		return this.sesstimeout;
	}

	/**
	* <pre>
	* The state of Cipher Redirect feature.Cipher Redirect feature can be used to provide more readable information to SSL clients about mismatch in ciphers between the client and the SSL vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cipherredirect(String cipherredirect) throws Exception{
		this.cipherredirect = cipherredirect;
	}

	/**
	* <pre>
	* The state of Cipher Redirect feature.Cipher Redirect feature can be used to provide more readable information to SSL clients about mismatch in ciphers between the client and the SSL vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cipherredirect() throws Exception {
		return this.cipherredirect;
	}

	/**
	* <pre>
	* The redirect URL to be used with the Cipher Redirect feature.
	* </pre>
	*/
	public void set_cipherurl(String cipherurl) throws Exception{
		this.cipherurl = cipherurl;
	}

	/**
	* <pre>
	* The redirect URL to be used with the Cipher Redirect feature.
	* </pre>
	*/
	public String get_cipherurl() throws Exception {
		return this.cipherurl;
	}

	/**
	* <pre>
	* The state of SSLv2 Redirect feature.SSLv2 Redirect feature can be used to provide more readable information to SSL client about non-support of SSLv2 protocol on the SSL vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sslv2redirect(String sslv2redirect) throws Exception{
		this.sslv2redirect = sslv2redirect;
	}

	/**
	* <pre>
	* The state of SSLv2 Redirect feature.SSLv2 Redirect feature can be used to provide more readable information to SSL client about non-support of SSLv2 protocol on the SSL vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sslv2redirect() throws Exception {
		return this.sslv2redirect;
	}

	/**
	* <pre>
	* The redirect URL to be used with SSLv2 Redirect feature.
	* </pre>
	*/
	public void set_sslv2url(String sslv2url) throws Exception{
		this.sslv2url = sslv2url;
	}

	/**
	* <pre>
	* The redirect URL to be used with SSLv2 Redirect feature.
	* </pre>
	*/
	public String get_sslv2url() throws Exception {
		return this.sslv2url;
	}

	/**
	* <pre>
	* The state of Client-Authentication support for the SSL virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientauth(String clientauth) throws Exception{
		this.clientauth = clientauth;
	}

	/**
	* <pre>
	* The state of Client-Authentication support for the SSL virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientauth() throws Exception {
		return this.clientauth;
	}

	/**
	* <pre>
	* The rule for client authentication. If the clientCert if set to Mandatory, the system will terminate the SSL handshake if the SSL client does not provide a valid certificate. If the setting is Optional, then System will allow SSL clients with no certificate or invalid certificates to access the secure resource.
						Note: Make sure proper access control policies are defined before changing the above setting to Optional.<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public void set_clientcert(String clientcert) throws Exception{
		this.clientcert = clientcert;
	}

	/**
	* <pre>
	* The rule for client authentication. If the clientCert if set to Mandatory, the system will terminate the SSL handshake if the SSL client does not provide a valid certificate. If the setting is Optional, then System will allow SSL clients with no certificate or invalid certificates to access the secure resource.
						Note: Make sure proper access control policies are defined before changing the above setting to Optional.<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_clientcert() throws Exception {
		return this.clientcert;
	}

	/**
	* <pre>
	* The state of HTTPS redirects for the SSL virtual server. This is required for proper working of the redirect messages from the web server. The redirect message from the server gives the new location for the moved object. This is contained in the HTTP header field: Location (for example, Location: http://www.moved.org/here.html).

For an SSL session, if the client browser receives this message, the browser will try to connect to the new location. This will break the secure SSL session, as the object has moved from a secure site (https://) to an unsecured one (http://). Browsers usually flash a warning message on the screen and prompt the user to either continue or disconnect.

When the above feature is enabled, all such http:// redirect messages are automatically converted to https://. This does not break the client SSL session.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sslredirect(String sslredirect) throws Exception{
		this.sslredirect = sslredirect;
	}

	/**
	* <pre>
	* The state of HTTPS redirects for the SSL virtual server. This is required for proper working of the redirect messages from the web server. The redirect message from the server gives the new location for the moved object. This is contained in the HTTP header field: Location (for example, Location: http://www.moved.org/here.html).

For an SSL session, if the client browser receives this message, the browser will try to connect to the new location. This will break the secure SSL session, as the object has moved from a secure site (https://) to an unsecured one (http://). Browsers usually flash a warning message on the screen and prompt the user to either continue or disconnect.

When the above feature is enabled, all such http:// redirect messages are automatically converted to https://. This does not break the client SSL session.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sslredirect() throws Exception {
		return this.sslredirect;
	}

	/**
	* <pre>
	*  The state of port in rewrite while performing HTTPS redirect. When this setting is ENABLED on a SSL virtual server, the NetScaler rewrites the port by using the port settings of the content switching virtual server. .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_redirectportrewrite(String redirectportrewrite) throws Exception{
		this.redirectportrewrite = redirectportrewrite;
	}

	/**
	* <pre>
	*  The state of port in rewrite while performing HTTPS redirect. When this setting is ENABLED on a SSL virtual server, the NetScaler rewrites the port by using the port settings of the content switching virtual server. .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_redirectportrewrite() throws Exception {
		return this.redirectportrewrite;
	}

	/**
	* <pre>
	* The state of usage of non FIPS approved ciphers. Valid only for an SSL vserver bound with a FIPS key and certificate.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nonfipsciphers(String nonfipsciphers) throws Exception{
		this.nonfipsciphers = nonfipsciphers;
	}

	/**
	* <pre>
	* The state of usage of non FIPS approved ciphers. Valid only for an SSL vserver bound with a FIPS key and certificate.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nonfipsciphers() throws Exception {
		return this.nonfipsciphers;
	}

	/**
	* <pre>
	* The state of SSLv2 protocol support for the SSL virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ssl2(String ssl2) throws Exception{
		this.ssl2 = ssl2;
	}

	/**
	* <pre>
	* The state of SSLv2 protocol support for the SSL virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ssl2() throws Exception {
		return this.ssl2;
	}

	/**
	* <pre>
	* The state of SSLv3 protocol support for the SSL virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ssl3(String ssl3) throws Exception{
		this.ssl3 = ssl3;
	}

	/**
	* <pre>
	* The state of SSLv3 protocol support for the SSL virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ssl3() throws Exception {
		return this.ssl3;
	}

	/**
	* <pre>
	* The state of TLSv1 protocol support for the SSL virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tls1(String tls1) throws Exception{
		this.tls1 = tls1;
	}

	/**
	* <pre>
	* The state of TLSv1 protocol support for the SSL virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tls1() throws Exception {
		return this.tls1;
	}

	/**
	* <pre>
	* state of SNI feature on virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_snienable(String snienable) throws Exception{
		this.snienable = snienable;
	}

	/**
	* <pre>
	* state of SNI feature on virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_snienable() throws Exception {
		return this.snienable;
	}

	/**
	* <pre>
	* PUSH packet triggering encryption
Always - Any PUSH packet triggers encryption
Ignore - Ignore PUSH packet for triggering encryption
Merge - For consecutive sequence of PUSH packets, last PUSH packet triggers encryption
Timer - PUSH packet triggering encryption delayed by timer period defined in 'set ssl parameter'
.<br> Possible values = Always, Merge, Ignore, Timer
	* </pre>
	*/
	public void set_pushenctrigger(String pushenctrigger) throws Exception{
		this.pushenctrigger = pushenctrigger;
	}

	/**
	* <pre>
	* PUSH packet triggering encryption
Always - Any PUSH packet triggers encryption
Ignore - Ignore PUSH packet for triggering encryption
Merge - For consecutive sequence of PUSH packets, last PUSH packet triggers encryption
Timer - PUSH packet triggering encryption delayed by timer period defined in 'set ssl parameter'
.<br> Possible values = Always, Merge, Ignore, Timer
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
	* Details of the individual ciphers bound to the SSL vserver. Select this flag value to display the details of the individual ciphers bound to the SSL vserver.
	* </pre>
	*/
	public void set_cipherdetails(boolean cipherdetails) throws Exception {
		this.cipherdetails = new Boolean(cipherdetails);
	}

	/**
	* <pre>
	* Details of the individual ciphers bound to the SSL vserver. Select this flag value to display the details of the individual ciphers bound to the SSL vserver.
	* </pre>
	*/
	public void set_cipherdetails(Boolean cipherdetails) throws Exception{
		this.cipherdetails = cipherdetails;
	}

	/**
	* <pre>
	* Details of the individual ciphers bound to the SSL vserver. Select this flag value to display the details of the individual ciphers bound to the SSL vserver.
	* </pre>
	*/
	public Boolean get_cipherdetails() throws Exception {
		return this.cipherdetails;
	}

	/**
	* <pre>
	* The state of the CRL check parameter. (Mandatory/Optional).<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_crlcheck() throws Exception {
		return this.crlcheck;
	}

	/**
	* <pre>
	* Service.
	* </pre>
	*/
	public Long get_service() throws Exception {
		return this.service;
	}

	/**
	* <pre>
	* Invoke flag. This attribute is relevant only for ADVANCED policies.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = vserver, service, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Service name.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The state of the OCSP check parameter. (Mandatory/Optional).<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_ocspcheck() throws Exception {
		return this.ocspcheck;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* CA certificate.
	* </pre>
	*/
	public Boolean get_ca() throws Exception {
		return this.ca;
	}

	/**
	* <pre>
	* The name of the CertKey. Use this option to bind Certkey(s) which will be used in SNI processing.
	* </pre>
	*/
	public Boolean get_snicert() throws Exception {
		return this.snicert;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslvserver_response result = (sslvserver_response) service.get_payload_formatter().string_to_resource(sslvserver_response.class, response);
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
		return result.sslvserver;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.vservername;
	}

	/**
	* Use this API to update sslvserver.
	*/
	public static base_response update(nitro_service client, sslvserver resource) throws Exception {
		sslvserver updateresource = new sslvserver();
		updateresource.vservername = resource.vservername;
		updateresource.cleartextport = resource.cleartextport;
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
		updateresource.snienable = resource.snienable;
		updateresource.pushenctrigger = resource.pushenctrigger;
		updateresource.sendclosenotify = resource.sendclosenotify;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update sslvserver resources.
	*/
	public static base_responses update(nitro_service client, sslvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslvserver updateresources[] = new sslvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslvserver();
				updateresources[i].vservername = resources[i].vservername;
				updateresources[i].cleartextport = resources[i].cleartextport;
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
				updateresources[i].snienable = resources[i].snienable;
				updateresources[i].pushenctrigger = resources[i].pushenctrigger;
				updateresources[i].sendclosenotify = resources[i].sendclosenotify;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String vservername, String args[]) throws Exception {
		sslvserver unsetresource = new sslvserver();
		unsetresource.vservername = vservername;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of sslvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslvserver resource, String[] args) throws Exception{
		sslvserver unsetresource = new sslvserver();
		unsetresource.vservername = resource.vservername;
		unsetresource.cleartextport = resource.cleartextport;
		unsetresource.dh = resource.dh;
		unsetresource.dhfile = resource.dhfile;
		unsetresource.dhcount = resource.dhcount;
		unsetresource.ersa = resource.ersa;
		unsetresource.ersacount = resource.ersacount;
		unsetresource.sessreuse = resource.sessreuse;
		unsetresource.sesstimeout = resource.sesstimeout;
		unsetresource.cipherredirect = resource.cipherredirect;
		unsetresource.cipherurl = resource.cipherurl;
		unsetresource.sslv2redirect = resource.sslv2redirect;
		unsetresource.sslv2url = resource.sslv2url;
		unsetresource.clientauth = resource.clientauth;
		unsetresource.clientcert = resource.clientcert;
		unsetresource.sslredirect = resource.sslredirect;
		unsetresource.redirectportrewrite = resource.redirectportrewrite;
		unsetresource.nonfipsciphers = resource.nonfipsciphers;
		unsetresource.ssl2 = resource.ssl2;
		unsetresource.ssl3 = resource.ssl3;
		unsetresource.tls1 = resource.tls1;
		unsetresource.snienable = resource.snienable;
		unsetresource.sendclosenotify = resource.sendclosenotify;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of sslvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String vservername[], String args[]) throws Exception {
		base_responses result = null;
		if (vservername != null && vservername.length > 0) {
			sslvserver unsetresources[] = new sslvserver[vservername.length];
			for (int i=0;i<vservername.length;i++){
				unsetresources[i] = new sslvserver();
				unsetresources[i].vservername = vservername[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, sslvserver resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslvserver unsetresources[] = new sslvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new sslvserver();
				unsetresources[i].vservername = resources[i].vservername;
				unsetresources[i].cleartextport = resources[i].cleartextport;
				unsetresources[i].dh = resources[i].dh;
				unsetresources[i].dhfile = resources[i].dhfile;
				unsetresources[i].dhcount = resources[i].dhcount;
				unsetresources[i].ersa = resources[i].ersa;
				unsetresources[i].ersacount = resources[i].ersacount;
				unsetresources[i].sessreuse = resources[i].sessreuse;
				unsetresources[i].sesstimeout = resources[i].sesstimeout;
				unsetresources[i].cipherredirect = resources[i].cipherredirect;
				unsetresources[i].cipherurl = resources[i].cipherurl;
				unsetresources[i].sslv2redirect = resources[i].sslv2redirect;
				unsetresources[i].sslv2url = resources[i].sslv2url;
				unsetresources[i].clientauth = resources[i].clientauth;
				unsetresources[i].clientcert = resources[i].clientcert;
				unsetresources[i].sslredirect = resources[i].sslredirect;
				unsetresources[i].redirectportrewrite = resources[i].redirectportrewrite;
				unsetresources[i].nonfipsciphers = resources[i].nonfipsciphers;
				unsetresources[i].ssl2 = resources[i].ssl2;
				unsetresources[i].ssl3 = resources[i].ssl3;
				unsetresources[i].tls1 = resources[i].tls1;
				unsetresources[i].snienable = resources[i].snienable;
				unsetresources[i].sendclosenotify = resources[i].sendclosenotify;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslvserver resources that are configured on netscaler.
	*/
	public static sslvserver[] get(nitro_service service) throws Exception{
		sslvserver obj = new sslvserver();
		sslvserver[] response = (sslvserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslvserver resources that are configured on netscaler.
	*/
	public static sslvserver[] get(nitro_service service, options option) throws Exception{
		sslvserver obj = new sslvserver();
		sslvserver[] response = (sslvserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the sslvserver resources that are configured on netscaler.
	* This uses sslvserver_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static sslvserver[] get(nitro_service service, sslvserver_args args) throws Exception{
		sslvserver obj = new sslvserver();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		sslvserver[] response = (sslvserver[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch sslvserver resource of given name .
	*/
	public static sslvserver get(nitro_service service, String vservername) throws Exception{
		sslvserver obj = new sslvserver();
		obj.set_vservername(vservername);
		sslvserver response = (sslvserver) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslvserver resources of given names .
	*/
	public static sslvserver[] get(nitro_service service, String vservername[]) throws Exception{
		if (vservername !=null && vservername.length>0) {
			sslvserver response[] = new sslvserver[vservername.length];
			sslvserver obj[] = new sslvserver[vservername.length];
			for (int i=0;i<vservername.length;i++) {
				obj[i] = new sslvserver();
				obj[i].set_vservername(vservername[i]);
				response[i] = (sslvserver) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslvserver[] get_filtered(nitro_service service, String filter) throws Exception{
		sslvserver obj = new sslvserver();
		options option = new options();
		option.set_filter(filter);
		sslvserver[] response = (sslvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslvserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslvserver obj = new sslvserver();
		options option = new options();
		option.set_filter(filter);
		sslvserver[] response = (sslvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslvserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslvserver obj = new sslvserver();
		options option = new options();
		option.set_count(true);
		sslvserver[] response = (sslvserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslvserver obj = new sslvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslvserver[] response = (sslvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslvserver obj = new sslvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslvserver[] response = (sslvserver[]) obj.getfiltered(service, option);
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
	public static class dhEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class redirectportrewriteEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class nonfipsciphersEnum {
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
	public static class snienableEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cipherredirectEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String service = "service";
		public static final String policylabel = "policylabel";
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
	public static class crlcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class clientauthEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sslv2redirectEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ssl2Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ocspcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class sendclosenotifyEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
