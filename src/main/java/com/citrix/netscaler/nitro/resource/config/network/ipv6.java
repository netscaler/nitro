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

class ipv6_response extends base_response
{
	public ipv6 ipv6;
}
/**
* Configuration for ip v6 resource.
*/

public class ipv6 extends base_resource
{
	private String ralearning;
	private String routerredirection;
	private Long ndbasereachtime;
	private Long ndretransmissiontime;
	private String natprefix;
	private String dodad;

	//------- Read only Parameter ---------;

	private Integer basereachtime;
	private Integer reachtime;
	private Long ndreachtime;
	private Integer retransmissiontime;

	/**
	* <pre>
	* Enable the NetScaler appliance to learn about various routes from Router Advertisement (RA) and Router Solicitation (RS) messages sent by the routers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ralearning(String ralearning) throws Exception{
		this.ralearning = ralearning;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to learn about various routes from Router Advertisement (RA) and Router Solicitation (RS) messages sent by the routers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ralearning() throws Exception {
		return this.ralearning;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to do Router Redirection.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_routerredirection(String routerredirection) throws Exception{
		this.routerredirection = routerredirection;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to do Router Redirection.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_routerredirection() throws Exception {
		return this.routerredirection;
	}

	/**
	* <pre>
	* ND6 base reachable time (ms).<br> Default value: 30000
	* </pre>
	*/
	public void set_ndbasereachtime(long ndbasereachtime) throws Exception {
		this.ndbasereachtime = new Long(ndbasereachtime);
	}

	/**
	* <pre>
	* ND6 base reachable time (ms).<br> Default value: 30000
	* </pre>
	*/
	public void set_ndbasereachtime(Long ndbasereachtime) throws Exception{
		this.ndbasereachtime = ndbasereachtime;
	}

	/**
	* <pre>
	* ND6 base reachable time (ms).<br> Default value: 30000
	* </pre>
	*/
	public Long get_ndbasereachtime() throws Exception {
		return this.ndbasereachtime;
	}

	/**
	* <pre>
	* ND6 retransmission time (ms).<br> Default value: 1000
	* </pre>
	*/
	public void set_ndretransmissiontime(long ndretransmissiontime) throws Exception {
		this.ndretransmissiontime = new Long(ndretransmissiontime);
	}

	/**
	* <pre>
	* ND6 retransmission time (ms).<br> Default value: 1000
	* </pre>
	*/
	public void set_ndretransmissiontime(Long ndretransmissiontime) throws Exception{
		this.ndretransmissiontime = ndretransmissiontime;
	}

	/**
	* <pre>
	* ND6 retransmission time (ms).<br> Default value: 1000
	* </pre>
	*/
	public Long get_ndretransmissiontime() throws Exception {
		return this.ndretransmissiontime;
	}

	/**
	* <pre>
	* Prefix used for translating packets from private IPv6 servers to IPv4 packets. This prefix has a length of 96 bits (128-32 = 96). The IPv6 servers embed the destination IP address of the IPv4 servers or hosts in the last 32 bits of the destination IP address field of the IPv6 packets. The first 96 bits of the destination IP address field are set as the IPv6 NAT prefix. IPv6 packets addressed to this prefix have to be routed to the NetScaler appliance to ensure that the IPv6-IPv4 translation is done by the appliance.
	* </pre>
	*/
	public void set_natprefix(String natprefix) throws Exception{
		this.natprefix = natprefix;
	}

	/**
	* <pre>
	* Prefix used for translating packets from private IPv6 servers to IPv4 packets. This prefix has a length of 96 bits (128-32 = 96). The IPv6 servers embed the destination IP address of the IPv4 servers or hosts in the last 32 bits of the destination IP address field of the IPv6 packets. The first 96 bits of the destination IP address field are set as the IPv6 NAT prefix. IPv6 packets addressed to this prefix have to be routed to the NetScaler appliance to ensure that the IPv6-IPv4 translation is done by the appliance.
	* </pre>
	*/
	public String get_natprefix() throws Exception {
		return this.natprefix;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to do Duplicate Address Detection(DAD) for all the IPv6 addresses configured on NS, regardless of whether they are obtained through stateless autoconfiguration .DHCPv6, or manual configuration. RFC4862-sec 5.4.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dodad(String dodad) throws Exception{
		this.dodad = dodad;
	}

	/**
	* <pre>
	* Enable the NetScaler appliance to do Duplicate Address Detection(DAD) for all the IPv6 addresses configured on NS, regardless of whether they are obtained through stateless autoconfiguration .DHCPv6, or manual configuration. RFC4862-sec 5.4.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dodad() throws Exception {
		return this.dodad;
	}

	/**
	* <pre>
	* ND6 base reachable time (ms).
	* </pre>
	*/
	public Integer get_basereachtime() throws Exception {
		return this.basereachtime;
	}

	/**
	* <pre>
	* ND6 computed reachable time (ms).
	* </pre>
	*/
	public Integer get_reachtime() throws Exception {
		return this.reachtime;
	}

	/**
	* <pre>
	* ND6 computed reachable time (ms).
	* </pre>
	*/
	public Long get_ndreachtime() throws Exception {
		return this.ndreachtime;
	}

	/**
	* <pre>
	* ND6 retransmission time (ms).
	* </pre>
	*/
	public Integer get_retransmissiontime() throws Exception {
		return this.retransmissiontime;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ipv6[] resources = new ipv6[1];
		ipv6_response result = (ipv6_response) service.get_payload_formatter().string_to_resource(ipv6_response.class, response);
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
		resources[0] = result.ipv6;
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
	* Use this API to update ipv6.
	*/
	public static base_response update(nitro_service client, ipv6 resource) throws Exception {
		ipv6 updateresource = new ipv6();
		updateresource.ralearning = resource.ralearning;
		updateresource.routerredirection = resource.routerredirection;
		updateresource.ndbasereachtime = resource.ndbasereachtime;
		updateresource.ndretransmissiontime = resource.ndretransmissiontime;
		updateresource.natprefix = resource.natprefix;
		updateresource.dodad = resource.dodad;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of ipv6 resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, ipv6 resource, String[] args) throws Exception{
		ipv6 unsetresource = new ipv6();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the ipv6 resources that are configured on netscaler.
	*/
	public static ipv6 get(nitro_service service) throws Exception{
		ipv6 obj = new ipv6();
		ipv6[] response = (ipv6[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the ipv6 resources that are configured on netscaler.
	*/
	public static ipv6 get(nitro_service service,  options option) throws Exception{
		ipv6 obj = new ipv6();
		ipv6[] response = (ipv6[])obj.get_resources(service,option);
		return response[0];
	}

	public static class routerredirectionEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ralearningEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dodadEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
