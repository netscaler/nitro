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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vrid_response extends base_response
{
	public vrid[] vrid;
}
/**
* Configuration for Virtual Router ID resource.
*/

public class vrid extends base_resource
{
	private Long id;
	private Long priority;
	private String preemption;
	private String sharing;
	private String tracking;
	private Boolean all;

	//------- Read only Parameter ---------;

	private String ifaces;
	private String type;
	private Long effectivepriority;
	private Long flags;
	private String ipaddress;
	private Long state;
	private Long __count;

	/**
	* <pre>
	* An integer value that uniquely identifies the VMAC address. The generic VMAC address is in the form of 00:00:5e:00:01:<VRID>. For example, if you add a VRID with a value of 60 and bind it to an interface, the resulting VMAC address is 00:00:5e:00:01:3c, where 3c is the hexadecimal representation of 60. Minimum value: 1. Maximum value: 255. .<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* An integer value that uniquely identifies the VMAC address. The generic VMAC address is in the form of 00:00:5e:00:01:<VRID>. For example, if you add a VRID with a value of 60 and bind it to an interface, the resulting VMAC address is 00:00:5e:00:01:3c, where 3c is the hexadecimal representation of 60. Minimum value: 1. Maximum value: 255. .<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* An integer value that uniquely identifies the VMAC address. The generic VMAC address is in the form of 00:00:5e:00:01:<VRID>. For example, if you add a VRID with a value of 60 and bind it to an interface, the resulting VMAC address is 00:00:5e:00:01:3c, where 3c is the hexadecimal representation of 60. Minimum value: 1. Maximum value: 255. .<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* Base priority (BP) that determines the master VIP address. Set this parameter only if you are configuring the appliance in the active-active mode.<br> Default value: 255<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Base priority (BP) that determines the master VIP address. Set this parameter only if you are configuring the appliance in the active-active mode.<br> Default value: 255<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Base priority (BP) that determines the master VIP address. Set this parameter only if you are configuring the appliance in the active-active mode.<br> Default value: 255<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Make a backup VIP address the master if its priority becomes higher than that of a master VIP address bound to this VMAC address. Set this parameter only if you are configuring the appliance in the active-active mode.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_preemption(String preemption) throws Exception{
		this.preemption = preemption;
	}

	/**
	* <pre>
	* Make a backup VIP address the master if its priority becomes higher than that of a master VIP address bound to this VMAC address. Set this parameter only if you are configuring the appliance in the active-active mode.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_preemption() throws Exception {
		return this.preemption;
	}

	/**
	* <pre>
	* Enable the backup VIP address to process any traffic, instead of dropping the traffic. Set this parameter only if you are configuring the appliance in the active-active mode.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sharing(String sharing) throws Exception{
		this.sharing = sharing;
	}

	/**
	* <pre>
	* Enable the backup VIP address to process any traffic, instead of dropping the traffic. Set this parameter only if you are configuring the appliance in the active-active mode.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sharing() throws Exception {
		return this.sharing;
	}

	/**
	* <pre>
	* The effective priority (EP) value, relative to the base priority (BP) value. Set this parameter only if you are configuring the appliance in the active-active mode.
When EP is set to a value other than None, it is EP, not BP, which determines the master VIP address.
For example, if a VIP address on NetScaler appliance NS1 has a priority of 101, and the same VIP address on NS2 has a priority of 99, the VIP address on NS1 is active. However, if  two virtual servers are using the VIP address on NS1, and one of them is DOWN, health tracking can reduce the EP of VIP on NS1. VRRP then makes the VIP address on NS2 the active VIP address.
Possible values for EP are:
                          NONE. No tracking. EP=BP. (This is the default.)
                          ALL. If the status of all virtual servers is UP, EP=BP.  Otherwise, EP=0.
                          ONE. If the status of at least one virtual server is UP, EP=BP. Otherwise, EP=0.
                          PROGRESSIVE. If the status of all virtual servers is UP, EP=BP. If the status of all virtual servers is DOWN, EP=0. Otherwise EP=BP (1 - K/N), where N is the total number of virtual servers associated with the VIP address and K is the number of virtual servers whose status is DOWN.<br> Default value: TRACK_NONE<br> Possible values = NONE, ONE, ALL, PROGRESSIVE
	* </pre>
	*/
	public void set_tracking(String tracking) throws Exception{
		this.tracking = tracking;
	}

