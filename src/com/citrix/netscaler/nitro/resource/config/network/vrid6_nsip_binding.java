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

class vrid6_nsip_binding_response extends base_response
{
	public vrid6_nsip_binding[] vrid6_nsip_binding;
}
/**
	* Binding class showing the nsip that can be bound to vrid6.
	*/

public class vrid6_nsip_binding extends base_resource
{
	private String ipaddress;
	private Long flags;
	private Long id;
	private String ifnum;
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
	* Interfaces that you want to bind to the VMAC6. The format for specifying an interface is in slot/port notation, (for example, 1/2).
	* </pre>
	*/
	public void set_ifnum(String ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* Interfaces that you want to bind to the VMAC6. The format for specifying an interface is in slot/port notation, (for example, 1/2).
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* The IP address bound to the VRID6.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
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
	* Flags.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vrid6_nsip_binding_response result = (vrid6_nsip_binding_response) service.get_payload_formatter().string_to_resource(vrid6_nsip_binding_response.class, response);
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
		return result.vrid6_nsip_binding;
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
	* Use this API to fetch vrid6_nsip_binding resources of given name .
	*/
	public static vrid6_nsip_binding[] get(nitro_service service, Long id) throws Exception{
		vrid6_nsip_binding obj = new vrid6_nsip_binding();
		obj.set_id(id);
		vrid6_nsip_binding response[] = (vrid6_nsip_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vrid6_nsip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vrid6_nsip_binding[] get_filtered(nitro_service service, Long id, String filter) throws Exception{
		vrid6_nsip_binding obj = new vrid6_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		vrid6_nsip_binding[] response = (vrid6_nsip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vrid6_nsip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vrid6_nsip_binding[] get_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		vrid6_nsip_binding obj = new vrid6_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		vrid6_nsip_binding[] response = (vrid6_nsip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vrid6_nsip_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long id) throws Exception{
		vrid6_nsip_binding obj = new vrid6_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		vrid6_nsip_binding response[] = (vrid6_nsip_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vrid6_nsip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long id, String filter) throws Exception{
		vrid6_nsip_binding obj = new vrid6_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vrid6_nsip_binding[] response = (vrid6_nsip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vrid6_nsip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		vrid6_nsip_binding obj = new vrid6_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vrid6_nsip_binding[] response = (vrid6_nsip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}