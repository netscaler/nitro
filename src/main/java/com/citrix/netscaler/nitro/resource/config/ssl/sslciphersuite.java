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

class sslciphersuite_response extends base_response
{
	public sslciphersuite[] sslciphersuite;
}
/**
* Configuration for ciphersuite resource.
*/

public class sslciphersuite extends base_resource
{
	private String ciphername;

	//------- Read only Parameter ---------;

	private String description;
	private Long __count;

	/**
	* <pre>
	* Name of the cipher suite for which to show detailed information.
	* </pre>
	*/
	public void set_ciphername(String ciphername) throws Exception{
		this.ciphername = ciphername;
	}

	/**
	* <pre>
	* Name of the cipher suite for which to show detailed information.
	* </pre>
	*/
	public String get_ciphername() throws Exception {
		return this.ciphername;
	}

	/**
	* <pre>
	* Cipher suite description.
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
		sslciphersuite_response result = (sslciphersuite_response) service.get_payload_formatter().string_to_resource(sslciphersuite_response.class, response);
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
		return result.sslciphersuite;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ciphername;
	}

	/**
	* Use this API to fetch all the sslciphersuite resources that are configured on netscaler.
	*/
	public static sslciphersuite[] get(nitro_service service) throws Exception{
		sslciphersuite obj = new sslciphersuite();
		sslciphersuite[] response = (sslciphersuite[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslciphersuite resources that are configured on netscaler.
	*/
	public static sslciphersuite[] get(nitro_service service, options option) throws Exception{
		sslciphersuite obj = new sslciphersuite();
		sslciphersuite[] response = (sslciphersuite[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslciphersuite resource of given name .
	*/
	public static sslciphersuite get(nitro_service service, String ciphername) throws Exception{
		sslciphersuite obj = new sslciphersuite();
		obj.set_ciphername(ciphername);
		sslciphersuite response = (sslciphersuite) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslciphersuite resources of given names .
	*/
	public static sslciphersuite[] get(nitro_service service, String ciphername[]) throws Exception{
		if (ciphername !=null && ciphername.length>0) {
			sslciphersuite response[] = new sslciphersuite[ciphername.length];
			sslciphersuite obj[] = new sslciphersuite[ciphername.length];
			for (int i=0;i<ciphername.length;i++) {
				obj[i] = new sslciphersuite();
				obj[i].set_ciphername(ciphername[i]);
				response[i] = (sslciphersuite) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslciphersuite resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslciphersuite[] get_filtered(nitro_service service, String filter) throws Exception{
		sslciphersuite obj = new sslciphersuite();
		options option = new options();
		option.set_filter(filter);
		sslciphersuite[] response = (sslciphersuite[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslciphersuite resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslciphersuite[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslciphersuite obj = new sslciphersuite();
		options option = new options();
		option.set_filter(filter);
		sslciphersuite[] response = (sslciphersuite[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslciphersuite resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslciphersuite obj = new sslciphersuite();
		options option = new options();
		option.set_count(true);
		sslciphersuite[] response = (sslciphersuite[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslciphersuite resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslciphersuite obj = new sslciphersuite();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslciphersuite[] response = (sslciphersuite[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslciphersuite resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslciphersuite obj = new sslciphersuite();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslciphersuite[] response = (sslciphersuite[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
