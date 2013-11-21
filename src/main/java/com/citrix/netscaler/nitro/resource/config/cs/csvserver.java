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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class csvserver_response extends base_response
{
	public csvserver[] csvserver;
}
/**
* Configuration for CS virtual server resource.
*/

public class csvserver extends base_resource
{
	private String name;
	private Long td;
	private String servicetype;
	private String ipv46;
	private String ippattern;
	private String ipmask;
	private Long range;
	private Integer port;
	private String state;
	private String stateupdate;
	private String cacheable;
	private String redirecturl;
	private Long clttimeout;
	private String precedence;
	private String casesensitive;
	private String somethod;
	private String sopersistence;
	private Long sopersistencetimeout;
	private Long sothreshold;
	private String sobackupaction;
	private String redirectportrewrite;
	private String downstateflush;
	private String backupvserver;
	private String disableprimaryondown;
	private String insertvserveripport;
	private String vipheader;
	private String rtspnat;
	private String authenticationhost;
	private String authentication;
	private String listenpolicy;
	private Long listenpriority;
	private String authn401;
	private String authnvsname;
	private String push;
	private String pushvserver;
	private String pushlabel;
	private String pushmulticlients;
	private String tcpprofilename;
	private String httpprofilename;
	private String dbprofilename;
	private String comment;
	private String mssqlserverversion;
	private String l2conn;
	private Long mysqlprotocolversion;
	private String mysqlserverversion;
	private Long mysqlcharacterset;
	private Long mysqlservercapabilities;
	private String appflowlog;
	private String netprofile;
	private String icmpvsrresponse;
	private String authnprofile;
	private String newname;

	//------- Read only Parameter ---------;

	private String ip;
	private String value;
	private String ngname;
	private String type;
	private String curstate;
	private String sc;
	private Integer status;
	private String cachetype;
	private String redirect;
	private String homepage;
	private String dnsvservername;
	private String domain;
	private String policyname;
	private String servicename;
	private Long weight;
	private String cachevserver;
	private String targetvserver;
	private Long priority;
	private String url;
	private String gotopriorityexpression;
	private String bindpoint;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private String gt2gb;
	private String statechangetimesec;
	private Long statechangetimemsec;
	private Long tickssincelaststatechange;
	private String lbvserver;
	private String targetlbvserver;
	private Long __count;

	/**
	* <pre>
	* Name for the content switching virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. 
Cannot be changed after the CS virtual server is created.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, \“my server\” or \‘my server\’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the content switching virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. 
Cannot be changed after the CS virtual server is created.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, \“my server\” or \‘my server\’).<br> Minimum length =  1
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
	* Protocol used by the virtual server.<br> Possible values = HTTP, SSL, TCP, FTP, RTSP, SSL_TCP, UDP, DNS, SIP_UDP, ANY, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* Protocol used by the virtual server.<br> Possible values = HTTP, SSL, TCP, FTP, RTSP, SSL_TCP, UDP, DNS, SIP_UDP, ANY, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* IP address of the content switching virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipv46(String ipv46) throws Exception{
		this.ipv46 = ipv46;
	}

	/**
	* <pre>
	* IP address of the content switching virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* IP address pattern, in dotted decimal notation, for identifying packets to be accepted by the virtual server. The IP Mask parameter specifies which part of the destination IP address is matched against the pattern. Mutually exclusive with the IP Address parameter. 
For example, if the IP pattern assigned to the virtual server is 198.51.100.0 and the IP mask is 255.255.240.0 (a forward mask), the first 20 bits in the destination IP addresses are matched with the first 20 bits in the pattern. The virtual server accepts requests with IP addresses that range from 198.51.96.1 to 198.51.111.254. You can also use a pattern such as 0.0.2.2 and a mask such as 0.0.255.255 (a reverse mask).
If a destination IP address matches more than one IP pattern, the pattern with the longest match is selected, and the associated virtual server processes the request. For example, if the virtual servers, vs1 and vs2, have the same IP pattern, 0.0.100.128, but different IP masks of 0.0.255.255 and 0.0.224.255, a destination IP address of 198.51.100.128 has the longest match with the IP pattern of vs1. If a destination IP address matches two or more virtual servers to the same extent, the request is processed by the virtual server whose port number matches the port number in the request.
	* </pre>
	*/
	public void set_ippattern(String ippattern) throws Exception{
		this.ippattern = ippattern;
	}

	/**
	* <pre>
	* IP address pattern, in dotted decimal notation, for identifying packets to be accepted by the virtual server. The IP Mask parameter specifies which part of the destination IP address is matched against the pattern. Mutually exclusive with the IP Address parameter. 
For example, if the IP pattern assigned to the virtual server is 198.51.100.0 and the IP mask is 255.255.240.0 (a forward mask), the first 20 bits in the destination IP addresses are matched with the first 20 bits in the pattern. The virtual server accepts requests with IP addresses that range from 198.51.96.1 to 198.51.111.254. You can also use a pattern such as 0.0.2.2 and a mask such as 0.0.255.255 (a reverse mask).
If a destination IP address matches more than one IP pattern, the pattern with the longest match is selected, and the associated virtual server processes the request. For example, if the virtual servers, vs1 and vs2, have the same IP pattern, 0.0.100.128, but different IP masks of 0.0.255.255 and 0.0.224.255, a destination IP address of 198.51.100.128 has the longest match with the IP pattern of vs1. If a destination IP address matches two or more virtual servers to the same extent, the request is processed by the virtual server whose port number matches the port number in the request.
	* </pre>
	*/
	public String get_ippattern() throws Exception {
		return this.ippattern;
	}

	/**
	* <pre>
	* IP mask, in dotted decimal notation, for the IP Pattern parameter. Can have leading or trailing non-zero octets (for example, 255.255.240.0 or 0.0.255.255). Accordingly, the mask specifies whether the first n bits or the last n bits of the destination IP address in a client request are to be matched with the corresponding bits in the IP pattern. The former is called a forward mask. The latter is called a reverse mask.
	* </pre>
	*/
	public void set_ipmask(String ipmask) throws Exception{
		this.ipmask = ipmask;
	}

