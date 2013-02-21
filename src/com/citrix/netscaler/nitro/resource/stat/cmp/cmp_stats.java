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

package com.citrix.netscaler.nitro.resource.stat.cmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cmp_response extends base_response
{
	public cmp_stats cmp;
}

public class cmp_stats extends base_resource
{
	private Double delbwsaving;
	private Double delcmpratio;
	private Double decomptcpratio;
	private Double decomptcpbandwidthsaving;
	private Double comptcpratio;
	private Double comptcpbandwidthsaving;
	private Double comptotaldatacompressionratio;
	private Double comphttpbandwidthsaving;
	private Double compratio;
	private Long comptotalrequests;
	private Long comprequestsrate;
	private Long comptotalrxbytes;
	private Long comprxbytesrate;
	private Long comptotaltxbytes;
	private Long comptxbytesrate;
	private Long comptotalrxpackets;
	private Long comprxpacketsrate;
	private Long comptotaltxpackets;
	private Long comptxpacketsrate;
	private Long comptcptotalrxbytes;
	private Long comptcprxbytesrate;
	private Long comptcptotalrxpackets;
	private Long comptcprxpacketsrate;
	private Long comptcptotaltxbytes;
	private Long comptcptxbytesrate;
	private Long comptcptotaltxpackets;
	private Long comptcptxpacketsrate;
	private Long comptcptotalquantum;
	private Long comptcpquantumrate;
	private Long comptcptotalpush;
	private Long comptcppushrate;
	private Long comptcptotaleoi;
	private Long comptcpeoirate;
	private Long comptcptotaltimer;
	private Long comptcptimerrate;
	private Long decomptcprxbytes;
	private Long decomptcprxbytesrate;
	private Long decomptcprxpackets;
	private Long decomptcprxpacketsrate;
	private Long decomptcptxbytes;
	private Long decomptcptxbytesrate;
	private Long decomptcptxpackets;
	private Long decomptcptxpacketsrate;
	private Long decomptcperrdata;
	private Long decomptcperrdatarate;
	private Long decomptcperrlessdata;
	private Long decomptcperrlessdatarate;
	private Long decomptcperrmoredata;
	private Long decomptcperrmoredatarate;
	private Long decomptcperrmemory;
	private Long decomptcperrmemoryrate;
	private Long decomptcperrunknown;
	private Long decomptcperrunknownrate;
	private Long delcomptotalrequests;
	private Long delcomprequestsrate;
	private Long delcompdone;
	private Long delcompdonerate;
	private Long delcomptcprxbytes;
	private Long delcomptcprxbytesrate;
	private Long delcomptcptxbytes;
	private Long delcomptcptxbytesrate;
	private Long delcompfirstaccess;
	private Long delcompfirstaccessrate;
	private Long delcomptcprxpackets;
	private Long delcomptcprxpacketsrate;
	private Long delcomptcptxpackets;
	private Long delcomptcptxpacketsrate;
	private Long delcompbaseserved;
	private Long delcompbaseservedrate;
	private Long delcompbasetcptxbytes;
	private Long delcompbasetcptxbytesrate;
	private Long delcomperrbypassed;
	private Long delcomperrbypassedrate;
	private Long delcomperrbfilewhdrfailed;
	private Long delcomperrbfilewhdrfailedrate;
	private Long delcomperrnostoremiss;
	private Long delcomperrnostoremissrate;
	private Long delcomperrreqinfotoobig;
	private Long delcomperrreqinfotoobigrate;
	private Long delcomperrreqinfoallocfail;
	private Long delcomperrreqinfoallocfailrate;
	private Long delcomperrsessallocfail;
	private Long delcomperrsessallocfailrate;
	private Long httptotrxresponsebytes;
	private Long httprxresponsebytesrate;

	/**
	* <pre>
	* Number of basefile bytes transmitted by NetScaler.
	* </pre>
	*/
	public Long get_delcompbasetcptxbytes() throws Exception {
		return this.delcompbasetcptxbytes;
	}

	/**
	* <pre>
	* Bandwidth saving from TCP compression expressed as percentage.
	* </pre>
	*/
	public Double get_comphttpbandwidthsaving() throws Exception {
		return this.comphttpbandwidthsaving;
	}

