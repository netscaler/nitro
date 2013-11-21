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

class tmsessionaction_response extends base_response
{
	public tmsessionaction[] tmsessionaction;
}
/**
* Configuration for TM session action resource.
*/

public class tmsessionaction extends base_resource
{
	private String name;
	private Long sesstimeout;
	private String defaultauthorizationaction;
	private String sso;
	private String ssocredential;
	private String ssodomain;
	private String httponlycookie;
	private String kcdaccount;
	private String persistentcookie;
	private Long persistentcookievalidity;
	private String homepage;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the session action. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after a session action is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the session action. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after a session action is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Session timeout, in minutes. If there is no traffic during the timeout period, the user is disconnected and must reauthenticate to access intranet resources.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sesstimeout(long sesstimeout) throws Exception {
		this.sesstimeout = new Long(sesstimeout);
	}

	/**
	* <pre>
	* Session timeout, in minutes. If there is no traffic during the timeout period, the user is disconnected and must reauthenticate to access intranet resources.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sesstimeout(Long sesstimeout) throws Exception{
		this.sesstimeout = sesstimeout;
	}

	/**
	* <pre>
	* Session timeout, in minutes. If there is no traffic during the timeout period, the user is disconnected and must reauthenticate to access intranet resources.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sesstimeout() throws Exception {
		return this.sesstimeout;
	}

	/**
	* <pre>
	* Allow or deny access to content for which there is no specific authorization policy.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_defaultauthorizationaction(String defaultauthorizationaction) throws Exception{
		this.defaultauthorizationaction = defaultauthorizationaction;
	}

	/**
	* <pre>
	* Allow or deny access to content for which there is no specific authorization policy.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_defaultauthorizationaction() throws Exception {
		return this.defaultauthorizationaction;
	}

	/**
	* <pre>
	* Use single sign-on (SSO) to log users on to all web applications automatically after they authenticate, or pass users to the web application logon page to authenticate to each application individually.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sso(String sso) throws Exception{
		this.sso = sso;
	}

	/**
	* <pre>
	* Use single sign-on (SSO) to log users on to all web applications automatically after they authenticate, or pass users to the web application logon page to authenticate to each application individually.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sso() throws Exception {
		return this.sso;
	}

	/**
	* <pre>
	* Use the primary or secondary authentication credentials for single sign-on (SSO).<br> Possible values = PRIMARY, SECONDARY
	* </pre>
	*/
	public void set_ssocredential(String ssocredential) throws Exception{
		this.ssocredential = ssocredential;
	}

	/**
	* <pre>
	* Use the primary or secondary authentication credentials for single sign-on (SSO).<br> Possible values = PRIMARY, SECONDARY
	* </pre>
	*/
	public String get_ssocredential() throws Exception {
		return this.ssocredential;
	}

	/**
	* <pre>
	* Domain to use for single sign-on (SSO).<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public void set_ssodomain(String ssodomain) throws Exception{
		this.ssodomain = ssodomain;
	}

	/**
	* <pre>
	* Domain to use for single sign-on (SSO).<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public String get_ssodomain() throws Exception {
		return this.ssodomain;
	}

	/**
	* <pre>
	* Allow only an HTTP session cookie, in which case the cookie cannot be accessed by scripts.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_httponlycookie(String httponlycookie) throws Exception{
		this.httponlycookie = httponlycookie;
	}

	/**
	* <pre>
	* Allow only an HTTP session cookie, in which case the cookie cannot be accessed by scripts.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_httponlycookie() throws Exception {
		return this.httponlycookie;
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
	* Enable or disable persistent SSO cookies for the traffic management (TM) session. A persistent cookie remains on the user device and is sent with each HTTP request. The cookie becomes stale if the session ends. This setting is overwritten if a traffic action sets persistent cookie to OFF. 
Note: If persistent cookie is enabled, make sure you set the persistent cookie validity.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_persistentcookie(String persistentcookie) throws Exception{
		this.persistentcookie = persistentcookie;
	}

	/**
	* <pre>
	* Enable or disable persistent SSO cookies for the traffic management (TM) session. A persistent cookie remains on the user device and is sent with each HTTP request. The cookie becomes stale if the session ends. This setting is overwritten if a traffic action sets persistent cookie to OFF. 
Note: If persistent cookie is enabled, make sure you set the persistent cookie validity.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_persistentcookie() throws Exception {
		return this.persistentcookie;
	}

	/**
	* <pre>
	* Integer specifying the number of minutes for which the persistent cookie remains valid. Can be set only if the persistent cookie setting is enabled.<br> Minimum value =  1
	* </pre>
	*/
	public void set_persistentcookievalidity(long persistentcookievalidity) throws Exception {
		this.persistentcookievalidity = new Long(persistentcookievalidity);
	}

	/**
	* <pre>
	* Integer specifying the number of minutes for which the persistent cookie remains valid. Can be set only if the persistent cookie setting is enabled.<br> Minimum value =  1
	* </pre>
	*/
	public void set_persistentcookievalidity(Long persistentcookievalidity) throws Exception{
		this.persistentcookievalidity = persistentcookievalidity;
	}

	/**
	* <pre>
	* Integer specifying the number of minutes for which the persistent cookie remains valid. Can be set only if the persistent cookie setting is enabled.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_persistentcookievalidity() throws Exception {
		return this.persistentcookievalidity;
	}

	/**
	* <pre>
	* Web address of the home page that a user is displayed when authentication vserver is bookmarked and used to login.
	* </pre>
	*/
	public void set_homepage(String homepage) throws Exception{
		this.homepage = homepage;
	}

