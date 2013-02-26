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

class lbmonitor_response extends base_response
{
	public lbmonitor[] lbmonitor;
}
/**
* Configuration for monitor resource.
*/

public class lbmonitor extends base_resource
{
	private String monitorname;
	private String type;
	private String action;
	private String[] respcode;
	private String httprequest;
	private String rtsprequest;
	private String customheaders;
	private Long maxforwards;
	private String sipmethod;
	private String sipuri;
	private String sipreguri;
	private String send;
	private String recv;
	private String query;
	private String querytype;
	private String scriptname;
	private String scriptargs;
	private String dispatcherip;
	private Integer dispatcherport;
	private String username;
	private String password;
	private String secondarypassword;
	private String logonpointname;
	private String lasversion;
	private String radkey;
	private String radnasid;
	private String radnasip;
	private String lrtm;
	private Long deviation;
	private String units1;
	private Integer interval;
	private String units3;
	private Integer resptimeout;
	private String units4;
	private Long resptimeoutthresh;
	private Integer retries;
	private Integer failureretries;
	private Integer alertretries;
	private Integer successretries;
	private Integer downtime;
	private String units2;
	private String destip;
	private Integer destport;
	private String state;
	private String reverse;
	private String transparent;
	private String iptunnel;
	private String tos;
	private Long tosid;
	private String secure;
	private String validatecred;
	private String domain;
	private String[] ipaddress;
	private String group;
	private String filename;
	private String basedn;
	private String binddn;
	private String filter;
	private String attribute;
	private String database;
	private String sqlquery;
	private String evalrule;
	private String mssqlprotocolversion;
	private String Snmpoid;
	private String snmpcommunity;
	private String snmpthreshold;
	private String snmpversion;
	private String metrictable;
	private String application;
	private String sitepath;
	private String netprofile;
	private String originhost;
	private String originrealm;
	private String hostipaddress;
	private Long vendorid;
	private String productname;
	private Long firmwarerevision;
	private Long[] authapplicationid;
	private Long[] acctapplicationid;
	private String inbandsecurityid;
	private Long[] supportedvendorids;
	private Long vendorspecificvendorid;
	private Long[] vendorspecificauthapplicationids;
	private Long[] vendorspecificacctapplicationids;
	private String metric;
	private Long metricthreshold;
	private Long metricweight;
	private String servicename;
	private String servicegroupname;

	//------- Read only Parameter ---------;

	private Integer lrtmconf;
	private Integer dynamicresponsetimeout;
	private Integer dynamicinterval;
	private String dup_state;
	private Long dup_weight;
	private Long weight;
	private Long __count;

	/**
	* <pre>
	* The name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitorname(String monitorname) throws Exception{
		this.monitorname = monitorname;
	}

	/**
	* <pre>
	* The name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitorname() throws Exception {
		return this.monitorname;
	}

	/**
	* <pre>
	* The type of monitor.<br> Possible values = PING, TCP, HTTP, TCP-ECV, HTTP-ECV, UDP-ECV, DNS, FTP, LDNS-PING, LDNS-TCP, LDNS-DNS, RADIUS, USER, HTTP-INLINE, SIP-UDP, LOAD, FTP-EXTENDED, SMTP, SNMP, NNTP, MYSQL, MYSQL-ECV, MSSQL-ECV, LDAP, POP3, CITRIX-XML-SERVICE, CITRIX-WEB-INTERFACE, DNS-TCP, RTSP, ARP, CITRIX-AG, CITRIX-AAC-LOGINPAGE, CITRIX-AAC-LAS, CITRIX-XD-DDC, ND6, CITRIX-WI-EXTENDED, DIAMETER
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of monitor.<br> Possible values = PING, TCP, HTTP, TCP-ECV, HTTP-ECV, UDP-ECV, DNS, FTP, LDNS-PING, LDNS-TCP, LDNS-DNS, RADIUS, USER, HTTP-INLINE, SIP-UDP, LOAD, FTP-EXTENDED, SMTP, SNMP, NNTP, MYSQL, MYSQL-ECV, MSSQL-ECV, LDAP, POP3, CITRIX-XML-SERVICE, CITRIX-WEB-INTERFACE, DNS-TCP, RTSP, ARP, CITRIX-AG, CITRIX-AAC-LOGINPAGE, CITRIX-AAC-LAS, CITRIX-XD-DDC, ND6, CITRIX-WI-EXTENDED, DIAMETER
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The action to be taken in INLINE monitors.<br> Default value: SM_DOWN<br> Possible values = NONE, LOG, DOWN
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The action to be taken in INLINE monitors.<br> Default value: SM_DOWN<br> Possible values = NONE, LOG, DOWN
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* The response codes. For the probe to succeed, the HTTP/RADIUS response from the server must be of one of the types specified.
	* </pre>
	*/
	public void set_respcode(String[] respcode) throws Exception{
		this.respcode = respcode;
	}

	/**
	* <pre>
	* The response codes. For the probe to succeed, the HTTP/RADIUS response from the server must be of one of the types specified.
	* </pre>
	*/
	public String[] get_respcode() throws Exception {
		return this.respcode;
	}

	/**
	* <pre>
	* The HTTP request that is sent to the server (for example, "HEAD /file.html").
	* </pre>
	*/
	public void set_httprequest(String httprequest) throws Exception{
		this.httprequest = httprequest;
	}

	/**
	* <pre>
	* The HTTP request that is sent to the server (for example, "HEAD /file.html").
	* </pre>
	*/
	public String get_httprequest() throws Exception {
		return this.httprequest;
	}

	/**
	* <pre>
	* The RTSP request that is sent to the server (for example, "OPTIONS *").
	* </pre>
	*/
	public void set_rtsprequest(String rtsprequest) throws Exception{
		this.rtsprequest = rtsprequest;
	}

	/**
	* <pre>
	* The RTSP request that is sent to the server (for example, "OPTIONS *").
	* </pre>
	*/
	public String get_rtsprequest() throws Exception {
		return this.rtsprequest;
	}

	/**
	* <pre>
	* The custom header string, attached to the monitoring probes.
	* </pre>
	*/
	public void set_customheaders(String customheaders) throws Exception{
		this.customheaders = customheaders;
	}

	/**
	* <pre>
	* The custom header string, attached to the monitoring probes.
	* </pre>
	*/
	public String get_customheaders() throws Exception {
		return this.customheaders;
	}

	/**
	* <pre>
	* SIP packet max-forwards.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxforwards(long maxforwards) throws Exception {
		this.maxforwards = new Long(maxforwards);
	}

	/**
	* <pre>
	* SIP packet max-forwards.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxforwards(Long maxforwards) throws Exception{
		this.maxforwards = maxforwards;
	}

	/**
	* <pre>
	* SIP packet max-forwards.<br> Default value: 1<br> Minimum value =  0<br> Maximum value =  255
	* </pre>
	*/
	public Long get_maxforwards() throws Exception {
		return this.maxforwards;
	}

	/**
	* <pre>
	* SIP method to be used for the query.<br> Possible values = OPTIONS, INVITE, REGISTER
	* </pre>
	*/
	public void set_sipmethod(String sipmethod) throws Exception{
		this.sipmethod = sipmethod;
	}

	/**
	* <pre>
	* SIP method to be used for the query.<br> Possible values = OPTIONS, INVITE, REGISTER
	* </pre>
	*/
	public String get_sipmethod() throws Exception {
		return this.sipmethod;
	}

	/**
	* <pre>
	* SIP method string, sent to the server. For example "OPTIONS sip:sip.test".<br> Minimum length =  1
	* </pre>
	*/
	public void set_sipuri(String sipuri) throws Exception{
		this.sipuri = sipuri;
	}

	/**
	* <pre>
	* SIP method string, sent to the server. For example "OPTIONS sip:sip.test".<br> Minimum length =  1
	* </pre>
	*/
	public String get_sipuri() throws Exception {
		return this.sipuri;
	}

	/**
	* <pre>
	* SIP user to be registered.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sipreguri(String sipreguri) throws Exception{
		this.sipreguri = sipreguri;
	}

	/**
	* <pre>
	* SIP user to be registered.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sipreguri() throws Exception {
		return this.sipreguri;
	}

	/**
	* <pre>
	* The string that is sent to the service. Applicable to TCP-ECV, HTTP-ECV, and UDP-ECV monitor types.
	* </pre>
	*/
	public void set_send(String send) throws Exception{
		this.send = send;
	}

	/**
	* <pre>
	* The string that is sent to the service. Applicable to TCP-ECV, HTTP-ECV, and UDP-ECV monitor types.
	* </pre>
	*/
	public String get_send() throws Exception {
		return this.send;
	}

	/**
	* <pre>
	* The string that is expected from the server to mark the server as UP. Applicable to TCP-ECV, HTTP-ECV, and UDP-ECV monitor types.
	* </pre>
	*/
	public void set_recv(String recv) throws Exception{
		this.recv = recv;
	}

	/**
	* <pre>
	* The string that is expected from the server to mark the server as UP. Applicable to TCP-ECV, HTTP-ECV, and UDP-ECV monitor types.
	* </pre>
	*/
	public String get_recv() throws Exception {
		return this.recv;
	}

	/**
	* <pre>
	* The DNS query (domain name) sent to the DNS service that is being monitored.
	* </pre>
	*/
	public void set_query(String query) throws Exception{
		this.query = query;
	}

	/**
	* <pre>
	* The DNS query (domain name) sent to the DNS service that is being monitored.
	* </pre>
	*/
	public String get_query() throws Exception {
		return this.query;
	}

	/**
	* <pre>
	* The type of DNS query that is sent.<br> Possible values = Address, Zone, AAAA
	* </pre>
	*/
	public void set_querytype(String querytype) throws Exception{
		this.querytype = querytype;
	}

	/**
	* <pre>
	* The type of DNS query that is sent.<br> Possible values = Address, Zone, AAAA
	* </pre>
	*/
	public String get_querytype() throws Exception {
		return this.querytype;
	}

	/**
	* <pre>
	* The path and name of the script to execute.<br> Minimum length =  1
	* </pre>
	*/
	public void set_scriptname(String scriptname) throws Exception{
		this.scriptname = scriptname;
	}

	/**
	* <pre>
	* The path and name of the script to execute.<br> Minimum length =  1
	* </pre>
	*/
	public String get_scriptname() throws Exception {
		return this.scriptname;
	}

	/**
	* <pre>
	* The string that are put in the POST data - they are copied to the request verbatim.
	* </pre>
	*/
	public void set_scriptargs(String scriptargs) throws Exception{
		this.scriptargs = scriptargs;
	}

	/**
	* <pre>
	* The string that are put in the POST data - they are copied to the request verbatim.
	* </pre>
	*/
	public String get_scriptargs() throws Exception {
		return this.scriptargs;
	}

	/**
	* <pre>
	* The IP Address of the dispatcher to which the probe is sent.
	* </pre>
	*/
	public void set_dispatcherip(String dispatcherip) throws Exception{
		this.dispatcherip = dispatcherip;
	}

