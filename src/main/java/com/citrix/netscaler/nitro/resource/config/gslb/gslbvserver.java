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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbvserver_response extends base_response
{
	public gslbvserver[] gslbvserver;
}
/**
* Configuration for Global Server Load Balancing Virtual Server resource.
*/

public class gslbvserver extends base_resource
{
	private String name;
	private String servicetype;
	private String iptype;
	private String dnsrecordtype;
	private String lbmethod;
	private Long backupsessiontimeout;
	private String backuplbmethod;
	private String netmask;
	private Long v6netmasklen;
	private Long tolerance;
	private String persistencetype;
	private Long persistenceid;
	private String persistmask;
	private Long v6persistmasklen;
	private Long timeout;
	private String edr;
	private String mir;
	private String disableprimaryondown;
	private String dynamicweight;
	private String state;
	private String considereffectivestate;
	private String comment;
	private String somethod;
	private String sopersistence;
	private Long sopersistencetimeout;
	private Long sothreshold;
	private String appflowlog;
	private String backupvserver;
	private String servicename;
	private Long weight;
	private String domainname;
	private Long ttl;
	private String backupip;
	private String cookie_domain;
	private Long cookietimeout;
	private Long sitedomainttl;
	private String newname;

	//------- Read only Parameter ---------;

	private String curstate;
	private Integer status;
	private Integer lbrrreason;
	private String iscname;
	private String sitepersistence;
	private Long totalservices;
	private Long activeservices;
	private String statechangetimesec;
	private Long statechangetimemsec;
	private Long tickssincelaststatechange;
	private Long health;
	private Long __count;

	/**
	* <pre>
	* The virtual server name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The virtual server name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The service type of the virtual server.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, ANY, SIP_UDP, RADIUS, RDP, RTSP, MYSQL, MSSQL
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* The service type of the virtual server.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, ANY, SIP_UDP, RADIUS, RDP, RTSP, MYSQL, MSSQL
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* The IP type for this GSLB vserver.<br> Default value: NSGSLB_IPV4<br> Possible values = IPV4, IPV6
	* </pre>
	*/
	public void set_iptype(String iptype) throws Exception{
		this.iptype = iptype;
	}

	/**
	* <pre>
	* The IP type for this GSLB vserver.<br> Default value: NSGSLB_IPV4<br> Possible values = IPV4, IPV6
	* </pre>
	*/
	public String get_iptype() throws Exception {
		return this.iptype;
	}

	/**
	* <pre>
	* Record type for GSLB vserver.<br> Default value: NSGSLB_A<br> Possible values = A, AAAA, CNAME
	* </pre>
	*/
	public void set_dnsrecordtype(String dnsrecordtype) throws Exception{
		this.dnsrecordtype = dnsrecordtype;
	}

	/**
	* <pre>
	* Record type for GSLB vserver.<br> Default value: NSGSLB_A<br> Possible values = A, AAAA, CNAME
	* </pre>
	*/
	public String get_dnsrecordtype() throws Exception {
		return this.dnsrecordtype;
	}

	/**
	* <pre>
	* The load balancing method for the virtual server.The valid options for this parameter are: ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, SOURCEIPHASH, LEASTBANDWIDTH, LEASTPACKETS, STATICPROXIMITY, RTT , CUSTOMLOAD.<br> Default value: PEMGMT_LB_LEASTCONNS<br> Possible values = ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, SOURCEIPHASH, LEASTBANDWIDTH, LEASTPACKETS, STATICPROXIMITY, RTT, CUSTOMLOAD
	* </pre>
	*/
	public void set_lbmethod(String lbmethod) throws Exception{
		this.lbmethod = lbmethod;
	}

	/**
	* <pre>
	* The load balancing method for the virtual server.The valid options for this parameter are: ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, SOURCEIPHASH, LEASTBANDWIDTH, LEASTPACKETS, STATICPROXIMITY, RTT , CUSTOMLOAD.<br> Default value: PEMGMT_LB_LEASTCONNS<br> Possible values = ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, SOURCEIPHASH, LEASTBANDWIDTH, LEASTPACKETS, STATICPROXIMITY, RTT, CUSTOMLOAD
	* </pre>
	*/
	public String get_lbmethod() throws Exception {
		return this.lbmethod;
	}