	/**
	* <pre>
	* IP mask, in dotted decimal notation, for the IP Pattern parameter. Can have leading or trailing non-zero octets (for example, 255.255.240.0 or 0.0.255.255). Accordingly, the mask specifies whether the first n bits or the last n bits of the destination IP address in a client request are to be matched with the corresponding bits in the IP pattern. The former is called a forward mask. The latter is called a reverse mask.
	* </pre>
	*/
	public String get_ipmask() throws Exception {
		return this.ipmask;
	}

	/**
	* <pre>
	* Number of consecutive IP addresses, starting with the address specified by the IP Address parameter, to include in a range of addresses assigned to this virtual server.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(long range) throws Exception {
		this.range = new Long(range);
	}

	/**
	* <pre>
	* Number of consecutive IP addresses, starting with the address specified by the IP Address parameter, to include in a range of addresses assigned to this virtual server.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(Long range) throws Exception{
		this.range = range;
	}

	/**
	* <pre>
	* Number of consecutive IP addresses, starting with the address specified by the IP Address parameter, to include in a range of addresses assigned to this virtual server.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public Long get_range() throws Exception {
		return this.range;
	}

	/**
	* <pre>
	* Port number for content switching virtual server.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Port number for content switching virtual server.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Port number for content switching virtual server.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Initial state of the load balancing virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Initial state of the load balancing virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Enable state updates for a specific content switching virtual server. By default, the Content Switching virtual server is always UP, regardless of the state of the Load Balancing virtual servers bound to it. This parameter interacts with the global setting as follows:
Global Level | Vserver Level | Result
ENABLED      ENABLED        ENABLED
ENABLED      DISABLED       ENABLED
DISABLED     ENABLED        ENABLED
DISABLED     DISABLED       DISABLED
If you want to enable state updates for only some content switching virtual servers, be sure to disable the state update parameter.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_stateupdate(String stateupdate) throws Exception{
		this.stateupdate = stateupdate;
	}

	/**
	* <pre>
	* Enable state updates for a specific content switching virtual server. By default, the Content Switching virtual server is always UP, regardless of the state of the Load Balancing virtual servers bound to it. This parameter interacts with the global setting as follows:
Global Level | Vserver Level | Result
ENABLED      ENABLED        ENABLED
ENABLED      DISABLED       ENABLED
DISABLED     ENABLED        ENABLED
DISABLED     DISABLED       DISABLED
If you want to enable state updates for only some content switching virtual servers, be sure to disable the state update parameter.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_stateupdate() throws Exception {
		return this.stateupdate;
	}

	/**
	* <pre>
	* Use this option to specify whether a virtual server, used for load balancing or content switching, routes requests to the cache redirection virtual server before sending it to the configured servers.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cacheable(String cacheable) throws Exception{
		this.cacheable = cacheable;
	}

	/**
	* <pre>
	* Use this option to specify whether a virtual server, used for load balancing or content switching, routes requests to the cache redirection virtual server before sending it to the configured servers.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cacheable() throws Exception {
		return this.cacheable;
	}

	/**
	* <pre>
	* URL to which traffic is redirected if the virtual server becomes unavailable. The service type of the virtual server should be either HTTP or SSL.
Caution: Make sure that the domain in the URL does not match the domain specified for a content switching policy. If it does, requests are continuously redirected to the unavailable virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_redirecturl(String redirecturl) throws Exception{
		this.redirecturl = redirecturl;
	}

	/**
	* <pre>
	* URL to which traffic is redirected if the virtual server becomes unavailable. The service type of the virtual server should be either HTTP or SSL.
Caution: Make sure that the domain in the URL does not match the domain specified for a content switching policy. If it does, requests are continuously redirected to the unavailable virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_redirecturl() throws Exception {
		return this.redirecturl;
	}

	/**
	* <pre>
	* Idle time, in seconds, after which the client connection is terminated. The default values are:
180 seconds for HTTP/SSL-based services.
9000 seconds for other TCP-based services.
120 seconds for DNS-based services.
120 seconds for other UDP-based services.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* Idle time, in seconds, after which the client connection is terminated. The default values are:
180 seconds for HTTP/SSL-based services.
9000 seconds for other TCP-based services.
120 seconds for DNS-based services.
120 seconds for other UDP-based services.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* Idle time, in seconds, after which the client connection is terminated. The default values are:
180 seconds for HTTP/SSL-based services.
9000 seconds for other TCP-based services.
120 seconds for DNS-based services.
120 seconds for other UDP-based services.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* Type of precedence to use for both RULE-based and URL-based policies on the content switching virtual server. With the default (RULE) setting, incoming requests are evaluated against the rule-based content switching policies. If none of the rules match, the URL in the request is evaluated against the URL-based content switching policies.<br> Default value: RULE<br> Possible values = RULE, URL
	* </pre>
	*/
	public void set_precedence(String precedence) throws Exception{
		this.precedence = precedence;
	}

	/**
	* <pre>
	* Type of precedence to use for both RULE-based and URL-based policies on the content switching virtual server. With the default (RULE) setting, incoming requests are evaluated against the rule-based content switching policies. If none of the rules match, the URL in the request is evaluated against the URL-based content switching policies.<br> Default value: RULE<br> Possible values = RULE, URL
	* </pre>
	*/
	public String get_precedence() throws Exception {
		return this.precedence;
	}

