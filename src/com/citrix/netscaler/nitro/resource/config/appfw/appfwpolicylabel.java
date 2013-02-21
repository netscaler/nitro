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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwpolicylabel_response extends base_response
{
	public appfwpolicylabel[] appfwpolicylabel;
}
/**
* Configuration for application firewall policy label resource.
*/

public class appfwpolicylabel extends base_resource
{
	private String labelname;
	private String policylabeltype;
	private String newname;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private Long priority;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private String description;
	private Long __count;

	/**
	* <pre>
	* Name of the application firewall policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the application firewall policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* The type of transformations allowed by the policies bound to the label.<br> Possible values = http_req
	* </pre>
	*/
	public void set_policylabeltype(String policylabeltype) throws Exception{
		this.policylabeltype = policylabeltype;
	}

	/**
	* <pre>
	* The type of transformations allowed by the policies bound to the label.<br> Possible values = http_req
	* </pre>
	*/
	public String get_policylabeltype() throws Exception {
		return this.policylabeltype;
	}

	/**
	* <pre>
	* The new name of the application firewall policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the application firewall policylabel.<br> Minimum length =  1
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
	* Type of policy label invocation.<br> Possible values = reqvserver, policylabel
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
	* Description of the policylabel.
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
		appfwpolicylabel_response result = (appfwpolicylabel_response) service.get_payload_formatter().string_to_resource(appfwpolicylabel_response.class, response);
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
		return result.appfwpolicylabel;
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
	* Use this API to add appfwpolicylabel.
	*/
	public static base_response add(nitro_service client, appfwpolicylabel resource) throws Exception {
		appfwpolicylabel addresource = new appfwpolicylabel();
		addresource.labelname = resource.labelname;
		addresource.policylabeltype = resource.policylabeltype;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appfwpolicylabel resources.
	*/
	public static base_responses add(nitro_service client, appfwpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwpolicylabel addresources[] = new appfwpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appfwpolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].policylabeltype = resources[i].policylabeltype;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwpolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		appfwpolicylabel deleteresource = new appfwpolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwpolicylabel.
	*/
	public static base_response delete(nitro_service client, appfwpolicylabel resource) throws Exception {
		appfwpolicylabel deleteresource = new appfwpolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwpolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			appfwpolicylabel deleteresources[] = new appfwpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new appfwpolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appfwpolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, appfwpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwpolicylabel deleteresources[] = new appfwpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwpolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a appfwpolicylabel resource.
	*/
	public static base_response rename(nitro_service client, appfwpolicylabel resource, String new_labelname) throws Exception {
		appfwpolicylabel renameresource = new appfwpolicylabel();
		renameresource.labelname = resource.labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to rename a appfwpolicylabel resource.
	*/
	public static base_response rename(nitro_service client, String labelname, String new_labelname) throws Exception {
		appfwpolicylabel renameresource = new appfwpolicylabel();
		renameresource.labelname = labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to fetch all the appfwpolicylabel resources that are configured on netscaler.
	*/
	public static appfwpolicylabel[] get(nitro_service service) throws Exception{
		appfwpolicylabel obj = new appfwpolicylabel();
		appfwpolicylabel[] response = (appfwpolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwpolicylabel resources that are configured on netscaler.
	*/
	public static appfwpolicylabel[] get(nitro_service service, options option) throws Exception{
		appfwpolicylabel obj = new appfwpolicylabel();
		appfwpolicylabel[] response = (appfwpolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appfwpolicylabel resource of given name .
	*/
	public static appfwpolicylabel get(nitro_service service, String labelname) throws Exception{
		appfwpolicylabel obj = new appfwpolicylabel();
		obj.set_labelname(labelname);
		appfwpolicylabel response = (appfwpolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appfwpolicylabel resources of given names .
	*/
	public static appfwpolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			appfwpolicylabel response[] = new appfwpolicylabel[labelname.length];
			appfwpolicylabel obj[] = new appfwpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new appfwpolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (appfwpolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appfwpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwpolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwpolicylabel obj = new appfwpolicylabel();
		options option = new options();
		option.set_filter(filter);
		appfwpolicylabel[] response = (appfwpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwpolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwpolicylabel obj = new appfwpolicylabel();
		options option = new options();
		option.set_filter(filter);
		appfwpolicylabel[] response = (appfwpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwpolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwpolicylabel obj = new appfwpolicylabel();
		options option = new options();
		option.set_count(true);
		appfwpolicylabel[] response = (appfwpolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwpolicylabel obj = new appfwpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwpolicylabel[] response = (appfwpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwpolicylabel obj = new appfwpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwpolicylabel[] response = (appfwpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class policylabeltypeEnum {
		public static final String http_req = "http_req";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String policylabel = "policylabel";
	}
}
