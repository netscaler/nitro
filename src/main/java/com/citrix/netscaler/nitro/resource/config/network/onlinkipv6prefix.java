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

class onlinkipv6prefix_response extends base_response
{
	public onlinkipv6prefix[] onlinkipv6prefix;
}
/**
* Configuration for on-link IPv6 global prefixes for Router Advertisment resource.
*/

public class onlinkipv6prefix extends base_resource
{
	private String ipv6prefix;
	private String onlinkprefix;
	private String autonomusprefix;
	private String depricateprefix;
	private String decrementprefixlifetimes;
	private Long prefixvalidelifetime;
	private Long prefixpreferredlifetime;

	//------- Read only Parameter ---------;

	private Long prefixcurrvalidelft;
	private Long prefixcurrpreferredlft;
	private Long __count;

	/**
	* <pre>
	* Onlink prefixes for RA messages.
	* </pre>
	*/
	public void set_ipv6prefix(String ipv6prefix) throws Exception{
		this.ipv6prefix = ipv6prefix;
	}

	/**
	* <pre>
	* Onlink prefixes for RA messages.
	* </pre>
	*/
	public String get_ipv6prefix() throws Exception {
		return this.ipv6prefix;
	}

	/**
	* <pre>
	* RA Prefix onlink flag.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_onlinkprefix(String onlinkprefix) throws Exception{
		this.onlinkprefix = onlinkprefix;
	}

	/**
	* <pre>
	* RA Prefix onlink flag.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_onlinkprefix() throws Exception {
		return this.onlinkprefix;
	}

	/**
	* <pre>
	* RA Prefix Autonomus flag.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_autonomusprefix(String autonomusprefix) throws Exception{
		this.autonomusprefix = autonomusprefix;
	}

	/**
	* <pre>
	* RA Prefix Autonomus flag.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_autonomusprefix() throws Exception {
		return this.autonomusprefix;
	}

	/**
	* <pre>
	* Depricate the prefix.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_depricateprefix(String depricateprefix) throws Exception{
		this.depricateprefix = depricateprefix;
	}

	/**
	* <pre>
	* Depricate the prefix.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_depricateprefix() throws Exception {
		return this.depricateprefix;
	}

	/**
	* <pre>
	* RA Prefix Autonomus flag.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_decrementprefixlifetimes(String decrementprefixlifetimes) throws Exception{
		this.decrementprefixlifetimes = decrementprefixlifetimes;
	}

	/**
	* <pre>
	* RA Prefix Autonomus flag.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_decrementprefixlifetimes() throws Exception {
		return this.decrementprefixlifetimes;
	}

	/**
	* <pre>
	* Valide life time of the prefix, in seconds.<br> Default value: 2592000
	* </pre>
	*/
	public void set_prefixvalidelifetime(long prefixvalidelifetime) throws Exception {
		this.prefixvalidelifetime = new Long(prefixvalidelifetime);
	}

	/**
	* <pre>
	* Valide life time of the prefix, in seconds.<br> Default value: 2592000
	* </pre>
	*/
	public void set_prefixvalidelifetime(Long prefixvalidelifetime) throws Exception{
		this.prefixvalidelifetime = prefixvalidelifetime;
	}

	/**
	* <pre>
	* Valide life time of the prefix, in seconds.<br> Default value: 2592000
	* </pre>
	*/
	public Long get_prefixvalidelifetime() throws Exception {
		return this.prefixvalidelifetime;
	}

	/**
	* <pre>
	* Preferred life time of the prefix, in seconds.<br> Default value: 604800
	* </pre>
	*/
	public void set_prefixpreferredlifetime(long prefixpreferredlifetime) throws Exception {
		this.prefixpreferredlifetime = new Long(prefixpreferredlifetime);
	}

	/**
	* <pre>
	* Preferred life time of the prefix, in seconds.<br> Default value: 604800
	* </pre>
	*/
	public void set_prefixpreferredlifetime(Long prefixpreferredlifetime) throws Exception{
		this.prefixpreferredlifetime = prefixpreferredlifetime;
	}

	/**
	* <pre>
	* Preferred life time of the prefix, in seconds.<br> Default value: 604800
	* </pre>
	*/
	public Long get_prefixpreferredlifetime() throws Exception {
		return this.prefixpreferredlifetime;
	}

