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
	private Long ownernode;
	private Long backupnode;
	private Long backuppersistencetimeout;
	private String lbmethod;
	private Long hashlength;
	private String netmask;
	private Long v6netmasklen;
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
	private Long sothreshold;
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
	private String aaa_tm_kbr_domain;
	private String realm;
	private String push;
	private String pushvserver;
	private String pushlabel;
	private String pushmulticlients;
	private String tcpprofilename;
	private String httpprofilename;
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
	private Long weight;
	private String servicename;
	private Boolean redirurlflags;
	private String newname;

	//------- Read only Parameter ---------;

	private String value;
	private String ip;
	private String ipmapping;
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
	* The name of the load balancing virtual server being added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the load balancing virtual server being added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The service type.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, DNS, DHCPRA, ANY, SIP_UDP, DNS_TCP, RTSP, PUSH, SSL_PUSH, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* The service type.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, DNS, DHCPRA, ANY, SIP_UDP, DNS_TCP, RTSP, PUSH, SSL_PUSH, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* The IP address of the virtual server.
	* </pre>
	*/
	public void set_ipv46(String ipv46) throws Exception{
		this.ipv46 = ipv46;
	}

	/**
	* <pre>
	* The IP address of the virtual server.
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* The IP Pattern of the virtual server.
	* </pre>
	*/
	public void set_ippattern(String ippattern) throws Exception{
		this.ippattern = ippattern;
	}

	/**
	* <pre>
	* The IP Pattern of the virtual server.
	* </pre>
	*/
	public String get_ippattern() throws Exception {
		return this.ippattern;
	}

	/**
	* <pre>
	* The IP Mask of the virtual server IP Pattern.
	* </pre>
	*/
	public void set_ipmask(String ipmask) throws Exception{
		this.ipmask = ipmask;
	}

	/**
	* <pre>
	* The IP Mask of the virtual server IP Pattern.
	* </pre>
	*/
	public String get_ipmask() throws Exception {
		return this.ipmask;
	}

	/**
	* <pre>
	* A port number for the virtual server.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* A port number for the virtual server.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* A port number for the virtual server.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The IP range for the network vserver.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(long range) throws Exception {
		this.range = new Long(range);
	}

	/**
	* <pre>
	* The IP range for the network vserver.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public void set_range(Long range) throws Exception{
		this.range = range;
	}

	/**
	* <pre>
	* The IP range for the network vserver.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  254
	* </pre>
	*/
	public Long get_range() throws Exception {
		return this.range;
	}

	/**
	* <pre>
	* Persistence type for the virtual server.
Note:
The <persistenceType> parameter can take one of the following options:
	SOURCEIP - When configured, the system selects a physical service based on the Load Balancing method, and then directs all the subsequent requests arriving from the same IP as the first request to the same physical service.
	COOKIEINSERT - When configured, the system inserts an HTTP cookie into the client responses. The cookie is inserted into the "Cookie" header field of the HTTP response. The client stores the cookie (if enabled) and includes it in all the subsequent requests, which then match the cookie criteria. The cookie contains information about the service where the requests have to be sent.
	SSLSESSION ID - When configured, the system creates a persistence that is session based on the arriving SSL Session ID, which is part of the SSL handshake process. All requests with the same SSL session ID are directed to the initially selected physical service.
	CUSTOM SERVER ID -This mode of Persistence requires the server to provide its Server-ID in such a way that it can be extracted from subsequent requests. The system extracts the Server-ID from subsequent client requests and uses it to select a server. The server embeds the Server-ID into the URL query of the HTML links, accessible from the initial page that has to generate persistent HTTP requests.
	RULE - When configured, the system maintains persistence based on the contents of the matched rule. This persistence requires an expression to be configured. The expression is created using the add expression CLI command and is configured on a virtual server, using the -rule option of the add lb vserver or set lb vserver CLI command.After successful evaluation of the expression, a persistence session is created and all subsequent matching client requests are directed to the previously selected server.
	URLPASSIVE - This mode of Persistence requires the server to provide its Server-ID in such a way that it can be extracted from subsequent requests.The system extracts the Server-ID from subsequent client requests and uses it to select a server. The servers which require persistence, embed the Server-ID into the URL query of the HTML links, accessible from the initial page. The Server-ID is its IP address and port specified as a hexadecimal number.URL Passive persistence type requires an expression to be configured that specifies the location of the Server-ID in the client's requests. The expression is created using the CLI command add expression. This expression is configured on a virtual server, using option -rule of the add lb vserver or set lb vserver CLI command.
	DESTIP -When configured, the system selects a physical service based on the Load Balancing method, and then directs all the subsequent requests with the same destination as the first packet to the same physical service. This will be used in LLB deployment scenarios.
	SRCIPDESTIP - When configured, the system selects a physical service based on the Load Balancing method, and then directs all the subsequent requests with the same Source IP and Destination IP as the first packet to the same physical service. This will be used in IDS LB depolyments.
	CALLID - When configured, the system maintains persistence based on CALLID used in the SIP transactions. All the SIP transactions with same CALLID are directed to the same server.
	RTSPSID - When configured, the system maintains persistence based on RTSP sessionID provided by the server. The client also sends the same RTSP sessionID in the subsequent requests which are then directed to the same server.
	DIAMETER - When configured, the system mantains persistence based on an AVP code value found in Diameter Message. This persistence requires an AVP code to be configured as persist AVP code. This persist Avp Code is configured in cli using using option -persistAVPno. After successfully finding persist AVP code in diameter request, a persistence session is created with AVP contents and all subsequent matching Diameter messages are directed to the previously selected server.<br> Possible values = SOURCEIP, COOKIEINSERT, SSLSESSION, RULE, URLPASSIVE, CUSTOMSERVERID, DESTIP, SRCIPDESTIP, CALLID, RTSPSID, DIAMETER, NONE
	* </pre>
	*/
	public void set_persistencetype(String persistencetype) throws Exception{
		this.persistencetype = persistencetype;
	}

	/**
	* <pre>
	* Persistence type for the virtual server.
Note:
The <persistenceType> parameter can take one of the following options:
	SOURCEIP - When configured, the system selects a physical service based on the Load Balancing method, and then directs all the subsequent requests arriving from the same IP as the first request to the same physical service.
	COOKIEINSERT - When configured, the system inserts an HTTP cookie into the client responses. The cookie is inserted into the "Cookie" header field of the HTTP response. The client stores the cookie (if enabled) and includes it in all the subsequent requests, which then match the cookie criteria. The cookie contains information about the service where the requests have to be sent.
	SSLSESSION ID - When configured, the system creates a persistence that is session based on the arriving SSL Session ID, which is part of the SSL handshake process. All requests with the same SSL session ID are directed to the initially selected physical service.
	CUSTOM SERVER ID -This mode of Persistence requires the server to provide its Server-ID in such a way that it can be extracted from subsequent requests. The system extracts the Server-ID from subsequent client requests and uses it to select a server. The server embeds the Server-ID into the URL query of the HTML links, accessible from the initial page that has to generate persistent HTTP requests.
	RULE - When configured, the system maintains persistence based on the contents of the matched rule. This persistence requires an expression to be configured. The expression is created using the add expression CLI command and is configured on a virtual server, using the -rule option of the add lb vserver or set lb vserver CLI command.After successful evaluation of the expression, a persistence session is created and all subsequent matching client requests are directed to the previously selected server.
	URLPASSIVE - This mode of Persistence requires the server to provide its Server-ID in such a way that it can be extracted from subsequent requests.The system extracts the Server-ID from subsequent client requests and uses it to select a server. The servers which require persistence, embed the Server-ID into the URL query of the HTML links, accessible from the initial page. The Server-ID is its IP address and port specified as a hexadecimal number.URL Passive persistence type requires an expression to be configured that specifies the location of the Server-ID in the client's requests. The expression is created using the CLI command add expression. This expression is configured on a virtual server, using option -rule of the add lb vserver or set lb vserver CLI command.
	DESTIP -When configured, the system selects a physical service based on the Load Balancing method, and then directs all the subsequent requests with the same destination as the first packet to the same physical service. This will be used in LLB deployment scenarios.
	SRCIPDESTIP - When configured, the system selects a physical service based on the Load Balancing method, and then directs all the subsequent requests with the same Source IP and Destination IP as the first packet to the same physical service. This will be used in IDS LB depolyments.
	CALLID - When configured, the system maintains persistence based on CALLID used in the SIP transactions. All the SIP transactions with same CALLID are directed to the same server.
	RTSPSID - When configured, the system maintains persistence based on RTSP sessionID provided by the server. The client also sends the same RTSP sessionID in the subsequent requests which are then directed to the same server.
	DIAMETER - When configured, the system mantains persistence based on an AVP code value found in Diameter Message. This persistence requires an AVP code to be configured as persist AVP code. This persist Avp Code is configured in cli using using option -persistAVPno. After successfully finding persist AVP code in diameter request, a persistence session is created with AVP contents and all subsequent matching Diameter messages are directed to the previously selected server.<br> Possible values = SOURCEIP, COOKIEINSERT, SSLSESSION, RULE, URLPASSIVE, CUSTOMSERVERID, DESTIP, SRCIPDESTIP, CALLID, RTSPSID, DIAMETER, NONE
	* </pre>
	*/
	public String get_persistencetype() throws Exception {
		return this.persistencetype;
	}

	/**
	* <pre>
	* The time period for which the persistence is in effect for a specific client. The value ranges from 2 to 1440 minutes.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* The time period for which the persistence is in effect for a specific client. The value ranges from 2 to 1440 minutes.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* The time period for which the persistence is in effect for a specific client. The value ranges from 2 to 1440 minutes.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* Use this parameter to specify a backup persistence type for the virtual server.
The Backup persistence option is used when the primary configured persistence mechanism on virtual server fails.
The <persistenceBacup> parameter can take one of the following options:
    SOURCEIP
    NONE.<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public void set_persistencebackup(String persistencebackup) throws Exception{
		this.persistencebackup = persistencebackup;
	}

	/**
	* <pre>
	* Use this parameter to specify a backup persistence type for the virtual server.
The Backup persistence option is used when the primary configured persistence mechanism on virtual server fails.
The <persistenceBacup> parameter can take one of the following options:
    SOURCEIP
    NONE.<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public String get_persistencebackup() throws Exception {
		return this.persistencebackup;
	}

	/**
	* <pre>
	* The owner node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_ownernode(long ownernode) throws Exception {
		this.ownernode = new Long(ownernode);
	}

	/**
	* <pre>
	* The owner node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_ownernode(Long ownernode) throws Exception{
		this.ownernode = ownernode;
	}

	/**
	* <pre>
	* The owner node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_ownernode() throws Exception {
		return this.ownernode;
	}

	/**
	* <pre>
	* The backup node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_backupnode(long backupnode) throws Exception {
		this.backupnode = new Long(backupnode);
	}

	/**
	* <pre>
	* The backup node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_backupnode(Long backupnode) throws Exception{
		this.backupnode = backupnode;
	}

	/**
	* <pre>
	* The backup node.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_backupnode() throws Exception {
		return this.backupnode;
	}

	/**
	* <pre>
	* The maximum time backup persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backuppersistencetimeout(long backuppersistencetimeout) throws Exception {
		this.backuppersistencetimeout = new Long(backuppersistencetimeout);
	}

	/**
	* <pre>
	* The maximum time backup persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backuppersistencetimeout(Long backuppersistencetimeout) throws Exception{
		this.backuppersistencetimeout = backuppersistencetimeout;
	}

	/**
	* <pre>
	* The maximum time backup persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_backuppersistencetimeout() throws Exception {
		return this.backuppersistencetimeout;
	}

	/**
	* <pre>
	* The load balancing method for the virtual server. The valid options for this parameter are:
ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, URLHASH, DOMAINHASH, DESTINATIONIPHASH, SOURCEIPHASH, SRCIPDESTIPHASH,LEASTBANDWIDTH, LEASTPACKETS, TOKEN, SRCIPDESTIPHASH, CUSTOMLOAD, SRCIPSRCPORTHASH, LRTM, CALLIDHASSH.
When the load balancing policy is configured as:
	ROUNDROBIN - When configured, the system distributes incoming requests to each server in rotation, regardless of the load. When different weights are assigned to services then weighted round robin occurs and requests go to services according to how much weighting has been set.
	LEASTCONNECTION (default value)- When configured, the system selects the service that has the least number of connections. For TCP, HTTP, HTTPS and SSL_TCP services the least number of connections includes:
	Established, active connections to a service. Connection reuse applies to HTTP and HTTPS. Hence the count includes only those connections which have outstanding HTTP or HTTPS requests, and does not include inactive, reusable connections.
	Connections to a service waiting in the Surge Queue, which exists only if the Surge Protection feature is enabled.
For UDP services the least number of connections includes:
	The number of sessions between client and a physical service. These sessions are the logical, time-based entities, created on first arriving UDP packet. If configured, weights are taken into account when server selection is performed.
	LEASTRESPONSETIME - When configured, the system selects the service with the minimum average response time. The response time is the time interval taken when a request is sent to a service and first response packet comes back from the service, that is Time to First Byte (TTFB).
	URLHASH - The system selects the service based on the hashed value of the incoming URL.To specify the number of bytes of the URL that is used to calculate the hash value use the optional argument [-hashLength <positive_integer>] in either the add lb vserver or set lb vserver CLI command. The default value is 80.
	DOMAINHASH - When configured with this load balancing method, the system selects the service based on the hashed value of the domain name in the HTTP request. The domain name is taken either from the incoming URL or from the Host header of the HTTP request.
Note:	The system defaults to LEASTCONNECTION if the request does not contain a domain name.
If the domain name appears in both the URL and the host header, the system gives preference to the URL domain.

	DESTINATIONIPHASH - The system selects the service based on the hashed value of the destination IP address in the TCP IP header.
	SOURCEIPHASH - The system selects the service based on the hashed value of the client's IP address in the IP header.
	LEASTBANDWIDTH - The system selects the service that is currently serving the least traffic, measured in megabits per second.
	LEASTPACKETS - The system selects the service that is currently serving the lowest number of packets per second.
	Token -The system selects the service based on the value, calculated from a token, extracted from the client's request (location and size of the token is configurable or by evaluating the rule configured). For subsequent requests with the same token, the systems will select the same physical server.
	SRCIPDESTIPHASH - The system selects the service based on the hashed value of the client's SOURCE IP and DESTINATION IP address in the TCP IP header.
 	CUSTOMLOAD - The system selects the service based on the it load which was determined by the LOAD monitors bound to the service.
	SRCIPSRCPORTHASH - The system selects the service based on the hashed value of the client's SOURCE IP and SOURCE PORT in the TCP/UDP+IP header.
	LRTM - When configured, the system selects the service with least response time learned through probing(number of active connections taken into account in addition to the response time).
	CALLIDHASSH - The system selects the service based on the hashed value of SIP callid.<br> Default value: PEMGMT_LB_LEASTCONNS<br> Possible values = ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, URLHASH, DOMAINHASH, DESTINATIONIPHASH, SOURCEIPHASH, SRCIPDESTIPHASH, LEASTBANDWIDTH, LEASTPACKETS, TOKEN, SRCIPSRCPORTHASH, LRTM, CALLIDHASH, CUSTOMLOAD
	* </pre>
	*/
	public void set_lbmethod(String lbmethod) throws Exception{
		this.lbmethod = lbmethod;
	}

	/**
	* <pre>
	* The load balancing method for the virtual server. The valid options for this parameter are:
ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, URLHASH, DOMAINHASH, DESTINATIONIPHASH, SOURCEIPHASH, SRCIPDESTIPHASH,LEASTBANDWIDTH, LEASTPACKETS, TOKEN, SRCIPDESTIPHASH, CUSTOMLOAD, SRCIPSRCPORTHASH, LRTM, CALLIDHASSH.
When the load balancing policy is configured as:
	ROUNDROBIN - When configured, the system distributes incoming requests to each server in rotation, regardless of the load. When different weights are assigned to services then weighted round robin occurs and requests go to services according to how much weighting has been set.
	LEASTCONNECTION (default value)- When configured, the system selects the service that has the least number of connections. For TCP, HTTP, HTTPS and SSL_TCP services the least number of connections includes:
	Established, active connections to a service. Connection reuse applies to HTTP and HTTPS. Hence the count includes only those connections which have outstanding HTTP or HTTPS requests, and does not include inactive, reusable connections.
	Connections to a service waiting in the Surge Queue, which exists only if the Surge Protection feature is enabled.
For UDP services the least number of connections includes:
	The number of sessions between client and a physical service. These sessions are the logical, time-based entities, created on first arriving UDP packet. If configured, weights are taken into account when server selection is performed.
	LEASTRESPONSETIME - When configured, the system selects the service with the minimum average response time. The response time is the time interval taken when a request is sent to a service and first response packet comes back from the service, that is Time to First Byte (TTFB).
	URLHASH - The system selects the service based on the hashed value of the incoming URL.To specify the number of bytes of the URL that is used to calculate the hash value use the optional argument [-hashLength <positive_integer>] in either the add lb vserver or set lb vserver CLI command. The default value is 80.
	DOMAINHASH - When configured with this load balancing method, the system selects the service based on the hashed value of the domain name in the HTTP request. The domain name is taken either from the incoming URL or from the Host header of the HTTP request.
Note:	The system defaults to LEASTCONNECTION if the request does not contain a domain name.
If the domain name appears in both the URL and the host header, the system gives preference to the URL domain.

	DESTINATIONIPHASH - The system selects the service based on the hashed value of the destination IP address in the TCP IP header.
	SOURCEIPHASH - The system selects the service based on the hashed value of the client's IP address in the IP header.
	LEASTBANDWIDTH - The system selects the service that is currently serving the least traffic, measured in megabits per second.
	LEASTPACKETS - The system selects the service that is currently serving the lowest number of packets per second.
	Token -The system selects the service based on the value, calculated from a token, extracted from the client's request (location and size of the token is configurable or by evaluating the rule configured). For subsequent requests with the same token, the systems will select the same physical server.
	SRCIPDESTIPHASH - The system selects the service based on the hashed value of the client's SOURCE IP and DESTINATION IP address in the TCP IP header.
 	CUSTOMLOAD - The system selects the service based on the it load which was determined by the LOAD monitors bound to the service.
	SRCIPSRCPORTHASH - The system selects the service based on the hashed value of the client's SOURCE IP and SOURCE PORT in the TCP/UDP+IP header.
	LRTM - When configured, the system selects the service with least response time learned through probing(number of active connections taken into account in addition to the response time).
	CALLIDHASSH - The system selects the service based on the hashed value of SIP callid.<br> Default value: PEMGMT_LB_LEASTCONNS<br> Possible values = ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, URLHASH, DOMAINHASH, DESTINATIONIPHASH, SOURCEIPHASH, SRCIPDESTIPHASH, LEASTBANDWIDTH, LEASTPACKETS, TOKEN, SRCIPSRCPORTHASH, LRTM, CALLIDHASH, CUSTOMLOAD
	* </pre>
	*/
	public String get_lbmethod() throws Exception {
		return this.lbmethod;
	}

	/**
	* <pre>
	* This parameter is used when the URLHASH or DOMAINHASH policy is set. Enter the number of bytes that will be hashed in the URL or DOMAIN name. Valid values are from 1 to 4096 bytes.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public void set_hashlength(long hashlength) throws Exception {
		this.hashlength = new Long(hashlength);
	}

	/**
	* <pre>
	* This parameter is used when the URLHASH or DOMAINHASH policy is set. Enter the number of bytes that will be hashed in the URL or DOMAIN name. Valid values are from 1 to 4096 bytes.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public void set_hashlength(Long hashlength) throws Exception{
		this.hashlength = hashlength;
	}

	/**
	* <pre>
	* This parameter is used when the URLHASH or DOMAINHASH policy is set. Enter the number of bytes that will be hashed in the URL or DOMAIN name. Valid values are from 1 to 4096 bytes.<br> Default value: 80<br> Minimum value =  1<br> Maximum value =  4096
	* </pre>
	*/
	public Long get_hashlength() throws Exception {
		return this.hashlength;
	}

	/**
	* <pre>
	* Use this parameter to set the DESTINATIONIPHASH or SOURCEIPHASH policy.
Enter the netmask to be used in modifying the destination or source IP address or network.<br> Minimum length =  1
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* Use this parameter to set the DESTINATIONIPHASH or SOURCEIPHASH policy.
Enter the netmask to be used in modifying the destination or source IP address or network.<br> Minimum length =  1
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The Network mask. Use this parameter if you are setting the DESTINATIONIPHASH or SOURCEIPHASH policy. Enter the netmask to be used in modifying the destination or source IP address or network.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6netmasklen(long v6netmasklen) throws Exception {
		this.v6netmasklen = new Long(v6netmasklen);
	}

	/**
	* <pre>
	* The Network mask. Use this parameter if you are setting the DESTINATIONIPHASH or SOURCEIPHASH policy. Enter the netmask to be used in modifying the destination or source IP address or network.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6netmasklen(Long v6netmasklen) throws Exception{
		this.v6netmasklen = v6netmasklen;
	}

	/**
	* <pre>
	* The Network mask. Use this parameter if you are setting the DESTINATIONIPHASH or SOURCEIPHASH policy. Enter the netmask to be used in modifying the destination or source IP address or network.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public Long get_v6netmasklen() throws Exception {
		return this.v6netmasklen;
	}

	/**
	* <pre>
	* Use this parameter to specify the string value used to set the RULE persistence type.
The string can be either an existing rule name (configured using add expression command) or else it can be an in-line expression with a maximum of 1499 characters.<br> Default value: "none"
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Use this parameter to specify the string value used to set the RULE persistence type.
The string can be either an existing rule name (configured using add expression command) or else it can be an in-line expression with a maximum of 1499 characters.<br> Default value: "none"
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Use this parameter to specify the listen policy for LB Vserver.
The string can be either an existing expression name (configured using add policy expression command) or else it can be an in-line expression with a maximum of 1499 characters.<br> Default value: "none"
	* </pre>
	*/
	public void set_listenpolicy(String listenpolicy) throws Exception{
		this.listenpolicy = listenpolicy;
	}

	/**
	* <pre>
	* Use this parameter to specify the listen policy for LB Vserver.
The string can be either an existing expression name (configured using add policy expression command) or else it can be an in-line expression with a maximum of 1499 characters.<br> Default value: "none"
	* </pre>
	*/
	public String get_listenpolicy() throws Exception {
		return this.listenpolicy;
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of LB Vserver.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public void set_listenpriority(long listenpriority) throws Exception {
		this.listenpriority = new Long(listenpriority);
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of LB Vserver.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public void set_listenpriority(Long listenpriority) throws Exception{
		this.listenpriority = listenpriority;
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of LB Vserver.<br> Default value: 101<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public Long get_listenpriority() throws Exception {
		return this.listenpriority;
	}

	/**
	* <pre>
	* Use this parameter to specify the expression to be used in response for RULE persistence type.
The string  is an in-line expression with a maximum of 1499 characters.<br> Default value: "none"
	* </pre>
	*/
	public void set_resrule(String resrule) throws Exception{
		this.resrule = resrule;
	}

	/**
	* <pre>
	* Use this parameter to specify the expression to be used in response for RULE persistence type.
The string  is an in-line expression with a maximum of 1499 characters.<br> Default value: "none"
	* </pre>
	*/
	public String get_resrule() throws Exception {
		return this.resrule;
	}

	/**
	* <pre>
	* Use this parameter to specify if the persistency is IP based. This parameter is Optional.<br> Minimum length =  1
	* </pre>
	*/
	public void set_persistmask(String persistmask) throws Exception{
		this.persistmask = persistmask;
	}

	/**
	* <pre>
	* Use this parameter to specify if the persistency is IP based. This parameter is Optional.<br> Minimum length =  1
	* </pre>
	*/
	public String get_persistmask() throws Exception {
		return this.persistmask;
	}

	/**
	* <pre>
	* The persistence mask. Use this parameter if you are using IP based persistence type on a ipv6 vserver.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6persistmasklen(long v6persistmasklen) throws Exception {
		this.v6persistmasklen = new Long(v6persistmasklen);
	}

	/**
	* <pre>
	* The persistence mask. Use this parameter if you are using IP based persistence type on a ipv6 vserver.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6persistmasklen(Long v6persistmasklen) throws Exception{
		this.v6persistmasklen = v6persistmasklen;
	}

	/**
	* <pre>
	* The persistence mask. Use this parameter if you are using IP based persistence type on a ipv6 vserver.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public Long get_v6persistmasklen() throws Exception {
		return this.v6persistmasklen;
	}

	/**
	* <pre>
	* Use this parameter to enable priority queuing on the specified virtual server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_pq(String pq) throws Exception{
		this.pq = pq;
	}

	/**
	* <pre>
	* Use this parameter to enable priority queuing on the specified virtual server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_pq() throws Exception {
		return this.pq;
	}

	/**
	* <pre>
	* Use this parameter to enable SureConnect on the specified virtual server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sc(String sc) throws Exception{
		this.sc = sc;
	}

	/**
	* <pre>
	* Use this parameter to enable SureConnect on the specified virtual server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sc() throws Exception {
		return this.sc;
	}

	/**
	* <pre>
	* Use this parameter to enable natting for RTSP data connection.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_rtspnat(String rtspnat) throws Exception{
		this.rtspnat = rtspnat;
	}

	/**
	* <pre>
	* Use this parameter to enable natting for RTSP data connection.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_rtspnat() throws Exception {
		return this.rtspnat;
	}

	/**
	* <pre>
	* Use this parameter to specify the LB mode. If the value is specified as IP then the traffic is sent to the physical servers by changing the destination IP address to that of the physical server. If the value is MAC then the traffic is sent to the physical servers , by changing the destination MAC address to that of one of the physical servers, the destination IP is not changed. MAC mode is used mostly in Firewall Load Balancing scenario.<br> Default value: NSFWD_IP<br> Possible values = IP, MAC, IPTUNNEL, TOS
	* </pre>
	*/
	public void set_m(String m) throws Exception{
		this.m = m;
	}

	/**
	* <pre>
	* Use this parameter to specify the LB mode. If the value is specified as IP then the traffic is sent to the physical servers by changing the destination IP address to that of the physical server. If the value is MAC then the traffic is sent to the physical servers , by changing the destination MAC address to that of one of the physical servers, the destination IP is not changed. MAC mode is used mostly in Firewall Load Balancing scenario.<br> Default value: NSFWD_IP<br> Possible values = IP, MAC, IPTUNNEL, TOS
	* </pre>
	*/
	public String get_m() throws Exception {
		return this.m;
	}

	/**
	* <pre>
	* Use this parameter to specify the TOS ID of this vserver. Applicable only when the LB mode is TOS.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public void set_tosid(long tosid) throws Exception {
		this.tosid = new Long(tosid);
	}

	/**
	* <pre>
	* Use this parameter to specify the TOS ID of this vserver. Applicable only when the LB mode is TOS.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public void set_tosid(Long tosid) throws Exception{
		this.tosid = tosid;
	}

	/**
	* <pre>
	* Use this parameter to specify the TOS ID of this vserver. Applicable only when the LB mode is TOS.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public Long get_tosid() throws Exception {
		return this.tosid;
	}

	/**
	* <pre>
	* Use this parameter to specify the length of the token in bytes. Applicable to TCP virtual servers, when Token Load Balancing method is selected. The datalength should not be more than 24k.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_datalength(long datalength) throws Exception {
		this.datalength = new Long(datalength);
	}

	/**
	* <pre>
	* Use this parameter to specify the length of the token in bytes. Applicable to TCP virtual servers, when Token Load Balancing method is selected. The datalength should not be more than 24k.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_datalength(Long datalength) throws Exception{
		this.datalength = datalength;
	}

	/**
	* <pre>
	* Use this parameter to specify the length of the token in bytes. Applicable to TCP virtual servers, when Token Load Balancing method is selected. The datalength should not be more than 24k.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_datalength() throws Exception {
		return this.datalength;
	}

	/**
	* <pre>
	* Use this parameter to specifies offset of the data to be taken as token. Applicable to the TCP type virtual servers, when Token load balancing method is used.  Must be within the first 24k of the client TCP data.<br> Minimum value =  0<br> Maximum value =  25400
	* </pre>
	*/
	public void set_dataoffset(long dataoffset) throws Exception {
		this.dataoffset = new Long(dataoffset);
	}

	/**
	* <pre>
	* Use this parameter to specifies offset of the data to be taken as token. Applicable to the TCP type virtual servers, when Token load balancing method is used.  Must be within the first 24k of the client TCP data.<br> Minimum value =  0<br> Maximum value =  25400
	* </pre>
	*/
	public void set_dataoffset(Long dataoffset) throws Exception{
		this.dataoffset = dataoffset;
	}

	/**
	* <pre>
	* Use this parameter to specifies offset of the data to be taken as token. Applicable to the TCP type virtual servers, when Token load balancing method is used.  Must be within the first 24k of the client TCP data.<br> Minimum value =  0<br> Maximum value =  25400
	* </pre>
	*/
	public Long get_dataoffset() throws Exception {
		return this.dataoffset;
	}

	/**
	* <pre>
	* Use this parameter to enable sessionless load balancing.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sessionless(String sessionless) throws Exception{
		this.sessionless = sessionless;
	}

	/**
	* <pre>
	* Use this parameter to enable sessionless load balancing.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sessionless() throws Exception {
		return this.sessionless;
	}

	/**
	* <pre>
	* The state of the load balancing virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the load balancing virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Specifies the connection failover mode of the virtual server.<br> Default value: DISABLED<br> Possible values = DISABLED, STATEFUL, STATELESS
	* </pre>
	*/
	public void set_connfailover(String connfailover) throws Exception{
		this.connfailover = connfailover;
	}

	/**
	* <pre>
	* Specifies the connection failover mode of the virtual server.<br> Default value: DISABLED<br> Possible values = DISABLED, STATEFUL, STATELESS
	* </pre>
	*/
	public String get_connfailover() throws Exception {
		return this.connfailover;
	}

	/**
	* <pre>
	* The URL where traffic is redirected if the virtual server in the system becomes unavailable. You can enter up to 127 characters as the URL argument.
WARNING!	Make sure that the domain you specify in the URL does not match the domain specified in the -d domainName argument of the add cs policy CLI command. If the same domain is specified in both arguments, the request will be
continuously redirected to the same unavailable virtual server in the system  -  then the user may not get the requested content.<br> Minimum length =  1
	* </pre>
	*/
	public void set_redirurl(String redirurl) throws Exception{
		this.redirurl = redirurl;
	}

	/**
	* <pre>
	* The URL where traffic is redirected if the virtual server in the system becomes unavailable. You can enter up to 127 characters as the URL argument.
WARNING!	Make sure that the domain you specify in the URL does not match the domain specified in the -d domainName argument of the add cs policy CLI command. If the same domain is specified in both arguments, the request will be
continuously redirected to the same unavailable virtual server in the system  -  then the user may not get the requested content.<br> Minimum length =  1
	* </pre>
	*/
	public String get_redirurl() throws Exception {
		return this.redirurl;
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
	* The spillover factor based on which the traffic will be given to the backupvserver once the main virtual server reaches the spillover threshold.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public void set_somethod(String somethod) throws Exception{
		this.somethod = somethod;
	}

	/**
	* <pre>
	* The spillover factor based on which the traffic will be given to the backupvserver once the main virtual server reaches the spillover threshold.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public String get_somethod() throws Exception {
		return this.somethod;
	}

	/**
	* <pre>
	* The state of the spillover persistence.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sopersistence(String sopersistence) throws Exception{
		this.sopersistence = sopersistence;
	}

	/**
	* <pre>
	* The state of the spillover persistence.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sopersistence() throws Exception {
		return this.sopersistence;
	}

	/**
	* <pre>
	* The spillover persistency entry timeout.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_sopersistencetimeout(long sopersistencetimeout) throws Exception {
		this.sopersistencetimeout = new Long(sopersistencetimeout);
	}

	/**
	* <pre>
	* The spillover persistency entry timeout.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_sopersistencetimeout(Long sopersistencetimeout) throws Exception{
		this.sopersistencetimeout = sopersistencetimeout;
	}

	/**
	* <pre>
	* The spillover persistency entry timeout.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_sopersistencetimeout() throws Exception {
		return this.sopersistencetimeout;
	}

	/**
	* <pre>
	* In case of CONNECTION (or) DYNAMICCONNECTION type spillover method this value is treated as Maximum number of connections an lb vserver will handle before spillover takes place. In case of BANDWIDTH type spillover method this value is treated as the amount of incoming and outgoing traffic (in Kbps) a Vserver will handle before spillover takes place. In case of HEALTH type spillover method if the percentage of active services (by weight) becomes lower than this value, spillover takes place .<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_sothreshold(long sothreshold) throws Exception {
		this.sothreshold = new Long(sothreshold);
	}

	/**
	* <pre>
	* In case of CONNECTION (or) DYNAMICCONNECTION type spillover method this value is treated as Maximum number of connections an lb vserver will handle before spillover takes place. In case of BANDWIDTH type spillover method this value is treated as the amount of incoming and outgoing traffic (in Kbps) a Vserver will handle before spillover takes place. In case of HEALTH type spillover method if the percentage of active services (by weight) becomes lower than this value, spillover takes place .<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_sothreshold(Long sothreshold) throws Exception{
		this.sothreshold = sothreshold;
	}

	/**
	* <pre>
	* In case of CONNECTION (or) DYNAMICCONNECTION type spillover method this value is treated as Maximum number of connections an lb vserver will handle before spillover takes place. In case of BANDWIDTH type spillover method this value is treated as the amount of incoming and outgoing traffic (in Kbps) a Vserver will handle before spillover takes place. In case of HEALTH type spillover method if the percentage of active services (by weight) becomes lower than this value, spillover takes place .<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
	}

	/**
	* <pre>
	* The state of port rewrite while performing HTTP redirect.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_redirectportrewrite(String redirectportrewrite) throws Exception{
		this.redirectportrewrite = redirectportrewrite;
	}

	/**
	* <pre>
	* The state of port rewrite while performing HTTP redirect.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_redirectportrewrite() throws Exception {
		return this.redirectportrewrite;
	}

	/**
	* <pre>
	* Perform delayed clean up of connections on this vserver.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Perform delayed clean up of connections on this vserver.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
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
	* The virtual IP and port header insertion option for the vserver.
	VIPADDR		- Header contains the vserver's IP address and port number without any translation.
	OFF		- The virtual IP and port header insertion option is disabled.
	V6TOV4MAPPING 	- Header contains the mapped IPv4 address corresponding to the IPv6 address of the vserver and the port number. An IPv6 address can be mapped to a user-specified IPv4 address using the set ns ip6 command.<br> Possible values = OFF, VIPADDR, V6TOV4MAPPING
	* </pre>
	*/
	public void set_insertvserveripport(String insertvserveripport) throws Exception{
		this.insertvserveripport = insertvserveripport;
	}

	/**
	* <pre>
	* The virtual IP and port header insertion option for the vserver.
	VIPADDR		- Header contains the vserver's IP address and port number without any translation.
	OFF		- The virtual IP and port header insertion option is disabled.
	V6TOV4MAPPING 	- Header contains the mapped IPv4 address corresponding to the IPv6 address of the vserver and the port number. An IPv6 address can be mapped to a user-specified IPv4 address using the set ns ip6 command.<br> Possible values = OFF, VIPADDR, V6TOV4MAPPING
	* </pre>
	*/
	public String get_insertvserveripport() throws Exception {
		return this.insertvserveripport;
	}

	/**
	* <pre>
	* The name of virtual IP and port header.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vipheader(String vipheader) throws Exception{
		this.vipheader = vipheader;
	}

	/**
	* <pre>
	* The name of virtual IP and port header.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vipheader() throws Exception {
		return this.vipheader;
	}

	/**
	* <pre>
	* FQDN of authentication vserver.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public void set_authenticationhost(String authenticationhost) throws Exception{
		this.authenticationhost = authenticationhost;
	}

	/**
	* <pre>
	* FQDN of authentication vserver.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public String get_authenticationhost() throws Exception {
		return this.authenticationhost;
	}

	/**
	* <pre>
	* This option toggles on or off the application of authentication of incoming users to the vserver.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* This option toggles on or off the application of authentication of incoming users to the vserver.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* This option toggles on or off the HTTP 401 response based authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authn401(String authn401) throws Exception{
		this.authn401 = authn401;
	}

	/**
	* <pre>
	* This option toggles on or off the HTTP 401 response based authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authn401() throws Exception {
		return this.authn401;
	}

	/**
	* <pre>
	* Name of authentication vserver.<br> Minimum length =  1<br> Maximum length =  252
	* </pre>
	*/
	public void set_authnvsname(String authnvsname) throws Exception{
		this.authnvsname = authnvsname;
	}

	/**
	* <pre>
	* Name of authentication vserver.<br> Minimum length =  1<br> Maximum length =  252
	* </pre>
	*/
	public String get_authnvsname() throws Exception {
		return this.authnvsname;
	}

	/**
	* <pre>
	* Domain of LB vserver.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public void set_aaa_tm_kbr_domain(String aaa_tm_kbr_domain) throws Exception{
		this.aaa_tm_kbr_domain = aaa_tm_kbr_domain;
	}

	/**
	* <pre>
	* Domain of LB vserver.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public String get_aaa_tm_kbr_domain() throws Exception {
		return this.aaa_tm_kbr_domain;
	}

	/**
	* <pre>
	* Realm.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public void set_realm(String realm) throws Exception{
		this.realm = realm;
	}

	/**
	* <pre>
	* Realm.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public String get_realm() throws Exception {
		return this.realm;
	}

	/**
	* <pre>
	* Process traffic on bound Push vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_push(String push) throws Exception{
		this.push = push;
	}

	/**
	* <pre>
	* Process traffic on bound Push vserver.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_push() throws Exception {
		return this.push;
	}

	/**
	* <pre>
	* The lb vserver of type PUSH/SSL_PUSH to which server pushes the updates received on the client facing non-push lb vserver.<br> Minimum length =  1
	* </pre>
	*/
	public void set_pushvserver(String pushvserver) throws Exception{
		this.pushvserver = pushvserver;
	}

	/**
	* <pre>
	* The lb vserver of type PUSH/SSL_PUSH to which server pushes the updates received on the client facing non-push lb vserver.<br> Minimum length =  1
	* </pre>
	*/
	public String get_pushvserver() throws Exception {
		return this.pushvserver;
	}

	/**
	* <pre>
	* Use this parameter to specify the expression to extract the label in response from server.
The string can be either a named expression (configured using add policy expression command) or else it can be an in-line expression with a maximum of 63 characters.<br> Default value: "none"
	* </pre>
	*/
	public void set_pushlabel(String pushlabel) throws Exception{
		this.pushlabel = pushlabel;
	}

	/**
	* <pre>
	* Use this parameter to specify the expression to extract the label in response from server.
The string can be either a named expression (configured using add policy expression command) or else it can be an in-line expression with a maximum of 63 characters.<br> Default value: "none"
	* </pre>
	*/
	public String get_pushlabel() throws Exception {
		return this.pushlabel;
	}

	/**
	* <pre>
	* Specify if multiple web 2.0 connections from the same client can connect to this vserver and expect updates.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_pushmulticlients(String pushmulticlients) throws Exception{
		this.pushmulticlients = pushmulticlients;
	}

	/**
	* <pre>
	* Specify if multiple web 2.0 connections from the same client can connect to this vserver and expect updates.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_pushmulticlients() throws Exception {
		return this.pushmulticlients;
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
	* Comments associated with this virtual server.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this virtual server.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
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
	* The version of the MSSQL server.<br> Default value: TDS_PROT_2008B<br> Possible values = 70, 2000, 2000SP1, 2005, 2008, 2008R2
	* </pre>
	*/
	public void set_mssqlserverversion(String mssqlserverversion) throws Exception{
		this.mssqlserverversion = mssqlserverversion;
	}

	/**
	* <pre>
	* The version of the MSSQL server.<br> Default value: TDS_PROT_2008B<br> Possible values = 70, 2000, 2000SP1, 2005, 2008, 2008R2
	* </pre>
	*/
	public String get_mssqlserverversion() throws Exception {
		return this.mssqlserverversion;
	}

	/**
	* <pre>
	* The protocol version returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlprotocolversion(long mysqlprotocolversion) throws Exception {
		this.mysqlprotocolversion = new Long(mysqlprotocolversion);
	}

	/**
	* <pre>
	* The protocol version returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlprotocolversion(Long mysqlprotocolversion) throws Exception{
		this.mysqlprotocolversion = mysqlprotocolversion;
	}

	/**
	* <pre>
	* The protocol version returned by the mysql vserver.
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
	* The character set returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlcharacterset(long mysqlcharacterset) throws Exception {
		this.mysqlcharacterset = new Long(mysqlcharacterset);
	}

	/**
	* <pre>
	* The character set returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlcharacterset(Long mysqlcharacterset) throws Exception{
		this.mysqlcharacterset = mysqlcharacterset;
	}

	/**
	* <pre>
	* The character set returned by the mysql vserver.
	* </pre>
	*/
	public Long get_mysqlcharacterset() throws Exception {
		return this.mysqlcharacterset;
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlservercapabilities(long mysqlservercapabilities) throws Exception {
		this.mysqlservercapabilities = new Long(mysqlservercapabilities);
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlservercapabilities(Long mysqlservercapabilities) throws Exception{
		this.mysqlservercapabilities = mysqlservercapabilities;
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.
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
	* The number of requests/sec or percentage of requests/sec a new service should receive compared to the existing services.
The maximum possible value for requests/sec is 65536 and percentage of requests is 100.
	* </pre>
	*/
	public void set_newservicerequest(long newservicerequest) throws Exception {
		this.newservicerequest = new Long(newservicerequest);
	}

	/**
	* <pre>
	* The number of requests/sec or percentage of requests/sec a new service should receive compared to the existing services.
The maximum possible value for requests/sec is 65536 and percentage of requests is 100.
	* </pre>
	*/
	public void set_newservicerequest(Long newservicerequest) throws Exception{
		this.newservicerequest = newservicerequest;
	}

	/**
	* <pre>
	* The number of requests/sec or percentage of requests/sec a new service should receive compared to the existing services.
The maximum possible value for requests/sec is 65536 and percentage of requests is 100.
	* </pre>
	*/
	public Long get_newservicerequest() throws Exception {
		return this.newservicerequest;
	}

	/**
	* <pre>
	* The unit for new service request value.<br> Default value: NEWSVC_REQTYPE_REQS_PER_SEC<br> Possible values = PER_SECOND, PERCENT
	* </pre>
	*/
	public void set_newservicerequestunit(String newservicerequestunit) throws Exception{
		this.newservicerequestunit = newservicerequestunit;
	}

	/**
	* <pre>
	* The unit for new service request value.<br> Default value: NEWSVC_REQTYPE_REQS_PER_SEC<br> Possible values = PER_SECOND, PERCENT
	* </pre>
	*/
	public String get_newservicerequestunit() throws Exception {
		return this.newservicerequestunit;
	}

	/**
	* <pre>
	* The interval in seconds after which the new services requests limit should be automatically increased.<br> Minimum value =  0<br> Maximum value =  3600
	* </pre>
	*/
	public void set_newservicerequestincrementinterval(long newservicerequestincrementinterval) throws Exception {
		this.newservicerequestincrementinterval = new Long(newservicerequestincrementinterval);
	}

	/**
	* <pre>
	* The interval in seconds after which the new services requests limit should be automatically increased.<br> Minimum value =  0<br> Maximum value =  3600
	* </pre>
	*/
	public void set_newservicerequestincrementinterval(Long newservicerequestincrementinterval) throws Exception{
		this.newservicerequestincrementinterval = newservicerequestincrementinterval;
	}

	/**
	* <pre>
	* The interval in seconds after which the new services requests limit should be automatically increased.<br> Minimum value =  0<br> Maximum value =  3600
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
	* This argument decides the behavior incase the service which is selected from an existing persistence session has reached threshold.<br> Default value: NS_DONT_SKIPPERSIST<br> Possible values = 
	* </pre>
	*/
	public void set_skippersistency(String skippersistency) throws Exception{
		this.skippersistency = skippersistency;
	}

	/**
	* <pre>
	* This argument decides the behavior incase the service which is selected from an existing persistence session has reached threshold.<br> Default value: NS_DONT_SKIPPERSIST<br> Possible values = 
	* </pre>
	*/
	public String get_skippersistency() throws Exception {
		return this.skippersistency;
	}

	/**
	* <pre>
	* The weight for the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The weight for the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The weight for the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The service name bound to the selected load balancing virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The service name bound to the selected load balancing virtual server.<br> Minimum length =  1
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
	* SSL status.<br> Possible values = Certkey not bound, SSL feature disabled
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
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
	* The permanent mapping for the V6 Address.
	* </pre>
	*/
	public String get_ipmapping() throws Exception {
		return this.ipmapping;
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
	* Current LB vserver state.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Effective state of the LB vserver , based on the state of backup vservers.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
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
		addresource.ownernode = resource.ownernode;
		addresource.backupnode = resource.backupnode;
		addresource.backuppersistencetimeout = resource.backuppersistencetimeout;
		addresource.lbmethod = resource.lbmethod;
		addresource.hashlength = resource.hashlength;
		addresource.netmask = resource.netmask;
		addresource.v6netmasklen = resource.v6netmasklen;
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
		addresource.sothreshold = resource.sothreshold;
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
		addresource.aaa_tm_kbr_domain = resource.aaa_tm_kbr_domain;
		addresource.realm = resource.realm;
		addresource.push = resource.push;
		addresource.pushvserver = resource.pushvserver;
		addresource.pushlabel = resource.pushlabel;
		addresource.pushmulticlients = resource.pushmulticlients;
		addresource.tcpprofilename = resource.tcpprofilename;
		addresource.httpprofilename = resource.httpprofilename;
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
				addresources[i].ownernode = resources[i].ownernode;
				addresources[i].backupnode = resources[i].backupnode;
				addresources[i].backuppersistencetimeout = resources[i].backuppersistencetimeout;
				addresources[i].lbmethod = resources[i].lbmethod;
				addresources[i].hashlength = resources[i].hashlength;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].v6netmasklen = resources[i].v6netmasklen;
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
				addresources[i].sothreshold = resources[i].sothreshold;
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
				addresources[i].aaa_tm_kbr_domain = resources[i].aaa_tm_kbr_domain;
				addresources[i].realm = resources[i].realm;
				addresources[i].push = resources[i].push;
				addresources[i].pushvserver = resources[i].pushvserver;
				addresources[i].pushlabel = resources[i].pushlabel;
				addresources[i].pushmulticlients = resources[i].pushmulticlients;
				addresources[i].tcpprofilename = resources[i].tcpprofilename;
				addresources[i].httpprofilename = resources[i].httpprofilename;
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
		updateresource.redirectportrewrite = resource.redirectportrewrite;
		updateresource.downstateflush = resource.downstateflush;
		updateresource.insertvserveripport = resource.insertvserveripport;
		updateresource.vipheader = resource.vipheader;
		updateresource.disableprimaryondown = resource.disableprimaryondown;
		updateresource.authenticationhost = resource.authenticationhost;
		updateresource.authentication = resource.authentication;
		updateresource.authn401 = resource.authn401;
		updateresource.authnvsname = resource.authnvsname;
		updateresource.aaa_tm_kbr_domain = resource.aaa_tm_kbr_domain;
		updateresource.realm = resource.realm;
		updateresource.push = resource.push;
		updateresource.pushvserver = resource.pushvserver;
		updateresource.pushlabel = resource.pushlabel;
		updateresource.pushmulticlients = resource.pushmulticlients;
		updateresource.listenpolicy = resource.listenpolicy;
		updateresource.listenpriority = resource.listenpriority;
		updateresource.tcpprofilename = resource.tcpprofilename;
		updateresource.httpprofilename = resource.httpprofilename;
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
				updateresources[i].redirectportrewrite = resources[i].redirectportrewrite;
				updateresources[i].downstateflush = resources[i].downstateflush;
				updateresources[i].insertvserveripport = resources[i].insertvserveripport;
				updateresources[i].vipheader = resources[i].vipheader;
				updateresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				updateresources[i].authenticationhost = resources[i].authenticationhost;
				updateresources[i].authentication = resources[i].authentication;
				updateresources[i].authn401 = resources[i].authn401;
				updateresources[i].authnvsname = resources[i].authnvsname;
				updateresources[i].aaa_tm_kbr_domain = resources[i].aaa_tm_kbr_domain;
				updateresources[i].realm = resources[i].realm;
				updateresources[i].push = resources[i].push;
				updateresources[i].pushvserver = resources[i].pushvserver;
				updateresources[i].pushlabel = resources[i].pushlabel;
				updateresources[i].pushmulticlients = resources[i].pushmulticlients;
				updateresources[i].listenpolicy = resources[i].listenpolicy;
				updateresources[i].listenpriority = resources[i].listenpriority;
				updateresources[i].tcpprofilename = resources[i].tcpprofilename;
				updateresources[i].httpprofilename = resources[i].httpprofilename;
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
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		lbvserver unsetresource = new lbvserver();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of lbvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, lbvserver resource, String[] args) throws Exception{
		lbvserver unsetresource = new lbvserver();
		unsetresource.name = resource.name;
		unsetresource.backupvserver = resource.backupvserver;
		unsetresource.clttimeout = resource.clttimeout;
		unsetresource.redirurl = resource.redirurl;
		unsetresource.redirurlflags = resource.redirurlflags;
		unsetresource.authenticationhost = resource.authenticationhost;
		unsetresource.authnvsname = resource.authnvsname;
		unsetresource.aaa_tm_kbr_domain = resource.aaa_tm_kbr_domain;
		unsetresource.realm = resource.realm;
		unsetresource.pushvserver = resource.pushvserver;
		unsetresource.pushlabel = resource.pushlabel;
		unsetresource.tcpprofilename = resource.tcpprofilename;
		unsetresource.httpprofilename = resource.httpprofilename;
		unsetresource.rule = resource.rule;
		unsetresource.sothreshold = resource.sothreshold;
		unsetresource.l2conn = resource.l2conn;
		unsetresource.mysqlprotocolversion = resource.mysqlprotocolversion;
		unsetresource.mysqlserverversion = resource.mysqlserverversion;
		unsetresource.mysqlcharacterset = resource.mysqlcharacterset;
		unsetresource.mysqlservercapabilities = resource.mysqlservercapabilities;
		unsetresource.appflowlog = resource.appflowlog;
		unsetresource.netprofile = resource.netprofile;
		unsetresource.icmpvsrresponse = resource.icmpvsrresponse;
		unsetresource.skippersistency = resource.skippersistency;
		unsetresource.minautoscalemembers = resource.minautoscalemembers;
		unsetresource.maxautoscalemembers = resource.maxautoscalemembers;
		unsetresource.servicename = resource.servicename;
		unsetresource.persistencetype = resource.persistencetype;
		unsetresource.timeout = resource.timeout;
		unsetresource.persistencebackup = resource.persistencebackup;
		unsetresource.backuppersistencetimeout = resource.backuppersistencetimeout;
		unsetresource.lbmethod = resource.lbmethod;
		unsetresource.hashlength = resource.hashlength;
		unsetresource.netmask = resource.netmask;
		unsetresource.v6netmasklen = resource.v6netmasklen;
		unsetresource.resrule = resource.resrule;
		unsetresource.persistmask = resource.persistmask;
		unsetresource.v6persistmasklen = resource.v6persistmasklen;
		unsetresource.pq = resource.pq;
		unsetresource.sc = resource.sc;
		unsetresource.rtspnat = resource.rtspnat;
		unsetresource.m = resource.m;
		unsetresource.tosid = resource.tosid;
		unsetresource.datalength = resource.datalength;
		unsetresource.dataoffset = resource.dataoffset;
		unsetresource.sessionless = resource.sessionless;
		unsetresource.connfailover = resource.connfailover;
		unsetresource.cacheable = resource.cacheable;
		unsetresource.somethod = resource.somethod;
		unsetresource.sopersistence = resource.sopersistence;
		unsetresource.sopersistencetimeout = resource.sopersistencetimeout;
		unsetresource.redirectportrewrite = resource.redirectportrewrite;
		unsetresource.downstateflush = resource.downstateflush;
		unsetresource.insertvserveripport = resource.insertvserveripport;
		unsetresource.vipheader = resource.vipheader;
		unsetresource.disableprimaryondown = resource.disableprimaryondown;
		unsetresource.authentication = resource.authentication;
		unsetresource.authn401 = resource.authn401;
		unsetresource.push = resource.push;
		unsetresource.pushmulticlients = resource.pushmulticlients;
		unsetresource.listenpolicy = resource.listenpolicy;
		unsetresource.listenpriority = resource.listenpriority;
		unsetresource.comment = resource.comment;
		unsetresource.mssqlserverversion = resource.mssqlserverversion;
		unsetresource.newservicerequest = resource.newservicerequest;
		unsetresource.newservicerequestunit = resource.newservicerequestunit;
		unsetresource.newservicerequestincrementinterval = resource.newservicerequestincrementinterval;
		unsetresource.persistavpno = resource.persistavpno;
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
				unsetresources[i].backupvserver = resources[i].backupvserver;
				unsetresources[i].clttimeout = resources[i].clttimeout;
				unsetresources[i].redirurl = resources[i].redirurl;
				unsetresources[i].redirurlflags = resources[i].redirurlflags;
				unsetresources[i].authenticationhost = resources[i].authenticationhost;
				unsetresources[i].authnvsname = resources[i].authnvsname;
				unsetresources[i].aaa_tm_kbr_domain = resources[i].aaa_tm_kbr_domain;
				unsetresources[i].realm = resources[i].realm;
				unsetresources[i].pushvserver = resources[i].pushvserver;
				unsetresources[i].pushlabel = resources[i].pushlabel;
				unsetresources[i].tcpprofilename = resources[i].tcpprofilename;
				unsetresources[i].httpprofilename = resources[i].httpprofilename;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].sothreshold = resources[i].sothreshold;
				unsetresources[i].l2conn = resources[i].l2conn;
				unsetresources[i].mysqlprotocolversion = resources[i].mysqlprotocolversion;
				unsetresources[i].mysqlserverversion = resources[i].mysqlserverversion;
				unsetresources[i].mysqlcharacterset = resources[i].mysqlcharacterset;
				unsetresources[i].mysqlservercapabilities = resources[i].mysqlservercapabilities;
				unsetresources[i].appflowlog = resources[i].appflowlog;
				unsetresources[i].netprofile = resources[i].netprofile;
				unsetresources[i].icmpvsrresponse = resources[i].icmpvsrresponse;
				unsetresources[i].skippersistency = resources[i].skippersistency;
				unsetresources[i].minautoscalemembers = resources[i].minautoscalemembers;
				unsetresources[i].maxautoscalemembers = resources[i].maxautoscalemembers;
				unsetresources[i].servicename = resources[i].servicename;
				unsetresources[i].persistencetype = resources[i].persistencetype;
				unsetresources[i].timeout = resources[i].timeout;
				unsetresources[i].persistencebackup = resources[i].persistencebackup;
				unsetresources[i].backuppersistencetimeout = resources[i].backuppersistencetimeout;
				unsetresources[i].lbmethod = resources[i].lbmethod;
				unsetresources[i].hashlength = resources[i].hashlength;
				unsetresources[i].netmask = resources[i].netmask;
				unsetresources[i].v6netmasklen = resources[i].v6netmasklen;
				unsetresources[i].resrule = resources[i].resrule;
				unsetresources[i].persistmask = resources[i].persistmask;
				unsetresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				unsetresources[i].pq = resources[i].pq;
				unsetresources[i].sc = resources[i].sc;
				unsetresources[i].rtspnat = resources[i].rtspnat;
				unsetresources[i].m = resources[i].m;
				unsetresources[i].tosid = resources[i].tosid;
				unsetresources[i].datalength = resources[i].datalength;
				unsetresources[i].dataoffset = resources[i].dataoffset;
				unsetresources[i].sessionless = resources[i].sessionless;
				unsetresources[i].connfailover = resources[i].connfailover;
				unsetresources[i].cacheable = resources[i].cacheable;
				unsetresources[i].somethod = resources[i].somethod;
				unsetresources[i].sopersistence = resources[i].sopersistence;
				unsetresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				unsetresources[i].redirectportrewrite = resources[i].redirectportrewrite;
				unsetresources[i].downstateflush = resources[i].downstateflush;
				unsetresources[i].insertvserveripport = resources[i].insertvserveripport;
				unsetresources[i].vipheader = resources[i].vipheader;
				unsetresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				unsetresources[i].authentication = resources[i].authentication;
				unsetresources[i].authn401 = resources[i].authn401;
				unsetresources[i].push = resources[i].push;
				unsetresources[i].pushmulticlients = resources[i].pushmulticlients;
				unsetresources[i].listenpolicy = resources[i].listenpolicy;
				unsetresources[i].listenpriority = resources[i].listenpriority;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].mssqlserverversion = resources[i].mssqlserverversion;
				unsetresources[i].newservicerequest = resources[i].newservicerequest;
				unsetresources[i].newservicerequestunit = resources[i].newservicerequestunit;
				unsetresources[i].newservicerequestincrementinterval = resources[i].newservicerequestincrementinterval;
				unsetresources[i].persistavpno = resources[i].persistavpno;
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
	public static class mssqlserverversionEnum {
		public static final String _70 = "70";
		public static final String _2000 = "2000";
		public static final String _2000SP1 = "2000SP1";
		public static final String _2005 = "2005";
		public static final String _2008 = "2008";
		public static final String _2008R2 = "2008R2";
	}
}