	/**
	* <pre>
	* Number of times the NetScaler compresses data on receiving a TCP PUSH flag from the server. The PUSH flag ensures that data is compressed immediately without waiting for the buffered data size to reach the quantum size.
	* </pre>
	*/
	public Long get_comptcptotalpush() throws Exception {
		return this.comptcptotalpush;
	}

	/**
	* <pre>
	* Total number of delta compression first accesses.
	* </pre>
	*/
	public Long get_delcompfirstaccess() throws Exception {
		return this.delcompfirstaccess;
	}

	/**
	* <pre>
	* Total number of delta compressions done by NetScaler.
	* </pre>
	*/
	public Long get_delcompdone() throws Exception {
		return this.delcompdone;
	}

	/**
	* <pre>
	* Total number of compressible packets received by NetScaler.
	* </pre>
	*/
	public Long get_comptcptotalrxpackets() throws Exception {
		return this.comptcptotalrxpackets;
	}

	/**
	* <pre>
	* Number of times delta-compression bypassed by NetScaler.
	* </pre>
	*/
	public Long get_delcomperrbypassed() throws Exception {
		return this.delcomperrbypassed;
	}

	/**
	* <pre>
	* Total number of decompressed packets transmitted by NetScaler.
	* </pre>
	*/
	public Long get_decomptcptxpacketsrate() throws Exception {
		return this.decomptcptxpacketsrate;
	}

	/**
	* <pre>
	* Number of basefile bytes transmitted by NetScaler.
	* </pre>
	*/
	public Long get_delcompbasetcptxbytesrate() throws Exception {
		return this.delcompbasetcptxbytesrate;
	}

	/**
	* <pre>
	* Bandwidth saving from delta compression expressed as percentage.
	* </pre>
	*/
	public Double get_delbwsaving() throws Exception {
		return this.delbwsaving;
	}

	/**
	* <pre>
	* Number of HTTP compression requests the NetScaler receives for which the response is successfully compressed. For example, after you enable compression and configure services, if you send requests to the NetScaler with the following header information: “Accept-Encoding: gzip, deflate”, and NetScaler compresses the corresponding response, this counter is incremented.
	* </pre>
	*/
	public Long get_comprequestsrate() throws Exception {
		return this.comprequestsrate;
	}

	/**
	* <pre>
	* Total number of bytes of HTTP response data received.
	* </pre>
	*/
	public Long get_httptotrxresponsebytes() throws Exception {
		return this.httptotrxresponsebytes;
	}

	/**
	* <pre>
	* Number of bytes the NetScaler sends to the client after compressing the response from the server.
	* </pre>
	*/
	public Long get_comptotaltxbytes() throws Exception {
		return this.comptotaltxbytes;
	}

	/**
	* <pre>
	* Number of times the NetScaler compresses data on receiving End Of Input (FIN packet).  When the NetScaler receives End Of Input (FIN packet), it compresses the buffered data immediately without waiting for the buffered data size to reach the quantum size.
	* </pre>
	*/
	public Long get_comptcpeoirate() throws Exception {
		return this.comptcpeoirate;
	}

	/**
	* <pre>
	* Total number of delta-compressed bytes transmitted by NetScaler.
	* </pre>
	*/
	public Long get_delcomptcptxbytes() throws Exception {
		return this.delcomptcptxbytes;
	}

	/**
	* <pre>
	* Number of times requested basefile could not be allocated.
	* </pre>
	*/
	public Long get_delcomperrreqinfoallocfail() throws Exception {
		return this.delcomperrreqinfoallocfail;
	}

	/**
	* <pre>
	* Number of times delta-compression bypassed by NetScaler.
	* </pre>
	*/
	public Long get_delcomperrbypassedrate() throws Exception {
		return this.delcomperrbypassedrate;
	}

	/**
	* <pre>
	* Ratio of compressible data received to compressed data transmitted.If this ratio is one (uncmp:1.0) that means compression is disabled or we are not able to compress even a single compressible packet.
	* </pre>
	*/
	public Double get_delcmpratio() throws Exception {
		return this.delcmpratio;
	}

	/**
	* <pre>
	* Total number of delta compression requests received by NetScaler.
	* </pre>
	*/
	public Long get_delcomprequestsrate() throws Exception {
		return this.delcomprequestsrate;
	}

