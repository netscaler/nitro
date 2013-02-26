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
	private String sortby;
	private String sortorder;
	private Long streamobjreq;
	private Long streamobjbandw;
	private Long streamobjresptime;
	private Long streamobjconn;

	/**
	* <pre>
	* The name of the identifier.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the identifier.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Pattern for the selector field, ? means field is required, * means field value does not matter, anything else is a regular pattern
	* </pre>
	*/
	public void set_pattern(String[] pattern) throws Exception{
		this.pattern = pattern;
	}

	/**
	* <pre>
	* Pattern for the selector field, ? means field is required, * means field value does not matter, anything else is a regular pattern.
	* </pre>
	*/
	public String[] get_pattern() throws Exception {
		return this.pattern;
	}

	public void set_sortby(String sortby) throws Exception{
		this.sortby = sortby;
	}

	/**
	* <pre>
	* .<br> Possible values = 
	* </pre>
	*/
	public String get_sortby() throws Exception {
		return this.sortby;
	}

	public void set_sortorder(String sortorder) throws Exception{
		this.sortorder = sortorder;
	}

	/**
	* <pre>
	* .<br> Default value: SORT_DESCENDING<br> Possible values = ascending, descending
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

	public static class sortorderEnum {
		public static final String ascending = "ascending";
		public static final String descending = "descending";
	}
}
