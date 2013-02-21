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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnsparameter_response extends base_response
{
	public dnsparameter dnsparameter;
}
/**
* Configuration for DNS parameter resource.
*/

public class dnsparameter extends base_resource
{
	private Long retries;
	private Long minttl;
	private Long maxttl;
	private String cacherecords;
	private String namelookuppriority;
	private String recursion;
	private String resolutionorder;
	private String dnssec;
	private Long maxpipeline;
	private String dnsrootreferral;

	/**
	* <pre>
	* The DNS resolver request retry count.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  5
	* </pre>
	*/
	public void set_retries(long retries) throws Exception {
		this.retries = new Long(retries);
	}

	/**
	* <pre>
	* The DNS resolver request retry count.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  5
	* </pre>
	*/
	public void set_retries(Long retries) throws Exception{
		this.retries = retries;
	}

	/**
	* <pre>
	* The DNS resolver request retry count.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  5
	* </pre>
	*/
	public Long get_retries() throws Exception {
		return this.retries;
	}

	/**
	* <pre>
	* The minimum time to live value, in seconds. If any DNS entry has a time to live value of less than the minimum, it is saved as the minimum time to live value.<br> Minimum value =  0<br> Maximum value =  604800
	* </pre>
	*/
	public void set_minttl(long minttl) throws Exception {
		this.minttl = new Long(minttl);
	}

	/**
	* <pre>
	* The minimum time to live value, in seconds. If any DNS entry has a time to live value of less than the minimum, it is saved as the minimum time to live value.<br> Minimum value =  0<br> Maximum value =  604800
	* </pre>
	*/
	public void set_minttl(Long minttl) throws Exception{
		this.minttl = minttl;
	}

	/**
	* <pre>
	* The minimum time to live value, in seconds. If any DNS entry has a time to live value of less than the minimum, it is saved as the minimum time to live value.<br> Minimum value =  0<br> Maximum value =  604800
	* </pre>
	*/
	public Long get_minttl() throws Exception {
		return this.minttl;
	}

	/**
	* <pre>
	* The maximum time to live value allowed, in seconds. If the DNS entry has a time to live value of more than the maximum, it is saved as the maximum time to live value.<br> Default value: 604800<br> Minimum value =  1<br> Maximum value =  604800
	* </pre>
	*/
	public void set_maxttl(long maxttl) throws Exception {
		this.maxttl = new Long(maxttl);
	}

	/**
	* <pre>
	* The maximum time to live value allowed, in seconds. If the DNS entry has a time to live value of more than the maximum, it is saved as the maximum time to live value.<br> Default value: 604800<br> Minimum value =  1<br> Maximum value =  604800
	* </pre>
	*/
	public void set_maxttl(Long maxttl) throws Exception{
		this.maxttl = maxttl;
	}

	/**
	* <pre>
	* The maximum time to live value allowed, in seconds. If the DNS entry has a time to live value of more than the maximum, it is saved as the maximum time to live value.<br> Default value: 604800<br> Minimum value =  1<br> Maximum value =  604800
	* </pre>
	*/
	public Long get_maxttl() throws Exception {
		return this.maxttl;
	}

	/**
	* <pre>
	* The state of dns records caching.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cacherecords(String cacherecords) throws Exception{
		this.cacherecords = cacherecords;
	}

	/**
	* <pre>
	* The state of dns records caching.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cacherecords() throws Exception {
		return this.cacherecords;
	}

	/**
	* <pre>
	* The name lookup priority, as DNS or WINS.<br> Default value: NS_WINSFIRST<br> Possible values = WINS, DNS
	* </pre>
	*/
	public void set_namelookuppriority(String namelookuppriority) throws Exception{
		this.namelookuppriority = namelookuppriority;
	}

	/**
	* <pre>
	* The name lookup priority, as DNS or WINS.<br> Default value: NS_WINSFIRST<br> Possible values = WINS, DNS
	* </pre>
	*/
	public String get_namelookuppriority() throws Exception {
		return this.namelookuppriority;
	}

	/**
	* <pre>
	* Allow recursive name resolution by NetScaler.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_recursion(String recursion) throws Exception{
		this.recursion = recursion;
	}

	/**
	* <pre>
	* Allow recursive name resolution by NetScaler.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_recursion() throws Exception {
		return this.recursion;
	}

	/**
	* <pre>
	* The order in which DNS resolver send A/AAAA query for the domain.<br> Default value: NS_FOUR<br> Possible values = OnlyAQuery, OnlyAAAAQuery, AThenAAAAQuery, AAAAThenAQuery
	* </pre>
	*/
	public void set_resolutionorder(String resolutionorder) throws Exception{
		this.resolutionorder = resolutionorder;
	}

