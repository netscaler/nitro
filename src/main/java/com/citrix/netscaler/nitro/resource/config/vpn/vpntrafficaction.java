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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpntrafficaction_response extends base_response
{
	public vpntrafficaction[] vpntrafficaction;
}
/**
* Configuration for VPN traffic action resource.
*/

public class vpntrafficaction extends base_resource
{
	private String name;
	private String qual;
	private Long apptimeout;
	private String sso;
	private String formssoaction;
	private String fta;
	private String wanscaler;
	private String kcdaccount;
	private String samlssoprofile;
	private Long __count;

	/**
	* <pre>
	* Name for the traffic action. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after a traffic action is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the traffic action. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after a traffic action is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Protocol, either HTTP or TCP, to be used with the action. If you specify TCP, single sign-on cannot be configured.<br> Possible values = http, tcp
	* </pre>
	*/
	public void set_qual(String qual) throws Exception{
		this.qual = qual;
	}

	/**
	* <pre>
	* Protocol, either HTTP or TCP, to be used with the action. If you specify TCP, single sign-on cannot be configured.<br> Possible values = http, tcp
	* </pre>
	*/
	public String get_qual() throws Exception {
		return this.qual;
	}

	/**
	* <pre>
	* Maximum amount of time, in minutes, a user can stay logged on to the web application.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public void set_apptimeout(long apptimeout) throws Exception {
		this.apptimeout = new Long(apptimeout);
	}

	/**
	* <pre>
	* Maximum amount of time, in minutes, a user can stay logged on to the web application.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public void set_apptimeout(Long apptimeout) throws Exception{
		this.apptimeout = apptimeout;
	}

	/**
	* <pre>
	* Maximum amount of time, in minutes, a user can stay logged on to the web application.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public Long get_apptimeout() throws Exception {
		return this.apptimeout;
	}

	/**
	* <pre>
	* Provide single sign-on to the web application.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sso(String sso) throws Exception{
		this.sso = sso;
	}

	/**
	* <pre>
	* Provide single sign-on to the web application.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sso() throws Exception {
		return this.sso;
	}

	/**
	* <pre>
	* Name of the form-based single sign-on profile. Form-based single sign-on allows users to log on one time to all protected applications in your network, instead of requiring them to log on separately to access each one.
	* </pre>
	*/
	public void set_formssoaction(String formssoaction) throws Exception{
		this.formssoaction = formssoaction;
	}

	/**
	* <pre>
	* Name of the form-based single sign-on profile. Form-based single sign-on allows users to log on one time to all protected applications in your network, instead of requiring them to log on separately to access each one.
	* </pre>
	*/
	public String get_formssoaction() throws Exception {
		return this.formssoaction;
	}

