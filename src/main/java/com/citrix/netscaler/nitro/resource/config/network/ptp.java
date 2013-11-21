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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ptp_response extends base_response
{
	public ptp ptp;
}
/**
* Configuration for Precision Time Protocol resource.
*/

public class ptp extends base_resource
{
	private String state;

	/**
	* <pre>
	* Enables or disables Precision Time Protocol (PTP) on the appliance. If you disable PTP, make sure you enable Network Time Protocol (NTP) on the cluster.<br> Default value: ENABLE<br> Possible values = DISABLE, ENABLE
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enables or disables Precision Time Protocol (PTP) on the appliance. If you disable PTP, make sure you enable Network Time Protocol (NTP) on the cluster.<br> Default value: ENABLE<br> Possible values = DISABLE, ENABLE
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ptp[] resources = new ptp[1];
		ptp_response result = (ptp_response) service.get_payload_formatter().string_to_resource(ptp_response.class, response);
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
		resources[0] = result.ptp;
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
	* Use this API to update ptp.
	*/
	public static base_response update(nitro_service client, ptp resource) throws Exception {
		ptp updateresource = new ptp();
		updateresource.state = resource.state;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to fetch all the ptp resources that are configured on netscaler.
	*/
	public static ptp get(nitro_service service) throws Exception{
		ptp obj = new ptp();
		ptp[] response = (ptp[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the ptp resources that are configured on netscaler.
	*/
	public static ptp get(nitro_service service,  options option) throws Exception{
		ptp obj = new ptp();
		ptp[] response = (ptp[])obj.get_resources(service,option);
		return response[0];
	}

	public static class stateEnum {
		public static final String DISABLE = "DISABLE";
		public static final String ENABLE = "ENABLE";
	}
}
