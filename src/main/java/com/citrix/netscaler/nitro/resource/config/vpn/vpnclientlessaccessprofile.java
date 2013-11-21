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

class vpnclientlessaccessprofile_response extends base_response
{
	public vpnclientlessaccessprofile[] vpnclientlessaccessprofile;
}
/**
* Configuration for Clientless VPN rewrite profile resource.
*/

public class vpnclientlessaccessprofile extends base_resource
{
	private String profilename;
	private String urlrewritepolicylabel;
	private String javascriptrewritepolicylabel;
	private String reqhdrrewritepolicylabel;
	private String reshdrrewritepolicylabel;
	private String regexforfindingurlinjavascript;
	private String regexforfindingurlincss;
	private String regexforfindingurlinxcomponent;
	private String regexforfindingurlinxml;
	private String regexforfindingcustomurls;
	private String clientconsumedcookies;
	private String requirepersistentcookie;

	//------- Read only Parameter ---------;

	private String cssrewritepolicylabel;
	private String xmlrewritepolicylabel;
	private String xcomponentrewritepolicylabel;
	private Boolean isdefault;
	private String description;
	private Long __count;

	/**
	* <pre>
	* Name for the Access Gateway clientless access profile. Must begin with an ASCII alphabetic or underscore (_) character, and must consist only of ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the profile is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my profile" or 'my profile').<br> Minimum length =  1
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* Name for the Access Gateway clientless access profile. Must begin with an ASCII alphabetic or underscore (_) character, and must consist only of ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the profile is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my profile" or 'my profile').<br> Minimum length =  1
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Name of the configured URL rewrite policy label. If you do not specify a policy label name, then URLs are not rewritten.<br> Minimum length =  1
	* </pre>
	*/
	public void set_urlrewritepolicylabel(String urlrewritepolicylabel) throws Exception{
		this.urlrewritepolicylabel = urlrewritepolicylabel;
	}

	/**
	* <pre>
	* Name of the configured URL rewrite policy label. If you do not specify a policy label name, then URLs are not rewritten.<br> Minimum length =  1
	* </pre>
	*/
	public String get_urlrewritepolicylabel() throws Exception {
		return this.urlrewritepolicylabel;
	}

	/**
	* <pre>
	* Name of the configured JavaScript rewrite policy label.  If you do not specify a policy label name, then JAVA scripts are not rewritten.<br> Minimum length =  1
	* </pre>
	*/
	public void set_javascriptrewritepolicylabel(String javascriptrewritepolicylabel) throws Exception{
		this.javascriptrewritepolicylabel = javascriptrewritepolicylabel;
	}

	/**
	* <pre>
	* Name of the configured JavaScript rewrite policy label.  If you do not specify a policy label name, then JAVA scripts are not rewritten.<br> Minimum length =  1
	* </pre>
	*/
	public String get_javascriptrewritepolicylabel() throws Exception {
		return this.javascriptrewritepolicylabel;
	}

	/**
	* <pre>
	* Name of the configured Request rewrite policy label.  If you do not specify a policy label name, then requests are not rewritten.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reqhdrrewritepolicylabel(String reqhdrrewritepolicylabel) throws Exception{
		this.reqhdrrewritepolicylabel = reqhdrrewritepolicylabel;
	}

	/**
	* <pre>
	* Name of the configured Request rewrite policy label.  If you do not specify a policy label name, then requests are not rewritten.<br> Minimum length =  1
	* </pre>
	*/
	public String get_reqhdrrewritepolicylabel() throws Exception {
		return this.reqhdrrewritepolicylabel;
	}