	/**
	* <pre>
	* Number of times basefile request URL was too large.
	* </pre>
	*/
	public Long get_delcomperrreqinfotoobig() throws Exception {
		return this.delcomperrreqinfotoobig;
	}

	/**
	* <pre>
	* Number of delta-compressible packets received.
	* </pre>
	*/
	public Long get_delcomptcprxpacketsrate() throws Exception {
		return this.delcomptcprxpacketsrate;
	}

	/**
	* <pre>
	* Number of times memory failures occurred while decompressing.
	* </pre>
	*/
	public Long get_decomptcperrmemory() throws Exception {
		return this.decomptcperrmemory;
	}

	/**
	* <pre>
	* Total number of compressed bytes received by NetScaler.
	* </pre>
	*/
	public Long get_decomptcprxbytes() throws Exception {
		return this.decomptcprxbytes;
	}

	/**
	* <pre>
	* Number of TCP packets that the NetScaler sends to the client after compressing the response from the server.
	* </pre>
	*/
	public Long get_comptcptxpacketsrate() throws Exception {
		return this.comptcptxpacketsrate;
	}

	/**
	* <pre>
	* Ratio of total HTTP data received to total HTTP data transmitted.
	* </pre>
	*/
	public Double get_comptotaldatacompressionratio() throws Exception {
		return this.comptotaldatacompressionratio;
	}

	/**
	* <pre>
	* Number of bytes that can be compressed, which the NetScaler receives from the server. This gives the content length of the response that the NetScaler receives from server.
	* </pre>
	*/
	public Long get_comprxbytesrate() throws Exception {
		return this.comprxbytesrate;
	}

	/**
	* <pre>
	* Total number of bytes of HTTP response data received.
	* </pre>
	*/
	public Long get_httprxresponsebytesrate() throws Exception {
		return this.httprxresponsebytesrate;
	}

	/**
	* <pre>
	* Number of times delta compression session could not be allocated.
	* </pre>
	*/
	public Long get_delcomperrsessallocfailrate() throws Exception {
		return this.delcomperrsessallocfailrate;
	}

	/**
	* <pre>
	* Total number of delta-compressed packets transmitted by NetScaler.
	* </pre>
	*/
	public Long get_delcomptcptxpacketsrate() throws Exception {
		return this.delcomptcptxpacketsrate;
	}

	/**
	* <pre>
	* Number of times the NetScaler compresses data on receiving End Of Input (FIN packet).  When the NetScaler receives End Of Input (FIN packet), it compresses the buffered data immediately without waiting for the buffered data size to reach the quantum size.
	* </pre>
	*/
	public Long get_comptcptotaleoi() throws Exception {
		return this.comptcptotaleoi;
	}

	/**
	* <pre>
	* Number of times the NetScaler compresses data on receiving a TCP PUSH flag from the server. The PUSH flag ensures that data is compressed immediately without waiting for the buffered data size to reach the quantum size.
	* </pre>
	*/
	public Long get_comptcppushrate() throws Exception {
		return this.comptcppushrate;
	}

	/**
	* <pre>
	* Number of times memory failures occurred while decompressing.
	* </pre>
	*/
	public Long get_decomptcperrmemoryrate() throws Exception {
		return this.decomptcperrmemoryrate;
	}

	/**
	* <pre>
	* Number of times unknown errors occurred while decompressing.
	* </pre>
	*/
	public Long get_decomptcperrunknownrate() throws Exception {
		return this.decomptcperrunknownrate;
	}

	/**
	* <pre>
	* Bandwidth saving from TCP compression expressed as percentage.
	* </pre>
	*/
	public Double get_comptcpbandwidthsaving() throws Exception {
		return this.comptcpbandwidthsaving;
	}

	/**
	* <pre>
	* Number of times NetScaler received more data than declared by protocol.
	* </pre>
	*/
	public Long get_decomptcperrmoredata() throws Exception {
		return this.decomptcperrmoredata;
	}

	/**
	* <pre>
	* Total number of delta compression first accesses.
	* </pre>
	*/
	public Long get_delcompfirstaccessrate() throws Exception {
		return this.delcompfirstaccessrate;
	}

