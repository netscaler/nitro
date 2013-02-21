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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnurl_response extends base_response
{
	public vpnurl[] vpnurl;
}
/**
* Configuration for VPN URL resource.
*/

public class vpnurl extends base_resource
{
	private String urlname;
	private String linkname;
	private String actualurl;
	private String clientlessaccess;
	private String comment;
	private Long __count;

	/**
	* <pre>
	* The name for the new vpn url.<br> Minimum length =  1
	* </pre>
	*/
	public void set_urlname(String urlname) throws Exception{
		this.urlname = urlname;
	}

	/**
	* <pre>
	* The name for the new vpn url.<br> Minimum length =  1
	* </pre>
	*/
	public String get_urlname() throws Exception {
		return this.urlname;
	}

	/**
	* <pre>
	* The display name for the vpn url. This is the name that will display in the bookmark links in the vpn portal page.<br> Minimum length =  1
	* </pre>
	*/
	public void set_linkname(String linkname) throws Exception{
		this.linkname = linkname;
	}

	/**
	* <pre>
	* The display name for the vpn url. This is the name that will display in the bookmark links in the vpn portal page.<br> Minimum length =  1
	* </pre>
	*/
	public String get_linkname() throws Exception {
		return this.linkname;
	}

	/**
	* <pre>
	* The actual URL that the vpn url points to.<br> Minimum length =  1
	* </pre>
	*/
	public void set_actualurl(String actualurl) throws Exception{
		this.actualurl = actualurl;
	}

	/**
	* <pre>
	* The actual URL that the vpn url points to.<br> Minimum length =  1
	* </pre>
	*/
	public String get_actualurl() throws Exception {
		return this.actualurl;
	}

