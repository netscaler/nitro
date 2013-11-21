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
	private String defaultauthenticationgroup;

	//------- Read only Parameter ---------;

	private String groupauthname;

	/**
	* <pre>
	* IP address of your LDAP server.
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* IP address of your LDAP server.
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* Port number on which the LDAP server listens for connections.<br> Default value: 389<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* Port number on which the LDAP server listens for connections.<br> Default value: 389<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* Port number on which the LDAP server listens for connections.<br> Default value: 389<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* Maximum number of seconds that the NetScaler appliance waits for a response from the LDAP server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(long authtimeout) throws Exception {
		this.authtimeout = new Long(authtimeout);
	}

	/**
	* <pre>
	* Maximum number of seconds that the NetScaler appliance waits for a response from the LDAP server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(Long authtimeout) throws Exception{
		this.authtimeout = authtimeout;
	}

	/**
	* <pre>
	* Maximum number of seconds that the NetScaler appliance waits for a response from the LDAP server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public Long get_authtimeout() throws Exception {
		return this.authtimeout;
	}

	/**
	* <pre>
	* Base (the server and location) from which LDAP search commands should start. 
If the LDAP server is running locally, the default value of base is dc=netscaler, dc=com.
	* </pre>
	*/
	public void set_ldapbase(String ldapbase) throws Exception{
		this.ldapbase = ldapbase;
	}

	/**
	* <pre>
	* Base (the server and location) from which LDAP search commands should start. 
If the LDAP server is running locally, the default value of base is dc=netscaler, dc=com.
	* </pre>
	*/
	public String get_ldapbase() throws Exception {
		return this.ldapbase;
	}

	/**
	* <pre>
	* Complete distinguished name (DN) string used for binding to the LDAP server.
	* </pre>
	*/
	public void set_ldapbinddn(String ldapbinddn) throws Exception{
		this.ldapbinddn = ldapbinddn;
	}

	/**
	* <pre>
	* Complete distinguished name (DN) string used for binding to the LDAP server.
	* </pre>
	*/
	public String get_ldapbinddn() throws Exception {
		return this.ldapbinddn;
	}

	/**
	* <pre>
	* Password for binding to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ldapbinddnpassword(String ldapbinddnpassword) throws Exception{
		this.ldapbinddnpassword = ldapbinddnpassword;
	}

	/**
	* <pre>
	* Password for binding to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ldapbinddnpassword() throws Exception {
		return this.ldapbinddnpassword;
	}

	/**
	* <pre>
	* Name attribute that the NetScaler appliance uses to query the external LDAP server or an Active Directory.
	* </pre>
	*/
	public void set_ldaploginname(String ldaploginname) throws Exception{
		this.ldaploginname = ldaploginname;
	}

	/**
	* <pre>
	* Name attribute that the NetScaler appliance uses to query the external LDAP server or an Active Directory.
	* </pre>
	*/
	public String get_ldaploginname() throws Exception {
		return this.ldaploginname;
	}

	/**
	* <pre>
	* String to be combined with the default LDAP user search string to form the value to use when executing an LDAP search. 
For example, the following values:
vpnallowed=true,
ldaploginame=""samaccount""
when combined with the user-supplied username ""bob"", yield the following LDAP search string:
""(&(vpnallowed=true)(samaccount=bob)"".<br> Minimum length =  1
	* </pre>
	*/
	public void set_searchfilter(String searchfilter) throws Exception{
		this.searchfilter = searchfilter;
	}

	/**
	* <pre>
	* String to be combined with the default LDAP user search string to form the value to use when executing an LDAP search. 
For example, the following values:
vpnallowed=true,
ldaploginame=""samaccount""
when combined with the user-supplied username ""bob"", yield the following LDAP search string:
""(&(vpnallowed=true)(samaccount=bob)"".<br> Minimum length =  1
	* </pre>
	*/
	public String get_searchfilter() throws Exception {
		return this.searchfilter;
	}

	/**
	* <pre>
	* Attribute name used for group extraction from the LDAP server.
	* </pre>
	*/
	public void set_groupattrname(String groupattrname) throws Exception{
		this.groupattrname = groupattrname;
	}

	/**
	* <pre>
	* Attribute name used for group extraction from the LDAP server.
	* </pre>
	*/
	public String get_groupattrname() throws Exception {
		return this.groupattrname;
	}

	/**
	* <pre>
	* Subattribute name used for group extraction from the LDAP server.
	* </pre>
	*/
	public void set_subattributename(String subattributename) throws Exception{
		this.subattributename = subattributename;
	}

	/**
	* <pre>
	* Subattribute name used for group extraction from the LDAP server.
	* </pre>
	*/
	public String get_subattributename() throws Exception {
		return this.subattributename;
	}

	/**
	* <pre>
	* Type of security used for communications between the NetScaler appliance and the LDAP server. For the PLAINTEXT setting, no encryption is required.<br> Default value: PLAINTEXT<br> Possible values = PLAINTEXT, TLS, SSL
	* </pre>
	*/
	public void set_sectype(String sectype) throws Exception{
		this.sectype = sectype;
	}

	/**
	* <pre>
	* Type of security used for communications between the NetScaler appliance and the LDAP server. For the PLAINTEXT setting, no encryption is required.<br> Default value: PLAINTEXT<br> Possible values = PLAINTEXT, TLS, SSL
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
	* Attribute used by the NetScaler appliance to query an external LDAP server or Active Directory for an alternative username. 
This alternative username is then used for single sign-on (SSO).
	* </pre>
	*/
	public void set_ssonameattribute(String ssonameattribute) throws Exception{
		this.ssonameattribute = ssonameattribute;
	}

	/**
	* <pre>
	* Attribute used by the NetScaler appliance to query an external LDAP server or Active Directory for an alternative username. 
This alternative username is then used for single sign-on (SSO).
	* </pre>
	*/
	public String get_ssonameattribute() throws Exception {
		return this.ssonameattribute;
	}

	/**
	* <pre>
	* Accept password change requests.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_passwdchange(String passwdchange) throws Exception{
		this.passwdchange = passwdchange;
	}

	/**
	* <pre>
	* Accept password change requests.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_passwdchange() throws Exception {
		return this.passwdchange;
	}

	/**
	* <pre>
	* Queries the external LDAP server to determine whether the specified group belongs to another group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_nestedgroupextraction(String nestedgroupextraction) throws Exception{
		this.nestedgroupextraction = nestedgroupextraction;
	}

	/**
	* <pre>
	* Queries the external LDAP server to determine whether the specified group belongs to another group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_nestedgroupextraction() throws Exception {
		return this.nestedgroupextraction;
	}

	/**
	* <pre>
	* Number of levels up to which the system can query nested LDAP groups.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public void set_maxnestinglevel(long maxnestinglevel) throws Exception {
		this.maxnestinglevel = new Long(maxnestinglevel);
	}

	/**
	* <pre>
	* Number of levels up to which the system can query nested LDAP groups.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public void set_maxnestinglevel(Long maxnestinglevel) throws Exception{
		this.maxnestinglevel = maxnestinglevel;
	}

	/**
	* <pre>
	* Number of levels up to which the system can query nested LDAP groups.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public Long get_maxnestinglevel() throws Exception {
		return this.maxnestinglevel;
	}

	/**
	* <pre>
	* LDAP-group attribute that uniquely identifies the group. No two groups on one LDAP server can have the same group name identifier.
	* </pre>
	*/
	public void set_groupnameidentifier(String groupnameidentifier) throws Exception{
		this.groupnameidentifier = groupnameidentifier;
	}

	/**
	* <pre>
	* LDAP-group attribute that uniquely identifies the group. No two groups on one LDAP server can have the same group name identifier.
	* </pre>
	*/
	public String get_groupnameidentifier() throws Exception {
		return this.groupnameidentifier;
	}

	/**
	* <pre>
	* LDAP-group attribute that designates the parent group of the specified group. Use this attribute to search for a group’s parent group.
	* </pre>
	*/
	public void set_groupsearchattribute(String groupsearchattribute) throws Exception{
		this.groupsearchattribute = groupsearchattribute;
	}

	/**
	* <pre>
	* LDAP-group attribute that designates the parent group of the specified group. Use this attribute to search for a group’s parent group.
	* </pre>
	*/
	public String get_groupsearchattribute() throws Exception {
		return this.groupsearchattribute;
	}

	/**
	* <pre>
	* LDAP-group subattribute that designates the parent group of the specified group. Use this attribute to search for a group’s parent group.
	* </pre>
	*/
	public void set_groupsearchsubattribute(String groupsearchsubattribute) throws Exception{
		this.groupsearchsubattribute = groupsearchsubattribute;
	}

	/**
	* <pre>
	* LDAP-group subattribute that designates the parent group of the specified group. Use this attribute to search for a group’s parent group.
	* </pre>
	*/
	public String get_groupsearchsubattribute() throws Exception {
		return this.groupsearchsubattribute;
	}

	/**
	* <pre>
	* Search-expression that can be specified for sending group-search requests to the LDAP server.
	* </pre>
	*/
	public void set_groupsearchfilter(String groupsearchfilter) throws Exception{
		this.groupsearchfilter = groupsearchfilter;
	}

	/**
	* <pre>
	* Search-expression that can be specified for sending group-search requests to the LDAP server.
	* </pre>
	*/
	public String get_groupsearchfilter() throws Exception {
		return this.groupsearchfilter;
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
		updateresource.defaultauthenticationgroup = resource.defaultauthenticationgroup;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaaldapparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaaldapparams resource, String[] args) throws Exception{
		aaaldapparams unsetresource = new aaaldapparams();
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
