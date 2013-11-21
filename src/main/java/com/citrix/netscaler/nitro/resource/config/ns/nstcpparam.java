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

class nstcpparam_response extends base_response
{
	public nstcpparam nstcpparam;
}
/**
* Configuration for tcp parameters resource.
*/

public class nstcpparam extends base_resource
{
	private String ws;
	private Long wsval;
	private String sack;
	private String learnvsvrmss;
	private Long maxburst;
	private Long initialcwnd;
	private Long recvbuffsize;
	private Long delayedack;
	private String downstaterst;
	private String nagle;
	private String limitedpersist;
	private Long oooqsize;
	private String ackonpush;
	private Integer maxpktpermss;
	private Integer pktperretx;
	private Integer minrto;
	private Integer slowstartincr;
	private Long maxdynserverprobes;
	private Long synholdfastgiveup;
	private Long maxsynholdperprobe;
	private Long maxsynhold;
	private Long msslearninterval;
	private Long msslearndelay;
	private Long maxtimewaitconn;
	private String kaprobeupdatelastactivity;
	private Long maxsynackretx;
	private String synattackdetection;
	private String connflushifnomem;
	private Long connflushthres;
	private String mptcpconcloseonpassivesf;
	private String mptcpchecksum;
	private Long mptcpsftimeout;
	private Long mptcpsfreplacetimeout;
	private Long mptcpmaxsf;
	private Long mptcpmaxpendingsf;
	private Long mptcppendingjointhreshold;
	private Long mptcprtostoswitchsf;
	private String mptcpusebackupondss;
	private Long tcpmaxretries;
	private String mptcpimmediatesfcloseonfin;

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
	* Factor used to calculate the new window size.
This argument is needed only when the window scaling is enabled.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  8
	* </pre>
	*/
	public void set_wsval(long wsval) throws Exception {
		this.wsval = new Long(wsval);
	}

	/**
	* <pre>
	* Factor used to calculate the new window size.
This argument is needed only when the window scaling is enabled.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  8
	* </pre>
	*/
	public void set_wsval(Long wsval) throws Exception{
		this.wsval = wsval;
	}