	/**
	* <pre>
	* Enable clientless access for the URL in other VPN modes if permitted. In clientless mode of VPN, it is enabled by default.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_clientlessaccess(String clientlessaccess) throws Exception{
		this.clientlessaccess = clientlessaccess;
	}

	/**
	* <pre>
	* Enable clientless access for the URL in other VPN modes if permitted. In clientless mode of VPN, it is enabled by default.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_clientlessaccess() throws Exception {
		return this.clientlessaccess;
	}

	/**
	* <pre>
	* Comments associated with this vpn url entity.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this vpn url entity.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnurl_response result = (vpnurl_response) service.get_payload_formatter().string_to_resource(vpnurl_response.class, response);
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
		return result.vpnurl;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.urlname;
	}

	/**
	* Use this API to add vpnurl.
	*/
	public static base_response add(nitro_service client, vpnurl resource) throws Exception {
		vpnurl addresource = new vpnurl();
		addresource.urlname = resource.urlname;
		addresource.linkname = resource.linkname;
		addresource.actualurl = resource.actualurl;
		addresource.clientlessaccess = resource.clientlessaccess;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnurl resources.
	*/
	public static base_responses add(nitro_service client, vpnurl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnurl addresources[] = new vpnurl[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnurl();
				addresources[i].urlname = resources[i].urlname;
				addresources[i].linkname = resources[i].linkname;
				addresources[i].actualurl = resources[i].actualurl;
				addresources[i].clientlessaccess = resources[i].clientlessaccess;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnurl of given name.
	*/
	public static base_response delete(nitro_service client, String urlname) throws Exception {
		vpnurl deleteresource = new vpnurl();
		deleteresource.urlname = urlname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnurl.
	*/
	public static base_response delete(nitro_service client, vpnurl resource) throws Exception {
		vpnurl deleteresource = new vpnurl();
		deleteresource.urlname = resource.urlname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnurl resources of given names.
	*/
	public static base_responses delete(nitro_service client, String urlname[]) throws Exception {
		base_responses result = null;
		if (urlname != null && urlname.length > 0) {
			vpnurl deleteresources[] = new vpnurl[urlname.length];
			for (int i=0;i<urlname.length;i++){
				deleteresources[i] = new vpnurl();
				deleteresources[i].urlname = urlname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnurl resources.
	*/
	public static base_responses delete(nitro_service client, vpnurl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnurl deleteresources[] = new vpnurl[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnurl();
				deleteresources[i].urlname = resources[i].urlname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpnurl.
	*/
	public static base_response update(nitro_service client, vpnurl resource) throws Exception {
		vpnurl updateresource = new vpnurl();
		updateresource.urlname = resource.urlname;
		updateresource.linkname = resource.linkname;
		updateresource.actualurl = resource.actualurl;
		updateresource.clientlessaccess = resource.clientlessaccess;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpnurl resources.
	*/
	public static base_responses update(nitro_service client, vpnurl resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnurl updateresources[] = new vpnurl[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnurl();
				updateresources[i].urlname = resources[i].urlname;
				updateresources[i].linkname = resources[i].linkname;
				updateresources[i].actualurl = resources[i].actualurl;
				updateresources[i].clientlessaccess = resources[i].clientlessaccess;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnurl resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String urlname, String args[]) throws Exception {
		vpnurl unsetresource = new vpnurl();
		unsetresource.urlname = urlname;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of vpnurl resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpnurl resource, String[] args) throws Exception{
		vpnurl unsetresource = new vpnurl();
		unsetresource.urlname = resource.urlname;
		unsetresource.clientlessaccess = resource.clientlessaccess;
		unsetresource.comment = resource.comment;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpnurl resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String urlname[], String args[]) throws Exception {
		base_responses result = null;
		if (urlname != null && urlname.length > 0) {
			vpnurl unsetresources[] = new vpnurl[urlname.length];
			for (int i=0;i<urlname.length;i++){
				unsetresources[i] = new vpnurl();
				unsetresources[i].urlname = urlname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnurl resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpnurl resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnurl unsetresources[] = new vpnurl[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpnurl();
				unsetresources[i].urlname = resources[i].urlname;
				unsetresources[i].clientlessaccess = resources[i].clientlessaccess;
				unsetresources[i].comment = resources[i].comment;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpnurl resources that are configured on netscaler.
	*/
	public static vpnurl[] get(nitro_service service) throws Exception{
		vpnurl obj = new vpnurl();
		vpnurl[] response = (vpnurl[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnurl resources that are configured on netscaler.
	*/
	public static vpnurl[] get(nitro_service service, options option) throws Exception{
		vpnurl obj = new vpnurl();
		vpnurl[] response = (vpnurl[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnurl resource of given name .
	*/
	public static vpnurl get(nitro_service service, String urlname) throws Exception{
		vpnurl obj = new vpnurl();
		obj.set_urlname(urlname);
		vpnurl response = (vpnurl) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnurl resources of given names .
	*/
	public static vpnurl[] get(nitro_service service, String urlname[]) throws Exception{
		if (urlname !=null && urlname.length>0) {
			vpnurl response[] = new vpnurl[urlname.length];
			vpnurl obj[] = new vpnurl[urlname.length];
			for (int i=0;i<urlname.length;i++) {
				obj[i] = new vpnurl();
				obj[i].set_urlname(urlname[i]);
				response[i] = (vpnurl) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnurl resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnurl[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnurl obj = new vpnurl();
		options option = new options();
		option.set_filter(filter);
		vpnurl[] response = (vpnurl[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnurl resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnurl[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnurl obj = new vpnurl();
		options option = new options();
		option.set_filter(filter);
		vpnurl[] response = (vpnurl[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnurl resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnurl obj = new vpnurl();
		options option = new options();
		option.set_count(true);
		vpnurl[] response = (vpnurl[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnurl resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnurl obj = new vpnurl();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnurl[] response = (vpnurl[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnurl resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnurl obj = new vpnurl();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnurl[] response = (vpnurl[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class clientlessaccessEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
