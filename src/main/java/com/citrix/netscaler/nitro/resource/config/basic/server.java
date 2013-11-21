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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class server_response extends base_response
{
	public server[] server;
}
/**
* Configuration for server resource.
*/

public class server extends base_resource
{
	private String name;
	private String ipaddress;
	private String domain;
	private String translationip;
	private String translationmask;
	private Integer domainresolveretry;
	private String state;
	private String ipv6address;
	private String comment;
	private Long td;
	private Boolean domainresolvenow;
	private Long delay;
	private String graceful;
	private Boolean Internal;
	private String newname;

	//------- Read only Parameter ---------;

	private String statechangetimesec;
	private Long tickssincelaststatechange;
	private Long __count;

	/**
	* <pre>
	* Name for the server. 
Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
Can be changed after the name is created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the server. 
Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
Can be changed after the name is created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* IPv4 or IPv6 address of the server. If you create an IP address based server, you can specify the name of the server, instead of its IP address, when creating a service. Note: If you do not create a server entry, the server IP address that you enter when you create a service becomes the name of the server.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* IPv4 or IPv6 address of the server. If you create an IP address based server, you can specify the name of the server, instead of its IP address, when creating a service. Note: If you do not create a server entry, the server IP address that you enter when you create a service becomes the name of the server.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* Domain name of the server. For a domain based configuration, you must create the server first.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* Domain name of the server. For a domain based configuration, you must create the server first.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* IP address used to transform the server's DNS-resolved IP address.
	* </pre>
	*/
	public void set_translationip(String translationip) throws Exception{
		this.translationip = translationip;
	}

	/**
	* <pre>
	* IP address used to transform the server's DNS-resolved IP address.
	* </pre>
	*/
	public String get_translationip() throws Exception {
		return this.translationip;
	}

	/**
	* <pre>
	* The netmask of the translation ip.
	* </pre>
	*/
	public void set_translationmask(String translationmask) throws Exception{
		this.translationmask = translationmask;
	}

	/**
	* <pre>
	* The netmask of the translation ip.
	* </pre>
	*/
	public String get_translationmask() throws Exception {
		return this.translationmask;
	}

	/**
	* <pre>
	* Time, in seconds, for which the NetScaler appliance must wait, after DNS resolution fails, before sending the next DNS query to resolve the domain name.<br> Default value: 5<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public void set_domainresolveretry(int domainresolveretry) throws Exception {
		this.domainresolveretry = new Integer(domainresolveretry);
	}

	/**
	* <pre>
	* Time, in seconds, for which the NetScaler appliance must wait, after DNS resolution fails, before sending the next DNS query to resolve the domain name.<br> Default value: 5<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public void set_domainresolveretry(Integer domainresolveretry) throws Exception{
		this.domainresolveretry = domainresolveretry;
	}

	/**
	* <pre>
	* Time, in seconds, for which the NetScaler appliance must wait, after DNS resolution fails, before sending the next DNS query to resolve the domain name.<br> Default value: 5<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public Integer get_domainresolveretry() throws Exception {
		return this.domainresolveretry;
	}

	/**
	* <pre>
	* Initial state of the server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Initial state of the server.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Support IPv6 addressing mode. If you configure a server with the IPv6 addressing mode, you cannot use the server in the IPv4 addressing mode.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_ipv6address(String ipv6address) throws Exception{
		this.ipv6address = ipv6address;
	}

	/**
	* <pre>
	* Support IPv6 addressing mode. If you configure a server with the IPv6 addressing mode, you cannot use the server in the IPv4 addressing mode.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_ipv6address() throws Exception {
		return this.ipv6address;
	}

	/**
	* <pre>
	* Any information about the server.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Any information about the server.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* Immediately send a DNS query to resolve the server's domain name.
	* </pre>
	*/
	public void set_domainresolvenow(boolean domainresolvenow) throws Exception {
		this.domainresolvenow = new Boolean(domainresolvenow);
	}

	/**
	* <pre>
	* Immediately send a DNS query to resolve the server's domain name.
	* </pre>
	*/
	public void set_domainresolvenow(Boolean domainresolvenow) throws Exception{
		this.domainresolvenow = domainresolvenow;
	}

