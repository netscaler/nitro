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

package com.citrix.netscaler.nitro.resource.config.cr;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class crvserver_response extends base_response
{
	public crvserver[] crvserver;
}
/**
* Configuration for CR virtual server resource.
*/

public class crvserver extends base_resource
{
	private String name;
	private Long td;
	private String servicetype;
	private String ipv46;
	private Integer port;
	private Long range;
	private String cachetype;
	private String redirect;
	private String onpolicymatch;
	private String redirecturl;
	private Long clttimeout;
	private String precedence;
	private String arp;
	private String ghost;
	private String map;
	private String format;
	private String via;
	private String cachevserver;
	private String dnsvservername;
	private String destinationvserver;
	private String domain;
	private Long sopersistencetimeout;
	private Long sothreshold;
	private String reuse;
	private String state;
	private String downstateflush;
	private String backupvserver;
	private String disableprimaryondown;
	private String l2conn;
	private String backendssl;
	private String listenpolicy;
	private Long listenpriority;
	private String tcpprofilename;
	private String httpprofilename;
	private String comment;
	private String srcipexpr;
	private String originusip;
	private String useportrange;
	private String appflowlog;
	private String netprofile;
	private String icmpvsrresponse;
	private String newname;

	//------- Read only Parameter ---------;

	private String ip;
	private String value;
	private String ngname;
	private String type;
	private String curstate;
	private Integer status;
	private String authentication;
	private String homepage;
	private String rule;
	private String policyname;
	private String servicename;
	private Long weight;
	private String targetvserver;
	private Long priority;
	private String somethod;
	private String sopersistence;
	private String lbvserver;
	private Long __count;

	/**
	* <pre>
	* Name for the cache redirection virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Can be changed after the cache redirection virtual server is created.
The following requirement applies only to the NetScaler CLI:  
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my server” or ‘my server’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the cache redirection virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Can be changed after the cache redirection virtual server is created.
The following requirement applies only to the NetScaler CLI:  
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my server” or ‘my server’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Traffic Domain ID.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain ID.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain ID.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* Protocol (type of service) handled by the virtual server.<br> Possible values = HTTP, SSL, NNTP
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* Protocol (type of service) handled by the virtual server.<br> Possible values = HTTP, SSL, NNTP
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* IPv4 or IPv6 address of the cache redirection virtual server. Usually a public IP address. Clients send connection requests to this IP address.
Note: For a transparent cache redirection virtual server, use an asterisk (*) to specify a wildcard virtual server address.
	* </pre>
	*/
	public void set_ipv46(String ipv46) throws Exception{
		this.ipv46 = ipv46;
	}

	/**
	* <pre>
	* IPv4 or IPv6 address of the cache redirection virtual server. Usually a public IP address. Clients send connection requests to this IP address.
Note: For a transparent cache redirection virtual server, use an asterisk (*) to specify a wildcard virtual server address.
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* Port number of the virtual server.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Port number of the virtual server.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Port number of the virtual server.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Number of consecutive IP addresses, starting with the address specified by the IPAddress parameter, to include in a range of addresses assigned to this virtual server.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(long range) throws Exception {
		this.range = new Long(range);
	}

	/**
	* <pre>
	* Number of consecutive IP addresses, starting with the address specified by the IPAddress parameter, to include in a range of addresses assigned to this virtual server.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(Long range) throws Exception{
		this.range = range;
	}

	/**
	* <pre>
	* Number of consecutive IP addresses, starting with the address specified by the IPAddress parameter, to include in a range of addresses assigned to this virtual server.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public Long get_range() throws Exception {
		return this.range;
	}

	/**
	* <pre>
	* Mode of operation for the cache redirection virtual server. Available settings function as follows:
* TRANSPARENT - Intercept all traffic flowing to the appliance and apply cache redirection policies to determine whether content should be served from the cache or from the origin server.
* FORWARD - Resolve the hostname of the incoming request, by using a DNS server, and forward requests for non-cacheable content to the resolved origin servers. Cacheable requests are sent to the configured cache servers.
* REVERSE - Configure reverse proxy caches for specific origin servers. Incoming traffic directed to the reverse proxy can either be served from a cache server or be sent to the origin server with or without modification to the URL.<br> Default value: TRANSPARENT<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public void set_cachetype(String cachetype) throws Exception{
		this.cachetype = cachetype;
	}

	/**
	* <pre>
	* Mode of operation for the cache redirection virtual server. Available settings function as follows:
* TRANSPARENT - Intercept all traffic flowing to the appliance and apply cache redirection policies to determine whether content should be served from the cache or from the origin server.
* FORWARD - Resolve the hostname of the incoming request, by using a DNS server, and forward requests for non-cacheable content to the resolved origin servers. Cacheable requests are sent to the configured cache servers.
* REVERSE - Configure reverse proxy caches for specific origin servers. Incoming traffic directed to the reverse proxy can either be served from a cache server or be sent to the origin server with or without modification to the URL.<br> Default value: TRANSPARENT<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* Type of cache server to which to redirect HTTP requests. Available settings function as follows:
* CACHE - Direct all requests to the cache.
* POLICY - Apply the cache redirection policy to determine whether the request should be directed to the cache or to the origin.
* ORIGIN - Direct all requests to the origin server.<br> Default value: POLICY<br> Possible values = CACHE, POLICY, ORIGIN
	* </pre>
	*/
	public void set_redirect(String redirect) throws Exception{
		this.redirect = redirect;
	}

