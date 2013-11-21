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

class nsdhcpparams_response extends base_response
{
	public nsdhcpparams nsdhcpparams;
}
/**
* Configuration for DHCP parameters resource.
*/

public class nsdhcpparams extends base_resource
{
	private String dhcpclient;
	private String saveroute;

	//------- Read only Parameter ---------;

	private String ipaddress;
	private String netmask;
	private String hostrtgw;
	private Boolean running;

	/**
	* <pre>
	* Enables DHCP client to acquire IP address from the DHCP server in the next boot. When set to OFF, disables the DHCP client in the next boot.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_dhcpclient(String dhcpclient) throws Exception{
		this.dhcpclient = dhcpclient;
	}

	/**
	* <pre>
	* Enables DHCP client to acquire IP address from the DHCP server in the next boot. When set to OFF, disables the DHCP client in the next boot.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_dhcpclient() throws Exception {
		return this.dhcpclient;
	}

	/**
	* <pre>
	* DHCP acquired routes are saved on the NetScaler appliance.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_saveroute(String saveroute) throws Exception{
		this.saveroute = saveroute;
	}

	/**
	* <pre>
	* DHCP acquired routes are saved on the NetScaler appliance.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_saveroute() throws Exception {
		return this.saveroute;
	}

	/**
	* <pre>
	* DHCP acquired IP.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* DHCP acquired Netmask.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* DHCP acquired Gateway.
	* </pre>
	*/
	public String get_hostrtgw() throws Exception {
		return this.hostrtgw;
	}

	/**
	* <pre>
	* DHCP mode.
	* </pre>
	*/
	public Boolean get_running() throws Exception {
		return this.running;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsdhcpparams[] resources = new nsdhcpparams[1];
		nsdhcpparams_response result = (nsdhcpparams_response) service.get_payload_formatter().string_to_resource(nsdhcpparams_response.class, response);
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
		resources[0] = result.nsdhcpparams;
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
	* Use this API to update nsdhcpparams.
	*/
	public static base_response update(nitro_service client, nsdhcpparams resource) throws Exception {
		nsdhcpparams updateresource = new nsdhcpparams();
		updateresource.dhcpclient = resource.dhcpclient;
		updateresource.saveroute = resource.saveroute;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nsdhcpparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsdhcpparams resource, String[] args) throws Exception{
		nsdhcpparams unsetresource = new nsdhcpparams();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nsdhcpparams resources that are configured on netscaler.
	*/
	public static nsdhcpparams get(nitro_service service) throws Exception{
		nsdhcpparams obj = new nsdhcpparams();
		nsdhcpparams[] response = (nsdhcpparams[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsdhcpparams resources that are configured on netscaler.
	*/
	public static nsdhcpparams get(nitro_service service,  options option) throws Exception{
		nsdhcpparams obj = new nsdhcpparams();
		nsdhcpparams[] response = (nsdhcpparams[])obj.get_resources(service,option);
		return response[0];
	}

	public static class dhcpclientEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class saverouteEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
