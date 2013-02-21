package app;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;

public class appendpoint extends base_resource {
	
	private String certkeyname;
	private String name;
	private String servicetype;
	private String ipv46;
	private String ippattern;
	private String ipmask;
	private Long range;
	private Integer port;
	private String state;
	private String stateupdate;
	private String cacheable;
	private String redirecturl;
	private Long clttimeout;
	private String precedence;
	private String casesensitive;
	private String somethod;
	private String sopersistence;
	private Long sopersistencetimeout;
	private Long sothreshold;
	private String redirectportrewrite;
	private String downstateflush;
	private String backupvserver;
	private String disableprimaryondown;
	private String insertvserveripport;
	private String vipheader;
	private String rtspnat;
	private String authenticationhost;
	private String authentication;
	private String listenpolicy;
	private Long listenpriority;
	private String authn401;
	private String authnvsname;
	private String push;
	private String pushvserver;
	private String pushlabel;
	private String pushmulticlients;
	private String tcpprofilename;
	private String httpprofilename;
	private String comment;
	private Long mysqlprotocolversion;
	private String mysqlserverversion;
	private Long mysqlcharacterset;
	private Long mysqlservercapabilities;
	private String newname;

	//------- Read only Parameter ---------;

	private String ip;
	private String value;
	private String type;
	private String curstate;
	private Integer status;
	private String cachetype;
	private String redirect;
	private String homepage;
	private String dnsvservername;
	private String domain;
	private String servicename;
	private Long weight;
	private String cachevserver;
	private String targetvserver;
	private String url;
	private String gotopriorityexpression;
	private String bindpoint;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private String statechangetimesec;
	private Long statechangetimemsec;
	private Long tickssincelaststatechange;

	/**
	* <pre>
	* The content switching virtual server name.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The content switching virtual server name.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The service type of the virtual server.
	* </pre>
	*/
	public void set_servicetype(String servicetype) throws Exception{
		this.servicetype = servicetype;
	}

	/**
	* <pre>
	* The service type of the virtual server.
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* The IP address of the virtual server.
	* </pre>
	*/
	public void set_ipv46(String ipv46) throws Exception{
		this.ipv46 = ipv46;
	}

	/**
	* <pre>
	* The IP address of the virtual server.
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* The IP Pattern of the virtual server.
	* </pre>
	*/
	public void set_ippattern(String ippattern) throws Exception{
		this.ippattern = ippattern;
	}

	/**
	* <pre>
	* The IP Pattern of the virtual server.
	* </pre>
	*/
	public String get_ippattern() throws Exception {
		return this.ippattern;
	}

	/**
	* <pre>
	* The IP Mask of the virtual server IP Pattern
	* </pre>
	*/
	public void set_ipmask(String ipmask) throws Exception{
		this.ipmask = ipmask;
	}

	/**
	* <pre>
	* The IP Mask of the virtual server IP Pattern
	* </pre>
	*/
	public String get_ipmask() throws Exception {
		return this.ipmask;
	}

	/**
	* <pre>
	* An IP address range.
	* </pre>
	*/
	public void set_range(long range) throws Exception {
		this.range = new Long(range);
	}

	/**
	* <pre>
	* An IP address range.
	* </pre>
	*/
	public void set_range(Long range) throws Exception{
		this.range = range;
	}

	/**
	* <pre>
	* An IP address range.
	* </pre>
	*/
	public Long get_range() throws Exception {
		return this.range;
	}

	/**
	* <pre>
	* A port number for the virtual server.
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* A port number for the virtual server.
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* A port number for the virtual server.
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The initial state, enabled or disabled, of the virtual server.
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The initial state, enabled or disabled, of the virtual server.
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* To enable the state update for a CSW vserver
	* </pre>
	*/
	public void set_stateupdate(String stateupdate) throws Exception{
		this.stateupdate = stateupdate;
	}

	/**
	* <pre>
	* To enable the state update for a CSW vserver
	* </pre>
	*/
	public String get_stateupdate() throws Exception {
		return this.stateupdate;
	}

