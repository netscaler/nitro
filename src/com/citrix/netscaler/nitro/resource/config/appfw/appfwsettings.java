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
	private String cookiepostencryptprefix;
	private String logmalformedreq;
	private String ceflogging;
	private String entitydecoding;
	private String useconfigurablesecretkey;

	/**
	* <pre>
	* Application Firewall global default profile.<br> Default value: APPFW_BYPASS<br> Minimum length =  1
	* </pre>
	*/
	public void set_defaultprofile(String defaultprofile) throws Exception{
		this.defaultprofile = defaultprofile;
	}

	/**
	* <pre>
	* Application Firewall global default profile.<br> Default value: APPFW_BYPASS<br> Minimum length =  1
	* </pre>
	*/
	public String get_defaultprofile() throws Exception {
		return this.defaultprofile;
	}

	/**
	* <pre>
	* Application Firewall global undefined profile.<br> Default value: APPFW_BLOCK<br> Minimum length =  1
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Application Firewall global undefined profile.<br> Default value: APPFW_BLOCK<br> Minimum length =  1
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* The user session timeout (in seconds).  After this many seconds of no user activity, the session is terminated and the user must establish a new session before continuing to use the protected web site.<br> Default value: 900<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_sessiontimeout(long sessiontimeout) throws Exception {
		this.sessiontimeout = new Long(sessiontimeout);
	}

	/**
	* <pre>
	* The user session timeout (in seconds).  After this many seconds of no user activity, the session is terminated and the user must establish a new session before continuing to use the protected web site.<br> Default value: 900<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_sessiontimeout(Long sessiontimeout) throws Exception{
		this.sessiontimeout = sessiontimeout;
	}

	/**
	* <pre>
	* The user session timeout (in seconds).  After this many seconds of no user activity, the session is terminated and the user must establish a new session before continuing to use the protected web site.<br> Default value: 900<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_sessiontimeout() throws Exception {
		return this.sessiontimeout;
	}

	/**
	* <pre>
	* The AppFw learn messages rate limit value (in messages per second). The extra learn messages are dropped when the rate goes above this value.<br> Default value: 400<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_learnratelimit(long learnratelimit) throws Exception {
		this.learnratelimit = new Long(learnratelimit);
	}

	/**
	* <pre>
	* The AppFw learn messages rate limit value (in messages per second). The extra learn messages are dropped when the rate goes above this value.<br> Default value: 400<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_learnratelimit(Long learnratelimit) throws Exception{
		this.learnratelimit = learnratelimit;
	}

	/**
	* <pre>
	* The AppFw learn messages rate limit value (in messages per second). The extra learn messages are dropped when the rate goes above this value.<br> Default value: 400<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_learnratelimit() throws Exception {
		return this.learnratelimit;
	}

	/**
	* <pre>
	* The user session lifetime (in seconds).  If a session has existed more than the specified number of seconds, the session can be terminated and the user must establish a new session before continuing to use the protected web site.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_sessionlifetime(long sessionlifetime) throws Exception {
		this.sessionlifetime = new Long(sessionlifetime);
	}

	/**
	* <pre>
	* The user session lifetime (in seconds).  If a session has existed more than the specified number of seconds, the session can be terminated and the user must establish a new session before continuing to use the protected web site.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_sessionlifetime(Long sessionlifetime) throws Exception{
		this.sessionlifetime = sessionlifetime;
	}

	/**
	* <pre>
	* The user session lifetime (in seconds).  If a session has existed more than the specified number of seconds, the session can be terminated and the user must establish a new session before continuing to use the protected web site.<br> Default value: 0<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_sessionlifetime() throws Exception {
		return this.sessionlifetime;
	}

	/**
	* <pre>
	* The name of the session cookie set by the Application Firewall to track the user session.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sessioncookiename(String sessioncookiename) throws Exception{
		this.sessioncookiename = sessioncookiename;
	}

	/**
	* <pre>
	* The name of the session cookie set by the Application Firewall to track the user session.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sessioncookiename() throws Exception {
		return this.sessioncookiename;
	}

	/**
	* <pre>
	* The name of the header that holds downstream IP address for logging purposes.
	* </pre>
	*/
	public void set_clientiploggingheader(String clientiploggingheader) throws Exception{
		this.clientiploggingheader = clientiploggingheader;
	}

	/**
	* <pre>
	* The name of the header that holds downstream IP address for logging purposes.
	* </pre>
	*/
	public String get_clientiploggingheader() throws Exception {
		return this.clientiploggingheader;
	}

	/**
	* <pre>
	* Total import size limit.<br> Default value: 134217728<br> Minimum value =  1<br> Maximum value =  134217728
	* </pre>
	*/
	public void set_importsizelimit(long importsizelimit) throws Exception {
		this.importsizelimit = new Long(importsizelimit);
	}

	/**
	* <pre>
	* Total import size limit.<br> Default value: 134217728<br> Minimum value =  1<br> Maximum value =  134217728
	* </pre>
	*/
	public void set_importsizelimit(Long importsizelimit) throws Exception{
		this.importsizelimit = importsizelimit;
	}

	/**
	* <pre>
	* Total import size limit.<br> Default value: 134217728<br> Minimum value =  1<br> Maximum value =  134217728
	* </pre>
	*/
	public Long get_importsizelimit() throws Exception {
		return this.importsizelimit;
	}

	/**
	* <pre>
	* String which is prepended to all encrypted cookie values.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookiepostencryptprefix(String cookiepostencryptprefix) throws Exception{
		this.cookiepostencryptprefix = cookiepostencryptprefix;
	}

	/**
	* <pre>
	* String which is prepended to all encrypted cookie values.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookiepostencryptprefix() throws Exception {
		return this.cookiepostencryptprefix;
	}

	/**
	* <pre>
	* Log requests that are so malformed that AppFw parsing doesn't happen.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_logmalformedreq(String logmalformedreq) throws Exception{
		this.logmalformedreq = logmalformedreq;
	}

	/**
	* <pre>
	* Log requests that are so malformed that AppFw parsing doesn't happen.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_logmalformedreq() throws Exception {
		return this.logmalformedreq;
	}

	/**
	* <pre>
	* Enable CEF formatted logging.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_ceflogging(String ceflogging) throws Exception{
		this.ceflogging = ceflogging;
	}

	/**
	* <pre>
	* Enable CEF formatted logging.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_ceflogging() throws Exception {
		return this.ceflogging;
	}

	/**
	* <pre>
	* Decode Entity-Encoded characters before doing AppFw checks.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_entitydecoding(String entitydecoding) throws Exception{
		this.entitydecoding = entitydecoding;
	}

	/**
	* <pre>
	* Decode Entity-Encoded characters before doing AppFw checks.<br> Default value: OFF<br> Possible values = ON, OFF
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
		unsetresource.defaultprofile = resource.defaultprofile;
		unsetresource.undefaction = resource.undefaction;
		unsetresource.sessiontimeout = resource.sessiontimeout;
		unsetresource.learnratelimit = resource.learnratelimit;
		unsetresource.sessionlifetime = resource.sessionlifetime;
		unsetresource.sessioncookiename = resource.sessioncookiename;
		unsetresource.clientiploggingheader = resource.clientiploggingheader;
		unsetresource.importsizelimit = resource.importsizelimit;
		unsetresource.cookiepostencryptprefix = resource.cookiepostencryptprefix;
		unsetresource.logmalformedreq = resource.logmalformedreq;
		unsetresource.ceflogging = resource.ceflogging;
		unsetresource.entitydecoding = resource.entitydecoding;
		unsetresource.useconfigurablesecretkey = resource.useconfigurablesecretkey;
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
	public static class useconfigurablesecretkeyEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class entitydecodingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
