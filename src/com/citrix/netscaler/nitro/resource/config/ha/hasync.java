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

class hasync_response extends base_response
{
	public hasync hasync;
}
/**
* Configuration for sync resource.
*/

public class hasync extends base_resource
{
	private Boolean force;
	private String save;

	/**
	* <pre>
	* Force synchronization regardless of the state of HA propagation and HA synchronization on either node.
	* </pre>
	*/
	public void set_force(boolean force) throws Exception {
		this.force = new Boolean(force);
	}

	/**
	* <pre>
	* Force synchronization regardless of the state of HA propagation and HA synchronization on either node.
	* </pre>
	*/
	public void set_force(Boolean force) throws Exception{
		this.force = force;
	}

	/**
	* <pre>
	* Force synchronization regardless of the state of HA propagation and HA synchronization on either node.
	* </pre>
	*/
	public Boolean get_force() throws Exception {
		return this.force;
	}

	/**
	* <pre>
	* After synchronization, automatically save the configuration in the secondary node’s configuration file (ns.conf) without prompting for confirmation.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_save(String save) throws Exception{
		this.save = save;
	}

	/**
	* <pre>
	* After synchronization, automatically save the configuration in the secondary node’s configuration file (ns.conf) without prompting for confirmation.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_save() throws Exception {
		return this.save;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		hasync[] resources = new hasync[1];
		hasync_response result = (hasync_response) service.get_payload_formatter().string_to_resource(hasync_response.class, response);
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
		resources[0] = result.hasync;
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
	* Use this API to Force hasync.
	*/
	public static base_response Force(nitro_service client, hasync resource) throws Exception {
		hasync Forceresource = new hasync();
		Forceresource.force = resource.force;
		Forceresource.save = resource.save;
		return Forceresource.perform_operation(client,"Force");
	}

	public static class saveEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
