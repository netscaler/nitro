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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class csaction_response extends base_response
{
	public csaction[] csaction;
}
/**
* Configuration for Content Switching action resource.
*/

public class csaction extends base_resource
{
	private String name;
	private String targetlbvserver;
	private String targetvserverexpr;
	private String comment;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long referencecount;
	private Long undefhits;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the content switching action. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Can be changed after the content switching action is created.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my action” or ‘my action’).
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the content switching action. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Can be changed after the content switching action is created.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my action” or ‘my action’).
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Name of the load balancing virtual server to which the content is switched.
	* </pre>
	*/
	public void set_targetlbvserver(String targetlbvserver) throws Exception{
		this.targetlbvserver = targetlbvserver;
	}

	/**
	* <pre>
	* Name of the load balancing virtual server to which the content is switched.
	* </pre>
	*/
	public String get_targetlbvserver() throws Exception {
		return this.targetlbvserver;
	}

	/**
	* <pre>
	* Information about this content switching action.
	* </pre>
	*/
	public void set_targetvserverexpr(String targetvserverexpr) throws Exception{
		this.targetvserverexpr = targetvserverexpr;
	}

	/**
	* <pre>
	* Information about this content switching action.
	* </pre>
	*/
	public String get_targetvserverexpr() throws Exception {
		return this.targetvserverexpr;
	}

	/**
	* <pre>
	* Comments associated with this cs action.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this cs action.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* New name for the content switching action. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. 
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my name” or ‘my name’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the content switching action. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. 
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my name” or ‘my name’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The number of times the action has been taken.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of references to the action.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* The number of times the action resulted in UNDEF.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
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
		csaction_response result = (csaction_response) service.get_payload_formatter().string_to_resource(csaction_response.class, response);
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
		return result.csaction;
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
	* Use this API to add csaction.
	*/
	public static base_response add(nitro_service client, csaction resource) throws Exception {
		csaction addresource = new csaction();
		addresource.name = resource.name;
		addresource.targetlbvserver = resource.targetlbvserver;
		addresource.targetvserverexpr = resource.targetvserverexpr;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add csaction resources.
	*/
	public static base_responses add(nitro_service client, csaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csaction addresources[] = new csaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new csaction();
				addresources[i].name = resources[i].name;
				addresources[i].targetlbvserver = resources[i].targetlbvserver;
				addresources[i].targetvserverexpr = resources[i].targetvserverexpr;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete csaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		csaction deleteresource = new csaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete csaction.
	*/
	public static base_response delete(nitro_service client, csaction resource) throws Exception {
		csaction deleteresource = new csaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete csaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			csaction deleteresources[] = new csaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new csaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete csaction resources.
	*/
	public static base_responses delete(nitro_service client, csaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csaction deleteresources[] = new csaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new csaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update csaction.
	*/
	public static base_response update(nitro_service client, csaction resource) throws Exception {
		csaction updateresource = new csaction();
		updateresource.name = resource.name;
		updateresource.targetlbvserver = resource.targetlbvserver;
		updateresource.targetvserverexpr = resource.targetvserverexpr;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update csaction resources.
	*/
	public static base_responses update(nitro_service client, csaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csaction updateresources[] = new csaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new csaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].targetlbvserver = resources[i].targetlbvserver;
				updateresources[i].targetvserverexpr = resources[i].targetvserverexpr;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of csaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, csaction resource, String[] args) throws Exception{
		csaction unsetresource = new csaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of csaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			csaction unsetresources[] = new csaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new csaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of csaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, csaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csaction unsetresources[] = new csaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new csaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a csaction resource.
	*/
	public static base_response rename(nitro_service client, csaction resource, String new_name) throws Exception {
		csaction renameresource = new csaction();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a csaction resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		csaction renameresource = new csaction();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the csaction resources that are configured on netscaler.
	*/
	public static csaction[] get(nitro_service service) throws Exception{
		csaction obj = new csaction();
		csaction[] response = (csaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the csaction resources that are configured on netscaler.
	*/
	public static csaction[] get(nitro_service service, options option) throws Exception{
		csaction obj = new csaction();
		csaction[] response = (csaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch csaction resource of given name .
	*/
	public static csaction get(nitro_service service, String name) throws Exception{
		csaction obj = new csaction();
		obj.set_name(name);
		csaction response = (csaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch csaction resources of given names .
	*/
	public static csaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			csaction response[] = new csaction[name.length];
			csaction obj[] = new csaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new csaction();
				obj[i].set_name(name[i]);
				response[i] = (csaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of csaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static csaction[] get_filtered(nitro_service service, String filter) throws Exception{
		csaction obj = new csaction();
		options option = new options();
		option.set_filter(filter);
		csaction[] response = (csaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of csaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static csaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		csaction obj = new csaction();
		options option = new options();
		option.set_filter(filter);
		csaction[] response = (csaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the csaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		csaction obj = new csaction();
		options option = new options();
		option.set_count(true);
		csaction[] response = (csaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of csaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		csaction obj = new csaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csaction[] response = (csaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of csaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		csaction obj = new csaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csaction[] response = (csaction[]) obj.getfiltered(service, option);
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
}
