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

class vpnsessionaction_response extends base_response
{
	public vpnsessionaction[] vpnsessionaction;
}
/**
* Configuration for VPN session action resource.
*/

public class vpnsessionaction extends base_resource
{
	private String name;
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
	private String emailhome;
	private String clientlessmodeurlencoding;
	private String clientlesspersistentcookie;
	private String allowedlogingroups;
	private String securebrowse;
	private String storefronturl;

	//------- Read only Parameter ---------;

	private Long clientidletimeoutwarning;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name for the new vpn session action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new vpn session action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The http port number for this session.<br> Minimum value =  1
	* </pre>
	*/
	public void set_httpport(Integer[] httpport) throws Exception{
		this.httpport = httpport;
	}

	/**
	* <pre>
	* The http port number for this session.<br> Minimum value =  1
	* </pre>
	*/
	public Integer[] get_httpport() throws Exception {
		return this.httpport;
	}

	/**
	* <pre>
	* The WINS server ip address for this session.
	* </pre>
	*/
	public void set_winsip(String winsip) throws Exception{
		this.winsip = winsip;
	}

	/**
	* <pre>
	* The WINS server ip address for this session.
	* </pre>
	*/
	public String get_winsip() throws Exception {
		return this.winsip;
	}

	/**
	* <pre>
	* The name of the DNS vserver to be configured by the session action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_dnsvservername(String dnsvservername) throws Exception{
		this.dnsvservername = dnsvservername;
	}

	/**
	* <pre>
	* The name of the DNS vserver to be configured by the session action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_dnsvservername() throws Exception {
		return this.dnsvservername;
	}

	/**
	* <pre>
	* Set the VPN client to route the DNS requests to remote network or local network or both.<br> Possible values = LOCAL, REMOTE, BOTH
	* </pre>
	*/
	public void set_splitdns(String splitdns) throws Exception{
		this.splitdns = splitdns;
	}

	/**
	* <pre>
	* Set the VPN client to route the DNS requests to remote network or local network or both.<br> Possible values = LOCAL, REMOTE, BOTH
	* </pre>
	*/
	public String get_splitdns() throws Exception {
		return this.splitdns;
	}

	/**
	* <pre>
	* The session timeout, in minutes, to be set by the action.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sesstimeout(long sesstimeout) throws Exception {
		this.sesstimeout = new Long(sesstimeout);
	}

	/**
	* <pre>
	* The session timeout, in minutes, to be set by the action.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sesstimeout(Long sesstimeout) throws Exception{
		this.sesstimeout = sesstimeout;
	}

	/**
	* <pre>
	* The session timeout, in minutes, to be set by the action.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sesstimeout() throws Exception {
		return this.sesstimeout;
	}

	/**
	* <pre>
	* The client security check string to be applied. This is in the form of an Expression. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public void set_clientsecurity(String clientsecurity) throws Exception{
		this.clientsecurity = clientsecurity;
	}

	/**
	* <pre>
	* The client security check string to be applied. This is in the form of an Expression. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
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
	* Controls client side logging of security checks.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_clientsecuritylog(String clientsecuritylog) throws Exception{
		this.clientsecuritylog = clientsecuritylog;
	}

	/**
	* <pre>
	* Controls client side logging of security checks.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_clientsecuritylog() throws Exception {
		return this.clientsecuritylog;
	}

	/**
	* <pre>
	* The split tunnel state, e.g. ON, OFF or REVERSE. Split Tunnelling ON enables the VPN client to route non-VPN traffic through its local network interface. When Split Tunnelling is OFF, no traffic may go to the local interface while the client session is active.
Split tunneling can also be set to REVERSE. In this case all traffic directed to domains configured on the system will bypass the VPN tunnel. All other traffic is forced through the VPN tunnel.<br> Possible values = ON, OFF, REVERSE
	* </pre>
	*/
	public void set_splittunnel(String splittunnel) throws Exception{
		this.splittunnel = splittunnel;
	}

	/**
	* <pre>
	* The split tunnel state, e.g. ON, OFF or REVERSE. Split Tunnelling ON enables the VPN client to route non-VPN traffic through its local network interface. When Split Tunnelling is OFF, no traffic may go to the local interface while the client session is active.
Split tunneling can also be set to REVERSE. In this case all traffic directed to domains configured on the system will bypass the VPN tunnel. All other traffic is forced through the VPN tunnel.<br> Possible values = ON, OFF, REVERSE
	* </pre>
	*/
	public String get_splittunnel() throws Exception {
		return this.splittunnel;
	}

	/**
	* <pre>
	* Finer grained local lan access. ON or OFF. splitTunnel, when OFF, permits no traffic to be routed to the client's local interface. But if, in addition, localLanAccess is turned ON, the client MAY route traffic to its local interface. This combination of switches is useful primarily when the rfc1918 switch is also specified. In this fashion, the client may restrict local lan access to devices which commonly have non-routable addresses, such as local printers or local file servers.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_locallanaccess(String locallanaccess) throws Exception{
		this.locallanaccess = locallanaccess;
	}

	/**
	* <pre>
	* Finer grained local lan access. ON or OFF. splitTunnel, when OFF, permits no traffic to be routed to the client's local interface. But if, in addition, localLanAccess is turned ON, the client MAY route traffic to its local interface. This combination of switches is useful primarily when the rfc1918 switch is also specified. In this fashion, the client may restrict local lan access to devices which commonly have non-routable addresses, such as local printers or local file servers.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_locallanaccess() throws Exception {
		return this.locallanaccess;
	}

	/**
	* <pre>
	* Only allow RFC1918 local addresses when local LAN access feature is enabled.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_rfc1918(String rfc1918) throws Exception{
		this.rfc1918 = rfc1918;
	}

	/**
	* <pre>
	* Only allow RFC1918 local addresses when local LAN access feature is enabled.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_rfc1918() throws Exception {
		return this.rfc1918;
	}

	/**
	* <pre>
	* Controls the Spoofing of Intranet IP to the Windows Applications by Windows VPN client when the end-user is connected to SSL VPN in '-splittunnel OFF' mode.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_spoofiip(String spoofiip) throws Exception{
		this.spoofiip = spoofiip;
	}

	/**
	* <pre>
	* Controls the Spoofing of Intranet IP to the Windows Applications by Windows VPN client when the end-user is connected to SSL VPN in '-splittunnel OFF' mode.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_spoofiip() throws Exception {
		return this.spoofiip;
	}

	/**
	* <pre>
	* Determines whether Windows VPN client should kill all pre-existing connections (ie, the connections existing before the end user logged in to SSL VPN) and prevent new incoming connections on the Windows Client system when the end-user is connected to SSL VPN in '-splittunnel OFF' mode.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_killconnections(String killconnections) throws Exception{
		this.killconnections = killconnections;
	}

	/**
	* <pre>
	* Determines whether Windows VPN client should kill all pre-existing connections (ie, the connections existing before the end user logged in to SSL VPN) and prevent new incoming connections on the Windows Client system when the end-user is connected to SSL VPN in '-splittunnel OFF' mode.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_killconnections() throws Exception {
		return this.killconnections;
	}

	/**
	* <pre>
	* The transparent interception state, e.g. ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_transparentinterception(String transparentinterception) throws Exception{
		this.transparentinterception = transparentinterception;
	}

	/**
	* <pre>
	* The transparent interception state, e.g. ON or OFF.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_transparentinterception() throws Exception {
		return this.transparentinterception;
	}

	/**
	* <pre>
	* Choose between two types of Windows Client\
a) Application Agent - which always runs in the task bar as a standalone application and also has a supporting service which runs permanently when installed\
b) Activex Control - ActiveX control run by Microsoft's Internet Explorer.<br> Possible values = AGENT, PLUGIN
	* </pre>
	*/
	public void set_windowsclienttype(String windowsclienttype) throws Exception{
		this.windowsclienttype = windowsclienttype;
	}

