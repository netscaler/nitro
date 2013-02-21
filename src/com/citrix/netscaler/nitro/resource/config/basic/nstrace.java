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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nstrace_response extends base_response
{
	public nstrace nstrace;
}
/**
* Configuration for nstrace operations resource.
*/

public class nstrace extends base_resource
{
	private Long nf;
	private Long time;
	private Long size;
	private String[] mode;
	private String tcpdump;
	private String pernic;
	private String filename;
	private String fileid;
	private String filter;
	private String link;
	private Long[] nodes;

	//------- Read only Parameter ---------;

	private String state;
	private String scope;
	private String tracelocation;

	/**
	* <pre>
	* Number of files to be generated in cycle.<br> Default value: 24<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_nf(long nf) throws Exception {
		this.nf = new Long(nf);
	}

	/**
	* <pre>
	* Number of files to be generated in cycle.<br> Default value: 24<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_nf(Long nf) throws Exception{
		this.nf = nf;
	}

	/**
	* <pre>
	* Number of files to be generated in cycle.<br> Default value: 24<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_nf() throws Exception {
		return this.nf;
	}

	/**
	* <pre>
	* Time per file (sec).<br> Default value: 3600<br> Minimum value =  1
	* </pre>
	*/
	public void set_time(long time) throws Exception {
		this.time = new Long(time);
	}

	/**
	* <pre>
	* Time per file (sec).<br> Default value: 3600<br> Minimum value =  1
	* </pre>
	*/
	public void set_time(Long time) throws Exception{
		this.time = time;
	}

	/**
	* <pre>
	* Time per file (sec).<br> Default value: 3600<br> Minimum value =  1
	* </pre>
	*/
	public Long get_time() throws Exception {
		return this.time;
	}

	/**
	* <pre>
	* Size of the captured data. Set 0 for full packet trace.<br> Default value: 164<br> Minimum value =  0<br> Maximum value =  1514
	* </pre>
	*/
	public void set_size(long size) throws Exception {
		this.size = new Long(size);
	}

	/**
	* <pre>
	* Size of the captured data. Set 0 for full packet trace.<br> Default value: 164<br> Minimum value =  0<br> Maximum value =  1514
	* </pre>
	*/
	public void set_size(Long size) throws Exception{
		this.size = size;
	}

	/**
	* <pre>
	* Size of the captured data. Set 0 for full packet trace.<br> Default value: 164<br> Minimum value =  0<br> Maximum value =  1514
	* </pre>
	*/
	public Long get_size() throws Exception {
		return this.size;
	}

	/**
	* <pre>
	* Capturing mode for trace. Mode can be any of the following values or combination of these values:
      RX      	Received packets before NIC pipelining
      NEW_RX  	Received packets after NIC pipelining
      TX      	Transmitted packets
      TXB     	Packets buffered for transmission
      IPV6    	Translated IPv6 packets
      C2C     	Capture C2C message
      NS_FR_TX	TX/TXB packets are not captured in flow receiver.
      Default mode: NEW_RX TXB .<br> Default value: DEFAULT_MODE<br> Possible values = TX, TXB, RX, IPV6, NEW_RX, C2C, NS_FR_TX
	* </pre>
	*/
	public void set_mode(String[] mode) throws Exception{
		this.mode = mode;
	}

	/**
	* <pre>
	* Capturing mode for trace. Mode can be any of the following values or combination of these values:
      RX      	Received packets before NIC pipelining
      NEW_RX  	Received packets after NIC pipelining
      TX      	Transmitted packets
      TXB     	Packets buffered for transmission
      IPV6    	Translated IPv6 packets
      C2C     	Capture C2C message
      NS_FR_TX	TX/TXB packets are not captured in flow receiver.
      Default mode: NEW_RX TXB .<br> Default value: DEFAULT_MODE<br> Possible values = TX, TXB, RX, IPV6, NEW_RX, C2C, NS_FR_TX
	* </pre>
	*/
	public String[] get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* Trace is captured in TCPDUMP(.pcap) format. Default capture format is NSTRACE(.cap).<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tcpdump(String tcpdump) throws Exception{
		this.tcpdump = tcpdump;
	}

