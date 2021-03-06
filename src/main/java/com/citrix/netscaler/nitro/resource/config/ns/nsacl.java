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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsacl_response extends base_response
{
	public nsacl[] nsacl;
}
/**
* Configuration for ACL entry resource.
*/

public class nsacl extends base_resource
{
	private String aclname;
	private String aclaction;
	private Long td;
	private Boolean srcip;
	private String srcipop;
	private String srcipval;
	private Boolean srcport;
	private String srcportop;
	private String srcportval;
	private Boolean destip;
	private String destipop;
	private String destipval;
	private Boolean destport;
	private String destportop;
	private String destportval;
	private Long ttl;
	private String srcmac;
	private String protocol;
	private Long protocolnumber;
	private Long vlan;
	private String Interface;
	private Boolean established;
	private Long icmptype;
	private Long icmpcode;
	private Long priority;
	private String state;
	private String logstate;
	private Long ratelimit;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private String kernelstate;
	private Long __count;

	/**
	* <pre>
	* Name for the extended ACL rule. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the extended ACL rule is created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_aclname(String aclname) throws Exception{
		this.aclname = aclname;
	}

	/**
	* <pre>
	* Name for the extended ACL rule. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the extended ACL rule is created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_aclname() throws Exception {
		return this.aclname;
	}

	/**
	* <pre>
	* Action to perform on incoming IPv4 packets that match the extended ACL rule. 
Available settings function as follows:
* ALLOW - The NetScaler appliance processes the packet.
* BRIDGE - The NetScaler appliance bridges the packet to the destination without processing it.
* DENY - The NetScaler appliance drops the packet.<br> Possible values = BRIDGE, DENY, ALLOW
	* </pre>
	*/
	public void set_aclaction(String aclaction) throws Exception{
		this.aclaction = aclaction;
	}

