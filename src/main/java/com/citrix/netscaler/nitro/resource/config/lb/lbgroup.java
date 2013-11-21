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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbgroup_response extends base_response
{
	public lbgroup[] lbgroup;
}
/**
* Configuration for LB group resource.
*/

public class lbgroup extends base_resource
{
	private String name;
	private String persistencetype;
	private String persistencebackup;
	private Long backuppersistencetimeout;
	private String persistmask;
	private String cookiename;
	private Long v6persistmasklen;
	private String cookiedomain;
	private Long timeout;
	private String rule;
	private String newname;

	//------- Read only Parameter ---------;

	private Long td;
	private Long __count;

	/**
	* <pre>
	* Name of the load balancing virtual server group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the load balancing virtual server group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Type of persistence for the group. Available settings function as follows:
* SOURCEIP - Create persistence sessions based on the client IP.
* COOKIEINSERT - Create persistence sessions based on a cookie in client requests. The cookie is inserted by a Set-Cookie directive from the server, in its first response to a client.
* RULE - Create persistence sessions based on a user defined rule.
* NONE - Disable persistence for the group.<br> Possible values = SOURCEIP, COOKIEINSERT, RULE, NONE
	* </pre>
	*/
	public void set_persistencetype(String persistencetype) throws Exception{
		this.persistencetype = persistencetype;
	}

	/**
	* <pre>
	* Type of persistence for the group. Available settings function as follows:
* SOURCEIP - Create persistence sessions based on the client IP.
* COOKIEINSERT - Create persistence sessions based on a cookie in client requests. The cookie is inserted by a Set-Cookie directive from the server, in its first response to a client.
* RULE - Create persistence sessions based on a user defined rule.
* NONE - Disable persistence for the group.<br> Possible values = SOURCEIP, COOKIEINSERT, RULE, NONE
	* </pre>
	*/
	public String get_persistencetype() throws Exception {
		return this.persistencetype;
	}

	/**
	* <pre>
	* Type of backup persistence for the group.<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public void set_persistencebackup(String persistencebackup) throws Exception{
		this.persistencebackup = persistencebackup;
	}

	/**
	* <pre>
	* Type of backup persistence for the group.<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public String get_persistencebackup() throws Exception {
		return this.persistencebackup;
	}

	/**
	* <pre>
	* Time period, in minutes, for which backup persistence is in effect.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backuppersistencetimeout(long backuppersistencetimeout) throws Exception {
		this.backuppersistencetimeout = new Long(backuppersistencetimeout);
	}

	/**
	* <pre>
	* Time period, in minutes, for which backup persistence is in effect.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backuppersistencetimeout(Long backuppersistencetimeout) throws Exception{
		this.backuppersistencetimeout = backuppersistencetimeout;
	}

	/**
	* <pre>
	* Time period, in minutes, for which backup persistence is in effect.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_backuppersistencetimeout() throws Exception {
		return this.backuppersistencetimeout;
	}

	/**
	* <pre>
	* Persistence mask to apply to source IPv4 addresses when creating source IP based persistence sessions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_persistmask(String persistmask) throws Exception{
		this.persistmask = persistmask;
	}

	/**
	* <pre>
	* Persistence mask to apply to source IPv4 addresses when creating source IP based persistence sessions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_persistmask() throws Exception {
		return this.persistmask;
	}

	/**
	* <pre>
	* Use this parameter to specify the cookie name for COOKIE peristence type. It specifies the name of cookie with a maximum of 32 characters. If not specified, cookie name is internally generated.
	* </pre>
	*/
	public void set_cookiename(String cookiename) throws Exception{
		this.cookiename = cookiename;
	}

	/**
	* <pre>
	* Use this parameter to specify the cookie name for COOKIE peristence type. It specifies the name of cookie with a maximum of 32 characters. If not specified, cookie name is internally generated.
	* </pre>
	*/
	public String get_cookiename() throws Exception {
		return this.cookiename;
	}

