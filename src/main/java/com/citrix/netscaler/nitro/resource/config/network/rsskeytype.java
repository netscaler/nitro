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

class rsskeytype_response extends base_response
{
	public rsskeytype rsskeytype;
}
/**
* Configuration for RSS key type resource.
*/

public class rsskeytype extends base_resource
{
	private String rsstype;

	/**
	* <pre>
	* Type of RSS key, possible values ASYMMETRIC and SYMMETRIC. .<br> Default value: ASYMMETRIC<br> Possible values = ASYMMETRIC, SYMMETRIC
	* </pre>
	*/
	public void set_rsstype(String rsstype) throws Exception{
		this.rsstype = rsstype;
	}

	/**
	* <pre>
	* Type of RSS key, possible values ASYMMETRIC and SYMMETRIC. .<br> Default value: ASYMMETRIC<br> Possible values = ASYMMETRIC, SYMMETRIC
	* </pre>
	*/
	public String get_rsstype() throws Exception {
		return this.rsstype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		rsskeytype[] resources = new rsskeytype[1];
		rsskeytype_response result = (rsskeytype_response) service.get_payload_formatter().string_to_resource(rsskeytype_response.class, response);
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
		resources[0] = result.rsskeytype;
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
	* Use this API to update rsskeytype.
	*/
	public static base_response update(nitro_service client, rsskeytype resource) throws Exception {
		rsskeytype updateresource = new rsskeytype();
		updateresource.rsstype = resource.rsstype;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to fetch all the rsskeytype resources that are configured on netscaler.
	*/
	public static rsskeytype get(nitro_service service) throws Exception{
		rsskeytype obj = new rsskeytype();
		rsskeytype[] response = (rsskeytype[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the rsskeytype resources that are configured on netscaler.
	*/
	public static rsskeytype get(nitro_service service,  options option) throws Exception{
		rsskeytype obj = new rsskeytype();
		rsskeytype[] response = (rsskeytype[])obj.get_resources(service,option);
		return response[0];
	}

	public static class rsstypeEnum {
		public static final String ASYMMETRIC = "ASYMMETRIC";
		public static final String SYMMETRIC = "SYMMETRIC";
	}
}
