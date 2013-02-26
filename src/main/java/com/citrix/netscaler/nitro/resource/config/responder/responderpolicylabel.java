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

package com.citrix.netscaler.nitro.resource.config.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderpolicylabel_response extends base_response
{
	public responderpolicylabel[] responderpolicylabel;
}
/**
* Configuration for responder policy label resource.
*/

public class responderpolicylabel extends base_resource
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
	private Long __count;

	/**
	* <pre>
	* Name of the responder policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the responder policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* The type of the policy label. Default value is HTTP.<br> Default value: NS_PLTMAP_RSP_REQ<br> Possible values = HTTP, OTHERTCP, SIP_UDP, MYSQL, MSSQL
	* </pre>
	*/
	public void set_policylabeltype(String policylabeltype) throws Exception{
		this.policylabeltype = policylabeltype;
	}

	/**
	* <pre>
	* The type of the policy label. Default value is HTTP.<br> Default value: NS_PLTMAP_RSP_REQ<br> Possible values = HTTP, OTHERTCP, SIP_UDP, MYSQL, MSSQL
	* </pre>
	*/
	public String get_policylabeltype() throws Exception {
		return this.policylabeltype;
	}

	/**
	* <pre>
	* The new name of the responder policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the responder policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* number of polices bound to label.
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
	* Type of policy label invocation.<br> Possible values = vserver, policylabel
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		responderpolicylabel_response result = (responderpolicylabel_response) service.get_payload_formatter().string_to_resource(responderpolicylabel_response.class, response);
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
		return result.responderpolicylabel;
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
	* Use this API to add responderpolicylabel.
	*/
	public static base_response add(nitro_service client, responderpolicylabel resource) throws Exception {
		responderpolicylabel addresource = new responderpolicylabel();
		addresource.labelname = resource.labelname;
		addresource.policylabeltype = resource.policylabeltype;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add responderpolicylabel resources.
	*/
	public static base_responses add(nitro_service client, responderpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderpolicylabel addresources[] = new responderpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new responderpolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].policylabeltype = resources[i].policylabeltype;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete responderpolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		responderpolicylabel deleteresource = new responderpolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete responderpolicylabel.
	*/
	public static base_response delete(nitro_service client, responderpolicylabel resource) throws Exception {
		responderpolicylabel deleteresource = new responderpolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete responderpolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			responderpolicylabel deleteresources[] = new responderpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new responderpolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete responderpolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, responderpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderpolicylabel deleteresources[] = new responderpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new responderpolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a responderpolicylabel resource.
	*/
	public static base_response rename(nitro_service client, responderpolicylabel resource, String new_labelname) throws Exception {
		responderpolicylabel renameresource = new responderpolicylabel();
		renameresource.labelname = resource.labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to rename a responderpolicylabel resource.
	*/
	public static base_response rename(nitro_service client, String labelname, String new_labelname) throws Exception {
		responderpolicylabel renameresource = new responderpolicylabel();
		renameresource.labelname = labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to fetch all the responderpolicylabel resources that are configured on netscaler.
	*/
	public static responderpolicylabel[] get(nitro_service service) throws Exception{
		responderpolicylabel obj = new responderpolicylabel();
		responderpolicylabel[] response = (responderpolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the responderpolicylabel resources that are configured on netscaler.
	*/
	public static responderpolicylabel[] get(nitro_service service, options option) throws Exception{
		responderpolicylabel obj = new responderpolicylabel();
		responderpolicylabel[] response = (responderpolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch responderpolicylabel resource of given name .
	*/
	public static responderpolicylabel get(nitro_service service, String labelname) throws Exception{
		responderpolicylabel obj = new responderpolicylabel();
		obj.set_labelname(labelname);
		responderpolicylabel response = (responderpolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch responderpolicylabel resources of given names .
	*/
	public static responderpolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			responderpolicylabel response[] = new responderpolicylabel[labelname.length];
			responderpolicylabel obj[] = new responderpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new responderpolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (responderpolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of responderpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static responderpolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		responderpolicylabel obj = new responderpolicylabel();
		options option = new options();
		option.set_filter(filter);
		responderpolicylabel[] response = (responderpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of responderpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static responderpolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		responderpolicylabel obj = new responderpolicylabel();
		options option = new options();
		option.set_filter(filter);
		responderpolicylabel[] response = (responderpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the responderpolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		responderpolicylabel obj = new responderpolicylabel();
		options option = new options();
		option.set_count(true);
		responderpolicylabel[] response = (responderpolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of responderpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		responderpolicylabel obj = new responderpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		responderpolicylabel[] response = (responderpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of responderpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		responderpolicylabel obj = new responderpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		responderpolicylabel[] response = (responderpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class policylabeltypeEnum {
		public static final String HTTP = "HTTP";
		public static final String OTHERTCP = "OTHERTCP";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
	}
	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String policylabel = "policylabel";
	}
}
