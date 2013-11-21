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

package com.citrix.netscaler.nitro.resource.config.cluster;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class clusternodegroup_clusternode_binding_response extends base_response
{
	public clusternodegroup_clusternode_binding[] clusternodegroup_clusternode_binding;
}
/**
	* Binding class showing the clusternode that can be bound to clusternodegroup.
	*/

public class clusternodegroup_clusternode_binding extends base_resource
{
	private Long node;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Name of the nodegroup. The name uniquely identifies the nodegroup on the cluster.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the nodegroup. The name uniquely identifies the nodegroup on the cluster.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Nodes in the nodegroup.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_node(long node) throws Exception {
		this.node = new Long(node);
	}

	/**
	* <pre>
	* Nodes in the nodegroup.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_node(Long node) throws Exception{
		this.node = node;
	}

	/**
	* <pre>
	* Nodes in the nodegroup.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_node() throws Exception {
		return this.node;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusternodegroup_clusternode_binding_response result = (clusternodegroup_clusternode_binding_response) service.get_payload_formatter().string_to_resource(clusternodegroup_clusternode_binding_response.class, response);
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
		return result.clusternodegroup_clusternode_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, clusternodegroup_clusternode_binding resource) throws Exception {
		clusternodegroup_clusternode_binding updateresource = new clusternodegroup_clusternode_binding();
		updateresource.name = resource.name;
		updateresource.node = resource.node;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, clusternodegroup_clusternode_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternodegroup_clusternode_binding updateresources[] = new clusternodegroup_clusternode_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new clusternodegroup_clusternode_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].node = resources[i].node;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, clusternodegroup_clusternode_binding resource) throws Exception {
		clusternodegroup_clusternode_binding deleteresource = new clusternodegroup_clusternode_binding();
		deleteresource.name = resource.name;
		deleteresource.node = resource.node;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, clusternodegroup_clusternode_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternodegroup_clusternode_binding deleteresources[] = new clusternodegroup_clusternode_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new clusternodegroup_clusternode_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].node = resources[i].node;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch filtered set of clusternodegroup_clusternode_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static clusternodegroup_clusternode_binding[] get_filtered(nitro_service service, clusternodegroup_clusternode_binding obj, String filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		clusternodegroup_clusternode_binding[] response = (clusternodegroup_clusternode_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of clusternodegroup_clusternode_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static clusternodegroup_clusternode_binding[] get_filtered(nitro_service service, clusternodegroup_clusternode_binding obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		clusternodegroup_clusternode_binding[] response = (clusternodegroup_clusternode_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count clusternodegroup_clusternode_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, clusternodegroup_clusternode_binding obj) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		clusternodegroup_clusternode_binding response[] = (clusternodegroup_clusternode_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of clusternodegroup_clusternode_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, clusternodegroup_clusternode_binding obj, String filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		clusternodegroup_clusternode_binding[] response = (clusternodegroup_clusternode_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of clusternodegroup_clusternode_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, clusternodegroup_clusternode_binding obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		clusternodegroup_clusternode_binding[] response = (clusternodegroup_clusternode_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}