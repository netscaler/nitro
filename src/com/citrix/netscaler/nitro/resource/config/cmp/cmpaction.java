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

package com.citrix.netscaler.nitro.resource.config.cmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cmpaction_response extends base_response
{
	public cmpaction[] cmpaction;
}
/**
* Configuration for compression action resource.
*/

public class cmpaction extends base_resource
{
	private String name;
	private String cmptype;
	private String deltatype;
	private String newname;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the compression action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the compression action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The type of compression action.<br> Possible values = compress, gzip, deflate, nocompress
	* </pre>
	*/
	public void set_cmptype(String cmptype) throws Exception{
		this.cmptype = cmptype;
	}

	/**
	* <pre>
	* The type of compression action.<br> Possible values = compress, gzip, deflate, nocompress
	* </pre>
	*/
	public String get_cmptype() throws Exception {
		return this.cmptype;
	}

	/**
	* <pre>
	* The type of delta action (if delta type compression action is defined).<br> Default value: NS_ACT_CMP_DELTA_TYPE_PERURL<br> Possible values = PERURL, PERPOLICY
	* </pre>
	*/
	public void set_deltatype(String deltatype) throws Exception{
		this.deltatype = deltatype;
	}

	/**
	* <pre>
	* The type of delta action (if delta type compression action is defined).<br> Default value: NS_ACT_CMP_DELTA_TYPE_PERURL<br> Possible values = PERURL, PERPOLICY
	* </pre>
	*/
	public String get_deltatype() throws Exception {
		return this.deltatype;
	}

	/**
	* <pre>
	* The new name of the cmp action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the cmp action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Flag to determine whether compression is default or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		cmpaction_response result = (cmpaction_response) service.get_payload_formatter().string_to_resource(cmpaction_response.class, response);
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
		return result.cmpaction;
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
	* Use this API to add cmpaction.
	*/
	public static base_response add(nitro_service client, cmpaction resource) throws Exception {
		cmpaction addresource = new cmpaction();
		addresource.name = resource.name;
		addresource.cmptype = resource.cmptype;
		addresource.deltatype = resource.deltatype;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cmpaction resources.
	*/
	public static base_responses add(nitro_service client, cmpaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmpaction addresources[] = new cmpaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cmpaction();
				addresources[i].name = resources[i].name;
				addresources[i].cmptype = resources[i].cmptype;
				addresources[i].deltatype = resources[i].deltatype;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cmpaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		cmpaction deleteresource = new cmpaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cmpaction.
	*/
	public static base_response delete(nitro_service client, cmpaction resource) throws Exception {
		cmpaction deleteresource = new cmpaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cmpaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			cmpaction deleteresources[] = new cmpaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new cmpaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cmpaction resources.
	*/
	public static base_responses delete(nitro_service client, cmpaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmpaction deleteresources[] = new cmpaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cmpaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a cmpaction resource.
	*/
	public static base_response rename(nitro_service client, cmpaction resource, String new_name) throws Exception {
		cmpaction renameresource = new cmpaction();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a cmpaction resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		cmpaction renameresource = new cmpaction();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the cmpaction resources that are configured on netscaler.
	*/
	public static cmpaction[] get(nitro_service service) throws Exception{
		cmpaction obj = new cmpaction();
		cmpaction[] response = (cmpaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cmpaction resources that are configured on netscaler.
	*/
	public static cmpaction[] get(nitro_service service, options option) throws Exception{
		cmpaction obj = new cmpaction();
		cmpaction[] response = (cmpaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cmpaction resource of given name .
	*/
	public static cmpaction get(nitro_service service, String name) throws Exception{
		cmpaction obj = new cmpaction();
		obj.set_name(name);
		cmpaction response = (cmpaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cmpaction resources of given names .
	*/
	public static cmpaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			cmpaction response[] = new cmpaction[name.length];
			cmpaction obj[] = new cmpaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new cmpaction();
				obj[i].set_name(name[i]);
				response[i] = (cmpaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cmpaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cmpaction[] get_filtered(nitro_service service, String filter) throws Exception{
		cmpaction obj = new cmpaction();
		options option = new options();
		option.set_filter(filter);
		cmpaction[] response = (cmpaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cmpaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cmpaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmpaction obj = new cmpaction();
		options option = new options();
		option.set_filter(filter);
		cmpaction[] response = (cmpaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cmpaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cmpaction obj = new cmpaction();
		options option = new options();
		option.set_count(true);
		cmpaction[] response = (cmpaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cmpaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cmpaction obj = new cmpaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmpaction[] response = (cmpaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cmpaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmpaction obj = new cmpaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmpaction[] response = (cmpaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cmptypeEnum {
		public static final String compress = "compress";
		public static final String gzip = "gzip";
		public static final String deflate = "deflate";
		public static final String nocompress = "nocompress";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class deltatypeEnum {
		public static final String PERURL = "PERURL";
		public static final String PERPOLICY = "PERPOLICY";
	}
}