	/**
	* <pre>
	* Choose between two types of Windows Client\
a) Application Agent - which always runs in the task bar as a standalone application and also has a supporting service which runs permanently when installed\
b) Activex Control - ActiveX control run by Microsoft's Internet Explorer.<br> Possible values = AGENT, PLUGIN
	* </pre>
	*/
	public String get_windowsclienttype() throws Exception {
		return this.windowsclienttype;
	}

	/**
	* <pre>
	* This toggles the default authorization action to either ALLOW or DENY.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_defaultauthorizationaction(String defaultauthorizationaction) throws Exception{
		this.defaultauthorizationaction = defaultauthorizationaction;
	}

	/**
	* <pre>
	* This toggles the default authorization action to either ALLOW or DENY.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_defaultauthorizationaction() throws Exception {
		return this.defaultauthorizationaction;
	}

	/**
	* <pre>
	* The authorization group to be applied to the session.<br> Minimum length =  1
	* </pre>
	*/
	public void set_authorizationgroup(String authorizationgroup) throws Exception{
		this.authorizationgroup = authorizationgroup;
	}

	/**
	* <pre>
	* The authorization group to be applied to the session.<br> Minimum length =  1
	* </pre>
	*/
	public String get_authorizationgroup() throws Exception {
		return this.authorizationgroup;
	}

	/**
	* <pre>
	* Defines the client idle timeout value. Measured in minutes, the client idle timeout default is 20 minutes and meters a client session's keyboard and mouse inactivity. .<br> Minimum value =  1<br> Maximum value =  9999
	* </pre>
	*/
	public void set_clientidletimeout(long clientidletimeout) throws Exception {
		this.clientidletimeout = new Long(clientidletimeout);
	}

	/**
	* <pre>
	* Defines the client idle timeout value. Measured in minutes, the client idle timeout default is 20 minutes and meters a client session's keyboard and mouse inactivity. .<br> Minimum value =  1<br> Maximum value =  9999
	* </pre>
	*/
	public void set_clientidletimeout(Long clientidletimeout) throws Exception{
		this.clientidletimeout = clientidletimeout;
	}

	/**
	* <pre>
	* Defines the client idle timeout value. Measured in minutes, the client idle timeout default is 20 minutes and meters a client session's keyboard and mouse inactivity. .<br> Minimum value =  1<br> Maximum value =  9999
	* </pre>
	*/
	public Long get_clientidletimeout() throws Exception {
		return this.clientidletimeout;
	}

	/**
	* <pre>
	* Enables or disables use of a proxy configuration in the session.<br> Possible values = BROWSER, NS, OFF
	* </pre>
	*/
	public void set_proxy(String proxy) throws Exception{
		this.proxy = proxy;
	}

	/**
	* <pre>
	* Enables or disables use of a proxy configuration in the session.<br> Possible values = BROWSER, NS, OFF
	* </pre>
	*/
	public String get_proxy() throws Exception {
		return this.proxy;
	}

	/**
	* <pre>
	* Sets the address to use for all proxies.<br> Minimum length =  1
	* </pre>
	*/
	public void set_allprotocolproxy(String allprotocolproxy) throws Exception{
		this.allprotocolproxy = allprotocolproxy;
	}

	/**
	* <pre>
	* Sets the address to use for all proxies.<br> Minimum length =  1
	* </pre>
	*/
	public String get_allprotocolproxy() throws Exception {
		return this.allprotocolproxy;
	}

	/**
	* <pre>
	* Sets the HTTP proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_httpproxy(String httpproxy) throws Exception{
		this.httpproxy = httpproxy;
	}

	/**
	* <pre>
	* Sets the HTTP proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_httpproxy() throws Exception {
		return this.httpproxy;
	}

	/**
	* <pre>
	* Defines the FTP proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ftpproxy(String ftpproxy) throws Exception{
		this.ftpproxy = ftpproxy;
	}

	/**
	* <pre>
	* Defines the FTP proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ftpproxy() throws Exception {
		return this.ftpproxy;
	}

	/**
	* <pre>
	* The SOCKS proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_socksproxy(String socksproxy) throws Exception{
		this.socksproxy = socksproxy;
	}

	/**
	* <pre>
	* The SOCKS proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_socksproxy() throws Exception {
		return this.socksproxy;
	}

	/**
	* <pre>
	* Sets the Gopher proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_gopherproxy(String gopherproxy) throws Exception{
		this.gopherproxy = gopherproxy;
	}

	/**
	* <pre>
	* Sets the Gopher proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_gopherproxy() throws Exception {
		return this.gopherproxy;
	}

	/**
	* <pre>
	* Sets the HTTPS proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sslproxy(String sslproxy) throws Exception{
		this.sslproxy = sslproxy;
	}

	/**
	* <pre>
	* Sets the HTTPS proxy IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sslproxy() throws Exception {
		return this.sslproxy;
	}

	/**
	* <pre>
	* Proxy Exception string that will be configured in the Browser for bypassing the previously configured proxies. Allowed only if proxy type is Browser.<br> Minimum length =  1
	* </pre>
	*/
	public void set_proxyexception(String proxyexception) throws Exception{
		this.proxyexception = proxyexception;
	}

	/**
	* <pre>
	* Proxy Exception string that will be configured in the Browser for bypassing the previously configured proxies. Allowed only if proxy type is Browser.<br> Minimum length =  1
	* </pre>
	*/
	public String get_proxyexception() throws Exception {
		return this.proxyexception;
	}

	/**
	* <pre>
	* Bypass proxy server for local addresses option in IE proxy server settings will be enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_proxylocalbypass(String proxylocalbypass) throws Exception{
		this.proxylocalbypass = proxylocalbypass;
	}

	/**
	* <pre>
	* Bypass proxy server for local addresses option in IE proxy server settings will be enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_proxylocalbypass() throws Exception {
		return this.proxylocalbypass;
	}

	/**
	* <pre>
	* Toggles the prompt for client clean up on a client intitiated session close.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_clientcleanupprompt(String clientcleanupprompt) throws Exception{
		this.clientcleanupprompt = clientcleanupprompt;
	}

	/**
	* <pre>
	* Toggles the prompt for client clean up on a client intitiated session close.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_clientcleanupprompt() throws Exception {
		return this.clientcleanupprompt;
	}

	/**
	* <pre>
	* The client side items for force cleanup on session close. Options are:
	none, all, cookie, addressbar, plugin, filesystemapplication, addressbar, application, clientcertificate, applicationdata, and autocomplete.
You may specify all or none alone or any combination of the client side items.<br> Possible values = none, all, cookie, addressbar, plugin, filesystemapplication, application, applicationdata, clientcertificate, autocomplete, cache
	* </pre>
	*/
	public void set_forcecleanup(String[] forcecleanup) throws Exception{
		this.forcecleanup = forcecleanup;
	}

