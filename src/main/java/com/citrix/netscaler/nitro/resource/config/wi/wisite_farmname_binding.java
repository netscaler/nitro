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

package com.citrix.netscaler.nitro.resource.config.wi;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class wisite_farmname_binding_response extends base_response
{
	public wisite_farmname_binding[] wisite_farmname_binding;
}
/**
	* Binding class showing the farmname that can be bound to wisite.
	*/

public class wisite_farmname_binding extends base_resource
{
	private String farmname;
	private String xmlserveraddresses;
	private Long xmlport;
	private String transport;
	private Long sslrelayport;
	private String loadbalance;
	private String groups;
	private String recoveryfarm;
	private String sitepath;
	private Long __count;

	/**
	* <pre>
	* Path to the Web Interface site.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public void set_sitepath(String sitepath) throws Exception{
		this.sitepath = sitepath;
	}

	/**
	* <pre>
	* Path to the Web Interface site.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public String get_sitepath() throws Exception {
		return this.sitepath;
	}

	/**
	* <pre>
	* Active Directory groups that are permitted to enumerate resources from server farms. Including a setting for this parameter activates the user roaming feature. A maximum of 512 user groups can be specified for each farm defined with the Farm<n> parameter.  The groups must be comma separated.
	* </pre>
	*/
	public void set_groups(String groups) throws Exception{
		this.groups = groups;
	}

	/**
	* <pre>
	* Active Directory groups that are permitted to enumerate resources from server farms. Including a setting for this parameter activates the user roaming feature. A maximum of 512 user groups can be specified for each farm defined with the Farm<n> parameter.  The groups must be comma separated.
	* </pre>
	*/
	public String get_groups() throws Exception {
		return this.groups;
	}

	/**
	* <pre>
	* Port number at which to contact the XML service.
	* </pre>
	*/
	public void set_xmlport(long xmlport) throws Exception {
		this.xmlport = new Long(xmlport);
	}

	/**
	* <pre>
	* Port number at which to contact the XML service.
	* </pre>
	*/
	public void set_xmlport(Long xmlport) throws Exception{
		this.xmlport = xmlport;
	}

	/**
	* <pre>
	* Port number at which to contact the XML service.
	* </pre>
	*/
	public Long get_xmlport() throws Exception {
		return this.xmlport;
	}

	/**
	* <pre>
	* Transport protocol to use for transferring data, related to the Web Interface site, between the NetScaler appliance and the XML service.<br> Possible values = HTTP, HTTPS, SSLRELAY
	* </pre>
	*/
	public void set_transport(String transport) throws Exception{
		this.transport = transport;
	}

	/**
	* <pre>
	* Transport protocol to use for transferring data, related to the Web Interface site, between the NetScaler appliance and the XML service.<br> Possible values = HTTP, HTTPS, SSLRELAY
	* </pre>
	*/
	public String get_transport() throws Exception {
		return this.transport;
	}

	/**
	* <pre>
	* TCP port at which the XenApp or XenDesktop servers listenfor SSL Relay traffic from the NetScaler appliance. This parameter is required if you have set SSL Relay as the transport protocol. 
            Web Interface uses root certificates when authenticating a server running SSL Relay. Make sure that all the servers running SSL Relay are configured to listen on the same port.
	* </pre>
	*/
	public void set_sslrelayport(long sslrelayport) throws Exception {
		this.sslrelayport = new Long(sslrelayport);
	}

	/**
	* <pre>
	* TCP port at which the XenApp or XenDesktop servers listenfor SSL Relay traffic from the NetScaler appliance. This parameter is required if you have set SSL Relay as the transport protocol. 
            Web Interface uses root certificates when authenticating a server running SSL Relay. Make sure that all the servers running SSL Relay are configured to listen on the same port.
	* </pre>
	*/
	public void set_sslrelayport(Long sslrelayport) throws Exception{
		this.sslrelayport = sslrelayport;
	}

	/**
	* <pre>
	* TCP port at which the XenApp or XenDesktop servers listenfor SSL Relay traffic from the NetScaler appliance. This parameter is required if you have set SSL Relay as the transport protocol. 
            Web Interface uses root certificates when authenticating a server running SSL Relay. Make sure that all the servers running SSL Relay are configured to listen on the same port.
	* </pre>
	*/
	public Long get_sslrelayport() throws Exception {
		return this.sslrelayport;
	}

	/**
	* <pre>
	* Name for the logical representation of a XenApp or XenDesktop farm to be bound to the Web Interface site. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
	* </pre>
	*/
	public void set_farmname(String farmname) throws Exception{
		this.farmname = farmname;
	}

	/**
	* <pre>
	* Name for the logical representation of a XenApp or XenDesktop farm to be bound to the Web Interface site. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
	* </pre>
	*/
	public String get_farmname() throws Exception {
		return this.farmname;
	}