	/**
	* <pre>
	* A non zero value enables the feature whose minimum value is 2 minutes. The feature can be disabled by setting the value to zero. The created session is in effect for a specific client per domain.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backupsessiontimeout(long backupsessiontimeout) throws Exception {
		this.backupsessiontimeout = new Long(backupsessiontimeout);
	}

	/**
	* <pre>
	* A non zero value enables the feature whose minimum value is 2 minutes. The feature can be disabled by setting the value to zero. The created session is in effect for a specific client per domain.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backupsessiontimeout(Long backupsessiontimeout) throws Exception{
		this.backupsessiontimeout = backupsessiontimeout;
	}

	/**
	* <pre>
	* A non zero value enables the feature whose minimum value is 2 minutes. The feature can be disabled by setting the value to zero. The created session is in effect for a specific client per domain.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_backupsessiontimeout() throws Exception {
		return this.backupsessiontimeout;
	}

	/**
	* <pre>
	* The load balancing method for the virtual server, in case the primary lb method fails on impossible to perform. The valid options for this parameter are: ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, SOURCEIPHASH, LEASTBANDWIDTH, LEASTPACKETS, STATICPROXIMITY, RTT , CUSTOMLOAD.<br> Possible values = ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, SOURCEIPHASH, LEASTBANDWIDTH, LEASTPACKETS, STATICPROXIMITY, RTT, CUSTOMLOAD
	* </pre>
	*/
	public void set_backuplbmethod(String backuplbmethod) throws Exception{
		this.backuplbmethod = backuplbmethod;
	}

	/**
	* <pre>
	* The load balancing method for the virtual server, in case the primary lb method fails on impossible to perform. The valid options for this parameter are: ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, SOURCEIPHASH, LEASTBANDWIDTH, LEASTPACKETS, STATICPROXIMITY, RTT , CUSTOMLOAD.<br> Possible values = ROUNDROBIN, LEASTCONNECTION, LEASTRESPONSETIME, SOURCEIPHASH, LEASTBANDWIDTH, LEASTPACKETS, STATICPROXIMITY, RTT, CUSTOMLOAD
	* </pre>
	*/
	public String get_backuplbmethod() throws Exception {
		return this.backuplbmethod;
	}

	/**
	* <pre>
	* The netmask to be used in the SOURCEIPHASH policy. The default is 255.255.255.255 .<br> Minimum length =  1
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The netmask to be used in the SOURCEIPHASH policy. The default is 255.255.255.255 .<br> Minimum length =  1
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
	* The Site selection tolerance is the maximum deviation (in milliseconds) in the RTT value, which the system can tolerate, while deciding the best site  for a domain. This value enables the system to implement the Round Robin method of GSLB between sites that have RTT values within this permissible limit. The tolerance value is required only if the LB method is RTT. The default tolerance value is 0.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_tolerance(long tolerance) throws Exception {
		this.tolerance = new Long(tolerance);
	}

	/**
	* <pre>
	* The Site selection tolerance is the maximum deviation (in milliseconds) in the RTT value, which the system can tolerate, while deciding the best site  for a domain. This value enables the system to implement the Round Robin method of GSLB between sites that have RTT values within this permissible limit. The tolerance value is required only if the LB method is RTT. The default tolerance value is 0.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_tolerance(Long tolerance) throws Exception{
		this.tolerance = tolerance;
	}

	/**
	* <pre>
	* The Site selection tolerance is the maximum deviation (in milliseconds) in the RTT value, which the system can tolerate, while deciding the best site  for a domain. This value enables the system to implement the Round Robin method of GSLB between sites that have RTT values within this permissible limit. The tolerance value is required only if the LB method is RTT. The default tolerance value is 0.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_tolerance() throws Exception {
		return this.tolerance;
	}

	/**
	* <pre>
	* The persistence type for the virtual server. This has 2 options: SOURCEIP and NONE .<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public void set_persistencetype(String persistencetype) throws Exception{
		this.persistencetype = persistencetype;
	}

	/**
	* <pre>
	* The persistence type for the virtual server. This has 2 options: SOURCEIP and NONE .<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public String get_persistencetype() throws Exception {
		return this.persistencetype;
	}

	/**
	* <pre>
	* The Persistence Id. This parameter is a positive integer which is used to identify the GSLB VIP on all sites. This is a required argument if SOURCEIP based persistency is enabled.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_persistenceid(long persistenceid) throws Exception {
		this.persistenceid = new Long(persistenceid);
	}

	/**
	* <pre>
	* The Persistence Id. This parameter is a positive integer which is used to identify the GSLB VIP on all sites. This is a required argument if SOURCEIP based persistency is enabled.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_persistenceid(Long persistenceid) throws Exception{
		this.persistenceid = persistenceid;
	}

	/**
	* <pre>
	* The Persistence Id. This parameter is a positive integer which is used to identify the GSLB VIP on all sites. This is a required argument if SOURCEIP based persistency is enabled.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_persistenceid() throws Exception {
		return this.persistenceid;
	}

	/**
	* <pre>
	* The netmask to be used while SOURCEIP based persistency is ENABLED.This is an optional argument.<br> Minimum length =  1
	* </pre>
	*/
	public void set_persistmask(String persistmask) throws Exception{
		this.persistmask = persistmask;
	}

