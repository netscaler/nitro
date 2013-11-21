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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaapreauthenticationparameter_response extends base_response
{
	public aaapreauthenticationparameter aaapreauthenticationparameter;
}
/**
* Configuration for pre authentication parameter resource.
*/

public class aaapreauthenticationparameter extends base_resource
{
	private String preauthenticationaction;
	private String rule;
	private String killprocess;
	private String deletefiles;

	//------- Read only Parameter ---------;

	private String[] builtin;

	/**
	* <pre>
	* Deny or allow login on the basis of end point analysis results.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_preauthenticationaction(String preauthenticationaction) throws Exception{
		this.preauthenticationaction = preauthenticationaction;
	}

	/**
	* <pre>
	* Deny or allow login on the basis of end point analysis results.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_preauthenticationaction() throws Exception {
		return this.preauthenticationaction;
	}

	/**
	* <pre>
	* Name of the NetScaler named rule, or a default syntax expression, to be evaluated by the EPA tool.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* Name of the NetScaler named rule, or a default syntax expression, to be evaluated by the EPA tool.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* String specifying the name of a process to be terminated by the EPA tool.
	* </pre>
	*/
	public void set_killprocess(String killprocess) throws Exception{
		this.killprocess = killprocess;
	}

	/**
	* <pre>
	* String specifying the name of a process to be terminated by the EPA tool.
	* </pre>
	*/
	public String get_killprocess() throws Exception {
		return this.killprocess;
	}

	/**
	* <pre>
	* String specifying the path(s) to and name(s) of the files to be deleted by the EPA tool, as a string of between 1 and 1023 characters.
	* </pre>
	*/
	public void set_deletefiles(String deletefiles) throws Exception{
		this.deletefiles = deletefiles;
	}

	/**
	* <pre>
	* String specifying the path(s) to and name(s) of the files to be deleted by the EPA tool, as a string of between 1 and 1023 characters.
	* </pre>
	*/
	public String get_deletefiles() throws Exception {
		return this.deletefiles;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		aaapreauthenticationparameter[] resources = new aaapreauthenticationparameter[1];
		aaapreauthenticationparameter_response result = (aaapreauthenticationparameter_response) service.get_payload_formatter().string_to_resource(aaapreauthenticationparameter_response.class, response);
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
		resources[0] = result.aaapreauthenticationparameter;
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
	* Use this API to update aaapreauthenticationparameter.
	*/
	public static base_response update(nitro_service client, aaapreauthenticationparameter resource) throws Exception {
		aaapreauthenticationparameter updateresource = new aaapreauthenticationparameter();
		updateresource.preauthenticationaction = resource.preauthenticationaction;
		updateresource.rule = resource.rule;
		updateresource.killprocess = resource.killprocess;
		updateresource.deletefiles = resource.deletefiles;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaapreauthenticationparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaapreauthenticationparameter resource, String[] args) throws Exception{
		aaapreauthenticationparameter unsetresource = new aaapreauthenticationparameter();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the aaapreauthenticationparameter resources that are configured on netscaler.
	*/
	public static aaapreauthenticationparameter get(nitro_service service) throws Exception{
		aaapreauthenticationparameter obj = new aaapreauthenticationparameter();
		aaapreauthenticationparameter[] response = (aaapreauthenticationparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the aaapreauthenticationparameter resources that are configured on netscaler.
	*/
	public static aaapreauthenticationparameter get(nitro_service service,  options option) throws Exception{
		aaapreauthenticationparameter obj = new aaapreauthenticationparameter();
		aaapreauthenticationparameter[] response = (aaapreauthenticationparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class preauthenticationactionEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
	}
}