	/**
	* <pre>
	* Number of HTTP packets that can be compressed, which the NetScaler receives from the server.
	* </pre>
	*/
	public Long get_comprxpacketsrate() throws Exception {
		return this.comprxpacketsrate;
	}

	/**
	* <pre>
	* Number of bytes that can be compressed, which the NetScaler receives from the server. This gives the content length of the response that the NetScaler receives from server.
	* </pre>
	*/
	public Long get_comptotalrxbytes() throws Exception {
		return this.comptotalrxbytes;
	}

	/**
	* <pre>
	* Total number of compressed packets received by NetScaler.
	* </pre>
	*/
	public Long get_decomptcprxpacketsrate() throws Exception {
		return this.decomptcprxpacketsrate;
	}

	/**
	* <pre>
	* Number of times the NetScaler compresses a quantum of data.  NetScaler buffers the data received from the server till it reaches the quantum size and then compresses the buffered data and transmits to the client.
	* </pre>
	*/
	public Long get_comptcpquantumrate() throws Exception {
		return this.comptcpquantumrate;
	}

	/**
	* <pre>
	* Number of bytes the NetScaler sends to the client after compressing the response from the server.
	* </pre>
	*/
	public Long get_comptxbytesrate() throws Exception {
		return this.comptxbytesrate;
	}

	/**
	* <pre>
	* Total number of basefile requests served by NetScaler.
	* </pre>
	*/
	public Long get_delcompbaseservedrate() throws Exception {
		return this.delcompbaseservedrate;
	}

	/**
	* <pre>
	* Total number of decompressed bytes transmitted by NetScaler.
	* </pre>
	*/
	public Long get_decomptcptxbytes() throws Exception {
		return this.decomptcptxbytes;
	}

	/**
	* <pre>
	* Number of bytes that the NetScaler sends to the client after compressing the response from the server.
	* </pre>
	*/
	public Long get_comptcptxbytesrate() throws Exception {
		return this.comptcptxbytesrate;
	}

	/**
	* <pre>
	* Number of delta-compressible packets received.
	* </pre>
	*/
	public Long get_delcomptcprxpackets() throws Exception {
		return this.delcomptcprxpackets;
	}

	/**
	* <pre>
	* Total number of compressed packets received by NetScaler.
	* </pre>
	*/
	public Long get_decomptcprxpackets() throws Exception {
		return this.decomptcprxpackets;
	}

	/**
	* <pre>
	* Number of times the NetScaler compresses data on expiration of data accumulation timer. The timer expires if the server response is very slow and consequently, the NetScaler does not receive response for a certain amount of time.  Under such a condition, the NetScaler compresses the buffered data immediately without waiting for the buffered data size to reach the quantum size.
	* </pre>
	*/
	public Long get_comptcptotaltimer() throws Exception {
		return this.comptcptotaltimer;
	}

	/**
	* <pre>
	* Number of times basefile was not found in NetScaler cache.
	* </pre>
	*/
	public Long get_delcomperrnostoremissrate() throws Exception {
		return this.delcomperrnostoremissrate;
	}

	/**
	* <pre>
	* Number of times basefile could not be updated in NetScaler cache.
	* </pre>
	*/
	public Long get_delcomperrbfilewhdrfailed() throws Exception {
		return this.delcomperrbfilewhdrfailed;
	}

	/**
	* <pre>
	* Number of times NetScaler received more data than declared by protocol.
	* </pre>
	*/
	public Long get_decomptcperrmoredatarate() throws Exception {
		return this.decomptcperrmoredatarate;
	}

	/**
	* <pre>
	* Bandwidth saving from TCP compression expressed as percentage.
	* </pre>
	*/
	public Double get_decomptcpbandwidthsaving() throws Exception {
		return this.decomptcpbandwidthsaving;
	}

	/**
	* <pre>
	* Number of times delta compression session could not be allocated.
	* </pre>
	*/
	public Long get_delcomperrsessallocfail() throws Exception {
		return this.delcomperrsessallocfail;
	}

	/**
	* <pre>
	* Total number of basefile requests served by NetScaler.
	* </pre>
	*/
	public Long get_delcompbaseserved() throws Exception {
		return this.delcompbaseserved;
	}

	/**
	* <pre>
	* Ratio of the compressible data received from the server to the compressed data sent to the client.
	* </pre>
	*/
	public Double get_compratio() throws Exception {
		return this.compratio;
	}