	/**
	* <pre>
	* Trace is captured in TCPDUMP(.pcap) format. Default capture format is NSTRACE(.cap).<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tcpdump() throws Exception {
		return this.tcpdump;
	}

	/**
	* <pre>
	* Use separate trace files for each interface. Works only with tcpdump format.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_pernic(String pernic) throws Exception{
		this.pernic = pernic;
	}

	/**
	* <pre>
	* Use separate trace files for each interface. Works only with tcpdump format.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_pernic() throws Exception {
		return this.pernic;
	}

	/**
	* <pre>
	* Name of the trace file.
	* </pre>
	*/
	public void set_filename(String filename) throws Exception{
		this.filename = filename;
	}

	/**
	* <pre>
	* Name of the trace file.
	* </pre>
	*/
	public String get_filename() throws Exception {
		return this.filename;
	}

	/**
	* <pre>
	* ID for the trace file name for uniqueness. Should be used only with -name option.
	* </pre>
	*/
	public void set_fileid(String fileid) throws Exception{
		this.fileid = fileid;
	}

	/**
	* <pre>
	* ID for the trace file name for uniqueness. Should be used only with -name option.
	* </pre>
	*/
	public String get_fileid() throws Exception {
		return this.fileid;
	}

	/**
	* <pre>
	* Filter expression for nstrace. Maximum length of filter is 255 and it can be of following format:
     <expression> [<relop> <expression>]

     <relop> = ( && | || )
		
	 nstrace supports two types of filter expressions:

	 Classic Expressions:

     <expression> = the expression string in the format:
     <qualifier> <operator> <qualifier-value>

     <qualifier> = SOURCEIP.
     <qualifier-value> = A valid IP address
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
     <qualifier> = SVCNAME.
     <qualifier-value> = The name of a service.
     <qualifier> = VSVRNAME.
     <qualifier-value> = The name of a vserver.
     <qualifier> = CONNID
     <qualifier-value> = A valid PCB dev number.
     <qualifier> = VLAN
     <qualifier-value> = A valid VLAN ID.
     <qualifier> = INTF
     <qualifier-value> = A valid interface id in the form of x/y 
	 			(n/x/y in case of cluster interface).

     <operator> = ( == | eq | != | neq | > | gt
     | < | lt | >= | ge | <= | le | BETWEEN )
     eg: start nstrace -filter "SOURCEIP == 10.102.34.201 || (SVCNAME != s1 && SOURCEPORT > 80)"
     The filter expression should be given in double quotes.
	 
	 Default Expressions:

	 <expression> =:
	 CONNECTION.<qualifier>.<qualifier-method>.(<qualifier-value>)

	 <qualifier> = SRCIP
	 <qualifier-method> = [ EQ | NE ]
	 <qualifier-value>	= A valid IPv4 address.
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
	 <qualifier-value>	= A valid IPv6 address.
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
		
	 <qualifier> = VLANID 
	 <qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	 <qualifier-value>  = A valid vlan ID.
  	 example = CONNECTION.VLANID.EQ(0)	

	 <qualifier> = CONNID 
	 <qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	 <qualifier-value>  = A valid PCB dev number.
  	 example = CONNECTION.CONNID.EQ(0)	 

	 <qualifier> = PPEID
	 <qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	 <qualifier-value>  = A valid core ID.
  	 example = CONNECTION.PPEID.EQ(0)	

	 <qualifier> = SVCNAME
	 <qualifier-method> = [ EQ | NE | CONTAINS | STARTSWITH 
	 					| ENDSWITH ] 
	 <qualifier-value>  = A valid text string.
	 example = CONNECTION.SVCNAME.EQ("name")
	
	 <qualifier> = INTF
	 <qualifier-method> = [ EQ | NE ]
	 <qualifier-value>  =  A valid interface id in the
					form of x/y.
	 example = CONNECTION.INTF.EQ("x/y")

     eg: start nstrace -filter "CONNECTION.SRCIP.EQ(127.0.0.1) || (CONNECTION.SVCNAME.NE("s1") && CONNECTION.SRCPORT.EQ(80))"
     The filter expression should be given in double quotes. 
	 
common use cases:

Trace capturing full sized traffic from/to ip 10.102.44.111, excluding loopback traffic
start nstrace -size 0 -filter "CONNECTION.IP.NE(127.0.0.1) && CONNECTION.IP.EQ(10.102.44.111)"

Trace capturing all traffic to (terminating at) port 80 or 443 
start nstrace -size 0 -filter "CONNECTION.DSTPORT.EQ(443) || CONNECTION.DSTPORT.EQ(80)"

Trace capturing all backend traffic specific to service service1 along with corresponding client side traffic
start nstrace -size 0 -filter "CONNECTION.SVCNAME.EQ("service1")" -link ENABLED

Trace capturing all traffic through NS interface 1/1
start nstrace -filter "CONNECTION.INTF.EQ("1/1")"

Trace capturing all traffic specific through vlan 2
start nstrace -filter "CONNECTION.VLANID.EQ(2)"

Trace capturing all frontend (client side) traffic specific to lb vserver vserver1 along with corresponding server side traffic
start nstrace -size 0 -filter "CONNECTION.LB_VSERVER.NAME.EQ("vserver1")" -link ENABLED .
	* </pre>
	*/
	public void set_filter(String filter) throws Exception{
		this.filter = filter;
	}

