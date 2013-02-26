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

class appfwlearningdata_response extends base_response
{
	public appfwlearningdata[] appfwlearningdata;
}
/**
* Configuration for learning data resource.
*/

public class appfwlearningdata extends base_resource
{
	private String profilename;
	private String starturl;
	private String cookieconsistency;
	private String fieldconsistency;
	private String formactionurl_ffc;
	private String crosssitescripting;
	private String formactionurl_xss;
	private String sqlinjection;
	private String formactionurl_sql;
	private String fieldformat;
	private String formactionurl_ff;
	private String csrftag;
	private String csrfformoriginurl;
	private String xmldoscheck;
	private String xmlwsicheck;
	private String xmlattachmentcheck;
	private Boolean totalxmlrequests;
	private String securitycheck;
	private String target;

	//------- Read only Parameter ---------;

	private String data;
	private Long __count;

	/**
	* <pre>
	* Application Firewall profile name.
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* Application Firewall profile name.
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Start URL configuration.<br> Minimum length =  1
	* </pre>
	*/
	public void set_starturl(String starturl) throws Exception{
		this.starturl = starturl;
	}

	/**
	* <pre>
	* Start URL configuration.<br> Minimum length =  1
	* </pre>
	*/
	public String get_starturl() throws Exception {
		return this.starturl;
	}

	/**
	* <pre>
	* Cookie Name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookieconsistency(String cookieconsistency) throws Exception{
		this.cookieconsistency = cookieconsistency;
	}

	/**
	* <pre>
	* Cookie Name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookieconsistency() throws Exception {
		return this.cookieconsistency;
	}

	/**
	* <pre>
	* Form field name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_fieldconsistency(String fieldconsistency) throws Exception{
		this.fieldconsistency = fieldconsistency;
	}

	/**
	* <pre>
	* Form field name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_fieldconsistency() throws Exception {
		return this.fieldconsistency;
	}

	/**
	* <pre>
	* Form action URL.
	* </pre>
	*/
	public void set_formactionurl_ffc(String formactionurl_ffc) throws Exception{
		this.formactionurl_ffc = formactionurl_ffc;
	}

	/**
	* <pre>
	* Form action URL.
	* </pre>
	*/
	public String get_formactionurl_ffc() throws Exception {
		return this.formactionurl_ffc;
	}

	/**
	* <pre>
	* Cross-site scripting.<br> Minimum length =  1
	* </pre>
	*/
	public void set_crosssitescripting(String crosssitescripting) throws Exception{
		this.crosssitescripting = crosssitescripting;
	}

	/**
	* <pre>
	* Cross-site scripting.<br> Minimum length =  1
	* </pre>
	*/
	public String get_crosssitescripting() throws Exception {
		return this.crosssitescripting;
	}

