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

class tmtrafficaction_response extends base_response
{
	public tmtrafficaction[] tmtrafficaction;
}
/**
* Configuration for TM traffic action resource.
*/

public class tmtrafficaction extends base_resource
{
	private String name;
	private Long apptimeout;
	private String sso;
	private String formssoaction;
	private String persistentcookie;
	private String initiatelogout;
	private String kcdaccount;
	private String samlssoprofile;
	private Long __count;

	/**
	* <pre>
	* Name for the traffic action. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after a traffic action is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the traffic action. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after a traffic action is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Time interval, in minutes, of user inactivity after which the connection is closed.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public void set_apptimeout(long apptimeout) throws Exception {
		this.apptimeout = new Long(apptimeout);
	}

	/**
	* <pre>
	* Time interval, in minutes, of user inactivity after which the connection is closed.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public void set_apptimeout(Long apptimeout) throws Exception{
		this.apptimeout = apptimeout;
	}

	/**
	* <pre>
	* Time interval, in minutes, of user inactivity after which the connection is closed.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public Long get_apptimeout() throws Exception {
		return this.apptimeout;
	}

	/**
	* <pre>
	* Use single sign-on for the resource that the user is accessing now.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sso(String sso) throws Exception{
		this.sso = sso;
	}

	/**
	* <pre>
	* Use single sign-on for the resource that the user is accessing now.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sso() throws Exception {
		return this.sso;
	}

	/**
	* <pre>
	* Name of the configured form-based single sign-on profile.
	* </pre>
	*/
	public void set_formssoaction(String formssoaction) throws Exception{
		this.formssoaction = formssoaction;
	}

	/**
	* <pre>
	* Name of the configured form-based single sign-on profile.
	* </pre>
	*/
	public String get_formssoaction() throws Exception {
		return this.formssoaction;
	}

	/**
	* <pre>
	* Use persistent cookies for the traffic session. A persistent cookie remains on the user device and is sent with each HTTP request. The cookie becomes stale if the session ends.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_persistentcookie(String persistentcookie) throws Exception{
		this.persistentcookie = persistentcookie;
	}

	/**
	* <pre>
	* Use persistent cookies for the traffic session. A persistent cookie remains on the user device and is sent with each HTTP request. The cookie becomes stale if the session ends.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_persistentcookie() throws Exception {
		return this.persistentcookie;
	}

	/**
	* <pre>
	* Initiate logout for the traffic management (TM) session if the policy evaluates to true. The session is then terminated after two minutes.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_initiatelogout(String initiatelogout) throws Exception{
		this.initiatelogout = initiatelogout;
	}

	/**
	* <pre>
	* Initiate logout for the traffic management (TM) session if the policy evaluates to true. The session is then terminated after two minutes.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_initiatelogout() throws Exception {
		return this.initiatelogout;
	}

	/**
	* <pre>
	* Kerberos constrained delegation account name.<br> Default value: "None"<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public void set_kcdaccount(String kcdaccount) throws Exception{
		this.kcdaccount = kcdaccount;
	}

	/**
	* <pre>
	* Kerberos constrained delegation account name.<br> Default value: "None"<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public String get_kcdaccount() throws Exception {
		return this.kcdaccount;
	}

	/**
	* <pre>
	* Profile to be used for doing SAML SSO to remote relying party.<br> Minimum length =  1
	* </pre>
	*/
	public void set_samlssoprofile(String samlssoprofile) throws Exception{
		this.samlssoprofile = samlssoprofile;
	}

