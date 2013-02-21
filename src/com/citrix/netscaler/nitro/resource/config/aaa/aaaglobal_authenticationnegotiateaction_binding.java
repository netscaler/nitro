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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaaglobal_authenticationnegotiateaction_binding_response extends base_response
{
	public aaaglobal_authenticationnegotiateaction_binding[] aaaglobal_authenticationnegotiateaction_binding;
}
/**
	* Binding class showing the authenticationnegotiateaction that can be bound to aaaglobal.
	*/

public class aaaglobal_authenticationnegotiateaction_binding extends base_resource
{
	private String windowsprofile;
	private String policy;
	private Long priority;
	private Long bindpolicytype;
	private Long __count;

	/**
	* <pre>
	* Priority of the bound policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority of the bound policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority of the bound policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The policy to be unbound to the AAA user.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policy(String policy) throws Exception{
		this.policy = policy;
	}

	/**
	* <pre>
	* The policy to be unbound to the AAA user.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policy() throws Exception {
		return this.policy;
	}

	/**
	* <pre>
	* Name of the negotiate profile to be bound.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public void set_windowsprofile(String windowsprofile) throws Exception{
		this.windowsprofile = windowsprofile;
	}

	/**
	* <pre>
	* Name of the negotiate profile to be bound.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public String get_windowsprofile() throws Exception {
		return this.windowsprofile;
	}

	/**
	* <pre>
	* Bound policy type.
	* </pre>
	*/
	public Long get_bindpolicytype() throws Exception {
		return this.bindpolicytype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaaglobal_authenticationnegotiateaction_binding_response result = (aaaglobal_authenticationnegotiateaction_binding_response) service.get_payload_formatter().string_to_resource(aaaglobal_authenticationnegotiateaction_binding_response.class, response);
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
		return result.aaaglobal_authenticationnegotiateaction_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, aaaglobal_authenticationnegotiateaction_binding resource) throws Exception {
		aaaglobal_authenticationnegotiateaction_binding updateresource = new aaaglobal_authenticationnegotiateaction_binding();
		updateresource.policy = resource.policy;
		updateresource.priority = resource.priority;
		updateresource.windowsprofile = resource.windowsprofile;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, aaaglobal_authenticationnegotiateaction_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaaglobal_authenticationnegotiateaction_binding updateresources[] = new aaaglobal_authenticationnegotiateaction_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaaglobal_authenticationnegotiateaction_binding();
				updateresources[i].policy = resources[i].policy;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].windowsprofile = resources[i].windowsprofile;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, aaaglobal_authenticationnegotiateaction_binding resource) throws Exception {
		aaaglobal_authenticationnegotiateaction_binding deleteresource = new aaaglobal_authenticationnegotiateaction_binding();
		deleteresource.policy = resource.policy;
		deleteresource.windowsprofile = resource.windowsprofile;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, aaaglobal_authenticationnegotiateaction_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaaglobal_authenticationnegotiateaction_binding deleteresources[] = new aaaglobal_authenticationnegotiateaction_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaaglobal_authenticationnegotiateaction_binding();
				deleteresources[i].policy = resources[i].policy;
				deleteresources[i].windowsprofile = resources[i].windowsprofile;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a aaaglobal_authenticationnegotiateaction_binding resources.
	*/
	public static aaaglobal_authenticationnegotiateaction_binding[] get(nitro_service service) throws Exception{
		aaaglobal_authenticationnegotiateaction_binding obj = new aaaglobal_authenticationnegotiateaction_binding();
		aaaglobal_authenticationnegotiateaction_binding response[] = (aaaglobal_authenticationnegotiateaction_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaaglobal_authenticationnegotiateaction_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaaglobal_authenticationnegotiateaction_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		aaaglobal_authenticationnegotiateaction_binding obj = new aaaglobal_authenticationnegotiateaction_binding();
		options option = new options();
		option.set_filter(filter);
		aaaglobal_authenticationnegotiateaction_binding[] response = (aaaglobal_authenticationnegotiateaction_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaaglobal_authenticationnegotiateaction_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaaglobal_authenticationnegotiateaction_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaaglobal_authenticationnegotiateaction_binding obj = new aaaglobal_authenticationnegotiateaction_binding();
		options option = new options();
		option.set_filter(filter);
		aaaglobal_authenticationnegotiateaction_binding[] response = (aaaglobal_authenticationnegotiateaction_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count aaaglobal_authenticationnegotiateaction_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		aaaglobal_authenticationnegotiateaction_binding obj = new aaaglobal_authenticationnegotiateaction_binding();
		options option = new options();
		option.set_count(true);
		aaaglobal_authenticationnegotiateaction_binding response[] = (aaaglobal_authenticationnegotiateaction_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaaglobal_authenticationnegotiateaction_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		aaaglobal_authenticationnegotiateaction_binding obj = new aaaglobal_authenticationnegotiateaction_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaaglobal_authenticationnegotiateaction_binding[] response = (aaaglobal_authenticationnegotiateaction_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaaglobal_authenticationnegotiateaction_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaaglobal_authenticationnegotiateaction_binding obj = new aaaglobal_authenticationnegotiateaction_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaaglobal_authenticationnegotiateaction_binding[] response = (aaaglobal_authenticationnegotiateaction_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}