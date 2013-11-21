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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnszone_response extends base_response
{
	public dnszone[] dnszone;
}
/**
* Configuration for DNS zone resource.
*/

public class dnszone extends base_resource
{
	private String zonename;
	private String proxymode;
	private String dnssecoffload;
	private String nsec;
	private String[] keyname;
	private String type;

	//------- Read only Parameter ---------;

	private Long flags;
	private Long __count;

	/**
	* <pre>
	* Name of the zone to create.<br> Minimum length =  1
	* </pre>
	*/
	public void set_zonename(String zonename) throws Exception{
		this.zonename = zonename;
	}

	/**
	* <pre>
	* Name of the zone to create.<br> Minimum length =  1
	* </pre>
	*/
	public String get_zonename() throws Exception {
		return this.zonename;
	}

	/**
	* <pre>
	* Deploy the zone in proxy mode. Enable in the following scenarios:
* The load balanced DNS servers are authoritative for the zone and all resource records that are part of the zone. 
* The load balanced DNS servers are authoritative for the zone, but the NetScaler appliance owns a subset of the resource records that belong to the zone (partial zone ownership configuration). Typically seen in global server load balancing (GSLB) configurations, in which the appliance responds authoritatively to queries for GSLB domain names but forwards queries for other domain names in the zone to the load balanced servers.
In either scenario, do not create the zone's Start of Authority (SOA) and name server (NS) resource records on the appliance. 
Disable if the appliance is authoritative for the zone, but make sure that you have created the SOA and NS records on the appliance before you create the zone.<br> Default value: ENABLED<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_proxymode(String proxymode) throws Exception{
		this.proxymode = proxymode;
	}

	/**
	* <pre>
	* Deploy the zone in proxy mode. Enable in the following scenarios:
* The load balanced DNS servers are authoritative for the zone and all resource records that are part of the zone. 
* The load balanced DNS servers are authoritative for the zone, but the NetScaler appliance owns a subset of the resource records that belong to the zone (partial zone ownership configuration). Typically seen in global server load balancing (GSLB) configurations, in which the appliance responds authoritatively to queries for GSLB domain names but forwards queries for other domain names in the zone to the load balanced servers.
In either scenario, do not create the zone's Start of Authority (SOA) and name server (NS) resource records on the appliance. 
Disable if the appliance is authoritative for the zone, but make sure that you have created the SOA and NS records on the appliance before you create the zone.<br> Default value: ENABLED<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_proxymode() throws Exception {
		return this.proxymode;
	}

	/**
	* <pre>
	* Enable dnssec offload for this zone.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dnssecoffload(String dnssecoffload) throws Exception{
		this.dnssecoffload = dnssecoffload;
	}

	/**
	* <pre>
	* Enable dnssec offload for this zone.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dnssecoffload() throws Exception {
		return this.dnssecoffload;
	}

	/**
	* <pre>
	* Enable nsec generation for dnssec offload.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_nsec(String nsec) throws Exception{
		this.nsec = nsec;
	}

	/**
	* <pre>
	* Enable nsec generation for dnssec offload.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_nsec() throws Exception {
		return this.nsec;
	}

	/**
	* <pre>
	* Name of the public/private DNS key pair with which to sign the zone. You can sign a zone with up to four keys.<br> Minimum length =  1
	* </pre>
	*/
	public void set_keyname(String[] keyname) throws Exception{
		this.keyname = keyname;
	}