	/**
	* <pre>
	* Consider case in URLs (for policies that use URLs instead of RULES). For example, with the ON setting, the URLs /a/1.html and /A/1.HTML are treated differently and can have different targets (set by content switching policies). With the OFF setting, /a/1.html and /A/1.HTML are switched to the same target.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_casesensitive(String casesensitive) throws Exception{
		this.casesensitive = casesensitive;
	}

	/**
	* <pre>
	* Consider case in URLs (for policies that use URLs instead of RULES). For example, with the ON setting, the URLs /a/1.html and /A/1.HTML are treated differently and can have different targets (set by content switching policies). With the OFF setting, /a/1.html and /A/1.HTML are switched to the same target.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_casesensitive() throws Exception {
		return this.casesensitive;
	}

	/**
	* <pre>
	* Type of spillover used to divert traffic to the backup virtual server when the primary virtual server reaches the spillover threshold. Connection spillover is based on the number of connections. Bandwidth spillover is based on the total Kbps of incoming and outgoing traffic.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public void set_somethod(String somethod) throws Exception{
		this.somethod = somethod;
	}

	/**
	* <pre>
	* Type of spillover used to divert traffic to the backup virtual server when the primary virtual server reaches the spillover threshold. Connection spillover is based on the number of connections. Bandwidth spillover is based on the total Kbps of incoming and outgoing traffic.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public String get_somethod() throws Exception {
		return this.somethod;
	}

	/**
	* <pre>
	* Maintain source-IP based persistence on primary and backup virtual servers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sopersistence(String sopersistence) throws Exception{
		this.sopersistence = sopersistence;
	}

	/**
	* <pre>
	* Maintain source-IP based persistence on primary and backup virtual servers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sopersistence() throws Exception {
		return this.sopersistence;
	}

	/**
	* <pre>
	* Time-out value, in minutes, for spillover persistence.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_sopersistencetimeout(long sopersistencetimeout) throws Exception {
		this.sopersistencetimeout = new Long(sopersistencetimeout);
	}

	/**
	* <pre>
	* Time-out value, in minutes, for spillover persistence.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_sopersistencetimeout(Long sopersistencetimeout) throws Exception{
		this.sopersistencetimeout = sopersistencetimeout;
	}

	/**
	* <pre>
	* Time-out value, in minutes, for spillover persistence.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_sopersistencetimeout() throws Exception {
		return this.sopersistencetimeout;
	}

	/**
	* <pre>
	* Depending on the spillover method, the maximum number of connections or the maximum total bandwidth (Kbps) that a virtual server can handle before spillover occurs.<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_sothreshold(long sothreshold) throws Exception {
		this.sothreshold = new Long(sothreshold);
	}

	/**
	* <pre>
	* Depending on the spillover method, the maximum number of connections or the maximum total bandwidth (Kbps) that a virtual server can handle before spillover occurs.<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_sothreshold(Long sothreshold) throws Exception{
		this.sothreshold = sothreshold;
	}

	/**
	* <pre>
	* Depending on the spillover method, the maximum number of connections or the maximum total bandwidth (Kbps) that a virtual server can handle before spillover occurs.<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
	}

	/**
	* <pre>
	* Action to be performed if spillover is to take effect, but no backup chain to spillover is usable or exists.<br> Possible values = DROP, ACCEPT, REDIRECT
	* </pre>
	*/
	public void set_sobackupaction(String sobackupaction) throws Exception{
		this.sobackupaction = sobackupaction;
	}

	/**
	* <pre>
	* Action to be performed if spillover is to take effect, but no backup chain to spillover is usable or exists.<br> Possible values = DROP, ACCEPT, REDIRECT
	* </pre>
	*/
	public String get_sobackupaction() throws Exception {
		return this.sobackupaction;
	}

	/**
	* <pre>
	* State of port rewrite while performing HTTP redirect.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_redirectportrewrite(String redirectportrewrite) throws Exception{
		this.redirectportrewrite = redirectportrewrite;
	}

	/**
	* <pre>
	* State of port rewrite while performing HTTP redirect.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_redirectportrewrite() throws Exception {
		return this.redirectportrewrite;
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
	* Name of the backup virtual server that you are configuring. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Can be changed after the backup virtual server is created. You can assign a different backup virtual server or rename the existing virtual server.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks.<br> Minimum length =  1
	* </pre>
	*/
	public void set_backupvserver(String backupvserver) throws Exception{
		this.backupvserver = backupvserver;
	}

	/**
	* <pre>
	* Name of the backup virtual server that you are configuring. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Can be changed after the backup virtual server is created. You can assign a different backup virtual server or rename the existing virtual server.
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks.<br> Minimum length =  1
	* </pre>
	*/
	public String get_backupvserver() throws Exception {
		return this.backupvserver;
	}

	/**
	* <pre>
	* Continue forwarding the traffic to backup virtual server even after the primary server comes UP from the DOWN state.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_disableprimaryondown(String disableprimaryondown) throws Exception{
		this.disableprimaryondown = disableprimaryondown;
	}

	/**
	* <pre>
	* Continue forwarding the traffic to backup virtual server even after the primary server comes UP from the DOWN state.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_disableprimaryondown() throws Exception {
		return this.disableprimaryondown;
	}

	/**
	* <pre>
	* Insert the virtual server's VIP address and port number in the request header. Available values function as follows:
        VIPADDR - Header contains the vserver's IP address and port number without any translation.
        OFF     - The virtual IP and port header insertion option is disabled.
        V6TOV4MAPPING - Header contains the mapped IPv4 address corresponding to the IPv6 address of the vserver and the port number. An IPv6 address can be mapped to a user-specified IPv4 address using the set ns ip6 command.<br> Possible values = OFF, VIPADDR, V6TOV4MAPPING
	* </pre>
	*/
	public void set_insertvserveripport(String insertvserveripport) throws Exception{
		this.insertvserveripport = insertvserveripport;
	}

	/**
	* <pre>
	* Insert the virtual server's VIP address and port number in the request header. Available values function as follows:
        VIPADDR - Header contains the vserver's IP address and port number without any translation.
        OFF     - The virtual IP and port header insertion option is disabled.
        V6TOV4MAPPING - Header contains the mapped IPv4 address corresponding to the IPv6 address of the vserver and the port number. An IPv6 address can be mapped to a user-specified IPv4 address using the set ns ip6 command.<br> Possible values = OFF, VIPADDR, V6TOV4MAPPING
	* </pre>
	*/
	public String get_insertvserveripport() throws Exception {
		return this.insertvserveripport;
	}

