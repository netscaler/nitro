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

package com.citrix.netscaler.nitro.resource.stat.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ns_response extends base_response
{
	public ns_stats ns;
}

public class ns_stats extends base_resource
{
	private String clearstats;
	private Long cachemaxmemorykb;
	private Double delcmpratio;
	private Long rescpuusage;
	private Long cpuusage;
	private Long resmemusage;
	private Double comptotaldatacompressionratio;
	private Double compratio;
	private Long cacheutilizedmemorykb;
	private Long cachemaxmemoryactivekb;
	private Long cache64maxmemorykb;
	private Long cachepercentoriginbandwidthsaved;
	private Long cachetotmisses;
	private Long cachemissesrate;
	private Long cachetothits;
	private Long cachehitsrate;
	private Long sslnumcardsup;
	private Double memusagepcnt;
	private Long memuseinmb;
	private Double mgmtcpuusagepcnt;
	private Double pktcpuusagepcnt;
	private Double rescpuusagepcnt;
	private Double cpuusagepcnt;
	private String starttime;
	private String transtime;
	private String hacurstate;
	private String hacurmasterstate;
	private Long sslcards;
	private Long disk0perusage;
	private Long disk1perusage;
	private Long disk0avail;
	private Long disk1avail;
	private Long totrxmbits;
	private Long rxmbitsrate;
	private Long tottxmbits;
	private Long txmbitsrate;
	private Long tcpcurclientconn;
	private Long tcpcurclientconnestablished;
	private Long tcpcurserverconn;
	private Long tcpcurserverconnestablished;
	private Long httptotrequests;
	private Long httprequestsrate;
	private Long httptotresponses;
	private Long httpresponsesrate;
	private Long httptotrxrequestbytes;
	private Long httprxrequestbytesrate;
	private Long httptotrxresponsebytes;
	private Long httprxresponsebytesrate;
	private Long ssltottransactions;
	private Long ssltransactionsrate;
	private Long ssltotsessionhits;
	private Long sslsessionhitsrate;
	private Long appfirewallrequests;
	private Long appfirewallrequestsrate;
	private Long appfirewallresponses;
	private Long appfirewallresponsesrate;
	private Long appfirewallaborts;
	private Long appfirewallabortsrate;
	private Long appfirewallredirects;
	private Long appfirewallredirectsrate;
	private Long misccounter0;
	private Long misccounter1;
	private Long numcpus;

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
	* Rate (/s) counter for cachetothits
	* </pre>
	*/
	public Long get_cachehitsrate() throws Exception {
		return this.cachehitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for appfirewallredirects
	* </pre>
	*/
	public Long get_appfirewallredirectsrate() throws Exception {
		return this.appfirewallredirectsrate;
	}

	/**
	* <pre>
	* Number of SSL transactions on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltottransactions() throws Exception {
		return this.ssltottransactions;
	}

	/**
	* <pre>
	* Number of SSL cards that are UP. If the number of cards UP is lower than a threshold, a failover is initiated.
	* </pre>
	*/
	public Long get_sslnumcardsup() throws Exception {
		return this.sslnumcardsup;
	}

	/**
	* <pre>
	* Time when the last master state transition occurred. You can use this statistic for debugging.
	* </pre>
	*/
	public String get_transtime() throws Exception {
		return this.transtime;
	}

	/**
	* <pre>
	* Amount of memory the integrated cache is currently using.
	* </pre>
	*/
	public Long get_cacheutilizedmemorykb() throws Exception {
		return this.cacheutilizedmemorykb;
	}

	/**
	* <pre>
	* Indicates the high availability state of the node. Possible values are: 
STAYSECONDARY – Indicates that the selected node remains the secondary node in a high availability setup. In this case a forced failover does not change the state but, instead, returns an appropriate error message. This is a configured value and not a statistic.
PRIMARY – Indicates that the selected node is the primary node in a high availability setup. 
SECONDARY – Indicates that the selected node is the secondary node in a high availability setup. 
CLAIMING – Indicates that the secondary node is in the process of taking over as the primary node. This is the intermediate state in the transition of the secondary node to primary status. 
FORCE CHANGE - Indicates that the secondary node is forcibly changing its status to primary due to a forced failover issued on the secondary node. 

	* </pre>
	*/
	public String get_hacurmasterstate() throws Exception {
		return this.hacurmasterstate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotrxrequestbytes
	* </pre>
	*/
	public Long get_httprxrequestbytesrate() throws Exception {
		return this.httprxrequestbytesrate;
	}

	/**
	* <pre>
	* Total number of bytes of HTTP response data received.
	* </pre>
	*/
	public Long get_httptotrxresponsebytes() throws Exception {
		return this.httptotrxresponsebytes;
	}

	/**
	* <pre>
	* Used space in /var partition of the disk, as a percentage. This is a critical counter. You can configure /var Used (%) by using the Set snmp alarm DISK-USAGE-HIGH command.
	* </pre>
	*/
	public Long get_disk1perusage() throws Exception {
		return this.disk1perusage;
	}

	/**
	* <pre>
	* Average CPU utilization percentage. Not applicable for a single-CPU system.
	* </pre>
	*/
	public Double get_rescpuusagepcnt() throws Exception {
		return this.rescpuusagepcnt;
	}

	/**
	* <pre>
	* Incomplete HTTP/HTTPS requests aborted by the client before the Application Firewall could finish processing them.
	* </pre>
	*/
	public Long get_appfirewallaborts() throws Exception {
		return this.appfirewallaborts;
	}

	/**
	* <pre>
	* Available space in /var partition of the hard disk.
	* </pre>
	*/
	public Long get_disk1avail() throws Exception {
		return this.disk1avail;
	}

	/**
	* <pre>
	* Rate (/s) counter for appfirewallresponses
	* </pre>
	*/
	public Long get_appfirewallresponsesrate() throws Exception {
		return this.appfirewallresponsesrate;
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
	* Ratio of compressible data received to compressed data transmitted.If this ratio is one (uncmp:1.0) that means compression is disabled or we are not able to compress even a single compressible packet.
	* </pre>
	*/
	public Double get_delcmpratio() throws Exception {
		return this.delcmpratio;
	}

	/**
	* <pre>
	* HTTP/HTTPS responses sent by your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallresponses() throws Exception {
		return this.appfirewallresponses;
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
	* Server connections, including connections in the Opening, Established, and Closing state.
	* </pre>
	*/
	public Long get_tcpcurserverconn() throws Exception {
		return this.tcpcurserverconn;
	}

	/**
	* <pre>
	* Shows average CPU utilization percentage if more than 1 CPU is present.
	* </pre>
	*/
	public Long get_rescpuusage() throws Exception {
		return this.rescpuusage;
	}

	/**
	* <pre>
	* Ratio of total HTTP data received to total HTTP data transmitted.
	* </pre>
	*/
	public Double get_comptotaldatacompressionratio() throws Exception {
		return this.comptotaldatacompressionratio;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests sent to your protected web servers via the Application Firewall.
	* </pre>
	*/
	public Long get_appfirewallrequests() throws Exception {
		return this.appfirewallrequests;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotrxresponsebytes
	* </pre>
	*/
	public Long get_httprxresponsebytesrate() throws Exception {
		return this.httprxresponsebytesrate;
	}

	/**
	* <pre>
	* Used space in /flash partition of the disk, as a percentage. This is a critical counter.
You can configure /flash Used (%) by using the Set snmp alarm DISK-USAGE-HIGH command.

	* </pre>
	*/
	public Long get_disk0perusage() throws Exception {
		return this.disk0perusage;
	}

	/**
	* <pre>
	* Rate (/s) counter for appfirewallaborts
	* </pre>
	*/
	public Long get_appfirewallabortsrate() throws Exception {
		return this.appfirewallabortsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for appfirewallrequests
	* </pre>
	*/
	public Long get_appfirewallrequestsrate() throws Exception {
		return this.appfirewallrequestsrate;
	}

	/**
	* <pre>
	* Number of megabytes received by the NetScaler appliance.
	* </pre>
	*/
	public Long get_totrxmbits() throws Exception {
		return this.totrxmbits;
	}

	/**
	* <pre>
	* Number of megabytes transmitted by the NetScaler appliance.
	* </pre>
	*/
	public Long get_tottxmbits() throws Exception {
		return this.tottxmbits;
	}

	/**
	* <pre>
	* Number of SSL session reuse hits on the NetScaler appliance.
	* </pre>
	*/
	public Long get_ssltotsessionhits() throws Exception {
		return this.ssltotsessionhits;
	}

	/**
	* <pre>
	* Rate (/s) counter for cachetotmisses
	* </pre>
	*/
	public Long get_cachemissesrate() throws Exception {
		return this.cachemissesrate;
	}

	/**
	* <pre>
	* Largest amount of memory the NetScaler can dedicate to caching, up to 50% of available memory. A 0 value disables caching, but the caching module continues to run. 
	* </pre>
	*/
	public Long get_cachemaxmemorykb() throws Exception {
		return this.cachemaxmemorykb;
	}

	/**
	* <pre>
	* HTTP/HTTPS requests redirected by the Application Firewall to a different Web page or web server. (HTTP 302)
	* </pre>
	*/
	public Long get_appfirewallredirects() throws Exception {
		return this.appfirewallredirects;
	}

	/**
	* <pre>
	* Management CPU utilization percentage.
	* </pre>
	*/
	public Double get_mgmtcpuusagepcnt() throws Exception {
		return this.mgmtcpuusagepcnt;
	}

	/**
	* <pre>
	* CPU utilization percentage.
	* </pre>
	*/
	public Long get_cpuusage() throws Exception {
		return this.cpuusage;
	}

	/**
	* <pre>
	* Total number of HTTP requests received.
	* </pre>
	*/
	public Long get_httptotrequests() throws Exception {
		return this.httptotrequests;
	}

	/**
	* <pre>
	* Total number of HTTP responses sent.
	* </pre>
	*/
	public Long get_httptotresponses() throws Exception {
		return this.httptotresponses;
	}

	/**
	* <pre>
	* Responses served from the integrated cache. These responses match a policy with a CACHE action.
	* </pre>
	*/
	public Long get_cachetothits() throws Exception {
		return this.cachetothits;
	}

	/**
	* <pre>
	* Miscellaneous Counter 1.
	* </pre>
	*/
	public Long get_misccounter1() throws Exception {
		return this.misccounter1;
	}

	/**
	* <pre>
	* The number of CPUs on the NetScaler appliance.
	* </pre>
	*/
	public Long get_numcpus() throws Exception {
		return this.numcpus;
	}

	/**
	* <pre>
	* Average CPU utilization percentage for all packet engines excluding management PE.
	* </pre>
	*/
	public Double get_pktcpuusagepcnt() throws Exception {
		return this.pktcpuusagepcnt;
	}

	/**
	* <pre>
	* Rate (/s) counter for ssltottransactions
	* </pre>
	*/
	public Long get_ssltransactionsrate() throws Exception {
		return this.ssltransactionsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotrequests
	* </pre>
	*/
	public Long get_httprequestsrate() throws Exception {
		return this.httprequestsrate;
	}

	/**
	* <pre>
	* Currently active value of maximum memory
	* </pre>
	*/
	public Long get_cachemaxmemoryactivekb() throws Exception {
		return this.cachemaxmemoryactivekb;
	}

	/**
	* <pre>
	* Rate (/s) counter for httptotresponses
	* </pre>
	*/
	public Long get_httpresponsesrate() throws Exception {
		return this.httpresponsesrate;
	}

	/**
	* <pre>
	* Ratio of the compressible data received from the server to the compressed data sent to the client.
	* </pre>
	*/
	public Double get_compratio() throws Exception {
		return this.compratio;
	}

	/**
	* <pre>
	* Main memory currently in use, in megabytes.
	* </pre>
	*/
	public Long get_memuseinmb() throws Exception {
		return this.memuseinmb;
	}

	/**
	* <pre>
	* Available space in /flash partition of the hard disk.
	* </pre>
	*/
	public Long get_disk0avail() throws Exception {
		return this.disk0avail;
	}

	/**
	* <pre>
	* Rate (/s) counter for tottxmbits
	* </pre>
	*/
	public Long get_txmbitsrate() throws Exception {
		return this.txmbitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for ssltotsessionhits
	* </pre>
	*/
	public Long get_sslsessionhitsrate() throws Exception {
		return this.sslsessionhitsrate;
	}

	/**
	* <pre>
	* Percentage of memory utilization on NetScaler.
	* </pre>
	*/
	public Long get_resmemusage() throws Exception {
		return this.resmemusage;
	}

	/**
	* <pre>
	* Number of SSL crypto cards present on the NetScaler appliance.
	* </pre>
	*/
	public Long get_sslcards() throws Exception {
		return this.sslcards;
	}

	/**
	* <pre>
	* State of the HA node, based on its health, in a high availability setup. Possible values are: 
UP – Indicates that the node is accessible and can function as either a primary or secondary node.
DISABLED – Indicates that the high availability status of the node has been manually disabled. Synchronization and propagation cannot take place between the peer nodes.
INIT – Indicates that the node is in the process of becoming part of the high availability configuration. 
PARTIALFAIL – Indicates that one of the high availability monitored interfaces has failed because of a card or link failure. This state triggers a failover.
COMPLETEFAIL – Indicates that all the interfaces of the node are unusable, because the interfaces on which high availability monitoring is enabled are not connected or are manually disabled. This state triggers a failover.
DUMB – Indicates that the node is in listening mode. It does not participate in high availability transitions or transfer configuration from the peer node. This is a configured value, not a statistic.
PARTIALFAILSSL – Indicates that the SSL card has failed. This state triggers a failover.
ROUTEMONITORFAIL – Indicates that the route monitor has failed. This state triggers a failover.

	* </pre>
	*/
	public String get_hacurstate() throws Exception {
		return this.hacurstate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totrxmbits
	* </pre>
	*/
	public Long get_rxmbitsrate() throws Exception {
		return this.rxmbitsrate;
	}

	/**
	* <pre>
	* Largest amount of memory the NetScaler can dedicate to caching, up to 50% of available memory. A 0 value disables caching, but the caching module continues to run. 
	* </pre>
	*/
	public Long get_cache64maxmemorykb() throws Exception {
		return this.cache64maxmemorykb;
	}

	/**
	* <pre>
	* Time when the NetScaler appliance was last started.
	* </pre>
	*/
	public String get_starttime() throws Exception {
		return this.starttime;
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
	* CPU utilization percentage.
	* </pre>
	*/
	public Double get_cpuusagepcnt() throws Exception {
		return this.cpuusagepcnt;
	}

	/**
	* <pre>
	* Percentage of origin bandwidth saved, expressed as number of bytes served from the integrated cache divided by all bytes served. The assumption is that all compression is done in the NetScaler.
	* </pre>
	*/
	public Long get_cachepercentoriginbandwidthsaved() throws Exception {
		return this.cachepercentoriginbandwidthsaved;
	}

	/**
	* <pre>
	* Miscellaneous Counter 0.
	* </pre>
	*/
	public Long get_misccounter0() throws Exception {
		return this.misccounter0;
	}

	/**
	* <pre>
	* Intercepted HTTP requests requiring fetches from origin server.
	* </pre>
	*/
	public Long get_cachetotmisses() throws Exception {
		return this.cachetotmisses;
	}

	/**
	* <pre>
	* Total number of bytes of HTTP request data received.
	* </pre>
	*/
	public Long get_httptotrxrequestbytes() throws Exception {
		return this.httptotrxrequestbytes;
	}

	/**
	* <pre>
	* Percentage of memory utilization on NetScaler.
	* </pre>
	*/
	public Double get_memusagepcnt() throws Exception {
		return this.memusagepcnt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ns_stats[] resources = new ns_stats[1];
		ns_response result = (ns_response) service.get_payload_formatter().string_to_resource(ns_response.class, response);
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
		resources[0] = result.ns;
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
	* Use this API to fetch the statistics of all ns_stats resources that are configured on netscaler.
	*/
	public static ns_stats get(nitro_service service) throws Exception{
		ns_stats obj = new ns_stats();
		ns_stats[] response = (ns_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all ns_stats resources that are configured on netscaler.
	*/
	public static ns_stats get(nitro_service service,  options option) throws Exception{
		ns_stats obj = new ns_stats();
		ns_stats[] response = (ns_stats[])obj.stat_resources(service,option);
		return response[0];
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
