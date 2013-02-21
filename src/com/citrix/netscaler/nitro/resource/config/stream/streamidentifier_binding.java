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

package com.citrix.netscaler.nitro.resource.config.stream;

import com.citrix.netscaler.nitro.resource.config.stream.streamidentifier_streamsession_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class streamidentifier_binding_response extends base_response
{
	public streamidentifier_binding[] streamidentifier_binding;
}
/**
	* Binding class showing the resources that can be bound to streamidentifier_binding. 
	*/

public class streamidentifier_binding extends base_resource
{
	private String name;
	private streamidentifier_streamsession_binding	streamidentifier_streamsession_binding[] = null;

	/**
	* <pre>
	* The name of stream identifier.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of stream identifier.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* streamsession that can be bound to streamidentifier.
	* </pre>
	*/
	public streamidentifier_streamsession_binding[] get_streamidentifier_streamsession_bindings() throws Exception {
		return this.streamidentifier_streamsession_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		streamidentifier_binding_response result = (streamidentifier_binding_response) service.get_payload_formatter().string_to_resource(streamidentifier_binding_response.class, response);
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
		return result.streamidentifier_binding;
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
	* Use this API to fetch streamidentifier_binding resource of given name .
	*/
	public static streamidentifier_binding get(nitro_service service, String name) throws Exception{
		streamidentifier_binding obj = new streamidentifier_binding();
		obj.set_name(name);
		streamidentifier_binding response = (streamidentifier_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch streamidentifier_binding resources of given names .
	*/
	public static streamidentifier_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			streamidentifier_binding response[] = new streamidentifier_binding[name.length];
			streamidentifier_binding obj[] = new streamidentifier_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new streamidentifier_binding();
				obj[i].set_name(name[i]);
				response[i] = (streamidentifier_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}