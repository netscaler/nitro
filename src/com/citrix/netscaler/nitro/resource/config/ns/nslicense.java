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

class nslicense_response extends base_response
{
	public nslicense nslicense;
}
/**
* Configuration for license resource.
*/

public class nslicense extends base_resource
{

	//------- Read only Parameter ---------;

	private Boolean wl;
	private Boolean sp;
	private Boolean lb;
	private Boolean cs;
	private Boolean cr;
	private Boolean sc;
	private Boolean cmp;
	private Boolean delta;
	private Boolean pq;
	private Boolean ssl;
	private Boolean gslb;
	private Boolean gslbp;
	private Boolean hdosp;
	private Boolean routing;
	private Boolean cf;
	private Boolean ic;
	private Boolean sslvpn;
	private Long f_sslvpn_users;
	private Long f_ica_users;
	private Boolean aaa;
	private Boolean ospf;
	private Boolean rip;
	private Boolean bgp;
	private Boolean rewrite;
	private Boolean ipv6pt;
	private Boolean appfw;
	private Boolean responder;
	private Boolean agee;
	private Boolean nsxn;
	private Boolean htmlinjection;
	private Long modelid;
	private Boolean push;
	private Boolean wionns;
	private Boolean appflow;
	private Boolean cloudbridge;
	private Boolean cloudbridgeappliance;
	private Boolean cloudextenderappliance;
	private Boolean isis;
	private Boolean cluster;
	private Boolean ch;

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
	* Delta Compression.
	* </pre>
	*/
	public Boolean get_delta() throws Exception {
		return this.delta;
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
	* GSLB Proximity.
	* </pre>
	*/
	public Boolean get_gslbp() throws Exception {
		return this.gslbp;
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
	* Number of licensed users allowed by this license.
	* </pre>
	*/
	public Long get_f_sslvpn_users() throws Exception {
		return this.f_sslvpn_users;
	}

	/**
	* <pre>
	* Number of licensed users allowed by ICAONLY license.
	* </pre>
	*/
	public Long get_f_ica_users() throws Exception {
		return this.f_ica_users;
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
	* .
	* </pre>
	*/
	public Boolean get_agee() throws Exception {
		return this.agee;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_nsxn() throws Exception {
		return this.nsxn;
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
	* Model Number ID.
	* </pre>
	*/
	public Long get_modelid() throws Exception {
		return this.modelid;
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
	* WI on NS.
	* </pre>
	*/
	public Boolean get_wionns() throws Exception {
		return this.wionns;
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
	* .
	* </pre>
	*/
	public Boolean get_cloudbridgeappliance() throws Exception {
		return this.cloudbridgeappliance;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_cloudextenderappliance() throws Exception {
		return this.cloudextenderappliance;
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
	* Clustering.
	* </pre>
	*/
	public Boolean get_cluster() throws Exception {
		return this.cluster;
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
		nslicense[] resources = new nslicense[1];
		nslicense_response result = (nslicense_response) service.get_payload_formatter().string_to_resource(nslicense_response.class, response);
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
		resources[0] = result.nslicense;
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
	* Use this API to fetch all the nslicense resources that are configured on netscaler.
	*/
	public static nslicense get(nitro_service service) throws Exception{
		nslicense obj = new nslicense();
		nslicense[] response = (nslicense[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nslicense resources that are configured on netscaler.
	*/
	public static nslicense get(nitro_service service,  options option) throws Exception{
		nslicense obj = new nslicense();
		nslicense[] response = (nslicense[])obj.get_resources(service,option);
		return response[0];
	}

}
