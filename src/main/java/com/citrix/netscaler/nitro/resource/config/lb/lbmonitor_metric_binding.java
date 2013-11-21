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

class lbmonitor_metric_binding_response extends base_response
{
	public lbmonitor_metric_binding[] lbmonitor_metric_binding;
}
/**
	* Binding class showing the metric that can be bound to lbmonitor.
	*/

public class lbmonitor_metric_binding extends base_resource
{
	private String metric;
	private String metrictable;
	private String metric_unit;
	private Long metricweight;
	private Long metricthreshold;
	private String monitorname;
	private Long __count;

	/**
	* <pre>
	* Metric name in the metric table, whose setting is changed. A value zero disables the metric and it will not be used for load calculation.<br> Minimum length =  1<br> Maximum length =  37
	* </pre>
	*/
	public void set_metric(String metric) throws Exception{
		this.metric = metric;
	}

	/**
	* <pre>
	* Metric name in the metric table, whose setting is changed. A value zero disables the metric and it will not be used for load calculation.<br> Minimum length =  1<br> Maximum length =  37
	* </pre>
	*/
	public String get_metric() throws Exception {
		return this.metric;
	}

	/**
	* <pre>
	* Threshold to be used for that metric.
	* </pre>
	*/
	public void set_metricthreshold(long metricthreshold) throws Exception {
		this.metricthreshold = new Long(metricthreshold);
	}

	/**
	* <pre>
	* Threshold to be used for that metric.
	* </pre>
	*/
	public void set_metricthreshold(Long metricthreshold) throws Exception{
		this.metricthreshold = metricthreshold;
	}

	/**
	* <pre>
	* Threshold to be used for that metric.
	* </pre>
	*/
	public Long get_metricthreshold() throws Exception {
		return this.metricthreshold;
	}

	/**
	* <pre>
	* The weight for the specified service metric with respect to others.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_metricweight(long metricweight) throws Exception {
		this.metricweight = new Long(metricweight);
	}

	/**
	* <pre>
	* The weight for the specified service metric with respect to others.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_metricweight(Long metricweight) throws Exception{
		this.metricweight = metricweight;
	}

	/**
	* <pre>
	* The weight for the specified service metric with respect to others.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_metricweight() throws Exception {
		return this.metricweight;
	}

	/**
	* <pre>
	* Name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitorname(String monitorname) throws Exception{
		this.monitorname = monitorname;
	}

	/**
	* <pre>
	* Name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitorname() throws Exception {
		return this.monitorname;
	}

	/**
	* <pre>
	* Metric table to which to bind metrics.<br> Minimum length =  1<br> Maximum length =  99
	* </pre>
	*/
	public String get_metrictable() throws Exception {
		return this.metrictable;
	}

	/**
	* <pre>
	* Giving the unit of the metric.<br> Possible values = Bytes/s, ms, pkts/s, users
	* </pre>
	*/
	public String get_metric_unit() throws Exception {
		return this.metric_unit;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonitor_metric_binding_response result = (lbmonitor_metric_binding_response) service.get_payload_formatter().string_to_resource(lbmonitor_metric_binding_response.class, response);
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
		return result.lbmonitor_metric_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.monitorname;
	}

	public static base_response add(nitro_service client, lbmonitor_metric_binding resource) throws Exception {
		lbmonitor_metric_binding updateresource = new lbmonitor_metric_binding();
		updateresource.monitorname = resource.monitorname;
		updateresource.metric = resource.metric;
		updateresource.metricthreshold = resource.metricthreshold;
		updateresource.metricweight = resource.metricweight;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, lbmonitor_metric_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor_metric_binding updateresources[] = new lbmonitor_metric_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbmonitor_metric_binding();
				updateresources[i].monitorname = resources[i].monitorname;
				updateresources[i].metric = resources[i].metric;
				updateresources[i].metricthreshold = resources[i].metricthreshold;
				updateresources[i].metricweight = resources[i].metricweight;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, lbmonitor_metric_binding resource) throws Exception {
		lbmonitor_metric_binding deleteresource = new lbmonitor_metric_binding();
		deleteresource.monitorname = resource.monitorname;
		deleteresource.metric = resource.metric;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, lbmonitor_metric_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmonitor_metric_binding deleteresources[] = new lbmonitor_metric_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbmonitor_metric_binding();
				deleteresources[i].monitorname = resources[i].monitorname;
				deleteresources[i].metric = resources[i].metric;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch lbmonitor_metric_binding resources of given name .
	*/
	public static lbmonitor_metric_binding[] get(nitro_service service, String monitorname) throws Exception{
		lbmonitor_metric_binding obj = new lbmonitor_metric_binding();
		obj.set_monitorname(monitorname);
		lbmonitor_metric_binding response[] = (lbmonitor_metric_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmonitor_metric_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbmonitor_metric_binding[] get_filtered(nitro_service service, String monitorname, String filter) throws Exception{
		lbmonitor_metric_binding obj = new lbmonitor_metric_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_filter(filter);
		lbmonitor_metric_binding[] response = (lbmonitor_metric_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmonitor_metric_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbmonitor_metric_binding[] get_filtered(nitro_service service, String monitorname, filtervalue[] filter) throws Exception{
		lbmonitor_metric_binding obj = new lbmonitor_metric_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_filter(filter);
		lbmonitor_metric_binding[] response = (lbmonitor_metric_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbmonitor_metric_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String monitorname) throws Exception{
		lbmonitor_metric_binding obj = new lbmonitor_metric_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_count(true);
		lbmonitor_metric_binding response[] = (lbmonitor_metric_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmonitor_metric_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String monitorname, String filter) throws Exception{
		lbmonitor_metric_binding obj = new lbmonitor_metric_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmonitor_metric_binding[] response = (lbmonitor_metric_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmonitor_metric_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String monitorname, filtervalue[] filter) throws Exception{
		lbmonitor_metric_binding obj = new lbmonitor_metric_binding();
		obj.set_monitorname(monitorname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmonitor_metric_binding[] response = (lbmonitor_metric_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class dup_stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class metric_unitEnum {
		public static final String Bytes_s = "Bytes/s";
		public static final String ms = "ms";
		public static final String pkts_s = "pkts/s";
		public static final String users = "users";
	}

}