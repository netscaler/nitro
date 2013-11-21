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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbconfig_response extends base_response
{
	public gslbconfig gslbconfig;
}
/**
* Configuration for gslb config resource.
*/

public class gslbconfig extends base_resource
{
	private Boolean preview;
	private Boolean debug;
	private String forcesync;
	private Boolean nowarn;
	private Boolean saveconfig;
	private String command;

	/**
	* <pre>
	* Do not synchronize the GSLB sites, but display the commands that would be applied on the slave node upon synchronization. Mutually exclusive with the Save Configuration option.
	* </pre>
	*/
	public void set_preview(boolean preview) throws Exception {
		this.preview = new Boolean(preview);
	}

	/**
	* <pre>
	* Do not synchronize the GSLB sites, but display the commands that would be applied on the slave node upon synchronization. Mutually exclusive with the Save Configuration option.
	* </pre>
	*/
	public void set_preview(Boolean preview) throws Exception{
		this.preview = preview;
	}

	/**
	* <pre>
	* Do not synchronize the GSLB sites, but display the commands that would be applied on the slave node upon synchronization. Mutually exclusive with the Save Configuration option.
	* </pre>
	*/
	public Boolean get_preview() throws Exception {
		return this.preview;
	}

	/**
	* <pre>
	* Generate verbose output when synchronizing the GSLB sites. The Debug option generates more verbose output than the sync gslb config command in which the option is not used, and is useful for analyzing synchronization issues.
	* </pre>
	*/
	public void set_debug(boolean debug) throws Exception {
		this.debug = new Boolean(debug);
	}

	/**
	* <pre>
	* Generate verbose output when synchronizing the GSLB sites. The Debug option generates more verbose output than the sync gslb config command in which the option is not used, and is useful for analyzing synchronization issues.
	* </pre>
	*/
	public void set_debug(Boolean debug) throws Exception{
		this.debug = debug;
	}

	/**
	* <pre>
	* Generate verbose output when synchronizing the GSLB sites. The Debug option generates more verbose output than the sync gslb config command in which the option is not used, and is useful for analyzing synchronization issues.
	* </pre>
	*/
	public Boolean get_debug() throws Exception {
		return this.debug;
	}

	/**
	* <pre>
	* Force synchronization of the specified site even if a dependent configuration on the remote site is preventing synchronization or if one or more GSLB entities on the remote site have the same name but are of a different type. You can specify either the name of the remote site that you want to synchronize with the local site, or you can specify All Sites in the configuration utility (the string all-sites in the CLI). If you specify All Sites, all the sites in the GSLB setup are synchronized with the site on the master node. 
Note: If you select the Force Sync option, the synchronization starts without displaying the commands that are going to be executed.
	* </pre>
	*/
	public void set_forcesync(String forcesync) throws Exception{
		this.forcesync = forcesync;
	}

	/**
	* <pre>
	* Force synchronization of the specified site even if a dependent configuration on the remote site is preventing synchronization or if one or more GSLB entities on the remote site have the same name but are of a different type. You can specify either the name of the remote site that you want to synchronize with the local site, or you can specify All Sites in the configuration utility (the string all-sites in the CLI). If you specify All Sites, all the sites in the GSLB setup are synchronized with the site on the master node. 
Note: If you select the Force Sync option, the synchronization starts without displaying the commands that are going to be executed.
	* </pre>
	*/
	public String get_forcesync() throws Exception {
		return this.forcesync;
	}

	/**
	* <pre>
	* Suppress the warning and the confirmation prompt that are displayed before site synchronization begins. This option can be used in automation scripts that must not be interrupted by a prompt.
	* </pre>
	*/
	public void set_nowarn(boolean nowarn) throws Exception {
		this.nowarn = new Boolean(nowarn);
	}

	/**
	* <pre>
	* Suppress the warning and the confirmation prompt that are displayed before site synchronization begins. This option can be used in automation scripts that must not be interrupted by a prompt.
	* </pre>
	*/
	public void set_nowarn(Boolean nowarn) throws Exception{
		this.nowarn = nowarn;
	}

	/**
	* <pre>
	* Suppress the warning and the confirmation prompt that are displayed before site synchronization begins. This option can be used in automation scripts that must not be interrupted by a prompt.
	* </pre>
	*/
	public Boolean get_nowarn() throws Exception {
		return this.nowarn;
	}

	/**
	* <pre>
	* Save the configuration on all the nodes participating in the synchronization process, automatically. The master saves its configuration immediately before synchronization begins. Slave nodes save their configurations after the process of synchronization is complete. A slave node saves its configuration only if the configuration difference was successfully applied to it. Mutually exclusive with the Preview option.
	* </pre>
	*/
	public void set_saveconfig(boolean saveconfig) throws Exception {
		this.saveconfig = new Boolean(saveconfig);
	}

	/**
	* <pre>
	* Save the configuration on all the nodes participating in the synchronization process, automatically. The master saves its configuration immediately before synchronization begins. Slave nodes save their configurations after the process of synchronization is complete. A slave node saves its configuration only if the configuration difference was successfully applied to it. Mutually exclusive with the Preview option.
	* </pre>
	*/
	public void set_saveconfig(Boolean saveconfig) throws Exception{
		this.saveconfig = saveconfig;
	}

	/**
	* <pre>
	* Save the configuration on all the nodes participating in the synchronization process, automatically. The master saves its configuration immediately before synchronization begins. Slave nodes save their configurations after the process of synchronization is complete. A slave node saves its configuration only if the configuration difference was successfully applied to it. Mutually exclusive with the Preview option.
	* </pre>
	*/
	public Boolean get_saveconfig() throws Exception {
		return this.saveconfig;
	}

	/**
	* <pre>
	* Run the specified command on the master node and then on all the slave nodes. You cannot use this option with the force sync and preview options.
	* </pre>
	*/
	public void set_command(String command) throws Exception{
		this.command = command;
	}

	/**
	* <pre>
	* Run the specified command on the master node and then on all the slave nodes. You cannot use this option with the force sync and preview options.
	* </pre>
	*/
	public String get_command() throws Exception {
		return this.command;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		gslbconfig[] resources = new gslbconfig[1];
		gslbconfig_response result = (gslbconfig_response) service.get_payload_formatter().string_to_resource(gslbconfig_response.class, response);
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
		resources[0] = result.gslbconfig;
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
	* Use this API to sync gslbconfig.
	*/
	public static base_response sync(nitro_service client, gslbconfig resource) throws Exception {
		gslbconfig syncresource = new gslbconfig();
		syncresource.preview = resource.preview;
		syncresource.debug = resource.debug;
		syncresource.forcesync = resource.forcesync;
		syncresource.nowarn = resource.nowarn;
		syncresource.saveconfig = resource.saveconfig;
		syncresource.command = resource.command;
		return syncresource.perform_operation(client,"sync");
	}

}
