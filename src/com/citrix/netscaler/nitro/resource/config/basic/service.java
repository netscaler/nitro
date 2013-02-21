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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class service_response extends base_response
{
	public service[] service;
}
/**
* Configuration for service resource.
*/

public class service extends base_resource
{
	private String name;
	private String ip;
	private String servername;
	private String servicetype;
	private Integer port;
	private Integer cleartextport;
	private String cachetype;
	private Long maxclient;
	private String healthmonitor;
	private Long maxreq;
	private String cacheable;
	private String cip;
	private String cipheader;
	private String usip;
	private String pathmonitor;
	private String pathmonitorindv;
	private String useproxyport;
	private String sc;
	private String sp;
	private String rtspsessionidremap;
	private Long clttimeout;
	private Long svrtimeout;
	private String customserverid;
	private Long serverid;
	private String cka;
	private String tcpb;
	private String cmp;
	private Long maxbandwidth;
	private String accessdown;
	private Long monthreshold;
	private String state;
	private String downstateflush;
	private String tcpprofilename;
	private String httpprofilename;
	private Long hashid;
	private String comment;
	private String appflowlog;
	private String netprofile;
	private String ipaddress;
	private Long weight;
	private String monitor_name_svc;
	private Long delay;
	private String graceful;
	private Boolean all;
	private Boolean Internal;
	private String newname;

	//------- Read only Parameter ---------;

	private Integer numofconnections;
	private String policyname;
	private Boolean serviceconftpye;
	private Boolean serviceconftype;
	private String serviceconftype2;
	private String value;
	private String gslb;
	private String dup_state;
	private String publicip;
	private Integer publicport;
	private String svrstate;
	private String monitor_state;
	private Integer monstatcode;
	private String lastresponse;
	private Long responsetime;
	private Integer monstatparam1;
	private Integer monstatparam2;
	private Integer monstatparam3;
	private String statechangetimesec;
	private Long statechangetimemsec;
	private Long timesincelaststatechange;
	private Long tickssincelaststatechange;
	private Long stateupdatereason;
	private Long clmonowner;
	private Long clmonview;
	private String serviceipstr;
	private Long __count;

	/**
	* <pre>
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The IP address of the server for which a service will be added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ip(String ip) throws Exception{
		this.ip = ip;
	}

	/**
	* <pre>
	* The IP address of the server for which a service will be added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* The name of the server for which a service will be added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* The name of the server for which a service will be added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* The type of service. The supported protocols are:
HTTP - To load balance web servers and provide connection multiplexing, latency improvement, and other content and TCP protection benefits for HTTP traffic.
FTP - To load balance FTP servers. In FTP mode, the system provides TCP protection benefits, protection against SYN attacks, and surge protection.
TCP - To host any other TCP protocols that are not HTTP, FTP, NNTP, or SSL. In TCP mode, the system provides TCP protection benefits, protection against SYN attack, and surge protection.
UDP - To load balance servers with UDP-based services (other than DNS).
SSL - To provide end-to-end encryption and SSL acceleration.
SSL_BRIDGE - To load balance SSL servers.
SSL_TCP - To offload SSL traffic for TCP applications.
NNTP - To load balance NNTP servers.
DNS - To load balance DNS servers.
ADNS: To create an authoritative DNS service.
ANY - To load balance a service type not listed above (for example, for IP traffic when load balancing firewalls).
Note:	The NNTP service is for cache redirection.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, RPCSVR, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, SIP_UDP, DNS_TCP, ADNS_TCP, MYSQL, MSSQL, RADIUS, RDP, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* The type of service. The supported protocols are:
HTTP - To load balance web servers and provide connection multiplexing, latency improvement, and other content and TCP protection benefits for HTTP traffic.
FTP - To load balance FTP servers. In FTP mode, the system provides TCP protection benefits, protection against SYN attacks, and surge protection.
TCP - To host any other TCP protocols that are not HTTP, FTP, NNTP, or SSL. In TCP mode, the system provides TCP protection benefits, protection against SYN attack, and surge protection.
UDP - To load balance servers with UDP-based services (other than DNS).
SSL - To provide end-to-end encryption and SSL acceleration.
SSL_BRIDGE - To load balance SSL servers.
SSL_TCP - To offload SSL traffic for TCP applications.
NNTP - To load balance NNTP servers.
DNS - To load balance DNS servers.
ADNS: To create an authoritative DNS service.
ANY - To load balance a service type not listed above (for example, for IP traffic when load balancing firewalls).
Note:	The NNTP service is for cache redirection.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, RPCSVR, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, SIP_UDP, DNS_TCP, ADNS_TCP, MYSQL, MSSQL, RADIUS, RDP, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* The port number to be used for the service.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* The port number to be used for the service.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* The port number to be used for the service.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The clear text port number where clear text data is sent. Used with SSL offload service.<br> Minimum value =  1
	* </pre>
	*/
	public void set_cleartextport(int cleartextport) throws Exception {
		this.cleartextport = new Integer(cleartextport);
	}