	/**
	* <pre>
	* Name of virtual server IP and port header, for use with the VServer IP Port Insertion parameter.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vipheader(String vipheader) throws Exception{
		this.vipheader = vipheader;
	}

	/**
	* <pre>
	* Name of virtual server IP and port header, for use with the VServer IP Port Insertion parameter.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vipheader() throws Exception {
		return this.vipheader;
	}

	/**
	* <pre>
	* Enable network address translation (NAT) for real-time streaming protocol (RTSP) connections.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_rtspnat(String rtspnat) throws Exception{
		this.rtspnat = rtspnat;
	}

	/**
	* <pre>
	* Enable network address translation (NAT) for real-time streaming protocol (RTSP) connections.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_rtspnat() throws Exception {
		return this.rtspnat;
	}

	/**
	* <pre>
	* FQDN of the authentication virtual server. The service type of the virtual server should be either HTTP or SSL.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public void set_authenticationhost(String authenticationhost) throws Exception{
		this.authenticationhost = authenticationhost;
	}

	/**
	* <pre>
	* FQDN of the authentication virtual server. The service type of the virtual server should be either HTTP or SSL.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public String get_authenticationhost() throws Exception {
		return this.authenticationhost;
	}

	/**
	* <pre>
	* Authenticate users who request a connection to the content switching virtual server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* Authenticate users who request a connection to the content switching virtual server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* String specifying the listen policy for the content switching virtual server. Can be either the name of an existing expression or an in-line expression.<br> Default value: "none"
	* </pre>
	*/
	public void set_listenpolicy(String listenpolicy) throws Exception{
		this.listenpolicy = listenpolicy;
	}

