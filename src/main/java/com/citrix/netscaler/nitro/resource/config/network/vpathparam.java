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

class vpathparam_response extends base_response
{
	public vpathparam vpathparam;
}
/**
* Configuration for VpathParam resource.
*/

public class vpathparam extends base_resource
{
	private String srcip;

	//------- Read only Parameter ---------;

	private String encapmode;

	/**
	* <pre>
	* source-IP address used for all vpath L3 encapsulations. Must be a MIP or SNIP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_srcip(String srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* source-IP address used for all vpath L3 encapsulations. Must be a MIP or SNIP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* Global vPath encapsulation mode.<br> Possible values = L2, L3, DISABLE
	* </pre>
	*/
	public String get_encapmode() throws Exception {
		return this.encapmode;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		vpathparam[] resources = new vpathparam[1];
		vpathparam_response result = (vpathparam_response) service.get_payload_formatter().string_to_resource(vpathparam_response.class, response);
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
		resources[0] = result.vpathparam;
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
	* Use this API to update vpathparam.
	*/
	public static base_response update(nitro_service client, vpathparam resource) throws Exception {
		vpathparam updateresource = new vpathparam();
		updateresource.srcip = resource.srcip;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of vpathparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpathparam resource, String[] args) throws Exception{
		vpathparam unsetresource = new vpathparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the vpathparam resources that are configured on netscaler.
	*/
	public static vpathparam get(nitro_service service) throws Exception{
		vpathparam obj = new vpathparam();
		vpathparam[] response = (vpathparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the vpathparam resources that are configured on netscaler.
	*/
	public static vpathparam get(nitro_service service,  options option) throws Exception{
		vpathparam obj = new vpathparam();
		vpathparam[] response = (vpathparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class encapmodeEnum {
		public static final String L2 = "L2";
		public static final String L3 = "L3";
		public static final String DISABLE = "DISABLE";
	}
}