	/**
	* <pre>
	* Prefix current valid life time.
	* </pre>
	*/
	public Long get_prefixcurrvalidelft() throws Exception {
		return this.prefixcurrvalidelft;
	}

	/**
	* <pre>
	* Prefix current prefered life time.
	* </pre>
	*/
	public Long get_prefixcurrpreferredlft() throws Exception {
		return this.prefixcurrpreferredlft;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		onlinkipv6prefix_response result = (onlinkipv6prefix_response) service.get_payload_formatter().string_to_resource(onlinkipv6prefix_response.class, response);
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
		return result.onlinkipv6prefix;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipv6prefix;
	}

	/**
	* Use this API to add onlinkipv6prefix.
	*/
	public static base_response add(nitro_service client, onlinkipv6prefix resource) throws Exception {
		onlinkipv6prefix addresource = new onlinkipv6prefix();
		addresource.ipv6prefix = resource.ipv6prefix;
		addresource.onlinkprefix = resource.onlinkprefix;
		addresource.autonomusprefix = resource.autonomusprefix;
		addresource.depricateprefix = resource.depricateprefix;
		addresource.decrementprefixlifetimes = resource.decrementprefixlifetimes;
		addresource.prefixvalidelifetime = resource.prefixvalidelifetime;
		addresource.prefixpreferredlifetime = resource.prefixpreferredlifetime;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add onlinkipv6prefix resources.
	*/
	public static base_responses add(nitro_service client, onlinkipv6prefix resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			onlinkipv6prefix addresources[] = new onlinkipv6prefix[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new onlinkipv6prefix();
				addresources[i].ipv6prefix = resources[i].ipv6prefix;
				addresources[i].onlinkprefix = resources[i].onlinkprefix;
				addresources[i].autonomusprefix = resources[i].autonomusprefix;
				addresources[i].depricateprefix = resources[i].depricateprefix;
				addresources[i].decrementprefixlifetimes = resources[i].decrementprefixlifetimes;
				addresources[i].prefixvalidelifetime = resources[i].prefixvalidelifetime;
				addresources[i].prefixpreferredlifetime = resources[i].prefixpreferredlifetime;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete onlinkipv6prefix of given name.
	*/
	public static base_response delete(nitro_service client, String ipv6prefix) throws Exception {
		onlinkipv6prefix deleteresource = new onlinkipv6prefix();
		deleteresource.ipv6prefix = ipv6prefix;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete onlinkipv6prefix.
	*/
	public static base_response delete(nitro_service client, onlinkipv6prefix resource) throws Exception {
		onlinkipv6prefix deleteresource = new onlinkipv6prefix();
		deleteresource.ipv6prefix = resource.ipv6prefix;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete onlinkipv6prefix resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ipv6prefix[]) throws Exception {
		base_responses result = null;
		if (ipv6prefix != null && ipv6prefix.length > 0) {
			onlinkipv6prefix deleteresources[] = new onlinkipv6prefix[ipv6prefix.length];
			for (int i=0;i<ipv6prefix.length;i++){
				deleteresources[i] = new onlinkipv6prefix();
				deleteresources[i].ipv6prefix = ipv6prefix[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete onlinkipv6prefix resources.
	*/
	public static base_responses delete(nitro_service client, onlinkipv6prefix resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			onlinkipv6prefix deleteresources[] = new onlinkipv6prefix[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new onlinkipv6prefix();
				deleteresources[i].ipv6prefix = resources[i].ipv6prefix;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update onlinkipv6prefix.
	*/
	public static base_response update(nitro_service client, onlinkipv6prefix resource) throws Exception {
		onlinkipv6prefix updateresource = new onlinkipv6prefix();
		updateresource.ipv6prefix = resource.ipv6prefix;
		updateresource.onlinkprefix = resource.onlinkprefix;
		updateresource.autonomusprefix = resource.autonomusprefix;
		updateresource.depricateprefix = resource.depricateprefix;
		updateresource.decrementprefixlifetimes = resource.decrementprefixlifetimes;
		updateresource.prefixvalidelifetime = resource.prefixvalidelifetime;
		updateresource.prefixpreferredlifetime = resource.prefixpreferredlifetime;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update onlinkipv6prefix resources.
	*/
	public static base_responses update(nitro_service client, onlinkipv6prefix resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			onlinkipv6prefix updateresources[] = new onlinkipv6prefix[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new onlinkipv6prefix();
				updateresources[i].ipv6prefix = resources[i].ipv6prefix;
				updateresources[i].onlinkprefix = resources[i].onlinkprefix;
				updateresources[i].autonomusprefix = resources[i].autonomusprefix;
				updateresources[i].depricateprefix = resources[i].depricateprefix;
				updateresources[i].decrementprefixlifetimes = resources[i].decrementprefixlifetimes;
				updateresources[i].prefixvalidelifetime = resources[i].prefixvalidelifetime;
				updateresources[i].prefixpreferredlifetime = resources[i].prefixpreferredlifetime;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of onlinkipv6prefix resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, onlinkipv6prefix resource, String[] args) throws Exception{
		onlinkipv6prefix unsetresource = new onlinkipv6prefix();
		unsetresource.ipv6prefix = resource.ipv6prefix;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of onlinkipv6prefix resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String ipv6prefix[], String args[]) throws Exception {
		base_responses result = null;
		if (ipv6prefix != null && ipv6prefix.length > 0) {
			onlinkipv6prefix unsetresources[] = new onlinkipv6prefix[ipv6prefix.length];
			for (int i=0;i<ipv6prefix.length;i++){
				unsetresources[i] = new onlinkipv6prefix();
				unsetresources[i].ipv6prefix = ipv6prefix[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of onlinkipv6prefix resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, onlinkipv6prefix resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			onlinkipv6prefix unsetresources[] = new onlinkipv6prefix[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new onlinkipv6prefix();
				unsetresources[i].ipv6prefix = resources[i].ipv6prefix;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the onlinkipv6prefix resources that are configured on netscaler.
	*/
	public static onlinkipv6prefix[] get(nitro_service service) throws Exception{
		onlinkipv6prefix obj = new onlinkipv6prefix();
		onlinkipv6prefix[] response = (onlinkipv6prefix[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the onlinkipv6prefix resources that are configured on netscaler.
	*/
	public static onlinkipv6prefix[] get(nitro_service service, options option) throws Exception{
		onlinkipv6prefix obj = new onlinkipv6prefix();
		onlinkipv6prefix[] response = (onlinkipv6prefix[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch onlinkipv6prefix resource of given name .
	*/
	public static onlinkipv6prefix get(nitro_service service, String ipv6prefix) throws Exception{
		onlinkipv6prefix obj = new onlinkipv6prefix();
		obj.set_ipv6prefix(ipv6prefix);
		onlinkipv6prefix response = (onlinkipv6prefix) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch onlinkipv6prefix resources of given names .
	*/
	public static onlinkipv6prefix[] get(nitro_service service, String ipv6prefix[]) throws Exception{
		if (ipv6prefix !=null && ipv6prefix.length>0) {
			onlinkipv6prefix response[] = new onlinkipv6prefix[ipv6prefix.length];
			onlinkipv6prefix obj[] = new onlinkipv6prefix[ipv6prefix.length];
			for (int i=0;i<ipv6prefix.length;i++) {
				obj[i] = new onlinkipv6prefix();
				obj[i].set_ipv6prefix(ipv6prefix[i]);
				response[i] = (onlinkipv6prefix) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of onlinkipv6prefix resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static onlinkipv6prefix[] get_filtered(nitro_service service, String filter) throws Exception{
		onlinkipv6prefix obj = new onlinkipv6prefix();
		options option = new options();
		option.set_filter(filter);
		onlinkipv6prefix[] response = (onlinkipv6prefix[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of onlinkipv6prefix resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static onlinkipv6prefix[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		onlinkipv6prefix obj = new onlinkipv6prefix();
		options option = new options();
		option.set_filter(filter);
		onlinkipv6prefix[] response = (onlinkipv6prefix[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the onlinkipv6prefix resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		onlinkipv6prefix obj = new onlinkipv6prefix();
		options option = new options();
		option.set_count(true);
		onlinkipv6prefix[] response = (onlinkipv6prefix[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of onlinkipv6prefix resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		onlinkipv6prefix obj = new onlinkipv6prefix();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		onlinkipv6prefix[] response = (onlinkipv6prefix[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of onlinkipv6prefix resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		onlinkipv6prefix obj = new onlinkipv6prefix();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		onlinkipv6prefix[] response = (onlinkipv6prefix[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class depricateprefixEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class decrementprefixlifetimesEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class onlinkprefixEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class autonomusprefixEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
