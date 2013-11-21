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

class nsevents_response extends base_response
{
	public nsevents[] nsevents;
}
/**
* Configuration for events resource.
*/

public class nsevents extends base_resource
{
	private Long eventno;

	//------- Read only Parameter ---------;

	private Long time;
	private Long eventcode;
	private Long devid;
	private String devname;
	private String text;
	private Long data0;
	private Long data1;
	private Long data2;
	private Long data3;
	private Long __count;

	/**
	* <pre>
	* Event number starting from which events must be shown.
	* </pre>
	*/
	public void set_eventno(long eventno) throws Exception {
		this.eventno = new Long(eventno);
	}

	/**
	* <pre>
	* Event number starting from which events must be shown.
	* </pre>
	*/
	public void set_eventno(Long eventno) throws Exception{
		this.eventno = eventno;
	}

	/**
	* <pre>
	* Event number starting from which events must be shown.
	* </pre>
	*/
	public Long get_eventno() throws Exception {
		return this.eventno;
	}

	/**
	* <pre>
	* Event no.
	* </pre>
	*/
	public Long get_time() throws Exception {
		return this.time;
	}

	/**
	* <pre>
	* event Code.
	* </pre>
	*/
	public Long get_eventcode() throws Exception {
		return this.eventcode;
	}

	/**
	* <pre>
	* Device Name.
	* </pre>
	*/
	public Long get_devid() throws Exception {
		return this.devid;
	}

	/**
	* <pre>
	* Device Name.
	* </pre>
	*/
	public String get_devname() throws Exception {
		return this.devname;
	}

	/**
	* <pre>
	* Event no.
	* </pre>
	*/
	public String get_text() throws Exception {
		return this.text;
	}

	/**
	* <pre>
	* additional event information.
	* </pre>
	*/
	public Long get_data0() throws Exception {
		return this.data0;
	}

	/**
	* <pre>
	* additional event information.
	* </pre>
	*/
	public Long get_data1() throws Exception {
		return this.data1;
	}

	/**
	* <pre>
	* additional event information.
	* </pre>
	*/
	public Long get_data2() throws Exception {
		return this.data2;
	}

	/**
	* <pre>
	* additional event information.
	* </pre>
	*/
	public Long get_data3() throws Exception {
		return this.data3;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nsevents_response result = (nsevents_response) service.get_payload_formatter().string_to_resource(nsevents_response.class, response);
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
		return result.nsevents;
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
	* Use this API to fetch all the nsevents resources that are configured on netscaler.
	*/
	public static nsevents[] get(nitro_service service) throws Exception{
		nsevents obj = new nsevents();
		nsevents[] response = (nsevents[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nsevents resources that are configured on netscaler.
	*/
	public static nsevents[] get(nitro_service service, options option) throws Exception{
		nsevents obj = new nsevents();
		nsevents[] response = (nsevents[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the nsevents resources that are configured on netscaler.
	* This uses nsevents_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static nsevents[] get(nitro_service service, nsevents_args args) throws Exception{
		nsevents obj = new nsevents();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		nsevents[] response = (nsevents[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsevents resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nsevents[] get_filtered(nitro_service service, String filter) throws Exception{
		nsevents obj = new nsevents();
		options option = new options();
		option.set_filter(filter);
		nsevents[] response = (nsevents[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nsevents resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nsevents[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsevents obj = new nsevents();
		options option = new options();
		option.set_filter(filter);
		nsevents[] response = (nsevents[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nsevents resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nsevents obj = new nsevents();
		options option = new options();
		option.set_count(true);
		nsevents[] response = (nsevents[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nsevents resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nsevents obj = new nsevents();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsevents[] response = (nsevents[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nsevents resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nsevents obj = new nsevents();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nsevents[] response = (nsevents[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
