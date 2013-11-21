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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsspparams_response extends base_response
{
	public nsspparams nsspparams;
}
/**
* Configuration for Surge Protection parameter resource.
*/

public class nsspparams extends base_resource
{
	private Integer basethreshold;
	private String throttle;

	//------- Read only Parameter ---------;

	private Integer[] table0;

	/**
	* <pre>
	* Maximum number of server connections that can be opened before surge protection is activated.<br> Default value: 200<br> Minimum value =  0<br> Maximum value =  32767
	* </pre>
	*/
	public void set_basethreshold(int basethreshold) throws Exception {
		this.basethreshold = new Integer(basethreshold);
	}

	/**
	* <pre>
	* Maximum number of server connections that can be opened before surge protection is activated.<br> Default value: 200<br> Minimum value =  0<br> Maximum value =  32767
	* </pre>
	*/
	public void set_basethreshold(Integer basethreshold) throws Exception{
		this.basethreshold = basethreshold;
	}

	/**
	* <pre>
	* Maximum number of server connections that can be opened before surge protection is activated.<br> Default value: 200<br> Minimum value =  0<br> Maximum value =  32767
	* </pre>
	*/
	public Integer get_basethreshold() throws Exception {
		return this.basethreshold;
	}

	/**
	* <pre>
	* Rate at which the system opens connections to the server.<br> Default value: Normal<br> Possible values = Aggressive, Normal, Relaxed
	* </pre>
	*/
	public void set_throttle(String throttle) throws Exception{
		this.throttle = throttle;
	}

	/**
	* <pre>
	* Rate at which the system opens connections to the server.<br> Default value: Normal<br> Possible values = Aggressive, Normal, Relaxed
	* </pre>
	*/
	public String get_throttle() throws Exception {
		return this.throttle;
	}

	/**
	* <pre>
	* Table.
	* </pre>
	*/
	public Integer[] get_table0() throws Exception {
		return this.table0;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsspparams[] resources = new nsspparams[1];
		nsspparams_response result = (nsspparams_response) service.get_payload_formatter().string_to_resource(nsspparams_response.class, response);
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
		resources[0] = result.nsspparams;
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
	* Use this API to update nsspparams.
	*/
	public static base_response update(nitro_service client, nsspparams resource) throws Exception {
		nsspparams updateresource = new nsspparams();
		updateresource.basethreshold = resource.basethreshold;
		updateresource.throttle = resource.throttle;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nsspparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsspparams resource, String[] args) throws Exception{
		nsspparams unsetresource = new nsspparams();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nsspparams resources that are configured on netscaler.
	*/
	public static nsspparams get(nitro_service service) throws Exception{
		nsspparams obj = new nsspparams();
		nsspparams[] response = (nsspparams[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsspparams resources that are configured on netscaler.
	*/
	public static nsspparams get(nitro_service service,  options option) throws Exception{
		nsspparams obj = new nsspparams();
		nsspparams[] response = (nsspparams[])obj.get_resources(service,option);
		return response[0];
	}

	public static class throttleEnum {
		public static final String Aggressive = "Aggressive";
		public static final String Normal = "Normal";
		public static final String Relaxed = "Relaxed";
	}
}