	/**
	* <pre>
	* The client side items for force cleanup on session close. Options are:
	none, all, cookie, addressbar, plugin, filesystemapplication, addressbar, application, clientcertificate, applicationdata, and autocomplete.
You may specify all or none alone or any combination of the client side items.<br> Possible values = none, all, cookie, addressbar, plugin, filesystemapplication, application, applicationdata, clientcertificate, autocomplete, cache
	* </pre>
	*/
	public String[] get_forcecleanup() throws Exception {
		return this.forcecleanup;
	}

	/**
	* <pre>
	* Display only configured buttons(and/or menu options in the docked client) in the Windows VPN client.\
Options:\
none\
		none of the Windows Client's buttons/menu options (except logout) are displayed.\
all\
		all of the Windows Client's buttons/menu options are displayed.\
\
One or more of the following\
services\
		only the "Services" button/menu option is displayed.\
filetransfer\
		only the "File Transfer" button/menu option is displayed.\
configuration\
		only the "Configuration" button/menu option is displayed.<br> Possible values = none, all, services, filetransfer, configuration
	* </pre>
	*/
	public void set_clientoptions(String[] clientoptions) throws Exception{
		this.clientoptions = clientoptions;
	}

	/**
	* <pre>
	* Display only configured buttons(and/or menu options in the docked client) in the Windows VPN client.\
Options:\
none\
		none of the Windows Client's buttons/menu options (except logout) are displayed.\
all\
		all of the Windows Client's buttons/menu options are displayed.\
\
One or more of the following\
services\
		only the "Services" button/menu option is displayed.\
filetransfer\
		only the "File Transfer" button/menu option is displayed.\
configuration\
		only the "Configuration" button/menu option is displayed.<br> Possible values = none, all, services, filetransfer, configuration
	* </pre>
	*/
	public String[] get_clientoptions() throws Exception {
		return this.clientoptions;
	}

	/**
	* <pre>
	* Display only configured tabs in the Windows VPN client.\
Options:\
none\
		none of the Windows Client's tabs(except About) are displayed.\
all\
		all of the Windows Client's tabs (except "Resptime") are displayed.\
\
One or more of the following\
general\
		only the "General" tab is displayed.\
tunnel\
		only the "Tunnel" tab is displayed.\
trace\
		only the "Trace" tab is displayed.\
compression\
	only the "Compression" tab is displayed.\
resptime\
		only the "Resptime" tab is displayed.<br> Possible values = none, all, general, tunnel, trace, compression
	* </pre>
	*/
	public void set_clientconfiguration(String[] clientconfiguration) throws Exception{
		this.clientconfiguration = clientconfiguration;
	}

	/**
	* <pre>
	* Display only configured tabs in the Windows VPN client.\
Options:\
none\
		none of the Windows Client's tabs(except About) are displayed.\
all\
		all of the Windows Client's tabs (except "Resptime") are displayed.\
\
One or more of the following\
general\
		only the "General" tab is displayed.\
tunnel\
		only the "Tunnel" tab is displayed.\
trace\
		only the "Trace" tab is displayed.\
compression\
	only the "Compression" tab is displayed.\
resptime\
		only the "Resptime" tab is displayed.<br> Possible values = none, all, general, tunnel, trace, compression
	* </pre>
	*/
	public String[] get_clientconfiguration() throws Exception {
		return this.clientconfiguration;
	}

	/**
	* <pre>
	* Enables or disables the use of Single Sign-on for the session.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sso(String sso) throws Exception{
		this.sso = sso;
	}

	/**
	* <pre>
	* Enables or disables the use of Single Sign-on for the session.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sso() throws Exception {
		return this.sso;
	}

	/**
	* <pre>
	* The set of user credentials (primary or secondary) to use for Single Sign-On.<br> Possible values = PRIMARY, SECONDARY
	* </pre>
	*/
	public void set_ssocredential(String ssocredential) throws Exception{
		this.ssocredential = ssocredential;
	}

	/**
	* <pre>
	* The set of user credentials (primary or secondary) to use for Single Sign-On.<br> Possible values = PRIMARY, SECONDARY
	* </pre>
	*/
	public String get_ssocredential() throws Exception {
		return this.ssocredential;
	}

	/**
	* <pre>
	* Enables or disables the Windows Auto Logon for the session.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_windowsautologon(String windowsautologon) throws Exception{
		this.windowsautologon = windowsautologon;
	}

	/**
	* <pre>
	* Enables or disables the Windows Auto Logon for the session.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_windowsautologon() throws Exception {
		return this.windowsautologon;
	}

	/**
	* <pre>
	* Enables or disables the use of a Mapped IP address for the session.<br> Possible values = NS, OFF
	* </pre>
	*/
	public void set_usemip(String usemip) throws Exception{
		this.usemip = usemip;
	}

	/**
	* <pre>
	* Enables or disables the use of a Mapped IP address for the session.<br> Possible values = NS, OFF
	* </pre>
	*/
	public String get_usemip() throws Exception {
		return this.usemip;
	}

	/**
	* <pre>
	* Controls how the intranet IP module is configured for usage. \
Options:\
SPILLOVER\
	specifies that iip is ON and when we can't assign an intranet IP to an entity, which has other instances active, we spill over to using Mapped IP.\
NOSPILLOVER\
	specifies that iip is ON and when we can't assign intranet IP to an entity, which has other instances active, then we initiate transfer login.\
OFFn	specifies that intranet IP module won't be activated for this entity.<br> Possible values = NOSPILLOVER, SPILLOVER, OFF
	* </pre>
	*/
	public void set_useiip(String useiip) throws Exception{
		this.useiip = useiip;
	}

	/**
	* <pre>
	* Controls how the intranet IP module is configured for usage. \
Options:\
SPILLOVER\
	specifies that iip is ON and when we can't assign an intranet IP to an entity, which has other instances active, we spill over to using Mapped IP.\
NOSPILLOVER\
	specifies that iip is ON and when we can't assign intranet IP to an entity, which has other instances active, then we initiate transfer login.\
OFFn	specifies that intranet IP module won't be activated for this entity.<br> Possible values = NOSPILLOVER, SPILLOVER, OFF
	* </pre>
	*/
	public String get_useiip() throws Exception {
		return this.useiip;
	}

	/**
	* <pre>
	* Sets the trace level on the Windows VPN Client.\
Options:\
debugn\
		Detailed debug messages are collected are written into the specified file.\
stats\
			Application audit level error messages and debug statistic counters are written into the specified file.\
events\
			Application audit level error messages are written into the specified file.\
off\
			Only critical events are logged into the Windows Application Log.<br> Possible values = debug, stats, events, OFF
	* </pre>
	*/
	public void set_clientdebug(String clientdebug) throws Exception{
		this.clientdebug = clientdebug;
	}

