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

class dnspolicy64_response extends base_response
{
	public dnspolicy64[] dnspolicy64;
}
/**
* Configuration for dns64 policy resource.
*/

public class dnspolicy64 extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private Long hits;
	private String labeltype;
	private String labelname;
	private Long undefhits;
	private String description;
	private Long __count;

	/**
	* <pre>
	* Name for the DNS64 policy.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the DNS64 policy.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Expression against which DNS traffic is evaluated. Written in the default syntax.
Note:
* On the command line interface, if the expression includes blank spaces, the entire expression must be enclosed in double quotation marks.
* If the expression itself includes double quotation marks, you must escape the quotations by using the  character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks. 
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
Example: CLIENT.IP.SRC.IN_SUBENT(23.34.0.0/16).
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression against which DNS traffic is evaluated. Written in the default syntax.
Note:
* On the command line interface, if the expression includes blank spaces, the entire expression must be enclosed in double quotation marks.
* If the expression itself includes double quotation marks, you must escape the quotations by using the  character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks. 
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
Example: CLIENT.IP.SRC.IN_SUBENT(23.34.0.0/16).
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Name of the DNS64 action to perform when the rule evaluates to TRUE. The built in actions function as follows:
* A default dns64 action with prefix <default prefix> and mapped and exclude are any 
You can create custom actions by using the add dns action command in the CLI or the DNS64 > Actions > Create DNS64 Action dialog box in the NetScaler configuration utility.
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Name of the DNS64 action to perform when the rule evaluates to TRUE. The built in actions function as follows:
* A default dns64 action with prefix <default prefix> and mapped and exclude are any 
You can create custom actions by using the add dns action command in the CLI or the DNS64 > Actions > Create DNS64 Action dialog box in the NetScaler configuration utility.
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* The number of times the policy has been hit.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
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
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Number of Undef hits.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* Description of the policy.
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
		dnspolicy64_response result = (dnspolicy64_response) service.get_payload_formatter().string_to_resource(dnspolicy64_response.class, response);
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
		return result.dnspolicy64;
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
	* Use this API to add dnspolicy64.
	*/
	public static base_response add(nitro_service client, dnspolicy64 resource) throws Exception {
		dnspolicy64 addresource = new dnspolicy64();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnspolicy64 resources.
	*/
	public static base_responses add(nitro_service client, dnspolicy64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnspolicy64 addresources[] = new dnspolicy64[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnspolicy64();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnspolicy64 of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		dnspolicy64 deleteresource = new dnspolicy64();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnspolicy64.
	*/
	public static base_response delete(nitro_service client, dnspolicy64 resource) throws Exception {
		dnspolicy64 deleteresource = new dnspolicy64();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnspolicy64 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			dnspolicy64 deleteresources[] = new dnspolicy64[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new dnspolicy64();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnspolicy64 resources.
	*/
	public static base_responses delete(nitro_service client, dnspolicy64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnspolicy64 deleteresources[] = new dnspolicy64[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnspolicy64();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dnspolicy64.
	*/
	public static base_response update(nitro_service client, dnspolicy64 resource) throws Exception {
		dnspolicy64 updateresource = new dnspolicy64();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnspolicy64 resources.
	*/
	public static base_responses update(nitro_service client, dnspolicy64 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnspolicy64 updateresources[] = new dnspolicy64[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnspolicy64();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnspolicy64 resources that are configured on netscaler.
	*/
	public static dnspolicy64[] get(nitro_service service) throws Exception{
		dnspolicy64 obj = new dnspolicy64();
		dnspolicy64[] response = (dnspolicy64[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnspolicy64 resources that are configured on netscaler.
	*/
	public static dnspolicy64[] get(nitro_service service, options option) throws Exception{
		dnspolicy64 obj = new dnspolicy64();
		dnspolicy64[] response = (dnspolicy64[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dnspolicy64 resource of given name .
	*/
	public static dnspolicy64 get(nitro_service service, String name) throws Exception{
		dnspolicy64 obj = new dnspolicy64();
		obj.set_name(name);
		dnspolicy64 response = (dnspolicy64) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnspolicy64 resources of given names .
	*/
	public static dnspolicy64[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			dnspolicy64 response[] = new dnspolicy64[name.length];
			dnspolicy64 obj[] = new dnspolicy64[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new dnspolicy64();
				obj[i].set_name(name[i]);
				response[i] = (dnspolicy64) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnspolicy64 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnspolicy64[] get_filtered(nitro_service service, String filter) throws Exception{
		dnspolicy64 obj = new dnspolicy64();
		options option = new options();
		option.set_filter(filter);
		dnspolicy64[] response = (dnspolicy64[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnspolicy64 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnspolicy64[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnspolicy64 obj = new dnspolicy64();
		options option = new options();
		option.set_filter(filter);
		dnspolicy64[] response = (dnspolicy64[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnspolicy64 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnspolicy64 obj = new dnspolicy64();
		options option = new options();
		option.set_count(true);
		dnspolicy64[] response = (dnspolicy64[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnspolicy64 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnspolicy64 obj = new dnspolicy64();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnspolicy64[] response = (dnspolicy64[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnspolicy64 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnspolicy64 obj = new dnspolicy64();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnspolicy64[] response = (dnspolicy64[]) obj.getfiltered(service, option);
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
