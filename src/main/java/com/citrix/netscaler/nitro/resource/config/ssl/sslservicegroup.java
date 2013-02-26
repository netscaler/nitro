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

class sslservicegroup_response extends base_response
{
	public sslservicegroup[] sslservicegroup;
}
/**
* Configuration for SSL service group resource.
*/

public class sslservicegroup extends base_resource
{
	private String servicegroupname;
	private String sessreuse;
	private Long sesstimeout;
	private String nonfipsciphers;
	private String ssl3;
	private String tls1;
	private String serverauth;
	private String sendclosenotify;
	private Boolean cipherdetails;

	//------- Read only Parameter ---------;

	private String dh;
	private String dhfile;
	private Long dhcount;
	private String ersa;
	private Long ersacount;
	private String cipherredirect;
	private String cipherurl;
	private String sslv2redirect;
	private String sslv2url;
	private String clientauth;
	private String clientcert;
	private String sslredirect;
	private String redirectportrewrite;
	private String ssl2;
	private String ocspcheck;
	private String crlcheck;
	private Integer cleartextport;
	private String servicename;
	private Boolean ca;
	private Boolean snicert;
	private Long __count;

	/**
	* <pre>
	* The SSL service group name for which the advance configurations are to be set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The SSL service group name for which the advance configurations are to be set.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* The state of session reuse support for the SSL service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sessreuse(String sessreuse) throws Exception{
		this.sessreuse = sessreuse;
	}

	/**
	* <pre>
	* The state of session reuse support for the SSL service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sessreuse() throws Exception {
		return this.sessreuse;
	}

	/**
	* <pre>
	* The session timeout value in seconds. The value has to be a positive integer. Option '-sessReuse' has to be enabled.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sesstimeout(long sesstimeout) throws Exception {
		this.sesstimeout = new Long(sesstimeout);
	}

	/**
	* <pre>
	* The session timeout value in seconds. The value has to be a positive integer. Option '-sessReuse' has to be enabled.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sesstimeout(Long sesstimeout) throws Exception{
		this.sesstimeout = sesstimeout;
	}

	/**
	* <pre>
	* The session timeout value in seconds. The value has to be a positive integer. Option '-sessReuse' has to be enabled.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_sesstimeout() throws Exception {
		return this.sesstimeout;
	}

	/**
	* <pre>
	* The state of usage of non FIPS approved ciphers.
Valid only for an SSL service group bound with a FIPS key and certificate.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nonfipsciphers(String nonfipsciphers) throws Exception{
		this.nonfipsciphers = nonfipsciphers;
	}

	/**
	* <pre>
	* The state of usage of non FIPS approved ciphers.
Valid only for an SSL service group bound with a FIPS key and certificate.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nonfipsciphers() throws Exception {
		return this.nonfipsciphers;
	}

	/**
	* <pre>
	* The state of SSLv3 protocol support for the SSL service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ssl3(String ssl3) throws Exception{
		this.ssl3 = ssl3;
	}

	/**
	* <pre>
	* The state of SSLv3 protocol support for the SSL service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ssl3() throws Exception {
		return this.ssl3;
	}

	/**
	* <pre>
	* The state of TLSv1 protocol support for the SSL service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tls1(String tls1) throws Exception{
		this.tls1 = tls1;
	}

	/**
	* <pre>
	* The state of TLSv1 protocol support for the SSL service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tls1() throws Exception {
		return this.tls1;
	}

	/**
	* <pre>
	* The state of Server-Authentication support for the SSL service group.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_serverauth(String serverauth) throws Exception{
		this.serverauth = serverauth;
	}

	/**
	* <pre>
	* The state of Server-Authentication support for the SSL service group.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_serverauth() throws Exception {
		return this.serverauth;
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
	* Display the details of the individual ciphers bound to the SSL service group.
	* </pre>
	*/
	public void set_cipherdetails(boolean cipherdetails) throws Exception {
		this.cipherdetails = new Boolean(cipherdetails);
	}

	/**
	* <pre>
	* Display the details of the individual ciphers bound to the SSL service group.
	* </pre>
	*/
	public void set_cipherdetails(Boolean cipherdetails) throws Exception{
		this.cipherdetails = cipherdetails;
	}

	/**
	* <pre>
	* Display the details of the individual ciphers bound to the SSL service group.
	* </pre>
	*/
	public Boolean get_cipherdetails() throws Exception {
		return this.cipherdetails;
	}