	/**
	* <pre>
	* Use this option to specify whether a virtual server, used for load balancing or content switching, routes requests to the cache redirection virtual server before sending it to the configured servers.
	* </pre>
	*/
	public void set_cacheable(String cacheable) throws Exception{
		this.cacheable = cacheable;
	}

	/**
	* <pre>
	* Use this option to specify whether a virtual server, used for load balancing or content switching, routes requests to the cache redirection virtual server before sending it to the configured servers.
	* </pre>
	*/
	public String get_cacheable() throws Exception {
		return this.cacheable;
	}

	/**
	* <pre>
	* The URL where traffic is redirected if the virtual server in the system becomes unavailable. You can enter up to 127 characters as the URL argument.WARNING!Make sure that the domain you specify in the URL does not match the domain specified in the -d domainName argument of the add cs policy CLI command. If the same domain is specified in both arguments, the request will be continuously redirected to the same unavailable virtual server in the system  -  then the user may not get the requested content.
	* </pre>
	*/
	public void set_redirecturl(String redirecturl) throws Exception{
		this.redirecturl = redirecturl;
	}

	/**
	* <pre>
	* The URL where traffic is redirected if the virtual server in the system becomes unavailable. You can enter up to 127 characters as the URL argument.WARNING!Make sure that the domain you specify in the URL does not match the domain specified in the -d domainName argument of the add cs policy CLI command. If the same domain is specified in both arguments, the request will be continuously redirected to the same unavailable virtual server in the system  -  then the user may not get the requested content.
	* </pre>
	*/
	public String get_redirecturl() throws Exception {
		return this.redirecturl;
	}

	/**
	* <pre>
	* The timeout value in seconds for idle client connection
	* </pre>
	*/
	public void set_clttimeout(long clttimeout) throws Exception {
		this.clttimeout = new Long(clttimeout);
	}

	/**
	* <pre>
	* The timeout value in seconds for idle client connection
	* </pre>
	*/
	public void set_clttimeout(Long clttimeout) throws Exception{
		this.clttimeout = clttimeout;
	}

	/**
	* <pre>
	* The timeout value in seconds for idle client connection
	* </pre>
	*/
	public Long get_clttimeout() throws Exception {
		return this.clttimeout;
	}

	/**
	* <pre>
	* This sets the precedence between RULE-based and URL-based policies on the content switching virtual server. The default precedence is RULE.
With the precedence set to RULE, incoming requests are evaluated against the content switching policies created with the -rule argument (using the add cs policy CLI command).
If none of the rules match, the URL in the request is evaluated against the content switching policies created with the -url argument (using the add cs policy CLI command).
	* </pre>
	*/
	public void set_precedence(String precedence) throws Exception{
		this.precedence = precedence;
	}

	/**
	* <pre>
	* This sets the precedence between RULE-based and URL-based policies on the content switching virtual server. The default precedence is RULE.
With the precedence set to RULE, incoming requests are evaluated against the content switching policies created with the -rule argument (using the add cs policy CLI command).
If none of the rules match, the URL in the request is evaluated against the content switching policies created with the -url argument (using the add cs policy CLI command).
	* </pre>
	*/
	public String get_precedence() throws Exception {
		return this.precedence;
	}

	/**
	* <pre>
	* The URL lookup case option on the content switching vserver.
If the case sensitivity of a content switching virtual server is set to 'ON', the URLs /a/1.html and /A/1.HTML are treated differently, and can be switched to different targets with appropriate content switching policies.
If the case sensitivity is set to 'OFF', the URLs /a/1.html and /A/1.HTML are treated the same, and are switched to the same target.
	* </pre>
	*/
	public void set_casesensitive(String casesensitive) throws Exception{
		this.casesensitive = casesensitive;
	}

	/**
	* <pre>
	* The URL lookup case option on the content switching vserver.
If the case sensitivity of a content switching virtual server is set to 'ON', the URLs /a/1.html and /A/1.HTML are treated differently, and can be switched to different targets with appropriate content switching policies.
If the case sensitivity is set to 'OFF', the URLs /a/1.html and /A/1.HTML are treated the same, and are switched to the same target.
	* </pre>
	*/
	public String get_casesensitive() throws Exception {
		return this.casesensitive;
	}

