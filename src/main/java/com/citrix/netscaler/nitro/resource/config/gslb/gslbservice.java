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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbservice_response extends base_response
{
	public gslbservice[] gslbservice;
}
/**
* Configuration for GSLB service resource.
*/

public class gslbservice extends base_resource
{
	private String servicename;
	private String cnameentry;
	private String ip;
	private String servername;
	private String servicetype;
	private Integer port;
	private String publicip;
	private Integer publicport;
	private Long maxclient;
	private String healthmonitor;
	private String sitename;
	private String state;
	private String cip;
	private String cipheader;
	private String sitepersistence;
	private Long cookietimeout;
	private String siteprefix;
	private Long clttimeout;
	private Long svrtimeout;
	private Long maxbandwidth;
	private String downstateflush;
	private Long maxaaausers;
	private Long monthreshold;
	private Long hashid;
	private String comment;
	private String appflowlog;
	private String ipaddress;
	private String viewname;
	private String viewip;
	private Long weight;
	private String monitor_name_svc;
	private String newname;

	//------- Read only Parameter ---------;

	private String gslb;
	private String svrstate;
	private String svreffgslbstate;
	private Integer gslbthreshold;
	private Integer gslbsvcstats;
	private String monstate;
	private String preferredlocation;
	private String monitor_state;
	private Long __count;

	/**
	* <pre>
	* Name for the GSLB service. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the GSLB service is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my gslbsvc" or 'my gslbsvc').<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* Name for the GSLB service. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Can be changed after the GSLB service is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my gslbsvc" or 'my gslbsvc').<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* Canonical name of the GSLB service. Used in CNAME-based GSLB.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cnameentry(String cnameentry) throws Exception{
		this.cnameentry = cnameentry;
	}

	/**
	* <pre>
	* Canonical name of the GSLB service. Used in CNAME-based GSLB.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cnameentry() throws Exception {
		return this.cnameentry;
	}

	/**
	* <pre>
	* IP address for the GSLB service. Should represent a load balancing, content switching, or VPN virtual server on the NetScaler appliance, or the IP address of another load balancing device.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ip(String ip) throws Exception{
		this.ip = ip;
	}

	/**
	* <pre>
	* IP address for the GSLB service. Should represent a load balancing, content switching, or VPN virtual server on the NetScaler appliance, or the IP address of another load balancing device.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* Name of the server hosting the GSLB service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* Name of the server hosting the GSLB service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* Type of service to create.<br> Default value: NSSVC_SERVICE_UNKNOWN<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, ANY, SIP_UDP, RADIUS, RDP, RTSP, MYSQL, MSSQL
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* Type of service to create.<br> Default value: NSSVC_SERVICE_UNKNOWN<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, ANY, SIP_UDP, RADIUS, RDP, RTSP, MYSQL, MSSQL
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* Port on which the load balancing entity represented by this GSLB service listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Port on which the load balancing entity represented by this GSLB service listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Port on which the load balancing entity represented by this GSLB service listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The public IP address that a NAT device translates to the GSLB service's private IP address. Optional.
	* </pre>
	*/
	public void set_publicip(String publicip) throws Exception{
		this.publicip = publicip;
	}

	/**
	* <pre>
	* The public IP address that a NAT device translates to the GSLB service's private IP address. Optional.
	* </pre>
	*/
	public String get_publicip() throws Exception {
		return this.publicip;
	}

	/**
	* <pre>
	* The public port associated with the GSLB service's public IP address. The port is mapped to the service's private port number. Applicable to the local GSLB service. Optional.
	* </pre>
	*/
	public void set_publicport(int publicport) throws Exception {
		this.publicport = new Integer(publicport);
	}

	/**
	* <pre>
	* The public port associated with the GSLB service's public IP address. The port is mapped to the service's private port number. Applicable to the local GSLB service. Optional.
	* </pre>
	*/
	public void set_publicport(Integer publicport) throws Exception{
		this.publicport = publicport;
	}

