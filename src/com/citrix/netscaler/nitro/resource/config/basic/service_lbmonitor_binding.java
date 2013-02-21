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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class service_lbmonitor_binding_response extends base_response
{
	public service_lbmonitor_binding[] service_lbmonitor_binding;
}
/**
	* Binding class showing the lbmonitor that can be bound to service.
	*/

public class service_lbmonitor_binding extends base_resource
{
	private String monitor_name;
	private String monstate;
	private String monitor_state;
	private String dup_state;
	private Long weight;
	private Long dup_weight;
	private Long totalprobes;
	private Long totalfailedprobes;
	private Long failedprobes;
	private Integer monstatcode;
	private String lastresponse;
	private Integer monstatparam1;
	private Integer monstatparam2;
	private Integer monstatparam3;
	private Long responsetime;
	private Long monitortotalprobes;
	private Long monitortotalfailedprobes;
	private Long monitorcurrentfailedprobes;
	private Boolean passive;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The weight for the specified monitor.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The name of the service to which the policy will be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the service to which the policy will be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Indicates if load monitor is passive. A passive load monitor does not remove service from LB decision when threshold is breached.
	* </pre>
	*/
	public void set_passive(boolean passive) throws Exception {
		this.passive = new Boolean(passive);
	}

	/**
	* <pre>
	* Indicates if load monitor is passive. A passive load monitor does not remove service from LB decision when threshold is breached.
	* </pre>
	*/
	public void set_passive(Boolean passive) throws Exception{
		this.passive = passive;
	}

	/**
	* <pre>
	* Indicates if load monitor is passive. A passive load monitor does not remove service from LB decision when threshold is breached.
	* </pre>
	*/
	public Boolean get_passive() throws Exception {
		return this.passive;
	}

	/**
	* <pre>
	* The monitor Names.
	* </pre>
	*/
	public void set_monitor_name(String monitor_name) throws Exception{
		this.monitor_name = monitor_name;
	}

	/**
	* <pre>
	* The monitor Names.
	* </pre>
	*/
	public String get_monitor_name() throws Exception {
		return this.monitor_name;
	}

	/**
	* <pre>
	* The configured state (enable/disable) of the monitor on this server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_monstate(String monstate) throws Exception{
		this.monstate = monstate;
	}

	/**
	* <pre>
	* The configured state (enable/disable) of the monitor on this server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_monstate() throws Exception {
		return this.monstate;
	}

	/**
	* <pre>
	* Second parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam2() throws Exception {
		return this.monstatparam2;
	}

	/**
	* <pre>
	* The code indicating the monitor response.
	* </pre>
	*/
	public Integer get_monstatcode() throws Exception {
		return this.monstatcode;
	}

	/**
	* <pre>
	* The string form of monstatcode.
	* </pre>
	*/
	public String get_lastresponse() throws Exception {
		return this.lastresponse;
	}

	/**
	* <pre>
	* Number of the current failed monitoring probes.
	* </pre>
	*/
	public Long get_failedprobes() throws Exception {
		return this.failedprobes;
	}

	/**
	* <pre>
	* Third parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam3() throws Exception {
		return this.monstatparam3;
	}

	/**
	* <pre>
	* The total number of probs sent.
	* </pre>
	*/
	public Long get_totalprobes() throws Exception {
		return this.totalprobes;
	}

	/**
	* <pre>
	* The running state of the monitor on this service.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_monitor_state() throws Exception {
		return this.monitor_state;
	}

	/**
	* <pre>
	* Added this field for getting state value from table.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dup_state() throws Exception {
		return this.dup_state;
	}

	/**
	* <pre>
	* Total number of probes sent to monitor this service.
	* </pre>
	*/
	public Long get_monitortotalprobes() throws Exception {
		return this.monitortotalprobes;
	}

	/**
	* <pre>
	* The weight of the monitor.
	* </pre>
	*/
	public Long get_dup_weight() throws Exception {
		return this.dup_weight;
	}

	/**
	* <pre>
	* First parameter for use with message code.
	* </pre>
	*/
	public Integer get_monstatparam1() throws Exception {
		return this.monstatparam1;
	}

	/**
	* <pre>
	* Response time of this monitor.
	* </pre>
	*/
	public Long get_responsetime() throws Exception {
		return this.responsetime;
	}

	/**
	* <pre>
	* Total number of failed probes.
	* </pre>
	*/
	public Long get_monitortotalfailedprobes() throws Exception {
		return this.monitortotalfailedprobes;
	}

	/**
	* <pre>
	* Total number of currently failed probes.
	* </pre>
	*/
	public Long get_monitorcurrentfailedprobes() throws Exception {
		return this.monitorcurrentfailedprobes;
	}

	/**
	* <pre>
	* The total number of failed probs.
	* </pre>
	*/
	public Long get_totalfailedprobes() throws Exception {
		return this.totalfailedprobes;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		service_lbmonitor_binding_response result = (service_lbmonitor_binding_response) service.get_payload_formatter().string_to_resource(service_lbmonitor_binding_response.class, response);
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
		return result.service_lbmonitor_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, service_lbmonitor_binding resource) throws Exception {
		service_lbmonitor_binding updateresource = new service_lbmonitor_binding();
		updateresource.name = resource.name;
		updateresource.monitor_name = resource.monitor_name;
		updateresource.monstate = resource.monstate;
		updateresource.weight = resource.weight;
		updateresource.passive = resource.passive;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, service_lbmonitor_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service_lbmonitor_binding updateresources[] = new service_lbmonitor_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new service_lbmonitor_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].monitor_name = resources[i].monitor_name;
				updateresources[i].monstate = resources[i].monstate;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].passive = resources[i].passive;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, service_lbmonitor_binding resource) throws Exception {
		service_lbmonitor_binding deleteresource = new service_lbmonitor_binding();
		deleteresource.name = resource.name;
		deleteresource.monitor_name = resource.monitor_name;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, service_lbmonitor_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			service_lbmonitor_binding deleteresources[] = new service_lbmonitor_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new service_lbmonitor_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].monitor_name = resources[i].monitor_name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch service_lbmonitor_binding resources of given name .
	*/
	public static service_lbmonitor_binding[] get(nitro_service service, String name) throws Exception{
		service_lbmonitor_binding obj = new service_lbmonitor_binding();
		obj.set_name(name);
		service_lbmonitor_binding response[] = (service_lbmonitor_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of service_lbmonitor_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static service_lbmonitor_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		service_lbmonitor_binding obj = new service_lbmonitor_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		service_lbmonitor_binding[] response = (service_lbmonitor_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of service_lbmonitor_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static service_lbmonitor_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		service_lbmonitor_binding obj = new service_lbmonitor_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		service_lbmonitor_binding[] response = (service_lbmonitor_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count service_lbmonitor_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		service_lbmonitor_binding obj = new service_lbmonitor_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		service_lbmonitor_binding response[] = (service_lbmonitor_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of service_lbmonitor_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		service_lbmonitor_binding obj = new service_lbmonitor_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		service_lbmonitor_binding[] response = (service_lbmonitor_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of service_lbmonitor_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		service_lbmonitor_binding obj = new service_lbmonitor_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		service_lbmonitor_binding[] response = (service_lbmonitor_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class monitor_stateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
	}
	public static class monstateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dup_stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}