	/**
	* <pre>
	* The effective priority (EP) value, relative to the base priority (BP) value. Set this parameter only if you are configuring the appliance in the active-active mode.
When EP is set to a value other than None, it is EP, not BP, which determines the master VIP address.
For example, if a VIP address on NetScaler appliance NS1 has a priority of 101, and the same VIP address on NS2 has a priority of 99, the VIP address on NS1 is active. However, if  two virtual servers are using the VIP address on NS1, and one of them is DOWN, health tracking can reduce the EP of VIP on NS1. VRRP then makes the VIP address on NS2 the active VIP address.
Possible values for EP are:
                          NONE. No tracking. EP=BP. (This is the default.)
                          ALL. If the status of all virtual servers is UP, EP=BP.  Otherwise, EP=0.
                          ONE. If the status of at least one virtual server is UP, EP=BP. Otherwise, EP=0.
                          PROGRESSIVE. If the status of all virtual servers is UP, EP=BP. If the status of all virtual servers is DOWN, EP=0. Otherwise EP=BP (1 - K/N), where N is the total number of virtual servers associated with the VIP address and K is the number of virtual servers whose status is DOWN.<br> Default value: TRACK_NONE<br> Possible values = NONE, ONE, ALL, PROGRESSIVE
	* </pre>
	*/
	public String get_tracking() throws Exception {
		return this.tracking;
	}

	/**
	* <pre>
	* Remove all the configured VMAC addresses from the NetScaler appliance.
	* </pre>
	*/
	public void set_all(boolean all) throws Exception {
		this.all = new Boolean(all);
	}

	/**
	* <pre>
	* Remove all the configured VMAC addresses from the NetScaler appliance.
	* </pre>
	*/
	public void set_all(Boolean all) throws Exception{
		this.all = all;
	}

	/**
	* <pre>
	* Remove all the configured VMAC addresses from the NetScaler appliance.
	* </pre>
	*/
	public Boolean get_all() throws Exception {
		return this.all;
	}

	/**
	* <pre>
	* Interfaces bound to this VRID.
	* </pre>
	*/
	public String get_ifaces() throws Exception {
		return this.ifaces;
	}

	/**
	* <pre>
	* Indicates whether this VRID entry was added manually or dynamically. When you manually add a VRID entry, the value for this parameter is STATIC. Otherwise, it is DYNAMIC.<br> Possible values = STATIC, DYNAMIC
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The effective priority of this VRID.
	* </pre>
	*/
	public Long get_effectivepriority() throws Exception {
		return this.effectivepriority;
	}

