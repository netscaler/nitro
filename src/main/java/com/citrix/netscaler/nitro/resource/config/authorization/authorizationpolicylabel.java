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

package com.citrix.netscaler.nitro.resource.config.authorization;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authorizationpolicylabel_response extends base_response
{
	public authorizationpolicylabel[] authorizationpolicylabel;
}
/**
* Configuration for authorization policy label resource.
*/

public class authorizationpolicylabel extends base_resource
{
	private String labelname;
	private String newname;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private Long flowtype;
	private String description;
	private Long __count;

	/**
	* <pre>
	* Name for the new authorization policy label. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the authorization policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authorization policy label” or ‘authorization policy label’).
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name for the new authorization policy label. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the authorization policy is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authorization policy label” or ‘authorization policy label’).
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* The new name of the auth policy label.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the auth policy label.<br> Minimum length =  1
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
	* Name of the authorization policy to bind to the policy label.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
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
	* Type of invocation. Available settings function as follows:
* reqvserver - Send the request to the specified request virtual server.
* resvserver - Send the response to the specified response virtual server.
* policylabel - Invoke the specified policy label.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the policy label to invoke if the current policy evaluates to TRUE, the invoke parameter is set, and Label Type is set to Policy Label.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
	}

	/**
	* <pre>
	* Flowtype of the bound authorization policy.
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authorizationpolicylabel_response result = (authorizationpolicylabel_response) service.get_payload_formatter().string_to_resource(authorizationpolicylabel_response.class, response);
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
		return result.authorizationpolicylabel;
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
	* Use this API to add authorizationpolicylabel.
	*/
	public static base_response add(nitro_service client, authorizationpolicylabel resource) throws Exception {
		authorizationpolicylabel addresource = new authorizationpolicylabel();
		addresource.labelname = resource.labelname;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authorizationpolicylabel resources.
	*/
	public static base_responses add(nitro_service client, authorizationpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authorizationpolicylabel addresources[] = new authorizationpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authorizationpolicylabel();
				addresources[i].labelname = resources[i].labelname;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authorizationpolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		authorizationpolicylabel deleteresource = new authorizationpolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authorizationpolicylabel.
	*/
	public static base_response delete(nitro_service client, authorizationpolicylabel resource) throws Exception {
		authorizationpolicylabel deleteresource = new authorizationpolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authorizationpolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			authorizationpolicylabel deleteresources[] = new authorizationpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new authorizationpolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authorizationpolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, authorizationpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authorizationpolicylabel deleteresources[] = new authorizationpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authorizationpolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a authorizationpolicylabel resource.
	*/
	public static base_response rename(nitro_service client, authorizationpolicylabel resource, String new_labelname) throws Exception {
		authorizationpolicylabel renameresource = new authorizationpolicylabel();
		renameresource.labelname = resource.labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to rename a authorizationpolicylabel resource.
	*/
	public static base_response rename(nitro_service client, String labelname, String new_labelname) throws Exception {
		authorizationpolicylabel renameresource = new authorizationpolicylabel();
		renameresource.labelname = labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to fetch all the authorizationpolicylabel resources that are configured on netscaler.
	*/
	public static authorizationpolicylabel[] get(nitro_service service) throws Exception{
		authorizationpolicylabel obj = new authorizationpolicylabel();
		authorizationpolicylabel[] response = (authorizationpolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authorizationpolicylabel resources that are configured on netscaler.
	*/
	public static authorizationpolicylabel[] get(nitro_service service, options option) throws Exception{
		authorizationpolicylabel obj = new authorizationpolicylabel();
		authorizationpolicylabel[] response = (authorizationpolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authorizationpolicylabel resource of given name .
	*/
	public static authorizationpolicylabel get(nitro_service service, String labelname) throws Exception{
		authorizationpolicylabel obj = new authorizationpolicylabel();
		obj.set_labelname(labelname);
		authorizationpolicylabel response = (authorizationpolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authorizationpolicylabel resources of given names .
	*/
	public static authorizationpolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			authorizationpolicylabel response[] = new authorizationpolicylabel[labelname.length];
			authorizationpolicylabel obj[] = new authorizationpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new authorizationpolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (authorizationpolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authorizationpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authorizationpolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		authorizationpolicylabel obj = new authorizationpolicylabel();
		options option = new options();
		option.set_filter(filter);
		authorizationpolicylabel[] response = (authorizationpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authorizationpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authorizationpolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authorizationpolicylabel obj = new authorizationpolicylabel();
		options option = new options();
		option.set_filter(filter);
		authorizationpolicylabel[] response = (authorizationpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authorizationpolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authorizationpolicylabel obj = new authorizationpolicylabel();
		options option = new options();
		option.set_count(true);
		authorizationpolicylabel[] response = (authorizationpolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authorizationpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authorizationpolicylabel obj = new authorizationpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authorizationpolicylabel[] response = (authorizationpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authorizationpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authorizationpolicylabel obj = new authorizationpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authorizationpolicylabel[] response = (authorizationpolicylabel[]) obj.getfiltered(service, option);
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