	/**
	* <pre>
	* The public port associated with the GSLB service's public IP address. The port is mapped to the service's private port number. Applicable to the local GSLB service. Optional.
	* </pre>
	*/
	public Integer get_publicport() throws Exception {
		return this.publicport;
	}

	/**
	* <pre>
	* The maximum number of open connections that the service can support at any given time. A GSLB service whose connection count reaches the maximum is not considered when a GSLB decision is made, until the connection count drops below the maximum.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxclient(long maxclient) throws Exception {
		this.maxclient = new Long(maxclient);
	}

	/**
	* <pre>
	* The maximum number of open connections that the service can support at any given time. A GSLB service whose connection count reaches the maximum is not considered when a GSLB decision is made, until the connection count drops below the maximum.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxclient(Long maxclient) throws Exception{
		this.maxclient = maxclient;
	}

	/**
	* <pre>
	* The maximum number of open connections that the service can support at any given time. A GSLB service whose connection count reaches the maximum is not considered when a GSLB decision is made, until the connection count drops below the maximum.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_maxclient() throws Exception {
		return this.maxclient;
	}

	/**
	* <pre>
	* Monitor the health of the GSLB service.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_healthmonitor(String healthmonitor) throws Exception{
		this.healthmonitor = healthmonitor;
	}

	/**
	* <pre>
	* Monitor the health of the GSLB service.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_healthmonitor() throws Exception {
		return this.healthmonitor;
	}

	/**
	* <pre>
	* Name of the GSLB site to which the service belongs.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sitename(String sitename) throws Exception{
		this.sitename = sitename;
	}

	/**
	* <pre>
	* Name of the GSLB site to which the service belongs.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sitename() throws Exception {
		return this.sitename;
	}

	/**
	* <pre>
	* Enable or disable the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enable or disable the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* In the request that is forwarded to the GSLB service, insert a header that stores the client's IP address. Client IP header insertion is used in connection-proxy based site persistence.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cip(String cip) throws Exception{
		this.cip = cip;
	}

	/**
	* <pre>
	* In the request that is forwarded to the GSLB service, insert a header that stores the client's IP address. Client IP header insertion is used in connection-proxy based site persistence.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cip() throws Exception {
		return this.cip;
	}

	/**
	* <pre>
	* Name for the HTTP header that stores the client's IP address. Used with the Client IP option. If client IP header insertion is enabled on the service and a name is not specified for the header, the NetScaler appliance uses the name specified by the cipHeader parameter in the set ns param command or, in the GUI, the Client IP Header parameter in the Configure HTTP Parameters dialog box.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cipheader(String cipheader) throws Exception{
		this.cipheader = cipheader;
	}

	/**
	* <pre>
	* Name for the HTTP header that stores the client's IP address. Used with the Client IP option. If client IP header insertion is enabled on the service and a name is not specified for the header, the NetScaler appliance uses the name specified by the cipHeader parameter in the set ns param command or, in the GUI, the Client IP Header parameter in the Configure HTTP Parameters dialog box.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cipheader() throws Exception {
		return this.cipheader;
	}

	/**
	* <pre>
	* Use cookie-based site persistence. Applicable only to HTTP and SSL GSLB services.<br> Possible values = ConnectionProxy, HTTPRedirect, NONE
	* </pre>
	*/
	public void set_sitepersistence(String sitepersistence) throws Exception{
		this.sitepersistence = sitepersistence;
	}

	/**
	* <pre>
	* Use cookie-based site persistence. Applicable only to HTTP and SSL GSLB services.<br> Possible values = ConnectionProxy, HTTPRedirect, NONE
	* </pre>
	*/
	public String get_sitepersistence() throws Exception {
		return this.sitepersistence;
	}

