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

package com.citrix.netscaler.nitro.resource.config.autoscale;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class autoscaleaction_response extends base_response
{
	public autoscaleaction[] autoscaleaction;
}
/**
* Configuration for autoscale action resource.
*/

public class autoscaleaction extends base_resource
{
	private String name;
	private String type;
	private String profilename;
	private String parameters;
	private Long vmdestroygraceperiod;
	private Long quiettime;
	private String vserver;
	private Long __count;

	/**
	* <pre>
	* ActionScale action name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* ActionScale action name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The type of action.<br> Possible values = 
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of action.<br> Possible values = 
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* AutoScale profile name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* AutoScale profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Parameters to use in the action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_parameters(String parameters) throws Exception{
		this.parameters = parameters;
	}

	/**
	* <pre>
	* Parameters to use in the action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_parameters() throws Exception {
		return this.parameters;
	}

	/**
	* <pre>
	* Time in minutes a VM is kept in inactive state before destroying.<br> Default value: 10
	* </pre>
	*/
	public void set_vmdestroygraceperiod(long vmdestroygraceperiod) throws Exception {
		this.vmdestroygraceperiod = new Long(vmdestroygraceperiod);
	}

	/**
	* <pre>
	* Time in minutes a VM is kept in inactive state before destroying.<br> Default value: 10
	* </pre>
	*/
	public void set_vmdestroygraceperiod(Long vmdestroygraceperiod) throws Exception{
		this.vmdestroygraceperiod = vmdestroygraceperiod;
	}

	/**
	* <pre>
	* Time in minutes a VM is kept in inactive state before destroying.<br> Default value: 10
	* </pre>
	*/
	public Long get_vmdestroygraceperiod() throws Exception {
		return this.vmdestroygraceperiod;
	}

	/**
	* <pre>
	* Time in seconds no other policy is evaluated or action is taken.<br> Default value: 300
	* </pre>
	*/
	public void set_quiettime(long quiettime) throws Exception {
		this.quiettime = new Long(quiettime);
	}

	/**
	* <pre>
	* Time in seconds no other policy is evaluated or action is taken.<br> Default value: 300
	* </pre>
	*/
	public void set_quiettime(Long quiettime) throws Exception{
		this.quiettime = quiettime;
	}

	/**
	* <pre>
	* Time in seconds no other policy is evaluated or action is taken.<br> Default value: 300
	* </pre>
	*/
	public Long get_quiettime() throws Exception {
		return this.quiettime;
	}