	/**
	* <pre>
	* Action to perform on incoming IPv4 packets that match the extended ACL rule. 
Available settings function as follows:
* ALLOW - The NetScaler appliance processes the packet.
* BRIDGE - The NetScaler appliance bridges the packet to the destination without processing it.
* DENY - The NetScaler appliance drops the packet.<br> Possible values = BRIDGE, DENY, ALLOW
	* </pre>
	*/
	public String get_aclaction() throws Exception {
		return this.aclaction;
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
	* IP address or range of IP addresses to match against the source IP address of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public void set_srcip(boolean srcip) throws Exception {
		this.srcip = new Boolean(srcip);
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the source IP address of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public void set_srcip(Boolean srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the source IP address of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public Boolean get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* Either the equals (=) or does not equal (!=) logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public void set_srcipop(String srcipop) throws Exception{
		this.srcipop = srcipop;
	}

	/**
	* <pre>
	* Either the equals (=) or does not equal (!=) logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public String get_srcipop() throws Exception {
		return this.srcipop;
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the source IP address of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public void set_srcipval(String srcipval) throws Exception{
		this.srcipval = srcipval;
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the source IP address of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public String get_srcipval() throws Exception {
		return this.srcipval;
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the source port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90].
	* </pre>
	*/
	public void set_srcport(boolean srcport) throws Exception {
		this.srcport = new Boolean(srcport);
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the source port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90].
	* </pre>
	*/
	public void set_srcport(Boolean srcport) throws Exception{
		this.srcport = srcport;
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the source port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90].
	* </pre>
	*/
	public Boolean get_srcport() throws Exception {
		return this.srcport;
	}

	/**
	* <pre>
	* Either the equals (=) or does not equal (!=) logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public void set_srcportop(String srcportop) throws Exception{
		this.srcportop = srcportop;
	}

	/**
	* <pre>
	* Either the equals (=) or does not equal (!=) logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public String get_srcportop() throws Exception {
		return this.srcportop;
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the source port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90].<br> Maximum length =  65535
	* </pre>
	*/
	public void set_srcportval(String srcportval) throws Exception{
		this.srcportval = srcportval;
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the source port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90].<br> Maximum length =  65535
	* </pre>
	*/
	public String get_srcportval() throws Exception {
		return this.srcportval;
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the destination IP address of an incoming IPv4 packet.  In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public void set_destip(boolean destip) throws Exception {
		this.destip = new Boolean(destip);
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the destination IP address of an incoming IPv4 packet.  In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public void set_destip(Boolean destip) throws Exception{
		this.destip = destip;
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the destination IP address of an incoming IPv4 packet.  In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public Boolean get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* Either the equals (=) or does not equal (!=) logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public void set_destipop(String destipop) throws Exception{
		this.destipop = destipop;
	}

	/**
	* <pre>
	* Either the equals (=) or does not equal (!=) logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public String get_destipop() throws Exception {
		return this.destipop;
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the destination IP address of an incoming IPv4 packet.  In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public void set_destipval(String destipval) throws Exception{
		this.destipval = destipval;
	}

	/**
	* <pre>
	* IP address or range of IP addresses to match against the destination IP address of an incoming IPv4 packet.  In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [10.102.29.30-10.102.29.189].
	* </pre>
	*/
	public String get_destipval() throws Exception {
		return this.destipval;
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the destination port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90]. 

Note: The destination port can be specified only for TCP and UDP protocols.
	* </pre>
	*/
	public void set_destport(boolean destport) throws Exception {
		this.destport = new Boolean(destport);
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the destination port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90]. 

Note: The destination port can be specified only for TCP and UDP protocols.
	* </pre>
	*/
	public void set_destport(Boolean destport) throws Exception{
		this.destport = destport;
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the destination port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90]. 

Note: The destination port can be specified only for TCP and UDP protocols.
	* </pre>
	*/
	public Boolean get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* Either the equals (=) or does not equal (!=) logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public void set_destportop(String destportop) throws Exception{
		this.destportop = destportop;
	}

	/**
	* <pre>
	* Either the equals (=) or does not equal (!=) logical operator.<br> Possible values = =, !=, EQ, NEQ
	* </pre>
	*/
	public String get_destportop() throws Exception {
		return this.destportop;
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the destination port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90]. 

Note: The destination port can be specified only for TCP and UDP protocols.<br> Maximum length =  65535
	* </pre>
	*/
	public void set_destportval(String destportval) throws Exception{
		this.destportval = destportval;
	}

	/**
	* <pre>
	* Port number or range of port numbers to match against the destination port number of an incoming IPv4 packet. In the command line interface, separate the range with a hyphen and enclose within brackets. For example: [40-90]. 

Note: The destination port can be specified only for TCP and UDP protocols.<br> Maximum length =  65535
	* </pre>
	*/
	public String get_destportval() throws Exception {
		return this.destportval;
	}

	/**
	* <pre>
	* Number of seconds, in multiples of four, after which the extended ACL rule expires. If you do not want the extended ACL rule to expire, do not specify a TTL value.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Number of seconds, in multiples of four, after which the extended ACL rule expires. If you do not want the extended ACL rule to expire, do not specify a TTL value.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Number of seconds, in multiples of four, after which the extended ACL rule expires. If you do not want the extended ACL rule to expire, do not specify a TTL value.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* MAC address to match against the source MAC address of an incoming IPv4 packet.
	* </pre>
	*/
	public void set_srcmac(String srcmac) throws Exception{
		this.srcmac = srcmac;
	}

	/**
	* <pre>
	* MAC address to match against the source MAC address of an incoming IPv4 packet.
	* </pre>
	*/
	public String get_srcmac() throws Exception {
		return this.srcmac;
	}

	/**
	* <pre>
	* Protocol to match against the protocol of an incoming IPv4 packet.<br> Possible values = ICMP, IGMP, TCP, EGP, IGP, ARGUS, UDP, RDP, RSVP, EIGRP, L2TP, ISIS
	* </pre>
	*/
	public void set_protocol(String protocol) throws Exception{
		this.protocol = protocol;
	}

	/**
	* <pre>
	* Protocol to match against the protocol of an incoming IPv4 packet.<br> Possible values = ICMP, IGMP, TCP, EGP, IGP, ARGUS, UDP, RDP, RSVP, EIGRP, L2TP, ISIS
	* </pre>
	*/
	public String get_protocol() throws Exception {
		return this.protocol;
	}

	/**
	* <pre>
	* Protocol to match against the protocol of an incoming IPv4 packet.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_protocolnumber(long protocolnumber) throws Exception {
		this.protocolnumber = new Long(protocolnumber);
	}

	/**
	* <pre>
	* Protocol to match against the protocol of an incoming IPv4 packet.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_protocolnumber(Long protocolnumber) throws Exception{
		this.protocolnumber = protocolnumber;
	}

	/**
	* <pre>
	* Protocol to match against the protocol of an incoming IPv4 packet.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_protocolnumber() throws Exception {
		return this.protocolnumber;
	}

	/**
	* <pre>
	* ID of the VLAN. The NetScaler appliance applies the ACL rule only to the incoming packets of the specified VLAN. If you do not specify a VLAN ID, the appliance applies the ACL rule to the incoming packets on all VLANs.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(long vlan) throws Exception {
		this.vlan = new Long(vlan);
	}

	/**
	* <pre>
	* ID of the VLAN. The NetScaler appliance applies the ACL rule only to the incoming packets of the specified VLAN. If you do not specify a VLAN ID, the appliance applies the ACL rule to the incoming packets on all VLANs.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_vlan(Long vlan) throws Exception{
		this.vlan = vlan;
	}

	/**
	* <pre>
	* ID of the VLAN. The NetScaler appliance applies the ACL rule only to the incoming packets of the specified VLAN. If you do not specify a VLAN ID, the appliance applies the ACL rule to the incoming packets on all VLANs.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* ID of an interface. The NetScaler appliance applies the ACL rule only to the incoming packets from the specified interface. If you do not specify any value, the appliance applies the ACL rule to the incoming packets of all interfaces.
	* </pre>
	*/
	public void set_Interface(String Interface) throws Exception{
		this.Interface = Interface;
	}

	/**
	* <pre>
	* ID of an interface. The NetScaler appliance applies the ACL rule only to the incoming packets from the specified interface. If you do not specify any value, the appliance applies the ACL rule to the incoming packets of all interfaces.
	* </pre>
	*/
	public String get_Interface() throws Exception {
		return this.Interface;
	}

	/**
	* <pre>
	* Allow only incoming TCP packets that have the ACK or RST bit set, if the action set for the ACL rule is ALLOW and these packets match the other conditions in the ACL rule.
	* </pre>
	*/
	public void set_established(boolean established) throws Exception {
		this.established = new Boolean(established);
	}

	/**
	* <pre>
	* Allow only incoming TCP packets that have the ACK or RST bit set, if the action set for the ACL rule is ALLOW and these packets match the other conditions in the ACL rule.
	* </pre>
	*/
	public void set_established(Boolean established) throws Exception{
		this.established = established;
	}

	/**
	* <pre>
	* Allow only incoming TCP packets that have the ACK or RST bit set, if the action set for the ACL rule is ALLOW and these packets match the other conditions in the ACL rule.
	* </pre>
	*/
	public Boolean get_established() throws Exception {
		return this.established;
	}

	/**
	* <pre>
	* ICMP Message type to match against the message type of an incoming ICMP packet. For example, to block DESTINATION UNREACHABLE messages, you must specify 3 as the ICMP type. 

Note: This parameter can be specified only for the ICMP protocol.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmptype(long icmptype) throws Exception {
		this.icmptype = new Long(icmptype);
	}

	/**
	* <pre>
	* ICMP Message type to match against the message type of an incoming ICMP packet. For example, to block DESTINATION UNREACHABLE messages, you must specify 3 as the ICMP type. 

Note: This parameter can be specified only for the ICMP protocol.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmptype(Long icmptype) throws Exception{
		this.icmptype = icmptype;
	}

	/**
	* <pre>
	* ICMP Message type to match against the message type of an incoming ICMP packet. For example, to block DESTINATION UNREACHABLE messages, you must specify 3 as the ICMP type. 

Note: This parameter can be specified only for the ICMP protocol.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public Long get_icmptype() throws Exception {
		return this.icmptype;
	}

	/**
	* <pre>
	* Code of a particular ICMP message type to match against the ICMP code of an incoming ICMP packet.  For example, to block DESTINATION HOST UNREACHABLE messages, specify 3 as the ICMP type and 1 as the ICMP code. 

If you set this parameter, you must set the ICMP Type parameter.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmpcode(long icmpcode) throws Exception {
		this.icmpcode = new Long(icmpcode);
	}

	/**
	* <pre>
	* Code of a particular ICMP message type to match against the ICMP code of an incoming ICMP packet.  For example, to block DESTINATION HOST UNREACHABLE messages, specify 3 as the ICMP type and 1 as the ICMP code. 

If you set this parameter, you must set the ICMP Type parameter.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public void set_icmpcode(Long icmpcode) throws Exception{
		this.icmpcode = icmpcode;
	}

	/**
	* <pre>
	* Code of a particular ICMP message type to match against the ICMP code of an incoming ICMP packet.  For example, to block DESTINATION HOST UNREACHABLE messages, specify 3 as the ICMP type and 1 as the ICMP code. 

If you set this parameter, you must set the ICMP Type parameter.<br> Minimum value =  0<br> Maximum value =  65536
	* </pre>
	*/
	public Long get_icmpcode() throws Exception {
		return this.icmpcode;
	}

	/**
	* <pre>
	* Priority for the extended ACL rule that determines the order in which it is evaluated relative to the other extended ACL rules. If you do not specify priorities while creating extended ACL rules, the ACL rules are evaluated in the order in which they are created.<br> Minimum value =  1<br> Maximum value =  100000
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority for the extended ACL rule that determines the order in which it is evaluated relative to the other extended ACL rules. If you do not specify priorities while creating extended ACL rules, the ACL rules are evaluated in the order in which they are created.<br> Minimum value =  1<br> Maximum value =  100000
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority for the extended ACL rule that determines the order in which it is evaluated relative to the other extended ACL rules. If you do not specify priorities while creating extended ACL rules, the ACL rules are evaluated in the order in which they are created.<br> Minimum value =  1<br> Maximum value =  100000
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Enable or disable the extended ACL rule. After you apply the extended ACL rules, the NetScaler appliance compares incoming packets against the enabled extended ACL rules.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enable or disable the extended ACL rule. After you apply the extended ACL rules, the NetScaler appliance compares incoming packets against the enabled extended ACL rules.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Enable or disable logging of events related to the extended ACL rule. The log messages are stored in the configured syslog or auditlog server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_logstate(String logstate) throws Exception{
		this.logstate = logstate;
	}

	/**
	* <pre>
	* Enable or disable logging of events related to the extended ACL rule. The log messages are stored in the configured syslog or auditlog server.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_logstate() throws Exception {
		return this.logstate;
	}

	/**
	* <pre>
	* Maximum number of log messages to be generated per second. If you set this parameter, you must enable the Log State parameter.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  10000
	* </pre>
	*/
	public void set_ratelimit(long ratelimit) throws Exception {
		this.ratelimit = new Long(ratelimit);
	}

	/**
	* <pre>
	* Maximum number of log messages to be generated per second. If you set this parameter, you must enable the Log State parameter.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  10000
	* </pre>
	*/
	public void set_ratelimit(Long ratelimit) throws Exception{
		this.ratelimit = ratelimit;
	}

	/**
	* <pre>
	* Maximum number of log messages to be generated per second. If you set this parameter, you must enable the Log State parameter.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  10000
	* </pre>
	*/
	public Long get_ratelimit() throws Exception {
		return this.ratelimit;
	}

	/**
	* <pre>
	* New name for the extended ACL rule. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the extended ACL rule. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The hits of this ACL.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The commit status of the ACL.<br> Default value: NOTAPPLIED<br> Possible values = APPLIED, NOTAPPLIED, RE-APPLY, SFAPPLIED, SFNOTAPPLIED, SFAPPLIED61, SFNOTAPPLIED61
	* </pre>
	*/
	public String get_kernelstate() throws Exception {
		return this.kernelstate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsacl_response result = (nsacl_response) service.get_payload_formatter().string_to_resource(nsacl_response.class, response);
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
		return result.nsacl;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.aclname;
	}

	/**
	* Use this API to add nsacl.
	*/
	public static base_response add(nitro_service client, nsacl resource) throws Exception {
		nsacl addresource = new nsacl();
		addresource.aclname = resource.aclname;
		addresource.aclaction = resource.aclaction;
		addresource.td = resource.td;
		addresource.srcip = resource.srcip;
		addresource.srcipop = resource.srcipop;
		addresource.srcipval = resource.srcipval;
		addresource.srcport = resource.srcport;
		addresource.srcportop = resource.srcportop;
		addresource.srcportval = resource.srcportval;
		addresource.destip = resource.destip;
		addresource.destipop = resource.destipop;
		addresource.destipval = resource.destipval;
		addresource.destport = resource.destport;
		addresource.destportop = resource.destportop;
		addresource.destportval = resource.destportval;
		addresource.ttl = resource.ttl;
		addresource.srcmac = resource.srcmac;
		addresource.protocol = resource.protocol;
		addresource.protocolnumber = resource.protocolnumber;
		addresource.vlan = resource.vlan;
		addresource.Interface = resource.Interface;
		addresource.established = resource.established;
		addresource.icmptype = resource.icmptype;
		addresource.icmpcode = resource.icmpcode;
		addresource.priority = resource.priority;
		addresource.state = resource.state;
		addresource.logstate = resource.logstate;
		addresource.ratelimit = resource.ratelimit;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nsacl resources.
	*/
	public static base_responses add(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl addresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nsacl();
				addresources[i].aclname = resources[i].aclname;
				addresources[i].aclaction = resources[i].aclaction;
				addresources[i].td = resources[i].td;
				addresources[i].srcip = resources[i].srcip;
				addresources[i].srcipop = resources[i].srcipop;
				addresources[i].srcipval = resources[i].srcipval;
				addresources[i].srcport = resources[i].srcport;
				addresources[i].srcportop = resources[i].srcportop;
				addresources[i].srcportval = resources[i].srcportval;
				addresources[i].destip = resources[i].destip;
				addresources[i].destipop = resources[i].destipop;
				addresources[i].destipval = resources[i].destipval;
				addresources[i].destport = resources[i].destport;
				addresources[i].destportop = resources[i].destportop;
				addresources[i].destportval = resources[i].destportval;
				addresources[i].ttl = resources[i].ttl;
				addresources[i].srcmac = resources[i].srcmac;
				addresources[i].protocol = resources[i].protocol;
				addresources[i].protocolnumber = resources[i].protocolnumber;
				addresources[i].vlan = resources[i].vlan;
				addresources[i].Interface = resources[i].Interface;
				addresources[i].established = resources[i].established;
				addresources[i].icmptype = resources[i].icmptype;
				addresources[i].icmpcode = resources[i].icmpcode;
				addresources[i].priority = resources[i].priority;
				addresources[i].state = resources[i].state;
				addresources[i].logstate = resources[i].logstate;
				addresources[i].ratelimit = resources[i].ratelimit;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsacl of given name.
	*/
	public static base_response delete(nitro_service client, String aclname) throws Exception {
		nsacl deleteresource = new nsacl();
		deleteresource.aclname = aclname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsacl.
	*/
	public static base_response delete(nitro_service client, nsacl resource) throws Exception {
		nsacl deleteresource = new nsacl();
		deleteresource.aclname = resource.aclname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nsacl resources of given names.
	*/
	public static base_responses delete(nitro_service client, String aclname[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nsacl deleteresources[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++){
				deleteresources[i] = new nsacl();
				deleteresources[i].aclname = aclname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nsacl resources.
	*/
	public static base_responses delete(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl deleteresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nsacl();
				deleteresources[i].aclname = resources[i].aclname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nsacl.
	*/
	public static base_response update(nitro_service client, nsacl resource) throws Exception {
		nsacl updateresource = new nsacl();
		updateresource.aclname = resource.aclname;
		updateresource.aclaction = resource.aclaction;
		updateresource.srcip = resource.srcip;
		updateresource.srcipop = resource.srcipop;
		updateresource.srcipval = resource.srcipval;
		updateresource.srcport = resource.srcport;
		updateresource.srcportop = resource.srcportop;
		updateresource.srcportval = resource.srcportval;
		updateresource.destip = resource.destip;
		updateresource.destipop = resource.destipop;
		updateresource.destipval = resource.destipval;
		updateresource.destport = resource.destport;
		updateresource.destportop = resource.destportop;
		updateresource.destportval = resource.destportval;
		updateresource.srcmac = resource.srcmac;
		updateresource.protocol = resource.protocol;
		updateresource.protocolnumber = resource.protocolnumber;
		updateresource.icmptype = resource.icmptype;
		updateresource.icmpcode = resource.icmpcode;
		updateresource.vlan = resource.vlan;
		updateresource.Interface = resource.Interface;
		updateresource.priority = resource.priority;
		updateresource.logstate = resource.logstate;
		updateresource.ratelimit = resource.ratelimit;
		updateresource.established = resource.established;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nsacl resources.
	*/
	public static base_responses update(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl updateresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nsacl();
				updateresources[i].aclname = resources[i].aclname;
				updateresources[i].aclaction = resources[i].aclaction;
				updateresources[i].srcip = resources[i].srcip;
				updateresources[i].srcipop = resources[i].srcipop;
				updateresources[i].srcipval = resources[i].srcipval;
				updateresources[i].srcport = resources[i].srcport;
				updateresources[i].srcportop = resources[i].srcportop;
				updateresources[i].srcportval = resources[i].srcportval;
				updateresources[i].destip = resources[i].destip;
				updateresources[i].destipop = resources[i].destipop;
				updateresources[i].destipval = resources[i].destipval;
				updateresources[i].destport = resources[i].destport;
				updateresources[i].destportop = resources[i].destportop;
				updateresources[i].destportval = resources[i].destportval;
				updateresources[i].srcmac = resources[i].srcmac;
				updateresources[i].protocol = resources[i].protocol;
				updateresources[i].protocolnumber = resources[i].protocolnumber;
				updateresources[i].icmptype = resources[i].icmptype;
				updateresources[i].icmpcode = resources[i].icmpcode;
				updateresources[i].vlan = resources[i].vlan;
				updateresources[i].Interface = resources[i].Interface;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].logstate = resources[i].logstate;
				updateresources[i].ratelimit = resources[i].ratelimit;
				updateresources[i].established = resources[i].established;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsacl resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsacl resource, String[] args) throws Exception{
		nsacl unsetresource = new nsacl();
		unsetresource.aclname = resource.aclname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nsacl resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String aclname[], String args[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nsacl unsetresources[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++){
				unsetresources[i] = new nsacl();
				unsetresources[i].aclname = aclname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsacl resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nsacl resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl unsetresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nsacl();
				unsetresources[i].aclname = resources[i].aclname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable nsacl of given name.
	*/
	public static base_response enable(nitro_service client, String aclname) throws Exception {
		nsacl enableresource = new nsacl();
		enableresource.aclname = aclname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nsacl.
	*/
	public static base_response enable(nitro_service client, nsacl resource) throws Exception {
		nsacl enableresource = new nsacl();
		enableresource.aclname = resource.aclname;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable nsacl resources of given names.
	*/
	public static base_responses enable(nitro_service client, String aclname[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nsacl enableresources[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++){
				enableresources[i] = new nsacl();
				enableresources[i].aclname = aclname[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable nsacl resources.
	*/
	public static base_responses enable(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl enableresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new nsacl();
				enableresources[i].aclname = resources[i].aclname;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable nsacl of given name.
	*/
	public static base_response disable(nitro_service client, String aclname) throws Exception {
		nsacl disableresource = new nsacl();
		disableresource.aclname = aclname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nsacl.
	*/
	public static base_response disable(nitro_service client, nsacl resource) throws Exception {
		nsacl disableresource = new nsacl();
		disableresource.aclname = resource.aclname;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable nsacl resources of given names.
	*/
	public static base_responses disable(nitro_service client, String aclname[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nsacl disableresources[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++){
				disableresources[i] = new nsacl();
				disableresources[i].aclname = aclname[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable nsacl resources.
	*/
	public static base_responses disable(nitro_service client, nsacl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsacl disableresources[] = new nsacl[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new nsacl();
				disableresources[i].aclname = resources[i].aclname;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a nsacl resource.
	*/
	public static base_response rename(nitro_service client, nsacl resource, String new_aclname) throws Exception {
		nsacl renameresource = new nsacl();
		renameresource.aclname = resource.aclname;
		return renameresource.rename_resource(client,new_aclname);
	}

	/**
	* Use this API to rename a nsacl resource.
	*/
	public static base_response rename(nitro_service client, String aclname, String new_aclname) throws Exception {
		nsacl renameresource = new nsacl();
		renameresource.aclname = aclname;
		return renameresource.rename_resource(client,new_aclname);
	}

	/**
	* Use this API to fetch all the nsacl resources that are configured on netscaler.
	*/
	public static nsacl[] get(nitro_service service) throws Exception{
		nsacl obj = new nsacl();
		nsacl[] response = (nsacl[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsacl resources that are configured on netscaler.
	*/
	public static nsacl[] get(nitro_service service, options option) throws Exception{
		nsacl obj = new nsacl();
		nsacl[] response = (nsacl[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nsacl resource of given name .
	*/
	public static nsacl get(nitro_service service, String aclname) throws Exception{
		nsacl obj = new nsacl();
		obj.set_aclname(aclname);
		nsacl response = (nsacl) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nsacl resources of given names .
	*/
	public static nsacl[] get(nitro_service service, String aclname[]) throws Exception{
		if (aclname !=null && aclname.length>0) {
			nsacl response[] = new nsacl[aclname.length];
			nsacl obj[] = new nsacl[aclname.length];
			for (int i=0;i<aclname.length;i++) {
				obj[i] = new nsacl();
				obj[i].set_aclname(aclname[i]);
				response[i] = (nsacl) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nsacl resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsacl[] get_filtered(nitro_service service, String filter) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_filter(filter);
		nsacl[] response = (nsacl[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsacl resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsacl[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_filter(filter);
		nsacl[] response = (nsacl[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsacl resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_count(true);
		nsacl[] response = (nsacl[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsacl resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsacl[] response = (nsacl[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsacl resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsacl obj = new nsacl();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsacl[] response = (nsacl[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class protocolEnum {
		public static final String ICMP = "ICMP";
		public static final String IGMP = "IGMP";
		public static final String TCP = "TCP";
		public static final String EGP = "EGP";
		public static final String IGP = "IGP";
		public static final String ARGUS = "ARGUS";
		public static final String UDP = "UDP";
		public static final String RDP = "RDP";
		public static final String RSVP = "RSVP";
		public static final String EIGRP = "EIGRP";
		public static final String L2TP = "L2TP";
		public static final String ISIS = "ISIS";
	}
	public static class srcipopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
	public static class destipopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class kernelstateEnum {
		public static final String APPLIED = "APPLIED";
		public static final String NOTAPPLIED = "NOTAPPLIED";
		public static final String RE_APPLY = "RE-APPLY";
		public static final String SFAPPLIED = "SFAPPLIED";
		public static final String SFNOTAPPLIED = "SFNOTAPPLIED";
		public static final String SFAPPLIED61 = "SFAPPLIED61";
		public static final String SFNOTAPPLIED61 = "SFNOTAPPLIED61";
	}
	public static class logstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class destportopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
	public static class aclactionEnum {
		public static final String BRIDGE = "BRIDGE";
		public static final String DENY = "DENY";
		public static final String ALLOW = "ALLOW";
	}
	public static class srcportopEnum {
		public static final String _EQ = "=";
		public static final String _NEQ = "!=";
		public static final String EQ = "EQ";
		public static final String NEQ = "NEQ";
	}
}
