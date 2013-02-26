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

class authenticationldapaction_response extends base_response
{
	public authenticationldapaction[] authenticationldapaction;
}
/**
* Configuration for LDAP action resource.
*/

public class authenticationldapaction extends base_resource
{
	private String name;
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
	private String authentication;
	private String requireuser;
	private String passwdchange;
	private String nestedgroupextraction;
	private Long maxnestinglevel;
	private String groupnameidentifier;
	private String groupsearchattribute;
	private String groupsearchsubattribute;
	private String groupsearchfilter;

	//------- Read only Parameter ---------;

	private Long success;
	private Long failure;
	private Long __count;

	/**
	* <pre>
	* The name for the new LDAP action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new LDAP action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The IP address of the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* The IP address of the LDAP server.<br> Minimum length =  1
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
	* The base, or node where the ldapsearch should start. If the LDAP server is running locally, the default value of base is dc=netscaler, dc=com. .
	* </pre>
	*/
	public void set_ldapbase(String ldapbase) throws Exception{
		this.ldapbase = ldapbase;
	}

	/**
	* <pre>
	* The base, or node where the ldapsearch should start. If the LDAP server is running locally, the default value of base is dc=netscaler, dc=com. .
	* </pre>
	*/
	public String get_ldapbase() throws Exception {
		return this.ldapbase;
	}

	/**
	* <pre>
	* The full distinguished name that is used to bind to the LDAP server. The default value of the bindDN is cn=Manager,dc=netscaler,dc=com.
	* </pre>
	*/
	public void set_ldapbinddn(String ldapbinddn) throws Exception{
		this.ldapbinddn = ldapbinddn;
	}

	/**
	* <pre>
	* The full distinguished name that is used to bind to the LDAP server. The default value of the bindDN is cn=Manager,dc=netscaler,dc=com.
	* </pre>
	*/
	public String get_ldapbinddn() throws Exception {
		return this.ldapbinddn;
	}

	/**
	* <pre>
	* The password that is used to bind to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ldapbinddnpassword(String ldapbinddnpassword) throws Exception{
		this.ldapbinddnpassword = ldapbinddnpassword;
	}

	/**
	* <pre>
	* The password that is used to bind to the LDAP server.<br> Minimum length =  1
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
	* The string to be combined with the default LDAP user search string to form the value. For example, vpnallowed=true with ldaploginame "samaccount" and the user-supplied username "bob" would yield the LDAP search string "(&(vpnallowed=true)(samaccount=bob)".<br> Minimum length =  1
	* </pre>
	*/
	public void set_searchfilter(String searchfilter) throws Exception{
		this.searchfilter = searchfilter;
	}

	/**
	* <pre>
	* The string to be combined with the default LDAP user search string to form the value. For example, vpnallowed=true with ldaploginame "samaccount" and the user-supplied username "bob" would yield the LDAP search string "(&(vpnallowed=true)(samaccount=bob)".<br> Minimum length =  1
	* </pre>
	*/
	public String get_searchfilter() throws Exception {
		return this.searchfilter;
	}

	/**
	* <pre>
	* The Attribute name for group extraction from the LDAP server.
	* </pre>
	*/
	public void set_groupattrname(String groupattrname) throws Exception{
		this.groupattrname = groupattrname;
	}

	/**
	* <pre>
	* The Attribute name for group extraction from the LDAP server.
	* </pre>
	*/
	public String get_groupattrname() throws Exception {
		return this.groupattrname;
	}

	/**
	* <pre>
	* The Sub-Attribute name for group extraction from the LDAP server.
	* </pre>
	*/
	public void set_subattributename(String subattributename) throws Exception{
		this.subattributename = subattributename;
	}

	/**
	* <pre>
	* The Sub-Attribute name for group extraction from the LDAP server.
	* </pre>
	*/
	public String get_subattributename() throws Exception {
		return this.subattributename;
	}

	/**
	* <pre>
	* This option indicates whether communication between the system and the authentication server should be encrypted. The following values are allowed:
PLAINTEXT: No encryption required.
TLS: Communicate using TLS protocol.
SSL: Communicate using SSL Protocol.<br> Default value: PLAINTEXT<br> Possible values = PLAINTEXT, TLS, SSL
	* </pre>
	*/
	public void set_sectype(String sectype) throws Exception{
		this.sectype = sectype;
	}

	/**
	* <pre>
	* This option indicates whether communication between the system and the authentication server should be encrypted. The following values are allowed:
PLAINTEXT: No encryption required.
TLS: Communicate using TLS protocol.
SSL: Communicate using SSL Protocol.<br> Default value: PLAINTEXT<br> Possible values = PLAINTEXT, TLS, SSL
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
	* The attribute used by the system to query the external LDAP server, or an Active Directory, for an alternate username to be used in Single Sign-On.
	* </pre>
	*/
	public void set_ssonameattribute(String ssonameattribute) throws Exception{
		this.ssonameattribute = ssonameattribute;
	}

