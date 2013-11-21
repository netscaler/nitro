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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwsettings_response extends base_response
{
	public appfwsettings appfwsettings;
}
/**
* Configuration for AS settings resource.
*/

public class appfwsettings extends base_resource
{
	private String defaultprofile;
	private String undefaction;
	private Long sessiontimeout;
	private Long learnratelimit;
	private Long sessionlifetime;
	private String sessioncookiename;
	private String clientiploggingheader;
	private Long importsizelimit;
	private String signatureautoupdate;
	private String signatureurl;
	private String cookiepostencryptprefix;
	private String logmalformedreq;
	private String ceflogging;
	private String entitydecoding;
	private String useconfigurablesecretkey;

	/**
	* <pre>
	* Profile to use when a connection does not match any policy. Default setting is APPFW_BYPASS, which sends unmatched connections back to the NetScaler appliance without attempting to filter them further.<br> Default value: APPFW_BYPASS<br> Minimum length =  1
	* </pre>
	*/
	public void set_defaultprofile(String defaultprofile) throws Exception{
		this.defaultprofile = defaultprofile;
	}

	/**
	* <pre>
	* Profile to use when a connection does not match any policy. Default setting is APPFW_BYPASS, which sends unmatched connections back to the NetScaler appliance without attempting to filter them further.<br> Default value: APPFW_BYPASS<br> Minimum length =  1
	* </pre>
	*/
	public String get_defaultprofile() throws Exception {
		return this.defaultprofile;
	}

	/**
	* <pre>
	* Profile to use when an application firewall policy evaluates to undefined (UNDEF). 
An UNDEF event indicates an internal error condition. The APPFW_BLOCK built-in profile is the default setting. You can specify a different built-in or user-created profile as the UNDEF profile.<br> Default value: APPFW_BLOCK<br> Minimum length =  1
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Profile to use when an application firewall policy evaluates to undefined (UNDEF). 
An UNDEF event indicates an internal error condition. The APPFW_BLOCK built-in profile is the default setting. You can specify a different built-in or user-created profile as the UNDEF profile.<br> Default value: APPFW_BLOCK<br> Minimum length =  1
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* Timeout, in seconds, after which a user session is terminated. Before continuing to use the protected web site, the user must establish a new session by opening a designated start URL.<br> Default value: 900<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_sessiontimeout(long sessiontimeout) throws Exception {
		this.sessiontimeout = new Long(sessiontimeout);
	}

	/**
	* <pre>
	* Timeout, in seconds, after which a user session is terminated. Before continuing to use the protected web site, the user must establish a new session by opening a designated start URL.<br> Default value: 900<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_sessiontimeout(Long sessiontimeout) throws Exception{
		this.sessiontimeout = sessiontimeout;
	}

	/**
	* <pre>
	* Timeout, in seconds, after which a user session is terminated. Before continuing to use the protected web site, the user must establish a new session by opening a designated start URL.<br> Default value: 900<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_sessiontimeout() throws Exception {
		return this.sessiontimeout;
	}

	/**
	* <pre>
	* Maximum number of connections per second that the application firewall learning engine examines to generate new relaxations for learning-enabled security checks. The application firewall drops any connections above this limit from the list of connections used by the learning engine.<br> Default value: 400<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_learnratelimit(long learnratelimit) throws Exception {
		this.learnratelimit = new Long(learnratelimit);
	}

	/**
	* <pre>
	* Maximum number of connections per second that the application firewall learning engine examines to generate new relaxations for learning-enabled security checks. The application firewall drops any connections above this limit from the list of connections used by the learning engine.<br> Default value: 400<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_learnratelimit(Long learnratelimit) throws Exception{
		this.learnratelimit = learnratelimit;
	}

	/**
	* <pre>
	* Maximum number of connections per second that the application firewall learning engine examines to generate new relaxations for learning-enabled security checks. The application firewall drops any connections above this limit from the list of connections used by the learning engine.<br> Default value: 400<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_learnratelimit() throws Exception {
		return this.learnratelimit;
	}

	/**
	* <pre>
	* Maximum amount of time (in seconds) that the application firewall allows a user session to remain active, regardless of user activity. After this time, the user session is terminated. Before continuing to use the protected web site, the user must establish a new session by opening a designated start URL.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_sessionlifetime(long sessionlifetime) throws Exception {
		this.sessionlifetime = new Long(sessionlifetime);
	}

	/**
	* <pre>
	* Maximum amount of time (in seconds) that the application firewall allows a user session to remain active, regardless of user activity. After this time, the user session is terminated. Before continuing to use the protected web site, the user must establish a new session by opening a designated start URL.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_sessionlifetime(Long sessionlifetime) throws Exception{
		this.sessionlifetime = sessionlifetime;
	}

	/**
	* <pre>
	* Maximum amount of time (in seconds) that the application firewall allows a user session to remain active, regardless of user activity. After this time, the user session is terminated. Before continuing to use the protected web site, the user must establish a new session by opening a designated start URL.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_sessionlifetime() throws Exception {
		return this.sessionlifetime;
	}

	/**
	* <pre>
	* Name of the session cookie that the application firewall uses to track user sessions. 
Must begin with a letter or number, and can consist of from 1 to 31 letters, numbers, and the hyphen (-) and underscore (_) symbols.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cookie name" or 'my cookie name').<br> Minimum length =  1
	* </pre>
	*/
	public void set_sessioncookiename(String sessioncookiename) throws Exception{
		this.sessioncookiename = sessioncookiename;
	}

