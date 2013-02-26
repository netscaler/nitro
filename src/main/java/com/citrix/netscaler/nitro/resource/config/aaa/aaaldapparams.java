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

class aaaldapparams_response extends base_response
{
	public aaaldapparams aaaldapparams;
}
/**
* Configuration for LDAP parameter resource.
*/

public class aaaldapparams extends base_resource
{
	private String serverip;
	private Integer serverport;
	private Long authtimeout;
	private String ldapbase;
	private String ldapbinddn;
	private String ldapbinddnpassword;
	private String ldaploginname;
	private String searchfilter;
	private String groupattrname;
	private String subattributename;
	private String sectype;
	private String svrtype;
	private String ssonameattribute;
	private String passwdchange;
	private String nestedgroupextraction;
	private Long maxnestinglevel;
	private String groupnameidentifier;
	private String groupsearchattribute;
	private String groupsearchsubattribute;
	private String groupsearchfilter;

	//------- Read only Parameter ---------;

	private String groupauthname;

	/**
	* <pre>
	* The IP address of the LDAP server. The default value is localhost.
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* The IP address of the LDAP server. The default value is localhost.
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* The port number on which the LDAP server is running.<br> Default value: 389<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* The port number on which the LDAP server is running.<br> Default value: 389<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* The port number on which the LDAP server is running.<br> Default value: 389<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the LDAP server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(long authtimeout) throws Exception {
		this.authtimeout = new Long(authtimeout);
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the LDAP server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(Long authtimeout) throws Exception{
		this.authtimeout = authtimeout;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the LDAP server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public Long get_authtimeout() throws Exception {
		return this.authtimeout;
	}

	/**
	* <pre>
	* The base or node where the ldapsearch should start. If the LDAP server is running locally, the default value of base is dc=netscaler, dc=com. .
	* </pre>
	*/
	public void set_ldapbase(String ldapbase) throws Exception{
		this.ldapbase = ldapbase;
	}

	/**
	* <pre>
	* The base or node where the ldapsearch should start. If the LDAP server is running locally, the default value of base is dc=netscaler, dc=com. .
	* </pre>
	*/
	public String get_ldapbase() throws Exception {
		return this.ldapbase;
	}

	/**
	* <pre>
	* The full distinguished name that is used to bind to the LDAP server.
	* </pre>
	*/
	public void set_ldapbinddn(String ldapbinddn) throws Exception{
		this.ldapbinddn = ldapbinddn;
	}

	/**
	* <pre>
	* The full distinguished name that is used to bind to the LDAP server.
	* </pre>
	*/
	public String get_ldapbinddn() throws Exception {
		return this.ldapbinddn;
	}

	/**
	* <pre>
	* The password used to bind to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ldapbinddnpassword(String ldapbinddnpassword) throws Exception{
		this.ldapbinddnpassword = ldapbinddnpassword;
	}

	/**
	* <pre>
	* The password used to bind to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ldapbinddnpassword() throws Exception {
		return this.ldapbinddnpassword;
	}

	/**
	* <pre>
	* The name attribute used by the system to query the external LDAP server or an Active Directory.
	* </pre>
	*/
	public void set_ldaploginname(String ldaploginname) throws Exception{
		this.ldaploginname = ldaploginname;
	}

	/**
	* <pre>
	* The name attribute used by the system to query the external LDAP server or an Active Directory.
	* </pre>
	*/
	public String get_ldaploginname() throws Exception {
		return this.ldaploginname;
	}

	/**
	* <pre>
	* The String to be combined with the default LDAP user search string to form the value. For example, vpnallowed=true with ldaploginame "samaccount" and user-supplied username "bob" would yield the LDAP search string "(&(vpnallowed=true)(samaccount=bob)".<br> Minimum length =  1
	* </pre>
	*/
	public void set_searchfilter(String searchfilter) throws Exception{
		this.searchfilter = searchfilter;
	}

	/**
	* <pre>
	* The String to be combined with the default LDAP user search string to form the value. For example, vpnallowed=true with ldaploginame "samaccount" and user-supplied username "bob" would yield the LDAP search string "(&(vpnallowed=true)(samaccount=bob)".<br> Minimum length =  1
	* </pre>
	*/
	public String get_searchfilter() throws Exception {
		return this.searchfilter;
	}

	/**
	* <pre>
	* The attribute name for group extraction from the LDAP server.
	* </pre>
	*/
	public void set_groupattrname(String groupattrname) throws Exception{
		this.groupattrname = groupattrname;
	}