	/**
	* <pre>
	* The attribute used by the system to query the external LDAP server, or an Active Directory, for an alternate username to be used in Single Sign-On.
	* </pre>
	*/
	public String get_ssonameattribute() throws Exception {
		return this.ssonameattribute;
	}

	/**
	* <pre>
	* Disable authentication.  If disabled this LDAP action will return authentication success if the user is found.  This should only be used for authorization group extraction and in conjuction with other authentication methods. The other authentication methods should be bound to a primary list or flagged as secondary.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* Disable authentication.  If disabled this LDAP action will return authentication success if the user is found.  This should only be used for authorization group extraction and in conjuction with other authentication methods. The other authentication methods should be bound to a primary list or flagged as secondary.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* Setting this option to NO allows failed user searches to be considered authentication successes. If you set require user to NO, you may only configure it with authentication DISABLED.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_requireuser(String requireuser) throws Exception{
		this.requireuser = requireuser;
	}

	/**
	* <pre>
	* Setting this option to NO allows failed user searches to be considered authentication successes. If you set require user to NO, you may only configure it with authentication DISABLED.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_requireuser() throws Exception {
		return this.requireuser;
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
	* If NESTED GROUP EXTRACTION is set to ON, this option specifies the level upto which ancestors of a group/subgroup will be determined.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public void set_maxnestinglevel(long maxnestinglevel) throws Exception {
		this.maxnestinglevel = new Long(maxnestinglevel);
	}

	/**
	* <pre>
	* If NESTED GROUP EXTRACTION is set to ON, this option specifies the level upto which ancestors of a group/subgroup will be determined.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public void set_maxnestinglevel(Long maxnestinglevel) throws Exception{
		this.maxnestinglevel = maxnestinglevel;
	}

	/**
	* <pre>
	* If NESTED GROUP EXTRACTION is set to ON, this option specifies the level upto which ancestors of a group/subgroup will be determined.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public Long get_maxnestinglevel() throws Exception {
		return this.maxnestinglevel;
	}

	/**
	* <pre>
	* The group-attribute used by the system to uniquely identify a group in LDAP/AD.
	* </pre>
	*/
	public void set_groupnameidentifier(String groupnameidentifier) throws Exception{
		this.groupnameidentifier = groupnameidentifier;
	}

	/**
	* <pre>
	* The group-attribute used by the system to uniquely identify a group in LDAP/AD.
	* </pre>
	*/
	public String get_groupnameidentifier() throws Exception {
		return this.groupnameidentifier;
	}

	/**
	* <pre>
	* This option specifies the attribute that will be used to determine group-membership of a 'group'.
	* </pre>
	*/
	public void set_groupsearchattribute(String groupsearchattribute) throws Exception{
		this.groupsearchattribute = groupsearchattribute;
	}

	/**
	* <pre>
	* This option specifies the attribute that will be used to determine group-membership of a 'group'.
	* </pre>
	*/
	public String get_groupsearchattribute() throws Exception {
		return this.groupsearchattribute;
	}

	/**
	* <pre>
	* This option specifies the sub-attribute that will be used to determine group-membership of a 'group'.
	* </pre>
	*/
	public void set_groupsearchsubattribute(String groupsearchsubattribute) throws Exception{
		this.groupsearchsubattribute = groupsearchsubattribute;
	}

	/**
	* <pre>
	* This option specifies the sub-attribute that will be used to determine group-membership of a 'group'.
	* </pre>
	*/
	public String get_groupsearchsubattribute() throws Exception {
		return this.groupsearchsubattribute;
	}

	/**
	* <pre>
	* The string to be combined with the default LDAP group search string to form the value. For example, vpnallowed=true with groupIdentifier "samaccount" and the groupname "g1" would yield the LDAP search string "(&(vpnallowed=true)(samaccount=g1)".
	* </pre>
	*/
	public void set_groupsearchfilter(String groupsearchfilter) throws Exception{
		this.groupsearchfilter = groupsearchfilter;
	}

