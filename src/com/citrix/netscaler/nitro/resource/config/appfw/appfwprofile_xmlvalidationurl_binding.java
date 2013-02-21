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

class appfwprofile_xmlvalidationurl_binding_response extends base_response
{
	public appfwprofile_xmlvalidationurl_binding[] appfwprofile_xmlvalidationurl_binding;
}
/**
	* Binding class showing the xmlvalidationurl that can be bound to appfwprofile.
	*/

public class appfwprofile_xmlvalidationurl_binding extends base_resource
{
	private String xmlvalidationurl;
	private String xmlvalidateresponse;
	private String xmlwsdl;
	private String xmladditionalsoapheaders;
	private String xmlendpointcheck;
	private String xmlrequestschema;
	private String xmlresponseschema;
	private String xmlvalidatesoapenvelope;
	private String state;
	private String comment;
	private String name;
	private Long __count;

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
	* WSDL object for soap request validation.
	* </pre>
	*/
	public void set_xmlwsdl(String xmlwsdl) throws Exception{
		this.xmlwsdl = xmlwsdl;
	}

	/**
	* <pre>
	* WSDL object for soap request validation.
	* </pre>
	*/
	public String get_xmlwsdl() throws Exception {
		return this.xmlwsdl;
	}

	/**
	* <pre>
	* Modifies the behaviour of the Request URL validation w.r.t. the Service URL.
	If set to ABSOLUTE, the entire request URL is validated with the entire URL mentioned in Service of the associated WSDL.
		eg: Service URL: http://example.org/ExampleService, Request URL: http//example.com/ExampleService would FAIL the validation.
	If set to RELAIVE, only the non-hostname part of the request URL is validated against the non-hostname part of the Service URL.
		eg: Service URL: http://example.org/ExampleService, Request URL: http//example.com/ExampleService would PASS the validation.<br> Possible values = ABSOLUTE, RELATIVE
	* </pre>
	*/
	public void set_xmlendpointcheck(String xmlendpointcheck) throws Exception{
		this.xmlendpointcheck = xmlendpointcheck;
	}

