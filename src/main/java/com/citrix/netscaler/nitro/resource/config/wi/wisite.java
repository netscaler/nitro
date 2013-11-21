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

package com.citrix.netscaler.nitro.resource.config.wi;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class wisite_response extends base_response
{
	public wisite[] wisite;
}
/**
* Configuration for WI site resource.
*/

public class wisite extends base_resource
{
	private String sitepath;
	private String agurl;
	private String staurl;
	private String secondstaurl;
	private String sessionreliability;
	private String usetwotickets;
	private String authenticationpoint;
	private String agauthenticationmethod;
	private String[] wiauthenticationmethods;
	private String defaultcustomtextlocale;
	private Long websessiontimeout;
	private String defaultaccessmethod;
	private String logintitle;
	private String appwelcomemessage;
	private String welcomemessage;
	private String footertext;
	private String loginsysmessage;
	private String preloginbutton;
	private String preloginmessage;
	private String prelogintitle;
	private String domainselection;
	private String sitetype;
	private String userinterfacebranding;
	private String publishedresourcetype;
	private String kioskmode;
	private String showsearch;
	private String showrefresh;
	private String wiuserinterfacemodes;
	private String userinterfacelayouts;
	private Long __count;

	/**
	* <pre>
	* Path to the Web Interface site being created on the NetScaler appliance.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public void set_sitepath(String sitepath) throws Exception{
		this.sitepath = sitepath;
	}

	/**
	* <pre>
	* Path to the Web Interface site being created on the NetScaler appliance.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public String get_sitepath() throws Exception {
		return this.sitepath;
	}

	/**
	* <pre>
	* URL of the Access Gateway.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_agurl(String agurl) throws Exception{
		this.agurl = agurl;
	}

	/**
	* <pre>
	* URL of the Access Gateway.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_agurl() throws Exception {
		return this.agurl;
	}

	/**
	* <pre>
	* URL of the Secure Ticket Authority (STA) server.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_staurl(String staurl) throws Exception{
		this.staurl = staurl;
	}

	/**
	* <pre>
	* URL of the Secure Ticket Authority (STA) server.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_staurl() throws Exception {
		return this.staurl;
	}

	/**
	* <pre>
	* URL of the second Secure Ticket Authority (STA) server.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_secondstaurl(String secondstaurl) throws Exception{
		this.secondstaurl = secondstaurl;
	}

	/**
	* <pre>
	* URL of the second Secure Ticket Authority (STA) server.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_secondstaurl() throws Exception {
		return this.secondstaurl;
	}

	/**
	* <pre>
	* Enable session reliability through Access Gateway.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sessionreliability(String sessionreliability) throws Exception{
		this.sessionreliability = sessionreliability;
	}

	/**
	* <pre>
	* Enable session reliability through Access Gateway.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sessionreliability() throws Exception {
		return this.sessionreliability;
	}

	/**
	* <pre>
	* Request tickets issued by two separate Secure Ticket Authorities (STA) when a resource is accessed.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_usetwotickets(String usetwotickets) throws Exception{
		this.usetwotickets = usetwotickets;
	}

	/**
	* <pre>
	* Request tickets issued by two separate Secure Ticket Authorities (STA) when a resource is accessed.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_usetwotickets() throws Exception {
		return this.usetwotickets;
	}

	/**
	* <pre>
	* Authentication point for the Web Interface site.<br> Possible values = WebInterface, AccessGateway
	* </pre>
	*/
	public void set_authenticationpoint(String authenticationpoint) throws Exception{
		this.authenticationpoint = authenticationpoint;
	}

	/**
	* <pre>
	* Authentication point for the Web Interface site.<br> Possible values = WebInterface, AccessGateway
	* </pre>
	*/
	public String get_authenticationpoint() throws Exception {
		return this.authenticationpoint;
	}

