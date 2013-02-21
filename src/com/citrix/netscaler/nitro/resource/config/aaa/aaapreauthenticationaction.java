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

class aaapreauthenticationaction_response extends base_response
{
	public aaapreauthenticationaction[] aaapreauthenticationaction;
}
/**
* Configuration for pre authentication action resource.
*/

public class aaapreauthenticationaction extends base_resource
{
	private String name;
	private String preauthenticationaction;
	private String killprocess;
	private String deletefiles;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the Preauthentication action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the Preauthentication action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Deny or allow login after end point analysis results.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_preauthenticationaction(String preauthenticationaction) throws Exception{
		this.preauthenticationaction = preauthenticationaction;
	}

	/**
	* <pre>
	* Deny or allow login after end point analysis results.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_preauthenticationaction() throws Exception {
		return this.preauthenticationaction;
	}

	/**
	* <pre>
	* Processes to be killed by the EPA tool.
	* </pre>
	*/
	public void set_killprocess(String killprocess) throws Exception{
		this.killprocess = killprocess;
	}

	/**
	* <pre>
	* Processes to be killed by the EPA tool.
	* </pre>
	*/
	public String get_killprocess() throws Exception {
		return this.killprocess;
	}

	/**
	* <pre>
	* Files to be deleted by EPA tool.
	* </pre>
	*/
	public void set_deletefiles(String deletefiles) throws Exception{
		this.deletefiles = deletefiles;
	}

	/**
	* <pre>
	* Files to be deleted by EPA tool.
	* </pre>
	*/
	public String get_deletefiles() throws Exception {
		return this.deletefiles;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		aaapreauthenticationaction_response result = (aaapreauthenticationaction_response) service.get_payload_formatter().string_to_resource(aaapreauthenticationaction_response.class, response);
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
		return result.aaapreauthenticationaction;
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
	* Use this API to add aaapreauthenticationaction.
	*/
	public static base_response add(nitro_service client, aaapreauthenticationaction resource) throws Exception {
		aaapreauthenticationaction addresource = new aaapreauthenticationaction();
		addresource.name = resource.name;
		addresource.preauthenticationaction = resource.preauthenticationaction;
		addresource.killprocess = resource.killprocess;
		addresource.deletefiles = resource.deletefiles;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add aaapreauthenticationaction resources.
	*/
	public static base_responses add(nitro_service client, aaapreauthenticationaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaapreauthenticationaction addresources[] = new aaapreauthenticationaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new aaapreauthenticationaction();
				addresources[i].name = resources[i].name;
				addresources[i].preauthenticationaction = resources[i].preauthenticationaction;
				addresources[i].killprocess = resources[i].killprocess;
				addresources[i].deletefiles = resources[i].deletefiles;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaapreauthenticationaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		aaapreauthenticationaction deleteresource = new aaapreauthenticationaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaapreauthenticationaction.
	*/
	public static base_response delete(nitro_service client, aaapreauthenticationaction resource) throws Exception {
		aaapreauthenticationaction deleteresource = new aaapreauthenticationaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaapreauthenticationaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			aaapreauthenticationaction deleteresources[] = new aaapreauthenticationaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new aaapreauthenticationaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaapreauthenticationaction resources.
	*/
	public static base_responses delete(nitro_service client, aaapreauthenticationaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaapreauthenticationaction deleteresources[] = new aaapreauthenticationaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaapreauthenticationaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update aaapreauthenticationaction.
	*/
	public static base_response update(nitro_service client, aaapreauthenticationaction resource) throws Exception {
		aaapreauthenticationaction updateresource = new aaapreauthenticationaction();
		updateresource.name = resource.name;
		updateresource.preauthenticationaction = resource.preauthenticationaction;
		updateresource.killprocess = resource.killprocess;
		updateresource.deletefiles = resource.deletefiles;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update aaapreauthenticationaction resources.
	*/
	public static base_responses update(nitro_service client, aaapreauthenticationaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaapreauthenticationaction updateresources[] = new aaapreauthenticationaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaapreauthenticationaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].preauthenticationaction = resources[i].preauthenticationaction;
				updateresources[i].killprocess = resources[i].killprocess;
				updateresources[i].deletefiles = resources[i].deletefiles;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of aaapreauthenticationaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		aaapreauthenticationaction unsetresource = new aaapreauthenticationaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of aaapreauthenticationaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaapreauthenticationaction resource, String[] args) throws Exception{
		aaapreauthenticationaction unsetresource = new aaapreauthenticationaction();
		unsetresource.name = resource.name;
		unsetresource.killprocess = resource.killprocess;
		unsetresource.deletefiles = resource.deletefiles;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of aaapreauthenticationaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			aaapreauthenticationaction unsetresources[] = new aaapreauthenticationaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new aaapreauthenticationaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of aaapreauthenticationaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, aaapreauthenticationaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaapreauthenticationaction unsetresources[] = new aaapreauthenticationaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new aaapreauthenticationaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].killprocess = resources[i].killprocess;
				unsetresources[i].deletefiles = resources[i].deletefiles;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the aaapreauthenticationaction resources that are configured on netscaler.
	*/
	public static aaapreauthenticationaction[] get(nitro_service service) throws Exception{
		aaapreauthenticationaction obj = new aaapreauthenticationaction();
		aaapreauthenticationaction[] response = (aaapreauthenticationaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the aaapreauthenticationaction resources that are configured on netscaler.
	*/
	public static aaapreauthenticationaction[] get(nitro_service service, options option) throws Exception{
		aaapreauthenticationaction obj = new aaapreauthenticationaction();
		aaapreauthenticationaction[] response = (aaapreauthenticationaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch aaapreauthenticationaction resource of given name .
	*/
	public static aaapreauthenticationaction get(nitro_service service, String name) throws Exception{
		aaapreauthenticationaction obj = new aaapreauthenticationaction();
		obj.set_name(name);
		aaapreauthenticationaction response = (aaapreauthenticationaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch aaapreauthenticationaction resources of given names .
	*/
	public static aaapreauthenticationaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			aaapreauthenticationaction response[] = new aaapreauthenticationaction[name.length];
			aaapreauthenticationaction obj[] = new aaapreauthenticationaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new aaapreauthenticationaction();
				obj[i].set_name(name[i]);
				response[i] = (aaapreauthenticationaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of aaapreauthenticationaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaapreauthenticationaction[] get_filtered(nitro_service service, String filter) throws Exception{
		aaapreauthenticationaction obj = new aaapreauthenticationaction();
		options option = new options();
		option.set_filter(filter);
		aaapreauthenticationaction[] response = (aaapreauthenticationaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaapreauthenticationaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaapreauthenticationaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaapreauthenticationaction obj = new aaapreauthenticationaction();
		options option = new options();
		option.set_filter(filter);
		aaapreauthenticationaction[] response = (aaapreauthenticationaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the aaapreauthenticationaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		aaapreauthenticationaction obj = new aaapreauthenticationaction();
		options option = new options();
		option.set_count(true);
		aaapreauthenticationaction[] response = (aaapreauthenticationaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of aaapreauthenticationaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		aaapreauthenticationaction obj = new aaapreauthenticationaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaapreauthenticationaction[] response = (aaapreauthenticationaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaapreauthenticationaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaapreauthenticationaction obj = new aaapreauthenticationaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaapreauthenticationaction[] response = (aaapreauthenticationaction[]) obj.getfiltered(service, option);
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
	public static class preauthenticationactionEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
	}
}