	/**
	* <pre>
	* The order in which DNS resolver send A/AAAA query for the domain.<br> Default value: NS_FOUR<br> Possible values = OnlyAQuery, OnlyAAAAQuery, AThenAAAAQuery, AAAAThenAQuery
	* </pre>
	*/
	public String get_resolutionorder() throws Exception {
		return this.resolutionorder;
	}

	/**
	* <pre>
	* To enable the DNS security extensions.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dnssec(String dnssec) throws Exception{
		this.dnssec = dnssec;
	}

	/**
	* <pre>
	* To enable the DNS security extensions.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dnssec() throws Exception {
		return this.dnssec;
	}

	/**
	* <pre>
	* To set the maximum value of the concurrent DNS pipeline. A setting of zero makes the pipeline infinite.
	* </pre>
	*/
	public void set_maxpipeline(long maxpipeline) throws Exception {
		this.maxpipeline = new Long(maxpipeline);
	}

	/**
	* <pre>
	* To set the maximum value of the concurrent DNS pipeline. A setting of zero makes the pipeline infinite.
	* </pre>
	*/
	public void set_maxpipeline(Long maxpipeline) throws Exception{
		this.maxpipeline = maxpipeline;
	}

	/**
	* <pre>
	* To set the maximum value of the concurrent DNS pipeline. A setting of zero makes the pipeline infinite.
	* </pre>
	*/
	public Long get_maxpipeline() throws Exception {
		return this.maxpipeline;
	}

	/**
	* <pre>
	* This option is used to enable/disable the sending NS root referrals.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dnsrootreferral(String dnsrootreferral) throws Exception{
		this.dnsrootreferral = dnsrootreferral;
	}

	/**
	* <pre>
	* This option is used to enable/disable the sending NS root referrals.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dnsrootreferral() throws Exception {
		return this.dnsrootreferral;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		dnsparameter[] resources = new dnsparameter[1];
		dnsparameter_response result = (dnsparameter_response) service.get_payload_formatter().string_to_resource(dnsparameter_response.class, response);
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
		resources[0] = result.dnsparameter;
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
	* Use this API to update dnsparameter.
	*/
	public static base_response update(nitro_service client, dnsparameter resource) throws Exception {
		dnsparameter updateresource = new dnsparameter();
		updateresource.retries = resource.retries;
		updateresource.minttl = resource.minttl;
		updateresource.maxttl = resource.maxttl;
		updateresource.cacherecords = resource.cacherecords;
		updateresource.namelookuppriority = resource.namelookuppriority;
		updateresource.recursion = resource.recursion;
		updateresource.resolutionorder = resource.resolutionorder;
		updateresource.dnssec = resource.dnssec;
		updateresource.maxpipeline = resource.maxpipeline;
		updateresource.dnsrootreferral = resource.dnsrootreferral;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of dnsparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnsparameter resource, String[] args) throws Exception{
		dnsparameter unsetresource = new dnsparameter();
		unsetresource.retries = resource.retries;
		unsetresource.minttl = resource.minttl;
		unsetresource.maxttl = resource.maxttl;
		unsetresource.cacherecords = resource.cacherecords;
		unsetresource.namelookuppriority = resource.namelookuppriority;
		unsetresource.recursion = resource.recursion;
		unsetresource.resolutionorder = resource.resolutionorder;
		unsetresource.dnssec = resource.dnssec;
		unsetresource.maxpipeline = resource.maxpipeline;
		unsetresource.dnsrootreferral = resource.dnsrootreferral;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the dnsparameter resources that are configured on netscaler.
	*/
	public static dnsparameter get(nitro_service service) throws Exception{
		dnsparameter obj = new dnsparameter();
		dnsparameter[] response = (dnsparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the dnsparameter resources that are configured on netscaler.
	*/
	public static dnsparameter get(nitro_service service,  options option) throws Exception{
		dnsparameter obj = new dnsparameter();
		dnsparameter[] response = (dnsparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class namelookuppriorityEnum {
		public static final String WINS = "WINS";
		public static final String DNS = "DNS";
	}
	public static class cacherecordsEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class dnsrootreferralEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class recursionEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class resolutionorderEnum {
		public static final String OnlyAQuery = "OnlyAQuery";
		public static final String OnlyAAAAQuery = "OnlyAAAAQuery";
		public static final String AThenAAAAQuery = "AThenAAAAQuery";
		public static final String AAAAThenAQuery = "AAAAThenAQuery";
	}
	public static class dnssecEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
