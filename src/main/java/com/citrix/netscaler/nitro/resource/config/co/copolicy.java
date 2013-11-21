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

package com.citrix.netscaler.nitro.resource.config.co;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class copolicy_response extends base_response
{
	public copolicy copolicy;
}
/**
* Configuration for content-optimization policy resource.
*/

public class copolicy extends base_resource
{
	private String name;
	private Boolean rule;
	private Boolean action;

	/**
	* <pre>
	* The name of the content optimization policy to be modified.<br> Default value: 0<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the content optimization policy to be modified.<br> Default value: 0<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The new rule to be associated with the content optimization policy.<br> Default value: 0
	* </pre>
	*/
	public void set_rule(boolean rule) throws Exception {
		this.rule = new Boolean(rule);
	}

	/**
	* <pre>
	* The new rule to be associated with the content optimization policy.<br> Default value: 0
	* </pre>
	*/
	public void set_rule(Boolean rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The new rule to be associated with the content optimization policy.<br> Default value: 0
	* </pre>
	*/
	public Boolean get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The optimization to be associated with the content optimization policy.<br> Default value: 0
	* </pre>
	*/
	public void set_action(boolean action) throws Exception {
		this.action = new Boolean(action);
	}

	/**
	* <pre>
	* The optimization to be associated with the content optimization policy.<br> Default value: 0
	* </pre>
	*/
	public void set_action(Boolean action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The optimization to be associated with the content optimization policy.<br> Default value: 0
	* </pre>
	*/
	public Boolean get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		copolicy[] resources = new copolicy[1];
		copolicy_response result = (copolicy_response) service.get_payload_formatter().string_to_resource(copolicy_response.class, response);
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
		resources[0] = result.copolicy;
		return resources;
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
	* Use this API to unset the properties of copolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, copolicy resource, String[] args) throws Exception{
		copolicy unsetresource = new copolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

}
