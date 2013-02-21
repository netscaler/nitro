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

package com.citrix.netscaler.nitro.resource.stat.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class Interface_response extends base_response
{
	public Interface_stats[] Interface;
}
/**
* Statistics for interface resource.
*/

public class Interface_stats extends base_resource
{
	private String id;
	private String curintfstate;
	private String curlinkuptime;
	private String curlinkdowntime;
	private Long totrxbytes;
	private Long rxbytesrate;
	private Long tottxbytes;
	private Long txbytesrate;
	private Long totrxpkts;
	private Long rxpktsrate;
	private Long tottxpkts;
	private Long txpktsrate;
	private Long nictotmulticastpkts;
	private Long nicmulticastpktsrate;
	private Long totnetscalerpkts;
	private Long netscalerpktsrate;
	private Long rxlacpdu;
	private Long rxlacpdurate;
	private Long txlacpdu;
	private Long txlacpdurate;
	private Long errpktrx;
	private Long errpktrxrate;
	private Long errpkttx;
	private Long errpkttxrate;
	private Long errifindiscards;
	private Long errifindiscardsrate;
	private Long nicerrifoutdiscards;
	private Long nicerrifoutdiscardsrate;
	private Long errdroppedrxpkts;
	private Long errdroppedrxpktsrate;
	private Long errdroppedtxpkts;
	private Long errdroppedtxpktsrate;
	private Long errlinkhangs;
	private Long nicstsstalls;
	private Long nictxstalls;
	private Long nicrxstalls;
	private Long nicerrdisables;
	private Long errduplexmismatch;
	private Long linkreinits;
	private Long totmacmoved;
	private Long macmovedrate;
	private Long errnicmuted;
	private String interfacealias;
	private String curlinkstate;

	/**
	* <pre>
	* The interface number, in a/b format, where 'a' can take one of the following values:
						1.	'0': Indicates a management interface.
						2.	'1': Indicates a 10/100/1000 Mbps port, or a 10G port on a NetScaler 12000-10G, NetScaler MPX 15000, or NetScaler 17000 platform.
						3.	'10': Indicates a 10 Gbps port.
						4.	'LA': Indicates a link aggregation port.
						5.	'LO': Indicates a loop back port.
						'b' is an integer that is used to provide a unique label for the interfaces in the group defined by 'a'.
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* The interface number, in a/b format, where 'a' can take one of the following values:
						1.	'0': Indicates a management interface.
						2.	'1': Indicates a 10/100/1000 Mbps port, or a 10G port on a NetScaler 12000-10G, NetScaler MPX 15000, or NetScaler 17000 platform.
						3.	'10': Indicates a 10 Gbps port.
						4.	'LA': Indicates a link aggregation port.
						5.	'LO': Indicates a loop back port.
						'b' is an integer that is used to provide a unique label for the interfaces in the group defined by 'a'.
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* Number of outbound packets dropped by the hardware on a specified interface since the NetScaler appliance was started or the interface statistics were cleared. This could happen due to length (undersize or oversize) errors and lack of resources. This statistic is available only for: 
			(1) Loop back interface (LO) of all platforms.
			(2) All data ports on the NetScaler 12000 platform.
			(3) Management ports on the MPX 15000 and 17000 platforms.
	* </pre>
	*/
	public Long get_errpkttx() throws Exception {
		return this.errpkttx;
	}

	/**
	* <pre>
	* Number of times the interface stalled, when receiving packets, since the NetScaler appliance was started or the interface statistics were cleared. Receive (Rx) stalls are detected when the following conditions are met:
			(1)The link is up for more than 10 minutes. 
			(2)Packets are transmitted, but no packets is received for 16 seconds.
	* </pre>
	*/
	public Long get_nicrxstalls() throws Exception {
		return this.nicrxstalls;
	}

	/**
	* <pre>
	* Number of multicast packets received by the specified interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_nictotmulticastpkts() throws Exception {
		return this.nictotmulticastpkts;
	}

	/**
	* <pre>
	* Number of bytes transmitted by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_txbytesrate() throws Exception {
		return this.txbytesrate;
	}

	/**
	* <pre>
	* Number of Link Aggregation Control Protocol Data Units(LACPDUs) received by the specified interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_rxlacpdu() throws Exception {
		return this.rxlacpdu;
	}

	/**
	* <pre>
	* Number of packets, destined to the NetScaler, received by an interface since the NetScaler appliance was started or the interface statistics were cleared. The packets destined to NetScaler are those that have the same MAC address as that of an interface or a VMAC address owned by the NetScaler.
	* </pre>
	*/
	public Long get_netscalerpktsrate() throws Exception {
		return this.netscalerpktsrate;
	}