	/**
	* <pre>
	* Method for authenticating a Web Interface site if you have specified Web Interface as the authentication point.
                            Available settings function as follows:
                            * Explicit - Users must provide a user name and password to log on to the Web Interface.
                            * Anonymous - Users can log on to the Web Interface without providing a user name and password. They have access to resources published for anonymous users.<br> Possible values = Explicit, SmartCard
	* </pre>
	*/
	public void set_agauthenticationmethod(String agauthenticationmethod) throws Exception{
		this.agauthenticationmethod = agauthenticationmethod;
	}

	/**
	* <pre>
	* Method for authenticating a Web Interface site if you have specified Web Interface as the authentication point.
                            Available settings function as follows:
                            * Explicit - Users must provide a user name and password to log on to the Web Interface.
                            * Anonymous - Users can log on to the Web Interface without providing a user name and password. They have access to resources published for anonymous users.<br> Possible values = Explicit, SmartCard
	* </pre>
	*/
	public String get_agauthenticationmethod() throws Exception {
		return this.agauthenticationmethod;
	}

	/**
	* <pre>
	* The method of authentication to be used at Web Interface.<br> Default value: Explicit<br> Possible values = Explicit, Anonymous
	* </pre>
	*/
	public void set_wiauthenticationmethods(String[] wiauthenticationmethods) throws Exception{
		this.wiauthenticationmethods = wiauthenticationmethods;
	}

	/**
	* <pre>
	* The method of authentication to be used at Web Interface.<br> Default value: Explicit<br> Possible values = Explicit, Anonymous
	* </pre>
	*/
	public String[] get_wiauthenticationmethods() throws Exception {
		return this.wiauthenticationmethods;
	}

	/**
	* <pre>
	* Default language for the Web Interface site.<br> Default value: English<br> Possible values = German, English, Spanish, French, Japanese, Korean, Russian, Chinese_simplified, Chinese_traditional
	* </pre>
	*/
	public void set_defaultcustomtextlocale(String defaultcustomtextlocale) throws Exception{
		this.defaultcustomtextlocale = defaultcustomtextlocale;
	}

	/**
	* <pre>
	* Default language for the Web Interface site.<br> Default value: English<br> Possible values = German, English, Spanish, French, Japanese, Korean, Russian, Chinese_simplified, Chinese_traditional
	* </pre>
	*/
	public String get_defaultcustomtextlocale() throws Exception {
		return this.defaultcustomtextlocale;
	}

	/**
	* <pre>
	* Time-out, in minutes, for idle Web Interface browser sessions. If a client's session is idle for a time that exceeds the time-out value, the NetScaler appliance terminates the connection.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_websessiontimeout(long websessiontimeout) throws Exception {
		this.websessiontimeout = new Long(websessiontimeout);
	}

	/**
	* <pre>
	* Time-out, in minutes, for idle Web Interface browser sessions. If a client's session is idle for a time that exceeds the time-out value, the NetScaler appliance terminates the connection.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_websessiontimeout(Long websessiontimeout) throws Exception{
		this.websessiontimeout = websessiontimeout;
	}

	/**
	* <pre>
	* Time-out, in minutes, for idle Web Interface browser sessions. If a client's session is idle for a time that exceeds the time-out value, the NetScaler appliance terminates the connection.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_websessiontimeout() throws Exception {
		return this.websessiontimeout;
	}

	/**
	* <pre>
	* Default access method for clients accessing the Web Interface site.
            
            Note: Before you configure an access method based on the client IP address, you must enable USIP mode on the Web Interface service to make the client’s IP address available with the Web Interface.
            Depending on whether the Web Interface site is configured to use an HTTP or HTTPS virtual server or to use access gateway, you can send clients or access gateway the IP address, or the alternate address, of a XenApp or XenDesktop server. Or, you can send the IP address translated from a mapping entry, which defines mapping of an internal address and port to an external address and port.
            Note: In the NetScaler command line, mapping entries can be created by using the bind wi site command.<br> Possible values = Direct, Alternate, Translated, GatewayDirect, GatewayAlternate, GatewayTranslated
	* </pre>
	*/
	public void set_defaultaccessmethod(String defaultaccessmethod) throws Exception{
		this.defaultaccessmethod = defaultaccessmethod;
	}

