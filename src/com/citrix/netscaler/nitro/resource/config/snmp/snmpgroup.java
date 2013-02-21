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

class snmpgroup_response extends base_response
{
	public snmpgroup[] snmpgroup;
}
/**
* Configuration for SNMP group resource.
*/

public class snmpgroup extends base_resource
{
	private String name;
	private String securitylevel;
	private String readviewname;

	//------- Read only Parameter ---------;

	private String storagetype;
	private String status;
	private Long __count;

	/**
	* <pre>
	* A name for the SNMP group. Can begin and consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.  You should choose a name that helps identify the SNMP group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* A name for the SNMP group. Can begin and consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.  You should choose a name that helps identify the SNMP group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The security level of the group. The following options are available:

noAuthNoPriv. Neither authentication nor encryption is required for the communication between the SNMP user belonging to this group and the NetScaler appliance.

authNoPriv. Authetication is required but no encryption for the communication between the SNMP user belonging to this group and the NetScaler appliance. You must set an authentication algorithm while configuring the SNMP users that belong to this group.

authPriv. Authetication as well as encryption is required for the communication between the SNMP user belonging to this group and the NetScaler appliance. You must set an authentication and an encryption algorithm while configuring the SNMP users that belong to this group.
<br> Possible values = noAuthNoPriv, authNoPriv, authPriv
	* </pre>
	*/
	public void set_securitylevel(String securitylevel) throws Exception{
		this.securitylevel = securitylevel;
	}

	/**
	* <pre>
	* The security level of the group. The following options are available:

noAuthNoPriv. Neither authentication nor encryption is required for the communication between the SNMP user belonging to this group and the NetScaler appliance.

authNoPriv. Authetication is required but no encryption for the communication between the SNMP user belonging to this group and the NetScaler appliance. You must set an authentication algorithm while configuring the SNMP users that belong to this group.

authPriv. Authetication as well as encryption is required for the communication between the SNMP user belonging to this group and the NetScaler appliance. You must set an authentication and an encryption algorithm while configuring the SNMP users that belong to this group.
<br> Possible values = noAuthNoPriv, authNoPriv, authPriv
	* </pre>
	*/
	public String get_securitylevel() throws Exception {
		return this.securitylevel;
	}

	/**
	* <pre>
	* The name of the configured SNMP view that you want to bind to this SNMP group. An SNMP user bound to this group can access the subtrees that are bound to this SNMP view as type INCLUDED but cannot access the ones that are type EXCLUDED. If the NetScaler appliance has multiple SNMP view entries with the same name, all such entries are associated with the SNMP group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_readviewname(String readviewname) throws Exception{
		this.readviewname = readviewname;
	}

	/**
	* <pre>
	* The name of the configured SNMP view that you want to bind to this SNMP group. An SNMP user bound to this group can access the subtrees that are bound to this SNMP view as type INCLUDED but cannot access the ones that are type EXCLUDED. If the NetScaler appliance has multiple SNMP view entries with the same name, all such entries are associated with the SNMP group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_readviewname() throws Exception {
		return this.readviewname;
	}

	/**
	* <pre>
	* The storage type for this group.<br> Possible values = volatile, nonVolatile
	* </pre>
	*/
	public String get_storagetype() throws Exception {
		return this.storagetype;
	}

	/**
	* <pre>
	* The status of this group.<br> Possible values = active
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
		snmpgroup_response result = (snmpgroup_response) service.get_payload_formatter().string_to_resource(snmpgroup_response.class, response);
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
		return result.snmpgroup;
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
	* Use this API to add snmpgroup.
	*/
	public static base_response add(nitro_service client, snmpgroup resource) throws Exception {
		snmpgroup addresource = new snmpgroup();
		addresource.name = resource.name;
		addresource.securitylevel = resource.securitylevel;
		addresource.readviewname = resource.readviewname;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add snmpgroup resources.
	*/
	public static base_responses add(nitro_service client, snmpgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpgroup addresources[] = new snmpgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new snmpgroup();
				addresources[i].name = resources[i].name;
				addresources[i].securitylevel = resources[i].securitylevel;
				addresources[i].readviewname = resources[i].readviewname;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpgroup of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		snmpgroup deleteresource = new snmpgroup();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpgroup.
	*/
	public static base_response delete(nitro_service client, snmpgroup resource) throws Exception {
		snmpgroup deleteresource = new snmpgroup();
		deleteresource.name = resource.name;
		deleteresource.securitylevel = resource.securitylevel;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpgroup resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			snmpgroup deleteresources[] = new snmpgroup[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new snmpgroup();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpgroup resources.
	*/
	public static base_responses delete(nitro_service client, snmpgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpgroup deleteresources[] = new snmpgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new snmpgroup();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].securitylevel = resources[i].securitylevel;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update snmpgroup.
	*/
	public static base_response update(nitro_service client, snmpgroup resource) throws Exception {
		snmpgroup updateresource = new snmpgroup();
		updateresource.name = resource.name;
		updateresource.securitylevel = resource.securitylevel;
		updateresource.readviewname = resource.readviewname;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update snmpgroup resources.
	*/
	public static base_responses update(nitro_service client, snmpgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpgroup updateresources[] = new snmpgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new snmpgroup();
				updateresources[i].name = resources[i].name;
				updateresources[i].securitylevel = resources[i].securitylevel;
				updateresources[i].readviewname = resources[i].readviewname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmpgroup resources that are configured on netscaler.
	*/
	public static snmpgroup[] get(nitro_service service) throws Exception{
		snmpgroup obj = new snmpgroup();
		snmpgroup[] response = (snmpgroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmpgroup resources that are configured on netscaler.
	*/
	public static snmpgroup[] get(nitro_service service, options option) throws Exception{
		snmpgroup obj = new snmpgroup();
		snmpgroup[] response = (snmpgroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a snmpgroup resource.
	*/
	public static snmpgroup get(nitro_service service, snmpgroup obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpgroup response = (snmpgroup) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a snmpgroup resources.
	*/
	public static snmpgroup[] get(nitro_service service, snmpgroup obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			snmpgroup response[] = new snmpgroup[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (snmpgroup) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmpgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpgroup[] get_filtered(nitro_service service, String filter) throws Exception{
		snmpgroup obj = new snmpgroup();
		options option = new options();
		option.set_filter(filter);
		snmpgroup[] response = (snmpgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpgroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpgroup obj = new snmpgroup();
		options option = new options();
		option.set_filter(filter);
		snmpgroup[] response = (snmpgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpgroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmpgroup obj = new snmpgroup();
		options option = new options();
		option.set_count(true);
		snmpgroup[] response = (snmpgroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmpgroup obj = new snmpgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpgroup[] response = (snmpgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpgroup obj = new snmpgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpgroup[] response = (snmpgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class storagetypeEnum {
		public static final String Volatile = "volatile";
		public static final String nonVolatile = "nonVolatile";
	}
	public static class securitylevelEnum {
		public static final String noAuthNoPriv = "noAuthNoPriv";
		public static final String authNoPriv = "authNoPriv";
		public static final String authPriv = "authPriv";
	}
	public static class statusEnum {
		public static final String active = "active";
	}
}
