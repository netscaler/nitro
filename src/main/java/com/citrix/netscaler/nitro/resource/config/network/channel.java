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

class channel_response extends base_response
{
	public channel[] channel;
}
/**
* Configuration for channel resource.
*/

public class channel extends base_resource
{
	private String id;
	private String[] ifnum;
	private String state;
	private String mode;
	private String conndistr;
	private String macdistr;
	private String lamac;
	private String speed;
	private String flowctl;
	private String hamonitor;
	private String tagall;
	private String trunk;
	private String ifalias;
	private Long throughput;
	private Long bandwidthhigh;
	private Long bandwidthnormal;
	private Long lrminthroughput;

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
	private String media;
	private String actspeed;
	private String duplex;
	private String actflowctl;
	private String lamode;
	private Long autoneg;
	private Long autonegresult;
	private Long tagged;
	private Long taggedany;
	private Long taggedautolearn;
	private Long hangdetect;
	private Long hangreset;
	private Long linkstate;
	private Long intfstate;
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
	private Long bdgmuted;
	private String vmac;
	private String vmac6;
	private Long reqthroughput;
	private Long actthroughput;
	private String backplane;
	private Long cleartime;
	private String lacpmode;
	private String lacptimeout;
	private Long lacpactorpriority;
	private Long lacpactorportno;
	private String lacppartnerstate;
	private String lacppartnertimeout;
	private String lacppartneraggregation;
	private String lacppartnerinsync;
	private String lacppartnercollecting;
	private String lacppartnerdistributing;
	private String lacppartnerdefaulted;
	private String lacppartnerexpired;
	private Long lacppartnerpriority;
	private String lacppartnersystemmac;
	private Long lacppartnersystempriority;
	private Long lacppartnerportno;
	private Long lacppartnerkey;
	private String lacpactoraggregation;
	private String lacpactorinsync;
	private String lacpactorcollecting;
	private String lacpactordistributing;
	private String lacpportmuxstate;
	private String lacpportrxstat;
	private String lacpportselectstate;
	private Long __count;

