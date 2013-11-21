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

class systemparameter_response extends base_response
{
	public systemparameter systemparameter;
}
/**
* Configuration for system parameter resource.
*/

public class systemparameter extends base_resource
{
	private String rbaonresponse;
	private String promptstring;
	private Long natpcbforceflushlimit;
	private String natpcbrstontimeout;
	private Long timeout;

	/**
	* <pre>
	* Enable or disable Role-Based Authentication (RBA) on responses.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_rbaonresponse(String rbaonresponse) throws Exception{
		this.rbaonresponse = rbaonresponse;
	}

	/**
	* <pre>
	* Enable or disable Role-Based Authentication (RBA) on responses.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_rbaonresponse() throws Exception {
		return this.rbaonresponse;
	}

	/**
	* <pre>
	* String to display at the command-line prompt. Can consist of letters, numbers, hyphen (-), period (.), hash (#), space ( ), at (@), equal (=), colon (:), underscore (_), and the following variables: 
* %u - Will be replaced by the user name.
* %h - Will be replaced by the hostname of the NetScaler appliance.
* %t - Will be replaced by the current time in 12-hour format.
* %T - Will be replaced by the current time in 24-hour format.
* %d - Will be replaced by the current date.
* %s - Will be replaced by the state of the NetScaler appliance.

Note: The 63-character limit for the length of the string does not apply to the characters that replace the variables.<br> Minimum length =  1
	* </pre>
	*/
	public void set_promptstring(String promptstring) throws Exception{
		this.promptstring = promptstring;
	}

	/**
	* <pre>
	* String to display at the command-line prompt. Can consist of letters, numbers, hyphen (-), period (.), hash (#), space ( ), at (@), equal (=), colon (:), underscore (_), and the following variables: 
* %u - Will be replaced by the user name.
* %h - Will be replaced by the hostname of the NetScaler appliance.
* %t - Will be replaced by the current time in 12-hour format.
* %T - Will be replaced by the current time in 24-hour format.
* %d - Will be replaced by the current date.
* %s - Will be replaced by the state of the NetScaler appliance.

Note: The 63-character limit for the length of the string does not apply to the characters that replace the variables.<br> Minimum length =  1
	* </pre>
	*/
	public String get_promptstring() throws Exception {
		return this.promptstring;
	}

	/**
	* <pre>
	* Flush the system if the number of Network Address Translation Protocol Control Blocks (NATPCBs) exceeds this value.<br> Default value: 2147483647<br> Minimum value =  1000
	* </pre>
	*/
	public void set_natpcbforceflushlimit(long natpcbforceflushlimit) throws Exception {
		this.natpcbforceflushlimit = new Long(natpcbforceflushlimit);
	}

	/**
	* <pre>
	* Flush the system if the number of Network Address Translation Protocol Control Blocks (NATPCBs) exceeds this value.<br> Default value: 2147483647<br> Minimum value =  1000
	* </pre>
	*/
	public void set_natpcbforceflushlimit(Long natpcbforceflushlimit) throws Exception{
		this.natpcbforceflushlimit = natpcbforceflushlimit;
	}

	/**
	* <pre>
	* Flush the system if the number of Network Address Translation Protocol Control Blocks (NATPCBs) exceeds this value.<br> Default value: 2147483647<br> Minimum value =  1000
	* </pre>
	*/
	public Long get_natpcbforceflushlimit() throws Exception {
		return this.natpcbforceflushlimit;
	}

	/**
	* <pre>
	* Send a reset signal to client and server connections when their NATPCBs time out. Avoids the buildup of idle TCP connections on both the sides.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_natpcbrstontimeout(String natpcbrstontimeout) throws Exception{
		this.natpcbrstontimeout = natpcbrstontimeout;
	}

	/**
	* <pre>
	* Send a reset signal to client and server connections when their NATPCBs time out. Avoids the buildup of idle TCP connections on both the sides.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_natpcbrstontimeout() throws Exception {
		return this.natpcbrstontimeout;
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		systemparameter[] resources = new systemparameter[1];
		systemparameter_response result = (systemparameter_response) service.get_payload_formatter().string_to_resource(systemparameter_response.class, response);
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
		resources[0] = result.systemparameter;
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
	* Use this API to update systemparameter.
	*/
	public static base_response update(nitro_service client, systemparameter resource) throws Exception {
		systemparameter updateresource = new systemparameter();
		updateresource.rbaonresponse = resource.rbaonresponse;
		updateresource.promptstring = resource.promptstring;
		updateresource.natpcbforceflushlimit = resource.natpcbforceflushlimit;
		updateresource.natpcbrstontimeout = resource.natpcbrstontimeout;
		updateresource.timeout = resource.timeout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of systemparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, systemparameter resource, String[] args) throws Exception{
		systemparameter unsetresource = new systemparameter();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the systemparameter resources that are configured on netscaler.
	*/
	public static systemparameter get(nitro_service service) throws Exception{
		systemparameter obj = new systemparameter();
		systemparameter[] response = (systemparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the systemparameter resources that are configured on netscaler.
	*/
	public static systemparameter get(nitro_service service,  options option) throws Exception{
		systemparameter obj = new systemparameter();
		systemparameter[] response = (systemparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class rbaonresponseEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class natpcbrstontimeoutEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