	/**
	* <pre>
	* Sets the trace level on the Windows VPN Client.\
Options:\
debugn\
		Detailed debug messages are collected are written into the specified file.\
stats\
			Application audit level error messages and debug statistic counters are written into the specified file.\
events\
			Application audit level error messages are written into the specified file.\
off\
			Only critical events are logged into the Windows Application Log.<br> Possible values = debug, stats, events, OFF
	* </pre>
	*/
	public String get_clientdebug() throws Exception {
		return this.clientdebug;
	}

	/**
	* <pre>
	* Login script path.<br> Minimum length =  1
	* </pre>
	*/
	public void set_loginscript(String loginscript) throws Exception{
		this.loginscript = loginscript;
	}

	/**
	* <pre>
	* Login script path.<br> Minimum length =  1
	* </pre>
	*/
	public String get_loginscript() throws Exception {
		return this.loginscript;
	}

	/**
	* <pre>
	* Logout script path.<br> Minimum length =  1
	* </pre>
	*/
	public void set_logoutscript(String logoutscript) throws Exception{
		this.logoutscript = logoutscript;
	}

	/**
	* <pre>
	* Logout script path.<br> Minimum length =  1
	* </pre>
	*/
	public String get_logoutscript() throws Exception {
		return this.logoutscript;
	}

	/**
	* <pre>
	* Sets the client home page. Setting this parameter overrides serving the default portal page to SSL VPN users with the URL specified here.
	* </pre>
	*/
	public void set_homepage(String homepage) throws Exception{
		this.homepage = homepage;
	}

	/**
	* <pre>
	* Sets the client home page. Setting this parameter overrides serving the default portal page to SSL VPN users with the URL specified here.
	* </pre>
	*/
	public String get_homepage() throws Exception {
		return this.homepage;
	}

	/**
	* <pre>
	* Enable ICA proxy mode. This can be used to enable Secure Gateway functionality for the Web Interface. If enabled, a VPN homepage that points to a Web Interface in SG mode, has to be configured.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_icaproxy(String icaproxy) throws Exception{
		this.icaproxy = icaproxy;
	}

	/**
	* <pre>
	* Enable ICA proxy mode. This can be used to enable Secure Gateway functionality for the Web Interface. If enabled, a VPN homepage that points to a Web Interface in SG mode, has to be configured.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_icaproxy() throws Exception {
		return this.icaproxy;
	}

	/**
	* <pre>
	* Sets the home page of wi interface. Used only in conjunction with icaProxy ON. If clientChoices is ON, wiHome has to be configured. Since the end user is given a choice between FullClient and ICAProxy the homepage/landing page for each of these options could be different i.e. for FullClient it could be a Intranet web site and for the ICAProxy choice it will be a Web Interface web site. Hence we don't presume wihome == homepage.
	* </pre>
	*/
	public void set_wihome(String wihome) throws Exception{
		this.wihome = wihome;
	}

	/**
	* <pre>
	* Sets the home page of wi interface. Used only in conjunction with icaProxy ON. If clientChoices is ON, wiHome has to be configured. Since the end user is given a choice between FullClient and ICAProxy the homepage/landing page for each of these options could be different i.e. for FullClient it could be a Intranet web site and for the ICAProxy choice it will be a Web Interface web site. Hence we don't presume wihome == homepage.
	* </pre>
	*/
	public String get_wihome() throws Exception {
		return this.wihome;
	}

	/**
	* <pre>
	* Sets the home page of apprecvr interface.
	* </pre>
	*/
	public void set_citrixreceiverhome(String citrixreceiverhome) throws Exception{
		this.citrixreceiverhome = citrixreceiverhome;
	}

	/**
	* <pre>
	* Sets the home page of apprecvr interface.
	* </pre>
	*/
	public String get_citrixreceiverhome() throws Exception {
		return this.citrixreceiverhome;
	}

	/**
	* <pre>
	* WI layout on the VPN portal.<br> Possible values = NORMAL, COMPACT
	* </pre>
	*/
	public void set_wiportalmode(String wiportalmode) throws Exception{
		this.wiportalmode = wiportalmode;
	}

	/**
	* <pre>
	* WI layout on the VPN portal.<br> Possible values = NORMAL, COMPACT
	* </pre>
	*/
	public String get_wiportalmode() throws Exception {
		return this.wiportalmode;
	}

	/**
	* <pre>
	* Enables user to select different clients by displaying a set of options in a html page.
 The different client can be a) agent
b) plugin
c) wimode.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_clientchoices(String clientchoices) throws Exception{
		this.clientchoices = clientchoices;
	}

	/**
	* <pre>
	* Enables user to select different clients by displaying a set of options in a html page.
 The different client can be a) agent
b) plugin
c) wimode.<br> Possible values = ON, OFF
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
	* Configure the IntranetIP DNS suffix. When a user logs into SSL-VPN, an A record is added to the DNS cache, after appending the configured IntranetIP DNS suffix to the username.<br> Minimum length =  1
	* </pre>
	*/
	public void set_iipdnssuffix(String iipdnssuffix) throws Exception{
		this.iipdnssuffix = iipdnssuffix;
	}

	/**
	* <pre>
	* Configure the IntranetIP DNS suffix. When a user logs into SSL-VPN, an A record is added to the DNS cache, after appending the configured IntranetIP DNS suffix to the username.<br> Minimum length =  1
	* </pre>
	*/
	public String get_iipdnssuffix() throws Exception {
		return this.iipdnssuffix;
	}

	/**
	* <pre>
	* Maximum number of minutes a session is allowed to persist.<br> Minimum value =  1<br> Maximum value =  3000
	* </pre>
	*/
	public void set_forcedtimeout(long forcedtimeout) throws Exception {
		this.forcedtimeout = new Long(forcedtimeout);
	}

	/**
	* <pre>
	* Maximum number of minutes a session is allowed to persist.<br> Minimum value =  1<br> Maximum value =  3000
	* </pre>
	*/
	public void set_forcedtimeout(Long forcedtimeout) throws Exception{
		this.forcedtimeout = forcedtimeout;
	}

	/**
	* <pre>
	* Maximum number of minutes a session is allowed to persist.<br> Minimum value =  1<br> Maximum value =  3000
	* </pre>
	*/
	public Long get_forcedtimeout() throws Exception {
		return this.forcedtimeout;
	}

