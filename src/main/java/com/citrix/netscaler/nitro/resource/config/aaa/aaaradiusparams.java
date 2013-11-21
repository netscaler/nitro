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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaaradiusparams_response extends base_response
{
	public aaaradiusparams aaaradiusparams;
}
/**
* Configuration for RADIUS parameter resource.
*/

public class aaaradiusparams extends base_resource
{
	private String serverip;
	private Integer serverport;
	private Long authtimeout;
	private String radkey;
	private String radnasip;
	private String radnasid;
	private Long radvendorid;
	private Long radattributetype;
	private String radgroupsprefix;
	private String radgroupseparator;
	private String passencoding;
	private Long ipvendorid;
	private Long ipattributetype;
	private String accounting;
	private Long pwdvendorid;
	private Long pwdattributetype;
	private String defaultauthenticationgroup;
	private String callingstationid;

	//------- Read only Parameter ---------;

	private String groupauthname;
	private String ipaddress;

	/**
	* <pre>
	* IP address of your RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* IP address of your RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* Port number on which the RADIUS server listens for connections.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* Port number on which the RADIUS server listens for connections.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* Port number on which the RADIUS server listens for connections.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* Maximum number of seconds that the NetScaler appliance waits for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(long authtimeout) throws Exception {
		this.authtimeout = new Long(authtimeout);
	}

	/**
	* <pre>
	* Maximum number of seconds that the NetScaler appliance waits for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(Long authtimeout) throws Exception{
		this.authtimeout = authtimeout;
	}

	/**
	* <pre>
	* Maximum number of seconds that the NetScaler appliance waits for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public Long get_authtimeout() throws Exception {
		return this.authtimeout;
	}

	/**
	* <pre>
	* The key shared between the RADIUS server and clients. 
Required for allowing the NetScaler appliance to communicate with the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_radkey(String radkey) throws Exception{
		this.radkey = radkey;
	}

	/**
	* <pre>
	* The key shared between the RADIUS server and clients. 
Required for allowing the NetScaler appliance to communicate with the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_radkey() throws Exception {
		return this.radkey;
	}

	/**
	* <pre>
	* Send the NetScaler IP (NSIP) address to the RADIUS server as the Network Access Server IP (NASIP) part of the Radius protocol.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_radnasip(String radnasip) throws Exception{
		this.radnasip = radnasip;
	}

	/**
	* <pre>
	* Send the NetScaler IP (NSIP) address to the RADIUS server as the Network Access Server IP (NASIP) part of the Radius protocol.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_radnasip() throws Exception {
		return this.radnasip;
	}

	/**
	* <pre>
	* Send the Network Access Server ID (NASID) for your NetScaler appliance to the RADIUS server as the nasid part of the Radius protocol.
	* </pre>
	*/
	public void set_radnasid(String radnasid) throws Exception{
		this.radnasid = radnasid;
	}

	/**
	* <pre>
	* Send the Network Access Server ID (NASID) for your NetScaler appliance to the RADIUS server as the nasid part of the Radius protocol.
	* </pre>
	*/
	public String get_radnasid() throws Exception {
		return this.radnasid;
	}