	/**
	* <pre>
	* The IP Address of the dispatcher to which the probe is sent.
	* </pre>
	*/
	public String get_dispatcherip() throws Exception {
		return this.dispatcherip;
	}

	/**
	* <pre>
	* The port of the dispatcher to which the probe is sent.
	* </pre>
	*/
	public void set_dispatcherport(int dispatcherport) throws Exception {
		this.dispatcherport = new Integer(dispatcherport);
	}

	/**
	* <pre>
	* The port of the dispatcher to which the probe is sent.
	* </pre>
	*/
	public void set_dispatcherport(Integer dispatcherport) throws Exception{
		this.dispatcherport = dispatcherport;
	}

	/**
	* <pre>
	* The port of the dispatcher to which the probe is sent.
	* </pre>
	*/
	public Integer get_dispatcherport() throws Exception {
		return this.dispatcherport;
	}

	/**
	* <pre>
	* Username on the RADIUS/NNTP/FTP/FTP-EXTENDED/MYSQL/MSSQL/POP3/CITRIX-AG/CITRIX-XD-DDC/CITRIX-WI-EXTENDED server. This user name is used in the probe.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* Username on the RADIUS/NNTP/FTP/FTP-EXTENDED/MYSQL/MSSQL/POP3/CITRIX-AG/CITRIX-XD-DDC/CITRIX-WI-EXTENDED server. This user name is used in the probe.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* Password used in  RADIUS/NNTP/FTP/FTP-EXTENDED/MYSQL/POP3/LDAP/CITRIX-AG/CITRIX-XD-DDC/CITRIX-WI-EXTENDED server monitoring.<br> Minimum length =  1
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* Password used in  RADIUS/NNTP/FTP/FTP-EXTENDED/MYSQL/POP3/LDAP/CITRIX-AG/CITRIX-XD-DDC/CITRIX-WI-EXTENDED server monitoring.<br> Minimum length =  1
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* Secondary password used in Citrix Access Gateway server monitoring.
	* </pre>
	*/
	public void set_secondarypassword(String secondarypassword) throws Exception{
		this.secondarypassword = secondarypassword;
	}

	/**
	* <pre>
	* Secondary password used in Citrix Access Gateway server monitoring.
	* </pre>
	*/
	public String get_secondarypassword() throws Exception {
		return this.secondarypassword;
	}

	/**
	* <pre>
	* Logonpoint name used in Citrix AAC login page and logon agent service monitoring.
	* </pre>
	*/
	public void set_logonpointname(String logonpointname) throws Exception{
		this.logonpointname = logonpointname;
	}

	/**
	* <pre>
	* Logonpoint name used in Citrix AAC login page and logon agent service monitoring.
	* </pre>
	*/
	public String get_logonpointname() throws Exception {
		return this.logonpointname;
	}

	/**
	* <pre>
	* The version of the Citrix AAC logon agent service required by CITRIX-AAC-LAS monitor.
	* </pre>
	*/
	public void set_lasversion(String lasversion) throws Exception{
		this.lasversion = lasversion;
	}

	/**
	* <pre>
	* The version of the Citrix AAC logon agent service required by CITRIX-AAC-LAS monitor.
	* </pre>
	*/
	public String get_lasversion() throws Exception {
		return this.lasversion;
	}

	/**
	* <pre>
	* The radius key.<br> Minimum length =  1
	* </pre>
	*/
	public void set_radkey(String radkey) throws Exception{
		this.radkey = radkey;
	}

	/**
	* <pre>
	* The radius key.<br> Minimum length =  1
	* </pre>
	*/
	public String get_radkey() throws Exception {
		return this.radkey;
	}

	/**
	* <pre>
	* The NAS ID to be used in Radius monitoring.<br> Minimum length =  1
	* </pre>
	*/
	public void set_radnasid(String radnasid) throws Exception{
		this.radnasid = radnasid;
	}

	/**
	* <pre>
	* The NAS ID to be used in Radius monitoring.<br> Minimum length =  1
	* </pre>
	*/
	public String get_radnasid() throws Exception {
		return this.radnasid;
	}

	/**
	* <pre>
	* The NAS IP to be used in Radius monitoring.
	* </pre>
	*/
	public void set_radnasip(String radnasip) throws Exception{
		this.radnasip = radnasip;
	}

	/**
	* <pre>
	* The NAS IP to be used in Radius monitoring.
	* </pre>
	*/
	public String get_radnasip() throws Exception {
		return this.radnasip;
	}

	/**
	* <pre>
	* The state of response time calculation of probes.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_lrtm(String lrtm) throws Exception{
		this.lrtm = lrtm;
	}

	/**
	* <pre>
	* The state of response time calculation of probes.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_lrtm() throws Exception {
		return this.lrtm;
	}

	/**
	* <pre>
	* Deviation from the learnt response time for Dynamic Response Time monitoring. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Minimum value =  0<br> Maximum value =  20939000
	* </pre>
	*/
	public void set_deviation(long deviation) throws Exception {
		this.deviation = new Long(deviation);
	}

	/**
	* <pre>
	* Deviation from the learnt response time for Dynamic Response Time monitoring. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Minimum value =  0<br> Maximum value =  20939000
	* </pre>
	*/
	public void set_deviation(Long deviation) throws Exception{
		this.deviation = deviation;
	}

	/**
	* <pre>
	* Deviation from the learnt response time for Dynamic Response Time monitoring. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Minimum value =  0<br> Maximum value =  20939000
	* </pre>
	*/
	public Long get_deviation() throws Exception {
		return this.deviation;
	}

	/**
	* <pre>
	* Deviation units.<br> Default value: NSTMUNT_SEC<br> Possible values = SEC, MSEC, MIN
	* </pre>
	*/
	public void set_units1(String units1) throws Exception{
		this.units1 = units1;
	}

	/**
	* <pre>
	* Deviation units.<br> Default value: NSTMUNT_SEC<br> Possible values = SEC, MSEC, MIN
	* </pre>
	*/
	public String get_units1() throws Exception {
		return this.units1;
	}

	/**
	* <pre>
	* The frequency at which the probe is sent to a service.The interval should be greater than the response timeout.
The minimum value is 20 msec.The maximum value is 20940000 in milliseconds , 20940 in seconds and 349 in minutes.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  20940000
	* </pre>
	*/
	public void set_interval(int interval) throws Exception {
		this.interval = new Integer(interval);
	}

	/**
	* <pre>
	* The frequency at which the probe is sent to a service.The interval should be greater than the response timeout.
The minimum value is 20 msec.The maximum value is 20940000 in milliseconds , 20940 in seconds and 349 in minutes.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  20940000
	* </pre>
	*/
	public void set_interval(Integer interval) throws Exception{
		this.interval = interval;
	}

	/**
	* <pre>
	* The frequency at which the probe is sent to a service.The interval should be greater than the response timeout.
The minimum value is 20 msec.The maximum value is 20940000 in milliseconds , 20940 in seconds and 349 in minutes.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  20940000
	* </pre>
	*/
	public Integer get_interval() throws Exception {
		return this.interval;
	}

	/**
	* <pre>
	* monitor interval units.<br> Default value: NSTMUNT_SEC<br> Possible values = SEC, MSEC, MIN
	* </pre>
	*/
	public void set_units3(String units3) throws Exception{
		this.units3 = units3;
	}

	/**
	* <pre>
	* monitor interval units.<br> Default value: NSTMUNT_SEC<br> Possible values = SEC, MSEC, MIN
	* </pre>
	*/
	public String get_units3() throws Exception {
		return this.units3;
	}

	/**
	* <pre>
	* The interval for which the system waits before it marks the probe as FAILED.  The response timeout should be less than the value specified in -interval parameter.
The UDP-ECV monitor type does not decide the probe failure by the response timeout. System considers the probe successful for UDP-ECV monitor type, when the server
response matches the criteria set by the -send and -recv options or if the response is not received from the server (unless the -reverse option is set to yes).
Note:	The -send option specifies what data is to be sent to the server in the probe and -recv specifies the server response criteria for the probe to succeed.
The probe failure is caused by the ICMP port unreachable error from the service. The minimum value is 10 msec. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  20939000
	* </pre>
	*/
	public void set_resptimeout(int resptimeout) throws Exception {
		this.resptimeout = new Integer(resptimeout);
	}

	/**
	* <pre>
	* The interval for which the system waits before it marks the probe as FAILED.  The response timeout should be less than the value specified in -interval parameter.
The UDP-ECV monitor type does not decide the probe failure by the response timeout. System considers the probe successful for UDP-ECV monitor type, when the server
response matches the criteria set by the -send and -recv options or if the response is not received from the server (unless the -reverse option is set to yes).
Note:	The -send option specifies what data is to be sent to the server in the probe and -recv specifies the server response criteria for the probe to succeed.
The probe failure is caused by the ICMP port unreachable error from the service. The minimum value is 10 msec. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  20939000
	* </pre>
	*/
	public void set_resptimeout(Integer resptimeout) throws Exception{
		this.resptimeout = resptimeout;
	}

	/**
	* <pre>
	* The interval for which the system waits before it marks the probe as FAILED.  The response timeout should be less than the value specified in -interval parameter.
The UDP-ECV monitor type does not decide the probe failure by the response timeout. System considers the probe successful for UDP-ECV monitor type, when the server
response matches the criteria set by the -send and -recv options or if the response is not received from the server (unless the -reverse option is set to yes).
Note:	The -send option specifies what data is to be sent to the server in the probe and -recv specifies the server response criteria for the probe to succeed.
The probe failure is caused by the ICMP port unreachable error from the service. The minimum value is 10 msec. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  20939000
	* </pre>
	*/
	public Integer get_resptimeout() throws Exception {
		return this.resptimeout;
	}

	/**
	* <pre>
	* monitor response timeout units.<br> Default value: NSTMUNT_SEC<br> Possible values = SEC, MSEC, MIN
	* </pre>
	*/
	public void set_units4(String units4) throws Exception{
		this.units4 = units4;
	}

	/**
	* <pre>
	* monitor response timeout units.<br> Default value: NSTMUNT_SEC<br> Possible values = SEC, MSEC, MIN
	* </pre>
	*/
	public String get_units4() throws Exception {
		return this.units4;
	}

	/**
	* <pre>
	* Monitor response timeout threshold , a trap will be sent if the response time for the monitoring probes exceeds the thereshold. It is given in percentage.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_resptimeoutthresh(long resptimeoutthresh) throws Exception {
		this.resptimeoutthresh = new Long(resptimeoutthresh);
	}

	/**
	* <pre>
	* Monitor response timeout threshold , a trap will be sent if the response time for the monitoring probes exceeds the thereshold. It is given in percentage.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_resptimeoutthresh(Long resptimeoutthresh) throws Exception{
		this.resptimeoutthresh = resptimeoutthresh;
	}

	/**
	* <pre>
	* Monitor response timeout threshold , a trap will be sent if the response time for the monitoring probes exceeds the thereshold. It is given in percentage.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_resptimeoutthresh() throws Exception {
		return this.resptimeoutthresh;
	}

	/**
	* <pre>
	* The maximum number of most recent probes considered to decide whether to mark the service as DOWN. Minimum value of retries is 1.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  127
	* </pre>
	*/
	public void set_retries(int retries) throws Exception {
		this.retries = new Integer(retries);
	}

