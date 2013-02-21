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

class l2param_response extends base_response
{
	public l2param l2param;
}
/**
* Configuration for Layer 2 related parameter resource.
*/

public class l2param extends base_resource
{
	private Long mbfpeermacupdate;
	private Long maxbridgecollision;
	private String bdggrpproxyarp;
	private String bdgsetting;
	private String garponvridintf;
	private String macmodefwdmypkt;
	private String usemymac;
	private String proxyarp;
	private String garpreply;
	private String mbfinstlearning;
	private String rstintfonhafo;
	private String skipproxyingbsdtraffic;

	/**
	* <pre>
	* When mbf_instant_learning is enabled, learn any changes in peer's MAC after this time interval, which is in 10ms ticks.<br> Default value: 10
	* </pre>
	*/
	public void set_mbfpeermacupdate(long mbfpeermacupdate) throws Exception {
		this.mbfpeermacupdate = new Long(mbfpeermacupdate);
	}

	/**
	* <pre>
	* When mbf_instant_learning is enabled, learn any changes in peer's MAC after this time interval, which is in 10ms ticks.<br> Default value: 10
	* </pre>
	*/
	public void set_mbfpeermacupdate(Long mbfpeermacupdate) throws Exception{
		this.mbfpeermacupdate = mbfpeermacupdate;
	}

	/**
	* <pre>
	* When mbf_instant_learning is enabled, learn any changes in peer's MAC after this time interval, which is in 10ms ticks.<br> Default value: 10
	* </pre>
	*/
	public Long get_mbfpeermacupdate() throws Exception {
		return this.mbfpeermacupdate;
	}

	/**
	* <pre>
	* Maximum bridge collision for loop detection .<br> Default value: 20
	* </pre>
	*/
	public void set_maxbridgecollision(long maxbridgecollision) throws Exception {
		this.maxbridgecollision = new Long(maxbridgecollision);
	}

	/**
	* <pre>
	* Maximum bridge collision for loop detection .<br> Default value: 20
	* </pre>
	*/
	public void set_maxbridgecollision(Long maxbridgecollision) throws Exception{
		this.maxbridgecollision = maxbridgecollision;
	}

	/**
	* <pre>
	* Maximum bridge collision for loop detection .<br> Default value: 20
	* </pre>
	*/
	public Long get_maxbridgecollision() throws Exception {
		return this.maxbridgecollision;
	}

