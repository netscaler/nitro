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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnparameter_response extends base_response
{
	public vpnparameter vpnparameter;
}
/**
* Configuration for VPN parameter resource.
*/

public class vpnparameter extends base_resource
{
	private Integer[] httpport;
	private String winsip;
	private String dnsvservername;
	private String splitdns;
	private Long sesstimeout;
	private String clientsecurity;
	private String clientsecuritygroup;
	private String clientsecuritymessage;
	private String clientsecuritylog;
	private String splittunnel;
	private String locallanaccess;
	private String rfc1918;
	private String spoofiip;
	private String killconnections;
	private String transparentinterception;
	private String windowsclienttype;
	private String defaultauthorizationaction;
	private String authorizationgroup;
	private Long clientidletimeout;
	private String proxy;
	private String allprotocolproxy;
	private String httpproxy;
	private String ftpproxy;
	private String socksproxy;
	private String gopherproxy;
	private String sslproxy;
	private String proxyexception;
	private String proxylocalbypass;
	private String clientcleanupprompt;
	private String[] forcecleanup;
	private String[] clientoptions;
	private String[] clientconfiguration;
	private String sso;
	private String ssocredential;
	private String windowsautologon;
	private String usemip;
	private String useiip;
	private String clientdebug;
	private String loginscript;
	private String logoutscript;
	private String homepage;
	private String icaproxy;
	private String wihome;
	private String citrixreceiverhome;
	private String wiportalmode;
	private String clientchoices;
	private String epaclienttype;
	private String iipdnssuffix;
	private Long forcedtimeout;
	private Long forcedtimeoutwarning;
	private String ntdomain;
	private String clientlessvpnmode;
	private String clientlessmodeurlencoding;
	private String clientlesspersistentcookie;
	private String emailhome;
	private String allowedlogingroups;
	private String encryptcsecexp;
	private Long apptokentimeout;
	private Long mdxtokentimeout;
	private String uitheme;
	private String securebrowse;
	private String storefronturl;
	private String kcdaccount;

	//------- Read only Parameter ---------;

	private String name;
	private Long clientidletimeoutwarning;

	/**
	* <pre>
	* Destination port numbers other than port 80, added as a comma-separated list. Traffic to these ports is processed as HTTP traffic, which allows functionality, such as HTTP authorization and single sign-on to a web application to work.<br> Minimum value =  1
	* </pre>
	*/
	public void set_httpport(Integer[] httpport) throws Exception{
		this.httpport = httpport;
	}

	/**
	* <pre>
	* Destination port numbers other than port 80, added as a comma-separated list. Traffic to these ports is processed as HTTP traffic, which allows functionality, such as HTTP authorization and single sign-on to a web application to work.<br> Minimum value =  1
	* </pre>
	*/
	public Integer[] get_httpport() throws Exception {
		return this.httpport;
	}

	/**
	* <pre>
	* WINS server IP address to add to Access Gateway for name resolution.<br> Minimum length =  1
	* </pre>
	*/
	public void set_winsip(String winsip) throws Exception{
		this.winsip = winsip;
	}

	/**
	* <pre>
	* WINS server IP address to add to Access Gateway for name resolution.<br> Minimum length =  1
	* </pre>
	*/
	public String get_winsip() throws Exception {
		return this.winsip;
	}

	/**
	* <pre>
	* Name of the DNS virtual server for the user session.<br> Minimum length =  1
	* </pre>
	*/
	public void set_dnsvservername(String dnsvservername) throws Exception{
		this.dnsvservername = dnsvservername;
	}

	/**
	* <pre>
	* Name of the DNS virtual server for the user session.<br> Minimum length =  1
	* </pre>
	*/
	public String get_dnsvservername() throws Exception {
		return this.dnsvservername;
	}

	/**
	* <pre>
	* Route the DNS requests to the local DNS server configured on the user device, or Access Gateway (remote), or both.<br> Possible values = LOCAL, REMOTE, BOTH
	* </pre>
	*/
	public void set_splitdns(String splitdns) throws Exception{
		this.splitdns = splitdns;
	}

	/**
	* <pre>
	* Route the DNS requests to the local DNS server configured on the user device, or Access Gateway (remote), or both.<br> Possible values = LOCAL, REMOTE, BOTH
	* </pre>
	*/
	public String get_splitdns() throws Exception {
		return this.splitdns;
	}

	/**
	* <pre>
	* Number of minutes after which the session times out.<br> Default value: 30<br> Minimum value =  1
	* </pre>
	*/
	public void set_sesstimeout(long sesstimeout) throws Exception {
		this.sesstimeout = new Long(sesstimeout);
	}

	/**
	* <pre>
	* Number of minutes after which the session times out.<br> Default value: 30<br> Minimum value =  1
	* </pre>
	*/
	public void set_sesstimeout(Long sesstimeout) throws Exception{
		this.sesstimeout = sesstimeout;
	}

	/**
	* <pre>
	* Number of minutes after which the session times out.<br> Default value: 30<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sesstimeout() throws Exception {
		return this.sesstimeout;
	}

	/**
	* <pre>
	* Specify the client security check for the user device to permit an Access Gateway session. The web address or IP address is not included in the expression for the client security check.
	* </pre>
	*/
	public void set_clientsecurity(String clientsecurity) throws Exception{
		this.clientsecurity = clientsecurity;
	}

	/**
	* <pre>
	* Specify the client security check for the user device to permit an Access Gateway session. The web address or IP address is not included in the expression for the client security check.
	* </pre>
	*/
	public String get_clientsecurity() throws Exception {
		return this.clientsecurity;
	}

	/**
	* <pre>
	* The client security group that will be assigned on failure of the client security check. Users can in general be organized into Groups. In this case, the Client Security Group may have a more restrictive security policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_clientsecuritygroup(String clientsecuritygroup) throws Exception{
		this.clientsecuritygroup = clientsecuritygroup;
	}

	/**
	* <pre>
	* The client security group that will be assigned on failure of the client security check. Users can in general be organized into Groups. In this case, the Client Security Group may have a more restrictive security policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_clientsecuritygroup() throws Exception {
		return this.clientsecuritygroup;
	}

	/**
	* <pre>
	* The client security message that will be displayed on failure of the client security check.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_clientsecuritymessage(String clientsecuritymessage) throws Exception{
		this.clientsecuritymessage = clientsecuritymessage;
	}

	/**
	* <pre>
	* The client security message that will be displayed on failure of the client security check.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_clientsecuritymessage() throws Exception {
		return this.clientsecuritymessage;
	}

	/**
	* <pre>
	* Set the logging of client security checks.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_clientsecuritylog(String clientsecuritylog) throws Exception{
		this.clientsecuritylog = clientsecuritylog;
	}

	/**
	* <pre>
	* Set the logging of client security checks.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_clientsecuritylog() throws Exception {
		return this.clientsecuritylog;
	}

	/**
	* <pre>
	* Send, through the tunnel, traffic only for intranet applications that are defined in Access Gateway. Route all other traffic directly to the Internet. The OFF setting routes all traffic through Access Gateway. With the REVERSE setting, intranet applications define the network traffic that is not intercepted. All network traffic directed to internal IP addresses bypasses the VPN tunnel, while other traffic goes through Access Gateway. Reverse split tunneling can be used to log all non-local LAN traffic. For example, if users have a home network and are logged on through the Access Gateway Plug-in, network traffic destined to a printer or another device within the home network is not intercepted.<br> Default value: OFF<br> Possible values = ON, OFF, REVERSE
	* </pre>
	*/
	public void set_splittunnel(String splittunnel) throws Exception{
		this.splittunnel = splittunnel;
	}

