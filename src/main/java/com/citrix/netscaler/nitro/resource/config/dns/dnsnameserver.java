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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnsnameserver_response extends base_response
{
	public dnsnameserver[] dnsnameserver;
}
/**
* Configuration for name server resource.
*/

public class dnsnameserver extends base_resource
{
	private String ip;
	private String dnsvservername;
	private Boolean local;
	private String state;
	private String type;

	//------- Read only Parameter ---------;

	private String servicename;
	private Integer port;
	private String nameserverstate;
	private Long clmonowner;
	private Long clmonview;
	private Long __count;

	/**
	* <pre>
	* IP address of an external name server or, if the Local parameter is set, IP address of a local DNS server (LDNS).<br> Minimum length =  1
	* </pre>
	*/
	public void set_ip(String ip) throws Exception{
		this.ip = ip;
	}

	/**
	* <pre>
	* IP address of an external name server or, if the Local parameter is set, IP address of a local DNS server (LDNS).<br> Minimum length =  1
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* Name of a DNS virtual server. Overrides any IP address-based name servers configured on the NetScaler appliance.<br> Minimum length =  1
	* </pre>
	*/
	public void set_dnsvservername(String dnsvservername) throws Exception{
		this.dnsvservername = dnsvservername;
	}

	/**
	* <pre>
	* Name of a DNS virtual server. Overrides any IP address-based name servers configured on the NetScaler appliance.<br> Minimum length =  1
	* </pre>
	*/
	public String get_dnsvservername() throws Exception {
		return this.dnsvservername;
	}

	/**
	* <pre>
	* Mark the IP address as one that belongs to a local recursive DNS server on the NetScaler appliance. The appliance recursively resolves queries received on an IP address that is marked as being local. For recursive resolution to work, the global DNS parameter, Recursion, must also be set. 

If no name server is marked as being local, the appliance functions as a stub resolver and load balances the name servers.
	* </pre>
	*/
	public void set_local(boolean local) throws Exception {
		this.local = new Boolean(local);
	}

	/**
	* <pre>
	* Mark the IP address as one that belongs to a local recursive DNS server on the NetScaler appliance. The appliance recursively resolves queries received on an IP address that is marked as being local. For recursive resolution to work, the global DNS parameter, Recursion, must also be set. 

If no name server is marked as being local, the appliance functions as a stub resolver and load balances the name servers.
	* </pre>
	*/
	public void set_local(Boolean local) throws Exception{
		this.local = local;
	}

	/**
	* <pre>
	* Mark the IP address as one that belongs to a local recursive DNS server on the NetScaler appliance. The appliance recursively resolves queries received on an IP address that is marked as being local. For recursive resolution to work, the global DNS parameter, Recursion, must also be set. 

If no name server is marked as being local, the appliance functions as a stub resolver and load balances the name servers.
	* </pre>
	*/
	public Boolean get_local() throws Exception {
		return this.local;
	}

	/**
	* <pre>
	* Administrative state of the name server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Administrative state of the name server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Protocol used by the name server. UDP_TCP is not valid if the name server is a DNS virtual server configured on the appliance.<br> Default value: UDP<br> Possible values = UDP, TCP, UDP_TCP
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Protocol used by the name server. UDP_TCP is not valid if the name server is a DNS virtual server configured on the appliance.<br> Default value: UDP<br> Possible values = UDP, TCP, UDP_TCP
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The name of the dns vserver.
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* Port of the service.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* State of the server.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR, Unknown, DISABLED
	* </pre>
	*/
	public String get_nameserverstate() throws Exception {
		return this.nameserverstate;
	}

	/**
	* <pre>
	* Tells the mon owner of the service.
	* </pre>
	*/
	public Long get_clmonowner() throws Exception {
		return this.clmonowner;
	}

	/**
	* <pre>
	* Tells the view id by which state of the service is updated.
	* </pre>
	*/
	public Long get_clmonview() throws Exception {
		return this.clmonview;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnsnameserver_response result = (dnsnameserver_response) service.get_payload_formatter().string_to_resource(dnsnameserver_response.class, response);
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
		return result.dnsnameserver;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ip;
	}

