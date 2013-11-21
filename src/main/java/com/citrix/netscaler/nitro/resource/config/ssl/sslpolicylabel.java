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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslpolicylabel_response extends base_response
{
	public sslpolicylabel[] sslpolicylabel;
}
/**
* Configuration for SSL policy label resource.
*/

public class sslpolicylabel extends base_resource
{
	private String labelname;
	private String type;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private Boolean invoke;
	private String labeltype;
	private String invoke_labelname;
	private Long flowtype;
	private String description;
	private Long __count;

	/**
	* <pre>
	* Name for the SSL policy label.  Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the policy label is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my label" or 'my label').
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name for the SSL policy label.  Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the policy label is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my label" or 'my label').
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Type of policies that the policy label can contain.<br> Possible values = CONTROL, DATA
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of policies that the policy label can contain.<br> Possible values = CONTROL, DATA
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
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
	* Name of the SSL policy to bind to the policy label.
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
	* Invoke flag.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = vserver, service, policylabel
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
	* Flowtype of the bound SSL policy.
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
		sslpolicylabel_response result = (sslpolicylabel_response) service.get_payload_formatter().string_to_resource(sslpolicylabel_response.class, response);
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
		return result.sslpolicylabel;
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
	* Use this API to add sslpolicylabel.
	*/
	public static base_response add(nitro_service client, sslpolicylabel resource) throws Exception {
		sslpolicylabel addresource = new sslpolicylabel();
		addresource.labelname = resource.labelname;
		addresource.type = resource.type;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add sslpolicylabel resources.
	*/
	public static base_responses add(nitro_service client, sslpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslpolicylabel addresources[] = new sslpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new sslpolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].type = resources[i].type;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslpolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		sslpolicylabel deleteresource = new sslpolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslpolicylabel.
	*/
	public static base_response delete(nitro_service client, sslpolicylabel resource) throws Exception {
		sslpolicylabel deleteresource = new sslpolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslpolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			sslpolicylabel deleteresources[] = new sslpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new sslpolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslpolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, sslpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslpolicylabel deleteresources[] = new sslpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslpolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslpolicylabel resources that are configured on netscaler.
	*/
	public static sslpolicylabel[] get(nitro_service service) throws Exception{
		sslpolicylabel obj = new sslpolicylabel();
		sslpolicylabel[] response = (sslpolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslpolicylabel resources that are configured on netscaler.
	*/
	public static sslpolicylabel[] get(nitro_service service, options option) throws Exception{
		sslpolicylabel obj = new sslpolicylabel();
		sslpolicylabel[] response = (sslpolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslpolicylabel resource of given name .
	*/
	public static sslpolicylabel get(nitro_service service, String labelname) throws Exception{
		sslpolicylabel obj = new sslpolicylabel();
		obj.set_labelname(labelname);
		sslpolicylabel response = (sslpolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslpolicylabel resources of given names .
	*/
	public static sslpolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			sslpolicylabel response[] = new sslpolicylabel[labelname.length];
			sslpolicylabel obj[] = new sslpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new sslpolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (sslpolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslpolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		sslpolicylabel obj = new sslpolicylabel();
		options option = new options();
		option.set_filter(filter);
		sslpolicylabel[] response = (sslpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslpolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslpolicylabel obj = new sslpolicylabel();
		options option = new options();
		option.set_filter(filter);
		sslpolicylabel[] response = (sslpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslpolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslpolicylabel obj = new sslpolicylabel();
		options option = new options();
		option.set_count(true);
		sslpolicylabel[] response = (sslpolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslpolicylabel obj = new sslpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslpolicylabel[] response = (sslpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslpolicylabel obj = new sslpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslpolicylabel[] response = (sslpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String CONTROL = "CONTROL";
		public static final String DATA = "DATA";
	}
	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String service = "service";
		public static final String policylabel = "policylabel";
	}
}
