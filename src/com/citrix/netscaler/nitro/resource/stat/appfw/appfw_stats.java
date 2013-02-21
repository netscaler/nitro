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

package com.citrix.netscaler.nitro.resource.stat.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfw_response extends base_response
{
	public appfw_stats appfw;
}

public class appfw_stats extends base_resource
{
	private Long appfirewalltotalviol;
	private Long appfirewallviolrate;
	private Long appfirewallshortavgresptime;
	private Long appfirewalllongavgresptime;
	private Long appfirewallrequests;
	private Long appfirewallrequestsrate;
	private Long appfirewallreqbytes;
	private Long appfirewallreqbytesrate;
	private Long appfirewallresponses;
	private Long appfirewallresbytes;
	private Long appfirewallresbytesrate;
	private Long appfirewallaborts;
	private Long appfirewallabortsrate;
	private Long appfirewallredirects;
	private Long appfirewallredirectsrate;
	private Long appfirewalltrapsdropped;
	private Long appfirewallviolstarturl;
	private Long appfirewallviolstarturlrate;
	private Long appfirewallvioldenyurl;
	private Long appfirewallvioldenyurlrate;
	private Long appfirewallviolrefererheader;
	private Long appfirewallviolrefererheaderrate;
	private Long appfirewallviolbufferoverflow;
	private Long appfirewallviolbufferoverflowrate;
	private Long appfirewallviolcookie;
	private Long appfirewallviolcookierate;
	private Long appfirewallviolcsrftag;
	private Long appfirewallviolcsrftagrate;
	private Long appfirewallviolxss;
	private Long appfirewallviolxssrate;
	private Long appfirewallviolsql;
	private Long appfirewallviolsqlrate;
	private Long appfirewallviolfieldformat;
	private Long appfirewallviolfieldformatrate;
	private Long appfirewallviolfieldconsistency;
	private Long appfirewallviolfieldconsistencyrate;
	private Long appfirewallviolcreditcard;
	private Long appfirewallviolcreditcardrate;
	private Long appfirewallviolsafeobject;
	private Long appfirewallviolsafeobjectrate;
	private Long appfirewallviolsignature;
	private Long appfirewallviolsignaturerate;
	private Long appfirewallviolwellformednessviolations;
	private Long appfirewallviolwellformednessviolationsrate;
	private Long appfirewallviolxdosviolations;
	private Long appfirewallviolxdosviolationsrate;
	private Long appfirewallviolmsgvalviolations;
	private Long appfirewallviolmsgvalviolationsrate;
	private Long appfirewallviolwsiviolations;
	private Long appfirewallviolwsiviolationsrate;
	private Long appfirewallviolxmlsqlviolations;
	private Long appfirewallviolxmlsqlviolationsrate;
	private Long appfirewallviolxmlxssviolations;
	private Long appfirewallviolxmlxssviolationsrate;
	private Long appfirewallviolxmlattachmentviolations;
	private Long appfirewallviolxmlattachmentviolationsrate;
	private Long appfirewallviolxmlsoapfaultviolations;
	private Long appfirewallviolxmlsoapfaultviolationsrate;
	private Long appfirewallviolxmlgenviolations;
	private Long appfirewallviolxmlgenviolationsrate;
	private Long appfirewallret4xx;
	private Long appfirewallret4xxrate;
	private Long appfirewallret5xx;
	private Long appfirewallret5xxrate;

	/**
	* <pre>
	* HTTP/HTTPS requests redirected by the Application Firewall to a different Web page or web server. (HTTP 302)
	* </pre>
	*/
	public Long get_appfirewallredirectsrate() throws Exception {
		return this.appfirewallredirectsrate;
	}

