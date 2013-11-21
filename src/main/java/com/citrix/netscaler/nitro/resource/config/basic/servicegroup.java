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

class servicegroup_response extends base_response
{
	public servicegroup[] servicegroup;
}
/**
* Configuration for service group resource.
*/

public class servicegroup extends base_resource
{
	private String servicegroupname;
	private String servicetype;
	private String cachetype;
	private Long td;
	private Long maxclient;
	private Long maxreq;
	private String cacheable;
	private String cip;
	private String cipheader;
	private String usip;
	private String pathmonitor;
	private String pathmonitorindv;
	private String useproxyport;
	private String healthmonitor;
	private String sc;
	private String sp;
	private String rtspsessionidremap;
	private Long clttimeout;
	private Long svrtimeout;
	private String cka;
	private String tcpb;
	private String cmp;
	private Long maxbandwidth;
	private Long monthreshold;
	private String state;
	private String downstateflush;
	private String tcpprofilename;
	private String httpprofilename;
	private String comment;
	private String appflowlog;
	private String netprofile;
	private String autoscale;
	private Integer memberport;
	private String servername;
	private Integer port;
	private Long weight;
	private String customserverid;
	private Long serverid;
	private Long hashid;
	private String monitor_name_svc;
	private Long dup_weight;
	private Long delay;
	private String graceful;
	private Boolean includemembers;
	private String newname;

	//------- Read only Parameter ---------;

	private Integer numofconnections;
	private Boolean serviceconftype;
	private String value;
	private String svrstate;
	private String ip;
	private String monitor_state;
	private Integer monstatcode;
	private Integer monstatparam1;
	private Integer monstatparam2;
	private Integer monstatparam3;
	private Long monitortotalprobes;
	private Long monitortotalfailedprobes;
	private Long monitorcurrentfailedprobes;
	private String statechangetimesec;
	private Long statechangetimemsec;
	private Long tickssincelaststatechange;
	private Long stateupdatereason;
	private Long clmonowner;
	private Long clmonview;
	private Long groupcount;
	private String serviceipstr;
	private Long __count;

