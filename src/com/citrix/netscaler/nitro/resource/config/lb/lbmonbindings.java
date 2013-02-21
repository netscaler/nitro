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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbmonbindings_response extends base_response
{
	public lbmonbindings[] lbmonbindings;
}
/**
* Configuration for monitro bindings resource.
*/

public class lbmonbindings extends base_resource
{
	private String monitorname;

	//------- Read only Parameter ---------;

	private String type;
	private String state;
	private Long __count;

	/**
	* <pre>
	* The name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitorname(String monitorname) throws Exception{
		this.monitorname = monitorname;
	}

	/**
	* <pre>
	* The name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitorname() throws Exception {
		return this.monitorname;
	}

	/**
	* <pre>
	* The type of monitor.<br> Possible values = PING, TCP, HTTP, TCP-ECV, HTTP-ECV, UDP-ECV, DNS, FTP, LDNS-PING, LDNS-TCP, LDNS-DNS, RADIUS, USER, HTTP-INLINE, SIP-UDP, LOAD, FTP-EXTENDED, SMTP, SNMP, NNTP, MYSQL, MYSQL-ECV, MSSQL-ECV, LDAP, POP3, CITRIX-XML-SERVICE, CITRIX-WEB-INTERFACE, DNS-TCP, RTSP, ARP, CITRIX-AG, CITRIX-AAC-LOGINPAGE, CITRIX-AAC-LAS, CITRIX-XD-DDC, ND6, CITRIX-WI-EXTENDED, DIAMETER
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The state of the monitor.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonbindings_response result = (lbmonbindings_response) service.get_payload_formatter().string_to_resource(lbmonbindings_response.class, response);
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
		return result.lbmonbindings;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.monitorname;
	}

	/**
	* Use this API to fetch lbmonbindings resource of given name .
	*/
	public static lbmonbindings get(nitro_service service, String monitorname) throws Exception{
		lbmonbindings obj = new lbmonbindings();
		obj.set_monitorname(monitorname);
		lbmonbindings response = (lbmonbindings) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbmonbindings resources of given names .
	*/
	public static lbmonbindings[] get(nitro_service service, String monitorname[]) throws Exception{
		if (monitorname !=null && monitorname.length>0) {
			lbmonbindings response[] = new lbmonbindings[monitorname.length];
			lbmonbindings obj[] = new lbmonbindings[monitorname.length];
			for (int i=0;i<monitorname.length;i++) {
				obj[i] = new lbmonbindings();
				obj[i].set_monitorname(monitorname[i]);
				response[i] = (lbmonbindings) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of lbmonbindings resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbmonbindings[] get_filtered(nitro_service service, lbmonbindings obj, String filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		lbmonbindings[] response = (lbmonbindings[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmonbindings resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbmonbindings[] get_filtered(nitro_service service, lbmonbindings obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		lbmonbindings[] response = (lbmonbindings[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbmonbindings resources configured on NetScaler.
	*/
	public static long count(nitro_service service, lbmonbindings obj) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		lbmonbindings[] response = (lbmonbindings[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbmonbindings resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, lbmonbindings obj, String filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		lbmonbindings[] response = (lbmonbindings[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmonbindings resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, lbmonbindings obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		lbmonbindings[] response = (lbmonbindings[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String PING = "PING";
		public static final String TCP = "TCP";
		public static final String HTTP = "HTTP";
		public static final String TCP_ECV = "TCP-ECV";
		public static final String HTTP_ECV = "HTTP-ECV";
		public static final String UDP_ECV = "UDP-ECV";
		public static final String DNS = "DNS";
		public static final String FTP = "FTP";
		public static final String LDNS_PING = "LDNS-PING";
		public static final String LDNS_TCP = "LDNS-TCP";
		public static final String LDNS_DNS = "LDNS-DNS";
		public static final String RADIUS = "RADIUS";
		public static final String USER = "USER";
		public static final String HTTP_INLINE = "HTTP-INLINE";
		public static final String SIP_UDP = "SIP-UDP";
		public static final String LOAD = "LOAD";
		public static final String FTP_EXTENDED = "FTP-EXTENDED";
		public static final String SMTP = "SMTP";
		public static final String SNMP = "SNMP";
		public static final String NNTP = "NNTP";
		public static final String MYSQL = "MYSQL";
		public static final String MYSQL_ECV = "MYSQL-ECV";
		public static final String MSSQL_ECV = "MSSQL-ECV";
		public static final String LDAP = "LDAP";
		public static final String POP3 = "POP3";
		public static final String CITRIX_XML_SERVICE = "CITRIX-XML-SERVICE";
		public static final String CITRIX_WEB_INTERFACE = "CITRIX-WEB-INTERFACE";
		public static final String DNS_TCP = "DNS-TCP";
		public static final String RTSP = "RTSP";
		public static final String ARP = "ARP";
		public static final String CITRIX_AG = "CITRIX-AG";
		public static final String CITRIX_AAC_LOGINPAGE = "CITRIX-AAC-LOGINPAGE";
		public static final String CITRIX_AAC_LAS = "CITRIX-AAC-LAS";
		public static final String CITRIX_XD_DDC = "CITRIX-XD-DDC";
		public static final String ND6 = "ND6";
		public static final String CITRIX_WI_EXTENDED = "CITRIX-WI-EXTENDED";
		public static final String DIAMETER = "DIAMETER";
	}
}
