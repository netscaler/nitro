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

class clusterinstance_response extends base_response
{
	public clusterinstance[] clusterinstance;
}
/**
* Configuration for cluster instance resource.
*/

public class clusterinstance extends base_resource
{
	private Long clid;
	private Long deadinterval;
	private Long hellointerval;
	private String preemption;

	//------- Read only Parameter ---------;

	private String adminstate;
	private String propstate;
	private String operationalstate;
	private String status;
	private Boolean rsskeymismatch;
	private Boolean licensemismatch;
	private String operationalpropstate;
	private Long __count;

	/**
	* <pre>
	* Unique number that identifies the cluster.<br> Minimum value =  1<br> Maximum value =  16
	* </pre>
	*/
	public void set_clid(long clid) throws Exception {
		this.clid = new Long(clid);
	}

	/**
	* <pre>
	* Unique number that identifies the cluster.<br> Minimum value =  1<br> Maximum value =  16
	* </pre>
	*/
	public void set_clid(Long clid) throws Exception{
		this.clid = clid;
	}

	/**
	* <pre>
	* Unique number that identifies the cluster.<br> Minimum value =  1<br> Maximum value =  16
	* </pre>
	*/
	public Long get_clid() throws Exception {
		return this.clid;
	}

	/**
	* <pre>
	* Amount of time, in seconds, after which nodes that do not respond to the heartbeats are assumed to be down.<br> Default value: 3<br> Minimum value =  3<br> Maximum value =  60
	* </pre>
	*/
	public void set_deadinterval(long deadinterval) throws Exception {
		this.deadinterval = new Long(deadinterval);
	}

	/**
	* <pre>
	* Amount of time, in seconds, after which nodes that do not respond to the heartbeats are assumed to be down.<br> Default value: 3<br> Minimum value =  3<br> Maximum value =  60
	* </pre>
	*/
	public void set_deadinterval(Long deadinterval) throws Exception{
		this.deadinterval = deadinterval;
	}

	/**
	* <pre>
	* Amount of time, in seconds, after which nodes that do not respond to the heartbeats are assumed to be down.<br> Default value: 3<br> Minimum value =  3<br> Maximum value =  60
	* </pre>
	*/
	public Long get_deadinterval() throws Exception {
		return this.deadinterval;
	}

	/**
	* <pre>
	* Interval, in milliseconds, at which heartbeats are sent to each cluster node to check the health status.<br> Default value: 200<br> Minimum value =  200<br> Maximum value =  1000
	* </pre>
	*/
	public void set_hellointerval(long hellointerval) throws Exception {
		this.hellointerval = new Long(hellointerval);
	}

	/**
	* <pre>
	* Interval, in milliseconds, at which heartbeats are sent to each cluster node to check the health status.<br> Default value: 200<br> Minimum value =  200<br> Maximum value =  1000
	* </pre>
	*/
	public void set_hellointerval(Long hellointerval) throws Exception{
		this.hellointerval = hellointerval;
	}

	/**
	* <pre>
	* Interval, in milliseconds, at which heartbeats are sent to each cluster node to check the health status.<br> Default value: 200<br> Minimum value =  200<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_hellointerval() throws Exception {
		return this.hellointerval;
	}

	/**
	* <pre>
	* Preempt a cluster node that is configured as a SPARE if an ACTIVE node becomes available.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_preemption(String preemption) throws Exception{
		this.preemption = preemption;
	}

	/**
	* <pre>
	* Preempt a cluster node that is configured as a SPARE if an ACTIVE node becomes available.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_preemption() throws Exception {
		return this.preemption;
	}

	/**
	* <pre>
	* Cluster Admin State.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_adminstate() throws Exception {
		return this.adminstate;
	}

	/**
	* <pre>
	* Enable/Disable the execution of commands on the cluster. This will not impact the execution of commands on individual cluster nodes by using the NSIP.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_propstate() throws Exception {
		return this.propstate;
	}

	/**
	* <pre>
	* Cluster Operational State.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_operationalstate() throws Exception {
		return this.operationalstate;
	}

	/**
	* <pre>
	* Cluster Operational State.<br> Possible values = DOWN, UP, PARTIAL-UP, UNKNOWN
	* </pre>
	*/
	public String get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* This argument is used to determine if there is a RSS key mismatch at cluster instance level.
	* </pre>
	*/
	public Boolean get_rsskeymismatch() throws Exception {
		return this.rsskeymismatch;
	}