	/**
	* <pre>
	* Default access method for clients accessing the Web Interface site.
            
            Note: Before you configure an access method based on the client IP address, you must enable USIP mode on the Web Interface service to make the client’s IP address available with the Web Interface.
            Depending on whether the Web Interface site is configured to use an HTTP or HTTPS virtual server or to use access gateway, you can send clients or access gateway the IP address, or the alternate address, of a XenApp or XenDesktop server. Or, you can send the IP address translated from a mapping entry, which defines mapping of an internal address and port to an external address and port.
            Note: In the NetScaler command line, mapping entries can be created by using the bind wi site command.<br> Possible values = Direct, Alternate, Translated, GatewayDirect, GatewayAlternate, GatewayTranslated
	* </pre>
	*/
	public String get_defaultaccessmethod() throws Exception {
		return this.defaultaccessmethod;
	}

	/**
	* <pre>
	* A custom login page title for the Web Interface site.<br> Default value: "Welcome to Web Interface on NetScaler"<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_logintitle(String logintitle) throws Exception{
		this.logintitle = logintitle;
	}

	/**
	* <pre>
	* A custom login page title for the Web Interface site.<br> Default value: "Welcome to Web Interface on NetScaler"<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_logintitle() throws Exception {
		return this.logintitle;
	}

	/**
	* <pre>
	* Specifies localized text to appear at the top of the main content area of the Applications screen. LanguageCode is en, de, es, fr, ja, or any other supported language identifier.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_appwelcomemessage(String appwelcomemessage) throws Exception{
		this.appwelcomemessage = appwelcomemessage;
	}

	/**
	* <pre>
	* Specifies localized text to appear at the top of the main content area of the Applications screen. LanguageCode is en, de, es, fr, ja, or any other supported language identifier.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_appwelcomemessage() throws Exception {
		return this.appwelcomemessage;
	}

	/**
	* <pre>
	* Localized welcome message that appears on the welcome area of the login screen.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_welcomemessage(String welcomemessage) throws Exception{
		this.welcomemessage = welcomemessage;
	}

	/**
	* <pre>
	* Localized welcome message that appears on the welcome area of the login screen.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_welcomemessage() throws Exception {
		return this.welcomemessage;
	}

	/**
	* <pre>
	* Localized text that appears in the footer area of all pages.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_footertext(String footertext) throws Exception{
		this.footertext = footertext;
	}

	/**
	* <pre>
	* Localized text that appears in the footer area of all pages.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_footertext() throws Exception {
		return this.footertext;
	}

	/**
	* <pre>
	* Localized text that appears at the bottom of the main content area of the login screen.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_loginsysmessage(String loginsysmessage) throws Exception{
		this.loginsysmessage = loginsysmessage;
	}

	/**
	* <pre>
	* Localized text that appears at the bottom of the main content area of the login screen.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_loginsysmessage() throws Exception {
		return this.loginsysmessage;
	}

	/**
	* <pre>
	* Localized text that appears as the name of the pre-login message confirmation button.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_preloginbutton(String preloginbutton) throws Exception{
		this.preloginbutton = preloginbutton;
	}

	/**
	* <pre>
	* Localized text that appears as the name of the pre-login message confirmation button.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_preloginbutton() throws Exception {
		return this.preloginbutton;
	}

	/**
	* <pre>
	* Localized text that appears on the pre-login message page.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_preloginmessage(String preloginmessage) throws Exception{
		this.preloginmessage = preloginmessage;
	}

	/**
	* <pre>
	* Localized text that appears on the pre-login message page.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_preloginmessage() throws Exception {
		return this.preloginmessage;
	}

	/**
	* <pre>
	* Localized text that appears as the title of the pre-login message page.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_prelogintitle(String prelogintitle) throws Exception{
		this.prelogintitle = prelogintitle;
	}

	/**
	* <pre>
	* Localized text that appears as the title of the pre-login message page.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_prelogintitle() throws Exception {
		return this.prelogintitle;
	}

	/**
	* <pre>
	* Domain names listed on the login screen for explicit authentication.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_domainselection(String domainselection) throws Exception{
		this.domainselection = domainselection;
	}

	/**
	* <pre>
	* Domain names listed on the login screen for explicit authentication.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_domainselection() throws Exception {
		return this.domainselection;
	}

	/**
	* <pre>
	* Type of access to the Web Interface site. Available settings function as follows:
* XenApp/XenDesktop web site - Configures the Web Interface site for access by a web browser.
* XenApp/XenDesktop services site - Configures the Web Interface site for access by the XenApp plug-in.<br> Default value: XenAppWeb<br> Possible values = XenAppWeb, XenAppServices
	* </pre>
	*/
	public void set_sitetype(String sitetype) throws Exception{
		this.sitetype = sitetype;
	}

