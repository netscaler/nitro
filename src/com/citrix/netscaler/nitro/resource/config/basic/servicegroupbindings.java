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

class servicegroupbindings_response extends base_response
{
	public servicegroupbindings[] servicegroupbindings;
}
/**
* Configuration for servicegroupbind resource.
*/

public class servicegroupbindings extends base_resource
{
	private String servicegroupname;

	//------- Read only Parameter ---------;

	private String ipaddress;
	private Integer port;
	private String state;
	private String svrstate;
	private String vservername;
	private Long __count;

	/**
	* <pre>
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* The IP address of the vserver.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* The port of the vserver.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The state of the service group.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The state of the vserver.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_svrstate() throws Exception {
		return this.svrstate;
	}

	/**
	* <pre>
	* The name of the vserver.
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		servicegroupbindings_response result = (servicegroupbindings_response) service.get_payload_formatter().string_to_resource(servicegroupbindings_response.class, response);
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
		return result.servicegroupbindings;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to fetch servicegroupbindings resource of given name .
	*/
	public static servicegroupbindings get(nitro_service service, String servicegroupname) throws Exception{
		servicegroupbindings obj = new servicegroupbindings();
		obj.set_servicegroupname(servicegroupname);
		servicegroupbindings response = (servicegroupbindings) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch servicegroupbindings resources of given names .
	*/
	public static servicegroupbindings[] get(nitro_service service, String servicegroupname[]) throws Exception{
		if (servicegroupname !=null && servicegroupname.length>0) {
			servicegroupbindings response[] = new servicegroupbindings[servicegroupname.length];
			servicegroupbindings obj[] = new servicegroupbindings[servicegroupname.length];
			for (int i=0;i<servicegroupname.length;i++) {
				obj[i] = new servicegroupbindings();
				obj[i].set_servicegroupname(servicegroupname[i]);
				response[i] = (servicegroupbindings) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of servicegroupbindings resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static servicegroupbindings[] get_filtered(nitro_service service, servicegroupbindings obj, String filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		servicegroupbindings[] response = (servicegroupbindings[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of servicegroupbindings resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static servicegroupbindings[] get_filtered(nitro_service service, servicegroupbindings obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		servicegroupbindings[] response = (servicegroupbindings[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the servicegroupbindings resources configured on NetScaler.
	*/
	public static long count(nitro_service service, servicegroupbindings obj) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		servicegroupbindings[] response = (servicegroupbindings[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of servicegroupbindings resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, servicegroupbindings obj, String filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		servicegroupbindings[] response = (servicegroupbindings[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of servicegroupbindings resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, servicegroupbindings obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		servicegroupbindings[] response = (servicegroupbindings[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class svrstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
	}
}