	/**
	* <pre>
	* Number of minutes to warn a user before their session is removed by a forced time out.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_forcedtimeoutwarning(long forcedtimeoutwarning) throws Exception {
		this.forcedtimeoutwarning = new Long(forcedtimeoutwarning);
	}

	/**
	* <pre>
	* Number of minutes to warn a user before their session is removed by a forced time out.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_forcedtimeoutwarning(Long forcedtimeoutwarning) throws Exception{
		this.forcedtimeoutwarning = forcedtimeoutwarning;
	}

	/**
	* <pre>
	* Number of minutes to warn a user before their session is removed by a forced time out.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_forcedtimeoutwarning() throws Exception {
		return this.forcedtimeoutwarning;
	}

	/**
	* <pre>
	* NT domain to use with Smart Access when User Principle Name is not extracted from Active Directory.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public void set_ntdomain(String ntdomain) throws Exception{
		this.ntdomain = ntdomain;
	}

	/**
	* <pre>
	* NT domain to use with Smart Access when User Principle Name is not extracted from Active Directory.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public String get_ntdomain() throws Exception {
		return this.ntdomain;
	}

	/**
	* <pre>
	* Whether clientlessVPN is available to the session.
ON will make the session clientless and no client will be downloaded
OFF will download the client but the clientlessVPN will also be available
DISABLED will disable clientlessVPN altogether.<br> Possible values = ON, OFF, DISABLED
	* </pre>
	*/
	public void set_clientlessvpnmode(String clientlessvpnmode) throws Exception{
		this.clientlessvpnmode = clientlessvpnmode;
	}

	/**
	* <pre>
	* Whether clientlessVPN is available to the session.
ON will make the session clientless and no client will be downloaded
OFF will download the client but the clientlessVPN will also be available
DISABLED will disable clientlessVPN altogether.<br> Possible values = ON, OFF, DISABLED
	* </pre>
	*/
	public String get_clientlessvpnmode() throws Exception {
		return this.clientlessvpnmode;
	}

	/**
	* <pre>
	* Sets the EMail home for the portal.
	* </pre>
	*/
	public void set_emailhome(String emailhome) throws Exception{
		this.emailhome = emailhome;
	}

	/**
	* <pre>
	* Sets the EMail home for the portal.
	* </pre>
	*/
	public String get_emailhome() throws Exception {
		return this.emailhome;
	}

	/**
	* <pre>
	* URL encoding to be used in clientless mode.
No encoding will be done for TRANSPARENT.
Protocol and domain will be encoded or encrypted with OPAQUE or ENCRYPT respectively.<br> Possible values = TRANSPARENT, OPAQUE, ENCRYPT
	* </pre>
	*/
	public void set_clientlessmodeurlencoding(String clientlessmodeurlencoding) throws Exception{
		this.clientlessmodeurlencoding = clientlessmodeurlencoding;
	}

	/**
	* <pre>
	* URL encoding to be used in clientless mode.
No encoding will be done for TRANSPARENT.
Protocol and domain will be encoded or encrypted with OPAQUE or ENCRYPT respectively.<br> Possible values = TRANSPARENT, OPAQUE, ENCRYPT
	* </pre>
	*/
	public String get_clientlessmodeurlencoding() throws Exception {
		return this.clientlessmodeurlencoding;
	}

	/**
	* <pre>
	* Controls the use of persistent cookie in clientless mode.
ALLOW lets cookie to be stored on disk.
DENY prevents usage of persistent cookie.
PROMPT lets VPN user choose whether persistent cookie should be used or not.<br> Possible values = ALLOW, DENY, PROMPT
	* </pre>
	*/
	public void set_clientlesspersistentcookie(String clientlesspersistentcookie) throws Exception{
		this.clientlesspersistentcookie = clientlesspersistentcookie;
	}

	/**
	* <pre>
	* Controls the use of persistent cookie in clientless mode.
ALLOW lets cookie to be stored on disk.
DENY prevents usage of persistent cookie.
PROMPT lets VPN user choose whether persistent cookie should be used or not.<br> Possible values = ALLOW, DENY, PROMPT
	* </pre>
	*/
	public String get_clientlesspersistentcookie() throws Exception {
		return this.clientlesspersistentcookie;
	}

	/**
	* <pre>
	* The groups allowed login to VPN.<br> Minimum length =  1<br> Maximum length =  511
	* </pre>
	*/
	public void set_allowedlogingroups(String allowedlogingroups) throws Exception{
		this.allowedlogingroups = allowedlogingroups;
	}

	/**
	* <pre>
	* The groups allowed login to VPN.<br> Minimum length =  1<br> Maximum length =  511
	* </pre>
	*/
	public String get_allowedlogingroups() throws Exception {
		return this.allowedlogingroups;
	}