	/**
	* <pre>
	* The attribute name for group extraction from the LDAP server.
	* </pre>
	*/
	public String get_groupattrname() throws Exception {
		return this.groupattrname;
	}

	/**
	* <pre>
	* The Sub-Attribute name for group extraction from LDAP server.
	* </pre>
	*/
	public void set_subattributename(String subattributename) throws Exception{
		this.subattributename = subattributename;
	}

	/**
	* <pre>
	* The Sub-Attribute name for group extraction from LDAP server.
	* </pre>
	*/
	public String get_subattributename() throws Exception {
		return this.subattributename;
	}

	/**
	* <pre>
	* The type of communication between the system and the LDAP server. The values are:
PLAINTEXT: No encryption required.
TLS: To use the TLS protocol to communicate.
SSL: To use the SSL Protocol to communicate.<br> Default value: PLAINTEXT<br> Possible values = PLAINTEXT, TLS, SSL
	* </pre>
	*/
	public void set_sectype(String sectype) throws Exception{
		this.sectype = sectype;
	}

	/**
	* <pre>
	* The type of communication between the system and the LDAP server. The values are:
PLAINTEXT: No encryption required.
TLS: To use the TLS protocol to communicate.
SSL: To use the SSL Protocol to communicate.<br> Default value: PLAINTEXT<br> Possible values = PLAINTEXT, TLS, SSL
	* </pre>
	*/
	public String get_sectype() throws Exception {
		return this.sectype;
	}

	/**
	* <pre>
	* The type of LDAP server.<br> Default value: AAA_LDAP_SERVER_TYPE_DEFAULT<br> Possible values = AD, NDS
	* </pre>
	*/
	public void set_svrtype(String svrtype) throws Exception{
		this.svrtype = svrtype;
	}

	/**
	* <pre>
	* The type of LDAP server.<br> Default value: AAA_LDAP_SERVER_TYPE_DEFAULT<br> Possible values = AD, NDS
	* </pre>
	*/
	public String get_svrtype() throws Exception {
		return this.svrtype;
	}

	/**
	* <pre>
	* The attribute used by the system to query the external LDAP server (or an Active Directory) for an alternate username to be used in Single Sign-On.
	* </pre>
	*/
	public void set_ssonameattribute(String ssonameattribute) throws Exception{
		this.ssonameattribute = ssonameattribute;
	}

	/**
	* <pre>
	* The attribute used by the system to query the external LDAP server (or an Active Directory) for an alternate username to be used in Single Sign-On.
	* </pre>
	*/
	public String get_ssonameattribute() throws Exception {
		return this.ssonameattribute;
	}