	/**
	* <pre>
	* The clear text port number where clear text data is sent. Used with SSL offload service.<br> Minimum value =  1
	* </pre>
	*/
	public void set_cleartextport(Integer cleartextport) throws Exception{
		this.cleartextport = cleartextport;
	}

	/**
	* <pre>
	* The clear text port number where clear text data is sent. Used with SSL offload service.<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_cleartextport() throws Exception {
		return this.cleartextport;
	}

	/**
	* <pre>
	* The cache type option supported by the cache server.<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public void set_cachetype(String cachetype) throws Exception{
		this.cachetype = cachetype;
	}

	/**
	* <pre>
	* The cache type option supported by the cache server.<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* The maximum number of open connections to the service.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxclient(long maxclient) throws Exception {
		this.maxclient = new Long(maxclient);
	}

	/**
	* <pre>
	* The maximum number of open connections to the service.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxclient(Long maxclient) throws Exception{
		this.maxclient = maxclient;
	}

	/**
	* <pre>
	* The maximum number of open connections to the service.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_maxclient() throws Exception {
		return this.maxclient;
	}

	/**
	* <pre>
	* Health monitoring state of the service.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_healthmonitor(String healthmonitor) throws Exception{
		this.healthmonitor = healthmonitor;
	}

	/**
	* <pre>
	* Health monitoring state of the service.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_healthmonitor() throws Exception {
		return this.healthmonitor;
	}

	/**
	* <pre>
	* The maximum number of requests that can be sent on a persistent connection to the service.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxreq(long maxreq) throws Exception {
		this.maxreq = new Long(maxreq);
	}

	/**
	* <pre>
	* The maximum number of requests that can be sent on a persistent connection to the service.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxreq(Long maxreq) throws Exception{
		this.maxreq = maxreq;
	}

	/**
	* <pre>
	* The maximum number of requests that can be sent on a persistent connection to the service.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxreq() throws Exception {
		return this.maxreq;
	}

	/**
	* <pre>
	* The virtual server (used in load balancing or content switching) routes a request to the virtual server (used in transparent cache redirection) on the same system before sending it to the configured servers. The virtual server used for transparent cache redirection determines if the request is directed to the cache servers or configured servers.
Note:	This argument is disabled by default. Do not specify this argument if a -cacheType cacheType is specified.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cacheable(String cacheable) throws Exception{
		this.cacheable = cacheable;
	}

	/**
	* <pre>
	* The virtual server (used in load balancing or content switching) routes a request to the virtual server (used in transparent cache redirection) on the same system before sending it to the configured servers. The virtual server used for transparent cache redirection determines if the request is directed to the cache servers or configured servers.
Note:	This argument is disabled by default. Do not specify this argument if a -cacheType cacheType is specified.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cacheable() throws Exception {
		return this.cacheable;
	}

	/**
	* <pre>
	* The Client IP header insertion option for the service.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cip(String cip) throws Exception{
		this.cip = cip;
	}

	/**
	* <pre>
	* The Client IP header insertion option for the service.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cip() throws Exception {
		return this.cip;
	}

	/**
	* <pre>
	* The client IP header. If client IP insertion is enabled and the client IP header is not specified, then the value set by the ###set ns param### command will be used as the Client IP header.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cipheader(String cipheader) throws Exception{
		this.cipheader = cipheader;
	}

	/**
	* <pre>
	* The client IP header. If client IP insertion is enabled and the client IP header is not specified, then the value set by the ###set ns param### command will be used as the Client IP header.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cipheader() throws Exception {
		return this.cipheader;
	}

	/**
	* <pre>
	* The use of client's IP Address option to the source IP Address while connecting to this server.
By default, the system uses a mapped IP address for its server connection; however, you can use this option to tell the system to use the client's IP address when it communicates with the server.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_usip(String usip) throws Exception{
		this.usip = usip;
	}

	/**
	* <pre>
	* The use of client's IP Address option to the source IP Address while connecting to this server.
By default, the system uses a mapped IP address for its server connection; however, you can use this option to tell the system to use the client's IP address when it communicates with the server.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_usip() throws Exception {
		return this.usip;
	}

	/**
	* <pre>
	* Path monitoring for clustering.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_pathmonitor(String pathmonitor) throws Exception{
		this.pathmonitor = pathmonitor;
	}

	/**
	* <pre>
	* Path monitoring for clustering.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_pathmonitor() throws Exception {
		return this.pathmonitor;
	}

	/**
	* <pre>
	* Individual Path monitoring decisions.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_pathmonitorindv(String pathmonitorindv) throws Exception{
		this.pathmonitorindv = pathmonitorindv;
	}

	/**
	* <pre>
	* Individual Path monitoring decisions.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_pathmonitorindv() throws Exception {
		return this.pathmonitorindv;
	}

	/**
	* <pre>
	* When USIP is enabled, based on the setting of this variable proxy port or the client port will be used as the source port for the backend connection.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_useproxyport(String useproxyport) throws Exception{
		this.useproxyport = useproxyport;
	}

	/**
	* <pre>
	* When USIP is enabled, based on the setting of this variable proxy port or the client port will be used as the source port for the backend connection.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_useproxyport() throws Exception {
		return this.useproxyport;
	}

	/**
	* <pre>
	* The state of SureConnect for the service.
Note:	This parameter is supported for legacy purposes only. It has no effect on this system, and its only valid value is OFF.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sc(String sc) throws Exception{
		this.sc = sc;
	}

	/**
	* <pre>
	* The state of SureConnect for the service.
Note:	This parameter is supported for legacy purposes only. It has no effect on this system, and its only valid value is OFF.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sc() throws Exception {
		return this.sc;
	}

	/**
	* <pre>
	* The state of Surge protection for the the service.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sp(String sp) throws Exception{
		this.sp = sp;
	}

	/**
	* <pre>
	* The state of Surge protection for the the service.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sp() throws Exception {
		return this.sp;
	}

	/**
	* <pre>
	* Use this parameter to enable mapping of RTSP sessionid.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_rtspsessionidremap(String rtspsessionidremap) throws Exception{
		this.rtspsessionidremap = rtspsessionidremap;
	}

	/**
	* <pre>
	* Use this parameter to enable mapping of RTSP sessionid.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_rtspsessionidremap() throws Exception {
		return this.rtspsessionidremap;
	}

	/**
	* <pre>
	* The idle time (in seconds) after which the client connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* The idle time (in seconds) after which the client connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* The idle time (in seconds) after which the client connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* The idle time (in seconds) after which the server connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_svrtimeout(long svrtimeout) throws Exception {
		this.svrtimeout = new Long(svrtimeout);
	}

	/**
	* <pre>
	* The idle time (in seconds) after which the server connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_svrtimeout(Long svrtimeout) throws Exception{
		this.svrtimeout = svrtimeout;
	}

	/**
	* <pre>
	* The idle time (in seconds) after which the server connection is terminated.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_svrtimeout() throws Exception {
		return this.svrtimeout;
	}

	/**
	* <pre>
	* The  identifier for the service. This is used when the persistency type is set to Custom Server ID.<br> Default value: "None"
	* </pre>
	*/
	public void set_customserverid(String customserverid) throws Exception{
		this.customserverid = customserverid;
	}

