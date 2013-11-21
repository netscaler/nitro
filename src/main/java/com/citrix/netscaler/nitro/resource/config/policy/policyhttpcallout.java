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

package com.citrix.netscaler.nitro.resource.config.policy;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class policyhttpcallout_response extends base_response
{
	public policyhttpcallout[] policyhttpcallout;
}
/**
* Configuration for HTTP callout resource.
*/

public class policyhttpcallout extends base_resource
{
	private String name;
	private String ipaddress;
	private Integer port;
	private String vserver;
	private String returntype;
	private String httpmethod;
	private String hostexpr;
	private String urlstemexpr;
	private String[] headers;
	private String[] parameters;
	private String bodyexpr;
	private String fullreqexpr;
	private String scheme;
	private String resultexpr;
	private Long cacheforsecs;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private String svrstate;
	private String undefreason;
	private Long recursivecallout;
	private Long __count;

	/**
	* <pre>
	* Name for the HTTP callout. Not case sensitive. Must begin with an ASCII letter or underscore (_) character, and must consist only of ASCII alphanumeric or underscore characters. Must not begin with 're' or 'xp' or be a word reserved for use as a default syntax expression qualifier prefix (such as HTTP) or enumeration value (such as ASCII). Must not be the name of an existing named expression, pattern set, dataset, stringmap, or HTTP callout.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the HTTP callout. Not case sensitive. Must begin with an ASCII letter or underscore (_) character, and must consist only of ASCII alphanumeric or underscore characters. Must not begin with 're' or 'xp' or be a word reserved for use as a default syntax expression qualifier prefix (such as HTTP) or enumeration value (such as ASCII). Must not be the name of an existing named expression, pattern set, dataset, stringmap, or HTTP callout.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* IP Address of the server (callout agent) to which the callout is sent. Can be an IPv4 or IPv6 address.
Mutually exclusive with the Virtual Server parameter. Therefore, you cannot set the <IP Address, Port> and the Virtual Server in the same HTTP callout.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* IP Address of the server (callout agent) to which the callout is sent. Can be an IPv4 or IPv6 address.
Mutually exclusive with the Virtual Server parameter. Therefore, you cannot set the <IP Address, Port> and the Virtual Server in the same HTTP callout.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Server port to which the HTTP callout agent is mapped. Mutually exclusive with the Virtual Server parameter. Therefore, you cannot set the <IP Address, Port> and the Virtual Server in the same HTTP callout.
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* Server port to which the HTTP callout agent is mapped. Mutually exclusive with the Virtual Server parameter. Therefore, you cannot set the <IP Address, Port> and the Virtual Server in the same HTTP callout.
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Server port to which the HTTP callout agent is mapped. Mutually exclusive with the Virtual Server parameter. Therefore, you cannot set the <IP Address, Port> and the Virtual Server in the same HTTP callout.
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Name of the load balancing, content switching, or cache redirection virtual server (the callout agent) to which the HTTP callout is sent. The service type of the virtual server must be HTTP. Mutually exclusive with the IP address and port parameters. Therefore, you cannot set the <IP Address, Port> and the Virtual Server in the same HTTP callout.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vserver(String vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* Name of the load balancing, content switching, or cache redirection virtual server (the callout agent) to which the HTTP callout is sent. The service type of the virtual server must be HTTP. Mutually exclusive with the IP address and port parameters. Therefore, you cannot set the <IP Address, Port> and the Virtual Server in the same HTTP callout.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vserver() throws Exception {
		return this.vserver;
	}

	/**
	* <pre>
	* Type of data that the target callout agent returns in response to the callout. 
Available settings function as follows:
* TEXT - Treat the returned value as a text string. 
* NUM - Treat the returned value as a number.
* BOOL - Treat the returned value as a Boolean value. 
Note: You cannot change the return type after it is set.<br> Possible values = BOOL, NUM, TEXT
	* </pre>
	*/
	public void set_returntype(String returntype) throws Exception{
		this.returntype = returntype;
	}

	/**
	* <pre>
	* Type of data that the target callout agent returns in response to the callout. 
Available settings function as follows:
* TEXT - Treat the returned value as a text string. 
* NUM - Treat the returned value as a number.
* BOOL - Treat the returned value as a Boolean value. 
Note: You cannot change the return type after it is set.<br> Possible values = BOOL, NUM, TEXT
	* </pre>
	*/
	public String get_returntype() throws Exception {
		return this.returntype;
	}

