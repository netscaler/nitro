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

class inatparam_response extends base_response
{
	public inatparam inatparam;
}
/**
* Configuration for INAT parameter resource.
*/

public class inatparam extends base_resource
{
	private String nat46v6prefix;
	private String nat46ignoretos;
	private String nat46zerochecksum;
	private Long nat46v6mtu;
	private String nat46fragheader;

	/**
	* <pre>
	* The prefix used for translating packets received from private IPv6 servers into IPv4 packets. This prefix has a length of 96 bits (128-32 = 96). The IPv6 servers embed the destination IP address of the IPv4 servers or hosts in the last 32 bits of the destination IP address field of the IPv6 packets. The first 96 bits of the destination IP address field are set as the IPv6 NAT prefix. IPv6 packets addressed to this prefix have to be routed to the NetScaler appliance to ensure that the IPv6-IPv4 translation is done by the appliance.
	* </pre>
	*/
	public void set_nat46v6prefix(String nat46v6prefix) throws Exception{
		this.nat46v6prefix = nat46v6prefix;
	}

	/**
	* <pre>
	* The prefix used for translating packets received from private IPv6 servers into IPv4 packets. This prefix has a length of 96 bits (128-32 = 96). The IPv6 servers embed the destination IP address of the IPv4 servers or hosts in the last 32 bits of the destination IP address field of the IPv6 packets. The first 96 bits of the destination IP address field are set as the IPv6 NAT prefix. IPv6 packets addressed to this prefix have to be routed to the NetScaler appliance to ensure that the IPv6-IPv4 translation is done by the appliance.
	* </pre>
	*/
	public String get_nat46v6prefix() throws Exception {
		return this.nat46v6prefix;
	}

	/**
	* <pre>
	* Ignore TOS.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_nat46ignoretos(String nat46ignoretos) throws Exception{
		this.nat46ignoretos = nat46ignoretos;
	}

	/**
	* <pre>
	* Ignore TOS.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_nat46ignoretos() throws Exception {
		return this.nat46ignoretos;
	}

	/**
	* <pre>
	* Calculate checksum for UDP packets with zero checksum.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nat46zerochecksum(String nat46zerochecksum) throws Exception{
		this.nat46zerochecksum = nat46zerochecksum;
	}

	/**
	* <pre>
	* Calculate checksum for UDP packets with zero checksum.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nat46zerochecksum() throws Exception {
		return this.nat46zerochecksum;
	}

	/**
	* <pre>
	* Calculate checksum for UDP packets with zero checksum.<br> Default value: 1280<br> Minimum value =  1280<br> Maximum value =  1500
	* </pre>
	*/
	public void set_nat46v6mtu(long nat46v6mtu) throws Exception {
		this.nat46v6mtu = new Long(nat46v6mtu);
	}

	/**
	* <pre>
	* Calculate checksum for UDP packets with zero checksum.<br> Default value: 1280<br> Minimum value =  1280<br> Maximum value =  1500
	* </pre>
	*/
	public void set_nat46v6mtu(Long nat46v6mtu) throws Exception{
		this.nat46v6mtu = nat46v6mtu;
	}

	/**
	* <pre>
	* Calculate checksum for UDP packets with zero checksum.<br> Default value: 1280<br> Minimum value =  1280<br> Maximum value =  1500
	* </pre>
	*/
	public Long get_nat46v6mtu() throws Exception {
		return this.nat46v6mtu;
	}

	/**
	* <pre>
	* When disabled, translator will not insert IPv6 fragmentation header for non fragmented IPv4 packets.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nat46fragheader(String nat46fragheader) throws Exception{
		this.nat46fragheader = nat46fragheader;
	}

	/**
	* <pre>
	* When disabled, translator will not insert IPv6 fragmentation header for non fragmented IPv4 packets.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nat46fragheader() throws Exception {
		return this.nat46fragheader;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		inatparam[] resources = new inatparam[1];
		inatparam_response result = (inatparam_response) service.get_payload_formatter().string_to_resource(inatparam_response.class, response);
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
		resources[0] = result.inatparam;
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
	* Use this API to update inatparam.
	*/
	public static base_response update(nitro_service client, inatparam resource) throws Exception {
		inatparam updateresource = new inatparam();
		updateresource.nat46v6prefix = resource.nat46v6prefix;
		updateresource.nat46ignoretos = resource.nat46ignoretos;
		updateresource.nat46zerochecksum = resource.nat46zerochecksum;
		updateresource.nat46v6mtu = resource.nat46v6mtu;
		updateresource.nat46fragheader = resource.nat46fragheader;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of inatparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, inatparam resource, String[] args) throws Exception{
		inatparam unsetresource = new inatparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the inatparam resources that are configured on netscaler.
	*/
	public static inatparam get(nitro_service service) throws Exception{
		inatparam obj = new inatparam();
		inatparam[] response = (inatparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the inatparam resources that are configured on netscaler.
	*/
	public static inatparam get(nitro_service service,  options option) throws Exception{
		inatparam obj = new inatparam();
		inatparam[] response = (inatparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class nat46fragheaderEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class nat46zerochecksumEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class nat46ignoretosEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
