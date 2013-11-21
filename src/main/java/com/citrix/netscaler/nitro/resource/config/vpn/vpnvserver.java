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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnvserver_response extends base_response
{
	public vpnvserver[] vpnvserver;
}
/**
* Configuration for VPN virtual server resource.
*/

public class vpnvserver extends base_resource
{
	private String name;
	private String servicetype;
	private String ipv46;
	private Long range;
	private Integer port;
	private String state;
	private String authentication;
	private String doublehop;
	private Long maxaaausers;
	private String icaonly;
	private String downstateflush;
	private String listenpolicy;
	private Long listenpriority;
	private String tcpprofilename;
	private String httpprofilename;
	private String comment;
	private String appflowlog;
	private String icmpvsrresponse;
	private String netprofile;
	private String cginfrahomepageredirect;
	private Long maxloginattempts;
	private Long failedlogintimeout;
	private String newname;

	//------- Read only Parameter ---------;

	private String ip;
	private String value;
	private String type;
	private String curstate;
	private Integer status;
	private String cachetype;
	private String redirect;
	private String precedence;
	private String redirecturl;
	private Long curaaausers;
	private String domain;
	private String rule;
	private String policy;
	private String servicename;
	private Long weight;
	private String cachevserver;
	private String backupvserver;
	private Long priority;
	private Long clttimeout;
	private String somethod;
	private Long sothreshold;
	private String sopersistence;
	private Long sopersistencetimeout;
	private String usemip;
	private String map;
	private String bindpoint;
	private String gotopriorityexpression;
	private String disableprimaryondown;
	private Boolean secondary;
	private Boolean groupextraction;
	private Long __count;

	/**
	* <pre>
	* Name for the Access Gateway virtual server. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the virtual server is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my server" or 'my server').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the Access Gateway virtual server. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the virtual server is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my server" or 'my server').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Protocol used by the Access Gateway virtual server.<br> Default value: SSL<br> Possible values = SSL
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* Protocol used by the Access Gateway virtual server.<br> Default value: SSL<br> Possible values = SSL
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* IPv4 or IPv6 address of the Access Gateway virtual server. Usually a public IP address. User devices send connection requests to this IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipv46(String ipv46) throws Exception{
		this.ipv46 = ipv46;
	}

	/**
	* <pre>
	* IPv4 or IPv6 address of the Access Gateway virtual server. Usually a public IP address. User devices send connection requests to this IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* Range of Access Gateway virtual server IP addresses. The consecutively numbered range of IP addresses begins with the address specified by the IP Address parameter. 
In the configuration utility, select Network VServer to enter a range.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_range(long range) throws Exception {
		this.range = new Long(range);
	}

	/**
	* <pre>
	* Range of Access Gateway virtual server IP addresses. The consecutively numbered range of IP addresses begins with the address specified by the IP Address parameter. 
In the configuration utility, select Network VServer to enter a range.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_range(Long range) throws Exception{
		this.range = range;
	}

	/**
	* <pre>
	* Range of Access Gateway virtual server IP addresses. The consecutively numbered range of IP addresses begins with the address specified by the IP Address parameter. 
In the configuration utility, select Network VServer to enter a range.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_range() throws Exception {
		return this.range;
	}

	/**
	* <pre>
	* TCP port on which the virtual server listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* TCP port on which the virtual server listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* TCP port on which the virtual server listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* State of the virtual server. If the virtual server is disabled, requests are not processed.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* State of the virtual server. If the virtual server is disabled, requests are not processed.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Require authentication for users connecting to Access Gateway.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* Require authentication for users connecting to Access Gateway.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* Use the Access Gateway appliance in a double-hop configuration. A double-hop deployment provides an extra layer of security for the internal network by using three firewalls to divide the demilitarized zone (DMZ) into two stages. Such a deployment can have one appliance in the DMZ and one appliance in the secure network.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_doublehop(String doublehop) throws Exception{
		this.doublehop = doublehop;
	}

	/**
	* <pre>
	* Use the Access Gateway appliance in a double-hop configuration. A double-hop deployment provides an extra layer of security for the internal network by using three firewalls to divide the demilitarized zone (DMZ) into two stages. Such a deployment can have one appliance in the DMZ and one appliance in the secure network.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_doublehop() throws Exception {
		return this.doublehop;
	}

	/**
	* <pre>
	* Maximum number of concurrent user sessions allowed on this virtual server. The actual number of users allowed to log on to this virtual server depends on the total number of user licenses.
	* </pre>
	*/
	public void set_maxaaausers(long maxaaausers) throws Exception {
		this.maxaaausers = new Long(maxaaausers);
	}

