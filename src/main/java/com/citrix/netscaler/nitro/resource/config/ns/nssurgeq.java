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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nssurgeq_response extends base_response
{
	public nssurgeq nssurgeq;
}
/**
* Configuration for surge queue resource.
*/

public class nssurgeq extends base_resource
{
	private String name;
	private String servername;
	private Integer port;

	/**
	* <pre>
	* Name of a virtual server, service or service group for which the SurgeQ must be flushed.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of a virtual server, service or service group for which the SurgeQ must be flushed.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Name of a service group member. This argument is needed when you want to flush the SurgeQ of a service group.
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* Name of a service group member. This argument is needed when you want to flush the SurgeQ of a service group.
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* port on which server is bound to the entity(Servicegroup).<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* port on which server is bound to the entity(Servicegroup).<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* port on which server is bound to the entity(Servicegroup).<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nssurgeq[] resources = new nssurgeq[1];
		nssurgeq_response result = (nssurgeq_response) service.get_payload_formatter().string_to_resource(nssurgeq_response.class, response);
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
		resources[0] = result.nssurgeq;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to flush nssurgeq.
	*/
	public static base_response flush(nitro_service client, nssurgeq resource) throws Exception {
		nssurgeq flushresource = new nssurgeq();
		flushresource.name = resource.name;
		flushresource.servername = resource.servername;
		flushresource.port = resource.port;
		return flushresource.perform_operation(client,"flush");
	}

}
