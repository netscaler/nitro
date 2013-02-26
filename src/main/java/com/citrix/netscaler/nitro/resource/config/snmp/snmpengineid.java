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

package com.citrix.netscaler.nitro.resource.config.snmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class snmpengineid_response extends base_response
{
	public snmpengineid snmpengineid;
}
/**
* Configuration for SNMP engine id resource.
*/

public class snmpengineid extends base_resource
{
	private String engineid;

	/**
	* <pre>
	* The unique identification for the SNMPv3 engine. Engine ID should be a hexadecimal value with a minimum length of 10 hex characters.<br> Minimum length =  10<br> Maximum length =  31
	* </pre>
	*/
	public void set_engineid(String engineid) throws Exception{
		this.engineid = engineid;
	}

	/**
	* <pre>
	* The unique identification for the SNMPv3 engine. Engine ID should be a hexadecimal value with a minimum length of 10 hex characters.<br> Minimum length =  10<br> Maximum length =  31
	* </pre>
	*/
	public String get_engineid() throws Exception {
		return this.engineid;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		snmpengineid[] resources = new snmpengineid[1];
		snmpengineid_response result = (snmpengineid_response) service.get_payload_formatter().string_to_resource(snmpengineid_response.class, response);
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
		resources[0] = result.snmpengineid;
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
	* Use this API to update snmpengineid.
	*/
	public static base_response update(nitro_service client, snmpengineid resource) throws Exception {
		snmpengineid updateresource = new snmpengineid();
		updateresource.engineid = resource.engineid;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of snmpengineid resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String[] args) throws Exception {
		snmpengineid unsetresource = new snmpengineid();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the snmpengineid resources that are configured on netscaler.
	*/
	public static snmpengineid get(nitro_service service) throws Exception{
		snmpengineid obj = new snmpengineid();
		snmpengineid[] response = (snmpengineid[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the snmpengineid resources that are configured on netscaler.
	*/
	public static snmpengineid get(nitro_service service,  options option) throws Exception{
		snmpengineid obj = new snmpengineid();
		snmpengineid[] response = (snmpengineid[])obj.get_resources(service,option);
		return response[0];
	}

}