	/**
	* <pre>
	* Name of the service group. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the name is created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* Name of the service group. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the name is created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* Protocol used to exchange data with the service.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, DTLS, NNTP, RPCSVR, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, SIP_UDP, DNS_TCP, ADNS_TCP, MYSQL, MSSQL, RADIUS, RDP, DIAMETER, SSL_DIAMETER, TFTP
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* Protocol used to exchange data with the service.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, DTLS, NNTP, RPCSVR, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, SIP_UDP, DNS_TCP, ADNS_TCP, MYSQL, MSSQL, RADIUS, RDP, DIAMETER, SSL_DIAMETER, TFTP
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* Cache type supported by the cache server.<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public void set_cachetype(String cachetype) throws Exception{
		this.cachetype = cachetype;
	}

	/**
	* <pre>
	* Cache type supported by the cache server.<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* Maximum number of simultaneous open connections for the service group.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxclient(long maxclient) throws Exception {
		this.maxclient = new Long(maxclient);
	}

	/**
	* <pre>
	* Maximum number of simultaneous open connections for the service group.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxclient(Long maxclient) throws Exception{
		this.maxclient = maxclient;
	}

	/**
	* <pre>
	* Maximum number of simultaneous open connections for the service group.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_maxclient() throws Exception {
		return this.maxclient;
	}

	/**
	* <pre>
	* Maximum number of requests that can be sent on a persistent connection to the service group. 
Note: Connection requests beyond this value are rejected.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxreq(long maxreq) throws Exception {
		this.maxreq = new Long(maxreq);
	}

	/**
	* <pre>
	* Maximum number of requests that can be sent on a persistent connection to the service group. 
Note: Connection requests beyond this value are rejected.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxreq(Long maxreq) throws Exception{
		this.maxreq = maxreq;
	}

	/**
	* <pre>
	* Maximum number of requests that can be sent on a persistent connection to the service group. 
Note: Connection requests beyond this value are rejected.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxreq() throws Exception {
		return this.maxreq;
	}

	/**
	* <pre>
	* Use the transparent cache redirection virtual server to forward the request to the cache server.
Note: Do not set this parameter if you set the Cache Type.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cacheable(String cacheable) throws Exception{
		this.cacheable = cacheable;
	}

	/**
	* <pre>
	* Use the transparent cache redirection virtual server to forward the request to the cache server.
Note: Do not set this parameter if you set the Cache Type.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cacheable() throws Exception {
		return this.cacheable;
	}

	/**
	* <pre>
	* Insert the Client IP header in requests forwarded to the service.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cip(String cip) throws Exception{
		this.cip = cip;
	}

	/**
	* <pre>
	* Insert the Client IP header in requests forwarded to the service.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cip() throws Exception {
		return this.cip;
	}

	/**
	* <pre>
	* Name of the HTTP header whose value must be set to the IP address of the client. Used with the Client IP parameter. If client IP insertion is enabled, and the client IP header is not specified, the value of Client IP Header parameter or the value set by the set ns config command is used as client's IP header name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cipheader(String cipheader) throws Exception{
		this.cipheader = cipheader;
	}

	/**
	* <pre>
	* Name of the HTTP header whose value must be set to the IP address of the client. Used with the Client IP parameter. If client IP insertion is enabled, and the client IP header is not specified, the value of Client IP Header parameter or the value set by the set ns config command is used as client's IP header name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cipheader() throws Exception {
		return this.cipheader;
	}

	/**
	* <pre>
	* Use client's IP address as the source IP address when initiating connection to the server. With the NO setting, which is the default, a mapped IP (MIP) address or subnet IP (SNIP) address is used as the source IP address to initiate server side connections.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_usip(String usip) throws Exception{
		this.usip = usip;
	}

	/**
	* <pre>
	* Use client's IP address as the source IP address when initiating connection to the server. With the NO setting, which is the default, a mapped IP (MIP) address or subnet IP (SNIP) address is used as the source IP address to initiate server side connections.<br> Possible values = YES, NO
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
	* Use the proxy port as the source port when initiating connections with the server. With the NO setting, the client-side connection port is used as the source port for the server-side connection. 
Note: This parameter is available only when the Use Source IP (USIP) parameter is set to YES.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_useproxyport(String useproxyport) throws Exception{
		this.useproxyport = useproxyport;
	}

	/**
	* <pre>
	* Use the proxy port as the source port when initiating connections with the server. With the NO setting, the client-side connection port is used as the source port for the server-side connection. 
Note: This parameter is available only when the Use Source IP (USIP) parameter is set to YES.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_useproxyport() throws Exception {
		return this.useproxyport;
	}

	/**
	* <pre>
	* Monitor the health of this service.  Available settings function as follows:
YES - Send probes to check the health of the service.
NO - Do not send probes to check the health of the service. With the NO option, the appliance shows the service as UP at all times.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_healthmonitor(String healthmonitor) throws Exception{
		this.healthmonitor = healthmonitor;
	}

	/**
	* <pre>
	* Monitor the health of this service.  Available settings function as follows:
YES - Send probes to check the health of the service.
NO - Do not send probes to check the health of the service. With the NO option, the appliance shows the service as UP at all times.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_healthmonitor() throws Exception {
		return this.healthmonitor;
	}

	/**
	* <pre>
	* State of the SureConnect feature for the service group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sc(String sc) throws Exception{
		this.sc = sc;
	}

	/**
	* <pre>
	* State of the SureConnect feature for the service group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sc() throws Exception {
		return this.sc;
	}

	/**
	* <pre>
	* Enable surge protection for the service group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sp(String sp) throws Exception{
		this.sp = sp;
	}

	/**
	* <pre>
	* Enable surge protection for the service group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sp() throws Exception {
		return this.sp;
	}

	/**
	* <pre>
	* Enable RTSP session ID mapping for the service group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_rtspsessionidremap(String rtspsessionidremap) throws Exception{
		this.rtspsessionidremap = rtspsessionidremap;
	}

	/**
	* <pre>
	* Enable RTSP session ID mapping for the service group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_rtspsessionidremap() throws Exception {
		return this.rtspsessionidremap;
	}

	/**
	* <pre>
	* Time, in seconds, after which to terminate an idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* Time, in seconds, after which to terminate an idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* Time, in seconds, after which to terminate an idle client connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* Time, in seconds, after which to terminate an idle server connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_svrtimeout(long svrtimeout) throws Exception {
		this.svrtimeout = new Long(svrtimeout);
	}

	/**
	* <pre>
	* Time, in seconds, after which to terminate an idle server connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_svrtimeout(Long svrtimeout) throws Exception{
		this.svrtimeout = svrtimeout;
	}

	/**
	* <pre>
	* Time, in seconds, after which to terminate an idle server connection.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_svrtimeout() throws Exception {
		return this.svrtimeout;
	}

	/**
	* <pre>
	* Enable client keep-alive for the service group.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cka(String cka) throws Exception{
		this.cka = cka;
	}

	/**
	* <pre>
	* Enable client keep-alive for the service group.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cka() throws Exception {
		return this.cka;
	}

	/**
	* <pre>
	* Enable TCP buffering for the service group.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_tcpb(String tcpb) throws Exception{
		this.tcpb = tcpb;
	}

	/**
	* <pre>
	* Enable TCP buffering for the service group.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_tcpb() throws Exception {
		return this.tcpb;
	}

	/**
	* <pre>
	* Enable compression for the specified service.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_cmp(String cmp) throws Exception{
		this.cmp = cmp;
	}

	/**
	* <pre>
	* Enable compression for the specified service.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_cmp() throws Exception {
		return this.cmp;
	}

	/**
	* <pre>
	* Maximum bandwidth, in Kbps, allocated for all the services in the service group.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_maxbandwidth(long maxbandwidth) throws Exception {
		this.maxbandwidth = new Long(maxbandwidth);
	}

	/**
	* <pre>
	* Maximum bandwidth, in Kbps, allocated for all the services in the service group.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_maxbandwidth(Long maxbandwidth) throws Exception{
		this.maxbandwidth = maxbandwidth;
	}

	/**
	* <pre>
	* Maximum bandwidth, in Kbps, allocated for all the services in the service group.<br> Minimum value =  0<br> Maximum value =  4294967287
	* </pre>
	*/
	public Long get_maxbandwidth() throws Exception {
		return this.maxbandwidth;
	}

