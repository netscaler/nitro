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

class tmformssoaction_response extends base_response
{
	public tmformssoaction[] tmformssoaction;
}
/**
* Configuration for Form sso action resource.
*/

public class tmformssoaction extends base_resource
{
	private String name;
	private String actionurl;
	private String userfield;
	private String passwdfield;
	private String ssosuccessrule;
	private String namevaluepair;
	private Long responsesize;
	private String nvtype;
	private String submitmethod;
	private Long __count;

	/**
	* <pre>
	* The name for the action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The url to which form will be submitted.<br> Minimum length =  1
	* </pre>
	*/
	public void set_actionurl(String actionurl) throws Exception{
		this.actionurl = actionurl;
	}

	/**
	* <pre>
	* The url to which form will be submitted.<br> Minimum length =  1
	* </pre>
	*/
	public String get_actionurl() throws Exception {
		return this.actionurl;
	}

	/**
	* <pre>
	* Username field in the form to be filled with sessions username.<br> Minimum length =  1
	* </pre>
	*/
	public void set_userfield(String userfield) throws Exception{
		this.userfield = userfield;
	}

	/**
	* <pre>
	* Username field in the form to be filled with sessions username.<br> Minimum length =  1
	* </pre>
	*/
	public String get_userfield() throws Exception {
		return this.userfield;
	}

	/**
	* <pre>
	* Password field in the form to be filled with sessions username.<br> Minimum length =  1
	* </pre>
	*/
	public void set_passwdfield(String passwdfield) throws Exception{
		this.passwdfield = passwdfield;
	}

	/**
	* <pre>
	* Password field in the form to be filled with sessions username.<br> Minimum length =  1
	* </pre>
	*/
	public String get_passwdfield() throws Exception {
		return this.passwdfield;
	}

	/**
	* <pre>
	* The rule to be used to check whether sso is successfull or not . Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public void set_ssosuccessrule(String ssosuccessrule) throws Exception{
		this.ssosuccessrule = ssosuccessrule;
	}

	/**
	* <pre>
	* The rule to be used to check whether sso is successfull or not . Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public String get_ssosuccessrule() throws Exception {
		return this.ssosuccessrule;
	}

	/**
	* <pre>
	* Name Value pairs to be submitted. Name value pairs have to separated by '&'. EX: name1=value1&name2=value2.
	* </pre>
	*/
	public void set_namevaluepair(String namevaluepair) throws Exception{
		this.namevaluepair = namevaluepair;
	}

	/**
	* <pre>
	* Name Value pairs to be submitted. Name value pairs have to separated by '&'. EX: name1=value1&name2=value2.
	* </pre>
	*/
	public String get_namevaluepair() throws Exception {
		return this.namevaluepair;
	}

	/**
	* <pre>
	* Size of the body to be parsed to get the forms.<br> Default value: 8096
	* </pre>
	*/
	public void set_responsesize(long responsesize) throws Exception {
		this.responsesize = new Long(responsesize);
	}

	/**
	* <pre>
	* Size of the body to be parsed to get the forms.<br> Default value: 8096
	* </pre>
	*/
	public void set_responsesize(Long responsesize) throws Exception{
		this.responsesize = responsesize;
	}

	/**
	* <pre>
	* Size of the body to be parsed to get the forms.<br> Default value: 8096
	* </pre>
	*/
	public Long get_responsesize() throws Exception {
		return this.responsesize;
	}

	/**
	* <pre>
	* Bypass Form extraction.<br> Default value: DYNAMIC<br> Possible values = STATIC, DYNAMIC
	* </pre>
	*/
	public void set_nvtype(String nvtype) throws Exception{
		this.nvtype = nvtype;
	}

	/**
	* <pre>
	* Bypass Form extraction.<br> Default value: DYNAMIC<br> Possible values = STATIC, DYNAMIC
	* </pre>
	*/
	public String get_nvtype() throws Exception {
		return this.nvtype;
	}

	/**
	* <pre>
	* submit method.<br> Default value: GET<br> Possible values = GET, POST
	* </pre>
	*/
	public void set_submitmethod(String submitmethod) throws Exception{
		this.submitmethod = submitmethod;
	}