	/**
	* <pre>
	* Name of the configured Response rewrite policy label.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reshdrrewritepolicylabel(String reshdrrewritepolicylabel) throws Exception{
		this.reshdrrewritepolicylabel = reshdrrewritepolicylabel;
	}

	/**
	* <pre>
	* Name of the configured Response rewrite policy label.<br> Minimum length =  1
	* </pre>
	*/
	public String get_reshdrrewritepolicylabel() throws Exception {
		return this.reshdrrewritepolicylabel;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URL in Java script.<br> Minimum length =  1
	* </pre>
	*/
	public void set_regexforfindingurlinjavascript(String regexforfindingurlinjavascript) throws Exception{
		this.regexforfindingurlinjavascript = regexforfindingurlinjavascript;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URL in Java script.<br> Minimum length =  1
	* </pre>
	*/
	public String get_regexforfindingurlinjavascript() throws Exception {
		return this.regexforfindingurlinjavascript;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URL in the CSS.<br> Minimum length =  1
	* </pre>
	*/
	public void set_regexforfindingurlincss(String regexforfindingurlincss) throws Exception{
		this.regexforfindingurlincss = regexforfindingurlincss;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URL in the CSS.<br> Minimum length =  1
	* </pre>
	*/
	public String get_regexforfindingurlincss() throws Exception {
		return this.regexforfindingurlincss;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URL in X Component.<br> Minimum length =  1
	* </pre>
	*/
	public void set_regexforfindingurlinxcomponent(String regexforfindingurlinxcomponent) throws Exception{
		this.regexforfindingurlinxcomponent = regexforfindingurlinxcomponent;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URL in X Component.<br> Minimum length =  1
	* </pre>
	*/
	public String get_regexforfindingurlinxcomponent() throws Exception {
		return this.regexforfindingurlinxcomponent;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URL in XML.<br> Minimum length =  1
	* </pre>
	*/
	public void set_regexforfindingurlinxml(String regexforfindingurlinxml) throws Exception{
		this.regexforfindingurlinxml = regexforfindingurlinxml;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URL in XML.<br> Minimum length =  1
	* </pre>
	*/
	public String get_regexforfindingurlinxml() throws Exception {
		return this.regexforfindingurlinxml;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URLs in the custom content type other than HTML, CSS, XML, XCOMP, and JavaScript. The custom content type should be included in the patset ns_cvpn_custom_content_types.<br> Minimum length =  1
	* </pre>
	*/
	public void set_regexforfindingcustomurls(String regexforfindingcustomurls) throws Exception{
		this.regexforfindingcustomurls = regexforfindingcustomurls;
	}

	/**
	* <pre>
	* Name of the pattern set that contains the regular expressions, which match the URLs in the custom content type other than HTML, CSS, XML, XCOMP, and JavaScript. The custom content type should be included in the patset ns_cvpn_custom_content_types.<br> Minimum length =  1
	* </pre>
	*/
	public String get_regexforfindingcustomurls() throws Exception {
		return this.regexforfindingcustomurls;
	}

	/**
	* <pre>
	* Specify the name of the pattern set containing the names of the cookies, which are allowed between the client and the server. If a pattern set is not specified, Access Gateway does not allow any cookies between the client and the server. A cookie that is not specified in the pattern set is handled by Access Gateway on behalf of the client.<br> Minimum length =  1
	* </pre>
	*/
	public void set_clientconsumedcookies(String clientconsumedcookies) throws Exception{
		this.clientconsumedcookies = clientconsumedcookies;
	}

	/**
	* <pre>
	* Specify the name of the pattern set containing the names of the cookies, which are allowed between the client and the server. If a pattern set is not specified, Access Gateway does not allow any cookies between the client and the server. A cookie that is not specified in the pattern set is handled by Access Gateway on behalf of the client.<br> Minimum length =  1
	* </pre>
	*/
	public String get_clientconsumedcookies() throws Exception {
		return this.clientconsumedcookies;
	}

	/**
	* <pre>
	* Specify whether a persistent session cookie is set and accepted for clientless access. If this parameter is set to ON, COM objects, such as MSOffice, which are invoked by the browser can access the files using clientless access. Use caution because the persistent cookie is stored on the disk.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_requirepersistentcookie(String requirepersistentcookie) throws Exception{
		this.requirepersistentcookie = requirepersistentcookie;
	}

	/**
	* <pre>
	* Specify whether a persistent session cookie is set and accepted for clientless access. If this parameter is set to ON, COM objects, such as MSOffice, which are invoked by the browser can access the files using clientless access. Use caution because the persistent cookie is stored on the disk.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_requirepersistentcookie() throws Exception {
		return this.requirepersistentcookie;
	}

	/**
	* <pre>
	* The configured CSS rewrite policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cssrewritepolicylabel() throws Exception {
		return this.cssrewritepolicylabel;
	}

	/**
	* <pre>
	* The configured XML rewrite policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_xmlrewritepolicylabel() throws Exception {
		return this.xmlrewritepolicylabel;
	}

	/**
	* <pre>
	* The configured X-Component rewrite policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_xcomponentrewritepolicylabel() throws Exception {
		return this.xcomponentrewritepolicylabel;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default vpnclientlessrwprofile.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
	}

	/**
	* <pre>
	* Description of the clientless access profile.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnclientlessaccessprofile_response result = (vpnclientlessaccessprofile_response) service.get_payload_formatter().string_to_resource(vpnclientlessaccessprofile_response.class, response);
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
		return result.vpnclientlessaccessprofile;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.profilename;
	}

	/**
	* Use this API to add vpnclientlessaccessprofile.
	*/
	public static base_response add(nitro_service client, vpnclientlessaccessprofile resource) throws Exception {
		vpnclientlessaccessprofile addresource = new vpnclientlessaccessprofile();
		addresource.profilename = resource.profilename;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnclientlessaccessprofile resources.
	*/
	public static base_responses add(nitro_service client, vpnclientlessaccessprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnclientlessaccessprofile addresources[] = new vpnclientlessaccessprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnclientlessaccessprofile();
				addresources[i].profilename = resources[i].profilename;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnclientlessaccessprofile of given name.
	*/
	public static base_response delete(nitro_service client, String profilename) throws Exception {
		vpnclientlessaccessprofile deleteresource = new vpnclientlessaccessprofile();
		deleteresource.profilename = profilename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnclientlessaccessprofile.
	*/
	public static base_response delete(nitro_service client, vpnclientlessaccessprofile resource) throws Exception {
		vpnclientlessaccessprofile deleteresource = new vpnclientlessaccessprofile();
		deleteresource.profilename = resource.profilename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnclientlessaccessprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String profilename[]) throws Exception {
		base_responses result = null;
		if (profilename != null && profilename.length > 0) {
			vpnclientlessaccessprofile deleteresources[] = new vpnclientlessaccessprofile[profilename.length];
			for (int i=0;i<profilename.length;i++){
				deleteresources[i] = new vpnclientlessaccessprofile();
				deleteresources[i].profilename = profilename[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnclientlessaccessprofile resources.
	*/
	public static base_responses delete(nitro_service client, vpnclientlessaccessprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnclientlessaccessprofile deleteresources[] = new vpnclientlessaccessprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnclientlessaccessprofile();
				deleteresources[i].profilename = resources[i].profilename;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpnclientlessaccessprofile.
	*/
	public static base_response update(nitro_service client, vpnclientlessaccessprofile resource) throws Exception {
		vpnclientlessaccessprofile updateresource = new vpnclientlessaccessprofile();
		updateresource.profilename = resource.profilename;
		updateresource.urlrewritepolicylabel = resource.urlrewritepolicylabel;
		updateresource.javascriptrewritepolicylabel = resource.javascriptrewritepolicylabel;
		updateresource.reqhdrrewritepolicylabel = resource.reqhdrrewritepolicylabel;
		updateresource.reshdrrewritepolicylabel = resource.reshdrrewritepolicylabel;
		updateresource.regexforfindingurlinjavascript = resource.regexforfindingurlinjavascript;
		updateresource.regexforfindingurlincss = resource.regexforfindingurlincss;
		updateresource.regexforfindingurlinxcomponent = resource.regexforfindingurlinxcomponent;
		updateresource.regexforfindingurlinxml = resource.regexforfindingurlinxml;
		updateresource.regexforfindingcustomurls = resource.regexforfindingcustomurls;
		updateresource.clientconsumedcookies = resource.clientconsumedcookies;
		updateresource.requirepersistentcookie = resource.requirepersistentcookie;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpnclientlessaccessprofile resources.
	*/
	public static base_responses update(nitro_service client, vpnclientlessaccessprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnclientlessaccessprofile updateresources[] = new vpnclientlessaccessprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnclientlessaccessprofile();
				updateresources[i].profilename = resources[i].profilename;
				updateresources[i].urlrewritepolicylabel = resources[i].urlrewritepolicylabel;
				updateresources[i].javascriptrewritepolicylabel = resources[i].javascriptrewritepolicylabel;
				updateresources[i].reqhdrrewritepolicylabel = resources[i].reqhdrrewritepolicylabel;
				updateresources[i].reshdrrewritepolicylabel = resources[i].reshdrrewritepolicylabel;
				updateresources[i].regexforfindingurlinjavascript = resources[i].regexforfindingurlinjavascript;
				updateresources[i].regexforfindingurlincss = resources[i].regexforfindingurlincss;
				updateresources[i].regexforfindingurlinxcomponent = resources[i].regexforfindingurlinxcomponent;
				updateresources[i].regexforfindingurlinxml = resources[i].regexforfindingurlinxml;
				updateresources[i].regexforfindingcustomurls = resources[i].regexforfindingcustomurls;
				updateresources[i].clientconsumedcookies = resources[i].clientconsumedcookies;
				updateresources[i].requirepersistentcookie = resources[i].requirepersistentcookie;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnclientlessaccessprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String profilename, String args[]) throws Exception {
		vpnclientlessaccessprofile unsetresource = new vpnclientlessaccessprofile();
		unsetresource.profilename = profilename;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of vpnclientlessaccessprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpnclientlessaccessprofile resource, String[] args) throws Exception{
		vpnclientlessaccessprofile unsetresource = new vpnclientlessaccessprofile();
		unsetresource.profilename = resource.profilename;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpnclientlessaccessprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String profilename[], String args[]) throws Exception {
		base_responses result = null;
		if (profilename != null && profilename.length > 0) {
			vpnclientlessaccessprofile unsetresources[] = new vpnclientlessaccessprofile[profilename.length];
			for (int i=0;i<profilename.length;i++){
				unsetresources[i] = new vpnclientlessaccessprofile();
				unsetresources[i].profilename = profilename[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnclientlessaccessprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpnclientlessaccessprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnclientlessaccessprofile unsetresources[] = new vpnclientlessaccessprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpnclientlessaccessprofile();
				unsetresources[i].profilename = resources[i].profilename;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpnclientlessaccessprofile resources that are configured on netscaler.
	*/
	public static vpnclientlessaccessprofile[] get(nitro_service service) throws Exception{
		vpnclientlessaccessprofile obj = new vpnclientlessaccessprofile();
		vpnclientlessaccessprofile[] response = (vpnclientlessaccessprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnclientlessaccessprofile resources that are configured on netscaler.
	*/
	public static vpnclientlessaccessprofile[] get(nitro_service service, options option) throws Exception{
		vpnclientlessaccessprofile obj = new vpnclientlessaccessprofile();
		vpnclientlessaccessprofile[] response = (vpnclientlessaccessprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnclientlessaccessprofile resource of given name .
	*/
	public static vpnclientlessaccessprofile get(nitro_service service, String profilename) throws Exception{
		vpnclientlessaccessprofile obj = new vpnclientlessaccessprofile();
		obj.set_profilename(profilename);
		vpnclientlessaccessprofile response = (vpnclientlessaccessprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnclientlessaccessprofile resources of given names .
	*/
	public static vpnclientlessaccessprofile[] get(nitro_service service, String profilename[]) throws Exception{
		if (profilename !=null && profilename.length>0) {
			vpnclientlessaccessprofile response[] = new vpnclientlessaccessprofile[profilename.length];
			vpnclientlessaccessprofile obj[] = new vpnclientlessaccessprofile[profilename.length];
			for (int i=0;i<profilename.length;i++) {
				obj[i] = new vpnclientlessaccessprofile();
				obj[i].set_profilename(profilename[i]);
				response[i] = (vpnclientlessaccessprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnclientlessaccessprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnclientlessaccessprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnclientlessaccessprofile obj = new vpnclientlessaccessprofile();
		options option = new options();
		option.set_filter(filter);
		vpnclientlessaccessprofile[] response = (vpnclientlessaccessprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnclientlessaccessprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnclientlessaccessprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnclientlessaccessprofile obj = new vpnclientlessaccessprofile();
		options option = new options();
		option.set_filter(filter);
		vpnclientlessaccessprofile[] response = (vpnclientlessaccessprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnclientlessaccessprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnclientlessaccessprofile obj = new vpnclientlessaccessprofile();
		options option = new options();
		option.set_count(true);
		vpnclientlessaccessprofile[] response = (vpnclientlessaccessprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnclientlessaccessprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnclientlessaccessprofile obj = new vpnclientlessaccessprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnclientlessaccessprofile[] response = (vpnclientlessaccessprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnclientlessaccessprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnclientlessaccessprofile obj = new vpnclientlessaccessprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnclientlessaccessprofile[] response = (vpnclientlessaccessprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class requirepersistentcookieEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
