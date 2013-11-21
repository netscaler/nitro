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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbsite_response extends base_response
{
	public gslbsite[] gslbsite;
}
/**
* Configuration for GSLB site resource.
*/

public class gslbsite extends base_resource
{
	private String sitename;
	private String sitetype;
	private String siteipaddress;
	private String publicip;
	private String metricexchange;
	private String nwmetricexchange;
	private String sessionexchange;
	private String triggermonitor;
	private String parentsite;

	//------- Read only Parameter ---------;

	private String status;
	private String persistencemepstatus;
	private Long version;
	private Long __count;

	/**
	* <pre>
	* Name for the GSLB site. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the virtual server is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my gslbsite" or 'my gslbsite').<br> Minimum length =  1
	* </pre>
	*/
	public void set_sitename(String sitename) throws Exception{
		this.sitename = sitename;
	}

	/**
	* <pre>
	* Name for the GSLB site. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the virtual server is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my gslbsite" or 'my gslbsite').<br> Minimum length =  1
	* </pre>
	*/
	public String get_sitename() throws Exception {
		return this.sitename;
	}

	/**
	* <pre>
	* Type of site to create. If the type is not specified, the appliance automatically detects and sets the type on the basis of the IP address being assigned to the site. If the specified site IP address is owned by the appliance (for example, a MIP address or SNIP address), the site is a local site. Otherwise, it is a remote site.<br> Default value: NONE<br> Possible values = REMOTE, LOCAL
	* </pre>
	*/
	public void set_sitetype(String sitetype) throws Exception{
		this.sitetype = sitetype;
	}

	/**
	* <pre>
	* Type of site to create. If the type is not specified, the appliance automatically detects and sets the type on the basis of the IP address being assigned to the site. If the specified site IP address is owned by the appliance (for example, a MIP address or SNIP address), the site is a local site. Otherwise, it is a remote site.<br> Default value: NONE<br> Possible values = REMOTE, LOCAL
	* </pre>
	*/
	public String get_sitetype() throws Exception {
		return this.sitetype;
	}

	/**
	* <pre>
	* IP address for the GSLB site. The GSLB site uses this IP address to communicate with other GSLB sites. For a local site, use any IP address that is owned by the appliance (for example, a SNIP or MIP address, or the IP address of the ADNS service).<br> Minimum length =  1
	* </pre>
	*/
	public void set_siteipaddress(String siteipaddress) throws Exception{
		this.siteipaddress = siteipaddress;
	}

	/**
	* <pre>
	* IP address for the GSLB site. The GSLB site uses this IP address to communicate with other GSLB sites. For a local site, use any IP address that is owned by the appliance (for example, a SNIP or MIP address, or the IP address of the ADNS service).<br> Minimum length =  1
	* </pre>
	*/
	public String get_siteipaddress() throws Exception {
		return this.siteipaddress;
	}

	/**
	* <pre>
	* Public IP address for the local site. Required only if the appliance is deployed in a private address space and the site has a public IP address hosted on an external firewall or a NAT device.<br> Minimum length =  1
	* </pre>
	*/
	public void set_publicip(String publicip) throws Exception{
		this.publicip = publicip;
	}

	/**
	* <pre>
	* Public IP address for the local site. Required only if the appliance is deployed in a private address space and the site has a public IP address hosted on an external firewall or a NAT device.<br> Minimum length =  1
	* </pre>
	*/
	public String get_publicip() throws Exception {
		return this.publicip;
	}

	/**
	* <pre>
	* Exchange metrics with other sites. Metrics are exchanged by using Metric Exchange Protocol (MEP). The appliances in the GSLB setup exchange health information once every second. 

If you disable metrics exchange, you can use only static load balancing methods (such as round robin, static proximity, or the hash-based methods), and if you disable metrics exchange when a dynamic load balancing method (such as least connection) is in operation, the appliance falls back to round robin. Also, if you disable metrics exchange, you must use a monitor to determine the state of GSLB services. Otherwise, the service is marked as DOWN.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_metricexchange(String metricexchange) throws Exception{
		this.metricexchange = metricexchange;
	}

	/**
	* <pre>
	* Exchange metrics with other sites. Metrics are exchanged by using Metric Exchange Protocol (MEP). The appliances in the GSLB setup exchange health information once every second. 

If you disable metrics exchange, you can use only static load balancing methods (such as round robin, static proximity, or the hash-based methods), and if you disable metrics exchange when a dynamic load balancing method (such as least connection) is in operation, the appliance falls back to round robin. Also, if you disable metrics exchange, you must use a monitor to determine the state of GSLB services. Otherwise, the service is marked as DOWN.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_metricexchange() throws Exception {
		return this.metricexchange;
	}

	/**
	* <pre>
	* Exchange, with other GSLB sites, network metrics such as round-trip time (RTT), learned from communications with various local DNS (LDNS) servers used by clients. RTT information is used in the dynamic RTT load balancing method, and is exchanged every 5 seconds.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nwmetricexchange(String nwmetricexchange) throws Exception{
		this.nwmetricexchange = nwmetricexchange;
	}

	/**
	* <pre>
	* Exchange, with other GSLB sites, network metrics such as round-trip time (RTT), learned from communications with various local DNS (LDNS) servers used by clients. RTT information is used in the dynamic RTT load balancing method, and is exchanged every 5 seconds.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nwmetricexchange() throws Exception {
		return this.nwmetricexchange;
	}

	/**
	* <pre>
	* Exchange persistent session entries with other GSLB sites every five seconds.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sessionexchange(String sessionexchange) throws Exception{
		this.sessionexchange = sessionexchange;
	}

	/**
	* <pre>
	* Exchange persistent session entries with other GSLB sites every five seconds.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sessionexchange() throws Exception {
		return this.sessionexchange;
	}

	/**
	* <pre>
	* Specify the conditions under which the GSLB service must be monitored by a monitor, if one is bound. Available settings function as follows:
* ALWAYS - Monitor the GSLB service at all times.
* MEPDOWN - Monitor the GSLB service only when the exchange of metrics through the Metrics Exchange Protocol (MEP) is disabled.
MEPDOWN_SVCDOWN - Monitor the service in either of the following situations: 
* The exchange of metrics through MEP is disabled.
* The exchange of metrics through MEP is enabled but the status of the service, learned through metrics exchange, is DOWN.<br> Default value: ALWAYS<br> Possible values = ALWAYS, MEPDOWN, MEPDOWN_SVCDOWN
	* </pre>
	*/
	public void set_triggermonitor(String triggermonitor) throws Exception{
		this.triggermonitor = triggermonitor;
	}