	/**
	* <pre>
	* Modifies the behaviour of the Request URL validation w.r.t. the Service URL.
	If set to ABSOLUTE, the entire request URL is validated with the entire URL mentioned in Service of the associated WSDL.
		eg: Service URL: http://example.org/ExampleService, Request URL: http//example.com/ExampleService would FAIL the validation.
	If set to RELAIVE, only the non-hostname part of the request URL is validated against the non-hostname part of the Service URL.
		eg: Service URL: http://example.org/ExampleService, Request URL: http//example.com/ExampleService would PASS the validation.<br> Possible values = ABSOLUTE, RELATIVE
	* </pre>
	*/
	public String get_xmlendpointcheck() throws Exception {
		return this.xmlendpointcheck;
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
	* Validate response message.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlvalidateresponse(String xmlvalidateresponse) throws Exception{
		this.xmlvalidateresponse = xmlvalidateresponse;
	}

	/**
	* <pre>
	* Validate response message.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlvalidateresponse() throws Exception {
		return this.xmlvalidateresponse;
	}

	/**
	* <pre>
	* XML Validation URL regular expression.
	* </pre>
	*/
	public void set_xmlvalidationurl(String xmlvalidationurl) throws Exception{
		this.xmlvalidationurl = xmlvalidationurl;
	}

	/**
	* <pre>
	* XML Validation URL regular expression.
	* </pre>
	*/
	public String get_xmlvalidationurl() throws Exception {
		return this.xmlvalidationurl;
	}

	/**
	* <pre>
	* XML Schema object for response validation.
	* </pre>
	*/
	public void set_xmlresponseschema(String xmlresponseschema) throws Exception{
		this.xmlresponseschema = xmlresponseschema;
	}

	/**
	* <pre>
	* XML Schema object for response validation.
	* </pre>
	*/
	public String get_xmlresponseschema() throws Exception {
		return this.xmlresponseschema;
	}

	/**
	* <pre>
	* Validate SOAP Evelope only.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmlvalidatesoapenvelope(String xmlvalidatesoapenvelope) throws Exception{
		this.xmlvalidatesoapenvelope = xmlvalidatesoapenvelope;
	}

	/**
	* <pre>
	* Validate SOAP Evelope only.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmlvalidatesoapenvelope() throws Exception {
		return this.xmlvalidatesoapenvelope;
	}

	/**
	* <pre>
	* XML Schema object for request validation .
	* </pre>
	*/
	public void set_xmlrequestschema(String xmlrequestschema) throws Exception{
		this.xmlrequestschema = xmlrequestschema;
	}

	/**
	* <pre>
	* XML Schema object for request validation .
	* </pre>
	*/
	public String get_xmlrequestschema() throws Exception {
		return this.xmlrequestschema;
	}

	/**
	* <pre>
	* Allow addtional soap headers.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_xmladditionalsoapheaders(String xmladditionalsoapheaders) throws Exception{
		this.xmladditionalsoapheaders = xmladditionalsoapheaders;
	}

	/**
	* <pre>
	* Allow addtional soap headers.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_xmladditionalsoapheaders() throws Exception {
		return this.xmladditionalsoapheaders;
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
		appfwprofile_xmlvalidationurl_binding_response result = (appfwprofile_xmlvalidationurl_binding_response) service.get_payload_formatter().string_to_resource(appfwprofile_xmlvalidationurl_binding_response.class, response);
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
		return result.appfwprofile_xmlvalidationurl_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, appfwprofile_xmlvalidationurl_binding resource) throws Exception {
		appfwprofile_xmlvalidationurl_binding updateresource = new appfwprofile_xmlvalidationurl_binding();
		updateresource.name = resource.name;
		updateresource.comment = resource.comment;
		updateresource.state = resource.state;
		updateresource.xmlvalidationurl = resource.xmlvalidationurl;
		updateresource.xmlrequestschema = resource.xmlrequestschema;
		updateresource.xmlresponseschema = resource.xmlresponseschema;
		updateresource.xmlwsdl = resource.xmlwsdl;
		updateresource.xmladditionalsoapheaders = resource.xmladditionalsoapheaders;
		updateresource.xmlendpointcheck = resource.xmlendpointcheck;
		updateresource.xmlvalidatesoapenvelope = resource.xmlvalidatesoapenvelope;
		updateresource.xmlvalidateresponse = resource.xmlvalidateresponse;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, appfwprofile_xmlvalidationurl_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_xmlvalidationurl_binding updateresources[] = new appfwprofile_xmlvalidationurl_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwprofile_xmlvalidationurl_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].state = resources[i].state;
				updateresources[i].xmlvalidationurl = resources[i].xmlvalidationurl;
				updateresources[i].xmlrequestschema = resources[i].xmlrequestschema;
				updateresources[i].xmlresponseschema = resources[i].xmlresponseschema;
				updateresources[i].xmlwsdl = resources[i].xmlwsdl;
				updateresources[i].xmladditionalsoapheaders = resources[i].xmladditionalsoapheaders;
				updateresources[i].xmlendpointcheck = resources[i].xmlendpointcheck;
				updateresources[i].xmlvalidatesoapenvelope = resources[i].xmlvalidatesoapenvelope;
				updateresources[i].xmlvalidateresponse = resources[i].xmlvalidateresponse;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, appfwprofile_xmlvalidationurl_binding resource) throws Exception {
		appfwprofile_xmlvalidationurl_binding deleteresource = new appfwprofile_xmlvalidationurl_binding();
		deleteresource.name = resource.name;
		deleteresource.xmlvalidationurl = resource.xmlvalidationurl;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, appfwprofile_xmlvalidationurl_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_xmlvalidationurl_binding deleteresources[] = new appfwprofile_xmlvalidationurl_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwprofile_xmlvalidationurl_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].xmlvalidationurl = resources[i].xmlvalidationurl;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch appfwprofile_xmlvalidationurl_binding resources of given name .
	*/
	public static appfwprofile_xmlvalidationurl_binding[] get(nitro_service service, String name) throws Exception{
		appfwprofile_xmlvalidationurl_binding obj = new appfwprofile_xmlvalidationurl_binding();
		obj.set_name(name);
		appfwprofile_xmlvalidationurl_binding response[] = (appfwprofile_xmlvalidationurl_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_xmlvalidationurl_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwprofile_xmlvalidationurl_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_xmlvalidationurl_binding obj = new appfwprofile_xmlvalidationurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_xmlvalidationurl_binding[] response = (appfwprofile_xmlvalidationurl_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_xmlvalidationurl_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwprofile_xmlvalidationurl_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_xmlvalidationurl_binding obj = new appfwprofile_xmlvalidationurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_xmlvalidationurl_binding[] response = (appfwprofile_xmlvalidationurl_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count appfwprofile_xmlvalidationurl_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		appfwprofile_xmlvalidationurl_binding obj = new appfwprofile_xmlvalidationurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		appfwprofile_xmlvalidationurl_binding response[] = (appfwprofile_xmlvalidationurl_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_xmlvalidationurl_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_xmlvalidationurl_binding obj = new appfwprofile_xmlvalidationurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_xmlvalidationurl_binding[] response = (appfwprofile_xmlvalidationurl_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_xmlvalidationurl_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_xmlvalidationurl_binding obj = new appfwprofile_xmlvalidationurl_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_xmlvalidationurl_binding[] response = (appfwprofile_xmlvalidationurl_binding[]) obj.getfiltered(service, option);
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
	public static class xmlmaxelementchildrencheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlvalidateresponseEnum {
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