	/**
	* <pre>
	* Number of Cookie Consistency security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcookierate() throws Exception {
		return this.appfirewallviolcookierate;
	}

	/**
	* <pre>
	* Number of XML Message Validation security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolmsgvalviolationsrate() throws Exception {
		return this.appfirewallviolmsgvalviolationsrate;
	}

	/**
	* <pre>
	* Number of bytes transfered for requests
	* </pre>
	*/
	public Long get_appfirewallreqbytesrate() throws Exception {
		return this.appfirewallreqbytesrate;
	}

	/**
	* <pre>
	* Number of Credit Card security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcreditcard() throws Exception {
		return this.appfirewallviolcreditcard;
	}

	/**
	* <pre>
	* Number of Field Consistency security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolfieldconsistency() throws Exception {
		return this.appfirewallviolfieldconsistency;
	}

	/**
	* <pre>
	* Number of Buffer Overflow security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolbufferoverflowrate() throws Exception {
		return this.appfirewallviolbufferoverflowrate;
	}

	/**
	* <pre>
	* Number of XML SQL Injection security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlsqlviolationsrate() throws Exception {
		return this.appfirewallviolxmlsqlviolationsrate;
	}

	/**
	* <pre>
	* Number of HTML Cross-Site Scripting security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxssrate() throws Exception {
		return this.appfirewallviolxssrate;
	}

	/**
	* <pre>
	* Incomplete HTTP/HTTPS requests aborted by the client before the Application Firewall could finish processing them.
	* </pre>
	*/
	public Long get_appfirewallaborts() throws Exception {
		return this.appfirewallaborts;
	}

	/**
	* <pre>
	* Total number of security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewalltotalviol() throws Exception {
		return this.appfirewalltotalviol;
	}

	/**
	* <pre>
	* Number of Safe Object security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsafeobjectrate() throws Exception {
		return this.appfirewallviolsafeobjectrate;
	}

	/**
	* <pre>
	* Number of Cross Site Request Forgery form tag security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcsrftagrate() throws Exception {
		return this.appfirewallviolcsrftagrate;
	}

	/**
	* <pre>
	* Number of XML Cross-Site Scripting (XSS) security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlxssviolations() throws Exception {
		return this.appfirewallviolxmlxssviolations;
	}

	/**
	* <pre>
	* HTTP/HTTPS responses sent by your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallresponses() throws Exception {
		return this.appfirewallresponses;
	}

	/**
	* <pre>
	* Number of Cookie Consistency security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcookie() throws Exception {
		return this.appfirewallviolcookie;
	}

	/**
	* <pre>
	* Number of Signature violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsignature() throws Exception {
		return this.appfirewallviolsignature;
	}

	/**
	* <pre>
	* Number of requests returning XML generic error from the backend server
	* </pre>
	*/
	public Long get_appfirewallviolxmlgenviolationsrate() throws Exception {
		return this.appfirewallviolxmlgenviolationsrate;
	}

	/**
	* <pre>
	* Number of Web Services Interoperability (WS-I) security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolwsiviolations() throws Exception {
		return this.appfirewallviolwsiviolations;
	}

	/**
	* <pre>
	* Number of Cross Site Request Forgery form tag security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcsrftag() throws Exception {
		return this.appfirewallviolcsrftag;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests sent to your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallrequests() throws Exception {
		return this.appfirewallrequests;
	}

	/**
	* <pre>
	* Number of bytes transfered for responses
	* </pre>
	*/
	public Long get_appfirewallresbytes() throws Exception {
		return this.appfirewallresbytes;
	}

	/**
	* <pre>
	* Total number of security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolrate() throws Exception {
		return this.appfirewallviolrate;
	}

	/**
	* <pre>
	* Incomplete HTTP/HTTPS requests aborted by the client before the Application Firewall could finish processing them.
	* </pre>
	*/
	public Long get_appfirewallabortsrate() throws Exception {
		return this.appfirewallabortsrate;
	}