	/**
	* <pre>
	* Minimum sum of weights of the monitors that are bound to this service. Used to determine whether to mark a service as UP or DOWN.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_monthreshold(long monthreshold) throws Exception {
		this.monthreshold = new Long(monthreshold);
	}

	/**
	* <pre>
	* Minimum sum of weights of the monitors that are bound to this service. Used to determine whether to mark a service as UP or DOWN.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_monthreshold(Long monthreshold) throws Exception{
		this.monthreshold = monthreshold;
	}

	/**
	* <pre>
	* Minimum sum of weights of the monitors that are bound to this service. Used to determine whether to mark a service as UP or DOWN.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_monthreshold() throws Exception {
		return this.monthreshold;
	}

	/**
	* <pre>
	* Initial state of the service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Initial state of the service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Perform delayed clean-up of connections to all services in the service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Perform delayed clean-up of connections to all services in the service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* Name of the TCP profile that contains TCP configuration settings for the service group.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_tcpprofilename(String tcpprofilename) throws Exception{
		this.tcpprofilename = tcpprofilename;
	}

	/**
	* <pre>
	* Name of the TCP profile that contains TCP configuration settings for the service group.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_tcpprofilename() throws Exception {
		return this.tcpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile that contains HTTP configuration settings for the service group.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_httpprofilename(String httpprofilename) throws Exception{
		this.httpprofilename = httpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile that contains HTTP configuration settings for the service group.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_httpprofilename() throws Exception {
		return this.httpprofilename;
	}

	/**
	* <pre>
	* Any information about the service group.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any information about the service group.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Enable logging of AppFlow information for the specified service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowlog(String appflowlog) throws Exception{
		this.appflowlog = appflowlog;
	}

	/**
	* <pre>
	* Enable logging of AppFlow information for the specified service group.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowlog() throws Exception {
		return this.appflowlog;
	}

	/**
	* <pre>
	* Network profile for the service group.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_netprofile(String netprofile) throws Exception{
		this.netprofile = netprofile;
	}

	/**
	* <pre>
	* Network profile for the service group.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_netprofile() throws Exception {
		return this.netprofile;
	}

	/**
	* <pre>
	* Auto scale option for a servicegroup.<br> Default value: DISABLED<br> Possible values = DISABLED, DNS, POLICY
	* </pre>
	*/
	public void set_autoscale(String autoscale) throws Exception{
		this.autoscale = autoscale;
	}

	/**
	* <pre>
	* Auto scale option for a servicegroup.<br> Default value: DISABLED<br> Possible values = DISABLED, DNS, POLICY
	* </pre>
	*/
	public String get_autoscale() throws Exception {
		return this.autoscale;
	}

	/**
	* <pre>
	* member port.
	* </pre>
	*/
	public void set_memberport(int memberport) throws Exception {
		this.memberport = new Integer(memberport);
	}