	/**
	* <pre>
	* The string to be combined with the default LDAP group search string to form the value. For example, vpnallowed=true with groupIdentifier "samaccount" and the groupname "g1" would yield the LDAP search string "(&(vpnallowed=true)(samaccount=g1)".
	* </pre>
	*/
	public String get_groupsearchfilter() throws Exception {
		return this.groupsearchfilter;
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
		authenticationldapaction_response result = (authenticationldapaction_response) service.get_payload_formatter().string_to_resource(authenticationldapaction_response.class, response);
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
		return result.authenticationldapaction;
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
	* Use this API to add authenticationldapaction.
	*/
	public static base_response add(nitro_service client, authenticationldapaction resource) throws Exception {
		authenticationldapaction addresource = new authenticationldapaction();
		addresource.name = resource.name;
		addresource.serverip = resource.serverip;
		addresource.serverport = resource.serverport;
		addresource.authtimeout = resource.authtimeout;
		addresource.ldapbase = resource.ldapbase;
		addresource.ldapbinddn = resource.ldapbinddn;
		addresource.ldapbinddnpassword = resource.ldapbinddnpassword;
		addresource.ldaploginname = resource.ldaploginname;
		addresource.searchfilter = resource.searchfilter;
		addresource.groupattrname = resource.groupattrname;
		addresource.subattributename = resource.subattributename;
		addresource.sectype = resource.sectype;
		addresource.svrtype = resource.svrtype;
		addresource.ssonameattribute = resource.ssonameattribute;
		addresource.authentication = resource.authentication;
		addresource.requireuser = resource.requireuser;
		addresource.passwdchange = resource.passwdchange;
		addresource.nestedgroupextraction = resource.nestedgroupextraction;
		addresource.maxnestinglevel = resource.maxnestinglevel;
		addresource.groupnameidentifier = resource.groupnameidentifier;
		addresource.groupsearchattribute = resource.groupsearchattribute;
		addresource.groupsearchsubattribute = resource.groupsearchsubattribute;
		addresource.groupsearchfilter = resource.groupsearchfilter;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationldapaction resources.
	*/
	public static base_responses add(nitro_service client, authenticationldapaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationldapaction addresources[] = new authenticationldapaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationldapaction();
				addresources[i].name = resources[i].name;
				addresources[i].serverip = resources[i].serverip;
				addresources[i].serverport = resources[i].serverport;
				addresources[i].authtimeout = resources[i].authtimeout;
				addresources[i].ldapbase = resources[i].ldapbase;
				addresources[i].ldapbinddn = resources[i].ldapbinddn;
				addresources[i].ldapbinddnpassword = resources[i].ldapbinddnpassword;
				addresources[i].ldaploginname = resources[i].ldaploginname;
				addresources[i].searchfilter = resources[i].searchfilter;
				addresources[i].groupattrname = resources[i].groupattrname;
				addresources[i].subattributename = resources[i].subattributename;
				addresources[i].sectype = resources[i].sectype;
				addresources[i].svrtype = resources[i].svrtype;
				addresources[i].ssonameattribute = resources[i].ssonameattribute;
				addresources[i].authentication = resources[i].authentication;
				addresources[i].requireuser = resources[i].requireuser;
				addresources[i].passwdchange = resources[i].passwdchange;
				addresources[i].nestedgroupextraction = resources[i].nestedgroupextraction;
				addresources[i].maxnestinglevel = resources[i].maxnestinglevel;
				addresources[i].groupnameidentifier = resources[i].groupnameidentifier;
				addresources[i].groupsearchattribute = resources[i].groupsearchattribute;
				addresources[i].groupsearchsubattribute = resources[i].groupsearchsubattribute;
				addresources[i].groupsearchfilter = resources[i].groupsearchfilter;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationldapaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationldapaction deleteresource = new authenticationldapaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationldapaction.
	*/
	public static base_response delete(nitro_service client, authenticationldapaction resource) throws Exception {
		authenticationldapaction deleteresource = new authenticationldapaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationldapaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationldapaction deleteresources[] = new authenticationldapaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationldapaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationldapaction resources.
	*/
	public static base_responses delete(nitro_service client, authenticationldapaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationldapaction deleteresources[] = new authenticationldapaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationldapaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationldapaction.
	*/
	public static base_response update(nitro_service client, authenticationldapaction resource) throws Exception {
		authenticationldapaction updateresource = new authenticationldapaction();
		updateresource.name = resource.name;
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
		updateresource.authentication = resource.authentication;
		updateresource.requireuser = resource.requireuser;
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
	* Use this API to update authenticationldapaction resources.
	*/
	public static base_responses update(nitro_service client, authenticationldapaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationldapaction updateresources[] = new authenticationldapaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationldapaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].serverip = resources[i].serverip;
				updateresources[i].serverport = resources[i].serverport;
				updateresources[i].authtimeout = resources[i].authtimeout;
				updateresources[i].ldapbase = resources[i].ldapbase;
				updateresources[i].ldapbinddn = resources[i].ldapbinddn;
				updateresources[i].ldapbinddnpassword = resources[i].ldapbinddnpassword;
				updateresources[i].ldaploginname = resources[i].ldaploginname;
				updateresources[i].searchfilter = resources[i].searchfilter;
				updateresources[i].groupattrname = resources[i].groupattrname;
				updateresources[i].subattributename = resources[i].subattributename;
				updateresources[i].sectype = resources[i].sectype;
				updateresources[i].svrtype = resources[i].svrtype;
				updateresources[i].ssonameattribute = resources[i].ssonameattribute;
				updateresources[i].authentication = resources[i].authentication;
				updateresources[i].requireuser = resources[i].requireuser;
				updateresources[i].passwdchange = resources[i].passwdchange;
				updateresources[i].nestedgroupextraction = resources[i].nestedgroupextraction;
				updateresources[i].maxnestinglevel = resources[i].maxnestinglevel;
				updateresources[i].groupnameidentifier = resources[i].groupnameidentifier;
				updateresources[i].groupsearchattribute = resources[i].groupsearchattribute;
				updateresources[i].groupsearchsubattribute = resources[i].groupsearchsubattribute;
				updateresources[i].groupsearchfilter = resources[i].groupsearchfilter;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationldapaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationldapaction unsetresource = new authenticationldapaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationldapaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationldapaction resource, String[] args) throws Exception{
		authenticationldapaction unsetresource = new authenticationldapaction();
		unsetresource.name = resource.name;
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
		unsetresource.authentication = resource.authentication;
		unsetresource.requireuser = resource.requireuser;
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
	* Use this API to unset the properties of authenticationldapaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationldapaction unsetresources[] = new authenticationldapaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationldapaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationldapaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationldapaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationldapaction unsetresources[] = new authenticationldapaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationldapaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].serverip = resources[i].serverip;
				unsetresources[i].serverport = resources[i].serverport;
				unsetresources[i].authtimeout = resources[i].authtimeout;
				unsetresources[i].ldapbase = resources[i].ldapbase;
				unsetresources[i].ldapbinddn = resources[i].ldapbinddn;
				unsetresources[i].ldapbinddnpassword = resources[i].ldapbinddnpassword;
				unsetresources[i].ldaploginname = resources[i].ldaploginname;
				unsetresources[i].searchfilter = resources[i].searchfilter;
				unsetresources[i].groupattrname = resources[i].groupattrname;
				unsetresources[i].subattributename = resources[i].subattributename;
				unsetresources[i].sectype = resources[i].sectype;
				unsetresources[i].svrtype = resources[i].svrtype;
				unsetresources[i].ssonameattribute = resources[i].ssonameattribute;
				unsetresources[i].authentication = resources[i].authentication;
				unsetresources[i].requireuser = resources[i].requireuser;
				unsetresources[i].passwdchange = resources[i].passwdchange;
				unsetresources[i].nestedgroupextraction = resources[i].nestedgroupextraction;
				unsetresources[i].maxnestinglevel = resources[i].maxnestinglevel;
				unsetresources[i].groupnameidentifier = resources[i].groupnameidentifier;
				unsetresources[i].groupsearchattribute = resources[i].groupsearchattribute;
				unsetresources[i].groupsearchsubattribute = resources[i].groupsearchsubattribute;
				unsetresources[i].groupsearchfilter = resources[i].groupsearchfilter;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationldapaction resources that are configured on netscaler.
	*/
	public static authenticationldapaction[] get(nitro_service service) throws Exception{
		authenticationldapaction obj = new authenticationldapaction();
		authenticationldapaction[] response = (authenticationldapaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationldapaction resources that are configured on netscaler.
	*/
	public static authenticationldapaction[] get(nitro_service service, options option) throws Exception{
		authenticationldapaction obj = new authenticationldapaction();
		authenticationldapaction[] response = (authenticationldapaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationldapaction resource of given name .
	*/
	public static authenticationldapaction get(nitro_service service, String name) throws Exception{
		authenticationldapaction obj = new authenticationldapaction();
		obj.set_name(name);
		authenticationldapaction response = (authenticationldapaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationldapaction resources of given names .
	*/
	public static authenticationldapaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationldapaction response[] = new authenticationldapaction[name.length];
			authenticationldapaction obj[] = new authenticationldapaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationldapaction();
				obj[i].set_name(name[i]);
				response[i] = (authenticationldapaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationldapaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationldapaction[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationldapaction obj = new authenticationldapaction();
		options option = new options();
		option.set_filter(filter);
		authenticationldapaction[] response = (authenticationldapaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationldapaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationldapaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationldapaction obj = new authenticationldapaction();
		options option = new options();
		option.set_filter(filter);
		authenticationldapaction[] response = (authenticationldapaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationldapaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationldapaction obj = new authenticationldapaction();
		options option = new options();
		option.set_count(true);
		authenticationldapaction[] response = (authenticationldapaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationldapaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationldapaction obj = new authenticationldapaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationldapaction[] response = (authenticationldapaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationldapaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationldapaction obj = new authenticationldapaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationldapaction[] response = (authenticationldapaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
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
	public static class authenticationEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class requireuserEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
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
