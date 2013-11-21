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

class nstimer_response extends base_response
{
	public nstimer[] nstimer;
}
/**
* Configuration for Timer resource.
*/

public class nstimer extends base_resource
{
	private String name;
	private Integer interval;
	private String unit;
	private String comment;
	private String newname;
	private Long __count;

	/**
	* <pre>
	* Timer name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Timer name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The frequency at which the policies bound to this timer are invoked. The minimum value is 20 msec. The maximum value is 20940 in seconds and 349 in minutes.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  20940000
	* </pre>
	*/
	public void set_interval(int interval) throws Exception {
		this.interval = new Integer(interval);
	}

	/**
	* <pre>
	* The frequency at which the policies bound to this timer are invoked. The minimum value is 20 msec. The maximum value is 20940 in seconds and 349 in minutes.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  20940000
	* </pre>
	*/
	public void set_interval(Integer interval) throws Exception{
		this.interval = interval;
	}

	/**
	* <pre>
	* The frequency at which the policies bound to this timer are invoked. The minimum value is 20 msec. The maximum value is 20940 in seconds and 349 in minutes.<br> Default value: 5<br> Minimum value =  1<br> Maximum value =  20940000
	* </pre>
	*/
	public Integer get_interval() throws Exception {
		return this.interval;
	}

	/**
	* <pre>
	* Timer interval unit.<br> Default value: SEC<br> Possible values = SEC, MIN
	* </pre>
	*/
	public void set_unit(String unit) throws Exception{
		this.unit = unit;
	}

	/**
	* <pre>
	* Timer interval unit.<br> Default value: SEC<br> Possible values = SEC, MIN
	* </pre>
	*/
	public String get_unit() throws Exception {
		return this.unit;
	}

	/**
	* <pre>
	* Comments associated with this timer.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this timer.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The new name of the timer.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the timer.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nstimer_response result = (nstimer_response) service.get_payload_formatter().string_to_resource(nstimer_response.class, response);
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
		return result.nstimer;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add nstimer.
	*/
	public static base_response add(nitro_service client, nstimer resource) throws Exception {
		nstimer addresource = new nstimer();
		addresource.name = resource.name;
		addresource.interval = resource.interval;
		addresource.unit = resource.unit;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nstimer resources.
	*/
	public static base_responses add(nitro_service client, nstimer resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstimer addresources[] = new nstimer[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nstimer();
				addresources[i].name = resources[i].name;
				addresources[i].interval = resources[i].interval;
				addresources[i].unit = resources[i].unit;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nstimer of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		nstimer deleteresource = new nstimer();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nstimer.
	*/
	public static base_response delete(nitro_service client, nstimer resource) throws Exception {
		nstimer deleteresource = new nstimer();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nstimer resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nstimer deleteresources[] = new nstimer[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new nstimer();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nstimer resources.
	*/
	public static base_responses delete(nitro_service client, nstimer resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstimer deleteresources[] = new nstimer[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nstimer();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nstimer.
	*/
	public static base_response update(nitro_service client, nstimer resource) throws Exception {
		nstimer updateresource = new nstimer();
		updateresource.name = resource.name;
		updateresource.interval = resource.interval;
		updateresource.unit = resource.unit;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nstimer resources.
	*/
	public static base_responses update(nitro_service client, nstimer resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstimer updateresources[] = new nstimer[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nstimer();
				updateresources[i].name = resources[i].name;
				updateresources[i].interval = resources[i].interval;
				updateresources[i].unit = resources[i].unit;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nstimer resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		nstimer unsetresource = new nstimer();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of nstimer resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nstimer resource, String[] args) throws Exception{
		nstimer unsetresource = new nstimer();
		unsetresource.name = resource.name;
		unsetresource.interval = resource.interval;
		unsetresource.unit = resource.unit;
		unsetresource.comment = resource.comment;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nstimer resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nstimer unsetresources[] = new nstimer[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new nstimer();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nstimer resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nstimer resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nstimer unsetresources[] = new nstimer[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nstimer();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].interval = resources[i].interval;
				unsetresources[i].unit = resources[i].unit;
				unsetresources[i].comment = resources[i].comment;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a nstimer resource.
	*/
	public static base_response rename(nitro_service client, nstimer resource, String new_name) throws Exception {
		nstimer renameresource = new nstimer();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a nstimer resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		nstimer renameresource = new nstimer();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the nstimer resources that are configured on netscaler.
	*/
	public static nstimer[] get(nitro_service service) throws Exception{
		nstimer obj = new nstimer();
		nstimer[] response = (nstimer[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nstimer resources that are configured on netscaler.
	*/
	public static nstimer[] get(nitro_service service, options option) throws Exception{
		nstimer obj = new nstimer();
		nstimer[] response = (nstimer[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nstimer resource of given name .
	*/
	public static nstimer get(nitro_service service, String name) throws Exception{
		nstimer obj = new nstimer();
		obj.set_name(name);
		nstimer response = (nstimer) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nstimer resources of given names .
	*/
	public static nstimer[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nstimer response[] = new nstimer[name.length];
			nstimer obj[] = new nstimer[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nstimer();
				obj[i].set_name(name[i]);
				response[i] = (nstimer) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nstimer resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nstimer[] get_filtered(nitro_service service, String filter) throws Exception{
		nstimer obj = new nstimer();
		options option = new options();
		option.set_filter(filter);
		nstimer[] response = (nstimer[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nstimer resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nstimer[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nstimer obj = new nstimer();
		options option = new options();
		option.set_filter(filter);
		nstimer[] response = (nstimer[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nstimer resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nstimer obj = new nstimer();
		options option = new options();
		option.set_count(true);
		nstimer[] response = (nstimer[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nstimer resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nstimer obj = new nstimer();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstimer[] response = (nstimer[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nstimer resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nstimer obj = new nstimer();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nstimer[] response = (nstimer[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class unitEnum {
		public static final String SEC = "SEC";
		public static final String MIN = "MIN";
	}
}
