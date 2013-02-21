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

	/**
	* <pre>
	* The state of WS.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ws(String ws) throws Exception{
		this.ws = ws;
	}

	/**
	* <pre>
	* The state of WS.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ws() throws Exception {
		return this.ws;
	}

	/**
	* <pre>
	* Window Scaling Factor used.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  8
	* </pre>
	*/
	public void set_wsval(long wsval) throws Exception {
		this.wsval = new Long(wsval);
	}

	/**
	* <pre>
	* Window Scaling Factor used.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  8
	* </pre>
	*/
	public void set_wsval(Long wsval) throws Exception{
		this.wsval = wsval;
	}

	/**
	* <pre>
	* Window Scaling Factor used.<br> Default value: 4<br> Minimum value =  0<br> Maximum value =  8
	* </pre>
	*/
	public Long get_wsval() throws Exception {
		return this.wsval;
	}

	/**
	* <pre>
	* The state of SACK.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sack(String sack) throws Exception{
		this.sack = sack;
	}

	/**
	* <pre>
	* The state of SACK.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sack() throws Exception {
		return this.sack;
	}

	/**
	* <pre>
	* enable/disable MSS learning for vservers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_learnvsvrmss(String learnvsvrmss) throws Exception{
		this.learnvsvrmss = learnvsvrmss;
	}

	/**
	* <pre>
	* enable/disable MSS learning for vservers.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_learnvsvrmss() throws Exception {
		return this.learnvsvrmss;
	}

	/**
	* <pre>
	* Max-Burst Factor used.<br> Default value: 6<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxburst(long maxburst) throws Exception {
		this.maxburst = new Long(maxburst);
	}

	/**
	* <pre>
	* Max-Burst Factor used.<br> Default value: 6<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxburst(Long maxburst) throws Exception{
		this.maxburst = maxburst;
	}

	/**
	* <pre>
	* Max-Burst Factor used.<br> Default value: 6<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_maxburst() throws Exception {
		return this.maxburst;
	}

	/**
	* <pre>
	* Intial value of TCP cwnd used.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  44
	* </pre>
	*/
	public void set_initialcwnd(long initialcwnd) throws Exception {
		this.initialcwnd = new Long(initialcwnd);
	}

	/**
	* <pre>
	* Intial value of TCP cwnd used.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  44
	* </pre>
	*/
	public void set_initialcwnd(Long initialcwnd) throws Exception{
		this.initialcwnd = initialcwnd;
	}

	/**
	* <pre>
	* Intial value of TCP cwnd used.<br> Default value: 4<br> Minimum value =  1<br> Maximum value =  44
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
	* Delayed acknowledgement timeout (in millisec).<br> Default value: 100<br> Minimum value =  10<br> Maximum value =  300
	* </pre>
	*/
	public void set_delayedack(long delayedack) throws Exception {
		this.delayedack = new Long(delayedack);
	}

	/**
	* <pre>
	* Delayed acknowledgement timeout (in millisec).<br> Default value: 100<br> Minimum value =  10<br> Maximum value =  300
	* </pre>
	*/
	public void set_delayedack(Long delayedack) throws Exception{
		this.delayedack = delayedack;
	}

	/**
	* <pre>
	* Delayed acknowledgement timeout (in millisec).<br> Default value: 100<br> Minimum value =  10<br> Maximum value =  300
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
	* Whether to enable Nagle's algorithm on connections.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nagle(String nagle) throws Exception{
		this.nagle = nagle;
	}

	/**
	* <pre>
	* Whether to enable Nagle's algorithm on connections.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nagle() throws Exception {
		return this.nagle;
	}

	/**
	* <pre>
	* Whether to limit the number of persist(zero window) probes.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_limitedpersist(String limitedpersist) throws Exception{
		this.limitedpersist = limitedpersist;
	}

	/**
	* <pre>
	* Whether to limit the number of persist(zero window) probes.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_limitedpersist() throws Exception {
		return this.limitedpersist;
	}

	/**
	* <pre>
	* Maximum size of out-of-order packet queue (0 means infinite).<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_oooqsize(long oooqsize) throws Exception {
		this.oooqsize = new Long(oooqsize);
	}

	/**
	* <pre>
	* Maximum size of out-of-order packet queue (0 means infinite).<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_oooqsize(Long oooqsize) throws Exception{
		this.oooqsize = oooqsize;
	}

	/**
	* <pre>
	* Maximum size of out-of-order packet queue (0 means infinite).<br> Default value: 64<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_oooqsize() throws Exception {
		return this.oooqsize;
	}

	/**
	* <pre>
	* Enable immediate ACK on receiving packet with PUSH flag.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_ackonpush(String ackonpush) throws Exception{
		this.ackonpush = ackonpush;
	}

	/**
	* <pre>
	* Enable immediate ACK on receiving packet with PUSH flag.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_ackonpush() throws Exception {
		return this.ackonpush;
	}

	/**
	* <pre>
	* Set maximum packtes to be sent for each MSS in CWND for packet count based congestion control.<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public void set_maxpktpermss(int maxpktpermss) throws Exception {
		this.maxpktpermss = new Integer(maxpktpermss);
	}

	/**
	* <pre>
	* Set maximum packtes to be sent for each MSS in CWND for packet count based congestion control.<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public void set_maxpktpermss(Integer maxpktpermss) throws Exception{
		this.maxpktpermss = maxpktpermss;
	}

	/**
	* <pre>
	* Set maximum packtes to be sent for each MSS in CWND for packet count based congestion control.<br> Minimum value =  0<br> Maximum value =  1460
	* </pre>
	*/
	public Integer get_maxpktpermss() throws Exception {
		return this.maxpktpermss;
	}

	/**
	* <pre>
	* Set maximum packets should be retransmitted on partial ACK case.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_pktperretx(int pktperretx) throws Exception {
		this.pktperretx = new Integer(pktperretx);
	}

	/**
	* <pre>
	* Set maximum packets should be retransmitted on partial ACK case.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_pktperretx(Integer pktperretx) throws Exception{
		this.pktperretx = pktperretx;
	}

	/**
	* <pre>
	* Set maximum packets should be retransmitted on partial ACK case.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Integer get_pktperretx() throws Exception {
		return this.pktperretx;
	}

	/**
	* <pre>
	* Minimum TCP RTO(in millisec).<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public void set_minrto(int minrto) throws Exception {
		this.minrto = new Integer(minrto);
	}

	/**
	* <pre>
	* Minimum TCP RTO(in millisec).<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public void set_minrto(Integer minrto) throws Exception{
		this.minrto = minrto;
	}

	/**
	* <pre>
	* Minimum TCP RTO(in millisec).<br> Default value: 1000<br> Minimum value =  10<br> Maximum value =  64000
	* </pre>
	*/
	public Integer get_minrto() throws Exception {
		return this.minrto;
	}

	/**
	* <pre>
	* Set TCP slow start increment factor.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_slowstartincr(int slowstartincr) throws Exception {
		this.slowstartincr = new Integer(slowstartincr);
	}

	/**
	* <pre>
	* Set TCP slow start increment factor.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_slowstartincr(Integer slowstartincr) throws Exception{
		this.slowstartincr = slowstartincr;
	}

	/**
	* <pre>
	* Set TCP slow start increment factor.<br> Default value: 2<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Integer get_slowstartincr() throws Exception {
		return this.slowstartincr;
	}

	/**
	* <pre>
	* Max server probes in 10ms.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxdynserverprobes(long maxdynserverprobes) throws Exception {
		this.maxdynserverprobes = new Long(maxdynserverprobes);
	}

	/**
	* <pre>
	* Max server probes in 10ms.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxdynserverprobes(Long maxdynserverprobes) throws Exception{
		this.maxdynserverprobes = maxdynserverprobes;
	}

	/**
	* <pre>
	* Max server probes in 10ms.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxdynserverprobes() throws Exception {
		return this.maxdynserverprobes;
	}

	/**
	* <pre>
	* Max threshold after which NetScaler reduces the number of retries for server probes.<br> Default value: 1024<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public void set_synholdfastgiveup(long synholdfastgiveup) throws Exception {
		this.synholdfastgiveup = new Long(synholdfastgiveup);
	}

	/**
	* <pre>
	* Max threshold after which NetScaler reduces the number of retries for server probes.<br> Default value: 1024<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public void set_synholdfastgiveup(Long synholdfastgiveup) throws Exception{
		this.synholdfastgiveup = synholdfastgiveup;
	}

	/**
	* <pre>
	* Max threshold after which NetScaler reduces the number of retries for server probes.<br> Default value: 1024<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_synholdfastgiveup() throws Exception {
		return this.synholdfastgiveup;
	}

	/**
	* <pre>
	* Maximum number of SYN allowed to be queued per probe PCB.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxsynholdperprobe(long maxsynholdperprobe) throws Exception {
		this.maxsynholdperprobe = new Long(maxsynholdperprobe);
	}

	/**
	* <pre>
	* Maximum number of SYN allowed to be queued per probe PCB.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_maxsynholdperprobe(Long maxsynholdperprobe) throws Exception{
		this.maxsynholdperprobe = maxsynholdperprobe;
	}

	/**
	* <pre>
	* Maximum number of SYN allowed to be queued per probe PCB.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_maxsynholdperprobe() throws Exception {
		return this.maxsynholdperprobe;
	}

	/**
	* <pre>
	* Maximum number of SYN that NetScaler can hold while probing for backend services.<br> Default value: 16384<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxsynhold(long maxsynhold) throws Exception {
		this.maxsynhold = new Long(maxsynhold);
	}

	/**
	* <pre>
	* Maximum number of SYN that NetScaler can hold while probing for backend services.<br> Default value: 16384<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxsynhold(Long maxsynhold) throws Exception{
		this.maxsynhold = maxsynhold;
	}

	/**
	* <pre>
	* Maximum number of SYN that NetScaler can hold while probing for backend services.<br> Default value: 16384<br> Minimum value =  256<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxsynhold() throws Exception {
		return this.maxsynhold;
	}

	/**
	* <pre>
	* Time period (in seconds) for which the backend service MSS are sampled for Vserver MSS learning.<br> Default value: 180<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_msslearninterval(long msslearninterval) throws Exception {
		this.msslearninterval = new Long(msslearninterval);
	}

	/**
	* <pre>
	* Time period (in seconds) for which the backend service MSS are sampled for Vserver MSS learning.<br> Default value: 180<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_msslearninterval(Long msslearninterval) throws Exception{
		this.msslearninterval = msslearninterval;
	}

	/**
	* <pre>
	* Time period (in seconds) for which the backend service MSS are sampled for Vserver MSS learning.<br> Default value: 180<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public Long get_msslearninterval() throws Exception {
		return this.msslearninterval;
	}

	/**
	* <pre>
	* Vserver MSS learning delay(seconds).<br> Default value: 3600<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_msslearndelay(long msslearndelay) throws Exception {
		this.msslearndelay = new Long(msslearndelay);
	}

	/**
	* <pre>
	* Vserver MSS learning delay(seconds).<br> Default value: 3600<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_msslearndelay(Long msslearndelay) throws Exception{
		this.msslearndelay = msslearndelay;
	}

	/**
	* <pre>
	* Vserver MSS learning delay(seconds).<br> Default value: 3600<br> Minimum value =  1<br> Maximum value =  1048576
	* </pre>
	*/
	public Long get_msslearndelay() throws Exception {
		return this.msslearndelay;
	}

	/**
	* <pre>
	* max connection limit for FIN TIME WAIT.<br> Default value: 7000<br> Minimum value =  1
	* </pre>
	*/
	public void set_maxtimewaitconn(long maxtimewaitconn) throws Exception {
		this.maxtimewaitconn = new Long(maxtimewaitconn);
	}

	/**
	* <pre>
	* max connection limit for FIN TIME WAIT.<br> Default value: 7000<br> Minimum value =  1
	* </pre>
	*/
	public void set_maxtimewaitconn(Long maxtimewaitconn) throws Exception{
		this.maxtimewaitconn = maxtimewaitconn;
	}

	/**
	* <pre>
	* max connection limit for FIN TIME WAIT.<br> Default value: 7000<br> Minimum value =  1
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
	* Max limit for syn+ack retransmissions in a given interval.<br> Default value: 100<br> Minimum value =  100<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_maxsynackretx(long maxsynackretx) throws Exception {
		this.maxsynackretx = new Long(maxsynackretx);
	}

	/**
	* <pre>
	* Max limit for syn+ack retransmissions in a given interval.<br> Default value: 100<br> Minimum value =  100<br> Maximum value =  1048576
	* </pre>
	*/
	public void set_maxsynackretx(Long maxsynackretx) throws Exception{
		this.maxsynackretx = maxsynackretx;
	}

	/**
	* <pre>
	* Max limit for syn+ack retransmissions in a given interval.<br> Default value: 100<br> Minimum value =  100<br> Maximum value =  1048576
	* </pre>
	*/
	public Long get_maxsynackretx() throws Exception {
		return this.maxsynackretx;
	}

	/**
	* <pre>
	* Enable/disable synattack detection.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_synattackdetection(String synattackdetection) throws Exception{
		this.synattackdetection = synattackdetection;
	}

	/**
	* <pre>
	* Enable/disable synattack detection.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
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
<br> Default value: 5<br> Possible values = 
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
<br> Default value: 5<br> Possible values = 
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
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nstcpparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nstcpparam resource, String[] args) throws Exception{
		nstcpparam unsetresource = new nstcpparam();
		unsetresource.ws = resource.ws;
		unsetresource.wsval = resource.wsval;
		unsetresource.sack = resource.sack;
		unsetresource.learnvsvrmss = resource.learnvsvrmss;
		unsetresource.maxburst = resource.maxburst;
		unsetresource.initialcwnd = resource.initialcwnd;
		unsetresource.recvbuffsize = resource.recvbuffsize;
		unsetresource.delayedack = resource.delayedack;
		unsetresource.downstaterst = resource.downstaterst;
		unsetresource.nagle = resource.nagle;
		unsetresource.limitedpersist = resource.limitedpersist;
		unsetresource.oooqsize = resource.oooqsize;
		unsetresource.ackonpush = resource.ackonpush;
		unsetresource.maxpktpermss = resource.maxpktpermss;
		unsetresource.pktperretx = resource.pktperretx;
		unsetresource.minrto = resource.minrto;
		unsetresource.slowstartincr = resource.slowstartincr;
		unsetresource.maxdynserverprobes = resource.maxdynserverprobes;
		unsetresource.synholdfastgiveup = resource.synholdfastgiveup;
		unsetresource.maxsynholdperprobe = resource.maxsynholdperprobe;
		unsetresource.maxsynhold = resource.maxsynhold;
		unsetresource.msslearninterval = resource.msslearninterval;
		unsetresource.msslearndelay = resource.msslearndelay;
		unsetresource.maxtimewaitconn = resource.maxtimewaitconn;
		unsetresource.kaprobeupdatelastactivity = resource.kaprobeupdatelastactivity;
		unsetresource.maxsynackretx = resource.maxsynackretx;
		unsetresource.synattackdetection = resource.synattackdetection;
		unsetresource.connflushifnomem = resource.connflushifnomem;
		unsetresource.connflushthres = resource.connflushthres;
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
	public static class ackonpushEnum {
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
}
