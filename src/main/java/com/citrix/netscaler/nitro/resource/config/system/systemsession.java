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

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemsession_response extends base_response
{
	public systemsession[] systemsession;
}
/**
* Configuration for system session resource.
*/

public class systemsession extends base_resource
{
	private Long sid;
	private Boolean all;

	//------- Read only Parameter ---------;

	private String username;
	private String logintime;
	private String lastactivitytime;
	private Integer expirytime;
	private Long numofconnections;
	private Boolean currentconn;
	private Long __count;

	/**
	* <pre>
	* The session id.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sid(long sid) throws Exception {
		this.sid = new Long(sid);
	}

	/**
	* <pre>
	* The session id.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sid(Long sid) throws Exception{
		this.sid = sid;
	}

	/**
	* <pre>
	* The session id.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sid() throws Exception {
		return this.sid;
	}

	/**
	* <pre>
	* Specify this if you want to kill all sessions except self.
	* </pre>
	*/
	public void set_all(boolean all) throws Exception {
		this.all = new Boolean(all);
	}

	/**
	* <pre>
	* Specify this if you want to kill all sessions except self.
	* </pre>
	*/
	public void set_all(Boolean all) throws Exception{
		this.all = all;
	}

	/**
	* <pre>
	* Specify this if you want to kill all sessions except self.
	* </pre>
	*/
	public Boolean get_all() throws Exception {
		return this.all;
	}

	/**
	* <pre>
	* user name of the session.
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* logged-in time of this session.
	* </pre>
	*/
	public String get_logintime() throws Exception {
		return this.logintime;
	}

	/**
	* <pre>
	* last activity time of on this session.
	* </pre>
	*/
	public String get_lastactivitytime() throws Exception {
		return this.lastactivitytime;
	}

	/**
	* <pre>
	* Time left in expire the session in seconds.
	* </pre>
	*/
	public Integer get_expirytime() throws Exception {
		return this.expirytime;
	}

	/**
	* <pre>
	* number of connection using this token.
	* </pre>
	*/
	public Long get_numofconnections() throws Exception {
		return this.numofconnections;
	}

	/**
	* <pre>
	* True if the token is used for current session.
	* </pre>
	*/
	public Boolean get_currentconn() throws Exception {
		return this.currentconn;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemsession_response result = (systemsession_response) service.get_payload_formatter().string_to_resource(systemsession_response.class, response);
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
		return result.systemsession;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.sid != null) {
			return this.sid.toString();
		}
		return null;
	}

	/**
	* Use this API to kill systemsession.
	*/
	public static base_response kill(nitro_service client, systemsession resource) throws Exception {
		systemsession killresource = new systemsession();
		killresource.sid = resource.sid;
		killresource.all = resource.all;
		return killresource.perform_operation(client,"kill");
	}

	/**
	* Use this API to kill systemsession resources.
	*/
	public static base_responses kill(nitro_service client, systemsession resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			systemsession killresources[] = new systemsession[resources.length];
			for (int i=0;i<resources.length;i++){
				killresources[i] = new systemsession();
				killresources[i].sid = resources[i].sid;
				killresources[i].all = resources[i].all;
			}
			result = perform_operation_bulk_request(client, killresources,"kill");
		}
		return result;
	}

	/**
	* Use this API to fetch all the systemsession resources that are configured on netscaler.
	*/
	public static systemsession[] get(nitro_service service) throws Exception{
		systemsession obj = new systemsession();
		systemsession[] response = (systemsession[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the systemsession resources that are configured on netscaler.
	*/
	public static systemsession[] get(nitro_service service, options option) throws Exception{
		systemsession obj = new systemsession();
		systemsession[] response = (systemsession[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch systemsession resource of given name .
	*/
	public static systemsession get(nitro_service service, Long sid) throws Exception{
		systemsession obj = new systemsession();
		obj.set_sid(sid);
		systemsession response = (systemsession) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch systemsession resources of given names .
	*/
	public static systemsession[] get(nitro_service service, Long sid[]) throws Exception{
		if (sid !=null && sid.length>0) {
			systemsession response[] = new systemsession[sid.length];
			systemsession obj[] = new systemsession[sid.length];
			for (int i=0;i<sid.length;i++) {
				obj[i] = new systemsession();
				obj[i].set_sid(sid[i]);
				response[i] = (systemsession) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of systemsession resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static systemsession[] get_filtered(nitro_service service, String filter) throws Exception{
		systemsession obj = new systemsession();
		options option = new options();
		option.set_filter(filter);
		systemsession[] response = (systemsession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of systemsession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static systemsession[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemsession obj = new systemsession();
		options option = new options();
		option.set_filter(filter);
		systemsession[] response = (systemsession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the systemsession resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		systemsession obj = new systemsession();
		options option = new options();
		option.set_count(true);
		systemsession[] response = (systemsession[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of systemsession resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		systemsession obj = new systemsession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemsession[] response = (systemsession[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of systemsession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		systemsession obj = new systemsession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		systemsession[] response = (systemsession[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
