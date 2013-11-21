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

class nstcpprofile_response extends base_response
{
	public nstcpprofile[] nstcpprofile;
}
/**
* Configuration for TCP profile resource.
*/

public class nstcpprofile extends base_resource
{
	private String name;
	private String ws;
	private String sack;
	private Long wsval;
	private String nagle;
	private String ackonpush;
	private Long mss;
	private Long maxburst;
	private Long initialcwnd;
	private Long delayedack;
	private Long oooqsize;
	private Long maxpktpermss;
	private Long pktperretx;
	private Long minrto;
	private Long slowstartincr;
	private Long buffersize;
	private String syncookie;
	private String kaprobeupdatelastactivity;
	private String flavor;
	private String dynamicreceivebuffering;
	private String ka;
	private Long kaconnidletime;
	private Long kamaxprobes;
	private Long kaprobeinterval;
	private Long sendbuffsize;
	private String mptcp;
	private String establishclientconn;

	//------- Read only Parameter ---------;

	private Long refcnt;
	private Long __count;

	/**
	* <pre>
	* Name for a TCP profile. Must begin with a letter, number, or the underscore \(_\) character. Other characters allowed, after the first character, are the hyphen \(-\), period \(.\), hash \(\#\), space \( \), at \(@\), and equal \(=\) characters. The name of a TCP profile cannot be changed after it is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my tcp profile" or 'my tcp profile'\).<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for a TCP profile. Must begin with a letter, number, or the underscore \(_\) character. Other characters allowed, after the first character, are the hyphen \(-\), period \(.\), hash \(\#\), space \( \), at \(@\), and equal \(=\) characters. The name of a TCP profile cannot be changed after it is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my tcp profile" or 'my tcp profile'\).<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Enable or disable window scaling.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ws(String ws) throws Exception{
		this.ws = ws;
	}

	/**
	* <pre>
	* Enable or disable window scaling.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ws() throws Exception {
		return this.ws;
	}

	/**
	* <pre>
	* Enable or disable Selective ACKnowledgement (SACK).<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sack(String sack) throws Exception{
		this.sack = sack;
	}

	/**
	* <pre>
	* Enable or disable Selective ACKnowledgement (SACK).<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sack() throws Exception {
		return this.sack;
	}

	/**
	* <pre>
	* Factor used to calculate the new window size.
This argument is needed only when window scaling is enabled.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  14
	* </pre>
	*/
	public void set_wsval(long wsval) throws Exception {
		this.wsval = new Long(wsval);
	}

	/**
	* <pre>
	* Factor used to calculate the new window size.
This argument is needed only when window scaling is enabled.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  14
	* </pre>
	*/
	public void set_wsval(Long wsval) throws Exception{
		this.wsval = wsval;
	}

	/**
	* <pre>
	* Factor used to calculate the new window size.
This argument is needed only when window scaling is enabled.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  14
	* </pre>
	*/
	public Long get_wsval() throws Exception {
		return this.wsval;
	}