	/**
	* <pre>
	* The state of DH key exchange support for the SSL service group.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dh() throws Exception {
		return this.dh;
	}

	/**
	* <pre>
	* The  file name and path for the DH parameter.
	* </pre>
	*/
	public String get_dhfile() throws Exception {
		return this.dhfile;
	}

	/**
	* <pre>
	* The  refresh  count  for  the re-generation of DH public-key and private-key from the DH parameter.
	* </pre>
	*/
	public Long get_dhcount() throws Exception {
		return this.dhcount;
	}

	/**
	* <pre>
	* The state of Ephemeral RSA key exchange support for the SSL service group.Ephemeral RSA is used for export ciphers.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ersa() throws Exception {
		return this.ersa;
	}

	/**
	* <pre>
	* The  refresh  count  for the re-generation of RSA public-key and private-key pair.
	* </pre>
	*/
	public Long get_ersacount() throws Exception {
		return this.ersacount;
	}

	/**
	* <pre>
	* The state of Cipher Redirect feature. Cipher Redirect feature can be used to provide more readable information to SSL clients about mismatch in ciphers between the client and the SSL vserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cipherredirect() throws Exception {
		return this.cipherredirect;
	}

	/**
	* <pre>
	* The redirect URL to be used with the  Cipher  Redirect  feature.
	* </pre>
	*/
	public String get_cipherurl() throws Exception {
		return this.cipherurl;
	}

	/**
	* <pre>
	* The state of SSLv2 Redirect feature.SSLv2 Redirect feature can be used to provide more readable information to SSL client about non-support of SSLv2 protocol on the SSL vserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sslv2redirect() throws Exception {
		return this.sslv2redirect;
	}

	/**
	* <pre>
	* The  redirect URL to be used with SSLv2 Redirect feature.
	* </pre>
	*/
	public String get_sslv2url() throws Exception {
		return this.sslv2url;
	}

