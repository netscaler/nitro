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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsconnectiontable_response extends base_response
{
	public nsconnectiontable[] nsconnectiontable;
}
/**
* Configuration for TCP/IP connection table resource.
*/

public class nsconnectiontable extends base_resource
{
	private String filterexpression;
	private Boolean link;
	private Boolean name;
	private String[] detail;

	//------- Read only Parameter ---------;

	private String sourceip;
	private Integer sourceport;
	private String destip;
	private Integer destport;
	private String svctype;
	private Integer idletime;
	private String state;
	private String linksourceip;
	private Integer linksourceport;
	private String linkdestip;
	private Integer linkdestport;
	private String linkservicetype;
	private Integer linkidletime;
	private String linkstate;
	private String entityname;
	private String linkentityname;
	private Long connid;
	private Long linkconnid;
	private String[] optionflags;
	private Long nswsvalue;
	private Long peerwsvalue;
	private Integer mss;
	private Integer retxretrycnt;
	private Integer rcvwnd;
	private Integer advwnd;
	private Integer sndcwnd;
	private Integer iss;
	private Integer irs;
	private Integer rcvnxt;
	private Integer maxack;
	private Integer sndnxt;
	private Integer sndunack;
	private Integer httpendseq;
	private String httpstate;
	private Integer trcount;
	private String priority;
	private String httpreqver;
	private String httprequest;
	private Integer httprspcode;
	private Integer rttsmoothed;
	private Integer rttvariance;
	private Integer outoforderpkts;
	private String[] linkoptionflag;
	private Long linknswsvalue;
	private Long linkpeerwsvalue;
	private Integer targetnodeidnnm;
	private Integer sourcenodeidnnm;
	private Long channelidnnm;
	private Long msgversionnnm;
	private Long __count;

