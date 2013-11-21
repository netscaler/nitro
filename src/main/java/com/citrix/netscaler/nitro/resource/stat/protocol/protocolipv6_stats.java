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

class protocolipv6_response extends base_response
{
	public protocolipv6_stats protocolipv6;
}
/**
* Statistics for ip v6 resource.
*/

public class protocolipv6_stats extends base_resource
{
	private String clearstats;
	private Long ipv6totrxpkts;
	private Long ipv6rxpktsrate;
	private Long ipv6totrxbytes;
	private Long ipv6rxbytesrate;
	private Long ipv6tottxpkts;
	private Long ipv6txpktsrate;
	private Long ipv6tottxbytes;
	private Long ipv6txbytesrate;
	private Long ipv6totroutepkts;
	private Long ipv6routepktsrate;
	private Long ipv6totroutembits;
	private Long ipv6routembitsrate;
	private Long ipv6fragtotrxpkts;
	private Long ipv6fragrxpktsrate;
	private Long ipv6fragtottcpreassembled;
	private Long ipv6fragtcpreassembledrate;
	private Long ipv6fragtotudpreassembled;
	private Long ipv6fragudpreassembledrate;
	private Long ipv6fragtotpktsprocessnoreass;
	private Long ipv6fragpktsprocessnoreassrate;
	private Long ipv6fragtotpktsforward;
	private Long ipv6fragpktsforwardrate;
	private Long ipv6errhdr;
	private Long ipv6nextheadererr;
	private Long ipv6landattack;
	private Long ipv6fragpkttoobig;
	private Long ipv6fragzerolenpkt;
	private Long ipv6toticmpnarx;
	private Long ipv6icmpnarxrate;
	private Long ipv6toticmpnsrx;
	private Long ipv6icmpnsrxrate;
	private Long ipv6toticmpnatx;
	private Long ipv6icmpnatxrate;
	private Long ipv6toticmpnstx;
	private Long ipv6icmpnstxrate;
	private Long ipv6toticmprarx;
	private Long ipv6icmprarxrate;
	private Long ipv6toticmprstx;
	private Long ipv6icmprstxrate;
	private Long ipv6toticmprx;
	private Long ipv6icmprxrate;
	private Long ipv6toticmptx;
	private Long ipv6icmptxrate;
	private Long ipv6errrxhdr;
	private Long ipv6errrxpkt;
	private Long ipv6badcksum;
	private Long icmpv6error;
	private Long icmpv6unspt;
	private Long icmpv6rtthsld;

	/**
	* <pre>
	* Clear the statsistics / counters
	* </pre>
	*/
	public void set_clearstats(String clearstats) throws Exception{
		this.clearstats = clearstats;
	}

