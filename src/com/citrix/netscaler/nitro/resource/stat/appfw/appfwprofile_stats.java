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

class appfwprofile_response extends base_response
{
	public appfwprofile_stats[] appfwprofile;
}
/**
* Statistics for application firewall profile resource.
*/

public class appfwprofile_stats extends base_resource
{
	private String name;
	private Long appfirewallrequestsperprofile;
	private Long appfirewallrequestsperprofilerate;
	private Long appfirewallreqbytesperprofile;
	private Long appfirewallreqbytesperprofilerate;
	private Long appfirewallresponsesperprofile;
	private Long appfirewallresponsesperprofilerate;
	private Long appfirewallresbytesperprofile;
	private Long appfirewallresbytesperprofilerate;
	private Long appfirewallabortsperprofile;
	private Long appfirewallabortsperprofilerate;
	private Long appfirewallredirectsperprofile;
	private Long appfirewallredirectsperprofilerate;
	private Long appfirewalllongavgresptimeperprofile;
	private Long appfirewallshortavgresptimeperprofile;
	private Long appfirewallviolstarturlperprofile;
	private Long appfirewallviolstarturlperprofilerate;
	private Long appfirewallvioldenyurlperprofile;
	private Long appfirewallvioldenyurlperprofilerate;
	private Long appfirewallviolrefererheaderperprofile;
	private Long appfirewallviolrefererheaderperprofilerate;
	private Long appfirewallviolbufferoverflowperprofile;
	private Long appfirewallviolbufferoverflowperprofilerate;
	private Long appfirewallviolcookieperprofile;
	private Long appfirewallviolcookieperprofilerate;
	private Long appfirewallviolcsrftagperprofile;
	private Long appfirewallviolcsrftagperprofilerate;
	private Long appfirewallviolxssperprofile;
	private Long appfirewallviolxssperprofilerate;
	private Long appfirewallviolsqlperprofile;
	private Long appfirewallviolsqlperprofilerate;
	private Long appfirewallviolfieldformatperprofile;
	private Long appfirewallviolfieldformatperprofilerate;
	private Long appfirewallviolfieldconsistencyperprofile;
	private Long appfirewallviolfieldconsistencyperprofilerate;
	private Long appfirewallviolcreditcardperprofile;
	private Long appfirewallviolcreditcardperprofilerate;
	private Long appfirewallviolsafeobjectperprofile;
	private Long appfirewallviolsafeobjectperprofilerate;
	private Long appfirewallviolsignatureperprofile;
	private Long appfirewallviolsignatureperprofilerate;
	private Long appfirewallviolwellformednessviolationsperprofile;
	private Long appfirewallviolwellformednessviolationsperprofilerate;
	private Long appfirewallviolxdosviolationsperprofile;
	private Long appfirewallviolxdosviolationsperprofilerate;
	private Long appfirewallviolmsgvalviolationsperprofile;
	private Long appfirewallviolmsgvalviolationsperprofilerate;
	private Long appfirewallviolwsiviolationsperprofile;
	private Long appfirewallviolwsiviolationsperprofilerate;
	private Long appfirewallviolxmlsqlviolationsperprofile;
	private Long appfirewallviolxmlsqlviolationsperprofilerate;
	private Long appfirewallviolxmlxssviolationsperprofile;
	private Long appfirewallviolxmlxssviolationsperprofilerate;
	private Long appfirewallviolxmlattachmentviolationsperprofile;
	private Long appfirewallviolxmlattachmentviolationsperprofilerate;
	private Long appfirewallviolxmlsoapfaultviolationsperprofile;
	private Long appfirewallviolxmlsoapfaultviolationsperprofilerate;
	private Long appfirewallviolxmlgenericviolationsperprofile;
	private Long appfirewallviolxmlgenericviolationsperprofilerate;
	private Long appfirewalltotalviolperprofile;
	private Long appfirewallviolperprofilerate;
	private Long appfirewallret4xxperprofile;
	private Long appfirewallret4xxperprofilerate;
	private Long appfirewallret5xxperprofile;
	private Long appfirewallret5xxperprofilerate;

	/**
	* <pre>
	* Application Firewall profile name.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Application Firewall profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Number of XML Message Validation security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolmsgvalviolationsperprofile() throws Exception {
		return this.appfirewallviolmsgvalviolationsperprofile;
	}

	/**
	* <pre>
	* Number of violations seen by the application firewall on per profile basis
	* </pre>
	*/
	public Long get_appfirewallviolperprofilerate() throws Exception {
		return this.appfirewallviolperprofilerate;
	}

