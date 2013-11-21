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

class protocolhttp_response extends base_response
{
	public protocolhttp_stats protocolhttp;
}
/**
* Statistics for HTTP resource.
*/

public class protocolhttp_stats extends base_resource
{
	private String clearstats;
	private Long httptotrequests;
	private Long httprequestsrate;
	private Long httptotresponses;
	private Long httpresponsesrate;
	private Long httptotrxrequestbytes;
	private Long httprxrequestbytesrate;
	private Long httptotrxresponsebytes;
	private Long httprxresponsebytesrate;
	private Long httptotgets;
	private Long httpgetsrate;
	private Long httptotposts;
	private Long httppostsrate;
	private Long httptotothers;
	private Long httptohersrate;
	private Long httptot10requests;
	private Long http10requestsrate;
	private Long httptot11requests;
	private Long http11requestsrate;
	private Long httptotclenrequests;
	private Long httpclenrequestsrate;
	private Long httptotchunkedrequests;
	private Long httpchunkedrequestsrate;
	private Long httptottxrequestbytes;
	private Long httptxrequestbytesrate;
	private Long httptot10responses;
	private Long http10responsesrate;
	private Long httptot11responses;
	private Long http11responsesrate;
	private Long httptotclenresponses;
	private Long httpclenresponsesrate;
	private Long httptotchunkedresponses;
	private Long httpchunkedresponsesrate;
	private Long httperrnoreusemultipart;
	private Long httperrnoreusemultipartrate;
	private Long httptotnoclenchunkresponses;
	private Long httpnoclenchunkresponsesrate;
	private Long httptottxresponsebytes;
	private Long httptxresponsebytesrate;
	private Long httperrincompleteheaders;
	private Long httperrincompleterequests;
	private Long httperrincompleterequestsrate;
	private Long httperrincompleteresponses;
	private Long httperrincompleteresponsesrate;
	private Long httperrserverbusy;
	private Long httperrserverbusyrate;
	private Long httperrlargecontent;
	private Long httperrlargechunk;
	private Long httperrlargectlen;
	private Long spdy2totstreams;
	private Long spdy2streamsrate;

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
	* Total number of requests received over SPDY
	* </pre>
	*/
	public Long get_spdy2totstreams() throws Exception {
		return this.spdy2totstreams;
	}

	/**
	* <pre>
	* Total number of HTTP responses sent in which the Content-length field of the HTTP header has been set. Content-length specifies the length of the content, in bytes, in the associated HTTP body.
	* </pre>
	*/
	public Long get_httptotclenresponses() throws Exception {
		return this.httptotclenresponses;
	}