	/**
	* <pre>
	* ID for the LA channel or cluster LA channel to be created. Specify an LA channel in LA/x notation or cluster LA channel in CLA/x notation, where x can range from 1 to 4. Cannot be changed after the LA channel is created.
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* ID for the LA channel or cluster LA channel to be created. Specify an LA channel in LA/x notation or cluster LA channel in CLA/x notation, where x can range from 1 to 4. Cannot be changed after the LA channel is created.
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* Interfaces to be bound to the LA channel of a NetScaler appliance or to the LA channel of a cluster configuration.
For an LA channel of a NetScaler appliance, specify an interface in C/U notation (for example, 1/3). 
For an LA channel of a cluster configuration, specify an interface in N/C/U notation (for example, 2/1/3).
where C can take one of the following values:
* 0 - Indicates a management interface.
* 1 - Indicates a 1 Gbps port.
* 10 - Indicates a 10 Gbps port.
U is a unique integer for representing an interface in a particular port group.
N is the ID of the node to which an interface belongs in a cluster configuration.
Use spaces to separate multiple entries.
	* </pre>
	*/
	public void set_ifnum(String[] ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* Interfaces to be bound to the LA channel of a NetScaler appliance or to the LA channel of a cluster configuration.
For an LA channel of a NetScaler appliance, specify an interface in C/U notation (for example, 1/3). 
For an LA channel of a cluster configuration, specify an interface in N/C/U notation (for example, 2/1/3).
where C can take one of the following values:
* 0 - Indicates a management interface.
* 1 - Indicates a 1 Gbps port.
* 10 - Indicates a 10 Gbps port.
U is a unique integer for representing an interface in a particular port group.
N is the ID of the node to which an interface belongs in a cluster configuration.
Use spaces to separate multiple entries.
	* </pre>
	*/
	public String[] get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* Enable or disable the LA channel.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enable or disable the LA channel.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The initital mode for the LA channel.<br> Possible values = MANUAL, AUTO
	* </pre>
	*/
	public void set_mode(String mode) throws Exception{
		this.mode = mode;
	}

	/**
	* <pre>
	* The initital mode for the LA channel.<br> Possible values = MANUAL, AUTO
	* </pre>
	*/
	public String get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* The 'connection' distribution mode for the LA channel.<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public void set_conndistr(String conndistr) throws Exception{
		this.conndistr = conndistr;
	}

	/**
	* <pre>
	* The 'connection' distribution mode for the LA channel.<br> Possible values = DISABLED, ENABLED
	* </pre>
	*/
	public String get_conndistr() throws Exception {
		return this.conndistr;
	}

	/**
	* <pre>
	* The  'MAC' distribution mode for the LA channel.<br> Possible values = SOURCE, DESTINATION, BOTH
	* </pre>
	*/
	public void set_macdistr(String macdistr) throws Exception{
		this.macdistr = macdistr;
	}

	/**
	* <pre>
	* The  'MAC' distribution mode for the LA channel.<br> Possible values = SOURCE, DESTINATION, BOTH
	* </pre>
	*/
	public String get_macdistr() throws Exception {
		return this.macdistr;
	}

	/**
	* <pre>
	* MAC address for LA channels on VPX Platforms namely VPX on SDX,Xen,ESX.
	* </pre>
	*/
	public void set_lamac(String lamac) throws Exception{
		this.lamac = lamac;
	}

	/**
	* <pre>
	* MAC address for LA channels on VPX Platforms namely VPX on SDX,Xen,ESX.
	* </pre>
	*/
	public String get_lamac() throws Exception {
		return this.lamac;
	}

	/**
	* <pre>
	* Ethernet speed of the channel, in Mbps. If the speed of any bound interface is greater than or equal to the value set for this parameter, the state of the interface is UP. Otherwise, the state is INACTIVE. Bound Interfaces whose state is INACTIVE do not process any traffic.<br> Default value: AUTO<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public void set_speed(String speed) throws Exception{
		this.speed = speed;
	}

	/**
	* <pre>
	* Ethernet speed of the channel, in Mbps. If the speed of any bound interface is greater than or equal to the value set for this parameter, the state of the interface is UP. Otherwise, the state is INACTIVE. Bound Interfaces whose state is INACTIVE do not process any traffic.<br> Default value: AUTO<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public String get_speed() throws Exception {
		return this.speed;
	}

	/**
	* <pre>
	* Flow control for the LA channel.<br> Default value: OFF<br> Possible values = OFF, RX, TX, RXTX
	* </pre>
	*/
	public void set_flowctl(String flowctl) throws Exception{
		this.flowctl = flowctl;
	}

	/**
	* <pre>
	* Flow control for the LA channel.<br> Default value: OFF<br> Possible values = OFF, RX, TX, RXTX
	* </pre>
	*/
	public String get_flowctl() throws Exception {
		return this.flowctl;
	}

	/**
	* <pre>
	* In a High Availability (HA) configuration, monitor the LA channel for failure events. Failure of any LA channel that has HA MON enabled triggers HA failover.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_hamonitor(String hamonitor) throws Exception{
		this.hamonitor = hamonitor;
	}

	/**
	* <pre>
	* In a High Availability (HA) configuration, monitor the LA channel for failure events. Failure of any LA channel that has HA MON enabled triggers HA failover.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_hamonitor() throws Exception {
		return this.hamonitor;
	}

	/**
	* <pre>
	* Adds a four-byte 802.1q tag to every packet sent on this channel.  The ON setting applies tags for all VLANs that are bound to this channel. OFF applies the tag for all VLANs other than the native VLAN.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_tagall(String tagall) throws Exception{
		this.tagall = tagall;
	}

	/**
	* <pre>
	* Adds a four-byte 802.1q tag to every packet sent on this channel.  The ON setting applies tags for all VLANs that are bound to this channel. OFF applies the tag for all VLANs other than the native VLAN.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_tagall() throws Exception {
		return this.tagall;
	}

	/**
	* <pre>
	* This is deprecated by tagall.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_trunk(String trunk) throws Exception{
		this.trunk = trunk;
	}

	/**
	* <pre>
	* This is deprecated by tagall.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_trunk() throws Exception {
		return this.trunk;
	}

	/**
	* <pre>
	* Alias name for the LA channel. Used only to enhance readability. To perform any operations, you have to specify the LA channel ID.<br> Default value: " "<br> Maximum length =  31
	* </pre>
	*/
	public void set_ifalias(String ifalias) throws Exception{
		this.ifalias = ifalias;
	}

	/**
	* <pre>
	* Alias name for the LA channel. Used only to enhance readability. To perform any operations, you have to specify the LA channel ID.<br> Default value: " "<br> Maximum length =  31
	* </pre>
	*/
	public String get_ifalias() throws Exception {
		return this.ifalias;
	}

	/**
	* <pre>
	* Low threshold value for the throughput of the LA channel, in Mbps. In an HA configuration, failover is triggered if the LA channel has HA MON enabled and the throughput is below the specified threshold.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_throughput(long throughput) throws Exception {
		this.throughput = new Long(throughput);
	}

	/**
	* <pre>
	* Low threshold value for the throughput of the LA channel, in Mbps. In an HA configuration, failover is triggered if the LA channel has HA MON enabled and the throughput is below the specified threshold.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_throughput(Long throughput) throws Exception{
		this.throughput = throughput;
	}

	/**
	* <pre>
	* Low threshold value for the throughput of the LA channel, in Mbps. In an HA configuration, failover is triggered if the LA channel has HA MON enabled and the throughput is below the specified threshold.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_throughput() throws Exception {
		return this.throughput;
	}

	/**
	* <pre>
	* High threshold value for the bandwidth usage of the LA channel, in Mbps. The NetScaler appliance generates an SNMP trap message when the bandwidth usage of the LA channel is greater than or equal to the specified high threshold value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthhigh(long bandwidthhigh) throws Exception {
		this.bandwidthhigh = new Long(bandwidthhigh);
	}

	/**
	* <pre>
	* High threshold value for the bandwidth usage of the LA channel, in Mbps. The NetScaler appliance generates an SNMP trap message when the bandwidth usage of the LA channel is greater than or equal to the specified high threshold value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthhigh(Long bandwidthhigh) throws Exception{
		this.bandwidthhigh = bandwidthhigh;
	}

	/**
	* <pre>
	* High threshold value for the bandwidth usage of the LA channel, in Mbps. The NetScaler appliance generates an SNMP trap message when the bandwidth usage of the LA channel is greater than or equal to the specified high threshold value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_bandwidthhigh() throws Exception {
		return this.bandwidthhigh;
	}

	/**
	* <pre>
	* Normal threshold value for the bandwidth usage of the LA channel, in Mbps. When the bandwidth usage of the LA channel becomes less than or equal to the specified normal threshold after exceeding the high threshold, the NetScaler appliance generates an SNMP trap message to indicate that the bandwidth usage has returned to normal.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthnormal(long bandwidthnormal) throws Exception {
		this.bandwidthnormal = new Long(bandwidthnormal);
	}

	/**
	* <pre>
	* Normal threshold value for the bandwidth usage of the LA channel, in Mbps. When the bandwidth usage of the LA channel becomes less than or equal to the specified normal threshold after exceeding the high threshold, the NetScaler appliance generates an SNMP trap message to indicate that the bandwidth usage has returned to normal.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthnormal(Long bandwidthnormal) throws Exception{
		this.bandwidthnormal = bandwidthnormal;
	}

	/**
	* <pre>
	* Normal threshold value for the bandwidth usage of the LA channel, in Mbps. When the bandwidth usage of the LA channel becomes less than or equal to the specified normal threshold after exceeding the high threshold, the NetScaler appliance generates an SNMP trap message to indicate that the bandwidth usage has returned to normal.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_bandwidthnormal() throws Exception {
		return this.bandwidthnormal;
	}

	/**
	* <pre>
	* Minimum required throughput for a channel where we require Link Redundancy. When throughput falls below the threshold, the subset of interfaces which can give maximum throughput will become active When configured in HA pair, this will work along with the throughput parameter set. If lrMinThroughput can be achieved Link Failover will be attempted before Node Failover.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_lrminthroughput(long lrminthroughput) throws Exception {
		this.lrminthroughput = new Long(lrminthroughput);
	}

	/**
	* <pre>
	* Minimum required throughput for a channel where we require Link Redundancy. When throughput falls below the threshold, the subset of interfaces which can give maximum throughput will become active When configured in HA pair, this will work along with the throughput parameter set. If lrMinThroughput can be achieved Link Failover will be attempted before Node Failover.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_lrminthroughput(Long lrminthroughput) throws Exception{
		this.lrminthroughput = lrminthroughput;
	}

	/**
	* <pre>
	* Minimum required throughput for a channel where we require Link Redundancy. When throughput falls below the threshold, the subset of interfaces which can give maximum throughput will become active When configured in HA pair, this will work along with the throughput parameter set. If lrMinThroughput can be achieved Link Failover will be attempted before Node Failover.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_lrminthroughput() throws Exception {
		return this.lrminthroughput;
	}

	/**
	* <pre>
	* LA channel name in form LA/x, where x is channel ID, which ranges from 1 to 4.
	* </pre>
	*/
	public String get_devicename() throws Exception {
		return this.devicename;
	}

	/**
	* <pre>
	* Unit number of the channel. This is an internal reference number that the NetScaler uses to identify the channel.
	* </pre>
	*/
	public Long get_unit() throws Exception {
		return this.unit;
	}

	/**
	* <pre>
	* The IEEE standard that the channel is based on.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* Flags of this channel.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* MTU of the channel. This is the maximum frame size that the channel can process.
	* </pre>
	*/
	public Long get_mtu() throws Exception {
		return this.mtu;
	}

	/**
	* <pre>
	* Native VLAN of the channel.
	* </pre>
	*/
	public Long get_vlan() throws Exception {
		return this.vlan;
	}

	/**
	* <pre>
	* MAC address of the channel.
	* </pre>
	*/
	public String get_mac() throws Exception {
		return this.mac;
	}

	/**
	* <pre>
	* Duration for which the channel is UP. (Example: 3 hours 1 minute 1 second). This value is reset when the channel state changes to DOWN.
	* </pre>
	*/
	public Long get_uptime() throws Exception {
		return this.uptime;
	}

	/**
	* <pre>
	* Duration for which the channel is DOWN. (Example: 3 hours 1 minute 1 second). This value is reset when the channel state changes to UP.
	* </pre>
	*/
	public Long get_downtime() throws Exception {
		return this.downtime;
	}

	/**
	* <pre>
	* Requested media setting for this channel. Since there is no media associated with LA, the displayed values carry no significance.<br> Possible values = AUTO, UTP, FIBER
	* </pre>
	*/
	public String get_reqmedia() throws Exception {
		return this.reqmedia;
	}

	/**
	* <pre>
	* Requested speed setting for this channel. Since no media are associated with LA, this speed is used to determine the threshold for the slave interfaces. If the speed of the member interface is less than the requested speed, that interface is considered inactive.<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public String get_reqspeed() throws Exception {
		return this.reqspeed;
	}

	/**
	* <pre>
	* Requested duplex setting for this channel. Since no media are associated with LA, the displayed values carry no significance.<br> Possible values = AUTO, HALF, FULL
	* </pre>
	*/
	public String get_reqduplex() throws Exception {
		return this.reqduplex;
	}

	/**
	* <pre>
	* Requested flow control setting for this channel. Since no media are associated with LA, the displayed values carry no significance.<br> Possible values = OFF, RX, TX, RXTX
	* </pre>
	*/
	public String get_reqflowcontrol() throws Exception {
		return this.reqflowcontrol;
	}

	/**
	* <pre>
	* Requested media setting for this interface.<br> Possible values = AUTO, UTP, FIBER
	* </pre>
	*/
	public String get_media() throws Exception {
		return this.media;
	}

	/**
	* <pre>
	* Actual speed setting for this channel.<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public String get_actspeed() throws Exception {
		return this.actspeed;
	}

	/**
	* <pre>
	* Actualduplex setting for this interface.<br> Possible values = AUTO, HALF, FULL
	* </pre>
	*/
	public String get_duplex() throws Exception {
		return this.duplex;
	}

	/**
	* <pre>
	* Actual flow control setting for this channel.<br> Possible values = OFF, RX, TX, RXTX
	* </pre>
	*/
	public String get_actflowctl() throws Exception {
		return this.actflowctl;
	}

	/**
	* <pre>
	* The  mode(AUTO/MANNUAL) for the LA channel.<br> Possible values = MANUAL, AUTO
	* </pre>
	*/
	public String get_lamode() throws Exception {
		return this.lamode;
	}

	/**
	* <pre>
	* Requested auto negotiation setting for this channel. Since no media are associated with LA, this setting has no effect.
	* </pre>
	*/
	public Long get_autoneg() throws Exception {
		return this.autoneg;
	}

	/**
	* <pre>
	* Actual  auto negotiation setting for this channel.
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
	* Channel setting to accept/drop all tagged packets.
	* </pre>
	*/
	public Long get_taggedany() throws Exception {
		return this.taggedany;
	}

	/**
	* <pre>
	* Dynaminc vlan membership on this channel.
	* </pre>
	*/
	public Long get_taggedautolearn() throws Exception {
		return this.taggedautolearn;
	}

	/**
	* <pre>
	* Hang detect for this channel.
	* </pre>
	*/
	public Long get_hangdetect() throws Exception {
		return this.hangdetect;
	}

	/**
	* <pre>
	* Hang reset for this channel.
	* </pre>
	*/
	public Long get_hangreset() throws Exception {
		return this.hangreset;
	}

	/**
	* <pre>
	* The current state of the link associated with the interface. For logical interfaces (LA), the state of the link is dependent on the state of the slave interfaces. For the link to be UP at least one of the slave interfaces needs to be UP.
	* </pre>
	*/
	public Long get_linkstate() throws Exception {
		return this.linkstate;
	}

	/**
	* <pre>
	* Current state of the specified interface.  The interface state set to UP only if the link state is UP and administrative state is ENABLED.
	* </pre>
	*/
	public Long get_intfstate() throws Exception {
		return this.intfstate;
	}

	/**
	* <pre>
	* Number of bytes received by all the slave interfaces of the channel since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_rxpackets() throws Exception {
		return this.rxpackets;
	}

	/**
	* <pre>
	* Number of packets received by all member interfaces since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_rxbytes() throws Exception {
		return this.rxbytes;
	}

	/**
	* <pre>
	* Number of inbound packets dropped by the hardware of the slave interfaces since the NetScaler appliance was started or the interface statistics were cleared. Possible causes of dropped packets are CRC, length (undersize or oversize), and alignment errors.
	* </pre>
	*/
	public Long get_rxerrors() throws Exception {
		return this.rxerrors;
	}

	/**
	* <pre>
	* Number of inbound packets dropped by the channel's slave interfaces. Commonly dropped packets are multicast frames, spanning tree BPDUs, packets destined to a MAC not owned by the NetScaler when L2 mode is disabled, or packets tagged for a VLAN that is not bound to the interface.  In most healthy networks, this statistic increments at a steady rate regardless of traffic load.  A sharp spike in dropped packets generally indicates an issue with connected L2 switches, such as a forwarding database overflow resulting in packets being broadcast on all ports.
	* </pre>
	*/
	public Long get_rxdrops() throws Exception {
		return this.rxdrops;
	}

	/**
	* <pre>
	* Number of packets transmitted by slave interfaces of a channel since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_txpackets() throws Exception {
		return this.txpackets;
	}

	/**
	* <pre>
	* Number of bytes transmitted by slave interfaces of a channel since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_txbytes() throws Exception {
		return this.txbytes;
	}

	/**
	* <pre>
	* Number of outbound packets dropped by the hardware of a channel's slave interfaces since the NetScaler appliance was started or the interface statistics were cleared. Possible causes of dropped packets are length (undersize or oversize) errors and lack of resources.
	* </pre>
	*/
	public Long get_txerrors() throws Exception {
		return this.txerrors;
	}

	/**
	* <pre>
	* Number of packets dropped in transmission by a channel's slave interfaces for one of the following reasons:
						(1) VLAN mismatch.
						(2) Oversized packets.
						(3) Interface congestion.
						(4) Loopback packets sent on non-loopback interface.
	* </pre>
	*/
	public Long get_txdrops() throws Exception {
		return this.txdrops;
	}

	/**
	* <pre>
	* Number of error-free inbound packets discarded by a channel's slave interfaces because of a lack of resources (for example, insufficient receive buffers).
	* </pre>
	*/
	public Long get_indisc() throws Exception {
		return this.indisc;
	}

	/**
	* <pre>
	* Number of error-free outbound packets discarded by a channel's slave interfaces because of a lack of resources. This statistic is not available on:
						(1) 10G ports of NetScaler MPX 12500/12500/15500-10G  platforms.
						(2) 10G data ports on NetScaler MPX 17500/19500/21500 platforms.
	* </pre>
	*/
	public Long get_outdisc() throws Exception {
		return this.outdisc;
	}

	/**
	* <pre>
	* Number of times flow control is performed on a channel's slave interfaces because of pause frames.
	* </pre>
	*/
	public Long get_fctls() throws Exception {
		return this.fctls;
	}

	/**
	* <pre>
	* Number of hangs that occurred on the channel's slave interfaces.
	* </pre>
	*/
	public Long get_hangs() throws Exception {
		return this.hangs;
	}

	/**
	* <pre>
	* Number of status stalls that occurred on the channel's slave interfaces.
	* </pre>
	*/
	public Long get_stsstalls() throws Exception {
		return this.stsstalls;
	}

	/**
	* <pre>
	* Number of Tx stalls happened that occurred on the channel's slave interfaces.
	* </pre>
	*/
	public Long get_txstalls() throws Exception {
		return this.txstalls;
	}

	/**
	* <pre>
	* Number of Rx stalls that occurred on the channel's slave interfaces.
	* </pre>
	*/
	public Long get_rxstalls() throws Exception {
		return this.rxstalls;
	}

	/**
	* <pre>
	* Number of times a channel's slave interfaces stopped transmitting and receiving packets because of MAC moves between ports.
	* </pre>
	*/
	public Long get_bdgmuted() throws Exception {
		return this.bdgmuted;
	}

	/**
	* <pre>
	* Virtual MAC of this channel.
	* </pre>
	*/
	public String get_vmac() throws Exception {
		return this.vmac;
	}

	/**
	* <pre>
	* Virtual MAC for IPv6 on this interface.
	* </pre>
	*/
	public String get_vmac6() throws Exception {
		return this.vmac6;
	}

	/**
	* <pre>
	* Minimum required throughput for an interface. Failover is triggered if the operating throughput of a Link Aggregation (LA) channel for which HAMON is ON falls below this value.<br> Minimum value =  0<br> Maximum value =  80000
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
	* The cluster backplane status of the LA. If the status is enabled, the LA is part of the cluster backplane. By default, the backplane status is disabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_backplane() throws Exception {
		return this.backplane;
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
	* The LACP mode of the specified interface. The possible values are:
						 1. Active: A port in active mode generates LACP protocol messages on a regular basis, regardless of any need expressed by its partner to receive them.
						 2. Passive: A port in passive mode generally does not transmit LACP messages unless its partner is in the active mode; that is, it does not speak unless spoken to.
						 3. Disabled: Removes the interface from the LA channel. If this is only interface in the LA channel, the LA channel is also deleted.
						 .<br> Possible values = DISABLED, ACTIVE, PASSIVE
	* </pre>
	*/
	public String get_lacpmode() throws Exception {
		return this.lacpmode;
	}

	/**
	* <pre>
	* Time to wait for the LACPDU.  If a LACPDU is not received within this interval, the NetScaler markes the link partner port as DOWN. Possible values: Long and Short. Long lacptimeout is 90 sec and Short LACP timeout is 3 sec.<br> Possible values = LONG, SHORT
	* </pre>
	*/
	public String get_lacptimeout() throws Exception {
		return this.lacptimeout;
	}

	/**
	* <pre>
	* LACP Actor Priority. A LACP port priority is configured on each port using LACP. LACP uses the port priority with the port number to form the port identifier. The port priority determines which ports should be put in standby mode when there is a hardware limitation that prevents all compatible ports from aggregating.
	* </pre>
	*/
	public Long get_lacpactorpriority() throws Exception {
		return this.lacpactorpriority;
	}

	/**
	* <pre>
	* LACP Actor port number. LACP uses the port priority with the port number to form the port identifier.
	* </pre>
	*/
	public Long get_lacpactorportno() throws Exception {
		return this.lacpactorportno;
	}

	/**
	* <pre>
	* LACP Partner State. Whether the port is in Active or Passive negotiating state.<br> Possible values = MANUAL, AUTO
	* </pre>
	*/
	public String get_lacppartnerstate() throws Exception {
		return this.lacppartnerstate;
	}

	/**
	* <pre>
	* The timeout value for the information revieved in LACPDUs. It can have values as SHORT or LONG. The SHORT timeout is 3s and the LONG timeout is 90s.<br> Possible values = LONG, SHORT
	* </pre>
	*/
	public String get_lacppartnertimeout() throws Exception {
		return this.lacppartnertimeout;
	}

	/**
	* <pre>
	* The Aggregation flag indicates that the participant will allow the link to be used as part of an aggregate. Otherwise the link is to be used as an individual link, i.e. not aggregated with any other.<br> Possible values = NS_EMPTY_STR, AGG
	* </pre>
	*/
	public String get_lacppartneraggregation() throws Exception {
		return this.lacppartneraggregation;
	}

	/**
	* <pre>
	* The Synchronization flag indicates that the transmitting participant.s mux component is in sync with the system id and key information transmitted.<br> Possible values = NS_EMPTY_STR, SYNC
	* </pre>
	*/
	public String get_lacppartnerinsync() throws Exception {
		return this.lacppartnerinsync;
	}

	/**
	* <pre>
	* The Collecting flag indicates that the participant.s collector, i.e. the reception component of the mux, is definitely on. If set the flag communicates collecting.<br> Possible values = NS_EMPTY_STR, COLLECTING
	* </pre>
	*/
	public String get_lacppartnercollecting() throws Exception {
		return this.lacppartnercollecting;
	}

	/**
	* <pre>
	* The Distributing flag indicates that the participant.s distributor is not definitely off. If reset the flag indicates not distributing.<br> Possible values = NS_EMPTY_STR, DISTRIBUTING
	* </pre>
	*/
	public String get_lacppartnerdistributing() throws Exception {
		return this.lacppartnerdistributing;
	}

	/**
	* <pre>
	* If the timer expires in the Expired state, the Receive Machine enters the Defaulted state.<br> Possible values = NS_EMPTY_STR, DEFAULTED
	* </pre>
	*/
	public String get_lacppartnerdefaulted() throws Exception {
		return this.lacppartnerdefaulted;
	}

	/**
	* <pre>
	* If the LACPDUs are received for timeout period, the Receive Machine enters the Expired state and the timer is restarted with the timeout value of SHORT timeout.<br> Possible values = NS_EMPTY_STR, EXPIRED
	* </pre>
	*/
	public String get_lacppartnerexpired() throws Exception {
		return this.lacppartnerexpired;
	}

	/**
	* <pre>
	* LACP Partner Priority. A LACP port priority is configured on each port using LACP. LACP uses the port priority with the port number to form the port identifier. 
					The port priority determines which ports should be put in standby mode when there is a hardware limitation that prevents all compatible ports from aggregating.
	* </pre>
	*/
	public Long get_lacppartnerpriority() throws Exception {
		return this.lacppartnerpriority;
	}

	/**
	* <pre>
	* LACP Partner System MAC.
	* </pre>
	*/
	public String get_lacppartnersystemmac() throws Exception {
		return this.lacppartnersystemmac;
	}

	/**
	* <pre>
	* LACP Partner System Priority. The LACP partner's system priority. The values for the priority range from 0 to 65535. The lower the value, the higher the system priority. The switch with the lower system priority value determines which links between LACP partner are active and which are in the standby for each LACP Channel.
	* </pre>
	*/
	public Long get_lacppartnersystempriority() throws Exception {
		return this.lacppartnersystempriority;
	}

	/**
	* <pre>
	* LACP Partner Port number. LACP uses the port priority with the port number to form the port identifier.
	* </pre>
	*/
	public Long get_lacppartnerportno() throws Exception {
		return this.lacppartnerportno;
	}

	/**
	* <pre>
	* LACP Partner Key. The LACP key used by the partner port.
	* </pre>
	*/
	public Long get_lacppartnerkey() throws Exception {
		return this.lacppartnerkey;
	}

	/**
	* <pre>
	* The Aggregation flag indicates that the participant will allow the link to be used as part of an aggregate. Otherwise the link is to be used as an individual link, i.e. not aggregated with any other.<br> Possible values = NS_EMPTY_STR, AGG
	* </pre>
	*/
	public String get_lacpactoraggregation() throws Exception {
		return this.lacpactoraggregation;
	}

	/**
	* <pre>
	* The Synchronization flag indicates that the transmitting participant.s mux component is in sync with the system id and key information transmitted.<br> Possible values = NS_EMPTY_STR, SYNC
	* </pre>
	*/
	public String get_lacpactorinsync() throws Exception {
		return this.lacpactorinsync;
	}

	/**
	* <pre>
	* The Collecting flag indicates that the participant.s collector, i.e. the reception component of the mux, is definitely on. If set the flag communicates collecting.<br> Possible values = NS_EMPTY_STR, COLLECTING
	* </pre>
	*/
	public String get_lacpactorcollecting() throws Exception {
		return this.lacpactorcollecting;
	}

	/**
	* <pre>
	* The Distributing flag indicates that the participant.s distributor is not definitely off. If reset the flag indicates not distributing.<br> Possible values = NS_EMPTY_STR, DISTRIBUTING
	* </pre>
	*/
	public String get_lacpactordistributing() throws Exception {
		return this.lacpactordistributing;
	}

	/**
	* <pre>
	* LACP Port MUX state. The state of the MUX control machine. The  Mux Control Machine attaches the physical port to an aggregate port, using the Selection Logic to choose an appropriate port, and turns the distributor and collector for the physical port on or off as required by protocol	information.<br> Possible values = DETACHED, WAITING, ATTACHED, COLLECTING, DISTRIBUTING
	* </pre>
	*/
	public String get_lacpportmuxstate() throws Exception {
		return this.lacpportmuxstate;
	}

	/**
	* <pre>
	* LACP Port RX state. The state of the Receive machine. The Receive Machine maintains partner information, recording protocol information from LACPDUs sent by remote partner(s). Received information is subject to a timeout, and if sufficient time elapses the receive machine will revert to using default partner information.<br> Possible values = INIT, PORT_DISABLED, LACP_DISABLED, EXPIRED, DEFAULTED, CURRENT
	* </pre>
	*/
	public String get_lacpportrxstat() throws Exception {
		return this.lacpportrxstat;
	}

	/**
	* <pre>
	* LACP Port SELECT state. The state of the SELECT state machine, It could be SELECTED or UNSELECTED.<br> Possible values = UNSELECTED, SELECTED, STANDBY
	* </pre>
	*/
	public String get_lacpportselectstate() throws Exception {
		return this.lacpportselectstate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		channel_response result = (channel_response) service.get_payload_formatter().string_to_resource(channel_response.class, response);
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
		return result.channel;
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
	* Use this API to add channel.
	*/
	public static base_response add(nitro_service client, channel resource) throws Exception {
		channel addresource = new channel();
		addresource.id = resource.id;
		addresource.ifnum = resource.ifnum;
		addresource.state = resource.state;
		addresource.mode = resource.mode;
		addresource.conndistr = resource.conndistr;
		addresource.macdistr = resource.macdistr;
		addresource.lamac = resource.lamac;
		addresource.speed = resource.speed;
		addresource.flowctl = resource.flowctl;
		addresource.hamonitor = resource.hamonitor;
		addresource.tagall = resource.tagall;
		addresource.trunk = resource.trunk;
		addresource.ifalias = resource.ifalias;
		addresource.throughput = resource.throughput;
		addresource.bandwidthhigh = resource.bandwidthhigh;
		addresource.bandwidthnormal = resource.bandwidthnormal;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add channel resources.
	*/
	public static base_responses add(nitro_service client, channel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			channel addresources[] = new channel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new channel();
				addresources[i].id = resources[i].id;
				addresources[i].ifnum = resources[i].ifnum;
				addresources[i].state = resources[i].state;
				addresources[i].mode = resources[i].mode;
				addresources[i].conndistr = resources[i].conndistr;
				addresources[i].macdistr = resources[i].macdistr;
				addresources[i].lamac = resources[i].lamac;
				addresources[i].speed = resources[i].speed;
				addresources[i].flowctl = resources[i].flowctl;
				addresources[i].hamonitor = resources[i].hamonitor;
				addresources[i].tagall = resources[i].tagall;
				addresources[i].trunk = resources[i].trunk;
				addresources[i].ifalias = resources[i].ifalias;
				addresources[i].throughput = resources[i].throughput;
				addresources[i].bandwidthhigh = resources[i].bandwidthhigh;
				addresources[i].bandwidthnormal = resources[i].bandwidthnormal;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete channel of given name.
	*/
	public static base_response delete(nitro_service client, String id) throws Exception {
		channel deleteresource = new channel();
		deleteresource.id = id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete channel.
	*/
	public static base_response delete(nitro_service client, channel resource) throws Exception {
		channel deleteresource = new channel();
		deleteresource.id = resource.id;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete channel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String id[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			channel deleteresources[] = new channel[id.length];
			for (int i=0;i<id.length;i++){
				deleteresources[i] = new channel();
				deleteresources[i].id = id[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete channel resources.
	*/
	public static base_responses delete(nitro_service client, channel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			channel deleteresources[] = new channel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new channel();
				deleteresources[i].id = resources[i].id;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update channel.
	*/
	public static base_response update(nitro_service client, channel resource) throws Exception {
		channel updateresource = new channel();
		updateresource.id = resource.id;
		updateresource.state = resource.state;
		updateresource.mode = resource.mode;
		updateresource.conndistr = resource.conndistr;
		updateresource.macdistr = resource.macdistr;
		updateresource.lamac = resource.lamac;
		updateresource.speed = resource.speed;
		updateresource.flowctl = resource.flowctl;
		updateresource.hamonitor = resource.hamonitor;
		updateresource.tagall = resource.tagall;
		updateresource.trunk = resource.trunk;
		updateresource.ifalias = resource.ifalias;
		updateresource.throughput = resource.throughput;
		updateresource.lrminthroughput = resource.lrminthroughput;
		updateresource.bandwidthhigh = resource.bandwidthhigh;
		updateresource.bandwidthnormal = resource.bandwidthnormal;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update channel resources.
	*/
	public static base_responses update(nitro_service client, channel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			channel updateresources[] = new channel[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new channel();
				updateresources[i].id = resources[i].id;
				updateresources[i].state = resources[i].state;
				updateresources[i].mode = resources[i].mode;
				updateresources[i].conndistr = resources[i].conndistr;
				updateresources[i].macdistr = resources[i].macdistr;
				updateresources[i].lamac = resources[i].lamac;
				updateresources[i].speed = resources[i].speed;
				updateresources[i].flowctl = resources[i].flowctl;
				updateresources[i].hamonitor = resources[i].hamonitor;
				updateresources[i].tagall = resources[i].tagall;
				updateresources[i].trunk = resources[i].trunk;
				updateresources[i].ifalias = resources[i].ifalias;
				updateresources[i].throughput = resources[i].throughput;
				updateresources[i].lrminthroughput = resources[i].lrminthroughput;
				updateresources[i].bandwidthhigh = resources[i].bandwidthhigh;
				updateresources[i].bandwidthnormal = resources[i].bandwidthnormal;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of channel resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, channel resource, String[] args) throws Exception{
		channel unsetresource = new channel();
		unsetresource.id = resource.id;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of channel resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String id[], String args[]) throws Exception {
		base_responses result = null;
		if (id != null && id.length > 0) {
			channel unsetresources[] = new channel[id.length];
			for (int i=0;i<id.length;i++){
				unsetresources[i] = new channel();
				unsetresources[i].id = id[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of channel resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, channel resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			channel unsetresources[] = new channel[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new channel();
				unsetresources[i].id = resources[i].id;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the channel resources that are configured on netscaler.
	*/
	public static channel[] get(nitro_service service) throws Exception{
		channel obj = new channel();
		channel[] response = (channel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the channel resources that are configured on netscaler.
	*/
	public static channel[] get(nitro_service service, options option) throws Exception{
		channel obj = new channel();
		channel[] response = (channel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch channel resource of given name .
	*/
	public static channel get(nitro_service service, String id) throws Exception{
		channel obj = new channel();
		obj.set_id(id);
		channel response = (channel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch channel resources of given names .
	*/
	public static channel[] get(nitro_service service, String id[]) throws Exception{
		if (id !=null && id.length>0) {
			channel response[] = new channel[id.length];
			channel obj[] = new channel[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new channel();
				obj[i].set_id(id[i]);
				response[i] = (channel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of channel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static channel[] get_filtered(nitro_service service, String filter) throws Exception{
		channel obj = new channel();
		options option = new options();
		option.set_filter(filter);
		channel[] response = (channel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of channel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static channel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		channel obj = new channel();
		options option = new options();
		option.set_filter(filter);
		channel[] response = (channel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the channel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		channel obj = new channel();
		options option = new options();
		option.set_count(true);
		channel[] response = (channel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of channel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		channel obj = new channel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		channel[] response = (channel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of channel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		channel obj = new channel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		channel[] response = (channel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class lacpportselectstateEnum {
		public static final String UNSELECTED = "UNSELECTED";
		public static final String SELECTED = "SELECTED";
		public static final String STANDBY = "STANDBY";
	}
	public static class lamodeEnum {
		public static final String MANUAL = "MANUAL";
		public static final String AUTO = "AUTO";
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
	public static class lacpportrxstatEnum {
		public static final String INIT = "INIT";
		public static final String PORT_DISABLED = "PORT_DISABLED";
		public static final String LACP_DISABLED = "LACP_DISABLED";
		public static final String EXPIRED = "EXPIRED";
		public static final String DEFAULTED = "DEFAULTED";
		public static final String CURRENT = "CURRENT";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class lacppartnerinsyncEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String SYNC = "SYNC";
	}
	public static class hamonitorEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class mediaEnum {
		public static final String AUTO = "AUTO";
		public static final String UTP = "UTP";
		public static final String FIBER = "FIBER";
	}
	public static class lacppartnerdistributingEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String DISTRIBUTING = "DISTRIBUTING";
	}
	public static class lacppartnercollectingEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String COLLECTING = "COLLECTING";
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
	public static class lacppartnertimeoutEnum {
		public static final String LONG = "LONG";
		public static final String SHORT = "SHORT";
	}
	public static class lacppartnerexpiredEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String EXPIRED = "EXPIRED";
	}
	public static class macdistrEnum {
		public static final String SOURCE = "SOURCE";
		public static final String DESTINATION = "DESTINATION";
		public static final String BOTH = "BOTH";
	}
	public static class lacppartnerstateEnum {
		public static final String MANUAL = "MANUAL";
		public static final String AUTO = "AUTO";
	}
	public static class lacpportmuxstateEnum {
		public static final String DETACHED = "DETACHED";
		public static final String WAITING = "WAITING";
		public static final String ATTACHED = "ATTACHED";
		public static final String COLLECTING = "COLLECTING";
		public static final String DISTRIBUTING = "DISTRIBUTING";
	}
	public static class lacpactordistributingEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String DISTRIBUTING = "DISTRIBUTING";
	}
	public static class lacpactorinsyncEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String SYNC = "SYNC";
	}
	public static class lacppartnerdefaultedEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String DEFAULTED = "DEFAULTED";
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
	public static class lacppartneraggregationEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String AGG = "AGG";
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
	public static class lacpactorcollectingEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String COLLECTING = "COLLECTING";
	}
	public static class lacpactoraggregationEnum {
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String AGG = "AGG";
	}
	public static class flowctlEnum {
		public static final String OFF = "OFF";
		public static final String RX = "RX";
		public static final String TX = "TX";
		public static final String RXTX = "RXTX";
	}
}