	/**
	* <pre>
	* Name of the session cookie that the application firewall uses to track user sessions. 
Must begin with a letter or number, and can consist of from 1 to 31 letters, numbers, and the hyphen (-) and underscore (_) symbols.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cookie name" or 'my cookie name').<br> Minimum length =  1
	* </pre>
	*/
	public String get_sessioncookiename() throws Exception {
		return this.sessioncookiename;
	}

	/**
	* <pre>
	* Name of an HTTP header that contains the IP address that the client used to connect to the protected web site or service.
	* </pre>
	*/
	public void set_clientiploggingheader(String clientiploggingheader) throws Exception{
		this.clientiploggingheader = clientiploggingheader;
	}

	/**
	* <pre>
	* Name of an HTTP header that contains the IP address that the client used to connect to the protected web site or service.
	* </pre>
	*/
	public String get_clientiploggingheader() throws Exception {
		return this.clientiploggingheader;
	}

	/**
	* <pre>
	* Cumulative total maximum number of bytes in web forms imported to a protected web site. If a user attempts to upload files with a total byte count higher than the specified limit, the application firewall blocks the request.<br> Default value: 134217728<br> Minimum value =  1<br> Maximum value =  134217728
	* </pre>
	*/
	public void set_importsizelimit(long importsizelimit) throws Exception {
		this.importsizelimit = new Long(importsizelimit);
	}

	/**
	* <pre>
	* Cumulative total maximum number of bytes in web forms imported to a protected web site. If a user attempts to upload files with a total byte count higher than the specified limit, the application firewall blocks the request.<br> Default value: 134217728<br> Minimum value =  1<br> Maximum value =  134217728
	* </pre>
	*/
	public void set_importsizelimit(Long importsizelimit) throws Exception{
		this.importsizelimit = importsizelimit;
	}

	/**
	* <pre>
	* Cumulative total maximum number of bytes in web forms imported to a protected web site. If a user attempts to upload files with a total byte count higher than the specified limit, the application firewall blocks the request.<br> Default value: 134217728<br> Minimum value =  1<br> Maximum value =  134217728
	* </pre>
	*/
	public Long get_importsizelimit() throws Exception {
		return this.importsizelimit;
	}

	/**
	* <pre>
	* Flag used to enable/disable auto update signatures.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_signatureautoupdate(String signatureautoupdate) throws Exception{
		this.signatureautoupdate = signatureautoupdate;
	}

	/**
	* <pre>
	* Flag used to enable/disable auto update signatures.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_signatureautoupdate() throws Exception {
		return this.signatureautoupdate;
	}

	/**
	* <pre>
	* URL to download the mapping file from server.<br> Default value: https://s3.amazonaws.com/NSAppFwSignatures/SignaturesMapping.xml
	* </pre>
	*/
	public void set_signatureurl(String signatureurl) throws Exception{
		this.signatureurl = signatureurl;
	}