	/**
	* <pre>
	* Number of Start URL security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolstarturlperprofile() throws Exception {
		return this.appfirewallviolstarturlperprofile;
	}

	/**
	* <pre>
	* Number of violations seen by the application firewall on per profile basis
	* </pre>
	*/
	public Long get_appfirewalltotalviolperprofile() throws Exception {
		return this.appfirewalltotalviolperprofile;
	}

	/**
	* <pre>
	* Number of requests returning HTTP 5xx from the backend server
	* </pre>
	*/
	public Long get_appfirewallret5xxperprofile() throws Exception {
		return this.appfirewallret5xxperprofile;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests redirected by the Application Firewall to a different Web page or web server. (HTTP 302)
	* </pre>
	*/
	public Long get_appfirewallredirectsperprofile() throws Exception {
		return this.appfirewallredirectsperprofile;
	}

	/**
	* <pre>
	* HTTP/HTTPS responses sent by your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallresponsesperprofile() throws Exception {
		return this.appfirewallresponsesperprofile;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests sent to your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallrequestsperprofilerate() throws Exception {
		return this.appfirewallrequestsperprofilerate;
	}

	/**
	* <pre>
	* Number of requests returning soap:fault from the backend server
	* </pre>
	*/
	public Long get_appfirewallviolxmlsoapfaultviolationsperprofile() throws Exception {
		return this.appfirewallviolxmlsoapfaultviolationsperprofile;
	}

	/**
	* <pre>
	* Number of Web Services Interoperability (WS-I) security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolwsiviolationsperprofilerate() throws Exception {
		return this.appfirewallviolwsiviolationsperprofilerate;
	}

	/**
	* <pre>
	* Number of XML Format security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolwellformednessviolationsperprofile() throws Exception {
		return this.appfirewallviolwellformednessviolationsperprofile;
	}

	/**
	* <pre>
	* Number of Field Format security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolfieldformatperprofile() throws Exception {
		return this.appfirewallviolfieldformatperprofile;
	}

	/**
	* <pre>
	* Number of Cookie Consistency security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcookieperprofilerate() throws Exception {
		return this.appfirewallviolcookieperprofilerate;
	}

	/**
	* <pre>
	* Number of bytes transfered for responses
	* </pre>
	*/
	public Long get_appfirewallresbytesperprofilerate() throws Exception {
		return this.appfirewallresbytesperprofilerate;
	}

	/**
	* <pre>
	* Number of Credit Card security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcreditcardperprofilerate() throws Exception {
		return this.appfirewallviolcreditcardperprofilerate;
	}

	/**
	* <pre>
	* Number of bytes transfered for responses
	* </pre>
	*/
	public Long get_appfirewallresbytesperprofile() throws Exception {
		return this.appfirewallresbytesperprofile;
	}

	/**
	* <pre>
	* Number of HTML Cross-Site Scripting security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxssperprofile() throws Exception {
		return this.appfirewallviolxssperprofile;
	}

	/**
	* <pre>
	* Number of requests returning soap:fault from the backend server
	* </pre>
	*/
	public Long get_appfirewallviolxmlsoapfaultviolationsperprofilerate() throws Exception {
		return this.appfirewallviolxmlsoapfaultviolationsperprofilerate;
	}

	/**
	* <pre>
	* Number of bytes transfered for requests
	* </pre>
	*/
	public Long get_appfirewallreqbytesperprofilerate() throws Exception {
		return this.appfirewallreqbytesperprofilerate;
	}

	/**
	* <pre>
	* Number of XML Message Validation security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolmsgvalviolationsperprofilerate() throws Exception {
		return this.appfirewallviolmsgvalviolationsperprofilerate;
	}

	/**
	* <pre>
	* Number of Field Consistency security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolfieldconsistencyperprofilerate() throws Exception {
		return this.appfirewallviolfieldconsistencyperprofilerate;
	}

	/**
	* <pre>
	* Number of XML Cross-Site Scripting (XSS) security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlxssviolationsperprofilerate() throws Exception {
		return this.appfirewallviolxmlxssviolationsperprofilerate;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests sent to your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallrequestsperprofile() throws Exception {
		return this.appfirewallrequestsperprofile;
	}

	/**
	* <pre>
	* Number of Signature violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsignatureperprofile() throws Exception {
		return this.appfirewallviolsignatureperprofile;
	}

	/**
	* <pre>
	* Number of XML Attachment security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlattachmentviolationsperprofilerate() throws Exception {
		return this.appfirewallviolxmlattachmentviolationsperprofilerate;
	}

	/**
	* <pre>
	* Number of HTML SQL Injection security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsqlperprofilerate() throws Exception {
		return this.appfirewallviolsqlperprofilerate;
	}

	/**
	* <pre>
	* Number of Cross Site Request Forgery form tag security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcsrftagperprofilerate() throws Exception {
		return this.appfirewallviolcsrftagperprofilerate;
	}

	/**
	* <pre>
	* Number of Start URL security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolstarturlperprofilerate() throws Exception {
		return this.appfirewallviolstarturlperprofilerate;
	}

	/**
	* <pre>
	* Number of XML SQL Injection security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlsqlviolationsperprofile() throws Exception {
		return this.appfirewallviolxmlsqlviolationsperprofile;
	}

	/**
	* <pre>
	* Number of Deny URL security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallvioldenyurlperprofile() throws Exception {
		return this.appfirewallvioldenyurlperprofile;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests redirected by the Application Firewall to a different Web page or web server. (HTTP 302)
	* </pre>
	*/
	public Long get_appfirewallredirectsperprofilerate() throws Exception {
		return this.appfirewallredirectsperprofilerate;
	}

	/**
	* <pre>
	* Number of Cross Site Request Forgery form tag security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcsrftagperprofile() throws Exception {
		return this.appfirewallviolcsrftagperprofile;
	}

	/**
	* <pre>
	* Number of Web Services Interoperability (WS-I) security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolwsiviolationsperprofile() throws Exception {
		return this.appfirewallviolwsiviolationsperprofile;
	}

	/**
	* <pre>
	* Average backend response time in milliseconds over the last 7 seconds
	* </pre>
	*/
	public Long get_appfirewallshortavgresptimeperprofile() throws Exception {
		return this.appfirewallshortavgresptimeperprofile;
	}

	/**
	* <pre>
	* Number of Safe Object security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsafeobjectperprofile() throws Exception {
		return this.appfirewallviolsafeobjectperprofile;
	}

	/**
	* <pre>
	* HTTP/HTTPS responses sent by your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallresponsesperprofilerate() throws Exception {
		return this.appfirewallresponsesperprofilerate;
	}

	/**
	* <pre>
	* Number of Referer Header security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolrefererheaderperprofilerate() throws Exception {
		return this.appfirewallviolrefererheaderperprofilerate;
	}

	/**
	* <pre>
	* Number of Deny URL security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallvioldenyurlperprofilerate() throws Exception {
		return this.appfirewallvioldenyurlperprofilerate;
	}

	/**
	* <pre>
	* Incomplete HTTP/HTTPS requests aborted by the client before the Application Firewall could finish processing them.
	* </pre>
	*/
	public Long get_appfirewallabortsperprofile() throws Exception {
		return this.appfirewallabortsperprofile;
	}

	/**
	* <pre>
	* Number of Cookie Consistency security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcookieperprofile() throws Exception {
		return this.appfirewallviolcookieperprofile;
	}

	/**
	* <pre>
	* Number of requests returning HTTP 4xx from the backend server
	* </pre>
	*/
	public Long get_appfirewallret4xxperprofile() throws Exception {
		return this.appfirewallret4xxperprofile;
	}

	/**
	* <pre>
	* Number of Field Format security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolfieldformatperprofilerate() throws Exception {
		return this.appfirewallviolfieldformatperprofilerate;
	}

	/**
	* <pre>
	* Number of Buffer Overflow security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolbufferoverflowperprofilerate() throws Exception {
		return this.appfirewallviolbufferoverflowperprofilerate;
	}

	/**
	* <pre>
	* Number of HTML SQL Injection security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsqlperprofile() throws Exception {
		return this.appfirewallviolsqlperprofile;
	}

	/**
	* <pre>
	* Number of HTML Cross-Site Scripting security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxssperprofilerate() throws Exception {
		return this.appfirewallviolxssperprofilerate;
	}

	/**
	* <pre>
	* Number of Credit Card security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolcreditcardperprofile() throws Exception {
		return this.appfirewallviolcreditcardperprofile;
	}

	/**
	* <pre>
	* Number of Field Consistency security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolfieldconsistencyperprofile() throws Exception {
		return this.appfirewallviolfieldconsistencyperprofile;
	}

	/**
	* <pre>
	* Number of requests returning HTTP 4xx from the backend server
	* </pre>
	*/
	public Long get_appfirewallret4xxperprofilerate() throws Exception {
		return this.appfirewallret4xxperprofilerate;
	}

	/**
	* <pre>
	* Number of Safe Object security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsafeobjectperprofilerate() throws Exception {
		return this.appfirewallviolsafeobjectperprofilerate;
	}

	/**
	* <pre>
	* Number of requests returning XML generic violation from the backend server
	* </pre>
	*/
	public Long get_appfirewallviolxmlgenericviolationsperprofile() throws Exception {
		return this.appfirewallviolxmlgenericviolationsperprofile;
	}

	/**
	* <pre>
	* Number of Signature violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolsignatureperprofilerate() throws Exception {
		return this.appfirewallviolsignatureperprofilerate;
	}

	/**
	* <pre>
	* Average backend response time in milliseconds since reboot
	* </pre>
	*/
	public Long get_appfirewalllongavgresptimeperprofile() throws Exception {
		return this.appfirewalllongavgresptimeperprofile;
	}

	/**
	* <pre>
	* Incomplete HTTP/HTTPS requests aborted by the client before the Application Firewall could finish processing them.
	* </pre>
	*/
	public Long get_appfirewallabortsperprofilerate() throws Exception {
		return this.appfirewallabortsperprofilerate;
	}

	/**
	* <pre>
	* Number of Buffer Overflow security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolbufferoverflowperprofile() throws Exception {
		return this.appfirewallviolbufferoverflowperprofile;
	}

	/**
	* <pre>
	* Number of XML SQL Injection security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlsqlviolationsperprofilerate() throws Exception {
		return this.appfirewallviolxmlsqlviolationsperprofilerate;
	}

	/**
	* <pre>
	* Number of bytes transfered for requests
	* </pre>
	*/
	public Long get_appfirewallreqbytesperprofile() throws Exception {
		return this.appfirewallreqbytesperprofile;
	}

	/**
	* <pre>
	* Number of requests returning XML generic violation from the backend server
	* </pre>
	*/
	public Long get_appfirewallviolxmlgenericviolationsperprofilerate() throws Exception {
		return this.appfirewallviolxmlgenericviolationsperprofilerate;
	}

	/**
	* <pre>
	* Number of XML Attachment security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlattachmentviolationsperprofile() throws Exception {
		return this.appfirewallviolxmlattachmentviolationsperprofile;
	}

	/**
	* <pre>
	* Number of XML Denial-of-Service security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxdosviolationsperprofilerate() throws Exception {
		return this.appfirewallviolxdosviolationsperprofilerate;
	}

	/**
	* <pre>
	* Number of XML Format security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolwellformednessviolationsperprofilerate() throws Exception {
		return this.appfirewallviolwellformednessviolationsperprofilerate;
	}

	/**
	* <pre>
	* Number of XML Denial-of-Service security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxdosviolationsperprofile() throws Exception {
		return this.appfirewallviolxdosviolationsperprofile;
	}

	/**
	* <pre>
	* Number of XML Cross-Site Scripting (XSS) security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolxmlxssviolationsperprofile() throws Exception {
		return this.appfirewallviolxmlxssviolationsperprofile;
	}

	/**
	* <pre>
	* Number of requests returning HTTP 5xx from the backend server
	* </pre>
	*/
	public Long get_appfirewallret5xxperprofilerate() throws Exception {
		return this.appfirewallret5xxperprofilerate;
	}

	/**
	* <pre>
	* Number of Referer Header security check violations seen by the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallviolrefererheaderperprofile() throws Exception {
		return this.appfirewallviolrefererheaderperprofile;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwprofile_response result = (appfwprofile_response) service.get_payload_formatter().string_to_resource(appfwprofile_response.class, response);
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
		return result.appfwprofile;
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
	* Use this API to fetch the statistics of all appfwprofile_stats resources that are configured on netscaler.
	*/
	public static appfwprofile_stats[] get(nitro_service service) throws Exception{
		appfwprofile_stats obj = new appfwprofile_stats();
		appfwprofile_stats[] response = (appfwprofile_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all appfwprofile_stats resources that are configured on netscaler.
	*/
	public static appfwprofile_stats[] get(nitro_service service, options option) throws Exception{
		appfwprofile_stats obj = new appfwprofile_stats();
		appfwprofile_stats[] response = (appfwprofile_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of appfwprofile_stats resource of given name .
	*/
	public static appfwprofile_stats get(nitro_service service, String name) throws Exception{
		appfwprofile_stats obj = new appfwprofile_stats();
		obj.set_name(name);
		appfwprofile_stats response = (appfwprofile_stats) obj.stat_resource(service);
		return response;
	}

}
