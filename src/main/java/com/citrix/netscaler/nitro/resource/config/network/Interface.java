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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class Interface_response extends base_response
{
	public Interface[] Interface;
}
/**
* Configuration for interface resource.
*/

public class Interface extends base_resource
{
	private String id;
	private String speed;
	private String duplex;
	private String flowctl;
	private String autoneg;
	private String hamonitor;
	private String tagall;
	private String trunk;
	private String lacpmode;
	private Long lacpkey;
	private String lagtype;
	private Long lacppriority;
	private String lacptimeout;
	private String ifalias;
	private Long throughput;
	private Long bandwidthhigh;
	private Long bandwidthnormal;

	//------- Read only Parameter ---------;

	private String devicename;
	private Long unit;
	private String description;
	private Long flags;
	private Long mtu;
	private Long vlan;
	private String mac;
	private Long uptime;
	private Long downtime;
	private String reqmedia;
	private String reqspeed;
	private String reqduplex;
	private String reqflowcontrol;
	private String actmedia;
	private String actspeed;
	private String actduplex;
	private String actflowctl;
	private String conndistr;
	private String macdistr;
	private String mode;
	private String state;
	private Long autonegresult;
	private Long tagged;
	private Long taggedany;
	private Long taggedautolearn;
	private Long hangdetect;
	private Long hangreset;
	private Long rxpackets;
	private Long rxbytes;
	private Long rxerrors;
	private Long rxdrops;
	private Long txpackets;
	private Long txbytes;
	private Long txerrors;
	private Long txdrops;
	private Long indisc;
	private Long outdisc;
	private Long fctls;
	private Long hangs;
	private Long stsstalls;
	private Long txstalls;
	private Long rxstalls;
	private Long bdgmacmoved;
	private Long bdgmuted;
	private String vmac;
	private String vmac6;
	private Long reqthroughput;
	private Long actthroughput;
	private String backplane;
	private String[] ifnum;
	private Long cleartime;
	private Long slavestate;
	private Long slavemedia;
	private Long slavespeed;
	private Long slaveduplex;
	private Long slaveflowctl;
	private Long slavetime;
	private String intftype;
	private Long __count;

	/**
	* <pre>
	* The interface number, in the a/b format, of the interface that needs to be cleared. 'a' can take one of the following values:
				1.	'0': Indicates a management interface.
				2.	'1': Indicates a 10/100/1000 Mbps ports and 10G ports of NetScaler 12000-10G and NetScaler MPX 15000 and 17000 platforms.
				3.	'10': Indicates a 10 Gbps port.
				4.	'LA': Indicates a link aggregation port.
				5.	'LO': Indicates a loop back port.
				'b' is an integer that is used to provide a unique label for the interfaces in the groups defined by 'a'.
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* The interface number, in the a/b format, of the interface that needs to be cleared. 'a' can take one of the following values:
				1.	'0': Indicates a management interface.
				2.	'1': Indicates a 10/100/1000 Mbps ports and 10G ports of NetScaler 12000-10G and NetScaler MPX 15000 and 17000 platforms.
				3.	'10': Indicates a 10 Gbps port.
				4.	'LA': Indicates a link aggregation port.
				5.	'LO': Indicates a loop back port.
				'b' is an integer that is used to provide a unique label for the interfaces in the groups defined by 'a'.
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The requested Ethernet speed of the interface. Possible values are:
1.	AUTO: The default value. Specifies that the NetScaler appliance attempts to auto-negotiate or auto-sense the line speed of the interface when it is brought up.
2.	10, 100, 1000, and 10000: 10 Mbps, 100 Mbps, 1 Gbps, and 10 Gbps respectively.
Setting a speed other than AUTO requires the device at the other end of the link to be configured identically. Mismatched speed and duplex settings lead to link errors, packet loss, and other errors. Some interfaces do not support certain speeds. If you specify an unsupported speed, an error message appears.<br> Default value: NSA_DVC_SPEED_AUTO<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public void set_speed(String speed) throws Exception{
		this.speed = speed;
	}

	/**
	* <pre>
	* The requested Ethernet speed of the interface. Possible values are:
1.	AUTO: The default value. Specifies that the NetScaler appliance attempts to auto-negotiate or auto-sense the line speed of the interface when it is brought up.
2.	10, 100, 1000, and 10000: 10 Mbps, 100 Mbps, 1 Gbps, and 10 Gbps respectively.
Setting a speed other than AUTO requires the device at the other end of the link to be configured identically. Mismatched speed and duplex settings lead to link errors, packet loss, and other errors. Some interfaces do not support certain speeds. If you specify an unsupported speed, an error message appears.<br> Default value: NSA_DVC_SPEED_AUTO<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public String get_speed() throws Exception {
		return this.speed;
	}

	/**
	* <pre>
	* The requested duplex mode for the interface. Possible values are:
1.	AUTO: The default setting. Specifies that the NetScaler appliance attempts to auto-negotiate the duplex mode of the interface when it is brought up.
2.	HALF
3.	FULL
For settings other than AUTO, duplex and speed settings should be identical at both ends of the link.<br> Default value: NSA_DVC_DUPLEX_AUTO<br> Possible values = AUTO, HALF, FULL
	* </pre>
	*/
	public void set_duplex(String duplex) throws Exception{
		this.duplex = duplex;
	}

	/**
	* <pre>
	* The requested duplex mode for the interface. Possible values are:
1.	AUTO: The default setting. Specifies that the NetScaler appliance attempts to auto-negotiate the duplex mode of the interface when it is brought up.
2.	HALF
3.	FULL
For settings other than AUTO, duplex and speed settings should be identical at both ends of the link.<br> Default value: NSA_DVC_DUPLEX_AUTO<br> Possible values = AUTO, HALF, FULL
	* </pre>
	*/
	public String get_duplex() throws Exception {
		return this.duplex;
	}