	/**
	* <pre>
	* Maximum number of concurrent user sessions allowed on this virtual server. The actual number of users allowed to log on to this virtual server depends on the total number of user licenses.
	* </pre>
	*/
	public void set_maxaaausers(Long maxaaausers) throws Exception{
		this.maxaaausers = maxaaausers;
	}

	/**
	* <pre>
	* Maximum number of concurrent user sessions allowed on this virtual server. The actual number of users allowed to log on to this virtual server depends on the total number of user licenses.
	* </pre>
	*/
	public Long get_maxaaausers() throws Exception {
		return this.maxaaausers;
	}

	/**
	* <pre>
	* User can log on in basic mode only, through either Citrix Receiver or a browser. Users are not allowed to connect by using the Access Gateway Plug-in.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_icaonly(String icaonly) throws Exception{
		this.icaonly = icaonly;
	}

	/**
	* <pre>
	* User can log on in basic mode only, through either Citrix Receiver or a browser. Users are not allowed to connect by using the Access Gateway Plug-in.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_icaonly() throws Exception {
		return this.icaonly;
	}

	/**
	* <pre>
	* Close existing connections when the virtual server is marked DOWN, which means the server might have timed out. Disconnecting existing connections frees resources and in certain cases speeds recovery of overloaded load balancing setups. Enable this setting on servers whose connections can safely be closed when they are marked DOWN.  Do not enable DOWN state flush on servers that must complete their transactions.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Close existing connections when the virtual server is marked DOWN, which means the server might have timed out. Disconnecting existing connections frees resources and in certain cases speeds recovery of overloaded load balancing setups. Enable this setting on servers whose connections can safely be closed when they are marked DOWN.  Do not enable DOWN state flush on servers that must complete their transactions.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* String specifying the listen policy for the Access Gateway virtual server. Can be either a named expression or a default syntax expression. The Access Gateway virtual server processes only the traffic for which the expression evaluates to true.<br> Default value: "none"
	* </pre>
	*/
	public void set_listenpolicy(String listenpolicy) throws Exception{
		this.listenpolicy = listenpolicy;
	}

