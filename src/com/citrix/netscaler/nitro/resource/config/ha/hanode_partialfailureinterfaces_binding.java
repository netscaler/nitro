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

class hanode_partialfailureinterfaces_binding_response extends base_response
{
	public hanode_partialfailureinterfaces_binding[] hanode_partialfailureinterfaces_binding;
}
/**
	* Binding class showing the partialfailureinterfaces that can be bound to hanode.
	*/

public class hanode_partialfailureinterfaces_binding extends base_resource
{
	private String pfifaces;
	private Long id;
	private String routemonitor;
	private Long __count;

	/**
	* <pre>
	* Interfaces causing Partial Failure.
	* </pre>
	*/
	public void set_pfifaces(String pfifaces) throws Exception{
		this.pfifaces = pfifaces;
	}

	/**
	* <pre>
	* Interfaces causing Partial Failure.
	* </pre>
	*/
	public String get_pfifaces() throws Exception {
		return this.pfifaces;
	}

	/**
	* <pre>
	* Route Monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_routemonitor(String routemonitor) throws Exception{
		this.routemonitor = routemonitor;
	}

	/**
	* <pre>
	* Route Monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_routemonitor() throws Exception {
		return this.routemonitor;
	}

	/**
	* <pre>
	* A number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* A number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* A number that uniquely identifies the local node. The ID of the local node is always 0.<br> Minimum value =  0<br> Maximum value =  64
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
		hanode_partialfailureinterfaces_binding_response result = (hanode_partialfailureinterfaces_binding_response) service.get_payload_formatter().string_to_resource(hanode_partialfailureinterfaces_binding_response.class, response);
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
		return result.hanode_partialfailureinterfaces_binding;
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
	* Use this API to fetch hanode_partialfailureinterfaces_binding resources of given name .
	*/
	public static hanode_partialfailureinterfaces_binding[] get(nitro_service service, Long id) throws Exception{
		hanode_partialfailureinterfaces_binding obj = new hanode_partialfailureinterfaces_binding();
		obj.set_id(id);
		hanode_partialfailureinterfaces_binding response[] = (hanode_partialfailureinterfaces_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of hanode_partialfailureinterfaces_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static hanode_partialfailureinterfaces_binding[] get_filtered(nitro_service service, Long id, String filter) throws Exception{
		hanode_partialfailureinterfaces_binding obj = new hanode_partialfailureinterfaces_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		hanode_partialfailureinterfaces_binding[] response = (hanode_partialfailureinterfaces_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of hanode_partialfailureinterfaces_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static hanode_partialfailureinterfaces_binding[] get_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		hanode_partialfailureinterfaces_binding obj = new hanode_partialfailureinterfaces_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		hanode_partialfailureinterfaces_binding[] response = (hanode_partialfailureinterfaces_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count hanode_partialfailureinterfaces_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long id) throws Exception{
		hanode_partialfailureinterfaces_binding obj = new hanode_partialfailureinterfaces_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		hanode_partialfailureinterfaces_binding response[] = (hanode_partialfailureinterfaces_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of hanode_partialfailureinterfaces_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long id, String filter) throws Exception{
		hanode_partialfailureinterfaces_binding obj = new hanode_partialfailureinterfaces_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hanode_partialfailureinterfaces_binding[] response = (hanode_partialfailureinterfaces_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of hanode_partialfailureinterfaces_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		hanode_partialfailureinterfaces_binding obj = new hanode_partialfailureinterfaces_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hanode_partialfailureinterfaces_binding[] response = (hanode_partialfailureinterfaces_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}