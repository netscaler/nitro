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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslcrl_response extends base_response
{
	public sslcrl[] sslcrl;
}
/**
* Configuration for Certificate Revocation List resource.
*/

public class sslcrl extends base_resource
{
	private String crlname;
	private String crlpath;
	private String inform;
	private String refresh;
	private String cacert;
	private String method;
	private String server;
	private String url;
	private Integer port;
	private String basedn;
	private String scope;
	private String interval;
	private Integer day;
	private String time;
	private String binddn;
	private String password;
	private String binary;
	private String cacertfile;
	private String cakeyfile;
	private String indexfile;
	private String revoke;
	private String gencrl;

	//------- Read only Parameter ---------;

	private Integer flags;
	private Integer lastupdatetime;
	private Integer version;
	private String signaturealgo;
	private String issuer;
	private String lastupdate;
	private String nextupdate;
	private Integer daystoexpiration;
	private Long __count;

	/**
	* <pre>
	* Name for the Certificate Revocation List (CRL). Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the CRL is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my crl" or 'my crl').<br> Minimum length =  1
	* </pre>
	*/
	public void set_crlname(String crlname) throws Exception{
		this.crlname = crlname;
	}

	/**
	* <pre>
	* Name for the Certificate Revocation List (CRL). Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the CRL is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my crl" or 'my crl').<br> Minimum length =  1
	* </pre>
	*/
	public String get_crlname() throws Exception {
		return this.crlname;
	}

	/**
	* <pre>
	* Path to the CRL file. /var/netscaler/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public void set_crlpath(String crlpath) throws Exception{
		this.crlpath = crlpath;
	}

	/**
	* <pre>
	* Path to the CRL file. /var/netscaler/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public String get_crlpath() throws Exception {
		return this.crlpath;
	}

	/**
	* <pre>
	* Input format of the CRL file. The two formats supported on the appliance are:
PEM - Privacy Enhanced Mail.
DER - Distinguished Encoding Rule.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_inform(String inform) throws Exception{
		this.inform = inform;
	}

	/**
	* <pre>
	* Input format of the CRL file. The two formats supported on the appliance are:
PEM - Privacy Enhanced Mail.
DER - Distinguished Encoding Rule.<br> Default value: PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_inform() throws Exception {
		return this.inform;
	}

	/**
	* <pre>
	* Set CRL auto refresh.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_refresh(String refresh) throws Exception{
		this.refresh = refresh;
	}

	/**
	* <pre>
	* Set CRL auto refresh.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_refresh() throws Exception {
		return this.refresh;
	}

	/**
	* <pre>
	* CA certificate that has issued the CRL. Required if CRL Auto Refresh is selected. Install the CA certificate on the appliance before adding the CRL.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cacert(String cacert) throws Exception{
		this.cacert = cacert;
	}

	/**
	* <pre>
	* CA certificate that has issued the CRL. Required if CRL Auto Refresh is selected. Install the CA certificate on the appliance before adding the CRL.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cacert() throws Exception {
		return this.cacert;
	}

	/**
	* <pre>
	* Method for CRL refresh. If LDAP is selected, specify the method, CA certificate, base DN, port, and LDAP server name. If HTTP is selected, specify the CA certificate, method, URL, and port. Cannot be changed after a CRL is added.<br> Possible values = HTTP, LDAP
	* </pre>
	*/
	public void set_method(String method) throws Exception{
		this.method = method;
	}

	/**
	* <pre>
	* Method for CRL refresh. If LDAP is selected, specify the method, CA certificate, base DN, port, and LDAP server name. If HTTP is selected, specify the CA certificate, method, URL, and port. Cannot be changed after a CRL is added.<br> Possible values = HTTP, LDAP
	* </pre>
	*/
	public String get_method() throws Exception {
		return this.method;
	}

	/**
	* <pre>
	* IP address of the LDAP server from which to fetch the CRLs.<br> Minimum length =  1
	* </pre>
	*/
	public void set_server(String server) throws Exception{
		this.server = server;
	}

	/**
	* <pre>
	* IP address of the LDAP server from which to fetch the CRLs.<br> Minimum length =  1
	* </pre>
	*/
	public String get_server() throws Exception {
		return this.server;
	}

