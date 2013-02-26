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

class inat_response extends base_response
{
	public inat_stats[] inat;
}
/**
* Statistics for inbound nat resource.
*/

public class inat_stats extends base_resource
{
	private String name;
	private Long nat46tottcp46;
	private Long nat46tcp46rate;
	private Long nat46totudp46;
	private Long nat46udp46rate;
	private Long nat46toticmp46;
	private Long nat46icmp46rate;
	private Long nat46totdrop46;
	private Long nat46drop46rate;
	private Long nat46tottcp64;
	private Long nat46tcp64rate;
	private Long nat46totudp64;
	private Long nat46udp64rate;
	private Long nat46toticmp64;
	private Long nat46icmp64rate;
	private Long nat46totdrop64;
	private Long nat46drop64rate;
	private Long inatnat46tcp46;
	private Long inatnat46tcp46rate;
	private Long inatnat46udp46;
	private Long inatnat46udp46rate;
	private Long inatnat46icmp46;
	private Long inatnat46icmp46rate;
	private Long inatnat46drop46;
	private Long inatnat46drop46rate;
	private Long inatnat46tcp64;
	private Long inatnat46tcp64rate;
	private Long inatnat46udp64;
	private Long inatnat46udp64rate;
	private Long inatnat46icmp64;
	private Long inatnat46icmp64rate;
	private Long inatnat46drop64;
	private Long inatnat46drop64rate;

	/**
	* <pre>
	* The INAT.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The INAT.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Total UDP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_nat46udp64rate() throws Exception {
		return this.nat46udp64rate;
	}

	/**
	* <pre>
	* Total IPV6 packets dropped.
	* </pre>
	*/
	public Long get_nat46totdrop64() throws Exception {
		return this.nat46totdrop64;
	}

	/**
	* <pre>
	* Total UDP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_nat46totudp46() throws Exception {
		return this.nat46totudp46;
	}

	/**
	* <pre>
	* Total ICMP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_nat46icmp64rate() throws Exception {
		return this.nat46icmp64rate;
	}

	/**
	* <pre>
	* TCP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_inatnat46tcp46() throws Exception {
		return this.inatnat46tcp46;
	}

	/**
	* <pre>
	* Total IPV4 packets dropped.
	* </pre>
	*/
	public Long get_nat46totdrop46() throws Exception {
		return this.nat46totdrop46;
	}

	/**
	* <pre>
	* TCP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_inatnat46tcp64() throws Exception {
		return this.inatnat46tcp64;
	}

	/**
	* <pre>
	* IPV4 packets dropped.
	* </pre>
	*/
	public Long get_inatnat46drop46() throws Exception {
		return this.inatnat46drop46;
	}

	/**
	* <pre>
	* IPV6 packets dropped.
	* </pre>
	*/
	public Long get_inatnat46drop64() throws Exception {
		return this.inatnat46drop64;
	}

	/**
	* <pre>
	* UDP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_inatnat46udp46() throws Exception {
		return this.inatnat46udp46;
	}

	/**
	* <pre>
	* Total TCP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_nat46tottcp64() throws Exception {
		return this.nat46tottcp64;
	}

	/**
	* <pre>
	* Total IPV4 packets dropped.
	* </pre>
	*/
	public Long get_nat46drop46rate() throws Exception {
		return this.nat46drop46rate;
	}

	/**
	* <pre>
	* IPV4 packets dropped.
	* </pre>
	*/
	public Long get_inatnat46drop46rate() throws Exception {
		return this.inatnat46drop46rate;
	}

	/**
	* <pre>
	* TCP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_inatnat46tcp64rate() throws Exception {
		return this.inatnat46tcp64rate;
	}

	/**
	* <pre>
	* ICMP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_inatnat46icmp64() throws Exception {
		return this.inatnat46icmp64;
	}

	/**
	* <pre>
	* Total IPV6 packets dropped.
	* </pre>
	*/
	public Long get_nat46drop64rate() throws Exception {
		return this.nat46drop64rate;
	}

	/**
	* <pre>
	* TCP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_inatnat46tcp46rate() throws Exception {
		return this.inatnat46tcp46rate;
	}

	/**
	* <pre>
	* Total TCP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_nat46tottcp46() throws Exception {
		return this.nat46tottcp46;
	}

	/**
	* <pre>
	* Total ICMP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_nat46toticmp46() throws Exception {
		return this.nat46toticmp46;
	}

	/**
	* <pre>
	* ICMP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_inatnat46icmp46rate() throws Exception {
		return this.inatnat46icmp46rate;
	}

	/**
	* <pre>
	* UDP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_inatnat46udp64() throws Exception {
		return this.inatnat46udp64;
	}

	/**
	* <pre>
	* Total TCP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_nat46tcp46rate() throws Exception {
		return this.nat46tcp46rate;
	}

	/**
	* <pre>
	* IPV6 packets dropped.
	* </pre>
	*/
	public Long get_inatnat46drop64rate() throws Exception {
		return this.inatnat46drop64rate;
	}

	/**
	* <pre>
	* UDP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_inatnat46udp64rate() throws Exception {
		return this.inatnat46udp64rate;
	}

	/**
	* <pre>
	* Total ICMP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_nat46icmp46rate() throws Exception {
		return this.nat46icmp46rate;
	}

	/**
	* <pre>
	* ICMP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_inatnat46icmp46() throws Exception {
		return this.inatnat46icmp46;
	}

	/**
	* <pre>
	* ICMP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_inatnat46icmp64rate() throws Exception {
		return this.inatnat46icmp64rate;
	}

	/**
	* <pre>
	* Total TCP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_nat46tcp64rate() throws Exception {
		return this.nat46tcp64rate;
	}

	/**
	* <pre>
	* Total UDP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_nat46totudp64() throws Exception {
		return this.nat46totudp64;
	}

	/**
	* <pre>
	* Total UDP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_nat46udp46rate() throws Exception {
		return this.nat46udp46rate;
	}

	/**
	* <pre>
	* Total ICMP packets translated (V6->v4).
	* </pre>
	*/
	public Long get_nat46toticmp64() throws Exception {
		return this.nat46toticmp64;
	}

	/**
	* <pre>
	* UDP packets translated (V4->v6).
	* </pre>
	*/
	public Long get_inatnat46udp46rate() throws Exception {
		return this.inatnat46udp46rate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		inat_response result = (inat_response) service.get_payload_formatter().string_to_resource(inat_response.class, response);
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
		return result.inat;
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
	* Use this API to fetch the statistics of all inat_stats resources that are configured on netscaler.
	*/
	public static inat_stats[] get(nitro_service service) throws Exception{
		inat_stats obj = new inat_stats();
		inat_stats[] response = (inat_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all inat_stats resources that are configured on netscaler.
	*/
	public static inat_stats[] get(nitro_service service, options option) throws Exception{
		inat_stats obj = new inat_stats();
		inat_stats[] response = (inat_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of inat_stats resource of given name .
	*/
	public static inat_stats get(nitro_service service, String name) throws Exception{
		inat_stats obj = new inat_stats();
		obj.set_name(name);
		inat_stats response = (inat_stats) obj.stat_resource(service);
		return response;
	}

}