	/**
	* <pre>
	* URL to download the mapping file from server.<br> Default value: https://s3.amazonaws.com/NSAppFwSignatures/SignaturesMapping.xml
	* </pre>
	*/
	public String get_signatureurl() throws Exception {
		return this.signatureurl;
	}

	/**
	* <pre>
	* String that is prepended to all encrypted cookie values.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookiepostencryptprefix(String cookiepostencryptprefix) throws Exception{
		this.cookiepostencryptprefix = cookiepostencryptprefix;
	}

	/**
	* <pre>
	* String that is prepended to all encrypted cookie values.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookiepostencryptprefix() throws Exception {
		return this.cookiepostencryptprefix;
	}

	/**
	* <pre>
	* Log requests that are so malformed that application firewall parsing doesn't occur.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_logmalformedreq(String logmalformedreq) throws Exception{
		this.logmalformedreq = logmalformedreq;
	}

	/**
	* <pre>
	* Log requests that are so malformed that application firewall parsing doesn't occur.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_logmalformedreq() throws Exception {
		return this.logmalformedreq;
	}

	/**
	* <pre>
	* Enable CEF format logs.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_ceflogging(String ceflogging) throws Exception{
		this.ceflogging = ceflogging;
	}

	/**
	* <pre>
	* Enable CEF format logs.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_ceflogging() throws Exception {
		return this.ceflogging;
	}

	/**
	* <pre>
	* Transform multibyte (double- or half-width) characters to single width characters.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_entitydecoding(String entitydecoding) throws Exception{
		this.entitydecoding = entitydecoding;
	}

	/**
	* <pre>
	* Transform multibyte (double- or half-width) characters to single width characters.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_entitydecoding() throws Exception {
		return this.entitydecoding;
	}

	/**
	* <pre>
	* Use configurable secret key in AppFw operations.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_useconfigurablesecretkey(String useconfigurablesecretkey) throws Exception{
		this.useconfigurablesecretkey = useconfigurablesecretkey;
	}

	/**
	* <pre>
	* Use configurable secret key in AppFw operations.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_useconfigurablesecretkey() throws Exception {
		return this.useconfigurablesecretkey;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		appfwsettings[] resources = new appfwsettings[1];
		appfwsettings_response result = (appfwsettings_response) service.get_payload_formatter().string_to_resource(appfwsettings_response.class, response);
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
		resources[0] = result.appfwsettings;
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
	* Use this API to update appfwsettings.
	*/
	public static base_response update(nitro_service client, appfwsettings resource) throws Exception {
		appfwsettings updateresource = new appfwsettings();
		updateresource.defaultprofile = resource.defaultprofile;
		updateresource.undefaction = resource.undefaction;
		updateresource.sessiontimeout = resource.sessiontimeout;
		updateresource.learnratelimit = resource.learnratelimit;
		updateresource.sessionlifetime = resource.sessionlifetime;
		updateresource.sessioncookiename = resource.sessioncookiename;
		updateresource.clientiploggingheader = resource.clientiploggingheader;
		updateresource.importsizelimit = resource.importsizelimit;
		updateresource.signatureautoupdate = resource.signatureautoupdate;
		updateresource.signatureurl = resource.signatureurl;
		updateresource.cookiepostencryptprefix = resource.cookiepostencryptprefix;
		updateresource.logmalformedreq = resource.logmalformedreq;
		updateresource.ceflogging = resource.ceflogging;
		updateresource.entitydecoding = resource.entitydecoding;
		updateresource.useconfigurablesecretkey = resource.useconfigurablesecretkey;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of appfwsettings resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appfwsettings resource, String[] args) throws Exception{
		appfwsettings unsetresource = new appfwsettings();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the appfwsettings resources that are configured on netscaler.
	*/
	public static appfwsettings get(nitro_service service) throws Exception{
		appfwsettings obj = new appfwsettings();
		appfwsettings[] response = (appfwsettings[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the appfwsettings resources that are configured on netscaler.
	*/
	public static appfwsettings get(nitro_service service,  options option) throws Exception{
		appfwsettings obj = new appfwsettings();
		appfwsettings[] response = (appfwsettings[])obj.get_resources(service,option);
		return response[0];
	}

	public static class cefloggingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class logmalformedreqEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class signatureautoupdateEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class useconfigurablesecretkeyEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class entitydecodingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
