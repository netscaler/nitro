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

class lacp_response extends base_response
{
	public lacp[] lacp;
}
/**
* Configuration for Link aggregation control protocol resource.
*/

public class lacp extends base_resource
{
	private Long syspriority;

	//------- Read only Parameter ---------;

	private String devicename;
	private String mac;
	private Long flags;
	private Long lacpkey;
	private Long clustersyspriority;
	private String clustermac;
	private Long __count;

	/**
	* <pre>
	* LACP system priority.<br> Default value: 32768<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_syspriority(long syspriority) throws Exception {
		this.syspriority = new Long(syspriority);
	}

	/**
	* <pre>
	* LACP system priority.<br> Default value: 32768<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_syspriority(Long syspriority) throws Exception{
		this.syspriority = syspriority;
	}

	/**
	* <pre>
	* LACP system priority.<br> Default value: 32768<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_syspriority() throws Exception {
		return this.syspriority;
	}

	/**
	* <pre>
	* Name of the channel.
	* </pre>
	*/
	public String get_devicename() throws Exception {
		return this.devicename;
	}

	/**
	* <pre>
	* LACP system MAC.
	* </pre>
	*/
	public String get_mac() throws Exception {
		return this.mac;
	}

	/**
	* <pre>
	* Flags of this channel.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* LACP key of this channel.
	* </pre>
	*/
	public Long get_lacpkey() throws Exception {
		return this.lacpkey;
	}

	/**
	* <pre>
	* LACP system (Cluster) priority.
	* </pre>
	*/
	public Long get_clustersyspriority() throws Exception {
		return this.clustersyspriority;
	}

	/**
	* <pre>
	* LACP system (Cluster) mac.
	* </pre>
	*/
	public String get_clustermac() throws Exception {
		return this.clustermac;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lacp_response result = (lacp_response) service.get_payload_formatter().string_to_resource(lacp_response.class, response);
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
		return result.lacp;
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
	* Use this API to update lacp.
	*/
	public static base_response update(nitro_service client, lacp resource) throws Exception {
		lacp updateresource = new lacp();
		updateresource.syspriority = resource.syspriority;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update lacp resources.
	*/
	public static base_responses update(nitro_service client, lacp resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lacp updateresources[] = new lacp[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lacp();
				updateresources[i].syspriority = resources[i].syspriority;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the lacp resources that are configured on netscaler.
	*/
	public static lacp[] get(nitro_service service) throws Exception{
		lacp obj = new lacp();
		lacp[] response = (lacp[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lacp resources that are configured on netscaler.
	*/
	public static lacp[] get(nitro_service service, options option) throws Exception{
		lacp obj = new lacp();
		lacp[] response = (lacp[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of lacp resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lacp[] get_filtered(nitro_service service, String filter) throws Exception{
		lacp obj = new lacp();
		options option = new options();
		option.set_filter(filter);
		lacp[] response = (lacp[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lacp resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lacp[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lacp obj = new lacp();
		options option = new options();
		option.set_filter(filter);
		lacp[] response = (lacp[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lacp resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lacp obj = new lacp();
		options option = new options();
		option.set_count(true);
		lacp[] response = (lacp[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lacp resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lacp obj = new lacp();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lacp[] response = (lacp[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lacp resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lacp obj = new lacp();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lacp[] response = (lacp[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