	/**
	* <pre>
	* The netmask to be used while SOURCEIP based persistency is ENABLED.This is an optional argument.<br> Minimum length =  1
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
	* The idle time out in minutes for the persistence entries.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* The idle time out in minutes for the persistence entries.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* The idle time out in minutes for the persistence entries.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* Use this parameter to specify whether System will send empty DNS response when all the sites participating in GSLB are down.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_edr(String edr) throws Exception{
		this.edr = edr;
	}

	/**
	* <pre>
	* Use this parameter to specify whether System will send empty DNS response when all the sites participating in GSLB are down.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_edr() throws Exception {
		return this.edr;
	}

	/**
	* <pre>
	* Use this parameter to specify whether System can send Multiple IP addresses in the DNS response or not.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mir(String mir) throws Exception{
		this.mir = mir;
	}

	/**
	* <pre>
	* Use this parameter to specify whether System can send Multiple IP addresses in the DNS response or not.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mir() throws Exception {
		return this.mir;
	}

	/**
	* <pre>
	* When this feature is enabled we will continue to direct traffic to the backup chain even after the primary comes UP. Ideally one should use backup persistence if they want to stick to the same vserver in the chain.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_disableprimaryondown(String disableprimaryondown) throws Exception{
		this.disableprimaryondown = disableprimaryondown;
	}

	/**
	* <pre>
	* When this feature is enabled we will continue to direct traffic to the backup chain even after the primary comes UP. Ideally one should use backup persistence if they want to stick to the same vserver in the chain.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_disableprimaryondown() throws Exception {
		return this.disableprimaryondown;
	}

	/**
	* <pre>
	* Specifies whether we want to consider the svc count or the svc weights or ignore both.<br> Default value: DISABLED<br> Possible values = SERVICECOUNT, SERVICEWEIGHT, DISABLED
	* </pre>
	*/
	public void set_dynamicweight(String dynamicweight) throws Exception{
		this.dynamicweight = dynamicweight;
	}

	/**
	* <pre>
	* Specifies whether we want to consider the svc count or the svc weights or ignore both.<br> Default value: DISABLED<br> Possible values = SERVICECOUNT, SERVICEWEIGHT, DISABLED
	* </pre>
	*/
	public String get_dynamicweight() throws Exception {
		return this.dynamicweight;
	}

	/**
	* <pre>
	* State of the virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* State of the virtual server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Specifies which backup to consider when the primary state of all gslb services bound to the vip are down. By specifying NONE we will not consider the effective state of the gslb service to determine the state of the gslb vip. If STATE_ONLY is chosen we will consider the effective state obtained via MEP to determine the state of the gslb vip.<br> Default value: NS_GSLB_DONOT_CONSIDER_BKPS<br> Possible values = NONE, STATE_ONLY
	* </pre>
	*/
	public void set_considereffectivestate(String considereffectivestate) throws Exception{
		this.considereffectivestate = considereffectivestate;
	}