	/**
	* <pre>
	* String specifying the listen policy for the Access Gateway virtual server. Can be either a named expression or a default syntax expression. The Access Gateway virtual server processes only the traffic for which the expression evaluates to true.<br> Default value: "none"
	* </pre>
	*/
	public String get_listenpolicy() throws Exception {
		return this.listenpolicy;
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server, the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_listenpriority(long listenpriority) throws Exception {
		this.listenpriority = new Long(listenpriority);
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server, the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_listenpriority(Long listenpriority) throws Exception{
		this.listenpriority = listenpriority;
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server, the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_listenpriority() throws Exception {
		return this.listenpriority;
	}

	/**
	* <pre>
	* Name of the TCP profile to assign to this virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_tcpprofilename(String tcpprofilename) throws Exception{
		this.tcpprofilename = tcpprofilename;
	}

	/**
	* <pre>
	* Name of the TCP profile to assign to this virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_tcpprofilename() throws Exception {
		return this.tcpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile to assign to this virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_httpprofilename(String httpprofilename) throws Exception{
		this.httpprofilename = httpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile to assign to this virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_httpprofilename() throws Exception {
		return this.httpprofilename;
	}

	/**
	* <pre>
	* Any comments associated with the virtual server.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments associated with the virtual server.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Log AppFlow records that contain standard NetFlow or IPFIX information, such as time stamps for the beginning and end of a flow, packet count, and byte count. Also log records that contain application-level information, such as HTTP web addresses, HTTP request methods and response status codes, server response time, and latency.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowlog(String appflowlog) throws Exception{
		this.appflowlog = appflowlog;
	}

	/**
	* <pre>
	* Log AppFlow records that contain standard NetFlow or IPFIX information, such as time stamps for the beginning and end of a flow, packet count, and byte count. Also log records that contain application-level information, such as HTTP web addresses, HTTP request methods and response status codes, server response time, and latency.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowlog() throws Exception {
		return this.appflowlog;
	}

	/**
	* <pre>
	* Criterion for responding to PING requests sent to this virtual server. If this parameter is set to ACTIVE, respond only if the virtual server is available. With the PASSIVE setting, respond even if the virtual server is not available.<br> Default value: PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public void set_icmpvsrresponse(String icmpvsrresponse) throws Exception{
		this.icmpvsrresponse = icmpvsrresponse;
	}

	/**
	* <pre>
	* Criterion for responding to PING requests sent to this virtual server. If this parameter is set to ACTIVE, respond only if the virtual server is available. With the PASSIVE setting, respond even if the virtual server is not available.<br> Default value: PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public String get_icmpvsrresponse() throws Exception {
		return this.icmpvsrresponse;
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
	* When client requests for Sharefile resource and AGEE finds that the user is unauthenticated or the user-session has expired then, disabling this option will take the user to the originally requested Sharefile resource after authentication (instead of taking the user to the default vpn homepage).<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cginfrahomepageredirect(String cginfrahomepageredirect) throws Exception{
		this.cginfrahomepageredirect = cginfrahomepageredirect;
	}

	/**
	* <pre>
	* When client requests for Sharefile resource and AGEE finds that the user is unauthenticated or the user-session has expired then, disabling this option will take the user to the originally requested Sharefile resource after authentication (instead of taking the user to the default vpn homepage).<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cginfrahomepageredirect() throws Exception {
		return this.cginfrahomepageredirect;
	}

	/**
	* <pre>
	* Maximum Number of login Attempts.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxloginattempts(long maxloginattempts) throws Exception {
		this.maxloginattempts = new Long(maxloginattempts);
	}

	/**
	* <pre>
	* Maximum Number of login Attempts.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxloginattempts(Long maxloginattempts) throws Exception{
		this.maxloginattempts = maxloginattempts;
	}

	/**
	* <pre>
	* Maximum Number of login Attempts.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_maxloginattempts() throws Exception {
		return this.maxloginattempts;
	}

	/**
	* <pre>
	* Failed Login timeout.<br> Minimum value =  1
	* </pre>
	*/
	public void set_failedlogintimeout(long failedlogintimeout) throws Exception {
		this.failedlogintimeout = new Long(failedlogintimeout);
	}

	/**
	* <pre>
	* Failed Login timeout.<br> Minimum value =  1
	* </pre>
	*/
	public void set_failedlogintimeout(Long failedlogintimeout) throws Exception{
		this.failedlogintimeout = failedlogintimeout;
	}

	/**
	* <pre>
	* Failed Login timeout.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_failedlogintimeout() throws Exception {
		return this.failedlogintimeout;
	}

	/**
	* <pre>
	* New name for the Access Gateway virtual server. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my server" or 'my server').<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the Access Gateway virtual server. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. 

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my server" or 'my server').<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The Virtual IP address of the VPN vserver.
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* Indicates whether or not the certificate is bound or if SSL offload is disabled.<br> Possible values = Certkey not bound, SSL feature disabled
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* The type of Virtual Server, e.g. CONTENT based or ADDRESS based.<br> Possible values = CONTENT, ADDRESS
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The current state of the Virtual server, e.g. UP, DOWN, BUSY, etc.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Whether or not this vserver responds to ARPs and whether or not round-robin selection is temporarily in effect.
	* </pre>
	*/
	public Integer get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* Virtual server's cache type. The options are: TRANSPARENT, REVERSE and FORWARD.<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* The cache redirect policy.
The valid redirect policies are:
l.	CACHE - Directs all requests to the cache.
2.	POLICY - Applies cache redirection policy to determine whether the request should be directed to the cache or origin. This is the default setting.
3.	ORIGIN - Directs all requests to the origin server.<br> Possible values = CACHE, POLICY, ORIGIN
	* </pre>
	*/
	public String get_redirect() throws Exception {
		return this.redirect;
	}

	/**
	* <pre>
	* This argument is used only when configuring content switching on the specified virtual server. This is applicable only
if both the URL and RULE-based policies have been configured on the same virtual server.
It specifies the type of policy (URL or RULE) that takes precedence on the content switching virtual server. The default setting is RULE.
l	URL - In this case, the incoming request is matched against the URL-based policies before the rule-based policies.
l	RULE - In this case, the incoming request is matched against the rule-based policies before the URL-based policies.
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
10.	Default.<br> Possible values = RULE, URL
	* </pre>
	*/
	public String get_precedence() throws Exception {
		return this.precedence;
	}

	/**
	* <pre>
	* The URL where traffic is redirected if the virtual server in system becomes unavailable. WARNING!	Make sure that the domain you specify in the URL does not match the domain specified in the -d domainName argument of the ###add cs policy### command. If the same domain is specified in both arguments, the request will be continuously redirected to the same unavailable virtual server in the system. If so, the user may not get the requested content.
	* </pre>
	*/
	public String get_redirecturl() throws Exception {
		return this.redirecturl;
	}

	/**
	* <pre>
	* The number of current users logged in to this vserver.
	* </pre>
	*/
	public Long get_curaaausers() throws Exception {
		return this.curaaausers;
	}

	/**
	* <pre>
	* The domain name of the server for which a service needs to be added. If the IP Address has been specified, the domain name does not need to be specified.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* The name of the rule, or expression, if any, that policy for the vpn server is to use. Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide. The default rule is ns_true.<br> Minimum length =  1
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the vpn vserver.
	* </pre>
	*/
	public String get_policy() throws Exception {
		return this.policy;
	}

	/**
	* <pre>
	* The name of the service, if any, to which the vserver policy is bound.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* Weight for this service, if any. This weight is used when the system performs load balancing, giving greater priority to a specific service. It is useful when the services bound to a virtual server are of different capacity.
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The name of the default target cache virtual server, if any, to which requests are redirected.
	* </pre>
	*/
	public String get_cachevserver() throws Exception {
		return this.cachevserver;
	}

	/**
	* <pre>
	* The name of the backup vpn virtual server for this vpn virtual server.
	* </pre>
	*/
	public String get_backupvserver() throws Exception {
		return this.backupvserver;
	}

	/**
	* <pre>
	* The priority, if any, of the vpn vserver policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The idle time, if any, in seconds after which the client connection is terminated.
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* VPN client applications are allocated from a block of Intranet IP addresses.
That block may be exhausted after a certain number of connections. This switch specifies the
method used to determine whether or not a new connection will spillover, or exhaust, the allocated block of
Intranet IP addresses for that application. Possible values are CONNECTION or DYNAMICCONNECTION.
CONNECTION means that a static integer value is the hard limit for the spillover threshold. The spillover
threshold is described below. DYNAMICCONNECTION means that the spillover threshold is set according to
the maximum number of connections defined for the vpn vserver.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public String get_somethod() throws Exception {
		return this.somethod;
	}

	/**
	* <pre>
	* VPN client applications are allocated from a block of Intranet IP addresses.
That block may be exhausted after a certain number of connections.
The value of this option is number of client connections after which the Mapped IP address is used
as the client source IP address instead of an address from the allocated block of Intranet IP addresses.
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
	}

	/**
	* <pre>
	* Whether or not cookie-based site persistance is enabled for this VPN vserver. Possible values are 'ConnectionProxy', HTTPRedirect, or NONE.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sopersistence() throws Exception {
		return this.sopersistence;
	}

	/**
	* <pre>
	* The timeout, if any, for cookie-based site persistance of this VPN vserver.
	* </pre>
	*/
	public Long get_sopersistencetimeout() throws Exception {
		return this.sopersistencetimeout;
	}

	/**
	* <pre>
	* Deprecated. See 'map' below.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_usemip() throws Exception {
		return this.usemip;
	}

	/**
	* <pre>
	* Whether or not Mapped IP Addresses are ON or OFF. Mapped IP addresses are source IP addresses
for the virtual servers running on the NetScaler. Mapped IP addresses are used by the system to connect to the backend servers.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_map() throws Exception {
		return this.map;
	}

	/**
	* <pre>
	* Bindpoint to which the policy is bound.<br> Possible values = REQUEST, RESPONSE, ICA_REQUEST, OTHERTCP_REQUEST
	* </pre>
	*/
	public String get_bindpoint() throws Exception {
		return this.bindpoint;
	}

	/**
	* <pre>
	* Next priority expression.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Tells whether traffic will continue reaching backup vservers even after primary comes UP from DOWN state.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_disableprimaryondown() throws Exception {
		return this.disableprimaryondown;
	}

	/**
	* <pre>
	* Bind the authentication policy as the secondary policy to use in a two-factor configuration. A user must then authenticate not only via a primary authentication method but also via a secondary authentication method. User groups are aggregated across both. The user name must be exactly the same for both authentication methods, but they can require different passwords.
	* </pre>
	*/
	public Boolean get_secondary() throws Exception {
		return this.secondary;
	}

	/**
	* <pre>
	* Bind the Authentication policy to a tertiary chain which will be used only for group extraction.  The user will not authenticate against this server, and this will only be called if primary and/or secondary authentication has succeeded.
	* </pre>
	*/
	public Boolean get_groupextraction() throws Exception {
		return this.groupextraction;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnvserver_response result = (vpnvserver_response) service.get_payload_formatter().string_to_resource(vpnvserver_response.class, response);
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
		return result.vpnvserver;
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
	* Use this API to add vpnvserver.
	*/
	public static base_response add(nitro_service client, vpnvserver resource) throws Exception {
		vpnvserver addresource = new vpnvserver();
		addresource.name = resource.name;
		addresource.servicetype = resource.servicetype;
		addresource.ipv46 = resource.ipv46;
		addresource.range = resource.range;
		addresource.port = resource.port;
		addresource.state = resource.state;
		addresource.authentication = resource.authentication;
		addresource.doublehop = resource.doublehop;
		addresource.maxaaausers = resource.maxaaausers;
		addresource.icaonly = resource.icaonly;
		addresource.downstateflush = resource.downstateflush;
		addresource.listenpolicy = resource.listenpolicy;
		addresource.listenpriority = resource.listenpriority;
		addresource.tcpprofilename = resource.tcpprofilename;
		addresource.httpprofilename = resource.httpprofilename;
		addresource.comment = resource.comment;
		addresource.appflowlog = resource.appflowlog;
		addresource.icmpvsrresponse = resource.icmpvsrresponse;
		addresource.netprofile = resource.netprofile;
		addresource.cginfrahomepageredirect = resource.cginfrahomepageredirect;
		addresource.maxloginattempts = resource.maxloginattempts;
		addresource.failedlogintimeout = resource.failedlogintimeout;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnvserver resources.
	*/
	public static base_responses add(nitro_service client, vpnvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver addresources[] = new vpnvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnvserver();
				addresources[i].name = resources[i].name;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].ipv46 = resources[i].ipv46;
				addresources[i].range = resources[i].range;
				addresources[i].port = resources[i].port;
				addresources[i].state = resources[i].state;
				addresources[i].authentication = resources[i].authentication;
				addresources[i].doublehop = resources[i].doublehop;
				addresources[i].maxaaausers = resources[i].maxaaausers;
				addresources[i].icaonly = resources[i].icaonly;
				addresources[i].downstateflush = resources[i].downstateflush;
				addresources[i].listenpolicy = resources[i].listenpolicy;
				addresources[i].listenpriority = resources[i].listenpriority;
				addresources[i].tcpprofilename = resources[i].tcpprofilename;
				addresources[i].httpprofilename = resources[i].httpprofilename;
				addresources[i].comment = resources[i].comment;
				addresources[i].appflowlog = resources[i].appflowlog;
				addresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
				addresources[i].netprofile = resources[i].netprofile;
				addresources[i].cginfrahomepageredirect = resources[i].cginfrahomepageredirect;
				addresources[i].maxloginattempts = resources[i].maxloginattempts;
				addresources[i].failedlogintimeout = resources[i].failedlogintimeout;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnvserver of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpnvserver deleteresource = new vpnvserver();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnvserver.
	*/
	public static base_response delete(nitro_service client, vpnvserver resource) throws Exception {
		vpnvserver deleteresource = new vpnvserver();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnvserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnvserver deleteresources[] = new vpnvserver[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpnvserver();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnvserver resources.
	*/
	public static base_responses delete(nitro_service client, vpnvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver deleteresources[] = new vpnvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnvserver();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpnvserver.
	*/
	public static base_response update(nitro_service client, vpnvserver resource) throws Exception {
		vpnvserver updateresource = new vpnvserver();
		updateresource.name = resource.name;
		updateresource.ipv46 = resource.ipv46;
		updateresource.authentication = resource.authentication;
		updateresource.doublehop = resource.doublehop;
		updateresource.icaonly = resource.icaonly;
		updateresource.maxaaausers = resource.maxaaausers;
		updateresource.downstateflush = resource.downstateflush;
		updateresource.listenpolicy = resource.listenpolicy;
		updateresource.listenpriority = resource.listenpriority;
		updateresource.tcpprofilename = resource.tcpprofilename;
		updateresource.httpprofilename = resource.httpprofilename;
		updateresource.comment = resource.comment;
		updateresource.appflowlog = resource.appflowlog;
		updateresource.icmpvsrresponse = resource.icmpvsrresponse;
		updateresource.netprofile = resource.netprofile;
		updateresource.cginfrahomepageredirect = resource.cginfrahomepageredirect;
		updateresource.maxloginattempts = resource.maxloginattempts;
		updateresource.failedlogintimeout = resource.failedlogintimeout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpnvserver resources.
	*/
	public static base_responses update(nitro_service client, vpnvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver updateresources[] = new vpnvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnvserver();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipv46 = resources[i].ipv46;
				updateresources[i].authentication = resources[i].authentication;
				updateresources[i].doublehop = resources[i].doublehop;
				updateresources[i].icaonly = resources[i].icaonly;
				updateresources[i].maxaaausers = resources[i].maxaaausers;
				updateresources[i].downstateflush = resources[i].downstateflush;
				updateresources[i].listenpolicy = resources[i].listenpolicy;
				updateresources[i].listenpriority = resources[i].listenpriority;
				updateresources[i].tcpprofilename = resources[i].tcpprofilename;
				updateresources[i].httpprofilename = resources[i].httpprofilename;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].appflowlog = resources[i].appflowlog;
				updateresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
				updateresources[i].netprofile = resources[i].netprofile;
				updateresources[i].cginfrahomepageredirect = resources[i].cginfrahomepageredirect;
				updateresources[i].maxloginattempts = resources[i].maxloginattempts;
				updateresources[i].failedlogintimeout = resources[i].failedlogintimeout;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpnvserver resource, String[] args) throws Exception{
		vpnvserver unsetresource = new vpnvserver();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpnvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnvserver unsetresources[] = new vpnvserver[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new vpnvserver();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpnvserver resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver unsetresources[] = new vpnvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpnvserver();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable vpnvserver of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		vpnvserver enableresource = new vpnvserver();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable vpnvserver.
	*/
	public static base_response enable(nitro_service client, vpnvserver resource) throws Exception {
		vpnvserver enableresource = new vpnvserver();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable vpnvserver resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnvserver enableresources[] = new vpnvserver[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new vpnvserver();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable vpnvserver resources.
	*/
	public static base_responses enable(nitro_service client, vpnvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver enableresources[] = new vpnvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new vpnvserver();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable vpnvserver of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		vpnvserver disableresource = new vpnvserver();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable vpnvserver.
	*/
	public static base_response disable(nitro_service client, vpnvserver resource) throws Exception {
		vpnvserver disableresource = new vpnvserver();
		disableresource.name = resource.name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable vpnvserver resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnvserver disableresources[] = new vpnvserver[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new vpnvserver();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable vpnvserver resources.
	*/
	public static base_responses disable(nitro_service client, vpnvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver disableresources[] = new vpnvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new vpnvserver();
				disableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a vpnvserver resource.
	*/
	public static base_response rename(nitro_service client, vpnvserver resource, String new_name) throws Exception {
		vpnvserver renameresource = new vpnvserver();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a vpnvserver resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		vpnvserver renameresource = new vpnvserver();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the vpnvserver resources that are configured on netscaler.
	*/
	public static vpnvserver[] get(nitro_service service) throws Exception{
		vpnvserver obj = new vpnvserver();
		vpnvserver[] response = (vpnvserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnvserver resources that are configured on netscaler.
	*/
	public static vpnvserver[] get(nitro_service service, options option) throws Exception{
		vpnvserver obj = new vpnvserver();
		vpnvserver[] response = (vpnvserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnvserver resource of given name .
	*/
	public static vpnvserver get(nitro_service service, String name) throws Exception{
		vpnvserver obj = new vpnvserver();
		obj.set_name(name);
		vpnvserver response = (vpnvserver) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnvserver resources of given names .
	*/
	public static vpnvserver[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpnvserver response[] = new vpnvserver[name.length];
			vpnvserver obj[] = new vpnvserver[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpnvserver();
				obj[i].set_name(name[i]);
				response[i] = (vpnvserver) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnvserver[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnvserver obj = new vpnvserver();
		options option = new options();
		option.set_filter(filter);
		vpnvserver[] response = (vpnvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnvserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnvserver obj = new vpnvserver();
		options option = new options();
		option.set_filter(filter);
		vpnvserver[] response = (vpnvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnvserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnvserver obj = new vpnvserver();
		options option = new options();
		option.set_count(true);
		vpnvserver[] response = (vpnvserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnvserver obj = new vpnvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver[] response = (vpnvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnvserver obj = new vpnvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver[] response = (vpnvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class icaonlyEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class cginfrahomepageredirectEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
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
		public static final String SSL = "SSL";
	}
	public static class icmpvsrresponseEnum {
		public static final String PASSIVE = "PASSIVE";
		public static final String ACTIVE = "ACTIVE";
	}
	public static class usemipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class valueEnum {
		public static final String Certkey_not_bound = "Certkey not bound";
		public static final String SSL_feature_disabled = "SSL feature disabled";
	}
	public static class disableprimaryondownEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String CONTENT = "CONTENT";
		public static final String ADDRESS = "ADDRESS";
	}
	public static class somethodEnum {
		public static final String CONNECTION = "CONNECTION";
		public static final String DYNAMICCONNECTION = "DYNAMICCONNECTION";
		public static final String BANDWIDTH = "BANDWIDTH";
		public static final String HEALTH = "HEALTH";
		public static final String NONE = "NONE";
	}
	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
		public static final String ICA_REQUEST = "ICA_REQUEST";
		public static final String OTHERTCP_REQUEST = "OTHERTCP_REQUEST";
	}
	public static class sopersistenceEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class redirectEnum {
		public static final String CACHE = "CACHE";
		public static final String POLICY = "POLICY";
		public static final String ORIGIN = "ORIGIN";
	}
	public static class doublehopEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
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
}
