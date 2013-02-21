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
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The cname of the gslb service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cnameentry(String cnameentry) throws Exception{
		this.cnameentry = cnameentry;
	}

	/**
	* <pre>
	* The cname of the gslb service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cnameentry() throws Exception {
		return this.cnameentry;
	}

	/**
	* <pre>
	* The IP address of the server for which the service will be added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ip(String ip) throws Exception{
		this.ip = ip;
	}

	/**
	* <pre>
	* The IP address of the server for which the service will be added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* The name  of the server for which the service will be added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* The name  of the server for which the service will be added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* The type of service that is being added.<br> Default value: NSSVC_SERVICE_UNKNOWN<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, ANY, SIP_UDP, RADIUS, RDP, RTSP, MYSQL, MSSQL
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* The type of service that is being added.<br> Default value: NSSVC_SERVICE_UNKNOWN<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, ANY, SIP_UDP, RADIUS, RDP, RTSP, MYSQL, MSSQL
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* The port on which the service is running.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* The port on which the service is running.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* The port on which the service is running.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The IP address on a NAT box in front of the system to which a private IP of the service maps. This is applicable to GSLB local services. This is optional.
	* </pre>
	*/
	public void set_publicip(String publicip) throws Exception{
		this.publicip = publicip;
	}

	/**
	* <pre>
	* The IP address on a NAT box in front of the system to which a private IP of the service maps. This is applicable to GSLB local services. This is optional.
	* </pre>
	*/
	public String get_publicip() throws Exception {
		return this.publicip;
	}

	/**
	* <pre>
	* The port on a NAT box in front of the system to which the private port of service maps. This is applicable to GSLB local services.This is optional.
	* </pre>
	*/
	public void set_publicport(int publicport) throws Exception {
		this.publicport = new Integer(publicport);
	}

	/**
	* <pre>
	* The port on a NAT box in front of the system to which the private port of service maps. This is applicable to GSLB local services.This is optional.
	* </pre>
	*/
	public void set_publicport(Integer publicport) throws Exception{
		this.publicport = publicport;
	}

	/**
	* <pre>
	* The port on a NAT box in front of the system to which the private port of service maps. This is applicable to GSLB local services.This is optional.
	* </pre>
	*/
	public Integer get_publicport() throws Exception {
		return this.publicport;
	}

	/**
	* <pre>
	* The maximum number of open connections to the service. This argument is optional.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxclient(long maxclient) throws Exception {
		this.maxclient = new Long(maxclient);
	}

	/**
	* <pre>
	* The maximum number of open connections to the service. This argument is optional.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxclient(Long maxclient) throws Exception{
		this.maxclient = maxclient;
	}

	/**
	* <pre>
	* The maximum number of open connections to the service. This argument is optional.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_maxclient() throws Exception {
		return this.maxclient;
	}

	/**
	* <pre>
	* Health monitoring state of the gslb service.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_healthmonitor(String healthmonitor) throws Exception{
		this.healthmonitor = healthmonitor;
	}

	/**
	* <pre>
	* Health monitoring state of the gslb service.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_healthmonitor() throws Exception {
		return this.healthmonitor;
	}

	/**
	* <pre>
	* The GSLB site name. This parameter is mandatory. This option specifies whether the service is a local GSLB service or remote GSLB service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sitename(String sitename) throws Exception{
		this.sitename = sitename;
	}

	/**
	* <pre>
	* The GSLB site name. This parameter is mandatory. This option specifies whether the service is a local GSLB service or remote GSLB service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sitename() throws Exception {
		return this.sitename;
	}

	/**
	* <pre>
	* The state of the service(s). This parameter is optional. This is not applicable to the local GSLB services.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the service(s). This parameter is optional. This is not applicable to the local GSLB services.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* State of insertion of the Client IP header for the service. This parameter is used while connection proxy based Site persistency is enabled, and it inserts real client's IP address in the HTTP request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cip(String cip) throws Exception{
		this.cip = cip;
	}

	/**
	* <pre>
	* State of insertion of the Client IP header for the service. This parameter is used while connection proxy based Site persistency is enabled, and it inserts real client's IP address in the HTTP request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cip() throws Exception {
		return this.cip;
	}

	/**
	* <pre>
	* The client IP header to be used in the HTTP request.  If client IP insertion is enabled and the client IP header is not specified then the value that has been set by the set ns param CLI command will be used as the Client IP header.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cipheader(String cipheader) throws Exception{
		this.cipheader = cipheader;
	}

	/**
	* <pre>
	* The client IP header to be used in the HTTP request.  If client IP insertion is enabled and the client IP header is not specified then the value that has been set by the set ns param CLI command will be used as the Client IP header.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cipheader() throws Exception {
		return this.cipheader;
	}

	/**
	* <pre>
	* The state of cookie based Site persistency.<br> Possible values = ConnectionProxy, HTTPRedirect, NONE
	* </pre>
	*/
	public void set_sitepersistence(String sitepersistence) throws Exception{
		this.sitepersistence = sitepersistence;
	}

	/**
	* <pre>
	* The state of cookie based Site persistency.<br> Possible values = ConnectionProxy, HTTPRedirect, NONE
	* </pre>
	*/
	public String get_sitepersistence() throws Exception {
		return this.sitepersistence;
	}

	/**
	* <pre>
	* The timeout value in minutes for the cookie when cookie based Site persistency is enabled.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cookietimeout(long cookietimeout) throws Exception {
		this.cookietimeout = new Long(cookietimeout);
	}

	/**
	* <pre>
	* The timeout value in minutes for the cookie when cookie based Site persistency is enabled.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cookietimeout(Long cookietimeout) throws Exception{
		this.cookietimeout = cookietimeout;
	}

	/**
	* <pre>
	* The timeout value in minutes for the cookie when cookie based Site persistency is enabled.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_cookietimeout() throws Exception {
		return this.cookietimeout;
	}

	/**
	* <pre>
	* Specify the site prefix string. When the service is bound to a GSLB vserver,
then for each bound service-domain pair, a GSLB Site domain will be generated internally by concatenating the service's siteprefix and the domain's name. If a special string "NONE" is specified,
the siteprefix string will be unset.
	* </pre>
	*/
	public void set_siteprefix(String siteprefix) throws Exception{
		this.siteprefix = siteprefix;
	}

	/**
	* <pre>
	* Specify the site prefix string. When the service is bound to a GSLB vserver,
then for each bound service-domain pair, a GSLB Site domain will be generated internally by concatenating the service's siteprefix and the domain's name. If a special string "NONE" is specified,
the siteprefix string will be unset.
	* </pre>
	*/
	public String get_siteprefix() throws Exception {
		return this.siteprefix;
	}

	/**
	* <pre>
	* The idle time in seconds after which the client connection is terminated. This will be used while doing site persistency.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* The idle time in seconds after which the client connection is terminated. This will be used while doing site persistency.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* The idle time in seconds after which the client connection is terminated. This will be used while doing site persistency.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* The idle time in seconds after which the server connection is terminated. This will be used while doing site persistency.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_svrtimeout(long svrtimeout) throws Exception {
		this.svrtimeout = new Long(svrtimeout);
	}

	/**
	* <pre>
	* The idle time in seconds after which the server connection is terminated. This will be used while doing site persistency.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_svrtimeout(Long svrtimeout) throws Exception{
		this.svrtimeout = svrtimeout;
	}

	/**
	* <pre>
	* The idle time in seconds after which the server connection is terminated. This will be used while doing site persistency.<br> Minimum value =  0<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_svrtimeout() throws Exception {
		return this.svrtimeout;
	}

	/**
	* <pre>
	* A positive integer to identify the maximum bandwidth allowed for  the service.
	* </pre>
	*/
	public void set_maxbandwidth(long maxbandwidth) throws Exception {
		this.maxbandwidth = new Long(maxbandwidth);
	}

	/**
	* <pre>
	* A positive integer to identify the maximum bandwidth allowed for  the service.
	* </pre>
	*/
	public void set_maxbandwidth(Long maxbandwidth) throws Exception{
		this.maxbandwidth = maxbandwidth;
	}

	/**
	* <pre>
	* A positive integer to identify the maximum bandwidth allowed for  the service.
	* </pre>
	*/
	public Long get_maxbandwidth() throws Exception {
		return this.maxbandwidth;
	}

	/**
	* <pre>
	* Perform delayed clean up of connections on this vserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Perform delayed clean up of connections on this vserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* The maximum number of concurrent SSLVPN users allowed to login at a time.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxaaausers(long maxaaausers) throws Exception {
		this.maxaaausers = new Long(maxaaausers);
	}

	/**
	* <pre>
	* The maximum number of concurrent SSLVPN users allowed to login at a time.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxaaausers(Long maxaaausers) throws Exception{
		this.maxaaausers = maxaaausers;
	}

	/**
	* <pre>
	* The maximum number of concurrent SSLVPN users allowed to login at a time.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxaaausers() throws Exception {
		return this.maxaaausers;
	}

	/**
	* <pre>
	* The monitoring threshold.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_monthreshold(long monthreshold) throws Exception {
		this.monthreshold = new Long(monthreshold);
	}

	/**
	* <pre>
	* The monitoring threshold.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_monthreshold(Long monthreshold) throws Exception{
		this.monthreshold = monthreshold;
	}

	/**
	* <pre>
	* The monitoring threshold.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_monthreshold() throws Exception {
		return this.monthreshold;
	}

	/**
	* <pre>
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(long hashid) throws Exception {
		this.hashid = new Long(hashid);
	}

	/**
	* <pre>
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public void set_hashid(Long hashid) throws Exception{
		this.hashid = hashid;
	}

	/**
	* <pre>
	* The hash identifier for the service. This must be unique for each service. This parameter is used by hash based load balancing methods.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_hashid() throws Exception {
		return this.hashid;
	}

	/**
	* <pre>
	* Comments associated with this gslb service.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this gslb service.
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
	* The name of view for the given IP.<br> Minimum length =  1
	* </pre>
	*/
	public void set_viewname(String viewname) throws Exception{
		this.viewname = viewname;
	}

	/**
	* <pre>
	* The name of view for the given IP.<br> Minimum length =  1
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
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The monitor name bound to the selected service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitor_name_svc(String monitor_name_svc) throws Exception{
		this.monitor_name_svc = monitor_name_svc;
	}

	/**
	* <pre>
	* The monitor name bound to the selected service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitor_name_svc() throws Exception {
		return this.monitor_name_svc;
	}

	/**
	* <pre>
	* The new name of the gslb service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the gslb service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* .<br> Default value: NS_GSLBSVC<br> Possible values = REMOTE, LOCAL
	* </pre>
	*/
	public String get_gslb() throws Exception {
		return this.gslb;
	}

	/**
	* <pre>
	* Server state.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_svrstate() throws Exception {
		return this.svrstate;
	}

	/**
	* <pre>
	* Effective state of the gslb svc.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
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
	* The running state of the monitor on this service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
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
	public static base_response unset(nitro_service client, String servicename, String args[]) throws Exception {
		gslbservice unsetresource = new gslbservice();
		unsetresource.servicename = servicename;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of gslbservice resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, gslbservice resource, String[] args) throws Exception{
		gslbservice unsetresource = new gslbservice();
		unsetresource.servicename = resource.servicename;
		unsetresource.publicip = resource.publicip;
		unsetresource.publicport = resource.publicport;
		unsetresource.cip = resource.cip;
		unsetresource.cipheader = resource.cipheader;
		unsetresource.sitepersistence = resource.sitepersistence;
		unsetresource.siteprefix = resource.siteprefix;
		unsetresource.maxclient = resource.maxclient;
		unsetresource.healthmonitor = resource.healthmonitor;
		unsetresource.maxbandwidth = resource.maxbandwidth;
		unsetresource.downstateflush = resource.downstateflush;
		unsetresource.maxaaausers = resource.maxaaausers;
		unsetresource.viewip = resource.viewip;
		unsetresource.monthreshold = resource.monthreshold;
		unsetresource.monitor_name_svc = resource.monitor_name_svc;
		unsetresource.hashid = resource.hashid;
		unsetresource.comment = resource.comment;
		unsetresource.appflowlog = resource.appflowlog;
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
				unsetresources[i].publicip = resources[i].publicip;
				unsetresources[i].publicport = resources[i].publicport;
				unsetresources[i].cip = resources[i].cip;
				unsetresources[i].cipheader = resources[i].cipheader;
				unsetresources[i].sitepersistence = resources[i].sitepersistence;
				unsetresources[i].siteprefix = resources[i].siteprefix;
				unsetresources[i].maxclient = resources[i].maxclient;
				unsetresources[i].healthmonitor = resources[i].healthmonitor;
				unsetresources[i].maxbandwidth = resources[i].maxbandwidth;
				unsetresources[i].downstateflush = resources[i].downstateflush;
				unsetresources[i].maxaaausers = resources[i].maxaaausers;
				unsetresources[i].viewip = resources[i].viewip;
				unsetresources[i].monthreshold = resources[i].monthreshold;
				unsetresources[i].monitor_name_svc = resources[i].monitor_name_svc;
				unsetresources[i].hashid = resources[i].hashid;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].appflowlog = resources[i].appflowlog;
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