	/**
	* <pre>
	* The state of Client-Authentication support for the SSL service group.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientauth() throws Exception {
		return this.clientauth;
	}

	/**
	* <pre>
	* The rule for client certificate requirement in client authentication.<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_clientcert() throws Exception {
		return this.clientcert;
	}

	/**
	* <pre>
	* The state of HTTPS redirects for the SSL service group.


This is required for the proper functioning of the redirect messages from the server. The redirect message from the server provides the new location for the moved object. This is contained in the HTTP header field: Location, e.g. Location: http://www.moved.org/here.html

For the SSL session, if the client browser receives this message, the browser will try to connect to the new location. This will break the secure SSL session, as the object has moved from a secure site (https://) to an un-secure one (http://). Generally browsers flash a warning message on the screen and prompt the user, either to continue or disconnect.

The above feature, when enabled will automatically convert all such http:// redirect message to https://. This will not break the client SSL session.

Note: The set ssl service command can be used for configuring a front-end SSL service for service based SSL Off-Loading, or a backend SSL service for backend-encryption setup.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sslredirect() throws Exception {
		return this.sslredirect;
	}

	/**
	* <pre>
	* The state of port-rewrite feature.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_redirectportrewrite() throws Exception {
		return this.redirectportrewrite;
	}

	/**
	* <pre>
	* The  state of SSLv2 protocol support for the SSL service group.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ssl2() throws Exception {
		return this.ssl2;
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
	* The state of the CRL check parameter. (Mandatory/Optional).<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_crlcheck() throws Exception {
		return this.crlcheck;
	}

	/**
	* <pre>
	* The port on the back-end web-servers where the clear-text data is sent by system. Use this setting for the wildcard IP based SSL Acceleration configuration (*:443).<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_cleartextport() throws Exception {
		return this.cleartextport;
	}

	/**
	* <pre>
	* The service name.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
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
		sslservicegroup_response result = (sslservicegroup_response) service.get_payload_formatter().string_to_resource(sslservicegroup_response.class, response);
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
		return result.sslservicegroup;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to update sslservicegroup.
	*/
	public static base_response update(nitro_service client, sslservicegroup resource) throws Exception {
		sslservicegroup updateresource = new sslservicegroup();
		updateresource.servicegroupname = resource.servicegroupname;
		updateresource.sessreuse = resource.sessreuse;
		updateresource.sesstimeout = resource.sesstimeout;
		updateresource.nonfipsciphers = resource.nonfipsciphers;
		updateresource.ssl3 = resource.ssl3;
		updateresource.tls1 = resource.tls1;
		updateresource.serverauth = resource.serverauth;
		updateresource.sendclosenotify = resource.sendclosenotify;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update sslservicegroup resources.
	*/
	public static base_responses update(nitro_service client, sslservicegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservicegroup updateresources[] = new sslservicegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslservicegroup();
				updateresources[i].servicegroupname = resources[i].servicegroupname;
				updateresources[i].sessreuse = resources[i].sessreuse;
				updateresources[i].sesstimeout = resources[i].sesstimeout;
				updateresources[i].nonfipsciphers = resources[i].nonfipsciphers;
				updateresources[i].ssl3 = resources[i].ssl3;
				updateresources[i].tls1 = resources[i].tls1;
				updateresources[i].serverauth = resources[i].serverauth;
				updateresources[i].sendclosenotify = resources[i].sendclosenotify;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslservicegroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String servicegroupname, String args[]) throws Exception {
		sslservicegroup unsetresource = new sslservicegroup();
		unsetresource.servicegroupname = servicegroupname;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of sslservicegroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslservicegroup resource, String[] args) throws Exception{
		sslservicegroup unsetresource = new sslservicegroup();
		unsetresource.servicegroupname = resource.servicegroupname;
		unsetresource.sessreuse = resource.sessreuse;
		unsetresource.sesstimeout = resource.sesstimeout;
		unsetresource.nonfipsciphers = resource.nonfipsciphers;
		unsetresource.ssl3 = resource.ssl3;
		unsetresource.tls1 = resource.tls1;
		unsetresource.serverauth = resource.serverauth;
		unsetresource.sendclosenotify = resource.sendclosenotify;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of sslservicegroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String servicegroupname[], String args[]) throws Exception {
		base_responses result = null;
		if (servicegroupname != null && servicegroupname.length > 0) {
			sslservicegroup unsetresources[] = new sslservicegroup[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++){
				unsetresources[i] = new sslservicegroup();
				unsetresources[i].servicegroupname = servicegroupname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslservicegroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, sslservicegroup resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservicegroup unsetresources[] = new sslservicegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new sslservicegroup();
				unsetresources[i].servicegroupname = resources[i].servicegroupname;
				unsetresources[i].sessreuse = resources[i].sessreuse;
				unsetresources[i].sesstimeout = resources[i].sesstimeout;
				unsetresources[i].nonfipsciphers = resources[i].nonfipsciphers;
				unsetresources[i].ssl3 = resources[i].ssl3;
				unsetresources[i].tls1 = resources[i].tls1;
				unsetresources[i].serverauth = resources[i].serverauth;
				unsetresources[i].sendclosenotify = resources[i].sendclosenotify;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslservicegroup resources that are configured on netscaler.
	*/
	public static sslservicegroup[] get(nitro_service service) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		sslservicegroup[] response = (sslservicegroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslservicegroup resources that are configured on netscaler.
	*/
	public static sslservicegroup[] get(nitro_service service, options option) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		sslservicegroup[] response = (sslservicegroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the sslservicegroup resources that are configured on netscaler.
	* This uses sslservicegroup_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static sslservicegroup[] get(nitro_service service, sslservicegroup_args args) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		sslservicegroup[] response = (sslservicegroup[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch sslservicegroup resource of given name .
	*/
	public static sslservicegroup get(nitro_service service, String servicegroupname) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		obj.set_servicegroupname(servicegroupname);
		sslservicegroup response = (sslservicegroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslservicegroup resources of given names .
	*/
	public static sslservicegroup[] get(nitro_service service, String servicegroupname[]) throws Exception{
		if (servicegroupname !=null && servicegroupname.length>0) {
			sslservicegroup response[] = new sslservicegroup[servicegroupname.length];
			sslservicegroup obj[] = new sslservicegroup[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++) {
				obj[i] = new sslservicegroup();
				obj[i].set_servicegroupname(servicegroupname[i]);
				response[i] = (sslservicegroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslservicegroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslservicegroup[] get_filtered(nitro_service service, String filter) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		options option = new options();
		option.set_filter(filter);
		sslservicegroup[] response = (sslservicegroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservicegroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslservicegroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		options option = new options();
		option.set_filter(filter);
		sslservicegroup[] response = (sslservicegroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslservicegroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		options option = new options();
		option.set_count(true);
		sslservicegroup[] response = (sslservicegroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslservicegroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservicegroup[] response = (sslservicegroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservicegroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslservicegroup obj = new sslservicegroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservicegroup[] response = (sslservicegroup[]) obj.getfiltered(service, option);
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
	public static class serverauthEnum {
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
	public static class cipherredirectEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientcertEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
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