	/**
	* <pre>
	* Enabling this option does not block password change request.Disabling would block password change request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_passwdchange(String passwdchange) throws Exception{
		this.passwdchange = passwdchange;
	}

	/**
	* <pre>
	* Enabling this option does not block password change request.Disabling would block password change request.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_passwdchange() throws Exception {
		return this.passwdchange;
	}

	/**
	* <pre>
	* Setting this option to ON enables the nested group extraction feature where the system queries the external LDAP server to determine if a group belongs to another group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_nestedgroupextraction(String nestedgroupextraction) throws Exception{
		this.nestedgroupextraction = nestedgroupextraction;
	}

	/**
	* <pre>
	* Setting this option to ON enables the nested group extraction feature where the system queries the external LDAP server to determine if a group belongs to another group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_nestedgroupextraction() throws Exception {
		return this.nestedgroupextraction;
	}

	/**
	* <pre>
	* .<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public void set_maxnestinglevel(long maxnestinglevel) throws Exception {
		this.maxnestinglevel = new Long(maxnestinglevel);
	}

	/**
	* <pre>
	* .<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public void set_maxnestinglevel(Long maxnestinglevel) throws Exception{
		this.maxnestinglevel = maxnestinglevel;
	}

	/**
	* <pre>
	* .<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public Long get_maxnestinglevel() throws Exception {
		return this.maxnestinglevel;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_groupnameidentifier(String groupnameidentifier) throws Exception{
		this.groupnameidentifier = groupnameidentifier;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_groupnameidentifier() throws Exception {
		return this.groupnameidentifier;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_groupsearchattribute(String groupsearchattribute) throws Exception{
		this.groupsearchattribute = groupsearchattribute;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_groupsearchattribute() throws Exception {
		return this.groupsearchattribute;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_groupsearchsubattribute(String groupsearchsubattribute) throws Exception{
		this.groupsearchsubattribute = groupsearchsubattribute;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_groupsearchsubattribute() throws Exception {
		return this.groupsearchsubattribute;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_groupsearchfilter(String groupsearchfilter) throws Exception{
		this.groupsearchfilter = groupsearchfilter;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_groupsearchfilter() throws Exception {
		return this.groupsearchfilter;
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		aaaldapparams[] resources = new aaaldapparams[1];
		aaaldapparams_response result = (aaaldapparams_response) service.get_payload_formatter().string_to_resource(aaaldapparams_response.class, response);
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
		resources[0] = result.aaaldapparams;
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
	* Use this API to update aaaldapparams.
	*/
	public static base_response update(nitro_service client, aaaldapparams resource) throws Exception {
		aaaldapparams updateresource = new aaaldapparams();
		updateresource.serverip = resource.serverip;
		updateresource.serverport = resource.serverport;
		updateresource.authtimeout = resource.authtimeout;
		updateresource.ldapbase = resource.ldapbase;
		updateresource.ldapbinddn = resource.ldapbinddn;
		updateresource.ldapbinddnpassword = resource.ldapbinddnpassword;
		updateresource.ldaploginname = resource.ldaploginname;
		updateresource.searchfilter = resource.searchfilter;
		updateresource.groupattrname = resource.groupattrname;
		updateresource.subattributename = resource.subattributename;
		updateresource.sectype = resource.sectype;
		updateresource.svrtype = resource.svrtype;
		updateresource.ssonameattribute = resource.ssonameattribute;
		updateresource.passwdchange = resource.passwdchange;
		updateresource.nestedgroupextraction = resource.nestedgroupextraction;
		updateresource.maxnestinglevel = resource.maxnestinglevel;
		updateresource.groupnameidentifier = resource.groupnameidentifier;
		updateresource.groupsearchattribute = resource.groupsearchattribute;
		updateresource.groupsearchsubattribute = resource.groupsearchsubattribute;
		updateresource.groupsearchfilter = resource.groupsearchfilter;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaaldapparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaaldapparams resource, String[] args) throws Exception{
		aaaldapparams unsetresource = new aaaldapparams();
		unsetresource.serverip = resource.serverip;
		unsetresource.serverport = resource.serverport;
		unsetresource.authtimeout = resource.authtimeout;
		unsetresource.ldapbase = resource.ldapbase;
		unsetresource.ldapbinddn = resource.ldapbinddn;
		unsetresource.ldapbinddnpassword = resource.ldapbinddnpassword;
		unsetresource.ldaploginname = resource.ldaploginname;
		unsetresource.searchfilter = resource.searchfilter;
		unsetresource.groupattrname = resource.groupattrname;
		unsetresource.subattributename = resource.subattributename;
		unsetresource.sectype = resource.sectype;
		unsetresource.svrtype = resource.svrtype;
		unsetresource.ssonameattribute = resource.ssonameattribute;
		unsetresource.passwdchange = resource.passwdchange;
		unsetresource.nestedgroupextraction = resource.nestedgroupextraction;
		unsetresource.maxnestinglevel = resource.maxnestinglevel;
		unsetresource.groupnameidentifier = resource.groupnameidentifier;
		unsetresource.groupsearchattribute = resource.groupsearchattribute;
		unsetresource.groupsearchsubattribute = resource.groupsearchsubattribute;
		unsetresource.groupsearchfilter = resource.groupsearchfilter;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the aaaldapparams resources that are configured on netscaler.
	*/
	public static aaaldapparams get(nitro_service service) throws Exception{
		aaaldapparams obj = new aaaldapparams();
		aaaldapparams[] response = (aaaldapparams[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the aaaldapparams resources that are configured on netscaler.
	*/
	public static aaaldapparams get(nitro_service service,  options option) throws Exception{
		aaaldapparams obj = new aaaldapparams();
		aaaldapparams[] response = (aaaldapparams[])obj.get_resources(service,option);
		return response[0];
	}

	public static class passwdchangeEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sectypeEnum {
		public static final String PLAINTEXT = "PLAINTEXT";
		public static final String TLS = "TLS";
		public static final String SSL = "SSL";
	}
	public static class svrtypeEnum {
		public static final String AD = "AD";
		public static final String NDS = "NDS";
	}
	public static class nestedgroupextractionEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
