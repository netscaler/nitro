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

package com.citrix.netscaler.nitro.resource.config.tm;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tmsessionparameter_response extends base_response
{
	public tmsessionparameter tmsessionparameter;
}
/**
* Configuration for session parameter resource.
*/

public class tmsessionparameter extends base_resource
{
	private Long sesstimeout;
	private String defaultauthorizationaction;
	private String sso;
	private String ssocredential;
	private String ssodomain;
	private String kcdaccount;
	private String httponlycookie;
	private String persistentcookie;
	private Long persistentcookievalidity;
	private String homepage;

	//------- Read only Parameter ---------;

	private String name;

	/**
	* <pre>
	* Session timeout, in minutes. If there is no traffic during the timeout period, the user is disconnected and must reauthenticate to access the intranet resources.<br> Default value: 30<br> Minimum value =  1
	* </pre>
	*/
	public void set_sesstimeout(long sesstimeout) throws Exception {
		this.sesstimeout = new Long(sesstimeout);
	}

	/**
	* <pre>
	* Session timeout, in minutes. If there is no traffic during the timeout period, the user is disconnected and must reauthenticate to access the intranet resources.<br> Default value: 30<br> Minimum value =  1
	* </pre>
	*/
	public void set_sesstimeout(Long sesstimeout) throws Exception{
		this.sesstimeout = sesstimeout;
	}

	/**
	* <pre>
	* Session timeout, in minutes. If there is no traffic during the timeout period, the user is disconnected and must reauthenticate to access the intranet resources.<br> Default value: 30<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sesstimeout() throws Exception {
		return this.sesstimeout;
	}

	/**
	* <pre>
	* Allow or deny access to content for which there is no specific authorization policy.<br> Default value: ALLOW<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_defaultauthorizationaction(String defaultauthorizationaction) throws Exception{
		this.defaultauthorizationaction = defaultauthorizationaction;
	}

	/**
	* <pre>
	* Allow or deny access to content for which there is no specific authorization policy.<br> Default value: ALLOW<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_defaultauthorizationaction() throws Exception {
		return this.defaultauthorizationaction;
	}

	/**
	* <pre>
	* Log users on to all web applications automatically after they authenticate, or pass users to the web application logon page to authenticate for each application.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sso(String sso) throws Exception{
		this.sso = sso;
	}

	/**
	* <pre>
	* Log users on to all web applications automatically after they authenticate, or pass users to the web application logon page to authenticate for each application.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sso() throws Exception {
		return this.sso;
	}

	/**
	* <pre>
	* Use primary or secondary authentication credentials for single sign-on.<br> Default value: PRIMARY<br> Possible values = PRIMARY, SECONDARY
	* </pre>
	*/
	public void set_ssocredential(String ssocredential) throws Exception{
		this.ssocredential = ssocredential;
	}

	/**
	* <pre>
	* Use primary or secondary authentication credentials for single sign-on.<br> Default value: PRIMARY<br> Possible values = PRIMARY, SECONDARY
	* </pre>
	*/
	public String get_ssocredential() throws Exception {
		return this.ssocredential;
	}

