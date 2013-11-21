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

class nstcpbufparam_response extends base_response
{
	public nstcpbufparam nstcpbufparam;
}
/**
* Configuration for tcp buffer parameter resource.
*/

public class nstcpbufparam extends base_resource
{
	private Long size;
	private Long memlimit;

	/**
	* <pre>
	* TCP buffering size per connection, in kilobytes.<br> Default value: 64<br> Minimum value =  4<br> Maximum value =  20480
	* </pre>
	*/
	public void set_size(long size) throws Exception {
		this.size = new Long(size);
	}

	/**
	* <pre>
	* TCP buffering size per connection, in kilobytes.<br> Default value: 64<br> Minimum value =  4<br> Maximum value =  20480
	* </pre>
	*/
	public void set_size(Long size) throws Exception{
		this.size = size;
	}

	/**
	* <pre>
	* TCP buffering size per connection, in kilobytes.<br> Default value: 64<br> Minimum value =  4<br> Maximum value =  20480
	* </pre>
	*/
	public Long get_size() throws Exception {
		return this.size;
	}

	/**
	* <pre>
	* Maximum memory, in megabytes, that can be used for buffering.<br> Default value: 64
	* </pre>
	*/
	public void set_memlimit(long memlimit) throws Exception {
		this.memlimit = new Long(memlimit);
	}

	/**
	* <pre>
	* Maximum memory, in megabytes, that can be used for buffering.<br> Default value: 64
	* </pre>
	*/
	public void set_memlimit(Long memlimit) throws Exception{
		this.memlimit = memlimit;
	}

	/**
	* <pre>
	* Maximum memory, in megabytes, that can be used for buffering.<br> Default value: 64
	* </pre>
	*/
	public Long get_memlimit() throws Exception {
		return this.memlimit;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nstcpbufparam[] resources = new nstcpbufparam[1];
		nstcpbufparam_response result = (nstcpbufparam_response) service.get_payload_formatter().string_to_resource(nstcpbufparam_response.class, response);
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
		resources[0] = result.nstcpbufparam;
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
	* Use this API to update nstcpbufparam.
	*/
	public static base_response update(nitro_service client, nstcpbufparam resource) throws Exception {
		nstcpbufparam updateresource = new nstcpbufparam();
		updateresource.size = resource.size;
		updateresource.memlimit = resource.memlimit;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nstcpbufparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nstcpbufparam resource, String[] args) throws Exception{
		nstcpbufparam unsetresource = new nstcpbufparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nstcpbufparam resources that are configured on netscaler.
	*/
	public static nstcpbufparam get(nitro_service service) throws Exception{
		nstcpbufparam obj = new nstcpbufparam();
		nstcpbufparam[] response = (nstcpbufparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nstcpbufparam resources that are configured on netscaler.
	*/
	public static nstcpbufparam get(nitro_service service,  options option) throws Exception{
		nstcpbufparam obj = new nstcpbufparam();
		nstcpbufparam[] response = (nstcpbufparam[])obj.get_resources(service,option);
		return response[0];
	}

}
