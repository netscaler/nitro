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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsfeature_response extends base_response
{
	public nsfeature nsfeature;
}
/**
* Configuration for feature resource.
*/

public class nsfeature extends base_resource
{
	private String[] feature;

	//------- Read only Parameter ---------;

	private Boolean wl;
	private Boolean sp;
	private Boolean lb;
	private Boolean cs;
	private Boolean cr;
	private Boolean sc;
	private Boolean cmp;
	private Boolean pq;
	private Boolean ssl;
	private Boolean gslb;
	private Boolean hdosp;
	private Boolean routing;
	private Boolean cf;
	private Boolean ic;
	private Boolean sslvpn;
	private Boolean aaa;
	private Boolean ospf;
	private Boolean rip;
	private Boolean bgp;
	private Boolean rewrite;
	private Boolean ipv6pt;
	private Boolean appfw;
	private Boolean responder;
	private Boolean htmlinjection;
	private Boolean push;
	private Boolean appflow;
	private Boolean cloudbridge;
	private Boolean isis;
	private Boolean ch;

	/**
	* <pre>
	* Name of the feature(s).
	* </pre>
	*/
	public void set_feature(String[] feature) throws Exception{
		this.feature = feature;
	}

	/**
	* <pre>
	* Name of the feature(s).
	* </pre>
	*/
	public String[] get_feature() throws Exception {
		return this.feature;
	}

	/**
	* <pre>
	* Web Logging.
	* </pre>
	*/
	public Boolean get_wl() throws Exception {
		return this.wl;
	}

	/**
	* <pre>
	* Surge Protection.
	* </pre>
	*/
	public Boolean get_sp() throws Exception {
		return this.sp;
	}

	/**
	* <pre>
	* Load Balancing.
	* </pre>
	*/
	public Boolean get_lb() throws Exception {
		return this.lb;
	}

	/**
	* <pre>
	* Content Switching.
	* </pre>
	*/
	public Boolean get_cs() throws Exception {
		return this.cs;
	}

	/**
	* <pre>
	* Cache Redirect.
	* </pre>
	*/
	public Boolean get_cr() throws Exception {
		return this.cr;
	}

	/**
	* <pre>
	* Sure Connect.
	* </pre>
	*/
	public Boolean get_sc() throws Exception {
		return this.sc;
	}

	/**
	* <pre>
	* Compression.
	* </pre>
	*/
	public Boolean get_cmp() throws Exception {
		return this.cmp;
	}

	/**
	* <pre>
	* Priority Queuing.
	* </pre>
	*/
	public Boolean get_pq() throws Exception {
		return this.pq;
	}

	/**
	* <pre>
	* Secure Sockets Layer.
	* </pre>
	*/
	public Boolean get_ssl() throws Exception {
		return this.ssl;
	}

	/**
	* <pre>
	* Global Server Load Balancing.
	* </pre>
	*/
	public Boolean get_gslb() throws Exception {
		return this.gslb;
	}

	/**
	* <pre>
	* DOS Protection.
	* </pre>
	*/
	public Boolean get_hdosp() throws Exception {
		return this.hdosp;
	}

	/**
	* <pre>
	* Routing.
	* </pre>
	*/
	public Boolean get_routing() throws Exception {
		return this.routing;
	}

	/**
	* <pre>
	* Content Filter.
	* </pre>
	*/
	public Boolean get_cf() throws Exception {
		return this.cf;
	}

	/**
	* <pre>
	* Integrated Caching.
	* </pre>
	*/
	public Boolean get_ic() throws Exception {
		return this.ic;
	}

	/**
	* <pre>
	* SSL VPN.
	* </pre>
	*/
	public Boolean get_sslvpn() throws Exception {
		return this.sslvpn;
	}

	/**
	* <pre>
	* AAA.
	* </pre>
	*/
	public Boolean get_aaa() throws Exception {
		return this.aaa;
	}

	/**
	* <pre>
	* OSPF Routing.
	* </pre>
	*/
	public Boolean get_ospf() throws Exception {
		return this.ospf;
	}

	/**
	* <pre>
	* RIP Routing.
	* </pre>
	*/
	public Boolean get_rip() throws Exception {
		return this.rip;
	}

	/**
	* <pre>
	* BGP Routing.
	* </pre>
	*/
	public Boolean get_bgp() throws Exception {
		return this.bgp;
	}

	/**
	* <pre>
	* Rewrite.
	* </pre>
	*/
	public Boolean get_rewrite() throws Exception {
		return this.rewrite;
	}

	/**
	* <pre>
	* IPv6 protocol translation.
	* </pre>
	*/
	public Boolean get_ipv6pt() throws Exception {
		return this.ipv6pt;
	}

	/**
	* <pre>
	* Application Firewall.
	* </pre>
	*/
	public Boolean get_appfw() throws Exception {
		return this.appfw;
	}

