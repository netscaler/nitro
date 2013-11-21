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

class inatsession_response extends base_response
{
	public inatsession_stats[] inatsession;
}
/**
* Statistics for stateful INAT resource.
*/

public class inatsession_stats extends base_resource
{
	private String name;
	private String clearstats;
	private Long inattothits;
	private Long inathitsrate;
	private Long inatcursessions;
	private Long inatcursessionsrate;
	private Long inattotreceivebytes;
	private Long inatreceivebytesrate;
	private Long inattotsentbytes;
	private Long inatsentbytesrate;
	private Long inattotpktreceived;
	private Long inatpktreceivedrate;
	private Long inattotpktsent;
	private Long inatpktsentrate;

	/**
	* <pre>
	* INAT name
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* INAT name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
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
	* INAT total Sent Bytes
	* </pre>
	*/
	public Long get_inattotsentbytes() throws Exception {
		return this.inattotsentbytes;
	}

	/**
	* <pre>
	* Rate (/s) counter for inattotreceivebytes
	* </pre>
	*/
	public Long get_inatreceivebytesrate() throws Exception {
		return this.inatreceivebytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for inattothits
	* </pre>
	*/
	public Long get_inathitsrate() throws Exception {
		return this.inathitsrate;
	}

	/**
	* <pre>
	* INAT total Received Bytes
	* </pre>
	*/
	public Long get_inattotreceivebytes() throws Exception {
		return this.inattotreceivebytes;
	}

	/**
	* <pre>
	* Rate (/s) counter for inatcursessions
	* </pre>
	*/
	public Long get_inatcursessionsrate() throws Exception {
		return this.inatcursessionsrate;
	}

	/**
	* <pre>
	* INAT current sessions
	* </pre>
	*/
	public Long get_inatcursessions() throws Exception {
		return this.inatcursessions;
	}

	/**
	* <pre>
	* Rate (/s) counter for inattotsentbytes
	* </pre>
	*/
	public Long get_inatsentbytesrate() throws Exception {
		return this.inatsentbytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for inattotpktsent
	* </pre>
	*/
	public Long get_inatpktsentrate() throws Exception {
		return this.inatpktsentrate;
	}

	/**
	* <pre>
	* INAT total Packets Received
	* </pre>
	*/
	public Long get_inattotpktreceived() throws Exception {
		return this.inattotpktreceived;
	}

	/**
	* <pre>
	* INAT total sessions
	* </pre>
	*/
	public Long get_inattothits() throws Exception {
		return this.inattothits;
	}

	/**
	* <pre>
	* INAT total Packets Sent
	* </pre>
	*/
	public Long get_inattotpktsent() throws Exception {
		return this.inattotpktsent;
	}

	/**
	* <pre>
	* Rate (/s) counter for inattotpktreceived
	* </pre>
	*/
	public Long get_inatpktreceivedrate() throws Exception {
		return this.inatpktreceivedrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		inatsession_response result = (inatsession_response) service.get_payload_formatter().string_to_resource(inatsession_response.class, response);
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
		return result.inatsession;
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
	* Use this API to fetch statistics of inatsession_stats resource of given name .
	*/
	public static inatsession_stats get(nitro_service service, String name) throws Exception{
		inatsession_stats obj = new inatsession_stats();
		obj.set_name(name);
		inatsession_stats response = (inatsession_stats) obj.stat_resource(service);
		return response;
	}

	/**
	* Use this API to fetch statistics of inatsession_stats resource of the given information.
	*/
	public static inatsession_stats get(nitro_service service, inatsession_stats obj) throws Exception{
	options option = new options();
	option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		inatsession_stats response = (inatsession_stats) obj.stat_resource(service,option);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
