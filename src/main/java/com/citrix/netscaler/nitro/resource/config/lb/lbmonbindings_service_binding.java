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

class lbmonbindings_service_binding_response extends base_response
{
	public lbmonbindings_service_binding[] lbmonbindings_service_binding;
}
/**
	* Binding class showing the service that can be bound to lbmonbindings.
	*/

public class lbmonbindings_service_binding extends base_resource
{
	private String servicename;
	private String ipaddress;
	private Integer port;
	private String servicetype;
	private String svrstate;
	private String monsvcstate;
	private String monitorname;
	private Long __count;

	/**
	* <pre>
	* The name of the service.
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the service.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

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
	* The state of the service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_svrstate() throws Exception {
		return this.svrstate;
	}

	/**
	* <pre>
	* The configured state (enable/disable) of Monitor on this service.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_monsvcstate() throws Exception {
		return this.monsvcstate;
	}

	/**
	* <pre>
	* The port of the service.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The type of service.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, DTLS, NNTP, RPCSVR, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, SIP_UDP, DNS_TCP, ADNS_TCP, MYSQL, MSSQL, RADIUS, RDP, DIAMETER, SSL_DIAMETER, TFTP
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* The IPAddress of the service.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonbindings_service_binding_response result = (lbmonbindings_service_binding_response) service.get_payload_formatter().string_to_resource(lbmonbindings_service_binding_response.class, response);
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
		return result.lbmonbindings_service_binding;
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
	* Use this API to fetch lbmonbindings_service_binding resources of given name .
	*/
	public static lbmonbindings_service_binding[] get(nitro_service service, String monitorname) throws Exception{
		lbmonbindings_service_binding obj = new lbmonbindings_service_binding();
		obj.set_monitorname(monitorname);
		lbmonbindings_service_binding response[] = (lbmonbindings_service_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmonbindings_service_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbmonbindings_service_binding[] get_filtered(nitro_service service, String monitorname, String filter) throws Exception{
		lbmonbindings_service_binding obj = new lbmonbindings_service_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_filter(filter);
		lbmonbindings_service_binding[] response = (lbmonbindings_service_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmonbindings_service_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbmonbindings_service_binding[] get_filtered(nitro_service service, String monitorname, filtervalue[] filter) throws Exception{
		lbmonbindings_service_binding obj = new lbmonbindings_service_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_filter(filter);
		lbmonbindings_service_binding[] response = (lbmonbindings_service_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbmonbindings_service_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String monitorname) throws Exception{
		lbmonbindings_service_binding obj = new lbmonbindings_service_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_count(true);
		lbmonbindings_service_binding response[] = (lbmonbindings_service_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmonbindings_service_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String monitorname, String filter) throws Exception{
		lbmonbindings_service_binding obj = new lbmonbindings_service_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmonbindings_service_binding[] response = (lbmonbindings_service_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmonbindings_service_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String monitorname, filtervalue[] filter) throws Exception{
		lbmonbindings_service_binding obj = new lbmonbindings_service_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmonbindings_service_binding[] response = (lbmonbindings_service_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class servicetypeEnum {
		public static final String HTTP = "HTTP";
		public static final String FTP = "FTP";
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
		public static final String SSL = "SSL";
		public static final String SSL_BRIDGE = "SSL_BRIDGE";
		public static final String SSL_TCP = "SSL_TCP";
		public static final String DTLS = "DTLS";
		public static final String NNTP = "NNTP";
		public static final String RPCSVR = "RPCSVR";
		public static final String DNS = "DNS";
		public static final String ADNS = "ADNS";
		public static final String SNMP = "SNMP";
		public static final String RTSP = "RTSP";
		public static final String DHCPRA = "DHCPRA";
		public static final String ANY = "ANY";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String DNS_TCP = "DNS_TCP";
		public static final String ADNS_TCP = "ADNS_TCP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
		public static final String TFTP = "TFTP";
	}
	public static class svrstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String Unknown = "Unknown";
		public static final String DISABLED = "DISABLED";
	}
	public static class monsvcstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}