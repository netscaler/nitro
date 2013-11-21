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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsxmlnamespace_response extends base_response
{
	public nsxmlnamespace[] nsxmlnamespace;
}
/**
* Configuration for XML namespace resource.
*/

public class nsxmlnamespace extends base_resource
{
	private String prefix;
	private String Namespace;
	private String description;
	private Long __count;

	/**
	* <pre>
	* XML prefix.<br> Minimum length =  1
	* </pre>
	*/
	public void set_prefix(String prefix) throws Exception{
		this.prefix = prefix;
	}

	/**
	* <pre>
	* XML prefix.<br> Minimum length =  1
	* </pre>
	*/
	public String get_prefix() throws Exception {
		return this.prefix;
	}

	/**
	* <pre>
	* Expanded namespace for which the XML prefix is provided.<br> Minimum length =  1
	* </pre>
	*/
	public void set_Namespace(String Namespace) throws Exception{
		this.Namespace = Namespace;
	}

	/**
	* <pre>
	* Expanded namespace for which the XML prefix is provided.<br> Minimum length =  1
	* </pre>
	*/
	public String get_Namespace() throws Exception {
		return this.Namespace;
	}

	/**
	* <pre>
	* Description for the prefix.<br> Minimum length =  1
	* </pre>
	*/
	public void set_description(String description) throws Exception{
		this.description = description;
	}

	/**
	* <pre>
	* Description for the prefix.<br> Minimum length =  1
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
		nsxmlnamespace_response result = (nsxmlnamespace_response) service.get_payload_formatter().string_to_resource(nsxmlnamespace_response.class, response);
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
		return result.nsxmlnamespace;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.prefix;
	}

	/**
	* Use this API to add nsxmlnamespace.
	*/
	public static base_response add(nitro_service client, nsxmlnamespace resource) throws Exception {
		nsxmlnamespace addresource = new nsxmlnamespace();
		addresource.prefix = resource.prefix;
		addresource.Namespace = resource.Namespace;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nsxmlnamespace resources.
	*/
	public static base_responses add(nitro_service client, nsxmlnamespace resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsxmlnamespace addresources[] = new nsxmlnamespace[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nsxmlnamespace();
				addresources[i].prefix = resources[i].prefix;
				addresources[i].Namespace = resources[i].Namespace;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsxmlnamespace of given name.
	*/
	public static base_response delete(nitro_service client, String prefix) throws Exception {
		nsxmlnamespace deleteresource = new nsxmlnamespace();
		deleteresource.prefix = prefix;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsxmlnamespace.
	*/
	public static base_response delete(nitro_service client, nsxmlnamespace resource) throws Exception {
		nsxmlnamespace deleteresource = new nsxmlnamespace();
		deleteresource.prefix = resource.prefix;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsxmlnamespace resources of given names.
	*/
	public static base_responses delete(nitro_service client, String prefix[]) throws Exception {
		base_responses result = null;
		if (prefix != null && prefix.length > 0) {
			nsxmlnamespace deleteresources[] = new nsxmlnamespace[prefix.length];
			for (int i=0;i<prefix.length;i++){
				deleteresources[i] = new nsxmlnamespace();
				deleteresources[i].prefix = prefix[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsxmlnamespace resources.
	*/
	public static base_responses delete(nitro_service client, nsxmlnamespace resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsxmlnamespace deleteresources[] = new nsxmlnamespace[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nsxmlnamespace();
				deleteresources[i].prefix = resources[i].prefix;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nsxmlnamespace.
	*/
	public static base_response update(nitro_service client, nsxmlnamespace resource) throws Exception {
		nsxmlnamespace updateresource = new nsxmlnamespace();
		updateresource.prefix = resource.prefix;
		updateresource.Namespace = resource.Namespace;
		updateresource.description = resource.description;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nsxmlnamespace resources.
	*/
	public static base_responses update(nitro_service client, nsxmlnamespace resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsxmlnamespace updateresources[] = new nsxmlnamespace[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nsxmlnamespace();
				updateresources[i].prefix = resources[i].prefix;
				updateresources[i].Namespace = resources[i].Namespace;
				updateresources[i].description = resources[i].description;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsxmlnamespace resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsxmlnamespace resource, String[] args) throws Exception{
		nsxmlnamespace unsetresource = new nsxmlnamespace();
		unsetresource.prefix = resource.prefix;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nsxmlnamespace resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String prefix[], String args[]) throws Exception {
		base_responses result = null;
		if (prefix != null && prefix.length > 0) {
			nsxmlnamespace unsetresources[] = new nsxmlnamespace[prefix.length];
			for (int i=0;i<prefix.length;i++){
				unsetresources[i] = new nsxmlnamespace();
				unsetresources[i].prefix = prefix[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsxmlnamespace resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nsxmlnamespace resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsxmlnamespace unsetresources[] = new nsxmlnamespace[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nsxmlnamespace();
				unsetresources[i].prefix = resources[i].prefix;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nsxmlnamespace resources that are configured on netscaler.
	*/
	public static nsxmlnamespace[] get(nitro_service service) throws Exception{
		nsxmlnamespace obj = new nsxmlnamespace();
		nsxmlnamespace[] response = (nsxmlnamespace[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsxmlnamespace resources that are configured on netscaler.
	*/
	public static nsxmlnamespace[] get(nitro_service service, options option) throws Exception{
		nsxmlnamespace obj = new nsxmlnamespace();
		nsxmlnamespace[] response = (nsxmlnamespace[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nsxmlnamespace resource of given name .
	*/
	public static nsxmlnamespace get(nitro_service service, String prefix) throws Exception{
		nsxmlnamespace obj = new nsxmlnamespace();
		obj.set_prefix(prefix);
		nsxmlnamespace response = (nsxmlnamespace) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nsxmlnamespace resources of given names .
	*/
	public static nsxmlnamespace[] get(nitro_service service, String prefix[]) throws Exception{
		if (prefix !=null && prefix.length>0) {
			nsxmlnamespace response[] = new nsxmlnamespace[prefix.length];
			nsxmlnamespace obj[] = new nsxmlnamespace[prefix.length];
			for (int i=0;i<prefix.length;i++) {
				obj[i] = new nsxmlnamespace();
				obj[i].set_prefix(prefix[i]);
				response[i] = (nsxmlnamespace) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nsxmlnamespace resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsxmlnamespace[] get_filtered(nitro_service service, String filter) throws Exception{
		nsxmlnamespace obj = new nsxmlnamespace();
		options option = new options();
		option.set_filter(filter);
		nsxmlnamespace[] response = (nsxmlnamespace[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsxmlnamespace resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsxmlnamespace[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsxmlnamespace obj = new nsxmlnamespace();
		options option = new options();
		option.set_filter(filter);
		nsxmlnamespace[] response = (nsxmlnamespace[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsxmlnamespace resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsxmlnamespace obj = new nsxmlnamespace();
		options option = new options();
		option.set_count(true);
		nsxmlnamespace[] response = (nsxmlnamespace[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsxmlnamespace resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsxmlnamespace obj = new nsxmlnamespace();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsxmlnamespace[] response = (nsxmlnamespace[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsxmlnamespace resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsxmlnamespace obj = new nsxmlnamespace();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsxmlnamespace[] response = (nsxmlnamespace[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
