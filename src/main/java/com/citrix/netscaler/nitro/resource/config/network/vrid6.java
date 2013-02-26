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

class vrid6_response extends base_response
{
	public vrid6[] vrid6;
}
/**
* Configuration for Virtual Router ID for IPv6 resource.
*/

public class vrid6 extends base_resource
{
	private Long id;
	private Boolean all;

	//------- Read only Parameter ---------;

	private String ifaces;
	private String ifnum;
	private String type;
	private Long priority;
	private Long state;
	private Long flags;
	private String ipaddress;
	private Long __count;

	/**
	* <pre>
	* An integer value that uniquely identifies a VMAC6 address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* An integer value that uniquely identifies a VMAC6 address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* An integer value that uniquely identifies a VMAC6 address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* Remove all configured VMAC6 addresses from the NetScaler appliance.
	* </pre>
	*/
	public void set_all(boolean all) throws Exception {
		this.all = new Boolean(all);
	}

	/**
	* <pre>
	* Remove all configured VMAC6 addresses from the NetScaler appliance.
	* </pre>
	*/
	public void set_all(Boolean all) throws Exception{
		this.all = all;
	}

	/**
	* <pre>
	* Remove all configured VMAC6 addresses from the NetScaler appliance.
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
	* Interfaces bound to this vrid.
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* Type (static or dynamic) of this VRID.<br> Possible values = STATIC, DYNAMIC
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The priority of this VRID.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
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
	* Flags.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* The IP address bound to the VRID6.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vrid6_response result = (vrid6_response) service.get_payload_formatter().string_to_resource(vrid6_response.class, response);
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
		return result.vrid6;
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
	* Use this API to add vrid6.
	*/
	public static base_response add(nitro_service client, vrid6 resource) throws Exception {
		vrid6 addresource = new vrid6();
		addresource.id = resource.id;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vrid6 resources.
	*/
	public static base_responses add(nitro_service client, vrid6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vrid6 addresources[] = new vrid6[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vrid6();
				addresources[i].id = resources[i].id;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vrid6 of given name.
	*/
	public static base_response delete(nitro_service client, Long id) throws Exception {
		vrid6 deleteresource = new vrid6();
		deleteresource.id = id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vrid6.
	*/
	public static base_response delete(nitro_service client, vrid6 resource) throws Exception {
		vrid6 deleteresource = new vrid6();
		deleteresource.id = resource.id;
		deleteresource.all = resource.all;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vrid6 resources of given names.
	*/
	public static base_responses delete(nitro_service client, Long id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			vrid6 deleteresources[] = new vrid6[id.length];
			for (int i=0;i<id.length;i++){
				deleteresources[i] = new vrid6();
				deleteresources[i].id = id[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vrid6 resources.
	*/
	public static base_responses delete(nitro_service client, vrid6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vrid6 deleteresources[] = new vrid6[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vrid6();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].all = resources[i].all;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vrid6 resources that are configured on netscaler.
	*/
	public static vrid6[] get(nitro_service service) throws Exception{
		vrid6 obj = new vrid6();
		vrid6[] response = (vrid6[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vrid6 resources that are configured on netscaler.
	*/
	public static vrid6[] get(nitro_service service, options option) throws Exception{
		vrid6 obj = new vrid6();
		vrid6[] response = (vrid6[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vrid6 resource of given name .
	*/
	public static vrid6 get(nitro_service service, Long id) throws Exception{
		vrid6 obj = new vrid6();
		obj.set_id(id);
		vrid6 response = (vrid6) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vrid6 resources of given names .
	*/
	public static vrid6[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			vrid6 response[] = new vrid6[id.length];
			vrid6 obj[] = new vrid6[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new vrid6();
				obj[i].set_id(id[i]);
				response[i] = (vrid6) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vrid6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vrid6[] get_filtered(nitro_service service, String filter) throws Exception{
		vrid6 obj = new vrid6();
		options option = new options();
		option.set_filter(filter);
		vrid6[] response = (vrid6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vrid6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vrid6[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vrid6 obj = new vrid6();
		options option = new options();
		option.set_filter(filter);
		vrid6[] response = (vrid6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vrid6 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vrid6 obj = new vrid6();
		options option = new options();
		option.set_count(true);
		vrid6[] response = (vrid6[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vrid6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vrid6 obj = new vrid6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vrid6[] response = (vrid6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vrid6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vrid6 obj = new vrid6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vrid6[] response = (vrid6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String STATIC = "STATIC";
		public static final String DYNAMIC = "DYNAMIC";
	}
}