	/**
	* <pre>
	* Vendor ID for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radvendorid(long radvendorid) throws Exception {
		this.radvendorid = new Long(radvendorid);
	}

	/**
	* <pre>
	* Vendor ID for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radvendorid(Long radvendorid) throws Exception{
		this.radvendorid = radvendorid;
	}

	/**
	* <pre>
	* Vendor ID for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_radvendorid() throws Exception {
		return this.radvendorid;
	}

	/**
	* <pre>
	* Attribute type for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radattributetype(long radattributetype) throws Exception {
		this.radattributetype = new Long(radattributetype);
	}

	/**
	* <pre>
	* Attribute type for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radattributetype(Long radattributetype) throws Exception{
		this.radattributetype = radattributetype;
	}

	/**
	* <pre>
	* Attribute type for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_radattributetype() throws Exception {
		return this.radattributetype;
	}

	/**
	* <pre>
	* Prefix string that precedes group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public void set_radgroupsprefix(String radgroupsprefix) throws Exception{
		this.radgroupsprefix = radgroupsprefix;
	}

	/**
	* <pre>
	* Prefix string that precedes group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public String get_radgroupsprefix() throws Exception {
		return this.radgroupsprefix;
	}

	/**
	* <pre>
	* Group separator string that delimits group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public void set_radgroupseparator(String radgroupseparator) throws Exception{
		this.radgroupseparator = radgroupseparator;
	}

	/**
	* <pre>
	* Group separator string that delimits group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public String get_radgroupseparator() throws Exception {
		return this.radgroupseparator;
	}

	/**
	* <pre>
	* Enable password encoding in RADIUS packets that the NetScaler appliance sends to the RADIUS server.<br> Default value: pap<br> Possible values = pap, chap, mschapv1, mschapv2
	* </pre>
	*/
	public void set_passencoding(String passencoding) throws Exception{
		this.passencoding = passencoding;
	}

	/**
	* <pre>
	* Enable password encoding in RADIUS packets that the NetScaler appliance sends to the RADIUS server.<br> Default value: pap<br> Possible values = pap, chap, mschapv1, mschapv2
	* </pre>
	*/
	public String get_passencoding() throws Exception {
		return this.passencoding;
	}

	/**
	* <pre>
	* Vendor ID attribute in the RADIUS response. 
If the attribute is not vendor-encoded, it is set to 0.
	* </pre>
	*/
	public void set_ipvendorid(long ipvendorid) throws Exception {
		this.ipvendorid = new Long(ipvendorid);
	}

	/**
	* <pre>
	* Vendor ID attribute in the RADIUS response. 
If the attribute is not vendor-encoded, it is set to 0.
	* </pre>
	*/
	public void set_ipvendorid(Long ipvendorid) throws Exception{
		this.ipvendorid = ipvendorid;
	}

	/**
	* <pre>
	* Vendor ID attribute in the RADIUS response. 
If the attribute is not vendor-encoded, it is set to 0.
	* </pre>
	*/
	public Long get_ipvendorid() throws Exception {
		return this.ipvendorid;
	}

	/**
	* <pre>
	* IP attribute type in the RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ipattributetype(long ipattributetype) throws Exception {
		this.ipattributetype = new Long(ipattributetype);
	}

	/**
	* <pre>
	* IP attribute type in the RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ipattributetype(Long ipattributetype) throws Exception{
		this.ipattributetype = ipattributetype;
	}

	/**
	* <pre>
	* IP attribute type in the RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_ipattributetype() throws Exception {
		return this.ipattributetype;
	}

	/**
	* <pre>
	* Configure the RADIUS server state to accept or refuse accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_accounting(String accounting) throws Exception{
		this.accounting = accounting;
	}

	/**
	* <pre>
	* Configure the RADIUS server state to accept or refuse accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_accounting() throws Exception {
		return this.accounting;
	}

	/**
	* <pre>
	* Vendor ID of the password in the RADIUS response. Used to extract the user password.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdvendorid(long pwdvendorid) throws Exception {
		this.pwdvendorid = new Long(pwdvendorid);
	}

	/**
	* <pre>
	* Vendor ID of the password in the RADIUS response. Used to extract the user password.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdvendorid(Long pwdvendorid) throws Exception{
		this.pwdvendorid = pwdvendorid;
	}

	/**
	* <pre>
	* Vendor ID of the password in the RADIUS response. Used to extract the user password.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_pwdvendorid() throws Exception {
		return this.pwdvendorid;
	}

	/**
	* <pre>
	* Attribute type of the Vendor ID in the RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdattributetype(long pwdattributetype) throws Exception {
		this.pwdattributetype = new Long(pwdattributetype);
	}

	/**
	* <pre>
	* Attribute type of the Vendor ID in the RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdattributetype(Long pwdattributetype) throws Exception{
		this.pwdattributetype = pwdattributetype;
	}

	/**
	* <pre>
	* Attribute type of the Vendor ID in the RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_pwdattributetype() throws Exception {
		return this.pwdattributetype;
	}

	/**
	* <pre>
	* This is the default group that is chosen when the authentication succeeds in addition to extracted groups.<br> Maximum length =  64
	* </pre>
	*/
	public void set_defaultauthenticationgroup(String defaultauthenticationgroup) throws Exception{
		this.defaultauthenticationgroup = defaultauthenticationgroup;
	}

