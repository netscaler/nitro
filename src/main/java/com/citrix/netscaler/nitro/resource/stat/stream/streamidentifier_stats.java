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

package com.citrix.netscaler.nitro.resource.stat.stream;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class streamidentifier_response extends base_response
{
	public streamidentifier_stats[] streamidentifier;
}
/**
* Statistics for identifier resource.
*/

public class streamidentifier_stats extends base_resource
{
	private String name;
	private String[] pattern;
	private String clearstats;
	private String sortby;
	private String sortorder;
	private Long streamobjreq;
	private Long streamobjbandw;
	private Long streamobjresptime;
	private Long streamobjconn;

	/**
	* <pre>
	* Name of the stream identifier.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the stream identifier.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Values on which grouping is performed are displayed in the output as row titles. If grouping is performed on two or more fields, their values are separated by a question mark in the row title.

For example, consider a selector that contains the expressions HTTP.REQ.URL and CLIENT.IP.SRC (in that order), on an appliance that has accumulated records of a number of requests for two URLs, example.com/page1.html and example.com/page2.html, from two client IP addresses, 192.0.2.10 and 192.0.2.11. 

With a pattern of ? ?, the appliance performs grouping on both fields and displays statistics for the following:
* Requests for example.com/abc.html from 192.0.2.10, with a row title of example.com/abc.html?192.0.2.10.
* Requests for example.com/abc.html from 192.0.2.11, with a row title of example.com/abc.html?192.0.2.11.
* Requests for example.com/def.html from 192.0.2.10, with a row title of example.com/def.html?192.0.2.10.
* Requests for example.com/def.html from 192.0.2.11, with a row title of example.com/def.html?192.0.2.11.

With a pattern of * ?, the appliance performs grouping on only the client IP address values and displays statistics for the following requests:
* All requests from 192.0.2.10, with the IP address as the row title.
* All requests from 192.0.2.11, with the IP address as the row title.

With a pattern of ? *, the appliance performs grouping on only the URL values and displays statistics for the following requests:
* All requests for example.com/abc.html, with the URL as the row title.
* All requests for example.com/def.html, with the URL as the row title.

With a pattern of * *, the appliance displays one set of collective statistics for all the requests received, with no row title.

With a pattern of example.com/abc.html ?, the appliance displays statistics for requests for example.com/abc.html from each unique client IP address.

With a pattern of * 192.0.2.11, the appliance displays statistics for all requests from 192.0.2.11.
	* </pre>
	*/
	public void set_pattern(String[] pattern) throws Exception{
		this.pattern = pattern;
	}

	/**
	* <pre>
	* Values on which grouping is performed are displayed in the output as row titles. If grouping is performed on two or more fields, their values are separated by a question mark in the row title.

For example, consider a selector that contains the expressions HTTP.REQ.URL and CLIENT.IP.SRC (in that order), on an appliance that has accumulated records of a number of requests for two URLs, example.com/page1.html and example.com/page2.html, from two client IP addresses, 192.0.2.10 and 192.0.2.11. 

With a pattern of ? ?, the appliance performs grouping on both fields and displays statistics for the following:
* Requests for example.com/abc.html from 192.0.2.10, with a row title of example.com/abc.html?192.0.2.10.
* Requests for example.com/abc.html from 192.0.2.11, with a row title of example.com/abc.html?192.0.2.11.
* Requests for example.com/def.html from 192.0.2.10, with a row title of example.com/def.html?192.0.2.10.
* Requests for example.com/def.html from 192.0.2.11, with a row title of example.com/def.html?192.0.2.11.

With a pattern of * ?, the appliance performs grouping on only the client IP address values and displays statistics for the following requests:
* All requests from 192.0.2.10, with the IP address as the row title.
* All requests from 192.0.2.11, with the IP address as the row title.

With a pattern of ? *, the appliance performs grouping on only the URL values and displays statistics for the following requests:
* All requests for example.com/abc.html, with the URL as the row title.
* All requests for example.com/def.html, with the URL as the row title.

With a pattern of * *, the appliance displays one set of collective statistics for all the requests received, with no row title.

With a pattern of example.com/abc.html ?, the appliance displays statistics for requests for example.com/abc.html from each unique client IP address.

With a pattern of * 192.0.2.11, the appliance displays statistics for all requests from 192.0.2.11.
	* </pre>
	*/
	public String[] get_pattern() throws Exception {
		return this.pattern;
	}

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
	* use this argument to sort by specific key
	* </pre>
	*/
	public void set_sortby(String sortby) throws Exception{
		this.sortby = sortby;
	}

	/**
	* <pre>
	* use this argument to sort by specific key.<br> Possible values = 
	* </pre>
	*/
	public String get_sortby() throws Exception {
		return this.sortby;
	}

	/**
	* <pre>
	* use this argument to specify sort order
	* </pre>
	*/
	public void set_sortorder(String sortorder) throws Exception{
		this.sortorder = sortorder;
	}

	/**
	* <pre>
	* use this argument to specify sort order.<br> Default value: SORT_DESCENDING<br> Possible values = ascending, descending
	* </pre>
	*/
	public String get_sortorder() throws Exception {
		return this.sortorder;
	}

	/**
	* <pre>
	* Current connections on the stream session.
	* </pre>
	*/
	public Long get_streamobjconn() throws Exception {
		return this.streamobjconn;
	}

	/**
	* <pre>
	* Average response time of the stream session.
	* </pre>
	*/
	public Long get_streamobjresptime() throws Exception {
		return this.streamobjresptime;
	}

	/**
	* <pre>
	* Total Bandwidth consumed.
	* </pre>
	*/
	public Long get_streamobjbandw() throws Exception {
		return this.streamobjbandw;
	}

	/**
	* <pre>
	* Total number of Stream Requests recieved.
	* </pre>
	*/
	public Long get_streamobjreq() throws Exception {
		return this.streamobjreq;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		streamidentifier_response result = (streamidentifier_response) service.get_payload_formatter().string_to_resource(streamidentifier_response.class, response);
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
		return result.streamidentifier;
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
	* Use this API to fetch statistics of streamidentifier_stats resource of given name .
	*/
	public static streamidentifier_stats get(nitro_service service, String name) throws Exception{
		streamidentifier_stats obj = new streamidentifier_stats();
		obj.set_name(name);
		streamidentifier_stats response = (streamidentifier_stats) obj.stat_resource(service);
		return response;
	}

	/**
	* Use this API to fetch statistics of streamidentifier_stats resource of the given information.
	*/
	public static streamidentifier_stats get(nitro_service service, streamidentifier_stats obj) throws Exception{
	options option = new options();
	option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		streamidentifier_stats response = (streamidentifier_stats) obj.stat_resource(service,option);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
	public static class sortorderEnum {
		public static final String ascending = "ascending";
		public static final String descending = "descending";
	}
}
