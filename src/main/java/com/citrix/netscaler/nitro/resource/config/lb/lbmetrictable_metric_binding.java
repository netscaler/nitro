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

class lbmetrictable_metric_binding_response extends base_response
{
	public lbmetrictable_metric_binding[] lbmetrictable_metric_binding;
}
/**
	* Binding class showing the metric that can be bound to lbmetrictable.
	*/

public class lbmetrictable_metric_binding extends base_resource
{
	private String metric;
	private String Snmpoid;
	private String metrictype;
	private String metrictable;
	private Long __count;

	/**
	* <pre>
	* Name of the metric for which to change the SNMP OID.<br> Minimum length =  1
	* </pre>
	*/
	public void set_metric(String metric) throws Exception{
		this.metric = metric;
	}

	/**
	* <pre>
	* Name of the metric for which to change the SNMP OID.<br> Minimum length =  1
	* </pre>
	*/
	public String get_metric() throws Exception {
		return this.metric;
	}

	/**
	* <pre>
	* Name of the metric table.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_metrictable(String metrictable) throws Exception{
		this.metrictable = metrictable;
	}

	/**
	* <pre>
	* Name of the metric table.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_metrictable() throws Exception {
		return this.metrictable;
	}

	/**
	* <pre>
	* New SNMP OID of the metric.<br> Minimum length =  1
	* </pre>
	*/
	public void set_Snmpoid(String Snmpoid) throws Exception{
		this.Snmpoid = Snmpoid;
	}

	/**
	* <pre>
	* New SNMP OID of the metric.<br> Minimum length =  1
	* </pre>
	*/
	public String get_Snmpoid() throws Exception {
		return this.Snmpoid;
	}

	/**
	* <pre>
	* Indication if it is a configured or internal.<br> Possible values = INTERNAL, CONFIGURED
	* </pre>
	*/
	public String get_metrictype() throws Exception {
		return this.metrictype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmetrictable_metric_binding_response result = (lbmetrictable_metric_binding_response) service.get_payload_formatter().string_to_resource(lbmetrictable_metric_binding_response.class, response);
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
		return result.lbmetrictable_metric_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.metrictable;
	}

	public static base_response add(nitro_service client, lbmetrictable_metric_binding resource) throws Exception {
		lbmetrictable_metric_binding updateresource = new lbmetrictable_metric_binding();
		updateresource.metrictable = resource.metrictable;
		updateresource.metric = resource.metric;
		updateresource.Snmpoid = resource.Snmpoid;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, lbmetrictable_metric_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmetrictable_metric_binding updateresources[] = new lbmetrictable_metric_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbmetrictable_metric_binding();
				updateresources[i].metrictable = resources[i].metrictable;
				updateresources[i].metric = resources[i].metric;
				updateresources[i].Snmpoid = resources[i].Snmpoid;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, lbmetrictable_metric_binding resource) throws Exception {
		lbmetrictable_metric_binding deleteresource = new lbmetrictable_metric_binding();
		deleteresource.metrictable = resource.metrictable;
		deleteresource.metric = resource.metric;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, lbmetrictable_metric_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmetrictable_metric_binding deleteresources[] = new lbmetrictable_metric_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbmetrictable_metric_binding();
				deleteresources[i].metrictable = resources[i].metrictable;
				deleteresources[i].metric = resources[i].metric;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch lbmetrictable_metric_binding resources of given name .
	*/
	public static lbmetrictable_metric_binding[] get(nitro_service service, String metrictable) throws Exception{
		lbmetrictable_metric_binding obj = new lbmetrictable_metric_binding();
		obj.set_metrictable(metrictable);
		lbmetrictable_metric_binding response[] = (lbmetrictable_metric_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmetrictable_metric_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbmetrictable_metric_binding[] get_filtered(nitro_service service, String metrictable, String filter) throws Exception{
		lbmetrictable_metric_binding obj = new lbmetrictable_metric_binding();
		obj.set_metrictable(metrictable);
		options option = new options();
		option.set_filter(filter);
		lbmetrictable_metric_binding[] response = (lbmetrictable_metric_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmetrictable_metric_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbmetrictable_metric_binding[] get_filtered(nitro_service service, String metrictable, filtervalue[] filter) throws Exception{
		lbmetrictable_metric_binding obj = new lbmetrictable_metric_binding();
		obj.set_metrictable(metrictable);
		options option = new options();
		option.set_filter(filter);
		lbmetrictable_metric_binding[] response = (lbmetrictable_metric_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbmetrictable_metric_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String metrictable) throws Exception{
		lbmetrictable_metric_binding obj = new lbmetrictable_metric_binding();
		obj.set_metrictable(metrictable);
		options option = new options();
		option.set_count(true);
		lbmetrictable_metric_binding response[] = (lbmetrictable_metric_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmetrictable_metric_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String metrictable, String filter) throws Exception{
		lbmetrictable_metric_binding obj = new lbmetrictable_metric_binding();
		obj.set_metrictable(metrictable);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmetrictable_metric_binding[] response = (lbmetrictable_metric_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmetrictable_metric_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String metrictable, filtervalue[] filter) throws Exception{
		lbmetrictable_metric_binding obj = new lbmetrictable_metric_binding();
		obj.set_metrictable(metrictable);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmetrictable_metric_binding[] response = (lbmetrictable_metric_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class metrictypeEnum {
		public static final String INTERNAL = "INTERNAL";
		public static final String CONFIGURED = "CONFIGURED";
	}

}