	/**
	* <pre>
	* Method used in the HTTP request that this callout sends.  Mutually exclusive with the full HTTP request expression.<br> Possible values = GET, POST
	* </pre>
	*/
	public void set_httpmethod(String httpmethod) throws Exception{
		this.httpmethod = httpmethod;
	}

	/**
	* <pre>
	* Method used in the HTTP request that this callout sends.  Mutually exclusive with the full HTTP request expression.<br> Possible values = GET, POST
	* </pre>
	*/
	public String get_httpmethod() throws Exception {
		return this.httpmethod;
	}

	/**
	* <pre>
	* Default Syntax string expression to configure the Host header. Can contain a literal value (for example, 10.101.10.11) or a derived value (for example, http.req.header("Host")). The literal value can be an IP address or a fully qualified domain name. Mutually exclusive with the full HTTP request expression.<br> Minimum length =  1
	* </pre>
	*/
	public void set_hostexpr(String hostexpr) throws Exception{
		this.hostexpr = hostexpr;
	}

	/**
	* <pre>
	* Default Syntax string expression to configure the Host header. Can contain a literal value (for example, 10.101.10.11) or a derived value (for example, http.req.header("Host")). The literal value can be an IP address or a fully qualified domain name. Mutually exclusive with the full HTTP request expression.<br> Minimum length =  1
	* </pre>
	*/
	public String get_hostexpr() throws Exception {
		return this.hostexpr;
	}

	/**
	* <pre>
	* Default Syntax string expression for generating the URL stem. Can contain a literal string (for example, "/mysite/index.html") or an expression that derives the value (for example, http.req.url). Mutually exclusive with the full HTTP request expression.<br> Minimum length =  1
	* </pre>
	*/
	public void set_urlstemexpr(String urlstemexpr) throws Exception{
		this.urlstemexpr = urlstemexpr;
	}

	/**
	* <pre>
	* Default Syntax string expression for generating the URL stem. Can contain a literal string (for example, "/mysite/index.html") or an expression that derives the value (for example, http.req.url). Mutually exclusive with the full HTTP request expression.<br> Minimum length =  1
	* </pre>
	*/
	public String get_urlstemexpr() throws Exception {
		return this.urlstemexpr;
	}

	/**
	* <pre>
	* One or more headers to insert into the HTTP request. Each header is specified as "name(expr)", where expr is a default syntax expression that is evaluated at runtime to provide the value for the named header. You can configure a maximum of eight headers for an HTTP callout. Mutually exclusive with the full HTTP request expression.
	* </pre>
	*/
	public void set_headers(String[] headers) throws Exception{
		this.headers = headers;
	}

	/**
	* <pre>
	* One or more headers to insert into the HTTP request. Each header is specified as "name(expr)", where expr is a default syntax expression that is evaluated at runtime to provide the value for the named header. You can configure a maximum of eight headers for an HTTP callout. Mutually exclusive with the full HTTP request expression.
	* </pre>
	*/
	public String[] get_headers() throws Exception {
		return this.headers;
	}

	/**
	* <pre>
	* One or more query parameters to insert into the HTTP request URL (for a GET request) or into the request body (for a POST request). Each parameter is specified as "name(expr)", where expr is an default syntax expression that is evaluated at run time to provide the value for the named parameter (name=value). The parameter values are URL encoded. Mutually exclusive with the full HTTP request expression.
	* </pre>
	*/
	public void set_parameters(String[] parameters) throws Exception{
		this.parameters = parameters;
	}

	/**
	* <pre>
	* One or more query parameters to insert into the HTTP request URL (for a GET request) or into the request body (for a POST request). Each parameter is specified as "name(expr)", where expr is an default syntax expression that is evaluated at run time to provide the value for the named parameter (name=value). The parameter values are URL encoded. Mutually exclusive with the full HTTP request expression.
	* </pre>
	*/
	public String[] get_parameters() throws Exception {
		return this.parameters;
	}

	/**
	* <pre>
	* An advanced string expression for generating the body of the request. The expression can contain a literal string or an expression that derives the value (for example, client.ip.src). Mutually exclusive with -fullReqExpr.<br> Minimum length =  1
	* </pre>
	*/
	public void set_bodyexpr(String bodyexpr) throws Exception{
		this.bodyexpr = bodyexpr;
	}

