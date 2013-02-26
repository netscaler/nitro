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

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbmonitor_service_binding_response extends base_response
{
	public lbmonitor_service_binding[] lbmonitor_service_binding;
}
/**
	* Binding class showing the service that can be bound to lbmonitor.
	*/

public class lbmonitor_service_binding extends base_resource
{
	private String monitorname;
	private String servicename;
	private String dup_state;
	private Long dup_weight;
	private String servicegroupname;
	private String state;
	private Long weight;

	/**
	* <pre>
	* The name of the service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of the service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* The state of the monitor. If the monitor is enabled, probes of the monitor's type are sent to the service. If the monitor is disabled, probes of the monitor's type are not sent to the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dup_state(String dup_state) throws Exception{
		this.dup_state = dup_state;
	}

	/**
	* <pre>
	* The state of the monitor. If the monitor is enabled, probes of the monitor's type are sent to the service. If the monitor is disabled, probes of the monitor's type are not sent to the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dup_state() throws Exception {
		return this.dup_state;
	}

	/**
	* <pre>
	* The name of the service or a service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the service or a service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The state of the monitor. If the monitor is enabled, probes of the monitor's type are sent to the service. If the monitor is disabled, probes of the monitor's type are not sent to the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the monitor. If the monitor is enabled, probes of the monitor's type are sent to the service. If the monitor is disabled, probes of the monitor's type are not sent to the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dup_weight(long dup_weight) throws Exception {
		this.dup_weight = new Long(dup_weight);
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dup_weight(Long dup_weight) throws Exception{
		this.dup_weight = dup_weight;
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_dup_weight() throws Exception {
		return this.dup_weight;
	}

	/**
	* <pre>
	* The name of the monitor to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitorname(String monitorname) throws Exception{
		this.monitorname = monitorname;
	}

	/**
	* <pre>
	* The name of the monitor to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitorname() throws Exception {
		return this.monitorname;
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonitor_service_binding_response result = (lbmonitor_service_binding_response) service.get_payload_formatter().string_to_resource(lbmonitor_service_binding_response.class, response);
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
		return result.lbmonitor_service_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.monitorname;
	}

	public static class dup_stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}