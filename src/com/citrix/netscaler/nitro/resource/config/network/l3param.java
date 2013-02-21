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

class l3param_response extends base_response
{
	public l3param l3param;
}
/**
* Configuration for Layer 3 related parameter resource.
*/

public class l3param extends base_resource
{
	private String srcnat;
	private Long icmpgenratethreshold;
	private String overridernat;
	private String dropdfflag;
	private String miproundrobin;
	private String externalloopback;
	private String tnlpmtuwoconn;
	private String usipserverstraypkt;
	private String forwardicmpfragments;

	/**
	* <pre>
	* Perform NAT if only the source is in the private network.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_srcnat(String srcnat) throws Exception{
		this.srcnat = srcnat;
	}

	/**
	* <pre>
	* Perform NAT if only the source is in the private network.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_srcnat() throws Exception {
		return this.srcnat;
	}

	/**
	* <pre>
	* NS generated ICMP pkts per 10ms rate threshold.<br> Default value: 100
	* </pre>
	*/
	public void set_icmpgenratethreshold(long icmpgenratethreshold) throws Exception {
		this.icmpgenratethreshold = new Long(icmpgenratethreshold);
	}

	/**
	* <pre>
	* NS generated ICMP pkts per 10ms rate threshold.<br> Default value: 100
	* </pre>
	*/
	public void set_icmpgenratethreshold(Long icmpgenratethreshold) throws Exception{
		this.icmpgenratethreshold = icmpgenratethreshold;
	}

	/**
	* <pre>
	* NS generated ICMP pkts per 10ms rate threshold.<br> Default value: 100
	* </pre>
	*/
	public Long get_icmpgenratethreshold() throws Exception {
		return this.icmpgenratethreshold;
	}

	/**
	* <pre>
	* USNIP/USIP settings override RNAT settings for configured
              service/virtual server traffic.. .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_overridernat(String overridernat) throws Exception{
		this.overridernat = overridernat;
	}

	/**
	* <pre>
	* USNIP/USIP settings override RNAT settings for configured
              service/virtual server traffic.. .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_overridernat() throws Exception {
		return this.overridernat;
	}

	/**
	* <pre>
	* Enable dropping the IP DF flag.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dropdfflag(String dropdfflag) throws Exception{
		this.dropdfflag = dropdfflag;
	}

	/**
	* <pre>
	* Enable dropping the IP DF flag.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dropdfflag() throws Exception {
		return this.dropdfflag;
	}

	/**
	* <pre>
	* Enable round robin usage of mapped IPs.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_miproundrobin(String miproundrobin) throws Exception{
		this.miproundrobin = miproundrobin;
	}

	/**
	* <pre>
	* Enable round robin usage of mapped IPs.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_miproundrobin() throws Exception {
		return this.miproundrobin;
	}

	/**
	* <pre>
	* Enable external loopback.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_externalloopback(String externalloopback) throws Exception{
		this.externalloopback = externalloopback;
	}

	/**
	* <pre>
	* Enable external loopback.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_externalloopback() throws Exception {
		return this.externalloopback;
	}

	/**
	* <pre>
	* Enable external loopback.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tnlpmtuwoconn(String tnlpmtuwoconn) throws Exception{
		this.tnlpmtuwoconn = tnlpmtuwoconn;
	}

	/**
	* <pre>
	* Enable external loopback.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tnlpmtuwoconn() throws Exception {
		return this.tnlpmtuwoconn;
	}

	/**
	* <pre>
	* Enable detection of stray server side pkts in USIP mode.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_usipserverstraypkt(String usipserverstraypkt) throws Exception{
		this.usipserverstraypkt = usipserverstraypkt;
	}

	/**
	* <pre>
	* Enable detection of stray server side pkts in USIP mode.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_usipserverstraypkt() throws Exception {
		return this.usipserverstraypkt;
	}

	/**
	* <pre>
	* Enable forwarding of ICMP fragments.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_forwardicmpfragments(String forwardicmpfragments) throws Exception{
		this.forwardicmpfragments = forwardicmpfragments;
	}

	/**
	* <pre>
	* Enable forwarding of ICMP fragments.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_forwardicmpfragments() throws Exception {
		return this.forwardicmpfragments;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		l3param[] resources = new l3param[1];
		l3param_response result = (l3param_response) service.get_payload_formatter().string_to_resource(l3param_response.class, response);
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
		resources[0] = result.l3param;
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
	* Use this API to update l3param.
	*/
	public static base_response update(nitro_service client, l3param resource) throws Exception {
		l3param updateresource = new l3param();
		updateresource.srcnat = resource.srcnat;
		updateresource.icmpgenratethreshold = resource.icmpgenratethreshold;
		updateresource.overridernat = resource.overridernat;
		updateresource.dropdfflag = resource.dropdfflag;
		updateresource.miproundrobin = resource.miproundrobin;
		updateresource.externalloopback = resource.externalloopback;
		updateresource.tnlpmtuwoconn = resource.tnlpmtuwoconn;
		updateresource.usipserverstraypkt = resource.usipserverstraypkt;
		updateresource.forwardicmpfragments = resource.forwardicmpfragments;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of l3param resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, l3param resource, String[] args) throws Exception{
		l3param unsetresource = new l3param();
		unsetresource.srcnat = resource.srcnat;
		unsetresource.icmpgenratethreshold = resource.icmpgenratethreshold;
		unsetresource.overridernat = resource.overridernat;
		unsetresource.dropdfflag = resource.dropdfflag;
		unsetresource.miproundrobin = resource.miproundrobin;
		unsetresource.externalloopback = resource.externalloopback;
		unsetresource.tnlpmtuwoconn = resource.tnlpmtuwoconn;
		unsetresource.usipserverstraypkt = resource.usipserverstraypkt;
		unsetresource.forwardicmpfragments = resource.forwardicmpfragments;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the l3param resources that are configured on netscaler.
	*/
	public static l3param get(nitro_service service) throws Exception{
		l3param obj = new l3param();
		l3param[] response = (l3param[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the l3param resources that are configured on netscaler.
	*/
	public static l3param get(nitro_service service,  options option) throws Exception{
		l3param obj = new l3param();
		l3param[] response = (l3param[])obj.get_resources(service,option);
		return response[0];
	}

	public static class overridernatEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class tnlpmtuwoconnEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class externalloopbackEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class forwardicmpfragmentsEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class usipserverstraypktEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class srcnatEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dropdfflagEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class miproundrobinEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
