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

class fis_interface_binding_response extends base_response
{
	public fis_interface_binding[] fis_interface_binding;
}
/**
	* Binding class showing the interface that can be bound to fis.
	*/

public class fis_interface_binding extends base_resource
{
	private String name;
	private String ifnum;

	/**
	* <pre>
	* The name of the FIS to which you want to bind interfaces.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the FIS to which you want to bind interfaces.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Interface to be bound to the FIS, specified in slot/port notation (for example, 1/3).
	* </pre>
	*/
	public void set_ifnum(String ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* Interface to be bound to the FIS, specified in slot/port notation (for example, 1/3).
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		fis_interface_binding_response result = (fis_interface_binding_response) service.get_payload_formatter().string_to_resource(fis_interface_binding_response.class, response);
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
		return result.fis_interface_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, fis_interface_binding resource) throws Exception {
		fis_interface_binding updateresource = new fis_interface_binding();
		updateresource.name = resource.name;
		updateresource.ifnum = resource.ifnum;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, fis_interface_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			fis_interface_binding updateresources[] = new fis_interface_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new fis_interface_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].ifnum = resources[i].ifnum;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, fis_interface_binding resource) throws Exception {
		fis_interface_binding deleteresource = new fis_interface_binding();
		deleteresource.name = resource.name;
		deleteresource.ifnum = resource.ifnum;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, fis_interface_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			fis_interface_binding deleteresources[] = new fis_interface_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new fis_interface_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].ifnum = resources[i].ifnum;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}


}