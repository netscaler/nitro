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

package com.citrix.netscaler.nitro.resource.config.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderhtmlpage_response extends base_response
{
	public responderhtmlpage responderhtmlpage;
}
/**
* Configuration for Responder HTML page resource.
*/

public class responderhtmlpage extends base_resource
{
	private String src;
	private String name;
	private String comment;
	private Boolean overwrite;

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* Local path to and name of, or URL \(protocol, host, path, and file name\) for, the file in which to store the imported HTML page.
NOTE: The import fails if the object to be imported is on an HTTPS server that requires client certificate authentication for access.<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public void set_src(String src) throws Exception{
		this.src = src;
	}

	/**
	* <pre>
	* Local path to and name of, or URL \(protocol, host, path, and file name\) for, the file in which to store the imported HTML page.
NOTE: The import fails if the object to be imported is on an HTTPS server that requires client certificate authentication for access.<br> Minimum length =  1<br> Maximum length =  2047
	* </pre>
	*/
	public String get_src() throws Exception {
		return this.src;
	}

	/**
	* <pre>
	* Name to assign to the HTML page object on the NetScaler appliance.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name to assign to the HTML page object on the NetScaler appliance.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Any comments to preserve information about the HTML page object.<br> Maximum length =  128
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any comments to preserve information about the HTML page object.<br> Maximum length =  128
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
		responderhtmlpage[] resources = new responderhtmlpage[1];
		responderhtmlpage_response result = (responderhtmlpage_response) service.get_payload_formatter().string_to_resource(responderhtmlpage_response.class, response);
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
		resources[0] = result.responderhtmlpage;
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
	* Use this API to Import responderhtmlpage.
	*/
	public static base_response Import(nitro_service client, responderhtmlpage resource) throws Exception {
		responderhtmlpage Importresource = new responderhtmlpage();
		Importresource.src = resource.src;
		Importresource.name = resource.name;
		Importresource.comment = resource.comment;
		Importresource.overwrite = resource.overwrite;
		return Importresource.perform_operation(client,"Import");
	}

	/**
	* Use this API to delete responderhtmlpage of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		responderhtmlpage deleteresource = new responderhtmlpage();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete responderhtmlpage.
	*/
	public static base_response delete(nitro_service client, responderhtmlpage resource) throws Exception {
		responderhtmlpage deleteresource = new responderhtmlpage();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to change responderhtmlpage.
	*/
	public static base_response change(nitro_service client, responderhtmlpage resource) throws Exception {
		responderhtmlpage updateresource = new responderhtmlpage();
		updateresource.name = resource.name;
		return updateresource.perform_operation(client,"update");
	}

	/**
	* Use this API to fetch all the responderhtmlpage resources that are configured on netscaler.
	*/
	public static responderhtmlpage get(nitro_service service) throws Exception{
		responderhtmlpage obj = new responderhtmlpage();
		responderhtmlpage[] response = (responderhtmlpage[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the responderhtmlpage resources that are configured on netscaler.
	*/
	public static responderhtmlpage get(nitro_service service,  options option) throws Exception{
		responderhtmlpage obj = new responderhtmlpage();
		responderhtmlpage[] response = (responderhtmlpage[])obj.get_resources(service,option);
		return response[0];
	}

	/**
	* Use this API to fetch responderhtmlpage resource of given name .
	*/
	public static responderhtmlpage get(nitro_service service, String name) throws Exception{
		responderhtmlpage obj = new responderhtmlpage();
		obj.set_name(name);
		responderhtmlpage response = (responderhtmlpage) obj.get_resource(service);
		return response;
	}

}