	/**
	* <pre>
	* The spillover factor based on which the traffic will be given to the backupvserver once the main virtual server reaches the spillover threshold.
	* </pre>
	*/
	public void set_somethod(String somethod) throws Exception{
		this.somethod = somethod;
	}

	/**
	* <pre>
	* The spillover factor based on which the traffic will be given to the backupvserver once the main virtual server reaches the spillover threshold.
	* </pre>
	*/
	public String get_somethod() throws Exception {
		return this.somethod;
	}

	/**
	* <pre>
	* The state of the spillover persistence.
	* </pre>
	*/
	public void set_sopersistence(String sopersistence) throws Exception{
		this.sopersistence = sopersistence;
	}

	/**
	* <pre>
	* The state of the spillover persistence.
	* </pre>
	*/
	public String get_sopersistence() throws Exception {
		return this.sopersistence;
	}

	public void set_sopersistencetimeout(long sopersistencetimeout) throws Exception {
		this.sopersistencetimeout = new Long(sopersistencetimeout);
	}

	public void set_sopersistencetimeout(Long sopersistencetimeout) throws Exception{
		this.sopersistencetimeout = sopersistencetimeout;
	}

	public Long get_sopersistencetimeout() throws Exception {
		return this.sopersistencetimeout;
	}

	/**
	* <pre>
	* If the spillover method is set to CONNECTION or DYNAMICCONNECTION, this value is treated as the maximum number of connections a lb vserver will handle before spillover takes place. If the spillover method is set to BANDWIDTH, this value is treated as the amount of incoming and outgoing traffic (in Kbps) a vserver will handle before spillover takes place.
	* </pre>
	*/
	public void set_sothreshold(long sothreshold) throws Exception {
		this.sothreshold = new Long(sothreshold);
	}

	/**
	* <pre>
	* If the spillover method is set to CONNECTION or DYNAMICCONNECTION, this value is treated as the maximum number of connections a lb vserver will handle before spillover takes place. If the spillover method is set to BANDWIDTH, this value is treated as the amount of incoming and outgoing traffic (in Kbps) a vserver will handle before spillover takes place.
	* </pre>
	*/
	public void set_sothreshold(Long sothreshold) throws Exception{
		this.sothreshold = sothreshold;
	}

	/**
	* <pre>
	* If the spillover method is set to CONNECTION or DYNAMICCONNECTION, this value is treated as the maximum number of connections a lb vserver will handle before spillover takes place. If the spillover method is set to BANDWIDTH, this value is treated as the amount of incoming and outgoing traffic (in Kbps) a vserver will handle before spillover takes place.
	* </pre>
	*/
	public Long get_sothreshold() throws Exception {
		return this.sothreshold;
	}

	/**
	* <pre>
	* Enable port rewrite while performing HTTP redirect.
	* </pre>
	*/
	public void set_redirectportrewrite(String redirectportrewrite) throws Exception{
		this.redirectportrewrite = redirectportrewrite;
	}

	/**
	* <pre>
	* Enable port rewrite while performing HTTP redirect.
	* </pre>
	*/
	public String get_redirectportrewrite() throws Exception {
		return this.redirectportrewrite;
	}

	/**
	* <pre>
	* Perform delayed cleanup of connections on this vserver.
	* </pre>
	*/
	public void set_downstateflush(String downstateflush) throws Exception{
		this.downstateflush = downstateflush;
	}

	/**
	* <pre>
	* Perform delayed cleanup of connections on this vserver.
	* </pre>
	*/
	public String get_downstateflush() throws Exception {
		return this.downstateflush;
	}

	/**
	* <pre>
	* The backup virtual server for content switching.
	* </pre>
	*/
	public void set_backupvserver(String backupvserver) throws Exception{
		this.backupvserver = backupvserver;
	}

	/**
	* <pre>
	* The backup virtual server for content switching.
	* </pre>
	*/
	public String get_backupvserver() throws Exception {
		return this.backupvserver;
	}

