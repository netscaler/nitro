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

class vpnicaconnection_response extends base_response
{
	public vpnicaconnection[] vpnicaconnection;
}
/**
* Configuration for active ica connections resource.
*/

public class vpnicaconnection extends base_resource
{
	private String username;

	//------- Read only Parameter ---------;

	private String domain;
	private String srcip;
	private Integer srcport;
	private String destip;
	private Integer destport;
	private Long peid;
	private Long __count;

	/**
	* <pre>
	* User name for which to display connections.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* User name for which to display connections.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* The domain name.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* The client IP address.
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* The client port.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_srcport() throws Exception {
		return this.srcport;
	}

	/**
	* <pre>
	* The CPS server IP address.
	* </pre>
	*/
	public String get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* The CPS server port.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* Core id of the session owner.
	* </pre>
	*/
	public Long get_peid() throws Exception {
		return this.peid;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnicaconnection_response result = (vpnicaconnection_response) service.get_payload_formatter().string_to_resource(vpnicaconnection_response.class, response);
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
		return result.vpnicaconnection;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to fetch all the vpnicaconnection resources that are configured on netscaler.
	*/
	public static vpnicaconnection[] get(nitro_service service) throws Exception{
		vpnicaconnection obj = new vpnicaconnection();
		vpnicaconnection[] response = (vpnicaconnection[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnicaconnection resources that are configured on netscaler.
	*/
	public static vpnicaconnection[] get(nitro_service service, options option) throws Exception{
		vpnicaconnection obj = new vpnicaconnection();
		vpnicaconnection[] response = (vpnicaconnection[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the vpnicaconnection resources that are configured on netscaler.
	* This uses vpnicaconnection_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static vpnicaconnection[] get(nitro_service service, vpnicaconnection_args args) throws Exception{
		vpnicaconnection obj = new vpnicaconnection();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		vpnicaconnection[] response = (vpnicaconnection[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnicaconnection resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnicaconnection[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnicaconnection obj = new vpnicaconnection();
		options option = new options();
		option.set_filter(filter);
		vpnicaconnection[] response = (vpnicaconnection[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnicaconnection resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnicaconnection[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnicaconnection obj = new vpnicaconnection();
		options option = new options();
		option.set_filter(filter);
		vpnicaconnection[] response = (vpnicaconnection[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnicaconnection resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnicaconnection obj = new vpnicaconnection();
		options option = new options();
		option.set_count(true);
		vpnicaconnection[] response = (vpnicaconnection[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnicaconnection resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnicaconnection obj = new vpnicaconnection();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnicaconnection[] response = (vpnicaconnection[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnicaconnection resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnicaconnection obj = new vpnicaconnection();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnicaconnection[] response = (vpnicaconnection[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
