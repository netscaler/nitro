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

package com.citrix.netscaler.nitro.resource.config.policy;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class policymap_response extends base_response
{
	public policymap[] policymap;
}
/**
* Configuration for map policy resource.
*/

public class policymap extends base_resource
{
	private String mappolicyname;
	private String sd;
	private String su;
	private String td;
	private String tu;

	//------- Read only Parameter ---------;

	private String targetname;
	private Long __count;

	/**
	* <pre>
	* Name for the map policy. Must begin with a letter, number, or the underscore (_) character and must consist only of letters, numbers, and the hash (#), period (.), colon (:), space ( ), at (@), equals (=), hyphen (-), and underscore (_) characters.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my map" or 'my map').<br> Minimum length =  1
	* </pre>
	*/
	public void set_mappolicyname(String mappolicyname) throws Exception{
		this.mappolicyname = mappolicyname;
	}

	/**
	* <pre>
	* Name for the map policy. Must begin with a letter, number, or the underscore (_) character and must consist only of letters, numbers, and the hash (#), period (.), colon (:), space ( ), at (@), equals (=), hyphen (-), and underscore (_) characters.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my map" or 'my map').<br> Minimum length =  1
	* </pre>
	*/
	public String get_mappolicyname() throws Exception {
		return this.mappolicyname;
	}

	/**
	* <pre>
	* Publicly known source domain name. This is the domain name with which a client request arrives at a reverse proxy virtual server for cache redirection. If you specify a source domain, you must specify a target domain.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sd(String sd) throws Exception{
		this.sd = sd;
	}

	/**
	* <pre>
	* Publicly known source domain name. This is the domain name with which a client request arrives at a reverse proxy virtual server for cache redirection. If you specify a source domain, you must specify a target domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sd() throws Exception {
		return this.sd;
	}

	/**
	* <pre>
	* Source URL. Specify all or part of the source URL, in the following format: /[[prefix] [*]] [.suffix].<br> Minimum length =  1
	* </pre>
	*/
	public void set_su(String su) throws Exception{
		this.su = su;
	}

	/**
	* <pre>
	* Source URL. Specify all or part of the source URL, in the following format: /[[prefix] [*]] [.suffix].<br> Minimum length =  1
	* </pre>
	*/
	public String get_su() throws Exception {
		return this.su;
	}

	/**
	* <pre>
	* Target domain name sent to the server. The source domain name is replaced with this domain name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_td(String td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Target domain name sent to the server. The source domain name is replaced with this domain name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* Target URL. Specify the target URL in the following format: /[[prefix] [*]][.suffix].<br> Minimum length =  1
	* </pre>
	*/
	public void set_tu(String tu) throws Exception{
		this.tu = tu;
	}

	/**
	* <pre>
	* Target URL. Specify the target URL in the following format: /[[prefix] [*]][.suffix].<br> Minimum length =  1
	* </pre>
	*/
	public String get_tu() throws Exception {
		return this.tu;
	}

	/**
	* <pre>
	* The expression string.
	* </pre>
	*/
	public String get_targetname() throws Exception {
		return this.targetname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		policymap_response result = (policymap_response) service.get_payload_formatter().string_to_resource(policymap_response.class, response);
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
		return result.policymap;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.mappolicyname;
	}

	/**
	* Use this API to add policymap.
	*/
	public static base_response add(nitro_service client, policymap resource) throws Exception {
		policymap addresource = new policymap();
		addresource.mappolicyname = resource.mappolicyname;
		addresource.sd = resource.sd;
		addresource.su = resource.su;
		addresource.td = resource.td;
		addresource.tu = resource.tu;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add policymap resources.
	*/
	public static base_responses add(nitro_service client, policymap resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policymap addresources[] = new policymap[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new policymap();
				addresources[i].mappolicyname = resources[i].mappolicyname;
				addresources[i].sd = resources[i].sd;
				addresources[i].su = resources[i].su;
				addresources[i].td = resources[i].td;
				addresources[i].tu = resources[i].tu;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete policymap of given name.
	*/
	public static base_response delete(nitro_service client, String mappolicyname) throws Exception {
		policymap deleteresource = new policymap();
		deleteresource.mappolicyname = mappolicyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policymap.
	*/
	public static base_response delete(nitro_service client, policymap resource) throws Exception {
		policymap deleteresource = new policymap();
		deleteresource.mappolicyname = resource.mappolicyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policymap resources of given names.
	*/
	public static base_responses delete(nitro_service client, String mappolicyname[]) throws Exception {
		base_responses result = null;
		if (mappolicyname != null && mappolicyname.length > 0) {
			policymap deleteresources[] = new policymap[mappolicyname.length];
			for (int i=0;i<mappolicyname.length;i++){
				deleteresources[i] = new policymap();
				deleteresources[i].mappolicyname = mappolicyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete policymap resources.
	*/
	public static base_responses delete(nitro_service client, policymap resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policymap deleteresources[] = new policymap[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new policymap();
				deleteresources[i].mappolicyname = resources[i].mappolicyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the policymap resources that are configured on netscaler.
	*/
	public static policymap[] get(nitro_service service) throws Exception{
		policymap obj = new policymap();
		policymap[] response = (policymap[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the policymap resources that are configured on netscaler.
	*/
	public static policymap[] get(nitro_service service, options option) throws Exception{
		policymap obj = new policymap();
		policymap[] response = (policymap[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch policymap resource of given name .
	*/
	public static policymap get(nitro_service service, String mappolicyname) throws Exception{
		policymap obj = new policymap();
		obj.set_mappolicyname(mappolicyname);
		policymap response = (policymap) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch policymap resources of given names .
	*/
	public static policymap[] get(nitro_service service, String mappolicyname[]) throws Exception{
		if (mappolicyname !=null && mappolicyname.length>0) {
			policymap response[] = new policymap[mappolicyname.length];
			policymap obj[] = new policymap[mappolicyname.length];
			for (int i=0;i<mappolicyname.length;i++) {
				obj[i] = new policymap();
				obj[i].set_mappolicyname(mappolicyname[i]);
				response[i] = (policymap) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of policymap resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static policymap[] get_filtered(nitro_service service, String filter) throws Exception{
		policymap obj = new policymap();
		options option = new options();
		option.set_filter(filter);
		policymap[] response = (policymap[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policymap resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static policymap[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policymap obj = new policymap();
		options option = new options();
		option.set_filter(filter);
		policymap[] response = (policymap[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the policymap resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		policymap obj = new policymap();
		options option = new options();
		option.set_count(true);
		policymap[] response = (policymap[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of policymap resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		policymap obj = new policymap();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policymap[] response = (policymap[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policymap resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policymap obj = new policymap();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policymap[] response = (policymap[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