	/**
	* <pre>
	* Enable or disable the Nagle algorithm on TCP connections.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nagle(String nagle) throws Exception{
		this.nagle = nagle;
	}

	/**
	* <pre>
	* Enable or disable the Nagle algorithm on TCP connections.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nagle() throws Exception {
		return this.nagle;
	}

	/**
	* <pre>
	* Send immediate positive acknowledgement (ACK) on receipt of TCP packets when doing Web 2.0 PUSH.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ackonpush(String ackonpush) throws Exception{
		this.ackonpush = ackonpush;
	}

	/**
	* <pre>
	* Send immediate positive acknowledgement (ACK) on receipt of TCP packets when doing Web 2.0 PUSH.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ackonpush() throws Exception {
		return this.ackonpush;
	}

	/**
	* <pre>
	* Maximum number of octets to allow in a TCP data segment.<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public void set_mss(long mss) throws Exception {
		this.mss = new Long(mss);
	}

	/**
	* <pre>
	* Maximum number of octets to allow in a TCP data segment.<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public void set_mss(Long mss) throws Exception{
		this.mss = mss;
	}

	/**
	* <pre>
	* Maximum number of octets to allow in a TCP data segment.<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public Long get_mss() throws Exception {
		return this.mss;
	}

	/**
	* <pre>
	* Maximum number of TCP segments allowed in a burst.<br> Default value: 6<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxburst(long maxburst) throws Exception {
		this.maxburst = new Long(maxburst);
	}

	/**
	* <pre>
	* Maximum number of TCP segments allowed in a burst.<br> Default value: 6<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxburst(Long maxburst) throws Exception{
		this.maxburst = maxburst;
	}

	/**
	* <pre>
	* Maximum number of TCP segments allowed in a burst.<br> Default value: 6<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_maxburst() throws Exception {
		return this.maxburst;
	}

	/**
	* <pre>
	* Initial maximum upper limit on the number of TCP packets that can be outstanding on the TCP link to the server.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  44
	* </pre>
	*/
	public void set_initialcwnd(long initialcwnd) throws Exception {
		this.initialcwnd = new Long(initialcwnd);
	}

	/**
	* <pre>
	* Initial maximum upper limit on the number of TCP packets that can be outstanding on the TCP link to the server.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  44
	* </pre>
	*/
	public void set_initialcwnd(Long initialcwnd) throws Exception{
		this.initialcwnd = initialcwnd;
	}

	/**
	* <pre>
	* Initial maximum upper limit on the number of TCP packets that can be outstanding on the TCP link to the server.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  44
	* </pre>
	*/
	public Long get_initialcwnd() throws Exception {
		return this.initialcwnd;
	}

	/**
	* <pre>
	* Timeout for TCP delayed ACK, in milliseconds.<br> Default value: 100<br> Minimum value =  10<br> Maximum value =  300
	* </pre>
	*/
	public void set_delayedack(long delayedack) throws Exception {
		this.delayedack = new Long(delayedack);
	}

	/**
	* <pre>
	* Timeout for TCP delayed ACK, in milliseconds.<br> Default value: 100<br> Minimum value =  10<br> Maximum value =  300
	* </pre>
	*/
	public void set_delayedack(Long delayedack) throws Exception{
		this.delayedack = delayedack;
	}

	/**
	* <pre>
	* Timeout for TCP delayed ACK, in milliseconds.<br> Default value: 100<br> Minimum value =  10<br> Maximum value =  300
	* </pre>
	*/
	public Long get_delayedack() throws Exception {
		return this.delayedack;
	}

	/**
	* <pre>
	* Maximum size of out-of-order packets queue. A value of 0 means infinite.<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_oooqsize(long oooqsize) throws Exception {
		this.oooqsize = new Long(oooqsize);
	}

	/**
	* <pre>
	* Maximum size of out-of-order packets queue. A value of 0 means infinite.<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_oooqsize(Long oooqsize) throws Exception{
		this.oooqsize = oooqsize;
	}

	/**
	* <pre>
	* Maximum size of out-of-order packets queue. A value of 0 means infinite.<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_oooqsize() throws Exception {
		return this.oooqsize;
	}

	/**
	* <pre>
	* Maximum number of TCP packets allowed per maximum segment size (MSS).<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public void set_maxpktpermss(long maxpktpermss) throws Exception {
		this.maxpktpermss = new Long(maxpktpermss);
	}

	/**
	* <pre>
	* Maximum number of TCP packets allowed per maximum segment size (MSS).<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public void set_maxpktpermss(Long maxpktpermss) throws Exception{
		this.maxpktpermss = maxpktpermss;
	}

	/**
	* <pre>
	* Maximum number of TCP packets allowed per maximum segment size (MSS).<br> Minimum value =  0<br> Maximum value =  512
	* </pre>
	*/
	public Long get_maxpktpermss() throws Exception {
		return this.maxpktpermss;
	}

