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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsrpcnode_response extends base_response
{
	public nsrpcnode[] nsrpcnode;
}
/**
* Configuration for rpc node resource.
*/

public class nsrpcnode extends base_resource
{
	private String ipaddress;
	private String password;
	private String srcip;
	private String secure;
	private Long __count;

	/**
	* <pre>
	* IP address of the node. This has to be in the same subnet as the NSIP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* IP address of the node. This has to be in the same subnet as the NSIP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Password to be used in authentication with the peer system node.<br> Minimum length =  1
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* Password to be used in authentication with the peer system node.<br> Minimum length =  1
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* Source IP address to be used to communicate with the peer system node. The default value is 0, which means that the appliance uses the NSIP address as the source IP address.
	* </pre>
	*/
	public void set_srcip(String srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* Source IP address to be used to communicate with the peer system node. The default value is 0, which means that the appliance uses the NSIP address as the source IP address.
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* State of the channel when talking to the node.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_secure(String secure) throws Exception{
		this.secure = secure;
	}

	/**
	* <pre>
	* State of the channel when talking to the node.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_secure() throws Exception {
		return this.secure;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsrpcnode_response result = (nsrpcnode_response) service.get_payload_formatter().string_to_resource(nsrpcnode_response.class, response);
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
		return result.nsrpcnode;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipaddress;
	}

	/**
	* Use this API to update nsrpcnode.
	*/
	public static base_response update(nitro_service client, nsrpcnode resource) throws Exception {
		nsrpcnode updateresource = new nsrpcnode();
		updateresource.ipaddress = resource.ipaddress;
		updateresource.password = resource.password;
		updateresource.srcip = resource.srcip;
		updateresource.secure = resource.secure;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nsrpcnode resources.
	*/
	public static base_responses update(nitro_service client, nsrpcnode resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsrpcnode updateresources[] = new nsrpcnode[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nsrpcnode();
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].password = resources[i].password;
				updateresources[i].srcip = resources[i].srcip;
				updateresources[i].secure = resources[i].secure;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsrpcnode resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsrpcnode resource, String[] args) throws Exception{
		nsrpcnode unsetresource = new nsrpcnode();
		unsetresource.ipaddress = resource.ipaddress;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nsrpcnode resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String ipaddress[], String args[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			nsrpcnode unsetresources[] = new nsrpcnode[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				unsetresources[i] = new nsrpcnode();
				unsetresources[i].ipaddress = ipaddress[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nsrpcnode resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nsrpcnode resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nsrpcnode unsetresources[] = new nsrpcnode[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nsrpcnode();
				unsetresources[i].ipaddress = resources[i].ipaddress;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nsrpcnode resources that are configured on netscaler.
	*/
	public static nsrpcnode[] get(nitro_service service) throws Exception{
		nsrpcnode obj = new nsrpcnode();
		nsrpcnode[] response = (nsrpcnode[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsrpcnode resources that are configured on netscaler.
	*/
	public static nsrpcnode[] get(nitro_service service, options option) throws Exception{
		nsrpcnode obj = new nsrpcnode();
		nsrpcnode[] response = (nsrpcnode[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nsrpcnode resource of given name .
	*/
	public static nsrpcnode get(nitro_service service, String ipaddress) throws Exception{
		nsrpcnode obj = new nsrpcnode();
		obj.set_ipaddress(ipaddress);
		nsrpcnode response = (nsrpcnode) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nsrpcnode resources of given names .
	*/
	public static nsrpcnode[] get(nitro_service service, String ipaddress[]) throws Exception{
		if (ipaddress !=null && ipaddress.length>0) {
			nsrpcnode response[] = new nsrpcnode[ipaddress.length];
			nsrpcnode obj[] = new nsrpcnode[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++) {
				obj[i] = new nsrpcnode();
				obj[i].set_ipaddress(ipaddress[i]);
				response[i] = (nsrpcnode) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nsrpcnode resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsrpcnode[] get_filtered(nitro_service service, String filter) throws Exception{
		nsrpcnode obj = new nsrpcnode();
		options option = new options();
		option.set_filter(filter);
		nsrpcnode[] response = (nsrpcnode[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsrpcnode resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsrpcnode[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsrpcnode obj = new nsrpcnode();
		options option = new options();
		option.set_filter(filter);
		nsrpcnode[] response = (nsrpcnode[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsrpcnode resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsrpcnode obj = new nsrpcnode();
		options option = new options();
		option.set_count(true);
		nsrpcnode[] response = (nsrpcnode[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsrpcnode resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsrpcnode obj = new nsrpcnode();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsrpcnode[] response = (nsrpcnode[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsrpcnode resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsrpcnode obj = new nsrpcnode();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsrpcnode[] response = (nsrpcnode[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class secureEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
