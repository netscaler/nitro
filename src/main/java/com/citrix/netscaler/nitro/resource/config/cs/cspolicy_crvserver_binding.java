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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cspolicy_crvserver_binding_response extends base_response
{
	public cspolicy_crvserver_binding[] cspolicy_crvserver_binding;
}
/**
	* Binding class showing the crvserver that can be bound to cspolicy.
	*/

public class cspolicy_crvserver_binding extends base_resource
{
	private String domain;
	private String target;
	private String url;
	private Long priority;
	private Long hits;
	private String labeltype;
	private String labelname;
	private String policyname;
	private Long __count;

	/**
	* <pre>
	* The name of the policy to be displayed. if no name is given then all policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the policy to be displayed. if no name is given then all policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The domain name. The string value can range to 63 characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* The domain name. The string value can range to 63 characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* priority of bound policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Name of the label invoked.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Total number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Target flag.
	* </pre>
	*/
	public String get_target() throws Exception {
		return this.target;
	}

	/**
	* <pre>
	* The URL, with wildcards.
Specify the string value in this format:
// [[prefix ] [*]] [.suffix].<br> Minimum length =  1<br> Maximum length =  208
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* The invocation type.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cspolicy_crvserver_binding_response result = (cspolicy_crvserver_binding_response) service.get_payload_formatter().string_to_resource(cspolicy_crvserver_binding_response.class, response);
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
		return result.cspolicy_crvserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.policyname;
	}

	/**
	* Use this API to fetch cspolicy_crvserver_binding resources of given name .
	*/
	public static cspolicy_crvserver_binding[] get(nitro_service service, String policyname) throws Exception{
		cspolicy_crvserver_binding obj = new cspolicy_crvserver_binding();
		obj.set_policyname(policyname);
		cspolicy_crvserver_binding response[] = (cspolicy_crvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cspolicy_crvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cspolicy_crvserver_binding[] get_filtered(nitro_service service, String policyname, String filter) throws Exception{
		cspolicy_crvserver_binding obj = new cspolicy_crvserver_binding();
		obj.set_policyname(policyname);
		options option = new options();
		option.set_filter(filter);
		cspolicy_crvserver_binding[] response = (cspolicy_crvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cspolicy_crvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cspolicy_crvserver_binding[] get_filtered(nitro_service service, String policyname, filtervalue[] filter) throws Exception{
		cspolicy_crvserver_binding obj = new cspolicy_crvserver_binding();
		obj.set_policyname(policyname);
		options option = new options();
		option.set_filter(filter);
		cspolicy_crvserver_binding[] response = (cspolicy_crvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count cspolicy_crvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String policyname) throws Exception{
		cspolicy_crvserver_binding obj = new cspolicy_crvserver_binding();
		obj.set_policyname(policyname);
		options option = new options();
		option.set_count(true);
		cspolicy_crvserver_binding response[] = (cspolicy_crvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cspolicy_crvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String policyname, String filter) throws Exception{
		cspolicy_crvserver_binding obj = new cspolicy_crvserver_binding();
		obj.set_policyname(policyname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cspolicy_crvserver_binding[] response = (cspolicy_crvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cspolicy_crvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String policyname, filtervalue[] filter) throws Exception{
		cspolicy_crvserver_binding obj = new cspolicy_crvserver_binding();
		obj.set_policyname(policyname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cspolicy_crvserver_binding[] response = (cspolicy_crvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}

}