	/**
	* <pre>
	* Name of the public/private DNS key pair with which to sign the zone. You can sign a zone with up to four keys.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_keyname() throws Exception {
		return this.keyname;
	}

	/**
	* <pre>
	* Type of zone to display. Mutually exclusive with the DNS Zone (zoneName) parameter. Available settings function as follows:
* ADNS - Display all the zones for which the NetScaler appliance is authoritative.
* PROXY - Display all the zones for which the NetScaler appliance is functioning as a proxy server.
* ALL - Display all the zones configured on the appliance.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of zone to display. Mutually exclusive with the DNS Zone (zoneName) parameter. Available settings function as follows:
* ADNS - Display all the zones for which the NetScaler appliance is authoritative.
* PROXY - Display all the zones for which the NetScaler appliance is functioning as a proxy server.
* ALL - Display all the zones configured on the appliance.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Flags controlling display.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnszone_response result = (dnszone_response) service.get_payload_formatter().string_to_resource(dnszone_response.class, response);
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
		return result.dnszone;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.zonename;
	}

	/**
	* Use this API to add dnszone.
	*/
	public static base_response add(nitro_service client, dnszone resource) throws Exception {
		dnszone addresource = new dnszone();
		addresource.zonename = resource.zonename;
		addresource.proxymode = resource.proxymode;
		addresource.dnssecoffload = resource.dnssecoffload;
		addresource.nsec = resource.nsec;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnszone resources.
	*/
	public static base_responses add(nitro_service client, dnszone resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone addresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnszone();
				addresources[i].zonename = resources[i].zonename;
				addresources[i].proxymode = resources[i].proxymode;
				addresources[i].dnssecoffload = resources[i].dnssecoffload;
				addresources[i].nsec = resources[i].nsec;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update dnszone.
	*/
	public static base_response update(nitro_service client, dnszone resource) throws Exception {
		dnszone updateresource = new dnszone();
		updateresource.zonename = resource.zonename;
		updateresource.proxymode = resource.proxymode;
		updateresource.dnssecoffload = resource.dnssecoffload;
		updateresource.nsec = resource.nsec;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnszone resources.
	*/
	public static base_responses update(nitro_service client, dnszone resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone updateresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnszone();
				updateresources[i].zonename = resources[i].zonename;
				updateresources[i].proxymode = resources[i].proxymode;
				updateresources[i].dnssecoffload = resources[i].dnssecoffload;
				updateresources[i].nsec = resources[i].nsec;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnszone resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnszone resource, String[] args) throws Exception{
		dnszone unsetresource = new dnszone();
		unsetresource.zonename = resource.zonename;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dnszone resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String zonename[], String args[]) throws Exception {
		base_responses result = null;
		if (zonename != null && zonename.length > 0) {
			dnszone unsetresources[] = new dnszone[zonename.length];
			for (int i=0;i<zonename.length;i++){
				unsetresources[i] = new dnszone();
				unsetresources[i].zonename = zonename[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnszone resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dnszone resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone unsetresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dnszone();
				unsetresources[i].zonename = resources[i].zonename;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to delete dnszone of given name.
	*/
	public static base_response delete(nitro_service client, String zonename) throws Exception {
		dnszone deleteresource = new dnszone();
		deleteresource.zonename = zonename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnszone.
	*/
	public static base_response delete(nitro_service client, dnszone resource) throws Exception {
		dnszone deleteresource = new dnszone();
		deleteresource.zonename = resource.zonename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnszone resources of given names.
	*/
	public static base_responses delete(nitro_service client, String zonename[]) throws Exception {
		base_responses result = null;
		if (zonename != null && zonename.length > 0) {
			dnszone deleteresources[] = new dnszone[zonename.length];
			for (int i=0;i<zonename.length;i++){
				deleteresources[i] = new dnszone();
				deleteresources[i].zonename = zonename[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnszone resources.
	*/
	public static base_responses delete(nitro_service client, dnszone resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone deleteresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnszone();
				deleteresources[i].zonename = resources[i].zonename;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to sign dnszone.
	*/
	public static base_response sign(nitro_service client, dnszone resource) throws Exception {
		dnszone signresource = new dnszone();
		signresource.zonename = resource.zonename;
		signresource.keyname = resource.keyname;
		return signresource.perform_operation(client,"sign");
	}

	/**
	* Use this API to sign dnszone resources.
	*/
	public static base_responses sign(nitro_service client, dnszone resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone signresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				signresources[i] = new dnszone();
				signresources[i].zonename = resources[i].zonename;
				signresources[i].keyname = resources[i].keyname;
			}
			result = perform_operation_bulk_request(client, signresources,"sign");
		}
		return result;
	}

	/**
	* Use this API to unsign dnszone.
	*/
	public static base_response unsign(nitro_service client, dnszone resource) throws Exception {
		dnszone unsignresource = new dnszone();
		unsignresource.zonename = resource.zonename;
		unsignresource.keyname = resource.keyname;
		return unsignresource.perform_operation(client,"unsign");
	}

	/**
	* Use this API to unsign dnszone resources.
	*/
	public static base_responses unsign(nitro_service client, dnszone resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone unsignresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				unsignresources[i] = new dnszone();
				unsignresources[i].zonename = resources[i].zonename;
				unsignresources[i].keyname = resources[i].keyname;
			}
			result = perform_operation_bulk_request(client, unsignresources,"unsign");
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnszone resources that are configured on netscaler.
	*/
	public static dnszone[] get(nitro_service service) throws Exception{
		dnszone obj = new dnszone();
		dnszone[] response = (dnszone[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnszone resources that are configured on netscaler.
	*/
	public static dnszone[] get(nitro_service service, options option) throws Exception{
		dnszone obj = new dnszone();
		dnszone[] response = (dnszone[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnszone resources that are configured on netscaler.
	* This uses dnszone_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnszone[] get(nitro_service service, dnszone_args args) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnszone[] response = (dnszone[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnszone resource of given name .
	*/
	public static dnszone get(nitro_service service, String zonename) throws Exception{
		dnszone obj = new dnszone();
		obj.set_zonename(zonename);
		dnszone response = (dnszone) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnszone resources of given names .
	*/
	public static dnszone[] get(nitro_service service, String zonename[]) throws Exception{
		if (zonename !=null && zonename.length>0) {
			dnszone response[] = new dnszone[zonename.length];
			dnszone obj[] = new dnszone[zonename.length];
			for (int i=0;i<zonename.length;i++) {
				obj[i] = new dnszone();
				obj[i].set_zonename(zonename[i]);
				response[i] = (dnszone) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnszone resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnszone[] get_filtered(nitro_service service, String filter) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_filter(filter);
		dnszone[] response = (dnszone[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnszone resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnszone[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_filter(filter);
		dnszone[] response = (dnszone[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnszone resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_count(true);
		dnszone[] response = (dnszone[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnszone resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnszone[] response = (dnszone[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnszone resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnszone[] response = (dnszone[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
	public static class proxymodeEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class nsecEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dnssecoffloadEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
