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

package com.citrix.netscaler.nitro.resource.config.app;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class application_response extends base_response
{
	public application application;
}
/**
* Configuration for application resource.
*/

public class application extends base_resource
{
	private String apptemplatefilename;
	private String appname;
	private String deploymentfilename;

	/**
	* <pre>
	* The name of the AppExpert application template file.
	* </pre>
	*/
	public void set_apptemplatefilename(String apptemplatefilename) throws Exception{
		this.apptemplatefilename = apptemplatefilename;
	}

	/**
	* <pre>
	* The name of the AppExpert application template file.
	* </pre>
	*/
	public String get_apptemplatefilename() throws Exception {
		return this.apptemplatefilename;
	}

	/**
	* <pre>
	* The name with which you want the AppExpert application to function on the NetScaler appliance. If you do not provide a name, the appliance assigns the application the name of the template file.
	* </pre>
	*/
	public void set_appname(String appname) throws Exception{
		this.appname = appname;
	}

	/**
	* <pre>
	* The name with which you want the AppExpert application to function on the NetScaler appliance. If you do not provide a name, the appliance assigns the application the name of the template file.
	* </pre>
	*/
	public String get_appname() throws Exception {
		return this.appname;
	}

	/**
	* <pre>
	* The name of the deployment file.
	* </pre>
	*/
	public void set_deploymentfilename(String deploymentfilename) throws Exception{
		this.deploymentfilename = deploymentfilename;
	}

	/**
	* <pre>
	* The name of the deployment file.
	* </pre>
	*/
	public String get_deploymentfilename() throws Exception {
		return this.deploymentfilename;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		application[] resources = new application[1];
		application_response result = (application_response) service.get_payload_formatter().string_to_resource(application_response.class, response);
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
		resources[0] = result.application;
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
	* Use this API to Import application.
	*/
	public static base_response Import(nitro_service client, application resource) throws Exception {
		application Importresource = new application();
		Importresource.apptemplatefilename = resource.apptemplatefilename;
		Importresource.appname = resource.appname;
		Importresource.deploymentfilename = resource.deploymentfilename;
		return Importresource.perform_operation(client,"Import");
	}

	/**
	* Use this API to export application.
	*/
	public static base_response export(nitro_service client, application resource) throws Exception {
		application exportresource = new application();
		exportresource.appname = resource.appname;
		exportresource.apptemplatefilename = resource.apptemplatefilename;
		exportresource.deploymentfilename = resource.deploymentfilename;
		return exportresource.perform_operation(client,"export");
	}

}