	/**
	* <pre>
	* This argument is used to determine if there is a License mismatch at cluster instance level.
	* </pre>
	*/
	public Boolean get_licensemismatch() throws Exception {
		return this.licensemismatch;
	}

	/**
	* <pre>
	* Cluster Operational Propagation State.<br> Default value: ENABLED<br> Possible values = UNKNOWN, ENABLED, DISABLED, AUTO DISABLED
	* </pre>
	*/
	public String get_operationalpropstate() throws Exception {
		return this.operationalpropstate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusterinstance_response result = (clusterinstance_response) service.get_payload_formatter().string_to_resource(clusterinstance_response.class, response);
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
		return result.clusterinstance;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.clid != null) {
			return this.clid.toString();
		}
		return null;
	}

	/**
	* Use this API to add clusterinstance.
	*/
	public static base_response add(nitro_service client, clusterinstance resource) throws Exception {
		clusterinstance addresource = new clusterinstance();
		addresource.clid = resource.clid;
		addresource.deadinterval = resource.deadinterval;
		addresource.hellointerval = resource.hellointerval;
		addresource.preemption = resource.preemption;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add clusterinstance resources.
	*/
	public static base_responses add(nitro_service client, clusterinstance resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusterinstance addresources[] = new clusterinstance[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new clusterinstance();
				addresources[i].clid = resources[i].clid;
				addresources[i].deadinterval = resources[i].deadinterval;
				addresources[i].hellointerval = resources[i].hellointerval;
				addresources[i].preemption = resources[i].preemption;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete clusterinstance of given name.
	*/
	public static base_response delete(nitro_service client, Long clid) throws Exception {
		clusterinstance deleteresource = new clusterinstance();
		deleteresource.clid = clid;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete clusterinstance.
	*/
	public static base_response delete(nitro_service client, clusterinstance resource) throws Exception {
		clusterinstance deleteresource = new clusterinstance();
		deleteresource.clid = resource.clid;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete clusterinstance resources of given names.
	*/
	public static base_responses delete(nitro_service client, Long clid[]) throws Exception {
		base_responses result = null;
		if (clid != null && clid.length > 0) {
			clusterinstance deleteresources[] = new clusterinstance[clid.length];
			for (int i=0;i<clid.length;i++){
				deleteresources[i] = new clusterinstance();
				deleteresources[i].clid = clid[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete clusterinstance resources.
	*/
	public static base_responses delete(nitro_service client, clusterinstance resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusterinstance deleteresources[] = new clusterinstance[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new clusterinstance();
				deleteresources[i].clid = resources[i].clid;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update clusterinstance.
	*/
	public static base_response update(nitro_service client, clusterinstance resource) throws Exception {
		clusterinstance updateresource = new clusterinstance();
		updateresource.clid = resource.clid;
		updateresource.deadinterval = resource.deadinterval;
		updateresource.hellointerval = resource.hellointerval;
		updateresource.preemption = resource.preemption;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update clusterinstance resources.
	*/
	public static base_responses update(nitro_service client, clusterinstance resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusterinstance updateresources[] = new clusterinstance[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new clusterinstance();
				updateresources[i].clid = resources[i].clid;
				updateresources[i].deadinterval = resources[i].deadinterval;
				updateresources[i].hellointerval = resources[i].hellointerval;
				updateresources[i].preemption = resources[i].preemption;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of clusterinstance resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, clusterinstance resource, String[] args) throws Exception{
		clusterinstance unsetresource = new clusterinstance();
		unsetresource.clid = resource.clid;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of clusterinstance resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Long clid[], String args[]) throws Exception {
		base_responses result = null;
		if (clid != null && clid.length > 0) {
			clusterinstance unsetresources[] = new clusterinstance[clid.length];
			for (int i=0;i<clid.length;i++){
				unsetresources[i] = new clusterinstance();
				unsetresources[i].clid = clid[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of clusterinstance resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, clusterinstance resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusterinstance unsetresources[] = new clusterinstance[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new clusterinstance();
				unsetresources[i].clid = resources[i].clid;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable clusterinstance of given name.
	*/
	public static base_response enable(nitro_service client, Long clid) throws Exception {
		clusterinstance enableresource = new clusterinstance();
		enableresource.clid = clid;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable clusterinstance.
	*/
	public static base_response enable(nitro_service client, clusterinstance resource) throws Exception {
		clusterinstance enableresource = new clusterinstance();
		enableresource.clid = resource.clid;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable clusterinstance resources of given names.
	*/
	public static base_responses enable(nitro_service client, Long clid[]) throws Exception {
		base_responses result = null;
		if (clid != null && clid.length > 0) {
			clusterinstance enableresources[] = new clusterinstance[clid.length];
			for (int i=0;i<clid.length;i++){
				enableresources[i] = new clusterinstance();
				enableresources[i].clid = clid[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable clusterinstance resources.
	*/
	public static base_responses enable(nitro_service client, clusterinstance resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusterinstance enableresources[] = new clusterinstance[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new clusterinstance();
				enableresources[i].clid = resources[i].clid;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable clusterinstance of given name.
	*/
	public static base_response disable(nitro_service client, Long clid) throws Exception {
		clusterinstance disableresource = new clusterinstance();
		disableresource.clid = clid;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable clusterinstance.
	*/
	public static base_response disable(nitro_service client, clusterinstance resource) throws Exception {
		clusterinstance disableresource = new clusterinstance();
		disableresource.clid = resource.clid;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable clusterinstance resources of given names.
	*/
	public static base_responses disable(nitro_service client, Long clid[]) throws Exception {
		base_responses result = null;
		if (clid != null && clid.length > 0) {
			clusterinstance disableresources[] = new clusterinstance[clid.length];
			for (int i=0;i<clid.length;i++){
				disableresources[i] = new clusterinstance();
				disableresources[i].clid = clid[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable clusterinstance resources.
	*/
	public static base_responses disable(nitro_service client, clusterinstance resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			clusterinstance disableresources[] = new clusterinstance[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new clusterinstance();
				disableresources[i].clid = resources[i].clid;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to fetch all the clusterinstance resources that are configured on netscaler.
	*/
	public static clusterinstance[] get(nitro_service service) throws Exception{
		clusterinstance obj = new clusterinstance();
		clusterinstance[] response = (clusterinstance[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the clusterinstance resources that are configured on netscaler.
	*/
	public static clusterinstance[] get(nitro_service service, options option) throws Exception{
		clusterinstance obj = new clusterinstance();
		clusterinstance[] response = (clusterinstance[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch clusterinstance resource of given name .
	*/
	public static clusterinstance get(nitro_service service, Long clid) throws Exception{
		clusterinstance obj = new clusterinstance();
		obj.set_clid(clid);
		clusterinstance response = (clusterinstance) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch clusterinstance resources of given names .
	*/
	public static clusterinstance[] get(nitro_service service, Long clid[]) throws Exception{
		if (clid !=null && clid.length>0) {
			clusterinstance response[] = new clusterinstance[clid.length];
			clusterinstance obj[] = new clusterinstance[clid.length];
			for (int i=0;i<clid.length;i++) {
				obj[i] = new clusterinstance();
				obj[i].set_clid(clid[i]);
				response[i] = (clusterinstance) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of clusterinstance resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static clusterinstance[] get_filtered(nitro_service service, String filter) throws Exception{
		clusterinstance obj = new clusterinstance();
		options option = new options();
		option.set_filter(filter);
		clusterinstance[] response = (clusterinstance[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of clusterinstance resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static clusterinstance[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		clusterinstance obj = new clusterinstance();
		options option = new options();
		option.set_filter(filter);
		clusterinstance[] response = (clusterinstance[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the clusterinstance resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		clusterinstance obj = new clusterinstance();
		options option = new options();
		option.set_count(true);
		clusterinstance[] response = (clusterinstance[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of clusterinstance resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		clusterinstance obj = new clusterinstance();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		clusterinstance[] response = (clusterinstance[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of clusterinstance resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		clusterinstance obj = new clusterinstance();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		clusterinstance[] response = (clusterinstance[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class operationalpropstateEnum {
		public static final String UNKNOWN = "UNKNOWN";
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
		public static final String AUTO_DISABLED = "AUTO DISABLED";
	}
	public static class propstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class statusEnum {
		public static final String DOWN = "DOWN";
		public static final String UP = "UP";
		public static final String PARTIAL_UP = "PARTIAL-UP";
		public static final String UNKNOWN = "UNKNOWN";
	}
	public static class adminstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class preemptionEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class operationalstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