	/**
	* <pre>
	* Specify the conditions under which the GSLB service must be monitored by a monitor, if one is bound. Available settings function as follows:
* ALWAYS - Monitor the GSLB service at all times.
* MEPDOWN - Monitor the GSLB service only when the exchange of metrics through the Metrics Exchange Protocol (MEP) is disabled.
MEPDOWN_SVCDOWN - Monitor the service in either of the following situations: 
* The exchange of metrics through MEP is disabled.
* The exchange of metrics through MEP is enabled but the status of the service, learned through metrics exchange, is DOWN.<br> Default value: ALWAYS<br> Possible values = ALWAYS, MEPDOWN, MEPDOWN_SVCDOWN
	* </pre>
	*/
	public String get_triggermonitor() throws Exception {
		return this.triggermonitor;
	}

	/**
	* <pre>
	* Parent site of the GSLB site, in a parent-child topology.
	* </pre>
	*/
	public void set_parentsite(String parentsite) throws Exception{
		this.parentsite = parentsite;
	}

	/**
	* <pre>
	* Parent site of the GSLB site, in a parent-child topology.
	* </pre>
	*/
	public String get_parentsite() throws Exception {
		return this.parentsite;
	}

	/**
	* <pre>
	* Current metric exchange status.<br> Possible values = ACTIVE, INACTIVE, DOWN
	* </pre>
	*/
	public String get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* Network metric and persistence exchange MEP connection status.<br> Possible values = ACTIVE, INACTIVE, DOWN
	* </pre>
	*/
	public String get_persistencemepstatus() throws Exception {
		return this.persistencemepstatus;
	}

	/**
	* <pre>
	* will be true if the remote site's version is ncore compatible with the local site.(>= 9.2).
	* </pre>
	*/
	public Long get_version() throws Exception {
		return this.version;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbsite_response result = (gslbsite_response) service.get_payload_formatter().string_to_resource(gslbsite_response.class, response);
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
		return result.gslbsite;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitename;
	}

