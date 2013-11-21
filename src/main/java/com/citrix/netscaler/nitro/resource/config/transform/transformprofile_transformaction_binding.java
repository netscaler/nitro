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

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformprofile_transformaction_binding_response extends base_response
{
	public transformprofile_transformaction_binding[] transformprofile_transformaction_binding;
}
/**
	* Binding class showing the transformaction that can be bound to transformprofile.
	*/

public class transformprofile_transformaction_binding extends base_resource
{
	private String actionname;
	private Long priority;
	private String state;
	private String profilename;
	private String requrlfrom;
	private String requrlinto;
	private String resurlfrom;
	private String resurlinto;
	private String cookiedomainfrom;
	private String cookiedomaininto;
	private String actioncomment;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Name of the profile.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the profile.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* URL Transformation action name.
	* </pre>
	*/
	public void set_actionname(String actionname) throws Exception{
		this.actionname = actionname;
	}

	/**
	* <pre>
	* URL Transformation action name.
	* </pre>
	*/
	public String get_actionname() throws Exception {
		return this.actionname;
	}

	/**
	* <pre>
	* Priority of the Action within the Profile.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Pattern of original response URLs. It corresponds to the way external users view the server, and acts as a source for response transformations.
	* </pre>
	*/
	public String get_resurlfrom() throws Exception {
		return this.resurlfrom;
	}

	/**
	* <pre>
	* Pattern of the original domain in Set-Cookie headers.
	* </pre>
	*/
	public String get_cookiedomainfrom() throws Exception {
		return this.cookiedomainfrom;
	}

	/**
	* <pre>
	* URL Transformation profile name.
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Enabled flag.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Pattern of the transformed domain in Set-Cookie headers.
	* </pre>
	*/
	public String get_cookiedomaininto() throws Exception {
		return this.cookiedomaininto;
	}

	/**
	* <pre>
	* Comments.
	* </pre>
	*/
	public String get_actioncomment() throws Exception {
		return this.actioncomment;
	}

	/**
	* <pre>
	* Pattern of transformed response URLs. It corresponds to internal addresses and indicates how they are created.
	* </pre>
	*/
	public String get_resurlinto() throws Exception {
		return this.resurlinto;
	}

	/**
	* <pre>
	* Pattern of transformed request URLs. It corresponds to internal addresses and indicates how they are created.
	* </pre>
	*/
	public String get_requrlinto() throws Exception {
		return this.requrlinto;
	}

	/**
	* <pre>
	* Pattern of original request URLs. It corresponds to the way external users view the server, and acts as a source for request transformations.
	* </pre>
	*/
	public String get_requrlfrom() throws Exception {
		return this.requrlfrom;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformprofile_transformaction_binding_response result = (transformprofile_transformaction_binding_response) service.get_payload_formatter().string_to_resource(transformprofile_transformaction_binding_response.class, response);
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
		return result.transformprofile_transformaction_binding;
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
	* Use this API to fetch transformprofile_transformaction_binding resources of given name .
	*/
	public static transformprofile_transformaction_binding[] get(nitro_service service, String name) throws Exception{
		transformprofile_transformaction_binding obj = new transformprofile_transformaction_binding();
		obj.set_name(name);
		transformprofile_transformaction_binding response[] = (transformprofile_transformaction_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of transformprofile_transformaction_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static transformprofile_transformaction_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		transformprofile_transformaction_binding obj = new transformprofile_transformaction_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		transformprofile_transformaction_binding[] response = (transformprofile_transformaction_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of transformprofile_transformaction_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static transformprofile_transformaction_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		transformprofile_transformaction_binding obj = new transformprofile_transformaction_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		transformprofile_transformaction_binding[] response = (transformprofile_transformaction_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count transformprofile_transformaction_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		transformprofile_transformaction_binding obj = new transformprofile_transformaction_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		transformprofile_transformaction_binding response[] = (transformprofile_transformaction_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of transformprofile_transformaction_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		transformprofile_transformaction_binding obj = new transformprofile_transformaction_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformprofile_transformaction_binding[] response = (transformprofile_transformaction_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of transformprofile_transformaction_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		transformprofile_transformaction_binding obj = new transformprofile_transformaction_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformprofile_transformaction_binding[] response = (transformprofile_transformaction_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}