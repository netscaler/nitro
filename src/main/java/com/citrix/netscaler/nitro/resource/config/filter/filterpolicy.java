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

package com.citrix.netscaler.nitro.resource.config.filter;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class filterpolicy_response extends base_response
{
	public filterpolicy[] filterpolicy;
}
/**
* Configuration for filter policy resource.
*/

public class filterpolicy extends base_resource
{
	private String name;
	private String rule;
	private String reqaction;
	private String resaction;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long __count;

	/**
	* <pre>
	* The name of the new filter policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the new filter policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The expression which sets the condition for application of the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The expression which sets the condition for application of the policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the action to be performed on the request. The string value can be a created filter action or one of the following built-in actions:
	RESET - Sends the TCP reset and closes the connection to the peer.
	DROP - Silently closes the connection to the peer without sending the TCP FIN.

Note that the request action can not be specified if the rule has some condition to be evaluated for response.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reqaction(String reqaction) throws Exception{
		this.reqaction = reqaction;
	}

	/**
	* <pre>
	* The name of the action to be performed on the request. The string value can be a created filter action or one of the following built-in actions:
	RESET - Sends the TCP reset and closes the connection to the peer.
	DROP - Silently closes the connection to the peer without sending the TCP FIN.

Note that the request action can not be specified if the rule has some condition to be evaluated for response.<br> Minimum length =  1
	* </pre>
	*/
	public String get_reqaction() throws Exception {
		return this.reqaction;
	}

	/**
	* <pre>
	* The action to be performed on the response. The string value can be a filter action created filter action or a built-in action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_resaction(String resaction) throws Exception{
		this.resaction = resaction;
	}

	/**
	* <pre>
	* The action to be performed on the response. The string value can be a filter action created filter action or a built-in action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_resaction() throws Exception {
		return this.resaction;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		filterpolicy_response result = (filterpolicy_response) service.get_payload_formatter().string_to_resource(filterpolicy_response.class, response);
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
		return result.filterpolicy;
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
	* Use this API to add filterpolicy.
	*/
	public static base_response add(nitro_service client, filterpolicy resource) throws Exception {
		filterpolicy addresource = new filterpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.reqaction = resource.reqaction;
		addresource.resaction = resource.resaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add filterpolicy resources.
	*/
	public static base_responses add(nitro_service client, filterpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterpolicy addresources[] = new filterpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new filterpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].reqaction = resources[i].reqaction;
				addresources[i].resaction = resources[i].resaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete filterpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		filterpolicy deleteresource = new filterpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete filterpolicy.
	*/
	public static base_response delete(nitro_service client, filterpolicy resource) throws Exception {
		filterpolicy deleteresource = new filterpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete filterpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			filterpolicy deleteresources[] = new filterpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new filterpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete filterpolicy resources.
	*/
	public static base_responses delete(nitro_service client, filterpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterpolicy deleteresources[] = new filterpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new filterpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update filterpolicy.
	*/
	public static base_response update(nitro_service client, filterpolicy resource) throws Exception {
		filterpolicy updateresource = new filterpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.reqaction = resource.reqaction;
		updateresource.resaction = resource.resaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update filterpolicy resources.
	*/
	public static base_responses update(nitro_service client, filterpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterpolicy updateresources[] = new filterpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new filterpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].reqaction = resources[i].reqaction;
				updateresources[i].resaction = resources[i].resaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the filterpolicy resources that are configured on netscaler.
	*/
	public static filterpolicy[] get(nitro_service service) throws Exception{
		filterpolicy obj = new filterpolicy();
		filterpolicy[] response = (filterpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the filterpolicy resources that are configured on netscaler.
	*/
	public static filterpolicy[] get(nitro_service service, options option) throws Exception{
		filterpolicy obj = new filterpolicy();
		filterpolicy[] response = (filterpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filterpolicy resource of given name .
	*/
	public static filterpolicy get(nitro_service service, String name) throws Exception{
		filterpolicy obj = new filterpolicy();
		obj.set_name(name);
		filterpolicy response = (filterpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch filterpolicy resources of given names .
	*/
	public static filterpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			filterpolicy response[] = new filterpolicy[name.length];
			filterpolicy obj[] = new filterpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new filterpolicy();
				obj[i].set_name(name[i]);
				response[i] = (filterpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of filterpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static filterpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		filterpolicy obj = new filterpolicy();
		options option = new options();
		option.set_filter(filter);
		filterpolicy[] response = (filterpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of filterpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static filterpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		filterpolicy obj = new filterpolicy();
		options option = new options();
		option.set_filter(filter);
		filterpolicy[] response = (filterpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the filterpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		filterpolicy obj = new filterpolicy();
		options option = new options();
		option.set_count(true);
		filterpolicy[] response = (filterpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of filterpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		filterpolicy obj = new filterpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filterpolicy[] response = (filterpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of filterpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		filterpolicy obj = new filterpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filterpolicy[] response = (filterpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
