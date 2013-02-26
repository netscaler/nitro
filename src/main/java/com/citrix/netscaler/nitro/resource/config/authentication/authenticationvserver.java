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

class authenticationvserver_response extends base_response
{
	public authenticationvserver[] authenticationvserver;
}
/**
* Configuration for authentication virtual server resource.
*/

public class authenticationvserver extends base_resource
{
	private String name;
	private String servicetype;
	private String ipv46;
	private Long range;
	private Integer port;
	private String state;
	private String authentication;
	private String authenticationdomain;
	private String comment;
	private String appflowlog;
	private String newname;

	//------- Read only Parameter ---------;

	private String ip;
	private String value;
	private String type;
	private String curstate;
	private Integer status;
	private String cachetype;
	private String redirect;
	private String precedence;
	private String redirecturl;
	private Long curaaausers;
	private String rule;
	private String policyname;
	private String policy;
	private String servicename;
	private Long weight;
	private String cachevserver;
	private String backupvserver;
	private Long clttimeout;
	private String somethod;
	private Long sothreshold;
	private String sopersistence;
	private Long sopersistencetimeout;
	private Long priority;
	private String downstateflush;
	private String disableprimaryondown;
	private String listenpolicy;
	private Long listenpriority;
	private String tcpprofilename;
	private String httpprofilename;
	private Long __count;

	/**
	* <pre>
	* The name for the new authentication vserver.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new authentication vserver.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The authentication vserver's protocol type, e.g. SSL.<br> Default value: SSL<br> Possible values = SSL
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* The authentication vserver's protocol type, e.g. SSL.<br> Default value: SSL<br> Possible values = SSL
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* The IP address for the authentication vserver.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipv46(String ipv46) throws Exception{
		this.ipv46 = ipv46;
	}

	/**
	* <pre>
	* The IP address for the authentication vserver.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* Range of authentication vserver IP addresses. The new range of authentication vservers will have IP addresses consecutively numbered, starting with the primary address specified with the <ipaddress> argument.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_range(long range) throws Exception {
		this.range = new Long(range);
	}

	/**
	* <pre>
	* Range of authentication vserver IP addresses. The new range of authentication vservers will have IP addresses consecutively numbered, starting with the primary address specified with the <ipaddress> argument.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public void set_range(Long range) throws Exception{
		this.range = range;
	}

	/**
	* <pre>
	* Range of authentication vserver IP addresses. The new range of authentication vservers will have IP addresses consecutively numbered, starting with the primary address specified with the <ipaddress> argument.<br> Default value: 1<br> Minimum value =  1
	* </pre>
	*/
	public Long get_range() throws Exception {
		return this.range;
	}

	/**
	* <pre>
	* The TCP port on which the vserver listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* The TCP port on which the vserver listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* The TCP port on which the vserver listens.<br> Minimum value =  1<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The intital vserver server state, e.g. ENABLED or DISABLED.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The intital vserver server state, e.g. ENABLED or DISABLED.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Indicates whether or not authentication is being applied to incoming users to the vserver.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* Indicates whether or not authentication is being applied to incoming users to the vserver.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* Domain of authentication vserver FQDN.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public void set_authenticationdomain(String authenticationdomain) throws Exception{
		this.authenticationdomain = authenticationdomain;
	}

	/**
	* <pre>
	* Domain of authentication vserver FQDN.<br> Minimum length =  3<br> Maximum length =  252
	* </pre>
	*/
	public String get_authenticationdomain() throws Exception {
		return this.authenticationdomain;
	}

	/**
	* <pre>
	* Comments associated with this vserver.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this vserver.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Enable logging appflow flow information.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowlog(String appflowlog) throws Exception{
		this.appflowlog = appflowlog;
	}

	/**
	* <pre>
	* Enable logging appflow flow information.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowlog() throws Exception {
		return this.appflowlog;
	}

	/**
	* <pre>
	* The new name of the authentication virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the authentication virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The Virtual IP address of the authentication vserver.
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* Indicates whether or not the certificate is bound or if SSL offload is disabled.<br> Possible values = Certkey not bound, SSL feature disabled
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* The type of Virtual Server, e.g. CONTENT based or ADDRESS based.<br> Possible values = CONTENT, ADDRESS
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The current state of the Virtual server, e.g. UP, DOWN, BUSY, etc.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Whether or not this vserver responds to ARPs and whether or not round-robin selection is temporarily in effect.
	* </pre>
	*/
	public Integer get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* Virtual server's cache type. The options are: TRANSPARENT, REVERSE and FORWARD.<br> Possible values = TRANSPARENT, REVERSE, FORWARD
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* The cache redirect policy.
The valid redirect policies are:
l.	CACHE - Directs all requests to the cache.
2.	POLICY - Applies cache redirection policy to determine whether the request should be directed to the cache or origin. This is the default setting.
3.	ORIGIN - Directs all requests to the origin server.<br> Possible values = CACHE, POLICY, ORIGIN
	* </pre>
	*/
	public String get_redirect() throws Exception {
		return this.redirect;
	}

