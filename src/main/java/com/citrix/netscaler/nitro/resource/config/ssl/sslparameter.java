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

class sslparameter_response extends base_response
{
	public sslparameter sslparameter;
}
/**
* Configuration for SSL parameter resource.
*/

public class sslparameter extends base_resource
{
	private String quantumsize;
	private Long crlmemorysizemb;
	private String strictcachecks;
	private Long ssltriggertimeout;
	private String sendclosenotify;
	private Long encrypttriggerpktcount;
	private String denysslreneg;
	private String insertionencoding;
	private Long ocspcachesize;
	private Long pushflag;
	private String dropreqwithnohostheader;
	private Long pushenctriggertimeout;
	private String undefactioncontrol;
	private String undefactiondata;

	/**
	* <pre>
	* Amount of data to collect before the data is pushed to the crypto hardware for encryption. For large downloads, a larger quantum size better utilizes the crypto resources.<br> Default value: 8192<br> Possible values = 4096, 8192, 16384
	* </pre>
	*/
	public void set_quantumsize(String quantumsize) throws Exception{
		this.quantumsize = quantumsize;
	}

	/**
	* <pre>
	* Amount of data to collect before the data is pushed to the crypto hardware for encryption. For large downloads, a larger quantum size better utilizes the crypto resources.<br> Default value: 8192<br> Possible values = 4096, 8192, 16384
	* </pre>
	*/
	public String get_quantumsize() throws Exception {
		return this.quantumsize;
	}

	/**
	* <pre>
	* Maximum memory size to use for certificate revocation lists (CRLs). This parameter reserves memory for a CRL but sets a limit to the maximum memory that the CRLs loaded on the appliance can consume.<br> Default value: 256<br> Minimum value =  10<br> Maximum value =  1024
	* </pre>
	*/
	public void set_crlmemorysizemb(long crlmemorysizemb) throws Exception {
		this.crlmemorysizemb = new Long(crlmemorysizemb);
	}

	/**
	* <pre>
	* Maximum memory size to use for certificate revocation lists (CRLs). This parameter reserves memory for a CRL but sets a limit to the maximum memory that the CRLs loaded on the appliance can consume.<br> Default value: 256<br> Minimum value =  10<br> Maximum value =  1024
	* </pre>
	*/
	public void set_crlmemorysizemb(Long crlmemorysizemb) throws Exception{
		this.crlmemorysizemb = crlmemorysizemb;
	}

	/**
	* <pre>
	* Maximum memory size to use for certificate revocation lists (CRLs). This parameter reserves memory for a CRL but sets a limit to the maximum memory that the CRLs loaded on the appliance can consume.<br> Default value: 256<br> Minimum value =  10<br> Maximum value =  1024
	* </pre>
	*/
	public Long get_crlmemorysizemb() throws Exception {
		return this.crlmemorysizemb;
	}

	/**
	* <pre>
	* Enable strict CA certificate checks on the appliance.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_strictcachecks(String strictcachecks) throws Exception{
		this.strictcachecks = strictcachecks;
	}

	/**
	* <pre>
	* Enable strict CA certificate checks on the appliance.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_strictcachecks() throws Exception {
		return this.strictcachecks;
	}

	/**
	* <pre>
	* Time, in milliseconds, after which encryption is triggered for transactions that are not tracked on the NetScaler appliance because their length is not known. There can be a delay of up to 10ms from the specified timeout value before the packet is pushed into the queue.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public void set_ssltriggertimeout(long ssltriggertimeout) throws Exception {
		this.ssltriggertimeout = new Long(ssltriggertimeout);
	}

	/**
	* <pre>
	* Time, in milliseconds, after which encryption is triggered for transactions that are not tracked on the NetScaler appliance because their length is not known. There can be a delay of up to 10ms from the specified timeout value before the packet is pushed into the queue.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public void set_ssltriggertimeout(Long ssltriggertimeout) throws Exception{
		this.ssltriggertimeout = ssltriggertimeout;
	}

	/**
	* <pre>
	* Time, in milliseconds, after which encryption is triggered for transactions that are not tracked on the NetScaler appliance because their length is not known. There can be a delay of up to 10ms from the specified timeout value before the packet is pushed into the queue.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public Long get_ssltriggertimeout() throws Exception {
		return this.ssltriggertimeout;
	}

	/**
	* <pre>
	* Send an SSL Close-Notify message to the client at the end of a transaction.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_sendclosenotify(String sendclosenotify) throws Exception{
		this.sendclosenotify = sendclosenotify;
	}

	/**
	* <pre>
	* Send an SSL Close-Notify message to the client at the end of a transaction.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_sendclosenotify() throws Exception {
		return this.sendclosenotify;
	}

	/**
	* <pre>
	* Maximum number of queued packets after which encryption is triggered. Use this setting for SSL transactions that send small packets from server to NetScaler.<br> Default value: 45<br> Minimum value =  10<br> Maximum value =  50
	* </pre>
	*/
	public void set_encrypttriggerpktcount(long encrypttriggerpktcount) throws Exception {
		this.encrypttriggerpktcount = new Long(encrypttriggerpktcount);
	}

