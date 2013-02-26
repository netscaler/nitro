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

class transformaction_response extends base_response
{
	public transformaction[] transformaction;
}
/**
* Configuration for transform action resource.
*/

public class transformaction extends base_resource
{
	private String name;
	private String profilename;
	private Long priority;
	private String state;
	private String requrlfrom;
	private String requrlinto;
	private String resurlfrom;
	private String resurlinto;
	private String cookiedomainfrom;
	private String cookiedomaininto;
	private String comment;

	//------- Read only Parameter ---------;

	private String continuematching;
	private Long __count;

	/**
	* <pre>
	* URL Transformation action name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* URL Transformation action name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
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
	* Priority of the Action within the Profile.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority of the Action within the Profile.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority of the Action within the Profile.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Enabled flag.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enabled flag.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Pattern of original request URLs. It corresponds to the way external users view the server, and acts as a source for request transformations.<br> Minimum length =  1
	* </pre>
	*/
	public void set_requrlfrom(String requrlfrom) throws Exception{
		this.requrlfrom = requrlfrom;
	}

	/**
	* <pre>
	* Pattern of original request URLs. It corresponds to the way external users view the server, and acts as a source for request transformations.<br> Minimum length =  1
	* </pre>
	*/
	public String get_requrlfrom() throws Exception {
		return this.requrlfrom;
	}

	/**
	* <pre>
	* Pattern of transformed request URLs. It corresponds to internal addresses and indicates how they are created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_requrlinto(String requrlinto) throws Exception{
		this.requrlinto = requrlinto;
	}

	/**
	* <pre>
	* Pattern of transformed request URLs. It corresponds to internal addresses and indicates how they are created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_requrlinto() throws Exception {
		return this.requrlinto;
	}

	/**
	* <pre>
	* Pattern of original response URLs. It corresponds to the way external users view the server, and acts as a source for response transformations.<br> Minimum length =  1
	* </pre>
	*/
	public void set_resurlfrom(String resurlfrom) throws Exception{
		this.resurlfrom = resurlfrom;
	}

	/**
	* <pre>
	* Pattern of original response URLs. It corresponds to the way external users view the server, and acts as a source for response transformations.<br> Minimum length =  1
	* </pre>
	*/
	public String get_resurlfrom() throws Exception {
		return this.resurlfrom;
	}