	/**
	* <pre>
	* Maximum limit on the number of packets that should be retransmitted on receiving a partial ACK.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  512
	* </pre>
	*/
	public void set_pktperretx(long pktperretx) throws Exception {
		this.pktperretx = new Long(pktperretx);
	}

	/**
	* <pre>
	* Maximum limit on the number of packets that should be retransmitted on receiving a partial ACK.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  512
	* </pre>
	*/
	public void set_pktperretx(Long pktperretx) throws Exception{
		this.pktperretx = pktperretx;
	}

	/**
	* <pre>
	* Maximum limit on the number of packets that should be retransmitted on receiving a partial ACK.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  512
	* </pre>
	*/
	public Long get_pktperretx() throws Exception {
		return this.pktperretx;
	}

	/**
	* <pre>
	* Minimum retransmission timeout, in milliseconds.<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public void set_minrto(long minrto) throws Exception {
		this.minrto = new Long(minrto);
	}

	/**
	* <pre>
	* Minimum retransmission timeout, in milliseconds.<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public void set_minrto(Long minrto) throws Exception{
		this.minrto = minrto;
	}

	/**
	* <pre>
	* Minimum retransmission timeout, in milliseconds.<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public Long get_minrto() throws Exception {
		return this.minrto;
	}

	/**
	* <pre>
	* Multiplier that determines the rate at which slow start increases the size of the TCP transmission window after each acknowledgement of successful transmission.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_slowstartincr(long slowstartincr) throws Exception {
		this.slowstartincr = new Long(slowstartincr);
	}

	/**
	* <pre>
	* Multiplier that determines the rate at which slow start increases the size of the TCP transmission window after each acknowledgement of successful transmission.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_slowstartincr(Long slowstartincr) throws Exception{
		this.slowstartincr = slowstartincr;
	}

	/**
	* <pre>
	* Multiplier that determines the rate at which slow start increases the size of the TCP transmission window after each acknowledgement of successful transmission.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_slowstartincr() throws Exception {
		return this.slowstartincr;
	}

	/**
	* <pre>
	* TCP buffering size, in bytes.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  4194304
	* </pre>
	*/
	public void set_buffersize(long buffersize) throws Exception {
		this.buffersize = new Long(buffersize);
	}

	/**
	* <pre>
	* TCP buffering size, in bytes.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  4194304
	* </pre>
	*/
	public void set_buffersize(Long buffersize) throws Exception{
		this.buffersize = buffersize;
	}

	/**
	* <pre>
	* TCP buffering size, in bytes.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  4194304
	* </pre>
	*/
	public Long get_buffersize() throws Exception {
		return this.buffersize;
	}

	/**
	* <pre>
	* Enable or disable the SYNCOOKIE mechanism for TCP handshake with clients. Disabling SYNCOOKIE prevents SYN attack protection on the NetScaler appliance.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_syncookie(String syncookie) throws Exception{
		this.syncookie = syncookie;
	}

	/**
	* <pre>
	* Enable or disable the SYNCOOKIE mechanism for TCP handshake with clients. Disabling SYNCOOKIE prevents SYN attack protection on the NetScaler appliance.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_syncookie() throws Exception {
		return this.syncookie;
	}

	/**
	* <pre>
	* Update last activity for the connection after receiving keep-alive (KA) probes.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_kaprobeupdatelastactivity(String kaprobeupdatelastactivity) throws Exception{
		this.kaprobeupdatelastactivity = kaprobeupdatelastactivity;
	}

	/**
	* <pre>
	* Update last activity for the connection after receiving keep-alive (KA) probes.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_kaprobeupdatelastactivity() throws Exception {
		return this.kaprobeupdatelastactivity;
	}

	/**
	* <pre>
	* Set TCP congestion control algorithm.<br> Default value: Default<br> Possible values = Default, Westwood
	* </pre>
	*/
	public void set_flavor(String flavor) throws Exception{
		this.flavor = flavor;
	}

	/**
	* <pre>
	* Set TCP congestion control algorithm.<br> Default value: Default<br> Possible values = Default, Westwood
	* </pre>
	*/
	public String get_flavor() throws Exception {
		return this.flavor;
	}