	/**
	* <pre>
	* The maximum length of filter expression is 255 and it can be of following format:
  <expression> [<relop> <expression>]

	<relop> = ( && | || )

	connectiontable supports two types of filter expressions:

	Classic Expressions:

	<expression> = the expression string in the format:
	<qualifier> <operator> <qualifier-value>

	<qualifier> = SOURCEIP.
	<qualifier-value> = A valid IP address.
	<qualifier> = SOURCEPORT.
	<qualifier-value> = A valid port number.
	<qualifier> = DESTIP.
	<qualifier-value> = A valid IP address.
	<qualifier> = DESTPORT.
	<qualifier-value> = A valid port number.
	<qualifier> = IP.
	<qualifier-value> = A valid IP address.
	<qualifier> = PORT.
	<qualifier-value> = A valid port number.
	<qualifier> = IDLETIME.
	<qualifier-value> = A positive integer indicating the idle time.
	<qualifier> = SVCNAME.
	<qualifier-value> = The name of a service.
	<qualifier> = VSVRNAME.
	<qualifier-value> = The name of a vserver.
	<qualifier> = CONNID
	<qualifier-value> = A valid PCB dev number.
	<qualifier> = INTF
	<qualifier-value> = A valid interface id in the form of x/y 
				(n/x/y in case of cluster interface).
	<qualifier> = VLAN
	<qualifier-value> = A valid VLAN ID.
	<qualifier> = STATE.
	<qualifier-value> = ( CLOSE_WAIT | CLOSED | CLOSING | ESTABLISHED |
		FIN_WAIT_1 | FIN_WAIT_2 | LAST_ACK | LISTEN |
		SYN_RECEIVED | SYN_SENT | TIME_WAIT )
	<qualifier> = SVCTYPE.
	<qualifier-value> = ( HTTP | FTP | TCP | UDP | SSL |
		SSL_BRIDGE | SSL_TCP | NNTP | RPCSVR | RPCSVRS |
		RPCCLNT | DNS | ADNS | SNMP | RTSP | DHCPRA | ANY |
		MONITOR | MONITOR_UDP | MONITOR_PING | SIP_UDP | MYSQL | MSSQL | UNKNOWN )

	<operator> = ( == | eq | != | neq | > | gt | < | lt | >= |
		ge | <= | le | BETWEEN )
		
	Default Expressions:

	<expression> =:
	CONNECTION.<qualifier>.<qualifier-method>.(<qualifier-value>)

	<qualifier> = SRCIP
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv4 address
	example = CONNECTION.SRCIP.EQ(127.0.0.1)

	<qualifier> = DSTIP
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv4 address.
	example = CONNECTION.DSTIP.EQ(127.0.0.1)

	<qualifier> = IP
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv4 address.
	example = CONNECTION.IP.EQ(127.0.0.1)

	<qualifier> = SRCIPv6
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv6 address.
	example = CONNECTION.SRCIPv6.EQ(2001:db8:0:0:1::1)

	<qualifier> = DSTIPv6
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv6 address.
	example = CONNECTION.DSTIPv6.EQ(2001:db8:0:0:1::1)

	<qualifier> = IPv6
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv6 address.
	example = CONNECTION.IPv6.EQ(2001:db8:0:0:1::1)

	<qualifier> = SRCPORT
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A valid port number.
	example = CONNECTION.SRCPORT.EQ(80)

	<qualifier> = DSTPORT
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A valid port number.
	example = CONNECTION.DSTPORT.EQ(80)

	<qualifier> = PORT
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid port number.
	example = CONNECTION.PORT.EQ(80)

	<qualifier> = SVCNAME
	<qualifier-method> = [ EQ | NE | CONTAINS | STARTSWITH
						| ENDSWITH ]
	<qualifier-value>  = service name.
	example = CONNECTION.SVCNAME.EQ("name")

	<qualifier> = LB_VSERVER.NAME
	<qualifier-method> = [ EQ | NE | CONTAINS | STARTSWITH
						| ENDSWITH ]
	<qualifier-value>  = LB vserver name.
	example = CONNECTION.LB_VSERVER.NAME.EQ("name")

	<qualifier> = CS_VSERVER.NAME
	<qualifier-method> = [ EQ | NE | CONTAINS | STARTSWITH
						| ENDSWITH ]
	<qualifier-value>  = CS vserver name.
	example = CONNECTION.CS_VSERVER.NAME.EQ("name")

	<qualifier> = INTF
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid interface id in the form of
				x/y (n/x/y in case of cluster interface).
	examle = CONNECTION.INTF.EQ("0/1/1")

	<qualifier> = VLANID
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A valid VLAN ID.
	example = CONNECTION.VLANID.EQ(0)

	<qualifier> = CONNID
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A valid PCB dev number.
	example = CONNECTION.CONNID.EQ(0)
	
	<qualifier> = IDLETIME
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A positive integer indicating the
   				idletime.
	example = CONNECTION.IDLETIME.LT(100)

	<qualifier> = TCPSTATE
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = ( CLOSE_WAIT | CLOSED | CLOSING |
   		ESTABLISHED | FIN_WAIT_1 | FIN_WAIT_2 | LAST_ACK |
		LISTEN | SYN_RECEIVED | SYN_SENT | TIME_WAIT | 
		NOT_APPLICABLE)
	example = CONNECTION.TCPSTATE.EQ(LISTEN)

	<qualifier> = SERVICE_TYPE
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = ( SVC_HTTP | FTP | TCP | UDP | SSL |
		SSL_BRIDGE | SSL_TCP | NNTP | RPCSVR | RPCSVRS |
		RPCCLNT | SVC_DNS | ADNS | SNMP | RTSP | DHCPRA | ANY|
		MONITOR | MONITOR_UDP | MONITOR_PING | SIP_UDP |
		SVC_MYSQL | SVC_MSSQL | SERVICE_UNKNOWN )
	example = CONNECTION.SERVICE_TYPE.EQ(ANY)
	
	common usecases:
	Filtering out loopback connections and view present
	connections through netsclaer 
	show connectiontable "CONNECTION.IP.NEQ(127.0.0.1) &&
	CONNECTION.TCPSTATE.EQ(ESTABLISHED)" -detail full

	show connections from a particular sourceip and targeted
	to port 80
	show connectiontable "CONNECTION.SRCIP.EQ(10.102.1.91) &&
	CONNECTION.DSTPORT.EQ(80)"

	show connection particular to a service and its linked
	client connections 
	show connectiontable "CONNECTION.SVCNAME.EQ("S1")" 
	-detail link

	show connections for a particular servicetype(e.g.http)
	show connectiontable "CONNECTION.SERVICE_TYPE.EQ(TCP)"

	viewing connections that have been idle for a long time
	show connectiontable "CONNECTION.IDLETIME.GT(100)"

	show connections for a particular interface and vlan
	show connectiontable "CONNECTION.INTF.EQ("1/1") &&
	CONNECTION.VLANID.EQ(1)"
	.
	* </pre>
	*/
	public void set_filterexpression(String filterexpression) throws Exception{
		this.filterexpression = filterexpression;
	}

