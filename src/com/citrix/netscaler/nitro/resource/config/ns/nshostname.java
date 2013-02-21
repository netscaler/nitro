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

class nshostname_response extends base_response
{
	public nshostname[] nshostname;
}
/**
* Configuration for host name resource.
*/

public class nshostname extends base_resource
{
	private String hostname;
	private Long ownernode;
	private Long __count;

	/**
	* <pre>
	* Desired host name.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_hostname(String hostname) throws Exception{
		this.hostname = hostname;
	}

	/**
	* <pre>
	* Desired host name.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_hostname() throws Exception {
		return this.hostname;
	}

	/**
	* <pre>
	* The owner node in a Cluster for which we are setting the hostname. Owner node can vary from 0 to 31.<br> Default value: 255<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_ownernode(long ownernode) throws Exception {
		this.ownernode = new Long(ownernode);
	}

	/**
	* <pre>
	* The owner node in a Cluster for which we are setting the hostname. Owner node can vary from 0 to 31.<br> Default value: 255<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_ownernode(Long ownernode) throws Exception{
		this.ownernode = ownernode;
	}

	/**
	* <pre>
	* The owner node in a Cluster for which we are setting the hostname. Owner node can vary from 0 to 31.<br> Default value: 255<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_ownernode() throws Exception {
		return this.ownernode;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nshostname_response result = (nshostname_response) service.get_payload_formatter().string_to_resource(nshostname_response.class, response);
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
		return result.nshostname;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.ownernode != null) {
			return this.ownernode.toString();
		}
		return null;
	}

	/**
	* Use this API to update nshostname.
	*/
	public static base_response update(nitro_service client, nshostname resource) throws Exception {
		nshostname updateresource = new nshostname();
		updateresource.hostname = resource.hostname;
		updateresource.ownernode = resource.ownernode;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nshostname resources.
	*/
	public static base_responses update(nitro_service client, nshostname resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshostname updateresources[] = new nshostname[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nshostname();
				updateresources[i].hostname = resources[i].hostname;
				updateresources[i].ownernode = resources[i].ownernode;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nshostname resources that are configured on netscaler.
	*/
	public static nshostname[] get(nitro_service service) throws Exception{
		nshostname obj = new nshostname();
		nshostname[] response = (nshostname[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nshostname resources that are configured on netscaler.
	*/
	public static nshostname[] get(nitro_service service, options option) throws Exception{
		nshostname obj = new nshostname();
		nshostname[] response = (nshostname[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of nshostname resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nshostname[] get_filtered(nitro_service service, String filter) throws Exception{
		nshostname obj = new nshostname();
		options option = new options();
		option.set_filter(filter);
		nshostname[] response = (nshostname[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nshostname resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nshostname[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nshostname obj = new nshostname();
		options option = new options();
		option.set_filter(filter);
		nshostname[] response = (nshostname[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nshostname resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nshostname obj = new nshostname();
		options option = new options();
		option.set_count(true);
		nshostname[] response = (nshostname[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nshostname resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nshostname obj = new nshostname();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nshostname[] response = (nshostname[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nshostname resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nshostname obj = new nshostname();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nshostname[] response = (nshostname[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