	/**
	* <pre>
	* When this argument is enabled, traffic will continue reaching backup vservers even after primary comes UP from DOWN state.
	* </pre>
	*/
	public void set_disableprimaryondown(String disableprimaryondown) throws Exception{
		this.disableprimaryondown = disableprimaryondown;
	}

	/**
	* <pre>
	* When this argument is enabled, traffic will continue reaching backup vservers even after primary comes UP from DOWN state.
	* </pre>
	*/
	public String get_disableprimaryondown() throws Exception {
		return this.disableprimaryondown;
	}

	/**
	* <pre>
	* The virtual IP and port header insertion option for the vserver.
	VIPADDR		- Header contains the vserver's IP address and port number without any translation.
	OFF		- The virtual IP and port header insertion option is disabled.
	V6TOV4MAPPING 	- Header contains the mapped IPv4 address corresponding to the IPv6 address of the vserver and the port number. An IPv6 address can be mapped to a user-specified IPv4 address using the set ns ip6 command.
	* </pre>
	*/
	public void set_insertvserveripport(String insertvserveripport) throws Exception{
		this.insertvserveripport = insertvserveripport;
	}

	/**
	* <pre>
	* The virtual IP and port header insertion option for the vserver.
	VIPADDR		- Header contains the vserver's IP address and port number without any translation.
	OFF		- The virtual IP and port header insertion option is disabled.
	V6TOV4MAPPING 	- Header contains the mapped IPv4 address corresponding to the IPv6 address of the vserver and the port number. An IPv6 address can be mapped to a user-specified IPv4 address using the set ns ip6 command.
	* </pre>
	*/
	public String get_insertvserveripport() throws Exception {
		return this.insertvserveripport;
	}

	/**
	* <pre>
	* The name of virtual IP and port header.
	* </pre>
	*/
	public void set_vipheader(String vipheader) throws Exception{
		this.vipheader = vipheader;
	}

	/**
	* <pre>
	* The name of virtual IP and port header.
	* </pre>
	*/
	public String get_vipheader() throws Exception {
		return this.vipheader;
	}

	/**
	* <pre>
	* Use this parameter to enable natting for RTSP data connection.
	* </pre>
	*/
	public void set_rtspnat(String rtspnat) throws Exception{
		this.rtspnat = rtspnat;
	}

	/**
	* <pre>
	* Use this parameter to enable natting for RTSP data connection.
	* </pre>
	*/
	public String get_rtspnat() throws Exception {
		return this.rtspnat;
	}

	/**
	* <pre>
	* FQDN of authentication vserver
	* </pre>
	*/
	public void set_authenticationhost(String authenticationhost) throws Exception{
		this.authenticationhost = authenticationhost;
	}

	/**
	* <pre>
	* FQDN of authentication vserver
	* </pre>
	*/
	public String get_authenticationhost() throws Exception {
		return this.authenticationhost;
	}

	/**
	* <pre>
	* This option toggles on or off the application of authentication of incoming users to the vserver.
	* </pre>
	*/
	public void set_authentication(String authentication) throws Exception{
		this.authentication = authentication;
	}

	/**
	* <pre>
	* This option toggles on or off the application of authentication of incoming users to the vserver.
	* </pre>
	*/
	public String get_authentication() throws Exception {
		return this.authentication;
	}

	/**
	* <pre>
	* Use this parameter to specify the listen policy for CS Vserver.
The string can be either an existing expression name (configured using add policy expression command) or else it can be an in-line expression with a maximum of 1500 characters.
	* </pre>
	*/
	public void set_listenpolicy(String listenpolicy) throws Exception{
		this.listenpolicy = listenpolicy;
	}

