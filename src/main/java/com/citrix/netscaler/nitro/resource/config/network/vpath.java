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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpath_response extends base_response
{
	public vpath[] vpath;
}
/**
* Configuration for Vpath resource.
*/

public class vpath extends base_resource
{
	private String name;
	private String destip;
	private String encapmode;
	private Long __count;

	/**
	* <pre>
	* Name for the vpath. Must begin with a letter, number, or the underscore character (_), and can consist of letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore characters. Cannot be changed after the profile is created. Choose a name that helps identify the net profile.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the vpath. Must begin with a letter, number, or the underscore character (_), and can consist of letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore characters. Cannot be changed after the profile is created. Choose a name that helps identify the net profile.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The IP address assigned to the VLAN.
	* </pre>
	*/
	public void set_destip(String destip) throws Exception{
		this.destip = destip;
	}

	/**
	* <pre>
	* The IP address assigned to the VLAN.
	* </pre>
	*/
	public String get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* Encapsulation mode (L2/L3).<br> Possible values = L2, L3, DISABLE
	* </pre>
	*/
	public void set_encapmode(String encapmode) throws Exception{
		this.encapmode = encapmode;
	}

	/**
	* <pre>
	* Encapsulation mode (L2/L3).<br> Possible values = L2, L3, DISABLE
	* </pre>
	*/
	public String get_encapmode() throws Exception {
		return this.encapmode;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpath_response result = (vpath_response) service.get_payload_formatter().string_to_resource(vpath_response.class, response);
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
		return result.vpath;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add vpath.
	*/
	public static base_response add(nitro_service client, vpath resource) throws Exception {
		vpath addresource = new vpath();
		addresource.name = resource.name;
		addresource.destip = resource.destip;
		addresource.encapmode = resource.encapmode;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpath resources.
	*/
	public static base_responses add(nitro_service client, vpath resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpath addresources[] = new vpath[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpath();
				addresources[i].name = resources[i].name;
				addresources[i].destip = resources[i].destip;
				addresources[i].encapmode = resources[i].encapmode;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpath of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpath deleteresource = new vpath();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpath.
	*/
	public static base_response delete(nitro_service client, vpath resource) throws Exception {
		vpath deleteresource = new vpath();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpath resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpath deleteresources[] = new vpath[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpath();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpath resources.
	*/
	public static base_responses delete(nitro_service client, vpath resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpath deleteresources[] = new vpath[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpath();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpath resources that are configured on netscaler.
	*/
	public static vpath[] get(nitro_service service) throws Exception{
		vpath obj = new vpath();
		vpath[] response = (vpath[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpath resources that are configured on netscaler.
	*/
	public static vpath[] get(nitro_service service, options option) throws Exception{
		vpath obj = new vpath();
		vpath[] response = (vpath[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpath resource of given name .
	*/
	public static vpath get(nitro_service service, String name) throws Exception{
		vpath obj = new vpath();
		obj.set_name(name);
		vpath response = (vpath) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpath resources of given names .
	*/
	public static vpath[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpath response[] = new vpath[name.length];
			vpath obj[] = new vpath[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpath();
				obj[i].set_name(name[i]);
				response[i] = (vpath) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpath resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpath[] get_filtered(nitro_service service, String filter) throws Exception{
		vpath obj = new vpath();
		options option = new options();
		option.set_filter(filter);
		vpath[] response = (vpath[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpath resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpath[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpath obj = new vpath();
		options option = new options();
		option.set_filter(filter);
		vpath[] response = (vpath[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpath resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpath obj = new vpath();
		options option = new options();
		option.set_count(true);
		vpath[] response = (vpath[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpath resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpath obj = new vpath();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpath[] response = (vpath[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpath resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpath obj = new vpath();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpath[] response = (vpath[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class encapmodeEnum {
		public static final String L2 = "L2";
		public static final String L3 = "L3";
		public static final String DISABLE = "DISABLE";
	}
}