	/**
	* <pre>
	* The  identifier for the service. This is used when the persistency type is set to Custom Server ID.<br> Default value: "None"
	* </pre>
	*/
	public String get_customserverid() throws Exception {
		return this.customserverid;
	}

	/**
	* <pre>
	* The  identifier for the service. This is used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public void set_serverid(long serverid) throws Exception {
		this.serverid = new Long(serverid);
	}

	/**
	* <pre>
	* The  identifier for the service. This is used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public void set_serverid(Long serverid) throws Exception{
		this.serverid = serverid;
	}

	/**
	* <pre>
	* The  identifier for the service. This is used when the persistency type is set to Custom Server ID.
	* </pre>
	*/
	public Long get_serverid() throws Exception {
		return this.serverid;
	}

	/**
	* <pre>
	* The state of the Client Keep-Alive feature for the service.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cka(String cka) throws Exception{
		this.cka = cka;
	}

	/**
	* <pre>
	* The state of the Client Keep-Alive feature for the service.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cka() throws Exception {
		return this.cka;
	}

	/**
	* <pre>
	* The state of the TCP Buffering feature for the service.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_tcpb(String tcpb) throws Exception{
		this.tcpb = tcpb;
	}

	/**
	* <pre>
	* The state of the TCP Buffering feature for the service.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_tcpb() throws Exception {
		return this.tcpb;
	}

	/**
	* <pre>
	* The state of the HTTP Compression feature for the service.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cmp(String cmp) throws Exception{
		this.cmp = cmp;
	}

	/**
	* <pre>
	* The state of the HTTP Compression feature for the service.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cmp() throws Exception {
		return this.cmp;
	}

	/**
	* <pre>
	* The maximum bandwidth in kbps allowed for the service.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_maxbandwidth(long maxbandwidth) throws Exception {
		this.maxbandwidth = new Long(maxbandwidth);
	}

	/**
	* <pre>
	* The maximum bandwidth in kbps allowed for the service.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_maxbandwidth(Long maxbandwidth) throws Exception{
		this.maxbandwidth = maxbandwidth;
	}

	/**
	* <pre>
	* The maximum bandwidth in kbps allowed for the service.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public Long get_maxbandwidth() throws Exception {
		return this.maxbandwidth;
	}

	/**
	* <pre>
	* The option to allow access to disabled or down services. If enabled, all packets to this service are bridged.  If disabled, they are dropped.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_accessdown(String accessdown) throws Exception{
		this.accessdown = accessdown;
	}

	/**
	* <pre>
	* The option to allow access to disabled or down services. If enabled, all packets to this service are bridged.  If disabled, they are dropped.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_accessdown() throws Exception {
		return this.accessdown;
	}

	/**
	* <pre>
	* The monitoring threshold.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_monthreshold(long monthreshold) throws Exception {
		this.monthreshold = new Long(monthreshold);
	}

	/**
	* <pre>
	* The monitoring threshold.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_monthreshold(Long monthreshold) throws Exception{
		this.monthreshold = monthreshold;
	}

	/**
	* <pre>
	* The monitoring threshold.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_monthreshold() throws Exception {
		return this.monthreshold;
	}

	/**
	* <pre>
	* The state of the service after it is added.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the service after it is added.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Perform delayed clean up of connections on this service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Perform delayed clean up of connections on this service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
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
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(long hashid) throws Exception {
		this.hashid = new Long(hashid);
	}

	/**
	* <pre>
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(Long hashid) throws Exception{
		this.hashid = hashid;
	}

	/**
	* <pre>
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_hashid() throws Exception {
		return this.hashid;
	}

	/**
	* <pre>
	* Comments associated with this server.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this server.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
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
	* The new IP address of the service.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The new IP address of the service.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The monitor name bound to the selected service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitor_name_svc(String monitor_name_svc) throws Exception{
		this.monitor_name_svc = monitor_name_svc;
	}

	/**
	* <pre>
	* The monitor name bound to the selected service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitor_name_svc() throws Exception {
		return this.monitor_name_svc;
	}

	/**
	* <pre>
	* The time allowed (in seconds) for a graceful shutdown. During this period, new connections and requests continue to be sent to the service for clients who already have persistent sessions on the system. Connections or requests from fresh or new clients who do not yet have a persistence sessions on the NetScaler system are not sent to the service. Instead, they are load balanced among other available services. After the delay time has passed, no new requests or connections are sent to the service.
	* </pre>
	*/
	public void set_delay(long delay) throws Exception {
		this.delay = new Long(delay);
	}