	/**
	* <pre>
	* Factor used to calculate the new window size.
This argument is needed only when the window scaling is enabled.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  8
	* </pre>
	*/
	public Long get_wsval() throws Exception {
		return this.wsval;
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
	* Enable or disable maximum segment size (MSS) learning for virtual servers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_learnvsvrmss(String learnvsvrmss) throws Exception{
		this.learnvsvrmss = learnvsvrmss;
	}

	/**
	* <pre>
	* Enable or disable maximum segment size (MSS) learning for virtual servers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_learnvsvrmss() throws Exception {
		return this.learnvsvrmss;
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
	* TCP Receive buffer size.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  20971520
	* </pre>
	*/
	public void set_recvbuffsize(long recvbuffsize) throws Exception {
		this.recvbuffsize = new Long(recvbuffsize);
	}

	/**
	* <pre>
	* TCP Receive buffer size.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  20971520
	* </pre>
	*/
	public void set_recvbuffsize(Long recvbuffsize) throws Exception{
		this.recvbuffsize = recvbuffsize;
	}

	/**
	* <pre>
	* TCP Receive buffer size.<br> Default value: 8190<br> Minimum value =  8190<br> Maximum value =  20971520
	* </pre>
	*/
	public Long get_recvbuffsize() throws Exception {
		return this.recvbuffsize;
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
	* Flag to switch on RST on down services.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstaterst(String downstaterst) throws Exception{
		this.downstaterst = downstaterst;
	}

	/**
	* <pre>
	* Flag to switch on RST on down services.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstaterst() throws Exception {
		return this.downstaterst;
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
	* Limit the number of persist (zero window) probes.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_limitedpersist(String limitedpersist) throws Exception{
		this.limitedpersist = limitedpersist;
	}

	/**
	* <pre>
	* Limit the number of persist (zero window) probes.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_limitedpersist() throws Exception {
		return this.limitedpersist;
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
	* Maximum number of TCP packets allowed per maximum segment size (MSS).<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public void set_maxpktpermss(int maxpktpermss) throws Exception {
		this.maxpktpermss = new Integer(maxpktpermss);
	}

	/**
	* <pre>
	* Maximum number of TCP packets allowed per maximum segment size (MSS).<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public void set_maxpktpermss(Integer maxpktpermss) throws Exception{
		this.maxpktpermss = maxpktpermss;
	}

	/**
	* <pre>
	* Maximum number of TCP packets allowed per maximum segment size (MSS).<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public Integer get_maxpktpermss() throws Exception {
		return this.maxpktpermss;
	}

	/**
	* <pre>
	* Maximum limit on the number of packets that should be retransmitted on receiving a partial ACK.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_pktperretx(int pktperretx) throws Exception {
		this.pktperretx = new Integer(pktperretx);
	}

	/**
	* <pre>
	* Maximum limit on the number of packets that should be retransmitted on receiving a partial ACK.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_pktperretx(Integer pktperretx) throws Exception{
		this.pktperretx = pktperretx;
	}

	/**
	* <pre>
	* Maximum limit on the number of packets that should be retransmitted on receiving a partial ACK.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Integer get_pktperretx() throws Exception {
		return this.pktperretx;
	}

	/**
	* <pre>
	* Minimum retransmission timeout, in milliseconds.<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public void set_minrto(int minrto) throws Exception {
		this.minrto = new Integer(minrto);
	}

	/**
	* <pre>
	* Minimum retransmission timeout, in milliseconds.<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public void set_minrto(Integer minrto) throws Exception{
		this.minrto = minrto;
	}

	/**
	* <pre>
	* Minimum retransmission timeout, in milliseconds.<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public Integer get_minrto() throws Exception {
		return this.minrto;
	}

	/**
	* <pre>
	* Multiplier that determines the rate at which slow start increases the size of the TCP transmission window after each acknowledgement of successful transmission.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_slowstartincr(int slowstartincr) throws Exception {
		this.slowstartincr = new Integer(slowstartincr);
	}

	/**
	* <pre>
	* Multiplier that determines the rate at which slow start increases the size of the TCP transmission window after each acknowledgement of successful transmission.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_slowstartincr(Integer slowstartincr) throws Exception{
		this.slowstartincr = slowstartincr;
	}

	/**
	* <pre>
	* Multiplier that determines the rate at which slow start increases the size of the TCP transmission window after each acknowledgement of successful transmission.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Integer get_slowstartincr() throws Exception {
		return this.slowstartincr;
	}

	/**
	* <pre>
	* Maximum number of probes that NetScaler can send out in 10 milliseconds, to dynamically learn a service. NetScaler probes for the existence of the origin in case of wildcard virtual server or services.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxdynserverprobes(long maxdynserverprobes) throws Exception {
		this.maxdynserverprobes = new Long(maxdynserverprobes);
	}

	/**
	* <pre>
	* Maximum number of probes that NetScaler can send out in 10 milliseconds, to dynamically learn a service. NetScaler probes for the existence of the origin in case of wildcard virtual server or services.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxdynserverprobes(Long maxdynserverprobes) throws Exception{
		this.maxdynserverprobes = maxdynserverprobes;
	}

	/**
	* <pre>
	* Maximum number of probes that NetScaler can send out in 10 milliseconds, to dynamically learn a service. NetScaler probes for the existence of the origin in case of wildcard virtual server or services.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxdynserverprobes() throws Exception {
		return this.maxdynserverprobes;
	}

	/**
	* <pre>
	* Maximum threshold. After crossing this threshold number of outstanding probes for origin, the NetScaler reduces the number of connection retries for probe connections.<br> Default value: 1024<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public void set_synholdfastgiveup(long synholdfastgiveup) throws Exception {
		this.synholdfastgiveup = new Long(synholdfastgiveup);
	}

	/**
	* <pre>
	* Maximum threshold. After crossing this threshold number of outstanding probes for origin, the NetScaler reduces the number of connection retries for probe connections.<br> Default value: 1024<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public void set_synholdfastgiveup(Long synholdfastgiveup) throws Exception{
		this.synholdfastgiveup = synholdfastgiveup;
	}

	/**
	* <pre>
	* Maximum threshold. After crossing this threshold number of outstanding probes for origin, the NetScaler reduces the number of connection retries for probe connections.<br> Default value: 1024<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_synholdfastgiveup() throws Exception {
		return this.synholdfastgiveup;
	}

	/**
	* <pre>
	* Limit the number of client connections (SYN) waiting for status of single probe. Any new SYN packets will be dropped.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxsynholdperprobe(long maxsynholdperprobe) throws Exception {
		this.maxsynholdperprobe = new Long(maxsynholdperprobe);
	}

	/**
	* <pre>
	* Limit the number of client connections (SYN) waiting for status of single probe. Any new SYN packets will be dropped.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxsynholdperprobe(Long maxsynholdperprobe) throws Exception{
		this.maxsynholdperprobe = maxsynholdperprobe;
	}

	/**
	* <pre>
	* Limit the number of client connections (SYN) waiting for status of single probe. Any new SYN packets will be dropped.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_maxsynholdperprobe() throws Exception {
		return this.maxsynholdperprobe;
	}

	/**
	* <pre>
	* Limit the number of client connections (SYN) waiting for status of probe system wide. Any new SYN packets will be dropped.<br> Default value: 16384<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxsynhold(long maxsynhold) throws Exception {
		this.maxsynhold = new Long(maxsynhold);
	}

	/**
	* <pre>
	* Limit the number of client connections (SYN) waiting for status of probe system wide. Any new SYN packets will be dropped.<br> Default value: 16384<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxsynhold(Long maxsynhold) throws Exception{
		this.maxsynhold = maxsynhold;
	}

	/**
	* <pre>
	* Limit the number of client connections (SYN) waiting for status of probe system wide. Any new SYN packets will be dropped.<br> Default value: 16384<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxsynhold() throws Exception {
		return this.maxsynhold;
	}

	/**
	* <pre>
	* Duration, in seconds, to sample the Maximum Segment Size (MSS) of the services. The NetScaler appliance determines the best MSS to set for the virtual server based on this sampling. The argument to enable maximum segment size (MSS) for virtual servers must be enabled.<br> Default value: 180<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_msslearninterval(long msslearninterval) throws Exception {
		this.msslearninterval = new Long(msslearninterval);
	}

	/**
	* <pre>
	* Duration, in seconds, to sample the Maximum Segment Size (MSS) of the services. The NetScaler appliance determines the best MSS to set for the virtual server based on this sampling. The argument to enable maximum segment size (MSS) for virtual servers must be enabled.<br> Default value: 180<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_msslearninterval(Long msslearninterval) throws Exception{
		this.msslearninterval = msslearninterval;
	}

	/**
	* <pre>
	* Duration, in seconds, to sample the Maximum Segment Size (MSS) of the services. The NetScaler appliance determines the best MSS to set for the virtual server based on this sampling. The argument to enable maximum segment size (MSS) for virtual servers must be enabled.<br> Default value: 180<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public Long get_msslearninterval() throws Exception {
		return this.msslearninterval;
	}

	/**
	* <pre>
	* Frequency, in seconds, at which the virtual servers learn the Maximum segment size (MSS) from the services. The argument to enable maximum segment size (MSS) for virtual servers must be enabled.<br> Default value: 3600<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_msslearndelay(long msslearndelay) throws Exception {
		this.msslearndelay = new Long(msslearndelay);
	}

	/**
	* <pre>
	* Frequency, in seconds, at which the virtual servers learn the Maximum segment size (MSS) from the services. The argument to enable maximum segment size (MSS) for virtual servers must be enabled.<br> Default value: 3600<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_msslearndelay(Long msslearndelay) throws Exception{
		this.msslearndelay = msslearndelay;
	}

	/**
	* <pre>
	* Frequency, in seconds, at which the virtual servers learn the Maximum segment size (MSS) from the services. The argument to enable maximum segment size (MSS) for virtual servers must be enabled.<br> Default value: 3600<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public Long get_msslearndelay() throws Exception {
		return this.msslearndelay;
	}

	/**
	* <pre>
	* Maximum number of connections to hold in the TCP TIME_WAIT state. New connections entering TIME_WAIT state are proactively cleaned up.<br> Default value: 7000<br> Minimum value =  1
	* </pre>
	*/
	public void set_maxtimewaitconn(long maxtimewaitconn) throws Exception {
		this.maxtimewaitconn = new Long(maxtimewaitconn);
	}

	/**
	* <pre>
	* Maximum number of connections to hold in the TCP TIME_WAIT state. New connections entering TIME_WAIT state are proactively cleaned up.<br> Default value: 7000<br> Minimum value =  1
	* </pre>
	*/
	public void set_maxtimewaitconn(Long maxtimewaitconn) throws Exception{
		this.maxtimewaitconn = maxtimewaitconn;
	}

	/**
	* <pre>
	* Maximum number of connections to hold in the TCP TIME_WAIT state. New connections entering TIME_WAIT state are proactively cleaned up.<br> Default value: 7000<br> Minimum value =  1
	* </pre>
	*/
	public Long get_maxtimewaitconn() throws Exception {
		return this.maxtimewaitconn;
	}

	/**
	* <pre>
	* Update last activity for KA probes.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_kaprobeupdatelastactivity(String kaprobeupdatelastactivity) throws Exception{
		this.kaprobeupdatelastactivity = kaprobeupdatelastactivity;
	}

	/**
	* <pre>
	* Update last activity for KA probes.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_kaprobeupdatelastactivity() throws Exception {
		return this.kaprobeupdatelastactivity;
	}

	/**
	* <pre>
	* When 'syncookie' is disabled in the TCP profile that is bound to the virtual server or service, and the number of TCP SYN+ACK retransmission by NetScaler for that virtual server or service crosses this threshold, the NetScaler appliance responds by using the TCP SYN-Cookie mechanism.<br> Default value: 100<br> Minimum value =  100<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_maxsynackretx(long maxsynackretx) throws Exception {
		this.maxsynackretx = new Long(maxsynackretx);
	}

	/**
	* <pre>
	* When 'syncookie' is disabled in the TCP profile that is bound to the virtual server or service, and the number of TCP SYN+ACK retransmission by NetScaler for that virtual server or service crosses this threshold, the NetScaler appliance responds by using the TCP SYN-Cookie mechanism.<br> Default value: 100<br> Minimum value =  100<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_maxsynackretx(Long maxsynackretx) throws Exception{
		this.maxsynackretx = maxsynackretx;
	}

	/**
	* <pre>
	* When 'syncookie' is disabled in the TCP profile that is bound to the virtual server or service, and the number of TCP SYN+ACK retransmission by NetScaler for that virtual server or service crosses this threshold, the NetScaler appliance responds by using the TCP SYN-Cookie mechanism.<br> Default value: 100<br> Minimum value =  100<br> Maximum value =  1048576
	* </pre>
	*/
	public Long get_maxsynackretx() throws Exception {
		return this.maxsynackretx;
	}

	/**
	* <pre>
	* Detect TCP SYN packet flood and send an SNMP trap.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_synattackdetection(String synattackdetection) throws Exception{
		this.synattackdetection = synattackdetection;
	}

	/**
	* <pre>
	* Detect TCP SYN packet flood and send an SNMP trap.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_synattackdetection() throws Exception {
		return this.synattackdetection;
	}

	/**
	* <pre>
	* Flush an existing connection if no memory can be obtained for new connection.

HALF_CLOSED_AND_IDLE: Flush a connection that is closed by us but not by peer, or failing that, a connection that is past configured idle time.  New connection fails if no such connection can be found.

FIFO: If no half-closed or idle connection can be found, flush the oldest non-management connection, even if it is active.  New connection fails if the oldest few connections are management connections.

Note: If you enable this setting, you should also consider lowering the zombie timeout and half-close timeout (see NSCLI command: set ns timeout).

See Also: connFlushThres argument below.
<br> Default value: 5<br> Possible values = NONE, HALFCLOSED_AND_IDLE, FIFO
	* </pre>
	*/
	public void set_connflushifnomem(String connflushifnomem) throws Exception{
		this.connflushifnomem = connflushifnomem;
	}

	/**
	* <pre>
	* Flush an existing connection if no memory can be obtained for new connection.

HALF_CLOSED_AND_IDLE: Flush a connection that is closed by us but not by peer, or failing that, a connection that is past configured idle time.  New connection fails if no such connection can be found.

FIFO: If no half-closed or idle connection can be found, flush the oldest non-management connection, even if it is active.  New connection fails if the oldest few connections are management connections.

Note: If you enable this setting, you should also consider lowering the zombie timeout and half-close timeout (see NSCLI command: set ns timeout).

See Also: connFlushThres argument below.
<br> Default value: 5<br> Possible values = NONE, HALFCLOSED_AND_IDLE, FIFO
	* </pre>
	*/
	public String get_connflushifnomem() throws Exception {
		return this.connflushifnomem;
	}

	/**
	* <pre>
	* Flush an existing connection (as configured through -connFlushIfNoMem FIFO) if the system has more than specified number of connections, and a new connection is to be established.  Note: This value may be rounded down to be a whole multiple of the number of packet engines running.<br> Minimum value =  1
	* </pre>
	*/
	public void set_connflushthres(long connflushthres) throws Exception {
		this.connflushthres = new Long(connflushthres);
	}

	/**
	* <pre>
	* Flush an existing connection (as configured through -connFlushIfNoMem FIFO) if the system has more than specified number of connections, and a new connection is to be established.  Note: This value may be rounded down to be a whole multiple of the number of packet engines running.<br> Minimum value =  1
	* </pre>
	*/
	public void set_connflushthres(Long connflushthres) throws Exception{
		this.connflushthres = connflushthres;
	}

	/**
	* <pre>
	* Flush an existing connection (as configured through -connFlushIfNoMem FIFO) if the system has more than specified number of connections, and a new connection is to be established.  Note: This value may be rounded down to be a whole multiple of the number of packet engines running.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_connflushthres() throws Exception {
		return this.connflushthres;
	}

	/**
	* <pre>
	* Accept DATA_FIN/FAST_CLOSE on passive subflow.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mptcpconcloseonpassivesf(String mptcpconcloseonpassivesf) throws Exception{
		this.mptcpconcloseonpassivesf = mptcpconcloseonpassivesf;
	}

	/**
	* <pre>
	* Accept DATA_FIN/FAST_CLOSE on passive subflow.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mptcpconcloseonpassivesf() throws Exception {
		return this.mptcpconcloseonpassivesf;
	}

	/**
	* <pre>
	* Use MPTCP DSS checksum.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mptcpchecksum(String mptcpchecksum) throws Exception{
		this.mptcpchecksum = mptcpchecksum;
	}

	/**
	* <pre>
	* Use MPTCP DSS checksum.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mptcpchecksum() throws Exception {
		return this.mptcpchecksum;
	}

	/**
	* <pre>
	* The timeout value in seconds for idle mptcp subflows. If this timeout is not set, idle subflows are cleared after cltTimeout of vserver.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_mptcpsftimeout(long mptcpsftimeout) throws Exception {
		this.mptcpsftimeout = new Long(mptcpsftimeout);
	}

	/**
	* <pre>
	* The timeout value in seconds for idle mptcp subflows. If this timeout is not set, idle subflows are cleared after cltTimeout of vserver.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_mptcpsftimeout(Long mptcpsftimeout) throws Exception{
		this.mptcpsftimeout = mptcpsftimeout;
	}

	/**
	* <pre>
	* The timeout value in seconds for idle mptcp subflows. If this timeout is not set, idle subflows are cleared after cltTimeout of vserver.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_mptcpsftimeout() throws Exception {
		return this.mptcpsftimeout;
	}

	/**
	* <pre>
	* The minimum idle time value in seconds for idle mptcp subflows after which the sublow is replaced by new incoming subflow if maximum subflow limit is reached. The priority for replacement is given to those subflow without any transaction.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_mptcpsfreplacetimeout(long mptcpsfreplacetimeout) throws Exception {
		this.mptcpsfreplacetimeout = new Long(mptcpsfreplacetimeout);
	}

	/**
	* <pre>
	* The minimum idle time value in seconds for idle mptcp subflows after which the sublow is replaced by new incoming subflow if maximum subflow limit is reached. The priority for replacement is given to those subflow without any transaction.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_mptcpsfreplacetimeout(Long mptcpsfreplacetimeout) throws Exception{
		this.mptcpsfreplacetimeout = mptcpsfreplacetimeout;
	}

	/**
	* <pre>
	* The minimum idle time value in seconds for idle mptcp subflows after which the sublow is replaced by new incoming subflow if maximum subflow limit is reached. The priority for replacement is given to those subflow without any transaction.<br> Default value: 10<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_mptcpsfreplacetimeout() throws Exception {
		return this.mptcpsfreplacetimeout;
	}

	/**
	* <pre>
	* Maximum number of subflow connections supported in established state per mptcp connection.<br> Default value: 4<br> Minimum value =  2<br> Maximum value =  6
	* </pre>
	*/
	public void set_mptcpmaxsf(long mptcpmaxsf) throws Exception {
		this.mptcpmaxsf = new Long(mptcpmaxsf);
	}

	/**
	* <pre>
	* Maximum number of subflow connections supported in established state per mptcp connection.<br> Default value: 4<br> Minimum value =  2<br> Maximum value =  6
	* </pre>
	*/
	public void set_mptcpmaxsf(Long mptcpmaxsf) throws Exception{
		this.mptcpmaxsf = mptcpmaxsf;
	}

	/**
	* <pre>
	* Maximum number of subflow connections supported in established state per mptcp connection.<br> Default value: 4<br> Minimum value =  2<br> Maximum value =  6
	* </pre>
	*/
	public Long get_mptcpmaxsf() throws Exception {
		return this.mptcpmaxsf;
	}

	/**
	* <pre>
	* Maximum number of subflow connections supported in pending join state per mptcp connection.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  4
	* </pre>
	*/
	public void set_mptcpmaxpendingsf(long mptcpmaxpendingsf) throws Exception {
		this.mptcpmaxpendingsf = new Long(mptcpmaxpendingsf);
	}

	/**
	* <pre>
	* Maximum number of subflow connections supported in pending join state per mptcp connection.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  4
	* </pre>
	*/
	public void set_mptcpmaxpendingsf(Long mptcpmaxpendingsf) throws Exception{
		this.mptcpmaxpendingsf = mptcpmaxpendingsf;
	}

	/**
	* <pre>
	* Maximum number of subflow connections supported in pending join state per mptcp connection.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  4
	* </pre>
	*/
	public Long get_mptcpmaxpendingsf() throws Exception {
		return this.mptcpmaxpendingsf;
	}

	/**
	* <pre>
	* Maximum system level pending join connections allowed.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_mptcppendingjointhreshold(long mptcppendingjointhreshold) throws Exception {
		this.mptcppendingjointhreshold = new Long(mptcppendingjointhreshold);
	}

	/**
	* <pre>
	* Maximum system level pending join connections allowed.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_mptcppendingjointhreshold(Long mptcppendingjointhreshold) throws Exception{
		this.mptcppendingjointhreshold = mptcppendingjointhreshold;
	}

	/**
	* <pre>
	* Maximum system level pending join connections allowed.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_mptcppendingjointhreshold() throws Exception {
		return this.mptcppendingjointhreshold;
	}

	/**
	* <pre>
	* Number of RTO's at subflow level, after which MPCTP should start using other subflow.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  6
	* </pre>
	*/
	public void set_mptcprtostoswitchsf(long mptcprtostoswitchsf) throws Exception {
		this.mptcprtostoswitchsf = new Long(mptcprtostoswitchsf);
	}

	/**
	* <pre>
	* Number of RTO's at subflow level, after which MPCTP should start using other subflow.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  6
	* </pre>
	*/
	public void set_mptcprtostoswitchsf(Long mptcprtostoswitchsf) throws Exception{
		this.mptcprtostoswitchsf = mptcprtostoswitchsf;
	}

	/**
	* <pre>
	* Number of RTO's at subflow level, after which MPCTP should start using other subflow.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  6
	* </pre>
	*/
	public Long get_mptcprtostoswitchsf() throws Exception {
		return this.mptcprtostoswitchsf;
	}

	/**
	* <pre>
	* When enabled, if NS receives a DSS on a backup subflow, NS will start using that subflow to send data. And if disabled, NS will continue to transmit on current chosen subflow. In case there is some error on a subflow (like RTO's/RST etc.) then NS can choose a backup subflow irrespective of this tunable.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mptcpusebackupondss(String mptcpusebackupondss) throws Exception{
		this.mptcpusebackupondss = mptcpusebackupondss;
	}

	/**
	* <pre>
	* When enabled, if NS receives a DSS on a backup subflow, NS will start using that subflow to send data. And if disabled, NS will continue to transmit on current chosen subflow. In case there is some error on a subflow (like RTO's/RST etc.) then NS can choose a backup subflow irrespective of this tunable.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mptcpusebackupondss() throws Exception {
		return this.mptcpusebackupondss;
	}

	/**
	* <pre>
	* Number of RTO's after which a connection should be freed.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  7
	* </pre>
	*/
	public void set_tcpmaxretries(long tcpmaxretries) throws Exception {
		this.tcpmaxretries = new Long(tcpmaxretries);
	}

	/**
	* <pre>
	* Number of RTO's after which a connection should be freed.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  7
	* </pre>
	*/
	public void set_tcpmaxretries(Long tcpmaxretries) throws Exception{
		this.tcpmaxretries = tcpmaxretries;
	}

	/**
	* <pre>
	* Number of RTO's after which a connection should be freed.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  7
	* </pre>
	*/
	public Long get_tcpmaxretries() throws Exception {
		return this.tcpmaxretries;
	}

	/**
	* <pre>
	* Allow subflows to close immediately on FIN before the DATA_FIN exchange is completed at mptcp level.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_mptcpimmediatesfcloseonfin(String mptcpimmediatesfcloseonfin) throws Exception{
		this.mptcpimmediatesfcloseonfin = mptcpimmediatesfcloseonfin;
	}

	/**
	* <pre>
	* Allow subflows to close immediately on FIN before the DATA_FIN exchange is completed at mptcp level.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_mptcpimmediatesfcloseonfin() throws Exception {
		return this.mptcpimmediatesfcloseonfin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nstcpparam[] resources = new nstcpparam[1];
		nstcpparam_response result = (nstcpparam_response) service.get_payload_formatter().string_to_resource(nstcpparam_response.class, response);
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
		resources[0] = result.nstcpparam;
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
	* Use this API to update nstcpparam.
	*/
	public static base_response update(nitro_service client, nstcpparam resource) throws Exception {
		nstcpparam updateresource = new nstcpparam();
		updateresource.ws = resource.ws;
		updateresource.wsval = resource.wsval;
		updateresource.sack = resource.sack;
		updateresource.learnvsvrmss = resource.learnvsvrmss;
		updateresource.maxburst = resource.maxburst;
		updateresource.initialcwnd = resource.initialcwnd;
		updateresource.recvbuffsize = resource.recvbuffsize;
		updateresource.delayedack = resource.delayedack;
		updateresource.downstaterst = resource.downstaterst;
		updateresource.nagle = resource.nagle;
		updateresource.limitedpersist = resource.limitedpersist;
		updateresource.oooqsize = resource.oooqsize;
		updateresource.ackonpush = resource.ackonpush;
		updateresource.maxpktpermss = resource.maxpktpermss;
		updateresource.pktperretx = resource.pktperretx;
		updateresource.minrto = resource.minrto;
		updateresource.slowstartincr = resource.slowstartincr;
		updateresource.maxdynserverprobes = resource.maxdynserverprobes;
		updateresource.synholdfastgiveup = resource.synholdfastgiveup;
		updateresource.maxsynholdperprobe = resource.maxsynholdperprobe;
		updateresource.maxsynhold = resource.maxsynhold;
		updateresource.msslearninterval = resource.msslearninterval;
		updateresource.msslearndelay = resource.msslearndelay;
		updateresource.maxtimewaitconn = resource.maxtimewaitconn;
		updateresource.kaprobeupdatelastactivity = resource.kaprobeupdatelastactivity;
		updateresource.maxsynackretx = resource.maxsynackretx;
		updateresource.synattackdetection = resource.synattackdetection;
		updateresource.connflushifnomem = resource.connflushifnomem;
		updateresource.connflushthres = resource.connflushthres;
		updateresource.mptcpconcloseonpassivesf = resource.mptcpconcloseonpassivesf;
		updateresource.mptcpchecksum = resource.mptcpchecksum;
		updateresource.mptcpsftimeout = resource.mptcpsftimeout;
		updateresource.mptcpsfreplacetimeout = resource.mptcpsfreplacetimeout;
		updateresource.mptcpmaxsf = resource.mptcpmaxsf;
		updateresource.mptcpmaxpendingsf = resource.mptcpmaxpendingsf;
		updateresource.mptcppendingjointhreshold = resource.mptcppendingjointhreshold;
		updateresource.mptcprtostoswitchsf = resource.mptcprtostoswitchsf;
		updateresource.mptcpusebackupondss = resource.mptcpusebackupondss;
		updateresource.tcpmaxretries = resource.tcpmaxretries;
		updateresource.mptcpimmediatesfcloseonfin = resource.mptcpimmediatesfcloseonfin;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nstcpparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nstcpparam resource, String[] args) throws Exception{
		nstcpparam unsetresource = new nstcpparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nstcpparam resources that are configured on netscaler.
	*/
	public static nstcpparam get(nitro_service service) throws Exception{
		nstcpparam obj = new nstcpparam();
		nstcpparam[] response = (nstcpparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nstcpparam resources that are configured on netscaler.
	*/
	public static nstcpparam get(nitro_service service,  options option) throws Exception{
		nstcpparam obj = new nstcpparam();
		nstcpparam[] response = (nstcpparam[])obj.get_resources(service,option);
		return response[0];
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
	public static class mptcpusebackupondssEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ackonpushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class connflushifnomemEnum {
		public static final String NONE = "NONE";
		public static final String HALFCLOSED_AND_IDLE = "HALFCLOSED_AND_IDLE";
		public static final String FIFO = "FIFO";
	}
	public static class mptcpconcloseonpassivesfEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class learnvsvrmssEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class downstaterstEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class nagleEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class limitedpersistEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class synattackdetectionEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mptcpchecksumEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class mptcpimmediatesfcloseonfinEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