	/**
	* <pre>
	* Filter expression for nstrace. Maximum length of filter is 255 and it can be of following format:
     <expression> [<relop> <expression>]

     <relop> = ( && | || )
		
	 nstrace supports two types of filter expressions:

	 Classic Expressions:

     <expression> = the expression string in the format:
     <qualifier> <operator> <qualifier-value>

     <qualifier> = SOURCEIP.
     <qualifier-value> = A valid IP address
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
     <qualifier> = SVCNAME.
     <qualifier-value> = The name of a service.
     <qualifier> = VSVRNAME.
     <qualifier-value> = The name of a vserver.
     <qualifier> = CONNID
     <qualifier-value> = A valid PCB dev number.
     <qualifier> = VLAN
     <qualifier-value> = A valid VLAN ID.
     <qualifier> = INTF
     <qualifier-value> = A valid interface id in the form of x/y 
	 			(n/x/y in case of cluster interface).

     <operator> = ( == | eq | != | neq | > | gt
     | < | lt | >= | ge | <= | le | BETWEEN )
     eg: start nstrace -filter "SOURCEIP == 10.102.34.201 || (SVCNAME != s1 && SOURCEPORT > 80)"
     The filter expression should be given in double quotes.
	 
	 Default Expressions:

	 <expression> =:
	 CONNECTION.<qualifier>.<qualifier-method>.(<qualifier-value>)

	 <qualifier> = SRCIP
	 <qualifier-method> = [ EQ | NE ]
	 <qualifier-value>	= A valid IPv4 address.
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
	 <qualifier-value>	= A valid IPv6 address.
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
		
	 <qualifier> = VLANID 
	 <qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	 <qualifier-value>  = A valid vlan ID.
  	 example = CONNECTION.VLANID.EQ(0)	

	 <qualifier> = CONNID 
	 <qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	 <qualifier-value>  = A valid PCB dev number.
  	 example = CONNECTION.CONNID.EQ(0)	 

	 <qualifier> = PPEID
	 <qualifier-method> = [ EQ | NE | GT | GE | LT | LE ]
	 <qualifier-value>  = A valid core ID.
  	 example = CONNECTION.PPEID.EQ(0)	

	 <qualifier> = SVCNAME
	 <qualifier-method> = [ EQ | NE | CONTAINS | STARTSWITH 
	 					| ENDSWITH ] 
	 <qualifier-value>  = A valid text string.
	 example = CONNECTION.SVCNAME.EQ("name")
	
	 <qualifier> = INTF
	 <qualifier-method> = [ EQ | NE ]
	 <qualifier-value>  =  A valid interface id in the
					form of x/y.
	 example = CONNECTION.INTF.EQ("x/y")

     eg: start nstrace -filter "CONNECTION.SRCIP.EQ(127.0.0.1) || (CONNECTION.SVCNAME.NE("s1") && CONNECTION.SRCPORT.EQ(80))"
     The filter expression should be given in double quotes. 
	 
common use cases:

Trace capturing full sized traffic from/to ip 10.102.44.111, excluding loopback traffic
start nstrace -size 0 -filter "CONNECTION.IP.NE(127.0.0.1) && CONNECTION.IP.EQ(10.102.44.111)"

Trace capturing all traffic to (terminating at) port 80 or 443 
start nstrace -size 0 -filter "CONNECTION.DSTPORT.EQ(443) || CONNECTION.DSTPORT.EQ(80)"

Trace capturing all backend traffic specific to service service1 along with corresponding client side traffic
start nstrace -size 0 -filter "CONNECTION.SVCNAME.EQ("service1")" -link ENABLED

Trace capturing all traffic through NS interface 1/1
start nstrace -filter "CONNECTION.INTF.EQ("1/1")"

Trace capturing all traffic specific through vlan 2
start nstrace -filter "CONNECTION.VLANID.EQ(2)"

Trace capturing all frontend (client side) traffic specific to lb vserver vserver1 along with corresponding server side traffic
start nstrace -size 0 -filter "CONNECTION.LB_VSERVER.NAME.EQ("vserver1")" -link ENABLED .
	* </pre>
	*/
	public String get_filter() throws Exception {
		return this.filter;
	}

