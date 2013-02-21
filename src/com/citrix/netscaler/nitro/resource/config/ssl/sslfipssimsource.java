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

class sslfipssimsource_response extends base_response
{
	public sslfipssimsource sslfipssimsource;
}
/**
* Configuration for FIPsSIM source resource.
*/

public class sslfipssimsource extends base_resource
{
	private String targetsecret;
	private String sourcesecret;
	private String certfile;

	/**
	* <pre>
	* The file name and path for the target FIPS system's secret data. The default input path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_targetsecret(String targetsecret) throws Exception{
		this.targetsecret = targetsecret;
	}

	/**
	* <pre>
	* The file name and path for the target FIPS system's secret data. The default input path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_targetsecret() throws Exception {
		return this.targetsecret;
	}

	/**
	* <pre>
	* The file name and path for storing the source FIPS system's secret data. The default output path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sourcesecret(String sourcesecret) throws Exception{
		this.sourcesecret = sourcesecret;
	}

	/**
	* <pre>
	* The file name and path for storing the source FIPS system's secret data. The default output path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sourcesecret() throws Exception {
		return this.sourcesecret;
	}

	/**
	* <pre>
	* The file name and path where the source FIPS system's certificate is to be stored. The default output path for the certificate file is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_certfile(String certfile) throws Exception{
		this.certfile = certfile;
	}

	/**
	* <pre>
	* The file name and path where the source FIPS system's certificate is to be stored. The default output path for the certificate file is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_certfile() throws Exception {
		return this.certfile;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslfipssimsource[] resources = new sslfipssimsource[1];
		sslfipssimsource_response result = (sslfipssimsource_response) service.get_payload_formatter().string_to_resource(sslfipssimsource_response.class, response);
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
		resources[0] = result.sslfipssimsource;
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
	* Use this API to enable sslfipssimsource.
	*/
	public static base_response enable(nitro_service client, sslfipssimsource resource) throws Exception {
		sslfipssimsource enableresource = new sslfipssimsource();
		enableresource.targetsecret = resource.targetsecret;
		enableresource.sourcesecret = resource.sourcesecret;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to init sslfipssimsource.
	*/
	public static base_response init(nitro_service client, sslfipssimsource resource) throws Exception {
		sslfipssimsource initresource = new sslfipssimsource();
		initresource.certfile = resource.certfile;
		return initresource.perform_operation(client,"init");
	}

}