	/**
	* <pre>
	* Type of cache server to which to redirect HTTP requests. Available settings function as follows:
* CACHE - Direct all requests to the cache.
* POLICY - Apply the cache redirection policy to determine whether the request should be directed to the cache or to the origin.
* ORIGIN - Direct all requests to the origin server.<br> Default value: POLICY<br> Possible values = CACHE, POLICY, ORIGIN
	* </pre>
	*/
	public String get_redirect() throws Exception {
		return this.redirect;
	}

	/**
	* <pre>
	* Redirect requests that match the policy to either the cache or the origin server, as specified.
Note: For this option to work, you must set the cache redirection type to POLICY.<br> Default value: ORIGIN<br> Possible values = CACHE, ORIGIN
	* </pre>
	*/
	public void set_onpolicymatch(String onpolicymatch) throws Exception{
		this.onpolicymatch = onpolicymatch;
	}

	/**
	* <pre>
	* Redirect requests that match the policy to either the cache or the origin server, as specified.
Note: For this option to work, you must set the cache redirection type to POLICY.<br> Default value: ORIGIN<br> Possible values = CACHE, ORIGIN
	* </pre>
	*/
	public String get_onpolicymatch() throws Exception {
		return this.onpolicymatch;
	}

	/**
	* <pre>
	* URL of the server to which to redirect traffic if the cache redirection virtual server configured on the NetScaler appliance becomes unavailable.<br> Minimum length =  1<br> Maximum length =  128
	* </pre>
	*/
	public void set_redirecturl(String redirecturl) throws Exception{
		this.redirecturl = redirecturl;
	}

	/**
	* <pre>
	* URL of the server to which to redirect traffic if the cache redirection virtual server configured on the NetScaler appliance becomes unavailable.<br> Minimum length =  1<br> Maximum length =  128
	* </pre>
	*/
	public String get_redirecturl() throws Exception {
		return this.redirecturl;
	}

	/**
	* <pre>
	* Time-out value, in seconds, after which to terminate an idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* Time-out value, in seconds, after which to terminate an idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* Time-out value, in seconds, after which to terminate an idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* Type of policy (URL or RULE) that takes precedence on the cache redirection virtual server. Applies only to cache redirection virtual servers that have both URL and RULE based policies. If you specify URL, URL based policies are applied first, in the following order:
1.   Domain and exact URL
2.   Domain, prefix and suffix
3.   Domain and suffix
4.   Domain and prefix
5.   Domain only
6.   Exact URL
7.   Prefix and suffix
8.   Suffix only
9.   Prefix only
10.  Default
If you specify RULE, the rule based policies are applied before URL based policies are applied.<br> Default value: RULE<br> Possible values = RULE, URL
	* </pre>
	*/
	public void set_precedence(String precedence) throws Exception{
		this.precedence = precedence;
	}

	/**
	* <pre>
	* Type of policy (URL or RULE) that takes precedence on the cache redirection virtual server. Applies only to cache redirection virtual servers that have both URL and RULE based policies. If you specify URL, URL based policies are applied first, in the following order:
1.   Domain and exact URL
2.   Domain, prefix and suffix
3.   Domain and suffix
4.   Domain and prefix
5.   Domain only
6.   Exact URL
7.   Prefix and suffix
8.   Suffix only
9.   Prefix only
10.  Default
If you specify RULE, the rule based policies are applied before URL based policies are applied.<br> Default value: RULE<br> Possible values = RULE, URL
	* </pre>
	*/
	public String get_precedence() throws Exception {
		return this.precedence;
	}

