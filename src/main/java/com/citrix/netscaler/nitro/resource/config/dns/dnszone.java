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

class dnszone_response extends base_response
{
	public dnszone[] dnszone;
}
/**
* Configuration for DNS zone resource.
*/

public class dnszone extends base_resource
{
	private String zonename;
	private String proxymode;
	private String[] keyname;
	private String type;

	//------- Read only Parameter ---------;

	private Long flags;
	private char[] nsecbitarray;
	private Long __count;

	/**
	* <pre>
	* The name of the zone being added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_zonename(String zonename) throws Exception{
		this.zonename = zonename;
	}

	/**
	* <pre>
	* The name of the zone being added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_zonename() throws Exception {
		return this.zonename;
	}

	/**
	* <pre>
	* zone deployed in proxy mode.<br> Default value: ENABLED<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_proxymode(String proxymode) throws Exception{
		this.proxymode = proxymode;
	}

	/**
	* <pre>
	* zone deployed in proxy mode.<br> Default value: ENABLED<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_proxymode() throws Exception {
		return this.proxymode;
	}

	/**
	* <pre>
	* The name given to a public/private key pair.<br> Minimum length =  1
	* </pre>
	*/
	public void set_keyname(String[] keyname) throws Exception{
		this.keyname = keyname;
	}

	/**
	* <pre>
	* The name given to a public/private key pair.<br> Minimum length =  1
	* </pre>
	*/
	public String[] get_keyname() throws Exception {
		return this.keyname;
	}

	/**
	* <pre>
	* Zone type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative zones will be displayed.
PROXY - If this is specified, all of the proxy zones will be displayed.
ALL  -  If this is specified, all of the zones will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Zone type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative zones will be displayed.
PROXY - If this is specified, all of the proxy zones will be displayed.
ALL  -  If this is specified, all of the zones will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
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
	* Bit array representing the different record types configured for the domain name.
	* </pre>
	*/
	public char[] get_nsecbitarray() throws Exception {
		return this.nsecbitarray;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnszone_response result = (dnszone_response) service.get_payload_formatter().string_to_resource(dnszone_response.class, response);
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
		return result.dnszone;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.zonename;
	}

	/**
	* Use this API to add dnszone.
	*/
	public static base_response add(nitro_service client, dnszone resource) throws Exception {
		dnszone addresource = new dnszone();
		addresource.zonename = resource.zonename;
		addresource.proxymode = resource.proxymode;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnszone resources.
	*/
	public static base_responses add(nitro_service client, dnszone resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone addresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnszone();
				addresources[i].zonename = resources[i].zonename;
				addresources[i].proxymode = resources[i].proxymode;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update dnszone.
	*/
	public static base_response update(nitro_service client, dnszone resource) throws Exception {
		dnszone updateresource = new dnszone();
		updateresource.zonename = resource.zonename;
		updateresource.proxymode = resource.proxymode;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnszone resources.
	*/
	public static base_responses update(nitro_service client, dnszone resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone updateresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnszone();
				updateresources[i].zonename = resources[i].zonename;
				updateresources[i].proxymode = resources[i].proxymode;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnszone resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String zonename, String args[]) throws Exception {
		dnszone unsetresource = new dnszone();
		unsetresource.zonename = zonename;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of dnszone resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnszone resource, String[] args) throws Exception{
		dnszone unsetresource = new dnszone();
		unsetresource.zonename = resource.zonename;
		unsetresource.proxymode = resource.proxymode;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dnszone resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String zonename[], String args[]) throws Exception {
		base_responses result = null;
		if (zonename != null && zonename.length > 0) {
			dnszone unsetresources[] = new dnszone[zonename.length];
			for (int i=0;i<zonename.length;i++){
				unsetresources[i] = new dnszone();
				unsetresources[i].zonename = zonename[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnszone resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dnszone resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone unsetresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dnszone();
				unsetresources[i].zonename = resources[i].zonename;
				unsetresources[i].proxymode = resources[i].proxymode;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to delete dnszone of given name.
	*/
	public static base_response delete(nitro_service client, String zonename) throws Exception {
		dnszone deleteresource = new dnszone();
		deleteresource.zonename = zonename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnszone.
	*/
	public static base_response delete(nitro_service client, dnszone resource) throws Exception {
		dnszone deleteresource = new dnszone();
		deleteresource.zonename = resource.zonename;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnszone resources of given names.
	*/
	public static base_responses delete(nitro_service client, String zonename[]) throws Exception {
		base_responses result = null;
		if (zonename != null && zonename.length > 0) {
			dnszone deleteresources[] = new dnszone[zonename.length];
			for (int i=0;i<zonename.length;i++){
				deleteresources[i] = new dnszone();
				deleteresources[i].zonename = zonename[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnszone resources.
	*/
	public static base_responses delete(nitro_service client, dnszone resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnszone deleteresources[] = new dnszone[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnszone();
				deleteresources[i].zonename = resources[i].zonename;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnszone resources that are configured on netscaler.
	*/
	public static dnszone[] get(nitro_service service) throws Exception{
		dnszone obj = new dnszone();
		dnszone[] response = (dnszone[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnszone resources that are configured on netscaler.
	*/
	public static dnszone[] get(nitro_service service, options option) throws Exception{
		dnszone obj = new dnszone();
		dnszone[] response = (dnszone[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnszone resources that are configured on netscaler.
	* This uses dnszone_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnszone[] get(nitro_service service, dnszone_args args) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnszone[] response = (dnszone[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnszone resource of given name .
	*/
	public static dnszone get(nitro_service service, String zonename) throws Exception{
		dnszone obj = new dnszone();
		obj.set_zonename(zonename);
		dnszone response = (dnszone) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnszone resources of given names .
	*/
	public static dnszone[] get(nitro_service service, String zonename[]) throws Exception{
		if (zonename !=null && zonename.length>0) {
			dnszone response[] = new dnszone[zonename.length];
			dnszone obj[] = new dnszone[zonename.length];
			for (int i=0;i<zonename.length;i++) {
				obj[i] = new dnszone();
				obj[i].set_zonename(zonename[i]);
				response[i] = (dnszone) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnszone resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnszone[] get_filtered(nitro_service service, String filter) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_filter(filter);
		dnszone[] response = (dnszone[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnszone resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnszone[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_filter(filter);
		dnszone[] response = (dnszone[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnszone resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_count(true);
		dnszone[] response = (dnszone[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnszone resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnszone[] response = (dnszone[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnszone resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnszone obj = new dnszone();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnszone[] response = (dnszone[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
	public static class proxymodeEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