	/**
	* <pre>
	* The requested 802.3x flow control setting for the interface. Possible values are OFF (the default), RX, TX, RXTX, and ON ("forced RXTX"). The 802.3x specification does not define flow control for 10 Mbps and 100 Mbps speeds, but if a Gigabit Ethernet interface operates at those speeds, the flow control settings can be applied. The flow control setting that is finally applied to an interface depends on auto-negotiation. With the ON option, auto-negotiation gives the peer the opportunity to negotiate the flow control, but the appliance then forces two-way flow control for the interface.  Any other link-parameter mismatches can sometimes cause problems and should be avoided by thoroughly checking the settings.<br> Default value: OFF<br> Possible values = OFF, RX, TX, RXTX
	* </pre>
	*/
	public void set_flowctl(String flowctl) throws Exception{
		this.flowctl = flowctl;
	}

	/**
	* <pre>
	* The requested 802.3x flow control setting for the interface. Possible values are OFF (the default), RX, TX, RXTX, and ON ("forced RXTX"). The 802.3x specification does not define flow control for 10 Mbps and 100 Mbps speeds, but if a Gigabit Ethernet interface operates at those speeds, the flow control settings can be applied. The flow control setting that is finally applied to an interface depends on auto-negotiation. With the ON option, auto-negotiation gives the peer the opportunity to negotiate the flow control, but the appliance then forces two-way flow control for the interface.  Any other link-parameter mismatches can sometimes cause problems and should be avoided by thoroughly checking the settings.<br> Default value: OFF<br> Possible values = OFF, RX, TX, RXTX
	* </pre>
	*/
	public String get_flowctl() throws Exception {
		return this.flowctl;
	}

	/**
	* <pre>
	* The state of auto-negotiation for the specified interface. Possible values are Enabled or Disabled. If auto-negotiation is enabled on an interface, that interface tries to auto-negotiate the speed and duplex settings with the link partner. If the user specifies a speed or duplex setting other then AUTO, auto-negotiation of that parameter does not occur.<br> Default value: NSA_DVC_AUTONEG_ON<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public void set_autoneg(String autoneg) throws Exception{
		this.autoneg = autoneg;
	}

	/**
	* <pre>
	* The state of auto-negotiation for the specified interface. Possible values are Enabled or Disabled. If auto-negotiation is enabled on an interface, that interface tries to auto-negotiate the speed and duplex settings with the link partner. If the user specifies a speed or duplex setting other then AUTO, auto-negotiation of that parameter does not occur.<br> Default value: NSA_DVC_AUTONEG_ON<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public String get_autoneg() throws Exception {
		return this.autoneg;
	}

	/**
	* <pre>
	* Trigger a failover when the interface on which this option is enabled goes down. By default, this option is enabled on all interfaces. Citrix recommends that this option be disabled on all unused or noncritical interfaces.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_hamonitor(String hamonitor) throws Exception{
		this.hamonitor = hamonitor;
	}

	/**
	* <pre>
	* Trigger a failover when the interface on which this option is enabled goes down. By default, this option is enabled on all interfaces. Citrix recommends that this option be disabled on all unused or noncritical interfaces.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_hamonitor() throws Exception {
		return this.hamonitor;
	}

	/**
	* <pre>
	*  The appliance adds a four-byte 802.1q tag to every packet sent on this interface.  ON applies tags for all the VLANs that are bound to this interface. OFF, applies the tag for all VLANs other than the native VLAN.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_tagall(String tagall) throws Exception{
		this.tagall = tagall;
	}

	/**
	* <pre>
	*  The appliance adds a four-byte 802.1q tag to every packet sent on this interface.  ON applies tags for all the VLANs that are bound to this interface. OFF, applies the tag for all VLANs other than the native VLAN.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_tagall() throws Exception {
		return this.tagall;
	}

	/**
	* <pre>
	* This argument is deprecated by tagall.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_trunk(String trunk) throws Exception{
		this.trunk = trunk;
	}

	/**
	* <pre>
	* This argument is deprecated by tagall.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_trunk() throws Exception {
		return this.trunk;
	}

	/**
	* <pre>
	* The LACP mode of the specified interface. The possible values are:
1. Active: A port in active mode generates LACP protocol messages on a regular basis, regardless of any need expressed by its partner to receive them.
2. Passive: A port in passive mode generally does not transmit LACP messages unless its partner is in the active mode; that is, it does not speak unless spoken to.
3. Disabled: Removes the interface from the LA channel. If this is only interface in the LA channel, the LA channel is also deleted.
<br> Default value: DISABLED<br> Possible values = DISABLED, ACTIVE, PASSIVE
	* </pre>
	*/
	public void set_lacpmode(String lacpmode) throws Exception{
		this.lacpmode = lacpmode;
	}

	/**
	* <pre>
	* The LACP mode of the specified interface. The possible values are:
1. Active: A port in active mode generates LACP protocol messages on a regular basis, regardless of any need expressed by its partner to receive them.
2. Passive: A port in passive mode generally does not transmit LACP messages unless its partner is in the active mode; that is, it does not speak unless spoken to.
3. Disabled: Removes the interface from the LA channel. If this is only interface in the LA channel, the LA channel is also deleted.
<br> Default value: DISABLED<br> Possible values = DISABLED, ACTIVE, PASSIVE
	* </pre>
	*/
	public String get_lacpmode() throws Exception {
		return this.lacpmode;
	}

