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

package com.citrix.netscaler.nitro.resource.config.ns;

/**
	* Provides additional arguments required for fetching the nsconnectiontable resource.
	*/

public class nsconnectiontable_args 
{
	private String filterexpression;
	private Boolean link;
	private Boolean name;
	private String[] detail;

	/**
	* <pre>
	* Expression using which TCP/IP connections must be filtered. Maximum length of filter is 255 and it can be of the following format: 
"<expression> \[<relop> <expression>"\]
where,
<relop> can be the && or the || relational operators.
<expression> is a string in the following format: 
<qualifier> <operator> <qualifier-value>
where, 
<operator> can be any one of the following (except the commas): ==, eq, !=, neq, >, gt, <, lt, >=, ge, <=, le, BETWEEN
Following are the valid qualifier - qualifier value combinations:
SOURCEIP - A valid IP address
SOURCEPORT - A valid port number
DESTIP - A valid IP address
DESTPORT - A valid port number
IP - A valid IP address
PORT - A valid port number
IDLETIME - A positive integer indicating the idle time
SVCNAME - The name of a service
VSVRNAME - The name of a vserver
STATE - CLOSE_WAIT, CLOSED, CLOSING, ESTABLISHED, FIN_WAIT_1, FIN_WAIT_2, LAST_ACK, LISTEN, SYN_RECEIVED, SYN_SENT, TIME_WAIT
SVCTYPE - HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, RPCSVR, RPCSVRS, RPCCLNT, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, MONITOR, MONITOR_UDP, MONITOR_PING, SIP_UDP, MYSQL, MSSQL, UNKNOWN.
	* </pre>
	*/
	public void set_filterexpression(String filterexpression) throws Exception{
		this.filterexpression = filterexpression;
	}

	/**
	* <pre>
	* Expression using which TCP/IP connections must be filtered. Maximum length of filter is 255 and it can be of the following format: 
"<expression> \[<relop> <expression>"\]
where,
<relop> can be the && or the || relational operators.
<expression> is a string in the following format: 
<qualifier> <operator> <qualifier-value>
where, 
<operator> can be any one of the following (except the commas): ==, eq, !=, neq, >, gt, <, lt, >=, ge, <=, le, BETWEEN
Following are the valid qualifier - qualifier value combinations:
SOURCEIP - A valid IP address
SOURCEPORT - A valid port number
DESTIP - A valid IP address
DESTPORT - A valid port number
IP - A valid IP address
PORT - A valid port number
IDLETIME - A positive integer indicating the idle time
SVCNAME - The name of a service
VSVRNAME - The name of a vserver
STATE - CLOSE_WAIT, CLOSED, CLOSING, ESTABLISHED, FIN_WAIT_1, FIN_WAIT_2, LAST_ACK, LISTEN, SYN_RECEIVED, SYN_SENT, TIME_WAIT
SVCTYPE - HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, RPCSVR, RPCSVRS, RPCCLNT, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, MONITOR, MONITOR_UDP, MONITOR_PING, SIP_UDP, MYSQL, MSSQL, UNKNOWN.
	* </pre>
	*/
	public String get_filterexpression() throws Exception {
		return this.filterexpression;
	}

	/**
	* <pre>
	* Display link information if available.
	* </pre>
	*/
	public void set_link(boolean link) throws Exception {
		this.link = new Boolean(link);
	}

	/**
	* <pre>
	* Display link information if available.
	* </pre>
	*/
	public void set_link(Boolean link) throws Exception{
		this.link = link;
	}

	/**
	* <pre>
	* Display link information if available.
	* </pre>
	*/
	public Boolean get_link() throws Exception {
		return this.link;
	}

	/**
	* <pre>
	* Display name instead of IP for local entities.
	* </pre>
	*/
	public void set_name(boolean name) throws Exception {
		this.name = new Boolean(name);
	}

	/**
	* <pre>
	* Display name instead of IP for local entities.
	* </pre>
	*/
	public void set_name(Boolean name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Display name instead of IP for local entities.
	* </pre>
	*/
	public Boolean get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Specify display options for the connection table. 
* LINK - Displays the linked PCB (Protocol Control Block). 
* NAME - Displays along with the service name. 
* CONNFAILOVER - Displays PCB with connection failover. 
* FULL - Displays all available details.<br> Possible values = LINK, NAME, CONNFAILOVER, FULL, NNM
	* </pre>
	*/
	public void set_detail(String[] detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* Specify display options for the connection table. 
* LINK - Displays the linked PCB (Protocol Control Block). 
* NAME - Displays along with the service name. 
* CONNFAILOVER - Displays PCB with connection failover. 
* FULL - Displays all available details.<br> Possible values = LINK, NAME, CONNFAILOVER, FULL, NNM
	* </pre>
	*/
	public String[] get_detail() throws Exception {
		return this.detail;
	}

	public static class detailEnum {
		public static final String LINK = "LINK";
		public static final String NAME = "NAME";
		public static final String CONNFAILOVER = "CONNFAILOVER";
		public static final String FULL = "FULL";
		public static final String NNM = "NNM";
	}
}
