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

package com.citrix.netscaler.nitro.resource.stat.protocol;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class protocolip_response extends base_response
{
	public protocolip_stats protocolip;
}
/**
* Statistics for protocolip resource.
*/

public class protocolip_stats extends base_resource
{
	private Long iptotrxpkts;
	private Long iprxpktsrate;
	private Long iptotrxbytes;
	private Long iprxbytesrate;
	private Long iptottxpkts;
	private Long iptxpktsrate;
	private Long iptottxbytes;
	private Long iptxbytesrate;
	private Long iptotrxmbits;
	private Long iprxmbitsrate;
	private Long iptottxmbits;
	private Long iptxmbitsrate;
	private Long iptotroutedpkts;
	private Long iproutedpktsrate;
	private Long iptotroutedmbits;
	private Long iproutedmbitsrate;
	private Long iptotfragments;
	private Long iptotsuccreassembly;
	private Long iptotreassemblyattempt;
	private Long iptotaddrlookup;
	private Long iptotaddrlookupfail;
	private Long iptotudpfragmentsfwd;
	private Long iptottcpfragmentsfwd;
	private Long iptotfragpktsgen;
	private Long iptotbadchecksums;
	private Long iptotunsuccreassembly;
	private Long iptottoobig;
	private Long iptotzerofragmentlen;
	private Long iptotdupfragments;
	private Long iptotoutoforderfrag;
	private Long iptotunknowndstrcvd;
	private Long iptotbadtransport;
	private Long iptotvipdown;
	private Long iptotfixheaderfail;
	private Long iptotttlexpired;
	private Long iptotmaxclients;
	private Long iptotunknownsvcs;
	private Long iptotlandattacks;
	private Long iptotinvalidheadersz;
	private Long iptotinvalidpacketsize;
	private Long iptottruncatedpackets;
	private Long noniptottruncatedpackets;
	private Long iptotzeronexthop;
	private Long iptotbadlens;
	private Long iptotbadmacaddrs;

	/**
	* <pre>
	* Total routed packets.
	* </pre>
	*/
	public Long get_iproutedpktsrate() throws Exception {
		return this.iproutedpktsrate;
	}

	/**
	* <pre>
	* Fragments received that are out of order.
	* </pre>
	*/
	public Long get_iptotoutoforderfrag() throws Exception {
		return this.iptotoutoforderfrag;
	}

	/**
	* <pre>
	* Truncated non-IP packets received.
	* </pre>
	*/
	public Long get_noniptottruncatedpackets() throws Exception {
		return this.noniptottruncatedpackets;
	}

	/**
	* <pre>
	* Attempts to open a new connection to a service for which the maximum limit has been exceeded. Default value, 0, applies no limit.
	* </pre>
	*/
	public Long get_iptotmaxclients() throws Exception {
		return this.iptotmaxclients;
	}

	/**
	* <pre>
	* Packets received with a fragment length of 0 bytes.
	* </pre>
	*/
	public Long get_iptotzerofragmentlen() throws Exception {
		return this.iptotzerofragmentlen;
	}

	/**
	* <pre>
	* Bytes of IP data transmitted.
	* </pre>
	*/
	public Long get_iptxbytesrate() throws Exception {
		return this.iptxbytesrate;
	}

	/**
	* <pre>
	* Packets received for which the VIP is down. This can occur when all the services bound to the VIP are down or the VIP is manually disabled.
	* </pre>
	*/
	public Long get_iptotvipdown() throws Exception {
		return this.iptotvipdown;
	}

	/**
	* <pre>
	* Total routed packets.
	* </pre>
	*/
	public Long get_iptotroutedpkts() throws Exception {
		return this.iptotroutedpkts;
	}

	/**
	* <pre>
	* Megabits of IP data received.
	* </pre>
	*/
	public Long get_iprxmbitsrate() throws Exception {
		return this.iprxmbitsrate;
	}

	/**
	* <pre>
	* IP packets received.
	* </pre>
	*/
	public Long get_iprxpktsrate() throws Exception {
		return this.iprxpktsrate;
	}

	/**
	* <pre>
	* Megabits of IP data transmitted.
	* </pre>
	*/
	public Long get_iptxmbitsrate() throws Exception {
		return this.iptxmbitsrate;
	}

