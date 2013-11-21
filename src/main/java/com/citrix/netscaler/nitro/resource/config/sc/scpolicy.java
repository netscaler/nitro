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

package com.citrix.netscaler.nitro.resource.config.sc;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class scpolicy_response extends base_response
{
	public scpolicy[] scpolicy;
}
/**
* Configuration for SureConnect policy resource.
*/

public class scpolicy extends base_resource
{
	private String name;
	private String url;
	private String rule;
	private Long delay;
	private Long maxconn;
	private String action;
	private String altcontentsvcname;
	private String altcontentpath;
	private Long __count;

	/**
	* <pre>
	* Name for the policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the policy. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* URL against which to match incoming client request.<br> Maximum length =  127
	* </pre>
	*/
	public void set_url(String url) throws Exception{
		this.url = url;
	}

	/**
	* <pre>
	* URL against which to match incoming client request.<br> Maximum length =  127
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* Expression against which the traffic is evaluated. 
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'

The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the  character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.<br> Maximum length =  1499
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression against which the traffic is evaluated. 
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'

The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the  character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.<br> Maximum length =  1499
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Delay threshold, in microseconds, for requests that match the policy's URL or rule. If the delay statistics gathered for the matching request exceed the specified delay, SureConnect is triggered for that request.<br> Minimum value =  1<br> Maximum value =  599999999
	* </pre>
	*/
	public void set_delay(long delay) throws Exception {
		this.delay = new Long(delay);
	}

	/**
	* <pre>
	* Delay threshold, in microseconds, for requests that match the policy's URL or rule. If the delay statistics gathered for the matching request exceed the specified delay, SureConnect is triggered for that request.<br> Minimum value =  1<br> Maximum value =  599999999
	* </pre>
	*/
	public void set_delay(Long delay) throws Exception{
		this.delay = delay;
	}

	/**
	* <pre>
	* Delay threshold, in microseconds, for requests that match the policy's URL or rule. If the delay statistics gathered for the matching request exceed the specified delay, SureConnect is triggered for that request.<br> Minimum value =  1<br> Maximum value =  599999999
	* </pre>
	*/
	public Long get_delay() throws Exception {
		return this.delay;
	}