	/**
	* <pre>
	* A digit that dentifies the LA channel to which the interface is bound. Possible values: 1, 2, 3, 4.<br> Minimum value =  1<br> Maximum value =  8
	* </pre>
	*/
	public void set_lacpkey(long lacpkey) throws Exception {
		this.lacpkey = new Long(lacpkey);
	}

	/**
	* <pre>
	* A digit that dentifies the LA channel to which the interface is bound. Possible values: 1, 2, 3, 4.<br> Minimum value =  1<br> Maximum value =  8
	* </pre>
	*/
	public void set_lacpkey(Long lacpkey) throws Exception{
		this.lacpkey = lacpkey;
	}

	/**
	* <pre>
	* A digit that dentifies the LA channel to which the interface is bound. Possible values: 1, 2, 3, 4.<br> Minimum value =  1<br> Maximum value =  8
	* </pre>
	*/
	public Long get_lacpkey() throws Exception {
		return this.lacpkey;
	}

	/**
	* <pre>
	* LAG Type (Node/Cluster).<br> Default value: NSA_LAG_NODE<br> Possible values = NODE, CLUSTER
	* </pre>
	*/
	public void set_lagtype(String lagtype) throws Exception{
		this.lagtype = lagtype;
	}

	/**
	* <pre>
	* LAG Type (Node/Cluster).<br> Default value: NSA_LAG_NODE<br> Possible values = NODE, CLUSTER
	* </pre>
	*/
	public String get_lagtype() throws Exception {
		return this.lagtype;
	}

	/**
	* <pre>
	* LACP port priority, expressed as an integer ranging from 1 to 65535. The highest priority is 1. The NetScaler limits the number of interfaces in an LA channel to 8. If LACP is enabled on more than 8 interfaces, the NetScaler selects 8 interfaces, in decending order of port priority, to form an channel.<br> Default value: 32768<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_lacppriority(long lacppriority) throws Exception {
		this.lacppriority = new Long(lacppriority);
	}

	/**
	* <pre>
	* LACP port priority, expressed as an integer ranging from 1 to 65535. The highest priority is 1. The NetScaler limits the number of interfaces in an LA channel to 8. If LACP is enabled on more than 8 interfaces, the NetScaler selects 8 interfaces, in decending order of port priority, to form an channel.<br> Default value: 32768<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_lacppriority(Long lacppriority) throws Exception{
		this.lacppriority = lacppriority;
	}

	/**
	* <pre>
	* LACP port priority, expressed as an integer ranging from 1 to 65535. The highest priority is 1. The NetScaler limits the number of interfaces in an LA channel to 8. If LACP is enabled on more than 8 interfaces, the NetScaler selects 8 interfaces, in decending order of port priority, to form an channel.<br> Default value: 32768<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_lacppriority() throws Exception {
		return this.lacppriority;
	}

	/**
	* <pre>
	* Time to wait for the LACPDU.  If a LACPDU is not received within this interval, the NetScaler markes the link partner port as DOWN. Possible values: Long and Short. Long lacptimeout is 90 sec and Short LACP timeout is 3 sec.<br> Default value: NSA_LACP_TIMEOUT_LONG<br> Possible values = LONG, SHORT
	* </pre>
	*/
	public void set_lacptimeout(String lacptimeout) throws Exception{
		this.lacptimeout = lacptimeout;
	}

	/**
	* <pre>
	* Time to wait for the LACPDU.  If a LACPDU is not received within this interval, the NetScaler markes the link partner port as DOWN. Possible values: Long and Short. Long lacptimeout is 90 sec and Short LACP timeout is 3 sec.<br> Default value: NSA_LACP_TIMEOUT_LONG<br> Possible values = LONG, SHORT
	* </pre>
	*/
	public String get_lacptimeout() throws Exception {
		return this.lacptimeout;
	}

	/**
	* <pre>
	* The alias name for the interface.<br> Default value: " "<br> Maximum length =  31
	* </pre>
	*/
	public void set_ifalias(String ifalias) throws Exception{
		this.ifalias = ifalias;
	}

	/**
	* <pre>
	* The alias name for the interface.<br> Default value: " "<br> Maximum length =  31
	* </pre>
	*/
	public String get_ifalias() throws Exception {
		return this.ifalias;
	}