	/**
	* <pre>
	* Use ARP to determine the destination MAC address.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_arp(String arp) throws Exception{
		this.arp = arp;
	}

	/**
	* <pre>
	* Use ARP to determine the destination MAC address.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_arp() throws Exception {
		return this.arp;
	}

	/**
	* <pre>
	* .<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_ghost(String ghost) throws Exception{
		this.ghost = ghost;
	}

	/**
	* <pre>
	* .<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_ghost() throws Exception {
		return this.ghost;
	}

	/**
	* <pre>
	* Obsolete.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_map(String map) throws Exception{
		this.map = map;
	}

	/**
	* <pre>
	* Obsolete.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_map() throws Exception {
		return this.map;
	}

	/**
	* <pre>
	* .<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_format(String format) throws Exception{
		this.format = format;
	}

	/**
	* <pre>
	* .<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_format() throws Exception {
		return this.format;
	}

	/**
	* <pre>
	* Insert a via header in each HTTP request. In the case of a cache miss, the request is redirected from the cache server to the origin server. This header indicates whether the request is being sent from a cache server.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_via(String via) throws Exception{
		this.via = via;
	}

	/**
	* <pre>
	* Insert a via header in each HTTP request. In the case of a cache miss, the request is redirected from the cache server to the origin server. This header indicates whether the request is being sent from a cache server.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_via() throws Exception {
		return this.via;
	}

	/**
	* <pre>
	* Name of the default cache virtual server to which to redirect requests (the default target of the cache redirection virtual server).<br> Minimum length =  1
	* </pre>
	*/
	public void set_cachevserver(String cachevserver) throws Exception{
		this.cachevserver = cachevserver;
	}

	/**
	* <pre>
	* Name of the default cache virtual server to which to redirect requests (the default target of the cache redirection virtual server).<br> Minimum length =  1
	* </pre>
	*/
	public String get_cachevserver() throws Exception {
		return this.cachevserver;
	}

	/**
	* <pre>
	* Name of the DNS virtual server that resolves domain names arriving at the forward proxy virtual server.
Note: This parameter applies only to forward proxy virtual servers, not reverse or transparent.<br> Minimum length =  1
	* </pre>
	*/
	public void set_dnsvservername(String dnsvservername) throws Exception{
		this.dnsvservername = dnsvservername;
	}

	/**
	* <pre>
	* Name of the DNS virtual server that resolves domain names arriving at the forward proxy virtual server.
Note: This parameter applies only to forward proxy virtual servers, not reverse or transparent.<br> Minimum length =  1
	* </pre>
	*/
	public String get_dnsvservername() throws Exception {
		return this.dnsvservername;
	}

	/**
	* <pre>
	* Destination virtual server for a transparent or forward proxy cache redirection virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_destinationvserver(String destinationvserver) throws Exception{
		this.destinationvserver = destinationvserver;
	}

	/**
	* <pre>
	* Destination virtual server for a transparent or forward proxy cache redirection virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_destinationvserver() throws Exception {
		return this.destinationvserver;
	}

	/**
	* <pre>
	* Default domain for reverse proxies. Domains are configured to direct an incoming request from a specified source domain to a specified target domain. There can be several configured pairs of source and target domains. You can select one pair to be the default. If the host header or URL of an incoming request does not include a source domain, this option sends the request to the specified target domain.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* Default domain for reverse proxies. Domains are configured to direct an incoming request from a specified source domain to a specified target domain. There can be several configured pairs of source and target domains. You can select one pair to be the default. If the host header or URL of an incoming request does not include a source domain, this option sends the request to the specified target domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* Time-out, in minutes, for spillover persistence.<br> Minimum value =  2<br> Maximum value =  24
	* </pre>
	*/
	public void set_sopersistencetimeout(long sopersistencetimeout) throws Exception {
		this.sopersistencetimeout = new Long(sopersistencetimeout);
	}

	/**
	* <pre>
	* Time-out, in minutes, for spillover persistence.<br> Minimum value =  2<br> Maximum value =  24
	* </pre>
	*/
	public void set_sopersistencetimeout(Long sopersistencetimeout) throws Exception{
		this.sopersistencetimeout = sopersistencetimeout;
	}

	/**
	* <pre>
	* Time-out, in minutes, for spillover persistence.<br> Minimum value =  2<br> Maximum value =  24
	* </pre>
	*/
	public Long get_sopersistencetimeout() throws Exception {
		return this.sopersistencetimeout;
	}