	/**
	* <pre>
	* member port.
	* </pre>
	*/
	public void set_memberport(Integer memberport) throws Exception{
		this.memberport = memberport;
	}

	/**
	* <pre>
	* member port.
	* </pre>
	*/
	public Integer get_memberport() throws Exception {
		return this.memberport;
	}

	/**
	* <pre>
	* Name of the server to which to bind the service group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* Name of the server to which to bind the service group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* Server port number.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Server port number.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Server port number.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Weight to assign to the servers in the service group. Specifies the capacity of the servers relative to the other servers in the load balancing configuration. The higher the weight, the higher the percentage of requests sent to the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Weight to assign to the servers in the service group. Specifies the capacity of the servers relative to the other servers in the load balancing configuration. The higher the weight, the higher the percentage of requests sent to the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Weight to assign to the servers in the service group. Specifies the capacity of the servers relative to the other servers in the load balancing configuration. The higher the weight, the higher the percentage of requests sent to the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The identifier for this IP:Port pair. Used when the persistency type is set to Custom Server ID.<br> Default value: "None"
	* </pre>
	*/
	public void set_customserverid(String customserverid) throws Exception{
		this.customserverid = customserverid;
	}

	/**
	* <pre>
	* The identifier for this IP:Port pair. Used when the persistency type is set to Custom Server ID.<br> Default value: "None"
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
	* Name of the monitor bound to the service group. Used to assign a weight to the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitor_name_svc(String monitor_name_svc) throws Exception{
		this.monitor_name_svc = monitor_name_svc;
	}

	/**
	* <pre>
	* Name of the monitor bound to the service group. Used to assign a weight to the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitor_name_svc() throws Exception {
		return this.monitor_name_svc;
	}

	/**
	* <pre>
	* weight of the monitor that is bound to servicegroup.<br> Minimum value =  1
	* </pre>
	*/
	public void set_dup_weight(long dup_weight) throws Exception {
		this.dup_weight = new Long(dup_weight);
	}

	/**
	* <pre>
	* weight of the monitor that is bound to servicegroup.<br> Minimum value =  1
	* </pre>
	*/
	public void set_dup_weight(Long dup_weight) throws Exception{
		this.dup_weight = dup_weight;
	}

	/**
	* <pre>
	* weight of the monitor that is bound to servicegroup.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_dup_weight() throws Exception {
		return this.dup_weight;
	}

	/**
	* <pre>
	* Time, in seconds, allocated for a shutdown of the services in the service group. During this period, new requests are sent to the service only for clients who already have persistent sessions on the appliance. Requests from new clients are load balanced among other available services. After the delay time expires, no requests are sent to the service, and the service is marked as unavailable (OUT OF SERVICE).
	* </pre>
	*/
	public void set_delay(long delay) throws Exception {
		this.delay = new Long(delay);
	}

	/**
	* <pre>
	* Time, in seconds, allocated for a shutdown of the services in the service group. During this period, new requests are sent to the service only for clients who already have persistent sessions on the appliance. Requests from new clients are load balanced among other available services. After the delay time expires, no requests are sent to the service, and the service is marked as unavailable (OUT OF SERVICE).
	* </pre>
	*/
	public void set_delay(Long delay) throws Exception{
		this.delay = delay;
	}

	/**
	* <pre>
	* Time, in seconds, allocated for a shutdown of the services in the service group. During this period, new requests are sent to the service only for clients who already have persistent sessions on the appliance. Requests from new clients are load balanced among other available services. After the delay time expires, no requests are sent to the service, and the service is marked as unavailable (OUT OF SERVICE).
	* </pre>
	*/
	public Long get_delay() throws Exception {
		return this.delay;
	}

	/**
	* <pre>
	* Wait for all existing connections to the service to terminate before shutting down the service.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_graceful(String graceful) throws Exception{
		this.graceful = graceful;
	}

	/**
	* <pre>
	* Wait for all existing connections to the service to terminate before shutting down the service.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_graceful() throws Exception {
		return this.graceful;
	}

	/**
	* <pre>
	* Display the members of the listed service groups in addition to their settings. Can be specified when no service group name is provided in the command. In that case, the details displayed for each service group are identical to the details displayed when a service group name is provided, except that bound monitors are not displayed.
	* </pre>
	*/
	public void set_includemembers(boolean includemembers) throws Exception {
		this.includemembers = new Boolean(includemembers);
	}