	/**
	* <pre>
	* Enable or disable dynamic receive buffering. When enabled, allows the receive buffer to be adjusted dynamically based on memory and network conditions.
Note: The buffer size argument must be set for dynamic adjustments to take place.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dynamicreceivebuffering(String dynamicreceivebuffering) throws Exception{
		this.dynamicreceivebuffering = dynamicreceivebuffering;
	}

	/**
	* <pre>
	* Enable or disable dynamic receive buffering. When enabled, allows the receive buffer to be adjusted dynamically based on memory and network conditions.
Note: The buffer size argument must be set for dynamic adjustments to take place.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dynamicreceivebuffering() throws Exception {
		return this.dynamicreceivebuffering;
	}

	/**
	* <pre>
	* Send periodic TCP keep-alive (KA) probes to check if peer is still up.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ka(String ka) throws Exception{
		this.ka = ka;
	}

	/**
	* <pre>
	* Send periodic TCP keep-alive (KA) probes to check if peer is still up.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ka() throws Exception {
		return this.ka;
	}

	/**
	* <pre>
	* Duration, in seconds, for the connection to be idle, before sending a keep-alive (KA) probe.<br> Minimum value =  1<br> Maximum value =  4095
	* </pre>
	*/
	public void set_kaconnidletime(long kaconnidletime) throws Exception {
		this.kaconnidletime = new Long(kaconnidletime);
	}

	/**
	* <pre>
	* Duration, in seconds, for the connection to be idle, before sending a keep-alive (KA) probe.<br> Minimum value =  1<br> Maximum value =  4095
	* </pre>
	*/
	public void set_kaconnidletime(Long kaconnidletime) throws Exception{
		this.kaconnidletime = kaconnidletime;
	}

	/**
	* <pre>
	* Duration, in seconds, for the connection to be idle, before sending a keep-alive (KA) probe.<br> Minimum value =  1<br> Maximum value =  4095
	* </pre>
	*/
	public Long get_kaconnidletime() throws Exception {
		return this.kaconnidletime;
	}

	/**
	* <pre>
	* Number of keep-alive (KA) probes to be sent when not acknowledged, before assuming the peer to be down.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_kamaxprobes(long kamaxprobes) throws Exception {
		this.kamaxprobes = new Long(kamaxprobes);
	}

	/**
	* <pre>
	* Number of keep-alive (KA) probes to be sent when not acknowledged, before assuming the peer to be down.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_kamaxprobes(Long kamaxprobes) throws Exception{
		this.kamaxprobes = kamaxprobes;
	}

	/**
	* <pre>
	* Number of keep-alive (KA) probes to be sent when not acknowledged, before assuming the peer to be down.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_kamaxprobes() throws Exception {
		return this.kamaxprobes;
	}

	/**
	* <pre>
	* Time interval, in seconds, before the next keep-alive (KA) probe, if the peer does not respond.<br> Minimum value =  1<br> Maximum value =  4095
	* </pre>
	*/
	public void set_kaprobeinterval(long kaprobeinterval) throws Exception {
		this.kaprobeinterval = new Long(kaprobeinterval);
	}

	/**
	* <pre>
	* Time interval, in seconds, before the next keep-alive (KA) probe, if the peer does not respond.<br> Minimum value =  1<br> Maximum value =  4095
	* </pre>
	*/
	public void set_kaprobeinterval(Long kaprobeinterval) throws Exception{
		this.kaprobeinterval = kaprobeinterval;
	}

	/**
	* <pre>
	* Time interval, in seconds, before the next keep-alive (KA) probe, if the peer does not respond.<br> Minimum value =  1<br> Maximum value =  4095
	* </pre>
	*/
	public Long get_kaprobeinterval() throws Exception {
		return this.kaprobeinterval;
	}

	/**
	* <pre>
	* TCP Send Buffer Size.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  4194304
	* </pre>
	*/
	public void set_sendbuffsize(long sendbuffsize) throws Exception {
		this.sendbuffsize = new Long(sendbuffsize);
	}

