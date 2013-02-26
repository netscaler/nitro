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

class appfwprofile_fieldconsistency_binding_response extends base_response
{
	public appfwprofile_fieldconsistency_binding[] appfwprofile_fieldconsistency_binding;
}
/**
	* Binding class showing the fieldconsistency that can be bound to appfwprofile.
	*/

public class appfwprofile_fieldconsistency_binding extends base_resource
{
	private String fieldconsistency;
	private String isregex_ffc;
	private String formactionurl_ffc;
	private String state;
	private String comment;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The web form field name.
	* </pre>
	*/
	public void set_fieldconsistency(String fieldconsistency) throws Exception{
		this.fieldconsistency = fieldconsistency;
	}

	/**
	* <pre>
	* The web form field name.
	* </pre>
	*/
	public String get_fieldconsistency() throws Exception {
		return this.fieldconsistency;
	}

	/**
	* <pre>
	* Enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Application Firewall profile name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Application Firewall profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Is the web form field name a regular expression?.<br> Possible values = REGEX, NOTREGEX
	* </pre>
	*/
	public void set_isregex_ffc(String isregex_ffc) throws Exception{
		this.isregex_ffc = isregex_ffc;
	}

	/**
	* <pre>
	* Is the web form field name a regular expression?.<br> Possible values = REGEX, NOTREGEX
	* </pre>
	*/
	public String get_isregex_ffc() throws Exception {
		return this.isregex_ffc;
	}

	/**
	* <pre>
	* The web form action URL.
	* </pre>
	*/
	public void set_formactionurl_ffc(String formactionurl_ffc) throws Exception{
		this.formactionurl_ffc = formactionurl_ffc;
	}

	/**
	* <pre>
	* The web form action URL.
	* </pre>
	*/
	public String get_formactionurl_ffc() throws Exception {
		return this.formactionurl_ffc;
	}

	/**
	* <pre>
	* Comments associated with this profile.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this profile.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwprofile_fieldconsistency_binding_response result = (appfwprofile_fieldconsistency_binding_response) service.get_payload_formatter().string_to_resource(appfwprofile_fieldconsistency_binding_response.class, response);
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
		return result.appfwprofile_fieldconsistency_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, appfwprofile_fieldconsistency_binding resource) throws Exception {
		appfwprofile_fieldconsistency_binding updateresource = new appfwprofile_fieldconsistency_binding();
		updateresource.name = resource.name;
		updateresource.fieldconsistency = resource.fieldconsistency;
		updateresource.formactionurl_ffc = resource.formactionurl_ffc;
		updateresource.isregex_ffc = resource.isregex_ffc;
		updateresource.comment = resource.comment;
		updateresource.state = resource.state;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, appfwprofile_fieldconsistency_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_fieldconsistency_binding updateresources[] = new appfwprofile_fieldconsistency_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwprofile_fieldconsistency_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].fieldconsistency = resources[i].fieldconsistency;
				updateresources[i].formactionurl_ffc = resources[i].formactionurl_ffc;
				updateresources[i].isregex_ffc = resources[i].isregex_ffc;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].state = resources[i].state;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, appfwprofile_fieldconsistency_binding resource) throws Exception {
		appfwprofile_fieldconsistency_binding deleteresource = new appfwprofile_fieldconsistency_binding();
		deleteresource.name = resource.name;
		deleteresource.fieldconsistency = resource.fieldconsistency;
		deleteresource.formactionurl_ffc = resource.formactionurl_ffc;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, appfwprofile_fieldconsistency_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_fieldconsistency_binding deleteresources[] = new appfwprofile_fieldconsistency_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwprofile_fieldconsistency_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].fieldconsistency = resources[i].fieldconsistency;
				deleteresources[i].formactionurl_ffc = resources[i].formactionurl_ffc;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch appfwprofile_fieldconsistency_binding resources of given name .
	*/
	public static appfwprofile_fieldconsistency_binding[] get(nitro_service service, String name) throws Exception{
		appfwprofile_fieldconsistency_binding obj = new appfwprofile_fieldconsistency_binding();
		obj.set_name(name);
		appfwprofile_fieldconsistency_binding response[] = (appfwprofile_fieldconsistency_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_fieldconsistency_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwprofile_fieldconsistency_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_fieldconsistency_binding obj = new appfwprofile_fieldconsistency_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_fieldconsistency_binding[] response = (appfwprofile_fieldconsistency_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_fieldconsistency_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwprofile_fieldconsistency_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_fieldconsistency_binding obj = new appfwprofile_fieldconsistency_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_fieldconsistency_binding[] response = (appfwprofile_fieldconsistency_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count appfwprofile_fieldconsistency_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		appfwprofile_fieldconsistency_binding obj = new appfwprofile_fieldconsistency_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		appfwprofile_fieldconsistency_binding response[] = (appfwprofile_fieldconsistency_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_fieldconsistency_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_fieldconsistency_binding obj = new appfwprofile_fieldconsistency_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_fieldconsistency_binding[] response = (appfwprofile_fieldconsistency_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_fieldconsistency_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_fieldconsistency_binding obj = new appfwprofile_fieldconsistency_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_fieldconsistency_binding[] response = (appfwprofile_fieldconsistency_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class as_scan_location_xmlsqlEnum {
		public static final String ELEMENT = "ELEMENT";
		public static final String ATTRIBUTE = "ATTRIBUTE";
	}
	public static class xmlmaxelementdepthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattachmentsizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlsoaparraycheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class xmlmaxelementnamelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_ffEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlmaxelementscheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlendpointcheckEnum {
		public static final String ABSOLUTE = "ABSOLUTE";
		public static final String RELATIVE = "RELATIVE";
	}
	public static class xmlmaxnamespacescheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxfilesizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattributenamelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlblockdtdEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlblockpiEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_sqlEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlvalidateresponseEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxelementchildrencheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregexEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlmaxentityexpansionscheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxnamespaceurilengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class as_scan_location_xssEnum {
		public static final String FORMFIELD = "FORMFIELD";
		public static final String HEADER = "HEADER";
		public static final String COOKIE = "COOKIE";
	}
	public static class xmlmaxentityexpansiondepthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class as_scan_location_xmlxssEnum {
		public static final String ELEMENT = "ELEMENT";
		public static final String ATTRIBUTE = "ATTRIBUTE";
	}
	public static class xmlmaxattributevaluelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class as_scan_location_sqlEnum {
		public static final String FORMFIELD = "FORMFIELD";
		public static final String HEADER = "HEADER";
		public static final String COOKIE = "COOKIE";
	}
	public static class isregex_ffcEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlattachmentcontenttypecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_xmlsqlEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlvalidatesoapenvelopeEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxchardatalengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlminfilesizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_xssEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class isregex_xmlxssEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmladditionalsoapheadersEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattributescheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class actionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String log = "log";
		public static final String remove = "remove";
		public static final String stats = "stats";
		public static final String xout = "xout";
	}
	public static class xmlblockexternalentitiesEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}

}