	/**
	* <pre>
	* Type of access to the Web Interface site. Available settings function as follows:
* XenApp/XenDesktop web site - Configures the Web Interface site for access by a web browser.
* XenApp/XenDesktop services site - Configures the Web Interface site for access by the XenApp plug-in.<br> Default value: XenAppWeb<br> Possible values = XenAppWeb, XenAppServices
	* </pre>
	*/
	public String get_sitetype() throws Exception {
		return this.sitetype;
	}

	/**
	* <pre>
	* Specifies whether the site is focused towards users accessing applications or desktops. Setting the parameter to Desktops changes the functionality of the site to improve the experience for XenDesktop users. Citrix recommends using this setting for any deployment that includes XenDesktop.<br> Default value: Applications<br> Possible values = Desktops, Applications
	* </pre>
	*/
	public void set_userinterfacebranding(String userinterfacebranding) throws Exception{
		this.userinterfacebranding = userinterfacebranding;
	}

	/**
	* <pre>
	* Specifies whether the site is focused towards users accessing applications or desktops. Setting the parameter to Desktops changes the functionality of the site to improve the experience for XenDesktop users. Citrix recommends using this setting for any deployment that includes XenDesktop.<br> Default value: Applications<br> Possible values = Desktops, Applications
	* </pre>
	*/
	public String get_userinterfacebranding() throws Exception {
		return this.userinterfacebranding;
	}

	/**
	* <pre>
	* Method for accessing the published XenApp and XenDesktop resources. 
            Available settings function as follows:
            * Online - Allows applications to be launched on the XenApp and XenDesktop servers. 
            * Offline - Allows streaming of applications to the client. 
            * DualMode - Allows both online and offline modes.<br> Default value: Online<br> Possible values = Online, Offline, DualMode
	* </pre>
	*/
	public void set_publishedresourcetype(String publishedresourcetype) throws Exception{
		this.publishedresourcetype = publishedresourcetype;
	}

	/**
	* <pre>
	* Method for accessing the published XenApp and XenDesktop resources. 
            Available settings function as follows:
            * Online - Allows applications to be launched on the XenApp and XenDesktop servers. 
            * Offline - Allows streaming of applications to the client. 
            * DualMode - Allows both online and offline modes.<br> Default value: Online<br> Possible values = Online, Offline, DualMode
	* </pre>
	*/
	public String get_publishedresourcetype() throws Exception {
		return this.publishedresourcetype;
	}