	/**
	* <pre>
	* An advanced string expression for generating the body of the request. The expression can contain a literal string or an expression that derives the value (for example, client.ip.src). Mutually exclusive with -fullReqExpr.<br> Minimum length =  1
	* </pre>
	*/
	public String get_bodyexpr() throws Exception {
		return this.bodyexpr;
	}

	/**
	* <pre>
	* Exact HTTP request, in the form of a default syntax expression, which the NetScaler appliance sends to the callout agent. If you set this parameter, you must not include HTTP method, host expression, URL stem expression, headers, or parameters.
The request expression is constrained by the feature for which the callout is used. For example, an HTTP.RES expression cannot be used in a request-time policy bank or in a TCP content switching policy bank.
The NetScaler appliance does not check the validity of this request. You must manually validate the request.<br> Minimum length =  1
	* </pre>
	*/
	public void set_fullreqexpr(String fullreqexpr) throws Exception{
		this.fullreqexpr = fullreqexpr;
	}

	/**
	* <pre>
	* Exact HTTP request, in the form of a default syntax expression, which the NetScaler appliance sends to the callout agent. If you set this parameter, you must not include HTTP method, host expression, URL stem expression, headers, or parameters.
The request expression is constrained by the feature for which the callout is used. For example, an HTTP.RES expression cannot be used in a request-time policy bank or in a TCP content switching policy bank.
The NetScaler appliance does not check the validity of this request. You must manually validate the request.<br> Minimum length =  1
	* </pre>
	*/
	public String get_fullreqexpr() throws Exception {
		return this.fullreqexpr;
	}

	/**
	* <pre>
	* Type of scheme for the callout server.<br> Possible values = http, https
	* </pre>
	*/
	public void set_scheme(String scheme) throws Exception{
		this.scheme = scheme;
	}

	/**
	* <pre>
	* Type of scheme for the callout server.<br> Possible values = http, https
	* </pre>
	*/
	public String get_scheme() throws Exception {
		return this.scheme;
	}

	/**
	* <pre>
	* Expression that extracts the callout results from the response sent by the HTTP callout agent. Must be a response based expression, that is, it must begin with HTTP.RES. The operations in this expression must match the return type. For example, if you configure a return type of TEXT, the result expression must be a text based expression. If the return type is NUM, the result expression (resultExpr) must return a numeric value, as in the following example: http.res.body(10000).length.<br> Minimum length =  1
	* </pre>
	*/
	public void set_resultexpr(String resultexpr) throws Exception{
		this.resultexpr = resultexpr;
	}

	/**
	* <pre>
	* Expression that extracts the callout results from the response sent by the HTTP callout agent. Must be a response based expression, that is, it must begin with HTTP.RES. The operations in this expression must match the return type. For example, if you configure a return type of TEXT, the result expression must be a text based expression. If the return type is NUM, the result expression (resultExpr) must return a numeric value, as in the following example: http.res.body(10000).length.<br> Minimum length =  1
	* </pre>
	*/
	public String get_resultexpr() throws Exception {
		return this.resultexpr;
	}

	/**
	* <pre>
	* Duration, in seconds, for which the callout response is cached. The cached responses are stored in an integrated caching content group named "calloutContentGroup". If no duration is configured, the callout responses will not be cached unless normal caching configuration is used to cache them. This parameter takes precedence over any normal caching configuration that would otherwise apply to these responses.
	   Note that the calloutContentGroup definition may not be modified or removed nor may it be used with other cache policies.<br> Minimum value =  1<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_cacheforsecs(long cacheforsecs) throws Exception {
		this.cacheforsecs = new Long(cacheforsecs);
	}

	/**
	* <pre>
	* Duration, in seconds, for which the callout response is cached. The cached responses are stored in an integrated caching content group named "calloutContentGroup". If no duration is configured, the callout responses will not be cached unless normal caching configuration is used to cache them. This parameter takes precedence over any normal caching configuration that would otherwise apply to these responses.
	   Note that the calloutContentGroup definition may not be modified or removed nor may it be used with other cache policies.<br> Minimum value =  1<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_cacheforsecs(Long cacheforsecs) throws Exception{
		this.cacheforsecs = cacheforsecs;
	}

	/**
	* <pre>
	* Duration, in seconds, for which the callout response is cached. The cached responses are stored in an integrated caching content group named "calloutContentGroup". If no duration is configured, the callout responses will not be cached unless normal caching configuration is used to cache them. This parameter takes precedence over any normal caching configuration that would otherwise apply to these responses.
	   Note that the calloutContentGroup definition may not be modified or removed nor may it be used with other cache policies.<br> Minimum value =  1<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_cacheforsecs() throws Exception {
		return this.cacheforsecs;
	}

	/**
	* <pre>
	* Total hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Total undefs.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* The state of the service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_svrstate() throws Exception {
		return this.svrstate;
	}

	/**
	* <pre>
	* Reason for last undef.<br> Possible values = Failed to add service, Vserver not found, Not a HTTP or SSL vserver, Generated callout request is invalid, Content-Length header not found in callout request, Not enough space to put Content-Length value, Config incomplete, Server is DOWN, Creating callout connection failed, No memory to generate callout request packets, No memory to create callout task, No memory to create callout async, Callout request expression undef, No callout response expression, Skipped callout response eval, Callout response pixl init undef, Callout response expression undef
	* </pre>
	*/
	public String get_undefreason() throws Exception {
		return this.undefreason;
	}

