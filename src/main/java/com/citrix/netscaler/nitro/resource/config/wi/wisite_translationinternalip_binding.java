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

class wisite_translationinternalip_binding_response extends base_response
{
	public wisite_translationinternalip_binding[] wisite_translationinternalip_binding;
}
/**
	* Binding class showing the translationinternalip that can be bound to wisite.
	*/

public class wisite_translationinternalip_binding extends base_resource
{
	private String translationinternalip;
	private String accesstype;
	private Integer translationinternalport;
	private String translationexternalip;
	private Integer translationexternalport;
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
	* Type of access to the XenApp or XenDesktop server. 
                            Available settings function as follows:
                            * User Device - Clients can use the translated address of the mapping entry to connect to the XenApp or XenDesktop server.
                            * Gateway - Access Gateway can use the translated address of the mapping entry to connect to the XenApp or XenDesktop server.
                            * User Device and Gateway - Both clients and Access Gateway can use the translated address of the mapping entry to connect to the XenApp or XenDesktop server.<br> Default value: UserDevice<br> Possible values = UserDevice, Gateway, UserDeviceAndGateway
	* </pre>
	*/
	public void set_accesstype(String accesstype) throws Exception{
		this.accesstype = accesstype;
	}

	/**
	* <pre>
	* Type of access to the XenApp or XenDesktop server. 
                            Available settings function as follows:
                            * User Device - Clients can use the translated address of the mapping entry to connect to the XenApp or XenDesktop server.
                            * Gateway - Access Gateway can use the translated address of the mapping entry to connect to the XenApp or XenDesktop server.
                            * User Device and Gateway - Both clients and Access Gateway can use the translated address of the mapping entry to connect to the XenApp or XenDesktop server.<br> Default value: UserDevice<br> Possible values = UserDevice, Gateway, UserDeviceAndGateway
	* </pre>
	*/
	public String get_accesstype() throws Exception {
		return this.accesstype;
	}

	/**
	* <pre>
	* External port number associated with the server's port number.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_translationexternalport(int translationexternalport) throws Exception {
		this.translationexternalport = new Integer(translationexternalport);
	}

	/**
	* <pre>
	* External port number associated with the server's port number.<br> Range 1 - 65535
	* </pre>
	*/
	public void set_translationexternalport(Integer translationexternalport) throws Exception{
		this.translationexternalport = translationexternalport;
	}

	/**
	* <pre>
	* External port number associated with the server's port number.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_translationexternalport() throws Exception {
		return this.translationexternalport;
	}

	/**
	* <pre>
	* IP address of the server for which you want to associate an external IP address. (Clients access the server through the associated external address and port.).
	* </pre>
	*/
	public void set_translationinternalip(String translationinternalip) throws Exception{
		this.translationinternalip = translationinternalip;
	}

	/**
	* <pre>
	* IP address of the server for which you want to associate an external IP address. (Clients access the server through the associated external address and port.).
	* </pre>
	*/
	public String get_translationinternalip() throws Exception {
		return this.translationinternalip;
	}

	/**
	* <pre>
	* External IP address associated with server's IP address.
	* </pre>
	*/
	public void set_translationexternalip(String translationexternalip) throws Exception{
		this.translationexternalip = translationexternalip;
	}

	/**
	* <pre>
	* External IP address associated with server's IP address.
	* </pre>
	*/
	public String get_translationexternalip() throws Exception {
		return this.translationexternalip;
	}

	/**
	* <pre>
	* Port number of the server for which you want to associate an external port.  (Clients access the server through the associated external address and port.).<br> Range 1 - 65535
	* </pre>
	*/
	public void set_translationinternalport(int translationinternalport) throws Exception {
		this.translationinternalport = new Integer(translationinternalport);
	}

	/**
	* <pre>
	* Port number of the server for which you want to associate an external port.  (Clients access the server through the associated external address and port.).<br> Range 1 - 65535
	* </pre>
	*/
	public void set_translationinternalport(Integer translationinternalport) throws Exception{
		this.translationinternalport = translationinternalport;
	}