	/**
	* <pre>
	* Display the members of the listed service groups in addition to their settings. Can be specified when no service group name is provided in the command. In that case, the details displayed for each service group are identical to the details displayed when a service group name is provided, except that bound monitors are not displayed.
	* </pre>
	*/
	public void set_includemembers(Boolean includemembers) throws Exception{
		this.includemembers = includemembers;
	}

	/**
	* <pre>
	* Display the members of the listed service groups in addition to their settings. Can be specified when no service group name is provided in the command. In that case, the details displayed for each service group are identical to the details displayed when a service group name is provided, except that bound monitors are not displayed.
	* </pre>
	*/
	public Boolean get_includemembers() throws Exception {
		return this.includemembers;
	}

	/**
	* <pre>
	* New name for the service group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the service group.<br> Minimum length =  1
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
	* The configuration type of the service group.
	* </pre>
	*/
	public Boolean get_serviceconftype() throws Exception {
		return this.serviceconftype;
	}

	/**
	* <pre>
	* SSL Status.<br> Possible values = Certkey not bound, SSL feature disabled
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* The state of the service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_svrstate() throws Exception {
		return this.svrstate;
	}

	/**
	* <pre>
	* IP Address.
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* The running state of the monitor on this service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
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
	* Total number of probes sent to monitor this service.
	* </pre>
	*/
	public Long get_monitortotalprobes() throws Exception {
		return this.monitortotalprobes;
	}

	/**
	* <pre>
	* Total number of failed probes.
	* </pre>
	*/
	public Long get_monitortotalfailedprobes() throws Exception {
		return this.monitortotalfailedprobes;
	}

	/**
	* <pre>
	* Total number of currently failed probes.
	* </pre>
	*/
	public Long get_monitorcurrentfailedprobes() throws Exception {
		return this.monitorcurrentfailedprobes;
	}

	/**
	* <pre>
	* Time when last state change occurred. Seconds part.
	* </pre>
	*/
	public String get_statechangetimesec() throws Exception {
		return this.statechangetimesec;
	}