	/**
	* <pre>
	* Minimum required throughput for an interface. Failover is triggered if the operating throughput of a Link Aggregation (LA) channel for which HAMON is ON falls below this value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_throughput(long throughput) throws Exception {
		this.throughput = new Long(throughput);
	}

	/**
	* <pre>
	* Minimum required throughput for an interface. Failover is triggered if the operating throughput of a Link Aggregation (LA) channel for which HAMON is ON falls below this value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_throughput(Long throughput) throws Exception{
		this.throughput = throughput;
	}

	/**
	* <pre>
	* Minimum required throughput for an interface. Failover is triggered if the operating throughput of a Link Aggregation (LA) channel for which HAMON is ON falls below this value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_throughput() throws Exception {
		return this.throughput;
	}

	/**
	* <pre>
	* Configured high threshold of the interface bandwidth usage in Mbits/s. Trap will be sent if bandwidth usage of the interface goes above this limit. The possible values are:
1. 1000Mbps for 1G interfaces.
2. 10000Mbps for 10G interfaces.
3. 80000Mbps for Link Aggregation channels.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthhigh(long bandwidthhigh) throws Exception {
		this.bandwidthhigh = new Long(bandwidthhigh);
	}

	/**
	* <pre>
	* Configured high threshold of the interface bandwidth usage in Mbits/s. Trap will be sent if bandwidth usage of the interface goes above this limit. The possible values are:
1. 1000Mbps for 1G interfaces.
2. 10000Mbps for 10G interfaces.
3. 80000Mbps for Link Aggregation channels.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthhigh(Long bandwidthhigh) throws Exception{
		this.bandwidthhigh = bandwidthhigh;
	}

	/**
	* <pre>
	* Configured high threshold of the interface bandwidth usage in Mbits/s. Trap will be sent if bandwidth usage of the interface goes above this limit. The possible values are:
1. 1000Mbps for 1G interfaces.
2. 10000Mbps for 10G interfaces.
3. 80000Mbps for Link Aggregation channels.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_bandwidthhigh() throws Exception {
		return this.bandwidthhigh;
	}

	/**
	* <pre>
	* Configured normal threshold of the interface bandwidth usage in Mbits/s. Trap will be sent if bandwidth usage of the interface comes back to this limit. The possible values are:
1. 1000Mbps for 1G interfaces.
2. 10000Mbps for 10G interfaces.
3. 80000Mbps for Link Aggregation channels.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthnormal(long bandwidthnormal) throws Exception {
		this.bandwidthnormal = new Long(bandwidthnormal);
	}

	/**
	* <pre>
	* Configured normal threshold of the interface bandwidth usage in Mbits/s. Trap will be sent if bandwidth usage of the interface comes back to this limit. The possible values are:
1. 1000Mbps for 1G interfaces.
2. 10000Mbps for 10G interfaces.
3. 80000Mbps for Link Aggregation channels.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthnormal(Long bandwidthnormal) throws Exception{
		this.bandwidthnormal = bandwidthnormal;
	}

	/**
	* <pre>
	* Configured normal threshold of the interface bandwidth usage in Mbits/s. Trap will be sent if bandwidth usage of the interface comes back to this limit. The possible values are:
1. 1000Mbps for 1G interfaces.
2. 10000Mbps for 10G interfaces.
3. 80000Mbps for Link Aggregation channels.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_bandwidthnormal() throws Exception {
		return this.bandwidthnormal;
	}

	/**
	* <pre>
	* Name of the interface.
	* </pre>
	*/
	public String get_devicename() throws Exception {
		return this.devicename;
	}

	/**
	* <pre>
	* Unit number for this interface, signifying the sequence number in which this interface is discovered on this Netscaler.
	* </pre>
	*/
	public Long get_unit() throws Exception {
		return this.unit;
	}

	/**
	* <pre>
	* Display the type of interface, the speeds at which this interface can operate, and, if applicable, the type of SFP,.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* Flags for this interface. Used for communicating the device states.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* MTU for this interface (the largest frame that can transit this interface).
	* </pre>
	*/
	public Long get_mtu() throws Exception {
		return this.mtu;
	}

	/**
	* <pre>
	* Native VLAN for this interface.
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* MAC address for this interface.
	* </pre>
	*/
	public String get_mac() throws Exception {
		return this.mac;
	}

	/**
	* <pre>
	* Duration for which the interface has been UP (Example: 3 hours 1 minute 1 second). This value is reset when the interface state changes to DOWN..
	* </pre>
	*/
	public Long get_uptime() throws Exception {
		return this.uptime;
	}

	/**
	* <pre>
	* Duration for which the interface has been DOWN.  This value is reset when the interface state changes to UP.(Example: 3 hours 1 minute 1 second).
	* </pre>
	*/
	public Long get_downtime() throws Exception {
		return this.downtime;
	}

	/**
	* <pre>
	* Requested media setting for this interface.<br> Possible values = AUTO, UTP, FIBER
	* </pre>
	*/
	public String get_reqmedia() throws Exception {
		return this.reqmedia;
	}

	/**
	* <pre>
	* Requested speed setting for this interface.<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public String get_reqspeed() throws Exception {
		return this.reqspeed;
	}

	/**
	* <pre>
	* Requested duplex setting for this interface.<br> Possible values = AUTO, HALF, FULL
	* </pre>
	*/
	public String get_reqduplex() throws Exception {
		return this.reqduplex;
	}

	/**
	* <pre>
	* Requested flow control setting for this interface.<br> Possible values = OFF, RX, TX, RXTX
	* </pre>
	*/
	public String get_reqflowcontrol() throws Exception {
		return this.reqflowcontrol;
	}

	/**
	* <pre>
	* Actual media setting for this interface.<br> Possible values = AUTO, UTP, FIBER
	* </pre>
	*/
	public String get_actmedia() throws Exception {
		return this.actmedia;
	}

	/**
	* <pre>
	* Actual speed setting for this interface.<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public String get_actspeed() throws Exception {
		return this.actspeed;
	}

	/**
	* <pre>
	* Actual duplex setting for this interface.<br> Possible values = AUTO, HALF, FULL
	* </pre>
	*/
	public String get_actduplex() throws Exception {
		return this.actduplex;
	}

	/**
	* <pre>
	* Actual flow control setting for this interface.<br> Possible values = OFF, RX, TX, RXTX
	* </pre>
	*/
	public String get_actflowctl() throws Exception {
		return this.actflowctl;
	}

	/**
	* <pre>
	* Connection distribution setting on this interface.<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public String get_conndistr() throws Exception {
		return this.conndistr;
	}

	/**
	* <pre>
	* MAC distribution setting on this interface.<br> Possible values = SOURCE, DESTINATION, BOTH
	* </pre>
	*/
	public String get_macdistr() throws Exception {
		return this.macdistr;
	}

	/**
	* <pre>
	* Interface Link Aggregation mode (Auto/Manual) setting.<br> Possible values = MANUAL, AUTO
	* </pre>
	*/
	public String get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* Link state of the interface (UP/DOWN).<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Actual auto-negotiation setting for this interface.
	* </pre>
	*/
	public Long get_autonegresult() throws Exception {
		return this.autonegresult;
	}

