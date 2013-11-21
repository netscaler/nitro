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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbvserver_response extends base_response
{
	public lbvserver[] lbvserver;
}
/**
* Configuration for Load Balancing Virtual Server resource.
*/

public class lbvserver extends base_resource
{
	private String name;
	private String servicetype;
	private String ipv46;
	private String ippattern;
	private String ipmask;
	private Integer port;
	private Long range;
	private String persistencetype;
	private Long timeout;
	private String persistencebackup;
	private Long backuppersistencetimeout;
	private String lbmethod;
	private Long hashlength;
	private String netmask;
	private Long v6netmasklen;
	private String cookiename;
	private String rule;
	private String listenpolicy;
	private Long listenpriority;
	private String resrule;
	private String persistmask;
	private Long v6persistmasklen;
	private String pq;
	private String sc;
	private String rtspnat;
	private String m;
	private Long tosid;
	private Long datalength;
	private Long dataoffset;
	private String sessionless;
	private String state;
	private String connfailover;
	private String redirurl;
	private String cacheable;
	private Long clttimeout;
	private String somethod;
	private String sopersistence;
	private Long sopersistencetimeout;
	private Long healththreshold;
	private Long sothreshold;
	private String sobackupaction;
	private String redirectportrewrite;
	private String downstateflush;
	private String backupvserver;
	private String disableprimaryondown;
	private String insertvserveripport;
	private String vipheader;
	private String authenticationhost;
	private String authentication;
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
	private String l2conn;
	private String mssqlserverversion;
	private Long mysqlprotocolversion;
	private String mysqlserverversion;
	private Long mysqlcharacterset;
	private Long mysqlservercapabilities;
	private String appflowlog;
	private String netprofile;
	private String icmpvsrresponse;
	private Long newservicerequest;
	private String newservicerequestunit;
	private Long newservicerequestincrementinterval;
	private Long minautoscalemembers;
	private Long maxautoscalemembers;
	private Long[] persistavpno;
	private String skippersistency;
	private Long td;
	private String authnprofile;
	private String macmoderetainvlan;
	private String dbslb;
	private String dns64;
	private String bypassaaaa;
	private String recursionavailable;
	private Long weight;
	private String servicename;
	private Boolean redirurlflags;
	private String newname;

	//------- Read only Parameter ---------;

	private String value;
	private String ipmapping;
	private String ngname;
	private String type;
	private String curstate;
	private String effectivestate;
	private Integer status;
	private Integer lbrrreason;
	private String redirect;
	private String precedence;
	private String homepage;
	private String dnsvservername;
	private String domain;
	private String policyname;
	private String cachevserver;
	private Long health;
	private String gotopriorityexpression;
	private Long ruletype;
	private String groupname;
	private String cookiedomain;
	private String map;
	private String gt2gb;
	private String consolidatedlconn;
	private String consolidatedlconngbl;
	private Integer thresholdvalue;
	private String bindpoint;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private Integer version;
	private Long totalservices;
	private Long activeservices;
	private String statechangetimesec;
	private Long statechangetimeseconds;
	private Long statechangetimemsec;
	private Long tickssincelaststatechange;
	private Boolean isgslb;
	private Long __count;

	/**
	* <pre>
	* Name for the virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Can be changed after the virtual server is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my vserver" or 'my vserver'). .<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the virtual server. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at sign (@), equal sign (=), and hyphen (-) characters. Can be changed after the virtual server is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my vserver" or 'my vserver'). .<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Protocol used by the service (also called the service type).<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, DTLS, NNTP, DNS, DHCPRA, ANY, SIP_UDP, DNS_TCP, RTSP, PUSH, SSL_PUSH, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER, TFTP
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* Protocol used by the service (also called the service type).<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, DTLS, NNTP, DNS, DHCPRA, ANY, SIP_UDP, DNS_TCP, RTSP, PUSH, SSL_PUSH, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER, TFTP
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* IPv4 or IPv6 address to assign to the virtual server.
	* </pre>
	*/
	public void set_ipv46(String ipv46) throws Exception{
		this.ipv46 = ipv46;
	}

	/**
	* <pre>
	* IPv4 or IPv6 address to assign to the virtual server.
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* IP address pattern, in dotted decimal notation, for identifying packets to be accepted by the virtual server. The IP Mask parameter specifies which part of the destination IP address is matched against the pattern.  Mutually exclusive with the IP Address parameter. 
For example, if the IP pattern assigned to the virtual server is 198.51.100.0 and the IP mask is 255.255.240.0 (a forward mask), the first 20 bits in the destination IP addresses are matched with the first 20 bits in the pattern. The virtual server accepts requests with IP addresses that range from 198.51.96.1 to 198.51.111.254.  You can also use a pattern such as 0.0.2.2 and a mask such as 0.0.255.255 (a reverse mask).
If a destination IP address matches more than one IP pattern, the pattern with the longest match is selected, and the associated virtual server processes the request. For example, if virtual servers vs1 and vs2 have the same IP pattern, 0.0.100.128, but different IP masks of 0.0.255.255 and 0.0.224.255, a destination IP address of 198.51.100.128 has the longest match with the IP pattern of vs1. If a destination IP address matches two or more virtual servers to the same extent, the request is processed by the virtual server whose port number matches the port number in the request.
	* </pre>
	*/
	public void set_ippattern(String ippattern) throws Exception{
		this.ippattern = ippattern;
	}

	/**
	* <pre>
	* IP address pattern, in dotted decimal notation, for identifying packets to be accepted by the virtual server. The IP Mask parameter specifies which part of the destination IP address is matched against the pattern.  Mutually exclusive with the IP Address parameter. 
For example, if the IP pattern assigned to the virtual server is 198.51.100.0 and the IP mask is 255.255.240.0 (a forward mask), the first 20 bits in the destination IP addresses are matched with the first 20 bits in the pattern. The virtual server accepts requests with IP addresses that range from 198.51.96.1 to 198.51.111.254.  You can also use a pattern such as 0.0.2.2 and a mask such as 0.0.255.255 (a reverse mask).
If a destination IP address matches more than one IP pattern, the pattern with the longest match is selected, and the associated virtual server processes the request. For example, if virtual servers vs1 and vs2 have the same IP pattern, 0.0.100.128, but different IP masks of 0.0.255.255 and 0.0.224.255, a destination IP address of 198.51.100.128 has the longest match with the IP pattern of vs1. If a destination IP address matches two or more virtual servers to the same extent, the request is processed by the virtual server whose port number matches the port number in the request.
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
	* Port number for the virtual server.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Port number for the virtual server.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Port number for the virtual server.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Number of IP addresses that the appliance must generate and assign to the virtual server. The virtual server then functions as a network virtual server, accepting traffic on any of the generated IP addresses. The IP addresses are generated automatically, as follows: 
* For a range of n, the last octet of the address specified by the IP Address parameter increments n-1 times. 
* If the last octet exceeds 255, it rolls over to 0 and the third octet increments by 1.
Note: The Range parameter assigns multiple IP addresses to one virtual server. To generate an array of virtual servers, each of which owns only one IP address, use brackets in the IP Address and Name parameters to specify the range. For example:
add lb vserver my_vserver[1-3] HTTP 192.0.2.[1-3] 80.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(long range) throws Exception {
		this.range = new Long(range);
	}

	/**
	* <pre>
	* Number of IP addresses that the appliance must generate and assign to the virtual server. The virtual server then functions as a network virtual server, accepting traffic on any of the generated IP addresses. The IP addresses are generated automatically, as follows: 
* For a range of n, the last octet of the address specified by the IP Address parameter increments n-1 times. 
* If the last octet exceeds 255, it rolls over to 0 and the third octet increments by 1.
Note: The Range parameter assigns multiple IP addresses to one virtual server. To generate an array of virtual servers, each of which owns only one IP address, use brackets in the IP Address and Name parameters to specify the range. For example:
add lb vserver my_vserver[1-3] HTTP 192.0.2.[1-3] 80.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(Long range) throws Exception{
		this.range = range;
	}

	/**
	* <pre>
	* Number of IP addresses that the appliance must generate and assign to the virtual server. The virtual server then functions as a network virtual server, accepting traffic on any of the generated IP addresses. The IP addresses are generated automatically, as follows: 
* For a range of n, the last octet of the address specified by the IP Address parameter increments n-1 times. 
* If the last octet exceeds 255, it rolls over to 0 and the third octet increments by 1.
Note: The Range parameter assigns multiple IP addresses to one virtual server. To generate an array of virtual servers, each of which owns only one IP address, use brackets in the IP Address and Name parameters to specify the range. For example:
add lb vserver my_vserver[1-3] HTTP 192.0.2.[1-3] 80.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public Long get_range() throws Exception {
		return this.range;
	}

	/**
	* <pre>
	* Type of persistence for the virtual server. Available settings function as follows:
* SOURCEIP - Connections from the same client IP address belong to the same persistence session.
* COOKIEINSERT - Connections that have the same HTTP Cookie, inserted by a Set-Cookie directive from a server, belong to the same persistence session. 
* SSLSESSION - Connections that have the same SSL Session ID belong to the same persistence session.
* CUSTOMSERVERID - Connections with the same server ID form part of the same session. For this persistence type, set the Server ID (CustomServerID) parameter for each service and configure the Rule parameter to identify the server ID in a request.
* RULE - All connections that match a user defined rule belong to the same persistence session. 
* URLPASSIVE - Requests that have the same server ID in the URL query belong to the same persistence session. The server ID is the hexadecimal representation of the IP address and port of the service to which the request must be forwarded. This persistence type requires a rule to identify the server ID in the request. 
* DESTIP - Connections to the same destination IP address belong to the same persistence session.
* SRCIPDESTIP - Connections that have the same source IP address and destination IP address belong to the same persistence session.
* CALLID - Connections that have the same CALL-ID SIP header belong to the same persistence session.
* RTSPSID - Connections that have the same RTSP Session ID belong to the same persistence session.<br> Possible values = SOURCEIP, COOKIEINSERT, SSLSESSION, RULE, URLPASSIVE, CUSTOMSERVERID, DESTIP, SRCIPDESTIP, CALLID, RTSPSID, DIAMETER, NONE
	* </pre>
	*/
	public void set_persistencetype(String persistencetype) throws Exception{
		this.persistencetype = persistencetype;
	}

	/**
	* <pre>
	* Type of persistence for the virtual server. Available settings function as follows:
* SOURCEIP - Connections from the same client IP address belong to the same persistence session.
* COOKIEINSERT - Connections that have the same HTTP Cookie, inserted by a Set-Cookie directive from a server, belong to the same persistence session. 
* SSLSESSION - Connections that have the same SSL Session ID belong to the same persistence session.
* CUSTOMSERVERID - Connections with the same server ID form part of the same session. For this persistence type, set the Server ID (CustomServerID) parameter for each service and configure the Rule parameter to identify the server ID in a request.
* RULE - All connections that match a user defined rule belong to the same persistence session. 
* URLPASSIVE - Requests that have the same server ID in the URL query belong to the same persistence session. The server ID is the hexadecimal representation of the IP address and port of the service to which the request must be forwarded. This persistence type requires a rule to identify the server ID in the request. 
* DESTIP - Connections to the same destination IP address belong to the same persistence session.
* SRCIPDESTIP - Connections that have the same source IP address and destination IP address belong to the same persistence session.
* CALLID - Connections that have the same CALL-ID SIP header belong to the same persistence session.
* RTSPSID - Connections that have the same RTSP Session ID belong to the same persistence session.<br> Possible values = SOURCEIP, COOKIEINSERT, SSLSESSION, RULE, URLPASSIVE, CUSTOMSERVERID, DESTIP, SRCIPDESTIP, CALLID, RTSPSID, DIAMETER, NONE
	* </pre>
	*/
	public String get_persistencetype() throws Exception {
		return this.persistencetype;
	}

