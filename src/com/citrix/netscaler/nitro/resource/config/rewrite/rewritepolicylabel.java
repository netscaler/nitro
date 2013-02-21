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

package com.citrix.netscaler.nitro.resource.config.rewrite;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rewritepolicylabel_response extends base_response
{
	public rewritepolicylabel[] rewritepolicylabel;
}
/**
* Configuration for rewrite policy label resource.
*/

public class rewritepolicylabel extends base_resource
{
	private String labelname;
	private String transform;
	private String newname;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private Long priority;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private Long flowtype;
	private String description;
	private Boolean isdefault;
	private Long __count;

	/**
	* <pre>
	* Name of the rewrite policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the rewrite policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* The type of transformations allowed by the policies bound to the label.<br> Possible values = http_req, http_res, othertcp_req, othertcp_res, url, text, clientless_vpn_req, clientless_vpn_res, sipudp_req, sipudp_res
	* </pre>
	*/
	public void set_transform(String transform) throws Exception{
		this.transform = transform;
	}

	/**
	* <pre>
	* The type of transformations allowed by the policies bound to the label.<br> Possible values = http_req, http_res, othertcp_req, othertcp_res, url, text, clientless_vpn_req, clientless_vpn_res, sipudp_req, sipudp_res
	* </pre>
	*/
	public String get_transform() throws Exception {
		return this.transform;
	}

	/**
	* <pre>
	* The new name of the rewrite policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the rewrite policylabel.<br> Minimum length =  1
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
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
	}

	/**
	* <pre>
	* Flowtype of the bound rewrite policy.
	* </pre>
	*/
	public Long get_flowtype() throws Exception {
		return this.flowtype;
	}

	/**
	* <pre>
	* Description of the policylabel.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default rewritepolicylabel.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rewritepolicylabel_response result = (rewritepolicylabel_response) service.get_payload_formatter().string_to_resource(rewritepolicylabel_response.class, response);
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
		return result.rewritepolicylabel;
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
	* Use this API to add rewritepolicylabel.
	*/
	public static base_response add(nitro_service client, rewritepolicylabel resource) throws Exception {
		rewritepolicylabel addresource = new rewritepolicylabel();
		addresource.labelname = resource.labelname;
		addresource.transform = resource.transform;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add rewritepolicylabel resources.
	*/
	public static base_responses add(nitro_service client, rewritepolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewritepolicylabel addresources[] = new rewritepolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new rewritepolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].transform = resources[i].transform;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete rewritepolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		rewritepolicylabel deleteresource = new rewritepolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete rewritepolicylabel.
	*/
	public static base_response delete(nitro_service client, rewritepolicylabel resource) throws Exception {
		rewritepolicylabel deleteresource = new rewritepolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete rewritepolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			rewritepolicylabel deleteresources[] = new rewritepolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new rewritepolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete rewritepolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, rewritepolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			rewritepolicylabel deleteresources[] = new rewritepolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new rewritepolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a rewritepolicylabel resource.
	*/
	public static base_response rename(nitro_service client, rewritepolicylabel resource, String new_labelname) throws Exception {
		rewritepolicylabel renameresource = new rewritepolicylabel();
		renameresource.labelname = resource.labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to rename a rewritepolicylabel resource.
	*/
	public static base_response rename(nitro_service client, String labelname, String new_labelname) throws Exception {
		rewritepolicylabel renameresource = new rewritepolicylabel();
		renameresource.labelname = labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to fetch all the rewritepolicylabel resources that are configured on netscaler.
	*/
	public static rewritepolicylabel[] get(nitro_service service) throws Exception{
		rewritepolicylabel obj = new rewritepolicylabel();
		rewritepolicylabel[] response = (rewritepolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the rewritepolicylabel resources that are configured on netscaler.
	*/
	public static rewritepolicylabel[] get(nitro_service service, options option) throws Exception{
		rewritepolicylabel obj = new rewritepolicylabel();
		rewritepolicylabel[] response = (rewritepolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch rewritepolicylabel resource of given name .
	*/
	public static rewritepolicylabel get(nitro_service service, String labelname) throws Exception{
		rewritepolicylabel obj = new rewritepolicylabel();
		obj.set_labelname(labelname);
		rewritepolicylabel response = (rewritepolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch rewritepolicylabel resources of given names .
	*/
	public static rewritepolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			rewritepolicylabel response[] = new rewritepolicylabel[labelname.length];
			rewritepolicylabel obj[] = new rewritepolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new rewritepolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (rewritepolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of rewritepolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static rewritepolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		rewritepolicylabel obj = new rewritepolicylabel();
		options option = new options();
		option.set_filter(filter);
		rewritepolicylabel[] response = (rewritepolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of rewritepolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static rewritepolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rewritepolicylabel obj = new rewritepolicylabel();
		options option = new options();
		option.set_filter(filter);
		rewritepolicylabel[] response = (rewritepolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the rewritepolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		rewritepolicylabel obj = new rewritepolicylabel();
		options option = new options();
		option.set_count(true);
		rewritepolicylabel[] response = (rewritepolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of rewritepolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		rewritepolicylabel obj = new rewritepolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rewritepolicylabel[] response = (rewritepolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of rewritepolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		rewritepolicylabel obj = new rewritepolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		rewritepolicylabel[] response = (rewritepolicylabel[]) obj.getfiltered(service, option);
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
	public static class transformEnum {
		public static final String http_req = "http_req";
		public static final String http_res = "http_res";
		public static final String othertcp_req = "othertcp_req";
		public static final String othertcp_res = "othertcp_res";
		public static final String url = "url";
		public static final String text = "text";
		public static final String clientless_vpn_req = "clientless_vpn_req";
		public static final String clientless_vpn_res = "clientless_vpn_res";
		public static final String sipudp_req = "sipudp_req";
		public static final String sipudp_res = "sipudp_res";
	}
}
