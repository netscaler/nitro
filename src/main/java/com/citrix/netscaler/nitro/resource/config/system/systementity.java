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

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systementity_response extends base_response
{
	public systementity systementity;
}
/**
* Configuration for entity resource.
*/

public class systementity extends base_resource
{
	private String type;
	private String datasource;
	private Integer core;

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* Specify the entity type.
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Specify the entity type.
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public void set_datasource(String datasource) throws Exception{
		this.datasource = datasource;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public String get_datasource() throws Exception {
		return this.datasource;
	}

	/**
	* <pre>
	* Specify core.
	* </pre>
	*/
	public void set_core(int core) throws Exception {
		this.core = new Integer(core);
	}

	/**
	* <pre>
	* Specify core.
	* </pre>
	*/
	public void set_core(Integer core) throws Exception{
		this.core = core;
	}

	/**
	* <pre>
	* Specify core.
	* </pre>
	*/
	public Integer get_core() throws Exception {
		return this.core;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_response() throws Exception {
		return this.response;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		systementity[] resources = new systementity[1];
		systementity_response result = (systementity_response) service.get_payload_formatter().string_to_resource(systementity_response.class, response);
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
		resources[0] = result.systementity;
		return resources;
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
	* Use this API to fetch a systementity resource.
	*/
	public static systementity get(nitro_service service, systementity obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		systementity response = (systementity) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch all the systementity resources that are configured on netscaler.
	* This uses systementity_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static systementity[] get(nitro_service service, systementity_args args) throws Exception{
		systementity obj = new systementity();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		systementity[] response = (systementity[])obj.get_resources(service, option);
		return response;
	}

}