	/**
	* <pre>
	* For CONNECTION (or) DYNAMICCONNECTION spillover, the number of connections above which the virtual server enters spillover mode. For BANDWIDTH spillover, the amount of incoming and outgoing traffic (in Kbps) before spillover. For HEALTH spillover, the percentage of active services (by weight) below which spillover occurs.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sothreshold(long sothreshold) throws Exception {
		this.sothreshold = new Long(sothreshold);
	}

	/**
	* <pre>
	* For CONNECTION (or) DYNAMICCONNECTION spillover, the number of connections above which the virtual server enters spillover mode. For BANDWIDTH spillover, the amount of incoming and outgoing traffic (in Kbps) before spillover. For HEALTH spillover, the percentage of active services (by weight) below which spillover occurs.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sothreshold(Long sothreshold) throws Exception{
		this.sothreshold = sothreshold;
	}

	/**
	* <pre>
	* For CONNECTION (or) DYNAMICCONNECTION spillover, the number of connections above which the virtual server enters spillover mode. For BANDWIDTH spillover, the amount of incoming and outgoing traffic (in Kbps) before spillover. For HEALTH spillover, the percentage of active services (by weight) below which spillover occurs.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
	}

	/**
	* <pre>
	* Reuse TCP connections to the origin server across client connections. Do not set this parameter unless the Service Type parameter is set to HTTP. If you set this parameter to OFF, the possible settings of the Redirect parameter function as follows:
* CACHE - TCP connections to the cache servers are not reused.
* ORIGIN - TCP connections to the origin servers are not reused. 
* POLICY - TCP connections to the origin servers are not reused.
If you set the Reuse parameter to ON, connections to origin servers and connections to cache servers are reused.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_reuse(String reuse) throws Exception{
		this.reuse = reuse;
	}

	/**
	* <pre>
	* Reuse TCP connections to the origin server across client connections. Do not set this parameter unless the Service Type parameter is set to HTTP. If you set this parameter to OFF, the possible settings of the Redirect parameter function as follows:
* CACHE - TCP connections to the cache servers are not reused.
* ORIGIN - TCP connections to the origin servers are not reused. 
* POLICY - TCP connections to the origin servers are not reused.
If you set the Reuse parameter to ON, connections to origin servers and connections to cache servers are reused.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_reuse() throws Exception {
		return this.reuse;
	}

	/**
	* <pre>
	* Initial state of the cache redirection virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Initial state of the cache redirection virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Perform delayed cleanup of connections to this virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Perform delayed cleanup of connections to this virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* Name of the backup virtual server to which traffic is forwarded if the active server becomes unavailable.<br> Minimum length =  1
	* </pre>
	*/
	public void set_backupvserver(String backupvserver) throws Exception{
		this.backupvserver = backupvserver;
	}

	/**
	* <pre>
	* Name of the backup virtual server to which traffic is forwarded if the active server becomes unavailable.<br> Minimum length =  1
	* </pre>
	*/
	public String get_backupvserver() throws Exception {
		return this.backupvserver;
	}

	/**
	* <pre>
	* Continue sending traffic to a backup virtual server even after the primary virtual server comes UP from the DOWN state.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_disableprimaryondown(String disableprimaryondown) throws Exception{
		this.disableprimaryondown = disableprimaryondown;
	}

	/**
	* <pre>
	* Continue sending traffic to a backup virtual server even after the primary virtual server comes UP from the DOWN state.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_disableprimaryondown() throws Exception {
		return this.disableprimaryondown;
	}

	/**
	* <pre>
	* Use L2 parameters, such as MAC, VLAN, and channel to identify a connection.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_l2conn(String l2conn) throws Exception{
		this.l2conn = l2conn;
	}

	/**
	* <pre>
	* Use L2 parameters, such as MAC, VLAN, and channel to identify a connection.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_l2conn() throws Exception {
		return this.l2conn;
	}

	/**
	* <pre>
	* Decides whether the backend connection made by NS to the origin server will be HTTP or SSL. Applicable only for SSL type CR Forward proxy vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_backendssl(String backendssl) throws Exception{
		this.backendssl = backendssl;
	}

	/**
	* <pre>
	* Decides whether the backend connection made by NS to the origin server will be HTTP or SSL. Applicable only for SSL type CR Forward proxy vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_backendssl() throws Exception {
		return this.backendssl;
	}

	/**
	* <pre>
	* String specifying the listen policy for the cache redirection virtual server. Can be either an in-line expression or the name of a named expression.<br> Default value: "none"
	* </pre>
	*/
	public void set_listenpolicy(String listenpolicy) throws Exception{
		this.listenpolicy = listenpolicy;
	}

	/**
	* <pre>
	* String specifying the listen policy for the cache redirection virtual server. Can be either an in-line expression or the name of a named expression.<br> Default value: "none"
	* </pre>
	*/
	public String get_listenpolicy() throws Exception {
		return this.listenpolicy;
	}

