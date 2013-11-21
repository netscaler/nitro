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

class sslcrl_serialnumber_binding_response extends base_response
{
	public sslcrl_serialnumber_binding[] sslcrl_serialnumber_binding;
}
/**
	* Binding class showing the serialnumber that can be bound to sslcrl.
	*/

public class sslcrl_serialnumber_binding extends base_resource
{
	private String number;
	private String date;
	private String crlname;
	private Long __count;

	/**
	* <pre>
	* Certificate Serial number.
	* </pre>
	*/
	public void set_number(String number) throws Exception{
		this.number = number;
	}

	/**
	* <pre>
	* Certificate Serial number.
	* </pre>
	*/
	public String get_number() throws Exception {
		return this.number;
	}

	/**
	* <pre>
	* Name of the CRL for which to show detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public void set_crlname(String crlname) throws Exception{
		this.crlname = crlname;
	}

	/**
	* <pre>
	* Name of the CRL for which to show detailed information.<br> Minimum length =  1
	* </pre>
	*/
	public String get_crlname() throws Exception {
		return this.crlname;
	}

	/**
	* <pre>
	* Certificate Revocation date.
	* </pre>
	*/
	public String get_date() throws Exception {
		return this.date;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcrl_serialnumber_binding_response result = (sslcrl_serialnumber_binding_response) service.get_payload_formatter().string_to_resource(sslcrl_serialnumber_binding_response.class, response);
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
		return result.sslcrl_serialnumber_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.crlname;
	}

	/**
	* Use this API to fetch sslcrl_serialnumber_binding resources of given name .
	*/
	public static sslcrl_serialnumber_binding[] get(nitro_service service, String crlname) throws Exception{
		sslcrl_serialnumber_binding obj = new sslcrl_serialnumber_binding();
		obj.set_crlname(crlname);
		sslcrl_serialnumber_binding response[] = (sslcrl_serialnumber_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcrl_serialnumber_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslcrl_serialnumber_binding[] get_filtered(nitro_service service, String crlname, String filter) throws Exception{
		sslcrl_serialnumber_binding obj = new sslcrl_serialnumber_binding();
		obj.set_crlname(crlname);
		options option = new options();
		option.set_filter(filter);
		sslcrl_serialnumber_binding[] response = (sslcrl_serialnumber_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcrl_serialnumber_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslcrl_serialnumber_binding[] get_filtered(nitro_service service, String crlname, filtervalue[] filter) throws Exception{
		sslcrl_serialnumber_binding obj = new sslcrl_serialnumber_binding();
		obj.set_crlname(crlname);
		options option = new options();
		option.set_filter(filter);
		sslcrl_serialnumber_binding[] response = (sslcrl_serialnumber_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslcrl_serialnumber_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String crlname) throws Exception{
		sslcrl_serialnumber_binding obj = new sslcrl_serialnumber_binding();
		obj.set_crlname(crlname);
		options option = new options();
		option.set_count(true);
		sslcrl_serialnumber_binding response[] = (sslcrl_serialnumber_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcrl_serialnumber_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String crlname, String filter) throws Exception{
		sslcrl_serialnumber_binding obj = new sslcrl_serialnumber_binding();
		obj.set_crlname(crlname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcrl_serialnumber_binding[] response = (sslcrl_serialnumber_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcrl_serialnumber_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String crlname, filtervalue[] filter) throws Exception{
		sslcrl_serialnumber_binding obj = new sslcrl_serialnumber_binding();
		obj.set_crlname(crlname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcrl_serialnumber_binding[] response = (sslcrl_serialnumber_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}