	/**
	* <pre>
	* VLAN tags setting on this channel.
	* </pre>
	*/
	public Long get_tagged() throws Exception {
		return this.tagged;
	}

	/**
	* <pre>
	* Interface setting to accept/drop all tagged packets.
	* </pre>
	*/
	public Long get_taggedany() throws Exception {
		return this.taggedany;
	}

	/**
	* <pre>
	* Dynamic VLAN membership autolearning enabled or disabled on this interface.
	* </pre>
	*/
	public Long get_taggedautolearn() throws Exception {
		return this.taggedautolearn;
	}

	/**
	* <pre>
	* Hang detection enabled or disabled for this interface.
	* </pre>
	*/
	public Long get_hangdetect() throws Exception {
		return this.hangdetect;
	}

	/**
	* <pre>
	* Hang reset enabled or disabled for this interface.
	* </pre>
	*/
	public Long get_hangreset() throws Exception {
		return this.hangreset;
	}

	/**
	* <pre>
	* Number of packets received by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_rxpackets() throws Exception {
		return this.rxpackets;
	}

	/**
	* <pre>
	* Number of bytes received by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_rxbytes() throws Exception {
		return this.rxbytes;
	}

	/**
	* <pre>
	* Number of inbound packets dropped by the hardware on a specified interface since the NetScaler appliance was started or the interface statistics were cleared. Packets can be dropped because of CRC, length (undersize or oversize), or alignment errors.
	* </pre>
	*/
	public Long get_rxerrors() throws Exception {
		return this.rxerrors;
	}

	/**
	* <pre>
	* Number of inbound packets dropped by the specified interface. Commonly dropped packets are multicast frames, spanning tree BPDUs, packets destined to a MAC not owned by the NetScaler appliance when L2 mode is disabled, or packets tagged for a VLAN that is not bound to the interface.  In most healthy networks, this statistic increments at a steady rate regardless of traffic load.  A sharp spike in dropped packets generally indicates an issue with connected L2 switches, such as a forwarding database overflow resulting in packets being broadcast on all ports.
	* </pre>
	*/
	public Long get_rxdrops() throws Exception {
		return this.rxdrops;
	}

	/**
	* <pre>
	* Number of packets transmitted by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_txpackets() throws Exception {
		return this.txpackets;
	}

	/**
	* <pre>
	* Number of bytes transmitted by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_txbytes() throws Exception {
		return this.txbytes;
	}

	/**
	* <pre>
	* Number of outbound packets dropped by the hardware on a specified interface since the NetScaler appliance was started or the interface statistics were cleared. Packets can be dropped because of length (undersize or oversize) errors or a lack of resources. This statistic is available only for:
						(1) Loop back interface (LO) of all platforms.
						(2) All data ports on the NetScaler 12000 platform.
						(3) Management ports on the Netscaler MPX 15000 and 17000 platforms.
						.
	* </pre>
	*/
	public Long get_txerrors() throws Exception {
		return this.txerrors;
	}

	/**
	* <pre>
	* Number of packets dropped in transmission by the specified interface for one of the following reasons.
						(1) VLAN mismatch.
						(2) Oversized packets.
						(3) Interface congestion.
						(4) Loopback packets sent on non loop back interface.
						.
	* </pre>
	*/
	public Long get_txdrops() throws Exception {
		return this.txdrops;
	}

	/**
	* <pre>
	* Number of error-free inbound packets discarded by the specified interface because of a lack of resources (for example, insufficient receive buffers).
	* </pre>
	*/
	public Long get_indisc() throws Exception {
		return this.indisc;
	}

	/**
	* <pre>
	* Number of error-free outbound packets discarded by the specified interface because of a lack of resources. This statistic is not available on:
						(1) 10G ports of NetScaler MPX 12500/12500/15500-10G  platforms.
						(2) 10G data ports on NetScaler MPX 17500/19500/21500 platforms.
						.
	* </pre>
	*/
	public Long get_outdisc() throws Exception {
		return this.outdisc;
	}

	/**
	* <pre>
	* Number of times flow control is performed on the specified interface because of received pause frames.
	* </pre>
	*/
	public Long get_fctls() throws Exception {
		return this.fctls;
	}

	/**
	* <pre>
	* Number of times the specified interface detected hangs in the transmit and receive paths since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_hangs() throws Exception {
		return this.hangs;
	}

	/**
	* <pre>
	* Number of times the status updates for a specified interface were stalled since the NetScaler appliance was started or the interface statistics were cleared. A status stall is detected when the status of the interface is not updated by the NIC hardware within 0.8 seconds of the last update.
	* </pre>
	*/
	public Long get_stsstalls() throws Exception {
		return this.stsstalls;
	}

	/**
	* <pre>
	* Number of times the interface stalled, when transmitting packets, since the NetScaler appliance was started or the interface statistics were cleared. Transmit (Tx) stalls are detected when a packet posted for transmission is not transmitted in 4 seconds.
	* </pre>
	*/
	public Long get_txstalls() throws Exception {
		return this.txstalls;
	}

	/**
	* <pre>
	* Number of times the interface stalled, when receiving packets, since the NetScaler appliance was started or the interface statistics were cleared. Receive (Rx) stalls are detected when the following conditions are met:
						(1)The link is up for more than 10 minutes.
						(2)Packets are transmitted, but no packets are received for 16 seconds.
						.
	* </pre>
	*/
	public Long get_rxstalls() throws Exception {
		return this.rxstalls;
	}