	/**
	* <pre>
	* Priority of the listen policy specified by the Listen Policy parameter. The lower the number, higher the priority.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_listenpriority(long listenpriority) throws Exception {
		this.listenpriority = new Long(listenpriority);
	}

	/**
	* <pre>
	* Priority of the listen policy specified by the Listen Policy parameter. The lower the number, higher the priority.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_listenpriority(Long listenpriority) throws Exception{
		this.listenpriority = listenpriority;
	}

	/**
	* <pre>
	* Priority of the listen policy specified by the Listen Policy parameter. The lower the number, higher the priority.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_listenpriority() throws Exception {
		return this.listenpriority;
	}

	/**
	* <pre>
	* Name of the profile containing TCP configuration information for the cache redirection virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_tcpprofilename(String tcpprofilename) throws Exception{
		this.tcpprofilename = tcpprofilename;
	}

	/**
	* <pre>
	* Name of the profile containing TCP configuration information for the cache redirection virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_tcpprofilename() throws Exception {
		return this.tcpprofilename;
	}

	/**
	* <pre>
	* Name of the profile containing HTTP configuration information for cache redirection virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_httpprofilename(String httpprofilename) throws Exception{
		this.httpprofilename = httpprofilename;
	}

	/**
	* <pre>
	* Name of the profile containing HTTP configuration information for cache redirection virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_httpprofilename() throws Exception {
		return this.httpprofilename;
	}

	/**
	* <pre>
	* Comments associated with this virtual server.<br> Maximum length =  256
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this virtual server.<br> Maximum length =  256
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Expression used to extract the source IP addresses from the requests originating from the cache. Can be either an in-line expression or the name of a named expression.<br> Minimum length =  1<br> Maximum length =  1500
	* </pre>
	*/
	public void set_srcipexpr(String srcipexpr) throws Exception{
		this.srcipexpr = srcipexpr;
	}

	/**
	* <pre>
	* Expression used to extract the source IP addresses from the requests originating from the cache. Can be either an in-line expression or the name of a named expression.<br> Minimum length =  1<br> Maximum length =  1500
	* </pre>
	*/
	public String get_srcipexpr() throws Exception {
		return this.srcipexpr;
	}

	/**
	* <pre>
	* Use the client’s IP address as the source IP address in requests sent to the origin server.  
Note: You can enable this parameter to implement fully transparent CR deployment.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_originusip(String originusip) throws Exception{
		this.originusip = originusip;
	}

	/**
	* <pre>
	* Use the client’s IP address as the source IP address in requests sent to the origin server.  
Note: You can enable this parameter to implement fully transparent CR deployment.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_originusip() throws Exception {
		return this.originusip;
	}

	/**
	* <pre>
	* Use a port number from the port range (set by using the set ns param command, or in the Create Virtual Server (Cache Redirection) dialog box) as the source port in the requests sent to the origin server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_useportrange(String useportrange) throws Exception{
		this.useportrange = useportrange;
	}

	/**
	* <pre>
	* Use a port number from the port range (set by using the set ns param command, or in the Create Virtual Server (Cache Redirection) dialog box) as the source port in the requests sent to the origin server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_useportrange() throws Exception {
		return this.useportrange;
	}

	/**
	* <pre>
	* Enable logging of AppFlow information.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowlog(String appflowlog) throws Exception{
		this.appflowlog = appflowlog;
	}

	/**
	* <pre>
	* Enable logging of AppFlow information.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowlog() throws Exception {
		return this.appflowlog;
	}

	/**
	* <pre>
	* Name of the network profile containing network configurations for the cache redirection virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_netprofile(String netprofile) throws Exception{
		this.netprofile = netprofile;
	}

	/**
	* <pre>
	* Name of the network profile containing network configurations for the cache redirection virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_netprofile() throws Exception {
		return this.netprofile;
	}

	/**
	* <pre>
	* Criterion for responding to PING requests sent to this virtual server. If ACTIVE, respond only if the virtual server is available. If PASSIVE, respond even if the virtual server is not available.<br> Default value: PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public void set_icmpvsrresponse(String icmpvsrresponse) throws Exception{
		this.icmpvsrresponse = icmpvsrresponse;
	}

	/**
	* <pre>
	* Criterion for responding to PING requests sent to this virtual server. If ACTIVE, respond only if the virtual server is available. If PASSIVE, respond even if the virtual server is not available.<br> Default value: PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public String get_icmpvsrresponse() throws Exception {
		return this.icmpvsrresponse;
	}

	/**
	* <pre>
	* New name for the cache redirection virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my name” or ‘my name’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the cache redirection virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my name” or ‘my name’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* The ssl card status for the transparent ssl cr vserver.<br> Possible values = Certkey not bound, SSL feature disabled
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* Nodegroup devno to which this crvserver belongs to.
	* </pre>
	*/
	public String get_ngname() throws Exception {
		return this.ngname;
	}

