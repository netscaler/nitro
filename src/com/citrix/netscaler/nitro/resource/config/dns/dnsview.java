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

class dnsview_response extends base_response
{
	public dnsview[] dnsview;
}
/**
* Configuration for DNS view resource.
*/

public class dnsview extends base_resource
{
	private String viewname;

	//------- Read only Parameter ---------;

	private String servicename;
	private Long flags;
	private Long __count;

	/**
	* <pre>
	* Name of the view name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_viewname(String viewname) throws Exception{
		this.viewname = viewname;
	}

	/**
	* <pre>
	* Name of the view name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_viewname() throws Exception {
		return this.viewname;
	}

	/**
	* <pre>
	* Service name of the service using this view.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
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
		dnsview_response result = (dnsview_response) service.get_payload_formatter().string_to_resource(dnsview_response.class, response);
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
		return result.dnsview;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.viewname;
	}

	/**
	* Use this API to add dnsview.
	*/
	public static base_response add(nitro_service client, dnsview resource) throws Exception {
		dnsview addresource = new dnsview();
		addresource.viewname = resource.viewname;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsview resources.
	*/
	public static base_responses add(nitro_service client, dnsview resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsview addresources[] = new dnsview[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsview();
				addresources[i].viewname = resources[i].viewname;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsview of given name.
	*/
	public static base_response delete(nitro_service client, String viewname) throws Exception {
		dnsview deleteresource = new dnsview();
		deleteresource.viewname = viewname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsview.
	*/
	public static base_response delete(nitro_service client, dnsview resource) throws Exception {
		dnsview deleteresource = new dnsview();
		deleteresource.viewname = resource.viewname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsview resources of given names.
	*/
	public static base_responses delete(nitro_service client, String viewname[]) throws Exception {
		base_responses result = null;
		if (viewname != null && viewname.length > 0) {
			dnsview deleteresources[] = new dnsview[viewname.length];
			for (int i=0;i<viewname.length;i++){
				deleteresources[i] = new dnsview();
				deleteresources[i].viewname = viewname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsview resources.
	*/
	public static base_responses delete(nitro_service client, dnsview resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsview deleteresources[] = new dnsview[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsview();
				deleteresources[i].viewname = resources[i].viewname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsview resources that are configured on netscaler.
	*/
	public static dnsview[] get(nitro_service service) throws Exception{
		dnsview obj = new dnsview();
		dnsview[] response = (dnsview[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsview resources that are configured on netscaler.
	*/
	public static dnsview[] get(nitro_service service, options option) throws Exception{
		dnsview obj = new dnsview();
		dnsview[] response = (dnsview[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dnsview resource of given name .
	*/
	public static dnsview get(nitro_service service, String viewname) throws Exception{
		dnsview obj = new dnsview();
		obj.set_viewname(viewname);
		dnsview response = (dnsview) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsview resources of given names .
	*/
	public static dnsview[] get(nitro_service service, String viewname[]) throws Exception{
		if (viewname !=null && viewname.length>0) {
			dnsview response[] = new dnsview[viewname.length];
			dnsview obj[] = new dnsview[viewname.length];
			for (int i=0;i<viewname.length;i++) {
				obj[i] = new dnsview();
				obj[i].set_viewname(viewname[i]);
				response[i] = (dnsview) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsview resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsview[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsview obj = new dnsview();
		options option = new options();
		option.set_filter(filter);
		dnsview[] response = (dnsview[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsview resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsview[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsview obj = new dnsview();
		options option = new options();
		option.set_filter(filter);
		dnsview[] response = (dnsview[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsview resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsview obj = new dnsview();
		options option = new options();
		option.set_count(true);
		dnsview[] response = (dnsview[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsview resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsview obj = new dnsview();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsview[] response = (dnsview[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsview resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsview obj = new dnsview();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsview[] response = (dnsview[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
