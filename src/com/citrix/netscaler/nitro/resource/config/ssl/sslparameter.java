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
	* SSL quantum size configures the amount of data to be collected before we push the data to the crypto hardware for encryption. Setting the right quantum size based on the application requirements will help to better utilize the crypto resources. For example, in case of large downloads, larger quantum size is beneficial.<br> Default value: 8192<br> Possible values = 4096, 8192, 16384
	* </pre>
	*/
	public void set_quantumsize(String quantumsize) throws Exception{
		this.quantumsize = quantumsize;
	}

	/**
	* <pre>
	* SSL quantum size configures the amount of data to be collected before we push the data to the crypto hardware for encryption. Setting the right quantum size based on the application requirements will help to better utilize the crypto resources. For example, in case of large downloads, larger quantum size is beneficial.<br> Default value: 8192<br> Possible values = 4096, 8192, 16384
	* </pre>
	*/
	public String get_quantumsize() throws Exception {
		return this.quantumsize;
	}

	/**
	* <pre>
	* Memory size to use for CRLs. Set the maximum system memory size, the CRL(s) can consume. This setting will not reserve the memory for CRL, but will set the max limit all CRL(s) loaded in the system can consume.<br> Default value: 256<br> Minimum value =  10<br> Maximum value =  1024
	* </pre>
	*/
	public void set_crlmemorysizemb(long crlmemorysizemb) throws Exception {
		this.crlmemorysizemb = new Long(crlmemorysizemb);
	}

	/**
	* <pre>
	* Memory size to use for CRLs. Set the maximum system memory size, the CRL(s) can consume. This setting will not reserve the memory for CRL, but will set the max limit all CRL(s) loaded in the system can consume.<br> Default value: 256<br> Minimum value =  10<br> Maximum value =  1024
	* </pre>
	*/
	public void set_crlmemorysizemb(Long crlmemorysizemb) throws Exception{
		this.crlmemorysizemb = crlmemorysizemb;
	}

	/**
	* <pre>
	* Memory size to use for CRLs. Set the maximum system memory size, the CRL(s) can consume. This setting will not reserve the memory for CRL, but will set the max limit all CRL(s) loaded in the system can consume.<br> Default value: 256<br> Minimum value =  10<br> Maximum value =  1024
	* </pre>
	*/
	public Long get_crlmemorysizemb() throws Exception {
		return this.crlmemorysizemb;
	}

	/**
	* <pre>
	* Enable strict CA certificate checks.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_strictcachecks(String strictcachecks) throws Exception{
		this.strictcachecks = strictcachecks;
	}

	/**
	* <pre>
	* Enable strict CA certificate checks.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_strictcachecks() throws Exception {
		return this.strictcachecks;
	}

	/**
	* <pre>
	* Encryption trigger timer. Set the encryption trigger timeout for transactions, which are not trackable by Netscaler. NetScaler will use this setting to accumulate data received from the server for the configured time period before pushing it to the crypto hardware for encryption.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public void set_ssltriggertimeout(long ssltriggertimeout) throws Exception {
		this.ssltriggertimeout = new Long(ssltriggertimeout);
	}

	/**
	* <pre>
	* Encryption trigger timer. Set the encryption trigger timeout for transactions, which are not trackable by Netscaler. NetScaler will use this setting to accumulate data received from the server for the configured time period before pushing it to the crypto hardware for encryption.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public void set_ssltriggertimeout(Long ssltriggertimeout) throws Exception{
		this.ssltriggertimeout = ssltriggertimeout;
	}

	/**
	* <pre>
	* Encryption trigger timer. Set the encryption trigger timeout for transactions, which are not trackable by Netscaler. NetScaler will use this setting to accumulate data received from the server for the configured time period before pushing it to the crypto hardware for encryption.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public Long get_ssltriggertimeout() throws Exception {
		return this.ssltriggertimeout;
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
	* Number of queued packets that force encryption to occur. Set the maximum number of packets to accumulate before triggering encryption to the crypto hardware. Default setting is 45 packets. This setting can be used for non-trackable transactions which generates small size packets from server to NetScaler.<br> Default value: 45<br> Minimum value =  10<br> Maximum value =  50
	* </pre>
	*/
	public void set_encrypttriggerpktcount(long encrypttriggerpktcount) throws Exception {
		this.encrypttriggerpktcount = new Long(encrypttriggerpktcount);
	}

	/**
	* <pre>
	* Number of queued packets that force encryption to occur. Set the maximum number of packets to accumulate before triggering encryption to the crypto hardware. Default setting is 45 packets. This setting can be used for non-trackable transactions which generates small size packets from server to NetScaler.<br> Default value: 45<br> Minimum value =  10<br> Maximum value =  50
	* </pre>
	*/
	public void set_encrypttriggerpktcount(Long encrypttriggerpktcount) throws Exception{
		this.encrypttriggerpktcount = encrypttriggerpktcount;
	}

	/**
	* <pre>
	* Number of queued packets that force encryption to occur. Set the maximum number of packets to accumulate before triggering encryption to the crypto hardware. Default setting is 45 packets. This setting can be used for non-trackable transactions which generates small size packets from server to NetScaler.<br> Default value: 45<br> Minimum value =  10<br> Maximum value =  50
	* </pre>
	*/
	public Long get_encrypttriggerpktcount() throws Exception {
		return this.encrypttriggerpktcount;
	}

	/**
	* <pre>
	* SSL Renegotiation setting
NO: Allow SSL renegotiation to work.
FRONTEND_CLIENT: Deny SSL renegotiation initiated by the client.
FRONTEND_CLIENTSERVER: Deny SSL renegotiation initiated by the client and by NS (during policy-based clientAuth).
NONSECURE. Deny nonsecure SSL renegotiation. This option will only allow clients which support RFC 5746.
ALL: Deny SSL renegotiation for above two cases and for server initiated renegotiation on the backend side.
<br> Default value: NO<br> Possible values = NO, FRONTEND_CLIENT, FRONTEND_CLIENTSERVER, ALL, NONSECURE
	* </pre>
	*/
	public void set_denysslreneg(String denysslreneg) throws Exception{
		this.denysslreneg = denysslreneg;
	}

	/**
	* <pre>
	* SSL Renegotiation setting
NO: Allow SSL renegotiation to work.
FRONTEND_CLIENT: Deny SSL renegotiation initiated by the client.
FRONTEND_CLIENTSERVER: Deny SSL renegotiation initiated by the client and by NS (during policy-based clientAuth).
NONSECURE. Deny nonsecure SSL renegotiation. This option will only allow clients which support RFC 5746.
ALL: Deny SSL renegotiation for above two cases and for server initiated renegotiation on the backend side.
<br> Default value: NO<br> Possible values = NO, FRONTEND_CLIENT, FRONTEND_CLIENTSERVER, ALL, NONSECURE
	* </pre>
	*/
	public String get_denysslreneg() throws Exception {
		return this.denysslreneg;
	}

	/**
	* <pre>
	* Encoding method used to insert Subject/Issuer in HTTP Request to backend servers.<br> Default value: UNICODE_INSERTION<br> Possible values = Unicode, UTF-8
	* </pre>
	*/
	public void set_insertionencoding(String insertionencoding) throws Exception{
		this.insertionencoding = insertionencoding;
	}

	/**
	* <pre>
	* Encoding method used to insert Subject/Issuer in HTTP Request to backend servers.<br> Default value: UNICODE_INSERTION<br> Possible values = Unicode, UTF-8
	* </pre>
	*/
	public String get_insertionencoding() throws Exception {
		return this.insertionencoding;
	}

	/**
	* <pre>
	* Size, per packet engine, in megabytes of the OCSP cache.  The actual maximum value for this value is clamped at 10% of packet engine memory.  Maximum packet engine memory is 4GB; thus, if you have enough memory to give all packet engines 4GB of memory, the maximum value here would be approximately 410 MB.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public void set_ocspcachesize(long ocspcachesize) throws Exception {
		this.ocspcachesize = new Long(ocspcachesize);
	}

	/**
	* <pre>
	* Size, per packet engine, in megabytes of the OCSP cache.  The actual maximum value for this value is clamped at 10% of packet engine memory.  Maximum packet engine memory is 4GB; thus, if you have enough memory to give all packet engines 4GB of memory, the maximum value here would be approximately 410 MB.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public void set_ocspcachesize(Long ocspcachesize) throws Exception{
		this.ocspcachesize = ocspcachesize;
	}

	/**
	* <pre>
	* Size, per packet engine, in megabytes of the OCSP cache.  The actual maximum value for this value is clamped at 10% of packet engine memory.  Maximum packet engine memory is 4GB; thus, if you have enough memory to give all packet engines 4GB of memory, the maximum value here would be approximately 410 MB.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public Long get_ocspcachesize() throws Exception {
		return this.ocspcachesize;
	}

	/**
	* <pre>
	* PUSH insertion cotnrol flags (Can be ORed): 0 auto, 0x1 = every decrypted record, 0x2 = every encrypted record.<br> Minimum value =  0<br> Maximum value =  3
	* </pre>
	*/
	public void set_pushflag(long pushflag) throws Exception {
		this.pushflag = new Long(pushflag);
	}

	/**
	* <pre>
	* PUSH insertion cotnrol flags (Can be ORed): 0 auto, 0x1 = every decrypted record, 0x2 = every encrypted record.<br> Minimum value =  0<br> Maximum value =  3
	* </pre>
	*/
	public void set_pushflag(Long pushflag) throws Exception{
		this.pushflag = pushflag;
	}

	/**
	* <pre>
	* PUSH insertion cotnrol flags (Can be ORed): 0 auto, 0x1 = every decrypted record, 0x2 = every encrypted record.<br> Minimum value =  0<br> Maximum value =  3
	* </pre>
	*/
	public Long get_pushflag() throws Exception {
		return this.pushflag;
	}

	/**
	* <pre>
	* Host header check for SNI enabled sessions. If this check is enabled and if the HTTP request does not contain the Host header for SNI enabled session, then the request will be dropped.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_dropreqwithnohostheader(String dropreqwithnohostheader) throws Exception{
		this.dropreqwithnohostheader = dropreqwithnohostheader;
	}

	/**
	* <pre>
	* Host header check for SNI enabled sessions. If this check is enabled and if the HTTP request does not contain the Host header for SNI enabled session, then the request will be dropped.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_dropreqwithnohostheader() throws Exception {
		return this.dropreqwithnohostheader;
	}

	/**
	* <pre>
	* PUSH encryption trigger timer.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public void set_pushenctriggertimeout(long pushenctriggertimeout) throws Exception {
		this.pushenctriggertimeout = new Long(pushenctriggertimeout);
	}

	/**
	* <pre>
	* PUSH encryption trigger timer.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public void set_pushenctriggertimeout(Long pushenctriggertimeout) throws Exception{
		this.pushenctriggertimeout = pushenctriggertimeout;
	}

	/**
	* <pre>
	* PUSH encryption trigger timer.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  200
	* </pre>
	*/
	public Long get_pushenctriggertimeout() throws Exception {
		return this.pushenctriggertimeout;
	}

	/**
	* <pre>
	* Name of undef action. It can be SSL control builtin action like CLIENTAUTH, NOCLIENTAUTH or an action like NOOP, RESET, DROP.<br> Default value: "CLIENTAUTH"
	* </pre>
	*/
	public void set_undefactioncontrol(String undefactioncontrol) throws Exception{
		this.undefactioncontrol = undefactioncontrol;
	}

	/**
	* <pre>
	* Name of undef action. It can be SSL control builtin action like CLIENTAUTH, NOCLIENTAUTH or an action like NOOP, RESET, DROP.<br> Default value: "CLIENTAUTH"
	* </pre>
	*/
	public String get_undefactioncontrol() throws Exception {
		return this.undefactioncontrol;
	}

	/**
	* <pre>
	* Name of undef action. It can be NOOP, RESET or DROP.<br> Default value: "NOOP"
	* </pre>
	*/
	public void set_undefactiondata(String undefactiondata) throws Exception{
		this.undefactiondata = undefactiondata;
	}

	/**
	* <pre>
	* Name of undef action. It can be NOOP, RESET or DROP.<br> Default value: "NOOP"
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
		unsetresource.quantumsize = resource.quantumsize;
		unsetresource.crlmemorysizemb = resource.crlmemorysizemb;
		unsetresource.strictcachecks = resource.strictcachecks;
		unsetresource.ssltriggertimeout = resource.ssltriggertimeout;
		unsetresource.sendclosenotify = resource.sendclosenotify;
		unsetresource.encrypttriggerpktcount = resource.encrypttriggerpktcount;
		unsetresource.denysslreneg = resource.denysslreneg;
		unsetresource.insertionencoding = resource.insertionencoding;
		unsetresource.ocspcachesize = resource.ocspcachesize;
		unsetresource.pushflag = resource.pushflag;
		unsetresource.dropreqwithnohostheader = resource.dropreqwithnohostheader;
		unsetresource.pushenctriggertimeout = resource.pushenctriggertimeout;
		unsetresource.undefactioncontrol = resource.undefactioncontrol;
		unsetresource.undefactiondata = resource.undefactiondata;
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
