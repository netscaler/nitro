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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsappflowparam_response extends base_response
{
	public nsappflowparam nsappflowparam;
}
/**
* Configuration for appflowParam resource.
*/

public class nsappflowparam extends base_resource
{
	private Long templaterefresh;
	private Long udppmtu;
	private String httpurl;
	private String httpcookie;
	private String httpreferer;
	private String httpmethod;
	private String httphost;
	private String httpuseragent;
	private String clienttrafficonly;

	/**
	* <pre>
	* IPFIX template refresh interval (in seconds).<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public void set_templaterefresh(long templaterefresh) throws Exception {
		this.templaterefresh = new Long(templaterefresh);
	}

	/**
	* <pre>
	* IPFIX template refresh interval (in seconds).<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public void set_templaterefresh(Long templaterefresh) throws Exception{
		this.templaterefresh = templaterefresh;
	}

	/**
	* <pre>
	* IPFIX template refresh interval (in seconds).<br> Default value: 600<br> Minimum value =  60<br> Maximum value =  3600
	* </pre>
	*/
	public Long get_templaterefresh() throws Exception {
		return this.templaterefresh;
	}

	/**
	* <pre>
	* MTU to be used for IPFIX UDP packets.<br> Default value: 1472<br> Minimum value =  128<br> Maximum value =  1472
	* </pre>
	*/
	public void set_udppmtu(long udppmtu) throws Exception {
		this.udppmtu = new Long(udppmtu);
	}

	/**
	* <pre>
	* MTU to be used for IPFIX UDP packets.<br> Default value: 1472<br> Minimum value =  128<br> Maximum value =  1472
	* </pre>
	*/
	public void set_udppmtu(Long udppmtu) throws Exception{
		this.udppmtu = udppmtu;
	}

	/**
	* <pre>
	* MTU to be used for IPFIX UDP packets.<br> Default value: 1472<br> Minimum value =  128<br> Maximum value =  1472
	* </pre>
	*/
	public Long get_udppmtu() throws Exception {
		return this.udppmtu;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP URL logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpurl(String httpurl) throws Exception{
		this.httpurl = httpurl;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP URL logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpurl() throws Exception {
		return this.httpurl;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP cookie logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpcookie(String httpcookie) throws Exception{
		this.httpcookie = httpcookie;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP cookie logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpcookie() throws Exception {
		return this.httpcookie;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP referer logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpreferer(String httpreferer) throws Exception{
		this.httpreferer = httpreferer;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP referer logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpreferer() throws Exception {
		return this.httpreferer;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP method logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpmethod(String httpmethod) throws Exception{
		this.httpmethod = httpmethod;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP method logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpmethod() throws Exception {
		return this.httpmethod;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP host logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httphost(String httphost) throws Exception{
		this.httphost = httphost;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP host logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httphost() throws Exception {
		return this.httphost;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP user-agent logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_httpuseragent(String httpuseragent) throws Exception{
		this.httpuseragent = httpuseragent;
	}

	/**
	* <pre>
	* Enable AppFlow HTTP user-agent logging.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_httpuseragent() throws Exception {
		return this.httpuseragent;
	}

	/**
	* <pre>
	* Control whether AppFlow records should be generated only for client-side traffic.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_clienttrafficonly(String clienttrafficonly) throws Exception{
		this.clienttrafficonly = clienttrafficonly;
	}

	/**
	* <pre>
	* Control whether AppFlow records should be generated only for client-side traffic.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_clienttrafficonly() throws Exception {
		return this.clienttrafficonly;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsappflowparam[] resources = new nsappflowparam[1];
		nsappflowparam_response result = (nsappflowparam_response) service.get_payload_formatter().string_to_resource(nsappflowparam_response.class, response);
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
		resources[0] = result.nsappflowparam;
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
	* Use this API to update nsappflowparam.
	*/
	public static base_response update(nitro_service client, nsappflowparam resource) throws Exception {
		nsappflowparam updateresource = new nsappflowparam();
		updateresource.templaterefresh = resource.templaterefresh;
		updateresource.udppmtu = resource.udppmtu;
		updateresource.httpurl = resource.httpurl;
		updateresource.httpcookie = resource.httpcookie;
		updateresource.httpreferer = resource.httpreferer;
		updateresource.httpmethod = resource.httpmethod;
		updateresource.httphost = resource.httphost;
		updateresource.httpuseragent = resource.httpuseragent;
		updateresource.clienttrafficonly = resource.clienttrafficonly;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nsappflowparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsappflowparam resource, String[] args) throws Exception{
		nsappflowparam unsetresource = new nsappflowparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nsappflowparam resources that are configured on netscaler.
	*/
	public static nsappflowparam get(nitro_service service) throws Exception{
		nsappflowparam obj = new nsappflowparam();
		nsappflowparam[] response = (nsappflowparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsappflowparam resources that are configured on netscaler.
	*/
	public static nsappflowparam get(nitro_service service,  options option) throws Exception{
		nsappflowparam obj = new nsappflowparam();
		nsappflowparam[] response = (nsappflowparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class httprefererEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clienttrafficonlyEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class httpmethodEnum {
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