	/**
	* <pre>
	* Domain to use for single sign-on.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public void set_ssodomain(String ssodomain) throws Exception{
		this.ssodomain = ssodomain;
	}

	/**
	* <pre>
	* Domain to use for single sign-on.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public String get_ssodomain() throws Exception {
		return this.ssodomain;
	}

	/**
	* <pre>
	* Kerberos constrained delegation account name.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public void set_kcdaccount(String kcdaccount) throws Exception{
		this.kcdaccount = kcdaccount;
	}

	/**
	* <pre>
	* Kerberos constrained delegation account name.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public String get_kcdaccount() throws Exception {
		return this.kcdaccount;
	}

	/**
	* <pre>
	* Allow only an HTTP session cookie, in which case the cookie cannot be accessed by scripts.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_httponlycookie(String httponlycookie) throws Exception{
		this.httponlycookie = httponlycookie;
	}

	/**
	* <pre>
	* Allow only an HTTP session cookie, in which case the cookie cannot be accessed by scripts.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_httponlycookie() throws Exception {
		return this.httponlycookie;
	}

	/**
	* <pre>
	* Use persistent SSO cookies for the traffic session. A persistent cookie remains on the user device and is sent with each HTTP request. The cookie becomes stale if the session ends.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_persistentcookie(String persistentcookie) throws Exception{
		this.persistentcookie = persistentcookie;
	}

	/**
	* <pre>
	* Use persistent SSO cookies for the traffic session. A persistent cookie remains on the user device and is sent with each HTTP request. The cookie becomes stale if the session ends.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_persistentcookie() throws Exception {
		return this.persistentcookie;
	}

	/**
	* <pre>
	* Integer specifying the number of minutes for which the persistent cookie remains valid. Can be set only if the persistence cookie setting is enabled.<br> Minimum value =  1
	* </pre>
	*/
	public void set_persistentcookievalidity(long persistentcookievalidity) throws Exception {
		this.persistentcookievalidity = new Long(persistentcookievalidity);
	}

	/**
	* <pre>
	* Integer specifying the number of minutes for which the persistent cookie remains valid. Can be set only if the persistence cookie setting is enabled.<br> Minimum value =  1
	* </pre>
	*/
	public void set_persistentcookievalidity(Long persistentcookievalidity) throws Exception{
		this.persistentcookievalidity = persistentcookievalidity;
	}

	/**
	* <pre>
	* Integer specifying the number of minutes for which the persistent cookie remains valid. Can be set only if the persistence cookie setting is enabled.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_persistentcookievalidity() throws Exception {
		return this.persistentcookievalidity;
	}

	/**
	* <pre>
	* Web address of the home page that a user is displayed when authentication vserver is bookmarked and used to login.<br> Default value: "None"
	* </pre>
	*/
	public void set_homepage(String homepage) throws Exception{
		this.homepage = homepage;
	}

	/**
	* <pre>
	* Web address of the home page that a user is displayed when authentication vserver is bookmarked and used to login.<br> Default value: "None"
	* </pre>
	*/
	public String get_homepage() throws Exception {
		return this.homepage;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		tmsessionparameter[] resources = new tmsessionparameter[1];
		tmsessionparameter_response result = (tmsessionparameter_response) service.get_payload_formatter().string_to_resource(tmsessionparameter_response.class, response);
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
		resources[0] = result.tmsessionparameter;
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
	* Use this API to update tmsessionparameter.
	*/
	public static base_response update(nitro_service client, tmsessionparameter resource) throws Exception {
		tmsessionparameter updateresource = new tmsessionparameter();
		updateresource.sesstimeout = resource.sesstimeout;
		updateresource.defaultauthorizationaction = resource.defaultauthorizationaction;
		updateresource.sso = resource.sso;
		updateresource.ssocredential = resource.ssocredential;
		updateresource.ssodomain = resource.ssodomain;
		updateresource.kcdaccount = resource.kcdaccount;
		updateresource.httponlycookie = resource.httponlycookie;
		updateresource.persistentcookie = resource.persistentcookie;
		updateresource.persistentcookievalidity = resource.persistentcookievalidity;
		updateresource.homepage = resource.homepage;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of tmsessionparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tmsessionparameter resource, String[] args) throws Exception{
		tmsessionparameter unsetresource = new tmsessionparameter();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the tmsessionparameter resources that are configured on netscaler.
	*/
	public static tmsessionparameter get(nitro_service service) throws Exception{
		tmsessionparameter obj = new tmsessionparameter();
		tmsessionparameter[] response = (tmsessionparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the tmsessionparameter resources that are configured on netscaler.
	*/
	public static tmsessionparameter get(nitro_service service,  options option) throws Exception{
		tmsessionparameter obj = new tmsessionparameter();
		tmsessionparameter[] response = (tmsessionparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class persistentcookieEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class defaultauthorizationactionEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
	}
	public static class ssocredentialEnum {
		public static final String PRIMARY = "PRIMARY";
		public static final String SECONDARY = "SECONDARY";
	}
	public static class httponlycookieEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class ssoEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
