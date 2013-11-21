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

package com.citrix.netscaler.nitro.resource.config.autoscale;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class autoscaleprofile_response extends base_response
{
	public autoscaleprofile[] autoscaleprofile;
}
/**
* Configuration for autoscale profile resource.
*/

public class autoscaleprofile extends base_resource
{
	private String name;
	private String type;
	private String url;
	private String apikey;
	private String sharedsecret;
	private Long __count;

	/**
	* <pre>
	* AutoScale profile name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* AutoScale profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The type of profile.<br> Possible values = CLOUDSTACK
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of profile.<br> Possible values = CLOUDSTACK
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* URL providing the service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_url(String url) throws Exception{
		this.url = url;
	}

	/**
	* <pre>
	* URL providing the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* api key for authentication with service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_apikey(String apikey) throws Exception{
		this.apikey = apikey;
	}

	/**
	* <pre>
	* api key for authentication with service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_apikey() throws Exception {
		return this.apikey;
	}

	/**
	* <pre>
	* shared secret for authentication with service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sharedsecret(String sharedsecret) throws Exception{
		this.sharedsecret = sharedsecret;
	}

	/**
	* <pre>
	* shared secret for authentication with service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sharedsecret() throws Exception {
		return this.sharedsecret;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		autoscaleprofile_response result = (autoscaleprofile_response) service.get_payload_formatter().string_to_resource(autoscaleprofile_response.class, response);
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
		return result.autoscaleprofile;
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
	* Use this API to add autoscaleprofile.
	*/
	public static base_response add(nitro_service client, autoscaleprofile resource) throws Exception {
		autoscaleprofile addresource = new autoscaleprofile();
		addresource.name = resource.name;
		addresource.type = resource.type;
		addresource.url = resource.url;
		addresource.apikey = resource.apikey;
		addresource.sharedsecret = resource.sharedsecret;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add autoscaleprofile resources.
	*/
	public static base_responses add(nitro_service client, autoscaleprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscaleprofile addresources[] = new autoscaleprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new autoscaleprofile();
				addresources[i].name = resources[i].name;
				addresources[i].type = resources[i].type;
				addresources[i].url = resources[i].url;
				addresources[i].apikey = resources[i].apikey;
				addresources[i].sharedsecret = resources[i].sharedsecret;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete autoscaleprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		autoscaleprofile deleteresource = new autoscaleprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete autoscaleprofile.
	*/
	public static base_response delete(nitro_service client, autoscaleprofile resource) throws Exception {
		autoscaleprofile deleteresource = new autoscaleprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete autoscaleprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			autoscaleprofile deleteresources[] = new autoscaleprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new autoscaleprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete autoscaleprofile resources.
	*/
	public static base_responses delete(nitro_service client, autoscaleprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscaleprofile deleteresources[] = new autoscaleprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new autoscaleprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update autoscaleprofile.
	*/
	public static base_response update(nitro_service client, autoscaleprofile resource) throws Exception {
		autoscaleprofile updateresource = new autoscaleprofile();
		updateresource.name = resource.name;
		updateresource.url = resource.url;
		updateresource.apikey = resource.apikey;
		updateresource.sharedsecret = resource.sharedsecret;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update autoscaleprofile resources.
	*/
	public static base_responses update(nitro_service client, autoscaleprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscaleprofile updateresources[] = new autoscaleprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new autoscaleprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].url = resources[i].url;
				updateresources[i].apikey = resources[i].apikey;
				updateresources[i].sharedsecret = resources[i].sharedsecret;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the autoscaleprofile resources that are configured on netscaler.
	*/
	public static autoscaleprofile[] get(nitro_service service) throws Exception{
		autoscaleprofile obj = new autoscaleprofile();
		autoscaleprofile[] response = (autoscaleprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the autoscaleprofile resources that are configured on netscaler.
	*/
	public static autoscaleprofile[] get(nitro_service service, options option) throws Exception{
		autoscaleprofile obj = new autoscaleprofile();
		autoscaleprofile[] response = (autoscaleprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch autoscaleprofile resource of given name .
	*/
	public static autoscaleprofile get(nitro_service service, String name) throws Exception{
		autoscaleprofile obj = new autoscaleprofile();
		obj.set_name(name);
		autoscaleprofile response = (autoscaleprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch autoscaleprofile resources of given names .
	*/
	public static autoscaleprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			autoscaleprofile response[] = new autoscaleprofile[name.length];
			autoscaleprofile obj[] = new autoscaleprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new autoscaleprofile();
				obj[i].set_name(name[i]);
				response[i] = (autoscaleprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of autoscaleprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static autoscaleprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		autoscaleprofile obj = new autoscaleprofile();
		options option = new options();
		option.set_filter(filter);
		autoscaleprofile[] response = (autoscaleprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of autoscaleprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static autoscaleprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		autoscaleprofile obj = new autoscaleprofile();
		options option = new options();
		option.set_filter(filter);
		autoscaleprofile[] response = (autoscaleprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the autoscaleprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		autoscaleprofile obj = new autoscaleprofile();
		options option = new options();
		option.set_count(true);
		autoscaleprofile[] response = (autoscaleprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of autoscaleprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		autoscaleprofile obj = new autoscaleprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		autoscaleprofile[] response = (autoscaleprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of autoscaleprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		autoscaleprofile obj = new autoscaleprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		autoscaleprofile[] response = (autoscaleprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String CLOUDSTACK = "CLOUDSTACK";
	}
}
