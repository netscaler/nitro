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

class wisite_accessmethod_binding_response extends base_response
{
	public wisite_accessmethod_binding[] wisite_accessmethod_binding;
}
/**
	* Binding class showing the accessmethod that can be bound to wisite.
	*/

public class wisite_accessmethod_binding extends base_resource
{
	private String accessmethod;
	private String clientipaddress;
	private String clientnetmask;
	private String sitepath;
	private Long __count;

	/**
	* <pre>
	* Client's Ip Address.
	* </pre>
	*/
	public void set_clientipaddress(String clientipaddress) throws Exception{
		this.clientipaddress = clientipaddress;
	}

	/**
	* <pre>
	* Client's Ip Address.
	* </pre>
	*/
	public String get_clientipaddress() throws Exception {
		return this.clientipaddress;
	}

	/**
	* <pre>
	* client NetMask.
	* </pre>
	*/
	public void set_clientnetmask(String clientnetmask) throws Exception{
		this.clientnetmask = clientnetmask;
	}

	/**
	* <pre>
	* client NetMask.
	* </pre>
	*/
	public String get_clientnetmask() throws Exception {
		return this.clientnetmask;
	}

	/**
	* <pre>
	* secure access method to be applied for client ip range.<br> Possible values = Direct, Alternate, Translated, GatewayDirect, GatewayAlternate, GatewayTranslated
	* </pre>
	*/
	public void set_accessmethod(String accessmethod) throws Exception{
		this.accessmethod = accessmethod;
	}

	/**
	* <pre>
	* secure access method to be applied for client ip range.<br> Possible values = Direct, Alternate, Translated, GatewayDirect, GatewayAlternate, GatewayTranslated
	* </pre>
	*/
	public String get_accessmethod() throws Exception {
		return this.accessmethod;
	}

	/**
	* <pre>
	* The path of Web Interface site.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public void set_sitepath(String sitepath) throws Exception{
		this.sitepath = sitepath;
	}

	/**
	* <pre>
	* The path of Web Interface site.<br> Minimum length =  1<br> Maximum length =  250
	* </pre>
	*/
	public String get_sitepath() throws Exception {
		return this.sitepath;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		wisite_accessmethod_binding_response result = (wisite_accessmethod_binding_response) service.get_payload_formatter().string_to_resource(wisite_accessmethod_binding_response.class, response);
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
		return result.wisite_accessmethod_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitepath;
	}

	public static base_response add(nitro_service client, wisite_accessmethod_binding resource) throws Exception {
		wisite_accessmethod_binding updateresource = new wisite_accessmethod_binding();
		updateresource.sitepath = resource.sitepath;
		updateresource.accessmethod = resource.accessmethod;
		updateresource.clientipaddress = resource.clientipaddress;
		updateresource.clientnetmask = resource.clientnetmask;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, wisite_accessmethod_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite_accessmethod_binding updateresources[] = new wisite_accessmethod_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new wisite_accessmethod_binding();
				updateresources[i].sitepath = resources[i].sitepath;
				updateresources[i].accessmethod = resources[i].accessmethod;
				updateresources[i].clientipaddress = resources[i].clientipaddress;
				updateresources[i].clientnetmask = resources[i].clientnetmask;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, wisite_accessmethod_binding resource) throws Exception {
		wisite_accessmethod_binding deleteresource = new wisite_accessmethod_binding();
		deleteresource.sitepath = resource.sitepath;
		deleteresource.clientipaddress = resource.clientipaddress;
		deleteresource.clientnetmask = resource.clientnetmask;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, wisite_accessmethod_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			wisite_accessmethod_binding deleteresources[] = new wisite_accessmethod_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new wisite_accessmethod_binding();
				deleteresources[i].sitepath = resources[i].sitepath;
				deleteresources[i].clientipaddress = resources[i].clientipaddress;
				deleteresources[i].clientnetmask = resources[i].clientnetmask;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch wisite_accessmethod_binding resources of given name .
	*/
	public static wisite_accessmethod_binding[] get(nitro_service service, String sitepath) throws Exception{
		wisite_accessmethod_binding obj = new wisite_accessmethod_binding();
		obj.set_sitepath(sitepath);
		wisite_accessmethod_binding response[] = (wisite_accessmethod_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of wisite_accessmethod_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static wisite_accessmethod_binding[] get_filtered(nitro_service service, String sitepath, String filter) throws Exception{
		wisite_accessmethod_binding obj = new wisite_accessmethod_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_filter(filter);
		wisite_accessmethod_binding[] response = (wisite_accessmethod_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of wisite_accessmethod_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static wisite_accessmethod_binding[] get_filtered(nitro_service service, String sitepath, filtervalue[] filter) throws Exception{
		wisite_accessmethod_binding obj = new wisite_accessmethod_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_filter(filter);
		wisite_accessmethod_binding[] response = (wisite_accessmethod_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count wisite_accessmethod_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String sitepath) throws Exception{
		wisite_accessmethod_binding obj = new wisite_accessmethod_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		wisite_accessmethod_binding response[] = (wisite_accessmethod_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of wisite_accessmethod_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String sitepath, String filter) throws Exception{
		wisite_accessmethod_binding obj = new wisite_accessmethod_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		wisite_accessmethod_binding[] response = (wisite_accessmethod_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of wisite_accessmethod_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String sitepath, filtervalue[] filter) throws Exception{
		wisite_accessmethod_binding obj = new wisite_accessmethod_binding();
		obj.set_sitepath(sitepath);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		wisite_accessmethod_binding[] response = (wisite_accessmethod_binding[]) obj.getfiltered(service, option);
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

}