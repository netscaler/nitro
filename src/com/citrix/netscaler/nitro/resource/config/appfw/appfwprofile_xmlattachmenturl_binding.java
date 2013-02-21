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

class appfwprofile_xmlattachmenturl_binding_response extends base_response
{
	public appfwprofile_xmlattachmenturl_binding[] appfwprofile_xmlattachmenturl_binding;
}
/**
	* Binding class showing the xmlattachmenturl that can be bound to appfwprofile.
	*/

public class appfwprofile_xmlattachmenturl_binding extends base_resource
{
	private String xmlattachmenturl;
	private String xmlmaxattachmentsizecheck;
	private Long xmlmaxattachmentsize;
	private String xmlattachmentcontenttypecheck;
	private String xmlattachmentcontenttype;
	private String state;
	private String comment;
	private String name;
	private Long __count;

	/**
	* <pre>
	* XML attachment URL regular expression length.
	* </pre>
	*/
	public void set_xmlattachmenturl(String xmlattachmenturl) throws Exception{
		this.xmlattachmenturl = xmlattachmenturl;
	}

	/**
	* <pre>
	* XML attachment URL regular expression length.
	* </pre>
	*/
	public String get_xmlattachmenturl() throws Exception {
		return this.xmlattachmenturl;
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
	* Specify maximum attachment size.
	* </pre>
	*/
	public void set_xmlmaxattachmentsize(long xmlmaxattachmentsize) throws Exception {
		this.xmlmaxattachmentsize = new Long(xmlmaxattachmentsize);
	}

	/**
	* <pre>
	* Specify maximum attachment size.
	* </pre>
	*/
	public void set_xmlmaxattachmentsize(Long xmlmaxattachmentsize) throws Exception{
		this.xmlmaxattachmentsize = xmlmaxattachmentsize;
	}

	/**
	* <pre>
	* Specify maximum attachment size.
	* </pre>
	*/
	public Long get_xmlmaxattachmentsize() throws Exception {
		return this.xmlmaxattachmentsize;
	}

	/**
	* <pre>
	* State if XML Max attachment size Check is ON or OFF. Protects against XML requests with large attachment data.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlmaxattachmentsizecheck(String xmlmaxattachmentsizecheck) throws Exception{
		this.xmlmaxattachmentsizecheck = xmlmaxattachmentsizecheck;
	}

	/**
	* <pre>
	* State if XML Max attachment size Check is ON or OFF. Protects against XML requests with large attachment data.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlmaxattachmentsizecheck() throws Exception {
		return this.xmlmaxattachmentsizecheck;
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
	* State if XML attachment content-type check is ON or OFF. Protects against XML requests with illegal attachments.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlattachmentcontenttypecheck(String xmlattachmentcontenttypecheck) throws Exception{
		this.xmlattachmentcontenttypecheck = xmlattachmentcontenttypecheck;
	}

	/**
	* <pre>
	* State if XML attachment content-type check is ON or OFF. Protects against XML requests with illegal attachments.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlattachmentcontenttypecheck() throws Exception {
		return this.xmlattachmentcontenttypecheck;
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
	* Specify content-type regular expression.
	* </pre>
	*/
	public void set_xmlattachmentcontenttype(String xmlattachmentcontenttype) throws Exception{
		this.xmlattachmentcontenttype = xmlattachmentcontenttype;
	}

	/**
	* <pre>
	* Specify content-type regular expression.
	* </pre>
	*/
	public String get_xmlattachmentcontenttype() throws Exception {
		return this.xmlattachmentcontenttype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwprofile_xmlattachmenturl_binding_response result = (appfwprofile_xmlattachmenturl_binding_response) service.get_payload_formatter().string_to_resource(appfwprofile_xmlattachmenturl_binding_response.class, response);
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
		return result.appfwprofile_xmlattachmenturl_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, appfwprofile_xmlattachmenturl_binding resource) throws Exception {
		appfwprofile_xmlattachmenturl_binding updateresource = new appfwprofile_xmlattachmenturl_binding();
		updateresource.name = resource.name;
		updateresource.comment = resource.comment;
		updateresource.state = resource.state;
		updateresource.xmlattachmenturl = resource.xmlattachmenturl;
		updateresource.xmlmaxattachmentsizecheck = resource.xmlmaxattachmentsizecheck;
		updateresource.xmlmaxattachmentsize = resource.xmlmaxattachmentsize;
		updateresource.xmlattachmentcontenttypecheck = resource.xmlattachmentcontenttypecheck;
		updateresource.xmlattachmentcontenttype = resource.xmlattachmentcontenttype;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, appfwprofile_xmlattachmenturl_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_xmlattachmenturl_binding updateresources[] = new appfwprofile_xmlattachmenturl_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwprofile_xmlattachmenturl_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].state = resources[i].state;
				updateresources[i].xmlattachmenturl = resources[i].xmlattachmenturl;
				updateresources[i].xmlmaxattachmentsizecheck = resources[i].xmlmaxattachmentsizecheck;
				updateresources[i].xmlmaxattachmentsize = resources[i].xmlmaxattachmentsize;
				updateresources[i].xmlattachmentcontenttypecheck = resources[i].xmlattachmentcontenttypecheck;
				updateresources[i].xmlattachmentcontenttype = resources[i].xmlattachmentcontenttype;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, appfwprofile_xmlattachmenturl_binding resource) throws Exception {
		appfwprofile_xmlattachmenturl_binding deleteresource = new appfwprofile_xmlattachmenturl_binding();
		deleteresource.name = resource.name;
		deleteresource.xmlattachmenturl = resource.xmlattachmenturl;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, appfwprofile_xmlattachmenturl_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_xmlattachmenturl_binding deleteresources[] = new appfwprofile_xmlattachmenturl_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwprofile_xmlattachmenturl_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].xmlattachmenturl = resources[i].xmlattachmenturl;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch appfwprofile_xmlattachmenturl_binding resources of given name .
	*/
	public static appfwprofile_xmlattachmenturl_binding[] get(nitro_service service, String name) throws Exception{
		appfwprofile_xmlattachmenturl_binding obj = new appfwprofile_xmlattachmenturl_binding();
		obj.set_name(name);
		appfwprofile_xmlattachmenturl_binding response[] = (appfwprofile_xmlattachmenturl_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_xmlattachmenturl_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwprofile_xmlattachmenturl_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_xmlattachmenturl_binding obj = new appfwprofile_xmlattachmenturl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_xmlattachmenturl_binding[] response = (appfwprofile_xmlattachmenturl_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_xmlattachmenturl_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwprofile_xmlattachmenturl_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_xmlattachmenturl_binding obj = new appfwprofile_xmlattachmenturl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_xmlattachmenturl_binding[] response = (appfwprofile_xmlattachmenturl_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count appfwprofile_xmlattachmenturl_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		appfwprofile_xmlattachmenturl_binding obj = new appfwprofile_xmlattachmenturl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		appfwprofile_xmlattachmenturl_binding response[] = (appfwprofile_xmlattachmenturl_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_xmlattachmenturl_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_xmlattachmenturl_binding obj = new appfwprofile_xmlattachmenturl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_xmlattachmenturl_binding[] response = (appfwprofile_xmlattachmenturl_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_xmlattachmenturl_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_xmlattachmenturl_binding obj = new appfwprofile_xmlattachmenturl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_xmlattachmenturl_binding[] response = (appfwprofile_xmlattachmenturl_binding[]) obj.getfiltered(service, option);
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
	public static class isregex_ffcEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class as_scan_location_sqlEnum {
		public static final String FORMFIELD = "FORMFIELD";
		public static final String HEADER = "HEADER";
		public static final String COOKIE = "COOKIE";
	}
	public static class xmlmaxattributevaluelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
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