	/**
	* <pre>
	* Responder.
	* </pre>
	*/
	public Boolean get_responder() throws Exception {
		return this.responder;
	}

	/**
	* <pre>
	* HTML Injection.
	* </pre>
	*/
	public Boolean get_htmlinjection() throws Exception {
		return this.htmlinjection;
	}

	/**
	* <pre>
	* NetScaler Push.
	* </pre>
	*/
	public Boolean get_push() throws Exception {
		return this.push;
	}

	/**
	* <pre>
	* AppFlow.
	* </pre>
	*/
	public Boolean get_appflow() throws Exception {
		return this.appflow;
	}

	/**
	* <pre>
	* CloudBridge.
	* </pre>
	*/
	public Boolean get_cloudbridge() throws Exception {
		return this.cloudbridge;
	}

	/**
	* <pre>
	* ISIS Routing.
	* </pre>
	*/
	public Boolean get_isis() throws Exception {
		return this.isis;
	}

	/**
	* <pre>
	* Call Home.
	* </pre>
	*/
	public Boolean get_ch() throws Exception {
		return this.ch;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsfeature[] resources = new nsfeature[1];
		nsfeature_response result = (nsfeature_response) service.get_payload_formatter().string_to_resource(nsfeature_response.class, response);
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
		resources[0] = result.nsfeature;
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
	* Use this API to enable nsfeature.
	*/
	public static base_response enable(nitro_service client, nsfeature resource) throws Exception {
		nsfeature enableresource = new nsfeature();
		enableresource.feature = resource.feature;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to disable nsfeature.
	*/
	public static base_response disable(nitro_service client, nsfeature resource) throws Exception {
		nsfeature disableresource = new nsfeature();
		disableresource.feature = resource.feature;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to fetch all the nsfeature resources that are configured on netscaler.
	*/
	public static nsfeature get(nitro_service service) throws Exception{
		nsfeature obj = new nsfeature();
		nsfeature[] response = (nsfeature[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsfeature resources that are configured on netscaler.
	*/
	public static nsfeature get(nitro_service service,  options option) throws Exception{
		nsfeature obj = new nsfeature();
		nsfeature[] response = (nsfeature[])obj.get_resources(service,option);
		return response[0];
	}

	public static class featureEnum {
		public static final String WL = "WL";
		public static final String WebLogging = "WebLogging";
		public static final String SP = "SP";
		public static final String SurgeProtection = "SurgeProtection";
		public static final String LB = "LB";
		public static final String LoadBalancing = "LoadBalancing";
		public static final String CS = "CS";
		public static final String ContentSwitching = "ContentSwitching";
		public static final String CR = "CR";
		public static final String CacheRedirection = "CacheRedirection";
		public static final String SC = "SC";
		public static final String SureConnect = "SureConnect";
		public static final String CMP = "CMP";
		public static final String CMPcntl = "CMPcntl";
		public static final String CompressionControl = "CompressionControl";
		public static final String PQ = "PQ";
		public static final String PriorityQueuing = "PriorityQueuing";
		public static final String HDOSP = "HDOSP";
		public static final String HttpDoSProtection = "HttpDoSProtection";
		public static final String SSLVPN = "SSLVPN";
		public static final String AAA = "AAA";
		public static final String GSLB = "GSLB";
		public static final String GlobalServerLoadBalancing = "GlobalServerLoadBalancing";
		public static final String SSL = "SSL";
		public static final String SSLOffload = "SSLOffload";
		public static final String SSLOffloading = "SSLOffloading";
		public static final String CF = "CF";
		public static final String ContentFiltering = "ContentFiltering";
		public static final String IC = "IC";
		public static final String IntegratedCaching = "IntegratedCaching";
		public static final String OSPF = "OSPF";
		public static final String OSPFRouting = "OSPFRouting";
		public static final String RIP = "RIP";
		public static final String RIPRouting = "RIPRouting";
		public static final String BGP = "BGP";
		public static final String BGPRouting = "BGPRouting";
		public static final String REWRITE = "REWRITE";
		public static final String IPv6PT = "IPv6PT";
		public static final String IPv6protocoltranslation = "IPv6protocoltranslation";
		public static final String AppFw = "AppFw";
		public static final String ApplicationFirewall = "ApplicationFirewall";
		public static final String RESPONDER = "RESPONDER";
		public static final String HTMLInjection = "HTMLInjection";
		public static final String push = "push";
		public static final String NSPush = "NSPush";
		public static final String NetScalerPush = "NetScalerPush";
		public static final String AppFlow = "AppFlow";
		public static final String CloudBridge = "CloudBridge";
		public static final String ISIS = "ISIS";
		public static final String ISISRouting = "ISISRouting";
		public static final String CH = "CH";
	}
}