	/**
	* <pre>
	* Number of MAC moves between ports. A high rate of MAC moves typically indicates a bridge loop between two interfaces.
	* </pre>
	*/
	public Long get_bdgmacmoved() throws Exception {
		return this.bdgmacmoved;
	}

	/**
	* <pre>
	* Number of times the specified interface stopped transmitting and receiving packets because of MAC moves between ports.
	* </pre>
	*/
	public Long get_bdgmuted() throws Exception {
		return this.bdgmuted;
	}

	/**
	* <pre>
	* Virtual MAC of this interface.
	* </pre>
	*/
	public String get_vmac() throws Exception {
		return this.vmac;
	}

	/**
	* <pre>
	* Virtual MAC for IPv6 of this interface.
	* </pre>
	*/
	public String get_vmac6() throws Exception {
		return this.vmac6;
	}

	/**
	* <pre>
	* Minimum required throughput for an interface. Failover is triggered if the operating throughput of a Link Aggregation (LA) channel for which HAMON is ON falls below this value. The possible values are:
1. 1000Mbps for 1G interfaces.
2. 10000Mbps for 10G interfaces.
3. 80000Mbps for Link Aggregation channels.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_reqthroughput() throws Exception {
		return this.reqthroughput;
	}

	/**
	* <pre>
	* Actual throughput for the interface.
	* </pre>
	*/
	public Long get_actthroughput() throws Exception {
		return this.actthroughput;
	}

	/**
	* <pre>
	* The cluster backplane status of the interface. If the status is enabled, the interface is part of the cluster backplane. By default, the backplane status is disabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_backplane() throws Exception {
		return this.backplane;
	}

	/**
	* <pre>
	* Contains the LA Master, if the interface is part of LA channel.
	* </pre>
	*/
	public String[] get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* Time since the interface stats are cleared last time.
	* </pre>
	*/
	public Long get_cleartime() throws Exception {
		return this.cleartime;
	}

	/**
	* <pre>
	* State of the member interfaces.
	* </pre>
	*/
	public Long get_slavestate() throws Exception {
		return this.slavestate;
	}

	/**
	* <pre>
	* Media type of the member interfaces.
	* </pre>
	*/
	public Long get_slavemedia() throws Exception {
		return this.slavemedia;
	}

	/**
	* <pre>
	* Speed of the member interfaces.
	* </pre>
	*/
	public Long get_slavespeed() throws Exception {
		return this.slavespeed;
	}

	/**
	* <pre>
	* Duplex of the member interfaces.
	* </pre>
	*/
	public Long get_slaveduplex() throws Exception {
		return this.slaveduplex;
	}

	/**
	* <pre>
	* Flowcontrol of the member interfaces.
	* </pre>
	*/
	public Long get_slaveflowctl() throws Exception {
		return this.slaveflowctl;
	}

	/**
	* <pre>
	* UP time of the member interfaces.
	* </pre>
	*/
	public Long get_slavetime() throws Exception {
		return this.slavetime;
	}

	/**
	* <pre>
	* Interface Type, this field will have the interface type either it is virtual, physical or loopback. .<br> Possible values = BROADCOM 5700/5701, TIGON1/TIGON2, INTEL 82546, INTEL 8255X(PRO), Link Aggregate, Loopback, Intel 82541/47, Broadcom 5704, Chelsio 1G, Intel 8247X, Intel 82576 VF, Xen Virtual, Intel 10G, Intel 82599 VF, Hyper v, Cluster LAG, Intel 8247X SFP, XEN Interface, Chelsio 10G
	* </pre>
	*/
	public String get_intftype() throws Exception {
		return this.intftype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		Interface_response result = (Interface_response) service.get_payload_formatter().string_to_resource(Interface_response.class, response);
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
		return result.Interface;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.id;
	}

