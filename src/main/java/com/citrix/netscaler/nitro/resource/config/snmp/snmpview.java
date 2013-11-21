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

class snmpview_response extends base_response
{
	public snmpview[] snmpview;
}
/**
* Configuration for view resource.
*/

public class snmpview extends base_resource
{
	private String name;
	private String subtree;
	private String type;

	//------- Read only Parameter ---------;

	private String storagetype;
	private String status;
	private Long __count;

	/**
	* <pre>
	* Name for the SNMPv3 view. Can consist of 1 to 31 characters that include uppercase and lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. You should choose a name that helps identify the SNMPv3 view.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose it in double or single quotation marks (for example, "my view" or 'my view').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the SNMPv3 view. Can consist of 1 to 31 characters that include uppercase and lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. You should choose a name that helps identify the SNMPv3 view.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose it in double or single quotation marks (for example, "my view" or 'my view').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* A particular branch (subtree) of the MIB tree that you want to associate with this SNMPv3 view. You must specify the subtree as an SNMP OID.<br> Minimum length =  1
	* </pre>
	*/
	public void set_subtree(String subtree) throws Exception{
		this.subtree = subtree;
	}

	/**
	* <pre>
	* A particular branch (subtree) of the MIB tree that you want to associate with this SNMPv3 view. You must specify the subtree as an SNMP OID.<br> Minimum length =  1
	* </pre>
	*/
	public String get_subtree() throws Exception {
		return this.subtree;
	}

	/**
	* <pre>
	* Include or exclude the subtree, specified by the subtree parameter, in or from this view. This setting can be useful when you have included a subtree, such as A, in an SNMPv3 view and you want to exclude a specific subtree of A, such as B, from the SNMPv3 view.<br> Possible values = included, excluded
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Include or exclude the subtree, specified by the subtree parameter, in or from this view. This setting can be useful when you have included a subtree, such as A, in an SNMPv3 view and you want to exclude a specific subtree of A, such as B, from the SNMPv3 view.<br> Possible values = included, excluded
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The storage type for this view.<br> Possible values = volatile, nonVolatile
	* </pre>
	*/
	public String get_storagetype() throws Exception {
		return this.storagetype;
	}

	/**
	* <pre>
	* The status of this view.<br> Possible values = active
	* </pre>
	*/
	public String get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmpview_response result = (snmpview_response) service.get_payload_formatter().string_to_resource(snmpview_response.class, response);
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
		return result.snmpview;
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
	* Use this API to add snmpview.
	*/
	public static base_response add(nitro_service client, snmpview resource) throws Exception {
		snmpview addresource = new snmpview();
		addresource.name = resource.name;
		addresource.subtree = resource.subtree;
		addresource.type = resource.type;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add snmpview resources.
	*/
	public static base_responses add(nitro_service client, snmpview resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpview addresources[] = new snmpview[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new snmpview();
				addresources[i].name = resources[i].name;
				addresources[i].subtree = resources[i].subtree;
				addresources[i].type = resources[i].type;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpview of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		snmpview deleteresource = new snmpview();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpview.
	*/
	public static base_response delete(nitro_service client, snmpview resource) throws Exception {
		snmpview deleteresource = new snmpview();
		deleteresource.name = resource.name;
		deleteresource.subtree = resource.subtree;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpview resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			snmpview deleteresources[] = new snmpview[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new snmpview();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpview resources.
	*/
	public static base_responses delete(nitro_service client, snmpview resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpview deleteresources[] = new snmpview[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new snmpview();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].subtree = resources[i].subtree;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update snmpview.
	*/
	public static base_response update(nitro_service client, snmpview resource) throws Exception {
		snmpview updateresource = new snmpview();
		updateresource.name = resource.name;
		updateresource.subtree = resource.subtree;
		updateresource.type = resource.type;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update snmpview resources.
	*/
	public static base_responses update(nitro_service client, snmpview resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpview updateresources[] = new snmpview[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new snmpview();
				updateresources[i].name = resources[i].name;
				updateresources[i].subtree = resources[i].subtree;
				updateresources[i].type = resources[i].type;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmpview resources that are configured on netscaler.
	*/
	public static snmpview[] get(nitro_service service) throws Exception{
		snmpview obj = new snmpview();
		snmpview[] response = (snmpview[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmpview resources that are configured on netscaler.
	*/
	public static snmpview[] get(nitro_service service, options option) throws Exception{
		snmpview obj = new snmpview();
		snmpview[] response = (snmpview[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a snmpview resource.
	*/
	public static snmpview get(nitro_service service, snmpview obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpview response = (snmpview) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a snmpview resources.
	*/
	public static snmpview[] get(nitro_service service, snmpview obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			snmpview response[] = new snmpview[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (snmpview) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmpview resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpview[] get_filtered(nitro_service service, String filter) throws Exception{
		snmpview obj = new snmpview();
		options option = new options();
		option.set_filter(filter);
		snmpview[] response = (snmpview[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpview resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpview[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpview obj = new snmpview();
		options option = new options();
		option.set_filter(filter);
		snmpview[] response = (snmpview[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpview resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmpview obj = new snmpview();
		options option = new options();
		option.set_count(true);
		snmpview[] response = (snmpview[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpview resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmpview obj = new snmpview();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpview[] response = (snmpview[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpview resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpview obj = new snmpview();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpview[] response = (snmpview[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class storagetypeEnum {
		public static final String Volatile = "volatile";
		public static final String nonVolatile = "nonVolatile";
	}
	public static class statusEnum {
		public static final String active = "active";
	}
	public static class typeEnum {
		public static final String included = "included";
		public static final String excluded = "excluded";
	}
}