	/**
	* <pre>
	* The maximum length of filter expression is 255 and it can be of following format:
  <expression> [<relop> <expression>]

	<relop> = ( && | || )

	connectiontable supports two types of filter expressions:

	Classic Expressions:

	<expression> = the expression string in the format:
	<qualifier> <operator> <qualifier-value>

	<qualifier> = SOURCEIP.
	<qualifier-value> = A valid IP address.
	<qualifier> = SOURCEPORT.
	<qualifier-value> = A valid port number.
	<qualifier> = DESTIP.
	<qualifier-value> = A valid IP address.
	<qualifier> = DESTPORT.
	<qualifier-value> = A valid port number.
	<qualifier> = IP.
	<qualifier-value> = A valid IP address.
	<qualifier> = PORT.
	<qualifier-value> = A valid port number.
	<qualifier> = IDLETIME.
	<qualifier-value> = A positive integer indicating the idle time.
	<qualifier> = SVCNAME.
	<qualifier-value> = The name of a service.
	<qualifier> = VSVRNAME.
	<qualifier-value> = The name of a vserver.
	<qualifier> = CONNID
	<qualifier-value> = A valid PCB dev number.
	<qualifier> = INTF
	<qualifier-value> = A valid interface id in the form of x/y 
				(n/x/y in case of cluster interface).
	<qualifier> = VLAN
	<qualifier-value> = A valid VLAN ID.
	<qualifier> = STATE.
	<qualifier-value> = ( CLOSE_WAIT | CLOSED | CLOSING | ESTABLISHED |
		FIN_WAIT_1 | FIN_WAIT_2 | LAST_ACK | LISTEN |
		SYN_RECEIVED | SYN_SENT | TIME_WAIT )
	<qualifier> = SVCTYPE.
	<qualifier-value> = ( HTTP | FTP | TCP | UDP | SSL |
		SSL_BRIDGE | SSL_TCP | NNTP | RPCSVR | RPCSVRS |
		RPCCLNT | DNS | ADNS | SNMP | RTSP | DHCPRA | ANY |
		MONITOR | MONITOR_UDP | MONITOR_PING | SIP_UDP | MYSQL | MSSQL | UNKNOWN )

	<operator> = ( == | eq | != | neq | > | gt | < | lt | >= |
		ge | <= | le | BETWEEN )
		
	Default Expressions:

	<expression> =:
	CONNECTION.<qualifier>.<qualifier-method>.(<qualifier-value>)

	<qualifier> = SRCIP
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv4 address
	example = CONNECTION.SRCIP.EQ(127.0.0.1)

	<qualifier> = DSTIP
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv4 address.
	example = CONNECTION.DSTIP.EQ(127.0.0.1)

	<qualifier> = IP
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv4 address.
	example = CONNECTION.IP.EQ(127.0.0.1)

	<qualifier> = SRCIPv6
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv6 address.
	example = CONNECTION.SRCIPv6.EQ(2001:db8:0:0:1::1)

	<qualifier> = DSTIPv6
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv6 address.
	example = CONNECTION.DSTIPv6.EQ(2001:db8:0:0:1::1)

	<qualifier> = IPv6
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid IPv6 address.
	example = CONNECTION.IPv6.EQ(2001:db8:0:0:1::1)

	<qualifier> = SRCPORT
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A valid port number.
	example = CONNECTION.SRCPORT.EQ(80)

	<qualifier> = DSTPORT
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A valid port number.
	example = CONNECTION.DSTPORT.EQ(80)

	<qualifier> = PORT
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid port number.
	example = CONNECTION.PORT.EQ(80)

	<qualifier> = SVCNAME
	<qualifier-method> = [ EQ | NE | CONTAINS | STARTSWITH
						| ENDSWITH ]
	<qualifier-value>  = service name.
	example = CONNECTION.SVCNAME.EQ("name")

	<qualifier> = LB_VSERVER.NAME
	<qualifier-method> = [ EQ | NE | CONTAINS | STARTSWITH
						| ENDSWITH ]
	<qualifier-value>  = LB vserver name.
	example = CONNECTION.LB_VSERVER.NAME.EQ("name")

	<qualifier> = CS_VSERVER.NAME
	<qualifier-method> = [ EQ | NE | CONTAINS | STARTSWITH
						| ENDSWITH ]
	<qualifier-value>  = CS vserver name.
	example = CONNECTION.CS_VSERVER.NAME.EQ("name")

	<qualifier> = INTF
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = A valid interface id in the form of
				x/y (n/x/y in case of cluster interface).
	examle = CONNECTION.INTF.EQ("0/1/1")

	<qualifier> = VLANID
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A valid VLAN ID.
	example = CONNECTION.VLANID.EQ(0)

	<qualifier> = CONNID
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A valid PCB dev number.
	example = CONNECTION.CONNID.EQ(0)
	
	<qualifier> = IDLETIME
	<qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	<qualifier-value>  = A positive integer indicating the
   				idletime.
	example = CONNECTION.IDLETIME.LT(100)

	<qualifier> = TCPSTATE
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = ( CLOSE_WAIT | CLOSED | CLOSING |
   		ESTABLISHED | FIN_WAIT_1 | FIN_WAIT_2 | LAST_ACK |
		LISTEN | SYN_RECEIVED | SYN_SENT | TIME_WAIT | 
		NOT_APPLICABLE)
	example = CONNECTION.TCPSTATE.EQ(LISTEN)

	<qualifier> = SERVICE_TYPE
	<qualifier-method> = [ EQ | NE ]
	<qualifier-value>  = ( SVC_HTTP | FTP | TCP | UDP | SSL |
		SSL_BRIDGE | SSL_TCP | NNTP | RPCSVR | RPCSVRS |
		RPCCLNT | SVC_DNS | ADNS | SNMP | RTSP | DHCPRA | ANY|
		MONITOR | MONITOR_UDP | MONITOR_PING | SIP_UDP |
		SVC_MYSQL | SVC_MSSQL | SERVICE_UNKNOWN )
	example = CONNECTION.SERVICE_TYPE.EQ(ANY)
	
	common usecases:
	Filtering out loopback connections and view present
	connections through netsclaer 
	show connectiontable "CONNECTION.IP.NEQ(127.0.0.1) &&
	CONNECTION.TCPSTATE.EQ(ESTABLISHED)" -detail full

	show connections from a particular sourceip and targeted
	to port 80
	show connectiontable "CONNECTION.SRCIP.EQ(10.102.1.91) &&
	CONNECTION.DSTPORT.EQ(80)"

	show connection particular to a service and its linked
	client connections 
	show connectiontable "CONNECTION.SVCNAME.EQ("S1")" 
	-detail link

	show connections for a particular servicetype(e.g.http)
	show connectiontable "CONNECTION.SERVICE_TYPE.EQ(TCP)"

	viewing connections that have been idle for a long time
	show connectiontable "CONNECTION.IDLETIME.GT(100)"

	show connections for a particular interface and vlan
	show connectiontable "CONNECTION.INTF.EQ("1/1") &&
	CONNECTION.VLANID.EQ(1)"
	.
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
	* Display options for the connection table.<br> Possible values = LINK, NAME, CONNFAILOVER, FULL, NNM
	* </pre>
	*/
	public void set_detail(String[] detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* Display options for the connection table.<br> Possible values = LINK, NAME, CONNFAILOVER, FULL, NNM
	* </pre>
	*/
	public String[] get_detail() throws Exception {
		return this.detail;
	}

	/**
	* <pre>
	* Source IP of the connection.
	* </pre>
	*/
	public String get_sourceip() throws Exception {
		return this.sourceip;
	}

	/**
	* <pre>
	* Source port of the connection.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_sourceport() throws Exception {
		return this.sourceport;
	}

	/**
	* <pre>
	* Destination IP of the connection.
	* </pre>
	*/
	public String get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* Destination port of the connection.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* Protocol supported by the connection.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, RPCSVR, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, SIP_UDP, DNS_TCP, ADNS_TCP, HTTPSVR, HTTPCLIENT, NAT, HA, AAA, SINCTCP, VPN AFTP, MONITORS, SSLVPN UDP, SINCUDP, RIP, UDP CLNT, SASP, RPCCLNTS, ROUTE, AUDIT, STA HTTP, STA SSL, DNS RESOLVE, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public String get_svctype() throws Exception {
		return this.svctype;
	}

	/**
	* <pre>
	* Time since last activity was detected on the connection.
	* </pre>
	*/
	public Integer get_idletime() throws Exception {
		return this.idletime;
	}

	/**
	* <pre>
	* Current TCP/IP state of the connection.<br> Possible values = CLOSED, LISTEN, SYN_SENT, SYN_RECEIVED, ESTABLISHED, CLOSE_WAIT, FIN_WAIT_1, CLOSING, LAST_ACK, FIN_WAIT_2, TIME_WAIT, NA
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Source IP of the link connection.
	* </pre>
	*/
	public String get_linksourceip() throws Exception {
		return this.linksourceip;
	}

	/**
	* <pre>
	* Source port of the link connection.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_linksourceport() throws Exception {
		return this.linksourceport;
	}

	/**
	* <pre>
	* Destination IP of the link connection.
	* </pre>
	*/
	public String get_linkdestip() throws Exception {
		return this.linkdestip;
	}

	/**
	* <pre>
	* Destination port of the link connection.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_linkdestport() throws Exception {
		return this.linkdestport;
	}

	/**
	* <pre>
	* Protocol supported by the link connection.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, RPCSVR, DNS, ADNS, SNMP, RTSP, DHCPRA, ANY, SIP_UDP, DNS_TCP, ADNS_TCP, HTTPSVR, HTTPCLIENT, NAT, HA, AAA, SINCTCP, VPN AFTP, MONITORS, SSLVPN UDP, SINCUDP, RIP, UDP CLNT, SASP, RPCCLNTS, ROUTE, AUDIT, STA HTTP, STA SSL, DNS RESOLVE, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public String get_linkservicetype() throws Exception {
		return this.linkservicetype;
	}

	/**
	* <pre>
	* Time since last activity was detected on link connection.
	* </pre>
	*/
	public Integer get_linkidletime() throws Exception {
		return this.linkidletime;
	}

	/**
	* <pre>
	* TCP/IP current state of link connection.<br> Possible values = CLOSED, LISTEN, SYN_SENT, SYN_RECEIVED, ESTABLISHED, CLOSE_WAIT, FIN_WAIT_1, CLOSING, LAST_ACK, FIN_WAIT_2, TIME_WAIT, NA
	* </pre>
	*/
	public String get_linkstate() throws Exception {
		return this.linkstate;
	}

	/**
	* <pre>
	* NetScaler entity name for the connection.
	* </pre>
	*/
	public String get_entityname() throws Exception {
		return this.entityname;
	}

	/**
	* <pre>
	* NetScaler entity name for link connection.
	* </pre>
	*/
	public String get_linkentityname() throws Exception {
		return this.linkentityname;
	}

	/**
	* <pre>
	* Unique transaction number for the connection.
	* </pre>
	*/
	public Long get_connid() throws Exception {
		return this.connid;
	}

	/**
	* <pre>
	* Unique transaction number for the peer connection.
	* </pre>
	*/
	public Long get_linkconnid() throws Exception {
		return this.linkconnid;
	}

	/**
	* <pre>
	* flags used to store TCP options like Sack, WS.<br> Possible values = sack, timstmp, ws
	* </pre>
	*/
	public String[] get_optionflags() throws Exception {
		return this.optionflags;
	}

	/**
	* <pre>
	* netscaler window scaling value.
	* </pre>
	*/
	public Long get_nswsvalue() throws Exception {
		return this.nswsvalue;
	}

	/**
	* <pre>
	* peer window scaling value.
	* </pre>
	*/
	public Long get_peerwsvalue() throws Exception {
		return this.peerwsvalue;
	}

	/**
	* <pre>
	* Client side MSS for the connection - used in server SYN.
	* </pre>
	*/
	public Integer get_mss() throws Exception {
		return this.mss;
	}

	/**
	* <pre>
	* Retransmission retry count for the connection.
	* </pre>
	*/
	public Integer get_retxretrycnt() throws Exception {
		return this.retxretrycnt;
	}

	/**
	* <pre>
	* Received Advertised Window for the connection.
	* </pre>
	*/
	public Integer get_rcvwnd() throws Exception {
		return this.rcvwnd;
	}

	/**
	* <pre>
	* Sent advertised window for the connection.
	* </pre>
	*/
	public Integer get_advwnd() throws Exception {
		return this.advwnd;
	}

	/**
	* <pre>
	* sent congestion window for the connection.
	* </pre>
	*/
	public Integer get_sndcwnd() throws Exception {
		return this.sndcwnd;
	}

	/**
	* <pre>
	* Initial send sequence number for the connection.
	* </pre>
	*/
	public Integer get_iss() throws Exception {
		return this.iss;
	}

	/**
	* <pre>
	* Initial receive sequence number for the connection.
	* </pre>
	*/
	public Integer get_irs() throws Exception {
		return this.irs;
	}

	/**
	* <pre>
	* next expecting seq number for the connection.
	* </pre>
	*/
	public Integer get_rcvnxt() throws Exception {
		return this.rcvnxt;
	}

	/**
	* <pre>
	* current running max ack sent for the connection.
	* </pre>
	*/
	public Integer get_maxack() throws Exception {
		return this.maxack;
	}

	/**
	* <pre>
	* next bytes seq number for the connection.
	* </pre>
	*/
	public Integer get_sndnxt() throws Exception {
		return this.sndnxt;
	}

	/**
	* <pre>
	* Most recently received ACK for the connection.
	* </pre>
	*/
	public Integer get_sndunack() throws Exception {
		return this.sndunack;
	}

	/**
	* <pre>
	* HTTP parsing tracking seq number for the connection.
	* </pre>
	*/
	public Integer get_httpendseq() throws Exception {
		return this.httpendseq;
	}

	/**
	* <pre>
	* HTTP Protocol  state for the connection.<br> Possible values = INITIALIZED, CONTENT_LENGTH, CHUNKED, WAIT_FINAL_ACK, UNKNOWN, DONE, WAIT_FIN
	* </pre>
	*/
	public String get_httpstate() throws Exception {
		return this.httpstate;
	}

	/**
	* <pre>
	* Max reuests allowed per connection.
	* </pre>
	*/
	public Integer get_trcount() throws Exception {
		return this.trcount;
	}

	/**
	* <pre>
	* priority of the connection.<br> Possible values = SC Priority, Priority queue1, priority queue2, priority queue3, DoS Priority, Surge Priority
	* </pre>
	*/
	public String get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* current HTTP request version on the connection.<br> Possible values = HTTP_1_0, HTTP_1_1, HTTP_0_9, RTSP_1_0, SIP_2_0, VPN_ICA_SOCKS, VPN_ICA_CGP
	* </pre>
	*/
	public String get_httpreqver() throws Exception {
		return this.httpreqver;
	}

	/**
	* <pre>
	* current HTTP request type on the connection.<br> Possible values = OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, RPCCONNECT
	* </pre>
	*/
	public String get_httprequest() throws Exception {
		return this.httprequest;
	}

	/**
	* <pre>
	* current response type on the connection.
	* </pre>
	*/
	public Integer get_httprspcode() throws Exception {
		return this.httprspcode;
	}

	/**
	* <pre>
	* smoothed RTT value of the connection.
	* </pre>
	*/
	public Integer get_rttsmoothed() throws Exception {
		return this.rttsmoothed;
	}

	/**
	* <pre>
	* RTT variance for the connection.
	* </pre>
	*/
	public Integer get_rttvariance() throws Exception {
		return this.rttvariance;
	}

	/**
	* <pre>
	* held packets on the connection.
	* </pre>
	*/
	public Integer get_outoforderpkts() throws Exception {
		return this.outoforderpkts;
	}

	/**
	* <pre>
	* Link connection's TCP option flag for Sack and WS.<br> Possible values = sack, timstmp, ws
	* </pre>
	*/
	public String[] get_linkoptionflag() throws Exception {
		return this.linkoptionflag;
	}

	/**
	* <pre>
	* Link connection-s netscaler window scaling value.
	* </pre>
	*/
	public Long get_linknswsvalue() throws Exception {
		return this.linknswsvalue;
	}

	/**
	* <pre>
	* Link connection-s peer netscaler window scaling value.
	* </pre>
	*/
	public Long get_linkpeerwsvalue() throws Exception {
		return this.linkpeerwsvalue;
	}

	/**
	* <pre>
	* NNM connection target node ID.
	* </pre>
	*/
	public Integer get_targetnodeidnnm() throws Exception {
		return this.targetnodeidnnm;
	}

	/**
	* <pre>
	* NNM connection source node ID.
	* </pre>
	*/
	public Integer get_sourcenodeidnnm() throws Exception {
		return this.sourcenodeidnnm;
	}

	/**
	* <pre>
	* NNM connection channel ID.
	* </pre>
	*/
	public Long get_channelidnnm() throws Exception {
		return this.channelidnnm;
	}

	/**
	* <pre>
	* nnm message version.
	* </pre>
	*/
	public Long get_msgversionnnm() throws Exception {
		return this.msgversionnnm;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsconnectiontable_response result = (nsconnectiontable_response) service.get_payload_formatter().string_to_resource(nsconnectiontable_response.class, response);
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
		return result.nsconnectiontable;
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
	* Use this API to fetch all the nsconnectiontable resources that are configured on netscaler.
	*/
	public static nsconnectiontable[] get(nitro_service service) throws Exception{
		nsconnectiontable obj = new nsconnectiontable();
		nsconnectiontable[] response = (nsconnectiontable[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsconnectiontable resources that are configured on netscaler.
	*/
	public static nsconnectiontable[] get(nitro_service service, options option) throws Exception{
		nsconnectiontable obj = new nsconnectiontable();
		nsconnectiontable[] response = (nsconnectiontable[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the nsconnectiontable resources that are configured on netscaler.
	* This uses nsconnectiontable_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static nsconnectiontable[] get(nitro_service service, nsconnectiontable_args args) throws Exception{
		nsconnectiontable obj = new nsconnectiontable();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		nsconnectiontable[] response = (nsconnectiontable[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsconnectiontable resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsconnectiontable[] get_filtered(nitro_service service, String filter) throws Exception{
		nsconnectiontable obj = new nsconnectiontable();
		options option = new options();
		option.set_filter(filter);
		nsconnectiontable[] response = (nsconnectiontable[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsconnectiontable resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsconnectiontable[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsconnectiontable obj = new nsconnectiontable();
		options option = new options();
		option.set_filter(filter);
		nsconnectiontable[] response = (nsconnectiontable[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsconnectiontable resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsconnectiontable obj = new nsconnectiontable();
		options option = new options();
		option.set_count(true);
		nsconnectiontable[] response = (nsconnectiontable[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsconnectiontable resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsconnectiontable obj = new nsconnectiontable();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsconnectiontable[] response = (nsconnectiontable[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsconnectiontable resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsconnectiontable obj = new nsconnectiontable();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsconnectiontable[] response = (nsconnectiontable[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class priorityEnum {
		public static final String SC_Priority = "SC Priority";
		public static final String Priority_queue1 = "Priority queue1";
		public static final String priority_queue2 = "priority queue2";
		public static final String priority_queue3 = "priority queue3";
		public static final String DoS_Priority = "DoS Priority";
		public static final String Surge_Priority = "Surge Priority";
	}
	public static class linkoptionflagEnum {
		public static final String sack = "sack";
		public static final String timstmp = "timstmp";
		public static final String ws = "ws";
	}
	public static class stateEnum {
		public static final String CLOSED = "CLOSED";
		public static final String LISTEN = "LISTEN";
		public static final String SYN_SENT = "SYN_SENT";
		public static final String SYN_RECEIVED = "SYN_RECEIVED";
		public static final String ESTABLISHED = "ESTABLISHED";
		public static final String CLOSE_WAIT = "CLOSE_WAIT";
		public static final String FIN_WAIT_1 = "FIN_WAIT_1";
		public static final String CLOSING = "CLOSING";
		public static final String LAST_ACK = "LAST_ACK";
		public static final String FIN_WAIT_2 = "FIN_WAIT_2";
		public static final String TIME_WAIT = "TIME_WAIT";
		public static final String NA = "NA";
	}
	public static class linkstateEnum {
		public static final String CLOSED = "CLOSED";
		public static final String LISTEN = "LISTEN";
		public static final String SYN_SENT = "SYN_SENT";
		public static final String SYN_RECEIVED = "SYN_RECEIVED";
		public static final String ESTABLISHED = "ESTABLISHED";
		public static final String CLOSE_WAIT = "CLOSE_WAIT";
		public static final String FIN_WAIT_1 = "FIN_WAIT_1";
		public static final String CLOSING = "CLOSING";
		public static final String LAST_ACK = "LAST_ACK";
		public static final String FIN_WAIT_2 = "FIN_WAIT_2";
		public static final String TIME_WAIT = "TIME_WAIT";
		public static final String NA = "NA";
	}
	public static class optionflagsEnum {
		public static final String sack = "sack";
		public static final String timstmp = "timstmp";
		public static final String ws = "ws";
	}
	public static class svctypeEnum {
		public static final String HTTP = "HTTP";
		public static final String FTP = "FTP";
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
		public static final String SSL = "SSL";
		public static final String SSL_BRIDGE = "SSL_BRIDGE";
		public static final String SSL_TCP = "SSL_TCP";
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
		public static final String HTTPSVR = "HTTPSVR";
		public static final String HTTPCLIENT = "HTTPCLIENT";
		public static final String NAT = "NAT";
		public static final String HA = "HA";
		public static final String AAA = "AAA";
		public static final String SINCTCP = "SINCTCP";
		public static final String VPN_AFTP = "VPN AFTP";
		public static final String MONITORS = "MONITORS";
		public static final String SSLVPN_UDP = "SSLVPN UDP";
		public static final String SINCUDP = "SINCUDP";
		public static final String RIP = "RIP";
		public static final String UDP_CLNT = "UDP CLNT";
		public static final String SASP = "SASP";
		public static final String RPCCLNTS = "RPCCLNTS";
		public static final String ROUTE = "ROUTE";
		public static final String AUDIT = "AUDIT";
		public static final String STA_HTTP = "STA HTTP";
		public static final String STA_SSL = "STA SSL";
		public static final String DNS_RESOLVE = "DNS RESOLVE";
		public static final String RDP = "RDP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
	}
	public static class httpreqverEnum {
		public static final String HTTP_1_0 = "HTTP_1_0";
		public static final String HTTP_1_1 = "HTTP_1_1";
		public static final String HTTP_0_9 = "HTTP_0_9";
		public static final String RTSP_1_0 = "RTSP_1_0";
		public static final String SIP_2_0 = "SIP_2_0";
		public static final String VPN_ICA_SOCKS = "VPN_ICA_SOCKS";
		public static final String VPN_ICA_CGP = "VPN_ICA_CGP";
	}
	public static class httprequestEnum {
		public static final String OPTIONS = "OPTIONS";
		public static final String GET = "GET";
		public static final String HEAD = "HEAD";
		public static final String POST = "POST";
		public static final String PUT = "PUT";
		public static final String DELETE = "DELETE";
		public static final String TRACE = "TRACE";
		public static final String CONNECT = "CONNECT";
		public static final String RPCCONNECT = "RPCCONNECT";
	}
	public static class detailEnum {
		public static final String LINK = "LINK";
		public static final String NAME = "NAME";
		public static final String CONNFAILOVER = "CONNFAILOVER";
		public static final String FULL = "FULL";
		public static final String NNM = "NNM";
	}
	public static class linkservicetypeEnum {
		public static final String HTTP = "HTTP";
		public static final String FTP = "FTP";
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
		public static final String SSL = "SSL";
		public static final String SSL_BRIDGE = "SSL_BRIDGE";
		public static final String SSL_TCP = "SSL_TCP";
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
		public static final String HTTPSVR = "HTTPSVR";
		public static final String HTTPCLIENT = "HTTPCLIENT";
		public static final String NAT = "NAT";
		public static final String HA = "HA";
		public static final String AAA = "AAA";
		public static final String SINCTCP = "SINCTCP";
		public static final String VPN_AFTP = "VPN AFTP";
		public static final String MONITORS = "MONITORS";
		public static final String SSLVPN_UDP = "SSLVPN UDP";
		public static final String SINCUDP = "SINCUDP";
		public static final String RIP = "RIP";
		public static final String UDP_CLNT = "UDP CLNT";
		public static final String SASP = "SASP";
		public static final String RPCCLNTS = "RPCCLNTS";
		public static final String ROUTE = "ROUTE";
		public static final String AUDIT = "AUDIT";
		public static final String STA_HTTP = "STA HTTP";
		public static final String STA_SSL = "STA SSL";
		public static final String DNS_RESOLVE = "DNS RESOLVE";
		public static final String RDP = "RDP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
	}
	public static class httpstateEnum {
		public static final String INITIALIZED = "INITIALIZED";
		public static final String CONTENT_LENGTH = "CONTENT_LENGTH";
		public static final String CHUNKED = "CHUNKED";
		public static final String WAIT_FINAL_ACK = "WAIT_FINAL_ACK";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String DONE = "DONE";
		public static final String WAIT_FIN = "WAIT_FIN";
	}
}