	/**
	* <pre>
	* Number of packets transmitted by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_tottxpkts() throws Exception {
		return this.tottxpkts;
	}

	/**
	* <pre>
	* Number of MAC moves between ports. If a high rate of MAC moves is observed, it is likely that there is a bridge loop between two interfaces.
	* </pre>
	*/
	public Long get_macmovedrate() throws Exception {
		return this.macmovedrate;
	}

	/**
	* <pre>
	* Current state of the specified interface.  The interface state set to UP only if the link state is UP and administrative state is ENABLED .
	* </pre>
	*/
	public String get_curintfstate() throws Exception {
		return this.curintfstate;
	}

	/**
	* <pre>
	* Number of inbound packets dropped by the hardware on a specified interface once the NetScaler appliance starts or the interface statistics are cleared. This happens due to following reasons:
			1)	The hardware receives packets at a rate higher rate than that at which the software is processing packets. In this case, the hardware FIFO overruns and starts dropping the packets .
			2)	The specified interface fails to receive inbound packets from the appliance because of insufficient memory.
			3)	The specified interface receives packets with CRC errors (Alignment or Frame Check Sequence).
			4)	The specified interface receives overly long packets.
			5)	The specified interface receives packets with alignment errors.
			6)	The software does less buffering because it is running out of available memory. When hardware detects that there is no space into which to push newly arrived packets, it starts dropping them.
			7)	The specified interface receives packets with Frame Check Sequence (FCS) errors.
			8)	The specified interface receives packets smaller than 64 bytes.
			9)	The specified interface discards error-free inbound packets because of insufficient resources. For example: NIC buffers.
			10)	Packets are missed because of collision detection, link lost, physical decoding error, or MAC abort.
	* </pre>
	*/
	public Long get_errpktrx() throws Exception {
		return this.errpktrx;
	}

	/**
	* <pre>
	* Duration for which the link is DOWN. This statistic is reset when the state changes to UP.
	* </pre>
	*/
	public String get_curlinkdowntime() throws Exception {
		return this.curlinkdowntime;
	}

	/**
	* <pre>
	* Number of multicast packets received by the specified interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_nicmulticastpktsrate() throws Exception {
		return this.nicmulticastpktsrate;
	}

	/**
	* <pre>
	* Number of bytes received by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_rxbytesrate() throws Exception {
		return this.rxbytesrate;
	}

	/**
	* <pre>
	* Duration for which the link is UP. This statistic is reset when the state changes to DOWN.
	* </pre>
	*/
	public String get_curlinkuptime() throws Exception {
		return this.curlinkuptime;
	}

	/**
	* <pre>
	* Number of bytes transmitted by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_tottxbytes() throws Exception {
		return this.tottxbytes;
	}

	/**
	* <pre>
	* Number of packets dropped in transmission by the specified interface due to one of the following reasons.
			(1) VLAN mismatch.
			(2) Oversized packets.
			(3) Interface congestion.  
			(4) Loopback packets sent on non loop back interface.
	* </pre>
	*/
	public Long get_errdroppedtxpktsrate() throws Exception {
		return this.errdroppedtxpktsrate;
	}

	/**
	* <pre>
	* Number of outbound packets dropped by the hardware on a specified interface since the NetScaler appliance was started or the interface statistics were cleared. This could happen due to length (undersize or oversize) errors and lack of resources. This statistic is available only for: 
			(1) Loop back interface (LO) of all platforms.
			(2) All data ports on the NetScaler 12000 platform.
			(3) Management ports on the MPX 15000 and 17000 platforms.
	* </pre>
	*/
	public Long get_errpkttxrate() throws Exception {
		return this.errpkttxrate;
	}

	/**
	* <pre>
	* Number of times the interface stalled, when transmitting packets, since the NetScaler appliance was started or the interface statistics were cleared. Transmit (Tx) stalls are detected when a packet posted for transmission is not transmitted in 4 seconds.
	* </pre>
	*/
	public Long get_nictxstalls() throws Exception {
		return this.nictxstalls;
	}

	/**
	* <pre>
	* Number of Link Aggregation Control Protocol Data Units(LACPDUs) received by the specified interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_rxlacpdurate() throws Exception {
		return this.rxlacpdurate;
	}

	/**
	* <pre>
	* Number of packets, destined to the NetScaler, received by an interface since the NetScaler appliance was started or the interface statistics were cleared. The packets destined to NetScaler are those that have the same MAC address as that of an interface or a VMAC address owned by the NetScaler.
	* </pre>
	*/
	public Long get_totnetscalerpkts() throws Exception {
		return this.totnetscalerpkts;
	}

