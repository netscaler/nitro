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

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemcollectionparam_response extends base_response
{
	public systemcollectionparam systemcollectionparam;
}
/**
* Configuration for collection parameter resource.
*/

public class systemcollectionparam extends base_resource
{
	private String communityname;
	private String datapath;

	//------- Read only Parameter ---------;

	private String loglevel;

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_communityname(String communityname) throws Exception{
		this.communityname = communityname;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_communityname() throws Exception {
		return this.communityname;
	}

	/**
	* <pre>
	* specify the data path.
	* </pre>
	*/
	public void set_datapath(String datapath) throws Exception{
		this.datapath = datapath;
	}

	/**
	* <pre>
	* specify the data path.
	* </pre>
	*/
	public String get_datapath() throws Exception {
		return this.datapath;
	}

	/**
	* <pre>
	* specify the log level. Possible values CRITICAL,WARNING,INFO,DEBUG1,DEBUG2.
	* </pre>
	*/
	public String get_loglevel() throws Exception {
		return this.loglevel;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		systemcollectionparam[] resources = new systemcollectionparam[1];
		systemcollectionparam_response result = (systemcollectionparam_response) service.get_payload_formatter().string_to_resource(systemcollectionparam_response.class, response);
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
		resources[0] = result.systemcollectionparam;
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
	* Use this API to update systemcollectionparam.
	*/
	public static base_response update(nitro_service client, systemcollectionparam resource) throws Exception {
		systemcollectionparam updateresource = new systemcollectionparam();
		updateresource.communityname = resource.communityname;
		updateresource.datapath = resource.datapath;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of systemcollectionparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, systemcollectionparam resource, String[] args) throws Exception{
		systemcollectionparam unsetresource = new systemcollectionparam();
		unsetresource.communityname = resource.communityname;
		unsetresource.datapath = resource.datapath;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the systemcollectionparam resources that are configured on netscaler.
	*/
	public static systemcollectionparam get(nitro_service service) throws Exception{
		systemcollectionparam obj = new systemcollectionparam();
		systemcollectionparam[] response = (systemcollectionparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the systemcollectionparam resources that are configured on netscaler.
	*/
	public static systemcollectionparam get(nitro_service service,  options option) throws Exception{
		systemcollectionparam obj = new systemcollectionparam();
		systemcollectionparam[] response = (systemcollectionparam[])obj.get_resources(service,option);
		return response[0];
	}

}
