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

package com.citrix.netscaler.nitro.resource.config.appflow;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appflowparam_response extends base_response
{
	public appflowparam appflowparam;
}
/**
* Configuration for AppFlow parameter resource.
*/

public class appflowparam extends base_resource
{
	private Long templaterefresh;
	private Long appnamerefresh;
	private Long flowrecordinterval;
	private Long udppmtu;
	private String httpurl;
	private String aaausername;
	private String httpcookie;
	private String httpreferer;
	private String httpmethod;
	private String httphost;
	private String httpuseragent;
	private String clienttrafficonly;
	private String httpcontenttype;
	private String httpauthorization;
	private String httpvia;
	private String httpxforwardedfor;
	private String httplocation;
	private String httpsetcookie;
	private String httpsetcookie2;
	private String connectionchaining;

	/**
	* <pre>
	* Refresh interval, in seconds, at which to export the template data. Because data transmission is in UDP, the templates must be resent at regular intervals.<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public void set_templaterefresh(long templaterefresh) throws Exception {
		this.templaterefresh = new Long(templaterefresh);
	}

	/**
	* <pre>
	* Refresh interval, in seconds, at which to export the template data. Because data transmission is in UDP, the templates must be resent at regular intervals.<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public void set_templaterefresh(Long templaterefresh) throws Exception{
		this.templaterefresh = templaterefresh;
	}

	/**
	* <pre>
	* Refresh interval, in seconds, at which to export the template data. Because data transmission is in UDP, the templates must be resent at regular intervals.<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public Long get_templaterefresh() throws Exception {
		return this.templaterefresh;
	}

	/**
	* <pre>
	* Interval, in seconds, at which to send Appnames to the configured collectors. Appname refers to the name of an entity (virtual server, service, or service group) in the NetScaler appliance.<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public void set_appnamerefresh(long appnamerefresh) throws Exception {
		this.appnamerefresh = new Long(appnamerefresh);
	}

	/**
	* <pre>
	* Interval, in seconds, at which to send Appnames to the configured collectors. Appname refers to the name of an entity (virtual server, service, or service group) in the NetScaler appliance.<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public void set_appnamerefresh(Long appnamerefresh) throws Exception{
		this.appnamerefresh = appnamerefresh;
	}

	/**
	* <pre>
	* Interval, in seconds, at which to send Appnames to the configured collectors. Appname refers to the name of an entity (virtual server, service, or service group) in the NetScaler appliance.<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public Long get_appnamerefresh() throws Exception {
		return this.appnamerefresh;
	}

	/**
	* <pre>
	* Interval, in seconds, at which to send flow records to the configured collectors.<br> Default value: 60<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public void set_flowrecordinterval(long flowrecordinterval) throws Exception {
		this.flowrecordinterval = new Long(flowrecordinterval);
	}

	/**
	* <pre>
	* Interval, in seconds, at which to send flow records to the configured collectors.<br> Default value: 60<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public void set_flowrecordinterval(Long flowrecordinterval) throws Exception{
		this.flowrecordinterval = flowrecordinterval;
	}

	/**
	* <pre>
	* Interval, in seconds, at which to send flow records to the configured collectors.<br> Default value: 60<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public Long get_flowrecordinterval() throws Exception {
		return this.flowrecordinterval;
	}

	/**
	* <pre>
	* MTU, in bytes, for IPFIX UDP packets.<br> Default value: 1472<br> Minimum value =  128<br> Maximum value =  1472
	* </pre>
	*/
	public void set_udppmtu(long udppmtu) throws Exception {
		this.udppmtu = new Long(udppmtu);
	}

	/**
	* <pre>
	* MTU, in bytes, for IPFIX UDP packets.<br> Default value: 1472<br> Minimum value =  128<br> Maximum value =  1472
	* </pre>
	*/
	public void set_udppmtu(Long udppmtu) throws Exception{
		this.udppmtu = udppmtu;
	}

	/**
	* <pre>
	* MTU, in bytes, for IPFIX UDP packets.<br> Default value: 1472<br> Minimum value =  128<br> Maximum value =  1472
	* </pre>
	*/
	public Long get_udppmtu() throws Exception {
		return this.udppmtu;
	}