	/**
	* <pre>
	* Send, through the tunnel, traffic only for intranet applications that are defined in Access Gateway. Route all other traffic directly to the Internet. The OFF setting routes all traffic through Access Gateway. With the REVERSE setting, intranet applications define the network traffic that is not intercepted. All network traffic directed to internal IP addresses bypasses the VPN tunnel, while other traffic goes through Access Gateway. Reverse split tunneling can be used to log all non-local LAN traffic. For example, if users have a home network and are logged on through the Access Gateway Plug-in, network traffic destined to a printer or another device within the home network is not intercepted.<br> Default value: OFF<br> Possible values = ON, OFF, REVERSE
	* </pre>
	*/
	public String get_splittunnel() throws Exception {
		return this.splittunnel;
	}

	/**
	* <pre>
	* Set local LAN access. If split tunneling is OFF, and you set local LAN access to ON, the local client can route traffic to its local interface. When the local area network switch is specified, this combination of switches is useful. The client can allow local LAN access to devices that commonly have non-routable addresses, such as local printers or local file servers.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_locallanaccess(String locallanaccess) throws Exception{
		this.locallanaccess = locallanaccess;
	}

	/**
	* <pre>
	* Set local LAN access. If split tunneling is OFF, and you set local LAN access to ON, the local client can route traffic to its local interface. When the local area network switch is specified, this combination of switches is useful. The client can allow local LAN access to devices that commonly have non-routable addresses, such as local printers or local file servers.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_locallanaccess() throws Exception {
		return this.locallanaccess;
	}

	/**
	* <pre>
	* As defined in the local area network, allow only the following local area network addresses to bypass the VPN tunnel when the local LAN access feature is enabled:
* 10.*.*.*,
* 172.16.*.*,
* 192.168.*.*.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_rfc1918(String rfc1918) throws Exception{
		this.rfc1918 = rfc1918;
	}

	/**
	* <pre>
	* As defined in the local area network, allow only the following local area network addresses to bypass the VPN tunnel when the local LAN access feature is enabled:
* 10.*.*.*,
* 172.16.*.*,
* 192.168.*.*.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_rfc1918() throws Exception {
		return this.rfc1918;
	}

	/**
	* <pre>
	* Indicate whether or not the application requires IP spoofing, which routes the connection to the intranet application through the virtual adapter.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_spoofiip(String spoofiip) throws Exception{
		this.spoofiip = spoofiip;
	}

	/**
	* <pre>
	* Indicate whether or not the application requires IP spoofing, which routes the connection to the intranet application through the virtual adapter.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_spoofiip() throws Exception {
		return this.spoofiip;
	}

	/**
	* <pre>
	* Specify whether the Access Gateway Plug-in should disconnect all preexisting connections, such as the connections existing before the user logged on to Access Gateway, and prevent new incoming connections on the Access Gateway Plug-in for Windows and MAC when the user is connected to Access Gateway and split tunneling is disabled.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_killconnections(String killconnections) throws Exception{
		this.killconnections = killconnections;
	}

	/**
	* <pre>
	* Specify whether the Access Gateway Plug-in should disconnect all preexisting connections, such as the connections existing before the user logged on to Access Gateway, and prevent new incoming connections on the Access Gateway Plug-in for Windows and MAC when the user is connected to Access Gateway and split tunneling is disabled.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_killconnections() throws Exception {
		return this.killconnections;
	}

	/**
	* <pre>
	* Allow access to network resources by using a single IP address and subnet mask or a range of IP addresses. The OFF setting sets the mode to proxy, in which you configure destination and source IP addresses and port numbers. If you are using the Access Gateway Plug-in for Windows, set this parameter to ON, in which the mode is set to transparent. If you are using the Access Gateway Plug-in for Java, set this parameter to OFF.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_transparentinterception(String transparentinterception) throws Exception{
		this.transparentinterception = transparentinterception;
	}

	/**
	* <pre>
	* Allow access to network resources by using a single IP address and subnet mask or a range of IP addresses. The OFF setting sets the mode to proxy, in which you configure destination and source IP addresses and port numbers. If you are using the Access Gateway Plug-in for Windows, set this parameter to ON, in which the mode is set to transparent. If you are using the Access Gateway Plug-in for Java, set this parameter to OFF.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_transparentinterception() throws Exception {
		return this.transparentinterception;
	}

	/**
	* <pre>
	* The Windows client type. Choose between two types of Windows Client\
a) Application Agent - which always runs in the task bar as a standalone application and also has a supporting service which runs permanently when installed\
b) Activex Control - ActiveX control run by Microsoft's Internet Explorer.<br> Default value: AGENT<br> Possible values = AGENT, PLUGIN
	* </pre>
	*/
	public void set_windowsclienttype(String windowsclienttype) throws Exception{
		this.windowsclienttype = windowsclienttype;
	}

	/**
	* <pre>
	* The Windows client type. Choose between two types of Windows Client\
a) Application Agent - which always runs in the task bar as a standalone application and also has a supporting service which runs permanently when installed\
b) Activex Control - ActiveX control run by Microsoft's Internet Explorer.<br> Default value: AGENT<br> Possible values = AGENT, PLUGIN
	* </pre>
	*/
	public String get_windowsclienttype() throws Exception {
		return this.windowsclienttype;
	}

	/**
	* <pre>
	* Specify the network resources that users have access to when they log on to the internal network. The default setting for authorization is to deny access to all network resources. Citrix recommends using the default global setting and then creating authorization policies to define the network resources users can access. If you set the default authorization policy to DENY, you must explicitly authorize access to any network resource, which improves security.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_defaultauthorizationaction(String defaultauthorizationaction) throws Exception{
		this.defaultauthorizationaction = defaultauthorizationaction;
	}

	/**
	* <pre>
	* Specify the network resources that users have access to when they log on to the internal network. The default setting for authorization is to deny access to all network resources. Citrix recommends using the default global setting and then creating authorization policies to define the network resources users can access. If you set the default authorization policy to DENY, you must explicitly authorize access to any network resource, which improves security.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_defaultauthorizationaction() throws Exception {
		return this.defaultauthorizationaction;
	}

	/**
	* <pre>
	* Comma-separated list of groups in which the user is placed when none of the groups that the user is a part of is configured on Access Gateway. The authorization policy can be bound to these groups to control access to the resources.<br> Minimum length =  1
	* </pre>
	*/
	public void set_authorizationgroup(String authorizationgroup) throws Exception{
		this.authorizationgroup = authorizationgroup;
	}

