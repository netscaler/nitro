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

package com.citrix.netscaler.nitro.resource.stat.protocol;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class protocoltcp_response extends base_response
{
	public protocoltcp_stats protocoltcp;
}
/**
* Statistics for tcp protocol resource.
*/

public class protocoltcp_stats extends base_resource
{
	private String clearstats;
	private Long tcpactiveserverconn;
	private Long tcpcurserverconnopening;
	private Long tcpcurclientconnopening;
	private Long tcpcurclientconnestablished;
	private Long tcpcurserverconnestablished;
	private Long tcptotrxpkts;
	private Long tcprxpktsrate;
	private Long tcptotrxbytes;
	private Long tcprxbytesrate;
	private Long tcptottxpkts;
	private Long tcptxpktsrate;
	private Long tcptottxbytes;
	private Long tcptxbytesrate;
	private Long tcpcurclientconn;
	private Long tcpcurclientconnclosing;
	private Long tcptotclientconnopened;
	private Long tcpclientconnopenedrate;
	private Long tcpcurserverconn;
	private Long tcpcurserverconnclosing;
	private Long tcptotserverconnopened;
	private Long tcpserverconnopenedrate;
	private Long tcpsurgequeuelen;
	private Long tcpspareconn;
	private Long tcptotzombiecltconnflushed;
	private Long tcpzombiecltconnflushedrate;
	private Long tcptotzombiehalfopencltconnflushed;
	private Long tcpzombiehalfopencltconnflushedrate;
	private Long tcptotzombieactivehalfclosecltconnflushed;
	private Long tcpzombieactivehalfclosecltconnflushedrate;
	private Long tcptotzombiepassivehalfclosecltconnflushed;
	private Long tcpzombiepassivehalfclosecltconnflushedrate;
	private Long tcptotzombiesvrconnflushed;
	private Long tcpzombiesvrconnflushedrate;
	private Long tcptotzombiehalfopensvrconnflushed;
	private Long tcpzombiehalfopensvrconnflushedrate;
	private Long tcptotzombieactivehalfclosesvrconnflushed;
	private Long tcpzombieactivehalfclosesvrconnflushedrate;
	private Long tcptotzombiepassivehalfclosesrvconnflushed;
	private Long tcpzombiepassivehalfclosesrvconnflushedrate;
	private Long pcbtotzombiecall;
	private Long pcbzombiecallrate;
	private Long tcptotsyn;
	private Long tcpsynrate;
	private Long tcptotsynprobe;
	private Long tcpsynproberate;
	private Long tcptotsvrfin;
	private Long tcpsvrfinrate;
	private Long tcptotcltfin;
	private Long tcpcltfinrate;
	private Long tcpwaittosyn;
	private Long tcpwaittosynrate;
	private Long tcpwaittodata;
	private Long tcpwaittodatarate;
	private Long tcptotsynheld;
	private Long tcpsynheldrate;
	private Long tcptotsynflush;
	private Long tcpsynflushrate;
	private Long tcptotfinwaitclosed;
	private Long tcpfinwaitclosedrate;
	private Long tcperrbadchecksum;
	private Long tcperrbadchecksumrate;
	private Long tcperrdataafterfin;
	private Long tcperrdataafterfinrate;
	private Long tcperrsyninsynrcvd;
	private Long tcperrsyninsynrcvdrate;
	private Long tcperrsyninest;
	private Long tcperrsyninestrate;
	private Long tcperrsynsentbadack;
	private Long tcperrsynsentbadackrate;
	private Long tcperrrst;
	private Long tcperrrstrate;
	private Long tcperrrstnonest;
	private Long tcperrrstnonestrate;
	private Long tcperrrstoutofwindow;
	private Long tcperrrstoutofwindowrate;
	private Long tcperrrstintimewait;
	private Long tcperrrstintimewaitrate;
	private Long tcperrsvroutoforder;
	private Long tcperrsvroutoforderrate;
	private Long tcperrcltoutoforder;
	private Long tcperrcltoutoforderrate;
	private Long tcperrclthole;
	private Long tcperrcltholerate;
	private Long tcperrsvrhole;
	private Long tcperrsvrholerate;
	private Long tcperrcookiepktseqreject;
	private Long tcperrcookiepktseqrejectrate;
	private Long tcperrcookiepktsigreject;
	private Long tcperrcookiepktsigrejectrate;
	private Long tcperrcookiepktseqdrop;
	private Long tcperrcookiepktseqdroprate;
	private Long tcperrcookiepktmssreject;
	private Long tcperrcookiepktmssrejectrate;
	private Long tcperranyportfail;
	private Long tcperranyportfailrate;
	private Long tcperripportfail;
	private Long tcperripportfailrate;
	private Long tcperrstraypkt;
	private Long tcperrstraypktrate;
	private Long tcperrsentrst;
	private Long tcperrsentrstrate;
	private Long tcperrbadstateconn;
	private Long tcperrbadstateconnrate;
	private Long tcperrrstthreshold;
	private Long tcperrrstthresholdrate;
	private Long tcperroutofwindowpkts;
	private Long tcperroutofwindowpktsrate;
	private Long tcperrsyndroppedcongestion;
	private Long tcperrsyndroppedcongestionrate;
	private Long tcperrcltretrasmit;
	private Long tcperrcltretrasmitrate;
	private Long tcperrfullretrasmit;
	private Long tcperrfullretrasmitrate;
	private Long tcperrsynretry;
	private Long tcperrsynretryrate;
	private Long tcperrsyngiveup;
	private Long tcperrsyngiveuprate;
	private Long tcperrretransmit;
	private Long tcperrretransmitrate;
	private Long tcperrfirstretransmissions;
	private Long tcperrfirstretransmissionsrate;
	private Long tcperrthirdretransmissions;
	private Long tcperrthirdretransmissionsrate;
	private Long tcperrfifthretransmissions;
	private Long tcperrfifthretransmissionsrate;
	private Long tcperrseventhretransmissions;
	private Long tcperrseventhretransmissionsrate;
	private Long tcperrfastretransmissions;
	private Long tcperrfastretransmissionsrate;
	private Long tcperrsvrretrasmit;
	private Long tcperrsvrretrasmitrate;
	private Long tcperrpartialretrasmit;
	private Long tcperrpartialretrasmitrate;
	private Long tcperrfinretry;
	private Long tcperrfinretryrate;
	private Long tcperrfingiveup;
	private Long tcperrfingiveuprate;
	private Long tcperrsecondretransmissions;
	private Long tcperrsecondretransmissionsrate;
	private Long tcperrforthretransmissions;
	private Long tcperrforthretransmissionsrate;
	private Long tcperrsixthretransmissions;
	private Long tcperrsixthretransmissionsrate;
	private Long tcperrretransmitgiveup;
	private Long tcperrretransmitgiveuprate;
	private Long tcperrcipalloc;
	private Long tcperrcipallocrate;

