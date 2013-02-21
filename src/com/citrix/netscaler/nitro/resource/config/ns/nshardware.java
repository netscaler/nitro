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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nshardware_response extends base_response
{
	public nshardware nshardware;
}
/**
* Configuration for hardware resource.
*/

public class nshardware extends base_resource
{

	//------- Read only Parameter ---------;

	private String hwdescription;
	private Long sysid;
	private Integer manufactureday;
	private Integer manufacturemonth;
	private Integer manufactureyear;
	private Integer cpufrequncy;
	private Integer hostid;
	private String host;
	private String serialno;
	private String encodedserialno;

	/**
	* <pre>
	* Hardware and it's ports detail.
	* </pre>
	*/
	public String get_hwdescription() throws Exception {
		return this.hwdescription;
	}

	/**
	* <pre>
	* System id.
	* </pre>
	*/
	public Long get_sysid() throws Exception {
		return this.sysid;
	}

	/**
	* <pre>
	* Manufacturing day.
	* </pre>
	*/
	public Integer get_manufactureday() throws Exception {
		return this.manufactureday;
	}

	/**
	* <pre>
	* Manufacturing month.
	* </pre>
	*/
	public Integer get_manufacturemonth() throws Exception {
		return this.manufacturemonth;
	}

	/**
	* <pre>
	* Manufacturing year.
	* </pre>
	*/
	public Integer get_manufactureyear() throws Exception {
		return this.manufactureyear;
	}

	/**
	* <pre>
	* CPU Frequency.
	* </pre>
	*/
	public Integer get_cpufrequncy() throws Exception {
		return this.cpufrequncy;
	}

	/**
	* <pre>
	* host id.
	* </pre>
	*/
	public Integer get_hostid() throws Exception {
		return this.hostid;
	}

	/**
	* <pre>
	* host id.
	* </pre>
	*/
	public String get_host() throws Exception {
		return this.host;
	}

	/**
	* <pre>
	* Serial no.
	* </pre>
	*/
	public String get_serialno() throws Exception {
		return this.serialno;
	}

	/**
	* <pre>
	* Encoded serial no.
	* </pre>
	*/
	public String get_encodedserialno() throws Exception {
		return this.encodedserialno;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nshardware[] resources = new nshardware[1];
		nshardware_response result = (nshardware_response) service.get_payload_formatter().string_to_resource(nshardware_response.class, response);
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
		resources[0] = result.nshardware;
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
	* Use this API to fetch all the nshardware resources that are configured on netscaler.
	*/
	public static nshardware get(nitro_service service) throws Exception{
		nshardware obj = new nshardware();
		nshardware[] response = (nshardware[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nshardware resources that are configured on netscaler.
	*/
	public static nshardware get(nitro_service service,  options option) throws Exception{
		nshardware obj = new nshardware();
		nshardware[] response = (nshardware[])obj.get_resources(service,option);
		return response[0];
	}

}