	/**
	* <pre>
	* URL of the CRL distribution point.
	* </pre>
	*/
	public void set_url(String url) throws Exception{
		this.url = url;
	}

	/**
	* <pre>
	* URL of the CRL distribution point.
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* Port for the LDAP server.<br> Minimum value =  1
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Port for the LDAP server.<br> Minimum value =  1
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Port for the LDAP server.<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Base distinguished name (DN), which is used in an LDAP search to search for a CRL. Citrix recommends searching for the Base DN instead of the Issuer Name from the CA certificate, because the Issuer Name field might not exactly match the LDAP directory structure's DN.<br> Minimum length =  1
	* </pre>
	*/
	public void set_basedn(String basedn) throws Exception{
		this.basedn = basedn;
	}

	/**
	* <pre>
	* Base distinguished name (DN), which is used in an LDAP search to search for a CRL. Citrix recommends searching for the Base DN instead of the Issuer Name from the CA certificate, because the Issuer Name field might not exactly match the LDAP directory structure's DN.<br> Minimum length =  1
	* </pre>
	*/
	public String get_basedn() throws Exception {
		return this.basedn;
	}

	/**
	* <pre>
	* Extent of the search operation on the LDAP server. Available settings function as follows:
One - One level below Base DN.
Base - Exactly the same level as Base DN.<br> Default value: One<br> Possible values = Base, One
	* </pre>
	*/
	public void set_scope(String scope) throws Exception{
		this.scope = scope;
	}

	/**
	* <pre>
	* Extent of the search operation on the LDAP server. Available settings function as follows:
One - One level below Base DN.
Base - Exactly the same level as Base DN.<br> Default value: One<br> Possible values = Base, One
	* </pre>
	*/
	public String get_scope() throws Exception {
		return this.scope;
	}

	/**
	* <pre>
	* CRL refresh interval. Use the NONE setting to unset this parameter.<br> Possible values = MONTHLY, WEEKLY, DAILY, NONE
	* </pre>
	*/
	public void set_interval(String interval) throws Exception{
		this.interval = interval;
	}

	/**
	* <pre>
	* CRL refresh interval. Use the NONE setting to unset this parameter.<br> Possible values = MONTHLY, WEEKLY, DAILY, NONE
	* </pre>
	*/
	public String get_interval() throws Exception {
		return this.interval;
	}

	/**
	* <pre>
	* Day on which to refresh the CRL, or, if the Interval parameter is not set, the number of days after which to refresh the CRL. If Interval is set to MONTHLY, specify the date. If Interval is set to WEEKLY, specify the day of the week (for example, Sun=0 and Sat=6). This parameter is not applicable if the Interval is set to DAILY.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_day(int day) throws Exception {
		this.day = new Integer(day);
	}

	/**
	* <pre>
	* Day on which to refresh the CRL, or, if the Interval parameter is not set, the number of days after which to refresh the CRL. If Interval is set to MONTHLY, specify the date. If Interval is set to WEEKLY, specify the day of the week (for example, Sun=0 and Sat=6). This parameter is not applicable if the Interval is set to DAILY.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_day(Integer day) throws Exception{
		this.day = day;
	}

	/**
	* <pre>
	* Day on which to refresh the CRL, or, if the Interval parameter is not set, the number of days after which to refresh the CRL. If Interval is set to MONTHLY, specify the date. If Interval is set to WEEKLY, specify the day of the week (for example, Sun=0 and Sat=6). This parameter is not applicable if the Interval is set to DAILY.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Integer get_day() throws Exception {
		return this.day;
	}

	/**
	* <pre>
	* Time, in hours (1-24) and minutes (1-60), at which to refresh the CRL.
	* </pre>
	*/
	public void set_time(String time) throws Exception{
		this.time = time;
	}

	/**
	* <pre>
	* Time, in hours (1-24) and minutes (1-60), at which to refresh the CRL.
	* </pre>
	*/
	public String get_time() throws Exception {
		return this.time;
	}