	/**
	* <pre>
	* Number of bytes received by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_totrxbytes() throws Exception {
		return this.totrxbytes;
	}

	/**
	* <pre>
	* Number of times the link has been re-initialized. A re-initialization occurs due to link state change, configuration parameter change, or administrative reset operation.
	* </pre>
	*/
	public Long get_linkreinits() throws Exception {
		return this.linkreinits;
	}

	/**
	* <pre>
	* Number of times the specified interface is disabled by the NetScaler, due to continuous Receive (Rx) or Transmit (Tx) stalls, since the NetScaler appliance was started or the interface statistics were cleared. The NetScaler disables an interface when one of the following conditions is met:
			(1) Three consecutive transmit stalls occur within 10 seconds.
			(2) Three consecutive receive stalls occur within 120 seconds.
	* </pre>
	*/
	public Long get_nicerrdisables() throws Exception {
		return this.nicerrdisables;
	}

	/**
	* <pre>
	* Number of packets transmitted by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_txpktsrate() throws Exception {
		return this.txpktsrate;
	}

	/**
	* <pre>
	* Number of Link Aggregation Control Protocol Data Units(LACPDUs) transmitted by the specified interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_txlacpdu() throws Exception {
		return this.txlacpdu;
	}

	/**
	* <pre>
	* Number of inbound packets dropped by the specified interface. Commonly dropped packets are multicast frames, spanning tree BPDUs, packets destined to a MAC not owned by the NetScaler when L2 mode is disabled, or packets tagged for a VLAN that is not bound to the interface.  This statistic will increment in most healthy networks at a steady rate regardless of traffic load.  If a sharp spike in dropped packets occurs, it generally indicates an issue with connected L2 switches, such as a forwarding database overflow resulting in packets being broadcast on all ports.
	* </pre>
	*/
	public Long get_errdroppedrxpktsrate() throws Exception {
		return this.errdroppedrxpktsrate;
	}

	/**
	* <pre>
	* Number of times the specified interface stopped transmitting and receiving packets due to MAC moves between ports.
	* </pre>
	*/
	public Long get_errnicmuted() throws Exception {
		return this.errnicmuted;
	}

	/**
	* <pre>
	* Number of packets dropped in transmission by the specified interface due to one of the following reasons.
			(1) VLAN mismatch.
			(2) Oversized packets.
			(3) Interface congestion.  
			(4) Loopback packets sent on non loop back interface.
	* </pre>
	*/
	public Long get_errdroppedtxpkts() throws Exception {
		return this.errdroppedtxpkts;
	}

	/**
	* <pre>
	* Number of error-free outbound packets discarded by the specified interface due to a lack of resources. This statistic is not available on:
			(1) 10G ports of NetScaler MPX 12500/12500/15500-10G  platforms. 
			(2) 10G data ports on NetScaler MPX 17500/19500/21500 platforms.
	* </pre>
	*/
	public Long get_nicerrifoutdiscardsrate() throws Exception {
		return this.nicerrifoutdiscardsrate;
	}

	/**
	* <pre>
	* Number of error-free inbound packets discarded by the specified interface due to a lack of resources, for example, insufficient receive buffers.
	* </pre>
	*/
	public Long get_errifindiscardsrate() throws Exception {
		return this.errifindiscardsrate;
	}

	/**
	* <pre>
	* Number of error-free outbound packets discarded by the specified interface due to a lack of resources. This statistic is not available on:
			(1) 10G ports of NetScaler MPX 12500/12500/15500-10G  platforms. 
			(2) 10G data ports on NetScaler MPX 17500/19500/21500 platforms.
	* </pre>
	*/
	public Long get_nicerrifoutdiscards() throws Exception {
		return this.nicerrifoutdiscards;
	}

	/**
	* <pre>
	* The current state of the link associated with the interface. For logical interfaces (LA), the state of the link is dependent on the state of the slave interfaces. For the link to be UP at least one of the slave interfaces needs to be UP.
	* </pre>
	*/
	public String get_curlinkstate() throws Exception {
		return this.curlinkstate;
	}

	/**
	* <pre>
	* Number of error-free inbound packets discarded by the specified interface due to a lack of resources, for example, insufficient receive buffers.
	* </pre>
	*/
	public Long get_errifindiscards() throws Exception {
		return this.errifindiscards;
	}

