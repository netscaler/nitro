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
	private String type;
	private String curstate;
	private Integer status;
	private String authentication;
	private String homepage;
	private String rule;
	private String policyname;
	private Long hits;
	private String servicename;
	private Long weight;
	private String targetvserver;
	private Long priority;
	private String somethod;
	private String sopersistence;
	private Long __count;

	/**
	* <pre>
	* Name of the cache redirection virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the cache redirection virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The type of service handled by the virtual server.
Note:	Use service type HTTP to configure content switching on this virtual server.<br> Possible values = HTTP, SSL, NNTP
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* The type of service handled by the virtual server.
Note:	Use service type HTTP to configure content switching on this virtual server.<br> Possible values = HTTP, SSL, NNTP
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* The IP address of the cache redirection virtual server.
1.	To specify a specific virtual server address, type its numeric value.
2.	To specify a wildcard virtual server address, type an asterisk (*).
	* </pre>
	*/
	public void set_ipv46(String ipv46) throws Exception{
		this.ipv46 = ipv46;
	}

	/**
	* <pre>
	* The IP address of the cache redirection virtual server.
1.	To specify a specific virtual server address, type its numeric value.
2.	To specify a wildcard virtual server address, type an asterisk (*).
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* The port number of a service, or a virtual server, or a wildcard virtual server configured in the system.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* The port number of a service, or a virtual server, or a wildcard virtual server configured in the system.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* The port number of a service, or a virtual server, or a wildcard virtual server configured in the system.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Defines an IP address range.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(long range) throws Exception {
		this.range = new Long(range);
	}

	/**
	* <pre>
	* Defines an IP address range.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(Long range) throws Exception{
		this.range = range;
	}

	/**
	* <pre>
	* Defines an IP address range.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public Long get_range() throws Exception {
		return this.range;
	}

	/**
	* <pre>
	* The supported cache server type.
Note:	For this command to work, you must select one of the cache types.<br> Default value: CRD_TRANSPARENT<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public void set_cachetype(String cachetype) throws Exception{
		this.cachetype = cachetype;
	}

	/**
	* <pre>
	* The supported cache server type.
Note:	For this command to work, you must select one of the cache types.<br> Default value: CRD_TRANSPARENT<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* The redirect policy.
The valid redirect policies are:
l.	CACHE - Directs all requests to the cache.
2.	POLICY - Applies the cache redirection policy to determine whether the request should be directed to the cache or to the origin. This is the default setting.
3.	ORIGIN - Directs all requests to the origin server.<br> Default value: CRD_POLICY<br> Possible values = CACHE, POLICY, ORIGIN
	* </pre>
	*/
	public void set_redirect(String redirect) throws Exception{
		this.redirect = redirect;
	}

	/**
	* <pre>
	* The redirect policy.
The valid redirect policies are:
l.	CACHE - Directs all requests to the cache.
2.	POLICY - Applies the cache redirection policy to determine whether the request should be directed to the cache or to the origin. This is the default setting.
3.	ORIGIN - Directs all requests to the origin server.<br> Default value: CRD_POLICY<br> Possible values = CACHE, POLICY, ORIGIN
	* </pre>
	*/
	public String get_redirect() throws Exception {
		return this.redirect;
	}

	/**
	* <pre>
	* Decide where to redirect the requests if the cache redirection policy is hit.
The valid options are:
1.	CACHE - Directs all the requests to the cache if cache redirection policy is hit.
2.	ORIGIN - Directs all requests to the origing server if the cache redirection policy is hit.
Note: For this option to work, you must select the cache redirection type as POLICY.<br> Default value: CRD_ORIGIN<br> Possible values = CACHE, ORIGIN
	* </pre>
	*/
	public void set_onpolicymatch(String onpolicymatch) throws Exception{
		this.onpolicymatch = onpolicymatch;
	}

	/**
	* <pre>
	* Decide where to redirect the requests if the cache redirection policy is hit.
The valid options are:
1.	CACHE - Directs all the requests to the cache if cache redirection policy is hit.
2.	ORIGIN - Directs all requests to the origing server if the cache redirection policy is hit.
Note: For this option to work, you must select the cache redirection type as POLICY.<br> Default value: CRD_ORIGIN<br> Possible values = CACHE, ORIGIN
	* </pre>
	*/
	public String get_onpolicymatch() throws Exception {
		return this.onpolicymatch;
	}

	/**
	* <pre>
	* The URL where traffic is redirected if the virtual server in the system becomes unavailable. You can enter up to 127 characters as the URL argument.WARNING!Make sure that the domain you specify in the URL does not match the domain specified in the -d domainName argument of the add cs policy CLI command. If the same domain is specified in both arguments, the request will be continuously redirected to the same unavailable virtual server in the system  -  then the user may not get the requested content.<br> Minimum length =  1<br> Maximum length =  128
	* </pre>
	*/
	public void set_redirecturl(String redirecturl) throws Exception{
		this.redirecturl = redirecturl;
	}

	/**
	* <pre>
	* The URL where traffic is redirected if the virtual server in the system becomes unavailable. You can enter up to 127 characters as the URL argument.WARNING!Make sure that the domain you specify in the URL does not match the domain specified in the -d domainName argument of the add cs policy CLI command. If the same domain is specified in both arguments, the request will be continuously redirected to the same unavailable virtual server in the system  -  then the user may not get the requested content.<br> Minimum length =  1<br> Maximum length =  128
	* </pre>
	*/
	public String get_redirecturl() throws Exception {
		return this.redirecturl;
	}

	/**
	* <pre>
	* The timeout value in seconds for idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* The timeout value in seconds for idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* The timeout value in seconds for idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* You can use this argument only when configuring content switching on the specified virtual server. This argument applies only if the URL- and RULE-based policies have both been configured on the same virtual server.
This argument specifies the type of policy (URL or RULE) that takes precedence on the content switching virtual server. The default setting is RULE.
l	URL - In this case, the incoming request is matched against the URL-based policies before it is matched against the rule-based policies.
l	RULE - In this case, the incoming request is matched against the rule-based policies before it is matched against the URL-based policies.
For all URL-based policies, the precedence hierarchy is:
1.	Domain and exact URL
2.	Domain, prefix and suffix
3.	Domain and suffix
4.	Domain and prefix
5.	Domain only
6.	Exact URL
7.	Prefix and suffix
8.	Suffix only
9.	Prefix only
10.	Default.<br> Default value: CS_PRIORITY_RULE<br> Possible values = RULE, URL
	* </pre>
	*/
	public void set_precedence(String precedence) throws Exception{
		this.precedence = precedence;
	}

	/**
	* <pre>
	* You can use this argument only when configuring content switching on the specified virtual server. This argument applies only if the URL- and RULE-based policies have both been configured on the same virtual server.
This argument specifies the type of policy (URL or RULE) that takes precedence on the content switching virtual server. The default setting is RULE.
l	URL - In this case, the incoming request is matched against the URL-based policies before it is matched against the rule-based policies.
l	RULE - In this case, the incoming request is matched against the rule-based policies before it is matched against the URL-based policies.
For all URL-based policies, the precedence hierarchy is:
1.	Domain and exact URL
2.	Domain, prefix and suffix
3.	Domain and suffix
4.	Domain and prefix
5.	Domain only
6.	Exact URL
7.	Prefix and suffix
8.	Suffix only
9.	Prefix only
10.	Default.<br> Default value: CS_PRIORITY_RULE<br> Possible values = RULE, URL
	* </pre>
	*/
	public String get_precedence() throws Exception {
		return this.precedence;
	}

	/**
	* <pre>
	* .<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_arp(String arp) throws Exception{
		this.arp = arp;
	}

	/**
	* <pre>
	* .<br> Possible values = ON, OFF
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
	* .<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_map(String map) throws Exception{
		this.map = map;
	}

	/**
	* <pre>
	* .<br> Possible values = ON, OFF
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
	* Determines whether the system will insert a Via: header in the HTTP requests.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_via(String via) throws Exception{
		this.via = via;
	}

	/**
	* <pre>
	* Determines whether the system will insert a Via: header in the HTTP requests.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_via() throws Exception {
		return this.via;
	}

	/**
	* <pre>
	* The name of the default target cache virtual server to which requests are redirected.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cachevserver(String cachevserver) throws Exception{
		this.cachevserver = cachevserver;
	}

	/**
	* <pre>
	* The name of the default target cache virtual server to which requests are redirected.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cachevserver() throws Exception {
		return this.cachevserver;
	}

	/**
	* <pre>
	* The name of the DNS virtual server used to resolve domain names arriving at the forward proxy virtual server.
Note:	This parameter applies only to forward proxy virtual servers, not reverse and transparent.<br> Minimum length =  1
	* </pre>
	*/
	public void set_dnsvservername(String dnsvservername) throws Exception{
		this.dnsvservername = dnsvservername;
	}

	/**
	* <pre>
	* The name of the DNS virtual server used to resolve domain names arriving at the forward proxy virtual server.
Note:	This parameter applies only to forward proxy virtual servers, not reverse and transparent.<br> Minimum length =  1
	* </pre>
	*/
	public String get_dnsvservername() throws Exception {
		return this.dnsvservername;
	}

	/**
	* <pre>
	* The destination virtual server for a transparent or forward proxy cache redirection virtual server. All requests to the transparent or forward proxy cache redirection virtual server are directed to this destination virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_destinationvserver(String destinationvserver) throws Exception{
		this.destinationvserver = destinationvserver;
	}

	/**
	* <pre>
	* The destination virtual server for a transparent or forward proxy cache redirection virtual server. All requests to the transparent or forward proxy cache redirection virtual server are directed to this destination virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_destinationvserver() throws Exception {
		return this.destinationvserver;
	}

	/**
	* <pre>
	* The default domain for reverse proxies. Domains are configured in the system so that they direct an incoming request from a particular configured source domain to a particular configured target domain.
There may be several configured pairs of source and target domains. You can select one pair to be the default. Then, if a source domain is not present in the host header or URL of an incoming request, the request will be sent to the target domain of the selected default pair.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* The default domain for reverse proxies. Domains are configured in the system so that they direct an incoming request from a particular configured source domain to a particular configured target domain.
There may be several configured pairs of source and target domains. You can select one pair to be the default. Then, if a source domain is not present in the host header or URL of an incoming request, the request will be sent to the target domain of the selected default pair.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* .<br> Minimum value =  2<br> Maximum value =  24
	* </pre>
	*/
	public void set_sopersistencetimeout(long sopersistencetimeout) throws Exception {
		this.sopersistencetimeout = new Long(sopersistencetimeout);
	}

	/**
	* <pre>
	* .<br> Minimum value =  2<br> Maximum value =  24
	* </pre>
	*/
	public void set_sopersistencetimeout(Long sopersistencetimeout) throws Exception{
		this.sopersistencetimeout = sopersistencetimeout;
	}

	/**
	* <pre>
	* .<br> Minimum value =  2<br> Maximum value =  24
	* </pre>
	*/
	public Long get_sopersistencetimeout() throws Exception {
		return this.sopersistencetimeout;
	}

	/**
	* <pre>
	* .<br> Minimum value =  1
	* </pre>
	*/
	public void set_sothreshold(long sothreshold) throws Exception {
		this.sothreshold = new Long(sothreshold);
	}

	/**
	* <pre>
	* .<br> Minimum value =  1
	* </pre>
	*/
	public void set_sothreshold(Long sothreshold) throws Exception{
		this.sothreshold = sothreshold;
	}

	/**
	* <pre>
	* .<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
	}

	/**
	* <pre>
	* Specifies whether TCP connections to cache or origin servers will be reused across client connections.

Note:	You should include this argument only if the service type argument is set to HTTP.
The default setting is ON.
If you set this argument to OFF and:
	-redirect is set to CACHE: TCP connections to the cache servers are not reused.
	-redirect is set to ORIGIN:  TCP connections to the origin servers are not reused.
	-redirect is set to POLICY: TCP connections to the origin servers are not reused.
If you set this argument to ON, connections are reused to both origin and cache servers.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_reuse(String reuse) throws Exception{
		this.reuse = reuse;
	}

	/**
	* <pre>
	* Specifies whether TCP connections to cache or origin servers will be reused across client connections.

Note:	You should include this argument only if the service type argument is set to HTTP.
The default setting is ON.
If you set this argument to OFF and:
	-redirect is set to CACHE: TCP connections to the cache servers are not reused.
	-redirect is set to ORIGIN:  TCP connections to the origin servers are not reused.
	-redirect is set to POLICY: TCP connections to the origin servers are not reused.
If you set this argument to ON, connections are reused to both origin and cache servers.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_reuse() throws Exception {
		return this.reuse;
	}

	/**
	* <pre>
	* The initial state (enabled or disabled) of the cache redirection virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The initial state (enabled or disabled) of the cache redirection virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Perform delayed cleanup of connections on this vserver.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Perform delayed cleanup of connections on this vserver.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* The Backup Virtual Server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_backupvserver(String backupvserver) throws Exception{
		this.backupvserver = backupvserver;
	}

	/**
	* <pre>
	* The Backup Virtual Server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_backupvserver() throws Exception {
		return this.backupvserver;
	}

	/**
	* <pre>
	* When this argument is enabled, traffic will continue reaching backup vservers even after primary comes UP from DOWN state.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_disableprimaryondown(String disableprimaryondown) throws Exception{
		this.disableprimaryondown = disableprimaryondown;
	}

	/**
	* <pre>
	* When this argument is enabled, traffic will continue reaching backup vservers even after primary comes UP from DOWN state.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_disableprimaryondown() throws Exception {
		return this.disableprimaryondown;
	}

	/**
	* <pre>
	* Use L2 Parameters to identify a connection.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_l2conn(String l2conn) throws Exception{
		this.l2conn = l2conn;
	}

	/**
	* <pre>
	* Use L2 Parameters to identify a connection.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_l2conn() throws Exception {
		return this.l2conn;
	}

	/**
	* <pre>
	* Use this parameter to specify the listen policy for CR Vserver.
The string can be either an existing expression name (configured using add policy expression command) or else it can be an in-line expression with a maximum of 1499 characters.<br> Default value: "none"
	* </pre>
	*/
	public void set_listenpolicy(String listenpolicy) throws Exception{
		this.listenpolicy = listenpolicy;
	}

	/**
	* <pre>
	* Use this parameter to specify the listen policy for CR Vserver.
The string can be either an existing expression name (configured using add policy expression command) or else it can be an in-line expression with a maximum of 1499 characters.<br> Default value: "none"
	* </pre>
	*/
	public String get_listenpolicy() throws Exception {
		return this.listenpolicy;
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of CR Vserver.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_listenpriority(long listenpriority) throws Exception {
		this.listenpriority = new Long(listenpriority);
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of CR Vserver.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_listenpriority(Long listenpriority) throws Exception{
		this.listenpriority = listenpriority;
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of CR Vserver.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_listenpriority() throws Exception {
		return this.listenpriority;
	}

	/**
	* <pre>
	* The name of the TCP profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_tcpprofilename(String tcpprofilename) throws Exception{
		this.tcpprofilename = tcpprofilename;
	}

	/**
	* <pre>
	* The name of the TCP profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_tcpprofilename() throws Exception {
		return this.tcpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_httpprofilename(String httpprofilename) throws Exception{
		this.httpprofilename = httpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile.<br> Minimum length =  1<br> Maximum length =  127
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
	* Use this parameter to specify the expression used to extract the Source IP to be used from the requests coming from the Cache.
The string can be either an existing expression name (configured using add policy expression command) or else it can be an in-line expression with a maximum of 1499 characters.<br> Minimum length =  1<br> Maximum length =  1500
	* </pre>
	*/
	public void set_srcipexpr(String srcipexpr) throws Exception{
		this.srcipexpr = srcipexpr;
	}

	/**
	* <pre>
	* Use this parameter to specify the expression used to extract the Source IP to be used from the requests coming from the Cache.
The string can be either an existing expression name (configured using add policy expression command) or else it can be an in-line expression with a maximum of 1499 characters.<br> Minimum length =  1<br> Maximum length =  1500
	* </pre>
	*/
	public String get_srcipexpr() throws Exception {
		return this.srcipexpr;
	}

	/**
	* <pre>
	* For requests going to the Origin specify whether to use the SourceIP or not.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_originusip(String originusip) throws Exception{
		this.originusip = originusip;
	}

	/**
	* <pre>
	* For requests going to the Origin specify whether to use the SourceIP or not.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_originusip() throws Exception {
		return this.originusip;
	}

	/**
	* <pre>
	* Select the source port for requests going to the origin.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_useportrange(String useportrange) throws Exception{
		this.useportrange = useportrange;
	}

	/**
	* <pre>
	* Select the source port for requests going to the origin.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_useportrange() throws Exception {
		return this.useportrange;
	}

	/**
	* <pre>
	* Enable logging appflow flow information.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowlog(String appflowlog) throws Exception{
		this.appflowlog = appflowlog;
	}

	/**
	* <pre>
	* Enable logging appflow flow information.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowlog() throws Exception {
		return this.appflowlog;
	}

	/**
	* <pre>
	* The name of the network profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_netprofile(String netprofile) throws Exception{
		this.netprofile = netprofile;
	}

	/**
	* <pre>
	* The name of the network profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_netprofile() throws Exception {
		return this.netprofile;
	}

	/**
	* <pre>
	* Can be active or passive.<br> Default value: NS_VSR_PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public void set_icmpvsrresponse(String icmpvsrresponse) throws Exception{
		this.icmpvsrresponse = icmpvsrresponse;
	}

	/**
	* <pre>
	* Can be active or passive.<br> Default value: NS_VSR_PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public String get_icmpvsrresponse() throws Exception {
		return this.icmpvsrresponse;
	}

	/**
	* <pre>
	* The new name of the virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the virtual server.<br> Minimum length =  1
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
	* Virtual server type.<br> Possible values = CONTENT, ADDRESS
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The state of the cr vserver.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
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
	* Number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
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
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		crvserver unsetresource = new crvserver();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of crvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, crvserver resource, String[] args) throws Exception{
		crvserver unsetresource = new crvserver();
		unsetresource.name = resource.name;
		unsetresource.cachevserver = resource.cachevserver;
		unsetresource.dnsvservername = resource.dnsvservername;
		unsetresource.destinationvserver = resource.destinationvserver;
		unsetresource.domain = resource.domain;
		unsetresource.backupvserver = resource.backupvserver;
		unsetresource.clttimeout = resource.clttimeout;
		unsetresource.redirecturl = resource.redirecturl;
		unsetresource.l2conn = resource.l2conn;
		unsetresource.originusip = resource.originusip;
		unsetresource.useportrange = resource.useportrange;
		unsetresource.srcipexpr = resource.srcipexpr;
		unsetresource.tcpprofilename = resource.tcpprofilename;
		unsetresource.httpprofilename = resource.httpprofilename;
		unsetresource.appflowlog = resource.appflowlog;
		unsetresource.netprofile = resource.netprofile;
		unsetresource.icmpvsrresponse = resource.icmpvsrresponse;
		unsetresource.redirect = resource.redirect;
		unsetresource.onpolicymatch = resource.onpolicymatch;
		unsetresource.precedence = resource.precedence;
		unsetresource.arp = resource.arp;
		unsetresource.via = resource.via;
		unsetresource.reuse = resource.reuse;
		unsetresource.disableprimaryondown = resource.disableprimaryondown;
		unsetresource.downstateflush = resource.downstateflush;
		unsetresource.listenpolicy = resource.listenpolicy;
		unsetresource.listenpriority = resource.listenpriority;
		unsetresource.comment = resource.comment;
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
				unsetresources[i].cachevserver = resources[i].cachevserver;
				unsetresources[i].dnsvservername = resources[i].dnsvservername;
				unsetresources[i].destinationvserver = resources[i].destinationvserver;
				unsetresources[i].domain = resources[i].domain;
				unsetresources[i].backupvserver = resources[i].backupvserver;
				unsetresources[i].clttimeout = resources[i].clttimeout;
				unsetresources[i].redirecturl = resources[i].redirecturl;
				unsetresources[i].l2conn = resources[i].l2conn;
				unsetresources[i].originusip = resources[i].originusip;
				unsetresources[i].useportrange = resources[i].useportrange;
				unsetresources[i].srcipexpr = resources[i].srcipexpr;
				unsetresources[i].tcpprofilename = resources[i].tcpprofilename;
				unsetresources[i].httpprofilename = resources[i].httpprofilename;
				unsetresources[i].appflowlog = resources[i].appflowlog;
				unsetresources[i].netprofile = resources[i].netprofile;
				unsetresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
				unsetresources[i].redirect = resources[i].redirect;
				unsetresources[i].onpolicymatch = resources[i].onpolicymatch;
				unsetresources[i].precedence = resources[i].precedence;
				unsetresources[i].arp = resources[i].arp;
				unsetresources[i].via = resources[i].via;
				unsetresources[i].reuse = resources[i].reuse;
				unsetresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				unsetresources[i].downstateflush = resources[i].downstateflush;
				unsetresources[i].listenpolicy = resources[i].listenpolicy;
				unsetresources[i].listenpriority = resources[i].listenpriority;
				unsetresources[i].comment = resources[i].comment;
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
}
