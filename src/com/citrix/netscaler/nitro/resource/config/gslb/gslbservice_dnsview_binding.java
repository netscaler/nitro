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

class gslbservice_dnsview_binding_response extends base_response
{
	public gslbservice_dnsview_binding[] gslbservice_dnsview_binding;
}
/**
	* Binding class showing the dnsview that can be bound to gslbservice.
	*/

public class gslbservice_dnsview_binding extends base_resource
{
	private String viewname;
	private String viewip;
	private String servicename;
	private Long __count;

	/**
	* <pre>
	* The name of view for the given IP.<br> Minimum length =  1
	* </pre>
	*/
	public void set_viewname(String viewname) throws Exception{
		this.viewname = viewname;
	}

	/**
	* <pre>
	* The name of view for the given IP.<br> Minimum length =  1
	* </pre>
	*/
	public String get_viewname() throws Exception {
		return this.viewname;
	}

	/**
	* <pre>
	* The name of the gslb service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the gslb service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* IP address to be used for the given view.
	* </pre>
	*/
	public void set_viewip(String viewip) throws Exception{
		this.viewip = viewip;
	}

	/**
	* <pre>
	* IP address to be used for the given view.
	* </pre>
	*/
	public String get_viewip() throws Exception {
		return this.viewip;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbservice_dnsview_binding_response result = (gslbservice_dnsview_binding_response) service.get_payload_formatter().string_to_resource(gslbservice_dnsview_binding_response.class, response);
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
		return result.gslbservice_dnsview_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicename;
	}

	public static base_response add(nitro_service client, gslbservice_dnsview_binding resource) throws Exception {
		gslbservice_dnsview_binding updateresource = new gslbservice_dnsview_binding();
		updateresource.servicename = resource.servicename;
		updateresource.viewname = resource.viewname;
		updateresource.viewip = resource.viewip;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, gslbservice_dnsview_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbservice_dnsview_binding updateresources[] = new gslbservice_dnsview_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new gslbservice_dnsview_binding();
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].viewname = resources[i].viewname;
				updateresources[i].viewip = resources[i].viewip;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, gslbservice_dnsview_binding resource) throws Exception {
		gslbservice_dnsview_binding deleteresource = new gslbservice_dnsview_binding();
		deleteresource.servicename = resource.servicename;
		deleteresource.viewname = resource.viewname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, gslbservice_dnsview_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbservice_dnsview_binding deleteresources[] = new gslbservice_dnsview_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new gslbservice_dnsview_binding();
				deleteresources[i].servicename = resources[i].servicename;
				deleteresources[i].viewname = resources[i].viewname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch gslbservice_dnsview_binding resources of given name .
	*/
	public static gslbservice_dnsview_binding[] get(nitro_service service, String servicename) throws Exception{
		gslbservice_dnsview_binding obj = new gslbservice_dnsview_binding();
		obj.set_servicename(servicename);
		gslbservice_dnsview_binding response[] = (gslbservice_dnsview_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbservice_dnsview_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static gslbservice_dnsview_binding[] get_filtered(nitro_service service, String servicename, String filter) throws Exception{
		gslbservice_dnsview_binding obj = new gslbservice_dnsview_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_filter(filter);
		gslbservice_dnsview_binding[] response = (gslbservice_dnsview_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbservice_dnsview_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static gslbservice_dnsview_binding[] get_filtered(nitro_service service, String servicename, filtervalue[] filter) throws Exception{
		gslbservice_dnsview_binding obj = new gslbservice_dnsview_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_filter(filter);
		gslbservice_dnsview_binding[] response = (gslbservice_dnsview_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count gslbservice_dnsview_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String servicename) throws Exception{
		gslbservice_dnsview_binding obj = new gslbservice_dnsview_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		gslbservice_dnsview_binding response[] = (gslbservice_dnsview_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbservice_dnsview_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String servicename, String filter) throws Exception{
		gslbservice_dnsview_binding obj = new gslbservice_dnsview_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbservice_dnsview_binding[] response = (gslbservice_dnsview_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbservice_dnsview_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String servicename, filtervalue[] filter) throws Exception{
		gslbservice_dnsview_binding obj = new gslbservice_dnsview_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbservice_dnsview_binding[] response = (gslbservice_dnsview_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class monstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}