	/**
	* <pre>
	* This is the default group that is chosen when the authentication succeeds in addition to extracted groups.<br> Maximum length =  64
	* </pre>
	*/
	public String get_defaultauthenticationgroup() throws Exception {
		return this.defaultauthenticationgroup;
	}

	/**
	* <pre>
	* Send Calling-Station-ID of the client to the RADIUS server. IP Address of the client is sent as its Calling-Station-ID.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_callingstationid(String callingstationid) throws Exception{
		this.callingstationid = callingstationid;
	}

	/**
	* <pre>
	* Send Calling-Station-ID of the client to the RADIUS server. IP Address of the client is sent as its Calling-Station-ID.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_callingstationid() throws Exception {
		return this.callingstationid;
	}

	/**
	* <pre>
	* To associate AAA users with an AAA group, use the command

    "bind AAA group ... -username ...".

You can bind different policies to each AAA group. Use the command

    "bind AAA group ... -policy ...".
	* </pre>
	*/
	public String get_groupauthname() throws Exception {
		return this.groupauthname;
	}

	/**
	* <pre>
	* IP Address.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		aaaradiusparams[] resources = new aaaradiusparams[1];
		aaaradiusparams_response result = (aaaradiusparams_response) service.get_payload_formatter().string_to_resource(aaaradiusparams_response.class, response);
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
		resources[0] = result.aaaradiusparams;
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
	* Use this API to update aaaradiusparams.
	*/
	public static base_response update(nitro_service client, aaaradiusparams resource) throws Exception {
		aaaradiusparams updateresource = new aaaradiusparams();
		updateresource.serverip = resource.serverip;
		updateresource.serverport = resource.serverport;
		updateresource.authtimeout = resource.authtimeout;
		updateresource.radkey = resource.radkey;
		updateresource.radnasip = resource.radnasip;
		updateresource.radnasid = resource.radnasid;
		updateresource.radvendorid = resource.radvendorid;
		updateresource.radattributetype = resource.radattributetype;
		updateresource.radgroupsprefix = resource.radgroupsprefix;
		updateresource.radgroupseparator = resource.radgroupseparator;
		updateresource.passencoding = resource.passencoding;
		updateresource.ipvendorid = resource.ipvendorid;
		updateresource.ipattributetype = resource.ipattributetype;
		updateresource.accounting = resource.accounting;
		updateresource.pwdvendorid = resource.pwdvendorid;
		updateresource.pwdattributetype = resource.pwdattributetype;
		updateresource.defaultauthenticationgroup = resource.defaultauthenticationgroup;
		updateresource.callingstationid = resource.callingstationid;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaaradiusparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaaradiusparams resource, String[] args) throws Exception{
		aaaradiusparams unsetresource = new aaaradiusparams();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the aaaradiusparams resources that are configured on netscaler.
	*/
	public static aaaradiusparams get(nitro_service service) throws Exception{
		aaaradiusparams obj = new aaaradiusparams();
		aaaradiusparams[] response = (aaaradiusparams[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the aaaradiusparams resources that are configured on netscaler.
	*/
	public static aaaradiusparams get(nitro_service service,  options option) throws Exception{
		aaaradiusparams obj = new aaaradiusparams();
		aaaradiusparams[] response = (aaaradiusparams[])obj.get_resources(service,option);
		return response[0];
	}

	public static class passencodingEnum {
		public static final String pap = "pap";
		public static final String chap = "chap";
		public static final String mschapv1 = "mschapv1";
		public static final String mschapv2 = "mschapv2";
	}
	public static class callingstationidEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class accountingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class radnasipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