	/**
	* <pre>
	* Set/reset proxy ARP in bridge group deployment.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_bdggrpproxyarp(String bdggrpproxyarp) throws Exception{
		this.bdggrpproxyarp = bdggrpproxyarp;
	}

	/**
	* <pre>
	* Set/reset proxy ARP in bridge group deployment.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_bdggrpproxyarp() throws Exception {
		return this.bdggrpproxyarp;
	}

	/**
	* <pre>
	* Bridging settings for C2C behavior.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_bdgsetting(String bdgsetting) throws Exception{
		this.bdgsetting = bdgsetting;
	}

	/**
	* <pre>
	* Bridging settings for C2C behavior.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_bdgsetting() throws Exception {
		return this.bdgsetting;
	}

	/**
	* <pre>
	* Send GARP messagess on VRID-configured interfaces upon failover .<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_garponvridintf(String garponvridintf) throws Exception{
		this.garponvridintf = garponvridintf;
	}

	/**
	* <pre>
	* Send GARP messagess on VRID-configured interfaces upon failover .<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_garponvridintf() throws Exception {
		return this.garponvridintf;
	}

	/**
	* <pre>
	*  MAC mode vserver forward packets destined to VIPs.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_macmodefwdmypkt(String macmodefwdmypkt) throws Exception{
		this.macmodefwdmypkt = macmodefwdmypkt;
	}

	/**
	* <pre>
	*  MAC mode vserver forward packets destined to VIPs.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_macmodefwdmypkt() throws Exception {
		return this.macmodefwdmypkt;
	}

	/**
	* <pre>
	* Set/reset cfg_use_my_mac .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_usemymac(String usemymac) throws Exception{
		this.usemymac = usemymac;
	}

	/**
	* <pre>
	* Set/reset cfg_use_my_mac .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_usemymac() throws Exception {
		return this.usemymac;
	}

	/**
	* <pre>
	* Set/reset cfg_proxy_arp_dr .<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_proxyarp(String proxyarp) throws Exception{
		this.proxyarp = proxyarp;
	}

	/**
	* <pre>
	* Set/reset cfg_proxy_arp_dr .<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_proxyarp() throws Exception {
		return this.proxyarp;
	}

	/**
	* <pre>
	* Set/reset REPLY form of GARP .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_garpreply(String garpreply) throws Exception{
		this.garpreply = garpreply;
	}

	/**
	* <pre>
	* Set/reset REPLY form of GARP .<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_garpreply() throws Exception {
		return this.garpreply;
	}

	/**
	* <pre>
	* Enable instant learning of MAC changes in MBF mode.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mbfinstlearning(String mbfinstlearning) throws Exception{
		this.mbfinstlearning = mbfinstlearning;
	}

	/**
	* <pre>
	* Enable instant learning of MAC changes in MBF mode.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mbfinstlearning() throws Exception {
		return this.mbfinstlearning;
	}

	/**
	* <pre>
	* Enable the reset interface upon HA failover.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_rstintfonhafo(String rstintfonhafo) throws Exception{
		this.rstintfonhafo = rstintfonhafo;
	}

	/**
	* <pre>
	* Enable the reset interface upon HA failover.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_rstintfonhafo() throws Exception {
		return this.rstintfonhafo;
	}

	/**
	* <pre>
	* Enable the proxying of FreeBSD traffic.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_skipproxyingbsdtraffic(String skipproxyingbsdtraffic) throws Exception{
		this.skipproxyingbsdtraffic = skipproxyingbsdtraffic;
	}

	/**
	* <pre>
	* Enable the proxying of FreeBSD traffic.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_skipproxyingbsdtraffic() throws Exception {
		return this.skipproxyingbsdtraffic;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		l2param[] resources = new l2param[1];
		l2param_response result = (l2param_response) service.get_payload_formatter().string_to_resource(l2param_response.class, response);
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
		resources[0] = result.l2param;
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
	* Use this API to update l2param.
	*/
	public static base_response update(nitro_service client, l2param resource) throws Exception {
		l2param updateresource = new l2param();
		updateresource.mbfpeermacupdate = resource.mbfpeermacupdate;
		updateresource.maxbridgecollision = resource.maxbridgecollision;
		updateresource.bdggrpproxyarp = resource.bdggrpproxyarp;
		updateresource.bdgsetting = resource.bdgsetting;
		updateresource.garponvridintf = resource.garponvridintf;
		updateresource.macmodefwdmypkt = resource.macmodefwdmypkt;
		updateresource.usemymac = resource.usemymac;
		updateresource.proxyarp = resource.proxyarp;
		updateresource.garpreply = resource.garpreply;
		updateresource.mbfinstlearning = resource.mbfinstlearning;
		updateresource.rstintfonhafo = resource.rstintfonhafo;
		updateresource.skipproxyingbsdtraffic = resource.skipproxyingbsdtraffic;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of l2param resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, l2param resource, String[] args) throws Exception{
		l2param unsetresource = new l2param();
		unsetresource.mbfpeermacupdate = resource.mbfpeermacupdate;
		unsetresource.maxbridgecollision = resource.maxbridgecollision;
		unsetresource.bdggrpproxyarp = resource.bdggrpproxyarp;
		unsetresource.bdgsetting = resource.bdgsetting;
		unsetresource.garponvridintf = resource.garponvridintf;
		unsetresource.macmodefwdmypkt = resource.macmodefwdmypkt;
		unsetresource.usemymac = resource.usemymac;
		unsetresource.proxyarp = resource.proxyarp;
		unsetresource.garpreply = resource.garpreply;
		unsetresource.mbfinstlearning = resource.mbfinstlearning;
		unsetresource.rstintfonhafo = resource.rstintfonhafo;
		unsetresource.skipproxyingbsdtraffic = resource.skipproxyingbsdtraffic;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the l2param resources that are configured on netscaler.
	*/
	public static l2param get(nitro_service service) throws Exception{
		l2param obj = new l2param();
		l2param[] response = (l2param[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the l2param resources that are configured on netscaler.
	*/
	public static l2param get(nitro_service service,  options option) throws Exception{
		l2param obj = new l2param();
		l2param[] response = (l2param[])obj.get_resources(service,option);
		return response[0];
	}

	public static class proxyarpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class usemymacEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class bdgsettingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class rstintfonhafoEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mbfinstlearningEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class macmodefwdmypktEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class bdggrpproxyarpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class garponvridintfEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class garpreplyEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class skipproxyingbsdtrafficEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