	/**
	* <pre>
	* String specifying the listen policy for the content switching virtual server. Can be either the name of an existing expression or an in-line expression.<br> Default value: "none"
	* </pre>
	*/
	public String get_listenpolicy() throws Exception {
		return this.listenpolicy;
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_listenpriority(long listenpriority) throws Exception {
		this.listenpriority = new Long(listenpriority);
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_listenpriority(Long listenpriority) throws Exception{
		this.listenpriority = listenpriority;
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_listenpriority() throws Exception {
		return this.listenpriority;
	}

	/**
	* <pre>
	* Enable HTTP 401-response based authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authn401(String authn401) throws Exception{
		this.authn401 = authn401;
	}

	/**
	* <pre>
	* Enable HTTP 401-response based authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authn401() throws Exception {
		return this.authn401;
	}

	/**
	* <pre>
	* Name of authentication virtual server that authenticates the incoming user requests to this content switching virtual server. .<br> Minimum length =  1<br> Maximum length =  252
	* </pre>
	*/
	public void set_authnvsname(String authnvsname) throws Exception{
		this.authnvsname = authnvsname;
	}

	/**
	* <pre>
	* Name of authentication virtual server that authenticates the incoming user requests to this content switching virtual server. .<br> Minimum length =  1<br> Maximum length =  252
	* </pre>
	*/
	public String get_authnvsname() throws Exception {
		return this.authnvsname;
	}

	/**
	* <pre>
	* Process traffic with the push virtual server that is bound to this content switching virtual server (specified by the Push VServer parameter). The service type of the push virtual server should be either HTTP or SSL.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_push(String push) throws Exception{
		this.push = push;
	}

	/**
	* <pre>
	* Process traffic with the push virtual server that is bound to this content switching virtual server (specified by the Push VServer parameter). The service type of the push virtual server should be either HTTP or SSL.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_push() throws Exception {
		return this.push;
	}

	/**
	* <pre>
	* Name of the load balancing virtual server, of type PUSH or SSL_PUSH, to which the server pushes updates received on the client-facing load balancing virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_pushvserver(String pushvserver) throws Exception{
		this.pushvserver = pushvserver;
	}

	/**
	* <pre>
	* Name of the load balancing virtual server, of type PUSH or SSL_PUSH, to which the server pushes updates received on the client-facing load balancing virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_pushvserver() throws Exception {
		return this.pushvserver;
	}

	/**
	* <pre>
	* Expression for extracting the label from the response received from server. This string can be either an existing rule name or an inline expression. The service type of the virtual server should be either HTTP or SSL.<br> Default value: "none"
	* </pre>
	*/
	public void set_pushlabel(String pushlabel) throws Exception{
		this.pushlabel = pushlabel;
	}

	/**
	* <pre>
	* Expression for extracting the label from the response received from server. This string can be either an existing rule name or an inline expression. The service type of the virtual server should be either HTTP or SSL.<br> Default value: "none"
	* </pre>
	*/
	public String get_pushlabel() throws Exception {
		return this.pushlabel;
	}

	/**
	* <pre>
	* Allow multiple Web 2.0 connections from the same client to connect to the virtual server and expect updates.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_pushmulticlients(String pushmulticlients) throws Exception{
		this.pushmulticlients = pushmulticlients;
	}

	/**
	* <pre>
	* Allow multiple Web 2.0 connections from the same client to connect to the virtual server and expect updates.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_pushmulticlients() throws Exception {
		return this.pushmulticlients;
	}

	/**
	* <pre>
	* Name of the TCP profile containing TCP configuration settings for the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_tcpprofilename(String tcpprofilename) throws Exception{
		this.tcpprofilename = tcpprofilename;
	}

	/**
	* <pre>
	* Name of the TCP profile containing TCP configuration settings for the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_tcpprofilename() throws Exception {
		return this.tcpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile containing HTTP configuration settings for the virtual server. The service type of the virtual server should be either HTTP or SSL.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_httpprofilename(String httpprofilename) throws Exception{
		this.httpprofilename = httpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile containing HTTP configuration settings for the virtual server. The service type of the virtual server should be either HTTP or SSL.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_httpprofilename() throws Exception {
		return this.httpprofilename;
	}

	/**
	* <pre>
	* Name of the DB profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_dbprofilename(String dbprofilename) throws Exception{
		this.dbprofilename = dbprofilename;
	}

	/**
	* <pre>
	* Name of the DB profile.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_dbprofilename() throws Exception {
		return this.dbprofilename;
	}

	/**
	* <pre>
	* Information about this virtual server.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Information about this virtual server.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The version of the MSSQL server.<br> Default value: 2008R2<br> Possible values = 70, 2000, 2000SP1, 2005, 2008, 2008R2, 2012
	* </pre>
	*/
	public void set_mssqlserverversion(String mssqlserverversion) throws Exception{
		this.mssqlserverversion = mssqlserverversion;
	}

	/**
	* <pre>
	* The version of the MSSQL server.<br> Default value: 2008R2<br> Possible values = 70, 2000, 2000SP1, 2005, 2008, 2008R2, 2012
	* </pre>
	*/
	public String get_mssqlserverversion() throws Exception {
		return this.mssqlserverversion;
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
	* The protocol version returned by the mysql vserver.<br> Default value: 10
	* </pre>
	*/
	public void set_mysqlprotocolversion(long mysqlprotocolversion) throws Exception {
		this.mysqlprotocolversion = new Long(mysqlprotocolversion);
	}

	/**
	* <pre>
	* The protocol version returned by the mysql vserver.<br> Default value: 10
	* </pre>
	*/
	public void set_mysqlprotocolversion(Long mysqlprotocolversion) throws Exception{
		this.mysqlprotocolversion = mysqlprotocolversion;
	}

	/**
	* <pre>
	* The protocol version returned by the mysql vserver.<br> Default value: 10
	* </pre>
	*/
	public Long get_mysqlprotocolversion() throws Exception {
		return this.mysqlprotocolversion;
	}

	/**
	* <pre>
	* The server version string returned by the mysql vserver.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_mysqlserverversion(String mysqlserverversion) throws Exception{
		this.mysqlserverversion = mysqlserverversion;
	}

	/**
	* <pre>
	* The server version string returned by the mysql vserver.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_mysqlserverversion() throws Exception {
		return this.mysqlserverversion;
	}

	/**
	* <pre>
	* The character set returned by the mysql vserver.<br> Default value: 8
	* </pre>
	*/
	public void set_mysqlcharacterset(long mysqlcharacterset) throws Exception {
		this.mysqlcharacterset = new Long(mysqlcharacterset);
	}

	/**
	* <pre>
	* The character set returned by the mysql vserver.<br> Default value: 8
	* </pre>
	*/
	public void set_mysqlcharacterset(Long mysqlcharacterset) throws Exception{
		this.mysqlcharacterset = mysqlcharacterset;
	}

	/**
	* <pre>
	* The character set returned by the mysql vserver.<br> Default value: 8
	* </pre>
	*/
	public Long get_mysqlcharacterset() throws Exception {
		return this.mysqlcharacterset;
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.<br> Default value: 41613
	* </pre>
	*/
	public void set_mysqlservercapabilities(long mysqlservercapabilities) throws Exception {
		this.mysqlservercapabilities = new Long(mysqlservercapabilities);
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.<br> Default value: 41613
	* </pre>
	*/
	public void set_mysqlservercapabilities(Long mysqlservercapabilities) throws Exception{
		this.mysqlservercapabilities = mysqlservercapabilities;
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.<br> Default value: 41613
	* </pre>
	*/
	public Long get_mysqlservercapabilities() throws Exception {
		return this.mysqlservercapabilities;
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
	* Can be active or passive.<br> Default value: PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public void set_icmpvsrresponse(String icmpvsrresponse) throws Exception{
		this.icmpvsrresponse = icmpvsrresponse;
	}

	/**
	* <pre>
	* Can be active or passive.<br> Default value: PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public String get_icmpvsrresponse() throws Exception {
		return this.icmpvsrresponse;
	}

	/**
	* <pre>
	* Name of the authentication profile to be used when authentication is turned on.
	* </pre>
	*/
	public void set_authnprofile(String authnprofile) throws Exception{
		this.authnprofile = authnprofile;
	}

	/**
	* <pre>
	* Name of the authentication profile to be used when authentication is turned on.
	* </pre>
	*/
	public String get_authnprofile() throws Exception {
		return this.authnprofile;
	}

	/**
	* <pre>
	* New name for the virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. 
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my name” or ‘my name’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. 
The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my name” or ‘my name’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The IP address of the virtual server.
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* The ssl card status for the transparent ssl cs vserver.<br> Possible values = Certkey not bound, SSL feature disabled
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* Nodegroup devno to which this csvserver belongs to.
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
	* The state of the cs vserver.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* The state of SureConnect the specified virtual server.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sc() throws Exception {
		return this.sc;
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
	* Cache type.<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* Redirect URL string.<br> Possible values = CACHE, POLICY, ORIGIN
	* </pre>
	*/
	public String get_redirect() throws Exception {
		return this.redirect;
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
	* DNS vserver name.
	* </pre>
	*/
	public String get_dnsvservername() throws Exception {
		return this.dnsvservername;
	}

	/**
	* <pre>
	* Domain.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
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
	* Cache vserver name.
	* </pre>
	*/
	public String get_cachevserver() throws Exception {
		return this.cachevserver;
	}

	/**
	* <pre>
	* target vserver name.
	* </pre>
	*/
	public String get_targetvserver() throws Exception {
		return this.targetvserver;
	}

	/**
	* <pre>
	* Priority for the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* URL string.
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* The bindpoint to which the policy is bound.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public String get_bindpoint() throws Exception {
		return this.bindpoint;
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* The invocation type.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the label invoked.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* This argument has no effect.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_gt2gb() throws Exception {
		return this.gt2gb;
	}

	/**
	* <pre>
	* Time when last state change happened. Seconds part.
	* </pre>
	*/
	public String get_statechangetimesec() throws Exception {
		return this.statechangetimesec;
	}

	/**
	* <pre>
	* Time at which last state change happened. Milliseconds part.
	* </pre>
	*/
	public Long get_statechangetimemsec() throws Exception {
		return this.statechangetimemsec;
	}

	/**
	* <pre>
	* Time in 10 millisecond ticks since the last state change.
	* </pre>
	*/
	public Long get_tickssincelaststatechange() throws Exception {
		return this.tickssincelaststatechange;
	}

	/**
	* <pre>
	* Name of the default lb vserver bound. Use this param for Default binding only. For Example: bind cs vserver cs1 -lbvserver lb1.<br> Minimum length =  1
	* </pre>
	*/
	public String get_lbvserver() throws Exception {
		return this.lbvserver;
	}

	/**
	* <pre>
	* target vserver name.
	* </pre>
	*/
	public String get_targetlbvserver() throws Exception {
		return this.targetlbvserver;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		csvserver_response result = (csvserver_response) service.get_payload_formatter().string_to_resource(csvserver_response.class, response);
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
		return result.csvserver;
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
	* Use this API to add csvserver.
	*/
	public static base_response add(nitro_service client, csvserver resource) throws Exception {
		csvserver addresource = new csvserver();
		addresource.name = resource.name;
		addresource.td = resource.td;
		addresource.servicetype = resource.servicetype;
		addresource.ipv46 = resource.ipv46;
		addresource.ippattern = resource.ippattern;
		addresource.ipmask = resource.ipmask;
		addresource.range = resource.range;
		addresource.port = resource.port;
		addresource.state = resource.state;
		addresource.stateupdate = resource.stateupdate;
		addresource.cacheable = resource.cacheable;
		addresource.redirecturl = resource.redirecturl;
		addresource.clttimeout = resource.clttimeout;
		addresource.precedence = resource.precedence;
		addresource.casesensitive = resource.casesensitive;
		addresource.somethod = resource.somethod;
		addresource.sopersistence = resource.sopersistence;
		addresource.sopersistencetimeout = resource.sopersistencetimeout;
		addresource.sothreshold = resource.sothreshold;
		addresource.sobackupaction = resource.sobackupaction;
		addresource.redirectportrewrite = resource.redirectportrewrite;
		addresource.downstateflush = resource.downstateflush;
		addresource.backupvserver = resource.backupvserver;
		addresource.disableprimaryondown = resource.disableprimaryondown;
		addresource.insertvserveripport = resource.insertvserveripport;
		addresource.vipheader = resource.vipheader;
		addresource.rtspnat = resource.rtspnat;
		addresource.authenticationhost = resource.authenticationhost;
		addresource.authentication = resource.authentication;
		addresource.listenpolicy = resource.listenpolicy;
		addresource.listenpriority = resource.listenpriority;
		addresource.authn401 = resource.authn401;
		addresource.authnvsname = resource.authnvsname;
		addresource.push = resource.push;
		addresource.pushvserver = resource.pushvserver;
		addresource.pushlabel = resource.pushlabel;
		addresource.pushmulticlients = resource.pushmulticlients;
		addresource.tcpprofilename = resource.tcpprofilename;
		addresource.httpprofilename = resource.httpprofilename;
		addresource.dbprofilename = resource.dbprofilename;
		addresource.comment = resource.comment;
		addresource.mssqlserverversion = resource.mssqlserverversion;
		addresource.l2conn = resource.l2conn;
		addresource.mysqlprotocolversion = resource.mysqlprotocolversion;
		addresource.mysqlserverversion = resource.mysqlserverversion;
		addresource.mysqlcharacterset = resource.mysqlcharacterset;
		addresource.mysqlservercapabilities = resource.mysqlservercapabilities;
		addresource.appflowlog = resource.appflowlog;
		addresource.netprofile = resource.netprofile;
		addresource.icmpvsrresponse = resource.icmpvsrresponse;
		addresource.authnprofile = resource.authnprofile;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add csvserver resources.
	*/
	public static base_responses add(nitro_service client, csvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver addresources[] = new csvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new csvserver();
				addresources[i].name = resources[i].name;
				addresources[i].td = resources[i].td;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].ipv46 = resources[i].ipv46;
				addresources[i].ippattern = resources[i].ippattern;
				addresources[i].ipmask = resources[i].ipmask;
				addresources[i].range = resources[i].range;
				addresources[i].port = resources[i].port;
				addresources[i].state = resources[i].state;
				addresources[i].stateupdate = resources[i].stateupdate;
				addresources[i].cacheable = resources[i].cacheable;
				addresources[i].redirecturl = resources[i].redirecturl;
				addresources[i].clttimeout = resources[i].clttimeout;
				addresources[i].precedence = resources[i].precedence;
				addresources[i].casesensitive = resources[i].casesensitive;
				addresources[i].somethod = resources[i].somethod;
				addresources[i].sopersistence = resources[i].sopersistence;
				addresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				addresources[i].sothreshold = resources[i].sothreshold;
				addresources[i].sobackupaction = resources[i].sobackupaction;
				addresources[i].redirectportrewrite = resources[i].redirectportrewrite;
				addresources[i].downstateflush = resources[i].downstateflush;
				addresources[i].backupvserver = resources[i].backupvserver;
				addresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				addresources[i].insertvserveripport = resources[i].insertvserveripport;
				addresources[i].vipheader = resources[i].vipheader;
				addresources[i].rtspnat = resources[i].rtspnat;
				addresources[i].authenticationhost = resources[i].authenticationhost;
				addresources[i].authentication = resources[i].authentication;
				addresources[i].listenpolicy = resources[i].listenpolicy;
				addresources[i].listenpriority = resources[i].listenpriority;
				addresources[i].authn401 = resources[i].authn401;
				addresources[i].authnvsname = resources[i].authnvsname;
				addresources[i].push = resources[i].push;
				addresources[i].pushvserver = resources[i].pushvserver;
				addresources[i].pushlabel = resources[i].pushlabel;
				addresources[i].pushmulticlients = resources[i].pushmulticlients;
				addresources[i].tcpprofilename = resources[i].tcpprofilename;
				addresources[i].httpprofilename = resources[i].httpprofilename;
				addresources[i].dbprofilename = resources[i].dbprofilename;
				addresources[i].comment = resources[i].comment;
				addresources[i].mssqlserverversion = resources[i].mssqlserverversion;
				addresources[i].l2conn = resources[i].l2conn;
				addresources[i].mysqlprotocolversion = resources[i].mysqlprotocolversion;
				addresources[i].mysqlserverversion = resources[i].mysqlserverversion;
				addresources[i].mysqlcharacterset = resources[i].mysqlcharacterset;
				addresources[i].mysqlservercapabilities = resources[i].mysqlservercapabilities;
				addresources[i].appflowlog = resources[i].appflowlog;
				addresources[i].netprofile = resources[i].netprofile;
				addresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
				addresources[i].authnprofile = resources[i].authnprofile;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete csvserver of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		csvserver deleteresource = new csvserver();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete csvserver.
	*/
	public static base_response delete(nitro_service client, csvserver resource) throws Exception {
		csvserver deleteresource = new csvserver();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete csvserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			csvserver deleteresources[] = new csvserver[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new csvserver();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete csvserver resources.
	*/
	public static base_responses delete(nitro_service client, csvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver deleteresources[] = new csvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new csvserver();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update csvserver.
	*/
	public static base_response update(nitro_service client, csvserver resource) throws Exception {
		csvserver updateresource = new csvserver();
		updateresource.name = resource.name;
		updateresource.ipv46 = resource.ipv46;
		updateresource.ippattern = resource.ippattern;
		updateresource.ipmask = resource.ipmask;
		updateresource.stateupdate = resource.stateupdate;
		updateresource.precedence = resource.precedence;
		updateresource.casesensitive = resource.casesensitive;
		updateresource.backupvserver = resource.backupvserver;
		updateresource.redirecturl = resource.redirecturl;
		updateresource.cacheable = resource.cacheable;
		updateresource.clttimeout = resource.clttimeout;
		updateresource.somethod = resource.somethod;
		updateresource.sopersistence = resource.sopersistence;
		updateresource.sopersistencetimeout = resource.sopersistencetimeout;
		updateresource.sothreshold = resource.sothreshold;
		updateresource.sobackupaction = resource.sobackupaction;
		updateresource.redirectportrewrite = resource.redirectportrewrite;
		updateresource.downstateflush = resource.downstateflush;
		updateresource.disableprimaryondown = resource.disableprimaryondown;
		updateresource.insertvserveripport = resource.insertvserveripport;
		updateresource.vipheader = resource.vipheader;
		updateresource.rtspnat = resource.rtspnat;
		updateresource.authenticationhost = resource.authenticationhost;
		updateresource.authentication = resource.authentication;
		updateresource.listenpolicy = resource.listenpolicy;
		updateresource.listenpriority = resource.listenpriority;
		updateresource.authn401 = resource.authn401;
		updateresource.authnvsname = resource.authnvsname;
		updateresource.push = resource.push;
		updateresource.pushvserver = resource.pushvserver;
		updateresource.pushlabel = resource.pushlabel;
		updateresource.pushmulticlients = resource.pushmulticlients;
		updateresource.tcpprofilename = resource.tcpprofilename;
		updateresource.httpprofilename = resource.httpprofilename;
		updateresource.dbprofilename = resource.dbprofilename;
		updateresource.comment = resource.comment;
		updateresource.l2conn = resource.l2conn;
		updateresource.mssqlserverversion = resource.mssqlserverversion;
		updateresource.mysqlprotocolversion = resource.mysqlprotocolversion;
		updateresource.mysqlserverversion = resource.mysqlserverversion;
		updateresource.mysqlcharacterset = resource.mysqlcharacterset;
		updateresource.mysqlservercapabilities = resource.mysqlservercapabilities;
		updateresource.appflowlog = resource.appflowlog;
		updateresource.netprofile = resource.netprofile;
		updateresource.authnprofile = resource.authnprofile;
		updateresource.icmpvsrresponse = resource.icmpvsrresponse;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update csvserver resources.
	*/
	public static base_responses update(nitro_service client, csvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver updateresources[] = new csvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new csvserver();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipv46 = resources[i].ipv46;
				updateresources[i].ippattern = resources[i].ippattern;
				updateresources[i].ipmask = resources[i].ipmask;
				updateresources[i].stateupdate = resources[i].stateupdate;
				updateresources[i].precedence = resources[i].precedence;
				updateresources[i].casesensitive = resources[i].casesensitive;
				updateresources[i].backupvserver = resources[i].backupvserver;
				updateresources[i].redirecturl = resources[i].redirecturl;
				updateresources[i].cacheable = resources[i].cacheable;
				updateresources[i].clttimeout = resources[i].clttimeout;
				updateresources[i].somethod = resources[i].somethod;
				updateresources[i].sopersistence = resources[i].sopersistence;
				updateresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				updateresources[i].sothreshold = resources[i].sothreshold;
				updateresources[i].sobackupaction = resources[i].sobackupaction;
				updateresources[i].redirectportrewrite = resources[i].redirectportrewrite;
				updateresources[i].downstateflush = resources[i].downstateflush;
				updateresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				updateresources[i].insertvserveripport = resources[i].insertvserveripport;
				updateresources[i].vipheader = resources[i].vipheader;
				updateresources[i].rtspnat = resources[i].rtspnat;
				updateresources[i].authenticationhost = resources[i].authenticationhost;
				updateresources[i].authentication = resources[i].authentication;
				updateresources[i].listenpolicy = resources[i].listenpolicy;
				updateresources[i].listenpriority = resources[i].listenpriority;
				updateresources[i].authn401 = resources[i].authn401;
				updateresources[i].authnvsname = resources[i].authnvsname;
				updateresources[i].push = resources[i].push;
				updateresources[i].pushvserver = resources[i].pushvserver;
				updateresources[i].pushlabel = resources[i].pushlabel;
				updateresources[i].pushmulticlients = resources[i].pushmulticlients;
				updateresources[i].tcpprofilename = resources[i].tcpprofilename;
				updateresources[i].httpprofilename = resources[i].httpprofilename;
				updateresources[i].dbprofilename = resources[i].dbprofilename;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].l2conn = resources[i].l2conn;
				updateresources[i].mssqlserverversion = resources[i].mssqlserverversion;
				updateresources[i].mysqlprotocolversion = resources[i].mysqlprotocolversion;
				updateresources[i].mysqlserverversion = resources[i].mysqlserverversion;
				updateresources[i].mysqlcharacterset = resources[i].mysqlcharacterset;
				updateresources[i].mysqlservercapabilities = resources[i].mysqlservercapabilities;
				updateresources[i].appflowlog = resources[i].appflowlog;
				updateresources[i].netprofile = resources[i].netprofile;
				updateresources[i].authnprofile = resources[i].authnprofile;
				updateresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of csvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, csvserver resource, String[] args) throws Exception{
		csvserver unsetresource = new csvserver();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of csvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			csvserver unsetresources[] = new csvserver[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new csvserver();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of csvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, csvserver resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver unsetresources[] = new csvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new csvserver();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable csvserver of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		csvserver enableresource = new csvserver();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable csvserver.
	*/
	public static base_response enable(nitro_service client, csvserver resource) throws Exception {
		csvserver enableresource = new csvserver();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable csvserver resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			csvserver enableresources[] = new csvserver[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new csvserver();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable csvserver resources.
	*/
	public static base_responses enable(nitro_service client, csvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver enableresources[] = new csvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new csvserver();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable csvserver of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		csvserver disableresource = new csvserver();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable csvserver.
	*/
	public static base_response disable(nitro_service client, csvserver resource) throws Exception {
		csvserver disableresource = new csvserver();
		disableresource.name = resource.name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable csvserver resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			csvserver disableresources[] = new csvserver[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new csvserver();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable csvserver resources.
	*/
	public static base_responses disable(nitro_service client, csvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver disableresources[] = new csvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new csvserver();
				disableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a csvserver resource.
	*/
	public static base_response rename(nitro_service client, csvserver resource, String new_name) throws Exception {
		csvserver renameresource = new csvserver();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a csvserver resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		csvserver renameresource = new csvserver();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the csvserver resources that are configured on netscaler.
	*/
	public static csvserver[] get(nitro_service service) throws Exception{
		csvserver obj = new csvserver();
		csvserver[] response = (csvserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the csvserver resources that are configured on netscaler.
	*/
	public static csvserver[] get(nitro_service service, options option) throws Exception{
		csvserver obj = new csvserver();
		csvserver[] response = (csvserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch csvserver resource of given name .
	*/
	public static csvserver get(nitro_service service, String name) throws Exception{
		csvserver obj = new csvserver();
		obj.set_name(name);
		csvserver response = (csvserver) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch csvserver resources of given names .
	*/
	public static csvserver[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			csvserver response[] = new csvserver[name.length];
			csvserver obj[] = new csvserver[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new csvserver();
				obj[i].set_name(name[i]);
				response[i] = (csvserver) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of csvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static csvserver[] get_filtered(nitro_service service, String filter) throws Exception{
		csvserver obj = new csvserver();
		options option = new options();
		option.set_filter(filter);
		csvserver[] response = (csvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of csvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static csvserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		csvserver obj = new csvserver();
		options option = new options();
		option.set_filter(filter);
		csvserver[] response = (csvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the csvserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		csvserver obj = new csvserver();
		options option = new options();
		option.set_count(true);
		csvserver[] response = (csvserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of csvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		csvserver obj = new csvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csvserver[] response = (csvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of csvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		csvserver obj = new csvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csvserver[] response = (csvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class scEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
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
	}
	public static class sopersistenceEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateupdateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class authenticationEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class redirectportrewriteEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cachetypeEnum {
		public static final String TRANSPARENT = "TRANSPARENT";
		public static final String REVERSE = "REVERSE";
		public static final String FORWARD = "FORWARD";
	}
	public static class redirectEnum {
		public static final String CACHE = "CACHE";
		public static final String POLICY = "POLICY";
		public static final String ORIGIN = "ORIGIN";
	}
	public static class downstateflushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class pushmulticlientsEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}
	public static class servicetypeEnum {
		public static final String HTTP = "HTTP";
		public static final String SSL = "SSL";
		public static final String TCP = "TCP";
		public static final String FTP = "FTP";
		public static final String RTSP = "RTSP";
		public static final String SSL_TCP = "SSL_TCP";
		public static final String UDP = "UDP";
		public static final String DNS = "DNS";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String ANY = "ANY";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
	}
	public static class icmpvsrresponseEnum {
		public static final String PASSIVE = "PASSIVE";
		public static final String ACTIVE = "ACTIVE";
	}
	public static class casesensitiveEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class valueEnum {
		public static final String Certkey_not_bound = "Certkey not bound";
		public static final String SSL_feature_disabled = "SSL feature disabled";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class l2connEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class sobackupactionEnum {
		public static final String DROP = "DROP";
		public static final String ACCEPT = "ACCEPT";
		public static final String REDIRECT = "REDIRECT";
	}
	public static class gt2gbEnum {
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
	public static class pushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class insertvserveripportEnum {
		public static final String OFF = "OFF";
		public static final String VIPADDR = "VIPADDR";
		public static final String V6TOV4MAPPING = "V6TOV4MAPPING";
	}
	public static class typeEnum {
		public static final String CONTENT = "CONTENT";
		public static final String ADDRESS = "ADDRESS";
	}
	public static class rtspnatEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class disableprimaryondownEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mssqlserverversionEnum {
		public static final String _70 = "70";
		public static final String _2000 = "2000";
		public static final String _2000SP1 = "2000SP1";
		public static final String _2005 = "2005";
		public static final String _2008 = "2008";
		public static final String _2008R2 = "2008R2";
		public static final String _2012 = "2012";
	}
	public static class authn401Enum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class cacheableEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