	/**
	* <pre>
	* Comma-separated list of groups in which the user is placed when none of the groups that the user is a part of is configured on Access Gateway. The authorization policy can be bound to these groups to control access to the resources.<br> Minimum length =  1
	* </pre>
	*/
	public String get_authorizationgroup() throws Exception {
		return this.authorizationgroup;
	}

	/**
	* <pre>
	* Time, in minutes, after which to time out the user session if Access Gateway does not detect mouse or keyboard activity.<br> Minimum value =  1<br> Maximum value =  9999
	* </pre>
	*/
	public void set_clientidletimeout(long clientidletimeout) throws Exception {
		this.clientidletimeout = new Long(clientidletimeout);
	}

	/**
	* <pre>
	* Time, in minutes, after which to time out the user session if Access Gateway does not detect mouse or keyboard activity.<br> Minimum value =  1<br> Maximum value =  9999
	* </pre>
	*/
	public void set_clientidletimeout(Long clientidletimeout) throws Exception{
		this.clientidletimeout = clientidletimeout;
	}

	/**
	* <pre>
	* Time, in minutes, after which to time out the user session if Access Gateway does not detect mouse or keyboard activity.<br> Minimum value =  1<br> Maximum value =  9999
	* </pre>
	*/
	public Long get_clientidletimeout() throws Exception {
		return this.clientidletimeout;
	}

	/**
	* <pre>
	* Set options to apply proxy for accessing the internal resources. Available settings function as follows:
* BROWSER - Proxy settings are configured only in Internet Explorer and Firefox browsers.
* NS - Proxy settings are configured on the NetScaler appliance.
* OFF - Proxy settings are not configured.<br> Possible values = BROWSER, NS, OFF
	* </pre>
	*/
	public void set_proxy(String proxy) throws Exception{
		this.proxy = proxy;
	}

