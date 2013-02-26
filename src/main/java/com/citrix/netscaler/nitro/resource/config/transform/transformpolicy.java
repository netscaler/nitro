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

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformpolicy_response extends base_response
{
	public transformpolicy[] transformpolicy;
}
/**
* Configuration for URL Transformation policy resource.
*/

public class transformpolicy extends base_resource
{
	private String name;
	private String rule;
	private String profilename;
	private String comment;
	private String logaction;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Boolean isdefault;
	private Long __count;

	/**
	* <pre>
	* URL Transformation policy name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* URL Transformation policy name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule associated with the policy.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule associated with the policy.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* URL Transformation profile name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* URL Transformation profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Comments associated with this transform policy.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this transform policy.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The log action associated with the transform policy.
	* </pre>
	*/
	public void set_logaction(String logaction) throws Exception{
		this.logaction = logaction;
	}

	/**
	* <pre>
	* The log action associated with the transform policy.
	* </pre>
	*/
	public String get_logaction() throws Exception {
		return this.logaction;
	}

	/**
	* <pre>
	* The new name of the transform policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the transform policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default transform policy.
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
		transformpolicy_response result = (transformpolicy_response) service.get_payload_formatter().string_to_resource(transformpolicy_response.class, response);
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
		return result.transformpolicy;
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
	* Use this API to add transformpolicy.
	*/
	public static base_response add(nitro_service client, transformpolicy resource) throws Exception {
		transformpolicy addresource = new transformpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.profilename = resource.profilename;
		addresource.comment = resource.comment;
		addresource.logaction = resource.logaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add transformpolicy resources.
	*/
	public static base_responses add(nitro_service client, transformpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformpolicy addresources[] = new transformpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new transformpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].profilename = resources[i].profilename;
				addresources[i].comment = resources[i].comment;
				addresources[i].logaction = resources[i].logaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete transformpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		transformpolicy deleteresource = new transformpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete transformpolicy.
	*/
	public static base_response delete(nitro_service client, transformpolicy resource) throws Exception {
		transformpolicy deleteresource = new transformpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete transformpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			transformpolicy deleteresources[] = new transformpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new transformpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete transformpolicy resources.
	*/
	public static base_responses delete(nitro_service client, transformpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformpolicy deleteresources[] = new transformpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new transformpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update transformpolicy.
	*/
	public static base_response update(nitro_service client, transformpolicy resource) throws Exception {
		transformpolicy updateresource = new transformpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.profilename = resource.profilename;
		updateresource.comment = resource.comment;
		updateresource.logaction = resource.logaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update transformpolicy resources.
	*/
	public static base_responses update(nitro_service client, transformpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformpolicy updateresources[] = new transformpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new transformpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].profilename = resources[i].profilename;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].logaction = resources[i].logaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of transformpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		transformpolicy unsetresource = new transformpolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of transformpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, transformpolicy resource, String[] args) throws Exception{
		transformpolicy unsetresource = new transformpolicy();
		unsetresource.name = resource.name;
		unsetresource.comment = resource.comment;
		unsetresource.logaction = resource.logaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of transformpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			transformpolicy unsetresources[] = new transformpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new transformpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of transformpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, transformpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformpolicy unsetresources[] = new transformpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new transformpolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].logaction = resources[i].logaction;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a transformpolicy resource.
	*/
	public static base_response rename(nitro_service client, transformpolicy resource, String new_name) throws Exception {
		transformpolicy renameresource = new transformpolicy();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a transformpolicy resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		transformpolicy renameresource = new transformpolicy();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the transformpolicy resources that are configured on netscaler.
	*/
	public static transformpolicy[] get(nitro_service service) throws Exception{
		transformpolicy obj = new transformpolicy();
		transformpolicy[] response = (transformpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the transformpolicy resources that are configured on netscaler.
	*/
	public static transformpolicy[] get(nitro_service service, options option) throws Exception{
		transformpolicy obj = new transformpolicy();
		transformpolicy[] response = (transformpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch transformpolicy resource of given name .
	*/
	public static transformpolicy get(nitro_service service, String name) throws Exception{
		transformpolicy obj = new transformpolicy();
		obj.set_name(name);
		transformpolicy response = (transformpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch transformpolicy resources of given names .
	*/
	public static transformpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			transformpolicy response[] = new transformpolicy[name.length];
			transformpolicy obj[] = new transformpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new transformpolicy();
				obj[i].set_name(name[i]);
				response[i] = (transformpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of transformpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static transformpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		transformpolicy obj = new transformpolicy();
		options option = new options();
		option.set_filter(filter);
		transformpolicy[] response = (transformpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of transformpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static transformpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		transformpolicy obj = new transformpolicy();
		options option = new options();
		option.set_filter(filter);
		transformpolicy[] response = (transformpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the transformpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		transformpolicy obj = new transformpolicy();
		options option = new options();
		option.set_count(true);
		transformpolicy[] response = (transformpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of transformpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		transformpolicy obj = new transformpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformpolicy[] response = (transformpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of transformpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		transformpolicy obj = new transformpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformpolicy[] response = (transformpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