	/**
	* <pre>
	* Use all the XML servers (load balancing mode) or only one server (failover mode).<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_loadbalance(String loadbalance) throws Exception{
		this.loadbalance = loadbalance;
	}

	/**
	* <pre>
	* Use all the XML servers (load balancing mode) or only one server (failover mode).<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_loadbalance() throws Exception {
		return this.loadbalance;
	}

	/**
	* <pre>
	* Binded farm is set as a recovery farm.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_recoveryfarm(String recoveryfarm) throws Exception{
		this.recoveryfarm = recoveryfarm;
	}

	/**
	* <pre>
	* Binded farm is set as a recovery farm.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_recoveryfarm() throws Exception {
		return this.recoveryfarm;
	}

	/**
	* <pre>
	* Comma-separated IP addresses or host names of XenApp or XenDesktop servers providing XML services.
	* </pre>
	*/
	public void set_xmlserveraddresses(String xmlserveraddresses) throws Exception{
		this.xmlserveraddresses = xmlserveraddresses;
	}

	/**
	* <pre>
	* Comma-separated IP addresses or host names of XenApp or XenDesktop servers providing XML services.
	* </pre>
	*/
	public String get_xmlserveraddresses() throws Exception {
		return this.xmlserveraddresses;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		wisite_farmname_binding_response result = (wisite_farmname_binding_response) service.get_payload_formatter().string_to_resource(wisite_farmname_binding_response.class, response);
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
		return result.wisite_farmname_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitepath;
	}

	public static base_response add(nitro_service client, wisite_farmname_binding resource) throws Exception {
		wisite_farmname_binding updateresource = new wisite_farmname_binding();
		updateresource.sitepath = resource.sitepath;
		updateresource.farmname = resource.farmname;
		updateresource.xmlserveraddresses = resource.xmlserveraddresses;
		updateresource.groups = resource.groups;
		updateresource.recoveryfarm = resource.recoveryfarm;
		updateresource.xmlport = resource.xmlport;
		updateresource.transport = resource.transport;
		updateresource.sslrelayport = resource.sslrelayport;
		updateresource.loadbalance = resource.loadbalance;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, wisite_farmname_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite_farmname_binding updateresources[] = new wisite_farmname_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new wisite_farmname_binding();
				updateresources[i].sitepath = resources[i].sitepath;
				updateresources[i].farmname = resources[i].farmname;
				updateresources[i].xmlserveraddresses = resources[i].xmlserveraddresses;
				updateresources[i].groups = resources[i].groups;
				updateresources[i].recoveryfarm = resources[i].recoveryfarm;
				updateresources[i].xmlport = resources[i].xmlport;
				updateresources[i].transport = resources[i].transport;
				updateresources[i].sslrelayport = resources[i].sslrelayport;
				updateresources[i].loadbalance = resources[i].loadbalance;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, wisite_farmname_binding resource) throws Exception {
		wisite_farmname_binding deleteresource = new wisite_farmname_binding();
		deleteresource.sitepath = resource.sitepath;
		deleteresource.farmname = resource.farmname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, wisite_farmname_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite_farmname_binding deleteresources[] = new wisite_farmname_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new wisite_farmname_binding();
				deleteresources[i].sitepath = resources[i].sitepath;
				deleteresources[i].farmname = resources[i].farmname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch wisite_farmname_binding resources of given name .
	*/
	public static wisite_farmname_binding[] get(nitro_service service, String sitepath) throws Exception{
		wisite_farmname_binding obj = new wisite_farmname_binding();
		obj.set_sitepath(sitepath);
		wisite_farmname_binding response[] = (wisite_farmname_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of wisite_farmname_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static wisite_farmname_binding[] get_filtered(nitro_service service, String sitepath, String filter) throws Exception{
		wisite_farmname_binding obj = new wisite_farmname_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_filter(filter);
		wisite_farmname_binding[] response = (wisite_farmname_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of wisite_farmname_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static wisite_farmname_binding[] get_filtered(nitro_service service, String sitepath, filtervalue[] filter) throws Exception{
		wisite_farmname_binding obj = new wisite_farmname_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_filter(filter);
		wisite_farmname_binding[] response = (wisite_farmname_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count wisite_farmname_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String sitepath) throws Exception{
		wisite_farmname_binding obj = new wisite_farmname_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		wisite_farmname_binding response[] = (wisite_farmname_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of wisite_farmname_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String sitepath, String filter) throws Exception{
		wisite_farmname_binding obj = new wisite_farmname_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		wisite_farmname_binding[] response = (wisite_farmname_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of wisite_farmname_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String sitepath, filtervalue[] filter) throws Exception{
		wisite_farmname_binding obj = new wisite_farmname_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		wisite_farmname_binding[] response = (wisite_farmname_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class accessmethodEnum {
		public static final String Direct = "Direct";
		public static final String Alternate = "Alternate";
		public static final String Translated = "Translated";
		public static final String GatewayDirect = "GatewayDirect";
		public static final String GatewayAlternate = "GatewayAlternate";
		public static final String GatewayTranslated = "GatewayTranslated";
	}
	public static class accesstypeEnum {
		public static final String UserDevice = "UserDevice";
		public static final String Gateway = "Gateway";
		public static final String UserDeviceAndGateway = "UserDeviceAndGateway";
	}
	public static class transportEnum {
		public static final String HTTP = "HTTP";
		public static final String HTTPS = "HTTPS";
		public static final String SSLRELAY = "SSLRELAY";
	}
	public static class loadbalanceEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class recoveryfarmEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}

}