	/**
	* <pre>
	* Form action URL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_formactionurl_xss(String formactionurl_xss) throws Exception{
		this.formactionurl_xss = formactionurl_xss;
	}

	/**
	* <pre>
	* Form action URL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_formactionurl_xss() throws Exception {
		return this.formactionurl_xss;
	}

	/**
	* <pre>
	* Form field name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sqlinjection(String sqlinjection) throws Exception{
		this.sqlinjection = sqlinjection;
	}

	/**
	* <pre>
	* Form field name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sqlinjection() throws Exception {
		return this.sqlinjection;
	}

	/**
	* <pre>
	* Form action URL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_formactionurl_sql(String formactionurl_sql) throws Exception{
		this.formactionurl_sql = formactionurl_sql;
	}

	/**
	* <pre>
	* Form action URL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_formactionurl_sql() throws Exception {
		return this.formactionurl_sql;
	}

	/**
	* <pre>
	* Field format name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_fieldformat(String fieldformat) throws Exception{
		this.fieldformat = fieldformat;
	}

	/**
	* <pre>
	* Field format name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_fieldformat() throws Exception {
		return this.fieldformat;
	}

	/**
	* <pre>
	* Form action URL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_formactionurl_ff(String formactionurl_ff) throws Exception{
		this.formactionurl_ff = formactionurl_ff;
	}

	/**
	* <pre>
	* Form action URL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_formactionurl_ff() throws Exception {
		return this.formactionurl_ff;
	}

	/**
	* <pre>
	* CSRF Form Action URL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_csrftag(String csrftag) throws Exception{
		this.csrftag = csrftag;
	}

	/**
	* <pre>
	* CSRF Form Action URL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_csrftag() throws Exception {
		return this.csrftag;
	}

	/**
	* <pre>
	* CSRF Form Origin URL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_csrfformoriginurl(String csrfformoriginurl) throws Exception{
		this.csrfformoriginurl = csrfformoriginurl;
	}

	/**
	* <pre>
	* CSRF Form Origin URL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_csrfformoriginurl() throws Exception {
		return this.csrfformoriginurl;
	}

	/**
	* <pre>
	* XML Denial of Service check, one of
	MaxAttributes
	MaxAttributeNameLength
	MaxAttributeValueLength
	MaxElementNameLength
	MaxFileSize
	MinFileSize
	MaxCDATALength
	MaxElements
	MaxElementDepth
	MaxElementChildren
	NumDTDs
	NumProcessingInstructions
	NumExternalEntities
	MaxEntityExpansions
	MaxEntityExpansionDepth
	MaxNamespaces
	MaxNamespaceUriLength
	MaxSOAPArraySize
	MaxSOAPArrayRank
.<br> Minimum length =  1
	* </pre>
	*/
	public void set_xmldoscheck(String xmldoscheck) throws Exception{
		this.xmldoscheck = xmldoscheck;
	}

	/**
	* <pre>
	* XML Denial of Service check, one of
	MaxAttributes
	MaxAttributeNameLength
	MaxAttributeValueLength
	MaxElementNameLength
	MaxFileSize
	MinFileSize
	MaxCDATALength
	MaxElements
	MaxElementDepth
	MaxElementChildren
	NumDTDs
	NumProcessingInstructions
	NumExternalEntities
	MaxEntityExpansions
	MaxEntityExpansionDepth
	MaxNamespaces
	MaxNamespaceUriLength
	MaxSOAPArraySize
	MaxSOAPArrayRank
.<br> Minimum length =  1
	* </pre>
	*/
	public String get_xmldoscheck() throws Exception {
		return this.xmldoscheck;
	}

	/**
	* <pre>
	* Web Services Interoperability Rule ID.<br> Minimum length =  1
	* </pre>
	*/
	public void set_xmlwsicheck(String xmlwsicheck) throws Exception{
		this.xmlwsicheck = xmlwsicheck;
	}

	/**
	* <pre>
	* Web Services Interoperability Rule ID.<br> Minimum length =  1
	* </pre>
	*/
	public String get_xmlwsicheck() throws Exception {
		return this.xmlwsicheck;
	}

	/**
	* <pre>
	* XML Attachment Content-Type.<br> Minimum length =  1
	* </pre>
	*/
	public void set_xmlattachmentcheck(String xmlattachmentcheck) throws Exception{
		this.xmlattachmentcheck = xmlattachmentcheck;
	}

	/**
	* <pre>
	* XML Attachment Content-Type.<br> Minimum length =  1
	* </pre>
	*/
	public String get_xmlattachmentcheck() throws Exception {
		return this.xmlattachmentcheck;
	}

	/**
	* <pre>
	* Total XML requests.
	* </pre>
	*/
	public void set_totalxmlrequests(boolean totalxmlrequests) throws Exception {
		this.totalxmlrequests = new Boolean(totalxmlrequests);
	}

	/**
	* <pre>
	* Total XML requests.
	* </pre>
	*/
	public void set_totalxmlrequests(Boolean totalxmlrequests) throws Exception{
		this.totalxmlrequests = totalxmlrequests;
	}

	/**
	* <pre>
	* Total XML requests.
	* </pre>
	*/
	public Boolean get_totalxmlrequests() throws Exception {
		return this.totalxmlrequests;
	}