	/**
	* <pre>
	* The maximum number of most recent probes considered to decide whether to mark the service as DOWN. Minimum value of retries is 1.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  127
	* </pre>
	*/
	public void set_retries(Integer retries) throws Exception{
		this.retries = retries;
	}

	/**
	* <pre>
	* The maximum number of most recent probes considered to decide whether to mark the service as DOWN. Minimum value of retries is 1.<br> Default value: 3<br> Minimum value =  1<br> Maximum value =  127
	* </pre>
	*/
	public Integer get_retries() throws Exception {
		return this.retries;
	}

	/**
	* <pre>
	* The number of failed probes out of most recent "retries" number of probes required to mark the service as DOWN. By default, the system requires "retries" number of consecutive probe failures to mark the service as DOWN.<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_failureretries(int failureretries) throws Exception {
		this.failureretries = new Integer(failureretries);
	}

	/**
	* <pre>
	* The number of failed probes out of most recent "retries" number of probes required to mark the service as DOWN. By default, the system requires "retries" number of consecutive probe failures to mark the service as DOWN.<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_failureretries(Integer failureretries) throws Exception{
		this.failureretries = failureretries;
	}

	/**
	* <pre>
	* The number of failed probes out of most recent "retries" number of probes required to mark the service as DOWN. By default, the system requires "retries" number of consecutive probe failures to mark the service as DOWN.<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public Integer get_failureretries() throws Exception {
		return this.failureretries;
	}

	/**
	* <pre>
	* The number of probes failures after which the system generates a snmp trap.<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_alertretries(int alertretries) throws Exception {
		this.alertretries = new Integer(alertretries);
	}

	/**
	* <pre>
	* The number of probes failures after which the system generates a snmp trap.<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_alertretries(Integer alertretries) throws Exception{
		this.alertretries = alertretries;
	}

	/**
	* <pre>
	* The number of probes failures after which the system generates a snmp trap.<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public Integer get_alertretries() throws Exception {
		return this.alertretries;
	}

	/**
	* <pre>
	* The number of consecutive sucessful probes required to mark the service as UP.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public void set_successretries(int successretries) throws Exception {
		this.successretries = new Integer(successretries);
	}

	/**
	* <pre>
	* The number of consecutive sucessful probes required to mark the service as UP.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public void set_successretries(Integer successretries) throws Exception{
		this.successretries = successretries;
	}

	/**
	* <pre>
	* The number of consecutive sucessful probes required to mark the service as UP.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  32
	* </pre>
	*/
	public Integer get_successretries() throws Exception {
		return this.successretries;
	}

	/**
	* <pre>
	* The duration for which the system waits to make the next probe once the service is marked as DOWN. The minimum value is 10 msec. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Default value: 30<br> Minimum value =  1<br> Maximum value =  20939000
	* </pre>
	*/
	public void set_downtime(int downtime) throws Exception {
		this.downtime = new Integer(downtime);
	}

	/**
	* <pre>
	* The duration for which the system waits to make the next probe once the service is marked as DOWN. The minimum value is 10 msec. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Default value: 30<br> Minimum value =  1<br> Maximum value =  20939000
	* </pre>
	*/
	public void set_downtime(Integer downtime) throws Exception{
		this.downtime = downtime;
	}

	/**
	* <pre>
	* The duration for which the system waits to make the next probe once the service is marked as DOWN. The minimum value is 10 msec. The maximum value is 20939000 in milliseconds , 20939 in seconds and 348 in minutes.<br> Default value: 30<br> Minimum value =  1<br> Maximum value =  20939000
	* </pre>
	*/
	public Integer get_downtime() throws Exception {
		return this.downtime;
	}

	/**
	* <pre>
	* monitor downtime units.<br> Default value: NSTMUNT_SEC<br> Possible values = SEC, MSEC, MIN
	* </pre>
	*/
	public void set_units2(String units2) throws Exception{
		this.units2 = units2;
	}

	/**
	* <pre>
	* monitor downtime units.<br> Default value: NSTMUNT_SEC<br> Possible values = SEC, MSEC, MIN
	* </pre>
	*/
	public String get_units2() throws Exception {
		return this.units2;
	}

	/**
	* <pre>
	* The IP address to which the probe is sent. If the destination IP address is set to 0, the destination IP address is that of the server to which the monitor is bound.
	* </pre>
	*/
	public void set_destip(String destip) throws Exception{
		this.destip = destip;
	}

	/**
	* <pre>
	* The IP address to which the probe is sent. If the destination IP address is set to 0, the destination IP address is that of the server to which the monitor is bound.
	* </pre>
	*/
	public String get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* The TCP/UDP port to which the probe is sent. If the destination port is set to 0, the destination port is of the service to which the monitor is bound. For a USER monitor, however, this will be the port sent in the HTTP request to the dispatcher. This option is ignored if the monitor is of the PING type.
	* </pre>
	*/
	public void set_destport(int destport) throws Exception {
		this.destport = new Integer(destport);
	}

	/**
	* <pre>
	* The TCP/UDP port to which the probe is sent. If the destination port is set to 0, the destination port is of the service to which the monitor is bound. For a USER monitor, however, this will be the port sent in the HTTP request to the dispatcher. This option is ignored if the monitor is of the PING type.
	* </pre>
	*/
	public void set_destport(Integer destport) throws Exception{
		this.destport = destport;
	}

