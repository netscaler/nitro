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

package com.citrix.netscaler.nitro.resource.stat.qos;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class qos_response extends base_response
{
	public qos_stats qos;
}

public class qos_stats extends base_resource
{
	private String clearstats;
	private Long ipcmessagessent;
	private Long ipcmessagessentrate;
	private Long ipcmessagesfailed;
	private Long ipcmessagesfailedrate;
	private Long ipcmessagesreceived;
	private Long ipcmessagesreceivedrate;
	private Long ipcpe2qossent;
	private Long ipcpe2qossentrate;
	private Long ipcpe2qosfailed;
	private Long ipcpe2qosfailedrate;
	private Long ipcpe2qosreceived;
	private Long ipcpe2qosreceivedrate;
	private Long qosbytesdropped;
	private Long qosbytesdroppedrate;
	private Long qosbytessentnotclassified;
	private Long qosbytessentnotclassifiedrate;
	private Long qosbytesdroppednoconnection;
	private Long qosbytesdroppednoconnectionrate;
	private Long qosinputpackets;
	private Long qosinputpacketsrate;
	private Long qosoutputpackets;
	private Long qosoutputpacketsrate;
	private Long qosdroppackets;
	private Long qosdroppacketsrate;
	private Long qosrewritemacs;
	private Long qosrewritemacsrate;
	private Long qospacketsunclassified;
	private Long qospacketsunclassifiedrate;
	private Long qospacketsclassified;
	private Long qospacketsclassifiedrate;
	private Long qoslearnedmac;
	private Long qoslearnedmacrate;
	private Long qosinputbytes;
	private Long qosinputbytesrate;
	private Long qosoutputbytes;
	private Long qosoutputbytesrate;
	private Long qosfreeheldlist;
	private Long qoslink00sent;
	private Long qoslink00sentrate;
	private Long qoslink00drop;
	private Long qoslink00droprate;
	private Long qoslink01sent;
	private Long qoslink01sentrate;
	private Long qoslink01drop;
	private Long qoslink01droprate;
	private Long qoslink02sent;
	private Long qoslink02sentrate;
	private Long qoslink02drop;
	private Long qoslink02droprate;
	private Long qoslink03sent;
	private Long qoslink03sentrate;
	private Long qoslink03drop;
	private Long qoslink03droprate;
	private Long qoslink04sent;
	private Long qoslink04sentrate;
	private Long qoslink04drop;
	private Long qoslink04droprate;
	private Long qoslink05sent;
	private Long qoslink05sentrate;
	private Long qoslink05drop;
	private Long qoslink05droprate;
	private Long qoslink06sent;
	private Long qoslink06sentrate;
	private Long qoslink06drop;
	private Long qoslink06droprate;
	private Long qoslink07sent;
	private Long qoslink07sentrate;
	private Long qoslink07drop;
	private Long qoslink07droprate;
	private Long qoslink08sent;
	private Long qoslink08sentrate;
	private Long qoslink08drop;
	private Long qoslink08droprate;
	private Long qoslink09sent;
	private Long qoslink09sentrate;
	private Long qoslink09drop;
	private Long qoslink09droprate;
	private Long qoslink10sent;
	private Long qoslink10sentrate;
	private Long qoslink10drop;
	private Long qoslink10droprate;

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
	* Rate (/s) counter for qoslink06drop
	* </pre>
	*/
	public Long get_qoslink06droprate() throws Exception {
		return this.qoslink06droprate;
	}

