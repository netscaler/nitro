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

class snmpoption_response extends base_response
{
	public snmpoption snmpoption;
}
/**
* Configuration for SNMP option resource.
*/

public class snmpoption extends base_resource
{
	private String snmpset;
	private String snmptraplogging;

	/**
	* <pre>
	* Accept SNMP SET requests sent to the NetScaler appliance, and allow SNMP managers to write values to MIB objects that are configured for write access.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_snmpset(String snmpset) throws Exception{
		this.snmpset = snmpset;
	}

	/**
	* <pre>
	* Accept SNMP SET requests sent to the NetScaler appliance, and allow SNMP managers to write values to MIB objects that are configured for write access.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_snmpset() throws Exception {
		return this.snmpset;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to log any SNMP trap events (for SNMP alarms in which logging is enabled) even when no trap listeners are configured. With the default setting, SNMP trap events are logged if at least one trap listener is configured on the appliance.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_snmptraplogging(String snmptraplogging) throws Exception{
		this.snmptraplogging = snmptraplogging;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to log any SNMP trap events (for SNMP alarms in which logging is enabled) even when no trap listeners are configured. With the default setting, SNMP trap events are logged if at least one trap listener is configured on the appliance.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_snmptraplogging() throws Exception {
		return this.snmptraplogging;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		snmpoption[] resources = new snmpoption[1];
		snmpoption_response result = (snmpoption_response) service.get_payload_formatter().string_to_resource(snmpoption_response.class, response);
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
		resources[0] = result.snmpoption;
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
	* Use this API to update snmpoption.
	*/
	public static base_response update(nitro_service client, snmpoption resource) throws Exception {
		snmpoption updateresource = new snmpoption();
		updateresource.snmpset = resource.snmpset;
		updateresource.snmptraplogging = resource.snmptraplogging;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of snmpoption resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, snmpoption resource, String[] args) throws Exception{
		snmpoption unsetresource = new snmpoption();
		unsetresource.snmpset = resource.snmpset;
		unsetresource.snmptraplogging = resource.snmptraplogging;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the snmpoption resources that are configured on netscaler.
	*/
	public static snmpoption get(nitro_service service) throws Exception{
		snmpoption obj = new snmpoption();
		snmpoption[] response = (snmpoption[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the snmpoption resources that are configured on netscaler.
	*/
	public static snmpoption get(nitro_service service,  options option) throws Exception{
		snmpoption obj = new snmpoption();
		snmpoption[] response = (snmpoption[])obj.get_resources(service,option);
		return response[0];
	}

	public static class snmptraploggingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class snmpsetEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
