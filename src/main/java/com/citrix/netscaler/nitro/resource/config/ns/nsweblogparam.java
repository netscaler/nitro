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

class nsweblogparam_response extends base_response
{
	public nsweblogparam nsweblogparam;
}
/**
* Configuration for Web log parameters resource.
*/

public class nsweblogparam extends base_resource
{
	private Long buffersizemb;
	private String[] customreqhdrs;
	private String[] customrsphdrs;

	/**
	* <pre>
	* Buffer size, in MB, allocated for log transaction data on the system. The maximum value is limited to the memory available on the system. Note: For the change in buffer size to take effect, you must disable and then re-enable the Web Server Logging feature on the appliance.<br> Default value: 16<br> Minimum value =  1<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_buffersizemb(long buffersizemb) throws Exception {
		this.buffersizemb = new Long(buffersizemb);
	}

	/**
	* <pre>
	* Buffer size, in MB, allocated for log transaction data on the system. The maximum value is limited to the memory available on the system. Note: For the change in buffer size to take effect, you must disable and then re-enable the Web Server Logging feature on the appliance.<br> Default value: 16<br> Minimum value =  1<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_buffersizemb(Long buffersizemb) throws Exception{
		this.buffersizemb = buffersizemb;
	}

	/**
	* <pre>
	* Buffer size, in MB, allocated for log transaction data on the system. The maximum value is limited to the memory available on the system. Note: For the change in buffer size to take effect, you must disable and then re-enable the Web Server Logging feature on the appliance.<br> Default value: 16<br> Minimum value =  1<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public Long get_buffersizemb() throws Exception {
		return this.buffersizemb;
	}

	/**
	* <pre>
	* Name(s) of HTTP request headers whose values should be exported by the Web Logging feature. A maximum of two header names can be configured, with each header name having a maximum length of 31 characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_customreqhdrs(String[] customreqhdrs) throws Exception{
		this.customreqhdrs = customreqhdrs;
	}

	/**
	* <pre>
	* Name(s) of HTTP request headers whose values should be exported by the Web Logging feature. A maximum of two header names can be configured, with each header name having a maximum length of 31 characters.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_customreqhdrs() throws Exception {
		return this.customreqhdrs;
	}

	/**
	* <pre>
	* Name(s) of HTTP response headers whose values should be exported by the Web Logging feature. A maximum of two header names can be configured, with each header name having a maximum length of 31 characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_customrsphdrs(String[] customrsphdrs) throws Exception{
		this.customrsphdrs = customrsphdrs;
	}

	/**
	* <pre>
	* Name(s) of HTTP response headers whose values should be exported by the Web Logging feature. A maximum of two header names can be configured, with each header name having a maximum length of 31 characters.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_customrsphdrs() throws Exception {
		return this.customrsphdrs;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsweblogparam[] resources = new nsweblogparam[1];
		nsweblogparam_response result = (nsweblogparam_response) service.get_payload_formatter().string_to_resource(nsweblogparam_response.class, response);
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
		resources[0] = result.nsweblogparam;
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
	* Use this API to update nsweblogparam.
	*/
	public static base_response update(nitro_service client, nsweblogparam resource) throws Exception {
		nsweblogparam updateresource = new nsweblogparam();
		updateresource.buffersizemb = resource.buffersizemb;
		updateresource.customreqhdrs = resource.customreqhdrs;
		updateresource.customrsphdrs = resource.customrsphdrs;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nsweblogparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsweblogparam resource, String[] args) throws Exception{
		nsweblogparam unsetresource = new nsweblogparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nsweblogparam resources that are configured on netscaler.
	*/
	public static nsweblogparam get(nitro_service service) throws Exception{
		nsweblogparam obj = new nsweblogparam();
		nsweblogparam[] response = (nsweblogparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsweblogparam resources that are configured on netscaler.
	*/
	public static nsweblogparam get(nitro_service service,  options option) throws Exception{
		nsweblogparam obj = new nsweblogparam();
		nsweblogparam[] response = (nsweblogparam[])obj.get_resources(service,option);
		return response[0];
	}

}