	/**
	* Use this API to clear Interface.
	*/
	public static base_response clear(nitro_service client, Interface resource) throws Exception {
		Interface clearresource = new Interface();
		clearresource.id = resource.id;
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear Interface resources.
	*/
	public static base_responses clear(nitro_service client, Interface resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			Interface clearresources[] = new Interface[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new Interface();
				clearresources[i].id = resources[i].id;
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to update Interface.
	*/
	public static base_response update(nitro_service client, Interface resource) throws Exception {
		Interface updateresource = new Interface();
		updateresource.id = resource.id;
		updateresource.speed = resource.speed;
		updateresource.duplex = resource.duplex;
		updateresource.flowctl = resource.flowctl;
		updateresource.autoneg = resource.autoneg;
		updateresource.hamonitor = resource.hamonitor;
		updateresource.tagall = resource.tagall;
		updateresource.trunk = resource.trunk;
		updateresource.lacpmode = resource.lacpmode;
		updateresource.lacpkey = resource.lacpkey;
		updateresource.lagtype = resource.lagtype;
		updateresource.lacppriority = resource.lacppriority;
		updateresource.lacptimeout = resource.lacptimeout;
		updateresource.ifalias = resource.ifalias;
		updateresource.throughput = resource.throughput;
		updateresource.bandwidthhigh = resource.bandwidthhigh;
		updateresource.bandwidthnormal = resource.bandwidthnormal;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update Interface resources.
	*/
	public static base_responses update(nitro_service client, Interface resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			Interface updateresources[] = new Interface[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new Interface();
				updateresources[i].id = resources[i].id;
				updateresources[i].speed = resources[i].speed;
				updateresources[i].duplex = resources[i].duplex;
				updateresources[i].flowctl = resources[i].flowctl;
				updateresources[i].autoneg = resources[i].autoneg;
				updateresources[i].hamonitor = resources[i].hamonitor;
				updateresources[i].tagall = resources[i].tagall;
				updateresources[i].trunk = resources[i].trunk;
				updateresources[i].lacpmode = resources[i].lacpmode;
				updateresources[i].lacpkey = resources[i].lacpkey;
				updateresources[i].lagtype = resources[i].lagtype;
				updateresources[i].lacppriority = resources[i].lacppriority;
				updateresources[i].lacptimeout = resources[i].lacptimeout;
				updateresources[i].ifalias = resources[i].ifalias;
				updateresources[i].throughput = resources[i].throughput;
				updateresources[i].bandwidthhigh = resources[i].bandwidthhigh;
				updateresources[i].bandwidthnormal = resources[i].bandwidthnormal;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of Interface resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String id, String args[]) throws Exception {
		Interface unsetresource = new Interface();
		unsetresource.id = id;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of Interface resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, Interface resource, String[] args) throws Exception{
		Interface unsetresource = new Interface();
		unsetresource.id = resource.id;
		unsetresource.speed = resource.speed;
		unsetresource.duplex = resource.duplex;
		unsetresource.flowctl = resource.flowctl;
		unsetresource.autoneg = resource.autoneg;
		unsetresource.hamonitor = resource.hamonitor;
		unsetresource.tagall = resource.tagall;
		unsetresource.trunk = resource.trunk;
		unsetresource.lacpmode = resource.lacpmode;
		unsetresource.lacpkey = resource.lacpkey;
		unsetresource.lacppriority = resource.lacppriority;
		unsetresource.lacptimeout = resource.lacptimeout;
		unsetresource.ifalias = resource.ifalias;
		unsetresource.throughput = resource.throughput;
		unsetresource.bandwidthhigh = resource.bandwidthhigh;
		unsetresource.bandwidthnormal = resource.bandwidthnormal;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of Interface resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String id[], String args[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			Interface unsetresources[] = new Interface[id.length];
			for (int i=0;i<id.length;i++){
				unsetresources[i] = new Interface();
				unsetresources[i].id = id[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of Interface resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Interface resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			Interface unsetresources[] = new Interface[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new Interface();
				unsetresources[i].id = resources[i].id;
				unsetresources[i].speed = resources[i].speed;
				unsetresources[i].duplex = resources[i].duplex;
				unsetresources[i].flowctl = resources[i].flowctl;
				unsetresources[i].autoneg = resources[i].autoneg;
				unsetresources[i].hamonitor = resources[i].hamonitor;
				unsetresources[i].tagall = resources[i].tagall;
				unsetresources[i].trunk = resources[i].trunk;
				unsetresources[i].lacpmode = resources[i].lacpmode;
				unsetresources[i].lacpkey = resources[i].lacpkey;
				unsetresources[i].lacppriority = resources[i].lacppriority;
				unsetresources[i].lacptimeout = resources[i].lacptimeout;
				unsetresources[i].ifalias = resources[i].ifalias;
				unsetresources[i].throughput = resources[i].throughput;
				unsetresources[i].bandwidthhigh = resources[i].bandwidthhigh;
				unsetresources[i].bandwidthnormal = resources[i].bandwidthnormal;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable Interface of given name.
	*/
	public static base_response enable(nitro_service client, String id) throws Exception {
		Interface enableresource = new Interface();
		enableresource.id = id;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable Interface.
	*/
	public static base_response enable(nitro_service client, Interface resource) throws Exception {
		Interface enableresource = new Interface();
		enableresource.id = resource.id;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable Interface resources of given names.
	*/
	public static base_responses enable(nitro_service client, String id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			Interface enableresources[] = new Interface[id.length];
			for (int i=0;i<id.length;i++){
				enableresources[i] = new Interface();
				enableresources[i].id = id[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable Interface resources.
	*/
	public static base_responses enable(nitro_service client, Interface resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			Interface enableresources[] = new Interface[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new Interface();
				enableresources[i].id = resources[i].id;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable Interface of given name.
	*/
	public static base_response disable(nitro_service client, String id) throws Exception {
		Interface disableresource = new Interface();
		disableresource.id = id;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable Interface.
	*/
	public static base_response disable(nitro_service client, Interface resource) throws Exception {
		Interface disableresource = new Interface();
		disableresource.id = resource.id;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable Interface resources of given names.
	*/
	public static base_responses disable(nitro_service client, String id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			Interface disableresources[] = new Interface[id.length];
			for (int i=0;i<id.length;i++){
				disableresources[i] = new Interface();
				disableresources[i].id = id[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable Interface resources.
	*/
	public static base_responses disable(nitro_service client, Interface resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			Interface disableresources[] = new Interface[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new Interface();
				disableresources[i].id = resources[i].id;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to reset Interface.
	*/
	public static base_response reset(nitro_service client, Interface resource) throws Exception {
		Interface resetresource = new Interface();
		resetresource.id = resource.id;
		return resetresource.perform_operation(client,"reset");
	}

	/**
	* Use this API to reset Interface resources.
	*/
	public static base_responses reset(nitro_service client, Interface resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			Interface resetresources[] = new Interface[resources.length];
			for (int i=0;i<resources.length;i++){
				resetresources[i] = new Interface();
				resetresources[i].id = resources[i].id;
			}
			result = perform_operation_bulk_request(client, resetresources,"reset");
		}
		return result;
	}

	/**
	* Use this API to fetch all the Interface resources that are configured on netscaler.
	*/
	public static Interface[] get(nitro_service service) throws Exception{
		Interface obj = new Interface();
		Interface[] response = (Interface[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the Interface resources that are configured on netscaler.
	*/
	public static Interface[] get(nitro_service service, options option) throws Exception{
		Interface obj = new Interface();
		Interface[] response = (Interface[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch Interface resource of given name .
	*/
	public static Interface get(nitro_service service, String id) throws Exception{
		Interface obj = new Interface();
		obj.set_id(id);
		Interface response = (Interface) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch Interface resources of given names .
	*/
	public static Interface[] get(nitro_service service, String id[]) throws Exception{
		if (id !=null && id.length>0) {
			Interface response[] = new Interface[id.length];
			Interface obj[] = new Interface[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new Interface();
				obj[i].set_id(id[i]);
				response[i] = (Interface) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of Interface resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static Interface[] get_filtered(nitro_service service, String filter) throws Exception{
		Interface obj = new Interface();
		options option = new options();
		option.set_filter(filter);
		Interface[] response = (Interface[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of Interface resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static Interface[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		Interface obj = new Interface();
		options option = new options();
		option.set_filter(filter);
		Interface[] response = (Interface[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the Interface resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		Interface obj = new Interface();
		options option = new options();
		option.set_count(true);
		Interface[] response = (Interface[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of Interface resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		Interface obj = new Interface();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		Interface[] response = (Interface[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of Interface resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		Interface obj = new Interface();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		Interface[] response = (Interface[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class reqduplexEnum {
		public static final String AUTO = "AUTO";
		public static final String HALF = "HALF";
		public static final String FULL = "FULL";
	}
	public static class backplaneEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class modeEnum {
		public static final String MANUAL = "MANUAL";
		public static final String AUTO = "AUTO";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class actduplexEnum {
		public static final String AUTO = "AUTO";
		public static final String HALF = "HALF";
		public static final String FULL = "FULL";
	}
	public static class hamonitorEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class conndistrEnum {
		public static final String DISABLED = "DISABLED";
		public static final String ENABLED = "ENABLED";
	}
	public static class reqspeedEnum {
		public static final String AUTO = "AUTO";
		public static final String _10 = "10";
		public static final String _100 = "100";
		public static final String _1000 = "1000";
		public static final String _10000 = "10000";
	}
	public static class duplexEnum {
		public static final String AUTO = "AUTO";
		public static final String HALF = "HALF";
		public static final String FULL = "FULL";
	}
	public static class actspeedEnum {
		public static final String AUTO = "AUTO";
		public static final String _10 = "10";
		public static final String _100 = "100";
		public static final String _1000 = "1000";
		public static final String _10000 = "10000";
	}
	public static class reqmediaEnum {
		public static final String AUTO = "AUTO";
		public static final String UTP = "UTP";
		public static final String FIBER = "FIBER";
	}
	public static class intftypeEnum {
		public static final String BROADCOM_5700_5701 = "BROADCOM 5700/5701";
		public static final String TIGON1_TIGON2 = "TIGON1/TIGON2";
		public static final String INTEL_82546 = "INTEL 82546";
		public static final String INTEL_8255X_PRO_ = "INTEL 8255X(PRO)";
		public static final String Link_Aggregate = "Link Aggregate";
		public static final String Loopback = "Loopback";
		public static final String Intel_82541_47 = "Intel 82541/47";
		public static final String Broadcom_5704 = "Broadcom 5704";
		public static final String Chelsio_1G = "Chelsio 1G";
		public static final String Intel_8247X = "Intel 8247X";
		public static final String Intel_82576_VF = "Intel 82576 VF";
		public static final String Xen_Virtual = "Xen Virtual";
		public static final String Intel_10G = "Intel 10G";
		public static final String Intel_82599_VF = "Intel 82599 VF";
		public static final String Hyper_v = "Hyper v";
		public static final String Cluster_LAG = "Cluster LAG";
		public static final String Intel_8247X_SFP = "Intel 8247X SFP";
		public static final String XEN_Interface = "XEN Interface";
		public static final String Chelsio_10G = "Chelsio 10G";
	}
	public static class autonegEnum {
		public static final String DISABLED = "DISABLED";
		public static final String ENABLED = "ENABLED";
	}
	public static class macdistrEnum {
		public static final String SOURCE = "SOURCE";
		public static final String DESTINATION = "DESTINATION";
		public static final String BOTH = "BOTH";
	}
	public static class actmediaEnum {
		public static final String AUTO = "AUTO";
		public static final String UTP = "UTP";
		public static final String FIBER = "FIBER";
	}
	public static class actflowctlEnum {
		public static final String OFF = "OFF";
		public static final String RX = "RX";
		public static final String TX = "TX";
		public static final String RXTX = "RXTX";
	}
	public static class speedEnum {
		public static final String AUTO = "AUTO";
		public static final String _10 = "10";
		public static final String _100 = "100";
		public static final String _1000 = "1000";
		public static final String _10000 = "10000";
	}
	public static class lacptimeoutEnum {
		public static final String LONG = "LONG";
		public static final String SHORT = "SHORT";
	}
	public static class tagallEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class trunkEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class lacpmodeEnum {
		public static final String DISABLED = "DISABLED";
		public static final String ACTIVE = "ACTIVE";
		public static final String PASSIVE = "PASSIVE";
	}
	public static class reqflowcontrolEnum {
		public static final String OFF = "OFF";
		public static final String RX = "RX";
		public static final String TX = "TX";
		public static final String RXTX = "RXTX";
	}
	public static class flowctlEnum {
		public static final String OFF = "OFF";
		public static final String RX = "RX";
		public static final String TX = "TX";
		public static final String RXTX = "RXTX";
	}
	public static class lagtypeEnum {
		public static final String NODE = "NODE";
		public static final String CLUSTER = "CLUSTER";
	}
}
