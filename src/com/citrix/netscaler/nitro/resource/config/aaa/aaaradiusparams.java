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

	//------- Read only Parameter ---------;

	private String groupauthname;
	private String ipaddress;

	/**
	* <pre>
	* The IP address of the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* The IP address of the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* The port number on which the RADIUS server is running.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* The port number on which the RADIUS server is running.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* The port number on which the RADIUS server is running.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(long authtimeout) throws Exception {
		this.authtimeout = new Long(authtimeout);
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(Long authtimeout) throws Exception{
		this.authtimeout = authtimeout;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public Long get_authtimeout() throws Exception {
		return this.authtimeout;
	}

	/**
	* <pre>
	* The key shared between the client and the server. This information is required for the system to
communicate with the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_radkey(String radkey) throws Exception{
		this.radkey = radkey;
	}

	/**
	* <pre>
	* The key shared between the client and the server. This information is required for the system to
communicate with the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_radkey() throws Exception {
		return this.radkey;
	}

	/**
	* <pre>
	* The option to send the NetScaler's IP address (NSIP) to the server as the "nasip" (Network Access Server IP) part of the Radius protocol.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_radnasip(String radnasip) throws Exception{
		this.radnasip = radnasip;
	}

	/**
	* <pre>
	* The option to send the NetScaler's IP address (NSIP) to the server as the "nasip" (Network Access Server IP) part of the Radius protocol.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_radnasip() throws Exception {
		return this.radnasip;
	}

	/**
	* <pre>
	* The nasid (Network Access Server ID). If configured, this string will be sent to the RADIUS server as the "nasid" part of the
				Radius protocol.
	* </pre>
	*/
	public void set_radnasid(String radnasid) throws Exception{
		this.radnasid = radnasid;
	}

	/**
	* <pre>
	* The nasid (Network Access Server ID). If configured, this string will be sent to the RADIUS server as the "nasid" part of the
				Radius protocol.
	* </pre>
	*/
	public String get_radnasid() throws Exception {
		return this.radnasid;
	}

	/**
	* <pre>
	* The Vendor ID for Radius group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radvendorid(long radvendorid) throws Exception {
		this.radvendorid = new Long(radvendorid);
	}

	/**
	* <pre>
	* The Vendor ID for Radius group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radvendorid(Long radvendorid) throws Exception{
		this.radvendorid = radvendorid;
	}

	/**
	* <pre>
	* The Vendor ID for Radius group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_radvendorid() throws Exception {
		return this.radvendorid;
	}

	/**
	* <pre>
	* The Attribute type for Radius group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radattributetype(long radattributetype) throws Exception {
		this.radattributetype = new Long(radattributetype);
	}

	/**
	* <pre>
	* The Attribute type for Radius group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radattributetype(Long radattributetype) throws Exception{
		this.radattributetype = radattributetype;
	}

	/**
	* <pre>
	* The Attribute type for Radius group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_radattributetype() throws Exception {
		return this.radattributetype;
	}

	/**
	* <pre>
	* The groups prefix string that precedes the group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public void set_radgroupsprefix(String radgroupsprefix) throws Exception{
		this.radgroupsprefix = radgroupsprefix;
	}

	/**
	* <pre>
	* The groups prefix string that precedes the group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public String get_radgroupsprefix() throws Exception {
		return this.radgroupsprefix;
	}

	/**
	* <pre>
	* The group separator string that delimits group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public void set_radgroupseparator(String radgroupseparator) throws Exception{
		this.radgroupseparator = radgroupseparator;
	}

	/**
	* <pre>
	* The group separator string that delimits group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public String get_radgroupseparator() throws Exception {
		return this.radgroupseparator;
	}

	/**
	* <pre>
	* The option to encode the password in the Radius packets traveling from the NetScaler to the Radius server.<br> Default value: pap<br> Possible values = pap, chap, mschapv1, mschapv2
	* </pre>
	*/
	public void set_passencoding(String passencoding) throws Exception{
		this.passencoding = passencoding;
	}

	/**
	* <pre>
	* The option to encode the password in the Radius packets traveling from the NetScaler to the Radius server.<br> Default value: pap<br> Possible values = pap, chap, mschapv1, mschapv2
	* </pre>
	*/
	public String get_passencoding() throws Exception {
		return this.passencoding;
	}

	/**
	* <pre>
	* The vendor ID of the attribute in the RADIUS response. The vendor ID denotes the intranet IP.  The value of 0 denotes that the attribute is not vendor-encoded.
	* </pre>
	*/
	public void set_ipvendorid(long ipvendorid) throws Exception {
		this.ipvendorid = new Long(ipvendorid);
	}

	/**
	* <pre>
	* The vendor ID of the attribute in the RADIUS response. The vendor ID denotes the intranet IP.  The value of 0 denotes that the attribute is not vendor-encoded.
	* </pre>
	*/
	public void set_ipvendorid(Long ipvendorid) throws Exception{
		this.ipvendorid = ipvendorid;
	}

	/**
	* <pre>
	* The vendor ID of the attribute in the RADIUS response. The vendor ID denotes the intranet IP.  The value of 0 denotes that the attribute is not vendor-encoded.
	* </pre>
	*/
	public Long get_ipvendorid() throws Exception {
		return this.ipvendorid;
	}

	/**
	* <pre>
	* The attribute type of the remote IP address attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ipattributetype(long ipattributetype) throws Exception {
		this.ipattributetype = new Long(ipattributetype);
	}

	/**
	* <pre>
	* The attribute type of the remote IP address attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ipattributetype(Long ipattributetype) throws Exception{
		this.ipattributetype = ipattributetype;
	}

	/**
	* <pre>
	* The attribute type of the remote IP address attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_ipattributetype() throws Exception {
		return this.ipattributetype;
	}

	/**
	* <pre>
	* The state of the RADIUS server to receive accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_accounting(String accounting) throws Exception{
		this.accounting = accounting;
	}

	/**
	* <pre>
	* The state of the RADIUS server to receive accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_accounting() throws Exception {
		return this.accounting;
	}

	/**
	* <pre>
	* Vendor ID of the attribute in the RADIUS response which will be used to extract the user Password.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdvendorid(long pwdvendorid) throws Exception {
		this.pwdvendorid = new Long(pwdvendorid);
	}

	/**
	* <pre>
	* Vendor ID of the attribute in the RADIUS response which will be used to extract the user Password.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdvendorid(Long pwdvendorid) throws Exception{
		this.pwdvendorid = pwdvendorid;
	}

	/**
	* <pre>
	* Vendor ID of the attribute in the RADIUS response which will be used to extract the user Password.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_pwdvendorid() throws Exception {
		return this.pwdvendorid;
	}

	/**
	* <pre>
	* Attribute type of the vendor specific Password-Attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdattributetype(long pwdattributetype) throws Exception {
		this.pwdattributetype = new Long(pwdattributetype);
	}

	/**
	* <pre>
	* Attribute type of the vendor specific Password-Attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdattributetype(Long pwdattributetype) throws Exception{
		this.pwdattributetype = pwdattributetype;
	}

	/**
	* <pre>
	* Attribute type of the vendor specific Password-Attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_pwdattributetype() throws Exception {
		return this.pwdattributetype;
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
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaaradiusparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaaradiusparams resource, String[] args) throws Exception{
		aaaradiusparams unsetresource = new aaaradiusparams();
		unsetresource.serverip = resource.serverip;
		unsetresource.serverport = resource.serverport;
		unsetresource.authtimeout = resource.authtimeout;
		unsetresource.radnasip = resource.radnasip;
		unsetresource.radnasid = resource.radnasid;
		unsetresource.radvendorid = resource.radvendorid;
		unsetresource.radattributetype = resource.radattributetype;
		unsetresource.radgroupsprefix = resource.radgroupsprefix;
		unsetresource.radgroupseparator = resource.radgroupseparator;
		unsetresource.passencoding = resource.passencoding;
		unsetresource.ipvendorid = resource.ipvendorid;
		unsetresource.ipattributetype = resource.ipattributetype;
		unsetresource.accounting = resource.accounting;
		unsetresource.pwdvendorid = resource.pwdvendorid;
		unsetresource.pwdattributetype = resource.pwdattributetype;
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
	public static class accountingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class radnasipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
