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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cluster_response extends base_response
{
	public cluster cluster;
}

public class cluster extends base_resource
{
	private String clip;
	private String password;

	/**
	* <pre>
	* The cluster IP address to which you are trying to add the node.
	* </pre>
	*/
	public void set_clip(String clip) throws Exception{
		this.clip = clip;
	}

	/**
	* <pre>
	* The cluster IP address to which you are trying to add the node.
	* </pre>
	*/
	public String get_clip() throws Exception {
		return this.clip;
	}

	/**
	* <pre>
	* The password for the nsroot account of the configuration coordinator (CCO).
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* The password for the nsroot account of the configuration coordinator (CCO).
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		cluster[] resources = new cluster[1];
		cluster_response result = (cluster_response) service.get_payload_formatter().string_to_resource(cluster_response.class, response);
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
		resources[0] = result.cluster;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.clip;
	}

	/**
	* Use this API to join cluster.
	*/
	public static base_response join(nitro_service client, cluster resource) throws Exception {
		cluster joinresource = new cluster();
		joinresource.clip = resource.clip;
		joinresource.password = resource.password;
		return joinresource.perform_operation(client,"join");
	}

}