	/**
	* <pre>
	* Specifies which backup to consider when the primary state of all gslb services bound to the vip are down. By specifying NONE we will not consider the effective state of the gslb service to determine the state of the gslb vip. If STATE_ONLY is chosen we will consider the effective state obtained via MEP to determine the state of the gslb vip.<br> Default value: NS_GSLB_DONOT_CONSIDER_BKPS<br> Possible values = NONE, STATE_ONLY
	* </pre>
	*/
	public String get_considereffectivestate() throws Exception {
		return this.considereffectivestate;
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
	* In case of CONNECTION (or) DYNAMICCONNECTION type spillover method this value is treated as Maximum number of connections a lb vserver will handle before spillover takes place. In case of BANDWIDTH type spillover method this value is treated as the amount of incoming and outgoing traffic (in Kbps) a Vserver will handle before spillover takes place. In case of HEALTH type spillover method if the percentage of active services (by weight) becomes lower than this value, spillover takes place .<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_sothreshold(long sothreshold) throws Exception {
		this.sothreshold = new Long(sothreshold);
	}

	/**
	* <pre>
	* In case of CONNECTION (or) DYNAMICCONNECTION type spillover method this value is treated as Maximum number of connections a lb vserver will handle before spillover takes place. In case of BANDWIDTH type spillover method this value is treated as the amount of incoming and outgoing traffic (in Kbps) a Vserver will handle before spillover takes place. In case of HEALTH type spillover method if the percentage of active services (by weight) becomes lower than this value, spillover takes place .<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public void set_sothreshold(Long sothreshold) throws Exception{
		this.sothreshold = sothreshold;
	}

	/**
	* <pre>
	* In case of CONNECTION (or) DYNAMICCONNECTION type spillover method this value is treated as Maximum number of connections a lb vserver will handle before spillover takes place. In case of BANDWIDTH type spillover method this value is treated as the amount of incoming and outgoing traffic (in Kbps) a Vserver will handle before spillover takes place. In case of HEALTH type spillover method if the percentage of active services (by weight) becomes lower than this value, spillover takes place .<br> Minimum value =  1<br> Maximum value =  4294967287
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
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
	* Backup server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_backupvserver(String backupvserver) throws Exception{
		this.backupvserver = backupvserver;
	}

	/**
	* <pre>
	* Backup server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_backupvserver() throws Exception {
		return this.backupvserver;
	}

	/**
	* <pre>
	* The service for which the weight needs to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The service for which the weight needs to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The new weight for the given service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The new weight for the given service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The new weight for the given service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The name of the domain for which TTL and/or backupIP has to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domainname(String domainname) throws Exception{
		this.domainname = domainname;
	}

	/**
	* <pre>
	* The name of the domain for which TTL and/or backupIP has to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domainname() throws Exception {
		return this.domainname;
	}

	/**
	* <pre>
	* The TTL for the given domain.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* The TTL for the given domain.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* The TTL for the given domain.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* The backup IP for the given domain.<br> Minimum length =  1
	* </pre>
	*/
	public void set_backupip(String backupip) throws Exception{
		this.backupip = backupip;
	}

	/**
	* <pre>
	* The backup IP for the given domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_backupip() throws Exception {
		return this.backupip;
	}

	/**
	* <pre>
	* The cookie domain for the GSLB domain. This will be used when inserting the GSLB site cookie in the HTTP response. By default, cookie domain will not be inserted.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookie_domain(String cookie_domain) throws Exception{
		this.cookie_domain = cookie_domain;
	}

	/**
	* <pre>
	* The cookie domain for the GSLB domain. This will be used when inserting the GSLB site cookie in the HTTP response. By default, cookie domain will not be inserted.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookie_domain() throws Exception {
		return this.cookie_domain;
	}

	/**
	* <pre>
	* The timeout (in minutes) for the GSLB site cookie.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cookietimeout(long cookietimeout) throws Exception {
		this.cookietimeout = new Long(cookietimeout);
	}

	/**
	* <pre>
	* The timeout (in minutes) for the GSLB site cookie.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cookietimeout(Long cookietimeout) throws Exception{
		this.cookietimeout = cookietimeout;
	}

	/**
	* <pre>
	* The timeout (in minutes) for the GSLB site cookie.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_cookietimeout() throws Exception {
		return this.cookietimeout;
	}

	/**
	* <pre>
	* Modify the TTL of the internally created site domain.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sitedomainttl(long sitedomainttl) throws Exception {
		this.sitedomainttl = new Long(sitedomainttl);
	}

	/**
	* <pre>
	* Modify the TTL of the internally created site domain.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sitedomainttl(Long sitedomainttl) throws Exception{
		this.sitedomainttl = sitedomainttl;
	}

	/**
	* <pre>
	* Modify the TTL of the internally created site domain.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sitedomainttl() throws Exception {
		return this.sitedomainttl;
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
	* State of the gslb vserver.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Current status of the gslb vserver. During the initial phase if the configured lb method is not round robin , the vserver will adopt round robin to distribute traffic for a predefined number of requests.
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
	* is cname feature set on vserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_iscname() throws Exception {
		return this.iscname;
	}

	/**
	* <pre>
	* Type of Site Persistence set.<br> Possible values = ConnectionProxy, HTTPRedirect, NONE
	* </pre>
	*/
	public String get_sitepersistence() throws Exception {
		return this.sitepersistence;
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
	* Health of vserver based on percentage of weights of active svcs/all svcs. This does not consider administratively disabled svcs.
	* </pre>
	*/
	public Long get_health() throws Exception {
		return this.health;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbvserver_response result = (gslbvserver_response) service.get_payload_formatter().string_to_resource(gslbvserver_response.class, response);
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
		return result.gslbvserver;
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
	* Use this API to add gslbvserver.
	*/
	public static base_response add(nitro_service client, gslbvserver resource) throws Exception {
		gslbvserver addresource = new gslbvserver();
		addresource.name = resource.name;
		addresource.servicetype = resource.servicetype;
		addresource.iptype = resource.iptype;
		addresource.dnsrecordtype = resource.dnsrecordtype;
		addresource.lbmethod = resource.lbmethod;
		addresource.backupsessiontimeout = resource.backupsessiontimeout;
		addresource.backuplbmethod = resource.backuplbmethod;
		addresource.netmask = resource.netmask;
		addresource.v6netmasklen = resource.v6netmasklen;
		addresource.tolerance = resource.tolerance;
		addresource.persistencetype = resource.persistencetype;
		addresource.persistenceid = resource.persistenceid;
		addresource.persistmask = resource.persistmask;
		addresource.v6persistmasklen = resource.v6persistmasklen;
		addresource.timeout = resource.timeout;
		addresource.edr = resource.edr;
		addresource.mir = resource.mir;
		addresource.disableprimaryondown = resource.disableprimaryondown;
		addresource.dynamicweight = resource.dynamicweight;
		addresource.state = resource.state;
		addresource.considereffectivestate = resource.considereffectivestate;
		addresource.comment = resource.comment;
		addresource.somethod = resource.somethod;
		addresource.sopersistence = resource.sopersistence;
		addresource.sopersistencetimeout = resource.sopersistencetimeout;
		addresource.sothreshold = resource.sothreshold;
		addresource.appflowlog = resource.appflowlog;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add gslbvserver resources.
	*/
	public static base_responses add(nitro_service client, gslbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver addresources[] = new gslbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new gslbvserver();
				addresources[i].name = resources[i].name;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].iptype = resources[i].iptype;
				addresources[i].dnsrecordtype = resources[i].dnsrecordtype;
				addresources[i].lbmethod = resources[i].lbmethod;
				addresources[i].backupsessiontimeout = resources[i].backupsessiontimeout;
				addresources[i].backuplbmethod = resources[i].backuplbmethod;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].v6netmasklen = resources[i].v6netmasklen;
				addresources[i].tolerance = resources[i].tolerance;
				addresources[i].persistencetype = resources[i].persistencetype;
				addresources[i].persistenceid = resources[i].persistenceid;
				addresources[i].persistmask = resources[i].persistmask;
				addresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				addresources[i].timeout = resources[i].timeout;
				addresources[i].edr = resources[i].edr;
				addresources[i].mir = resources[i].mir;
				addresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				addresources[i].dynamicweight = resources[i].dynamicweight;
				addresources[i].state = resources[i].state;
				addresources[i].considereffectivestate = resources[i].considereffectivestate;
				addresources[i].comment = resources[i].comment;
				addresources[i].somethod = resources[i].somethod;
				addresources[i].sopersistence = resources[i].sopersistence;
				addresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				addresources[i].sothreshold = resources[i].sothreshold;
				addresources[i].appflowlog = resources[i].appflowlog;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete gslbvserver of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		gslbvserver deleteresource = new gslbvserver();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete gslbvserver.
	*/
	public static base_response delete(nitro_service client, gslbvserver resource) throws Exception {
		gslbvserver deleteresource = new gslbvserver();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete gslbvserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			gslbvserver deleteresources[] = new gslbvserver[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new gslbvserver();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete gslbvserver resources.
	*/
	public static base_responses delete(nitro_service client, gslbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver deleteresources[] = new gslbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new gslbvserver();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update gslbvserver.
	*/
	public static base_response update(nitro_service client, gslbvserver resource) throws Exception {
		gslbvserver updateresource = new gslbvserver();
		updateresource.name = resource.name;
		updateresource.iptype = resource.iptype;
		updateresource.dnsrecordtype = resource.dnsrecordtype;
		updateresource.backupvserver = resource.backupvserver;
		updateresource.backupsessiontimeout = resource.backupsessiontimeout;
		updateresource.lbmethod = resource.lbmethod;
		updateresource.backuplbmethod = resource.backuplbmethod;
		updateresource.netmask = resource.netmask;
		updateresource.v6netmasklen = resource.v6netmasklen;
		updateresource.tolerance = resource.tolerance;
		updateresource.persistencetype = resource.persistencetype;
		updateresource.persistenceid = resource.persistenceid;
		updateresource.persistmask = resource.persistmask;
		updateresource.v6persistmasklen = resource.v6persistmasklen;
		updateresource.timeout = resource.timeout;
		updateresource.edr = resource.edr;
		updateresource.mir = resource.mir;
		updateresource.disableprimaryondown = resource.disableprimaryondown;
		updateresource.dynamicweight = resource.dynamicweight;
		updateresource.considereffectivestate = resource.considereffectivestate;
		updateresource.somethod = resource.somethod;
		updateresource.sopersistence = resource.sopersistence;
		updateresource.sopersistencetimeout = resource.sopersistencetimeout;
		updateresource.sothreshold = resource.sothreshold;
		updateresource.servicename = resource.servicename;
		updateresource.weight = resource.weight;
		updateresource.domainname = resource.domainname;
		updateresource.ttl = resource.ttl;
		updateresource.backupip = resource.backupip;
		updateresource.cookie_domain = resource.cookie_domain;
		updateresource.cookietimeout = resource.cookietimeout;
		updateresource.sitedomainttl = resource.sitedomainttl;
		updateresource.comment = resource.comment;
		updateresource.appflowlog = resource.appflowlog;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update gslbvserver resources.
	*/
	public static base_responses update(nitro_service client, gslbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver updateresources[] = new gslbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new gslbvserver();
				updateresources[i].name = resources[i].name;
				updateresources[i].iptype = resources[i].iptype;
				updateresources[i].dnsrecordtype = resources[i].dnsrecordtype;
				updateresources[i].backupvserver = resources[i].backupvserver;
				updateresources[i].backupsessiontimeout = resources[i].backupsessiontimeout;
				updateresources[i].lbmethod = resources[i].lbmethod;
				updateresources[i].backuplbmethod = resources[i].backuplbmethod;
				updateresources[i].netmask = resources[i].netmask;
				updateresources[i].v6netmasklen = resources[i].v6netmasklen;
				updateresources[i].tolerance = resources[i].tolerance;
				updateresources[i].persistencetype = resources[i].persistencetype;
				updateresources[i].persistenceid = resources[i].persistenceid;
				updateresources[i].persistmask = resources[i].persistmask;
				updateresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				updateresources[i].timeout = resources[i].timeout;
				updateresources[i].edr = resources[i].edr;
				updateresources[i].mir = resources[i].mir;
				updateresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				updateresources[i].dynamicweight = resources[i].dynamicweight;
				updateresources[i].considereffectivestate = resources[i].considereffectivestate;
				updateresources[i].somethod = resources[i].somethod;
				updateresources[i].sopersistence = resources[i].sopersistence;
				updateresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				updateresources[i].sothreshold = resources[i].sothreshold;
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].domainname = resources[i].domainname;
				updateresources[i].ttl = resources[i].ttl;
				updateresources[i].backupip = resources[i].backupip;
				updateresources[i].cookie_domain = resources[i].cookie_domain;
				updateresources[i].cookietimeout = resources[i].cookietimeout;
				updateresources[i].sitedomainttl = resources[i].sitedomainttl;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].appflowlog = resources[i].appflowlog;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of gslbvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		gslbvserver unsetresource = new gslbvserver();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of gslbvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, gslbvserver resource, String[] args) throws Exception{
		gslbvserver unsetresource = new gslbvserver();
		unsetresource.name = resource.name;
		unsetresource.backupvserver = resource.backupvserver;
		unsetresource.sothreshold = resource.sothreshold;
		unsetresource.iptype = resource.iptype;
		unsetresource.dnsrecordtype = resource.dnsrecordtype;
		unsetresource.backupsessiontimeout = resource.backupsessiontimeout;
		unsetresource.lbmethod = resource.lbmethod;
		unsetresource.backuplbmethod = resource.backuplbmethod;
		unsetresource.netmask = resource.netmask;
		unsetresource.v6netmasklen = resource.v6netmasklen;
		unsetresource.tolerance = resource.tolerance;
		unsetresource.persistencetype = resource.persistencetype;
		unsetresource.persistenceid = resource.persistenceid;
		unsetresource.persistmask = resource.persistmask;
		unsetresource.v6persistmasklen = resource.v6persistmasklen;
		unsetresource.timeout = resource.timeout;
		unsetresource.edr = resource.edr;
		unsetresource.mir = resource.mir;
		unsetresource.disableprimaryondown = resource.disableprimaryondown;
		unsetresource.dynamicweight = resource.dynamicweight;
		unsetresource.considereffectivestate = resource.considereffectivestate;
		unsetresource.somethod = resource.somethod;
		unsetresource.sopersistence = resource.sopersistence;
		unsetresource.sopersistencetimeout = resource.sopersistencetimeout;
		unsetresource.servicename = resource.servicename;
		unsetresource.weight = resource.weight;
		unsetresource.comment = resource.comment;
		unsetresource.appflowlog = resource.appflowlog;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of gslbvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			gslbvserver unsetresources[] = new gslbvserver[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new gslbvserver();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of gslbvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, gslbvserver resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver unsetresources[] = new gslbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new gslbvserver();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].backupvserver = resources[i].backupvserver;
				unsetresources[i].sothreshold = resources[i].sothreshold;
				unsetresources[i].iptype = resources[i].iptype;
				unsetresources[i].dnsrecordtype = resources[i].dnsrecordtype;
				unsetresources[i].backupsessiontimeout = resources[i].backupsessiontimeout;
				unsetresources[i].lbmethod = resources[i].lbmethod;
				unsetresources[i].backuplbmethod = resources[i].backuplbmethod;
				unsetresources[i].netmask = resources[i].netmask;
				unsetresources[i].v6netmasklen = resources[i].v6netmasklen;
				unsetresources[i].tolerance = resources[i].tolerance;
				unsetresources[i].persistencetype = resources[i].persistencetype;
				unsetresources[i].persistenceid = resources[i].persistenceid;
				unsetresources[i].persistmask = resources[i].persistmask;
				unsetresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				unsetresources[i].timeout = resources[i].timeout;
				unsetresources[i].edr = resources[i].edr;
				unsetresources[i].mir = resources[i].mir;
				unsetresources[i].disableprimaryondown = resources[i].disableprimaryondown;
				unsetresources[i].dynamicweight = resources[i].dynamicweight;
				unsetresources[i].considereffectivestate = resources[i].considereffectivestate;
				unsetresources[i].somethod = resources[i].somethod;
				unsetresources[i].sopersistence = resources[i].sopersistence;
				unsetresources[i].sopersistencetimeout = resources[i].sopersistencetimeout;
				unsetresources[i].servicename = resources[i].servicename;
				unsetresources[i].weight = resources[i].weight;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].appflowlog = resources[i].appflowlog;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable gslbvserver of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		gslbvserver enableresource = new gslbvserver();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable gslbvserver.
	*/
	public static base_response enable(nitro_service client, gslbvserver resource) throws Exception {
		gslbvserver enableresource = new gslbvserver();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable gslbvserver resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			gslbvserver enableresources[] = new gslbvserver[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new gslbvserver();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable gslbvserver resources.
	*/
	public static base_responses enable(nitro_service client, gslbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver enableresources[] = new gslbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new gslbvserver();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable gslbvserver of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		gslbvserver disableresource = new gslbvserver();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable gslbvserver.
	*/
	public static base_response disable(nitro_service client, gslbvserver resource) throws Exception {
		gslbvserver disableresource = new gslbvserver();
		disableresource.name = resource.name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable gslbvserver resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			gslbvserver disableresources[] = new gslbvserver[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new gslbvserver();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable gslbvserver resources.
	*/
	public static base_responses disable(nitro_service client, gslbvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver disableresources[] = new gslbvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new gslbvserver();
				disableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a gslbvserver resource.
	*/
	public static base_response rename(nitro_service client, gslbvserver resource, String new_name) throws Exception {
		gslbvserver renameresource = new gslbvserver();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a gslbvserver resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		gslbvserver renameresource = new gslbvserver();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the gslbvserver resources that are configured on netscaler.
	*/
	public static gslbvserver[] get(nitro_service service) throws Exception{
		gslbvserver obj = new gslbvserver();
		gslbvserver[] response = (gslbvserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the gslbvserver resources that are configured on netscaler.
	*/
	public static gslbvserver[] get(nitro_service service, options option) throws Exception{
		gslbvserver obj = new gslbvserver();
		gslbvserver[] response = (gslbvserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch gslbvserver resource of given name .
	*/
	public static gslbvserver get(nitro_service service, String name) throws Exception{
		gslbvserver obj = new gslbvserver();
		obj.set_name(name);
		gslbvserver response = (gslbvserver) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch gslbvserver resources of given names .
	*/
	public static gslbvserver[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			gslbvserver response[] = new gslbvserver[name.length];
			gslbvserver obj[] = new gslbvserver[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new gslbvserver();
				obj[i].set_name(name[i]);
				response[i] = (gslbvserver) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of gslbvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static gslbvserver[] get_filtered(nitro_service service, String filter) throws Exception{
		gslbvserver obj = new gslbvserver();
		options option = new options();
		option.set_filter(filter);
		gslbvserver[] response = (gslbvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static gslbvserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		gslbvserver obj = new gslbvserver();
		options option = new options();
		option.set_filter(filter);
		gslbvserver[] response = (gslbvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the gslbvserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		gslbvserver obj = new gslbvserver();
		options option = new options();
		option.set_count(true);
		gslbvserver[] response = (gslbvserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of gslbvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		gslbvserver obj = new gslbvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbvserver[] response = (gslbvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		gslbvserver obj = new gslbvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbvserver[] response = (gslbvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class backuplbmethodEnum {
		public static final String ROUNDROBIN = "ROUNDROBIN";
		public static final String LEASTCONNECTION = "LEASTCONNECTION";
		public static final String LEASTRESPONSETIME = "LEASTRESPONSETIME";
		public static final String SOURCEIPHASH = "SOURCEIPHASH";
		public static final String LEASTBANDWIDTH = "LEASTBANDWIDTH";
		public static final String LEASTPACKETS = "LEASTPACKETS";
		public static final String STATICPROXIMITY = "STATICPROXIMITY";
		public static final String RTT = "RTT";
		public static final String CUSTOMLOAD = "CUSTOMLOAD";
	}
	public static class iptypeEnum {
		public static final String IPV4 = "IPV4";
		public static final String IPV6 = "IPV6";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dnsrecordtypeEnum {
		public static final String A = "A";
		public static final String AAAA = "AAAA";
		public static final String CNAME = "CNAME";
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
		public static final String ANY = "ANY";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String RTSP = "RTSP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
	}
	public static class disableprimaryondownEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mirEnum {
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
	public static class edrEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class lbmethodEnum {
		public static final String ROUNDROBIN = "ROUNDROBIN";
		public static final String LEASTCONNECTION = "LEASTCONNECTION";
		public static final String LEASTRESPONSETIME = "LEASTRESPONSETIME";
		public static final String SOURCEIPHASH = "SOURCEIPHASH";
		public static final String LEASTBANDWIDTH = "LEASTBANDWIDTH";
		public static final String LEASTPACKETS = "LEASTPACKETS";
		public static final String STATICPROXIMITY = "STATICPROXIMITY";
		public static final String RTT = "RTT";
		public static final String CUSTOMLOAD = "CUSTOMLOAD";
	}
	public static class sitepersistenceEnum {
		public static final String ConnectionProxy = "ConnectionProxy";
		public static final String HTTPRedirect = "HTTPRedirect";
		public static final String NONE = "NONE";
	}
	public static class considereffectivestateEnum {
		public static final String NONE = "NONE";
		public static final String STATE_ONLY = "STATE_ONLY";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class iscnameEnum {
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
	}
	public static class persistencetypeEnum {
		public static final String SOURCEIP = "SOURCEIP";
		public static final String NONE = "NONE";
	}
	public static class dynamicweightEnum {
		public static final String SERVICECOUNT = "SERVICECOUNT";
		public static final String SERVICEWEIGHT = "SERVICEWEIGHT";
		public static final String DISABLED = "DISABLED";
	}
}