	/**
	* <pre>
	* Total routed Mbits
	* </pre>
	*/
	public Long get_iptotroutedmbits() throws Exception {
		return this.iptotroutedmbits;
	}

	/**
	* <pre>
	* Packets received in which an invalid data length is specified, or the value in the length field and the actual data length do not match. The range for the Ethernet packet data length is 0-1500 bytes.
	* </pre>
	*/
	public Long get_iptotinvalidheadersz() throws Exception {
		return this.iptotinvalidheadersz;
	}

	/**
	* <pre>
	* IP address lookups performed by the NetScaler that have failed because the destination IP address of the packet does not match any of the NetScaler owned IP addresses.
	* </pre>
	*/
	public Long get_iptotaddrlookupfail() throws Exception {
		return this.iptotaddrlookupfail;
	}

	/**
	* <pre>
	* Packets received in which the protocol specified in the IP header is unknown to the NetScaler.
	* </pre>
	*/
	public Long get_iptotbadtransport() throws Exception {
		return this.iptotbadtransport;
	}

	/**
	* <pre>
	* Fragmented packets created by the NetScaler.
	* </pre>
	*/
	public Long get_iptotfragpktsgen() throws Exception {
		return this.iptotfragpktsgen;
	}

	/**
	* <pre>
	* Fragmented IP packets successfully reassembled on the NetScaler.
	* </pre>
	*/
	public Long get_iptotsuccreassembly() throws Exception {
		return this.iptotsuccreassembly;
	}

	/**
	* <pre>
	* Megabits of IP data received.
	* </pre>
	*/
	public Long get_iptotrxmbits() throws Exception {
		return this.iptotrxmbits;
	}

	/**
	* <pre>
	* Bytes of IP data transmitted.
	* </pre>
	*/
	public Long get_iptottxbytes() throws Exception {
		return this.iptottxbytes;
	}

	/**
	* <pre>
	* IP packets transmitted with a bad MAC address.
	* </pre>
	*/
	public Long get_iptotbadmacaddrs() throws Exception {
		return this.iptotbadmacaddrs;
	}

	/**
	* <pre>
	* TCP fragments forwarded to the client or the server.
	* </pre>
	*/
	public Long get_iptottcpfragmentsfwd() throws Exception {
		return this.iptottcpfragmentsfwd;
	}

	/**
	* <pre>
	* IP packets received.
	* </pre>
	*/
	public Long get_iptotrxpkts() throws Exception {
		return this.iptotrxpkts;
	}

	/**
	* <pre>
	* Bytes of IP data received.
	* </pre>
	*/
	public Long get_iptotrxbytes() throws Exception {
		return this.iptotrxbytes;
	}

	/**
	* <pre>
	* Land-attack packets received. The source and destination addresses are the same.
	* </pre>
	*/
	public Long get_iptotlandattacks() throws Exception {
		return this.iptotlandattacks;
	}

	/**
	* <pre>
	* Packets received in which the destination IP address was not reachable or not owned by the NetScaler.
	* </pre>
	*/
	public Long get_iptotunknowndstrcvd() throws Exception {
		return this.iptotunknowndstrcvd;
	}

	/**
	* <pre>
	* Truncated IP packets received. An overflow in the routers along the path can truncate IP packets.
	* </pre>
	*/
	public Long get_iptottruncatedpackets() throws Exception {
		return this.iptottruncatedpackets;
	}

	/**
	* <pre>
	* Packets for which the time-to-live (TTL) expired during transit. These packets are dropped.
	* </pre>
	*/
	public Long get_iptotttlexpired() throws Exception {
		return this.iptotttlexpired;
	}

	/**
	* <pre>
	* Bytes of IP data received.
	* </pre>
	*/
	public Long get_iprxbytesrate() throws Exception {
		return this.iprxbytesrate;
	}

	/**
	* <pre>
	* Megabits of IP data transmitted.
	* </pre>
	*/
	public Long get_iptottxmbits() throws Exception {
		return this.iptottxmbits;
	}

	/**
	* <pre>
	* Packets received with a length greater than the normal maximum transmission unit of 1514 bytes.
	* </pre>
	*/
	public Long get_iptotbadlens() throws Exception {
		return this.iptotbadlens;
	}