	/**
	* <pre>
	* Number of recursive callouts.
	* </pre>
	*/
	public Long get_recursivecallout() throws Exception {
		return this.recursivecallout;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		policyhttpcallout_response result = (policyhttpcallout_response) service.get_payload_formatter().string_to_resource(policyhttpcallout_response.class, response);
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
		return result.policyhttpcallout;
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
	* Use this API to add policyhttpcallout.
	*/
	public static base_response add(nitro_service client, policyhttpcallout resource) throws Exception {
		policyhttpcallout addresource = new policyhttpcallout();
		addresource.name = resource.name;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add policyhttpcallout resources.
	*/
	public static base_responses add(nitro_service client, policyhttpcallout resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policyhttpcallout addresources[] = new policyhttpcallout[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new policyhttpcallout();
				addresources[i].name = resources[i].name;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete policyhttpcallout of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		policyhttpcallout deleteresource = new policyhttpcallout();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policyhttpcallout.
	*/
	public static base_response delete(nitro_service client, policyhttpcallout resource) throws Exception {
		policyhttpcallout deleteresource = new policyhttpcallout();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policyhttpcallout resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			policyhttpcallout deleteresources[] = new policyhttpcallout[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new policyhttpcallout();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete policyhttpcallout resources.
	*/
	public static base_responses delete(nitro_service client, policyhttpcallout resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policyhttpcallout deleteresources[] = new policyhttpcallout[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new policyhttpcallout();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update policyhttpcallout.
	*/
	public static base_response update(nitro_service client, policyhttpcallout resource) throws Exception {
		policyhttpcallout updateresource = new policyhttpcallout();
		updateresource.name = resource.name;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.port = resource.port;
		updateresource.vserver = resource.vserver;
		updateresource.returntype = resource.returntype;
		updateresource.httpmethod = resource.httpmethod;
		updateresource.hostexpr = resource.hostexpr;
		updateresource.urlstemexpr = resource.urlstemexpr;
		updateresource.headers = resource.headers;
		updateresource.parameters = resource.parameters;
		updateresource.bodyexpr = resource.bodyexpr;
		updateresource.fullreqexpr = resource.fullreqexpr;
		updateresource.scheme = resource.scheme;
		updateresource.resultexpr = resource.resultexpr;
		updateresource.cacheforsecs = resource.cacheforsecs;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update policyhttpcallout resources.
	*/
	public static base_responses update(nitro_service client, policyhttpcallout resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policyhttpcallout updateresources[] = new policyhttpcallout[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new policyhttpcallout();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].port = resources[i].port;
				updateresources[i].vserver = resources[i].vserver;
				updateresources[i].returntype = resources[i].returntype;
				updateresources[i].httpmethod = resources[i].httpmethod;
				updateresources[i].hostexpr = resources[i].hostexpr;
				updateresources[i].urlstemexpr = resources[i].urlstemexpr;
				updateresources[i].headers = resources[i].headers;
				updateresources[i].parameters = resources[i].parameters;
				updateresources[i].bodyexpr = resources[i].bodyexpr;
				updateresources[i].fullreqexpr = resources[i].fullreqexpr;
				updateresources[i].scheme = resources[i].scheme;
				updateresources[i].resultexpr = resources[i].resultexpr;
				updateresources[i].cacheforsecs = resources[i].cacheforsecs;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of policyhttpcallout resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, policyhttpcallout resource, String[] args) throws Exception{
		policyhttpcallout unsetresource = new policyhttpcallout();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of policyhttpcallout resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			policyhttpcallout unsetresources[] = new policyhttpcallout[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new policyhttpcallout();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of policyhttpcallout resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, policyhttpcallout resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policyhttpcallout unsetresources[] = new policyhttpcallout[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new policyhttpcallout();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the policyhttpcallout resources that are configured on netscaler.
	*/
	public static policyhttpcallout[] get(nitro_service service) throws Exception{
		policyhttpcallout obj = new policyhttpcallout();
		policyhttpcallout[] response = (policyhttpcallout[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the policyhttpcallout resources that are configured on netscaler.
	*/
	public static policyhttpcallout[] get(nitro_service service, options option) throws Exception{
		policyhttpcallout obj = new policyhttpcallout();
		policyhttpcallout[] response = (policyhttpcallout[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch policyhttpcallout resource of given name .
	*/
	public static policyhttpcallout get(nitro_service service, String name) throws Exception{
		policyhttpcallout obj = new policyhttpcallout();
		obj.set_name(name);
		policyhttpcallout response = (policyhttpcallout) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch policyhttpcallout resources of given names .
	*/
	public static policyhttpcallout[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			policyhttpcallout response[] = new policyhttpcallout[name.length];
			policyhttpcallout obj[] = new policyhttpcallout[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new policyhttpcallout();
				obj[i].set_name(name[i]);
				response[i] = (policyhttpcallout) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of policyhttpcallout resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static policyhttpcallout[] get_filtered(nitro_service service, String filter) throws Exception{
		policyhttpcallout obj = new policyhttpcallout();
		options option = new options();
		option.set_filter(filter);
		policyhttpcallout[] response = (policyhttpcallout[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policyhttpcallout resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static policyhttpcallout[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policyhttpcallout obj = new policyhttpcallout();
		options option = new options();
		option.set_filter(filter);
		policyhttpcallout[] response = (policyhttpcallout[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the policyhttpcallout resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		policyhttpcallout obj = new policyhttpcallout();
		options option = new options();
		option.set_count(true);
		policyhttpcallout[] response = (policyhttpcallout[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of policyhttpcallout resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		policyhttpcallout obj = new policyhttpcallout();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policyhttpcallout[] response = (policyhttpcallout[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policyhttpcallout resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policyhttpcallout obj = new policyhttpcallout();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policyhttpcallout[] response = (policyhttpcallout[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class svrstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String Unknown = "Unknown";
		public static final String DISABLED = "DISABLED";
	}
	public static class schemeEnum {
		public static final String http = "http";
		public static final String https = "https";
	}
	public static class httpmethodEnum {
		public static final String GET = "GET";
		public static final String POST = "POST";
	}
	public static class returntypeEnum {
		public static final String BOOL = "BOOL";
		public static final String NUM = "NUM";
		public static final String TEXT = "TEXT";
	}
	public static class undefreasonEnum {
		public static final String Failed_to_add_service = "Failed to add service";
		public static final String Vserver_not_found = "Vserver not found";
		public static final String Not_a_HTTP_or_SSL_vserver = "Not a HTTP or SSL vserver";
		public static final String Generated_callout_request_is_invalid = "Generated callout request is invalid";
		public static final String Content_Length_header_not_found_in_callout_request = "Content-Length header not found in callout request";
		public static final String Not_enough_space_to_put_Content_Length_value = "Not enough space to put Content-Length value";
		public static final String Config_incomplete = "Config incomplete";
		public static final String Server_is_DOWN = "Server is DOWN";
		public static final String Creating_callout_connection_failed = "Creating callout connection failed";
		public static final String No_memory_to_generate_callout_request_packets = "No memory to generate callout request packets";
		public static final String No_memory_to_create_callout_task = "No memory to create callout task";
		public static final String No_memory_to_create_callout_async = "No memory to create callout async";
		public static final String Callout_request_expression_undef = "Callout request expression undef";
		public static final String No_callout_response_expression = "No callout response expression";
		public static final String Skipped_callout_response_eval = "Skipped callout response eval";
		public static final String Callout_response_pixl_init_undef = "Callout response pixl init undef";
		public static final String Callout_response_expression_undef = "Callout response expression undef";
	}
}
