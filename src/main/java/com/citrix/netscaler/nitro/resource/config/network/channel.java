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
	private String speed;
	private String flowctl;
	private String hamonitor;
	private String tagall;
	private String trunk;
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
	private String media;
	private String actspeed;
	private String duplex;
	private String actflowctl;
	private Long autoneg;
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
	private Long bdgmuted;
	private String vmac;
	private String vmac6;
	private Long reqthroughput;
	private Long actthroughput;
	private String backplane;
	private Long cleartime;
	private Long __count;

	/**
	* <pre>
	* LA channel name (in form LA/* or CLA/* for Cluster LA).
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* LA channel name (in form LA/* or CLA/* for Cluster LA).
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The interfaces to be bound to Link Aggregate channel.
	* </pre>
	*/
	public void set_ifnum(String[] ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* The interfaces to be bound to Link Aggregate channel.
	* </pre>
	*/
	public String[] get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* The initial state for the LA channel.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The initial state for the LA channel.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
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
	* The speed for the LA channel.<br> Default value: NSA_DVC_SPEED_AUTO<br> Possible values = AUTO, 10, 100, 1000, 10000
	* </pre>
	*/
	public void set_speed(String speed) throws Exception{
		this.speed = speed;
	}

	/**
	* <pre>
	* The speed for the LA channel.<br> Default value: NSA_DVC_SPEED_AUTO<br> Possible values = AUTO, 10, 100, 1000, 10000
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
	* HA monitoring for the LA channel.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_hamonitor(String hamonitor) throws Exception{
		this.hamonitor = hamonitor;
	}

	/**
	* <pre>
	* HA monitoring for the LA channel.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_hamonitor() throws Exception {
		return this.hamonitor;
	}

	/**
	* <pre>
	* The appliance adds a four-byte 802.1q tag to every packet sent on this channel.  ON applies tags for all the VLANs that are bound to this channel. OFF, applies the tag for all VLANs other than the native VLAN.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_tagall(String tagall) throws Exception{
		this.tagall = tagall;
	}

	/**
	* <pre>
	* The appliance adds a four-byte 802.1q tag to every packet sent on this channel.  ON applies tags for all the VLANs that are bound to this channel. OFF, applies the tag for all VLANs other than the native VLAN.<br> Default value: OFF<br> Possible values = ON, OFF
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
	* The alias name for the channel.<br> Default value: " "<br> Maximum length =  31
	* </pre>
	*/
	public void set_ifalias(String ifalias) throws Exception{
		this.ifalias = ifalias;
	}

	/**
	* <pre>
	* The alias name for the channel.<br> Default value: " "<br> Maximum length =  31
	* </pre>
	*/
	public String get_ifalias() throws Exception {
		return this.ifalias;
	}

	/**
	* <pre>
	* Minimum required throughput for the interface.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_throughput(long throughput) throws Exception {
		this.throughput = new Long(throughput);
	}

	/**
	* <pre>
	* Minimum required throughput for the interface.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_throughput(Long throughput) throws Exception{
		this.throughput = throughput;
	}

	/**
	* <pre>
	* Minimum required throughput for the interface.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_throughput() throws Exception {
		return this.throughput;
	}

	/**
	* <pre>
	* High threshold, in Mbps, for bandwidth usage by the interface. A trap is sent if bandwidth usage by the interface crosses this limit.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthhigh(long bandwidthhigh) throws Exception {
		this.bandwidthhigh = new Long(bandwidthhigh);
	}

	/**
	* <pre>
	* High threshold, in Mbps, for bandwidth usage by the interface. A trap is sent if bandwidth usage by the interface crosses this limit.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthhigh(Long bandwidthhigh) throws Exception{
		this.bandwidthhigh = bandwidthhigh;
	}

	/**
	* <pre>
	* High threshold, in Mbps, for bandwidth usage by the interface. A trap is sent if bandwidth usage by the interface crosses this limit.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_bandwidthhigh() throws Exception {
		return this.bandwidthhigh;
	}

	/**
	* <pre>
	* Normal threshold, in Mbps, for bandwidth usage by the interface. A trap is sent if bandwidth usage by the interface returns to this value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthnormal(long bandwidthnormal) throws Exception {
		this.bandwidthnormal = new Long(bandwidthnormal);
	}

	/**
	* <pre>
	* Normal threshold, in Mbps, for bandwidth usage by the interface. A trap is sent if bandwidth usage by the interface returns to this value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public void set_bandwidthnormal(Long bandwidthnormal) throws Exception{
		this.bandwidthnormal = bandwidthnormal;
	}

	/**
	* <pre>
	* Normal threshold, in Mbps, for bandwidth usage by the interface. A trap is sent if bandwidth usage by the interface returns to this value.<br> Minimum value =  0<br> Maximum value =  80000
	* </pre>
	*/
	public Long get_bandwidthnormal() throws Exception {
		return this.bandwidthnormal;
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
		updateresource.speed = resource.speed;
		updateresource.flowctl = resource.flowctl;
		updateresource.hamonitor = resource.hamonitor;
		updateresource.tagall = resource.tagall;
		updateresource.trunk = resource.trunk;
		updateresource.ifalias = resource.ifalias;
		updateresource.throughput = resource.throughput;
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
				updateresources[i].speed = resources[i].speed;
				updateresources[i].flowctl = resources[i].flowctl;
				updateresources[i].hamonitor = resources[i].hamonitor;
				updateresources[i].tagall = resources[i].tagall;
				updateresources[i].trunk = resources[i].trunk;
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
	* Use this API to unset the properties of channel resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String id, String args[]) throws Exception {
		channel unsetresource = new channel();
		unsetresource.id = id;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of channel resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, channel resource, String[] args) throws Exception{
		channel unsetresource = new channel();
		unsetresource.id = resource.id;
		unsetresource.state = resource.state;
		unsetresource.mode = resource.mode;
		unsetresource.conndistr = resource.conndistr;
		unsetresource.macdistr = resource.macdistr;
		unsetresource.speed = resource.speed;
		unsetresource.flowctl = resource.flowctl;
		unsetresource.hamonitor = resource.hamonitor;
		unsetresource.tagall = resource.tagall;
		unsetresource.trunk = resource.trunk;
		unsetresource.ifalias = resource.ifalias;
		unsetresource.throughput = resource.throughput;
		unsetresource.bandwidthhigh = resource.bandwidthhigh;
		unsetresource.bandwidthnormal = resource.bandwidthnormal;
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
				unsetresources[i].state = resources[i].state;
				unsetresources[i].mode = resources[i].mode;
				unsetresources[i].conndistr = resources[i].conndistr;
				unsetresources[i].macdistr = resources[i].macdistr;
				unsetresources[i].speed = resources[i].speed;
				unsetresources[i].flowctl = resources[i].flowctl;
				unsetresources[i].hamonitor = resources[i].hamonitor;
				unsetresources[i].tagall = resources[i].tagall;
				unsetresources[i].trunk = resources[i].trunk;
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
	public static class hamonitorEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class mediaEnum {
		public static final String AUTO = "AUTO";
		public static final String UTP = "UTP";
		public static final String FIBER = "FIBER";
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
	public static class macdistrEnum {
		public static final String SOURCE = "SOURCE";
		public static final String DESTINATION = "DESTINATION";
		public static final String BOTH = "BOTH";
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
	public static class tagallEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class trunkEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
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
}