	/**
	* <pre>
	* Clear the statsistics / counters
	* </pre>
	*/
	public void set_clearstats(String clearstats) throws Exception{
		this.clearstats = clearstats;
	}

	/**
	* <pre>
	* Clear the statsistics / counters.<br> Possible values = basic, full
	* </pre>
	*/
	public String get_clearstats() throws Exception {
		return this.clearstats;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrfingiveup
	* </pre>
	*/
	public Long get_tcperrfingiveuprate() throws Exception {
		return this.tcperrfingiveuprate;
	}

	/**
	* <pre>
	* TCP packets retransmitted. The NetScaler attempts to retransmit the packet up to seven times, after which it resets the other half of the TCP connection.
	* </pre>
	*/
	public Long get_tcperrretransmit() throws Exception {
		return this.tcperrretransmit;
	}

	/**
	* <pre>
	* SYN cookie packets rejected because the maximum segment size (MSS) specified in the packets is incorrect.
	* </pre>
	*/
	public Long get_tcperrcookiepktmssreject() throws Exception {
		return this.tcperrcookiepktmssreject;
	}

	/**
	* <pre>
	* Half-opened client connections that are flushed because the three-way handshakes are not complete.
	* </pre>
	*/
	public Long get_tcptotzombiehalfopencltconnflushed() throws Exception {
		return this.tcptotzombiehalfopencltconnflushed;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsentrst
	* </pre>
	*/
	public Long get_tcperrsentrstrate() throws Exception {
		return this.tcperrsentrstrate;
	}

	/**
	* <pre>
	* Out of order TCP packets received from a client.
	* </pre>
	*/
	public Long get_tcperrcltoutoforder() throws Exception {
		return this.tcperrcltoutoforder;
	}

	/**
	* <pre>
	* Connections in the surge queue. When the NetScaler cannot open a connection to the server, for example when maximum connections have been reached, the NetScaler queues these requests.
	* </pre>
	*/
	public Long get_tcpsurgequeuelen() throws Exception {
		return this.tcpsurgequeuelen;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrcookiepktseqreject
	* </pre>
	*/
	public Long get_tcperrcookiepktseqrejectrate() throws Exception {
		return this.tcperrcookiepktseqrejectrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrrstoutofwindow
	* </pre>
	*/
	public Long get_tcperrrstoutofwindowrate() throws Exception {
		return this.tcperrrstoutofwindowrate;
	}

	/**
	* <pre>
	* TCP packets received.
	* </pre>
	*/
	public Long get_tcptotrxpkts() throws Exception {
		return this.tcptotrxpkts;
	}

	/**
	* <pre>
	* Client connections in the Opening state, which indicates that the handshakes are not yet complete.
	* </pre>
	*/
	public Long get_tcpcurclientconnopening() throws Exception {
		return this.tcpcurclientconnopening;
	}

	/**
	* <pre>
	* SYN cookie packets rejected because they contain an incorrect sequence number.
	* </pre>
	*/
	public Long get_tcperrcookiepktseqreject() throws Exception {
		return this.tcperrcookiepktseqreject;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrforthretransmissions
	* </pre>
	*/
	public Long get_tcperrforthretransmissionsrate() throws Exception {
		return this.tcperrforthretransmissionsrate;
	}

	/**
	* <pre>
	* Reset packets received from a client or a server.
	* </pre>
	*/
	public Long get_tcperrrst() throws Exception {
		return this.tcperrrst;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotsvrfin
	* </pre>
	*/
	public Long get_tcpsvrfinrate() throws Exception {
		return this.tcpsvrfinrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptottxbytes
	* </pre>
	*/
	public Long get_tcptxbytesrate() throws Exception {
		return this.tcptxbytesrate;
	}

	/**
	* <pre>
	* SYN packets received
	* </pre>
	*/
	public Long get_tcptotsyn() throws Exception {
		return this.tcptotsyn;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotserverconnopened
	* </pre>
	*/
	public Long get_tcpserverconnopenedrate() throws Exception {
		return this.tcpserverconnopenedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsyninsynrcvd
	* </pre>
	*/
	public Long get_tcperrsyninsynrcvdrate() throws Exception {
		return this.tcperrsyninsynrcvdrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrpartialretrasmit
	* </pre>
	*/
	public Long get_tcperrpartialretrasmitrate() throws Exception {
		return this.tcperrpartialretrasmitrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotzombieactivehalfclosecltconnflushed
	* </pre>
	*/
	public Long get_tcpzombieactivehalfclosecltconnflushedrate() throws Exception {
		return this.tcpzombieactivehalfclosecltconnflushedrate;
	}

	/**
	* <pre>
	* FIN packets resent to a server or a client.
	* </pre>
	*/
	public Long get_tcperrfinretry() throws Exception {
		return this.tcperrfinretry;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsvroutoforder
	* </pre>
	*/
	public Long get_tcperrsvroutoforderrate() throws Exception {
		return this.tcperrsvroutoforderrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for pcbtotzombiecall
	* </pre>
	*/
	public Long get_pcbzombiecallrate() throws Exception {
		return this.pcbzombiecallrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrfirstretransmissions
	* </pre>
	*/
	public Long get_tcperrfirstretransmissionsrate() throws Exception {
		return this.tcperrfirstretransmissionsrate;
	}

	/**
	* <pre>
	* Number of stray or misrouted packets.
	* </pre>
	*/
	public Long get_tcperrstraypkt() throws Exception {
		return this.tcperrstraypkt;
	}

	/**
	* <pre>
	* SYN packets received on a connection that is in the SYN_RCVD state. A connection goes into the SYN_RCVD state after receiving a SYN packet.
	* </pre>
	*/
	public Long get_tcperrsyninsynrcvd() throws Exception {
		return this.tcperrsyninsynrcvd;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotrxbytes
	* </pre>
	*/
	public Long get_tcprxbytesrate() throws Exception {
		return this.tcprxbytesrate;
	}

	/**
	* <pre>
	* Current server connections in the Established state, which indicates that data transfer can occur between the NetScaler and the server.
	* </pre>
	*/
	public Long get_tcpcurserverconnestablished() throws Exception {
		return this.tcpcurserverconnestablished;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperroutofwindowpkts
	* </pre>
	*/
	public Long get_tcperroutofwindowpktsrate() throws Exception {
		return this.tcperroutofwindowpktsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperranyportfail
	* </pre>
	*/
	public Long get_tcperranyportfailrate() throws Exception {
		return this.tcperranyportfailrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotsynprobe
	* </pre>
	*/
	public Long get_tcpsynproberate() throws Exception {
		return this.tcpsynproberate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotzombiesvrconnflushed
	* </pre>
	*/
	public Long get_tcpzombiesvrconnflushedrate() throws Exception {
		return this.tcpzombiesvrconnflushedrate;
	}

	/**
	* <pre>
	* Client connections, including connections in the Opening, Established, and Closing state.
	* </pre>
	*/
	public Long get_tcpcurclientconn() throws Exception {
		return this.tcpcurclientconn;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsyninest
	* </pre>
	*/
	public Long get_tcperrsyninestrate() throws Exception {
		return this.tcperrsyninestrate;
	}

	/**
	* <pre>
	* Server connections, including connections in the Opening, Established, and Closing state.
	* </pre>
	*/
	public Long get_tcpcurserverconn() throws Exception {
		return this.tcpcurserverconn;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperripportfail
	* </pre>
	*/
	public Long get_tcperripportfailrate() throws Exception {
		return this.tcperripportfailrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrcookiepktsigreject
	* </pre>
	*/
	public Long get_tcperrcookiepktsigrejectrate() throws Exception {
		return this.tcperrcookiepktsigrejectrate;
	}

	/**
	* <pre>
	* Packets retransmitted four times by the NetScaler.
	* </pre>
	*/
	public Long get_tcperrforthretransmissions() throws Exception {
		return this.tcperrforthretransmissions;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotzombiehalfopensvrconnflushed
	* </pre>
	*/
	public Long get_tcpzombiehalfopensvrconnflushedrate() throws Exception {
		return this.tcpzombiehalfopensvrconnflushedrate;
	}

	/**
	* <pre>
	* Packets retransmitted six times by the NetScaler.
	* </pre>
	*/
	public Long get_tcperrsixthretransmissions() throws Exception {
		return this.tcperrsixthretransmissions;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotfinwaitclosed
	* </pre>
	*/
	public Long get_tcpfinwaitclosedrate() throws Exception {
		return this.tcpfinwaitclosedrate;
	}

	/**
	* <pre>
	* Packets received with a TCP checksum error.
	* </pre>
	*/
	public Long get_tcperrbadchecksum() throws Exception {
		return this.tcperrbadchecksum;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotsynflush
	* </pre>
	*/
	public Long get_tcpsynflushrate() throws Exception {
		return this.tcpsynflushrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrcipalloc
	* </pre>
	*/
	public Long get_tcperrcipallocrate() throws Exception {
		return this.tcperrcipallocrate;
	}

	/**
	* <pre>
	* Reset packets dropped because the default threshold of 100 resets per 10 milliseconds has been exceeded. This is a configurable value using the set rateControl command.
	* </pre>
	*/
	public Long get_tcperrrstthreshold() throws Exception {
		return this.tcperrrstthreshold;
	}

	/**
	* <pre>
	* Active half-closed client connections that are flushed because the client has closed the connection and there has been no activity on the connection.
	* </pre>
	*/
	public Long get_tcptotzombieactivehalfclosecltconnflushed() throws Exception {
		return this.tcptotzombieactivehalfclosecltconnflushed;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsynsentbadack
	* </pre>
	*/
	public Long get_tcperrsynsentbadackrate() throws Exception {
		return this.tcperrsynsentbadackrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcpwaittodata
	* </pre>
	*/
	public Long get_tcpwaittodatarate() throws Exception {
		return this.tcpwaittodatarate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrseventhretransmissions
	* </pre>
	*/
	public Long get_tcperrseventhretransmissionsrate() throws Exception {
		return this.tcperrseventhretransmissionsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrretransmit
	* </pre>
	*/
	public Long get_tcperrretransmitrate() throws Exception {
		return this.tcperrretransmitrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrfullretrasmit
	* </pre>
	*/
	public Long get_tcperrfullretrasmitrate() throws Exception {
		return this.tcperrfullretrasmitrate;
	}

	/**
	* <pre>
	* SYN packets flushed on the NetScaler because of no response from the server for three or more seconds.
	* </pre>
	*/
	public Long get_tcptotsynflush() throws Exception {
		return this.tcptotsynflush;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsixthretransmissions
	* </pre>
	*/
	public Long get_tcperrsixthretransmissionsrate() throws Exception {
		return this.tcperrsixthretransmissionsrate;
	}

	/**
	* <pre>
	* TCP packets on which the NetScaler performs a fast retransmission in response to three duplicate acknowledgements or a partial acknowledgement.  The NetScaler assumes that the packet is lost and retransmits the packet before its time-out.
	* </pre>
	*/
	public Long get_tcperrfastretransmissions() throws Exception {
		return this.tcperrfastretransmissions;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsecondretransmissions
	* </pre>
	*/
	public Long get_tcperrsecondretransmissionsrate() throws Exception {
		return this.tcperrsecondretransmissionsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotzombiepassivehalfclosecltconnflushed
	* </pre>
	*/
	public Long get_tcpzombiepassivehalfclosecltconnflushedrate() throws Exception {
		return this.tcpzombiepassivehalfclosecltconnflushedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotcltfin
	* </pre>
	*/
	public Long get_tcpcltfinrate() throws Exception {
		return this.tcpcltfinrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotsynheld
	* </pre>
	*/
	public Long get_tcpsynheldrate() throws Exception {
		return this.tcpsynheldrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrrstnonest
	* </pre>
	*/
	public Long get_tcperrrstnonestrate() throws Exception {
		return this.tcperrrstnonestrate;
	}

	/**
	* <pre>
	* Packets retransmitted by a client. This usually occurs because the acknowledgement from the NetScaler has not reached the client.
	* </pre>
	*/
	public Long get_tcperrcltretrasmit() throws Exception {
		return this.tcperrcltretrasmit;
	}

	/**
	* <pre>
	* Probes from the NetScaler to a server. The NetScaler sends a SYN packet to the server to check its availability and expects a SYN_ACK packet from the server before a specified response timeout.
	* </pre>
	*/
	public Long get_tcptotsynprobe() throws Exception {
		return this.tcptotsynprobe;
	}

	/**
	* <pre>
	* Connections closed on the NetScaler because the number of connections in the TIME_WAIT state has exceeded the default value of 7000.
	* </pre>
	*/
	public Long get_tcptotfinwaitclosed() throws Exception {
		return this.tcptotfinwaitclosed;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotzombiepassivehalfclosesrvconnflushed
	* </pre>
	*/
	public Long get_tcpzombiepassivehalfclosesrvconnflushedrate() throws Exception {
		return this.tcpzombiepassivehalfclosesrvconnflushedrate;
	}

	/**
	* <pre>
	* Incorrect ACK packets received on a connection that is in the SYN_SENT state. An incorrect ACK packet is the third packet in the three-way handshake that has an incorrect sequence number.
	* </pre>
	*/
	public Long get_tcperrsynsentbadack() throws Exception {
		return this.tcperrsynsentbadack;
	}

	/**
	* <pre>
	* SYN packets held on the NetScaler that are waiting for a server connection.
	* </pre>
	*/
	public Long get_tcptotsynheld() throws Exception {
		return this.tcptotsynheld;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrrstintimewait
	* </pre>
	*/
	public Long get_tcperrrstintimewaitrate() throws Exception {
		return this.tcperrrstintimewaitrate;
	}

	/**
	* <pre>
	* Reset packets received on a connection that is in the TIME_WAIT state. Packets cannot be transferred on a connection in the TIME_WAIT state.
	* </pre>
	*/
	public Long get_tcperrrstintimewait() throws Exception {
		return this.tcperrrstintimewait;
	}

	/**
	* <pre>
	* Packets retransmitted three times by the NetScaler.
	* </pre>
	*/
	public Long get_tcperrthirdretransmissions() throws Exception {
		return this.tcperrthirdretransmissions;
	}

	/**
	* <pre>
	* Bytes of TCP data received.
	* </pre>
	*/
	public Long get_tcptotrxbytes() throws Exception {
		return this.tcptotrxbytes;
	}

	/**
	* <pre>
	* Packets retransmitted by a server. This usually occurs because the acknowledgement from the NetScaler has not reached the server.
	* </pre>
	*/
	public Long get_tcperrsvrretrasmit() throws Exception {
		return this.tcperrsvrretrasmit;
	}

	/**
	* <pre>
	* Passive half-closed client connections that are flushed because the NetScaler has closed the connection and there has been no activity on the connection.
	* </pre>
	*/
	public Long get_tcptotzombiepassivehalfclosecltconnflushed() throws Exception {
		return this.tcptotzombiepassivehalfclosecltconnflushed;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrfastretransmissions
	* </pre>
	*/
	public Long get_tcperrfastretransmissionsrate() throws Exception {
		return this.tcperrfastretransmissionsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrclthole
	* </pre>
	*/
	public Long get_tcperrcltholerate() throws Exception {
		return this.tcperrcltholerate;
	}

	/**
	* <pre>
	* Out of order TCP packets received from a server. 
	* </pre>
	*/
	public Long get_tcperrsvroutoforder() throws Exception {
		return this.tcperrsvroutoforder;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotrxpkts
	* </pre>
	*/
	public Long get_tcprxpktsrate() throws Exception {
		return this.tcprxpktsrate;
	}

	/**
	* <pre>
	* Client connections opened by the NetScaler since startup (after three-way handshake). This counter is reset when the NetScaler is restarted.
	* </pre>
	*/
	public Long get_tcptotclientconnopened() throws Exception {
		return this.tcptotclientconnopened;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrstraypkt
	* </pre>
	*/
	public Long get_tcperrstraypktrate() throws Exception {
		return this.tcperrstraypktrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrfinretry
	* </pre>
	*/
	public Long get_tcperrfinretryrate() throws Exception {
		return this.tcperrfinretryrate;
	}

	/**
	* <pre>
	* Server connections initiated by the NetScaler since startup. This counter is reset when the NetScaler is restarted.
	* </pre>
	*/
	public Long get_tcptotserverconnopened() throws Exception {
		return this.tcptotserverconnopened;
	}

	/**
	* <pre>
	* Number of times NetScaler terminates a connection after retransmitting the packet seven times on that connection.Retrasnmission happens when recieving end doesn't acknowledges the packet.
	* </pre>
	*/
	public Long get_tcperrretransmitgiveup() throws Exception {
		return this.tcperrretransmitgiveup;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrthirdretransmissions
	* </pre>
	*/
	public Long get_tcperrthirdretransmissionsrate() throws Exception {
		return this.tcperrthirdretransmissionsrate;
	}

	/**
	* <pre>
	* SYN packets (packets used to initiate a TCP connection) received on connections that are in the TIME_WAIT state. Packets cannot be transferred on a connection in this state.
	* </pre>
	*/
	public Long get_tcpwaittosyn() throws Exception {
		return this.tcpwaittosyn;
	}

	/**
	* <pre>
	* SYN packets dropped because of network congestion.
	* </pre>
	*/
	public Long get_tcperrsyndroppedcongestion() throws Exception {
		return this.tcperrsyndroppedcongestion;
	}

	/**
	* <pre>
	* Connections that were timed out by the NetScaler because of not receiving the ACK packet after retransmitting the FIN packet four times.
	* </pre>
	*/
	public Long get_tcperrfingiveup() throws Exception {
		return this.tcperrfingiveup;
	}

	/**
	* <pre>
	* FIN packets received from the server.
	* </pre>
	*/
	public Long get_tcptotsvrfin() throws Exception {
		return this.tcptotsvrfin;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrcltretrasmit
	* </pre>
	*/
	public Long get_tcperrcltretrasmitrate() throws Exception {
		return this.tcperrcltretrasmitrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrcookiepktmssreject
	* </pre>
	*/
	public Long get_tcperrcookiepktmssrejectrate() throws Exception {
		return this.tcperrcookiepktmssrejectrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsvrretrasmit
	* </pre>
	*/
	public Long get_tcperrsvrretrasmitrate() throws Exception {
		return this.tcperrsvrretrasmitrate;
	}

	/**
	* <pre>
	* Server connections in the Closing state, which indicates that the connection termination process has initiated but is not complete.
	* </pre>
	*/
	public Long get_tcpcurserverconnclosing() throws Exception {
		return this.tcpcurserverconnclosing;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrrst
	* </pre>
	*/
	public Long get_tcperrrstrate() throws Exception {
		return this.tcperrrstrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrfifthretransmissions
	* </pre>
	*/
	public Long get_tcperrfifthretransmissionsrate() throws Exception {
		return this.tcperrfifthretransmissionsrate;
	}

	/**
	* <pre>
	* Packets received following a connection termination request. This error is usually caused by a reordering of packets during transmission.
	* </pre>
	*/
	public Long get_tcperrdataafterfin() throws Exception {
		return this.tcperrdataafterfin;
	}

	/**
	* <pre>
	* TCP holes created on a server connection. When out of order packets are received from a server, a hole is created on the NetScaler for each group of missing packets.
	* </pre>
	*/
	public Long get_tcperrsvrhole() throws Exception {
		return this.tcperrsvrhole;
	}

	/**
	* <pre>
	* Attempts to establish a connection on the NetScaler that timed out.
	* </pre>
	*/
	public Long get_tcperrsyngiveup() throws Exception {
		return this.tcperrsyngiveup;
	}

	/**
	* <pre>
	* Packets retransmitted once by the NetScaler.
	* </pre>
	*/
	public Long get_tcperrfirstretransmissions() throws Exception {
		return this.tcperrfirstretransmissions;
	}

	/**
	* <pre>
	* Server connections that are flushed because there have been no client requests in the queue for some time.
	* </pre>
	*/
	public Long get_tcptotzombiesvrconnflushed() throws Exception {
		return this.tcptotzombiesvrconnflushed;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsynretry
	* </pre>
	*/
	public Long get_tcperrsynretryrate() throws Exception {
		return this.tcperrsynretryrate;
	}

	/**
	* <pre>
	* SYN cookie packets rejected because they contain an incorrect signature.
	* </pre>
	*/
	public Long get_tcperrcookiepktsigreject() throws Exception {
		return this.tcperrcookiepktsigreject;
	}

	/**
	* <pre>
	* Packets received that are out of the current advertised window.
	* </pre>
	*/
	public Long get_tcperroutofwindowpkts() throws Exception {
		return this.tcperroutofwindowpkts;
	}

	/**
	* <pre>
	* SYN cookie packets dropped because the sequence number specified in the packets is outside the current window.
	* </pre>
	*/
	public Long get_tcperrcookiepktseqdrop() throws Exception {
		return this.tcperrcookiepktseqdrop;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrbadstateconn
	* </pre>
	*/
	public Long get_tcperrbadstateconnrate() throws Exception {
		return this.tcperrbadstateconnrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsyndroppedcongestion
	* </pre>
	*/
	public Long get_tcperrsyndroppedcongestionrate() throws Exception {
		return this.tcperrsyndroppedcongestionrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsvrhole
	* </pre>
	*/
	public Long get_tcperrsvrholerate() throws Exception {
		return this.tcperrsvrholerate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrdataafterfin
	* </pre>
	*/
	public Long get_tcperrdataafterfinrate() throws Exception {
		return this.tcperrdataafterfinrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrcltoutoforder
	* </pre>
	*/
	public Long get_tcperrcltoutoforderrate() throws Exception {
		return this.tcperrcltoutoforderrate;
	}

	/**
	* <pre>
	* Passive half-closed server connections that are flushed because the NetScaler has closed the connection and there has been no activity on the connection.
	* </pre>
	*/
	public Long get_tcptotzombiepassivehalfclosesrvconnflushed() throws Exception {
		return this.tcptotzombiepassivehalfclosesrvconnflushed;
	}

	/**
	* <pre>
	* SYN packets received on a connection that is in the ESTABLISHED state. A SYN packet is not expected on an ESTABLISHED connection.
	* </pre>
	*/
	public Long get_tcperrsyninest() throws Exception {
		return this.tcperrsyninest;
	}

	/**
	* <pre>
	* Packets retransmitted twice by the NetScaler.
	* </pre>
	*/
	public Long get_tcperrsecondretransmissions() throws Exception {
		return this.tcperrsecondretransmissions;
	}

	/**
	* <pre>
	* Connections that are not in a valid TCP state.
	* </pre>
	*/
	public Long get_tcperrbadstateconn() throws Exception {
		return this.tcperrbadstateconn;
	}

	/**
	* <pre>
	* Spare connections available. To save time and resources in establishing another connection for a new client, the connection on the server is not closed after completing the request from the first client and is available for serving future requests.
	* </pre>
	*/
	public Long get_tcpspareconn() throws Exception {
		return this.tcpspareconn;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrretransmitgiveup
	* </pre>
	*/
	public Long get_tcperrretransmitgiveuprate() throws Exception {
		return this.tcperrretransmitgiveuprate;
	}

	/**
	* <pre>
	* TCP packets transmitted.
	* </pre>
	*/
	public Long get_tcptottxpkts() throws Exception {
		return this.tcptottxpkts;
	}

	/**
	* <pre>
	* FIN packets received from the clients.
	* </pre>
	*/
	public Long get_tcptotcltfin() throws Exception {
		return this.tcptotcltfin;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotsyn
	* </pre>
	*/
	public Long get_tcpsynrate() throws Exception {
		return this.tcpsynrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotclientconnopened
	* </pre>
	*/
	public Long get_tcpclientconnopenedrate() throws Exception {
		return this.tcpclientconnopenedrate;
	}

	/**
	* <pre>
	* Port allocations that have failed on a mapped IP address because the maximum limit of 65536 has been exceeded.
	* </pre>
	*/
	public Long get_tcperranyportfail() throws Exception {
		return this.tcperranyportfail;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcpwaittosyn
	* </pre>
	*/
	public Long get_tcpwaittosynrate() throws Exception {
		return this.tcpwaittosynrate;
	}

	/**
	* <pre>
	* Reset packets received on a connection that is not in the ESTABLISHED state.
	* </pre>
	*/
	public Long get_tcperrrstnonest() throws Exception {
		return this.tcperrrstnonest;
	}

	/**
	* <pre>
	* Port allocations that have failed on a subnet IP address or vserver IP address because the maximum limit of 65536 has been exceeded.
	* </pre>
	*/
	public Long get_tcperripportfail() throws Exception {
		return this.tcperripportfail;
	}

	/**
	* <pre>
	* Partial packet retransmits by a client or server due to congestion on the connection. This usually occurs because the window advertised by the NetScaler is not big enough to hold the full packet.
	* </pre>
	*/
	public Long get_tcperrpartialretrasmit() throws Exception {
		return this.tcperrpartialretrasmit;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotzombieactivehalfclosesvrconnflushed
	* </pre>
	*/
	public Long get_tcpzombieactivehalfclosesvrconnflushedrate() throws Exception {
		return this.tcpzombieactivehalfclosesvrconnflushedrate;
	}

	/**
	* <pre>
	* TCP holes created on a client connection. When out of order packets are received from a client, a hole is created on the NetScaler for each group of missing packets.
	* </pre>
	*/
	public Long get_tcperrclthole() throws Exception {
		return this.tcperrclthole;
	}

	/**
	* <pre>
	* Current client connections in the Established state, which indicates that data transfer can occur between the NetScaler and the client.
	* </pre>
	*/
	public Long get_tcpcurclientconnestablished() throws Exception {
		return this.tcpcurclientconnestablished;
	}

	/**
	* <pre>
	* Bytes of data received on connections that are in the TIME_WAIT state. Data cannot be transferred on a connection that is in this state.
	* </pre>
	*/
	public Long get_tcpwaittodata() throws Exception {
		return this.tcpwaittodata;
	}

	/**
	* <pre>
	* Reset packets sent to a client or a server.
	* </pre>
	*/
	public Long get_tcperrsentrst() throws Exception {
		return this.tcperrsentrst;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrsyngiveup
	* </pre>
	*/
	public Long get_tcperrsyngiveuprate() throws Exception {
		return this.tcperrsyngiveuprate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrbadchecksum
	* </pre>
	*/
	public Long get_tcperrbadchecksumrate() throws Exception {
		return this.tcperrbadchecksumrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrcookiepktseqdrop
	* </pre>
	*/
	public Long get_tcperrcookiepktseqdroprate() throws Exception {
		return this.tcperrcookiepktseqdroprate;
	}

	/**
	* <pre>
	* Packets retransmitted seven times by the NetScaler. If this fails, the NetScaler terminates the connection.
	* </pre>
	*/
	public Long get_tcperrseventhretransmissions() throws Exception {
		return this.tcperrseventhretransmissions;
	}

	/**
	* <pre>
	* Reset packets received on a connection that is out of the current TCP window.
	* </pre>
	*/
	public Long get_tcperrrstoutofwindow() throws Exception {
		return this.tcperrrstoutofwindow;
	}

	/**
	* <pre>
	* Server connections in the Opening state, which indicates that the handshakes are not yet complete.
	* </pre>
	*/
	public Long get_tcpcurserverconnopening() throws Exception {
		return this.tcpcurserverconnopening;
	}

	/**
	* <pre>
	* Active half-closed server connections that are flushed because the server has closed the connection and there has been no activity on the connection.
	* </pre>
	*/
	public Long get_tcptotzombieactivehalfclosesvrconnflushed() throws Exception {
		return this.tcptotzombieactivehalfclosesvrconnflushed;
	}

	/**
	* <pre>
	* Full packets retransmitted by the client or the server.
	* </pre>
	*/
	public Long get_tcperrfullretrasmit() throws Exception {
		return this.tcperrfullretrasmit;
	}

	/**
	* <pre>
	* Number of times TCP level client header insertion failure
	* </pre>
	*/
	public Long get_tcperrcipalloc() throws Exception {
		return this.tcperrcipalloc;
	}

	/**
	* <pre>
	* Client connections that are flushed because the client has been idle for some time.
	* </pre>
	*/
	public Long get_tcptotzombiecltconnflushed() throws Exception {
		return this.tcptotzombiecltconnflushed;
	}

	/**
	* <pre>
	* Half-opened server connections that are flushed because the three-way handshakes are not complete.
	* </pre>
	*/
	public Long get_tcptotzombiehalfopensvrconnflushed() throws Exception {
		return this.tcptotzombiehalfopensvrconnflushed;
	}

	/**
	* <pre>
	* Times the Zombie cleanup function is called. Every time a connection is flushed, it is marked for cleanup. The Zombie cleanup function clears all these connections at predefined intervals.
	* </pre>
	*/
	public Long get_pcbtotzombiecall() throws Exception {
		return this.pcbtotzombiecall;
	}

	/**
	* <pre>
	* Connections to a server currently responding to requests.
	* </pre>
	*/
	public Long get_tcpactiveserverconn() throws Exception {
		return this.tcpactiveserverconn;
	}

	/**
	* <pre>
	* SYN packets resent to a server.
	* </pre>
	*/
	public Long get_tcperrsynretry() throws Exception {
		return this.tcperrsynretry;
	}

	/**
	* <pre>
	* Bytes of TCP data transmitted.
	* </pre>
	*/
	public Long get_tcptottxbytes() throws Exception {
		return this.tcptottxbytes;
	}

	/**
	* <pre>
	* Client connections in the Closing state, which indicates that the connection termination process has initiated but is not complete.
	* </pre>
	*/
	public Long get_tcpcurclientconnclosing() throws Exception {
		return this.tcpcurclientconnclosing;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcperrrstthreshold
	* </pre>
	*/
	public Long get_tcperrrstthresholdrate() throws Exception {
		return this.tcperrrstthresholdrate;
	}

	/**
	* <pre>
	* Packets retransmitted five times by the NetScaler.
	* </pre>
	*/
	public Long get_tcperrfifthretransmissions() throws Exception {
		return this.tcperrfifthretransmissions;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotzombiehalfopencltconnflushed
	* </pre>
	*/
	public Long get_tcpzombiehalfopencltconnflushedrate() throws Exception {
		return this.tcpzombiehalfopencltconnflushedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptotzombiecltconnflushed
	* </pre>
	*/
	public Long get_tcpzombiecltconnflushedrate() throws Exception {
		return this.tcpzombiecltconnflushedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for tcptottxpkts
	* </pre>
	*/
	public Long get_tcptxpktsrate() throws Exception {
		return this.tcptxpktsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		protocoltcp_stats[] resources = new protocoltcp_stats[1];
		protocoltcp_response result = (protocoltcp_response) service.get_payload_formatter().string_to_resource(protocoltcp_response.class, response);
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
		resources[0] = result.protocoltcp;
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
	* Use this API to fetch the statistics of all protocoltcp_stats resources that are configured on netscaler.
	*/
	public static protocoltcp_stats get(nitro_service service) throws Exception{
		protocoltcp_stats obj = new protocoltcp_stats();
		protocoltcp_stats[] response = (protocoltcp_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all protocoltcp_stats resources that are configured on netscaler.
	*/
	public static protocoltcp_stats get(nitro_service service,  options option) throws Exception{
		protocoltcp_stats obj = new protocoltcp_stats();
		protocoltcp_stats[] response = (protocoltcp_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