	/**
	* <pre>
	* Maximum number of queued packets after which encryption is triggered. Use this setting for SSL transactions that send small packets from server to NetScaler.<br> Default value: 45<br> Minimum value =  10<br> Maximum value =  50
	* </pre>
	*/
	public void set_encrypttriggerpktcount(Long encrypttriggerpktcount) throws Exception{
		this.encrypttriggerpktcount = encrypttriggerpktcount;
	}

	/**
	* <pre>
	* Maximum number of queued packets after which encryption is triggered. Use this setting for SSL transactions that send small packets from server to NetScaler.<br> Default value: 45<br> Minimum value =  10<br> Maximum value =  50
	* </pre>
	*/
	public Long get_encrypttriggerpktcount() throws Exception {
		return this.encrypttriggerpktcount;
	}

	/**
	* <pre>
	* Deny renegotiation in specified circumstances. Available settings function as follows:
* NO - Allow SSL renegotiation.
* FRONTEND_CLIENT - Deny secure and nonsecure SSL renegotiation initiated by the client.
* FRONTEND_CLIENTSERVER - Deny secure and nonsecure SSL renegotiation initiated by the client or the NetScaler during policy-based client authentication. 
* ALL - Deny all secure and nonsecure SSL renegotiation.
* NONSECURE - Deny nonsecure SSL renegotiation. Allows only clients that support RFC 5746.<br> Default value: NO<br> Possible values = NO, FRONTEND_CLIENT, FRONTEND_CLIENTSERVER, ALL, NONSECURE
	* </pre>
	*/
	public void set_denysslreneg(String denysslreneg) throws Exception{
		this.denysslreneg = denysslreneg;
	}

	/**
	* <pre>
	* Deny renegotiation in specified circumstances. Available settings function as follows:
* NO - Allow SSL renegotiation.
* FRONTEND_CLIENT - Deny secure and nonsecure SSL renegotiation initiated by the client.
* FRONTEND_CLIENTSERVER - Deny secure and nonsecure SSL renegotiation initiated by the client or the NetScaler during policy-based client authentication. 
* ALL - Deny all secure and nonsecure SSL renegotiation.
* NONSECURE - Deny nonsecure SSL renegotiation. Allows only clients that support RFC 5746.<br> Default value: NO<br> Possible values = NO, FRONTEND_CLIENT, FRONTEND_CLIENTSERVER, ALL, NONSECURE
	* </pre>
	*/
	public String get_denysslreneg() throws Exception {
		return this.denysslreneg;
	}

	/**
	* <pre>
	* Encoding method used to insert the subject or issuer's name in HTTP requests to servers.<br> Default value: Unicode<br> Possible values = Unicode, UTF-8
	* </pre>
	*/
	public void set_insertionencoding(String insertionencoding) throws Exception{
		this.insertionencoding = insertionencoding;
	}

	/**
	* <pre>
	* Encoding method used to insert the subject or issuer's name in HTTP requests to servers.<br> Default value: Unicode<br> Possible values = Unicode, UTF-8
	* </pre>
	*/
	public String get_insertionencoding() throws Exception {
		return this.insertionencoding;
	}