	/**
	* <pre>
	* Name of the vserver on which autoscale action has to be taken.
	* </pre>
	*/
	public void set_vserver(String vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* Name of the vserver on which autoscale action has to be taken.
	* </pre>
	*/
	public String get_vserver() throws Exception {
		return this.vserver;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		autoscaleaction_response result = (autoscaleaction_response) service.get_payload_formatter().string_to_resource(autoscaleaction_response.class, response);
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
		return result.autoscaleaction;
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
	* Use this API to add autoscaleaction.
	*/
	public static base_response add(nitro_service client, autoscaleaction resource) throws Exception {
		autoscaleaction addresource = new autoscaleaction();
		addresource.name = resource.name;
		addresource.type = resource.type;
		addresource.profilename = resource.profilename;
		addresource.parameters = resource.parameters;
		addresource.vmdestroygraceperiod = resource.vmdestroygraceperiod;
		addresource.quiettime = resource.quiettime;
		addresource.vserver = resource.vserver;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add autoscaleaction resources.
	*/
	public static base_responses add(nitro_service client, autoscaleaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscaleaction addresources[] = new autoscaleaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new autoscaleaction();
				addresources[i].name = resources[i].name;
				addresources[i].type = resources[i].type;
				addresources[i].profilename = resources[i].profilename;
				addresources[i].parameters = resources[i].parameters;
				addresources[i].vmdestroygraceperiod = resources[i].vmdestroygraceperiod;
				addresources[i].quiettime = resources[i].quiettime;
				addresources[i].vserver = resources[i].vserver;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete autoscaleaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		autoscaleaction deleteresource = new autoscaleaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete autoscaleaction.
	*/
	public static base_response delete(nitro_service client, autoscaleaction resource) throws Exception {
		autoscaleaction deleteresource = new autoscaleaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete autoscaleaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			autoscaleaction deleteresources[] = new autoscaleaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new autoscaleaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete autoscaleaction resources.
	*/
	public static base_responses delete(nitro_service client, autoscaleaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscaleaction deleteresources[] = new autoscaleaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new autoscaleaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update autoscaleaction.
	*/
	public static base_response update(nitro_service client, autoscaleaction resource) throws Exception {
		autoscaleaction updateresource = new autoscaleaction();
		updateresource.name = resource.name;
		updateresource.profilename = resource.profilename;
		updateresource.parameters = resource.parameters;
		updateresource.vmdestroygraceperiod = resource.vmdestroygraceperiod;
		updateresource.quiettime = resource.quiettime;
		updateresource.vserver = resource.vserver;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update autoscaleaction resources.
	*/
	public static base_responses update(nitro_service client, autoscaleaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscaleaction updateresources[] = new autoscaleaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new autoscaleaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].profilename = resources[i].profilename;
				updateresources[i].parameters = resources[i].parameters;
				updateresources[i].vmdestroygraceperiod = resources[i].vmdestroygraceperiod;
				updateresources[i].quiettime = resources[i].quiettime;
				updateresources[i].vserver = resources[i].vserver;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of autoscaleaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		autoscaleaction unsetresource = new autoscaleaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of autoscaleaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, autoscaleaction resource, String[] args) throws Exception{
		autoscaleaction unsetresource = new autoscaleaction();
		unsetresource.name = resource.name;
		unsetresource.vmdestroygraceperiod = resource.vmdestroygraceperiod;
		unsetresource.quiettime = resource.quiettime;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of autoscaleaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			autoscaleaction unsetresources[] = new autoscaleaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new autoscaleaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of autoscaleaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, autoscaleaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			autoscaleaction unsetresources[] = new autoscaleaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new autoscaleaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].vmdestroygraceperiod = resources[i].vmdestroygraceperiod;
				unsetresources[i].quiettime = resources[i].quiettime;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the autoscaleaction resources that are configured on netscaler.
	*/
	public static autoscaleaction[] get(nitro_service service) throws Exception{
		autoscaleaction obj = new autoscaleaction();
		autoscaleaction[] response = (autoscaleaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the autoscaleaction resources that are configured on netscaler.
	*/
	public static autoscaleaction[] get(nitro_service service, options option) throws Exception{
		autoscaleaction obj = new autoscaleaction();
		autoscaleaction[] response = (autoscaleaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch autoscaleaction resource of given name .
	*/
	public static autoscaleaction get(nitro_service service, String name) throws Exception{
		autoscaleaction obj = new autoscaleaction();
		obj.set_name(name);
		autoscaleaction response = (autoscaleaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch autoscaleaction resources of given names .
	*/
	public static autoscaleaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			autoscaleaction response[] = new autoscaleaction[name.length];
			autoscaleaction obj[] = new autoscaleaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new autoscaleaction();
				obj[i].set_name(name[i]);
				response[i] = (autoscaleaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of autoscaleaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static autoscaleaction[] get_filtered(nitro_service service, String filter) throws Exception{
		autoscaleaction obj = new autoscaleaction();
		options option = new options();
		option.set_filter(filter);
		autoscaleaction[] response = (autoscaleaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of autoscaleaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static autoscaleaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		autoscaleaction obj = new autoscaleaction();
		options option = new options();
		option.set_filter(filter);
		autoscaleaction[] response = (autoscaleaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the autoscaleaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		autoscaleaction obj = new autoscaleaction();
		options option = new options();
		option.set_count(true);
		autoscaleaction[] response = (autoscaleaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of autoscaleaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		autoscaleaction obj = new autoscaleaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		autoscaleaction[] response = (autoscaleaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of autoscaleaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		autoscaleaction obj = new autoscaleaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		autoscaleaction[] response = (autoscaleaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