	/**
	* <pre>
	* Total number of HTTP multi-part responses sent. In multi-part responses, one or more entities are encapsulated within the body of a single message.
	* </pre>
	*/
	public Long get_httperrnoreusemultipart() throws Exception {
		return this.httperrnoreusemultipart;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotrxrequestbytes
	* </pre>
	*/
	public Long get_httprxrequestbytesrate() throws Exception {
		return this.httprxrequestbytesrate;
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
	* Total number of HTTP responses sent in which the Transfer-Encoding field of the HTTP header has been set to chunked. This setting is used when the server wants to start sending the response before knowing its total length. The server breaks the response into chunks and sends them in sequence, inserting the length of each chunk before the actual data. The message ends with a chunk of size zero.
	* </pre>
	*/
	public Long get_httptotchunkedresponses() throws Exception {
		return this.httptotchunkedresponses;
	}

	/**
	* <pre>
	* Total number of HTTP requests received in which the header spans more than one packet.
	* </pre>
	*/
	public Long get_httperrincompleterequests() throws Exception {
		return this.httperrincompleterequests;
	}

	/**
	* <pre>
	* Total number of HTTP/1.0 requests received.
	* </pre>
	*/
	public Long get_httptot10requests() throws Exception {
		return this.httptot10requests;
	}

	/**
	* <pre>
	* Total number of HTTP requests received with the GET method.
	* </pre>
	*/
	public Long get_httptotgets() throws Exception {
		return this.httptotgets;
	}

	/**
	* <pre>
	* Total number of requests and responses received with large body.
	* </pre>
	*/
	public Long get_httperrlargecontent() throws Exception {
		return this.httperrlargecontent;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptot10responses
	* </pre>
	*/
	public Long get_http10responsesrate() throws Exception {
		return this.http10responsesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for spdy2totstreams
	* </pre>
	*/
	public Long get_spdy2streamsrate() throws Exception {
		return this.spdy2streamsrate;
	}

	/**
	* <pre>
	* Total number of HTTP error responses received. Some of the error responses are: 
500 	Internal Server Error
501 	Not Implemented
502 	Bad Gateway
503 	Service Unavailable
504 	Gateway Timeout
505 	HTTP Version Not Supported

	* </pre>
	*/
	public Long get_httperrserverbusy() throws Exception {
		return this.httperrserverbusy;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptottxrequestbytes
	* </pre>
	*/
	public Long get_httptxrequestbytesrate() throws Exception {
		return this.httptxrequestbytesrate;
	}

	/**
	* <pre>
	* Total number of HTTP requests received with the POST method.
	* </pre>
	*/
	public Long get_httptotposts() throws Exception {
		return this.httptotposts;
	}

	/**
	* <pre>
	* Total number of HTTP requests in which the Content-length field of the HTTP header has been set. Content-length specifies the length of the content, in bytes, in the associated HTTP body.
	* </pre>
	*/
	public Long get_httptotclenrequests() throws Exception {
		return this.httptotclenrequests;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotrxresponsebytes
	* </pre>
	*/
	public Long get_httprxresponsebytesrate() throws Exception {
		return this.httprxresponsebytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httperrincompleteresponses
	* </pre>
	*/
	public Long get_httperrincompleteresponsesrate() throws Exception {
		return this.httperrincompleteresponsesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotnoclenchunkresponses
	* </pre>
	*/
	public Long get_httpnoclenchunkresponsesrate() throws Exception {
		return this.httpnoclenchunkresponsesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotchunkedrequests
	* </pre>
	*/
	public Long get_httpchunkedrequestsrate() throws Exception {
		return this.httpchunkedrequestsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptot11responses
	* </pre>
	*/
	public Long get_http11responsesrate() throws Exception {
		return this.http11responsesrate;
	}

	/**
	* <pre>
	* Total number of HTTP requests received.
	* </pre>
	*/
	public Long get_httptotrequests() throws Exception {
		return this.httptotrequests;
	}

	/**
	* <pre>
	* Total number of HTTP responses sent.
	* </pre>
	*/
	public Long get_httptotresponses() throws Exception {
		return this.httptotresponses;
	}

	/**
	* <pre>
	* Total number of HTTP responses received in which the header spans more than one packet.
	* </pre>
	*/
	public Long get_httperrincompleteresponses() throws Exception {
		return this.httperrincompleteresponses;
	}

	/**
	* <pre>
	* Total number of bytes of HTTP request data transmitted.
	* </pre>
	*/
	public Long get_httptottxrequestbytes() throws Exception {
		return this.httptottxrequestbytes;
	}

	/**
	* <pre>
	* Rate (/s) counter for httperrserverbusy
	* </pre>
	*/
	public Long get_httperrserverbusyrate() throws Exception {
		return this.httperrserverbusyrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptot11requests
	* </pre>
	*/
	public Long get_http11requestsrate() throws Exception {
		return this.http11requestsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptottxresponsebytes
	* </pre>
	*/
	public Long get_httptxresponsebytesrate() throws Exception {
		return this.httptxresponsebytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotothers
	* </pre>
	*/
	public Long get_httptohersrate() throws Exception {
		return this.httptohersrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotchunkedresponses
	* </pre>
	*/
	public Long get_httpchunkedresponsesrate() throws Exception {
		return this.httpchunkedresponsesrate;
	}

	/**
	* <pre>
	* Total number of HTTP/1.1 responses sent.
	* </pre>
	*/
	public Long get_httptot11responses() throws Exception {
		return this.httptot11responses;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptot10requests
	* </pre>
	*/
	public Long get_http10requestsrate() throws Exception {
		return this.http10requestsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotrequests
	* </pre>
	*/
	public Long get_httprequestsrate() throws Exception {
		return this.httprequestsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotresponses
	* </pre>
	*/
	public Long get_httpresponsesrate() throws Exception {
		return this.httpresponsesrate;
	}

	/**
	* <pre>
	* Total number of HTTP/1.0 responses sent.
	* </pre>
	*/
	public Long get_httptot10responses() throws Exception {
		return this.httptot10responses;
	}

	/**
	* <pre>
	* Total number of FIN-terminated responses sent. In FIN-terminated responses, the server finishes sending the data and closes the connection.
	* </pre>
	*/
	public Long get_httptotnoclenchunkresponses() throws Exception {
		return this.httptotnoclenchunkresponses;
	}

	/**
	* <pre>
	* Total number of requests received with large chunk size, in which the Transfer-Encoding field of the HTTP header has been set to chunked.
	* </pre>
	*/
	public Long get_httperrlargechunk() throws Exception {
		return this.httperrlargechunk;
	}

	/**
	* <pre>
	* Rate (/s) counter for httperrnoreusemultipart
	* </pre>
	*/
	public Long get_httperrnoreusemultipartrate() throws Exception {
		return this.httperrnoreusemultipartrate;
	}

	/**
	* <pre>
	* Total number of HTTP requests and responses received in which the HTTP header spans more than one packet.
	* </pre>
	*/
	public Long get_httperrincompleteheaders() throws Exception {
		return this.httperrincompleteheaders;
	}

	/**
	* <pre>
	* Total number of HTTP/1.1 requests received.
	* </pre>
	*/
	public Long get_httptot11requests() throws Exception {
		return this.httptot11requests;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotposts
	* </pre>
	*/
	public Long get_httppostsrate() throws Exception {
		return this.httppostsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotgets
	* </pre>
	*/
	public Long get_httpgetsrate() throws Exception {
		return this.httpgetsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotclenresponses
	* </pre>
	*/
	public Long get_httpclenresponsesrate() throws Exception {
		return this.httpclenresponsesrate;
	}

	/**
	* <pre>
	* Total number of requests received with large content, in which the Content-length field of the HTTP header has been set. Content-length specifies the length of the content, in bytes, in the associated HTTP body.
	* </pre>
	*/
	public Long get_httperrlargectlen() throws Exception {
		return this.httperrlargectlen;
	}

	/**
	* <pre>
	* Total number of bytes of HTTP response data transmitted.
	* </pre>
	*/
	public Long get_httptottxresponsebytes() throws Exception {
		return this.httptottxresponsebytes;
	}

	/**
	* <pre>
	* Total number of HTTP requests in which the Transfer-Encoding field of the HTTP header has been set to chunked.
	* </pre>
	*/
	public Long get_httptotchunkedrequests() throws Exception {
		return this.httptotchunkedrequests;
	}

	/**
	* <pre>
	* Rate (/s) counter for httperrincompleterequests
	* </pre>
	*/
	public Long get_httperrincompleterequestsrate() throws Exception {
		return this.httperrincompleterequestsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotclenrequests
	* </pre>
	*/
	public Long get_httpclenrequestsrate() throws Exception {
		return this.httpclenrequestsrate;
	}

	/**
	* <pre>
	* Total number of bytes of HTTP request data received.
	* </pre>
	*/
	public Long get_httptotrxrequestbytes() throws Exception {
		return this.httptotrxrequestbytes;
	}

	/**
	* <pre>
	* Total number of HTTP requests received with methods other than GET and POST. Some of the other well-defined HTTP methods are HEAD, PUT, DELETE, OPTIONS, and TRACE. User-defined methods are also allowed.
	* </pre>
	*/
	public Long get_httptotothers() throws Exception {
		return this.httptotothers;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		protocolhttp_stats[] resources = new protocolhttp_stats[1];
		protocolhttp_response result = (protocolhttp_response) service.get_payload_formatter().string_to_resource(protocolhttp_response.class, response);
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
		resources[0] = result.protocolhttp;
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
	* Use this API to fetch the statistics of all protocolhttp_stats resources that are configured on netscaler.
	*/
	public static protocolhttp_stats get(nitro_service service) throws Exception{
		protocolhttp_stats obj = new protocolhttp_stats();
		protocolhttp_stats[] response = (protocolhttp_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all protocolhttp_stats resources that are configured on netscaler.
	*/
	public static protocolhttp_stats get(nitro_service service,  options option) throws Exception{
		protocolhttp_stats obj = new protocolhttp_stats();
		protocolhttp_stats[] response = (protocolhttp_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