	/**
	* <pre>
	* Pattern of transformed response URLs. It corresponds to internal addresses and indicates how they are created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_resurlinto(String resurlinto) throws Exception{
		this.resurlinto = resurlinto;
	}

	/**
	* <pre>
	* Pattern of transformed response URLs. It corresponds to internal addresses and indicates how they are created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_resurlinto() throws Exception {
		return this.resurlinto;
	}

	/**
	* <pre>
	* Pattern of the original domain in Set-Cookie headers.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookiedomainfrom(String cookiedomainfrom) throws Exception{
		this.cookiedomainfrom = cookiedomainfrom;
	}

	/**
	* <pre>
	* Pattern of the original domain in Set-Cookie headers.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookiedomainfrom() throws Exception {
		return this.cookiedomainfrom;
	}

	/**
	* <pre>
	* Pattern of the transformed domain in Set-Cookie headers.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookiedomaininto(String cookiedomaininto) throws Exception{
		this.cookiedomaininto = cookiedomaininto;
	}

	/**
	* <pre>
	* Pattern of the transformed domain in Set-Cookie headers.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookiedomaininto() throws Exception {
		return this.cookiedomaininto;
	}

	/**
	* <pre>
	* Comments.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Continue transforming using the next rule in the list.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_continuematching() throws Exception {
		return this.continuematching;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformaction_response result = (transformaction_response) service.get_payload_formatter().string_to_resource(transformaction_response.class, response);
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
		return result.transformaction;
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
	* Use this API to add transformaction.
	*/
	public static base_response add(nitro_service client, transformaction resource) throws Exception {
		transformaction addresource = new transformaction();
		addresource.name = resource.name;
		addresource.profilename = resource.profilename;
		addresource.priority = resource.priority;
		addresource.state = resource.state;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add transformaction resources.
	*/
	public static base_responses add(nitro_service client, transformaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformaction addresources[] = new transformaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new transformaction();
				addresources[i].name = resources[i].name;
				addresources[i].profilename = resources[i].profilename;
				addresources[i].priority = resources[i].priority;
				addresources[i].state = resources[i].state;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete transformaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		transformaction deleteresource = new transformaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete transformaction.
	*/
	public static base_response delete(nitro_service client, transformaction resource) throws Exception {
		transformaction deleteresource = new transformaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete transformaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			transformaction deleteresources[] = new transformaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new transformaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete transformaction resources.
	*/
	public static base_responses delete(nitro_service client, transformaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformaction deleteresources[] = new transformaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new transformaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update transformaction.
	*/
	public static base_response update(nitro_service client, transformaction resource) throws Exception {
		transformaction updateresource = new transformaction();
		updateresource.name = resource.name;
		updateresource.priority = resource.priority;
		updateresource.requrlfrom = resource.requrlfrom;
		updateresource.requrlinto = resource.requrlinto;
		updateresource.resurlfrom = resource.resurlfrom;
		updateresource.resurlinto = resource.resurlinto;
		updateresource.cookiedomainfrom = resource.cookiedomainfrom;
		updateresource.cookiedomaininto = resource.cookiedomaininto;
		updateresource.state = resource.state;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update transformaction resources.
	*/
	public static base_responses update(nitro_service client, transformaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformaction updateresources[] = new transformaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new transformaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].requrlfrom = resources[i].requrlfrom;
				updateresources[i].requrlinto = resources[i].requrlinto;
				updateresources[i].resurlfrom = resources[i].resurlfrom;
				updateresources[i].resurlinto = resources[i].resurlinto;
				updateresources[i].cookiedomainfrom = resources[i].cookiedomainfrom;
				updateresources[i].cookiedomaininto = resources[i].cookiedomaininto;
				updateresources[i].state = resources[i].state;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of transformaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		transformaction unsetresource = new transformaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of transformaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, transformaction resource, String[] args) throws Exception{
		transformaction unsetresource = new transformaction();
		unsetresource.name = resource.name;
		unsetresource.priority = resource.priority;
		unsetresource.requrlfrom = resource.requrlfrom;
		unsetresource.requrlinto = resource.requrlinto;
		unsetresource.resurlfrom = resource.resurlfrom;
		unsetresource.resurlinto = resource.resurlinto;
		unsetresource.cookiedomainfrom = resource.cookiedomainfrom;
		unsetresource.cookiedomaininto = resource.cookiedomaininto;
		unsetresource.state = resource.state;
		unsetresource.comment = resource.comment;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of transformaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			transformaction unsetresources[] = new transformaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new transformaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of transformaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, transformaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			transformaction unsetresources[] = new transformaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new transformaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].priority = resources[i].priority;
				unsetresources[i].requrlfrom = resources[i].requrlfrom;
				unsetresources[i].requrlinto = resources[i].requrlinto;
				unsetresources[i].resurlfrom = resources[i].resurlfrom;
				unsetresources[i].resurlinto = resources[i].resurlinto;
				unsetresources[i].cookiedomainfrom = resources[i].cookiedomainfrom;
				unsetresources[i].cookiedomaininto = resources[i].cookiedomaininto;
				unsetresources[i].state = resources[i].state;
				unsetresources[i].comment = resources[i].comment;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the transformaction resources that are configured on netscaler.
	*/
	public static transformaction[] get(nitro_service service) throws Exception{
		transformaction obj = new transformaction();
		transformaction[] response = (transformaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the transformaction resources that are configured on netscaler.
	*/
	public static transformaction[] get(nitro_service service, options option) throws Exception{
		transformaction obj = new transformaction();
		transformaction[] response = (transformaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch transformaction resource of given name .
	*/
	public static transformaction get(nitro_service service, String name) throws Exception{
		transformaction obj = new transformaction();
		obj.set_name(name);
		transformaction response = (transformaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch transformaction resources of given names .
	*/
	public static transformaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			transformaction response[] = new transformaction[name.length];
			transformaction obj[] = new transformaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new transformaction();
				obj[i].set_name(name[i]);
				response[i] = (transformaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of transformaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static transformaction[] get_filtered(nitro_service service, String filter) throws Exception{
		transformaction obj = new transformaction();
		options option = new options();
		option.set_filter(filter);
		transformaction[] response = (transformaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of transformaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static transformaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		transformaction obj = new transformaction();
		options option = new options();
		option.set_filter(filter);
		transformaction[] response = (transformaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the transformaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		transformaction obj = new transformaction();
		options option = new options();
		option.set_count(true);
		transformaction[] response = (transformaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of transformaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		transformaction obj = new transformaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformaction[] response = (transformaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of transformaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		transformaction obj = new transformaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformaction[] response = (transformaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class continuematchingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
