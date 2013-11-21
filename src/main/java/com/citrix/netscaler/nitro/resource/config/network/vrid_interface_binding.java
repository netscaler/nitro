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

class vrid_interface_binding_response extends base_response
{
	public vrid_interface_binding[] vrid_interface_binding;
}
/**
	* Binding class showing the interface that can be bound to vrid.
	*/

public class vrid_interface_binding extends base_resource
{
	private String ifaces;
	private Long vlan;
	private Long flags;
	private Long id;
	private String ifnum;
	private Long __count;

	/**
	* <pre>
	* Interfaces bound to this VRID.
	* </pre>
	*/
	public void set_ifaces(String ifaces) throws Exception{
		this.ifaces = ifaces;
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
	* Interfaces to bind to the VMAC, specified in (slot/port) notation (for example, 1/2).Use spaces to separate multiple entries.
	* </pre>
	*/
	public void set_ifnum(String ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* Interfaces to bind to the VMAC, specified in (slot/port) notation (for example, 1/2).Use spaces to separate multiple entries.
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* Integer that uniquely identifies the VMAC address. The generic VMAC address is in the form of 00:00:5e:00:01:<VRID>. For example, if you add a VRID with a value of 60 and bind it to an interface, the resulting VMAC address is 00:00:5e:00:01:3c, where 3c is the hexadecimal representation of 60.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* Integer that uniquely identifies the VMAC address. The generic VMAC address is in the form of 00:00:5e:00:01:<VRID>. For example, if you add a VRID with a value of 60 and bind it to an interface, the resulting VMAC address is 00:00:5e:00:01:3c, where 3c is the hexadecimal representation of 60.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* Integer that uniquely identifies the VMAC address. The generic VMAC address is in the form of 00:00:5e:00:01:<VRID>. For example, if you add a VRID with a value of 60 and bind it to an interface, the resulting VMAC address is 00:00:5e:00:01:3c, where 3c is the hexadecimal representation of 60.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
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
	* The VLAN in which this VRID resides.
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vrid_interface_binding_response result = (vrid_interface_binding_response) service.get_payload_formatter().string_to_resource(vrid_interface_binding_response.class, response);
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
		return result.vrid_interface_binding;
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

	public static base_response add(nitro_service client, vrid_interface_binding resource) throws Exception {
		vrid_interface_binding updateresource = new vrid_interface_binding();
		updateresource.id = resource.id;
		updateresource.ifnum = resource.ifnum;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vrid_interface_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vrid_interface_binding updateresources[] = new vrid_interface_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vrid_interface_binding();
				updateresources[i].id = resources[i].id;
				updateresources[i].ifnum = resources[i].ifnum;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vrid_interface_binding resource) throws Exception {
		vrid_interface_binding deleteresource = new vrid_interface_binding();
		deleteresource.id = resource.id;
		deleteresource.ifnum = resource.ifnum;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vrid_interface_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vrid_interface_binding deleteresources[] = new vrid_interface_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vrid_interface_binding();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].ifnum = resources[i].ifnum;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch vrid_interface_binding resources of given name .
	*/
	public static vrid_interface_binding[] get(nitro_service service, Long id) throws Exception{
		vrid_interface_binding obj = new vrid_interface_binding();
		obj.set_id(id);
		vrid_interface_binding response[] = (vrid_interface_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vrid_interface_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vrid_interface_binding[] get_filtered(nitro_service service, Long id, String filter) throws Exception{
		vrid_interface_binding obj = new vrid_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		vrid_interface_binding[] response = (vrid_interface_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vrid_interface_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vrid_interface_binding[] get_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		vrid_interface_binding obj = new vrid_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		vrid_interface_binding[] response = (vrid_interface_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vrid_interface_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long id) throws Exception{
		vrid_interface_binding obj = new vrid_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		vrid_interface_binding response[] = (vrid_interface_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vrid_interface_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long id, String filter) throws Exception{
		vrid_interface_binding obj = new vrid_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vrid_interface_binding[] response = (vrid_interface_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vrid_interface_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		vrid_interface_binding obj = new vrid_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vrid_interface_binding[] response = (vrid_interface_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}