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

class dnspolicy_response extends base_response
{
	public dnspolicy[] dnspolicy;
}
/**
* Configuration for DNS policy resource.
*/

public class dnspolicy extends base_resource
{
	private String name;
	private String rule;
	private String viewname;
	private String preferredlocation;
	private String[] preferredloclist;
	private String drop;
	private String cachebypass;
	private String actionname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private String description;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the DNS policy.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the DNS policy.
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
Example: CLIENT.UDP.DNS.DOMAIN.EQ("domainname").
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
Example: CLIENT.UDP.DNS.DOMAIN.EQ("domainname").
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The view name that must be used for the given policy.
	* </pre>
	*/
	public void set_viewname(String viewname) throws Exception{
		this.viewname = viewname;
	}

	/**
	* <pre>
	* The view name that must be used for the given policy.
	* </pre>
	*/
	public String get_viewname() throws Exception {
		return this.viewname;
	}

	/**
	* <pre>
	* The location used for the given policy. This is deprecated attribute. Please use -prefLocList.
	* </pre>
	*/
	public void set_preferredlocation(String preferredlocation) throws Exception{
		this.preferredlocation = preferredlocation;
	}

	/**
	* <pre>
	* The location used for the given policy. This is deprecated attribute. Please use -prefLocList.
	* </pre>
	*/
	public String get_preferredlocation() throws Exception {
		return this.preferredlocation;
	}

	/**
	* <pre>
	* The location list in priority order used for the given policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_preferredloclist(String[] preferredloclist) throws Exception{
		this.preferredloclist = preferredloclist;
	}

	/**
	* <pre>
	* The location list in priority order used for the given policy.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_preferredloclist() throws Exception {
		return this.preferredloclist;
	}

	/**
	* <pre>
	* The dns packet must be dropped.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_drop(String drop) throws Exception{
		this.drop = drop;
	}

	/**
	* <pre>
	* The dns packet must be dropped.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_drop() throws Exception {
		return this.drop;
	}

	/**
	* <pre>
	* By pass dns cache for this.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cachebypass(String cachebypass) throws Exception{
		this.cachebypass = cachebypass;
	}

	/**
	* <pre>
	* By pass dns cache for this.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cachebypass() throws Exception {
		return this.cachebypass;
	}

	/**
	* <pre>
	* Name of the DNS action to perform when the rule evaluates to TRUE. The built in actions function as follows:
* dns_default_act_Drop. Drop the DNS request.
* dns_default_act_Cachebypass. Bypass the DNS cache and forward the request to the name server.
You can create custom actions by using the add dns action command in the CLI or the DNS > Actions > Create DNS Action dialog box in the NetScaler configuration utility.
	* </pre>
	*/
	public void set_actionname(String actionname) throws Exception{
		this.actionname = actionname;
	}

	/**
	* <pre>
	* Name of the DNS action to perform when the rule evaluates to TRUE. The built in actions function as follows:
* dns_default_act_Drop. Drop the DNS request.
* dns_default_act_Cachebypass. Bypass the DNS cache and forward the request to the name server.
You can create custom actions by using the add dns action command in the CLI or the DNS > Actions > Create DNS Action dialog box in the NetScaler configuration utility.
	* </pre>
	*/
	public String get_actionname() throws Exception {
		return this.actionname;
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
	* Flag to determine whether DNS policy is default or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnspolicy_response result = (dnspolicy_response) service.get_payload_formatter().string_to_resource(dnspolicy_response.class, response);
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
		return result.dnspolicy;
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
	* Use this API to add dnspolicy.
	*/
	public static base_response add(nitro_service client, dnspolicy resource) throws Exception {
		dnspolicy addresource = new dnspolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.viewname = resource.viewname;
		addresource.preferredlocation = resource.preferredlocation;
		addresource.preferredloclist = resource.preferredloclist;
		addresource.drop = resource.drop;
		addresource.cachebypass = resource.cachebypass;
		addresource.actionname = resource.actionname;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnspolicy resources.
	*/
	public static base_responses add(nitro_service client, dnspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnspolicy addresources[] = new dnspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnspolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].viewname = resources[i].viewname;
				addresources[i].preferredlocation = resources[i].preferredlocation;
				addresources[i].preferredloclist = resources[i].preferredloclist;
				addresources[i].drop = resources[i].drop;
				addresources[i].cachebypass = resources[i].cachebypass;
				addresources[i].actionname = resources[i].actionname;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnspolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		dnspolicy deleteresource = new dnspolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnspolicy.
	*/
	public static base_response delete(nitro_service client, dnspolicy resource) throws Exception {
		dnspolicy deleteresource = new dnspolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnspolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			dnspolicy deleteresources[] = new dnspolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new dnspolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnspolicy resources.
	*/
	public static base_responses delete(nitro_service client, dnspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnspolicy deleteresources[] = new dnspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnspolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dnspolicy.
	*/
	public static base_response update(nitro_service client, dnspolicy resource) throws Exception {
		dnspolicy updateresource = new dnspolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.viewname = resource.viewname;
		updateresource.preferredlocation = resource.preferredlocation;
		updateresource.preferredloclist = resource.preferredloclist;
		updateresource.drop = resource.drop;
		updateresource.cachebypass = resource.cachebypass;
		updateresource.actionname = resource.actionname;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnspolicy resources.
	*/
	public static base_responses update(nitro_service client, dnspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnspolicy updateresources[] = new dnspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnspolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].viewname = resources[i].viewname;
				updateresources[i].preferredlocation = resources[i].preferredlocation;
				updateresources[i].preferredloclist = resources[i].preferredloclist;
				updateresources[i].drop = resources[i].drop;
				updateresources[i].cachebypass = resources[i].cachebypass;
				updateresources[i].actionname = resources[i].actionname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnspolicy resources that are configured on netscaler.
	*/
	public static dnspolicy[] get(nitro_service service) throws Exception{
		dnspolicy obj = new dnspolicy();
		dnspolicy[] response = (dnspolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnspolicy resources that are configured on netscaler.
	*/
	public static dnspolicy[] get(nitro_service service, options option) throws Exception{
		dnspolicy obj = new dnspolicy();
		dnspolicy[] response = (dnspolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dnspolicy resource of given name .
	*/
	public static dnspolicy get(nitro_service service, String name) throws Exception{
		dnspolicy obj = new dnspolicy();
		obj.set_name(name);
		dnspolicy response = (dnspolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnspolicy resources of given names .
	*/
	public static dnspolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			dnspolicy response[] = new dnspolicy[name.length];
			dnspolicy obj[] = new dnspolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new dnspolicy();
				obj[i].set_name(name[i]);
				response[i] = (dnspolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnspolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnspolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		dnspolicy obj = new dnspolicy();
		options option = new options();
		option.set_filter(filter);
		dnspolicy[] response = (dnspolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnspolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnspolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnspolicy obj = new dnspolicy();
		options option = new options();
		option.set_filter(filter);
		dnspolicy[] response = (dnspolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnspolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnspolicy obj = new dnspolicy();
		options option = new options();
		option.set_count(true);
		dnspolicy[] response = (dnspolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnspolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnspolicy obj = new dnspolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnspolicy[] response = (dnspolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnspolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnspolicy obj = new dnspolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnspolicy[] response = (dnspolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cachebypassEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class dropEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
}