	/**
	* <pre>
	* Time period for which a persistence session is in effect.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* Time period for which a persistence session is in effect.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* Time period for which a persistence session is in effect.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* Backup persistence type for the virtual server. Becomes operational if the primary persistence mechanism fails.<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public void set_persistencebackup(String persistencebackup) throws Exception{
		this.persistencebackup = persistencebackup;
	}

	/**
	* <pre>
	* Backup persistence type for the virtual server. Becomes operational if the primary persistence mechanism fails.<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public String get_persistencebackup() throws Exception {
		return this.persistencebackup;
	}

	/**
	* <pre>
	* Time period for which backup persistence is in effect.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backuppersistencetimeout(long backuppersistencetimeout) throws Exception {
		this.backuppersistencetimeout = new Long(backuppersistencetimeout);
	}

	/**
	* <pre>
	* Time period for which backup persistence is in effect.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backuppersistencetimeout(Long backuppersistencetimeout) throws Exception{
		this.backuppersistencetimeout = backuppersistencetimeout;
	}

	/**
	* <pre>
	* Time period for which backup persistence is in effect.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_backuppersistencetimeout() throws Exception {
		return this.backuppersistencetimeout;
	}

	/**
	* <pre>
	* Load balancing method.  The available settings function as follows:
* ROUNDROBIN - Distribute requests in rotation, regardless of the load. Weights can be assigned to services to enforce weighted round robin distribution.
* LEASTCONNECTION (default) - Select the service with the fewest connections. 
* LEASTRESPONSETIME - Select the service with the lowest average response time. 
* LEASTBANDWIDTH - Select the service currently handling the least traffic.
* LEASTPACKETS - Select the service currently serving the lowest number of packets per second.
* CUSTOMLOAD - Base service selection on the SNMP metrics obtained by custom load monitors.
* LRTM - Select the service with the lowest response time. Response times are learned through monitoring probes. This method also takes the number of active connections into account.
Also available are a number of hashing methods, in which the appliance extracts a predetermined portion of the request, creates a hash of the portion, and then checks whether any previous requests had the same hash value. If it finds a match, it forwards the request to the service that served those previous requests. Following are the hashing methods: 
* URLHASH - Create a hash of the request URL (or part of the URL).
* DOMAINHASH - Create a hash of the domain name in the request (or part of the domain name). The domain name is taken from either the URL or the Host header. If the domain name appears in both locations, the URL is preferred. If the request does not contain a domain name, the load balancing method defaults to LEASTCONNECTION.
* DESTINATIONIPHASH - Create a hash of the destination IP address in the IP header. 
* SOURCEIPHASH - Create a hash of the source IP address in the IP header.  
* TOKEN - Extract a token from the request, create a hash of the token, and then select the service to which any previous requests with the same token hash value were sent. 
* SRCIPDESTIPHASH - Create a hash of the string obtained by concatenating the source IP address and destination IP address in the IP header.  
* SRCIPSRCPORTHASH - Create a hash of the source IP address and source port in the IP header.  
* CALLIDHASH - Create a hash of the SIP Call-ID header.<br> Default value: LEASTCONNECTION<br> Possible values = ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, URLHASH, DOMAINHASH, DESTINATIONIPHASH, SOURCEIPHASH, SRCIPDESTIPHASH, LEASTBANDWIDTH, LEASTPACKETS, TOKEN, SRCIPSRCPORTHASH, LRTM, CALLIDHASH, CUSTOMLOAD, LEASTREQUEST
	* </pre>
	*/
	public void set_lbmethod(String lbmethod) throws Exception{
		this.lbmethod = lbmethod;
	}

	/**
	* <pre>
	* Load balancing method.  The available settings function as follows:
* ROUNDROBIN - Distribute requests in rotation, regardless of the load. Weights can be assigned to services to enforce weighted round robin distribution.
* LEASTCONNECTION (default) - Select the service with the fewest connections. 
* LEASTRESPONSETIME - Select the service with the lowest average response time. 
* LEASTBANDWIDTH - Select the service currently handling the least traffic.
* LEASTPACKETS - Select the service currently serving the lowest number of packets per second.
* CUSTOMLOAD - Base service selection on the SNMP metrics obtained by custom load monitors.
* LRTM - Select the service with the lowest response time. Response times are learned through monitoring probes. This method also takes the number of active connections into account.
Also available are a number of hashing methods, in which the appliance extracts a predetermined portion of the request, creates a hash of the portion, and then checks whether any previous requests had the same hash value. If it finds a match, it forwards the request to the service that served those previous requests. Following are the hashing methods: 
* URLHASH - Create a hash of the request URL (or part of the URL).
* DOMAINHASH - Create a hash of the domain name in the request (or part of the domain name). The domain name is taken from either the URL or the Host header. If the domain name appears in both locations, the URL is preferred. If the request does not contain a domain name, the load balancing method defaults to LEASTCONNECTION.
* DESTINATIONIPHASH - Create a hash of the destination IP address in the IP header. 
* SOURCEIPHASH - Create a hash of the source IP address in the IP header.  
* TOKEN - Extract a token from the request, create a hash of the token, and then select the service to which any previous requests with the same token hash value were sent. 
* SRCIPDESTIPHASH - Create a hash of the string obtained by concatenating the source IP address and destination IP address in the IP header.  
* SRCIPSRCPORTHASH - Create a hash of the source IP address and source port in the IP header.  
* CALLIDHASH - Create a hash of the SIP Call-ID header.<br> Default value: LEASTCONNECTION<br> Possible values = ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, URLHASH, DOMAINHASH, DESTINATIONIPHASH, SOURCEIPHASH, SRCIPDESTIPHASH, LEASTBANDWIDTH, LEASTPACKETS, TOKEN, SRCIPSRCPORTHASH, LRTM, CALLIDHASH, CUSTOMLOAD, LEASTREQUEST
	* </pre>
	*/
	public String get_lbmethod() throws Exception {
		return this.lbmethod;
	}

	/**
	* <pre>
	* Number of bytes to consider for the hash value used in the URLHASH and DOMAINHASH load balancing methods.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public void set_hashlength(long hashlength) throws Exception {
		this.hashlength = new Long(hashlength);
	}

	/**
	* <pre>
	* Number of bytes to consider for the hash value used in the URLHASH and DOMAINHASH load balancing methods.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public void set_hashlength(Long hashlength) throws Exception{
		this.hashlength = hashlength;
	}

	/**
	* <pre>
	* Number of bytes to consider for the hash value used in the URLHASH and DOMAINHASH load balancing methods.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public Long get_hashlength() throws Exception {
		return this.hashlength;
	}

	/**
	* <pre>
	* IPv4 subnet mask to apply to the destination IP address or source IP address when the load balancing method is DESTINATIONIPHASH or SOURCEIPHASH.<br> Minimum length =  1
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* IPv4 subnet mask to apply to the destination IP address or source IP address when the load balancing method is DESTINATIONIPHASH or SOURCEIPHASH.<br> Minimum length =  1
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* Number of bits to consider in an IPv6 destination or source IP address, for creating the hash that is required by the DESTINATIONIPHASH and SOURCEIPHASH load balancing methods.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6netmasklen(long v6netmasklen) throws Exception {
		this.v6netmasklen = new Long(v6netmasklen);
	}

	/**
	* <pre>
	* Number of bits to consider in an IPv6 destination or source IP address, for creating the hash that is required by the DESTINATIONIPHASH and SOURCEIPHASH load balancing methods.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6netmasklen(Long v6netmasklen) throws Exception{
		this.v6netmasklen = v6netmasklen;
	}

	/**
	* <pre>
	* Number of bits to consider in an IPv6 destination or source IP address, for creating the hash that is required by the DESTINATIONIPHASH and SOURCEIPHASH load balancing methods.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public Long get_v6netmasklen() throws Exception {
		return this.v6netmasklen;
	}

	/**
	* <pre>
	* Use this parameter to specify the cookie name for COOKIE peristence type. It specifies the name of cookie with a maximum of 32 characters. If not specified, cookie name is internally generated.
	* </pre>
	*/
	public void set_cookiename(String cookiename) throws Exception{
		this.cookiename = cookiename;
	}

