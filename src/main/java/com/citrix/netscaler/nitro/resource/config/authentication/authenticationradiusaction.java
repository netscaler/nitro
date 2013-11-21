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

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationradiusaction_response extends base_response
{
	public authenticationradiusaction[] authenticationradiusaction;
}
/**
* Configuration for RADIUS action resource.
*/

public class authenticationradiusaction extends base_resource
{
	private String name;
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

	private String ipaddress;
	private Long success;
	private Long failure;
	private Long __count;

	/**
	* <pre>
	* Name for the RADIUS action. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the RADIUS action is added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the RADIUS action. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the RADIUS action is added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* IP address assigned to the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* IP address assigned to the RADIUS server.<br> Minimum length =  1
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
	* Number of seconds the NetScaler appliance waits for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(long authtimeout) throws Exception {
		this.authtimeout = new Long(authtimeout);
	}

	/**
	* <pre>
	* Number of seconds the NetScaler appliance waits for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(Long authtimeout) throws Exception{
		this.authtimeout = authtimeout;
	}

	/**
	* <pre>
	* Number of seconds the NetScaler appliance waits for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public Long get_authtimeout() throws Exception {
		return this.authtimeout;
	}

	/**
	* <pre>
	* Key shared between the RADIUS server and the NetScaler appliance. 
Required to allow the NetScaler appliance to communicate with the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_radkey(String radkey) throws Exception{
		this.radkey = radkey;
	}

	/**
	* <pre>
	* Key shared between the RADIUS server and the NetScaler appliance. 
Required to allow the NetScaler appliance to communicate with the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_radkey() throws Exception {
		return this.radkey;
	}

	/**
	* <pre>
	* If enabled, the NetScaler appliance IP address (NSIP) is sent to the RADIUS server as the  Network Access Server IP (NASIP) address. 
The RADIUS protocol defines the meaning and use of the NASIP address.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_radnasip(String radnasip) throws Exception{
		this.radnasip = radnasip;
	}

	/**
	* <pre>
	* If enabled, the NetScaler appliance IP address (NSIP) is sent to the RADIUS server as the  Network Access Server IP (NASIP) address. 
The RADIUS protocol defines the meaning and use of the NASIP address.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_radnasip() throws Exception {
		return this.radnasip;
	}

	/**
	* <pre>
	* If configured, this string is sent to the RADIUS server as the Network Access Server ID (NASID).
	* </pre>
	*/
	public void set_radnasid(String radnasid) throws Exception{
		this.radnasid = radnasid;
	}

	/**
	* <pre>
	* If configured, this string is sent to the RADIUS server as the Network Access Server ID (NASID).
	* </pre>
	*/
	public String get_radnasid() throws Exception {
		return this.radnasid;
	}

	/**
	* <pre>
	* RADIUS vendor ID attribute, used for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radvendorid(long radvendorid) throws Exception {
		this.radvendorid = new Long(radvendorid);
	}

	/**
	* <pre>
	* RADIUS vendor ID attribute, used for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radvendorid(Long radvendorid) throws Exception{
		this.radvendorid = radvendorid;
	}

	/**
	* <pre>
	* RADIUS vendor ID attribute, used for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_radvendorid() throws Exception {
		return this.radvendorid;
	}

	/**
	* <pre>
	* RADIUS attribute type, used for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radattributetype(long radattributetype) throws Exception {
		this.radattributetype = new Long(radattributetype);
	}

	/**
	* <pre>
	* RADIUS attribute type, used for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radattributetype(Long radattributetype) throws Exception{
		this.radattributetype = radattributetype;
	}

	/**
	* <pre>
	* RADIUS attribute type, used for RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_radattributetype() throws Exception {
		return this.radattributetype;
	}

	/**
	* <pre>
	* RADIUS groups prefix string. 
This groups prefix precedes the group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public void set_radgroupsprefix(String radgroupsprefix) throws Exception{
		this.radgroupsprefix = radgroupsprefix;
	}

	/**
	* <pre>
	* RADIUS groups prefix string. 
This groups prefix precedes the group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public String get_radgroupsprefix() throws Exception {
		return this.radgroupsprefix;
	}

	/**
	* <pre>
	* RADIUS group separator string
The group separator delimits group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public void set_radgroupseparator(String radgroupseparator) throws Exception{
		this.radgroupseparator = radgroupseparator;
	}

	/**
	* <pre>
	* RADIUS group separator string
The group separator delimits group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public String get_radgroupseparator() throws Exception {
		return this.radgroupseparator;
	}

	/**
	* <pre>
	* Encoding type for passwords in RADIUS packets that the NetScaler appliance sends to the RADIUS server.<br> Default value: pap<br> Possible values = pap, chap, mschapv1, mschapv2
	* </pre>
	*/
	public void set_passencoding(String passencoding) throws Exception{
		this.passencoding = passencoding;
	}

