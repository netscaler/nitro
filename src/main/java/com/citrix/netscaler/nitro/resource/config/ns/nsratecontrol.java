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

class nsratecontrol_response extends base_response
{
	public nsratecontrol nsratecontrol;
}
/**
* Configuration for rate control resource.
*/

public class nsratecontrol extends base_resource
{
	private Long tcpthreshold;
	private Long udpthreshold;
	private Long icmpthreshold;

	/**
	* <pre>
	* The number of SYNs permitted per 10 milli second.
	* </pre>
	*/
	public void set_tcpthreshold(long tcpthreshold) throws Exception {
		this.tcpthreshold = new Long(tcpthreshold);
	}

	/**
	* <pre>
	* The number of SYNs permitted per 10 milli second.
	* </pre>
	*/
	public void set_tcpthreshold(Long tcpthreshold) throws Exception{
		this.tcpthreshold = tcpthreshold;
	}

	/**
	* <pre>
	* The number of SYNs permitted per 10 milli second.
	* </pre>
	*/
	public Long get_tcpthreshold() throws Exception {
		return this.tcpthreshold;
	}

	/**
	* <pre>
	* The number of UDP packets permitted per 10 milli second.
	* </pre>
	*/
	public void set_udpthreshold(long udpthreshold) throws Exception {
		this.udpthreshold = new Long(udpthreshold);
	}

	/**
	* <pre>
	* The number of UDP packets permitted per 10 milli second.
	* </pre>
	*/
	public void set_udpthreshold(Long udpthreshold) throws Exception{
		this.udpthreshold = udpthreshold;
	}

	/**
	* <pre>
	* The number of UDP packets permitted per 10 milli second.
	* </pre>
	*/
	public Long get_udpthreshold() throws Exception {
		return this.udpthreshold;
	}

	/**
	* <pre>
	* The number of ICMP packets permitted per 10 milli second.<br> Default value: 100
	* </pre>
	*/
	public void set_icmpthreshold(long icmpthreshold) throws Exception {
		this.icmpthreshold = new Long(icmpthreshold);
	}

	/**
	* <pre>
	* The number of ICMP packets permitted per 10 milli second.<br> Default value: 100
	* </pre>
	*/
	public void set_icmpthreshold(Long icmpthreshold) throws Exception{
		this.icmpthreshold = icmpthreshold;
	}

	/**
	* <pre>
	* The number of ICMP packets permitted per 10 milli second.<br> Default value: 100
	* </pre>
	*/
	public Long get_icmpthreshold() throws Exception {
		return this.icmpthreshold;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsratecontrol[] resources = new nsratecontrol[1];
		nsratecontrol_response result = (nsratecontrol_response) service.get_payload_formatter().string_to_resource(nsratecontrol_response.class, response);
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
		resources[0] = result.nsratecontrol;
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
	* Use this API to update nsratecontrol.
	*/
	public static base_response update(nitro_service client, nsratecontrol resource) throws Exception {
		nsratecontrol updateresource = new nsratecontrol();
		updateresource.tcpthreshold = resource.tcpthreshold;
		updateresource.udpthreshold = resource.udpthreshold;
		updateresource.icmpthreshold = resource.icmpthreshold;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nsratecontrol resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsratecontrol resource, String[] args) throws Exception{
		nsratecontrol unsetresource = new nsratecontrol();
		unsetresource.tcpthreshold = resource.tcpthreshold;
		unsetresource.udpthreshold = resource.udpthreshold;
		unsetresource.icmpthreshold = resource.icmpthreshold;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nsratecontrol resources that are configured on netscaler.
	*/
	public static nsratecontrol get(nitro_service service) throws Exception{
		nsratecontrol obj = new nsratecontrol();
		nsratecontrol[] response = (nsratecontrol[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsratecontrol resources that are configured on netscaler.
	*/
	public static nsratecontrol get(nitro_service service,  options option) throws Exception{
		nsratecontrol obj = new nsratecontrol();
		nsratecontrol[] response = (nsratecontrol[])obj.get_resources(service,option);
		return response[0];
	}

}