	/**
	* <pre>
	* Port number of the server for which you want to associate an external port.  (Clients access the server through the associated external address and port.).<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_translationinternalport() throws Exception {
		return this.translationinternalport;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		wisite_translationinternalip_binding_response result = (wisite_translationinternalip_binding_response) service.get_payload_formatter().string_to_resource(wisite_translationinternalip_binding_response.class, response);
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
		return result.wisite_translationinternalip_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitepath;
	}

	public static base_response add(nitro_service client, wisite_translationinternalip_binding resource) throws Exception {
		wisite_translationinternalip_binding updateresource = new wisite_translationinternalip_binding();
		updateresource.sitepath = resource.sitepath;
		updateresource.translationinternalip = resource.translationinternalip;
		updateresource.translationinternalport = resource.translationinternalport;
		updateresource.translationexternalip = resource.translationexternalip;
		updateresource.translationexternalport = resource.translationexternalport;
		updateresource.accesstype = resource.accesstype;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, wisite_translationinternalip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite_translationinternalip_binding updateresources[] = new wisite_translationinternalip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new wisite_translationinternalip_binding();
				updateresources[i].sitepath = resources[i].sitepath;
				updateresources[i].translationinternalip = resources[i].translationinternalip;
				updateresources[i].translationinternalport = resources[i].translationinternalport;
				updateresources[i].translationexternalip = resources[i].translationexternalip;
				updateresources[i].translationexternalport = resources[i].translationexternalport;
				updateresources[i].accesstype = resources[i].accesstype;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, wisite_translationinternalip_binding resource) throws Exception {
		wisite_translationinternalip_binding deleteresource = new wisite_translationinternalip_binding();
		deleteresource.sitepath = resource.sitepath;
		deleteresource.translationinternalip = resource.translationinternalip;
		deleteresource.translationinternalport = resource.translationinternalport;
		deleteresource.translationexternalip = resource.translationexternalip;
		deleteresource.translationexternalport = resource.translationexternalport;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, wisite_translationinternalip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite_translationinternalip_binding deleteresources[] = new wisite_translationinternalip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new wisite_translationinternalip_binding();
				deleteresources[i].sitepath = resources[i].sitepath;
				deleteresources[i].translationinternalip = resources[i].translationinternalip;
				deleteresources[i].translationinternalport = resources[i].translationinternalport;
				deleteresources[i].translationexternalip = resources[i].translationexternalip;
				deleteresources[i].translationexternalport = resources[i].translationexternalport;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch wisite_translationinternalip_binding resources of given name .
	*/
	public static wisite_translationinternalip_binding[] get(nitro_service service, String sitepath) throws Exception{
		wisite_translationinternalip_binding obj = new wisite_translationinternalip_binding();
		obj.set_sitepath(sitepath);
		wisite_translationinternalip_binding response[] = (wisite_translationinternalip_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of wisite_translationinternalip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static wisite_translationinternalip_binding[] get_filtered(nitro_service service, String sitepath, String filter) throws Exception{
		wisite_translationinternalip_binding obj = new wisite_translationinternalip_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_filter(filter);
		wisite_translationinternalip_binding[] response = (wisite_translationinternalip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of wisite_translationinternalip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static wisite_translationinternalip_binding[] get_filtered(nitro_service service, String sitepath, filtervalue[] filter) throws Exception{
		wisite_translationinternalip_binding obj = new wisite_translationinternalip_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_filter(filter);
		wisite_translationinternalip_binding[] response = (wisite_translationinternalip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count wisite_translationinternalip_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String sitepath) throws Exception{
		wisite_translationinternalip_binding obj = new wisite_translationinternalip_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		wisite_translationinternalip_binding response[] = (wisite_translationinternalip_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of wisite_translationinternalip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String sitepath, String filter) throws Exception{
		wisite_translationinternalip_binding obj = new wisite_translationinternalip_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		wisite_translationinternalip_binding[] response = (wisite_translationinternalip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of wisite_translationinternalip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String sitepath, filtervalue[] filter) throws Exception{
		wisite_translationinternalip_binding obj = new wisite_translationinternalip_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		wisite_translationinternalip_binding[] response = (wisite_translationinternalip_binding[]) obj.getfiltered(service, option);
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