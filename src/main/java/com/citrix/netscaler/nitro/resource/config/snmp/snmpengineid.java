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

package com.citrix.netscaler.nitro.resource.config.snmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class snmpengineid_response extends base_response
{
	public snmpengineid[] snmpengineid;
}
/**
* Configuration for SNMP engine id resource.
*/

public class snmpengineid extends base_resource
{
	private String engineid;
	private Long ownernode;

	//------- Read only Parameter ---------;

	private String defaultengineid;
	private Long __count;

	/**
	* <pre>
	* A hexadecimal value of at least 10 characters, uniquely identifying the engineid.<br> Minimum length =  10<br> Maximum length =  31
	* </pre>
	*/
	public void set_engineid(String engineid) throws Exception{
		this.engineid = engineid;
	}

	/**
	* <pre>
	* A hexadecimal value of at least 10 characters, uniquely identifying the engineid.<br> Minimum length =  10<br> Maximum length =  31
	* </pre>
	*/
	public String get_engineid() throws Exception {
		return this.engineid;
	}

	/**
	* <pre>
	* ID of the cluster node for which you are setting the engineid.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_ownernode(long ownernode) throws Exception {
		this.ownernode = new Long(ownernode);
	}

	/**
	* <pre>
	* ID of the cluster node for which you are setting the engineid.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public void set_ownernode(Long ownernode) throws Exception{
		this.ownernode = ownernode;
	}

	/**
	* <pre>
	* ID of the cluster node for which you are setting the engineid.<br> Default value: -1<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_ownernode() throws Exception {
		return this.ownernode;
	}

	/**
	* <pre>
	* Unique identifier to assign to the SNMPv3 engine. Should be a hexadecimal value with a minimum length of 10 hex characters.
	* </pre>
	*/
	public String get_defaultengineid() throws Exception {
		return this.defaultengineid;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmpengineid_response result = (snmpengineid_response) service.get_payload_formatter().string_to_resource(snmpengineid_response.class, response);
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
		return result.snmpengineid;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.ownernode != null) {
			return this.ownernode.toString();
		}
		return null;
	}

	/**
	* Use this API to update snmpengineid.
	*/
	public static base_response update(nitro_service client, snmpengineid resource) throws Exception {
		snmpengineid updateresource = new snmpengineid();
		updateresource.engineid = resource.engineid;
		updateresource.ownernode = resource.ownernode;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update snmpengineid resources.
	*/
	public static base_responses update(nitro_service client, snmpengineid resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpengineid updateresources[] = new snmpengineid[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new snmpengineid();
				updateresources[i].engineid = resources[i].engineid;
				updateresources[i].ownernode = resources[i].ownernode;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpengineid resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, Long ownernode, String args[]) throws Exception {
		snmpengineid unsetresource = new snmpengineid();
		unsetresource.ownernode = ownernode;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of snmpengineid resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, snmpengineid resource, String[] args) throws Exception{
		snmpengineid unsetresource = new snmpengineid();
		unsetresource.ownernode = resource.ownernode;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of snmpengineid resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, Long ownernode[], String args[]) throws Exception {
		base_responses result = null;
		if (ownernode != null && ownernode.length > 0) {
			snmpengineid unsetresources[] = new snmpengineid[ownernode.length];
			for (int i=0;i<ownernode.length;i++){
				unsetresources[i] = new snmpengineid();
				unsetresources[i].ownernode = ownernode[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpengineid resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, snmpengineid resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpengineid unsetresources[] = new snmpengineid[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new snmpengineid();
				unsetresources[i].ownernode = resources[i].ownernode;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmpengineid resources that are configured on netscaler.
	*/
	public static snmpengineid[] get(nitro_service service) throws Exception{
		snmpengineid obj = new snmpengineid();
		snmpengineid[] response = (snmpengineid[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmpengineid resources that are configured on netscaler.
	*/
	public static snmpengineid[] get(nitro_service service, options option) throws Exception{
		snmpengineid obj = new snmpengineid();
		snmpengineid[] response = (snmpengineid[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch snmpengineid resource of given name .
	*/
	public static snmpengineid get(nitro_service service, Long ownernode) throws Exception{
		snmpengineid obj = new snmpengineid();
		obj.set_ownernode(ownernode);
		snmpengineid response = (snmpengineid) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch snmpengineid resources of given names .
	*/
	public static snmpengineid[] get(nitro_service service, Long ownernode[]) throws Exception{
		if (ownernode !=null && ownernode.length>0) {
			snmpengineid response[] = new snmpengineid[ownernode.length];
			snmpengineid obj[] = new snmpengineid[ownernode.length];
			for (int i=0;i<ownernode.length;i++) {
				obj[i] = new snmpengineid();
				obj[i].set_ownernode(ownernode[i]);
				response[i] = (snmpengineid) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmpengineid resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpengineid[] get_filtered(nitro_service service, String filter) throws Exception{
		snmpengineid obj = new snmpengineid();
		options option = new options();
		option.set_filter(filter);
		snmpengineid[] response = (snmpengineid[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpengineid resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpengineid[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpengineid obj = new snmpengineid();
		options option = new options();
		option.set_filter(filter);
		snmpengineid[] response = (snmpengineid[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpengineid resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmpengineid obj = new snmpengineid();
		options option = new options();
		option.set_count(true);
		snmpengineid[] response = (snmpengineid[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpengineid resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmpengineid obj = new snmpengineid();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpengineid[] response = (snmpengineid[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpengineid resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpengineid obj = new snmpengineid();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpengineid[] response = (snmpengineid[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
