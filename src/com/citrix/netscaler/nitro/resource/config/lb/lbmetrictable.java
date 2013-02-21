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

class lbmetrictable_response extends base_response
{
	public lbmetrictable[] lbmetrictable;
}
/**
* Configuration for metric table resource.
*/

public class lbmetrictable extends base_resource
{
	private String metrictable;
	private String metric;
	private String Snmpoid;

	//------- Read only Parameter ---------;

	private Boolean flags;
	private String metrictype;
	private Long __count;

	/**
	* <pre>
	* The name of the metric table.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_metrictable(String metrictable) throws Exception{
		this.metrictable = metrictable;
	}

	/**
	* <pre>
	* The name of the metric table.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_metrictable() throws Exception {
		return this.metrictable;
	}

	/**
	* <pre>
	* Metric name in the metric table.<br> Minimum length =  1
	* </pre>
	*/
	public void set_metric(String metric) throws Exception{
		this.metric = metric;
	}

	/**
	* <pre>
	* Metric name in the metric table.<br> Minimum length =  1
	* </pre>
	*/
	public String get_metric() throws Exception {
		return this.metric;
	}

	/**
	* <pre>
	* New OID that must be used.<br> Minimum length =  1
	* </pre>
	*/
	public void set_Snmpoid(String Snmpoid) throws Exception{
		this.Snmpoid = Snmpoid;
	}

	/**
	* <pre>
	* New OID that must be used.<br> Minimum length =  1
	* </pre>
	*/
	public String get_Snmpoid() throws Exception {
		return this.Snmpoid;
	}

	/**
	* <pre>
	* flags controlling display.
	* </pre>
	*/
	public Boolean get_flags() throws Exception {
		return this.flags;
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
		lbmetrictable_response result = (lbmetrictable_response) service.get_payload_formatter().string_to_resource(lbmetrictable_response.class, response);
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
		return result.lbmetrictable;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.metrictable;
	}

	/**
	* Use this API to add lbmetrictable.
	*/
	public static base_response add(nitro_service client, lbmetrictable resource) throws Exception {
		lbmetrictable addresource = new lbmetrictable();
		addresource.metrictable = resource.metrictable;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add lbmetrictable resources.
	*/
	public static base_responses add(nitro_service client, lbmetrictable resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmetrictable addresources[] = new lbmetrictable[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new lbmetrictable();
				addresources[i].metrictable = resources[i].metrictable;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbmetrictable of given name.
	*/
	public static base_response delete(nitro_service client, String metrictable) throws Exception {
		lbmetrictable deleteresource = new lbmetrictable();
		deleteresource.metrictable = metrictable;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbmetrictable.
	*/
	public static base_response delete(nitro_service client, lbmetrictable resource) throws Exception {
		lbmetrictable deleteresource = new lbmetrictable();
		deleteresource.metrictable = resource.metrictable;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete lbmetrictable resources of given names.
	*/
	public static base_responses delete(nitro_service client, String metrictable[]) throws Exception {
		base_responses result = null;
		if (metrictable != null && metrictable.length > 0) {
			lbmetrictable deleteresources[] = new lbmetrictable[metrictable.length];
			for (int i=0;i<metrictable.length;i++){
				deleteresources[i] = new lbmetrictable();
				deleteresources[i].metrictable = metrictable[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete lbmetrictable resources.
	*/
	public static base_responses delete(nitro_service client, lbmetrictable resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmetrictable deleteresources[] = new lbmetrictable[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbmetrictable();
				deleteresources[i].metrictable = resources[i].metrictable;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update lbmetrictable.
	*/
	public static base_response update(nitro_service client, lbmetrictable resource) throws Exception {
		lbmetrictable updateresource = new lbmetrictable();
		updateresource.metrictable = resource.metrictable;
		updateresource.metric = resource.metric;
		updateresource.Snmpoid = resource.Snmpoid;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update lbmetrictable resources.
	*/
	public static base_responses update(nitro_service client, lbmetrictable resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbmetrictable updateresources[] = new lbmetrictable[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbmetrictable();
				updateresources[i].metrictable = resources[i].metrictable;
				updateresources[i].metric = resources[i].metric;
				updateresources[i].Snmpoid = resources[i].Snmpoid;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the lbmetrictable resources that are configured on netscaler.
	*/
	public static lbmetrictable[] get(nitro_service service) throws Exception{
		lbmetrictable obj = new lbmetrictable();
		lbmetrictable[] response = (lbmetrictable[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lbmetrictable resources that are configured on netscaler.
	*/
	public static lbmetrictable[] get(nitro_service service, options option) throws Exception{
		lbmetrictable obj = new lbmetrictable();
		lbmetrictable[] response = (lbmetrictable[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch lbmetrictable resource of given name .
	*/
	public static lbmetrictable get(nitro_service service, String metrictable) throws Exception{
		lbmetrictable obj = new lbmetrictable();
		obj.set_metrictable(metrictable);
		lbmetrictable response = (lbmetrictable) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbmetrictable resources of given names .
	*/
	public static lbmetrictable[] get(nitro_service service, String metrictable[]) throws Exception{
		if (metrictable !=null && metrictable.length>0) {
			lbmetrictable response[] = new lbmetrictable[metrictable.length];
			lbmetrictable obj[] = new lbmetrictable[metrictable.length];
			for (int i=0;i<metrictable.length;i++) {
				obj[i] = new lbmetrictable();
				obj[i].set_metrictable(metrictable[i]);
				response[i] = (lbmetrictable) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of lbmetrictable resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbmetrictable[] get_filtered(nitro_service service, String filter) throws Exception{
		lbmetrictable obj = new lbmetrictable();
		options option = new options();
		option.set_filter(filter);
		lbmetrictable[] response = (lbmetrictable[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbmetrictable resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbmetrictable[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbmetrictable obj = new lbmetrictable();
		options option = new options();
		option.set_filter(filter);
		lbmetrictable[] response = (lbmetrictable[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbmetrictable resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lbmetrictable obj = new lbmetrictable();
		options option = new options();
		option.set_count(true);
		lbmetrictable[] response = (lbmetrictable[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbmetrictable resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lbmetrictable obj = new lbmetrictable();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmetrictable[] response = (lbmetrictable[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbmetrictable resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbmetrictable obj = new lbmetrictable();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbmetrictable[] response = (lbmetrictable[]) obj.getfiltered(service, option);
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
