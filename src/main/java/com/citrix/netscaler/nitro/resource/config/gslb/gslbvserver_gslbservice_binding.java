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

class gslbvserver_gslbservice_binding_response extends base_response
{
	public gslbvserver_gslbservice_binding[] gslbvserver_gslbservice_binding;
}
/**
	* Binding class showing the gslbservice that can be bound to gslbvserver.
	*/

public class gslbvserver_gslbservice_binding extends base_resource
{
	private String servicename;
	private Long weight;
	private String cnameentry;
	private String ipaddress;
	private Integer port;
	private String servicetype;
	private String curstate;
	private Long dynamicconfwt;
	private Long cumulativeweight;
	private String svreffgslbstate;
	private Integer gslbthreshold;
	private String preferredlocation;
	private Integer thresholdvalue;
	private String iscname;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The new weight for the given service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The new weight for the given service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The new weight for the given service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The vserver for which the binding operation is to be done.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The vserver for which the binding operation is to be done.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The service for which the weight needs to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The service for which the weight needs to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The cname of the gslb service.
	* </pre>
	*/
	public String get_cnameentry() throws Exception {
		return this.cnameentry;
	}

	/**
	* <pre>
	* Indicates if gslb svc has reached threshold.
	* </pre>
	*/
	public Integer get_gslbthreshold() throws Exception {
		return this.gslbthreshold;
	}

	/**
	* <pre>
	* Port number.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* is cname feature set on vserver.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_iscname() throws Exception {
		return this.iscname;
	}

	/**
	* <pre>
	* State of the gslb vserver.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* The target site to be returned in the DNS response when a policy is successfully evaluated against the incoming DNS request. Target site is specified in dotted notation with up to 6 qualifiers. Wildcard `*' is accepted as a valid qualifier token.
	* </pre>
	*/
	public String get_preferredlocation() throws Exception {
		return this.preferredlocation;
	}

	/**
	* <pre>
	* Effective state of the gslb svc.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_svreffgslbstate() throws Exception {
		return this.svreffgslbstate;
	}

	/**
	* <pre>
	* Weight obtained by the virtue of bound service count or weight.
	* </pre>
	*/
	public Long get_dynamicconfwt() throws Exception {
		return this.dynamicconfwt;
	}

	/**
	* <pre>
	* Tells whether threshold exceeded for this service participating in CUSTOMLB.
	* </pre>
	*/
	public Integer get_thresholdvalue() throws Exception {
		return this.thresholdvalue;
	}

	/**
	* <pre>
	* The service type of the virtual server.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, ANY, SIP_UDP, RADIUS, RDP, RTSP, MYSQL, MSSQL
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* IP address.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* NSA_DYNAMIC_CONF_WT * NSA_WEIGHT.
	* </pre>
	*/
	public Long get_cumulativeweight() throws Exception {
		return this.cumulativeweight;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbvserver_gslbservice_binding_response result = (gslbvserver_gslbservice_binding_response) service.get_payload_formatter().string_to_resource(gslbvserver_gslbservice_binding_response.class, response);
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
		return result.gslbvserver_gslbservice_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, gslbvserver_gslbservice_binding resource) throws Exception {
		gslbvserver_gslbservice_binding updateresource = new gslbvserver_gslbservice_binding();
		updateresource.name = resource.name;
		updateresource.servicename = resource.servicename;
		updateresource.weight = resource.weight;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, gslbvserver_gslbservice_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver_gslbservice_binding updateresources[] = new gslbvserver_gslbservice_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new gslbvserver_gslbservice_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].weight = resources[i].weight;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, gslbvserver_gslbservice_binding resource) throws Exception {
		gslbvserver_gslbservice_binding deleteresource = new gslbvserver_gslbservice_binding();
		deleteresource.name = resource.name;
		deleteresource.servicename = resource.servicename;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, gslbvserver_gslbservice_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver_gslbservice_binding deleteresources[] = new gslbvserver_gslbservice_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new gslbvserver_gslbservice_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].servicename = resources[i].servicename;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch gslbvserver_gslbservice_binding resources of given name .
	*/
	public static gslbvserver_gslbservice_binding[] get(nitro_service service, String name) throws Exception{
		gslbvserver_gslbservice_binding obj = new gslbvserver_gslbservice_binding();
		obj.set_name(name);
		gslbvserver_gslbservice_binding response[] = (gslbvserver_gslbservice_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbvserver_gslbservice_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static gslbvserver_gslbservice_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		gslbvserver_gslbservice_binding obj = new gslbvserver_gslbservice_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		gslbvserver_gslbservice_binding[] response = (gslbvserver_gslbservice_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbvserver_gslbservice_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static gslbvserver_gslbservice_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		gslbvserver_gslbservice_binding obj = new gslbvserver_gslbservice_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		gslbvserver_gslbservice_binding[] response = (gslbvserver_gslbservice_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count gslbvserver_gslbservice_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		gslbvserver_gslbservice_binding obj = new gslbvserver_gslbservice_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		gslbvserver_gslbservice_binding response[] = (gslbvserver_gslbservice_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbvserver_gslbservice_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		gslbvserver_gslbservice_binding obj = new gslbvserver_gslbservice_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbvserver_gslbservice_binding[] response = (gslbvserver_gslbservice_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbvserver_gslbservice_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		gslbvserver_gslbservice_binding obj = new gslbvserver_gslbservice_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbvserver_gslbservice_binding[] response = (gslbvserver_gslbservice_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class servicetypeEnum {
		public static final String HTTP = "HTTP";
		public static final String FTP = "FTP";
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
		public static final String SSL = "SSL";
		public static final String SSL_BRIDGE = "SSL_BRIDGE";
		public static final String SSL_TCP = "SSL_TCP";
		public static final String NNTP = "NNTP";
		public static final String ANY = "ANY";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String RTSP = "RTSP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
	}
	public static class svreffgslbstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
	}
	public static class iscnameEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
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

}