	/**
	* <pre>
	* Clear the statsistics / counters.<br> Possible values = basic, full
	* </pre>
	*/
	public String get_clearstats() throws Exception {
		return this.clearstats;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6fragtotpktsforward
	* </pre>
	*/
	public Long get_ipv6fragpktsforwardrate() throws Exception {
		return this.ipv6fragpktsforwardrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6toticmprstx
	* </pre>
	*/
	public Long get_ipv6icmprstxrate() throws Exception {
		return this.ipv6icmprstxrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6fragtotrxpkts
	* </pre>
	*/
	public Long get_ipv6fragrxpktsrate() throws Exception {
		return this.ipv6fragrxpktsrate;
	}

	/**
	* <pre>
	* IPv6 packets routed.
	* </pre>
	*/
	public Long get_ipv6totroutepkts() throws Exception {
		return this.ipv6totroutepkts;
	}

	/**
	* <pre>
	* Packets received for which the reassembled data exceeds the Ethernet packet data length of 1500 bytes.
	* </pre>
	*/
	public Long get_ipv6fragpkttoobig() throws Exception {
		return this.ipv6fragpkttoobig;
	}

	/**
	* <pre>
	* Number of ICMPv6 NA packets received by NetScaler (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6toticmpnarx() throws Exception {
		return this.ipv6toticmpnarx;
	}

	/**
	* <pre>
	* IPv6 fragments received.
	* </pre>
	*/
	public Long get_ipv6fragtotrxpkts() throws Exception {
		return this.ipv6fragtotrxpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6toticmpnatx
	* </pre>
	*/
	public Long get_ipv6icmpnatxrate() throws Exception {
		return this.ipv6icmpnatxrate;
	}

	/**
	* <pre>
	* Number of ICMPv6 NS packets received by NetScaler (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6toticmpnsrx() throws Exception {
		return this.ipv6toticmpnsrx;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6totroutembits
	* </pre>
	*/
	public Long get_ipv6routembitsrate() throws Exception {
		return this.ipv6routembitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6tottxpkts
	* </pre>
	*/
	public Long get_ipv6txpktsrate() throws Exception {
		return this.ipv6txpktsrate;
	}

	/**
	* <pre>
	* Number of ICMPv6 packets dropped for rate threshold exceeded (OBSOLETE).
	* </pre>
	*/
	public Long get_icmpv6rtthsld() throws Exception {
		return this.icmpv6rtthsld;
	}

	/**
	* <pre>
	* Number of ICMPv6 unsupported packets received (OBSOLETE).
	* </pre>
	*/
	public Long get_icmpv6unspt() throws Exception {
		return this.icmpv6unspt;
	}

	/**
	* <pre>
	* Number of bad checksum packets received (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6badcksum() throws Exception {
		return this.ipv6badcksum;
	}

	/**
	* <pre>
	* Number of erroneous header packets received (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6errrxhdr() throws Exception {
		return this.ipv6errrxhdr;
	}

	/**
	* <pre>
	* Bytes of IPv6 data received.
	* </pre>
	*/
	public Long get_ipv6totrxbytes() throws Exception {
		return this.ipv6totrxbytes;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6totrxpkts
	* </pre>
	*/
	public Long get_ipv6rxpktsrate() throws Exception {
		return this.ipv6rxpktsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6toticmpnstx
	* </pre>
	*/
	public Long get_ipv6icmpnstxrate() throws Exception {
		return this.ipv6icmpnstxrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6toticmprarx
	* </pre>
	*/
	public Long get_ipv6icmprarxrate() throws Exception {
		return this.ipv6icmprarxrate;
	}

	/**
	* <pre>
	* Packets received that contain an error in one or more components of the IPv6 header.
	* </pre>
	*/
	public Long get_ipv6errhdr() throws Exception {
		return this.ipv6errhdr;
	}

	/**
	* <pre>
	* IPv6 packets received.
	* </pre>
	*/
	public Long get_ipv6totrxpkts() throws Exception {
		return this.ipv6totrxpkts;
	}

	/**
	* <pre>
	* Number of ICMPv6 packets received by NetScaler (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6toticmprx() throws Exception {
		return this.ipv6toticmprx;
	}

	/**
	* <pre>
	* IPv6 fragments processed without reassembly.
	* </pre>
	*/
	public Long get_ipv6fragtotpktsprocessnoreass() throws Exception {
		return this.ipv6fragtotpktsprocessnoreass;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6totrxbytes
	* </pre>
	*/
	public Long get_ipv6rxbytesrate() throws Exception {
		return this.ipv6rxbytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6toticmpnsrx
	* </pre>
	*/
	public Long get_ipv6icmpnsrxrate() throws Exception {
		return this.ipv6icmpnsrxrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6totroutepkts
	* </pre>
	*/
	public Long get_ipv6routepktsrate() throws Exception {
		return this.ipv6routepktsrate;
	}

	/**
	* <pre>
	* Number of ICMPv6 NA packets transmitted by NetScaler (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6toticmpnatx() throws Exception {
		return this.ipv6toticmpnatx;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6toticmptx
	* </pre>
	*/
	public Long get_ipv6icmptxrate() throws Exception {
		return this.ipv6icmptxrate;
	}

	/**
	* <pre>
	* Number of ICMPv6 RS packets transmitted by NetScaler (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6toticmprstx() throws Exception {
		return this.ipv6toticmprstx;
	}

	/**
	* <pre>
	* IPv6 total Mbits.
	* </pre>
	*/
	public Long get_ipv6totroutembits() throws Exception {
		return this.ipv6totroutembits;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6toticmprx
	* </pre>
	*/
	public Long get_ipv6icmprxrate() throws Exception {
		return this.ipv6icmprxrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6fragtotpktsprocessnoreass
	* </pre>
	*/
	public Long get_ipv6fragpktsprocessnoreassrate() throws Exception {
		return this.ipv6fragpktsprocessnoreassrate;
	}

	/**
	* <pre>
	* IPv6 packets transmitted
	* </pre>
	*/
	public Long get_ipv6tottxpkts() throws Exception {
		return this.ipv6tottxpkts;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6fragtottcpreassembled
	* </pre>
	*/
	public Long get_ipv6fragtcpreassembledrate() throws Exception {
		return this.ipv6fragtcpreassembledrate;
	}

	/**
	* <pre>
	* TCP fragments processed after reassembly.
	* </pre>
	*/
	public Long get_ipv6fragtottcpreassembled() throws Exception {
		return this.ipv6fragtottcpreassembled;
	}

	/**
	* <pre>
	* UDP fragments processed after reassembly.
	* </pre>
	*/
	public Long get_ipv6fragtotudpreassembled() throws Exception {
		return this.ipv6fragtotudpreassembled;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6toticmpnarx
	* </pre>
	*/
	public Long get_ipv6icmpnarxrate() throws Exception {
		return this.ipv6icmpnarxrate;
	}

	/**
	* <pre>
	* Number of erroneous packets received (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6errrxpkt() throws Exception {
		return this.ipv6errrxpkt;
	}

	/**
	* <pre>
	* Packets received that contain an unsupported next header. The supported next headers are TCP, ICMP, UDP, OSPF, and FRAGMENT.
	* </pre>
	*/
	public Long get_ipv6nextheadererr() throws Exception {
		return this.ipv6nextheadererr;
	}

	/**
	* <pre>
	* Number of ICMPv6 packets transmitted by NetScaler (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6toticmptx() throws Exception {
		return this.ipv6toticmptx;
	}

	/**
	* <pre>
	* Number of ICMPv6 NS packets transmitted by NetScaler (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6toticmpnstx() throws Exception {
		return this.ipv6toticmpnstx;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6fragtotudpreassembled
	* </pre>
	*/
	public Long get_ipv6fragudpreassembledrate() throws Exception {
		return this.ipv6fragudpreassembledrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipv6tottxbytes
	* </pre>
	*/
	public Long get_ipv6txbytesrate() throws Exception {
		return this.ipv6txbytesrate;
	}

	/**
	* <pre>
	* Number of erroneous ICMPv6 packets received (OBSOLETE).
	* </pre>
	*/
	public Long get_icmpv6error() throws Exception {
		return this.icmpv6error;
	}

	/**
	* <pre>
	* Number of ICMPv6 RA packets received by NetScaler (OBSOLETE).
	* </pre>
	*/
	public Long get_ipv6toticmprarx() throws Exception {
		return this.ipv6toticmprarx;
	}

	/**
	* <pre>
	* Bytes of IPv6 data transmitted.
	* </pre>
	*/
	public Long get_ipv6tottxbytes() throws Exception {
		return this.ipv6tottxbytes;
	}

	/**
	* <pre>
	* Land-attack packets received. The source and destination addresses are the same. If not dropped, these packets can lock up the appliance.
	* </pre>
	*/
	public Long get_ipv6landattack() throws Exception {
		return this.ipv6landattack;
	}

	/**
	* <pre>
	* IPv6 fragments forwarded to the client or server without reassembly.
	* </pre>
	*/
	public Long get_ipv6fragtotpktsforward() throws Exception {
		return this.ipv6fragtotpktsforward;
	}

	/**
	* <pre>
	* Packets received with a fragment length of 0 bytes.
	* </pre>
	*/
	public Long get_ipv6fragzerolenpkt() throws Exception {
		return this.ipv6fragzerolenpkt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		protocolipv6_stats[] resources = new protocolipv6_stats[1];
		protocolipv6_response result = (protocolipv6_response) service.get_payload_formatter().string_to_resource(protocolipv6_response.class, response);
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
		resources[0] = result.protocolipv6;
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
	* Use this API to fetch the statistics of all protocolipv6_stats resources that are configured on netscaler.
	*/
	public static protocolipv6_stats get(nitro_service service) throws Exception{
		protocolipv6_stats obj = new protocolipv6_stats();
		protocolipv6_stats[] response = (protocolipv6_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all protocolipv6_stats resources that are configured on netscaler.
	*/
	public static protocolipv6_stats get(nitro_service service,  options option) throws Exception{
		protocolipv6_stats obj = new protocolipv6_stats();
		protocolipv6_stats[] response = (protocolipv6_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