	/**
	* <pre>
	* This argument is used only when configuring content switching on the specified virtual server. This is applicable only
if both the URL and RULE-based policies have been configured on the same virtual server.
It specifies the type of policy (URL or RULE) that takes precedence on the content switching virtual server. The default setting is RULE.
l	URL - In this case, the incoming request is matched against the URL-based policies before the rule-based policies.
l	RULE - In this case, the incoming request is matched against the rule-based policies before the URL-based policies.
For all URL-based policies, the precedence hierarchy is:
1.	Domain and exact URL
2.	Domain, prefix and suffix
3.	Domain and suffix
4.	Domain and prefix
5.	Domain only
6.	Exact URL
7.	Prefix and suffix
8.	Suffix only
9.	Prefix only
10.	Default.<br> Possible values = RULE, URL
	* </pre>
	*/
	public String get_precedence() throws Exception {
		return this.precedence;
	}

	/**
	* <pre>
	* The URL where traffic is redirected if the virtual server in system becomes unavailable. WARNING!	Make sure that the domain you specify in the URL does not match the domain specified in the -d domainName argument of the ###add cs policy### command. If the same domain is specified in both arguments, the request will be continuously redirected to the same unavailable virtual server in the system. If so, the user may not get the requested content.
	* </pre>
	*/
	public String get_redirecturl() throws Exception {
		return this.redirecturl;
	}

	/**
	* <pre>
	* The number of current users logged in to this vserver.
	* </pre>
	*/
	public Long get_curaaausers() throws Exception {
		return this.curaaausers;
	}

	/**
	* <pre>
	* The name of the rule, or expression, if any, that policy for the authentication server is to use. Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide. The default rule is ns_true.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the authentication vserver.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the authentication vserver.
	* </pre>
	*/
	public String get_policy() throws Exception {
		return this.policy;
	}

	/**
	* <pre>
	* The name of the service, if any, to which the vserver policy is bound.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* Weight for this service, if any. This weight is used when the system performs load balancing, giving greater priority to a specific service. It is useful when the services bound to a virtual server are of different capacity.
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The name of the default target cache virtual server, if any, to which requests are redirected.
	* </pre>
	*/
	public String get_cachevserver() throws Exception {
		return this.cachevserver;
	}

	/**
	* <pre>
	* The name of the backup vpn virtual server for this vpn virtual server.
	* </pre>
	*/
	public String get_backupvserver() throws Exception {
		return this.backupvserver;
	}

	/**
	* <pre>
	* The idle time, if any, in seconds after which the client connection is terminated.
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* VPN client applications are allocated from a block of Intranet IP addresses.
That block may be exhausted after a certain number of connections. This switch specifies the
method used to determine whether or not a new connection will spillover, or exhaust, the allocated block of
Intranet IP addresses for that application. Possible values are CONNECTION or DYNAMICCONNECTION.
CONNECTION means that a static integer value is the hard limit for the spillover threshold. The spillover
threshold is described below. DYNAMICCONNECTION means that the spillover threshold is set according to
the maximum number of connections defined for the vpn vserver.<br> Possible values = CONNECTION, DYNAMICCONNECTION, BANDWIDTH, HEALTH, NONE
	* </pre>
	*/
	public String get_somethod() throws Exception {
		return this.somethod;
	}

	/**
	* <pre>
	* VPN client applications are allocated from a block of Intranet IP addresses.
That block may be exhausted after a certain number of connections.
The value of this option is number of client connections after which the Mapped IP address is used
as the client source IP address instead of an address from the allocated block of Intranet IP addresses.
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
	}

	/**
	* <pre>
	* Whether or not cookie-based site persistance is enabled for this VPN vserver. Possible values are 'ConnectionProxy', HTTPRedirect, or NONE.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sopersistence() throws Exception {
		return this.sopersistence;
	}

	/**
	* <pre>
	* The timeout, if any, for cookie-based site persistance of this VPN vserver.
	* </pre>
	*/
	public Long get_sopersistencetimeout() throws Exception {
		return this.sopersistencetimeout;
	}