	/**
	* <pre>
	* Size, per packet engine, in megabytes, of the OCSP cache. A maximum of 10% of the packet engine memory can be assigned. Because the maximum allowed packet engine memory is 4GB, the maximum value that can be assigned to the OCSP cache is approximately 410 MB.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public void set_ocspcachesize(long ocspcachesize) throws Exception {
		this.ocspcachesize = new Long(ocspcachesize);
	}

	/**
	* <pre>
	* Size, per packet engine, in megabytes, of the OCSP cache. A maximum of 10% of the packet engine memory can be assigned. Because the maximum allowed packet engine memory is 4GB, the maximum value that can be assigned to the OCSP cache is approximately 410 MB.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public void set_ocspcachesize(Long ocspcachesize) throws Exception{
		this.ocspcachesize = ocspcachesize;
	}

	/**
	* <pre>
	* Size, per packet engine, in megabytes, of the OCSP cache. A maximum of 10% of the packet engine memory can be assigned. Because the maximum allowed packet engine memory is 4GB, the maximum value that can be assigned to the OCSP cache is approximately 410 MB.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public Long get_ocspcachesize() throws Exception {
		return this.ocspcachesize;
	}

	/**
	* <pre>
	* Insert PUSH flag into decrypted, encrypted, or all records. If the PUSH flag is set to a value other than 0, the buffered records are forwarded on the basis of the value of the PUSH flag. Available settings function as follows:
0 - Auto (PUSH flag is not set.)
1 - Insert PUSH flag into every decrypted record.
2 -Insert PUSH flag into every encrypted record.
3 - Insert PUSH flag into every decrypted and encrypted record.<br> Minimum value =  0<br> Maximum value =  3
	* </pre>
	*/
	public void set_pushflag(long pushflag) throws Exception {
		this.pushflag = new Long(pushflag);
	}

	/**
	* <pre>
	* Insert PUSH flag into decrypted, encrypted, or all records. If the PUSH flag is set to a value other than 0, the buffered records are forwarded on the basis of the value of the PUSH flag. Available settings function as follows:
0 - Auto (PUSH flag is not set.)
1 - Insert PUSH flag into every decrypted record.
2 -Insert PUSH flag into every encrypted record.
3 - Insert PUSH flag into every decrypted and encrypted record.<br> Minimum value =  0<br> Maximum value =  3
	* </pre>
	*/
	public void set_pushflag(Long pushflag) throws Exception{
		this.pushflag = pushflag;
	}

	/**
	* <pre>
	* Insert PUSH flag into decrypted, encrypted, or all records. If the PUSH flag is set to a value other than 0, the buffered records are forwarded on the basis of the value of the PUSH flag. Available settings function as follows:
0 - Auto (PUSH flag is not set.)
1 - Insert PUSH flag into every decrypted record.
2 -Insert PUSH flag into every encrypted record.
3 - Insert PUSH flag into every decrypted and encrypted record.<br> Minimum value =  0<br> Maximum value =  3
	* </pre>
	*/
	public Long get_pushflag() throws Exception {
		return this.pushflag;
	}

	/**
	* <pre>
	* Host header check for SNI enabled sessions. If this check is enabled and the HTTP request does not contain the host header for SNI enabled sessions, the request is dropped.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_dropreqwithnohostheader(String dropreqwithnohostheader) throws Exception{
		this.dropreqwithnohostheader = dropreqwithnohostheader;
	}

	/**
	* <pre>
	* Host header check for SNI enabled sessions. If this check is enabled and the HTTP request does not contain the host header for SNI enabled sessions, the request is dropped.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_dropreqwithnohostheader() throws Exception {
		return this.dropreqwithnohostheader;
	}

	/**
	* <pre>
	* PUSH encryption trigger timeout value. The timeout value is applied only if you set the Push Encryption Trigger parameter to Timer in the SSL virtual server settings.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public void set_pushenctriggertimeout(long pushenctriggertimeout) throws Exception {
		this.pushenctriggertimeout = new Long(pushenctriggertimeout);
	}

	/**
	* <pre>
	* PUSH encryption trigger timeout value. The timeout value is applied only if you set the Push Encryption Trigger parameter to Timer in the SSL virtual server settings.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public void set_pushenctriggertimeout(Long pushenctriggertimeout) throws Exception{
		this.pushenctriggertimeout = pushenctriggertimeout;
	}

	/**
	* <pre>
	* PUSH encryption trigger timeout value. The timeout value is applied only if you set the Push Encryption Trigger parameter to Timer in the SSL virtual server settings.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public Long get_pushenctriggertimeout() throws Exception {
		return this.pushenctriggertimeout;
	}

	/**
	* <pre>
	* Name of the undefined built-in control action: CLIENTAUTH, NOCLIENTAUTH, NOOP, RESET, or DROP.<br> Default value: "CLIENTAUTH"
	* </pre>
	*/
	public void set_undefactioncontrol(String undefactioncontrol) throws Exception{
		this.undefactioncontrol = undefactioncontrol;
	}