	/**
	* <pre>
	* Encoding type for passwords in RADIUS packets that the NetScaler appliance sends to the RADIUS server.<br> Default value: pap<br> Possible values = pap, chap, mschapv1, mschapv2
	* </pre>
	*/
	public String get_passencoding() throws Exception {
		return this.passencoding;
	}

	/**
	* <pre>
	* Vendor ID of the intranet IP attribute in the RADIUS response.
NOTE: A value of 0 indicates that the attribute is not vendor encoded.
	* </pre>
	*/
	public void set_ipvendorid(long ipvendorid) throws Exception {
		this.ipvendorid = new Long(ipvendorid);
	}

	/**
	* <pre>
	* Vendor ID of the intranet IP attribute in the RADIUS response.
NOTE: A value of 0 indicates that the attribute is not vendor encoded.
	* </pre>
	*/
	public void set_ipvendorid(Long ipvendorid) throws Exception{
		this.ipvendorid = ipvendorid;
	}

	/**
	* <pre>
	* Vendor ID of the intranet IP attribute in the RADIUS response.
NOTE: A value of 0 indicates that the attribute is not vendor encoded.
	* </pre>
	*/
	public Long get_ipvendorid() throws Exception {
		return this.ipvendorid;
	}

	/**
	* <pre>
	* Remote IP address attribute type in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ipattributetype(long ipattributetype) throws Exception {
		this.ipattributetype = new Long(ipattributetype);
	}

	/**
	* <pre>
	* Remote IP address attribute type in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ipattributetype(Long ipattributetype) throws Exception{
		this.ipattributetype = ipattributetype;
	}

	/**
	* <pre>
	* Remote IP address attribute type in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_ipattributetype() throws Exception {
		return this.ipattributetype;
	}

	/**
	* <pre>
	* Whether the RADIUS server is currently accepting accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_accounting(String accounting) throws Exception{
		this.accounting = accounting;
	}

	/**
	* <pre>
	* Whether the RADIUS server is currently accepting accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_accounting() throws Exception {
		return this.accounting;
	}

	/**
	* <pre>
	* Vendor ID of the attribute, in the RADIUS response, used to extract the user password.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdvendorid(long pwdvendorid) throws Exception {
		this.pwdvendorid = new Long(pwdvendorid);
	}

	/**
	* <pre>
	* Vendor ID of the attribute, in the RADIUS response, used to extract the user password.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdvendorid(Long pwdvendorid) throws Exception{
		this.pwdvendorid = pwdvendorid;
	}

	/**
	* <pre>
	* Vendor ID of the attribute, in the RADIUS response, used to extract the user password.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_pwdvendorid() throws Exception {
		return this.pwdvendorid;
	}

	/**
	* <pre>
	* Vendor-specific password attribute type in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdattributetype(long pwdattributetype) throws Exception {
		this.pwdattributetype = new Long(pwdattributetype);
	}

	/**
	* <pre>
	* Vendor-specific password attribute type in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdattributetype(Long pwdattributetype) throws Exception{
		this.pwdattributetype = pwdattributetype;
	}

	/**
	* <pre>
	* Vendor-specific password attribute type in a RADIUS response.<br> Minimum value =  1
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
	* IP address.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_success() throws Exception {
		return this.success;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_failure() throws Exception {
		return this.failure;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationradiusaction_response result = (authenticationradiusaction_response) service.get_payload_formatter().string_to_resource(authenticationradiusaction_response.class, response);
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
		return result.authenticationradiusaction;
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
	* Use this API to add authenticationradiusaction.
	*/
	public static base_response add(nitro_service client, authenticationradiusaction resource) throws Exception {
		authenticationradiusaction addresource = new authenticationradiusaction();
		addresource.name = resource.name;
		addresource.serverip = resource.serverip;
		addresource.serverport = resource.serverport;
		addresource.authtimeout = resource.authtimeout;
		addresource.radkey = resource.radkey;
		addresource.radnasip = resource.radnasip;
		addresource.radnasid = resource.radnasid;
		addresource.radvendorid = resource.radvendorid;
		addresource.radattributetype = resource.radattributetype;
		addresource.radgroupsprefix = resource.radgroupsprefix;
		addresource.radgroupseparator = resource.radgroupseparator;
		addresource.passencoding = resource.passencoding;
		addresource.ipvendorid = resource.ipvendorid;
		addresource.ipattributetype = resource.ipattributetype;
		addresource.accounting = resource.accounting;
		addresource.pwdvendorid = resource.pwdvendorid;
		addresource.pwdattributetype = resource.pwdattributetype;
		addresource.defaultauthenticationgroup = resource.defaultauthenticationgroup;
		addresource.callingstationid = resource.callingstationid;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationradiusaction resources.
	*/
	public static base_responses add(nitro_service client, authenticationradiusaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationradiusaction addresources[] = new authenticationradiusaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationradiusaction();
				addresources[i].name = resources[i].name;
				addresources[i].serverip = resources[i].serverip;
				addresources[i].serverport = resources[i].serverport;
				addresources[i].authtimeout = resources[i].authtimeout;
				addresources[i].radkey = resources[i].radkey;
				addresources[i].radnasip = resources[i].radnasip;
				addresources[i].radnasid = resources[i].radnasid;
				addresources[i].radvendorid = resources[i].radvendorid;
				addresources[i].radattributetype = resources[i].radattributetype;
				addresources[i].radgroupsprefix = resources[i].radgroupsprefix;
				addresources[i].radgroupseparator = resources[i].radgroupseparator;
				addresources[i].passencoding = resources[i].passencoding;
				addresources[i].ipvendorid = resources[i].ipvendorid;
				addresources[i].ipattributetype = resources[i].ipattributetype;
				addresources[i].accounting = resources[i].accounting;
				addresources[i].pwdvendorid = resources[i].pwdvendorid;
				addresources[i].pwdattributetype = resources[i].pwdattributetype;
				addresources[i].defaultauthenticationgroup = resources[i].defaultauthenticationgroup;
				addresources[i].callingstationid = resources[i].callingstationid;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationradiusaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationradiusaction deleteresource = new authenticationradiusaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationradiusaction.
	*/
	public static base_response delete(nitro_service client, authenticationradiusaction resource) throws Exception {
		authenticationradiusaction deleteresource = new authenticationradiusaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationradiusaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationradiusaction deleteresources[] = new authenticationradiusaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationradiusaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationradiusaction resources.
	*/
	public static base_responses delete(nitro_service client, authenticationradiusaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationradiusaction deleteresources[] = new authenticationradiusaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationradiusaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationradiusaction.
	*/
	public static base_response update(nitro_service client, authenticationradiusaction resource) throws Exception {
		authenticationradiusaction updateresource = new authenticationradiusaction();
		updateresource.name = resource.name;
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
	* Use this API to update authenticationradiusaction resources.
	*/
	public static base_responses update(nitro_service client, authenticationradiusaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationradiusaction updateresources[] = new authenticationradiusaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationradiusaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].serverip = resources[i].serverip;
				updateresources[i].serverport = resources[i].serverport;
				updateresources[i].authtimeout = resources[i].authtimeout;
				updateresources[i].radkey = resources[i].radkey;
				updateresources[i].radnasip = resources[i].radnasip;
				updateresources[i].radnasid = resources[i].radnasid;
				updateresources[i].radvendorid = resources[i].radvendorid;
				updateresources[i].radattributetype = resources[i].radattributetype;
				updateresources[i].radgroupsprefix = resources[i].radgroupsprefix;
				updateresources[i].radgroupseparator = resources[i].radgroupseparator;
				updateresources[i].passencoding = resources[i].passencoding;
				updateresources[i].ipvendorid = resources[i].ipvendorid;
				updateresources[i].ipattributetype = resources[i].ipattributetype;
				updateresources[i].accounting = resources[i].accounting;
				updateresources[i].pwdvendorid = resources[i].pwdvendorid;
				updateresources[i].pwdattributetype = resources[i].pwdattributetype;
				updateresources[i].defaultauthenticationgroup = resources[i].defaultauthenticationgroup;
				updateresources[i].callingstationid = resources[i].callingstationid;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationradiusaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationradiusaction resource, String[] args) throws Exception{
		authenticationradiusaction unsetresource = new authenticationradiusaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationradiusaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationradiusaction unsetresources[] = new authenticationradiusaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationradiusaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationradiusaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationradiusaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationradiusaction unsetresources[] = new authenticationradiusaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationradiusaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationradiusaction resources that are configured on netscaler.
	*/
	public static authenticationradiusaction[] get(nitro_service service) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		authenticationradiusaction[] response = (authenticationradiusaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationradiusaction resources that are configured on netscaler.
	*/
	public static authenticationradiusaction[] get(nitro_service service, options option) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		authenticationradiusaction[] response = (authenticationradiusaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationradiusaction resource of given name .
	*/
	public static authenticationradiusaction get(nitro_service service, String name) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		obj.set_name(name);
		authenticationradiusaction response = (authenticationradiusaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationradiusaction resources of given names .
	*/
	public static authenticationradiusaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationradiusaction response[] = new authenticationradiusaction[name.length];
			authenticationradiusaction obj[] = new authenticationradiusaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationradiusaction();
				obj[i].set_name(name[i]);
				response[i] = (authenticationradiusaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationradiusaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationradiusaction[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_filter(filter);
		authenticationradiusaction[] response = (authenticationradiusaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationradiusaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationradiusaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_filter(filter);
		authenticationradiusaction[] response = (authenticationradiusaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationradiusaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_count(true);
		authenticationradiusaction[] response = (authenticationradiusaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationradiusaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationradiusaction[] response = (authenticationradiusaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationradiusaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationradiusaction[] response = (authenticationradiusaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
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