	/**
	* <pre>
	* Packets received on a port or service that is not configured.
	* </pre>
	*/
	public Long get_iptotunknownsvcs() throws Exception {
		return this.iptotunknownsvcs;
	}

	/**
	* <pre>
	* Duplicate IP fragments received. This can occur when the acknowledgement was not received within the expected time.
	* </pre>
	*/
	public Long get_iptotdupfragments() throws Exception {
		return this.iptotdupfragments;
	}

	/**
	* <pre>
	* Packets received for which the reassembled data exceeds the Ethernet packet data length of 1500 bytes.
	* </pre>
	*/
	public Long get_iptottoobig() throws Exception {
		return this.iptottoobig;
	}

	/**
	* <pre>
	* Packets received that contain a 0 value in the next hop field. These packets are dropped.
	* </pre>
	*/
	public Long get_iptotzeronexthop() throws Exception {
		return this.iptotzeronexthop;
	}

	/**
	* <pre>
	* IP address lookups performed by the NetScaler. When a packet is received on a non-established session, the NetScaler checks if the destination IP address is one of the NetScaler owned IP addresses.
	* </pre>
	*/
	public Long get_iptotaddrlookup() throws Exception {
		return this.iptotaddrlookup;
	}

	/**
	* <pre>
	* IP fragments received.
	* </pre>
	*/
	public Long get_iptotfragments() throws Exception {
		return this.iptotfragments;
	}

	/**
	* <pre>
	* Total number of packets received by NetScaler with invalid IP packet size.
	* </pre>
	*/
	public Long get_iptotinvalidpacketsize() throws Exception {
		return this.iptotinvalidpacketsize;
	}

	/**
	* <pre>
	* Packets received that could not be reassembled. This can occur when there is a checksum failure, an identification field mismatch, or when one of the fragments is missing.
	* </pre>
	*/
	public Long get_iptotunsuccreassembly() throws Exception {
		return this.iptotunsuccreassembly;
	}

	/**
	* <pre>
	* IP packets that the NetScaler attempts to reassemble. If one of the fragments is missing, the whole packet is dropped.
	* </pre>
	*/
	public Long get_iptotreassemblyattempt() throws Exception {
		return this.iptotreassemblyattempt;
	}

	/**
	* <pre>
	* IP packets transmitted.
	* </pre>
	*/
	public Long get_iptottxpkts() throws Exception {
		return this.iptottxpkts;
	}

	/**
	* <pre>
	* IP packets transmitted.
	* </pre>
	*/
	public Long get_iptxpktsrate() throws Exception {
		return this.iptxpktsrate;
	}

	/**
	* <pre>
	* Packets received with an IP checksum error.
	* </pre>
	*/
	public Long get_iptotbadchecksums() throws Exception {
		return this.iptotbadchecksums;
	}

	/**
	* <pre>
	* Packets received that contain an error in one or more components of the IP header.
	* </pre>
	*/
	public Long get_iptotfixheaderfail() throws Exception {
		return this.iptotfixheaderfail;
	}

	/**
	* <pre>
	* Total routed Mbits
	* </pre>
	*/
	public Long get_iproutedmbitsrate() throws Exception {
		return this.iproutedmbitsrate;
	}

	/**
	* <pre>
	* UDP fragments forwarded to the client or the server.
	* </pre>
	*/
	public Long get_iptotudpfragmentsfwd() throws Exception {
		return this.iptotudpfragmentsfwd;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		protocolip_stats[] resources = new protocolip_stats[1];
		protocolip_response result = (protocolip_response) service.get_payload_formatter().string_to_resource(protocolip_response.class, response);
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
		resources[0] = result.protocolip;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to fetch the statistics of all protocolip_stats resources that are configured on netscaler.
	*/
	public static protocolip_stats get(nitro_service service) throws Exception{
		protocolip_stats obj = new protocolip_stats();
		protocolip_stats[] response = (protocolip_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all protocolip_stats resources that are configured on netscaler.
	*/
	public static protocolip_stats get(nitro_service service,  options option) throws Exception{
		protocolip_stats obj = new protocolip_stats();
		protocolip_stats[] response = (protocolip_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