	/**
	* <pre>
	* Set options to apply proxy for accessing the internal resources. Available settings function as follows:
* BROWSER - Proxy settings are configured only in Internet Explorer and Firefox browsers.
* NS - Proxy settings are configured on the NetScaler appliance.
* OFF - Proxy settings are not configured.<br> Possible values = BROWSER, NS, OFF
	* </pre>
	*/
	public String get_proxy() throws Exception {
		return this.proxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to use for all protocols supported by Access Gateway.<br> Minimum length =  1
	* </pre>
	*/
	public void set_allprotocolproxy(String allprotocolproxy) throws Exception{
		this.allprotocolproxy = allprotocolproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to use for all protocols supported by Access Gateway.<br> Minimum length =  1
	* </pre>
	*/
	public String get_allprotocolproxy() throws Exception {
		return this.allprotocolproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for HTTP access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public void set_httpproxy(String httpproxy) throws Exception{
		this.httpproxy = httpproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for HTTP access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public String get_httpproxy() throws Exception {
		return this.httpproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for FTP access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ftpproxy(String ftpproxy) throws Exception{
		this.ftpproxy = ftpproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for FTP access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ftpproxy() throws Exception {
		return this.ftpproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for SOCKS access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public void set_socksproxy(String socksproxy) throws Exception{
		this.socksproxy = socksproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for SOCKS access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public String get_socksproxy() throws Exception {
		return this.socksproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for GOPHER access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public void set_gopherproxy(String gopherproxy) throws Exception{
		this.gopherproxy = gopherproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for GOPHER access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public String get_gopherproxy() throws Exception {
		return this.gopherproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for SSL access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sslproxy(String sslproxy) throws Exception{
		this.sslproxy = sslproxy;
	}

	/**
	* <pre>
	* IP address of the proxy server to be used for SSL access for all subsequent connections to the internal network.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sslproxy() throws Exception {
		return this.sslproxy;
	}

	/**
	* <pre>
	* Proxy exception string that will be configured in the browser for bypassing the previously configured proxies. Allowed only if proxy type is Browser.<br> Minimum length =  1
	* </pre>
	*/
	public void set_proxyexception(String proxyexception) throws Exception{
		this.proxyexception = proxyexception;
	}

	/**
	* <pre>
	* Proxy exception string that will be configured in the browser for bypassing the previously configured proxies. Allowed only if proxy type is Browser.<br> Minimum length =  1
	* </pre>
	*/
	public String get_proxyexception() throws Exception {
		return this.proxyexception;
	}

	/**
	* <pre>
	* Bypass proxy server for local addresses option in Internet Explorer and Firefox proxy server settings.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_proxylocalbypass(String proxylocalbypass) throws Exception{
		this.proxylocalbypass = proxylocalbypass;
	}

	/**
	* <pre>
	* Bypass proxy server for local addresses option in Internet Explorer and Firefox proxy server settings.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_proxylocalbypass() throws Exception {
		return this.proxylocalbypass;
	}

	/**
	* <pre>
	* Prompt for client-side cache clean-up when a client-initiated session closes.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_clientcleanupprompt(String clientcleanupprompt) throws Exception{
		this.clientcleanupprompt = clientcleanupprompt;
	}

	/**
	* <pre>
	* Prompt for client-side cache clean-up when a client-initiated session closes.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_clientcleanupprompt() throws Exception {
		return this.clientcleanupprompt;
	}

	/**
	* <pre>
	* Force cache clean-up when the user closes a session. You can specify all, none, or any combination of the client-side items.<br> Possible values = none, all, cookie, addressbar, plugin, filesystemapplication, application, applicationdata, clientcertificate, autocomplete, cache
	* </pre>
	*/
	public void set_forcecleanup(String[] forcecleanup) throws Exception{
		this.forcecleanup = forcecleanup;
	}

	/**
	* <pre>
	* Force cache clean-up when the user closes a session. You can specify all, none, or any combination of the client-side items.<br> Possible values = none, all, cookie, addressbar, plugin, filesystemapplication, application, applicationdata, clientcertificate, autocomplete, cache
	* </pre>
	*/
	public String[] get_forcecleanup() throws Exception {
		return this.forcecleanup;
	}

	/**
	* <pre>
	* Display only the configured menu options when you select the "Configure Access Gateway" option in the Access Gateway Plug-in's system tray icon for Windows.<br> Possible values = none, all, services, filetransfer, configuration
	* </pre>
	*/
	public void set_clientoptions(String[] clientoptions) throws Exception{
		this.clientoptions = clientoptions;
	}

	/**
	* <pre>
	* Display only the configured menu options when you select the "Configure Access Gateway" option in the Access Gateway Plug-in's system tray icon for Windows.<br> Possible values = none, all, services, filetransfer, configuration
	* </pre>
	*/
	public String[] get_clientoptions() throws Exception {
		return this.clientoptions;
	}

	/**
	* <pre>
	* Display only the configured tabs when you select the "Configure Access Gateway" option in the Access Gateway Plug-in's system tray icon for Windows.<br> Possible values = none, all, general, tunnel, trace, compression
	* </pre>
	*/
	public void set_clientconfiguration(String[] clientconfiguration) throws Exception{
		this.clientconfiguration = clientconfiguration;
	}

	/**
	* <pre>
	* Display only the configured tabs when you select the "Configure Access Gateway" option in the Access Gateway Plug-in's system tray icon for Windows.<br> Possible values = none, all, general, tunnel, trace, compression
	* </pre>
	*/
	public String[] get_clientconfiguration() throws Exception {
		return this.clientconfiguration;
	}

	/**
	* <pre>
	* Set single sign-on (SSO) for the session. When the user accesses a server, the user's logon credentials are passed to the server for authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sso(String sso) throws Exception{
		this.sso = sso;
	}

	/**
	* <pre>
	* Set single sign-on (SSO) for the session. When the user accesses a server, the user's logon credentials are passed to the server for authentication.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sso() throws Exception {
		return this.sso;
	}

	/**
	* <pre>
	* Specify whether to use the primary or secondary authentication credentials for single sign-on to the server.<br> Default value: PRIMARY<br> Possible values = PRIMARY, SECONDARY
	* </pre>
	*/
	public void set_ssocredential(String ssocredential) throws Exception{
		this.ssocredential = ssocredential;
	}

	/**
	* <pre>
	* Specify whether to use the primary or secondary authentication credentials for single sign-on to the server.<br> Default value: PRIMARY<br> Possible values = PRIMARY, SECONDARY
	* </pre>
	*/
	public String get_ssocredential() throws Exception {
		return this.ssocredential;
	}

	/**
	* <pre>
	* Enable or disable the Windows Auto Logon for the session. If a VPN session is established after this setting is enabled, the user is automatically logged on by using Windows credentials after the system is restarted.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_windowsautologon(String windowsautologon) throws Exception{
		this.windowsautologon = windowsautologon;
	}

	/**
	* <pre>
	* Enable or disable the Windows Auto Logon for the session. If a VPN session is established after this setting is enabled, the user is automatically logged on by using Windows credentials after the system is restarted.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_windowsautologon() throws Exception {
		return this.windowsautologon;
	}

	/**
	* <pre>
	* Enable or disable the use of a unique IP address alias, or a mapped IP address, as the client IP address for each client session. Allow Access Gateway to use the mapped IP address as an intranet IP address when all other IP addresses are not available. 
When IP pooling is configured and the mapped IP is used as an intranet IP address, the mapped IP address is used when an intranet IP address cannot be assigned.<br> Default value: NS<br> Possible values = NS, OFF
	* </pre>
	*/
	public void set_usemip(String usemip) throws Exception{
		this.usemip = usemip;
	}

	/**
	* <pre>
	* Enable or disable the use of a unique IP address alias, or a mapped IP address, as the client IP address for each client session. Allow Access Gateway to use the mapped IP address as an intranet IP address when all other IP addresses are not available. 
When IP pooling is configured and the mapped IP is used as an intranet IP address, the mapped IP address is used when an intranet IP address cannot be assigned.<br> Default value: NS<br> Possible values = NS, OFF
	* </pre>
	*/
	public String get_usemip() throws Exception {
		return this.usemip;
	}

	/**
	* <pre>
	* Define IP address pool options. Available settings function as follows: 
* SPILLOVER - When an address pool is configured and the mapped IP is used as an intranet IP address, the mapped IP address is used when an intranet IP address cannot be assigned. 
* NOSPILLOVER - When intranet IP addresses are enabled and the mapped IP address is not used, the Transfer Login page appears for users who have used all available intranet IP addresses. 
* OFF - Address pool is not configured.<br> Default value: NOSPILLOVER<br> Possible values = NOSPILLOVER, SPILLOVER, OFF
	* </pre>
	*/
	public void set_useiip(String useiip) throws Exception{
		this.useiip = useiip;
	}

	/**
	* <pre>
	* Define IP address pool options. Available settings function as follows: 
* SPILLOVER - When an address pool is configured and the mapped IP is used as an intranet IP address, the mapped IP address is used when an intranet IP address cannot be assigned. 
* NOSPILLOVER - When intranet IP addresses are enabled and the mapped IP address is not used, the Transfer Login page appears for users who have used all available intranet IP addresses. 
* OFF - Address pool is not configured.<br> Default value: NOSPILLOVER<br> Possible values = NOSPILLOVER, SPILLOVER, OFF
	* </pre>
	*/
	public String get_useiip() throws Exception {
		return this.useiip;
	}

	/**
	* <pre>
	* Set the trace level on Access Gateway. Technical support technicians use these debug logs for in-depth debugging and troubleshooting purposes. Available settings function as follows: 
* DEBUG - Detailed debug messages are collected and written into the specified file.
* STATS - Application audit level error messages and debug statistic counters are written into the specified file. 
* EVENTS - Application audit-level error messages are written into the specified file. 
* OFF - Only critical events are logged into the Windows Application Log.<br> Default value: OFF<br> Possible values = debug, stats, events, OFF
	* </pre>
	*/
	public void set_clientdebug(String clientdebug) throws Exception{
		this.clientdebug = clientdebug;
	}

	/**
	* <pre>
	* Set the trace level on Access Gateway. Technical support technicians use these debug logs for in-depth debugging and troubleshooting purposes. Available settings function as follows: 
* DEBUG - Detailed debug messages are collected and written into the specified file.
* STATS - Application audit level error messages and debug statistic counters are written into the specified file. 
* EVENTS - Application audit-level error messages are written into the specified file. 
* OFF - Only critical events are logged into the Windows Application Log.<br> Default value: OFF<br> Possible values = debug, stats, events, OFF
	* </pre>
	*/
	public String get_clientdebug() throws Exception {
		return this.clientdebug;
	}

	/**
	* <pre>
	* Path to the logon script that is run when a session is established. Separate multiple scripts by using comma. A "$" in the path signifies that the word following the "$" is an environment variable.<br> Minimum length =  1
	* </pre>
	*/
	public void set_loginscript(String loginscript) throws Exception{
		this.loginscript = loginscript;
	}

	/**
	* <pre>
	* Path to the logon script that is run when a session is established. Separate multiple scripts by using comma. A "$" in the path signifies that the word following the "$" is an environment variable.<br> Minimum length =  1
	* </pre>
	*/
	public String get_loginscript() throws Exception {
		return this.loginscript;
	}

	/**
	* <pre>
	* Path to the logout script. Separate multiple scripts by using comma. A "$" in the path signifies that the word following the "$" is an environment variable.<br> Minimum length =  1
	* </pre>
	*/
	public void set_logoutscript(String logoutscript) throws Exception{
		this.logoutscript = logoutscript;
	}

	/**
	* <pre>
	* Path to the logout script. Separate multiple scripts by using comma. A "$" in the path signifies that the word following the "$" is an environment variable.<br> Minimum length =  1
	* </pre>
	*/
	public String get_logoutscript() throws Exception {
		return this.logoutscript;
	}

	/**
	* <pre>
	* Web address of the home page that appears when users log on. Otherwise, users receive the default home page for Access Gateway, which is the Access Interface.
	* </pre>
	*/
	public void set_homepage(String homepage) throws Exception{
		this.homepage = homepage;
	}

	/**
	* <pre>
	* Web address of the home page that appears when users log on. Otherwise, users receive the default home page for Access Gateway, which is the Access Interface.
	* </pre>
	*/
	public String get_homepage() throws Exception {
		return this.homepage;
	}

	/**
	* <pre>
	* Enable ICA proxy to configure secure Internet access to servers running Citrix XenApp or XenDesktop by using Citrix Receiver instead of the Access Gateway Plug-in.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_icaproxy(String icaproxy) throws Exception{
		this.icaproxy = icaproxy;
	}

	/**
	* <pre>
	* Enable ICA proxy to configure secure Internet access to servers running Citrix XenApp or XenDesktop by using Citrix Receiver instead of the Access Gateway Plug-in.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_icaproxy() throws Exception {
		return this.icaproxy;
	}

	/**
	* <pre>
	* Web address of the Web Interface server, such as http://<ipAddress>/Citrix/XenApp, or Receiver for Web, which enumerates the virtualized resources, such as XenApp, XenDesktop, and cloud applications. This web address is used as the home page in ICA proxy mode. 
If Client Choices is ON, you must configure this setting. Because the user can choose between FullClient and ICAProxy, the user may see a different home page. An Internet web site may appear if the user gets the FullClient option, or a Web Interface site if the user gets the ICAProxy option. If the setting is not configured, the XenApp option does not appear as a client choice.
	* </pre>
	*/
	public void set_wihome(String wihome) throws Exception{
		this.wihome = wihome;
	}

	/**
	* <pre>
	* Web address of the Web Interface server, such as http://<ipAddress>/Citrix/XenApp, or Receiver for Web, which enumerates the virtualized resources, such as XenApp, XenDesktop, and cloud applications. This web address is used as the home page in ICA proxy mode. 
If Client Choices is ON, you must configure this setting. Because the user can choose between FullClient and ICAProxy, the user may see a different home page. An Internet web site may appear if the user gets the FullClient option, or a Web Interface site if the user gets the ICAProxy option. If the setting is not configured, the XenApp option does not appear as a client choice.
	* </pre>
	*/
	public String get_wihome() throws Exception {
		return this.wihome;
	}

	/**
	* <pre>
	* Web address for the Citrix Receiver home page. Configure Access Gateway so that when users log on to the appliance, the Access Gateway Plug-in opens a web browser that allows single sign-on to the Citrix Receiver home page.
	* </pre>
	*/
	public void set_citrixreceiverhome(String citrixreceiverhome) throws Exception{
		this.citrixreceiverhome = citrixreceiverhome;
	}

	/**
	* <pre>
	* Web address for the Citrix Receiver home page. Configure Access Gateway so that when users log on to the appliance, the Access Gateway Plug-in opens a web browser that allows single sign-on to the Citrix Receiver home page.
	* </pre>
	*/
	public String get_citrixreceiverhome() throws Exception {
		return this.citrixreceiverhome;
	}

	/**
	* <pre>
	* Layout on the Access Interface. The COMPACT value indicates the use of small icons.<br> Possible values = NORMAL, COMPACT
	* </pre>
	*/
	public void set_wiportalmode(String wiportalmode) throws Exception{
		this.wiportalmode = wiportalmode;
	}

	/**
	* <pre>
	* Layout on the Access Interface. The COMPACT value indicates the use of small icons.<br> Possible values = NORMAL, COMPACT
	* </pre>
	*/
	public String get_wiportalmode() throws Exception {
		return this.wiportalmode;
	}

	/**
	* <pre>
	* Provide users with multiple logon options. With client choices, users have the option of logging on by using the Access Gateway Plug-in for Windows, Access Gateway Plug-in for Java, the Web Interface, or clientless access from one location. Depending on how Access Gateway is configured, users are presented with up to three icons for logon choices. The most common are the Access Gateway Plug-in for Windows, Web Interface, and clientless access.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_clientchoices(String clientchoices) throws Exception{
		this.clientchoices = clientchoices;
	}

	/**
	* <pre>
	* Provide users with multiple logon options. With client choices, users have the option of logging on by using the Access Gateway Plug-in for Windows, Access Gateway Plug-in for Java, the Web Interface, or clientless access from one location. Depending on how Access Gateway is configured, users are presented with up to three icons for logon choices. The most common are the Access Gateway Plug-in for Windows, Web Interface, and clientless access.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_clientchoices() throws Exception {
		return this.clientchoices;
	}

	/**
	* <pre>
	* Choose between two types of End point Windows Client
a) Application Agent - which always runs in the task bar as a standalone application and also has a supporting service which runs permanently when installed
b) Activex Control - ActiveX control run by Microsoft's Internet Explorer.<br> Possible values = AGENT, PLUGIN
	* </pre>
	*/
	public void set_epaclienttype(String epaclienttype) throws Exception{
		this.epaclienttype = epaclienttype;
	}

	/**
	* <pre>
	* Choose between two types of End point Windows Client
a) Application Agent - which always runs in the task bar as a standalone application and also has a supporting service which runs permanently when installed
b) Activex Control - ActiveX control run by Microsoft's Internet Explorer.<br> Possible values = AGENT, PLUGIN
	* </pre>
	*/
	public String get_epaclienttype() throws Exception {
		return this.epaclienttype;
	}

	/**
	* <pre>
	* An intranet IP DNS suffix. When a user logs on to Access Gateway and is assigned an IP address, a DNS record for the user name and IP address combination is added to Access Gateway DNS cache. You can configure a DNS suffix to append to the user name when the DNS record is added to the cache. You can reach to the host from where the user is logged on by using the user's name, which can be easier to remember than an IP address. When the user logs off from Access Gateway, the record is removed from the DNS cache.<br> Minimum length =  1
	* </pre>
	*/
	public void set_iipdnssuffix(String iipdnssuffix) throws Exception{
		this.iipdnssuffix = iipdnssuffix;
	}

	/**
	* <pre>
	* An intranet IP DNS suffix. When a user logs on to Access Gateway and is assigned an IP address, a DNS record for the user name and IP address combination is added to Access Gateway DNS cache. You can configure a DNS suffix to append to the user name when the DNS record is added to the cache. You can reach to the host from where the user is logged on by using the user's name, which can be easier to remember than an IP address. When the user logs off from Access Gateway, the record is removed from the DNS cache.<br> Minimum length =  1
	* </pre>
	*/
	public String get_iipdnssuffix() throws Exception {
		return this.iipdnssuffix;
	}

	/**
	* <pre>
	* Force a disconnection from the Access Gateway Plug-in with Access Gateway after a specified number of minutes. If the session closes, the user must log on again.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_forcedtimeout(long forcedtimeout) throws Exception {
		this.forcedtimeout = new Long(forcedtimeout);
	}

	/**
	* <pre>
	* Force a disconnection from the Access Gateway Plug-in with Access Gateway after a specified number of minutes. If the session closes, the user must log on again.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_forcedtimeout(Long forcedtimeout) throws Exception{
		this.forcedtimeout = forcedtimeout;
	}

	/**
	* <pre>
	* Force a disconnection from the Access Gateway Plug-in with Access Gateway after a specified number of minutes. If the session closes, the user must log on again.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_forcedtimeout() throws Exception {
		return this.forcedtimeout;
	}

	/**
	* <pre>
	* Number of minutes to warn a user before the user session is disconnected.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_forcedtimeoutwarning(long forcedtimeoutwarning) throws Exception {
		this.forcedtimeoutwarning = new Long(forcedtimeoutwarning);
	}

	/**
	* <pre>
	* Number of minutes to warn a user before the user session is disconnected.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_forcedtimeoutwarning(Long forcedtimeoutwarning) throws Exception{
		this.forcedtimeoutwarning = forcedtimeoutwarning;
	}

	/**
	* <pre>
	* Number of minutes to warn a user before the user session is disconnected.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_forcedtimeoutwarning() throws Exception {
		return this.forcedtimeoutwarning;
	}

	/**
	* <pre>
	* Single sign-on domain to use for single sign-on to applications in the internal network. This setting can be overwritten by the domain that users specify at the time of logon or by the domain that the authentication server returns.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public void set_ntdomain(String ntdomain) throws Exception{
		this.ntdomain = ntdomain;
	}

	/**
	* <pre>
	* Single sign-on domain to use for single sign-on to applications in the internal network. This setting can be overwritten by the domain that users specify at the time of logon or by the domain that the authentication server returns.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public String get_ntdomain() throws Exception {
		return this.ntdomain;
	}

	/**
	* <pre>
	* Enable clientless access for web, XenApp or XenDesktop, and FileShare resources without installing the Access Gateway Plug-in. Available settings function as follows: 
* ON - Allow only clientless access. 
* OFF - Allow clientless access after users log on with the Access Gateway Plug-in. 
* DISABLED - Do not allow clientless access.<br> Default value: OFF<br> Possible values = ON, OFF, DISABLED
	* </pre>
	*/
	public void set_clientlessvpnmode(String clientlessvpnmode) throws Exception{
		this.clientlessvpnmode = clientlessvpnmode;
	}

	/**
	* <pre>
	* Enable clientless access for web, XenApp or XenDesktop, and FileShare resources without installing the Access Gateway Plug-in. Available settings function as follows: 
* ON - Allow only clientless access. 
* OFF - Allow clientless access after users log on with the Access Gateway Plug-in. 
* DISABLED - Do not allow clientless access.<br> Default value: OFF<br> Possible values = ON, OFF, DISABLED
	* </pre>
	*/
	public String get_clientlessvpnmode() throws Exception {
		return this.clientlessvpnmode;
	}

	/**
	* <pre>
	* When clientless access is enabled, you can choose to encode the addresses of internal web applications or to leave the address as clear text. Available settings function as follows: 
* OPAQUE - Use standard encoding mechanisms to make the domain and protocol part of the resource unclear to users. 
* CLEAR - Do not encode the web address and make it visible to users. 
* ENCRYPT - Allow the domain and protocol to be encrypted using a session key. When the web address is encrypted, the URL is different for each user session for the same web resource. If users bookmark the encoded web address, save it in the web browser and then log off, they cannot connect to the web address when they log on and use the bookmark. If users save the encrypted bookmark in the Access Interface during their session, the bookmark works each time the user logs on.<br> Default value: OPAQUE<br> Possible values = TRANSPARENT, OPAQUE, ENCRYPT
	* </pre>
	*/
	public void set_clientlessmodeurlencoding(String clientlessmodeurlencoding) throws Exception{
		this.clientlessmodeurlencoding = clientlessmodeurlencoding;
	}

	/**
	* <pre>
	* When clientless access is enabled, you can choose to encode the addresses of internal web applications or to leave the address as clear text. Available settings function as follows: 
* OPAQUE - Use standard encoding mechanisms to make the domain and protocol part of the resource unclear to users. 
* CLEAR - Do not encode the web address and make it visible to users. 
* ENCRYPT - Allow the domain and protocol to be encrypted using a session key. When the web address is encrypted, the URL is different for each user session for the same web resource. If users bookmark the encoded web address, save it in the web browser and then log off, they cannot connect to the web address when they log on and use the bookmark. If users save the encrypted bookmark in the Access Interface during their session, the bookmark works each time the user logs on.<br> Default value: OPAQUE<br> Possible values = TRANSPARENT, OPAQUE, ENCRYPT
	* </pre>
	*/
	public String get_clientlessmodeurlencoding() throws Exception {
		return this.clientlessmodeurlencoding;
	}

	/**
	* <pre>
	* State of persistent cookies in clientless access mode. Persistent cookies are required for accessing certain features of SharePoint, such as opening and editing Microsoft Word, Excel, and PowerPoint documents hosted on the SharePoint server. A persistent cookie remains on the user device and is sent with each HTTP request. Access Gateway encrypts the persistent cookie before sending it to the plug-in on the user device, and refreshes the cookie periodically as long as the session exists. The cookie becomes stale if the session ends. Available settings function as follows: 
* ALLOW - Enable persistent cookies. Users can open and edit Microsoft documents stored in SharePoint. 
* DENY - Disable persistent cookies. Users cannot open and edit Microsoft documents stored in SharePoint. 
* PROMPT - Prompt users to allow or deny persistent cookies during the session. Persistent cookies are not required for clientless access if users do not connect to SharePoint.<br> Default value: DENY<br> Possible values = ALLOW, DENY, PROMPT
	* </pre>
	*/
	public void set_clientlesspersistentcookie(String clientlesspersistentcookie) throws Exception{
		this.clientlesspersistentcookie = clientlesspersistentcookie;
	}

	/**
	* <pre>
	* State of persistent cookies in clientless access mode. Persistent cookies are required for accessing certain features of SharePoint, such as opening and editing Microsoft Word, Excel, and PowerPoint documents hosted on the SharePoint server. A persistent cookie remains on the user device and is sent with each HTTP request. Access Gateway encrypts the persistent cookie before sending it to the plug-in on the user device, and refreshes the cookie periodically as long as the session exists. The cookie becomes stale if the session ends. Available settings function as follows: 
* ALLOW - Enable persistent cookies. Users can open and edit Microsoft documents stored in SharePoint. 
* DENY - Disable persistent cookies. Users cannot open and edit Microsoft documents stored in SharePoint. 
* PROMPT - Prompt users to allow or deny persistent cookies during the session. Persistent cookies are not required for clientless access if users do not connect to SharePoint.<br> Default value: DENY<br> Possible values = ALLOW, DENY, PROMPT
	* </pre>
	*/
	public String get_clientlesspersistentcookie() throws Exception {
		return this.clientlesspersistentcookie;
	}

	/**
	* <pre>
	* Web address for the web-based email, such as Outlook Web Access.
	* </pre>
	*/
	public void set_emailhome(String emailhome) throws Exception{
		this.emailhome = emailhome;
	}

	/**
	* <pre>
	* Web address for the web-based email, such as Outlook Web Access.
	* </pre>
	*/
	public String get_emailhome() throws Exception {
		return this.emailhome;
	}

	/**
	* <pre>
	* Specify groups that have permission to log on to Access Gateway. Users who do not belong to this group or groups are denied access even if they have valid credentials.<br> Minimum length =  1<br> Maximum length =  511
	* </pre>
	*/
	public void set_allowedlogingroups(String allowedlogingroups) throws Exception{
		this.allowedlogingroups = allowedlogingroups;
	}

	/**
	* <pre>
	* Specify groups that have permission to log on to Access Gateway. Users who do not belong to this group or groups are denied access even if they have valid credentials.<br> Minimum length =  1<br> Maximum length =  511
	* </pre>
	*/
	public String get_allowedlogingroups() throws Exception {
		return this.allowedlogingroups;
	}

	/**
	* <pre>
	* Enable encryption of client security expressions.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_encryptcsecexp(String encryptcsecexp) throws Exception{
		this.encryptcsecexp = encryptcsecexp;
	}

	/**
	* <pre>
	* Enable encryption of client security expressions.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_encryptcsecexp() throws Exception {
		return this.encryptcsecexp;
	}

	/**
	* <pre>
	* The timeout value in seconds for tokens to access cloud gateway applications.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_apptokentimeout(long apptokentimeout) throws Exception {
		this.apptokentimeout = new Long(apptokentimeout);
	}

	/**
	* <pre>
	* The timeout value in seconds for tokens to access cloud gateway applications.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_apptokentimeout(Long apptokentimeout) throws Exception{
		this.apptokentimeout = apptokentimeout;
	}

	/**
	* <pre>
	* The timeout value in seconds for tokens to access cloud gateway applications.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_apptokentimeout() throws Exception {
		return this.apptokentimeout;
	}

	/**
	* <pre>
	* Validity of MDX Token in minutes. This token is used for mdx services to access backend and valid  HEAD and GET request.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_mdxtokentimeout(long mdxtokentimeout) throws Exception {
		this.mdxtokentimeout = new Long(mdxtokentimeout);
	}

	/**
	* <pre>
	* Validity of MDX Token in minutes. This token is used for mdx services to access backend and valid  HEAD and GET request.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_mdxtokentimeout(Long mdxtokentimeout) throws Exception{
		this.mdxtokentimeout = mdxtokentimeout;
	}

	/**
	* <pre>
	* Validity of MDX Token in minutes. This token is used for mdx services to access backend and valid  HEAD and GET request.<br> Default value: 10<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_mdxtokentimeout() throws Exception {
		return this.mdxtokentimeout;
	}

	/**
	* <pre>
	* Set VPN UI Theme to Green-Bubble, Caxton or Custom; default is Caxton.<br> Possible values = DEFAULT, GREENBUBBLE, CUSTOM
	* </pre>
	*/
	public void set_uitheme(String uitheme) throws Exception{
		this.uitheme = uitheme;
	}

	/**
	* <pre>
	* Set VPN UI Theme to Green-Bubble, Caxton or Custom; default is Caxton.<br> Possible values = DEFAULT, GREENBUBBLE, CUSTOM
	* </pre>
	*/
	public String get_uitheme() throws Exception {
		return this.uitheme;
	}

	/**
	* <pre>
	* Allow users to connect through Access Gateway to network resources from iOS and Android mobile devices with Citrix Receiver. Users do not need to establish a full VPN tunnel to access resources in the secure network.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_securebrowse(String securebrowse) throws Exception{
		this.securebrowse = securebrowse;
	}

	/**
	* <pre>
	* Allow users to connect through Access Gateway to network resources from iOS and Android mobile devices with Citrix Receiver. Users do not need to establish a full VPN tunnel to access resources in the secure network.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_securebrowse() throws Exception {
		return this.securebrowse;
	}

	/**
	* <pre>
	* Web address for StoreFront to be used in this session for enumeration of resources from XenApp or XenDesktop.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_storefronturl(String storefronturl) throws Exception{
		this.storefronturl = storefronturl;
	}

	/**
	* <pre>
	* Web address for StoreFront to be used in this session for enumeration of resources from XenApp or XenDesktop.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_storefronturl() throws Exception {
		return this.storefronturl;
	}

	/**
	* <pre>
	* The kcd account details to be used in SSO.
	* </pre>
	*/
	public void set_kcdaccount(String kcdaccount) throws Exception{
		this.kcdaccount = kcdaccount;
	}

	/**
	* <pre>
	* The kcd account details to be used in SSO.
	* </pre>
	*/
	public String get_kcdaccount() throws Exception {
		return this.kcdaccount;
	}

	/**
	* <pre>
	* The VPN name.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The time after which the client gets a timeout warning, in minutes.
	* </pre>
	*/
	public Long get_clientidletimeoutwarning() throws Exception {
		return this.clientidletimeoutwarning;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		vpnparameter[] resources = new vpnparameter[1];
		vpnparameter_response result = (vpnparameter_response) service.get_payload_formatter().string_to_resource(vpnparameter_response.class, response);
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
		resources[0] = result.vpnparameter;
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
	* Use this API to update vpnparameter.
	*/
	public static base_response update(nitro_service client, vpnparameter resource) throws Exception {
		vpnparameter updateresource = new vpnparameter();
		updateresource.httpport = resource.httpport;
		updateresource.winsip = resource.winsip;
		updateresource.dnsvservername = resource.dnsvservername;
		updateresource.splitdns = resource.splitdns;
		updateresource.sesstimeout = resource.sesstimeout;
		updateresource.clientsecurity = resource.clientsecurity;
		updateresource.clientsecuritygroup = resource.clientsecuritygroup;
		updateresource.clientsecuritymessage = resource.clientsecuritymessage;
		updateresource.clientsecuritylog = resource.clientsecuritylog;
		updateresource.splittunnel = resource.splittunnel;
		updateresource.locallanaccess = resource.locallanaccess;
		updateresource.rfc1918 = resource.rfc1918;
		updateresource.spoofiip = resource.spoofiip;
		updateresource.killconnections = resource.killconnections;
		updateresource.transparentinterception = resource.transparentinterception;
		updateresource.windowsclienttype = resource.windowsclienttype;
		updateresource.defaultauthorizationaction = resource.defaultauthorizationaction;
		updateresource.authorizationgroup = resource.authorizationgroup;
		updateresource.clientidletimeout = resource.clientidletimeout;
		updateresource.proxy = resource.proxy;
		updateresource.allprotocolproxy = resource.allprotocolproxy;
		updateresource.httpproxy = resource.httpproxy;
		updateresource.ftpproxy = resource.ftpproxy;
		updateresource.socksproxy = resource.socksproxy;
		updateresource.gopherproxy = resource.gopherproxy;
		updateresource.sslproxy = resource.sslproxy;
		updateresource.proxyexception = resource.proxyexception;
		updateresource.proxylocalbypass = resource.proxylocalbypass;
		updateresource.clientcleanupprompt = resource.clientcleanupprompt;
		updateresource.forcecleanup = resource.forcecleanup;
		updateresource.clientoptions = resource.clientoptions;
		updateresource.clientconfiguration = resource.clientconfiguration;
		updateresource.sso = resource.sso;
		updateresource.ssocredential = resource.ssocredential;
		updateresource.windowsautologon = resource.windowsautologon;
		updateresource.usemip = resource.usemip;
		updateresource.useiip = resource.useiip;
		updateresource.clientdebug = resource.clientdebug;
		updateresource.loginscript = resource.loginscript;
		updateresource.logoutscript = resource.logoutscript;
		updateresource.homepage = resource.homepage;
		updateresource.icaproxy = resource.icaproxy;
		updateresource.wihome = resource.wihome;
		updateresource.citrixreceiverhome = resource.citrixreceiverhome;
		updateresource.wiportalmode = resource.wiportalmode;
		updateresource.clientchoices = resource.clientchoices;
		updateresource.epaclienttype = resource.epaclienttype;
		updateresource.iipdnssuffix = resource.iipdnssuffix;
		updateresource.forcedtimeout = resource.forcedtimeout;
		updateresource.forcedtimeoutwarning = resource.forcedtimeoutwarning;
		updateresource.ntdomain = resource.ntdomain;
		updateresource.clientlessvpnmode = resource.clientlessvpnmode;
		updateresource.clientlessmodeurlencoding = resource.clientlessmodeurlencoding;
		updateresource.clientlesspersistentcookie = resource.clientlesspersistentcookie;
		updateresource.emailhome = resource.emailhome;
		updateresource.allowedlogingroups = resource.allowedlogingroups;
		updateresource.encryptcsecexp = resource.encryptcsecexp;
		updateresource.apptokentimeout = resource.apptokentimeout;
		updateresource.mdxtokentimeout = resource.mdxtokentimeout;
		updateresource.uitheme = resource.uitheme;
		updateresource.securebrowse = resource.securebrowse;
		updateresource.storefronturl = resource.storefronturl;
		updateresource.kcdaccount = resource.kcdaccount;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of vpnparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpnparameter resource, String[] args) throws Exception{
		vpnparameter unsetresource = new vpnparameter();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the vpnparameter resources that are configured on netscaler.
	*/
	public static vpnparameter get(nitro_service service) throws Exception{
		vpnparameter obj = new vpnparameter();
		vpnparameter[] response = (vpnparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the vpnparameter resources that are configured on netscaler.
	*/
	public static vpnparameter get(nitro_service service,  options option) throws Exception{
		vpnparameter obj = new vpnparameter();
		vpnparameter[] response = (vpnparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class spoofiipEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class uithemeEnum {
		public static final String DEFAULT = "DEFAULT";
		public static final String GREENBUBBLE = "GREENBUBBLE";
		public static final String CUSTOM = "CUSTOM";
	}
	public static class transparentinterceptionEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class clientcleanuppromptEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class encryptcsecexpEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class wiportalmodeEnum {
		public static final String NORMAL = "NORMAL";
		public static final String COMPACT = "COMPACT";
	}
	public static class icaproxyEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class clientlessmodeurlencodingEnum {
		public static final String TRANSPARENT = "TRANSPARENT";
		public static final String OPAQUE = "OPAQUE";
		public static final String ENCRYPT = "ENCRYPT";
	}
	public static class clientlessvpnmodeEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
		public static final String DISABLED = "DISABLED";
	}
	public static class forcecleanupEnum {
		public static final String none = "none";
		public static final String all = "all";
		public static final String cookie = "cookie";
		public static final String addressbar = "addressbar";
		public static final String plugin = "plugin";
		public static final String filesystemapplication = "filesystemapplication";
		public static final String application = "application";
		public static final String applicationdata = "applicationdata";
		public static final String clientcertificate = "clientcertificate";
		public static final String autocomplete = "autocomplete";
		public static final String cache = "cache";
	}
	public static class clientsecuritylogEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class killconnectionsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class splitdnsEnum {
		public static final String LOCAL = "LOCAL";
		public static final String REMOTE = "REMOTE";
		public static final String BOTH = "BOTH";
	}
	public static class usemipEnum {
		public static final String NS = "NS";
		public static final String OFF = "OFF";
	}
	public static class useiipEnum {
		public static final String NOSPILLOVER = "NOSPILLOVER";
		public static final String SPILLOVER = "SPILLOVER";
		public static final String OFF = "OFF";
	}
	public static class securebrowseEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class windowsclienttypeEnum {
		public static final String AGENT = "AGENT";
		public static final String PLUGIN = "PLUGIN";
	}
	public static class windowsautologonEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class defaultauthorizationactionEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
	}
	public static class clientoptionsEnum {
		public static final String none = "none";
		public static final String all = "all";
		public static final String services = "services";
		public static final String filetransfer = "filetransfer";
		public static final String configuration = "configuration";
	}
	public static class clientchoicesEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class splittunnelEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
		public static final String REVERSE = "REVERSE";
	}
	public static class epaclienttypeEnum {
		public static final String AGENT = "AGENT";
		public static final String PLUGIN = "PLUGIN";
	}
	public static class ssocredentialEnum {
		public static final String PRIMARY = "PRIMARY";
		public static final String SECONDARY = "SECONDARY";
	}
	public static class proxylocalbypassEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class rfc1918Enum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class clientlesspersistentcookieEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
		public static final String PROMPT = "PROMPT";
	}
	public static class clientconfigurationEnum {
		public static final String none = "none";
		public static final String all = "all";
		public static final String general = "general";
		public static final String tunnel = "tunnel";
		public static final String trace = "trace";
		public static final String compression = "compression";
	}
	public static class locallanaccessEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class clientdebugEnum {
		public static final String debug = "debug";
		public static final String stats = "stats";
		public static final String events = "events";
		public static final String OFF = "OFF";
	}
	public static class proxyEnum {
		public static final String BROWSER = "BROWSER";
		public static final String NS = "NS";
		public static final String OFF = "OFF";
	}
	public static class ssoEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