	/**
	* <pre>
	* TCP Send Buffer Size.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  4194304
	* </pre>
	*/
	public void set_sendbuffsize(Long sendbuffsize) throws Exception{
		this.sendbuffsize = sendbuffsize;
	}

	/**
	* <pre>
	* TCP Send Buffer Size.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  4194304
	* </pre>
	*/
	public Long get_sendbuffsize() throws Exception {
		return this.sendbuffsize;
	}

	/**
	* <pre>
	* Enable/Disable Multi-Path TCP.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mptcp(String mptcp) throws Exception{
		this.mptcp = mptcp;
	}

	/**
	* <pre>
	* Enable/Disable Multi-Path TCP.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mptcp() throws Exception {
		return this.mptcp;
	}

	/**
	* <pre>
	* Establishing Client Client connection on First data/ Final-ACK / Automatic.<br> Default value: AUTOMATIC<br> Possible values = AUTOMATIC, CONN_ESTABLISHED, ON_FIRST_DATA
	* </pre>
	*/
	public void set_establishclientconn(String establishclientconn) throws Exception{
		this.establishclientconn = establishclientconn;
	}

	/**
	* <pre>
	* Establishing Client Client connection on First data/ Final-ACK / Automatic.<br> Default value: AUTOMATIC<br> Possible values = AUTOMATIC, CONN_ESTABLISHED, ON_FIRST_DATA
	* </pre>
	*/
	public String get_establishclientconn() throws Exception {
		return this.establishclientconn;
	}

