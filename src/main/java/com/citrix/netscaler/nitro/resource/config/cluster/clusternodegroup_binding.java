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

import com.citrix.netscaler.nitro.resource.config.cluster.clusternodegroup_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.cluster.clusternodegroup_nslimitidentifier_binding;
import com.citrix.netscaler.nitro.resource.config.cluster.clusternodegroup_streamidentifier_binding;
import com.citrix.netscaler.nitro.resource.config.cluster.clusternodegroup_clusternode_binding;
import com.citrix.netscaler.nitro.resource.config.cluster.clusternodegroup_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.cluster.clusternodegroup_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.config.cluster.clusternodegroup_crvserver_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class clusternodegroup_binding_response extends base_response
{
	public clusternodegroup_binding[] clusternodegroup_binding;
}
/**
	* Binding class showing the resources that can be bound to clusternodegroup_binding. 
	*/

public class clusternodegroup_binding extends base_resource
{
	private String name;
	private clusternodegroup_csvserver_binding	clusternodegroup_csvserver_binding[] = null;
	private clusternodegroup_nslimitidentifier_binding	clusternodegroup_nslimitidentifier_binding[] = null;
	private clusternodegroup_streamidentifier_binding	clusternodegroup_streamidentifier_binding[] = null;
	private clusternodegroup_clusternode_binding	clusternodegroup_clusternode_binding[] = null;
	private clusternodegroup_lbvserver_binding	clusternodegroup_lbvserver_binding[] = null;
	private clusternodegroup_authenticationvserver_binding	clusternodegroup_authenticationvserver_binding[] = null;
	private clusternodegroup_crvserver_binding	clusternodegroup_crvserver_binding[] = null;

	/**
	* <pre>
	* Name of the nodegroup to be displayed. If a name is not provided, information about all nodegroups is displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the nodegroup to be displayed. If a name is not provided, information about all nodegroups is displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* csvserver that can be bound to clusternodegroup.
	* </pre>
	*/
	public clusternodegroup_csvserver_binding[] get_clusternodegroup_csvserver_bindings() throws Exception {
		return this.clusternodegroup_csvserver_binding;
	}

	/**
	* <pre>
	* crvserver that can be bound to clusternodegroup.
	* </pre>
	*/
	public clusternodegroup_crvserver_binding[] get_clusternodegroup_crvserver_bindings() throws Exception {
		return this.clusternodegroup_crvserver_binding;
	}

	/**
	* <pre>
	* nslimitidentifier that can be bound to clusternodegroup.
	* </pre>
	*/
	public clusternodegroup_nslimitidentifier_binding[] get_clusternodegroup_nslimitidentifier_bindings() throws Exception {
		return this.clusternodegroup_nslimitidentifier_binding;
	}

	/**
	* <pre>
	* streamidentifier that can be bound to clusternodegroup.
	* </pre>
	*/
	public clusternodegroup_streamidentifier_binding[] get_clusternodegroup_streamidentifier_bindings() throws Exception {
		return this.clusternodegroup_streamidentifier_binding;
	}

	/**
	* <pre>
	* clusternode that can be bound to clusternodegroup.
	* </pre>
	*/
	public clusternodegroup_clusternode_binding[] get_clusternodegroup_clusternode_bindings() throws Exception {
		return this.clusternodegroup_clusternode_binding;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to clusternodegroup.
	* </pre>
	*/
	public clusternodegroup_authenticationvserver_binding[] get_clusternodegroup_authenticationvserver_bindings() throws Exception {
		return this.clusternodegroup_authenticationvserver_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to clusternodegroup.
	* </pre>
	*/
	public clusternodegroup_lbvserver_binding[] get_clusternodegroup_lbvserver_bindings() throws Exception {
		return this.clusternodegroup_lbvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusternodegroup_binding_response result = (clusternodegroup_binding_response) service.get_payload_formatter().string_to_resource(clusternodegroup_binding_response.class, response);
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
		return result.clusternodegroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch clusternodegroup_binding resource of given name .
	*/
	public static clusternodegroup_binding get(nitro_service service, String name) throws Exception{
		clusternodegroup_binding obj = new clusternodegroup_binding();
		obj.set_name(name);
		clusternodegroup_binding response = (clusternodegroup_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch clusternodegroup_binding resources of given names .
	*/
	public static clusternodegroup_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			clusternodegroup_binding response[] = new clusternodegroup_binding[name.length];
			clusternodegroup_binding obj[] = new clusternodegroup_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new clusternodegroup_binding();
				obj[i].set_name(name[i]);
				response[i] = (clusternodegroup_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}