	/**
	* <pre>
	* Number of requests returning soap:fault from the backend server
	* </pre>
	*/
	public Long get_appfirewallviolxmlsoapfaultviolationsrate() throws Exception {
		return this.appfirewallviolxmlsoapfaultviolationsrate;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests sent to your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallrequestsrate() throws Exception {
		return this.appfirewallrequestsrate;
	}

	/**
	* <pre>
	* Number of Buffer Overflow security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolbufferoverflow() throws Exception {
		return this.appfirewallviolbufferoverflow;
	}

	/**
	* <pre>
	* Number of Signature violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsignaturerate() throws Exception {
		return this.appfirewallviolsignaturerate;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests redirected by the Application Firewall to a different Web page or web server. (HTTP 302)
	* </pre>
	*/
	public Long get_appfirewallredirects() throws Exception {
		return this.appfirewallredirects;
	}

	/**
	* <pre>
	* Number of XML Cross-Site Scripting (XSS) security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlxssviolationsrate() throws Exception {
		return this.appfirewallviolxmlxssviolationsrate;
	}

	/**
	* <pre>
	* Number of XML Denial-of-Service security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxdosviolations() throws Exception {
		return this.appfirewallviolxdosviolations;
	}

	/**
	* <pre>
	* Number of Field Consistency security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolfieldconsistencyrate() throws Exception {
		return this.appfirewallviolfieldconsistencyrate;
	}

	/**
	* <pre>
	* Number of Credit Card security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcreditcardrate() throws Exception {
		return this.appfirewallviolcreditcardrate;
	}

	/**
	* <pre>
	* Number of requests returning HTTP 5xx from the backend server
	* </pre>
	*/
	public Long get_appfirewallret5xx() throws Exception {
		return this.appfirewallret5xx;
	}

	/**
	* <pre>
	* Number of XML Message Validation security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolmsgvalviolations() throws Exception {
		return this.appfirewallviolmsgvalviolations;
	}

	/**
	* <pre>
	* Number of Web Services Interoperability (WS-I) security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolwsiviolationsrate() throws Exception {
		return this.appfirewallviolwsiviolationsrate;
	}

	/**
	* <pre>
	* Average backend response time in milliseconds since reboot
	* </pre>
	*/
	public Long get_appfirewalllongavgresptime() throws Exception {
		return this.appfirewalllongavgresptime;
	}

	/**
	* <pre>
	* Number of requests returning XML generic error from the backend server
	* </pre>
	*/
	public Long get_appfirewallviolxmlgenviolations() throws Exception {
		return this.appfirewallviolxmlgenviolations;
	}

	/**
	* <pre>
	* Number of requests returning soap:fault from the backend server
	* </pre>
	*/
	public Long get_appfirewallviolxmlsoapfaultviolations() throws Exception {
		return this.appfirewallviolxmlsoapfaultviolations;
	}

	/**
	* <pre>
	* Number of Safe Object security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsafeobject() throws Exception {
		return this.appfirewallviolsafeobject;
	}

	/**
	* <pre>
	* Number of XML Format security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolwellformednessviolationsrate() throws Exception {
		return this.appfirewallviolwellformednessviolationsrate;
	}

	/**
	* <pre>
	* Number of Field Format security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolfieldformatrate() throws Exception {
		return this.appfirewallviolfieldformatrate;
	}

	/**
	* <pre>
	* Number of HTML SQL Injection security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsql() throws Exception {
		return this.appfirewallviolsql;
	}

	/**
	* <pre>
	* Number of Deny URL security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallvioldenyurl() throws Exception {
		return this.appfirewallvioldenyurl;
	}

	/**
	* <pre>
	* Number of XML Denial-of-Service security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxdosviolationsrate() throws Exception {
		return this.appfirewallviolxdosviolationsrate;
	}

	/**
	* <pre>
	* Number of XML Attachment security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlattachmentviolations() throws Exception {
		return this.appfirewallviolxmlattachmentviolations;
	}

	/**
	* <pre>
	* Number of HTML SQL Injection security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsqlrate() throws Exception {
		return this.appfirewallviolsqlrate;
	}

	/**
	* <pre>
	* Number of Start URL security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolstarturlrate() throws Exception {
		return this.appfirewallviolstarturlrate;
	}

	/**
	* <pre>
	* Number of XML SQL Injection security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlsqlviolations() throws Exception {
		return this.appfirewallviolxmlsqlviolations;
	}

	/**
	* <pre>
	* Average backend response time in milliseconds over the last 7 seconds
	* </pre>
	*/
	public Long get_appfirewallshortavgresptime() throws Exception {
		return this.appfirewallshortavgresptime;
	}

	/**
	* <pre>
	* Number of bytes transfered for responses
	* </pre>
	*/
	public Long get_appfirewallresbytesrate() throws Exception {
		return this.appfirewallresbytesrate;
	}

	/**
	* <pre>
	* Number of Referer Header security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolrefererheader() throws Exception {
		return this.appfirewallviolrefererheader;
	}

	/**
	* <pre>
	* Number of Referer Header security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolrefererheaderrate() throws Exception {
		return this.appfirewallviolrefererheaderrate;
	}

	/**
	* <pre>
	* AppFirewall SNMP traps dropped due to time limit.
	* </pre>
	*/
	public Long get_appfirewalltrapsdropped() throws Exception {
		return this.appfirewalltrapsdropped;
	}

	/**
	* <pre>
	* Number of Start URL security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolstarturl() throws Exception {
		return this.appfirewallviolstarturl;
	}

	/**
	* <pre>
	* Number of requests returning HTTP 4xx from the backend server
	* </pre>
	*/
	public Long get_appfirewallret4xxrate() throws Exception {
		return this.appfirewallret4xxrate;
	}

	/**
	* <pre>
	* Number of XML Attachment security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlattachmentviolationsrate() throws Exception {
		return this.appfirewallviolxmlattachmentviolationsrate;
	}

	/**
	* <pre>
	* Number of requests returning HTTP 5xx from the backend server
	* </pre>
	*/
	public Long get_appfirewallret5xxrate() throws Exception {
		return this.appfirewallret5xxrate;
	}

	/**
	* <pre>
	* Number of Deny URL security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallvioldenyurlrate() throws Exception {
		return this.appfirewallvioldenyurlrate;
	}

	/**
	* <pre>
	* Number of HTML Cross-Site Scripting security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxss() throws Exception {
		return this.appfirewallviolxss;
	}

	/**
	* <pre>
	* Number of XML Format security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolwellformednessviolations() throws Exception {
		return this.appfirewallviolwellformednessviolations;
	}

	/**
	* <pre>
	* Number of bytes transfered for requests
	* </pre>
	*/
	public Long get_appfirewallreqbytes() throws Exception {
		return this.appfirewallreqbytes;
	}

	/**
	* <pre>
	* Number of requests returning HTTP 4xx from the backend server
	* </pre>
	*/
	public Long get_appfirewallret4xx() throws Exception {
		return this.appfirewallret4xx;
	}

	/**
	* <pre>
	* Number of Field Format security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolfieldformat() throws Exception {
		return this.appfirewallviolfieldformat;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		appfw_stats[] resources = new appfw_stats[1];
		appfw_response result = (appfw_response) service.get_payload_formatter().string_to_resource(appfw_response.class, response);
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
		resources[0] = result.appfw;
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
	* Use this API to fetch the statistics of all appfw_stats resources that are configured on netscaler.
	*/
	public static appfw_stats get(nitro_service service) throws Exception{
		appfw_stats obj = new appfw_stats();
		appfw_stats[] response = (appfw_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all appfw_stats resources that are configured on netscaler.
	*/
	public static appfw_stats get(nitro_service service,  options option) throws Exception{
		appfw_stats obj = new appfw_stats();
		appfw_stats[] response = (appfw_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
