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

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwtransactionrecords_response extends base_response
{
	public appfwtransactionrecords[] appfwtransactionrecords;
}
/**
* Configuration for Application firewall transaction record resource.
*/

public class appfwtransactionrecords extends base_resource
{

	//------- Read only Parameter ---------;

	private Long httptransactionid;
	private Integer packetengineid;
	private String appfwsessionid;
	private String profilename;
	private String url;
	private String clientip;
	private String destip;
	private String starttime;
	private String endtime;
	private Integer requestcontentlength;
	private Long requestyields;
	private Long requestmaxprocessingtime;
	private Integer responsecontentlength;
	private Long responseyields;
	private Long responsemaxprocessingtime;
	private Long __count;

	/**
	* <pre>
	* The http transaction identifier.
	* </pre>
	*/
	public Long get_httptransactionid() throws Exception {
		return this.httptransactionid;
	}

	/**
	* <pre>
	* The packet engine identifier.
	* </pre>
	*/
	public Integer get_packetengineid() throws Exception {
		return this.packetengineid;
	}

	/**
	* <pre>
	* The session identifier set by the Application Firewall to track the user session.
	* </pre>
	*/
	public String get_appfwsessionid() throws Exception {
		return this.appfwsessionid;
	}

	/**
	* <pre>
	* Application Firewall profile name.
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Request URL.
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* The IP address of client.
	* </pre>
	*/
	public String get_clientip() throws Exception {
		return this.clientip;
	}

	/**
	* <pre>
	* The IP address of destination.
	* </pre>
	*/
	public String get_destip() throws Exception {
		return this.destip;
	}

	/**
	* <pre>
	* Conveys time at which request processing started.
	* </pre>
	*/
	public String get_starttime() throws Exception {
		return this.starttime;
	}

	/**
	* <pre>
	* Conveys time at which request processing end.
	* </pre>
	*/
	public String get_endtime() throws Exception {
		return this.endtime;
	}

	/**
	* <pre>
	* The content length of request.
	* </pre>
	*/
	public Integer get_requestcontentlength() throws Exception {
		return this.requestcontentlength;
	}

	/**
	* <pre>
	* The number of times yielded during request processing to send heart beat packets.
	* </pre>
	*/
	public Long get_requestyields() throws Exception {
		return this.requestyields;
	}

	/**
	* <pre>
	* The maximum processing time across yields during request processing.
	* </pre>
	*/
	public Long get_requestmaxprocessingtime() throws Exception {
		return this.requestmaxprocessingtime;
	}

	/**
	* <pre>
	* The content length of response.
	* </pre>
	*/
	public Integer get_responsecontentlength() throws Exception {
		return this.responsecontentlength;
	}

	/**
	* <pre>
	* The number of times yielded during response processing to send heart beat packets.
	* </pre>
	*/
	public Long get_responseyields() throws Exception {
		return this.responseyields;
	}

	/**
	* <pre>
	* The maximum processing time across yields during response processing.
	* </pre>
	*/
	public Long get_responsemaxprocessingtime() throws Exception {
		return this.responsemaxprocessingtime;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwtransactionrecords_response result = (appfwtransactionrecords_response) service.get_payload_formatter().string_to_resource(appfwtransactionrecords_response.class, response);
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
		return result.appfwtransactionrecords;
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
	* Use this API to fetch all the appfwtransactionrecords resources that are configured on netscaler.
	*/
	public static appfwtransactionrecords[] get(nitro_service service) throws Exception{
		appfwtransactionrecords obj = new appfwtransactionrecords();
		appfwtransactionrecords[] response = (appfwtransactionrecords[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appfwtransactionrecords resources that are configured on netscaler.
	*/
	public static appfwtransactionrecords[] get(nitro_service service, options option) throws Exception{
		appfwtransactionrecords obj = new appfwtransactionrecords();
		appfwtransactionrecords[] response = (appfwtransactionrecords[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of appfwtransactionrecords resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwtransactionrecords[] get_filtered(nitro_service service, String filter) throws Exception{
		appfwtransactionrecords obj = new appfwtransactionrecords();
		options option = new options();
		option.set_filter(filter);
		appfwtransactionrecords[] response = (appfwtransactionrecords[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwtransactionrecords resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwtransactionrecords[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwtransactionrecords obj = new appfwtransactionrecords();
		options option = new options();
		option.set_filter(filter);
		appfwtransactionrecords[] response = (appfwtransactionrecords[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appfwtransactionrecords resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appfwtransactionrecords obj = new appfwtransactionrecords();
		options option = new options();
		option.set_count(true);
		appfwtransactionrecords[] response = (appfwtransactionrecords[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appfwtransactionrecords resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appfwtransactionrecords obj = new appfwtransactionrecords();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwtransactionrecords[] response = (appfwtransactionrecords[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwtransactionrecords resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appfwtransactionrecords obj = new appfwtransactionrecords();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwtransactionrecords[] response = (appfwtransactionrecords[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
