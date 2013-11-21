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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnspolicy_dnsglobal_binding_response extends base_response
{
	public dnspolicy_dnsglobal_binding[] dnspolicy_dnsglobal_binding;
}
/**
	* Binding class showing the dnsglobal that can be bound to dnspolicy.
	*/

public class dnspolicy_dnsglobal_binding extends base_resource
{
	private String boundto;
	private Long priority;
	private Integer activepolicy;
	private String gotopriorityexpression;
	private String labeltype;
	private String labelname;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Location where policy is bound.
	* </pre>
	*/
	public void set_boundto(String boundto) throws Exception{
		this.boundto = boundto;
	}

	/**
	* <pre>
	* Location where policy is bound.
	* </pre>
	*/
	public String get_boundto() throws Exception {
		return this.boundto;
	}

	/**
	* <pre>
	* Name of the DNS policy.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the DNS policy.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Indicates whether policy is bound or not.
	* </pre>
	*/
	public Integer get_activepolicy() throws Exception {
		return this.activepolicy;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnspolicy_dnsglobal_binding_response result = (dnspolicy_dnsglobal_binding_response) service.get_payload_formatter().string_to_resource(dnspolicy_dnsglobal_binding_response.class, response);
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
		return result.dnspolicy_dnsglobal_binding;
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
	* Use this API to fetch dnspolicy_dnsglobal_binding resources of given name .
	*/
	public static dnspolicy_dnsglobal_binding[] get(nitro_service service, String name) throws Exception{
		dnspolicy_dnsglobal_binding obj = new dnspolicy_dnsglobal_binding();
		obj.set_name(name);
		dnspolicy_dnsglobal_binding response[] = (dnspolicy_dnsglobal_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnspolicy_dnsglobal_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnspolicy_dnsglobal_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		dnspolicy_dnsglobal_binding obj = new dnspolicy_dnsglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		dnspolicy_dnsglobal_binding[] response = (dnspolicy_dnsglobal_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnspolicy_dnsglobal_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnspolicy_dnsglobal_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		dnspolicy_dnsglobal_binding obj = new dnspolicy_dnsglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		dnspolicy_dnsglobal_binding[] response = (dnspolicy_dnsglobal_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count dnspolicy_dnsglobal_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		dnspolicy_dnsglobal_binding obj = new dnspolicy_dnsglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		dnspolicy_dnsglobal_binding response[] = (dnspolicy_dnsglobal_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnspolicy_dnsglobal_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		dnspolicy_dnsglobal_binding obj = new dnspolicy_dnsglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnspolicy_dnsglobal_binding[] response = (dnspolicy_dnsglobal_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnspolicy_dnsglobal_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		dnspolicy_dnsglobal_binding obj = new dnspolicy_dnsglobal_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnspolicy_dnsglobal_binding[] response = (dnspolicy_dnsglobal_binding[]) obj.getfiltered(service, option);
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