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

package com.citrix.netscaler.nitro.resource.config.stream;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class streamidentifier_response extends base_response
{
	public streamidentifier[] streamidentifier;
}
/**
* Configuration for identifier resource.
*/

public class streamidentifier extends base_resource
{
	private String name;
	private String selectorname;
	private Long interval;
	private Long samplecount;
	private String sort;

	//------- Read only Parameter ---------;

	private String[] rule;
	private Long __count;

	/**
	* <pre>
	* The name of stream identifier.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of stream identifier.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of stream selector.<br> Minimum length =  1
	* </pre>
	*/
	public void set_selectorname(String selectorname) throws Exception{
		this.selectorname = selectorname;
	}

	/**
	* <pre>
	* The name of stream selector.<br> Minimum length =  1
	* </pre>
	*/
	public String get_selectorname() throws Exception {
		return this.selectorname;
	}

	/**
	* <pre>
	* Time interval in minutes for holding on the objects.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_interval(long interval) throws Exception {
		this.interval = new Long(interval);
	}

	/**
	* <pre>
	* Time interval in minutes for holding on the objects.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_interval(Long interval) throws Exception{
		this.interval = interval;
	}

	/**
	* <pre>
	* Time interval in minutes for holding on the objects.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_interval() throws Exception {
		return this.interval;
	}

	/**
	* <pre>
	* Sample count 1 in sample count objects to be sampled.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_samplecount(long samplecount) throws Exception {
		this.samplecount = new Long(samplecount);
	}

	/**
	* <pre>
	* Sample count 1 in sample count objects to be sampled.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_samplecount(Long samplecount) throws Exception{
		this.samplecount = samplecount;
	}

	/**
	* <pre>
	* Sample count 1 in sample count objects to be sampled.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_samplecount() throws Exception {
		return this.samplecount;
	}

	/**
	* <pre>
	* Attribute on which the objects will be sorted on which summarized expressions will be performed.<br> Default value: STREAM_DIMENSION_REQUESTS<br> Possible values = REQUESTS, CONNECTIONS, RESPTIME, BANDWIDTH, NONE
	* </pre>
	*/
	public void set_sort(String sort) throws Exception{
		this.sort = sort;
	}

	/**
	* <pre>
	* Attribute on which the objects will be sorted on which summarized expressions will be performed.<br> Default value: STREAM_DIMENSION_REQUESTS<br> Possible values = REQUESTS, CONNECTIONS, RESPTIME, BANDWIDTH, NONE
	* </pre>
	*/
	public String get_sort() throws Exception {
		return this.sort;
	}