	/**
	* <pre>
	* Time when last state change occurred. Milliseconds part.
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
	* Servicegroup Count.
	* </pre>
	*/
	public Long get_groupcount() throws Exception {
		return this.groupcount;
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
		servicegroup_response result = (servicegroup_response) service.get_payload_formatter().string_to_resource(servicegroup_response.class, response);
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
		return result.servicegroup;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to add servicegroup.
	*/
	public static base_response add(nitro_service client, servicegroup resource) throws Exception {
		servicegroup addresource = new servicegroup();
		addresource.servicegroupname = resource.servicegroupname;
		addresource.servicetype = resource.servicetype;
		addresource.cachetype = resource.cachetype;
		addresource.td = resource.td;
		addresource.maxclient = resource.maxclient;
		addresource.maxreq = resource.maxreq;
		addresource.cacheable = resource.cacheable;
		addresource.cip = resource.cip;
		addresource.cipheader = resource.cipheader;
		addresource.usip = resource.usip;
		addresource.pathmonitor = resource.pathmonitor;
		addresource.pathmonitorindv = resource.pathmonitorindv;
		addresource.useproxyport = resource.useproxyport;
		addresource.healthmonitor = resource.healthmonitor;
		addresource.sc = resource.sc;
		addresource.sp = resource.sp;
		addresource.rtspsessionidremap = resource.rtspsessionidremap;
		addresource.clttimeout = resource.clttimeout;
		addresource.svrtimeout = resource.svrtimeout;
		addresource.cka = resource.cka;
		addresource.tcpb = resource.tcpb;
		addresource.cmp = resource.cmp;
		addresource.maxbandwidth = resource.maxbandwidth;
		addresource.monthreshold = resource.monthreshold;
		addresource.state = resource.state;
		addresource.downstateflush = resource.downstateflush;
		addresource.tcpprofilename = resource.tcpprofilename;
		addresource.httpprofilename = resource.httpprofilename;
		addresource.comment = resource.comment;
		addresource.appflowlog = resource.appflowlog;
		addresource.netprofile = resource.netprofile;
		addresource.autoscale = resource.autoscale;
		addresource.memberport = resource.memberport;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add servicegroup resources.
	*/
	public static base_responses add(nitro_service client, servicegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup addresources[] = new servicegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new servicegroup();
				addresources[i].servicegroupname = resources[i].servicegroupname;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].cachetype = resources[i].cachetype;
				addresources[i].td = resources[i].td;
				addresources[i].maxclient = resources[i].maxclient;
				addresources[i].maxreq = resources[i].maxreq;
				addresources[i].cacheable = resources[i].cacheable;
				addresources[i].cip = resources[i].cip;
				addresources[i].cipheader = resources[i].cipheader;
				addresources[i].usip = resources[i].usip;
				addresources[i].pathmonitor = resources[i].pathmonitor;
				addresources[i].pathmonitorindv = resources[i].pathmonitorindv;
				addresources[i].useproxyport = resources[i].useproxyport;
				addresources[i].healthmonitor = resources[i].healthmonitor;
				addresources[i].sc = resources[i].sc;
				addresources[i].sp = resources[i].sp;
				addresources[i].rtspsessionidremap = resources[i].rtspsessionidremap;
				addresources[i].clttimeout = resources[i].clttimeout;
				addresources[i].svrtimeout = resources[i].svrtimeout;
				addresources[i].cka = resources[i].cka;
				addresources[i].tcpb = resources[i].tcpb;
				addresources[i].cmp = resources[i].cmp;
				addresources[i].maxbandwidth = resources[i].maxbandwidth;
				addresources[i].monthreshold = resources[i].monthreshold;
				addresources[i].state = resources[i].state;
				addresources[i].downstateflush = resources[i].downstateflush;
				addresources[i].tcpprofilename = resources[i].tcpprofilename;
				addresources[i].httpprofilename = resources[i].httpprofilename;
				addresources[i].comment = resources[i].comment;
				addresources[i].appflowlog = resources[i].appflowlog;
				addresources[i].netprofile = resources[i].netprofile;
				addresources[i].autoscale = resources[i].autoscale;
				addresources[i].memberport = resources[i].memberport;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete servicegroup of given name.
	*/
	public static base_response delete(nitro_service client, String servicegroupname) throws Exception {
		servicegroup deleteresource = new servicegroup();
		deleteresource.servicegroupname = servicegroupname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete servicegroup.
	*/
	public static base_response delete(nitro_service client, servicegroup resource) throws Exception {
		servicegroup deleteresource = new servicegroup();
		deleteresource.servicegroupname = resource.servicegroupname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete servicegroup resources of given names.
	*/
	public static base_responses delete(nitro_service client, String servicegroupname[]) throws Exception {
		base_responses result = null;
		if (servicegroupname != null && servicegroupname.length > 0) {
			servicegroup deleteresources[] = new servicegroup[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++){
				deleteresources[i] = new servicegroup();
				deleteresources[i].servicegroupname = servicegroupname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete servicegroup resources.
	*/
	public static base_responses delete(nitro_service client, servicegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup deleteresources[] = new servicegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new servicegroup();
				deleteresources[i].servicegroupname = resources[i].servicegroupname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update servicegroup.
	*/
	public static base_response update(nitro_service client, servicegroup resource) throws Exception {
		servicegroup updateresource = new servicegroup();
		updateresource.servicegroupname = resource.servicegroupname;
		updateresource.servername = resource.servername;
		updateresource.port = resource.port;
		updateresource.weight = resource.weight;
		updateresource.customserverid = resource.customserverid;
		updateresource.serverid = resource.serverid;
		updateresource.hashid = resource.hashid;
		updateresource.monitor_name_svc = resource.monitor_name_svc;
		updateresource.dup_weight = resource.dup_weight;
		updateresource.maxclient = resource.maxclient;
		updateresource.maxreq = resource.maxreq;
		updateresource.healthmonitor = resource.healthmonitor;
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
		updateresource.clttimeout = resource.clttimeout;
		updateresource.svrtimeout = resource.svrtimeout;
		updateresource.cka = resource.cka;
		updateresource.tcpb = resource.tcpb;
		updateresource.cmp = resource.cmp;
		updateresource.maxbandwidth = resource.maxbandwidth;
		updateresource.monthreshold = resource.monthreshold;
		updateresource.downstateflush = resource.downstateflush;
		updateresource.tcpprofilename = resource.tcpprofilename;
		updateresource.httpprofilename = resource.httpprofilename;
		updateresource.comment = resource.comment;
		updateresource.appflowlog = resource.appflowlog;
		updateresource.netprofile = resource.netprofile;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update servicegroup resources.
	*/
	public static base_responses update(nitro_service client, servicegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup updateresources[] = new servicegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new servicegroup();
				updateresources[i].servicegroupname = resources[i].servicegroupname;
				updateresources[i].servername = resources[i].servername;
				updateresources[i].port = resources[i].port;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].customserverid = resources[i].customserverid;
				updateresources[i].serverid = resources[i].serverid;
				updateresources[i].hashid = resources[i].hashid;
				updateresources[i].monitor_name_svc = resources[i].monitor_name_svc;
				updateresources[i].dup_weight = resources[i].dup_weight;
				updateresources[i].maxclient = resources[i].maxclient;
				updateresources[i].maxreq = resources[i].maxreq;
				updateresources[i].healthmonitor = resources[i].healthmonitor;
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
				updateresources[i].clttimeout = resources[i].clttimeout;
				updateresources[i].svrtimeout = resources[i].svrtimeout;
				updateresources[i].cka = resources[i].cka;
				updateresources[i].tcpb = resources[i].tcpb;
				updateresources[i].cmp = resources[i].cmp;
				updateresources[i].maxbandwidth = resources[i].maxbandwidth;
				updateresources[i].monthreshold = resources[i].monthreshold;
				updateresources[i].downstateflush = resources[i].downstateflush;
				updateresources[i].tcpprofilename = resources[i].tcpprofilename;
				updateresources[i].httpprofilename = resources[i].httpprofilename;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].appflowlog = resources[i].appflowlog;
				updateresources[i].netprofile = resources[i].netprofile;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of servicegroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, servicegroup resource, String[] args) throws Exception{
		servicegroup unsetresource = new servicegroup();
		unsetresource.servicegroupname = resource.servicegroupname;
		unsetresource.servername = resource.servername;
		unsetresource.port = resource.port;
		unsetresource.weight = resource.weight;
		unsetresource.customserverid = resource.customserverid;
		unsetresource.serverid = resource.serverid;
		unsetresource.hashid = resource.hashid;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of servicegroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String servicegroupname[], String args[]) throws Exception {
		base_responses result = null;
		if (servicegroupname != null && servicegroupname.length > 0) {
			servicegroup unsetresources[] = new servicegroup[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++){
				unsetresources[i] = new servicegroup();
				unsetresources[i].servicegroupname = servicegroupname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of servicegroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, servicegroup resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup unsetresources[] = new servicegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new servicegroup();
				unsetresources[i].servicegroupname = resources[i].servicegroupname;
				unsetresources[i].servername = resources[i].servername;
				unsetresources[i].port = resources[i].port;
				unsetresources[i].weight = resources[i].weight;
				unsetresources[i].customserverid = resources[i].customserverid;
				unsetresources[i].serverid = resources[i].serverid;
				unsetresources[i].hashid = resources[i].hashid;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable servicegroup of given name.
	*/
	public static base_response enable(nitro_service client, String servicegroupname) throws Exception {
		servicegroup enableresource = new servicegroup();
		enableresource.servicegroupname = servicegroupname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable servicegroup.
	*/
	public static base_response enable(nitro_service client, servicegroup resource) throws Exception {
		servicegroup enableresource = new servicegroup();
		enableresource.servicegroupname = resource.servicegroupname;
		enableresource.servername = resource.servername;
		enableresource.port = resource.port;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable servicegroup resources of given names.
	*/
	public static base_responses enable(nitro_service client, String servicegroupname[]) throws Exception {
		base_responses result = null;
		if (servicegroupname != null && servicegroupname.length > 0) {
			servicegroup enableresources[] = new servicegroup[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++){
				enableresources[i] = new servicegroup();
				enableresources[i].servicegroupname = servicegroupname[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable servicegroup resources.
	*/
	public static base_responses enable(nitro_service client, servicegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup enableresources[] = new servicegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new servicegroup();
				enableresources[i].servicegroupname = resources[i].servicegroupname;
				enableresources[i].servername = resources[i].servername;
				enableresources[i].port = resources[i].port;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable servicegroup of given name.
	*/
	public static base_response disable(nitro_service client, String servicegroupname) throws Exception {
		servicegroup disableresource = new servicegroup();
		disableresource.servicegroupname = servicegroupname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable servicegroup.
	*/
	public static base_response disable(nitro_service client, servicegroup resource) throws Exception {
		servicegroup disableresource = new servicegroup();
		disableresource.servicegroupname = resource.servicegroupname;
		disableresource.servername = resource.servername;
		disableresource.port = resource.port;
		disableresource.delay = resource.delay;
		disableresource.graceful = resource.graceful;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable servicegroup resources of given names.
	*/
	public static base_responses disable(nitro_service client, String servicegroupname[]) throws Exception {
		base_responses result = null;
		if (servicegroupname != null && servicegroupname.length > 0) {
			servicegroup disableresources[] = new servicegroup[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++){
				disableresources[i] = new servicegroup();
				disableresources[i].servicegroupname = servicegroupname[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable servicegroup resources.
	*/
	public static base_responses disable(nitro_service client, servicegroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			servicegroup disableresources[] = new servicegroup[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new servicegroup();
				disableresources[i].servicegroupname = resources[i].servicegroupname;
				disableresources[i].servername = resources[i].servername;
				disableresources[i].port = resources[i].port;
				disableresources[i].delay = resources[i].delay;
				disableresources[i].graceful = resources[i].graceful;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a servicegroup resource.
	*/
	public static base_response rename(nitro_service client, servicegroup resource, String new_servicegroupname) throws Exception {
		servicegroup renameresource = new servicegroup();
		renameresource.servicegroupname = resource.servicegroupname;
		return renameresource.rename_resource(client,new_servicegroupname);
	}

	/**
	* Use this API to rename a servicegroup resource.
	*/
	public static base_response rename(nitro_service client, String servicegroupname, String new_servicegroupname) throws Exception {
		servicegroup renameresource = new servicegroup();
		renameresource.servicegroupname = servicegroupname;
		return renameresource.rename_resource(client,new_servicegroupname);
	}

	/**
	* Use this API to fetch all the servicegroup resources that are configured on netscaler.
	*/
	public static servicegroup[] get(nitro_service service) throws Exception{
		servicegroup obj = new servicegroup();
		servicegroup[] response = (servicegroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the servicegroup resources that are configured on netscaler.
	*/
	public static servicegroup[] get(nitro_service service, options option) throws Exception{
		servicegroup obj = new servicegroup();
		servicegroup[] response = (servicegroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the servicegroup resources that are configured on netscaler.
	* This uses servicegroup_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static servicegroup[] get(nitro_service service, servicegroup_args args) throws Exception{
		servicegroup obj = new servicegroup();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		servicegroup[] response = (servicegroup[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch servicegroup resource of given name .
	*/
	public static servicegroup get(nitro_service service, String servicegroupname) throws Exception{
		servicegroup obj = new servicegroup();
		obj.set_servicegroupname(servicegroupname);
		servicegroup response = (servicegroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch servicegroup resources of given names .
	*/
	public static servicegroup[] get(nitro_service service, String servicegroupname[]) throws Exception{
		if (servicegroupname !=null && servicegroupname.length>0) {
			servicegroup response[] = new servicegroup[servicegroupname.length];
			servicegroup obj[] = new servicegroup[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++) {
				obj[i] = new servicegroup();
				obj[i].set_servicegroupname(servicegroupname[i]);
				response[i] = (servicegroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of servicegroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static servicegroup[] get_filtered(nitro_service service, String filter) throws Exception{
		servicegroup obj = new servicegroup();
		options option = new options();
		option.set_filter(filter);
		servicegroup[] response = (servicegroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of servicegroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static servicegroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		servicegroup obj = new servicegroup();
		options option = new options();
		option.set_filter(filter);
		servicegroup[] response = (servicegroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the servicegroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		servicegroup obj = new servicegroup();
		options option = new options();
		option.set_count(true);
		servicegroup[] response = (servicegroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of servicegroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		servicegroup obj = new servicegroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		servicegroup[] response = (servicegroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of servicegroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		servicegroup obj = new servicegroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		servicegroup[] response = (servicegroup[]) obj.getfiltered(service, option);
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
	public static class pathmonitorEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class autoscaleEnum {
		public static final String DISABLED = "DISABLED";
		public static final String DNS = "DNS";
		public static final String POLICY = "POLICY";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class tcpbEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cachetypeEnum {
		public static final String TRANSPARENT = "TRANSPARENT";
		public static final String REVERSE = "REVERSE";
		public static final String FORWARD = "FORWARD";
	}
	public static class cipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class downstateflushEnum {
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
		public static final String TFTP = "TFTP";
	}
	public static class ckaEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
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
		public static final String Unknown = "Unknown";
		public static final String DISABLED = "DISABLED";
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
		public static final String Unknown = "Unknown";
		public static final String DISABLED = "DISABLED";
	}
	public static class valueEnum {
		public static final String Certkey_not_bound = "Certkey not bound";
		public static final String SSL_feature_disabled = "SSL feature disabled";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class useproxyportEnum {
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
	public static class usipEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class gracefulEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cacheableEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
