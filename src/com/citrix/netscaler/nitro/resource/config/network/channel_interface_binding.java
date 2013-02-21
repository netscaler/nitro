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

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class channel_interface_binding_response extends base_response
{
	public channel_interface_binding[] channel_interface_binding;
}
/**
	* Binding class showing the interface that can be bound to channel.
	*/

public class channel_interface_binding extends base_resource
{
	private String[] ifnum;
	private String mode;
	private Long slavestate;
	private Long slavemedia;
	private Long slavespeed;
	private Long slaveduplex;
	private Long slaveflowctl;
	private Long slavetime;
	private String id;
	private Long __count;

	/**
	* <pre>
	* LA channel name (in form LA/* or CLA/* for Cluster LA).
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* LA channel name (in form LA/* or CLA/* for Cluster LA).
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The interfaces to be bound to Link Aggregate channel.
	* </pre>
	*/
	public void set_ifnum(String[] ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* The interfaces to be bound to Link Aggregate channel.
	* </pre>
	*/
	public String[] get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* The initital mode for the LA channel.<br> Possible values = MANUAL, AUTO
	* </pre>
	*/
	public String get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* Speed of the member interfaces.
	* </pre>
	*/
	public Long get_slavespeed() throws Exception {
		return this.slavespeed;
	}

	/**
	* <pre>
	* Media type of the member interfaces.
	* </pre>
	*/
	public Long get_slavemedia() throws Exception {
		return this.slavemedia;
	}

	/**
	* <pre>
	* Duplex of the member interfaces.
	* </pre>
	*/
	public Long get_slaveduplex() throws Exception {
		return this.slaveduplex;
	}

	/**
	* <pre>
	* Flowcontrol of the member interfaces.
	* </pre>
	*/
	public Long get_slaveflowctl() throws Exception {
		return this.slaveflowctl;
	}

	/**
	* <pre>
	* UP time of the member interfaces.
	* </pre>
	*/
	public Long get_slavetime() throws Exception {
		return this.slavetime;
	}

	/**
	* <pre>
	* State of the member interfaces.
	* </pre>
	*/
	public Long get_slavestate() throws Exception {
		return this.slavestate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		channel_interface_binding_response result = (channel_interface_binding_response) service.get_payload_formatter().string_to_resource(channel_interface_binding_response.class, response);
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
		return result.channel_interface_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.id;
	}

	public static base_response add(nitro_service client, channel_interface_binding resource) throws Exception {
		channel_interface_binding updateresource = new channel_interface_binding();
		updateresource.id = resource.id;
		updateresource.ifnum = resource.ifnum;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, channel_interface_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			channel_interface_binding updateresources[] = new channel_interface_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new channel_interface_binding();
				updateresources[i].id = resources[i].id;
				updateresources[i].ifnum = resources[i].ifnum;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, channel_interface_binding resource) throws Exception {
		channel_interface_binding deleteresource = new channel_interface_binding();
		deleteresource.id = resource.id;
		deleteresource.ifnum = resource.ifnum;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, channel_interface_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			channel_interface_binding deleteresources[] = new channel_interface_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new channel_interface_binding();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].ifnum = resources[i].ifnum;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch channel_interface_binding resources of given name .
	*/
	public static channel_interface_binding[] get(nitro_service service, String id) throws Exception{
		channel_interface_binding obj = new channel_interface_binding();
		obj.set_id(id);
		channel_interface_binding response[] = (channel_interface_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of channel_interface_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static channel_interface_binding[] get_filtered(nitro_service service, String id, String filter) throws Exception{
		channel_interface_binding obj = new channel_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		channel_interface_binding[] response = (channel_interface_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of channel_interface_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static channel_interface_binding[] get_filtered(nitro_service service, String id, filtervalue[] filter) throws Exception{
		channel_interface_binding obj = new channel_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		channel_interface_binding[] response = (channel_interface_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count channel_interface_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String id) throws Exception{
		channel_interface_binding obj = new channel_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		channel_interface_binding response[] = (channel_interface_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of channel_interface_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String id, String filter) throws Exception{
		channel_interface_binding obj = new channel_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		channel_interface_binding[] response = (channel_interface_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of channel_interface_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String id, filtervalue[] filter) throws Exception{
		channel_interface_binding obj = new channel_interface_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		channel_interface_binding[] response = (channel_interface_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class modeEnum {
		public static final String MANUAL = "MANUAL";
		public static final String AUTO = "AUTO";
	}

}