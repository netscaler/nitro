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

package com.citrix.netscaler.nitro.resource.stat.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaa_response extends base_response
{
	public aaa_stats aaa;
}

public class aaa_stats extends base_resource
{
	private Long aaaauthsuccess;
	private Long aaaauthsuccessrate;
	private Long aaaauthfail;
	private Long aaaauthfailrate;
	private Long aaaauthonlyhttpsuccess;
	private Long aaaauthonlyhttpsuccessrate;
	private Long aaaauthonlyhttpfail;
	private Long aaaauthonlyhttpfailrate;
	private Long aaaauthnonhttpsuccess;
	private Long aaaauthnonhttpsuccessrate;
	private Long aaaauthnonhttpfail;
	private Long aaaauthnonhttpfailrate;
	private Long aaacuricasessions;
	private Long aaacuricasessionsrate;
	private Long aaacursessions;
	private Long aaacursessionsrate;
	private Long aaatotsessions;
	private Long aaasessionsrate;
	private Long aaatotsessiontimeout;
	private Long aaasessiontimeoutrate;

	/**
	* <pre>
	* Count of AAA sessions that have timed out.
	* </pre>
	*/
	public Long get_aaatotsessiontimeout() throws Exception {
		return this.aaatotsessiontimeout;
	}

	/**
	* <pre>
	* Count of authentication failures.
	* </pre>
	*/
	public Long get_aaaauthfail() throws Exception {
		return this.aaaauthfail;
	}

	/**
	* <pre>
	* Count of authentication successes.
	* </pre>
	*/
	public Long get_aaaauthsuccess() throws Exception {
		return this.aaaauthsuccess;
	}

	/**
	* <pre>
	* Count of HTTP connections that failed authorization.
	* </pre>
	*/
	public Long get_aaaauthonlyhttpfailrate() throws Exception {
		return this.aaaauthonlyhttpfailrate;
	}

	/**
	* <pre>
	* Count of non HTTP connections that succeeded authorization.
	* </pre>
	*/
	public Long get_aaaauthnonhttpsuccess() throws Exception {
		return this.aaaauthnonhttpsuccess;
	}

	/**
	* <pre>
	* Count of HTTP connections that succeeded authorization.
	* </pre>
	*/
	public Long get_aaaauthonlyhttpsuccessrate() throws Exception {
		return this.aaaauthonlyhttpsuccessrate;
	}

	/**
	* <pre>
	* Count of current ICA only sessions.
	* </pre>
	*/
	public Long get_aaacuricasessions() throws Exception {
		return this.aaacuricasessions;
	}

	/**
	* <pre>
	* Count of all AAA sessions.
	* </pre>
	*/
	public Long get_aaatotsessions() throws Exception {
		return this.aaatotsessions;
	}

	/**
	* <pre>
	* Count of HTTP connections that failed authorization.
	* </pre>
	*/
	public Long get_aaaauthonlyhttpfail() throws Exception {
		return this.aaaauthonlyhttpfail;
	}

	/**
	* <pre>
	* Count of authentication failures.
	* </pre>
	*/
	public Long get_aaaauthfailrate() throws Exception {
		return this.aaaauthfailrate;
	}

	/**
	* <pre>
	* Count of current AAA sessions.
	* </pre>
	*/
	public Long get_aaacursessionsrate() throws Exception {
		return this.aaacursessionsrate;
	}

	/**
	* <pre>
	* Count of non HTTP connections that succeeded authorization.
	* </pre>
	*/
	public Long get_aaaauthnonhttpsuccessrate() throws Exception {
		return this.aaaauthnonhttpsuccessrate;
	}

	/**
	* <pre>
	* Count of non HTTP connections that failed authorization.
	* </pre>
	*/
	public Long get_aaaauthnonhttpfailrate() throws Exception {
		return this.aaaauthnonhttpfailrate;
	}

	/**
	* <pre>
	* Count of non HTTP connections that failed authorization.
	* </pre>
	*/
	public Long get_aaaauthnonhttpfail() throws Exception {
		return this.aaaauthnonhttpfail;
	}

	/**
	* <pre>
	* Count of authentication successes.
	* </pre>
	*/
	public Long get_aaaauthsuccessrate() throws Exception {
		return this.aaaauthsuccessrate;
	}

	/**
	* <pre>
	* Count of HTTP connections that succeeded authorization.
	* </pre>
	*/
	public Long get_aaaauthonlyhttpsuccess() throws Exception {
		return this.aaaauthonlyhttpsuccess;
	}

	/**
	* <pre>
	* Count of AAA sessions that have timed out.
	* </pre>
	*/
	public Long get_aaasessiontimeoutrate() throws Exception {
		return this.aaasessiontimeoutrate;
	}

	/**
	* <pre>
	* Count of current ICA only sessions.
	* </pre>
	*/
	public Long get_aaacuricasessionsrate() throws Exception {
		return this.aaacuricasessionsrate;
	}

	/**
	* <pre>
	* Count of current AAA sessions.
	* </pre>
	*/
	public Long get_aaacursessions() throws Exception {
		return this.aaacursessions;
	}

	/**
	* <pre>
	* Count of all AAA sessions.
	* </pre>
	*/
	public Long get_aaasessionsrate() throws Exception {
		return this.aaasessionsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		aaa_stats[] resources = new aaa_stats[1];
		aaa_response result = (aaa_response) service.get_payload_formatter().string_to_resource(aaa_response.class, response);
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
		resources[0] = result.aaa;
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
	* Use this API to fetch the statistics of all aaa_stats resources that are configured on netscaler.
	*/
	public static aaa_stats get(nitro_service service) throws Exception{
		aaa_stats obj = new aaa_stats();
		aaa_stats[] response = (aaa_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all aaa_stats resources that are configured on netscaler.
	*/
	public static aaa_stats get(nitro_service service,  options option) throws Exception{
		aaa_stats obj = new aaa_stats();
		aaa_stats[] response = (aaa_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
