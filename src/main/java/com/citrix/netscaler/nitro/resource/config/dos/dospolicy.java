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

package com.citrix.netscaler.nitro.resource.config.dos;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dospolicy_response extends base_response
{
	public dospolicy[] dospolicy;
}
/**
* Configuration for DoS policy resource.
*/

public class dospolicy extends base_resource
{
	private String name;
	private Long qdepth;
	private Long cltdetectrate;
	private Long __count;

	/**
	* <pre>
	* Name for the HTTP DoS protection policy. Must begin with a letter, number, or the underscore character (_). Other characters allowed, after the first character, are the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), and colon (:) characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the HTTP DoS protection policy. Must begin with a letter, number, or the underscore character (_). Other characters allowed, after the first character, are the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), and colon (:) characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Queue depth. The queue size (the number of outstanding service requests on the system) before DoS protection is activated on the service to which the DoS protection policy is bound.<br> Minimum value =  21
	* </pre>
	*/
	public void set_qdepth(long qdepth) throws Exception {
		this.qdepth = new Long(qdepth);
	}

	/**
	* <pre>
	* Queue depth. The queue size (the number of outstanding service requests on the system) before DoS protection is activated on the service to which the DoS protection policy is bound.<br> Minimum value =  21
	* </pre>
	*/
	public void set_qdepth(Long qdepth) throws Exception{
		this.qdepth = qdepth;
	}

	/**
	* <pre>
	* Queue depth. The queue size (the number of outstanding service requests on the system) before DoS protection is activated on the service to which the DoS protection policy is bound.<br> Minimum value =  21
	* </pre>
	*/
	public Long get_qdepth() throws Exception {
		return this.qdepth;
	}

	/**
	* <pre>
	* Client detect rate. Integer representing the percentage of traffic to which the HTTP DoS policy is to be applied after the queue depth condition is satisfied.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_cltdetectrate(long cltdetectrate) throws Exception {
		this.cltdetectrate = new Long(cltdetectrate);
	}

	/**
	* <pre>
	* Client detect rate. Integer representing the percentage of traffic to which the HTTP DoS policy is to be applied after the queue depth condition is satisfied.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_cltdetectrate(Long cltdetectrate) throws Exception{
		this.cltdetectrate = cltdetectrate;
	}

	/**
	* <pre>
	* Client detect rate. Integer representing the percentage of traffic to which the HTTP DoS policy is to be applied after the queue depth condition is satisfied.<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_cltdetectrate() throws Exception {
		return this.cltdetectrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dospolicy_response result = (dospolicy_response) service.get_payload_formatter().string_to_resource(dospolicy_response.class, response);
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
		return result.dospolicy;
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
	* Use this API to add dospolicy.
	*/
	public static base_response add(nitro_service client, dospolicy resource) throws Exception {
		dospolicy addresource = new dospolicy();
		addresource.name = resource.name;
		addresource.qdepth = resource.qdepth;
		addresource.cltdetectrate = resource.cltdetectrate;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dospolicy resources.
	*/
	public static base_responses add(nitro_service client, dospolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dospolicy addresources[] = new dospolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dospolicy();
				addresources[i].name = resources[i].name;
				addresources[i].qdepth = resources[i].qdepth;
				addresources[i].cltdetectrate = resources[i].cltdetectrate;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dospolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		dospolicy deleteresource = new dospolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dospolicy.
	*/
	public static base_response delete(nitro_service client, dospolicy resource) throws Exception {
		dospolicy deleteresource = new dospolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dospolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			dospolicy deleteresources[] = new dospolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new dospolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dospolicy resources.
	*/
	public static base_responses delete(nitro_service client, dospolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dospolicy deleteresources[] = new dospolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dospolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dospolicy.
	*/
	public static base_response update(nitro_service client, dospolicy resource) throws Exception {
		dospolicy updateresource = new dospolicy();
		updateresource.name = resource.name;
		updateresource.qdepth = resource.qdepth;
		updateresource.cltdetectrate = resource.cltdetectrate;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dospolicy resources.
	*/
	public static base_responses update(nitro_service client, dospolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dospolicy updateresources[] = new dospolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dospolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].qdepth = resources[i].qdepth;
				updateresources[i].cltdetectrate = resources[i].cltdetectrate;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dospolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dospolicy resource, String[] args) throws Exception{
		dospolicy unsetresource = new dospolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dospolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			dospolicy unsetresources[] = new dospolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new dospolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dospolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dospolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dospolicy unsetresources[] = new dospolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dospolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dospolicy resources that are configured on netscaler.
	*/
	public static dospolicy[] get(nitro_service service) throws Exception{
		dospolicy obj = new dospolicy();
		dospolicy[] response = (dospolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dospolicy resources that are configured on netscaler.
	*/
	public static dospolicy[] get(nitro_service service, options option) throws Exception{
		dospolicy obj = new dospolicy();
		dospolicy[] response = (dospolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dospolicy resource of given name .
	*/
	public static dospolicy get(nitro_service service, String name) throws Exception{
		dospolicy obj = new dospolicy();
		obj.set_name(name);
		dospolicy response = (dospolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dospolicy resources of given names .
	*/
	public static dospolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			dospolicy response[] = new dospolicy[name.length];
			dospolicy obj[] = new dospolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new dospolicy();
				obj[i].set_name(name[i]);
				response[i] = (dospolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dospolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dospolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		dospolicy obj = new dospolicy();
		options option = new options();
		option.set_filter(filter);
		dospolicy[] response = (dospolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dospolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dospolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dospolicy obj = new dospolicy();
		options option = new options();
		option.set_filter(filter);
		dospolicy[] response = (dospolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dospolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dospolicy obj = new dospolicy();
		options option = new options();
		option.set_count(true);
		dospolicy[] response = (dospolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dospolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dospolicy obj = new dospolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dospolicy[] response = (dospolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dospolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dospolicy obj = new dospolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dospolicy[] response = (dospolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
