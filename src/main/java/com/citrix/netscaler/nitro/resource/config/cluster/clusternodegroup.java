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

class clusternodegroup_response extends base_response
{
	public clusternodegroup[] clusternodegroup;
}
/**
* Configuration for Node group object type resource.
*/

public class clusternodegroup extends base_resource
{
	private String name;
	private String strict;

	//------- Read only Parameter ---------;

	private Long currentnodemask;
	private Long backupnodemask;
	private Long boundedentitiescntfrompe;
	private Long[] activelist;
	private Long[] backuplist;
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
	* Specifies whether cluster nodes, that are not part of the nodegroup, will be used as backup for the nodegroup.
  * Enabled - When one of the nodes goes down, no other cluster node is picked up to replace it. When the node comes up, it will continue being part of the nodegroup.
  * Disabled - When one of the nodes goes down, a non-nodegroup cluster node is picked up and acts as part of the nodegroup. When the original node of the nodegroup comes up, the backup node will be replaced.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_strict(String strict) throws Exception{
		this.strict = strict;
	}

	/**
	* <pre>
	* Specifies whether cluster nodes, that are not part of the nodegroup, will be used as backup for the nodegroup.
  * Enabled - When one of the nodes goes down, no other cluster node is picked up to replace it. When the node comes up, it will continue being part of the nodegroup.
  * Disabled - When one of the nodes goes down, a non-nodegroup cluster node is picked up and acts as part of the nodegroup. When the original node of the nodegroup comes up, the backup node will be replaced.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_strict() throws Exception {
		return this.strict;
	}

	/**
	* <pre>
	* Bitmap of current nodes in this nodegroup.
	* </pre>
	*/
	public Long get_currentnodemask() throws Exception {
		return this.currentnodemask;
	}

	/**
	* <pre>
	* Bitmap of backup nodes in this nodegroup.
	* </pre>
	*/
	public Long get_backupnodemask() throws Exception {
		return this.backupnodemask;
	}

	/**
	* <pre>
	* Count of bounded entities to this nodegroup accoding to PE.
	* </pre>
	*/
	public Long get_boundedentitiescntfrompe() throws Exception {
		return this.boundedentitiescntfrompe;
	}

	/**
	* <pre>
	* Active node list of this nodegroup.
	* </pre>
	*/
	public Long[] get_activelist() throws Exception {
		return this.activelist;
	}

	/**
	* <pre>
	* Backup node list of this nodegroup.
	* </pre>
	*/
	public Long[] get_backuplist() throws Exception {
		return this.backuplist;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusternodegroup_response result = (clusternodegroup_response) service.get_payload_formatter().string_to_resource(clusternodegroup_response.class, response);
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
		return result.clusternodegroup;
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
	* Use this API to add clusternodegroup.
	*/
	public static base_response add(nitro_service client, clusternodegroup resource) throws Exception {
		clusternodegroup addresource = new clusternodegroup();
		addresource.name = resource.name;
		addresource.strict = resource.strict;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add clusternodegroup resources.
	*/
	public static base_responses add(nitro_service client, clusternodegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternodegroup addresources[] = new clusternodegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new clusternodegroup();
				addresources[i].name = resources[i].name;
				addresources[i].strict = resources[i].strict;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update clusternodegroup.
	*/
	public static base_response update(nitro_service client, clusternodegroup resource) throws Exception {
		clusternodegroup updateresource = new clusternodegroup();
		updateresource.name = resource.name;
		updateresource.strict = resource.strict;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update clusternodegroup resources.
	*/
	public static base_responses update(nitro_service client, clusternodegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternodegroup updateresources[] = new clusternodegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new clusternodegroup();
				updateresources[i].name = resources[i].name;
				updateresources[i].strict = resources[i].strict;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of clusternodegroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		clusternodegroup unsetresource = new clusternodegroup();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of clusternodegroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, clusternodegroup resource, String[] args) throws Exception{
		clusternodegroup unsetresource = new clusternodegroup();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of clusternodegroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			clusternodegroup unsetresources[] = new clusternodegroup[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new clusternodegroup();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of clusternodegroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, clusternodegroup resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternodegroup unsetresources[] = new clusternodegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new clusternodegroup();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to delete clusternodegroup of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		clusternodegroup deleteresource = new clusternodegroup();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete clusternodegroup.
	*/
	public static base_response delete(nitro_service client, clusternodegroup resource) throws Exception {
		clusternodegroup deleteresource = new clusternodegroup();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete clusternodegroup resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			clusternodegroup deleteresources[] = new clusternodegroup[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new clusternodegroup();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete clusternodegroup resources.
	*/
	public static base_responses delete(nitro_service client, clusternodegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusternodegroup deleteresources[] = new clusternodegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new clusternodegroup();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the clusternodegroup resources that are configured on netscaler.
	*/
	public static clusternodegroup[] get(nitro_service service) throws Exception{
		clusternodegroup obj = new clusternodegroup();
		clusternodegroup[] response = (clusternodegroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the clusternodegroup resources that are configured on netscaler.
	*/
	public static clusternodegroup[] get(nitro_service service, options option) throws Exception{
		clusternodegroup obj = new clusternodegroup();
		clusternodegroup[] response = (clusternodegroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch clusternodegroup resource of given name .
	*/
	public static clusternodegroup get(nitro_service service, String name) throws Exception{
		clusternodegroup obj = new clusternodegroup();
		obj.set_name(name);
		clusternodegroup response = (clusternodegroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch clusternodegroup resources of given names .
	*/
	public static clusternodegroup[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			clusternodegroup response[] = new clusternodegroup[name.length];
			clusternodegroup obj[] = new clusternodegroup[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new clusternodegroup();
				obj[i].set_name(name[i]);
				response[i] = (clusternodegroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of clusternodegroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static clusternodegroup[] get_filtered(nitro_service service, String filter) throws Exception{
		clusternodegroup obj = new clusternodegroup();
		options option = new options();
		option.set_filter(filter);
		clusternodegroup[] response = (clusternodegroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of clusternodegroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static clusternodegroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		clusternodegroup obj = new clusternodegroup();
		options option = new options();
		option.set_filter(filter);
		clusternodegroup[] response = (clusternodegroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the clusternodegroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		clusternodegroup obj = new clusternodegroup();
		options option = new options();
		option.set_count(true);
		clusternodegroup[] response = (clusternodegroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of clusternodegroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		clusternodegroup obj = new clusternodegroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		clusternodegroup[] response = (clusternodegroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of clusternodegroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		clusternodegroup obj = new clusternodegroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		clusternodegroup[] response = (clusternodegroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class strictEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
