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

class reboot_response extends base_response
{
	public reboot reboot;
}

public class reboot extends base_resource
{
	private Boolean warm;

	/**
	* <pre>
	* Restarts the NetScaler software without rebooting the underlying operating system. The session terminates and you must log on to the appliance after it has restarted.
Note: This argument is required only for nCore appliances. Classic appliances ignore this argument.
	* </pre>
	*/
	public void set_warm(boolean warm) throws Exception {
		this.warm = new Boolean(warm);
	}

	/**
	* <pre>
	* Restarts the NetScaler software without rebooting the underlying operating system. The session terminates and you must log on to the appliance after it has restarted.
Note: This argument is required only for nCore appliances. Classic appliances ignore this argument.
	* </pre>
	*/
	public void set_warm(Boolean warm) throws Exception{
		this.warm = warm;
	}

	/**
	* <pre>
	* Restarts the NetScaler software without rebooting the underlying operating system. The session terminates and you must log on to the appliance after it has restarted.
Note: This argument is required only for nCore appliances. Classic appliances ignore this argument.
	* </pre>
	*/
	public Boolean get_warm() throws Exception {
		return this.warm;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		reboot[] resources = new reboot[1];
		reboot_response result = (reboot_response) service.get_payload_formatter().string_to_resource(reboot_response.class, response);
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
		resources[0] = result.reboot;
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
	* Use this API to Reboot reboot.
	*/
	public static base_response Reboot(nitro_service client, reboot resource) throws Exception {
		reboot Rebootresource = new reboot();
		Rebootresource.warm = resource.warm;
		return Rebootresource.perform_operation(client);
	}

}