	/**
	* <pre>
	* The time allowed (in seconds) for a graceful shutdown. During this period, new connections and requests continue to be sent to the service for clients who already have persistent sessions on the system. Connections or requests from fresh or new clients who do not yet have a persistence sessions on the NetScaler system are not sent to the service. Instead, they are load balanced among other available services. After the delay time has passed, no new requests or connections are sent to the service.
	* </pre>
	*/
	public void set_delay(Long delay) throws Exception{
		this.delay = delay;
	}

	/**
	* <pre>
	* The time allowed (in seconds) for a graceful shutdown. During this period, new connections and requests continue to be sent to the service for clients who already have persistent sessions on the system. Connections or requests from fresh or new clients who do not yet have a persistence sessions on the NetScaler system are not sent to the service. Instead, they are load balanced among other available services. After the delay time has passed, no new requests or connections are sent to the service.
	* </pre>
	*/
	public Long get_delay() throws Exception {
		return this.delay;
	}

	/**
	* <pre>
	* Indicates graceful shutdown of the service. System will wait for all outstanding connections to this service to be closed before disabling the service.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_graceful(String graceful) throws Exception{
		this.graceful = graceful;
	}

	/**
	* <pre>
	* Indicates graceful shutdown of the service. System will wait for all outstanding connections to this service to be closed before disabling the service.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_graceful() throws Exception {
		return this.graceful;
	}

	/**
	* <pre>
	* Display both configured and dynamically learned services. If you do not use this option, only the configured services are displayed.
	* </pre>
	*/
	public void set_all(boolean all) throws Exception {
		this.all = new Boolean(all);
	}

	/**
	* <pre>
	* Display both configured and dynamically learned services. If you do not use this option, only the configured services are displayed.
	* </pre>
	*/
	public void set_all(Boolean all) throws Exception{
		this.all = all;
	}

	/**
	* <pre>
	* Display both configured and dynamically learned services. If you do not use this option, only the configured services are displayed.
	* </pre>
	*/
	public Boolean get_all() throws Exception {
		return this.all;
	}

	/**
	* <pre>
	* Display internally created named services.
	* </pre>
	*/
	public void set_Internal(boolean Internal) throws Exception {
		this.Internal = new Boolean(Internal);
	}

	/**
	* <pre>
	* Display internally created named services.
	* </pre>
	*/
	public void set_Internal(Boolean Internal) throws Exception{
		this.Internal = Internal;
	}

	/**
	* <pre>
	* Display internally created named services.
	* </pre>
	*/
	public Boolean get_Internal() throws Exception {
		return this.Internal;
	}

