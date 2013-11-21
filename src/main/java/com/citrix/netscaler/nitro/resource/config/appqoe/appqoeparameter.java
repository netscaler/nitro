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

package com.citrix.netscaler.nitro.resource.config.appqoe;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appqoeparameter_response extends base_response
{
	public appqoeparameter appqoeparameter;
}
/**
* Configuration for QOS parameter resource.
*/

public class appqoeparameter extends base_resource
{
	private Long sessionlife;
	private Long avgwaitingclient;
	private Long maxaltrespbandwidth;
	private Long dosattackthresh;

	/**
	* <pre>
	* Time, in seconds, between the first time and the next time the AppQoE alternative content window is displayed. The alternative content window is displayed only once during a session for the same browser accessing a configured URL, so this parameter determines the length of a session.<br> Default value: 300<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sessionlife(long sessionlife) throws Exception {
		this.sessionlife = new Long(sessionlife);
	}

	/**
	* <pre>
	* Time, in seconds, between the first time and the next time the AppQoE alternative content window is displayed. The alternative content window is displayed only once during a session for the same browser accessing a configured URL, so this parameter determines the length of a session.<br> Default value: 300<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sessionlife(Long sessionlife) throws Exception{
		this.sessionlife = sessionlife;
	}

	/**
	* <pre>
	* Time, in seconds, between the first time and the next time the AppQoE alternative content window is displayed. The alternative content window is displayed only once during a session for the same browser accessing a configured URL, so this parameter determines the length of a session.<br> Default value: 300<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_sessionlife() throws Exception {
		return this.sessionlife;
	}

	/**
	* <pre>
	* average number of client connections, that can sit in service waiting queue.<br> Default value: 1000000<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_avgwaitingclient(long avgwaitingclient) throws Exception {
		this.avgwaitingclient = new Long(avgwaitingclient);
	}

	/**
	* <pre>
	* average number of client connections, that can sit in service waiting queue.<br> Default value: 1000000<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_avgwaitingclient(Long avgwaitingclient) throws Exception{
		this.avgwaitingclient = avgwaitingclient;
	}

	/**
	* <pre>
	* average number of client connections, that can sit in service waiting queue.<br> Default value: 1000000<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_avgwaitingclient() throws Exception {
		return this.avgwaitingclient;
	}

	/**
	* <pre>
	* maximum bandwidth which will determine whether to send alternate content response.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxaltrespbandwidth(long maxaltrespbandwidth) throws Exception {
		this.maxaltrespbandwidth = new Long(maxaltrespbandwidth);
	}

	/**
	* <pre>
	* maximum bandwidth which will determine whether to send alternate content response.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxaltrespbandwidth(Long maxaltrespbandwidth) throws Exception{
		this.maxaltrespbandwidth = maxaltrespbandwidth;
	}

	/**
	* <pre>
	* maximum bandwidth which will determine whether to send alternate content response.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_maxaltrespbandwidth() throws Exception {
		return this.maxaltrespbandwidth;
	}

	/**
	* <pre>
	* When dosatck is manually decided , this will be used as an upper limit to queue length.<br> Default value: 2000<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_dosattackthresh(long dosattackthresh) throws Exception {
		this.dosattackthresh = new Long(dosattackthresh);
	}

	/**
	* <pre>
	* When dosatck is manually decided , this will be used as an upper limit to queue length.<br> Default value: 2000<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_dosattackthresh(Long dosattackthresh) throws Exception{
		this.dosattackthresh = dosattackthresh;
	}

	/**
	* <pre>
	* When dosatck is manually decided , this will be used as an upper limit to queue length.<br> Default value: 2000<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_dosattackthresh() throws Exception {
		return this.dosattackthresh;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		appqoeparameter[] resources = new appqoeparameter[1];
		appqoeparameter_response result = (appqoeparameter_response) service.get_payload_formatter().string_to_resource(appqoeparameter_response.class, response);
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
		resources[0] = result.appqoeparameter;
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
	* Use this API to update appqoeparameter.
	*/
	public static base_response update(nitro_service client, appqoeparameter resource) throws Exception {
		appqoeparameter updateresource = new appqoeparameter();
		updateresource.sessionlife = resource.sessionlife;
		updateresource.avgwaitingclient = resource.avgwaitingclient;
		updateresource.maxaltrespbandwidth = resource.maxaltrespbandwidth;
		updateresource.dosattackthresh = resource.dosattackthresh;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of appqoeparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appqoeparameter resource, String[] args) throws Exception{
		appqoeparameter unsetresource = new appqoeparameter();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the appqoeparameter resources that are configured on netscaler.
	*/
	public static appqoeparameter get(nitro_service service) throws Exception{
		appqoeparameter obj = new appqoeparameter();
		appqoeparameter[] response = (appqoeparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the appqoeparameter resources that are configured on netscaler.
	*/
	public static appqoeparameter get(nitro_service service,  options option) throws Exception{
		appqoeparameter obj = new appqoeparameter();
		appqoeparameter[] response = (appqoeparameter[])obj.get_resources(service,option);
		return response[0];
	}

}
