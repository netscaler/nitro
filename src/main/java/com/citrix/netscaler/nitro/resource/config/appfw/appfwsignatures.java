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

class appfwsignatures_response extends base_response
{
	public appfwsignatures appfwsignatures;
}
/**
* Configuration for application firewall signatures XML configuration resource.
*/

public class appfwsignatures extends base_resource
{
	private String name;
	private String src;
	private String xslt;
	private String comment;
	private Boolean overwrite;

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* Indicates name of signature object.
<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Indicates name of signature object.
<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Indicates the source of the signature file as a URL
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
	* Indicates the source of the signature file as a URL
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
	* XSLT file source.<br> Maximum length =  2047
	* </pre>
	*/
	public void set_xslt(String xslt) throws Exception{
		this.xslt = xslt;
	}

	/**
	* <pre>
	* XSLT file source.<br> Maximum length =  2047
	* </pre>
	*/
	public String get_xslt() throws Exception {
		return this.xslt;
	}

	/**
	* <pre>
	* Comments.<br> Maximum length =  128
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments.<br> Maximum length =  128
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Overwrites the existing file.
	* </pre>
	*/
	public void set_overwrite(boolean overwrite) throws Exception {
		this.overwrite = new Boolean(overwrite);
	}

	/**
	* <pre>
	* Overwrites the existing file.
	* </pre>
	*/
	public void set_overwrite(Boolean overwrite) throws Exception{
		this.overwrite = overwrite;
	}

	/**
	* <pre>
	* Overwrites the existing file.
	* </pre>
	*/
	public Boolean get_overwrite() throws Exception {
		return this.overwrite;
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
		appfwsignatures[] resources = new appfwsignatures[1];
		appfwsignatures_response result = (appfwsignatures_response) service.get_payload_formatter().string_to_resource(appfwsignatures_response.class, response);
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
		resources[0] = result.appfwsignatures;
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
	* Use this API to delete appfwsignatures of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appfwsignatures deleteresource = new appfwsignatures();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appfwsignatures.
	*/
	public static base_response delete(nitro_service client, appfwsignatures resource) throws Exception {
		appfwsignatures deleteresource = new appfwsignatures();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to Import appfwsignatures.
	*/
	public static base_response Import(nitro_service client, appfwsignatures resource) throws Exception {
		appfwsignatures Importresource = new appfwsignatures();
		Importresource.src = resource.src;
		Importresource.name = resource.name;
		Importresource.xslt = resource.xslt;
		Importresource.comment = resource.comment;
		Importresource.overwrite = resource.overwrite;
		return Importresource.perform_operation(client,"Import");
	}

	/**
	* Use this API to change appfwsignatures.
	*/
	public static base_response change(nitro_service client, appfwsignatures resource) throws Exception {
		appfwsignatures updateresource = new appfwsignatures();
		updateresource.name = resource.name;
		return updateresource.perform_operation(client,"update");
	}

	/**
	* Use this API to fetch all the appfwsignatures resources that are configured on netscaler.
	*/
	public static appfwsignatures get(nitro_service service) throws Exception{
		appfwsignatures obj = new appfwsignatures();
		appfwsignatures[] response = (appfwsignatures[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the appfwsignatures resources that are configured on netscaler.
	*/
	public static appfwsignatures get(nitro_service service,  options option) throws Exception{
		appfwsignatures obj = new appfwsignatures();
		appfwsignatures[] response = (appfwsignatures[])obj.get_resources(service,option);
		return response[0];
	}

	/**
	* Use this API to fetch appfwsignatures resource of given name .
	*/
	public static appfwsignatures get(nitro_service service, String name) throws Exception{
		appfwsignatures obj = new appfwsignatures();
		obj.set_name(name);
		appfwsignatures response = (appfwsignatures) obj.get_resource(service);
		return response;
	}

}