	/**
	* <pre>
	* User settings do not persist from one session to another.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_kioskmode(String kioskmode) throws Exception{
		this.kioskmode = kioskmode;
	}

	/**
	* <pre>
	* User settings do not persist from one session to another.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_kioskmode() throws Exception {
		return this.kioskmode;
	}

	/**
	* <pre>
	* Enables search option on XenApp websites.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_showsearch(String showsearch) throws Exception{
		this.showsearch = showsearch;
	}

	/**
	* <pre>
	* Enables search option on XenApp websites.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_showsearch() throws Exception {
		return this.showsearch;
	}

	/**
	* <pre>
	* Provides the Refresh button on the applications screen.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_showrefresh(String showrefresh) throws Exception{
		this.showrefresh = showrefresh;
	}

	/**
	* <pre>
	* Provides the Refresh button on the applications screen.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_showrefresh() throws Exception {
		return this.showrefresh;
	}

	/**
	* <pre>
	* Appearance of the login screen.
	    * Simple - Only the login fields for the selected authentication method are displayed.
	    * Advanced - Displays the navigation bar, which provides access to the pre-login messages and preferences screens.<br> Default value: SIMPLE<br> Possible values = SIMPLE, ADVANCED
	* </pre>
	*/
	public void set_wiuserinterfacemodes(String wiuserinterfacemodes) throws Exception{
		this.wiuserinterfacemodes = wiuserinterfacemodes;
	}

	/**
	* <pre>
	* Appearance of the login screen.
	    * Simple - Only the login fields for the selected authentication method are displayed.
	    * Advanced - Displays the navigation bar, which provides access to the pre-login messages and preferences screens.<br> Default value: SIMPLE<br> Possible values = SIMPLE, ADVANCED
	* </pre>
	*/
	public String get_wiuserinterfacemodes() throws Exception {
		return this.wiuserinterfacemodes;
	}

	/**
	* <pre>
	* Specifies whether or not to use the compact user interface.<br> Default value: AUTO<br> Possible values = AUTO, NORMAL, COMPACT
	* </pre>
	*/
	public void set_userinterfacelayouts(String userinterfacelayouts) throws Exception{
		this.userinterfacelayouts = userinterfacelayouts;
	}

	/**
	* <pre>
	* Specifies whether or not to use the compact user interface.<br> Default value: AUTO<br> Possible values = AUTO, NORMAL, COMPACT
	* </pre>
	*/
	public String get_userinterfacelayouts() throws Exception {
		return this.userinterfacelayouts;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		wisite_response result = (wisite_response) service.get_payload_formatter().string_to_resource(wisite_response.class, response);
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
		return result.wisite;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitepath;
	}

