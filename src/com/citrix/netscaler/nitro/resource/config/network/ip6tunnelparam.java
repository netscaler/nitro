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

class ip6tunnelparam_response extends base_response
{
	public ip6tunnelparam ip6tunnelparam;
}
/**
* Configuration for ip6 tunnel parameter resource.
*/

public class ip6tunnelparam extends base_resource
{
	private String srcip;
	private String dropfrag;
	private Long dropfragcputhreshold;
	private String srciproundrobin;

	/**
	* <pre>
	* The source IP address used for all IPv6 tunnels, except those configured by using the add iptunnel command.<br> Minimum length =  1
	* </pre>
	*/
	public void set_srcip(String srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* The source IP address used for all IPv6 tunnels, except those configured by using the add iptunnel command.<br> Minimum length =  1
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* Drop an IPv6 packet if fragmentation is required to tunnel it.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_dropfrag(String dropfrag) throws Exception{
		this.dropfrag = dropfrag;
	}

	/**
	* <pre>
	* Drop an IPv6 packet if fragmentation is required to tunnel it.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_dropfrag() throws Exception {
		return this.dropfrag;
	}

	/**
	* <pre>
	* Drop an IP6 packet if fragmentation is required to tunnel it and CPU usage is above this threshold.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dropfragcputhreshold(long dropfragcputhreshold) throws Exception {
		this.dropfragcputhreshold = new Long(dropfragcputhreshold);
	}

	/**
	* <pre>
	* Drop an IP6 packet if fragmentation is required to tunnel it and CPU usage is above this threshold.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dropfragcputhreshold(Long dropfragcputhreshold) throws Exception{
		this.dropfragcputhreshold = dropfragcputhreshold;
	}

	/**
	* <pre>
	* Drop an IP6 packet if fragmentation is required to tunnel it and CPU usage is above this threshold.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_dropfragcputhreshold() throws Exception {
		return this.dropfragcputhreshold;
	}

	/**
	* <pre>
	* If the source IP address is not configured, apply round-robin selection from the configured SNIPs.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_srciproundrobin(String srciproundrobin) throws Exception{
		this.srciproundrobin = srciproundrobin;
	}

	/**
	* <pre>
	* If the source IP address is not configured, apply round-robin selection from the configured SNIPs.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_srciproundrobin() throws Exception {
		return this.srciproundrobin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ip6tunnelparam[] resources = new ip6tunnelparam[1];
		ip6tunnelparam_response result = (ip6tunnelparam_response) service.get_payload_formatter().string_to_resource(ip6tunnelparam_response.class, response);
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
		resources[0] = result.ip6tunnelparam;
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
	* Use this API to update ip6tunnelparam.
	*/
	public static base_response update(nitro_service client, ip6tunnelparam resource) throws Exception {
		ip6tunnelparam updateresource = new ip6tunnelparam();
		updateresource.srcip = resource.srcip;
		updateresource.dropfrag = resource.dropfrag;
		updateresource.dropfragcputhreshold = resource.dropfragcputhreshold;
		updateresource.srciproundrobin = resource.srciproundrobin;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of ip6tunnelparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, ip6tunnelparam resource, String[] args) throws Exception{
		ip6tunnelparam unsetresource = new ip6tunnelparam();
		unsetresource.srcip = resource.srcip;
		unsetresource.dropfrag = resource.dropfrag;
		unsetresource.dropfragcputhreshold = resource.dropfragcputhreshold;
		unsetresource.srciproundrobin = resource.srciproundrobin;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the ip6tunnelparam resources that are configured on netscaler.
	*/
	public static ip6tunnelparam get(nitro_service service) throws Exception{
		ip6tunnelparam obj = new ip6tunnelparam();
		ip6tunnelparam[] response = (ip6tunnelparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the ip6tunnelparam resources that are configured on netscaler.
	*/
	public static ip6tunnelparam get(nitro_service service,  options option) throws Exception{
		ip6tunnelparam obj = new ip6tunnelparam();
		ip6tunnelparam[] response = (ip6tunnelparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class dropfragEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class srciproundrobinEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
