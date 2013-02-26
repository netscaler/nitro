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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaakcdaccount_response extends base_response
{
	public aaakcdaccount[] aaakcdaccount;
}
/**
* Configuration for Kerberos constrained delegation account resource.
*/

public class aaakcdaccount extends base_resource
{
	private String kcdaccount;
	private String keytab;

	//------- Read only Parameter ---------;

	private String principle;
	private Long __count;

	/**
	* <pre>
	* The name of the KCD account.<br> Minimum length =  1
	* </pre>
	*/
	public void set_kcdaccount(String kcdaccount) throws Exception{
		this.kcdaccount = kcdaccount;
	}

	/**
	* <pre>
	* The name of the KCD account.<br> Minimum length =  1
	* </pre>
	*/
	public String get_kcdaccount() throws Exception {
		return this.kcdaccount;
	}

	/**
	* <pre>
	* The path to the keytab file.
	* </pre>
	*/
	public void set_keytab(String keytab) throws Exception{
		this.keytab = keytab;
	}

	/**
	* <pre>
	* The path to the keytab file.
	* </pre>
	*/
	public String get_keytab() throws Exception {
		return this.keytab;
	}

	/**
	* <pre>
	* Vserver principle.
	* </pre>
	*/
	public String get_principle() throws Exception {
		return this.principle;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaakcdaccount_response result = (aaakcdaccount_response) service.get_payload_formatter().string_to_resource(aaakcdaccount_response.class, response);
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
		return result.aaakcdaccount;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.kcdaccount;
	}

	/**
	* Use this API to add aaakcdaccount.
	*/
	public static base_response add(nitro_service client, aaakcdaccount resource) throws Exception {
		aaakcdaccount addresource = new aaakcdaccount();
		addresource.kcdaccount = resource.kcdaccount;
		addresource.keytab = resource.keytab;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add aaakcdaccount resources.
	*/
	public static base_responses add(nitro_service client, aaakcdaccount resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaakcdaccount addresources[] = new aaakcdaccount[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new aaakcdaccount();
				addresources[i].kcdaccount = resources[i].kcdaccount;
				addresources[i].keytab = resources[i].keytab;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaakcdaccount of given name.
	*/
	public static base_response delete(nitro_service client, String kcdaccount) throws Exception {
		aaakcdaccount deleteresource = new aaakcdaccount();
		deleteresource.kcdaccount = kcdaccount;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaakcdaccount.
	*/
	public static base_response delete(nitro_service client, aaakcdaccount resource) throws Exception {
		aaakcdaccount deleteresource = new aaakcdaccount();
		deleteresource.kcdaccount = resource.kcdaccount;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaakcdaccount resources of given names.
	*/
	public static base_responses delete(nitro_service client, String kcdaccount[]) throws Exception {
		base_responses result = null;
		if (kcdaccount != null && kcdaccount.length > 0) {
			aaakcdaccount deleteresources[] = new aaakcdaccount[kcdaccount.length];
			for (int i=0;i<kcdaccount.length;i++){
				deleteresources[i] = new aaakcdaccount();
				deleteresources[i].kcdaccount = kcdaccount[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaakcdaccount resources.
	*/
	public static base_responses delete(nitro_service client, aaakcdaccount resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaakcdaccount deleteresources[] = new aaakcdaccount[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaakcdaccount();
				deleteresources[i].kcdaccount = resources[i].kcdaccount;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update aaakcdaccount.
	*/
	public static base_response update(nitro_service client, aaakcdaccount resource) throws Exception {
		aaakcdaccount updateresource = new aaakcdaccount();
		updateresource.kcdaccount = resource.kcdaccount;
		updateresource.keytab = resource.keytab;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update aaakcdaccount resources.
	*/
	public static base_responses update(nitro_service client, aaakcdaccount resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaakcdaccount updateresources[] = new aaakcdaccount[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaakcdaccount();
				updateresources[i].kcdaccount = resources[i].kcdaccount;
				updateresources[i].keytab = resources[i].keytab;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of aaakcdaccount resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String kcdaccount, String args[]) throws Exception {
		aaakcdaccount unsetresource = new aaakcdaccount();
		unsetresource.kcdaccount = kcdaccount;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of aaakcdaccount resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaakcdaccount resource, String[] args) throws Exception{
		aaakcdaccount unsetresource = new aaakcdaccount();
		unsetresource.kcdaccount = resource.kcdaccount;
		unsetresource.keytab = resource.keytab;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of aaakcdaccount resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String kcdaccount[], String args[]) throws Exception {
		base_responses result = null;
		if (kcdaccount != null && kcdaccount.length > 0) {
			aaakcdaccount unsetresources[] = new aaakcdaccount[kcdaccount.length];
			for (int i=0;i<kcdaccount.length;i++){
				unsetresources[i] = new aaakcdaccount();
				unsetresources[i].kcdaccount = kcdaccount[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of aaakcdaccount resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, aaakcdaccount resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaakcdaccount unsetresources[] = new aaakcdaccount[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new aaakcdaccount();
				unsetresources[i].kcdaccount = resources[i].kcdaccount;
				unsetresources[i].keytab = resources[i].keytab;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the aaakcdaccount resources that are configured on netscaler.
	*/
	public static aaakcdaccount[] get(nitro_service service) throws Exception{
		aaakcdaccount obj = new aaakcdaccount();
		aaakcdaccount[] response = (aaakcdaccount[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the aaakcdaccount resources that are configured on netscaler.
	*/
	public static aaakcdaccount[] get(nitro_service service, options option) throws Exception{
		aaakcdaccount obj = new aaakcdaccount();
		aaakcdaccount[] response = (aaakcdaccount[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch aaakcdaccount resource of given name .
	*/
	public static aaakcdaccount get(nitro_service service, String kcdaccount) throws Exception{
		aaakcdaccount obj = new aaakcdaccount();
		obj.set_kcdaccount(kcdaccount);
		aaakcdaccount response = (aaakcdaccount) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch aaakcdaccount resources of given names .
	*/
	public static aaakcdaccount[] get(nitro_service service, String kcdaccount[]) throws Exception{
		if (kcdaccount !=null && kcdaccount.length>0) {
			aaakcdaccount response[] = new aaakcdaccount[kcdaccount.length];
			aaakcdaccount obj[] = new aaakcdaccount[kcdaccount.length];
			for (int i=0;i<kcdaccount.length;i++) {
				obj[i] = new aaakcdaccount();
				obj[i].set_kcdaccount(kcdaccount[i]);
				response[i] = (aaakcdaccount) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of aaakcdaccount resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaakcdaccount[] get_filtered(nitro_service service, String filter) throws Exception{
		aaakcdaccount obj = new aaakcdaccount();
		options option = new options();
		option.set_filter(filter);
		aaakcdaccount[] response = (aaakcdaccount[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaakcdaccount resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaakcdaccount[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaakcdaccount obj = new aaakcdaccount();
		options option = new options();
		option.set_filter(filter);
		aaakcdaccount[] response = (aaakcdaccount[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the aaakcdaccount resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		aaakcdaccount obj = new aaakcdaccount();
		options option = new options();
		option.set_count(true);
		aaakcdaccount[] response = (aaakcdaccount[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of aaakcdaccount resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		aaakcdaccount obj = new aaakcdaccount();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaakcdaccount[] response = (aaakcdaccount[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaakcdaccount resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaakcdaccount obj = new aaakcdaccount();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaakcdaccount[] response = (aaakcdaccount[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