	/**
	* Use this API to add wisite.
	*/
	public static base_response add(nitro_service client, wisite resource) throws Exception {
		wisite addresource = new wisite();
		addresource.sitepath = resource.sitepath;
		addresource.agurl = resource.agurl;
		addresource.staurl = resource.staurl;
		addresource.secondstaurl = resource.secondstaurl;
		addresource.sessionreliability = resource.sessionreliability;
		addresource.usetwotickets = resource.usetwotickets;
		addresource.authenticationpoint = resource.authenticationpoint;
		addresource.agauthenticationmethod = resource.agauthenticationmethod;
		addresource.wiauthenticationmethods = resource.wiauthenticationmethods;
		addresource.defaultcustomtextlocale = resource.defaultcustomtextlocale;
		addresource.websessiontimeout = resource.websessiontimeout;
		addresource.defaultaccessmethod = resource.defaultaccessmethod;
		addresource.logintitle = resource.logintitle;
		addresource.appwelcomemessage = resource.appwelcomemessage;
		addresource.welcomemessage = resource.welcomemessage;
		addresource.footertext = resource.footertext;
		addresource.loginsysmessage = resource.loginsysmessage;
		addresource.preloginbutton = resource.preloginbutton;
		addresource.preloginmessage = resource.preloginmessage;
		addresource.prelogintitle = resource.prelogintitle;
		addresource.domainselection = resource.domainselection;
		addresource.sitetype = resource.sitetype;
		addresource.userinterfacebranding = resource.userinterfacebranding;
		addresource.publishedresourcetype = resource.publishedresourcetype;
		addresource.kioskmode = resource.kioskmode;
		addresource.showsearch = resource.showsearch;
		addresource.showrefresh = resource.showrefresh;
		addresource.wiuserinterfacemodes = resource.wiuserinterfacemodes;
		addresource.userinterfacelayouts = resource.userinterfacelayouts;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add wisite resources.
	*/
	public static base_responses add(nitro_service client, wisite resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite addresources[] = new wisite[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new wisite();
				addresources[i].sitepath = resources[i].sitepath;
				addresources[i].agurl = resources[i].agurl;
				addresources[i].staurl = resources[i].staurl;
				addresources[i].secondstaurl = resources[i].secondstaurl;
				addresources[i].sessionreliability = resources[i].sessionreliability;
				addresources[i].usetwotickets = resources[i].usetwotickets;
				addresources[i].authenticationpoint = resources[i].authenticationpoint;
				addresources[i].agauthenticationmethod = resources[i].agauthenticationmethod;
				addresources[i].wiauthenticationmethods = resources[i].wiauthenticationmethods;
				addresources[i].defaultcustomtextlocale = resources[i].defaultcustomtextlocale;
				addresources[i].websessiontimeout = resources[i].websessiontimeout;
				addresources[i].defaultaccessmethod = resources[i].defaultaccessmethod;
				addresources[i].logintitle = resources[i].logintitle;
				addresources[i].appwelcomemessage = resources[i].appwelcomemessage;
				addresources[i].welcomemessage = resources[i].welcomemessage;
				addresources[i].footertext = resources[i].footertext;
				addresources[i].loginsysmessage = resources[i].loginsysmessage;
				addresources[i].preloginbutton = resources[i].preloginbutton;
				addresources[i].preloginmessage = resources[i].preloginmessage;
				addresources[i].prelogintitle = resources[i].prelogintitle;
				addresources[i].domainselection = resources[i].domainselection;
				addresources[i].sitetype = resources[i].sitetype;
				addresources[i].userinterfacebranding = resources[i].userinterfacebranding;
				addresources[i].publishedresourcetype = resources[i].publishedresourcetype;
				addresources[i].kioskmode = resources[i].kioskmode;
				addresources[i].showsearch = resources[i].showsearch;
				addresources[i].showrefresh = resources[i].showrefresh;
				addresources[i].wiuserinterfacemodes = resources[i].wiuserinterfacemodes;
				addresources[i].userinterfacelayouts = resources[i].userinterfacelayouts;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete wisite of given name.
	*/
	public static base_response delete(nitro_service client, String sitepath) throws Exception {
		wisite deleteresource = new wisite();
		deleteresource.sitepath = sitepath;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete wisite.
	*/
	public static base_response delete(nitro_service client, wisite resource) throws Exception {
		wisite deleteresource = new wisite();
		deleteresource.sitepath = resource.sitepath;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete wisite resources of given names.
	*/
	public static base_responses delete(nitro_service client, String sitepath[]) throws Exception {
		base_responses result = null;
		if (sitepath != null && sitepath.length > 0) {
			wisite deleteresources[] = new wisite[sitepath.length];
			for (int i=0;i<sitepath.length;i++){
				deleteresources[i] = new wisite();
				deleteresources[i].sitepath = sitepath[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete wisite resources.
	*/
	public static base_responses delete(nitro_service client, wisite resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite deleteresources[] = new wisite[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new wisite();
				deleteresources[i].sitepath = resources[i].sitepath;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update wisite.
	*/
	public static base_response update(nitro_service client, wisite resource) throws Exception {
		wisite updateresource = new wisite();
		updateresource.sitepath = resource.sitepath;
		updateresource.agurl = resource.agurl;
		updateresource.staurl = resource.staurl;
		updateresource.sessionreliability = resource.sessionreliability;
		updateresource.usetwotickets = resource.usetwotickets;
		updateresource.secondstaurl = resource.secondstaurl;
		updateresource.wiauthenticationmethods = resource.wiauthenticationmethods;
		updateresource.defaultaccessmethod = resource.defaultaccessmethod;
		updateresource.defaultcustomtextlocale = resource.defaultcustomtextlocale;
		updateresource.websessiontimeout = resource.websessiontimeout;
		updateresource.logintitle = resource.logintitle;
		updateresource.appwelcomemessage = resource.appwelcomemessage;
		updateresource.welcomemessage = resource.welcomemessage;
		updateresource.footertext = resource.footertext;
		updateresource.loginsysmessage = resource.loginsysmessage;
		updateresource.preloginbutton = resource.preloginbutton;
		updateresource.preloginmessage = resource.preloginmessage;
		updateresource.prelogintitle = resource.prelogintitle;
		updateresource.domainselection = resource.domainselection;
		updateresource.userinterfacebranding = resource.userinterfacebranding;
		updateresource.authenticationpoint = resource.authenticationpoint;
		updateresource.agauthenticationmethod = resource.agauthenticationmethod;
		updateresource.publishedresourcetype = resource.publishedresourcetype;
		updateresource.kioskmode = resource.kioskmode;
		updateresource.showsearch = resource.showsearch;
		updateresource.showrefresh = resource.showrefresh;
		updateresource.wiuserinterfacemodes = resource.wiuserinterfacemodes;
		updateresource.userinterfacelayouts = resource.userinterfacelayouts;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update wisite resources.
	*/
	public static base_responses update(nitro_service client, wisite resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite updateresources[] = new wisite[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new wisite();
				updateresources[i].sitepath = resources[i].sitepath;
				updateresources[i].agurl = resources[i].agurl;
				updateresources[i].staurl = resources[i].staurl;
				updateresources[i].sessionreliability = resources[i].sessionreliability;
				updateresources[i].usetwotickets = resources[i].usetwotickets;
				updateresources[i].secondstaurl = resources[i].secondstaurl;
				updateresources[i].wiauthenticationmethods = resources[i].wiauthenticationmethods;
				updateresources[i].defaultaccessmethod = resources[i].defaultaccessmethod;
				updateresources[i].defaultcustomtextlocale = resources[i].defaultcustomtextlocale;
				updateresources[i].websessiontimeout = resources[i].websessiontimeout;
				updateresources[i].logintitle = resources[i].logintitle;
				updateresources[i].appwelcomemessage = resources[i].appwelcomemessage;
				updateresources[i].welcomemessage = resources[i].welcomemessage;
				updateresources[i].footertext = resources[i].footertext;
				updateresources[i].loginsysmessage = resources[i].loginsysmessage;
				updateresources[i].preloginbutton = resources[i].preloginbutton;
				updateresources[i].preloginmessage = resources[i].preloginmessage;
				updateresources[i].prelogintitle = resources[i].prelogintitle;
				updateresources[i].domainselection = resources[i].domainselection;
				updateresources[i].userinterfacebranding = resources[i].userinterfacebranding;
				updateresources[i].authenticationpoint = resources[i].authenticationpoint;
				updateresources[i].agauthenticationmethod = resources[i].agauthenticationmethod;
				updateresources[i].publishedresourcetype = resources[i].publishedresourcetype;
				updateresources[i].kioskmode = resources[i].kioskmode;
				updateresources[i].showsearch = resources[i].showsearch;
				updateresources[i].showrefresh = resources[i].showrefresh;
				updateresources[i].wiuserinterfacemodes = resources[i].wiuserinterfacemodes;
				updateresources[i].userinterfacelayouts = resources[i].userinterfacelayouts;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of wisite resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, wisite resource, String[] args) throws Exception{
		wisite unsetresource = new wisite();
		unsetresource.sitepath = resource.sitepath;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of wisite resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String sitepath[], String args[]) throws Exception {
		base_responses result = null;
		if (sitepath != null && sitepath.length > 0) {
			wisite unsetresources[] = new wisite[sitepath.length];
			for (int i=0;i<sitepath.length;i++){
				unsetresources[i] = new wisite();
				unsetresources[i].sitepath = sitepath[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of wisite resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, wisite resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite unsetresources[] = new wisite[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new wisite();
				unsetresources[i].sitepath = resources[i].sitepath;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the wisite resources that are configured on netscaler.
	*/
	public static wisite[] get(nitro_service service) throws Exception{
		wisite obj = new wisite();
		wisite[] response = (wisite[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the wisite resources that are configured on netscaler.
	*/
	public static wisite[] get(nitro_service service, options option) throws Exception{
		wisite obj = new wisite();
		wisite[] response = (wisite[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch wisite resource of given name .
	*/
	public static wisite get(nitro_service service, String sitepath) throws Exception{
		wisite obj = new wisite();
		obj.set_sitepath(sitepath);
		wisite response = (wisite) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch wisite resources of given names .
	*/
	public static wisite[] get(nitro_service service, String sitepath[]) throws Exception{
		if (sitepath !=null && sitepath.length>0) {
			wisite response[] = new wisite[sitepath.length];
			wisite obj[] = new wisite[sitepath.length];
			for (int i=0;i<sitepath.length;i++) {
				obj[i] = new wisite();
				obj[i].set_sitepath(sitepath[i]);
				response[i] = (wisite) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of wisite resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static wisite[] get_filtered(nitro_service service, String filter) throws Exception{
		wisite obj = new wisite();
		options option = new options();
		option.set_filter(filter);
		wisite[] response = (wisite[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of wisite resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static wisite[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		wisite obj = new wisite();
		options option = new options();
		option.set_filter(filter);
		wisite[] response = (wisite[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the wisite resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		wisite obj = new wisite();
		options option = new options();
		option.set_count(true);
		wisite[] response = (wisite[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of wisite resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		wisite obj = new wisite();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		wisite[] response = (wisite[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of wisite resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		wisite obj = new wisite();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		wisite[] response = (wisite[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class sessionreliabilityEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class showsearchEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class showrefreshEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class userinterfacelayoutsEnum {
		public static final String AUTO = "AUTO";
		public static final String NORMAL = "NORMAL";
		public static final String COMPACT = "COMPACT";
	}
	public static class wiauthenticationmethodsEnum {
		public static final String Explicit = "Explicit";
		public static final String Anonymous = "Anonymous";
	}
	public static class defaultaccessmethodEnum {
		public static final String Direct = "Direct";
		public static final String Alternate = "Alternate";
		public static final String Translated = "Translated";
		public static final String GatewayDirect = "GatewayDirect";
		public static final String GatewayAlternate = "GatewayAlternate";
		public static final String GatewayTranslated = "GatewayTranslated";
	}
	public static class wiuserinterfacemodesEnum {
		public static final String SIMPLE = "SIMPLE";
		public static final String ADVANCED = "ADVANCED";
	}
	public static class publishedresourcetypeEnum {
		public static final String Online = "Online";
		public static final String Offline = "Offline";
		public static final String DualMode = "DualMode";
	}
	public static class usetwoticketsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class agauthenticationmethodEnum {
		public static final String Explicit = "Explicit";
		public static final String SmartCard = "SmartCard";
	}
	public static class authenticationpointEnum {
		public static final String WebInterface = "WebInterface";
		public static final String AccessGateway = "AccessGateway";
	}
	public static class sitetypeEnum {
		public static final String XenAppWeb = "XenAppWeb";
		public static final String XenAppServices = "XenAppServices";
	}
	public static class userinterfacebrandingEnum {
		public static final String Desktops = "Desktops";
		public static final String Applications = "Applications";
	}
	public static class defaultcustomtextlocaleEnum {
		public static final String German = "German";
		public static final String English = "English";
		public static final String Spanish = "Spanish";
		public static final String French = "French";
		public static final String Japanese = "Japanese";
		public static final String Korean = "Korean";
		public static final String Russian = "Russian";
		public static final String Chinese_simplified = "Chinese_simplified";
		public static final String Chinese_traditional = "Chinese_traditional";
	}
	public static class kioskmodeEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