	/**
	* <pre>
	* Flags.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* The IP address bound to the VRID.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* State of this VRID.
	* </pre>
	*/
	public Long get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vrid_response result = (vrid_response) service.get_payload_formatter().string_to_resource(vrid_response.class, response);
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
		return result.vrid;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	/**
	* Use this API to add vrid.
	*/
	public static base_response add(nitro_service client, vrid resource) throws Exception {
		vrid addresource = new vrid();
		addresource.id = resource.id;
		addresource.priority = resource.priority;
		addresource.preemption = resource.preemption;
		addresource.sharing = resource.sharing;
		addresource.tracking = resource.tracking;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vrid resources.
	*/
	public static base_responses add(nitro_service client, vrid resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vrid addresources[] = new vrid[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vrid();
				addresources[i].id = resources[i].id;
				addresources[i].priority = resources[i].priority;
				addresources[i].preemption = resources[i].preemption;
				addresources[i].sharing = resources[i].sharing;
				addresources[i].tracking = resources[i].tracking;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vrid of given name.
	*/
	public static base_response delete(nitro_service client, Long id) throws Exception {
		vrid deleteresource = new vrid();
		deleteresource.id = id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vrid.
	*/
	public static base_response delete(nitro_service client, vrid resource) throws Exception {
		vrid deleteresource = new vrid();
		deleteresource.id = resource.id;
		deleteresource.all = resource.all;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vrid resources of given names.
	*/
	public static base_responses delete(nitro_service client, Long id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			vrid deleteresources[] = new vrid[id.length];
			for (int i=0;i<id.length;i++){
				deleteresources[i] = new vrid();
				deleteresources[i].id = id[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vrid resources.
	*/
	public static base_responses delete(nitro_service client, vrid resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vrid deleteresources[] = new vrid[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vrid();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].all = resources[i].all;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vrid.
	*/
	public static base_response update(nitro_service client, vrid resource) throws Exception {
		vrid updateresource = new vrid();
		updateresource.id = resource.id;
		updateresource.priority = resource.priority;
		updateresource.preemption = resource.preemption;
		updateresource.sharing = resource.sharing;
		updateresource.tracking = resource.tracking;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vrid resources.
	*/
	public static base_responses update(nitro_service client, vrid resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vrid updateresources[] = new vrid[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vrid();
				updateresources[i].id = resources[i].id;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].preemption = resources[i].preemption;
				updateresources[i].sharing = resources[i].sharing;
				updateresources[i].tracking = resources[i].tracking;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vrid resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, Long id, String args[]) throws Exception {
		vrid unsetresource = new vrid();
		unsetresource.id = id;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of vrid resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vrid resource, String[] args) throws Exception{
		vrid unsetresource = new vrid();
		unsetresource.id = resource.id;
		unsetresource.priority = resource.priority;
		unsetresource.preemption = resource.preemption;
		unsetresource.sharing = resource.sharing;
		unsetresource.tracking = resource.tracking;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vrid resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Long id[], String args[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			vrid unsetresources[] = new vrid[id.length];
			for (int i=0;i<id.length;i++){
				unsetresources[i] = new vrid();
				unsetresources[i].id = id[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vrid resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vrid resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vrid unsetresources[] = new vrid[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vrid();
				unsetresources[i].id = resources[i].id;
				unsetresources[i].priority = resources[i].priority;
				unsetresources[i].preemption = resources[i].preemption;
				unsetresources[i].sharing = resources[i].sharing;
				unsetresources[i].tracking = resources[i].tracking;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vrid resources that are configured on netscaler.
	*/
	public static vrid[] get(nitro_service service) throws Exception{
		vrid obj = new vrid();
		vrid[] response = (vrid[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vrid resources that are configured on netscaler.
	*/
	public static vrid[] get(nitro_service service, options option) throws Exception{
		vrid obj = new vrid();
		vrid[] response = (vrid[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vrid resource of given name .
	*/
	public static vrid get(nitro_service service, Long id) throws Exception{
		vrid obj = new vrid();
		obj.set_id(id);
		vrid response = (vrid) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vrid resources of given names .
	*/
	public static vrid[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			vrid response[] = new vrid[id.length];
			vrid obj[] = new vrid[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new vrid();
				obj[i].set_id(id[i]);
				response[i] = (vrid) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vrid resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vrid[] get_filtered(nitro_service service, String filter) throws Exception{
		vrid obj = new vrid();
		options option = new options();
		option.set_filter(filter);
		vrid[] response = (vrid[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vrid resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vrid[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vrid obj = new vrid();
		options option = new options();
		option.set_filter(filter);
		vrid[] response = (vrid[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vrid resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vrid obj = new vrid();
		options option = new options();
		option.set_count(true);
		vrid[] response = (vrid[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vrid resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vrid obj = new vrid();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vrid[] response = (vrid[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vrid resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vrid obj = new vrid();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vrid[] response = (vrid[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class sharingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class preemptionEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String STATIC = "STATIC";
		public static final String DYNAMIC = "DYNAMIC";
	}
	public static class trackingEnum {
		public static final String NONE = "NONE";
		public static final String ONE = "ONE";
		public static final String ALL = "ALL";
		public static final String PROGRESSIVE = "PROGRESSIVE";
	}
}
