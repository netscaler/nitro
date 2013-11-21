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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbmonitor_servicegroup_binding_response extends base_response
{
	public lbmonitor_servicegroup_binding[] lbmonitor_servicegroup_binding;
}
/**
	* Binding class showing the servicegroup that can be bound to lbmonitor.
	*/

public class lbmonitor_servicegroup_binding extends base_resource
{
	private String monitorname;
	private String servicename;
	private String dup_state;
	private Long dup_weight;
	private String servicegroupname;
	private String state;
	private Long weight;

	/**
	* <pre>
	* Name of the service group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* Name of the service group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* State of the monitor. The state setting for a monitor of a given type affects all monitors of that type. For example, if an HTTP monitor is enabled, all HTTP monitors on the appliance are (or remain) enabled. If an HTTP monitor is disabled, all HTTP monitors on the appliance are disabled.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dup_state(String dup_state) throws Exception{
		this.dup_state = dup_state;
	}

	/**
	* <pre>
	* State of the monitor. The state setting for a monitor of a given type affects all monitors of that type. For example, if an HTTP monitor is enabled, all HTTP monitors on the appliance are (or remain) enabled. If an HTTP monitor is disabled, all HTTP monitors on the appliance are disabled.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dup_state() throws Exception {
		return this.dup_state;
	}

	/**
	* <pre>
	* Name of the service or service group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* Name of the service or service group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* State of the monitor. The state setting for a monitor of a given type affects all monitors of that type. For example, if an HTTP monitor is enabled, all HTTP monitors on the appliance are (or remain) enabled. If an HTTP monitor is disabled, all HTTP monitors on the appliance are disabled.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* State of the monitor. The state setting for a monitor of a given type affects all monitors of that type. For example, if an HTTP monitor is enabled, all HTTP monitors on the appliance are (or remain) enabled. If an HTTP monitor is disabled, all HTTP monitors on the appliance are disabled.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Weight to assign to the binding between the monitor and service.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dup_weight(long dup_weight) throws Exception {
		this.dup_weight = new Long(dup_weight);
	}

	/**
	* <pre>
	* Weight to assign to the binding between the monitor and service.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dup_weight(Long dup_weight) throws Exception{
		this.dup_weight = dup_weight;
	}

	/**
	* <pre>
	* Weight to assign to the binding between the monitor and service.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_dup_weight() throws Exception {
		return this.dup_weight;
	}

	/**
	* <pre>
	* Name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitorname(String monitorname) throws Exception{
		this.monitorname = monitorname;
	}

	/**
	* <pre>
	* Name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitorname() throws Exception {
		return this.monitorname;
	}

	/**
	* <pre>
	* Weight to assign to the binding between the monitor and service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Weight to assign to the binding between the monitor and service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Weight to assign to the binding between the monitor and service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonitor_servicegroup_binding_response result = (lbmonitor_servicegroup_binding_response) service.get_payload_formatter().string_to_resource(lbmonitor_servicegroup_binding_response.class, response);
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
		return result.lbmonitor_servicegroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.monitorname;
	}

	public static base_response add(nitro_service client, lbmonitor_servicegroup_binding resource) throws Exception {
		lbmonitor_servicegroup_binding updateresource = new lbmonitor_servicegroup_binding();
		updateresource.monitorname = resource.monitorname;
		updateresource.servicename = resource.servicename;
		updateresource.dup_state = resource.dup_state;
		updateresource.dup_weight = resource.dup_weight;
		updateresource.servicegroupname = resource.servicegroupname;
		updateresource.state = resource.state;
		updateresource.weight = resource.weight;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, lbmonitor_servicegroup_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor_servicegroup_binding updateresources[] = new lbmonitor_servicegroup_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbmonitor_servicegroup_binding();
				updateresources[i].monitorname = resources[i].monitorname;
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].dup_state = resources[i].dup_state;
				updateresources[i].dup_weight = resources[i].dup_weight;
				updateresources[i].servicegroupname = resources[i].servicegroupname;
				updateresources[i].state = resources[i].state;
				updateresources[i].weight = resources[i].weight;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, lbmonitor_servicegroup_binding resource) throws Exception {
		lbmonitor_servicegroup_binding deleteresource = new lbmonitor_servicegroup_binding();
		deleteresource.monitorname = resource.monitorname;
		deleteresource.servicename = resource.servicename;
		deleteresource.servicegroupname = resource.servicegroupname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, lbmonitor_servicegroup_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor_servicegroup_binding deleteresources[] = new lbmonitor_servicegroup_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbmonitor_servicegroup_binding();
				deleteresources[i].monitorname = resources[i].monitorname;
				deleteresources[i].servicename = resources[i].servicename;
				deleteresources[i].servicegroupname = resources[i].servicegroupname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	public static class dup_stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}