	/**
	* Use this API to add gslbsite.
	*/
	public static base_response add(nitro_service client, gslbsite resource) throws Exception {
		gslbsite addresource = new gslbsite();
		addresource.sitename = resource.sitename;
		addresource.sitetype = resource.sitetype;
		addresource.siteipaddress = resource.siteipaddress;
		addresource.publicip = resource.publicip;
		addresource.metricexchange = resource.metricexchange;
		addresource.nwmetricexchange = resource.nwmetricexchange;
		addresource.sessionexchange = resource.sessionexchange;
		addresource.triggermonitor = resource.triggermonitor;
		addresource.parentsite = resource.parentsite;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add gslbsite resources.
	*/
	public static base_responses add(nitro_service client, gslbsite resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbsite addresources[] = new gslbsite[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new gslbsite();
				addresources[i].sitename = resources[i].sitename;
				addresources[i].sitetype = resources[i].sitetype;
				addresources[i].siteipaddress = resources[i].siteipaddress;
				addresources[i].publicip = resources[i].publicip;
				addresources[i].metricexchange = resources[i].metricexchange;
				addresources[i].nwmetricexchange = resources[i].nwmetricexchange;
				addresources[i].sessionexchange = resources[i].sessionexchange;
				addresources[i].triggermonitor = resources[i].triggermonitor;
				addresources[i].parentsite = resources[i].parentsite;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete gslbsite of given name.
	*/
	public static base_response delete(nitro_service client, String sitename) throws Exception {
		gslbsite deleteresource = new gslbsite();
		deleteresource.sitename = sitename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete gslbsite.
	*/
	public static base_response delete(nitro_service client, gslbsite resource) throws Exception {
		gslbsite deleteresource = new gslbsite();
		deleteresource.sitename = resource.sitename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete gslbsite resources of given names.
	*/
	public static base_responses delete(nitro_service client, String sitename[]) throws Exception {
		base_responses result = null;
		if (sitename != null && sitename.length > 0) {
			gslbsite deleteresources[] = new gslbsite[sitename.length];
			for (int i=0;i<sitename.length;i++){
				deleteresources[i] = new gslbsite();
				deleteresources[i].sitename = sitename[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete gslbsite resources.
	*/
	public static base_responses delete(nitro_service client, gslbsite resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbsite deleteresources[] = new gslbsite[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new gslbsite();
				deleteresources[i].sitename = resources[i].sitename;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update gslbsite.
	*/
	public static base_response update(nitro_service client, gslbsite resource) throws Exception {
		gslbsite updateresource = new gslbsite();
		updateresource.sitename = resource.sitename;
		updateresource.metricexchange = resource.metricexchange;
		updateresource.nwmetricexchange = resource.nwmetricexchange;
		updateresource.sessionexchange = resource.sessionexchange;
		updateresource.triggermonitor = resource.triggermonitor;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update gslbsite resources.
	*/
	public static base_responses update(nitro_service client, gslbsite resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbsite updateresources[] = new gslbsite[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new gslbsite();
				updateresources[i].sitename = resources[i].sitename;
				updateresources[i].metricexchange = resources[i].metricexchange;
				updateresources[i].nwmetricexchange = resources[i].nwmetricexchange;
				updateresources[i].sessionexchange = resources[i].sessionexchange;
				updateresources[i].triggermonitor = resources[i].triggermonitor;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of gslbsite resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, gslbsite resource, String[] args) throws Exception{
		gslbsite unsetresource = new gslbsite();
		unsetresource.sitename = resource.sitename;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of gslbsite resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String sitename[], String args[]) throws Exception {
		base_responses result = null;
		if (sitename != null && sitename.length > 0) {
			gslbsite unsetresources[] = new gslbsite[sitename.length];
			for (int i=0;i<sitename.length;i++){
				unsetresources[i] = new gslbsite();
				unsetresources[i].sitename = sitename[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of gslbsite resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, gslbsite resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbsite unsetresources[] = new gslbsite[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new gslbsite();
				unsetresources[i].sitename = resources[i].sitename;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the gslbsite resources that are configured on netscaler.
	*/
	public static gslbsite[] get(nitro_service service) throws Exception{
		gslbsite obj = new gslbsite();
		gslbsite[] response = (gslbsite[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the gslbsite resources that are configured on netscaler.
	*/
	public static gslbsite[] get(nitro_service service, options option) throws Exception{
		gslbsite obj = new gslbsite();
		gslbsite[] response = (gslbsite[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch gslbsite resource of given name .
	*/
	public static gslbsite get(nitro_service service, String sitename) throws Exception{
		gslbsite obj = new gslbsite();
		obj.set_sitename(sitename);
		gslbsite response = (gslbsite) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch gslbsite resources of given names .
	*/
	public static gslbsite[] get(nitro_service service, String sitename[]) throws Exception{
		if (sitename !=null && sitename.length>0) {
			gslbsite response[] = new gslbsite[sitename.length];
			gslbsite obj[] = new gslbsite[sitename.length];
			for (int i=0;i<sitename.length;i++) {
				obj[i] = new gslbsite();
				obj[i].set_sitename(sitename[i]);
				response[i] = (gslbsite) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of gslbsite resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static gslbsite[] get_filtered(nitro_service service, String filter) throws Exception{
		gslbsite obj = new gslbsite();
		options option = new options();
		option.set_filter(filter);
		gslbsite[] response = (gslbsite[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbsite resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static gslbsite[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		gslbsite obj = new gslbsite();
		options option = new options();
		option.set_filter(filter);
		gslbsite[] response = (gslbsite[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the gslbsite resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		gslbsite obj = new gslbsite();
		options option = new options();
		option.set_count(true);
		gslbsite[] response = (gslbsite[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of gslbsite resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		gslbsite obj = new gslbsite();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbsite[] response = (gslbsite[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbsite resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		gslbsite obj = new gslbsite();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbsite[] response = (gslbsite[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class sessionexchangeEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class nwmetricexchangeEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class statusEnum {
		public static final String ACTIVE = "ACTIVE";
		public static final String INACTIVE = "INACTIVE";
		public static final String DOWN = "DOWN";
	}
	public static class triggermonitorEnum {
		public static final String ALWAYS = "ALWAYS";
		public static final String MEPDOWN = "MEPDOWN";
		public static final String MEPDOWN_SVCDOWN = "MEPDOWN_SVCDOWN";
	}
	public static class persistencemepstatusEnum {
		public static final String ACTIVE = "ACTIVE";
		public static final String INACTIVE = "INACTIVE";
		public static final String DOWN = "DOWN";
	}
	public static class metricexchangeEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class sitetypeEnum {
		public static final String REMOTE = "REMOTE";
		public static final String LOCAL = "LOCAL";
	}
}