	/**
	* <pre>
	* Virtual server type.<br> Possible values = CONTENT, ADDRESS
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The state of the cr vserver.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Status.
	* </pre>
	*/
	public Integer get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* Authentication.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* Home page.
	* </pre>
	*/
	public String get_homepage() throws Exception {
		return this.homepage;
	}

	/**
	* <pre>
	* Rule.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Policies bound to this vserver.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Service name.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* Weight for this service.
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The CSW target server names.
	* </pre>
	*/
	public String get_targetvserver() throws Exception {
		return this.targetvserver;
	}

	/**
	* <pre>
	* The priority for the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The spillover factor. When the main virtual server reaches this spillover threshold, it will give further traffic to the backupvserver.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public String get_somethod() throws Exception {
		return this.somethod;
	}

	/**
	* <pre>
	* The state of spillover persistence.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sopersistence() throws Exception {
		return this.sopersistence;
	}

	/**
	* <pre>
	* The Default target server name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_lbvserver() throws Exception {
		return this.lbvserver;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		crvserver_response result = (crvserver_response) service.get_payload_formatter().string_to_resource(crvserver_response.class, response);
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
		return result.crvserver;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add crvserver.
	*/
	public static base_response add(nitro_service client, crvserver resource) throws Exception {
		crvserver addresource = new crvserver();
		addresource.name = resource.name;
		addresource.td = resource.td;
		addresource.servicetype = resource.servicetype;
		addresource.ipv46 = resource.ipv46;
		addresource.port = resource.port;
		addresource.range = resource.range;
		addresource.cachetype = resource.cachetype;
		addresource.redirect = resource.redirect;
		addresource.onpolicymatch = resource.onpolicymatch;
		addresource.redirecturl = resource.redirecturl;
		addresource.clttimeout = resource.clttimeout;
		addresource.precedence = resource.precedence;
		addresource.arp = resource.arp;
		addresource.ghost = resource.ghost;
		addresource.map = resource.map;
		addresource.format = resource.format;
		addresource.via = resource.via;
		addresource.cachevserver = resource.cachevserver;
		addresource.dnsvservername = resource.dnsvservername;
		addresource.destinationvserver = resource.destinationvserver;
		addresource.domain = resource.domain;
		addresource.sopersistencetimeout = resource.sopersistencetimeout;
		addresource.sothreshold = resource.sothreshold;
		addresource.reuse = resource.reuse;
		addresource.state = resource.state;
		addresource.downstateflush = resource.downstateflush;
		addresource.backupvserver = resource.backupvserver;
		addresource.disableprimaryondown = resource.disableprimaryondown;
		addresource.l2conn = resource.l2conn;
		addresource.backendssl = resource.backendssl;
		addresource.listenpolicy = resource.listenpolicy;
		addresource.listenpriority = resource.listenpriority;
		addresource.tcpprofilename = resource.tcpprofilename;
		addresource.httpprofilename = resource.httpprofilename;
		addresource.comment = resource.comment;
		addresource.srcipexpr = resource.srcipexpr;
		addresource.originusip = resource.originusip;
		addresource.useportrange = resource.useportrange;
		addresource.appflowlog = resource.appflowlog;
		addresource.netprofile = resource.netprofile;
		addresource.icmpvsrresponse = resource.icmpvsrresponse;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add crvserver resources.
	*/
	public static base_responses add(nitro_service client, crvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crvserver addresources[] = new crvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new crvserver();
				addresources[i].name = resources[i].name;
				addresources[i].td = resources[i].td;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].ipv46 = resources[i].ipv46;
				addresources[i].port = resources[i].port;
				addresources[i].range = resources[i].range;
				addresources[i].cachetype = resources[i].cachetype;
				addresources[i].redirect = resources[i].redirect;
				addresources[i].onpolicymatch = resources[i].onpolicymatch;
				addresources[i].redirecturl = resources[i].redirecturl;
				addresources[i].clttimeout = resources[i].clttimeout;
				addresources[i].precedence = resources[i].precedence;
				addresources[i].arp = resources[i].arp;
				addresources[i].ghost = resources[i].ghost;
				addresources[i].map = resources[i].map;
				addresources[i].format = resources[i].format;
				addresources[i].via = resources[i].via;
				addresources[i].cachevserver = resources[i].cachevserver;
				addresources[i].dnsvservername = resources[i].dnsvservername;
				addresources[i].destinationvserver = resources[i].destinationvserver;
				addresources[i].domain = resources[i].domain;
				addresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				addresources[i].sothreshold = resources[i].sothreshold;
				addresources[i].reuse = resources[i].reuse;
				addresources[i].state = resources[i].state;
				addresources[i].downstateflush = resources[i].downstateflush;
				addresources[i].backupvserver = resources[i].backupvserver;
				addresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				addresources[i].l2conn = resources[i].l2conn;
				addresources[i].backendssl = resources[i].backendssl;
				addresources[i].listenpolicy = resources[i].listenpolicy;
				addresources[i].listenpriority = resources[i].listenpriority;
				addresources[i].tcpprofilename = resources[i].tcpprofilename;
				addresources[i].httpprofilename = resources[i].httpprofilename;
				addresources[i].comment = resources[i].comment;
				addresources[i].srcipexpr = resources[i].srcipexpr;
				addresources[i].originusip = resources[i].originusip;
				addresources[i].useportrange = resources[i].useportrange;
				addresources[i].appflowlog = resources[i].appflowlog;
				addresources[i].netprofile = resources[i].netprofile;
				addresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete crvserver of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		crvserver deleteresource = new crvserver();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete crvserver.
	*/
	public static base_response delete(nitro_service client, crvserver resource) throws Exception {
		crvserver deleteresource = new crvserver();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete crvserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			crvserver deleteresources[] = new crvserver[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new crvserver();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete crvserver resources.
	*/
	public static base_responses delete(nitro_service client, crvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crvserver deleteresources[] = new crvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new crvserver();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update crvserver.
	*/
	public static base_response update(nitro_service client, crvserver resource) throws Exception {
		crvserver updateresource = new crvserver();
		updateresource.name = resource.name;
		updateresource.ipv46 = resource.ipv46;
		updateresource.redirect = resource.redirect;
		updateresource.onpolicymatch = resource.onpolicymatch;
		updateresource.precedence = resource.precedence;
		updateresource.arp = resource.arp;
		updateresource.via = resource.via;
		updateresource.cachevserver = resource.cachevserver;
		updateresource.dnsvservername = resource.dnsvservername;
		updateresource.destinationvserver = resource.destinationvserver;
		updateresource.domain = resource.domain;
		updateresource.reuse = resource.reuse;
		updateresource.backupvserver = resource.backupvserver;
		updateresource.disableprimaryondown = resource.disableprimaryondown;
		updateresource.redirecturl = resource.redirecturl;
		updateresource.clttimeout = resource.clttimeout;
		updateresource.downstateflush = resource.downstateflush;
		updateresource.l2conn = resource.l2conn;
		updateresource.backendssl = resource.backendssl;
		updateresource.listenpolicy = resource.listenpolicy;
		updateresource.listenpriority = resource.listenpriority;
		updateresource.tcpprofilename = resource.tcpprofilename;
		updateresource.httpprofilename = resource.httpprofilename;
		updateresource.netprofile = resource.netprofile;
		updateresource.comment = resource.comment;
		updateresource.srcipexpr = resource.srcipexpr;
		updateresource.originusip = resource.originusip;
		updateresource.useportrange = resource.useportrange;
		updateresource.appflowlog = resource.appflowlog;
		updateresource.icmpvsrresponse = resource.icmpvsrresponse;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update crvserver resources.
	*/
	public static base_responses update(nitro_service client, crvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crvserver updateresources[] = new crvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new crvserver();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipv46 = resources[i].ipv46;
				updateresources[i].redirect = resources[i].redirect;
				updateresources[i].onpolicymatch = resources[i].onpolicymatch;
				updateresources[i].precedence = resources[i].precedence;
				updateresources[i].arp = resources[i].arp;
				updateresources[i].via = resources[i].via;
				updateresources[i].cachevserver = resources[i].cachevserver;
				updateresources[i].dnsvservername = resources[i].dnsvservername;
				updateresources[i].destinationvserver = resources[i].destinationvserver;
				updateresources[i].domain = resources[i].domain;
				updateresources[i].reuse = resources[i].reuse;
				updateresources[i].backupvserver = resources[i].backupvserver;
				updateresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				updateresources[i].redirecturl = resources[i].redirecturl;
				updateresources[i].clttimeout = resources[i].clttimeout;
				updateresources[i].downstateflush = resources[i].downstateflush;
				updateresources[i].l2conn = resources[i].l2conn;
				updateresources[i].backendssl = resources[i].backendssl;
				updateresources[i].listenpolicy = resources[i].listenpolicy;
				updateresources[i].listenpriority = resources[i].listenpriority;
				updateresources[i].tcpprofilename = resources[i].tcpprofilename;
				updateresources[i].httpprofilename = resources[i].httpprofilename;
				updateresources[i].netprofile = resources[i].netprofile;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].srcipexpr = resources[i].srcipexpr;
				updateresources[i].originusip = resources[i].originusip;
				updateresources[i].useportrange = resources[i].useportrange;
				updateresources[i].appflowlog = resources[i].appflowlog;
				updateresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of crvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, crvserver resource, String[] args) throws Exception{
		crvserver unsetresource = new crvserver();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of crvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			crvserver unsetresources[] = new crvserver[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new crvserver();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of crvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, crvserver resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crvserver unsetresources[] = new crvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new crvserver();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable crvserver of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		crvserver enableresource = new crvserver();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable crvserver.
	*/
	public static base_response enable(nitro_service client, crvserver resource) throws Exception {
		crvserver enableresource = new crvserver();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable crvserver resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			crvserver enableresources[] = new crvserver[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new crvserver();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable crvserver resources.
	*/
	public static base_responses enable(nitro_service client, crvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crvserver enableresources[] = new crvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new crvserver();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable crvserver of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		crvserver disableresource = new crvserver();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable crvserver.
	*/
	public static base_response disable(nitro_service client, crvserver resource) throws Exception {
		crvserver disableresource = new crvserver();
		disableresource.name = resource.name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable crvserver resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			crvserver disableresources[] = new crvserver[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new crvserver();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable crvserver resources.
	*/
	public static base_responses disable(nitro_service client, crvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			crvserver disableresources[] = new crvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new crvserver();
				disableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a crvserver resource.
	*/
	public static base_response rename(nitro_service client, crvserver resource, String new_name) throws Exception {
		crvserver renameresource = new crvserver();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a crvserver resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		crvserver renameresource = new crvserver();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the crvserver resources that are configured on netscaler.
	*/
	public static crvserver[] get(nitro_service service) throws Exception{
		crvserver obj = new crvserver();
		crvserver[] response = (crvserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the crvserver resources that are configured on netscaler.
	*/
	public static crvserver[] get(nitro_service service, options option) throws Exception{
		crvserver obj = new crvserver();
		crvserver[] response = (crvserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch crvserver resource of given name .
	*/
	public static crvserver get(nitro_service service, String name) throws Exception{
		crvserver obj = new crvserver();
		obj.set_name(name);
		crvserver response = (crvserver) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch crvserver resources of given names .
	*/
	public static crvserver[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			crvserver response[] = new crvserver[name.length];
			crvserver obj[] = new crvserver[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new crvserver();
				obj[i].set_name(name[i]);
				response[i] = (crvserver) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of crvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static crvserver[] get_filtered(nitro_service service, String filter) throws Exception{
		crvserver obj = new crvserver();
		options option = new options();
		option.set_filter(filter);
		crvserver[] response = (crvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of crvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static crvserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		crvserver obj = new crvserver();
		options option = new options();
		option.set_filter(filter);
		crvserver[] response = (crvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the crvserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		crvserver obj = new crvserver();
		options option = new options();
		option.set_count(true);
		crvserver[] response = (crvserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of crvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		crvserver obj = new crvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		crvserver[] response = (crvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of crvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		crvserver obj = new crvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		crvserver[] response = (crvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class authenticationEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mapEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class cachetypeEnum {
		public static final String TRANSPARENT = "TRANSPARENT";
		public static final String REVERSE = "REVERSE";
		public static final String FORWARD = "FORWARD";
	}
	public static class downstateflushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class servicetypeEnum {
		public static final String HTTP = "HTTP";
		public static final String SSL = "SSL";
		public static final String NNTP = "NNTP";
	}
	public static class icmpvsrresponseEnum {
		public static final String PASSIVE = "PASSIVE";
		public static final String ACTIVE = "ACTIVE";
	}
	public static class valueEnum {
		public static final String Certkey_not_bound = "Certkey not bound";
		public static final String SSL_feature_disabled = "SSL feature disabled";
	}
	public static class l2connEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class typeEnum {
		public static final String CONTENT = "CONTENT";
		public static final String ADDRESS = "ADDRESS";
	}
	public static class useportrangeEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class disableprimaryondownEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class somethodEnum {
		public static final String CONNECTION = "CONNECTION";
		public static final String DYNAMICCONNECTION = "DYNAMICCONNECTION";
		public static final String BANDWIDTH = "BANDWIDTH";
		public static final String HEALTH = "HEALTH";
		public static final String NONE = "NONE";
	}
	public static class sopersistenceEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class arpEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class redirectEnum {
		public static final String CACHE = "CACHE";
		public static final String POLICY = "POLICY";
		public static final String ORIGIN = "ORIGIN";
	}
	public static class onpolicymatchEnum {
		public static final String CACHE = "CACHE";
		public static final String ORIGIN = "ORIGIN";
	}
	public static class ghostEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class originusipEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class precedenceEnum {
		public static final String RULE = "RULE";
		public static final String URL = "URL";
	}
	public static class curstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String Unknown = "Unknown";
		public static final String DISABLED = "DISABLED";
	}
	public static class reuseEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class viaEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class formatEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class backendsslEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