	/**
	* <pre>
	* submit method.<br> Default value: GET<br> Possible values = GET, POST
	* </pre>
	*/
	public String get_submitmethod() throws Exception {
		return this.submitmethod;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmformssoaction_response result = (tmformssoaction_response) service.get_payload_formatter().string_to_resource(tmformssoaction_response.class, response);
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
		return result.tmformssoaction;
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
	* Use this API to add tmformssoaction.
	*/
	public static base_response add(nitro_service client, tmformssoaction resource) throws Exception {
		tmformssoaction addresource = new tmformssoaction();
		addresource.name = resource.name;
		addresource.actionurl = resource.actionurl;
		addresource.userfield = resource.userfield;
		addresource.passwdfield = resource.passwdfield;
		addresource.ssosuccessrule = resource.ssosuccessrule;
		addresource.namevaluepair = resource.namevaluepair;
		addresource.responsesize = resource.responsesize;
		addresource.nvtype = resource.nvtype;
		addresource.submitmethod = resource.submitmethod;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add tmformssoaction resources.
	*/
	public static base_responses add(nitro_service client, tmformssoaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmformssoaction addresources[] = new tmformssoaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new tmformssoaction();
				addresources[i].name = resources[i].name;
				addresources[i].actionurl = resources[i].actionurl;
				addresources[i].userfield = resources[i].userfield;
				addresources[i].passwdfield = resources[i].passwdfield;
				addresources[i].ssosuccessrule = resources[i].ssosuccessrule;
				addresources[i].namevaluepair = resources[i].namevaluepair;
				addresources[i].responsesize = resources[i].responsesize;
				addresources[i].nvtype = resources[i].nvtype;
				addresources[i].submitmethod = resources[i].submitmethod;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmformssoaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		tmformssoaction deleteresource = new tmformssoaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmformssoaction.
	*/
	public static base_response delete(nitro_service client, tmformssoaction resource) throws Exception {
		tmformssoaction deleteresource = new tmformssoaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmformssoaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmformssoaction deleteresources[] = new tmformssoaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new tmformssoaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmformssoaction resources.
	*/
	public static base_responses delete(nitro_service client, tmformssoaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmformssoaction deleteresources[] = new tmformssoaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new tmformssoaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update tmformssoaction.
	*/
	public static base_response update(nitro_service client, tmformssoaction resource) throws Exception {
		tmformssoaction updateresource = new tmformssoaction();
		updateresource.name = resource.name;
		updateresource.actionurl = resource.actionurl;
		updateresource.userfield = resource.userfield;
		updateresource.passwdfield = resource.passwdfield;
		updateresource.ssosuccessrule = resource.ssosuccessrule;
		updateresource.responsesize = resource.responsesize;
		updateresource.namevaluepair = resource.namevaluepair;
		updateresource.nvtype = resource.nvtype;
		updateresource.submitmethod = resource.submitmethod;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update tmformssoaction resources.
	*/
	public static base_responses update(nitro_service client, tmformssoaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmformssoaction updateresources[] = new tmformssoaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new tmformssoaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].actionurl = resources[i].actionurl;
				updateresources[i].userfield = resources[i].userfield;
				updateresources[i].passwdfield = resources[i].passwdfield;
				updateresources[i].ssosuccessrule = resources[i].ssosuccessrule;
				updateresources[i].responsesize = resources[i].responsesize;
				updateresources[i].namevaluepair = resources[i].namevaluepair;
				updateresources[i].nvtype = resources[i].nvtype;
				updateresources[i].submitmethod = resources[i].submitmethod;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmformssoaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		tmformssoaction unsetresource = new tmformssoaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of tmformssoaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tmformssoaction resource, String[] args) throws Exception{
		tmformssoaction unsetresource = new tmformssoaction();
		unsetresource.name = resource.name;
		unsetresource.responsesize = resource.responsesize;
		unsetresource.namevaluepair = resource.namevaluepair;
		unsetresource.nvtype = resource.nvtype;
		unsetresource.submitmethod = resource.submitmethod;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of tmformssoaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmformssoaction unsetresources[] = new tmformssoaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new tmformssoaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmformssoaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, tmformssoaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmformssoaction unsetresources[] = new tmformssoaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new tmformssoaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].responsesize = resources[i].responsesize;
				unsetresources[i].namevaluepair = resources[i].namevaluepair;
				unsetresources[i].nvtype = resources[i].nvtype;
				unsetresources[i].submitmethod = resources[i].submitmethod;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the tmformssoaction resources that are configured on netscaler.
	*/
	public static tmformssoaction[] get(nitro_service service) throws Exception{
		tmformssoaction obj = new tmformssoaction();
		tmformssoaction[] response = (tmformssoaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the tmformssoaction resources that are configured on netscaler.
	*/
	public static tmformssoaction[] get(nitro_service service, options option) throws Exception{
		tmformssoaction obj = new tmformssoaction();
		tmformssoaction[] response = (tmformssoaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch tmformssoaction resource of given name .
	*/
	public static tmformssoaction get(nitro_service service, String name) throws Exception{
		tmformssoaction obj = new tmformssoaction();
		obj.set_name(name);
		tmformssoaction response = (tmformssoaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmformssoaction resources of given names .
	*/
	public static tmformssoaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmformssoaction response[] = new tmformssoaction[name.length];
			tmformssoaction obj[] = new tmformssoaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmformssoaction();
				obj[i].set_name(name[i]);
				response[i] = (tmformssoaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of tmformssoaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static tmformssoaction[] get_filtered(nitro_service service, String filter) throws Exception{
		tmformssoaction obj = new tmformssoaction();
		options option = new options();
		option.set_filter(filter);
		tmformssoaction[] response = (tmformssoaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of tmformssoaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static tmformssoaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmformssoaction obj = new tmformssoaction();
		options option = new options();
		option.set_filter(filter);
		tmformssoaction[] response = (tmformssoaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the tmformssoaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		tmformssoaction obj = new tmformssoaction();
		options option = new options();
		option.set_count(true);
		tmformssoaction[] response = (tmformssoaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of tmformssoaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		tmformssoaction obj = new tmformssoaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmformssoaction[] response = (tmformssoaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of tmformssoaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmformssoaction obj = new tmformssoaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmformssoaction[] response = (tmformssoaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class nvtypeEnum {
		public static final String STATIC = "STATIC";
		public static final String DYNAMIC = "DYNAMIC";
	}
	public static class submitmethodEnum {
		public static final String GET = "GET";
		public static final String POST = "POST";
	}
}
