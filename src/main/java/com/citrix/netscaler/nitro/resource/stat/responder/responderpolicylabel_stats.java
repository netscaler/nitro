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

package com.citrix.netscaler.nitro.resource.stat.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderpolicylabel_response extends base_response
{
	public responderpolicylabel_stats[] responderpolicylabel;
}
/**
* Statistics for responder policy label resource.
*/

public class responderpolicylabel_stats extends base_resource
{
	private String labelname;
	private Long pipolicylabelhits;
	private Long pipolicylabelhitsrate;

	/**
	* <pre>
	* The name of the responder policy label for which statistics will be displayed.  If not given statistics are shown for all responder policylabels.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* The name of the responder policy label for which statistics will be displayed.  If not given statistics are shown for all responder policylabels.<br> Minimum length =  1
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Number of times policy label was invoked. 
	* </pre>
	*/
	public Long get_pipolicylabelhitsrate() throws Exception {
		return this.pipolicylabelhitsrate;
	}

	/**
	* <pre>
	* Number of times policy label was invoked. 
	* </pre>
	*/
	public Long get_pipolicylabelhits() throws Exception {
		return this.pipolicylabelhits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		responderpolicylabel_response result = (responderpolicylabel_response) service.get_payload_formatter().string_to_resource(responderpolicylabel_response.class, response);
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
		return result.responderpolicylabel;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to fetch the statistics of all responderpolicylabel_stats resources that are configured on netscaler.
	*/
	public static responderpolicylabel_stats[] get(nitro_service service) throws Exception{
		responderpolicylabel_stats obj = new responderpolicylabel_stats();
		responderpolicylabel_stats[] response = (responderpolicylabel_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all responderpolicylabel_stats resources that are configured on netscaler.
	*/
	public static responderpolicylabel_stats[] get(nitro_service service, options option) throws Exception{
		responderpolicylabel_stats obj = new responderpolicylabel_stats();
		responderpolicylabel_stats[] response = (responderpolicylabel_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of responderpolicylabel_stats resource of given name .
	*/
	public static responderpolicylabel_stats get(nitro_service service, String labelname) throws Exception{
		responderpolicylabel_stats obj = new responderpolicylabel_stats();
		obj.set_labelname(labelname);
		responderpolicylabel_stats response = (responderpolicylabel_stats) obj.stat_resource(service);
		return response;
	}

}
