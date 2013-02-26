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

package com.citrix.netscaler.nitro.resource.stat.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwpolicylabel_response extends base_response
{
	public appfwpolicylabel_stats[] appfwpolicylabel;
}
/**
* Statistics for application firewall policy label resource.
*/

public class appfwpolicylabel_stats extends base_resource
{
	private String labelname;
	private Long pipolicylabelhits;
	private Long pipolicylabelhitsrate;

	/**
	* <pre>
	* The name of the application firewall label for which statistics will be displayed.  If not given statistics are shown for all application firewall policylabels.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* The name of the application firewall label for which statistics will be displayed.  If not given statistics are shown for all application firewall policylabels.<br> Minimum length =  1
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
		appfwpolicylabel_response result = (appfwpolicylabel_response) service.get_payload_formatter().string_to_resource(appfwpolicylabel_response.class, response);
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
		return result.appfwpolicylabel;
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
	* Use this API to fetch the statistics of all appfwpolicylabel_stats resources that are configured on netscaler.
	*/
	public static appfwpolicylabel_stats[] get(nitro_service service) throws Exception{
		appfwpolicylabel_stats obj = new appfwpolicylabel_stats();
		appfwpolicylabel_stats[] response = (appfwpolicylabel_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all appfwpolicylabel_stats resources that are configured on netscaler.
	*/
	public static appfwpolicylabel_stats[] get(nitro_service service, options option) throws Exception{
		appfwpolicylabel_stats obj = new appfwpolicylabel_stats();
		appfwpolicylabel_stats[] response = (appfwpolicylabel_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of appfwpolicylabel_stats resource of given name .
	*/
	public static appfwpolicylabel_stats get(nitro_service service, String labelname) throws Exception{
		appfwpolicylabel_stats obj = new appfwpolicylabel_stats();
		obj.set_labelname(labelname);
		appfwpolicylabel_stats response = (appfwpolicylabel_stats) obj.stat_resource(service);
		return response;
	}

}