	/**
	* <pre>
	* Profile to be used for doing SAML SSO to remote relying party.<br> Minimum length =  1
	* </pre>
	*/
	public String get_samlssoprofile() throws Exception {
		return this.samlssoprofile;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmtrafficaction_response result = (tmtrafficaction_response) service.get_payload_formatter().string_to_resource(tmtrafficaction_response.class, response);
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
		return result.tmtrafficaction;
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
	* Use this API to add tmtrafficaction.
	*/
	public static base_response add(nitro_service client, tmtrafficaction resource) throws Exception {
		tmtrafficaction addresource = new tmtrafficaction();
		addresource.name = resource.name;
		addresource.apptimeout = resource.apptimeout;
		addresource.sso = resource.sso;
		addresource.formssoaction = resource.formssoaction;
		addresource.persistentcookie = resource.persistentcookie;
		addresource.initiatelogout = resource.initiatelogout;
		addresource.kcdaccount = resource.kcdaccount;
		addresource.samlssoprofile = resource.samlssoprofile;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add tmtrafficaction resources.
	*/
	public static base_responses add(nitro_service client, tmtrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficaction addresources[] = new tmtrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new tmtrafficaction();
				addresources[i].name = resources[i].name;
				addresources[i].apptimeout = resources[i].apptimeout;
				addresources[i].sso = resources[i].sso;
				addresources[i].formssoaction = resources[i].formssoaction;
				addresources[i].persistentcookie = resources[i].persistentcookie;
				addresources[i].initiatelogout = resources[i].initiatelogout;
				addresources[i].kcdaccount = resources[i].kcdaccount;
				addresources[i].samlssoprofile = resources[i].samlssoprofile;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmtrafficaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		tmtrafficaction deleteresource = new tmtrafficaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmtrafficaction.
	*/
	public static base_response delete(nitro_service client, tmtrafficaction resource) throws Exception {
		tmtrafficaction deleteresource = new tmtrafficaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmtrafficaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmtrafficaction deleteresources[] = new tmtrafficaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new tmtrafficaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmtrafficaction resources.
	*/
	public static base_responses delete(nitro_service client, tmtrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficaction deleteresources[] = new tmtrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new tmtrafficaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update tmtrafficaction.
	*/
	public static base_response update(nitro_service client, tmtrafficaction resource) throws Exception {
		tmtrafficaction updateresource = new tmtrafficaction();
		updateresource.name = resource.name;
		updateresource.apptimeout = resource.apptimeout;
		updateresource.sso = resource.sso;
		updateresource.formssoaction = resource.formssoaction;
		updateresource.persistentcookie = resource.persistentcookie;
		updateresource.initiatelogout = resource.initiatelogout;
		updateresource.kcdaccount = resource.kcdaccount;
		updateresource.samlssoprofile = resource.samlssoprofile;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update tmtrafficaction resources.
	*/
	public static base_responses update(nitro_service client, tmtrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficaction updateresources[] = new tmtrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new tmtrafficaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].apptimeout = resources[i].apptimeout;
				updateresources[i].sso = resources[i].sso;
				updateresources[i].formssoaction = resources[i].formssoaction;
				updateresources[i].persistentcookie = resources[i].persistentcookie;
				updateresources[i].initiatelogout = resources[i].initiatelogout;
				updateresources[i].kcdaccount = resources[i].kcdaccount;
				updateresources[i].samlssoprofile = resources[i].samlssoprofile;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmtrafficaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tmtrafficaction resource, String[] args) throws Exception{
		tmtrafficaction unsetresource = new tmtrafficaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of tmtrafficaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmtrafficaction unsetresources[] = new tmtrafficaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new tmtrafficaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmtrafficaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, tmtrafficaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficaction unsetresources[] = new tmtrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new tmtrafficaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the tmtrafficaction resources that are configured on netscaler.
	*/
	public static tmtrafficaction[] get(nitro_service service) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		tmtrafficaction[] response = (tmtrafficaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the tmtrafficaction resources that are configured on netscaler.
	*/
	public static tmtrafficaction[] get(nitro_service service, options option) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		tmtrafficaction[] response = (tmtrafficaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch tmtrafficaction resource of given name .
	*/
	public static tmtrafficaction get(nitro_service service, String name) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		obj.set_name(name);
		tmtrafficaction response = (tmtrafficaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmtrafficaction resources of given names .
	*/
	public static tmtrafficaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmtrafficaction response[] = new tmtrafficaction[name.length];
			tmtrafficaction obj[] = new tmtrafficaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmtrafficaction();
				obj[i].set_name(name[i]);
				response[i] = (tmtrafficaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of tmtrafficaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static tmtrafficaction[] get_filtered(nitro_service service, String filter) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_filter(filter);
		tmtrafficaction[] response = (tmtrafficaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of tmtrafficaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static tmtrafficaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_filter(filter);
		tmtrafficaction[] response = (tmtrafficaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the tmtrafficaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_count(true);
		tmtrafficaction[] response = (tmtrafficaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of tmtrafficaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmtrafficaction[] response = (tmtrafficaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of tmtrafficaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmtrafficaction[] response = (tmtrafficaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class persistentcookieEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class initiatelogoutEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class ssoEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