	/**
	* <pre>
	* Includes filtered connection's peer traffic.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_link(String link) throws Exception{
		this.link = link;
	}

	/**
	* <pre>
	* Includes filtered connection's peer traffic.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_link() throws Exception {
		return this.link;
	}

	/**
	* <pre>
	* Nodes on which tracing is started.
<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public void set_nodes(Long[] nodes) throws Exception{
		this.nodes = nodes;
	}

	/**
	* <pre>
	* Nodes on which tracing is started.
<br> Minimum value =  0<br> Maximum value =  32
	* </pre>
	*/
	public Long[] get_nodes() throws Exception {
		return this.nodes;
	}

	/**
	* <pre>
	* Current running state of trace.<br> Possible values = RUNNING, STOPPED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Scope of started trace, local or cluster level.<br> Possible values = CLUSTER, LOCAL
	* </pre>
	*/
	public String get_scope() throws Exception {
		return this.scope;
	}

	/**
	* <pre>
	* Directory where current trace files are saved.
	* </pre>
	*/
	public String get_tracelocation() throws Exception {
		return this.tracelocation;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nstrace[] resources = new nstrace[1];
		nstrace_response result = (nstrace_response) service.get_payload_formatter().string_to_resource(nstrace_response.class, response);
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
		resources[0] = result.nstrace;
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
	* Use this API to fetch all the nstrace resources that are configured on netscaler.
	*/
	public static nstrace get(nitro_service service) throws Exception{
		nstrace obj = new nstrace();
		nstrace[] response = (nstrace[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nstrace resources that are configured on netscaler.
	*/
	public static nstrace get(nitro_service service,  options option) throws Exception{
		nstrace obj = new nstrace();
		nstrace[] response = (nstrace[])obj.get_resources(service,option);
		return response[0];
	}

	public static class modeEnum {
		public static final String TX = "TX";
		public static final String TXB = "TXB";
		public static final String RX = "RX";
		public static final String IPV6 = "IPV6";
		public static final String NEW_RX = "NEW_RX";
		public static final String C2C = "C2C";
		public static final String NS_FR_TX = "NS_FR_TX";
	}
	public static class stateEnum {
		public static final String RUNNING = "RUNNING";
		public static final String STOPPED = "STOPPED";
	}
	public static class scopeEnum {
		public static final String CLUSTER = "CLUSTER";
		public static final String LOCAL = "LOCAL";
	}
	public static class tcpdumpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class pernicEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class linkEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