	/**
	* <pre>
	* Persistence mask to apply to source IPv6 addresses when creating source IP based persistence sessions.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6persistmasklen(long v6persistmasklen) throws Exception {
		this.v6persistmasklen = new Long(v6persistmasklen);
	}

	/**
	* <pre>
	* Persistence mask to apply to source IPv6 addresses when creating source IP based persistence sessions.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6persistmasklen(Long v6persistmasklen) throws Exception{
		this.v6persistmasklen = v6persistmasklen;
	}

	/**
	* <pre>
	* Persistence mask to apply to source IPv6 addresses when creating source IP based persistence sessions.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public Long get_v6persistmasklen() throws Exception {
		return this.v6persistmasklen;
	}

	/**
	* <pre>
	* Domain attribute for the HTTP cookie.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookiedomain(String cookiedomain) throws Exception{
		this.cookiedomain = cookiedomain;
	}

	/**
	* <pre>
	* Domain attribute for the HTTP cookie.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookiedomain() throws Exception {
		return this.cookiedomain;
	}

	/**
	* <pre>
	* Time period for which a persistence session is in effect.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* Time period for which a persistence session is in effect.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* Time period for which a persistence session is in effect.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic or default syntax.
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'

The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the \ character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.<br> Default value: "None"
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic or default syntax.
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'

The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the \ character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.<br> Default value: "None"
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* New name for the load balancing virtual server group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the load balancing virtual server group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Traffic Domain ID.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbgroup_response result = (lbgroup_response) service.get_payload_formatter().string_to_resource(lbgroup_response.class, response);
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
		return result.lbgroup;
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
	* Use this API to update lbgroup.
	*/
	public static base_response update(nitro_service client, lbgroup resource) throws Exception {
		lbgroup updateresource = new lbgroup();
		updateresource.name = resource.name;
		updateresource.persistencetype = resource.persistencetype;
		updateresource.persistencebackup = resource.persistencebackup;
		updateresource.backuppersistencetimeout = resource.backuppersistencetimeout;
		updateresource.persistmask = resource.persistmask;
		updateresource.cookiename = resource.cookiename;
		updateresource.v6persistmasklen = resource.v6persistmasklen;
		updateresource.cookiedomain = resource.cookiedomain;
		updateresource.timeout = resource.timeout;
		updateresource.rule = resource.rule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update lbgroup resources.
	*/
	public static base_responses update(nitro_service client, lbgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbgroup updateresources[] = new lbgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbgroup();
				updateresources[i].name = resources[i].name;
				updateresources[i].persistencetype = resources[i].persistencetype;
				updateresources[i].persistencebackup = resources[i].persistencebackup;
				updateresources[i].backuppersistencetimeout = resources[i].backuppersistencetimeout;
				updateresources[i].persistmask = resources[i].persistmask;
				updateresources[i].cookiename = resources[i].cookiename;
				updateresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				updateresources[i].cookiedomain = resources[i].cookiedomain;
				updateresources[i].timeout = resources[i].timeout;
				updateresources[i].rule = resources[i].rule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbgroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, lbgroup resource, String[] args) throws Exception{
		lbgroup unsetresource = new lbgroup();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of lbgroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			lbgroup unsetresources[] = new lbgroup[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new lbgroup();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbgroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, lbgroup resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbgroup unsetresources[] = new lbgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new lbgroup();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a lbgroup resource.
	*/
	public static base_response rename(nitro_service client, lbgroup resource, String new_name) throws Exception {
		lbgroup renameresource = new lbgroup();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a lbgroup resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		lbgroup renameresource = new lbgroup();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the lbgroup resources that are configured on netscaler.
	*/
	public static lbgroup[] get(nitro_service service) throws Exception{
		lbgroup obj = new lbgroup();
		lbgroup[] response = (lbgroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lbgroup resources that are configured on netscaler.
	*/
	public static lbgroup[] get(nitro_service service, options option) throws Exception{
		lbgroup obj = new lbgroup();
		lbgroup[] response = (lbgroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch lbgroup resource of given name .
	*/
	public static lbgroup get(nitro_service service, String name) throws Exception{
		lbgroup obj = new lbgroup();
		obj.set_name(name);
		lbgroup response = (lbgroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbgroup resources of given names .
	*/
	public static lbgroup[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			lbgroup response[] = new lbgroup[name.length];
			lbgroup obj[] = new lbgroup[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new lbgroup();
				obj[i].set_name(name[i]);
				response[i] = (lbgroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of lbgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbgroup[] get_filtered(nitro_service service, String filter) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_filter(filter);
		lbgroup[] response = (lbgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbgroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_filter(filter);
		lbgroup[] response = (lbgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbgroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_count(true);
		lbgroup[] response = (lbgroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbgroup[] response = (lbgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbgroup[] response = (lbgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class persistencebackupEnum {
		public static final String SOURCEIP = "SOURCEIP";
		public static final String NONE = "NONE";
	}
	public static class persistencetypeEnum {
		public static final String SOURCEIP = "SOURCEIP";
		public static final String COOKIEINSERT = "COOKIEINSERT";
		public static final String RULE = "RULE";
		public static final String NONE = "NONE";
	}
}