	/**
	* <pre>
	* Timeout value, in minutes, for the cookie, when cookie based site persistence is enabled.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cookietimeout(long cookietimeout) throws Exception {
		this.cookietimeout = new Long(cookietimeout);
	}

	/**
	* <pre>
	* Timeout value, in minutes, for the cookie, when cookie based site persistence is enabled.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cookietimeout(Long cookietimeout) throws Exception{
		this.cookietimeout = cookietimeout;
	}

	/**
	* <pre>
	* Timeout value, in minutes, for the cookie, when cookie based site persistence is enabled.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_cookietimeout() throws Exception {
		return this.cookietimeout;
	}

	/**
	* <pre>
	* The site's prefix string. When the service is bound to a GSLB virtual server, a GSLB site domain is generated internally for each bound service-domain pair by concatenating the site prefix of the service and the name of the domain. If the special string NONE is specified, the site-prefix string is unset. When implementing HTTP redirect site persistence, the NetScaler appliance redirects GSLB requests to GSLB services by using their site domains.
	* </pre>
	*/
	public void set_siteprefix(String siteprefix) throws Exception{
		this.siteprefix = siteprefix;
	}

	/**
	* <pre>
	* The site's prefix string. When the service is bound to a GSLB virtual server, a GSLB site domain is generated internally for each bound service-domain pair by concatenating the site prefix of the service and the name of the domain. If the special string NONE is specified, the site-prefix string is unset. When implementing HTTP redirect site persistence, the NetScaler appliance redirects GSLB requests to GSLB services by using their site domains.
	* </pre>
	*/
	public String get_siteprefix() throws Exception {
		return this.siteprefix;
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a client connection is terminated. Applicable if connection proxy based site persistence is used.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a client connection is terminated. Applicable if connection proxy based site persistence is used.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a client connection is terminated. Applicable if connection proxy based site persistence is used.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a server connection is terminated. Applicable if connection proxy based site persistence is used.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_svrtimeout(long svrtimeout) throws Exception {
		this.svrtimeout = new Long(svrtimeout);
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a server connection is terminated. Applicable if connection proxy based site persistence is used.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_svrtimeout(Long svrtimeout) throws Exception{
		this.svrtimeout = svrtimeout;
	}

	/**
	* <pre>
	* Idle time, in seconds, after which a server connection is terminated. Applicable if connection proxy based site persistence is used.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_svrtimeout() throws Exception {
		return this.svrtimeout;
	}

	/**
	* <pre>
	* Integer specifying the maximum bandwidth allowed for the service. A GSLB service whose bandwidth reaches the maximum is not considered when a GSLB decision is made, until its bandwidth consumption drops below the maximum.
	* </pre>
	*/
	public void set_maxbandwidth(long maxbandwidth) throws Exception {
		this.maxbandwidth = new Long(maxbandwidth);
	}

	/**
	* <pre>
	* Integer specifying the maximum bandwidth allowed for the service. A GSLB service whose bandwidth reaches the maximum is not considered when a GSLB decision is made, until its bandwidth consumption drops below the maximum.
	* </pre>
	*/
	public void set_maxbandwidth(Long maxbandwidth) throws Exception{
		this.maxbandwidth = maxbandwidth;
	}

	/**
	* <pre>
	* Integer specifying the maximum bandwidth allowed for the service. A GSLB service whose bandwidth reaches the maximum is not considered when a GSLB decision is made, until its bandwidth consumption drops below the maximum.
	* </pre>
	*/
	public Long get_maxbandwidth() throws Exception {
		return this.maxbandwidth;
	}

	/**
	* <pre>
	* Flush all active transactions associated with the GSLB service when its state transitions from UP to DOWN. Do not enable this option for services that must complete their transactions. Applicable if connection proxy based site persistence is used.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Flush all active transactions associated with the GSLB service when its state transitions from UP to DOWN. Do not enable this option for services that must complete their transactions. Applicable if connection proxy based site persistence is used.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* Maximum number of SSL VPN users that can be logged on concurrently to the VPN virtual server that is represented by this GSLB service. A GSLB service whose user count reaches the maximum is not considered when a GSLB decision is made, until the count drops below the maximum.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxaaausers(long maxaaausers) throws Exception {
		this.maxaaausers = new Long(maxaaausers);
	}

	/**
	* <pre>
	* Maximum number of SSL VPN users that can be logged on concurrently to the VPN virtual server that is represented by this GSLB service. A GSLB service whose user count reaches the maximum is not considered when a GSLB decision is made, until the count drops below the maximum.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxaaausers(Long maxaaausers) throws Exception{
		this.maxaaausers = maxaaausers;
	}

	/**
	* <pre>
	* Maximum number of SSL VPN users that can be logged on concurrently to the VPN virtual server that is represented by this GSLB service. A GSLB service whose user count reaches the maximum is not considered when a GSLB decision is made, until the count drops below the maximum.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxaaausers() throws Exception {
		return this.maxaaausers;
	}

	/**
	* <pre>
	* Monitoring threshold value for the GSLB service. If the sum of the weights of the monitors that are bound to this GSLB service and are in the UP state is not equal to or greater than this threshold value, the service is marked as DOWN.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_monthreshold(long monthreshold) throws Exception {
		this.monthreshold = new Long(monthreshold);
	}

	/**
	* <pre>
	* Monitoring threshold value for the GSLB service. If the sum of the weights of the monitors that are bound to this GSLB service and are in the UP state is not equal to or greater than this threshold value, the service is marked as DOWN.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_monthreshold(Long monthreshold) throws Exception{
		this.monthreshold = monthreshold;
	}

	/**
	* <pre>
	* Monitoring threshold value for the GSLB service. If the sum of the weights of the monitors that are bound to this GSLB service and are in the UP state is not equal to or greater than this threshold value, the service is marked as DOWN.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_monthreshold() throws Exception {
		return this.monthreshold;
	}

	/**
	* <pre>
	* Unique hash identifier for the GSLB service, used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(long hashid) throws Exception {
		this.hashid = new Long(hashid);
	}

	/**
	* <pre>
	* Unique hash identifier for the GSLB service, used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(Long hashid) throws Exception{
		this.hashid = hashid;
	}

	/**
	* <pre>
	* Unique hash identifier for the GSLB service, used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_hashid() throws Exception {
		return this.hashid;
	}

	/**
	* <pre>
	* Any comments that you might want to associate with the GSLB service.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments that you might want to associate with the GSLB service.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Enable logging appflow flow information.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowlog(String appflowlog) throws Exception{
		this.appflowlog = appflowlog;
	}

	/**
	* <pre>
	* Enable logging appflow flow information.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowlog() throws Exception {
		return this.appflowlog;
	}

	/**
	* <pre>
	* The new IP address of the service.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The new IP address of the service.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Name of the DNS view of the service. A DNS view is used in global server load balancing (GSLB) to return a predetermined IP address to a specific group of clients, which are identified by using a DNS policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_viewname(String viewname) throws Exception{
		this.viewname = viewname;
	}

	/**
	* <pre>
	* Name of the DNS view of the service. A DNS view is used in global server load balancing (GSLB) to return a predetermined IP address to a specific group of clients, which are identified by using a DNS policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_viewname() throws Exception {
		return this.viewname;
	}

	/**
	* <pre>
	* IP address to be used for the given view.
	* </pre>
	*/
	public void set_viewip(String viewip) throws Exception{
		this.viewip = viewip;
	}

	/**
	* <pre>
	* IP address to be used for the given view.
	* </pre>
	*/
	public String get_viewip() throws Exception {
		return this.viewip;
	}

	/**
	* <pre>
	* Weight to assign to the monitor-service binding. A larger number specifies a greater weight. Contributes to the monitoring threshold, which determines the state of the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Weight to assign to the monitor-service binding. A larger number specifies a greater weight. Contributes to the monitoring threshold, which determines the state of the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Weight to assign to the monitor-service binding. A larger number specifies a greater weight. Contributes to the monitoring threshold, which determines the state of the service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* Name of the monitor to bind to the service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitor_name_svc(String monitor_name_svc) throws Exception{
		this.monitor_name_svc = monitor_name_svc;
	}

	/**
	* <pre>
	* Name of the monitor to bind to the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitor_name_svc() throws Exception {
		return this.monitor_name_svc;
	}

	/**
	* <pre>
	* New name for the GSLB service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the GSLB service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* .<br> Default value: GSLB<br> Possible values = REMOTE, LOCAL
	* </pre>
	*/
	public String get_gslb() throws Exception {
		return this.gslb;
	}

	/**
	* <pre>
	* Server state.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_svrstate() throws Exception {
		return this.svrstate;
	}

	/**
	* <pre>
	* Effective state of the gslb svc.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_svreffgslbstate() throws Exception {
		return this.svreffgslbstate;
	}

	/**
	* <pre>
	* Indicates if gslb svc has reached threshold.
	* </pre>
	*/
	public Integer get_gslbthreshold() throws Exception {
		return this.gslbthreshold;
	}

	/**
	* <pre>
	* Indicates if gslb svc has stats of the primary or the whole chain.
	* </pre>
	*/
	public Integer get_gslbsvcstats() throws Exception {
		return this.gslbsvcstats;
	}

	/**
	* <pre>
	* State of the monitor bound to gslb service.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_monstate() throws Exception {
		return this.monstate;
	}

	/**
	* <pre>
	* Prefered location.
	* </pre>
	*/
	public String get_preferredlocation() throws Exception {
		return this.preferredlocation;
	}

	/**
	* <pre>
	* The running state of the monitor on this service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_monitor_state() throws Exception {
		return this.monitor_state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbservice_response result = (gslbservice_response) service.get_payload_formatter().string_to_resource(gslbservice_response.class, response);
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
		return result.gslbservice;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicename;
	}

	/**
	* Use this API to add gslbservice.
	*/
	public static base_response add(nitro_service client, gslbservice resource) throws Exception {
		gslbservice addresource = new gslbservice();
		addresource.servicename = resource.servicename;
		addresource.cnameentry = resource.cnameentry;
		addresource.ip = resource.ip;
		addresource.servername = resource.servername;
		addresource.servicetype = resource.servicetype;
		addresource.port = resource.port;
		addresource.publicip = resource.publicip;
		addresource.publicport = resource.publicport;
		addresource.maxclient = resource.maxclient;
		addresource.healthmonitor = resource.healthmonitor;
		addresource.sitename = resource.sitename;
		addresource.state = resource.state;
		addresource.cip = resource.cip;
		addresource.cipheader = resource.cipheader;
		addresource.sitepersistence = resource.sitepersistence;
		addresource.cookietimeout = resource.cookietimeout;
		addresource.siteprefix = resource.siteprefix;
		addresource.clttimeout = resource.clttimeout;
		addresource.svrtimeout = resource.svrtimeout;
		addresource.maxbandwidth = resource.maxbandwidth;
		addresource.downstateflush = resource.downstateflush;
		addresource.maxaaausers = resource.maxaaausers;
		addresource.monthreshold = resource.monthreshold;
		addresource.hashid = resource.hashid;
		addresource.comment = resource.comment;
		addresource.appflowlog = resource.appflowlog;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add gslbservice resources.
	*/
	public static base_responses add(nitro_service client, gslbservice resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbservice addresources[] = new gslbservice[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new gslbservice();
				addresources[i].servicename = resources[i].servicename;
				addresources[i].cnameentry = resources[i].cnameentry;
				addresources[i].ip = resources[i].ip;
				addresources[i].servername = resources[i].servername;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].port = resources[i].port;
				addresources[i].publicip = resources[i].publicip;
				addresources[i].publicport = resources[i].publicport;
				addresources[i].maxclient = resources[i].maxclient;
				addresources[i].healthmonitor = resources[i].healthmonitor;
				addresources[i].sitename = resources[i].sitename;
				addresources[i].state = resources[i].state;
				addresources[i].cip = resources[i].cip;
				addresources[i].cipheader = resources[i].cipheader;
				addresources[i].sitepersistence = resources[i].sitepersistence;
				addresources[i].cookietimeout = resources[i].cookietimeout;
				addresources[i].siteprefix = resources[i].siteprefix;
				addresources[i].clttimeout = resources[i].clttimeout;
				addresources[i].svrtimeout = resources[i].svrtimeout;
				addresources[i].maxbandwidth = resources[i].maxbandwidth;
				addresources[i].downstateflush = resources[i].downstateflush;
				addresources[i].maxaaausers = resources[i].maxaaausers;
				addresources[i].monthreshold = resources[i].monthreshold;
				addresources[i].hashid = resources[i].hashid;
				addresources[i].comment = resources[i].comment;
				addresources[i].appflowlog = resources[i].appflowlog;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete gslbservice of given name.
	*/
	public static base_response delete(nitro_service client, String servicename) throws Exception {
		gslbservice deleteresource = new gslbservice();
		deleteresource.servicename = servicename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete gslbservice.
	*/
	public static base_response delete(nitro_service client, gslbservice resource) throws Exception {
		gslbservice deleteresource = new gslbservice();
		deleteresource.servicename = resource.servicename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete gslbservice resources of given names.
	*/
	public static base_responses delete(nitro_service client, String servicename[]) throws Exception {
		base_responses result = null;
		if (servicename != null && servicename.length > 0) {
			gslbservice deleteresources[] = new gslbservice[servicename.length];
			for (int i=0;i<servicename.length;i++){
				deleteresources[i] = new gslbservice();
				deleteresources[i].servicename = servicename[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete gslbservice resources.
	*/
	public static base_responses delete(nitro_service client, gslbservice resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbservice deleteresources[] = new gslbservice[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new gslbservice();
				deleteresources[i].servicename = resources[i].servicename;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update gslbservice.
	*/
	public static base_response update(nitro_service client, gslbservice resource) throws Exception {
		gslbservice updateresource = new gslbservice();
		updateresource.servicename = resource.servicename;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.publicip = resource.publicip;
		updateresource.publicport = resource.publicport;
		updateresource.cip = resource.cip;
		updateresource.cipheader = resource.cipheader;
		updateresource.sitepersistence = resource.sitepersistence;
		updateresource.siteprefix = resource.siteprefix;
		updateresource.maxclient = resource.maxclient;
		updateresource.healthmonitor = resource.healthmonitor;
		updateresource.maxbandwidth = resource.maxbandwidth;
		updateresource.downstateflush = resource.downstateflush;
		updateresource.maxaaausers = resource.maxaaausers;
		updateresource.viewname = resource.viewname;
		updateresource.viewip = resource.viewip;
		updateresource.monthreshold = resource.monthreshold;
		updateresource.weight = resource.weight;
		updateresource.monitor_name_svc = resource.monitor_name_svc;
		updateresource.hashid = resource.hashid;
		updateresource.comment = resource.comment;
		updateresource.appflowlog = resource.appflowlog;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update gslbservice resources.
	*/
	public static base_responses update(nitro_service client, gslbservice resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbservice updateresources[] = new gslbservice[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new gslbservice();
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].publicip = resources[i].publicip;
				updateresources[i].publicport = resources[i].publicport;
				updateresources[i].cip = resources[i].cip;
				updateresources[i].cipheader = resources[i].cipheader;
				updateresources[i].sitepersistence = resources[i].sitepersistence;
				updateresources[i].siteprefix = resources[i].siteprefix;
				updateresources[i].maxclient = resources[i].maxclient;
				updateresources[i].healthmonitor = resources[i].healthmonitor;
				updateresources[i].maxbandwidth = resources[i].maxbandwidth;
				updateresources[i].downstateflush = resources[i].downstateflush;
				updateresources[i].maxaaausers = resources[i].maxaaausers;
				updateresources[i].viewname = resources[i].viewname;
				updateresources[i].viewip = resources[i].viewip;
				updateresources[i].monthreshold = resources[i].monthreshold;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].monitor_name_svc = resources[i].monitor_name_svc;
				updateresources[i].hashid = resources[i].hashid;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].appflowlog = resources[i].appflowlog;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of gslbservice resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, gslbservice resource, String[] args) throws Exception{
		gslbservice unsetresource = new gslbservice();
		unsetresource.servicename = resource.servicename;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of gslbservice resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String servicename[], String args[]) throws Exception {
		base_responses result = null;
		if (servicename != null && servicename.length > 0) {
			gslbservice unsetresources[] = new gslbservice[servicename.length];
			for (int i=0;i<servicename.length;i++){
				unsetresources[i] = new gslbservice();
				unsetresources[i].servicename = servicename[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of gslbservice resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, gslbservice resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbservice unsetresources[] = new gslbservice[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new gslbservice();
				unsetresources[i].servicename = resources[i].servicename;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a gslbservice resource.
	*/
	public static base_response rename(nitro_service client, gslbservice resource, String new_servicename) throws Exception {
		gslbservice renameresource = new gslbservice();
		renameresource.servicename = resource.servicename;
		return renameresource.rename_resource(client,new_servicename);
	}

	/**
	* Use this API to rename a gslbservice resource.
	*/
	public static base_response rename(nitro_service client, String servicename, String new_servicename) throws Exception {
		gslbservice renameresource = new gslbservice();
		renameresource.servicename = servicename;
		return renameresource.rename_resource(client,new_servicename);
	}

	/**
	* Use this API to fetch all the gslbservice resources that are configured on netscaler.
	*/
	public static gslbservice[] get(nitro_service service) throws Exception{
		gslbservice obj = new gslbservice();
		gslbservice[] response = (gslbservice[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the gslbservice resources that are configured on netscaler.
	*/
	public static gslbservice[] get(nitro_service service, options option) throws Exception{
		gslbservice obj = new gslbservice();
		gslbservice[] response = (gslbservice[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch gslbservice resource of given name .
	*/
	public static gslbservice get(nitro_service service, String servicename) throws Exception{
		gslbservice obj = new gslbservice();
		obj.set_servicename(servicename);
		gslbservice response = (gslbservice) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch gslbservice resources of given names .
	*/
	public static gslbservice[] get(nitro_service service, String servicename[]) throws Exception{
		if (servicename !=null && servicename.length>0) {
			gslbservice response[] = new gslbservice[servicename.length];
			gslbservice obj[] = new gslbservice[servicename.length];
			for (int i=0;i<servicename.length;i++) {
				obj[i] = new gslbservice();
				obj[i].set_servicename(servicename[i]);
				response[i] = (gslbservice) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of gslbservice resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static gslbservice[] get_filtered(nitro_service service, String filter) throws Exception{
		gslbservice obj = new gslbservice();
		options option = new options();
		option.set_filter(filter);
		gslbservice[] response = (gslbservice[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbservice resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static gslbservice[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		gslbservice obj = new gslbservice();
		options option = new options();
		option.set_filter(filter);
		gslbservice[] response = (gslbservice[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the gslbservice resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		gslbservice obj = new gslbservice();
		options option = new options();
		option.set_count(true);
		gslbservice[] response = (gslbservice[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of gslbservice resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		gslbservice obj = new gslbservice();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbservice[] response = (gslbservice[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbservice resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		gslbservice obj = new gslbservice();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbservice[] response = (gslbservice[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class downstateflushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class servicetypeEnum {
		public static final String HTTP = "HTTP";
		public static final String FTP = "FTP";
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
		public static final String SSL = "SSL";
		public static final String SSL_BRIDGE = "SSL_BRIDGE";
		public static final String SSL_TCP = "SSL_TCP";
		public static final String NNTP = "NNTP";
		public static final String ANY = "ANY";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String RTSP = "RTSP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
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
	public static class monitor_stateEnum {
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
	public static class gslbEnum {
		public static final String REMOTE = "REMOTE";
		public static final String LOCAL = "LOCAL";
	}
	public static class svreffgslbstateEnum {
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
	public static class cipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class monstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sitepersistenceEnum {
		public static final String ConnectionProxy = "ConnectionProxy";
		public static final String HTTPRedirect = "HTTPRedirect";
		public static final String NONE = "NONE";
	}
	public static class healthmonitorEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