	/**
	* <pre>
	* Number of entities using this profile.
	* </pre>
	*/
	public Long get_refcnt() throws Exception {
		return this.refcnt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nstcpprofile_response result = (nstcpprofile_response) service.get_payload_formatter().string_to_resource(nstcpprofile_response.class, response);
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
		return result.nstcpprofile;
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
	* Use this API to add nstcpprofile.
	*/
	public static base_response add(nitro_service client, nstcpprofile resource) throws Exception {
		nstcpprofile addresource = new nstcpprofile();
		addresource.name = resource.name;
		addresource.ws = resource.ws;
		addresource.sack = resource.sack;
		addresource.wsval = resource.wsval;
		addresource.nagle = resource.nagle;
		addresource.ackonpush = resource.ackonpush;
		addresource.mss = resource.mss;
		addresource.maxburst = resource.maxburst;
		addresource.initialcwnd = resource.initialcwnd;
		addresource.delayedack = resource.delayedack;
		addresource.oooqsize = resource.oooqsize;
		addresource.maxpktpermss = resource.maxpktpermss;
		addresource.pktperretx = resource.pktperretx;
		addresource.minrto = resource.minrto;
		addresource.slowstartincr = resource.slowstartincr;
		addresource.buffersize = resource.buffersize;
		addresource.syncookie = resource.syncookie;
		addresource.kaprobeupdatelastactivity = resource.kaprobeupdatelastactivity;
		addresource.flavor = resource.flavor;
		addresource.dynamicreceivebuffering = resource.dynamicreceivebuffering;
		addresource.ka = resource.ka;
		addresource.kaconnidletime = resource.kaconnidletime;
		addresource.kamaxprobes = resource.kamaxprobes;
		addresource.kaprobeinterval = resource.kaprobeinterval;
		addresource.sendbuffsize = resource.sendbuffsize;
		addresource.mptcp = resource.mptcp;
		addresource.establishclientconn = resource.establishclientconn;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nstcpprofile resources.
	*/
	public static base_responses add(nitro_service client, nstcpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstcpprofile addresources[] = new nstcpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nstcpprofile();
				addresources[i].name = resources[i].name;
				addresources[i].ws = resources[i].ws;
				addresources[i].sack = resources[i].sack;
				addresources[i].wsval = resources[i].wsval;
				addresources[i].nagle = resources[i].nagle;
				addresources[i].ackonpush = resources[i].ackonpush;
				addresources[i].mss = resources[i].mss;
				addresources[i].maxburst = resources[i].maxburst;
				addresources[i].initialcwnd = resources[i].initialcwnd;
				addresources[i].delayedack = resources[i].delayedack;
				addresources[i].oooqsize = resources[i].oooqsize;
				addresources[i].maxpktpermss = resources[i].maxpktpermss;
				addresources[i].pktperretx = resources[i].pktperretx;
				addresources[i].minrto = resources[i].minrto;
				addresources[i].slowstartincr = resources[i].slowstartincr;
				addresources[i].buffersize = resources[i].buffersize;
				addresources[i].syncookie = resources[i].syncookie;
				addresources[i].kaprobeupdatelastactivity = resources[i].kaprobeupdatelastactivity;
				addresources[i].flavor = resources[i].flavor;
				addresources[i].dynamicreceivebuffering = resources[i].dynamicreceivebuffering;
				addresources[i].ka = resources[i].ka;
				addresources[i].kaconnidletime = resources[i].kaconnidletime;
				addresources[i].kamaxprobes = resources[i].kamaxprobes;
				addresources[i].kaprobeinterval = resources[i].kaprobeinterval;
				addresources[i].sendbuffsize = resources[i].sendbuffsize;
				addresources[i].mptcp = resources[i].mptcp;
				addresources[i].establishclientconn = resources[i].establishclientconn;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nstcpprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		nstcpprofile deleteresource = new nstcpprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nstcpprofile.
	*/
	public static base_response delete(nitro_service client, nstcpprofile resource) throws Exception {
		nstcpprofile deleteresource = new nstcpprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nstcpprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nstcpprofile deleteresources[] = new nstcpprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new nstcpprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nstcpprofile resources.
	*/
	public static base_responses delete(nitro_service client, nstcpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstcpprofile deleteresources[] = new nstcpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nstcpprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nstcpprofile.
	*/
	public static base_response update(nitro_service client, nstcpprofile resource) throws Exception {
		nstcpprofile updateresource = new nstcpprofile();
		updateresource.name = resource.name;
		updateresource.ws = resource.ws;
		updateresource.sack = resource.sack;
		updateresource.wsval = resource.wsval;
		updateresource.nagle = resource.nagle;
		updateresource.ackonpush = resource.ackonpush;
		updateresource.mss = resource.mss;
		updateresource.maxburst = resource.maxburst;
		updateresource.initialcwnd = resource.initialcwnd;
		updateresource.delayedack = resource.delayedack;
		updateresource.oooqsize = resource.oooqsize;
		updateresource.maxpktpermss = resource.maxpktpermss;
		updateresource.pktperretx = resource.pktperretx;
		updateresource.minrto = resource.minrto;
		updateresource.slowstartincr = resource.slowstartincr;
		updateresource.buffersize = resource.buffersize;
		updateresource.syncookie = resource.syncookie;
		updateresource.kaprobeupdatelastactivity = resource.kaprobeupdatelastactivity;
		updateresource.flavor = resource.flavor;
		updateresource.dynamicreceivebuffering = resource.dynamicreceivebuffering;
		updateresource.ka = resource.ka;
		updateresource.kaconnidletime = resource.kaconnidletime;
		updateresource.kamaxprobes = resource.kamaxprobes;
		updateresource.kaprobeinterval = resource.kaprobeinterval;
		updateresource.sendbuffsize = resource.sendbuffsize;
		updateresource.mptcp = resource.mptcp;
		updateresource.establishclientconn = resource.establishclientconn;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nstcpprofile resources.
	*/
	public static base_responses update(nitro_service client, nstcpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstcpprofile updateresources[] = new nstcpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nstcpprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].ws = resources[i].ws;
				updateresources[i].sack = resources[i].sack;
				updateresources[i].wsval = resources[i].wsval;
				updateresources[i].nagle = resources[i].nagle;
				updateresources[i].ackonpush = resources[i].ackonpush;
				updateresources[i].mss = resources[i].mss;
				updateresources[i].maxburst = resources[i].maxburst;
				updateresources[i].initialcwnd = resources[i].initialcwnd;
				updateresources[i].delayedack = resources[i].delayedack;
				updateresources[i].oooqsize = resources[i].oooqsize;
				updateresources[i].maxpktpermss = resources[i].maxpktpermss;
				updateresources[i].pktperretx = resources[i].pktperretx;
				updateresources[i].minrto = resources[i].minrto;
				updateresources[i].slowstartincr = resources[i].slowstartincr;
				updateresources[i].buffersize = resources[i].buffersize;
				updateresources[i].syncookie = resources[i].syncookie;
				updateresources[i].kaprobeupdatelastactivity = resources[i].kaprobeupdatelastactivity;
				updateresources[i].flavor = resources[i].flavor;
				updateresources[i].dynamicreceivebuffering = resources[i].dynamicreceivebuffering;
				updateresources[i].ka = resources[i].ka;
				updateresources[i].kaconnidletime = resources[i].kaconnidletime;
				updateresources[i].kamaxprobes = resources[i].kamaxprobes;
				updateresources[i].kaprobeinterval = resources[i].kaprobeinterval;
				updateresources[i].sendbuffsize = resources[i].sendbuffsize;
				updateresources[i].mptcp = resources[i].mptcp;
				updateresources[i].establishclientconn = resources[i].establishclientconn;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nstcpprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nstcpprofile resource, String[] args) throws Exception{
		nstcpprofile unsetresource = new nstcpprofile();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nstcpprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nstcpprofile unsetresources[] = new nstcpprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new nstcpprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nstcpprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nstcpprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstcpprofile unsetresources[] = new nstcpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nstcpprofile();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nstcpprofile resources that are configured on netscaler.
	*/
	public static nstcpprofile[] get(nitro_service service) throws Exception{
		nstcpprofile obj = new nstcpprofile();
		nstcpprofile[] response = (nstcpprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nstcpprofile resources that are configured on netscaler.
	*/
	public static nstcpprofile[] get(nitro_service service, options option) throws Exception{
		nstcpprofile obj = new nstcpprofile();
		nstcpprofile[] response = (nstcpprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nstcpprofile resource of given name .
	*/
	public static nstcpprofile get(nitro_service service, String name) throws Exception{
		nstcpprofile obj = new nstcpprofile();
		obj.set_name(name);
		nstcpprofile response = (nstcpprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nstcpprofile resources of given names .
	*/
	public static nstcpprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nstcpprofile response[] = new nstcpprofile[name.length];
			nstcpprofile obj[] = new nstcpprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nstcpprofile();
				obj[i].set_name(name[i]);
				response[i] = (nstcpprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nstcpprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nstcpprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		nstcpprofile obj = new nstcpprofile();
		options option = new options();
		option.set_filter(filter);
		nstcpprofile[] response = (nstcpprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstcpprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nstcpprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nstcpprofile obj = new nstcpprofile();
		options option = new options();
		option.set_filter(filter);
		nstcpprofile[] response = (nstcpprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nstcpprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nstcpprofile obj = new nstcpprofile();
		options option = new options();
		option.set_count(true);
		nstcpprofile[] response = (nstcpprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nstcpprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nstcpprofile obj = new nstcpprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstcpprofile[] response = (nstcpprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstcpprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nstcpprofile obj = new nstcpprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstcpprofile[] response = (nstcpprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class kaprobeupdatelastactivityEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sackEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class wsEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class syncookieEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ackonpushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mptcpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class kaEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class establishclientconnEnum {
		public static final String AUTOMATIC = "AUTOMATIC";
		public static final String CONN_ESTABLISHED = "CONN_ESTABLISHED";
		public static final String ON_FIRST_DATA = "ON_FIRST_DATA";
	}
	public static class flavorEnum {
		public static final String Default = "Default";
		public static final String Westwood = "Westwood";
	}
	public static class dynamicreceivebufferingEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class nagleEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
