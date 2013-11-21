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

class snmpmanager_response extends base_response
{
	public snmpmanager[] snmpmanager;
}
/**
* Configuration for manager resource.
*/

public class snmpmanager extends base_resource
{
	private String ipaddress;
	private String netmask;
	private Integer domainresolveretry;

	//------- Read only Parameter ---------;

	private String ip;
	private String domain;
	private Long __count;

	/**
	* <pre>
	* IP address of the SNMP manager. Can be an IPv4 or IPv6 address. You can instead specify an IPv4 network address or IPv6 network prefix if you want the NetScaler appliance to respond to SNMP queries from any device on the specified network. Alternatively, instead of an IPv4 address, you can specify a host name that has been assigned to an SNMP manager. If you do so, you must add a DNS name server that resolves the host name of the SNMP manager to its IP address. 
Note: The NetScaler appliance does not support host names for SNMP managers that have IPv6 addresses.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* IP address of the SNMP manager. Can be an IPv4 or IPv6 address. You can instead specify an IPv4 network address or IPv6 network prefix if you want the NetScaler appliance to respond to SNMP queries from any device on the specified network. Alternatively, instead of an IPv4 address, you can specify a host name that has been assigned to an SNMP manager. If you do so, you must add a DNS name server that resolves the host name of the SNMP manager to its IP address. 
Note: The NetScaler appliance does not support host names for SNMP managers that have IPv6 addresses.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Subnet mask associated with an IPv4 network address. If the IP address specifies the address or host name of a specific host, accept the default value of 255.255.255.255.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* Subnet mask associated with an IPv4 network address. If the IP address specifies the address or host name of a specific host, accept the default value of 255.255.255.255.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* Amount of time, in seconds, for which the NetScaler appliance waits before sending another DNS query to resolve the host name of the SNMP manager if the last query failed. This parameter is valid for host-name based SNMP managers only. After a query succeeds, the TTL determines the wait time.<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public void set_domainresolveretry(int domainresolveretry) throws Exception {
		this.domainresolveretry = new Integer(domainresolveretry);
	}

	/**
	* <pre>
	* Amount of time, in seconds, for which the NetScaler appliance waits before sending another DNS query to resolve the host name of the SNMP manager if the last query failed. This parameter is valid for host-name based SNMP managers only. After a query succeeds, the TTL determines the wait time.<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public void set_domainresolveretry(Integer domainresolveretry) throws Exception{
		this.domainresolveretry = domainresolveretry;
	}

	/**
	* <pre>
	* Amount of time, in seconds, for which the NetScaler appliance waits before sending another DNS query to resolve the host name of the SNMP manager if the last query failed. This parameter is valid for host-name based SNMP managers only. After a query succeeds, the TTL determines the wait time.<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public Integer get_domainresolveretry() throws Exception {
		return this.domainresolveretry;
	}

	/**
	* <pre>
	* The resolved IP address of the hostname manager.
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* IP address of manager. It will be zero for hostname manager.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmpmanager_response result = (snmpmanager_response) service.get_payload_formatter().string_to_resource(snmpmanager_response.class, response);
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
		return result.snmpmanager;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipaddress;
	}

	/**
	* Use this API to add snmpmanager.
	*/
	public static base_response add(nitro_service client, snmpmanager resource) throws Exception {
		snmpmanager addresource = new snmpmanager();
		addresource.ipaddress = resource.ipaddress;
		addresource.netmask = resource.netmask;
		addresource.domainresolveretry = resource.domainresolveretry;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add snmpmanager resources.
	*/
	public static base_responses add(nitro_service client, snmpmanager resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpmanager addresources[] = new snmpmanager[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new snmpmanager();
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].domainresolveretry = resources[i].domainresolveretry;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpmanager of given name.
	*/
	public static base_response delete(nitro_service client, String ipaddress) throws Exception {
		snmpmanager deleteresource = new snmpmanager();
		deleteresource.ipaddress = ipaddress;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpmanager.
	*/
	public static base_response delete(nitro_service client, snmpmanager resource) throws Exception {
		snmpmanager deleteresource = new snmpmanager();
		deleteresource.ipaddress = resource.ipaddress;
		deleteresource.netmask = resource.netmask;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpmanager resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ipaddress[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			snmpmanager deleteresources[] = new snmpmanager[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				deleteresources[i] = new snmpmanager();
				deleteresources[i].ipaddress = ipaddress[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpmanager resources.
	*/
	public static base_responses delete(nitro_service client, snmpmanager resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpmanager deleteresources[] = new snmpmanager[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new snmpmanager();
				deleteresources[i].ipaddress = resources[i].ipaddress;
				deleteresources[i].netmask = resources[i].netmask;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update snmpmanager.
	*/
	public static base_response update(nitro_service client, snmpmanager resource) throws Exception {
		snmpmanager updateresource = new snmpmanager();
		updateresource.ipaddress = resource.ipaddress;
		updateresource.netmask = resource.netmask;
		updateresource.domainresolveretry = resource.domainresolveretry;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update snmpmanager resources.
	*/
	public static base_responses update(nitro_service client, snmpmanager resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpmanager updateresources[] = new snmpmanager[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new snmpmanager();
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].netmask = resources[i].netmask;
				updateresources[i].domainresolveretry = resources[i].domainresolveretry;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpmanager resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, snmpmanager resource, String[] args) throws Exception{
		snmpmanager unsetresource = new snmpmanager();
		unsetresource.ipaddress = resource.ipaddress;
		unsetresource.netmask = resource.netmask;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of snmpmanager resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, snmpmanager resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpmanager unsetresources[] = new snmpmanager[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new snmpmanager();
				unsetresources[i].ipaddress = resources[i].ipaddress;
				unsetresources[i].netmask = resources[i].netmask;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmpmanager resources that are configured on netscaler.
	*/
	public static snmpmanager[] get(nitro_service service) throws Exception{
		snmpmanager obj = new snmpmanager();
		snmpmanager[] response = (snmpmanager[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmpmanager resources that are configured on netscaler.
	*/
	public static snmpmanager[] get(nitro_service service, options option) throws Exception{
		snmpmanager obj = new snmpmanager();
		snmpmanager[] response = (snmpmanager[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a snmpmanager resource.
	*/
	public static snmpmanager get(nitro_service service, snmpmanager obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpmanager response = (snmpmanager) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a snmpmanager resources.
	*/
	public static snmpmanager[] get(nitro_service service, snmpmanager obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			snmpmanager response[] = new snmpmanager[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (snmpmanager) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmpmanager resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpmanager[] get_filtered(nitro_service service, String filter) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_filter(filter);
		snmpmanager[] response = (snmpmanager[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpmanager resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpmanager[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_filter(filter);
		snmpmanager[] response = (snmpmanager[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpmanager resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_count(true);
		snmpmanager[] response = (snmpmanager[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpmanager resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpmanager[] response = (snmpmanager[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpmanager resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpmanager[] response = (snmpmanager[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