	/**
	* <pre>
	* Immediately send a DNS query to resolve the server's domain name.
	* </pre>
	*/
	public Boolean get_domainresolvenow() throws Exception {
		return this.domainresolvenow;
	}

	/**
	* <pre>
	* Time, in seconds, after which all the services configured on the server are disabled.
	* </pre>
	*/
	public void set_delay(long delay) throws Exception {
		this.delay = new Long(delay);
	}

	/**
	* <pre>
	* Time, in seconds, after which all the services configured on the server are disabled.
	* </pre>
	*/
	public void set_delay(Long delay) throws Exception{
		this.delay = delay;
	}

	/**
	* <pre>
	* Time, in seconds, after which all the services configured on the server are disabled.
	* </pre>
	*/
	public Long get_delay() throws Exception {
		return this.delay;
	}

	/**
	* <pre>
	* Shut down gracefully, without accepting any new connections, and disabling each service when all of its connections are closed.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_graceful(String graceful) throws Exception{
		this.graceful = graceful;
	}

	/**
	* <pre>
	* Shut down gracefully, without accepting any new connections, and disabling each service when all of its connections are closed.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_graceful() throws Exception {
		return this.graceful;
	}

	/**
	* <pre>
	* Display names of the servers that have been created for internal use.
	* </pre>
	*/
	public void set_Internal(boolean Internal) throws Exception {
		this.Internal = new Boolean(Internal);
	}

	/**
	* <pre>
	* Display names of the servers that have been created for internal use.
	* </pre>
	*/
	public void set_Internal(Boolean Internal) throws Exception{
		this.Internal = Internal;
	}

	/**
	* <pre>
	* Display names of the servers that have been created for internal use.
	* </pre>
	*/
	public Boolean get_Internal() throws Exception {
		return this.Internal;
	}

	/**
	* <pre>
	* New name for the server. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the server. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Time when last state change happened. Seconds part.
	* </pre>
	*/
	public String get_statechangetimesec() throws Exception {
		return this.statechangetimesec;
	}

