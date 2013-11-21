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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaagroup_response extends base_response
{
	public aaagroup[] aaagroup;
}
/**
* Configuration for AAA group resource.
*/

public class aaagroup extends base_resource
{
	private String groupname;
	private Boolean loggedin;
	private Long __count;

	/**
	* <pre>
	* Name for the group. Must begin with a letter, number, or the underscore character (_), and must consist only of letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore  characters. Cannot be changed after the group is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or
single quotation marks (for example, “my aaa group” or ‘my aaa
	group).<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* Name for the group. Must begin with a letter, number, or the underscore character (_), and must consist only of letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore  characters. Cannot be changed after the group is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or
single quotation marks (for example, “my aaa group” or ‘my aaa
	group).<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* Display only the group members who are currently logged in.
	* </pre>
	*/
	public void set_loggedin(boolean loggedin) throws Exception {
		this.loggedin = new Boolean(loggedin);
	}

	/**
	* <pre>
	* Display only the group members who are currently logged in.
	* </pre>
	*/
	public void set_loggedin(Boolean loggedin) throws Exception{
		this.loggedin = loggedin;
	}

	/**
	* <pre>
	* Display only the group members who are currently logged in.
	* </pre>
	*/
	public Boolean get_loggedin() throws Exception {
		return this.loggedin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaagroup_response result = (aaagroup_response) service.get_payload_formatter().string_to_resource(aaagroup_response.class, response);
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
		return result.aaagroup;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.groupname;
	}

	/**
	* Use this API to add aaagroup.
	*/
	public static base_response add(nitro_service client, aaagroup resource) throws Exception {
		aaagroup addresource = new aaagroup();
		addresource.groupname = resource.groupname;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add aaagroup resources.
	*/
	public static base_responses add(nitro_service client, aaagroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaagroup addresources[] = new aaagroup[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new aaagroup();
				addresources[i].groupname = resources[i].groupname;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaagroup of given name.
	*/
	public static base_response delete(nitro_service client, String groupname) throws Exception {
		aaagroup deleteresource = new aaagroup();
		deleteresource.groupname = groupname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaagroup.
	*/
	public static base_response delete(nitro_service client, aaagroup resource) throws Exception {
		aaagroup deleteresource = new aaagroup();
		deleteresource.groupname = resource.groupname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaagroup resources of given names.
	*/
	public static base_responses delete(nitro_service client, String groupname[]) throws Exception {
		base_responses result = null;
		if (groupname != null && groupname.length > 0) {
			aaagroup deleteresources[] = new aaagroup[groupname.length];
			for (int i=0;i<groupname.length;i++){
				deleteresources[i] = new aaagroup();
				deleteresources[i].groupname = groupname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaagroup resources.
	*/
	public static base_responses delete(nitro_service client, aaagroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaagroup deleteresources[] = new aaagroup[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaagroup();
				deleteresources[i].groupname = resources[i].groupname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the aaagroup resources that are configured on netscaler.
	*/
	public static aaagroup[] get(nitro_service service) throws Exception{
		aaagroup obj = new aaagroup();
		aaagroup[] response = (aaagroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the aaagroup resources that are configured on netscaler.
	*/
	public static aaagroup[] get(nitro_service service, options option) throws Exception{
		aaagroup obj = new aaagroup();
		aaagroup[] response = (aaagroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the aaagroup resources that are configured on netscaler.
	* This uses aaagroup_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static aaagroup[] get(nitro_service service, aaagroup_args args) throws Exception{
		aaagroup obj = new aaagroup();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		aaagroup[] response = (aaagroup[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch aaagroup resource of given name .
	*/
	public static aaagroup get(nitro_service service, String groupname) throws Exception{
		aaagroup obj = new aaagroup();
		obj.set_groupname(groupname);
		aaagroup response = (aaagroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch aaagroup resources of given names .
	*/
	public static aaagroup[] get(nitro_service service, String groupname[]) throws Exception{
		if (groupname !=null && groupname.length>0) {
			aaagroup response[] = new aaagroup[groupname.length];
			aaagroup obj[] = new aaagroup[groupname.length];
			for (int i=0;i<groupname.length;i++) {
				obj[i] = new aaagroup();
				obj[i].set_groupname(groupname[i]);
				response[i] = (aaagroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of aaagroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaagroup[] get_filtered(nitro_service service, String filter) throws Exception{
		aaagroup obj = new aaagroup();
		options option = new options();
		option.set_filter(filter);
		aaagroup[] response = (aaagroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaagroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaagroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaagroup obj = new aaagroup();
		options option = new options();
		option.set_filter(filter);
		aaagroup[] response = (aaagroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the aaagroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		aaagroup obj = new aaagroup();
		options option = new options();
		option.set_count(true);
		aaagroup[] response = (aaagroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of aaagroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		aaagroup obj = new aaagroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaagroup[] response = (aaagroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaagroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaagroup obj = new aaagroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaagroup[] response = (aaagroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
