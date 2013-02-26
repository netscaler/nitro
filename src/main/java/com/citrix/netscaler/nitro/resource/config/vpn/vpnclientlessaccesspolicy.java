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

class vpnclientlessaccesspolicy_response extends base_response
{
	public vpnclientlessaccesspolicy[] vpnclientlessaccesspolicy;
}
/**
* Configuration for Clientless VPN rewrite policy resource.
*/

public class vpnclientlessaccesspolicy extends base_resource
{
	private String name;
	private String rule;
	private String profilename;

	//------- Read only Parameter ---------;

	private String undefaction;
	private Long hits;
	private Long undefhits;
	private Integer activepolicy;
	private String boundto;
	private Long priority;
	private String description;
	private Boolean isdefault;
	private Long __count;

	/**
	* <pre>
	* The name for the new clientless access policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new clientless access policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule to be used by the clientless access policy.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule to be used by the clientless access policy.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The profile to be invoked for clientless access.
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* The profile to be invoked for clientless access.
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* The UNDEF action.
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* The number of times the policy evaluated to true.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of times the policy evaluation resulted in undefined processing.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* Indicates whether policy is bound or not.
	* </pre>
	*/
	public Integer get_activepolicy() throws Exception {
		return this.activepolicy;
	}

	/**
	* <pre>
	* Location where policy is bound.
	* </pre>
	*/
	public String get_boundto() throws Exception {
		return this.boundto;
	}

	/**
	* <pre>
	* Specifies the priority of the policy.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Description of the clientless access policy.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default vpnclientlessrwpolicy.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnclientlessaccesspolicy_response result = (vpnclientlessaccesspolicy_response) service.get_payload_formatter().string_to_resource(vpnclientlessaccesspolicy_response.class, response);
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
		return result.vpnclientlessaccesspolicy;
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
	* Use this API to add vpnclientlessaccesspolicy.
	*/
	public static base_response add(nitro_service client, vpnclientlessaccesspolicy resource) throws Exception {
		vpnclientlessaccesspolicy addresource = new vpnclientlessaccesspolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.profilename = resource.profilename;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnclientlessaccesspolicy resources.
	*/
	public static base_responses add(nitro_service client, vpnclientlessaccesspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnclientlessaccesspolicy addresources[] = new vpnclientlessaccesspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnclientlessaccesspolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].profilename = resources[i].profilename;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnclientlessaccesspolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpnclientlessaccesspolicy deleteresource = new vpnclientlessaccesspolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnclientlessaccesspolicy.
	*/
	public static base_response delete(nitro_service client, vpnclientlessaccesspolicy resource) throws Exception {
		vpnclientlessaccesspolicy deleteresource = new vpnclientlessaccesspolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnclientlessaccesspolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnclientlessaccesspolicy deleteresources[] = new vpnclientlessaccesspolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpnclientlessaccesspolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnclientlessaccesspolicy resources.
	*/
	public static base_responses delete(nitro_service client, vpnclientlessaccesspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnclientlessaccesspolicy deleteresources[] = new vpnclientlessaccesspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnclientlessaccesspolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpnclientlessaccesspolicy.
	*/
	public static base_response update(nitro_service client, vpnclientlessaccesspolicy resource) throws Exception {
		vpnclientlessaccesspolicy updateresource = new vpnclientlessaccesspolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.profilename = resource.profilename;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpnclientlessaccesspolicy resources.
	*/
	public static base_responses update(nitro_service client, vpnclientlessaccesspolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnclientlessaccesspolicy updateresources[] = new vpnclientlessaccesspolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnclientlessaccesspolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].profilename = resources[i].profilename;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpnclientlessaccesspolicy resources that are configured on netscaler.
	*/
	public static vpnclientlessaccesspolicy[] get(nitro_service service) throws Exception{
		vpnclientlessaccesspolicy obj = new vpnclientlessaccesspolicy();
		vpnclientlessaccesspolicy[] response = (vpnclientlessaccesspolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnclientlessaccesspolicy resources that are configured on netscaler.
	*/
	public static vpnclientlessaccesspolicy[] get(nitro_service service, options option) throws Exception{
		vpnclientlessaccesspolicy obj = new vpnclientlessaccesspolicy();
		vpnclientlessaccesspolicy[] response = (vpnclientlessaccesspolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnclientlessaccesspolicy resource of given name .
	*/
	public static vpnclientlessaccesspolicy get(nitro_service service, String name) throws Exception{
		vpnclientlessaccesspolicy obj = new vpnclientlessaccesspolicy();
		obj.set_name(name);
		vpnclientlessaccesspolicy response = (vpnclientlessaccesspolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnclientlessaccesspolicy resources of given names .
	*/
	public static vpnclientlessaccesspolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpnclientlessaccesspolicy response[] = new vpnclientlessaccesspolicy[name.length];
			vpnclientlessaccesspolicy obj[] = new vpnclientlessaccesspolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpnclientlessaccesspolicy();
				obj[i].set_name(name[i]);
				response[i] = (vpnclientlessaccesspolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnclientlessaccesspolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnclientlessaccesspolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnclientlessaccesspolicy obj = new vpnclientlessaccesspolicy();
		options option = new options();
		option.set_filter(filter);
		vpnclientlessaccesspolicy[] response = (vpnclientlessaccesspolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnclientlessaccesspolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnclientlessaccesspolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnclientlessaccesspolicy obj = new vpnclientlessaccesspolicy();
		options option = new options();
		option.set_filter(filter);
		vpnclientlessaccesspolicy[] response = (vpnclientlessaccesspolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnclientlessaccesspolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnclientlessaccesspolicy obj = new vpnclientlessaccesspolicy();
		options option = new options();
		option.set_count(true);
		vpnclientlessaccesspolicy[] response = (vpnclientlessaccesspolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnclientlessaccesspolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnclientlessaccesspolicy obj = new vpnclientlessaccesspolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnclientlessaccesspolicy[] response = (vpnclientlessaccesspolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnclientlessaccesspolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnclientlessaccesspolicy obj = new vpnclientlessaccesspolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnclientlessaccesspolicy[] response = (vpnclientlessaccesspolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