	/**
	* <pre>
	* Enable and Disable the Secure Browse functionality.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_securebrowse(String securebrowse) throws Exception{
		this.securebrowse = securebrowse;
	}

	/**
	* <pre>
	* Enable and Disable the Secure Browse functionality.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_securebrowse() throws Exception {
		return this.securebrowse;
	}

	/**
	* <pre>
	* The Account Service or Auto Discovery url for this session.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_storefronturl(String storefronturl) throws Exception{
		this.storefronturl = storefronturl;
	}

	/**
	* <pre>
	* The Account Service or Auto Discovery url for this session.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_storefronturl() throws Exception {
		return this.storefronturl;
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
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnsessionaction_response result = (vpnsessionaction_response) service.get_payload_formatter().string_to_resource(vpnsessionaction_response.class, response);
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
		return result.vpnsessionaction;
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
	* Use this API to add vpnsessionaction.
	*/
	public static base_response add(nitro_service client, vpnsessionaction resource) throws Exception {
		vpnsessionaction addresource = new vpnsessionaction();
		addresource.name = resource.name;
		addresource.httpport = resource.httpport;
		addresource.winsip = resource.winsip;
		addresource.dnsvservername = resource.dnsvservername;
		addresource.splitdns = resource.splitdns;
		addresource.sesstimeout = resource.sesstimeout;
		addresource.clientsecurity = resource.clientsecurity;
		addresource.clientsecuritygroup = resource.clientsecuritygroup;
		addresource.clientsecuritymessage = resource.clientsecuritymessage;
		addresource.clientsecuritylog = resource.clientsecuritylog;
		addresource.splittunnel = resource.splittunnel;
		addresource.locallanaccess = resource.locallanaccess;
		addresource.rfc1918 = resource.rfc1918;
		addresource.spoofiip = resource.spoofiip;
		addresource.killconnections = resource.killconnections;
		addresource.transparentinterception = resource.transparentinterception;
		addresource.windowsclienttype = resource.windowsclienttype;
		addresource.defaultauthorizationaction = resource.defaultauthorizationaction;
		addresource.authorizationgroup = resource.authorizationgroup;
		addresource.clientidletimeout = resource.clientidletimeout;
		addresource.proxy = resource.proxy;
		addresource.allprotocolproxy = resource.allprotocolproxy;
		addresource.httpproxy = resource.httpproxy;
		addresource.ftpproxy = resource.ftpproxy;
		addresource.socksproxy = resource.socksproxy;
		addresource.gopherproxy = resource.gopherproxy;
		addresource.sslproxy = resource.sslproxy;
		addresource.proxyexception = resource.proxyexception;
		addresource.proxylocalbypass = resource.proxylocalbypass;
		addresource.clientcleanupprompt = resource.clientcleanupprompt;
		addresource.forcecleanup = resource.forcecleanup;
		addresource.clientoptions = resource.clientoptions;
		addresource.clientconfiguration = resource.clientconfiguration;
		addresource.sso = resource.sso;
		addresource.ssocredential = resource.ssocredential;
		addresource.windowsautologon = resource.windowsautologon;
		addresource.usemip = resource.usemip;
		addresource.useiip = resource.useiip;
		addresource.clientdebug = resource.clientdebug;
		addresource.loginscript = resource.loginscript;
		addresource.logoutscript = resource.logoutscript;
		addresource.homepage = resource.homepage;
		addresource.icaproxy = resource.icaproxy;
		addresource.wihome = resource.wihome;
		addresource.citrixreceiverhome = resource.citrixreceiverhome;
		addresource.wiportalmode = resource.wiportalmode;
		addresource.clientchoices = resource.clientchoices;
		addresource.epaclienttype = resource.epaclienttype;
		addresource.iipdnssuffix = resource.iipdnssuffix;
		addresource.forcedtimeout = resource.forcedtimeout;
		addresource.forcedtimeoutwarning = resource.forcedtimeoutwarning;
		addresource.ntdomain = resource.ntdomain;
		addresource.clientlessvpnmode = resource.clientlessvpnmode;
		addresource.emailhome = resource.emailhome;
		addresource.clientlessmodeurlencoding = resource.clientlessmodeurlencoding;
		addresource.clientlesspersistentcookie = resource.clientlesspersistentcookie;
		addresource.allowedlogingroups = resource.allowedlogingroups;
		addresource.securebrowse = resource.securebrowse;
		addresource.storefronturl = resource.storefronturl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnsessionaction resources.
	*/
	public static base_responses add(nitro_service client, vpnsessionaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnsessionaction addresources[] = new vpnsessionaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnsessionaction();
				addresources[i].name = resources[i].name;
				addresources[i].httpport = resources[i].httpport;
				addresources[i].winsip = resources[i].winsip;
				addresources[i].dnsvservername = resources[i].dnsvservername;
				addresources[i].splitdns = resources[i].splitdns;
				addresources[i].sesstimeout = resources[i].sesstimeout;
				addresources[i].clientsecurity = resources[i].clientsecurity;
				addresources[i].clientsecuritygroup = resources[i].clientsecuritygroup;
				addresources[i].clientsecuritymessage = resources[i].clientsecuritymessage;
				addresources[i].clientsecuritylog = resources[i].clientsecuritylog;
				addresources[i].splittunnel = resources[i].splittunnel;
				addresources[i].locallanaccess = resources[i].locallanaccess;
				addresources[i].rfc1918 = resources[i].rfc1918;
				addresources[i].spoofiip = resources[i].spoofiip;
				addresources[i].killconnections = resources[i].killconnections;
				addresources[i].transparentinterception = resources[i].transparentinterception;
				addresources[i].windowsclienttype = resources[i].windowsclienttype;
				addresources[i].defaultauthorizationaction = resources[i].defaultauthorizationaction;
				addresources[i].authorizationgroup = resources[i].authorizationgroup;
				addresources[i].clientidletimeout = resources[i].clientidletimeout;
				addresources[i].proxy = resources[i].proxy;
				addresources[i].allprotocolproxy = resources[i].allprotocolproxy;
				addresources[i].httpproxy = resources[i].httpproxy;
				addresources[i].ftpproxy = resources[i].ftpproxy;
				addresources[i].socksproxy = resources[i].socksproxy;
				addresources[i].gopherproxy = resources[i].gopherproxy;
				addresources[i].sslproxy = resources[i].sslproxy;
				addresources[i].proxyexception = resources[i].proxyexception;
				addresources[i].proxylocalbypass = resources[i].proxylocalbypass;
				addresources[i].clientcleanupprompt = resources[i].clientcleanupprompt;
				addresources[i].forcecleanup = resources[i].forcecleanup;
				addresources[i].clientoptions = resources[i].clientoptions;
				addresources[i].clientconfiguration = resources[i].clientconfiguration;
				addresources[i].sso = resources[i].sso;
				addresources[i].ssocredential = resources[i].ssocredential;
				addresources[i].windowsautologon = resources[i].windowsautologon;
				addresources[i].usemip = resources[i].usemip;
				addresources[i].useiip = resources[i].useiip;
				addresources[i].clientdebug = resources[i].clientdebug;
				addresources[i].loginscript = resources[i].loginscript;
				addresources[i].logoutscript = resources[i].logoutscript;
				addresources[i].homepage = resources[i].homepage;
				addresources[i].icaproxy = resources[i].icaproxy;
				addresources[i].wihome = resources[i].wihome;
				addresources[i].citrixreceiverhome = resources[i].citrixreceiverhome;
				addresources[i].wiportalmode = resources[i].wiportalmode;
				addresources[i].clientchoices = resources[i].clientchoices;
				addresources[i].epaclienttype = resources[i].epaclienttype;
				addresources[i].iipdnssuffix = resources[i].iipdnssuffix;
				addresources[i].forcedtimeout = resources[i].forcedtimeout;
				addresources[i].forcedtimeoutwarning = resources[i].forcedtimeoutwarning;
				addresources[i].ntdomain = resources[i].ntdomain;
				addresources[i].clientlessvpnmode = resources[i].clientlessvpnmode;
				addresources[i].emailhome = resources[i].emailhome;
				addresources[i].clientlessmodeurlencoding = resources[i].clientlessmodeurlencoding;
				addresources[i].clientlesspersistentcookie = resources[i].clientlesspersistentcookie;
				addresources[i].allowedlogingroups = resources[i].allowedlogingroups;
				addresources[i].securebrowse = resources[i].securebrowse;
				addresources[i].storefronturl = resources[i].storefronturl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnsessionaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpnsessionaction deleteresource = new vpnsessionaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnsessionaction.
	*/
	public static base_response delete(nitro_service client, vpnsessionaction resource) throws Exception {
		vpnsessionaction deleteresource = new vpnsessionaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnsessionaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnsessionaction deleteresources[] = new vpnsessionaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpnsessionaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnsessionaction resources.
	*/
	public static base_responses delete(nitro_service client, vpnsessionaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnsessionaction deleteresources[] = new vpnsessionaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnsessionaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpnsessionaction.
	*/
	public static base_response update(nitro_service client, vpnsessionaction resource) throws Exception {
		vpnsessionaction updateresource = new vpnsessionaction();
		updateresource.name = resource.name;
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
		updateresource.emailhome = resource.emailhome;
		updateresource.clientlessmodeurlencoding = resource.clientlessmodeurlencoding;
		updateresource.clientlesspersistentcookie = resource.clientlesspersistentcookie;
		updateresource.allowedlogingroups = resource.allowedlogingroups;
		updateresource.securebrowse = resource.securebrowse;
		updateresource.storefronturl = resource.storefronturl;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpnsessionaction resources.
	*/
	public static base_responses update(nitro_service client, vpnsessionaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnsessionaction updateresources[] = new vpnsessionaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnsessionaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].httpport = resources[i].httpport;
				updateresources[i].winsip = resources[i].winsip;
				updateresources[i].dnsvservername = resources[i].dnsvservername;
				updateresources[i].splitdns = resources[i].splitdns;
				updateresources[i].sesstimeout = resources[i].sesstimeout;
				updateresources[i].clientsecurity = resources[i].clientsecurity;
				updateresources[i].clientsecuritygroup = resources[i].clientsecuritygroup;
				updateresources[i].clientsecuritymessage = resources[i].clientsecuritymessage;
				updateresources[i].clientsecuritylog = resources[i].clientsecuritylog;
				updateresources[i].splittunnel = resources[i].splittunnel;
				updateresources[i].locallanaccess = resources[i].locallanaccess;
				updateresources[i].rfc1918 = resources[i].rfc1918;
				updateresources[i].spoofiip = resources[i].spoofiip;
				updateresources[i].killconnections = resources[i].killconnections;
				updateresources[i].transparentinterception = resources[i].transparentinterception;
				updateresources[i].windowsclienttype = resources[i].windowsclienttype;
				updateresources[i].defaultauthorizationaction = resources[i].defaultauthorizationaction;
				updateresources[i].authorizationgroup = resources[i].authorizationgroup;
				updateresources[i].clientidletimeout = resources[i].clientidletimeout;
				updateresources[i].proxy = resources[i].proxy;
				updateresources[i].allprotocolproxy = resources[i].allprotocolproxy;
				updateresources[i].httpproxy = resources[i].httpproxy;
				updateresources[i].ftpproxy = resources[i].ftpproxy;
				updateresources[i].socksproxy = resources[i].socksproxy;
				updateresources[i].gopherproxy = resources[i].gopherproxy;
				updateresources[i].sslproxy = resources[i].sslproxy;
				updateresources[i].proxyexception = resources[i].proxyexception;
				updateresources[i].proxylocalbypass = resources[i].proxylocalbypass;
				updateresources[i].clientcleanupprompt = resources[i].clientcleanupprompt;
				updateresources[i].forcecleanup = resources[i].forcecleanup;
				updateresources[i].clientoptions = resources[i].clientoptions;
				updateresources[i].clientconfiguration = resources[i].clientconfiguration;
				updateresources[i].sso = resources[i].sso;
				updateresources[i].ssocredential = resources[i].ssocredential;
				updateresources[i].windowsautologon = resources[i].windowsautologon;
				updateresources[i].usemip = resources[i].usemip;
				updateresources[i].useiip = resources[i].useiip;
				updateresources[i].clientdebug = resources[i].clientdebug;
				updateresources[i].loginscript = resources[i].loginscript;
				updateresources[i].logoutscript = resources[i].logoutscript;
				updateresources[i].homepage = resources[i].homepage;
				updateresources[i].icaproxy = resources[i].icaproxy;
				updateresources[i].wihome = resources[i].wihome;
				updateresources[i].citrixreceiverhome = resources[i].citrixreceiverhome;
				updateresources[i].wiportalmode = resources[i].wiportalmode;
				updateresources[i].clientchoices = resources[i].clientchoices;
				updateresources[i].epaclienttype = resources[i].epaclienttype;
				updateresources[i].iipdnssuffix = resources[i].iipdnssuffix;
				updateresources[i].forcedtimeout = resources[i].forcedtimeout;
				updateresources[i].forcedtimeoutwarning = resources[i].forcedtimeoutwarning;
				updateresources[i].ntdomain = resources[i].ntdomain;
				updateresources[i].clientlessvpnmode = resources[i].clientlessvpnmode;
				updateresources[i].emailhome = resources[i].emailhome;
				updateresources[i].clientlessmodeurlencoding = resources[i].clientlessmodeurlencoding;
				updateresources[i].clientlesspersistentcookie = resources[i].clientlesspersistentcookie;
				updateresources[i].allowedlogingroups = resources[i].allowedlogingroups;
				updateresources[i].securebrowse = resources[i].securebrowse;
				updateresources[i].storefronturl = resources[i].storefronturl;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnsessionaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		vpnsessionaction unsetresource = new vpnsessionaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of vpnsessionaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpnsessionaction resource, String[] args) throws Exception{
		vpnsessionaction unsetresource = new vpnsessionaction();
		unsetresource.name = resource.name;
		unsetresource.httpport = resource.httpport;
		unsetresource.winsip = resource.winsip;
		unsetresource.dnsvservername = resource.dnsvservername;
		unsetresource.splitdns = resource.splitdns;
		unsetresource.sesstimeout = resource.sesstimeout;
		unsetresource.clientsecurity = resource.clientsecurity;
		unsetresource.clientsecuritygroup = resource.clientsecuritygroup;
		unsetresource.clientsecuritymessage = resource.clientsecuritymessage;
		unsetresource.clientsecuritylog = resource.clientsecuritylog;
		unsetresource.splittunnel = resource.splittunnel;
		unsetresource.locallanaccess = resource.locallanaccess;
		unsetresource.rfc1918 = resource.rfc1918;
		unsetresource.spoofiip = resource.spoofiip;
		unsetresource.killconnections = resource.killconnections;
		unsetresource.transparentinterception = resource.transparentinterception;
		unsetresource.windowsclienttype = resource.windowsclienttype;
		unsetresource.defaultauthorizationaction = resource.defaultauthorizationaction;
		unsetresource.authorizationgroup = resource.authorizationgroup;
		unsetresource.clientidletimeout = resource.clientidletimeout;
		unsetresource.proxy = resource.proxy;
		unsetresource.allprotocolproxy = resource.allprotocolproxy;
		unsetresource.httpproxy = resource.httpproxy;
		unsetresource.ftpproxy = resource.ftpproxy;
		unsetresource.socksproxy = resource.socksproxy;
		unsetresource.gopherproxy = resource.gopherproxy;
		unsetresource.sslproxy = resource.sslproxy;
		unsetresource.proxyexception = resource.proxyexception;
		unsetresource.proxylocalbypass = resource.proxylocalbypass;
		unsetresource.clientcleanupprompt = resource.clientcleanupprompt;
		unsetresource.forcecleanup = resource.forcecleanup;
		unsetresource.clientoptions = resource.clientoptions;
		unsetresource.clientconfiguration = resource.clientconfiguration;
		unsetresource.sso = resource.sso;
		unsetresource.ssocredential = resource.ssocredential;
		unsetresource.windowsautologon = resource.windowsautologon;
		unsetresource.usemip = resource.usemip;
		unsetresource.useiip = resource.useiip;
		unsetresource.clientdebug = resource.clientdebug;
		unsetresource.loginscript = resource.loginscript;
		unsetresource.logoutscript = resource.logoutscript;
		unsetresource.homepage = resource.homepage;
		unsetresource.icaproxy = resource.icaproxy;
		unsetresource.wihome = resource.wihome;
		unsetresource.citrixreceiverhome = resource.citrixreceiverhome;
		unsetresource.wiportalmode = resource.wiportalmode;
		unsetresource.clientchoices = resource.clientchoices;
		unsetresource.epaclienttype = resource.epaclienttype;
		unsetresource.iipdnssuffix = resource.iipdnssuffix;
		unsetresource.forcedtimeout = resource.forcedtimeout;
		unsetresource.forcedtimeoutwarning = resource.forcedtimeoutwarning;
		unsetresource.ntdomain = resource.ntdomain;
		unsetresource.clientlessvpnmode = resource.clientlessvpnmode;
		unsetresource.emailhome = resource.emailhome;
		unsetresource.clientlessmodeurlencoding = resource.clientlessmodeurlencoding;
		unsetresource.clientlesspersistentcookie = resource.clientlesspersistentcookie;
		unsetresource.allowedlogingroups = resource.allowedlogingroups;
		unsetresource.securebrowse = resource.securebrowse;
		unsetresource.storefronturl = resource.storefronturl;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpnsessionaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnsessionaction unsetresources[] = new vpnsessionaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new vpnsessionaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnsessionaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpnsessionaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnsessionaction unsetresources[] = new vpnsessionaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpnsessionaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].httpport = resources[i].httpport;
				unsetresources[i].winsip = resources[i].winsip;
				unsetresources[i].dnsvservername = resources[i].dnsvservername;
				unsetresources[i].splitdns = resources[i].splitdns;
				unsetresources[i].sesstimeout = resources[i].sesstimeout;
				unsetresources[i].clientsecurity = resources[i].clientsecurity;
				unsetresources[i].clientsecuritygroup = resources[i].clientsecuritygroup;
				unsetresources[i].clientsecuritymessage = resources[i].clientsecuritymessage;
				unsetresources[i].clientsecuritylog = resources[i].clientsecuritylog;
				unsetresources[i].splittunnel = resources[i].splittunnel;
				unsetresources[i].locallanaccess = resources[i].locallanaccess;
				unsetresources[i].rfc1918 = resources[i].rfc1918;
				unsetresources[i].spoofiip = resources[i].spoofiip;
				unsetresources[i].killconnections = resources[i].killconnections;
				unsetresources[i].transparentinterception = resources[i].transparentinterception;
				unsetresources[i].windowsclienttype = resources[i].windowsclienttype;
				unsetresources[i].defaultauthorizationaction = resources[i].defaultauthorizationaction;
				unsetresources[i].authorizationgroup = resources[i].authorizationgroup;
				unsetresources[i].clientidletimeout = resources[i].clientidletimeout;
				unsetresources[i].proxy = resources[i].proxy;
				unsetresources[i].allprotocolproxy = resources[i].allprotocolproxy;
				unsetresources[i].httpproxy = resources[i].httpproxy;
				unsetresources[i].ftpproxy = resources[i].ftpproxy;
				unsetresources[i].socksproxy = resources[i].socksproxy;
				unsetresources[i].gopherproxy = resources[i].gopherproxy;
				unsetresources[i].sslproxy = resources[i].sslproxy;
				unsetresources[i].proxyexception = resources[i].proxyexception;
				unsetresources[i].proxylocalbypass = resources[i].proxylocalbypass;
				unsetresources[i].clientcleanupprompt = resources[i].clientcleanupprompt;
				unsetresources[i].forcecleanup = resources[i].forcecleanup;
				unsetresources[i].clientoptions = resources[i].clientoptions;
				unsetresources[i].clientconfiguration = resources[i].clientconfiguration;
				unsetresources[i].sso = resources[i].sso;
				unsetresources[i].ssocredential = resources[i].ssocredential;
				unsetresources[i].windowsautologon = resources[i].windowsautologon;
				unsetresources[i].usemip = resources[i].usemip;
				unsetresources[i].useiip = resources[i].useiip;
				unsetresources[i].clientdebug = resources[i].clientdebug;
				unsetresources[i].loginscript = resources[i].loginscript;
				unsetresources[i].logoutscript = resources[i].logoutscript;
				unsetresources[i].homepage = resources[i].homepage;
				unsetresources[i].icaproxy = resources[i].icaproxy;
				unsetresources[i].wihome = resources[i].wihome;
				unsetresources[i].citrixreceiverhome = resources[i].citrixreceiverhome;
				unsetresources[i].wiportalmode = resources[i].wiportalmode;
				unsetresources[i].clientchoices = resources[i].clientchoices;
				unsetresources[i].epaclienttype = resources[i].epaclienttype;
				unsetresources[i].iipdnssuffix = resources[i].iipdnssuffix;
				unsetresources[i].forcedtimeout = resources[i].forcedtimeout;
				unsetresources[i].forcedtimeoutwarning = resources[i].forcedtimeoutwarning;
				unsetresources[i].ntdomain = resources[i].ntdomain;
				unsetresources[i].clientlessvpnmode = resources[i].clientlessvpnmode;
				unsetresources[i].emailhome = resources[i].emailhome;
				unsetresources[i].clientlessmodeurlencoding = resources[i].clientlessmodeurlencoding;
				unsetresources[i].clientlesspersistentcookie = resources[i].clientlesspersistentcookie;
				unsetresources[i].allowedlogingroups = resources[i].allowedlogingroups;
				unsetresources[i].securebrowse = resources[i].securebrowse;
				unsetresources[i].storefronturl = resources[i].storefronturl;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpnsessionaction resources that are configured on netscaler.
	*/
	public static vpnsessionaction[] get(nitro_service service) throws Exception{
		vpnsessionaction obj = new vpnsessionaction();
		vpnsessionaction[] response = (vpnsessionaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnsessionaction resources that are configured on netscaler.
	*/
	public static vpnsessionaction[] get(nitro_service service, options option) throws Exception{
		vpnsessionaction obj = new vpnsessionaction();
		vpnsessionaction[] response = (vpnsessionaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnsessionaction resource of given name .
	*/
	public static vpnsessionaction get(nitro_service service, String name) throws Exception{
		vpnsessionaction obj = new vpnsessionaction();
		obj.set_name(name);
		vpnsessionaction response = (vpnsessionaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnsessionaction resources of given names .
	*/
	public static vpnsessionaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpnsessionaction response[] = new vpnsessionaction[name.length];
			vpnsessionaction obj[] = new vpnsessionaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpnsessionaction();
				obj[i].set_name(name[i]);
				response[i] = (vpnsessionaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnsessionaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnsessionaction[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnsessionaction obj = new vpnsessionaction();
		options option = new options();
		option.set_filter(filter);
		vpnsessionaction[] response = (vpnsessionaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnsessionaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnsessionaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnsessionaction obj = new vpnsessionaction();
		options option = new options();
		option.set_filter(filter);
		vpnsessionaction[] response = (vpnsessionaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnsessionaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnsessionaction obj = new vpnsessionaction();
		options option = new options();
		option.set_count(true);
		vpnsessionaction[] response = (vpnsessionaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnsessionaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnsessionaction obj = new vpnsessionaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnsessionaction[] response = (vpnsessionaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnsessionaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnsessionaction obj = new vpnsessionaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnsessionaction[] response = (vpnsessionaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class spoofiipEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class transparentinterceptionEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class clientcleanuppromptEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
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
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
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
	public static class defaultauthorizationactionEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
	}
	public static class windowsautologonEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
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
	public static class rfc1918Enum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class proxylocalbypassEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ssocredentialEnum {
		public static final String PRIMARY = "PRIMARY";
		public static final String SECONDARY = "SECONDARY";
	}
	public static class clientlesspersistentcookieEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
		public static final String PROMPT = "PROMPT";
	}
	public static class locallanaccessEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class clientconfigurationEnum {
		public static final String none = "none";
		public static final String all = "all";
		public static final String general = "general";
		public static final String tunnel = "tunnel";
		public static final String trace = "trace";
		public static final String compression = "compression";
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
