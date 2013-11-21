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
	private String followreferrals;
	private Long maxldapreferrals;
	private String validateservercert;
	private String ldaphostname;
	private String groupnameidentifier;
	private String groupsearchattribute;
	private String groupsearchsubattribute;
	private String groupsearchfilter;
	private String defaultauthenticationgroup;

	//------- Read only Parameter ---------;

	private Long success;
	private Long failure;
	private Long __count;

	/**
	* <pre>
	* Name for the new LDAP action. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the LDAP action is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authentication action” or ‘my authentication action’).<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the new LDAP action. 
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Cannot be changed after the LDAP action is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, “my authentication action” or ‘my authentication action’).<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* IP address assigned to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* IP address assigned to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* Port on which the LDAP server accepts connections.<br> Default value: 389<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* Port on which the LDAP server accepts connections.<br> Default value: 389<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* Port on which the LDAP server accepts connections.<br> Default value: 389<br> Minimum value =  1
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
	* Base (node) from which to start LDAP searches. 
If the LDAP server is running locally, the default value of base is dc=netscaler, dc=com.
	* </pre>
	*/
	public void set_ldapbase(String ldapbase) throws Exception{
		this.ldapbase = ldapbase;
	}

	/**
	* <pre>
	* Base (node) from which to start LDAP searches. 
If the LDAP server is running locally, the default value of base is dc=netscaler, dc=com.
	* </pre>
	*/
	public String get_ldapbase() throws Exception {
		return this.ldapbase;
	}

	/**
	* <pre>
	* Full distinguished name (DN) that is used to bind to the LDAP server. 
Default: cn=Manager,dc=netscaler,dc=com.
	* </pre>
	*/
	public void set_ldapbinddn(String ldapbinddn) throws Exception{
		this.ldapbinddn = ldapbinddn;
	}

	/**
	* <pre>
	* Full distinguished name (DN) that is used to bind to the LDAP server. 
Default: cn=Manager,dc=netscaler,dc=com.
	* </pre>
	*/
	public String get_ldapbinddn() throws Exception {
		return this.ldapbinddn;
	}

	/**
	* <pre>
	* Password used to bind to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ldapbinddnpassword(String ldapbinddnpassword) throws Exception{
		this.ldapbinddnpassword = ldapbinddnpassword;
	}

	/**
	* <pre>
	* Password used to bind to the LDAP server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ldapbinddnpassword() throws Exception {
		return this.ldapbinddnpassword;
	}

	/**
	* <pre>
	* LDAP login name attribute. 
The NetScaler appliance uses the LDAP login name to query external LDAP servers or Active Directories.
	* </pre>
	*/
	public void set_ldaploginname(String ldaploginname) throws Exception{
		this.ldaploginname = ldaploginname;
	}

	/**
	* <pre>
	* LDAP login name attribute. 
The NetScaler appliance uses the LDAP login name to query external LDAP servers or Active Directories.
	* </pre>
	*/
	public String get_ldaploginname() throws Exception {
		return this.ldaploginname;
	}

	/**
	* <pre>
	* String to be combined with the default LDAP user search string to form the search value. For example, if the search filter “"vpnallowed=true"” is combined with the LDAP login name “"samaccount"” and the user-supplied username is “"bob"”, the result is the LDAP search string ""(&(vpnallowed=true)(samaccount=bob)"" (Be sure to enclose the search string in two sets of double quotation marks; both sets are needed.).<br> Minimum length =  1
	* </pre>
	*/
	public void set_searchfilter(String searchfilter) throws Exception{
		this.searchfilter = searchfilter;
	}

	/**
	* <pre>
	* String to be combined with the default LDAP user search string to form the search value. For example, if the search filter “"vpnallowed=true"” is combined with the LDAP login name “"samaccount"” and the user-supplied username is “"bob"”, the result is the LDAP search string ""(&(vpnallowed=true)(samaccount=bob)"" (Be sure to enclose the search string in two sets of double quotation marks; both sets are needed.).<br> Minimum length =  1
	* </pre>
	*/
	public String get_searchfilter() throws Exception {
		return this.searchfilter;
	}

	/**
	* <pre>
	* LDAP group attribute name.
Used for group extraction on the LDAP server.
	* </pre>
	*/
	public void set_groupattrname(String groupattrname) throws Exception{
		this.groupattrname = groupattrname;
	}

	/**
	* <pre>
	* LDAP group attribute name.
Used for group extraction on the LDAP server.
	* </pre>
	*/
	public String get_groupattrname() throws Exception {
		return this.groupattrname;
	}

	/**
	* <pre>
	* LDAP group sub-attribute name. 
Used for group extraction from the LDAP server.
	* </pre>
	*/
	public void set_subattributename(String subattributename) throws Exception{
		this.subattributename = subattributename;
	}

	/**
	* <pre>
	* LDAP group sub-attribute name. 
Used for group extraction from the LDAP server.
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
	* LDAP single signon (SSO) attribute. 
The NetScaler appliance uses the SSO name attribute to query external LDAP servers or Active Directories for an alternate username.
	* </pre>
	*/
	public void set_ssonameattribute(String ssonameattribute) throws Exception{
		this.ssonameattribute = ssonameattribute;
	}

	/**
	* <pre>
	* LDAP single signon (SSO) attribute. 
The NetScaler appliance uses the SSO name attribute to query external LDAP servers or Active Directories for an alternate username.
	* </pre>
	*/
	public String get_ssonameattribute() throws Exception {
		return this.ssonameattribute;
	}

	/**
	* <pre>
	* Perform LDAP authentication.
If authentication is disabled, any LDAP authentication attempt returns authentication success if the user is found. 
CAUTION! Authentication should be disabled only for authorization group extraction or where other (non-LDAP) authentication methods are in use and either bound to a primary list or flagged as secondary.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* Perform LDAP authentication.
If authentication is disabled, any LDAP authentication attempt returns authentication success if the user is found. 
CAUTION! Authentication should be disabled only for authorization group extraction or where other (non-LDAP) authentication methods are in use and either bound to a primary list or flagged as secondary.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* Require a successful user search for authentication.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_requireuser(String requireuser) throws Exception{
		this.requireuser = requireuser;
	}

	/**
	* <pre>
	* Require a successful user search for authentication.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_requireuser() throws Exception {
		return this.requireuser;
	}

	/**
	* <pre>
	* Allow password change requests.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_passwdchange(String passwdchange) throws Exception{
		this.passwdchange = passwdchange;
	}

	/**
	* <pre>
	* Allow password change requests.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_passwdchange() throws Exception {
		return this.passwdchange;
	}

	/**
	* <pre>
	* Allow nested group extraction, in which the NetScaler appliance queries external LDAP servers to determine whether a group is part of another group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_nestedgroupextraction(String nestedgroupextraction) throws Exception{
		this.nestedgroupextraction = nestedgroupextraction;
	}

	/**
	* <pre>
	* Allow nested group extraction, in which the NetScaler appliance queries external LDAP servers to determine whether a group is part of another group.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_nestedgroupextraction() throws Exception {
		return this.nestedgroupextraction;
	}

	/**
	* <pre>
	* If nested group extraction is ON, specifies the number of levels up to which group extraction is performed.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public void set_maxnestinglevel(long maxnestinglevel) throws Exception {
		this.maxnestinglevel = new Long(maxnestinglevel);
	}

	/**
	* <pre>
	* If nested group extraction is ON, specifies the number of levels up to which group extraction is performed.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public void set_maxnestinglevel(Long maxnestinglevel) throws Exception{
		this.maxnestinglevel = maxnestinglevel;
	}

	/**
	* <pre>
	* If nested group extraction is ON, specifies the number of levels up to which group extraction is performed.<br> Default value: 2<br> Minimum value =  2
	* </pre>
	*/
	public Long get_maxnestinglevel() throws Exception {
		return this.maxnestinglevel;
	}

	/**
	* <pre>
	* Setting this option to ON enables following LDAP referrals received from the LDAP server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_followreferrals(String followreferrals) throws Exception{
		this.followreferrals = followreferrals;
	}

	/**
	* <pre>
	* Setting this option to ON enables following LDAP referrals received from the LDAP server.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_followreferrals() throws Exception {
		return this.followreferrals;
	}

	/**
	* <pre>
	* Specifies the maximum number of nested referrals to follow.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_maxldapreferrals(long maxldapreferrals) throws Exception {
		this.maxldapreferrals = new Long(maxldapreferrals);
	}

	/**
	* <pre>
	* Specifies the maximum number of nested referrals to follow.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_maxldapreferrals(Long maxldapreferrals) throws Exception{
		this.maxldapreferrals = maxldapreferrals;
	}

	/**
	* <pre>
	* Specifies the maximum number of nested referrals to follow.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_maxldapreferrals() throws Exception {
		return this.maxldapreferrals;
	}

	/**
	* <pre>
	* When to validate LDAP server certs.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_validateservercert(String validateservercert) throws Exception{
		this.validateservercert = validateservercert;
	}

	/**
	* <pre>
	* When to validate LDAP server certs.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_validateservercert() throws Exception {
		return this.validateservercert;
	}

	/**
	* <pre>
	* Hostname for the LDAP server.  If -validateServerCert is ON then this must be the host name on the certificate from the LDAP server.
A hostname mismatch will cause a connection failure.
	* </pre>
	*/
	public void set_ldaphostname(String ldaphostname) throws Exception{
		this.ldaphostname = ldaphostname;
	}

	/**
	* <pre>
	* Hostname for the LDAP server.  If -validateServerCert is ON then this must be the host name on the certificate from the LDAP server.
A hostname mismatch will cause a connection failure.
	* </pre>
	*/
	public String get_ldaphostname() throws Exception {
		return this.ldaphostname;
	}

	/**
	* <pre>
	* Name that uniquely identifies a group in LDAP or Active Directory.
	* </pre>
	*/
	public void set_groupnameidentifier(String groupnameidentifier) throws Exception{
		this.groupnameidentifier = groupnameidentifier;
	}

	/**
	* <pre>
	* Name that uniquely identifies a group in LDAP or Active Directory.
	* </pre>
	*/
	public String get_groupnameidentifier() throws Exception {
		return this.groupnameidentifier;
	}

	/**
	* <pre>
	* LDAP group search attribute. 
Used to determine to which groups a group belongs.
	* </pre>
	*/
	public void set_groupsearchattribute(String groupsearchattribute) throws Exception{
		this.groupsearchattribute = groupsearchattribute;
	}

	/**
	* <pre>
	* LDAP group search attribute. 
Used to determine to which groups a group belongs.
	* </pre>
	*/
	public String get_groupsearchattribute() throws Exception {
		return this.groupsearchattribute;
	}

	/**
	* <pre>
	* LDAP group search subattribute. 
Used to determine to which groups a group belongs.
	* </pre>
	*/
	public void set_groupsearchsubattribute(String groupsearchsubattribute) throws Exception{
		this.groupsearchsubattribute = groupsearchsubattribute;
	}

	/**
	* <pre>
	* LDAP group search subattribute. 
Used to determine to which groups a group belongs.
	* </pre>
	*/
	public String get_groupsearchsubattribute() throws Exception {
		return this.groupsearchsubattribute;
	}

	/**
	* <pre>
	* String to be combined with the default LDAP group search string to form the search value.  For example, the group search filter ""vpnallowed=true"" when combined with the group identifier ""samaccount"" and the group name ""g1"" yields the LDAP search string ""(&(vpnallowed=true)(samaccount=g1)"". (Be sure to enclose the search string in two sets of double quotation marks; both sets are needed.).
	* </pre>
	*/
	public void set_groupsearchfilter(String groupsearchfilter) throws Exception{
		this.groupsearchfilter = groupsearchfilter;
	}

	/**
	* <pre>
	* String to be combined with the default LDAP group search string to form the search value.  For example, the group search filter ""vpnallowed=true"" when combined with the group identifier ""samaccount"" and the group name ""g1"" yields the LDAP search string ""(&(vpnallowed=true)(samaccount=g1)"". (Be sure to enclose the search string in two sets of double quotation marks; both sets are needed.).
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
		addresource.followreferrals = resource.followreferrals;
		addresource.maxldapreferrals = resource.maxldapreferrals;
		addresource.validateservercert = resource.validateservercert;
		addresource.ldaphostname = resource.ldaphostname;
		addresource.groupnameidentifier = resource.groupnameidentifier;
		addresource.groupsearchattribute = resource.groupsearchattribute;
		addresource.groupsearchsubattribute = resource.groupsearchsubattribute;
		addresource.groupsearchfilter = resource.groupsearchfilter;
		addresource.defaultauthenticationgroup = resource.defaultauthenticationgroup;
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
				addresources[i].followreferrals = resources[i].followreferrals;
				addresources[i].maxldapreferrals = resources[i].maxldapreferrals;
				addresources[i].validateservercert = resources[i].validateservercert;
				addresources[i].ldaphostname = resources[i].ldaphostname;
				addresources[i].groupnameidentifier = resources[i].groupnameidentifier;
				addresources[i].groupsearchattribute = resources[i].groupsearchattribute;
				addresources[i].groupsearchsubattribute = resources[i].groupsearchsubattribute;
				addresources[i].groupsearchfilter = resources[i].groupsearchfilter;
				addresources[i].defaultauthenticationgroup = resources[i].defaultauthenticationgroup;
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
		updateresource.validateservercert = resource.validateservercert;
		updateresource.ldaphostname = resource.ldaphostname;
		updateresource.nestedgroupextraction = resource.nestedgroupextraction;
		updateresource.maxnestinglevel = resource.maxnestinglevel;
		updateresource.groupnameidentifier = resource.groupnameidentifier;
		updateresource.groupsearchattribute = resource.groupsearchattribute;
		updateresource.groupsearchsubattribute = resource.groupsearchsubattribute;
		updateresource.groupsearchfilter = resource.groupsearchfilter;
		updateresource.followreferrals = resource.followreferrals;
		updateresource.maxldapreferrals = resource.maxldapreferrals;
		updateresource.defaultauthenticationgroup = resource.defaultauthenticationgroup;
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
				updateresources[i].validateservercert = resources[i].validateservercert;
				updateresources[i].ldaphostname = resources[i].ldaphostname;
				updateresources[i].nestedgroupextraction = resources[i].nestedgroupextraction;
				updateresources[i].maxnestinglevel = resources[i].maxnestinglevel;
				updateresources[i].groupnameidentifier = resources[i].groupnameidentifier;
				updateresources[i].groupsearchattribute = resources[i].groupsearchattribute;
				updateresources[i].groupsearchsubattribute = resources[i].groupsearchsubattribute;
				updateresources[i].groupsearchfilter = resources[i].groupsearchfilter;
				updateresources[i].followreferrals = resources[i].followreferrals;
				updateresources[i].maxldapreferrals = resources[i].maxldapreferrals;
				updateresources[i].defaultauthenticationgroup = resources[i].defaultauthenticationgroup;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationldapaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationldapaction resource, String[] args) throws Exception{
		authenticationldapaction unsetresource = new authenticationldapaction();
		unsetresource.name = resource.name;
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
	public static class validateservercertEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class followreferralsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
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