	/**
	* <pre>
	* Rule.
	* </pre>
	*/
	public String[] get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		streamidentifier_response result = (streamidentifier_response) service.get_payload_formatter().string_to_resource(streamidentifier_response.class, response);
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
		return result.streamidentifier;
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
	* Use this API to add streamidentifier.
	*/
	public static base_response add(nitro_service client, streamidentifier resource) throws Exception {
		streamidentifier addresource = new streamidentifier();
		addresource.name = resource.name;
		addresource.selectorname = resource.selectorname;
		addresource.interval = resource.interval;
		addresource.samplecount = resource.samplecount;
		addresource.sort = resource.sort;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add streamidentifier resources.
	*/
	public static base_responses add(nitro_service client, streamidentifier resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			streamidentifier addresources[] = new streamidentifier[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new streamidentifier();
				addresources[i].name = resources[i].name;
				addresources[i].selectorname = resources[i].selectorname;
				addresources[i].interval = resources[i].interval;
				addresources[i].samplecount = resources[i].samplecount;
				addresources[i].sort = resources[i].sort;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update streamidentifier.
	*/
	public static base_response update(nitro_service client, streamidentifier resource) throws Exception {
		streamidentifier updateresource = new streamidentifier();
		updateresource.name = resource.name;
		updateresource.selectorname = resource.selectorname;
		updateresource.interval = resource.interval;
		updateresource.samplecount = resource.samplecount;
		updateresource.sort = resource.sort;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update streamidentifier resources.
	*/
	public static base_responses update(nitro_service client, streamidentifier resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			streamidentifier updateresources[] = new streamidentifier[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new streamidentifier();
				updateresources[i].name = resources[i].name;
				updateresources[i].selectorname = resources[i].selectorname;
				updateresources[i].interval = resources[i].interval;
				updateresources[i].samplecount = resources[i].samplecount;
				updateresources[i].sort = resources[i].sort;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of streamidentifier resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		streamidentifier unsetresource = new streamidentifier();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of streamidentifier resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, streamidentifier resource, String[] args) throws Exception{
		streamidentifier unsetresource = new streamidentifier();
		unsetresource.name = resource.name;
		unsetresource.selectorname = resource.selectorname;
		unsetresource.interval = resource.interval;
		unsetresource.samplecount = resource.samplecount;
		unsetresource.sort = resource.sort;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of streamidentifier resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			streamidentifier unsetresources[] = new streamidentifier[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new streamidentifier();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of streamidentifier resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, streamidentifier resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			streamidentifier unsetresources[] = new streamidentifier[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new streamidentifier();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].selectorname = resources[i].selectorname;
				unsetresources[i].interval = resources[i].interval;
				unsetresources[i].samplecount = resources[i].samplecount;
				unsetresources[i].sort = resources[i].sort;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to delete streamidentifier of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		streamidentifier deleteresource = new streamidentifier();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete streamidentifier.
	*/
	public static base_response delete(nitro_service client, streamidentifier resource) throws Exception {
		streamidentifier deleteresource = new streamidentifier();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete streamidentifier resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			streamidentifier deleteresources[] = new streamidentifier[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new streamidentifier();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete streamidentifier resources.
	*/
	public static base_responses delete(nitro_service client, streamidentifier resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			streamidentifier deleteresources[] = new streamidentifier[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new streamidentifier();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the streamidentifier resources that are configured on netscaler.
	*/
	public static streamidentifier[] get(nitro_service service) throws Exception{
		streamidentifier obj = new streamidentifier();
		streamidentifier[] response = (streamidentifier[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the streamidentifier resources that are configured on netscaler.
	*/
	public static streamidentifier[] get(nitro_service service, options option) throws Exception{
		streamidentifier obj = new streamidentifier();
		streamidentifier[] response = (streamidentifier[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch streamidentifier resource of given name .
	*/
	public static streamidentifier get(nitro_service service, String name) throws Exception{
		streamidentifier obj = new streamidentifier();
		obj.set_name(name);
		streamidentifier response = (streamidentifier) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch streamidentifier resources of given names .
	*/
	public static streamidentifier[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			streamidentifier response[] = new streamidentifier[name.length];
			streamidentifier obj[] = new streamidentifier[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new streamidentifier();
				obj[i].set_name(name[i]);
				response[i] = (streamidentifier) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of streamidentifier resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static streamidentifier[] get_filtered(nitro_service service, String filter) throws Exception{
		streamidentifier obj = new streamidentifier();
		options option = new options();
		option.set_filter(filter);
		streamidentifier[] response = (streamidentifier[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of streamidentifier resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static streamidentifier[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		streamidentifier obj = new streamidentifier();
		options option = new options();
		option.set_filter(filter);
		streamidentifier[] response = (streamidentifier[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the streamidentifier resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		streamidentifier obj = new streamidentifier();
		options option = new options();
		option.set_count(true);
		streamidentifier[] response = (streamidentifier[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of streamidentifier resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		streamidentifier obj = new streamidentifier();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		streamidentifier[] response = (streamidentifier[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of streamidentifier resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		streamidentifier obj = new streamidentifier();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		streamidentifier[] response = (streamidentifier[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class sortEnum {
		public static final String REQUESTS = "REQUESTS";
		public static final String CONNECTIONS = "CONNECTIONS";
		public static final String RESPTIME = "RESPTIME";
		public static final String BANDWIDTH = "BANDWIDTH";
		public static final String NONE = "NONE";
	}
}