	/**
	* <pre>
	* Bind distinguished name (DN) to be used to access the CRL object in the LDAP repository if access to the LDAP repository is restricted or anonymous access is not allowed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_binddn(String binddn) throws Exception{
		this.binddn = binddn;
	}

	/**
	* <pre>
	* Bind distinguished name (DN) to be used to access the CRL object in the LDAP repository if access to the LDAP repository is restricted or anonymous access is not allowed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_binddn() throws Exception {
		return this.binddn;
	}

	/**
	* <pre>
	* Password to access the CRL in the LDAP repository if access to the LDAP repository is restricted or anonymous access is not allowed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* Password to access the CRL in the LDAP repository if access to the LDAP repository is restricted or anonymous access is not allowed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* Set the LDAP-based CRL retrieval mode to binary.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_binary(String binary) throws Exception{
		this.binary = binary;
	}

	/**
	* <pre>
	* Set the LDAP-based CRL retrieval mode to binary.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_binary() throws Exception {
		return this.binary;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the CA certificate file.
/nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_cacertfile(String cacertfile) throws Exception{
		this.cacertfile = cacertfile;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the CA certificate file.
/nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_cacertfile() throws Exception {
		return this.cacertfile;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the CA key file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_cakeyfile(String cakeyfile) throws Exception{
		this.cakeyfile = cakeyfile;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the CA key file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_cakeyfile() throws Exception {
		return this.cakeyfile;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the file containing the serial numbers of all the certificates that are revoked. Revoked certificates are appended to the file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_indexfile(String indexfile) throws Exception{
		this.indexfile = indexfile;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the file containing the serial numbers of all the certificates that are revoked. Revoked certificates are appended to the file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_indexfile() throws Exception {
		return this.indexfile;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the certificate to be revoked. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_revoke(String revoke) throws Exception{
		this.revoke = revoke;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the certificate to be revoked. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_revoke() throws Exception {
		return this.revoke;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the CRL file to be generated. The list of certificates that have been revoked is obtained from the index file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public void set_gencrl(String gencrl) throws Exception{
		this.gencrl = gencrl;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the CRL file to be generated. The list of certificates that have been revoked is obtained from the index file. /nsconfig/ssl/ is the default path.<br> Maximum length =  63
	* </pre>
	*/
	public String get_gencrl() throws Exception {
		return this.gencrl;
	}

	/**
	* <pre>
	* CRL status flag.
	* </pre>
	*/
	public Integer get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* Last CRL refresh time.
	* </pre>
	*/
	public Integer get_lastupdatetime() throws Exception {
		return this.lastupdatetime;
	}

	/**
	* <pre>
	* CRL version.
	* </pre>
	*/
	public Integer get_version() throws Exception {
		return this.version;
	}

	/**
	* <pre>
	* Signature algorithm.
	* </pre>
	*/
	public String get_signaturealgo() throws Exception {
		return this.signaturealgo;
	}

	/**
	* <pre>
	* Issuer name.
	* </pre>
	*/
	public String get_issuer() throws Exception {
		return this.issuer;
	}

	/**
	* <pre>
	* Last update time.
	* </pre>
	*/
	public String get_lastupdate() throws Exception {
		return this.lastupdate;
	}

	/**
	* <pre>
	* Next update time.
	* </pre>
	*/
	public String get_nextupdate() throws Exception {
		return this.nextupdate;
	}

	/**
	* <pre>
	* Number of days remaining for the CRL to expire.
	* </pre>
	*/
	public Integer get_daystoexpiration() throws Exception {
		return this.daystoexpiration;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcrl_response result = (sslcrl_response) service.get_payload_formatter().string_to_resource(sslcrl_response.class, response);
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
		return result.sslcrl;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.crlname;
	}