	/**
	* <pre>
	* IPC messages failed to send to qos system.
	* </pre>
	*/
	public Long get_ipcpe2qosfailed() throws Exception {
		return this.ipcpe2qosfailed;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 02
	* </pre>
	*/
	public Long get_qoslink02sent() throws Exception {
		return this.qoslink02sent;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 10
	* </pre>
	*/
	public Long get_qoslink10sent() throws Exception {
		return this.qoslink10sent;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipcmessagessent
	* </pre>
	*/
	public Long get_ipcmessagessentrate() throws Exception {
		return this.ipcmessagessentrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink02sent
	* </pre>
	*/
	public Long get_qoslink02sentrate() throws Exception {
		return this.qoslink02sentrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosrewritemacs
	* </pre>
	*/
	public Long get_qosrewritemacsrate() throws Exception {
		return this.qosrewritemacsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink08sent
	* </pre>
	*/
	public Long get_qoslink08sentrate() throws Exception {
		return this.qoslink08sentrate;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 04
	* </pre>
	*/
	public Long get_qoslink04drop() throws Exception {
		return this.qoslink04drop;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink01drop
	* </pre>
	*/
	public Long get_qoslink01droprate() throws Exception {
		return this.qoslink01droprate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosoutputbytes
	* </pre>
	*/
	public Long get_qosoutputbytesrate() throws Exception {
		return this.qosoutputbytesrate;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 08
	* </pre>
	*/
	public Long get_qoslink08drop() throws Exception {
		return this.qoslink08drop;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 05
	* </pre>
	*/
	public Long get_qoslink05sent() throws Exception {
		return this.qoslink05sent;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink10drop
	* </pre>
	*/
	public Long get_qoslink10droprate() throws Exception {
		return this.qoslink10droprate;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 00
	* </pre>
	*/
	public Long get_qoslink00drop() throws Exception {
		return this.qoslink00drop;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipcmessagesfailed
	* </pre>
	*/
	public Long get_ipcmessagesfailedrate() throws Exception {
		return this.ipcmessagesfailedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink05drop
	* </pre>
	*/
	public Long get_qoslink05droprate() throws Exception {
		return this.qoslink05droprate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink08drop
	* </pre>
	*/
	public Long get_qoslink08droprate() throws Exception {
		return this.qoslink08droprate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosbytessentnotclassified
	* </pre>
	*/
	public Long get_qosbytessentnotclassifiedrate() throws Exception {
		return this.qosbytessentnotclassifiedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink03drop
	* </pre>
	*/
	public Long get_qoslink03droprate() throws Exception {
		return this.qoslink03droprate;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 09
	* </pre>
	*/
	public Long get_qoslink09sent() throws Exception {
		return this.qoslink09sent;
	}

	/**
	* <pre>
	* Rate (/s) counter for qospacketsunclassified
	* </pre>
	*/
	public Long get_qospacketsunclassifiedrate() throws Exception {
		return this.qospacketsunclassifiedrate;
	}

	/**
	* <pre>
	* No. more packets QoS can hold onto.
	* </pre>
	*/
	public Long get_qosfreeheldlist() throws Exception {
		return this.qosfreeheldlist;
	}

	/**
	* <pre>
	* Number of packets with classification.
	* </pre>
	*/
	public Long get_qospacketsclassified() throws Exception {
		return this.qospacketsclassified;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosbytesdroppednoconnection
	* </pre>
	*/
	public Long get_qosbytesdroppednoconnectionrate() throws Exception {
		return this.qosbytesdroppednoconnectionrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink01sent
	* </pre>
	*/
	public Long get_qoslink01sentrate() throws Exception {
		return this.qoslink01sentrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink09sent
	* </pre>
	*/
	public Long get_qoslink09sentrate() throws Exception {
		return this.qoslink09sentrate;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 03
	* </pre>
	*/
	public Long get_qoslink03drop() throws Exception {
		return this.qoslink03drop;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink03sent
	* </pre>
	*/
	public Long get_qoslink03sentrate() throws Exception {
		return this.qoslink03sentrate;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 02
	* </pre>
	*/
	public Long get_qoslink02drop() throws Exception {
		return this.qoslink02drop;
	}

	/**
	* <pre>
	* Bytes sent to QoS for scheduling
	* </pre>
	*/
	public Long get_qosinputbytes() throws Exception {
		return this.qosinputbytes;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosinputpackets
	* </pre>
	*/
	public Long get_qosinputpacketsrate() throws Exception {
		return this.qosinputpacketsrate;
	}

	/**
	* <pre>
	* Bytes received from QoS to be sent
	* </pre>
	*/
	public Long get_qosoutputbytes() throws Exception {
		return this.qosoutputbytes;
	}

	/**
	* <pre>
	* IPC messages failed to send from qos system.
	* </pre>
	*/
	public Long get_ipcmessagesfailed() throws Exception {
		return this.ipcmessagesfailed;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink07sent
	* </pre>
	*/
	public Long get_qoslink07sentrate() throws Exception {
		return this.qoslink07sentrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosinputbytes
	* </pre>
	*/
	public Long get_qosinputbytesrate() throws Exception {
		return this.qosinputbytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink04drop
	* </pre>
	*/
	public Long get_qoslink04droprate() throws Exception {
		return this.qoslink04droprate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipcpe2qosfailed
	* </pre>
	*/
	public Long get_ipcpe2qosfailedrate() throws Exception {
		return this.ipcpe2qosfailedrate;
	}

	/**
	* <pre>
	* Packets from QoS to be sent
	* </pre>
	*/
	public Long get_qosoutputpackets() throws Exception {
		return this.qosoutputpackets;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosbytesdropped
	* </pre>
	*/
	public Long get_qosbytesdroppedrate() throws Exception {
		return this.qosbytesdroppedrate;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 06
	* </pre>
	*/
	public Long get_qoslink06sent() throws Exception {
		return this.qoslink06sent;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 04
	* </pre>
	*/
	public Long get_qoslink04sent() throws Exception {
		return this.qoslink04sent;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 00
	* </pre>
	*/
	public Long get_qoslink00sent() throws Exception {
		return this.qoslink00sent;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 07
	* </pre>
	*/
	public Long get_qoslink07sent() throws Exception {
		return this.qoslink07sent;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink09drop
	* </pre>
	*/
	public Long get_qoslink09droprate() throws Exception {
		return this.qoslink09droprate;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 10
	* </pre>
	*/
	public Long get_qoslink10drop() throws Exception {
		return this.qoslink10drop;
	}

	/**
	* <pre>
	* Number of packets without classification.
	* </pre>
	*/
	public Long get_qospacketsunclassified() throws Exception {
		return this.qospacketsunclassified;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosoutputpackets
	* </pre>
	*/
	public Long get_qosoutputpacketsrate() throws Exception {
		return this.qosoutputpacketsrate;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 03
	* </pre>
	*/
	public Long get_qoslink03sent() throws Exception {
		return this.qoslink03sent;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink05sent
	* </pre>
	*/
	public Long get_qoslink05sentrate() throws Exception {
		return this.qoslink05sentrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink04sent
	* </pre>
	*/
	public Long get_qoslink04sentrate() throws Exception {
		return this.qoslink04sentrate;
	}

	/**
	* <pre>
	* Bytes QoS marked for drop
	* </pre>
	*/
	public Long get_qosbytesdropped() throws Exception {
		return this.qosbytesdropped;
	}

	/**
	* <pre>
	* Packets Dropped by QoS.
	* </pre>
	*/
	public Long get_qosdroppackets() throws Exception {
		return this.qosdroppackets;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 06
	* </pre>
	*/
	public Long get_qoslink06drop() throws Exception {
		return this.qoslink06drop;
	}

	/**
	* <pre>
	* Packets sent to QoS for scheduling.
	* </pre>
	*/
	public Long get_qosinputpackets() throws Exception {
		return this.qosinputpackets;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink07drop
	* </pre>
	*/
	public Long get_qoslink07droprate() throws Exception {
		return this.qoslink07droprate;
	}

	/**
	* <pre>
	* IPC messages received by qos.
	* </pre>
	*/
	public Long get_ipcmessagesreceived() throws Exception {
		return this.ipcmessagesreceived;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 09
	* </pre>
	*/
	public Long get_qoslink09drop() throws Exception {
		return this.qoslink09drop;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink02drop
	* </pre>
	*/
	public Long get_qoslink02droprate() throws Exception {
		return this.qoslink02droprate;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 07
	* </pre>
	*/
	public Long get_qoslink07drop() throws Exception {
		return this.qoslink07drop;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 05
	* </pre>
	*/
	public Long get_qoslink05drop() throws Exception {
		return this.qoslink05drop;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipcpe2qosreceived
	* </pre>
	*/
	public Long get_ipcpe2qosreceivedrate() throws Exception {
		return this.ipcpe2qosreceivedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink00sent
	* </pre>
	*/
	public Long get_qoslink00sentrate() throws Exception {
		return this.qoslink00sentrate;
	}

	/**
	* <pre>
	* IPC messages sent to qos system.
	* </pre>
	*/
	public Long get_ipcpe2qossent() throws Exception {
		return this.ipcpe2qossent;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 01
	* </pre>
	*/
	public Long get_qoslink01sent() throws Exception {
		return this.qoslink01sent;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslearnedmac
	* </pre>
	*/
	public Long get_qoslearnedmacrate() throws Exception {
		return this.qoslearnedmacrate;
	}

	/**
	* <pre>
	* QoS bytes sent on Link 08
	* </pre>
	*/
	public Long get_qoslink08sent() throws Exception {
		return this.qoslink08sent;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink06sent
	* </pre>
	*/
	public Long get_qoslink06sentrate() throws Exception {
		return this.qoslink06sentrate;
	}

	/**
	* <pre>
	* QoS bytes dropped on Link 01
	* </pre>
	*/
	public Long get_qoslink01drop() throws Exception {
		return this.qoslink01drop;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipcmessagesreceived
	* </pre>
	*/
	public Long get_ipcmessagesreceivedrate() throws Exception {
		return this.ipcmessagesreceivedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ipcpe2qossent
	* </pre>
	*/
	public Long get_ipcpe2qossentrate() throws Exception {
		return this.ipcpe2qossentrate;
	}

	/**
	* <pre>
	* Bytes scheduled by QoS that were not classified.
	* </pre>
	*/
	public Long get_qosbytessentnotclassified() throws Exception {
		return this.qosbytessentnotclassified;
	}

	/**
	* <pre>
	* QoS learned true MAC
	* </pre>
	*/
	public Long get_qoslearnedmac() throws Exception {
		return this.qoslearnedmac;
	}

	/**
	* <pre>
	* IPC messages sent from qos system.
	* </pre>
	*/
	public Long get_ipcmessagessent() throws Exception {
		return this.ipcmessagessent;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink00drop
	* </pre>
	*/
	public Long get_qoslink00droprate() throws Exception {
		return this.qoslink00droprate;
	}

	/**
	* <pre>
	* Rate (/s) counter for qoslink10sent
	* </pre>
	*/
	public Long get_qoslink10sentrate() throws Exception {
		return this.qoslink10sentrate;
	}

	/**
	* <pre>
	* IPC messages received from qos system.
	* </pre>
	*/
	public Long get_ipcpe2qosreceived() throws Exception {
		return this.ipcpe2qosreceived;
	}

	/**
	* <pre>
	* Rate (/s) counter for qosdroppackets
	* </pre>
	*/
	public Long get_qosdroppacketsrate() throws Exception {
		return this.qosdroppacketsrate;
	}

	/**
	* <pre>
	* Bytes dropped by QoS when no connection was found.
	* </pre>
	*/
	public Long get_qosbytesdroppednoconnection() throws Exception {
		return this.qosbytesdroppednoconnection;
	}

	/**
	* <pre>
	* Rate (/s) counter for qospacketsclassified
	* </pre>
	*/
	public Long get_qospacketsclassifiedrate() throws Exception {
		return this.qospacketsclassifiedrate;
	}

	/**
	* <pre>
	* Number of packets with inband classification in source MAC.
	* </pre>
	*/
	public Long get_qosrewritemacs() throws Exception {
		return this.qosrewritemacs;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		qos_stats[] resources = new qos_stats[1];
		qos_response result = (qos_response) service.get_payload_formatter().string_to_resource(qos_response.class, response);
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
		resources[0] = result.qos;
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
	* Use this API to fetch the statistics of all qos_stats resources that are configured on netscaler.
	*/
	public static qos_stats get(nitro_service service) throws Exception{
		qos_stats obj = new qos_stats();
		qos_stats[] response = (qos_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all qos_stats resources that are configured on netscaler.
	*/
	public static qos_stats get(nitro_service service,  options option) throws Exception{
		qos_stats obj = new qos_stats();
		qos_stats[] response = (qos_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
