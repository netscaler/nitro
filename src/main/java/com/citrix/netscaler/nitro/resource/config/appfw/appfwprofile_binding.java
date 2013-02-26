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

import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_xmlattachmenturl_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_crosssitescripting_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_xmlwsiurl_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_xmldosurl_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_fieldconsistency_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_safeobject_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_sqlinjection_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_denyurl_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_trustedlearningclients_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_csrftag_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_cookieconsistency_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_starturl_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_xmlsqlinjection_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_xmlxss_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_fieldformat_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile_xmlvalidationurl_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwprofile_binding_response extends base_response
{
	public appfwprofile_binding[] appfwprofile_binding;
}
/**
	* Binding class showing the resources that can be bound to appfwprofile_binding. 
	*/

public class appfwprofile_binding extends base_resource
{
	private String name;
	private appfwprofile_xmlattachmenturl_binding	appfwprofile_xmlattachmenturl_binding[] = null;
	private appfwprofile_crosssitescripting_binding	appfwprofile_crosssitescripting_binding[] = null;
	private appfwprofile_xmlwsiurl_binding	appfwprofile_xmlwsiurl_binding[] = null;
	private appfwprofile_xmldosurl_binding	appfwprofile_xmldosurl_binding[] = null;
	private appfwprofile_fieldconsistency_binding	appfwprofile_fieldconsistency_binding[] = null;
	private appfwprofile_safeobject_binding	appfwprofile_safeobject_binding[] = null;
	private appfwprofile_sqlinjection_binding	appfwprofile_sqlinjection_binding[] = null;
	private appfwprofile_denyurl_binding	appfwprofile_denyurl_binding[] = null;
	private appfwprofile_trustedlearningclients_binding	appfwprofile_trustedlearningclients_binding[] = null;
	private appfwprofile_csrftag_binding	appfwprofile_csrftag_binding[] = null;
	private appfwprofile_cookieconsistency_binding	appfwprofile_cookieconsistency_binding[] = null;
	private appfwprofile_starturl_binding	appfwprofile_starturl_binding[] = null;
	private appfwprofile_xmlsqlinjection_binding	appfwprofile_xmlsqlinjection_binding[] = null;
	private appfwprofile_xmlxss_binding	appfwprofile_xmlxss_binding[] = null;
	private appfwprofile_fieldformat_binding	appfwprofile_fieldformat_binding[] = null;
	private appfwprofile_xmlvalidationurl_binding	appfwprofile_xmlvalidationurl_binding[] = null;

	/**
	* <pre>
	* The name of the Application Firewall profile.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the Application Firewall profile.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* csrftag that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_csrftag_binding[] get_appfwprofile_csrftag_bindings() throws Exception {
		return this.appfwprofile_csrftag_binding;
	}

	/**
	* <pre>
	* starturl that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_starturl_binding[] get_appfwprofile_starturl_bindings() throws Exception {
		return this.appfwprofile_starturl_binding;
	}

	/**
	* <pre>
	* xmlvalidationurl that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_xmlvalidationurl_binding[] get_appfwprofile_xmlvalidationurl_bindings() throws Exception {
		return this.appfwprofile_xmlvalidationurl_binding;
	}

	/**
	* <pre>
	* xmlattachmenturl that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_xmlattachmenturl_binding[] get_appfwprofile_xmlattachmenturl_bindings() throws Exception {
		return this.appfwprofile_xmlattachmenturl_binding;
	}

	/**
	* <pre>
	* safeobject that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_safeobject_binding[] get_appfwprofile_safeobject_bindings() throws Exception {
		return this.appfwprofile_safeobject_binding;
	}

	/**
	* <pre>
	* cookieconsistency that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_cookieconsistency_binding[] get_appfwprofile_cookieconsistency_bindings() throws Exception {
		return this.appfwprofile_cookieconsistency_binding;
	}

	/**
	* <pre>
	* fieldconsistency that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_fieldconsistency_binding[] get_appfwprofile_fieldconsistency_bindings() throws Exception {
		return this.appfwprofile_fieldconsistency_binding;
	}

	/**
	* <pre>
	* xmlwsiurl that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_xmlwsiurl_binding[] get_appfwprofile_xmlwsiurl_bindings() throws Exception {
		return this.appfwprofile_xmlwsiurl_binding;
	}

	/**
	* <pre>
	* xmlsqlinjection that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_xmlsqlinjection_binding[] get_appfwprofile_xmlsqlinjection_bindings() throws Exception {
		return this.appfwprofile_xmlsqlinjection_binding;
	}

	/**
	* <pre>
	* sqlinjection that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_sqlinjection_binding[] get_appfwprofile_sqlinjection_bindings() throws Exception {
		return this.appfwprofile_sqlinjection_binding;
	}

	/**
	* <pre>
	* trustedlearningclients that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_trustedlearningclients_binding[] get_appfwprofile_trustedlearningclients_bindings() throws Exception {
		return this.appfwprofile_trustedlearningclients_binding;
	}

	/**
	* <pre>
	* crosssitescripting that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_crosssitescripting_binding[] get_appfwprofile_crosssitescripting_bindings() throws Exception {
		return this.appfwprofile_crosssitescripting_binding;
	}

	/**
	* <pre>
	* denyurl that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_denyurl_binding[] get_appfwprofile_denyurl_bindings() throws Exception {
		return this.appfwprofile_denyurl_binding;
	}

	/**
	* <pre>
	* xmlxss that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_xmlxss_binding[] get_appfwprofile_xmlxss_bindings() throws Exception {
		return this.appfwprofile_xmlxss_binding;
	}

	/**
	* <pre>
	* fieldformat that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_fieldformat_binding[] get_appfwprofile_fieldformat_bindings() throws Exception {
		return this.appfwprofile_fieldformat_binding;
	}

	/**
	* <pre>
	* xmldosurl that can be bound to appfwprofile.
	* </pre>
	*/
	public appfwprofile_xmldosurl_binding[] get_appfwprofile_xmldosurl_bindings() throws Exception {
		return this.appfwprofile_xmldosurl_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwprofile_binding_response result = (appfwprofile_binding_response) service.get_payload_formatter().string_to_resource(appfwprofile_binding_response.class, response);
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
		return result.appfwprofile_binding;
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
	* Use this API to fetch appfwprofile_binding resource of given name .
	*/
	public static appfwprofile_binding get(nitro_service service, String name) throws Exception{
		appfwprofile_binding obj = new appfwprofile_binding();
		obj.set_name(name);
		appfwprofile_binding response = (appfwprofile_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwprofile_binding resources of given names .
	*/
	public static appfwprofile_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appfwprofile_binding response[] = new appfwprofile_binding[name.length];
			appfwprofile_binding obj[] = new appfwprofile_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appfwprofile_binding();
				obj[i].set_name(name[i]);
				response[i] = (appfwprofile_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}