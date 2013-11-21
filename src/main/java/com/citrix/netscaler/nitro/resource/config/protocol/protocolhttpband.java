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

package com.citrix.netscaler.nitro.resource.config.protocol;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class protocolhttpband_response extends base_response
{
	public protocolhttpband protocolhttpband;
}
/**
* Configuration for HTTP request/response band resource.
*/

public class protocolhttpband extends base_resource
{
	private Integer reqbandsize;
	private Integer respbandsize;
	private String type;

	//------- Read only Parameter ---------;

	private Integer bandrange;
	private Long[] totalbandsize;
	private Long[] avgbandsize;
	private Long[] banddata;
	private Long[] accesscount;
	private Long[] accessratio;

	/**
	* <pre>
	* Band size, in bytes, for HTTP request band statistics. For example, if you specify a band size of 100 bytes, statistics will be maintained and displayed for the following size ranges:
0 - 99 bytes
100 - 199 bytes
200 - 299 bytes and so on.<br> Default value: 100<br> Minimum value =  50
	* </pre>
	*/
	public void set_reqbandsize(int reqbandsize) throws Exception {
		this.reqbandsize = new Integer(reqbandsize);
	}

	/**
	* <pre>
	* Band size, in bytes, for HTTP request band statistics. For example, if you specify a band size of 100 bytes, statistics will be maintained and displayed for the following size ranges:
0 - 99 bytes
100 - 199 bytes
200 - 299 bytes and so on.<br> Default value: 100<br> Minimum value =  50
	* </pre>
	*/
	public void set_reqbandsize(Integer reqbandsize) throws Exception{
		this.reqbandsize = reqbandsize;
	}

	/**
	* <pre>
	* Band size, in bytes, for HTTP request band statistics. For example, if you specify a band size of 100 bytes, statistics will be maintained and displayed for the following size ranges:
0 - 99 bytes
100 - 199 bytes
200 - 299 bytes and so on.<br> Default value: 100<br> Minimum value =  50
	* </pre>
	*/
	public Integer get_reqbandsize() throws Exception {
		return this.reqbandsize;
	}

	/**
	* <pre>
	* Band size, in bytes, for HTTP response band statistics. For example, if you specify a band size of 100 bytes, statistics will be maintained and displayed for the following size ranges:
0 - 99 bytes
100 - 199 bytes
200 - 299 bytes and so on.<br> Default value: 1024<br> Minimum value =  50
	* </pre>
	*/
	public void set_respbandsize(int respbandsize) throws Exception {
		this.respbandsize = new Integer(respbandsize);
	}

	/**
	* <pre>
	* Band size, in bytes, for HTTP response band statistics. For example, if you specify a band size of 100 bytes, statistics will be maintained and displayed for the following size ranges:
0 - 99 bytes
100 - 199 bytes
200 - 299 bytes and so on.<br> Default value: 1024<br> Minimum value =  50
	* </pre>
	*/
	public void set_respbandsize(Integer respbandsize) throws Exception{
		this.respbandsize = respbandsize;
	}

	/**
	* <pre>
	* Band size, in bytes, for HTTP response band statistics. For example, if you specify a band size of 100 bytes, statistics will be maintained and displayed for the following size ranges:
0 - 99 bytes
100 - 199 bytes
200 - 299 bytes and so on.<br> Default value: 1024<br> Minimum value =  50
	* </pre>
	*/
	public Integer get_respbandsize() throws Exception {
		return this.respbandsize;
	}

	/**
	* <pre>
	* Type of statistics to display.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of statistics to display.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The range of the HTTP request/response size, in bytes.
	* </pre>
	*/
	public Integer get_bandrange() throws Exception {
		return this.bandrange;
	}

	/**
	* <pre>
	* The total size of all HTTP requests/responses in this size range.
	* </pre>
	*/
	public Long[] get_totalbandsize() throws Exception {
		return this.totalbandsize;
	}

	/**
	* <pre>
	* The average size of all HTTP requests/responses in this size range.
	* </pre>
	*/
	public Long[] get_avgbandsize() throws Exception {
		return this.avgbandsize;
	}

	/**
	* <pre>
	* The total size of all HTTP requests/responses in this size range, expressed as a percentage of the total size of all HTTP requests/responses.
	* </pre>
	*/
	public Long[] get_banddata() throws Exception {
		return this.banddata;
	}

	/**
	* <pre>
	* The number of HTTP requests/responses in this size range.
	* </pre>
	*/
	public Long[] get_accesscount() throws Exception {
		return this.accesscount;
	}

	/**
	* <pre>
	* The number of HTTP requests/responses in this size range, expressed as a percentage of the total number of HTTP requests/responses.
	* </pre>
	*/
	public Long[] get_accessratio() throws Exception {
		return this.accessratio;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		protocolhttpband[] resources = new protocolhttpband[1];
		protocolhttpband_response result = (protocolhttpband_response) service.get_payload_formatter().string_to_resource(protocolhttpband_response.class, response);
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
		resources[0] = result.protocolhttpband;
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
	* Use this API to update protocolhttpband.
	*/
	public static base_response update(nitro_service client, protocolhttpband resource) throws Exception {
		protocolhttpband updateresource = new protocolhttpband();
		updateresource.reqbandsize = resource.reqbandsize;
		updateresource.respbandsize = resource.respbandsize;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of protocolhttpband resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, protocolhttpband resource, String[] args) throws Exception{
		protocolhttpband unsetresource = new protocolhttpband();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch a protocolhttpband resource.
	*/
	public static protocolhttpband get(nitro_service service, protocolhttpband obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		protocolhttpband response = (protocolhttpband) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch all the protocolhttpband resources that are configured on netscaler.
	* This uses protocolhttpband_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static protocolhttpband[] get(nitro_service service, protocolhttpband_args args) throws Exception{
		protocolhttpband obj = new protocolhttpband();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		protocolhttpband[] response = (protocolhttpband[])obj.get_resources(service, option);
		return response;
	}

	public static class typeEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}
}
