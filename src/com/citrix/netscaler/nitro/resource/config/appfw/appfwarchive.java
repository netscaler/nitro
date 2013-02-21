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

class appfwarchive_response extends base_response
{
	public appfwarchive appfwarchive;
}
/**
* Configuration for archive resource.
*/

public class appfwarchive extends base_resource
{
	private String name;
	private String target;
	private String src;
	private String comment;

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* Name of tar archive.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of tar archive.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Path to the file to be exported.<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public void set_target(String target) throws Exception{
		this.target = target;
	}

	/**
	* <pre>
	* Path to the file to be exported.<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public String get_target() throws Exception {
		return this.target;
	}

	/**
	* <pre>
	* Indicates the source of the tar archive file as a URL
of the form

    <protocol>://<host>[:<port>][/<path>]

<protocol> is http or https.
<host> is the DNS name or IP address of the http or https server.
<port> is the port number of the server. If omitted, the
default port for http or https will be used.
<path> is the path of the file on the server.

Import will fail if an https server requires client
certificate authentication.


.<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public void set_src(String src) throws Exception{
		this.src = src;
	}

	/**
	* <pre>
	* Indicates the source of the tar archive file as a URL
of the form

    <protocol>://<host>[:<port>][/<path>]

<protocol> is http or https.
<host> is the DNS name or IP address of the http or https server.
<port> is the port number of the server. If omitted, the
default port for http or https will be used.
<path> is the path of the file on the server.

Import will fail if an https server requires client
certificate authentication.


.<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public String get_src() throws Exception {
		return this.src;
	}

	/**
	* <pre>
	* Comments associated with this archive.<br> Maximum length =  128
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this archive.<br> Maximum length =  128
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_response() throws Exception {
		return this.response;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		appfwarchive[] resources = new appfwarchive[1];
		appfwarchive_response result = (appfwarchive_response) service.get_payload_formatter().string_to_resource(appfwarchive_response.class, response);
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
		resources[0] = result.appfwarchive;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to export appfwarchive.
	*/
	public static base_response export(nitro_service client, appfwarchive resource) throws Exception {
		appfwarchive exportresource = new appfwarchive();
		exportresource.name = resource.name;
		exportresource.target = resource.target;
		return exportresource.perform_operation(client,"export");
	}

	/**
	* Use this API to Import appfwarchive.
	*/
	public static base_response Import(nitro_service client, appfwarchive resource) throws Exception {
		appfwarchive Importresource = new appfwarchive();
		Importresource.src = resource.src;
		Importresource.name = resource.name;
		Importresource.comment = resource.comment;
		return Importresource.perform_operation(client,"Import");
	}

	/**
	* Use this API to delete appfwarchive of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appfwarchive deleteresource = new appfwarchive();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwarchive.
	*/
	public static base_response delete(nitro_service client, appfwarchive resource) throws Exception {
		appfwarchive deleteresource = new appfwarchive();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to fetch all the appfwarchive resources that are configured on netscaler.
	*/
	public static appfwarchive get(nitro_service service) throws Exception{
		appfwarchive obj = new appfwarchive();
		appfwarchive[] response = (appfwarchive[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the appfwarchive resources that are configured on netscaler.
	*/
	public static appfwarchive get(nitro_service service,  options option) throws Exception{
		appfwarchive obj = new appfwarchive();
		appfwarchive[] response = (appfwarchive[])obj.get_resources(service,option);
		return response[0];
	}

}