	/**
	* <pre>
	* Time in 10 millisecond ticks since the last state change.
	* </pre>
	*/
	public Long get_tickssincelaststatechange() throws Exception {
		return this.tickssincelaststatechange;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		server_response result = (server_response) service.get_payload_formatter().string_to_resource(server_response.class, response);
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
		return result.server;
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
	* Use this API to add server.
	*/
	public static base_response add(nitro_service client, server resource) throws Exception {
		server addresource = new server();
		addresource.name = resource.name;
		addresource.ipaddress = resource.ipaddress;
		addresource.domain = resource.domain;
		addresource.translationip = resource.translationip;
		addresource.translationmask = resource.translationmask;
		addresource.domainresolveretry = resource.domainresolveretry;
		addresource.state = resource.state;
		addresource.ipv6address = resource.ipv6address;
		addresource.comment = resource.comment;
		addresource.td = resource.td;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add server resources.
	*/
	public static base_responses add(nitro_service client, server resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			server addresources[] = new server[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new server();
				addresources[i].name = resources[i].name;
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].domain = resources[i].domain;
				addresources[i].translationip = resources[i].translationip;
				addresources[i].translationmask = resources[i].translationmask;
				addresources[i].domainresolveretry = resources[i].domainresolveretry;
				addresources[i].state = resources[i].state;
				addresources[i].ipv6address = resources[i].ipv6address;
				addresources[i].comment = resources[i].comment;
				addresources[i].td = resources[i].td;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete server of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		server deleteresource = new server();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete server.
	*/
	public static base_response delete(nitro_service client, server resource) throws Exception {
		server deleteresource = new server();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete server resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			server deleteresources[] = new server[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new server();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete server resources.
	*/
	public static base_responses delete(nitro_service client, server resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			server deleteresources[] = new server[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new server();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update server.
	*/
	public static base_response update(nitro_service client, server resource) throws Exception {
		server updateresource = new server();
		updateresource.name = resource.name;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.domainresolveretry = resource.domainresolveretry;
		updateresource.translationip = resource.translationip;
		updateresource.translationmask = resource.translationmask;
		updateresource.domainresolvenow = resource.domainresolvenow;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update server resources.
	*/
	public static base_responses update(nitro_service client, server resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			server updateresources[] = new server[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new server();
				updateresources[i].name = resources[i].name;
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].domainresolveretry = resources[i].domainresolveretry;
				updateresources[i].translationip = resources[i].translationip;
				updateresources[i].translationmask = resources[i].translationmask;
				updateresources[i].domainresolvenow = resources[i].domainresolvenow;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of server resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, server resource, String[] args) throws Exception{
		server unsetresource = new server();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of server resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			server unsetresources[] = new server[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new server();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of server resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, server resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			server unsetresources[] = new server[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new server();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to enable server of given name.
	*/
	public static base_response enable(nitro_service client, String name) throws Exception {
		server enableresource = new server();
		enableresource.name = name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable server.
	*/
	public static base_response enable(nitro_service client, server resource) throws Exception {
		server enableresource = new server();
		enableresource.name = resource.name;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to enable server resources of given names.
	*/
	public static base_responses enable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			server enableresources[] = new server[name.length];
			for (int i=0;i<name.length;i++){
				enableresources[i] = new server();
				enableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to enable server resources.
	*/
	public static base_responses enable(nitro_service client, server resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			server enableresources[] = new server[resources.length];
			for (int i=0;i<resources.length;i++){
				enableresources[i] = new server();
				enableresources[i].name = resources[i].name;
			}
			result = perform_operation_bulk_request(client, enableresources,"enable");
		}
		return result;
	}

	/**
	* Use this API to disable server of given name.
	*/
	public static base_response disable(nitro_service client, String name) throws Exception {
		server disableresource = new server();
		disableresource.name = name;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable server.
	*/
	public static base_response disable(nitro_service client, server resource) throws Exception {
		server disableresource = new server();
		disableresource.name = resource.name;
		disableresource.delay = resource.delay;
		disableresource.graceful = resource.graceful;
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to disable server resources of given names.
	*/
	public static base_responses disable(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			server disableresources[] = new server[name.length];
			for (int i=0;i<name.length;i++){
				disableresources[i] = new server();
				disableresources[i].name = name[i];
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to disable server resources.
	*/
	public static base_responses disable(nitro_service client, server resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			server disableresources[] = new server[resources.length];
			for (int i=0;i<resources.length;i++){
				disableresources[i] = new server();
				disableresources[i].name = resources[i].name;
				disableresources[i].delay = resources[i].delay;
				disableresources[i].graceful = resources[i].graceful;
			}
			result = perform_operation_bulk_request(client, disableresources,"disable");
		}
		return result;
	}

	/**
	* Use this API to rename a server resource.
	*/
	public static base_response rename(nitro_service client, server resource, String new_name) throws Exception {
		server renameresource = new server();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a server resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		server renameresource = new server();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the server resources that are configured on netscaler.
	*/
	public static server[] get(nitro_service service) throws Exception{
		server obj = new server();
		server[] response = (server[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the server resources that are configured on netscaler.
	*/
	public static server[] get(nitro_service service, options option) throws Exception{
		server obj = new server();
		server[] response = (server[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the server resources that are configured on netscaler.
	* This uses server_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static server[] get(nitro_service service, server_args args) throws Exception{
		server obj = new server();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		server[] response = (server[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch server resource of given name .
	*/
	public static server get(nitro_service service, String name) throws Exception{
		server obj = new server();
		obj.set_name(name);
		server response = (server) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch server resources of given names .
	*/
	public static server[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			server response[] = new server[name.length];
			server obj[] = new server[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new server();
				obj[i].set_name(name[i]);
				response[i] = (server) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of server resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static server[] get_filtered(nitro_service service, String filter) throws Exception{
		server obj = new server();
		options option = new options();
		option.set_filter(filter);
		server[] response = (server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static server[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		server obj = new server();
		options option = new options();
		option.set_filter(filter);
		server[] response = (server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the server resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		server obj = new server();
		options option = new options();
		option.set_count(true);
		server[] response = (server[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of server resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		server obj = new server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		server[] response = (server[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		server obj = new server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		server[] response = (server[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class ipv6addressEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class gracefulEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
