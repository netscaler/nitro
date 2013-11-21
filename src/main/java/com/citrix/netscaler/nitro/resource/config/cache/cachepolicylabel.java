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

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cachepolicylabel_response extends base_response
{
	public cachepolicylabel[] cachepolicylabel;
}
/**
* Configuration for cache policy label resource.
*/

public class cachepolicylabel extends base_resource
{
	private String labelname;
	private String evaluates;
	private String newname;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private Long priority;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private Long flowtype;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the label. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the label is created.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name for the label. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the label is created.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* When to evaluate policies bound to this label: request-time or response-time.<br> Possible values = REQ, RES, MSSQL_REQ, MSSQL_RES, MYSQL_REQ, MYSQL_RES
	* </pre>
	*/
	public void set_evaluates(String evaluates) throws Exception{
		this.evaluates = evaluates;
	}

	/**
	* <pre>
	* When to evaluate policies bound to this label: request-time or response-time.<br> Possible values = REQ, RES, MSSQL_REQ, MSSQL_RES, MYSQL_REQ, MYSQL_RES
	* </pre>
	*/
	public String get_evaluates() throws Exception {
		return this.evaluates;
	}

	/**
	* <pre>
	* New name for the cache-policy label. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the cache-policy label. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Number of polices bound to label.
	* </pre>
	*/
	public Long get_numpol() throws Exception {
		return this.numpol;
	}

	/**
	* <pre>
	* Number of times policy label was invoked.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
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
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Type of policy label to invoke: an unnamed label associated with a virtual server, or user-defined policy label.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the policy label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
	}

	/**
	* <pre>
	* Flowtype of the bound cache policy.
	* </pre>
	*/
	public Long get_flowtype() throws Exception {
		return this.flowtype;
	}

	/**
	* <pre>
	* .<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		cachepolicylabel_response result = (cachepolicylabel_response) service.get_payload_formatter().string_to_resource(cachepolicylabel_response.class, response);
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
		return result.cachepolicylabel;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to add cachepolicylabel.
	*/
	public static base_response add(nitro_service client, cachepolicylabel resource) throws Exception {
		cachepolicylabel addresource = new cachepolicylabel();
		addresource.labelname = resource.labelname;
		addresource.evaluates = resource.evaluates;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cachepolicylabel resources.
	*/
	public static base_responses add(nitro_service client, cachepolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachepolicylabel addresources[] = new cachepolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cachepolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].evaluates = resources[i].evaluates;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cachepolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		cachepolicylabel deleteresource = new cachepolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cachepolicylabel.
	*/
	public static base_response delete(nitro_service client, cachepolicylabel resource) throws Exception {
		cachepolicylabel deleteresource = new cachepolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cachepolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			cachepolicylabel deleteresources[] = new cachepolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new cachepolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cachepolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, cachepolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cachepolicylabel deleteresources[] = new cachepolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cachepolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a cachepolicylabel resource.
	*/
	public static base_response rename(nitro_service client, cachepolicylabel resource, String new_labelname) throws Exception {
		cachepolicylabel renameresource = new cachepolicylabel();
		renameresource.labelname = resource.labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to rename a cachepolicylabel resource.
	*/
	public static base_response rename(nitro_service client, String labelname, String new_labelname) throws Exception {
		cachepolicylabel renameresource = new cachepolicylabel();
		renameresource.labelname = labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to fetch all the cachepolicylabel resources that are configured on netscaler.
	*/
	public static cachepolicylabel[] get(nitro_service service) throws Exception{
		cachepolicylabel obj = new cachepolicylabel();
		cachepolicylabel[] response = (cachepolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cachepolicylabel resources that are configured on netscaler.
	*/
	public static cachepolicylabel[] get(nitro_service service, options option) throws Exception{
		cachepolicylabel obj = new cachepolicylabel();
		cachepolicylabel[] response = (cachepolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cachepolicylabel resource of given name .
	*/
	public static cachepolicylabel get(nitro_service service, String labelname) throws Exception{
		cachepolicylabel obj = new cachepolicylabel();
		obj.set_labelname(labelname);
		cachepolicylabel response = (cachepolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cachepolicylabel resources of given names .
	*/
	public static cachepolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			cachepolicylabel response[] = new cachepolicylabel[labelname.length];
			cachepolicylabel obj[] = new cachepolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new cachepolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (cachepolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cachepolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cachepolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		cachepolicylabel obj = new cachepolicylabel();
		options option = new options();
		option.set_filter(filter);
		cachepolicylabel[] response = (cachepolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cachepolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cachepolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cachepolicylabel obj = new cachepolicylabel();
		options option = new options();
		option.set_filter(filter);
		cachepolicylabel[] response = (cachepolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cachepolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cachepolicylabel obj = new cachepolicylabel();
		options option = new options();
		option.set_count(true);
		cachepolicylabel[] response = (cachepolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cachepolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cachepolicylabel obj = new cachepolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cachepolicylabel[] response = (cachepolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cachepolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cachepolicylabel obj = new cachepolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cachepolicylabel[] response = (cachepolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}
	public static class evaluatesEnum {
		public static final String REQ = "REQ";
		public static final String RES = "RES";
		public static final String MSSQL_REQ = "MSSQL_REQ";
		public static final String MSSQL_RES = "MSSQL_RES";
		public static final String MYSQL_REQ = "MYSQL_REQ";
		public static final String MYSQL_RES = "MYSQL_RES";
	}
}