	/**
	* <pre>
	* Maximum number of concurrent connections that can be open for requests that match the policy's URL or rule.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxconn(long maxconn) throws Exception {
		this.maxconn = new Long(maxconn);
	}

	/**
	* <pre>
	* Maximum number of concurrent connections that can be open for requests that match the policy's URL or rule.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxconn(Long maxconn) throws Exception{
		this.maxconn = maxconn;
	}

	/**
	* <pre>
	* Maximum number of concurrent connections that can be open for requests that match the policy's URL or rule.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_maxconn() throws Exception {
		return this.maxconn;
	}

	/**
	* <pre>
	* Action to be taken when the delay or maximum-connections threshold is reached. Available settings function as follows:
ACS - Serve content from an alternative content service.
NS - Serve alternative content from the NetScaler appliance.
NO ACTION - Serve no alternative content. However, delay statistics are still collected for the configured URLs, and, if the Maximum Client Connections parameter is set, the number of connections is limited to the value specified by that parameter. (However, alternative content is not served even if the maxConn threshold is met).<br> Possible values = ACS, NS, NOACTION
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* Action to be taken when the delay or maximum-connections threshold is reached. Available settings function as follows:
ACS - Serve content from an alternative content service.
NS - Serve alternative content from the NetScaler appliance.
NO ACTION - Serve no alternative content. However, delay statistics are still collected for the configured URLs, and, if the Maximum Client Connections parameter is set, the number of connections is limited to the value specified by that parameter. (However, alternative content is not served even if the maxConn threshold is met).<br> Possible values = ACS, NS, NOACTION
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Name of the alternative content service to be used in the ACS action.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_altcontentsvcname(String altcontentsvcname) throws Exception{
		this.altcontentsvcname = altcontentsvcname;
	}

	/**
	* <pre>
	* Name of the alternative content service to be used in the ACS action.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_altcontentsvcname() throws Exception {
		return this.altcontentsvcname;
	}

	/**
	* <pre>
	* Path to the alternative content service to be used in the ACS action.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_altcontentpath(String altcontentpath) throws Exception{
		this.altcontentpath = altcontentpath;
	}

	/**
	* <pre>
	* Path to the alternative content service to be used in the ACS action.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_altcontentpath() throws Exception {
		return this.altcontentpath;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		scpolicy_response result = (scpolicy_response) service.get_payload_formatter().string_to_resource(scpolicy_response.class, response);
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
		return result.scpolicy;
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
	* Use this API to add scpolicy.
	*/
	public static base_response add(nitro_service client, scpolicy resource) throws Exception {
		scpolicy addresource = new scpolicy();
		addresource.name = resource.name;
		addresource.url = resource.url;
		addresource.rule = resource.rule;
		addresource.delay = resource.delay;
		addresource.maxconn = resource.maxconn;
		addresource.action = resource.action;
		addresource.altcontentsvcname = resource.altcontentsvcname;
		addresource.altcontentpath = resource.altcontentpath;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add scpolicy resources.
	*/
	public static base_responses add(nitro_service client, scpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			scpolicy addresources[] = new scpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new scpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].url = resources[i].url;
				addresources[i].rule = resources[i].rule;
				addresources[i].delay = resources[i].delay;
				addresources[i].maxconn = resources[i].maxconn;
				addresources[i].action = resources[i].action;
				addresources[i].altcontentsvcname = resources[i].altcontentsvcname;
				addresources[i].altcontentpath = resources[i].altcontentpath;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete scpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		scpolicy deleteresource = new scpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete scpolicy.
	*/
	public static base_response delete(nitro_service client, scpolicy resource) throws Exception {
		scpolicy deleteresource = new scpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete scpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			scpolicy deleteresources[] = new scpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new scpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete scpolicy resources.
	*/
	public static base_responses delete(nitro_service client, scpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			scpolicy deleteresources[] = new scpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new scpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update scpolicy.
	*/
	public static base_response update(nitro_service client, scpolicy resource) throws Exception {
		scpolicy updateresource = new scpolicy();
		updateresource.name = resource.name;
		updateresource.url = resource.url;
		updateresource.rule = resource.rule;
		updateresource.delay = resource.delay;
		updateresource.maxconn = resource.maxconn;
		updateresource.action = resource.action;
		updateresource.altcontentsvcname = resource.altcontentsvcname;
		updateresource.altcontentpath = resource.altcontentpath;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update scpolicy resources.
	*/
	public static base_responses update(nitro_service client, scpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			scpolicy updateresources[] = new scpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new scpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].url = resources[i].url;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].delay = resources[i].delay;
				updateresources[i].maxconn = resources[i].maxconn;
				updateresources[i].action = resources[i].action;
				updateresources[i].altcontentsvcname = resources[i].altcontentsvcname;
				updateresources[i].altcontentpath = resources[i].altcontentpath;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of scpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, scpolicy resource, String[] args) throws Exception{
		scpolicy unsetresource = new scpolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of scpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			scpolicy unsetresources[] = new scpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new scpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of scpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, scpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			scpolicy unsetresources[] = new scpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new scpolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the scpolicy resources that are configured on netscaler.
	*/
	public static scpolicy[] get(nitro_service service) throws Exception{
		scpolicy obj = new scpolicy();
		scpolicy[] response = (scpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the scpolicy resources that are configured on netscaler.
	*/
	public static scpolicy[] get(nitro_service service, options option) throws Exception{
		scpolicy obj = new scpolicy();
		scpolicy[] response = (scpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch scpolicy resource of given name .
	*/
	public static scpolicy get(nitro_service service, String name) throws Exception{
		scpolicy obj = new scpolicy();
		obj.set_name(name);
		scpolicy response = (scpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch scpolicy resources of given names .
	*/
	public static scpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			scpolicy response[] = new scpolicy[name.length];
			scpolicy obj[] = new scpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new scpolicy();
				obj[i].set_name(name[i]);
				response[i] = (scpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of scpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static scpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		scpolicy obj = new scpolicy();
		options option = new options();
		option.set_filter(filter);
		scpolicy[] response = (scpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of scpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static scpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		scpolicy obj = new scpolicy();
		options option = new options();
		option.set_filter(filter);
		scpolicy[] response = (scpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the scpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		scpolicy obj = new scpolicy();
		options option = new options();
		option.set_count(true);
		scpolicy[] response = (scpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of scpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		scpolicy obj = new scpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		scpolicy[] response = (scpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of scpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		scpolicy obj = new scpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		scpolicy[] response = (scpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class actionEnum {
		public static final String ACS = "ACS";
		public static final String NS = "NS";
		public static final String NOACTION = "NOACTION";
	}
}