	/**
	* <pre>
	* Use this parameter to specify the listen policy for CS Vserver.
The string can be either an existing expression name (configured using add policy expression command) or else it can be an in-line expression with a maximum of 1500 characters.
	* </pre>
	*/
	public String get_listenpolicy() throws Exception {
		return this.listenpolicy;
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of CS Vserver.
	* </pre>
	*/
	public void set_listenpriority(long listenpriority) throws Exception {
		this.listenpriority = new Long(listenpriority);
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of CS Vserver.
	* </pre>
	*/
	public void set_listenpriority(Long listenpriority) throws Exception{
		this.listenpriority = listenpriority;
	}

	/**
	* <pre>
	* Use this parameter to specify the priority for listen policy of CS Vserver.
	* </pre>
	*/
	public Long get_listenpriority() throws Exception {
		return this.listenpriority;
	}

	/**
	* <pre>
	* This option toggles on or off the HTTP 401 response based authentication.
	* </pre>
	*/
	public void set_authn401(String authn401) throws Exception{
		this.authn401 = authn401;
	}

	/**
	* <pre>
	* This option toggles on or off the HTTP 401 response based authentication.
	* </pre>
	*/
	public String get_authn401() throws Exception {
		return this.authn401;
	}

	/**
	* <pre>
	* Name of authentication vserver
	* </pre>
	*/
	public void set_authnvsname(String authnvsname) throws Exception{
		this.authnvsname = authnvsname;
	}

	/**
	* <pre>
	* Name of authentication vserver
	* </pre>
	*/
	public String get_authnvsname() throws Exception {
		return this.authnvsname;
	}

	/**
	* <pre>
	* Process traffic on bound Push vserver.
	* </pre>
	*/
	public void set_push(String push) throws Exception{
		this.push = push;
	}

	/**
	* <pre>
	* Process traffic on bound Push vserver.
	* </pre>
	*/
	public String get_push() throws Exception {
		return this.push;
	}

	/**
	* <pre>
	* The lb vserver of type PUSH/SSL_PUSH to which server pushes the updates received on the client facing non-push lb vserver.
	* </pre>
	*/
	public void set_pushvserver(String pushvserver) throws Exception{
		this.pushvserver = pushvserver;
	}

	/**
	* <pre>
	* The lb vserver of type PUSH/SSL_PUSH to which server pushes the updates received on the client facing non-push lb vserver.
	* </pre>
	*/
	public String get_pushvserver() throws Exception {
		return this.pushvserver;
	}

	/**
	* <pre>
	* Use this parameter to specify the expression to extract the label in response from server.
The string can be either a named expression (configured using add policy expression command) or else it can be an in-line expression with a maximum of 63 characters.
	* </pre>
	*/
	public void set_pushlabel(String pushlabel) throws Exception{
		this.pushlabel = pushlabel;
	}

	/**
	* <pre>
	* Use this parameter to specify the expression to extract the label in response from server.
The string can be either a named expression (configured using add policy expression command) or else it can be an in-line expression with a maximum of 63 characters.
	* </pre>
	*/
	public String get_pushlabel() throws Exception {
		return this.pushlabel;
	}

	/**
	* <pre>
	* Specify if multiple web 2.0 connections from the same client can connect to this vserver and expect updates.
	* </pre>
	*/
	public void set_pushmulticlients(String pushmulticlients) throws Exception{
		this.pushmulticlients = pushmulticlients;
	}

	/**
	* <pre>
	* Specify if multiple web 2.0 connections from the same client can connect to this vserver and expect updates.
	* </pre>
	*/
	public String get_pushmulticlients() throws Exception {
		return this.pushmulticlients;
	}

	/**
	* <pre>
	* The name of the TCP profile.
	* </pre>
	*/
	public void set_tcpprofilename(String tcpprofilename) throws Exception{
		this.tcpprofilename = tcpprofilename;
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
	public void set_httpprofilename(String httpprofilename) throws Exception{
		this.httpprofilename = httpprofilename;
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
	* Comments associated with this virtual server.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this virtual server.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The protocol version returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlprotocolversion(long mysqlprotocolversion) throws Exception {
		this.mysqlprotocolversion = new Long(mysqlprotocolversion);
	}

	/**
	* <pre>
	* The protocol version returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlprotocolversion(Long mysqlprotocolversion) throws Exception{
		this.mysqlprotocolversion = mysqlprotocolversion;
	}

	/**
	* <pre>
	* The protocol version returned by the mysql vserver.
	* </pre>
	*/
	public Long get_mysqlprotocolversion() throws Exception {
		return this.mysqlprotocolversion;
	}

	/**
	* <pre>
	* The server version string returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlserverversion(String mysqlserverversion) throws Exception{
		this.mysqlserverversion = mysqlserverversion;
	}

	/**
	* <pre>
	* The server version string returned by the mysql vserver.
	* </pre>
	*/
	public String get_mysqlserverversion() throws Exception {
		return this.mysqlserverversion;
	}

	/**
	* <pre>
	* The character set returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlcharacterset(long mysqlcharacterset) throws Exception {
		this.mysqlcharacterset = new Long(mysqlcharacterset);
	}

	/**
	* <pre>
	* The character set returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlcharacterset(Long mysqlcharacterset) throws Exception{
		this.mysqlcharacterset = mysqlcharacterset;
	}

	/**
	* <pre>
	* The character set returned by the mysql vserver.
	* </pre>
	*/
	public Long get_mysqlcharacterset() throws Exception {
		return this.mysqlcharacterset;
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlservercapabilities(long mysqlservercapabilities) throws Exception {
		this.mysqlservercapabilities = new Long(mysqlservercapabilities);
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.
	* </pre>
	*/
	public void set_mysqlservercapabilities(Long mysqlservercapabilities) throws Exception{
		this.mysqlservercapabilities = mysqlservercapabilities;
	}

	/**
	* <pre>
	* The server capabilities returned by the mysql vserver.
	* </pre>
	*/
	public Long get_mysqlservercapabilities() throws Exception {
		return this.mysqlservercapabilities;
	}

	/**
	* <pre>
	* The new name of the virtual server.
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the virtual server.
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The IP address of the virtual server.
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* The ssl card status for the transparent ssl cs vserver.
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* Virtual server type.
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The state of the cs vserver.
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Status.
	* </pre>
	*/
	public Integer get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* Cache type.
	* </pre>
	*/
	public String get_cachetype() throws Exception {
		return this.cachetype;
	}

	/**
	* <pre>
	* Redirect URL string.
	* </pre>
	*/
	public String get_redirect() throws Exception {
		return this.redirect;
	}

	/**
	* <pre>
	* Home page.
	* </pre>
	*/
	public String get_homepage() throws Exception {
		return this.homepage;
	}

	/**
	* <pre>
	* DNS vserver name.
	* </pre>
	*/
	public String get_dnsvservername() throws Exception {
		return this.dnsvservername;
	}

	/**
	* <pre>
	* Domain.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* Service name.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* Weight for this service.
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* Cache vserver name.
	* </pre>
	*/
	public String get_cachevserver() throws Exception {
		return this.cachevserver;
	}

	/**
	* <pre>
	* target vserver name.
	* </pre>
	*/
	public String get_targetvserver() throws Exception {
		return this.targetvserver;
	}

	/**
	* <pre>
	* URL string.
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* The bindpoint to which the policy is bound
	* </pre>
	*/
	public String get_bindpoint() throws Exception {
		return this.bindpoint;
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* The invocation type.
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the label invoked.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Time when last state change happened. Seconds part.
	* </pre>
	*/
	public String get_statechangetimesec() throws Exception {
		return this.statechangetimesec;
	}

	/**
	* <pre>
	* Time at which last state change happened. Milliseconds part.
	* </pre>
	*/
	public Long get_statechangetimemsec() throws Exception {
		return this.statechangetimemsec;
	}

	/**
	* <pre>
	* Time in 10 millisecond ticks since the last state change.
	* </pre>
	*/
	public Long get_tickssincelaststatechange() throws Exception {
		return this.tickssincelaststatechange;
	}

	
	protected base_resource[] get_nitro_response(nitro_service service, String response) {
		apptemplateinfo_response result = (apptemplateinfo_response) service.get_payload_formatter().string_to_resource(apptemplateinfo_response.class, response);
		return result.apptemplate;
	}
	
	protected String get_object_name() {
		return this.ipv46;
	}

	public void set_certkeyname(String certkeyname) throws Exception{
		this.certkeyname = certkeyname;
	}
	
	public String get_certkeyname() throws Exception {
		return this.certkeyname;
	}
}