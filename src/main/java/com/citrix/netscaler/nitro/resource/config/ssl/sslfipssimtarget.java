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

class sslfipssimtarget_response extends base_response
{
	public sslfipssimtarget sslfipssimtarget;
}
/**
* Configuration for FIPS SIM Target resource.
*/

public class sslfipssimtarget extends base_resource
{
	private String keyvector;
	private String sourcesecret;
	private String certfile;
	private String targetsecret;

	/**
	* <pre>
	* Name of and, optionally, path to the target FIPS appliance's key vector. /nsconfig/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public void set_keyvector(String keyvector) throws Exception{
		this.keyvector = keyvector;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the target FIPS appliance's key vector. /nsconfig/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public String get_keyvector() throws Exception {
		return this.keyvector;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the source FIPS appliance's secret data. /nsconfig/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sourcesecret(String sourcesecret) throws Exception{
		this.sourcesecret = sourcesecret;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the source FIPS appliance's secret data. /nsconfig/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sourcesecret() throws Exception {
		return this.sourcesecret;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the source FIPS appliance's certificate file. /nsconfig/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public void set_certfile(String certfile) throws Exception{
		this.certfile = certfile;
	}

	/**
	* <pre>
	* Name of and, optionally, path to the source FIPS appliance's certificate file. /nsconfig/ssl/ is the default path.<br> Minimum length =  1
	* </pre>
	*/
	public String get_certfile() throws Exception {
		return this.certfile;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the target FIPS appliance's secret data. The default input path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_targetsecret(String targetsecret) throws Exception{
		this.targetsecret = targetsecret;
	}

	/**
	* <pre>
	* Name for and, optionally, path to the target FIPS appliance's secret data. The default input path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_targetsecret() throws Exception {
		return this.targetsecret;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslfipssimtarget[] resources = new sslfipssimtarget[1];
		sslfipssimtarget_response result = (sslfipssimtarget_response) service.get_payload_formatter().string_to_resource(sslfipssimtarget_response.class, response);
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
		resources[0] = result.sslfipssimtarget;
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
	* Use this API to enable sslfipssimtarget.
	*/
	public static base_response enable(nitro_service client, sslfipssimtarget resource) throws Exception {
		sslfipssimtarget enableresource = new sslfipssimtarget();
		enableresource.keyvector = resource.keyvector;
		enableresource.sourcesecret = resource.sourcesecret;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to init sslfipssimtarget.
	*/
	public static base_response init(nitro_service client, sslfipssimtarget resource) throws Exception {
		sslfipssimtarget initresource = new sslfipssimtarget();
		initresource.certfile = resource.certfile;
		initresource.keyvector = resource.keyvector;
		initresource.targetsecret = resource.targetsecret;
		return initresource.perform_operation(client,"init");
	}

}