	/**
	* Use this API to add dnsnameserver.
	*/
	public static base_response add(nitro_service client, dnsnameserver resource) throws Exception {
		dnsnameserver addresource = new dnsnameserver();
		addresource.ip = resource.ip;
		addresource.dnsvservername = resource.dnsvservername;
		addresource.local = resource.local;
		addresource.state = resource.state;
		addresource.type = resource.type;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsnameserver resources.
	*/
	public static base_responses add(nitro_service client, dnsnameserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsnameserver addresources[] = new dnsnameserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsnameserver();
				addresources[i].ip = resources[i].ip;
				addresources[i].dnsvservername = resources[i].dnsvservername;
				addresources[i].local = resources[i].local;
				addresources[i].state = resources[i].state;
				addresources[i].type = resources[i].type;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsnameserver of given name.
	*/
	public static base_response delete(nitro_service client, String ip) throws Exception {
		dnsnameserver deleteresource = new dnsnameserver();
		deleteresource.ip = ip;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsnameserver.
	*/
	public static base_response delete(nitro_service client, dnsnameserver resource) throws Exception {
		dnsnameserver deleteresource = new dnsnameserver();
		deleteresource.ip = resource.ip;
		deleteresource.dnsvservername = resource.dnsvservername;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsnameserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ip[]) throws Exception {
		base_responses result = null;
		if (ip != null && ip.length > 0) {
			dnsnameserver deleteresources[] = new dnsnameserver[ip.length];
			for (int i=0;i<ip.length;i++){
				deleteresources[i] = new dnsnameserver();
				deleteresources[i].ip = ip[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsnameserver resources.
	*/
	public static base_responses delete(nitro_service client, dnsnameserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsnameserver deleteresources[] = new dnsnameserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsnameserver();
				deleteresources[i].ip = resources[i].ip;
				deleteresources[i].dnsvservername = resources[i].dnsvservername;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to enable dnsnameserver of given name.
	*/
	public static base_response enable(nitro_service client, String ip) throws Exception {
		dnsnameserver enableresource = new dnsnameserver();
		enableresource.ip = ip;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable dnsnameserver.
	*/
	public static base_response enable(nitro_service client, dnsnameserver resource) throws Exception {
		dnsnameserver enableresource = new dnsnameserver();
		enableresource.ip = resource.ip;
		enableresource.dnsvservername = resource.dnsvservername;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable dnsnameserver resources of given names.
	*/
	public static base_responses enable(nitro_service client, String ip[]) throws Exception {
		base_responses result = null;
		if (ip != null && ip.length > 0) {
			dnsnameserver enableresources[] = new dnsnameserver[ip.length];
			for (int i=0;i<ip.length;i++){
				enableresources[i] = new dnsnameserver();
				enableresources[i].ip = ip[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable dnsnameserver resources.
	*/
	public static base_responses enable(nitro_service client, dnsnameserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsnameserver enableresources[] = new dnsnameserver[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new dnsnameserver();
				enableresources[i].ip = resources[i].ip;
				enableresources[i].dnsvservername = resources[i].dnsvservername;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable dnsnameserver of given name.
	*/
	public static base_response disable(nitro_service client, String ip) throws Exception {
		dnsnameserver disableresource = new dnsnameserver();
		disableresource.ip = ip;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable dnsnameserver.
	*/
	public static base_response disable(nitro_service client, dnsnameserver resource) throws Exception {
		dnsnameserver disableresource = new dnsnameserver();
		disableresource.ip = resource.ip;
		disableresource.dnsvservername = resource.dnsvservername;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable dnsnameserver resources of given names.
	*/
	public static base_responses disable(nitro_service client, String ip[]) throws Exception {
		base_responses result = null;
		if (ip != null && ip.length > 0) {
			dnsnameserver disableresources[] = new dnsnameserver[ip.length];
			for (int i=0;i<ip.length;i++){
				disableresources[i] = new dnsnameserver();
				disableresources[i].ip = ip[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable dnsnameserver resources.
	*/
	public static base_responses disable(nitro_service client, dnsnameserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsnameserver disableresources[] = new dnsnameserver[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new dnsnameserver();
				disableresources[i].ip = resources[i].ip;
				disableresources[i].dnsvservername = resources[i].dnsvservername;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsnameserver resources that are configured on netscaler.
	*/
	public static dnsnameserver[] get(nitro_service service) throws Exception{
		dnsnameserver obj = new dnsnameserver();
		dnsnameserver[] response = (dnsnameserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsnameserver resources that are configured on netscaler.
	*/
	public static dnsnameserver[] get(nitro_service service, options option) throws Exception{
		dnsnameserver obj = new dnsnameserver();
		dnsnameserver[] response = (dnsnameserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a dnsnameserver resource.
	*/
	public static dnsnameserver get(nitro_service service, dnsnameserver obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		dnsnameserver response = (dnsnameserver) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a dnsnameserver resources.
	*/
	public static dnsnameserver[] get(nitro_service service, dnsnameserver obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			dnsnameserver response[] = new dnsnameserver[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (dnsnameserver) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsnameserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsnameserver[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsnameserver obj = new dnsnameserver();
		options option = new options();
		option.set_filter(filter);
		dnsnameserver[] response = (dnsnameserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsnameserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsnameserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsnameserver obj = new dnsnameserver();
		options option = new options();
		option.set_filter(filter);
		dnsnameserver[] response = (dnsnameserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsnameserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsnameserver obj = new dnsnameserver();
		options option = new options();
		option.set_count(true);
		dnsnameserver[] response = (dnsnameserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsnameserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsnameserver obj = new dnsnameserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsnameserver[] response = (dnsnameserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsnameserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsnameserver obj = new dnsnameserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsnameserver[] response = (dnsnameserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class typeEnum {
		public static final String UDP = "UDP";
		public static final String TCP = "TCP";
		public static final String UDP_TCP = "UDP_TCP";
	}
	public static class nameserverstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
		public static final String Unknown = "Unknown";
		public static final String DISABLED = "DISABLED";
	}
}