	/**
	* Use this API to add sslcrl.
	*/
	public static base_response add(nitro_service client, sslcrl resource) throws Exception {
		sslcrl addresource = new sslcrl();
		addresource.crlname = resource.crlname;
		addresource.crlpath = resource.crlpath;
		addresource.inform = resource.inform;
		addresource.refresh = resource.refresh;
		addresource.cacert = resource.cacert;
		addresource.method = resource.method;
		addresource.server = resource.server;
		addresource.url = resource.url;
		addresource.port = resource.port;
		addresource.basedn = resource.basedn;
		addresource.scope = resource.scope;
		addresource.interval = resource.interval;
		addresource.day = resource.day;
		addresource.time = resource.time;
		addresource.binddn = resource.binddn;
		addresource.password = resource.password;
		addresource.binary = resource.binary;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add sslcrl resources.
	*/
	public static base_responses add(nitro_service client, sslcrl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcrl addresources[] = new sslcrl[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new sslcrl();
				addresources[i].crlname = resources[i].crlname;
				addresources[i].crlpath = resources[i].crlpath;
				addresources[i].inform = resources[i].inform;
				addresources[i].refresh = resources[i].refresh;
				addresources[i].cacert = resources[i].cacert;
				addresources[i].method = resources[i].method;
				addresources[i].server = resources[i].server;
				addresources[i].url = resources[i].url;
				addresources[i].port = resources[i].port;
				addresources[i].basedn = resources[i].basedn;
				addresources[i].scope = resources[i].scope;
				addresources[i].interval = resources[i].interval;
				addresources[i].day = resources[i].day;
				addresources[i].time = resources[i].time;
				addresources[i].binddn = resources[i].binddn;
				addresources[i].password = resources[i].password;
				addresources[i].binary = resources[i].binary;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to create sslcrl.
	*/
	public static base_response create(nitro_service client, sslcrl resource) throws Exception {
		sslcrl createresource = new sslcrl();
		createresource.cacertfile = resource.cacertfile;
		createresource.cakeyfile = resource.cakeyfile;
		createresource.indexfile = resource.indexfile;
		createresource.revoke = resource.revoke;
		createresource.gencrl = resource.gencrl;
		createresource.password = resource.password;
		return createresource.perform_operation(client,"create");
	}

	/**
	* Use this API to create sslcrl resources.
	*/
	public static base_responses create(nitro_service client, sslcrl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcrl createresources[] = new sslcrl[resources.length];
			for (int i=0;i<resources.length;i++){
				createresources[i] = new sslcrl();
				createresources[i].cacertfile = resources[i].cacertfile;
				createresources[i].cakeyfile = resources[i].cakeyfile;
				createresources[i].indexfile = resources[i].indexfile;
				createresources[i].revoke = resources[i].revoke;
				createresources[i].gencrl = resources[i].gencrl;
				createresources[i].password = resources[i].password;
			}
			result = perform_operation_bulk_request(client, createresources,"create");
		}
		return result;
	}

	/**
	* Use this API to delete sslcrl of given name.
	*/
	public static base_response delete(nitro_service client, String crlname) throws Exception {
		sslcrl deleteresource = new sslcrl();
		deleteresource.crlname = crlname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslcrl.
	*/
	public static base_response delete(nitro_service client, sslcrl resource) throws Exception {
		sslcrl deleteresource = new sslcrl();
		deleteresource.crlname = resource.crlname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslcrl resources of given names.
	*/
	public static base_responses delete(nitro_service client, String crlname[]) throws Exception {
		base_responses result = null;
		if (crlname != null && crlname.length > 0) {
			sslcrl deleteresources[] = new sslcrl[crlname.length];
			for (int i=0;i<crlname.length;i++){
				deleteresources[i] = new sslcrl();
				deleteresources[i].crlname = crlname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslcrl resources.
	*/
	public static base_responses delete(nitro_service client, sslcrl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcrl deleteresources[] = new sslcrl[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslcrl();
				deleteresources[i].crlname = resources[i].crlname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update sslcrl.
	*/
	public static base_response update(nitro_service client, sslcrl resource) throws Exception {
		sslcrl updateresource = new sslcrl();
		updateresource.crlname = resource.crlname;
		updateresource.refresh = resource.refresh;
		updateresource.cacert = resource.cacert;
		updateresource.server = resource.server;
		updateresource.method = resource.method;
		updateresource.url = resource.url;
		updateresource.port = resource.port;
		updateresource.basedn = resource.basedn;
		updateresource.scope = resource.scope;
		updateresource.interval = resource.interval;
		updateresource.day = resource.day;
		updateresource.time = resource.time;
		updateresource.binddn = resource.binddn;
		updateresource.password = resource.password;
		updateresource.binary = resource.binary;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update sslcrl resources.
	*/
	public static base_responses update(nitro_service client, sslcrl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcrl updateresources[] = new sslcrl[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslcrl();
				updateresources[i].crlname = resources[i].crlname;
				updateresources[i].refresh = resources[i].refresh;
				updateresources[i].cacert = resources[i].cacert;
				updateresources[i].server = resources[i].server;
				updateresources[i].method = resources[i].method;
				updateresources[i].url = resources[i].url;
				updateresources[i].port = resources[i].port;
				updateresources[i].basedn = resources[i].basedn;
				updateresources[i].scope = resources[i].scope;
				updateresources[i].interval = resources[i].interval;
				updateresources[i].day = resources[i].day;
				updateresources[i].time = resources[i].time;
				updateresources[i].binddn = resources[i].binddn;
				updateresources[i].password = resources[i].password;
				updateresources[i].binary = resources[i].binary;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslcrl resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslcrl resource, String[] args) throws Exception{
		sslcrl unsetresource = new sslcrl();
		unsetresource.crlname = resource.crlname;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of sslcrl resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String crlname[], String args[]) throws Exception {
		base_responses result = null;
		if (crlname != null && crlname.length > 0) {
			sslcrl unsetresources[] = new sslcrl[crlname.length];
			for (int i=0;i<crlname.length;i++){
				unsetresources[i] = new sslcrl();
				unsetresources[i].crlname = crlname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslcrl resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, sslcrl resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcrl unsetresources[] = new sslcrl[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new sslcrl();
				unsetresources[i].crlname = resources[i].crlname;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslcrl resources that are configured on netscaler.
	*/
	public static sslcrl[] get(nitro_service service) throws Exception{
		sslcrl obj = new sslcrl();
		sslcrl[] response = (sslcrl[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslcrl resources that are configured on netscaler.
	*/
	public static sslcrl[] get(nitro_service service, options option) throws Exception{
		sslcrl obj = new sslcrl();
		sslcrl[] response = (sslcrl[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslcrl resource of given name .
	*/
	public static sslcrl get(nitro_service service, String crlname) throws Exception{
		sslcrl obj = new sslcrl();
		obj.set_crlname(crlname);
		sslcrl response = (sslcrl) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslcrl resources of given names .
	*/
	public static sslcrl[] get(nitro_service service, String crlname[]) throws Exception{
		if (crlname !=null && crlname.length>0) {
			sslcrl response[] = new sslcrl[crlname.length];
			sslcrl obj[] = new sslcrl[crlname.length];
			for (int i=0;i<crlname.length;i++) {
				obj[i] = new sslcrl();
				obj[i].set_crlname(crlname[i]);
				response[i] = (sslcrl) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslcrl resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslcrl[] get_filtered(nitro_service service, String filter) throws Exception{
		sslcrl obj = new sslcrl();
		options option = new options();
		option.set_filter(filter);
		sslcrl[] response = (sslcrl[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcrl resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslcrl[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslcrl obj = new sslcrl();
		options option = new options();
		option.set_filter(filter);
		sslcrl[] response = (sslcrl[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslcrl resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslcrl obj = new sslcrl();
		options option = new options();
		option.set_count(true);
		sslcrl[] response = (sslcrl[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslcrl resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslcrl obj = new sslcrl();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcrl[] response = (sslcrl[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcrl resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslcrl obj = new sslcrl();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcrl[] response = (sslcrl[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class refreshEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class methodEnum {
		public static final String HTTP = "HTTP";
		public static final String LDAP = "LDAP";
	}
	public static class scopeEnum {
		public static final String Base = "Base";
		public static final String One = "One";
	}
	public static class binaryEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class intervalEnum {
		public static final String MONTHLY = "MONTHLY";
		public static final String WEEKLY = "WEEKLY";
		public static final String DAILY = "DAILY";
		public static final String NONE = "NONE";
	}
	public static class informEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
}
