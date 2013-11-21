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

import com.citrix.netscaler.nitro.resource.config.cluster.clusterinstance_clusternode_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class clusterinstance_binding_response extends base_response
{
	public clusterinstance_binding[] clusterinstance_binding;
}
/**
	* Binding class showing the resources that can be bound to clusterinstance_binding. 
	*/

public class clusterinstance_binding extends base_resource
{
	private Long clid;
	private clusterinstance_clusternode_binding	clusterinstance_clusternode_binding[] = null;

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
	* clusternode that can be bound to clusterinstance.
	* </pre>
	*/
	public clusterinstance_clusternode_binding[] get_clusterinstance_clusternode_bindings() throws Exception {
		return this.clusterinstance_clusternode_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusterinstance_binding_response result = (clusterinstance_binding_response) service.get_payload_formatter().string_to_resource(clusterinstance_binding_response.class, response);
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
		return result.clusterinstance_binding;
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
	* Use this API to fetch clusterinstance_binding resource of given name .
	*/
	public static clusterinstance_binding get(nitro_service service, Long clid) throws Exception{
		clusterinstance_binding obj = new clusterinstance_binding();
		obj.set_clid(clid);
		clusterinstance_binding response = (clusterinstance_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch clusterinstance_binding resources of given names .
	*/
	public static clusterinstance_binding[] get(nitro_service service, Long clid[]) throws Exception{
		if (clid !=null && clid.length>0) {
			clusterinstance_binding response[] = new clusterinstance_binding[clid.length];
			clusterinstance_binding obj[] = new clusterinstance_binding[clid.length];
			for (int i=0;i<clid.length;i++) {
				obj[i] = new clusterinstance_binding();
				obj[i].set_clid(clid[i]);
				response[i] = (clusterinstance_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}