	/**
	* <pre>
	* Web address of the home page that a user is displayed when authentication vserver is bookmarked and used to login.
	* </pre>
	*/
	public String get_homepage() throws Exception {
		return this.homepage;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmsessionaction_response result = (tmsessionaction_response) service.get_payload_formatter().string_to_resource(tmsessionaction_response.class, response);
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
		return result.tmsessionaction;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add tmsessionaction.
	*/
	public static base_response add(nitro_service client, tmsessionaction resource) throws Exception {
		tmsessionaction addresource = new tmsessionaction();
		addresource.name = resource.name;
		addresource.sesstimeout = resource.sesstimeout;
		addresource.defaultauthorizationaction = resource.defaultauthorizationaction;
		addresource.sso = resource.sso;
		addresource.ssocredential = resource.ssocredential;
		addresource.ssodomain = resource.ssodomain;
		addresource.httponlycookie = resource.httponlycookie;
		addresource.kcdaccount = resource.kcdaccount;
		addresource.persistentcookie = resource.persistentcookie;
		addresource.persistentcookievalidity = resource.persistentcookievalidity;
		addresource.homepage = resource.homepage;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add tmsessionaction resources.
	*/
	public static base_responses add(nitro_service client, tmsessionaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsessionaction addresources[] = new tmsessionaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new tmsessionaction();
				addresources[i].name = resources[i].name;
				addresources[i].sesstimeout = resources[i].sesstimeout;
				addresources[i].defaultauthorizationaction = resources[i].defaultauthorizationaction;
				addresources[i].sso = resources[i].sso;
				addresources[i].ssocredential = resources[i].ssocredential;
				addresources[i].ssodomain = resources[i].ssodomain;
				addresources[i].httponlycookie = resources[i].httponlycookie;
				addresources[i].kcdaccount = resources[i].kcdaccount;
				addresources[i].persistentcookie = resources[i].persistentcookie;
				addresources[i].persistentcookievalidity = resources[i].persistentcookievalidity;
				addresources[i].homepage = resources[i].homepage;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmsessionaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		tmsessionaction deleteresource = new tmsessionaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmsessionaction.
	*/
	public static base_response delete(nitro_service client, tmsessionaction resource) throws Exception {
		tmsessionaction deleteresource = new tmsessionaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmsessionaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmsessionaction deleteresources[] = new tmsessionaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new tmsessionaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmsessionaction resources.
	*/
	public static base_responses delete(nitro_service client, tmsessionaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsessionaction deleteresources[] = new tmsessionaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new tmsessionaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update tmsessionaction.
	*/
	public static base_response update(nitro_service client, tmsessionaction resource) throws Exception {
		tmsessionaction updateresource = new tmsessionaction();
		updateresource.name = resource.name;
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
	* Use this API to update tmsessionaction resources.
	*/
	public static base_responses update(nitro_service client, tmsessionaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsessionaction updateresources[] = new tmsessionaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new tmsessionaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].sesstimeout = resources[i].sesstimeout;
				updateresources[i].defaultauthorizationaction = resources[i].defaultauthorizationaction;
				updateresources[i].sso = resources[i].sso;
				updateresources[i].ssocredential = resources[i].ssocredential;
				updateresources[i].ssodomain = resources[i].ssodomain;
				updateresources[i].kcdaccount = resources[i].kcdaccount;
				updateresources[i].httponlycookie = resources[i].httponlycookie;
				updateresources[i].persistentcookie = resources[i].persistentcookie;
				updateresources[i].persistentcookievalidity = resources[i].persistentcookievalidity;
				updateresources[i].homepage = resources[i].homepage;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmsessionaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tmsessionaction resource, String[] args) throws Exception{
		tmsessionaction unsetresource = new tmsessionaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of tmsessionaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmsessionaction unsetresources[] = new tmsessionaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new tmsessionaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmsessionaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, tmsessionaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsessionaction unsetresources[] = new tmsessionaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new tmsessionaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the tmsessionaction resources that are configured on netscaler.
	*/
	public static tmsessionaction[] get(nitro_service service) throws Exception{
		tmsessionaction obj = new tmsessionaction();
		tmsessionaction[] response = (tmsessionaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the tmsessionaction resources that are configured on netscaler.
	*/
	public static tmsessionaction[] get(nitro_service service, options option) throws Exception{
		tmsessionaction obj = new tmsessionaction();
		tmsessionaction[] response = (tmsessionaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch tmsessionaction resource of given name .
	*/
	public static tmsessionaction get(nitro_service service, String name) throws Exception{
		tmsessionaction obj = new tmsessionaction();
		obj.set_name(name);
		tmsessionaction response = (tmsessionaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmsessionaction resources of given names .
	*/
	public static tmsessionaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmsessionaction response[] = new tmsessionaction[name.length];
			tmsessionaction obj[] = new tmsessionaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmsessionaction();
				obj[i].set_name(name[i]);
				response[i] = (tmsessionaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of tmsessionaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static tmsessionaction[] get_filtered(nitro_service service, String filter) throws Exception{
		tmsessionaction obj = new tmsessionaction();
		options option = new options();
		option.set_filter(filter);
		tmsessionaction[] response = (tmsessionaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of tmsessionaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static tmsessionaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmsessionaction obj = new tmsessionaction();
		options option = new options();
		option.set_filter(filter);
		tmsessionaction[] response = (tmsessionaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the tmsessionaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		tmsessionaction obj = new tmsessionaction();
		options option = new options();
		option.set_count(true);
		tmsessionaction[] response = (tmsessionaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of tmsessionaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		tmsessionaction obj = new tmsessionaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmsessionaction[] response = (tmsessionaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of tmsessionaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmsessionaction obj = new tmsessionaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmsessionaction[] response = (tmsessionaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class persistentcookieEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
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
