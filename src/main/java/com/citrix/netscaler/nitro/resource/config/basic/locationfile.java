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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class locationfile_response extends base_response
{
	public locationfile locationfile;
}
/**
* Configuration for location file resource.
*/

public class locationfile extends base_resource
{
	private String Locationfile;
	private String format;

	/**
	* <pre>
	* The name of the location file. The file name must include the full path. If the full path is not given, the default path /var/netscaler/locdb will be assumed. In high-availability mode, the static database should be stored in the same location on both systems.<br> Minimum length =  1
	* </pre>
	*/
	public void set_Locationfile(String Locationfile) throws Exception{
		this.Locationfile = Locationfile;
	}

	/**
	* <pre>
	* The name of the location file. The file name must include the full path. If the full path is not given, the default path /var/netscaler/locdb will be assumed. In high-availability mode, the static database should be stored in the same location on both systems.<br> Minimum length =  1
	* </pre>
	*/
	public String get_Locationfile() throws Exception {
		return this.Locationfile;
	}

	/**
	* <pre>
	* The format of the location file. This optional argument is used to tell the system how to understand the file.
The allowable values are:
format = netscaler, ip-country, ip-country-isp, ip-country-region-city, ip-country-region-city-isp, geoip-country, geoip-region, geoip-city, geoip-country-org, geoip-country-isp, geoip-city-isp-org .
<br> Default value: NSMAP_FORMAT_NETSCALER<br> Possible values = netscaler, ip-country, ip-country-isp, ip-country-region-city, ip-country-region-city-isp, geoip-country, geoip-region, geoip-city, geoip-country-org, geoip-country-isp, geoip-city-isp-org
	* </pre>
	*/
	public void set_format(String format) throws Exception{
		this.format = format;
	}

	/**
	* <pre>
	* The format of the location file. This optional argument is used to tell the system how to understand the file.
The allowable values are:
format = netscaler, ip-country, ip-country-isp, ip-country-region-city, ip-country-region-city-isp, geoip-country, geoip-region, geoip-city, geoip-country-org, geoip-country-isp, geoip-city-isp-org .
<br> Default value: NSMAP_FORMAT_NETSCALER<br> Possible values = netscaler, ip-country, ip-country-isp, ip-country-region-city, ip-country-region-city-isp, geoip-country, geoip-region, geoip-city, geoip-country-org, geoip-country-isp, geoip-city-isp-org
	* </pre>
	*/
	public String get_format() throws Exception {
		return this.format;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		locationfile[] resources = new locationfile[1];
		locationfile_response result = (locationfile_response) service.get_payload_formatter().string_to_resource(locationfile_response.class, response);
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
		resources[0] = result.locationfile;
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
	* Use this API to add locationfile.
	*/
	public static base_response add(nitro_service client, locationfile resource) throws Exception {
		locationfile addresource = new locationfile();
		addresource.Locationfile = resource.Locationfile;
		addresource.format = resource.format;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to delete locationfile.
	*/
	public static base_response delete(nitro_service client) throws Exception {
		locationfile deleteresource = new locationfile();
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to fetch all the locationfile resources that are configured on netscaler.
	*/
	public static locationfile get(nitro_service service) throws Exception{
		locationfile obj = new locationfile();
		locationfile[] response = (locationfile[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the locationfile resources that are configured on netscaler.
	*/
	public static locationfile get(nitro_service service,  options option) throws Exception{
		locationfile obj = new locationfile();
		locationfile[] response = (locationfile[])obj.get_resources(service,option);
		return response[0];
	}

	public static class formatEnum {
		public static final String netscaler = "netscaler";
		public static final String ip_country = "ip-country";
		public static final String ip_country_isp = "ip-country-isp";
		public static final String ip_country_region_city = "ip-country-region-city";
		public static final String ip_country_region_city_isp = "ip-country-region-city-isp";
		public static final String geoip_country = "geoip-country";
		public static final String geoip_region = "geoip-region";
		public static final String geoip_city = "geoip-city";
		public static final String geoip_country_org = "geoip-country-org";
		public static final String geoip_country_isp = "geoip-country-isp";
		public static final String geoip_city_isp_org = "geoip-city-isp-org";
	}
}
