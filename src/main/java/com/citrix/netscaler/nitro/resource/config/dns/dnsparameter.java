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
	private Long dns64timeout;

	/**
	* <pre>
	* Maximum number of retry attempts when no response is received for a query sent to a name server. Applies to end resolver and forwarder configurations.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  5
	* </pre>
	*/
	public void set_retries(long retries) throws Exception {
		this.retries = new Long(retries);
	}

	/**
	* <pre>
	* Maximum number of retry attempts when no response is received for a query sent to a name server. Applies to end resolver and forwarder configurations.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  5
	* </pre>
	*/
	public void set_retries(Long retries) throws Exception{
		this.retries = retries;
	}

	/**
	* <pre>
	* Maximum number of retry attempts when no response is received for a query sent to a name server. Applies to end resolver and forwarder configurations.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  5
	* </pre>
	*/
	public Long get_retries() throws Exception {
		return this.retries;
	}

	/**
	* <pre>
	* Minimum permissible time to live (TTL) for all records cached in the DNS cache by DNS proxy, end resolver, and forwarder configurations. If the TTL of a record that is to be cached is lower than the value configured for minTTL, the TTL of the record is set to the value of minTTL before caching. When you modify this setting, the new value is applied only to those records that are cached after the modification. The TTL values of existing records are not changed.<br> Minimum value =  0<br> Maximum value =  604800
	* </pre>
	*/
	public void set_minttl(long minttl) throws Exception {
		this.minttl = new Long(minttl);
	}

	/**
	* <pre>
	* Minimum permissible time to live (TTL) for all records cached in the DNS cache by DNS proxy, end resolver, and forwarder configurations. If the TTL of a record that is to be cached is lower than the value configured for minTTL, the TTL of the record is set to the value of minTTL before caching. When you modify this setting, the new value is applied only to those records that are cached after the modification. The TTL values of existing records are not changed.<br> Minimum value =  0<br> Maximum value =  604800
	* </pre>
	*/
	public void set_minttl(Long minttl) throws Exception{
		this.minttl = minttl;
	}

	/**
	* <pre>
	* Minimum permissible time to live (TTL) for all records cached in the DNS cache by DNS proxy, end resolver, and forwarder configurations. If the TTL of a record that is to be cached is lower than the value configured for minTTL, the TTL of the record is set to the value of minTTL before caching. When you modify this setting, the new value is applied only to those records that are cached after the modification. The TTL values of existing records are not changed.<br> Minimum value =  0<br> Maximum value =  604800
	* </pre>
	*/
	public Long get_minttl() throws Exception {
		return this.minttl;
	}

	/**
	* <pre>
	* Maximum time to live (TTL) for all records cached in the DNS cache by DNS proxy, end resolver, and forwarder configurations. If the TTL of a record that is to be cached is higher than the value configured for maxTTL, the TTL of the record is set to the value of maxTTL before caching. When you modify this setting, the new value is applied only to those records that are cached after the modification. The TTL values of existing records are not changed.<br> Default value: 604800<br> Minimum value =  1<br> Maximum value =  604800
	* </pre>
	*/
	public void set_maxttl(long maxttl) throws Exception {
		this.maxttl = new Long(maxttl);
	}

	/**
	* <pre>
	* Maximum time to live (TTL) for all records cached in the DNS cache by DNS proxy, end resolver, and forwarder configurations. If the TTL of a record that is to be cached is higher than the value configured for maxTTL, the TTL of the record is set to the value of maxTTL before caching. When you modify this setting, the new value is applied only to those records that are cached after the modification. The TTL values of existing records are not changed.<br> Default value: 604800<br> Minimum value =  1<br> Maximum value =  604800
	* </pre>
	*/
	public void set_maxttl(Long maxttl) throws Exception{
		this.maxttl = maxttl;
	}

	/**
	* <pre>
	* Maximum time to live (TTL) for all records cached in the DNS cache by DNS proxy, end resolver, and forwarder configurations. If the TTL of a record that is to be cached is higher than the value configured for maxTTL, the TTL of the record is set to the value of maxTTL before caching. When you modify this setting, the new value is applied only to those records that are cached after the modification. The TTL values of existing records are not changed.<br> Default value: 604800<br> Minimum value =  1<br> Maximum value =  604800
	* </pre>
	*/
	public Long get_maxttl() throws Exception {
		return this.maxttl;
	}

	/**
	* <pre>
	* Cache resource records in the DNS cache. Applies to resource records obtained through proxy configurations only. End resolver and forwarder configurations always cache records in the DNS cache, and you cannot disable this behavior. When you disable record caching, the appliance stops caching server responses. However, cached records are not flushed. The appliance does not serve requests from the cache until record caching is enabled again.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cacherecords(String cacherecords) throws Exception{
		this.cacherecords = cacherecords;
	}

	/**
	* <pre>
	* Cache resource records in the DNS cache. Applies to resource records obtained through proxy configurations only. End resolver and forwarder configurations always cache records in the DNS cache, and you cannot disable this behavior. When you disable record caching, the appliance stops caching server responses. However, cached records are not flushed. The appliance does not serve requests from the cache until record caching is enabled again.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cacherecords() throws Exception {
		return this.cacherecords;
	}

	/**
	* <pre>
	* Type of lookup (DNS or WINS) to attempt first. If the first-priority lookup fails, the second-priority lookup is attempted. Used only by the SSL VPN feature.<br> Default value: WINS<br> Possible values = WINS, DNS
	* </pre>
	*/
	public void set_namelookuppriority(String namelookuppriority) throws Exception{
		this.namelookuppriority = namelookuppriority;
	}

	/**
	* <pre>
	* Type of lookup (DNS or WINS) to attempt first. If the first-priority lookup fails, the second-priority lookup is attempted. Used only by the SSL VPN feature.<br> Default value: WINS<br> Possible values = WINS, DNS
	* </pre>
	*/
	public String get_namelookuppriority() throws Exception {
		return this.namelookuppriority;
	}

	/**
	* <pre>
	* Function as an end resolver and recursively resolve queries for domains that are not hosted on the NetScaler appliance. Also resolve queries recursively when the external name servers configured on the appliance (for a forwarder configuration) are unavailable. When external name servers are unavailable, the appliance queries a root server and resolves the request recursively, as it does for an end resolver configuration.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_recursion(String recursion) throws Exception{
		this.recursion = recursion;
	}

	/**
	* <pre>
	* Function as an end resolver and recursively resolve queries for domains that are not hosted on the NetScaler appliance. Also resolve queries recursively when the external name servers configured on the appliance (for a forwarder configuration) are unavailable. When external name servers are unavailable, the appliance queries a root server and resolves the request recursively, as it does for an end resolver configuration.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_recursion() throws Exception {
		return this.recursion;
	}

	/**
	* <pre>
	* Type of DNS queries (A, AAAA, or both) to generate during the routine functioning of certain NetScaler features, such as SSL VPN, cache redirection, and the integrated cache. The queries are sent to the external name servers that are configured for the forwarder function. If you specify both query types, you can also specify the order. Available settings function as follows:
* OnlyAQuery. Send queries for IPv4 address records (A records) only. 
* OnlyAAAAQuery. Send queries for IPv6 address records (AAAA records) instead of queries for IPv4 address records (A records).
* AThenAAAAQuery. Send a query for an A record, and then send a query for an AAAA record if the query for the A record results in a NODATA response from the name server.
* AAAAThenAQuery. Send a query for an AAAA record, and then send a query for an A record if the query for the AAAA record results in a NODATA response from the name server.<br> Default value: OnlyAQuery<br> Possible values = OnlyAQuery, OnlyAAAAQuery, AThenAAAAQuery, AAAAThenAQuery
	* </pre>
	*/
	public void set_resolutionorder(String resolutionorder) throws Exception{
		this.resolutionorder = resolutionorder;
	}

	/**
	* <pre>
	* Type of DNS queries (A, AAAA, or both) to generate during the routine functioning of certain NetScaler features, such as SSL VPN, cache redirection, and the integrated cache. The queries are sent to the external name servers that are configured for the forwarder function. If you specify both query types, you can also specify the order. Available settings function as follows:
* OnlyAQuery. Send queries for IPv4 address records (A records) only. 
* OnlyAAAAQuery. Send queries for IPv6 address records (AAAA records) instead of queries for IPv4 address records (A records).
* AThenAAAAQuery. Send a query for an A record, and then send a query for an AAAA record if the query for the A record results in a NODATA response from the name server.
* AAAAThenAQuery. Send a query for an AAAA record, and then send a query for an A record if the query for the AAAA record results in a NODATA response from the name server.<br> Default value: OnlyAQuery<br> Possible values = OnlyAQuery, OnlyAAAAQuery, AThenAAAAQuery, AAAAThenAQuery
	* </pre>
	*/
	public String get_resolutionorder() throws Exception {
		return this.resolutionorder;
	}

	/**
	* <pre>
	* Enable or disable the Domain Name System Security Extensions (DNSSEC) feature on the appliance. Note: Even when the DNSSEC feature is enabled, forwarder configurations (used by internal NetScaler features such as SSL VPN and Cache Redirection for name resolution) do not support the DNSSEC OK (DO) bit in the EDNS0 OPT header.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dnssec(String dnssec) throws Exception{
		this.dnssec = dnssec;
	}

	/**
	* <pre>
	* Enable or disable the Domain Name System Security Extensions (DNSSEC) feature on the appliance. Note: Even when the DNSSEC feature is enabled, forwarder configurations (used by internal NetScaler features such as SSL VPN and Cache Redirection for name resolution) do not support the DNSSEC OK (DO) bit in the EDNS0 OPT header.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dnssec() throws Exception {
		return this.dnssec;
	}

	/**
	* <pre>
	* Maximum number of concurrent DNS requests to allow on a single client connection, which is identified by the <clientip:port>-<vserver ip:port> tuple. A value of 0 (zero) applies no limit to the number of concurrent DNS requests allowed on a single client connection.
	* </pre>
	*/
	public void set_maxpipeline(long maxpipeline) throws Exception {
		this.maxpipeline = new Long(maxpipeline);
	}

	/**
	* <pre>
	* Maximum number of concurrent DNS requests to allow on a single client connection, which is identified by the <clientip:port>-<vserver ip:port> tuple. A value of 0 (zero) applies no limit to the number of concurrent DNS requests allowed on a single client connection.
	* </pre>
	*/
	public void set_maxpipeline(Long maxpipeline) throws Exception{
		this.maxpipeline = maxpipeline;
	}

	/**
	* <pre>
	* Maximum number of concurrent DNS requests to allow on a single client connection, which is identified by the <clientip:port>-<vserver ip:port> tuple. A value of 0 (zero) applies no limit to the number of concurrent DNS requests allowed on a single client connection.
	* </pre>
	*/
	public Long get_maxpipeline() throws Exception {
		return this.maxpipeline;
	}

	/**
	* <pre>
	* Send a root referral if a client queries a domain name that is unrelated to the domains configured/cached on the NetScaler appliance. If the setting is disabled, the appliance sends a blank response instead of a root referral. Applicable to domains for which the appliance is authoritative. Disable the parameter when the appliance is under attack from a client that is sending a flood of queries for unrelated domains.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dnsrootreferral(String dnsrootreferral) throws Exception{
		this.dnsrootreferral = dnsrootreferral;
	}

	/**
	* <pre>
	* Send a root referral if a client queries a domain name that is unrelated to the domains configured/cached on the NetScaler appliance. If the setting is disabled, the appliance sends a blank response instead of a root referral. Applicable to domains for which the appliance is authoritative. Disable the parameter when the appliance is under attack from a client that is sending a flood of queries for unrelated domains.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dnsrootreferral() throws Exception {
		return this.dnsrootreferral;
	}

	/**
	* <pre>
	* While doing DNS64 resolution, this parameter specifies the time to wait before sending an A query if no response is received from backend DNS server for AAAA query.<br> Minimum value =  0<br> Maximum value =  10000
	* </pre>
	*/
	public void set_dns64timeout(long dns64timeout) throws Exception {
		this.dns64timeout = new Long(dns64timeout);
	}

	/**
	* <pre>
	* While doing DNS64 resolution, this parameter specifies the time to wait before sending an A query if no response is received from backend DNS server for AAAA query.<br> Minimum value =  0<br> Maximum value =  10000
	* </pre>
	*/
	public void set_dns64timeout(Long dns64timeout) throws Exception{
		this.dns64timeout = dns64timeout;
	}

	/**
	* <pre>
	* While doing DNS64 resolution, this parameter specifies the time to wait before sending an A query if no response is received from backend DNS server for AAAA query.<br> Minimum value =  0<br> Maximum value =  10000
	* </pre>
	*/
	public Long get_dns64timeout() throws Exception {
		return this.dns64timeout;
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
		updateresource.dns64timeout = resource.dns64timeout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of dnsparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnsparameter resource, String[] args) throws Exception{
		dnsparameter unsetresource = new dnsparameter();
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