	/**
	* <pre>
	* Total number of decompressed bytes transmitted by NetScaler.
	* </pre>
	*/
	public Long get_decomptcptxbytesrate() throws Exception {
		return this.decomptcptxbytesrate;
	}

	/**
	* <pre>
	* Number of times NetScaler received less data than declared by protocol.
	* </pre>
	*/
	public Long get_decomptcperrlessdata() throws Exception {
		return this.decomptcperrlessdata;
	}

	/**
	* <pre>
	* Number of bytes that can be compressed, which the NetScaler receives from the server. This gives the content length of the response that the NetScaler receives from server.
	* </pre>
	*/
	public Long get_comptcprxbytesrate() throws Exception {
		return this.comptcprxbytesrate;
	}

	/**
	* <pre>
	* Number of HTTP packets that the NetScaler sends to the client after compressing the response from the server.
	* </pre>
	*/
	public Long get_comptxpacketsrate() throws Exception {
		return this.comptxpacketsrate;
	}

	/**
	* <pre>
	* Total number of compressible packets received by NetScaler.
	* </pre>
	*/
	public Long get_comptcprxpacketsrate() throws Exception {
		return this.comptcprxpacketsrate;
	}

	/**
	* <pre>
	* Number of HTTP packets that the NetScaler sends to the client after compressing the response from the server.
	* </pre>
	*/
	public Long get_comptotaltxpackets() throws Exception {
		return this.comptotaltxpackets;
	}

	/**
	* <pre>
	* Total number of delta-compressed bytes transmitted by NetScaler.
	* </pre>
	*/
	public Long get_delcomptcptxbytesrate() throws Exception {
		return this.delcomptcptxbytesrate;
	}

	/**
	* <pre>
	* Number of times basefile request URL was too large.
	* </pre>
	*/
	public Long get_delcomperrreqinfotoobigrate() throws Exception {
		return this.delcomperrreqinfotoobigrate;
	}

	/**
	* <pre>
	* Total number of compressed bytes received by NetScaler.
	* </pre>
	*/
	public Long get_decomptcprxbytesrate() throws Exception {
		return this.decomptcprxbytesrate;
	}

	/**
	* <pre>
	* Number of data errors encountered while decompressing.
	* </pre>
	*/
	public Long get_decomptcperrdatarate() throws Exception {
		return this.decomptcperrdatarate;
	}

	/**
	* <pre>
	* Number of HTTP compression requests the NetScaler receives for which the response is successfully compressed. For example, after you enable compression and configure services, if you send requests to the NetScaler with the following header information: “Accept-Encoding: gzip, deflate”, and NetScaler compresses the corresponding response, this counter is incremented.
	* </pre>
	*/
	public Long get_comptotalrequests() throws Exception {
		return this.comptotalrequests;
	}

	/**
	* <pre>
	* Number of times unknown errors occurred while decompressing.
	* </pre>
	*/
	public Long get_decomptcperrunknown() throws Exception {
		return this.decomptcperrunknown;
	}

	/**
	* <pre>
	* Number of HTTP packets that can be compressed, which the NetScaler receives from the server.
	* </pre>
	*/
	public Long get_comptotalrxpackets() throws Exception {
		return this.comptotalrxpackets;
	}

	/**
	* <pre>
	* Total number of delta-compressible bytes received by NetScaler.
	* </pre>
	*/
	public Long get_delcomptcprxbytes() throws Exception {
		return this.delcomptcprxbytes;
	}

	/**
	* <pre>
	* Number of times the NetScaler compresses data on expiration of data accumulation timer. The timer expires if the server response is very slow and consequently, the NetScaler does not receive response for a certain amount of time.  Under such a condition, the NetScaler compresses the buffered data immediately without waiting for the buffered data size to reach the quantum size.
	* </pre>
	*/
	public Long get_comptcptimerrate() throws Exception {
		return this.comptcptimerrate;
	}

	/**
	* <pre>
	* Number of times the NetScaler compresses a quantum of data.  NetScaler buffers the data received from the server till it reaches the quantum size and then compresses the buffered data and transmits to the client.
	* </pre>
	*/
	public Long get_comptcptotalquantum() throws Exception {
		return this.comptcptotalquantum;
	}