	/**
	* <pre>
	* Specify file type association, which is a list of file extensions that users are allowed to open.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_fta(String fta) throws Exception{
		this.fta = fta;
	}

	/**
	* <pre>
	* Specify file type association, which is a list of file extensions that users are allowed to open.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_fta() throws Exception {
		return this.fta;
	}

	/**
	* <pre>
	* Use the Repeater Plug-in to optimize network traffic.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_wanscaler(String wanscaler) throws Exception{
		this.wanscaler = wanscaler;
	}

	/**
	* <pre>
	* Use the Repeater Plug-in to optimize network traffic.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_wanscaler() throws Exception {
		return this.wanscaler;
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
		vpntrafficaction_response result = (vpntrafficaction_response) service.get_payload_formatter().string_to_resource(vpntrafficaction_response.class, response);
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
		return result.vpntrafficaction;
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
	* Use this API to add vpntrafficaction.
	*/
	public static base_response add(nitro_service client, vpntrafficaction resource) throws Exception {
		vpntrafficaction addresource = new vpntrafficaction();
		addresource.name = resource.name;
		addresource.qual = resource.qual;
		addresource.apptimeout = resource.apptimeout;
		addresource.sso = resource.sso;
		addresource.formssoaction = resource.formssoaction;
		addresource.fta = resource.fta;
		addresource.wanscaler = resource.wanscaler;
		addresource.kcdaccount = resource.kcdaccount;
		addresource.samlssoprofile = resource.samlssoprofile;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpntrafficaction resources.
	*/
	public static base_responses add(nitro_service client, vpntrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficaction addresources[] = new vpntrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpntrafficaction();
				addresources[i].name = resources[i].name;
				addresources[i].qual = resources[i].qual;
				addresources[i].apptimeout = resources[i].apptimeout;
				addresources[i].sso = resources[i].sso;
				addresources[i].formssoaction = resources[i].formssoaction;
				addresources[i].fta = resources[i].fta;
				addresources[i].wanscaler = resources[i].wanscaler;
				addresources[i].kcdaccount = resources[i].kcdaccount;
				addresources[i].samlssoprofile = resources[i].samlssoprofile;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpntrafficaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpntrafficaction deleteresource = new vpntrafficaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpntrafficaction.
	*/
	public static base_response delete(nitro_service client, vpntrafficaction resource) throws Exception {
		vpntrafficaction deleteresource = new vpntrafficaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpntrafficaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpntrafficaction deleteresources[] = new vpntrafficaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpntrafficaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpntrafficaction resources.
	*/
	public static base_responses delete(nitro_service client, vpntrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficaction deleteresources[] = new vpntrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpntrafficaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpntrafficaction.
	*/
	public static base_response update(nitro_service client, vpntrafficaction resource) throws Exception {
		vpntrafficaction updateresource = new vpntrafficaction();
		updateresource.name = resource.name;
		updateresource.apptimeout = resource.apptimeout;
		updateresource.sso = resource.sso;
		updateresource.formssoaction = resource.formssoaction;
		updateresource.fta = resource.fta;
		updateresource.wanscaler = resource.wanscaler;
		updateresource.kcdaccount = resource.kcdaccount;
		updateresource.samlssoprofile = resource.samlssoprofile;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpntrafficaction resources.
	*/
	public static base_responses update(nitro_service client, vpntrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficaction updateresources[] = new vpntrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpntrafficaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].apptimeout = resources[i].apptimeout;
				updateresources[i].sso = resources[i].sso;
				updateresources[i].formssoaction = resources[i].formssoaction;
				updateresources[i].fta = resources[i].fta;
				updateresources[i].wanscaler = resources[i].wanscaler;
				updateresources[i].kcdaccount = resources[i].kcdaccount;
				updateresources[i].samlssoprofile = resources[i].samlssoprofile;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpntrafficaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpntrafficaction resource, String[] args) throws Exception{
		vpntrafficaction unsetresource = new vpntrafficaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpntrafficaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpntrafficaction unsetresources[] = new vpntrafficaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new vpntrafficaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpntrafficaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpntrafficaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficaction unsetresources[] = new vpntrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpntrafficaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpntrafficaction resources that are configured on netscaler.
	*/
	public static vpntrafficaction[] get(nitro_service service) throws Exception{
		vpntrafficaction obj = new vpntrafficaction();
		vpntrafficaction[] response = (vpntrafficaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpntrafficaction resources that are configured on netscaler.
	*/
	public static vpntrafficaction[] get(nitro_service service, options option) throws Exception{
		vpntrafficaction obj = new vpntrafficaction();
		vpntrafficaction[] response = (vpntrafficaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpntrafficaction resource of given name .
	*/
	public static vpntrafficaction get(nitro_service service, String name) throws Exception{
		vpntrafficaction obj = new vpntrafficaction();
		obj.set_name(name);
		vpntrafficaction response = (vpntrafficaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpntrafficaction resources of given names .
	*/
	public static vpntrafficaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpntrafficaction response[] = new vpntrafficaction[name.length];
			vpntrafficaction obj[] = new vpntrafficaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpntrafficaction();
				obj[i].set_name(name[i]);
				response[i] = (vpntrafficaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpntrafficaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpntrafficaction[] get_filtered(nitro_service service, String filter) throws Exception{
		vpntrafficaction obj = new vpntrafficaction();
		options option = new options();
		option.set_filter(filter);
		vpntrafficaction[] response = (vpntrafficaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpntrafficaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpntrafficaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpntrafficaction obj = new vpntrafficaction();
		options option = new options();
		option.set_filter(filter);
		vpntrafficaction[] response = (vpntrafficaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpntrafficaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpntrafficaction obj = new vpntrafficaction();
		options option = new options();
		option.set_count(true);
		vpntrafficaction[] response = (vpntrafficaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpntrafficaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpntrafficaction obj = new vpntrafficaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpntrafficaction[] response = (vpntrafficaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpntrafficaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpntrafficaction obj = new vpntrafficaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpntrafficaction[] response = (vpntrafficaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class qualEnum {
		public static final String http = "http";
		public static final String tcp = "tcp";
	}
	public static class wanscalerEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class ftaEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class ssoEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
