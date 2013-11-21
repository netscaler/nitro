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

package com.citrix.netscaler.nitro.resource.config.ha;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class hanode_ci_binding_response extends base_response
{
	public hanode_ci_binding[] hanode_ci_binding;
}
/**
	* Binding class showing the ci that can be bound to hanode.
	*/

public class hanode_ci_binding extends base_resource
{
	private String enaifaces;
	private Long id;
	private String routemonitor;
	private Long __count;

	/**
	* <pre>
	* Enabled interfaces.
	* </pre>
	*/
	public void set_enaifaces(String enaifaces) throws Exception{
		this.enaifaces = enaifaces;
	}

	/**
	* <pre>
	* Enabled interfaces.
	* </pre>
	*/
	public String get_enaifaces() throws Exception {
		return this.enaifaces;
	}

	/**
	* <pre>
	* A route that you want the NetScaler appliance to monitor in its internal routing table. You can specify an IPv4 address or network, or an IPv6 address or network prefix. If you specify an IPv4 network address or IPv6 network prefix, the appliance monitors any route that matches the network or prefix.<br> Minimum length =  1
	* </pre>
	*/
	public void set_routemonitor(String routemonitor) throws Exception{
		this.routemonitor = routemonitor;
	}

	/**
	* <pre>
	* A route that you want the NetScaler appliance to monitor in its internal routing table. You can specify an IPv4 address or network, or an IPv6 address or network prefix. If you specify an IPv4 network address or IPv6 network prefix, the appliance monitors any route that matches the network or prefix.<br> Minimum length =  1
	* </pre>
	*/
	public String get_routemonitor() throws Exception {
		return this.routemonitor;
	}

	/**
	* <pre>
	* Number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* Number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* Number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		hanode_ci_binding_response result = (hanode_ci_binding_response) service.get_payload_formatter().string_to_resource(hanode_ci_binding_response.class, response);
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
		return result.hanode_ci_binding;
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
	* Use this API to fetch hanode_ci_binding resources of given name .
	*/
	public static hanode_ci_binding[] get(nitro_service service, Long id) throws Exception{
		hanode_ci_binding obj = new hanode_ci_binding();
		obj.set_id(id);
		hanode_ci_binding response[] = (hanode_ci_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of hanode_ci_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static hanode_ci_binding[] get_filtered(nitro_service service, Long id, String filter) throws Exception{
		hanode_ci_binding obj = new hanode_ci_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		hanode_ci_binding[] response = (hanode_ci_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of hanode_ci_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static hanode_ci_binding[] get_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		hanode_ci_binding obj = new hanode_ci_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		hanode_ci_binding[] response = (hanode_ci_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count hanode_ci_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long id) throws Exception{
		hanode_ci_binding obj = new hanode_ci_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		hanode_ci_binding response[] = (hanode_ci_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of hanode_ci_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long id, String filter) throws Exception{
		hanode_ci_binding obj = new hanode_ci_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hanode_ci_binding[] response = (hanode_ci_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of hanode_ci_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		hanode_ci_binding obj = new hanode_ci_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hanode_ci_binding[] response = (hanode_ci_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}