	/**
	* <pre>
	* Include the http URL that the NetScaler appliance received from the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpurl(String httpurl) throws Exception{
		this.httpurl = httpurl;
	}

	/**
	* <pre>
	* Include the http URL that the NetScaler appliance received from the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpurl() throws Exception {
		return this.httpurl;
	}

	/**
	* <pre>
	* Enable AppFlow AAA Username logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_aaausername(String aaausername) throws Exception{
		this.aaausername = aaausername;
	}

	/**
	* <pre>
	* Enable AppFlow AAA Username logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_aaausername() throws Exception {
		return this.aaausername;
	}

	/**
	* <pre>
	* Include the cookie that was in the HTTP request the appliance received from the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpcookie(String httpcookie) throws Exception{
		this.httpcookie = httpcookie;
	}

	/**
	* <pre>
	* Include the cookie that was in the HTTP request the appliance received from the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpcookie() throws Exception {
		return this.httpcookie;
	}

	/**
	* <pre>
	* Include the web page that was last visited by the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpreferer(String httpreferer) throws Exception{
		this.httpreferer = httpreferer;
	}

	/**
	* <pre>
	* Include the web page that was last visited by the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpreferer() throws Exception {
		return this.httpreferer;
	}

	/**
	* <pre>
	* Include the method that was specified in the HTTP request that the appliance received from the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpmethod(String httpmethod) throws Exception{
		this.httpmethod = httpmethod;
	}

	/**
	* <pre>
	* Include the method that was specified in the HTTP request that the appliance received from the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpmethod() throws Exception {
		return this.httpmethod;
	}

	/**
	* <pre>
	* Include the host identified in the HTTP request that the appliance received from the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httphost(String httphost) throws Exception{
		this.httphost = httphost;
	}

	/**
	* <pre>
	* Include the host identified in the HTTP request that the appliance received from the client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httphost() throws Exception {
		return this.httphost;
	}

	/**
	* <pre>
	* Include the client application through which the HTTP request was received by the NetScaler appliance.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpuseragent(String httpuseragent) throws Exception{
		this.httpuseragent = httpuseragent;
	}

	/**
	* <pre>
	* Include the client application through which the HTTP request was received by the NetScaler appliance.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpuseragent() throws Exception {
		return this.httpuseragent;
	}

	/**
	* <pre>
	* Generate AppFlow records for only the traffic from the client.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_clienttrafficonly(String clienttrafficonly) throws Exception{
		this.clienttrafficonly = clienttrafficonly;
	}

	/**
	* <pre>
	* Generate AppFlow records for only the traffic from the client.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_clienttrafficonly() throws Exception {
		return this.clienttrafficonly;
	}

	/**
	* <pre>
	* Include the HTTP Content-Type header sent from the server to the client to determine the type of the content sent.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpcontenttype(String httpcontenttype) throws Exception{
		this.httpcontenttype = httpcontenttype;
	}

	/**
	* <pre>
	* Include the HTTP Content-Type header sent from the server to the client to determine the type of the content sent.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpcontenttype() throws Exception {
		return this.httpcontenttype;
	}

	/**
	* <pre>
	* Include the HTTP Authorization header information.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpauthorization(String httpauthorization) throws Exception{
		this.httpauthorization = httpauthorization;
	}

	/**
	* <pre>
	* Include the HTTP Authorization header information.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpauthorization() throws Exception {
		return this.httpauthorization;
	}

	/**
	* <pre>
	* Include the httpVia header which contains the IP address of proxy server through which the client accessed the server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpvia(String httpvia) throws Exception{
		this.httpvia = httpvia;
	}

	/**
	* <pre>
	* Include the httpVia header which contains the IP address of proxy server through which the client accessed the server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpvia() throws Exception {
		return this.httpvia;
	}

	/**
	* <pre>
	* Include the httpXForwardedFor header, which contains the original IP Address of the client using a proxy server to access the server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpxforwardedfor(String httpxforwardedfor) throws Exception{
		this.httpxforwardedfor = httpxforwardedfor;
	}

	/**
	* <pre>
	* Include the httpXForwardedFor header, which contains the original IP Address of the client using a proxy server to access the server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpxforwardedfor() throws Exception {
		return this.httpxforwardedfor;
	}

	/**
	* <pre>
	* Include the HTTP location headers returned from the HTTP responses.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httplocation(String httplocation) throws Exception{
		this.httplocation = httplocation;
	}

	/**
	* <pre>
	* Include the HTTP location headers returned from the HTTP responses.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httplocation() throws Exception {
		return this.httplocation;
	}

	/**
	* <pre>
	* Include the Set-cookie header sent from the server to the client in response to a HTTP request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpsetcookie(String httpsetcookie) throws Exception{
		this.httpsetcookie = httpsetcookie;
	}

	/**
	* <pre>
	* Include the Set-cookie header sent from the server to the client in response to a HTTP request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpsetcookie() throws Exception {
		return this.httpsetcookie;
	}

	/**
	* <pre>
	* Include the Set-cookie header sent from the server to the client in response to a HTTP request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpsetcookie2(String httpsetcookie2) throws Exception{
		this.httpsetcookie2 = httpsetcookie2;
	}

	/**
	* <pre>
	* Include the Set-cookie header sent from the server to the client in response to a HTTP request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpsetcookie2() throws Exception {
		return this.httpsetcookie2;
	}

	/**
	* <pre>
	* Enable connection chaining so that the client server flows of a connection are linked. Also the connection chain ID is propagated across NetScalers, so that in a multi-hop environment the flows belonging to the same logical connection are linked. This id is also logged as part of appflow record.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_connectionchaining(String connectionchaining) throws Exception{
		this.connectionchaining = connectionchaining;
	}

	/**
	* <pre>
	* Enable connection chaining so that the client server flows of a connection are linked. Also the connection chain ID is propagated across NetScalers, so that in a multi-hop environment the flows belonging to the same logical connection are linked. This id is also logged as part of appflow record.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_connectionchaining() throws Exception {
		return this.connectionchaining;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		appflowparam[] resources = new appflowparam[1];
		appflowparam_response result = (appflowparam_response) service.get_payload_formatter().string_to_resource(appflowparam_response.class, response);
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
		resources[0] = result.appflowparam;
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
	* Use this API to update appflowparam.
	*/
	public static base_response update(nitro_service client, appflowparam resource) throws Exception {
		appflowparam updateresource = new appflowparam();
		updateresource.templaterefresh = resource.templaterefresh;
		updateresource.appnamerefresh = resource.appnamerefresh;
		updateresource.flowrecordinterval = resource.flowrecordinterval;
		updateresource.udppmtu = resource.udppmtu;
		updateresource.httpurl = resource.httpurl;
		updateresource.aaausername = resource.aaausername;
		updateresource.httpcookie = resource.httpcookie;
		updateresource.httpreferer = resource.httpreferer;
		updateresource.httpmethod = resource.httpmethod;
		updateresource.httphost = resource.httphost;
		updateresource.httpuseragent = resource.httpuseragent;
		updateresource.clienttrafficonly = resource.clienttrafficonly;
		updateresource.httpcontenttype = resource.httpcontenttype;
		updateresource.httpauthorization = resource.httpauthorization;
		updateresource.httpvia = resource.httpvia;
		updateresource.httpxforwardedfor = resource.httpxforwardedfor;
		updateresource.httplocation = resource.httplocation;
		updateresource.httpsetcookie = resource.httpsetcookie;
		updateresource.httpsetcookie2 = resource.httpsetcookie2;
		updateresource.connectionchaining = resource.connectionchaining;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of appflowparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appflowparam resource, String[] args) throws Exception{
		appflowparam unsetresource = new appflowparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the appflowparam resources that are configured on netscaler.
	*/
	public static appflowparam get(nitro_service service) throws Exception{
		appflowparam obj = new appflowparam();
		appflowparam[] response = (appflowparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the appflowparam resources that are configured on netscaler.
	*/
	public static appflowparam get(nitro_service service,  options option) throws Exception{
		appflowparam obj = new appflowparam();
		appflowparam[] response = (appflowparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class httprefererEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpsetcookieEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpviaEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpsetcookie2Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpauthorizationEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class aaausernameEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clienttrafficonlyEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class httpcontenttypeEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpmethodEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httplocationEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class connectionchainingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpxforwardedforEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpcookieEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpurlEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httpuseragentEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class httphostEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