	/**
	* <pre>
	* Name of the undefined built-in control action: CLIENTAUTH, NOCLIENTAUTH, NOOP, RESET, or DROP.<br> Default value: "CLIENTAUTH"
	* </pre>
	*/
	public String get_undefactioncontrol() throws Exception {
		return this.undefactioncontrol;
	}

	/**
	* <pre>
	* Name of the undefined built-in data action: NOOP, RESET or DROP.<br> Default value: "NOOP"
	* </pre>
	*/
	public void set_undefactiondata(String undefactiondata) throws Exception{
		this.undefactiondata = undefactiondata;
	}

	/**
	* <pre>
	* Name of the undefined built-in data action: NOOP, RESET or DROP.<br> Default value: "NOOP"
	* </pre>
	*/
	public String get_undefactiondata() throws Exception {
		return this.undefactiondata;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslparameter[] resources = new sslparameter[1];
		sslparameter_response result = (sslparameter_response) service.get_payload_formatter().string_to_resource(sslparameter_response.class, response);
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
		resources[0] = result.sslparameter;
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
	* Use this API to update sslparameter.
	*/
	public static base_response update(nitro_service client, sslparameter resource) throws Exception {
		sslparameter updateresource = new sslparameter();
		updateresource.quantumsize = resource.quantumsize;
		updateresource.crlmemorysizemb = resource.crlmemorysizemb;
		updateresource.strictcachecks = resource.strictcachecks;
		updateresource.ssltriggertimeout = resource.ssltriggertimeout;
		updateresource.sendclosenotify = resource.sendclosenotify;
		updateresource.encrypttriggerpktcount = resource.encrypttriggerpktcount;
		updateresource.denysslreneg = resource.denysslreneg;
		updateresource.insertionencoding = resource.insertionencoding;
		updateresource.ocspcachesize = resource.ocspcachesize;
		updateresource.pushflag = resource.pushflag;
		updateresource.dropreqwithnohostheader = resource.dropreqwithnohostheader;
		updateresource.pushenctriggertimeout = resource.pushenctriggertimeout;
		updateresource.undefactioncontrol = resource.undefactioncontrol;
		updateresource.undefactiondata = resource.undefactiondata;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of sslparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslparameter resource, String[] args) throws Exception{
		sslparameter unsetresource = new sslparameter();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the sslparameter resources that are configured on netscaler.
	*/
	public static sslparameter get(nitro_service service) throws Exception{
		sslparameter obj = new sslparameter();
		sslparameter[] response = (sslparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the sslparameter resources that are configured on netscaler.
	*/
	public static sslparameter get(nitro_service service,  options option) throws Exception{
		sslparameter obj = new sslparameter();
		sslparameter[] response = (sslparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class denysslrenegEnum {
		public static final String NO = "NO";
		public static final String FRONTEND_CLIENT = "FRONTEND_CLIENT";
		public static final String FRONTEND_CLIENTSERVER = "FRONTEND_CLIENTSERVER";
		public static final String ALL = "ALL";
		public static final String NONSECURE = "NONSECURE";
	}
	public static class insertionencodingEnum {
		public static final String Unicode = "Unicode";
		public static final String UTF_8 = "UTF-8";
	}
	public static class strictcachecksEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class quantumsizeEnum {
		public static final String _4096 = "4096";
		public static final String _8192 = "8192";
		public static final String _16384 = "16384";
	}
	public static class sendclosenotifyEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class dropreqwithnohostheaderEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