	/**
	* <pre>
	* The TCP/UDP port to which the probe is sent. If the destination port is set to 0, the destination port is of the service to which the monitor is bound. For a USER monitor, however, this will be the port sent in the HTTP request to the dispatcher. This option is ignored if the monitor is of the PING type.
	* </pre>
	*/
	public Integer get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* The state of the monitor.
	If the monitor is disabled, this monitor-type probe is not sent for all services.
	If the monitor is bound, the state of this monitor is not taken into account when the service of this state is determined.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the monitor.
	If the monitor is disabled, this monitor-type probe is not sent for all services.
	If the monitor is bound, the state of this monitor is not taken into account when the service of this state is determined.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The state of reverse probe's criterion check.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_reverse(String reverse) throws Exception{
		this.reverse = reverse;
	}

	/**
	* <pre>
	* The state of reverse probe's criterion check.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_reverse() throws Exception {
		return this.reverse;
	}

	/**
	* <pre>
	* The state of  the monitor for transparent devices, such as firewalls, based on the responsiveness of the services behind them. If the monitoring of transparent devices is enabled, the destination IP address should be specified.
The probe is sent to the specified destination IP address using the MAC address of the transparent device.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_transparent(String transparent) throws Exception{
		this.transparent = transparent;
	}

	/**
	* <pre>
	* The state of  the monitor for transparent devices, such as firewalls, based on the responsiveness of the services behind them. If the monitoring of transparent devices is enabled, the destination IP address should be specified.
The probe is sent to the specified destination IP address using the MAC address of the transparent device.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_transparent() throws Exception {
		return this.transparent;
	}

	/**
	* <pre>
	* The state of the monitor for tunneled devices. If the monitoring of tunneled devices is enabled, the destination IP address should be specified.
The probe is sent to the specified destination IP address by tunneling it to the device.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_iptunnel(String iptunnel) throws Exception{
		this.iptunnel = iptunnel;
	}

	/**
	* <pre>
	* The state of the monitor for tunneled devices. If the monitoring of tunneled devices is enabled, the destination IP address should be specified.
The probe is sent to the specified destination IP address by tunneling it to the device.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_iptunnel() throws Exception {
		return this.iptunnel;
	}

	/**
	* <pre>
	* If enabled, the probe is sent to the service by encoding the specified destination IP address in the IP TOS (6)bits.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_tos(String tos) throws Exception{
		this.tos = tos;
	}

	/**
	* <pre>
	* If enabled, the probe is sent to the service by encoding the specified destination IP address in the IP TOS (6)bits.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_tos() throws Exception {
		return this.tos;
	}

	/**
	* <pre>
	* Use this parameter to specify the TOS ID of the specified destination IP. Applicable only when the -tos is enabled.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public void set_tosid(long tosid) throws Exception {
		this.tosid = new Long(tosid);
	}

	/**
	* <pre>
	* Use this parameter to specify the TOS ID of the specified destination IP. Applicable only when the -tos is enabled.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public void set_tosid(Long tosid) throws Exception{
		this.tosid = tosid;
	}

	/**
	* <pre>
	* Use this parameter to specify the TOS ID of the specified destination IP. Applicable only when the -tos is enabled.<br> Minimum value =  1<br> Maximum value =  63
	* </pre>
	*/
	public Long get_tosid() throws Exception {
		return this.tosid;
	}

	/**
	* <pre>
	* The state of  the secure monitoring of services.  SSL handshake will be done on the TCP connection established. Applicable only for TCP based monitors. This option can't be used in conjuction with CITRIX-AG monitor as this monitor is a secure monitor by default. .<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_secure(String secure) throws Exception{
		this.secure = secure;
	}

	/**
	* <pre>
	* The state of  the secure monitoring of services.  SSL handshake will be done on the TCP connection established. Applicable only for TCP based monitors. This option can't be used in conjuction with CITRIX-AG monitor as this monitor is a secure monitor by default. .<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_secure() throws Exception {
		return this.secure;
	}

	/**
	* <pre>
	* Setting this field causes the monitor to send probe which validate the credentials of the Xen Desktop DDC.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_validatecred(String validatecred) throws Exception{
		this.validatecred = validatecred;
	}

	/**
	* <pre>
	* Setting this field causes the monitor to send probe which validate the credentials of the Xen Desktop DDC.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_validatecred() throws Exception {
		return this.validatecred;
	}

	/**
	* <pre>
	* Domain name required by the monitors. This is for the Xen Desktop DDC monitor to validate the credentials and CITRIX-WI-EXTENDED monitor for logon process.
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* Domain name required by the monitors. This is for the Xen Desktop DDC monitor to validate the credentials and CITRIX-WI-EXTENDED monitor for logon process.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* List of IP address to be checked against the response to the DNS monitoring probe. Applicable only to the DNS monitors.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String[] ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* List of IP address to be checked against the response to the DNS monitoring probe. Applicable only to the DNS monitors.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Group name to be queried for NNTP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_group(String group) throws Exception{
		this.group = group;
	}

	/**
	* <pre>
	* Group name to be queried for NNTP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_group() throws Exception {
		return this.group;
	}

	/**
	* <pre>
	* File name to be used for FTP-EXTENDED monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_filename(String filename) throws Exception{
		this.filename = filename;
	}

	/**
	* <pre>
	* File name to be used for FTP-EXTENDED monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_filename() throws Exception {
		return this.filename;
	}

	/**
	* <pre>
	* Base name for the LDAP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_basedn(String basedn) throws Exception{
		this.basedn = basedn;
	}

	/**
	* <pre>
	* Base name for the LDAP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_basedn() throws Exception {
		return this.basedn;
	}

	/**
	* <pre>
	* BDN name for the LDAP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_binddn(String binddn) throws Exception{
		this.binddn = binddn;
	}

	/**
	* <pre>
	* BDN name for the LDAP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_binddn() throws Exception {
		return this.binddn;
	}

	/**
	* <pre>
	* Filter for the LDAP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_filter(String filter) throws Exception{
		this.filter = filter;
	}

	/**
	* <pre>
	* Filter for the LDAP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_filter() throws Exception {
		return this.filter;
	}

	/**
	* <pre>
	* Attribute for the LDAP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_attribute(String attribute) throws Exception{
		this.attribute = attribute;
	}

	/**
	* <pre>
	* Attribute for the LDAP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_attribute() throws Exception {
		return this.attribute;
	}

	/**
	* <pre>
	* Database to be used for the MYSQL/MSSQL monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_database(String database) throws Exception{
		this.database = database;
	}

	/**
	* <pre>
	* Database to be used for the MYSQL/MSSQL monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_database() throws Exception {
		return this.database;
	}

	/**
	* <pre>
	* SQL query to be used for the MYSQL/MSSQL monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sqlquery(String sqlquery) throws Exception{
		this.sqlquery = sqlquery;
	}

	/**
	* <pre>
	* SQL query to be used for the MYSQL/MSSQL monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sqlquery() throws Exception {
		return this.sqlquery;
	}

	/**
	* <pre>
	* Rule evaluated to determine the state of MYSQL/MSSQL monitor.
	* </pre>
	*/
	public void set_evalrule(String evalrule) throws Exception{
		this.evalrule = evalrule;
	}

	/**
	* <pre>
	* Rule evaluated to determine the state of MYSQL/MSSQL monitor.
	* </pre>
	*/
	public String get_evalrule() throws Exception {
		return this.evalrule;
	}

	/**
	* <pre>
	* Protocol Version used by MSSQL monitor.<br> Default value: TDS_PROT_70<br> Possible values = 70, 2000, 2000SP1, 2005, 2008, 2008R2
	* </pre>
	*/
	public void set_mssqlprotocolversion(String mssqlprotocolversion) throws Exception{
		this.mssqlprotocolversion = mssqlprotocolversion;
	}

	/**
	* <pre>
	* Protocol Version used by MSSQL monitor.<br> Default value: TDS_PROT_70<br> Possible values = 70, 2000, 2000SP1, 2005, 2008, 2008R2
	* </pre>
	*/
	public String get_mssqlprotocolversion() throws Exception {
		return this.mssqlprotocolversion;
	}

	/**
	* <pre>
	* OID to be used for the SNMP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_Snmpoid(String Snmpoid) throws Exception{
		this.Snmpoid = Snmpoid;
	}

	/**
	* <pre>
	* OID to be used for the SNMP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_Snmpoid() throws Exception {
		return this.Snmpoid;
	}

	/**
	* <pre>
	* Community to be used for the SNMP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_snmpcommunity(String snmpcommunity) throws Exception{
		this.snmpcommunity = snmpcommunity;
	}

	/**
	* <pre>
	* Community to be used for the SNMP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_snmpcommunity() throws Exception {
		return this.snmpcommunity;
	}

	/**
	* <pre>
	* Threshold to be used for the SNMP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_snmpthreshold(String snmpthreshold) throws Exception{
		this.snmpthreshold = snmpthreshold;
	}

	/**
	* <pre>
	* Threshold to be used for the SNMP monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_snmpthreshold() throws Exception {
		return this.snmpthreshold;
	}

	/**
	* <pre>
	* SNMP version to be used for LOAD monitoring.<br> Possible values = V1, V2
	* </pre>
	*/
	public void set_snmpversion(String snmpversion) throws Exception{
		this.snmpversion = snmpversion;
	}

	/**
	* <pre>
	* SNMP version to be used for LOAD monitoring.<br> Possible values = V1, V2
	* </pre>
	*/
	public String get_snmpversion() throws Exception {
		return this.snmpversion;
	}

	/**
	* <pre>
	* Metric table to use for the metrics that are going to be bound.<br> Minimum length =  1<br> Maximum length =  99
	* </pre>
	*/
	public void set_metrictable(String metrictable) throws Exception{
		this.metrictable = metrictable;
	}

	/**
	* <pre>
	* Metric table to use for the metrics that are going to be bound.<br> Minimum length =  1<br> Maximum length =  99
	* </pre>
	*/
	public String get_metrictable() throws Exception {
		return this.metrictable;
	}

	/**
	* <pre>
	* Name of the application that has to be executed to check the state of the service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_application(String application) throws Exception{
		this.application = application;
	}

	/**
	* <pre>
	* Name of the application that has to be executed to check the state of the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_application() throws Exception {
		return this.application;
	}

	/**
	* <pre>
	* URL of the logon page. To get the dynamic page under sitepath, this sitepath must be specified ending with "/".<br> Minimum length =  1
	* </pre>
	*/
	public void set_sitepath(String sitepath) throws Exception{
		this.sitepath = sitepath;
	}

	/**
	* <pre>
	* URL of the logon page. To get the dynamic page under sitepath, this sitepath must be specified ending with "/".<br> Minimum length =  1
	* </pre>
	*/
	public String get_sitepath() throws Exception {
		return this.sitepath;
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
	* Origin Host to be put in CER message.<br> Minimum length =  1
	* </pre>
	*/
	public void set_originhost(String originhost) throws Exception{
		this.originhost = originhost;
	}

	/**
	* <pre>
	* Origin Host to be put in CER message.<br> Minimum length =  1
	* </pre>
	*/
	public String get_originhost() throws Exception {
		return this.originhost;
	}

	/**
	* <pre>
	* Origin realm to be put in CER message.<br> Minimum length =  1
	* </pre>
	*/
	public void set_originrealm(String originrealm) throws Exception{
		this.originrealm = originrealm;
	}

	/**
	* <pre>
	* Origin realm to be put in CER message.<br> Minimum length =  1
	* </pre>
	*/
	public String get_originrealm() throws Exception {
		return this.originrealm;
	}

	/**
	* <pre>
	* Host IP Address to be put in CER message.<br> Minimum length =  1
	* </pre>
	*/
	public void set_hostipaddress(String hostipaddress) throws Exception{
		this.hostipaddress = hostipaddress;
	}

	/**
	* <pre>
	* Host IP Address to be put in CER message.<br> Minimum length =  1
	* </pre>
	*/
	public String get_hostipaddress() throws Exception {
		return this.hostipaddress;
	}

	/**
	* <pre>
	* Vendor ID to be put in CER message.
	* </pre>
	*/
	public void set_vendorid(long vendorid) throws Exception {
		this.vendorid = new Long(vendorid);
	}

	/**
	* <pre>
	* Vendor ID to be put in CER message.
	* </pre>
	*/
	public void set_vendorid(Long vendorid) throws Exception{
		this.vendorid = vendorid;
	}

	/**
	* <pre>
	* Vendor ID to be put in CER message.
	* </pre>
	*/
	public Long get_vendorid() throws Exception {
		return this.vendorid;
	}

	/**
	* <pre>
	* Product Name to be put in CER message.<br> Minimum length =  1
	* </pre>
	*/
	public void set_productname(String productname) throws Exception{
		this.productname = productname;
	}

	/**
	* <pre>
	* Product Name to be put in CER message.<br> Minimum length =  1
	* </pre>
	*/
	public String get_productname() throws Exception {
		return this.productname;
	}

	/**
	* <pre>
	* FIRMWARE-REVISION to be put in CER message.
	* </pre>
	*/
	public void set_firmwarerevision(long firmwarerevision) throws Exception {
		this.firmwarerevision = new Long(firmwarerevision);
	}

	/**
	* <pre>
	* FIRMWARE-REVISION to be put in CER message.
	* </pre>
	*/
	public void set_firmwarerevision(Long firmwarerevision) throws Exception{
		this.firmwarerevision = firmwarerevision;
	}

	/**
	* <pre>
	* FIRMWARE-REVISION to be put in CER message.
	* </pre>
	*/
	public Long get_firmwarerevision() throws Exception {
		return this.firmwarerevision;
	}

	/**
	* <pre>
	* list of Auth-Application-Ids to be put in CER message. maximum 8 such auth application id are supported in monitoring message.<br> Minimum value =  0<br> Maximum value =  4294967295
	* </pre>
	*/
	public void set_authapplicationid(Long[] authapplicationid) throws Exception{
		this.authapplicationid = authapplicationid;
	}

	/**
	* <pre>
	* list of Auth-Application-Ids to be put in CER message. maximum 8 such auth application id are supported in monitoring message.<br> Minimum value =  0<br> Maximum value =  4294967295
	* </pre>
	*/
	public Long[] get_authapplicationid() throws Exception {
		return this.authapplicationid;
	}

	/**
	* <pre>
	* list of ACCT-APPLICATION-IDs to be put in CER message. maximum 8 such acct application id are supported in monitoring message.<br> Minimum value =  0<br> Maximum value =  4294967295
	* </pre>
	*/
	public void set_acctapplicationid(Long[] acctapplicationid) throws Exception{
		this.acctapplicationid = acctapplicationid;
	}

	/**
	* <pre>
	* list of ACCT-APPLICATION-IDs to be put in CER message. maximum 8 such acct application id are supported in monitoring message.<br> Minimum value =  0<br> Maximum value =  4294967295
	* </pre>
	*/
	public Long[] get_acctapplicationid() throws Exception {
		return this.acctapplicationid;
	}

	/**
	* <pre>
	* INBAND-SECURITY-ID to be put in CER message.<br> Possible values = NO_INBAND_SECURITY, TLS
	* </pre>
	*/
	public void set_inbandsecurityid(String inbandsecurityid) throws Exception{
		this.inbandsecurityid = inbandsecurityid;
	}

	/**
	* <pre>
	* INBAND-SECURITY-ID to be put in CER message.<br> Possible values = NO_INBAND_SECURITY, TLS
	* </pre>
	*/
	public String get_inbandsecurityid() throws Exception {
		return this.inbandsecurityid;
	}

	/**
	* <pre>
	* list of SUPPORTED-VENDOR-ID to be put in CER message. maximum 8 such supported Vendor id are supported in monitoring message.<br> Minimum value =  1<br> Maximum value =  4294967295
	* </pre>
	*/
	public void set_supportedvendorids(Long[] supportedvendorids) throws Exception{
		this.supportedvendorids = supportedvendorids;
	}

	/**
	* <pre>
	* list of SUPPORTED-VENDOR-ID to be put in CER message. maximum 8 such supported Vendor id are supported in monitoring message.<br> Minimum value =  1<br> Maximum value =  4294967295
	* </pre>
	*/
	public Long[] get_supportedvendorids() throws Exception {
		return this.supportedvendorids;
	}

	/**
	* <pre>
	* Vendor Id to be used in Vendor-Specific-Application-Id in monitoring CER message. Only 1 such vendor id is supported.<br> Minimum value =  1
	* </pre>
	*/
	public void set_vendorspecificvendorid(long vendorspecificvendorid) throws Exception {
		this.vendorspecificvendorid = new Long(vendorspecificvendorid);
	}

	/**
	* <pre>
	* Vendor Id to be used in Vendor-Specific-Application-Id in monitoring CER message. Only 1 such vendor id is supported.<br> Minimum value =  1
	* </pre>
	*/
	public void set_vendorspecificvendorid(Long vendorspecificvendorid) throws Exception{
		this.vendorspecificvendorid = vendorspecificvendorid;
	}

	/**
	* <pre>
	* Vendor Id to be used in Vendor-Specific-Application-Id in monitoring CER message. Only 1 such vendor id is supported.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_vendorspecificvendorid() throws Exception {
		return this.vendorspecificvendorid;
	}

	/**
	* <pre>
	* list of Vendor-Specific-Auth-Application-Ids to be put in CER message. maximum 8 such supported Vendor specific auth application id are supported in monitoring message.<br> Minimum value =  0<br> Maximum value =  4294967295
	* </pre>
	*/
	public void set_vendorspecificauthapplicationids(Long[] vendorspecificauthapplicationids) throws Exception{
		this.vendorspecificauthapplicationids = vendorspecificauthapplicationids;
	}

	/**
	* <pre>
	* list of Vendor-Specific-Auth-Application-Ids to be put in CER message. maximum 8 such supported Vendor specific auth application id are supported in monitoring message.<br> Minimum value =  0<br> Maximum value =  4294967295
	* </pre>
	*/
	public Long[] get_vendorspecificauthapplicationids() throws Exception {
		return this.vendorspecificauthapplicationids;
	}

	/**
	* <pre>
	* list of Vendor-Specific-Acct-Application-Ids to be put in CER message. maximum 8 such supported Vendor specific accounting application id are supported in monitoring message.<br> Minimum value =  0<br> Maximum value =  4294967295
	* </pre>
	*/
	public void set_vendorspecificacctapplicationids(Long[] vendorspecificacctapplicationids) throws Exception{
		this.vendorspecificacctapplicationids = vendorspecificacctapplicationids;
	}

	/**
	* <pre>
	* list of Vendor-Specific-Acct-Application-Ids to be put in CER message. maximum 8 such supported Vendor specific accounting application id are supported in monitoring message.<br> Minimum value =  0<br> Maximum value =  4294967295
	* </pre>
	*/
	public Long[] get_vendorspecificacctapplicationids() throws Exception {
		return this.vendorspecificacctapplicationids;
	}

	/**
	* <pre>
	* Metric name in the metric table, whose setting is changed. A value zero disables the metric and it will not be used for load calculation.<br> Minimum length =  1<br> Maximum length =  37
	* </pre>
	*/
	public void set_metric(String metric) throws Exception{
		this.metric = metric;
	}

	/**
	* <pre>
	* Metric name in the metric table, whose setting is changed. A value zero disables the metric and it will not be used for load calculation.<br> Minimum length =  1<br> Maximum length =  37
	* </pre>
	*/
	public String get_metric() throws Exception {
		return this.metric;
	}

	/**
	* <pre>
	* Threshold to be used for that metric.
	* </pre>
	*/
	public void set_metricthreshold(long metricthreshold) throws Exception {
		this.metricthreshold = new Long(metricthreshold);
	}

	/**
	* <pre>
	* Threshold to be used for that metric.
	* </pre>
	*/
	public void set_metricthreshold(Long metricthreshold) throws Exception{
		this.metricthreshold = metricthreshold;
	}

	/**
	* <pre>
	* Threshold to be used for that metric.
	* </pre>
	*/
	public Long get_metricthreshold() throws Exception {
		return this.metricthreshold;
	}

	/**
	* <pre>
	* The weight for the specified service metric with respect to others.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_metricweight(long metricweight) throws Exception {
		this.metricweight = new Long(metricweight);
	}

	/**
	* <pre>
	* The weight for the specified service metric with respect to others.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_metricweight(Long metricweight) throws Exception{
		this.metricweight = metricweight;
	}

	/**
	* <pre>
	* The weight for the specified service metric with respect to others.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_metricweight() throws Exception {
		return this.metricweight;
	}

	/**
	* <pre>
	* The name of the service to which the monitor is bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the service to which the monitor is bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The name of the service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of the service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* State of LRTM configuration on the monitor.
	* </pre>
	*/
	public Integer get_lrtmconf() throws Exception {
		return this.lrtmconf;
	}

	/**
	* <pre>
	* Response timeout of the DRTM enabled monitor , calculated dynamically based on the history and current response time.
	* </pre>
	*/
	public Integer get_dynamicresponsetimeout() throws Exception {
		return this.dynamicresponsetimeout;
	}

	/**
	* <pre>
	* Interval between monitoring probes for DRTM enabled monitor , calculated dynamically based monitor response time.
	* </pre>
	*/
	public Integer get_dynamicinterval() throws Exception {
		return this.dynamicinterval;
	}

	/**
	* <pre>
	* .<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dup_state() throws Exception {
		return this.dup_state;
	}

	/**
	* <pre>
	* .<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_dup_weight() throws Exception {
		return this.dup_weight;
	}

	/**
	* <pre>
	* .<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonitor_response result = (lbmonitor_response) service.get_payload_formatter().string_to_resource(lbmonitor_response.class, response);
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
		return result.lbmonitor;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.monitorname;
	}

	/**
	* Use this API to add lbmonitor.
	*/
	public static base_response add(nitro_service client, lbmonitor resource) throws Exception {
		lbmonitor addresource = new lbmonitor();
		addresource.monitorname = resource.monitorname;
		addresource.type = resource.type;
		addresource.action = resource.action;
		addresource.respcode = resource.respcode;
		addresource.httprequest = resource.httprequest;
		addresource.rtsprequest = resource.rtsprequest;
		addresource.customheaders = resource.customheaders;
		addresource.maxforwards = resource.maxforwards;
		addresource.sipmethod = resource.sipmethod;
		addresource.sipuri = resource.sipuri;
		addresource.sipreguri = resource.sipreguri;
		addresource.send = resource.send;
		addresource.recv = resource.recv;
		addresource.query = resource.query;
		addresource.querytype = resource.querytype;
		addresource.scriptname = resource.scriptname;
		addresource.scriptargs = resource.scriptargs;
		addresource.dispatcherip = resource.dispatcherip;
		addresource.dispatcherport = resource.dispatcherport;
		addresource.username = resource.username;
		addresource.password = resource.password;
		addresource.secondarypassword = resource.secondarypassword;
		addresource.logonpointname = resource.logonpointname;
		addresource.lasversion = resource.lasversion;
		addresource.radkey = resource.radkey;
		addresource.radnasid = resource.radnasid;
		addresource.radnasip = resource.radnasip;
		addresource.lrtm = resource.lrtm;
		addresource.deviation = resource.deviation;
		addresource.units1 = resource.units1;
		addresource.interval = resource.interval;
		addresource.units3 = resource.units3;
		addresource.resptimeout = resource.resptimeout;
		addresource.units4 = resource.units4;
		addresource.resptimeoutthresh = resource.resptimeoutthresh;
		addresource.retries = resource.retries;
		addresource.failureretries = resource.failureretries;
		addresource.alertretries = resource.alertretries;
		addresource.successretries = resource.successretries;
		addresource.downtime = resource.downtime;
		addresource.units2 = resource.units2;
		addresource.destip = resource.destip;
		addresource.destport = resource.destport;
		addresource.state = resource.state;
		addresource.reverse = resource.reverse;
		addresource.transparent = resource.transparent;
		addresource.iptunnel = resource.iptunnel;
		addresource.tos = resource.tos;
		addresource.tosid = resource.tosid;
		addresource.secure = resource.secure;
		addresource.validatecred = resource.validatecred;
		addresource.domain = resource.domain;
		addresource.ipaddress = resource.ipaddress;
		addresource.group = resource.group;
		addresource.filename = resource.filename;
		addresource.basedn = resource.basedn;
		addresource.binddn = resource.binddn;
		addresource.filter = resource.filter;
		addresource.attribute = resource.attribute;
		addresource.database = resource.database;
		addresource.sqlquery = resource.sqlquery;
		addresource.evalrule = resource.evalrule;
		addresource.mssqlprotocolversion = resource.mssqlprotocolversion;
		addresource.Snmpoid = resource.Snmpoid;
		addresource.snmpcommunity = resource.snmpcommunity;
		addresource.snmpthreshold = resource.snmpthreshold;
		addresource.snmpversion = resource.snmpversion;
		addresource.metrictable = resource.metrictable;
		addresource.application = resource.application;
		addresource.sitepath = resource.sitepath;
		addresource.netprofile = resource.netprofile;
		addresource.originhost = resource.originhost;
		addresource.originrealm = resource.originrealm;
		addresource.hostipaddress = resource.hostipaddress;
		addresource.vendorid = resource.vendorid;
		addresource.productname = resource.productname;
		addresource.firmwarerevision = resource.firmwarerevision;
		addresource.authapplicationid = resource.authapplicationid;
		addresource.acctapplicationid = resource.acctapplicationid;
		addresource.inbandsecurityid = resource.inbandsecurityid;
		addresource.supportedvendorids = resource.supportedvendorids;
		addresource.vendorspecificvendorid = resource.vendorspecificvendorid;
		addresource.vendorspecificauthapplicationids = resource.vendorspecificauthapplicationids;
		addresource.vendorspecificacctapplicationids = resource.vendorspecificacctapplicationids;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add lbmonitor resources.
	*/
	public static base_responses add(nitro_service client, lbmonitor resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor addresources[] = new lbmonitor[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new lbmonitor();
				addresources[i].monitorname = resources[i].monitorname;
				addresources[i].type = resources[i].type;
				addresources[i].action = resources[i].action;
				addresources[i].respcode = resources[i].respcode;
				addresources[i].httprequest = resources[i].httprequest;
				addresources[i].rtsprequest = resources[i].rtsprequest;
				addresources[i].customheaders = resources[i].customheaders;
				addresources[i].maxforwards = resources[i].maxforwards;
				addresources[i].sipmethod = resources[i].sipmethod;
				addresources[i].sipuri = resources[i].sipuri;
				addresources[i].sipreguri = resources[i].sipreguri;
				addresources[i].send = resources[i].send;
				addresources[i].recv = resources[i].recv;
				addresources[i].query = resources[i].query;
				addresources[i].querytype = resources[i].querytype;
				addresources[i].scriptname = resources[i].scriptname;
				addresources[i].scriptargs = resources[i].scriptargs;
				addresources[i].dispatcherip = resources[i].dispatcherip;
				addresources[i].dispatcherport = resources[i].dispatcherport;
				addresources[i].username = resources[i].username;
				addresources[i].password = resources[i].password;
				addresources[i].secondarypassword = resources[i].secondarypassword;
				addresources[i].logonpointname = resources[i].logonpointname;
				addresources[i].lasversion = resources[i].lasversion;
				addresources[i].radkey = resources[i].radkey;
				addresources[i].radnasid = resources[i].radnasid;
				addresources[i].radnasip = resources[i].radnasip;
				addresources[i].lrtm = resources[i].lrtm;
				addresources[i].deviation = resources[i].deviation;
				addresources[i].units1 = resources[i].units1;
				addresources[i].interval = resources[i].interval;
				addresources[i].units3 = resources[i].units3;
				addresources[i].resptimeout = resources[i].resptimeout;
				addresources[i].units4 = resources[i].units4;
				addresources[i].resptimeoutthresh = resources[i].resptimeoutthresh;
				addresources[i].retries = resources[i].retries;
				addresources[i].failureretries = resources[i].failureretries;
				addresources[i].alertretries = resources[i].alertretries;
				addresources[i].successretries = resources[i].successretries;
				addresources[i].downtime = resources[i].downtime;
				addresources[i].units2 = resources[i].units2;
				addresources[i].destip = resources[i].destip;
				addresources[i].destport = resources[i].destport;
				addresources[i].state = resources[i].state;
				addresources[i].reverse = resources[i].reverse;
				addresources[i].transparent = resources[i].transparent;
				addresources[i].iptunnel = resources[i].iptunnel;
				addresources[i].tos = resources[i].tos;
				addresources[i].tosid = resources[i].tosid;
				addresources[i].secure = resources[i].secure;
				addresources[i].validatecred = resources[i].validatecred;
				addresources[i].domain = resources[i].domain;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].group = resources[i].group;
				addresources[i].filename = resources[i].filename;
				addresources[i].basedn = resources[i].basedn;
				addresources[i].binddn = resources[i].binddn;
				addresources[i].filter = resources[i].filter;
				addresources[i].attribute = resources[i].attribute;
				addresources[i].database = resources[i].database;
				addresources[i].sqlquery = resources[i].sqlquery;
				addresources[i].evalrule = resources[i].evalrule;
				addresources[i].mssqlprotocolversion = resources[i].mssqlprotocolversion;
				addresources[i].Snmpoid = resources[i].Snmpoid;
				addresources[i].snmpcommunity = resources[i].snmpcommunity;
				addresources[i].snmpthreshold = resources[i].snmpthreshold;
				addresources[i].snmpversion = resources[i].snmpversion;
				addresources[i].metrictable = resources[i].metrictable;
				addresources[i].application = resources[i].application;
				addresources[i].sitepath = resources[i].sitepath;
				addresources[i].netprofile = resources[i].netprofile;
				addresources[i].originhost = resources[i].originhost;
				addresources[i].originrealm = resources[i].originrealm;
				addresources[i].hostipaddress = resources[i].hostipaddress;
				addresources[i].vendorid = resources[i].vendorid;
				addresources[i].productname = resources[i].productname;
				addresources[i].firmwarerevision = resources[i].firmwarerevision;
				addresources[i].authapplicationid = resources[i].authapplicationid;
				addresources[i].acctapplicationid = resources[i].acctapplicationid;
				addresources[i].inbandsecurityid = resources[i].inbandsecurityid;
				addresources[i].supportedvendorids = resources[i].supportedvendorids;
				addresources[i].vendorspecificvendorid = resources[i].vendorspecificvendorid;
				addresources[i].vendorspecificauthapplicationids = resources[i].vendorspecificauthapplicationids;
				addresources[i].vendorspecificacctapplicationids = resources[i].vendorspecificacctapplicationids;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbmonitor of given name.
	*/
	public static base_response delete(nitro_service client, String monitorname) throws Exception {
		lbmonitor deleteresource = new lbmonitor();
		deleteresource.monitorname = monitorname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbmonitor.
	*/
	public static base_response delete(nitro_service client, lbmonitor resource) throws Exception {
		lbmonitor deleteresource = new lbmonitor();
		deleteresource.monitorname = resource.monitorname;
		deleteresource.type = resource.type;
		deleteresource.respcode = resource.respcode;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbmonitor resources of given names.
	*/
	public static base_responses delete(nitro_service client, String monitorname[]) throws Exception {
		base_responses result = null;
		if (monitorname != null && monitorname.length > 0) {
			lbmonitor deleteresources[] = new lbmonitor[monitorname.length];
			for (int i=0;i<monitorname.length;i++){
				deleteresources[i] = new lbmonitor();
				deleteresources[i].monitorname = monitorname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbmonitor resources.
	*/
	public static base_responses delete(nitro_service client, lbmonitor resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor deleteresources[] = new lbmonitor[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbmonitor();
				deleteresources[i].monitorname = resources[i].monitorname;
				deleteresources[i].type = resources[i].type;
				deleteresources[i].respcode = resources[i].respcode;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update lbmonitor.
	*/
	public static base_response update(nitro_service client, lbmonitor resource) throws Exception {
		lbmonitor updateresource = new lbmonitor();
		updateresource.monitorname = resource.monitorname;
		updateresource.type = resource.type;
		updateresource.action = resource.action;
		updateresource.respcode = resource.respcode;
		updateresource.httprequest = resource.httprequest;
		updateresource.rtsprequest = resource.rtsprequest;
		updateresource.customheaders = resource.customheaders;
		updateresource.maxforwards = resource.maxforwards;
		updateresource.sipmethod = resource.sipmethod;
		updateresource.sipreguri = resource.sipreguri;
		updateresource.sipuri = resource.sipuri;
		updateresource.send = resource.send;
		updateresource.recv = resource.recv;
		updateresource.query = resource.query;
		updateresource.querytype = resource.querytype;
		updateresource.username = resource.username;
		updateresource.password = resource.password;
		updateresource.secondarypassword = resource.secondarypassword;
		updateresource.logonpointname = resource.logonpointname;
		updateresource.lasversion = resource.lasversion;
		updateresource.radkey = resource.radkey;
		updateresource.radnasid = resource.radnasid;
		updateresource.radnasip = resource.radnasip;
		updateresource.lrtm = resource.lrtm;
		updateresource.deviation = resource.deviation;
		updateresource.units1 = resource.units1;
		updateresource.scriptname = resource.scriptname;
		updateresource.scriptargs = resource.scriptargs;
		updateresource.validatecred = resource.validatecred;
		updateresource.domain = resource.domain;
		updateresource.dispatcherip = resource.dispatcherip;
		updateresource.dispatcherport = resource.dispatcherport;
		updateresource.interval = resource.interval;
		updateresource.units3 = resource.units3;
		updateresource.resptimeout = resource.resptimeout;
		updateresource.units4 = resource.units4;
		updateresource.resptimeoutthresh = resource.resptimeoutthresh;
		updateresource.retries = resource.retries;
		updateresource.failureretries = resource.failureretries;
		updateresource.alertretries = resource.alertretries;
		updateresource.successretries = resource.successretries;
		updateresource.downtime = resource.downtime;
		updateresource.units2 = resource.units2;
		updateresource.destip = resource.destip;
		updateresource.destport = resource.destport;
		updateresource.state = resource.state;
		updateresource.reverse = resource.reverse;
		updateresource.transparent = resource.transparent;
		updateresource.iptunnel = resource.iptunnel;
		updateresource.tos = resource.tos;
		updateresource.tosid = resource.tosid;
		updateresource.secure = resource.secure;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.group = resource.group;
		updateresource.filename = resource.filename;
		updateresource.basedn = resource.basedn;
		updateresource.binddn = resource.binddn;
		updateresource.filter = resource.filter;
		updateresource.attribute = resource.attribute;
		updateresource.database = resource.database;
		updateresource.sqlquery = resource.sqlquery;
		updateresource.evalrule = resource.evalrule;
		updateresource.Snmpoid = resource.Snmpoid;
		updateresource.snmpcommunity = resource.snmpcommunity;
		updateresource.snmpthreshold = resource.snmpthreshold;
		updateresource.snmpversion = resource.snmpversion;
		updateresource.metrictable = resource.metrictable;
		updateresource.metric = resource.metric;
		updateresource.metricthreshold = resource.metricthreshold;
		updateresource.metricweight = resource.metricweight;
		updateresource.application = resource.application;
		updateresource.sitepath = resource.sitepath;
		updateresource.netprofile = resource.netprofile;
		updateresource.mssqlprotocolversion = resource.mssqlprotocolversion;
		updateresource.originhost = resource.originhost;
		updateresource.originrealm = resource.originrealm;
		updateresource.hostipaddress = resource.hostipaddress;
		updateresource.vendorid = resource.vendorid;
		updateresource.productname = resource.productname;
		updateresource.firmwarerevision = resource.firmwarerevision;
		updateresource.authapplicationid = resource.authapplicationid;
		updateresource.acctapplicationid = resource.acctapplicationid;
		updateresource.inbandsecurityid = resource.inbandsecurityid;
		updateresource.supportedvendorids = resource.supportedvendorids;
		updateresource.vendorspecificvendorid = resource.vendorspecificvendorid;
		updateresource.vendorspecificauthapplicationids = resource.vendorspecificauthapplicationids;
		updateresource.vendorspecificacctapplicationids = resource.vendorspecificacctapplicationids;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update lbmonitor resources.
	*/
	public static base_responses update(nitro_service client, lbmonitor resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor updateresources[] = new lbmonitor[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbmonitor();
				updateresources[i].monitorname = resources[i].monitorname;
				updateresources[i].type = resources[i].type;
				updateresources[i].action = resources[i].action;
				updateresources[i].respcode = resources[i].respcode;
				updateresources[i].httprequest = resources[i].httprequest;
				updateresources[i].rtsprequest = resources[i].rtsprequest;
				updateresources[i].customheaders = resources[i].customheaders;
				updateresources[i].maxforwards = resources[i].maxforwards;
				updateresources[i].sipmethod = resources[i].sipmethod;
				updateresources[i].sipreguri = resources[i].sipreguri;
				updateresources[i].sipuri = resources[i].sipuri;
				updateresources[i].send = resources[i].send;
				updateresources[i].recv = resources[i].recv;
				updateresources[i].query = resources[i].query;
				updateresources[i].querytype = resources[i].querytype;
				updateresources[i].username = resources[i].username;
				updateresources[i].password = resources[i].password;
				updateresources[i].secondarypassword = resources[i].secondarypassword;
				updateresources[i].logonpointname = resources[i].logonpointname;
				updateresources[i].lasversion = resources[i].lasversion;
				updateresources[i].radkey = resources[i].radkey;
				updateresources[i].radnasid = resources[i].radnasid;
				updateresources[i].radnasip = resources[i].radnasip;
				updateresources[i].lrtm = resources[i].lrtm;
				updateresources[i].deviation = resources[i].deviation;
				updateresources[i].units1 = resources[i].units1;
				updateresources[i].scriptname = resources[i].scriptname;
				updateresources[i].scriptargs = resources[i].scriptargs;
				updateresources[i].validatecred = resources[i].validatecred;
				updateresources[i].domain = resources[i].domain;
				updateresources[i].dispatcherip = resources[i].dispatcherip;
				updateresources[i].dispatcherport = resources[i].dispatcherport;
				updateresources[i].interval = resources[i].interval;
				updateresources[i].units3 = resources[i].units3;
				updateresources[i].resptimeout = resources[i].resptimeout;
				updateresources[i].units4 = resources[i].units4;
				updateresources[i].resptimeoutthresh = resources[i].resptimeoutthresh;
				updateresources[i].retries = resources[i].retries;
				updateresources[i].failureretries = resources[i].failureretries;
				updateresources[i].alertretries = resources[i].alertretries;
				updateresources[i].successretries = resources[i].successretries;
				updateresources[i].downtime = resources[i].downtime;
				updateresources[i].units2 = resources[i].units2;
				updateresources[i].destip = resources[i].destip;
				updateresources[i].destport = resources[i].destport;
				updateresources[i].state = resources[i].state;
				updateresources[i].reverse = resources[i].reverse;
				updateresources[i].transparent = resources[i].transparent;
				updateresources[i].iptunnel = resources[i].iptunnel;
				updateresources[i].tos = resources[i].tos;
				updateresources[i].tosid = resources[i].tosid;
				updateresources[i].secure = resources[i].secure;
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].group = resources[i].group;
				updateresources[i].filename = resources[i].filename;
				updateresources[i].basedn = resources[i].basedn;
				updateresources[i].binddn = resources[i].binddn;
				updateresources[i].filter = resources[i].filter;
				updateresources[i].attribute = resources[i].attribute;
				updateresources[i].database = resources[i].database;
				updateresources[i].sqlquery = resources[i].sqlquery;
				updateresources[i].evalrule = resources[i].evalrule;
				updateresources[i].Snmpoid = resources[i].Snmpoid;
				updateresources[i].snmpcommunity = resources[i].snmpcommunity;
				updateresources[i].snmpthreshold = resources[i].snmpthreshold;
				updateresources[i].snmpversion = resources[i].snmpversion;
				updateresources[i].metrictable = resources[i].metrictable;
				updateresources[i].metric = resources[i].metric;
				updateresources[i].metricthreshold = resources[i].metricthreshold;
				updateresources[i].metricweight = resources[i].metricweight;
				updateresources[i].application = resources[i].application;
				updateresources[i].sitepath = resources[i].sitepath;
				updateresources[i].netprofile = resources[i].netprofile;
				updateresources[i].mssqlprotocolversion = resources[i].mssqlprotocolversion;
				updateresources[i].originhost = resources[i].originhost;
				updateresources[i].originrealm = resources[i].originrealm;
				updateresources[i].hostipaddress = resources[i].hostipaddress;
				updateresources[i].vendorid = resources[i].vendorid;
				updateresources[i].productname = resources[i].productname;
				updateresources[i].firmwarerevision = resources[i].firmwarerevision;
				updateresources[i].authapplicationid = resources[i].authapplicationid;
				updateresources[i].acctapplicationid = resources[i].acctapplicationid;
				updateresources[i].inbandsecurityid = resources[i].inbandsecurityid;
				updateresources[i].supportedvendorids = resources[i].supportedvendorids;
				updateresources[i].vendorspecificvendorid = resources[i].vendorspecificvendorid;
				updateresources[i].vendorspecificauthapplicationids = resources[i].vendorspecificauthapplicationids;
				updateresources[i].vendorspecificacctapplicationids = resources[i].vendorspecificacctapplicationids;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbmonitor resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String monitorname, String args[]) throws Exception {
		lbmonitor unsetresource = new lbmonitor();
		unsetresource.monitorname = monitorname;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of lbmonitor resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, lbmonitor resource, String[] args) throws Exception{
		lbmonitor unsetresource = new lbmonitor();
		unsetresource.monitorname = resource.monitorname;
		unsetresource.type = resource.type;
		unsetresource.ipaddress = resource.ipaddress;
		unsetresource.scriptname = resource.scriptname;
		unsetresource.destport = resource.destport;
		unsetresource.netprofile = resource.netprofile;
		unsetresource.action = resource.action;
		unsetresource.respcode = resource.respcode;
		unsetresource.httprequest = resource.httprequest;
		unsetresource.rtsprequest = resource.rtsprequest;
		unsetresource.customheaders = resource.customheaders;
		unsetresource.maxforwards = resource.maxforwards;
		unsetresource.sipmethod = resource.sipmethod;
		unsetresource.sipreguri = resource.sipreguri;
		unsetresource.send = resource.send;
		unsetresource.recv = resource.recv;
		unsetresource.query = resource.query;
		unsetresource.querytype = resource.querytype;
		unsetresource.username = resource.username;
		unsetresource.password = resource.password;
		unsetresource.secondarypassword = resource.secondarypassword;
		unsetresource.logonpointname = resource.logonpointname;
		unsetresource.lasversion = resource.lasversion;
		unsetresource.radkey = resource.radkey;
		unsetresource.radnasid = resource.radnasid;
		unsetresource.radnasip = resource.radnasip;
		unsetresource.lrtm = resource.lrtm;
		unsetresource.deviation = resource.deviation;
		unsetresource.scriptargs = resource.scriptargs;
		unsetresource.validatecred = resource.validatecred;
		unsetresource.domain = resource.domain;
		unsetresource.dispatcherip = resource.dispatcherip;
		unsetresource.dispatcherport = resource.dispatcherport;
		unsetresource.interval = resource.interval;
		unsetresource.resptimeout = resource.resptimeout;
		unsetresource.resptimeoutthresh = resource.resptimeoutthresh;
		unsetresource.retries = resource.retries;
		unsetresource.failureretries = resource.failureretries;
		unsetresource.alertretries = resource.alertretries;
		unsetresource.successretries = resource.successretries;
		unsetresource.downtime = resource.downtime;
		unsetresource.destip = resource.destip;
		unsetresource.state = resource.state;
		unsetresource.reverse = resource.reverse;
		unsetresource.transparent = resource.transparent;
		unsetresource.iptunnel = resource.iptunnel;
		unsetresource.tos = resource.tos;
		unsetresource.tosid = resource.tosid;
		unsetresource.secure = resource.secure;
		unsetresource.group = resource.group;
		unsetresource.filename = resource.filename;
		unsetresource.basedn = resource.basedn;
		unsetresource.binddn = resource.binddn;
		unsetresource.filter = resource.filter;
		unsetresource.attribute = resource.attribute;
		unsetresource.database = resource.database;
		unsetresource.sqlquery = resource.sqlquery;
		unsetresource.evalrule = resource.evalrule;
		unsetresource.Snmpoid = resource.Snmpoid;
		unsetresource.snmpcommunity = resource.snmpcommunity;
		unsetresource.snmpthreshold = resource.snmpthreshold;
		unsetresource.snmpversion = resource.snmpversion;
		unsetresource.metrictable = resource.metrictable;
		unsetresource.mssqlprotocolversion = resource.mssqlprotocolversion;
		unsetresource.originhost = resource.originhost;
		unsetresource.originrealm = resource.originrealm;
		unsetresource.hostipaddress = resource.hostipaddress;
		unsetresource.vendorid = resource.vendorid;
		unsetresource.productname = resource.productname;
		unsetresource.firmwarerevision = resource.firmwarerevision;
		unsetresource.authapplicationid = resource.authapplicationid;
		unsetresource.acctapplicationid = resource.acctapplicationid;
		unsetresource.inbandsecurityid = resource.inbandsecurityid;
		unsetresource.supportedvendorids = resource.supportedvendorids;
		unsetresource.vendorspecificvendorid = resource.vendorspecificvendorid;
		unsetresource.vendorspecificauthapplicationids = resource.vendorspecificauthapplicationids;
		unsetresource.vendorspecificacctapplicationids = resource.vendorspecificacctapplicationids;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of lbmonitor resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String monitorname[], String args[]) throws Exception {
		base_responses result = null;
		if (monitorname != null && monitorname.length > 0) {
			lbmonitor unsetresources[] = new lbmonitor[monitorname.length];
			for (int i=0;i<monitorname.length;i++){
				unsetresources[i] = new lbmonitor();
				unsetresources[i].monitorname = monitorname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbmonitor resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, lbmonitor resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor unsetresources[] = new lbmonitor[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new lbmonitor();
				unsetresources[i].monitorname = resources[i].monitorname;
				unsetresources[i].type = resources[i].type;
				unsetresources[i].ipaddress = resources[i].ipaddress;
				unsetresources[i].scriptname = resources[i].scriptname;
				unsetresources[i].destport = resources[i].destport;
				unsetresources[i].netprofile = resources[i].netprofile;
				unsetresources[i].action = resources[i].action;
				unsetresources[i].respcode = resources[i].respcode;
				unsetresources[i].httprequest = resources[i].httprequest;
				unsetresources[i].rtsprequest = resources[i].rtsprequest;
				unsetresources[i].customheaders = resources[i].customheaders;
				unsetresources[i].maxforwards = resources[i].maxforwards;
				unsetresources[i].sipmethod = resources[i].sipmethod;
				unsetresources[i].sipreguri = resources[i].sipreguri;
				unsetresources[i].send = resources[i].send;
				unsetresources[i].recv = resources[i].recv;
				unsetresources[i].query = resources[i].query;
				unsetresources[i].querytype = resources[i].querytype;
				unsetresources[i].username = resources[i].username;
				unsetresources[i].password = resources[i].password;
				unsetresources[i].secondarypassword = resources[i].secondarypassword;
				unsetresources[i].logonpointname = resources[i].logonpointname;
				unsetresources[i].lasversion = resources[i].lasversion;
				unsetresources[i].radkey = resources[i].radkey;
				unsetresources[i].radnasid = resources[i].radnasid;
				unsetresources[i].radnasip = resources[i].radnasip;
				unsetresources[i].lrtm = resources[i].lrtm;
				unsetresources[i].deviation = resources[i].deviation;
				unsetresources[i].scriptargs = resources[i].scriptargs;
				unsetresources[i].validatecred = resources[i].validatecred;
				unsetresources[i].domain = resources[i].domain;
				unsetresources[i].dispatcherip = resources[i].dispatcherip;
				unsetresources[i].dispatcherport = resources[i].dispatcherport;
				unsetresources[i].interval = resources[i].interval;
				unsetresources[i].resptimeout = resources[i].resptimeout;
				unsetresources[i].resptimeoutthresh = resources[i].resptimeoutthresh;
				unsetresources[i].retries = resources[i].retries;
				unsetresources[i].failureretries = resources[i].failureretries;
				unsetresources[i].alertretries = resources[i].alertretries;
				unsetresources[i].successretries = resources[i].successretries;
				unsetresources[i].downtime = resources[i].downtime;
				unsetresources[i].destip = resources[i].destip;
				unsetresources[i].state = resources[i].state;
				unsetresources[i].reverse = resources[i].reverse;
				unsetresources[i].transparent = resources[i].transparent;
				unsetresources[i].iptunnel = resources[i].iptunnel;
				unsetresources[i].tos = resources[i].tos;
				unsetresources[i].tosid = resources[i].tosid;
				unsetresources[i].secure = resources[i].secure;
				unsetresources[i].group = resources[i].group;
				unsetresources[i].filename = resources[i].filename;
				unsetresources[i].basedn = resources[i].basedn;
				unsetresources[i].binddn = resources[i].binddn;
				unsetresources[i].filter = resources[i].filter;
				unsetresources[i].attribute = resources[i].attribute;
				unsetresources[i].database = resources[i].database;
				unsetresources[i].sqlquery = resources[i].sqlquery;
				unsetresources[i].evalrule = resources[i].evalrule;
				unsetresources[i].Snmpoid = resources[i].Snmpoid;
				unsetresources[i].snmpcommunity = resources[i].snmpcommunity;
				unsetresources[i].snmpthreshold = resources[i].snmpthreshold;
				unsetresources[i].snmpversion = resources[i].snmpversion;
				unsetresources[i].metrictable = resources[i].metrictable;
				unsetresources[i].mssqlprotocolversion = resources[i].mssqlprotocolversion;
				unsetresources[i].originhost = resources[i].originhost;
				unsetresources[i].originrealm = resources[i].originrealm;
				unsetresources[i].hostipaddress = resources[i].hostipaddress;
				unsetresources[i].vendorid = resources[i].vendorid;
				unsetresources[i].productname = resources[i].productname;
				unsetresources[i].firmwarerevision = resources[i].firmwarerevision;
				unsetresources[i].authapplicationid = resources[i].authapplicationid;
				unsetresources[i].acctapplicationid = resources[i].acctapplicationid;
				unsetresources[i].inbandsecurityid = resources[i].inbandsecurityid;
				unsetresources[i].supportedvendorids = resources[i].supportedvendorids;
				unsetresources[i].vendorspecificvendorid = resources[i].vendorspecificvendorid;
				unsetresources[i].vendorspecificauthapplicationids = resources[i].vendorspecificauthapplicationids;
				unsetresources[i].vendorspecificacctapplicationids = resources[i].vendorspecificacctapplicationids;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable lbmonitor of given name.
	*/
	public static base_response enable(nitro_service client, String monitorname) throws Exception {
		lbmonitor enableresource = new lbmonitor();
		enableresource.monitorname = monitorname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable lbmonitor.
	*/
	public static base_response enable(nitro_service client, lbmonitor resource) throws Exception {
		lbmonitor enableresource = new lbmonitor();
		enableresource.servicename = resource.servicename;
		enableresource.servicegroupname = resource.servicegroupname;
		enableresource.monitorname = resource.monitorname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable lbmonitor resources of given names.
	*/
	public static base_responses enable(nitro_service client, String monitorname[]) throws Exception {
		base_responses result = null;
		if (monitorname != null && monitorname.length > 0) {
			lbmonitor enableresources[] = new lbmonitor[monitorname.length];
			for (int i=0;i<monitorname.length;i++){
				enableresources[i] = new lbmonitor();
				enableresources[i].monitorname = monitorname[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable lbmonitor resources.
	*/
	public static base_responses enable(nitro_service client, lbmonitor resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor enableresources[] = new lbmonitor[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new lbmonitor();
				enableresources[i].servicename = resources[i].servicename;
				enableresources[i].servicegroupname = resources[i].servicegroupname;
				enableresources[i].monitorname = resources[i].monitorname;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable lbmonitor of given name.
	*/
	public static base_response disable(nitro_service client, String monitorname) throws Exception {
		lbmonitor disableresource = new lbmonitor();
		disableresource.monitorname = monitorname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable lbmonitor.
	*/
	public static base_response disable(nitro_service client, lbmonitor resource) throws Exception {
		lbmonitor disableresource = new lbmonitor();
		disableresource.servicename = resource.servicename;
		disableresource.servicegroupname = resource.servicegroupname;
		disableresource.monitorname = resource.monitorname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable lbmonitor resources of given names.
	*/
	public static base_responses disable(nitro_service client, String monitorname[]) throws Exception {
		base_responses result = null;
		if (monitorname != null && monitorname.length > 0) {
			lbmonitor disableresources[] = new lbmonitor[monitorname.length];
			for (int i=0;i<monitorname.length;i++){
				disableresources[i] = new lbmonitor();
				disableresources[i].monitorname = monitorname[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable lbmonitor resources.
	*/
	public static base_responses disable(nitro_service client, lbmonitor resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor disableresources[] = new lbmonitor[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new lbmonitor();
				disableresources[i].servicename = resources[i].servicename;
				disableresources[i].servicegroupname = resources[i].servicegroupname;
				disableresources[i].monitorname = resources[i].monitorname;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to fetch all the lbmonitor resources that are configured on netscaler.
	*/
	public static lbmonitor[] get(nitro_service service) throws Exception{
		lbmonitor obj = new lbmonitor();
		lbmonitor[] response = (lbmonitor[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lbmonitor resources that are configured on netscaler.
	*/
	public static lbmonitor[] get(nitro_service service, options option) throws Exception{
		lbmonitor obj = new lbmonitor();
		lbmonitor[] response = (lbmonitor[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the lbmonitor resources that are configured on netscaler.
	* This uses lbmonitor_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static lbmonitor[] get(nitro_service service, lbmonitor_args args) throws Exception{
		lbmonitor obj = new lbmonitor();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		lbmonitor[] response = (lbmonitor[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch lbmonitor resource of given name .
	*/
	public static lbmonitor get(nitro_service service, String monitorname) throws Exception{
		lbmonitor obj = new lbmonitor();
		obj.set_monitorname(monitorname);
		lbmonitor response = (lbmonitor) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbmonitor resources of given names .
	*/
	public static lbmonitor[] get(nitro_service service, String monitorname[]) throws Exception{
		if (monitorname !=null && monitorname.length>0) {
			lbmonitor response[] = new lbmonitor[monitorname.length];
			lbmonitor obj[] = new lbmonitor[monitorname.length];
			for (int i=0;i<monitorname.length;i++) {
				obj[i] = new lbmonitor();
				obj[i].set_monitorname(monitorname[i]);
				response[i] = (lbmonitor) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of lbmonitor resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbmonitor[] get_filtered(nitro_service service, String filter) throws Exception{
		lbmonitor obj = new lbmonitor();
		options option = new options();
		option.set_filter(filter);
		lbmonitor[] response = (lbmonitor[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmonitor resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbmonitor[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbmonitor obj = new lbmonitor();
		options option = new options();
		option.set_filter(filter);
		lbmonitor[] response = (lbmonitor[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbmonitor resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lbmonitor obj = new lbmonitor();
		options option = new options();
		option.set_count(true);
		lbmonitor[] response = (lbmonitor[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbmonitor resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lbmonitor obj = new lbmonitor();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmonitor[] response = (lbmonitor[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmonitor resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbmonitor obj = new lbmonitor();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmonitor[] response = (lbmonitor[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class secureEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class iptunnelEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class validatecredEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class tosEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class units3Enum {
		public static final String SEC = "SEC";
		public static final String MSEC = "MSEC";
		public static final String MIN = "MIN";
	}
	public static class inbandsecurityidEnum {
		public static final String NO_INBAND_SECURITY = "NO_INBAND_SECURITY";
		public static final String TLS = "TLS";
	}
	public static class transparentEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class units1Enum {
		public static final String SEC = "SEC";
		public static final String MSEC = "MSEC";
		public static final String MIN = "MIN";
	}
	public static class dup_stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class units2Enum {
		public static final String SEC = "SEC";
		public static final String MSEC = "MSEC";
		public static final String MIN = "MIN";
	}
	public static class reverseEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class sipmethodEnum {
		public static final String OPTIONS = "OPTIONS";
		public static final String INVITE = "INVITE";
		public static final String REGISTER = "REGISTER";
	}
	public static class units4Enum {
		public static final String SEC = "SEC";
		public static final String MSEC = "MSEC";
		public static final String MIN = "MIN";
	}
	public static class actionEnum {
		public static final String NONE = "NONE";
		public static final String LOG = "LOG";
		public static final String DOWN = "DOWN";
	}
	public static class mssqlprotocolversionEnum {
		public static final String _70 = "70";
		public static final String _2000 = "2000";
		public static final String _2000SP1 = "2000SP1";
		public static final String _2005 = "2005";
		public static final String _2008 = "2008";
		public static final String _2008R2 = "2008R2";
	}
	public static class typeEnum {
		public static final String PING = "PING";
		public static final String TCP = "TCP";
		public static final String HTTP = "HTTP";
		public static final String TCP_ECV = "TCP-ECV";
		public static final String HTTP_ECV = "HTTP-ECV";
		public static final String UDP_ECV = "UDP-ECV";
		public static final String DNS = "DNS";
		public static final String FTP = "FTP";
		public static final String LDNS_PING = "LDNS-PING";
		public static final String LDNS_TCP = "LDNS-TCP";
		public static final String LDNS_DNS = "LDNS-DNS";
		public static final String RADIUS = "RADIUS";
		public static final String USER = "USER";
		public static final String HTTP_INLINE = "HTTP-INLINE";
		public static final String SIP_UDP = "SIP-UDP";
		public static final String LOAD = "LOAD";
		public static final String FTP_EXTENDED = "FTP-EXTENDED";
		public static final String SMTP = "SMTP";
		public static final String SNMP = "SNMP";
		public static final String NNTP = "NNTP";
		public static final String MYSQL = "MYSQL";
		public static final String MYSQL_ECV = "MYSQL-ECV";
		public static final String MSSQL_ECV = "MSSQL-ECV";
		public static final String LDAP = "LDAP";
		public static final String POP3 = "POP3";
		public static final String CITRIX_XML_SERVICE = "CITRIX-XML-SERVICE";
		public static final String CITRIX_WEB_INTERFACE = "CITRIX-WEB-INTERFACE";
		public static final String DNS_TCP = "DNS-TCP";
		public static final String RTSP = "RTSP";
		public static final String ARP = "ARP";
		public static final String CITRIX_AG = "CITRIX-AG";
		public static final String CITRIX_AAC_LOGINPAGE = "CITRIX-AAC-LOGINPAGE";
		public static final String CITRIX_AAC_LAS = "CITRIX-AAC-LAS";
		public static final String CITRIX_XD_DDC = "CITRIX-XD-DDC";
		public static final String ND6 = "ND6";
		public static final String CITRIX_WI_EXTENDED = "CITRIX-WI-EXTENDED";
		public static final String DIAMETER = "DIAMETER";
	}
	public static class snmpversionEnum {
		public static final String V1 = "V1";
		public static final String V2 = "V2";
	}
	public static class lrtmEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class querytypeEnum {
		public static final String Address = "Address";
		public static final String Zone = "Zone";
		public static final String AAAA = "AAAA";
	}
}