	/**
	* <pre>
	* Number of TCP packets that the NetScaler sends to the client after compressing the response from the server.
	* </pre>
	*/
	public Long get_comptcptotaltxpackets() throws Exception {
		return this.comptcptotaltxpackets;
	}

	/**
	* <pre>
	* Total number of delta compressions done by NetScaler.
	* </pre>
	*/
	public Long get_delcompdonerate() throws Exception {
		return this.delcompdonerate;
	}

	/**
	* <pre>
	* Total number of delta-compressed packets transmitted by NetScaler.
	* </pre>
	*/
	public Long get_delcomptcptxpackets() throws Exception {
		return this.delcomptcptxpackets;
	}

	/**
	* <pre>
	* Ratio of decompressed data transmitted to compressed data received.
	* </pre>
	*/
	public Double get_decomptcpratio() throws Exception {
		return this.decomptcpratio;
	}

	/**
	* <pre>
	* Number of times NetScaler received less data than declared by protocol.
	* </pre>
	*/
	public Long get_decomptcperrlessdatarate() throws Exception {
		return this.decomptcperrlessdatarate;
	}

	/**
	* <pre>
	* Number of bytes that can be compressed, which the NetScaler receives from the server. This gives the content length of the response that the NetScaler receives from server.
	* </pre>
	*/
	public Long get_comptcptotalrxbytes() throws Exception {
		return this.comptcptotalrxbytes;
	}

	/**
	* <pre>
	* Total number of delta-compressible bytes received by NetScaler.
	* </pre>
	*/
	public Long get_delcomptcprxbytesrate() throws Exception {
		return this.delcomptcprxbytesrate;
	}

	/**
	* <pre>
	* Number of bytes that the NetScaler sends to the client after compressing the response from the server.
	* </pre>
	*/
	public Long get_comptcptotaltxbytes() throws Exception {
		return this.comptcptotaltxbytes;
	}

	/**
	* <pre>
	* Total number of decompressed packets transmitted by NetScaler.
	* </pre>
	*/
	public Long get_decomptcptxpackets() throws Exception {
		return this.decomptcptxpackets;
	}

	/**
	* <pre>
	* Total number of delta compression requests received by NetScaler.
	* </pre>
	*/
	public Long get_delcomptotalrequests() throws Exception {
		return this.delcomptotalrequests;
	}

	/**
	* <pre>
	* Number of times requested basefile could not be allocated.
	* </pre>
	*/
	public Long get_delcomperrreqinfoallocfailrate() throws Exception {
		return this.delcomperrreqinfoallocfailrate;
	}

	/**
	* <pre>
	* Number of times basefile could not be updated in NetScaler cache.
	* </pre>
	*/
	public Long get_delcomperrbfilewhdrfailedrate() throws Exception {
		return this.delcomperrbfilewhdrfailedrate;
	}

	/**
	* <pre>
	* Number of times basefile was not found in NetScaler cache.
	* </pre>
	*/
	public Long get_delcomperrnostoremiss() throws Exception {
		return this.delcomperrnostoremiss;
	}

	/**
	* <pre>
	* Ratio of compressible data received to compressed data transmitted.If this ratio is one (uncmp:1.0) that means compression is disabled or we are not able to compress even a single compressible packet.
	* </pre>
	*/
	public Double get_comptcpratio() throws Exception {
		return this.comptcpratio;
	}

	/**
	* <pre>
	* Number of data errors encountered while decompressing.
	* </pre>
	*/
	public Long get_decomptcperrdata() throws Exception {
		return this.decomptcperrdata;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		cmp_stats[] resources = new cmp_stats[1];
		cmp_response result = (cmp_response) service.get_payload_formatter().string_to_resource(cmp_response.class, response);
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
		resources[0] = result.cmp;
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
	* Use this API to fetch the statistics of all cmp_stats resources that are configured on netscaler.
	*/
	public static cmp_stats get(nitro_service service) throws Exception{
		cmp_stats obj = new cmp_stats();
		cmp_stats[] response = (cmp_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all cmp_stats resources that are configured on netscaler.
	*/
	public static cmp_stats get(nitro_service service,  options option) throws Exception{
		cmp_stats obj = new cmp_stats();
		cmp_stats[] response = (cmp_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