	/**
	* <pre>
	* Security check.<br> Possible values = startURL, cookieConsistency, fieldConsistency, crossSiteScripting, SQLInjection, fieldFormat, CSRFtag, XMLDoSCheck, XMLWSICheck, XMLAttachmentCheck, TotalXMLRequests
	* </pre>
	*/
	public void set_securitycheck(String securitycheck) throws Exception{
		this.securitycheck = securitycheck;
	}

	/**
	* <pre>
	* Security check.<br> Possible values = startURL, cookieConsistency, fieldConsistency, crossSiteScripting, SQLInjection, fieldFormat, CSRFtag, XMLDoSCheck, XMLWSICheck, XMLAttachmentCheck, TotalXMLRequests
	* </pre>
	*/
	public String get_securitycheck() throws Exception {
		return this.securitycheck;
	}

	/**
	* <pre>
	* Target filename for data to be exported.<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public void set_target(String target) throws Exception{
		this.target = target;
	}

	/**
	* <pre>
	* Target filename for data to be exported.<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public String get_target() throws Exception {
		return this.target;
	}

	/**
	* <pre>
	* Learned data.
	* </pre>
	*/
	public String get_data() throws Exception {
		return this.data;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwlearningdata_response result = (appfwlearningdata_response) service.get_payload_formatter().string_to_resource(appfwlearningdata_response.class, response);
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
		return result.appfwlearningdata;
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
	* Use this API to delete appfwlearningdata.
	*/
	public static base_response delete(nitro_service client, appfwlearningdata resource) throws Exception {
		appfwlearningdata deleteresource = new appfwlearningdata();
		deleteresource.profilename = resource.profilename;
		deleteresource.starturl = resource.starturl;
		deleteresource.cookieconsistency = resource.cookieconsistency;
		deleteresource.fieldconsistency = resource.fieldconsistency;
		deleteresource.formactionurl_ffc = resource.formactionurl_ffc;
		deleteresource.crosssitescripting = resource.crosssitescripting;
		deleteresource.formactionurl_xss = resource.formactionurl_xss;
		deleteresource.sqlinjection = resource.sqlinjection;
		deleteresource.formactionurl_sql = resource.formactionurl_sql;
		deleteresource.fieldformat = resource.fieldformat;
		deleteresource.formactionurl_ff = resource.formactionurl_ff;
		deleteresource.csrftag = resource.csrftag;
		deleteresource.csrfformoriginurl = resource.csrfformoriginurl;
		deleteresource.xmldoscheck = resource.xmldoscheck;
		deleteresource.xmlwsicheck = resource.xmlwsicheck;
		deleteresource.xmlattachmentcheck = resource.xmlattachmentcheck;
		deleteresource.totalxmlrequests = resource.totalxmlrequests;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwlearningdata resources.
	*/
	public static base_responses delete(nitro_service client, appfwlearningdata resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwlearningdata deleteresources[] = new appfwlearningdata[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwlearningdata();
				deleteresources[i].profilename = resources[i].profilename;
				deleteresources[i].starturl = resources[i].starturl;
				deleteresources[i].cookieconsistency = resources[i].cookieconsistency;
				deleteresources[i].fieldconsistency = resources[i].fieldconsistency;
				deleteresources[i].formactionurl_ffc = resources[i].formactionurl_ffc;
				deleteresources[i].crosssitescripting = resources[i].crosssitescripting;
				deleteresources[i].formactionurl_xss = resources[i].formactionurl_xss;
				deleteresources[i].sqlinjection = resources[i].sqlinjection;
				deleteresources[i].formactionurl_sql = resources[i].formactionurl_sql;
				deleteresources[i].fieldformat = resources[i].fieldformat;
				deleteresources[i].formactionurl_ff = resources[i].formactionurl_ff;
				deleteresources[i].csrftag = resources[i].csrftag;
				deleteresources[i].csrfformoriginurl = resources[i].csrfformoriginurl;
				deleteresources[i].xmldoscheck = resources[i].xmldoscheck;
				deleteresources[i].xmlwsicheck = resources[i].xmlwsicheck;
				deleteresources[i].xmlattachmentcheck = resources[i].xmlattachmentcheck;
				deleteresources[i].totalxmlrequests = resources[i].totalxmlrequests;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to reset appfwlearningdata.
	*/
	public static base_response reset(nitro_service client) throws Exception {
		appfwlearningdata resetresource = new appfwlearningdata();
		return resetresource.perform_operation(client,"reset");
	}

	/**
	* Use this API to reset appfwlearningdata resources.
	*/
	public static base_responses reset(nitro_service client, appfwlearningdata resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwlearningdata resetresources[] = new appfwlearningdata[resources.length];
			for (int i=0;i<resources.length;i++){
				resetresources[i] = new appfwlearningdata();
			}
			result = perform_operation_bulk_request(client, resetresources,"reset");
		}
		return result;
	}

	/**
	* Use this API to export appfwlearningdata.
	*/
	public static base_response export(nitro_service client, appfwlearningdata resource) throws Exception {
		appfwlearningdata exportresource = new appfwlearningdata();
		exportresource.profilename = resource.profilename;
		exportresource.securitycheck = resource.securitycheck;
		exportresource.target = resource.target;
		return exportresource.perform_operation(client,"export");
	}

	/**
	* Use this API to export appfwlearningdata resources.
	*/
	public static base_responses export(nitro_service client, appfwlearningdata resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwlearningdata exportresources[] = new appfwlearningdata[resources.length];
			for (int i=0;i<resources.length;i++){
				exportresources[i] = new appfwlearningdata();
				exportresources[i].profilename = resources[i].profilename;
				exportresources[i].securitycheck = resources[i].securitycheck;
				exportresources[i].target = resources[i].target;
			}
			result = perform_operation_bulk_request(client, exportresources,"export");
		}
		return result;
	}

	/**
	* Use this API to fetch a appfwlearningdata resource.
	*/
	public static appfwlearningdata get(nitro_service service, appfwlearningdata obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		appfwlearningdata response = (appfwlearningdata) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a appfwlearningdata resources.
	*/
	public static appfwlearningdata[] get(nitro_service service, appfwlearningdata obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			appfwlearningdata response[] = new appfwlearningdata[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (appfwlearningdata) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the appfwlearningdata resources that are configured on netscaler.
	* This uses appfwlearningdata_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static appfwlearningdata[] get(nitro_service service, appfwlearningdata_args args) throws Exception{
		appfwlearningdata obj = new appfwlearningdata();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		appfwlearningdata[] response = (appfwlearningdata[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwlearningdata resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwlearningdata[] get_filtered(nitro_service service, appfwlearningdata obj, String filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		appfwlearningdata[] response = (appfwlearningdata[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwlearningdata resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwlearningdata[] get_filtered(nitro_service service, appfwlearningdata obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		appfwlearningdata[] response = (appfwlearningdata[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwlearningdata resources configured on NetScaler.
	*/
	public static long count(nitro_service service, appfwlearningdata obj) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		appfwlearningdata[] response = (appfwlearningdata[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwlearningdata resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, appfwlearningdata obj, String filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		appfwlearningdata[] response = (appfwlearningdata[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwlearningdata resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, appfwlearningdata obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		appfwlearningdata[] response = (appfwlearningdata[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class securitycheckEnum {
		public static final String startURL = "startURL";
		public static final String cookieConsistency = "cookieConsistency";
		public static final String fieldConsistency = "fieldConsistency";
		public static final String crossSiteScripting = "crossSiteScripting";
		public static final String SQLInjection = "SQLInjection";
		public static final String fieldFormat = "fieldFormat";
		public static final String CSRFtag = "CSRFtag";
		public static final String XMLDoSCheck = "XMLDoSCheck";
		public static final String XMLWSICheck = "XMLWSICheck";
		public static final String XMLAttachmentCheck = "XMLAttachmentCheck";
		public static final String TotalXMLRequests = "TotalXMLRequests";
	}
}