	/**
	* <pre>
	* Alias Name for the Interface
	* </pre>
	*/
	public String get_interfacealias() throws Exception {
		return this.interfacealias;
	}

	/**
	* <pre>
	* Number of packets received by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_totrxpkts() throws Exception {
		return this.totrxpkts;
	}

	/**
	* <pre>
	* Number of MAC moves between ports. If a high rate of MAC moves is observed, it is likely that there is a bridge loop between two interfaces.
	* </pre>
	*/
	public Long get_totmacmoved() throws Exception {
		return this.totmacmoved;
	}

	/**
	* <pre>
	* Number of packets received by an interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_rxpktsrate() throws Exception {
		return this.rxpktsrate;
	}

	/**
	* <pre>
	* Number of times duplex mismatches were detected on the specified interface since the NetScaler appliance was started or the interface statistics were cleared. A mismatch will occur if the duplex mode is not identically set on both ends of the link. This statistic is only available on the NetScaler Classic edition.
	* </pre>
	*/
	public Long get_errduplexmismatch() throws Exception {
		return this.errduplexmismatch;
	}

	/**
	* <pre>
	* Number of inbound packets dropped by the hardware on a specified interface once the NetScaler appliance starts or the interface statistics are cleared. This happens due to following reasons:
			1)	The hardware receives packets at a rate higher rate than that at which the software is processing packets. In this case, the hardware FIFO overruns and starts dropping the packets .
			2)	The specified interface fails to receive inbound packets from the appliance because of insufficient memory.
			3)	The specified interface receives packets with CRC errors (Alignment or Frame Check Sequence).
			4)	The specified interface receives overly long packets.
			5)	The specified interface receives packets with alignment errors.
			6)	The software does less buffering because it is running out of available memory. When hardware detects that there is no space into which to push newly arrived packets, it starts dropping them.
			7)	The specified interface receives packets with Frame Check Sequence (FCS) errors.
			8)	The specified interface receives packets smaller than 64 bytes.
			9)	The specified interface discards error-free inbound packets because of insufficient resources. For example: NIC buffers.
			10)	Packets are missed because of collision detection, link lost, physical decoding error, or MAC abort.
	* </pre>
	*/
	public Long get_errpktrxrate() throws Exception {
		return this.errpktrxrate;
	}

	/**
	* <pre>
	* Number of times the specified interface detected hangs in the transmit and receive paths since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_errlinkhangs() throws Exception {
		return this.errlinkhangs;
	}

	/**
	* <pre>
	* Number of inbound packets dropped by the specified interface. Commonly dropped packets are multicast frames, spanning tree BPDUs, packets destined to a MAC not owned by the NetScaler when L2 mode is disabled, or packets tagged for a VLAN that is not bound to the interface.  This statistic will increment in most healthy networks at a steady rate regardless of traffic load.  If a sharp spike in dropped packets occurs, it generally indicates an issue with connected L2 switches, such as a forwarding database overflow resulting in packets being broadcast on all ports.
	* </pre>
	*/
	public Long get_errdroppedrxpkts() throws Exception {
		return this.errdroppedrxpkts;
	}

	/**
	* <pre>
	* Number of Link Aggregation Control Protocol Data Units(LACPDUs) transmitted by the specified interface since the NetScaler appliance was started or the interface statistics were cleared.
	* </pre>
	*/
	public Long get_txlacpdurate() throws Exception {
		return this.txlacpdurate;
	}

	/**
	* <pre>
	* Number of times the status updates for a specified interface were stalled since the NetScaler appliance was started or the interface statistics were cleared. A status stall is detected when the status of the interface is not updated by the NIC hardware within 0.8 seconds of the last update.
	* </pre>
	*/
	public Long get_nicstsstalls() throws Exception {
		return this.nicstsstalls;
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
	* Use this API to fetch the statistics of all Interface_stats resources that are configured on netscaler.
	*/
	public static Interface_stats[] get(nitro_service service) throws Exception{
		Interface_stats obj = new Interface_stats();
		Interface_stats[] response = (Interface_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all Interface_stats resources that are configured on netscaler.
	*/
	public static Interface_stats[] get(nitro_service service, options option) throws Exception{
		Interface_stats obj = new Interface_stats();
		Interface_stats[] response = (Interface_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of Interface_stats resource of given name .
	*/
	public static Interface_stats get(nitro_service service, String id) throws Exception{
		Interface_stats obj = new Interface_stats();
		obj.set_id(id);
		Interface_stats response = (Interface_stats) obj.stat_resource(service);
		return response;
	}

}
