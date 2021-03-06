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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslservicegroup_sslcipher_binding_response extends base_response
{
	public sslservicegroup_sslcipher_binding[] sslservicegroup_sslcipher_binding;
}
/**
	* Binding class showing the sslcipher that can be bound to sslservicegroup.
	*/

public class sslservicegroup_sslcipher_binding extends base_resource
{
	private String cipheraliasname;
	private String description;
	private String servicegroupname;
	private Long __count;

	/**
	* <pre>
	* The name of the cipher group/alias/name configured for the SSL service group.
	* </pre>
	*/
	public void set_cipheraliasname(String cipheraliasname) throws Exception{
		this.cipheraliasname = cipheraliasname;
	}

	/**
	* <pre>
	* The name of the cipher group/alias/name configured for the SSL service group.
	* </pre>
	*/
	public String get_cipheraliasname() throws Exception {
		return this.cipheraliasname;
	}

	/**
	* <pre>
	* The name of the SSL service to which the SSL policy needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of the SSL service to which the SSL policy needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* The description of the cipher.
	* </pre>
	*/
	public void set_description(String description) throws Exception{
		this.description = description;
	}

	/**
	* <pre>
	* The description of the cipher.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslservicegroup_sslcipher_binding_response result = (sslservicegroup_sslcipher_binding_response) service.get_payload_formatter().string_to_resource(sslservicegroup_sslcipher_binding_response.class, response);
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
		return result.sslservicegroup_sslcipher_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to fetch sslservicegroup_sslcipher_binding resources of given name .
	*/
	public static sslservicegroup_sslcipher_binding[] get(nitro_service service, String servicegroupname) throws Exception{
		sslservicegroup_sslcipher_binding obj = new sslservicegroup_sslcipher_binding();
		obj.set_servicegroupname(servicegroupname);
		sslservicegroup_sslcipher_binding response[] = (sslservicegroup_sslcipher_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservicegroup_sslcipher_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslservicegroup_sslcipher_binding[] get_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		sslservicegroup_sslcipher_binding obj = new sslservicegroup_sslcipher_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		sslservicegroup_sslcipher_binding[] response = (sslservicegroup_sslcipher_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservicegroup_sslcipher_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslservicegroup_sslcipher_binding[] get_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		sslservicegroup_sslcipher_binding obj = new sslservicegroup_sslcipher_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		sslservicegroup_sslcipher_binding[] response = (sslservicegroup_sslcipher_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslservicegroup_sslcipher_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String servicegroupname) throws Exception{
		sslservicegroup_sslcipher_binding obj = new sslservicegroup_sslcipher_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		sslservicegroup_sslcipher_binding response[] = (sslservicegroup_sslcipher_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservicegroup_sslcipher_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		sslservicegroup_sslcipher_binding obj = new sslservicegroup_sslcipher_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservicegroup_sslcipher_binding[] response = (sslservicegroup_sslcipher_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservicegroup_sslcipher_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		sslservicegroup_sslcipher_binding obj = new sslservicegroup_sslcipher_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservicegroup_sslcipher_binding[] response = (sslservicegroup_sslcipher_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class ocspcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class crlcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}

}