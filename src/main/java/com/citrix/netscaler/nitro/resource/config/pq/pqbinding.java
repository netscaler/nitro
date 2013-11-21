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

package com.citrix.netscaler.nitro.resource.config.pq;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class pqbinding_response extends base_response
{
	public pqbinding[] pqbinding;
}
/**
* Configuration for PQ bindings resource.
*/

public class pqbinding extends base_resource
{
	private String vservername;

	//------- Read only Parameter ---------;

	private String policyname;
	private String rule;
	private Long priority;
	private Long weight;
	private Long qdepth;
	private Long polqdepth;
	private Long hits;
	private Long __count;

	/**
	* <pre>
	* Name of the load balancing virtual server for which to display the priority queuing policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* Name of the load balancing virtual server for which to display the priority queuing policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* The name of the priority queuing policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The condition for applying the policy.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The priority of queuing the request.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Weight.
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* Queue Depth.
	* </pre>
	*/
	public Long get_qdepth() throws Exception {
		return this.qdepth;
	}

	/**
	* <pre>
	* Policy Queue Depth.
	* </pre>
	*/
	public Long get_polqdepth() throws Exception {
		return this.polqdepth;
	}

	/**
	* <pre>
	* Total number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		pqbinding_response result = (pqbinding_response) service.get_payload_formatter().string_to_resource(pqbinding_response.class, response);
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
		return result.pqbinding;
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
	* Use this API to fetch a pqbinding resource.
	*/
	public static pqbinding get(nitro_service service, pqbinding obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		pqbinding response = (pqbinding) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a pqbinding resources.
	*/
	public static pqbinding[] get(nitro_service service, pqbinding obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			pqbinding response[] = new pqbinding[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (pqbinding) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the pqbinding resources that are configured on netscaler.
	* This uses pqbinding_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static pqbinding[] get(nitro_service service, pqbinding_args args) throws Exception{
		pqbinding obj = new pqbinding();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		pqbinding[] response = (pqbinding[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of pqbinding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static pqbinding[] get_filtered(nitro_service service, pqbinding obj, String filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		pqbinding[] response = (pqbinding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of pqbinding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static pqbinding[] get_filtered(nitro_service service, pqbinding obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		pqbinding[] response = (pqbinding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the pqbinding resources configured on NetScaler.
	*/
	public static long count(nitro_service service, pqbinding obj) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		pqbinding[] response = (pqbinding[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of pqbinding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, pqbinding obj, String filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		pqbinding[] response = (pqbinding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of pqbinding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, pqbinding obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		pqbinding[] response = (pqbinding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
