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

class location_response extends base_response
{
	public location[] location;
}
/**
* Configuration for location resource.
*/

public class location extends base_resource
{
	private String ipfrom;
	private String ipto;
	private String preferredlocation;
	private Integer longitude;
	private Integer latitude;

	//------- Read only Parameter ---------;

	private String q1label;
	private String q2label;
	private String q3label;
	private String q4label;
	private String q5label;
	private String q6label;
	private Long __count;

	/**
	* <pre>
	* The start of the IP address range in dotted notation.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipfrom(String ipfrom) throws Exception{
		this.ipfrom = ipfrom;
	}

	/**
	* <pre>
	* The start of the IP address range in dotted notation.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipfrom() throws Exception {
		return this.ipfrom;
	}

	/**
	* <pre>
	* The end of the IP address range in dotted notation.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipto(String ipto) throws Exception{
		this.ipto = ipto;
	}

	/**
	* <pre>
	* The end of the IP address range in dotted notation.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipto() throws Exception {
		return this.ipto;
	}

	/**
	* <pre>
	* The qualifiers in dotted notation for the ipaddress range mentioned.<br> Minimum length =  1
	* </pre>
	*/
	public void set_preferredlocation(String preferredlocation) throws Exception{
		this.preferredlocation = preferredlocation;
	}

	/**
	* <pre>
	* The qualifiers in dotted notation for the ipaddress range mentioned.<br> Minimum length =  1
	* </pre>
	*/
	public String get_preferredlocation() throws Exception {
		return this.preferredlocation;
	}

	/**
	* <pre>
	* Longitude of the location.<br> Minimum value =  -180<br> Maximum value =  180
	* </pre>
	*/
	public void set_longitude(int longitude) throws Exception {
		this.longitude = new Integer(longitude);
	}

	/**
	* <pre>
	* Longitude of the location.<br> Minimum value =  -180<br> Maximum value =  180
	* </pre>
	*/
	public void set_longitude(Integer longitude) throws Exception{
		this.longitude = longitude;
	}

	/**
	* <pre>
	* Longitude of the location.<br> Minimum value =  -180<br> Maximum value =  180
	* </pre>
	*/
	public Integer get_longitude() throws Exception {
		return this.longitude;
	}

	/**
	* <pre>
	* Latitude of the location.<br> Minimum value =  -90<br> Maximum value =  90
	* </pre>
	*/
	public void set_latitude(int latitude) throws Exception {
		this.latitude = new Integer(latitude);
	}

	/**
	* <pre>
	* Latitude of the location.<br> Minimum value =  -90<br> Maximum value =  90
	* </pre>
	*/
	public void set_latitude(Integer latitude) throws Exception{
		this.latitude = latitude;
	}

	/**
	* <pre>
	* Latitude of the location.<br> Minimum value =  -90<br> Maximum value =  90
	* </pre>
	*/
	public Integer get_latitude() throws Exception {
		return this.latitude;
	}

	/**
	* <pre>
	* Least specific location qualifier.
	* </pre>
	*/
	public String get_q1label() throws Exception {
		return this.q1label;
	}

	/**
	* <pre>
	* Location qualifier 2.
	* </pre>
	*/
	public String get_q2label() throws Exception {
		return this.q2label;
	}

	/**
	* <pre>
	* Location qualifier 3.
	* </pre>
	*/
	public String get_q3label() throws Exception {
		return this.q3label;
	}

	/**
	* <pre>
	* Location qualifier 4.
	* </pre>
	*/
	public String get_q4label() throws Exception {
		return this.q4label;
	}

	/**
	* <pre>
	* Location qualifier 5.
	* </pre>
	*/
	public String get_q5label() throws Exception {
		return this.q5label;
	}

	/**
	* <pre>
	* Most specific location qualifier.
	* </pre>
	*/
	public String get_q6label() throws Exception {
		return this.q6label;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		location_response result = (location_response) service.get_payload_formatter().string_to_resource(location_response.class, response);
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
		return result.location;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipfrom;
	}

	/**
	* Use this API to add location.
	*/
	public static base_response add(nitro_service client, location resource) throws Exception {
		location addresource = new location();
		addresource.ipfrom = resource.ipfrom;
		addresource.ipto = resource.ipto;
		addresource.preferredlocation = resource.preferredlocation;
		addresource.longitude = resource.longitude;
		addresource.latitude = resource.latitude;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add location resources.
	*/
	public static base_responses add(nitro_service client, location resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			location addresources[] = new location[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new location();
				addresources[i].ipfrom = resources[i].ipfrom;
				addresources[i].ipto = resources[i].ipto;
				addresources[i].preferredlocation = resources[i].preferredlocation;
				addresources[i].longitude = resources[i].longitude;
				addresources[i].latitude = resources[i].latitude;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete location of given name.
	*/
	public static base_response delete(nitro_service client, String ipfrom) throws Exception {
		location deleteresource = new location();
		deleteresource.ipfrom = ipfrom;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete location.
	*/
	public static base_response delete(nitro_service client, location resource) throws Exception {
		location deleteresource = new location();
		deleteresource.ipfrom = resource.ipfrom;
		deleteresource.ipto = resource.ipto;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete location resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ipfrom[]) throws Exception {
		base_responses result = null;
		if (ipfrom != null && ipfrom.length > 0) {
			location deleteresources[] = new location[ipfrom.length];
			for (int i=0;i<ipfrom.length;i++){
				deleteresources[i] = new location();
				deleteresources[i].ipfrom = ipfrom[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete location resources.
	*/
	public static base_responses delete(nitro_service client, location resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			location deleteresources[] = new location[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new location();
				deleteresources[i].ipfrom = resources[i].ipfrom;
				deleteresources[i].ipto = resources[i].ipto;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the location resources that are configured on netscaler.
	*/
	public static location[] get(nitro_service service) throws Exception{
		location obj = new location();
		location[] response = (location[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the location resources that are configured on netscaler.
	*/
	public static location[] get(nitro_service service, options option) throws Exception{
		location obj = new location();
		location[] response = (location[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch location resource of given name .
	*/
	public static location get(nitro_service service, String ipfrom) throws Exception{
		location obj = new location();
		obj.set_ipfrom(ipfrom);
		location response = (location) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch location resources of given names .
	*/
	public static location[] get(nitro_service service, String ipfrom[]) throws Exception{
		if (ipfrom !=null && ipfrom.length>0) {
			location response[] = new location[ipfrom.length];
			location obj[] = new location[ipfrom.length];
			for (int i=0;i<ipfrom.length;i++) {
				obj[i] = new location();
				obj[i].set_ipfrom(ipfrom[i]);
				response[i] = (location) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of location resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static location[] get_filtered(nitro_service service, String filter) throws Exception{
		location obj = new location();
		options option = new options();
		option.set_filter(filter);
		location[] response = (location[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of location resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static location[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		location obj = new location();
		options option = new options();
		option.set_filter(filter);
		location[] response = (location[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the location resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		location obj = new location();
		options option = new options();
		option.set_count(true);
		location[] response = (location[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of location resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		location obj = new location();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		location[] response = (location[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of location resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		location obj = new location();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		location[] response = (location[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
