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

package com.citrix.netscaler.nitro.resource.stat.audit;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class audit_response extends base_response
{
	public audit_stats audit;
}

public class audit_stats extends base_resource
{
	private String clearstats;
	private Long auditsyslogmsgsent;
	private Long auditsyslogmsgsentrate;
	private Long auditsyslogmsggen;
	private Long auditsyslogmsggenrate;
	private Long auditnsballocfail;
	private Long auditnsballocfailrate;
	private Long auditlog32errsyslogallocnsbfail;
	private Long auditlog32errsyslogallocnsbfailrate;
	private Long auditmemallocfail;
	private Long auditmemallocfailrate;
	private Long auditportallocfail;
	private Long auditportallocfailrate;
	private Long auditnatpcblkupfail;
	private Long auditnatpcblkupfailrate;
	private Long auditcontextnotfound;
	private Long auditcontextnotfoundrate;
	private Long nsbchainallocfail;
	private Long nsbchainallocfailrate;
	private Long clientconnfail;
	private Long clientconnfailrate;
	private Long flushcmdcnt;
	private Long flushcmdcntrate;

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
	* Rate (/s) counter for auditportallocfail
	* </pre>
	*/
	public Long get_auditportallocfailrate() throws Exception {
		return this.auditportallocfailrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for auditnsballocfail
	* </pre>
	*/
	public Long get_auditnsballocfailrate() throws Exception {
		return this.auditnsballocfailrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for auditcontextnotfound
	* </pre>
	*/
	public Long get_auditcontextnotfoundrate() throws Exception {
		return this.auditcontextnotfoundrate;
	}

	/**
	* <pre>
	* Failures in establishment of a connection between the NetScaler and the auditserver tool (the Netscaler's custom logging tool).
	* </pre>
	*/
	public Long get_clientconnfail() throws Exception {
		return this.clientconnfail;
	}

	/**
	* <pre>
	* Rate (/s) counter for flushcmdcnt
	* </pre>
	*/
	public Long get_flushcmdcntrate() throws Exception {
		return this.flushcmdcntrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for auditlog32errsyslogallocnsbfail
	* </pre>
	*/
	public Long get_auditlog32errsyslogallocnsbfailrate() throws Exception {
		return this.auditlog32errsyslogallocnsbfailrate;
	}

	/**
	* <pre>
	* NAT allocation failed.
	* </pre>
	*/
	public Long get_auditnsballocfail() throws Exception {
		return this.auditnsballocfail;
	}

	/**
	* <pre>
	* Rate (/s) counter for auditsyslogmsgsent
	* </pre>
	*/
	public Long get_auditsyslogmsgsentrate() throws Exception {
		return this.auditsyslogmsgsentrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for clientconnfail
	* </pre>
	*/
	public Long get_clientconnfailrate() throws Exception {
		return this.clientconnfailrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for auditnatpcblkupfail
	* </pre>
	*/
	public Long get_auditnatpcblkupfailrate() throws Exception {
		return this.auditnatpcblkupfailrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for auditmemallocfail
	* </pre>
	*/
	public Long get_auditmemallocfailrate() throws Exception {
		return this.auditmemallocfailrate;
	}

	/**
	* <pre>
	* Nsb allocation failed.
	* </pre>
	*/
	public Long get_auditlog32errsyslogallocnsbfail() throws Exception {
		return this.auditlog32errsyslogallocnsbfail;
	}

	/**
	* <pre>
	* Number of times the NetScaler failed to allocate a port when sending a syslog message to the syslog server(s).
	* </pre>
	*/
	public Long get_auditportallocfail() throws Exception {
		return this.auditportallocfail;
	}

	/**
	* <pre>
	* Nsb Chain allocation failed.
	* </pre>
	*/
	public Long get_nsbchainallocfail() throws Exception {
		return this.nsbchainallocfail;
	}

	/**
	* <pre>
	* NAT lookup failed.
	* </pre>
	*/
	public Long get_auditnatpcblkupfail() throws Exception {
		return this.auditnatpcblkupfail;
	}

	/**
	* <pre>
	* Failures in allocation of Access Gateway context structure. When an Access Gateway session is established, the NetScaler creates an internal context structure , which identifies the user and the IP address from which the user has logged in.
	* </pre>
	*/
	public Long get_auditmemallocfail() throws Exception {
		return this.auditmemallocfail;
	}

	/**
	* <pre>
	* Rate (/s) counter for auditsyslogmsggen
	* </pre>
	*/
	public Long get_auditsyslogmsggenrate() throws Exception {
		return this.auditsyslogmsggenrate;
	}

	/**
	* <pre>
	* Syslog messages sent to the syslog server(s).
	* </pre>
	*/
	public Long get_auditsyslogmsgsent() throws Exception {
		return this.auditsyslogmsgsent;
	}

	/**
	* <pre>
	* Failures in finding the context structure for an Access Gateway session during attempts to send session-specific audit messages.

During an Access Gateway session, audit messages related to the session are queued up in the auditlog buffer for transmission to the audit log server(s). If the session is killed before the messages are sent, the context structure allocated at session creation is removed. This structure is needed for sending the queued auditlog messages. If it is not found, this counter is incremented.

	* </pre>
	*/
	public Long get_auditcontextnotfound() throws Exception {
		return this.auditcontextnotfound;
	}

	/**
	* <pre>
	* Auditlog buffer flushes. In a multiprocessor NetScaler, both the main processor and the co-processor can generate auditlog messages and fill up the auditlog buffers. But only the primary processor can free up the buffers by sending auditlog messages to the auditlog server(s). The number of auditlog buffers is fixed. If the co-processor detects that all the auditlog buffers are full, it issues a flush command to the main processor.
	* </pre>
	*/
	public Long get_flushcmdcnt() throws Exception {
		return this.flushcmdcnt;
	}

	/**
	* <pre>
	* Syslog messages about to be sent to the syslog server.
	* </pre>
	*/
	public Long get_auditsyslogmsggen() throws Exception {
		return this.auditsyslogmsggen;
	}

	/**
	* <pre>
	* Rate (/s) counter for nsbchainallocfail
	* </pre>
	*/
	public Long get_nsbchainallocfailrate() throws Exception {
		return this.nsbchainallocfailrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		audit_stats[] resources = new audit_stats[1];
		audit_response result = (audit_response) service.get_payload_formatter().string_to_resource(audit_response.class, response);
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
		resources[0] = result.audit;
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
	* Use this API to fetch the statistics of all audit_stats resources that are configured on netscaler.
	*/
	public static audit_stats get(nitro_service service) throws Exception{
		audit_stats obj = new audit_stats();
		audit_stats[] response = (audit_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all audit_stats resources that are configured on netscaler.
	*/
	public static audit_stats get(nitro_service service,  options option) throws Exception{
		audit_stats obj = new audit_stats();
		audit_stats[] response = (audit_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