	/**
	* <pre>
	* The priority, if any, of the vpn vserver policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Perform delayed clean up of connections on this vserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* Tells whether traffic will continue reaching backup vservers even after primary comes UP from DOWN state.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_disableprimaryondown() throws Exception {
		return this.disableprimaryondown;
	}

	/**
	* <pre>
	* Listenpolicy configured for authentication vserver.
	* </pre>
	*/
	public String get_listenpolicy() throws Exception {
		return this.listenpolicy;
	}

	/**
	* <pre>
	* Priority of listen policy for authentication vserver.
	* </pre>
	*/
	public Long get_listenpriority() throws Exception {
		return this.listenpriority;
	}

	/**
	* <pre>
	* The name of the TCP profile.
	* </pre>
	*/
	public String get_tcpprofilename() throws Exception {
		return this.tcpprofilename;
	}

	/**
	* <pre>
	* Name of the HTTP profile.
	* </pre>
	*/
	public String get_httpprofilename() throws Exception {
		return this.httpprofilename;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationvserver_response result = (authenticationvserver_response) service.get_payload_formatter().string_to_resource(authenticationvserver_response.class, response);
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
		return result.authenticationvserver;
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
	* Use this API to add authenticationvserver.
	*/
	public static base_response add(nitro_service client, authenticationvserver resource) throws Exception {
		authenticationvserver addresource = new authenticationvserver();
		addresource.name = resource.name;
		addresource.servicetype = resource.servicetype;
		addresource.ipv46 = resource.ipv46;
		addresource.range = resource.range;
		addresource.port = resource.port;
		addresource.state = resource.state;
		addresource.authentication = resource.authentication;
		addresource.authenticationdomain = resource.authenticationdomain;
		addresource.comment = resource.comment;
		addresource.appflowlog = resource.appflowlog;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationvserver resources.
	*/
	public static base_responses add(nitro_service client, authenticationvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver addresources[] = new authenticationvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationvserver();
				addresources[i].name = resources[i].name;
				addresources[i].servicetype = resources[i].servicetype;
				addresources[i].ipv46 = resources[i].ipv46;
				addresources[i].range = resources[i].range;
				addresources[i].port = resources[i].port;
				addresources[i].state = resources[i].state;
				addresources[i].authentication = resources[i].authentication;
				addresources[i].authenticationdomain = resources[i].authenticationdomain;
				addresources[i].comment = resources[i].comment;
				addresources[i].appflowlog = resources[i].appflowlog;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationvserver of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationvserver deleteresource = new authenticationvserver();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationvserver.
	*/
	public static base_response delete(nitro_service client, authenticationvserver resource) throws Exception {
		authenticationvserver deleteresource = new authenticationvserver();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationvserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationvserver deleteresources[] = new authenticationvserver[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationvserver();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationvserver resources.
	*/
	public static base_responses delete(nitro_service client, authenticationvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver deleteresources[] = new authenticationvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationvserver();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationvserver.
	*/
	public static base_response update(nitro_service client, authenticationvserver resource) throws Exception {
		authenticationvserver updateresource = new authenticationvserver();
		updateresource.name = resource.name;
		updateresource.ipv46 = resource.ipv46;
		updateresource.authentication = resource.authentication;
		updateresource.authenticationdomain = resource.authenticationdomain;
		updateresource.comment = resource.comment;
		updateresource.appflowlog = resource.appflowlog;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationvserver resources.
	*/
	public static base_responses update(nitro_service client, authenticationvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver updateresources[] = new authenticationvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationvserver();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipv46 = resources[i].ipv46;
				updateresources[i].authentication = resources[i].authentication;
				updateresources[i].authenticationdomain = resources[i].authenticationdomain;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].appflowlog = resources[i].appflowlog;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationvserver unsetresource = new authenticationvserver();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationvserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationvserver resource, String[] args) throws Exception{
		authenticationvserver unsetresource = new authenticationvserver();
		unsetresource.name = resource.name;
		unsetresource.authenticationdomain = resource.authenticationdomain;
		unsetresource.authentication = resource.authentication;
		unsetresource.comment = resource.comment;
		unsetresource.appflowlog = resource.appflowlog;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationvserver unsetresources[] = new authenticationvserver[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationvserver();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationvserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationvserver resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver unsetresources[] = new authenticationvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationvserver();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].authenticationdomain = resources[i].authenticationdomain;
				unsetresources[i].authentication = resources[i].authentication;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].appflowlog = resources[i].appflowlog;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable authenticationvserver of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		authenticationvserver enableresource = new authenticationvserver();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable authenticationvserver.
	*/
	public static base_response enable(nitro_service client, authenticationvserver resource) throws Exception {
		authenticationvserver enableresource = new authenticationvserver();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable authenticationvserver resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationvserver enableresources[] = new authenticationvserver[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new authenticationvserver();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable authenticationvserver resources.
	*/
	public static base_responses enable(nitro_service client, authenticationvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver enableresources[] = new authenticationvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new authenticationvserver();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable authenticationvserver of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		authenticationvserver disableresource = new authenticationvserver();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable authenticationvserver.
	*/
	public static base_response disable(nitro_service client, authenticationvserver resource) throws Exception {
		authenticationvserver disableresource = new authenticationvserver();
		disableresource.name = resource.name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable authenticationvserver resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationvserver disableresources[] = new authenticationvserver[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new authenticationvserver();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable authenticationvserver resources.
	*/
	public static base_responses disable(nitro_service client, authenticationvserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationvserver disableresources[] = new authenticationvserver[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new authenticationvserver();
				disableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a authenticationvserver resource.
	*/
	public static base_response rename(nitro_service client, authenticationvserver resource, String new_name) throws Exception {
		authenticationvserver renameresource = new authenticationvserver();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a authenticationvserver resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		authenticationvserver renameresource = new authenticationvserver();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the authenticationvserver resources that are configured on netscaler.
	*/
	public static authenticationvserver[] get(nitro_service service) throws Exception{
		authenticationvserver obj = new authenticationvserver();
		authenticationvserver[] response = (authenticationvserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationvserver resources that are configured on netscaler.
	*/
	public static authenticationvserver[] get(nitro_service service, options option) throws Exception{
		authenticationvserver obj = new authenticationvserver();
		authenticationvserver[] response = (authenticationvserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationvserver resource of given name .
	*/
	public static authenticationvserver get(nitro_service service, String name) throws Exception{
		authenticationvserver obj = new authenticationvserver();
		obj.set_name(name);
		authenticationvserver response = (authenticationvserver) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationvserver resources of given names .
	*/
	public static authenticationvserver[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationvserver response[] = new authenticationvserver[name.length];
			authenticationvserver obj[] = new authenticationvserver[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationvserver();
				obj[i].set_name(name[i]);
				response[i] = (authenticationvserver) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationvserver[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationvserver obj = new authenticationvserver();
		options option = new options();
		option.set_filter(filter);
		authenticationvserver[] response = (authenticationvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationvserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationvserver obj = new authenticationvserver();
		options option = new options();
		option.set_filter(filter);
		authenticationvserver[] response = (authenticationvserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationvserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationvserver obj = new authenticationvserver();
		options option = new options();
		option.set_count(true);
		authenticationvserver[] response = (authenticationvserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationvserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationvserver obj = new authenticationvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationvserver[] response = (authenticationvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationvserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationvserver obj = new authenticationvserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationvserver[] response = (authenticationvserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class somethodEnum {
		public static final String CONNECTION = "CONNECTION";
		public static final String DYNAMICCONNECTION = "DYNAMICCONNECTION";
		public static final String BANDWIDTH = "BANDWIDTH";
		public static final String HEALTH = "HEALTH";
		public static final String NONE = "NONE";
	}
	public static class sopersistenceEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class authenticationEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cachetypeEnum {
		public static final String TRANSPARENT = "TRANSPARENT";
		public static final String REVERSE = "REVERSE";
		public static final String FORWARD = "FORWARD";
	}
	public static class redirectEnum {
		public static final String CACHE = "CACHE";
		public static final String POLICY = "POLICY";
		public static final String ORIGIN = "ORIGIN";
	}
	public static class downstateflushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class servicetypeEnum {
		public static final String SSL = "SSL";
	}
	public static class valueEnum {
		public static final String Certkey_not_bound = "Certkey not bound";
		public static final String SSL_feature_disabled = "SSL feature disabled";
	}
	public static class appflowlogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class precedenceEnum {
		public static final String RULE = "RULE";
		public static final String URL = "URL";
	}
	public static class curstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
	}
	public static class disableprimaryondownEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String CONTENT = "CONTENT";
		public static final String ADDRESS = "ADDRESS";
	}
}