	/**
	* <pre>
	* The new name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* This will tell the number of client side connections are still open.
	* </pre>
	*/
	public Integer get_numofconnections() throws Exception {
		return this.numofconnections;
	}

	/**
	* <pre>
	* The name of the policyname for which this service is bound.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The configuration type of the service.
	* </pre>
	*/
	public Boolean get_serviceconftpye() throws Exception {
		return this.serviceconftpye;
	}

	/**
	* <pre>
	* The configuration type of the service.
	* </pre>
	*/
	public Boolean get_serviceconftype() throws Exception {
		return this.serviceconftype;
	}

	/**
	* <pre>
	* The configuration type of the service (Internal/Dynamic/Configured).<br> Possible values = Configured, Dynamic, Internal
	* </pre>
	*/
	public String get_serviceconftype2() throws Exception {
		return this.serviceconftype2;
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
	* The GSLB option for the corresponding virtual server.<br> Possible values = REMOTE, LOCAL
	* </pre>
	*/
	public String get_gslb() throws Exception {
		return this.gslb;
	}

	/**
	* <pre>
	* Added this field for getting state value from table.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dup_state() throws Exception {
		return this.dup_state;
	}

	/**
	* <pre>
	* public ip.
	* </pre>
	*/
	public String get_publicip() throws Exception {
		return this.publicip;
	}

	/**
	* <pre>
	* public port.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_publicport() throws Exception {
		return this.publicport;
	}

	/**
	* <pre>
	* The state of the service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_svrstate() throws Exception {
		return this.svrstate;
	}

	/**
	* <pre>
	* The running state of the monitor on this service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_monitor_state() throws Exception {
		return this.monitor_state;
	}

	/**
	* <pre>
	* The code indicating the monitor response.
	* </pre>
	*/
	public Integer get_monstatcode() throws Exception {
		return this.monstatcode;
	}

	/**
	* <pre>
	* The string form of monstatcode.
	* </pre>
	*/
	public String get_lastresponse() throws Exception {
		return this.lastresponse;
	}

	/**
	* <pre>
	* Response time of this monitor.
	* </pre>
	*/
	public Long get_responsetime() throws Exception {
		return this.responsetime;
	}

	/**
	* <pre>
	* First parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam1() throws Exception {
		return this.monstatparam1;
	}

	/**
	* <pre>
	* Second parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam2() throws Exception {
		return this.monstatparam2;
	}

	/**
	* <pre>
	* Third parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam3() throws Exception {
		return this.monstatparam3;
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
	* Time in milliseconds since the last state change.
	* </pre>
	*/
	public Long get_timesincelaststatechange() throws Exception {
		return this.timesincelaststatechange;
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
	* Checks state update reason on the secondary node.
	* </pre>
	*/
	public Long get_stateupdatereason() throws Exception {
		return this.stateupdatereason;
	}

	/**
	* <pre>
	* Tells the mon owner of the service.
	* </pre>
	*/
	public Long get_clmonowner() throws Exception {
		return this.clmonowner;
	}

	/**
	* <pre>
	* Tells the view id of the monitoring owner.
	* </pre>
	*/
	public Long get_clmonview() throws Exception {
		return this.clmonview;
	}

	/**
	* <pre>
	* This field has been intorduced to show the dbs services ip.
	* </pre>
	*/
	public String get_serviceipstr() throws Exception {
		return this.serviceipstr;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		service_response result = (service_response) service.get_payload_formatter().string_to_resource(service_response.class, response);
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
		return result.service;
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
	* Use this API to add service.
	*/
	public static base_response add(nitro_service client, service resource) throws Exception {
		service addresource = new service();
		addresource.name = resource.name;
		addresource.ip = resource.ip;
		addresource.servername = resource.servername;
		addresource.servicetype = resource.servicetype;
		addresource.port = resource.port;
		addresource.cleartextport = resource.cleartextport;
		addresource.cachetype = resource.cachetype;
		addresource.maxclient = resource.maxclient;
		addresource.healthmonitor = resource.healthmonitor;
		addresource.maxreq = resource.maxreq;
		addresource.cacheable = resource.cacheable;
		addresource.cip = resource.cip;
		addresource.cipheader = resource.cipheader;
		addresource.usip = resource.usip;
		addresource.pathmonitor = resource.pathmonitor;
		addresource.pathmonitorindv = resource.pathmonitorindv;
		addresource.useproxyport = resource.useproxyport;
		addresource.sc = resource.sc;
		addresource.sp = resource.sp;
		addresource.rtspsessionidremap = resource.rtspsessionidremap;
		addresource.clttimeout = resource.clttimeout;
		addresource.svrtimeout = resource.svrtimeout;
		addresource.customserverid = resource.customserverid;
		addresource.serverid = resource.serverid;
		addresource.cka = resource.cka;
		addresource.tcpb = resource.tcpb;
		addresource.cmp = resource.cmp;
		addresource.maxbandwidth = resource.maxbandwidth;
		addresource.accessdown = resource.accessdown;
		addresource.monthreshold = resource.monthreshold;
		addresource.state = resource.state;
		addresource.downstateflush = resource.downstateflush;
		addresource.tcpprofilename = resource.tcpprofilename;
		addresource.httpprofilename = resource.httpprofilename;
		addresource.hashid = resource.hashid;
		addresource.comment = resource.comment;
		addresource.appflowlog = resource.appflowlog;
		addresource.netprofile = resource.netprofile;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add service resources.
	*/
	public static base_responses add(nitro_service client, service resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service addresources[] = new service[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new service();
				addresources[i].name = resources[i].name;
				addresources[i].ip = resources[i].ip;
				addresources[i].servername = resources[i].servername;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].port = resources[i].port;
				addresources[i].cleartextport = resources[i].cleartextport;
				addresources[i].cachetype = resources[i].cachetype;
				addresources[i].maxclient = resources[i].maxclient;
				addresources[i].healthmonitor = resources[i].healthmonitor;
				addresources[i].maxreq = resources[i].maxreq;
				addresources[i].cacheable = resources[i].cacheable;
				addresources[i].cip = resources[i].cip;
				addresources[i].cipheader = resources[i].cipheader;
				addresources[i].usip = resources[i].usip;
				addresources[i].pathmonitor = resources[i].pathmonitor;
				addresources[i].pathmonitorindv = resources[i].pathmonitorindv;
				addresources[i].useproxyport = resources[i].useproxyport;
				addresources[i].sc = resources[i].sc;
				addresources[i].sp = resources[i].sp;
				addresources[i].rtspsessionidremap = resources[i].rtspsessionidremap;
				addresources[i].clttimeout = resources[i].clttimeout;
				addresources[i].svrtimeout = resources[i].svrtimeout;
				addresources[i].customserverid = resources[i].customserverid;
				addresources[i].serverid = resources[i].serverid;
				addresources[i].cka = resources[i].cka;
				addresources[i].tcpb = resources[i].tcpb;
				addresources[i].cmp = resources[i].cmp;
				addresources[i].maxbandwidth = resources[i].maxbandwidth;
				addresources[i].accessdown = resources[i].accessdown;
				addresources[i].monthreshold = resources[i].monthreshold;
				addresources[i].state = resources[i].state;
				addresources[i].downstateflush = resources[i].downstateflush;
				addresources[i].tcpprofilename = resources[i].tcpprofilename;
				addresources[i].httpprofilename = resources[i].httpprofilename;
				addresources[i].hashid = resources[i].hashid;
				addresources[i].comment = resources[i].comment;
				addresources[i].appflowlog = resources[i].appflowlog;
				addresources[i].netprofile = resources[i].netprofile;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete service of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		service deleteresource = new service();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete service.
	*/
	public static base_response delete(nitro_service client, service resource) throws Exception {
		service deleteresource = new service();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete service resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			service deleteresources[] = new service[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new service();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete service resources.
	*/
	public static base_responses delete(nitro_service client, service resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service deleteresources[] = new service[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new service();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update service.
	*/
	public static base_response update(nitro_service client, service resource) throws Exception {
		service updateresource = new service();
		updateresource.name = resource.name;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.maxclient = resource.maxclient;
		updateresource.maxreq = resource.maxreq;
		updateresource.cacheable = resource.cacheable;
		updateresource.cip = resource.cip;
		updateresource.cipheader = resource.cipheader;
		updateresource.usip = resource.usip;
		updateresource.pathmonitor = resource.pathmonitor;
		updateresource.pathmonitorindv = resource.pathmonitorindv;
		updateresource.useproxyport = resource.useproxyport;
		updateresource.sc = resource.sc;
		updateresource.sp = resource.sp;
		updateresource.rtspsessionidremap = resource.rtspsessionidremap;
		updateresource.healthmonitor = resource.healthmonitor;
		updateresource.clttimeout = resource.clttimeout;
		updateresource.svrtimeout = resource.svrtimeout;
		updateresource.customserverid = resource.customserverid;
		updateresource.serverid = resource.serverid;
		updateresource.cka = resource.cka;
		updateresource.tcpb = resource.tcpb;
		updateresource.cmp = resource.cmp;
		updateresource.maxbandwidth = resource.maxbandwidth;
		updateresource.accessdown = resource.accessdown;
		updateresource.monthreshold = resource.monthreshold;
		updateresource.weight = resource.weight;
		updateresource.monitor_name_svc = resource.monitor_name_svc;
		updateresource.downstateflush = resource.downstateflush;
		updateresource.tcpprofilename = resource.tcpprofilename;
		updateresource.httpprofilename = resource.httpprofilename;
		updateresource.hashid = resource.hashid;
		updateresource.comment = resource.comment;
		updateresource.appflowlog = resource.appflowlog;
		updateresource.netprofile = resource.netprofile;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update service resources.
	*/
	public static base_responses update(nitro_service client, service resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service updateresources[] = new service[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new service();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].maxclient = resources[i].maxclient;
				updateresources[i].maxreq = resources[i].maxreq;
				updateresources[i].cacheable = resources[i].cacheable;
				updateresources[i].cip = resources[i].cip;
				updateresources[i].cipheader = resources[i].cipheader;
				updateresources[i].usip = resources[i].usip;
				updateresources[i].pathmonitor = resources[i].pathmonitor;
				updateresources[i].pathmonitorindv = resources[i].pathmonitorindv;
				updateresources[i].useproxyport = resources[i].useproxyport;
				updateresources[i].sc = resources[i].sc;
				updateresources[i].sp = resources[i].sp;
				updateresources[i].rtspsessionidremap = resources[i].rtspsessionidremap;
				updateresources[i].healthmonitor = resources[i].healthmonitor;
				updateresources[i].clttimeout = resources[i].clttimeout;
				updateresources[i].svrtimeout = resources[i].svrtimeout;
				updateresources[i].customserverid = resources[i].customserverid;
				updateresources[i].serverid = resources[i].serverid;
				updateresources[i].cka = resources[i].cka;
				updateresources[i].tcpb = resources[i].tcpb;
				updateresources[i].cmp = resources[i].cmp;
				updateresources[i].maxbandwidth = resources[i].maxbandwidth;
				updateresources[i].accessdown = resources[i].accessdown;
				updateresources[i].monthreshold = resources[i].monthreshold;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].monitor_name_svc = resources[i].monitor_name_svc;
				updateresources[i].downstateflush = resources[i].downstateflush;
				updateresources[i].tcpprofilename = resources[i].tcpprofilename;
				updateresources[i].httpprofilename = resources[i].httpprofilename;
				updateresources[i].hashid = resources[i].hashid;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].appflowlog = resources[i].appflowlog;
				updateresources[i].netprofile = resources[i].netprofile;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of service resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		service unsetresource = new service();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of service resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, service resource, String[] args) throws Exception{
		service unsetresource = new service();
		unsetresource.name = resource.name;
		unsetresource.maxclient = resource.maxclient;
		unsetresource.maxreq = resource.maxreq;
		unsetresource.cacheable = resource.cacheable;
		unsetresource.cip = resource.cip;
		unsetresource.usip = resource.usip;
		unsetresource.pathmonitor = resource.pathmonitor;
		unsetresource.pathmonitorindv = resource.pathmonitorindv;
		unsetresource.useproxyport = resource.useproxyport;
		unsetresource.sc = resource.sc;
		unsetresource.sp = resource.sp;
		unsetresource.rtspsessionidremap = resource.rtspsessionidremap;
		unsetresource.customserverid = resource.customserverid;
		unsetresource.serverid = resource.serverid;
		unsetresource.cka = resource.cka;
		unsetresource.tcpb = resource.tcpb;
		unsetresource.cmp = resource.cmp;
		unsetresource.maxbandwidth = resource.maxbandwidth;
		unsetresource.accessdown = resource.accessdown;
		unsetresource.monthreshold = resource.monthreshold;
		unsetresource.clttimeout = resource.clttimeout;
		unsetresource.svrtimeout = resource.svrtimeout;
		unsetresource.tcpprofilename = resource.tcpprofilename;
		unsetresource.httpprofilename = resource.httpprofilename;
		unsetresource.hashid = resource.hashid;
		unsetresource.appflowlog = resource.appflowlog;
		unsetresource.netprofile = resource.netprofile;
		unsetresource.cipheader = resource.cipheader;
		unsetresource.healthmonitor = resource.healthmonitor;
		unsetresource.monitor_name_svc = resource.monitor_name_svc;
		unsetresource.downstateflush = resource.downstateflush;
		unsetresource.comment = resource.comment;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of service resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			service unsetresources[] = new service[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new service();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of service resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, service resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service unsetresources[] = new service[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new service();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].maxclient = resources[i].maxclient;
				unsetresources[i].maxreq = resources[i].maxreq;
				unsetresources[i].cacheable = resources[i].cacheable;
				unsetresources[i].cip = resources[i].cip;
				unsetresources[i].usip = resources[i].usip;
				unsetresources[i].pathmonitor = resources[i].pathmonitor;
				unsetresources[i].pathmonitorindv = resources[i].pathmonitorindv;
				unsetresources[i].useproxyport = resources[i].useproxyport;
				unsetresources[i].sc = resources[i].sc;
				unsetresources[i].sp = resources[i].sp;
				unsetresources[i].rtspsessionidremap = resources[i].rtspsessionidremap;
				unsetresources[i].customserverid = resources[i].customserverid;
				unsetresources[i].serverid = resources[i].serverid;
				unsetresources[i].cka = resources[i].cka;
				unsetresources[i].tcpb = resources[i].tcpb;
				unsetresources[i].cmp = resources[i].cmp;
				unsetresources[i].maxbandwidth = resources[i].maxbandwidth;
				unsetresources[i].accessdown = resources[i].accessdown;
				unsetresources[i].monthreshold = resources[i].monthreshold;
				unsetresources[i].clttimeout = resources[i].clttimeout;
				unsetresources[i].svrtimeout = resources[i].svrtimeout;
				unsetresources[i].tcpprofilename = resources[i].tcpprofilename;
				unsetresources[i].httpprofilename = resources[i].httpprofilename;
				unsetresources[i].hashid = resources[i].hashid;
				unsetresources[i].appflowlog = resources[i].appflowlog;
				unsetresources[i].netprofile = resources[i].netprofile;
				unsetresources[i].cipheader = resources[i].cipheader;
				unsetresources[i].healthmonitor = resources[i].healthmonitor;
				unsetresources[i].monitor_name_svc = resources[i].monitor_name_svc;
				unsetresources[i].downstateflush = resources[i].downstateflush;
				unsetresources[i].comment = resources[i].comment;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable service of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		service enableresource = new service();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable service.
	*/
	public static base_response enable(nitro_service client, service resource) throws Exception {
		service enableresource = new service();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable service resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			service enableresources[] = new service[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new service();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable service resources.
	*/
	public static base_responses enable(nitro_service client, service resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service enableresources[] = new service[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new service();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable service of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		service disableresource = new service();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable service.
	*/
	public static base_response disable(nitro_service client, service resource) throws Exception {
		service disableresource = new service();
		disableresource.name = resource.name;
		disableresource.delay = resource.delay;
		disableresource.graceful = resource.graceful;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable service resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			service disableresources[] = new service[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new service();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable service resources.
	*/
	public static base_responses disable(nitro_service client, service resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service disableresources[] = new service[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new service();
				disableresources[i].name = resources[i].name;
				disableresources[i].delay = resources[i].delay;
				disableresources[i].graceful = resources[i].graceful;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a service resource.
	*/
	public static base_response rename(nitro_service client, service resource, String new_name) throws Exception {
		service renameresource = new service();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a service resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		service renameresource = new service();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the service resources that are configured on netscaler.
	*/
	public static service[] get(nitro_service service) throws Exception{
		service obj = new service();
		service[] response = (service[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the service resources that are configured on netscaler.
	*/
	public static service[] get(nitro_service service, options option) throws Exception{
		service obj = new service();
		service[] response = (service[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the service resources that are configured on netscaler.
	* This uses service_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static service[] get(nitro_service service, service_args args) throws Exception{
		service obj = new service();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		service[] response = (service[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch service resource of given name .
	*/
	public static service get(nitro_service service, String name) throws Exception{
		service obj = new service();
		obj.set_name(name);
		service response = (service) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch service resources of given names .
	*/
	public static service[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			service response[] = new service[name.length];
			service obj[] = new service[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new service();
				obj[i].set_name(name[i]);
				response[i] = (service) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of service resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static service[] get_filtered(nitro_service service, String filter) throws Exception{
		service obj = new service();
		options option = new options();
		option.set_filter(filter);
		service[] response = (service[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of service resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static service[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		service obj = new service();
		options option = new options();
		option.set_filter(filter);
		service[] response = (service[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the service resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		service obj = new service();
		options option = new options();
		option.set_count(true);
		service[] response = (service[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of service resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		service obj = new service();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		service[] response = (service[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of service resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		service obj = new service();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		service[] response = (service[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class spEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class scEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
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
		public static final String RPCSVR = "RPCSVR";
		public static final String DNS = "DNS";
		public static final String ADNS = "ADNS";
		public static final String SNMP = "SNMP";
		public static final String RTSP = "RTSP";
		public static final String DHCPRA = "DHCPRA";
		public static final String ANY = "ANY";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String DNS_TCP = "DNS_TCP";
		public static final String ADNS_TCP = "ADNS_TCP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
	}
	public static class svrstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
	}
	public static class monitor_stateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
	}
	public static class valueEnum {
		public static final String Certkey_not_bound = "Certkey not bound";
		public static final String SSL_feature_disabled = "SSL feature disabled";
	}
	public static class useproxyportEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class gslbEnum {
		public static final String REMOTE = "REMOTE";
		public static final String LOCAL = "LOCAL";
	}
	public static class usipEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cacheableEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class serviceconftype2Enum {
		public static final String Configured = "Configured";
		public static final String Dynamic = "Dynamic";
		public static final String Internal = "Internal";
	}
	public static class pathmonitorEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class tcpbEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class pathmonitorindvEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class healthmonitorEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class ckaEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dup_stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class accessdownEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cmpEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class rtspsessionidremapEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class gracefulEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
