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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.config.ns.nstrafficdomain_bridgegroup_binding;
import com.citrix.netscaler.nitro.resource.config.ns.nstrafficdomain_vlan_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nstrafficdomain_binding_response extends base_response
{
	public nstrafficdomain_binding[] nstrafficdomain_binding;
}
/**
	* Binding class showing the resources that can be bound to nstrafficdomain_binding. 
	*/

public class nstrafficdomain_binding extends base_resource
{
	private Long td;
	private nstrafficdomain_bridgegroup_binding	nstrafficdomain_bridgegroup_binding[] = null;
	private nstrafficdomain_vlan_binding	nstrafficdomain_vlan_binding[] = null;

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* vlan that can be bound to nstrafficdomain.
	* </pre>
	*/
	public nstrafficdomain_vlan_binding[] get_nstrafficdomain_vlan_bindings() throws Exception {
		return this.nstrafficdomain_vlan_binding;
	}

	/**
	* <pre>
	* bridgegroup that can be bound to nstrafficdomain.
	* </pre>
	*/
	public nstrafficdomain_bridgegroup_binding[] get_nstrafficdomain_bridgegroup_bindings() throws Exception {
		return this.nstrafficdomain_bridgegroup_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nstrafficdomain_binding_response result = (nstrafficdomain_binding_response) service.get_payload_formatter().string_to_resource(nstrafficdomain_binding_response.class, response);
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
		return result.nstrafficdomain_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.td != null) {
			return this.td.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch nstrafficdomain_binding resource of given name .
	*/
	public static nstrafficdomain_binding get(nitro_service service, Long td) throws Exception{
		nstrafficdomain_binding obj = new nstrafficdomain_binding();
		obj.set_td(td);
		nstrafficdomain_binding response = (nstrafficdomain_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nstrafficdomain_binding resources of given names .
	*/
	public static nstrafficdomain_binding[] get(nitro_service service, Long td[]) throws Exception{
		if (td !=null && td.length>0) {
			nstrafficdomain_binding response[] = new nstrafficdomain_binding[td.length];
			nstrafficdomain_binding obj[] = new nstrafficdomain_binding[td.length];
			for (int i=0;i<td.length;i++) {
				obj[i] = new nstrafficdomain_binding();
				obj[i].set_td(td[i]);
				response[i] = (nstrafficdomain_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}