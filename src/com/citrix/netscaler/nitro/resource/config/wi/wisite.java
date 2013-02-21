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
	private String sitetype;
	private String publishedresourcetype;
	private String kioskmode;
	private Long __count;

	/**
	* <pre>
	* The path of Web Interface site.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public void set_sitepath(String sitepath) throws Exception{
		this.sitepath = sitepath;
	}

	/**
	* <pre>
	* The path of Web Interface site.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public String get_sitepath() throws Exception {
		return this.sitepath;
	}

	/**
	* <pre>
	* The URL of Access Gateway.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_agurl(String agurl) throws Exception{
		this.agurl = agurl;
	}

	/**
	* <pre>
	* The URL of Access Gateway.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_agurl() throws Exception {
		return this.agurl;
	}

	/**
	* <pre>
	* The URL of Secure Ticket Authortity server.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_staurl(String staurl) throws Exception{
		this.staurl = staurl;
	}

	/**
	* <pre>
	* The URL of Secure Ticket Authortity server.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_staurl() throws Exception {
		return this.staurl;
	}

	/**
	* <pre>
	* The URL of the second Secure Ticket Authortity server.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_secondstaurl(String secondstaurl) throws Exception{
		this.secondstaurl = secondstaurl;
	}

	/**
	* <pre>
	* The URL of the second Secure Ticket Authortity server.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_secondstaurl() throws Exception {
		return this.secondstaurl;
	}

	/**
	* <pre>
	* Enables session reliability.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sessionreliability(String sessionreliability) throws Exception{
		this.sessionreliability = sessionreliability;
	}

	/**
	* <pre>
	* Enables session reliability.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sessionreliability() throws Exception {
		return this.sessionreliability;
	}

	/**
	* <pre>
	* Request tickets from two STA Servers, if available.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_usetwotickets(String usetwotickets) throws Exception{
		this.usetwotickets = usetwotickets;
	}

	/**
	* <pre>
	* Request tickets from two STA Servers, if available.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_usetwotickets() throws Exception {
		return this.usetwotickets;
	}

	/**
	* <pre>
	* The authentication point to be used for the site.<br> Possible values = WebInterface, AccessGateway
	* </pre>
	*/
	public void set_authenticationpoint(String authenticationpoint) throws Exception{
		this.authenticationpoint = authenticationpoint;
	}

	/**
	* <pre>
	* The authentication point to be used for the site.<br> Possible values = WebInterface, AccessGateway
	* </pre>
	*/
	public String get_authenticationpoint() throws Exception {
		return this.authenticationpoint;
	}

	/**
	* <pre>
	* AGEE Authentication method. Default value is Explicit when Authpoint is AcessGateway.<br> Possible values = Explicit, SmartCard
	* </pre>
	*/
	public void set_agauthenticationmethod(String agauthenticationmethod) throws Exception{
		this.agauthenticationmethod = agauthenticationmethod;
	}

	/**
	* <pre>
	* AGEE Authentication method. Default value is Explicit when Authpoint is AcessGateway.<br> Possible values = Explicit, SmartCard
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
	* Choice of language.<br> Default value: English<br> Possible values = German, English, Spanish, French, Japanese, Korean, Russian, Chinese_simplified, Chinese_traditional
	* </pre>
	*/
	public void set_defaultcustomtextlocale(String defaultcustomtextlocale) throws Exception{
		this.defaultcustomtextlocale = defaultcustomtextlocale;
	}

	/**
	* <pre>
	* Choice of language.<br> Default value: English<br> Possible values = German, English, Spanish, French, Japanese, Korean, Russian, Chinese_simplified, Chinese_traditional
	* </pre>
	*/
	public String get_defaultcustomtextlocale() throws Exception {
		return this.defaultcustomtextlocale;
	}

	/**
	* <pre>
	* Specifies the time-out value in minutes for idle Web browser sessions.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_websessiontimeout(long websessiontimeout) throws Exception {
		this.websessiontimeout = new Long(websessiontimeout);
	}

	/**
	* <pre>
	* Specifies the time-out value in minutes for idle Web browser sessions.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_websessiontimeout(Long websessiontimeout) throws Exception{
		this.websessiontimeout = websessiontimeout;
	}

	/**
	* <pre>
	* Specifies the time-out value in minutes for idle Web browser sessions.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_websessiontimeout() throws Exception {
		return this.websessiontimeout;
	}

	/**
	* <pre>
	* The default value of secure access method, which will be Direct in absence of agURL or GatewayDirect otherwise.<br> Possible values = Direct, Alternate, Translated, GatewayDirect, GatewayAlternate, GatewayTranslated
	* </pre>
	*/
	public void set_defaultaccessmethod(String defaultaccessmethod) throws Exception{
		this.defaultaccessmethod = defaultaccessmethod;
	}

	/**
	* <pre>
	* The default value of secure access method, which will be Direct in absence of agURL or GatewayDirect otherwise.<br> Possible values = Direct, Alternate, Translated, GatewayDirect, GatewayAlternate, GatewayTranslated
	* </pre>
	*/
	public String get_defaultaccessmethod() throws Exception {
		return this.defaultaccessmethod;
	}

	/**
	* <pre>
	* Title to be displayed on Login page.<br> Default value: "Welcome to Web Interface on NetScaler"<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_logintitle(String logintitle) throws Exception{
		this.logintitle = logintitle;
	}

	/**
	* <pre>
	* Title to be displayed on Login page.<br> Default value: "Welcome to Web Interface on NetScaler"<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_logintitle() throws Exception {
		return this.logintitle;
	}

	/**
	* <pre>
	* The type of site, whether site provides access through Web browser or XenApp Plugin.<br> Default value: XenAppWeb<br> Possible values = XenAppWeb, XenAppServices
	* </pre>
	*/
	public void set_sitetype(String sitetype) throws Exception{
		this.sitetype = sitetype;
	}

	/**
	* <pre>
	* The type of site, whether site provides access through Web browser or XenApp Plugin.<br> Default value: XenAppWeb<br> Possible values = XenAppWeb, XenAppServices
	* </pre>
	*/
	public String get_sitetype() throws Exception {
		return this.sitetype;
	}

	/**
	* <pre>
	* The method to access the published XenApp resources.<br> Default value: Online<br> Possible values = Online, Offline, DualMode
	* </pre>
	*/
	public void set_publishedresourcetype(String publishedresourcetype) throws Exception{
		this.publishedresourcetype = publishedresourcetype;
	}

	/**
	* <pre>
	* The method to access the published XenApp resources.<br> Default value: Online<br> Possible values = Online, Offline, DualMode
	* </pre>
	*/
	public String get_publishedresourcetype() throws Exception {
		return this.publishedresourcetype;
	}

	/**
	* <pre>
	* Enables Kiosk Mode (discard user customizations).<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_kioskmode(String kioskmode) throws Exception{
		this.kioskmode = kioskmode;
	}

	/**
	* <pre>
	* Enables Kiosk Mode (discard user customizations).<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_kioskmode() throws Exception {
		return this.kioskmode;
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
		addresource.sitetype = resource.sitetype;
		addresource.publishedresourcetype = resource.publishedresourcetype;
		addresource.kioskmode = resource.kioskmode;
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
				addresources[i].sitetype = resources[i].sitetype;
				addresources[i].publishedresourcetype = resources[i].publishedresourcetype;
				addresources[i].kioskmode = resources[i].kioskmode;
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
		updateresource.authenticationpoint = resource.authenticationpoint;
		updateresource.agauthenticationmethod = resource.agauthenticationmethod;
		updateresource.publishedresourcetype = resource.publishedresourcetype;
		updateresource.kioskmode = resource.kioskmode;
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
				updateresources[i].authenticationpoint = resources[i].authenticationpoint;
				updateresources[i].agauthenticationmethod = resources[i].agauthenticationmethod;
				updateresources[i].publishedresourcetype = resources[i].publishedresourcetype;
				updateresources[i].kioskmode = resources[i].kioskmode;
			}
			result = update_bulk_request(client, updateresources);
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