	/**
	* <pre>
	* Use this parameter to specify the cookie name for COOKIE peristence type. It specifies the name of cookie with a maximum of 32 characters. If not specified, cookie name is internally generated.
	* </pre>
	*/
	public String get_cookiename() throws Exception {
		return this.cookiename;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic or default syntax.
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the \ character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.<br> Default value: "none"
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Expression, or name of a named expression, against which traffic is evaluated. Written in the classic or default syntax.
Note:
Maximum length of a string literal in the expression is 255 characters. A longer string can be split into smaller strings of up to 255 characters each, and the smaller strings concatenated with the + operator. For example, you can create a 500-character string as follows: '"<string of 255 characters>" + "<string of 245 characters>"'
The following requirements apply only to the NetScaler CLI:
* If the expression includes one or more spaces, enclose the entire expression in double quotation marks.
* If the expression itself includes double quotation marks, escape the quotations by using the \ character. 
* Alternatively, you can use single quotation marks to enclose the rule, in which case you do not have to escape the double quotation marks.<br> Default value: "none"
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Default syntax expression identifying traffic accepted by the virtual server. Can be either an expression (for example, CLIENT.IP.DST.IN_SUBNET(192.0.2.0/24) or the name of a named expression. In the above example, the virtual server accepts all requests whose destination IP address is in the 192.0.2.0/24 subnet.<br> Default value: "none"
	* </pre>
	*/
	public void set_listenpolicy(String listenpolicy) throws Exception{
		this.listenpolicy = listenpolicy;
	}

	/**
	* <pre>
	* Default syntax expression identifying traffic accepted by the virtual server. Can be either an expression (for example, CLIENT.IP.DST.IN_SUBNET(192.0.2.0/24) or the name of a named expression. In the above example, the virtual server accepts all requests whose destination IP address is in the 192.0.2.0/24 subnet.<br> Default value: "none"
	* </pre>
	*/
	public String get_listenpolicy() throws Exception {
		return this.listenpolicy;
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public void set_listenpriority(long listenpriority) throws Exception {
		this.listenpriority = new Long(listenpriority);
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public void set_listenpriority(Long listenpriority) throws Exception{
		this.listenpriority = listenpriority;
	}

	/**
	* <pre>
	* Integer specifying the priority of the listen policy. A higher number specifies a lower priority. If a request matches the listen policies of more than one virtual server the virtual server whose listen policy has the highest priority (the lowest priority number) accepts the request.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public Long get_listenpriority() throws Exception {
		return this.listenpriority;
	}

	/**
	* <pre>
	* Default syntax expression specifying which part of a server's response to use for creating rule based persistence sessions (persistence type RULE). Can be either an expression or the name of a named expression.
Example:
HTTP.RES.HEADER("setcookie").VALUE(0).TYPECAST_NVLIST_T('=',';').VALUE("server1").<br> Default value: "none"
	* </pre>
	*/
	public void set_resrule(String resrule) throws Exception{
		this.resrule = resrule;
	}

	/**
	* <pre>
	* Default syntax expression specifying which part of a server's response to use for creating rule based persistence sessions (persistence type RULE). Can be either an expression or the name of a named expression.
Example:
HTTP.RES.HEADER("setcookie").VALUE(0).TYPECAST_NVLIST_T('=',';').VALUE("server1").<br> Default value: "none"
	* </pre>
	*/
	public String get_resrule() throws Exception {
		return this.resrule;
	}

	/**
	* <pre>
	* Persistence mask for IP based persistence types, for IPv4 virtual servers.<br> Minimum length =  1
	* </pre>
	*/
	public void set_persistmask(String persistmask) throws Exception{
		this.persistmask = persistmask;
	}

	/**
	* <pre>
	* Persistence mask for IP based persistence types, for IPv4 virtual servers.<br> Minimum length =  1
	* </pre>
	*/
	public String get_persistmask() throws Exception {
		return this.persistmask;
	}

	/**
	* <pre>
	* Persistence mask for IP based persistence types, for IPv6 virtual servers.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6persistmasklen(long v6persistmasklen) throws Exception {
		this.v6persistmasklen = new Long(v6persistmasklen);
	}

	/**
	* <pre>
	* Persistence mask for IP based persistence types, for IPv6 virtual servers.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6persistmasklen(Long v6persistmasklen) throws Exception{
		this.v6persistmasklen = v6persistmasklen;
	}

	/**
	* <pre>
	* Persistence mask for IP based persistence types, for IPv6 virtual servers.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public Long get_v6persistmasklen() throws Exception {
		return this.v6persistmasklen;
	}

	/**
	* <pre>
	* Use priority queuing on the virtual server. based persistence types, for IPv6 virtual servers.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_pq(String pq) throws Exception{
		this.pq = pq;
	}

	/**
	* <pre>
	* Use priority queuing on the virtual server. based persistence types, for IPv6 virtual servers.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_pq() throws Exception {
		return this.pq;
	}

	/**
	* <pre>
	* Use SureConnect on the virtual server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sc(String sc) throws Exception{
		this.sc = sc;
	}

	/**
	* <pre>
	* Use SureConnect on the virtual server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sc() throws Exception {
		return this.sc;
	}

	/**
	* <pre>
	* Use network address translation (NAT) for RTSP data connections.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_rtspnat(String rtspnat) throws Exception{
		this.rtspnat = rtspnat;
	}

	/**
	* <pre>
	* Use network address translation (NAT) for RTSP data connections.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_rtspnat() throws Exception {
		return this.rtspnat;
	}

	/**
	* <pre>
	* Redirection mode for load balancing. Available settings function as follows:
* IP - Before forwarding a request to a server, change the destination IP address to the server's IP address. 
* MAC - Before forwarding a request to a server, change the destination MAC address to the server's MAC address.  The destination IP address is not changed. MAC-based redirection mode is used mostly in firewall load balancing deployments. 
* IPTUNNEL - Perform IP-in-IP encapsulation for client IP packets. In the outer IP headers, set the destination IP address to the IP address of the server and the source IP address to the subnet IP (SNIP). The client IP packets are not modified. Applicable to both IPv4 and IPv6 packets. 
* TOS - Encode the virtual server's TOS ID in the TOS field of the IP header. 
You can use either the IPTUNNEL or the TOS option to implement Direct Server Return (DSR).<br> Default value: IP<br> Possible values = IP, MAC, IPTUNNEL, TOS
	* </pre>
	*/
	public void set_m(String m) throws Exception{
		this.m = m;
	}

	/**
	* <pre>
	* Redirection mode for load balancing. Available settings function as follows:
* IP - Before forwarding a request to a server, change the destination IP address to the server's IP address. 
* MAC - Before forwarding a request to a server, change the destination MAC address to the server's MAC address.  The destination IP address is not changed. MAC-based redirection mode is used mostly in firewall load balancing deployments. 
* IPTUNNEL - Perform IP-in-IP encapsulation for client IP packets. In the outer IP headers, set the destination IP address to the IP address of the server and the source IP address to the subnet IP (SNIP). The client IP packets are not modified. Applicable to both IPv4 and IPv6 packets. 
* TOS - Encode the virtual server's TOS ID in the TOS field of the IP header. 
You can use either the IPTUNNEL or the TOS option to implement Direct Server Return (DSR).<br> Default value: IP<br> Possible values = IP, MAC, IPTUNNEL, TOS
	* </pre>
	*/
	public String get_m() throws Exception {
		return this.m;
	}

	/**
	* <pre>
	* TOS ID of the virtual server. Applicable only when the load balancing redirection mode is set to TOS.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public void set_tosid(long tosid) throws Exception {
		this.tosid = new Long(tosid);
	}

	/**
	* <pre>
	* TOS ID of the virtual server. Applicable only when the load balancing redirection mode is set to TOS.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public void set_tosid(Long tosid) throws Exception{
		this.tosid = tosid;
	}

	/**
	* <pre>
	* TOS ID of the virtual server. Applicable only when the load balancing redirection mode is set to TOS.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public Long get_tosid() throws Exception {
		return this.tosid;
	}

	/**
	* <pre>
	* Length of the token to be extracted from the data segment of an incoming packet, for use in the token method of load balancing. The length of the token, specified in bytes, must not be greater than 24 KB. Applicable to virtual servers of type TCP.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_datalength(long datalength) throws Exception {
		this.datalength = new Long(datalength);
	}

	/**
	* <pre>
	* Length of the token to be extracted from the data segment of an incoming packet, for use in the token method of load balancing. The length of the token, specified in bytes, must not be greater than 24 KB. Applicable to virtual servers of type TCP.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_datalength(Long datalength) throws Exception{
		this.datalength = datalength;
	}

	/**
	* <pre>
	* Length of the token to be extracted from the data segment of an incoming packet, for use in the token method of load balancing. The length of the token, specified in bytes, must not be greater than 24 KB. Applicable to virtual servers of type TCP.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_datalength() throws Exception {
		return this.datalength;
	}

	/**
	* <pre>
	* Offset to be considered when extracting a token from the TCP payload. Applicable to virtual servers, of type TCP, using the token method of load balancing. Must be within the first 24 KB of the TCP payload.<br> Minimum value =  0<br> Maximum value =  25400
	* </pre>
	*/
	public void set_dataoffset(long dataoffset) throws Exception {
		this.dataoffset = new Long(dataoffset);
	}

	/**
	* <pre>
	* Offset to be considered when extracting a token from the TCP payload. Applicable to virtual servers, of type TCP, using the token method of load balancing. Must be within the first 24 KB of the TCP payload.<br> Minimum value =  0<br> Maximum value =  25400
	* </pre>
	*/
	public void set_dataoffset(Long dataoffset) throws Exception{
		this.dataoffset = dataoffset;
	}

	/**
	* <pre>
	* Offset to be considered when extracting a token from the TCP payload. Applicable to virtual servers, of type TCP, using the token method of load balancing. Must be within the first 24 KB of the TCP payload.<br> Minimum value =  0<br> Maximum value =  25400
	* </pre>
	*/
	public Long get_dataoffset() throws Exception {
		return this.dataoffset;
	}

	/**
	* <pre>
	* Perform load balancing on a per-packet basis, without establishing sessions. Recommended for load balancing of intrusion detection system (IDS) servers and scenarios involving direct server return (DSR), where session information is unnecessary.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sessionless(String sessionless) throws Exception{
		this.sessionless = sessionless;
	}

	/**
	* <pre>
	* Perform load balancing on a per-packet basis, without establishing sessions. Recommended for load balancing of intrusion detection system (IDS) servers and scenarios involving direct server return (DSR), where session information is unnecessary.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sessionless() throws Exception {
		return this.sessionless;
	}

	/**
	* <pre>
	* State of the load balancing virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* State of the load balancing virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Mode in which the connection failover feature must operate for the virtual server. After a failover, established TCP connections and UDP packet flows are kept active and resumed on the secondary appliance. Clients remain connected to the same servers. Available settings function as follows:
* STATEFUL - The primary appliance shares state information with the secondary appliance, in real time, resulting in some runtime processing overhead. 
* STATELESS - State information is not shared, and the new primary appliance tries to re-create the packet flow on the basis of the information contained in the packets it receives. 
* DISABLED - Connection failover does not occur.<br> Default value: DISABLED<br> Possible values = DISABLED, STATEFUL, STATELESS
	* </pre>
	*/
	public void set_connfailover(String connfailover) throws Exception{
		this.connfailover = connfailover;
	}

	/**
	* <pre>
	* Mode in which the connection failover feature must operate for the virtual server. After a failover, established TCP connections and UDP packet flows are kept active and resumed on the secondary appliance. Clients remain connected to the same servers. Available settings function as follows:
* STATEFUL - The primary appliance shares state information with the secondary appliance, in real time, resulting in some runtime processing overhead. 
* STATELESS - State information is not shared, and the new primary appliance tries to re-create the packet flow on the basis of the information contained in the packets it receives. 
* DISABLED - Connection failover does not occur.<br> Default value: DISABLED<br> Possible values = DISABLED, STATEFUL, STATELESS
	* </pre>
	*/
	public String get_connfailover() throws Exception {
		return this.connfailover;
	}

	/**
	* <pre>
	* URL to which to redirect traffic if the virtual server becomes unavailable. 
WARNING! Make sure that the domain in the URL does not match the domain specified for a content switching policy. If it does, requests are continuously redirected to the unavailable virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_redirurl(String redirurl) throws Exception{
		this.redirurl = redirurl;
	}

	/**
	* <pre>
	* URL to which to redirect traffic if the virtual server becomes unavailable. 
WARNING! Make sure that the domain in the URL does not match the domain specified for a content switching policy. If it does, requests are continuously redirected to the unavailable virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_redirurl() throws Exception {
		return this.redirurl;
	}

	/**
	* <pre>
	* Route cacheable requests to a cache redirection virtual server. The load balancing virtual server can forward requests only to a transparent cache redirection virtual server that has an IP address and port combination of *:80, so such a cache redirection virtual server must be configured on the appliance.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cacheable(String cacheable) throws Exception{
		this.cacheable = cacheable;
	}

	/**
	* <pre>
	* Route cacheable requests to a cache redirection virtual server. The load balancing virtual server can forward requests only to a transparent cache redirection virtual server that has an IP address and port combination of *:80, so such a cache redirection virtual server must be configured on the appliance.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cacheable() throws Exception {
		return this.cacheable;
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a client connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a client connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a client connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* Type of threshold that, when exceeded, triggers spillover. Available settings function as follows:
* CONNECTION - Spillover occurs when the number of client connections exceeds the threshold.
* DYNAMICCONNECTION - Spillover occurs when the number of client connections at the virtual server exceeds the sum of the maximum client (Max Clients) settings for bound services. Do not specify a spillover threshold for this setting, because the threshold is implied by the Max Clients settings of bound services.
* BANDWIDTH - Spillover occurs when the bandwidth consumed by the virtual server's incoming and outgoing traffic exceeds the threshold. 
* HEALTH - Spillover occurs when the percentage of weights of the services that are UP drops below the threshold. For example, if services svc1, svc2, and svc3 are bound to a virtual server, with weights 1, 2, and 3, and the spillover threshold is 50%, spillover occurs if svc1 and svc3 or svc2 and svc3 transition to DOWN. 
* NONE - Spillover does not occur.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public void set_somethod(String somethod) throws Exception{
		this.somethod = somethod;
	}

	/**
	* <pre>
	* Type of threshold that, when exceeded, triggers spillover. Available settings function as follows:
* CONNECTION - Spillover occurs when the number of client connections exceeds the threshold.
* DYNAMICCONNECTION - Spillover occurs when the number of client connections at the virtual server exceeds the sum of the maximum client (Max Clients) settings for bound services. Do not specify a spillover threshold for this setting, because the threshold is implied by the Max Clients settings of bound services.
* BANDWIDTH - Spillover occurs when the bandwidth consumed by the virtual server's incoming and outgoing traffic exceeds the threshold. 
* HEALTH - Spillover occurs when the percentage of weights of the services that are UP drops below the threshold. For example, if services svc1, svc2, and svc3 are bound to a virtual server, with weights 1, 2, and 3, and the spillover threshold is 50%, spillover occurs if svc1 and svc3 or svc2 and svc3 transition to DOWN. 
* NONE - Spillover does not occur.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public String get_somethod() throws Exception {
		return this.somethod;
	}

	/**
	* <pre>
	* If spillover occurs, maintain source IP address based persistence for both primary and backup virtual servers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sopersistence(String sopersistence) throws Exception{
		this.sopersistence = sopersistence;
	}

	/**
	* <pre>
	* If spillover occurs, maintain source IP address based persistence for both primary and backup virtual servers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sopersistence() throws Exception {
		return this.sopersistence;
	}

	/**
	* <pre>
	* Timeout for spillover persistence, in minutes.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_sopersistencetimeout(long sopersistencetimeout) throws Exception {
		this.sopersistencetimeout = new Long(sopersistencetimeout);
	}

	/**
	* <pre>
	* Timeout for spillover persistence, in minutes.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_sopersistencetimeout(Long sopersistencetimeout) throws Exception{
		this.sopersistencetimeout = sopersistencetimeout;
	}

	/**
	* <pre>
	* Timeout for spillover persistence, in minutes.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_sopersistencetimeout() throws Exception {
		return this.sopersistencetimeout;
	}

	/**
	* <pre>
	* Threshold in percent of active services below which vserver state is made down. If this threshold is 0, vserver state will be up even if one bound service is up.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_healththreshold(long healththreshold) throws Exception {
		this.healththreshold = new Long(healththreshold);
	}

	/**
	* <pre>
	* Threshold in percent of active services below which vserver state is made down. If this threshold is 0, vserver state will be up even if one bound service is up.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_healththreshold(Long healththreshold) throws Exception{
		this.healththreshold = healththreshold;
	}

	/**
	* <pre>
	* Threshold in percent of active services below which vserver state is made down. If this threshold is 0, vserver state will be up even if one bound service is up.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_healththreshold() throws Exception {
		return this.healththreshold;
	}

	/**
	* <pre>
	* Threshold at which spillover occurs. Specify an integer for the CONNECTION spillover method, a bandwidth value in kilobits per second for the BANDWIDTH method (do not enter the units), or a percentage for the HEALTH method (do not enter the percentage symbol).<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_sothreshold(long sothreshold) throws Exception {
		this.sothreshold = new Long(sothreshold);
	}

	/**
	* <pre>
	* Threshold at which spillover occurs. Specify an integer for the CONNECTION spillover method, a bandwidth value in kilobits per second for the BANDWIDTH method (do not enter the units), or a percentage for the HEALTH method (do not enter the percentage symbol).<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_sothreshold(Long sothreshold) throws Exception{
		this.sothreshold = sothreshold;
	}

	/**
	* <pre>
	* Threshold at which spillover occurs. Specify an integer for the CONNECTION spillover method, a bandwidth value in kilobits per second for the BANDWIDTH method (do not enter the units), or a percentage for the HEALTH method (do not enter the percentage symbol).<br> Minimum value =  1<br> Maximum value =  4294967287
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
	* Rewrite the port and change the protocol to ensure successful HTTP redirects from services.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_redirectportrewrite(String redirectportrewrite) throws Exception{
		this.redirectportrewrite = redirectportrewrite;
	}

	/**
	* <pre>
	* Rewrite the port and change the protocol to ensure successful HTTP redirects from services.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_redirectportrewrite() throws Exception {
		return this.redirectportrewrite;
	}

	/**
	* <pre>
	* Flush all active transactions associated with a virtual server whose state transitions from UP to DOWN. Do not enable this option for applications that must complete their transactions.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Flush all active transactions associated with a virtual server whose state transitions from UP to DOWN. Do not enable this option for applications that must complete their transactions.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* Name of the backup virtual server to which to forward requests if the primary virtual server goes DOWN or reaches its spillover threshold.<br> Minimum length =  1
	* </pre>
	*/
	public void set_backupvserver(String backupvserver) throws Exception{
		this.backupvserver = backupvserver;
	}

	/**
	* <pre>
	* Name of the backup virtual server to which to forward requests if the primary virtual server goes DOWN or reaches its spillover threshold.<br> Minimum length =  1
	* </pre>
	*/
	public String get_backupvserver() throws Exception {
		return this.backupvserver;
	}

	/**
	* <pre>
	* If the primary virtual server goes down, do not allow it to return to primary status until manually enabled.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_disableprimaryondown(String disableprimaryondown) throws Exception{
		this.disableprimaryondown = disableprimaryondown;
	}

	/**
	* <pre>
	* If the primary virtual server goes down, do not allow it to return to primary status until manually enabled.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_disableprimaryondown() throws Exception {
		return this.disableprimaryondown;
	}

	/**
	* <pre>
	* Insert an HTTP header, whose value is the IP address and port number of the virtual server, before forwarding a request to the server. The format of the header is <vipHeader>: <virtual server IP address>_<port number >, where vipHeader is the name that you specify for the header. If the virtual server has an IPv6 address, the address in the header is enclosed in brackets ([ and ]) to separate it from the port number. If you have mapped an IPv4 address to a virtual server's IPv6 address, the value of this parameter determines which IP address is inserted in the header, as follows:
* VIPADDR - Insert the IP address of the virtual server in the HTTP header regardless of whether the virtual server has an IPv4 address or an IPv6 address. A mapped IPv4 address, if configured, is ignored.
* V6TOV4MAPPING - Insert the IPv4 address that is mapped to the virtual server's IPv6 address. If a mapped IPv4 address is not configured, insert the IPv6 address.
* OFF - Disable header insertion.<br> Possible values = OFF, VIPADDR, V6TOV4MAPPING
	* </pre>
	*/
	public void set_insertvserveripport(String insertvserveripport) throws Exception{
		this.insertvserveripport = insertvserveripport;
	}

	/**
	* <pre>
	* Insert an HTTP header, whose value is the IP address and port number of the virtual server, before forwarding a request to the server. The format of the header is <vipHeader>: <virtual server IP address>_<port number >, where vipHeader is the name that you specify for the header. If the virtual server has an IPv6 address, the address in the header is enclosed in brackets ([ and ]) to separate it from the port number. If you have mapped an IPv4 address to a virtual server's IPv6 address, the value of this parameter determines which IP address is inserted in the header, as follows:
* VIPADDR - Insert the IP address of the virtual server in the HTTP header regardless of whether the virtual server has an IPv4 address or an IPv6 address. A mapped IPv4 address, if configured, is ignored.
* V6TOV4MAPPING - Insert the IPv4 address that is mapped to the virtual server's IPv6 address. If a mapped IPv4 address is not configured, insert the IPv6 address.
* OFF - Disable header insertion.<br> Possible values = OFF, VIPADDR, V6TOV4MAPPING
	* </pre>
	*/
	public String get_insertvserveripport() throws Exception {
		return this.insertvserveripport;
	}

	/**
	* <pre>
	* Name for the inserted header. The default name is vip-header.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vipheader(String vipheader) throws Exception{
		this.vipheader = vipheader;
	}

	/**
	* <pre>
	* Name for the inserted header. The default name is vip-header.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vipheader() throws Exception {
		return this.vipheader;
	}

	/**
	* <pre>
	* Fully qualified domain name (FQDN) of the authentication virtual server to which the user must be redirected for authentication. Make sure that the Authentication parameter is set to ENABLED.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public void set_authenticationhost(String authenticationhost) throws Exception{
		this.authenticationhost = authenticationhost;
	}

	/**
	* <pre>
	* Fully qualified domain name (FQDN) of the authentication virtual server to which the user must be redirected for authentication. Make sure that the Authentication parameter is set to ENABLED.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public String get_authenticationhost() throws Exception {
		return this.authenticationhost;
	}

	/**
	* <pre>
	* Enable or disable user authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* Enable or disable user authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* Enable or disable user authentication with HTTP 401 responses.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authn401(String authn401) throws Exception{
		this.authn401 = authn401;
	}

	/**
	* <pre>
	* Enable or disable user authentication with HTTP 401 responses.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authn401() throws Exception {
		return this.authn401;
	}

	/**
	* <pre>
	* Name of an authentication virtual server with which to authenticate users.<br> Minimum length =  1<br> Maximum length =  252
	* </pre>
	*/
	public void set_authnvsname(String authnvsname) throws Exception{
		this.authnvsname = authnvsname;
	}

	/**
	* <pre>
	* Name of an authentication virtual server with which to authenticate users.<br> Minimum length =  1<br> Maximum length =  252
	* </pre>
	*/
	public String get_authnvsname() throws Exception {
		return this.authnvsname;
	}

	/**
	* <pre>
	* Process traffic with the push virtual server that is bound to this load balancing virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_push(String push) throws Exception{
		this.push = push;
	}

	/**
	* <pre>
	* Process traffic with the push virtual server that is bound to this load balancing virtual server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_push() throws Exception {
		return this.push;
	}

	/**
	* <pre>
	* Name of the load balancing virtual server, of type PUSH or SSL_PUSH, to which the server pushes updates received on the load balancing virtual server that you are configuring.<br> Minimum length =  1
	* </pre>
	*/
	public void set_pushvserver(String pushvserver) throws Exception{
		this.pushvserver = pushvserver;
	}

	/**
	* <pre>
	* Name of the load balancing virtual server, of type PUSH or SSL_PUSH, to which the server pushes updates received on the load balancing virtual server that you are configuring.<br> Minimum length =  1
	* </pre>
	*/
	public String get_pushvserver() throws Exception {
		return this.pushvserver;
	}

	/**
	* <pre>
	* Expression for extracting a label from the server's response. Can be either an expression or the name of a named expression.<br> Default value: "none"
	* </pre>
	*/
	public void set_pushlabel(String pushlabel) throws Exception{
		this.pushlabel = pushlabel;
	}

	/**
	* <pre>
	* Expression for extracting a label from the server's response. Can be either an expression or the name of a named expression.<br> Default value: "none"
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
	* Name of the TCP profile whose settings are to be applied to the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_tcpprofilename(String tcpprofilename) throws Exception{
		this.tcpprofilename = tcpprofilename;
	}

	/**
	* <pre>
	* Name of the TCP profile whose settings are to be applied to the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_tcpprofilename() throws Exception {
		return this.tcpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile whose settings are to be applied to the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_httpprofilename(String httpprofilename) throws Exception{
		this.httpprofilename = httpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile whose settings are to be applied to the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_httpprofilename() throws Exception {
		return this.httpprofilename;
	}

	/**
	* <pre>
	* Name of the DB profile whose settings are to be applied to the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_dbprofilename(String dbprofilename) throws Exception{
		this.dbprofilename = dbprofilename;
	}

	/**
	* <pre>
	* Name of the DB profile whose settings are to be applied to the virtual server.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_dbprofilename() throws Exception {
		return this.dbprofilename;
	}

	/**
	* <pre>
	* Any comments that you might want to associate with the virtual server.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments that you might want to associate with the virtual server.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Use Layer 2 parameters (channel number, MAC address, and VLAN ID) in addition to the 4-tuple (<source IP>:<source port>::<destination IP>:<destination port>) that is used to identify a connection. Allows multiple TCP and non-TCP connections with the same 4-tuple to co-exist on the NetScaler appliance.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_l2conn(String l2conn) throws Exception{
		this.l2conn = l2conn;
	}

	/**
	* <pre>
	* Use Layer 2 parameters (channel number, MAC address, and VLAN ID) in addition to the 4-tuple (<source IP>:<source port>::<destination IP>:<destination port>) that is used to identify a connection. Allows multiple TCP and non-TCP connections with the same 4-tuple to co-exist on the NetScaler appliance.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_l2conn() throws Exception {
		return this.l2conn;
	}

	/**
	* <pre>
	* For a load balancing virtual server of type MSSQL, the Microsoft SQL Server version. Set this parameter if you expect some clients to run a version different from the version of the database. This setting provides compatibility between the client-side and server-side connections by ensuring that all communication conforms to the server's version.<br> Default value: 2008R2<br> Possible values = 70, 2000, 2000SP1, 2005, 2008, 2008R2, 2012
	* </pre>
	*/
	public void set_mssqlserverversion(String mssqlserverversion) throws Exception{
		this.mssqlserverversion = mssqlserverversion;
	}

	/**
	* <pre>
	* For a load balancing virtual server of type MSSQL, the Microsoft SQL Server version. Set this parameter if you expect some clients to run a version different from the version of the database. This setting provides compatibility between the client-side and server-side connections by ensuring that all communication conforms to the server's version.<br> Default value: 2008R2<br> Possible values = 70, 2000, 2000SP1, 2005, 2008, 2008R2, 2012
	* </pre>
	*/
	public String get_mssqlserverversion() throws Exception {
		return this.mssqlserverversion;
	}

	/**
	* <pre>
	* MySQL protocol version that the virtual server advertises to clients.
	* </pre>
	*/
	public void set_mysqlprotocolversion(long mysqlprotocolversion) throws Exception {
		this.mysqlprotocolversion = new Long(mysqlprotocolversion);
	}

	/**
	* <pre>
	* MySQL protocol version that the virtual server advertises to clients.
	* </pre>
	*/
	public void set_mysqlprotocolversion(Long mysqlprotocolversion) throws Exception{
		this.mysqlprotocolversion = mysqlprotocolversion;
	}

	/**
	* <pre>
	* MySQL protocol version that the virtual server advertises to clients.
	* </pre>
	*/
	public Long get_mysqlprotocolversion() throws Exception {
		return this.mysqlprotocolversion;
	}

	/**
	* <pre>
	* MySQL server version string that the virtual server advertises to clients.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_mysqlserverversion(String mysqlserverversion) throws Exception{
		this.mysqlserverversion = mysqlserverversion;
	}

	/**
	* <pre>
	* MySQL server version string that the virtual server advertises to clients.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_mysqlserverversion() throws Exception {
		return this.mysqlserverversion;
	}

	/**
	* <pre>
	* Character set that the virtual server advertises to clients.
	* </pre>
	*/
	public void set_mysqlcharacterset(long mysqlcharacterset) throws Exception {
		this.mysqlcharacterset = new Long(mysqlcharacterset);
	}

	/**
	* <pre>
	* Character set that the virtual server advertises to clients.
	* </pre>
	*/
	public void set_mysqlcharacterset(Long mysqlcharacterset) throws Exception{
		this.mysqlcharacterset = mysqlcharacterset;
	}

	/**
	* <pre>
	* Character set that the virtual server advertises to clients.
	* </pre>
	*/
	public Long get_mysqlcharacterset() throws Exception {
		return this.mysqlcharacterset;
	}

	/**
	* <pre>
	* Server capabilities that the virtual server advertises to clients.
	* </pre>
	*/
	public void set_mysqlservercapabilities(long mysqlservercapabilities) throws Exception {
		this.mysqlservercapabilities = new Long(mysqlservercapabilities);
	}

	/**
	* <pre>
	* Server capabilities that the virtual server advertises to clients.
	* </pre>
	*/
	public void set_mysqlservercapabilities(Long mysqlservercapabilities) throws Exception{
		this.mysqlservercapabilities = mysqlservercapabilities;
	}

	/**
	* <pre>
	* Server capabilities that the virtual server advertises to clients.
	* </pre>
	*/
	public Long get_mysqlservercapabilities() throws Exception {
		return this.mysqlservercapabilities;
	}

	/**
	* <pre>
	* Apply AppFlow logging to the virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowlog(String appflowlog) throws Exception{
		this.appflowlog = appflowlog;
	}

	/**
	* <pre>
	* Apply AppFlow logging to the virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowlog() throws Exception {
		return this.appflowlog;
	}

	/**
	* <pre>
	* Name of the network profile to associate with the virtual server. If you set this parameter, the virtual server uses only the IP addresses in the network profile as source IP addresses when initiating connections with servers.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_netprofile(String netprofile) throws Exception{
		this.netprofile = netprofile;
	}

	/**
	* <pre>
	* Name of the network profile to associate with the virtual server. If you set this parameter, the virtual server uses only the IP addresses in the network profile as source IP addresses when initiating connections with servers.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_netprofile() throws Exception {
		return this.netprofile;
	}

	/**
	* <pre>
	* How the NetScaler appliance responds to ping requests received for an IP address that is common to one or more virtual servers. Available settings function as follows:
* If set to PASSIVE on all the virtual servers that share the IP address, the appliance always responds to the ping requests.
* If set to ACTIVE on all the virtual servers that share the IP address, the appliance responds to the ping requests if at least one of the virtual servers is UP. Otherwise, the appliance does not respond.
* If set to ACTIVE on some virtual servers and PASSIVE on the others, the appliance responds if at least one virtual server with the ACTIVE setting is UP. Otherwise, the appliance does not respond.
Note: This parameter is available at the virtual server level. A similar parameter, ICMP Response, is available at the IP address level, for IPv4 addresses of type VIP. To set that parameter, use the add ip command in the CLI or the Create IP dialog box in the GUI.<br> Default value: PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public void set_icmpvsrresponse(String icmpvsrresponse) throws Exception{
		this.icmpvsrresponse = icmpvsrresponse;
	}

	/**
	* <pre>
	* How the NetScaler appliance responds to ping requests received for an IP address that is common to one or more virtual servers. Available settings function as follows:
* If set to PASSIVE on all the virtual servers that share the IP address, the appliance always responds to the ping requests.
* If set to ACTIVE on all the virtual servers that share the IP address, the appliance responds to the ping requests if at least one of the virtual servers is UP. Otherwise, the appliance does not respond.
* If set to ACTIVE on some virtual servers and PASSIVE on the others, the appliance responds if at least one virtual server with the ACTIVE setting is UP. Otherwise, the appliance does not respond.
Note: This parameter is available at the virtual server level. A similar parameter, ICMP Response, is available at the IP address level, for IPv4 addresses of type VIP. To set that parameter, use the add ip command in the CLI or the Create IP dialog box in the GUI.<br> Default value: PASSIVE<br> Possible values = PASSIVE, ACTIVE
	* </pre>
	*/
	public String get_icmpvsrresponse() throws Exception {
		return this.icmpvsrresponse;
	}

	/**
	* <pre>
	* Number of requests, or percentage of the load on existing services, by which to increase the load on a new service at each interval in slow-start mode. A value of 0 disables slow start for new services, and any services still ramping up. They immediately receive their full share of the load. If you use the CLI, be sure to set the newServiceRequestUnit parameter to specify the unit as number of requests or percentage of load.
	* </pre>
	*/
	public void set_newservicerequest(long newservicerequest) throws Exception {
		this.newservicerequest = new Long(newservicerequest);
	}

	/**
	* <pre>
	* Number of requests, or percentage of the load on existing services, by which to increase the load on a new service at each interval in slow-start mode. A value of 0 disables slow start for new services, and any services still ramping up. They immediately receive their full share of the load. If you use the CLI, be sure to set the newServiceRequestUnit parameter to specify the unit as number of requests or percentage of load.
	* </pre>
	*/
	public void set_newservicerequest(Long newservicerequest) throws Exception{
		this.newservicerequest = newservicerequest;
	}

	/**
	* <pre>
	* Number of requests, or percentage of the load on existing services, by which to increase the load on a new service at each interval in slow-start mode. A value of 0 disables slow start for new services, and any services still ramping up. They immediately receive their full share of the load. If you use the CLI, be sure to set the newServiceRequestUnit parameter to specify the unit as number of requests or percentage of load.
	* </pre>
	*/
	public Long get_newservicerequest() throws Exception {
		return this.newservicerequest;
	}

	/**
	* <pre>
	* Units in which to increment load at each interval in slow-start mode.<br> Default value: PER_SECOND<br> Possible values = PER_SECOND, PERCENT
	* </pre>
	*/
	public void set_newservicerequestunit(String newservicerequestunit) throws Exception{
		this.newservicerequestunit = newservicerequestunit;
	}

	/**
	* <pre>
	* Units in which to increment load at each interval in slow-start mode.<br> Default value: PER_SECOND<br> Possible values = PER_SECOND, PERCENT
	* </pre>
	*/
	public String get_newservicerequestunit() throws Exception {
		return this.newservicerequestunit;
	}

	/**
	* <pre>
	* Interval, in seconds, between successive increments in the load on a new service or a service whose state has just changed from DOWN to UP. A value of 0 (zero) specifies manual slow start.<br> Minimum value =  0<br> Maximum value =  3600
	* </pre>
	*/
	public void set_newservicerequestincrementinterval(long newservicerequestincrementinterval) throws Exception {
		this.newservicerequestincrementinterval = new Long(newservicerequestincrementinterval);
	}

	/**
	* <pre>
	* Interval, in seconds, between successive increments in the load on a new service or a service whose state has just changed from DOWN to UP. A value of 0 (zero) specifies manual slow start.<br> Minimum value =  0<br> Maximum value =  3600
	* </pre>
	*/
	public void set_newservicerequestincrementinterval(Long newservicerequestincrementinterval) throws Exception{
		this.newservicerequestincrementinterval = newservicerequestincrementinterval;
	}

	/**
	* <pre>
	* Interval, in seconds, between successive increments in the load on a new service or a service whose state has just changed from DOWN to UP. A value of 0 (zero) specifies manual slow start.<br> Minimum value =  0<br> Maximum value =  3600
	* </pre>
	*/
	public Long get_newservicerequestincrementinterval() throws Exception {
		return this.newservicerequestincrementinterval;
	}

	/**
	* <pre>
	* Minimum number of members expected to be present when vserver is used in Autoscale.<br> Minimum value =  0<br> Maximum value =  5000
	* </pre>
	*/
	public void set_minautoscalemembers(long minautoscalemembers) throws Exception {
		this.minautoscalemembers = new Long(minautoscalemembers);
	}

	/**
	* <pre>
	* Minimum number of members expected to be present when vserver is used in Autoscale.<br> Minimum value =  0<br> Maximum value =  5000
	* </pre>
	*/
	public void set_minautoscalemembers(Long minautoscalemembers) throws Exception{
		this.minautoscalemembers = minautoscalemembers;
	}

	/**
	* <pre>
	* Minimum number of members expected to be present when vserver is used in Autoscale.<br> Minimum value =  0<br> Maximum value =  5000
	* </pre>
	*/
	public Long get_minautoscalemembers() throws Exception {
		return this.minautoscalemembers;
	}

	/**
	* <pre>
	* Maximum number of members expected to be present when vserver is used in Autoscale.<br> Minimum value =  0<br> Maximum value =  5000
	* </pre>
	*/
	public void set_maxautoscalemembers(long maxautoscalemembers) throws Exception {
		this.maxautoscalemembers = new Long(maxautoscalemembers);
	}

	/**
	* <pre>
	* Maximum number of members expected to be present when vserver is used in Autoscale.<br> Minimum value =  0<br> Maximum value =  5000
	* </pre>
	*/
	public void set_maxautoscalemembers(Long maxautoscalemembers) throws Exception{
		this.maxautoscalemembers = maxautoscalemembers;
	}

	/**
	* <pre>
	* Maximum number of members expected to be present when vserver is used in Autoscale.<br> Minimum value =  0<br> Maximum value =  5000
	* </pre>
	*/
	public Long get_maxautoscalemembers() throws Exception {
		return this.maxautoscalemembers;
	}

	/**
	* <pre>
	* Persist AVP number for Diameter Persistency. 
            In case this AVP is not defined in Base RFC 3588 and it is nested inside a Grouped AVP, 
            define a sequence of AVP numbers (max 3) in order of parent to child. So say persist AVP number X 
            is nested inside AVP Y which is nested in Z, then define the list as  Z Y X.<br> Minimum value =  1
	* </pre>
	*/
	public void set_persistavpno(Long[] persistavpno) throws Exception{
		this.persistavpno = persistavpno;
	}

	/**
	* <pre>
	* Persist AVP number for Diameter Persistency. 
            In case this AVP is not defined in Base RFC 3588 and it is nested inside a Grouped AVP, 
            define a sequence of AVP numbers (max 3) in order of parent to child. So say persist AVP number X 
            is nested inside AVP Y which is nested in Z, then define the list as  Z Y X.<br> Minimum value =  1
	* </pre>
	*/
	public Long[] get_persistavpno() throws Exception {
		return this.persistavpno;
	}

	/**
	* <pre>
	* This argument decides the behavior incase the service which is selected from an existing persistence session has reached threshold.<br> Default value: None<br> Possible values = Bypass, ReLb, None
	* </pre>
	*/
	public void set_skippersistency(String skippersistency) throws Exception{
		this.skippersistency = skippersistency;
	}

	/**
	* <pre>
	* This argument decides the behavior incase the service which is selected from an existing persistence session has reached threshold.<br> Default value: None<br> Possible values = Bypass, ReLb, None
	* </pre>
	*/
	public String get_skippersistency() throws Exception {
		return this.skippersistency;
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
	* This option is used to retain vlan information of incoming packet when macmode is enabled.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_macmoderetainvlan(String macmoderetainvlan) throws Exception{
		this.macmoderetainvlan = macmoderetainvlan;
	}

	/**
	* <pre>
	* This option is used to retain vlan information of incoming packet when macmode is enabled.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_macmoderetainvlan() throws Exception {
		return this.macmoderetainvlan;
	}

	/**
	* <pre>
	* For enabling database specific load-balacing..<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dbslb(String dbslb) throws Exception{
		this.dbslb = dbslb;
	}

	/**
	* <pre>
	* For enabling database specific load-balacing..<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dbslb() throws Exception {
		return this.dbslb;
	}

	/**
	* <pre>
	* This argument is for enabling/disabling the dns64 on lbvserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dns64(String dns64) throws Exception{
		this.dns64 = dns64;
	}

	/**
	* <pre>
	* This argument is for enabling/disabling the dns64 on lbvserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dns64() throws Exception {
		return this.dns64;
	}

	/**
	* <pre>
	* If this option is enabled while resolving DNS64 query AAAA queries are not sent to back end dns server.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_bypassaaaa(String bypassaaaa) throws Exception{
		this.bypassaaaa = bypassaaaa;
	}

	/**
	* <pre>
	* If this option is enabled while resolving DNS64 query AAAA queries are not sent to back end dns server.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_bypassaaaa() throws Exception {
		return this.bypassaaaa;
	}

	/**
	* <pre>
	* When set to YES, this option causes the DNS replies from this vserver to have the RA bit turned on. Typically one would set this option to YES, when the vserver is load balancing a set of DNS servers thatsupport recursive queries.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_recursionavailable(String recursionavailable) throws Exception{
		this.recursionavailable = recursionavailable;
	}

	/**
	* <pre>
	* When set to YES, this option causes the DNS replies from this vserver to have the RA bit turned on. Typically one would set this option to YES, when the vserver is load balancing a set of DNS servers thatsupport recursive queries.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_recursionavailable() throws Exception {
		return this.recursionavailable;
	}

	/**
	* <pre>
	* Weight to assign to the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Weight to assign to the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Weight to assign to the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* Service to bind to the virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* Service to bind to the virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The redirect URL to be unset.
	* </pre>
	*/
	public void set_redirurlflags(boolean redirurlflags) throws Exception {
		this.redirurlflags = new Boolean(redirurlflags);
	}

	/**
	* <pre>
	* The redirect URL to be unset.
	* </pre>
	*/
	public void set_redirurlflags(Boolean redirurlflags) throws Exception{
		this.redirurlflags = redirurlflags;
	}

	/**
	* <pre>
	* The redirect URL to be unset.
	* </pre>
	*/
	public Boolean get_redirurlflags() throws Exception {
		return this.redirurlflags;
	}

	/**
	* <pre>
	* New name for the virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* SSL status.<br> Possible values = Certkey not bound, SSL feature disabled
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* The permanent mapping for the V6 Address.
	* </pre>
	*/
	public String get_ipmapping() throws Exception {
		return this.ipmapping;
	}

	/**
	* <pre>
	* Nodegroup name to which this lbvsever belongs to.
	* </pre>
	*/
	public String get_ngname() throws Exception {
		return this.ngname;
	}

	/**
	* <pre>
	* Type of LB vserver.<br> Possible values = CONTENT, ADDRESS
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Current LB vserver state.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Effective state of the LB vserver , based on the state of backup vservers.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_effectivestate() throws Exception {
		return this.effectivestate;
	}

	/**
	* <pre>
	* Current status of the lb vserver. During the initial phase if the configured lb method is not round robin , the vserver will adopt round robin to distribute traffic for a predefined number of requests.
	* </pre>
	*/
	public Integer get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* Reason why a vserver is in RR. The following are the reasons:
1  - MEP is DOWN (GSLB)
2  - LB method has changed
3  - Bound service's state changed to UP
4  - A new service is bound
5  - Startup RR factor has changed
6  - LB feature is enabled
7  - Load monitor is not active on a service
8  - Vserver is Enabled
9  - SSL feature is Enabled
10 - All bound services have reached threshold. Using effective state to load balance (GSLB)
11 - Primary state of bound services are not UP. Using effective state to load balance (GSLB)
12 - No LB decision can be made as all bound services have either reached threshold or are not UP (GSLB)
13 - All load monitors are active
.
	* </pre>
	*/
	public Integer get_lbrrreason() throws Exception {
		return this.lbrrreason;
	}

	/**
	* <pre>
	* Cache redirect type.<br> Possible values = CACHE, POLICY, ORIGIN
	* </pre>
	*/
	public String get_redirect() throws Exception {
		return this.redirect;
	}

	/**
	* <pre>
	* Precedence.<br> Possible values = RULE, URL
	* </pre>
	*/
	public String get_precedence() throws Exception {
		return this.precedence;
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
	* Name of the policy bound to the LB vserver.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Cache virtual server.
	* </pre>
	*/
	public String get_cachevserver() throws Exception {
		return this.cachevserver;
	}

	/**
	* <pre>
	* Health of vserver based on percentage of weights of active svcs/all svcs. This does not consider administratively disabled svcs.
	* </pre>
	*/
	public Long get_health() throws Exception {
		return this.health;
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
	* Rule type.
	* </pre>
	*/
	public Long get_ruletype() throws Exception {
		return this.ruletype;
	}

	/**
	* <pre>
	* LB group to which the lb vserver is to be bound.
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* Domain name to be used in the set cookie header in case of cookie persistence.
	* </pre>
	*/
	public String get_cookiedomain() throws Exception {
		return this.cookiedomain;
	}

	/**
	* <pre>
	* Map.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_map() throws Exception {
		return this.map;
	}

	/**
	* <pre>
	* Allow for greater than 2 GB transactions on this vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_gt2gb() throws Exception {
		return this.gt2gb;
	}

	/**
	* <pre>
	* Use consolidated stats for LeastConnection.<br> Default value: GLOBAL<br> Possible values = GLOBAL, NO, YES
	* </pre>
	*/
	public String get_consolidatedlconn() throws Exception {
		return this.consolidatedlconn;
	}

	/**
	* <pre>
	* Fetches Global setting.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_consolidatedlconngbl() throws Exception {
		return this.consolidatedlconngbl;
	}

	/**
	* <pre>
	* Tells whether threshold exceeded for this service participating in CUSTOMLB.
	* </pre>
	*/
	public Integer get_thresholdvalue() throws Exception {
		return this.thresholdvalue;
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
	* Invoke policies bound to a virtual server or policy label.
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
	* Cookie version.
	* </pre>
	*/
	public Integer get_version() throws Exception {
		return this.version;
	}

	/**
	* <pre>
	* Total number of services bound to the vserver.
	* </pre>
	*/
	public Long get_totalservices() throws Exception {
		return this.totalservices;
	}

	/**
	* <pre>
	* Total number of active services bound to the vserver.
	* </pre>
	*/
	public Long get_activeservices() throws Exception {
		return this.activeservices;
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
	* Time when last state change happened. Seconds part.
	* </pre>
	*/
	public Long get_statechangetimeseconds() throws Exception {
		return this.statechangetimeseconds;
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
	* This field is set to true if it is a GSLBVserver.
	* </pre>
	*/
	public Boolean get_isgslb() throws Exception {
		return this.isgslb;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbvserver_response result = (lbvserver_response) service.get_payload_formatter().string_to_resource(lbvserver_response.class, response);
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
		return result.lbvserver;
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
	* Use this API to add lbvserver.
	*/
	public static base_response add(nitro_service client, lbvserver resource) throws Exception {
		lbvserver addresource = new lbvserver();
		addresource.name = resource.name;
		addresource.servicetype = resource.servicetype;
		addresource.ipv46 = resource.ipv46;
		addresource.ippattern = resource.ippattern;
		addresource.ipmask = resource.ipmask;
		addresource.port = resource.port;
		addresource.range = resource.range;
		addresource.persistencetype = resource.persistencetype;
		addresource.timeout = resource.timeout;
		addresource.persistencebackup = resource.persistencebackup;
		addresource.backuppersistencetimeout = resource.backuppersistencetimeout;
		addresource.lbmethod = resource.lbmethod;
		addresource.hashlength = resource.hashlength;
		addresource.netmask = resource.netmask;
		addresource.v6netmasklen = resource.v6netmasklen;
		addresource.cookiename = resource.cookiename;
		addresource.rule = resource.rule;
		addresource.listenpolicy = resource.listenpolicy;
		addresource.listenpriority = resource.listenpriority;
		addresource.resrule = resource.resrule;
		addresource.persistmask = resource.persistmask;
		addresource.v6persistmasklen = resource.v6persistmasklen;
		addresource.pq = resource.pq;
		addresource.sc = resource.sc;
		addresource.rtspnat = resource.rtspnat;
		addresource.m = resource.m;
		addresource.tosid = resource.tosid;
		addresource.datalength = resource.datalength;
		addresource.dataoffset = resource.dataoffset;
		addresource.sessionless = resource.sessionless;
		addresource.state = resource.state;
		addresource.connfailover = resource.connfailover;
		addresource.redirurl = resource.redirurl;
		addresource.cacheable = resource.cacheable;
		addresource.clttimeout = resource.clttimeout;
		addresource.somethod = resource.somethod;
		addresource.sopersistence = resource.sopersistence;
		addresource.sopersistencetimeout = resource.sopersistencetimeout;
		addresource.healththreshold = resource.healththreshold;
		addresource.sothreshold = resource.sothreshold;
		addresource.sobackupaction = resource.sobackupaction;
		addresource.redirectportrewrite = resource.redirectportrewrite;
		addresource.downstateflush = resource.downstateflush;
		addresource.backupvserver = resource.backupvserver;
		addresource.disableprimaryondown = resource.disableprimaryondown;
		addresource.insertvserveripport = resource.insertvserveripport;
		addresource.vipheader = resource.vipheader;
		addresource.authenticationhost = resource.authenticationhost;
		addresource.authentication = resource.authentication;
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
		addresource.l2conn = resource.l2conn;
		addresource.mssqlserverversion = resource.mssqlserverversion;
		addresource.mysqlprotocolversion = resource.mysqlprotocolversion;
		addresource.mysqlserverversion = resource.mysqlserverversion;
		addresource.mysqlcharacterset = resource.mysqlcharacterset;
		addresource.mysqlservercapabilities = resource.mysqlservercapabilities;
		addresource.appflowlog = resource.appflowlog;
		addresource.netprofile = resource.netprofile;
		addresource.icmpvsrresponse = resource.icmpvsrresponse;
		addresource.newservicerequest = resource.newservicerequest;
		addresource.newservicerequestunit = resource.newservicerequestunit;
		addresource.newservicerequestincrementinterval = resource.newservicerequestincrementinterval;
		addresource.minautoscalemembers = resource.minautoscalemembers;
		addresource.maxautoscalemembers = resource.maxautoscalemembers;
		addresource.persistavpno = resource.persistavpno;
		addresource.skippersistency = resource.skippersistency;
		addresource.td = resource.td;
		addresource.authnprofile = resource.authnprofile;
		addresource.macmoderetainvlan = resource.macmoderetainvlan;
		addresource.dbslb = resource.dbslb;
		addresource.dns64 = resource.dns64;
		addresource.bypassaaaa = resource.bypassaaaa;
		addresource.recursionavailable = resource.recursionavailable;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add lbvserver resources.
	*/
	public static base_responses add(nitro_service client, lbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver addresources[] = new lbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new lbvserver();
				addresources[i].name = resources[i].name;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].ipv46 = resources[i].ipv46;
				addresources[i].ippattern = resources[i].ippattern;
				addresources[i].ipmask = resources[i].ipmask;
				addresources[i].port = resources[i].port;
				addresources[i].range = resources[i].range;
				addresources[i].persistencetype = resources[i].persistencetype;
				addresources[i].timeout = resources[i].timeout;
				addresources[i].persistencebackup = resources[i].persistencebackup;
				addresources[i].backuppersistencetimeout = resources[i].backuppersistencetimeout;
				addresources[i].lbmethod = resources[i].lbmethod;
				addresources[i].hashlength = resources[i].hashlength;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].v6netmasklen = resources[i].v6netmasklen;
				addresources[i].cookiename = resources[i].cookiename;
				addresources[i].rule = resources[i].rule;
				addresources[i].listenpolicy = resources[i].listenpolicy;
				addresources[i].listenpriority = resources[i].listenpriority;
				addresources[i].resrule = resources[i].resrule;
				addresources[i].persistmask = resources[i].persistmask;
				addresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				addresources[i].pq = resources[i].pq;
				addresources[i].sc = resources[i].sc;
				addresources[i].rtspnat = resources[i].rtspnat;
				addresources[i].m = resources[i].m;
				addresources[i].tosid = resources[i].tosid;
				addresources[i].datalength = resources[i].datalength;
				addresources[i].dataoffset = resources[i].dataoffset;
				addresources[i].sessionless = resources[i].sessionless;
				addresources[i].state = resources[i].state;
				addresources[i].connfailover = resources[i].connfailover;
				addresources[i].redirurl = resources[i].redirurl;
				addresources[i].cacheable = resources[i].cacheable;
				addresources[i].clttimeout = resources[i].clttimeout;
				addresources[i].somethod = resources[i].somethod;
				addresources[i].sopersistence = resources[i].sopersistence;
				addresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				addresources[i].healththreshold = resources[i].healththreshold;
				addresources[i].sothreshold = resources[i].sothreshold;
				addresources[i].sobackupaction = resources[i].sobackupaction;
				addresources[i].redirectportrewrite = resources[i].redirectportrewrite;
				addresources[i].downstateflush = resources[i].downstateflush;
				addresources[i].backupvserver = resources[i].backupvserver;
				addresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				addresources[i].insertvserveripport = resources[i].insertvserveripport;
				addresources[i].vipheader = resources[i].vipheader;
				addresources[i].authenticationhost = resources[i].authenticationhost;
				addresources[i].authentication = resources[i].authentication;
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
				addresources[i].l2conn = resources[i].l2conn;
				addresources[i].mssqlserverversion = resources[i].mssqlserverversion;
				addresources[i].mysqlprotocolversion = resources[i].mysqlprotocolversion;
				addresources[i].mysqlserverversion = resources[i].mysqlserverversion;
				addresources[i].mysqlcharacterset = resources[i].mysqlcharacterset;
				addresources[i].mysqlservercapabilities = resources[i].mysqlservercapabilities;
				addresources[i].appflowlog = resources[i].appflowlog;
				addresources[i].netprofile = resources[i].netprofile;
				addresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
				addresources[i].newservicerequest = resources[i].newservicerequest;
				addresources[i].newservicerequestunit = resources[i].newservicerequestunit;
				addresources[i].newservicerequestincrementinterval = resources[i].newservicerequestincrementinterval;
				addresources[i].minautoscalemembers = resources[i].minautoscalemembers;
				addresources[i].maxautoscalemembers = resources[i].maxautoscalemembers;
				addresources[i].persistavpno = resources[i].persistavpno;
				addresources[i].skippersistency = resources[i].skippersistency;
				addresources[i].td = resources[i].td;
				addresources[i].authnprofile = resources[i].authnprofile;
				addresources[i].macmoderetainvlan = resources[i].macmoderetainvlan;
				addresources[i].dbslb = resources[i].dbslb;
				addresources[i].dns64 = resources[i].dns64;
				addresources[i].bypassaaaa = resources[i].bypassaaaa;
				addresources[i].recursionavailable = resources[i].recursionavailable;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbvserver of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		lbvserver deleteresource = new lbvserver();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbvserver.
	*/
	public static base_response delete(nitro_service client, lbvserver resource) throws Exception {
		lbvserver deleteresource = new lbvserver();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbvserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			lbvserver deleteresources[] = new lbvserver[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new lbvserver();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbvserver resources.
	*/
	public static base_responses delete(nitro_service client, lbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver deleteresources[] = new lbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbvserver();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update lbvserver.
	*/
	public static base_response update(nitro_service client, lbvserver resource) throws Exception {
		lbvserver updateresource = new lbvserver();
		updateresource.name = resource.name;
		updateresource.ipv46 = resource.ipv46;
		updateresource.ippattern = resource.ippattern;
		updateresource.ipmask = resource.ipmask;
		updateresource.weight = resource.weight;
		updateresource.servicename = resource.servicename;
		updateresource.persistencetype = resource.persistencetype;
		updateresource.timeout = resource.timeout;
		updateresource.persistencebackup = resource.persistencebackup;
		updateresource.backuppersistencetimeout = resource.backuppersistencetimeout;
		updateresource.lbmethod = resource.lbmethod;
		updateresource.hashlength = resource.hashlength;
		updateresource.netmask = resource.netmask;
		updateresource.v6netmasklen = resource.v6netmasklen;
		updateresource.rule = resource.rule;
		updateresource.cookiename = resource.cookiename;
		updateresource.resrule = resource.resrule;
		updateresource.persistmask = resource.persistmask;
		updateresource.v6persistmasklen = resource.v6persistmasklen;
		updateresource.pq = resource.pq;
		updateresource.sc = resource.sc;
		updateresource.rtspnat = resource.rtspnat;
		updateresource.m = resource.m;
		updateresource.tosid = resource.tosid;
		updateresource.datalength = resource.datalength;
		updateresource.dataoffset = resource.dataoffset;
		updateresource.sessionless = resource.sessionless;
		updateresource.connfailover = resource.connfailover;
		updateresource.backupvserver = resource.backupvserver;
		updateresource.redirurl = resource.redirurl;
		updateresource.cacheable = resource.cacheable;
		updateresource.clttimeout = resource.clttimeout;
		updateresource.somethod = resource.somethod;
		updateresource.sothreshold = resource.sothreshold;
		updateresource.sopersistence = resource.sopersistence;
		updateresource.sopersistencetimeout = resource.sopersistencetimeout;
		updateresource.healththreshold = resource.healththreshold;
		updateresource.sobackupaction = resource.sobackupaction;
		updateresource.redirectportrewrite = resource.redirectportrewrite;
		updateresource.downstateflush = resource.downstateflush;
		updateresource.insertvserveripport = resource.insertvserveripport;
		updateresource.vipheader = resource.vipheader;
		updateresource.disableprimaryondown = resource.disableprimaryondown;
		updateresource.authenticationhost = resource.authenticationhost;
		updateresource.authentication = resource.authentication;
		updateresource.authn401 = resource.authn401;
		updateresource.authnvsname = resource.authnvsname;
		updateresource.push = resource.push;
		updateresource.pushvserver = resource.pushvserver;
		updateresource.pushlabel = resource.pushlabel;
		updateresource.pushmulticlients = resource.pushmulticlients;
		updateresource.listenpolicy = resource.listenpolicy;
		updateresource.listenpriority = resource.listenpriority;
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
		updateresource.icmpvsrresponse = resource.icmpvsrresponse;
		updateresource.newservicerequest = resource.newservicerequest;
		updateresource.newservicerequestunit = resource.newservicerequestunit;
		updateresource.newservicerequestincrementinterval = resource.newservicerequestincrementinterval;
		updateresource.minautoscalemembers = resource.minautoscalemembers;
		updateresource.maxautoscalemembers = resource.maxautoscalemembers;
		updateresource.persistavpno = resource.persistavpno;
		updateresource.skippersistency = resource.skippersistency;
		updateresource.authnprofile = resource.authnprofile;
		updateresource.macmoderetainvlan = resource.macmoderetainvlan;
		updateresource.dbslb = resource.dbslb;
		updateresource.dns64 = resource.dns64;
		updateresource.bypassaaaa = resource.bypassaaaa;
		updateresource.recursionavailable = resource.recursionavailable;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update lbvserver resources.
	*/
	public static base_responses update(nitro_service client, lbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver updateresources[] = new lbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbvserver();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipv46 = resources[i].ipv46;
				updateresources[i].ippattern = resources[i].ippattern;
				updateresources[i].ipmask = resources[i].ipmask;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].persistencetype = resources[i].persistencetype;
				updateresources[i].timeout = resources[i].timeout;
				updateresources[i].persistencebackup = resources[i].persistencebackup;
				updateresources[i].backuppersistencetimeout = resources[i].backuppersistencetimeout;
				updateresources[i].lbmethod = resources[i].lbmethod;
				updateresources[i].hashlength = resources[i].hashlength;
				updateresources[i].netmask = resources[i].netmask;
				updateresources[i].v6netmasklen = resources[i].v6netmasklen;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].cookiename = resources[i].cookiename;
				updateresources[i].resrule = resources[i].resrule;
				updateresources[i].persistmask = resources[i].persistmask;
				updateresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				updateresources[i].pq = resources[i].pq;
				updateresources[i].sc = resources[i].sc;
				updateresources[i].rtspnat = resources[i].rtspnat;
				updateresources[i].m = resources[i].m;
				updateresources[i].tosid = resources[i].tosid;
				updateresources[i].datalength = resources[i].datalength;
				updateresources[i].dataoffset = resources[i].dataoffset;
				updateresources[i].sessionless = resources[i].sessionless;
				updateresources[i].connfailover = resources[i].connfailover;
				updateresources[i].backupvserver = resources[i].backupvserver;
				updateresources[i].redirurl = resources[i].redirurl;
				updateresources[i].cacheable = resources[i].cacheable;
				updateresources[i].clttimeout = resources[i].clttimeout;
				updateresources[i].somethod = resources[i].somethod;
				updateresources[i].sothreshold = resources[i].sothreshold;
				updateresources[i].sopersistence = resources[i].sopersistence;
				updateresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				updateresources[i].healththreshold = resources[i].healththreshold;
				updateresources[i].sobackupaction = resources[i].sobackupaction;
				updateresources[i].redirectportrewrite = resources[i].redirectportrewrite;
				updateresources[i].downstateflush = resources[i].downstateflush;
				updateresources[i].insertvserveripport = resources[i].insertvserveripport;
				updateresources[i].vipheader = resources[i].vipheader;
				updateresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				updateresources[i].authenticationhost = resources[i].authenticationhost;
				updateresources[i].authentication = resources[i].authentication;
				updateresources[i].authn401 = resources[i].authn401;
				updateresources[i].authnvsname = resources[i].authnvsname;
				updateresources[i].push = resources[i].push;
				updateresources[i].pushvserver = resources[i].pushvserver;
				updateresources[i].pushlabel = resources[i].pushlabel;
				updateresources[i].pushmulticlients = resources[i].pushmulticlients;
				updateresources[i].listenpolicy = resources[i].listenpolicy;
				updateresources[i].listenpriority = resources[i].listenpriority;
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
				updateresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
				updateresources[i].newservicerequest = resources[i].newservicerequest;
				updateresources[i].newservicerequestunit = resources[i].newservicerequestunit;
				updateresources[i].newservicerequestincrementinterval = resources[i].newservicerequestincrementinterval;
				updateresources[i].minautoscalemembers = resources[i].minautoscalemembers;
				updateresources[i].maxautoscalemembers = resources[i].maxautoscalemembers;
				updateresources[i].persistavpno = resources[i].persistavpno;
				updateresources[i].skippersistency = resources[i].skippersistency;
				updateresources[i].authnprofile = resources[i].authnprofile;
				updateresources[i].macmoderetainvlan = resources[i].macmoderetainvlan;
				updateresources[i].dbslb = resources[i].dbslb;
				updateresources[i].dns64 = resources[i].dns64;
				updateresources[i].bypassaaaa = resources[i].bypassaaaa;
				updateresources[i].recursionavailable = resources[i].recursionavailable;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, lbvserver resource, String[] args) throws Exception{
		lbvserver unsetresource = new lbvserver();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of lbvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			lbvserver unsetresources[] = new lbvserver[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new lbvserver();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, lbvserver resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver unsetresources[] = new lbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new lbvserver();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable lbvserver of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		lbvserver enableresource = new lbvserver();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable lbvserver.
	*/
	public static base_response enable(nitro_service client, lbvserver resource) throws Exception {
		lbvserver enableresource = new lbvserver();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable lbvserver resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			lbvserver enableresources[] = new lbvserver[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new lbvserver();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable lbvserver resources.
	*/
	public static base_responses enable(nitro_service client, lbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver enableresources[] = new lbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new lbvserver();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable lbvserver of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		lbvserver disableresource = new lbvserver();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable lbvserver.
	*/
	public static base_response disable(nitro_service client, lbvserver resource) throws Exception {
		lbvserver disableresource = new lbvserver();
		disableresource.name = resource.name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable lbvserver resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			lbvserver disableresources[] = new lbvserver[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new lbvserver();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable lbvserver resources.
	*/
	public static base_responses disable(nitro_service client, lbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver disableresources[] = new lbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new lbvserver();
				disableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a lbvserver resource.
	*/
	public static base_response rename(nitro_service client, lbvserver resource, String new_name) throws Exception {
		lbvserver renameresource = new lbvserver();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a lbvserver resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		lbvserver renameresource = new lbvserver();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the lbvserver resources that are configured on netscaler.
	*/
	public static lbvserver[] get(nitro_service service) throws Exception{
		lbvserver obj = new lbvserver();
		lbvserver[] response = (lbvserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lbvserver resources that are configured on netscaler.
	*/
	public static lbvserver[] get(nitro_service service, options option) throws Exception{
		lbvserver obj = new lbvserver();
		lbvserver[] response = (lbvserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch lbvserver resource of given name .
	*/
	public static lbvserver get(nitro_service service, String name) throws Exception{
		lbvserver obj = new lbvserver();
		obj.set_name(name);
		lbvserver response = (lbvserver) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbvserver resources of given names .
	*/
	public static lbvserver[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			lbvserver response[] = new lbvserver[name.length];
			lbvserver obj[] = new lbvserver[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new lbvserver();
				obj[i].set_name(name[i]);
				response[i] = (lbvserver) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of lbvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbvserver[] get_filtered(nitro_service service, String filter) throws Exception{
		lbvserver obj = new lbvserver();
		options option = new options();
		option.set_filter(filter);
		lbvserver[] response = (lbvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbvserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbvserver obj = new lbvserver();
		options option = new options();
		option.set_filter(filter);
		lbvserver[] response = (lbvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbvserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lbvserver obj = new lbvserver();
		options option = new options();
		option.set_count(true);
		lbvserver[] response = (lbvserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lbvserver obj = new lbvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver[] response = (lbvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbvserver obj = new lbvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver[] response = (lbvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class scEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class pqEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class macmoderetainvlanEnum {
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
	public static class mapEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class skippersistencyEnum {
		public static final String Bypass = "Bypass";
		public static final String ReLb = "ReLb";
		public static final String None = "None";
	}
	public static class dbslbEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class newservicerequestunitEnum {
		public static final String PER_SECOND = "PER_SECOND";
		public static final String PERCENT = "PERCENT";
	}
	public static class downstateflushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class servicetypeEnum {
		public static final String HTTP = "HTTP";
		public static final String FTP = "FTP";
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
		public static final String SSL = "SSL";
		public static final String SSL_BRIDGE = "SSL_BRIDGE";
		public static final String SSL_TCP = "SSL_TCP";
		public static final String DTLS = "DTLS";
		public static final String NNTP = "NNTP";
		public static final String DNS = "DNS";
		public static final String DHCPRA = "DHCPRA";
		public static final String ANY = "ANY";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String DNS_TCP = "DNS_TCP";
		public static final String RTSP = "RTSP";
		public static final String PUSH = "PUSH";
		public static final String SSL_PUSH = "SSL_PUSH";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
		public static final String TFTP = "TFTP";
	}
	public static class icmpvsrresponseEnum {
		public static final String PASSIVE = "PASSIVE";
		public static final String ACTIVE = "ACTIVE";
	}
	public static class sessionlessEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class valueEnum {
		public static final String Certkey_not_bound = "Certkey not bound";
		public static final String SSL_feature_disabled = "SSL feature disabled";
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
	public static class pushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String CONTENT = "CONTENT";
		public static final String ADDRESS = "ADDRESS";
	}
	public static class disableprimaryondownEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class rtspnatEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class authn401Enum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class cacheableEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
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
	public static class consolidatedlconnEnum {
		public static final String GLOBAL = "GLOBAL";
		public static final String NO = "NO";
		public static final String YES = "YES";
	}
	public static class sopersistenceEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class lbmethodEnum {
		public static final String ROUNDROBIN = "ROUNDROBIN";
		public static final String LEASTCONNECTION = "LEASTCONNECTION";
		public static final String LEASTRESPONSETIME = "LEASTRESPONSETIME";
		public static final String URLHASH = "URLHASH";
		public static final String DOMAINHASH = "DOMAINHASH";
		public static final String DESTINATIONIPHASH = "DESTINATIONIPHASH";
		public static final String SOURCEIPHASH = "SOURCEIPHASH";
		public static final String SRCIPDESTIPHASH = "SRCIPDESTIPHASH";
		public static final String LEASTBANDWIDTH = "LEASTBANDWIDTH";
		public static final String LEASTPACKETS = "LEASTPACKETS";
		public static final String TOKEN = "TOKEN";
		public static final String SRCIPSRCPORTHASH = "SRCIPSRCPORTHASH";
		public static final String LRTM = "LRTM";
		public static final String CALLIDHASH = "CALLIDHASH";
		public static final String CUSTOMLOAD = "CUSTOMLOAD";
		public static final String LEASTREQUEST = "LEASTREQUEST";
	}
	public static class consolidatedlconngblEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class redirectEnum {
		public static final String CACHE = "CACHE";
		public static final String POLICY = "POLICY";
		public static final String ORIGIN = "ORIGIN";
	}
	public static class effectivestateEnum {
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
	public static class bypassaaaaEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class connfailoverEnum {
		public static final String DISABLED = "DISABLED";
		public static final String STATEFUL = "STATEFUL";
		public static final String STATELESS = "STATELESS";
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
	public static class persistencebackupEnum {
		public static final String SOURCEIP = "SOURCEIP";
		public static final String NONE = "NONE";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mEnum {
		public static final String IP = "IP";
		public static final String MAC = "MAC";
		public static final String IPTUNNEL = "IPTUNNEL";
		public static final String TOS = "TOS";
	}
	public static class precedenceEnum {
		public static final String RULE = "RULE";
		public static final String URL = "URL";
	}
	public static class dns64Enum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
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
	public static class persistencetypeEnum {
		public static final String SOURCEIP = "SOURCEIP";
		public static final String COOKIEINSERT = "COOKIEINSERT";
		public static final String SSLSESSION = "SSLSESSION";
		public static final String RULE = "RULE";
		public static final String URLPASSIVE = "URLPASSIVE";
		public static final String CUSTOMSERVERID = "CUSTOMSERVERID";
		public static final String DESTIP = "DESTIP";
		public static final String SRCIPDESTIP = "SRCIPDESTIP";
		public static final String CALLID = "CALLID";
		public static final String RTSPSID = "RTSPSID";
		public static final String DIAMETER = "DIAMETER";
		public static final String NONE = "NONE";
	}
	public static class insertvserveripportEnum {
		public static final String OFF = "OFF";
		public static final String VIPADDR = "VIPADDR";
		public static final String V6TOV4MAPPING = "V6TOV4MAPPING";
	}
	public static class recursionavailableEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
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
}
